package org.apache.commons.io.input;

import java.io.IOException;
import java.io.Reader;
import java.util.function.Supplier;

/* loaded from: classes24.dex */
public class BrokenReader extends Reader {
    public static final BrokenReader INSTANCE = new BrokenReader();
    private final Supplier<IOException> exceptionSupplier;

    public BrokenReader() {
        this((Supplier<IOException>) new Supplier() { // from class: org.apache.commons.io.input.BrokenReader$$ExternalSyntheticLambda1
            @Override // java.util.function.Supplier
            public final Object get() {
                return BrokenReader.lambda$new$0();
            }
        });
    }

    static /* synthetic */ IOException lambda$new$0() {
        return new IOException("Broken reader");
    }

    public BrokenReader(final IOException exception) {
        this((Supplier<IOException>) new Supplier() { // from class: org.apache.commons.io.input.BrokenReader$$ExternalSyntheticLambda0
            @Override // java.util.function.Supplier
            public final Object get() {
                return BrokenReader.lambda$new$1(exception);
            }
        });
    }

    static /* synthetic */ IOException lambda$new$1(IOException exception) {
        return exception;
    }

    public BrokenReader(Supplier<IOException> exceptionSupplier) {
        this.exceptionSupplier = exceptionSupplier;
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        throw this.exceptionSupplier.get();
    }

    @Override // java.io.Reader
    public void mark(int readAheadLimit) throws IOException {
        throw this.exceptionSupplier.get();
    }

    @Override // java.io.Reader
    public int read(char[] cbuf, int off, int len) throws IOException {
        throw this.exceptionSupplier.get();
    }

    @Override // java.io.Reader
    public boolean ready() throws IOException {
        throw this.exceptionSupplier.get();
    }

    @Override // java.io.Reader
    public synchronized void reset() throws IOException {
        throw this.exceptionSupplier.get();
    }

    @Override // java.io.Reader
    public long skip(long n) throws IOException {
        throw this.exceptionSupplier.get();
    }
}
