package org.apache.commons.compress.archivers.zip;

import java.io.IOException;
import java.io.InputStream;
import org.apache.commons.compress.utils.ExactMath;
import org.apache.commons.compress.utils.InputStreamStatistics;
import org.apache.commons.io.input.CloseShieldInputStream;
import org.apache.commons.io.input.CountingInputStream;

/* loaded from: classes24.dex */
final class ExplodingInputStream extends InputStream implements InputStreamStatistics {
    private BitStream bits;
    private final CircularBuffer buffer = new CircularBuffer(32768);
    private final int dictionarySize;
    private BinaryTree distanceTree;
    private final InputStream in;
    private BinaryTree lengthTree;
    private BinaryTree literalTree;
    private final int minimumMatchLength;
    private final int numberOfTrees;
    private long treeSizes;
    private long uncompressedCount;

    ExplodingInputStream(int dictionarySize, int numberOfTrees, InputStream in) {
        if (dictionarySize != 4096 && dictionarySize != 8192) {
            throw new IllegalArgumentException("The dictionary size must be 4096 or 8192");
        }
        if (numberOfTrees != 2 && numberOfTrees != 3) {
            throw new IllegalArgumentException("The number of trees must be 2 or 3");
        }
        this.dictionarySize = dictionarySize;
        this.numberOfTrees = numberOfTrees;
        this.minimumMatchLength = numberOfTrees;
        this.in = in;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.in.close();
    }

    private void fillBuffer() throws IOException {
        int literal;
        init();
        int bit = this.bits.nextBit();
        if (bit == -1) {
            return;
        }
        if (bit == 1) {
            if (this.literalTree != null) {
                literal = this.literalTree.read(this.bits);
            } else {
                literal = this.bits.nextByte();
            }
            if (literal == -1) {
                return;
            }
            this.buffer.put(literal);
            return;
        }
        int distanceLowSize = this.dictionarySize == 4096 ? 6 : 7;
        int distanceLow = (int) this.bits.nextBits(distanceLowSize);
        int distanceHigh = this.distanceTree.read(this.bits);
        if (distanceHigh == -1 && distanceLow <= 0) {
            return;
        }
        int distance = (distanceHigh << distanceLowSize) | distanceLow;
        int length = this.lengthTree.read(this.bits);
        if (length == 63) {
            long nextByte = this.bits.nextBits(8);
            if (nextByte == -1) {
                return;
            } else {
                length = ExactMath.add(length, nextByte);
            }
        }
        this.buffer.copy(distance + 1, length + this.minimumMatchLength);
    }

    @Override // org.apache.commons.compress.utils.InputStreamStatistics
    public long getCompressedCount() {
        return this.bits.getBytesRead() + this.treeSizes;
    }

    @Override // org.apache.commons.compress.utils.InputStreamStatistics
    public long getUncompressedCount() {
        return this.uncompressedCount;
    }

    private void init() throws IOException {
        if (this.bits == null) {
            CountingInputStream i = new CountingInputStream(CloseShieldInputStream.wrap(this.in));
            try {
                if (this.numberOfTrees == 3) {
                    this.literalTree = BinaryTree.decode(i, 256);
                }
                this.lengthTree = BinaryTree.decode(i, 64);
                this.distanceTree = BinaryTree.decode(i, 64);
                this.treeSizes += i.getByteCount();
                i.close();
                this.bits = new BitStream(this.in);
            } catch (Throwable th) {
                try {
                    i.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (!this.buffer.available()) {
            try {
                fillBuffer();
            } catch (IllegalArgumentException ex) {
                throw new IOException("bad IMPLODE stream", ex);
            }
        }
        int ret = this.buffer.get();
        if (ret > -1) {
            this.uncompressedCount++;
        }
        return ret;
    }
}
