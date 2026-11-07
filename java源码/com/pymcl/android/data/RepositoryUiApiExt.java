package com.pymcl.android.data;

import android.content.Context;
import androidx.autofill.HintConstants;
import com.pymcl.android.data.RepositoryUiApiExt;
import com.pymcl.android.ui.state.ConflictRow;
import com.pymcl.android.ui.state.ContentExportResult;
import com.pymcl.android.ui.state.DepCandidate;
import com.pymcl.android.ui.state.InstalledEntry;
import com.pymcl.android.ui.state.LauncherUiApi;
import com.pymcl.android.ui.state.LauncherUiApiExt;
import com.pymcl.android.ui.state.LauncherUiApiExt8;
import com.pymcl.core.account.Account;
import com.pymcl.core.download.DownloadManager;
import com.pymcl.core.instance.Instance;
import com.pymcl.core.instance.InstanceManager;
import com.pymcl.core.loader.LoaderType;
import com.pymcl.core.mods.ConflictIssue;
import com.pymcl.core.mods.ContentExport;
import com.pymcl.core.mods.GlobalMods;
import com.pymcl.core.mods.LoaderDetect;
import com.pymcl.core.mods.ModConflicts;
import com.pymcl.core.mods.ModFile;
import com.pymcl.core.mods.ModTools;
import com.pymcl.core.mods.ModpackExport;
import com.pymcl.core.mods.ResKind;
import com.pymcl.core.util.FileUtil;
import com.pymcl.core.version.ResolvedVersion;
import com.pymcl.runtime.settings.SettingsProtocol;
import java.awt.Choice;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
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
import kotlin.collections.SetsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

/* compiled from: RepositoryUiApiExt.kt */
@Metadata(d1 = {"\u0000´\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u0000 W2\u00020\u0001:\u0001WB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J2\u0010\u0012\u001a\u0002H\u0013\"\u0004\b\u0000\u0010\u00132\u001c\u0010\u0014\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00130\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u0015H\u0082@¢\u0006\u0002\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u000eH\u0002J\u0010\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u000eH\u0002J\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001b\u001a\u00020\u000eH\u0002J\u0018\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020\u000eH\u0002J\u001a\u0010#\u001a\u0004\u0018\u00010$2\u0006\u0010!\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020\u000eH\u0002J$\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0&2\u0006\u0010!\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020\u000eH\u0002J\u0018\u0010'\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u001b\u001a\u00020\u000eH\u0096@¢\u0006\u0002\u0010(J<\u0010)\u001a\b\u0012\u0004\u0012\u00020+0*2\u0006\u0010,\u001a\u00020\u000e2\u0006\u0010!\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020\u000e2\u0006\u0010-\u001a\u00020\u000e2\u0006\u0010.\u001a\u00020\u000eH\u0096@¢\u0006\u0002\u0010/JH\u00100\u001a\u00020\u000e2\u0006\u0010!\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020\u000e2\f\u00101\u001a\b\u0012\u0004\u0012\u00020+0*2\u001a\u00102\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u000104\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020503H\u0096@¢\u0006\u0002\u00106J,\u00107\u001a\b\u0012\u0004\u0012\u0002080*2\u0006\u0010,\u001a\u00020\u000e2\u0006\u0010!\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020\u000eH\u0096@¢\u0006\u0002\u00109J\"\u0010:\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010!\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020\u000eJB\u0010;\u001a\u00020\u000e2\u0006\u0010!\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020\u000e2\u0006\u0010<\u001a\u00020\u000e2\u001a\u00102\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u000104\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020503H\u0096@¢\u0006\u0002\u0010=J0\u0010>\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u001e0&0*2\u0006\u0010!\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020\u000eH\u0096@¢\u0006\u0002\u0010?JX\u0010@\u001a\u00020\u000e2\u0006\u0010!\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u000e2\u0006\u0010A\u001a\u00020\u000e2\f\u0010B\u001a\b\u0012\u0004\u0012\u00020\u000e0*2\u001a\u00102\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u000104\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020503H\u0096@¢\u0006\u0002\u0010CJ\u0006\u0010D\u001a\u00020EJ(\u0010F\u001a\u0004\u0018\u00010\u000e2\u0006\u0010,\u001a\u00020\u000e2\u0006\u0010!\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020\u000eH\u0096@¢\u0006\u0002\u00109J\u0014\u0010G\u001a\b\u0012\u0004\u0012\u0002080*H\u0096@¢\u0006\u0002\u0010HJ\u001e\u0010I\u001a\u0002052\u0006\u0010<\u001a\u00020\u000e2\u0006\u0010J\u001a\u00020\u001eH\u0096@¢\u0006\u0002\u0010KJ\u0016\u0010L\u001a\u0002052\u0006\u0010<\u001a\u00020\u000eH\u0096@¢\u0006\u0002\u0010(J\u0016\u0010M\u001a\u00020\u000e2\u0006\u0010N\u001a\u00020\u000eH\u0096@¢\u0006\u0002\u0010(J\u0010\u0010O\u001a\u0004\u0018\u00010\u000eH\u0096@¢\u0006\u0002\u0010HJ$\u0010P\u001a\b\u0012\u0004\u0012\u00020\u000e0Q2\u0006\u0010!\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020\u000eH\u0096@¢\u0006\u0002\u0010?J\u001c\u0010R\u001a\b\u0012\u0004\u0012\u00020\u000e0*2\u0006\u0010!\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020\u000eJB\u0010S\u001a\u00020T2\u0006\u0010,\u001a\u00020\u000e2\u0006\u0010!\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020\u000e2\u001a\u00102\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u000104\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020503H\u0096@¢\u0006\u0002\u0010=J$\u0010U\u001a\b\u0012\u0004\u0012\u00020V0*2\u0006\u0010!\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020\u000eH\u0096@¢\u0006\u0002\u0010?R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bRB\u0010\f\u001a6\u0012\u0004\u0012\u00020\u000e\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00100\u000f0\rj\u001a\u0012\u0004\u0012\u00020\u000e\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00100\u000f`\u0011X\u0082\u0004¢\u0006\u0002\n\u0000Ê\u0001\f\bY\u0012\b\bZ\u0012\u0004\b\u0003\u0010\u0000¨\u0006X"}, d2 = {"Lcom/pymcl/android/data/RepositoryUiApiExt;", "Lcom/pymcl/android/ui/state/LauncherUiApiExt8;", "ctx", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "repo", "Lcom/pymcl/android/data/LauncherRepository;", "tools", "Lcom/pymcl/core/mods/ModTools;", "getTools", "()Lcom/pymcl/core/mods/ModTools;", "lastUpdates", "Ljava/util/HashMap;", "", "", "Lcom/pymcl/core/mods/ModFile;", "Lkotlin/collections/HashMap;", "io", "T", "b", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "inst", "Lcom/pymcl/core/instance/Instance;", HintConstants.AUTOFILL_HINT_NAME, "requireInstance", "instanceExists", "", "gameDir", "Ljava/io/File;", "instance", "version", "resolved", "Lcom/pymcl/core/version/ResolvedVersion;", "mcLoader", "Lkotlin/Pair;", "accountSkinFile", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "missingDependencies", "", "Lcom/pymcl/android/ui/state/DepCandidate;", "kind", "id", "fileId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "installDependencies", "deps", "onProgress", "Lkotlin/Function2;", "", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "identifyInstalled", "Lcom/pymcl/android/ui/state/InstalledEntry;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "checkUpdates", "applyModUpdate", "filename", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "modpackExportCandidates", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "exportModpack", "packVersion", "include", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "globalMods", "Lcom/pymcl/core/mods/GlobalMods;", "contentDirPath", "listGlobalMods", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setGlobalModEnabled", "enabled", "(Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteGlobalMod", "importGlobalMod", "path", "globalModsDirPath", "globalInjected", "", "injectGlobalMods", "exportAllContents", "Lcom/pymcl/android/ui/state/ContentExportResult;", "modConflicts", "Lcom/pymcl/android/ui/state/ConflictRow;", "Companion", "PyMCL-Android:app_debug", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes21.dex */
public final class RepositoryUiApiExt implements LauncherUiApiExt8 {
    private static volatile RepositoryUiApiExt inst;
    private final HashMap<String, Map<String, ModFile>> lastUpdates;
    private final LauncherRepository repo;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final RepositoryUiApiExt$Companion$NONE$1 NONE = new LauncherUiApiExt() { // from class: com.pymcl.android.data.RepositoryUiApiExt$Companion$NONE$1
        @Override // com.pymcl.android.ui.state.LauncherUiApiExt
        public /* bridge */ Object accountSkinFile(String name, Continuation<? super String> continuation) {
            return super.accountSkinFile(name, continuation);
        }

        @Override // com.pymcl.android.ui.state.LauncherUiApiExt
        public /* bridge */ Object applyModUpdate(String instance, String version, String filename, Function2<? super Float, ? super String, Unit> function2, Continuation<? super String> continuation) {
            return super.applyModUpdate(instance, version, filename, function2, continuation);
        }

        @Override // com.pymcl.android.ui.state.LauncherUiApiExt
        public /* bridge */ Object exportModpack(String instance, String version, String name, String packVersion, List<String> list, Function2<? super Float, ? super String, Unit> function2, Continuation<? super String> continuation) {
            return super.exportModpack(instance, version, name, packVersion, list, function2, continuation);
        }

        @Override // com.pymcl.android.ui.state.LauncherUiApiExt
        public /* bridge */ Object identifyInstalled(String kind, String instance, String version, Continuation<? super List<InstalledEntry>> continuation) {
            return super.identifyInstalled(kind, instance, version, continuation);
        }

        @Override // com.pymcl.android.ui.state.LauncherUiApiExt
        public /* bridge */ Object installDependencies(String instance, String version, List<DepCandidate> list, Function2<? super Float, ? super String, Unit> function2, Continuation<? super String> continuation) {
            return super.installDependencies(instance, version, list, function2, continuation);
        }

        @Override // com.pymcl.android.ui.state.LauncherUiApiExt
        public /* bridge */ Object missingDependencies(String kind, String instance, String version, String id, String fileId, Continuation<? super List<DepCandidate>> continuation) {
            return super.missingDependencies(kind, instance, version, id, fileId, continuation);
        }

        @Override // com.pymcl.android.ui.state.LauncherUiApiExt
        public /* bridge */ Object modpackExportCandidates(String instance, String version, Continuation<? super List<Pair<String, Boolean>>> continuation) {
            return super.modpackExportCandidates(instance, version, continuation);
        }
    };

    /* compiled from: RepositoryUiApiExt.kt */
    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    @DebugMetadata(c = "com.pymcl.android.data.RepositoryUiApiExt", f = "RepositoryUiApiExt.kt", i = {0, 0, 0, 0}, l = {93}, m = "applyModUpdate", n = {"instance", "version", "filename", "onProgress"}, nl = {100}, s = {"L$0", "L$1", "L$2", "L$3"}, v = 2)
    /* renamed from: com.pymcl.android.data.RepositoryUiApiExt$applyModUpdate$1, reason: invalid class name */
    static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RepositoryUiApiExt.this.applyModUpdate(null, null, null, null, this);
        }
    }

    /* compiled from: RepositoryUiApiExt.kt */
    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    @DebugMetadata(c = "com.pymcl.android.data.RepositoryUiApiExt", f = "RepositoryUiApiExt.kt", i = {0, 0, 0, 0, 0, 0}, l = {106}, m = "exportModpack", n = {"instance", "version", HintConstants.AUTOFILL_HINT_NAME, "packVersion", "include", "onProgress"}, nl = {121}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5"}, v = 2)
    /* renamed from: com.pymcl.android.data.RepositoryUiApiExt$exportModpack$1, reason: invalid class name */
    static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RepositoryUiApiExt.this.exportModpack(null, null, null, null, null, null, this);
        }
    }

    /* compiled from: RepositoryUiApiExt.kt */
    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    @DebugMetadata(c = "com.pymcl.android.data.RepositoryUiApiExt", f = "RepositoryUiApiExt.kt", i = {0}, l = {140}, m = "importGlobalMod", n = {"path"}, nl = {-1}, s = {"L$0"}, v = 2)
    /* renamed from: com.pymcl.android.data.RepositoryUiApiExt$importGlobalMod$1, reason: invalid class name */
    static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RepositoryUiApiExt.this.importGlobalMod(null, this);
        }
    }

    /* compiled from: RepositoryUiApiExt.kt */
    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    @DebugMetadata(c = "com.pymcl.android.data.RepositoryUiApiExt", f = "RepositoryUiApiExt.kt", i = {0, 0}, l = {138}, m = "setGlobalModEnabled", n = {"filename", "enabled"}, nl = {-1}, s = {"L$0", "Z$0"}, v = 2)
    /* renamed from: com.pymcl.android.data.RepositoryUiApiExt$setGlobalModEnabled$1, reason: invalid class name */
    static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RepositoryUiApiExt.this.setGlobalModEnabled(null, false, this);
        }
    }

    public /* synthetic */ RepositoryUiApiExt(Context context, DefaultConstructorMarker defaultConstructorMarker) {
        this(context);
    }

    /* compiled from: RepositoryUiApiExt.kt */
    @Metadata(d1 = {"\u0000+\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fR\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\b¨\u0006\u0010"}, d2 = {"Lcom/pymcl/android/data/RepositoryUiApiExt$Companion;", "", "<init>", "()V", "inst", "Lcom/pymcl/android/data/RepositoryUiApiExt;", "NONE", "com/pymcl/android/data/RepositoryUiApiExt$Companion$NONE$1", "Lcom/pymcl/android/data/RepositoryUiApiExt$Companion$NONE$1;", SettingsProtocol.GET, "ctx", "Landroid/content/Context;", "forApi", "Lcom/pymcl/android/ui/state/LauncherUiApiExt;", "api", "Lcom/pymcl/android/ui/state/LauncherUiApi;", "PyMCL-Android:app_debug"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final RepositoryUiApiExt get(Context ctx) {
            RepositoryUiApiExt repositoryUiApiExt;
            Intrinsics.checkNotNullParameter(ctx, "ctx");
            RepositoryUiApiExt repositoryUiApiExt2 = RepositoryUiApiExt.inst;
            if (repositoryUiApiExt2 != null) {
                return repositoryUiApiExt2;
            }
            synchronized (this) {
                repositoryUiApiExt = RepositoryUiApiExt.inst;
                if (repositoryUiApiExt == null) {
                    Context applicationContext = ctx.getApplicationContext();
                    Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
                    repositoryUiApiExt = new RepositoryUiApiExt(applicationContext, null);
                    Companion companion = RepositoryUiApiExt.INSTANCE;
                    RepositoryUiApiExt.inst = repositoryUiApiExt;
                }
            }
            return repositoryUiApiExt;
        }

        public final LauncherUiApiExt forApi(LauncherUiApi api) {
            LauncherUiApiExt launcherUiApiExt;
            Intrinsics.checkNotNullParameter(api, "api");
            RepositoryUiApi repositoryUiApi = api instanceof RepositoryUiApi ? (RepositoryUiApi) api : null;
            if (repositoryUiApi == null || (launcherUiApiExt = RepositoryUiApiExt.INSTANCE.get(repositoryUiApi.getCtx())) == null) {
                launcherUiApiExt = RepositoryUiApiExt.NONE;
            }
            return launcherUiApiExt;
        }
    }

    private RepositoryUiApiExt(Context ctx) {
        this.repo = LauncherRepository.INSTANCE.get(ctx);
        this.lastUpdates = new HashMap<>();
    }

    public final ModTools getTools() {
        return this.repo.getModTools();
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: RepositoryUiApiExt.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "T", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 4, 0}, xi = 48)
    @DebugMetadata(c = "com.pymcl.android.data.RepositoryUiApiExt$io$2", f = "RepositoryUiApiExt.kt", i = {}, l = {29}, m = "invokeSuspend", n = {}, nl = {-1}, s = {}, v = 2)
    /* renamed from: com.pymcl.android.data.RepositoryUiApiExt$io$2, reason: invalid class name */
    static final class AnonymousClass2<T> extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super T>, Object> {
        final /* synthetic */ Function1<Continuation<? super T>, Object> $b;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(Function1<? super Continuation<? super T>, ? extends Object> function1, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$b = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.$b, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super T> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    Function1<Continuation<? super T>, Object> function1 = this.$b;
                    this.label = 1;
                    Object objInvoke = function1.invoke(this);
                    return objInvoke == coroutine_suspended ? coroutine_suspended : objInvoke;
                case 1:
                    ResultKt.throwOnFailure($result);
                    return $result;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <T> Object io(Function1<? super Continuation<? super T>, ? extends Object> function1, Continuation<? super T> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new AnonymousClass2(function1, null), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Instance inst(String name) {
        InstanceManager instances = this.repo.getInstances();
        String strString = name;
        if (StringsKt.isBlank(strString)) {
            strString = this.repo.getConfig().string("default_instance");
        }
        String str = strString;
        if (StringsKt.isBlank(str)) {
            str = null;
        }
        return instances.get(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Instance requireInstance(String name) {
        Instance instanceFindInstance = RepositoryUiApi.INSTANCE.findInstance(this.repo.getInstances(), this.repo.getConfig().string("default_instance"), name);
        if (instanceFindInstance != null) {
            return instanceFindInstance;
        }
        throw new IllegalStateException(RepositoryUiApi.INSTANCE.missingInstanceMessage(name, this.repo.getConfig().string("default_instance")));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean instanceExists(String name) {
        return RepositoryUiApi.INSTANCE.findInstance(this.repo.getInstances(), this.repo.getConfig().string("default_instance"), name) != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final File gameDir(String instance, String version) {
        Instance i = inst(instance);
        return StringsKt.isBlank(version) ? i.getDir() : i.settings(version, this.repo.getConfig()).gameDir(i.getDir());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.pymcl.core.version.ResolvedVersion resolved(java.lang.String r9, java.lang.String r10) {
        /*
            r8 = this;
            kotlin.Result$Companion r0 = kotlin.Result.INSTANCE     // Catch: java.lang.Throwable -> L26
            r0 = r8
            com.pymcl.android.data.RepositoryUiApiExt r0 = (com.pymcl.android.data.RepositoryUiApiExt) r0     // Catch: java.lang.Throwable -> L26
            r1 = 0
            com.pymcl.core.version.ResolvedVersion$Companion r2 = com.pymcl.core.version.ResolvedVersion.Companion     // Catch: java.lang.Throwable -> L26
            com.pymcl.android.data.LauncherRepository r3 = r0.repo     // Catch: java.lang.Throwable -> L26
            com.pymcl.core.instance.Instance r4 = r0.inst(r9)     // Catch: java.lang.Throwable -> L26
            com.pymcl.core.version.GameDirs r3 = r3.dirsFor(r4)     // Catch: java.lang.Throwable -> L26
            java.io.File r3 = r3.getVersionsDir()     // Catch: java.lang.Throwable -> L26
            r6 = 4
            r7 = 0
            r5 = 0
            r4 = r10
            com.pymcl.core.version.ResolvedVersion r10 = com.pymcl.core.version.ResolvedVersion.Companion.load$default(r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L23
            java.lang.Object r10 = kotlin.Result.m8116constructorimpl(r10)     // Catch: java.lang.Throwable -> L23
            goto L33
        L23:
            r0 = move-exception
            r10 = r0
            goto L29
        L26:
            r0 = move-exception
            r4 = r10
            r10 = r0
        L29:
            kotlin.Result$Companion r0 = kotlin.Result.INSTANCE
            java.lang.Object r10 = kotlin.ResultKt.createFailure(r10)
            java.lang.Object r10 = kotlin.Result.m8116constructorimpl(r10)
        L33:
            boolean r0 = kotlin.Result.m8122isFailureimpl(r10)
            if (r0 == 0) goto L3a
            r10 = 0
        L3a:
            com.pymcl.core.version.ResolvedVersion r10 = (com.pymcl.core.version.ResolvedVersion) r10
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.android.data.RepositoryUiApiExt.resolved(java.lang.String, java.lang.String):com.pymcl.core.version.ResolvedVersion");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Pair<String, String> mcLoader(String instance, String version) {
        ResolvedVersion v = resolved(instance, version);
        if (v == null) {
            return TuplesKt.to(version, "");
        }
        String mcVersion = v.getMcVersion();
        LoaderDetect loaderDetect = LoaderDetect.INSTANCE;
        Pair<LoaderType, String> pairDetect = LoaderDetect.INSTANCE.detect(v);
        return TuplesKt.to(mcVersion, loaderDetect.catalogName(pairDetect != null ? pairDetect.getFirst() : null));
    }

    /* compiled from: RepositoryUiApiExt.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 4, 0}, xi = 48)
    @DebugMetadata(c = "com.pymcl.android.data.RepositoryUiApiExt$accountSkinFile$2", f = "RepositoryUiApiExt.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
    /* renamed from: com.pymcl.android.data.RepositoryUiApiExt$accountSkinFile$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements Function1<Continuation<? super String>, Object> {
        final /* synthetic */ String $name;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(String str, Continuation<? super AnonymousClass2> continuation) {
            super(1, continuation);
            this.$name = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return RepositoryUiApiExt.this.new AnonymousClass2(this.$name, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super String> continuation) {
            return ((AnonymousClass2) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object objM8116constructorimpl;
            Object next;
            File fileOfflineSkinFile;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    RepositoryUiApiExt repositoryUiApiExt = RepositoryUiApiExt.this;
                    String str = this.$name;
                    try {
                        Result.Companion companion = Result.INSTANCE;
                        Iterator it = repositoryUiApiExt.repo.getAccounts().list().iterator();
                        while (true) {
                            if (it.hasNext()) {
                                next = it.next();
                                if (Intrinsics.areEqual(((Account) next).getName(), str)) {
                                }
                            } else {
                                next = null;
                            }
                        }
                        Account account = (Account) next;
                        String absolutePath = (account == null || (fileOfflineSkinFile = repositoryUiApiExt.repo.offlineSkinFile(account)) == null) ? null : fileOfflineSkinFile.getAbsolutePath();
                        objM8116constructorimpl = Result.m8116constructorimpl(absolutePath);
                    } catch (Throwable th) {
                        Result.Companion companion2 = Result.INSTANCE;
                        objM8116constructorimpl = Result.m8116constructorimpl(ResultKt.createFailure(th));
                    }
                    if (Result.m8122isFailureimpl(objM8116constructorimpl)) {
                        return null;
                    }
                    return objM8116constructorimpl;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    @Override // com.pymcl.android.ui.state.LauncherUiApiExt
    public Object accountSkinFile(String name, Continuation<? super String> continuation) {
        return io(new AnonymousClass2(name, null), continuation);
    }

    /* compiled from: RepositoryUiApiExt.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n"}, d2 = {"<anonymous>", "", "Lcom/pymcl/android/ui/state/DepCandidate;"}, k = 3, mv = {2, 4, 0}, xi = 48)
    @DebugMetadata(c = "com.pymcl.android.data.RepositoryUiApiExt$missingDependencies$2", f = "RepositoryUiApiExt.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
    /* renamed from: com.pymcl.android.data.RepositoryUiApiExt$missingDependencies$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements Function1<Continuation<? super List<? extends DepCandidate>>, Object> {
        final /* synthetic */ String $fileId;
        final /* synthetic */ String $id;
        final /* synthetic */ String $instance;
        final /* synthetic */ String $kind;
        final /* synthetic */ String $version;
        int label;
        final /* synthetic */ RepositoryUiApiExt this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(String str, String str2, RepositoryUiApiExt repositoryUiApiExt, String str3, String str4, String str5, Continuation<? super AnonymousClass2> continuation) {
            super(1, continuation);
            this.$kind = str;
            this.$version = str2;
            this.this$0 = repositoryUiApiExt;
            this.$id = str3;
            this.$fileId = str4;
            this.$instance = str5;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return new AnonymousClass2(this.$kind, this.$version, this.this$0, this.$id, this.$fileId, this.$instance, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Continuation<? super List<? extends DepCandidate>> continuation) {
            return invoke2((Continuation<? super List<DepCandidate>>) continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Continuation<? super List<DepCandidate>> continuation) {
            return ((AnonymousClass2) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x0097  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x00b8  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00e1  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x0108 A[LOOP:1: B:37:0x0102->B:39:0x0108, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:43:0x0154 A[LOOP:2: B:41:0x014e->B:43:0x0154, LOOP_END] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r26) throws com.pymcl.core.loader.InstallError {
            /*
                Method dump skipped, instructions count: 408
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.pymcl.android.data.RepositoryUiApiExt.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Override // com.pymcl.android.ui.state.LauncherUiApiExt
    public Object missingDependencies(String kind, String instance, String version, String id, String fileId, Continuation<? super List<DepCandidate>> continuation) {
        return io(new AnonymousClass2(kind, version, this, id, fileId, instance, null), continuation);
    }

    /* compiled from: RepositoryUiApiExt.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 4, 0}, xi = 48)
    @DebugMetadata(c = "com.pymcl.android.data.RepositoryUiApiExt$installDependencies$2", f = "RepositoryUiApiExt.kt", i = {0, 0, 0, 0, 0, 0, 0, 0}, l = {65}, m = "invokeSuspend", n = {"gd", "done", "$this$forEachIndexed\\1", "item\\1", "d\\2", "f\\2", "index\\1", "i\\2"}, nl = {66}, s = {"L$0", "L$1", "L$2", "L$7", "L$8", "L$9", "I$0", "I$1"}, v = 2)
    /* renamed from: com.pymcl.android.data.RepositoryUiApiExt$installDependencies$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements Function1<Continuation<? super String>, Object> {
        final /* synthetic */ List<DepCandidate> $deps;
        final /* synthetic */ String $instance;
        final /* synthetic */ Function2<Float, String, Unit> $onProgress;
        final /* synthetic */ String $version;
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$10;
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
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(String str, String str2, List<DepCandidate> list, Function2<? super Float, ? super String, Unit> function2, Continuation<? super AnonymousClass2> continuation) {
            super(1, continuation);
            this.$instance = str;
            this.$version = str2;
            this.$deps = list;
            this.$onProgress = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return RepositoryUiApiExt.this.new AnonymousClass2(this.$instance, this.$version, this.$deps, this.$onProgress, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super String> continuation) {
            return ((AnonymousClass2) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x009b  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0168  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0143 -> B:17:0x0151). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r35) throws com.pymcl.core.loader.InstallError {
            /*
                Method dump skipped, instructions count: 398
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.pymcl.android.data.RepositoryUiApiExt.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0$0(Function2 $onProgress, int $i, List $deps, DepCandidate $d, float p) {
            $onProgress.invoke(Float.valueOf(($i + p) / $deps.size()), $d.getTitle());
            return Unit.INSTANCE;
        }
    }

    @Override // com.pymcl.android.ui.state.LauncherUiApiExt
    public Object installDependencies(String instance, String version, List<DepCandidate> list, Function2<? super Float, ? super String, Unit> function2, Continuation<? super String> continuation) {
        return io(new AnonymousClass2(instance, version, list, function2, null), continuation);
    }

    /* compiled from: RepositoryUiApiExt.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n"}, d2 = {"<anonymous>", "", "Lcom/pymcl/android/ui/state/InstalledEntry;"}, k = 3, mv = {2, 4, 0}, xi = 48)
    @DebugMetadata(c = "com.pymcl.android.data.RepositoryUiApiExt$identifyInstalled$2", f = "RepositoryUiApiExt.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
    /* renamed from: com.pymcl.android.data.RepositoryUiApiExt$identifyInstalled$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements Function1<Continuation<? super List<? extends InstalledEntry>>, Object> {
        final /* synthetic */ String $instance;
        final /* synthetic */ String $kind;
        final /* synthetic */ String $version;
        int label;
        final /* synthetic */ RepositoryUiApiExt this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(String str, RepositoryUiApiExt repositoryUiApiExt, String str2, String str3, Continuation<? super AnonymousClass2> continuation) {
            super(1, continuation);
            this.$kind = str;
            this.this$0 = repositoryUiApiExt;
            this.$instance = str2;
            this.$version = str3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return new AnonymousClass2(this.$kind, this.this$0, this.$instance, this.$version, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Continuation<? super List<? extends InstalledEntry>> continuation) {
            return invoke2((Continuation<? super List<InstalledEntry>>) continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Continuation<? super List<InstalledEntry>> continuation) {
            return ((AnonymousClass2) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:114:0x00b2 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00af  */
        /* JADX WARN: Removed duplicated region for block: B:59:0x0138  */
        /* JADX WARN: Removed duplicated region for block: B:84:0x01ab  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r27) {
            /*
                Method dump skipped, instructions count: 512
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.pymcl.android.data.RepositoryUiApiExt.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Override // com.pymcl.android.ui.state.LauncherUiApiExt
    public Object identifyInstalled(String kind, String instance, String version, Continuation<? super List<InstalledEntry>> continuation) {
        return io(new AnonymousClass2(kind, this, instance, version, null), continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a1 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v27 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Map<java.lang.String, com.pymcl.core.mods.ModFile> checkUpdates(java.lang.String r22, java.lang.String r23) {
        /*
            Method dump skipped, instructions count: 265
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.android.data.RepositoryUiApiExt.checkUpdates(java.lang.String, java.lang.String):java.util.Map");
    }

    /* compiled from: RepositoryUiApiExt.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n"}, d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType"}, k = 3, mv = {2, 4, 0}, xi = 48)
    @DebugMetadata(c = "com.pymcl.android.data.RepositoryUiApiExt$applyModUpdate$2", f = "RepositoryUiApiExt.kt", i = {0, 0}, l = {98}, m = "invokeSuspend", n = {"nf", "dir"}, nl = {99}, s = {"L$0", "L$1"}, v = 2)
    /* renamed from: com.pymcl.android.data.RepositoryUiApiExt$applyModUpdate$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements Function1<Continuation<? super String>, Object> {
        final /* synthetic */ String $filename;
        final /* synthetic */ String $instance;
        final /* synthetic */ Function2<Float, String, Unit> $onProgress;
        final /* synthetic */ String $version;
        Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(String str, String str2, String str3, Function2<? super Float, ? super String, Unit> function2, Continuation<? super AnonymousClass2> continuation) {
            super(1, continuation);
            this.$instance = str;
            this.$version = str2;
            this.$filename = str3;
            this.$onProgress = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return RepositoryUiApiExt.this.new AnonymousClass2(this.$instance, this.$version, this.$filename, this.$onProgress, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super String> continuation) {
            return ((AnonymousClass2) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) throws IOException {
            ModFile modFile;
            Object objApplyUpdate;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    HashMap map = RepositoryUiApiExt.this.lastUpdates;
                    RepositoryUiApiExt repositoryUiApiExt = RepositoryUiApiExt.this;
                    String str = this.$instance;
                    String str2 = this.$version;
                    String str3 = this.$filename;
                    synchronized (map) {
                        Map map2 = (Map) repositoryUiApiExt.lastUpdates.get(str + "/" + str2);
                        modFile = map2 != null ? (ModFile) map2.get(str3) : null;
                    }
                    if (modFile == null && (modFile = RepositoryUiApiExt.this.checkUpdates(this.$instance, this.$version).get(this.$filename)) == null) {
                        throw new IllegalStateException("没有找到「" + this.$filename + "」的更新");
                    }
                    final ModFile nf = modFile;
                    RepositoryUiApiExt.this.requireInstance(this.$instance);
                    File dir = RepositoryUiApiExt.this.repo.getCatalog().targetDir(ResKind.MOD, RepositoryUiApiExt.this.gameDir(this.$instance, this.$version));
                    ModTools tools = RepositoryUiApiExt.this.getTools();
                    File fileSafeChild = FileUtil.INSTANCE.safeChild(dir, this.$filename);
                    DownloadManager downloads = RepositoryUiApiExt.this.repo.getDownloads();
                    final Function2<Float, String, Unit> function2 = this.$onProgress;
                    this.L$0 = SpillingKt.nullOutSpilledVariable(nf);
                    this.L$1 = SpillingKt.nullOutSpilledVariable(dir);
                    this.label = 1;
                    objApplyUpdate = tools.applyUpdate(fileSafeChild, nf, downloads, new Function1() { // from class: com.pymcl.android.data.RepositoryUiApiExt$applyModUpdate$2$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return RepositoryUiApiExt.AnonymousClass2.invokeSuspend$lambda$1(function2, nf, ((Float) obj).floatValue());
                        }
                    }, this);
                    if (objApplyUpdate == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    break;
                case 1:
                    ResultKt.throwOnFailure($result);
                    objApplyUpdate = $result;
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            String name = ((File) objApplyUpdate).getName();
            RepositoryUiApiExt repositoryUiApiExt2 = RepositoryUiApiExt.this;
            String str4 = this.$instance;
            String str5 = this.$version;
            String str6 = this.$filename;
            synchronized (repositoryUiApiExt2.lastUpdates) {
                HashMap map3 = repositoryUiApiExt2.lastUpdates;
                String str7 = str4 + "/" + str5;
                Map mapEmptyMap = (Map) repositoryUiApiExt2.lastUpdates.get(str4 + "/" + str5);
                if (mapEmptyMap == null) {
                    mapEmptyMap = MapsKt.emptyMap();
                }
                map3.put(str7, MapsKt.minus((Map<? extends String, ? extends V>) mapEmptyMap, str6));
                Unit unit = Unit.INSTANCE;
            }
            return name;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$1(Function2 $onProgress, ModFile $nf, float it) {
            $onProgress.invoke(Float.valueOf(it), $nf.getName());
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // com.pymcl.android.ui.state.LauncherUiApiExt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object applyModUpdate(java.lang.String r11, java.lang.String r12, java.lang.String r13, kotlin.jvm.functions.Function2<? super java.lang.Float, ? super java.lang.String, kotlin.Unit> r14, kotlin.coroutines.Continuation<? super java.lang.String> r15) {
        /*
            r10 = this;
            boolean r0 = r15 instanceof com.pymcl.android.data.RepositoryUiApiExt.AnonymousClass1
            if (r0 == 0) goto L14
            r0 = r15
            com.pymcl.android.data.RepositoryUiApiExt$applyModUpdate$1 r0 = (com.pymcl.android.data.RepositoryUiApiExt.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r1 = r0.label
            int r1 = r1 - r2
            r0.label = r1
            goto L19
        L14:
            com.pymcl.android.data.RepositoryUiApiExt$applyModUpdate$1 r0 = new com.pymcl.android.data.RepositoryUiApiExt$applyModUpdate$1
            r0.<init>(r15)
        L19:
            java.lang.Object r1 = r0.result
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r3 = r0.label
            switch(r3) {
                case 0: goto L49;
                case 1: goto L2e;
                default: goto L24;
            }
        L24:
            r5 = r11
            r6 = r12
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L2e:
            java.lang.Object r2 = r0.L$3
            r14 = r2
            kotlin.jvm.functions.Function2 r14 = (kotlin.jvm.functions.Function2) r14
            java.lang.Object r2 = r0.L$2
            r13 = r2
            java.lang.String r13 = (java.lang.String) r13
            java.lang.Object r2 = r0.L$1
            r12 = r2
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r2 = r0.L$0
            r11 = r2
            java.lang.String r11 = (java.lang.String) r11
            kotlin.ResultKt.throwOnFailure(r1)
            r4 = r10
            r5 = r11
            r11 = r1
            goto L7e
        L49:
            kotlin.ResultKt.throwOnFailure(r1)
            com.pymcl.android.data.RepositoryUiApiExt$applyModUpdate$2 r3 = new com.pymcl.android.data.RepositoryUiApiExt$applyModUpdate$2
            r9 = 0
            r4 = r10
            r5 = r11
            r6 = r12
            r7 = r13
            r8 = r14
            r3.<init>(r5, r6, r7, r8, r9)
            kotlin.jvm.functions.Function1 r3 = (kotlin.jvm.functions.Function1) r3
            java.lang.Object r11 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r5)
            r0.L$0 = r11
            java.lang.Object r11 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r6)
            r0.L$1 = r11
            java.lang.Object r11 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r7)
            r0.L$2 = r11
            java.lang.Object r11 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r8)
            r0.L$3 = r11
            r11 = 1
            r0.label = r11
            java.lang.Object r11 = r10.io(r3, r0)
            if (r11 != r2) goto L7b
            return r2
        L7b:
            r12 = r6
            r13 = r7
            r14 = r8
        L7e:
            java.lang.String r2 = "io(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r11, r2)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.android.data.RepositoryUiApiExt.applyModUpdate(java.lang.String, java.lang.String, java.lang.String, kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* compiled from: RepositoryUiApiExt.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\u0010\u0000\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u0001H\n"}, d2 = {"<anonymous>", "", "Lkotlin/Pair;", "", ""}, k = 3, mv = {2, 4, 0}, xi = 48)
    @DebugMetadata(c = "com.pymcl.android.data.RepositoryUiApiExt$modpackExportCandidates$2", f = "RepositoryUiApiExt.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
    /* renamed from: com.pymcl.android.data.RepositoryUiApiExt$modpackExportCandidates$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements Function1<Continuation<? super List<? extends Pair<? extends String, ? extends Boolean>>>, Object> {
        final /* synthetic */ String $instance;
        final /* synthetic */ String $version;
        int label;
        final /* synthetic */ RepositoryUiApiExt this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(String str, RepositoryUiApiExt repositoryUiApiExt, String str2, Continuation<? super AnonymousClass2> continuation) {
            super(1, continuation);
            this.$version = str;
            this.this$0 = repositoryUiApiExt;
            this.$instance = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return new AnonymousClass2(this.$version, this.this$0, this.$instance, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Continuation<? super List<? extends Pair<? extends String, ? extends Boolean>>> continuation) {
            return invoke2((Continuation<? super List<Pair<String, Boolean>>>) continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Continuation<? super List<Pair<String, Boolean>>> continuation) {
            return ((AnonymousClass2) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    return StringsKt.isBlank(this.$version) ? CollectionsKt.emptyList() : ModpackExport.INSTANCE.candidates(this.this$0.gameDir(this.$instance, this.$version), this.$version);
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    @Override // com.pymcl.android.ui.state.LauncherUiApiExt
    public Object modpackExportCandidates(String instance, String version, Continuation<? super List<Pair<String, Boolean>>> continuation) {
        return io(new AnonymousClass2(version, this, instance, null), continuation);
    }

    /* compiled from: RepositoryUiApiExt.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n"}, d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType"}, k = 3, mv = {2, 4, 0}, xi = 48)
    @DebugMetadata(c = "com.pymcl.android.data.RepositoryUiApiExt$exportModpack$2", f = "RepositoryUiApiExt.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
    /* renamed from: com.pymcl.android.data.RepositoryUiApiExt$exportModpack$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements Function1<Continuation<? super String>, Object> {
        final /* synthetic */ List<String> $include;
        final /* synthetic */ String $instance;
        final /* synthetic */ String $name;
        final /* synthetic */ Function2<Float, String, Unit> $onProgress;
        final /* synthetic */ String $packVersion;
        final /* synthetic */ String $version;
        int label;
        final /* synthetic */ RepositoryUiApiExt this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(String str, RepositoryUiApiExt repositoryUiApiExt, String str2, Function2<? super Float, ? super String, Unit> function2, String str3, String str4, List<String> list, Continuation<? super AnonymousClass2> continuation) {
            super(1, continuation);
            this.$version = str;
            this.this$0 = repositoryUiApiExt;
            this.$instance = str2;
            this.$onProgress = function2;
            this.$name = str3;
            this.$packVersion = str4;
            this.$include = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return new AnonymousClass2(this.$version, this.this$0, this.$instance, this.$onProgress, this.$name, this.$packVersion, this.$include, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super String> continuation) {
            return ((AnonymousClass2) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object objM8116constructorimpl;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    if (StringsKt.isBlank(this.$version)) {
                        throw new IllegalStateException("请先选择要导出的版本");
                    }
                    File gd = this.this$0.gameDir(this.$instance, this.$version);
                    ResolvedVersion v = this.this$0.resolved(this.$instance, this.$version);
                    if (v == null) {
                        throw new IllegalStateException("版本 " + this.$version + " 不存在");
                    }
                    this.$onProgress.invoke(null, "识别可在线下载的文件");
                    HashMap remote = new HashMap();
                    Iterable iterableListOf = CollectionsKt.listOf((Object[]) new String[]{"mods", "resourcepacks", "shaderpacks"});
                    List<String> list = this.$include;
                    Collection arrayList = new ArrayList();
                    for (Object obj : iterableListOf) {
                        if (list.contains((String) obj)) {
                            arrayList.add(obj);
                        }
                    }
                    for (String sub : (List) arrayList) {
                        File dir = new File(gd, sub);
                        RepositoryUiApiExt repositoryUiApiExt = this.this$0;
                        try {
                            Result.Companion companion = Result.INSTANCE;
                            objM8116constructorimpl = Result.m8116constructorimpl(ModTools.identifyDir$default(repositoryUiApiExt.getTools(), dir, Intrinsics.areEqual(sub, "mods"), false, 4, null));
                        } catch (Throwable th) {
                            Result.Companion companion2 = Result.INSTANCE;
                            objM8116constructorimpl = Result.m8116constructorimpl(ResultKt.createFailure(th));
                        }
                        Map mapEmptyMap = MapsKt.emptyMap();
                        if (Result.m8122isFailureimpl(objM8116constructorimpl)) {
                            objM8116constructorimpl = mapEmptyMap;
                        }
                        Map ids = (Map) objM8116constructorimpl;
                        remote.putAll(ModpackExport.INSTANCE.remoteFrom(sub, ids, dir));
                    }
                    String name = this.$name;
                    RepositoryUiApiExt repositoryUiApiExt2 = this.this$0;
                    String str = this.$instance;
                    if (StringsKt.isBlank(name)) {
                        name = repositoryUiApiExt2.inst(str).getName();
                    }
                    String safeName = new Regex("[\\\\/:*?\"<>|]").replace(name, "_");
                    File out = new File(this.this$0.repo.getPaths().getRoot(), "exports/" + safeName + "-" + this.$packVersion + ".mrpack");
                    ModpackExport modpackExport = ModpackExport.INSTANCE;
                    String str2 = this.$name;
                    if (StringsKt.isBlank(str2)) {
                        str2 = safeName;
                    }
                    String str3 = str2;
                    String str4 = this.$packVersion;
                    if (StringsKt.isBlank(str4)) {
                        str4 = "1.0.0";
                    }
                    final Function2<Float, String, Unit> function2 = this.$onProgress;
                    Pair pairExport$default = ModpackExport.export$default(modpackExport, gd, out, str3, str4, v.getMcVersion(), LoaderDetect.INSTANCE.detect(v), this.$include, remote, null, new Function2() { // from class: com.pymcl.android.data.RepositoryUiApiExt$exportModpack$2$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj2, Object obj3) {
                            return RepositoryUiApiExt.AnonymousClass2.invokeSuspend$lambda$5(function2, ((Float) obj2).floatValue(), (String) obj3);
                        }
                    }, 256, null);
                    int nf = ((Number) pairExport$default.component1()).intValue();
                    int no = ((Number) pairExport$default.component2()).intValue();
                    String str5 = "mrpack exported: " + out + " files=" + nf + " overrides=" + no;
                    Choice.getItem("PyMCL");
                    return out.getAbsolutePath();
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$5(Function2 $onProgress, float p, String d) {
            $onProgress.invoke(Float.valueOf(p), d);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    @Override // com.pymcl.android.ui.state.LauncherUiApiExt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object exportModpack(java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, java.util.List<java.lang.String> r18, kotlin.jvm.functions.Function2<? super java.lang.Float, ? super java.lang.String, kotlin.Unit> r19, kotlin.coroutines.Continuation<? super java.lang.String> r20) {
        /*
            r13 = this;
            r9 = r20
            boolean r0 = r9 instanceof com.pymcl.android.data.RepositoryUiApiExt.AnonymousClass1
            if (r0 == 0) goto L16
            r0 = r9
            com.pymcl.android.data.RepositoryUiApiExt$exportModpack$1 r0 = (com.pymcl.android.data.RepositoryUiApiExt.AnonymousClass1) r0
            int r1 = r0.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r3
            if (r1 == 0) goto L16
            int r1 = r0.label
            int r1 = r1 - r3
            r0.label = r1
            goto L1b
        L16:
            com.pymcl.android.data.RepositoryUiApiExt$exportModpack$1 r0 = new com.pymcl.android.data.RepositoryUiApiExt$exportModpack$1
            r0.<init>(r9)
        L1b:
            r10 = r0
            java.lang.Object r11 = r10.result
            java.lang.Object r12 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r10.label
            switch(r0) {
                case 0: goto L4c;
                case 1: goto L2f;
                default: goto L27;
            }
        L27:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L2f:
            java.lang.Object r0 = r10.L$5
            kotlin.jvm.functions.Function2 r0 = (kotlin.jvm.functions.Function2) r0
            java.lang.Object r1 = r10.L$4
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r3 = r10.L$3
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r4 = r10.L$2
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r5 = r10.L$1
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r6 = r10.L$0
            java.lang.String r6 = (java.lang.String) r6
            kotlin.ResultKt.throwOnFailure(r11)
            r7 = r11
            goto L9b
        L4c:
            kotlin.ResultKt.throwOnFailure(r11)
            com.pymcl.android.data.RepositoryUiApiExt$exportModpack$2 r0 = new com.pymcl.android.data.RepositoryUiApiExt$exportModpack$2
            r8 = 0
            r2 = r13
            r3 = r14
            r1 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            r4 = r19
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            kotlin.jvm.functions.Function1 r0 = (kotlin.jvm.functions.Function1) r0
            java.lang.Object r1 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r14)
            r10.L$0 = r1
            java.lang.Object r1 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r15)
            r10.L$1 = r1
            java.lang.Object r1 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r16)
            r10.L$2 = r1
            java.lang.Object r1 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r17)
            r10.L$3 = r1
            java.lang.Object r1 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r18)
            r10.L$4 = r1
            java.lang.Object r1 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r19)
            r10.L$5 = r1
            r1 = 1
            r10.label = r1
            java.lang.Object r0 = r13.io(r0, r10)
            if (r0 != r12) goto L90
            return r12
        L90:
            r6 = r14
            r5 = r15
            r4 = r16
            r3 = r17
            r1 = r18
            r7 = r0
            r0 = r19
        L9b:
            java.lang.String r8 = "io(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.android.data.RepositoryUiApiExt.exportModpack(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final GlobalMods globalMods() {
        return new GlobalMods(GlobalMods.INSTANCE.dirFor(this.repo.getPaths().getSharedDir(), this.repo.getConfig().string("global_mods_dir"), this.repo.getPaths().getRoot()));
    }

    /* compiled from: RepositoryUiApiExt.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 4, 0}, xi = 48)
    @DebugMetadata(c = "com.pymcl.android.data.RepositoryUiApiExt$contentDirPath$2", f = "RepositoryUiApiExt.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
    /* renamed from: com.pymcl.android.data.RepositoryUiApiExt$contentDirPath$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements Function1<Continuation<? super String>, Object> {
        final /* synthetic */ String $instance;
        final /* synthetic */ String $kind;
        final /* synthetic */ String $version;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(String str, String str2, String str3, Continuation<? super AnonymousClass2> continuation) {
            super(1, continuation);
            this.$instance = str;
            this.$kind = str2;
            this.$version = str3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return RepositoryUiApiExt.this.new AnonymousClass2(this.$instance, this.$kind, this.$version, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super String> continuation) {
            return ((AnonymousClass2) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object objM8116constructorimpl;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    if (!RepositoryUiApiExt.this.instanceExists(this.$instance)) {
                        return null;
                    }
                    RepositoryUiApiExt repositoryUiApiExt = RepositoryUiApiExt.this;
                    String str = this.$kind;
                    String str2 = this.$instance;
                    String str3 = this.$version;
                    try {
                        Result.Companion companion = Result.INSTANCE;
                        File fileTargetDir = repositoryUiApiExt.repo.getCatalog().targetDir(ResKind.INSTANCE.of(str), repositoryUiApiExt.gameDir(str2, str3));
                        fileTargetDir.mkdirs();
                        objM8116constructorimpl = Result.m8116constructorimpl(fileTargetDir.getAbsolutePath());
                    } catch (Throwable th) {
                        Result.Companion companion2 = Result.INSTANCE;
                        objM8116constructorimpl = Result.m8116constructorimpl(ResultKt.createFailure(th));
                    }
                    return (String) (Result.m8122isFailureimpl(objM8116constructorimpl) ? null : objM8116constructorimpl);
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    @Override // com.pymcl.android.ui.state.LauncherUiApiExt8
    public Object contentDirPath(String kind, String instance, String version, Continuation<? super String> continuation) {
        return io(new AnonymousClass2(instance, kind, version, null), continuation);
    }

    /* compiled from: RepositoryUiApiExt.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n"}, d2 = {"<anonymous>", "", "Lcom/pymcl/android/ui/state/InstalledEntry;"}, k = 3, mv = {2, 4, 0}, xi = 48)
    @DebugMetadata(c = "com.pymcl.android.data.RepositoryUiApiExt$listGlobalMods$2", f = "RepositoryUiApiExt.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
    /* renamed from: com.pymcl.android.data.RepositoryUiApiExt$listGlobalMods$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements Function1<Continuation<? super List<? extends InstalledEntry>>, Object> {
        int label;

        AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(1, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return RepositoryUiApiExt.this.new AnonymousClass2(continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Continuation<? super List<? extends InstalledEntry>> continuation) {
            return invoke2((Continuation<? super List<InstalledEntry>>) continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Continuation<? super List<InstalledEntry>> continuation) {
            return ((AnonymousClass2) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:31:0x00b5  */
        /* JADX WARN: Removed duplicated region for block: B:57:0x0125  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r31) {
            /*
                Method dump skipped, instructions count: 390
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.pymcl.android.data.RepositoryUiApiExt.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Override // com.pymcl.android.ui.state.LauncherUiApiExt8
    public Object listGlobalMods(Continuation<? super List<InstalledEntry>> continuation) {
        return io(new AnonymousClass2(null), continuation);
    }

    /* compiled from: RepositoryUiApiExt.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "Ljava/io/File;"}, k = 3, mv = {2, 4, 0}, xi = 48)
    @DebugMetadata(c = "com.pymcl.android.data.RepositoryUiApiExt$setGlobalModEnabled$2", f = "RepositoryUiApiExt.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
    /* renamed from: com.pymcl.android.data.RepositoryUiApiExt$setGlobalModEnabled$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements Function1<Continuation<? super File>, Object> {
        final /* synthetic */ boolean $enabled;
        final /* synthetic */ String $filename;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(String str, boolean z, Continuation<? super AnonymousClass2> continuation) {
            super(1, continuation);
            this.$filename = str;
            this.$enabled = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return RepositoryUiApiExt.this.new AnonymousClass2(this.$filename, this.$enabled, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super File> continuation) {
            return ((AnonymousClass2) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    return RepositoryUiApiExt.this.globalMods().setEnabled(this.$filename, this.$enabled);
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* compiled from: RepositoryUiApiExt.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 4, 0}, xi = 48)
    @DebugMetadata(c = "com.pymcl.android.data.RepositoryUiApiExt$deleteGlobalMod$2", f = "RepositoryUiApiExt.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
    /* renamed from: com.pymcl.android.data.RepositoryUiApiExt$deleteGlobalMod$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
        final /* synthetic */ String $filename;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(String str, Continuation<? super AnonymousClass2> continuation) {
            super(1, continuation);
            this.$filename = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return RepositoryUiApiExt.this.new AnonymousClass2(this.$filename, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) throws IOException {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    RepositoryUiApiExt.this.globalMods().delete(this.$filename);
                    return Unit.INSTANCE;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // com.pymcl.android.ui.state.LauncherUiApiExt8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object setGlobalModEnabled(java.lang.String r6, boolean r7, kotlin.coroutines.Continuation<? super kotlin.Unit> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.pymcl.android.data.RepositoryUiApiExt.AnonymousClass1
            if (r0 == 0) goto L14
            r0 = r8
            com.pymcl.android.data.RepositoryUiApiExt$setGlobalModEnabled$1 r0 = (com.pymcl.android.data.RepositoryUiApiExt.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r1 = r0.label
            int r1 = r1 - r2
            r0.label = r1
            goto L19
        L14:
            com.pymcl.android.data.RepositoryUiApiExt$setGlobalModEnabled$1 r0 = new com.pymcl.android.data.RepositoryUiApiExt$setGlobalModEnabled$1
            r0.<init>(r8)
        L19:
            java.lang.Object r1 = r0.result
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r3 = r0.label
            switch(r3) {
                case 0: goto L37;
                case 1: goto L2c;
                default: goto L24;
            }
        L24:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L2c:
            boolean r7 = r0.Z$0
            java.lang.Object r2 = r0.L$0
            r6 = r2
            java.lang.String r6 = (java.lang.String) r6
            kotlin.ResultKt.throwOnFailure(r1)
            goto L54
        L37:
            kotlin.ResultKt.throwOnFailure(r1)
            com.pymcl.android.data.RepositoryUiApiExt$setGlobalModEnabled$2 r3 = new com.pymcl.android.data.RepositoryUiApiExt$setGlobalModEnabled$2
            r4 = 0
            r3.<init>(r6, r7, r4)
            kotlin.jvm.functions.Function1 r3 = (kotlin.jvm.functions.Function1) r3
            java.lang.Object r4 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r6)
            r0.L$0 = r4
            r0.Z$0 = r7
            r4 = 1
            r0.label = r4
            java.lang.Object r3 = r5.io(r3, r0)
            if (r3 != r2) goto L54
            return r2
        L54:
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.android.data.RepositoryUiApiExt.setGlobalModEnabled(java.lang.String, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* compiled from: RepositoryUiApiExt.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n"}, d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType"}, k = 3, mv = {2, 4, 0}, xi = 48)
    @DebugMetadata(c = "com.pymcl.android.data.RepositoryUiApiExt$importGlobalMod$2", f = "RepositoryUiApiExt.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
    /* renamed from: com.pymcl.android.data.RepositoryUiApiExt$importGlobalMod$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements Function1<Continuation<? super String>, Object> {
        final /* synthetic */ String $path;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(String str, Continuation<? super AnonymousClass2> continuation) {
            super(1, continuation);
            this.$path = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return RepositoryUiApiExt.this.new AnonymousClass2(this.$path, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super String> continuation) {
            return ((AnonymousClass2) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    return RepositoryUiApiExt.this.globalMods().m8038import(new File(this.$path)).getName();
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    @Override // com.pymcl.android.ui.state.LauncherUiApiExt8
    public Object deleteGlobalMod(String filename, Continuation<? super Unit> continuation) {
        Object objIo = io(new AnonymousClass2(filename, null), continuation);
        return objIo == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objIo : Unit.INSTANCE;
    }

    /* compiled from: RepositoryUiApiExt.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n"}, d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType"}, k = 3, mv = {2, 4, 0}, xi = 48)
    @DebugMetadata(c = "com.pymcl.android.data.RepositoryUiApiExt$globalModsDirPath$2", f = "RepositoryUiApiExt.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
    /* renamed from: com.pymcl.android.data.RepositoryUiApiExt$globalModsDirPath$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements Function1<Continuation<? super String>, Object> {
        int label;

        AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(1, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return RepositoryUiApiExt.this.new AnonymousClass2(continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super String> continuation) {
            return ((AnonymousClass2) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    File dir = RepositoryUiApiExt.this.globalMods().getDir();
                    dir.mkdirs();
                    return dir.getAbsolutePath();
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // com.pymcl.android.ui.state.LauncherUiApiExt8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object importGlobalMod(java.lang.String r6, kotlin.coroutines.Continuation<? super java.lang.String> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.pymcl.android.data.RepositoryUiApiExt.AnonymousClass1
            if (r0 == 0) goto L14
            r0 = r7
            com.pymcl.android.data.RepositoryUiApiExt$importGlobalMod$1 r0 = (com.pymcl.android.data.RepositoryUiApiExt.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r1 = r0.label
            int r1 = r1 - r2
            r0.label = r1
            goto L19
        L14:
            com.pymcl.android.data.RepositoryUiApiExt$importGlobalMod$1 r0 = new com.pymcl.android.data.RepositoryUiApiExt$importGlobalMod$1
            r0.<init>(r7)
        L19:
            java.lang.Object r1 = r0.result
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r3 = r0.label
            switch(r3) {
                case 0: goto L36;
                case 1: goto L2c;
                default: goto L24;
            }
        L24:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L2c:
            java.lang.Object r2 = r0.L$0
            r6 = r2
            java.lang.String r6 = (java.lang.String) r6
            kotlin.ResultKt.throwOnFailure(r1)
            r3 = r1
            goto L51
        L36:
            kotlin.ResultKt.throwOnFailure(r1)
            com.pymcl.android.data.RepositoryUiApiExt$importGlobalMod$2 r3 = new com.pymcl.android.data.RepositoryUiApiExt$importGlobalMod$2
            r4 = 0
            r3.<init>(r6, r4)
            kotlin.jvm.functions.Function1 r3 = (kotlin.jvm.functions.Function1) r3
            java.lang.Object r4 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r6)
            r0.L$0 = r4
            r4 = 1
            r0.label = r4
            java.lang.Object r3 = r5.io(r3, r0)
            if (r3 != r2) goto L51
            return r2
        L51:
            java.lang.String r2 = "io(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r2)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.android.data.RepositoryUiApiExt.importGlobalMod(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* compiled from: RepositoryUiApiExt.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n"}, d2 = {"<anonymous>", "", ""}, k = 3, mv = {2, 4, 0}, xi = 48)
    @DebugMetadata(c = "com.pymcl.android.data.RepositoryUiApiExt$globalInjected$2", f = "RepositoryUiApiExt.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
    /* renamed from: com.pymcl.android.data.RepositoryUiApiExt$globalInjected$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements Function1<Continuation<? super Set<? extends String>>, Object> {
        final /* synthetic */ String $instance;
        final /* synthetic */ String $version;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(String str, String str2, Continuation<? super AnonymousClass2> continuation) {
            super(1, continuation);
            this.$instance = str;
            this.$version = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return RepositoryUiApiExt.this.new AnonymousClass2(this.$instance, this.$version, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Continuation<? super Set<? extends String>> continuation) {
            return invoke2((Continuation<? super Set<String>>) continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Continuation<? super Set<String>> continuation) {
            return ((AnonymousClass2) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object objM8116constructorimpl;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    RepositoryUiApiExt repositoryUiApiExt = RepositoryUiApiExt.this;
                    String str = this.$instance;
                    String str2 = this.$version;
                    try {
                        Result.Companion companion = Result.INSTANCE;
                        objM8116constructorimpl = Result.m8116constructorimpl(repositoryUiApiExt.globalMods().injected(repositoryUiApiExt.repo.getCatalog().targetDir(ResKind.MOD, repositoryUiApiExt.gameDir(str, str2))));
                    } catch (Throwable th) {
                        Result.Companion companion2 = Result.INSTANCE;
                        objM8116constructorimpl = Result.m8116constructorimpl(ResultKt.createFailure(th));
                    }
                    return Result.m8122isFailureimpl(objM8116constructorimpl) ? SetsKt.emptySet() : objM8116constructorimpl;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    @Override // com.pymcl.android.ui.state.LauncherUiApiExt8
    public Object globalModsDirPath(Continuation<? super String> continuation) {
        return io(new AnonymousClass2(null), continuation);
    }

    @Override // com.pymcl.android.ui.state.LauncherUiApiExt8
    public Object globalInjected(String instance, String version, Continuation<? super Set<String>> continuation) {
        return io(new AnonymousClass2(instance, version, null), continuation);
    }

    public final List<String> injectGlobalMods(String instance, String version) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        Intrinsics.checkNotNullParameter(version, "version");
        ResolvedVersion v = resolved(instance, version);
        if (v != null && LoaderDetect.INSTANCE.detect(v) != null) {
            return globalMods().apply(this.repo.getCatalog().targetDir(ResKind.MOD, gameDir(instance, version)));
        }
        return CollectionsKt.emptyList();
    }

    /* compiled from: RepositoryUiApiExt.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lcom/pymcl/android/ui/state/ContentExportResult;"}, k = 3, mv = {2, 4, 0}, xi = 48)
    @DebugMetadata(c = "com.pymcl.android.data.RepositoryUiApiExt$exportAllContents$2", f = "RepositoryUiApiExt.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
    /* renamed from: com.pymcl.android.data.RepositoryUiApiExt$exportAllContents$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements Function1<Continuation<? super ContentExportResult>, Object> {
        final /* synthetic */ String $instance;
        final /* synthetic */ String $kind;
        final /* synthetic */ Function2<Float, String, Unit> $onProgress;
        final /* synthetic */ String $version;
        int label;
        final /* synthetic */ RepositoryUiApiExt this$0;

        /* compiled from: RepositoryUiApiExt.kt */
        @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
        /* renamed from: com.pymcl.android.data.RepositoryUiApiExt$exportAllContents$2$WhenMappings */
        public static final /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[ResKind.values().length];
                try {
                    iArr[ResKind.WORLD.ordinal()] = 1;
                } catch (NoSuchFieldError e) {
                }
                try {
                    iArr[ResKind.MOD.ordinal()] = 2;
                } catch (NoSuchFieldError e2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(String str, String str2, RepositoryUiApiExt repositoryUiApiExt, String str3, Function2<? super Float, ? super String, Unit> function2, Continuation<? super AnonymousClass2> continuation) {
            super(1, continuation);
            this.$kind = str;
            this.$version = str2;
            this.this$0 = repositoryUiApiExt;
            this.$instance = str3;
            this.$onProgress = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return new AnonymousClass2(this.$kind, this.$version, this.this$0, this.$instance, this.$onProgress, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super ContentExportResult> continuation) {
            return ((AnonymousClass2) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            boolean zIsDirectory;
            ResKind k;
            File[] fileArr;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    ResKind k2 = ResKind.INSTANCE.of(this.$kind);
                    if (k2 == ResKind.MODPACK) {
                        throw new IllegalStateException("整合包没有可导出的已装文件，请在实例页用「导出为整合包」");
                    }
                    if (StringsKt.isBlank(this.$version) && k2 != ResKind.WORLD) {
                        throw new IllegalStateException("请先在启动页选择一个已安装的版本");
                    }
                    File dir = this.this$0.repo.getCatalog().targetDir(k2, this.this$0.gameDir(this.$instance, this.$version));
                    File[] fileArrListFiles = dir.listFiles();
                    if (fileArrListFiles == null) {
                        fileArrListFiles = new File[0];
                    }
                    Collection arrayList = new ArrayList();
                    File[] fileArr2 = fileArrListFiles;
                    int length = fileArr2.length;
                    int i = 0;
                    while (i < length) {
                        File file = fileArr2[i];
                        switch (WhenMappings.$EnumSwitchMapping$0[k2.ordinal()]) {
                            case 1:
                                zIsDirectory = file.isDirectory();
                                k = k2;
                                fileArr = fileArrListFiles;
                                break;
                            case 2:
                                ModTools.Companion companion = ModTools.INSTANCE;
                                Intrinsics.checkNotNull(file);
                                zIsDirectory = companion.isModFile(file);
                                k = k2;
                                fileArr = fileArrListFiles;
                                break;
                            default:
                                if (file.isFile() || file.isDirectory()) {
                                    String name = file.getName();
                                    Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                                    k = k2;
                                    fileArr = fileArrListFiles;
                                    if (!StringsKt.startsWith$default(name, ".", false, 2, (Object) null)) {
                                        zIsDirectory = true;
                                        break;
                                    }
                                } else {
                                    k = k2;
                                    fileArr = fileArrListFiles;
                                }
                                zIsDirectory = false;
                                break;
                        }
                        if (zIsDirectory) {
                            arrayList.add(file);
                        }
                        i++;
                        k2 = k;
                        fileArrListFiles = fileArr;
                    }
                    ResKind k3 = k2;
                    Iterable iterableSortedWith = CollectionsKt.sortedWith((List) arrayList, new Comparator() { // from class: com.pymcl.android.data.RepositoryUiApiExt$exportAllContents$2$invokeSuspend$$inlined$sortedBy$1
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // java.util.Comparator
                        public final int compare(T t, T t2) {
                            String name2 = ((File) t).getName();
                            Intrinsics.checkNotNullExpressionValue(name2, "getName(...)");
                            String lowerCase = name2.toLowerCase(Locale.ROOT);
                            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                            String name3 = ((File) t2).getName();
                            Intrinsics.checkNotNullExpressionValue(name3, "getName(...)");
                            String lowerCase2 = name3.toLowerCase(Locale.ROOT);
                            Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
                            return ComparisonsKt.compareValues(lowerCase, lowerCase2);
                        }
                    });
                    Collection arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterableSortedWith, 10));
                    Iterator it = iterableSortedWith.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(((File) it.next()).getName());
                    }
                    List names = (List) arrayList2;
                    if (names.isEmpty()) {
                        throw new IllegalStateException("这个实例里还没有可导出的内容");
                    }
                    File exportsDir = this.this$0.repo.getPaths().getExportsDir();
                    ContentExport contentExport = ContentExport.INSTANCE;
                    String lowerCase = k3.name().toLowerCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                    File out = new File(exportsDir, contentExport.defaultName(lowerCase, this.this$0.inst(this.$instance).getName(), this.$version, System.currentTimeMillis()));
                    ContentExport contentExport2 = ContentExport.INSTANCE;
                    final Function2<Float, String, Unit> function2 = this.$onProgress;
                    ContentExport.Result r = contentExport2.exportZip(dir, names, out, new Function2() { // from class: com.pymcl.android.data.RepositoryUiApiExt$exportAllContents$2$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return RepositoryUiApiExt.AnonymousClass2.invokeSuspend$lambda$3(function2, ((Float) obj).floatValue(), (String) obj2);
                        }
                    });
                    String absolutePath = r.getOut().getAbsolutePath();
                    Intrinsics.checkNotNullExpressionValue(absolutePath, "getAbsolutePath(...)");
                    return new ContentExportResult(absolutePath, r.getOk().size(), r.getFailed().size(), ContentExport.INSTANCE.summary(r));
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$3(Function2 $onProgress, float p, String n) {
            $onProgress.invoke(Float.valueOf(p), n);
            return Unit.INSTANCE;
        }
    }

    @Override // com.pymcl.android.ui.state.LauncherUiApiExt8
    public Object exportAllContents(String kind, String instance, String version, Function2<? super Float, ? super String, Unit> function2, Continuation<? super ContentExportResult> continuation) {
        return io(new AnonymousClass2(kind, version, this, instance, function2, null), continuation);
    }

    /* compiled from: RepositoryUiApiExt.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n"}, d2 = {"<anonymous>", "", "Lcom/pymcl/android/ui/state/ConflictRow;"}, k = 3, mv = {2, 4, 0}, xi = 48)
    @DebugMetadata(c = "com.pymcl.android.data.RepositoryUiApiExt$modConflicts$2", f = "RepositoryUiApiExt.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
    /* renamed from: com.pymcl.android.data.RepositoryUiApiExt$modConflicts$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements Function1<Continuation<? super List<? extends ConflictRow>>, Object> {
        final /* synthetic */ String $instance;
        final /* synthetic */ String $version;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(String str, String str2, Continuation<? super AnonymousClass2> continuation) {
            super(1, continuation);
            this.$instance = str;
            this.$version = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return RepositoryUiApiExt.this.new AnonymousClass2(this.$instance, this.$version, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Continuation<? super List<? extends ConflictRow>> continuation) {
            return invoke2((Continuation<? super List<ConflictRow>>) continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Continuation<? super List<ConflictRow>> continuation) {
            return ((AnonymousClass2) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            String mcVersion;
            String second;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    File dir = RepositoryUiApiExt.this.repo.getCatalog().targetDir(ResKind.MOD, RepositoryUiApiExt.this.gameDir(this.$instance, this.$version));
                    ResolvedVersion v = RepositoryUiApiExt.this.resolved(this.$instance, this.$version);
                    Pair lt = v != null ? LoaderDetect.INSTANCE.detect(v) : null;
                    ModConflicts modConflicts = ModConflicts.INSTANCE;
                    String str = "";
                    if (v == null || (mcVersion = v.getMcVersion()) == null) {
                        mcVersion = "";
                    }
                    String strCatalogName = LoaderDetect.INSTANCE.catalogName(lt != null ? lt.getFirst() : null);
                    if (lt != null && (second = lt.getSecond()) != null) {
                        str = second;
                    }
                    Iterable<ConflictIssue> issues = modConflicts.scanDir(dir, mcVersion, strCatalogName, str).getIssues();
                    Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(issues, 10));
                    for (ConflictIssue conflictIssue : issues) {
                        arrayList.add(new ConflictRow(conflictIssue.getType(), conflictIssue.getFile(), conflictIssue.getDetail()));
                    }
                    return (List) arrayList;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    @Override // com.pymcl.android.ui.state.LauncherUiApiExt8
    public Object modConflicts(String instance, String version, Continuation<? super List<ConflictRow>> continuation) {
        return io(new AnonymousClass2(instance, version, null), continuation);
    }
}
