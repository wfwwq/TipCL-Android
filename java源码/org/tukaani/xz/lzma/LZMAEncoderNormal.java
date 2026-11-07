package org.tukaani.xz.lzma;

import org.apache.commons.compress.archivers.zip.UnixStat;
import org.tukaani.xz.ArrayCache;
import org.tukaani.xz.lz.LZEncoder;
import org.tukaani.xz.lz.Matches;
import org.tukaani.xz.rangecoder.RangeEncoder;

/* loaded from: classes24.dex */
final class LZMAEncoderNormal extends LZMAEncoder {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final int EXTRA_SIZE_AFTER = 4096;
    private static final int EXTRA_SIZE_BEFORE = 4096;
    private static final int OPTS = 4096;
    private Matches matches;
    private final State nextState;
    private int optCur;
    private int optEnd;
    private final Optimum[] opts;
    private final int[] repLens;

    LZMAEncoderNormal(RangeEncoder rangeEncoder, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, ArrayCache arrayCache) {
        super(rangeEncoder, LZEncoder.getInstance(i4, Math.max(i5, 4096), 4096, i6, 273, i7, i8, arrayCache), i, i2, i3, i4, i6);
        this.opts = new Optimum[4096];
        this.optCur = 0;
        this.optEnd = 0;
        this.repLens = new int[4];
        this.nextState = new State();
        for (int i9 = 0; i9 < 4096; i9++) {
            this.opts[i9] = new Optimum();
        }
    }

    private void calc1BytePrices(int i, int i2, int i3, int i4) {
        boolean z;
        int shortRepPrice;
        int i5 = this.lz.getByte(0);
        int i6 = this.lz.getByte(this.opts[this.optCur].reps[0] + 1);
        int price = this.opts[this.optCur].price + this.literalEncoder.getPrice(i5, i6, this.lz.getByte(1), i, this.opts[this.optCur].state);
        if (price < this.opts[this.optCur + 1].price) {
            this.opts[this.optCur + 1].set1(price, this.optCur, -1);
            z = true;
        } else {
            z = false;
        }
        if (i6 == i5 && ((this.opts[this.optCur + 1].optPrev == this.optCur || this.opts[this.optCur + 1].backPrev != 0) && (shortRepPrice = getShortRepPrice(i4, this.opts[this.optCur].state, i2)) <= this.opts[this.optCur + 1].price)) {
            this.opts[this.optCur + 1].set1(shortRepPrice, this.optCur, 0);
            z = true;
        }
        if (z || i6 == i5 || i3 <= 2) {
            return;
        }
        int matchLen = this.lz.getMatchLen(1, this.opts[this.optCur].reps[0], Math.min(this.niceLen, i3 - 1));
        if (matchLen >= 2) {
            this.nextState.set(this.opts[this.optCur].state);
            this.nextState.updateLiteral();
            int longRepAndLenPrice = price + getLongRepAndLenPrice(0, matchLen, this.nextState, (i + 1) & this.posMask);
            int i7 = this.optCur + 1 + matchLen;
            while (this.optEnd < i7) {
                Optimum[] optimumArr = this.opts;
                int i8 = this.optEnd + 1;
                this.optEnd = i8;
                optimumArr[i8].reset();
            }
            if (longRepAndLenPrice < this.opts[i7].price) {
                this.opts[i7].set2(longRepAndLenPrice, this.optCur, 0);
            }
        }
    }

    private int calcLongRepPrices(int i, int i2, int i3, int i4) {
        int iMin = Math.min(i3, this.niceLen);
        int i5 = 2;
        for (int i6 = 0; i6 < 4; i6++) {
            int matchLen = this.lz.getMatchLen(this.opts[this.optCur].reps[i6], iMin);
            if (matchLen >= 2) {
                while (this.optEnd < this.optCur + matchLen) {
                    Optimum[] optimumArr = this.opts;
                    int i7 = this.optEnd + 1;
                    this.optEnd = i7;
                    optimumArr[i7].reset();
                }
                int longRepPrice = getLongRepPrice(i4, i6, this.opts[this.optCur].state, i2);
                for (int i8 = matchLen; i8 >= 2; i8--) {
                    int price = this.repLenEncoder.getPrice(i8, i2) + longRepPrice;
                    if (price < this.opts[this.optCur + i8].price) {
                        this.opts[this.optCur + i8].set1(price, this.optCur, i6);
                    }
                }
                if (i6 == 0) {
                    i5 = matchLen + 1;
                }
                int i9 = i5;
                int matchLen2 = this.lz.getMatchLen(matchLen + 1, this.opts[this.optCur].reps[i6], Math.min(this.niceLen, (i3 - matchLen) - 1));
                if (matchLen2 >= 2) {
                    int price2 = longRepPrice + this.repLenEncoder.getPrice(matchLen, i2);
                    this.nextState.set(this.opts[this.optCur].state);
                    this.nextState.updateLongRep();
                    int i10 = i + matchLen;
                    int price3 = price2 + this.literalEncoder.getPrice(this.lz.getByte(matchLen, 0), this.lz.getByte(0), this.lz.getByte(matchLen, 1), i10, this.nextState);
                    this.nextState.updateLiteral();
                    int longRepAndLenPrice = price3 + getLongRepAndLenPrice(0, matchLen2, this.nextState, (i10 + 1) & this.posMask);
                    int i11 = this.optCur + matchLen + 1 + matchLen2;
                    while (this.optEnd < i11) {
                        Optimum[] optimumArr2 = this.opts;
                        int i12 = this.optEnd + 1;
                        this.optEnd = i12;
                        optimumArr2[i12].reset();
                    }
                    if (longRepAndLenPrice < this.opts[i11].price) {
                        this.opts[i11].set3(longRepAndLenPrice, this.optCur, i6, matchLen, 0);
                    }
                }
                i5 = i9;
            }
        }
        return i5;
    }

    private void calcNormalMatchPrices(int i, int i2, int i3, int i4, int i5) {
        if (this.matches.len[this.matches.count - 1] > i3) {
            this.matches.count = 0;
            while (this.matches.len[this.matches.count] < i3) {
                this.matches.count++;
            }
            int[] iArr = this.matches.len;
            Matches matches = this.matches;
            int i6 = matches.count;
            matches.count = i6 + 1;
            iArr[i6] = i3;
        }
        if (this.matches.len[this.matches.count - 1] < i5) {
            return;
        }
        while (this.optEnd < this.optCur + this.matches.len[this.matches.count - 1]) {
            Optimum[] optimumArr = this.opts;
            int i7 = this.optEnd + 1;
            this.optEnd = i7;
            optimumArr[i7].reset();
        }
        int normalMatchPrice = getNormalMatchPrice(i4, this.opts[this.optCur].state);
        int i8 = 0;
        while (i5 > this.matches.len[i8]) {
            i8++;
        }
        int i9 = i5;
        while (true) {
            int i10 = this.matches.dist[i8];
            int matchAndLenPrice = getMatchAndLenPrice(normalMatchPrice, i10, i9, i2);
            if (matchAndLenPrice < this.opts[this.optCur + i9].price) {
                this.opts[this.optCur + i9].set1(matchAndLenPrice, this.optCur, i10 + 4);
            }
            if (i9 == this.matches.len[i8]) {
                int matchLen = this.lz.getMatchLen(i9 + 1, i10, Math.min(this.niceLen, (i3 - i9) - 1));
                if (matchLen >= 2) {
                    this.nextState.set(this.opts[this.optCur].state);
                    this.nextState.updateMatch();
                    int i11 = i + i9;
                    int price = matchAndLenPrice + this.literalEncoder.getPrice(this.lz.getByte(i9, 0), this.lz.getByte(0), this.lz.getByte(i9, 1), i11, this.nextState);
                    this.nextState.updateLiteral();
                    int longRepAndLenPrice = price + getLongRepAndLenPrice(0, matchLen, this.nextState, (i11 + 1) & this.posMask);
                    int i12 = this.optCur + i9 + 1 + matchLen;
                    while (this.optEnd < i12) {
                        Optimum[] optimumArr2 = this.opts;
                        int i13 = this.optEnd + 1;
                        this.optEnd = i13;
                        optimumArr2[i13].reset();
                    }
                    if (longRepAndLenPrice < this.opts[i12].price) {
                        this.opts[i12].set3(longRepAndLenPrice, this.optCur, i10 + 4, i9, 0);
                    }
                }
                i8++;
                if (i8 == this.matches.count) {
                    return;
                }
            }
            i9++;
        }
    }

    private int convertOpts() {
        this.optEnd = this.optCur;
        int i = this.opts[this.optCur].optPrev;
        while (true) {
            Optimum optimum = this.opts[this.optCur];
            if (optimum.prev1IsLiteral) {
                this.opts[i].optPrev = this.optCur;
                this.opts[i].backPrev = -1;
                int i2 = i - 1;
                this.optCur = i;
                if (optimum.hasPrev2) {
                    this.opts[i2].optPrev = i2 + 1;
                    this.opts[i2].backPrev = optimum.backPrev2;
                    this.optCur = i2;
                    i = optimum.optPrev2;
                } else {
                    i = i2;
                }
            }
            int i3 = this.opts[i].optPrev;
            this.opts[i].optPrev = this.optCur;
            this.optCur = i;
            if (this.optCur <= 0) {
                this.optCur = this.opts[0].optPrev;
                this.back = this.opts[this.optCur].backPrev;
                return this.optCur;
            }
            i = i3;
        }
    }

    static int getMemoryUsage(int i, int i2, int i3) {
        return LZEncoder.getMemoryUsage(i, Math.max(i2, 4096), 4096, 273, i3) + 256;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x016f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void updateOptStateAndReps() {
        /*
            Method dump skipped, instructions count: 399
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.tukaani.xz.lzma.LZMAEncoderNormal.updateOptStateAndReps():void");
    }

    @Override // org.tukaani.xz.lzma.LZMAEncoder
    int getNextSymbol() {
        int i;
        int shortRepPrice;
        if (this.optCur < this.optEnd) {
            int i2 = this.opts[this.optCur].optPrev - this.optCur;
            this.optCur = this.opts[this.optCur].optPrev;
            this.back = this.opts[this.optCur].backPrev;
            return i2;
        }
        if (this.optCur != this.optEnd) {
            throw new AssertionError();
        }
        this.optCur = 0;
        this.optEnd = 0;
        this.back = -1;
        if (this.readAhead == -1) {
            this.matches = getMatches();
        }
        int iMin = Math.min(this.lz.getAvail(), 273);
        if (iMin < 2) {
            return 1;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < 4; i4++) {
            this.repLens[i4] = this.lz.getMatchLen(this.reps[i4], iMin);
            if (this.repLens[i4] < 2) {
                this.repLens[i4] = 0;
            } else if (this.repLens[i4] > this.repLens[i3]) {
                i3 = i4;
            }
        }
        if (this.repLens[i3] >= this.niceLen) {
            this.back = i3;
            skip(this.repLens[i3] - 1);
            return this.repLens[i3];
        }
        if (this.matches.count > 0) {
            i = this.matches.len[this.matches.count - 1];
            int i5 = this.matches.dist[this.matches.count - 1];
            if (i >= this.niceLen) {
                this.back = i5 + 4;
                skip(i - 1);
                return i;
            }
        } else {
            i = 0;
        }
        int i6 = this.lz.getByte(0);
        int i7 = this.lz.getByte(this.reps[0] + 1);
        if (i < 2 && i6 != i7 && this.repLens[i3] < 2) {
            return 1;
        }
        int pos = this.lz.getPos();
        int i8 = this.posMask & pos;
        this.opts[1].set1(this.literalEncoder.getPrice(i6, i7, this.lz.getByte(1), pos, this.state), 0, -1);
        int anyMatchPrice = getAnyMatchPrice(this.state, i8);
        int anyRepPrice = getAnyRepPrice(anyMatchPrice, this.state);
        if (i7 == i6 && (shortRepPrice = getShortRepPrice(anyRepPrice, this.state, i8)) < this.opts[1].price) {
            this.opts[1].set1(shortRepPrice, 0, 0);
        }
        this.optEnd = Math.max(i, this.repLens[i3]);
        if (this.optEnd < 2) {
            if (this.optEnd != 0) {
                throw new AssertionError(this.optEnd);
            }
            this.back = this.opts[1].backPrev;
            return 1;
        }
        updatePrices();
        this.opts[0].state.set(this.state);
        System.arraycopy(this.reps, 0, this.opts[0].reps, 0, 4);
        for (int i9 = this.optEnd; i9 >= 2; i9--) {
            this.opts[i9].reset();
        }
        for (int i10 = 0; i10 < 4; i10++) {
            int i11 = this.repLens[i10];
            if (i11 >= 2) {
                int longRepPrice = getLongRepPrice(anyRepPrice, i10, this.state, i8);
                do {
                    int price = this.repLenEncoder.getPrice(i11, i8) + longRepPrice;
                    if (price < this.opts[i11].price) {
                        this.opts[i11].set1(price, 0, i10);
                    }
                    i11--;
                } while (i11 >= 2);
            }
        }
        int iMax = Math.max(this.repLens[0] + 1, 2);
        if (iMax <= i) {
            int normalMatchPrice = getNormalMatchPrice(anyMatchPrice, this.state);
            int i12 = 0;
            while (iMax > this.matches.len[i12]) {
                i12++;
            }
            while (true) {
                int i13 = this.matches.dist[i12];
                int matchAndLenPrice = getMatchAndLenPrice(normalMatchPrice, i13, iMax, i8);
                if (matchAndLenPrice < this.opts[iMax].price) {
                    this.opts[iMax].set1(matchAndLenPrice, 0, i13 + 4);
                }
                if (iMax == this.matches.len[i12] && (i12 = i12 + 1) == this.matches.count) {
                    break;
                }
                iMax++;
            }
        }
        int iMin2 = Math.min(this.lz.getAvail(), UnixStat.PERM_MASK);
        while (true) {
            int i14 = this.optCur + 1;
            this.optCur = i14;
            if (i14 >= this.optEnd) {
                break;
            }
            this.matches = getMatches();
            if (this.matches.count > 0 && this.matches.len[this.matches.count - 1] >= this.niceLen) {
                break;
            }
            int i15 = iMin2 - 1;
            int i16 = pos + 1;
            int i17 = i16 & this.posMask;
            updateOptStateAndReps();
            int anyMatchPrice2 = this.opts[this.optCur].price + getAnyMatchPrice(this.opts[this.optCur].state, i17);
            int anyRepPrice2 = getAnyRepPrice(anyMatchPrice2, this.opts[this.optCur].state);
            calc1BytePrices(i16, i17, i15, anyRepPrice2);
            if (i15 >= 2) {
                int iCalcLongRepPrices = calcLongRepPrices(i16, i17, i15, anyRepPrice2);
                if (this.matches.count > 0) {
                    calcNormalMatchPrices(i16, i17, i15, anyMatchPrice2, iCalcLongRepPrices);
                }
            }
            pos = i16;
            iMin2 = i15;
        }
        return convertOpts();
    }

    @Override // org.tukaani.xz.lzma.LZMAEncoder, org.tukaani.xz.lzma.LZMACoder
    public void reset() {
        this.optCur = 0;
        this.optEnd = 0;
        super.reset();
    }
}
