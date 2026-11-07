package com.pymcl.runtime.process;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import java.io.File;
import kotlin.Metadata;
import kotlin.io.FilesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: JavaProcessService.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J\"\u0010\n\u001a\u00020\u000b2\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/pymcl/runtime/process/JavaProcessService;", "Landroid/app/Service;", "<init>", "()V", "started", "", "onBind", "Landroid/os/IBinder;", "intent", "Landroid/content/Intent;", "onStartCommand", "", "flags", "startId", "Companion", "PyMCL-Android:runtime_debug"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class JavaProcessService extends Service {
    public static final Companion Companion = new Companion(null);
    public static final String EXTRA_ARGS = "args";
    public static final String EXTRA_JAVA = "java_path";
    public static final String EXTRA_RUN_DIR = "run_dir";
    public static final String EXTRA_WORK_DIR = "work_dir";
    private static final String TAG = "PyMCL-JPR";
    private volatile boolean started;

    /* compiled from: JavaProcessService.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/pymcl/runtime/process/JavaProcessService$Companion;", "", "<init>", "()V", "EXTRA_RUN_DIR", "", "EXTRA_JAVA", "EXTRA_WORK_DIR", "EXTRA_ARGS", "TAG", "writeExit", "", "runDir", "Ljava/io/File;", "code", "", "PyMCL-Android:runtime_debug"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final void writeExit(File runDir, int code) {
            Intrinsics.checkNotNullParameter(runDir, "runDir");
            File tmp = new File(runDir, "exit.tmp");
            FilesKt.writeText$default(tmp, String.valueOf(code), null, 2, null);
            tmp.renameTo(new File(runDir, "exit"));
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r11v0 ??, still in use, count: 2, list:
          (r11v0 ?? I:java.lang.Object) from 0x0063: INVOKE (r11v0 ?? I:java.lang.Object) STATIC call: kotlin.jvm.internal.Intrinsics.checkNotNull(java.lang.Object):void A[Catch: all -> 0x0094, MD:(java.lang.Object):void (m)]
          (r11v0 ?? I:java.lang.String[] A[D('args' java.lang.String[])]) from 0x0082: INVOKE 
          (r5v1 ?? I:com.tungsten.fclauncher.FCLConfig)
          (r6v3 ?? I:android.content.Context)
          (r7v5 ?? I:java.lang.String)
          (r0v17 ?? I:java.lang.String A[D('java' java.lang.String)])
          (r9v0 ?? I:java.lang.String A[D('work' java.lang.String)])
          (r10v0 ?? I:com.mio.data.Renderer)
          (r11v0 ?? I:java.lang.String[] A[D('args' java.lang.String[])])
         DIRECT call: com.tungsten.fclauncher.FCLConfig.<init>(android.content.Context, java.lang.String, java.lang.String, java.lang.String, com.mio.data.Renderer, java.lang.String[]):void A[Catch: all -> 0x0094, MD:(android.content.Context, java.lang.String, java.lang.String, java.lang.String, com.mio.data.Renderer, java.lang.String[]):void (m)]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1119)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:110)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    @Override // android.app.Service
    public int onStartCommand(android.content.Intent r13, 
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r11v0 ??, still in use, count: 2, list:
          (r11v0 ?? I:java.lang.Object) from 0x0063: INVOKE (r11v0 ?? I:java.lang.Object) STATIC call: kotlin.jvm.internal.Intrinsics.checkNotNull(java.lang.Object):void A[Catch: all -> 0x0094, MD:(java.lang.Object):void (m)]
          (r11v0 ?? I:java.lang.String[] A[D('args' java.lang.String[])]) from 0x0082: INVOKE 
          (r5v1 ?? I:com.tungsten.fclauncher.FCLConfig)
          (r6v3 ?? I:android.content.Context)
          (r7v5 ?? I:java.lang.String)
          (r0v17 ?? I:java.lang.String A[D('java' java.lang.String)])
          (r9v0 ?? I:java.lang.String A[D('work' java.lang.String)])
          (r10v0 ?? I:com.mio.data.Renderer)
          (r11v0 ?? I:java.lang.String[] A[D('args' java.lang.String[])])
         DIRECT call: com.tungsten.fclauncher.FCLConfig.<init>(android.content.Context, java.lang.String, java.lang.String, java.lang.String, com.mio.data.Renderer, java.lang.String[]):void A[Catch: all -> 0x0094, MD:(android.content.Context, java.lang.String, java.lang.String, java.lang.String, com.mio.data.Renderer, java.lang.String[]):void (m)]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1119)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:110)
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
}
