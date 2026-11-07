package com.pymcl.runtime.control;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.text.Editable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.autofill.HintConstants;
import com.pymcl.runtime.input.InputSettings;
import com.pymcl.runtime.input.InputSink;
import com.pymcl.runtime.input.Keys;
import com.pymcl.runtime.settings.SettingsProtocol;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.swing.JTextArea;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;

/* compiled from: ControlOverlay.kt */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u0000 K2\u00020\u00012\u00020\u0002:\u0001KB;\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f¢\u0006\u0004\b\u000f\u0010\u0010J\u000e\u0010&\u001a\u00020\u000e2\u0006\u0010'\u001a\u00020(J\u000e\u0010)\u001a\u00020\u000e2\u0006\u0010*\u001a\u00020\u0018J\u000e\u0010+\u001a\u00020\u000e2\u0006\u0010,\u001a\u00020\u0018J\u0006\u0010-\u001a\u00020\u000eJ\u0010\u0010.\u001a\u00020\u000e2\u0006\u0010,\u001a\u00020/H\u0002J\b\u00100\u001a\u00020\u000eH\u0002J\b\u00101\u001a\u00020\u000eH\u0002J\u001d\u00102\u001a\u00020\u000e2\u0012\u00103\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u000e0\fH\u0082\bJ\u0018\u00104\u001a\u00020\u000e2\u0006\u00105\u001a\u0002062\u0006\u00107\u001a\u000206H\u0014J0\u00108\u001a\u00020\u000e2\u0006\u00109\u001a\u00020\u00182\u0006\u0010:\u001a\u0002062\u0006\u0010;\u001a\u0002062\u0006\u0010<\u001a\u0002062\u0006\u0010=\u001a\u000206H\u0014J\u0010\u0010>\u001a\u00020\u000e2\u0006\u0010?\u001a\u00020\rH\u0016J\b\u0010@\u001a\u00020AH\u0016J\b\u0010B\u001a\u00020CH\u0016J\u0010\u0010D\u001a\u00020\u000e2\u0006\u0010E\u001a\u00020\u001eH\u0016J\u0010\u0010F\u001a\u00020\u000e2\u0006\u0010E\u001a\u00020\u001eH\u0016J\u0010\u0010G\u001a\u00020\u000e2\u0006\u0010H\u001a\u00020\u001eH\u0002J\u0010\u0010I\u001a\u00020\u000e2\u0006\u0010J\u001a\u00020(H\u0002R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0014@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u001e\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u0018@RX\u0096\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u000e\u0010\u001c\u001a\u00020\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020 X\u0082\u0004¢\u0006\u0002\n\u0000R(\u0010!\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u000e\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%Ê\u0001\u0010\bM\u0012\f\b\u0013\u0012\b\b\fJ\u0004\b\b(N¨\u0006L"}, d2 = {"Lcom/pymcl/runtime/control/ControlOverlay;", "Landroid/view/ViewGroup;", "Lcom/pymcl/runtime/control/ControlHost;", "context", "Landroid/content/Context;", "sink", "Lcom/pymcl/runtime/input/InputSink;", "store", "Lcom/pymcl/runtime/control/ControlLayoutStore;", "settings", "Lcom/pymcl/runtime/input/InputSettings;", "actionHandler", "Lkotlin/Function1;", "Lcom/pymcl/runtime/input/Keys$Action;", "", "<init>", "(Landroid/content/Context;Lcom/pymcl/runtime/input/InputSink;Lcom/pymcl/runtime/control/ControlLayoutStore;Lcom/pymcl/runtime/input/InputSettings;Lkotlin/jvm/functions/Function1;)V", "getSink", "()Lcom/pymcl/runtime/input/InputSink;", "value", "Lcom/pymcl/runtime/control/ControlLayout;", "layout", "getLayout", "()Lcom/pymcl/runtime/control/ControlLayout;", "", "editing", "getEditing", "()Z", "grabbed", "selectedView", "Lcom/pymcl/runtime/control/ControlElementView;", "editBar", "Landroid/widget/LinearLayout;", "onLayoutChanged", "getOnLayoutChanged", "()Lkotlin/jvm/functions/Function1;", "setOnLayoutChanged", "(Lkotlin/jvm/functions/Function1;)V", "loadLayout", HintConstants.AUTOFILL_HINT_NAME, "", "setGrabbed", "g", "setEditing", "e", "releaseAll", "add", "Lcom/pymcl/runtime/control/ControlElement;", "rebuild", "refreshVisibility", "forEachElement", "f", "onMeasure", "wSpec", "", "hSpec", "onLayout", "changed", "l", "t", "r", "b", "onAction", "action", "lookSensitivity", "", "longPressMs", "", "onElementEdited", "view", "onElementSelected", "editProperties", SettingsProtocol.EXTRA_VALUE, "toast", "s", "Companion", "PyMCL-Android:runtime_debug", "Landroid/annotation/SuppressLint;", "ViewConstructor"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ControlOverlay extends ViewGroup implements ControlHost {
    public static final Companion Companion = new Companion(null);
    private static final FrameLayout.LayoutParams MATCH = new FrameLayout.LayoutParams(-1, -1);
    private final Function1<Keys.Action, Unit> actionHandler;
    private final LinearLayout editBar;
    private boolean editing;
    private boolean grabbed;
    private ControlLayout layout;
    private Function1<? super ControlLayout, Unit> onLayoutChanged;
    private ControlElementView selectedView;
    private final InputSettings settings;
    private final InputSink sink;
    private final ControlLayoutStore store;

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v1 ??, still in use, count: 1, list:
          (r3v1 ?? I:int) from 0x0048: INVOKE 
          (r0v8 ?? I:android.widget.LinearLayout A[D('$this$editBar_u24lambda_u240' android.widget.LinearLayout)])
          (r3v1 ?? I:int)
         VIRTUAL call: android.widget.LinearLayout.setBackgroundColor(int):void A[MD:(int):void (s)]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1119)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:110)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    public ControlOverlay(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v1 ??, still in use, count: 1, list:
          (r3v1 ?? I:int) from 0x0048: INVOKE 
          (r0v8 ?? I:android.widget.LinearLayout A[D('$this$editBar_u24lambda_u240' android.widget.LinearLayout)])
          (r3v1 ?? I:int)
         VIRTUAL call: android.widget.LinearLayout.setBackgroundColor(int):void A[MD:(int):void (s)]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1119)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:110)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r6v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:224)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:169)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:405)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:186)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:284)
        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:153)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:176)
        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:632)
        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:297)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:286)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:270)
        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:161)
        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:103)
        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
        	at jadx.core.ProcessClass.process(ProcessClass.java:79)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:403)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:391)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:341)
        */

    @Override // com.pymcl.runtime.control.ControlHost
    public InputSink getSink() {
        return this.sink;
    }

    public final ControlLayout getLayout() {
        return this.layout;
    }

    @Override // com.pymcl.runtime.control.ControlHost
    public boolean getEditing() {
        return this.editing;
    }

    public final Function1<ControlLayout, Unit> getOnLayoutChanged() {
        return this.onLayoutChanged;
    }

    public final void setOnLayoutChanged(Function1<? super ControlLayout, Unit> function1) {
        this.onLayoutChanged = function1;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.widget.LinearLayout, com.github.caciocavallosilano.cacio.peer.CacioTextAreaPeer] */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.view.View, java.lang.String] */
    private static final void _init_$btn(ControlOverlay this$0, Context $context, String t, final Function0<Unit> function0) {
        ?? r0 = this$0.editBar;
        Button $this$btn_u24lambda_u240 = new Button($context);
        $this$btn_u24lambda_u240.setText(t);
        $this$btn_u24lambda_u240.setTextSize(12.0f);
        $this$btn_u24lambda_u240.setOnClickListener(new View.OnClickListener() { // from class: com.pymcl.runtime.control.ControlOverlay$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                function0.invoke();
            }
        });
        r0.setText($this$btn_u24lambda_u240);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$1(ControlOverlay this$0) {
        this$0.add(new ControlElement(null, ElementType.BUTTON, "新", 0.45f, 0.45f, 0.0f, 0.0f, CollectionsKt.mutableListOf("KEY_SPACE"), false, 0.0f, 0.0f, null, null, 0.0f, 16225, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$2(ControlOverlay this$0) {
        this$0.add(new ControlElement(null, ElementType.DPAD, null, 0.4f, 0.4f, 0.2f, 0.35f, CollectionsKt.mutableListOf("KEY_W", "KEY_S", "KEY_A", "KEY_D"), false, 0.0f, 0.0f, null, null, 0.0f, 16133, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$3(ControlOverlay this$0) {
        this$0.add(new ControlElement(null, ElementType.JOYSTICK, null, 0.4f, 0.4f, 0.2f, 0.35f, CollectionsKt.mutableListOf("KEY_W", "KEY_S", "KEY_A", "KEY_D"), false, 0.0f, 0.0f, null, "KEY_LEFTCTRL", 0.0f, 12037, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$4(ControlOverlay this$0) {
        this$0.add(new ControlElement(null, ElementType.LOOK_AREA, null, 0.5f, 0.3f, 0.3f, 0.4f, null, false, 0.3f, 0.0f, null, null, 0.0f, 15749, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$5(ControlOverlay this$0) {
        ControlElementView it = this$0.selectedView;
        if (it != null) {
            this$0.editProperties(it);
        } else {
            this$0.toast("先点选一个按键");
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$6(ControlOverlay this$0) {
        ControlElementView it = this$0.selectedView;
        if (it != null) {
            this$0.layout.getElements().remove(it.getElement());
            this$0.rebuild();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$7(ControlOverlay this$0) {
        ControlOverlay$7$1 controlOverlay$7$1 = DefaultLayouts.INSTANCE.getBuiltins().get(this$0.layout.getName());
        if (controlOverlay$7$1 == null) {
            controlOverlay$7$1 = new ControlOverlay$7$1(DefaultLayouts.INSTANCE);
        }
        ControlLayout it = controlOverlay$7$1.invoke();
        it.setName(this$0.layout.getName());
        this$0.layout = it;
        this$0.rebuild();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$8(ControlOverlay this$0) {
        this$0.store.save(this$0.layout);
        this$0.toast("已保存布局 " + this$0.layout.getName());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$9(ControlOverlay this$0) {
        this$0.store.save(this$0.layout);
        this$0.setEditing(false);
        return Unit.INSTANCE;
    }

    public final void loadLayout(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.layout = this.store.load(name);
        this.settings.setLayoutName(this.layout.getName());
        rebuild();
    }

    public final void setGrabbed(boolean g) {
        this.grabbed = g;
        refreshVisibility();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.widget.LinearLayout, com.github.caciocavallosilano.cacio.peer.CacioTextAreaPeer, int] */
    public final void setEditing(boolean e) {
        Function1<? super ControlLayout, Unit> function1;
        this.editing = e;
        ?? r0 = this.editBar;
        r0.getPreferredSize(e ? 0 : 8, r0);
        ControlElementView controlElementView = this.selectedView;
        if (controlElementView != null) {
            controlElementView.setEditSelected(false);
        }
        this.selectedView = null;
        if (e) {
            int childCount = getChildCount();
            for (int i$iv = 0; i$iv < childCount; i$iv++) {
                View childAt = getChildAt(i$iv);
                ControlElementView it = childAt instanceof ControlElementView ? (ControlElementView) childAt : null;
                if (it != null) {
                    it.releaseAll();
                }
            }
        }
        refreshVisibility();
        int childCount2 = getChildCount();
        for (int i$iv2 = 0; i$iv2 < childCount2; i$iv2++) {
            View childAt2 = getChildAt(i$iv2);
            ControlElementView it2 = childAt2 instanceof ControlElementView ? (ControlElementView) childAt2 : null;
            if (it2 != null) {
                it2.invalidate();
            }
        }
        if (e || (function1 = this.onLayoutChanged) == null) {
            return;
        }
        function1.invoke(this.layout);
    }

    public final void releaseAll() {
        int childCount = getChildCount();
        for (int i$iv = 0; i$iv < childCount; i$iv++) {
            View childAt = getChildAt(i$iv);
            ControlElementView it = childAt instanceof ControlElementView ? (ControlElementView) childAt : null;
            if (it != null) {
                it.releaseAll();
            }
        }
    }

    private final void add(ControlElement e) {
        this.layout.getElements().add(e);
        rebuild();
    }

    private final void rebuild() {
        int i$iv = 0;
        int childCount = getChildCount();
        while (true) {
            if (i$iv >= childCount) {
                break;
            }
            View childAt = getChildAt(i$iv);
            ControlElementView it = childAt instanceof ControlElementView ? (ControlElementView) childAt : null;
            if (it != null) {
                it.releaseAll();
            }
            i$iv++;
        }
        int i = getChildCount();
        while (true) {
            i--;
            if (-1 >= i) {
                break;
            } else if (getChildAt(i) != this.editBar) {
                removeViewAt(i);
            }
        }
        Iterable $this$forEach$iv = this.layout.getElements();
        for (Object element$iv : $this$forEach$iv) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            addView(ControlViewsKt.createElementView(context, (ControlElement) element$iv, this), getChildCount() - 1);
        }
        this.selectedView = null;
        refreshVisibility();
        requestLayout();
    }

    private final void refreshVisibility() {
        int childCount = getChildCount();
        for (int i$iv = 0; i$iv < childCount; i$iv++) {
            View childAt = getChildAt(i$iv);
            ControlElementView v = childAt instanceof ControlElementView ? (ControlElementView) childAt : null;
            if (v != null) {
                Boolean want = v.getElement().getShowWhenGrabbed();
                v.setVisibility((getEditing() || want == null || Intrinsics.areEqual(want, Boolean.valueOf(this.grabbed))) ? 0 : 8);
            }
        }
    }

    private final void forEachElement(Function1<? super ControlElementView, Unit> f) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            ControlElementView controlElementView = childAt instanceof ControlElementView ? (ControlElementView) childAt : null;
            if (controlElementView != null) {
                f.invoke(controlElementView);
            }
        }
    }

    /*  JADX ERROR: IllegalArgumentException in pass: ConstructorVisitor
        java.lang.IllegalArgumentException: Illegal Capacity: -1
        	at java.base/java.util.ArrayList.<init>(ArrayList.java:161)
        	at jadx.core.dex.nodes.InsnNode.<init>(InsnNode.java:36)
        	at jadx.core.dex.instructions.BaseInvokeNode.<init>(BaseInvokeNode.java:11)
        	at jadx.core.dex.instructions.mods.ConstructorInsn.<init>(ConstructorInsn.java:32)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:76)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    @Override // android.view.View
    protected void onMeasure(
    /*  JADX ERROR: IllegalArgumentException in pass: ConstructorVisitor
        java.lang.IllegalArgumentException: Illegal Capacity: -1
        	at java.base/java.util.ArrayList.<init>(ArrayList.java:161)
        	at jadx.core.dex.nodes.InsnNode.<init>(InsnNode.java:36)
        	at jadx.core.dex.instructions.BaseInvokeNode.<init>(BaseInvokeNode.java:11)
        	at jadx.core.dex.instructions.mods.ConstructorInsn.<init>(ConstructorInsn.java:32)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:76)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r14v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:224)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:169)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:405)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:186)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:284)
        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:153)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:176)
        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:632)
        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:297)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:286)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:270)
        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:161)
        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:103)
        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
        	at jadx.core.ProcessClass.process(ProcessClass.java:79)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:403)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:391)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:341)
        */

    /* JADX WARN: Type inference failed for: r5v8, types: [boolean, int] */
    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean changed, int l, int t, int r, int b) {
        int w = r - l;
        int h = b - t;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View c = getChildAt(i);
            if (c instanceof ControlElementView) {
                ?? x = (int) (((ControlElementView) c).getElement().getX() * w);
                int y = (int) (((ControlElementView) c).getElement().getY() * h);
                int measuredWidth = ((ControlElementView) c).getMeasuredWidth() + x;
                int measuredHeight = ((ControlElementView) c).getMeasuredHeight() + y;
                ((ControlElementView) c).setEnabled((boolean) x);
            } else {
                int measuredHeight2 = h - c.getMeasuredHeight();
                c.getScrollbarVisibility();
            }
        }
    }

    @Override // com.pymcl.runtime.control.ControlHost
    public void onAction(Keys.Action action) {
        Intrinsics.checkNotNullParameter(action, "action");
        if (action == Keys.Action.EDIT_LAYOUT) {
            setEditing(true);
        } else {
            this.actionHandler.invoke(action);
        }
    }

    @Override // com.pymcl.runtime.control.ControlHost
    public float lookSensitivity() {
        return this.settings.getLookSensitivity();
    }

    @Override // com.pymcl.runtime.control.ControlHost
    public long longPressMs() {
        return this.settings.getLongPressMs();
    }

    @Override // com.pymcl.runtime.control.ControlHost
    public void onElementEdited(ControlElementView view) {
        Intrinsics.checkNotNullParameter(view, "view");
    }

    @Override // com.pymcl.runtime.control.ControlHost
    public void onElementSelected(ControlElementView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ControlElementView controlElementView = this.selectedView;
        if (controlElementView != null) {
            controlElementView.setEditSelected(false);
        }
        this.selectedView = view;
        view.setEditSelected(true);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.widget.LinearLayout, com.github.caciocavallosilano.cacio.peer.CacioTextAreaPeer] */
    /* JADX WARN: Type inference failed for: r0v10, types: [android.view.View, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v12, types: [android.view.View, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v14, types: [android.view.View, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v16, types: [android.view.View, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v18, types: [android.view.View, java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v8, types: [android.widget.CheckBox, com.github.caciocavallosilano.cacio.peer.CacioComponentPeer] */
    private final void editProperties(ControlElementView v) {
        final ControlElement e = v.getElement();
        ?? linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        linearLayout.setPadding(40, 20, 40, 0);
        final EditText $this$editProperties_u24lambda_u241 = new EditText(getContext());
        $this$editProperties_u24lambda_u241.setHint("显示文字");
        $this$editProperties_u24lambda_u241.setText(e.getText());
        final EditText $this$editProperties_u24lambda_u242 = new EditText(getContext());
        $this$editProperties_u24lambda_u242.setHint("键名，逗号分隔（KEY_W, MOUSE_LEFT, @ime …）");
        $this$editProperties_u24lambda_u242.setText(CollectionsKt.joinToString$default(e.getKeys(), ", ", null, null, 0, null, null, 62, null));
        $this$editProperties_u24lambda_u242.getText();
        final ?? checkBox = new CheckBox(getContext());
        checkBox.postInitSwingComponent();
        checkBox.setChecked(e.getToggle());
        final SeekBar $this$editProperties_u24lambda_u244 = new SeekBar(getContext());
        $this$editProperties_u24lambda_u244.getFont();
        $this$editProperties_u24lambda_u244.setProgress((int) (e.getAlpha() * 100));
        linearLayout.setText($this$editProperties_u24lambda_u241);
        linearLayout.setText($this$editProperties_u24lambda_u242);
        linearLayout.setText((View) checkBox);
        TextView $this$editProperties_u24lambda_u245 = new TextView(getContext());
        $this$editProperties_u24lambda_u245.setText("不透明度");
        linearLayout.setText($this$editProperties_u24lambda_u245);
        linearLayout.setText($this$editProperties_u24lambda_u244);
        new AlertDialog.Builder(getContext()).setTitle("按键属性").setView((View) linearLayout).setPositiveButton("确定", new DialogInterface.OnClickListener() { // from class: com.pymcl.runtime.control.ControlOverlay$$ExternalSyntheticLambda0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                ControlOverlay.editProperties$lambda$6($this$editProperties_u24lambda_u242, this, e, $this$editProperties_u24lambda_u241, checkBox, $this$editProperties_u24lambda_u244, dialogInterface, i);
            }
        }).setNegativeButton("取消", (DialogInterface.OnClickListener) null).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void editProperties$lambda$6(EditText $keys, ControlOverlay this$0, ControlElement $e, EditText $text, CheckBox $toggle, SeekBar $alphaBar, DialogInterface dialogInterface, int i) {
        Editable text = $keys.getText();
        Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
        Iterable $this$map$iv = StringsKt.split$default((CharSequence) text, new char[]{','}, false, 0, 6, (Object) null);
        Collection destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10));
        for (Object item$iv$iv : $this$map$iv) {
            String it = (String) item$iv$iv;
            destination$iv$iv.add(StringsKt.trim((CharSequence) it).toString());
        }
        Iterable $this$filter$iv = (List) destination$iv$iv;
        Collection destination$iv$iv2 = new ArrayList();
        for (Object element$iv$iv : $this$filter$iv) {
            String it2 = (String) element$iv$iv;
            if (it2.length() > 0) {
                destination$iv$iv2.add(element$iv$iv);
            }
        }
        Iterable parsed = (List) destination$iv$iv2;
        Iterable $this$filterNot$iv = parsed;
        Collection destination$iv$iv3 = new ArrayList();
        for (Object element$iv$iv2 : $this$filterNot$iv) {
            String it3 = (String) element$iv$iv2;
            if (!Keys.INSTANCE.isValid(it3)) {
                destination$iv$iv3.add(element$iv$iv2);
            }
        }
        List bad = (List) destination$iv$iv3;
        if (!bad.isEmpty()) {
            this$0.toast("已忽略无效键名：" + CollectionsKt.joinToString$default(bad, null, null, null, 0, null, null, 63, null));
        }
        $e.setText($text.getText().toString());
        Iterable $this$filter$iv2 = parsed;
        Collection destination$iv$iv4 = new ArrayList();
        for (Object element$iv$iv3 : $this$filter$iv2) {
            String it4 = (String) element$iv$iv3;
            if (Keys.INSTANCE.isValid(it4)) {
                destination$iv$iv4.add(element$iv$iv3);
            }
        }
        $e.setKeys(CollectionsKt.toMutableList(destination$iv$iv4));
        $e.setToggle($toggle.isChecked());
        $e.setAlpha(RangesKt.coerceIn($alphaBar.getProgress() / 100.0f, 0.05f, 1.0f));
        this$0.rebuild();
    }

    private final void toast(String s) {
        JTextArea.getFontMetrics(getContext()).show();
    }

    /* compiled from: ControlOverlay.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/pymcl/runtime/control/ControlOverlay$Companion;", "", "<init>", "()V", "MATCH", "Landroid/widget/FrameLayout$LayoutParams;", "getMATCH", "()Landroid/widget/FrameLayout$LayoutParams;", "PyMCL-Android:runtime_debug"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final FrameLayout.LayoutParams getMATCH() {
            return ControlOverlay.MATCH;
        }
    }
}
