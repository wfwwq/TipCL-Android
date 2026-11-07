package androidx.compose.ui.focus;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.ComposeUiFlags;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeChain;
import androidx.compose.ui.node.NodeKind;
import androidx.compose.ui.node.ObserverModifierNodeKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FocusTransactions.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a \u0010\u0003\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u0001H\u0002\u001a\u001e\u0010\u0006\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0000\u001a\f\u0010\u0007\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\f\u0010\b\u001a\u00020\u0001*\u00020\u0002H\u0002\u001a\u001e\u0010\t\u001a\u00020\n*\u00020\u00022\u0006\u0010\u000b\u001a\u00020\fH\u0000ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u001e\u0010\u000f\u001a\u00020\n*\u00020\u00022\u0006\u0010\u000b\u001a\u00020\fH\u0002ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u000e\u001a\u001e\u0010\u0011\u001a\u00020\n*\u00020\u00022\u0006\u0010\u000b\u001a\u00020\fH\u0002ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u000e\u001a\u001e\u0010\u0013\u001a\u00020\n*\u00020\u00022\u0006\u0010\u000b\u001a\u00020\fH\u0000ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u000e\u001a\f\u0010\u0015\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\f\u0010\u0016\u001a\u00020\u0001*\u00020\u0002H\u0002\u001a\f\u0010\u0017\u001a\u00020\u0001*\u00020\u0002H\u0002\u001a\u0014\u0010\u0018\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0002H\u0002\u001a\f\u0010\u001a\u001a\u00020\u0001*\u00020\u0002H\u0002\u001a\f\u0010\u001b\u001a\u00020\u0002*\u00020\u0002H\u0002\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001c"}, d2 = {"captureFocus", "", "Landroidx/compose/ui/focus/FocusTargetNode;", "clearChildFocus", "forced", "refreshFocusEvents", "clearFocus", "freeFocus", "grantFocus", "performCustomClearFocus", "Landroidx/compose/ui/focus/CustomDestinationResult;", "focusDirection", "Landroidx/compose/ui/focus/FocusDirection;", "performCustomClearFocus-Mxy_nc0", "(Landroidx/compose/ui/focus/FocusTargetNode;I)Landroidx/compose/ui/focus/CustomDestinationResult;", "performCustomEnter", "performCustomEnter-Mxy_nc0", "performCustomExit", "performCustomExit-Mxy_nc0", "performCustomRequestFocus", "performCustomRequestFocus-Mxy_nc0", "performRequestFocus", "performRequestFocusLegacy", "performRequestFocusOptimized", "requestFocusForChild", "childNode", "requestFocusForOwner", "requireActiveChild", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FocusTransactionsKt {

    /* compiled from: FocusTransactions.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FocusStateImpl.values().length];
            try {
                iArr[FocusStateImpl.Active.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                iArr[FocusStateImpl.Captured.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                iArr[FocusStateImpl.ActiveParent.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                iArr[FocusStateImpl.Inactive.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final boolean performRequestFocus(FocusTargetNode $this$performRequestFocus) {
        if (ComposeUiFlags.isTrackFocusEnabled) {
            return performRequestFocusOptimized($this$performRequestFocus);
        }
        return performRequestFocusLegacy($this$performRequestFocus);
    }

    /* JADX WARN: Removed duplicated region for block: B:161:0x034d A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final boolean performRequestFocusOptimized(androidx.compose.ui.focus.FocusTargetNode r38) {
        /*
            Method dump skipped, instructions count: 1029
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.FocusTransactionsKt.performRequestFocusOptimized(androidx.compose.ui.focus.FocusTargetNode):boolean");
    }

    private static final boolean performRequestFocusLegacy(FocusTargetNode $this$performRequestFocusLegacy) {
        boolean success;
        boolean z;
        Modifier.Node node;
        DelegatableNode $this$nearestAncestor_u2d64DMado$iv;
        boolean z2;
        NodeChain nodes;
        DelegatableNode $this$nearestAncestor_u2d64DMado$iv2;
        boolean z3;
        DelegatableNode $this$nearestAncestor_u2d64DMado$iv3;
        Modifier.Node node2;
        int count$iv$iv$iv;
        MutableVector mutableVector;
        boolean z4 = true;
        switch (WhenMappings.$EnumSwitchMapping$0[$this$performRequestFocusLegacy.getFocusState().ordinal()]) {
            case 1:
            case 2:
                success = true;
                break;
            case 3:
                if (!clearChildFocus$default($this$performRequestFocusLegacy, false, false, 3, null) || !grantFocus($this$performRequestFocusLegacy)) {
                    success = false;
                    break;
                } else {
                    success = true;
                    break;
                }
                break;
            case 4:
                FocusTargetNode $this$nearestAncestor_u2d64DMado$iv4 = $this$performRequestFocusLegacy;
                int iM6012constructorimpl = NodeKind.m6012constructorimpl(1024);
                boolean value$iv$iv$iv$iv = $this$nearestAncestor_u2d64DMado$iv4.getNode().getIsAttached();
                if (!value$iv$iv$iv$iv) {
                    InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
                }
                Modifier.Node node$iv$iv$iv = $this$nearestAncestor_u2d64DMado$iv4.getNode().getParent();
                LayoutNode layout$iv$iv$iv = DelegatableNodeKt.requireLayoutNode($this$nearestAncestor_u2d64DMado$iv4);
                while (true) {
                    if (layout$iv$iv$iv != null) {
                        Modifier.Node head$iv$iv$iv = layout$iv$iv$iv.getNodes().getHead();
                        if ((head$iv$iv$iv.getAggregateChildKindSet() & iM6012constructorimpl) != 0) {
                            while (node$iv$iv$iv != null) {
                                if ((node$iv$iv$iv.getKindSet() & iM6012constructorimpl) != 0) {
                                    Modifier.Node it$iv$iv = node$iv$iv$iv;
                                    MutableVector mutableVector2 = null;
                                    Modifier.Node nodePop = it$iv$iv;
                                    while (nodePop != null) {
                                        if (nodePop instanceof FocusTargetNode) {
                                            node = nodePop;
                                            z = z4;
                                        } else {
                                            Modifier.Node this_$iv$iv$iv$iv = nodePop;
                                            if (((this_$iv$iv$iv$iv.getKindSet() & iM6012constructorimpl) != 0 ? z4 : false) && (nodePop instanceof DelegatingNode)) {
                                                int count$iv$iv$iv2 = 0;
                                                DelegatingNode this_$iv$iv$iv$iv2 = (DelegatingNode) nodePop;
                                                Modifier.Node node$iv$iv$iv$iv = this_$iv$iv$iv$iv2.getDelegate();
                                                while (node$iv$iv$iv$iv != null) {
                                                    Modifier.Node next$iv$iv$iv = node$iv$iv$iv$iv;
                                                    if ((next$iv$iv$iv.getKindSet() & iM6012constructorimpl) != 0 ? z4 : false) {
                                                        count$iv$iv$iv2++;
                                                        if (count$iv$iv$iv2 == z4) {
                                                            nodePop = next$iv$iv$iv;
                                                            $this$nearestAncestor_u2d64DMado$iv3 = $this$nearestAncestor_u2d64DMado$iv4;
                                                        } else {
                                                            if (mutableVector2 == null) {
                                                                $this$nearestAncestor_u2d64DMado$iv3 = $this$nearestAncestor_u2d64DMado$iv4;
                                                                node2 = nodePop;
                                                                count$iv$iv$iv = count$iv$iv$iv2;
                                                                mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                                            } else {
                                                                $this$nearestAncestor_u2d64DMado$iv3 = $this$nearestAncestor_u2d64DMado$iv4;
                                                                node2 = nodePop;
                                                                count$iv$iv$iv = count$iv$iv$iv2;
                                                                mutableVector = mutableVector2;
                                                            }
                                                            Modifier.Node theNode$iv$iv$iv = node2;
                                                            if (theNode$iv$iv$iv != null) {
                                                                if (mutableVector != null) {
                                                                    mutableVector.add(theNode$iv$iv$iv);
                                                                }
                                                                node2 = null;
                                                            }
                                                            if (mutableVector != null) {
                                                                mutableVector.add(next$iv$iv$iv);
                                                            }
                                                            mutableVector2 = mutableVector;
                                                            nodePop = node2;
                                                            count$iv$iv$iv2 = count$iv$iv$iv;
                                                        }
                                                    } else {
                                                        $this$nearestAncestor_u2d64DMado$iv3 = $this$nearestAncestor_u2d64DMado$iv4;
                                                    }
                                                    node$iv$iv$iv$iv = node$iv$iv$iv$iv.getChild();
                                                    $this$nearestAncestor_u2d64DMado$iv4 = $this$nearestAncestor_u2d64DMado$iv3;
                                                    z4 = true;
                                                }
                                                $this$nearestAncestor_u2d64DMado$iv2 = $this$nearestAncestor_u2d64DMado$iv4;
                                                Modifier.Node node3 = nodePop;
                                                z3 = true;
                                                if (count$iv$iv$iv2 == 1) {
                                                    z4 = true;
                                                    $this$nearestAncestor_u2d64DMado$iv4 = $this$nearestAncestor_u2d64DMado$iv2;
                                                    nodePop = node3;
                                                } else {
                                                    nodePop = DelegatableNodeKt.pop(mutableVector2);
                                                    z4 = z3;
                                                    $this$nearestAncestor_u2d64DMado$iv4 = $this$nearestAncestor_u2d64DMado$iv2;
                                                }
                                            } else {
                                                $this$nearestAncestor_u2d64DMado$iv2 = $this$nearestAncestor_u2d64DMado$iv4;
                                                z3 = z4;
                                                nodePop = DelegatableNodeKt.pop(mutableVector2);
                                                z4 = z3;
                                                $this$nearestAncestor_u2d64DMado$iv4 = $this$nearestAncestor_u2d64DMado$iv2;
                                            }
                                        }
                                    }
                                }
                                node$iv$iv$iv = node$iv$iv$iv.getParent();
                                z4 = z4;
                                $this$nearestAncestor_u2d64DMado$iv4 = $this$nearestAncestor_u2d64DMado$iv4;
                            }
                            $this$nearestAncestor_u2d64DMado$iv = $this$nearestAncestor_u2d64DMado$iv4;
                            z2 = z4;
                        } else {
                            $this$nearestAncestor_u2d64DMado$iv = $this$nearestAncestor_u2d64DMado$iv4;
                            z2 = z4;
                        }
                        layout$iv$iv$iv = layout$iv$iv$iv.getParent$ui_release();
                        node$iv$iv$iv = (layout$iv$iv$iv == null || (nodes = layout$iv$iv$iv.getNodes()) == null) ? null : nodes.getTail();
                        z4 = z2;
                        $this$nearestAncestor_u2d64DMado$iv4 = $this$nearestAncestor_u2d64DMado$iv;
                    } else {
                        z = z4;
                        node = null;
                    }
                }
                FocusTargetNode parent = (FocusTargetNode) node;
                if (parent == null) {
                    if (!requestFocusForOwner($this$performRequestFocusLegacy) || !grantFocus($this$performRequestFocusLegacy)) {
                        success = false;
                        break;
                    } else {
                        success = z;
                        break;
                    }
                } else {
                    FocusStateImpl prevState = parent.getFocusState();
                    success = requestFocusForChild(parent, $this$performRequestFocusLegacy);
                    if (success && prevState != parent.getFocusState()) {
                        parent.dispatchFocusCallbacks$ui_release();
                        break;
                    }
                }
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        if (success) {
            if (ComposeUiFlags.isViewFocusFixEnabled && DelegatableNodeKt.requireLayoutNode($this$performRequestFocusLegacy).getInteropView() == null) {
                DelegatableNodeKt.requireOwner($this$performRequestFocusLegacy).getFocusOwner().mo4052requestFocusForOwner7o62pno(FocusDirection.m4030boximpl(FocusDirection.INSTANCE.m4041getNextdhqQ8s()), null);
            }
            $this$performRequestFocusLegacy.dispatchFocusCallbacks$ui_release();
        }
        return success;
    }

    public static final boolean captureFocus(FocusTargetNode $this$captureFocus) {
        boolean z = false;
        if (ComposeUiFlags.isTrackFocusEnabled) {
            switch (WhenMappings.$EnumSwitchMapping$0[$this$captureFocus.getFocusState().ordinal()]) {
                case 1:
                    DelegatableNodeKt.requireOwner($this$captureFocus).getFocusOwner().setFocusCaptured(true);
                    $this$captureFocus.dispatchFocusCallbacks$ui_release(FocusStateImpl.Active, FocusStateImpl.Captured);
                    return true;
                case 2:
                    return true;
                case 3:
                case 4:
                    return false;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
        FocusTransactionManager $this$iv = FocusTargetNodeKt.requireTransactionManager($this$captureFocus);
        try {
            if ($this$iv.getOngoingTransaction()) {
                $this$iv.cancelTransaction();
            }
            $this$iv.beginTransaction();
            switch (WhenMappings.$EnumSwitchMapping$0[$this$captureFocus.getFocusState().ordinal()]) {
                case 1:
                    $this$captureFocus.setFocusState(FocusStateImpl.Captured);
                    $this$captureFocus.dispatchFocusCallbacks$ui_release();
                    z = true;
                    break;
                case 2:
                    z = true;
                    break;
                case 3:
                case 4:
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            return z;
        } finally {
            $this$iv.commitTransaction();
        }
    }

    public static final boolean freeFocus(FocusTargetNode $this$freeFocus) {
        boolean z = false;
        if (ComposeUiFlags.isTrackFocusEnabled) {
            switch (WhenMappings.$EnumSwitchMapping$0[$this$freeFocus.getFocusState().ordinal()]) {
                case 1:
                    return true;
                case 2:
                    DelegatableNodeKt.requireOwner($this$freeFocus).getFocusOwner().setFocusCaptured(false);
                    $this$freeFocus.dispatchFocusCallbacks$ui_release(FocusStateImpl.Captured, FocusStateImpl.Active);
                    return true;
                case 3:
                case 4:
                    return false;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
        FocusTransactionManager $this$iv = FocusTargetNodeKt.requireTransactionManager($this$freeFocus);
        try {
            if ($this$iv.getOngoingTransaction()) {
                $this$iv.cancelTransaction();
            }
            $this$iv.beginTransaction();
            switch (WhenMappings.$EnumSwitchMapping$0[$this$freeFocus.getFocusState().ordinal()]) {
                case 1:
                    z = true;
                    break;
                case 2:
                    $this$freeFocus.setFocusState(FocusStateImpl.Active);
                    $this$freeFocus.dispatchFocusCallbacks$ui_release();
                    z = true;
                    break;
                case 3:
                case 4:
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            return z;
        } finally {
            $this$iv.commitTransaction();
        }
    }

    public static /* synthetic */ boolean clearFocus$default(FocusTargetNode focusTargetNode, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return clearFocus(focusTargetNode, z, z2);
    }

    public static final boolean clearFocus(FocusTargetNode $this$clearFocus, boolean forced, boolean refreshFocusEvents) {
        switch (WhenMappings.$EnumSwitchMapping$0[$this$clearFocus.getFocusState().ordinal()]) {
            case 1:
                if (ComposeUiFlags.isTrackFocusEnabled) {
                    DelegatableNodeKt.requireOwner($this$clearFocus).getFocusOwner().setActiveFocusTargetNode(null);
                    if (!refreshFocusEvents) {
                        return true;
                    }
                    $this$clearFocus.dispatchFocusCallbacks$ui_release(FocusStateImpl.Active, FocusStateImpl.Inactive);
                    return true;
                }
                $this$clearFocus.setFocusState(FocusStateImpl.Inactive);
                if (!refreshFocusEvents) {
                    return true;
                }
                $this$clearFocus.dispatchFocusCallbacks$ui_release();
                return true;
            case 2:
                if (forced) {
                    if (ComposeUiFlags.isTrackFocusEnabled) {
                        DelegatableNodeKt.requireOwner($this$clearFocus).getFocusOwner().setActiveFocusTargetNode(null);
                        if (refreshFocusEvents) {
                            $this$clearFocus.dispatchFocusCallbacks$ui_release(FocusStateImpl.Captured, FocusStateImpl.Inactive);
                        }
                    } else {
                        $this$clearFocus.setFocusState(FocusStateImpl.Inactive);
                        if (refreshFocusEvents) {
                            $this$clearFocus.dispatchFocusCallbacks$ui_release();
                        }
                    }
                }
                return forced;
            case 3:
                if (clearChildFocus($this$clearFocus, forced, refreshFocusEvents)) {
                    if (ComposeUiFlags.isTrackFocusEnabled) {
                        if (!refreshFocusEvents) {
                            return true;
                        }
                        $this$clearFocus.dispatchFocusCallbacks$ui_release(FocusStateImpl.ActiveParent, FocusStateImpl.Inactive);
                        return true;
                    }
                    $this$clearFocus.setFocusState(FocusStateImpl.Inactive);
                    if (!refreshFocusEvents) {
                        return true;
                    }
                    $this$clearFocus.dispatchFocusCallbacks$ui_release();
                    return true;
                }
                return false;
            case 4:
                return true;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    private static final boolean grantFocus(final FocusTargetNode $this$grantFocus) {
        ObserverModifierNodeKt.observeReads($this$grantFocus, new Function0<Unit>() { // from class: androidx.compose.ui.focus.FocusTransactionsKt.grantFocus.1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                $this$grantFocus.fetchFocusProperties$ui_release();
            }
        });
        switch (WhenMappings.$EnumSwitchMapping$0[$this$grantFocus.getFocusState().ordinal()]) {
            case 3:
            case 4:
                if (ComposeUiFlags.isTrackFocusEnabled) {
                    DelegatableNodeKt.requireOwner($this$grantFocus).getFocusOwner().setActiveFocusTargetNode($this$grantFocus);
                    break;
                } else {
                    $this$grantFocus.setFocusState(FocusStateImpl.Active);
                    break;
                }
        }
        return true;
    }

    static /* synthetic */ boolean clearChildFocus$default(FocusTargetNode focusTargetNode, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = true;
        }
        return clearChildFocus(focusTargetNode, z, z2);
    }

    private static final boolean clearChildFocus(FocusTargetNode $this$clearChildFocus, boolean forced, boolean refreshFocusEvents) {
        FocusTargetNode activeChild = FocusTraversalKt.getActiveChild($this$clearChildFocus);
        if (activeChild != null) {
            return clearFocus(activeChild, forced, refreshFocusEvents);
        }
        return true;
    }

    private static final boolean requestFocusForChild(FocusTargetNode $this$requestFocusForChild, FocusTargetNode childNode) {
        int i;
        Modifier.Node node;
        int i2;
        Object obj;
        DelegatableNode $this$nearestAncestor_u2d64DMado$iv;
        int type$iv;
        int i3;
        NodeChain nodes;
        DelegatableNode $this$nearestAncestor_u2d64DMado$iv2;
        int i4;
        int i5;
        Modifier.Node node2;
        int count$iv$iv$iv;
        MutableVector mutableVector;
        DelegatableNode $this$nearestAncestor_u2d64DMado$iv3;
        int type$iv2;
        NodeChain nodes2;
        DelegatableNode $this$nearestAncestor_u2d64DMado$iv4;
        int type$iv3;
        DelegatableNode $this$nearestAncestor_u2d64DMado$iv5;
        int type$iv4;
        int count$iv$iv$iv2;
        MutableVector mutableVector2;
        FocusTargetNode $this$nearestAncestor_u2d64DMado$iv6 = childNode;
        int i6 = 1024;
        int type$iv5 = NodeKind.m6012constructorimpl(1024);
        boolean value$iv$iv$iv$iv = $this$nearestAncestor_u2d64DMado$iv6.getNode().getIsAttached();
        if (!value$iv$iv$iv$iv) {
            InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
        }
        Modifier.Node node$iv$iv$iv = $this$nearestAncestor_u2d64DMado$iv6.getNode().getParent();
        LayoutNode layout$iv$iv$iv = DelegatableNodeKt.requireLayoutNode($this$nearestAncestor_u2d64DMado$iv6);
        loop0: while (true) {
            int i7 = 1;
            i = i6;
            if (layout$iv$iv$iv == null) {
                node = null;
                break;
            }
            Modifier.Node head$iv$iv$iv = layout$iv$iv$iv.getNodes().getHead();
            if ((head$iv$iv$iv.getAggregateChildKindSet() & type$iv5) != 0) {
                while (node$iv$iv$iv != null) {
                    if ((node$iv$iv$iv.getKindSet() & type$iv5) != 0) {
                        Modifier.Node it$iv$iv = node$iv$iv$iv;
                        MutableVector mutableVector3 = null;
                        Modifier.Node nodePop = it$iv$iv;
                        while (nodePop != null) {
                            if (nodePop instanceof FocusTargetNode) {
                                node = nodePop;
                                break loop0;
                            }
                            Modifier.Node this_$iv$iv$iv$iv = nodePop;
                            if (((this_$iv$iv$iv$iv.getKindSet() & type$iv5) != 0 ? i7 : 0) == 0 || !(nodePop instanceof DelegatingNode)) {
                                $this$nearestAncestor_u2d64DMado$iv4 = $this$nearestAncestor_u2d64DMado$iv6;
                                type$iv3 = type$iv5;
                                nodePop = DelegatableNodeKt.pop(mutableVector3);
                                $this$nearestAncestor_u2d64DMado$iv6 = $this$nearestAncestor_u2d64DMado$iv4;
                                type$iv5 = type$iv3;
                                i7 = 1;
                            } else {
                                int count$iv$iv$iv3 = 0;
                                DelegatingNode this_$iv$iv$iv$iv2 = (DelegatingNode) nodePop;
                                Modifier.Node node$iv$iv$iv$iv = this_$iv$iv$iv$iv2.getDelegate();
                                while (node$iv$iv$iv$iv != null) {
                                    Modifier.Node next$iv$iv$iv = node$iv$iv$iv$iv;
                                    if (((next$iv$iv$iv.getKindSet() & type$iv5) != 0 ? i7 : 0) != 0) {
                                        count$iv$iv$iv3++;
                                        if (count$iv$iv$iv3 == i7) {
                                            nodePop = next$iv$iv$iv;
                                            $this$nearestAncestor_u2d64DMado$iv5 = $this$nearestAncestor_u2d64DMado$iv6;
                                            type$iv4 = type$iv5;
                                        } else {
                                            if (mutableVector3 == null) {
                                                $this$nearestAncestor_u2d64DMado$iv5 = $this$nearestAncestor_u2d64DMado$iv6;
                                                type$iv4 = type$iv5;
                                                count$iv$iv$iv2 = count$iv$iv$iv3;
                                                mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
                                            } else {
                                                $this$nearestAncestor_u2d64DMado$iv5 = $this$nearestAncestor_u2d64DMado$iv6;
                                                type$iv4 = type$iv5;
                                                count$iv$iv$iv2 = count$iv$iv$iv3;
                                                mutableVector2 = mutableVector3;
                                            }
                                            Modifier.Node theNode$iv$iv$iv = nodePop;
                                            if (theNode$iv$iv$iv != null) {
                                                if (mutableVector2 != null) {
                                                    mutableVector2.add(theNode$iv$iv$iv);
                                                }
                                                nodePop = null;
                                            }
                                            if (mutableVector2 != null) {
                                                mutableVector2.add(next$iv$iv$iv);
                                            }
                                            mutableVector3 = mutableVector2;
                                            count$iv$iv$iv3 = count$iv$iv$iv2;
                                        }
                                    } else {
                                        $this$nearestAncestor_u2d64DMado$iv5 = $this$nearestAncestor_u2d64DMado$iv6;
                                        type$iv4 = type$iv5;
                                    }
                                    node$iv$iv$iv$iv = node$iv$iv$iv$iv.getChild();
                                    $this$nearestAncestor_u2d64DMado$iv6 = $this$nearestAncestor_u2d64DMado$iv5;
                                    type$iv5 = type$iv4;
                                    i7 = 1;
                                }
                                $this$nearestAncestor_u2d64DMado$iv4 = $this$nearestAncestor_u2d64DMado$iv6;
                                type$iv3 = type$iv5;
                                if (count$iv$iv$iv3 == 1) {
                                    $this$nearestAncestor_u2d64DMado$iv6 = $this$nearestAncestor_u2d64DMado$iv4;
                                    type$iv5 = type$iv3;
                                    i7 = 1;
                                } else {
                                    nodePop = DelegatableNodeKt.pop(mutableVector3);
                                    $this$nearestAncestor_u2d64DMado$iv6 = $this$nearestAncestor_u2d64DMado$iv4;
                                    type$iv5 = type$iv3;
                                    i7 = 1;
                                }
                            }
                        }
                    }
                    node$iv$iv$iv = node$iv$iv$iv.getParent();
                    $this$nearestAncestor_u2d64DMado$iv6 = $this$nearestAncestor_u2d64DMado$iv6;
                    type$iv5 = type$iv5;
                    i7 = 1;
                }
                $this$nearestAncestor_u2d64DMado$iv3 = $this$nearestAncestor_u2d64DMado$iv6;
                type$iv2 = type$iv5;
            } else {
                $this$nearestAncestor_u2d64DMado$iv3 = $this$nearestAncestor_u2d64DMado$iv6;
                type$iv2 = type$iv5;
            }
            layout$iv$iv$iv = layout$iv$iv$iv.getParent$ui_release();
            node$iv$iv$iv = (layout$iv$iv$iv == null || (nodes2 = layout$iv$iv$iv.getNodes()) == null) ? null : nodes2.getTail();
            i6 = i;
            $this$nearestAncestor_u2d64DMado$iv6 = $this$nearestAncestor_u2d64DMado$iv3;
            type$iv5 = type$iv2;
        }
        if (!Intrinsics.areEqual(node, $this$requestFocusForChild)) {
            throw new IllegalStateException("Non child node cannot request focus.".toString());
        }
        switch (WhenMappings.$EnumSwitchMapping$0[$this$requestFocusForChild.getFocusState().ordinal()]) {
            case 1:
                boolean success = grantFocus(childNode);
                if (!success) {
                    return success;
                }
                $this$requestFocusForChild.setFocusState(FocusStateImpl.ActiveParent);
                return success;
            case 2:
                return false;
            case 3:
                requireActiveChild($this$requestFocusForChild);
                return clearChildFocus$default($this$requestFocusForChild, false, false, 3, null) && grantFocus(childNode);
            case 4:
                FocusTargetNode $this$nearestAncestor_u2d64DMado$iv7 = $this$requestFocusForChild;
                int count$iv$iv$iv4 = NodeKind.m6012constructorimpl(i);
                int i8 = 0;
                boolean value$iv$iv$iv$iv2 = $this$nearestAncestor_u2d64DMado$iv7.getNode().getIsAttached();
                if (!value$iv$iv$iv$iv2) {
                    InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
                }
                Modifier.Node node$iv$iv$iv2 = $this$nearestAncestor_u2d64DMado$iv7.getNode().getParent();
                LayoutNode layout$iv$iv$iv2 = DelegatableNodeKt.requireLayoutNode($this$nearestAncestor_u2d64DMado$iv7);
                while (true) {
                    if (layout$iv$iv$iv2 != null) {
                        Modifier.Node head$iv$iv$iv2 = layout$iv$iv$iv2.getNodes().getHead();
                        if ((head$iv$iv$iv2.getAggregateChildKindSet() & count$iv$iv$iv4) != 0) {
                            while (node$iv$iv$iv2 != null) {
                                if ((node$iv$iv$iv2.getKindSet() & count$iv$iv$iv4) != 0) {
                                    Modifier.Node it$iv$iv2 = node$iv$iv$iv2;
                                    MutableVector mutableVector4 = null;
                                    $this$nearestAncestor_u2d64DMado$iv2 = $this$nearestAncestor_u2d64DMado$iv7;
                                    Modifier.Node nodePop2 = it$iv$iv2;
                                    while (nodePop2 != null) {
                                        int type$iv6 = count$iv$iv$iv4;
                                        if (nodePop2 instanceof FocusTargetNode) {
                                            Object it$iv = nodePop2;
                                            obj = it$iv;
                                            i2 = 1;
                                        } else {
                                            Modifier.Node this_$iv$iv$iv$iv3 = nodePop2;
                                            if (((this_$iv$iv$iv$iv3.getKindSet() & type$iv6) != 0) && (nodePop2 instanceof DelegatingNode)) {
                                                int count$iv$iv$iv5 = 0;
                                                DelegatingNode this_$iv$iv$iv$iv4 = (DelegatingNode) nodePop2;
                                                Modifier.Node node$iv$iv$iv$iv2 = this_$iv$iv$iv$iv4.getDelegate();
                                                while (node$iv$iv$iv$iv2 != null) {
                                                    Modifier.Node next$iv$iv$iv2 = node$iv$iv$iv$iv2;
                                                    if ((next$iv$iv$iv2.getKindSet() & type$iv6) != 0) {
                                                        count$iv$iv$iv5++;
                                                        Modifier.Node node3 = nodePop2;
                                                        if (count$iv$iv$iv5 == 1) {
                                                            i5 = i8;
                                                            node2 = next$iv$iv$iv2;
                                                        } else {
                                                            if (mutableVector4 == null) {
                                                                count$iv$iv$iv = count$iv$iv$iv5;
                                                                i5 = i8;
                                                                mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                                            } else {
                                                                count$iv$iv$iv = count$iv$iv$iv5;
                                                                i5 = i8;
                                                                mutableVector = mutableVector4;
                                                            }
                                                            if (node3 != null) {
                                                                if (mutableVector != null) {
                                                                    mutableVector.add(node3);
                                                                }
                                                                node2 = null;
                                                            } else {
                                                                node2 = node3;
                                                            }
                                                            if (mutableVector != null) {
                                                                mutableVector.add(next$iv$iv$iv2);
                                                            }
                                                            mutableVector4 = mutableVector;
                                                            count$iv$iv$iv5 = count$iv$iv$iv;
                                                        }
                                                    } else {
                                                        i5 = i8;
                                                        node2 = nodePop2;
                                                    }
                                                    node$iv$iv$iv$iv2 = node$iv$iv$iv$iv2.getChild();
                                                    nodePop2 = node2;
                                                    i8 = i5;
                                                }
                                                Modifier.Node node4 = nodePop2;
                                                i4 = i8;
                                                if (count$iv$iv$iv5 == 1) {
                                                    count$iv$iv$iv4 = type$iv6;
                                                    nodePop2 = node4;
                                                    i8 = i4;
                                                } else {
                                                    nodePop2 = DelegatableNodeKt.pop(mutableVector4);
                                                    count$iv$iv$iv4 = type$iv6;
                                                    i8 = i4;
                                                }
                                            } else {
                                                i4 = i8;
                                                nodePop2 = DelegatableNodeKt.pop(mutableVector4);
                                                count$iv$iv$iv4 = type$iv6;
                                                i8 = i4;
                                            }
                                        }
                                    }
                                } else {
                                    $this$nearestAncestor_u2d64DMado$iv2 = $this$nearestAncestor_u2d64DMado$iv7;
                                }
                                node$iv$iv$iv2 = node$iv$iv$iv2.getParent();
                                $this$nearestAncestor_u2d64DMado$iv7 = $this$nearestAncestor_u2d64DMado$iv2;
                                count$iv$iv$iv4 = count$iv$iv$iv4;
                                i8 = i8;
                            }
                            $this$nearestAncestor_u2d64DMado$iv = $this$nearestAncestor_u2d64DMado$iv7;
                            type$iv = count$iv$iv$iv4;
                            i3 = i8;
                        } else {
                            $this$nearestAncestor_u2d64DMado$iv = $this$nearestAncestor_u2d64DMado$iv7;
                            type$iv = count$iv$iv$iv4;
                            i3 = i8;
                        }
                        layout$iv$iv$iv2 = layout$iv$iv$iv2.getParent$ui_release();
                        node$iv$iv$iv2 = (layout$iv$iv$iv2 == null || (nodes = layout$iv$iv$iv2.getNodes()) == null) ? null : nodes.getTail();
                        $this$nearestAncestor_u2d64DMado$iv7 = $this$nearestAncestor_u2d64DMado$iv;
                        count$iv$iv$iv4 = type$iv;
                        i8 = i3;
                    } else {
                        i2 = 1;
                        obj = null;
                    }
                }
                FocusTargetNode focusParent = (FocusTargetNode) obj;
                if (focusParent == null && requestFocusForOwner($this$requestFocusForChild)) {
                    boolean success2 = grantFocus(childNode);
                    if (!success2) {
                        return success2;
                    }
                    $this$requestFocusForChild.setFocusState(FocusStateImpl.ActiveParent);
                    return success2;
                }
                if (focusParent == null || !requestFocusForChild(focusParent, $this$requestFocusForChild)) {
                    return false;
                }
                boolean success3 = requestFocusForChild($this$requestFocusForChild, childNode);
                if (($this$requestFocusForChild.getFocusState() == FocusStateImpl.ActiveParent ? i2 : 0) == 0) {
                    throw new IllegalStateException("Deactivated node is focused".toString());
                }
                if (success3) {
                    focusParent.dispatchFocusCallbacks$ui_release();
                }
                return success3;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    private static final boolean requestFocusForOwner(FocusTargetNode $this$requestFocusForOwner) {
        return DelegatableNodeKt.requireOwner($this$requestFocusForOwner).getFocusOwner().mo4052requestFocusForOwner7o62pno(null, null);
    }

    private static final FocusTargetNode requireActiveChild(FocusTargetNode $this$requireActiveChild) {
        FocusTargetNode activeChild = FocusTraversalKt.getActiveChild($this$requireActiveChild);
        if (activeChild != null) {
            return activeChild;
        }
        throw new IllegalArgumentException("ActiveParent with no focused child".toString());
    }

    /* renamed from: performCustomRequestFocus-Mxy_nc0, reason: not valid java name */
    public static final CustomDestinationResult m4074performCustomRequestFocusMxy_nc0(FocusTargetNode $this$performCustomRequestFocus_u2dMxy_nc0, int focusDirection) {
        int i;
        int i2;
        Modifier.Node node;
        DelegatableNode $this$nearestAncestor_u2d64DMado$iv;
        int type$iv;
        int i3;
        NodeChain nodes;
        DelegatableNode $this$nearestAncestor_u2d64DMado$iv2;
        int type$iv2;
        int i4;
        int i5;
        DelegatableNode $this$nearestAncestor_u2d64DMado$iv3;
        int type$iv3;
        int i6;
        MutableVector mutableVector;
        switch (WhenMappings.$EnumSwitchMapping$0[$this$performCustomRequestFocus_u2dMxy_nc0.getFocusState().ordinal()]) {
            case 1:
            case 2:
                return CustomDestinationResult.None;
            case 3:
                return m4071performCustomClearFocusMxy_nc0(requireActiveChild($this$performCustomRequestFocus_u2dMxy_nc0), focusDirection);
            case 4:
                FocusTargetNode $this$nearestAncestor_u2d64DMado$iv4 = $this$performCustomRequestFocus_u2dMxy_nc0;
                int type$iv4 = NodeKind.m6012constructorimpl(1024);
                int i7 = 0;
                boolean value$iv$iv$iv$iv = $this$nearestAncestor_u2d64DMado$iv4.getNode().getIsAttached();
                if (!value$iv$iv$iv$iv) {
                    InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
                }
                Modifier.Node node$iv$iv$iv = $this$nearestAncestor_u2d64DMado$iv4.getNode().getParent();
                LayoutNode layout$iv$iv$iv = DelegatableNodeKt.requireLayoutNode($this$nearestAncestor_u2d64DMado$iv4);
                while (true) {
                    int i8 = 1;
                    if (layout$iv$iv$iv != null) {
                        Modifier.Node head$iv$iv$iv = layout$iv$iv$iv.getNodes().getHead();
                        if ((head$iv$iv$iv.getAggregateChildKindSet() & type$iv4) != 0) {
                            while (node$iv$iv$iv != null) {
                                if ((node$iv$iv$iv.getKindSet() & type$iv4) != 0) {
                                    Modifier.Node it$iv$iv = node$iv$iv$iv;
                                    MutableVector mutableVector2 = null;
                                    Modifier.Node nodePop = it$iv$iv;
                                    while (nodePop != null) {
                                        if (nodePop instanceof FocusTargetNode) {
                                            node = nodePop;
                                            i = i8;
                                            i2 = 0;
                                        } else {
                                            Modifier.Node this_$iv$iv$iv$iv = nodePop;
                                            if (((this_$iv$iv$iv$iv.getKindSet() & type$iv4) != 0 ? i8 : 0) == 0 || !(nodePop instanceof DelegatingNode)) {
                                                $this$nearestAncestor_u2d64DMado$iv2 = $this$nearestAncestor_u2d64DMado$iv4;
                                                type$iv2 = type$iv4;
                                                i4 = i7;
                                                i5 = i8;
                                                nodePop = DelegatableNodeKt.pop(mutableVector2);
                                                i8 = i5;
                                                $this$nearestAncestor_u2d64DMado$iv4 = $this$nearestAncestor_u2d64DMado$iv2;
                                                type$iv4 = type$iv2;
                                                i7 = i4;
                                            } else {
                                                int count$iv$iv$iv = 0;
                                                DelegatingNode this_$iv$iv$iv$iv2 = (DelegatingNode) nodePop;
                                                Modifier.Node node$iv$iv$iv$iv = this_$iv$iv$iv$iv2.getDelegate();
                                                while (node$iv$iv$iv$iv != null) {
                                                    Modifier.Node next$iv$iv$iv = node$iv$iv$iv$iv;
                                                    if (((next$iv$iv$iv.getKindSet() & type$iv4) != 0 ? i8 : 0) != 0) {
                                                        count$iv$iv$iv++;
                                                        if (count$iv$iv$iv == i8) {
                                                            nodePop = next$iv$iv$iv;
                                                            $this$nearestAncestor_u2d64DMado$iv3 = $this$nearestAncestor_u2d64DMado$iv4;
                                                            type$iv3 = type$iv4;
                                                            i6 = i7;
                                                        } else {
                                                            if (mutableVector2 == null) {
                                                                $this$nearestAncestor_u2d64DMado$iv3 = $this$nearestAncestor_u2d64DMado$iv4;
                                                                type$iv3 = type$iv4;
                                                                i6 = i7;
                                                                mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                                            } else {
                                                                $this$nearestAncestor_u2d64DMado$iv3 = $this$nearestAncestor_u2d64DMado$iv4;
                                                                type$iv3 = type$iv4;
                                                                i6 = i7;
                                                                mutableVector = mutableVector2;
                                                            }
                                                            Modifier.Node theNode$iv$iv$iv = nodePop;
                                                            if (theNode$iv$iv$iv != null) {
                                                                if (mutableVector != null) {
                                                                    mutableVector.add(theNode$iv$iv$iv);
                                                                }
                                                                nodePop = null;
                                                            }
                                                            if (mutableVector != null) {
                                                                mutableVector.add(next$iv$iv$iv);
                                                            }
                                                            mutableVector2 = mutableVector;
                                                        }
                                                    } else {
                                                        $this$nearestAncestor_u2d64DMado$iv3 = $this$nearestAncestor_u2d64DMado$iv4;
                                                        type$iv3 = type$iv4;
                                                        i6 = i7;
                                                    }
                                                    node$iv$iv$iv$iv = node$iv$iv$iv$iv.getChild();
                                                    $this$nearestAncestor_u2d64DMado$iv4 = $this$nearestAncestor_u2d64DMado$iv3;
                                                    type$iv4 = type$iv3;
                                                    i7 = i6;
                                                    i8 = 1;
                                                }
                                                $this$nearestAncestor_u2d64DMado$iv2 = $this$nearestAncestor_u2d64DMado$iv4;
                                                type$iv2 = type$iv4;
                                                i4 = i7;
                                                i5 = 1;
                                                if (count$iv$iv$iv == 1) {
                                                    i8 = 1;
                                                    $this$nearestAncestor_u2d64DMado$iv4 = $this$nearestAncestor_u2d64DMado$iv2;
                                                    type$iv4 = type$iv2;
                                                    i7 = i4;
                                                } else {
                                                    nodePop = DelegatableNodeKt.pop(mutableVector2);
                                                    i8 = i5;
                                                    $this$nearestAncestor_u2d64DMado$iv4 = $this$nearestAncestor_u2d64DMado$iv2;
                                                    type$iv4 = type$iv2;
                                                    i7 = i4;
                                                }
                                            }
                                        }
                                    }
                                }
                                node$iv$iv$iv = node$iv$iv$iv.getParent();
                                i8 = i8;
                                $this$nearestAncestor_u2d64DMado$iv4 = $this$nearestAncestor_u2d64DMado$iv4;
                                type$iv4 = type$iv4;
                                i7 = i7;
                            }
                            $this$nearestAncestor_u2d64DMado$iv = $this$nearestAncestor_u2d64DMado$iv4;
                            type$iv = type$iv4;
                            i3 = i7;
                        } else {
                            $this$nearestAncestor_u2d64DMado$iv = $this$nearestAncestor_u2d64DMado$iv4;
                            type$iv = type$iv4;
                            i3 = i7;
                        }
                        layout$iv$iv$iv = layout$iv$iv$iv.getParent$ui_release();
                        node$iv$iv$iv = (layout$iv$iv$iv == null || (nodes = layout$iv$iv$iv.getNodes()) == null) ? null : nodes.getTail();
                        $this$nearestAncestor_u2d64DMado$iv4 = $this$nearestAncestor_u2d64DMado$iv;
                        type$iv4 = type$iv;
                        i7 = i3;
                    } else {
                        i = 1;
                        i2 = 0;
                        node = null;
                    }
                }
                FocusTargetNode focusParent = (FocusTargetNode) node;
                if (focusParent == null) {
                    return CustomDestinationResult.None;
                }
                switch (WhenMappings.$EnumSwitchMapping$0[focusParent.getFocusState().ordinal()]) {
                    case 1:
                        return m4072performCustomEnterMxy_nc0(focusParent, focusDirection);
                    case 2:
                        return CustomDestinationResult.Cancelled;
                    case 3:
                        return m4074performCustomRequestFocusMxy_nc0(focusParent, focusDirection);
                    case 4:
                        CustomDestinationResult it = m4074performCustomRequestFocusMxy_nc0(focusParent, focusDirection);
                        if (it != CustomDestinationResult.None) {
                            i = i2;
                        }
                        CustomDestinationResult customDestinationResult = i == 0 ? it : null;
                        return customDestinationResult == null ? m4072performCustomEnterMxy_nc0(focusParent, focusDirection) : customDestinationResult;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* renamed from: performCustomClearFocus-Mxy_nc0, reason: not valid java name */
    public static final CustomDestinationResult m4071performCustomClearFocusMxy_nc0(FocusTargetNode $this$performCustomClearFocus_u2dMxy_nc0, int focusDirection) {
        switch (WhenMappings.$EnumSwitchMapping$0[$this$performCustomClearFocus_u2dMxy_nc0.getFocusState().ordinal()]) {
            case 1:
            case 4:
                return CustomDestinationResult.None;
            case 2:
                return CustomDestinationResult.Cancelled;
            case 3:
                CustomDestinationResult it = m4071performCustomClearFocusMxy_nc0(requireActiveChild($this$performCustomClearFocus_u2dMxy_nc0), focusDirection);
                if (it == CustomDestinationResult.None) {
                    it = null;
                }
                if (it == null) {
                    return m4073performCustomExitMxy_nc0($this$performCustomClearFocus_u2dMxy_nc0, focusDirection);
                }
                return it;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* renamed from: performCustomEnter-Mxy_nc0, reason: not valid java name */
    private static final CustomDestinationResult m4072performCustomEnterMxy_nc0(FocusTargetNode $this$performCustomEnter_u2dMxy_nc0, int focusDirection) throws Throwable {
        int generationBefore$iv$iv;
        CustomDestinationResult customDestinationResult;
        CustomDestinationResult customDestinationResult2;
        if (!$this$performCustomEnter_u2dMxy_nc0.isProcessingCustomEnter) {
            $this$performCustomEnter_u2dMxy_nc0.isProcessingCustomEnter = true;
            try {
                FocusProperties focusProperties$iv$iv = $this$performCustomEnter_u2dMxy_nc0.fetchFocusProperties$ui_release();
                try {
                    CancelIndicatingFocusBoundaryScope scope$iv$iv = new CancelIndicatingFocusBoundaryScope(focusDirection, null);
                    FocusTransactionManager focusTransactionManager$iv$iv = FocusTargetNodeKt.getFocusTransactionManager($this$performCustomEnter_u2dMxy_nc0);
                    if (focusTransactionManager$iv$iv != null) {
                        try {
                            generationBefore$iv$iv = focusTransactionManager$iv$iv.getGeneration();
                        } catch (Throwable th) {
                            th = th;
                            $this$performCustomEnter_u2dMxy_nc0.isProcessingCustomEnter = false;
                            throw th;
                        }
                    } else {
                        generationBefore$iv$iv = 0;
                    }
                    FocusOwner focusOwner$iv$iv = DelegatableNodeKt.requireOwner($this$performCustomEnter_u2dMxy_nc0).getFocusOwner();
                    FocusTargetNode activeNodeBefore$iv$iv = focusOwner$iv$iv.getActiveFocusTargetNode();
                    CancelIndicatingFocusBoundaryScope it$iv = scope$iv$iv;
                    focusProperties$iv$iv.getOnEnter().invoke(it$iv);
                    int generationAfter$iv$iv = focusTransactionManager$iv$iv != null ? focusTransactionManager$iv$iv.getGeneration() : 0;
                    FocusTargetNode activeNodeAfter$iv$iv = focusOwner$iv$iv.getActiveFocusTargetNode();
                    try {
                        if (scope$iv$iv.getIsCanceled()) {
                            FocusRequester it = FocusRequester.INSTANCE.getCancel();
                            if (it == FocusRequester.INSTANCE.getCancel()) {
                                customDestinationResult2 = CustomDestinationResult.Cancelled;
                            } else {
                                if (it != FocusRequester.INSTANCE.getRedirect$ui_release()) {
                                    CustomDestinationResult customDestinationResult3 = FocusRequester.m4060requestFocus3ESFkO8$default(it, 0, 1, null) ? CustomDestinationResult.Redirected : CustomDestinationResult.RedirectCancelled;
                                    $this$performCustomEnter_u2dMxy_nc0.isProcessingCustomEnter = false;
                                    return customDestinationResult3;
                                }
                                customDestinationResult2 = CustomDestinationResult.Redirected;
                            }
                            $this$performCustomEnter_u2dMxy_nc0.isProcessingCustomEnter = false;
                            return customDestinationResult2;
                        }
                        if (generationBefore$iv$iv != generationAfter$iv$iv || (ComposeUiFlags.isTrackFocusEnabled && activeNodeBefore$iv$iv != activeNodeAfter$iv$iv && activeNodeAfter$iv$iv != null)) {
                            FocusRequester it2 = FocusRequester.INSTANCE.getRedirect$ui_release();
                            if (it2 == FocusRequester.INSTANCE.getCancel()) {
                                customDestinationResult = CustomDestinationResult.Cancelled;
                            } else {
                                if (it2 != FocusRequester.INSTANCE.getRedirect$ui_release()) {
                                    CustomDestinationResult customDestinationResult4 = FocusRequester.m4060requestFocus3ESFkO8$default(it2, 0, 1, null) ? CustomDestinationResult.Redirected : CustomDestinationResult.RedirectCancelled;
                                    $this$performCustomEnter_u2dMxy_nc0.isProcessingCustomEnter = false;
                                    return customDestinationResult4;
                                }
                                customDestinationResult = CustomDestinationResult.Redirected;
                            }
                            $this$performCustomEnter_u2dMxy_nc0.isProcessingCustomEnter = false;
                            return customDestinationResult;
                        }
                        $this$performCustomEnter_u2dMxy_nc0.isProcessingCustomEnter = false;
                    } catch (Throwable th2) {
                        th = th2;
                        $this$performCustomEnter_u2dMxy_nc0.isProcessingCustomEnter = false;
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    $this$performCustomEnter_u2dMxy_nc0.isProcessingCustomEnter = false;
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
            }
        }
        return CustomDestinationResult.None;
    }

    /* renamed from: performCustomExit-Mxy_nc0, reason: not valid java name */
    private static final CustomDestinationResult m4073performCustomExitMxy_nc0(FocusTargetNode $this$performCustomExit_u2dMxy_nc0, int focusDirection) throws Throwable {
        int generationBefore$iv$iv;
        CustomDestinationResult customDestinationResult;
        CustomDestinationResult customDestinationResult2;
        if (!$this$performCustomExit_u2dMxy_nc0.isProcessingCustomExit) {
            $this$performCustomExit_u2dMxy_nc0.isProcessingCustomExit = true;
            try {
                FocusProperties focusProperties$iv$iv = $this$performCustomExit_u2dMxy_nc0.fetchFocusProperties$ui_release();
                try {
                    CancelIndicatingFocusBoundaryScope scope$iv$iv = new CancelIndicatingFocusBoundaryScope(focusDirection, null);
                    FocusTransactionManager focusTransactionManager$iv$iv = FocusTargetNodeKt.getFocusTransactionManager($this$performCustomExit_u2dMxy_nc0);
                    if (focusTransactionManager$iv$iv != null) {
                        try {
                            generationBefore$iv$iv = focusTransactionManager$iv$iv.getGeneration();
                        } catch (Throwable th) {
                            th = th;
                            $this$performCustomExit_u2dMxy_nc0.isProcessingCustomExit = false;
                            throw th;
                        }
                    } else {
                        generationBefore$iv$iv = 0;
                    }
                    FocusOwner focusOwner$iv$iv = DelegatableNodeKt.requireOwner($this$performCustomExit_u2dMxy_nc0).getFocusOwner();
                    FocusTargetNode activeNodeBefore$iv$iv = focusOwner$iv$iv.getActiveFocusTargetNode();
                    CancelIndicatingFocusBoundaryScope it$iv = scope$iv$iv;
                    focusProperties$iv$iv.getOnExit().invoke(it$iv);
                    int generationAfter$iv$iv = focusTransactionManager$iv$iv != null ? focusTransactionManager$iv$iv.getGeneration() : 0;
                    FocusTargetNode activeNodeAfter$iv$iv = focusOwner$iv$iv.getActiveFocusTargetNode();
                    try {
                        if (scope$iv$iv.getIsCanceled()) {
                            FocusRequester it = FocusRequester.INSTANCE.getCancel();
                            if (it == FocusRequester.INSTANCE.getCancel()) {
                                customDestinationResult2 = CustomDestinationResult.Cancelled;
                            } else {
                                if (it != FocusRequester.INSTANCE.getRedirect$ui_release()) {
                                    CustomDestinationResult customDestinationResult3 = FocusRequester.m4060requestFocus3ESFkO8$default(it, 0, 1, null) ? CustomDestinationResult.Redirected : CustomDestinationResult.RedirectCancelled;
                                    $this$performCustomExit_u2dMxy_nc0.isProcessingCustomExit = false;
                                    return customDestinationResult3;
                                }
                                customDestinationResult2 = CustomDestinationResult.Redirected;
                            }
                            $this$performCustomExit_u2dMxy_nc0.isProcessingCustomExit = false;
                            return customDestinationResult2;
                        }
                        if (generationBefore$iv$iv != generationAfter$iv$iv || (ComposeUiFlags.isTrackFocusEnabled && activeNodeBefore$iv$iv != activeNodeAfter$iv$iv && activeNodeAfter$iv$iv != null)) {
                            FocusRequester it2 = FocusRequester.INSTANCE.getRedirect$ui_release();
                            if (it2 == FocusRequester.INSTANCE.getCancel()) {
                                customDestinationResult = CustomDestinationResult.Cancelled;
                            } else {
                                if (it2 != FocusRequester.INSTANCE.getRedirect$ui_release()) {
                                    CustomDestinationResult customDestinationResult4 = FocusRequester.m4060requestFocus3ESFkO8$default(it2, 0, 1, null) ? CustomDestinationResult.Redirected : CustomDestinationResult.RedirectCancelled;
                                    $this$performCustomExit_u2dMxy_nc0.isProcessingCustomExit = false;
                                    return customDestinationResult4;
                                }
                                customDestinationResult = CustomDestinationResult.Redirected;
                            }
                            $this$performCustomExit_u2dMxy_nc0.isProcessingCustomExit = false;
                            return customDestinationResult;
                        }
                        $this$performCustomExit_u2dMxy_nc0.isProcessingCustomExit = false;
                    } catch (Throwable th2) {
                        th = th2;
                        $this$performCustomExit_u2dMxy_nc0.isProcessingCustomExit = false;
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    $this$performCustomExit_u2dMxy_nc0.isProcessingCustomExit = false;
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
            }
        }
        return CustomDestinationResult.None;
    }
}
