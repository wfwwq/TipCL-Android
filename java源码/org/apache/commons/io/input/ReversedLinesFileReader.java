package org.apache.commons.io.input;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.channels.SeekableByteChannel;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.apache.commons.io.Charsets;
import org.apache.commons.io.FileSystem;
import org.apache.commons.io.StandardLineSeparator;
import org.apache.commons.io.build.AbstractStreamBuilder;

/* loaded from: classes24.dex */
public class ReversedLinesFileReader implements Closeable {
    private static final int DEFAULT_BLOCK_SIZE = FileSystem.getCurrent().getBlockSize();
    private static final String EMPTY_STRING = "";
    private final int avoidNewlineSplitBufferSize;
    private final int blockSize;
    private final int byteDecrement;
    private final SeekableByteChannel channel;
    private final Charset charset;
    private FilePart currentFilePart;
    private final byte[][] newLineSequences;
    private final long totalBlockCount;
    private final long totalByteLength;
    private boolean trailingNewlineOfFileSkipped;

    public static class Builder extends AbstractStreamBuilder<ReversedLinesFileReader, Builder> {
        public Builder() {
            setBufferSizeDefault(ReversedLinesFileReader.DEFAULT_BLOCK_SIZE);
            setBufferSize(ReversedLinesFileReader.DEFAULT_BLOCK_SIZE);
        }

        @Override // org.apache.commons.io.function.IOSupplier
        public ReversedLinesFileReader get() throws IOException {
            return new ReversedLinesFileReader(getPath(), getBufferSize(), getCharset());
        }
    }

    private final class FilePart {
        private int currentLastBytePos;
        private final byte[] data;
        private byte[] leftOver;
        private final long no;

        private FilePart(long no, int length, byte[] leftOverOfLastFilePart) throws IOException {
            this.no = no;
            int dataLength = (leftOverOfLastFilePart != null ? leftOverOfLastFilePart.length : 0) + length;
            this.data = new byte[dataLength];
            long off = (no - 1) * ReversedLinesFileReader.this.blockSize;
            if (no > 0) {
                ReversedLinesFileReader.this.channel.position(off);
                int countRead = ReversedLinesFileReader.this.channel.read(ByteBuffer.wrap(this.data, 0, length));
                if (countRead != length) {
                    throw new IllegalStateException("Count of requested bytes and actually read bytes don't match");
                }
            }
            if (leftOverOfLastFilePart != null) {
                System.arraycopy(leftOverOfLastFilePart, 0, this.data, length, leftOverOfLastFilePart.length);
            }
            this.currentLastBytePos = this.data.length - 1;
            this.leftOver = null;
        }

        private void createLeftOver() {
            int lineLengthBytes = this.currentLastBytePos + 1;
            if (lineLengthBytes > 0) {
                this.leftOver = Arrays.copyOf(this.data, lineLengthBytes);
            } else {
                this.leftOver = null;
            }
            this.currentLastBytePos = -1;
        }

        private int getNewLineMatchByteCount(byte[] data, int i) {
            for (byte[] newLineSequence : ReversedLinesFileReader.this.newLineSequences) {
                boolean match = true;
                for (int j = newLineSequence.length - 1; j >= 0; j--) {
                    int k = (i + j) - (newLineSequence.length - 1);
                    match &= k >= 0 && data[k] == newLineSequence[j];
                }
                if (match) {
                    return newLineSequence.length;
                }
            }
            return 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0070, code lost:
        
            if (r1 == false) goto L33;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0074, code lost:
        
            if (r9.leftOver == null) goto L34;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x0076, code lost:
        
            r2 = new java.lang.String(r9.leftOver, r9.this$0.charset);
            r9.leftOver = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x0087, code lost:
        
            return r2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:?, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:?, code lost:
        
            return r0;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.String readLine() {
            /*
                r9 = this;
                r0 = 0
                long r1 = r9.no
                r3 = 1
                int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                r2 = 1
                if (r1 != 0) goto Lc
                r1 = r2
                goto Ld
            Lc:
                r1 = 0
            Ld:
                int r3 = r9.currentLastBytePos
            Lf:
                r4 = -1
                if (r3 <= r4) goto L70
                if (r1 != 0) goto L20
                org.apache.commons.io.input.ReversedLinesFileReader r4 = org.apache.commons.io.input.ReversedLinesFileReader.this
                int r4 = org.apache.commons.io.input.ReversedLinesFileReader.access$400(r4)
                if (r3 >= r4) goto L20
                r9.createLeftOver()
                goto L70
            L20:
                byte[] r4 = r9.data
                int r4 = r9.getNewLineMatchByteCount(r4, r3)
                r5 = r4
                if (r4 <= 0) goto L63
                int r4 = r3 + 1
                int r6 = r9.currentLastBytePos
                int r6 = r6 - r4
                int r6 = r6 + r2
                if (r6 < 0) goto L4a
                byte[] r2 = r9.data
                int r7 = r4 + r6
                byte[] r2 = java.util.Arrays.copyOfRange(r2, r4, r7)
                java.lang.String r7 = new java.lang.String
                org.apache.commons.io.input.ReversedLinesFileReader r8 = org.apache.commons.io.input.ReversedLinesFileReader.this
                java.nio.charset.Charset r8 = org.apache.commons.io.input.ReversedLinesFileReader.access$500(r8)
                r7.<init>(r2, r8)
                r0 = r7
                int r7 = r3 - r5
                r9.currentLastBytePos = r7
                goto L70
            L4a:
                java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                java.lang.String r8 = "Unexpected negative line length="
                java.lang.StringBuilder r7 = r7.append(r8)
                java.lang.StringBuilder r7 = r7.append(r6)
                java.lang.String r7 = r7.toString()
                r2.<init>(r7)
                throw r2
            L63:
                org.apache.commons.io.input.ReversedLinesFileReader r4 = org.apache.commons.io.input.ReversedLinesFileReader.this
                int r4 = org.apache.commons.io.input.ReversedLinesFileReader.access$600(r4)
                int r3 = r3 - r4
                if (r3 >= 0) goto Lf
                r9.createLeftOver()
            L70:
                if (r1 == 0) goto L87
                byte[] r2 = r9.leftOver
                if (r2 == 0) goto L87
                java.lang.String r2 = new java.lang.String
                byte[] r4 = r9.leftOver
                org.apache.commons.io.input.ReversedLinesFileReader r5 = org.apache.commons.io.input.ReversedLinesFileReader.this
                java.nio.charset.Charset r5 = org.apache.commons.io.input.ReversedLinesFileReader.access$500(r5)
                r2.<init>(r4, r5)
                r0 = r2
                r2 = 0
                r9.leftOver = r2
            L87:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.io.input.ReversedLinesFileReader.FilePart.readLine():java.lang.String");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public FilePart rollOver() throws IOException {
            if (this.currentLastBytePos > -1) {
                throw new IllegalStateException("Current currentLastCharPos unexpectedly positive... last readLine() should have returned something! currentLastCharPos=" + this.currentLastBytePos);
            }
            if (this.no > 1) {
                return ReversedLinesFileReader.this.new FilePart(this.no - 1, ReversedLinesFileReader.this.blockSize, this.leftOver);
            }
            if (this.leftOver != null) {
                throw new IllegalStateException("Unexpected leftover of the last block: leftOverOfThisFilePart=" + new String(this.leftOver, ReversedLinesFileReader.this.charset));
            }
            return null;
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    @Deprecated
    public ReversedLinesFileReader(File file) throws IOException {
        this(file, DEFAULT_BLOCK_SIZE, Charset.defaultCharset());
    }

    @Deprecated
    public ReversedLinesFileReader(File file, Charset charset) throws IOException {
        this(file.toPath(), charset);
    }

    @Deprecated
    public ReversedLinesFileReader(File file, int blockSize, Charset charset) throws IOException {
        this(file.toPath(), blockSize, charset);
    }

    @Deprecated
    public ReversedLinesFileReader(File file, int blockSize, String charsetName) throws IOException {
        this(file.toPath(), blockSize, charsetName);
    }

    @Deprecated
    public ReversedLinesFileReader(Path file, Charset charset) throws IOException {
        this(file, DEFAULT_BLOCK_SIZE, charset);
    }

    @Deprecated
    public ReversedLinesFileReader(Path file, int blockSize, Charset charset) throws IOException {
        int lastBlockLength;
        this.blockSize = blockSize;
        this.charset = Charsets.toCharset(charset);
        CharsetEncoder charsetEncoder = this.charset.newEncoder();
        float maxBytesPerChar = charsetEncoder.maxBytesPerChar();
        if (maxBytesPerChar == 1.0f || this.charset == StandardCharsets.UTF_8 || this.charset == Charset.forName("Shift_JIS") || this.charset == Charset.forName("windows-31j") || this.charset == Charset.forName("x-windows-949") || this.charset == Charset.forName("gbk") || this.charset == Charset.forName("x-windows-950")) {
            this.byteDecrement = 1;
        } else if (this.charset == StandardCharsets.UTF_16BE || this.charset == StandardCharsets.UTF_16LE) {
            this.byteDecrement = 2;
        } else {
            if (this.charset == StandardCharsets.UTF_16) {
                throw new UnsupportedEncodingException("For UTF-16, you need to specify the byte order (use UTF-16BE or UTF-16LE)");
            }
            throw new UnsupportedEncodingException("Encoding " + charset + " is not supported yet (feel free to submit a patch)");
        }
        this.newLineSequences = new byte[][]{StandardLineSeparator.CRLF.getBytes(this.charset), StandardLineSeparator.LF.getBytes(this.charset), StandardLineSeparator.CR.getBytes(this.charset)};
        this.avoidNewlineSplitBufferSize = this.newLineSequences[0].length;
        this.channel = Files.newByteChannel(file, StandardOpenOption.READ);
        this.totalByteLength = this.channel.size();
        int lastBlockLength2 = (int) (this.totalByteLength % blockSize);
        if (lastBlockLength2 > 0) {
            this.totalBlockCount = (this.totalByteLength / blockSize) + 1;
        } else {
            this.totalBlockCount = this.totalByteLength / blockSize;
            lastBlockLength = this.totalByteLength > 0 ? blockSize : lastBlockLength;
            this.currentFilePart = new FilePart(this.totalBlockCount, lastBlockLength, null);
        }
        lastBlockLength = lastBlockLength2;
        this.currentFilePart = new FilePart(this.totalBlockCount, lastBlockLength, null);
    }

    @Deprecated
    public ReversedLinesFileReader(Path file, int blockSize, String charsetName) throws IOException {
        this(file, blockSize, Charsets.toCharset(charsetName));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.channel.close();
    }

    public String readLine() throws IOException {
        String line = this.currentFilePart.readLine();
        while (line == null) {
            this.currentFilePart = this.currentFilePart.rollOver();
            if (this.currentFilePart == null) {
                break;
            }
            line = this.currentFilePart.readLine();
        }
        if ("".equals(line) && !this.trailingNewlineOfFileSkipped) {
            this.trailingNewlineOfFileSkipped = true;
            String line2 = readLine();
            return line2;
        }
        return line;
    }

    public List<String> readLines(int lineCount) throws IOException {
        if (lineCount < 0) {
            throw new IllegalArgumentException("lineCount < 0");
        }
        ArrayList<String> arrayList = new ArrayList<>(lineCount);
        for (int i = 0; i < lineCount; i++) {
            String line = readLine();
            if (line == null) {
                return arrayList;
            }
            arrayList.add(line);
        }
        return arrayList;
    }

    public String toString(int lineCount) throws IOException {
        List<String> lines = readLines(lineCount);
        Collections.reverse(lines);
        return lines.isEmpty() ? "" : String.join(System.lineSeparator(), lines) + System.lineSeparator();
    }
}
