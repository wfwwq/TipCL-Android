package androidx.compose.runtime.snapshots;

import androidx.autofill.HintConstants;
import com.pymcl.runtime.input.InputSettings;
import com.pymcl.runtime.settings.SettingsProtocol;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.sequences.SequenceScope;
import kotlin.sequences.SequencesKt;

/* compiled from: SnapshotIdSet.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0016\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010(\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0001\u0018\u0000 &2\f\u0012\b\u0012\u00060\u0002j\u0002`\u00030\u0001:\u0001&B3\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\u0010\u0006\u001a\u00060\u0002j\u0002`\u0003\u0012\u000e\u0010\u0007\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\t¢\u0006\u0002\u0010\nJ\u000e\u0010\u000b\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u0000J\u000e\u0010\r\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u0000J\u0012\u0010\u000e\u001a\u00020\u00002\n\u0010\u000f\u001a\u00060\u0002j\u0002`\u0003J>\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00002+\u0010\u0012\u001a'\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0016\u0012\b\u0012\u00060\u0002j\u0002`\u0003\u0012\u0004\u0012\u00020\u00000\u0013H\u0082\bJ!\u0010\u0017\u001a\u00020\u00182\u0016\u0010\u0019\u001a\u0012\u0012\b\u0012\u00060\u0002j\u0002`\u0003\u0012\u0004\u0012\u00020\u00180\u001aH\u0086\bJ\u0012\u0010\u001b\u001a\u00020\u001c2\n\u0010\u000f\u001a\u00060\u0002j\u0002`\u0003J\u0013\u0010\u001d\u001a\f\u0012\b\u0012\u00060\u0002j\u0002`\u00030\u001eH\u0096\u0002J\u0016\u0010\u001f\u001a\u00060\u0002j\u0002`\u00032\n\u0010 \u001a\u00060\u0002j\u0002`\u0003J\u000e\u0010!\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020\u0000J\u0012\u0010#\u001a\u00020\u00002\n\u0010\u000f\u001a\u00060\u0002j\u0002`\u0003J\b\u0010$\u001a\u00020%H\u0016R\u0016\u0010\u0007\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u00060\u0002j\u0002`\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0002X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0002X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "", "", "Landroidx/compose/runtime/snapshots/SnapshotId;", "upperSet", "lowerSet", "lowerBound", "belowBound", "", "Landroidx/compose/runtime/snapshots/SnapshotIdArray;", "(JJJ[J)V", "and", "ids", "andNot", "clear", "id", "fastFold", "initial", "operation", "Lkotlin/Function2;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "acc", "fastForEach", "", "block", "Lkotlin/Function1;", SettingsProtocol.GET, "", "iterator", "", "lowest", InputSettings.DEFAULT_LAYOUT, "or", "bits", "set", "toString", "", "Companion", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SnapshotIdSet implements Iterable<Long>, KMappedMarker {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final SnapshotIdSet EMPTY = new SnapshotIdSet(0, 0, 0, null);
    private final long[] belowBound;
    private final long lowerBound;
    private final long lowerSet;
    private final long upperSet;

    private SnapshotIdSet(long upperSet, long lowerSet, long lowerBound, long[] belowBound) {
        this.upperSet = upperSet;
        this.lowerSet = lowerSet;
        this.lowerBound = lowerBound;
        this.belowBound = belowBound;
    }

    public final boolean get(long id) {
        long[] it;
        long offset = id - this.lowerBound;
        return (offset < 0 || offset >= 64) ? (offset < 64 || offset >= 128) ? offset <= 0 && (it = this.belowBound) != null && SnapshotId_jvmKt.binarySearch(it, id) >= 0 : ((1 << (((int) offset) + (-64))) & this.upperSet) != 0 : ((1 << ((int) offset)) & this.lowerSet) != 0;
    }

    public final SnapshotIdSet set(long id) {
        long newLowerSet;
        long newLowerBound;
        long[] array;
        long offset = id - this.lowerBound;
        long j = 1;
        if (offset >= 0 && offset < 64) {
            long mask = 1 << ((int) offset);
            if ((this.lowerSet & mask) == 0) {
                return new SnapshotIdSet(this.upperSet, this.lowerSet | mask, this.lowerBound, this.belowBound);
            }
        } else if (offset >= 64 && offset < 128) {
            long mask2 = 1 << (((int) offset) - 64);
            if ((this.upperSet & mask2) == 0) {
                return new SnapshotIdSet(this.upperSet | mask2, this.lowerSet, this.lowerBound, this.belowBound);
            }
        } else if (offset < 128) {
            long[] array2 = this.belowBound;
            if (array2 == null) {
                return new SnapshotIdSet(this.upperSet, this.lowerSet, this.lowerBound, new long[]{id});
            }
            int location = SnapshotId_jvmKt.binarySearch(array2, id);
            if (location < 0) {
                int insertLocation = -(location + 1);
                long[] newBelowBound = SnapshotId_jvmKt.withIdInsertedAt(array2, insertLocation, id);
                return new SnapshotIdSet(this.upperSet, this.lowerSet, this.lowerBound, newBelowBound);
            }
        } else if (!get(id)) {
            long newUpperSet = this.upperSet;
            long newLowerSet2 = this.lowerSet;
            long newLowerBound2 = this.lowerBound;
            SnapshotIdArrayBuilder snapshotIdArrayBuilder = null;
            long newLowerBound3 = newLowerBound2;
            long j2 = 64;
            long it = ((id + 1) / j2) * j2;
            if (it < 0) {
                it = 9223372036854775680L;
            }
            long newUpperSet2 = newUpperSet;
            while (true) {
                if (newLowerBound3 >= it) {
                    newLowerSet = newLowerSet2;
                    newLowerBound = newLowerBound3;
                    break;
                }
                if (newLowerSet2 != 0) {
                    if (snapshotIdArrayBuilder == null) {
                        snapshotIdArrayBuilder = new SnapshotIdArrayBuilder(this.belowBound);
                    }
                    int i = 0;
                    while (i < 64) {
                        int bitOffset = i;
                        if ((newLowerSet2 & (j << bitOffset)) != 0) {
                            snapshotIdArrayBuilder.add(newLowerBound3 + bitOffset);
                        }
                        i++;
                        j = 1;
                    }
                }
                if (newUpperSet2 == 0) {
                    long newLowerBound4 = it;
                    newLowerSet = 0;
                    newLowerBound = newLowerBound4;
                    break;
                }
                newLowerSet2 = newUpperSet2;
                newUpperSet2 = 0;
                newLowerBound3 += j2;
                j = 1;
            }
            if (snapshotIdArrayBuilder == null || (array = snapshotIdArrayBuilder.toArray()) == null) {
                array = this.belowBound;
            }
            return new SnapshotIdSet(newUpperSet2, newLowerSet, newLowerBound, array).set(id);
        }
        return this;
    }

    public final SnapshotIdSet clear(long id) {
        long[] array;
        int location;
        long offset = id - this.lowerBound;
        if (offset >= 0 && offset < 64) {
            long mask = 1 << ((int) offset);
            if ((this.lowerSet & mask) != 0) {
                return new SnapshotIdSet(this.upperSet, (~mask) & this.lowerSet, this.lowerBound, this.belowBound);
            }
        } else if (offset >= 64 && offset < 128) {
            long mask2 = 1 << (((int) offset) - 64);
            if ((this.upperSet & mask2) != 0) {
                return new SnapshotIdSet((~mask2) & this.upperSet, this.lowerSet, this.lowerBound, this.belowBound);
            }
        } else if (offset < 0 && (array = this.belowBound) != null && (location = SnapshotId_jvmKt.binarySearch(array, id)) >= 0) {
            return new SnapshotIdSet(this.upperSet, this.lowerSet, this.lowerBound, SnapshotId_jvmKt.withIdRemovedAt(array, location));
        }
        return this;
    }

    public final SnapshotIdSet andNot(SnapshotIdSet ids) {
        if (ids == EMPTY) {
            return this;
        }
        if (this == EMPTY) {
            return EMPTY;
        }
        if (ids.lowerBound == this.lowerBound && ids.belowBound == this.belowBound) {
            return new SnapshotIdSet((~ids.upperSet) & this.upperSet, (~ids.lowerSet) & this.lowerSet, this.lowerBound, this.belowBound);
        }
        SnapshotIdSet this_$iv = ids;
        Object accumulator$iv = this;
        long[] $this$forEach$iv$iv$iv = this_$iv.belowBound;
        if ($this$forEach$iv$iv$iv != null) {
            int length = $this$forEach$iv$iv$iv.length;
            int i = 0;
            while (i < length) {
                long value$iv$iv$iv = $this$forEach$iv$iv$iv[i];
                SnapshotIdSet previous = (SnapshotIdSet) accumulator$iv;
                accumulator$iv = previous.clear(value$iv$iv$iv);
                i++;
                this_$iv = this_$iv;
            }
        }
        if (this_$iv.lowerSet != 0) {
            for (int index$iv$iv = 0; index$iv$iv < 64; index$iv$iv++) {
                if ((this_$iv.lowerSet & (1 << index$iv$iv)) != 0) {
                    long element$iv = this_$iv.lowerBound + index$iv$iv;
                    SnapshotIdSet previous2 = (SnapshotIdSet) accumulator$iv;
                    accumulator$iv = previous2.clear(element$iv);
                }
            }
        }
        if (this_$iv.upperSet != 0) {
            for (int index$iv$iv2 = 0; index$iv$iv2 < 64; index$iv$iv2++) {
                if ((this_$iv.upperSet & (1 << index$iv$iv2)) != 0) {
                    long element$iv2 = this_$iv.lowerBound + index$iv$iv2 + 64;
                    SnapshotIdSet previous3 = (SnapshotIdSet) accumulator$iv;
                    accumulator$iv = previous3.clear(element$iv2);
                }
            }
        }
        return (SnapshotIdSet) accumulator$iv;
    }

    public final SnapshotIdSet and(SnapshotIdSet ids) {
        SnapshotIdSet this_$iv;
        long j;
        long j2;
        if (!Intrinsics.areEqual(ids, EMPTY) && !Intrinsics.areEqual(this, EMPTY)) {
            if (ids.lowerBound == this.lowerBound && ids.belowBound == this.belowBound) {
                long newUpper = this.upperSet & ids.upperSet;
                long newLower = this.lowerSet & ids.lowerSet;
                if (newUpper == 0 && newLower == 0 && this.belowBound == null) {
                    return EMPTY;
                }
                return new SnapshotIdSet(ids.upperSet & this.upperSet, ids.lowerSet & this.lowerSet, this.lowerBound, this.belowBound);
            }
            int i = 0;
            if (this.belowBound == null) {
                SnapshotIdSet previous = EMPTY;
                long[] $this$forEach$iv$iv$iv = this.belowBound;
                if ($this$forEach$iv$iv$iv != null) {
                    j = 0;
                    int length = $this$forEach$iv$iv$iv.length;
                    while (i < length) {
                        long value$iv$iv$iv = $this$forEach$iv$iv$iv[i];
                        SnapshotIdSet previous2 = previous;
                        if (ids.get(value$iv$iv$iv)) {
                            previous2 = previous2.set(value$iv$iv$iv);
                        }
                        previous = previous2;
                        i++;
                    }
                    j2 = 1;
                } else {
                    j = 0;
                    j2 = 1;
                }
                if (this.lowerSet != j) {
                    for (int index$iv$iv = 0; index$iv$iv < 64; index$iv$iv++) {
                        if ((this.lowerSet & (j2 << index$iv$iv)) != j) {
                            long element$iv = this.lowerBound + index$iv$iv;
                            SnapshotIdSet previous3 = previous;
                            if (ids.get(element$iv)) {
                                previous3 = previous3.set(element$iv);
                            }
                            previous = previous3;
                        }
                    }
                }
                if (this.upperSet != j) {
                    for (int index$iv$iv2 = 0; index$iv$iv2 < 64; index$iv$iv2++) {
                        if ((this.upperSet & (j2 << index$iv$iv2)) != j) {
                            long element$iv2 = this.lowerBound + index$iv$iv2 + 64;
                            SnapshotIdSet previous4 = previous;
                            if (ids.get(element$iv2)) {
                                previous4 = previous4.set(element$iv2);
                            }
                            previous = previous4;
                        }
                    }
                }
                return previous;
            }
            SnapshotIdSet initial$iv = EMPTY;
            SnapshotIdSet this_$iv2 = ids;
            SnapshotIdSet previous5 = initial$iv;
            long[] $this$forEach$iv$iv$iv2 = this_$iv2.belowBound;
            if ($this$forEach$iv$iv$iv2 != null) {
                int length2 = $this$forEach$iv$iv$iv2.length;
                while (i < length2) {
                    long value$iv$iv$iv2 = $this$forEach$iv$iv$iv2[i];
                    SnapshotIdSet previous6 = previous5;
                    SnapshotIdSet initial$iv2 = initial$iv;
                    if (get(value$iv$iv$iv2)) {
                        this_$iv = this_$iv2;
                        previous6 = previous6.set(value$iv$iv$iv2);
                    } else {
                        this_$iv = this_$iv2;
                    }
                    previous5 = previous6;
                    i++;
                    this_$iv2 = this_$iv;
                    initial$iv = initial$iv2;
                }
            }
            if (this_$iv2.lowerSet != 0) {
                for (int index$iv$iv3 = 0; index$iv$iv3 < 64; index$iv$iv3++) {
                    if ((this_$iv2.lowerSet & (1 << index$iv$iv3)) != 0) {
                        long element$iv3 = this_$iv2.lowerBound + index$iv$iv3;
                        SnapshotIdSet previous7 = previous5;
                        if (get(element$iv3)) {
                            previous7 = previous7.set(element$iv3);
                        }
                        previous5 = previous7;
                    }
                }
            }
            if (this_$iv2.upperSet == 0) {
                return previous5;
            }
            for (int index$iv$iv4 = 0; index$iv$iv4 < 64; index$iv$iv4++) {
                if ((this_$iv2.upperSet & (1 << index$iv$iv4)) != 0) {
                    long element$iv4 = this_$iv2.lowerBound + index$iv$iv4 + 64;
                    SnapshotIdSet previous8 = previous5;
                    if (get(element$iv4)) {
                        previous8 = previous8.set(element$iv4);
                    }
                    previous5 = previous8;
                }
            }
            return previous5;
        }
        return EMPTY;
    }

    public final SnapshotIdSet or(SnapshotIdSet bits) {
        SnapshotIdSet this_$iv$iv;
        long j;
        long j2;
        if (bits == EMPTY) {
            return this;
        }
        if (this == EMPTY) {
            return bits;
        }
        if (bits.lowerBound == this.lowerBound && bits.belowBound == this.belowBound) {
            return new SnapshotIdSet(bits.upperSet | this.upperSet, bits.lowerSet | this.lowerSet, this.lowerBound, this.belowBound);
        }
        int i = 0;
        if (this.belowBound != null) {
            Object accumulator$iv = this;
            SnapshotIdSet this_$iv$iv2 = bits;
            long[] $this$forEach$iv$iv$iv = this_$iv$iv2.belowBound;
            if ($this$forEach$iv$iv$iv != null) {
                int length = $this$forEach$iv$iv$iv.length;
                while (i < length) {
                    long value$iv$iv$iv = $this$forEach$iv$iv$iv[i];
                    SnapshotIdSet previous = (SnapshotIdSet) accumulator$iv;
                    accumulator$iv = previous.set(value$iv$iv$iv);
                    i++;
                    this_$iv$iv2 = this_$iv$iv2;
                }
                this_$iv$iv = this_$iv$iv2;
            } else {
                this_$iv$iv = this_$iv$iv2;
            }
            if (this_$iv$iv.lowerSet != 0) {
                for (int index$iv$iv = 0; index$iv$iv < 64; index$iv$iv++) {
                    if ((this_$iv$iv.lowerSet & (1 << index$iv$iv)) != 0) {
                        long element$iv = this_$iv$iv.lowerBound + index$iv$iv;
                        SnapshotIdSet previous2 = (SnapshotIdSet) accumulator$iv;
                        accumulator$iv = previous2.set(element$iv);
                    }
                }
            }
            if (this_$iv$iv.upperSet != 0) {
                for (int index$iv$iv2 = 0; index$iv$iv2 < 64; index$iv$iv2++) {
                    if ((this_$iv$iv.upperSet & (1 << index$iv$iv2)) != 0) {
                        long element$iv2 = this_$iv$iv.lowerBound + index$iv$iv2 + 64;
                        SnapshotIdSet previous3 = (SnapshotIdSet) accumulator$iv;
                        accumulator$iv = previous3.set(element$iv2);
                    }
                }
            }
            return (SnapshotIdSet) accumulator$iv;
        }
        SnapshotIdSet snapshotIdSet = bits;
        long[] $this$forEach$iv$iv$iv2 = this.belowBound;
        if ($this$forEach$iv$iv$iv2 != null) {
            int length2 = $this$forEach$iv$iv$iv2.length;
            while (i < length2) {
                long value$iv$iv$iv2 = $this$forEach$iv$iv$iv2[i];
                SnapshotIdSet previous4 = snapshotIdSet;
                snapshotIdSet = previous4.set(value$iv$iv$iv2);
                i++;
            }
            j = 0;
            j2 = 1;
        } else {
            j = 0;
            j2 = 1;
        }
        if (this.lowerSet != j) {
            for (int index$iv$iv3 = 0; index$iv$iv3 < 64; index$iv$iv3++) {
                if ((this.lowerSet & (j2 << index$iv$iv3)) != j) {
                    long element$iv3 = this.lowerBound + index$iv$iv3;
                    SnapshotIdSet previous5 = snapshotIdSet;
                    snapshotIdSet = previous5.set(element$iv3);
                }
            }
        }
        if (this.upperSet == j) {
            return snapshotIdSet;
        }
        for (int index$iv$iv4 = 0; index$iv$iv4 < 64; index$iv$iv4++) {
            if ((this.upperSet & (j2 << index$iv$iv4)) != j) {
                long element$iv4 = this.lowerBound + index$iv$iv4 + 64;
                SnapshotIdSet previous6 = snapshotIdSet;
                snapshotIdSet = previous6.set(element$iv4);
            }
        }
        return snapshotIdSet;
    }

    /* compiled from: SnapshotIdSet.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\f\u0012\b\u0012\u00060\u0003j\u0002`\u00040\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlin/sequences/SequenceScope;", "", "Landroidx/compose/runtime/snapshots/SnapshotId;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.runtime.snapshots.SnapshotIdSet$iterator$1", f = "SnapshotIdSet.kt", i = {0, 0, 1, 1, 2, 2}, l = {252, 256, 263}, m = "invokeSuspend", n = {"$this$sequence", "$this$forEach$iv", "$this$sequence", "index", "$this$sequence", "index"}, s = {"L$0", "L$1", "L$0", "I$0", "L$0", "I$0"})
    /* renamed from: androidx.compose.runtime.snapshots.SnapshotIdSet$iterator$1, reason: invalid class name */
    static final class AnonymousClass1 extends RestrictedSuspendLambda implements Function2<SequenceScope<? super Long>, Continuation<? super Unit>, Object> {
        int I$0;
        int I$1;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = SnapshotIdSet.this.new AnonymousClass1(continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(SequenceScope<? super Long> sequenceScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(sequenceScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x006d  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0091  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x00a2  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x00aa  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x00d9  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00e4  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x00ed  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x011e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0089 -> B:17:0x008c). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x00b5 -> B:30:0x00d7). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00d3 -> B:30:0x00d7). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00f8 -> B:42:0x011c). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x0118 -> B:42:0x011c). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r23) {
            /*
                Method dump skipped, instructions count: 302
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.SnapshotIdSet.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Override // java.lang.Iterable
    public Iterator<Long> iterator() {
        return SequencesKt.sequence(new AnonymousClass1(null)).iterator();
    }

    private final SnapshotIdSet fastFold(SnapshotIdSet initial, Function2<? super SnapshotIdSet, ? super Long, SnapshotIdSet> operation) {
        Object accumulator = initial;
        long[] $this$forEach$iv$iv = this.belowBound;
        if ($this$forEach$iv$iv != null) {
            for (long value$iv$iv : $this$forEach$iv$iv) {
                accumulator = operation.invoke(accumulator, Long.valueOf(value$iv$iv));
            }
        }
        if (this.lowerSet != 0) {
            for (int index$iv = 0; index$iv < 64; index$iv++) {
                if ((this.lowerSet & (1 << index$iv)) != 0) {
                    long element = this.lowerBound + index$iv;
                    accumulator = operation.invoke(accumulator, Long.valueOf(element));
                }
            }
        }
        if (this.upperSet != 0) {
            for (int index$iv2 = 0; index$iv2 < 64; index$iv2++) {
                if ((this.upperSet & (1 << index$iv2)) != 0) {
                    long element2 = this.lowerBound + index$iv2 + 64;
                    accumulator = operation.invoke(accumulator, Long.valueOf(element2));
                }
            }
        }
        return (SnapshotIdSet) accumulator;
    }

    public final void fastForEach(Function1<? super Long, Unit> block) {
        long[] $this$forEach$iv = this.belowBound;
        if ($this$forEach$iv != null) {
            for (long value$iv : $this$forEach$iv) {
                block.invoke(Long.valueOf(value$iv));
            }
        }
        if (this.lowerSet != 0) {
            for (int index = 0; index < 64; index++) {
                if ((this.lowerSet & (1 << index)) != 0) {
                    block.invoke(Long.valueOf(this.lowerBound + index));
                }
            }
        }
        if (this.upperSet != 0) {
            for (int index2 = 0; index2 < 64; index2++) {
                if ((this.upperSet & (1 << index2)) != 0) {
                    block.invoke(Long.valueOf(this.lowerBound + index2 + 64));
                }
            }
        }
    }

    public final long lowest(long j) {
        long[] belowBound = this.belowBound;
        if (belowBound != null) {
            return belowBound[0];
        }
        return this.lowerSet != 0 ? this.lowerBound + Long.numberOfTrailingZeros(this.lowerSet) : this.upperSet != 0 ? this.lowerBound + 64 + Long.numberOfTrailingZeros(this.upperSet) : j;
    }

    public String toString() {
        StringBuilder sbAppend = new StringBuilder().append(super.toString()).append(" [");
        SnapshotIdSet $this$map$iv = this;
        Collection destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10));
        for (Object item$iv$iv : $this$map$iv) {
            long it = ((Number) item$iv$iv).longValue();
            destination$iv$iv.add(String.valueOf(it));
        }
        return sbAppend.append(ListUtilsKt.fastJoinToString$default((List) destination$iv$iv, null, null, null, 0, null, null, 63, null)).append(']').toString();
    }

    /* compiled from: SnapshotIdSet.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotIdSet$Companion;", "", "()V", "EMPTY", "Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "getEMPTY", "()Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final SnapshotIdSet getEMPTY() {
            return SnapshotIdSet.EMPTY;
        }
    }
}
