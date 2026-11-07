package com.github.caciocavallosilano.cacio.peer;

import java.awt.Dimension;
import java.awt.TextArea;
import java.awt.im.InputMethodRequests;
import java.awt.peer.TextAreaPeer;
import javax.swing.JComponent;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/caciocavallo17/cacio-shared-1.19.1-SNAPSHOT.jar:com/github/caciocavallosilano/cacio/peer/CacioTextAreaPeer.class */
public class CacioTextAreaPeer extends CacioComponentPeer<TextArea, JScrollPane> implements TextAreaPeer {
    private JTextArea textArea;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.github.caciocavallosilano.cacio.peer.CacioComponentPeer
    /* renamed from: initSwingComponent */
    /* bridge */ /* synthetic */ JComponent mo7501initSwingComponent() {
        return onDraw$lambda$0$0(this);
    }

    public CacioTextAreaPeer(TextArea awtC, PlatformWindowFactory pwf) {
        super(awtC, pwf);
    }

    JScrollPane initSwingComponent() {
        int hsp;
        int vsp;
        TextArea awtTextArea = getAWTComponent();
        this.textArea = new JTextArea();
        int sbv = awtTextArea.getScrollbarVisibility();
        if (sbv == 3) {
            hsp = 31;
            vsp = 21;
        } else if (sbv == 2) {
            hsp = 32;
            vsp = 21;
        } else if (sbv == 1) {
            hsp = 31;
            vsp = 22;
        } else {
            hsp = 32;
            vsp = 22;
        }
        JScrollPane sp = new JScrollPane(this.textArea, vsp, hsp);
        return sp;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.github.caciocavallosilano.cacio.peer.CacioComponentPeer
    public void postInitSwingComponent() {
        super.postInitSwingComponent();
        setText(getAWTComponent().getText());
    }

    public Dimension getMinimumSize(int rows, int columns) {
        return getPreferredSize(rows, columns);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v15 ??, still in use, count: 5, list:
          (r0v15 ?? I:java.awt.Dimension A[D('spSize' java.awt.Dimension)]) from 0x003b: IPUT (r1v6 ?? I:int), (r0v15 ?? I:java.awt.Dimension A[D('spSize' java.awt.Dimension)]) (LINE:88) java.awt.Dimension.width int
          (r0v15 ?? I:java.awt.Dimension A[D('spSize' java.awt.Dimension)]) from 0x0035: IGET (r1v5 ?? I:int) = (r0v15 ?? I:java.awt.Dimension A[D('spSize' java.awt.Dimension)]) (LINE:88) java.awt.Dimension.width int
          (r0v15 ?? I:java.awt.Dimension A[D('spSize' java.awt.Dimension)]) from 0x0047: IPUT (r1v9 ?? I:int), (r0v15 ?? I:java.awt.Dimension A[D('spSize' java.awt.Dimension)]) (LINE:89) java.awt.Dimension.height int
          (r0v15 ?? I:java.awt.Dimension A[D('spSize' java.awt.Dimension)]) from 0x0041: IGET (r1v8 ?? I:int) = (r0v15 ?? I:java.awt.Dimension A[D('spSize' java.awt.Dimension)]) (LINE:89) java.awt.Dimension.height int
          (r0v15 ?? I:java.awt.Dimension A[D('spSize' java.awt.Dimension)]) from 0x004c: RETURN (r0v15 ?? I:java.awt.Dimension A[D('spSize' java.awt.Dimension)]) (LINE:90)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1119)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:110)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    public java.awt.Dimension getPreferredSize(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v15 ??, still in use, count: 5, list:
          (r0v15 ?? I:java.awt.Dimension A[D('spSize' java.awt.Dimension)]) from 0x003b: IPUT (r1v6 ?? I:int), (r0v15 ?? I:java.awt.Dimension A[D('spSize' java.awt.Dimension)]) (LINE:88) java.awt.Dimension.width int
          (r0v15 ?? I:java.awt.Dimension A[D('spSize' java.awt.Dimension)]) from 0x0035: IGET (r1v5 ?? I:int) = (r0v15 ?? I:java.awt.Dimension A[D('spSize' java.awt.Dimension)]) (LINE:88) java.awt.Dimension.width int
          (r0v15 ?? I:java.awt.Dimension A[D('spSize' java.awt.Dimension)]) from 0x0047: IPUT (r1v9 ?? I:int), (r0v15 ?? I:java.awt.Dimension A[D('spSize' java.awt.Dimension)]) (LINE:89) java.awt.Dimension.height int
          (r0v15 ?? I:java.awt.Dimension A[D('spSize' java.awt.Dimension)]) from 0x0041: IGET (r1v8 ?? I:int) = (r0v15 ?? I:java.awt.Dimension A[D('spSize' java.awt.Dimension)]) (LINE:89) java.awt.Dimension.height int
          (r0v15 ?? I:java.awt.Dimension A[D('spSize' java.awt.Dimension)]) from 0x004c: RETURN (r0v15 ?? I:java.awt.Dimension A[D('spSize' java.awt.Dimension)]) (LINE:90)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1119)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:110)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r5v0 ??
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.pymcl.runtime.control.ControlElement, float] */
    public void insert(String text, int pos) {
        super/*com.pymcl.runtime.control.ControlElement*/.getH().getKeys();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.pymcl.runtime.control.ControlElement, float] */
    public void replaceRange(String text, int start, int end) {
        super/*com.pymcl.runtime.control.ControlElement*/.getH().getW();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.pymcl.runtime.control.ControlElement, float] */
    /* JADX WARN: Type inference failed for: r0v2, types: [int, void] */
    public int getCaretPosition() {
        return super/*com.pymcl.runtime.control.ControlElement*/.getH().setCornerRadius(this);
    }

    public InputMethodRequests getInputMethodRequests() {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.pymcl.runtime.control.ControlElement, float] */
    /* JADX WARN: Type inference failed for: r0v2, types: [int, void] */
    public int getSelectionEnd() {
        return super/*com.pymcl.runtime.control.ControlElement*/.getH().setSprintKey(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.pymcl.runtime.control.ControlElement, float] */
    /* JADX WARN: Type inference failed for: r0v2, types: [int, void] */
    public int getSelectionStart() {
        return super/*com.pymcl.runtime.control.ControlElement*/.getH().setToggle(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.pymcl.runtime.control.ControlElement, float] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.String, void] */
    public String getText() {
        return super/*com.pymcl.runtime.control.ControlElement*/.getH().setType(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.pymcl.runtime.control.ControlElement, float] */
    public void select(int selStart, int selEnd) {
        super/*com.pymcl.runtime.control.ControlElement*/.getH().toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.pymcl.runtime.control.ControlElementView, float] */
    public void setCaretPosition(int pos) {
        super/*com.pymcl.runtime.control.ControlElement*/.getH().getEditSelected();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.pymcl.runtime.control.ControlElementView, float] */
    public void setEditable(boolean editable) {
        super/*com.pymcl.runtime.control.ControlElement*/.getH().getHost();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [float, javax.swing.JTextArea] */
    public void setText(String text) {
        super/*com.pymcl.runtime.control.ControlElement*/.getH().setText(text);
    }

    private JTextArea getTextArea() {
        return this.textArea;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [float, javax.swing.JTextArea] */
    @Override // com.github.caciocavallosilano.cacio.peer.CacioComponentPeer
    void setEnabledImpl(boolean enable) {
        super/*com.pymcl.runtime.control.ControlElementView*/.getTextPaint();
        super/*com.pymcl.runtime.control.ControlElement*/.getH().setEnabled(enable);
    }
}
