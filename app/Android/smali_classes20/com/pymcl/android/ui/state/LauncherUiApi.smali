.class public interface abstract Lcom/pymcl/android/ui/state/LauncherUiApi;
.super Ljava/lang/Object;
.source "LauncherUiApi.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/pymcl/android/ui/state/LauncherUiApi$DefaultImpls;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nLauncherUiApi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LauncherUiApi.kt\ncom/pymcl/android/ui/state/LauncherUiApi\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,255:1\n296#2,2:256\n1#3:258\n*S KotlinDebug\n*F\n+ 1 LauncherUiApi.kt\ncom/pymcl/android/ui/state/LauncherUiApi\n*L\n67#1:256,2\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00ea\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0010$\n\u0000\n\u0002\u0010\"\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008f\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003H\u00a6@\u00a2\u0006\u0002\u0010\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\tH\u00a6@\u00a2\u0006\u0002\u0010\nJ\u0016\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\tH\u00a6@\u00a2\u0006\u0002\u0010\nJ\u001c\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\r0\u00032\u0006\u0010\u000e\u001a\u00020\tH\u00a6@\u00a2\u0006\u0002\u0010\nJ\u0014\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u00100\u0003H\u00a6@\u00a2\u0006\u0002\u0010\u0005J$\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\t0\u00032\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\tH\u00a6@\u00a2\u0006\u0002\u0010\u0014JP\u0010\u0015\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\t2\u0008\u0010\u0012\u001a\u0004\u0018\u00010\t2\u0008\u0010\u0017\u001a\u0004\u0018\u00010\t2\u001c\u0008\u0002\u0010\u0018\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u001a\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00070\u0019H\u00a6@\u00a2\u0006\u0002\u0010\u001bJ\u0014\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u00020\u001d0\u0003H\u00a6@\u00a2\u0006\u0002\u0010\u0005J\"\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\t2\n\u0008\u0002\u0010\u001f\u001a\u0004\u0018\u00010\tH\u00a6@\u00a2\u0006\u0002\u0010\u0014J\u0016\u0010 \u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\tH\u00a6@\u00a2\u0006\u0002\u0010\nJ\u0016\u0010!\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020\tH\u00a6@\u00a2\u0006\u0002\u0010\nJ\u001a\u0010#\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0%0$H&J&\u0010&\u001a\u00020\t2\u0006\u0010\'\u001a\u00020\t2\u0006\u0010\"\u001a\u00020\t2\u0006\u0010(\u001a\u00020\tH\u00a6@\u00a2\u0006\u0002\u0010)J&\u0010*\u001a\u00020\t2\u0006\u0010+\u001a\u00020\t2\u0006\u0010\"\u001a\u00020\t2\u0006\u0010(\u001a\u00020\tH\u00a6@\u00a2\u0006\u0002\u0010)J(\u0010,\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\t2\u0008\u0010-\u001a\u0004\u0018\u00010\t2\u0006\u0010.\u001a\u00020\tH\u00a6@\u00a2\u0006\u0002\u0010)J\u001c\u0010/\u001a\u0008\u0012\u0004\u0012\u0002000\u00032\u0006\u00101\u001a\u000202H\u00a6@\u00a2\u0006\u0002\u00103J\u001e\u00104\u001a\u00020\t2\u0006\u00105\u001a\u0002062\u0006\u00107\u001a\u00020\tH\u00a6@\u00a2\u0006\u0002\u00108J<\u00109\u001a\u0008\u0012\u0004\u0012\u00020:0\u00032\u0006\u0010;\u001a\u00020\t2\u0006\u0010<\u001a\u00020\t2\u0006\u0010=\u001a\u00020\t2\u0006\u0010>\u001a\u00020\t2\u0006\u0010?\u001a\u00020\tH\u00a6@\u00a2\u0006\u0002\u0010@J$\u0010A\u001a\u0008\u0012\u0004\u0012\u00020B0\u00032\u0006\u0010;\u001a\u00020\t2\u0006\u0010C\u001a\u00020\tH\u00a6@\u00a2\u0006\u0002\u0010\u0014JT\u0010D\u001a\u00020\t2\u0006\u0010;\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\t2\u0006\u0010C\u001a\u00020\t2\u0006\u0010E\u001a\u00020\t2\u001c\u0008\u0002\u0010\u0018\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u001a\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00070\u0019H\u00a6@\u00a2\u0006\u0002\u0010FJ&\u0010G\u001a\u0008\u0012\u0004\u0012\u00020H0\u00032\u0006\u0010\u000e\u001a\u00020\t2\u0008\u0008\u0002\u0010\u0016\u001a\u00020\tH\u00a6@\u00a2\u0006\u0002\u0010\u0014J,\u0010I\u001a\u0008\u0012\u0004\u0012\u00020H0\u00032\u0006\u0010;\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\tH\u0096@\u00a2\u0006\u0002\u0010)J6\u0010J\u001a\u00020\u00072\u0006\u0010;\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\t2\u0006\u0010K\u001a\u00020\t2\u0006\u0010L\u001a\u000202H\u0096@\u00a2\u0006\u0002\u0010MJ.\u0010N\u001a\u00020\u00072\u0006\u0010;\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\t2\u0006\u0010K\u001a\u00020\tH\u0096@\u00a2\u0006\u0002\u0010OJ \u0010P\u001a\u0004\u0018\u00010:2\u0006\u0010;\u001a\u00020\t2\u0006\u0010Q\u001a\u00020\tH\u0096@\u00a2\u0006\u0002\u0010\u0014JL\u0010R\u001a\u00020\t2\u0006\u0010;\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\t2\u0006\u0010-\u001a\u00020\t2\u001c\u0008\u0002\u0010\u0018\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u001a\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00070\u0019H\u0096@\u00a2\u0006\u0002\u0010\u001bJ*\u0010S\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0T2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\tH\u0096@\u00a2\u0006\u0002\u0010\u0014J\u0014\u0010U\u001a\u0008\u0012\u0004\u0012\u00020\t0VH\u0096@\u00a2\u0006\u0002\u0010\u0005J\u001e\u0010W\u001a\u0002022\u0006\u0010;\u001a\u00020\t2\u0006\u0010C\u001a\u00020\tH\u00a6@\u00a2\u0006\u0002\u0010\u0014JX\u0010X\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\t2\u0014\u0008\u0002\u0010Y\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00070Z2\u0016\u0008\u0002\u0010\u0018\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u001a\u0012\u0004\u0012\u00020\u00070Z2\n\u0008\u0002\u0010[\u001a\u0004\u0018\u00010\tH\u00a6@\u00a2\u0006\u0002\u0010\\J\u0008\u0010]\u001a\u000202H\u0016J\u0008\u0010^\u001a\u00020\u0007H\u0016J\u0018\u0010_\u001a\u0004\u0018\u00010`2\u0006\u0010a\u001a\u000202H\u0096@\u00a2\u0006\u0002\u00103J\u0010\u0010b\u001a\u0004\u0018\u00010\tH\u0096@\u00a2\u0006\u0002\u0010\u0005J\u0014\u0010c\u001a\u0008\u0012\u0004\u0012\u00020d0\u0003H\u00a6@\u00a2\u0006\u0002\u0010\u0005J\u001c\u0010e\u001a\u0008\u0012\u0004\u0012\u00020f0\u00032\u0006\u0010\u000e\u001a\u00020\tH\u00a6@\u00a2\u0006\u0002\u0010\nJ\u0014\u0010g\u001a\u0008\u0012\u0004\u0012\u00020h0\u0003H\u00a6@\u00a2\u0006\u0002\u0010\u0005J\u000e\u0010i\u001a\u00020jH\u00a6@\u00a2\u0006\u0002\u0010\u0005J\u000e\u0010k\u001a\u0008\u0012\u0004\u0012\u00020j0$H\u0016J\u000e\u0010l\u001a\u00020jH\u0096@\u00a2\u0006\u0002\u0010\u0005J\u000e\u0010m\u001a\u00020\u0007H\u0096@\u00a2\u0006\u0002\u0010\u0005J\u0018\u0010n\u001a\u0004\u0018\u00010\t2\u0006\u0010o\u001a\u00020\tH\u0096@\u00a2\u0006\u0002\u0010\nJ\u000e\u0010p\u001a\u00020\u0007H\u0096@\u00a2\u0006\u0002\u0010\u0005J\u0014\u0010q\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020r0\u00030$H\u0016J\u0012\u0010s\u001a\u0004\u0018\u00010\t2\u0006\u0010t\u001a\u00020\tH\u0016J\u0014\u0010u\u001a\u0008\u0012\u0004\u0012\u00020v0\u0003H\u00a6@\u00a2\u0006\u0002\u0010\u0005J\u0016\u0010w\u001a\u0008\u0012\u0004\u0012\u00020x0$2\u0006\u0010y\u001a\u00020\tH&J\u0014\u0010z\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0003H\u00a6@\u00a2\u0006\u0002\u0010\u0005J\u0014\u0010{\u001a\u0008\u0012\u0004\u0012\u00020|0\u0003H\u00a6@\u00a2\u0006\u0002\u0010\u0005J\u000e\u0010}\u001a\u00020~H\u00a6@\u00a2\u0006\u0002\u0010\u0005J\u0018\u0010\u007f\u001a\u00020\u00072\u0007\u0010\u0080\u0001\u001a\u00020~H\u00a6@\u00a2\u0006\u0003\u0010\u0081\u0001J\u0016\u0010\u0082\u0001\u001a\t\u0012\u0005\u0012\u00030\u0083\u00010\u0003H\u00a6@\u00a2\u0006\u0002\u0010\u0005J\u0016\u0010\u0084\u0001\u001a\t\u0012\u0005\u0012\u00030\u0085\u00010\u0003H\u00a6@\u00a2\u0006\u0002\u0010\u0005\u00a8\u0006\u0086\u0001\u00c0\u0006\u0003"
    }
    d2 = {
        "Lcom/pymcl/android/ui/state/LauncherUiApi;",
        "",
        "listInstances",
        "",
        "Lcom/pymcl/android/ui/state/InstanceRow;",
        "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "createInstance",
        "",
        "name",
        "",
        "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "deleteInstance",
        "getInstalledVersions",
        "Lcom/pymcl/android/ui/state/InstalledVersion;",
        "instance",
        "getVersionList",
        "Lcom/pymcl/android/ui/state/RemoteVersion;",
        "listLoaderVersions",
        "loader",
        "mc",
        "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "installGame",
        "version",
        "loaderVersion",
        "onProgress",
        "Lkotlin/Function2;",
        "",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "getAccountRows",
        "Lcom/pymcl/android/ui/state/AccountRow;",
        "setActiveAccount",
        "type",
        "removeAccount",
        "addOfflineAccount",
        "username",
        "startMicrosoftLogin",
        "Lkotlinx/coroutines/flow/Flow;",
        "Lkotlin/Pair;",
        "startAuthlibLogin",
        "api",
        "password",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "startNide8Login",
        "serverId",
        "setAccountSkin",
        "path",
        "model",
        "getJavaList",
        "Lcom/pymcl/android/ui/state/JavaRow;",
        "scan",
        "",
        "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "downloadJava",
        "major",
        "",
        "distro",
        "(ILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "searchCatalog",
        "Lcom/pymcl/android/ui/state/CatalogHit;",
        "kind",
        "query",
        "source",
        "gameVersion",
        "category",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "getProjectFiles",
        "Lcom/pymcl/android/ui/state/CatalogFile;",
        "id",
        "installMod",
        "file",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "getInstalledMods",
        "Lcom/pymcl/android/ui/state/InstalledEntry;",
        "getInstalled",
        "setInstalledEnabled",
        "filename",
        "enabled",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "deleteInstalled",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "resolveCatalogLink",
        "url",
        "importLocalFile",
        "checkModUpdates",
        "",
        "favorites",
        "",
        "toggleFavorite",
        "launchGame",
        "onLog",
        "Lkotlin/Function1;",
        "server",
        "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "isGameRunning",
        "stopGame",
        "collectGameExit",
        "Lcom/pymcl/android/ui/state/GameExitInfo;",
        "userStopped",
        "activeAccountName",
        "fetchNews",
        "Lcom/pymcl/android/ui/state/NewsItem;",
        "getServers",
        "Lcom/pymcl/android/ui/state/ServerRow;",
        "getPlaytime",
        "Lcom/pymcl/android/ui/state/PlaytimeRow;",
        "terracottaState",
        "Lcom/pymcl/android/ui/state/MpState;",
        "terracottaStates",
        "terracottaStart",
        "terracottaHost",
        "terracottaJoin",
        "code",
        "terracottaStop",
        "lanWorlds",
        "Lcom/pymcl/android/ui/state/LanWorldRow;",
        "normalizeDirect",
        "address",
        "aiListChats",
        "Lcom/pymcl/android/ui/state/ChatSummary;",
        "aiSend",
        "Lcom/pymcl/android/ui/state/AiItem;",
        "text",
        "aiListModels",
        "aiPermissionRules",
        "Lcom/pymcl/android/ui/state/PermissionRule;",
        "getSettings",
        "Lcom/pymcl/android/ui/state/UiSettings;",
        "saveSettings",
        "s",
        "(Lcom/pymcl/android/ui/state/UiSettings;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "feedbackHistory",
        "Lcom/pymcl/android/ui/state/FeedbackRecord;",
        "helpArticles",
        "Lcom/pymcl/android/ui/state/HelpArticle;",
        "PyMCL-Android:app_debug"
    }
    k = 0x1
    mv = {
        0x2,
        0x4,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static synthetic $r8$lambda$RuUjuBgQ7Z7epQbwLgoxOSYXjWE(Ljava/lang/Float;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/pymcl/android/ui/state/LauncherUiApi;->launchGame$lambda$1(Ljava/lang/Float;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$TMByTkK3OgZkiIUPDtWLUR_IM44(Ljava/lang/Float;Ljava/lang/String;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/pymcl/android/ui/state/LauncherUiApi;->installGame$lambda$0(Ljava/lang/Float;Ljava/lang/String;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$qFyY4bnurHmi8LnejiVmPINx5XU(Ljava/lang/Float;Ljava/lang/String;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/pymcl/android/ui/state/LauncherUiApi;->importLocalFile$lambda$0(Ljava/lang/Float;Ljava/lang/String;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$tTd_a_dzZy6WMoja4hcAit8aqwI(Ljava/lang/String;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/pymcl/android/ui/state/LauncherUiApi;->launchGame$lambda$0(Ljava/lang/String;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$u1_0J5FIdthXS1bxiU0Ihswptwo(Ljava/lang/Float;Ljava/lang/String;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/pymcl/android/ui/state/LauncherUiApi;->installMod$lambda$0(Ljava/lang/Float;Ljava/lang/String;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic access$activeAccountName$jd(Lcom/pymcl/android/ui/state/LauncherUiApi;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 1
    .param p0, "$this"    # Lcom/pymcl/android/ui/state/LauncherUiApi;
    .param p1, "$completion"    # Lkotlin/coroutines/Continuation;

    .line 11
    invoke-super {p0, p1}, Lcom/pymcl/android/ui/state/LauncherUiApi;->activeAccountName(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic access$checkModUpdates$jd(Lcom/pymcl/android/ui/state/LauncherUiApi;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 1
    .param p0, "$this"    # Lcom/pymcl/android/ui/state/LauncherUiApi;
    .param p1, "instance"    # Ljava/lang/String;
    .param p2, "version"    # Ljava/lang/String;
    .param p3, "$completion"    # Lkotlin/coroutines/Continuation;

    .line 11
    invoke-super {p0, p1, p2, p3}, Lcom/pymcl/android/ui/state/LauncherUiApi;->checkModUpdates(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic access$collectGameExit$jd(Lcom/pymcl/android/ui/state/LauncherUiApi;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 1
    .param p0, "$this"    # Lcom/pymcl/android/ui/state/LauncherUiApi;
    .param p1, "userStopped"    # Z
    .param p2, "$completion"    # Lkotlin/coroutines/Continuation;

    .line 11
    invoke-super {p0, p1, p2}, Lcom/pymcl/android/ui/state/LauncherUiApi;->collectGameExit(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic access$deleteInstalled$jd(Lcom/pymcl/android/ui/state/LauncherUiApi;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 1
    .param p0, "$this"    # Lcom/pymcl/android/ui/state/LauncherUiApi;
    .param p1, "kind"    # Ljava/lang/String;
    .param p2, "instance"    # Ljava/lang/String;
    .param p3, "version"    # Ljava/lang/String;
    .param p4, "filename"    # Ljava/lang/String;
    .param p5, "$completion"    # Lkotlin/coroutines/Continuation;

    .line 11
    invoke-super/range {p0 .. p5}, Lcom/pymcl/android/ui/state/LauncherUiApi;->deleteInstalled(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic access$favorites$jd(Lcom/pymcl/android/ui/state/LauncherUiApi;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 1
    .param p0, "$this"    # Lcom/pymcl/android/ui/state/LauncherUiApi;
    .param p1, "$completion"    # Lkotlin/coroutines/Continuation;

    .line 11
    invoke-super {p0, p1}, Lcom/pymcl/android/ui/state/LauncherUiApi;->favorites(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic access$getInstalled$jd(Lcom/pymcl/android/ui/state/LauncherUiApi;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 1
    .param p0, "$this"    # Lcom/pymcl/android/ui/state/LauncherUiApi;
    .param p1, "kind"    # Ljava/lang/String;
    .param p2, "instance"    # Ljava/lang/String;
    .param p3, "version"    # Ljava/lang/String;
    .param p4, "$completion"    # Lkotlin/coroutines/Continuation;

    .line 11
    invoke-super {p0, p1, p2, p3, p4}, Lcom/pymcl/android/ui/state/LauncherUiApi;->getInstalled(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic access$importLocalFile$jd(Lcom/pymcl/android/ui/state/LauncherUiApi;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 1
    .param p0, "$this"    # Lcom/pymcl/android/ui/state/LauncherUiApi;
    .param p1, "kind"    # Ljava/lang/String;
    .param p2, "instance"    # Ljava/lang/String;
    .param p3, "version"    # Ljava/lang/String;
    .param p4, "path"    # Ljava/lang/String;
    .param p5, "onProgress"    # Lkotlin/jvm/functions/Function2;
    .param p6, "$completion"    # Lkotlin/coroutines/Continuation;

    .line 11
    invoke-super/range {p0 .. p6}, Lcom/pymcl/android/ui/state/LauncherUiApi;->importLocalFile(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic access$isGameRunning$jd(Lcom/pymcl/android/ui/state/LauncherUiApi;)Z
    .locals 1
    .param p0, "$this"    # Lcom/pymcl/android/ui/state/LauncherUiApi;

    .line 11
    invoke-super {p0}, Lcom/pymcl/android/ui/state/LauncherUiApi;->isGameRunning()Z

    move-result v0

    return v0
.end method

.method public static synthetic access$lanWorlds$jd(Lcom/pymcl/android/ui/state/LauncherUiApi;)Lkotlinx/coroutines/flow/Flow;
    .locals 1
    .param p0, "$this"    # Lcom/pymcl/android/ui/state/LauncherUiApi;

    .line 11
    invoke-super {p0}, Lcom/pymcl/android/ui/state/LauncherUiApi;->lanWorlds()Lkotlinx/coroutines/flow/Flow;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic access$normalizeDirect$jd(Lcom/pymcl/android/ui/state/LauncherUiApi;Ljava/lang/String;)Ljava/lang/String;
    .locals 1
    .param p0, "$this"    # Lcom/pymcl/android/ui/state/LauncherUiApi;
    .param p1, "address"    # Ljava/lang/String;

    .line 11
    invoke-super {p0, p1}, Lcom/pymcl/android/ui/state/LauncherUiApi;->normalizeDirect(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic access$resolveCatalogLink$jd(Lcom/pymcl/android/ui/state/LauncherUiApi;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 1
    .param p0, "$this"    # Lcom/pymcl/android/ui/state/LauncherUiApi;
    .param p1, "kind"    # Ljava/lang/String;
    .param p2, "url"    # Ljava/lang/String;
    .param p3, "$completion"    # Lkotlin/coroutines/Continuation;

    .line 11
    invoke-super {p0, p1, p2, p3}, Lcom/pymcl/android/ui/state/LauncherUiApi;->resolveCatalogLink(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic access$setInstalledEnabled$jd(Lcom/pymcl/android/ui/state/LauncherUiApi;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 1
    .param p0, "$this"    # Lcom/pymcl/android/ui/state/LauncherUiApi;
    .param p1, "kind"    # Ljava/lang/String;
    .param p2, "instance"    # Ljava/lang/String;
    .param p3, "version"    # Ljava/lang/String;
    .param p4, "filename"    # Ljava/lang/String;
    .param p5, "enabled"    # Z
    .param p6, "$completion"    # Lkotlin/coroutines/Continuation;

    .line 11
    invoke-super/range {p0 .. p6}, Lcom/pymcl/android/ui/state/LauncherUiApi;->setInstalledEnabled(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic access$stopGame$jd(Lcom/pymcl/android/ui/state/LauncherUiApi;)V
    .locals 0
    .param p0, "$this"    # Lcom/pymcl/android/ui/state/LauncherUiApi;

    .line 11
    invoke-super {p0}, Lcom/pymcl/android/ui/state/LauncherUiApi;->stopGame()V

    return-void
.end method

.method public static synthetic access$terracottaHost$jd(Lcom/pymcl/android/ui/state/LauncherUiApi;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 1
    .param p0, "$this"    # Lcom/pymcl/android/ui/state/LauncherUiApi;
    .param p1, "$completion"    # Lkotlin/coroutines/Continuation;

    .line 11
    invoke-super {p0, p1}, Lcom/pymcl/android/ui/state/LauncherUiApi;->terracottaHost(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic access$terracottaJoin$jd(Lcom/pymcl/android/ui/state/LauncherUiApi;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 1
    .param p0, "$this"    # Lcom/pymcl/android/ui/state/LauncherUiApi;
    .param p1, "code"    # Ljava/lang/String;
    .param p2, "$completion"    # Lkotlin/coroutines/Continuation;

    .line 11
    invoke-super {p0, p1, p2}, Lcom/pymcl/android/ui/state/LauncherUiApi;->terracottaJoin(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic access$terracottaStart$jd(Lcom/pymcl/android/ui/state/LauncherUiApi;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 1
    .param p0, "$this"    # Lcom/pymcl/android/ui/state/LauncherUiApi;
    .param p1, "$completion"    # Lkotlin/coroutines/Continuation;

    .line 11
    invoke-super {p0, p1}, Lcom/pymcl/android/ui/state/LauncherUiApi;->terracottaStart(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic access$terracottaStates$jd(Lcom/pymcl/android/ui/state/LauncherUiApi;)Lkotlinx/coroutines/flow/Flow;
    .locals 1
    .param p0, "$this"    # Lcom/pymcl/android/ui/state/LauncherUiApi;

    .line 11
    invoke-super {p0}, Lcom/pymcl/android/ui/state/LauncherUiApi;->terracottaStates()Lkotlinx/coroutines/flow/Flow;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic access$terracottaStop$jd(Lcom/pymcl/android/ui/state/LauncherUiApi;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 1
    .param p0, "$this"    # Lcom/pymcl/android/ui/state/LauncherUiApi;
    .param p1, "$completion"    # Lkotlin/coroutines/Continuation;

    .line 11
    invoke-super {p0, p1}, Lcom/pymcl/android/ui/state/LauncherUiApi;->terracottaStop(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic activeAccountName$suspendImpl(Lcom/pymcl/android/ui/state/LauncherUiApi;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 9
    .param p0, "$this"    # Lcom/pymcl/android/ui/state/LauncherUiApi;
    .param p1, "$completion"    # Lkotlin/coroutines/Continuation;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/pymcl/android/ui/state/LauncherUiApi;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lcom/pymcl/android/ui/state/LauncherUiApi$activeAccountName$1;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/pymcl/android/ui/state/LauncherUiApi$activeAccountName$1;

    iget v1, v0, Lcom/pymcl/android/ui/state/LauncherUiApi$activeAccountName$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget v1, v0, Lcom/pymcl/android/ui/state/LauncherUiApi$activeAccountName$1;->label:I

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/pymcl/android/ui/state/LauncherUiApi$activeAccountName$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/pymcl/android/ui/state/LauncherUiApi$activeAccountName$1;

    invoke-direct {v0, p0, p1}, Lcom/pymcl/android/ui/state/LauncherUiApi$activeAccountName$1;-><init>(Lcom/pymcl/android/ui/state/LauncherUiApi;Lkotlin/coroutines/Continuation;)V

    .local v0, "$continuation":Lkotlin/coroutines/Continuation;
    :goto_0
    iget-object v1, v0, Lcom/pymcl/android/ui/state/LauncherUiApi$activeAccountName$1;->result:Ljava/lang/Object;

    .local v1, "$result":Ljava/lang/Object;
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v2

    .line 67
    iget v3, v0, Lcom/pymcl/android/ui/state/LauncherUiApi$activeAccountName$1;->label:I

    packed-switch v3, :pswitch_data_0

    .end local v0    # "$continuation":Lkotlin/coroutines/Continuation;
    .end local v1    # "$result":Ljava/lang/Object;
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .restart local v0    # "$continuation":Lkotlin/coroutines/Continuation;
    .restart local v1    # "$result":Ljava/lang/Object;
    :pswitch_0
    iget-object v2, v0, Lcom/pymcl/android/ui/state/LauncherUiApi$activeAccountName$1;->L$0:Ljava/lang/Object;

    move-object p0, v2

    check-cast p0, Lcom/pymcl/android/ui/state/LauncherUiApi;

    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object v3, v1

    goto :goto_1

    :pswitch_1
    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    invoke-static {p0}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    iput-object v3, v0, Lcom/pymcl/android/ui/state/LauncherUiApi$activeAccountName$1;->L$0:Ljava/lang/Object;

    const/4 v3, 0x1

    iput v3, v0, Lcom/pymcl/android/ui/state/LauncherUiApi$activeAccountName$1;->label:I

    invoke-interface {p0, v0}, Lcom/pymcl/android/ui/state/LauncherUiApi;->getAccountRows(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v2, :cond_1

    return-object v2

    :cond_1
    :goto_1
    move-object v2, v3

    check-cast v2, Ljava/lang/Iterable;

    .local v2, "$this$firstOrNull\\1":Ljava/lang/Iterable;
    const/4 v3, 0x0

    .line 256
    .local v3, "$i$f$firstOrNull\\1\\67":I
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    const/4 v6, 0x0

    if-eqz v5, :cond_3

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    .local v5, "element\\1":Ljava/lang/Object;
    move-object v7, v5

    check-cast v7, Lcom/pymcl/android/ui/state/AccountRow;

    .local v7, "it\\2":Lcom/pymcl/android/ui/state/AccountRow;
    const/4 v8, 0x0

    .line 67
    .local v8, "$i$a$-firstOrNull-LauncherUiApi$activeAccountName$2\\2\\256\\0":I
    invoke-virtual {v7}, Lcom/pymcl/android/ui/state/AccountRow;->getActive()Z

    move-result v7

    .line 256
    .end local v7    # "it\\2":Lcom/pymcl/android/ui/state/AccountRow;
    .end local v8    # "$i$a$-firstOrNull-LauncherUiApi$activeAccountName$2\\2\\256\\0":I
    if-eqz v7, :cond_2

    goto :goto_2

    .line 257
    .end local v5    # "element\\1":Ljava/lang/Object;
    :cond_3
    move-object v5, v6

    .line 67
    .end local v2    # "$this$firstOrNull\\1":Ljava/lang/Iterable;
    .end local v3    # "$i$f$firstOrNull\\1\\67":I
    :goto_2
    check-cast v5, Lcom/pymcl/android/ui/state/AccountRow;

    if-eqz v5, :cond_4

    invoke-virtual {v5}, Lcom/pymcl/android/ui/state/AccountRow;->getName()Ljava/lang/String;

    move-result-object v6

    :cond_4
    return-object v6

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static synthetic checkModUpdates$suspendImpl(Lcom/pymcl/android/ui/state/LauncherUiApi;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 1
    .param p0, "$this"    # Lcom/pymcl/android/ui/state/LauncherUiApi;
    .param p1, "instance"    # Ljava/lang/String;
    .param p2, "version"    # Ljava/lang/String;
    .param p3, "$completion"    # Lkotlin/coroutines/Continuation;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/pymcl/android/ui/state/LauncherUiApi;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 49
    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic collectGameExit$suspendImpl(Lcom/pymcl/android/ui/state/LauncherUiApi;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 1
    .param p0, "$this"    # Lcom/pymcl/android/ui/state/LauncherUiApi;
    .param p1, "userStopped"    # Z
    .param p2, "$completion"    # Lkotlin/coroutines/Continuation;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/pymcl/android/ui/state/LauncherUiApi;",
            "Z",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/pymcl/android/ui/state/GameExitInfo;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 65
    const/4 v0, 0x0

    return-object v0
.end method

.method public static synthetic deleteInstalled$suspendImpl(Lcom/pymcl/android/ui/state/LauncherUiApi;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 1
    .param p0, "$this"    # Lcom/pymcl/android/ui/state/LauncherUiApi;
    .param p1, "kind"    # Ljava/lang/String;
    .param p2, "instance"    # Ljava/lang/String;
    .param p3, "version"    # Ljava/lang/String;
    .param p4, "filename"    # Ljava/lang/String;
    .param p5, "$completion"    # Lkotlin/coroutines/Continuation;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/pymcl/android/ui/state/LauncherUiApi;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 43
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method public static synthetic favorites$suspendImpl(Lcom/pymcl/android/ui/state/LauncherUiApi;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 1
    .param p0, "$this"    # Lcom/pymcl/android/ui/state/LauncherUiApi;
    .param p1, "$completion"    # Lkotlin/coroutines/Continuation;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/pymcl/android/ui/state/LauncherUiApi;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 50
    invoke-static {}, Lkotlin/collections/SetsKt;->emptySet()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic getInstalled$suspendImpl(Lcom/pymcl/android/ui/state/LauncherUiApi;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 1
    .param p0, "$this"    # Lcom/pymcl/android/ui/state/LauncherUiApi;
    .param p1, "kind"    # Ljava/lang/String;
    .param p2, "instance"    # Ljava/lang/String;
    .param p3, "version"    # Ljava/lang/String;
    .param p4, "$completion"    # Lkotlin/coroutines/Continuation;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/pymcl/android/ui/state/LauncherUiApi;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/util/List<",
            "Lcom/pymcl/android/ui/state/InstalledEntry;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 41
    const-string v0, "mod"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "mods"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v0

    return-object v0

    :cond_1
    :goto_0
    invoke-interface {p0, p2, p3, p4}, Lcom/pymcl/android/ui/state/LauncherUiApi;->getInstalledMods(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic getInstalledMods$default(Lcom/pymcl/android/ui/state/LauncherUiApi;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 39
    if-nez p5, :cond_1

    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_0

    const-string p2, ""

    :cond_0
    invoke-interface {p0, p1, p2, p3}, Lcom/pymcl/android/ui/state/LauncherUiApi;->getInstalledMods(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: getInstalledMods"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static synthetic importLocalFile$default(Lcom/pymcl/android/ui/state/LauncherUiApi;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 47
    if-nez p8, :cond_1

    and-int/lit8 p7, p7, 0x10

    if-eqz p7, :cond_0

    new-instance p5, Lcom/pymcl/android/ui/state/LauncherUiApi$$ExternalSyntheticLambda4;

    invoke-direct {p5}, Lcom/pymcl/android/ui/state/LauncherUiApi$$ExternalSyntheticLambda4;-><init>()V

    :cond_0
    move-object v5, p5

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v6, p6

    invoke-interface/range {v0 .. v6}, Lcom/pymcl/android/ui/state/LauncherUiApi;->importLocalFile(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: importLocalFile"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private static importLocalFile$lambda$0(Ljava/lang/Float;Ljava/lang/String;)Lkotlin/Unit;
    .locals 0

    const-string p0, "<unused var>"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 47
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic importLocalFile$suspendImpl(Lcom/pymcl/android/ui/state/LauncherUiApi;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 1
    .param p0, "$this"    # Lcom/pymcl/android/ui/state/LauncherUiApi;
    .param p1, "kind"    # Ljava/lang/String;
    .param p2, "instance"    # Ljava/lang/String;
    .param p3, "version"    # Ljava/lang/String;
    .param p4, "path"    # Ljava/lang/String;
    .param p5, "onProgress"    # Lkotlin/jvm/functions/Function2;
    .param p6, "$completion"    # Lkotlin/coroutines/Continuation;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/pymcl/android/ui/state/LauncherUiApi;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Ljava/lang/Float;",
            "-",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 47
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public static synthetic installGame$default(Lcom/pymcl/android/ui/state/LauncherUiApi;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 20
    if-nez p8, :cond_1

    and-int/lit8 p7, p7, 0x10

    if-eqz p7, :cond_0

    new-instance p5, Lcom/pymcl/android/ui/state/LauncherUiApi$$ExternalSyntheticLambda2;

    invoke-direct {p5}, Lcom/pymcl/android/ui/state/LauncherUiApi$$ExternalSyntheticLambda2;-><init>()V

    :cond_0
    move-object v5, p5

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v6, p6

    invoke-interface/range {v0 .. v6}, Lcom/pymcl/android/ui/state/LauncherUiApi;->installGame(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: installGame"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private static installGame$lambda$0(Ljava/lang/Float;Ljava/lang/String;)Lkotlin/Unit;
    .locals 0

    const-string p0, "<unused var>"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic installMod$default(Lcom/pymcl/android/ui/state/LauncherUiApi;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 38
    if-nez p9, :cond_1

    and-int/lit8 v0, p8, 0x20

    if-eqz v0, :cond_0

    new-instance p6, Lcom/pymcl/android/ui/state/LauncherUiApi$$ExternalSyntheticLambda3;

    invoke-direct {p6}, Lcom/pymcl/android/ui/state/LauncherUiApi$$ExternalSyntheticLambda3;-><init>()V

    :cond_0
    move-object v6, p6

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move-object v7, p7

    invoke-interface/range {v0 .. v7}, Lcom/pymcl/android/ui/state/LauncherUiApi;->installMod(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: installMod"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private static installMod$lambda$0(Ljava/lang/Float;Ljava/lang/String;)Lkotlin/Unit;
    .locals 0

    const-string p0, "<unused var>"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 38
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic launchGame$default(Lcom/pymcl/android/ui/state/LauncherUiApi;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Ljava/lang/String;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 57
    if-nez p8, :cond_3

    and-int/lit8 p8, p7, 0x4

    if-eqz p8, :cond_0

    new-instance p3, Lcom/pymcl/android/ui/state/LauncherUiApi$$ExternalSyntheticLambda0;

    invoke-direct {p3}, Lcom/pymcl/android/ui/state/LauncherUiApi$$ExternalSyntheticLambda0;-><init>()V

    :cond_0
    move-object v3, p3

    and-int/lit8 p3, p7, 0x8

    if-eqz p3, :cond_1

    new-instance p4, Lcom/pymcl/android/ui/state/LauncherUiApi$$ExternalSyntheticLambda1;

    invoke-direct {p4}, Lcom/pymcl/android/ui/state/LauncherUiApi$$ExternalSyntheticLambda1;-><init>()V

    :cond_1
    move-object v4, p4

    and-int/lit8 p3, p7, 0x10

    if-eqz p3, :cond_2

    const/4 p5, 0x0

    :cond_2
    move-object v5, p5

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v6, p6

    invoke-interface/range {v0 .. v6}, Lcom/pymcl/android/ui/state/LauncherUiApi;->launchGame(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_3
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: launchGame"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private static launchGame$lambda$0(Ljava/lang/String;)Lkotlin/Unit;
    .locals 1
    .param p0, "it"    # Ljava/lang/String;

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 57
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method private static launchGame$lambda$1(Ljava/lang/Float;)Lkotlin/Unit;
    .locals 1
    .param p0, "it"    # Ljava/lang/Float;

    .line 57
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method public static synthetic resolveCatalogLink$suspendImpl(Lcom/pymcl/android/ui/state/LauncherUiApi;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 1
    .param p0, "$this"    # Lcom/pymcl/android/ui/state/LauncherUiApi;
    .param p1, "kind"    # Ljava/lang/String;
    .param p2, "url"    # Ljava/lang/String;
    .param p3, "$completion"    # Lkotlin/coroutines/Continuation;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/pymcl/android/ui/state/LauncherUiApi;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/pymcl/android/ui/state/CatalogHit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 45
    const/4 v0, 0x0

    return-object v0
.end method

.method public static synthetic setActiveAccount$default(Lcom/pymcl/android/ui/state/LauncherUiApi;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 24
    if-nez p5, :cond_1

    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-interface {p0, p1, p2, p3}, Lcom/pymcl/android/ui/state/LauncherUiApi;->setActiveAccount(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: setActiveAccount"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static synthetic setInstalledEnabled$suspendImpl(Lcom/pymcl/android/ui/state/LauncherUiApi;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 1
    .param p0, "$this"    # Lcom/pymcl/android/ui/state/LauncherUiApi;
    .param p1, "kind"    # Ljava/lang/String;
    .param p2, "instance"    # Ljava/lang/String;
    .param p3, "version"    # Ljava/lang/String;
    .param p4, "filename"    # Ljava/lang/String;
    .param p5, "enabled"    # Z
    .param p6, "$completion"    # Lkotlin/coroutines/Continuation;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/pymcl/android/ui/state/LauncherUiApi;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Z",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 42
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method public static synthetic terracottaHost$suspendImpl(Lcom/pymcl/android/ui/state/LauncherUiApi;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 1
    .param p0, "$this"    # Lcom/pymcl/android/ui/state/LauncherUiApi;
    .param p1, "$completion"    # Lkotlin/coroutines/Continuation;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/pymcl/android/ui/state/LauncherUiApi;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 77
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method public static synthetic terracottaJoin$suspendImpl(Lcom/pymcl/android/ui/state/LauncherUiApi;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 1
    .param p0, "$this"    # Lcom/pymcl/android/ui/state/LauncherUiApi;
    .param p1, "code"    # Ljava/lang/String;
    .param p2, "$completion"    # Lkotlin/coroutines/Continuation;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/pymcl/android/ui/state/LauncherUiApi;",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 79
    const/4 v0, 0x0

    return-object v0
.end method

.method public static synthetic terracottaStart$suspendImpl(Lcom/pymcl/android/ui/state/LauncherUiApi;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 1
    .param p0, "$this"    # Lcom/pymcl/android/ui/state/LauncherUiApi;
    .param p1, "$completion"    # Lkotlin/coroutines/Continuation;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/pymcl/android/ui/state/LauncherUiApi;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/pymcl/android/ui/state/MpState;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 76
    invoke-interface {p0, p1}, Lcom/pymcl/android/ui/state/LauncherUiApi;->terracottaState(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic terracottaStop$suspendImpl(Lcom/pymcl/android/ui/state/LauncherUiApi;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 1
    .param p0, "$this"    # Lcom/pymcl/android/ui/state/LauncherUiApi;
    .param p1, "$completion"    # Lkotlin/coroutines/Continuation;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/pymcl/android/ui/state/LauncherUiApi;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 80
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method


# virtual methods
.method public activeAccountName(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-static {p0, p1}, Lcom/pymcl/android/ui/state/LauncherUiApi;->activeAccountName$suspendImpl(Lcom/pymcl/android/ui/state/LauncherUiApi;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public abstract addOfflineAccount(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract aiListChats(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/util/List<",
            "Lcom/pymcl/android/ui/state/ChatSummary;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract aiListModels(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract aiPermissionRules(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/util/List<",
            "Lcom/pymcl/android/ui/state/PermissionRule;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract aiSend(Ljava/lang/String;)Lkotlinx/coroutines/flow/Flow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lkotlinx/coroutines/flow/Flow<",
            "Lcom/pymcl/android/ui/state/AiItem;",
            ">;"
        }
    .end annotation
.end method

.method public checkModUpdates(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-static {p0, p1, p2, p3}, Lcom/pymcl/android/ui/state/LauncherUiApi;->checkModUpdates$suspendImpl(Lcom/pymcl/android/ui/state/LauncherUiApi;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public collectGameExit(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/pymcl/android/ui/state/GameExitInfo;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-static {p0, p1, p2}, Lcom/pymcl/android/ui/state/LauncherUiApi;->collectGameExit$suspendImpl(Lcom/pymcl/android/ui/state/LauncherUiApi;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public abstract createInstance(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public deleteInstalled(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-static/range {p0 .. p5}, Lcom/pymcl/android/ui/state/LauncherUiApi;->deleteInstalled$suspendImpl(Lcom/pymcl/android/ui/state/LauncherUiApi;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public abstract deleteInstance(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract downloadJava(ILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public favorites(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-static {p0, p1}, Lcom/pymcl/android/ui/state/LauncherUiApi;->favorites$suspendImpl(Lcom/pymcl/android/ui/state/LauncherUiApi;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public abstract feedbackHistory(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/util/List<",
            "Lcom/pymcl/android/ui/state/FeedbackRecord;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract fetchNews(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/util/List<",
            "Lcom/pymcl/android/ui/state/NewsItem;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract getAccountRows(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/util/List<",
            "Lcom/pymcl/android/ui/state/AccountRow;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public getInstalled(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/util/List<",
            "Lcom/pymcl/android/ui/state/InstalledEntry;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-static {p0, p1, p2, p3, p4}, Lcom/pymcl/android/ui/state/LauncherUiApi;->getInstalled$suspendImpl(Lcom/pymcl/android/ui/state/LauncherUiApi;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public abstract getInstalledMods(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/util/List<",
            "Lcom/pymcl/android/ui/state/InstalledEntry;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract getInstalledVersions(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/util/List<",
            "Lcom/pymcl/android/ui/state/InstalledVersion;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract getJavaList(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/util/List<",
            "Lcom/pymcl/android/ui/state/JavaRow;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract getPlaytime(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/util/List<",
            "Lcom/pymcl/android/ui/state/PlaytimeRow;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract getProjectFiles(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/util/List<",
            "Lcom/pymcl/android/ui/state/CatalogFile;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract getServers(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/util/List<",
            "Lcom/pymcl/android/ui/state/ServerRow;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract getSettings(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/pymcl/android/ui/state/UiSettings;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract getVersionList(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/util/List<",
            "Lcom/pymcl/android/ui/state/RemoteVersion;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract helpArticles(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/util/List<",
            "Lcom/pymcl/android/ui/state/HelpArticle;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public importLocalFile(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Ljava/lang/Float;",
            "-",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-static/range {p0 .. p6}, Lcom/pymcl/android/ui/state/LauncherUiApi;->importLocalFile$suspendImpl(Lcom/pymcl/android/ui/state/LauncherUiApi;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public abstract installGame(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Ljava/lang/Float;",
            "-",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract installMod(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Ljava/lang/Float;",
            "-",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public isGameRunning()Z
    .locals 1

    .line 59
    const/4 v0, 0x0

    return v0
.end method

.method public lanWorlds()Lkotlinx/coroutines/flow/Flow;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/Flow<",
            "Ljava/util/List<",
            "Lcom/pymcl/android/ui/state/LanWorldRow;",
            ">;>;"
        }
    .end annotation

    .line 81
    new-instance v0, Lcom/pymcl/android/ui/state/LauncherUiApi$lanWorlds$1;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/pymcl/android/ui/state/LauncherUiApi$lanWorlds$1;-><init>(Lkotlin/coroutines/Continuation;)V

    check-cast v0, Lkotlin/jvm/functions/Function2;

    invoke-static {v0}, Lkotlinx/coroutines/flow/FlowKt;->flow(Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/flow/Flow;

    move-result-object v0

    return-object v0
.end method

.method public abstract launchGame(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Float;",
            "Lkotlin/Unit;",
            ">;",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract listInstances(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/util/List<",
            "Lcom/pymcl/android/ui/state/InstanceRow;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract listLoaderVersions(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public normalizeDirect(Ljava/lang/String;)Ljava/lang/String;
    .locals 2
    .param p1, "address"    # Ljava/lang/String;

    const-string v0, "address"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 83
    move-object v0, p1

    check-cast v0, Ljava/lang/CharSequence;

    invoke-static {v0}, Lkotlin/text/StringsKt;->trim(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    check-cast v0, Ljava/lang/CharSequence;

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-nez v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_1

    .line 258
    const/4 v0, 0x0

    .line 83
    .local v0, "$i$a$-ifEmpty-LauncherUiApi$normalizeDirect$1\\1\\83\\0":I
    nop

    .end local v0    # "$i$a$-ifEmpty-LauncherUiApi$normalizeDirect$1\\1\\83\\0":I
    const/4 v0, 0x0

    :cond_1
    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public abstract removeAccount(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public resolveCatalogLink(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/pymcl/android/ui/state/CatalogHit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-static {p0, p1, p2, p3}, Lcom/pymcl/android/ui/state/LauncherUiApi;->resolveCatalogLink$suspendImpl(Lcom/pymcl/android/ui/state/LauncherUiApi;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public abstract saveSettings(Lcom/pymcl/android/ui/state/UiSettings;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/pymcl/android/ui/state/UiSettings;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract searchCatalog(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/util/List<",
            "Lcom/pymcl/android/ui/state/CatalogHit;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract setAccountSkin(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract setActiveAccount(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public setInstalledEnabled(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Z",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-static/range {p0 .. p6}, Lcom/pymcl/android/ui/state/LauncherUiApi;->setInstalledEnabled$suspendImpl(Lcom/pymcl/android/ui/state/LauncherUiApi;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public abstract startAuthlibLogin(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract startMicrosoftLogin()Lkotlinx/coroutines/flow/Flow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/Flow<",
            "Lkotlin/Pair<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation
.end method

.method public abstract startNide8Login(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public stopGame()V
    .locals 0

    .line 60
    return-void
.end method

.method public terracottaHost(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-static {p0, p1}, Lcom/pymcl/android/ui/state/LauncherUiApi;->terracottaHost$suspendImpl(Lcom/pymcl/android/ui/state/LauncherUiApi;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public terracottaJoin(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-static {p0, p1, p2}, Lcom/pymcl/android/ui/state/LauncherUiApi;->terracottaJoin$suspendImpl(Lcom/pymcl/android/ui/state/LauncherUiApi;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public terracottaStart(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/pymcl/android/ui/state/MpState;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-static {p0, p1}, Lcom/pymcl/android/ui/state/LauncherUiApi;->terracottaStart$suspendImpl(Lcom/pymcl/android/ui/state/LauncherUiApi;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public abstract terracottaState(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/pymcl/android/ui/state/MpState;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public terracottaStates()Lkotlinx/coroutines/flow/Flow;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/Flow<",
            "Lcom/pymcl/android/ui/state/MpState;",
            ">;"
        }
    .end annotation

    .line 75
    new-instance v0, Lcom/pymcl/android/ui/state/LauncherUiApi$terracottaStates$1;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/pymcl/android/ui/state/LauncherUiApi$terracottaStates$1;-><init>(Lcom/pymcl/android/ui/state/LauncherUiApi;Lkotlin/coroutines/Continuation;)V

    check-cast v0, Lkotlin/jvm/functions/Function2;

    invoke-static {v0}, Lkotlinx/coroutines/flow/FlowKt;->flow(Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/flow/Flow;

    move-result-object v0

    return-object v0
.end method

.method public terracottaStop(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-static {p0, p1}, Lcom/pymcl/android/ui/state/LauncherUiApi;->terracottaStop$suspendImpl(Lcom/pymcl/android/ui/state/LauncherUiApi;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public abstract toggleFavorite(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method
