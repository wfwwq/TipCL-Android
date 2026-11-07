package org.apache.commons.compress.archivers;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import org.apache.commons.compress.archivers.ArchiveEntry;

/* loaded from: classes24.dex */
public abstract class ArchiveOutputStream<E extends ArchiveEntry> extends OutputStream {
    static final int BYTE_MASK = 255;
    private long bytesWritten;
    private final byte[] oneByte = new byte[1];

    public abstract void closeArchiveEntry() throws IOException;

    public abstract E createArchiveEntry(File file, String str) throws IOException;

    public abstract void finish() throws IOException;

    public abstract void putArchiveEntry(E e) throws IOException;

    public boolean canWriteEntryData(ArchiveEntry archiveEntry) {
        return true;
    }

    protected void count(int written) {
        count(written);
    }

    protected void count(long written) {
        if (written != -1) {
            this.bytesWritten += written;
        }
    }

    public E createArchiveEntry(Path path, String str, LinkOption... linkOptionArr) throws IOException {
        return (E) createArchiveEntry(path.toFile(), str);
    }

    public long getBytesWritten() {
        return this.bytesWritten;
    }

    @Deprecated
    public int getCount() {
        return (int) this.bytesWritten;
    }

    @Override // java.io.OutputStream
    public void write(int b) throws IOException {
        this.oneByte[0] = (byte) (b & 255);
        write(this.oneByte, 0, 1);
    }
}
