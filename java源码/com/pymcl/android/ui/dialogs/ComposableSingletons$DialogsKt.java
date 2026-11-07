package com.pymcl.android.ui.dialogs;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.pymcl.android.ui.components.UiKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Dialogs.kt */
@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class ComposableSingletons$DialogsKt {
    public static final ComposableSingletons$DialogsKt INSTANCE = new ComposableSingletons$DialogsKt();

    /* renamed from: lambda$-1804769784, reason: not valid java name */
    private static Function3<RowScope, Composer, Integer, Unit> f89lambda$1804769784 = ComposableLambdaKt.composableLambdaInstance(-1804769784, false, new Function3() { // from class: com.pymcl.android.ui.dialogs.ComposableSingletons$DialogsKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$DialogsKt.lambda__1804769784$lambda$0((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* renamed from: lambda$-450350894, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f90lambda$450350894 = ComposableLambdaKt.composableLambdaInstance(-450350894, false, new Function2() { // from class: com.pymcl.android.ui.dialogs.ComposableSingletons$DialogsKt$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$DialogsKt.lambda__450350894$lambda$0((Composer) obj, ((Integer) obj2).intValue());
        }
    });
    private static Function3<ColumnScope, Composer, Integer, Unit> lambda$1337781344 = ComposableLambdaKt.composableLambdaInstance(1337781344, false, new Function3() { // from class: com.pymcl.android.ui.dialogs.ComposableSingletons$DialogsKt$$ExternalSyntheticLambda2
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$DialogsKt.lambda_1337781344$lambda$0((ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* renamed from: getLambda$-1804769784$PyMCL_Android_app_debug, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m7611getLambda$1804769784$PyMCL_Android_app_debug() {
        return f89lambda$1804769784;
    }

    /* renamed from: getLambda$-450350894$PyMCL_Android_app_debug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m7612getLambda$450350894$PyMCL_Android_app_debug() {
        return f90lambda$450350894;
    }

    public final Function3<ColumnScope, Composer, Integer, Unit> getLambda$1337781344$PyMCL_Android_app_debug() {
        return lambda$1337781344;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lambda__1804769784$lambda$0(RowScope rowScope, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(rowScope, "<this>");
        ComposerKt.sourceInformation($composer, "C:Dialogs.kt#2dz5k2");
        if ($composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1804769784, $changed, -1, "com.pymcl.android.ui.dialogs.ComposableSingletons$DialogsKt.lambda$-1804769784.<anonymous> (Dialogs.kt:52)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r6v1 ??, still in use, count: 1, list:
          (r6v1 ?? I:??[int, boolean, OBJECT, ARRAY, byte, short, char]) from 0x004f: IF  (r3v1 ?? I:??[int, boolean, OBJECT, ARRAY, byte, short, char] A[D('it\1' java.lang.Object)]) != (r6v1 ?? I:??[int, boolean, OBJECT, ARRAY, byte, short, char])  -> B:15:0x005e
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1119)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:110)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit lambda__450350894$lambda$0(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r6v1 ??, still in use, count: 1, list:
          (r6v1 ?? I:??[int, boolean, OBJECT, ARRAY, byte, short, char]) from 0x004f: IF  (r3v1 ?? I:??[int, boolean, OBJECT, ARRAY, byte, short, char] A[D('it\1' java.lang.Object)]) != (r6v1 ?? I:??[int, boolean, OBJECT, ARRAY, byte, short, char])  -> B:15:0x005e
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1119)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:110)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r13v0 ??
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lambda__450350894$lambda$0$0$0(int it) {
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lambda_1337781344$lambda$0(ColumnScope Sheet, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(Sheet, "$this$Sheet");
        ComposerKt.sourceInformation($composer, "C319@21410L27:Dialogs.kt#2dz5k2");
        if ($composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1337781344, $changed, -1, "com.pymcl.android.ui.dialogs.ComposableSingletons$DialogsKt.lambda$1337781344.<anonymous> (Dialogs.kt:319)");
            }
            UiKt.Muted("会发到开发者的反馈服务，不含账号密码", null, false, 0, $composer, 6, 14);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }
}
