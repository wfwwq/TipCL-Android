package org.apache.commons.io.output;

import java.io.IOException;
import java.io.OutputStream;
import java.util.function.Supplier;

/* loaded from: classes24.dex */
public class BrokenOutputStream extends OutputStream {
    public static final BrokenOutputStream INSTANCE = new BrokenOutputStream();
    private final Supplier<IOException> exceptionSupplier;

    public BrokenOutputStream() {
        this((Supplier<IOException>) new Supplier() { // from class: org.apache.commons.io.output.BrokenOutputStream$$ExternalSyntheticLambda1
            @Override // java.util.function.Supplier
            public final Object get() {
                return BrokenOutputStream.lambda$new$0();
            }
        });
    }

    static /* synthetic */ IOException lambda$new$0() {
        return new IOException("Broken output stream");
    }

    public BrokenOutputStream(final IOException exception) {
        this((Supplier<IOException>) new Supplier() { // from class: org.apache.commons.io.output.BrokenOutputStream$$ExternalSyntheticLambda0
            @Override // java.util.function.Supplier
            public final Object get() {
                return BrokenOutputStream.lambda$new$1(exception);
            }
        });
    }

    static /* synthetic */ IOException lambda$new$1(IOException exception) {
        return exception;
    }

    public BrokenOutputStream(Supplier<IOException> exceptionSupplier) {
        this.exceptionSupplier = exceptionSupplier;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        throw this.exceptionSupplier.get();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        throw this.exceptionSupplier.get();
    }

    @Override // java.io.OutputStream
    public void write(int b) throws IOException {
        throw this.exceptionSupplier.get();
    }
}
