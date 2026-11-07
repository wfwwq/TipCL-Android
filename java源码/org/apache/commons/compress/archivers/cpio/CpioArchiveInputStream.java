package org.apache.commons.compress.archivers.cpio;

import androidx.collection.SieveCacheKt;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import kotlin.UByte;
import org.apache.commons.compress.archivers.ArchiveInputStream;
import org.apache.commons.compress.archivers.zip.ZipEncoding;
import org.apache.commons.compress.archivers.zip.ZipEncodingHelper;
import org.apache.commons.compress.utils.ArchiveUtils;
import org.apache.commons.compress.utils.CharsetNames;
import org.apache.commons.compress.utils.IOUtils;
import org.apache.commons.compress.utils.ParsingUtils;

/* loaded from: classes24.dex */
public class CpioArchiveInputStream extends ArchiveInputStream<CpioArchiveEntry> implements CpioConstants {
    private final int blockSize;
    private boolean closed;
    private long crc;
    private CpioArchiveEntry entry;
    private long entryBytesRead;
    private boolean entryEOF;
    private final byte[] fourBytesBuf;
    private final byte[] sixBytesBuf;
    private final byte[] tmpbuf;
    private final byte[] twoBytesBuf;
    private final ZipEncoding zipEncoding;

    public static boolean matches(byte[] signature, int length) {
        if (length < 6) {
            return false;
        }
        if (signature[0] == 113 && (signature[1] & UByte.MAX_VALUE) == 199) {
            return true;
        }
        if (signature[1] == 113 && (signature[0] & UByte.MAX_VALUE) == 199) {
            return true;
        }
        if (signature[0] == 48 && signature[1] == 55 && signature[2] == 48 && signature[3] == 55 && signature[4] == 48) {
            return signature[5] == 49 || signature[5] == 50 || signature[5] == 55;
        }
        return false;
    }

    public CpioArchiveInputStream(InputStream in) {
        this(in, 512, CharsetNames.US_ASCII);
    }

    public CpioArchiveInputStream(InputStream in, int blockSize) {
        this(in, blockSize, CharsetNames.US_ASCII);
    }

    public CpioArchiveInputStream(InputStream in, int blockSize, String encoding) {
        super(in, encoding);
        this.tmpbuf = new byte[4096];
        this.twoBytesBuf = new byte[2];
        this.fourBytesBuf = new byte[4];
        this.sixBytesBuf = new byte[6];
        this.in = in;
        if (blockSize <= 0) {
            throw new IllegalArgumentException("blockSize must be bigger than 0");
        }
        this.blockSize = blockSize;
        this.zipEncoding = ZipEncodingHelper.getZipEncoding(encoding);
    }

    public CpioArchiveInputStream(InputStream in, String encoding) {
        this(in, 512, encoding);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() throws IOException {
        ensureOpen();
        if (this.entryEOF) {
            return 0;
        }
        return 1;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (!this.closed) {
            this.in.close();
            this.closed = true;
        }
    }

    private void closeEntry() throws IOException {
        while (skip(SieveCacheKt.NodeLinkMask) == SieveCacheKt.NodeLinkMask) {
        }
    }

    private void ensureOpen() throws IOException {
        if (this.closed) {
            throw new IOException("Stream closed");
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007b  */
    @java.lang.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public org.apache.commons.compress.archivers.cpio.CpioArchiveEntry getNextCPIOEntry() throws java.io.IOException {
        /*
            r7 = this;
            r7.ensureOpen()
            org.apache.commons.compress.archivers.cpio.CpioArchiveEntry r0 = r7.entry
            if (r0 == 0) goto La
            r7.closeEntry()
        La:
            byte[] r0 = r7.twoBytesBuf
            byte[] r1 = r7.twoBytesBuf
            int r1 = r1.length
            r2 = 0
            r7.readFully(r0, r2, r1)
            byte[] r0 = r7.twoBytesBuf
            long r0 = org.apache.commons.compress.archivers.cpio.CpioUtil.byteArray2long(r0, r2)
            r3 = 29127(0x71c7, double:1.43907E-319)
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            r1 = 1
            if (r0 != 0) goto L28
            org.apache.commons.compress.archivers.cpio.CpioArchiveEntry r0 = r7.readOldBinaryEntry(r2)
            r7.entry = r0
            goto Lbb
        L28:
            byte[] r0 = r7.twoBytesBuf
            long r5 = org.apache.commons.compress.archivers.cpio.CpioUtil.byteArray2long(r0, r1)
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 != 0) goto L3a
            org.apache.commons.compress.archivers.cpio.CpioArchiveEntry r0 = r7.readOldBinaryEntry(r1)
            r7.entry = r0
            goto Lbb
        L3a:
            byte[] r0 = r7.twoBytesBuf
            byte[] r3 = r7.sixBytesBuf
            byte[] r4 = r7.twoBytesBuf
            int r4 = r4.length
            java.lang.System.arraycopy(r0, r2, r3, r2, r4)
            byte[] r0 = r7.sixBytesBuf
            byte[] r3 = r7.twoBytesBuf
            int r3 = r3.length
            byte[] r4 = r7.fourBytesBuf
            int r4 = r4.length
            r7.readFully(r0, r3, r4)
            byte[] r0 = r7.sixBytesBuf
            java.lang.String r0 = org.apache.commons.compress.utils.ArchiveUtils.toAsciiString(r0)
            int r3 = r0.hashCode()
            switch(r3) {
                case 1426477263: goto L71;
                case 1426477264: goto L67;
                case 1426477269: goto L5d;
                default: goto L5c;
            }
        L5c:
            goto L7b
        L5d:
            java.lang.String r3 = "070707"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L5c
            r3 = 2
            goto L7c
        L67:
            java.lang.String r3 = "070702"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L5c
            r3 = r1
            goto L7c
        L71:
            java.lang.String r3 = "070701"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L5c
            r3 = r2
            goto L7c
        L7b:
            r3 = -1
        L7c:
            switch(r3) {
                case 0: goto Lb4;
                case 1: goto Lad;
                case 2: goto La6;
                default: goto L7f;
            }
        L7f:
            java.io.IOException r1 = new java.io.IOException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Unknown magic ["
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r0)
            java.lang.String r3 = "]. Occurred at byte: "
            java.lang.StringBuilder r2 = r2.append(r3)
            long r3 = r7.getBytesRead()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        La6:
            org.apache.commons.compress.archivers.cpio.CpioArchiveEntry r3 = r7.readOldAsciiEntry()
            r7.entry = r3
            goto Lbb
        Lad:
            org.apache.commons.compress.archivers.cpio.CpioArchiveEntry r3 = r7.readNewEntry(r1)
            r7.entry = r3
            goto Lbb
        Lb4:
            org.apache.commons.compress.archivers.cpio.CpioArchiveEntry r3 = r7.readNewEntry(r2)
            r7.entry = r3
        Lbb:
            r3 = 0
            r7.entryBytesRead = r3
            r7.entryEOF = r2
            r7.crc = r3
            org.apache.commons.compress.archivers.cpio.CpioArchiveEntry r0 = r7.entry
            java.lang.String r0 = r0.getName()
            java.lang.String r2 = "TRAILER!!!"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto Ld8
            r7.entryEOF = r1
            r7.skipRemainderOfLastBlock()
            r0 = 0
            return r0
        Ld8:
            org.apache.commons.compress.archivers.cpio.CpioArchiveEntry r0 = r7.entry
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.getNextCPIOEntry():org.apache.commons.compress.archivers.cpio.CpioArchiveEntry");
    }

    @Override // org.apache.commons.compress.archivers.ArchiveInputStream
    public CpioArchiveEntry getNextEntry() throws IOException {
        return getNextCPIOEntry();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] b, int off, int len) throws IOException {
        ensureOpen();
        if (off < 0 || len < 0 || off > b.length - len) {
            throw new IndexOutOfBoundsException();
        }
        if (len == 0) {
            return 0;
        }
        if (this.entry == null || this.entryEOF) {
            return -1;
        }
        if (this.entryBytesRead == this.entry.getSize()) {
            skip(this.entry.getDataPadCount());
            this.entryEOF = true;
            if (this.entry.getFormat() != 2 || this.crc == this.entry.getChksum()) {
                return -1;
            }
            throw new IOException("CRC Error. Occurred at byte: " + getBytesRead());
        }
        int tmplength = (int) Math.min(len, this.entry.getSize() - this.entryBytesRead);
        if (tmplength < 0) {
            return -1;
        }
        int tmpread = readFully(b, off, tmplength);
        if (this.entry.getFormat() == 2) {
            for (int pos = 0; pos < tmpread; pos++) {
                this.crc += b[pos] & UByte.MAX_VALUE;
                this.crc &= 4294967295L;
            }
        }
        if (tmpread > 0) {
            this.entryBytesRead += tmpread;
        }
        return tmpread;
    }

    private long readAsciiLong(int length, int radix) throws IOException {
        byte[] tmpBuffer = readRange(length);
        return ParsingUtils.parseLongValue(ArchiveUtils.toAsciiString(tmpBuffer), radix);
    }

    private long readBinaryLong(int length, boolean swapHalfWord) throws IOException {
        byte[] tmp = readRange(length);
        return CpioUtil.byteArray2long(tmp, swapHalfWord);
    }

    private String readCString(int length) throws IOException {
        byte[] tmpBuffer = readRange(length - 1);
        if (this.in.read() == -1) {
            throw new EOFException();
        }
        return this.zipEncoding.decode(tmpBuffer);
    }

    private int readFully(byte[] b, int off, int len) throws IOException {
        int count = IOUtils.readFully(this.in, b, off, len);
        count(count);
        if (count < len) {
            throw new EOFException();
        }
        return count;
    }

    private CpioArchiveEntry readNewEntry(boolean hasCrc) throws IOException {
        CpioArchiveEntry ret;
        if (hasCrc) {
            ret = new CpioArchiveEntry((short) 2);
        } else {
            ret = new CpioArchiveEntry((short) 1);
        }
        ret.setInode(readAsciiLong(8, 16));
        long mode = readAsciiLong(8, 16);
        if (CpioUtil.fileType(mode) != 0) {
            ret.setMode(mode);
        }
        ret.setUID(readAsciiLong(8, 16));
        ret.setGID(readAsciiLong(8, 16));
        ret.setNumberOfLinks(readAsciiLong(8, 16));
        ret.setTime(readAsciiLong(8, 16));
        ret.setSize(readAsciiLong(8, 16));
        if (ret.getSize() < 0) {
            throw new IOException("Found illegal entry with negative length");
        }
        ret.setDeviceMaj(readAsciiLong(8, 16));
        ret.setDeviceMin(readAsciiLong(8, 16));
        ret.setRemoteDeviceMaj(readAsciiLong(8, 16));
        ret.setRemoteDeviceMin(readAsciiLong(8, 16));
        long namesize = readAsciiLong(8, 16);
        if (namesize < 0) {
            throw new IOException("Found illegal entry with negative name length");
        }
        ret.setChksum(readAsciiLong(8, 16));
        String name = readCString((int) namesize);
        ret.setName(name);
        if (CpioUtil.fileType(mode) == 0 && !name.equals(CpioConstants.CPIO_TRAILER)) {
            throw new IOException("Mode 0 only allowed in the trailer. Found entry name: " + ArchiveUtils.sanitize(name) + " Occurred at byte: " + getBytesRead());
        }
        skip(ret.getHeaderPadCount(namesize - 1));
        return ret;
    }

    private CpioArchiveEntry readOldAsciiEntry() throws IOException {
        CpioArchiveEntry ret = new CpioArchiveEntry((short) 4);
        ret.setDevice(readAsciiLong(6, 8));
        ret.setInode(readAsciiLong(6, 8));
        long mode = readAsciiLong(6, 8);
        if (CpioUtil.fileType(mode) != 0) {
            ret.setMode(mode);
        }
        ret.setUID(readAsciiLong(6, 8));
        ret.setGID(readAsciiLong(6, 8));
        ret.setNumberOfLinks(readAsciiLong(6, 8));
        ret.setRemoteDevice(readAsciiLong(6, 8));
        ret.setTime(readAsciiLong(11, 8));
        long namesize = readAsciiLong(6, 8);
        if (namesize < 0) {
            throw new IOException("Found illegal entry with negative name length");
        }
        ret.setSize(readAsciiLong(11, 8));
        if (ret.getSize() < 0) {
            throw new IOException("Found illegal entry with negative length");
        }
        String name = readCString((int) namesize);
        ret.setName(name);
        if (CpioUtil.fileType(mode) == 0 && !name.equals(CpioConstants.CPIO_TRAILER)) {
            throw new IOException("Mode 0 only allowed in the trailer. Found entry: " + ArchiveUtils.sanitize(name) + " Occurred at byte: " + getBytesRead());
        }
        return ret;
    }

    private CpioArchiveEntry readOldBinaryEntry(boolean swapHalfWord) throws IOException {
        CpioArchiveEntry ret = new CpioArchiveEntry((short) 8);
        ret.setDevice(readBinaryLong(2, swapHalfWord));
        ret.setInode(readBinaryLong(2, swapHalfWord));
        long mode = readBinaryLong(2, swapHalfWord);
        if (CpioUtil.fileType(mode) != 0) {
            ret.setMode(mode);
        }
        ret.setUID(readBinaryLong(2, swapHalfWord));
        ret.setGID(readBinaryLong(2, swapHalfWord));
        ret.setNumberOfLinks(readBinaryLong(2, swapHalfWord));
        ret.setRemoteDevice(readBinaryLong(2, swapHalfWord));
        ret.setTime(readBinaryLong(4, swapHalfWord));
        long namesize = readBinaryLong(2, swapHalfWord);
        if (namesize < 0) {
            throw new IOException("Found illegal entry with negative name length");
        }
        ret.setSize(readBinaryLong(4, swapHalfWord));
        if (ret.getSize() < 0) {
            throw new IOException("Found illegal entry with negative length");
        }
        String name = readCString((int) namesize);
        ret.setName(name);
        if (CpioUtil.fileType(mode) == 0 && !name.equals(CpioConstants.CPIO_TRAILER)) {
            throw new IOException("Mode 0 only allowed in the trailer. Found entry: " + ArchiveUtils.sanitize(name) + "Occurred at byte: " + getBytesRead());
        }
        skip(ret.getHeaderPadCount(namesize - 1));
        return ret;
    }

    private byte[] readRange(int len) throws IOException {
        byte[] b = IOUtils.readRange(this.in, len);
        count(b.length);
        if (b.length < len) {
            throw new EOFException();
        }
        return b;
    }

    private void skip(int bytes) throws IOException {
        if (bytes > 0) {
            readFully(this.fourBytesBuf, 0, bytes);
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long n) throws IOException {
        if (n < 0) {
            throw new IllegalArgumentException("Negative skip length");
        }
        ensureOpen();
        int max = (int) Math.min(n, SieveCacheKt.NodeLinkMask);
        int total = 0;
        while (true) {
            if (total >= max) {
                break;
            }
            int len = max - total;
            if (len > this.tmpbuf.length) {
                len = this.tmpbuf.length;
            }
            int len2 = read(this.tmpbuf, 0, len);
            if (len2 == -1) {
                this.entryEOF = true;
                break;
            }
            total += len2;
        }
        return total;
    }

    private void skipRemainderOfLastBlock() throws IOException {
        long readFromLastBlock = getBytesRead() % this.blockSize;
        long remainingBytes = readFromLastBlock == 0 ? 0L : this.blockSize - readFromLastBlock;
        while (remainingBytes > 0) {
            long skipped = skip(this.blockSize - readFromLastBlock);
            if (skipped > 0) {
                remainingBytes -= skipped;
            } else {
                return;
            }
        }
    }
}
