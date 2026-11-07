package org.tukaani.xz.lz;

import java.io.DataInputStream;
import java.io.IOException;
import kotlin.UByte;
import org.tukaani.xz.ArrayCache;
import org.tukaani.xz.CorruptedInputException;

/* loaded from: classes24.dex */
public final class LZDecoder {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private final byte[] buf;
    private final int bufSize;
    private int full;
    private int pos;
    private int start;
    private int limit = 0;
    private int pendingLen = 0;
    private int pendingDist = 0;

    public LZDecoder(int i, byte[] bArr, ArrayCache arrayCache) {
        this.start = 0;
        this.pos = 0;
        this.full = 0;
        this.bufSize = i;
        this.buf = arrayCache.getByteArray(this.bufSize, false);
        if (bArr != null) {
            this.pos = Math.min(bArr.length, i);
            this.full = this.pos;
            this.start = this.pos;
            System.arraycopy(bArr, bArr.length - this.pos, this.buf, 0, this.pos);
        }
    }

    public void copyUncompressed(DataInputStream dataInputStream, int i) throws IOException {
        int iMin = Math.min(this.bufSize - this.pos, i);
        dataInputStream.readFully(this.buf, this.pos, iMin);
        this.pos += iMin;
        if (this.full < this.pos) {
            this.full = this.pos;
        }
    }

    public int flush(byte[] bArr, int i) {
        int i2 = this.pos - this.start;
        if (this.pos == this.bufSize) {
            this.pos = 0;
        }
        System.arraycopy(this.buf, this.start, bArr, i, i2);
        this.start = this.pos;
        return i2;
    }

    public int getByte(int i) {
        int i2 = (this.pos - i) - 1;
        if (i >= this.pos) {
            i2 += this.bufSize;
        }
        return this.buf[i2] & UByte.MAX_VALUE;
    }

    public int getPos() {
        return this.pos;
    }

    public boolean hasPending() {
        return this.pendingLen > 0;
    }

    public boolean hasSpace() {
        return this.pos < this.limit;
    }

    public void putArraysToCache(ArrayCache arrayCache) {
        arrayCache.putArray(this.buf);
    }

    public void putByte(byte b) {
        byte[] bArr = this.buf;
        int i = this.pos;
        this.pos = i + 1;
        bArr[i] = b;
        if (this.full < this.pos) {
            this.full = this.pos;
        }
    }

    public void repeat(int i, int i2) throws IOException {
        if (i < 0 || i >= this.full) {
            throw new CorruptedInputException();
        }
        int iMin = Math.min(this.limit - this.pos, i2);
        this.pendingLen = i2 - iMin;
        this.pendingDist = i;
        int i3 = (this.pos - i) - 1;
        if (i3 < 0) {
            if (this.full != this.bufSize) {
                throw new AssertionError();
            }
            int i4 = i3 + this.bufSize;
            int iMin2 = Math.min(this.bufSize - i4, iMin);
            if (iMin2 > i + 1) {
                throw new AssertionError();
            }
            System.arraycopy(this.buf, i4, this.buf, this.pos, iMin2);
            this.pos += iMin2;
            iMin -= iMin2;
            if (iMin == 0) {
                return;
            } else {
                i3 = 0;
            }
        }
        if (i3 >= this.pos) {
            throw new AssertionError();
        }
        if (iMin <= 0) {
            throw new AssertionError();
        }
        do {
            int iMin3 = Math.min(iMin, this.pos - i3);
            System.arraycopy(this.buf, i3, this.buf, this.pos, iMin3);
            this.pos += iMin3;
            iMin -= iMin3;
        } while (iMin > 0);
        if (this.full < this.pos) {
            this.full = this.pos;
        }
    }

    public void repeatPending() throws IOException {
        if (this.pendingLen > 0) {
            repeat(this.pendingDist, this.pendingLen);
        }
    }

    public void reset() {
        this.start = 0;
        this.pos = 0;
        this.full = 0;
        this.limit = 0;
        this.buf[this.bufSize - 1] = 0;
    }

    public void setLimit(int i) {
        if (this.bufSize - this.pos <= i) {
            this.limit = this.bufSize;
        } else {
            this.limit = this.pos + i;
        }
    }
}
