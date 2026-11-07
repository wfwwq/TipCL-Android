package org.apache.commons.compress.compressors.lz4;

import androidx.collection.SieveCacheKt;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.zip.CheckedInputStream;
import kotlin.UByte;
import org.apache.commons.compress.archivers.tar.TarConstants;
import org.apache.commons.compress.compressors.CompressorInputStream;
import org.apache.commons.compress.utils.BoundedInputStream;
import org.apache.commons.compress.utils.ByteUtils;
import org.apache.commons.compress.utils.IOUtils;
import org.apache.commons.compress.utils.InputStreamStatistics;
import org.apache.commons.io.input.CountingInputStream;

/* loaded from: classes24.dex */
public class FramedLZ4CompressorInputStream extends CompressorInputStream implements InputStreamStatistics {
    static final int BLOCK_CHECKSUM_MASK = 16;
    static final int BLOCK_INDEPENDENCE_MASK = 32;
    static final int BLOCK_MAX_SIZE_MASK = 112;
    static final int CONTENT_CHECKSUM_MASK = 4;
    static final int CONTENT_SIZE_MASK = 8;
    private static final byte SKIPPABLE_FRAME_PREFIX_BYTE_MASK = 80;
    static final int SUPPORTED_VERSION = 64;
    static final int UNCOMPRESSED_FLAG_MASK = Integer.MIN_VALUE;
    static final int VERSION_MASK = 192;
    private byte[] blockDependencyBuffer;
    private final org.apache.commons.codec.digest.XXHash32 blockHash;
    private final org.apache.commons.codec.digest.XXHash32 contentHash;
    private InputStream currentBlock;
    private final boolean decompressConcatenated;
    private boolean endReached;
    private boolean expectBlockChecksum;
    private boolean expectBlockDependency;
    private boolean expectContentChecksum;
    private boolean expectContentSize;
    private boolean inUncompressed;
    private final CountingInputStream inputStream;
    private final byte[] oneByte;
    private final ByteUtils.ByteSupplier supplier;
    static final byte[] LZ4_SIGNATURE = {4, 34, TarConstants.LF_MULTIVOLUME, 24};
    private static final byte[] SKIPPABLE_FRAME_TRAILER = {42, TarConstants.LF_MULTIVOLUME, 24};

    private static boolean isSkippableFrameSignature(byte[] b) {
        if ((b[0] & SKIPPABLE_FRAME_PREFIX_BYTE_MASK) != 80) {
            return false;
        }
        for (int i = 1; i < 4; i++) {
            if (b[i] != SKIPPABLE_FRAME_TRAILER[i - 1]) {
                return false;
            }
        }
        return true;
    }

    public static boolean matches(byte[] signature, int length) {
        if (length < LZ4_SIGNATURE.length) {
            return false;
        }
        byte[] shortenedSig = signature;
        if (signature.length > LZ4_SIGNATURE.length) {
            shortenedSig = Arrays.copyOf(signature, LZ4_SIGNATURE.length);
        }
        return Arrays.equals(shortenedSig, LZ4_SIGNATURE);
    }

    public FramedLZ4CompressorInputStream(InputStream in) throws IOException {
        this(in, false);
    }

    public FramedLZ4CompressorInputStream(InputStream in, boolean decompressConcatenated) throws IOException {
        this.oneByte = new byte[1];
        this.supplier = new ByteUtils.ByteSupplier() { // from class: org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorInputStream$$ExternalSyntheticLambda0
            @Override // org.apache.commons.compress.utils.ByteUtils.ByteSupplier
            public final int getAsByte() {
                return this.f$0.readOneByte();
            }
        };
        this.contentHash = new org.apache.commons.codec.digest.XXHash32();
        this.blockHash = new org.apache.commons.codec.digest.XXHash32();
        this.inputStream = new CountingInputStream(in);
        this.decompressConcatenated = decompressConcatenated;
        init(true);
    }

    private void appendToBlockDependencyBuffer(byte[] b, int off, int len) {
        int len2 = Math.min(len, this.blockDependencyBuffer.length);
        if (len2 > 0) {
            int keep = this.blockDependencyBuffer.length - len2;
            if (keep > 0) {
                System.arraycopy(this.blockDependencyBuffer, len2, this.blockDependencyBuffer, 0, keep);
            }
            System.arraycopy(b, off, this.blockDependencyBuffer, keep, len2);
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        try {
            if (this.currentBlock != null) {
                this.currentBlock.close();
                this.currentBlock = null;
            }
        } finally {
            this.inputStream.close();
        }
    }

    @Override // org.apache.commons.compress.utils.InputStreamStatistics
    public long getCompressedCount() {
        return this.inputStream.getByteCount();
    }

    private void init(boolean firstFrame) throws IOException {
        if (readSignature(firstFrame)) {
            readFrameDescriptor();
            nextBlock();
        }
    }

    private void maybeFinishCurrentBlock() throws IOException {
        if (this.currentBlock != null) {
            this.currentBlock.close();
            this.currentBlock = null;
            if (this.expectBlockChecksum) {
                verifyChecksum(this.blockHash, "block");
                this.blockHash.reset();
            }
        }
    }

    private void nextBlock() throws IOException {
        maybeFinishCurrentBlock();
        long len = ByteUtils.fromLittleEndian(this.supplier, 4);
        boolean uncompressed = (SieveCacheKt.NodeMetaAndPreviousMask & len) != 0;
        int realLen = (int) (SieveCacheKt.NodeLinkMask & len);
        if (realLen == 0) {
            verifyContentChecksum();
            if (!this.decompressConcatenated) {
                this.endReached = true;
                return;
            } else {
                init(false);
                return;
            }
        }
        InputStream capped = new BoundedInputStream(this.inputStream, realLen);
        if (this.expectBlockChecksum) {
            capped = new CheckedInputStream(capped, this.blockHash);
        }
        if (uncompressed) {
            this.inUncompressed = true;
            this.currentBlock = capped;
            return;
        }
        this.inUncompressed = false;
        BlockLZ4CompressorInputStream s = new BlockLZ4CompressorInputStream(capped);
        if (this.expectBlockDependency) {
            s.prefill(this.blockDependencyBuffer);
        }
        this.currentBlock = s;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (read(this.oneByte, 0, 1) == -1) {
            return -1;
        }
        return this.oneByte[0] & UByte.MAX_VALUE;
    }

    @Override // java.io.InputStream
    public int read(byte[] b, int off, int len) throws IOException {
        if (len == 0) {
            return 0;
        }
        if (this.endReached) {
            return -1;
        }
        int r = readOnce(b, off, len);
        if (r == -1) {
            nextBlock();
            if (!this.endReached) {
                r = readOnce(b, off, len);
            }
        }
        if (r != -1) {
            if (this.expectBlockDependency) {
                appendToBlockDependencyBuffer(b, off, r);
            }
            if (this.expectContentChecksum) {
                this.contentHash.update(b, off, r);
            }
        }
        return r;
    }

    private void readFrameDescriptor() throws IOException {
        int flags = readOneByte();
        if (flags == -1) {
            throw new IOException("Premature end of stream while reading frame flags");
        }
        this.contentHash.update(flags);
        if ((flags & 192) != 64) {
            throw new IOException("Unsupported version " + (flags >> 6));
        }
        this.expectBlockDependency = (flags & 32) == 0;
        if (this.expectBlockDependency) {
            if (this.blockDependencyBuffer == null) {
                this.blockDependencyBuffer = new byte[65536];
            }
        } else {
            this.blockDependencyBuffer = null;
        }
        this.expectBlockChecksum = (flags & 16) != 0;
        this.expectContentSize = (flags & 8) != 0;
        this.expectContentChecksum = (flags & 4) != 0;
        int bdByte = readOneByte();
        if (bdByte == -1) {
            throw new IOException("Premature end of stream while reading frame BD byte");
        }
        this.contentHash.update(bdByte);
        if (this.expectContentSize) {
            byte[] contentSize = new byte[8];
            int skipped = IOUtils.readFully(this.inputStream, contentSize);
            count(skipped);
            if (8 != skipped) {
                throw new IOException("Premature end of stream while reading content size");
            }
            this.contentHash.update(contentSize, 0, contentSize.length);
        }
        int headerHash = readOneByte();
        if (headerHash == -1) {
            throw new IOException("Premature end of stream while reading frame header checksum");
        }
        int expectedHash = (int) ((this.contentHash.getValue() >> 8) & 255);
        this.contentHash.reset();
        if (headerHash != expectedHash) {
            throw new IOException("Frame header checksum mismatch");
        }
    }

    private int readOnce(byte[] b, int off, int len) throws IOException {
        if (this.inUncompressed) {
            int cnt = this.currentBlock.read(b, off, len);
            count(cnt);
            return cnt;
        }
        BlockLZ4CompressorInputStream l = (BlockLZ4CompressorInputStream) this.currentBlock;
        long before = l.getBytesRead();
        int cnt2 = this.currentBlock.read(b, off, len);
        count(l.getBytesRead() - before);
        return cnt2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int readOneByte() throws IOException {
        int b = this.inputStream.read();
        if (b == -1) {
            return -1;
        }
        count(1);
        return b & 255;
    }

    private boolean readSignature(boolean firstFrame) throws IOException {
        String garbageMessage = firstFrame ? "Not a LZ4 frame stream" : "LZ4 frame stream followed by garbage";
        byte[] b = new byte[4];
        int read = IOUtils.readFully(this.inputStream, b);
        count(read);
        if (read == 0 && !firstFrame) {
            this.endReached = true;
            return false;
        }
        if (4 != read) {
            throw new IOException(garbageMessage);
        }
        int read2 = skipSkippableFrame(b);
        if (read2 == 0 && !firstFrame) {
            this.endReached = true;
            return false;
        }
        if (4 == read2 && matches(b, 4)) {
            return true;
        }
        throw new IOException(garbageMessage);
    }

    private int skipSkippableFrame(byte[] b) throws IOException {
        int read = 4;
        while (read == 4 && isSkippableFrameSignature(b)) {
            long len = ByteUtils.fromLittleEndian(this.supplier, 4);
            if (len < 0) {
                throw new IOException("Found illegal skippable frame with negative size");
            }
            long skipped = org.apache.commons.io.IOUtils.skip(this.inputStream, len);
            count(skipped);
            if (len != skipped) {
                throw new IOException("Premature end of stream while skipping frame");
            }
            read = IOUtils.readFully(this.inputStream, b);
            count(read);
        }
        return read;
    }

    private void verifyChecksum(org.apache.commons.codec.digest.XXHash32 hash, String kind) throws IOException {
        byte[] checksum = new byte[4];
        int read = IOUtils.readFully(this.inputStream, checksum);
        count(read);
        if (4 != read) {
            throw new IOException("Premature end of stream while reading " + kind + " checksum");
        }
        long expectedHash = hash.getValue();
        if (expectedHash != ByteUtils.fromLittleEndian(checksum)) {
            throw new IOException(kind + " checksum mismatch.");
        }
    }

    private void verifyContentChecksum() throws IOException {
        if (this.expectContentChecksum) {
            verifyChecksum(this.contentHash, "content");
        }
        this.contentHash.reset();
    }
}
