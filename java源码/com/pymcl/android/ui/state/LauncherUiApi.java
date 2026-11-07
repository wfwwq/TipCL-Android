package com.pymcl.android.ui.state;

import androidx.autofill.HintConstants;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import com.pymcl.multiplayer.TerracottaVpnService;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: LauncherUiApi.kt */
@Metadata(d1 = {"\u0000ê\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010$\n\u0000\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H¦@¢\u0006\u0002\u0010\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH¦@¢\u0006\u0002\u0010\nJ\u0016\u0010\u000b\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH¦@¢\u0006\u0002\u0010\nJ\u001c\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u00032\u0006\u0010\u000e\u001a\u00020\tH¦@¢\u0006\u0002\u0010\nJ\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0003H¦@¢\u0006\u0002\u0010\u0005J$\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\tH¦@¢\u0006\u0002\u0010\u0014JP\u0010\u0015\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\t2\b\u0010\u0012\u001a\u0004\u0018\u00010\t2\b\u0010\u0017\u001a\u0004\u0018\u00010\t2\u001c\b\u0002\u0010\u0018\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u001a\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00070\u0019H¦@¢\u0006\u0002\u0010\u001bJ\u0014\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0003H¦@¢\u0006\u0002\u0010\u0005J\"\u0010\u001e\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\tH¦@¢\u0006\u0002\u0010\u0014J\u0016\u0010 \u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH¦@¢\u0006\u0002\u0010\nJ\u0016\u0010!\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020\tH¦@¢\u0006\u0002\u0010\nJ\u001a\u0010#\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0%0$H&J&\u0010&\u001a\u00020\t2\u0006\u0010'\u001a\u00020\t2\u0006\u0010\"\u001a\u00020\t2\u0006\u0010(\u001a\u00020\tH¦@¢\u0006\u0002\u0010)J&\u0010*\u001a\u00020\t2\u0006\u0010+\u001a\u00020\t2\u0006\u0010\"\u001a\u00020\t2\u0006\u0010(\u001a\u00020\tH¦@¢\u0006\u0002\u0010)J(\u0010,\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010-\u001a\u0004\u0018\u00010\t2\u0006\u0010.\u001a\u00020\tH¦@¢\u0006\u0002\u0010)J\u001c\u0010/\u001a\b\u0012\u0004\u0012\u0002000\u00032\u0006\u00101\u001a\u000202H¦@¢\u0006\u0002\u00103J\u001e\u00104\u001a\u00020\t2\u0006\u00105\u001a\u0002062\u0006\u00107\u001a\u00020\tH¦@¢\u0006\u0002\u00108J<\u00109\u001a\b\u0012\u0004\u0012\u00020:0\u00032\u0006\u0010;\u001a\u00020\t2\u0006\u0010<\u001a\u00020\t2\u0006\u0010=\u001a\u00020\t2\u0006\u0010>\u001a\u00020\t2\u0006\u0010?\u001a\u00020\tH¦@¢\u0006\u0002\u0010@J$\u0010A\u001a\b\u0012\u0004\u0012\u00020B0\u00032\u0006\u0010;\u001a\u00020\t2\u0006\u0010C\u001a\u00020\tH¦@¢\u0006\u0002\u0010\u0014JT\u0010D\u001a\u00020\t2\u0006\u0010;\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\t2\u0006\u0010C\u001a\u00020\t2\u0006\u0010E\u001a\u00020\t2\u001c\b\u0002\u0010\u0018\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u001a\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00070\u0019H¦@¢\u0006\u0002\u0010FJ&\u0010G\u001a\b\u0012\u0004\u0012\u00020H0\u00032\u0006\u0010\u000e\u001a\u00020\t2\b\b\u0002\u0010\u0016\u001a\u00020\tH¦@¢\u0006\u0002\u0010\u0014J,\u0010I\u001a\b\u0012\u0004\u0012\u00020H0\u00032\u0006\u0010;\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\tH\u0096@¢\u0006\u0002\u0010)J6\u0010J\u001a\u00020\u00072\u0006\u0010;\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\t2\u0006\u0010K\u001a\u00020\t2\u0006\u0010L\u001a\u000202H\u0096@¢\u0006\u0002\u0010MJ.\u0010N\u001a\u00020\u00072\u0006\u0010;\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\t2\u0006\u0010K\u001a\u00020\tH\u0096@¢\u0006\u0002\u0010OJ \u0010P\u001a\u0004\u0018\u00010:2\u0006\u0010;\u001a\u00020\t2\u0006\u0010Q\u001a\u00020\tH\u0096@¢\u0006\u0002\u0010\u0014JL\u0010R\u001a\u00020\t2\u0006\u0010;\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\t2\u0006\u0010-\u001a\u00020\t2\u001c\b\u0002\u0010\u0018\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u001a\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00070\u0019H\u0096@¢\u0006\u0002\u0010\u001bJ*\u0010S\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0T2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\tH\u0096@¢\u0006\u0002\u0010\u0014J\u0014\u0010U\u001a\b\u0012\u0004\u0012\u00020\t0VH\u0096@¢\u0006\u0002\u0010\u0005J\u001e\u0010W\u001a\u0002022\u0006\u0010;\u001a\u00020\t2\u0006\u0010C\u001a\u00020\tH¦@¢\u0006\u0002\u0010\u0014JX\u0010X\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\t2\u0014\b\u0002\u0010Y\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00070Z2\u0016\b\u0002\u0010\u0018\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u001a\u0012\u0004\u0012\u00020\u00070Z2\n\b\u0002\u0010[\u001a\u0004\u0018\u00010\tH¦@¢\u0006\u0002\u0010\\J\b\u0010]\u001a\u000202H\u0016J\b\u0010^\u001a\u00020\u0007H\u0016J\u0018\u0010_\u001a\u0004\u0018\u00010`2\u0006\u0010a\u001a\u000202H\u0096@¢\u0006\u0002\u00103J\u0010\u0010b\u001a\u0004\u0018\u00010\tH\u0096@¢\u0006\u0002\u0010\u0005J\u0014\u0010c\u001a\b\u0012\u0004\u0012\u00020d0\u0003H¦@¢\u0006\u0002\u0010\u0005J\u001c\u0010e\u001a\b\u0012\u0004\u0012\u00020f0\u00032\u0006\u0010\u000e\u001a\u00020\tH¦@¢\u0006\u0002\u0010\nJ\u0014\u0010g\u001a\b\u0012\u0004\u0012\u00020h0\u0003H¦@¢\u0006\u0002\u0010\u0005J\u000e\u0010i\u001a\u00020jH¦@¢\u0006\u0002\u0010\u0005J\u000e\u0010k\u001a\b\u0012\u0004\u0012\u00020j0$H\u0016J\u000e\u0010l\u001a\u00020jH\u0096@¢\u0006\u0002\u0010\u0005J\u000e\u0010m\u001a\u00020\u0007H\u0096@¢\u0006\u0002\u0010\u0005J\u0018\u0010n\u001a\u0004\u0018\u00010\t2\u0006\u0010o\u001a\u00020\tH\u0096@¢\u0006\u0002\u0010\nJ\u000e\u0010p\u001a\u00020\u0007H\u0096@¢\u0006\u0002\u0010\u0005J\u0014\u0010q\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020r0\u00030$H\u0016J\u0012\u0010s\u001a\u0004\u0018\u00010\t2\u0006\u0010t\u001a\u00020\tH\u0016J\u0014\u0010u\u001a\b\u0012\u0004\u0012\u00020v0\u0003H¦@¢\u0006\u0002\u0010\u0005J\u0016\u0010w\u001a\b\u0012\u0004\u0012\u00020x0$2\u0006\u0010y\u001a\u00020\tH&J\u0014\u0010z\u001a\b\u0012\u0004\u0012\u00020\t0\u0003H¦@¢\u0006\u0002\u0010\u0005J\u0014\u0010{\u001a\b\u0012\u0004\u0012\u00020|0\u0003H¦@¢\u0006\u0002\u0010\u0005J\u000e\u0010}\u001a\u00020~H¦@¢\u0006\u0002\u0010\u0005J\u0018\u0010\u007f\u001a\u00020\u00072\u0007\u0010\u0080\u0001\u001a\u00020~H¦@¢\u0006\u0003\u0010\u0081\u0001J\u0016\u0010\u0082\u0001\u001a\t\u0012\u0005\u0012\u00030\u0083\u00010\u0003H¦@¢\u0006\u0002\u0010\u0005J\u0016\u0010\u0084\u0001\u001a\t\u0012\u0005\u0012\u00030\u0085\u00010\u0003H¦@¢\u0006\u0002\u0010\u0005¨\u0006\u0086\u0001À\u0006\u0003"}, d2 = {"Lcom/pymcl/android/ui/state/LauncherUiApi;", "", "listInstances", "", "Lcom/pymcl/android/ui/state/InstanceRow;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createInstance", "", HintConstants.AUTOFILL_HINT_NAME, "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteInstance", "getInstalledVersions", "Lcom/pymcl/android/ui/state/InstalledVersion;", "instance", "getVersionList", "Lcom/pymcl/android/ui/state/RemoteVersion;", "listLoaderVersions", "loader", "mc", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "installGame", "version", "loaderVersion", "onProgress", "Lkotlin/Function2;", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAccountRows", "Lcom/pymcl/android/ui/state/AccountRow;", "setActiveAccount", ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "removeAccount", "addOfflineAccount", HintConstants.AUTOFILL_HINT_USERNAME, "startMicrosoftLogin", "Lkotlinx/coroutines/flow/Flow;", "Lkotlin/Pair;", "startAuthlibLogin", "api", HintConstants.AUTOFILL_HINT_PASSWORD, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "startNide8Login", "serverId", "setAccountSkin", "path", "model", "getJavaList", "Lcom/pymcl/android/ui/state/JavaRow;", "scan", "", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "downloadJava", "major", "", "distro", "(ILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "searchCatalog", "Lcom/pymcl/android/ui/state/CatalogHit;", "kind", "query", "source", "gameVersion", "category", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getProjectFiles", "Lcom/pymcl/android/ui/state/CatalogFile;", "id", "installMod", "file", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getInstalledMods", "Lcom/pymcl/android/ui/state/InstalledEntry;", "getInstalled", "setInstalledEnabled", "filename", "enabled", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteInstalled", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "resolveCatalogLink", "url", "importLocalFile", "checkModUpdates", "", "favorites", "", "toggleFavorite", "launchGame", "onLog", "Lkotlin/Function1;", "server", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isGameRunning", "stopGame", "collectGameExit", "Lcom/pymcl/android/ui/state/GameExitInfo;", "userStopped", "activeAccountName", "fetchNews", "Lcom/pymcl/android/ui/state/NewsItem;", "getServers", "Lcom/pymcl/android/ui/state/ServerRow;", "getPlaytime", "Lcom/pymcl/android/ui/state/PlaytimeRow;", "terracottaState", "Lcom/pymcl/android/ui/state/MpState;", "terracottaStates", "terracottaStart", "terracottaHost", "terracottaJoin", "code", "terracottaStop", "lanWorlds", "Lcom/pymcl/android/ui/state/LanWorldRow;", "normalizeDirect", "address", "aiListChats", "Lcom/pymcl/android/ui/state/ChatSummary;", "aiSend", "Lcom/pymcl/android/ui/state/AiItem;", TerracottaVpnService.EXTRA_TEXT, "aiListModels", "aiPermissionRules", "Lcom/pymcl/android/ui/state/PermissionRule;", "getSettings", "Lcom/pymcl/android/ui/state/UiSettings;", "saveSettings", "s", "(Lcom/pymcl/android/ui/state/UiSettings;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feedbackHistory", "Lcom/pymcl/android/ui/state/FeedbackRecord;", "helpArticles", "Lcom/pymcl/android/ui/state/HelpArticle;", "PyMCL-Android:app_debug"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes20.dex */
public interface LauncherUiApi {

    /* compiled from: LauncherUiApi.kt */
    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    @DebugMetadata(c = "com.pymcl.android.ui.state.LauncherUiApi", f = "LauncherUiApi.kt", i = {0}, l = {67}, m = "activeAccountName$suspendImpl", n = {"$this"}, nl = {256}, s = {"L$0"}, v = 2)
    /* renamed from: com.pymcl.android.ui.state.LauncherUiApi$activeAccountName$1, reason: invalid class name */
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
            return LauncherUiApi.activeAccountName$suspendImpl(LauncherUiApi.this, this);
        }
    }

    default Object activeAccountName(Continuation<? super String> continuation) {
        return activeAccountName$suspendImpl(this, continuation);
    }

    Object addOfflineAccount(String str, Continuation<? super Unit> continuation);

    Object aiListChats(Continuation<? super List<ChatSummary>> continuation);

    Object aiListModels(Continuation<? super List<String>> continuation);

    Object aiPermissionRules(Continuation<? super List<PermissionRule>> continuation);

    Flow<AiItem> aiSend(String text);

    default Object checkModUpdates(String str, String str2, Continuation<? super Map<String, String>> continuation) {
        return checkModUpdates$suspendImpl(this, str, str2, continuation);
    }

    default Object collectGameExit(boolean z, Continuation<? super GameExitInfo> continuation) {
        return collectGameExit$suspendImpl(this, z, continuation);
    }

    Object createInstance(String str, Continuation<? super Unit> continuation);

    default Object deleteInstalled(String str, String str2, String str3, String str4, Continuation<? super Unit> continuation) {
        return deleteInstalled$suspendImpl(this, str, str2, str3, str4, continuation);
    }

    Object deleteInstance(String str, Continuation<? super Unit> continuation);

    Object downloadJava(int i, String str, Continuation<? super String> continuation);

    default Object favorites(Continuation<? super Set<String>> continuation) {
        return favorites$suspendImpl(this, continuation);
    }

    Object feedbackHistory(Continuation<? super List<FeedbackRecord>> continuation);

    Object fetchNews(Continuation<? super List<NewsItem>> continuation);

    Object getAccountRows(Continuation<? super List<AccountRow>> continuation);

    default Object getInstalled(String str, String str2, String str3, Continuation<? super List<InstalledEntry>> continuation) {
        return getInstalled$suspendImpl(this, str, str2, str3, continuation);
    }

    Object getInstalledMods(String str, String str2, Continuation<? super List<InstalledEntry>> continuation);

    Object getInstalledVersions(String str, Continuation<? super List<InstalledVersion>> continuation);

    Object getJavaList(boolean z, Continuation<? super List<JavaRow>> continuation);

    Object getPlaytime(Continuation<? super List<PlaytimeRow>> continuation);

    Object getProjectFiles(String str, String str2, Continuation<? super List<CatalogFile>> continuation);

    Object getServers(String str, Continuation<? super List<ServerRow>> continuation);

    Object getSettings(Continuation<? super UiSettings> continuation);

    Object getVersionList(Continuation<? super List<RemoteVersion>> continuation);

    Object helpArticles(Continuation<? super List<HelpArticle>> continuation);

    default Object importLocalFile(String str, String str2, String str3, String str4, Function2<? super Float, ? super String, Unit> function2, Continuation<? super String> continuation) {
        return importLocalFile$suspendImpl(this, str, str2, str3, str4, function2, continuation);
    }

    Object installGame(String str, String str2, String str3, String str4, Function2<? super Float, ? super String, Unit> function2, Continuation<? super String> continuation);

    Object installMod(String str, String str2, String str3, String str4, String str5, Function2<? super Float, ? super String, Unit> function2, Continuation<? super String> continuation);

    Object launchGame(String str, String str2, Function1<? super String, Unit> function1, Function1<? super Float, Unit> function12, String str3, Continuation<? super String> continuation);

    Object listInstances(Continuation<? super List<InstanceRow>> continuation);

    Object listLoaderVersions(String str, String str2, Continuation<? super List<String>> continuation);

    Object removeAccount(String str, Continuation<? super Unit> continuation);

    default Object resolveCatalogLink(String str, String str2, Continuation<? super CatalogHit> continuation) {
        return resolveCatalogLink$suspendImpl(this, str, str2, continuation);
    }

    Object saveSettings(UiSettings uiSettings, Continuation<? super Unit> continuation);

    Object searchCatalog(String str, String str2, String str3, String str4, String str5, Continuation<? super List<CatalogHit>> continuation);

    Object setAccountSkin(String str, String str2, String str3, Continuation<? super Unit> continuation);

    Object setActiveAccount(String str, String str2, Continuation<? super Unit> continuation);

    default Object setInstalledEnabled(String str, String str2, String str3, String str4, boolean z, Continuation<? super Unit> continuation) {
        return setInstalledEnabled$suspendImpl(this, str, str2, str3, str4, z, continuation);
    }

    Object startAuthlibLogin(String str, String str2, String str3, Continuation<? super String> continuation);

    Flow<Pair<String, String>> startMicrosoftLogin();

    Object startNide8Login(String str, String str2, String str3, Continuation<? super String> continuation);

    default Object terracottaHost(Continuation<? super Unit> continuation) {
        return terracottaHost$suspendImpl(this, continuation);
    }

    default Object terracottaJoin(String str, Continuation<? super String> continuation) {
        return terracottaJoin$suspendImpl(this, str, continuation);
    }

    default Object terracottaStart(Continuation<? super MpState> continuation) {
        return terracottaState(continuation);
    }

    Object terracottaState(Continuation<? super MpState> continuation);

    default Object terracottaStop(Continuation<? super Unit> continuation) {
        return terracottaStop$suspendImpl(this, continuation);
    }

    Object toggleFavorite(String str, String str2, Continuation<? super Boolean> continuation);

    /* compiled from: LauncherUiApi.kt */
    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        public static Object getInstalled(LauncherUiApi $this, String kind, String instance, String version, Continuation<? super List<InstalledEntry>> continuation) {
            return LauncherUiApi.super.getInstalled(kind, instance, version, continuation);
        }

        @Deprecated
        public static Object setInstalledEnabled(LauncherUiApi $this, String kind, String instance, String version, String filename, boolean enabled, Continuation<? super Unit> continuation) {
            return LauncherUiApi.super.setInstalledEnabled(kind, instance, version, filename, enabled, continuation);
        }

        @Deprecated
        public static Object deleteInstalled(LauncherUiApi $this, String kind, String instance, String version, String filename, Continuation<? super Unit> continuation) {
            return LauncherUiApi.super.deleteInstalled(kind, instance, version, filename, continuation);
        }

        @Deprecated
        public static Object resolveCatalogLink(LauncherUiApi $this, String kind, String url, Continuation<? super CatalogHit> continuation) {
            return LauncherUiApi.super.resolveCatalogLink(kind, url, continuation);
        }

        @Deprecated
        public static Object importLocalFile(LauncherUiApi $this, String kind, String instance, String version, String path, Function2<? super Float, ? super String, Unit> function2, Continuation<? super String> continuation) {
            return LauncherUiApi.super.importLocalFile(kind, instance, version, path, function2, continuation);
        }

        @Deprecated
        public static Object checkModUpdates(LauncherUiApi $this, String instance, String version, Continuation<? super Map<String, String>> continuation) {
            return LauncherUiApi.super.checkModUpdates(instance, version, continuation);
        }

        @Deprecated
        public static Object favorites(LauncherUiApi $this, Continuation<? super Set<String>> continuation) {
            return LauncherUiApi.super.favorites(continuation);
        }

        @Deprecated
        public static boolean isGameRunning(LauncherUiApi $this) {
            return LauncherUiApi.super.isGameRunning();
        }

        @Deprecated
        public static void stopGame(LauncherUiApi $this) {
            LauncherUiApi.super.stopGame();
        }

        @Deprecated
        public static Object collectGameExit(LauncherUiApi $this, boolean userStopped, Continuation<? super GameExitInfo> continuation) {
            return LauncherUiApi.super.collectGameExit(userStopped, continuation);
        }

        @Deprecated
        public static Object activeAccountName(LauncherUiApi $this, Continuation<? super String> continuation) {
            return LauncherUiApi.super.activeAccountName(continuation);
        }

        @Deprecated
        public static Flow<MpState> terracottaStates(LauncherUiApi $this) {
            return LauncherUiApi.super.terracottaStates();
        }

        @Deprecated
        public static Object terracottaStart(LauncherUiApi $this, Continuation<? super MpState> continuation) {
            return LauncherUiApi.super.terracottaStart(continuation);
        }

        @Deprecated
        public static Object terracottaHost(LauncherUiApi $this, Continuation<? super Unit> continuation) {
            return LauncherUiApi.super.terracottaHost(continuation);
        }

        @Deprecated
        public static Object terracottaJoin(LauncherUiApi $this, String code, Continuation<? super String> continuation) {
            return LauncherUiApi.super.terracottaJoin(code, continuation);
        }

        @Deprecated
        public static Object terracottaStop(LauncherUiApi $this, Continuation<? super Unit> continuation) {
            return LauncherUiApi.super.terracottaStop(continuation);
        }

        @Deprecated
        public static Flow<List<LanWorldRow>> lanWorlds(LauncherUiApi $this) {
            return LauncherUiApi.super.lanWorlds();
        }

        @Deprecated
        public static String normalizeDirect(LauncherUiApi $this, String address) {
            Intrinsics.checkNotNullParameter(address, "address");
            return LauncherUiApi.super.normalizeDirect(address);
        }
    }

    static /* synthetic */ Object installGame$default(LauncherUiApi launcherUiApi, String str, String str2, String str3, String str4, Function2 function2, Continuation continuation, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: installGame");
        }
        if ((i & 16) != 0) {
            function2 = new Function2() { // from class: com.pymcl.android.ui.state.LauncherUiApi$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return LauncherUiApi.installGame$lambda$0((Float) obj2, (String) obj3);
                }
            };
        }
        return launcherUiApi.installGame(str, str2, str3, str4, function2, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    static Unit installGame$lambda$0(Float f, String str) {
        Intrinsics.checkNotNullParameter(str, "<unused var>");
        return Unit.INSTANCE;
    }

    static /* synthetic */ Object setActiveAccount$default(LauncherUiApi launcherUiApi, String str, String str2, Continuation continuation, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setActiveAccount");
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        return launcherUiApi.setActiveAccount(str, str2, continuation);
    }

    static /* synthetic */ Object installMod$default(LauncherUiApi launcherUiApi, String str, String str2, String str3, String str4, String str5, Function2 function2, Continuation continuation, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: installMod");
        }
        if ((i & 32) != 0) {
            function2 = new Function2() { // from class: com.pymcl.android.ui.state.LauncherUiApi$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return LauncherUiApi.installMod$lambda$0((Float) obj2, (String) obj3);
                }
            };
        }
        return launcherUiApi.installMod(str, str2, str3, str4, str5, function2, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    static Unit installMod$lambda$0(Float f, String str) {
        Intrinsics.checkNotNullParameter(str, "<unused var>");
        return Unit.INSTANCE;
    }

    static /* synthetic */ Object getInstalledMods$default(LauncherUiApi launcherUiApi, String str, String str2, Continuation continuation, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getInstalledMods");
        }
        if ((i & 2) != 0) {
            str2 = "";
        }
        return launcherUiApi.getInstalledMods(str, str2, continuation);
    }

    static /* synthetic */ Object getInstalled$suspendImpl(LauncherUiApi $this, String kind, String instance, String version, Continuation<? super List<InstalledEntry>> continuation) {
        return (Intrinsics.areEqual(kind, "mod") || Intrinsics.areEqual(kind, "mods")) ? $this.getInstalledMods(instance, version, continuation) : CollectionsKt.emptyList();
    }

    static /* synthetic */ Object setInstalledEnabled$suspendImpl(LauncherUiApi $this, String kind, String instance, String version, String filename, boolean enabled, Continuation<? super Unit> continuation) {
        return Unit.INSTANCE;
    }

    static /* synthetic */ Object deleteInstalled$suspendImpl(LauncherUiApi $this, String kind, String instance, String version, String filename, Continuation<? super Unit> continuation) {
        return Unit.INSTANCE;
    }

    static /* synthetic */ Object resolveCatalogLink$suspendImpl(LauncherUiApi $this, String kind, String url, Continuation<? super CatalogHit> continuation) {
        return null;
    }

    static /* synthetic */ Object importLocalFile$default(LauncherUiApi launcherUiApi, String str, String str2, String str3, String str4, Function2 function2, Continuation continuation, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: importLocalFile");
        }
        if ((i & 16) != 0) {
            function2 = new Function2() { // from class: com.pymcl.android.ui.state.LauncherUiApi$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return LauncherUiApi.importLocalFile$lambda$0((Float) obj2, (String) obj3);
                }
            };
        }
        return launcherUiApi.importLocalFile(str, str2, str3, str4, function2, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    static Unit importLocalFile$lambda$0(Float f, String str) {
        Intrinsics.checkNotNullParameter(str, "<unused var>");
        return Unit.INSTANCE;
    }

    static /* synthetic */ Object importLocalFile$suspendImpl(LauncherUiApi $this, String kind, String instance, String version, String path, Function2<? super Float, ? super String, Unit> function2, Continuation<? super String> continuation) {
        throw new UnsupportedOperationException();
    }

    static /* synthetic */ Object checkModUpdates$suspendImpl(LauncherUiApi $this, String instance, String version, Continuation<? super Map<String, String>> continuation) {
        return MapsKt.emptyMap();
    }

    static /* synthetic */ Object favorites$suspendImpl(LauncherUiApi $this, Continuation<? super Set<String>> continuation) {
        return SetsKt.emptySet();
    }

    static /* synthetic */ Object launchGame$default(LauncherUiApi launcherUiApi, String str, String str2, Function1 function1, Function1 function12, String str3, Continuation continuation, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: launchGame");
        }
        if ((i & 4) != 0) {
            function1 = new Function1() { // from class: com.pymcl.android.ui.state.LauncherUiApi$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return LauncherUiApi.launchGame$lambda$0((String) obj2);
                }
            };
        }
        Function1 function13 = function1;
        if ((i & 8) != 0) {
            function12 = new Function1() { // from class: com.pymcl.android.ui.state.LauncherUiApi$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return LauncherUiApi.launchGame$lambda$1((Float) obj2);
                }
            };
        }
        Function1 function14 = function12;
        if ((i & 16) != 0) {
            str3 = null;
        }
        return launcherUiApi.launchGame(str, str2, function13, function14, str3, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    static Unit launchGame$lambda$0(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    static Unit launchGame$lambda$1(Float it) {
        return Unit.INSTANCE;
    }

    default boolean isGameRunning() {
        return false;
    }

    default void stopGame() {
    }

    static /* synthetic */ Object collectGameExit$suspendImpl(LauncherUiApi $this, boolean userStopped, Continuation<? super GameExitInfo> continuation) {
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static /* synthetic */ java.lang.Object activeAccountName$suspendImpl(com.pymcl.android.ui.state.LauncherUiApi r9, kotlin.coroutines.Continuation<? super java.lang.String> r10) {
        /*
            boolean r0 = r10 instanceof com.pymcl.android.ui.state.LauncherUiApi.AnonymousClass1
            if (r0 == 0) goto L14
            r0 = r10
            com.pymcl.android.ui.state.LauncherUiApi$activeAccountName$1 r0 = (com.pymcl.android.ui.state.LauncherUiApi.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r1 = r0.label
            int r1 = r1 - r2
            r0.label = r1
            goto L19
        L14:
            com.pymcl.android.ui.state.LauncherUiApi$activeAccountName$1 r0 = new com.pymcl.android.ui.state.LauncherUiApi$activeAccountName$1
            r0.<init>(r10)
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
            r9 = r2
            com.pymcl.android.ui.state.LauncherUiApi r9 = (com.pymcl.android.ui.state.LauncherUiApi) r9
            kotlin.ResultKt.throwOnFailure(r1)
            r3 = r1
            goto L49
        L36:
            kotlin.ResultKt.throwOnFailure(r1)
            java.lang.Object r3 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r9)
            r0.L$0 = r3
            r3 = 1
            r0.label = r3
            java.lang.Object r3 = r9.getAccountRows(r0)
            if (r3 != r2) goto L49
            return r2
        L49:
            r2 = r3
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            r3 = 0
            java.util.Iterator r4 = r2.iterator()
        L51:
            boolean r5 = r4.hasNext()
            r6 = 0
            if (r5 == 0) goto L67
            java.lang.Object r5 = r4.next()
            r7 = r5
            com.pymcl.android.ui.state.AccountRow r7 = (com.pymcl.android.ui.state.AccountRow) r7
            r8 = 0
            boolean r7 = r7.getActive()
            if (r7 == 0) goto L51
            goto L68
        L67:
            r5 = r6
        L68:
            com.pymcl.android.ui.state.AccountRow r5 = (com.pymcl.android.ui.state.AccountRow) r5
            if (r5 == 0) goto L70
            java.lang.String r6 = r5.getName()
        L70:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.android.ui.state.LauncherUiApi.activeAccountName$suspendImpl(com.pymcl.android.ui.state.LauncherUiApi, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* compiled from: LauncherUiApi.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/pymcl/android/ui/state/MpState;"}, k = 3, mv = {2, 4, 0}, xi = 48)
    @DebugMetadata(c = "com.pymcl.android.ui.state.LauncherUiApi$terracottaStates$1", f = "LauncherUiApi.kt", i = {0, 1}, l = {75, 75}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, nl = {75, -1}, s = {"L$0", "L$0"}, v = 2)
    /* renamed from: com.pymcl.android.ui.state.LauncherUiApi$terracottaStates$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<FlowCollector<? super MpState>, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = LauncherUiApi.this.new AnonymousClass1(continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FlowCollector<? super MpState> flowCollector, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x0053 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = r6.L$0
                kotlinx.coroutines.flow.FlowCollector r0 = (kotlinx.coroutines.flow.FlowCollector) r0
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r6.label
                switch(r2) {
                    case 0: goto L22;
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
                kotlin.ResultKt.throwOnFailure(r7)
                goto L54
            L19:
                java.lang.Object r2 = r6.L$1
                kotlinx.coroutines.flow.FlowCollector r2 = (kotlinx.coroutines.flow.FlowCollector) r2
                kotlin.ResultKt.throwOnFailure(r7)
                r3 = r7
                goto L3e
            L22:
                kotlin.ResultKt.throwOnFailure(r7)
                com.pymcl.android.ui.state.LauncherUiApi r2 = com.pymcl.android.ui.state.LauncherUiApi.this
                r3 = r6
                kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3
                java.lang.Object r4 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r0)
                r6.L$0 = r4
                r6.L$1 = r0
                r4 = 1
                r6.label = r4
                java.lang.Object r2 = r2.terracottaState(r3)
                if (r2 != r1) goto L3c
                return r1
            L3c:
                r3 = r2
                r2 = r0
            L3e:
                r4 = r6
                kotlin.coroutines.Continuation r4 = (kotlin.coroutines.Continuation) r4
                java.lang.Object r5 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r0)
                r6.L$0 = r5
                r5 = 0
                r6.L$1 = r5
                r5 = 2
                r6.label = r5
                java.lang.Object r2 = r2.emit(r3, r4)
                if (r2 != r1) goto L54
                return r1
            L54:
                kotlin.Unit r1 = kotlin.Unit.INSTANCE
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.pymcl.android.ui.state.LauncherUiApi.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    default Flow<MpState> terracottaStates() {
        return FlowKt.flow(new AnonymousClass1(null));
    }

    static /* synthetic */ Object terracottaHost$suspendImpl(LauncherUiApi $this, Continuation<? super Unit> continuation) {
        return Unit.INSTANCE;
    }

    static /* synthetic */ Object terracottaJoin$suspendImpl(LauncherUiApi $this, String code, Continuation<? super String> continuation) {
        return null;
    }

    /* compiled from: LauncherUiApi.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "", "Lcom/pymcl/android/ui/state/LanWorldRow;"}, k = 3, mv = {2, 4, 0}, xi = 48)
    @DebugMetadata(c = "com.pymcl.android.ui.state.LauncherUiApi$lanWorlds$1", f = "LauncherUiApi.kt", i = {0}, l = {81}, m = "invokeSuspend", n = {"$this$flow"}, nl = {-1}, s = {"L$0"}, v = 2)
    /* renamed from: com.pymcl.android.ui.state.LauncherUiApi$lanWorlds$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<FlowCollector<? super List<? extends LanWorldRow>>, Continuation<? super Unit>, Object> {
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
        public /* bridge */ /* synthetic */ Object invoke(FlowCollector<? super List<? extends LanWorldRow>> flowCollector, Continuation<? super Unit> continuation) {
            return invoke2((FlowCollector<? super List<LanWorldRow>>) flowCollector, continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(FlowCollector<? super List<LanWorldRow>> flowCollector, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            FlowCollector $this$flow = (FlowCollector) this.L$0;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    this.L$0 = SpillingKt.nullOutSpilledVariable($this$flow);
                    this.label = 1;
                    if ($this$flow.emit(CollectionsKt.emptyList(), this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    break;
                case 1:
                    ResultKt.throwOnFailure($result);
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return Unit.INSTANCE;
        }
    }

    static /* synthetic */ Object terracottaStop$suspendImpl(LauncherUiApi $this, Continuation<? super Unit> continuation) {
        return Unit.INSTANCE;
    }

    default Flow<List<LanWorldRow>> lanWorlds() {
        return FlowKt.flow(new AnonymousClass1(null));
    }

    default String normalizeDirect(String address) {
        Intrinsics.checkNotNullParameter(address, "address");
        String string = StringsKt.trim((CharSequence) address).toString();
        if (string.length() == 0) {
            string = null;
        }
        return string;
    }
}
