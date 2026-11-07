package androidx.compose.ui.node;

import kotlin.Metadata;

/* compiled from: MyersDiff.kt */
@Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0016\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0002\u001aZ\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a \u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u0005H\u0002\u001a \u0010\u0018\u001a\u00020\u00012\u0006\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0005H\u0000\u001a8\u0010\u0019\u001a\u00020\u00012\u0006\u0010\u001a\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u0012H\u0000\u001aZ\u0010\u000e\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002ø\u0001\u0000¢\u0006\u0004\b \u0010\u0014\u001aR\u0010!\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002ø\u0001\u0000¢\u0006\u0004\b\"\u0010#\u001a\u001c\u0010$\u001a\u00020\u0001*\u00020\u00122\u0006\u0010%\u001a\u00020\t2\u0006\u0010&\u001a\u00020\tH\u0002\u001a\r\u0010'\u001a\u00020\t*\u00020\u0007H\u0082\b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006("}, d2 = {"applyDiff", "", "diagonals", "Landroidx/compose/ui/node/IntStack;", "callback", "Landroidx/compose/ui/node/DiffCallback;", "backward", "", "oldStart", "", "oldEnd", "newStart", "newEnd", "cb", "forward", "Landroidx/compose/ui/node/CenteredArray;", "d", "snake", "", "backward-4l5_RBY", "(IIIILandroidx/compose/ui/node/DiffCallback;[I[II[I)Z", "calculateDiff", "oldSize", "newSize", "executeDiff", "fillSnake", "startX", "startY", "endX", "endY", "reverse", "data", "forward-4l5_RBY", "midPoint", "midPoint-q5eDKzI", "(IIIILandroidx/compose/ui/node/DiffCallback;[I[I[I)Z", "swap", "i", "j", "toInt", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class MyersDiffKt {
    private static final IntStack calculateDiff(int i, int i2, DiffCallback diffCallback) {
        boolean z = true;
        char c = 2;
        int i3 = ((i + i2) + 1) / 2;
        IntStack intStack = new IntStack(i3 * 3);
        IntStack intStack2 = new IntStack(i3 * 4);
        intStack2.pushRange(0, i, 0, i2);
        int[] iArrM5859constructorimpl = CenteredArray.m5859constructorimpl(new int[(i3 * 2) + 1]);
        int[] iArrM5859constructorimpl2 = CenteredArray.m5859constructorimpl(new int[(i3 * 2) + 1]);
        int[] iArrM6077constructorimpl = Snake.m6077constructorimpl(new int[5]);
        while (intStack2.isNotEmpty()) {
            int iPop = intStack2.pop();
            int iPop2 = intStack2.pop();
            int iPop3 = intStack2.pop();
            int iPop4 = intStack2.pop();
            boolean zM5971midPointq5eDKzI = m5971midPointq5eDKzI(iPop4, iPop3, iPop2, iPop, diffCallback, iArrM5859constructorimpl, iArrM5859constructorimpl2, iArrM6077constructorimpl);
            int[] iArr = iArrM6077constructorimpl;
            if (zM5971midPointq5eDKzI) {
                boolean z2 = z;
                char c2 = c;
                if (Math.min(iArr[c] - iArr[0], iArr[3] - iArr[z2 ? 1 : 0]) > 0) {
                    Snake.m6075addDiagonalToStackimpl(iArr, intStack);
                }
                intStack2.pushRange(iPop4, iArr[0], iPop2, iArr[z2 ? 1 : 0]);
                intStack2.pushRange(iArr[c2], iPop3, iArr[3], iPop);
                iArrM6077constructorimpl = iArr;
                z = z2 ? 1 : 0;
                c = c2;
            } else {
                iArrM6077constructorimpl = iArr;
            }
        }
        intStack.sortDiagonals();
        intStack.pushDiagonal(i, i2, 0);
        return intStack;
    }

    private static final void applyDiff(IntStack diagonals, DiffCallback callback) {
        int posX = 0;
        int posY = 0;
        int i = 0;
        while (i < diagonals.getLastIndex()) {
            int startX = diagonals.get(i) - diagonals.get(i + 2);
            int startY = diagonals.get(i + 1) - diagonals.get(i + 2);
            int len = diagonals.get(i + 2);
            i += 3;
            while (posX < startX) {
                callback.remove(posY, posX);
                posX++;
            }
            while (posY < startY) {
                callback.insert(posY);
                posY++;
            }
            while (true) {
                int len2 = len - 1;
                if (len > 0) {
                    callback.same(posX, posY);
                    posX++;
                    posY++;
                    len = len2;
                }
            }
        }
    }

    public static final void executeDiff(int oldSize, int newSize, DiffCallback callback) {
        IntStack diagonals = calculateDiff(oldSize, newSize, callback);
        applyDiff(diagonals, callback);
    }

    /* renamed from: midPoint-q5eDKzI, reason: not valid java name */
    private static final boolean m5971midPointq5eDKzI(int oldStart, int oldEnd, int newStart, int newEnd, DiffCallback cb, int[] forward, int[] backward, int[] snake) {
        int i = oldStart;
        int i2 = oldEnd;
        int oldSize = i2 - i;
        int newSize = newEnd - newStart;
        if (oldSize < 1 || newSize < 1) {
            return false;
        }
        int max = ((oldSize + newSize) + 1) / 2;
        int[] iArr = forward;
        CenteredArray.m5865setimpl(iArr, 1, i);
        int[] iArr2 = backward;
        CenteredArray.m5865setimpl(iArr2, 1, i2);
        int d = 0;
        while (d < max) {
            boolean found = m5970forward4l5_RBY(i, i2, newStart, newEnd, cb, iArr, iArr2, d, snake);
            if (found) {
                return true;
            }
            boolean found2 = m5969backward4l5_RBY(oldStart, oldEnd, newStart, newEnd, cb, forward, backward, d, snake);
            if (found2) {
                return true;
            }
            d++;
            i = oldStart;
            i2 = oldEnd;
            iArr = forward;
            iArr2 = backward;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r20v0 */
    /* JADX WARN: Type inference failed for: r20v1 */
    /* JADX WARN: Type inference failed for: r20v2, types: [boolean] */
    /* renamed from: forward-4l5_RBY, reason: not valid java name */
    private static final boolean m5970forward4l5_RBY(int oldStart, int oldEnd, int newStart, int newEnd, DiffCallback cb, int[] forward, int[] backward, int d, int[] snake) {
        int x;
        int startX;
        ?? r20;
        int i = oldEnd;
        int oldSize = i - oldStart;
        int newSize = newEnd - newStart;
        int i2 = 1;
        boolean checkForSnake = (Math.abs(oldSize - newSize) & 1) == 1;
        int delta = oldSize - newSize;
        int k = -d;
        while (k <= d) {
            if (k == (-d) || (k != d && CenteredArray.m5862getimpl(forward, k + 1) > CenteredArray.m5862getimpl(forward, k - 1))) {
                int startX2 = CenteredArray.m5862getimpl(forward, k + 1);
                x = startX2;
                startX = startX2;
            } else {
                int startX3 = CenteredArray.m5862getimpl(forward, k - 1);
                x = startX3 + 1;
                startX = startX3;
            }
            int y = (newStart + (x - oldStart)) - k;
            int startY = y - ((d != 0 ? i2 : 0) & (x == startX ? i2 : 0));
            while (x < i && y < newEnd) {
                if (!cb.areItemsTheSame(x, y)) {
                    break;
                }
                x++;
                y++;
            }
            CenteredArray.m5865setimpl(forward, k, x);
            if (checkForSnake) {
                r20 = i2;
                int backwardsK = delta - k;
                if (backwardsK >= (-d) + 1 && backwardsK <= d - 1) {
                    if (CenteredArray.m5862getimpl(backward, backwardsK) <= x) {
                        fillSnake(startX, startY, x, y, false, snake);
                        return r20;
                    }
                }
            } else {
                r20 = i2;
            }
            k += 2;
            i = oldEnd;
            i2 = r20;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: backward-4l5_RBY, reason: not valid java name */
    private static final boolean m5969backward4l5_RBY(int i, int i2, int i3, int i4, DiffCallback diffCallback, int[] iArr, int[] iArr2, int i5, int[] iArr3) {
        int i6;
        int i7;
        boolean z;
        int i8 = i2 - i;
        int i9 = i4 - i3;
        int i10 = 1;
        boolean z2 = ((i8 - i9) & 1) == 0;
        int i11 = i8 - i9;
        int i12 = -i5;
        while (i12 <= i5) {
            if (i12 == (-i5) || (i12 != i5 && CenteredArray.m5862getimpl(iArr2, i12 + 1) < CenteredArray.m5862getimpl(iArr2, i12 - 1))) {
                int iM5862getimpl = CenteredArray.m5862getimpl(iArr2, i12 + 1);
                i6 = iM5862getimpl;
                i7 = iM5862getimpl;
            } else {
                int iM5862getimpl2 = CenteredArray.m5862getimpl(iArr2, i12 - 1);
                i6 = iM5862getimpl2 - 1;
                i7 = iM5862getimpl2;
            }
            int i13 = i4 - ((i2 - i6) - i12);
            int i14 = i13 + ((i5 != 0 ? i10 : 0) & (i6 == i7 ? i10 : 0));
            int i15 = i13;
            int i16 = i6;
            while (i16 > i && i15 > i3) {
                z = i10;
                if (!diffCallback.areItemsTheSame(i16 - 1, i15 - 1)) {
                    break;
                }
                i16--;
                i15--;
                i10 = z ? 1 : 0;
            }
            z = i10;
            CenteredArray.m5865setimpl(iArr2, i12, i16);
            if (z2) {
                int i17 = i11 - i12;
                if (i17 >= (-i5) && i17 <= i5) {
                    if (CenteredArray.m5862getimpl(iArr, i17) >= i16) {
                        fillSnake(i16, i15, i7, i14, true, iArr3);
                        return z;
                    }
                }
            }
            i12 += 2;
            i10 = z;
        }
        return false;
    }

    private static final int toInt(boolean z) {
        return z ? 1 : 0;
    }

    public static final void fillSnake(int i, int i2, int i3, int i4, boolean z, int[] iArr) {
        if (iArr.length < 5) {
            return;
        }
        iArr[0] = i;
        iArr[1] = i2;
        iArr[2] = i3;
        iArr[3] = i4;
        iArr[4] = z ? 1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void swap(int[] $this$swap, int i, int j) {
        int tmp = $this$swap[i];
        $this$swap[i] = $this$swap[j];
        $this$swap[j] = tmp;
    }
}
