package org.apache.commons.compress.archivers.zip;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.charset.UnsupportedCharsetException;
import java.util.function.Predicate;
import org.apache.commons.compress.utils.CharsetNames;
import org.apache.commons.io.Charsets;

/* loaded from: classes24.dex */
public abstract class ZipEncodingHelper {
    static final ZipEncoding ZIP_ENCODING_UTF_8 = getZipEncoding(CharsetNames.UTF_8);

    public static ZipEncoding getZipEncoding(Charset charset) {
        Charset actual = Charsets.toCharset(charset);
        boolean useReplacement = isUTF8(actual);
        return new NioZipEncoding(actual, useReplacement);
    }

    public static ZipEncoding getZipEncoding(String name) throws UnsupportedCharsetException {
        Charset charset = Charset.defaultCharset();
        try {
            charset = Charsets.toCharset(name);
        } catch (UnsupportedCharsetException e) {
        }
        boolean useReplacement = isUTF8(charset.name());
        return new NioZipEncoding(charset, useReplacement);
    }

    static ByteBuffer growBufferBy(ByteBuffer buffer, int increment) {
        buffer.limit(buffer.position());
        buffer.rewind();
        ByteBuffer on = ByteBuffer.allocate(buffer.capacity() + increment);
        on.put(buffer);
        return on;
    }

    static boolean isUTF8(Charset charset) {
        return isUTF8Alias(Charsets.toCharset(charset).name());
    }

    static boolean isUTF8(String charsetName) {
        return isUTF8Alias(charsetName != null ? charsetName : Charset.defaultCharset().name());
    }

    private static boolean isUTF8Alias(final String actual) {
        return StandardCharsets.UTF_8.name().equalsIgnoreCase(actual) || StandardCharsets.UTF_8.aliases().stream().anyMatch(new Predicate() { // from class: org.apache.commons.compress.archivers.zip.ZipEncodingHelper$$ExternalSyntheticLambda0
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return ((String) obj).equalsIgnoreCase(actual);
            }
        });
    }
}
