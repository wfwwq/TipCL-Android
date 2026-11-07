package com.pymcl.runtime.control;

import android.content.Context;
import android.view.MotionEvent;
import com.pymcl.runtime.input.Keys;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ControlViews.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0018\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0014J\u0010\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0017H\u0014J\u0010\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u000bH\u0002J\b\u0010\u001a\u001a\u00020\u0012H\u0016R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/pymcl/runtime/control/DirectionView;", "Lcom/pymcl/runtime/control/ControlElementView;", "context", "Landroid/content/Context;", "element", "Lcom/pymcl/runtime/control/ControlElement;", "host", "Lcom/pymcl/runtime/control/ControlHost;", "<init>", "(Landroid/content/Context;Lcom/pymcl/runtime/control/ControlElement;Lcom/pymcl/runtime/control/ControlHost;)V", "state", "", "knobX", "", "knobY", "sprinting", "", "onDraw", "", "c", "Landroid/graphics/Canvas;", "onGameTouch", "e", "Landroid/view/MotionEvent;", "apply", "next", "releaseAll", "PyMCL-Android:runtime_debug"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class DirectionView extends ControlElementView {
    private float knobX;
    private float knobY;
    private boolean sprinting;
    private boolean[] state;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DirectionView(Context context, ControlElement element, ControlHost host) {
        super(context, element, host);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(element, "element");
        Intrinsics.checkNotNullParameter(host, "host");
        this.state = new boolean[4];
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r6v2 ??, still in use, count: 1, list:
          (r6v2 ?? I:int) from 0x0034: INVOKE (r3v2 ?? I:android.graphics.Paint), (r6v2 ?? I:int) VIRTUAL call: android.graphics.Paint.setColor(int):void A[MD:(int):void (c)]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1119)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:110)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    @Override // com.pymcl.runtime.control.ControlElementView, android.view.View
    protected void onDraw(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r6v2 ??, still in use, count: 1, list:
          (r6v2 ?? I:int) from 0x0034: INVOKE (r3v2 ?? I:android.graphics.Paint), (r6v2 ?? I:int) VIRTUAL call: android.graphics.Paint.setColor(int):void A[MD:(int):void (c)]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1119)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:110)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r19v0 ??
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

    @Override // com.pymcl.runtime.control.ControlElementView
    protected boolean onGameTouch(MotionEvent e) {
        Intrinsics.checkNotNullParameter(e, "e");
        switch (e.getActionMasked()) {
            case 0:
            case 2:
                float r = Math.min(getWidth(), getHeight()) / 2.0f;
                float nx = (e.getX() - (getWidth() / 2.0f)) / r;
                float ny = (e.getY() - (getHeight() / 2.0f)) / r;
                float len = (float) Math.hypot(nx, ny);
                if (len > 1.0f) {
                    nx /= len;
                    ny /= len;
                }
                float nx2 = nx;
                float ny2 = ny;
                this.knobX = nx2;
                this.knobY = ny2;
                apply(DirectionMath.directions$default(DirectionMath.INSTANCE, nx2, ny2, 0.0f, 4, null));
                String sk = getElement().getSprintKey();
                if (sk != null) {
                    boolean want = len >= getElement().getSprintThreshold() && ny2 < 0.0f;
                    if (want != this.sprinting) {
                        this.sprinting = want;
                        Keys.INSTANCE.dispatch(getHost().getSink(), sk, want);
                        break;
                    }
                }
                break;
            case 1:
            case 3:
                releaseAll();
                break;
        }
        invalidate();
        return true;
    }

    private final void apply(boolean[] next) {
        String it;
        for (int i = 0; i < 4; i++) {
            if (next[i] != this.state[i] && (it = (String) CollectionsKt.getOrNull(getElement().getKeys(), i)) != null) {
                Keys.INSTANCE.dispatch(getHost().getSink(), it, next[i]);
            }
        }
        this.state = next;
    }

    @Override // com.pymcl.runtime.control.ControlElementView
    public void releaseAll() {
        apply(new boolean[4]);
        this.knobX = 0.0f;
        this.knobY = 0.0f;
        if (this.sprinting) {
            this.sprinting = false;
            String it = getElement().getSprintKey();
            if (it != null) {
                Keys.INSTANCE.dispatch(getHost().getSink(), it, false);
            }
        }
        invalidate();
    }
}
