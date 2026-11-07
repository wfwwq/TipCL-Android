package com.github.caciocavallosilano.cacio.peer;

import java.awt.Checkbox;
import java.awt.event.ItemListener;
import java.awt.peer.CheckboxPeer;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.JToggleButton;

/*  JADX ERROR: NullPointerException in pass: ProcessKotlinInternals
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.nodes.MethodNode.getBasicBlocks()" is null
    	at jadx.core.dex.visitors.kotlin.ProcessKotlinInternals.processMth(ProcessKotlinInternals.java:93)
    	at jadx.core.dex.visitors.kotlin.ProcessKotlinInternals.visit(ProcessKotlinInternals.java:84)
    */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/caciocavallo17/cacio-shared-1.19.1-SNAPSHOT.jar:com/github/caciocavallosilano/cacio/peer/CacioCheckboxPeer.class */
class CacioCheckboxPeer extends CacioComponentPeer<Checkbox, JPanel> implements CheckboxPeer {
    private JToggleButton toggleButton;

    /*  JADX ERROR: Failed to decode insn: 0x000D: INVOKE_SPECIAL r2, r3
        java.lang.ArrayIndexOutOfBoundsException: Index 16 out of bounds for length 16
        	at jadx.plugins.input.java.data.code.JavaInsnData.getReg(JavaInsnData.java:112)
        	at jadx.core.dex.instructions.InvokeNode.<init>(InvokeNode.java:32)
        	at jadx.core.dex.instructions.InvokeNode.<init>(InvokeNode.java:17)
        	at jadx.core.dex.instructions.InsnDecoder.invokeSpecial(InsnDecoder.java:629)
        	at jadx.core.dex.instructions.InsnDecoder.decode(InsnDecoder.java:452)
        	at jadx.core.dex.instructions.InsnDecoder.lambda$process$0(InsnDecoder.java:51)
        	at jadx.plugins.input.java.data.code.JavaCodeReader.visitInstructions(JavaCodeReader.java:85)
        	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:158)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:460)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:112)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:403)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:391)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:341)
        */
    @Override // com.github.caciocavallosilano.cacio.peer.CacioComponentPeer
    void postInitSwingComponent() {
        /*
            r5 = this;
            r0 = r5
            super/*com.pymcl.android.ui.theme.Py*/.getShapes(r5, r0)
            r0 = r5
            javax.swing.JToggleButton r0 = r0.toggleButton
            com.github.caciocavallosilano.cacio.peer.CacioCheckboxPeer$SwingCheckboxListener r1 = new com.github.caciocavallosilano.cacio.peer.CacioCheckboxPeer$SwingCheckboxListener
            r2 = r1
            r3 = r5
            // decode failed: Index 16 out of bounds for length 16
            r0.getPaper()
            r0 = r5
            java.awt.Component r0 = r0.getAWTComponent()
            java.awt.Checkbox r0 = (java.awt.Checkbox) r0
            r6 = r0
            r0 = r5
            r1 = r6
            long r1 = r1.getLine()
            r0.getPressed()
            r0 = r5
            r1 = r6
            long r1 = r1.getInkFaint()
            r0.getWarnSoft()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.caciocavallosilano.cacio.peer.CacioCheckboxPeer.postInitSwingComponent():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [javax.swing.JComponent, long] */
    @Override // com.github.caciocavallosilano.cacio.peer.CacioComponentPeer
    /* renamed from: initSwingComponent */
    public /* bridge */ /* synthetic */ JComponent mo7501initSwingComponent() {
        return m7954getAccentStrong0d7_KjU();
    }

    public CacioCheckboxPeer(Checkbox awtC, PlatformWindowFactory pwf) {
        super(awtC, pwf);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v2 javax.swing.JRadioButton, still in use, count: 2, list:
          (r1v2 javax.swing.JRadioButton) from 0x0036: IPUT 
          (r1v2 javax.swing.JRadioButton)
          (r4v0 'this' com.github.caciocavallosilano.cacio.peer.CacioCheckboxPeer A[D('this' com.github.caciocavallosilano.cacio.peer.CacioCheckboxPeer), IMMUTABLE_TYPE, THIS])
         (LINE:61) com.github.caciocavallosilano.cacio.peer.CacioCheckboxPeer.toggleButton javax.swing.JToggleButton
          (r1v2 javax.swing.JRadioButton) from 0x0033: INVOKE (r1v2 javax.swing.JRadioButton) SUPER call: com.pymcl.android.ui.theme.BgPreset.getEntries():kotlin.enums.EnumEntries A[MD:():kotlin.enums.EnumEntries<com.pymcl.android.ui.theme.BgPreset> (m)]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    public javax.swing.JPanel initSwingComponent() {
        /*
            r4 = this;
            javax.swing.JPanel r0 = new javax.swing.JPanel
            r1 = r0
            r1.<init>()
            r5 = r0
            r0 = r5
            java.awt.BorderLayout r1 = new java.awt.BorderLayout
            r2 = r1
            r2.<init>()
            r0.setLayout(r1)
            r0 = r4
            java.awt.Component r0 = r0.getAWTComponent()
            java.awt.Checkbox r0 = (java.awt.Checkbox) r0
            java.awt.CheckboxGroup r0 = r0.getCheckboxGroup()
            if (r0 != 0) goto L2e
            r0 = r4
            javax.swing.JCheckBox r1 = new javax.swing.JCheckBox
            r2 = r1
            r2.<init>()
            r0.toggleButton = r1
            goto L39
        L2e:
            r0 = r4
            javax.swing.JRadioButton r1 = new javax.swing.JRadioButton
            r2 = r1
            super/*com.pymcl.android.ui.theme.BgPreset*/.getEntries()
            r0.toggleButton = r1
        L39:
            r0 = r5
            r1 = r4
            javax.swing.JToggleButton r1 = r1.toggleButton
            com.pymcl.android.ui.theme.BgPreset[] r0 = r0.values()
            r0 = r5
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.caciocavallosilano.cacio.peer.CacioCheckboxPeer.initSwingComponent():javax.swing.JPanel");
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/caciocavallo17/cacio-shared-1.19.1-SNAPSHOT.jar:com/github/caciocavallosilano/cacio/peer/CacioCheckboxPeer$SwingCheckboxListener.class */
    class SwingCheckboxListener implements ItemListener {
        SwingCheckboxListener() {
        }

        /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v2 ??, still in use, count: 1, list:
              (r0v2 ?? I:??[OBJECT, ARRAY]) from 0x0007: CHECK_CAST (r0v3 ?? I:java.awt.Checkbox) = (java.awt.Checkbox) (r0v2 ?? I:??[OBJECT, ARRAY])
            	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
            	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
            	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
            	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1119)
            	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:110)
            	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
            	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
            */
        public void itemStateChanged(
        /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v2 ??, still in use, count: 1, list:
              (r0v2 ?? I:??[OBJECT, ARRAY]) from 0x0007: CHECK_CAST (r0v3 ?? I:java.awt.Checkbox) = (java.awt.Checkbox) (r0v2 ?? I:??[OBJECT, ARRAY])
            	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
            	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
            	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
            	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1119)
            	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:110)
            	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
            */
        /*  JADX ERROR: Method generation error
            jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r8v0 ??
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
            	at jadx.core.codegen.ClassGen.addInnerClass(ClassGen.java:310)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
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
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v0 javax.swing.JRadioButton, still in use, count: 2, list:
          (r1v0 javax.swing.JRadioButton) from 0x001a: IPUT 
          (r1v0 javax.swing.JRadioButton)
          (r4v0 'this' com.github.caciocavallosilano.cacio.peer.CacioCheckboxPeer A[D('this' com.github.caciocavallosilano.cacio.peer.CacioCheckboxPeer), IMMUTABLE_TYPE, THIS])
         (LINE:113) com.github.caciocavallosilano.cacio.peer.CacioCheckboxPeer.toggleButton javax.swing.JToggleButton
          (r1v0 javax.swing.JRadioButton) from 0x0017: INVOKE (r1v0 javax.swing.JRadioButton) SUPER call: com.pymcl.android.ui.theme.BgPreset.getEntries():kotlin.enums.EnumEntries A[MD:():kotlin.enums.EnumEntries<com.pymcl.android.ui.theme.BgPreset> (m)]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [long] */
    /* JADX WARN: Type inference failed for: r0v6, types: [long] */
    public void setCheckboxGroup(java.awt.CheckboxGroup r5) {
        /*
            r4 = this;
            r0 = r5
            if (r0 != 0) goto L12
            r0 = r4
            javax.swing.JCheckBox r1 = new javax.swing.JCheckBox
            r2 = r1
            r2.<init>()
            r0.toggleButton = r1
            goto L1d
        L12:
            r0 = r4
            javax.swing.JRadioButton r1 = new javax.swing.JRadioButton
            r2 = r1
            super/*com.pymcl.android.ui.theme.BgPreset*/.getEntries()
            r0.toggleButton = r1
        L1d:
            r0 = r4
            long r0 = r0.getScrollHover()
            javax.swing.JPanel r0 = (javax.swing.JPanel) r0
            r0.getGlassStrong()
            r0 = r4
            long r0 = r0.getScrollHover()
            javax.swing.JPanel r0 = (javax.swing.JPanel) r0
            r1 = r4
            javax.swing.JToggleButton r1 = r1.toggleButton
            com.pymcl.android.ui.theme.BgPreset[] r0 = r0.values()
            r0 = r4
            r0.getGlassBorder()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.caciocavallosilano.cacio.peer.CacioCheckboxPeer.setCheckboxGroup(java.awt.CheckboxGroup):void");
    }

    public void setLabel(String label) {
        this.toggleButton.component42();
    }

    public void setState(boolean state) {
        this.toggleButton.getAccentDeep();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.github.caciocavallosilano.cacio.peer.CacioComponentPeer
    void setEnabledImpl(boolean z) {
        super/*com.pymcl.android.ui.theme.PyColors*/.equals(z);
        this.toggleButton.m7951getAccentLite0d7_KjU();
    }
}
