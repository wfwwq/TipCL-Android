package org.tukaani.xz.rangecoder;

import java.io.DataInputStream;
import java.io.IOException;
import kotlin.UByte;
import org.tukaani.xz.ArrayCache;
import org.tukaani.xz.CorruptedInputException;

/* loaded from: classes24.dex */
public final class RangeDecoderFromBuffer extends RangeDecoder {
    private static final int INIT_SIZE = 5;
    private final byte[] buf;
    private int pos;

    public RangeDecoderFromBuffer(int i, ArrayCache arrayCache) {
        this.buf = arrayCache.getByteArray(i - 5, false);
        this.pos = this.buf.length;
    }

    public boolean isFinished() {
        return this.pos == this.buf.length && this.code == 0;
    }

    @Override // org.tukaani.xz.rangecoder.RangeDecoder
    public void normalize() throws IOException {
        if ((this.range & (-16777216)) == 0) {
            try {
                int i = this.code << 8;
                byte[] bArr = this.buf;
                int i2 = this.pos;
                this.pos = i2 + 1;
                this.code = i | (bArr[i2] & UByte.MAX_VALUE);
                this.range <<= 8;
            } catch (ArrayIndexOutOfBoundsException e) {
                throw new CorruptedInputException();
            }
        }
    }

    public void prepareInputBuffer(DataInputStream dataInputStream, int i) throws IOException {
        if (i < 5) {
            throw new CorruptedInputException();
        }
        if (dataInputStream.readUnsignedByte() != 0) {
            throw new CorruptedInputException();
        }
        this.code = dataInputStream.readInt();
        this.range = -1;
        int i2 = i - 5;
        this.pos = this.buf.length - i2;
        dataInputStream.readFully(this.buf, this.pos, i2);
    }

    public void putArraysToCache(ArrayCache arrayCache) {
        arrayCache.putArray(this.buf);
    }
}
