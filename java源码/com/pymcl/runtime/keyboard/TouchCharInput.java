package com.pymcl.runtime.keyboard;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import androidx.core.app.NotificationCompat;
import com.pymcl.runtime.input.InputSink;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TouchCharInput.kt */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\bH\u0002J\u0018\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\u0018\u0010 \u001a\u00020\b2\u0006\u0010!\u001a\u00020\u001d2\u0006\u0010\"\u001a\u00020\u001dH\u0014J\u0006\u0010#\u001a\u00020\bJ\u0006\u0010$\u001a\u00020\bJ\u0006\u0010%\u001a\u00020\bJ\b\u0010&\u001a\u00020'H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\f@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000Ê\u0001\u0010\b)\u0012\f\b\u0011\u0012\b\b\fJ\u0004\b\b(*¨\u0006("}, d2 = {"Lcom/pymcl/runtime/keyboard/TouchCharInput;", "Landroid/widget/EditText;", "context", "Landroid/content/Context;", "sink", "Lcom/pymcl/runtime/input/InputSink;", "restoreFocus", "Lkotlin/Function0;", "", "<init>", "(Landroid/content/Context;Lcom/pymcl/runtime/input/InputSink;Lkotlin/jvm/functions/Function0;)V", "noFullscreen", "", "getNoFullscreen", "()Z", "setNoFullscreen", "(Z)V", "value", "isShowing", "last", "", "muted", "onCreateInputConnection", "Landroid/view/inputmethod/InputConnection;", "outAttrs", "Landroid/view/inputmethod/EditorInfo;", "resetFiller", "onKeyPreIme", "keyCode", "", NotificationCompat.CATEGORY_EVENT, "Landroid/view/KeyEvent;", "onSelectionChanged", "selStart", "selEnd", "show", "hide", "toggle", "imm", "Landroid/view/inputmethod/InputMethodManager;", "PyMCL-Android:runtime_debug", "Landroid/annotation/SuppressLint;", "ViewConstructor"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class TouchCharInput extends EditText {
    private boolean isShowing;
    private String last;
    private boolean muted;
    private boolean noFullscreen;
    private final Function0<Unit> restoreFocus;
    private final InputSink sink;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TouchCharInput(Context context, InputSink sink, Function0<Unit> restoreFocus) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sink, "sink");
        Intrinsics.checkNotNullParameter(restoreFocus, "restoreFocus");
        this.sink = sink;
        this.restoreFocus = restoreFocus;
        this.noFullscreen = true;
        this.last = TextDiff.INSTANCE.getFILLER();
        setFocusable(true);
        setFocusableInTouchMode(true);
        setAlpha(0.0f);
        setSingleLine(true);
        setBackground(null);
        setInputType(524289);
        resetFiller();
        addTextChangedListener(new TextWatcher() { // from class: com.pymcl.runtime.keyboard.TouchCharInput.1
            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence s, int a, int b, int c) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence s, int a, int b, int c) {
            }

            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable s) {
                if (TouchCharInput.this.muted || s == null) {
                    return;
                }
                String now = s.toString();
                TextDiff.INSTANCE.apply(TouchCharInput.this.sink, TextDiff.INSTANCE.diff(TouchCharInput.this.last, now));
                TouchCharInput.this.last = now;
                if (now.length() < 2) {
                    TouchCharInput.this.resetFiller();
                }
            }
        });
        setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: com.pymcl.runtime.keyboard.TouchCharInput$$ExternalSyntheticLambda0
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                return TouchCharInput._init_$lambda$0(this.f$0, textView, i, keyEvent);
            }
        });
    }

    public final boolean getNoFullscreen() {
        return this.noFullscreen;
    }

    public final void setNoFullscreen(boolean z) {
        this.noFullscreen = z;
    }

    public final boolean isShowing() {
        return this.isShowing;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean _init_$lambda$0(TouchCharInput this$0, TextView textView, int i, KeyEvent keyEvent) {
        this$0.sink.tapKey(28);
        this$0.hide();
        return true;
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo outAttrs) {
        Intrinsics.checkNotNullParameter(outAttrs, "outAttrs");
        InputConnection ic = super.onCreateInputConnection(outAttrs);
        outAttrs.imeOptions = outAttrs.imeOptions | 6 | (this.noFullscreen ? 301989888 : 0);
        return ic;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void resetFiller() {
        this.muted = true;
        setText(TextDiff.INSTANCE.getFILLER());
        setSelection(30);
        this.last = TextDiff.INSTANCE.getFILLER();
        this.muted = false;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v2 ??, still in use, count: 1, list:
          (r0v2 ?? I:boolean) from 0x001b: RETURN (r0v2 ?? I:boolean)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:78)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    @Override // android.widget.TextView, android.view.View
    public boolean onKeyPreIme(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v2 ??, still in use, count: 1, list:
          (r0v2 ?? I:boolean) from 0x001b: RETURN (r0v2 ?? I:boolean)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:78)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r3v0 ??
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

    @Override // android.widget.TextView
    protected void onSelectionChanged(int selStart, int selEnd) {
        if (!this.muted && getText() != null && (selStart != getText().length() || selEnd != getText().length())) {
            setSelection(getText().length());
        }
        super.onSelectionChanged(selStart, selEnd);
    }

    public final void show() {
        resetFiller();
        setVisibility(0);
        requestFocus();
        imm().showSoftInput(this, 1);
        this.isShowing = true;
    }

    public final void hide() {
        imm().hideSoftInputFromWindow(getWindowToken(), 0);
        clearFocus();
        this.isShowing = false;
        this.restoreFocus.invoke();
    }

    public final void toggle() {
        if (this.isShowing) {
            hide();
        } else {
            show();
        }
    }

    private final InputMethodManager imm() {
        Object systemService = getContext().getSystemService("input_method");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        return (InputMethodManager) systemService;
    }
}
