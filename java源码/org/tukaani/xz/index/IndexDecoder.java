package org.tukaani.xz.index;

import androidx.collection.SieveCacheKt;
import java.io.EOFException;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.CheckedInputStream;
import org.tukaani.xz.CorruptedInputException;
import org.tukaani.xz.MemoryLimitException;
import org.tukaani.xz.SeekableInputStream;
import org.tukaani.xz.UnsupportedOptionsException;
import org.tukaani.xz.common.DecoderUtil;
import org.tukaani.xz.common.StreamFlags;

/* loaded from: classes24.dex */
public class IndexDecoder extends IndexBase {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private long compressedOffset;
    private long largestBlockSize;
    private final int memoryUsage;
    private int recordOffset;
    private final StreamFlags streamFlags;
    private final long streamPadding;
    private final long[] uncompressed;
    private long uncompressedOffset;
    private final long[] unpadded;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IndexDecoder(SeekableInputStream seekableInputStream, StreamFlags streamFlags, long j, int i) throws IOException {
        long jDecodeVLI;
        super(new CorruptedInputException("XZ Index is corrupt"));
        String str = "XZ Index is corrupt";
        this.largestBlockSize = 0L;
        this.recordOffset = 0;
        this.compressedOffset = 0L;
        this.uncompressedOffset = 0L;
        this.streamFlags = streamFlags;
        this.streamPadding = j;
        long jPosition = (seekableInputStream.position() + streamFlags.backwardSize) - 4;
        CRC32 crc32 = new CRC32();
        CheckedInputStream checkedInputStream = new CheckedInputStream(seekableInputStream, crc32);
        if (checkedInputStream.read() != 0) {
            throw new CorruptedInputException("XZ Index is corrupt");
        }
        try {
            jDecodeVLI = DecoderUtil.decodeVLI(checkedInputStream);
        } catch (EOFException e) {
        }
        try {
            if (jDecodeVLI >= streamFlags.backwardSize / 2) {
                throw new CorruptedInputException("XZ Index is corrupt");
            }
            if (jDecodeVLI > SieveCacheKt.NodeLinkMask) {
                throw new UnsupportedOptionsException("XZ Index has over 2147483647 Records");
            }
            this.memoryUsage = ((int) (((16 * jDecodeVLI) + 1023) / 1024)) + 1;
            if (i >= 0 && this.memoryUsage > i) {
                throw new MemoryLimitException(this.memoryUsage, i);
            }
            int i2 = (int) jDecodeVLI;
            this.unpadded = new long[i2];
            this.uncompressed = new long[i2];
            int i3 = 0;
            while (i2 > 0) {
                long jDecodeVLI2 = DecoderUtil.decodeVLI(checkedInputStream);
                long jDecodeVLI3 = DecoderUtil.decodeVLI(checkedInputStream);
                if (seekableInputStream.position() > jPosition) {
                    throw new CorruptedInputException(str);
                }
                String str2 = str;
                this.unpadded[i3] = this.blocksSum + jDecodeVLI2;
                int i4 = i3;
                this.uncompressed[i4] = this.uncompressedSum + jDecodeVLI3;
                i3 = i4 + 1;
                super.add(jDecodeVLI2, jDecodeVLI3);
                if (i3 != this.recordCount) {
                    throw new AssertionError();
                }
                if (this.largestBlockSize < jDecodeVLI3) {
                    this.largestBlockSize = jDecodeVLI3;
                }
                i2--;
                str = str2;
            }
            String str3 = str;
            int indexPaddingSize = getIndexPaddingSize();
            if (seekableInputStream.position() + indexPaddingSize != jPosition) {
                throw new CorruptedInputException(str3);
            }
            while (true) {
                int i5 = indexPaddingSize - 1;
                if (indexPaddingSize <= 0) {
                    long value = crc32.getValue();
                    for (int i6 = 0; i6 < 4; i6++) {
                        if (((value >>> (i6 * 8)) & 255) != seekableInputStream.read()) {
                            throw new CorruptedInputException(str3);
                        }
                    }
                    return;
                }
                if (checkedInputStream.read() != 0) {
                    throw new CorruptedInputException(str3);
                }
                indexPaddingSize = i5;
            }
        } catch (EOFException e2) {
            throw new CorruptedInputException("XZ Index is corrupt");
        }
    }

    @Override // org.tukaani.xz.index.IndexBase
    public /* bridge */ /* synthetic */ long getIndexSize() {
        return super.getIndexSize();
    }

    public long getLargestBlockSize() {
        return this.largestBlockSize;
    }

    public int getMemoryUsage() {
        return this.memoryUsage;
    }

    public int getRecordCount() {
        return (int) this.recordCount;
    }

    public StreamFlags getStreamFlags() {
        return this.streamFlags;
    }

    @Override // org.tukaani.xz.index.IndexBase
    public /* bridge */ /* synthetic */ long getStreamSize() {
        return super.getStreamSize();
    }

    public long getUncompressedSize() {
        return this.uncompressedSum;
    }

    public boolean hasRecord(int i) {
        return i >= this.recordOffset && ((long) i) < ((long) this.recordOffset) + this.recordCount;
    }

    public boolean hasUncompressedOffset(long j) {
        return j >= this.uncompressedOffset && j < this.uncompressedOffset + this.uncompressedSum;
    }

    public void locateBlock(BlockInfo blockInfo, long j) {
        if (j < this.uncompressedOffset) {
            throw new AssertionError();
        }
        long j2 = j - this.uncompressedOffset;
        if (j2 >= this.uncompressedSum) {
            throw new AssertionError();
        }
        int length = this.unpadded.length - 1;
        int i = 0;
        while (i < length) {
            int i2 = ((length - i) / 2) + i;
            if (this.uncompressed[i2] <= j2) {
                i = i2 + 1;
            } else {
                length = i2;
            }
        }
        setBlockInfo(blockInfo, this.recordOffset + i);
    }

    public void setBlockInfo(BlockInfo blockInfo, int i) {
        if (i < this.recordOffset) {
            throw new AssertionError();
        }
        if (i - this.recordOffset >= this.recordCount) {
            throw new AssertionError();
        }
        blockInfo.index = this;
        blockInfo.blockNumber = i;
        int i2 = i - this.recordOffset;
        if (i2 == 0) {
            blockInfo.compressedOffset = 0L;
            blockInfo.uncompressedOffset = 0L;
        } else {
            int i3 = i2 - 1;
            blockInfo.compressedOffset = (this.unpadded[i3] + 3) & (-4);
            blockInfo.uncompressedOffset = this.uncompressed[i3];
        }
        blockInfo.unpaddedSize = this.unpadded[i2] - blockInfo.compressedOffset;
        blockInfo.uncompressedSize = this.uncompressed[i2] - blockInfo.uncompressedOffset;
        blockInfo.compressedOffset += this.compressedOffset + 12;
        blockInfo.uncompressedOffset += this.uncompressedOffset;
    }

    public void setOffsets(IndexDecoder indexDecoder) {
        this.recordOffset = indexDecoder.recordOffset + ((int) indexDecoder.recordCount);
        this.compressedOffset = indexDecoder.compressedOffset + indexDecoder.getStreamSize() + indexDecoder.streamPadding;
        if ((this.compressedOffset & 3) != 0) {
            throw new AssertionError();
        }
        this.uncompressedOffset = indexDecoder.uncompressedOffset + indexDecoder.uncompressedSum;
    }
}
