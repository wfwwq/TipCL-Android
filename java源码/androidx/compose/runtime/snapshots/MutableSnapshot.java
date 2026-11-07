package androidx.compose.runtime.snapshots;

import androidx.collection.MutableScatterSet;
import androidx.collection.ScatterSet;
import androidx.collection.ScatterSetKt;
import androidx.compose.runtime.PreconditionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList;
import androidx.compose.runtime.snapshots.SnapshotApplyResult;
import androidx.compose.runtime.snapshots.tooling.SnapshotInstanceObservers;
import androidx.compose.runtime.snapshots.tooling.SnapshotObserverKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Snapshot.kt */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0015\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u001f\b\u0017\u0018\u0000 j2\u00020\u0001:\u0001jBG\b\u0000\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b\u0012\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b¢\u0006\u0002\u0010\fJ\b\u0010;\u001a\u00020\nH\u0002J\r\u0010<\u001a\u00020\nH\u0000¢\u0006\u0002\b=J$\u0010<\u001a\u0002H>\"\u0004\b\u0000\u0010>2\f\u0010?\u001a\b\u0012\u0004\u0012\u0002H>0@H\u0080\b¢\u0006\u0004\b=\u0010AJ\b\u0010B\u001a\u00020CH\u0016J\r\u0010D\u001a\u00020\nH\u0010¢\u0006\u0002\bEJ\b\u0010F\u001a\u00020\nH\u0016J\b\u0010G\u001a\u00020\u000eH\u0016JE\u0010H\u001a\u00020C2\n\u0010I\u001a\u00060\u0003j\u0002`\u00042\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00150\u001b2\u0014\u0010J\u001a\u0010\u0012\u0004\u0012\u00020L\u0012\u0004\u0012\u00020L\u0018\u00010K2\u0006\u0010M\u001a\u00020\u0006H\u0000¢\u0006\u0002\bNJ\u0015\u0010O\u001a\u00020\n2\u0006\u0010P\u001a\u00020\u0001H\u0010¢\u0006\u0002\bQJ\u0015\u0010R\u001a\u00020\n2\u0006\u0010P\u001a\u00020\u0001H\u0010¢\u0006\u0002\bSJ\r\u0010T\u001a\u00020\nH\u0010¢\u0006\u0002\bUJ\u0015\u0010V\u001a\u00020\n2\u0006\u0010W\u001a\u00020\u0015H\u0010¢\u0006\u0002\bXJ\u0019\u0010Y\u001a\u00020\n2\n\u0010Z\u001a\u00060\u0003j\u0002`\u0004H\u0000¢\u0006\u0002\b[J\u0015\u0010\\\u001a\u00020\n2\u0006\u00103\u001a\u00020\u0006H\u0000¢\u0006\u0002\b]J\u0015\u0010^\u001a\u00020\n2\u0006\u0010Z\u001a\u000204H\u0000¢\u0006\u0002\b_J\u0015\u0010`\u001a\u00020\n2\u0006\u0010a\u001a\u00020'H\u0000¢\u0006\u0002\bbJ\r\u0010c\u001a\u00020\nH\u0010¢\u0006\u0002\bdJ\b\u0010e\u001a\u00020\nH\u0002J8\u0010f\u001a\u00020\u00002\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b2\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\bH\u0016J\u001e\u0010g\u001a\u00020\u00012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\bH\u0016J\b\u0010h\u001a\u00020\nH\u0002J\b\u0010i\u001a\u00020\nH\u0002R\u001a\u0010\r\u001a\u00020\u000eX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\"\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R4\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u001b2\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u001b@VX\u0090\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010!\u001a\u00020\u0006X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001a\u0010&\u001a\u00020'X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\"\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\bX\u0090\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0014\u0010.\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b/\u0010\u0010R\u0014\u00100\u001a\u00020\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b1\u00102R\u000e\u00103\u001a\u000204X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u00105\u001a\u000204X\u0090\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\"\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\bX\u0090\u0004¢\u0006\b\n\u0000\u001a\u0004\b:\u0010-¨\u0006k"}, d2 = {"Landroidx/compose/runtime/snapshots/MutableSnapshot;", "Landroidx/compose/runtime/snapshots/Snapshot;", "snapshotId", "", "Landroidx/compose/runtime/snapshots/SnapshotId;", "invalid", "Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "readObserver", "Lkotlin/Function1;", "", "", "writeObserver", "(JLandroidx/compose/runtime/snapshots/SnapshotIdSet;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "applied", "", "getApplied$runtime_release", "()Z", "setApplied$runtime_release", "(Z)V", "merged", "", "Landroidx/compose/runtime/snapshots/StateObject;", "getMerged$runtime_release", "()Ljava/util/List;", "setMerged$runtime_release", "(Ljava/util/List;)V", "<set-?>", "Landroidx/collection/MutableScatterSet;", "modified", "getModified$runtime_release", "()Landroidx/collection/MutableScatterSet;", "setModified", "(Landroidx/collection/MutableScatterSet;)V", "previousIds", "getPreviousIds$runtime_release", "()Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "setPreviousIds$runtime_release", "(Landroidx/compose/runtime/snapshots/SnapshotIdSet;)V", "previousPinnedSnapshots", "", "getPreviousPinnedSnapshots$runtime_release", "()[I", "setPreviousPinnedSnapshots$runtime_release", "([I)V", "getReadObserver$runtime_release", "()Lkotlin/jvm/functions/Function1;", "readOnly", "getReadOnly", "root", "getRoot", "()Landroidx/compose/runtime/snapshots/Snapshot;", "snapshots", "", "writeCount", "getWriteCount$runtime_release", "()I", "setWriteCount$runtime_release", "(I)V", "getWriteObserver$runtime_release", "abandon", "advance", "advance$runtime_release", "T", "block", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "apply", "Landroidx/compose/runtime/snapshots/SnapshotApplyResult;", "closeLocked", "closeLocked$runtime_release", "dispose", "hasPendingChanges", "innerApplyLocked", "nextId", "optimisticMerges", "", "Landroidx/compose/runtime/snapshots/StateRecord;", "invalidSnapshots", "innerApplyLocked$runtime_release", "nestedActivated", "snapshot", "nestedActivated$runtime_release", "nestedDeactivated", "nestedDeactivated$runtime_release", "notifyObjectsInitialized", "notifyObjectsInitialized$runtime_release", "recordModified", "state", "recordModified$runtime_release", "recordPrevious", "id", "recordPrevious$runtime_release", "recordPreviousList", "recordPreviousList$runtime_release", "recordPreviousPinnedSnapshot", "recordPreviousPinnedSnapshot$runtime_release", "recordPreviousPinnedSnapshots", "handles", "recordPreviousPinnedSnapshots$runtime_release", "releasePinnedSnapshotsForCloseLocked", "releasePinnedSnapshotsForCloseLocked$runtime_release", "releasePreviouslyPinnedSnapshotsLocked", "takeNestedMutableSnapshot", "takeNestedSnapshot", "validateNotApplied", "validateNotAppliedOrPinned", "Companion", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public class MutableSnapshot extends Snapshot {
    private boolean applied;
    private List<? extends StateObject> merged;
    private MutableScatterSet<StateObject> modified;
    private SnapshotIdSet previousIds;
    private int[] previousPinnedSnapshots;
    private final Function1<Object, Unit> readObserver;
    private int snapshots;
    private int writeCount;
    private final Function1<Object, Unit> writeObserver;
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final int[] EmptyIntArray = new int[0];

    @Override // androidx.compose.runtime.snapshots.Snapshot
    /* renamed from: getReadObserver$runtime_release */
    public Function1<Object, Unit> getReadObserver() {
        return this.readObserver;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public Function1<Object, Unit> getWriteObserver$runtime_release() {
        return this.writeObserver;
    }

    public MutableSnapshot(long snapshotId, SnapshotIdSet invalid, Function1<Object, Unit> function1, Function1<Object, Unit> function12) {
        super(snapshotId, invalid, (DefaultConstructorMarker) null);
        this.readObserver = function1;
        this.writeObserver = function12;
        this.previousIds = SnapshotIdSet.INSTANCE.getEMPTY();
        this.previousPinnedSnapshots = EmptyIntArray;
        this.snapshots = 1;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public boolean hasPendingChanges() {
        MutableScatterSet<StateObject> modified$runtime_release = getModified$runtime_release();
        return modified$runtime_release != null && modified$runtime_release.isNotEmpty();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MutableSnapshot takeNestedMutableSnapshot$default(MutableSnapshot mutableSnapshot, Function1 function1, Function1 function12, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: takeNestedMutableSnapshot");
        }
        if ((i & 1) != 0) {
            function1 = null;
        }
        if ((i & 2) != 0) {
            function12 = null;
        }
        return mutableSnapshot.takeNestedMutableSnapshot(function1, function12);
    }

    public MutableSnapshot takeNestedMutableSnapshot(Function1<Object, Unit> readObserver, Function1<Object, Unit> writeObserver) {
        Map observerMap$iv;
        Function1 actualReadObserver$iv;
        Function1 actualWriteObserver$iv;
        long newId;
        SnapshotIdSet currentInvalid;
        Snapshot snapshot;
        validateNotDisposed$runtime_release();
        validateNotAppliedOrPinned();
        PersistentList observers$iv = SnapshotObserverKt.observers;
        if (observers$iv != null) {
            Pair result$iv = SnapshotObserverKt.mergeObservers(observers$iv, this, false, readObserver, writeObserver);
            SnapshotInstanceObservers mappedObservers$iv = result$iv.getFirst();
            Function1 actualReadObserver$iv2 = mappedObservers$iv.getReadObserver();
            Function1 actualWriteObserver$iv2 = mappedObservers$iv.getWriteObserver();
            Map observerMap$iv2 = result$iv.getSecond();
            observerMap$iv = observerMap$iv2;
            actualReadObserver$iv = actualReadObserver$iv2;
            actualWriteObserver$iv = actualWriteObserver$iv2;
        } else {
            observerMap$iv = null;
            actualReadObserver$iv = readObserver;
            actualWriteObserver$iv = writeObserver;
        }
        Function1 actualReadObserver = actualReadObserver$iv;
        Function1 actualWriteObserver = actualWriteObserver$iv;
        recordPrevious$runtime_release(getSnapshotId());
        Object lock$iv$iv = SnapshotKt.getLock();
        synchronized (lock$iv$iv) {
            try {
                newId = SnapshotKt.nextSnapshotId;
                SnapshotKt.nextSnapshotId++;
                SnapshotKt.openSnapshots = SnapshotKt.openSnapshots.set(newId);
                currentInvalid = getInvalid();
                setInvalid$runtime_release(currentInvalid.set(newId));
                try {
                } catch (Throwable th) {
                    th = th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                Snapshot nestedMutableSnapshot = new NestedMutableSnapshot(newId, SnapshotKt.addRange(currentInvalid, getSnapshotId() + 1, newId), SnapshotKt.mergedReadObserver$default(actualReadObserver, getReadObserver(), false, 4, null), SnapshotKt.mergedWriteObserver(actualWriteObserver, getWriteObserver$runtime_release()), this);
                if (getApplied() || getDisposed()) {
                    snapshot = nestedMutableSnapshot;
                } else {
                    long previousId$iv = getSnapshotId();
                    Object lock$iv$iv$iv = SnapshotKt.getLock();
                    synchronized (lock$iv$iv$iv) {
                        snapshot = nestedMutableSnapshot;
                        try {
                            long j = SnapshotKt.nextSnapshotId;
                            SnapshotKt.nextSnapshotId++;
                            try {
                                setSnapshotId$runtime_release(j);
                                SnapshotIdSet snapshotIdSet = SnapshotKt.openSnapshots;
                                try {
                                    long previousId$iv2 = getSnapshotId();
                                    SnapshotKt.openSnapshots = snapshotIdSet.set(previousId$iv2);
                                    Unit unit = Unit.INSTANCE;
                                    setInvalid$runtime_release(SnapshotKt.addRange(getInvalid(), previousId$iv + 1, getSnapshotId()));
                                } catch (Throwable th3) {
                                    th = th3;
                                    throw th;
                                }
                            } catch (Throwable th4) {
                                th = th4;
                            }
                        } catch (Throwable th5) {
                            th = th5;
                        }
                    }
                }
                Snapshot result$iv2 = snapshot;
                if (observers$iv != null) {
                    SnapshotObserverKt.dispatchCreatedObservers(observers$iv, this, result$iv2, observerMap$iv);
                }
                return (MutableSnapshot) result$iv2;
            } catch (Throwable th6) {
                th = th6;
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x019d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public androidx.compose.runtime.snapshots.SnapshotApplyResult apply() throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 632
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.MutableSnapshot.apply():androidx.compose.runtime.snapshots.SnapshotApplyResult");
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public boolean getReadOnly() {
        return false;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public Snapshot getRoot() {
        return this;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public void dispose() {
        if (!getDisposed()) {
            super.dispose();
            mo3949nestedDeactivated$runtime_release(this);
            SnapshotObserverKt.dispatchObserverOnPreDispose(this);
        }
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public Snapshot takeNestedSnapshot(Function1<Object, Unit> readObserver) throws Throwable {
        Function1 actualWriteObserver$iv;
        Map observerMap$iv;
        validateNotDisposed$runtime_release();
        validateNotAppliedOrPinned();
        long previousId = getSnapshotId();
        Snapshot parent$iv = this instanceof GlobalSnapshot ? null : this;
        PersistentList observers$iv = SnapshotObserverKt.observers;
        if (observers$iv == null) {
            actualWriteObserver$iv = readObserver;
            observerMap$iv = null;
        } else {
            Pair result$iv = SnapshotObserverKt.mergeObservers(observers$iv, parent$iv, true, readObserver, null);
            SnapshotInstanceObservers mappedObservers$iv = result$iv.getFirst();
            Function1 actualReadObserver$iv = mappedObservers$iv.getReadObserver();
            mappedObservers$iv.getWriteObserver();
            Map observerMap$iv2 = result$iv.getSecond();
            actualWriteObserver$iv = actualReadObserver$iv;
            observerMap$iv = observerMap$iv2;
        }
        Function1 actualReadObserver = actualWriteObserver$iv;
        recordPrevious$runtime_release(getSnapshotId());
        Object lock$iv$iv = SnapshotKt.getLock();
        synchronized (lock$iv$iv) {
            try {
                long readonlyId = SnapshotKt.nextSnapshotId;
                SnapshotKt.nextSnapshotId++;
                try {
                    SnapshotKt.openSnapshots = SnapshotKt.openSnapshots.set(readonlyId);
                    try {
                        Snapshot nestedReadonlySnapshot = new NestedReadonlySnapshot(readonlyId, SnapshotKt.addRange(getInvalid(), previousId + 1, readonlyId), SnapshotKt.mergedReadObserver$default(actualReadObserver, getReadObserver(), false, 4, null), this);
                        if (!getApplied() && !getDisposed()) {
                            long previousId$iv = getSnapshotId();
                            Object lock$iv$iv$iv = SnapshotKt.getLock();
                            synchronized (lock$iv$iv$iv) {
                                try {
                                    long j = SnapshotKt.nextSnapshotId;
                                    SnapshotKt.nextSnapshotId++;
                                    setSnapshotId$runtime_release(j);
                                    try {
                                        SnapshotKt.openSnapshots = SnapshotKt.openSnapshots.set(getSnapshotId());
                                        Unit unit = Unit.INSTANCE;
                                        setInvalid$runtime_release(SnapshotKt.addRange(getInvalid(), previousId$iv + 1, getSnapshotId()));
                                    } catch (Throwable th) {
                                        th = th;
                                        throw th;
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                }
                            }
                        }
                        Snapshot result$iv2 = nestedReadonlySnapshot;
                        if (observers$iv != null) {
                            SnapshotObserverKt.dispatchCreatedObservers(observers$iv, parent$iv, result$iv2, observerMap$iv);
                        }
                        return result$iv2;
                    } catch (Throwable th3) {
                        th = th3;
                        throw th;
                    }
                } catch (Throwable th4) {
                    th = th4;
                }
            } catch (Throwable th5) {
                th = th5;
            }
        }
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    /* renamed from: nestedActivated$runtime_release */
    public void mo3948nestedActivated$runtime_release(Snapshot snapshot) {
        this.snapshots++;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    /* renamed from: nestedDeactivated$runtime_release */
    public void mo3949nestedDeactivated$runtime_release(Snapshot snapshot) {
        boolean value$iv = this.snapshots > 0;
        if (!value$iv) {
            PreconditionsKt.throwIllegalArgumentException("no pending nested snapshots");
        }
        this.snapshots--;
        if (this.snapshots == 0 && !this.applied) {
            abandon();
        }
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public void notifyObjectsInitialized$runtime_release() {
        if (this.applied || getDisposed()) {
            return;
        }
        advance$runtime_release();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public void closeLocked$runtime_release() {
        SnapshotKt.openSnapshots = SnapshotKt.openSnapshots.clear(getSnapshotId()).andNot(this.previousIds);
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public void releasePinnedSnapshotsForCloseLocked$runtime_release() {
        releasePreviouslyPinnedSnapshotsLocked();
        super.releasePinnedSnapshotsForCloseLocked$runtime_release();
    }

    private final void validateNotApplied() {
        boolean value$iv = !this.applied;
        if (value$iv) {
            return;
        }
        PreconditionsKt.throwIllegalStateException("Unsupported operation on a snapshot that has been applied");
    }

    private final void validateNotAppliedOrPinned() {
        boolean value$iv = true;
        if (this.applied) {
            MutableSnapshot this_$iv = this;
            Snapshot this_$iv2 = ((Snapshot) this_$iv).pinningTrackingHandle >= 0 ? 1 : null;
            if (this_$iv2 == null) {
                value$iv = false;
            }
        }
        if (value$iv) {
            return;
        }
        PreconditionsKt.throwIllegalStateException("Unsupported operation on a disposed or applied snapshot");
    }

    private final void abandon() {
        ScatterSet this_$iv;
        int i;
        int j$iv$iv;
        ScatterSet this_$iv2;
        MutableSnapshot mutableSnapshot = this;
        MutableScatterSet modified = mutableSnapshot.getModified$runtime_release();
        if (modified != null) {
            mutableSnapshot.validateNotApplied();
            mutableSnapshot.setModified(null);
            long id = mutableSnapshot.getSnapshotId();
            MutableScatterSet this_$iv3 = modified;
            Object[] elements$iv = this_$iv3.elements;
            long[] m$iv$iv = this_$iv3.metadata;
            int lastIndex$iv$iv = m$iv$iv.length - 2;
            int i$iv$iv = 0;
            if (0 <= lastIndex$iv$iv) {
                while (true) {
                    long slot$iv$iv = m$iv$iv[i$iv$iv];
                    MutableScatterSet modified2 = modified;
                    long id2 = id;
                    if ((((~slot$iv$iv) << 7) & slot$iv$iv & (-9187201950435737472L)) == -9187201950435737472L) {
                        this_$iv = this_$iv3;
                    } else {
                        int i2 = 8;
                        int bitCount$iv$iv = 8 - ((~(i$iv$iv - lastIndex$iv$iv)) >>> 31);
                        int j$iv$iv2 = 0;
                        while (j$iv$iv2 < bitCount$iv$iv) {
                            long value$iv$iv$iv = 255 & slot$iv$iv;
                            if (!(value$iv$iv$iv < 128)) {
                                i = i2;
                            } else {
                                int index$iv$iv = (i$iv$iv << 3) + j$iv$iv2;
                                StateObject state = (StateObject) elements$iv[index$iv$iv];
                                i = i2;
                                StateRecord current = state.getFirstStateRecord();
                                while (current != null) {
                                    if (current.getSnapshotId() != id2) {
                                        j$iv$iv = j$iv$iv2;
                                        if (!CollectionsKt.contains(mutableSnapshot.previousIds, Long.valueOf(current.getSnapshotId()))) {
                                            this_$iv2 = this_$iv3;
                                        }
                                        current = current.getNext();
                                        this_$iv3 = this_$iv2;
                                        j$iv$iv2 = j$iv$iv;
                                        mutableSnapshot = this;
                                    } else {
                                        j$iv$iv = j$iv$iv2;
                                    }
                                    this_$iv2 = this_$iv3;
                                    current.setSnapshotId$runtime_release(SnapshotKt.INVALID_SNAPSHOT);
                                    current = current.getNext();
                                    this_$iv3 = this_$iv2;
                                    j$iv$iv2 = j$iv$iv;
                                    mutableSnapshot = this;
                                }
                            }
                            slot$iv$iv >>= i;
                            j$iv$iv2++;
                            this_$iv3 = this_$iv3;
                            i2 = i;
                            mutableSnapshot = this;
                        }
                        this_$iv = this_$iv3;
                        if (bitCount$iv$iv != i2) {
                            break;
                        }
                    }
                    if (i$iv$iv == lastIndex$iv$iv) {
                        break;
                    }
                    i$iv$iv++;
                    this_$iv3 = this_$iv;
                    modified = modified2;
                    id = id2;
                    mutableSnapshot = this;
                }
            }
        }
        closeAndReleasePinning$runtime_release();
    }

    public final SnapshotApplyResult innerApplyLocked$runtime_release(long nextId, MutableScatterSet<StateObject> modified, Map<StateRecord, ? extends StateRecord> optimisticMerges, SnapshotIdSet invalidSnapshots) {
        List list;
        List list2;
        SnapshotIdSet start;
        ScatterSet this_$iv$iv;
        int $i$f$forEachIndex;
        SnapshotIdSet start2;
        int i;
        int j$iv$iv;
        ScatterSet this_$iv$iv2;
        int $i$f$forEachIndex2;
        StateRecord previous;
        StateRecord merged;
        List it;
        List it2;
        List it3;
        Map<StateRecord, ? extends StateRecord> map = optimisticMerges;
        List list3 = null;
        SnapshotIdSet start3 = getInvalid().set(getSnapshotId()).or(this.previousIds);
        List list4 = null;
        MutableScatterSet<StateObject> this_$iv = modified;
        int $i$f$forEach = 0;
        Object[] elements$iv = this_$iv.elements;
        ScatterSet this_$iv$iv3 = this_$iv;
        int $i$f$forEachIndex3 = 0;
        long[] m$iv$iv = this_$iv$iv3.metadata;
        int lastIndex$iv$iv = m$iv$iv.length - 2;
        int i$iv$iv = 0;
        if (0 <= lastIndex$iv$iv) {
            while (true) {
                long slot$iv$iv = m$iv$iv[i$iv$iv];
                list2 = list4;
                ScatterSet this_$iv2 = this_$iv;
                int $i$f$forEach2 = $i$f$forEach;
                Object[] elements$iv2 = elements$iv;
                long $this$maskEmptyOrDeleted$iv$iv$iv = ((~slot$iv$iv) << 7) & slot$iv$iv & (-9187201950435737472L);
                if ($this$maskEmptyOrDeleted$iv$iv$iv != -9187201950435737472L) {
                    int i2 = 8;
                    int bitCount$iv$iv = 8 - ((~(i$iv$iv - lastIndex$iv$iv)) >>> 31);
                    int j$iv$iv2 = 0;
                    while (j$iv$iv2 < bitCount$iv$iv) {
                        long value$iv$iv$iv = slot$iv$iv & 255;
                        if (value$iv$iv$iv < 128) {
                            int index$iv$iv = (i$iv$iv << 3) + j$iv$iv2;
                            i = i2;
                            StateObject state = (StateObject) elements$iv2[index$iv$iv];
                            List list5 = list3;
                            StateRecord first = state.getFirstStateRecord();
                            j$iv$iv = j$iv$iv2;
                            StateRecord current = SnapshotKt.readable(first, nextId, invalidSnapshots);
                            if (current == null || (previous = SnapshotKt.readable(first, getSnapshotId(), start3)) == null || previous.getSnapshotId() == SnapshotId_jvmKt.toSnapshotId(1)) {
                                start2 = start3;
                                this_$iv$iv2 = this_$iv$iv3;
                                $i$f$forEachIndex2 = $i$f$forEachIndex3;
                                list3 = list5;
                            } else {
                                if (Intrinsics.areEqual(current, previous)) {
                                    start2 = start3;
                                    this_$iv$iv2 = this_$iv$iv3;
                                    $i$f$forEachIndex2 = $i$f$forEachIndex3;
                                } else {
                                    this_$iv$iv2 = this_$iv$iv3;
                                    $i$f$forEachIndex2 = $i$f$forEachIndex3;
                                    long snapshotId = getSnapshotId();
                                    start2 = start3;
                                    SnapshotIdSet start4 = getInvalid();
                                    StateRecord applied = SnapshotKt.readable(first, snapshotId, start4);
                                    if (applied == null) {
                                        SnapshotKt.readError();
                                        throw new KotlinNothingValueException();
                                    }
                                    if (map == null || (merged = map.get(current)) == null) {
                                        merged = state.mergeRecords(previous, current, applied);
                                    }
                                    if (merged == null) {
                                        return new SnapshotApplyResult.Failure(this);
                                    }
                                    if (!Intrinsics.areEqual(merged, applied)) {
                                        if (Intrinsics.areEqual(merged, current)) {
                                            if (list5 == null) {
                                                it2 = new ArrayList();
                                                list5 = it2;
                                            } else {
                                                it2 = list5;
                                            }
                                            it2.add(TuplesKt.to(state, current.create(getSnapshotId())));
                                            if (list2 == null) {
                                                it3 = new ArrayList();
                                                list2 = it3;
                                            } else {
                                                it3 = list2;
                                            }
                                            it3.add(state);
                                            list3 = list5;
                                        } else {
                                            if (list5 == null) {
                                                it = new ArrayList();
                                                list5 = it;
                                            } else {
                                                it = list5;
                                            }
                                            it.add(!Intrinsics.areEqual(merged, previous) ? TuplesKt.to(state, merged) : TuplesKt.to(state, previous.create(getSnapshotId())));
                                            list3 = list5;
                                        }
                                    }
                                }
                                list3 = list5;
                            }
                        } else {
                            start2 = start3;
                            i = i2;
                            j$iv$iv = j$iv$iv2;
                            this_$iv$iv2 = this_$iv$iv3;
                            $i$f$forEachIndex2 = $i$f$forEachIndex3;
                        }
                        slot$iv$iv >>= i;
                        j$iv$iv2 = j$iv$iv + 1;
                        map = optimisticMerges;
                        this_$iv$iv3 = this_$iv$iv2;
                        i2 = i;
                        $i$f$forEachIndex3 = $i$f$forEachIndex2;
                        start3 = start2;
                    }
                    list = list3;
                    start = start3;
                    this_$iv$iv = this_$iv$iv3;
                    $i$f$forEachIndex = $i$f$forEachIndex3;
                    if (bitCount$iv$iv != i2) {
                        break;
                    }
                    list3 = list;
                    list4 = list2;
                } else {
                    start = start3;
                    this_$iv$iv = this_$iv$iv3;
                    $i$f$forEachIndex = $i$f$forEachIndex3;
                    list4 = list2;
                }
                if (i$iv$iv == lastIndex$iv$iv) {
                    break;
                }
                i$iv$iv++;
                map = optimisticMerges;
                $i$f$forEach = $i$f$forEach2;
                elements$iv = elements$iv2;
                this_$iv = this_$iv2;
                this_$iv$iv3 = this_$iv$iv;
                $i$f$forEachIndex3 = $i$f$forEachIndex;
                start3 = start;
            }
        }
        list = list3;
        list2 = list4;
        if (list != null) {
            List it4 = list;
            advance$runtime_release();
            int size = it4.size();
            for (int index$iv = 0; index$iv < size; index$iv++) {
                Object item$iv = it4.get(index$iv);
                Pair merged2 = (Pair) item$iv;
                StateObject state2 = (StateObject) merged2.component1();
                StateRecord stateRecord = (StateRecord) merged2.component2();
                stateRecord.setSnapshotId$runtime_release(nextId);
                Object lock$iv$iv = SnapshotKt.getLock();
                synchronized (lock$iv$iv) {
                    stateRecord.setNext$runtime_release(state2.getFirstStateRecord());
                    state2.prependStateRecord(stateRecord);
                    Unit unit = Unit.INSTANCE;
                }
            }
        }
        if (list2 != null) {
            List list6 = list2;
            int size2 = list6.size();
            for (int index$iv2 = 0; index$iv2 < size2; index$iv2++) {
                Object item$iv2 = list6.get(index$iv2);
                modified.remove((StateObject) item$iv2);
            }
            List $this$fastForEach$iv = this.merged;
            this.merged = $this$fastForEach$iv == null ? list6 : CollectionsKt.plus((Collection) $this$fastForEach$iv, (Iterable) list6);
        }
        return SnapshotApplyResult.Success.INSTANCE;
    }

    public final <T> T advance$runtime_release(Function0<? extends T> block) {
        recordPrevious$runtime_release(getSnapshotId());
        T tInvoke = block.invoke();
        if (!getApplied() && !getDisposed()) {
            long previousId = getSnapshotId();
            Object lock$iv$iv = SnapshotKt.getLock();
            synchronized (lock$iv$iv) {
                long j = SnapshotKt.nextSnapshotId;
                SnapshotKt.nextSnapshotId++;
                setSnapshotId$runtime_release(j);
                SnapshotKt.openSnapshots = SnapshotKt.openSnapshots.set(getSnapshotId());
                Unit unit = Unit.INSTANCE;
            }
            setInvalid$runtime_release(SnapshotKt.addRange(getInvalid(), previousId + 1, getSnapshotId()));
        }
        return tInvoke;
    }

    public final void advance$runtime_release() {
        recordPrevious$runtime_release(getSnapshotId());
        Unit unit = Unit.INSTANCE;
        if (getApplied() || getDisposed()) {
            return;
        }
        long previousId$iv = getSnapshotId();
        Object lock$iv$iv$iv = SnapshotKt.getLock();
        synchronized (lock$iv$iv$iv) {
            long j = SnapshotKt.nextSnapshotId;
            SnapshotKt.nextSnapshotId++;
            setSnapshotId$runtime_release(j);
            SnapshotKt.openSnapshots = SnapshotKt.openSnapshots.set(getSnapshotId());
            Unit unit2 = Unit.INSTANCE;
        }
        setInvalid$runtime_release(SnapshotKt.addRange(getInvalid(), previousId$iv + 1, getSnapshotId()));
    }

    public final void recordPrevious$runtime_release(long id) {
        Object lock$iv$iv = SnapshotKt.getLock();
        synchronized (lock$iv$iv) {
            this.previousIds = this.previousIds.set(id);
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void recordPreviousPinnedSnapshot$runtime_release(int id) {
        if (id >= 0) {
            this.previousPinnedSnapshots = ArraysKt.plus(this.previousPinnedSnapshots, id);
        }
    }

    public final void recordPreviousPinnedSnapshots$runtime_release(int[] handles) {
        if (handles.length == 0) {
            return;
        }
        int[] pinned = this.previousPinnedSnapshots;
        this.previousPinnedSnapshots = pinned.length == 0 ? handles : ArraysKt.plus(pinned, handles);
    }

    private final void releasePreviouslyPinnedSnapshotsLocked() {
        int length = this.previousPinnedSnapshots.length;
        for (int index = 0; index < length; index++) {
            SnapshotKt.releasePinningLocked(this.previousPinnedSnapshots[index]);
        }
    }

    public final void recordPreviousList$runtime_release(SnapshotIdSet snapshots) {
        Object lock$iv$iv = SnapshotKt.getLock();
        synchronized (lock$iv$iv) {
            this.previousIds = this.previousIds.or(snapshots);
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    /* renamed from: recordModified$runtime_release */
    public void mo3950recordModified$runtime_release(StateObject state) {
        MutableScatterSet it = getModified$runtime_release();
        if (it == null) {
            it = ScatterSetKt.mutableScatterSetOf();
            setModified(it);
        }
        it.add(state);
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    /* renamed from: getWriteCount$runtime_release, reason: from getter */
    public int getWriteCount() {
        return this.writeCount;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public void setWriteCount$runtime_release(int i) {
        this.writeCount = i;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public MutableScatterSet<StateObject> getModified$runtime_release() {
        return this.modified;
    }

    public void setModified(MutableScatterSet<StateObject> mutableScatterSet) {
        this.modified = mutableScatterSet;
    }

    public final List<StateObject> getMerged$runtime_release() {
        return this.merged;
    }

    public final void setMerged$runtime_release(List<? extends StateObject> list) {
        this.merged = list;
    }

    /* renamed from: getPreviousIds$runtime_release, reason: from getter */
    public final SnapshotIdSet getPreviousIds() {
        return this.previousIds;
    }

    public final void setPreviousIds$runtime_release(SnapshotIdSet snapshotIdSet) {
        this.previousIds = snapshotIdSet;
    }

    /* renamed from: getPreviousPinnedSnapshots$runtime_release, reason: from getter */
    public final int[] getPreviousPinnedSnapshots() {
        return this.previousPinnedSnapshots;
    }

    public final void setPreviousPinnedSnapshots$runtime_release(int[] iArr) {
        this.previousPinnedSnapshots = iArr;
    }

    /* renamed from: getApplied$runtime_release, reason: from getter */
    public final boolean getApplied() {
        return this.applied;
    }

    public final void setApplied$runtime_release(boolean z) {
        this.applied = z;
    }

    /* compiled from: Snapshot.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Landroidx/compose/runtime/snapshots/MutableSnapshot$Companion;", "", "()V", "EmptyIntArray", "", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
