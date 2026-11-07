package com.github.caciocavallosilano.cacio.peer;

import java.awt.Frame;
import java.awt.Rectangle;
import java.awt.peer.FramePeer;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/caciocavallo17/cacio-shared-1.19.1-SNAPSHOT.jar:com/github/caciocavallosilano/cacio/peer/CacioFramePeer.class */
public class CacioFramePeer extends CacioWindowPeer implements FramePeer {
    static final /* synthetic */ boolean $assertionsDisabled;

    static {
        $assertionsDisabled = !CacioFramePeer.class.desiredAssertionStatus();
    }

    public CacioFramePeer(Frame awtC, PlatformWindowFactory pwf) {
        super(awtC, pwf);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 ??, still in use, count: 1, list:
          (r0v1 ?? I:com.pymcl.android.MainActivity$$ExternalSyntheticLambda2) from 0x0004: INVOKE (r0v2 ?? I:void) = (r0v1 ?? I:com.pymcl.android.MainActivity$$ExternalSyntheticLambda2) INTERFACE call: com.pymcl.android.MainActivity$$ExternalSyntheticLambda2.<init>():void A[MD:():void (m)]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1119)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:110)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    public int getState() {
        /*
            r2 = this;
            r0 = r2
            void r0 = r0.<init>(r2)
            void r0 = r0.<init>()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.caciocavallosilano.cacio.peer.CacioFramePeer.getState():int");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 ??, still in use, count: 3, list:
          (r0v1 ?? I:com.pymcl.android.MainActivity$observeVpnRequests$1$1$1) from 0x0005: INVOKE 
          (r0v1 ?? I:com.pymcl.android.MainActivity$observeVpnRequests$1$1$1)
          (r4v0 ?? I:com.pymcl.android.MainActivity A[D('state' int)])
          (r0v1 ?? I:kotlinx.coroutines.CoroutineScope)
          (r0v1 ?? I:com.pymcl.multiplayer.MultiplayerController)
         INTERFACE call: com.pymcl.android.MainActivity.observeVpnRequests.1.1.1.<init>(com.pymcl.android.MainActivity, kotlinx.coroutines.CoroutineScope, com.pymcl.multiplayer.MultiplayerController):void A[MD:(com.pymcl.android.MainActivity, kotlinx.coroutines.CoroutineScope, com.pymcl.multiplayer.MultiplayerController):void (m)]
          (r0v1 ?? I:kotlinx.coroutines.CoroutineScope) from 0x0005: INVOKE 
          (r0v1 ?? I:com.pymcl.android.MainActivity$observeVpnRequests$1$1$1)
          (r4v0 ?? I:com.pymcl.android.MainActivity A[D('state' int)])
          (r0v1 ?? I:kotlinx.coroutines.CoroutineScope)
          (r0v1 ?? I:com.pymcl.multiplayer.MultiplayerController)
         INTERFACE call: com.pymcl.android.MainActivity.observeVpnRequests.1.1.1.<init>(com.pymcl.android.MainActivity, kotlinx.coroutines.CoroutineScope, com.pymcl.multiplayer.MultiplayerController):void A[MD:(com.pymcl.android.MainActivity, kotlinx.coroutines.CoroutineScope, com.pymcl.multiplayer.MultiplayerController):void (m)]
          (r0v1 ?? I:com.pymcl.multiplayer.MultiplayerController) from 0x0005: INVOKE 
          (r0v1 ?? I:com.pymcl.android.MainActivity$observeVpnRequests$1$1$1)
          (r4v0 ?? I:com.pymcl.android.MainActivity A[D('state' int)])
          (r0v1 ?? I:kotlinx.coroutines.CoroutineScope)
          (r0v1 ?? I:com.pymcl.multiplayer.MultiplayerController)
         INTERFACE call: com.pymcl.android.MainActivity.observeVpnRequests.1.1.1.<init>(com.pymcl.android.MainActivity, kotlinx.coroutines.CoroutineScope, com.pymcl.multiplayer.MultiplayerController):void A[MD:(com.pymcl.android.MainActivity, kotlinx.coroutines.CoroutineScope, com.pymcl.multiplayer.MultiplayerController):void (m)]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1119)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:110)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    public void setState(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 ??, still in use, count: 3, list:
          (r0v1 ?? I:com.pymcl.android.MainActivity$observeVpnRequests$1$1$1) from 0x0005: INVOKE 
          (r0v1 ?? I:com.pymcl.android.MainActivity$observeVpnRequests$1$1$1)
          (r4v0 ?? I:com.pymcl.android.MainActivity A[D('state' int)])
          (r0v1 ?? I:kotlinx.coroutines.CoroutineScope)
          (r0v1 ?? I:com.pymcl.multiplayer.MultiplayerController)
         INTERFACE call: com.pymcl.android.MainActivity.observeVpnRequests.1.1.1.<init>(com.pymcl.android.MainActivity, kotlinx.coroutines.CoroutineScope, com.pymcl.multiplayer.MultiplayerController):void A[MD:(com.pymcl.android.MainActivity, kotlinx.coroutines.CoroutineScope, com.pymcl.multiplayer.MultiplayerController):void (m)]
          (r0v1 ?? I:kotlinx.coroutines.CoroutineScope) from 0x0005: INVOKE 
          (r0v1 ?? I:com.pymcl.android.MainActivity$observeVpnRequests$1$1$1)
          (r4v0 ?? I:com.pymcl.android.MainActivity A[D('state' int)])
          (r0v1 ?? I:kotlinx.coroutines.CoroutineScope)
          (r0v1 ?? I:com.pymcl.multiplayer.MultiplayerController)
         INTERFACE call: com.pymcl.android.MainActivity.observeVpnRequests.1.1.1.<init>(com.pymcl.android.MainActivity, kotlinx.coroutines.CoroutineScope, com.pymcl.multiplayer.MultiplayerController):void A[MD:(com.pymcl.android.MainActivity, kotlinx.coroutines.CoroutineScope, com.pymcl.multiplayer.MultiplayerController):void (m)]
          (r0v1 ?? I:com.pymcl.multiplayer.MultiplayerController) from 0x0005: INVOKE 
          (r0v1 ?? I:com.pymcl.android.MainActivity$observeVpnRequests$1$1$1)
          (r4v0 ?? I:com.pymcl.android.MainActivity A[D('state' int)])
          (r0v1 ?? I:kotlinx.coroutines.CoroutineScope)
          (r0v1 ?? I:com.pymcl.multiplayer.MultiplayerController)
         INTERFACE call: com.pymcl.android.MainActivity.observeVpnRequests.1.1.1.<init>(com.pymcl.android.MainActivity, kotlinx.coroutines.CoroutineScope, com.pymcl.multiplayer.MultiplayerController):void A[MD:(com.pymcl.android.MainActivity, kotlinx.coroutines.CoroutineScope, com.pymcl.multiplayer.MultiplayerController):void (m)]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1119)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:110)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r4v0 ??
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

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 ??, still in use, count: 2, list:
          (r0v1 ?? I:com.pymcl.android.MainActivity$observeVpnRequests$1$1) from 0x0005: INVOKE 
          (r0v1 ?? I:com.pymcl.android.MainActivity$observeVpnRequests$1$1)
          (r4v0 ?? I:kotlinx.coroutines.CoroutineScope A[D('bounds' java.awt.Rectangle)])
          (r0v1 ?? I:kotlin.coroutines.Continuation)
         INTERFACE call: com.pymcl.android.MainActivity.observeVpnRequests.1.1.invoke(kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation):java.lang.Object A[MD:(kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>):java.lang.Object (m)]
          (r0v1 ?? I:kotlin.coroutines.Continuation) from 0x0005: INVOKE 
          (r0v1 ?? I:com.pymcl.android.MainActivity$observeVpnRequests$1$1)
          (r4v0 ?? I:kotlinx.coroutines.CoroutineScope A[D('bounds' java.awt.Rectangle)])
          (r0v1 ?? I:kotlin.coroutines.Continuation)
         INTERFACE call: com.pymcl.android.MainActivity.observeVpnRequests.1.1.invoke(kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation):java.lang.Object A[MD:(kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>):java.lang.Object (m)]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1119)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:110)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    public void setMaximizedBounds(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 ??, still in use, count: 2, list:
          (r0v1 ?? I:com.pymcl.android.MainActivity$observeVpnRequests$1$1) from 0x0005: INVOKE 
          (r0v1 ?? I:com.pymcl.android.MainActivity$observeVpnRequests$1$1)
          (r4v0 ?? I:kotlinx.coroutines.CoroutineScope A[D('bounds' java.awt.Rectangle)])
          (r0v1 ?? I:kotlin.coroutines.Continuation)
         INTERFACE call: com.pymcl.android.MainActivity.observeVpnRequests.1.1.invoke(kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation):java.lang.Object A[MD:(kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>):java.lang.Object (m)]
          (r0v1 ?? I:kotlin.coroutines.Continuation) from 0x0005: INVOKE 
          (r0v1 ?? I:com.pymcl.android.MainActivity$observeVpnRequests$1$1)
          (r4v0 ?? I:kotlinx.coroutines.CoroutineScope A[D('bounds' java.awt.Rectangle)])
          (r0v1 ?? I:kotlin.coroutines.Continuation)
         INTERFACE call: com.pymcl.android.MainActivity.observeVpnRequests.1.1.invoke(kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation):java.lang.Object A[MD:(kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>):java.lang.Object (m)]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1119)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:110)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r4v0 ??
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

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 ??, still in use, count: 1, list:
          (r0v1 ?? I:??[OBJECT, ARRAY]) from 0x0004: CHECK_CAST (r0v2 ?? I:java.awt.peer.MenuBarPeer) = (java.awt.peer.MenuBarPeer) (r0v1 ?? I:??[OBJECT, ARRAY])
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1119)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:110)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    public void setMenuBar(java.awt.MenuBar r4) {
        /*
            r3 = this;
            r0 = r4
            void r0 = com.pymcl.android.MainActivity$special$$inlined$viewModels$default$2.<init>(r0)
            java.awt.peer.MenuBarPeer r0 = (java.awt.peer.MenuBarPeer) r0
            r5 = r0
            r0 = r5
            if (r0 != 0) goto L18
            r0 = r4
            r0.$r8$lambda$iMMxxxIdIxniyOyFQ7CoHExve3M(r4)
            r0 = r4
            void r0 = com.pymcl.android.MainActivity$special$$inlined$viewModels$default$2.<init>(r0)
            java.awt.peer.MenuBarPeer r0 = (java.awt.peer.MenuBarPeer) r0
            r5 = r0
        L18:
            boolean r0 = com.github.caciocavallosilano.cacio.peer.CacioFramePeer.$assertionsDisabled
            if (r0 != 0) goto L2d
            r0 = r5
            boolean r0 = r0 instanceof com.github.caciocavallosilano.cacio.peer.CacioMenuBarPeer
            if (r0 != 0) goto L2d
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r1 = r0
            super/*com.pymcl.android.MainActivity*/.getVm()
            throw r0
        L2d:
            r0 = r5
            com.github.caciocavallosilano.cacio.peer.CacioMenuBarPeer r0 = (com.github.caciocavallosilano.cacio.peer.CacioMenuBarPeer) r0
            void r0 = r0.onCreate(r0)
            javax.swing.JMenuBar r0 = (javax.swing.JMenuBar) r0
            r6 = r0
            r0 = r3
            void r0 = r0.<clinit>()
            javax.swing.JRootPane r0 = (javax.swing.JRootPane) r0
            r7 = r0
            r0 = r7
            r1 = r6
            r0.setJMenuBar(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.caciocavallosilano.cacio.peer.CacioFramePeer.setMenuBar(java.awt.MenuBar):void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 ??, still in use, count: 1, list:
          (r0v1 ?? I:com.github.caciocavallosilano.cacio.peer.PlatformToplevelWindow) from 0x0005: INVOKE 
          (r0v1 ?? I:com.github.caciocavallosilano.cacio.peer.PlatformToplevelWindow)
          (r4v0 ?? I:boolean A[D('resizable' boolean)])
         INTERFACE call: com.github.caciocavallosilano.cacio.peer.PlatformToplevelWindow.setResizable(boolean):void A[MD:(boolean):void (m)]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1119)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:110)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    public void setResizable(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 ??, still in use, count: 1, list:
          (r0v1 ?? I:com.github.caciocavallosilano.cacio.peer.PlatformToplevelWindow) from 0x0005: INVOKE 
          (r0v1 ?? I:com.github.caciocavallosilano.cacio.peer.PlatformToplevelWindow)
          (r4v0 ?? I:boolean A[D('resizable' boolean)])
         INTERFACE call: com.github.caciocavallosilano.cacio.peer.PlatformToplevelWindow.setResizable(boolean):void A[MD:(boolean):void (m)]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1119)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:110)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r4v0 ??
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

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 ??, still in use, count: 1, list:
          (r0v1 ?? I:com.github.caciocavallosilano.cacio.peer.PlatformToplevelWindow) from 0x0005: INVOKE 
          (r0v1 ?? I:com.github.caciocavallosilano.cacio.peer.PlatformToplevelWindow)
          (r4v0 ?? I:java.lang.String A[D('title' java.lang.String)])
         INTERFACE call: com.github.caciocavallosilano.cacio.peer.PlatformToplevelWindow.setTitle(java.lang.String):void A[MD:(java.lang.String):void (m)]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1119)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:110)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    public void setTitle(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 ??, still in use, count: 1, list:
          (r0v1 ?? I:com.github.caciocavallosilano.cacio.peer.PlatformToplevelWindow) from 0x0005: INVOKE 
          (r0v1 ?? I:com.github.caciocavallosilano.cacio.peer.PlatformToplevelWindow)
          (r4v0 ?? I:java.lang.String A[D('title' java.lang.String)])
         INTERFACE call: com.github.caciocavallosilano.cacio.peer.PlatformToplevelWindow.setTitle(java.lang.String):void A[MD:(java.lang.String):void (m)]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1119)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:110)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r4v0 ??
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

    public Rectangle getBoundsPrivate() {
        System.out.println("IMPLEMENT ME: CacioFramePeer.getBoundsPrivate");
        return null;
    }

    public void setBoundsPrivate(int x, int y, int width, int height) {
        System.out.println("IMPLEMENT ME: CacioFramePeer.setBoundsPrivate");
    }

    @Override // com.github.caciocavallosilano.cacio.peer.CacioWindowPeer
    protected int getRootPaneDecorationStyle() {
        if (!isDecorateWindows() || ((Frame) getAWTComponent()).isUndecorated()) {
            return 0;
        }
        return 1;
    }

    public void emulateActivation(boolean activate) {
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 ??, still in use, count: 1, list:
          (r0v1 ?? I:com.github.caciocavallosilano.cacio.peer.PlatformToplevelWindow) from 0x0004: INVOKE (r0v1 ?? I:com.github.caciocavallosilano.cacio.peer.PlatformToplevelWindow) INTERFACE call: com.github.caciocavallosilano.cacio.peer.PlatformToplevelWindow.requestFocus():void A[MD:():void (m)]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1119)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:110)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    @Override // com.github.caciocavallosilano.cacio.peer.CacioComponentPeer
    public boolean requestFocus(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 ??, still in use, count: 1, list:
          (r0v1 ?? I:com.github.caciocavallosilano.cacio.peer.PlatformToplevelWindow) from 0x0004: INVOKE (r0v1 ?? I:com.github.caciocavallosilano.cacio.peer.PlatformToplevelWindow) INTERFACE call: com.github.caciocavallosilano.cacio.peer.PlatformToplevelWindow.requestFocus():void A[MD:():void (m)]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1119)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:110)
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
}
