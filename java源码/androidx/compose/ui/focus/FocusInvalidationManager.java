package androidx.compose.ui.focus;

import androidx.collection.MutableScatterSet;
import androidx.collection.ScatterSet;
import androidx.collection.ScatterSetKt;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.ComposeUiFlags;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeChain;
import androidx.compose.ui.node.NodeKind;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: FocusInvalidationManager.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001BK\u0012\u0018\u0010\u0002\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0004\u0012\u000e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0004¢\u0006\u0002\u0010\u000bJ\u0006\u0010\u0018\u001a\u00020\u0017J\b\u0010\u0019\u001a\u00020\u0005H\u0002J\b\u0010\u001a\u001a\u00020\u0005H\u0002J\b\u0010\u001b\u001a\u00020\u0005H\u0002J\u000e\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u000eJ\u000e\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u0012J\u000e\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\nJ\u0006\u0010\u001e\u001a\u00020\u0005J\b\u0010\u001f\u001a\u00020\u0005H\u0002J%\u0010\u001c\u001a\u00020\u0005\"\u0004\b\u0000\u0010 *\b\u0012\u0004\u0012\u0002H 0\r2\u0006\u0010\u001d\u001a\u0002H H\u0002¢\u0006\u0002\u0010!J%\u0010\"\u001a\u00020\u0005\"\u0004\b\u0000\u0010 *\b\u0012\u0004\u0012\u0002H 0\u00102\u0006\u0010\u001d\u001a\u0002H H\u0002¢\u0006\u0002\u0010#R\u0016\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\n0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\n0\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\n0\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R \u0010\u0002\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u00050\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Landroidx/compose/ui/focus/FocusInvalidationManager;", "", "onRequestApplyChangesListener", "Lkotlin/Function1;", "Lkotlin/Function0;", "", "invalidateOwnerFocusState", "rootFocusStateFetcher", "Landroidx/compose/ui/focus/FocusState;", "activeFocusTargetNodeFetcher", "Landroidx/compose/ui/focus/FocusTargetNode;", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "focusEventNodes", "Landroidx/collection/MutableScatterSet;", "Landroidx/compose/ui/focus/FocusEventModifierNode;", "focusEventNodesLegacy", "", "focusPropertiesNodesLegacy", "Landroidx/compose/ui/focus/FocusPropertiesModifierNode;", "focusTargetNodes", "focusTargetNodesLegacy", "focusTargetsWithInvalidatedFocusEventsLegacy", "isInvalidationScheduled", "", "hasPendingInvalidation", "invalidateNodes", "invalidateNodesLegacy", "invalidateNodesOptimized", "scheduleInvalidation", "node", "scheduleInvalidationForOwner", "setUpOnRequestApplyChangesListener", "T", "(Landroidx/collection/MutableScatterSet;Ljava/lang/Object;)V", "scheduleInvalidationLegacy", "(Ljava/util/List;Ljava/lang/Object;)V", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FocusInvalidationManager {
    public static final int $stable = 8;
    private final Function0<FocusTargetNode> activeFocusTargetNodeFetcher;
    private final Function0<Unit> invalidateOwnerFocusState;
    private boolean isInvalidationScheduled;
    private final Function1<Function0<Unit>, Unit> onRequestApplyChangesListener;
    private final Function0<FocusState> rootFocusStateFetcher;
    private final MutableScatterSet<FocusTargetNode> focusTargetNodes = ScatterSetKt.mutableScatterSetOf();
    private final MutableScatterSet<FocusEventModifierNode> focusEventNodes = ScatterSetKt.mutableScatterSetOf();
    private final List<FocusTargetNode> focusTargetNodesLegacy = new ArrayList();
    private final List<FocusEventModifierNode> focusEventNodesLegacy = new ArrayList();
    private final List<FocusPropertiesModifierNode> focusPropertiesNodesLegacy = new ArrayList();
    private final List<FocusTargetNode> focusTargetsWithInvalidatedFocusEventsLegacy = new ArrayList();

    /* JADX WARN: Multi-variable type inference failed */
    public FocusInvalidationManager(Function1<? super Function0<Unit>, Unit> function1, Function0<Unit> function0, Function0<? extends FocusState> function02, Function0<FocusTargetNode> function03) {
        this.onRequestApplyChangesListener = function1;
        this.invalidateOwnerFocusState = function0;
        this.rootFocusStateFetcher = function02;
        this.activeFocusTargetNodeFetcher = function03;
    }

    public final void scheduleInvalidation(FocusTargetNode node) {
        if (ComposeUiFlags.isTrackFocusEnabled) {
            scheduleInvalidation(this.focusTargetNodes, node);
        } else {
            scheduleInvalidationLegacy(this.focusTargetNodesLegacy, node);
        }
    }

    public final void scheduleInvalidation(FocusEventModifierNode node) {
        if (ComposeUiFlags.isTrackFocusEnabled) {
            scheduleInvalidation(this.focusEventNodes, node);
        } else {
            scheduleInvalidationLegacy(this.focusEventNodesLegacy, node);
        }
    }

    public final void scheduleInvalidation(FocusPropertiesModifierNode node) {
        scheduleInvalidationLegacy(this.focusPropertiesNodesLegacy, node);
    }

    public final void scheduleInvalidationForOwner() {
        setUpOnRequestApplyChangesListener();
    }

    public final boolean hasPendingInvalidation() {
        if (ComposeUiFlags.isTrackFocusEnabled) {
            return this.isInvalidationScheduled;
        }
        return (this.focusTargetNodesLegacy.isEmpty() && this.focusPropertiesNodesLegacy.isEmpty() && this.focusEventNodesLegacy.isEmpty()) ? false : true;
    }

    private final <T> void scheduleInvalidation(MutableScatterSet<T> mutableScatterSet, T t) {
        if (mutableScatterSet.add(t)) {
            setUpOnRequestApplyChangesListener();
        }
    }

    /* compiled from: FocusInvalidationManager.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.focus.FocusInvalidationManager$setUpOnRequestApplyChangesListener$1, reason: invalid class name */
    /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements Function0<Unit> {
        AnonymousClass1(Object obj) {
            super(0, obj, FocusInvalidationManager.class, "invalidateNodes", "invalidateNodes()V", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ((FocusInvalidationManager) this.receiver).invalidateNodes();
        }
    }

    private final void setUpOnRequestApplyChangesListener() {
        if (!this.isInvalidationScheduled) {
            this.onRequestApplyChangesListener.invoke(new AnonymousClass1(this));
            this.isInvalidationScheduled = true;
        }
    }

    private final <T> void scheduleInvalidationLegacy(List<T> list, T t) {
        if (list.add(t) && this.focusTargetNodesLegacy.size() + this.focusEventNodesLegacy.size() + this.focusPropertiesNodesLegacy.size() == 1) {
            this.onRequestApplyChangesListener.invoke(new AnonymousClass1(this));
        }
    }

    /* compiled from: FocusInvalidationManager.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.focus.FocusInvalidationManager$scheduleInvalidationLegacy$1, reason: invalid class name */
    /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements Function0<Unit> {
        AnonymousClass1(Object obj) {
            super(0, obj, FocusInvalidationManager.class, "invalidateNodes", "invalidateNodes()V", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ((FocusInvalidationManager) this.receiver).invalidateNodes();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void invalidateNodes() {
        if (ComposeUiFlags.isTrackFocusEnabled) {
            invalidateNodesOptimized();
        } else {
            invalidateNodesLegacy();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void invalidateNodesOptimized() {
        int j$iv$iv;
        int j$iv$iv2;
        NodeChain nodes;
        int i;
        FocusTargetNode activeFocusTargetNode = this.activeFocusTargetNodeFetcher.invoke();
        int i2 = 8;
        if (activeFocusTargetNode == null) {
            ScatterSet this_$iv = this.focusEventNodes;
            Object[] elements$iv = this_$iv.elements;
            long[] m$iv$iv = this_$iv.metadata;
            int lastIndex$iv$iv = m$iv$iv.length - 2;
            int i$iv$iv = 0;
            if (0 <= lastIndex$iv$iv) {
                while (true) {
                    long slot$iv$iv = m$iv$iv[i$iv$iv];
                    int i3 = 1;
                    ScatterSet this_$iv2 = this_$iv;
                    if ((((~slot$iv$iv) << 7) & slot$iv$iv & (-9187201950435737472L)) != -9187201950435737472L) {
                        int bitCount$iv$iv = 8 - ((~(i$iv$iv - lastIndex$iv$iv)) >>> 31);
                        int j$iv$iv3 = 0;
                        while (j$iv$iv3 < bitCount$iv$iv) {
                            long value$iv$iv$iv = slot$iv$iv & 255;
                            int $i$f$isFull = value$iv$iv$iv < 128 ? i3 : 0;
                            if ($i$f$isFull == 0) {
                                i = i3;
                            } else {
                                int index$iv$iv = (i$iv$iv << 3) + j$iv$iv3;
                                i = i3;
                                FocusEventModifierNode it = (FocusEventModifierNode) elements$iv[index$iv$iv];
                                it.onFocusEvent(FocusStateImpl.Inactive);
                            }
                            slot$iv$iv >>= 8;
                            j$iv$iv3++;
                            i3 = i;
                        }
                        if (bitCount$iv$iv != 8) {
                            break;
                        }
                    }
                    if (i$iv$iv == lastIndex$iv$iv) {
                        break;
                    }
                    i$iv$iv++;
                    this_$iv = this_$iv2;
                }
            }
        } else {
            int i4 = 1;
            if (activeFocusTargetNode.getIsAttached()) {
                if (this.focusTargetNodes.contains(activeFocusTargetNode)) {
                    activeFocusTargetNode.invalidateFocus$ui_release();
                }
                FocusStateImpl activeFocusTargetNodeState = activeFocusTargetNode.getFocusState();
                int traversedFocusTargetCount = 0;
                FocusTargetNode $this$visitAncestors$iv = activeFocusTargetNode;
                int i5 = 1024;
                int mask$iv = NodeKind.m6012constructorimpl(1024) | NodeKind.m6012constructorimpl(4096);
                boolean value$iv$iv = $this$visitAncestors$iv.getNode().getIsAttached();
                if (!value$iv$iv) {
                    InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
                }
                Modifier.Node node$iv = $this$visitAncestors$iv.getNode();
                LayoutNode layout$iv = DelegatableNodeKt.requireLayoutNode($this$visitAncestors$iv);
                while (layout$iv != null) {
                    Modifier.Node head$iv = layout$iv.getNodes().getHead();
                    if ((head$iv.getAggregateChildKindSet() & mask$iv) != 0) {
                        while (node$iv != null) {
                            if ((node$iv.getKindSet() & mask$iv) != 0) {
                                Modifier.Node node = node$iv;
                                int kind$iv = (node.getKindSet() & NodeKind.m6012constructorimpl(i5)) != 0 ? i4 : 0;
                                if (kind$iv != 0) {
                                    traversedFocusTargetCount++;
                                }
                                if ((node instanceof FocusEventModifierNode) && this.focusEventNodes.contains(node)) {
                                    if (traversedFocusTargetCount <= i4) {
                                        ((FocusEventModifierNode) node).onFocusEvent(activeFocusTargetNodeState);
                                    } else {
                                        ((FocusEventModifierNode) node).onFocusEvent(FocusStateImpl.ActiveParent);
                                    }
                                    this.focusEventNodes.remove(node);
                                }
                            }
                            node$iv = node$iv.getParent();
                            i5 = 1024;
                            i4 = 1;
                        }
                    }
                    layout$iv = layout$iv.getParent$ui_release();
                    node$iv = (layout$iv == null || (nodes = layout$iv.getNodes()) == null) ? null : nodes.getTail();
                    i5 = 1024;
                    i4 = 1;
                }
                ScatterSet this_$iv3 = this.focusEventNodes;
                Object[] elements$iv2 = this_$iv3.elements;
                long[] m$iv$iv2 = this_$iv3.metadata;
                int lastIndex$iv$iv2 = m$iv$iv2.length - 2;
                int i$iv$iv2 = 0;
                if (0 <= lastIndex$iv$iv2) {
                    while (true) {
                        long slot$iv$iv2 = m$iv$iv2[i$iv$iv2];
                        int i6 = i2;
                        int lastIndex$iv$iv3 = lastIndex$iv$iv2;
                        FocusTargetNode activeFocusTargetNode2 = activeFocusTargetNode;
                        FocusStateImpl activeFocusTargetNodeState2 = activeFocusTargetNodeState;
                        if ((((~slot$iv$iv2) << 7) & slot$iv$iv2 & (-9187201950435737472L)) == -9187201950435737472L) {
                            j$iv$iv = i6;
                        } else {
                            int bitCount$iv$iv2 = 8 - ((~(i$iv$iv2 - lastIndex$iv$iv3)) >>> 31);
                            int j$iv$iv4 = 0;
                            while (j$iv$iv4 < bitCount$iv$iv2) {
                                long value$iv$iv$iv2 = slot$iv$iv2 & 255;
                                int $i$f$isFull2 = value$iv$iv$iv2 < 128 ? 1 : 0;
                                if ($i$f$isFull2 == 0) {
                                    j$iv$iv2 = j$iv$iv4;
                                } else {
                                    int index$iv$iv2 = (i$iv$iv2 << 3) + j$iv$iv4;
                                    j$iv$iv2 = j$iv$iv4;
                                    FocusEventModifierNode it2 = (FocusEventModifierNode) elements$iv2[index$iv$iv2];
                                    it2.onFocusEvent(FocusStateImpl.Inactive);
                                }
                                slot$iv$iv2 >>= i6;
                                j$iv$iv4 = j$iv$iv2 + 1;
                            }
                            j$iv$iv = i6;
                            if (bitCount$iv$iv2 != j$iv$iv) {
                                break;
                            }
                        }
                        lastIndex$iv$iv2 = lastIndex$iv$iv3;
                        if (i$iv$iv2 == lastIndex$iv$iv2) {
                            break;
                        }
                        i$iv$iv2++;
                        i2 = j$iv$iv;
                        activeFocusTargetNode = activeFocusTargetNode2;
                        activeFocusTargetNodeState = activeFocusTargetNodeState2;
                    }
                }
            }
        }
        this.invalidateOwnerFocusState.invoke();
        this.focusTargetNodes.clear();
        this.focusEventNodes.clear();
        this.isInvalidationScheduled = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v24, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r35v0, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r3v22, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r3v33 */
    /* JADX WARN: Type inference failed for: r6v16, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    private final void invalidateNodesLegacy() {
        int i;
        List<FocusEventModifierNode> list;
        int i2;
        int i3;
        FocusStateImpl focusState;
        FocusStateImpl focusState2;
        Modifier.Node node;
        MutableVector mutableVector;
        Object obj;
        DelegatingNode delegatingNode;
        FocusTargetNode focusTargetNode;
        int i4;
        MutableVector mutableVector2;
        int i5;
        int i6;
        DelegatingNode delegatingNode2;
        int i7;
        int i8;
        MutableVector mutableVector3;
        List<FocusPropertiesModifierNode> list2;
        int i9;
        int i10;
        int i11;
        DelegatingNode delegatingNode3;
        int i12;
        MutableVector mutableVector4;
        List<FocusPropertiesModifierNode> list3;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        MutableVector mutableVector5;
        if (!this.rootFocusStateFetcher.invoke().getHasFocus()) {
            List<FocusEventModifierNode> list4 = this.focusEventNodesLegacy;
            int size = list4.size();
            for (int i18 = 0; i18 < size; i18++) {
                list4.get(i18).onFocusEvent(FocusStateImpl.Inactive);
            }
            List<FocusTargetNode> list5 = this.focusTargetNodesLegacy;
            int size2 = list5.size();
            for (int i19 = 0; i19 < size2; i19++) {
                FocusTargetNode focusTargetNode2 = list5.get(i19);
                if (focusTargetNode2.getIsAttached() && !focusTargetNode2.isInitialized$ui_release()) {
                    focusTargetNode2.initializeFocusState$ui_release(FocusStateImpl.Inactive);
                }
            }
            this.focusTargetNodesLegacy.clear();
            this.focusEventNodesLegacy.clear();
            this.focusPropertiesNodesLegacy.clear();
            this.focusTargetsWithInvalidatedFocusEventsLegacy.clear();
            this.invalidateOwnerFocusState.invoke();
            return;
        }
        List<FocusPropertiesModifierNode> list6 = this.focusPropertiesNodesLegacy;
        int i20 = 0;
        int i21 = 0;
        int size3 = list6.size();
        while (true) {
            i = 1024;
            if (i21 >= size3) {
                break;
            }
            FocusPropertiesModifierNode focusPropertiesModifierNode = list6.get(i21);
            if (focusPropertiesModifierNode.getNode().getIsAttached()) {
                FocusPropertiesModifierNode focusPropertiesModifierNode2 = focusPropertiesModifierNode;
                int iM6012constructorimpl = NodeKind.m6012constructorimpl(1024);
                MutableVector mutableVector6 = null;
                Modifier.Node node2 = focusPropertiesModifierNode2.getNode();
                while (node2 != null) {
                    if (node2 instanceof FocusTargetNode) {
                        list3 = list6;
                        this.focusTargetNodesLegacy.add((FocusTargetNode) node2);
                        i13 = i20;
                        i14 = i21;
                    } else {
                        list3 = list6;
                        if (((node2.getKindSet() & iM6012constructorimpl) != 0) && (node2 instanceof DelegatingNode)) {
                            int i22 = 0;
                            Modifier.Node delegate = ((DelegatingNode) node2).getDelegate();
                            while (delegate != null) {
                                Modifier.Node node3 = delegate;
                                if ((node3.getKindSet() & iM6012constructorimpl) != 0) {
                                    i22++;
                                    i15 = i20;
                                    if (i22 == 1) {
                                        node2 = node3;
                                        i16 = i21;
                                    } else {
                                        if (mutableVector6 == null) {
                                            i17 = i22;
                                            i16 = i21;
                                            mutableVector5 = new MutableVector(new Modifier.Node[16], 0);
                                        } else {
                                            i17 = i22;
                                            i16 = i21;
                                            mutableVector5 = mutableVector6;
                                        }
                                        Modifier.Node node4 = node2;
                                        if (node4 != null) {
                                            if (mutableVector5 != null) {
                                                Boolean.valueOf(mutableVector5.add(node4));
                                            }
                                            node2 = null;
                                        }
                                        if (mutableVector5 != null) {
                                            Boolean.valueOf(mutableVector5.add(node3));
                                        }
                                        mutableVector6 = mutableVector5;
                                        i22 = i17;
                                    }
                                } else {
                                    i15 = i20;
                                    i16 = i21;
                                }
                                delegate = delegate.getChild();
                                i20 = i15;
                                i21 = i16;
                            }
                            i13 = i20;
                            i14 = i21;
                            if (i22 == 1) {
                                list6 = list3;
                                i20 = i13;
                                i21 = i14;
                            }
                        } else {
                            i13 = i20;
                            i14 = i21;
                        }
                    }
                    node2 = DelegatableNodeKt.pop(mutableVector6);
                    list6 = list3;
                    i20 = i13;
                    i21 = i14;
                }
                list2 = list6;
                i9 = i20;
                i10 = i21;
                int i23 = 0;
                if (!focusPropertiesModifierNode2.getNode().getIsAttached()) {
                    InlineClassHelperKt.throwIllegalStateException("visitChildren called on an unattached node");
                }
                MutableVector mutableVector7 = new MutableVector(new Modifier.Node[16], 0);
                Modifier.Node child = focusPropertiesModifierNode2.getNode().getChild();
                if (child == null) {
                    DelegatableNodeKt.addLayoutNodeChildren(mutableVector7, focusPropertiesModifierNode2.getNode(), false);
                } else {
                    mutableVector7.add(child);
                }
                while (true) {
                    if (mutableVector7.getSize() != 0) {
                        Modifier.Node node5 = (Modifier.Node) mutableVector7.removeAt(mutableVector7.getSize() - 1);
                        if ((node5.getAggregateChildKindSet() & iM6012constructorimpl) == 0) {
                            DelegatableNodeKt.addLayoutNodeChildren(mutableVector7, node5, false);
                        } else {
                            Modifier.Node child2 = node5;
                            while (true) {
                                if (child2 == null) {
                                    break;
                                }
                                if ((child2.getKindSet() & iM6012constructorimpl) != 0) {
                                    MutableVector mutableVector8 = null;
                                    Modifier.Node node6 = child;
                                    Modifier.Node nodePop = child2;
                                    while (nodePop != null) {
                                        Modifier.Node node7 = node5;
                                        if (nodePop instanceof FocusTargetNode) {
                                            i11 = i23;
                                            this.focusTargetNodesLegacy.add((FocusTargetNode) nodePop);
                                        } else {
                                            i11 = i23;
                                            if (((nodePop.getKindSet() & iM6012constructorimpl) != 0) && (nodePop instanceof DelegatingNode)) {
                                                int i24 = 0;
                                                DelegatingNode delegatingNode4 = (DelegatingNode) nodePop;
                                                Modifier.Node delegate2 = delegatingNode4.getDelegate();
                                                while (delegate2 != null) {
                                                    Modifier.Node node8 = delegate2;
                                                    if ((node8.getKindSet() & iM6012constructorimpl) != 0) {
                                                        i24++;
                                                        Modifier.Node node9 = nodePop;
                                                        if (i24 == 1) {
                                                            nodePop = node8;
                                                            delegatingNode3 = delegatingNode4;
                                                        } else {
                                                            if (mutableVector8 == null) {
                                                                i12 = i24;
                                                                delegatingNode3 = delegatingNode4;
                                                                mutableVector4 = new MutableVector(new Modifier.Node[16], 0);
                                                            } else {
                                                                i12 = i24;
                                                                delegatingNode3 = delegatingNode4;
                                                                mutableVector4 = mutableVector8;
                                                            }
                                                            if (node9 != null) {
                                                                if (mutableVector4 != null) {
                                                                    Boolean.valueOf(mutableVector4.add(node9));
                                                                }
                                                                node9 = null;
                                                            }
                                                            if (mutableVector4 != null) {
                                                                Boolean.valueOf(mutableVector4.add(node8));
                                                            }
                                                            mutableVector8 = mutableVector4;
                                                            nodePop = node9;
                                                            i24 = i12;
                                                        }
                                                    } else {
                                                        delegatingNode3 = delegatingNode4;
                                                    }
                                                    delegate2 = delegate2.getChild();
                                                    delegatingNode4 = delegatingNode3;
                                                }
                                                Modifier.Node node10 = nodePop;
                                                if (i24 == 1) {
                                                    node5 = node7;
                                                    i23 = i11;
                                                    nodePop = node10;
                                                }
                                            }
                                        }
                                        nodePop = DelegatableNodeKt.pop(mutableVector8);
                                        node5 = node7;
                                        i23 = i11;
                                    }
                                    child = node6;
                                } else {
                                    child2 = child2.getChild();
                                }
                            }
                        }
                    }
                }
            } else {
                list2 = list6;
                i9 = i20;
                i10 = i21;
            }
            i21 = i10 + 1;
            list6 = list2;
            i20 = i9;
        }
        this.focusPropertiesNodesLegacy.clear();
        List<FocusEventModifierNode> list7 = this.focusEventNodesLegacy;
        int i25 = 0;
        int i26 = 0;
        int size4 = list7.size();
        while (i26 < size4) {
            FocusEventModifierNode focusEventModifierNode = list7.get(i26);
            if (focusEventModifierNode.getNode().getIsAttached()) {
                boolean z = true;
                boolean z2 = false;
                FocusTargetNode focusTargetNode3 = null;
                FocusEventModifierNode focusEventModifierNode2 = focusEventModifierNode;
                int iM6012constructorimpl2 = NodeKind.m6012constructorimpl(i);
                MutableVector mutableVector9 = null;
                Modifier.Node node11 = focusEventModifierNode2.getNode();
                while (node11 != null) {
                    List<FocusEventModifierNode> list8 = list7;
                    if (node11 instanceof FocusTargetNode) {
                        FocusTargetNode focusTargetNode4 = node11;
                        if (focusTargetNode3 != null) {
                            z2 = true;
                        }
                        focusTargetNode3 = focusTargetNode4;
                        i5 = i25;
                        if (this.focusTargetNodesLegacy.contains(focusTargetNode4)) {
                            z = false;
                            this.focusTargetsWithInvalidatedFocusEventsLegacy.add(focusTargetNode4);
                        }
                        i6 = i26;
                    } else {
                        i5 = i25;
                        if (((node11.getKindSet() & iM6012constructorimpl2) != 0) && (node11 instanceof DelegatingNode)) {
                            int i27 = 0;
                            DelegatingNode delegatingNode5 = node11;
                            Modifier.Node delegate3 = delegatingNode5.getDelegate();
                            while (delegate3 != null) {
                                Modifier.Node node12 = delegate3;
                                if ((node12.getKindSet() & iM6012constructorimpl2) != 0) {
                                    i27++;
                                    delegatingNode2 = delegatingNode5;
                                    if (i27 == 1) {
                                        node11 = node12;
                                        i7 = i26;
                                    } else {
                                        if (mutableVector9 == null) {
                                            i8 = i27;
                                            i7 = i26;
                                            mutableVector3 = new MutableVector(new Modifier.Node[16], 0);
                                        } else {
                                            i8 = i27;
                                            i7 = i26;
                                            mutableVector3 = mutableVector9;
                                        }
                                        Object obj2 = node11;
                                        if (obj2 != null) {
                                            if (mutableVector3 != null) {
                                                Boolean.valueOf(mutableVector3.add(obj2));
                                            }
                                            node11 = null;
                                        }
                                        if (mutableVector3 != null) {
                                            Boolean.valueOf(mutableVector3.add(node12));
                                        }
                                        mutableVector9 = mutableVector3;
                                        i27 = i8;
                                    }
                                } else {
                                    delegatingNode2 = delegatingNode5;
                                    i7 = i26;
                                }
                                delegate3 = delegate3.getChild();
                                delegatingNode5 = delegatingNode2;
                                i26 = i7;
                            }
                            i6 = i26;
                            if (i27 == 1) {
                                list7 = list8;
                                i25 = i5;
                                i26 = i6;
                            }
                        } else {
                            i6 = i26;
                        }
                    }
                    node11 = DelegatableNodeKt.pop(mutableVector9);
                    list7 = list8;
                    i25 = i5;
                    i26 = i6;
                }
                list = list7;
                i2 = i25;
                i3 = i26;
                if (!focusEventModifierNode2.getNode().getIsAttached()) {
                    InlineClassHelperKt.throwIllegalStateException("visitChildren called on an unattached node");
                }
                MutableVector mutableVector10 = new MutableVector(new Modifier.Node[16], 0);
                Modifier.Node child3 = focusEventModifierNode2.getNode().getChild();
                if (child3 == null) {
                    DelegatableNodeKt.addLayoutNodeChildren(mutableVector10, focusEventModifierNode2.getNode(), false);
                } else {
                    mutableVector10.add(child3);
                }
                while (true) {
                    if (!(mutableVector10.getSize() != 0)) {
                        break;
                    }
                    ?? r3 = (Modifier.Node) mutableVector10.removeAt(mutableVector10.getSize() - 1);
                    if ((r3.getAggregateChildKindSet() & iM6012constructorimpl2) == 0) {
                        DelegatableNodeKt.addLayoutNodeChildren(mutableVector10, r3, false);
                        node = child3;
                        mutableVector = mutableVector10;
                    } else {
                        for (FocusTargetNode child4 = r3; child4 != null; child4 = child4.getChild()) {
                            if ((child4.getKindSet() & iM6012constructorimpl2) != 0) {
                                MutableVector mutableVector11 = null;
                                Modifier.Node node13 = child3;
                                FocusTargetNode focusTargetNodePop = child4;
                                while (focusTargetNodePop != null) {
                                    MutableVector mutableVector12 = mutableVector10;
                                    if (focusTargetNodePop instanceof FocusTargetNode) {
                                        FocusTargetNode focusTargetNode5 = focusTargetNodePop;
                                        if (focusTargetNode3 != null) {
                                            z2 = true;
                                        }
                                        focusTargetNode3 = focusTargetNode5;
                                        obj = r3;
                                        if (this.focusTargetNodesLegacy.contains(focusTargetNode5)) {
                                            z = false;
                                            this.focusTargetsWithInvalidatedFocusEventsLegacy.add(focusTargetNode5);
                                        }
                                    } else {
                                        obj = r3;
                                        if (((focusTargetNodePop.getKindSet() & iM6012constructorimpl2) != 0) && (focusTargetNodePop instanceof DelegatingNode)) {
                                            int i28 = 0;
                                            DelegatingNode delegatingNode6 = (DelegatingNode) focusTargetNodePop;
                                            for (FocusTargetNode delegate4 = delegatingNode6.getDelegate(); delegate4 != null; delegate4 = delegate4.getChild()) {
                                                FocusTargetNode focusTargetNode6 = delegate4;
                                                if ((focusTargetNode6.getKindSet() & iM6012constructorimpl2) != 0) {
                                                    i28++;
                                                    FocusTargetNode focusTargetNode7 = focusTargetNodePop;
                                                    if (i28 == 1) {
                                                        focusTargetNode = focusTargetNode6;
                                                        delegatingNode = delegatingNode6;
                                                    } else {
                                                        if (mutableVector11 == null) {
                                                            i4 = i28;
                                                            delegatingNode = delegatingNode6;
                                                            mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
                                                        } else {
                                                            i4 = i28;
                                                            delegatingNode = delegatingNode6;
                                                            mutableVector2 = mutableVector11;
                                                        }
                                                        if (focusTargetNode7 != null) {
                                                            if (mutableVector2 != null) {
                                                                Boolean.valueOf(mutableVector2.add(focusTargetNode7));
                                                            }
                                                            focusTargetNode = null;
                                                        } else {
                                                            focusTargetNode = focusTargetNode7;
                                                        }
                                                        if (mutableVector2 != null) {
                                                            Boolean.valueOf(mutableVector2.add(focusTargetNode6));
                                                        }
                                                        mutableVector11 = mutableVector2;
                                                        i28 = i4;
                                                    }
                                                } else {
                                                    delegatingNode = delegatingNode6;
                                                    focusTargetNode = focusTargetNodePop;
                                                }
                                                focusTargetNodePop = focusTargetNode;
                                                delegatingNode6 = delegatingNode;
                                            }
                                            FocusTargetNode focusTargetNode8 = focusTargetNodePop;
                                            if (i28 == 1) {
                                                mutableVector10 = mutableVector12;
                                                r3 = obj;
                                                focusTargetNodePop = focusTargetNode8;
                                            }
                                        }
                                    }
                                    focusTargetNodePop = DelegatableNodeKt.pop(mutableVector11);
                                    mutableVector10 = mutableVector12;
                                    r3 = obj;
                                }
                                child3 = node13;
                            } else {
                                child3 = child3;
                            }
                        }
                        node = child3;
                        mutableVector = mutableVector10;
                    }
                    child3 = node;
                    mutableVector10 = mutableVector;
                }
                if (z) {
                    if (z2) {
                        focusState2 = FocusEventModifierNodeKt.getFocusState(focusEventModifierNode);
                    } else {
                        if (focusTargetNode3 == null || (focusState = focusTargetNode3.getFocusState()) == null) {
                            focusState = FocusStateImpl.Inactive;
                        }
                        focusState2 = focusState;
                    }
                    focusEventModifierNode.onFocusEvent(focusState2);
                }
            } else {
                focusEventModifierNode.onFocusEvent(FocusStateImpl.Inactive);
                list = list7;
                i2 = i25;
                i3 = i26;
            }
            i26 = i3 + 1;
            list7 = list;
            i25 = i2;
            i = 1024;
        }
        this.focusEventNodesLegacy.clear();
        List<FocusTargetNode> list9 = this.focusTargetNodesLegacy;
        int size5 = list9.size();
        for (int i29 = 0; i29 < size5; i29++) {
            FocusTargetNode focusTargetNode9 = list9.get(i29);
            if (focusTargetNode9.getIsAttached()) {
                FocusStateImpl focusState3 = focusTargetNode9.getFocusState();
                focusTargetNode9.invalidateFocus$ui_release();
                if (focusState3 != focusTargetNode9.getFocusState() || this.focusTargetsWithInvalidatedFocusEventsLegacy.contains(focusTargetNode9)) {
                    focusTargetNode9.dispatchFocusCallbacks$ui_release();
                }
            }
        }
        this.focusTargetNodesLegacy.clear();
        this.focusTargetsWithInvalidatedFocusEventsLegacy.clear();
        this.invalidateOwnerFocusState.invoke();
        if (!this.focusPropertiesNodesLegacy.isEmpty()) {
            InlineClassHelperKt.throwIllegalStateException("Unprocessed FocusProperties nodes");
        }
        if (!this.focusEventNodesLegacy.isEmpty()) {
            InlineClassHelperKt.throwIllegalStateException("Unprocessed FocusEvent nodes");
        }
        if (this.focusTargetNodesLegacy.isEmpty()) {
            return;
        }
        InlineClassHelperKt.throwIllegalStateException("Unprocessed FocusTarget nodes");
    }
}
