package com.pymcl.android.ui.dialogs;

import android.content.res.Resources;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import com.pymcl.ai.AiEvent;
import com.pymcl.android.data.AiItemReducer;
import com.pymcl.android.data.AiUiExtras;
import com.pymcl.android.ui.Destination;
import com.pymcl.android.ui.state.AiItem;
import com.pymcl.android.ui.state.AppState;
import com.pymcl.android.ui.state.CrashInfo;
import java.awt.FileDialog;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;
import kotlinx.coroutines.flow.Flow;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: AiFixWindow.kt */
@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u001a=\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007H\u0007b\u0002\b\tb\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f¢\u0006\u0002\u0010\b¨\u0006\r²\u0006\n\u0010\u000e\u001a\u00020\u000fX\u008a\u008e\u0002²\u0006\n\u0010\u0010\u001a\u00020\u000fX\u008a\u008e\u0002²\u0006\f\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u008a\u008e\u0002²\u0006\n\u0010\u0013\u001a\u00020\u0012X\u008a\u008e\u0002"}, d2 = {"AiFixWindow", "", "state", "Lcom/pymcl/android/ui/state/AppState;", "info", "Lcom/pymcl/android/ui/state/CrashInfo;", "onDismiss", "Lkotlin/Function0;", "(Lcom/pymcl/android/ui/state/AppState;Lcom/pymcl/android/ui/state/CrashInfo;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/runtime/Composable;", "Landroidx/compose/runtime/ComposableTarget;", "applier", "androidx.compose.ui.UiComposable", "PyMCL-Android:app_debug", "running", "", "started", "chatId", "", "input"}, k = 2, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class AiFixWindowKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AiFixWindow$lambda$19(AppState appState, CrashInfo crashInfo, Function0 function0, int i, Composer composer, int i2) {
        AiFixWindow(appState, crashInfo, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r7v39 ??, still in use, count: 1, list:
          (r7v39 ?? I:??[int, boolean, OBJECT, ARRAY, byte, short, char]) from 0x00b4: IF  (r9v0 ?? I:??[int, boolean, OBJECT, ARRAY, byte, short, char] A[D('it\1' java.lang.Object)]) != (r7v39 ?? I:??[int, boolean, OBJECT, ARRAY, byte, short, char])  -> B:55:0x00c4
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1119)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:110)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    /* JADX WARN: Not initialized variable reg: 18, insn: 0x00b0: INVOKE (r7 I:void) = (r17v4 ?? I:java.io.File), (r18 I:java.lang.String) VIRTUAL call: java.io.File.<init>(java.lang.String):void A[MD:(java.lang.String):void (c)], block:B:49:0x00ac */
    /* JADX WARN: Not initialized variable reg: 18, insn: 0x00f0: INVOKE (r15 I:void) = (r17v3 ?? I:java.io.File), (r18 I:java.lang.String) VIRTUAL call: java.io.File.<init>(java.lang.String):void A[MD:(java.lang.String):void (c)], block:B:66:0x00ee */
    /* JADX WARN: Not initialized variable reg: 18, insn: 0x011a: INVOKE (r13 I:void) = (r17v0 ?? I:java.io.File), (r18 I:java.lang.String) VIRTUAL call: java.io.File.<init>(java.lang.String):void A[MD:(java.lang.String):void (c)], block:B:71:0x0102 */
    /* JADX WARN: Not initialized variable reg: 20, insn: 0x014c: INVOKE (r4 I:void) = (r19v1 ?? I:java.io.File), (r20 I:java.lang.String) VIRTUAL call: java.io.File.<init>(java.lang.String):void A[MD:(java.lang.String):void (c)], block:B:75:0x0134 */
    public static final void AiFixWindow(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r7v39 ??, still in use, count: 1, list:
          (r7v39 ?? I:??[int, boolean, OBJECT, ARRAY, byte, short, char]) from 0x00b4: IF  (r9v0 ?? I:??[int, boolean, OBJECT, ARRAY, byte, short, char] A[D('it\1' java.lang.Object)]) != (r7v39 ?? I:??[int, boolean, OBJECT, ARRAY, byte, short, char])  -> B:55:0x00c4
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1119)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:110)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r28v0 ??
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
    public static final boolean AiFixWindow$lambda$3(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AiFixWindow$lambda$4(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean AiFixWindow$lambda$6(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void AiFixWindow$lambda$7(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String AiFixWindow$lambda$9(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    private static final String AiFixWindow$lambda$12(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AiFixWindow$upsert(SnapshotStateList<AiItem> snapshotStateList, AiItem it) {
        int i = 0;
        Iterator<AiItem> it2 = snapshotStateList.iterator();
        while (true) {
            if (it2.hasNext()) {
                AiItem aiItem = (AiItem) it2.next();
                if (Intrinsics.areEqual(aiItem.getId(), it.getId()) && aiItem.getClass() == it.getClass()) {
                    break;
                } else {
                    i++;
                }
            } else {
                i = -1;
                break;
            }
        }
        if (AiItemReducer.INSTANCE.isDiscarded(it)) {
            if (i >= 0) {
                snapshotStateList.remove(i);
            }
        } else if (i >= 0) {
            snapshotStateList.set(i, it);
        } else {
            snapshotStateList.add(it);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AiFixWindow$runFix(AiUiExtras ai, AppState $state, MutableState<Boolean> mutableState, SnapshotStateList<AiItem> snapshotStateList, MutableState<String> mutableState2, Flow<? extends AiEvent> flow) {
        if (ai == null) {
            return;
        }
        AiFixWindow$lambda$4(mutableState, true);
        $state.launch(new AiFixWindowKt$AiFixWindow$runFix$1(flow, ai, snapshotStateList, mutableState, mutableState2, ai, $state, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AiFixWindow$start(AiUiExtras ai, AppState $state, MutableState<Boolean> mutableState, SnapshotStateList<AiItem> snapshotStateList, String visible, CrashInfo $info, MutableState<String> mutableState2, MutableState<Boolean> mutableState3) {
        if (ai == null) {
            return;
        }
        AiFixWindow$lambda$7(mutableState, true);
        $state.launch(new AiFixWindowKt$AiFixWindow$start$1(ai, snapshotStateList, visible, $info, mutableState2, ai, $state, mutableState3, null));
    }

    private static final void AiFixWindow$sendMore(AiUiExtras ai, MutableState<String> mutableState, MutableState<Boolean> mutableState2, SnapshotStateList<AiItem> snapshotStateList, MutableState<String> mutableState3, AppState $state) {
        String t = StringsKt.trim((CharSequence) AiFixWindow$lambda$12(mutableState)).toString();
        if (ai == null) {
            return;
        }
        if (t.length() == 0) {
            return;
        }
        if (!AiFixWindow$lambda$3(mutableState2)) {
            AiFixWindow$upsert(snapshotStateList, new AiItem.User("u" + System.nanoTime(), t));
            mutableState.setValue("");
            AiFixWindow$runFix(ai, $state, mutableState2, snapshotStateList, mutableState3, AiUiExtras.send$default(ai, t, AiFixWindow$lambda$9(mutableState3), null, 4, null));
        } else if (ai.steer(t)) {
            AiFixWindow$upsert(snapshotStateList, new AiItem.User("steer-" + System.nanoTime(), t));
            mutableState.setValue("");
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r12v4 ??, still in use, count: 1, list:
          (r12v4 ?? I:??[int, boolean, OBJECT, ARRAY, byte, short, char]) from 0x00fc: IF  (r12v4 ?? I:??[int, boolean, OBJECT, ARRAY, byte, short, char]) == (0 ??[int, boolean, OBJECT, ARRAY, byte, short, char])  -> B:17:0x0104
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1119)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:110)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit AiFixWindow$lambda$18(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r12v4 ??, still in use, count: 1, list:
          (r12v4 ?? I:??[int, boolean, OBJECT, ARRAY, byte, short, char]) from 0x00fc: IF  (r12v4 ?? I:??[int, boolean, OBJECT, ARRAY, byte, short, char]) == (0 ??[int, boolean, OBJECT, ARRAY, byte, short, char])  -> B:17:0x0104
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1119)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:110)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r105v0 ??
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
    public static final Unit AiFixWindow$lambda$18$0$2$1$0$0(AiUiExtras $ai, AppState $state, MutableState $started$delegate, SnapshotStateList $items, String $visible, CrashInfo $info, MutableState $chatId$delegate, MutableState $running$delegate) {
        AiFixWindow$start($ai, $state, $started$delegate, $items, $visible, $info, $chatId$delegate, $running$delegate);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AiFixWindow$lambda$18$0$2$2$0(final SnapshotStateList $items, final AppState $state, final AiUiExtras $ai, final String $visible, final CrashInfo $info, final MutableState $running$delegate, final MutableState $chatId$delegate, LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        final SnapshotStateList snapshotStateList = $items;
        final Function1 function1 = new Function1() { // from class: com.pymcl.android.ui.dialogs.AiFixWindowKt$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AiFixWindowKt.AiFixWindow$lambda$18$0$2$2$0$0((AiItem) obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: com.pymcl.android.ui.dialogs.AiFixWindowKt$AiFixWindow$lambda$18$0$2$2$0$$inlined$items$default$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object p1) {
                return invoke((AiItem) p1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Void invoke(AiItem aiItem) {
                return null;
            }
        };
        LazyColumn.items(snapshotStateList.size(), new Function1<Integer, Object>() { // from class: com.pymcl.android.ui.dialogs.AiFixWindowKt$AiFixWindow$lambda$18$0$2$2$0$$inlined$items$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int index) {
                return function1.invoke(snapshotStateList.get(index));
            }
        }, new Function1<Integer, Object>() { // from class: com.pymcl.android.ui.dialogs.AiFixWindowKt$AiFixWindow$lambda$18$0$2$2$0$$inlined$items$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int index) {
                return function12.invoke(snapshotStateList.get(index));
            }
        }, ComposableLambdaKt.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.pymcl.android.ui.dialogs.AiFixWindowKt$AiFixWindow$lambda$18$0$2$2$0$$inlined$items$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(4);
            }

            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) throws XmlPullParserException, Resources.NotFoundException, IllegalArgumentException {
                invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                return Unit.INSTANCE;
            }

            /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v13 ??, still in use, count: 1, list:
                  (r1v13 ?? I:??[int, boolean, OBJECT, ARRAY, byte, short, char]) from 0x00a9: IF  (r14v0 ?? I:??[int, boolean, OBJECT, ARRAY, byte, short, char] A[D('it\2' java.lang.Object)]) != (r1v13 ?? I:??[int, boolean, OBJECT, ARRAY, byte, short, char])  -> B:33:0x00d9
                	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
                	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
                	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
                	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1119)
                	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:110)
                	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
                	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
                */
            /* JADX WARN: Not initialized variable reg: 18, insn: 0x00a5: INVOKE (r1 I:void) = (r17v2 ?? I:java.io.File), (r18 I:java.lang.String) VIRTUAL call: java.io.File.<init>(java.lang.String):void A[MD:(java.lang.String):void (c)], block:B:28:0x00a3 */
            public final void invoke(
            /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v13 ??, still in use, count: 1, list:
                  (r1v13 ?? I:??[int, boolean, OBJECT, ARRAY, byte, short, char]) from 0x00a9: IF  (r14v0 ?? I:??[int, boolean, OBJECT, ARRAY, byte, short, char] A[D('it\2' java.lang.Object)]) != (r1v13 ?? I:??[int, boolean, OBJECT, ARRAY, byte, short, char])  -> B:33:0x00d9
                	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
                	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
                	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
                	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1119)
                	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:110)
                	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
                */
            /*  JADX ERROR: Method generation error
                jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r27v0 ??
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
                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:845)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1143)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:910)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:422)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1143)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:910)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:422)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:298)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:277)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:410)
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
        }));
        if (AiFixWindow$lambda$3($running$delegate) && (CollectionsKt.lastOrNull((List) $items) instanceof AiItem.User)) {
            ComposableSingletons$AiFixWindowKt.INSTANCE.m7608getLambda$188096457$PyMCL_Android_app_debug();
            FileDialog.getFilenameFilter();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object AiFixWindow$lambda$18$0$2$2$0$0(AiItem it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getId() + Reflection.getOrCreateKotlinClass(it.getClass()).getSimpleName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AiFixWindow$lambda$18$0$3$0$0(MutableState $input$delegate, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $input$delegate.setValue(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AiFixWindow$lambda$18$0$3$1$0(AiUiExtras $ai) {
        if ($ai != null) {
            $ai.stop();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AiFixWindow$lambda$18$0$3$2$0(AiUiExtras $ai, MutableState $input$delegate, MutableState $running$delegate, SnapshotStateList $items, MutableState $chatId$delegate, AppState $state) {
        AiFixWindow$sendMore($ai, $input$delegate, $running$delegate, $items, $chatId$delegate, $state);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AiFixWindow$lambda$18$0$3$3$0(Function0 $onDismiss, AppState $state) {
        $onDismiss.invoke();
        AppState.close$default($state, null, 1, null);
        $state.navigate(Destination.Ai);
        return Unit.INSTANCE;
    }
}
