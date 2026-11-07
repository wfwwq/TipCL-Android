package kotlin.concurrent.atomics;

import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.concurrent.atomic.AtomicLongArray;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AtomicArrays.jvm.kt */
@Metadata(d1 = {"\u0000V\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\u001a%\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0087\u0080\u0004b\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006b\u0002\b\u0007¢\u0006\u0002\u0010\u0003\u001a%\u0010\b\u001a\u00020\u0002*\u00020\u0001H\u0087\u0080\u0004b\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006b\u0002\b\u0007¢\u0006\u0002\u0010\u0003\u001a%\u0010\u0000\u001a\u00020\t*\u00020\nH\u0087\u0080\u0004b\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006b\u0002\b\u0007¢\u0006\u0002\u0010\u000b\u001a%\u0010\b\u001a\u00020\n*\u00020\tH\u0087\u0080\u0004b\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006b\u0002\b\u0007¢\u0006\u0002\u0010\u000b\u001a7\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\r0\f\"\u0004\b\u0000\u0010\r*\b\u0012\u0004\u0012\u0002H\r0\u000eH\u0087\u0080\u0004b\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006b\u0002\b\u0007¢\u0006\u0002\u0010\u000f\u001a7\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\r0\u000e\"\u0004\b\u0000\u0010\r*\b\u0012\u0004\u0012\u0002H\r0\fH\u0087\u0080\u0004b\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006b\u0002\b\u0007¢\u0006\u0002\u0010\u000f\u001aU\u0010\u0010\u001a\u00020\u0011*\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00132\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00130\u0015H\u0087\u0088\u0004b\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0017b\u0002\b\u0007b\u0002\b\u0018ø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0002¢\u0006\u0002\u0010\u0016\u001aU\u0010\u0019\u001a\u00020\u0013*\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00132\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00130\u0015H\u0087\u0088\u0004b\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0017b\u0002\b\u0007b\u0002\b\u0018ø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0002¢\u0006\u0002\u0010\u001a\u001aU\u0010\u001b\u001a\u00020\u0013*\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00132\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00130\u0015H\u0087\u0088\u0004b\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0017b\u0002\b\u0007b\u0002\b\u0018ø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0002¢\u0006\u0002\u0010\u001a\u001aU\u0010\u0010\u001a\u00020\u0011*\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00132\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001c0\u0015H\u0087\u0088\u0004b\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0017b\u0002\b\u0007b\u0002\b\u0018ø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0002¢\u0006\u0002\u0010\u001d\u001aU\u0010\u0019\u001a\u00020\u001c*\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00132\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001c0\u0015H\u0087\u0088\u0004b\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0017b\u0002\b\u0007b\u0002\b\u0018ø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0002¢\u0006\u0002\u0010\u001e\u001aU\u0010\u001b\u001a\u00020\u001c*\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00132\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001c0\u0015H\u0087\u0088\u0004b\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0017b\u0002\b\u0007b\u0002\b\u0018ø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0002¢\u0006\u0002\u0010\u001e\u001aa\u0010\u0010\u001a\u00020\u0011\"\u0004\b\u0000\u0010\r*\b\u0012\u0004\u0012\u0002H\r0\u000e2\u0006\u0010\u0012\u001a\u00020\u00132\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u0002H\r\u0012\u0004\u0012\u0002H\r0\u0015H\u0087\u0088\u0004b\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0017b\u0002\b\u0007b\u0002\b\u0018ø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0002¢\u0006\u0002\u0010\u001f\u001aa\u0010\u0019\u001a\u0002H\r\"\u0004\b\u0000\u0010\r*\b\u0012\u0004\u0012\u0002H\r0\u000e2\u0006\u0010\u0012\u001a\u00020\u00132\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u0002H\r\u0012\u0004\u0012\u0002H\r0\u0015H\u0087\u0088\u0004b\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0017b\u0002\b\u0007b\u0002\b\u0018ø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0002¢\u0006\u0002\u0010 \u001aa\u0010\u001b\u001a\u0002H\r\"\u0004\b\u0000\u0010\r*\b\u0012\u0004\u0012\u0002H\r0\u000e2\u0006\u0010\u0012\u001a\u00020\u00132\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u0002H\r\u0012\u0004\u0012\u0002H\r0\u0015H\u0087\u0088\u0004b\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0017b\u0002\b\u0007b\u0002\b\u0018ø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0002¢\u0006\u0002\u0010 \u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006!"}, d2 = {"asJavaAtomicArray", "Ljava/util/concurrent/atomic/AtomicIntegerArray;", "Lkotlin/concurrent/atomics/AtomicIntArray;", "(Ljava/util/concurrent/atomic/AtomicIntegerArray;)Ljava/util/concurrent/atomic/AtomicIntegerArray;", "Lkotlin/SinceKotlin;", "version", "2.1", "Lkotlin/concurrent/atomics/ExperimentalAtomicApi;", "asKotlinAtomicArray", "Ljava/util/concurrent/atomic/AtomicLongArray;", "Lkotlin/concurrent/atomics/AtomicLongArray;", "(Ljava/util/concurrent/atomic/AtomicLongArray;)Ljava/util/concurrent/atomic/AtomicLongArray;", "Ljava/util/concurrent/atomic/AtomicReferenceArray;", "T", "Lkotlin/concurrent/atomics/AtomicArray;", "(Ljava/util/concurrent/atomic/AtomicReferenceArray;)Ljava/util/concurrent/atomic/AtomicReferenceArray;", "updateAt", "", "index", "", "transform", "Lkotlin/Function1;", "(Ljava/util/concurrent/atomic/AtomicIntegerArray;ILkotlin/jvm/functions/Function1;)V", "2.2", "Lkotlin/internal/InlineOnly;", "updateAndFetchAt", "(Ljava/util/concurrent/atomic/AtomicIntegerArray;ILkotlin/jvm/functions/Function1;)I", "fetchAndUpdateAt", "", "(Ljava/util/concurrent/atomic/AtomicLongArray;ILkotlin/jvm/functions/Function1;)V", "(Ljava/util/concurrent/atomic/AtomicLongArray;ILkotlin/jvm/functions/Function1;)J", "(Ljava/util/concurrent/atomic/AtomicReferenceArray;ILkotlin/jvm/functions/Function1;)V", "(Ljava/util/concurrent/atomic/AtomicReferenceArray;ILkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "kotlin-stdlib"}, k = 5, mv = {2, 4, 0}, xi = 49, xs = "kotlin/concurrent/atomics/AtomicArraysKt")
/* loaded from: classes24.dex */
class AtomicArraysKt__AtomicArrays_jvmKt extends AtomicArraysKt__AtomicArrays_commonKt {
    public static final AtomicIntegerArray asJavaAtomicArray(AtomicIntegerArray $this$asJavaAtomicArray) {
        Intrinsics.checkNotNullParameter($this$asJavaAtomicArray, "<this>");
        return $this$asJavaAtomicArray;
    }

    public static final AtomicIntegerArray asKotlinAtomicArray(AtomicIntegerArray $this$asKotlinAtomicArray) {
        Intrinsics.checkNotNullParameter($this$asKotlinAtomicArray, "<this>");
        return $this$asKotlinAtomicArray;
    }

    public static final AtomicLongArray asJavaAtomicArray(AtomicLongArray $this$asJavaAtomicArray) {
        Intrinsics.checkNotNullParameter($this$asJavaAtomicArray, "<this>");
        return $this$asJavaAtomicArray;
    }

    public static final AtomicLongArray asKotlinAtomicArray(AtomicLongArray $this$asKotlinAtomicArray) {
        Intrinsics.checkNotNullParameter($this$asKotlinAtomicArray, "<this>");
        return $this$asKotlinAtomicArray;
    }

    public static final <T> AtomicReferenceArray<T> asJavaAtomicArray(AtomicReferenceArray<T> atomicReferenceArray) {
        Intrinsics.checkNotNullParameter(atomicReferenceArray, "<this>");
        return atomicReferenceArray;
    }

    public static final <T> AtomicReferenceArray<T> asKotlinAtomicArray(AtomicReferenceArray<T> atomicReferenceArray) {
        Intrinsics.checkNotNullParameter(atomicReferenceArray, "<this>");
        return atomicReferenceArray;
    }

    private static final void updateAt(AtomicIntegerArray $this$updateAt, int index, Function1<? super Integer, Integer> transform) {
        int i;
        Intrinsics.checkNotNullParameter($this$updateAt, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        do {
            i = $this$updateAt.get(index);
        } while (!$this$updateAt.compareAndSet(index, i, transform.invoke(Integer.valueOf(i)).intValue()));
    }

    private static final int updateAndFetchAt(AtomicIntegerArray $this$updateAndFetchAt, int index, Function1<? super Integer, Integer> transform) {
        int old;
        int iIntValue;
        Intrinsics.checkNotNullParameter($this$updateAndFetchAt, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        do {
            old = $this$updateAndFetchAt.get(index);
            iIntValue = transform.invoke(Integer.valueOf(old)).intValue();
        } while (!$this$updateAndFetchAt.compareAndSet(index, old, iIntValue));
        return iIntValue;
    }

    private static final int fetchAndUpdateAt(AtomicIntegerArray $this$fetchAndUpdateAt, int index, Function1<? super Integer, Integer> transform) {
        int old;
        Intrinsics.checkNotNullParameter($this$fetchAndUpdateAt, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        do {
            old = $this$fetchAndUpdateAt.get(index);
        } while (!$this$fetchAndUpdateAt.compareAndSet(index, old, transform.invoke(Integer.valueOf(old)).intValue()));
        return old;
    }

    private static final void updateAt(AtomicLongArray $this$updateAt, int index, Function1<? super Long, Long> transform) {
        Intrinsics.checkNotNullParameter($this$updateAt, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        while (true) {
            long j = $this$updateAt.get(index);
            AtomicLongArray $this$updateAt2 = $this$updateAt;
            int index2 = index;
            if (!$this$updateAt2.compareAndSet(index2, j, transform.invoke(Long.valueOf(j)).longValue())) {
                $this$updateAt = $this$updateAt2;
                index = index2;
            } else {
                return;
            }
        }
    }

    private static final long updateAndFetchAt(AtomicLongArray $this$updateAndFetchAt, int index, Function1<? super Long, Long> transform) {
        Intrinsics.checkNotNullParameter($this$updateAndFetchAt, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        while (true) {
            long old = $this$updateAndFetchAt.get(index);
            long jLongValue = transform.invoke(Long.valueOf(old)).longValue();
            AtomicLongArray $this$updateAndFetchAt2 = $this$updateAndFetchAt;
            int index2 = index;
            if ($this$updateAndFetchAt2.compareAndSet(index2, old, jLongValue)) {
                return jLongValue;
            }
            $this$updateAndFetchAt = $this$updateAndFetchAt2;
            index = index2;
        }
    }

    private static final long fetchAndUpdateAt(AtomicLongArray $this$fetchAndUpdateAt, int index, Function1<? super Long, Long> transform) {
        Intrinsics.checkNotNullParameter($this$fetchAndUpdateAt, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        while (true) {
            long old = $this$fetchAndUpdateAt.get(index);
            AtomicLongArray $this$fetchAndUpdateAt2 = $this$fetchAndUpdateAt;
            int index2 = index;
            if ($this$fetchAndUpdateAt2.compareAndSet(index2, old, transform.invoke(Long.valueOf(old)).longValue())) {
                return old;
            }
            $this$fetchAndUpdateAt = $this$fetchAndUpdateAt2;
            index = index2;
        }
    }

    private static final <T> void updateAt(AtomicReferenceArray<T> atomicReferenceArray, int index, Function1<? super T, ? extends T> transform) {
        T t;
        Intrinsics.checkNotNullParameter(atomicReferenceArray, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        do {
            t = atomicReferenceArray.get(index);
        } while (!AtomicArraysKt__AtomicArrays_jvmKt$$ExternalSyntheticBackportWithForwarding0.m(atomicReferenceArray, index, t, transform.invoke(t)));
    }

    private static final <T> T updateAndFetchAt(AtomicReferenceArray<T> atomicReferenceArray, int index, Function1<? super T, ? extends T> transform) {
        Object old;
        T tInvoke;
        Intrinsics.checkNotNullParameter(atomicReferenceArray, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        do {
            old = atomicReferenceArray.get(index);
            tInvoke = transform.invoke(old);
        } while (!AtomicArraysKt__AtomicArrays_jvmKt$$ExternalSyntheticBackportWithForwarding0.m(atomicReferenceArray, index, old, tInvoke));
        return tInvoke;
    }

    private static final <T> T fetchAndUpdateAt(AtomicReferenceArray<T> atomicReferenceArray, int index, Function1<? super T, ? extends T> transform) {
        T t;
        Intrinsics.checkNotNullParameter(atomicReferenceArray, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        do {
            t = atomicReferenceArray.get(index);
        } while (!AtomicArraysKt__AtomicArrays_jvmKt$$ExternalSyntheticBackportWithForwarding0.m(atomicReferenceArray, index, t, transform.invoke(t)));
        return t;
    }
}
