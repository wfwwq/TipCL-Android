package org.apache.commons.compress.archivers.ar;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import org.apache.commons.compress.archivers.ArchiveOutputStream;
import org.apache.commons.compress.utils.ArchiveUtils;
import org.apache.commons.lang3.StringUtils;

/* loaded from: classes24.dex */
public class ArArchiveOutputStream extends ArchiveOutputStream<ArArchiveEntry> {
    public static final int LONGFILE_BSD = 1;
    public static final int LONGFILE_ERROR = 0;
    private long entryOffset;
    private boolean finished;
    private boolean haveUnclosedEntry;
    private int longFileMode = 0;
    private final OutputStream out;
    private ArArchiveEntry prevEntry;

    public ArArchiveOutputStream(OutputStream out) {
        this.out = out;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        try {
            if (!this.finished) {
                finish();
            }
        } finally {
            this.out.close();
            this.prevEntry = null;
        }
    }

    @Override // org.apache.commons.compress.archivers.ArchiveOutputStream
    public void closeArchiveEntry() throws IOException {
        if (this.finished) {
            throw new IOException("Stream has already been finished");
        }
        if (this.prevEntry == null || !this.haveUnclosedEntry) {
            throw new IOException("No current entry to close");
        }
        if (this.entryOffset % 2 != 0) {
            this.out.write(10);
        }
        this.haveUnclosedEntry = false;
    }

    @Override // org.apache.commons.compress.archivers.ArchiveOutputStream
    public ArArchiveEntry createArchiveEntry(File inputFile, String entryName) throws IOException {
        if (this.finished) {
            throw new IOException("Stream has already been finished");
        }
        return new ArArchiveEntry(inputFile, entryName);
    }

    @Override // org.apache.commons.compress.archivers.ArchiveOutputStream
    public ArArchiveEntry createArchiveEntry(Path inputPath, String entryName, LinkOption... options) throws IOException {
        if (this.finished) {
            throw new IOException("Stream has already been finished");
        }
        return new ArArchiveEntry(inputPath, entryName, options);
    }

    private long fill(long pOffset, long pNewOffset, char pFill) throws IOException {
        long diff = pNewOffset - pOffset;
        if (diff > 0) {
            for (int i = 0; i < diff; i++) {
                write(pFill);
            }
        }
        return pNewOffset;
    }

    @Override // org.apache.commons.compress.archivers.ArchiveOutputStream
    public void finish() throws IOException {
        if (this.haveUnclosedEntry) {
            throw new IOException("This archive contains unclosed entries.");
        }
        if (this.finished) {
            throw new IOException("This archive has already been finished");
        }
        this.finished = true;
    }

    @Override // org.apache.commons.compress.archivers.ArchiveOutputStream
    public void putArchiveEntry(ArArchiveEntry entry) throws IOException {
        if (this.finished) {
            throw new IOException("Stream has already been finished");
        }
        if (this.prevEntry == null) {
            writeArchiveHeader();
        } else {
            if (this.prevEntry.getLength() != this.entryOffset) {
                throw new IOException("Length does not match entry (" + this.prevEntry.getLength() + " != " + this.entryOffset);
            }
            if (this.haveUnclosedEntry) {
                closeArchiveEntry();
            }
        }
        this.prevEntry = entry;
        writeEntryHeader(entry);
        this.entryOffset = 0L;
        this.haveUnclosedEntry = true;
    }

    public void setLongFileMode(int longFileMode) {
        this.longFileMode = longFileMode;
    }

    @Override // java.io.OutputStream
    public void write(byte[] b, int off, int len) throws IOException {
        this.out.write(b, off, len);
        count(len);
        this.entryOffset += len;
    }

    private long write(String data) throws IOException {
        byte[] bytes = data.getBytes(StandardCharsets.US_ASCII);
        write(bytes);
        return bytes.length;
    }

    private void writeArchiveHeader() throws IOException {
        byte[] header = ArchiveUtils.toAsciiBytes(ArArchiveEntry.HEADER);
        this.out.write(header);
    }

    private void writeEntryHeader(ArArchiveEntry entry) throws IOException {
        long offset;
        boolean mustAppendName;
        String n = entry.getName();
        int nLength = n.length();
        if (this.longFileMode == 0 && nLength > 16) {
            throw new IOException("File name too long, > 16 chars: " + n);
        }
        if (1 == this.longFileMode && (nLength > 16 || n.contains(StringUtils.SPACE))) {
            offset = 0 + write("#1/" + nLength);
            mustAppendName = true;
        } else {
            offset = 0 + write(n);
            mustAppendName = false;
        }
        long offset2 = fill(offset, 16L, ' ');
        String m = "" + entry.getLastModified();
        if (m.length() <= 12) {
            long offset3 = fill(offset2 + write(m), 28L, ' ');
            String u = "" + entry.getUserId();
            if (u.length() <= 6) {
                long offset4 = fill(offset3 + write(u), 34L, ' ');
                String g = "" + entry.getGroupId();
                if (g.length() <= 6) {
                    long offset5 = fill(offset4 + write(g), 40L, ' ');
                    String fm = "" + Integer.toString(entry.getMode(), 8);
                    if (fm.length() <= 8) {
                        long offset6 = fill(offset5 + write(fm), 48L, ' ');
                        String s = String.valueOf(entry.getLength() + (mustAppendName ? nLength : 0));
                        if (s.length() <= 10) {
                            long offset7 = fill(offset6 + write(s), 58L, ' ') + write(ArArchiveEntry.TRAILER);
                            if (mustAppendName) {
                                long jWrite = offset7 + write(n);
                                return;
                            }
                            return;
                        }
                        throw new IOException("Size too long");
                    }
                    throw new IOException("Filemode too long");
                }
                throw new IOException("Group id too long");
            }
            throw new IOException("User id too long");
        }
        throw new IOException("Last modified too long");
    }
}
