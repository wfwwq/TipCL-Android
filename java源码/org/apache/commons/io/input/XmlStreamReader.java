package org.apache.commons.io.input;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.text.MessageFormat;
import java.util.Locale;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;
import org.apache.commons.io.ByteOrderMark;
import org.apache.commons.io.Charsets;
import org.apache.commons.io.IOUtils;
import org.apache.commons.io.build.AbstractStreamBuilder;
import org.apache.commons.io.function.IOConsumer;
import org.apache.commons.io.input.BOMInputStream;

/* loaded from: classes24.dex */
public class XmlStreamReader extends Reader {
    private static final String HTTP_EX_1 = "Illegal encoding, CT-MIME [{0}] CT-Enc [{1}] BOM [{2}] XML guess [{3}] XML prolog [{4}], BOM must be null";
    private static final String HTTP_EX_2 = "Illegal encoding, CT-MIME [{0}] CT-Enc [{1}] BOM [{2}] XML guess [{3}] XML prolog [{4}], encoding mismatch";
    private static final String HTTP_EX_3 = "Illegal encoding, CT-MIME [{0}] CT-Enc [{1}] BOM [{2}] XML guess [{3}] XML prolog [{4}], Illegal MIME";
    private static final String RAW_EX_1 = "Illegal encoding, BOM [{0}] XML guess [{1}] XML prolog [{2}] encoding mismatch";
    private static final String RAW_EX_2 = "Illegal encoding, BOM [{0}] XML guess [{1}] XML prolog [{2}] unknown BOM";
    private static final String UTF_32 = "UTF-32";
    private final String defaultEncoding;
    private final String encoding;
    private final Reader reader;
    private static final String UTF_8 = StandardCharsets.UTF_8.name();
    private static final String US_ASCII = StandardCharsets.US_ASCII.name();
    private static final String UTF_16BE = StandardCharsets.UTF_16BE.name();
    private static final String UTF_16LE = StandardCharsets.UTF_16LE.name();
    private static final String UTF_16 = StandardCharsets.UTF_16.name();
    private static final ByteOrderMark[] BOMS = {ByteOrderMark.UTF_8, ByteOrderMark.UTF_16BE, ByteOrderMark.UTF_16LE, ByteOrderMark.UTF_32BE, ByteOrderMark.UTF_32LE};
    private static final String UTF_32BE = "UTF-32BE";
    private static final String UTF_32LE = "UTF-32LE";
    private static final String EBCDIC = "CP1047";
    private static final ByteOrderMark[] XML_GUESS_BYTES = {new ByteOrderMark(UTF_8, 60, 63, 120, 109), new ByteOrderMark(UTF_16BE, 0, 60, 0, 63), new ByteOrderMark(UTF_16LE, 60, 0, 63, 0), new ByteOrderMark(UTF_32BE, 0, 0, 0, 60, 0, 0, 0, 63, 0, 0, 0, 120, 0, 0, 0, 109), new ByteOrderMark(UTF_32LE, 60, 0, 0, 0, 63, 0, 0, 0, 120, 0, 0, 0, 109, 0, 0, 0), new ByteOrderMark(EBCDIC, 76, 111, 167, 148)};
    private static final Pattern CHARSET_PATTERN = Pattern.compile("charset=[\"']?([.[^; \"']]*)[\"']?");
    public static final Pattern ENCODING_PATTERN = Pattern.compile("^<\\?xml\\s+version\\s*=\\s*(?:(?:\"1\\.[0-9]+\")|(?:'1.[0-9]+'))\\s+encoding\\s*=\\s*((?:\"[A-Za-z0-9][A-Za-z0-9._+:-]*\")|(?:'[A-Za-z0-9][A-Za-z0-9._+:-]*'))", 8);

    public static class Builder extends AbstractStreamBuilder<XmlStreamReader, Builder> {
        private String httpContentType;
        private boolean nullCharset = true;
        private boolean lenient = true;

        @Override // org.apache.commons.io.function.IOSupplier
        public XmlStreamReader get() throws IOException {
            String defaultEncoding = this.nullCharset ? null : getCharset().name();
            if (this.httpContentType == null) {
                return new XmlStreamReader(getInputStream(), this.lenient, defaultEncoding);
            }
            return new XmlStreamReader(getInputStream(), this.httpContentType, this.lenient, defaultEncoding);
        }

        @Override // org.apache.commons.io.build.AbstractStreamBuilder
        public Builder setCharset(Charset charset) {
            this.nullCharset = charset == null;
            return (Builder) super.setCharset(charset);
        }

        @Override // org.apache.commons.io.build.AbstractStreamBuilder
        public Builder setCharset(String charset) {
            this.nullCharset = charset == null;
            return (Builder) super.setCharset(Charsets.toCharset(charset, getCharsetDefault()));
        }

        public Builder setHttpContentType(String httpContentType) {
            this.httpContentType = httpContentType;
            return this;
        }

        public Builder setLenient(boolean lenient) {
            this.lenient = lenient;
            return this;
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    static String getContentTypeEncoding(String httpContentType) {
        int i;
        if (httpContentType == null || (i = httpContentType.indexOf(";")) <= -1) {
            return null;
        }
        String postMime = httpContentType.substring(i + 1);
        Matcher m = CHARSET_PATTERN.matcher(postMime);
        String encoding = m.find() ? m.group(1) : null;
        return encoding != null ? encoding.toUpperCase(Locale.ROOT) : null;
    }

    static String getContentTypeMime(String httpContentType) {
        String mime;
        if (httpContentType == null) {
            return null;
        }
        int i = httpContentType.indexOf(";");
        if (i >= 0) {
            mime = httpContentType.substring(0, i);
        } else {
            mime = httpContentType;
        }
        return mime.trim();
    }

    private static String getXmlProlog(InputStream inputStream, String guessedEnc) throws IOException {
        if (guessedEnc == null) {
            return null;
        }
        byte[] bytes = IOUtils.byteArray();
        inputStream.mark(8192);
        int offset = 0;
        int max = 8192;
        int c = inputStream.read(bytes, 0, 8192);
        int firstGT = -1;
        String xmlProlog = "";
        while (c != -1 && firstGT == -1 && offset < 8192) {
            offset += c;
            max -= c;
            c = inputStream.read(bytes, offset, max);
            xmlProlog = new String(bytes, 0, offset, guessedEnc);
            firstGT = xmlProlog.indexOf(62);
        }
        if (firstGT == -1) {
            if (c == -1) {
                throw new IOException("Unexpected end of XML stream");
            }
            throw new IOException("XML prolog or ROOT element not found on first " + offset + " bytes");
        }
        int bytesRead = offset;
        if (bytesRead <= 0) {
            return null;
        }
        inputStream.reset();
        BufferedReader bReader = new BufferedReader(new StringReader(xmlProlog.substring(0, firstGT + 1)));
        final StringBuilder prolog = new StringBuilder();
        Stream<String> streamLines = bReader.lines();
        Objects.requireNonNull(prolog);
        IOConsumer.forEach(streamLines, new IOConsumer() { // from class: org.apache.commons.io.input.XmlStreamReader$$ExternalSyntheticLambda0
            @Override // org.apache.commons.io.function.IOConsumer
            public final void accept(Object obj) {
                prolog.append((String) obj);
            }
        });
        Matcher m = ENCODING_PATTERN.matcher(prolog);
        if (!m.find()) {
            return null;
        }
        String encoding = m.group(1).toUpperCase(Locale.ROOT);
        return encoding.substring(1, encoding.length() - 1);
    }

    static boolean isAppXml(String mime) {
        return mime != null && (mime.equals("application/xml") || mime.equals("application/xml-dtd") || mime.equals("application/xml-external-parsed-entity") || (mime.startsWith("application/") && mime.endsWith("+xml")));
    }

    static boolean isTextXml(String mime) {
        return mime != null && (mime.equals("text/xml") || mime.equals("text/xml-external-parsed-entity") || (mime.startsWith("text/") && mime.endsWith("+xml")));
    }

    @Deprecated
    public XmlStreamReader(File file) throws IOException {
        this(((File) Objects.requireNonNull(file, "file")).toPath());
    }

    @Deprecated
    public XmlStreamReader(InputStream inputStream) throws IOException {
        this(inputStream, true);
    }

    @Deprecated
    public XmlStreamReader(InputStream inputStream, boolean lenient) throws IOException {
        this(inputStream, lenient, (String) null);
    }

    @Deprecated
    public XmlStreamReader(InputStream inputStream, boolean lenient, String defaultEncoding) throws IOException {
        this.defaultEncoding = defaultEncoding;
        BOMInputStream bom = new BOMInputStream(new BufferedInputStream((InputStream) Objects.requireNonNull(inputStream, "inputStream"), 8192), false, BOMS);
        BOMInputStream pis = new BOMInputStream(bom, true, XML_GUESS_BYTES);
        this.encoding = processHttpStream(bom, pis, lenient);
        this.reader = new InputStreamReader(pis, this.encoding);
    }

    @Deprecated
    public XmlStreamReader(InputStream inputStream, String httpContentType) throws IOException {
        this(inputStream, httpContentType, true);
    }

    @Deprecated
    public XmlStreamReader(InputStream inputStream, String httpContentType, boolean lenient) throws IOException {
        this(inputStream, httpContentType, lenient, null);
    }

    @Deprecated
    public XmlStreamReader(InputStream inputStream, String httpContentType, boolean lenient, String defaultEncoding) throws IOException {
        this.defaultEncoding = defaultEncoding;
        BOMInputStream bom = new BOMInputStream(new BufferedInputStream((InputStream) Objects.requireNonNull(inputStream, "inputStream"), 8192), false, BOMS);
        BOMInputStream pis = new BOMInputStream(bom, true, XML_GUESS_BYTES);
        this.encoding = processHttpStream(bom, pis, lenient, httpContentType);
        this.reader = new InputStreamReader(pis, this.encoding);
    }

    @Deprecated
    public XmlStreamReader(Path file) throws IOException {
        this(Files.newInputStream((Path) Objects.requireNonNull(file, "file"), new OpenOption[0]));
    }

    public XmlStreamReader(URL url) throws IOException {
        this(((URL) Objects.requireNonNull(url, "url")).openConnection(), (String) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public XmlStreamReader(URLConnection urlConnection, String defaultEncoding) throws IOException {
        Objects.requireNonNull(urlConnection, "urlConnection");
        this.defaultEncoding = defaultEncoding;
        String contentType = urlConnection.getContentType();
        InputStream inputStream = urlConnection.getInputStream();
        BOMInputStream bomInput = ((BOMInputStream.Builder) BOMInputStream.builder().setInputStream(new BufferedInputStream(inputStream, 8192))).setInclude(false).setByteOrderMarks(BOMS).get();
        BOMInputStream piInput = ((BOMInputStream.Builder) BOMInputStream.builder().setInputStream(new BufferedInputStream(bomInput, 8192))).setInclude(true).setByteOrderMarks(XML_GUESS_BYTES).get();
        if ((urlConnection instanceof HttpURLConnection) || contentType != null) {
            this.encoding = processHttpStream(bomInput, piInput, true, contentType);
        } else {
            this.encoding = processHttpStream(bomInput, piInput, true);
        }
        this.reader = new InputStreamReader(piInput, this.encoding);
    }

    String calculateHttpEncoding(String bomEnc, String xmlGuessEnc, String xmlEnc, boolean lenient, String httpContentType) throws IOException {
        if (lenient && xmlEnc != null) {
            return xmlEnc;
        }
        String cTMime = getContentTypeMime(httpContentType);
        String cTEnc = getContentTypeEncoding(httpContentType);
        boolean appXml = isAppXml(cTMime);
        boolean textXml = isTextXml(cTMime);
        if (!appXml && !textXml) {
            String msg = MessageFormat.format(HTTP_EX_3, cTMime, cTEnc, bomEnc, xmlGuessEnc, xmlEnc);
            throw new XmlStreamReaderException(msg, cTMime, cTEnc, bomEnc, xmlGuessEnc, xmlEnc);
        }
        String bomEnc2 = bomEnc;
        String xmlGuessEnc2 = xmlGuessEnc;
        String xmlEnc2 = xmlEnc;
        if (cTEnc == null) {
            if (appXml) {
                return calculateRawEncoding(bomEnc2, xmlGuessEnc2, xmlEnc2);
            }
            return this.defaultEncoding == null ? US_ASCII : this.defaultEncoding;
        }
        if (cTEnc.equals(UTF_16BE) || cTEnc.equals(UTF_16LE)) {
            if (bomEnc2 != null) {
                String msg2 = MessageFormat.format(HTTP_EX_1, cTMime, cTEnc, bomEnc2, xmlGuessEnc2, xmlEnc2);
                throw new XmlStreamReaderException(msg2, cTMime, cTEnc, bomEnc2, xmlGuessEnc2, xmlEnc2);
            }
            return cTEnc;
        }
        if (cTEnc.equals(UTF_16)) {
            if (bomEnc2 != null && bomEnc2.startsWith(UTF_16)) {
                return bomEnc2;
            }
            String msg3 = MessageFormat.format(HTTP_EX_2, cTMime, cTEnc, bomEnc2, xmlGuessEnc2, xmlEnc2);
            throw new XmlStreamReaderException(msg3, cTMime, cTEnc, bomEnc2, xmlGuessEnc2, xmlEnc2);
        }
        if (cTEnc.equals(UTF_32BE) || cTEnc.equals(UTF_32LE)) {
            if (bomEnc2 != null) {
                String msg4 = MessageFormat.format(HTTP_EX_1, cTMime, cTEnc, bomEnc2, xmlGuessEnc2, xmlEnc2);
                throw new XmlStreamReaderException(msg4, cTMime, cTEnc, bomEnc2, xmlGuessEnc2, xmlEnc2);
            }
            return cTEnc;
        }
        if (cTEnc.equals(UTF_32)) {
            if (bomEnc2 != null && bomEnc2.startsWith(UTF_32)) {
                return bomEnc2;
            }
            String msg5 = MessageFormat.format(HTTP_EX_2, cTMime, cTEnc, bomEnc2, xmlGuessEnc2, xmlEnc2);
            throw new XmlStreamReaderException(msg5, cTMime, cTEnc, bomEnc2, xmlGuessEnc2, xmlEnc2);
        }
        return cTEnc;
    }

    String calculateRawEncoding(String bomEnc, String xmlGuessEnc, String xmlEnc) throws IOException {
        if (bomEnc == null) {
            if (xmlGuessEnc == null || xmlEnc == null) {
                return this.defaultEncoding == null ? UTF_8 : this.defaultEncoding;
            }
            if (xmlEnc.equals(UTF_16) && (xmlGuessEnc.equals(UTF_16BE) || xmlGuessEnc.equals(UTF_16LE))) {
                return xmlGuessEnc;
            }
            return xmlEnc;
        }
        if (bomEnc.equals(UTF_8)) {
            if (xmlGuessEnc != null && !xmlGuessEnc.equals(UTF_8)) {
                String msg = MessageFormat.format(RAW_EX_1, bomEnc, xmlGuessEnc, xmlEnc);
                throw new XmlStreamReaderException(msg, bomEnc, xmlGuessEnc, xmlEnc);
            }
            if (xmlEnc != null && !xmlEnc.equals(UTF_8)) {
                String msg2 = MessageFormat.format(RAW_EX_1, bomEnc, xmlGuessEnc, xmlEnc);
                throw new XmlStreamReaderException(msg2, bomEnc, xmlGuessEnc, xmlEnc);
            }
            return bomEnc;
        }
        if (bomEnc.equals(UTF_16BE) || bomEnc.equals(UTF_16LE)) {
            if (xmlGuessEnc != null && !xmlGuessEnc.equals(bomEnc)) {
                String msg3 = MessageFormat.format(RAW_EX_1, bomEnc, xmlGuessEnc, xmlEnc);
                throw new XmlStreamReaderException(msg3, bomEnc, xmlGuessEnc, xmlEnc);
            }
            if (xmlEnc != null && !xmlEnc.equals(UTF_16) && !xmlEnc.equals(bomEnc)) {
                String msg4 = MessageFormat.format(RAW_EX_1, bomEnc, xmlGuessEnc, xmlEnc);
                throw new XmlStreamReaderException(msg4, bomEnc, xmlGuessEnc, xmlEnc);
            }
            return bomEnc;
        }
        if (bomEnc.equals(UTF_32BE) || bomEnc.equals(UTF_32LE)) {
            if (xmlGuessEnc != null && !xmlGuessEnc.equals(bomEnc)) {
                String msg5 = MessageFormat.format(RAW_EX_1, bomEnc, xmlGuessEnc, xmlEnc);
                throw new XmlStreamReaderException(msg5, bomEnc, xmlGuessEnc, xmlEnc);
            }
            if (xmlEnc != null && !xmlEnc.equals(UTF_32) && !xmlEnc.equals(bomEnc)) {
                String msg6 = MessageFormat.format(RAW_EX_1, bomEnc, xmlGuessEnc, xmlEnc);
                throw new XmlStreamReaderException(msg6, bomEnc, xmlGuessEnc, xmlEnc);
            }
            return bomEnc;
        }
        String msg7 = MessageFormat.format(RAW_EX_2, bomEnc, xmlGuessEnc, xmlEnc);
        throw new XmlStreamReaderException(msg7, bomEnc, xmlGuessEnc, xmlEnc);
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.reader.close();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.String doLenientDetection(java.lang.String r8, org.apache.commons.io.input.XmlStreamReaderException r9) throws java.io.IOException {
        /*
            r7 = this;
            if (r8 == 0) goto L42
            java.lang.String r0 = "text/html"
            boolean r1 = r8.startsWith(r0)
            if (r1 == 0) goto L42
            int r0 = r0.length()
            java.lang.String r8 = r8.substring(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "text/xml"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r0 = r0.append(r8)
            java.lang.String r6 = r0.toString()
            java.lang.String r2 = r9.getBomEncoding()     // Catch: org.apache.commons.io.input.XmlStreamReaderException -> L3c
            java.lang.String r3 = r9.getXmlGuessEncoding()     // Catch: org.apache.commons.io.input.XmlStreamReaderException -> L3c
            java.lang.String r4 = r9.getXmlEncoding()     // Catch: org.apache.commons.io.input.XmlStreamReaderException -> L3c
            r5 = 1
            r1 = r7
            java.lang.String r8 = r1.calculateHttpEncoding(r2, r3, r4, r5, r6)     // Catch: org.apache.commons.io.input.XmlStreamReaderException -> L3a
            return r8
        L3a:
            r0 = move-exception
            goto L3e
        L3c:
            r0 = move-exception
            r1 = r7
        L3e:
            r8 = r0
            r9 = r8
            r8 = r6
            goto L43
        L42:
            r1 = r7
        L43:
            java.lang.String r0 = r9.getXmlEncoding()
            if (r0 != 0) goto L4d
            java.lang.String r0 = r9.getContentTypeEncoding()
        L4d:
            if (r0 != 0) goto L59
            java.lang.String r2 = r1.defaultEncoding
            if (r2 != 0) goto L56
            java.lang.String r2 = org.apache.commons.io.input.XmlStreamReader.UTF_8
            goto L58
        L56:
            java.lang.String r2 = r1.defaultEncoding
        L58:
            r0 = r2
        L59:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.io.input.XmlStreamReader.doLenientDetection(java.lang.String, org.apache.commons.io.input.XmlStreamReaderException):java.lang.String");
    }

    public String getDefaultEncoding() {
        return this.defaultEncoding;
    }

    public String getEncoding() {
        return this.encoding;
    }

    private String processHttpStream(BOMInputStream bomInput, BOMInputStream piInput, boolean lenient) throws IOException {
        String bomEnc = bomInput.getBOMCharsetName();
        String xmlGuessEnc = piInput.getBOMCharsetName();
        String xmlEnc = getXmlProlog(piInput, xmlGuessEnc);
        try {
            return calculateRawEncoding(bomEnc, xmlGuessEnc, xmlEnc);
        } catch (XmlStreamReaderException ex) {
            if (lenient) {
                return doLenientDetection(null, ex);
            }
            throw ex;
        }
    }

    private String processHttpStream(BOMInputStream bomInput, BOMInputStream piInput, boolean lenient, String httpContentType) throws IOException {
        String bomEnc = bomInput.getBOMCharsetName();
        String xmlGuessEnc = piInput.getBOMCharsetName();
        String xmlEnc = getXmlProlog(piInput, xmlGuessEnc);
        try {
            return calculateHttpEncoding(bomEnc, xmlGuessEnc, xmlEnc, lenient, httpContentType);
        } catch (XmlStreamReaderException ex) {
            if (lenient) {
                return doLenientDetection(httpContentType, ex);
            }
            throw ex;
        }
    }

    @Override // java.io.Reader
    public int read(char[] buf, int offset, int len) throws IOException {
        return this.reader.read(buf, offset, len);
    }
}
