package org.apache.commons.compress.archivers;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import kotlin.UByte;
import org.apache.commons.compress.archivers.ArchiveEntry;
import org.apache.commons.io.Charsets;
import org.apache.commons.io.input.NullInputStream;

/* loaded from: classes24.dex */
public abstract class ArchiveInputStream<E extends ArchiveEntry> extends FilterInputStream {
    private static final int BYTE_MASK = 255;
    private long bytesRead;
    private Charset charset;
    private final byte[] single;

    public abstract E getNextEntry() throws IOException;

    public ArchiveInputStream() {
        this(NullInputStream.INSTANCE, Charset.defaultCharset());
    }

    private ArchiveInputStream(InputStream inputStream, Charset charset) {
        super(inputStream);
        this.single = new byte[1];
        this.charset = Charsets.toCharset(charset);
    }

    protected ArchiveInputStream(InputStream inputStream, String charsetName) {
        this(inputStream, Charsets.toCharset(charsetName));
    }

    public boolean canReadEntryData(ArchiveEntry archiveEntry) {
        return true;
    }

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

    public Charset getCharset() {
        return this.charset;
    }

    @Deprecated
    public int getCount() {
        return (int) this.bytesRead;
    }

    protected void pushedBackBytes(long pushedBack) {
        this.bytesRead -= pushedBack;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        int num = read(this.single, 0, 1);
        if (num == -1) {
            return -1;
        }
        return this.single[0] & UByte.MAX_VALUE;
    }
}
