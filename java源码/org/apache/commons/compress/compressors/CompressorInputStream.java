package org.apache.commons.compress.compressors;

import java.io.InputStream;

/* loaded from: classes24.dex */
public abstract class CompressorInputStream extends InputStream {
    private long bytesRead;

    protected void count(int read) {
        count(read);
    }

    protected void count(long read) {
        if (read != -1) {
            this.bytesRead += read;
        }
    }

    public long getBytesRead() {
        return this.bytesRead;
    }

    @Deprecated
    public int getCount() {
        return (int) this.bytesRead;
    }

    public long getUncompressedCount() {
        return getBytesRead();
    }

    protected void pushedBackBytes(long pushedBack) {
        this.bytesRead -= pushedBack;
    }
}
