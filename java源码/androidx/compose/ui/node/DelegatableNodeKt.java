package androidx.compose.ui.node;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsContext;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.semantics.SemanticsInfo;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DelegatableNode.kt */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\u001a\"\u0010\u0004\u001a\u00020\u0005*\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0001H\u0002\u001a5\u0010\n\u001a\n\u0012\u0004\u0012\u0002H\f\u0018\u00010\u000b\"\u0006\b\u0000\u0010\f\u0018\u0001*\u00020\u00022\f\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\f0\u000eH\u0080\bø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u000e\u0010\u0011\u001a\u0004\u0018\u00010\u0012*\u00020\u0007H\u0000\u001aA\u0010\u0013\u001a\u00020\u0005\"\u0006\b\u0000\u0010\f\u0018\u0001*\u00020\u00072\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\f0\u000e2\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u0002H\f\u0012\u0004\u0012\u00020\u00050\u0016H\u0080\bø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0006*\u00020\u001a2\u0006\u0010\t\u001a\u00020\u0001H\u0002\u001a\"\u0010\u001b\u001a\u00020\u0001*\u00020\u00022\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\u000eH\u0000ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u001a\n\u0010\u001e\u001a\u00020\u0005*\u00020\u0002\u001a3\u0010\u001f\u001a\u0004\u0018\u0001H\f\"\n\b\u0000\u0010\f\u0018\u0001*\u00020 *\u00020\u00022\f\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\f0\u000eH\u0080\bø\u0001\u0000¢\u0006\u0004\b!\u0010\"\u001a\u0016\u0010\u001f\u001a\u0004\u0018\u00010\u0007*\u00020\u00022\u0006\u0010#\u001a\u00020$H\u0000\u001a\u0016\u0010%\u001a\u0004\u0018\u00010\u0007*\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0002\u001a\n\u0010&\u001a\u00020\u0005*\u00020\u0002\u001a\"\u0010'\u001a\u00020(*\u00020\u00022\n\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\u000eH\u0000ø\u0001\u0000¢\u0006\u0004\b)\u0010*\u001a\n\u0010+\u001a\u00020,*\u00020\u0002\u001a\n\u0010-\u001a\u00020.*\u00020\u0002\u001a\n\u0010/\u001a\u000200*\u00020\u0002\u001a\n\u00101\u001a\u000202*\u00020\u0002\u001a\f\u00103\u001a\u00020\u001a*\u00020\u0002H\u0000\u001a\f\u00104\u001a\u000205*\u00020\u0002H\u0000\u001a\f\u00106\u001a\u000207*\u00020\u0002H\u0000\u001aK\u00108\u001a\u00020\u0005\"\u0006\b\u0000\u0010\f\u0018\u0001*\u00020\u00022\f\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\f0\u000e2\b\b\u0002\u00109\u001a\u00020\u00012\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u0002H\f\u0012\u0004\u0012\u00020\u00050\u0016H\u0080\bø\u0001\u0000¢\u0006\u0004\b:\u0010;\u001a3\u00108\u001a\u00020\u0005*\u00020\u00022\u0006\u0010#\u001a\u00020$2\b\b\u0002\u00109\u001a\u00020\u00012\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00050\u0016H\u0080\b\u001aK\u0010<\u001a\u00020\u0005\"\u0006\b\u0000\u0010\f\u0018\u0001*\u00020\u00022\f\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\f0\u000e2\b\b\u0002\u0010\t\u001a\u00020\u00012\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u0002H\f\u0012\u0004\u0012\u00020\u00050\u0016H\u0080\bø\u0001\u0000¢\u0006\u0004\b=\u0010;\u001a1\u0010<\u001a\u00020\u0005*\u00020\u00022\u0006\u0010#\u001a\u00020$2\u0006\u0010\t\u001a\u00020\u00012\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00050\u0016H\u0080\b\u001aA\u0010>\u001a\u00020\u0005\"\u0006\b\u0000\u0010\f\u0018\u0001*\u00020\u00022\f\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\f0\u000e2\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u0002H\f\u0012\u0004\u0012\u00020\u00050\u0016H\u0080\bø\u0001\u0000¢\u0006\u0004\b?\u0010@\u001a)\u0010>\u001a\u00020\u0005*\u00020\u00022\u0006\u0010#\u001a\u00020$2\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00050\u0016H\u0080\b\u001aA\u0010A\u001a\u00020\u0005\"\u0006\b\u0000\u0010\f\u0018\u0001*\u00020\u00022\f\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\f0\u000e2\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u0002H\f\u0012\u0004\u0012\u00020\u00050\u0016H\u0080\bø\u0001\u0000¢\u0006\u0004\bB\u0010@\u001a)\u0010A\u001a\u00020\u0005*\u00020\u00022\u0006\u0010#\u001a\u00020$2\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00050\u0016H\u0080\b\u001a3\u0010A\u001a\u00020\u0005*\u00020\u00022\u0006\u0010#\u001a\u00020$2\b\b\u0002\u00109\u001a\u00020\u00012\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00050\u0016H\u0080\b\u001aM\u0010C\u001a\u00020\u0005\"\u0006\b\u0000\u0010\f\u0018\u0001*\u00020\u00022\f\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\f0\u000e2\n\u0010D\u001a\u0006\u0012\u0002\b\u00030\u000e2\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u0002H\f\u0012\u0004\u0012\u00020\u00050\u0016H\u0080\bø\u0001\u0000¢\u0006\u0004\bE\u0010F\u001aK\u0010G\u001a\u00020\u0005\"\u0006\b\u0000\u0010\f\u0018\u0001*\u00020\u00022\f\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\f0\u000e2\b\b\u0002\u0010\t\u001a\u00020\u00012\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u0002H\f\u0012\u0004\u0012\u00020\u00050\u0016H\u0080\bø\u0001\u0000¢\u0006\u0004\bH\u0010;\u001aA\u0010I\u001a\u00020\u0005\"\u0006\b\u0000\u0010\f\u0018\u0001*\u00020\u00022\f\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\f0\u000e2\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u0002H\f\u0012\u0004\u0012\u00020\u00050\u0016H\u0080\bø\u0001\u0000¢\u0006\u0004\bJ\u0010@\u001aK\u0010K\u001a\u00020\u0005\"\u0006\b\u0000\u0010\f\u0018\u0001*\u00020\u00022\f\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\f0\u000e2\b\b\u0002\u0010\t\u001a\u00020\u00012\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u0002H\f\u0012\u0004\u0012\u00020\u00050\u0016H\u0080\bø\u0001\u0000¢\u0006\u0004\bL\u0010;\u001aK\u0010M\u001a\u00020\u0005\"\u0006\b\u0000\u0010\f\u0018\u0001*\u00020\u00022\f\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\f0\u000e2\b\b\u0002\u0010\t\u001a\u00020\u00012\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u0002H\f\u0012\u0004\u0012\u00020\u00010\u0016H\u0080\bø\u0001\u0000¢\u0006\u0004\bN\u0010;\u001a1\u0010M\u001a\u00020\u0005*\u00020\u00022\u0006\u0010#\u001a\u00020$2\u0006\u0010\t\u001a\u00020\u00012\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u0016H\u0080\b\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0000\u0010\u0003\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006O"}, d2 = {"isDelegationRoot", "", "Landroidx/compose/ui/node/DelegatableNode;", "(Landroidx/compose/ui/node/DelegatableNode;)Z", "addLayoutNodeChildren", "", "Landroidx/compose/runtime/collection/MutableVector;", "Landroidx/compose/ui/Modifier$Node;", "node", "zOrder", "ancestors", "", "T", ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "Landroidx/compose/ui/node/NodeKind;", "ancestors-64DMado", "(Landroidx/compose/ui/node/DelegatableNode;I)Ljava/util/List;", "asLayoutModifierNode", "Landroidx/compose/ui/node/LayoutModifierNode;", "dispatchForKind", "kind", "block", "Lkotlin/Function1;", "dispatchForKind-6rFNWt0", "(Landroidx/compose/ui/Modifier$Node;ILkotlin/jvm/functions/Function1;)V", "getChildren", "Landroidx/compose/ui/node/LayoutNode;", "has", "has-64DMado", "(Landroidx/compose/ui/node/DelegatableNode;I)Z", "invalidateSubtree", "nearestAncestor", "", "nearestAncestor-64DMado", "(Landroidx/compose/ui/node/DelegatableNode;I)Ljava/lang/Object;", "mask", "", "pop", "requestAutofill", "requireCoordinator", "Landroidx/compose/ui/node/NodeCoordinator;", "requireCoordinator-64DMado", "(Landroidx/compose/ui/node/DelegatableNode;I)Landroidx/compose/ui/node/NodeCoordinator;", "requireDensity", "Landroidx/compose/ui/unit/Density;", "requireGraphicsContext", "Landroidx/compose/ui/graphics/GraphicsContext;", "requireLayoutCoordinates", "Landroidx/compose/ui/layout/LayoutCoordinates;", "requireLayoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "requireLayoutNode", "requireOwner", "Landroidx/compose/ui/node/Owner;", "requireSemanticsInfo", "Landroidx/compose/ui/semantics/SemanticsInfo;", "visitAncestors", "includeSelf", "visitAncestors-Y-YKmho", "(Landroidx/compose/ui/node/DelegatableNode;IZLkotlin/jvm/functions/Function1;)V", "visitChildren", "visitChildren-Y-YKmho", "visitLocalAncestors", "visitLocalAncestors-6rFNWt0", "(Landroidx/compose/ui/node/DelegatableNode;ILkotlin/jvm/functions/Function1;)V", "visitLocalDescendants", "visitLocalDescendants-6rFNWt0", "visitSelfAndAncestors", "untilType", "visitSelfAndAncestors-5BbP62I", "(Landroidx/compose/ui/node/DelegatableNode;IILkotlin/jvm/functions/Function1;)V", "visitSelfAndChildren", "visitSelfAndChildren-Y-YKmho", "visitSelfAndLocalDescendants", "visitSelfAndLocalDescendants-6rFNWt0", "visitSubtree", "visitSubtree-Y-YKmho", "visitSubtreeIf", "visitSubtreeIf-Y-YKmho", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DelegatableNodeKt {
    public static final boolean isDelegationRoot(DelegatableNode $this$isDelegationRoot) {
        return $this$isDelegationRoot.getNode() == $this$isDelegationRoot;
    }

    public static /* synthetic */ void visitAncestors$default(DelegatableNode $this$visitAncestors_u24default, int mask, boolean includeSelf, Function1 block, int i, Object obj) {
        NodeChain nodes;
        if ((i & 2) != 0) {
            includeSelf = false;
        }
        boolean value$iv = $this$visitAncestors_u24default.getNode().getIsAttached();
        if (!value$iv) {
            InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
        }
        Modifier.Node node = $this$visitAncestors_u24default.getNode();
        if (!includeSelf) {
            node = node.getParent();
        }
        LayoutNode layout = requireLayoutNode($this$visitAncestors_u24default);
        while (layout != null) {
            Modifier.Node head = layout.getNodes().getHead();
            if ((head.getAggregateChildKindSet() & mask) != 0) {
                while (node != null) {
                    if ((node.getKindSet() & mask) != 0) {
                        block.invoke(node);
                    }
                    node = node.getParent();
                }
            }
            layout = layout.getParent$ui_release();
            node = (layout == null || (nodes = layout.getNodes()) == null) ? null : nodes.getTail();
        }
    }

    public static final void visitAncestors(DelegatableNode $this$visitAncestors, int mask, boolean includeSelf, Function1<? super Modifier.Node, Unit> function1) {
        NodeChain nodes;
        boolean value$iv = $this$visitAncestors.getNode().getIsAttached();
        if (!value$iv) {
            InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
        }
        Modifier.Node node = $this$visitAncestors.getNode();
        if (!includeSelf) {
            node = node.getParent();
        }
        LayoutNode layout = requireLayoutNode($this$visitAncestors);
        while (layout != null) {
            Modifier.Node head = layout.getNodes().getHead();
            if ((head.getAggregateChildKindSet() & mask) != 0) {
                while (node != null) {
                    if ((node.getKindSet() & mask) != 0) {
                        function1.invoke(node);
                    }
                    node = node.getParent();
                }
            }
            layout = layout.getParent$ui_release();
            node = (layout == null || (nodes = layout.getNodes()) == null) ? null : nodes.getTail();
        }
    }

    public static final Modifier.Node nearestAncestor(DelegatableNode $this$nearestAncestor, int mask) {
        NodeChain nodes;
        boolean value$iv = $this$nearestAncestor.getNode().getIsAttached();
        if (!value$iv) {
            InlineClassHelperKt.throwIllegalStateException("nearestAncestor called on an unattached node");
        }
        Modifier.Node node = $this$nearestAncestor.getNode().getParent();
        LayoutNode layout = requireLayoutNode($this$nearestAncestor);
        while (true) {
            Modifier.Node tail = null;
            if (layout == null) {
                return null;
            }
            Modifier.Node head = layout.getNodes().getHead();
            if ((head.getAggregateChildKindSet() & mask) != 0) {
                while (node != null) {
                    if ((node.getKindSet() & mask) != 0) {
                        return node;
                    }
                    node = node.getParent();
                }
            }
            layout = layout.getParent$ui_release();
            if (layout != null && (nodes = layout.getNodes()) != null) {
                tail = nodes.getTail();
            }
            node = tail;
        }
    }

    private static final MutableVector<LayoutNode> getChildren(LayoutNode $this$getChildren, boolean zOrder) {
        if (zOrder) {
            return $this$getChildren.getZSortedChildren();
        }
        return $this$getChildren.get_children$ui_release();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addLayoutNodeChildren(MutableVector<Modifier.Node> mutableVector, Modifier.Node node, boolean zOrder) {
        MutableVector this_$iv = getChildren(requireLayoutNode(node), zOrder);
        int i$iv = this_$iv.getSize() - 1;
        Object[] content$iv = this_$iv.content;
        if (i$iv >= content$iv.length) {
            return;
        }
        while (i$iv >= 0) {
            LayoutNode it = (LayoutNode) content$iv[i$iv];
            mutableVector.add(it.getNodes().getHead());
            i$iv--;
        }
    }

    public static final void visitChildren(DelegatableNode $this$visitChildren, int mask, boolean zOrder, Function1<? super Modifier.Node, Unit> function1) {
        boolean value$iv = $this$visitChildren.getNode().getIsAttached();
        if (!value$iv) {
            InlineClassHelperKt.throwIllegalStateException("visitChildren called on an unattached node");
        }
        MutableVector branches = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node child = $this$visitChildren.getNode().getChild();
        if (child == null) {
            addLayoutNodeChildren(branches, $this$visitChildren.getNode(), zOrder);
        } else {
            branches.add(child);
        }
        while (true) {
            MutableVector this_$iv = branches.getSize() != 0 ? 1 : null;
            if (this_$iv != null) {
                Modifier.Node branch = (Modifier.Node) branches.removeAt(branches.getSize() - 1);
                if ((branch.getAggregateChildKindSet() & mask) == 0) {
                    addLayoutNodeChildren(branches, branch, zOrder);
                } else {
                    Modifier.Node node = branch;
                    while (true) {
                        if (node == null) {
                            break;
                        }
                        if ((node.getKindSet() & mask) != 0) {
                            function1.invoke(node);
                            break;
                        }
                        node = node.getChild();
                    }
                }
            } else {
                return;
            }
        }
    }

    public static final void visitSubtreeIf(DelegatableNode $this$visitSubtreeIf, int mask, boolean zOrder, Function1<? super Modifier.Node, Boolean> function1) {
        boolean value$iv = $this$visitSubtreeIf.getNode().getIsAttached();
        if (!value$iv) {
            InlineClassHelperKt.throwIllegalStateException("visitSubtreeIf called on an unattached node");
        }
        MutableVector branches = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node child = $this$visitSubtreeIf.getNode().getChild();
        if (child == null) {
            addLayoutNodeChildren(branches, $this$visitSubtreeIf.getNode(), zOrder);
        } else {
            branches.add(child);
        }
        while (true) {
            MutableVector this_$iv = branches.getSize() != 0 ? 1 : null;
            if (this_$iv != null) {
                Modifier.Node branch = (Modifier.Node) branches.removeAt(branches.getSize() - 1);
                if ((branch.getAggregateChildKindSet() & mask) != 0) {
                    for (Modifier.Node node = branch; node != null; node = node.getChild()) {
                        if ((node.getKindSet() & mask) != 0) {
                            boolean diveDeeper = function1.invoke(node).booleanValue();
                            if (diveDeeper) {
                            }
                        }
                    }
                }
                addLayoutNodeChildren(branches, branch, zOrder);
            } else {
                return;
            }
        }
    }

    public static final void visitLocalDescendants(DelegatableNode $this$visitLocalDescendants, int mask, Function1<? super Modifier.Node, Unit> function1) {
        boolean value$iv$iv = $this$visitLocalDescendants.getNode().getIsAttached();
        if (!value$iv$iv) {
            InlineClassHelperKt.throwIllegalStateException("visitLocalDescendants called on an unattached node");
        }
        Modifier.Node self$iv = $this$visitLocalDescendants.getNode();
        if ((self$iv.getAggregateChildKindSet() & mask) == 0) {
            return;
        }
        for (Modifier.Node next$iv = self$iv.getChild(); next$iv != null; next$iv = next$iv.getChild()) {
            if ((next$iv.getKindSet() & mask) != 0) {
                function1.invoke(next$iv);
            }
        }
    }

    public static /* synthetic */ void visitLocalDescendants$default(DelegatableNode $this$visitLocalDescendants_u24default, int mask, boolean includeSelf, Function1 block, int i, Object obj) {
        if ((i & 2) != 0) {
            includeSelf = false;
        }
        boolean value$iv = $this$visitLocalDescendants_u24default.getNode().getIsAttached();
        if (!value$iv) {
            InlineClassHelperKt.throwIllegalStateException("visitLocalDescendants called on an unattached node");
        }
        Modifier.Node self = $this$visitLocalDescendants_u24default.getNode();
        if ((self.getAggregateChildKindSet() & mask) == 0) {
            return;
        }
        for (Modifier.Node next = includeSelf ? self : self.getChild(); next != null; next = next.getChild()) {
            if ((next.getKindSet() & mask) != 0) {
                block.invoke(next);
            }
        }
    }

    public static final void visitLocalDescendants(DelegatableNode $this$visitLocalDescendants, int mask, boolean includeSelf, Function1<? super Modifier.Node, Unit> function1) {
        boolean value$iv = $this$visitLocalDescendants.getNode().getIsAttached();
        if (!value$iv) {
            InlineClassHelperKt.throwIllegalStateException("visitLocalDescendants called on an unattached node");
        }
        Modifier.Node self = $this$visitLocalDescendants.getNode();
        if ((self.getAggregateChildKindSet() & mask) == 0) {
            return;
        }
        for (Modifier.Node next = includeSelf ? self : self.getChild(); next != null; next = next.getChild()) {
            if ((next.getKindSet() & mask) != 0) {
                function1.invoke(next);
            }
        }
    }

    public static final void visitLocalAncestors(DelegatableNode $this$visitLocalAncestors, int mask, Function1<? super Modifier.Node, Unit> function1) {
        boolean value$iv = $this$visitLocalAncestors.getNode().getIsAttached();
        if (!value$iv) {
            InlineClassHelperKt.throwIllegalStateException("visitLocalAncestors called on an unattached node");
        }
        for (Modifier.Node next = $this$visitLocalAncestors.getNode().getParent(); next != null; next = next.getParent()) {
            if ((next.getKindSet() & mask) != 0) {
                function1.invoke(next);
            }
        }
    }

    /* renamed from: visitSelfAndLocalDescendants-6rFNWt0, reason: not valid java name */
    public static final /* synthetic */ <T> void m5882visitSelfAndLocalDescendants6rFNWt0(DelegatableNode $this$visitSelfAndLocalDescendants_u2d6rFNWt0, int type, Function1<? super T, Unit> function1) {
        int i;
        boolean includeSelf$iv;
        DelegatableNode $this$visitLocalDescendants$iv;
        int mask$iv;
        boolean includeSelf$iv2;
        DelegatableNode $this$visitLocalDescendants$iv2;
        int mask$iv2;
        Object mutableVector;
        int i2 = 0;
        boolean includeSelf$iv3 = true;
        DelegatableNode $this$visitLocalDescendants$iv3 = $this$visitSelfAndLocalDescendants_u2d6rFNWt0;
        int mask$iv3 = type;
        boolean value$iv$iv = $this$visitLocalDescendants$iv3.getNode().getIsAttached();
        if (!value$iv$iv) {
            InlineClassHelperKt.throwIllegalStateException("visitLocalDescendants called on an unattached node");
        }
        Modifier.Node self$iv = $this$visitLocalDescendants$iv3.getNode();
        if ((self$iv.getAggregateChildKindSet() & mask$iv3) != 0) {
            Modifier.Node next$iv = self$iv;
            while (next$iv != null) {
                if ((next$iv.getKindSet() & mask$iv3) != 0) {
                    Object it = next$iv;
                    Object stack$iv = null;
                    Object node$iv = it;
                    while (node$iv != null) {
                        Intrinsics.reifiedOperationMarker(3, "T");
                        if (node$iv instanceof Object) {
                            function1.invoke(node$iv);
                            i = i2;
                            includeSelf$iv = includeSelf$iv3;
                            $this$visitLocalDescendants$iv = $this$visitLocalDescendants$iv3;
                            mask$iv = mask$iv3;
                        } else {
                            Modifier.Node this_$iv$iv = (Modifier.Node) node$iv;
                            i = i2;
                            if (((this_$iv$iv.getKindSet() & type) != 0) && (node$iv instanceof DelegatingNode)) {
                                int count$iv = 0;
                                DelegatingNode this_$iv$iv2 = (DelegatingNode) node$iv;
                                Modifier.Node node$iv$iv = this_$iv$iv2.getDelegate();
                                while (node$iv$iv != null) {
                                    Modifier.Node next$iv2 = node$iv$iv;
                                    if ((next$iv2.getKindSet() & type) != 0) {
                                        count$iv++;
                                        includeSelf$iv2 = includeSelf$iv3;
                                        if (count$iv == 1) {
                                            node$iv = next$iv2;
                                            $this$visitLocalDescendants$iv2 = $this$visitLocalDescendants$iv3;
                                            mask$iv2 = mask$iv3;
                                        } else {
                                            Object obj = (MutableVector) stack$iv;
                                            if (obj == null) {
                                                $this$visitLocalDescendants$iv2 = $this$visitLocalDescendants$iv3;
                                                mask$iv2 = mask$iv3;
                                                mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                            } else {
                                                $this$visitLocalDescendants$iv2 = $this$visitLocalDescendants$iv3;
                                                mask$iv2 = mask$iv3;
                                                mutableVector = obj;
                                            }
                                            stack$iv = mutableVector;
                                            Modifier.Node theNode$iv = (Modifier.Node) node$iv;
                                            if (theNode$iv != null) {
                                                MutableVector mutableVector2 = (MutableVector) stack$iv;
                                                if (mutableVector2 != null) {
                                                    mutableVector2.add(theNode$iv);
                                                }
                                                node$iv = null;
                                            }
                                            MutableVector mutableVector3 = (MutableVector) stack$iv;
                                            if (mutableVector3 != null) {
                                                mutableVector3.add(next$iv2);
                                            }
                                        }
                                    } else {
                                        includeSelf$iv2 = includeSelf$iv3;
                                        $this$visitLocalDescendants$iv2 = $this$visitLocalDescendants$iv3;
                                        mask$iv2 = mask$iv3;
                                    }
                                    node$iv$iv = node$iv$iv.getChild();
                                    includeSelf$iv3 = includeSelf$iv2;
                                    $this$visitLocalDescendants$iv3 = $this$visitLocalDescendants$iv2;
                                    mask$iv3 = mask$iv2;
                                }
                                includeSelf$iv = includeSelf$iv3;
                                $this$visitLocalDescendants$iv = $this$visitLocalDescendants$iv3;
                                mask$iv = mask$iv3;
                                if (count$iv == 1) {
                                    i2 = i;
                                    includeSelf$iv3 = includeSelf$iv;
                                    $this$visitLocalDescendants$iv3 = $this$visitLocalDescendants$iv;
                                    mask$iv3 = mask$iv;
                                }
                            } else {
                                includeSelf$iv = includeSelf$iv3;
                                $this$visitLocalDescendants$iv = $this$visitLocalDescendants$iv3;
                                mask$iv = mask$iv3;
                            }
                        }
                        node$iv = pop((MutableVector) stack$iv);
                        i2 = i;
                        includeSelf$iv3 = includeSelf$iv;
                        $this$visitLocalDescendants$iv3 = $this$visitLocalDescendants$iv;
                        mask$iv3 = mask$iv;
                    }
                }
                next$iv = next$iv.getChild();
                i2 = i2;
                includeSelf$iv3 = includeSelf$iv3;
                $this$visitLocalDescendants$iv3 = $this$visitLocalDescendants$iv3;
                mask$iv3 = mask$iv3;
            }
        }
    }

    /* renamed from: visitLocalDescendants-6rFNWt0, reason: not valid java name */
    public static final /* synthetic */ <T> void m5878visitLocalDescendants6rFNWt0(DelegatableNode $this$visitLocalDescendants_u2d6rFNWt0, int type, Function1<? super T, Unit> function1) {
        int mask$iv;
        DelegatableNode $this$visitLocalDescendants$iv;
        int $i$f$visitLocalDescendants;
        int mask$iv2;
        DelegatableNode $this$visitLocalDescendants$iv2;
        int $i$f$visitLocalDescendants2;
        Object mutableVector;
        int i = 0;
        int mask$iv3 = type;
        DelegatableNode $this$visitLocalDescendants$iv3 = $this$visitLocalDescendants_u2d6rFNWt0;
        int $i$f$visitLocalDescendants3 = 0;
        boolean value$iv$iv$iv = $this$visitLocalDescendants$iv3.getNode().getIsAttached();
        if (!value$iv$iv$iv) {
            InlineClassHelperKt.throwIllegalStateException("visitLocalDescendants called on an unattached node");
        }
        Modifier.Node self$iv$iv = $this$visitLocalDescendants$iv3.getNode();
        if ((self$iv$iv.getAggregateChildKindSet() & mask$iv3) != 0) {
            Modifier.Node next$iv$iv = self$iv$iv.getChild();
            while (next$iv$iv != null) {
                if ((next$iv$iv.getKindSet() & mask$iv3) != 0) {
                    Object it = next$iv$iv;
                    Object stack$iv = null;
                    Object node$iv = it;
                    while (node$iv != null) {
                        int i2 = i;
                        Intrinsics.reifiedOperationMarker(3, "T");
                        if (node$iv instanceof Object) {
                            function1.invoke(node$iv);
                            mask$iv = mask$iv3;
                            $this$visitLocalDescendants$iv = $this$visitLocalDescendants$iv3;
                            $i$f$visitLocalDescendants = $i$f$visitLocalDescendants3;
                        } else {
                            Modifier.Node this_$iv$iv = (Modifier.Node) node$iv;
                            if (((this_$iv$iv.getKindSet() & type) != 0) && (node$iv instanceof DelegatingNode)) {
                                int count$iv = 0;
                                DelegatingNode this_$iv$iv2 = (DelegatingNode) node$iv;
                                Modifier.Node node$iv$iv = this_$iv$iv2.getDelegate();
                                while (node$iv$iv != null) {
                                    Modifier.Node next$iv = node$iv$iv;
                                    if ((next$iv.getKindSet() & type) != 0) {
                                        count$iv++;
                                        mask$iv2 = mask$iv3;
                                        if (count$iv == 1) {
                                            node$iv = next$iv;
                                            $this$visitLocalDescendants$iv2 = $this$visitLocalDescendants$iv3;
                                            $i$f$visitLocalDescendants2 = $i$f$visitLocalDescendants3;
                                        } else {
                                            Object obj = (MutableVector) stack$iv;
                                            if (obj == null) {
                                                $this$visitLocalDescendants$iv2 = $this$visitLocalDescendants$iv3;
                                                $i$f$visitLocalDescendants2 = $i$f$visitLocalDescendants3;
                                                mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                            } else {
                                                $this$visitLocalDescendants$iv2 = $this$visitLocalDescendants$iv3;
                                                $i$f$visitLocalDescendants2 = $i$f$visitLocalDescendants3;
                                                mutableVector = obj;
                                            }
                                            stack$iv = mutableVector;
                                            Modifier.Node theNode$iv = (Modifier.Node) node$iv;
                                            if (theNode$iv != null) {
                                                MutableVector mutableVector2 = (MutableVector) stack$iv;
                                                if (mutableVector2 != null) {
                                                    mutableVector2.add(theNode$iv);
                                                }
                                                node$iv = null;
                                            }
                                            MutableVector mutableVector3 = (MutableVector) stack$iv;
                                            if (mutableVector3 != null) {
                                                mutableVector3.add(next$iv);
                                            }
                                        }
                                    } else {
                                        mask$iv2 = mask$iv3;
                                        $this$visitLocalDescendants$iv2 = $this$visitLocalDescendants$iv3;
                                        $i$f$visitLocalDescendants2 = $i$f$visitLocalDescendants3;
                                    }
                                    node$iv$iv = node$iv$iv.getChild();
                                    mask$iv3 = mask$iv2;
                                    $this$visitLocalDescendants$iv3 = $this$visitLocalDescendants$iv2;
                                    $i$f$visitLocalDescendants3 = $i$f$visitLocalDescendants2;
                                }
                                mask$iv = mask$iv3;
                                $this$visitLocalDescendants$iv = $this$visitLocalDescendants$iv3;
                                $i$f$visitLocalDescendants = $i$f$visitLocalDescendants3;
                                if (count$iv == 1) {
                                    i = i2;
                                    mask$iv3 = mask$iv;
                                    $this$visitLocalDescendants$iv3 = $this$visitLocalDescendants$iv;
                                    $i$f$visitLocalDescendants3 = $i$f$visitLocalDescendants;
                                }
                            } else {
                                mask$iv = mask$iv3;
                                $this$visitLocalDescendants$iv = $this$visitLocalDescendants$iv3;
                                $i$f$visitLocalDescendants = $i$f$visitLocalDescendants3;
                            }
                        }
                        node$iv = pop((MutableVector) stack$iv);
                        i = i2;
                        mask$iv3 = mask$iv;
                        $this$visitLocalDescendants$iv3 = $this$visitLocalDescendants$iv;
                        $i$f$visitLocalDescendants3 = $i$f$visitLocalDescendants;
                    }
                }
                next$iv$iv = next$iv$iv.getChild();
                i = i;
                mask$iv3 = mask$iv3;
                $this$visitLocalDescendants$iv3 = $this$visitLocalDescendants$iv3;
                $i$f$visitLocalDescendants3 = $i$f$visitLocalDescendants3;
            }
        }
    }

    /* renamed from: visitLocalAncestors-6rFNWt0, reason: not valid java name */
    public static final /* synthetic */ <T> void m5877visitLocalAncestors6rFNWt0(DelegatableNode $this$visitLocalAncestors_u2d6rFNWt0, int type, Function1<? super T, Unit> function1) {
        int i;
        int mask$iv;
        DelegatableNode $this$visitLocalAncestors$iv;
        int i2;
        int mask$iv2;
        DelegatableNode $this$visitLocalAncestors$iv2;
        Object mutableVector;
        int i3 = 0;
        int mask$iv3 = type;
        DelegatableNode $this$visitLocalAncestors$iv3 = $this$visitLocalAncestors_u2d6rFNWt0;
        boolean value$iv$iv = $this$visitLocalAncestors$iv3.getNode().getIsAttached();
        if (!value$iv$iv) {
            InlineClassHelperKt.throwIllegalStateException("visitLocalAncestors called on an unattached node");
        }
        Modifier.Node next$iv = $this$visitLocalAncestors$iv3.getNode().getParent();
        while (next$iv != null) {
            if ((next$iv.getKindSet() & mask$iv3) != 0) {
                Object it = next$iv;
                Object stack$iv = null;
                Object node$iv = it;
                while (node$iv != null) {
                    Intrinsics.reifiedOperationMarker(3, "T");
                    if (node$iv instanceof Object) {
                        function1.invoke(node$iv);
                        i = i3;
                        mask$iv = mask$iv3;
                        $this$visitLocalAncestors$iv = $this$visitLocalAncestors$iv3;
                    } else {
                        Modifier.Node this_$iv$iv = (Modifier.Node) node$iv;
                        if (((this_$iv$iv.getKindSet() & type) != 0) && (node$iv instanceof DelegatingNode)) {
                            int count$iv = 0;
                            DelegatingNode this_$iv$iv2 = (DelegatingNode) node$iv;
                            Modifier.Node node$iv$iv = this_$iv$iv2.getDelegate();
                            while (node$iv$iv != null) {
                                Modifier.Node next$iv2 = node$iv$iv;
                                if ((next$iv2.getKindSet() & type) != 0) {
                                    count$iv++;
                                    i2 = i3;
                                    if (count$iv == 1) {
                                        node$iv = next$iv2;
                                        mask$iv2 = mask$iv3;
                                        $this$visitLocalAncestors$iv2 = $this$visitLocalAncestors$iv3;
                                    } else {
                                        Object obj = (MutableVector) stack$iv;
                                        if (obj == null) {
                                            mask$iv2 = mask$iv3;
                                            $this$visitLocalAncestors$iv2 = $this$visitLocalAncestors$iv3;
                                            mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                        } else {
                                            mask$iv2 = mask$iv3;
                                            $this$visitLocalAncestors$iv2 = $this$visitLocalAncestors$iv3;
                                            mutableVector = obj;
                                        }
                                        stack$iv = mutableVector;
                                        Modifier.Node theNode$iv = (Modifier.Node) node$iv;
                                        if (theNode$iv != null) {
                                            MutableVector mutableVector2 = (MutableVector) stack$iv;
                                            if (mutableVector2 != null) {
                                                mutableVector2.add(theNode$iv);
                                            }
                                            node$iv = null;
                                        }
                                        MutableVector mutableVector3 = (MutableVector) stack$iv;
                                        if (mutableVector3 != null) {
                                            mutableVector3.add(next$iv2);
                                        }
                                    }
                                } else {
                                    i2 = i3;
                                    mask$iv2 = mask$iv3;
                                    $this$visitLocalAncestors$iv2 = $this$visitLocalAncestors$iv3;
                                }
                                node$iv$iv = node$iv$iv.getChild();
                                i3 = i2;
                                mask$iv3 = mask$iv2;
                                $this$visitLocalAncestors$iv3 = $this$visitLocalAncestors$iv2;
                            }
                            i = i3;
                            mask$iv = mask$iv3;
                            $this$visitLocalAncestors$iv = $this$visitLocalAncestors$iv3;
                            if (count$iv == 1) {
                                i3 = i;
                                mask$iv3 = mask$iv;
                                $this$visitLocalAncestors$iv3 = $this$visitLocalAncestors$iv;
                            }
                        } else {
                            i = i3;
                            mask$iv = mask$iv3;
                            $this$visitLocalAncestors$iv = $this$visitLocalAncestors$iv3;
                        }
                    }
                    node$iv = pop((MutableVector) stack$iv);
                    i3 = i;
                    mask$iv3 = mask$iv;
                    $this$visitLocalAncestors$iv3 = $this$visitLocalAncestors$iv;
                }
            }
            next$iv = next$iv.getParent();
            i3 = i3;
            mask$iv3 = mask$iv3;
            $this$visitLocalAncestors$iv3 = $this$visitLocalAncestors$iv3;
        }
    }

    /* renamed from: visitAncestors-Y-YKmho$default, reason: not valid java name */
    public static /* synthetic */ void m5874visitAncestorsYYKmho$default(DelegatableNode $this$visitAncestors_u2dY_u2dYKmho_u24default, int type, boolean includeSelf, Function1 block, int i, Object obj) {
        boolean includeSelf2;
        int i2;
        int mask$iv;
        DelegatableNode $this$visitAncestors$iv;
        NodeChain nodes;
        boolean includeSelf3;
        int i3;
        int mask$iv2;
        DelegatableNode $this$visitAncestors$iv2;
        int i4;
        int mask$iv3;
        DelegatableNode $this$visitAncestors$iv3;
        Object mutableVector;
        boolean includeSelf4 = (i & 2) != 0 ? false : includeSelf;
        int i5 = 0;
        int mask$iv4 = type;
        DelegatableNode $this$visitAncestors$iv4 = $this$visitAncestors_u2dY_u2dYKmho_u24default;
        boolean value$iv$iv = $this$visitAncestors$iv4.getNode().getIsAttached();
        if (!value$iv$iv) {
            InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
        }
        Modifier.Node node$iv = $this$visitAncestors$iv4.getNode();
        if (!includeSelf4) {
            node$iv = node$iv.getParent();
        }
        LayoutNode layout$iv = requireLayoutNode($this$visitAncestors$iv4);
        while (layout$iv != null) {
            Modifier.Node head$iv = layout$iv.getNodes().getHead();
            if ((head$iv.getAggregateChildKindSet() & mask$iv4) != 0) {
                while (node$iv != null) {
                    if ((node$iv.getKindSet() & mask$iv4) != 0) {
                        Modifier.Node it = node$iv;
                        Object stack$iv = null;
                        Modifier.Node nodePop = it;
                        while (nodePop != null) {
                            Intrinsics.reifiedOperationMarker(3, "T");
                            if (nodePop instanceof Object) {
                                block.invoke(nodePop);
                                includeSelf3 = includeSelf4;
                                i3 = i5;
                                mask$iv2 = mask$iv4;
                                $this$visitAncestors$iv2 = $this$visitAncestors$iv4;
                            } else {
                                Modifier.Node this_$iv$iv = nodePop;
                                includeSelf3 = includeSelf4;
                                if (((this_$iv$iv.getKindSet() & type) != 0) && (nodePop instanceof DelegatingNode)) {
                                    int count$iv = 0;
                                    DelegatingNode this_$iv$iv2 = (DelegatingNode) nodePop;
                                    Modifier.Node node$iv$iv = this_$iv$iv2.getDelegate();
                                    while (node$iv$iv != null) {
                                        Modifier.Node next$iv = node$iv$iv;
                                        if ((next$iv.getKindSet() & type) != 0) {
                                            count$iv++;
                                            i4 = i5;
                                            if (count$iv == 1) {
                                                nodePop = next$iv;
                                                mask$iv3 = mask$iv4;
                                                $this$visitAncestors$iv3 = $this$visitAncestors$iv4;
                                            } else {
                                                Object obj2 = (MutableVector) stack$iv;
                                                if (obj2 == null) {
                                                    mask$iv3 = mask$iv4;
                                                    $this$visitAncestors$iv3 = $this$visitAncestors$iv4;
                                                    mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                                } else {
                                                    mask$iv3 = mask$iv4;
                                                    $this$visitAncestors$iv3 = $this$visitAncestors$iv4;
                                                    mutableVector = obj2;
                                                }
                                                stack$iv = mutableVector;
                                                Modifier.Node theNode$iv = nodePop;
                                                if (theNode$iv != null) {
                                                    MutableVector mutableVector2 = (MutableVector) stack$iv;
                                                    if (mutableVector2 != null) {
                                                        mutableVector2.add(theNode$iv);
                                                    }
                                                    nodePop = null;
                                                }
                                                MutableVector mutableVector3 = (MutableVector) stack$iv;
                                                if (mutableVector3 != null) {
                                                    mutableVector3.add(next$iv);
                                                }
                                            }
                                        } else {
                                            i4 = i5;
                                            mask$iv3 = mask$iv4;
                                            $this$visitAncestors$iv3 = $this$visitAncestors$iv4;
                                        }
                                        node$iv$iv = node$iv$iv.getChild();
                                        i5 = i4;
                                        mask$iv4 = mask$iv3;
                                        $this$visitAncestors$iv4 = $this$visitAncestors$iv3;
                                    }
                                    i3 = i5;
                                    mask$iv2 = mask$iv4;
                                    $this$visitAncestors$iv2 = $this$visitAncestors$iv4;
                                    if (count$iv == 1) {
                                        includeSelf4 = includeSelf3;
                                        i5 = i3;
                                        mask$iv4 = mask$iv2;
                                        $this$visitAncestors$iv4 = $this$visitAncestors$iv2;
                                    }
                                } else {
                                    i3 = i5;
                                    mask$iv2 = mask$iv4;
                                    $this$visitAncestors$iv2 = $this$visitAncestors$iv4;
                                }
                            }
                            nodePop = pop((MutableVector) stack$iv);
                            includeSelf4 = includeSelf3;
                            i5 = i3;
                            mask$iv4 = mask$iv2;
                            $this$visitAncestors$iv4 = $this$visitAncestors$iv2;
                        }
                    }
                    node$iv = node$iv.getParent();
                    includeSelf4 = includeSelf4;
                    i5 = i5;
                    mask$iv4 = mask$iv4;
                    $this$visitAncestors$iv4 = $this$visitAncestors$iv4;
                }
                includeSelf2 = includeSelf4;
                i2 = i5;
                mask$iv = mask$iv4;
                $this$visitAncestors$iv = $this$visitAncestors$iv4;
            } else {
                includeSelf2 = includeSelf4;
                i2 = i5;
                mask$iv = mask$iv4;
                $this$visitAncestors$iv = $this$visitAncestors$iv4;
            }
            layout$iv = layout$iv.getParent$ui_release();
            node$iv = (layout$iv == null || (nodes = layout$iv.getNodes()) == null) ? null : nodes.getTail();
            includeSelf4 = includeSelf2;
            i5 = i2;
            mask$iv4 = mask$iv;
            $this$visitAncestors$iv4 = $this$visitAncestors$iv;
        }
    }

    /* renamed from: visitAncestors-Y-YKmho, reason: not valid java name */
    public static final /* synthetic */ <T> void m5873visitAncestorsYYKmho(DelegatableNode $this$visitAncestors_u2dY_u2dYKmho, int type, boolean includeSelf, Function1<? super T, Unit> function1) {
        int i;
        int mask$iv;
        DelegatableNode $this$visitAncestors$iv;
        int $i$f$visitAncestors;
        NodeChain nodes;
        int i2;
        int mask$iv2;
        DelegatableNode $this$visitAncestors$iv2;
        int $i$f$visitAncestors2;
        int mask$iv3;
        DelegatableNode $this$visitAncestors$iv3;
        int $i$f$visitAncestors3;
        Object mutableVector;
        int i3 = 0;
        int mask$iv4 = type;
        DelegatableNode $this$visitAncestors$iv4 = $this$visitAncestors_u2dY_u2dYKmho;
        int $i$f$visitAncestors4 = 0;
        boolean value$iv$iv = $this$visitAncestors$iv4.getNode().getIsAttached();
        if (!value$iv$iv) {
            InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
        }
        Modifier.Node node$iv = $this$visitAncestors$iv4.getNode();
        if (!includeSelf) {
            node$iv = node$iv.getParent();
        }
        LayoutNode layout$iv = requireLayoutNode($this$visitAncestors$iv4);
        while (layout$iv != null) {
            Modifier.Node head$iv = layout$iv.getNodes().getHead();
            if ((head$iv.getAggregateChildKindSet() & mask$iv4) != 0) {
                while (node$iv != null) {
                    if ((node$iv.getKindSet() & mask$iv4) != 0) {
                        Object it = node$iv;
                        Object stack$iv = null;
                        Object node$iv2 = it;
                        while (node$iv2 != null) {
                            Intrinsics.reifiedOperationMarker(3, "T");
                            if (node$iv2 instanceof Object) {
                                function1.invoke(node$iv2);
                                i2 = i3;
                                mask$iv2 = mask$iv4;
                                $this$visitAncestors$iv2 = $this$visitAncestors$iv4;
                                $i$f$visitAncestors2 = $i$f$visitAncestors4;
                            } else {
                                Modifier.Node this_$iv$iv = (Modifier.Node) node$iv2;
                                i2 = i3;
                                if (((this_$iv$iv.getKindSet() & type) != 0) && (node$iv2 instanceof DelegatingNode)) {
                                    int count$iv = 0;
                                    DelegatingNode this_$iv$iv2 = (DelegatingNode) node$iv2;
                                    Modifier.Node node$iv$iv = this_$iv$iv2.getDelegate();
                                    while (node$iv$iv != null) {
                                        Modifier.Node next$iv = node$iv$iv;
                                        if ((next$iv.getKindSet() & type) != 0) {
                                            count$iv++;
                                            mask$iv3 = mask$iv4;
                                            if (count$iv == 1) {
                                                node$iv2 = next$iv;
                                                $this$visitAncestors$iv3 = $this$visitAncestors$iv4;
                                                $i$f$visitAncestors3 = $i$f$visitAncestors4;
                                            } else {
                                                Object obj = (MutableVector) stack$iv;
                                                if (obj == null) {
                                                    $this$visitAncestors$iv3 = $this$visitAncestors$iv4;
                                                    $i$f$visitAncestors3 = $i$f$visitAncestors4;
                                                    mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                                } else {
                                                    $this$visitAncestors$iv3 = $this$visitAncestors$iv4;
                                                    $i$f$visitAncestors3 = $i$f$visitAncestors4;
                                                    mutableVector = obj;
                                                }
                                                stack$iv = mutableVector;
                                                Modifier.Node theNode$iv = (Modifier.Node) node$iv2;
                                                if (theNode$iv != null) {
                                                    MutableVector mutableVector2 = (MutableVector) stack$iv;
                                                    if (mutableVector2 != null) {
                                                        mutableVector2.add(theNode$iv);
                                                    }
                                                    node$iv2 = null;
                                                }
                                                MutableVector mutableVector3 = (MutableVector) stack$iv;
                                                if (mutableVector3 != null) {
                                                    mutableVector3.add(next$iv);
                                                }
                                            }
                                        } else {
                                            mask$iv3 = mask$iv4;
                                            $this$visitAncestors$iv3 = $this$visitAncestors$iv4;
                                            $i$f$visitAncestors3 = $i$f$visitAncestors4;
                                        }
                                        node$iv$iv = node$iv$iv.getChild();
                                        mask$iv4 = mask$iv3;
                                        $this$visitAncestors$iv4 = $this$visitAncestors$iv3;
                                        $i$f$visitAncestors4 = $i$f$visitAncestors3;
                                    }
                                    mask$iv2 = mask$iv4;
                                    $this$visitAncestors$iv2 = $this$visitAncestors$iv4;
                                    $i$f$visitAncestors2 = $i$f$visitAncestors4;
                                    if (count$iv == 1) {
                                        i3 = i2;
                                        mask$iv4 = mask$iv2;
                                        $this$visitAncestors$iv4 = $this$visitAncestors$iv2;
                                        $i$f$visitAncestors4 = $i$f$visitAncestors2;
                                    }
                                } else {
                                    mask$iv2 = mask$iv4;
                                    $this$visitAncestors$iv2 = $this$visitAncestors$iv4;
                                    $i$f$visitAncestors2 = $i$f$visitAncestors4;
                                }
                            }
                            node$iv2 = pop((MutableVector) stack$iv);
                            i3 = i2;
                            mask$iv4 = mask$iv2;
                            $this$visitAncestors$iv4 = $this$visitAncestors$iv2;
                            $i$f$visitAncestors4 = $i$f$visitAncestors2;
                        }
                    }
                    node$iv = node$iv.getParent();
                    i3 = i3;
                    mask$iv4 = mask$iv4;
                    $this$visitAncestors$iv4 = $this$visitAncestors$iv4;
                    $i$f$visitAncestors4 = $i$f$visitAncestors4;
                }
                i = i3;
                mask$iv = mask$iv4;
                $this$visitAncestors$iv = $this$visitAncestors$iv4;
                $i$f$visitAncestors = $i$f$visitAncestors4;
            } else {
                i = i3;
                mask$iv = mask$iv4;
                $this$visitAncestors$iv = $this$visitAncestors$iv4;
                $i$f$visitAncestors = $i$f$visitAncestors4;
            }
            layout$iv = layout$iv.getParent$ui_release();
            node$iv = (layout$iv == null || (nodes = layout$iv.getNodes()) == null) ? null : nodes.getTail();
            i3 = i;
            mask$iv4 = mask$iv;
            $this$visitAncestors$iv4 = $this$visitAncestors$iv;
            $i$f$visitAncestors4 = $i$f$visitAncestors;
        }
    }

    /* renamed from: visitSelfAndAncestors-5BbP62I, reason: not valid java name */
    public static final /* synthetic */ <T> void m5879visitSelfAndAncestors5BbP62I(DelegatableNode $this$visitSelfAndAncestors_u2d5BbP62I, int type, int untilType, Function1<? super T, Unit> function1) {
        int i;
        Modifier.Node self;
        int mask$iv;
        boolean includeSelf$iv;
        NodeChain nodes;
        Modifier.Node self2;
        int mask$iv2;
        boolean includeSelf$iv2;
        Modifier.Node self3;
        int mask$iv3;
        boolean includeSelf$iv3;
        Object mutableVector;
        int i2 = 0;
        Modifier.Node self4 = $this$visitSelfAndAncestors_u2d5BbP62I.getNode();
        int mask$iv4 = type | untilType;
        boolean includeSelf$iv4 = true;
        boolean value$iv$iv = $this$visitSelfAndAncestors_u2d5BbP62I.getNode().getIsAttached();
        if (!value$iv$iv) {
            InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
        }
        Modifier.Node node$iv = $this$visitSelfAndAncestors_u2d5BbP62I.getNode();
        LayoutNode layout$iv = requireLayoutNode($this$visitSelfAndAncestors_u2d5BbP62I);
        while (layout$iv != null) {
            Modifier.Node head$iv = layout$iv.getNodes().getHead();
            if ((head$iv.getAggregateChildKindSet() & mask$iv4) == 0) {
                i = i2;
                self = self4;
                mask$iv = mask$iv4;
                includeSelf$iv = includeSelf$iv4;
            } else {
                while (node$iv != null) {
                    if ((node$iv.getKindSet() & mask$iv4) != 0) {
                        Modifier.Node it = node$iv;
                        if (it != self4) {
                            if ((it.getKindSet() & untilType) != 0) {
                                return;
                            }
                        }
                        if ((it.getKindSet() & type) != 0) {
                            Object stack$iv = null;
                            Object node$iv2 = it;
                            while (node$iv2 != null) {
                                int i3 = i2;
                                Intrinsics.reifiedOperationMarker(3, "T");
                                if (node$iv2 instanceof Object) {
                                    function1.invoke(node$iv2);
                                    self2 = self4;
                                    mask$iv2 = mask$iv4;
                                    includeSelf$iv2 = includeSelf$iv4;
                                } else {
                                    Modifier.Node this_$iv$iv = (Modifier.Node) node$iv2;
                                    if (!((this_$iv$iv.getKindSet() & type) != 0) || !(node$iv2 instanceof DelegatingNode)) {
                                        self2 = self4;
                                        mask$iv2 = mask$iv4;
                                        includeSelf$iv2 = includeSelf$iv4;
                                    } else {
                                        int count$iv = 0;
                                        DelegatingNode this_$iv$iv2 = (DelegatingNode) node$iv2;
                                        Modifier.Node node$iv$iv = this_$iv$iv2.getDelegate();
                                        while (node$iv$iv != null) {
                                            Modifier.Node next$iv = node$iv$iv;
                                            if (!((next$iv.getKindSet() & type) != 0)) {
                                                self3 = self4;
                                                mask$iv3 = mask$iv4;
                                                includeSelf$iv3 = includeSelf$iv4;
                                            } else {
                                                count$iv++;
                                                self3 = self4;
                                                if (count$iv == 1) {
                                                    node$iv2 = next$iv;
                                                    mask$iv3 = mask$iv4;
                                                    includeSelf$iv3 = includeSelf$iv4;
                                                } else {
                                                    Object obj = (MutableVector) stack$iv;
                                                    if (obj != null) {
                                                        mask$iv3 = mask$iv4;
                                                        includeSelf$iv3 = includeSelf$iv4;
                                                        mutableVector = obj;
                                                    } else {
                                                        mask$iv3 = mask$iv4;
                                                        includeSelf$iv3 = includeSelf$iv4;
                                                        mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                                    }
                                                    stack$iv = mutableVector;
                                                    Modifier.Node theNode$iv = (Modifier.Node) node$iv2;
                                                    if (theNode$iv != null) {
                                                        MutableVector mutableVector2 = (MutableVector) stack$iv;
                                                        if (mutableVector2 != null) {
                                                            mutableVector2.add(theNode$iv);
                                                        }
                                                        node$iv2 = null;
                                                    }
                                                    MutableVector mutableVector3 = (MutableVector) stack$iv;
                                                    if (mutableVector3 != null) {
                                                        mutableVector3.add(next$iv);
                                                    }
                                                }
                                            }
                                            node$iv$iv = node$iv$iv.getChild();
                                            self4 = self3;
                                            mask$iv4 = mask$iv3;
                                            includeSelf$iv4 = includeSelf$iv3;
                                        }
                                        self2 = self4;
                                        mask$iv2 = mask$iv4;
                                        includeSelf$iv2 = includeSelf$iv4;
                                        if (count$iv == 1) {
                                            i2 = i3;
                                            self4 = self2;
                                            mask$iv4 = mask$iv2;
                                            includeSelf$iv4 = includeSelf$iv2;
                                        }
                                    }
                                }
                                node$iv2 = pop((MutableVector) stack$iv);
                                i2 = i3;
                                self4 = self2;
                                mask$iv4 = mask$iv2;
                                includeSelf$iv4 = includeSelf$iv2;
                            }
                        }
                    }
                    node$iv = node$iv.getParent();
                    i2 = i2;
                    self4 = self4;
                    mask$iv4 = mask$iv4;
                    includeSelf$iv4 = includeSelf$iv4;
                }
                i = i2;
                self = self4;
                mask$iv = mask$iv4;
                includeSelf$iv = includeSelf$iv4;
            }
            layout$iv = layout$iv.getParent$ui_release();
            node$iv = (layout$iv == null || (nodes = layout$iv.getNodes()) == null) ? null : nodes.getTail();
            i2 = i;
            self4 = self;
            mask$iv4 = mask$iv;
            includeSelf$iv4 = includeSelf$iv;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* renamed from: ancestors-64DMado, reason: not valid java name */
    public static final /* synthetic */ <T> List<T> m5868ancestors64DMado(DelegatableNode delegatableNode, int i) {
        int i2;
        DelegatableNode delegatableNode2;
        boolean z;
        NodeChain nodes;
        int i3;
        boolean z2;
        boolean z3;
        int i4;
        MutableVector mutableVector;
        ?? r3;
        int i5 = 0;
        Object obj = null;
        DelegatableNode delegatableNode3 = delegatableNode;
        boolean z4 = false;
        if (!delegatableNode3.getNode().getIsAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
        }
        Modifier.Node parent = delegatableNode3.getNode().getParent();
        LayoutNode layoutNodeRequireLayoutNode = requireLayoutNode(delegatableNode3);
        while (layoutNodeRequireLayoutNode != null) {
            if ((layoutNodeRequireLayoutNode.getNodes().getHead().getAggregateChildKindSet() & i) != 0) {
                while (parent != null) {
                    if ((parent.getKindSet() & i) != 0) {
                        Object obj2 = null;
                        i3 = i5;
                        Modifier.Node nodePop = parent;
                        while (nodePop != null) {
                            ArrayList arrayList = obj;
                            DelegatableNode delegatableNode4 = delegatableNode3;
                            Intrinsics.reifiedOperationMarker(3, "T");
                            if (nodePop instanceof Object) {
                                Modifier.Node node = nodePop;
                                if (arrayList == null) {
                                    arrayList = new ArrayList();
                                }
                                ((List) arrayList).add(node);
                                z2 = z4;
                                obj = arrayList;
                            } else {
                                if (((nodePop.getKindSet() & i) != 0 ? 1 : 0) == 0 || !(nodePop instanceof DelegatingNode)) {
                                    z2 = z4;
                                    obj = arrayList;
                                } else {
                                    int i6 = 0;
                                    Modifier.Node delegate$ui_release = ((DelegatingNode) nodePop).getDelegate();
                                    Modifier.Node node2 = nodePop;
                                    while (delegate$ui_release != null) {
                                        Modifier.Node node3 = delegate$ui_release;
                                        if ((node3.getKindSet() & i) != 0) {
                                            i6++;
                                            Modifier.Node node4 = node2;
                                            if (i6 == 1) {
                                                node2 = node3;
                                                z3 = z4;
                                            } else {
                                                MutableVector mutableVector2 = (MutableVector) obj2;
                                                if (mutableVector2 == null) {
                                                    i4 = i6;
                                                    z3 = z4;
                                                    mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                                } else {
                                                    i4 = i6;
                                                    z3 = z4;
                                                    mutableVector = mutableVector2;
                                                }
                                                obj2 = mutableVector;
                                                Modifier.Node node5 = node4;
                                                if (node5 != null) {
                                                    MutableVector mutableVector3 = (MutableVector) obj2;
                                                    if (mutableVector3 != null) {
                                                        mutableVector3.add(node5);
                                                    }
                                                    r3 = null;
                                                } else {
                                                    r3 = node4;
                                                }
                                                MutableVector mutableVector4 = (MutableVector) obj2;
                                                if (mutableVector4 != null) {
                                                    mutableVector4.add(node3);
                                                }
                                                node2 = r3;
                                                i6 = i4;
                                            }
                                        } else {
                                            z3 = z4;
                                        }
                                        delegate$ui_release = delegate$ui_release.getChild();
                                        z4 = z3;
                                        node2 = node2;
                                    }
                                    Modifier.Node node6 = node2;
                                    z2 = z4;
                                    if (i6 == 1) {
                                        obj = arrayList;
                                        delegatableNode3 = delegatableNode4;
                                        nodePop = node6;
                                        z4 = z2;
                                    } else {
                                        obj = arrayList;
                                    }
                                }
                            }
                            nodePop = pop((MutableVector) obj2);
                            delegatableNode3 = delegatableNode4;
                            z4 = z2;
                        }
                    } else {
                        i3 = i5;
                    }
                    parent = parent.getParent();
                    i5 = i3;
                    delegatableNode3 = delegatableNode3;
                    z4 = z4;
                }
                i2 = i5;
                delegatableNode2 = delegatableNode3;
                z = z4;
            } else {
                i2 = i5;
                delegatableNode2 = delegatableNode3;
                z = z4;
            }
            layoutNodeRequireLayoutNode = layoutNodeRequireLayoutNode.getParent$ui_release();
            parent = (layoutNodeRequireLayoutNode == null || (nodes = layoutNodeRequireLayoutNode.getNodes()) == null) ? null : nodes.getTail();
            i5 = i2;
            delegatableNode3 = delegatableNode2;
            z4 = z;
        }
        return (List) obj;
    }

    /* renamed from: nearestAncestor-64DMado, reason: not valid java name */
    public static final /* synthetic */ <T> T m5871nearestAncestor64DMado(DelegatableNode delegatableNode, int i) {
        int i2;
        DelegatableNode delegatableNode2;
        boolean z;
        int i3;
        int i4;
        Modifier.Node node;
        NodeChain nodes;
        int i5;
        DelegatableNode delegatableNode3;
        boolean z2;
        int i6;
        int i7;
        boolean z3;
        int i8;
        int i9;
        boolean z4;
        int i10;
        int i11;
        int i12;
        int i13 = 0;
        DelegatableNode delegatableNode4 = delegatableNode;
        boolean z5 = false;
        int i14 = 0;
        int i15 = i;
        if (!delegatableNode4.getNode().getIsAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
        }
        Modifier.Node parent = delegatableNode4.getNode().getParent();
        LayoutNode layoutNodeRequireLayoutNode = requireLayoutNode(delegatableNode4);
        while (layoutNodeRequireLayoutNode != null) {
            if ((layoutNodeRequireLayoutNode.getNodes().getHead().getAggregateChildKindSet() & i15) != 0) {
                while (parent != null) {
                    if ((parent.getKindSet() & i15) != 0) {
                        Object obj = null;
                        Modifier.Node nodePop = parent;
                        while (nodePop != null) {
                            int i16 = i13;
                            DelegatableNode delegatableNode5 = delegatableNode4;
                            Intrinsics.reifiedOperationMarker(3, "T");
                            if (nodePop instanceof Object) {
                                return (T) nodePop;
                            }
                            if (((nodePop.getKindSet() & i) != 0 ? 1 : 0) == 0 || !(nodePop instanceof DelegatingNode)) {
                                z3 = z5;
                                i8 = i14;
                                i9 = i15;
                                nodePop = pop((MutableVector) obj);
                                i13 = i16;
                                delegatableNode4 = delegatableNode5;
                                z5 = z3;
                                i14 = i8;
                                i15 = i9;
                            } else {
                                int i17 = 0;
                                Modifier.Node delegate$ui_release = ((DelegatingNode) nodePop).getDelegate();
                                while (delegate$ui_release != null) {
                                    Modifier.Node node2 = delegate$ui_release;
                                    if ((node2.getKindSet() & i) != 0) {
                                        i17++;
                                        z4 = z5;
                                        if (i17 == 1) {
                                            nodePop = node2;
                                            i10 = i14;
                                            i11 = i15;
                                        } else {
                                            MutableVector mutableVector = (MutableVector) obj;
                                            if (mutableVector == null) {
                                                i12 = i17;
                                                i10 = i14;
                                                i11 = i15;
                                                mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                            } else {
                                                i12 = i17;
                                                i10 = i14;
                                                i11 = i15;
                                            }
                                            obj = mutableVector;
                                            Modifier.Node node3 = nodePop;
                                            if (node3 != null) {
                                                MutableVector mutableVector2 = (MutableVector) obj;
                                                if (mutableVector2 != null) {
                                                    mutableVector2.add(node3);
                                                }
                                                nodePop = null;
                                            }
                                            MutableVector mutableVector3 = (MutableVector) obj;
                                            if (mutableVector3 != null) {
                                                mutableVector3.add(node2);
                                            }
                                            i17 = i12;
                                        }
                                    } else {
                                        z4 = z5;
                                        i10 = i14;
                                        i11 = i15;
                                    }
                                    delegate$ui_release = delegate$ui_release.getChild();
                                    z5 = z4;
                                    i14 = i10;
                                    i15 = i11;
                                }
                                z3 = z5;
                                i8 = i14;
                                i9 = i15;
                                if (i17 == 1) {
                                    i13 = i16;
                                    delegatableNode4 = delegatableNode5;
                                    z5 = z3;
                                    i14 = i8;
                                    i15 = i9;
                                } else {
                                    nodePop = pop((MutableVector) obj);
                                    i13 = i16;
                                    delegatableNode4 = delegatableNode5;
                                    z5 = z3;
                                    i14 = i8;
                                    i15 = i9;
                                }
                            }
                        }
                        i5 = i13;
                        delegatableNode3 = delegatableNode4;
                        z2 = z5;
                        i6 = i14;
                        i7 = i15;
                    } else {
                        i5 = i13;
                        delegatableNode3 = delegatableNode4;
                        z2 = z5;
                        i6 = i14;
                        i7 = i15;
                    }
                    parent = parent.getParent();
                    i13 = i5;
                    delegatableNode4 = delegatableNode3;
                    z5 = z2;
                    i14 = i6;
                    i15 = i7;
                }
                i2 = i13;
                delegatableNode2 = delegatableNode4;
                z = z5;
                i3 = i14;
                i4 = i15;
                node = null;
            } else {
                i2 = i13;
                delegatableNode2 = delegatableNode4;
                z = z5;
                i3 = i14;
                i4 = i15;
                node = null;
            }
            layoutNodeRequireLayoutNode = layoutNodeRequireLayoutNode.getParent$ui_release();
            parent = (layoutNodeRequireLayoutNode == null || (nodes = layoutNodeRequireLayoutNode.getNodes()) == null) ? node : nodes.getTail();
            i13 = i2;
            delegatableNode4 = delegatableNode2;
            z5 = z;
            i14 = i3;
            i15 = i4;
        }
        return null;
    }

    /* renamed from: visitChildren-Y-YKmho$default, reason: not valid java name */
    public static /* synthetic */ void m5876visitChildrenYYKmho$default(DelegatableNode $this$visitChildren_u2dY_u2dYKmho_u24default, int type, boolean zOrder, Function1 block, int i, Object obj) {
        int i2;
        int mask$iv;
        DelegatableNode $this$visitChildren$iv;
        boolean z;
        int i3;
        int mask$iv2;
        DelegatableNode $this$visitChildren$iv2;
        Object mutableVector;
        boolean zOrder2 = (i & 2) != 0 ? false : zOrder;
        int i4 = 0;
        int mask$iv3 = type;
        DelegatableNode $this$visitChildren$iv3 = $this$visitChildren_u2dY_u2dYKmho_u24default;
        boolean value$iv$iv = $this$visitChildren$iv3.getNode().getIsAttached();
        if (!value$iv$iv) {
            InlineClassHelperKt.throwIllegalStateException("visitChildren called on an unattached node");
        }
        MutableVector mutableVector2 = null;
        MutableVector branches$iv = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node child$iv = $this$visitChildren$iv3.getNode().getChild();
        if (child$iv == null) {
            addLayoutNodeChildren(branches$iv, $this$visitChildren$iv3.getNode(), zOrder2);
        } else {
            branches$iv.add(child$iv);
        }
        while (true) {
            MutableVector this_$iv$iv = branches$iv.getSize() != 0 ? 1 : mutableVector2;
            if (this_$iv$iv == null) {
                return;
            }
            Modifier.Node branch$iv = (Modifier.Node) branches$iv.removeAt(branches$iv.getSize() - 1);
            if ((branch$iv.getAggregateChildKindSet() & mask$iv3) != 0) {
                Modifier.Node node$iv = branch$iv;
                while (true) {
                    if (node$iv == null) {
                        i4 = i4;
                        break;
                    }
                    if ((node$iv.getKindSet() & mask$iv3) != 0) {
                        Modifier.Node it = node$iv;
                        Object stack$iv = null;
                        Modifier.Node nodePop = it;
                        while (nodePop != null) {
                            boolean zOrder3 = zOrder2;
                            Intrinsics.reifiedOperationMarker(3, "T");
                            if (nodePop instanceof Object) {
                                block.invoke(nodePop);
                                i2 = i4;
                                mask$iv = mask$iv3;
                                $this$visitChildren$iv = $this$visitChildren$iv3;
                                z = true;
                            } else {
                                Modifier.Node this_$iv$iv2 = nodePop;
                                if (((this_$iv$iv2.getKindSet() & type) != 0) && (nodePop instanceof DelegatingNode)) {
                                    int count$iv = 0;
                                    DelegatingNode this_$iv$iv3 = (DelegatingNode) nodePop;
                                    Modifier.Node node$iv$iv = this_$iv$iv3.getDelegate();
                                    while (node$iv$iv != null) {
                                        Modifier.Node next$iv = node$iv$iv;
                                        if ((next$iv.getKindSet() & type) != 0) {
                                            count$iv++;
                                            i3 = i4;
                                            if (count$iv == 1) {
                                                nodePop = next$iv;
                                                mask$iv2 = mask$iv3;
                                                $this$visitChildren$iv2 = $this$visitChildren$iv3;
                                            } else {
                                                Object obj2 = (MutableVector) stack$iv;
                                                if (obj2 == null) {
                                                    mask$iv2 = mask$iv3;
                                                    $this$visitChildren$iv2 = $this$visitChildren$iv3;
                                                    mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                                } else {
                                                    mask$iv2 = mask$iv3;
                                                    $this$visitChildren$iv2 = $this$visitChildren$iv3;
                                                    mutableVector = obj2;
                                                }
                                                stack$iv = mutableVector;
                                                Modifier.Node theNode$iv = nodePop;
                                                if (theNode$iv != null) {
                                                    MutableVector mutableVector3 = (MutableVector) stack$iv;
                                                    if (mutableVector3 != null) {
                                                        mutableVector3.add(theNode$iv);
                                                    }
                                                    nodePop = null;
                                                }
                                                MutableVector mutableVector4 = (MutableVector) stack$iv;
                                                if (mutableVector4 != null) {
                                                    mutableVector4.add(next$iv);
                                                }
                                            }
                                        } else {
                                            i3 = i4;
                                            mask$iv2 = mask$iv3;
                                            $this$visitChildren$iv2 = $this$visitChildren$iv3;
                                        }
                                        node$iv$iv = node$iv$iv.getChild();
                                        i4 = i3;
                                        mask$iv3 = mask$iv2;
                                        $this$visitChildren$iv3 = $this$visitChildren$iv2;
                                    }
                                    i2 = i4;
                                    mask$iv = mask$iv3;
                                    $this$visitChildren$iv = $this$visitChildren$iv3;
                                    z = true;
                                    if (count$iv == 1) {
                                        i4 = i2;
                                        zOrder2 = zOrder3;
                                        mask$iv3 = mask$iv;
                                        $this$visitChildren$iv3 = $this$visitChildren$iv;
                                    }
                                } else {
                                    i2 = i4;
                                    mask$iv = mask$iv3;
                                    $this$visitChildren$iv = $this$visitChildren$iv3;
                                    z = true;
                                }
                            }
                            nodePop = pop((MutableVector) stack$iv);
                            i4 = i2;
                            zOrder2 = zOrder3;
                            mask$iv3 = mask$iv;
                            $this$visitChildren$iv3 = $this$visitChildren$iv;
                        }
                        mutableVector2 = null;
                        i4 = i4;
                    } else {
                        node$iv = node$iv.getChild();
                        zOrder2 = zOrder2;
                        i4 = i4;
                    }
                }
            } else {
                addLayoutNodeChildren(branches$iv, branch$iv, zOrder2);
            }
        }
    }

    /* renamed from: visitChildren-Y-YKmho, reason: not valid java name */
    public static final /* synthetic */ <T> void m5875visitChildrenYYKmho(DelegatableNode $this$visitChildren_u2dY_u2dYKmho, int type, boolean zOrder, Function1<? super T, Unit> function1) {
        int i;
        int mask$iv;
        DelegatableNode $this$visitChildren$iv;
        boolean z;
        int i2;
        int mask$iv2;
        DelegatableNode $this$visitChildren$iv2;
        Object mutableVector;
        boolean z2 = zOrder;
        int i3 = 0;
        int mask$iv3 = type;
        DelegatableNode $this$visitChildren$iv3 = $this$visitChildren_u2dY_u2dYKmho;
        boolean value$iv$iv = $this$visitChildren$iv3.getNode().getIsAttached();
        if (!value$iv$iv) {
            InlineClassHelperKt.throwIllegalStateException("visitChildren called on an unattached node");
        }
        MutableVector mutableVector2 = null;
        MutableVector branches$iv = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node child$iv = $this$visitChildren$iv3.getNode().getChild();
        if (child$iv == null) {
            addLayoutNodeChildren(branches$iv, $this$visitChildren$iv3.getNode(), z2);
        } else {
            branches$iv.add(child$iv);
        }
        while (true) {
            MutableVector this_$iv$iv = branches$iv.getSize() != 0 ? 1 : mutableVector2;
            if (this_$iv$iv == null) {
                return;
            }
            Modifier.Node branch$iv = (Modifier.Node) branches$iv.removeAt(branches$iv.getSize() - 1);
            if ((branch$iv.getAggregateChildKindSet() & mask$iv3) != 0) {
                Modifier.Node node$iv = branch$iv;
                while (true) {
                    if (node$iv == null) {
                        z2 = zOrder;
                        i3 = i3;
                        break;
                    }
                    if ((node$iv.getKindSet() & mask$iv3) != 0) {
                        Object it = node$iv;
                        Object stack$iv = null;
                        Object node$iv2 = it;
                        while (node$iv2 != null) {
                            Intrinsics.reifiedOperationMarker(3, "T");
                            if (node$iv2 instanceof Object) {
                                function1.invoke(node$iv2);
                                i = i3;
                                mask$iv = mask$iv3;
                                $this$visitChildren$iv = $this$visitChildren$iv3;
                                z = true;
                            } else {
                                Modifier.Node this_$iv$iv2 = (Modifier.Node) node$iv2;
                                if (((this_$iv$iv2.getKindSet() & type) != 0) && (node$iv2 instanceof DelegatingNode)) {
                                    int count$iv = 0;
                                    DelegatingNode this_$iv$iv3 = (DelegatingNode) node$iv2;
                                    Modifier.Node node$iv$iv = this_$iv$iv3.getDelegate();
                                    while (node$iv$iv != null) {
                                        Modifier.Node next$iv = node$iv$iv;
                                        if ((next$iv.getKindSet() & type) != 0) {
                                            count$iv++;
                                            i2 = i3;
                                            if (count$iv == 1) {
                                                node$iv2 = next$iv;
                                                mask$iv2 = mask$iv3;
                                                $this$visitChildren$iv2 = $this$visitChildren$iv3;
                                            } else {
                                                Object obj = (MutableVector) stack$iv;
                                                if (obj == null) {
                                                    mask$iv2 = mask$iv3;
                                                    $this$visitChildren$iv2 = $this$visitChildren$iv3;
                                                    mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                                } else {
                                                    mask$iv2 = mask$iv3;
                                                    $this$visitChildren$iv2 = $this$visitChildren$iv3;
                                                    mutableVector = obj;
                                                }
                                                stack$iv = mutableVector;
                                                Modifier.Node theNode$iv = (Modifier.Node) node$iv2;
                                                if (theNode$iv != null) {
                                                    MutableVector mutableVector3 = (MutableVector) stack$iv;
                                                    if (mutableVector3 != null) {
                                                        mutableVector3.add(theNode$iv);
                                                    }
                                                    node$iv2 = null;
                                                }
                                                MutableVector mutableVector4 = (MutableVector) stack$iv;
                                                if (mutableVector4 != null) {
                                                    mutableVector4.add(next$iv);
                                                }
                                            }
                                        } else {
                                            i2 = i3;
                                            mask$iv2 = mask$iv3;
                                            $this$visitChildren$iv2 = $this$visitChildren$iv3;
                                        }
                                        node$iv$iv = node$iv$iv.getChild();
                                        i3 = i2;
                                        mask$iv3 = mask$iv2;
                                        $this$visitChildren$iv3 = $this$visitChildren$iv2;
                                    }
                                    i = i3;
                                    mask$iv = mask$iv3;
                                    $this$visitChildren$iv = $this$visitChildren$iv3;
                                    z = true;
                                    if (count$iv == 1) {
                                        i3 = i;
                                        mask$iv3 = mask$iv;
                                        $this$visitChildren$iv3 = $this$visitChildren$iv;
                                    }
                                } else {
                                    i = i3;
                                    mask$iv = mask$iv3;
                                    $this$visitChildren$iv = $this$visitChildren$iv3;
                                    z = true;
                                }
                            }
                            node$iv2 = pop((MutableVector) stack$iv);
                            i3 = i;
                            mask$iv3 = mask$iv;
                            $this$visitChildren$iv3 = $this$visitChildren$iv;
                        }
                        z2 = zOrder;
                        mutableVector2 = null;
                        i3 = i3;
                    } else {
                        node$iv = node$iv.getChild();
                        i3 = i3;
                    }
                }
            } else {
                addLayoutNodeChildren(branches$iv, branch$iv, z2);
            }
        }
    }

    /* renamed from: visitSelfAndChildren-Y-YKmho$default, reason: not valid java name */
    public static /* synthetic */ void m5881visitSelfAndChildrenYYKmho$default(DelegatableNode $this$visitSelfAndChildren_u2dY_u2dYKmho_u24default, int type, boolean zOrder, Function1 block, int i, Object obj) {
        boolean zOrder2;
        int count$iv;
        boolean z;
        boolean zOrder3;
        int mask$iv;
        DelegatableNode $this$visitChildren$iv;
        boolean zOrder4;
        int mask$iv2;
        DelegatableNode $this$visitChildren$iv2;
        Object mutableVector;
        int i2;
        Modifier.Node $this$dispatchForKind_u2d6rFNWt0$iv;
        int i3;
        Modifier.Node $this$dispatchForKind_u2d6rFNWt0$iv2;
        Function1 function1 = block;
        if ((i & 2) == 0) {
            zOrder2 = zOrder;
        } else {
            zOrder2 = false;
        }
        int i4 = 0;
        Modifier.Node $this$dispatchForKind_u2d6rFNWt0$iv3 = $this$visitSelfAndChildren_u2dY_u2dYKmho_u24default.getNode();
        Object stack$iv = null;
        Modifier.Node nodePop = $this$dispatchForKind_u2d6rFNWt0$iv3;
        while (true) {
            count$iv = 3;
            z = false;
            int i5 = 1;
            if (nodePop == null) {
                break;
            }
            Intrinsics.reifiedOperationMarker(3, "T");
            if (nodePop instanceof Object) {
                function1.invoke(nodePop);
                i2 = i4;
                $this$dispatchForKind_u2d6rFNWt0$iv = $this$dispatchForKind_u2d6rFNWt0$iv3;
            } else {
                Modifier.Node this_$iv$iv = nodePop;
                Modifier.Node this_$iv$iv2 = (this_$iv$iv.getKindSet() & type) != 0 ? 1 : null;
                if (this_$iv$iv2 == null || !(nodePop instanceof DelegatingNode)) {
                    i2 = i4;
                    $this$dispatchForKind_u2d6rFNWt0$iv = $this$dispatchForKind_u2d6rFNWt0$iv3;
                } else {
                    int count$iv2 = 0;
                    DelegatingNode this_$iv$iv3 = (DelegatingNode) nodePop;
                    Modifier.Node node$iv$iv = this_$iv$iv3.getDelegate();
                    while (node$iv$iv != null) {
                        Modifier.Node next$iv = node$iv$iv;
                        if (((next$iv.getKindSet() & type) != 0 ? i5 : 0) == 0) {
                            i3 = i4;
                            $this$dispatchForKind_u2d6rFNWt0$iv2 = $this$dispatchForKind_u2d6rFNWt0$iv3;
                        } else {
                            count$iv2++;
                            if (count$iv2 == i5) {
                                nodePop = next$iv;
                                i3 = i4;
                                $this$dispatchForKind_u2d6rFNWt0$iv2 = $this$dispatchForKind_u2d6rFNWt0$iv3;
                            } else {
                                Object obj2 = (MutableVector) stack$iv;
                                if (obj2 != null) {
                                    i3 = i4;
                                    $this$dispatchForKind_u2d6rFNWt0$iv2 = $this$dispatchForKind_u2d6rFNWt0$iv3;
                                } else {
                                    i3 = i4;
                                    $this$dispatchForKind_u2d6rFNWt0$iv2 = $this$dispatchForKind_u2d6rFNWt0$iv3;
                                    Object mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
                                    obj2 = mutableVector2;
                                }
                                stack$iv = obj2;
                                Modifier.Node theNode$iv = nodePop;
                                if (theNode$iv != null) {
                                    MutableVector mutableVector3 = (MutableVector) stack$iv;
                                    if (mutableVector3 != null) {
                                        mutableVector3.add(theNode$iv);
                                    }
                                    nodePop = null;
                                }
                                MutableVector mutableVector4 = (MutableVector) stack$iv;
                                if (mutableVector4 != null) {
                                    mutableVector4.add(next$iv);
                                }
                            }
                        }
                        node$iv$iv = node$iv$iv.getChild();
                        i4 = i3;
                        $this$dispatchForKind_u2d6rFNWt0$iv3 = $this$dispatchForKind_u2d6rFNWt0$iv2;
                        i5 = 1;
                    }
                    i2 = i4;
                    $this$dispatchForKind_u2d6rFNWt0$iv = $this$dispatchForKind_u2d6rFNWt0$iv3;
                    if (count$iv2 == 1) {
                        i4 = i2;
                        $this$dispatchForKind_u2d6rFNWt0$iv3 = $this$dispatchForKind_u2d6rFNWt0$iv;
                    }
                }
            }
            nodePop = pop((MutableVector) stack$iv);
            i4 = i2;
            $this$dispatchForKind_u2d6rFNWt0$iv3 = $this$dispatchForKind_u2d6rFNWt0$iv;
        }
        int mask$iv3 = type;
        DelegatableNode $this$visitChildren$iv3 = $this$visitSelfAndChildren_u2dY_u2dYKmho_u24default;
        boolean value$iv$iv = $this$visitChildren$iv3.getNode().getIsAttached();
        if (!value$iv$iv) {
            InlineClassHelperKt.throwIllegalStateException("visitChildren called on an unattached node");
        }
        MutableVector branches$iv = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node child$iv = $this$visitChildren$iv3.getNode().getChild();
        if (child$iv == null) {
            addLayoutNodeChildren(branches$iv, $this$visitChildren$iv3.getNode(), zOrder2);
        } else {
            branches$iv.add(child$iv);
        }
        while (true) {
            if (!(branches$iv.getSize() != 0 ? true : z)) {
                return;
            }
            Modifier.Node branch$iv = (Modifier.Node) branches$iv.removeAt(branches$iv.getSize() - 1);
            if ((branch$iv.getAggregateChildKindSet() & mask$iv3) == 0) {
                addLayoutNodeChildren(branches$iv, branch$iv, zOrder2);
            } else {
                Modifier.Node node$iv = branch$iv;
                while (true) {
                    if (node$iv == null) {
                        function1 = block;
                        zOrder2 = zOrder2;
                        mask$iv3 = mask$iv3;
                        count$iv = 3;
                        break;
                    }
                    if ((node$iv.getKindSet() & mask$iv3) != 0) {
                        Modifier.Node it = node$iv;
                        Object stack$iv2 = null;
                        Modifier.Node nodePop2 = it;
                        while (nodePop2 != null) {
                            Intrinsics.reifiedOperationMarker(count$iv, "T");
                            if (nodePop2 instanceof Object) {
                                function1.invoke(nodePop2);
                                zOrder3 = zOrder2;
                                mask$iv = mask$iv3;
                                $this$visitChildren$iv = $this$visitChildren$iv3;
                            } else {
                                Modifier.Node this_$iv$iv4 = nodePop2;
                                if (!((this_$iv$iv4.getKindSet() & type) != 0) || !(nodePop2 instanceof DelegatingNode)) {
                                    zOrder3 = zOrder2;
                                    mask$iv = mask$iv3;
                                    $this$visitChildren$iv = $this$visitChildren$iv3;
                                } else {
                                    int count$iv3 = 0;
                                    DelegatingNode this_$iv$iv5 = (DelegatingNode) nodePop2;
                                    Modifier.Node node$iv$iv2 = this_$iv$iv5.getDelegate();
                                    while (node$iv$iv2 != null) {
                                        Modifier.Node next$iv2 = node$iv$iv2;
                                        if (!((next$iv2.getKindSet() & type) != 0)) {
                                            zOrder4 = zOrder2;
                                            mask$iv2 = mask$iv3;
                                            $this$visitChildren$iv2 = $this$visitChildren$iv3;
                                        } else {
                                            count$iv3++;
                                            zOrder4 = zOrder2;
                                            if (count$iv3 == 1) {
                                                nodePop2 = next$iv2;
                                                mask$iv2 = mask$iv3;
                                                $this$visitChildren$iv2 = $this$visitChildren$iv3;
                                            } else {
                                                Object obj3 = (MutableVector) stack$iv2;
                                                if (obj3 != null) {
                                                    mask$iv2 = mask$iv3;
                                                    $this$visitChildren$iv2 = $this$visitChildren$iv3;
                                                    mutableVector = obj3;
                                                } else {
                                                    mask$iv2 = mask$iv3;
                                                    $this$visitChildren$iv2 = $this$visitChildren$iv3;
                                                    mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                                }
                                                stack$iv2 = mutableVector;
                                                Modifier.Node theNode$iv2 = nodePop2;
                                                if (theNode$iv2 != null) {
                                                    MutableVector mutableVector5 = (MutableVector) stack$iv2;
                                                    if (mutableVector5 != null) {
                                                        mutableVector5.add(theNode$iv2);
                                                    }
                                                    nodePop2 = null;
                                                }
                                                MutableVector mutableVector6 = (MutableVector) stack$iv2;
                                                if (mutableVector6 != null) {
                                                    mutableVector6.add(next$iv2);
                                                }
                                            }
                                        }
                                        node$iv$iv2 = node$iv$iv2.getChild();
                                        zOrder2 = zOrder4;
                                        mask$iv3 = mask$iv2;
                                        $this$visitChildren$iv3 = $this$visitChildren$iv2;
                                    }
                                    zOrder3 = zOrder2;
                                    mask$iv = mask$iv3;
                                    $this$visitChildren$iv = $this$visitChildren$iv3;
                                    if (count$iv3 == 1) {
                                        function1 = block;
                                        zOrder2 = zOrder3;
                                        mask$iv3 = mask$iv;
                                        $this$visitChildren$iv3 = $this$visitChildren$iv;
                                        count$iv = 3;
                                    }
                                }
                            }
                            nodePop2 = pop((MutableVector) stack$iv2);
                            function1 = block;
                            zOrder2 = zOrder3;
                            mask$iv3 = mask$iv;
                            $this$visitChildren$iv3 = $this$visitChildren$iv;
                            count$iv = 3;
                        }
                        function1 = block;
                        z = false;
                        zOrder2 = zOrder2;
                        mask$iv3 = mask$iv3;
                        count$iv = 3;
                    } else {
                        node$iv = node$iv.getChild();
                        function1 = block;
                        zOrder2 = zOrder2;
                        mask$iv3 = mask$iv3;
                        count$iv = 3;
                    }
                }
            }
        }
    }

    /* renamed from: visitSelfAndChildren-Y-YKmho, reason: not valid java name */
    public static final /* synthetic */ <T> void m5880visitSelfAndChildrenYYKmho(DelegatableNode $this$visitSelfAndChildren_u2dY_u2dYKmho, int type, boolean zOrder, Function1<? super T, Unit> function1) {
        int count$iv;
        boolean z;
        int mask$iv;
        DelegatableNode $this$visitChildren$iv;
        int mask$iv2;
        DelegatableNode $this$visitChildren$iv2;
        Object mutableVector;
        int i;
        Modifier.Node $this$dispatchForKind_u2d6rFNWt0$iv;
        int i2;
        Modifier.Node $this$dispatchForKind_u2d6rFNWt0$iv2;
        boolean z2 = zOrder;
        Function1<? super T, Unit> function12 = function1;
        int i3 = 0;
        Modifier.Node $this$dispatchForKind_u2d6rFNWt0$iv3 = $this$visitSelfAndChildren_u2dY_u2dYKmho.getNode();
        Object stack$iv = null;
        Modifier.Node node$iv = $this$dispatchForKind_u2d6rFNWt0$iv3;
        while (true) {
            count$iv = 3;
            z = false;
            int i4 = 1;
            if (node$iv == null) {
                break;
            }
            Intrinsics.reifiedOperationMarker(3, "T");
            if (node$iv instanceof Object) {
                function12.invoke(node$iv);
                i = i3;
                $this$dispatchForKind_u2d6rFNWt0$iv = $this$dispatchForKind_u2d6rFNWt0$iv3;
            } else {
                Modifier.Node this_$iv$iv = node$iv;
                Modifier.Node this_$iv$iv2 = (this_$iv$iv.getKindSet() & type) != 0 ? 1 : null;
                if (this_$iv$iv2 == null || !(node$iv instanceof DelegatingNode)) {
                    i = i3;
                    $this$dispatchForKind_u2d6rFNWt0$iv = $this$dispatchForKind_u2d6rFNWt0$iv3;
                } else {
                    int count$iv2 = 0;
                    DelegatingNode this_$iv$iv3 = (DelegatingNode) node$iv;
                    Modifier.Node node$iv$iv = this_$iv$iv3.getDelegate();
                    while (node$iv$iv != null) {
                        Modifier.Node next$iv = node$iv$iv;
                        if (((next$iv.getKindSet() & type) != 0 ? i4 : 0) == 0) {
                            i2 = i3;
                            $this$dispatchForKind_u2d6rFNWt0$iv2 = $this$dispatchForKind_u2d6rFNWt0$iv3;
                        } else {
                            count$iv2++;
                            if (count$iv2 == i4) {
                                node$iv = next$iv;
                                i2 = i3;
                                $this$dispatchForKind_u2d6rFNWt0$iv2 = $this$dispatchForKind_u2d6rFNWt0$iv3;
                            } else {
                                Object obj = (MutableVector) stack$iv;
                                if (obj != null) {
                                    i2 = i3;
                                    $this$dispatchForKind_u2d6rFNWt0$iv2 = $this$dispatchForKind_u2d6rFNWt0$iv3;
                                } else {
                                    i2 = i3;
                                    $this$dispatchForKind_u2d6rFNWt0$iv2 = $this$dispatchForKind_u2d6rFNWt0$iv3;
                                    Object mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
                                    obj = mutableVector2;
                                }
                                stack$iv = obj;
                                Modifier.Node theNode$iv = node$iv;
                                if (theNode$iv != null) {
                                    MutableVector mutableVector3 = (MutableVector) stack$iv;
                                    if (mutableVector3 != null) {
                                        mutableVector3.add(theNode$iv);
                                    }
                                    node$iv = null;
                                }
                                MutableVector mutableVector4 = (MutableVector) stack$iv;
                                if (mutableVector4 != null) {
                                    mutableVector4.add(next$iv);
                                }
                            }
                        }
                        node$iv$iv = node$iv$iv.getChild();
                        i3 = i2;
                        $this$dispatchForKind_u2d6rFNWt0$iv3 = $this$dispatchForKind_u2d6rFNWt0$iv2;
                        i4 = 1;
                    }
                    i = i3;
                    $this$dispatchForKind_u2d6rFNWt0$iv = $this$dispatchForKind_u2d6rFNWt0$iv3;
                    if (count$iv2 == 1) {
                        i3 = i;
                        $this$dispatchForKind_u2d6rFNWt0$iv3 = $this$dispatchForKind_u2d6rFNWt0$iv;
                    }
                }
            }
            node$iv = pop((MutableVector) stack$iv);
            i3 = i;
            $this$dispatchForKind_u2d6rFNWt0$iv3 = $this$dispatchForKind_u2d6rFNWt0$iv;
        }
        int mask$iv3 = type;
        DelegatableNode $this$visitChildren$iv3 = $this$visitSelfAndChildren_u2dY_u2dYKmho;
        boolean value$iv$iv = $this$visitChildren$iv3.getNode().getIsAttached();
        if (!value$iv$iv) {
            InlineClassHelperKt.throwIllegalStateException("visitChildren called on an unattached node");
        }
        MutableVector branches$iv = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node child$iv = $this$visitChildren$iv3.getNode().getChild();
        if (child$iv == null) {
            addLayoutNodeChildren(branches$iv, $this$visitChildren$iv3.getNode(), z2);
        } else {
            branches$iv.add(child$iv);
        }
        while (true) {
            if (!(branches$iv.getSize() != 0 ? true : z)) {
                return;
            }
            Modifier.Node branch$iv = (Modifier.Node) branches$iv.removeAt(branches$iv.getSize() - 1);
            if ((branch$iv.getAggregateChildKindSet() & mask$iv3) == 0) {
                addLayoutNodeChildren(branches$iv, branch$iv, z2);
            } else {
                Modifier.Node node$iv2 = branch$iv;
                while (true) {
                    if (node$iv2 == null) {
                        z2 = zOrder;
                        mask$iv3 = mask$iv3;
                        count$iv = 3;
                        function12 = function1;
                        break;
                    }
                    if ((node$iv2.getKindSet() & mask$iv3) != 0) {
                        Object it = node$iv2;
                        Object stack$iv2 = null;
                        Object node$iv3 = it;
                        while (node$iv3 != null) {
                            Intrinsics.reifiedOperationMarker(count$iv, "T");
                            if (node$iv3 instanceof Object) {
                                function12.invoke(node$iv3);
                                mask$iv = mask$iv3;
                                $this$visitChildren$iv = $this$visitChildren$iv3;
                            } else {
                                Modifier.Node this_$iv$iv4 = (Modifier.Node) node$iv3;
                                if (!((this_$iv$iv4.getKindSet() & type) != 0) || !(node$iv3 instanceof DelegatingNode)) {
                                    mask$iv = mask$iv3;
                                    $this$visitChildren$iv = $this$visitChildren$iv3;
                                } else {
                                    int count$iv3 = 0;
                                    DelegatingNode this_$iv$iv5 = (DelegatingNode) node$iv3;
                                    Modifier.Node node$iv$iv2 = this_$iv$iv5.getDelegate();
                                    while (node$iv$iv2 != null) {
                                        Modifier.Node next$iv2 = node$iv$iv2;
                                        if (!((next$iv2.getKindSet() & type) != 0)) {
                                            mask$iv2 = mask$iv3;
                                            $this$visitChildren$iv2 = $this$visitChildren$iv3;
                                        } else {
                                            count$iv3++;
                                            if (count$iv3 == 1) {
                                                node$iv3 = next$iv2;
                                                mask$iv2 = mask$iv3;
                                                $this$visitChildren$iv2 = $this$visitChildren$iv3;
                                            } else {
                                                Object obj2 = (MutableVector) stack$iv2;
                                                if (obj2 != null) {
                                                    mask$iv2 = mask$iv3;
                                                    $this$visitChildren$iv2 = $this$visitChildren$iv3;
                                                    mutableVector = obj2;
                                                } else {
                                                    mask$iv2 = mask$iv3;
                                                    $this$visitChildren$iv2 = $this$visitChildren$iv3;
                                                    mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                                }
                                                stack$iv2 = mutableVector;
                                                Modifier.Node theNode$iv2 = (Modifier.Node) node$iv3;
                                                if (theNode$iv2 != null) {
                                                    MutableVector mutableVector5 = (MutableVector) stack$iv2;
                                                    if (mutableVector5 != null) {
                                                        mutableVector5.add(theNode$iv2);
                                                    }
                                                    node$iv3 = null;
                                                }
                                                MutableVector mutableVector6 = (MutableVector) stack$iv2;
                                                if (mutableVector6 != null) {
                                                    mutableVector6.add(next$iv2);
                                                }
                                            }
                                        }
                                        node$iv$iv2 = node$iv$iv2.getChild();
                                        mask$iv3 = mask$iv2;
                                        $this$visitChildren$iv3 = $this$visitChildren$iv2;
                                    }
                                    mask$iv = mask$iv3;
                                    $this$visitChildren$iv = $this$visitChildren$iv3;
                                    if (count$iv3 == 1) {
                                        function12 = function1;
                                        mask$iv3 = mask$iv;
                                        $this$visitChildren$iv3 = $this$visitChildren$iv;
                                        count$iv = 3;
                                    }
                                }
                            }
                            node$iv3 = pop((MutableVector) stack$iv2);
                            function12 = function1;
                            mask$iv3 = mask$iv;
                            $this$visitChildren$iv3 = $this$visitChildren$iv;
                            count$iv = 3;
                        }
                        z2 = zOrder;
                        z = false;
                        mask$iv3 = mask$iv3;
                        count$iv = 3;
                        function12 = function1;
                    } else {
                        node$iv2 = node$iv2.getChild();
                        mask$iv3 = mask$iv3;
                        count$iv = 3;
                        function12 = function1;
                    }
                }
            }
        }
    }

    /* renamed from: visitSubtreeIf-Y-YKmho$default, reason: not valid java name */
    public static /* synthetic */ void m5886visitSubtreeIfYYKmho$default(DelegatableNode $this$visitSubtreeIf_u2dY_u2dYKmho_u24default, int type, boolean zOrder, Function1 block, int i, Object obj) {
        boolean zOrder2;
        int i2;
        int mask$iv;
        DelegatableNode $this$visitSubtreeIf$iv;
        int $i$f$visitSubtreeIf;
        Modifier.Node child$iv;
        MutableVector mutableVector;
        int i3;
        int i4;
        DelegatableNode $this$visitSubtreeIf$iv2;
        int $i$f$visitSubtreeIf2;
        Modifier.Node child$iv2;
        int i5;
        DelegatableNode $this$visitSubtreeIf$iv3;
        int $i$f$visitSubtreeIf3;
        Modifier.Node child$iv3;
        int count$iv;
        if ((i & 2) == 0) {
            zOrder2 = zOrder;
        } else {
            zOrder2 = false;
        }
        int count$iv2 = 0;
        int mask$iv2 = type;
        DelegatableNode $this$visitSubtreeIf$iv4 = $this$visitSubtreeIf_u2dY_u2dYKmho_u24default;
        int $i$f$visitSubtreeIf4 = 0;
        boolean value$iv$iv = $this$visitSubtreeIf$iv4.getNode().getIsAttached();
        if (!value$iv$iv) {
            InlineClassHelperKt.throwIllegalStateException("visitSubtreeIf called on an unattached node");
        }
        MutableVector mutableVector2 = null;
        MutableVector branches$iv = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node child$iv4 = $this$visitSubtreeIf$iv4.getNode().getChild();
        if (child$iv4 == null) {
            addLayoutNodeChildren(branches$iv, $this$visitSubtreeIf$iv4.getNode(), zOrder2);
        } else {
            branches$iv.add(child$iv4);
        }
        while (true) {
            int i6 = 1;
            MutableVector this_$iv$iv = branches$iv.getSize() != 0 ? 1 : mutableVector2;
            if (this_$iv$iv == null) {
                return;
            }
            Modifier.Node branch$iv = (Modifier.Node) branches$iv.removeAt(branches$iv.getSize() - 1);
            if ((branch$iv.getAggregateChildKindSet() & mask$iv2) != 0) {
                Modifier.Node node$iv = branch$iv;
                while (node$iv != null) {
                    if ((node$iv.getKindSet() & mask$iv2) == 0) {
                        i2 = count$iv2;
                        mask$iv = mask$iv2;
                        $this$visitSubtreeIf$iv = $this$visitSubtreeIf$iv4;
                        $i$f$visitSubtreeIf = $i$f$visitSubtreeIf4;
                        child$iv = child$iv4;
                        mutableVector = mutableVector2;
                        i3 = i6;
                    } else {
                        Modifier.Node node = node$iv;
                        Object stack$iv = null;
                        Modifier.Node nodePop = node;
                        while (true) {
                            if (nodePop != null) {
                                i2 = count$iv2;
                                Intrinsics.reifiedOperationMarker(3, "T");
                                if (nodePop instanceof Object) {
                                    mask$iv = mask$iv2;
                                    if (!((Boolean) block.invoke(nodePop)).booleanValue()) {
                                        $this$visitSubtreeIf$iv = $this$visitSubtreeIf$iv4;
                                        $i$f$visitSubtreeIf = $i$f$visitSubtreeIf4;
                                        child$iv = child$iv4;
                                        i4 = 0;
                                        i3 = 1;
                                        mutableVector = null;
                                        break;
                                    }
                                    $this$visitSubtreeIf$iv2 = $this$visitSubtreeIf$iv4;
                                    $i$f$visitSubtreeIf2 = $i$f$visitSubtreeIf4;
                                    child$iv2 = child$iv4;
                                    i5 = 1;
                                } else {
                                    mask$iv = mask$iv2;
                                    Modifier.Node this_$iv$iv2 = nodePop;
                                    if (!((this_$iv$iv2.getKindSet() & type) != 0) || !(nodePop instanceof DelegatingNode)) {
                                        $this$visitSubtreeIf$iv2 = $this$visitSubtreeIf$iv4;
                                        $i$f$visitSubtreeIf2 = $i$f$visitSubtreeIf4;
                                        child$iv2 = child$iv4;
                                        i5 = 1;
                                    } else {
                                        int count$iv3 = 0;
                                        DelegatingNode this_$iv$iv3 = (DelegatingNode) nodePop;
                                        Modifier.Node node$iv$iv = this_$iv$iv3.getDelegate();
                                        while (node$iv$iv != null) {
                                            Modifier.Node next$iv = node$iv$iv;
                                            if (!((next$iv.getKindSet() & type) != 0)) {
                                                $this$visitSubtreeIf$iv3 = $this$visitSubtreeIf$iv4;
                                                $i$f$visitSubtreeIf3 = $i$f$visitSubtreeIf4;
                                                child$iv3 = child$iv4;
                                            } else {
                                                count$iv3++;
                                                $this$visitSubtreeIf$iv3 = $this$visitSubtreeIf$iv4;
                                                if (count$iv3 == 1) {
                                                    nodePop = next$iv;
                                                    $i$f$visitSubtreeIf3 = $i$f$visitSubtreeIf4;
                                                    child$iv3 = child$iv4;
                                                } else {
                                                    Object mutableVector3 = (MutableVector) stack$iv;
                                                    if (mutableVector3 != null) {
                                                        count$iv = count$iv3;
                                                        $i$f$visitSubtreeIf3 = $i$f$visitSubtreeIf4;
                                                        child$iv3 = child$iv4;
                                                    } else {
                                                        count$iv = count$iv3;
                                                        $i$f$visitSubtreeIf3 = $i$f$visitSubtreeIf4;
                                                        child$iv3 = child$iv4;
                                                        mutableVector3 = new MutableVector(new Modifier.Node[16], 0);
                                                    }
                                                    stack$iv = mutableVector3;
                                                    Modifier.Node theNode$iv = nodePop;
                                                    if (theNode$iv != null) {
                                                        MutableVector mutableVector4 = (MutableVector) stack$iv;
                                                        if (mutableVector4 != null) {
                                                            mutableVector4.add(theNode$iv);
                                                        }
                                                        nodePop = null;
                                                    }
                                                    MutableVector mutableVector5 = (MutableVector) stack$iv;
                                                    if (mutableVector5 != null) {
                                                        mutableVector5.add(next$iv);
                                                    }
                                                    count$iv3 = count$iv;
                                                }
                                            }
                                            node$iv$iv = node$iv$iv.getChild();
                                            $this$visitSubtreeIf$iv4 = $this$visitSubtreeIf$iv3;
                                            $i$f$visitSubtreeIf4 = $i$f$visitSubtreeIf3;
                                            child$iv4 = child$iv3;
                                        }
                                        $this$visitSubtreeIf$iv2 = $this$visitSubtreeIf$iv4;
                                        $i$f$visitSubtreeIf2 = $i$f$visitSubtreeIf4;
                                        child$iv2 = child$iv4;
                                        i5 = 1;
                                        if (count$iv3 == 1) {
                                            count$iv2 = i2;
                                            i6 = 1;
                                            mask$iv2 = mask$iv;
                                            $this$visitSubtreeIf$iv4 = $this$visitSubtreeIf$iv2;
                                            $i$f$visitSubtreeIf4 = $i$f$visitSubtreeIf2;
                                            child$iv4 = child$iv2;
                                        }
                                    }
                                }
                                nodePop = pop((MutableVector) stack$iv);
                                count$iv2 = i2;
                                i6 = i5;
                                mask$iv2 = mask$iv;
                                $this$visitSubtreeIf$iv4 = $this$visitSubtreeIf$iv2;
                                $i$f$visitSubtreeIf4 = $i$f$visitSubtreeIf2;
                                child$iv4 = child$iv2;
                            } else {
                                i2 = count$iv2;
                                mask$iv = mask$iv2;
                                $this$visitSubtreeIf$iv = $this$visitSubtreeIf$iv4;
                                $i$f$visitSubtreeIf = $i$f$visitSubtreeIf4;
                                child$iv = child$iv4;
                                i3 = i6;
                                mutableVector = null;
                                i4 = i3;
                                break;
                            }
                        }
                        if (i4 == 0) {
                            count$iv2 = i2;
                            mutableVector2 = mutableVector;
                            mask$iv2 = mask$iv;
                            $this$visitSubtreeIf$iv4 = $this$visitSubtreeIf$iv;
                            $i$f$visitSubtreeIf4 = $i$f$visitSubtreeIf;
                            child$iv4 = child$iv;
                            break;
                        }
                    }
                    node$iv = node$iv.getChild();
                    count$iv2 = i2;
                    i6 = i3;
                    mutableVector2 = mutableVector;
                    mask$iv2 = mask$iv;
                    $this$visitSubtreeIf$iv4 = $this$visitSubtreeIf$iv;
                    $i$f$visitSubtreeIf4 = $i$f$visitSubtreeIf;
                    child$iv4 = child$iv;
                }
            }
            addLayoutNodeChildren(branches$iv, branch$iv, zOrder2);
            count$iv2 = count$iv2;
            mutableVector2 = mutableVector2;
            mask$iv2 = mask$iv2;
            $this$visitSubtreeIf$iv4 = $this$visitSubtreeIf$iv4;
            $i$f$visitSubtreeIf4 = $i$f$visitSubtreeIf4;
            child$iv4 = child$iv4;
        }
    }

    /* renamed from: visitSubtreeIf-Y-YKmho, reason: not valid java name */
    public static final /* synthetic */ <T> void m5885visitSubtreeIfYYKmho(DelegatableNode $this$visitSubtreeIf_u2dY_u2dYKmho, int type, boolean zOrder, Function1<? super T, Boolean> function1) {
        int i;
        int mask$iv;
        DelegatableNode $this$visitSubtreeIf$iv;
        int $i$f$visitSubtreeIf;
        Modifier.Node child$iv;
        MutableVector mutableVector;
        boolean z;
        boolean diveDeeper$iv;
        DelegatableNode $this$visitSubtreeIf$iv2;
        int $i$f$visitSubtreeIf2;
        Modifier.Node child$iv2;
        boolean z2;
        DelegatableNode $this$visitSubtreeIf$iv3;
        int $i$f$visitSubtreeIf3;
        Modifier.Node child$iv3;
        int count$iv;
        int count$iv2 = 0;
        int mask$iv2 = type;
        DelegatableNode $this$visitSubtreeIf$iv4 = $this$visitSubtreeIf_u2dY_u2dYKmho;
        int $i$f$visitSubtreeIf4 = 0;
        boolean value$iv$iv = $this$visitSubtreeIf$iv4.getNode().getIsAttached();
        if (!value$iv$iv) {
            InlineClassHelperKt.throwIllegalStateException("visitSubtreeIf called on an unattached node");
        }
        MutableVector mutableVector2 = null;
        MutableVector branches$iv = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node child$iv4 = $this$visitSubtreeIf$iv4.getNode().getChild();
        if (child$iv4 == null) {
            addLayoutNodeChildren(branches$iv, $this$visitSubtreeIf$iv4.getNode(), zOrder);
        } else {
            branches$iv.add(child$iv4);
        }
        while (true) {
            boolean z3 = true;
            MutableVector this_$iv$iv = branches$iv.getSize() != 0 ? 1 : mutableVector2;
            if (this_$iv$iv == null) {
                return;
            }
            Modifier.Node branch$iv = (Modifier.Node) branches$iv.removeAt(branches$iv.getSize() - 1);
            if ((branch$iv.getAggregateChildKindSet() & mask$iv2) != 0) {
                Modifier.Node node$iv = branch$iv;
                while (node$iv != null) {
                    if ((node$iv.getKindSet() & mask$iv2) == 0) {
                        i = count$iv2;
                        mask$iv = mask$iv2;
                        $this$visitSubtreeIf$iv = $this$visitSubtreeIf$iv4;
                        $i$f$visitSubtreeIf = $i$f$visitSubtreeIf4;
                        child$iv = child$iv4;
                        mutableVector = mutableVector2;
                        z = z3;
                    } else {
                        Object node = node$iv;
                        Object stack$iv = null;
                        Object node$iv2 = node;
                        while (true) {
                            if (node$iv2 != null) {
                                i = count$iv2;
                                Intrinsics.reifiedOperationMarker(3, "T");
                                if (node$iv2 instanceof Object) {
                                    Object it = node$iv2;
                                    mask$iv = mask$iv2;
                                    if (!function1.invoke(it).booleanValue()) {
                                        $this$visitSubtreeIf$iv = $this$visitSubtreeIf$iv4;
                                        $i$f$visitSubtreeIf = $i$f$visitSubtreeIf4;
                                        child$iv = child$iv4;
                                        z = true;
                                        mutableVector = null;
                                        diveDeeper$iv = false;
                                        break;
                                    }
                                    $this$visitSubtreeIf$iv2 = $this$visitSubtreeIf$iv4;
                                    $i$f$visitSubtreeIf2 = $i$f$visitSubtreeIf4;
                                    child$iv2 = child$iv4;
                                    z2 = true;
                                } else {
                                    mask$iv = mask$iv2;
                                    Modifier.Node this_$iv$iv2 = (Modifier.Node) node$iv2;
                                    if (!((this_$iv$iv2.getKindSet() & type) != 0) || !(node$iv2 instanceof DelegatingNode)) {
                                        $this$visitSubtreeIf$iv2 = $this$visitSubtreeIf$iv4;
                                        $i$f$visitSubtreeIf2 = $i$f$visitSubtreeIf4;
                                        child$iv2 = child$iv4;
                                        z2 = true;
                                    } else {
                                        int count$iv3 = 0;
                                        DelegatingNode this_$iv$iv3 = (DelegatingNode) node$iv2;
                                        Modifier.Node node$iv$iv = this_$iv$iv3.getDelegate();
                                        while (node$iv$iv != null) {
                                            Modifier.Node next$iv = node$iv$iv;
                                            if (!((next$iv.getKindSet() & type) != 0)) {
                                                $this$visitSubtreeIf$iv3 = $this$visitSubtreeIf$iv4;
                                                $i$f$visitSubtreeIf3 = $i$f$visitSubtreeIf4;
                                                child$iv3 = child$iv4;
                                            } else {
                                                count$iv3++;
                                                $this$visitSubtreeIf$iv3 = $this$visitSubtreeIf$iv4;
                                                if (count$iv3 == 1) {
                                                    node$iv2 = next$iv;
                                                    $i$f$visitSubtreeIf3 = $i$f$visitSubtreeIf4;
                                                    child$iv3 = child$iv4;
                                                } else {
                                                    Object mutableVector3 = (MutableVector) stack$iv;
                                                    if (mutableVector3 != null) {
                                                        count$iv = count$iv3;
                                                        $i$f$visitSubtreeIf3 = $i$f$visitSubtreeIf4;
                                                        child$iv3 = child$iv4;
                                                    } else {
                                                        count$iv = count$iv3;
                                                        $i$f$visitSubtreeIf3 = $i$f$visitSubtreeIf4;
                                                        child$iv3 = child$iv4;
                                                        mutableVector3 = new MutableVector(new Modifier.Node[16], 0);
                                                    }
                                                    stack$iv = mutableVector3;
                                                    Modifier.Node theNode$iv = (Modifier.Node) node$iv2;
                                                    if (theNode$iv != null) {
                                                        MutableVector mutableVector4 = (MutableVector) stack$iv;
                                                        if (mutableVector4 != null) {
                                                            mutableVector4.add(theNode$iv);
                                                        }
                                                        node$iv2 = null;
                                                    }
                                                    MutableVector mutableVector5 = (MutableVector) stack$iv;
                                                    if (mutableVector5 != null) {
                                                        mutableVector5.add(next$iv);
                                                    }
                                                    count$iv3 = count$iv;
                                                }
                                            }
                                            node$iv$iv = node$iv$iv.getChild();
                                            $this$visitSubtreeIf$iv4 = $this$visitSubtreeIf$iv3;
                                            $i$f$visitSubtreeIf4 = $i$f$visitSubtreeIf3;
                                            child$iv4 = child$iv3;
                                        }
                                        $this$visitSubtreeIf$iv2 = $this$visitSubtreeIf$iv4;
                                        $i$f$visitSubtreeIf2 = $i$f$visitSubtreeIf4;
                                        child$iv2 = child$iv4;
                                        z2 = true;
                                        if (count$iv3 == 1) {
                                            z3 = true;
                                            count$iv2 = i;
                                            mask$iv2 = mask$iv;
                                            $this$visitSubtreeIf$iv4 = $this$visitSubtreeIf$iv2;
                                            $i$f$visitSubtreeIf4 = $i$f$visitSubtreeIf2;
                                            child$iv4 = child$iv2;
                                        }
                                    }
                                }
                                node$iv2 = pop((MutableVector) stack$iv);
                                z3 = z2;
                                count$iv2 = i;
                                mask$iv2 = mask$iv;
                                $this$visitSubtreeIf$iv4 = $this$visitSubtreeIf$iv2;
                                $i$f$visitSubtreeIf4 = $i$f$visitSubtreeIf2;
                                child$iv4 = child$iv2;
                            } else {
                                i = count$iv2;
                                mask$iv = mask$iv2;
                                $this$visitSubtreeIf$iv = $this$visitSubtreeIf$iv4;
                                $i$f$visitSubtreeIf = $i$f$visitSubtreeIf4;
                                child$iv = child$iv4;
                                z = z3;
                                mutableVector = null;
                                diveDeeper$iv = z;
                                break;
                            }
                        }
                        if (!diveDeeper$iv) {
                            mutableVector2 = mutableVector;
                            count$iv2 = i;
                            mask$iv2 = mask$iv;
                            $this$visitSubtreeIf$iv4 = $this$visitSubtreeIf$iv;
                            $i$f$visitSubtreeIf4 = $i$f$visitSubtreeIf;
                            child$iv4 = child$iv;
                            break;
                        }
                    }
                    node$iv = node$iv.getChild();
                    z3 = z;
                    mutableVector2 = mutableVector;
                    count$iv2 = i;
                    mask$iv2 = mask$iv;
                    $this$visitSubtreeIf$iv4 = $this$visitSubtreeIf$iv;
                    $i$f$visitSubtreeIf4 = $i$f$visitSubtreeIf;
                    child$iv4 = child$iv;
                }
            }
            addLayoutNodeChildren(branches$iv, branch$iv, zOrder);
            mutableVector2 = mutableVector2;
            count$iv2 = count$iv2;
            mask$iv2 = mask$iv2;
            $this$visitSubtreeIf$iv4 = $this$visitSubtreeIf$iv4;
            $i$f$visitSubtreeIf4 = $i$f$visitSubtreeIf4;
            child$iv4 = child$iv4;
        }
    }

    /* renamed from: visitSubtree-Y-YKmho$default, reason: not valid java name */
    public static /* synthetic */ void m5884visitSubtreeYYKmho$default(DelegatableNode $this$visitSubtree_u2dY_u2dYKmho_u24default, int type, boolean zOrder, Function1 block, int i, Object obj) {
        boolean zOrder2;
        int i2;
        int mask$iv;
        DelegatableNode $this$visitSubtreeIf$iv;
        int $i$f$visitSubtreeIf;
        MutableVector mutableVector;
        int i3;
        int mask$iv2;
        DelegatableNode $this$visitSubtreeIf$iv2;
        int $i$f$visitSubtreeIf2;
        int mask$iv3;
        DelegatableNode $this$visitSubtreeIf$iv3;
        int $i$f$visitSubtreeIf3;
        Object mutableVector2;
        if ((i & 2) == 0) {
            zOrder2 = zOrder;
        } else {
            zOrder2 = false;
        }
        int i4 = 0;
        int mask$iv4 = type;
        DelegatableNode $this$visitSubtreeIf$iv4 = $this$visitSubtree_u2dY_u2dYKmho_u24default;
        int $i$f$visitSubtreeIf4 = 0;
        boolean value$iv$iv = $this$visitSubtreeIf$iv4.getNode().getIsAttached();
        if (!value$iv$iv) {
            InlineClassHelperKt.throwIllegalStateException("visitSubtreeIf called on an unattached node");
        }
        MutableVector mutableVector3 = null;
        MutableVector branches$iv = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node child$iv = $this$visitSubtreeIf$iv4.getNode().getChild();
        if (child$iv == null) {
            addLayoutNodeChildren(branches$iv, $this$visitSubtreeIf$iv4.getNode(), zOrder2);
        } else {
            branches$iv.add(child$iv);
        }
        while (true) {
            int i5 = 1;
            MutableVector this_$iv$iv = branches$iv.getSize() != 0 ? 1 : mutableVector3;
            if (this_$iv$iv == null) {
                return;
            }
            Modifier.Node branch$iv = (Modifier.Node) branches$iv.removeAt(branches$iv.getSize() - 1);
            if ((branch$iv.getAggregateChildKindSet() & mask$iv4) != 0) {
                Modifier.Node node$iv = branch$iv;
                while (node$iv != null) {
                    if ((node$iv.getKindSet() & mask$iv4) == 0) {
                        i2 = i4;
                        mask$iv = mask$iv4;
                        $this$visitSubtreeIf$iv = $this$visitSubtreeIf$iv4;
                        $i$f$visitSubtreeIf = $i$f$visitSubtreeIf4;
                        mutableVector = mutableVector3;
                        i3 = i5;
                    } else {
                        Modifier.Node it = node$iv;
                        Object stack$iv = null;
                        Modifier.Node nodePop = it;
                        while (nodePop != null) {
                            int i6 = i4;
                            Intrinsics.reifiedOperationMarker(3, "T");
                            if (nodePop instanceof Object) {
                                block.invoke(nodePop);
                                mask$iv2 = mask$iv4;
                                $this$visitSubtreeIf$iv2 = $this$visitSubtreeIf$iv4;
                                $i$f$visitSubtreeIf2 = $i$f$visitSubtreeIf4;
                            } else {
                                Modifier.Node this_$iv$iv2 = nodePop;
                                if (!((this_$iv$iv2.getKindSet() & type) != 0) || !(nodePop instanceof DelegatingNode)) {
                                    mask$iv2 = mask$iv4;
                                    $this$visitSubtreeIf$iv2 = $this$visitSubtreeIf$iv4;
                                    $i$f$visitSubtreeIf2 = $i$f$visitSubtreeIf4;
                                } else {
                                    int count$iv = 0;
                                    DelegatingNode this_$iv$iv3 = (DelegatingNode) nodePop;
                                    Modifier.Node node$iv$iv = this_$iv$iv3.getDelegate();
                                    while (node$iv$iv != null) {
                                        Modifier.Node next$iv = node$iv$iv;
                                        if (!((next$iv.getKindSet() & type) != 0)) {
                                            mask$iv3 = mask$iv4;
                                            $this$visitSubtreeIf$iv3 = $this$visitSubtreeIf$iv4;
                                            $i$f$visitSubtreeIf3 = $i$f$visitSubtreeIf4;
                                        } else {
                                            count$iv++;
                                            mask$iv3 = mask$iv4;
                                            if (count$iv == 1) {
                                                nodePop = next$iv;
                                                $this$visitSubtreeIf$iv3 = $this$visitSubtreeIf$iv4;
                                                $i$f$visitSubtreeIf3 = $i$f$visitSubtreeIf4;
                                            } else {
                                                Object obj2 = (MutableVector) stack$iv;
                                                if (obj2 != null) {
                                                    $this$visitSubtreeIf$iv3 = $this$visitSubtreeIf$iv4;
                                                    $i$f$visitSubtreeIf3 = $i$f$visitSubtreeIf4;
                                                    mutableVector2 = obj2;
                                                } else {
                                                    $this$visitSubtreeIf$iv3 = $this$visitSubtreeIf$iv4;
                                                    $i$f$visitSubtreeIf3 = $i$f$visitSubtreeIf4;
                                                    mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
                                                }
                                                stack$iv = mutableVector2;
                                                Modifier.Node theNode$iv = nodePop;
                                                if (theNode$iv != null) {
                                                    MutableVector mutableVector4 = (MutableVector) stack$iv;
                                                    if (mutableVector4 != null) {
                                                        mutableVector4.add(theNode$iv);
                                                    }
                                                    nodePop = null;
                                                }
                                                MutableVector mutableVector5 = (MutableVector) stack$iv;
                                                if (mutableVector5 != null) {
                                                    mutableVector5.add(next$iv);
                                                }
                                            }
                                        }
                                        node$iv$iv = node$iv$iv.getChild();
                                        mask$iv4 = mask$iv3;
                                        $this$visitSubtreeIf$iv4 = $this$visitSubtreeIf$iv3;
                                        $i$f$visitSubtreeIf4 = $i$f$visitSubtreeIf3;
                                    }
                                    mask$iv2 = mask$iv4;
                                    $this$visitSubtreeIf$iv2 = $this$visitSubtreeIf$iv4;
                                    $i$f$visitSubtreeIf2 = $i$f$visitSubtreeIf4;
                                    if (count$iv == 1) {
                                        i4 = i6;
                                        mask$iv4 = mask$iv2;
                                        $this$visitSubtreeIf$iv4 = $this$visitSubtreeIf$iv2;
                                        $i$f$visitSubtreeIf4 = $i$f$visitSubtreeIf2;
                                    }
                                }
                            }
                            nodePop = pop((MutableVector) stack$iv);
                            i4 = i6;
                            mask$iv4 = mask$iv2;
                            $this$visitSubtreeIf$iv4 = $this$visitSubtreeIf$iv2;
                            $i$f$visitSubtreeIf4 = $i$f$visitSubtreeIf2;
                        }
                        i2 = i4;
                        mask$iv = mask$iv4;
                        $this$visitSubtreeIf$iv = $this$visitSubtreeIf$iv4;
                        $i$f$visitSubtreeIf = $i$f$visitSubtreeIf4;
                        mutableVector = null;
                        i3 = 1;
                        if (1 == 0) {
                            i4 = i2;
                            mutableVector3 = null;
                            mask$iv4 = mask$iv;
                            $this$visitSubtreeIf$iv4 = $this$visitSubtreeIf$iv;
                            $i$f$visitSubtreeIf4 = $i$f$visitSubtreeIf;
                            break;
                        }
                    }
                    node$iv = node$iv.getChild();
                    i5 = i3;
                    mutableVector3 = mutableVector;
                    mask$iv4 = mask$iv;
                    $this$visitSubtreeIf$iv4 = $this$visitSubtreeIf$iv;
                    $i$f$visitSubtreeIf4 = $i$f$visitSubtreeIf;
                    i4 = i2;
                }
            }
            addLayoutNodeChildren(branches$iv, branch$iv, zOrder2);
            i4 = i4;
            mutableVector3 = mutableVector3;
            mask$iv4 = mask$iv4;
            $this$visitSubtreeIf$iv4 = $this$visitSubtreeIf$iv4;
            $i$f$visitSubtreeIf4 = $i$f$visitSubtreeIf4;
        }
    }

    /* renamed from: visitSubtree-Y-YKmho, reason: not valid java name */
    public static final /* synthetic */ <T> void m5883visitSubtreeYYKmho(DelegatableNode $this$visitSubtree_u2dY_u2dYKmho, int type, boolean zOrder, Function1<? super T, Unit> function1) {
        int i;
        int mask$iv;
        DelegatableNode $this$visitSubtreeIf$iv;
        int $i$f$visitSubtreeIf;
        MutableVector mutableVector;
        boolean z;
        int mask$iv2;
        DelegatableNode $this$visitSubtreeIf$iv2;
        int $i$f$visitSubtreeIf2;
        int mask$iv3;
        DelegatableNode $this$visitSubtreeIf$iv3;
        int $i$f$visitSubtreeIf3;
        Object mutableVector2;
        int i2 = 0;
        int mask$iv4 = type;
        DelegatableNode $this$visitSubtreeIf$iv4 = $this$visitSubtree_u2dY_u2dYKmho;
        int $i$f$visitSubtreeIf4 = 0;
        boolean value$iv$iv = $this$visitSubtreeIf$iv4.getNode().getIsAttached();
        if (!value$iv$iv) {
            InlineClassHelperKt.throwIllegalStateException("visitSubtreeIf called on an unattached node");
        }
        MutableVector mutableVector3 = null;
        MutableVector branches$iv = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node child$iv = $this$visitSubtreeIf$iv4.getNode().getChild();
        if (child$iv == null) {
            addLayoutNodeChildren(branches$iv, $this$visitSubtreeIf$iv4.getNode(), zOrder);
        } else {
            branches$iv.add(child$iv);
        }
        while (true) {
            boolean z2 = true;
            MutableVector this_$iv$iv = branches$iv.getSize() != 0 ? 1 : mutableVector3;
            if (this_$iv$iv == null) {
                return;
            }
            Modifier.Node branch$iv = (Modifier.Node) branches$iv.removeAt(branches$iv.getSize() - 1);
            if ((branch$iv.getAggregateChildKindSet() & mask$iv4) != 0) {
                Modifier.Node node$iv = branch$iv;
                while (node$iv != null) {
                    if ((node$iv.getKindSet() & mask$iv4) == 0) {
                        i = i2;
                        mask$iv = mask$iv4;
                        $this$visitSubtreeIf$iv = $this$visitSubtreeIf$iv4;
                        $i$f$visitSubtreeIf = $i$f$visitSubtreeIf4;
                        mutableVector = mutableVector3;
                        z = z2;
                    } else {
                        Object it = node$iv;
                        Object stack$iv = null;
                        Object node$iv2 = it;
                        while (node$iv2 != null) {
                            int i3 = i2;
                            Intrinsics.reifiedOperationMarker(3, "T");
                            if (node$iv2 instanceof Object) {
                                function1.invoke(node$iv2);
                                mask$iv2 = mask$iv4;
                                $this$visitSubtreeIf$iv2 = $this$visitSubtreeIf$iv4;
                                $i$f$visitSubtreeIf2 = $i$f$visitSubtreeIf4;
                            } else {
                                Modifier.Node this_$iv$iv2 = (Modifier.Node) node$iv2;
                                if (!((this_$iv$iv2.getKindSet() & type) != 0) || !(node$iv2 instanceof DelegatingNode)) {
                                    mask$iv2 = mask$iv4;
                                    $this$visitSubtreeIf$iv2 = $this$visitSubtreeIf$iv4;
                                    $i$f$visitSubtreeIf2 = $i$f$visitSubtreeIf4;
                                } else {
                                    int count$iv = 0;
                                    DelegatingNode this_$iv$iv3 = (DelegatingNode) node$iv2;
                                    Modifier.Node node$iv$iv = this_$iv$iv3.getDelegate();
                                    while (node$iv$iv != null) {
                                        Modifier.Node next$iv = node$iv$iv;
                                        if (!((next$iv.getKindSet() & type) != 0)) {
                                            mask$iv3 = mask$iv4;
                                            $this$visitSubtreeIf$iv3 = $this$visitSubtreeIf$iv4;
                                            $i$f$visitSubtreeIf3 = $i$f$visitSubtreeIf4;
                                        } else {
                                            count$iv++;
                                            mask$iv3 = mask$iv4;
                                            if (count$iv == 1) {
                                                node$iv2 = next$iv;
                                                $this$visitSubtreeIf$iv3 = $this$visitSubtreeIf$iv4;
                                                $i$f$visitSubtreeIf3 = $i$f$visitSubtreeIf4;
                                            } else {
                                                Object obj = (MutableVector) stack$iv;
                                                if (obj != null) {
                                                    $this$visitSubtreeIf$iv3 = $this$visitSubtreeIf$iv4;
                                                    $i$f$visitSubtreeIf3 = $i$f$visitSubtreeIf4;
                                                    mutableVector2 = obj;
                                                } else {
                                                    $this$visitSubtreeIf$iv3 = $this$visitSubtreeIf$iv4;
                                                    $i$f$visitSubtreeIf3 = $i$f$visitSubtreeIf4;
                                                    mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
                                                }
                                                stack$iv = mutableVector2;
                                                Modifier.Node theNode$iv = (Modifier.Node) node$iv2;
                                                if (theNode$iv != null) {
                                                    MutableVector mutableVector4 = (MutableVector) stack$iv;
                                                    if (mutableVector4 != null) {
                                                        mutableVector4.add(theNode$iv);
                                                    }
                                                    node$iv2 = null;
                                                }
                                                MutableVector mutableVector5 = (MutableVector) stack$iv;
                                                if (mutableVector5 != null) {
                                                    mutableVector5.add(next$iv);
                                                }
                                            }
                                        }
                                        node$iv$iv = node$iv$iv.getChild();
                                        mask$iv4 = mask$iv3;
                                        $this$visitSubtreeIf$iv4 = $this$visitSubtreeIf$iv3;
                                        $i$f$visitSubtreeIf4 = $i$f$visitSubtreeIf3;
                                    }
                                    mask$iv2 = mask$iv4;
                                    $this$visitSubtreeIf$iv2 = $this$visitSubtreeIf$iv4;
                                    $i$f$visitSubtreeIf2 = $i$f$visitSubtreeIf4;
                                    if (count$iv == 1) {
                                        i2 = i3;
                                        mask$iv4 = mask$iv2;
                                        $this$visitSubtreeIf$iv4 = $this$visitSubtreeIf$iv2;
                                        $i$f$visitSubtreeIf4 = $i$f$visitSubtreeIf2;
                                    }
                                }
                            }
                            node$iv2 = pop((MutableVector) stack$iv);
                            i2 = i3;
                            mask$iv4 = mask$iv2;
                            $this$visitSubtreeIf$iv4 = $this$visitSubtreeIf$iv2;
                            $i$f$visitSubtreeIf4 = $i$f$visitSubtreeIf2;
                        }
                        i = i2;
                        mask$iv = mask$iv4;
                        $this$visitSubtreeIf$iv = $this$visitSubtreeIf$iv4;
                        $i$f$visitSubtreeIf = $i$f$visitSubtreeIf4;
                        mutableVector = null;
                        z = true;
                        if (1 == 0) {
                            mutableVector3 = null;
                            i2 = i;
                            mask$iv4 = mask$iv;
                            $this$visitSubtreeIf$iv4 = $this$visitSubtreeIf$iv;
                            $i$f$visitSubtreeIf4 = $i$f$visitSubtreeIf;
                            break;
                        }
                    }
                    node$iv = node$iv.getChild();
                    mutableVector3 = mutableVector;
                    z2 = z;
                    i2 = i;
                    mask$iv4 = mask$iv;
                    $this$visitSubtreeIf$iv4 = $this$visitSubtreeIf$iv;
                    $i$f$visitSubtreeIf4 = $i$f$visitSubtreeIf;
                }
            }
            addLayoutNodeChildren(branches$iv, branch$iv, zOrder);
            mutableVector3 = mutableVector3;
            i2 = i2;
            mask$iv4 = mask$iv4;
            $this$visitSubtreeIf$iv4 = $this$visitSubtreeIf$iv4;
            $i$f$visitSubtreeIf4 = $i$f$visitSubtreeIf4;
        }
    }

    /* renamed from: has-64DMado, reason: not valid java name */
    public static final boolean m5870has64DMado(DelegatableNode $this$has_u2d64DMado, int type) {
        return ($this$has_u2d64DMado.getNode().getAggregateChildKindSet() & type) != 0;
    }

    /* renamed from: requireCoordinator-64DMado, reason: not valid java name */
    public static final NodeCoordinator m5872requireCoordinator64DMado(DelegatableNode $this$requireCoordinator_u2d64DMado, int kind) {
        NodeCoordinator coordinator = $this$requireCoordinator_u2d64DMado.getNode().getCoordinator();
        Intrinsics.checkNotNull(coordinator);
        if (coordinator.getTail() != $this$requireCoordinator_u2d64DMado || !NodeKindKt.m6021getIncludeSelfInTraversalH91voCI(kind)) {
            return coordinator;
        }
        NodeCoordinator wrapped$ui_release = coordinator.getWrapped();
        Intrinsics.checkNotNull(wrapped$ui_release);
        return wrapped$ui_release;
    }

    public static final LayoutNode requireLayoutNode(DelegatableNode $this$requireLayoutNode) {
        NodeCoordinator coordinator = $this$requireLayoutNode.getNode().getCoordinator();
        if (coordinator != null) {
            return coordinator.getLayoutNode();
        }
        InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("Cannot obtain node coordinator. Is the Modifier.Node attached?");
        throw new KotlinNothingValueException();
    }

    public static final SemanticsInfo requireSemanticsInfo(DelegatableNode $this$requireSemanticsInfo) {
        return requireLayoutNode($this$requireSemanticsInfo);
    }

    public static final Owner requireOwner(DelegatableNode $this$requireOwner) {
        Owner owner = requireLayoutNode($this$requireOwner).getOwner();
        if (owner != null) {
            return owner;
        }
        InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("This node does not have an owner.");
        throw new KotlinNothingValueException();
    }

    public static final void requestAutofill(DelegatableNode $this$requestAutofill) {
        requireLayoutNode($this$requestAutofill).requestAutofill$ui_release();
    }

    public static final Density requireDensity(DelegatableNode $this$requireDensity) {
        return requireLayoutNode($this$requireDensity).getDensity();
    }

    public static final GraphicsContext requireGraphicsContext(DelegatableNode $this$requireGraphicsContext) {
        return requireOwner($this$requireGraphicsContext).getGraphicsContext();
    }

    public static final LayoutDirection requireLayoutDirection(DelegatableNode $this$requireLayoutDirection) {
        return requireLayoutNode($this$requireLayoutDirection).getLayoutDirection();
    }

    public static final LayoutCoordinates requireLayoutCoordinates(DelegatableNode $this$requireLayoutCoordinates) {
        boolean value$iv = $this$requireLayoutCoordinates.getNode().getIsAttached();
        if (!value$iv) {
            InlineClassHelperKt.throwIllegalStateException("Cannot get LayoutCoordinates, Modifier.Node is not attached.");
        }
        LayoutCoordinates coordinates = m5872requireCoordinator64DMado($this$requireLayoutCoordinates, NodeKind.m6012constructorimpl(2)).getCoordinates();
        boolean value$iv2 = coordinates.isAttached();
        if (!value$iv2) {
            InlineClassHelperKt.throwIllegalStateException("LayoutCoordinates is not attached.");
        }
        return coordinates;
    }

    public static final void invalidateSubtree(DelegatableNode $this$invalidateSubtree) {
        if ($this$invalidateSubtree.getNode().getIsAttached()) {
            LayoutNode.invalidateSubtree$default(requireLayoutNode($this$invalidateSubtree), false, 1, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final androidx.compose.ui.node.LayoutModifierNode asLayoutModifierNode(androidx.compose.ui.Modifier.Node r9) {
        /*
            r0 = 0
            r1 = 2
            int r0 = androidx.compose.ui.node.NodeKind.m6012constructorimpl(r1)
            r2 = r9
            r3 = 0
            int r4 = r2.getKindSet()
            r4 = r4 & r0
            r5 = 1
            r6 = 0
            if (r4 == 0) goto L14
            r0 = r5
            goto L15
        L14:
            r0 = r6
        L15:
            r2 = 0
            if (r0 != 0) goto L19
            return r2
        L19:
            boolean r0 = r9 instanceof androidx.compose.ui.node.LayoutModifierNode
            if (r0 == 0) goto L21
            r0 = r9
            androidx.compose.ui.node.LayoutModifierNode r0 = (androidx.compose.ui.node.LayoutModifierNode) r0
            return r0
        L21:
            boolean r0 = r9 instanceof androidx.compose.ui.node.DelegatingNode
            if (r0 == 0) goto L5c
            r0 = r9
            androidx.compose.ui.node.DelegatingNode r0 = (androidx.compose.ui.node.DelegatingNode) r0
            androidx.compose.ui.Modifier$Node r0 = r0.getDelegate()
        L2c:
            if (r0 == 0) goto L5c
            boolean r3 = r0 instanceof androidx.compose.ui.node.LayoutModifierNode
            if (r3 == 0) goto L36
            r1 = r0
            androidx.compose.ui.node.LayoutModifierNode r1 = (androidx.compose.ui.node.LayoutModifierNode) r1
            return r1
        L36:
            boolean r3 = r0 instanceof androidx.compose.ui.node.DelegatingNode
            if (r3 == 0) goto L56
            r3 = 0
            int r3 = androidx.compose.ui.node.NodeKind.m6012constructorimpl(r1)
            r4 = r0
            r7 = 0
            int r8 = r4.getKindSet()
            r8 = r8 & r3
            if (r8 == 0) goto L4b
            r3 = r5
            goto L4c
        L4b:
            r3 = r6
        L4c:
            if (r3 == 0) goto L56
            r3 = r0
            androidx.compose.ui.node.DelegatingNode r3 = (androidx.compose.ui.node.DelegatingNode) r3
            androidx.compose.ui.Modifier$Node r3 = r3.getDelegate()
            goto L5a
        L56:
            androidx.compose.ui.Modifier$Node r3 = r0.getChild()
        L5a:
            r0 = r3
            goto L2c
        L5c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.DelegatableNodeKt.asLayoutModifierNode(androidx.compose.ui.Modifier$Node):androidx.compose.ui.node.LayoutModifierNode");
    }

    /* renamed from: dispatchForKind-6rFNWt0, reason: not valid java name */
    public static final /* synthetic */ <T> void m5869dispatchForKind6rFNWt0(Modifier.Node $this$dispatchForKind_u2d6rFNWt0, int kind, Function1<? super T, Unit> function1) {
        Object stack = null;
        Object node = $this$dispatchForKind_u2d6rFNWt0;
        while (node != null) {
            Intrinsics.reifiedOperationMarker(3, "T");
            if (node instanceof Object) {
                function1.invoke(node);
            } else {
                Modifier.Node this_$iv = (Modifier.Node) node;
                int i = 1;
                Modifier.Node this_$iv2 = (this_$iv.getKindSet() & kind) != 0 ? 1 : null;
                if (this_$iv2 != null && (node instanceof DelegatingNode)) {
                    int count = 0;
                    DelegatingNode this_$iv3 = (DelegatingNode) node;
                    Modifier.Node node$iv = this_$iv3.getDelegate();
                    while (node$iv != null) {
                        Modifier.Node next = node$iv;
                        if (((next.getKindSet() & kind) != 0 ? i : 0) != 0) {
                            count++;
                            if (count == i) {
                                node = next;
                            } else {
                                Object obj = (MutableVector) stack;
                                if (obj == null) {
                                    Object mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                    obj = mutableVector;
                                }
                                stack = obj;
                                Modifier.Node theNode = (Modifier.Node) node;
                                if (theNode != null) {
                                    MutableVector mutableVector2 = (MutableVector) stack;
                                    if (mutableVector2 != null) {
                                        mutableVector2.add(theNode);
                                    }
                                    node = null;
                                }
                                MutableVector mutableVector3 = (MutableVector) stack;
                                if (mutableVector3 != null) {
                                    mutableVector3.add(next);
                                }
                            }
                        }
                        node$iv = node$iv.getChild();
                        i = 1;
                    }
                    if (count == 1) {
                    }
                }
            }
            node = pop((MutableVector) stack);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Modifier.Node pop(MutableVector<Modifier.Node> mutableVector) {
        if (mutableVector != null) {
            if (!(mutableVector.getSize() == 0)) {
                return mutableVector.removeAt(mutableVector.getSize() - 1);
            }
        }
        return null;
    }
}
