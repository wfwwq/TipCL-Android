package androidx.compose.ui.relocation;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeChain;
import androidx.compose.ui.node.NodeKind;
import androidx.compose.ui.unit.IntSizeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function0;

/* compiled from: BringIntoViewModifierNode.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a&\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0012\b\u0002\u0010\u0003\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0004H\u0086@¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"bringIntoView", "", "Landroidx/compose/ui/node/DelegatableNode;", "bounds", "Lkotlin/Function0;", "Landroidx/compose/ui/geometry/Rect;", "(Landroidx/compose/ui/node/DelegatableNode;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BringIntoViewModifierNodeKt {
    public static /* synthetic */ Object bringIntoView$default(DelegatableNode delegatableNode, Function0 function0, Continuation continuation, int i, Object obj) {
        if ((i & 1) != 0) {
            function0 = null;
        }
        return bringIntoView(delegatableNode, function0, continuation);
    }

    public static final Object bringIntoView(DelegatableNode delegatableNode, final Function0<Rect> function0, Continuation<? super Unit> continuation) {
        Object obj;
        final LayoutCoordinates layoutCoordinatesRequireLayoutCoordinates;
        Object objBringIntoView;
        int i;
        DelegatableNode delegatableNode2;
        int i2;
        DelegatableNode delegatableNode3;
        NodeChain nodes;
        DelegatableNode delegatableNode4;
        int i3;
        DelegatableNode delegatableNode5;
        DelegatableNode delegatableNode6;
        int i4;
        DelegatableNode delegatableNode7;
        int i5;
        MutableVector mutableVector;
        if (!delegatableNode.getNode().getIsAttached()) {
            return Unit.INSTANCE;
        }
        int iM6012constructorimpl = NodeKind.m6012constructorimpl(524288);
        DelegatableNode delegatableNode8 = delegatableNode;
        int i6 = 0;
        DelegatableNode delegatableNode9 = delegatableNode8;
        if (!delegatableNode9.getNode().getIsAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
        }
        Modifier.Node parent = delegatableNode9.getNode().getParent();
        LayoutNode layoutNodeRequireLayoutNode = DelegatableNodeKt.requireLayoutNode(delegatableNode9);
        loop0: while (true) {
            if (layoutNodeRequireLayoutNode == null) {
                obj = null;
                break;
            }
            if ((layoutNodeRequireLayoutNode.getNodes().getHead().getAggregateChildKindSet() & iM6012constructorimpl) != 0) {
                while (parent != null) {
                    if ((parent.getKindSet() & iM6012constructorimpl) != 0) {
                        MutableVector mutableVector2 = null;
                        Modifier.Node nodePop = parent;
                        while (nodePop != null) {
                            int i7 = iM6012constructorimpl;
                            if (nodePop instanceof BringIntoViewModifierNode) {
                                obj = nodePop;
                                break loop0;
                            }
                            if (((nodePop.getKindSet() & i7) != 0 ? 1 : 0) == 0 || !(nodePop instanceof DelegatingNode)) {
                                delegatableNode4 = delegatableNode8;
                                i3 = i6;
                                delegatableNode5 = delegatableNode9;
                                nodePop = DelegatableNodeKt.pop(mutableVector2);
                                iM6012constructorimpl = i7;
                                delegatableNode8 = delegatableNode4;
                                i6 = i3;
                                delegatableNode9 = delegatableNode5;
                            } else {
                                int i8 = 0;
                                Modifier.Node delegate = ((DelegatingNode) nodePop).getDelegate();
                                nodePop = nodePop;
                                while (delegate != null) {
                                    Modifier.Node node = delegate;
                                    if ((node.getKindSet() & i7) != 0) {
                                        i8++;
                                        delegatableNode6 = delegatableNode8;
                                        if (i8 == 1) {
                                            nodePop = node;
                                            i4 = i6;
                                            delegatableNode7 = delegatableNode9;
                                        } else {
                                            if (mutableVector2 == null) {
                                                i5 = i8;
                                                i4 = i6;
                                                delegatableNode7 = delegatableNode9;
                                                mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                            } else {
                                                i5 = i8;
                                                i4 = i6;
                                                delegatableNode7 = delegatableNode9;
                                                mutableVector = mutableVector2;
                                            }
                                            Modifier.Node node2 = nodePop;
                                            nodePop = nodePop;
                                            if (node2 != null) {
                                                if (mutableVector != null) {
                                                    Boxing.boxBoolean(mutableVector.add(node2));
                                                }
                                                nodePop = null;
                                            }
                                            if (mutableVector != null) {
                                                Boxing.boxBoolean(mutableVector.add(node));
                                            }
                                            mutableVector2 = mutableVector;
                                            i8 = i5;
                                        }
                                    } else {
                                        delegatableNode6 = delegatableNode8;
                                        i4 = i6;
                                        delegatableNode7 = delegatableNode9;
                                    }
                                    delegate = delegate.getChild();
                                    delegatableNode8 = delegatableNode6;
                                    i6 = i4;
                                    delegatableNode9 = delegatableNode7;
                                    nodePop = nodePop;
                                }
                                delegatableNode4 = delegatableNode8;
                                i3 = i6;
                                delegatableNode5 = delegatableNode9;
                                if (i8 == 1) {
                                    iM6012constructorimpl = i7;
                                    delegatableNode8 = delegatableNode4;
                                    i6 = i3;
                                    delegatableNode9 = delegatableNode5;
                                } else {
                                    nodePop = DelegatableNodeKt.pop(mutableVector2);
                                    iM6012constructorimpl = i7;
                                    delegatableNode8 = delegatableNode4;
                                    i6 = i3;
                                    delegatableNode9 = delegatableNode5;
                                }
                            }
                        }
                    }
                    parent = parent.getParent();
                    iM6012constructorimpl = iM6012constructorimpl;
                    delegatableNode8 = delegatableNode8;
                    i6 = i6;
                    delegatableNode9 = delegatableNode9;
                }
                i = iM6012constructorimpl;
                delegatableNode2 = delegatableNode8;
                i2 = i6;
                delegatableNode3 = delegatableNode9;
            } else {
                i = iM6012constructorimpl;
                delegatableNode2 = delegatableNode8;
                i2 = i6;
                delegatableNode3 = delegatableNode9;
            }
            layoutNodeRequireLayoutNode = layoutNodeRequireLayoutNode.getParent$ui_release();
            parent = (layoutNodeRequireLayoutNode == null || (nodes = layoutNodeRequireLayoutNode.getNodes()) == null) ? null : nodes.getTail();
            iM6012constructorimpl = i;
            delegatableNode8 = delegatableNode2;
            i6 = i2;
            delegatableNode9 = delegatableNode3;
        }
        BringIntoViewModifierNode bringIntoViewModifierNode = (BringIntoViewModifierNode) obj;
        return (bringIntoViewModifierNode != null && (objBringIntoView = bringIntoViewModifierNode.bringIntoView((layoutCoordinatesRequireLayoutCoordinates = DelegatableNodeKt.requireLayoutCoordinates(delegatableNode)), new Function0<Rect>() { // from class: androidx.compose.ui.relocation.BringIntoViewModifierNodeKt.bringIntoView.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Rect invoke() {
                Rect rectInvoke;
                Function0<Rect> function02 = function0;
                if (function02 != null && (rectInvoke = function02.invoke()) != null) {
                    return rectInvoke;
                }
                LayoutCoordinates it = layoutCoordinatesRequireLayoutCoordinates;
                if (!it.isAttached()) {
                    it = null;
                }
                if (it != null) {
                    return SizeKt.m4239toRectuvyYCjk(IntSizeKt.m7201toSizeozmzZPI(it.mo5758getSizeYbymL2g()));
                }
                return null;
            }
        }, continuation)) == IntrinsicsKt.getCOROUTINE_SUSPENDED()) ? objBringIntoView : Unit.INSTANCE;
    }
}
