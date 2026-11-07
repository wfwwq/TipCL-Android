package com.pymcl.android.ui.dialogs;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Environment;
import android.provider.DocumentsContract;
import androidx.activity.compose.ManagedActivityResultLauncher;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import com.pymcl.android.data.DirIntents;
import com.pymcl.android.ui.i18n.I18nKt;
import com.pymcl.android.ui.state.AppState;
import com.pymcl.android.ui.state.CatalogRules;
import com.pymcl.android.ui.state.ConflictRow;
import com.pymcl.android.ui.state.DialogSpec;
import com.pymcl.android.ui.state.InstalledEntry;
import com.pymcl.android.ui.state.InstalledVersion;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import kotlinx.coroutines.Job;
import org.apache.commons.lang3.StringUtils;

/* compiled from: ModsDialogs.kt */
@Metadata(d1 = {"\u0000|\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\u001a \u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u001a\\\u0010\b\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\f2\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u000e2\u0018\u0010\u000f\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\f\u0012\u0004\u0012\u00020\u00010\u0010\u001a\u0010\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0007H\u0002\u001a8\u0010\u0013\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\f\u0012\u0004\u0012\u00020\u00070\u00142\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0007H\u0082@¢\u0006\u0002\u0010\u0017\u001a=\u0010\u0018\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u001a2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00010\u001cH\u0001b\u0002\b\u001eb\f\b\u001f\u0012\b\b \u0012\u0004\b\b(!¢\u0006\u0002\u0010\u001d\u001a5\u0010\"\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00010\u001cH\u0001b\u0002\b\u001eb\f\b\u001f\u0012\b\b \u0012\u0004\b\b(!¢\u0006\u0002\u0010#\u001a=\u0010$\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020%2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00010\u001cH\u0001b\u0002\b\u001eb\f\b\u001f\u0012\b\b \u0012\u0004\b\b(!¢\u0006\u0002\u0010&¨\u0006'²\u0006\u0010\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00150\fX\u008a\u008e\u0002²\u0006\n\u0010)\u001a\u00020\u0007X\u008a\u008e\u0002²\u0006\n\u0010*\u001a\u00020+X\u008a\u008e\u0002²\u0006\u0012\u0010,\u001a\n\u0012\u0004\u0012\u00020-\u0018\u00010\fX\u008a\u008e\u0002²\u0006\u0010\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00070/X\u008a\u008e\u0002²\u0006\u0018\u00100\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000eX\u008a\u008e\u0002²\u0006\f\u00101\u001a\u0004\u0018\u00010\u0007X\u008a\u008e\u0002²\u0006\u0012\u00102\u001a\n\u0012\u0004\u0012\u000203\u0018\u00010\fX\u008a\u008e\u0002²\u0006\n\u00104\u001a\u00020\u0007X\u008a\u008e\u0002²\u0006\u0012\u0010,\u001a\n\u0012\u0004\u0012\u00020-\u0018\u00010\fX\u008a\u008e\u0002²\u0006\f\u00105\u001a\u0004\u0018\u00010\u0007X\u008a\u008e\u0002²\u0006\u0010\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00150\fX\u008a\u008e\u0002²\u0006\n\u0010)\u001a\u00020\u0007X\u008a\u008e\u0002²\u0006\n\u0010*\u001a\u00020+X\u008a\u008e\u0002²\u0006\u0018\u00100\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000eX\u008a\u008e\u0002²\u0006\u0016\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u000eX\u008a\u008e\u0002²\u0006\f\u00106\u001a\u0004\u0018\u00010\u0007X\u008a\u008e\u0002²\u0006\n\u00107\u001a\u000208X\u008a\u008e\u0002"}, d2 = {"openDirectory", "", "ctx", "Landroid/content/Context;", "state", "Lcom/pymcl/android/ui/state/AppState;", "path", "", "runModUpdates", "instance", "version", "files", "", "titles", "", "onDone", "Lkotlin/Function1;", "conflictLabel", "t", "resolveVersion", "Lkotlin/Pair;", "Lcom/pymcl/android/ui/state/InstalledVersion;", "given", "(Lcom/pymcl/android/ui/state/AppState;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ModsSheet", "d", "Lcom/pymcl/android/ui/state/DialogSpec$Mods;", "close", "Lkotlin/Function0;", "(Lcom/pymcl/android/ui/state/AppState;Lcom/pymcl/android/ui/state/DialogSpec$Mods;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/runtime/Composable;", "Landroidx/compose/runtime/ComposableTarget;", "applier", "androidx.compose.ui.UiComposable", "GlobalModsSheet", "(Lcom/pymcl/android/ui/state/AppState;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "PickUpdatesSheet", "Lcom/pymcl/android/ui/state/DialogSpec$PickUpdates;", "(Lcom/pymcl/android/ui/state/AppState;Lcom/pymcl/android/ui/state/DialogSpec$PickUpdates;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "PyMCL-Android:app_debug", "versions", "ver", "ready", "", "rows", "Lcom/pymcl/android/ui/state/InstalledEntry;", "injected", "", "updates", "busy", "conflicts", "Lcom/pymcl/android/ui/state/ConflictRow;", "filter", "dir", "error", "recheck", ""}, k = 2, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class ModsDialogsKt {

    /* compiled from: ModsDialogs.kt */
    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    @DebugMetadata(c = "com.pymcl.android.ui.dialogs.ModsDialogsKt", f = "ModsDialogs.kt", i = {0, 0, 0}, l = {66}, m = "resolveVersion", n = {"state", "instance", "given"}, nl = {66}, s = {"L$0", "L$1", "L$2"}, v = 2)
    /* renamed from: com.pymcl.android.ui.dialogs.ModsDialogsKt$resolveVersion$1, reason: invalid class name */
    static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ModsDialogsKt.resolveVersion(null, null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GlobalModsSheet$lambda$10(AppState appState, Function0 function0, int i, Composer composer, int i2) {
        GlobalModsSheet(appState, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ModsSheet$lambda$34(AppState appState, DialogSpec.Mods mods, Function0 function0, int i, Composer composer, int i2) {
        ModsSheet(appState, mods, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PickUpdatesSheet$lambda$27(AppState appState, DialogSpec.PickUpdates pickUpdates, Function0 function0, int i, Composer composer, int i2) {
        PickUpdatesSheet(appState, pickUpdates, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void openDirectory(Context ctx, AppState state, String path) {
        Object objM8116constructorimpl;
        AppState state2;
        String path2;
        Object objM8116constructorimpl2;
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(state, "state");
        String str = path;
        if (str == null || StringsKt.isBlank(str)) {
            state.toast("打不开目录", "后端没给出目录", "warn");
            return;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            DirIntents dirIntents = DirIntents.INSTANCE;
            String absolutePath = Environment.getExternalStorageDirectory().getAbsolutePath();
            Intrinsics.checkNotNullExpressionValue(absolutePath, "getAbsolutePath(...)");
            objM8116constructorimpl = Result.m8116constructorimpl(dirIntents.externalDocId(path, absolutePath));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM8116constructorimpl = Result.m8116constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m8122isFailureimpl(objM8116constructorimpl)) {
            objM8116constructorimpl = null;
        }
        String docId = (String) objM8116constructorimpl;
        if (docId == null) {
            state2 = state;
            path2 = path;
        } else {
            Uri uri = DocumentsContract.buildDocumentUri(DirIntents.EXTERNAL_AUTHORITY, docId);
            for (String type : CollectionsKt.listOf((Object[]) new String[]{"vnd.android.document/directory", "resource/folder"})) {
                try {
                    Result.Companion companion3 = Result.INSTANCE;
                    ctx.startActivity(new Intent("android.intent.action.VIEW").setDataAndType(uri, type).addFlags(268435457));
                    objM8116constructorimpl2 = Result.m8116constructorimpl(Unit.INSTANCE);
                } catch (Throwable th2) {
                    Result.Companion companion4 = Result.INSTANCE;
                    objM8116constructorimpl2 = Result.m8116constructorimpl(ResultKt.createFailure(th2));
                }
                if (Result.m8123isSuccessimpl(objM8116constructorimpl2)) {
                    AppState.toast$default(state, "已打开", path, null, 4, null);
                    return;
                }
            }
            state2 = state;
            path2 = path;
        }
        try {
            Result.Companion companion5 = Result.INSTANCE;
            Object systemService = ctx.getSystemService("clipboard");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
            ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText("path", path2));
            Result.m8116constructorimpl(Unit.INSTANCE);
        } catch (Throwable th3) {
            Result.Companion companion6 = Result.INSTANCE;
            Result.m8116constructorimpl(ResultKt.createFailure(th3));
        }
        state2.toast("已复制目录路径", I18nKt.tr("系统文件管理器打不开这个目录，可在文件管理器里粘贴路径：", new Object[0]) + StringUtils.LF + path2, "info");
    }

    public static /* synthetic */ void runModUpdates$default(AppState appState, String str, String str2, List list, Map map, Function1 function1, int i, Object obj) {
        if ((i & 16) != 0) {
            map = MapsKt.emptyMap();
        }
        runModUpdates(appState, str, str2, list, map, function1);
    }

    public static final void runModUpdates(final AppState state, final String instance, final String version, List<String> files, Map<String, String> titles, final Function1<? super List<String>, Unit> onDone) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(instance, "instance");
        Intrinsics.checkNotNullParameter(version, "version");
        Intrinsics.checkNotNullParameter(files, "files");
        Intrinsics.checkNotNullParameter(titles, "titles");
        Intrinsics.checkNotNullParameter(onDone, "onDone");
        if (files.isEmpty()) {
            return;
        }
        final List done = new ArrayList();
        AppState.runTask$default(state, I18nKt.tr("正在更新 {0} 个模组…", Integer.valueOf(files.size())), null, CatalogRules.INSTANCE.modUpdateKey(instance, version, files), new Function1() { // from class: com.pymcl.android.ui.dialogs.ModsDialogsKt$$ExternalSyntheticLambda31
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ModsDialogsKt.runModUpdates$lambda$0(onDone, done, state, instance, version, (String) obj);
            }
        }, new AnonymousClass2(files, done, state, instance, version, titles, null), 2, null);
    }

    /* compiled from: ModsDialogs.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00050\u0003H\n"}, d2 = {"<anonymous>", "", "p", "Lkotlin/Function2;", "", ""}, k = 3, mv = {2, 4, 0}, xi = 48)
    @DebugMetadata(c = "com.pymcl.android.ui.dialogs.ModsDialogsKt$runModUpdates$2", f = "ModsDialogs.kt", i = {0, 0, 0, 0, 0, 0, 0}, l = {50}, m = "invokeSuspend", n = {"p", "failed", "$this$forEachIndexed\\1", "item\\1", "f\\2", "index\\1", "i\\2"}, nl = {51}, s = {"L$0", "L$1", "L$2", "L$10", "L$11", "I$0", "I$1"}, v = 2)
    /* renamed from: com.pymcl.android.ui.dialogs.ModsDialogsKt$runModUpdates$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements Function2<Function2<? super Float, ? super String, ? extends Unit>, Continuation<? super String>, Object> {
        final /* synthetic */ List<String> $done;
        final /* synthetic */ List<String> $files;
        final /* synthetic */ String $instance;
        final /* synthetic */ AppState $state;
        final /* synthetic */ Map<String, String> $titles;
        final /* synthetic */ String $version;
        int I$0;
        int I$1;
        /* synthetic */ Object L$0;
        Object L$1;
        Object L$10;
        Object L$11;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        Object L$8;
        Object L$9;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(List<String> list, List<String> list2, AppState appState, String str, String str2, Map<String, String> map, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$files = list;
            this.$done = list2;
            this.$state = appState;
            this.$instance = str;
            this.$version = str2;
            this.$titles = map;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$files, this.$done, this.$state, this.$instance, this.$version, this.$titles, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Function2<? super Float, ? super String, ? extends Unit> function2, Continuation<? super String> continuation) {
            return invoke2((Function2<? super Float, ? super String, Unit>) function2, continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Function2<? super Float, ? super String, Unit> function2, Continuation<? super String> continuation) {
            return ((AnonymousClass2) create(function2, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Can't wrap try/catch for region: R(12:16|(1:18)|19|68|20|21|72|22|23|74|24|(1:26)(7:27|70|28|29|53|14|(2:57|(2:59|(2:61|81)(2:62|63))(2:64|65))(0))) */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x0131, code lost:
        
            r0 = e;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x0132, code lost:
        
            r5 = r7;
            r7 = r9;
            r1 = r6;
            r2 = r3;
            r3 = r4;
            r4 = r11;
            r11 = r12;
            r12 = r14;
            r14 = r5;
            r18 = r19;
            r16 = r21;
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x0146, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x0153, code lost:
        
            r0 = e;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x0154, code lost:
        
            r21 = r5;
            r19 = r8;
            r8 = r1;
            r5 = r7;
            r7 = r9;
            r1 = r6;
            r2 = r3;
            r3 = r4;
            r4 = r11;
            r11 = r12;
            r12 = r14;
            r14 = r5;
            r18 = r19;
            r16 = r21;
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x016d, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x017e, code lost:
        
            r0 = e;
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x017f, code lost:
        
            r20 = r2;
            r21 = r5;
            r19 = r8;
            r8 = r1;
            r5 = r7;
            r7 = r9;
            r1 = r6;
            r2 = r3;
            r3 = r4;
            r4 = r11;
            r11 = r12;
            r12 = r14;
            r14 = r5;
            r18 = r19;
            r16 = r21;
         */
        /* JADX WARN: Code restructure failed: missing block: B:54:0x01e3, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:56:0x01f6, code lost:
        
            throw r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:78:?, code lost:
        
            throw r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:79:?, code lost:
        
            throw r0;
         */
        /* JADX WARN: Removed duplicated region for block: B:16:0x00a7  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x01ab  */
        /* JADX WARN: Removed duplicated region for block: B:47:0x01ad  */
        /* JADX WARN: Removed duplicated region for block: B:50:0x01b5  */
        /* JADX WARN: Removed duplicated region for block: B:51:0x01b8  */
        /* JADX WARN: Removed duplicated region for block: B:57:0x01f7  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0108 -> B:70:0x011a). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r31) {
            /*
                Method dump skipped, instructions count: 686
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.pymcl.android.ui.dialogs.ModsDialogsKt.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0$0(Function2 $p, int $i, List $files, Float x, String d) {
            $p.invoke(Float.valueOf(($i + (x != null ? x.floatValue() : 0.0f)) / $files.size()), d);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit runModUpdates$lambda$0(Function1 $onDone, List $done, AppState $state, String $instance, String $version, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $onDone.invoke(CollectionsKt.toList($done));
        $state.getModWatcher().consumed($instance, $version, $done);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x003e, code lost:
    
        if (r1.equals("incompatible") == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0047, code lost:
    
        if (r1.equals("breaks") == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x004a, code lost:
    
        return "不兼容";
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final java.lang.String conflictLabel(java.lang.String r1) {
        /*
            int r0 = r1.hashCode()
            switch(r0) {
                case -1843357355: goto L4d;
                case -1380923564: goto L41;
                case -269976135: goto L38;
                case -236196924: goto L2c;
                case 1201687819: goto L20;
                case 1645967431: goto L14;
                case 2094200954: goto L8;
                default: goto L7;
            }
        L7:
            goto L59
        L8:
            java.lang.String r0 = "loader_mismatch"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L11
            goto L7
        L11:
            java.lang.String r0 = "加载器不符"
            goto L5a
        L14:
            java.lang.String r0 = "soft_conflict"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L1d
            goto L7
        L1d:
            java.lang.String r0 = "可能冲突"
            goto L5a
        L20:
            java.lang.String r0 = "duplicate"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L29
            goto L7
        L29:
            java.lang.String r0 = "重复"
            goto L5a
        L2c:
            java.lang.String r0 = "missing_dependency"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L35
            goto L7
        L35:
            java.lang.String r0 = "缺前置"
            goto L5a
        L38:
            java.lang.String r0 = "incompatible"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L4a
            goto L7
        L41:
            java.lang.String r0 = "breaks"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L4a
            goto L7
        L4a:
            java.lang.String r0 = "不兼容"
            goto L5a
        L4d:
            java.lang.String r0 = "version_mismatch"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L56
            goto L7
        L56:
            java.lang.String r0 = "版本不符"
            goto L5a
        L59:
            r0 = r1
        L5a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.android.ui.dialogs.ModsDialogsKt.conflictLabel(java.lang.String):java.lang.String");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0138 A[PHI: r6
  0x0138: PHI (r6v5 java.lang.String) = (r6v4 java.lang.String), (r6v9 java.lang.String) binds: [B:62:0x00f3, B:77:0x0122] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object resolveVersion(com.pymcl.android.ui.state.AppState r17, java.lang.String r18, java.lang.String r19, kotlin.coroutines.Continuation<? super kotlin.Pair<? extends java.util.List<com.pymcl.android.ui.state.InstalledVersion>, java.lang.String>> r20) {
        /*
            Method dump skipped, instructions count: 330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.android.ui.dialogs.ModsDialogsKt.resolveVersion(com.pymcl.android.ui.state.AppState, java.lang.String, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r9v2 ??, still in use, count: 1, list:
          (r9v2 ?? I:??[int, boolean, OBJECT, ARRAY, byte, short, char]) from 0x00ba: IF  (r7v1 ?? I:??[int, boolean, OBJECT, ARRAY, byte, short, char] A[D('it\2' java.lang.Object)]) != (r9v2 ?? I:??[int, boolean, OBJECT, ARRAY, byte, short, char])  -> B:42:0x00cc
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1119)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:110)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    /* JADX WARN: Not initialized variable reg: 18, insn: 0x00b5: INVOKE (r9 I:void) = (r17v0 ?? I:java.io.File), (r18 I:java.lang.String) VIRTUAL call: java.io.File.<init>(java.lang.String):void A[MD:(java.lang.String):void (c)], block:B:38:0x0086 */
    public static final void ModsSheet(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r9v2 ??, still in use, count: 1, list:
          (r9v2 ?? I:??[int, boolean, OBJECT, ARRAY, byte, short, char]) from 0x00ba: IF  (r7v1 ?? I:??[int, boolean, OBJECT, ARRAY, byte, short, char] A[D('it\2' java.lang.Object)]) != (r9v2 ?? I:??[int, boolean, OBJECT, ARRAY, byte, short, char])  -> B:42:0x00cc
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1119)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:110)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r33v0 ??
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

    private static final List<InstalledVersion> ModsSheet$lambda$1(MutableState<List<InstalledVersion>> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String ModsSheet$lambda$4(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean ModsSheet$lambda$7(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ModsSheet$lambda$8(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final List<InstalledEntry> ModsSheet$lambda$10(MutableState<List<InstalledEntry>> mutableState) {
        return mutableState.getValue();
    }

    private static final Set<String> ModsSheet$lambda$13(MutableState<Set<String>> mutableState) {
        return mutableState.getValue();
    }

    private static final Map<String, String> ModsSheet$lambda$16(MutableState<Map<String, String>> mutableState) {
        return mutableState.getValue();
    }

    private static final String ModsSheet$lambda$20(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    private static final List<ConflictRow> ModsSheet$lambda$23(MutableState<List<ConflictRow>> mutableState) {
        return mutableState.getValue();
    }

    private static final String ModsSheet$lambda$26(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Job ModsSheet$reload(AppState $state, String inst, MutableState<String> mutableState, MutableState<List<InstalledEntry>> mutableState2, MutableState<Set<String>> mutableState3) {
        return $state.launch(new ModsDialogsKt$ModsSheet$reload$1($state, inst, mutableState, mutableState2, mutableState3, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ModsSheet$lambda$30$0(final AppState $state, final String $inst, final MutableState $ver$delegate, final MutableState $rows$delegate, final MutableState $injected$delegate, Context $ctx, List uris) {
        Intrinsics.checkNotNullParameter(uris, "uris");
        String v = ModsSheet$lambda$4($ver$delegate);
        if (!uris.isEmpty()) {
            AppState.runTask$default($state, I18nKt.tr("导入模组", new Object[0]), null, "modimport|" + $inst + "|" + v + "|" + CollectionsKt.joinToString$default(uris, "|", null, null, 0, null, null, 62, null), new Function1() { // from class: com.pymcl.android.ui.dialogs.ModsDialogsKt$$ExternalSyntheticLambda22
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ModsDialogsKt.ModsSheet$lambda$30$0$0($state, $inst, $ver$delegate, $rows$delegate, $injected$delegate, (String) obj);
                }
            }, new ModsDialogsKt$ModsSheet$picker$1$1$2(uris, $ctx, $state, $inst, v, null), 2, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ModsSheet$lambda$30$0$0(AppState $state, String $inst, MutableState $ver$delegate, MutableState $rows$delegate, MutableState $injected$delegate, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        ModsSheet$reload($state, $inst, $ver$delegate, $rows$delegate, $injected$delegate);
        return Unit.INSTANCE;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r8v13 ??, still in use, count: 1, list:
          (r8v13 ?? I:??[int, boolean, OBJECT, ARRAY, byte, short, char]) from 0x005f: IF  (r14v0 ?? I:??[int, boolean, OBJECT, ARRAY, byte, short, char] A[D('it\1' java.lang.Object)]) != (r8v13 ?? I:??[int, boolean, OBJECT, ARRAY, byte, short, char])  -> B:18:0x006e
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1119)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:110)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Not initialized variable reg: 17, insn: 0x005b: INVOKE (r8 I:void) = (r16v7 ?? I:java.io.File), (r17 I:java.lang.String) VIRTUAL call: java.io.File.<init>(java.lang.String):void A[MD:(java.lang.String):void (c)], block:B:13:0x0059 */
    public static final kotlin.Unit ModsSheet$lambda$32(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r8v13 ??, still in use, count: 1, list:
          (r8v13 ?? I:??[int, boolean, OBJECT, ARRAY, byte, short, char]) from 0x005f: IF  (r14v0 ?? I:??[int, boolean, OBJECT, ARRAY, byte, short, char] A[D('it\1' java.lang.Object)]) != (r8v13 ?? I:??[int, boolean, OBJECT, ARRAY, byte, short, char])  -> B:18:0x006e
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1119)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:110)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r23v0 ??
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
    public static final Unit ModsSheet$lambda$32$0$0(ManagedActivityResultLauncher $picker) {
        $picker.launch(new String[]{"application/java-archive", "application/octet-stream", "*/*"});
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ModsSheet$lambda$32$2$0(final AppState $state, final String $inst, final MutableState $updates$delegate, final SnapshotStateMap $chosen, final MutableState $rows$delegate, final MutableState $ver$delegate, final MutableState $injected$delegate) {
        Map<String, String> mapModsSheet$lambda$16 = ModsSheet$lambda$16($updates$delegate);
        if (mapModsSheet$lambda$16 == null) {
            mapModsSheet$lambda$16 = MapsKt.emptyMap();
        }
        Iterable iterableKeySet = mapModsSheet$lambda$16.keySet();
        Collection arrayList = new ArrayList();
        for (Object obj : iterableKeySet) {
            if (Intrinsics.areEqual($chosen.get((String) obj), (Object) true)) {
                arrayList.add(obj);
            }
        }
        List files = (List) arrayList;
        Iterable iterableModsSheet$lambda$10 = ModsSheet$lambda$10($rows$delegate);
        if (iterableModsSheet$lambda$10 == null) {
            iterableModsSheet$lambda$10 = CollectionsKt.emptyList();
        }
        Iterable<InstalledEntry> iterable = iterableModsSheet$lambda$10;
        Map linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(iterable, 10)), 16));
        for (InstalledEntry installedEntry : iterable) {
            Pair pair = TuplesKt.to(installedEntry.getFilename(), installedEntry.getTitle());
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        runModUpdates($state, $inst, ModsSheet$lambda$4($ver$delegate), files, linkedHashMap, new Function1() { // from class: com.pymcl.android.ui.dialogs.ModsDialogsKt$$ExternalSyntheticLambda25
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return ModsDialogsKt.ModsSheet$lambda$32$2$0$2($updates$delegate, $chosen, $state, $inst, $ver$delegate, $rows$delegate, $injected$delegate, (List) obj2);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ModsSheet$lambda$32$2$0$2(MutableState $updates$delegate, SnapshotStateMap $chosen, AppState $state, String $inst, MutableState $ver$delegate, MutableState $rows$delegate, MutableState $injected$delegate, List ok) {
        Intrinsics.checkNotNullParameter(ok, "ok");
        Map<String, String> mapModsSheet$lambda$16 = ModsSheet$lambda$16($updates$delegate);
        if (mapModsSheet$lambda$16 == null) {
            mapModsSheet$lambda$16 = MapsKt.emptyMap();
        }
        $updates$delegate.setValue(MapsKt.minus((Map) mapModsSheet$lambda$16, (Iterable) CollectionsKt.toSet(ok)));
        Iterator it = ok.iterator();
        while (it.hasNext()) {
            $chosen.remove((String) it.next());
        }
        ModsSheet$reload($state, $inst, $ver$delegate, $rows$delegate, $injected$delegate);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ModsSheet$lambda$32$3$0(AppState $state, MutableState $busy$delegate, String $inst, SnapshotStateMap $chosen, MutableState $ver$delegate, MutableState $updates$delegate) {
        $busy$delegate.setValue("正在比对模组版本…");
        $state.launch(new ModsDialogsKt$ModsSheet$4$4$1$1($state, $inst, $chosen, $ver$delegate, $updates$delegate, $busy$delegate, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ModsSheet$lambda$32$4$0(AppState $state, Context $ctx, String $inst, MutableState $ver$delegate) {
        $state.launch(new ModsDialogsKt$ModsSheet$4$5$1$1($ctx, $state, $inst, $ver$delegate, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ModsSheet$lambda$32$5$0(AppState $state) {
        $state.open(DialogSpec.GlobalMods.INSTANCE);
        return Unit.INSTANCE;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v9 ??, still in use, count: 1, list:
          (r3v9 ?? I:??[int, boolean, OBJECT, ARRAY, byte, short, char]) from 0x00c0: IF  (r3v9 ?? I:??[int, boolean, OBJECT, ARRAY, byte, short, char]) == (0 ??[int, boolean, OBJECT, ARRAY, byte, short, char])  -> B:17:0x00c8
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1119)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:110)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit ModsSheet$lambda$33(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v9 ??, still in use, count: 1, list:
          (r3v9 ?? I:??[int, boolean, OBJECT, ARRAY, byte, short, char]) from 0x00c0: IF  (r3v9 ?? I:??[int, boolean, OBJECT, ARRAY, byte, short, char]) == (0 ??[int, boolean, OBJECT, ARRAY, byte, short, char])  -> B:17:0x00c8
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1119)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:110)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r104v0 ??
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
    public static final Unit ModsSheet$lambda$33$0$2$0(MutableState $versions$delegate, MutableState $ver$delegate, int it) {
        $ver$delegate.setValue(ModsSheet$lambda$1($versions$delegate).get(it).getId());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ModsSheet$lambda$33$0$3$0(MutableState $filter$delegate, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $filter$delegate.setValue(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ModsSheet$lambda$33$0$4$0(AppState $state, MutableState $busy$delegate, String $inst, MutableState $ver$delegate, MutableState $conflicts$delegate) {
        $busy$delegate.setValue("正在检查冲突…");
        $state.launch(new ModsDialogsKt$ModsSheet$5$1$5$1$1($state, $inst, $ver$delegate, $conflicts$delegate, $busy$delegate, null));
        return Unit.INSTANCE;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v7 ??, still in use, count: 1, list:
          (r1v7 ?? I:??[int, boolean, OBJECT, ARRAY, byte, short, char]) from 0x00a7: IF  (r1v7 ?? I:??[int, boolean, OBJECT, ARRAY, byte, short, char]) == (0 ??[int, boolean, OBJECT, ARRAY, byte, short, char])  -> B:17:0x00af
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1119)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:110)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit ModsSheet$lambda$33$3$0(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v7 ??, still in use, count: 1, list:
          (r1v7 ?? I:??[int, boolean, OBJECT, ARRAY, byte, short, char]) from 0x00a7: IF  (r1v7 ?? I:??[int, boolean, OBJECT, ARRAY, byte, short, char]) == (0 ??[int, boolean, OBJECT, ARRAY, byte, short, char])  -> B:17:0x00af
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
    public static final Unit ModsSheet$lambda$33$3$0$0$0$0(MutableState $conflicts$delegate) {
        $conflicts$delegate.setValue(null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ModsSheet$lambda$33$5$2$0(MutableState $updates$delegate, SnapshotStateMap $chosen) {
        Map<String, String> mapModsSheet$lambda$16 = ModsSheet$lambda$16($updates$delegate);
        if (mapModsSheet$lambda$16 == null) {
            mapModsSheet$lambda$16 = MapsKt.emptyMap();
        }
        Iterator it = mapModsSheet$lambda$16.keySet().iterator();
        while (it.hasNext()) {
            $chosen.put((String) it.next(), true);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ModsSheet$lambda$33$5$3$0(SnapshotStateMap $chosen) {
        $chosen.clear();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ModsSheet$lambda$33$6$0$0$0(SnapshotStateMap $chosen, InstalledEntry $m, boolean it) {
        $chosen.put($m.getFilename(), Boolean.valueOf(it));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ModsSheet$lambda$33$6$0$1$0(AppState $state, String $inst, InstalledEntry $m, MutableState $ver$delegate, MutableState $rows$delegate, MutableState $injected$delegate, boolean on) {
        $state.launch(new ModsDialogsKt$ModsSheet$5$6$1$2$1$1($state, $inst, $m, on, $ver$delegate, $rows$delegate, $injected$delegate, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ModsSheet$lambda$33$6$0$3$0(final AppState $state, final String $inst, InstalledEntry $m, final MutableState $ver$delegate, final MutableState $updates$delegate, final MutableState $rows$delegate, final MutableState $injected$delegate) {
        runModUpdates($state, $inst, ModsSheet$lambda$4($ver$delegate), CollectionsKt.listOf($m.getFilename()), MapsKt.mapOf(TuplesKt.to($m.getFilename(), $m.getTitle())), new Function1() { // from class: com.pymcl.android.ui.dialogs.ModsDialogsKt$$ExternalSyntheticLambda27
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ModsDialogsKt.ModsSheet$lambda$33$6$0$3$0$0($updates$delegate, $state, $inst, $ver$delegate, $rows$delegate, $injected$delegate, (List) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ModsSheet$lambda$33$6$0$3$0$0(MutableState $updates$delegate, AppState $state, String $inst, MutableState $ver$delegate, MutableState $rows$delegate, MutableState $injected$delegate, List ok) {
        Intrinsics.checkNotNullParameter(ok, "ok");
        Map<String, String> mapModsSheet$lambda$16 = ModsSheet$lambda$16($updates$delegate);
        if (mapModsSheet$lambda$16 == null) {
            mapModsSheet$lambda$16 = MapsKt.emptyMap();
        }
        $updates$delegate.setValue(MapsKt.minus((Map) mapModsSheet$lambda$16, (Iterable) CollectionsKt.toSet(ok)));
        ModsSheet$reload($state, $inst, $ver$delegate, $rows$delegate, $injected$delegate);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ModsSheet$lambda$33$6$0$4$0(final AppState $state, final InstalledEntry $m, final String $inst, final MutableState $ver$delegate, final MutableState $rows$delegate, final MutableState $injected$delegate) {
        $state.open(new DialogSpec.Confirm("删除模组", I18nKt.tr("将删除「{0}」，不可恢复。", $m.getFilename()), "删除", true, true, new Function0() { // from class: com.pymcl.android.ui.dialogs.ModsDialogsKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ModsDialogsKt.ModsSheet$lambda$33$6$0$4$0$0($state, $inst, $m, $ver$delegate, $rows$delegate, $injected$delegate);
            }
        }));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ModsSheet$lambda$33$6$0$4$0$0(AppState $state, String $inst, InstalledEntry $m, MutableState $ver$delegate, MutableState $rows$delegate, MutableState $injected$delegate) {
        $state.launch(new ModsDialogsKt$ModsSheet$5$6$1$5$1$1$1($state, $inst, $m, $ver$delegate, $rows$delegate, $injected$delegate, null));
        return Unit.INSTANCE;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r11v2 ??, still in use, count: 1, list:
          (r11v2 ?? I:??[int, boolean, OBJECT, ARRAY, byte, short, char]) from 0x0098: IF  (r14v1 ?? I:??[int, boolean, OBJECT, ARRAY, byte, short, char] A[D('it\2' java.lang.Object)]) != (r11v2 ?? I:??[int, boolean, OBJECT, ARRAY, byte, short, char])  -> B:32:0x00a6
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1119)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:110)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    /* JADX WARN: Not initialized variable reg: 17, insn: 0x0093: INVOKE (r11 I:void) = (r16v0 ?? I:java.io.File), (r17 I:java.lang.String) VIRTUAL call: java.io.File.<init>(java.lang.String):void A[MD:(java.lang.String):void (c)], block:B:28:0x0066 */
    public static final void GlobalModsSheet(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r11v2 ??, still in use, count: 1, list:
          (r11v2 ?? I:??[int, boolean, OBJECT, ARRAY, byte, short, char]) from 0x0098: IF  (r14v1 ?? I:??[int, boolean, OBJECT, ARRAY, byte, short, char] A[D('it\2' java.lang.Object)]) != (r11v2 ?? I:??[int, boolean, OBJECT, ARRAY, byte, short, char])  -> B:32:0x00a6
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1119)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:110)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r18v0 ??
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

    private static final List<InstalledEntry> GlobalModsSheet$lambda$1(MutableState<List<InstalledEntry>> mutableState) {
        return mutableState.getValue();
    }

    private static final String GlobalModsSheet$lambda$4(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Job GlobalModsSheet$reload(AppState $state, MutableState<List<InstalledEntry>> mutableState, MutableState<String> mutableState2) {
        return $state.launch(new ModsDialogsKt$GlobalModsSheet$reload$1($state, mutableState, mutableState2, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GlobalModsSheet$lambda$7$0(final AppState $state, final MutableState $rows$delegate, final MutableState $dir$delegate, Context $ctx, List uris) {
        Intrinsics.checkNotNullParameter(uris, "uris");
        if (!uris.isEmpty()) {
            AppState.runTask$default($state, I18nKt.tr("导入模组", new Object[0]) + " · " + I18nKt.tr("全局模组", new Object[0]), null, "globalimport|" + CollectionsKt.joinToString$default(uris, "|", null, null, 0, null, null, 62, null), new Function1() { // from class: com.pymcl.android.ui.dialogs.ModsDialogsKt$$ExternalSyntheticLambda11
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ModsDialogsKt.GlobalModsSheet$lambda$7$0$0($state, $rows$delegate, $dir$delegate, (String) obj);
                }
            }, new ModsDialogsKt$GlobalModsSheet$picker$1$1$2(uris, $ctx, $state, null), 2, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GlobalModsSheet$lambda$7$0$0(AppState $state, MutableState $rows$delegate, MutableState $dir$delegate, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        GlobalModsSheet$reload($state, $rows$delegate, $dir$delegate);
        return Unit.INSTANCE;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r13v8 ??, still in use, count: 1, list:
          (r13v8 ?? I:??[int, boolean, OBJECT, ARRAY, byte, short, char]) from 0x005c: IF  (r10v0 ?? I:??[int, boolean, OBJECT, ARRAY, byte, short, char] A[D('it\1' java.lang.Object)]) != (r13v8 ?? I:??[int, boolean, OBJECT, ARRAY, byte, short, char])  -> B:18:0x006b
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1119)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:110)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit GlobalModsSheet$lambda$8(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r13v8 ??, still in use, count: 1, list:
          (r13v8 ?? I:??[int, boolean, OBJECT, ARRAY, byte, short, char]) from 0x005c: IF  (r10v0 ?? I:??[int, boolean, OBJECT, ARRAY, byte, short, char] A[D('it\1' java.lang.Object)]) != (r13v8 ?? I:??[int, boolean, OBJECT, ARRAY, byte, short, char])  -> B:18:0x006b
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
    public static final Unit GlobalModsSheet$lambda$8$0$0(ManagedActivityResultLauncher $picker) {
        $picker.launch(new String[]{"application/java-archive", "application/octet-stream", "*/*"});
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GlobalModsSheet$lambda$8$1$0(Context $ctx, AppState $state, MutableState $dir$delegate) {
        openDirectory($ctx, $state, GlobalModsSheet$lambda$4($dir$delegate));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GlobalModsSheet$lambda$8$2$0(AppState $state, MutableState $rows$delegate, MutableState $dir$delegate) {
        GlobalModsSheet$reload($state, $rows$delegate, $dir$delegate);
        return Unit.INSTANCE;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r7v13 ??, still in use, count: 1, list:
          (r7v13 ?? I:??[int, boolean, OBJECT, ARRAY, byte, short, char]) from 0x0196: IF  (r7v13 ?? I:??[int, boolean, OBJECT, ARRAY, byte, short, char]) == (0 ??[int, boolean, OBJECT, ARRAY, byte, short, char])  -> B:30:0x019e
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1119)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:110)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit GlobalModsSheet$lambda$9(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r7v13 ??, still in use, count: 1, list:
          (r7v13 ?? I:??[int, boolean, OBJECT, ARRAY, byte, short, char]) from 0x0196: IF  (r7v13 ?? I:??[int, boolean, OBJECT, ARRAY, byte, short, char]) == (0 ??[int, boolean, OBJECT, ARRAY, byte, short, char])  -> B:30:0x019e
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1119)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:110)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r93v0 ??
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
    public static final Unit GlobalModsSheet$lambda$9$1$0$0$0(AppState $state, InstalledEntry $m, MutableState $rows$delegate, MutableState $dir$delegate, boolean on) {
        $state.launch(new ModsDialogsKt$GlobalModsSheet$3$2$1$1$1$1($state, $m, on, $rows$delegate, $dir$delegate, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GlobalModsSheet$lambda$9$1$0$2$0(final AppState $state, final InstalledEntry $m, final MutableState $rows$delegate, final MutableState $dir$delegate) {
        $state.open(new DialogSpec.Confirm("删除模组", I18nKt.tr("将删除「{0}」，不可恢复。", $m.getFilename()), "删除", true, true, new Function0() { // from class: com.pymcl.android.ui.dialogs.ModsDialogsKt$$ExternalSyntheticLambda48
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ModsDialogsKt.GlobalModsSheet$lambda$9$1$0$2$0$0($state, $m, $rows$delegate, $dir$delegate);
            }
        }));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GlobalModsSheet$lambda$9$1$0$2$0$0(AppState $state, InstalledEntry $m, MutableState $rows$delegate, MutableState $dir$delegate) {
        $state.launch(new ModsDialogsKt$GlobalModsSheet$3$2$1$3$1$1$1($state, $m, $rows$delegate, $dir$delegate, null));
        return Unit.INSTANCE;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r14v2 ??, still in use, count: 1, list:
          (r14v2 ?? I:??[int, boolean, OBJECT, ARRAY, byte, short, char]) from 0x00a0: IF  (r6v0 ?? I:??[int, boolean, OBJECT, ARRAY, byte, short, char] A[D('it\1' java.lang.Object)]) != (r14v2 ?? I:??[int, boolean, OBJECT, ARRAY, byte, short, char])  -> B:42:0x00b2
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1119)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:110)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    /* JADX WARN: Not initialized variable reg: 18, insn: 0x009b: INVOKE (r14 I:void) = (r17v0 ?? I:java.io.File), (r18 I:java.lang.String) VIRTUAL call: java.io.File.<init>(java.lang.String):void A[MD:(java.lang.String):void (c)], block:B:38:0x0086 */
    public static final void PickUpdatesSheet(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r14v2 ??, still in use, count: 1, list:
          (r14v2 ?? I:??[int, boolean, OBJECT, ARRAY, byte, short, char]) from 0x00a0: IF  (r6v0 ?? I:??[int, boolean, OBJECT, ARRAY, byte, short, char] A[D('it\1' java.lang.Object)]) != (r14v2 ?? I:??[int, boolean, OBJECT, ARRAY, byte, short, char])  -> B:42:0x00b2
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

    private static final List<InstalledVersion> PickUpdatesSheet$lambda$1(MutableState<List<InstalledVersion>> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String PickUpdatesSheet$lambda$4(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean PickUpdatesSheet$lambda$7(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void PickUpdatesSheet$lambda$8(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final Map<String, String> PickUpdatesSheet$lambda$10(MutableState<Map<String, String>> mutableState) {
        return mutableState.getValue();
    }

    private static final Map<String, String> PickUpdatesSheet$lambda$13(MutableState<Map<String, String>> mutableState) {
        return mutableState.getValue();
    }

    private static final String PickUpdatesSheet$lambda$16(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [int, void] */
    private static final int PickUpdatesSheet$lambda$21(MutableIntState $recheck$delegate) {
        MutableIntState mutableIntState = $recheck$delegate;
        return mutableIntState.setCurrentDirectory(mutableIntState);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r12v4 ??, still in use, count: 1, list:
          (r12v4 ?? I:??[int, boolean, OBJECT, ARRAY, byte, short, char]) from 0x006e: IF  (r9v0 ?? I:??[int, boolean, OBJECT, ARRAY, byte, short, char] A[D('it\1' java.lang.Object)]) != (r12v4 ?? I:??[int, boolean, OBJECT, ARRAY, byte, short, char])  -> B:20:0x0071
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1119)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:110)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit PickUpdatesSheet$lambda$25(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r12v4 ??, still in use, count: 1, list:
          (r12v4 ?? I:??[int, boolean, OBJECT, ARRAY, byte, short, char]) from 0x006e: IF  (r9v0 ?? I:??[int, boolean, OBJECT, ARRAY, byte, short, char] A[D('it\1' java.lang.Object)]) != (r12v4 ?? I:??[int, boolean, OBJECT, ARRAY, byte, short, char])  -> B:20:0x0071
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
    public static final Unit PickUpdatesSheet$lambda$25$0$0(AppState $state, DialogSpec.PickUpdates $d, MutableState $ver$delegate, MutableIntState $recheck$delegate) {
        $state.getModWatcher().getDetails().remove($d.getInstance() + "/" + PickUpdatesSheet$lambda$4($ver$delegate));
        $recheck$delegate.setIntValue(PickUpdatesSheet$lambda$21($recheck$delegate) + 1);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PickUpdatesSheet$lambda$25$2$0(AppState $state, DialogSpec.PickUpdates $d, Function0 $close, MutableState $updates$delegate, SnapshotStateMap $chosen, MutableState $ver$delegate, MutableState $titles$delegate) {
        Map<String, String> mapPickUpdatesSheet$lambda$10 = PickUpdatesSheet$lambda$10($updates$delegate);
        if (mapPickUpdatesSheet$lambda$10 == null) {
            mapPickUpdatesSheet$lambda$10 = MapsKt.emptyMap();
        }
        Iterable iterableKeySet = mapPickUpdatesSheet$lambda$10.keySet();
        Collection arrayList = new ArrayList();
        for (Object obj : iterableKeySet) {
            if (Intrinsics.areEqual($chosen.get((String) obj), (Object) true)) {
                arrayList.add(obj);
            }
        }
        List files = (List) arrayList;
        runModUpdates($state, $d.getInstance(), PickUpdatesSheet$lambda$4($ver$delegate), files, PickUpdatesSheet$lambda$13($titles$delegate), new Function1() { // from class: com.pymcl.android.ui.dialogs.ModsDialogsKt$$ExternalSyntheticLambda37
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return ModsDialogsKt.PickUpdatesSheet$lambda$25$2$0$1((List) obj2);
            }
        });
        $close.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PickUpdatesSheet$lambda$25$2$0$1(List it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v28 ??, still in use, count: 1, list:
          (r1v28 ?? I:??[int, boolean, OBJECT, ARRAY, byte, short, char]) from 0x01bc: IF  (r1v28 ?? I:??[int, boolean, OBJECT, ARRAY, byte, short, char]) == (0 ??[int, boolean, OBJECT, ARRAY, byte, short, char])  -> B:36:0x01c4
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1119)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:110)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit PickUpdatesSheet$lambda$26(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v28 ??, still in use, count: 1, list:
          (r1v28 ?? I:??[int, boolean, OBJECT, ARRAY, byte, short, char]) from 0x01bc: IF  (r1v28 ?? I:??[int, boolean, OBJECT, ARRAY, byte, short, char]) == (0 ??[int, boolean, OBJECT, ARRAY, byte, short, char])  -> B:36:0x01c4
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1119)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:110)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r46v0 ??
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
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r8v3 ??, still in use, count: 1, list:
          (r8v3 ?? I:??[int, boolean, OBJECT, ARRAY, byte, short, char]) from 0x00a5: IF  (r5v5 ?? I:??[int, boolean, OBJECT, ARRAY, byte, short, char] A[D('it\6' java.lang.Object)]) != (r8v3 ?? I:??[int, boolean, OBJECT, ARRAY, byte, short, char])  -> B:27:0x00b4
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1119)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:110)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit PickUpdatesSheet$lambda$26$0(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r8v3 ??, still in use, count: 1, list:
          (r8v3 ?? I:??[int, boolean, OBJECT, ARRAY, byte, short, char]) from 0x00a5: IF  (r5v5 ?? I:??[int, boolean, OBJECT, ARRAY, byte, short, char] A[D('it\6' java.lang.Object)]) != (r8v3 ?? I:??[int, boolean, OBJECT, ARRAY, byte, short, char])  -> B:27:0x00b4
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PickUpdatesSheet$lambda$26$0$2$0(MutableState $versions$delegate, MutableState $ver$delegate, int it) {
        $ver$delegate.setValue(PickUpdatesSheet$lambda$1($versions$delegate).get(it).getId());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PickUpdatesSheet$lambda$26$1$0$0(Map $u, SnapshotStateMap $chosen) {
        Iterator it = $u.keySet().iterator();
        while (it.hasNext()) {
            $chosen.put((String) it.next(), true);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PickUpdatesSheet$lambda$26$1$1$0(SnapshotStateMap $chosen) {
        $chosen.clear();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PickUpdatesSheet$lambda$26$2$0$0(SnapshotStateMap $chosen, String $f) {
        $chosen.put($f, Boolean.valueOf(!Intrinsics.areEqual($chosen.get($f), (Object) true)));
        return Unit.INSTANCE;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v8 ??, still in use, count: 1, list:
          (r3v8 ?? I:??[int, boolean, OBJECT, ARRAY, byte, short, char]) from 0x00c0: IF  (r3v8 ?? I:??[int, boolean, OBJECT, ARRAY, byte, short, char]) == (0 ??[int, boolean, OBJECT, ARRAY, byte, short, char])  -> B:24:0x00c6
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1119)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:110)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit PickUpdatesSheet$lambda$26$2$1(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v8 ??, still in use, count: 1, list:
          (r3v8 ?? I:??[int, boolean, OBJECT, ARRAY, byte, short, char]) from 0x00c0: IF  (r3v8 ?? I:??[int, boolean, OBJECT, ARRAY, byte, short, char]) == (0 ??[int, boolean, OBJECT, ARRAY, byte, short, char])  -> B:24:0x00c6
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1119)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:110)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r38v0 ??
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
    public static final Unit PickUpdatesSheet$lambda$26$2$1$1$0(SnapshotStateMap $chosen, String $f, boolean it) {
        $chosen.put($f, Boolean.valueOf(it));
        return Unit.INSTANCE;
    }
}
