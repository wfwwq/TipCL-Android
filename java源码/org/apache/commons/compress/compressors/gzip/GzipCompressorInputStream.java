package org.apache.commons.compress.compressors.gzip;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.CRC32;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import kotlin.UByte;
import org.apache.commons.compress.compressors.CompressorInputStream;
import org.apache.commons.compress.utils.ByteUtils;
import org.apache.commons.compress.utils.InputStreamStatistics;
import org.apache.commons.io.IOUtils;
import org.apache.commons.io.input.CountingInputStream;

/* loaded from: classes24.dex */
public class GzipCompressorInputStream extends CompressorInputStream implements InputStreamStatistics {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final int FCOMMENT = 16;
    private static final int FEXTRA = 4;
    private static final int FHCRC = 2;
    private static final int FNAME = 8;
    private static final int FRESERVED = 224;
    private final byte[] buf;
    private int bufUsed;
    private final CountingInputStream countingStream;
    private final CRC32 crc;
    private final boolean decompressConcatenated;
    private boolean endReached;
    private final InputStream in;
    private Inflater inf;
    private final byte[] oneByte;
    private final GzipParameters parameters;

    public static boolean matches(byte[] signature, int length) {
        return length >= 2 && signature[0] == 31 && signature[1] == -117;
    }

    private static byte[] readToNull(DataInput inData) throws IOException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        while (true) {
            try {
                int b = inData.readUnsignedByte();
                if (b != 0) {
                    bos.write(b);
                } else {
                    byte[] byteArray = bos.toByteArray();
                    bos.close();
                    return byteArray;
                }
            } catch (Throwable th) {
                try {
                    bos.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    public GzipCompressorInputStream(InputStream inputStream) throws IOException {
        this(inputStream, false);
    }

    public GzipCompressorInputStream(InputStream inputStream, boolean decompressConcatenated) throws IOException {
        this.buf = new byte[8192];
        this.inf = new Inflater(true);
        this.crc = new CRC32();
        this.oneByte = new byte[1];
        this.parameters = new GzipParameters();
        this.countingStream = new CountingInputStream(inputStream);
        if (this.countingStream.markSupported()) {
            this.in = this.countingStream;
        } else {
            this.in = new BufferedInputStream(this.countingStream);
        }
        this.decompressConcatenated = decompressConcatenated;
        init(true);
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.inf != null) {
            this.inf.end();
            this.inf = null;
        }
        if (this.in != System.in) {
            this.in.close();
        }
    }

    @Override // org.apache.commons.compress.utils.InputStreamStatistics
    public long getCompressedCount() {
        return this.countingStream.getByteCount();
    }

    public GzipParameters getMetaData() {
        return this.parameters;
    }

    private boolean init(boolean isFirstMember) throws IOException {
        if (!isFirstMember && !this.decompressConcatenated) {
            throw new AssertionError();
        }
        int magic0 = this.in.read();
        if (magic0 == -1 && !isFirstMember) {
            return false;
        }
        if (magic0 != 31 || this.in.read() != 139) {
            throw new IOException(isFirstMember ? "Input is not in the .gz format" : "Garbage after a valid .gz stream");
        }
        DataInput inData = new DataInputStream(this.in);
        int method = inData.readUnsignedByte();
        if (method != 8) {
            throw new IOException("Unsupported compression method " + method + " in the .gz header");
        }
        int flg = inData.readUnsignedByte();
        if ((flg & 224) != 0) {
            throw new IOException("Reserved flags are set in the .gz header");
        }
        this.parameters.setModificationTime(ByteUtils.fromLittleEndian(inData, 4) * 1000);
        switch (inData.readUnsignedByte()) {
            case 2:
                this.parameters.setCompressionLevel(9);
                break;
            case 4:
                this.parameters.setCompressionLevel(1);
                break;
        }
        this.parameters.setOperatingSystem(inData.readUnsignedByte());
        if ((flg & 4) != 0) {
            int xlen = inData.readUnsignedByte();
            int xlen2 = (inData.readUnsignedByte() << 8) | xlen;
            while (true) {
                int xlen3 = xlen2 - 1;
                if (xlen2 > 0) {
                    inData.readUnsignedByte();
                    xlen2 = xlen3;
                }
            }
        }
        if ((flg & 8) != 0) {
            this.parameters.setFileName(new String(readToNull(inData), GzipUtils.GZIP_ENCODING));
        }
        if ((flg & 16) != 0) {
            this.parameters.setComment(new String(readToNull(inData), GzipUtils.GZIP_ENCODING));
        }
        if ((flg & 2) != 0) {
            inData.readShort();
        }
        this.inf.reset();
        this.crc.reset();
        return true;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (read(this.oneByte, 0, 1) == -1) {
            return -1;
        }
        return this.oneByte[0] & UByte.MAX_VALUE;
    }

    @Override // java.io.InputStream
    public int read(byte[] b, int off, int len) throws DataFormatException, IOException {
        if (len == 0) {
            return 0;
        }
        if (this.endReached) {
            return -1;
        }
        int len2 = len;
        int size = 0;
        int off2 = off;
        while (len2 > 0) {
            if (this.inf.needsInput()) {
                this.in.mark(this.buf.length);
                this.bufUsed = this.in.read(this.buf);
                if (this.bufUsed != -1) {
                    this.inf.setInput(this.buf, 0, this.bufUsed);
                } else {
                    throw new EOFException();
                }
            }
            try {
                int ret = this.inf.inflate(b, off2, len2);
                this.crc.update(b, off2, ret);
                off2 += ret;
                len2 -= ret;
                size += ret;
                count(ret);
                if (this.inf.finished()) {
                    this.in.reset();
                    int skipAmount = this.bufUsed - this.inf.getRemaining();
                    if (IOUtils.skip(this.in, skipAmount) != skipAmount) {
                        throw new IOException();
                    }
                    this.bufUsed = 0;
                    DataInput inData = new DataInputStream(this.in);
                    long crcStored = ByteUtils.fromLittleEndian(inData, 4);
                    if (crcStored != this.crc.getValue()) {
                        throw new IOException("Gzip-compressed data is corrupt (CRC32 error)");
                    }
                    long isize = ByteUtils.fromLittleEndian(inData, 4);
                    if (isize != (this.inf.getBytesWritten() & 4294967295L)) {
                        throw new IOException("Gzip-compressed data is corrupt(uncompressed size mismatch)");
                    }
                    if (!this.decompressConcatenated || !init(false)) {
                        this.inf.end();
                        this.inf = null;
                        this.endReached = true;
                        if (size == 0) {
                            return -1;
                        }
                        return size;
                    }
                }
            } catch (DataFormatException e) {
                throw new IOException("Gzip-compressed data is corrupt");
            }
        }
        return size;
    }
}
