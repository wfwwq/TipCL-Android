package com.pymcl.android.ui.dialogs;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import androidx.activity.compose.ManagedActivityResultLauncher;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.platform.ClipboardManager;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.unit.Dp;
import androidx.core.app.NotificationCompat;
import com.pymcl.android.data.CreateDocumentAt;
import com.pymcl.android.data.SaveExportMemory;
import com.pymcl.android.data.SaveGuard;
import com.pymcl.android.data.SaveImportData;
import com.pymcl.android.data.SaveImportProgress;
import com.pymcl.android.data.SavesData;
import com.pymcl.android.ui.components.UiKt;
import com.pymcl.android.ui.i18n.I18nKt;
import com.pymcl.android.ui.state.AppState;
import com.pymcl.android.ui.state.DialogSpec;
import com.pymcl.core.instance.MediaFile;
import com.pymcl.core.instance.MediaKind;
import com.pymcl.core.instance.SaveBackup;
import com.pymcl.core.instance.SaveImport;
import com.pymcl.core.instance.SaveInfo;
import com.pymcl.core.instance.SaveManager;
import com.pymcl.core.instance.SaveTarget;
import com.pymcl.core.instance.TrashEntry;
import com.pymcl.runtime.settings.CrossProcessPrefs;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;
import kotlinx.coroutines.Job;
import org.apache.commons.lang3.StringUtils;

/* compiled from: SavesDialog.kt */
@Metadata(d1 = {"\u0000\u0098\u0001\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\u001a=\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007H\u0001b\u0002\b\tb\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f¢\u0006\u0002\u0010\b\u001a\\\u0010\r\u001a\u00020\u00012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\u0011\u0010\u0016\u001a\r\u0012\u0004\u0012\u00020\u00010\u0007¢\u0006\u0002\b\tH\u0003b\u0002\b\tb\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u001b¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u001c²\u0006\n\u0010\u001d\u001a\u00020\u001eX\u008a\u008e\u0002²\u0006\u0010\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020!0 X\u008a\u008e\u0002²\u0006\n\u0010\"\u001a\u00020\u001eX\u008a\u008e\u0002²\u0006\n\u0010#\u001a\u00020\u001eX\u008a\u008e\u0002²\u0006\f\u0010$\u001a\u0004\u0018\u00010\u000fX\u008a\u008e\u0002²\u0006\u0012\u0010%\u001a\n\u0012\u0004\u0012\u00020&\u0018\u00010 X\u008a\u008e\u0002²\u0006\u0010\u0010'\u001a\b\u0012\u0004\u0012\u00020(0 X\u008a\u008e\u0002²\u0006\u0010\u0010)\u001a\b\u0012\u0004\u0012\u00020*0 X\u008a\u008e\u0002²\u0006\u0012\u0010+\u001a\n\u0012\u0004\u0012\u00020,\u0018\u00010 X\u008a\u008e\u0002²\u0006\f\u0010-\u001a\u0004\u0018\u00010\u000fX\u008a\u008e\u0002²\u0006\f\u0010.\u001a\u0004\u0018\u00010\u000fX\u008a\u008e\u0002²\u0006\u0010\u0010/\u001a\b\u0012\u0004\u0012\u0002000 X\u008a\u008e\u0002²\u0006\u001e\u00101\u001a\u0016\u0012\u0004\u0012\u00020,\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0 \u0018\u000102X\u008a\u008e\u0002²\u0006\f\u00103\u001a\u0004\u0018\u00010,X\u008a\u008e\u0002²\u0006\n\u00104\u001a\u000205X\u008a\u008e\u0002²\u0006\f\u00106\u001a\u0004\u0018\u00010\u000fX\u008a\u008e\u0002²\u0006\n\u00107\u001a\u000205X\u008a\u008e\u0002²\u0006\f\u00108\u001a\u0004\u0018\u00010\u000fX\u008a\u008e\u0002²\u0006\n\u00109\u001a\u000205X\u008a\u008e\u0002²\u0006\n\u0010:\u001a\u000205X\u008a\u008e\u0002²\u0006\u001e\u0010;\u001a\u0016\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020=\u0018\u00010<X\u008a\u008e\u0002²\u0006\f\u0010>\u001a\u0004\u0018\u00010?X\u008a\u0084\u0002"}, d2 = {"SavesSheet", "", "state", "Lcom/pymcl/android/ui/state/AppState;", "d", "Lcom/pymcl/android/ui/state/DialogSpec$Saves;", "close", "Lkotlin/Function0;", "(Lcom/pymcl/android/ui/state/AppState;Lcom/pymcl/android/ui/state/DialogSpec$Saves;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/runtime/Composable;", "Landroidx/compose/runtime/ComposableTarget;", "applier", "androidx.compose.ui.UiComposable", "LocalThumb", "path", "", "size", "Landroidx/compose/ui/unit/Dp;", "modifier", "Landroidx/compose/ui/Modifier;", "scale", "Landroidx/compose/ui/layout/ContentScale;", "fallback", "LocalThumb-EUb7tLY", "(Ljava/lang/String;FLandroidx/compose/ui/Modifier;Landroidx/compose/ui/layout/ContentScale;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/runtime/ComposableInferredTarget;", "scheme", "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]", "PyMCL-Android:app_debug", "tab", "", "targets", "", "Lcom/pymcl/core/instance/SaveTarget;", "targetIdx", "gen", NotificationCompat.CATEGORY_ERROR, "saves", "Lcom/pymcl/core/instance/SaveInfo;", "backups", "Lcom/pymcl/core/instance/SaveBackup;", "trash", "Lcom/pymcl/core/instance/TrashEntry;", "media", "Lcom/pymcl/core/instance/MediaFile;", "expanded", "packFor", "packs", "Ljava/io/File;", "viewer", "Lkotlin/Pair;", "preview", "busy", "", "pendingExport", "rememberExport", "lastExport", "dropHover", "targetsLoaded", "imp", "Lkotlin/Triple;", "", "bm", "Landroid/graphics/Bitmap;"}, k = 2, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class SavesDialogKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LocalThumb_EUb7tLY$lambda$3(String str, float f, Modifier modifier, ContentScale contentScale, Function2 function2, int i, int i2, Composer composer, int i3) {
        m7690LocalThumbEUb7tLY(str, f, modifier, contentScale, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SavesSheet$lambda$76(AppState appState, DialogSpec.Saves saves, Function0 function0, int i, Composer composer, int i2) {
        SavesSheet(appState, saves, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r13v0 ??, still in use, count: 1, list:
          (r13v0 ?? I:??[int, boolean, OBJECT, ARRAY, byte, short, char]) from 0x00d3: IF  (r10v3 ?? I:??[int, boolean, OBJECT, ARRAY, byte, short, char] A[D('it\3' java.lang.Object)]) != (r13v0 ?? I:??[int, boolean, OBJECT, ARRAY, byte, short, char])  -> B:42:0x00e1
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1119)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:110)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    /* JADX WARN: Not initialized variable reg: 18, insn: 0x00cf: INVOKE (r13 I:void) = (r17v0 ?? I:java.io.File), (r18 I:java.lang.String) VIRTUAL call: java.io.File.<init>(java.lang.String):void A[MD:(java.lang.String):void (c)], block:B:38:0x0086 */
    /* JADX WARN: Not initialized variable reg: 21, insn: 0x012a: INVOKE (r7 I:void) = (r20v1 ?? I:java.io.File), (r21 I:java.lang.String) VIRTUAL call: java.io.File.<init>(java.lang.String):void A[MD:(java.lang.String):void (c)], block:B:46:0x0113 */
    /* JADX WARN: Not initialized variable reg: 28, insn: 0x04f6: INVOKE (r0 I:void) = (r27v12 ?? I:java.io.File), (r28 I:java.lang.String) VIRTUAL call: java.io.File.<init>(java.lang.String):void A[MD:(java.lang.String):void (c)], block:B:140:0x04dd */
    public static final void SavesSheet(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r13v0 ??, still in use, count: 1, list:
          (r13v0 ?? I:??[int, boolean, OBJECT, ARRAY, byte, short, char]) from 0x00d3: IF  (r10v3 ?? I:??[int, boolean, OBJECT, ARRAY, byte, short, char] A[D('it\3' java.lang.Object)]) != (r13v0 ?? I:??[int, boolean, OBJECT, ARRAY, byte, short, char])  -> B:42:0x00e1
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1119)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:110)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r50v0 ??
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
    /* JADX WARN: Type inference failed for: r0v2, types: [int, void] */
    public static final int SavesSheet$lambda$1(MutableIntState $tab$delegate) {
        MutableIntState mutableIntState = $tab$delegate;
        return mutableIntState.setCurrentDirectory(mutableIntState);
    }

    private static final List<SaveTarget> SavesSheet$lambda$4(MutableState<List<SaveTarget>> mutableState) {
        return mutableState.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [int, void] */
    private static final int SavesSheet$lambda$7(MutableIntState $targetIdx$delegate) {
        MutableIntState mutableIntState = $targetIdx$delegate;
        return mutableIntState.setCurrentDirectory(mutableIntState);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v2, types: [int, void] */
    public static final int SavesSheet$lambda$10(MutableIntState $gen$delegate) {
        MutableIntState mutableIntState = $gen$delegate;
        return mutableIntState.setCurrentDirectory(mutableIntState);
    }

    private static final String SavesSheet$lambda$13(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    private static final List<SaveInfo> SavesSheet$lambda$16(MutableState<List<SaveInfo>> mutableState) {
        return mutableState.getValue();
    }

    private static final List<SaveBackup> SavesSheet$lambda$19(MutableState<List<SaveBackup>> mutableState) {
        return mutableState.getValue();
    }

    private static final List<TrashEntry> SavesSheet$lambda$22(MutableState<List<TrashEntry>> mutableState) {
        return mutableState.getValue();
    }

    private static final List<MediaFile> SavesSheet$lambda$25(MutableState<List<MediaFile>> mutableState) {
        return mutableState.getValue();
    }

    private static final String SavesSheet$lambda$28(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    private static final String SavesSheet$lambda$31(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    private static final List<File> SavesSheet$lambda$34(MutableState<List<File>> mutableState) {
        return mutableState.getValue();
    }

    private static final Pair<MediaFile, List<String>> SavesSheet$lambda$37(MutableState<Pair<MediaFile, List<String>>> mutableState) {
        return mutableState.getValue();
    }

    private static final MediaFile SavesSheet$lambda$40(MutableState<MediaFile> mutableState) {
        return mutableState.getValue();
    }

    private static final boolean SavesSheet$lambda$43(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void SavesSheet$lambda$44(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final String SavesSheet$lambda$46(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    private static final boolean SavesSheet$lambda$50(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void SavesSheet$lambda$51(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final String SavesSheet$lambda$53(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    private static final boolean SavesSheet$lambda$56(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void SavesSheet$lambda$57(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final boolean SavesSheet$lambda$59(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void SavesSheet$lambda$60(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final boolean SavesSheet$blocked(com.pymcl.core.instance.SaveManager r8, com.pymcl.android.ui.state.AppState r9, android.content.Context r10, com.pymcl.android.data.SaveGuard.Op r11) {
        /*
            r0 = 1
            if (r8 != 0) goto L4
            return r0
        L4:
            r1 = r8
            boolean r2 = r9.getGameRunning()
            r3 = 0
            if (r2 != 0) goto L41
            kotlin.Result$Companion r2 = kotlin.Result.INSTANCE     // Catch: java.lang.Throwable -> L20
            r2 = 0
            com.pymcl.android.ui.state.LauncherUiApi r4 = r9.getApi()     // Catch: java.lang.Throwable -> L20
            boolean r4 = r4.isGameRunning()     // Catch: java.lang.Throwable -> L20
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r4)     // Catch: java.lang.Throwable -> L20
            java.lang.Object r2 = kotlin.Result.m8116constructorimpl(r2)     // Catch: java.lang.Throwable -> L20
            goto L2b
        L20:
            r2 = move-exception
            kotlin.Result$Companion r4 = kotlin.Result.INSTANCE
            java.lang.Object r2 = kotlin.ResultKt.createFailure(r2)
            java.lang.Object r2 = kotlin.Result.m8116constructorimpl(r2)
        L2b:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r3)
            boolean r5 = kotlin.Result.m8122isFailureimpl(r2)
            if (r5 == 0) goto L36
            r2 = r4
        L36:
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L3f
            goto L41
        L3f:
            r2 = r3
            goto L42
        L41:
            r2 = r0
        L42:
            r4 = 0
            if (r2 == 0) goto L74
            kotlin.Result$Companion r5 = kotlin.Result.INSTANCE     // Catch: java.lang.Throwable -> L5f
            r5 = 0
            com.pymcl.runtime.GameSession$Companion r6 = com.pymcl.runtime.GameSession.INSTANCE     // Catch: java.lang.Throwable -> L5f
            com.pymcl.runtime.GameSession r6 = r6.of(r10)     // Catch: java.lang.Throwable -> L5f
            com.pymcl.runtime.GameSession$Info r6 = r6.read()     // Catch: java.lang.Throwable -> L5f
            if (r6 == 0) goto L59
            java.lang.String r6 = r6.getGameDir()     // Catch: java.lang.Throwable -> L5f
            goto L5a
        L59:
            r6 = r4
        L5a:
            java.lang.Object r5 = kotlin.Result.m8116constructorimpl(r6)     // Catch: java.lang.Throwable -> L5f
            goto L6a
        L5f:
            r5 = move-exception
            kotlin.Result$Companion r6 = kotlin.Result.INSTANCE
            java.lang.Object r5 = kotlin.ResultKt.createFailure(r5)
            java.lang.Object r5 = kotlin.Result.m8116constructorimpl(r5)
        L6a:
            boolean r6 = kotlin.Result.m8122isFailureimpl(r5)
            if (r6 == 0) goto L71
            goto L72
        L71:
            r4 = r5
        L72:
            java.lang.String r4 = (java.lang.String) r4
        L74:
            com.pymcl.android.data.SaveGuard r5 = com.pymcl.android.data.SaveGuard.INSTANCE
            java.io.File r6 = r1.getGameDir()
            java.lang.String r6 = r6.getAbsolutePath()
            java.lang.String r7 = "getAbsolutePath(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r7)
            java.lang.String r5 = r5.blockReason(r11, r2, r4, r6)
            if (r5 != 0) goto L8a
            return r3
        L8a:
            java.lang.String r6 = "游戏正在运行"
            java.lang.Object[] r7 = new java.lang.Object[r3]
            java.lang.String r6 = com.pymcl.android.ui.i18n.I18nKt.tr(r6, r7)
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r3 = com.pymcl.android.ui.i18n.I18nKt.tr(r5, r3)
            java.lang.String r7 = "warn"
            r9.toast(r6, r3, r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.android.ui.dialogs.SavesDialogKt.SavesSheet$blocked(com.pymcl.core.instance.SaveManager, com.pymcl.android.ui.state.AppState, android.content.Context, com.pymcl.android.data.SaveGuard$Op):boolean");
    }

    private static final void SavesSheet$act(AppState $state, MutableState<Boolean> mutableState, MutableIntState gen$delegate, String okTitle, String failTitle, Function1<? super Continuation<? super String>, ? extends Object> function1) {
        if (SavesSheet$lambda$43(mutableState)) {
            AppState.toast$default($state, I18nKt.tr("上一个操作还没完成", new Object[0]), null, "info", 2, null);
        } else {
            SavesSheet$lambda$44(mutableState, true);
            $state.launch(new SavesDialogKt$SavesSheet$act$1($state, okTitle, failTitle, function1, gen$delegate, mutableState, null));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SavesSheet$lambda$66$0(SaveManager $sm, MutableState $pendingExport$delegate, MutableState $rememberExport$delegate, MutableState $lastExport$delegate, CrossProcessPrefs $prefs, Context $ctx, AppState $state, MutableState $busy$delegate, MutableIntState $gen$delegate, Uri uri) {
        Object objM8116constructorimpl;
        String name = SavesSheet$lambda$46($pendingExport$delegate);
        $pendingExport$delegate.setValue(null);
        if (uri != null && name != null && $sm != null) {
            String store = SaveExportMemory.INSTANCE.toStore(SavesSheet$lambda$50($rememberExport$delegate), uri.toString());
            if (store != null) {
                $lastExport$delegate.setValue(store);
                try {
                    Result.Companion companion = Result.INSTANCE;
                    try {
                        $prefs.putString("saves_export_last_uri", store);
                        objM8116constructorimpl = Result.m8116constructorimpl(Unit.INSTANCE);
                    } catch (Throwable th) {
                        th = th;
                        Result.Companion companion2 = Result.INSTANCE;
                        objM8116constructorimpl = Result.m8116constructorimpl(ResultKt.createFailure(th));
                        Result.m8115boximpl(objM8116constructorimpl);
                        SavesSheet$act($state, $busy$delegate, $gen$delegate, "已导出", "导出失败", new SavesDialogKt$SavesSheet$exporter$1$1$2($ctx, uri, name, $sm, null));
                        return Unit.INSTANCE;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
                Result.m8115boximpl(objM8116constructorimpl);
            }
            SavesSheet$act($state, $busy$delegate, $gen$delegate, "已导出", "导出失败", new SavesDialogKt$SavesSheet$exporter$1$1$2($ctx, uri, name, $sm, null));
        }
        return Unit.INSTANCE;
    }

    private static final Triple<Integer, Integer, Long> SavesSheet$lambda$68(MutableState<Triple<Integer, Integer, Long>> mutableState) {
        return mutableState.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [T, kotlinx.coroutines.Job] */
    private static final void SavesSheet$runImport(SaveManager sm, AppState $state, AtomicReference<Job> atomicReference, MutableState<Boolean> mutableState, Context ctx, MutableState<Triple<Integer, Integer, Long>> mutableState2, MutableIntState gen$delegate, Function2<? super File, ? super SaveImportProgress.Cb, SaveImport.Result> function2) {
        if (sm == null) {
            return;
        }
        if (SavesSheet$lambda$43(mutableState)) {
            AppState.toast$default($state, I18nKt.tr("上一个操作还没完成", new Object[0]), null, "info", 2, null);
            return;
        }
        if (SavesSheet$blocked(sm, $state, ctx, SaveGuard.Op.IMPORT)) {
            return;
        }
        SavesSheet$lambda$44(mutableState, true);
        mutableState2.setValue(null);
        AtomicLong lastPost = new AtomicLong(0L);
        Ref.ObjectRef job = new Ref.ObjectRef();
        job.element = $state.launch(new SavesDialogKt$SavesSheet$runImport$1($state, function2, sm, lastPost, mutableState2, job, gen$delegate, mutableState, null));
        atomicReference.set(job.element);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SavesSheet$lambda$71$0(final Context $ctx, SaveManager $sm, AppState $state, AtomicReference $importJob, MutableState $busy$delegate, MutableState $imp$delegate, MutableIntState $gen$delegate, final Uri uri) {
        if (uri != null) {
            SavesSheet$runImport($sm, $state, $importJob, $busy$delegate, $ctx, $imp$delegate, $gen$delegate, new Function2() { // from class: com.pymcl.android.ui.dialogs.SavesDialogKt$$ExternalSyntheticLambda52
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SavesDialogKt.SavesSheet$lambda$71$0$0($ctx, uri, (File) obj, (SaveImportProgress.Cb) obj2);
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SaveImport.Result SavesSheet$lambda$71$0$0(Context $ctx, Uri $uri, File dir, SaveImportProgress.Cb cb) {
        Intrinsics.checkNotNullParameter(dir, "dir");
        Intrinsics.checkNotNullParameter(cb, "cb");
        return SaveImportData.INSTANCE.importZip($ctx, dir, $uri, cb);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SavesSheet$lambda$72$0(final Context $ctx, SaveManager $sm, AppState $state, AtomicReference $importJob, MutableState $busy$delegate, MutableState $imp$delegate, MutableIntState $gen$delegate, final Uri uri) {
        if (uri != null) {
            SavesSheet$runImport($sm, $state, $importJob, $busy$delegate, $ctx, $imp$delegate, $gen$delegate, new Function2() { // from class: com.pymcl.android.ui.dialogs.SavesDialogKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SavesDialogKt.SavesSheet$lambda$72$0$0($ctx, uri, (File) obj, (SaveImportProgress.Cb) obj2);
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SaveImport.Result SavesSheet$lambda$72$0$0(Context $ctx, Uri $uri, File dir, SaveImportProgress.Cb cb) {
        Intrinsics.checkNotNullParameter(dir, "dir");
        Intrinsics.checkNotNullParameter(cb, "cb");
        return SaveImportData.importTree$default(SaveImportData.INSTANCE, $ctx, dir, $uri, null, cb, 8, null);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r9v1 ??, still in use, count: 1, list:
          (r9v1 ?? I:??[int, boolean, OBJECT, ARRAY, byte, short, char]) from 0x0093: IF  (r7v0 ?? I:??[int, boolean, OBJECT, ARRAY, byte, short, char] A[D('it\1' java.lang.Object)]) != (r9v1 ?? I:??[int, boolean, OBJECT, ARRAY, byte, short, char])  -> B:25:0x00a3
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1119)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:110)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit SavesSheet$lambda$74(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r9v1 ??, still in use, count: 1, list:
          (r9v1 ?? I:??[int, boolean, OBJECT, ARRAY, byte, short, char]) from 0x0093: IF  (r7v0 ?? I:??[int, boolean, OBJECT, ARRAY, byte, short, char] A[D('it\1' java.lang.Object)]) != (r9v1 ?? I:??[int, boolean, OBJECT, ARRAY, byte, short, char])  -> B:25:0x00a3
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1119)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:110)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r17v0 ??
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
    public static final Unit SavesSheet$lambda$74$0$0(MutableIntState $gen$delegate) {
        $gen$delegate.setIntValue(SavesSheet$lambda$10($gen$delegate) + 1);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SavesSheet$lambda$74$1$0$0(ClipboardManager $clip, SaveManager $m, AppState $state) {
        String absolutePath = $m.getGameDir().getAbsolutePath();
        Intrinsics.checkNotNullExpressionValue(absolutePath, "getAbsolutePath(...)");
        $clip.setText(new AnnotatedString(absolutePath, null, 2, null));
        String absolutePath2 = $m.getGameDir().getAbsolutePath();
        Intrinsics.checkNotNullExpressionValue(absolutePath2, "getAbsolutePath(...)");
        AppState.toast$default($state, "已复制", absolutePath2, null, 4, null);
        return Unit.INSTANCE;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r13v1 ??, still in use, count: 1, list:
          (r13v1 ?? I:??[int, boolean, OBJECT, ARRAY, byte, short, char]) from 0x00cb: IF  (r10v0 ?? I:??[int, boolean, OBJECT, ARRAY, byte, short, char] A[D('it\2' java.lang.Object)]) != (r13v1 ?? I:??[int, boolean, OBJECT, ARRAY, byte, short, char])  -> B:20:0x00e1
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1119)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:110)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Not initialized variable reg: 31, insn: 0x01de: INVOKE (r10 I:void) = (r30v6 ?? I:java.io.File), (r31 I:java.lang.String) VIRTUAL call: java.io.File.<init>(java.lang.String):void A[MD:(java.lang.String):void (c)], block:B:37:0x01b6 */
    /* JADX WARN: Not initialized variable reg: 34, insn: 0x022d: INVOKE (r1 I:void) = (r33v6 ?? I:java.io.File), (r34 I:java.lang.String) VIRTUAL call: java.io.File.<init>(java.lang.String):void A[MD:(java.lang.String):void (c)], block:B:43:0x022b */
    public static final kotlin.Unit SavesSheet$lambda$75(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r13v1 ??, still in use, count: 1, list:
          (r13v1 ?? I:??[int, boolean, OBJECT, ARRAY, byte, short, char]) from 0x00cb: IF  (r10v0 ?? I:??[int, boolean, OBJECT, ARRAY, byte, short, char] A[D('it\2' java.lang.Object)]) != (r13v1 ?? I:??[int, boolean, OBJECT, ARRAY, byte, short, char])  -> B:20:0x00e1
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1119)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:110)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r129v0 ??
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
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r8v2 ??, still in use, count: 1, list:
          (r8v2 ?? I:??[int, boolean, OBJECT, ARRAY, byte, short, char]) from 0x0094: IF  (r5v3 ?? I:??[int, boolean, OBJECT, ARRAY, byte, short, char] A[D('it\4' java.lang.Object)]) != (r8v2 ?? I:??[int, boolean, OBJECT, ARRAY, byte, short, char])  -> B:26:0x00b5
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1119)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:110)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit SavesSheet$lambda$75$0(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r8v2 ??, still in use, count: 1, list:
          (r8v2 ?? I:??[int, boolean, OBJECT, ARRAY, byte, short, char]) from 0x0094: IF  (r5v3 ?? I:??[int, boolean, OBJECT, ARRAY, byte, short, char] A[D('it\4' java.lang.Object)]) != (r8v2 ?? I:??[int, boolean, OBJECT, ARRAY, byte, short, char])  -> B:26:0x00b5
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1119)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:110)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r20v0 ??
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
    public static final Unit SavesSheet$lambda$75$0$1$0(MutableIntState $targetIdx$delegate, MutableState $saves$delegate, MutableState $backups$delegate, MutableState $trash$delegate, MutableState $media$delegate, MutableState $expanded$delegate, MutableState $packFor$delegate, MutableState $viewer$delegate, MutableState $preview$delegate, int it) {
        if (it != SavesSheet$lambda$7($targetIdx$delegate)) {
            $saves$delegate.setValue(null);
            $backups$delegate.setValue(CollectionsKt.emptyList());
            $trash$delegate.setValue(CollectionsKt.emptyList());
            $media$delegate.setValue(null);
        }
        $targetIdx$delegate.setIntValue(it);
        $expanded$delegate.setValue(null);
        $packFor$delegate.setValue(null);
        $viewer$delegate.setValue(null);
        $preview$delegate.setValue(null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SavesSheet$lambda$75$1$0(MutableIntState $tab$delegate, MutableState $viewer$delegate, MutableState $preview$delegate, MutableState $media$delegate, int it) {
        $tab$delegate.setIntValue(it);
        $viewer$delegate.setValue(null);
        $preview$delegate.setValue(null);
        $media$delegate.setValue(null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SavesSheet$lambda$75$3$0(MutableState $dropHover$delegate, boolean it) {
        SavesSheet$lambda$57($dropHover$delegate, it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SavesSheet$lambda$75$4$0(final Context $ctx, SaveManager $sm, AppState $state, AtomicReference $importJob, MutableState $busy$delegate, MutableState $imp$delegate, MutableIntState $gen$delegate, List us) {
        Intrinsics.checkNotNullParameter(us, "us");
        Iterator it = us.iterator();
        while (it.hasNext()) {
            final Uri uri = (Uri) it.next();
            SavesSheet$runImport($sm, $state, $importJob, $busy$delegate, $ctx, $imp$delegate, $gen$delegate, new Function2() { // from class: com.pymcl.android.ui.dialogs.SavesDialogKt$$ExternalSyntheticLambda53
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SavesDialogKt.SavesSheet$lambda$75$4$0$0$0($ctx, uri, (File) obj, (SaveImportProgress.Cb) obj2);
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SaveImport.Result SavesSheet$lambda$75$4$0$0$0(Context $ctx, Uri $u, File dir, SaveImportProgress.Cb cb) {
        Intrinsics.checkNotNullParameter(dir, "dir");
        Intrinsics.checkNotNullParameter(cb, "cb");
        return SaveImportData.INSTANCE.importAny($ctx, dir, $u, cb);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SavesSheet$lambda$75$5$0(AppState $state, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $state.toast(SavesStringsKt.st("导入失败", new Object[0]), it, "error");
        return Unit.INSTANCE;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r10v5 ??, still in use, count: 1, list:
          (r10v5 ?? I:??[int, boolean, OBJECT, ARRAY, byte, short, char]) from 0x0116: IF  (r10v5 ?? I:??[int, boolean, OBJECT, ARRAY, byte, short, char]) == (0 ??[int, boolean, OBJECT, ARRAY, byte, short, char])  -> B:21:0x011e
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1119)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:110)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit SavesSheet$lambda$75$6$0(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r10v5 ??, still in use, count: 1, list:
          (r10v5 ?? I:??[int, boolean, OBJECT, ARRAY, byte, short, char]) from 0x0116: IF  (r10v5 ?? I:??[int, boolean, OBJECT, ARRAY, byte, short, char]) == (0 ??[int, boolean, OBJECT, ARRAY, byte, short, char])  -> B:21:0x011e
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1119)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:110)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r64v0 ??
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
    public static final Unit SavesSheet$lambda$75$6$0$0$0$0(ManagedActivityResultLauncher $zipPicker) {
        $zipPicker.launch(SaveImportData.INSTANCE.getZIP_MIMES());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SavesSheet$lambda$75$6$0$0$1$0(ManagedActivityResultLauncher $treePicker) {
        $treePicker.launch(null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SavesSheet$lambda$75$6$0$1$0$0$0(AtomicReference $importJob) {
        Job job = (Job) $importJob.get();
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SavesSheet$lambda$75$6$0$2$0$0$0(BoxScope $this_Box, MutableState $rememberExport$delegate, CrossProcessPrefs $prefs, MutableState $lastExport$delegate, boolean on) {
        SavesSheet$lambda$51($rememberExport$delegate, on);
        try {
            Result.Companion companion = Result.INSTANCE;
            $prefs.putBoolean("saves_remember_export_dir", on);
            Result.m8116constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m8116constructorimpl(ResultKt.createFailure(th));
        }
        if (!SaveExportMemory.INSTANCE.keepLastAfterToggle(on)) {
            $lastExport$delegate.setValue(null);
            try {
                Result.Companion companion3 = Result.INSTANCE;
                Result.m8116constructorimpl(Boolean.valueOf($prefs.put("saves_export_last_uri", null)));
            } catch (Throwable th2) {
                Result.Companion companion4 = Result.INSTANCE;
                Result.m8116constructorimpl(ResultKt.createFailure(th2));
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SavesSheet$lambda$75$6$0$2$1$0(RowScope $this_Row, AppState $state, MutableState $lastExport$delegate, CrossProcessPrefs $prefs) {
        $lastExport$delegate.setValue(null);
        try {
            Result.Companion companion = Result.INSTANCE;
            Result.m8116constructorimpl(Boolean.valueOf($prefs.put("saves_export_last_uri", null)));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m8116constructorimpl(ResultKt.createFailure(th));
        }
        AppState.toast$default($state, SavesStringsKt.st("已忘记导出位置", new Object[0]), null, null, 6, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SavesSheet$lambda$75$6$1$0$0$0(SaveInfo $s, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C224@13355L30:SavesDialog.kt#2dz5k2");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1224532151, $changed, -1, "com.pymcl.android.ui.dialogs.SavesSheet.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SavesDialog.kt:224)");
            }
            UiKt.m7600LetterTileuFdPcIQ($s.getLevelName(), Dp.m7018constructorimpl(36), false, $composer, 48, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SavesSheet$lambda$75$6$1$0$0$2$0(AppState $state, SaveInfo $s, SaveManager $sm, MutableState $busy$delegate, MutableIntState $gen$delegate) {
        AppState.toast$default($state, "已开始备份", $s.getLevelName(), null, 4, null);
        SavesSheet$act($state, $busy$delegate, $gen$delegate, "已备份", "备份失败", new SavesDialogKt$SavesSheet$4$7$2$1$1$3$1$1($sm, $s, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SavesSheet$lambda$75$6$1$0$0$3$0(SaveInfo $s, MutableState $expanded$delegate) {
        $expanded$delegate.setValue(Intrinsics.areEqual(SavesSheet$lambda$28($expanded$delegate), $s.getDirName()) ? null : $s.getDirName());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SavesSheet$lambda$75$6$1$0$1$0$0(SaveInfo $s, ManagedActivityResultLauncher $exporter, MutableState $pendingExport$delegate, MutableState $rememberExport$delegate, MutableState $lastExport$delegate) {
        $pendingExport$delegate.setValue($s.getDirName());
        $exporter.launch(new CreateDocumentAt.Request($s.getDirName() + ".zip", SaveExportMemory.INSTANCE.initialUri(SavesSheet$lambda$50($rememberExport$delegate), SavesSheet$lambda$53($lastExport$delegate))));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SavesSheet$lambda$75$6$1$0$1$1$0(final AppState $state, final SaveInfo $s, MutableState $saves$delegate, final SaveManager $sm, final Context $ctx, final MutableState $busy$delegate, final MutableIntState $gen$delegate) {
        Iterable iterableSavesSheet$lambda$16 = SavesSheet$lambda$16($saves$delegate);
        if (iterableSavesSheet$lambda$16 == null) {
            iterableSavesSheet$lambda$16 = CollectionsKt.emptyList();
        }
        Iterable iterable = iterableSavesSheet$lambda$16;
        Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(((SaveInfo) it.next()).getDirName());
        }
        final List others = (List) arrayList;
        if (!SavesSheet$blocked($sm, $state, $ctx, SaveGuard.Op.RENAME)) {
            $state.open(new DialogSpec.Prompt("重命名", "新名称", $s.getDirName(), new Function1() { // from class: com.pymcl.android.ui.dialogs.SavesDialogKt$$ExternalSyntheticLambda22
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SavesDialogKt.SavesSheet$lambda$75$6$1$0$1$1$0$1($s, others, (String) obj);
                }
            }, new Function1() { // from class: com.pymcl.android.ui.dialogs.SavesDialogKt$$ExternalSyntheticLambda33
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SavesDialogKt.SavesSheet$lambda$75$6$1$0$1$1$0$2($sm, $state, $ctx, $s, $busy$delegate, $gen$delegate, (String) obj);
                }
            }));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String SavesSheet$lambda$75$6$1$0$1$1$0$1(SaveInfo $s, List $others, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        String strRenameProblem = SaveGuard.INSTANCE.renameProblem(it, $s.getDirName(), $others);
        if (strRenameProblem != null) {
            return I18nKt.tr(strRenameProblem, new Object[0]);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SavesSheet$lambda$75$6$1$0$1$1$0$2(SaveManager $sm, AppState $state, Context $ctx, SaveInfo $s, MutableState $busy$delegate, MutableIntState $gen$delegate, String n0) {
        Intrinsics.checkNotNullParameter(n0, "n0");
        String n = StringsKt.trim((CharSequence) n0).toString();
        if (!SavesSheet$blocked($sm, $state, $ctx, SaveGuard.Op.RENAME)) {
            SavesSheet$act($state, $busy$delegate, $gen$delegate, "已重命名", "重命名失败", new SavesDialogKt$SavesSheet$4$7$2$1$2$2$1$2$1($sm, $s, n, null));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SavesSheet$lambda$75$6$1$0$1$2$0(AppState $state, SaveInfo $s, Context $ctx, SaveManager $sm, MutableState $packs$delegate, MutableState $packFor$delegate) {
        $state.launch(new SavesDialogKt$SavesSheet$4$7$2$1$2$3$1$1($s, $ctx, $sm, $packs$delegate, $packFor$delegate, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SavesSheet$lambda$75$6$1$0$1$3$0(final AppState $state, final SaveInfo $s, final SaveManager $sm, final Context $ctx, final MutableState $busy$delegate, final MutableIntState $gen$delegate) {
        $state.open(new DialogSpec.Confirm("删除存档", I18nKt.tr("「{0}」会移到这个游戏目录的 .trash 回收目录，需要时可以在下面「回收目录」里恢复；清空回收目录后才真正删除。", $s.getLevelName()), "删除", true, true, new Function0() { // from class: com.pymcl.android.ui.dialogs.SavesDialogKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SavesDialogKt.SavesSheet$lambda$75$6$1$0$1$3$0$0($sm, $state, $ctx, $s, $busy$delegate, $gen$delegate);
            }
        }));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SavesSheet$lambda$75$6$1$0$1$3$0$0(SaveManager $sm, AppState $state, Context $ctx, SaveInfo $s, MutableState $busy$delegate, MutableIntState $gen$delegate) {
        if (!SavesSheet$blocked($sm, $state, $ctx, SaveGuard.Op.DELETE)) {
            SavesSheet$act($state, $busy$delegate, $gen$delegate, "已删除", "删除失败", new SavesDialogKt$SavesSheet$4$7$2$1$2$4$1$1$1($sm, $s, null));
        }
        return Unit.INSTANCE;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r10v5 ??, still in use, count: 1, list:
          (r10v5 ?? I:??[int, boolean, OBJECT, ARRAY, byte, short, char]) from 0x00bc: IF  (r10v5 ?? I:??[int, boolean, OBJECT, ARRAY, byte, short, char]) == (0 ??[int, boolean, OBJECT, ARRAY, byte, short, char])  -> B:24:0x00c4
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1119)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:110)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit SavesSheet$lambda$75$6$1$0$2(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r10v5 ??, still in use, count: 1, list:
          (r10v5 ?? I:??[int, boolean, OBJECT, ARRAY, byte, short, char]) from 0x00bc: IF  (r10v5 ?? I:??[int, boolean, OBJECT, ARRAY, byte, short, char]) == (0 ??[int, boolean, OBJECT, ARRAY, byte, short, char])  -> B:24:0x00c4
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1119)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:110)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r61v0 ??
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
    public static final Unit SavesSheet$lambda$75$6$1$0$2$0$0$0(MutableState $packFor$delegate) {
        $packFor$delegate.setValue(null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SavesSheet$lambda$75$6$1$0$2$2$0$0$0(SaveManager $sm, AppState $state, Context $ctx, SaveInfo $s, File $p, MutableState $busy$delegate, MutableIntState $gen$delegate) {
        if (!SavesSheet$blocked($sm, $state, $ctx, SaveGuard.Op.DATAPACK)) {
            SavesSheet$act($state, $busy$delegate, $gen$delegate, "已安装", "安装失败", new SavesDialogKt$SavesSheet$4$7$2$1$3$2$1$1$1$1($sm, $s, $p, null));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SavesSheet$lambda$75$6$2$0$1$0(final AppState $state, final SaveBackup $b, final SaveManager $sm, final Context $ctx, MutableState $saves$delegate, final MutableState $busy$delegate, final MutableIntState $gen$delegate) {
        boolean z;
        if (SavesSheet$blocked($sm, $state, $ctx, SaveGuard.Op.RESTORE)) {
            return Unit.INSTANCE;
        }
        Iterable iterableSavesSheet$lambda$16 = SavesSheet$lambda$16($saves$delegate);
        if (iterableSavesSheet$lambda$16 == null) {
            iterableSavesSheet$lambda$16 = CollectionsKt.emptyList();
        }
        Iterable iterable = iterableSavesSheet$lambda$16;
        if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
            Iterator it = iterable.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (Intrinsics.areEqual(((SaveInfo) it.next()).getDirName(), $b.getSaveName())) {
                        z = true;
                        break;
                    }
                } else {
                    z = false;
                    break;
                }
            }
        } else {
            z = false;
        }
        boolean exists = z;
        if (exists) {
            $state.open(new DialogSpec.Confirm("还原备份", I18nKt.tr("用「{0}」覆盖现有存档？", $b.getFileName()) + StringUtils.LF + I18nKt.tr("现有存档会先移到回收目录。", new Object[0]), "还原", true, true, new Function0() { // from class: com.pymcl.android.ui.dialogs.SavesDialogKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return SavesDialogKt.SavesSheet$lambda$75$6$2$0$1$0$1($sm, $state, $ctx, $b, $busy$delegate, $gen$delegate);
                }
            }));
        } else {
            SavesSheet$act($state, $busy$delegate, $gen$delegate, "已还原", "还原失败", new SavesDialogKt$SavesSheet$4$7$3$1$2$1$2($sm, $b, null));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SavesSheet$lambda$75$6$2$0$1$0$1(SaveManager $sm, AppState $state, Context $ctx, SaveBackup $b, MutableState $busy$delegate, MutableIntState $gen$delegate) {
        if (!SavesSheet$blocked($sm, $state, $ctx, SaveGuard.Op.RESTORE)) {
            SavesSheet$act($state, $busy$delegate, $gen$delegate, "已还原", "还原失败", new SavesDialogKt$SavesSheet$4$7$3$1$2$1$1$1($sm, $b, null));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SavesSheet$lambda$75$6$2$0$2$0(RowScope $this_Row, Context $ctx, SaveBackup $b, AppState $state) {
        Object objM8116constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            SavesData.INSTANCE.share($ctx, new File($b.getPath()), I18nKt.tr("分享", new Object[0]));
            objM8116constructorimpl = Result.m8116constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM8116constructorimpl = Result.m8116constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM8119exceptionOrNullimpl = Result.m8119exceptionOrNullimpl(objM8116constructorimpl);
        if (thM8119exceptionOrNullimpl != null) {
            String message = thM8119exceptionOrNullimpl.getMessage();
            if (message == null) {
                message = "";
            }
            $state.toast("打开失败", message, "error");
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SavesSheet$lambda$75$6$2$0$3$0(final AppState $state, final SaveBackup $b, final SaveManager $sm, final MutableState $busy$delegate, final MutableIntState $gen$delegate) {
        $state.open(new DialogSpec.Confirm("删除备份", I18nKt.tr("「{0}」会移到回收目录。", $b.getFileName()), "删除", true, true, new Function0() { // from class: com.pymcl.android.ui.dialogs.SavesDialogKt$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SavesDialogKt.SavesSheet$lambda$75$6$2$0$3$0$0($sm, $b, $state, $busy$delegate, $gen$delegate);
            }
        }));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SavesSheet$lambda$75$6$2$0$3$0$0(SaveManager $sm, SaveBackup $b, AppState $state, MutableState $busy$delegate, MutableIntState $gen$delegate) {
        SavesSheet$act($state, $busy$delegate, $gen$delegate, "已删除", "删除失败", new SavesDialogKt$SavesSheet$4$7$3$1$4$1$1$1($sm, $b, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SavesSheet$lambda$75$6$3$0$0(final AppState $state, MutableState $trash$delegate, final SaveManager $sm, final MutableState $busy$delegate, final MutableIntState $gen$delegate) {
        $state.open(new DialogSpec.Confirm("清空回收目录", I18nKt.tr("{0} 个条目会被永久删除，无法恢复。", Integer.valueOf(SavesSheet$lambda$22($trash$delegate).size())), "永久删除", true, true, new Function0() { // from class: com.pymcl.android.ui.dialogs.SavesDialogKt$$ExternalSyntheticLambda44
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SavesDialogKt.SavesSheet$lambda$75$6$3$0$0$0($sm, $state, $busy$delegate, $gen$delegate);
            }
        }));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SavesSheet$lambda$75$6$3$0$0$0(SaveManager $sm, AppState $state, MutableState $busy$delegate, MutableIntState $gen$delegate) {
        SavesSheet$act($state, $busy$delegate, $gen$delegate, "已清空", "清空失败", new SavesDialogKt$SavesSheet$4$7$4$1$1$1$1($sm, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SavesSheet$lambda$75$6$4$0$1$0(SaveManager $sm, AppState $state, Context $ctx, TrashEntry $t, MutableState $busy$delegate, MutableIntState $gen$delegate) {
        if (!SavesSheet$blocked($sm, $state, $ctx, SaveGuard.Op.RESTORE_TRASH)) {
            SavesSheet$act($state, $busy$delegate, $gen$delegate, "已恢复", "恢复失败", new SavesDialogKt$SavesSheet$4$7$5$1$2$1$1($sm, $t, null));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SavesSheet$lambda$75$7$0$0(MutableState $viewer$delegate) {
        $viewer$delegate.setValue(null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SavesSheet$lambda$75$7$1$0(ClipboardManager $clip, Pair $v, AppState $state) {
        $clip.setText(new AnnotatedString(CollectionsKt.joinToString$default((Iterable) $v.getSecond(), StringUtils.LF, null, null, 0, null, null, 62, null), null, 2, null));
        AppState.toast$default($state, "已复制", null, null, 6, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SavesSheet$lambda$75$7$2$0(RowScope $this_Row, Context $ctx, Pair $v, AppState $state) {
        Object objM8116constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            SavesData.INSTANCE.share($ctx, new File(((MediaFile) $v.getFirst()).getPath()), I18nKt.tr("分享", new Object[0]));
            objM8116constructorimpl = Result.m8116constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM8116constructorimpl = Result.m8116constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM8119exceptionOrNullimpl = Result.m8119exceptionOrNullimpl(objM8116constructorimpl);
        if (thM8119exceptionOrNullimpl != null) {
            String message = thM8119exceptionOrNullimpl.getMessage();
            if (message == null) {
                message = "";
            }
            $state.toast("打开失败", message, "error");
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SavesSheet$lambda$75$8$0$0(MutableState $preview$delegate) {
        $preview$delegate.setValue(null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SavesSheet$lambda$75$8$2$0(RowScope $this_Row, Context $ctx, MediaFile $pv, AppState $state) {
        Object objM8116constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            SavesData.INSTANCE.view($ctx, new File($pv.getPath()));
            objM8116constructorimpl = Result.m8116constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM8116constructorimpl = Result.m8116constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM8119exceptionOrNullimpl = Result.m8119exceptionOrNullimpl(objM8116constructorimpl);
        if (thM8119exceptionOrNullimpl != null) {
            String message = thM8119exceptionOrNullimpl.getMessage();
            if (message == null) {
                message = "";
            }
            $state.toast("打开失败", message, "error");
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SavesSheet$lambda$75$8$3$0(RowScope $this_Row, Context $ctx, MediaFile $pv, AppState $state) {
        Object objM8116constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            SavesData.INSTANCE.share($ctx, new File($pv.getPath()), I18nKt.tr("分享", new Object[0]));
            objM8116constructorimpl = Result.m8116constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM8116constructorimpl = Result.m8116constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM8119exceptionOrNullimpl = Result.m8119exceptionOrNullimpl(objM8116constructorimpl);
        if (thM8119exceptionOrNullimpl != null) {
            String message = thM8119exceptionOrNullimpl.getMessage();
            if (message == null) {
                message = "";
            }
            $state.toast("打开失败", message, "error");
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SavesSheet$lambda$75$8$4$0(final AppState $state, final MediaFile $pv, final MutableState $preview$delegate, final SaveManager $sm, final MediaKind $kind, final MutableState $busy$delegate, final MutableIntState $gen$delegate) {
        $state.open(new DialogSpec.Confirm("删除确认", I18nKt.tr("「{0}」会移到回收目录。", $pv.getName()), "删除", true, true, new Function0() { // from class: com.pymcl.android.ui.dialogs.SavesDialogKt$$ExternalSyntheticLambda49
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SavesDialogKt.SavesSheet$lambda$75$8$4$0$0($preview$delegate, $sm, $kind, $pv, $state, $busy$delegate, $gen$delegate);
            }
        }));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SavesSheet$lambda$75$8$4$0$0(MutableState $preview$delegate, SaveManager $sm, MediaKind $kind, MediaFile $pv, AppState $state, MutableState $busy$delegate, MutableIntState $gen$delegate) {
        $preview$delegate.setValue(null);
        SavesSheet$act($state, $busy$delegate, $gen$delegate, "已删除", "删除失败", new SavesDialogKt$SavesSheet$4$9$5$1$1$1($sm, $kind, $pv, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SavesSheet$lambda$75$9$0$0$0$0(MediaFile $m, MutableState $preview$delegate) {
        $preview$delegate.setValue($m);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SavesSheet$lambda$75$10$0$0(AppState $state, SaveManager $sm, MediaKind $kind, MediaFile $m, MutableState $viewer$delegate) {
        $state.launch(new SavesDialogKt$SavesSheet$4$11$1$1$1($sm, $kind, $m, $viewer$delegate, $state, null));
        return Unit.INSTANCE;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v7 ??, still in use, count: 1, list:
          (r0v7 ?? I:??[int, boolean, OBJECT, ARRAY, byte, short, char]) from 0x00bf: IF  (r0v7 ?? I:??[int, boolean, OBJECT, ARRAY, byte, short, char]) == (0 ??[int, boolean, OBJECT, ARRAY, byte, short, char])  -> B:24:0x00c7
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1119)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:110)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit SavesSheet$lambda$75$10$1(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v7 ??, still in use, count: 1, list:
          (r0v7 ?? I:??[int, boolean, OBJECT, ARRAY, byte, short, char]) from 0x00bf: IF  (r0v7 ?? I:??[int, boolean, OBJECT, ARRAY, byte, short, char]) == (0 ??[int, boolean, OBJECT, ARRAY, byte, short, char])  -> B:24:0x00c7
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1119)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:110)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r42v0 ??
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
    public static final Unit SavesSheet$lambda$75$10$1$1$0(final AppState $state, final MediaFile $m, final SaveManager $sm, final MediaKind $kind, final MutableState $busy$delegate, final MutableIntState $gen$delegate) {
        $state.open(new DialogSpec.Confirm("删除确认", I18nKt.tr("「{0}」会移到回收目录。", $m.getName()), "删除", true, true, new Function0() { // from class: com.pymcl.android.ui.dialogs.SavesDialogKt$$ExternalSyntheticLambda50
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SavesDialogKt.SavesSheet$lambda$75$10$1$1$0$0($sm, $kind, $m, $state, $busy$delegate, $gen$delegate);
            }
        }));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SavesSheet$lambda$75$10$1$1$0$0(SaveManager $sm, MediaKind $kind, MediaFile $m, AppState $state, MutableState $busy$delegate, MutableIntState $gen$delegate) {
        SavesSheet$act($state, $busy$delegate, $gen$delegate, "已删除", "删除失败", new SavesDialogKt$SavesSheet$4$11$2$2$1$1$1($sm, $kind, $m, null));
        return Unit.INSTANCE;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r14v5 ??, still in use, count: 1, list:
          (r14v5 ?? I:??[int, boolean, OBJECT, ARRAY, byte, short, char]) from 0x00fb: IF  (r10v7 ?? I:??[int, boolean, OBJECT, ARRAY, byte, short, char] A[D('it\3' java.lang.Object)]) != (r14v5 ?? I:??[int, boolean, OBJECT, ARRAY, byte, short, char])  -> B:68:0x00fe
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1119)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:110)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    /* renamed from: LocalThumb-EUb7tLY, reason: not valid java name */
    private static final void m7690LocalThumbEUb7tLY(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r14v5 ??, still in use, count: 1, list:
          (r14v5 ?? I:??[int, boolean, OBJECT, ARRAY, byte, short, char]) from 0x00fb: IF  (r10v7 ?? I:??[int, boolean, OBJECT, ARRAY, byte, short, char] A[D('it\3' java.lang.Object)]) != (r14v5 ?? I:??[int, boolean, OBJECT, ARRAY, byte, short, char])  -> B:68:0x00fe
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1119)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:110)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r22v0 ??
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

    private static final Bitmap LocalThumb_EUb7tLY$lambda$2(State<Bitmap> state) {
        return (Bitmap) state.getValue();
    }
}
