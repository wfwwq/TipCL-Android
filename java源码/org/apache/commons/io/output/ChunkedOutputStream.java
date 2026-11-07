package org.apache.commons.io.output;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import org.apache.commons.io.build.AbstractStreamBuilder;

/* loaded from: classes24.dex */
public class ChunkedOutputStream extends FilterOutputStream {
    private final int chunkSize;

    public static class Builder extends AbstractStreamBuilder<ChunkedOutputStream, Builder> {
        @Override // org.apache.commons.io.function.IOSupplier
        public ChunkedOutputStream get() throws IOException {
            return new ChunkedOutputStream(getOutputStream(), getBufferSize());
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    @Deprecated
    public ChunkedOutputStream(OutputStream stream) {
        this(stream, 8192);
    }

    @Deprecated
    public ChunkedOutputStream(OutputStream stream, int chunkSize) {
        super(stream);
        if (chunkSize <= 0) {
            throw new IllegalArgumentException("chunkSize <= 0");
        }
        this.chunkSize = chunkSize;
    }

    int getChunkSize() {
        return this.chunkSize;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] data, int srcOffset, int length) throws IOException {
        int bytes = length;
        int dstOffset = srcOffset;
        while (bytes > 0) {
            int chunk = Math.min(bytes, this.chunkSize);
            this.out.write(data, dstOffset, chunk);
            bytes -= chunk;
            dstOffset += chunk;
        }
    }
}
