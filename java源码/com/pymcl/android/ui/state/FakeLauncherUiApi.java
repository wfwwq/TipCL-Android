package com.pymcl.android.ui.state;

import androidx.autofill.HintConstants;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import com.pymcl.android.data.RepositoryUiApi;
import com.pymcl.multiplayer.TerracottaVpnService;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.UnaryOperator;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import org.lwjgl.util.freetype.FreeType;
import org.lwjgl.util.shaderc.SPV;

/* compiled from: LauncherUiApi.kt */
@Metadata(d1 = {"\u0000Ö\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\nH\u0096@¢\u0006\u0002\u0010\u000bJ\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0096@¢\u0006\u0002\u0010\u0010J\u0016\u0010\u0011\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0096@¢\u0006\u0002\u0010\u0010J\u001c\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\n2\u0006\u0010\u0014\u001a\u00020\u000fH\u0096@¢\u0006\u0002\u0010\u0010J\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\nH\u0096@¢\u0006\u0002\u0010\u000bJ$\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000f0\n2\u0006\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u000fH\u0096@¢\u0006\u0002\u0010\u001aJN\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u000f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u000f2\b\u0010\u001d\u001a\u0004\u0018\u00010\u000f2\u001a\u0010\u001e\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010 \u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\r0\u001fH\u0096@¢\u0006\u0002\u0010!J\u0014\u0010\"\u001a\b\u0012\u0004\u0012\u00020\b0\nH\u0096@¢\u0006\u0002\u0010\u000bJ \u0010#\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010$\u001a\u0004\u0018\u00010\u000fH\u0096@¢\u0006\u0002\u0010\u001aJ\u0016\u0010%\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0096@¢\u0006\u0002\u0010\u0010J\u0016\u0010&\u001a\u00020\r2\u0006\u0010'\u001a\u00020\u000fH\u0096@¢\u0006\u0002\u0010\u0010J\u001a\u0010(\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0*0)H\u0016J&\u0010+\u001a\u00020\u000f2\u0006\u0010,\u001a\u00020\u000f2\u0006\u0010'\u001a\u00020\u000f2\u0006\u0010-\u001a\u00020\u000fH\u0096@¢\u0006\u0002\u0010.J&\u0010/\u001a\u00020\u000f2\u0006\u00100\u001a\u00020\u000f2\u0006\u0010'\u001a\u00020\u000f2\u0006\u0010-\u001a\u00020\u000fH\u0096@¢\u0006\u0002\u0010.J(\u00101\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u00102\u001a\u0004\u0018\u00010\u000f2\u0006\u00103\u001a\u00020\u000fH\u0096@¢\u0006\u0002\u0010.J\u001c\u00104\u001a\b\u0012\u0004\u0012\u0002050\n2\u0006\u00106\u001a\u000207H\u0096@¢\u0006\u0002\u00108J\u001e\u00109\u001a\u00020\u000f2\u0006\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020\u000fH\u0096@¢\u0006\u0002\u0010=J<\u0010>\u001a\b\u0012\u0004\u0012\u00020?0\n2\u0006\u0010@\u001a\u00020\u000f2\u0006\u0010A\u001a\u00020\u000f2\u0006\u0010B\u001a\u00020\u000f2\u0006\u0010C\u001a\u00020\u000f2\u0006\u0010D\u001a\u00020\u000fH\u0096@¢\u0006\u0002\u0010EJ$\u0010F\u001a\b\u0012\u0004\u0012\u00020G0\n2\u0006\u0010@\u001a\u00020\u000f2\u0006\u0010H\u001a\u00020\u000fH\u0096@¢\u0006\u0002\u0010\u001aJR\u0010I\u001a\u00020\u000f2\u0006\u0010@\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u000f2\u0006\u0010H\u001a\u00020\u000f2\u0006\u0010J\u001a\u00020\u000f2\u001a\u0010\u001e\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010 \u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\r0\u001fH\u0096@¢\u0006\u0002\u0010KJ$\u0010L\u001a\b\u0012\u0004\u0012\u00020M0\n2\u0006\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u000fH\u0096@¢\u0006\u0002\u0010\u001aJ\u001e\u0010N\u001a\u0002072\u0006\u0010@\u001a\u00020\u000f2\u0006\u0010H\u001a\u00020\u000fH\u0096@¢\u0006\u0002\u0010\u001aJR\u0010O\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u000f2\u0012\u0010P\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\r0Q2\u0014\u0010\u001e\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010 \u0012\u0004\u0012\u00020\r0Q2\b\u0010R\u001a\u0004\u0018\u00010\u000fH\u0096@¢\u0006\u0002\u0010SJ\u0014\u0010T\u001a\b\u0012\u0004\u0012\u00020U0\nH\u0096@¢\u0006\u0002\u0010\u000bJ\u001c\u0010V\u001a\b\u0012\u0004\u0012\u00020W0\n2\u0006\u0010\u0014\u001a\u00020\u000fH\u0096@¢\u0006\u0002\u0010\u0010J\u0014\u0010X\u001a\b\u0012\u0004\u0012\u00020Y0\nH\u0096@¢\u0006\u0002\u0010\u000bJ\u000e\u0010Z\u001a\u00020[H\u0096@¢\u0006\u0002\u0010\u000bJ\u0014\u0010\\\u001a\b\u0012\u0004\u0012\u00020]0\nH\u0096@¢\u0006\u0002\u0010\u000bJ\u0016\u0010^\u001a\b\u0012\u0004\u0012\u00020_0)2\u0006\u0010`\u001a\u00020\u000fH\u0016J\u0014\u0010a\u001a\b\u0012\u0004\u0012\u00020\u000f0\nH\u0096@¢\u0006\u0002\u0010\u000bJ\u0014\u0010b\u001a\b\u0012\u0004\u0012\u00020c0\nH\u0096@¢\u0006\u0002\u0010\u000bJ\u000e\u0010f\u001a\u00020eH\u0096@¢\u0006\u0002\u0010\u000bJ\u0016\u0010g\u001a\u00020\r2\u0006\u0010h\u001a\u00020eH\u0096@¢\u0006\u0002\u0010iJ\u0014\u0010j\u001a\b\u0012\u0004\u0012\u00020k0\nH\u0096@¢\u0006\u0002\u0010\u000bJ\u0014\u0010l\u001a\b\u0012\u0004\u0012\u00020m0\nH\u0096@¢\u0006\u0002\u0010\u000bR\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010d\u001a\u00020eX\u0082\u000e¢\u0006\u0002\n\u0000Ê\u0001\f\bo\u0012\b\bp\u0012\u0004\b\u0003\u0010\u0000¨\u0006n"}, d2 = {"Lcom/pymcl/android/ui/state/FakeLauncherUiApi;", "Lcom/pymcl/android/ui/state/LauncherUiApi;", "<init>", "()V", "instances", "", "Lcom/pymcl/android/ui/state/InstanceRow;", "accounts", "Lcom/pymcl/android/ui/state/AccountRow;", "listInstances", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createInstance", "", HintConstants.AUTOFILL_HINT_NAME, "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteInstance", "getInstalledVersions", "Lcom/pymcl/android/ui/state/InstalledVersion;", "instance", "getVersionList", "Lcom/pymcl/android/ui/state/RemoteVersion;", "listLoaderVersions", "loader", "mc", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "installGame", "version", "loaderVersion", "onProgress", "Lkotlin/Function2;", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAccountRows", "setActiveAccount", ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "removeAccount", "addOfflineAccount", HintConstants.AUTOFILL_HINT_USERNAME, "startMicrosoftLogin", "Lkotlinx/coroutines/flow/Flow;", "Lkotlin/Pair;", "startAuthlibLogin", "api", HintConstants.AUTOFILL_HINT_PASSWORD, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "startNide8Login", "serverId", "setAccountSkin", "path", "model", "getJavaList", "Lcom/pymcl/android/ui/state/JavaRow;", "scan", "", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "downloadJava", "major", "", "distro", "(ILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "searchCatalog", "Lcom/pymcl/android/ui/state/CatalogHit;", "kind", "query", "source", "gameVersion", "category", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getProjectFiles", "Lcom/pymcl/android/ui/state/CatalogFile;", "id", "installMod", "file", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getInstalledMods", "Lcom/pymcl/android/ui/state/InstalledEntry;", "toggleFavorite", "launchGame", "onLog", "Lkotlin/Function1;", "server", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchNews", "Lcom/pymcl/android/ui/state/NewsItem;", "getServers", "Lcom/pymcl/android/ui/state/ServerRow;", "getPlaytime", "Lcom/pymcl/android/ui/state/PlaytimeRow;", "terracottaState", "Lcom/pymcl/android/ui/state/MpState;", "aiListChats", "Lcom/pymcl/android/ui/state/ChatSummary;", "aiSend", "Lcom/pymcl/android/ui/state/AiItem;", TerracottaVpnService.EXTRA_TEXT, "aiListModels", "aiPermissionRules", "Lcom/pymcl/android/ui/state/PermissionRule;", "settings", "Lcom/pymcl/android/ui/state/UiSettings;", "getSettings", "saveSettings", "s", "(Lcom/pymcl/android/ui/state/UiSettings;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feedbackHistory", "Lcom/pymcl/android/ui/state/FeedbackRecord;", "helpArticles", "Lcom/pymcl/android/ui/state/HelpArticle;", "PyMCL-Android:app_debug", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes20.dex */
public final class FakeLauncherUiApi implements LauncherUiApi {
    public static final int $stable = 8;
    private final List<InstanceRow> instances = CollectionsKt.mutableListOf(new InstanceRow("默认", 3, true, null, 8, null), new InstanceRow("生存服 1.20.1", 1, false, null, 8, null), new InstanceRow("机械动力整合", 2, false, null, 8, null));
    private final List<AccountRow> accounts = CollectionsKt.mutableListOf(new AccountRow("Steve", "microsoft", true, "8667ba71b85a4004af54457a9734eed7", null, 16, null), new AccountRow("Alex_Offline", "offline", false, null, null, 24, null), new AccountRow("LittleSkinUser", "authlib", false, null, null, 24, null));
    private UiSettings settings = new UiSettings(false, 0, null, 0, 0, false, 0, false, false, 0, false, 0, null, null, false, 0, 0, 0, 0, 0, 0, 0, 0, false, 0, null, null, 0, 0, 0, null, 0, 0, 0, null, false, false, false, 0, null, null, null, null, 0, null, 0, 0, 0, null, false, null, null, 0, false, -1, SPV.kDefaultMaxIdBound, null);

    /* compiled from: LauncherUiApi.kt */
    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    @DebugMetadata(c = "com.pymcl.android.ui.state.FakeLauncherUiApi", f = "LauncherUiApi.kt", i = {0, 0, 0, 0, 0, 0}, l = {161}, m = "launchGame", n = {"instance", "version", "onLog", "onProgress", "server", "i"}, nl = {162}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "I$0"}, v = 2)
    /* renamed from: com.pymcl.android.ui.state.FakeLauncherUiApi$launchGame$1, reason: invalid class name */
    static final class AnonymousClass1 extends ContinuationImpl {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FakeLauncherUiApi.this.launchGame(null, null, null, null, null, this);
        }
    }

    @Override // com.pymcl.android.ui.state.LauncherUiApi
    public /* bridge */ Object activeAccountName(Continuation<? super String> continuation) {
        return super.activeAccountName(continuation);
    }

    @Override // com.pymcl.android.ui.state.LauncherUiApi
    public /* bridge */ Object checkModUpdates(String instance, String version, Continuation<? super Map<String, String>> continuation) {
        return super.checkModUpdates(instance, version, continuation);
    }

    @Override // com.pymcl.android.ui.state.LauncherUiApi
    public /* bridge */ Object collectGameExit(boolean userStopped, Continuation<? super GameExitInfo> continuation) {
        return super.collectGameExit(userStopped, continuation);
    }

    @Override // com.pymcl.android.ui.state.LauncherUiApi
    public /* bridge */ Object deleteInstalled(String kind, String instance, String version, String filename, Continuation<? super Unit> continuation) {
        return super.deleteInstalled(kind, instance, version, filename, continuation);
    }

    @Override // com.pymcl.android.ui.state.LauncherUiApi
    public /* bridge */ Object favorites(Continuation<? super Set<String>> continuation) {
        return super.favorites(continuation);
    }

    @Override // com.pymcl.android.ui.state.LauncherUiApi
    public /* bridge */ Object getInstalled(String kind, String instance, String version, Continuation<? super List<InstalledEntry>> continuation) {
        return super.getInstalled(kind, instance, version, continuation);
    }

    @Override // com.pymcl.android.ui.state.LauncherUiApi
    public /* bridge */ Object importLocalFile(String kind, String instance, String version, String path, Function2<? super Float, ? super String, Unit> function2, Continuation<? super String> continuation) {
        return super.importLocalFile(kind, instance, version, path, function2, continuation);
    }

    @Override // com.pymcl.android.ui.state.LauncherUiApi
    public /* bridge */ boolean isGameRunning() {
        return super.isGameRunning();
    }

    @Override // com.pymcl.android.ui.state.LauncherUiApi
    public /* bridge */ Flow<List<LanWorldRow>> lanWorlds() {
        return super.lanWorlds();
    }

    @Override // com.pymcl.android.ui.state.LauncherUiApi
    public /* bridge */ String normalizeDirect(String address) {
        return super.normalizeDirect(address);
    }

    @Override // com.pymcl.android.ui.state.LauncherUiApi
    public /* bridge */ Object resolveCatalogLink(String kind, String url, Continuation<? super CatalogHit> continuation) {
        return super.resolveCatalogLink(kind, url, continuation);
    }

    @Override // com.pymcl.android.ui.state.LauncherUiApi
    public /* bridge */ Object setInstalledEnabled(String kind, String instance, String version, String filename, boolean enabled, Continuation<? super Unit> continuation) {
        return super.setInstalledEnabled(kind, instance, version, filename, enabled, continuation);
    }

    @Override // com.pymcl.android.ui.state.LauncherUiApi
    public /* bridge */ void stopGame() {
        super.stopGame();
    }

    @Override // com.pymcl.android.ui.state.LauncherUiApi
    public /* bridge */ Object terracottaHost(Continuation<? super Unit> continuation) {
        return super.terracottaHost(continuation);
    }

    @Override // com.pymcl.android.ui.state.LauncherUiApi
    public /* bridge */ Object terracottaJoin(String code, Continuation<? super String> continuation) {
        return super.terracottaJoin(code, continuation);
    }

    @Override // com.pymcl.android.ui.state.LauncherUiApi
    public /* bridge */ Object terracottaStart(Continuation<? super MpState> continuation) {
        return super.terracottaStart(continuation);
    }

    @Override // com.pymcl.android.ui.state.LauncherUiApi
    public /* bridge */ Flow<MpState> terracottaStates() {
        return super.terracottaStates();
    }

    @Override // com.pymcl.android.ui.state.LauncherUiApi
    public /* bridge */ Object terracottaStop(Continuation<? super Unit> continuation) {
        return super.terracottaStop(continuation);
    }

    @Override // com.pymcl.android.ui.state.LauncherUiApi
    public Object listInstances(Continuation<? super List<InstanceRow>> continuation) {
        return CollectionsKt.toList(this.instances);
    }

    @Override // com.pymcl.android.ui.state.LauncherUiApi
    public Object createInstance(String name, Continuation<? super Unit> continuation) {
        this.instances.add(new InstanceRow(name, 0, false, null, 8, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean deleteInstance$lambda$0(String $name, InstanceRow it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Intrinsics.areEqual(it.getName(), $name);
    }

    @Override // com.pymcl.android.ui.state.LauncherUiApi
    public Object deleteInstance(final String name, Continuation<? super Unit> continuation) {
        CollectionsKt.removeAll((List) this.instances, new Function1() { // from class: com.pymcl.android.ui.state.FakeLauncherUiApi$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(FakeLauncherUiApi.deleteInstance$lambda$0(name, (InstanceRow) obj));
            }
        });
        return Unit.INSTANCE;
    }

    @Override // com.pymcl.android.ui.state.LauncherUiApi
    public Object getInstalledVersions(String instance, Continuation<? super List<InstalledVersion>> continuation) {
        return CollectionsKt.listOf((Object[]) new InstalledVersion[]{new InstalledVersion("1.21.1-Fabric 0.16.5", "1.21.1", "Fabric", true, false, false, 48, null), new InstalledVersion("1.20.1-Forge 47.3.0", "1.20.1", "Forge", true, false, false, 48, null), new InstalledVersion("1.21.4", "1.21.4", null, false, false, false, 48, null)});
    }

    @Override // com.pymcl.android.ui.state.LauncherUiApi
    public Object getVersionList(Continuation<? super List<RemoteVersion>> continuation) {
        return CollectionsKt.listOf((Object[]) new RemoteVersion[]{new RemoteVersion("1.21.10", "release", "2026-09-30", true), new RemoteVersion("25w41a", "snapshot", "2026-10-08", true), new RemoteVersion("1.21.9", "release", "2026-09-16", false, 8, null), new RemoteVersion("1.21.8", "release", "2026-07-17", false, 8, null), new RemoteVersion("1.21.4", "release", "2024-12-03", false, 8, null), new RemoteVersion("1.21.1", "release", "2024-08-08", false, 8, null), new RemoteVersion("1.20.1", "release", "2023-06-12", false, 8, null), new RemoteVersion("1.16.5", "release", "2021-01-15", false, 8, null), new RemoteVersion("1.12.2", "release", "2017-09-18", false, 8, null), new RemoteVersion("b1.7.3", "old_beta", "2011-07-08", false, 8, null), new RemoteVersion("a1.2.6", "old_alpha", "2010-12-03", false, 8, null)});
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.pymcl.android.ui.state.LauncherUiApi
    public Object listLoaderVersions(String loader, String mc, Continuation<? super List<String>> continuation) {
        String str;
        switch (loader.hashCode()) {
            case -15598832:
                if (loader.equals("OptiFine")) {
                    str = "HD_U_J1";
                    break;
                }
                return CollectionsKt.emptyList();
            case 68066119:
                if (loader.equals("Forge")) {
                    return CollectionsKt.listOf((Object[]) new String[]{"52.0.20", "52.0.16"});
                }
                return CollectionsKt.emptyList();
            case 78395117:
                if (loader.equals("Quilt")) {
                    str = "0.28.1";
                    break;
                }
                return CollectionsKt.emptyList();
            case 1189713103:
                if (loader.equals("NeoForge")) {
                    return CollectionsKt.listOf((Object[]) new String[]{"21.1.77", "21.1.65"});
                }
                return CollectionsKt.emptyList();
            case 2096654533:
                if (loader.equals("Fabric")) {
                    return CollectionsKt.listOf((Object[]) new String[]{"0.16.14", "0.16.13", "0.16.10"});
                }
                return CollectionsKt.emptyList();
            default:
                return CollectionsKt.emptyList();
        }
        return CollectionsKt.listOf(str);
    }

    @Override // com.pymcl.android.ui.state.LauncherUiApi
    public Object installGame(String instance, String version, String loader, String loaderVersion, Function2<? super Float, ? super String, Unit> function2, Continuation<? super String> continuation) {
        return version;
    }

    @Override // com.pymcl.android.ui.state.LauncherUiApi
    public Object getAccountRows(Continuation<? super List<AccountRow>> continuation) {
        return CollectionsKt.toList(this.accounts);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AccountRow setActiveAccount$lambda$0(String $name, String $type, AccountRow it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return AccountRow.copy$default(it, null, null, Intrinsics.areEqual(it.getName(), $name) && ($type == null || Intrinsics.areEqual(it.getType(), $type)), null, null, 27, null);
    }

    @Override // com.pymcl.android.ui.state.LauncherUiApi
    public Object setActiveAccount(final String name, final String type, Continuation<? super Unit> continuation) {
        this.accounts.replaceAll(new UnaryOperator() { // from class: com.pymcl.android.ui.state.FakeLauncherUiApi$$ExternalSyntheticLambda1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return FakeLauncherUiApi.setActiveAccount$lambda$0(name, type, (AccountRow) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean removeAccount$lambda$0(String $name, AccountRow it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Intrinsics.areEqual(it.getName(), $name);
    }

    @Override // com.pymcl.android.ui.state.LauncherUiApi
    public Object removeAccount(final String name, Continuation<? super Unit> continuation) {
        CollectionsKt.removeAll((List) this.accounts, new Function1() { // from class: com.pymcl.android.ui.state.FakeLauncherUiApi$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(FakeLauncherUiApi.removeAccount$lambda$0(name, (AccountRow) obj));
            }
        });
        return Unit.INSTANCE;
    }

    /* compiled from: LauncherUiApi.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u0001*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lkotlin/Pair;", ""}, k = 3, mv = {2, 4, 0}, xi = 48)
    @DebugMetadata(c = "com.pymcl.android.ui.state.FakeLauncherUiApi$startMicrosoftLogin$1", f = "LauncherUiApi.kt", i = {0, 1}, l = {128, 128}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, nl = {128, 129}, s = {"L$0", "L$0"}, v = 2)
    /* renamed from: com.pymcl.android.ui.state.FakeLauncherUiApi$startMicrosoftLogin$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<FlowCollector<? super Pair<? extends String, ? extends String>>, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(FlowCollector<? super Pair<? extends String, ? extends String>> flowCollector, Continuation<? super Unit> continuation) {
            return invoke2((FlowCollector<? super Pair<String, String>>) flowCollector, continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(FlowCollector<? super Pair<String, String>> flowCollector, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x004b A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = r5.L$0
                kotlinx.coroutines.flow.FlowCollector r0 = (kotlinx.coroutines.flow.FlowCollector) r0
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r5.label
                switch(r2) {
                    case 0: goto L1d;
                    case 1: goto L19;
                    case 2: goto L15;
                    default: goto Ld;
                }
            Ld:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L15:
                kotlin.ResultKt.throwOnFailure(r6)
                goto L4c
            L19:
                kotlin.ResultKt.throwOnFailure(r6)
                goto L31
            L1d:
                kotlin.ResultKt.throwOnFailure(r6)
                r2 = r5
                kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
                r5.L$0 = r0
                r3 = 1
                r5.label = r3
                r3 = 600(0x258, double:2.964E-321)
                java.lang.Object r2 = kotlinx.coroutines.DelayKt.delay(r3, r2)
                if (r2 != r1) goto L31
                return r1
            L31:
                java.lang.String r2 = "login_code"
                java.lang.String r3 = "F7K2-QX9D|https://www.microsoft.com/link"
                kotlin.Pair r2 = kotlin.TuplesKt.to(r2, r3)
                r3 = r5
                kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3
                java.lang.Object r4 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r0)
                r5.L$0 = r4
                r4 = 2
                r5.label = r4
                java.lang.Object r2 = r0.emit(r2, r3)
                if (r2 != r1) goto L4c
                return r1
            L4c:
                kotlin.Unit r1 = kotlin.Unit.INSTANCE
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.pymcl.android.ui.state.FakeLauncherUiApi.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Override // com.pymcl.android.ui.state.LauncherUiApi
    public Object addOfflineAccount(String username, Continuation<? super Unit> continuation) {
        this.accounts.add(new AccountRow(username, "offline", false, null, null, 24, null));
        return Unit.INSTANCE;
    }

    @Override // com.pymcl.android.ui.state.LauncherUiApi
    public Flow<Pair<String, String>> startMicrosoftLogin() {
        return FlowKt.flow(new AnonymousClass1(null));
    }

    @Override // com.pymcl.android.ui.state.LauncherUiApi
    public Object startAuthlibLogin(String api, String username, String password, Continuation<? super String> continuation) {
        return "t-authlib";
    }

    @Override // com.pymcl.android.ui.state.LauncherUiApi
    public Object startNide8Login(String serverId, String username, String password, Continuation<? super String> continuation) {
        return "t-nide8";
    }

    @Override // com.pymcl.android.ui.state.LauncherUiApi
    public Object setAccountSkin(String name, String path, String model, Continuation<? super Unit> continuation) {
        return Unit.INSTANCE;
    }

    @Override // com.pymcl.android.ui.state.LauncherUiApi
    public Object getJavaList(boolean scan, Continuation<? super List<JavaRow>> continuation) {
        return CollectionsKt.listOf((Object[]) new JavaRow[]{new JavaRow(21, "21.0.5", "PyMCL 内置", "/data/user/0/com.pymcl.android/app_runtime/java/jre21", true), new JavaRow(17, "17.0.13", "PyMCL 内置", "/data/user/0/com.pymcl.android/app_runtime/java/jre17", false), new JavaRow(8, "1.8.0_432", "Azul Zulu", "/data/user/0/com.pymcl.android/app_runtime/java/jre8", false)});
    }

    @Override // com.pymcl.android.ui.state.LauncherUiApi
    public Object downloadJava(int major, String distro, Continuation<? super String> continuation) {
        return "t-java" + major;
    }

    @Override // com.pymcl.android.ui.state.LauncherUiApi
    public Object searchCatalog(String kind, String query, String source, String gameVersion, String category, Continuation<? super List<CatalogHit>> continuation) {
        Iterable iterableListOf = CollectionsKt.listOf((Object[]) new CatalogHit[]{new CatalogHit("AANobbMI", "Sodium", "jellysquid3", 98000000L, "现代渲染引擎，大幅提升帧率", "Modrinth", CollectionsKt.listOf("优化"), true, false, null, null, 1792, null), new CatalogHit("P7dR8mSH", "Fabric API", "modmuss50", 120000000L, "Fabric 模组的核心依赖库", "Modrinth", CollectionsKt.listOf("库"), false, true, null, null, 1664, null), new CatalogHit("gvQqBUqZ", "Lithium", "jellysquid3", 45000000L, "通用服务端/客户端性能优化", "Modrinth", CollectionsKt.listOf("优化"), false, false, null, null, 1920, null), new CatalogHit("238222", "Just Enough Items (JEI)", "mezz", 300000000L, "物品与合成表查看", "CurseForge", CollectionsKt.listOf("实用"), false, false, null, null, 1920, null), new CatalogHit("YL57xq9U", "Iris Shaders", "coderbot", 60000000L, "兼容 OptiFine 光影包的现代光影加载器", "Modrinth", CollectionsKt.listOf("光影"), false, false, null, null, 1920, null), new CatalogHit("mOgUt4GM", "Mod Menu", "Prospector", 70000000L, "在游戏内查看已安装的模组列表", "Modrinth", CollectionsKt.listOf("实用"), false, false, null, null, 1920, null)});
        Collection arrayList = new ArrayList();
        for (Object obj : iterableListOf) {
            if (((StringsKt.isBlank(query) || StringsKt.contains((CharSequence) ((CatalogHit) obj).getTitle(), (CharSequence) query, true)) ? 1 : null) != null) {
                arrayList.add(obj);
            }
        }
        return (List) arrayList;
    }

    @Override // com.pymcl.android.ui.state.LauncherUiApi
    public Object getProjectFiles(String kind, String id, Continuation<? super List<CatalogFile>> continuation) {
        return CollectionsKt.listOf((Object[]) new CatalogFile[]{new CatalogFile("sodium-fabric-0.6.13+mc1.21.1.jar", CollectionsKt.listOf("1.21.1"), CollectionsKt.listOf("fabric"), "2026-09-02", 1022, null, null, 96, null), new CatalogFile("sodium-neoforge-0.6.13+mc1.21.1.jar", CollectionsKt.listOf("1.21.1"), CollectionsKt.listOf("neoforge"), "2026-09-02", FreeType.TT_MS_LANGID_KYRGYZ_KYRGYZSTAN, null, null, 96, null), new CatalogFile("sodium-fabric-0.5.13+mc1.20.1.jar", CollectionsKt.listOf("1.20.1"), CollectionsKt.listOf("fabric"), "2025-03-10", 980, null, null, 96, null)});
    }

    @Override // com.pymcl.android.ui.state.LauncherUiApi
    public Object installMod(String kind, String instance, String version, String id, String file, Function2<? super Float, ? super String, Unit> function2, Continuation<? super String> continuation) {
        return "t-mod";
    }

    @Override // com.pymcl.android.ui.state.LauncherUiApi
    public Object getInstalledMods(String instance, String version, Continuation<? super List<InstalledEntry>> continuation) {
        return CollectionsKt.listOf((Object[]) new InstalledEntry[]{new InstalledEntry("fabric-api-0.116.6+1.21.1.jar", "Fabric API", true, "0.116.6", false, null, null, null, 240, null), new InstalledEntry("sodium-fabric-0.6.13+mc1.21.1.jar", "Sodium", true, "0.6.13", false, null, null, null, 240, null), new InstalledEntry("iris-1.8.8+mc1.21.1.jar", "Iris Shaders", false, "1.8.8", false, null, null, null, 240, null), new InstalledEntry("modmenu-11.0.3.jar", "Mod Menu", true, "11.0.3", true, null, null, null, 224, null)});
    }

    @Override // com.pymcl.android.ui.state.LauncherUiApi
    public Object toggleFavorite(String kind, String id, Continuation<? super Boolean> continuation) {
        return Boxing.boxBoolean(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x009d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0098 -> B:19:0x009b). Please report as a decompilation issue!!! */
    @Override // com.pymcl.android.ui.state.LauncherUiApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object launchGame(java.lang.String r9, java.lang.String r10, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> r11, kotlin.jvm.functions.Function1<? super java.lang.Float, kotlin.Unit> r12, java.lang.String r13, kotlin.coroutines.Continuation<? super java.lang.String> r14) {
        /*
            r8 = this;
            boolean r0 = r14 instanceof com.pymcl.android.ui.state.FakeLauncherUiApi.AnonymousClass1
            if (r0 == 0) goto L14
            r0 = r14
            com.pymcl.android.ui.state.FakeLauncherUiApi$launchGame$1 r0 = (com.pymcl.android.ui.state.FakeLauncherUiApi.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r1 = r0.label
            int r1 = r1 - r2
            r0.label = r1
            goto L19
        L14:
            com.pymcl.android.ui.state.FakeLauncherUiApi$launchGame$1 r0 = new com.pymcl.android.ui.state.FakeLauncherUiApi$launchGame$1
            r0.<init>(r14)
        L19:
            java.lang.Object r1 = r0.result
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r3 = r0.label
            r4 = 1
            switch(r3) {
                case 0: goto L4d;
                case 1: goto L2d;
                default: goto L25;
            }
        L25:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L2d:
            int r3 = r0.I$0
            java.lang.Object r5 = r0.L$4
            r13 = r5
            java.lang.String r13 = (java.lang.String) r13
            java.lang.Object r5 = r0.L$3
            r12 = r5
            kotlin.jvm.functions.Function1 r12 = (kotlin.jvm.functions.Function1) r12
            java.lang.Object r5 = r0.L$2
            r11 = r5
            kotlin.jvm.functions.Function1 r11 = (kotlin.jvm.functions.Function1) r11
            java.lang.Object r5 = r0.L$1
            r10 = r5
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r5 = r0.L$0
            r9 = r5
            java.lang.String r9 = (java.lang.String) r9
            kotlin.ResultKt.throwOnFailure(r1)
            r5 = r8
            goto L9b
        L4d:
            kotlin.ResultKt.throwOnFailure(r1)
            r3 = 1
            r5 = r8
        L52:
            r6 = 6
            if (r3 >= r6) goto L9d
            float r6 = (float) r3
            r7 = 1084227584(0x40a00000, float:5.0)
            float r6 = r6 / r7
            java.lang.Float r6 = kotlin.coroutines.jvm.internal.Boxing.boxFloat(r6)
            r12.invoke(r6)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "[假数据] 步骤 "
            java.lang.StringBuilder r6 = r6.append(r7)
            java.lang.StringBuilder r6 = r6.append(r3)
            java.lang.String r7 = "/5"
            java.lang.StringBuilder r6 = r6.append(r7)
            java.lang.String r6 = r6.toString()
            r11.invoke(r6)
            java.lang.Object r6 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r9)
            r0.L$0 = r6
            r0.L$1 = r10
            r0.L$2 = r11
            r0.L$3 = r12
            java.lang.Object r6 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r13)
            r0.L$4 = r6
            r0.I$0 = r3
            r0.label = r4
            r6 = 120(0x78, double:5.93E-322)
            java.lang.Object r6 = kotlinx.coroutines.DelayKt.delay(r6, r0)
            if (r6 != r2) goto L9b
            return r2
        L9b:
            int r3 = r3 + r4
            goto L52
        L9d:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.android.ui.state.FakeLauncherUiApi.launchGame(java.lang.String, java.lang.String, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // com.pymcl.android.ui.state.LauncherUiApi
    public Object fetchNews(Continuation<? super List<NewsItem>> continuation) {
        return CollectionsKt.listOf((Object[]) new NewsItem[]{new NewsItem("Minecraft 1.21.10 正式发布", "2026-09-30", "Java 版", "https://www.minecraft.net/"), new NewsItem("快照 25w41a：新的生物群系细节", "2026-10-08", "快照", "https://www.minecraft.net/"), new NewsItem("Minecraft Live 2026 回顾", "2026-09-27", "活动", "https://www.minecraft.net/")});
    }

    @Override // com.pymcl.android.ui.state.LauncherUiApi
    public Object getServers(String instance, Continuation<? super List<ServerRow>> continuation) {
        return CollectionsKt.listOf((Object[]) new ServerRow[]{new ServerRow("示例生存服", "survival.example.com", "小游戏"), new ServerRow(RepositoryUiApi.LOBBY_NAME, "127.0.0.1:25565", "联机自动写入")});
    }

    @Override // com.pymcl.android.ui.state.LauncherUiApi
    public Object getPlaytime(Continuation<? super List<PlaytimeRow>> continuation) {
        return CollectionsKt.listOf((Object[]) new PlaytimeRow[]{new PlaytimeRow("默认", 61200L, 3, 42), new PlaytimeRow("生存服 1.20.1", 22800L, 1, 15), new PlaytimeRow("机械动力整合", 7500L, 2, 6)});
    }

    @Override // com.pymcl.android.ui.state.LauncherUiApi
    public Object terracottaState(Continuation<? super MpState> continuation) {
        return new MpState(MpPhase.Idle, null, null, CollectionsKt.listOf("192.168.1.23"), "内核运行中，等待操作", null, null, 102, null);
    }

    /* compiled from: LauncherUiApi.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/pymcl/android/ui/state/AiItem;"}, k = 3, mv = {2, 4, 0}, xi = 48)
    @DebugMetadata(c = "com.pymcl.android.ui.state.FakeLauncherUiApi$aiSend$1", f = "LauncherUiApi.kt", i = {0, 0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4, 5, 5, 5, 6, 6, 6}, l = {181, 181, 182, 183, 183, 184, 185}, m = "invokeSuspend", n = {"$this$flow", "reply", "sb", "ch", "$this$flow", "reply", "sb", "ch", "$this$flow", "reply", "sb", "$this$flow", "reply", "sb", "$this$flow", "reply", "sb", "$this$flow", "reply", "sb", "$this$flow", "reply", "sb"}, nl = {181, 182, 183, 183, 184, 185, 186}, s = {"L$0", "L$1", "L$2", "C$0", "L$0", "L$1", "L$2", "C$0", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2"}, v = 2)
    /* renamed from: com.pymcl.android.ui.state.FakeLauncherUiApi$aiSend$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<FlowCollector<? super AiItem>, Continuation<? super Unit>, Object> {
        char C$0;
        int I$0;
        int I$1;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FlowCollector<? super AiItem> flowCollector, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x00c3  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x011c A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:22:0x011d  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x012b  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x0182 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:33:0x019f A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:36:0x01d3 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:37:0x01d4  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x0208 A[RETURN] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x011d -> B:23:0x0122). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r24) {
            /*
                Method dump skipped, instructions count: 544
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.pymcl.android.ui.state.FakeLauncherUiApi.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Override // com.pymcl.android.ui.state.LauncherUiApi
    public Object aiListChats(Continuation<? super List<ChatSummary>> continuation) {
        return CollectionsKt.listOf((Object[]) new ChatSummary[]{new ChatSummary("c1", "装 Fabric + 钠", "10-21 21:02"), new ChatSummary("c2", "崩溃分析", "10-20 18:40")});
    }

    @Override // com.pymcl.android.ui.state.LauncherUiApi
    public Flow<AiItem> aiSend(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        return FlowKt.flow(new AnonymousClass1(null));
    }

    @Override // com.pymcl.android.ui.state.LauncherUiApi
    public Object aiListModels(Continuation<? super List<String>> continuation) {
        return CollectionsKt.listOf((Object[]) new String[]{"deepseek-chat", "qwen-plus", "gpt-4o-mini"});
    }

    @Override // com.pymcl.android.ui.state.LauncherUiApi
    public Object aiPermissionRules(Continuation<? super List<PermissionRule>> continuation) {
        return CollectionsKt.listOf((Object[]) new PermissionRule[]{new PermissionRule("install_mod", "allow", "instance", null, 8, null), new PermissionRule("delete_instance", "ask", "global", null, 8, null), new PermissionRule("launch_game", "deny", "global", null, 8, null)});
    }

    @Override // com.pymcl.android.ui.state.LauncherUiApi
    public Object getSettings(Continuation<? super UiSettings> continuation) {
        return this.settings;
    }

    @Override // com.pymcl.android.ui.state.LauncherUiApi
    public Object saveSettings(UiSettings s, Continuation<? super Unit> continuation) {
        this.settings = s;
        return Unit.INSTANCE;
    }

    @Override // com.pymcl.android.ui.state.LauncherUiApi
    public Object feedbackHistory(Continuation<? super List<FeedbackRecord>> continuation) {
        return CollectionsKt.listOf(new FeedbackRecord("启动 1.20.1 黑屏", "问题反馈", "已提交", "2026-10-12"));
    }

    @Override // com.pymcl.android.ui.state.LauncherUiApi
    public Object helpArticles(Continuation<? super List<HelpArticle>> continuation) {
        return CollectionsKt.listOf((Object[]) new HelpArticle[]{new HelpArticle("游戏启动后黑屏怎么办？", "先在设置里换一个渲染器，再检查 Java 版本是否匹配。"), new HelpArticle("如何导入整合包？", "在资源库 · 整合包 里搜索，或用「导入本地文件」选择 .mrpack / .zip。"), new HelpArticle("联机需要什么条件？", "双方都下载陶瓦联机内核，房主开局域网后把邀请码发给朋友。")});
    }
}
