package org.tukaani.xz;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import kotlin.UByte;
import kotlin.jvm.internal.ByteCompanionObject;
import org.tukaani.xz.check.Check;
import org.tukaani.xz.common.DecoderUtil;

/* loaded from: classes24.dex */
class BlockInputStream extends InputStream {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private final Check check;
    private long compressedSizeInHeader;
    private long compressedSizeLimit;
    private InputStream filterChain;
    private final int headerSize;
    private final CountingInputStream inCounted;
    private final DataInputStream inData;
    private long uncompressedSizeInHeader;
    private final boolean verifyCheck;
    private long uncompressedSize = 0;
    private boolean endReached = false;
    private final byte[] tempBuf = new byte[1];

    public BlockInputStream(InputStream inputStream, Check check, boolean z, int i, long j, long j2, ArrayCache arrayCache) throws IndexIndicatorException, IOException {
        char c;
        this.uncompressedSizeInHeader = -1L;
        this.compressedSizeInHeader = -1L;
        this.check = check;
        this.verifyCheck = z;
        this.inData = new DataInputStream(inputStream);
        int unsignedByte = this.inData.readUnsignedByte();
        if (unsignedByte == 0) {
            throw new IndexIndicatorException();
        }
        this.headerSize = (unsignedByte + 1) * 4;
        byte[] bArr = new byte[this.headerSize];
        bArr[0] = (byte) unsignedByte;
        this.inData.readFully(bArr, 1, this.headerSize - 1);
        if (!DecoderUtil.isCRC32Valid(bArr, 0, this.headerSize - 4, this.headerSize - 4)) {
            throw new CorruptedInputException("XZ Block Header is corrupt");
        }
        if ((bArr[1] & 60) != 0) {
            throw new UnsupportedOptionsException("Unsupported options in XZ Block Header");
        }
        int i2 = (bArr[1] & 3) + 1;
        long[] jArr = new long[i2];
        byte[][] bArr2 = new byte[i2][];
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr, 2, this.headerSize - 6);
        try {
            this.compressedSizeLimit = (9223372036854775804L - this.headerSize) - check.getSize();
            if ((bArr[1] & 64) != 0) {
                this.compressedSizeInHeader = DecoderUtil.decodeVLI(byteArrayInputStream);
                if (this.compressedSizeInHeader != 0) {
                    c = 1;
                    if (this.compressedSizeInHeader <= this.compressedSizeLimit) {
                        this.compressedSizeLimit = this.compressedSizeInHeader;
                    }
                }
                throw new CorruptedInputException();
            }
            c = 1;
            if ((bArr[c] & ByteCompanionObject.MIN_VALUE) != 0) {
                this.uncompressedSizeInHeader = DecoderUtil.decodeVLI(byteArrayInputStream);
            }
            int i3 = 0;
            while (i3 < i2) {
                jArr[i3] = DecoderUtil.decodeVLI(byteArrayInputStream);
                long jDecodeVLI = DecoderUtil.decodeVLI(byteArrayInputStream);
                long[] jArr2 = jArr;
                byte[][] bArr3 = bArr2;
                if (jDecodeVLI > byteArrayInputStream.available()) {
                    throw new CorruptedInputException();
                }
                bArr3[i3] = new byte[(int) jDecodeVLI];
                byteArrayInputStream.read(bArr3[i3]);
                i3++;
                jArr = jArr2;
                bArr2 = bArr3;
            }
            long[] jArr3 = jArr;
            byte[][] bArr4 = bArr2;
            for (int iAvailable = byteArrayInputStream.available(); iAvailable > 0; iAvailable--) {
                if (byteArrayInputStream.read() != 0) {
                    throw new UnsupportedOptionsException("Unsupported options in XZ Block Header");
                }
            }
            if (j != -1) {
                long size = this.headerSize + check.getSize();
                if (size >= j) {
                    throw new CorruptedInputException("XZ Index does not match a Block Header");
                }
                long j3 = j - size;
                if (j3 > this.compressedSizeLimit || !(this.compressedSizeInHeader == -1 || this.compressedSizeInHeader == j3)) {
                    throw new CorruptedInputException("XZ Index does not match a Block Header");
                }
                if (this.uncompressedSizeInHeader != -1 && this.uncompressedSizeInHeader != j2) {
                    throw new CorruptedInputException("XZ Index does not match a Block Header");
                }
                this.compressedSizeLimit = j3;
                this.compressedSizeInHeader = j3;
                this.uncompressedSizeInHeader = j2;
            }
            FilterDecoder[] filterDecoderArr = new FilterDecoder[i2];
            for (int i4 = 0; i4 < i2; i4++) {
                if (jArr3[i4] == 33) {
                    filterDecoderArr[i4] = new LZMA2Decoder(bArr4[i4]);
                } else if (jArr3[i4] == 3) {
                    filterDecoderArr[i4] = new DeltaDecoder(bArr4[i4]);
                } else {
                    if (!BCJDecoder.isBCJFilterID(jArr3[i4])) {
                        throw new UnsupportedOptionsException("Unknown Filter ID " + jArr3[i4]);
                    }
                    filterDecoderArr[i4] = new BCJDecoder(jArr3[i4], bArr4[i4]);
                }
            }
            RawCoder.validate(filterDecoderArr);
            if (i >= 0) {
                int memoryUsage = 0;
                for (int i5 = 0; i5 < i2; i5++) {
                    memoryUsage += filterDecoderArr[i5].getMemoryUsage();
                }
                if (memoryUsage > i) {
                    throw new MemoryLimitException(memoryUsage, i);
                }
            }
            this.inCounted = new CountingInputStream(inputStream);
            this.filterChain = this.inCounted;
            for (int i6 = i2 - 1; i6 >= 0; i6--) {
                this.filterChain = filterDecoderArr[i6].getInputStream(this.filterChain, arrayCache);
            }
        } catch (IOException e) {
            throw new CorruptedInputException("XZ Block Header is corrupt");
        }
    }

    private void validate() throws IOException {
        long size = this.inCounted.getSize();
        if ((this.compressedSizeInHeader != -1 && this.compressedSizeInHeader != size) || (this.uncompressedSizeInHeader != -1 && this.uncompressedSizeInHeader != this.uncompressedSize)) {
            throw new CorruptedInputException();
        }
        while (true) {
            long j = 1 + size;
            if ((size & 3) == 0) {
                byte[] bArr = new byte[this.check.getSize()];
                this.inData.readFully(bArr);
                if (this.verifyCheck && !Arrays.equals(this.check.finish(), bArr)) {
                    throw new CorruptedInputException("Integrity check (" + this.check.getName() + ") does not match");
                }
                return;
            }
            if (this.inData.readUnsignedByte() != 0) {
                throw new CorruptedInputException();
            }
            size = j;
        }
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        return this.filterChain.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            this.filterChain.close();
            this.filterChain = null;
        } catch (IOException e) {
            throw new AssertionError();
        }
    }

    public long getUncompressedSize() {
        return this.uncompressedSize;
    }

    public long getUnpaddedSize() {
        return this.headerSize + this.inCounted.getSize() + this.check.getSize();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (read(this.tempBuf, 0, 1) == -1) {
            return -1;
        }
        return this.tempBuf[0] & UByte.MAX_VALUE;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (this.endReached) {
            return -1;
        }
        int i3 = this.filterChain.read(bArr, i, i2);
        if (i3 > 0) {
            if (this.verifyCheck) {
                this.check.update(bArr, i, i3);
            }
            this.uncompressedSize += i3;
            long size = this.inCounted.getSize();
            if (size < 0 || size > this.compressedSizeLimit || this.uncompressedSize < 0 || (this.uncompressedSizeInHeader != -1 && this.uncompressedSize > this.uncompressedSizeInHeader)) {
                throw new CorruptedInputException();
            }
            if (i3 < i2 || this.uncompressedSize == this.uncompressedSizeInHeader) {
                if (this.filterChain.read() != -1) {
                    throw new CorruptedInputException();
                }
                validate();
                this.endReached = true;
            }
        } else if (i3 == -1) {
            validate();
            this.endReached = true;
        }
        return i3;
    }
}
