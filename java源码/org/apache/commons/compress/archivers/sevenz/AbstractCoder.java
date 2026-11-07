package org.apache.commons.compress.archivers.sevenz;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Objects;
import java.util.function.Predicate;
import java.util.stream.Stream;
import org.apache.commons.compress.utils.ByteUtils;

/* loaded from: classes24.dex */
abstract class AbstractCoder {
    private final Class<?>[] optionClasses;

    abstract InputStream decode(String str, InputStream inputStream, long j, Coder coder, byte[] bArr, int i) throws IOException;

    protected static int toInt(Object options, int defaultValue) {
        return options instanceof Number ? ((Number) options).intValue() : defaultValue;
    }

    protected AbstractCoder(Class<?>... optionClasses) {
        this.optionClasses = (Class[]) Objects.requireNonNull(optionClasses, "optionClasses");
    }

    OutputStream encode(OutputStream out, Object options) throws IOException {
        throw new UnsupportedOperationException("Method doesn't support writing");
    }

    byte[] getOptionsAsProperties(Object options) throws IOException {
        return ByteUtils.EMPTY_BYTE_ARRAY;
    }

    Object getOptionsFromCoder(Coder coder, InputStream in) throws IOException {
        return null;
    }

    boolean isOptionInstance(final Object opts) {
        return Stream.of((Object[]) this.optionClasses).anyMatch(new Predicate() { // from class: org.apache.commons.compress.archivers.sevenz.AbstractCoder$$ExternalSyntheticLambda0
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return ((Class) obj).isInstance(opts);
            }
        });
    }
}
