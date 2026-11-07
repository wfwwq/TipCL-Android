package org.tukaani.xz;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.UByte;
import org.tukaani.xz.check.Check;
import org.tukaani.xz.common.DecoderUtil;
import org.tukaani.xz.common.StreamFlags;
import org.tukaani.xz.index.BlockInfo;
import org.tukaani.xz.index.IndexDecoder;

/* loaded from: classes24.dex */
public class SeekableXZInputStream extends SeekableInputStream {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private final ArrayCache arrayCache;
    private int blockCount;
    private BlockInputStream blockDecoder;
    private Check check;
    private int checkTypes;
    private final BlockInfo curBlockInfo;
    private long curPos;
    private boolean endReached;
    private IOException exception;
    private SeekableInputStream in;
    private int indexMemoryUsage;
    private long largestBlockSize;
    private final int memoryLimit;
    private final BlockInfo queriedBlockInfo;
    private boolean seekNeeded;
    private long seekPos;
    private final ArrayList<IndexDecoder> streams;
    private final byte[] tempBuf;
    private long uncompressedSize;
    private final boolean verifyCheck;

    public SeekableXZInputStream(SeekableInputStream seekableInputStream) throws IOException {
        this(seekableInputStream, -1);
    }

    public SeekableXZInputStream(SeekableInputStream seekableInputStream, int i) throws IOException {
        this(seekableInputStream, i, true);
    }

    public SeekableXZInputStream(SeekableInputStream seekableInputStream, int i, ArrayCache arrayCache) throws IOException {
        this(seekableInputStream, i, true, arrayCache);
    }

    public SeekableXZInputStream(SeekableInputStream seekableInputStream, int i, boolean z) throws IOException {
        this(seekableInputStream, i, z, ArrayCache.getDefaultCache());
    }

    public SeekableXZInputStream(SeekableInputStream seekableInputStream, int i, boolean z, ArrayCache arrayCache) throws IOException {
        this.indexMemoryUsage = 0;
        this.streams = new ArrayList<>();
        this.checkTypes = 0;
        long j = 0;
        this.uncompressedSize = 0L;
        this.largestBlockSize = 0L;
        this.blockCount = 0;
        this.blockDecoder = null;
        this.curPos = 0L;
        this.seekNeeded = false;
        this.endReached = false;
        this.exception = null;
        this.tempBuf = new byte[1];
        this.arrayCache = arrayCache;
        this.verifyCheck = z;
        this.in = seekableInputStream;
        DataInputStream dataInputStream = new DataInputStream(seekableInputStream);
        seekableInputStream.seek(0L);
        byte[] bArr = new byte[XZ.HEADER_MAGIC.length];
        dataInputStream.readFully(bArr);
        if (!Arrays.equals(bArr, XZ.HEADER_MAGIC)) {
            throw new XZFormatException();
        }
        long length = seekableInputStream.length();
        if ((3 & length) != 0) {
            throw new CorruptedInputException("XZ file size is not a multiple of 4 bytes");
        }
        byte[] bArr2 = new byte[12];
        int memoryUsage = i;
        while (true) {
            long j2 = j;
            while (length > j) {
                if (length < 12) {
                    throw new CorruptedInputException();
                }
                long j3 = j;
                long j4 = length - 12;
                seekableInputStream.seek(j4);
                dataInputStream.readFully(bArr2);
                if (bArr2[8] == 0 && bArr2[9] == 0 && bArr2[10] == 0 && bArr2[11] == 0) {
                    j2 += 4;
                    length -= 4;
                    j = j3;
                } else {
                    StreamFlags streamFlagsDecodeStreamFooter = DecoderUtil.decodeStreamFooter(bArr2);
                    if (streamFlagsDecodeStreamFooter.backwardSize >= j4) {
                        throw new CorruptedInputException("Backward Size in XZ Stream Footer is too big");
                    }
                    this.check = Check.getInstance(streamFlagsDecodeStreamFooter.checkType);
                    this.checkTypes |= 1 << streamFlagsDecodeStreamFooter.checkType;
                    seekableInputStream.seek(j4 - streamFlagsDecodeStreamFooter.backwardSize);
                    try {
                        IndexDecoder indexDecoder = new IndexDecoder(seekableInputStream, streamFlagsDecodeStreamFooter, j2, memoryUsage);
                        this.indexMemoryUsage += indexDecoder.getMemoryUsage();
                        if (memoryUsage >= 0 && (memoryUsage = memoryUsage - indexDecoder.getMemoryUsage()) < 0) {
                            throw new AssertionError();
                        }
                        if (this.largestBlockSize < indexDecoder.getLargestBlockSize()) {
                            this.largestBlockSize = indexDecoder.getLargestBlockSize();
                        }
                        long streamSize = indexDecoder.getStreamSize() - 12;
                        if (j4 < streamSize) {
                            throw new CorruptedInputException("XZ Index indicates too big compressed size for the XZ Stream");
                        }
                        long j5 = j4 - streamSize;
                        seekableInputStream.seek(j5);
                        dataInputStream.readFully(bArr2);
                        if (!DecoderUtil.areStreamFlagsEqual(DecoderUtil.decodeStreamHeader(bArr2), streamFlagsDecodeStreamFooter)) {
                            throw new CorruptedInputException("XZ Stream Footer does not match Stream Header");
                        }
                        this.uncompressedSize += indexDecoder.getUncompressedSize();
                        if (this.uncompressedSize < j3) {
                            throw new UnsupportedOptionsException("XZ file is too big");
                        }
                        this.blockCount += indexDecoder.getRecordCount();
                        if (this.blockCount < 0) {
                            throw new UnsupportedOptionsException("XZ file has over 2147483647 Blocks");
                        }
                        this.streams.add(indexDecoder);
                        length = j5;
                        j = j3;
                    } catch (MemoryLimitException e) {
                        if (memoryUsage >= 0) {
                            throw new MemoryLimitException(e.getMemoryNeeded() + this.indexMemoryUsage, memoryUsage + this.indexMemoryUsage);
                        }
                        throw new AssertionError();
                    }
                }
            }
            if (length != j) {
                throw new AssertionError();
            }
            this.memoryLimit = memoryUsage;
            IndexDecoder indexDecoder2 = this.streams.get(this.streams.size() - 1);
            int size = this.streams.size() - 2;
            while (size >= 0) {
                IndexDecoder indexDecoder3 = this.streams.get(size);
                indexDecoder3.setOffsets(indexDecoder2);
                size--;
                indexDecoder2 = indexDecoder3;
            }
            IndexDecoder indexDecoder4 = this.streams.get(this.streams.size() - 1);
            this.curBlockInfo = new BlockInfo(indexDecoder4);
            this.queriedBlockInfo = new BlockInfo(indexDecoder4);
            return;
        }
    }

    public SeekableXZInputStream(SeekableInputStream seekableInputStream, ArrayCache arrayCache) throws IOException {
        this(seekableInputStream, -1, arrayCache);
    }

    private void initBlockDecoder() throws IOException {
        try {
            if (this.blockDecoder != null) {
                this.blockDecoder.close();
                this.blockDecoder = null;
            }
            this.blockDecoder = new BlockInputStream(this.in, this.check, this.verifyCheck, this.memoryLimit, this.curBlockInfo.unpaddedSize, this.curBlockInfo.uncompressedSize, this.arrayCache);
        } catch (IndexIndicatorException e) {
            throw new CorruptedInputException();
        } catch (MemoryLimitException e2) {
            if (this.memoryLimit >= 0) {
                throw new MemoryLimitException(e2.getMemoryNeeded() + this.indexMemoryUsage, this.memoryLimit + this.indexMemoryUsage);
            }
            throw new AssertionError();
        }
    }

    private void locateBlockByNumber(BlockInfo blockInfo, int i) {
        if (i < 0 || i >= this.blockCount) {
            throw new IndexOutOfBoundsException("Invalid XZ Block number: " + i);
        }
        if (blockInfo.blockNumber == i) {
            return;
        }
        int i2 = 0;
        while (true) {
            IndexDecoder indexDecoder = this.streams.get(i2);
            if (indexDecoder.hasRecord(i)) {
                indexDecoder.setBlockInfo(blockInfo, i);
                return;
            }
            i2++;
        }
    }

    private void locateBlockByPos(BlockInfo blockInfo, long j) {
        IndexDecoder indexDecoder;
        if (j < 0 || j >= this.uncompressedSize) {
            throw new IndexOutOfBoundsException("Invalid uncompressed position: " + j);
        }
        int i = 0;
        while (true) {
            indexDecoder = this.streams.get(i);
            if (indexDecoder.hasUncompressedOffset(j)) {
                break;
            } else {
                i++;
            }
        }
        indexDecoder.locateBlock(blockInfo, j);
        if ((blockInfo.compressedOffset & 3) != 0) {
            throw new AssertionError();
        }
        if (blockInfo.uncompressedSize <= 0) {
            throw new AssertionError();
        }
        if (j < blockInfo.uncompressedOffset) {
            throw new AssertionError();
        }
        if (j >= blockInfo.uncompressedOffset + blockInfo.uncompressedSize) {
            throw new AssertionError();
        }
    }

    private void seek() throws IOException {
        if (!this.seekNeeded) {
            if (this.curBlockInfo.hasNext()) {
                this.curBlockInfo.setNext();
                initBlockDecoder();
                return;
            }
            this.seekPos = this.curPos;
        }
        this.seekNeeded = false;
        if (this.seekPos >= this.uncompressedSize) {
            this.curPos = this.seekPos;
            if (this.blockDecoder != null) {
                this.blockDecoder.close();
                this.blockDecoder = null;
            }
            this.endReached = true;
            return;
        }
        this.endReached = false;
        locateBlockByPos(this.curBlockInfo, this.seekPos);
        if (this.curPos <= this.curBlockInfo.uncompressedOffset || this.curPos > this.seekPos) {
            this.in.seek(this.curBlockInfo.compressedOffset);
            this.check = Check.getInstance(this.curBlockInfo.getCheckType());
            initBlockDecoder();
            this.curPos = this.curBlockInfo.uncompressedOffset;
        }
        if (this.seekPos > this.curPos) {
            long j = this.seekPos - this.curPos;
            if (this.blockDecoder.skip(j) != j) {
                throw new CorruptedInputException();
            }
            this.curPos = this.seekPos;
        }
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        if (this.in == null) {
            throw new XZIOException("Stream closed");
        }
        if (this.exception != null) {
            throw this.exception;
        }
        if (this.endReached || this.seekNeeded || this.blockDecoder == null) {
            return 0;
        }
        return this.blockDecoder.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        close(true);
    }

    public void close(boolean z) throws IOException {
        if (this.in != null) {
            if (this.blockDecoder != null) {
                this.blockDecoder.close();
                this.blockDecoder = null;
            }
            if (z) {
                try {
                    this.in.close();
                } finally {
                    this.in = null;
                }
            }
        }
    }

    public int getBlockCheckType(int i) {
        locateBlockByNumber(this.queriedBlockInfo, i);
        return this.queriedBlockInfo.getCheckType();
    }

    public long getBlockCompPos(int i) {
        locateBlockByNumber(this.queriedBlockInfo, i);
        return this.queriedBlockInfo.compressedOffset;
    }

    public long getBlockCompSize(int i) {
        locateBlockByNumber(this.queriedBlockInfo, i);
        return (this.queriedBlockInfo.unpaddedSize + 3) & (-4);
    }

    public int getBlockCount() {
        return this.blockCount;
    }

    public int getBlockNumber(long j) {
        locateBlockByPos(this.queriedBlockInfo, j);
        return this.queriedBlockInfo.blockNumber;
    }

    public long getBlockPos(int i) {
        locateBlockByNumber(this.queriedBlockInfo, i);
        return this.queriedBlockInfo.uncompressedOffset;
    }

    public long getBlockSize(int i) {
        locateBlockByNumber(this.queriedBlockInfo, i);
        return this.queriedBlockInfo.uncompressedSize;
    }

    public int getCheckTypes() {
        return this.checkTypes;
    }

    public int getIndexMemoryUsage() {
        return this.indexMemoryUsage;
    }

    public long getLargestBlockSize() {
        return this.largestBlockSize;
    }

    public int getStreamCount() {
        return this.streams.size();
    }

    @Override // org.tukaani.xz.SeekableInputStream
    public long length() {
        return this.uncompressedSize;
    }

    @Override // org.tukaani.xz.SeekableInputStream
    public long position() throws IOException {
        if (this.in != null) {
            return this.seekNeeded ? this.seekPos : this.curPos;
        }
        throw new XZIOException("Stream closed");
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
        int i3;
        if (i < 0 || i2 < 0 || (i3 = i + i2) < 0 || i3 > bArr.length) {
            throw new IndexOutOfBoundsException();
        }
        int i4 = 0;
        if (i2 == 0) {
            return 0;
        }
        if (this.in == null) {
            throw new XZIOException("Stream closed");
        }
        if (this.exception != null) {
            throw this.exception;
        }
        try {
            if (this.seekNeeded) {
                seek();
            }
        } catch (IOException e) {
            e = e;
            if (e instanceof EOFException) {
                e = new CorruptedInputException();
            }
            this.exception = e;
            if (i4 == 0) {
                throw e;
            }
        }
        if (this.endReached) {
            return -1;
        }
        while (i2 > 0) {
            if (this.blockDecoder == null) {
                seek();
                if (this.endReached) {
                    break;
                }
            }
            int i5 = this.blockDecoder.read(bArr, i, i2);
            if (i5 > 0) {
                this.curPos += i5;
                i4 += i5;
                i += i5;
                i2 -= i5;
            } else if (i5 == -1) {
                this.blockDecoder = null;
            }
        }
        return i4;
    }

    @Override // org.tukaani.xz.SeekableInputStream
    public void seek(long j) throws IOException {
        if (this.in == null) {
            throw new XZIOException("Stream closed");
        }
        if (j < 0) {
            throw new XZIOException("Negative seek position: " + j);
        }
        this.seekPos = j;
        this.seekNeeded = true;
    }

    public void seekToBlock(int i) throws IOException {
        if (this.in == null) {
            throw new XZIOException("Stream closed");
        }
        if (i < 0 || i >= this.blockCount) {
            throw new XZIOException("Invalid XZ Block number: " + i);
        }
        this.seekPos = getBlockPos(i);
        this.seekNeeded = true;
    }
}
