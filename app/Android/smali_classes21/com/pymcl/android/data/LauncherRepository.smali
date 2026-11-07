.class public final Lcom/pymcl/android/data/LauncherRepository;
.super Ljava/lang/Object;
.source "LauncherRepository.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/pymcl/android/data/LauncherRepository$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nLauncherRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LauncherRepository.kt\ncom/pymcl/android/data/LauncherRepository\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,206:1\n1#2:207\n1#2:221\n296#3,2:208\n1795#3,10:210\n2068#3:220\n2069#3:222\n1805#3:223\n2198#3,14:241\n296#3,2:255\n15780#4,14:224\n3938#4:238\n4474#4,2:239\n*S KotlinDebug\n*F\n+ 1 LauncherRepository.kt\ncom/pymcl/android/data/LauncherRepository\n*L\n184#1:221\n120#1:208,2\n184#1:210,10\n184#1:220\n184#1:222\n184#1:223\n202#1:241,14\n185#1:255,2\n201#1:224,14\n202#1:238\n202#1:239,2\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00c8\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0011\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\t\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\u0008\u0007\u0018\u0000 \u00a9\u00012\u00020\u0001:\u0002\u00a9\u0001B\u0011\u0008\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J@\u0010P\u001a\u000e\u0012\u0004\u0012\u00020R\u0012\u0004\u0012\u00020R0Q2\u0006\u0010S\u001a\u00020E2\u001c\u0008\u0002\u0010T\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010V\u0012\u0004\u0012\u00020R\u0012\u0004\u0012\u00020W0UH\u0086@\u00a2\u0006\u0002\u0010XJ\u0006\u0010^\u001a\u00020WJ\u000e\u0010_\u001a\u00020`2\u0006\u0010a\u001a\u00020bJ\u0006\u0010c\u001a\u00020bJ\u0018\u0010d\u001a\u00020e2\u0008\u0008\u0002\u0010f\u001a\u00020gH\u0086@\u00a2\u0006\u0002\u0010hJ \u0010i\u001a\u00020R2\u0006\u0010j\u001a\u00020R2\u0008\u0008\u0002\u0010k\u001a\u00020bH\u0086@\u00a2\u0006\u0002\u0010lJ0\u0010m\u001a\u00020R2\u0006\u0010n\u001a\u00020o2\u0006\u0010p\u001a\u00020R2\u0006\u0010q\u001a\u00020R2\u0008\u0008\u0002\u0010k\u001a\u00020bH\u0086@\u00a2\u0006\u0002\u0010rJ$\u0010s\u001a\u0008\u0012\u0004\u0012\u00020u0t2\u0006\u0010n\u001a\u00020o2\u0006\u0010p\u001a\u00020RH\u0086@\u00a2\u0006\u0002\u0010vJ\u0018\u0010w\u001a\u00020x2\u0006\u0010y\u001a\u00020R2\u0008\u0008\u0002\u0010z\u001a\u00020RJ4\u0010{\u001a\u00020x2\u0012\u0010|\u001a\u000e\u0012\u0004\u0012\u00020~\u0012\u0004\u0012\u00020W0}2\u000f\u0008\u0002\u0010\u007f\u001a\t\u0012\u0004\u0012\u00020g0\u0080\u0001H\u0086@\u00a2\u0006\u0003\u0010\u0081\u0001J1\u0010\u0082\u0001\u001a\u0008\u0012\u0004\u0012\u00020x0t2\u0007\u0010\u0083\u0001\u001a\u00020R2\u0007\u0010\u0084\u0001\u001a\u00020R2\u0007\u0010\u0085\u0001\u001a\u00020RH\u0086@\u00a2\u0006\u0003\u0010\u0086\u0001J1\u0010\u0087\u0001\u001a\u0008\u0012\u0004\u0012\u00020x0t2\u0007\u0010\u0088\u0001\u001a\u00020R2\u0007\u0010\u0084\u0001\u001a\u00020R2\u0007\u0010\u0085\u0001\u001a\u00020RH\u0086@\u00a2\u0006\u0003\u0010\u0086\u0001J\u0019\u0010\u0089\u0001\u001a\u00020x2\u0007\u0010\u008a\u0001\u001a\u00020xH\u0086@\u00a2\u0006\u0003\u0010\u008b\u0001J#\u0010\u008c\u0001\u001a\u00020W2\u0006\u0010y\u001a\u00020R2\t\u0010\u008d\u0001\u001a\u0004\u0018\u00010R2\u0007\u0010\u008e\u0001\u001a\u00020RJ\u0012\u0010\u008f\u0001\u001a\u0004\u0018\u00010E2\u0007\u0010\u008a\u0001\u001a\u00020xJ\u001e\u0010\u0090\u0001\u001a\u0010\u0012\u0004\u0012\u00020R\u0012\u0004\u0012\u00020R\u0018\u00010Q2\u0007\u0010\u008a\u0001\u001a\u00020xJU\u0010\u0091\u0001\u001a\u00030\u0092\u00012\u0007\u0010\u0093\u0001\u001a\u00020R2\u0008\u0008\u0002\u0010k\u001a\u00020b2\u000b\u0008\u0002\u0010\u0094\u0001\u001a\u0004\u0018\u00010R2\u000b\u0008\u0002\u0010\u0095\u0001\u001a\u0004\u0018\u00010R2\u0015\u0008\u0002\u0010\u0096\u0001\u001a\u000e\u0012\u0004\u0012\u00020R\u0012\u0004\u0012\u00020W0}H\u0086@\u00a2\u0006\u0003\u0010\u0097\u0001J\u0013\u0010\u0098\u0001\u001a\u00020g2\u0008\u0010\u0099\u0001\u001a\u00030\u009a\u0001H\u0002J=\u0010\u009b\u0001\u001a\u00030\u0092\u00012\u0008\u0010\u009c\u0001\u001a\u00030\u009d\u00012\u0008\u0010\u009e\u0001\u001a\u00030\u009f\u00012\u0007\u0010\u00a0\u0001\u001a\u00020E2\t\u0010\u0094\u0001\u001a\u0004\u0018\u00010R2\u000b\u0008\u0002\u0010\u0095\u0001\u001a\u0004\u0018\u00010RJ+\u0010\u00a1\u0001\u001a\u00020W2\u0006\u0010k\u001a\u00020b2\u0006\u0010q\u001a\u00020R2\u0008\u0010\u00a2\u0001\u001a\u00030\u00a3\u00012\u0008\u0010\u00a4\u0001\u001a\u00030\u00a3\u0001J*\u0010\u00a5\u0001\u001a\t\u0012\u0005\u0012\u00030\u00a6\u00010t2\u0007\u0010\u00a0\u0001\u001a\u00020E2\u0008\u0010\u00a7\u0001\u001a\u00030\u009a\u00012\u0007\u0010\u00a8\u0001\u001a\u00020RR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\tR\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\rR\u0011\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u0011R\u0011\u0010\u0012\u001a\u00020\u0013\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0014\u0010\u0015R\u0011\u0010\u0016\u001a\u00020\u0017\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0018\u0010\u0019R\u0011\u0010\u001a\u001a\u00020\u001b\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001c\u0010\u001dR\u0011\u0010\u001e\u001a\u00020\u001f\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008 \u0010!R\u0011\u0010\"\u001a\u00020#\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008$\u0010%R\u0011\u0010&\u001a\u00020\'\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008(\u0010)R\u0011\u0010*\u001a\u00020+\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008,\u0010-R\u0011\u0010.\u001a\u00020/\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00080\u00101R\u0011\u00102\u001a\u000203\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00084\u00105R\u0011\u00106\u001a\u000207\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00088\u00109R\u0011\u0010:\u001a\u00020;\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008<\u0010=R\u001b\u0010>\u001a\u00020?8FX\u0086\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008B\u0010C\u001a\u0004\u0008@\u0010AR\u0011\u0010D\u001a\u00020E8F\u00a2\u0006\u0006\u001a\u0004\u0008F\u0010GR\u0011\u0010H\u001a\u00020I\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008J\u0010KR\u0011\u0010L\u001a\u00020M\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008N\u0010OR\u0017\u0010Y\u001a\u0008\u0012\u0004\u0012\u00020[0Z8F\u00a2\u0006\u0006\u001a\u0004\u0008\\\u0010]\u00ca\u0001\u000e\u0008\u00ab\u0001\u0012\t\u0008\u00ac\u0001\u0012\u0004\u0008\u0003\u0010\u0000\u00a8\u0006\u00aa\u0001"
    }
    d2 = {
        "Lcom/pymcl/android/data/LauncherRepository;",
        "",
        "ctx",
        "Landroid/content/Context;",
        "<init>",
        "(Landroid/content/Context;)V",
        "http",
        "Lcom/pymcl/core/net/Http;",
        "getHttp",
        "()Lcom/pymcl/core/net/Http;",
        "paths",
        "Lcom/pymcl/core/config/LauncherPaths;",
        "getPaths",
        "()Lcom/pymcl/core/config/LauncherPaths;",
        "config",
        "Lcom/pymcl/core/config/ConfigStore;",
        "getConfig",
        "()Lcom/pymcl/core/config/ConfigStore;",
        "accounts",
        "Lcom/pymcl/core/account/AccountStore;",
        "getAccounts",
        "()Lcom/pymcl/core/account/AccountStore;",
        "instances",
        "Lcom/pymcl/core/instance/InstanceManager;",
        "getInstances",
        "()Lcom/pymcl/core/instance/InstanceManager;",
        "playtime",
        "Lcom/pymcl/core/instance/PlaytimeStore;",
        "getPlaytime",
        "()Lcom/pymcl/core/instance/PlaytimeStore;",
        "mirrors",
        "Lcom/pymcl/core/download/Mirrors;",
        "getMirrors",
        "()Lcom/pymcl/core/download/Mirrors;",
        "downloads",
        "Lcom/pymcl/core/download/DownloadManager;",
        "getDownloads",
        "()Lcom/pymcl/core/download/DownloadManager;",
        "ruleEnv",
        "Lcom/pymcl/core/version/RuleEnv;",
        "getRuleEnv",
        "()Lcom/pymcl/core/version/RuleEnv;",
        "game",
        "Lcom/pymcl/core/version/GameInstaller;",
        "getGame",
        "()Lcom/pymcl/core/version/GameInstaller;",
        "loaders",
        "Lcom/pymcl/core/loader/LoaderInstaller;",
        "getLoaders",
        "()Lcom/pymcl/core/loader/LoaderInstaller;",
        "microsoft",
        "Lcom/pymcl/core/auth/MicrosoftAuth;",
        "getMicrosoft",
        "()Lcom/pymcl/core/auth/MicrosoftAuth;",
        "yggdrasil",
        "Lcom/pymcl/core/auth/YggdrasilAuth;",
        "getYggdrasil",
        "()Lcom/pymcl/core/auth/YggdrasilAuth;",
        "agents",
        "Lcom/pymcl/core/auth/AgentJars;",
        "getAgents",
        "()Lcom/pymcl/core/auth/AgentJars;",
        "skinServer",
        "Lcom/pymcl/core/auth/SkinServer;",
        "getSkinServer",
        "()Lcom/pymcl/core/auth/SkinServer;",
        "skinServer$delegate",
        "Lkotlin/Lazy;",
        "skinsDir",
        "Ljava/io/File;",
        "getSkinsDir",
        "()Ljava/io/File;",
        "catalog",
        "Lcom/pymcl/core/mods/ModCatalog;",
        "getCatalog",
        "()Lcom/pymcl/core/mods/ModCatalog;",
        "modTools",
        "Lcom/pymcl/core/mods/ModTools;",
        "getModTools",
        "()Lcom/pymcl/core/mods/ModTools;",
        "importModpack",
        "Lkotlin/Pair;",
        "",
        "zip",
        "onProgress",
        "Lkotlin/Function2;",
        "",
        "",
        "(Ljava/io/File;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "downloadProgress",
        "Lkotlinx/coroutines/flow/StateFlow;",
        "Lcom/pymcl/core/download/DownloadProgress;",
        "getDownloadProgress",
        "()Lkotlinx/coroutines/flow/StateFlow;",
        "applyDownloadSettings",
        "dirsFor",
        "Lcom/pymcl/core/version/GameDirs;",
        "i",
        "Lcom/pymcl/core/instance/Instance;",
        "currentInstance",
        "versionManifest",
        "Lcom/pymcl/core/version/VersionManifest;",
        "force",
        "",
        "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "installVanilla",
        "id",
        "inst",
        "(Ljava/lang/String;Lcom/pymcl/core/instance/Instance;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "installLoader",
        "type",
        "Lcom/pymcl/core/loader/LoaderType;",
        "mc",
        "version",
        "(Lcom/pymcl/core/loader/LoaderType;Ljava/lang/String;Ljava/lang/String;Lcom/pymcl/core/instance/Instance;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "loaderVersions",
        "",
        "Lcom/pymcl/core/loader/LoaderVersion;",
        "(Lcom/pymcl/core/loader/LoaderType;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "addOffline",
        "Lcom/pymcl/core/account/Account;",
        "name",
        "skin",
        "loginMicrosoft",
        "onCode",
        "Lkotlin/Function1;",
        "Lcom/pymcl/core/auth/DeviceCode;",
        "cancelled",
        "Lkotlin/Function0;",
        "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "loginAuthlib",
        "api",
        "user",
        "pass",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "loginNide8",
        "serverId",
        "refreshIfNeeded",
        "a",
        "(Lcom/pymcl/core/account/Account;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "setOfflineSkin",
        "src",
        "model",
        "offlineSkinFile",
        "prepareOfflineSkin",
        "buildLaunchRequest",
        "Lcom/pymcl/runtime/GameLaunchRequest;",
        "versionId",
        "rendererId",
        "server",
        "onNote",
        "(Ljava/lang/String;Lcom/pymcl/core/instance/Instance;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "javaAvailable",
        "major",
        "",
        "toFclRequest",
        "v",
        "Lcom/pymcl/core/version/ResolvedVersion;",
        "spec",
        "Lcom/pymcl/core/launch/LaunchSpec;",
        "gameDir",
        "recordPlaytime",
        "startSec",
        "",
        "durationSec",
        "analyzeCrash",
        "Lcom/pymcl/core/crash/CrashReason;",
        "exitCode",
        "output",
        "Companion",
        "PyMCL-Android:app_debug",
        "Landroidx/compose/runtime/internal/StabilityInferred;",
        "parameters"
    }
    k = 0x1
    mv = {
        0x2,
        0x4,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final $stable:I

.field public static final Companion:Lcom/pymcl/android/data/LauncherRepository$Companion;

.field private static volatile inst:Lcom/pymcl/android/data/LauncherRepository;


# instance fields
.field private final accounts:Lcom/pymcl/core/account/AccountStore;

.field private final agents:Lcom/pymcl/core/auth/AgentJars;

.field private final catalog:Lcom/pymcl/core/mods/ModCatalog;

.field private final config:Lcom/pymcl/core/config/ConfigStore;

.field private final ctx:Landroid/content/Context;

.field private final downloads:Lcom/pymcl/core/download/DownloadManager;

.field private final game:Lcom/pymcl/core/version/GameInstaller;

.field private final http:Lcom/pymcl/core/net/Http;

.field private final instances:Lcom/pymcl/core/instance/InstanceManager;

.field private final loaders:Lcom/pymcl/core/loader/LoaderInstaller;

.field private final microsoft:Lcom/pymcl/core/auth/MicrosoftAuth;

.field private final mirrors:Lcom/pymcl/core/download/Mirrors;

.field private final modTools:Lcom/pymcl/core/mods/ModTools;

.field private final paths:Lcom/pymcl/core/config/LauncherPaths;

.field private final playtime:Lcom/pymcl/core/instance/PlaytimeStore;

.field private final ruleEnv:Lcom/pymcl/core/version/RuleEnv;

.field private final skinServer$delegate:Lkotlin/Lazy;

.field private final yggdrasil:Lcom/pymcl/core/auth/YggdrasilAuth;


# direct methods
.method public static synthetic $r8$lambda$2ZrkEaXVx6DS2F-TaexUT5R3N6s(Ljava/lang/String;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/pymcl/android/data/LauncherRepository;->buildLaunchRequest$lambda$0(Ljava/lang/String;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$7k6LzvrsT_v3QvhaN6g5HGe6tdc(Lcom/pymcl/android/data/LauncherRepository;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lcom/pymcl/android/data/LauncherRepository;->catalog$lambda$0(Lcom/pymcl/android/data/LauncherRepository;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$E_Xtu29ubXeFK5tukNf8xxrkcfA()Z
    .locals 1

    invoke-static {}, Lcom/pymcl/android/data/LauncherRepository;->loginMicrosoft$lambda$0()Z

    move-result v0

    return v0
.end method

.method public static synthetic $r8$lambda$L8HohzJGkvH-HzL2VF1gFOuA0oM(Lcom/pymcl/android/data/LauncherRepository;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lcom/pymcl/android/data/LauncherRepository;->mirrors$lambda$0(Lcom/pymcl/android/data/LauncherRepository;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$_LhGQtbAP2dCHi0HfycOrsygRSo(Lcom/pymcl/android/data/LauncherRepository;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lcom/pymcl/android/data/LauncherRepository;->microsoft$lambda$0(Lcom/pymcl/android/data/LauncherRepository;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$d8oDIDZUylIA3EE-MMpwJMiRd-4()Lcom/pymcl/core/auth/SkinServer;
    .locals 1

    invoke-static {}, Lcom/pymcl/android/data/LauncherRepository;->skinServer_delegate$lambda$0()Lcom/pymcl/core/auth/SkinServer;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic $r8$lambda$diTh75t-iGpP-balzoJzb_Z_B4I(Ljava/lang/Float;Ljava/lang/String;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/pymcl/android/data/LauncherRepository;->importModpack$lambda$0(Ljava/lang/Float;Ljava/lang/String;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$gJokVOpfwhSZICwcf4EYvkeBKWM(Lcom/pymcl/android/data/LauncherRepository;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lcom/pymcl/android/data/LauncherRepository;->mirrors$lambda$1(Lcom/pymcl/android/data/LauncherRepository;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$o9uROEpp0zUutejCGeZNk1PhKCA(Lcom/pymcl/android/data/LauncherRepository;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lcom/pymcl/android/data/LauncherRepository;->downloads$lambda$0(Lcom/pymcl/android/data/LauncherRepository;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/pymcl/android/data/LauncherRepository$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/pymcl/android/data/LauncherRepository$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/pymcl/android/data/LauncherRepository;->Companion:Lcom/pymcl/android/data/LauncherRepository$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/pymcl/android/data/LauncherRepository;->$stable:I

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;)V
    .locals 18
    .param p1, "ctx"    # Landroid/content/Context;

    .line 27
    move-object/from16 v0, p0

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    move-object/from16 v1, p1

    iput-object v1, v0, Lcom/pymcl/android/data/LauncherRepository;->ctx:Landroid/content/Context;

    .line 37
    new-instance v2, Lcom/pymcl/core/net/UrlConnectionHttp;

    const/4 v3, 0x0

    const/4 v4, 0x1

    invoke-direct {v2, v3, v4, v3}, Lcom/pymcl/core/net/UrlConnectionHttp;-><init>(Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    check-cast v2, Lcom/pymcl/core/net/Http;

    iput-object v2, v0, Lcom/pymcl/android/data/LauncherRepository;->http:Lcom/pymcl/core/net/Http;

    .line 38
    new-instance v2, Lcom/pymcl/core/config/LauncherPaths;

    sget-object v5, Lcom/pymcl/android/data/LauncherRepository;->Companion:Lcom/pymcl/android/data/LauncherRepository$Companion;

    iget-object v6, v0, Lcom/pymcl/android/data/LauncherRepository;->ctx:Landroid/content/Context;

    invoke-virtual {v5, v6}, Lcom/pymcl/android/data/LauncherRepository$Companion;->rootDir(Landroid/content/Context;)Ljava/io/File;

    move-result-object v5

    const/4 v6, 0x2

    invoke-direct {v2, v5, v3, v6, v3}, Lcom/pymcl/core/config/LauncherPaths;-><init>(Ljava/io/File;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v2, v0, Lcom/pymcl/android/data/LauncherRepository;->paths:Lcom/pymcl/core/config/LauncherPaths;

    .line 39
    new-instance v2, Lcom/pymcl/core/config/ConfigStore;

    iget-object v5, v0, Lcom/pymcl/android/data/LauncherRepository;->paths:Lcom/pymcl/core/config/LauncherPaths;

    invoke-direct {v2, v5}, Lcom/pymcl/core/config/ConfigStore;-><init>(Lcom/pymcl/core/config/LauncherPaths;)V

    iput-object v2, v0, Lcom/pymcl/android/data/LauncherRepository;->config:Lcom/pymcl/core/config/ConfigStore;

    .line 40
    new-instance v2, Lcom/pymcl/core/account/AccountStore;

    iget-object v5, v0, Lcom/pymcl/android/data/LauncherRepository;->paths:Lcom/pymcl/core/config/LauncherPaths;

    sget-object v7, Lcom/pymcl/android/data/KeystoreTokenCipher;->INSTANCE:Lcom/pymcl/android/data/KeystoreTokenCipher;

    check-cast v7, Lcom/pymcl/core/account/TokenCipher;

    invoke-direct {v2, v5, v7}, Lcom/pymcl/core/account/AccountStore;-><init>(Lcom/pymcl/core/config/LauncherPaths;Lcom/pymcl/core/account/TokenCipher;)V

    iput-object v2, v0, Lcom/pymcl/android/data/LauncherRepository;->accounts:Lcom/pymcl/core/account/AccountStore;

    .line 41
    new-instance v2, Lcom/pymcl/core/instance/InstanceManager;

    iget-object v5, v0, Lcom/pymcl/android/data/LauncherRepository;->paths:Lcom/pymcl/core/config/LauncherPaths;

    invoke-direct {v2, v5}, Lcom/pymcl/core/instance/InstanceManager;-><init>(Lcom/pymcl/core/config/LauncherPaths;)V

    iput-object v2, v0, Lcom/pymcl/android/data/LauncherRepository;->instances:Lcom/pymcl/core/instance/InstanceManager;

    .line 42
    new-instance v2, Lcom/pymcl/core/instance/PlaytimeStore;

    iget-object v5, v0, Lcom/pymcl/android/data/LauncherRepository;->paths:Lcom/pymcl/core/config/LauncherPaths;

    invoke-direct {v2, v5}, Lcom/pymcl/core/instance/PlaytimeStore;-><init>(Lcom/pymcl/core/config/LauncherPaths;)V

    iput-object v2, v0, Lcom/pymcl/android/data/LauncherRepository;->playtime:Lcom/pymcl/core/instance/PlaytimeStore;

    .line 43
    new-instance v7, Lcom/pymcl/core/download/Mirrors;

    iget-object v8, v0, Lcom/pymcl/android/data/LauncherRepository;->http:Lcom/pymcl/core/net/Http;

    new-instance v9, Lcom/pymcl/android/data/LauncherRepository$$ExternalSyntheticLambda0;

    invoke-direct {v9, v0}, Lcom/pymcl/android/data/LauncherRepository$$ExternalSyntheticLambda0;-><init>(Lcom/pymcl/android/data/LauncherRepository;)V

    new-instance v10, Lcom/pymcl/android/data/LauncherRepository$$ExternalSyntheticLambda1;

    invoke-direct {v10, v0}, Lcom/pymcl/android/data/LauncherRepository$$ExternalSyntheticLambda1;-><init>(Lcom/pymcl/android/data/LauncherRepository;)V

    const/16 v12, 0x8

    const/4 v13, 0x0

    const/4 v11, 0x0

    invoke-direct/range {v7 .. v13}, Lcom/pymcl/core/download/Mirrors;-><init>(Lcom/pymcl/core/net/Http;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v7, v0, Lcom/pymcl/android/data/LauncherRepository;->mirrors:Lcom/pymcl/core/download/Mirrors;

    .line 44
    new-instance v8, Lcom/pymcl/core/download/DownloadManager;

    iget-object v9, v0, Lcom/pymcl/android/data/LauncherRepository;->http:Lcom/pymcl/core/net/Http;

    iget-object v2, v0, Lcom/pymcl/android/data/LauncherRepository;->config:Lcom/pymcl/core/config/ConfigStore;

    const-string v5, "download_threads"

    invoke-virtual {v2, v5}, Lcom/pymcl/core/config/ConfigStore;->int(Ljava/lang/String;)I

    move-result v10

    iget-object v2, v0, Lcom/pymcl/android/data/LauncherRepository;->config:Lcom/pymcl/core/config/ConfigStore;

    const-string v5, "download_segments"

    invoke-virtual {v2, v5}, Lcom/pymcl/core/config/ConfigStore;->int(Ljava/lang/String;)I

    move-result v11

    iget-object v2, v0, Lcom/pymcl/android/data/LauncherRepository;->config:Lcom/pymcl/core/config/ConfigStore;

    const-string v5, "download_limit_kbps"

    invoke-virtual {v2, v5}, Lcom/pymcl/core/config/ConfigStore;->int(Ljava/lang/String;)I

    move-result v12

    new-instance v14, Lcom/pymcl/android/data/LauncherRepository$$ExternalSyntheticLambda2;

    invoke-direct {v14, v0}, Lcom/pymcl/android/data/LauncherRepository$$ExternalSyntheticLambda2;-><init>(Lcom/pymcl/android/data/LauncherRepository;)V

    const/16 v16, 0x50

    const/16 v17, 0x0

    const/4 v13, 0x0

    const/4 v15, 0x0

    invoke-direct/range {v8 .. v17}, Lcom/pymcl/core/download/DownloadManager;-><init>(Lcom/pymcl/core/net/Http;IIIILkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v8, v0, Lcom/pymcl/android/data/LauncherRepository;->downloads:Lcom/pymcl/core/download/DownloadManager;

    .line 45
    new-instance v9, Lcom/pymcl/core/version/RuleEnv;

    sget-object v2, Landroid/os/Build;->SUPPORTED_ABIS:[Ljava/lang/String;

    const-string v5, "SUPPORTED_ABIS"

    invoke-static {v2, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, [Ljava/lang/Object;

    invoke-static {v2}, Lkotlin/collections/ArraysKt;->firstOrNull([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    const/4 v5, 0x0

    if-eqz v2, :cond_0

    check-cast v2, Ljava/lang/CharSequence;

    const-string v7, "64"

    check-cast v7, Ljava/lang/CharSequence;

    invoke-static {v2, v7, v5, v6, v3}, Lkotlin/text/StringsKt;->contains$default(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v2

    if-ne v2, v4, :cond_0

    goto :goto_0

    :cond_0
    move v4, v5

    :goto_0
    if-eqz v4, :cond_1

    const-string v2, "arm64"

    goto :goto_1

    :cond_1
    const-string v2, "arm"

    :goto_1
    move-object v11, v2

    const/16 v14, 0xc

    const/4 v15, 0x0

    const-string v10, "linux"

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-direct/range {v9 .. v15}, Lcom/pymcl/core/version/RuleEnv;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v9, v0, Lcom/pymcl/android/data/LauncherRepository;->ruleEnv:Lcom/pymcl/core/version/RuleEnv;

    .line 46
    new-instance v10, Lcom/pymcl/core/version/GameInstaller;

    iget-object v11, v0, Lcom/pymcl/android/data/LauncherRepository;->http:Lcom/pymcl/core/net/Http;

    iget-object v12, v0, Lcom/pymcl/android/data/LauncherRepository;->mirrors:Lcom/pymcl/core/download/Mirrors;

    iget-object v13, v0, Lcom/pymcl/android/data/LauncherRepository;->downloads:Lcom/pymcl/core/download/DownloadManager;

    iget-object v2, v0, Lcom/pymcl/android/data/LauncherRepository;->paths:Lcom/pymcl/core/config/LauncherPaths;

    invoke-virtual {v2}, Lcom/pymcl/core/config/LauncherPaths;->getCacheDir()Ljava/io/File;

    move-result-object v14

    iget-object v15, v0, Lcom/pymcl/android/data/LauncherRepository;->ruleEnv:Lcom/pymcl/core/version/RuleEnv;

    invoke-direct/range {v10 .. v15}, Lcom/pymcl/core/version/GameInstaller;-><init>(Lcom/pymcl/core/net/Http;Lcom/pymcl/core/download/Mirrors;Lcom/pymcl/core/download/DownloadManager;Ljava/io/File;Lcom/pymcl/core/version/RuleEnv;)V

    iput-object v10, v0, Lcom/pymcl/android/data/LauncherRepository;->game:Lcom/pymcl/core/version/GameInstaller;

    .line 48
    new-instance v11, Lcom/pymcl/core/loader/LoaderInstaller;

    iget-object v12, v0, Lcom/pymcl/android/data/LauncherRepository;->http:Lcom/pymcl/core/net/Http;

    iget-object v13, v0, Lcom/pymcl/android/data/LauncherRepository;->mirrors:Lcom/pymcl/core/download/Mirrors;

    iget-object v14, v0, Lcom/pymcl/android/data/LauncherRepository;->downloads:Lcom/pymcl/core/download/DownloadManager;

    iget-object v15, v0, Lcom/pymcl/android/data/LauncherRepository;->game:Lcom/pymcl/core/version/GameInstaller;

    iget-object v2, v0, Lcom/pymcl/android/data/LauncherRepository;->paths:Lcom/pymcl/core/config/LauncherPaths;

    invoke-virtual {v2}, Lcom/pymcl/core/config/LauncherPaths;->getCacheDir()Ljava/io/File;

    move-result-object v16

    new-instance v2, Lcom/pymcl/runtime/process/FclJavaProcessRunner;

    iget-object v4, v0, Lcom/pymcl/android/data/LauncherRepository;->ctx:Landroid/content/Context;

    invoke-direct {v2, v4}, Lcom/pymcl/runtime/process/FclJavaProcessRunner;-><init>(Landroid/content/Context;)V

    move-object/from16 v17, v2

    check-cast v17, Lcom/pymcl/core/loader/JavaProcessRunner;

    invoke-direct/range {v11 .. v17}, Lcom/pymcl/core/loader/LoaderInstaller;-><init>(Lcom/pymcl/core/net/Http;Lcom/pymcl/core/download/Mirrors;Lcom/pymcl/core/download/DownloadManager;Lcom/pymcl/core/version/GameInstaller;Ljava/io/File;Lcom/pymcl/core/loader/JavaProcessRunner;)V

    iput-object v11, v0, Lcom/pymcl/android/data/LauncherRepository;->loaders:Lcom/pymcl/core/loader/LoaderInstaller;

    .line 49
    new-instance v12, Lcom/pymcl/core/auth/MicrosoftAuth;

    iget-object v13, v0, Lcom/pymcl/android/data/LauncherRepository;->http:Lcom/pymcl/core/net/Http;

    new-instance v14, Lcom/pymcl/android/data/LauncherRepository$$ExternalSyntheticLambda3;

    invoke-direct {v14, v0}, Lcom/pymcl/android/data/LauncherRepository$$ExternalSyntheticLambda3;-><init>(Lcom/pymcl/android/data/LauncherRepository;)V

    const/16 v16, 0x4

    const/16 v17, 0x0

    const/4 v15, 0x0

    invoke-direct/range {v12 .. v17}, Lcom/pymcl/core/auth/MicrosoftAuth;-><init>(Lcom/pymcl/core/net/Http;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v12, v0, Lcom/pymcl/android/data/LauncherRepository;->microsoft:Lcom/pymcl/core/auth/MicrosoftAuth;

    .line 50
    new-instance v2, Lcom/pymcl/core/auth/YggdrasilAuth;

    iget-object v4, v0, Lcom/pymcl/android/data/LauncherRepository;->http:Lcom/pymcl/core/net/Http;

    invoke-direct {v2, v4, v3, v6, v3}, Lcom/pymcl/core/auth/YggdrasilAuth;-><init>(Lcom/pymcl/core/net/Http;Lcom/pymcl/core/account/AccountStore;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v2, v0, Lcom/pymcl/android/data/LauncherRepository;->yggdrasil:Lcom/pymcl/core/auth/YggdrasilAuth;

    .line 51
    new-instance v2, Lcom/pymcl/core/auth/AgentJars;

    iget-object v3, v0, Lcom/pymcl/android/data/LauncherRepository;->http:Lcom/pymcl/core/net/Http;

    iget-object v4, v0, Lcom/pymcl/android/data/LauncherRepository;->paths:Lcom/pymcl/core/config/LauncherPaths;

    invoke-virtual {v4}, Lcom/pymcl/core/config/LauncherPaths;->getRoot()Ljava/io/File;

    move-result-object v4

    invoke-direct {v2, v3, v4}, Lcom/pymcl/core/auth/AgentJars;-><init>(Lcom/pymcl/core/net/Http;Ljava/io/File;)V

    iput-object v2, v0, Lcom/pymcl/android/data/LauncherRepository;->agents:Lcom/pymcl/core/auth/AgentJars;

    .line 53
    new-instance v2, Lcom/pymcl/android/data/LauncherRepository$$ExternalSyntheticLambda4;

    invoke-direct {v2}, Lcom/pymcl/android/data/LauncherRepository$$ExternalSyntheticLambda4;-><init>()V

    invoke-static {v2}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v2

    iput-object v2, v0, Lcom/pymcl/android/data/LauncherRepository;->skinServer$delegate:Lkotlin/Lazy;

    .line 57
    new-instance v2, Lcom/pymcl/core/mods/ModCatalog;

    iget-object v3, v0, Lcom/pymcl/android/data/LauncherRepository;->http:Lcom/pymcl/core/net/Http;

    iget-object v4, v0, Lcom/pymcl/android/data/LauncherRepository;->mirrors:Lcom/pymcl/core/download/Mirrors;

    new-instance v5, Lcom/pymcl/android/data/LauncherRepository$$ExternalSyntheticLambda5;

    invoke-direct {v5, v0}, Lcom/pymcl/android/data/LauncherRepository$$ExternalSyntheticLambda5;-><init>(Lcom/pymcl/android/data/LauncherRepository;)V

    invoke-direct {v2, v3, v4, v5}, Lcom/pymcl/core/mods/ModCatalog;-><init>(Lcom/pymcl/core/net/Http;Lcom/pymcl/core/download/Mirrors;Lkotlin/jvm/functions/Function0;)V

    iput-object v2, v0, Lcom/pymcl/android/data/LauncherRepository;->catalog:Lcom/pymcl/core/mods/ModCatalog;

    .line 59
    new-instance v2, Lcom/pymcl/core/mods/ModTools;

    iget-object v3, v0, Lcom/pymcl/android/data/LauncherRepository;->catalog:Lcom/pymcl/core/mods/ModCatalog;

    iget-object v4, v0, Lcom/pymcl/android/data/LauncherRepository;->mirrors:Lcom/pymcl/core/download/Mirrors;

    new-instance v5, Ljava/io/File;

    iget-object v6, v0, Lcom/pymcl/android/data/LauncherRepository;->paths:Lcom/pymcl/core/config/LauncherPaths;

    invoke-virtual {v6}, Lcom/pymcl/core/config/LauncherPaths;->getCacheDir()Ljava/io/File;

    move-result-object v6

    const-string v7, "mod_ident.json"

    invoke-direct {v5, v6, v7}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-direct {v2, v3, v4, v5}, Lcom/pymcl/core/mods/ModTools;-><init>(Lcom/pymcl/core/mods/ModCatalog;Lcom/pymcl/core/download/Mirrors;Ljava/io/File;)V

    iput-object v2, v0, Lcom/pymcl/android/data/LauncherRepository;->modTools:Lcom/pymcl/core/mods/ModTools;

    .line 27
    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/pymcl/android/data/LauncherRepository;-><init>(Landroid/content/Context;)V

    return-void
.end method

.method public static final synthetic access$getInst$cp()Lcom/pymcl/android/data/LauncherRepository;
    .locals 1

    .line 27
    sget-object v0, Lcom/pymcl/android/data/LauncherRepository;->inst:Lcom/pymcl/android/data/LauncherRepository;

    return-object v0
.end method

.method public static final synthetic access$javaAvailable(Lcom/pymcl/android/data/LauncherRepository;I)Z
    .locals 1
    .param p0, "$this"    # Lcom/pymcl/android/data/LauncherRepository;
    .param p1, "major"    # I

    .line 27
    invoke-direct {p0, p1}, Lcom/pymcl/android/data/LauncherRepository;->javaAvailable(I)Z

    move-result v0

    return v0
.end method

.method public static final synthetic access$setInst$cp(Lcom/pymcl/android/data/LauncherRepository;)V
    .locals 0
    .param p0, "<set-?>"    # Lcom/pymcl/android/data/LauncherRepository;

    .line 27
    sput-object p0, Lcom/pymcl/android/data/LauncherRepository;->inst:Lcom/pymcl/android/data/LauncherRepository;

    return-void
.end method

.method public static synthetic addOffline$default(Lcom/pymcl/android/data/LauncherRepository;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/pymcl/core/account/Account;
    .locals 0

    .line 106
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const-string p2, "default"

    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/pymcl/android/data/LauncherRepository;->addOffline(Ljava/lang/String;Ljava/lang/String;)Lcom/pymcl/core/account/Account;

    move-result-object p0

    return-object p0
.end method

.method private static final analyzeCrash$rd(Ljava/io/File;)Ljava/lang/String;
    .locals 2
    .param p0, "f"    # Ljava/io/File;

    .line 200
    invoke-virtual {p0}, Ljava/io/File;->isFile()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-static {p0, v1, v0, v1}, Lkotlin/io/FilesKt;->readText$default(Ljava/io/File;Ljava/nio/charset/Charset;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const v1, 0x1e8480

    invoke-static {v0, v1}, Lkotlin/text/StringsKt;->takeLast(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const-string v0, ""

    :goto_0
    return-object v0
.end method

.method public static synthetic buildLaunchRequest$default(Lcom/pymcl/android/data/LauncherRepository;Ljava/lang/String;Lcom/pymcl/core/instance/Instance;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 150
    and-int/lit8 p8, p7, 0x2

    if-eqz p8, :cond_0

    invoke-virtual {p0}, Lcom/pymcl/android/data/LauncherRepository;->currentInstance()Lcom/pymcl/core/instance/Instance;

    move-result-object p2

    :cond_0
    move-object v2, p2

    and-int/lit8 p2, p7, 0x4

    const/4 p8, 0x0

    if-eqz p2, :cond_1

    move-object v3, p8

    goto :goto_0

    :cond_1
    move-object v3, p3

    :goto_0
    and-int/lit8 p2, p7, 0x8

    if-eqz p2, :cond_2

    move-object v4, p8

    goto :goto_1

    :cond_2
    move-object v4, p4

    :goto_1
    and-int/lit8 p2, p7, 0x10

    if-eqz p2, :cond_3

    .line 151
    new-instance p5, Lcom/pymcl/android/data/LauncherRepository$$ExternalSyntheticLambda8;

    invoke-direct {p5}, Lcom/pymcl/android/data/LauncherRepository$$ExternalSyntheticLambda8;-><init>()V

    move-object v5, p5

    goto :goto_2

    .line 150
    :cond_3
    move-object v5, p5

    :goto_2
    move-object v0, p0

    move-object v1, p1

    move-object v6, p6

    invoke-virtual/range {v0 .. v6}, Lcom/pymcl/android/data/LauncherRepository;->buildLaunchRequest(Ljava/lang/String;Lcom/pymcl/core/instance/Instance;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private static final buildLaunchRequest$lambda$0(Ljava/lang/String;)Lkotlin/Unit;
    .locals 1
    .param p0, "it"    # Ljava/lang/String;

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 151
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method private static final catalog$lambda$0(Lcom/pymcl/android/data/LauncherRepository;)Ljava/lang/String;
    .locals 1
    .param p0, "this$0"    # Lcom/pymcl/android/data/LauncherRepository;

    .line 57
    iget-object v0, p0, Lcom/pymcl/android/data/LauncherRepository;->config:Lcom/pymcl/core/config/ConfigStore;

    invoke-virtual {v0}, Lcom/pymcl/core/config/ConfigStore;->getCurseforgeKey()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private static final downloads$lambda$0(Lcom/pymcl/android/data/LauncherRepository;)Ljava/lang/String;
    .locals 1
    .param p0, "this$0"    # Lcom/pymcl/android/data/LauncherRepository;

    .line 44
    iget-object v0, p0, Lcom/pymcl/android/data/LauncherRepository;->config:Lcom/pymcl/core/config/ConfigStore;

    invoke-virtual {v0}, Lcom/pymcl/core/config/ConfigStore;->getCurseforgeKey()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic importModpack$default(Lcom/pymcl/android/data/LauncherRepository;Ljava/io/File;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 65
    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_0

    new-instance p2, Lcom/pymcl/android/data/LauncherRepository$$ExternalSyntheticLambda6;

    invoke-direct {p2}, Lcom/pymcl/android/data/LauncherRepository$$ExternalSyntheticLambda6;-><init>()V

    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Lcom/pymcl/android/data/LauncherRepository;->importModpack(Ljava/io/File;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private static final importModpack$lambda$0(Ljava/lang/Float;Ljava/lang/String;)Lkotlin/Unit;
    .locals 0

    const-string p0, "<unused var>"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 65
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic installLoader$default(Lcom/pymcl/android/data/LauncherRepository;Lcom/pymcl/core/loader/LoaderType;Ljava/lang/String;Ljava/lang/String;Lcom/pymcl/core/instance/Instance;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 95
    and-int/lit8 p6, p6, 0x8

    if-eqz p6, :cond_0

    invoke-virtual {p0}, Lcom/pymcl/android/data/LauncherRepository;->currentInstance()Lcom/pymcl/core/instance/Instance;

    move-result-object p4

    :cond_0
    move-object v4, p4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v5, p5

    invoke-virtual/range {v0 .. v5}, Lcom/pymcl/android/data/LauncherRepository;->installLoader(Lcom/pymcl/core/loader/LoaderType;Ljava/lang/String;Ljava/lang/String;Lcom/pymcl/core/instance/Instance;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic installVanilla$default(Lcom/pymcl/android/data/LauncherRepository;Ljava/lang/String;Lcom/pymcl/core/instance/Instance;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 93
    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_0

    invoke-virtual {p0}, Lcom/pymcl/android/data/LauncherRepository;->currentInstance()Lcom/pymcl/core/instance/Instance;

    move-result-object p2

    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Lcom/pymcl/android/data/LauncherRepository;->installVanilla(Ljava/lang/String;Lcom/pymcl/core/instance/Instance;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final javaAvailable(I)Z
    .locals 4
    .param p1, "major"    # I

    .line 179
    :try_start_0
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object v0, p0

    check-cast v0, Lcom/pymcl/android/data/LauncherRepository;

    .line 207
    .local v0, "$this$javaAvailable_u24lambda_u240\\1":Lcom/pymcl/android/data/LauncherRepository;
    const/4 v1, 0x0

    .line 179
    .local v1, "$i$a$-runCatching-LauncherRepository$javaAvailable$1\\1\\179\\0":I
    new-instance v2, Lcom/pymcl/runtime/RuntimeInstaller;

    iget-object v3, v0, Lcom/pymcl/android/data/LauncherRepository;->ctx:Landroid/content/Context;

    invoke-direct {v2, v3}, Lcom/pymcl/runtime/RuntimeInstaller;-><init>(Landroid/content/Context;)V

    invoke-virtual {v2, p1}, Lcom/pymcl/runtime/RuntimeInstaller;->isJavaInstalled(I)Z

    move-result v2

    .end local v0    # "$this$javaAvailable_u24lambda_u240\\1":Lcom/pymcl/android/data/LauncherRepository;
    .end local v1    # "$i$a$-runCatching-LauncherRepository$javaAvailable$1\\1\\179\\0":I
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    :goto_0
    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-static {v0}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    move-object v0, v2

    :cond_0
    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_1

    .line 180
    sget-object v0, Lcom/pymcl/runtime/RuntimeLayout;->INSTANCE:Lcom/pymcl/runtime/RuntimeLayout;

    invoke-virtual {v0}, Lcom/pymcl/runtime/RuntimeLayout;->getBUNDLED_JRE()Ljava/util/List;

    move-result-object v0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    sget-object v0, Lcom/pymcl/runtime/JavaDownloads;->INSTANCE:Lcom/pymcl/runtime/JavaDownloads;

    invoke-virtual {v0, p1}, Lcom/pymcl/runtime/JavaDownloads;->pinnedVersion(I)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    :cond_1
    const/4 v1, 0x1

    :cond_2
    return v1
.end method

.method public static synthetic loginMicrosoft$default(Lcom/pymcl/android/data/LauncherRepository;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 107
    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_0

    new-instance p2, Lcom/pymcl/android/data/LauncherRepository$$ExternalSyntheticLambda7;

    invoke-direct {p2}, Lcom/pymcl/android/data/LauncherRepository$$ExternalSyntheticLambda7;-><init>()V

    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Lcom/pymcl/android/data/LauncherRepository;->loginMicrosoft(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private static final loginMicrosoft$lambda$0()Z
    .locals 1

    .line 107
    const/4 v0, 0x0

    return v0
.end method

.method private static final microsoft$lambda$0(Lcom/pymcl/android/data/LauncherRepository;)Ljava/lang/String;
    .locals 1
    .param p0, "this$0"    # Lcom/pymcl/android/data/LauncherRepository;

    .line 49
    iget-object v0, p0, Lcom/pymcl/android/data/LauncherRepository;->config:Lcom/pymcl/core/config/ConfigStore;

    invoke-virtual {v0}, Lcom/pymcl/core/config/ConfigStore;->getMicrosoftClientId()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private static final mirrors$lambda$0(Lcom/pymcl/android/data/LauncherRepository;)Ljava/lang/String;
    .locals 2
    .param p0, "this$0"    # Lcom/pymcl/android/data/LauncherRepository;

    .line 43
    iget-object v0, p0, Lcom/pymcl/android/data/LauncherRepository;->config:Lcom/pymcl/core/config/ConfigStore;

    const-string v1, "download_source"

    invoke-virtual {v0, v1}, Lcom/pymcl/core/config/ConfigStore;->string(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private static final mirrors$lambda$1(Lcom/pymcl/android/data/LauncherRepository;)Ljava/lang/String;
    .locals 2
    .param p0, "this$0"    # Lcom/pymcl/android/data/LauncherRepository;

    .line 43
    iget-object v0, p0, Lcom/pymcl/android/data/LauncherRepository;->config:Lcom/pymcl/core/config/ConfigStore;

    const-string v1, "community_source"

    invoke-virtual {v0, v1}, Lcom/pymcl/core/config/ConfigStore;->string(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private static final skinServer_delegate$lambda$0()Lcom/pymcl/core/auth/SkinServer;
    .locals 3

    .line 53
    new-instance v0, Lcom/pymcl/core/auth/SkinServer;

    const/4 v1, 0x0

    const/4 v2, 0x3

    invoke-direct {v0, v1, v1, v2, v1}, Lcom/pymcl/core/auth/SkinServer;-><init>(Ljava/security/KeyPair;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method public static synthetic toFclRequest$default(Lcom/pymcl/android/data/LauncherRepository;Lcom/pymcl/core/version/ResolvedVersion;Lcom/pymcl/core/launch/LaunchSpec;Ljava/io/File;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/pymcl/runtime/GameLaunchRequest;
    .locals 6

    .line 183
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_0

    const/4 p5, 0x0

    :cond_0
    move-object v5, p5

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    invoke-virtual/range {v0 .. v5}, Lcom/pymcl/android/data/LauncherRepository;->toFclRequest(Lcom/pymcl/core/version/ResolvedVersion;Lcom/pymcl/core/launch/LaunchSpec;Ljava/io/File;Ljava/lang/String;Ljava/lang/String;)Lcom/pymcl/runtime/GameLaunchRequest;

    move-result-object p0

    return-object p0
.end method

.method private static final toFclRequest$verOf(Ljava/util/List;Ljava/lang/String;)Ljava/lang/String;
    .locals 13
    .param p0, "libs"    # Ljava/util/List;
    .param p1, "prefix"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            ")",
            "Ljava/lang/String;"
        }
    .end annotation

    .line 185
    move-object v0, p0

    check-cast v0, Ljava/lang/Iterable;

    .local v0, "$this$firstOrNull\\1":Ljava/lang/Iterable;
    const/4 v1, 0x0

    .line 255
    .local v1, "$i$f$firstOrNull\\1\\185":I
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    const/4 v4, 0x2

    const/4 v5, 0x0

    const/4 v6, 0x0

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    .local v3, "element\\1":Ljava/lang/Object;
    move-object v7, v3

    check-cast v7, Ljava/lang/String;

    .local v7, "it\\2":Ljava/lang/String;
    const/4 v8, 0x0

    .line 185
    .local v8, "$i$a$-firstOrNull-LauncherRepository$toFclRequest$verOf$1\\2\\255\\0":I
    invoke-static {v7, p1, v5, v4, v6}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v7

    .line 255
    .end local v7    # "it\\2":Ljava/lang/String;
    .end local v8    # "$i$a$-firstOrNull-LauncherRepository$toFclRequest$verOf$1\\2\\255\\0":I
    if-eqz v7, :cond_0

    goto :goto_0

    .line 256
    .end local v3    # "element\\1":Ljava/lang/Object;
    :cond_1
    move-object v3, v6

    .line 185
    .end local v0    # "$this$firstOrNull\\1":Ljava/lang/Iterable;
    .end local v1    # "$i$f$firstOrNull\\1\\185":I
    :goto_0
    check-cast v3, Ljava/lang/String;

    if-eqz v3, :cond_2

    move-object v7, v3

    check-cast v7, Ljava/lang/CharSequence;

    const/4 v0, 0x1

    new-array v8, v0, [C

    const/16 v0, 0x3a

    aput-char v0, v8, v5

    const/4 v11, 0x6

    const/4 v12, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-static/range {v7 .. v12}, Lkotlin/text/StringsKt;->split$default(Ljava/lang/CharSequence;[CZIILjava/lang/Object;)Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-static {v0, v4}, Lkotlin/collections/CollectionsKt;->getOrNull(Ljava/util/List;I)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Ljava/lang/String;

    :cond_2
    return-object v6
.end method

.method public static synthetic versionManifest$default(Lcom/pymcl/android/data/LauncherRepository;ZLkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 92
    and-int/lit8 p3, p3, 0x1

    if-eqz p3, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/pymcl/android/data/LauncherRepository;->versionManifest(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final addOffline(Ljava/lang/String;Ljava/lang/String;)Lcom/pymcl/core/account/Account;
    .locals 7
    .param p1, "name"    # Ljava/lang/String;
    .param p2, "skin"    # Ljava/lang/String;

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "skin"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 106
    sget-object v0, Lcom/pymcl/core/account/Offline;->INSTANCE:Lcom/pymcl/core/account/Offline;

    invoke-virtual {v0, p1, p2}, Lcom/pymcl/core/account/Offline;->create(Ljava/lang/String;Ljava/lang/String;)Lcom/pymcl/core/account/Account;

    move-result-object v0

    move-object v1, v0

    .line 207
    .local v1, "it\\1":Lcom/pymcl/core/account/Account;
    const/4 v2, 0x0

    .line 106
    .local v2, "$i$a$-also-LauncherRepository$addOffline$1\\1\\106\\0":I
    iget-object v3, p0, Lcom/pymcl/android/data/LauncherRepository;->accounts:Lcom/pymcl/core/account/AccountStore;

    const/4 v4, 0x2

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static {v3, v1, v6, v4, v5}, Lcom/pymcl/core/account/AccountStore;->upsert$default(Lcom/pymcl/core/account/AccountStore;Lcom/pymcl/core/account/Account;ZILjava/lang/Object;)V

    .end local v1    # "it\\1":Lcom/pymcl/core/account/Account;
    .end local v2    # "$i$a$-also-LauncherRepository$addOffline$1\\1\\106\\0":I
    return-object v0
.end method

.method public final analyzeCrash(Ljava/io/File;ILjava/lang/String;)Ljava/util/List;
    .locals 17
    .param p1, "gameDir"    # Ljava/io/File;
    .param p2, "exitCode"    # I
    .param p3, "output"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/io/File;",
            "I",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Lcom/pymcl/core/crash/CrashReason;",
            ">;"
        }
    .end annotation

    move-object/from16 v0, p1

    const-string v1, "gameDir"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "output"

    move-object/from16 v4, p3

    invoke-static {v4, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 201
    new-instance v1, Ljava/io/File;

    const-string v2, "crash-reports"

    invoke-direct {v1, v0, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    if-eqz v1, :cond_5

    .local v1, "$this$maxByOrNull\\1":[Ljava/lang/Object;
    const/4 v5, 0x0

    .line 224
    .local v5, "$i$f$maxByOrNull\\1\\201":I
    array-length v6, v1

    if-nez v6, :cond_0

    const/4 v6, 0x1

    goto :goto_0

    :cond_0
    move v6, v2

    :goto_0
    if-eqz v6, :cond_1

    move-object v6, v3

    goto :goto_2

    .line 225
    :cond_1
    aget-object v6, v1, v2

    .line 226
    .local v6, "maxElem\\1":Ljava/lang/Object;
    invoke-static {v1}, Lkotlin/collections/ArraysKt;->getLastIndex([Ljava/lang/Object;)I

    move-result v7

    .line 227
    .local v7, "lastIndex\\1":I
    if-nez v7, :cond_2

    goto :goto_2

    .line 228
    :cond_2
    move-object v8, v6

    .local v8, "it\\2":Ljava/io/File;
    const/4 v9, 0x0

    .line 201
    .local v9, "$i$a$-maxByOrNull-LauncherRepository$analyzeCrash$cr$1\\2\\228\\0":I
    invoke-virtual {v8}, Ljava/io/File;->lastModified()J

    move-result-wide v8

    .line 228
    .end local v8    # "it\\2":Ljava/io/File;
    .end local v9    # "$i$a$-maxByOrNull-LauncherRepository$analyzeCrash$cr$1\\2\\228\\0":I
    nop

    .line 229
    .local v8, "maxValue\\1":J
    const/4 v10, 0x1

    .local v10, "i\\1":I
    if-gt v10, v7, :cond_4

    .line 230
    :goto_1
    aget-object v11, v1, v10

    .line 231
    .local v11, "e\\1":Ljava/lang/Object;
    move-object v12, v11

    .local v12, "it\\3":Ljava/io/File;
    const/4 v13, 0x0

    .line 201
    .local v13, "$i$a$-maxByOrNull-LauncherRepository$analyzeCrash$cr$1\\3\\231\\0":I
    invoke-virtual {v12}, Ljava/io/File;->lastModified()J

    move-result-wide v12

    .line 231
    .end local v12    # "it\\3":Ljava/io/File;
    .end local v13    # "$i$a$-maxByOrNull-LauncherRepository$analyzeCrash$cr$1\\3\\231\\0":I
    nop

    .line 232
    .local v12, "v\\1":J
    cmp-long v14, v8, v12

    if-gez v14, :cond_3

    .line 233
    move-object v6, v11

    .line 234
    move-wide v8, v12

    .line 229
    .end local v11    # "e\\1":Ljava/lang/Object;
    .end local v12    # "v\\1":J
    :cond_3
    if-eq v10, v7, :cond_4

    add-int/lit8 v10, v10, 0x1

    goto :goto_1

    .line 237
    .end local v10    # "i\\1":I
    :cond_4
    nop

    .end local v1    # "$this$maxByOrNull\\1":[Ljava/lang/Object;
    .end local v5    # "$i$f$maxByOrNull\\1\\201":I
    .end local v6    # "maxElem\\1":Ljava/lang/Object;
    .end local v7    # "lastIndex\\1":I
    .end local v8    # "maxValue\\1":J
    goto :goto_2

    .line 201
    :cond_5
    move-object v6, v3

    :goto_2
    move-object v1, v6

    .line 202
    .local v1, "cr":Ljava/io/File;
    invoke-virtual {v0}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v5

    if-eqz v5, :cond_c

    .local v5, "$this$filter\\4":[Ljava/lang/Object;
    const/4 v6, 0x0

    .line 238
    .local v6, "$i$f$filter\\4\\202":I
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    check-cast v7, Ljava/util/Collection;

    .local v7, "destination\\5":Ljava/util/Collection;
    move-object v8, v5

    .local v8, "$this$filterTo\\5":[Ljava/lang/Object;
    const/4 v9, 0x0

    .line 239
    .local v9, "$i$f$filterTo\\5\\238":I
    array-length v10, v8

    move v11, v2

    :goto_3
    if-ge v11, v10, :cond_7

    aget-object v12, v8, v11

    .local v12, "element\\5":Ljava/lang/Object;
    move-object v13, v12

    .local v13, "it\\6":Ljava/io/File;
    const/4 v14, 0x0

    .line 202
    .local v14, "$i$a$-filter-LauncherRepository$analyzeCrash$hs$1\\6\\239\\0":I
    invoke-virtual {v13}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v15

    const-string v2, "getName(...)"

    invoke-static {v15, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "hs_err_pid"

    move-object/from16 v16, v1

    .end local v1    # "cr":Ljava/io/File;
    .local v16, "cr":Ljava/io/File;
    const/4 v1, 0x2

    const/4 v4, 0x0

    invoke-static {v15, v2, v4, v1, v3}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v1

    .line 239
    .end local v13    # "it\\6":Ljava/io/File;
    .end local v14    # "$i$a$-filter-LauncherRepository$analyzeCrash$hs$1\\6\\239\\0":I
    if-eqz v1, :cond_6

    invoke-interface {v7, v12}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .end local v12    # "element\\5":Ljava/lang/Object;
    :cond_6
    add-int/lit8 v11, v11, 0x1

    move v2, v4

    move-object/from16 v1, v16

    move-object/from16 v4, p3

    goto :goto_3

    .line 240
    .end local v16    # "cr":Ljava/io/File;
    .restart local v1    # "cr":Ljava/io/File;
    :cond_7
    move-object/from16 v16, v1

    .end local v1    # "cr":Ljava/io/File;
    .end local v7    # "destination\\5":Ljava/util/Collection;
    .end local v8    # "$this$filterTo\\5":[Ljava/lang/Object;
    .end local v9    # "$i$f$filterTo\\5\\238":I
    .restart local v16    # "cr":Ljava/io/File;
    move-object v1, v7

    check-cast v1, Ljava/util/List;

    .line 238
    nop

    .line 202
    .end local v5    # "$this$filter\\4":[Ljava/lang/Object;
    .end local v6    # "$i$f$filter\\4\\202":I
    check-cast v1, Ljava/lang/Iterable;

    .local v1, "$this$maxByOrNull\\7":Ljava/lang/Iterable;
    const/4 v2, 0x0

    .line 241
    .local v2, "$i$f$maxByOrNull\\7\\202":I
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    .line 242
    .local v4, "iterator\\7":Ljava/util/Iterator;
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-nez v5, :cond_8

    goto :goto_4

    .line 243
    :cond_8
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    .line 244
    .local v3, "maxElem\\7":Ljava/lang/Object;
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-nez v5, :cond_9

    goto :goto_4

    .line 245
    :cond_9
    move-object v5, v3

    check-cast v5, Ljava/io/File;

    .local v5, "it\\8":Ljava/io/File;
    const/4 v6, 0x0

    .line 202
    .local v6, "$i$a$-maxByOrNull-LauncherRepository$analyzeCrash$hs$2\\8\\245\\0":I
    invoke-virtual {v5}, Ljava/io/File;->lastModified()J

    move-result-wide v5

    .line 245
    .end local v5    # "it\\8":Ljava/io/File;
    .end local v6    # "$i$a$-maxByOrNull-LauncherRepository$analyzeCrash$hs$2\\8\\245\\0":I
    nop

    .line 247
    .local v5, "maxValue\\7":J
    :cond_a
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    .line 248
    .local v7, "e\\7":Ljava/lang/Object;
    move-object v8, v7

    check-cast v8, Ljava/io/File;

    .local v8, "it\\9":Ljava/io/File;
    const/4 v9, 0x0

    .line 202
    .local v9, "$i$a$-maxByOrNull-LauncherRepository$analyzeCrash$hs$2\\9\\248\\0":I
    invoke-virtual {v8}, Ljava/io/File;->lastModified()J

    move-result-wide v8

    .line 248
    .end local v8    # "it\\9":Ljava/io/File;
    .end local v9    # "$i$a$-maxByOrNull-LauncherRepository$analyzeCrash$hs$2\\9\\248\\0":I
    nop

    .line 249
    .local v8, "v\\7":J
    cmp-long v10, v5, v8

    if-gez v10, :cond_b

    .line 250
    move-object v3, v7

    .line 251
    move-wide v5, v8

    .line 253
    .end local v7    # "e\\7":Ljava/lang/Object;
    .end local v8    # "v\\7":J
    :cond_b
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-nez v7, :cond_a

    .line 254
    nop

    .end local v1    # "$this$maxByOrNull\\7":Ljava/lang/Iterable;
    .end local v2    # "$i$f$maxByOrNull\\7\\202":I
    .end local v3    # "maxElem\\7":Ljava/lang/Object;
    .end local v4    # "iterator\\7":Ljava/util/Iterator;
    .end local v5    # "maxValue\\7":J
    :goto_4
    check-cast v3, Ljava/io/File;

    goto :goto_5

    .line 202
    .end local v16    # "cr":Ljava/io/File;
    .local v1, "cr":Ljava/io/File;
    :cond_c
    move-object/from16 v16, v1

    .end local v1    # "cr":Ljava/io/File;
    .restart local v16    # "cr":Ljava/io/File;
    :goto_5
    move-object v1, v3

    .line 203
    .local v1, "hs":Ljava/io/File;
    sget-object v9, Lcom/pymcl/core/crash/CrashAnalyzer;->INSTANCE:Lcom/pymcl/core/crash/CrashAnalyzer;

    new-instance v2, Ljava/io/File;

    const-string v3, "logs/latest.log"

    invoke-direct {v2, v0, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-static {v2}, Lcom/pymcl/android/data/LauncherRepository;->analyzeCrash$rd(Ljava/io/File;)Ljava/lang/String;

    move-result-object v5

    new-instance v2, Ljava/io/File;

    const-string v3, "logs/debug.log"

    invoke-direct {v2, v0, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-static {v2}, Lcom/pymcl/android/data/LauncherRepository;->analyzeCrash$rd(Ljava/io/File;)Ljava/lang/String;

    move-result-object v6

    const-string v2, ""

    if-eqz v16, :cond_e

    .line 207
    move-object/from16 v3, v16

    .local v3, "p0\\10":Ljava/io/File;
    const/4 v4, 0x0

    .line 203
    .local v4, "$i$a$-let-LauncherRepository$analyzeCrash$1\\10\\203\\0":I
    invoke-static {v3}, Lcom/pymcl/android/data/LauncherRepository;->analyzeCrash$rd(Ljava/io/File;)Ljava/lang/String;

    move-result-object v3

    .end local v3    # "p0\\10":Ljava/io/File;
    .end local v4    # "$i$a$-let-LauncherRepository$analyzeCrash$1\\10\\203\\0":I
    if-nez v3, :cond_d

    goto :goto_6

    :cond_d
    move-object v7, v3

    goto :goto_7

    :cond_e
    :goto_6
    move-object v7, v2

    :goto_7
    if-eqz v1, :cond_10

    .line 207
    move-object v3, v1

    .local v3, "p0\\11":Ljava/io/File;
    const/4 v4, 0x0

    .line 203
    .local v4, "$i$a$-let-LauncherRepository$analyzeCrash$2\\11\\203\\0":I
    invoke-static {v3}, Lcom/pymcl/android/data/LauncherRepository;->analyzeCrash$rd(Ljava/io/File;)Ljava/lang/String;

    move-result-object v3

    .end local v3    # "p0\\11":Ljava/io/File;
    .end local v4    # "$i$a$-let-LauncherRepository$analyzeCrash$2\\11\\203\\0":I
    if-nez v3, :cond_f

    goto :goto_8

    :cond_f
    move-object v8, v3

    goto :goto_9

    :cond_10
    :goto_8
    move-object v8, v2

    :goto_9
    new-instance v2, Lcom/pymcl/core/crash/CrashInput;

    move/from16 v3, p2

    move-object/from16 v4, p3

    invoke-direct/range {v2 .. v8}, Lcom/pymcl/core/crash/CrashInput;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v9, v2}, Lcom/pymcl/core/crash/CrashAnalyzer;->analyze(Lcom/pymcl/core/crash/CrashInput;)Ljava/util/List;

    move-result-object v2

    return-object v2
.end method

.method public final applyDownloadSettings()V
    .locals 3

    .line 85
    iget-object v0, p0, Lcom/pymcl/android/data/LauncherRepository;->downloads:Lcom/pymcl/core/download/DownloadManager;

    iget-object v1, p0, Lcom/pymcl/android/data/LauncherRepository;->config:Lcom/pymcl/core/config/ConfigStore;

    const-string v2, "download_threads"

    invoke-virtual {v1, v2}, Lcom/pymcl/core/config/ConfigStore;->int(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/pymcl/core/download/DownloadManager;->setThreads(I)V

    iget-object v0, p0, Lcom/pymcl/android/data/LauncherRepository;->downloads:Lcom/pymcl/core/download/DownloadManager;

    iget-object v1, p0, Lcom/pymcl/android/data/LauncherRepository;->config:Lcom/pymcl/core/config/ConfigStore;

    const-string v2, "download_segments"

    invoke-virtual {v1, v2}, Lcom/pymcl/core/config/ConfigStore;->int(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/pymcl/core/download/DownloadManager;->setSegments(I)V

    iget-object v0, p0, Lcom/pymcl/android/data/LauncherRepository;->downloads:Lcom/pymcl/core/download/DownloadManager;

    invoke-virtual {v0}, Lcom/pymcl/core/download/DownloadManager;->getLimiter()Lcom/pymcl/core/download/RateLimiter;

    move-result-object v0

    iget-object v1, p0, Lcom/pymcl/android/data/LauncherRepository;->config:Lcom/pymcl/core/config/ConfigStore;

    const-string v2, "download_limit_kbps"

    invoke-virtual {v1, v2}, Lcom/pymcl/core/config/ConfigStore;->int(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/pymcl/core/download/RateLimiter;->setKbps(I)V

    iget-object v0, p0, Lcom/pymcl/android/data/LauncherRepository;->mirrors:Lcom/pymcl/core/download/Mirrors;

    invoke-virtual {v0}, Lcom/pymcl/core/download/Mirrors;->invalidateProbe()V

    return-void
.end method

.method public final buildLaunchRequest(Ljava/lang/String;Lcom/pymcl/core/instance/Instance;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 9
    .param p1, "versionId"    # Ljava/lang/String;
    .param p2, "inst"    # Lcom/pymcl/core/instance/Instance;
    .param p3, "rendererId"    # Ljava/lang/String;
    .param p4, "server"    # Ljava/lang/String;
    .param p5, "onNote"    # Lkotlin/jvm/functions/Function1;
    .param p6, "$completion"    # Lkotlin/coroutines/Continuation;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/pymcl/core/instance/Instance;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/pymcl/runtime/GameLaunchRequest;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 151
    invoke-static {}, Lkotlinx/coroutines/Dispatchers;->getIO()Lkotlinx/coroutines/CoroutineDispatcher;

    move-result-object v0

    check-cast v0, Lkotlin/coroutines/CoroutineContext;

    new-instance v1, Lcom/pymcl/android/data/LauncherRepository$buildLaunchRequest$3;

    const/4 v8, 0x0

    move-object v2, p0

    move-object v4, p1

    move-object v3, p2

    move-object v5, p3

    move-object v6, p4

    move-object v7, p5

    .end local p1    # "versionId":Ljava/lang/String;
    .end local p2    # "inst":Lcom/pymcl/core/instance/Instance;
    .end local p3    # "rendererId":Ljava/lang/String;
    .end local p4    # "server":Ljava/lang/String;
    .end local p5    # "onNote":Lkotlin/jvm/functions/Function1;
    .local v3, "inst":Lcom/pymcl/core/instance/Instance;
    .local v4, "versionId":Ljava/lang/String;
    .local v5, "rendererId":Ljava/lang/String;
    .local v6, "server":Ljava/lang/String;
    .local v7, "onNote":Lkotlin/jvm/functions/Function1;
    invoke-direct/range {v1 .. v8}, Lcom/pymcl/android/data/LauncherRepository$buildLaunchRequest$3;-><init>(Lcom/pymcl/android/data/LauncherRepository;Lcom/pymcl/core/instance/Instance;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)V

    check-cast v1, Lkotlin/jvm/functions/Function2;

    invoke-static {v0, v1, p6}, Lkotlinx/coroutines/BuildersKt;->withContext(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    .line 175
    return-object p1
.end method

.method public final currentInstance()Lcom/pymcl/core/instance/Instance;
    .locals 3

    .line 90
    iget-object v0, p0, Lcom/pymcl/android/data/LauncherRepository;->config:Lcom/pymcl/core/config/ConfigStore;

    const-string v1, "default_instance"

    invoke-virtual {v0, v1}, Lcom/pymcl/core/config/ConfigStore;->string(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 207
    .local v0, "it\\1":Ljava/lang/String;
    const/4 v1, 0x0

    .line 90
    .local v1, "$i$a$-let-LauncherRepository$currentInstance$1\\1\\90\\0":I
    move-object v2, v0

    check-cast v2, Ljava/lang/CharSequence;

    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    move-result v2

    if-nez v2, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    if-eqz v2, :cond_1

    iget-object v2, p0, Lcom/pymcl/android/data/LauncherRepository;->instances:Lcom/pymcl/core/instance/InstanceManager;

    invoke-virtual {v2}, Lcom/pymcl/core/instance/InstanceManager;->ensureRoot()Lcom/pymcl/core/instance/Instance;

    move-result-object v2

    goto :goto_1

    :cond_1
    iget-object v2, p0, Lcom/pymcl/android/data/LauncherRepository;->instances:Lcom/pymcl/core/instance/InstanceManager;

    invoke-virtual {v2, v0}, Lcom/pymcl/core/instance/InstanceManager;->get(Ljava/lang/String;)Lcom/pymcl/core/instance/Instance;

    move-result-object v2

    .end local v0    # "it\\1":Ljava/lang/String;
    .end local v1    # "$i$a$-let-LauncherRepository$currentInstance$1\\1\\90\\0":I
    :goto_1
    return-object v2
.end method

.method public final dirsFor(Lcom/pymcl/core/instance/Instance;)Lcom/pymcl/core/version/GameDirs;
    .locals 6
    .param p1, "i"    # Lcom/pymcl/core/instance/Instance;

    const-string v0, "i"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 87
    new-instance v0, Lcom/pymcl/core/version/GameDirs;

    invoke-virtual {p1}, Lcom/pymcl/core/instance/Instance;->getDir()Ljava/io/File;

    move-result-object v1

    .line 88
    iget-object v2, p0, Lcom/pymcl/android/data/LauncherRepository;->config:Lcom/pymcl/core/config/ConfigStore;

    const-string v3, "shared_libraries"

    invoke-virtual {v2, v3}, Lcom/pymcl/core/config/ConfigStore;->bool(Ljava/lang/String;)Z

    move-result v2

    const-string v3, "libraries"

    if-eqz v2, :cond_0

    new-instance v2, Ljava/io/File;

    iget-object v4, p0, Lcom/pymcl/android/data/LauncherRepository;->paths:Lcom/pymcl/core/config/LauncherPaths;

    invoke-virtual {v4}, Lcom/pymcl/core/config/LauncherPaths;->getSharedDir()Ljava/io/File;

    move-result-object v4

    invoke-direct {v2, v4, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    new-instance v2, Ljava/io/File;

    invoke-virtual {p1}, Lcom/pymcl/core/instance/Instance;->getDir()Ljava/io/File;

    move-result-object v4

    invoke-direct {v2, v4, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 89
    :goto_0
    iget-object v3, p0, Lcom/pymcl/android/data/LauncherRepository;->config:Lcom/pymcl/core/config/ConfigStore;

    const-string v4, "shared_assets"

    invoke-virtual {v3, v4}, Lcom/pymcl/core/config/ConfigStore;->bool(Ljava/lang/String;)Z

    move-result v3

    const-string v4, "assets"

    if-eqz v3, :cond_1

    new-instance v3, Ljava/io/File;

    iget-object v5, p0, Lcom/pymcl/android/data/LauncherRepository;->paths:Lcom/pymcl/core/config/LauncherPaths;

    invoke-virtual {v5}, Lcom/pymcl/core/config/LauncherPaths;->getSharedDir()Ljava/io/File;

    move-result-object v5

    invoke-direct {v3, v5, v4}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    goto :goto_1

    :cond_1
    new-instance v3, Ljava/io/File;

    invoke-virtual {p1}, Lcom/pymcl/core/instance/Instance;->getDir()Ljava/io/File;

    move-result-object v5

    invoke-direct {v3, v5, v4}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 87
    :goto_1
    invoke-direct {v0, v1, v2, v3}, Lcom/pymcl/core/version/GameDirs;-><init>(Ljava/io/File;Ljava/io/File;Ljava/io/File;)V

    .line 89
    return-object v0
.end method

.method public final getAccounts()Lcom/pymcl/core/account/AccountStore;
    .locals 1

    .line 40
    iget-object v0, p0, Lcom/pymcl/android/data/LauncherRepository;->accounts:Lcom/pymcl/core/account/AccountStore;

    return-object v0
.end method

.method public final getAgents()Lcom/pymcl/core/auth/AgentJars;
    .locals 1

    .line 51
    iget-object v0, p0, Lcom/pymcl/android/data/LauncherRepository;->agents:Lcom/pymcl/core/auth/AgentJars;

    return-object v0
.end method

.method public final getCatalog()Lcom/pymcl/core/mods/ModCatalog;
    .locals 1

    .line 57
    iget-object v0, p0, Lcom/pymcl/android/data/LauncherRepository;->catalog:Lcom/pymcl/core/mods/ModCatalog;

    return-object v0
.end method

.method public final getConfig()Lcom/pymcl/core/config/ConfigStore;
    .locals 1

    .line 39
    iget-object v0, p0, Lcom/pymcl/android/data/LauncherRepository;->config:Lcom/pymcl/core/config/ConfigStore;

    return-object v0
.end method

.method public final getDownloadProgress()Lkotlinx/coroutines/flow/StateFlow;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Lcom/pymcl/core/download/DownloadProgress;",
            ">;"
        }
    .end annotation

    .line 83
    iget-object v0, p0, Lcom/pymcl/android/data/LauncherRepository;->downloads:Lcom/pymcl/core/download/DownloadManager;

    invoke-virtual {v0}, Lcom/pymcl/core/download/DownloadManager;->getProgress()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v0

    return-object v0
.end method

.method public final getDownloads()Lcom/pymcl/core/download/DownloadManager;
    .locals 1

    .line 44
    iget-object v0, p0, Lcom/pymcl/android/data/LauncherRepository;->downloads:Lcom/pymcl/core/download/DownloadManager;

    return-object v0
.end method

.method public final getGame()Lcom/pymcl/core/version/GameInstaller;
    .locals 1

    .line 46
    iget-object v0, p0, Lcom/pymcl/android/data/LauncherRepository;->game:Lcom/pymcl/core/version/GameInstaller;

    return-object v0
.end method

.method public final getHttp()Lcom/pymcl/core/net/Http;
    .locals 1

    .line 37
    iget-object v0, p0, Lcom/pymcl/android/data/LauncherRepository;->http:Lcom/pymcl/core/net/Http;

    return-object v0
.end method

.method public final getInstances()Lcom/pymcl/core/instance/InstanceManager;
    .locals 1

    .line 41
    iget-object v0, p0, Lcom/pymcl/android/data/LauncherRepository;->instances:Lcom/pymcl/core/instance/InstanceManager;

    return-object v0
.end method

.method public final getLoaders()Lcom/pymcl/core/loader/LoaderInstaller;
    .locals 1

    .line 48
    iget-object v0, p0, Lcom/pymcl/android/data/LauncherRepository;->loaders:Lcom/pymcl/core/loader/LoaderInstaller;

    return-object v0
.end method

.method public final getMicrosoft()Lcom/pymcl/core/auth/MicrosoftAuth;
    .locals 1

    .line 49
    iget-object v0, p0, Lcom/pymcl/android/data/LauncherRepository;->microsoft:Lcom/pymcl/core/auth/MicrosoftAuth;

    return-object v0
.end method

.method public final getMirrors()Lcom/pymcl/core/download/Mirrors;
    .locals 1

    .line 43
    iget-object v0, p0, Lcom/pymcl/android/data/LauncherRepository;->mirrors:Lcom/pymcl/core/download/Mirrors;

    return-object v0
.end method

.method public final getModTools()Lcom/pymcl/core/mods/ModTools;
    .locals 1

    .line 59
    iget-object v0, p0, Lcom/pymcl/android/data/LauncherRepository;->modTools:Lcom/pymcl/core/mods/ModTools;

    return-object v0
.end method

.method public final getPaths()Lcom/pymcl/core/config/LauncherPaths;
    .locals 1

    .line 38
    iget-object v0, p0, Lcom/pymcl/android/data/LauncherRepository;->paths:Lcom/pymcl/core/config/LauncherPaths;

    return-object v0
.end method

.method public final getPlaytime()Lcom/pymcl/core/instance/PlaytimeStore;
    .locals 1

    .line 42
    iget-object v0, p0, Lcom/pymcl/android/data/LauncherRepository;->playtime:Lcom/pymcl/core/instance/PlaytimeStore;

    return-object v0
.end method

.method public final getRuleEnv()Lcom/pymcl/core/version/RuleEnv;
    .locals 1

    .line 45
    iget-object v0, p0, Lcom/pymcl/android/data/LauncherRepository;->ruleEnv:Lcom/pymcl/core/version/RuleEnv;

    return-object v0
.end method

.method public final getSkinServer()Lcom/pymcl/core/auth/SkinServer;
    .locals 1

    .line 53
    iget-object v0, p0, Lcom/pymcl/android/data/LauncherRepository;->skinServer$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/pymcl/core/auth/SkinServer;

    return-object v0
.end method

.method public final getSkinsDir()Ljava/io/File;
    .locals 3

    .line 54
    new-instance v0, Ljava/io/File;

    iget-object v1, p0, Lcom/pymcl/android/data/LauncherRepository;->paths:Lcom/pymcl/core/config/LauncherPaths;

    invoke-virtual {v1}, Lcom/pymcl/core/config/LauncherPaths;->getRoot()Ljava/io/File;

    move-result-object v1

    const-string v2, "skins"

    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    return-object v0
.end method

.method public final getYggdrasil()Lcom/pymcl/core/auth/YggdrasilAuth;
    .locals 1

    .line 50
    iget-object v0, p0, Lcom/pymcl/android/data/LauncherRepository;->yggdrasil:Lcom/pymcl/core/auth/YggdrasilAuth;

    return-object v0
.end method

.method public final importModpack(Ljava/io/File;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 3
    .param p1, "zip"    # Ljava/io/File;
    .param p2, "onProgress"    # Lkotlin/jvm/functions/Function2;
    .param p3, "$completion"    # Lkotlin/coroutines/Continuation;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/io/File;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Ljava/lang/Float;",
            "-",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Pair<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 65
    invoke-static {}, Lkotlinx/coroutines/Dispatchers;->getIO()Lkotlinx/coroutines/CoroutineDispatcher;

    move-result-object v0

    check-cast v0, Lkotlin/coroutines/CoroutineContext;

    new-instance v1, Lcom/pymcl/android/data/LauncherRepository$importModpack$3;

    const/4 v2, 0x0

    invoke-direct {v1, p1, p0, p2, v2}, Lcom/pymcl/android/data/LauncherRepository$importModpack$3;-><init>(Ljava/io/File;Lcom/pymcl/android/data/LauncherRepository;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)V

    check-cast v1, Lkotlin/jvm/functions/Function2;

    invoke-static {v0, v1, p3}, Lkotlinx/coroutines/BuildersKt;->withContext(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    .line 80
    return-object v0
.end method

.method public final installLoader(Lcom/pymcl/core/loader/LoaderType;Ljava/lang/String;Ljava/lang/String;Lcom/pymcl/core/instance/Instance;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 8
    .param p1, "type"    # Lcom/pymcl/core/loader/LoaderType;
    .param p2, "mc"    # Ljava/lang/String;
    .param p3, "version"    # Ljava/lang/String;
    .param p4, "inst"    # Lcom/pymcl/core/instance/Instance;
    .param p5, "$completion"    # Lkotlin/coroutines/Continuation;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/pymcl/core/loader/LoaderType;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/pymcl/core/instance/Instance;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 95
    invoke-static {}, Lkotlinx/coroutines/Dispatchers;->getIO()Lkotlinx/coroutines/CoroutineDispatcher;

    move-result-object v0

    check-cast v0, Lkotlin/coroutines/CoroutineContext;

    new-instance v1, Lcom/pymcl/android/data/LauncherRepository$installLoader$2;

    const/4 v7, 0x0

    move-object v2, p0

    move-object v4, p1

    move-object v5, p2

    move-object v6, p3

    move-object v3, p4

    .end local p1    # "type":Lcom/pymcl/core/loader/LoaderType;
    .end local p2    # "mc":Ljava/lang/String;
    .end local p3    # "version":Ljava/lang/String;
    .end local p4    # "inst":Lcom/pymcl/core/instance/Instance;
    .local v3, "inst":Lcom/pymcl/core/instance/Instance;
    .local v4, "type":Lcom/pymcl/core/loader/LoaderType;
    .local v5, "mc":Ljava/lang/String;
    .local v6, "version":Ljava/lang/String;
    invoke-direct/range {v1 .. v7}, Lcom/pymcl/android/data/LauncherRepository$installLoader$2;-><init>(Lcom/pymcl/android/data/LauncherRepository;Lcom/pymcl/core/instance/Instance;Lcom/pymcl/core/loader/LoaderType;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    check-cast v1, Lkotlin/jvm/functions/Function2;

    invoke-static {v0, v1, p5}, Lkotlinx/coroutines/BuildersKt;->withContext(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    .line 99
    return-object p1
.end method

.method public final installVanilla(Ljava/lang/String;Lcom/pymcl/core/instance/Instance;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 3
    .param p1, "id"    # Ljava/lang/String;
    .param p2, "inst"    # Lcom/pymcl/core/instance/Instance;
    .param p3, "$completion"    # Lkotlin/coroutines/Continuation;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/pymcl/core/instance/Instance;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 93
    invoke-static {}, Lkotlinx/coroutines/Dispatchers;->getIO()Lkotlinx/coroutines/CoroutineDispatcher;

    move-result-object v0

    check-cast v0, Lkotlin/coroutines/CoroutineContext;

    new-instance v1, Lcom/pymcl/android/data/LauncherRepository$installVanilla$2;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p2, p1, v2}, Lcom/pymcl/android/data/LauncherRepository$installVanilla$2;-><init>(Lcom/pymcl/android/data/LauncherRepository;Lcom/pymcl/core/instance/Instance;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    check-cast v1, Lkotlin/jvm/functions/Function2;

    invoke-static {v0, v1, p3}, Lkotlinx/coroutines/BuildersKt;->withContext(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    .line 94
    return-object v0
.end method

.method public final loaderVersions(Lcom/pymcl/core/loader/LoaderType;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 3
    .param p1, "type"    # Lcom/pymcl/core/loader/LoaderType;
    .param p2, "mc"    # Ljava/lang/String;
    .param p3, "$completion"    # Lkotlin/coroutines/Continuation;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/pymcl/core/loader/LoaderType;",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/util/List<",
            "Lcom/pymcl/core/loader/LoaderVersion;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 100
    invoke-static {}, Lkotlinx/coroutines/Dispatchers;->getIO()Lkotlinx/coroutines/CoroutineDispatcher;

    move-result-object v0

    check-cast v0, Lkotlin/coroutines/CoroutineContext;

    new-instance v1, Lcom/pymcl/android/data/LauncherRepository$loaderVersions$2;

    const/4 v2, 0x0

    invoke-direct {v1, p1, p0, p2, v2}, Lcom/pymcl/android/data/LauncherRepository$loaderVersions$2;-><init>(Lcom/pymcl/core/loader/LoaderType;Lcom/pymcl/android/data/LauncherRepository;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    check-cast v1, Lkotlin/jvm/functions/Function2;

    invoke-static {v0, v1, p3}, Lkotlinx/coroutines/BuildersKt;->withContext(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    .line 103
    return-object v0
.end method

.method public final loginAuthlib(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 7
    .param p1, "api"    # Ljava/lang/String;
    .param p2, "user"    # Ljava/lang/String;
    .param p3, "pass"    # Ljava/lang/String;
    .param p4, "$completion"    # Lkotlin/coroutines/Continuation;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/util/List<",
            "Lcom/pymcl/core/account/Account;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 108
    invoke-static {}, Lkotlinx/coroutines/Dispatchers;->getIO()Lkotlinx/coroutines/CoroutineDispatcher;

    move-result-object v0

    check-cast v0, Lkotlin/coroutines/CoroutineContext;

    new-instance v1, Lcom/pymcl/android/data/LauncherRepository$loginAuthlib$2;

    const/4 v6, 0x0

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    .end local p1    # "api":Ljava/lang/String;
    .end local p2    # "user":Ljava/lang/String;
    .end local p3    # "pass":Ljava/lang/String;
    .local v3, "api":Ljava/lang/String;
    .local v4, "user":Ljava/lang/String;
    .local v5, "pass":Ljava/lang/String;
    invoke-direct/range {v1 .. v6}, Lcom/pymcl/android/data/LauncherRepository$loginAuthlib$2;-><init>(Lcom/pymcl/android/data/LauncherRepository;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    check-cast v1, Lkotlin/jvm/functions/Function2;

    invoke-static {v0, v1, p4}, Lkotlinx/coroutines/BuildersKt;->withContext(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final loginMicrosoft(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 3
    .param p1, "onCode"    # Lkotlin/jvm/functions/Function1;
    .param p2, "cancelled"    # Lkotlin/jvm/functions/Function0;
    .param p3, "$completion"    # Lkotlin/coroutines/Continuation;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/pymcl/core/auth/DeviceCode;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/Boolean;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/pymcl/core/account/Account;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 107
    invoke-static {}, Lkotlinx/coroutines/Dispatchers;->getIO()Lkotlinx/coroutines/CoroutineDispatcher;

    move-result-object v0

    check-cast v0, Lkotlin/coroutines/CoroutineContext;

    new-instance v1, Lcom/pymcl/android/data/LauncherRepository$loginMicrosoft$3;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, p2, v2}, Lcom/pymcl/android/data/LauncherRepository$loginMicrosoft$3;-><init>(Lcom/pymcl/android/data/LauncherRepository;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)V

    check-cast v1, Lkotlin/jvm/functions/Function2;

    invoke-static {v0, v1, p3}, Lkotlinx/coroutines/BuildersKt;->withContext(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final loginNide8(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 7
    .param p1, "serverId"    # Ljava/lang/String;
    .param p2, "user"    # Ljava/lang/String;
    .param p3, "pass"    # Ljava/lang/String;
    .param p4, "$completion"    # Lkotlin/coroutines/Continuation;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/util/List<",
            "Lcom/pymcl/core/account/Account;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 109
    invoke-static {}, Lkotlinx/coroutines/Dispatchers;->getIO()Lkotlinx/coroutines/CoroutineDispatcher;

    move-result-object v0

    check-cast v0, Lkotlin/coroutines/CoroutineContext;

    new-instance v1, Lcom/pymcl/android/data/LauncherRepository$loginNide8$2;

    const/4 v6, 0x0

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    .end local p1    # "serverId":Ljava/lang/String;
    .end local p2    # "user":Ljava/lang/String;
    .end local p3    # "pass":Ljava/lang/String;
    .local v3, "serverId":Ljava/lang/String;
    .local v4, "user":Ljava/lang/String;
    .local v5, "pass":Ljava/lang/String;
    invoke-direct/range {v1 .. v6}, Lcom/pymcl/android/data/LauncherRepository$loginNide8$2;-><init>(Lcom/pymcl/android/data/LauncherRepository;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    check-cast v1, Lkotlin/jvm/functions/Function2;

    invoke-static {v0, v1, p4}, Lkotlinx/coroutines/BuildersKt;->withContext(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final offlineSkinFile(Lcom/pymcl/core/account/Account;)Ljava/io/File;
    .locals 3
    .param p1, "a"    # Lcom/pymcl/core/account/Account;

    const-string v0, "a"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 134
    invoke-virtual {p1}, Lcom/pymcl/core/account/Account;->getType()Lcom/pymcl/core/account/AccountType;

    move-result-object v0

    sget-object v1, Lcom/pymcl/core/account/AccountType;->OFFLINE:Lcom/pymcl/core/account/AccountType;

    if-eq v0, v1, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    sget-object v0, Lcom/pymcl/core/auth/OfflineSkins;->INSTANCE:Lcom/pymcl/core/auth/OfflineSkins;

    invoke-virtual {p1}, Lcom/pymcl/core/account/Account;->getSkin()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lcom/pymcl/android/data/LauncherRepository;->getSkinsDir()Ljava/io/File;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/pymcl/core/auth/OfflineSkins;->customFile(Ljava/lang/String;Ljava/io/File;)Ljava/io/File;

    move-result-object v0

    :goto_0
    return-object v0
.end method

.method public final prepareOfflineSkin(Lcom/pymcl/core/account/Account;)Lkotlin/Pair;
    .locals 11
    .param p1, "a"    # Lcom/pymcl/core/account/Account;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/pymcl/core/account/Account;",
            ")",
            "Lkotlin/Pair<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    const-string v0, "a"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 138
    invoke-virtual {p0, p1}, Lcom/pymcl/android/data/LauncherRepository;->offlineSkinFile(Lcom/pymcl/core/account/Account;)Ljava/io/File;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    .line 139
    .local v0, "f":Ljava/io/File;
    :cond_0
    invoke-static {v0}, Lkotlin/io/FilesKt;->readBytes(Ljava/io/File;)[B

    move-result-object v2

    move-object v3, v2

    .line 207
    .local v3, "it\\1":[B
    const/4 v4, 0x0

    .line 139
    .local v4, "$i$a$-takeIf-LauncherRepository$prepareOfflineSkin$png$1\\1\\139\\0":I
    sget-object v5, Lcom/pymcl/core/auth/SkinServer;->Companion:Lcom/pymcl/core/auth/SkinServer$Companion;

    invoke-virtual {v5, v3}, Lcom/pymcl/core/auth/SkinServer$Companion;->isValidSkin([B)Z

    move-result v3

    .end local v3    # "it\\1":[B
    .end local v4    # "$i$a$-takeIf-LauncherRepository$prepareOfflineSkin$png$1\\1\\139\\0":I
    if-eqz v3, :cond_1

    goto :goto_0

    :cond_1
    move-object v2, v1

    :goto_0
    if-nez v2, :cond_2

    return-object v1

    :cond_2
    move-object v6, v2

    .line 140
    .local v6, "png":[B
    invoke-virtual {p1}, Lcom/pymcl/core/account/Account;->getRaw()Ljava/util/Map;

    move-result-object v2

    const-string v3, "skin_model"

    invoke-static {v2, v3}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_3

    const-string v2, "classic"

    :cond_3
    const-string v3, "slim"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    .line 141
    .local v7, "slim":Z
    invoke-virtual {p0}, Lcom/pymcl/android/data/LauncherRepository;->getSkinServer()Lcom/pymcl/core/auth/SkinServer;

    move-result-object v2

    const/4 v3, 0x0

    const/4 v4, 0x1

    invoke-static {v2, v3, v4, v1}, Lcom/pymcl/core/auth/SkinServer;->start$default(Lcom/pymcl/core/auth/SkinServer;IILjava/lang/Object;)I

    .line 142
    invoke-virtual {p0}, Lcom/pymcl/android/data/LauncherRepository;->getSkinServer()Lcom/pymcl/core/auth/SkinServer;

    move-result-object v1

    new-instance v3, Lcom/pymcl/core/auth/SkinServer$Profile;

    invoke-virtual {p1}, Lcom/pymcl/core/account/Account;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1}, Lcom/pymcl/core/account/Account;->getUuid()Ljava/lang/String;

    move-result-object v5

    const/16 v9, 0x10

    const/4 v10, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v3 .. v10}, Lcom/pymcl/core/auth/SkinServer$Profile;-><init>(Ljava/lang/String;Ljava/lang/String;[BZ[BILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v1, v3}, Lcom/pymcl/core/auth/SkinServer;->put(Lcom/pymcl/core/auth/SkinServer$Profile;)V

    .line 143
    invoke-virtual {p0}, Lcom/pymcl/android/data/LauncherRepository;->getSkinServer()Lcom/pymcl/core/auth/SkinServer;

    move-result-object v1

    invoke-virtual {v1}, Lcom/pymcl/core/auth/SkinServer;->getApiRoot()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lcom/pymcl/android/data/LauncherRepository;->getSkinServer()Lcom/pymcl/core/auth/SkinServer;

    move-result-object v2

    invoke-virtual {v2}, Lcom/pymcl/core/auth/SkinServer;->prefetched()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    return-object v1
.end method

.method public final recordPlaytime(Lcom/pymcl/core/instance/Instance;Ljava/lang/String;JJ)V
    .locals 8
    .param p1, "inst"    # Lcom/pymcl/core/instance/Instance;
    .param p2, "version"    # Ljava/lang/String;
    .param p3, "startSec"    # J
    .param p5, "durationSec"    # J

    const-string v0, "inst"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "version"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 196
    iget-object v1, p0, Lcom/pymcl/android/data/LauncherRepository;->playtime:Lcom/pymcl/core/instance/PlaytimeStore;

    invoke-virtual {p1}, Lcom/pymcl/core/instance/Instance;->getName()Ljava/lang/String;

    move-result-object v2

    move-object v3, p2

    move-wide v4, p3

    move-wide v6, p5

    .end local p2    # "version":Ljava/lang/String;
    .end local p3    # "startSec":J
    .end local p5    # "durationSec":J
    .local v3, "version":Ljava/lang/String;
    .local v4, "startSec":J
    .local v6, "durationSec":J
    invoke-virtual/range {v1 .. v7}, Lcom/pymcl/core/instance/PlaytimeStore;->record(Ljava/lang/String;Ljava/lang/String;JJ)V

    return-void
.end method

.method public final refreshIfNeeded(Lcom/pymcl/core/account/Account;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 3
    .param p1, "a"    # Lcom/pymcl/core/account/Account;
    .param p2, "$completion"    # Lkotlin/coroutines/Continuation;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/pymcl/core/account/Account;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/pymcl/core/account/Account;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 110
    invoke-static {}, Lkotlinx/coroutines/Dispatchers;->getIO()Lkotlinx/coroutines/CoroutineDispatcher;

    move-result-object v0

    check-cast v0, Lkotlin/coroutines/CoroutineContext;

    new-instance v1, Lcom/pymcl/android/data/LauncherRepository$refreshIfNeeded$2;

    const/4 v2, 0x0

    invoke-direct {v1, p1, p0, v2}, Lcom/pymcl/android/data/LauncherRepository$refreshIfNeeded$2;-><init>(Lcom/pymcl/core/account/Account;Lcom/pymcl/android/data/LauncherRepository;Lkotlin/coroutines/Continuation;)V

    check-cast v1, Lkotlin/jvm/functions/Function2;

    invoke-static {v0, v1, p2}, Lkotlinx/coroutines/BuildersKt;->withContext(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    .line 113
    return-object v0
.end method

.method public final setOfflineSkin(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 10
    .param p1, "name"    # Ljava/lang/String;
    .param p2, "src"    # Ljava/lang/String;
    .param p3, "model"    # Ljava/lang/String;

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "model"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 120
    iget-object v0, p0, Lcom/pymcl/android/data/LauncherRepository;->accounts:Lcom/pymcl/core/account/AccountStore;

    invoke-virtual {v0}, Lcom/pymcl/core/account/AccountStore;->list()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    .local v0, "$this$firstOrNull\\1":Ljava/lang/Iterable;
    const/4 v1, 0x0

    .line 208
    .local v1, "$i$f$firstOrNull\\1\\120":I
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz v3, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    .local v3, "element\\1":Ljava/lang/Object;
    move-object v6, v3

    check-cast v6, Lcom/pymcl/core/account/Account;

    .local v6, "it\\2":Lcom/pymcl/core/account/Account;
    const/4 v7, 0x0

    .line 120
    .local v7, "$i$a$-firstOrNull-LauncherRepository$setOfflineSkin$a$1\\2\\208\\0":I
    invoke-virtual {v6}, Lcom/pymcl/core/account/Account;->getName()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_1

    invoke-virtual {v6}, Lcom/pymcl/core/account/Account;->getType()Lcom/pymcl/core/account/AccountType;

    move-result-object v8

    sget-object v9, Lcom/pymcl/core/account/AccountType;->OFFLINE:Lcom/pymcl/core/account/AccountType;

    if-ne v8, v9, :cond_1

    move v6, v4

    goto :goto_0

    :cond_1
    move v6, v5

    .line 208
    .end local v6    # "it\\2":Lcom/pymcl/core/account/Account;
    .end local v7    # "$i$a$-firstOrNull-LauncherRepository$setOfflineSkin$a$1\\2\\208\\0":I
    :goto_0
    if-eqz v6, :cond_0

    goto :goto_1

    .line 209
    .end local v3    # "element\\1":Ljava/lang/Object;
    :cond_2
    const/4 v3, 0x0

    .line 120
    .end local v0    # "$this$firstOrNull\\1":Ljava/lang/Iterable;
    .end local v1    # "$i$f$firstOrNull\\1\\120":I
    :goto_1
    check-cast v3, Lcom/pymcl/core/account/Account;

    if-eqz v3, :cond_9

    .line 121
    .local v3, "a":Lcom/pymcl/core/account/Account;
    invoke-virtual {v3}, Lcom/pymcl/core/account/Account;->getRaw()Ljava/util/Map;

    move-result-object v0

    const-string v1, "slim"

    invoke-static {p3, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    goto :goto_2

    :cond_3
    const-string v1, "classic"

    :goto_2
    const-string v2, "skin_model"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 122
    nop

    .line 123
    if-eqz p2, :cond_8

    .line 124
    move-object v0, p2

    check-cast v0, Ljava/lang/CharSequence;

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_4

    goto :goto_3

    :cond_4
    move v4, v5

    :goto_3
    const-string v0, "skin"

    if-eqz v4, :cond_5

    invoke-virtual {v3}, Lcom/pymcl/core/account/Account;->getRaw()Ljava/util/Map;

    move-result-object v1

    const-string v2, "default"

    invoke-interface {v1, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_4

    .line 126
    :cond_5
    new-instance v1, Ljava/io/File;

    invoke-direct {v1, p2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-static {v1}, Lkotlin/io/FilesKt;->readBytes(Ljava/io/File;)[B

    move-result-object v1

    .line 127
    .local v1, "b":[B
    sget-object v2, Lcom/pymcl/core/auth/SkinServer;->Companion:Lcom/pymcl/core/auth/SkinServer$Companion;

    invoke-virtual {v2, v1}, Lcom/pymcl/core/auth/SkinServer$Companion;->isValidSkin([B)Z

    move-result v2

    if-eqz v2, :cond_7

    .line 128
    new-instance v2, Ljava/io/File;

    invoke-virtual {p0}, Lcom/pymcl/android/data/LauncherRepository;->getSkinsDir()Ljava/io/File;

    move-result-object v4

    sget-object v6, Lcom/pymcl/core/util/FileUtil;->INSTANCE:Lcom/pymcl/core/util/FileUtil;

    invoke-virtual {v6, v1}, Lcom/pymcl/core/util/FileUtil;->sha1([B)Ljava/lang/String;

    move-result-object v6

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    const-string v7, ".png"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-direct {v2, v4, v6}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .local v2, "f":Ljava/io/File;
    invoke-virtual {v2}, Ljava/io/File;->isFile()Z

    move-result v4

    if-nez v4, :cond_6

    sget-object v4, Lcom/pymcl/core/util/FileUtil;->INSTANCE:Lcom/pymcl/core/util/FileUtil;

    invoke-virtual {v4, v2, v1}, Lcom/pymcl/core/util/FileUtil;->writeAtomic(Ljava/io/File;[B)Z

    .line 129
    :cond_6
    invoke-virtual {v3}, Lcom/pymcl/core/account/Account;->getRaw()Ljava/util/Map;

    move-result-object v4

    invoke-virtual {v2}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v6

    invoke-interface {v4, v0, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_4

    .line 127
    .end local v2    # "f":Ljava/io/File;
    :cond_7
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v2, "\u76ae\u80a4\u9700\u4e3a 64\u00d764 \u6216 64\u00d732 \u7684 PNG"

    invoke-direct {v0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 132
    .end local v1    # "b":[B
    :cond_8
    :goto_4
    iget-object v0, p0, Lcom/pymcl/android/data/LauncherRepository;->accounts:Lcom/pymcl/core/account/AccountStore;

    invoke-virtual {v0, v3, v5}, Lcom/pymcl/core/account/AccountStore;->upsert(Lcom/pymcl/core/account/Account;Z)V

    .line 133
    return-void

    .line 120
    .end local v3    # "a":Lcom/pymcl/core/account/Account;
    :cond_9
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "\u53ea\u6709\u79bb\u7ebf\u8d26\u53f7\u53ef\u4ee5\u8bbe\u7f6e\u81ea\u5b9a\u4e49\u76ae\u80a4"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final toFclRequest(Lcom/pymcl/core/version/ResolvedVersion;Lcom/pymcl/core/launch/LaunchSpec;Ljava/io/File;Ljava/lang/String;Ljava/lang/String;)Lcom/pymcl/runtime/GameLaunchRequest;
    .locals 18
    .param p1, "v"    # Lcom/pymcl/core/version/ResolvedVersion;
    .param p2, "spec"    # Lcom/pymcl/core/launch/LaunchSpec;
    .param p3, "gameDir"    # Ljava/io/File;
    .param p4, "rendererId"    # Ljava/lang/String;
    .param p5, "server"    # Ljava/lang/String;

    move-object/from16 v0, p0

    const-string v1, "v"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "spec"

    move-object/from16 v3, p2

    invoke-static {v3, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "gameDir"

    move-object/from16 v4, p3

    invoke-static {v4, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 184
    invoke-virtual {v2}, Lcom/pymcl/core/version/ResolvedVersion;->getJson()Ljava/util/Map;

    move-result-object v1

    const-string v5, "libraries"

    invoke-static {v1, v5}, Lcom/pymcl/core/util/JsonKt;->arr(Ljava/util/Map;Ljava/lang/String;)Ljava/util/List;

    move-result-object v1

    invoke-static {v1}, Lcom/pymcl/core/util/JsonKt;->objs(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    .local v1, "$this$mapNotNull\\1":Ljava/lang/Iterable;
    const/4 v5, 0x0

    .line 210
    .local v5, "$i$f$mapNotNull\\1\\184":I
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    check-cast v6, Ljava/util/Collection;

    .local v6, "destination\\2":Ljava/util/Collection;
    move-object v7, v1

    .local v7, "$this$mapNotNullTo\\2":Ljava/lang/Iterable;
    const/4 v8, 0x0

    .line 219
    .local v8, "$i$f$mapNotNullTo\\2\\210":I
    move-object v9, v7

    .local v9, "$this$forEach\\3":Ljava/lang/Iterable;
    const/4 v10, 0x0

    .line 220
    .local v10, "$i$f$forEach\\3\\219":I
    invoke-interface {v9}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :goto_0
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_1

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    .local v12, "element\\3":Ljava/lang/Object;
    move-object v13, v12

    .local v13, "element\\4":Ljava/lang/Object;
    const/4 v14, 0x0

    .line 219
    .local v14, "$i$a$-forEach-CollectionsKt___CollectionsKt$mapNotNullTo$1\\4\\220\\2":I
    move-object v15, v13

    check-cast v15, Ljava/util/Map;

    .local v15, "it\\6":Ljava/util/Map;
    const/16 v16, 0x0

    .line 184
    .local v16, "$i$a$-mapNotNull-LauncherRepository$toFclRequest$libs$1\\6\\219\\0":I
    move-object/from16 v17, v1

    .end local v1    # "$this$mapNotNull\\1":Ljava/lang/Iterable;
    .local v17, "$this$mapNotNull\\1":Ljava/lang/Iterable;
    const-string v1, "name"

    invoke-static {v15, v1}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 219
    .end local v15    # "it\\6":Ljava/util/Map;
    .end local v16    # "$i$a$-mapNotNull-LauncherRepository$toFclRequest$libs$1\\6\\219\\0":I
    if-eqz v1, :cond_0

    .line 221
    .local v1, "it\\4":Ljava/lang/Object;
    const/4 v15, 0x0

    .line 219
    .local v15, "$i$a$-let-CollectionsKt___CollectionsKt$mapNotNullTo$1$1\\5\\221\\4":I
    invoke-interface {v6, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 220
    .end local v1    # "it\\4":Ljava/lang/Object;
    .end local v13    # "element\\4":Ljava/lang/Object;
    .end local v14    # "$i$a$-forEach-CollectionsKt___CollectionsKt$mapNotNullTo$1\\4\\220\\2":I
    .end local v15    # "$i$a$-let-CollectionsKt___CollectionsKt$mapNotNullTo$1$1\\5\\221\\4":I
    :cond_0
    move-object/from16 v1, v17

    .end local v12    # "element\\3":Ljava/lang/Object;
    goto :goto_0

    .line 222
    .end local v17    # "$this$mapNotNull\\1":Ljava/lang/Iterable;
    .local v1, "$this$mapNotNull\\1":Ljava/lang/Iterable;
    :cond_1
    move-object/from16 v17, v1

    .line 223
    .end local v1    # "$this$mapNotNull\\1":Ljava/lang/Iterable;
    .end local v9    # "$this$forEach\\3":Ljava/lang/Iterable;
    .end local v10    # "$i$f$forEach\\3\\219":I
    .restart local v17    # "$this$mapNotNull\\1":Ljava/lang/Iterable;
    nop

    .end local v6    # "destination\\2":Ljava/util/Collection;
    .end local v7    # "$this$mapNotNullTo\\2":Ljava/lang/Iterable;
    .end local v8    # "$i$f$mapNotNullTo\\2\\210":I
    move-object v1, v6

    check-cast v1, Ljava/util/List;

    .line 210
    nop

    .line 184
    .end local v5    # "$i$f$mapNotNull\\1\\184":I
    .end local v17    # "$this$mapNotNull\\1":Ljava/lang/Iterable;
    nop

    .line 186
    .local v1, "libs":Ljava/util/List;
    sget-object v5, Lcom/pymcl/runtime/FclLaunchArgs;->INSTANCE:Lcom/pymcl/runtime/FclLaunchArgs;

    const-string v6, "org.lwjgl:lwjgl:"

    invoke-static {v1, v6}, Lcom/pymcl/android/data/LauncherRepository;->toFclRequest$verOf(Ljava/util/List;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    if-nez v6, :cond_2

    const-string v6, "org.lwjgl.lwjgl:lwjgl:"

    invoke-static {v1, v6}, Lcom/pymcl/android/data/LauncherRepository;->toFclRequest$verOf(Ljava/util/List;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    :cond_2
    invoke-virtual {v5, v6}, Lcom/pymcl/runtime/FclLaunchArgs;->pickLwjgl(Ljava/lang/String;)Lkotlin/Pair;

    move-result-object v5

    invoke-virtual {v5}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    move-result-object v6

    move-object v12, v6

    check-cast v12, Ljava/lang/String;

    .local v12, "lwjgl":Ljava/lang/String;
    invoke-virtual {v5}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Boolean;

    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v14

    .line 187
    .local v14, "lwjglx":Z
    sget-object v5, Lcom/pymcl/runtime/FclLaunchArgs;->INSTANCE:Lcom/pymcl/runtime/FclLaunchArgs;

    iget-object v6, v0, Lcom/pymcl/android/data/LauncherRepository;->ctx:Landroid/content/Context;

    invoke-virtual {v4}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v7

    const-string v8, "getPath(...)"

    invoke-static {v7, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v9, "net.java.dev.jna:jna:"

    invoke-static {v1, v9}, Lcom/pymcl/android/data/LauncherRepository;->toFclRequest$verOf(Ljava/util/List;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v5, v6, v7, v9}, Lcom/pymcl/runtime/FclLaunchArgs;->envFor(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Lcom/pymcl/runtime/FclLaunchArgs$Env;

    move-result-object v15

    .line 188
    .local v15, "env":Lcom/pymcl/runtime/FclLaunchArgs$Env;
    sget-object v7, Lcom/pymcl/runtime/FclLaunchArgs;->INSTANCE:Lcom/pymcl/runtime/FclLaunchArgs;

    invoke-virtual {v3}, Lcom/pymcl/core/launch/LaunchSpec;->getJvmArgs()Ljava/util/List;

    move-result-object v5

    invoke-virtual {v3}, Lcom/pymcl/core/launch/LaunchSpec;->getMainClass()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v3}, Lcom/pymcl/core/launch/LaunchSpec;->getGameArgs()Ljava/util/List;

    move-result-object v10

    invoke-virtual {v3}, Lcom/pymcl/core/launch/LaunchSpec;->getJavaMajor()I

    move-result v11

    move-object v13, v12

    .end local v12    # "lwjgl":Ljava/lang/String;
    .local v13, "lwjgl":Ljava/lang/String;
    invoke-virtual {v4}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v12

    invoke-static {v12, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2}, Lcom/pymcl/core/version/ResolvedVersion;->getMcVersion()Ljava/lang/String;

    move-result-object v16

    move-object/from16 v17, p5

    move-object v8, v5

    invoke-virtual/range {v7 .. v17}, Lcom/pymcl/runtime/FclLaunchArgs;->rewrite(Ljava/util/List;Ljava/lang/String;Ljava/util/List;ILjava/lang/String;Ljava/lang/String;ZLcom/pymcl/runtime/FclLaunchArgs$Env;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;

    move-result-object v10

    .line 189
    move v5, v14

    .end local v14    # "lwjglx":Z
    .local v5, "lwjglx":Z
    .local v10, "args":Ljava/util/List;
    if-nez p4, :cond_8

    iget-object v6, v0, Lcom/pymcl/android/data/LauncherRepository;->config:Lcom/pymcl/core/config/ConfigStore;

    const-string v7, "android_renderer"

    invoke-virtual {v6, v7}, Lcom/pymcl/core/config/ConfigStore;->string(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    move-object v7, v6

    .line 207
    .local v7, "it\\7":Ljava/lang/String;
    const/4 v8, 0x0

    .line 189
    .local v8, "$i$a$-takeIf-LauncherRepository$toFclRequest$renderer$1\\7\\189\\0":I
    move-object v9, v7

    check-cast v9, Ljava/lang/CharSequence;

    invoke-interface {v9}, Ljava/lang/CharSequence;->length()I

    move-result v9

    const/4 v11, 0x1

    const/4 v12, 0x0

    if-lez v9, :cond_3

    move v9, v11

    goto :goto_1

    :cond_3
    move v9, v12

    :goto_1
    if-eqz v9, :cond_4

    const-string v9, "auto"

    invoke-static {v7, v9}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_4

    goto :goto_2

    :cond_4
    move v11, v12

    .end local v7    # "it\\7":Ljava/lang/String;
    .end local v8    # "$i$a$-takeIf-LauncherRepository$toFclRequest$renderer$1\\7\\189\\0":I
    :goto_2
    if-eqz v11, :cond_5

    goto :goto_3

    :cond_5
    const/4 v6, 0x0

    :goto_3
    if-nez v6, :cond_7

    .line 190
    invoke-virtual {v2}, Lcom/pymcl/core/version/ResolvedVersion;->getMcVersion()Ljava/lang/String;

    move-result-object v6

    const-string v7, "1.21.4"

    invoke-static {v6, v7}, Lcom/pymcl/core/loader/LoadersKt;->compareMc(Ljava/lang/String;Ljava/lang/String;)I

    move-result v6

    if-gtz v6, :cond_6

    sget-object v6, Lcom/pymcl/runtime/Renderers;->INSTANCE:Lcom/pymcl/runtime/Renderers;

    invoke-virtual {v6}, Lcom/pymcl/runtime/Renderers;->getGL4ES()Lcom/mio/data/Renderer;

    move-result-object v6

    goto :goto_4

    :cond_6
    sget-object v6, Lcom/pymcl/runtime/Renderers;->INSTANCE:Lcom/pymcl/runtime/Renderers;

    invoke-virtual {v6}, Lcom/pymcl/runtime/Renderers;->getNG_GL4ES()Lcom/mio/data/Renderer;

    move-result-object v6

    :goto_4
    invoke-virtual {v6}, Lcom/mio/data/Renderer;->getId()Ljava/lang/String;

    move-result-object v6

    move-object v11, v6

    goto :goto_5

    .line 189
    :cond_7
    move-object v11, v6

    goto :goto_5

    :cond_8
    move-object/from16 v11, p4

    :goto_5
    nop

    .line 192
    .local v11, "renderer":Ljava/lang/String;
    iget-object v6, v0, Lcom/pymcl/android/data/LauncherRepository;->config:Lcom/pymcl/core/config/ConfigStore;

    const-string v7, "android_window_scale"

    invoke-virtual {v6, v7}, Lcom/pymcl/core/config/ConfigStore;->string(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lkotlin/text/StringsKt;->toFloatOrNull(Ljava/lang/String;)Ljava/lang/Float;

    move-result-object v6

    const/high16 v7, 0x3f800000    # 1.0f

    if-eqz v6, :cond_9

    invoke-virtual {v6}, Ljava/lang/Float;->floatValue()F

    move-result v6

    goto :goto_6

    :cond_9
    move v6, v7

    :goto_6
    const v8, 0x3e99999a    # 0.3f

    invoke-static {v6, v8, v7}, Lkotlin/ranges/RangesKt;->coerceIn(FFF)F

    move-result v14

    .line 193
    .local v14, "windowScale":F
    new-instance v7, Lcom/pymcl/runtime/GameLaunchRequest;

    invoke-virtual {v3}, Lcom/pymcl/core/launch/LaunchSpec;->getJavaMajor()I

    move-result v8

    invoke-virtual {v3}, Lcom/pymcl/core/launch/LaunchSpec;->getWorkingDir()Ljava/lang/String;

    move-result-object v9

    move-object v12, v13

    .end local v13    # "lwjgl":Ljava/lang/String;
    .restart local v12    # "lwjgl":Ljava/lang/String;
    invoke-virtual {v2}, Lcom/pymcl/core/version/ResolvedVersion;->getMcVersion()Ljava/lang/String;

    move-result-object v13

    invoke-direct/range {v7 .. v14}, Lcom/pymcl/runtime/GameLaunchRequest;-><init>(ILjava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;F)V

    move-object v13, v12

    .end local v12    # "lwjgl":Ljava/lang/String;
    .restart local v13    # "lwjgl":Ljava/lang/String;
    return-object v7
.end method

.method public final versionManifest(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 3
    .param p1, "force"    # Z
    .param p2, "$completion"    # Lkotlin/coroutines/Continuation;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/pymcl/core/version/VersionManifest;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 92
    invoke-static {}, Lkotlinx/coroutines/Dispatchers;->getIO()Lkotlinx/coroutines/CoroutineDispatcher;

    move-result-object v0

    check-cast v0, Lkotlin/coroutines/CoroutineContext;

    new-instance v1, Lcom/pymcl/android/data/LauncherRepository$versionManifest$2;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, Lcom/pymcl/android/data/LauncherRepository$versionManifest$2;-><init>(Lcom/pymcl/android/data/LauncherRepository;ZLkotlin/coroutines/Continuation;)V

    check-cast v1, Lkotlin/jvm/functions/Function2;

    invoke-static {v0, v1, p2}, Lkotlinx/coroutines/BuildersKt;->withContext(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
