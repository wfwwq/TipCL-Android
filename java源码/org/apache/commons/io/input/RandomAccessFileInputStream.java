package org.apache.commons.io.input;

import androidx.collection.SieveCacheKt;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.Objects;
import org.apache.commons.io.RandomAccessFileMode;
import org.apache.commons.io.build.AbstractStreamBuilder;

/* loaded from: classes24.dex */
public class RandomAccessFileInputStream extends InputStream {
    private final boolean closeOnClose;
    private final RandomAccessFile randomAccessFile;

    public static class Builder extends AbstractStreamBuilder<RandomAccessFileInputStream, Builder> {
        private boolean closeOnClose;
        private RandomAccessFile randomAccessFile;

        @Override // org.apache.commons.io.function.IOSupplier
        public RandomAccessFileInputStream get() throws IOException {
            if (this.randomAccessFile != null) {
                if (getOrigin() != null) {
                    throw new IllegalStateException(String.format("Only set one of RandomAccessFile (%s) or origin (%s)", this.randomAccessFile, getOrigin()));
                }
                return new RandomAccessFileInputStream(this.randomAccessFile, this.closeOnClose);
            }
            return new RandomAccessFileInputStream(RandomAccessFileMode.READ_ONLY.create(getOrigin().getFile()), this.closeOnClose);
        }

        public Builder setCloseOnClose(boolean closeOnClose) {
            this.closeOnClose = closeOnClose;
            return this;
        }

        public Builder setRandomAccessFile(RandomAccessFile randomAccessFile) {
            this.randomAccessFile = randomAccessFile;
            return this;
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    @Deprecated
    public RandomAccessFileInputStream(RandomAccessFile file) {
        this(file, false);
    }

    @Deprecated
    public RandomAccessFileInputStream(RandomAccessFile file, boolean closeOnClose) {
        this.randomAccessFile = (RandomAccessFile) Objects.requireNonNull(file, "file");
        this.closeOnClose = closeOnClose;
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        long avail = availableLong();
        if (avail > SieveCacheKt.NodeLinkMask) {
            return Integer.MAX_VALUE;
        }
        return (int) avail;
    }

    public long availableLong() throws IOException {
        return this.randomAccessFile.length() - this.randomAccessFile.getFilePointer();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        super.close();
        if (this.closeOnClose) {
            this.randomAccessFile.close();
        }
    }

    public RandomAccessFile getRandomAccessFile() {
        return this.randomAccessFile;
    }

    public boolean isCloseOnClose() {
        return this.closeOnClose;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        return this.randomAccessFile.read();
    }

    @Override // java.io.InputStream
    public int read(byte[] bytes) throws IOException {
        return this.randomAccessFile.read(bytes);
    }

    @Override // java.io.InputStream
    public int read(byte[] bytes, int offset, int length) throws IOException {
        return this.randomAccessFile.read(bytes, offset, length);
    }

    @Override // java.io.InputStream
    public long skip(long skipCount) throws IOException {
        if (skipCount <= 0) {
            return 0L;
        }
        long filePointer = this.randomAccessFile.getFilePointer();
        long fileLength = this.randomAccessFile.length();
        if (filePointer >= fileLength) {
            return 0L;
        }
        long targetPos = filePointer + skipCount;
        long newPos = targetPos > fileLength ? fileLength - 1 : targetPos;
        if (newPos > 0) {
            this.randomAccessFile.seek(newPos);
        }
        return this.randomAccessFile.getFilePointer() - filePointer;
    }
}
