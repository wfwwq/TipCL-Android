package org.apache.commons.io.input;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes24.dex */
public class BoundedInputStream extends FilterInputStream {
    private long count;
    private long mark;
    private final long maxCount;
    private boolean propagateClose;

    public BoundedInputStream(InputStream in) {
        this(in, -1L);
    }

    public BoundedInputStream(InputStream inputStream, long maxLength) {
        super(inputStream);
        this.mark = -1L;
        this.propagateClose = true;
        this.maxCount = maxLength;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() throws IOException {
        if (isMaxLength()) {
            onMaxLength(this.maxCount, this.count);
            return 0;
        }
        return this.in.available();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.propagateClose) {
            this.in.close();
        }
    }

    public long getCount() {
        return this.count;
    }

    public long getMaxLength() {
        return this.maxCount;
    }

    private boolean isMaxLength() {
        return this.maxCount >= 0 && this.count >= this.maxCount;
    }

    public boolean isPropagateClose() {
        return this.propagateClose;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int readLimit) {
        this.in.mark(readLimit);
        this.mark = this.count;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return this.in.markSupported();
    }

    protected void onMaxLength(long maxLength, long count) throws IOException {
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        if (isMaxLength()) {
            onMaxLength(this.maxCount, this.count);
            return -1;
        }
        int result = this.in.read();
        this.count++;
        return result;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] b) throws IOException {
        return read(b, 0, b.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] b, int off, int len) throws IOException {
        if (isMaxLength()) {
            onMaxLength(this.maxCount, this.count);
            return -1;
        }
        long maxRead = len;
        if (this.maxCount >= 0) {
            maxRead = Math.min(maxRead, this.maxCount - this.count);
        }
        int bytesRead = this.in.read(b, off, (int) maxRead);
        if (bytesRead == -1) {
            return -1;
        }
        this.count += bytesRead;
        return bytesRead;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() throws IOException {
        this.in.reset();
        this.count = this.mark;
    }

    public void setPropagateClose(boolean propagateClose) {
        this.propagateClose = propagateClose;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long n) throws IOException {
        long toSkip = this.maxCount >= 0 ? Math.min(n, this.maxCount - this.count) : n;
        long skippedBytes = this.in.skip(toSkip);
        this.count += skippedBytes;
        return skippedBytes;
    }

    public String toString() {
        return this.in.toString();
    }
}
