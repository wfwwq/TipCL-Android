package org.apache.commons.io.input;

import java.io.IOException;
import java.io.InputStream;
import java.util.function.Supplier;

/* loaded from: classes24.dex */
public class BrokenInputStream extends InputStream {
    public static final BrokenInputStream INSTANCE = new BrokenInputStream();
    private final Supplier<IOException> exceptionSupplier;

    public BrokenInputStream() {
        this((Supplier<IOException>) new Supplier() { // from class: org.apache.commons.io.input.BrokenInputStream$$ExternalSyntheticLambda0
            @Override // java.util.function.Supplier
            public final Object get() {
                return BrokenInputStream.lambda$new$0();
            }
        });
    }

    static /* synthetic */ IOException lambda$new$0() {
        return new IOException("Broken input stream");
    }

    public BrokenInputStream(final IOException exception) {
        this((Supplier<IOException>) new Supplier() { // from class: org.apache.commons.io.input.BrokenInputStream$$ExternalSyntheticLambda1
            @Override // java.util.function.Supplier
            public final Object get() {
                return BrokenInputStream.lambda$new$1(exception);
            }
        });
    }

    static /* synthetic */ IOException lambda$new$1(IOException exception) {
        return exception;
    }

    public BrokenInputStream(Supplier<IOException> exceptionSupplier) {
        this.exceptionSupplier = exceptionSupplier;
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        throw this.exceptionSupplier.get();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        throw this.exceptionSupplier.get();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        throw this.exceptionSupplier.get();
    }

    @Override // java.io.InputStream
    public synchronized void reset() throws IOException {
        throw this.exceptionSupplier.get();
    }

    @Override // java.io.InputStream
    public long skip(long n) throws IOException {
        throw this.exceptionSupplier.get();
    }
}
