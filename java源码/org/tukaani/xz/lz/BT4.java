package org.tukaani.xz.lz;

import org.tukaani.xz.ArrayCache;

/* loaded from: classes24.dex */
final class BT4 extends LZEncoder {
    private int cyclicPos;
    private final int cyclicSize;
    private final int depthLimit;
    private final Hash234 hash;
    private int lzPos;
    private final Matches matches;
    private final int[] tree;

    BT4(int i, int i2, int i3, int i4, int i5, int i6, ArrayCache arrayCache) {
        super(i, i2, i3, i4, i5, arrayCache);
        this.cyclicPos = -1;
        this.cyclicSize = i + 1;
        this.lzPos = this.cyclicSize;
        this.hash = new Hash234(i, arrayCache);
        this.tree = arrayCache.getIntArray(this.cyclicSize * 2, false);
        this.matches = new Matches(i4 - 1);
        this.depthLimit = i6 <= 0 ? (i4 / 2) + 16 : i6;
    }

    static int getMemoryUsage(int i) {
        return Hash234.getMemoryUsage(i) + (i / 128) + 10;
    }

    private int movePos() {
        int iMovePos = movePos(this.niceLen, 4);
        if (iMovePos != 0) {
            int i = this.lzPos + 1;
            this.lzPos = i;
            if (i == Integer.MAX_VALUE) {
                int i2 = Integer.MAX_VALUE - this.cyclicSize;
                this.hash.normalize(i2);
                normalize(this.tree, this.cyclicSize * 2, i2);
                this.lzPos -= i2;
            }
            int i3 = this.cyclicPos + 1;
            this.cyclicPos = i3;
            if (i3 == this.cyclicSize) {
                this.cyclicPos = 0;
            }
        }
        return iMovePos;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0096, code lost:
    
        r12.tree[r1] = 0;
        r12.tree[r2] = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x009e, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void skip(int r13, int r14) {
        /*
            r12 = this;
            int r0 = r12.depthLimit
            int r1 = r12.cyclicPos
            int r1 = r1 << 1
            int r1 = r1 + 1
            int r2 = r12.cyclicPos
            int r2 = r2 << 1
            r3 = 0
            r4 = r3
            r5 = r4
        Lf:
            int r6 = r12.lzPos
            int r6 = r6 - r14
            int r7 = r0 + (-1)
            if (r0 == 0) goto L96
            int r0 = r12.cyclicSize
            if (r6 < r0) goto L1c
            goto L96
        L1c:
            int r0 = r12.cyclicPos
            int r0 = r0 - r6
            int r8 = r12.cyclicPos
            if (r6 <= r8) goto L26
            int r8 = r12.cyclicSize
            goto L27
        L26:
            r8 = r3
        L27:
            int r0 = r0 + r8
            int r0 = r0 << 1
            int r8 = java.lang.Math.min(r4, r5)
            byte[] r9 = r12.buf
            int r10 = r12.readPos
            int r10 = r10 + r8
            int r10 = r10 - r6
            r9 = r9[r10]
            byte[] r10 = r12.buf
            int r11 = r12.readPos
            int r11 = r11 + r8
            r10 = r10[r11]
            if (r9 != r10) goto L67
        L3f:
            int r8 = r8 + 1
            if (r8 != r13) goto L56
            int[] r13 = r12.tree
            int[] r14 = r12.tree
            r14 = r14[r0]
            r13[r2] = r14
            int[] r13 = r12.tree
            int[] r14 = r12.tree
            int r0 = r0 + 1
            r14 = r14[r0]
            r13[r1] = r14
            return
        L56:
            byte[] r9 = r12.buf
            int r10 = r12.readPos
            int r10 = r10 + r8
            int r10 = r10 - r6
            r9 = r9[r10]
            byte[] r10 = r12.buf
            int r11 = r12.readPos
            int r11 = r11 + r8
            r10 = r10[r11]
            if (r9 == r10) goto L3f
        L67:
            byte[] r9 = r12.buf
            int r10 = r12.readPos
            int r10 = r10 + r8
            int r10 = r10 - r6
            r6 = r9[r10]
            r6 = r6 & 255(0xff, float:3.57E-43)
            byte[] r9 = r12.buf
            int r10 = r12.readPos
            int r10 = r10 + r8
            r9 = r9[r10]
            r9 = r9 & 255(0xff, float:3.57E-43)
            if (r6 >= r9) goto L89
            int[] r5 = r12.tree
            r5[r2] = r14
            int r0 = r0 + 1
            int[] r14 = r12.tree
            r14 = r14[r0]
            r2 = r0
            r5 = r8
            goto L93
        L89:
            int[] r4 = r12.tree
            r4[r1] = r14
            int[] r14 = r12.tree
            r14 = r14[r0]
            r1 = r0
            r4 = r8
        L93:
            r0 = r7
            goto Lf
        L96:
            int[] r13 = r12.tree
            r13[r1] = r3
            int[] r13 = r12.tree
            r13[r2] = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.tukaani.xz.lz.BT4.skip(int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x0184, code lost:
    
        r16 = r2;
        r18.tree[r5] = r16;
        r18.tree[r9] = r16;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c2 A[PHI: r9
  0x00c2: PHI (r9v3 int) = (r9v2 int), (r9v9 int) binds: [B:24:0x0097, B:30:0x00ba] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // org.tukaani.xz.lz.LZEncoder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public org.tukaani.xz.lz.Matches getMatches() {
        /*
            Method dump skipped, instructions count: 400
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.tukaani.xz.lz.BT4.getMatches():org.tukaani.xz.lz.Matches");
    }

    @Override // org.tukaani.xz.lz.LZEncoder
    public void putArraysToCache(ArrayCache arrayCache) {
        arrayCache.putArray(this.tree);
        this.hash.putArraysToCache(arrayCache);
        super.putArraysToCache(arrayCache);
    }

    @Override // org.tukaani.xz.lz.LZEncoder
    public void skip(int i) {
        while (true) {
            int i2 = i - 1;
            if (i <= 0) {
                return;
            }
            int i3 = this.niceLen;
            int iMovePos = movePos();
            if (iMovePos >= i3) {
                this.hash.calcHashes(this.buf, this.readPos);
                int hash4Pos = this.hash.getHash4Pos();
                this.hash.updateTables(this.lzPos);
                skip(i3, hash4Pos);
            } else if (iMovePos != 0) {
                i3 = iMovePos;
                this.hash.calcHashes(this.buf, this.readPos);
                int hash4Pos2 = this.hash.getHash4Pos();
                this.hash.updateTables(this.lzPos);
                skip(i3, hash4Pos2);
            }
            i = i2;
        }
    }
}
