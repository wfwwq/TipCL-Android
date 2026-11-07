package androidx.compose.ui.focus;

import android.view.KeyEvent;
import androidx.autofill.HintConstants;
import androidx.collection.MutableLongSet;
import androidx.collection.MutableObjectList;
import androidx.collection.ObjectList;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.ComposeUiFlags;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.input.key.KeyEventType;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import androidx.compose.ui.input.key.SoftKeyboardInterceptionModifierNode;
import androidx.compose.ui.input.rotary.RotaryInputModifierNode;
import androidx.compose.ui.input.rotary.RotaryScrollEvent;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.node.NodeChain;
import androidx.compose.ui.node.NodeKind;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.core.app.NotificationCompat;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference0Impl;
import kotlin.jvm.internal.PropertyReference0Impl;
import kotlin.jvm.internal.Ref;

/* compiled from: FocusOwnerImpl.kt */
@Metadata(d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001Bª\u0001\u0012\u0018\u0010\u0002\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012:\u0010\u0006\u001a6\u0012\u0015\u0012\u0013\u0018\u00010\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0015\u0012\u0013\u0018\u00010\f¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u000e0\u0007\u0012!\u0010\u000f\u001a\u001d\u0012\u0013\u0012\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\u000e0\u0003\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u000e\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u0004\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004¢\u0006\u0002\u0010\u0014J\u0010\u00108\u001a\u00020\u00052\u0006\u00109\u001a\u00020\u000eH\u0016J\u001a\u00108\u001a\u00020\u000e2\b\b\u0002\u0010:\u001a\u00020\u000e2\u0006\u0010;\u001a\u00020\u000eH\u0002J2\u00108\u001a\u00020\u000e2\u0006\u00109\u001a\u00020\u000e2\u0006\u0010;\u001a\u00020\u000e2\u0006\u0010<\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\bH\u0016ø\u0001\u0000¢\u0006\u0004\b=\u0010>J\u001a\u0010?\u001a\u00020\u000e2\u0006\u0010@\u001a\u00020AH\u0016ø\u0001\u0000¢\u0006\u0004\bB\u0010CJ(\u0010D\u001a\u00020\u000e2\u0006\u0010@\u001a\u00020A2\f\u0010E\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\bF\u0010GJ\u001e\u0010H\u001a\u00020\u000e2\u0006\u0010I\u001a\u00020J2\f\u0010E\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0004H\u0016J\n\u0010K\u001a\u0004\u0018\u00010\u0016H\u0002J:\u0010L\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000b\u001a\u00020\b2\b\u0010M\u001a\u0004\u0018\u00010\f2\u0012\u0010N\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u000e0\u0003H\u0016ø\u0001\u0000¢\u0006\u0004\bO\u0010PJ\n\u0010Q\u001a\u0004\u0018\u00010\fH\u0016J\b\u0010R\u001a\u00020\u0005H\u0002J\u001a\u0010S\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\bH\u0016ø\u0001\u0000¢\u0006\u0004\bT\u0010UJ\b\u0010V\u001a\u00020\u0005H\u0016J$\u0010W\u001a\u00020\u000e2\b\u0010\u000b\u001a\u0004\u0018\u00010\b2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016ø\u0001\u0000¢\u0006\u0002\bXJ\u0010\u0010Y\u001a\u00020\u00052\u0006\u0010Z\u001a\u00020[H\u0016J\u0010\u0010Y\u001a\u00020\u00052\u0006\u0010Z\u001a\u00020\\H\u0016J\u0010\u0010Y\u001a\u00020\u00052\u0006\u0010Z\u001a\u00020\u0016H\u0016J\b\u0010]\u001a\u00020\u0005H\u0016J$\u0010^\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\b2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016ø\u0001\u0000¢\u0006\u0004\b_\u0010`J\u001a\u0010a\u001a\u00020\u000e2\u0006\u0010@\u001a\u00020AH\u0002ø\u0001\u0000¢\u0006\u0004\bb\u0010CJ\u000e\u0010c\u001a\u0004\u0018\u00010d*\u00020eH\u0002J3\u0010f\u001a\u0004\u0018\u0001Hg\"\n\b\u0000\u0010g\u0018\u0001*\u00020h*\u00020e2\f\u0010i\u001a\b\u0012\u0004\u0012\u0002Hg0jH\u0082\bø\u0001\u0000¢\u0006\u0004\bk\u0010lJg\u0010m\u001a\u00020\u0005\"\n\b\u0000\u0010g\u0018\u0001*\u00020e*\u00020e2\f\u0010i\u001a\b\u0012\u0004\u0012\u0002Hg0j2\u0012\u0010n\u001a\u000e\u0012\u0004\u0012\u0002Hg\u0012\u0004\u0012\u00020\u00050\u00032\f\u0010o\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0012\u0010p\u001a\u000e\u0012\u0004\u0012\u0002Hg\u0012\u0004\u0012\u00020\u00050\u0003H\u0082\bø\u0001\u0000¢\u0006\u0004\bq\u0010rR(\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016@VX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001e\u001a\u00020\u001fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R$\u0010\"\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u000e@VX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u0010\u0010&\u001a\u0004\u0018\u00010'X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020*0)X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0014\u0010-\u001a\u00020.X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R)\u0010\u000f\u001a\u001d\u0012\u0013\u0012\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\u000e0\u0003X\u0082\u0004¢\u0006\u0002\n\u0000RB\u0010\u0006\u001a6\u0012\u0015\u0012\u0013\u0018\u00010\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0015\u0012\u0013\u0018\u00010\f¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u000e0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u00101\u001a\u00020\u0016X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\u0019\"\u0004\b3\u0010\u001bR\u0014\u00104\u001a\u0002058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b6\u00107\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006s"}, d2 = {"Landroidx/compose/ui/focus/FocusOwnerImpl;", "Landroidx/compose/ui/focus/FocusOwner;", "onRequestApplyChangesListener", "Lkotlin/Function1;", "Lkotlin/Function0;", "", "onRequestFocusForOwner", "Lkotlin/Function2;", "Landroidx/compose/ui/focus/FocusDirection;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "focusDirection", "Landroidx/compose/ui/geometry/Rect;", "previouslyFocusedRect", "", "onMoveFocusInterop", "onClearFocusForOwner", "onFocusRectInterop", "onLayoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "value", "Landroidx/compose/ui/focus/FocusTargetNode;", "activeFocusTargetNode", "getActiveFocusTargetNode", "()Landroidx/compose/ui/focus/FocusTargetNode;", "setActiveFocusTargetNode", "(Landroidx/compose/ui/focus/FocusTargetNode;)V", "focusInvalidationManager", "Landroidx/compose/ui/focus/FocusInvalidationManager;", "focusTransactionManager", "Landroidx/compose/ui/focus/FocusTransactionManager;", "getFocusTransactionManager", "()Landroidx/compose/ui/focus/FocusTransactionManager;", "isFocusCaptured", "()Z", "setFocusCaptured", "(Z)V", "keysCurrentlyDown", "Landroidx/collection/MutableLongSet;", "listeners", "Landroidx/collection/MutableObjectList;", "Landroidx/compose/ui/focus/FocusListener;", "getListeners", "()Landroidx/collection/MutableObjectList;", "modifier", "Landroidx/compose/ui/Modifier;", "getModifier", "()Landroidx/compose/ui/Modifier;", "rootFocusNode", "getRootFocusNode$ui_release", "setRootFocusNode$ui_release", "rootState", "Landroidx/compose/ui/focus/FocusState;", "getRootState", "()Landroidx/compose/ui/focus/FocusState;", "clearFocus", "force", "forced", "refreshFocusEvents", "clearOwnerFocus", "clearFocus-I7lrPNg", "(ZZZI)Z", "dispatchInterceptedSoftKeyboardEvent", "keyEvent", "Landroidx/compose/ui/input/key/KeyEvent;", "dispatchInterceptedSoftKeyboardEvent-ZmokQxo", "(Landroid/view/KeyEvent;)Z", "dispatchKeyEvent", "onFocusedItem", "dispatchKeyEvent-YhN2O0w", "(Landroid/view/KeyEvent;Lkotlin/jvm/functions/Function0;)Z", "dispatchRotaryEvent", NotificationCompat.CATEGORY_EVENT, "Landroidx/compose/ui/input/rotary/RotaryScrollEvent;", "findFocusTargetNode", "focusSearch", "focusedRect", "onFound", "focusSearch-ULY8qGw", "(ILandroidx/compose/ui/geometry/Rect;Lkotlin/jvm/functions/Function1;)Ljava/lang/Boolean;", "getFocusRect", "invalidateOwnerFocusState", "moveFocus", "moveFocus-3ESFkO8", "(I)Z", "releaseFocus", "requestFocusForOwner", "requestFocusForOwner-7o62pno", "scheduleInvalidation", "node", "Landroidx/compose/ui/focus/FocusEventModifierNode;", "Landroidx/compose/ui/focus/FocusPropertiesModifierNode;", "scheduleInvalidationForOwner", "takeFocus", "takeFocus-aToIllA", "(ILandroidx/compose/ui/geometry/Rect;)Z", "validateKeyEvent", "validateKeyEvent-ZmokQxo", "lastLocalKeyInputNode", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/DelegatableNode;", "nearestAncestorIncludingSelf", "T", "", ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "Landroidx/compose/ui/node/NodeKind;", "nearestAncestorIncludingSelf-64DMado", "(Landroidx/compose/ui/node/DelegatableNode;I)Ljava/lang/Object;", "traverseAncestorsIncludingSelf", "onPreVisit", "onVisit", "onPostVisit", "traverseAncestorsIncludingSelf-QFhIj7k", "(Landroidx/compose/ui/node/DelegatableNode;ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FocusOwnerImpl implements FocusOwner {
    public static final int $stable = 8;
    private FocusTargetNode activeFocusTargetNode;
    private final FocusInvalidationManager focusInvalidationManager;
    private boolean isFocusCaptured;
    private MutableLongSet keysCurrentlyDown;
    private final Function0<Unit> onClearFocusForOwner;
    private final Function0<Rect> onFocusRectInterop;
    private final Function0<LayoutDirection> onLayoutDirection;
    private final Function1<FocusDirection, Boolean> onMoveFocusInterop;
    private final Function2<FocusDirection, Rect, Boolean> onRequestFocusForOwner;
    private FocusTargetNode rootFocusNode = new FocusTargetNode(Focusability.INSTANCE.m4086getNeverLCbbffg(), null, null, 6, null);
    private final FocusTransactionManager focusTransactionManager = new FocusTransactionManager();
    private final Modifier modifier = new ModifierNodeElement<FocusTargetNode>() { // from class: androidx.compose.ui.focus.FocusOwnerImpl$modifier$1
        @Override // androidx.compose.ui.node.ModifierNodeElement
        /* renamed from: create */
        public FocusTargetNode getNode() {
            return this.this$0.getRootFocusNode();
        }

        @Override // androidx.compose.ui.node.ModifierNodeElement
        public void update(FocusTargetNode node) {
        }

        @Override // androidx.compose.ui.node.ModifierNodeElement
        public void inspectableProperties(InspectorInfo $this$inspectableProperties) {
            $this$inspectableProperties.setName("RootFocusTarget");
        }

        @Override // androidx.compose.ui.node.ModifierNodeElement
        public int hashCode() {
            return this.this$0.getRootFocusNode().hashCode();
        }

        @Override // androidx.compose.ui.node.ModifierNodeElement
        public boolean equals(Object other) {
            return other == this;
        }
    };
    private final MutableObjectList<FocusListener> listeners = new MutableObjectList<>(1);

    /* compiled from: FocusOwnerImpl.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CustomDestinationResult.values().length];
            try {
                iArr[CustomDestinationResult.Redirected.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                iArr[CustomDestinationResult.Cancelled.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                iArr[CustomDestinationResult.RedirectCancelled.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                iArr[CustomDestinationResult.None.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FocusOwnerImpl(Function1<? super Function0<Unit>, Unit> function1, Function2<? super FocusDirection, ? super Rect, Boolean> function2, Function1<? super FocusDirection, Boolean> function12, Function0<Unit> function0, Function0<Rect> function02, Function0<? extends LayoutDirection> function03) {
        this.onRequestFocusForOwner = function2;
        this.onMoveFocusInterop = function12;
        this.onClearFocusForOwner = function0;
        this.onFocusRectInterop = function02;
        this.onLayoutDirection = function03;
        this.focusInvalidationManager = new FocusInvalidationManager(function1, new FocusOwnerImpl$focusInvalidationManager$1(this), new PropertyReference0Impl(this) { // from class: androidx.compose.ui.focus.FocusOwnerImpl$focusInvalidationManager$2
            @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.reflect.KProperty0
            public Object get() {
                return ((FocusOwnerImpl) this.receiver).getRootState();
            }
        }, new MutablePropertyReference0Impl(this) { // from class: androidx.compose.ui.focus.FocusOwnerImpl$focusInvalidationManager$3
            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty0
            public Object get() {
                return ((FocusOwnerImpl) this.receiver).getActiveFocusTargetNode();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KMutableProperty0
            public void set(Object value) {
                ((FocusOwnerImpl) this.receiver).setActiveFocusTargetNode((FocusTargetNode) value);
            }
        });
    }

    /* renamed from: getRootFocusNode$ui_release, reason: from getter */
    public final FocusTargetNode getRootFocusNode() {
        return this.rootFocusNode;
    }

    public final void setRootFocusNode$ui_release(FocusTargetNode focusTargetNode) {
        this.rootFocusNode = focusTargetNode;
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public FocusTransactionManager getFocusTransactionManager() {
        return this.focusTransactionManager;
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public Modifier getModifier() {
        return this.modifier;
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    /* renamed from: requestFocusForOwner-7o62pno */
    public boolean mo4052requestFocusForOwner7o62pno(FocusDirection focusDirection, Rect previouslyFocusedRect) {
        return this.onRequestFocusForOwner.invoke(focusDirection, previouslyFocusedRect).booleanValue();
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    /* renamed from: takeFocus-aToIllA */
    public boolean mo4053takeFocusaToIllA(final int focusDirection, Rect previouslyFocusedRect) {
        Boolean boolMo4051focusSearchULY8qGw = mo4051focusSearchULY8qGw(focusDirection, previouslyFocusedRect, new Function1<FocusTargetNode, Boolean>() { // from class: androidx.compose.ui.focus.FocusOwnerImpl$takeFocus$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(FocusTargetNode it) {
                return Boolean.valueOf(it.mo4064requestFocus3ESFkO8(focusDirection));
            }
        });
        if (boolMo4051focusSearchULY8qGw != null) {
            return boolMo4051focusSearchULY8qGw.booleanValue();
        }
        return false;
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public void releaseFocus() {
        if (ComposeUiFlags.isTrackFocusEnabled) {
            FocusTransactionsKt.clearFocus(this.rootFocusNode, true, true);
            return;
        }
        FocusTransactionManager $this$iv = getFocusTransactionManager();
        if (!$this$iv.getOngoingTransaction()) {
            try {
                $this$iv.beginTransaction();
                FocusTransactionsKt.clearFocus(this.rootFocusNode, true, true);
                return;
            } finally {
                $this$iv.commitTransaction();
            }
        }
        FocusTransactionsKt.clearFocus(this.rootFocusNode, true, true);
    }

    @Override // androidx.compose.ui.focus.FocusManager
    public void clearFocus(boolean force) {
        mo4048clearFocusI7lrPNg(force, true, true, FocusDirection.INSTANCE.m4039getExitdhqQ8s());
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    /* renamed from: clearFocus-I7lrPNg */
    public boolean mo4048clearFocusI7lrPNg(boolean force, boolean refreshFocusEvents, boolean clearOwnerFocus, int focusDirection) {
        boolean clearedFocusSuccessfully = false;
        if (ComposeUiFlags.isTrackFocusEnabled) {
            if (!force) {
                switch (WhenMappings.$EnumSwitchMapping$0[FocusTransactionsKt.m4071performCustomClearFocusMxy_nc0(this.rootFocusNode, focusDirection).ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                        break;
                    case 4:
                        clearedFocusSuccessfully = clearFocus(force, refreshFocusEvents);
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            } else {
                clearedFocusSuccessfully = clearFocus(force, refreshFocusEvents);
            }
        } else {
            FocusTransactionManager this_$iv = getFocusTransactionManager();
            FocusOwnerImpl$clearFocus$clearedFocusSuccessfully$1 focusOwnerImpl$clearFocus$clearedFocusSuccessfully$1 = new Function0<Unit>() { // from class: androidx.compose.ui.focus.FocusOwnerImpl$clearFocus$clearedFocusSuccessfully$1
                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }
            };
            try {
                if (this_$iv.getOngoingTransaction()) {
                    this_$iv.cancelTransaction();
                }
                this_$iv.beginTransaction();
                if (focusOwnerImpl$clearFocus$clearedFocusSuccessfully$1 != null) {
                    MutableVector this_$iv$iv = this_$iv.cancellationListener;
                    this_$iv$iv.add(focusOwnerImpl$clearFocus$clearedFocusSuccessfully$1);
                }
                if (!force) {
                    switch (WhenMappings.$EnumSwitchMapping$0[FocusTransactionsKt.m4071performCustomClearFocusMxy_nc0(this.rootFocusNode, focusDirection).ordinal()]) {
                        case 1:
                        case 2:
                        case 3:
                            break;
                        default:
                            clearedFocusSuccessfully = FocusTransactionsKt.clearFocus(this.rootFocusNode, force, refreshFocusEvents);
                            break;
                    }
                } else {
                    clearedFocusSuccessfully = FocusTransactionsKt.clearFocus(this.rootFocusNode, force, refreshFocusEvents);
                }
            } finally {
                this_$iv.commitTransaction();
            }
        }
        if (clearedFocusSuccessfully && clearOwnerFocus) {
            this.onClearFocusForOwner.invoke();
        }
        return clearedFocusSuccessfully;
    }

    static /* synthetic */ boolean clearFocus$default(FocusOwnerImpl focusOwnerImpl, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return focusOwnerImpl.clearFocus(z, z2);
    }

    private final boolean clearFocus(boolean forced, boolean refreshFocusEvents) {
        FocusTargetNode previousActiveFocusTargetNode;
        Object obj;
        NodeChain nodes;
        FocusTargetNode previousActiveFocusTargetNode2;
        FocusTargetNode previousActiveFocusTargetNode3;
        Object node$iv$iv;
        DelegatingNode this_$iv$iv$iv;
        int $i$f$forEachImmediateDelegate$ui_release;
        Modifier.Node node;
        int count$iv$iv;
        MutableVector mutableVector;
        if (getActiveFocusTargetNode() == null) {
            return true;
        }
        Object obj2 = null;
        if (getIsFocusCaptured() && !forced) {
            return false;
        }
        FocusTargetNode previousActiveFocusTargetNode4 = getActiveFocusTargetNode();
        setActiveFocusTargetNode(null);
        if (!refreshFocusEvents || previousActiveFocusTargetNode4 == null) {
            return true;
        }
        previousActiveFocusTargetNode4.dispatchFocusCallbacks$ui_release(getIsFocusCaptured() ? FocusStateImpl.Captured : FocusStateImpl.Active, FocusStateImpl.Inactive);
        FocusTargetNode $this$visitAncestors_u2dY_u2dYKmho_u24default$iv = previousActiveFocusTargetNode4;
        int iM6012constructorimpl = NodeKind.m6012constructorimpl(1024);
        boolean value$iv$iv$iv = $this$visitAncestors_u2dY_u2dYKmho_u24default$iv.getNode().getIsAttached();
        if (!value$iv$iv$iv) {
            InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
        }
        Modifier.Node node$iv$iv2 = $this$visitAncestors_u2dY_u2dYKmho_u24default$iv.getNode().getParent();
        LayoutNode layout$iv$iv = DelegatableNodeKt.requireLayoutNode($this$visitAncestors_u2dY_u2dYKmho_u24default$iv);
        while (layout$iv$iv != null) {
            Modifier.Node head$iv$iv = layout$iv$iv.getNodes().getHead();
            if ((head$iv$iv.getAggregateChildKindSet() & iM6012constructorimpl) != 0) {
                while (node$iv$iv2 != null) {
                    if ((node$iv$iv2.getKindSet() & iM6012constructorimpl) != 0) {
                        Modifier.Node it$iv = node$iv$iv2;
                        MutableVector mutableVector2 = null;
                        Modifier.Node this_$iv$iv$iv2 = it$iv;
                        while (this_$iv$iv$iv2 != null) {
                            if (this_$iv$iv$iv2 instanceof FocusTargetNode) {
                                FocusTargetNode it = (FocusTargetNode) this_$iv$iv$iv2;
                                previousActiveFocusTargetNode3 = previousActiveFocusTargetNode4;
                                it.dispatchFocusCallbacks$ui_release(FocusStateImpl.ActiveParent, FocusStateImpl.Inactive);
                                node$iv$iv = null;
                            } else {
                                previousActiveFocusTargetNode3 = previousActiveFocusTargetNode4;
                                if (((this_$iv$iv$iv2.getKindSet() & iM6012constructorimpl) != 0) && (this_$iv$iv$iv2 instanceof DelegatingNode)) {
                                    int count$iv$iv2 = 0;
                                    DelegatingNode this_$iv$iv$iv3 = (DelegatingNode) this_$iv$iv$iv2;
                                    int $i$f$forEachImmediateDelegate$ui_release2 = 0;
                                    Modifier.Node node$iv$iv$iv = this_$iv$iv$iv3.getDelegate();
                                    while (node$iv$iv$iv != null) {
                                        Modifier.Node next$iv$iv = node$iv$iv$iv;
                                        if ((next$iv$iv.getKindSet() & iM6012constructorimpl) != 0) {
                                            count$iv$iv2++;
                                            this_$iv$iv$iv = this_$iv$iv$iv3;
                                            if (count$iv$iv2 == 1) {
                                                $i$f$forEachImmediateDelegate$ui_release = $i$f$forEachImmediateDelegate$ui_release2;
                                                node = next$iv$iv;
                                            } else {
                                                if (mutableVector2 == null) {
                                                    count$iv$iv = count$iv$iv2;
                                                    $i$f$forEachImmediateDelegate$ui_release = $i$f$forEachImmediateDelegate$ui_release2;
                                                    node = this_$iv$iv$iv2;
                                                    mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                                } else {
                                                    count$iv$iv = count$iv$iv2;
                                                    $i$f$forEachImmediateDelegate$ui_release = $i$f$forEachImmediateDelegate$ui_release2;
                                                    node = this_$iv$iv$iv2;
                                                    mutableVector = mutableVector2;
                                                }
                                                Modifier.Node theNode$iv$iv = node;
                                                if (theNode$iv$iv != null) {
                                                    if (mutableVector != null) {
                                                        mutableVector.add(theNode$iv$iv);
                                                    }
                                                    node = null;
                                                }
                                                if (mutableVector != null) {
                                                    mutableVector.add(next$iv$iv);
                                                }
                                                mutableVector2 = mutableVector;
                                                count$iv$iv2 = count$iv$iv;
                                            }
                                        } else {
                                            this_$iv$iv$iv = this_$iv$iv$iv3;
                                            $i$f$forEachImmediateDelegate$ui_release = $i$f$forEachImmediateDelegate$ui_release2;
                                            node = this_$iv$iv$iv2;
                                        }
                                        node$iv$iv$iv = node$iv$iv$iv.getChild();
                                        this_$iv$iv$iv3 = this_$iv$iv$iv;
                                        $i$f$forEachImmediateDelegate$ui_release2 = $i$f$forEachImmediateDelegate$ui_release;
                                        this_$iv$iv$iv2 = node;
                                    }
                                    Modifier.Node node2 = this_$iv$iv$iv2;
                                    node$iv$iv = null;
                                    if (count$iv$iv2 == 1) {
                                        obj2 = null;
                                        previousActiveFocusTargetNode4 = previousActiveFocusTargetNode3;
                                        this_$iv$iv$iv2 = node2;
                                    }
                                } else {
                                    node$iv$iv = null;
                                }
                            }
                            obj2 = node$iv$iv;
                            this_$iv$iv$iv2 = DelegatableNodeKt.pop(mutableVector2);
                            previousActiveFocusTargetNode4 = previousActiveFocusTargetNode3;
                        }
                        previousActiveFocusTargetNode2 = previousActiveFocusTargetNode4;
                    } else {
                        previousActiveFocusTargetNode2 = previousActiveFocusTargetNode4;
                    }
                    node$iv$iv2 = node$iv$iv2.getParent();
                    obj2 = obj2;
                    previousActiveFocusTargetNode4 = previousActiveFocusTargetNode2;
                }
                previousActiveFocusTargetNode = previousActiveFocusTargetNode4;
                obj = obj2;
            } else {
                previousActiveFocusTargetNode = previousActiveFocusTargetNode4;
                obj = obj2;
            }
            layout$iv$iv = layout$iv$iv.getParent$ui_release();
            node$iv$iv2 = (layout$iv$iv == null || (nodes = layout$iv$iv.getNodes()) == null) ? null : nodes.getTail();
            obj2 = obj;
            previousActiveFocusTargetNode4 = previousActiveFocusTargetNode;
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [T, java.lang.Boolean] */
    @Override // androidx.compose.ui.focus.FocusManager
    /* renamed from: moveFocus-3ESFkO8 */
    public boolean mo4046moveFocus3ESFkO8(final int focusDirection) {
        if (ComposeUiFlags.isViewFocusFixEnabled && this.onMoveFocusInterop.invoke(FocusDirection.m4030boximpl(focusDirection)).booleanValue()) {
            return true;
        }
        final Ref.ObjectRef requestFocusSuccess = new Ref.ObjectRef();
        requestFocusSuccess.element = false;
        int generationBefore = getFocusTransactionManager().getGeneration();
        FocusTargetNode activeNodeBefore = getActiveFocusTargetNode();
        Boolean focusSearchSuccess = mo4051focusSearchULY8qGw(focusDirection, this.onFocusRectInterop.invoke(), new Function1<FocusTargetNode, Boolean>() { // from class: androidx.compose.ui.focus.FocusOwnerImpl$moveFocus$focusSearchSuccess$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX WARN: Type inference failed for: r1v2, types: [T, java.lang.Boolean] */
            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(FocusTargetNode it) {
                requestFocusSuccess.element = Boolean.valueOf(it.mo4064requestFocus3ESFkO8(focusDirection));
                Boolean bool = requestFocusSuccess.element;
                return Boolean.valueOf(bool != null ? bool.booleanValue() : false);
            }
        });
        int generationAfter = getFocusTransactionManager().getGeneration();
        if (Intrinsics.areEqual((Object) focusSearchSuccess, (Object) true) && (generationBefore != generationAfter || (ComposeUiFlags.isTrackFocusEnabled && activeNodeBefore != getActiveFocusTargetNode()))) {
            return true;
        }
        if (focusSearchSuccess == null || requestFocusSuccess.element == 0) {
            return false;
        }
        if (Intrinsics.areEqual((Object) focusSearchSuccess, (Object) true) && Intrinsics.areEqual((Object) requestFocusSuccess.element, (Object) true)) {
            return true;
        }
        if (FocusOwnerImplKt.m4057is1dFocusSearch3ESFkO8(focusDirection)) {
            boolean clearFocus = mo4048clearFocusI7lrPNg(false, true, false, focusDirection);
            return clearFocus && mo4053takeFocusaToIllA(focusDirection, null);
        }
        boolean clearFocus2 = ComposeUiFlags.isViewFocusFixEnabled;
        return !clearFocus2 && this.onMoveFocusInterop.invoke(FocusDirection.m4030boximpl(focusDirection)).booleanValue();
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    /* renamed from: focusSearch-ULY8qGw */
    public Boolean mo4051focusSearchULY8qGw(int focusDirection, Rect focusedRect, final Function1<? super FocusTargetNode, Boolean> onFound) {
        final FocusTargetNode source = findFocusTargetNode();
        if (source != null) {
            FocusRequester customDest = FocusTraversalKt.m4075customFocusSearchOMvw8(source, focusDirection, this.onLayoutDirection.invoke());
            if (Intrinsics.areEqual(customDest, FocusRequester.INSTANCE.getCancel())) {
                return null;
            }
            if (Intrinsics.areEqual(customDest, FocusRequester.INSTANCE.getRedirect$ui_release())) {
                FocusTargetNode focusTargetNodeFindFocusTargetNode = findFocusTargetNode();
                if (focusTargetNodeFindFocusTargetNode != null) {
                    return onFound.invoke(focusTargetNodeFindFocusTargetNode);
                }
                return null;
            }
            if (!Intrinsics.areEqual(customDest, FocusRequester.INSTANCE.getDefault())) {
                return Boolean.valueOf(customDest.findFocusTargetNode$ui_release(onFound));
            }
        } else {
            source = null;
        }
        return FocusTraversalKt.m4076focusSearch0X8WOeE(this.rootFocusNode, focusDirection, this.onLayoutDirection.invoke(), focusedRect, new Function1<FocusTargetNode, Boolean>() { // from class: androidx.compose.ui.focus.FocusOwnerImpl$focusSearch$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(FocusTargetNode it) {
                boolean zBooleanValue;
                if (Intrinsics.areEqual(it, source)) {
                    zBooleanValue = false;
                } else {
                    if (Intrinsics.areEqual(it, this.getRootFocusNode())) {
                        throw new IllegalStateException("Focus search landed at the root.".toString());
                    }
                    zBooleanValue = onFound.invoke(it).booleanValue();
                }
                return Boolean.valueOf(zBooleanValue);
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:312:0x0628, code lost:
    
        if (r45.invoke().booleanValue() == false) goto L314;
     */
    /* JADX WARN: Code restructure failed: missing block: B:314:0x062c, code lost:
    
        r0 = r25.getNode();
        r1 = 0;
        r3 = new kotlin.jvm.internal.Ref.ObjectRef();
        r4 = new kotlin.jvm.internal.Ref.ObjectRef();
        r4.element = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:316:0x0640, code lost:
    
        if (r4.element == null) goto L432;
     */
    /* JADX WARN: Code restructure failed: missing block: B:318:0x0646, code lost:
    
        if ((r4.element instanceof androidx.compose.ui.input.key.KeyInputModifierNode) == false) goto L323;
     */
    /* JADX WARN: Code restructure failed: missing block: B:320:0x0651, code lost:
    
        if (((androidx.compose.ui.input.key.KeyInputModifierNode) r4.element).mo216onKeyEventZmokQxo(r44) == false) goto L322;
     */
    /* JADX WARN: Code restructure failed: missing block: B:322:0x0655, code lost:
    
        r16 = r0;
        r18 = r1;
        r19 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:324:0x0669, code lost:
    
        if ((((androidx.compose.ui.Modifier.Node) r4.element).getKindSet() & r37) == 0) goto L326;
     */
    /* JADX WARN: Code restructure failed: missing block: B:325:0x066b, code lost:
    
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:326:0x066d, code lost:
    
        r7 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:327:0x066e, code lost:
    
        if (r7 == false) goto L433;
     */
    /* JADX WARN: Code restructure failed: missing block: B:329:0x0674, code lost:
    
        if ((r4.element instanceof androidx.compose.ui.node.DelegatingNode) == false) goto L434;
     */
    /* JADX WARN: Code restructure failed: missing block: B:330:0x0676, code lost:
    
        r7 = 0;
        r12 = ((androidx.compose.ui.node.DelegatingNode) r4.element).getDelegate();
        r0 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:331:0x0680, code lost:
    
        if (r12 == null) goto L440;
     */
    /* JADX WARN: Code restructure failed: missing block: B:332:0x0682, code lost:
    
        r13 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:333:0x068d, code lost:
    
        if ((r13.getKindSet() & r37) == 0) goto L335;
     */
    /* JADX WARN: Code restructure failed: missing block: B:334:0x068f, code lost:
    
        r15 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:335:0x0691, code lost:
    
        r15 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:336:0x0692, code lost:
    
        if (r15 == false) goto L354;
     */
    /* JADX WARN: Code restructure failed: missing block: B:337:0x0694, code lost:
    
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:338:0x0697, code lost:
    
        if (r7 != 1) goto L340;
     */
    /* JADX WARN: Code restructure failed: missing block: B:339:0x0699, code lost:
    
        r4.element = r13;
        r16 = r0;
        r18 = r1;
        r19 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:340:0x06a3, code lost:
    
        r15 = (androidx.compose.runtime.collection.MutableVector) r3.element;
     */
    /* JADX WARN: Code restructure failed: missing block: B:341:0x06a7, code lost:
    
        if (r15 != null) goto L343;
     */
    /* JADX WARN: Code restructure failed: missing block: B:342:0x06a9, code lost:
    
        r16 = r0;
        r18 = r1;
        r19 = r5;
        r15 = new androidx.compose.runtime.collection.MutableVector(new androidx.compose.ui.Modifier.Node[16], 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:343:0x06c1, code lost:
    
        r16 = r0;
        r18 = r1;
        r19 = r5;
        r15 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:344:0x06c7, code lost:
    
        r3.element = r15;
        r0 = (androidx.compose.ui.Modifier.Node) r4.element;
     */
    /* JADX WARN: Code restructure failed: missing block: B:345:0x06cd, code lost:
    
        if (r0 == null) goto L350;
     */
    /* JADX WARN: Code restructure failed: missing block: B:346:0x06cf, code lost:
    
        r1 = (androidx.compose.runtime.collection.MutableVector) r3.element;
     */
    /* JADX WARN: Code restructure failed: missing block: B:347:0x06d3, code lost:
    
        if (r1 == null) goto L349;
     */
    /* JADX WARN: Code restructure failed: missing block: B:348:0x06d5, code lost:
    
        java.lang.Boolean.valueOf(r1.add(r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:349:0x06dc, code lost:
    
        r4.element = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:351:0x06e1, code lost:
    
        r5 = (androidx.compose.runtime.collection.MutableVector) r3.element;
     */
    /* JADX WARN: Code restructure failed: missing block: B:352:0x06e5, code lost:
    
        if (r5 == null) goto L443;
     */
    /* JADX WARN: Code restructure failed: missing block: B:353:0x06e7, code lost:
    
        java.lang.Boolean.valueOf(r5.add(r13));
     */
    /* JADX WARN: Code restructure failed: missing block: B:354:0x06ef, code lost:
    
        r16 = r0;
        r18 = r1;
        r19 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:355:0x06f6, code lost:
    
        r12 = r12.getChild();
        r0 = r16;
        r1 = r18;
        r5 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:356:0x0705, code lost:
    
        r16 = r0;
        r18 = r1;
        r19 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:357:0x070d, code lost:
    
        if (r7 != 1) goto L435;
     */
    /* JADX WARN: Code restructure failed: missing block: B:358:0x070f, code lost:
    
        r0 = r16;
        r1 = r18;
        r5 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:359:0x0717, code lost:
    
        r16 = r0;
        r18 = r1;
        r19 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:360:0x071e, code lost:
    
        r4.element = androidx.compose.ui.node.DelegatableNodeKt.pop((androidx.compose.runtime.collection.MutableVector) r3.element);
        r0 = r16;
        r1 = r18;
        r5 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:362:0x0736, code lost:
    
        if (r10 == null) goto L370;
     */
    /* JADX WARN: Code restructure failed: missing block: B:363:0x0738, code lost:
    
        r0 = r10;
        r3 = 0;
        r4 = r0.size();
     */
    /* JADX WARN: Code restructure failed: missing block: B:364:0x0743, code lost:
    
        if (r3 >= r4) goto L445;
     */
    /* JADX WARN: Code restructure failed: missing block: B:366:0x0751, code lost:
    
        if (((androidx.compose.ui.input.key.KeyInputModifierNode) r0.get(r3)).mo216onKeyEventZmokQxo(r44) == false) goto L368;
     */
    /* JADX WARN: Code restructure failed: missing block: B:368:0x0755, code lost:
    
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:369:0x075b, code lost:
    
        r0 = kotlin.Unit.INSTANCE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:370:0x075e, code lost:
    
        r0 = kotlin.Unit.INSTANCE;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v104 */
    /* JADX WARN: Type inference failed for: r0v133 */
    /* JADX WARN: Type inference failed for: r0v62, types: [T, androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r0v63 */
    /* JADX WARN: Type inference failed for: r0v65, types: [T, androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r0v66 */
    /* JADX WARN: Type inference failed for: r0v72, types: [T, androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r0v73 */
    /* JADX WARN: Type inference failed for: r0v74 */
    /* JADX WARN: Type inference failed for: r0v77 */
    /* JADX WARN: Type inference failed for: r0v85 */
    /* JADX WARN: Type inference failed for: r0v88, types: [T, androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r0v89 */
    /* JADX WARN: Type inference failed for: r0v92 */
    /* JADX WARN: Type inference failed for: r0v98, types: [T] */
    /* JADX WARN: Type inference failed for: r13v3, types: [T, androidx.compose.ui.Modifier$Node, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v11, types: [T, androidx.compose.ui.Modifier$Node, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v12, types: [T] */
    /* JADX WARN: Type inference failed for: r15v14 */
    /* JADX WARN: Type inference failed for: r15v16 */
    @Override // androidx.compose.ui.focus.FocusOwner
    /* renamed from: dispatchKeyEvent-YhN2O0w */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean mo4050dispatchKeyEventYhN2O0w(android.view.KeyEvent r44, kotlin.jvm.functions.Function0<java.lang.Boolean> r45) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1916
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.FocusOwnerImpl.mo4050dispatchKeyEventYhN2O0w(android.view.KeyEvent, kotlin.jvm.functions.Function0):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9, types: [androidx.compose.ui.Modifier$Node] */
    @Override // androidx.compose.ui.focus.FocusOwner
    /* renamed from: dispatchInterceptedSoftKeyboardEvent-ZmokQxo */
    public boolean mo4049dispatchInterceptedSoftKeyboardEventZmokQxo(KeyEvent keyEvent) {
        int i;
        SoftKeyboardInterceptionModifierNode softKeyboardInterceptionModifierNode;
        Modifier.Node node;
        int i2;
        Modifier.Node node2;
        int i3;
        MutableVector mutableVector;
        Modifier.Node node3;
        int i4;
        Modifier.Node node4;
        int i5;
        MutableVector mutableVector2;
        SoftKeyboardInterceptionModifierNode softKeyboardInterceptionModifierNode2;
        int i6;
        NodeChain nodes;
        int i7;
        int i8;
        Modifier.Node node5;
        int i9;
        Modifier.Node node6;
        MutableVector mutableVector3;
        Modifier.Node node7;
        Modifier.Node node8;
        SoftKeyboardInterceptionModifierNode softKeyboardInterceptionModifierNode3;
        FocusTargetNode focusTargetNode;
        int i10;
        NodeChain nodes2;
        FocusTargetNode focusTargetNode2;
        FocusTargetNode focusTargetNode3;
        FocusTargetNode focusTargetNode4;
        MutableVector mutableVector4;
        if (this.focusInvalidationManager.hasPendingInvalidation()) {
            System.out.println((Object) "FocusRelatedWarning: Dispatching intercepted soft keyboard event while the focus system is invalidated.");
            return false;
        }
        FocusTargetNode focusTargetNodeFindActiveFocusNode = FocusTraversalKt.findActiveFocusNode(this.rootFocusNode);
        int i11 = 131072;
        int i12 = 1;
        if (focusTargetNodeFindActiveFocusNode != null) {
            FocusTargetNode focusTargetNode5 = focusTargetNodeFindActiveFocusNode;
            int iM6012constructorimpl = NodeKind.m6012constructorimpl(131072);
            if (!focusTargetNode5.getNode().getIsAttached()) {
                InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
            }
            Modifier.Node node9 = focusTargetNode5.getNode();
            LayoutNode layoutNodeRequireLayoutNode = DelegatableNodeKt.requireLayoutNode(focusTargetNode5);
            loop0: while (true) {
                if (layoutNodeRequireLayoutNode == null) {
                    i = i11;
                    softKeyboardInterceptionModifierNode3 = null;
                    break;
                }
                if ((layoutNodeRequireLayoutNode.getNodes().getHead().getAggregateChildKindSet() & iM6012constructorimpl) != 0) {
                    while (node9 != null) {
                        if ((node9.getKindSet() & iM6012constructorimpl) != 0) {
                            MutableVector mutableVector5 = null;
                            i = i11;
                            Modifier.Node nodePop = node9;
                            while (nodePop != 0) {
                                if (nodePop instanceof SoftKeyboardInterceptionModifierNode) {
                                    softKeyboardInterceptionModifierNode3 = nodePop;
                                    break loop0;
                                }
                                if (((nodePop.getKindSet() & iM6012constructorimpl) != 0 ? i12 : 0) == 0 || !(nodePop instanceof DelegatingNode)) {
                                    focusTargetNode3 = focusTargetNode5;
                                    nodePop = DelegatableNodeKt.pop(mutableVector5);
                                    focusTargetNode5 = focusTargetNode3;
                                    i12 = 1;
                                } else {
                                    int i13 = 0;
                                    Modifier.Node delegate = nodePop.getDelegate();
                                    nodePop = nodePop;
                                    while (delegate != null) {
                                        Modifier.Node node10 = delegate;
                                        if (((node10.getKindSet() & iM6012constructorimpl) != 0 ? i12 : 0) != 0) {
                                            i13++;
                                            if (i13 == i12) {
                                                nodePop = node10;
                                                focusTargetNode4 = focusTargetNode5;
                                            } else {
                                                if (mutableVector5 == null) {
                                                    focusTargetNode4 = focusTargetNode5;
                                                    mutableVector4 = new MutableVector(new Modifier.Node[16], 0);
                                                } else {
                                                    focusTargetNode4 = focusTargetNode5;
                                                    mutableVector4 = mutableVector5;
                                                }
                                                Object obj = nodePop;
                                                nodePop = nodePop;
                                                if (obj != null) {
                                                    if (mutableVector4 != null) {
                                                        mutableVector4.add(obj);
                                                    }
                                                    nodePop = 0;
                                                }
                                                if (mutableVector4 != null) {
                                                    mutableVector4.add(node10);
                                                }
                                                mutableVector5 = mutableVector4;
                                            }
                                        } else {
                                            focusTargetNode4 = focusTargetNode5;
                                        }
                                        delegate = delegate.getChild();
                                        focusTargetNode5 = focusTargetNode4;
                                        i12 = 1;
                                        nodePop = nodePop;
                                    }
                                    focusTargetNode3 = focusTargetNode5;
                                    if (i13 == 1) {
                                        focusTargetNode5 = focusTargetNode3;
                                        i12 = 1;
                                    } else {
                                        nodePop = DelegatableNodeKt.pop(mutableVector5);
                                        focusTargetNode5 = focusTargetNode3;
                                        i12 = 1;
                                    }
                                }
                            }
                            focusTargetNode2 = focusTargetNode5;
                        } else {
                            focusTargetNode2 = focusTargetNode5;
                            i = i11;
                        }
                        node9 = node9.getParent();
                        i12 = 1;
                        i11 = i;
                        focusTargetNode5 = focusTargetNode2;
                    }
                    focusTargetNode = focusTargetNode5;
                    i10 = i11;
                } else {
                    focusTargetNode = focusTargetNode5;
                    i10 = i11;
                }
                layoutNodeRequireLayoutNode = layoutNodeRequireLayoutNode.getParent$ui_release();
                node9 = (layoutNodeRequireLayoutNode == null || (nodes2 = layoutNodeRequireLayoutNode.getNodes()) == null) ? null : nodes2.getTail();
                i12 = 1;
                i11 = i10;
                focusTargetNode5 = focusTargetNode;
            }
            softKeyboardInterceptionModifierNode = softKeyboardInterceptionModifierNode3;
        } else {
            i = 131072;
            softKeyboardInterceptionModifierNode = null;
        }
        if (softKeyboardInterceptionModifierNode == null) {
            return false;
        }
        SoftKeyboardInterceptionModifierNode softKeyboardInterceptionModifierNode4 = softKeyboardInterceptionModifierNode;
        int iM6012constructorimpl2 = NodeKind.m6012constructorimpl(i);
        ArrayList arrayList = null;
        if (!softKeyboardInterceptionModifierNode4.getNode().getIsAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
        }
        Modifier.Node parent = softKeyboardInterceptionModifierNode4.getNode().getParent();
        LayoutNode layoutNodeRequireLayoutNode2 = DelegatableNodeKt.requireLayoutNode(softKeyboardInterceptionModifierNode4);
        while (layoutNodeRequireLayoutNode2 != null) {
            if ((layoutNodeRequireLayoutNode2.getNodes().getHead().getAggregateChildKindSet() & iM6012constructorimpl2) != 0) {
                while (parent != null) {
                    if ((parent.getKindSet() & iM6012constructorimpl2) != 0) {
                        MutableVector mutableVector6 = null;
                        Modifier.Node nodePop2 = parent;
                        while (nodePop2 != null) {
                            SoftKeyboardInterceptionModifierNode softKeyboardInterceptionModifierNode5 = softKeyboardInterceptionModifierNode4;
                            if (nodePop2 instanceof SoftKeyboardInterceptionModifierNode) {
                                Modifier.Node node11 = nodePop2;
                                if (arrayList == null) {
                                    arrayList = new ArrayList();
                                }
                                arrayList.add(node11);
                                i7 = iM6012constructorimpl2;
                            } else if (((nodePop2.getKindSet() & iM6012constructorimpl2) != 0) && (nodePop2 instanceof DelegatingNode)) {
                                int i14 = 0;
                                Modifier.Node delegate2 = ((DelegatingNode) nodePop2).getDelegate();
                                while (delegate2 != null) {
                                    Modifier.Node node12 = delegate2;
                                    if ((node12.getKindSet() & iM6012constructorimpl2) != 0) {
                                        i14++;
                                        i8 = iM6012constructorimpl2;
                                        if (i14 == 1) {
                                            node5 = node12;
                                        } else {
                                            if (mutableVector6 == null) {
                                                i9 = i14;
                                                node6 = nodePop2;
                                                mutableVector3 = new MutableVector(new Modifier.Node[16], 0);
                                            } else {
                                                i9 = i14;
                                                node6 = nodePop2;
                                                mutableVector3 = mutableVector6;
                                            }
                                            Modifier.Node node13 = node6;
                                            if (node13 != null) {
                                                if (mutableVector3 != null) {
                                                    mutableVector3.add(node13);
                                                }
                                                node7 = null;
                                            } else {
                                                node7 = node6;
                                            }
                                            if (mutableVector3 != null) {
                                                node8 = node7;
                                                mutableVector3.add(node12);
                                            } else {
                                                node8 = node7;
                                            }
                                            node5 = node8;
                                            i14 = i9;
                                            mutableVector6 = mutableVector3;
                                        }
                                    } else {
                                        i8 = iM6012constructorimpl2;
                                        node5 = nodePop2;
                                    }
                                    delegate2 = delegate2.getChild();
                                    iM6012constructorimpl2 = i8;
                                    nodePop2 = node5;
                                }
                                i7 = iM6012constructorimpl2;
                                Modifier.Node node14 = nodePop2;
                                if (i14 == 1) {
                                    softKeyboardInterceptionModifierNode4 = softKeyboardInterceptionModifierNode5;
                                    iM6012constructorimpl2 = i7;
                                    nodePop2 = node14;
                                }
                            } else {
                                i7 = iM6012constructorimpl2;
                            }
                            nodePop2 = DelegatableNodeKt.pop(mutableVector6);
                            softKeyboardInterceptionModifierNode4 = softKeyboardInterceptionModifierNode5;
                            iM6012constructorimpl2 = i7;
                        }
                    }
                    parent = parent.getParent();
                    softKeyboardInterceptionModifierNode4 = softKeyboardInterceptionModifierNode4;
                    iM6012constructorimpl2 = iM6012constructorimpl2;
                }
                softKeyboardInterceptionModifierNode2 = softKeyboardInterceptionModifierNode4;
                i6 = iM6012constructorimpl2;
            } else {
                softKeyboardInterceptionModifierNode2 = softKeyboardInterceptionModifierNode4;
                i6 = iM6012constructorimpl2;
            }
            layoutNodeRequireLayoutNode2 = layoutNodeRequireLayoutNode2.getParent$ui_release();
            parent = (layoutNodeRequireLayoutNode2 == null || (nodes = layoutNodeRequireLayoutNode2.getNodes()) == null) ? null : nodes.getTail();
            softKeyboardInterceptionModifierNode4 = softKeyboardInterceptionModifierNode2;
            iM6012constructorimpl2 = i6;
        }
        SoftKeyboardInterceptionModifierNode softKeyboardInterceptionModifierNode6 = softKeyboardInterceptionModifierNode4;
        int i15 = iM6012constructorimpl2;
        if (arrayList != null) {
            List list = arrayList;
            int size = list.size() - 1;
            if (size >= 0) {
                do {
                    int i16 = size;
                    size--;
                    if (((SoftKeyboardInterceptionModifierNode) list.get(i16)).mo5169onPreInterceptKeyBeforeSoftKeyboardZmokQxo(keyEvent)) {
                        return true;
                    }
                } while (size >= 0);
            }
        }
        Modifier.Node node15 = softKeyboardInterceptionModifierNode6.getNode();
        int i17 = 0;
        MutableVector mutableVector7 = null;
        Modifier.Node nodePop3 = node15;
        while (nodePop3 != null) {
            if (nodePop3 instanceof SoftKeyboardInterceptionModifierNode) {
                if (((SoftKeyboardInterceptionModifierNode) nodePop3).mo5169onPreInterceptKeyBeforeSoftKeyboardZmokQxo(keyEvent)) {
                    return true;
                }
                node3 = node15;
                i4 = i17;
            } else if (((nodePop3.getKindSet() & i15) != 0) && (nodePop3 instanceof DelegatingNode)) {
                int i18 = 0;
                Modifier.Node delegate3 = ((DelegatingNode) nodePop3).getDelegate();
                while (delegate3 != null) {
                    Modifier.Node node16 = delegate3;
                    if ((node16.getKindSet() & i15) != 0) {
                        i18++;
                        if (i18 == 1) {
                            nodePop3 = node16;
                            node4 = node15;
                            i5 = i17;
                        } else {
                            if (mutableVector7 == null) {
                                node4 = node15;
                                i5 = i17;
                                mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
                            } else {
                                node4 = node15;
                                i5 = i17;
                                mutableVector2 = mutableVector7;
                            }
                            mutableVector7 = mutableVector2;
                            Modifier.Node node17 = nodePop3;
                            if (node17 != null) {
                                if (mutableVector7 != null) {
                                    mutableVector7.add(node17);
                                }
                                nodePop3 = null;
                            }
                            if (mutableVector7 != null) {
                                mutableVector7.add(node16);
                            }
                        }
                    } else {
                        node4 = node15;
                        i5 = i17;
                    }
                    delegate3 = delegate3.getChild();
                    node15 = node4;
                    i17 = i5;
                }
                node3 = node15;
                i4 = i17;
                MutableVector mutableVector8 = mutableVector7;
                if (i18 == 1) {
                    node15 = node3;
                    i17 = i4;
                    mutableVector7 = mutableVector8;
                } else {
                    mutableVector7 = mutableVector8;
                }
            } else {
                node3 = node15;
                i4 = i17;
            }
            nodePop3 = DelegatableNodeKt.pop(mutableVector7);
            node15 = node3;
            i17 = i4;
        }
        Modifier.Node node18 = softKeyboardInterceptionModifierNode6.getNode();
        int i19 = 0;
        MutableVector mutableVector9 = null;
        Modifier.Node nodePop4 = node18;
        while (nodePop4 != null) {
            if (nodePop4 instanceof SoftKeyboardInterceptionModifierNode) {
                if (((SoftKeyboardInterceptionModifierNode) nodePop4).mo5168onInterceptKeyBeforeSoftKeyboardZmokQxo(keyEvent)) {
                    return true;
                }
                node = node18;
                i2 = i19;
            } else if (((nodePop4.getKindSet() & i15) != 0) && (nodePop4 instanceof DelegatingNode)) {
                int i20 = 0;
                Modifier.Node delegate4 = ((DelegatingNode) nodePop4).getDelegate();
                while (delegate4 != null) {
                    Modifier.Node node19 = delegate4;
                    if ((node19.getKindSet() & i15) != 0) {
                        i20++;
                        if (i20 == 1) {
                            nodePop4 = node19;
                            node2 = node18;
                            i3 = i19;
                        } else {
                            if (mutableVector9 == null) {
                                node2 = node18;
                                i3 = i19;
                                mutableVector = new MutableVector(new Modifier.Node[16], 0);
                            } else {
                                node2 = node18;
                                i3 = i19;
                                mutableVector = mutableVector9;
                            }
                            mutableVector9 = mutableVector;
                            Modifier.Node node20 = nodePop4;
                            if (node20 != null) {
                                if (mutableVector9 != null) {
                                    mutableVector9.add(node20);
                                }
                                nodePop4 = null;
                            }
                            if (mutableVector9 != null) {
                                mutableVector9.add(node19);
                            }
                        }
                    } else {
                        node2 = node18;
                        i3 = i19;
                    }
                    delegate4 = delegate4.getChild();
                    node18 = node2;
                    i19 = i3;
                }
                node = node18;
                i2 = i19;
                MutableVector mutableVector10 = mutableVector9;
                if (i20 == 1) {
                    node18 = node;
                    i19 = i2;
                    mutableVector9 = mutableVector10;
                } else {
                    mutableVector9 = mutableVector10;
                }
            } else {
                node = node18;
                i2 = i19;
            }
            nodePop4 = DelegatableNodeKt.pop(mutableVector9);
            node18 = node;
            i19 = i2;
        }
        if (arrayList == null) {
            return false;
        }
        List list2 = arrayList;
        int size2 = list2.size();
        for (int i21 = 0; i21 < size2; i21++) {
            if (((SoftKeyboardInterceptionModifierNode) list2.get(i21)).mo5168onInterceptKeyBeforeSoftKeyboardZmokQxo(keyEvent)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9, types: [androidx.compose.ui.Modifier$Node] */
    @Override // androidx.compose.ui.focus.FocusOwner
    public boolean dispatchRotaryEvent(RotaryScrollEvent event, Function0<Boolean> onFocusedItem) {
        int i;
        RotaryInputModifierNode rotaryInputModifierNode;
        Modifier.Node node;
        int i2;
        Modifier.Node node2;
        int i3;
        MutableVector mutableVector;
        Modifier.Node node3;
        int i4;
        Modifier.Node node4;
        int i5;
        MutableVector mutableVector2;
        RotaryInputModifierNode rotaryInputModifierNode2;
        int i6;
        NodeChain nodes;
        int i7;
        int i8;
        Modifier.Node node5;
        int i9;
        Modifier.Node node6;
        MutableVector mutableVector3;
        Modifier.Node node7;
        Modifier.Node node8;
        RotaryInputModifierNode rotaryInputModifierNode3;
        FocusTargetNode focusTargetNode;
        int i10;
        NodeChain nodes2;
        FocusTargetNode focusTargetNode2;
        FocusTargetNode focusTargetNode3;
        FocusTargetNode focusTargetNode4;
        MutableVector mutableVector4;
        if (this.focusInvalidationManager.hasPendingInvalidation()) {
            System.out.println((Object) "FocusRelatedWarning: Dispatching rotary event while the focus system is invalidated.");
            return false;
        }
        FocusTargetNode focusTargetNodeFindFocusTargetNode = findFocusTargetNode();
        int i11 = 16384;
        int i12 = 1;
        if (focusTargetNodeFindFocusTargetNode != null) {
            FocusTargetNode focusTargetNode5 = focusTargetNodeFindFocusTargetNode;
            int iM6012constructorimpl = NodeKind.m6012constructorimpl(16384);
            if (!focusTargetNode5.getNode().getIsAttached()) {
                InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
            }
            Modifier.Node node9 = focusTargetNode5.getNode();
            LayoutNode layoutNodeRequireLayoutNode = DelegatableNodeKt.requireLayoutNode(focusTargetNode5);
            loop0: while (true) {
                if (layoutNodeRequireLayoutNode == null) {
                    i = i11;
                    rotaryInputModifierNode3 = null;
                    break;
                }
                if ((layoutNodeRequireLayoutNode.getNodes().getHead().getAggregateChildKindSet() & iM6012constructorimpl) != 0) {
                    while (node9 != null) {
                        if ((node9.getKindSet() & iM6012constructorimpl) != 0) {
                            MutableVector mutableVector5 = null;
                            i = i11;
                            Modifier.Node nodePop = node9;
                            while (nodePop != 0) {
                                if (nodePop instanceof RotaryInputModifierNode) {
                                    rotaryInputModifierNode3 = nodePop;
                                    break loop0;
                                }
                                if (((nodePop.getKindSet() & iM6012constructorimpl) != 0 ? i12 : 0) == 0 || !(nodePop instanceof DelegatingNode)) {
                                    focusTargetNode3 = focusTargetNode5;
                                    nodePop = DelegatableNodeKt.pop(mutableVector5);
                                    focusTargetNode5 = focusTargetNode3;
                                    i12 = 1;
                                } else {
                                    int i13 = 0;
                                    Modifier.Node delegate = nodePop.getDelegate();
                                    nodePop = nodePop;
                                    while (delegate != null) {
                                        Modifier.Node node10 = delegate;
                                        if (((node10.getKindSet() & iM6012constructorimpl) != 0 ? i12 : 0) != 0) {
                                            i13++;
                                            if (i13 == i12) {
                                                nodePop = node10;
                                                focusTargetNode4 = focusTargetNode5;
                                            } else {
                                                if (mutableVector5 == null) {
                                                    focusTargetNode4 = focusTargetNode5;
                                                    mutableVector4 = new MutableVector(new Modifier.Node[16], 0);
                                                } else {
                                                    focusTargetNode4 = focusTargetNode5;
                                                    mutableVector4 = mutableVector5;
                                                }
                                                Object obj = nodePop;
                                                nodePop = nodePop;
                                                if (obj != null) {
                                                    if (mutableVector4 != null) {
                                                        mutableVector4.add(obj);
                                                    }
                                                    nodePop = 0;
                                                }
                                                if (mutableVector4 != null) {
                                                    mutableVector4.add(node10);
                                                }
                                                mutableVector5 = mutableVector4;
                                            }
                                        } else {
                                            focusTargetNode4 = focusTargetNode5;
                                        }
                                        delegate = delegate.getChild();
                                        focusTargetNode5 = focusTargetNode4;
                                        i12 = 1;
                                        nodePop = nodePop;
                                    }
                                    focusTargetNode3 = focusTargetNode5;
                                    if (i13 == 1) {
                                        focusTargetNode5 = focusTargetNode3;
                                        i12 = 1;
                                    } else {
                                        nodePop = DelegatableNodeKt.pop(mutableVector5);
                                        focusTargetNode5 = focusTargetNode3;
                                        i12 = 1;
                                    }
                                }
                            }
                            focusTargetNode2 = focusTargetNode5;
                        } else {
                            focusTargetNode2 = focusTargetNode5;
                            i = i11;
                        }
                        node9 = node9.getParent();
                        i12 = 1;
                        i11 = i;
                        focusTargetNode5 = focusTargetNode2;
                    }
                    focusTargetNode = focusTargetNode5;
                    i10 = i11;
                } else {
                    focusTargetNode = focusTargetNode5;
                    i10 = i11;
                }
                layoutNodeRequireLayoutNode = layoutNodeRequireLayoutNode.getParent$ui_release();
                node9 = (layoutNodeRequireLayoutNode == null || (nodes2 = layoutNodeRequireLayoutNode.getNodes()) == null) ? null : nodes2.getTail();
                i12 = 1;
                i11 = i10;
                focusTargetNode5 = focusTargetNode;
            }
            rotaryInputModifierNode = rotaryInputModifierNode3;
        } else {
            i = 16384;
            rotaryInputModifierNode = null;
        }
        if (rotaryInputModifierNode == null) {
            return false;
        }
        RotaryInputModifierNode rotaryInputModifierNode4 = rotaryInputModifierNode;
        int iM6012constructorimpl2 = NodeKind.m6012constructorimpl(i);
        ArrayList arrayList = null;
        if (!rotaryInputModifierNode4.getNode().getIsAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
        }
        Modifier.Node parent = rotaryInputModifierNode4.getNode().getParent();
        LayoutNode layoutNodeRequireLayoutNode2 = DelegatableNodeKt.requireLayoutNode(rotaryInputModifierNode4);
        while (layoutNodeRequireLayoutNode2 != null) {
            if ((layoutNodeRequireLayoutNode2.getNodes().getHead().getAggregateChildKindSet() & iM6012constructorimpl2) != 0) {
                while (parent != null) {
                    if ((parent.getKindSet() & iM6012constructorimpl2) != 0) {
                        MutableVector mutableVector6 = null;
                        Modifier.Node nodePop2 = parent;
                        while (nodePop2 != null) {
                            RotaryInputModifierNode rotaryInputModifierNode5 = rotaryInputModifierNode4;
                            if (nodePop2 instanceof RotaryInputModifierNode) {
                                Modifier.Node node11 = nodePop2;
                                if (arrayList == null) {
                                    arrayList = new ArrayList();
                                }
                                arrayList.add(node11);
                                i7 = iM6012constructorimpl2;
                            } else if (((nodePop2.getKindSet() & iM6012constructorimpl2) != 0) && (nodePop2 instanceof DelegatingNode)) {
                                int i14 = 0;
                                Modifier.Node delegate2 = ((DelegatingNode) nodePop2).getDelegate();
                                while (delegate2 != null) {
                                    Modifier.Node node12 = delegate2;
                                    if ((node12.getKindSet() & iM6012constructorimpl2) != 0) {
                                        i14++;
                                        i8 = iM6012constructorimpl2;
                                        if (i14 == 1) {
                                            node5 = node12;
                                        } else {
                                            if (mutableVector6 == null) {
                                                i9 = i14;
                                                node6 = nodePop2;
                                                mutableVector3 = new MutableVector(new Modifier.Node[16], 0);
                                            } else {
                                                i9 = i14;
                                                node6 = nodePop2;
                                                mutableVector3 = mutableVector6;
                                            }
                                            Modifier.Node node13 = node6;
                                            if (node13 != null) {
                                                if (mutableVector3 != null) {
                                                    mutableVector3.add(node13);
                                                }
                                                node7 = null;
                                            } else {
                                                node7 = node6;
                                            }
                                            if (mutableVector3 != null) {
                                                node8 = node7;
                                                mutableVector3.add(node12);
                                            } else {
                                                node8 = node7;
                                            }
                                            node5 = node8;
                                            i14 = i9;
                                            mutableVector6 = mutableVector3;
                                        }
                                    } else {
                                        i8 = iM6012constructorimpl2;
                                        node5 = nodePop2;
                                    }
                                    delegate2 = delegate2.getChild();
                                    iM6012constructorimpl2 = i8;
                                    nodePop2 = node5;
                                }
                                i7 = iM6012constructorimpl2;
                                Modifier.Node node14 = nodePop2;
                                if (i14 == 1) {
                                    rotaryInputModifierNode4 = rotaryInputModifierNode5;
                                    iM6012constructorimpl2 = i7;
                                    nodePop2 = node14;
                                }
                            } else {
                                i7 = iM6012constructorimpl2;
                            }
                            nodePop2 = DelegatableNodeKt.pop(mutableVector6);
                            rotaryInputModifierNode4 = rotaryInputModifierNode5;
                            iM6012constructorimpl2 = i7;
                        }
                    }
                    parent = parent.getParent();
                    rotaryInputModifierNode4 = rotaryInputModifierNode4;
                    iM6012constructorimpl2 = iM6012constructorimpl2;
                }
                rotaryInputModifierNode2 = rotaryInputModifierNode4;
                i6 = iM6012constructorimpl2;
            } else {
                rotaryInputModifierNode2 = rotaryInputModifierNode4;
                i6 = iM6012constructorimpl2;
            }
            layoutNodeRequireLayoutNode2 = layoutNodeRequireLayoutNode2.getParent$ui_release();
            parent = (layoutNodeRequireLayoutNode2 == null || (nodes = layoutNodeRequireLayoutNode2.getNodes()) == null) ? null : nodes.getTail();
            rotaryInputModifierNode4 = rotaryInputModifierNode2;
            iM6012constructorimpl2 = i6;
        }
        RotaryInputModifierNode rotaryInputModifierNode6 = rotaryInputModifierNode4;
        int i15 = iM6012constructorimpl2;
        if (arrayList != null) {
            List list = arrayList;
            int size = list.size() - 1;
            if (size >= 0) {
                do {
                    int i16 = size;
                    size--;
                    if (((RotaryInputModifierNode) list.get(i16)).onPreRotaryScrollEvent(event)) {
                        return true;
                    }
                } while (size >= 0);
            }
        }
        Modifier.Node node15 = rotaryInputModifierNode6.getNode();
        int i17 = 0;
        MutableVector mutableVector7 = null;
        Modifier.Node nodePop3 = node15;
        while (nodePop3 != null) {
            if (nodePop3 instanceof RotaryInputModifierNode) {
                if (((RotaryInputModifierNode) nodePop3).onPreRotaryScrollEvent(event)) {
                    return true;
                }
                node3 = node15;
                i4 = i17;
            } else if (((nodePop3.getKindSet() & i15) != 0) && (nodePop3 instanceof DelegatingNode)) {
                int i18 = 0;
                Modifier.Node delegate3 = ((DelegatingNode) nodePop3).getDelegate();
                while (delegate3 != null) {
                    Modifier.Node node16 = delegate3;
                    if ((node16.getKindSet() & i15) != 0) {
                        i18++;
                        if (i18 == 1) {
                            nodePop3 = node16;
                            node4 = node15;
                            i5 = i17;
                        } else {
                            if (mutableVector7 == null) {
                                node4 = node15;
                                i5 = i17;
                                mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
                            } else {
                                node4 = node15;
                                i5 = i17;
                                mutableVector2 = mutableVector7;
                            }
                            mutableVector7 = mutableVector2;
                            Modifier.Node node17 = nodePop3;
                            if (node17 != null) {
                                if (mutableVector7 != null) {
                                    mutableVector7.add(node17);
                                }
                                nodePop3 = null;
                            }
                            if (mutableVector7 != null) {
                                mutableVector7.add(node16);
                            }
                        }
                    } else {
                        node4 = node15;
                        i5 = i17;
                    }
                    delegate3 = delegate3.getChild();
                    node15 = node4;
                    i17 = i5;
                }
                node3 = node15;
                i4 = i17;
                MutableVector mutableVector8 = mutableVector7;
                if (i18 == 1) {
                    node15 = node3;
                    i17 = i4;
                    mutableVector7 = mutableVector8;
                } else {
                    mutableVector7 = mutableVector8;
                }
            } else {
                node3 = node15;
                i4 = i17;
            }
            nodePop3 = DelegatableNodeKt.pop(mutableVector7);
            node15 = node3;
            i17 = i4;
        }
        if (onFocusedItem.invoke().booleanValue()) {
            return true;
        }
        Modifier.Node node18 = rotaryInputModifierNode6.getNode();
        int i19 = 0;
        MutableVector mutableVector9 = null;
        Modifier.Node nodePop4 = node18;
        while (nodePop4 != null) {
            if (nodePop4 instanceof RotaryInputModifierNode) {
                if (((RotaryInputModifierNode) nodePop4).onRotaryScrollEvent(event)) {
                    return true;
                }
                node = node18;
                i2 = i19;
            } else if (((nodePop4.getKindSet() & i15) != 0) && (nodePop4 instanceof DelegatingNode)) {
                int i20 = 0;
                Modifier.Node delegate4 = ((DelegatingNode) nodePop4).getDelegate();
                while (delegate4 != null) {
                    Modifier.Node node19 = delegate4;
                    if ((node19.getKindSet() & i15) != 0) {
                        i20++;
                        if (i20 == 1) {
                            nodePop4 = node19;
                            node2 = node18;
                            i3 = i19;
                        } else {
                            if (mutableVector9 == null) {
                                node2 = node18;
                                i3 = i19;
                                mutableVector = new MutableVector(new Modifier.Node[16], 0);
                            } else {
                                node2 = node18;
                                i3 = i19;
                                mutableVector = mutableVector9;
                            }
                            mutableVector9 = mutableVector;
                            Modifier.Node node20 = nodePop4;
                            if (node20 != null) {
                                if (mutableVector9 != null) {
                                    mutableVector9.add(node20);
                                }
                                nodePop4 = null;
                            }
                            if (mutableVector9 != null) {
                                mutableVector9.add(node19);
                            }
                        }
                    } else {
                        node2 = node18;
                        i3 = i19;
                    }
                    delegate4 = delegate4.getChild();
                    node18 = node2;
                    i19 = i3;
                }
                node = node18;
                i2 = i19;
                MutableVector mutableVector10 = mutableVector9;
                if (i20 == 1) {
                    node18 = node;
                    i19 = i2;
                    mutableVector9 = mutableVector10;
                } else {
                    mutableVector9 = mutableVector10;
                }
            } else {
                node = node18;
                i2 = i19;
            }
            nodePop4 = DelegatableNodeKt.pop(mutableVector9);
            node18 = node;
            i19 = i2;
        }
        if (arrayList == null) {
            return false;
        }
        List list2 = arrayList;
        int size2 = list2.size();
        for (int i21 = 0; i21 < size2; i21++) {
            if (((RotaryInputModifierNode) list2.get(i21)).onRotaryScrollEvent(event)) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public void scheduleInvalidation(FocusTargetNode node) {
        this.focusInvalidationManager.scheduleInvalidation(node);
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public void scheduleInvalidation(FocusEventModifierNode node) {
        this.focusInvalidationManager.scheduleInvalidation(node);
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public void scheduleInvalidation(FocusPropertiesModifierNode node) {
        this.focusInvalidationManager.scheduleInvalidation(node);
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public void scheduleInvalidationForOwner() {
        this.focusInvalidationManager.scheduleInvalidationForOwner();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void invalidateOwnerFocusState() {
        if ((ComposeUiFlags.isTrackFocusEnabled && getActiveFocusTargetNode() == null) || this.rootFocusNode.getFocusState() == FocusStateImpl.Inactive) {
            this.onClearFocusForOwner.invoke();
        }
    }

    /* renamed from: traverseAncestorsIncludingSelf-QFhIj7k, reason: not valid java name */
    private final /* synthetic */ <T extends DelegatableNode> void m4055traverseAncestorsIncludingSelfQFhIj7k(DelegatableNode $this$traverseAncestorsIncludingSelf_u2dQFhIj7k, int type, Function1<? super T, Unit> function1, Function0<Unit> function0, Function1<? super T, Unit> function12) {
        Modifier.Node $this$dispatchForKind_u2d6rFNWt0$iv;
        int i;
        Modifier.Node $this$dispatchForKind_u2d6rFNWt0$iv2;
        int i2;
        List ancestors;
        Modifier.Node $this$dispatchForKind_u2d6rFNWt0$iv3;
        List ancestors2;
        Modifier.Node $this$dispatchForKind_u2d6rFNWt0$iv4;
        int size;
        int i3;
        DelegatableNode $this$ancestors_u2d64DMado$iv;
        int i4;
        NodeChain nodes;
        int i5;
        DelegatableNode $this$ancestors_u2d64DMado$iv2;
        int i6;
        DelegatableNode $this$ancestors_u2d64DMado$iv3;
        int i7;
        int i8;
        Object result$iv;
        int count$iv$iv$iv;
        Function1<? super T, Unit> function13 = function1;
        int count$iv$iv$iv2 = 0;
        DelegatableNode $this$ancestors_u2d64DMado$iv4 = $this$traverseAncestorsIncludingSelf_u2dQFhIj7k;
        int i9 = 0;
        Object result$iv2 = null;
        boolean value$iv$iv$iv$iv = $this$ancestors_u2d64DMado$iv4.getNode().getIsAttached();
        if (!value$iv$iv$iv$iv) {
            InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
        }
        Modifier.Node node$iv$iv$iv = $this$ancestors_u2d64DMado$iv4.getNode().getParent();
        LayoutNode layout$iv$iv$iv = DelegatableNodeKt.requireLayoutNode($this$ancestors_u2d64DMado$iv4);
        while (layout$iv$iv$iv != null) {
            Modifier.Node head$iv$iv$iv = layout$iv$iv$iv.getNodes().getHead();
            if ((head$iv$iv$iv.getAggregateChildKindSet() & type) != 0) {
                while (node$iv$iv$iv != null) {
                    if ((node$iv$iv$iv.getKindSet() & type) != 0) {
                        Modifier.Node it$iv$iv = node$iv$iv$iv;
                        Object stack$iv$iv$iv = null;
                        Modifier.Node this_$iv$iv$iv$iv = it$iv$iv;
                        while (this_$iv$iv$iv$iv != null) {
                            int i10 = count$iv$iv$iv2;
                            Intrinsics.reifiedOperationMarker(3, "T");
                            if (this_$iv$iv$iv$iv instanceof Object) {
                                Modifier.Node node = this_$iv$iv$iv$iv;
                                if (result$iv2 == null) {
                                    Object result$iv3 = new ArrayList();
                                    result$iv2 = (List) result$iv3;
                                }
                                $this$ancestors_u2d64DMado$iv3 = $this$ancestors_u2d64DMado$iv4;
                                ((List) result$iv2).add(node);
                                i7 = i9;
                            } else {
                                $this$ancestors_u2d64DMado$iv3 = $this$ancestors_u2d64DMado$iv4;
                                if (((this_$iv$iv$iv$iv.getKindSet() & type) != 0) && (this_$iv$iv$iv$iv instanceof DelegatingNode)) {
                                    int count$iv$iv$iv3 = 0;
                                    DelegatingNode this_$iv$iv$iv$iv2 = (DelegatingNode) this_$iv$iv$iv$iv;
                                    Modifier.Node node$iv$iv$iv$iv = this_$iv$iv$iv$iv2.getDelegate();
                                    while (node$iv$iv$iv$iv != null) {
                                        DelegatingNode this_$iv$iv$iv$iv3 = this_$iv$iv$iv$iv2;
                                        Modifier.Node next$iv$iv$iv = node$iv$iv$iv$iv;
                                        if ((next$iv$iv$iv.getKindSet() & type) != 0) {
                                            count$iv$iv$iv3++;
                                            i8 = i9;
                                            if (count$iv$iv$iv3 == 1) {
                                                this_$iv$iv$iv$iv = next$iv$iv$iv;
                                                result$iv = result$iv2;
                                            } else {
                                                Object mutableVector = (MutableVector) stack$iv$iv$iv;
                                                if (mutableVector == null) {
                                                    count$iv$iv$iv = count$iv$iv$iv3;
                                                    result$iv = result$iv2;
                                                    mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                                } else {
                                                    count$iv$iv$iv = count$iv$iv$iv3;
                                                    result$iv = result$iv2;
                                                }
                                                stack$iv$iv$iv = mutableVector;
                                                Modifier.Node theNode$iv$iv$iv = this_$iv$iv$iv$iv;
                                                if (theNode$iv$iv$iv != null) {
                                                    MutableVector mutableVector2 = (MutableVector) stack$iv$iv$iv;
                                                    if (mutableVector2 != null) {
                                                        mutableVector2.add(theNode$iv$iv$iv);
                                                    }
                                                    this_$iv$iv$iv$iv = null;
                                                }
                                                MutableVector mutableVector3 = (MutableVector) stack$iv$iv$iv;
                                                if (mutableVector3 != null) {
                                                    mutableVector3.add(next$iv$iv$iv);
                                                }
                                                count$iv$iv$iv3 = count$iv$iv$iv;
                                            }
                                        } else {
                                            i8 = i9;
                                            result$iv = result$iv2;
                                        }
                                        node$iv$iv$iv$iv = node$iv$iv$iv$iv.getChild();
                                        this_$iv$iv$iv$iv2 = this_$iv$iv$iv$iv3;
                                        i9 = i8;
                                        result$iv2 = result$iv;
                                    }
                                    i7 = i9;
                                    Object result$iv4 = result$iv2;
                                    if (count$iv$iv$iv3 == 1) {
                                        count$iv$iv$iv2 = i10;
                                        $this$ancestors_u2d64DMado$iv4 = $this$ancestors_u2d64DMado$iv3;
                                        i9 = i7;
                                        result$iv2 = result$iv4;
                                    } else {
                                        result$iv2 = result$iv4;
                                    }
                                } else {
                                    i7 = i9;
                                    result$iv2 = result$iv2;
                                }
                            }
                            this_$iv$iv$iv$iv = DelegatableNodeKt.pop((MutableVector) stack$iv$iv$iv);
                            count$iv$iv$iv2 = i10;
                            $this$ancestors_u2d64DMado$iv4 = $this$ancestors_u2d64DMado$iv3;
                            i9 = i7;
                        }
                        i5 = count$iv$iv$iv2;
                        $this$ancestors_u2d64DMado$iv2 = $this$ancestors_u2d64DMado$iv4;
                        i6 = i9;
                    } else {
                        i5 = count$iv$iv$iv2;
                        $this$ancestors_u2d64DMado$iv2 = $this$ancestors_u2d64DMado$iv4;
                        i6 = i9;
                    }
                    node$iv$iv$iv = node$iv$iv$iv.getParent();
                    count$iv$iv$iv2 = i5;
                    $this$ancestors_u2d64DMado$iv4 = $this$ancestors_u2d64DMado$iv2;
                    i9 = i6;
                }
                i3 = count$iv$iv$iv2;
                $this$ancestors_u2d64DMado$iv = $this$ancestors_u2d64DMado$iv4;
                i4 = i9;
            } else {
                i3 = count$iv$iv$iv2;
                $this$ancestors_u2d64DMado$iv = $this$ancestors_u2d64DMado$iv4;
                i4 = i9;
            }
            layout$iv$iv$iv = layout$iv$iv$iv.getParent$ui_release();
            node$iv$iv$iv = (layout$iv$iv$iv == null || (nodes = layout$iv$iv$iv.getNodes()) == null) ? null : nodes.getTail();
            count$iv$iv$iv2 = i3;
            $this$ancestors_u2d64DMado$iv4 = $this$ancestors_u2d64DMado$iv;
            i9 = i4;
        }
        List ancestors3 = (List) result$iv2;
        if (ancestors3 != null && ancestors3.size() - 1 >= 0) {
            do {
                int index$iv = size;
                size--;
                Object item$iv = ancestors3.get(index$iv);
                function13.invoke(item$iv);
            } while (size >= 0);
        }
        Modifier.Node $this$dispatchForKind_u2d6rFNWt0$iv5 = $this$traverseAncestorsIncludingSelf_u2dQFhIj7k.getNode();
        Object stack$iv = null;
        Modifier.Node node$iv = $this$dispatchForKind_u2d6rFNWt0$iv5;
        while (node$iv != null) {
            Intrinsics.reifiedOperationMarker(3, "T");
            if (node$iv instanceof Object) {
                function13.invoke(node$iv);
                ancestors = ancestors3;
                $this$dispatchForKind_u2d6rFNWt0$iv3 = $this$dispatchForKind_u2d6rFNWt0$iv5;
            } else {
                Modifier.Node this_$iv$iv = node$iv;
                if (((this_$iv$iv.getKindSet() & type) != 0) && (node$iv instanceof DelegatingNode)) {
                    int count$iv = 0;
                    DelegatingNode this_$iv$iv2 = (DelegatingNode) node$iv;
                    Modifier.Node node$iv$iv = this_$iv$iv2.getDelegate();
                    while (node$iv$iv != null) {
                        Modifier.Node next$iv = node$iv$iv;
                        if ((next$iv.getKindSet() & type) != 0) {
                            count$iv++;
                            if (count$iv == 1) {
                                node$iv = next$iv;
                                ancestors2 = ancestors3;
                                $this$dispatchForKind_u2d6rFNWt0$iv4 = $this$dispatchForKind_u2d6rFNWt0$iv5;
                            } else {
                                Object obj = (MutableVector) stack$iv;
                                if (obj == null) {
                                    ancestors2 = ancestors3;
                                    $this$dispatchForKind_u2d6rFNWt0$iv4 = $this$dispatchForKind_u2d6rFNWt0$iv5;
                                    Object mutableVector4 = new MutableVector(new Modifier.Node[16], 0);
                                    obj = mutableVector4;
                                } else {
                                    ancestors2 = ancestors3;
                                    $this$dispatchForKind_u2d6rFNWt0$iv4 = $this$dispatchForKind_u2d6rFNWt0$iv5;
                                }
                                stack$iv = obj;
                                Modifier.Node theNode$iv = node$iv;
                                if (theNode$iv != null) {
                                    MutableVector mutableVector5 = (MutableVector) stack$iv;
                                    if (mutableVector5 != null) {
                                        mutableVector5.add(theNode$iv);
                                    }
                                    node$iv = null;
                                }
                                MutableVector mutableVector6 = (MutableVector) stack$iv;
                                if (mutableVector6 != null) {
                                    mutableVector6.add(next$iv);
                                }
                            }
                        } else {
                            ancestors2 = ancestors3;
                            $this$dispatchForKind_u2d6rFNWt0$iv4 = $this$dispatchForKind_u2d6rFNWt0$iv5;
                        }
                        node$iv$iv = node$iv$iv.getChild();
                        ancestors3 = ancestors2;
                        $this$dispatchForKind_u2d6rFNWt0$iv5 = $this$dispatchForKind_u2d6rFNWt0$iv4;
                    }
                    ancestors = ancestors3;
                    $this$dispatchForKind_u2d6rFNWt0$iv3 = $this$dispatchForKind_u2d6rFNWt0$iv5;
                    if (count$iv == 1) {
                        function13 = function1;
                        ancestors3 = ancestors;
                        $this$dispatchForKind_u2d6rFNWt0$iv5 = $this$dispatchForKind_u2d6rFNWt0$iv3;
                    }
                } else {
                    ancestors = ancestors3;
                    $this$dispatchForKind_u2d6rFNWt0$iv3 = $this$dispatchForKind_u2d6rFNWt0$iv5;
                }
            }
            node$iv = DelegatableNodeKt.pop((MutableVector) stack$iv);
            function13 = function1;
            ancestors3 = ancestors;
            $this$dispatchForKind_u2d6rFNWt0$iv5 = $this$dispatchForKind_u2d6rFNWt0$iv3;
        }
        List ancestors4 = ancestors3;
        function0.invoke();
        Modifier.Node $this$dispatchForKind_u2d6rFNWt0$iv6 = $this$traverseAncestorsIncludingSelf_u2dQFhIj7k.getNode();
        int i11 = 0;
        Object stack$iv2 = null;
        Modifier.Node node$iv2 = $this$dispatchForKind_u2d6rFNWt0$iv6;
        while (node$iv2 != null) {
            Intrinsics.reifiedOperationMarker(3, "T");
            if (node$iv2 instanceof Object) {
                function12.invoke(node$iv2);
                $this$dispatchForKind_u2d6rFNWt0$iv = $this$dispatchForKind_u2d6rFNWt0$iv6;
                i = i11;
            } else {
                Modifier.Node this_$iv$iv3 = node$iv2;
                if (((this_$iv$iv3.getKindSet() & type) != 0) && (node$iv2 instanceof DelegatingNode)) {
                    int count$iv2 = 0;
                    DelegatingNode this_$iv$iv4 = (DelegatingNode) node$iv2;
                    Modifier.Node node$iv$iv2 = this_$iv$iv4.getDelegate();
                    while (node$iv$iv2 != null) {
                        Modifier.Node next$iv2 = node$iv$iv2;
                        if ((next$iv2.getKindSet() & type) != 0) {
                            count$iv2++;
                            if (count$iv2 == 1) {
                                node$iv2 = next$iv2;
                                $this$dispatchForKind_u2d6rFNWt0$iv2 = $this$dispatchForKind_u2d6rFNWt0$iv6;
                                i2 = i11;
                            } else {
                                Object obj2 = (MutableVector) stack$iv2;
                                if (obj2 == null) {
                                    $this$dispatchForKind_u2d6rFNWt0$iv2 = $this$dispatchForKind_u2d6rFNWt0$iv6;
                                    i2 = i11;
                                    Object mutableVector7 = new MutableVector(new Modifier.Node[16], 0);
                                    obj2 = mutableVector7;
                                } else {
                                    $this$dispatchForKind_u2d6rFNWt0$iv2 = $this$dispatchForKind_u2d6rFNWt0$iv6;
                                    i2 = i11;
                                }
                                stack$iv2 = obj2;
                                Modifier.Node theNode$iv2 = node$iv2;
                                if (theNode$iv2 != null) {
                                    MutableVector mutableVector8 = (MutableVector) stack$iv2;
                                    if (mutableVector8 != null) {
                                        mutableVector8.add(theNode$iv2);
                                    }
                                    node$iv2 = null;
                                }
                                MutableVector mutableVector9 = (MutableVector) stack$iv2;
                                if (mutableVector9 != null) {
                                    mutableVector9.add(next$iv2);
                                }
                            }
                        } else {
                            $this$dispatchForKind_u2d6rFNWt0$iv2 = $this$dispatchForKind_u2d6rFNWt0$iv6;
                            i2 = i11;
                        }
                        node$iv$iv2 = node$iv$iv2.getChild();
                        $this$dispatchForKind_u2d6rFNWt0$iv6 = $this$dispatchForKind_u2d6rFNWt0$iv2;
                        i11 = i2;
                    }
                    $this$dispatchForKind_u2d6rFNWt0$iv = $this$dispatchForKind_u2d6rFNWt0$iv6;
                    i = i11;
                    if (count$iv2 == 1) {
                        $this$dispatchForKind_u2d6rFNWt0$iv6 = $this$dispatchForKind_u2d6rFNWt0$iv;
                        i11 = i;
                    }
                } else {
                    $this$dispatchForKind_u2d6rFNWt0$iv = $this$dispatchForKind_u2d6rFNWt0$iv6;
                    i = i11;
                }
            }
            node$iv2 = DelegatableNodeKt.pop((MutableVector) stack$iv2);
            $this$dispatchForKind_u2d6rFNWt0$iv6 = $this$dispatchForKind_u2d6rFNWt0$iv;
            i11 = i;
        }
        if (ancestors4 != null) {
            int size2 = ancestors4.size();
            for (int index$iv2 = 0; index$iv2 < size2; index$iv2++) {
                Object item$iv2 = ancestors4.get(index$iv2);
                function12.invoke(item$iv2);
            }
        }
    }

    /* renamed from: nearestAncestorIncludingSelf-64DMado, reason: not valid java name */
    private final /* synthetic */ <T> T m4054nearestAncestorIncludingSelf64DMado(DelegatableNode delegatableNode, int i) {
        int i2;
        boolean z;
        DelegatableNode delegatableNode2;
        int i3;
        int i4;
        Modifier.Node node;
        NodeChain nodes;
        int i5;
        boolean z2;
        DelegatableNode delegatableNode3;
        int i6;
        int i7;
        DelegatableNode delegatableNode4;
        int i8;
        int i9;
        DelegatableNode delegatableNode5;
        int i10;
        int i11;
        int i12;
        int i13 = 0;
        boolean z3 = true;
        DelegatableNode delegatableNode6 = delegatableNode;
        int i14 = 0;
        int i15 = i;
        if (!delegatableNode6.getNode().getIsAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
        }
        Modifier.Node node2 = delegatableNode6.getNode();
        LayoutNode layoutNodeRequireLayoutNode = DelegatableNodeKt.requireLayoutNode(delegatableNode6);
        while (layoutNodeRequireLayoutNode != null) {
            if ((layoutNodeRequireLayoutNode.getNodes().getHead().getAggregateChildKindSet() & i15) != 0) {
                while (node2 != null) {
                    if ((node2.getKindSet() & i15) != 0) {
                        Object obj = null;
                        Modifier.Node nodePop = node2;
                        while (nodePop != null) {
                            int i16 = i13;
                            boolean z4 = z3;
                            Intrinsics.reifiedOperationMarker(3, "T");
                            if (nodePop instanceof Object) {
                                return (T) nodePop;
                            }
                            if (((nodePop.getKindSet() & i) != 0 ? 1 : 0) == 0 || !(nodePop instanceof DelegatingNode)) {
                                delegatableNode4 = delegatableNode6;
                                i8 = i14;
                                i9 = i15;
                                nodePop = DelegatableNodeKt.pop((MutableVector) obj);
                                i13 = i16;
                                z3 = z4;
                                delegatableNode6 = delegatableNode4;
                                i14 = i8;
                                i15 = i9;
                            } else {
                                int i17 = 0;
                                Modifier.Node delegate = ((DelegatingNode) nodePop).getDelegate();
                                while (delegate != null) {
                                    Modifier.Node node3 = delegate;
                                    if ((node3.getKindSet() & i) != 0) {
                                        i17++;
                                        delegatableNode5 = delegatableNode6;
                                        if (i17 == 1) {
                                            nodePop = node3;
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
                                            Modifier.Node node4 = nodePop;
                                            if (node4 != null) {
                                                MutableVector mutableVector2 = (MutableVector) obj;
                                                if (mutableVector2 != null) {
                                                    mutableVector2.add(node4);
                                                }
                                                nodePop = null;
                                            }
                                            MutableVector mutableVector3 = (MutableVector) obj;
                                            if (mutableVector3 != null) {
                                                mutableVector3.add(node3);
                                            }
                                            i17 = i12;
                                        }
                                    } else {
                                        delegatableNode5 = delegatableNode6;
                                        i10 = i14;
                                        i11 = i15;
                                    }
                                    delegate = delegate.getChild();
                                    delegatableNode6 = delegatableNode5;
                                    i14 = i10;
                                    i15 = i11;
                                }
                                delegatableNode4 = delegatableNode6;
                                i8 = i14;
                                i9 = i15;
                                if (i17 == 1) {
                                    i13 = i16;
                                    z3 = z4;
                                    delegatableNode6 = delegatableNode4;
                                    i14 = i8;
                                    i15 = i9;
                                } else {
                                    nodePop = DelegatableNodeKt.pop((MutableVector) obj);
                                    i13 = i16;
                                    z3 = z4;
                                    delegatableNode6 = delegatableNode4;
                                    i14 = i8;
                                    i15 = i9;
                                }
                            }
                        }
                        i5 = i13;
                        z2 = z3;
                        delegatableNode3 = delegatableNode6;
                        i6 = i14;
                        i7 = i15;
                    } else {
                        i5 = i13;
                        z2 = z3;
                        delegatableNode3 = delegatableNode6;
                        i6 = i14;
                        i7 = i15;
                    }
                    node2 = node2.getParent();
                    i13 = i5;
                    z3 = z2;
                    delegatableNode6 = delegatableNode3;
                    i14 = i6;
                    i15 = i7;
                }
                i2 = i13;
                z = z3;
                delegatableNode2 = delegatableNode6;
                i3 = i14;
                i4 = i15;
                node = null;
            } else {
                i2 = i13;
                z = z3;
                delegatableNode2 = delegatableNode6;
                i3 = i14;
                i4 = i15;
                node = null;
            }
            layoutNodeRequireLayoutNode = layoutNodeRequireLayoutNode.getParent$ui_release();
            node2 = (layoutNodeRequireLayoutNode == null || (nodes = layoutNodeRequireLayoutNode.getNodes()) == null) ? node : nodes.getTail();
            i13 = i2;
            z3 = z;
            delegatableNode6 = delegatableNode2;
            i14 = i3;
            i15 = i4;
        }
        return null;
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public Rect getFocusRect() {
        FocusTargetNode focusTargetNodeFindFocusTargetNode = findFocusTargetNode();
        if (focusTargetNodeFindFocusTargetNode != null) {
            return FocusTraversalKt.focusRect(focusTargetNodeFindFocusTargetNode);
        }
        return null;
    }

    private final FocusTargetNode findFocusTargetNode() {
        return FocusTraversalKt.findActiveFocusNode(this.rootFocusNode);
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public FocusState getRootState() {
        return this.rootFocusNode.getFocusState();
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public MutableObjectList<FocusListener> getListeners() {
        return this.listeners;
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public FocusTargetNode getActiveFocusTargetNode() {
        return this.activeFocusTargetNode;
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public void setActiveFocusTargetNode(FocusTargetNode value) {
        FocusTargetNode previousValue = this.activeFocusTargetNode;
        this.activeFocusTargetNode = value;
        if (value == null || previousValue != value) {
            setFocusCaptured(false);
        }
        if (ComposeUiFlags.isSemanticAutofillEnabled) {
            ObjectList this_$iv = getListeners();
            Object[] content$iv = this_$iv.content;
            int i = this_$iv._size;
            for (int i$iv = 0; i$iv < i; i$iv++) {
                FocusListener it = (FocusListener) content$iv[i$iv];
                it.onFocusChanged(previousValue, value);
            }
        }
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    /* renamed from: isFocusCaptured, reason: from getter */
    public boolean getIsFocusCaptured() {
        return this.isFocusCaptured;
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public void setFocusCaptured(boolean value) {
        boolean value$iv = (value && getActiveFocusTargetNode() == null) ? false : true;
        if (!value$iv) {
            InlineClassHelperKt.throwIllegalArgumentException("Cannot capture focus when the active focus target node is unset");
        }
        this.isFocusCaptured = value;
    }

    private final Modifier.Node lastLocalKeyInputNode(DelegatableNode $this$lastLocalKeyInputNode) {
        Modifier.Node node = null;
        int mask$iv = NodeKind.m6012constructorimpl(1024) | NodeKind.m6012constructorimpl(8192);
        boolean value$iv$iv$iv = $this$lastLocalKeyInputNode.getNode().getIsAttached();
        if (!value$iv$iv$iv) {
            InlineClassHelperKt.throwIllegalStateException("visitLocalDescendants called on an unattached node");
        }
        Modifier.Node self$iv$iv = $this$lastLocalKeyInputNode.getNode();
        if ((self$iv$iv.getAggregateChildKindSet() & mask$iv) != 0) {
            for (Modifier.Node next$iv$iv = self$iv$iv.getChild(); next$iv$iv != null; next$iv$iv = next$iv$iv.getChild()) {
                if ((next$iv$iv.getKindSet() & mask$iv) != 0) {
                    Modifier.Node modifierNode = next$iv$iv;
                    if ((modifierNode.getKindSet() & NodeKind.m6012constructorimpl(1024)) != 0) {
                        return node;
                    }
                    node = modifierNode;
                }
            }
        }
        return node;
    }

    /* renamed from: validateKeyEvent-ZmokQxo, reason: not valid java name */
    private final boolean m4056validateKeyEventZmokQxo(KeyEvent keyEvent) {
        long keyCode = KeyEvent_androidKt.m5481getKeyZmokQxo(keyEvent);
        int iM5482getTypeZmokQxo = KeyEvent_androidKt.m5482getTypeZmokQxo(keyEvent);
        if (KeyEventType.m5474equalsimpl0(iM5482getTypeZmokQxo, KeyEventType.INSTANCE.m5478getKeyDownCS__XNY())) {
            MutableLongSet it = this.keysCurrentlyDown;
            if (it == null) {
                it = new MutableLongSet(3);
                this.keysCurrentlyDown = it;
            }
            it.plusAssign(keyCode);
        } else if (KeyEventType.m5474equalsimpl0(iM5482getTypeZmokQxo, KeyEventType.INSTANCE.m5479getKeyUpCS__XNY())) {
            MutableLongSet mutableLongSet = this.keysCurrentlyDown;
            if (!(mutableLongSet != null && mutableLongSet.contains(keyCode))) {
                return false;
            }
            MutableLongSet mutableLongSet2 = this.keysCurrentlyDown;
            if (mutableLongSet2 != null) {
                mutableLongSet2.remove(keyCode);
            }
        }
        return true;
    }
}
