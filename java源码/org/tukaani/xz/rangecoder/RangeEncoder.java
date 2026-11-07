package org.tukaani.xz.rangecoder;

import java.io.IOException;
import kotlin.UByte;

/* loaded from: classes24.dex */
public abstract class RangeEncoder extends RangeCoder {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final int BIT_PRICE_SHIFT_BITS = 4;
    private static final int MOVE_REDUCING_BITS = 4;
    private static final int[] prices = new int[128];
    private byte cache;
    long cacheSize;
    private long low;
    private int range;

    static {
        for (int i = 8; i < 2048; i += 16) {
            int i2 = i;
            int i3 = 0;
            for (int i4 = 0; i4 < 4; i4++) {
                i2 *= i2;
                i3 <<= 1;
                while (((-65536) & i2) != 0) {
                    i2 >>>= 1;
                    i3++;
                }
            }
            prices[i >> 4] = 161 - i3;
        }
    }

    public static int getBitPrice(int i, int i2) {
        if (i2 == 0 || i2 == 1) {
            return prices[(i ^ ((-i2) & 2047)) >>> 4];
        }
        throw new AssertionError();
    }

    public static int getBitTreePrice(short[] sArr, int i) {
        int length = i | sArr.length;
        int bitPrice = 0;
        do {
            int i2 = length & 1;
            length >>>= 1;
            bitPrice += getBitPrice(sArr[length], i2);
        } while (length != 1);
        return bitPrice;
    }

    public static int getDirectBitsPrice(int i) {
        return i << 4;
    }

    public static int getReverseBitTreePrice(short[] sArr, int i) {
        int length = i | sArr.length;
        int bitPrice = 0;
        int i2 = 1;
        do {
            int i3 = length & 1;
            length >>>= 1;
            bitPrice += getBitPrice(sArr[i2], i3);
            i2 = (i2 << 1) | i3;
        } while (length != 1);
        return bitPrice;
    }

    private void shiftLow() throws IOException {
        int i = (int) (this.low >>> 32);
        if (i != 0 || this.low < 4278190080L) {
            byte b = this.cache;
            while (true) {
                writeByte(b + i);
                long j = this.cacheSize - 1;
                this.cacheSize = j;
                if (j == 0) {
                    break;
                } else {
                    b = UByte.MAX_VALUE;
                }
            }
            this.cache = (byte) (this.low >>> 24);
        }
        this.cacheSize++;
        this.low = (this.low & 16777215) << 8;
    }

    public void encodeBit(short[] sArr, int i, int i2) throws IOException {
        short s = sArr[i];
        int i3 = (this.range >>> 11) * s;
        if (i2 == 0) {
            this.range = i3;
            sArr[i] = (short) (s + ((2048 - s) >>> 5));
        } else {
            this.low += i3 & 4294967295L;
            this.range -= i3;
            sArr[i] = (short) (s - (s >>> 5));
        }
        if ((this.range & (-16777216)) == 0) {
            this.range <<= 8;
            shiftLow();
        }
    }

    public void encodeBitTree(short[] sArr, int i) throws IOException {
        int length = sArr.length;
        int i2 = 1;
        do {
            length >>>= 1;
            int i3 = i & length;
            encodeBit(sArr, i2, i3);
            i2 <<= 1;
            if (i3 != 0) {
                i2 |= 1;
            }
        } while (length != 1);
    }

    public void encodeDirectBits(int i, int i2) throws IOException {
        do {
            this.range >>>= 1;
            i2--;
            this.low += this.range & (0 - ((i >>> i2) & 1));
            if ((this.range & (-16777216)) == 0) {
                this.range <<= 8;
                shiftLow();
            }
        } while (i2 != 0);
    }

    public void encodeReverseBitTree(short[] sArr, int i) throws IOException {
        int length = i | sArr.length;
        int i2 = 1;
        do {
            int i3 = length & 1;
            length >>>= 1;
            encodeBit(sArr, i2, i3);
            i2 = (i2 << 1) | i3;
        } while (length != 1);
    }

    public int finish() throws IOException {
        for (int i = 0; i < 5; i++) {
            shiftLow();
        }
        return -1;
    }

    public int getPendingSize() {
        throw new Error();
    }

    public void reset() {
        this.low = 0L;
        this.range = -1;
        this.cache = (byte) 0;
        this.cacheSize = 1L;
    }

    abstract void writeByte(int i) throws IOException;
}
