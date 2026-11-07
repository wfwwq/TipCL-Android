package org.apache.commons.compress.archivers.zip;

import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes24.dex */
abstract class RandomAccessOutputStream extends OutputStream {
    public abstract long position() throws IOException;

    abstract void writeFully(byte[] bArr, int i, int i2, long j) throws IOException;

    RandomAccessOutputStream() {
    }

    @Override // java.io.OutputStream
    public void write(int b) throws IOException {
        write(new byte[]{(byte) b});
    }

    public void writeFully(byte[] b, long position) throws IOException {
        writeFully(b, 0, b.length, position);
    }
}
