.class public final Lcom/pymcl/android/data/AiToolHostImpl;
.super Ljava/lang/Object;
.source "AiToolHostImpl.kt"

# interfaces
.implements Lcom/pymcl/ai/AiToolHost;


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nAiToolHostImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AiToolHostImpl.kt\ncom/pymcl/android/data/AiToolHostImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,182:1\n1#2:183\n777#3:184\n873#3,2:185\n1739#3:187\n1814#3,3:188\n*S KotlinDebug\n*F\n+ 1 AiToolHostImpl.kt\ncom/pymcl/android/data/AiToolHostImpl\n*L\n169#1:184\n169#1:185,2\n176#1:187\n176#1:188,3\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0010 \n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0010\u0002\n\u0002\u0008\u000b\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\u0008\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0008\u0010\u000e\u001a\u00020\u000fH\u0016J\"\u0010\u0010\u001a\u00020\u00112\u0018\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0013j\u0002`\u0015H\u0002J*\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u00112\u0018\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0013j\u0002`\u0015H\u0002J\u0018\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u000fH\u0002J\u0018\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u000fH\u0002J\u0010\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u000fH\u0002J\u000e\u0010\u001d\u001a\u00020\u000fH\u0096@\u00a2\u0006\u0002\u0010\u001eJ,\u0010\u001f\u001a\u0004\u0018\u00010\u000f2\u0006\u0010 \u001a\u00020\u000f2\u0018\u0010!\u001a\u0014\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0013j\u0002`\u0015H\u0016J0\u0010\"\u001a\u0008\u0012\u0004\u0012\u00020\u00190#2\u0006\u0010 \u001a\u00020\u000f2\u0018\u0010!\u001a\u0014\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0013j\u0002`\u0015H\u0016J\u0018\u0010$\u001a\u00020\u00192\u0006\u0010%\u001a\u00020\u00192\u0006\u0010&\u001a\u00020\u000fH\u0002JL\u0010\'\u001a\u00020(2\u0006\u0010 \u001a\u00020\u000f2\u0018\u0010!\u001a\u0014\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0013j\u0002`\u00152\u001a\u0010)\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010+\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020,0*H\u0096@\u00a2\u0006\u0002\u0010-J\"\u0010.\u001a\u00020\u000f2\u0018\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0013j\u0002`\u0015H\u0002J0\u0010/\u001a\u00020(2\u0006\u00100\u001a\u00020\u000f2\u0018\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0013j\u0002`\u0015H\u0082@\u00a2\u0006\u0002\u00101JL\u00102\u001a\u00020(2\u0006\u00100\u001a\u00020\u000f2\u0018\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0013j\u0002`\u00152\u001a\u0010)\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010+\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020,0*H\u0082@\u00a2\u0006\u0002\u0010-J&\u00103\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u000fH\u0082@\u00a2\u0006\u0002\u00104J\u0018\u00105\u001a\u00020\u000f2\u0006\u00106\u001a\u00020\u00192\u0006\u00107\u001a\u000208H\u0002J&\u00109\u001a\u0018\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0018\u00010\u0013j\u0004\u0018\u0001`\u00152\u0006\u00106\u001a\u00020\u0019H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0008\u001a\n \t*\u0004\u0018\u00010\u00030\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00020\u000b8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000c\u0010\r\u00ca\u0001\u000c\u0008;\u0012\u0008\u0008<\u0012\u0004\u0008\u0003\u0010\u0000\u00a8\u0006:"
    }
    d2 = {
        "Lcom/pymcl/android/data/AiToolHostImpl;",
        "Lcom/pymcl/ai/AiToolHost;",
        "context",
        "Landroid/content/Context;",
        "api",
        "Lcom/pymcl/android/data/RepositoryUiApi;",
        "<init>",
        "(Landroid/content/Context;Lcom/pymcl/android/data/RepositoryUiApi;)V",
        "ctx",
        "kotlin.jvm.PlatformType",
        "repo",
        "Lcom/pymcl/android/data/LauncherRepository;",
        "getRepo",
        "()Lcom/pymcl/android/data/LauncherRepository;",
        "currentInstance",
        "",
        "instOf",
        "Lcom/pymcl/core/instance/Instance;",
        "a",
        "",
        "",
        "Lcom/pymcl/core/util/JObj;",
        "versionOf",
        "i",
        "gameDir",
        "Ljava/io/File;",
        "v",
        "mcOf",
        "loaderOf",
        "launcherStateSummary",
        "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "describe",
        "name",
        "args",
        "affectedPaths",
        "",
        "configFile",
        "gd",
        "p",
        "execute",
        "Lcom/pymcl/ai/ToolOutput;",
        "progress",
        "Lkotlin/Function2;",
        "",
        "",
        "(Ljava/lang/String;Ljava/util/Map;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "sourceOf",
        "search",
        "kind",
        "(Ljava/lang/String;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "install",
        "resolveMod",
        "(Lcom/pymcl/core/instance/Instance;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "tail",
        "f",
        "n",
        "",
        "modInfo",
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


# instance fields
.field private final api:Lcom/pymcl/android/data/RepositoryUiApi;

.field private final ctx:Landroid/content/Context;


# direct methods
.method public static synthetic $r8$lambda$603MRkcS3C5fMFv0GvGaWAhahnw(Lcom/pymcl/core/instance/Instance;Ljava/lang/String;)J
    .locals 0

    invoke-static {p0, p1}, Lcom/pymcl/android/data/AiToolHostImpl;->versionOf$lambda$1(Lcom/pymcl/core/instance/Instance;Ljava/lang/String;)J

    move-result-wide p0

    return-wide p0
.end method

.method public static synthetic $r8$lambda$QF7IeQIGb9fq2p95hAdnFhMmNcY(Lcom/pymcl/android/data/AiToolHostImpl;Ljava/lang/String;)Ljava/io/File;
    .locals 0

    invoke-static {p0, p1}, Lcom/pymcl/android/data/AiToolHostImpl;->affectedPaths$lambda$0$1(Lcom/pymcl/android/data/AiToolHostImpl;Ljava/lang/String;)Ljava/io/File;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$uK5_nFztg1uEWOo4JINEnxh4NdY(Lcom/pymcl/android/data/AiToolHostImpl;Lcom/pymcl/core/instance/Instance;Ljava/util/Map;)Ljava/io/File;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/pymcl/android/data/AiToolHostImpl;->affectedPaths$lambda$0$0(Lcom/pymcl/android/data/AiToolHostImpl;Lcom/pymcl/core/instance/Instance;Ljava/util/Map;)Ljava/io/File;

    move-result-object p0

    return-object p0
.end method

.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x8

    sput v0, Lcom/pymcl/android/data/AiToolHostImpl;->$stable:I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/pymcl/android/data/RepositoryUiApi;)V
    .locals 1
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "api"    # Lcom/pymcl/android/data/RepositoryUiApi;

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "api"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/pymcl/android/data/AiToolHostImpl;->api:Lcom/pymcl/android/data/RepositoryUiApi;

    .line 23
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/pymcl/android/data/AiToolHostImpl;->ctx:Landroid/content/Context;

    .line 22
    return-void
.end method

.method public static final synthetic access$configFile(Lcom/pymcl/android/data/AiToolHostImpl;Ljava/io/File;Ljava/lang/String;)Ljava/io/File;
    .locals 1
    .param p0, "$this"    # Lcom/pymcl/android/data/AiToolHostImpl;
    .param p1, "gd"    # Ljava/io/File;
    .param p2, "p"    # Ljava/lang/String;

    .line 22
    invoke-direct {p0, p1, p2}, Lcom/pymcl/android/data/AiToolHostImpl;->configFile(Ljava/io/File;Ljava/lang/String;)Ljava/io/File;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$gameDir(Lcom/pymcl/android/data/AiToolHostImpl;Lcom/pymcl/core/instance/Instance;Ljava/lang/String;)Ljava/io/File;
    .locals 1
    .param p0, "$this"    # Lcom/pymcl/android/data/AiToolHostImpl;
    .param p1, "i"    # Lcom/pymcl/core/instance/Instance;
    .param p2, "v"    # Ljava/lang/String;

    .line 22
    invoke-direct {p0, p1, p2}, Lcom/pymcl/android/data/AiToolHostImpl;->gameDir(Lcom/pymcl/core/instance/Instance;Ljava/lang/String;)Ljava/io/File;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$getApi$p(Lcom/pymcl/android/data/AiToolHostImpl;)Lcom/pymcl/android/data/RepositoryUiApi;
    .locals 1
    .param p0, "$this"    # Lcom/pymcl/android/data/AiToolHostImpl;

    .line 22
    iget-object v0, p0, Lcom/pymcl/android/data/AiToolHostImpl;->api:Lcom/pymcl/android/data/RepositoryUiApi;

    return-object v0
.end method

.method public static final synthetic access$getRepo(Lcom/pymcl/android/data/AiToolHostImpl;)Lcom/pymcl/android/data/LauncherRepository;
    .locals 1
    .param p0, "$this"    # Lcom/pymcl/android/data/AiToolHostImpl;

    .line 22
    invoke-direct {p0}, Lcom/pymcl/android/data/AiToolHostImpl;->getRepo()Lcom/pymcl/android/data/LauncherRepository;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$instOf(Lcom/pymcl/android/data/AiToolHostImpl;Ljava/util/Map;)Lcom/pymcl/core/instance/Instance;
    .locals 1
    .param p0, "$this"    # Lcom/pymcl/android/data/AiToolHostImpl;
    .param p1, "a"    # Ljava/util/Map;

    .line 22
    invoke-direct {p0, p1}, Lcom/pymcl/android/data/AiToolHostImpl;->instOf(Ljava/util/Map;)Lcom/pymcl/core/instance/Instance;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$install(Lcom/pymcl/android/data/AiToolHostImpl;Ljava/lang/String;Ljava/util/Map;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 1
    .param p0, "$this"    # Lcom/pymcl/android/data/AiToolHostImpl;
    .param p1, "kind"    # Ljava/lang/String;
    .param p2, "a"    # Ljava/util/Map;
    .param p3, "progress"    # Lkotlin/jvm/functions/Function2;
    .param p4, "$completion"    # Lkotlin/coroutines/Continuation;

    .line 22
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/pymcl/android/data/AiToolHostImpl;->install(Ljava/lang/String;Ljava/util/Map;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$loaderOf(Lcom/pymcl/android/data/AiToolHostImpl;Ljava/lang/String;)Ljava/lang/String;
    .locals 1
    .param p0, "$this"    # Lcom/pymcl/android/data/AiToolHostImpl;
    .param p1, "v"    # Ljava/lang/String;

    .line 22
    invoke-direct {p0, p1}, Lcom/pymcl/android/data/AiToolHostImpl;->loaderOf(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$mcOf(Lcom/pymcl/android/data/AiToolHostImpl;Lcom/pymcl/core/instance/Instance;Ljava/lang/String;)Ljava/lang/String;
    .locals 1
    .param p0, "$this"    # Lcom/pymcl/android/data/AiToolHostImpl;
    .param p1, "i"    # Lcom/pymcl/core/instance/Instance;
    .param p2, "v"    # Ljava/lang/String;

    .line 22
    invoke-direct {p0, p1, p2}, Lcom/pymcl/android/data/AiToolHostImpl;->mcOf(Lcom/pymcl/core/instance/Instance;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$modInfo(Lcom/pymcl/android/data/AiToolHostImpl;Ljava/io/File;)Ljava/util/Map;
    .locals 1
    .param p0, "$this"    # Lcom/pymcl/android/data/AiToolHostImpl;
    .param p1, "f"    # Ljava/io/File;

    .line 22
    invoke-direct {p0, p1}, Lcom/pymcl/android/data/AiToolHostImpl;->modInfo(Ljava/io/File;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$resolveMod(Lcom/pymcl/android/data/AiToolHostImpl;Lcom/pymcl/core/instance/Instance;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 1
    .param p0, "$this"    # Lcom/pymcl/android/data/AiToolHostImpl;
    .param p1, "i"    # Lcom/pymcl/core/instance/Instance;
    .param p2, "v"    # Ljava/lang/String;
    .param p3, "name"    # Ljava/lang/String;
    .param p4, "$completion"    # Lkotlin/coroutines/Continuation;

    .line 22
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/pymcl/android/data/AiToolHostImpl;->resolveMod(Lcom/pymcl/core/instance/Instance;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$search(Lcom/pymcl/android/data/AiToolHostImpl;Ljava/lang/String;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 1
    .param p0, "$this"    # Lcom/pymcl/android/data/AiToolHostImpl;
    .param p1, "kind"    # Ljava/lang/String;
    .param p2, "a"    # Ljava/util/Map;
    .param p3, "$completion"    # Lkotlin/coroutines/Continuation;

    .line 22
    invoke-direct {p0, p1, p2, p3}, Lcom/pymcl/android/data/AiToolHostImpl;->search(Ljava/lang/String;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$tail(Lcom/pymcl/android/data/AiToolHostImpl;Ljava/io/File;I)Ljava/lang/String;
    .locals 1
    .param p0, "$this"    # Lcom/pymcl/android/data/AiToolHostImpl;
    .param p1, "f"    # Ljava/io/File;
    .param p2, "n"    # I

    .line 22
    invoke-direct {p0, p1, p2}, Lcom/pymcl/android/data/AiToolHostImpl;->tail(Ljava/io/File;I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$versionOf(Lcom/pymcl/android/data/AiToolHostImpl;Lcom/pymcl/core/instance/Instance;Ljava/util/Map;)Ljava/lang/String;
    .locals 1
    .param p0, "$this"    # Lcom/pymcl/android/data/AiToolHostImpl;
    .param p1, "i"    # Lcom/pymcl/core/instance/Instance;
    .param p2, "a"    # Ljava/util/Map;

    .line 22
    invoke-direct {p0, p1, p2}, Lcom/pymcl/android/data/AiToolHostImpl;->versionOf(Lcom/pymcl/core/instance/Instance;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private static final affectedPaths$lambda$0$0(Lcom/pymcl/android/data/AiToolHostImpl;Lcom/pymcl/core/instance/Instance;Ljava/util/Map;)Ljava/io/File;
    .locals 1
    .param p0, "$this_runCatching"    # Lcom/pymcl/android/data/AiToolHostImpl;
    .param p1, "$i"    # Lcom/pymcl/core/instance/Instance;
    .param p2, "$args"    # Ljava/util/Map;

    .line 57
    invoke-direct {p0, p1, p2}, Lcom/pymcl/android/data/AiToolHostImpl;->versionOf(Lcom/pymcl/core/instance/Instance;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lcom/pymcl/android/data/AiToolHostImpl;->gameDir(Lcom/pymcl/core/instance/Instance;Ljava/lang/String;)Ljava/io/File;

    move-result-object v0

    return-object v0
.end method

.method private static final affectedPaths$lambda$0$1(Lcom/pymcl/android/data/AiToolHostImpl;Ljava/lang/String;)Ljava/io/File;
    .locals 1
    .param p0, "$this_runCatching"    # Lcom/pymcl/android/data/AiToolHostImpl;
    .param p1, "it"    # Ljava/lang/String;

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 57
    invoke-direct {p0}, Lcom/pymcl/android/data/AiToolHostImpl;->getRepo()Lcom/pymcl/android/data/LauncherRepository;

    move-result-object v0

    invoke-virtual {v0}, Lcom/pymcl/android/data/LauncherRepository;->getInstances()Lcom/pymcl/core/instance/InstanceManager;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/pymcl/core/instance/InstanceManager;->get(Ljava/lang/String;)Lcom/pymcl/core/instance/Instance;

    move-result-object v0

    invoke-virtual {v0}, Lcom/pymcl/core/instance/Instance;->getDir()Ljava/io/File;

    move-result-object v0

    return-object v0
.end method

.method private final configFile(Ljava/io/File;Ljava/lang/String;)Ljava/io/File;
    .locals 1
    .param p1, "gd"    # Ljava/io/File;
    .param p2, "p"    # Ljava/lang/String;

    .line 60
    sget-object v0, Lcom/pymcl/android/data/AiToolLogic;->INSTANCE:Lcom/pymcl/android/data/AiToolLogic;

    invoke-virtual {v0, p1, p2}, Lcom/pymcl/android/data/AiToolLogic;->configFile(Ljava/io/File;Ljava/lang/String;)Ljava/io/File;

    move-result-object v0

    return-object v0
.end method

.method private final gameDir(Lcom/pymcl/core/instance/Instance;Ljava/lang/String;)Ljava/io/File;
    .locals 2
    .param p1, "i"    # Lcom/pymcl/core/instance/Instance;
    .param p2, "v"    # Ljava/lang/String;

    .line 41
    invoke-direct {p0}, Lcom/pymcl/android/data/AiToolHostImpl;->getRepo()Lcom/pymcl/android/data/LauncherRepository;

    move-result-object v0

    invoke-virtual {v0}, Lcom/pymcl/android/data/LauncherRepository;->getConfig()Lcom/pymcl/core/config/ConfigStore;

    move-result-object v0

    invoke-virtual {p1, p2, v0}, Lcom/pymcl/core/instance/Instance;->settings(Ljava/lang/String;Lcom/pymcl/core/config/ConfigStore;)Lcom/pymcl/core/instance/VersionSettings;

    move-result-object v0

    invoke-virtual {p1}, Lcom/pymcl/core/instance/Instance;->getDir()Ljava/io/File;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/pymcl/core/instance/VersionSettings;->gameDir(Ljava/io/File;)Ljava/io/File;

    move-result-object v0

    return-object v0
.end method

.method private final getRepo()Lcom/pymcl/android/data/LauncherRepository;
    .locals 3

    .line 24
    sget-object v0, Lcom/pymcl/android/data/LauncherRepository;->Companion:Lcom/pymcl/android/data/LauncherRepository$Companion;

    iget-object v1, p0, Lcom/pymcl/android/data/AiToolHostImpl;->ctx:Landroid/content/Context;

    const-string v2, "ctx"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/pymcl/android/data/LauncherRepository$Companion;->get(Landroid/content/Context;)Lcom/pymcl/android/data/LauncherRepository;

    move-result-object v0

    return-object v0
.end method

.method private final instOf(Ljava/util/Map;)Lcom/pymcl/core/instance/Instance;
    .locals 5
    .param p1, "a"    # Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)",
            "Lcom/pymcl/core/instance/Instance;"
        }
    .end annotation

    .line 28
    sget-object v0, Lcom/pymcl/android/data/AiToolLogic;->INSTANCE:Lcom/pymcl/android/data/AiToolLogic;

    invoke-virtual {p0}, Lcom/pymcl/android/data/AiToolHostImpl;->currentInstance()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/pymcl/android/data/AiToolLogic;->instanceArg(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .local v0, "n\\1":Ljava/lang/String;
    const/4 v1, 0x0

    .line 29
    .local v1, "$i$a$-let-AiToolHostImpl$instOf$1\\1\\28\\0":I
    invoke-direct {p0}, Lcom/pymcl/android/data/AiToolHostImpl;->getRepo()Lcom/pymcl/android/data/LauncherRepository;

    move-result-object v2

    invoke-virtual {v2}, Lcom/pymcl/android/data/LauncherRepository;->getInstances()Lcom/pymcl/core/instance/InstanceManager;

    move-result-object v2

    invoke-virtual {v2}, Lcom/pymcl/core/instance/InstanceManager;->list()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 30
    invoke-direct {p0}, Lcom/pymcl/android/data/AiToolHostImpl;->getRepo()Lcom/pymcl/android/data/LauncherRepository;

    move-result-object v2

    invoke-virtual {v2}, Lcom/pymcl/android/data/LauncherRepository;->getInstances()Lcom/pymcl/core/instance/InstanceManager;

    move-result-object v2

    invoke-virtual {v2, v0}, Lcom/pymcl/core/instance/InstanceManager;->get(Ljava/lang/String;)Lcom/pymcl/core/instance/Instance;

    move-result-object v0

    .line 28
    .end local v0    # "n\\1":Ljava/lang/String;
    .end local v1    # "$i$a$-let-AiToolHostImpl$instOf$1\\1\\28\\0":I
    nop

    .line 31
    return-object v0

    .line 29
    .restart local v0    # "n\\1":Ljava/lang/String;
    .restart local v1    # "$i$a$-let-AiToolHostImpl$instOf$1\\1\\28\\0":I
    :cond_0
    new-instance v2, Ljava/lang/IllegalArgumentException;

    sget-object v3, Lcom/pymcl/android/data/AiToolLogic;->INSTANCE:Lcom/pymcl/android/data/AiToolLogic;

    invoke-direct {p0}, Lcom/pymcl/android/data/AiToolHostImpl;->getRepo()Lcom/pymcl/android/data/LauncherRepository;

    move-result-object v4

    invoke-virtual {v4}, Lcom/pymcl/android/data/LauncherRepository;->getInstances()Lcom/pymcl/core/instance/InstanceManager;

    move-result-object v4

    invoke-virtual {v4}, Lcom/pymcl/core/instance/InstanceManager;->list()Ljava/util/List;

    move-result-object v4

    invoke-virtual {v3, v0, v4}, Lcom/pymcl/android/data/AiToolLogic;->noInstanceMessage(Ljava/lang/String;Ljava/util/List;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v2
.end method

.method private final install(Ljava/lang/String;Ljava/util/Map;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 25
    .param p1, "kind"    # Ljava/lang/String;
    .param p2, "a"    # Ljava/util/Map;
    .param p3, "progress"    # Lkotlin/jvm/functions/Function2;
    .param p4, "$completion"    # Lkotlin/coroutines/Continuation;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Ljava/lang/Float;",
            "-",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/pymcl/ai/ToolOutput;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    move-object/from16 v2, p4

    instance-of v3, v2, Lcom/pymcl/android/data/AiToolHostImpl$install$1;

    if-eqz v3, :cond_0

    move-object v3, v2

    check-cast v3, Lcom/pymcl/android/data/AiToolHostImpl$install$1;

    iget v4, v3, Lcom/pymcl/android/data/AiToolHostImpl$install$1;->label:I

    const/high16 v5, -0x80000000

    and-int/2addr v4, v5

    if-eqz v4, :cond_0

    iget v4, v3, Lcom/pymcl/android/data/AiToolHostImpl$install$1;->label:I

    sub-int/2addr v4, v5

    iput v4, v3, Lcom/pymcl/android/data/AiToolHostImpl$install$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v3, Lcom/pymcl/android/data/AiToolHostImpl$install$1;

    invoke-direct {v3, v0, v2}, Lcom/pymcl/android/data/AiToolHostImpl$install$1;-><init>(Lcom/pymcl/android/data/AiToolHostImpl;Lkotlin/coroutines/Continuation;)V

    :goto_0
    move-object v11, v3

    .local v11, "$continuation":Lkotlin/coroutines/Continuation;
    iget-object v3, v11, Lcom/pymcl/android/data/AiToolHostImpl$install$1;->result:Ljava/lang/Object;

    .local v3, "$result":Ljava/lang/Object;
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v12

    .line 157
    iget v4, v11, Lcom/pymcl/android/data/AiToolHostImpl$install$1;->label:I

    packed-switch v4, :pswitch_data_0

    .end local v3    # "$result":Ljava/lang/Object;
    .end local v11    # "$continuation":Lkotlin/coroutines/Continuation;
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .restart local v3    # "$result":Ljava/lang/Object;
    .restart local v11    # "$continuation":Lkotlin/coroutines/Continuation;
    :pswitch_0
    iget-object v4, v11, Lcom/pymcl/android/data/AiToolHostImpl$install$1;->L$11:Ljava/lang/Object;

    check-cast v4, Lcom/pymcl/core/mods/ModFile;

    .local v4, "f":Lcom/pymcl/core/mods/ModFile;
    iget-object v5, v11, Lcom/pymcl/android/data/AiToolHostImpl$install$1;->L$10:Ljava/lang/Object;

    check-cast v5, Ljava/util/List;

    .local v5, "files":Ljava/util/List;
    iget-object v6, v11, Lcom/pymcl/android/data/AiToolHostImpl$install$1;->L$9:Ljava/lang/Object;

    check-cast v6, Ljava/lang/String;

    .local v6, "loader":Ljava/lang/String;
    iget-object v7, v11, Lcom/pymcl/android/data/AiToolHostImpl$install$1;->L$8:Ljava/lang/Object;

    check-cast v7, Ljava/lang/String;

    .local v7, "mc":Ljava/lang/String;
    iget-object v8, v11, Lcom/pymcl/android/data/AiToolHostImpl$install$1;->L$7:Ljava/lang/Object;

    check-cast v8, Ljava/lang/String;

    .local v8, "v":Ljava/lang/String;
    iget-object v9, v11, Lcom/pymcl/android/data/AiToolHostImpl$install$1;->L$6:Ljava/lang/Object;

    check-cast v9, Lcom/pymcl/core/instance/Instance;

    .local v9, "i":Lcom/pymcl/core/instance/Instance;
    iget-object v10, v11, Lcom/pymcl/android/data/AiToolHostImpl$install$1;->L$5:Ljava/lang/Object;

    check-cast v10, Lcom/pymcl/core/mods/ModHit;

    .local v10, "hit":Lcom/pymcl/core/mods/ModHit;
    iget-object v12, v11, Lcom/pymcl/android/data/AiToolHostImpl$install$1;->L$4:Ljava/lang/Object;

    check-cast v12, Ljava/lang/String;

    .local v12, "query":Ljava/lang/String;
    iget-object v13, v11, Lcom/pymcl/android/data/AiToolHostImpl$install$1;->L$3:Ljava/lang/Object;

    check-cast v13, Lcom/pymcl/core/mods/ResKind;

    .local v13, "k":Lcom/pymcl/core/mods/ResKind;
    iget-object v14, v11, Lcom/pymcl/android/data/AiToolHostImpl$install$1;->L$2:Ljava/lang/Object;

    check-cast v14, Lkotlin/jvm/functions/Function2;

    .end local p3    # "progress":Lkotlin/jvm/functions/Function2;
    .local v14, "progress":Lkotlin/jvm/functions/Function2;
    iget-object v15, v11, Lcom/pymcl/android/data/AiToolHostImpl$install$1;->L$1:Ljava/lang/Object;

    move-object v1, v15

    check-cast v1, Ljava/util/Map;

    .end local p2    # "a":Ljava/util/Map;
    .local v1, "a":Ljava/util/Map;
    iget-object v15, v11, Lcom/pymcl/android/data/AiToolHostImpl$install$1;->L$0:Ljava/lang/Object;

    check-cast v15, Ljava/lang/String;

    .end local p1    # "kind":Ljava/lang/String;
    .local v15, "kind":Ljava/lang/String;
    invoke-static {v3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object v2, v4

    move-object/from16 v20, v8

    move-object v4, v3

    goto/16 :goto_9

    .end local v1    # "a":Ljava/util/Map;
    .end local v4    # "f":Lcom/pymcl/core/mods/ModFile;
    .end local v5    # "files":Ljava/util/List;
    .end local v6    # "loader":Ljava/lang/String;
    .end local v7    # "mc":Ljava/lang/String;
    .end local v8    # "v":Ljava/lang/String;
    .end local v9    # "i":Lcom/pymcl/core/instance/Instance;
    .end local v10    # "hit":Lcom/pymcl/core/mods/ModHit;
    .end local v12    # "query":Ljava/lang/String;
    .end local v13    # "k":Lcom/pymcl/core/mods/ResKind;
    .end local v14    # "progress":Lkotlin/jvm/functions/Function2;
    .end local v15    # "kind":Ljava/lang/String;
    .restart local p1    # "kind":Ljava/lang/String;
    .restart local p2    # "a":Ljava/util/Map;
    .restart local p3    # "progress":Lkotlin/jvm/functions/Function2;
    :pswitch_1
    iget-object v4, v11, Lcom/pymcl/android/data/AiToolHostImpl$install$1;->L$6:Ljava/lang/Object;

    check-cast v4, Lcom/pymcl/core/mods/ModFile;

    .restart local v4    # "f":Lcom/pymcl/core/mods/ModFile;
    iget-object v5, v11, Lcom/pymcl/android/data/AiToolHostImpl$install$1;->L$5:Ljava/lang/Object;

    check-cast v5, Lcom/pymcl/core/mods/ModHit;

    .local v5, "hit":Lcom/pymcl/core/mods/ModHit;
    iget-object v6, v11, Lcom/pymcl/android/data/AiToolHostImpl$install$1;->L$4:Ljava/lang/Object;

    check-cast v6, Ljava/lang/String;

    .local v6, "query":Ljava/lang/String;
    iget-object v7, v11, Lcom/pymcl/android/data/AiToolHostImpl$install$1;->L$3:Ljava/lang/Object;

    check-cast v7, Lcom/pymcl/core/mods/ResKind;

    .local v7, "k":Lcom/pymcl/core/mods/ResKind;
    iget-object v8, v11, Lcom/pymcl/android/data/AiToolHostImpl$install$1;->L$2:Ljava/lang/Object;

    check-cast v8, Lkotlin/jvm/functions/Function2;

    .end local p3    # "progress":Lkotlin/jvm/functions/Function2;
    .local v8, "progress":Lkotlin/jvm/functions/Function2;
    iget-object v9, v11, Lcom/pymcl/android/data/AiToolHostImpl$install$1;->L$1:Ljava/lang/Object;

    move-object v1, v9

    check-cast v1, Ljava/util/Map;

    .end local p2    # "a":Ljava/util/Map;
    .restart local v1    # "a":Ljava/util/Map;
    iget-object v9, v11, Lcom/pymcl/android/data/AiToolHostImpl$install$1;->L$0:Ljava/lang/Object;

    check-cast v9, Ljava/lang/String;

    .end local p1    # "kind":Ljava/lang/String;
    .local v9, "kind":Ljava/lang/String;
    invoke-static {v3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object/from16 v16, v4

    move-object v13, v9

    move-object v4, v3

    goto/16 :goto_4

    .end local v1    # "a":Ljava/util/Map;
    .end local v4    # "f":Lcom/pymcl/core/mods/ModFile;
    .end local v5    # "hit":Lcom/pymcl/core/mods/ModHit;
    .end local v6    # "query":Ljava/lang/String;
    .end local v7    # "k":Lcom/pymcl/core/mods/ResKind;
    .end local v8    # "progress":Lkotlin/jvm/functions/Function2;
    .end local v9    # "kind":Ljava/lang/String;
    .restart local p1    # "kind":Ljava/lang/String;
    .restart local p2    # "a":Ljava/util/Map;
    .restart local p3    # "progress":Lkotlin/jvm/functions/Function2;
    :pswitch_2
    invoke-static {v3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 158
    sget-object v4, Lcom/pymcl/core/mods/ResKind;->Companion:Lcom/pymcl/core/mods/ResKind$Companion;

    move-object/from16 v13, p1

    invoke-virtual {v4, v13}, Lcom/pymcl/core/mods/ResKind$Companion;->of(Ljava/lang/String;)Lcom/pymcl/core/mods/ResKind;

    move-result-object v17

    .line 159
    .local v17, "k":Lcom/pymcl/core/mods/ResKind;
    sget-object v4, Lcom/pymcl/android/data/AiToolLogic;->INSTANCE:Lcom/pymcl/android/data/AiToolLogic;

    invoke-virtual {v4, v1}, Lcom/pymcl/android/data/AiToolLogic;->installQuery(Ljava/util/Map;)Ljava/lang/String;

    move-result-object v14

    .line 160
    .local v14, "query":Ljava/lang/String;
    const-string v4, "id"

    invoke-static {v1, v4}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_3

    move-object v5, v4

    .line 183
    .local v5, "it\\1":Ljava/lang/String;
    const/4 v6, 0x0

    .line 160
    .local v6, "$i$a$-takeIf-AiToolHostImpl$install$hit$1\\1\\160\\0":I
    move-object v7, v5

    check-cast v7, Ljava/lang/CharSequence;

    const/16 v8, 0x3a

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v15, 0x2

    invoke-static {v7, v8, v9, v15, v10}, Lkotlin/text/StringsKt;->contains$default(Ljava/lang/CharSequence;CZILjava/lang/Object;)Z

    move-result v5

    .end local v5    # "it\\1":Ljava/lang/String;
    .end local v6    # "$i$a$-takeIf-AiToolHostImpl$install$hit$1\\1\\160\\0":I
    if-eqz v5, :cond_1

    goto :goto_1

    :cond_1
    const/4 v4, 0x0

    :goto_1
    if-eqz v4, :cond_3

    .line 183
    .local v4, "it\\2":Ljava/lang/String;
    const/4 v5, 0x0

    .line 160
    .local v5, "$i$a$-let-AiToolHostImpl$install$hit$2\\2\\160\\0":I
    invoke-direct {v0}, Lcom/pymcl/android/data/AiToolHostImpl;->getRepo()Lcom/pymcl/android/data/LauncherRepository;

    move-result-object v6

    invoke-virtual {v6}, Lcom/pymcl/android/data/LauncherRepository;->getCatalog()Lcom/pymcl/core/mods/ModCatalog;

    move-result-object v6

    invoke-virtual {v6, v4}, Lcom/pymcl/core/mods/ModCatalog;->project(Ljava/lang/String;)Lcom/pymcl/core/mods/ModHit;

    move-result-object v4

    .end local v4    # "it\\2":Ljava/lang/String;
    .end local v5    # "$i$a$-let-AiToolHostImpl$install$hit$2\\2\\160\\0":I
    if-nez v4, :cond_2

    goto :goto_2

    :cond_2
    move-object/from16 v15, v17

    goto :goto_3

    .line 161
    :cond_3
    :goto_2
    sget-object v4, Lcom/pymcl/android/data/AiToolLogic;->INSTANCE:Lcom/pymcl/android/data/AiToolLogic;

    invoke-direct {v0}, Lcom/pymcl/android/data/AiToolHostImpl;->getRepo()Lcom/pymcl/android/data/LauncherRepository;

    move-result-object v5

    invoke-virtual {v5}, Lcom/pymcl/android/data/LauncherRepository;->getCatalog()Lcom/pymcl/core/mods/ModCatalog;

    move-result-object v16

    const-string v5, "slug"

    invoke-static {v1, v5}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const-string v6, "name"

    if-nez v5, :cond_4

    invoke-static {v1, v6}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    if-nez v5, :cond_4

    move-object v5, v14

    :cond_4
    check-cast v5, Ljava/lang/CharSequence;

    invoke-static {v5}, Lkotlin/text/StringsKt;->trim(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v18

    invoke-direct {v0, v1}, Lcom/pymcl/android/data/AiToolHostImpl;->sourceOf(Ljava/util/Map;)Ljava/lang/String;

    move-result-object v19

    const/16 v23, 0x38

    const/16 v24, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    invoke-static/range {v16 .. v24}, Lcom/pymcl/core/mods/ModCatalog;->search$default(Lcom/pymcl/core/mods/ModCatalog;Lcom/pymcl/core/mods/ResKind;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/Object;)Ljava/util/List;

    move-result-object v5

    move-object/from16 v15, v17

    .end local v17    # "k":Lcom/pymcl/core/mods/ResKind;
    .local v15, "k":Lcom/pymcl/core/mods/ResKind;
    invoke-static {v1, v6}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v5, v14, v6}, Lcom/pymcl/android/data/AiToolLogic;->pickHit(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)Lcom/pymcl/core/mods/ModHit;

    move-result-object v4

    .line 160
    if-nez v4, :cond_5

    .line 162
    sget-object v4, Lcom/pymcl/ai/ToolOutput;->Companion:Lcom/pymcl/ai/ToolOutput$Companion;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "\u6ca1\u641c\u5230\u300c"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    const-string v6, "\u300d"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Lcom/pymcl/ai/ToolOutput$Companion;->err(Ljava/lang/String;)Lcom/pymcl/ai/ToolOutput;

    move-result-object v4

    return-object v4

    .line 163
    .local v4, "hit":Lcom/pymcl/core/mods/ModHit;
    :cond_5
    :goto_3
    sget-object v5, Lcom/pymcl/core/mods/ResKind;->MODPACK:Lcom/pymcl/core/mods/ResKind;

    if-ne v15, v5, :cond_8

    .line 164
    invoke-direct {v0}, Lcom/pymcl/android/data/AiToolHostImpl;->getRepo()Lcom/pymcl/android/data/LauncherRepository;

    move-result-object v5

    invoke-virtual {v5}, Lcom/pymcl/android/data/LauncherRepository;->getCatalog()Lcom/pymcl/core/mods/ModCatalog;

    move-result-object v16

    invoke-virtual {v4}, Lcom/pymcl/core/mods/ModHit;->getId()Ljava/lang/String;

    move-result-object v17

    const/16 v20, 0x6

    const/16 v21, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    invoke-static/range {v16 .. v21}, Lcom/pymcl/core/mods/ModCatalog;->files$default(Lcom/pymcl/core/mods/ModCatalog;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/util/List;

    move-result-object v5

    invoke-static {v5}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/pymcl/core/mods/ModFile;

    if-nez v5, :cond_6

    sget-object v5, Lcom/pymcl/ai/ToolOutput;->Companion:Lcom/pymcl/ai/ToolOutput$Companion;

    invoke-virtual {v4}, Lcom/pymcl/core/mods/ModHit;->getTitle()Ljava/lang/String;

    move-result-object v6

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    const-string v7, " \u6ca1\u6709\u53ef\u4e0b\u8f7d\u7684\u6587\u4ef6"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Lcom/pymcl/ai/ToolOutput$Companion;->err(Ljava/lang/String;)Lcom/pymcl/ai/ToolOutput;

    move-result-object v5

    return-object v5

    :cond_6
    move-object/from16 v16, v5

    .line 165
    .local v16, "f":Lcom/pymcl/core/mods/ModFile;
    iget-object v5, v0, Lcom/pymcl/android/data/AiToolHostImpl;->api:Lcom/pymcl/android/data/RepositoryUiApi;

    invoke-virtual {v4}, Lcom/pymcl/core/mods/ModHit;->getId()Ljava/lang/String;

    move-result-object v8

    invoke-virtual/range {v16 .. v16}, Lcom/pymcl/core/mods/ModFile;->getId()Ljava/lang/String;

    move-result-object v9

    invoke-static {v13}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    iput-object v6, v11, Lcom/pymcl/android/data/AiToolHostImpl$install$1;->L$0:Ljava/lang/Object;

    invoke-static {v1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    iput-object v6, v11, Lcom/pymcl/android/data/AiToolHostImpl$install$1;->L$1:Ljava/lang/Object;

    invoke-static/range {p3 .. p3}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    iput-object v6, v11, Lcom/pymcl/android/data/AiToolHostImpl$install$1;->L$2:Ljava/lang/Object;

    invoke-static {v15}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    iput-object v6, v11, Lcom/pymcl/android/data/AiToolHostImpl$install$1;->L$3:Ljava/lang/Object;

    invoke-static {v14}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    iput-object v6, v11, Lcom/pymcl/android/data/AiToolHostImpl$install$1;->L$4:Ljava/lang/Object;

    iput-object v4, v11, Lcom/pymcl/android/data/AiToolHostImpl$install$1;->L$5:Ljava/lang/Object;

    invoke-static/range {v16 .. v16}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    iput-object v6, v11, Lcom/pymcl/android/data/AiToolHostImpl$install$1;->L$6:Ljava/lang/Object;

    const/4 v6, 0x1

    iput v6, v11, Lcom/pymcl/android/data/AiToolHostImpl$install$1;->label:I

    move-object v6, v4

    move-object v4, v5

    .end local v4    # "hit":Lcom/pymcl/core/mods/ModHit;
    .local v6, "hit":Lcom/pymcl/core/mods/ModHit;
    const-string v5, "modpack"

    move-object v7, v6

    .end local v6    # "hit":Lcom/pymcl/core/mods/ModHit;
    .local v7, "hit":Lcom/pymcl/core/mods/ModHit;
    const-string v6, ""

    move-object v10, v7

    .end local v7    # "hit":Lcom/pymcl/core/mods/ModHit;
    .restart local v10    # "hit":Lcom/pymcl/core/mods/ModHit;
    const-string v7, ""

    move-object/from16 v17, v10

    move-object/from16 v10, p3

    .end local v10    # "hit":Lcom/pymcl/core/mods/ModHit;
    .local v17, "hit":Lcom/pymcl/core/mods/ModHit;
    invoke-virtual/range {v4 .. v11}, Lcom/pymcl/android/data/RepositoryUiApi;->installMod(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v12, :cond_7

    .line 157
    return-object v12

    .line 165
    :cond_7
    move-object/from16 v8, p3

    move-object v6, v14

    move-object v7, v15

    move-object/from16 v5, v17

    .line 157
    .end local v14    # "query":Ljava/lang/String;
    .end local v15    # "k":Lcom/pymcl/core/mods/ResKind;
    .end local v17    # "hit":Lcom/pymcl/core/mods/ModHit;
    .end local p1    # "kind":Ljava/lang/String;
    .end local p2    # "a":Ljava/util/Map;
    .end local p3    # "progress":Lkotlin/jvm/functions/Function2;
    .restart local v1    # "a":Ljava/util/Map;
    .local v5, "hit":Lcom/pymcl/core/mods/ModHit;
    .local v6, "query":Ljava/lang/String;
    .local v7, "k":Lcom/pymcl/core/mods/ResKind;
    .restart local v8    # "progress":Lkotlin/jvm/functions/Function2;
    .local v13, "kind":Ljava/lang/String;
    :goto_4
    check-cast v4, Ljava/lang/String;

    .line 166
    .local v4, "r":Ljava/lang/String;
    sget-object v9, Lcom/pymcl/ai/ToolOutput;->Companion:Lcom/pymcl/ai/ToolOutput$Companion;

    invoke-virtual {v5}, Lcom/pymcl/core/mods/ModHit;->getTitle()Ljava/lang/String;

    move-result-object v10

    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    const-string v14, "\u6574\u5408\u5305 "

    invoke-virtual {v12, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v12

    invoke-virtual {v12, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    const-string v12, " \u5df2\u5b89\u88c5\u4e3a "

    invoke-virtual {v10, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {v10, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    const/4 v12, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x2

    invoke-static {v9, v10, v12, v15, v14}, Lcom/pymcl/ai/ToolOutput$Companion;->ok$default(Lcom/pymcl/ai/ToolOutput$Companion;Ljava/lang/String;ZILjava/lang/Object;)Lcom/pymcl/ai/ToolOutput;

    move-result-object v9

    return-object v9

    .line 168
    .end local v1    # "a":Ljava/util/Map;
    .end local v5    # "hit":Lcom/pymcl/core/mods/ModHit;
    .end local v6    # "query":Ljava/lang/String;
    .end local v7    # "k":Lcom/pymcl/core/mods/ResKind;
    .end local v8    # "progress":Lkotlin/jvm/functions/Function2;
    .end local v13    # "kind":Ljava/lang/String;
    .end local v16    # "f":Lcom/pymcl/core/mods/ModFile;
    .local v4, "hit":Lcom/pymcl/core/mods/ModHit;
    .restart local v14    # "query":Ljava/lang/String;
    .restart local v15    # "k":Lcom/pymcl/core/mods/ResKind;
    .restart local p1    # "kind":Ljava/lang/String;
    .restart local p2    # "a":Ljava/util/Map;
    .restart local p3    # "progress":Lkotlin/jvm/functions/Function2;
    :cond_8
    move-object/from16 v17, v4

    .end local v4    # "hit":Lcom/pymcl/core/mods/ModHit;
    .restart local v17    # "hit":Lcom/pymcl/core/mods/ModHit;
    invoke-direct {v0, v1}, Lcom/pymcl/android/data/AiToolHostImpl;->instOf(Ljava/util/Map;)Lcom/pymcl/core/instance/Instance;

    move-result-object v4

    .local v4, "i":Lcom/pymcl/core/instance/Instance;
    invoke-direct {v0, v4, v1}, Lcom/pymcl/android/data/AiToolHostImpl;->versionOf(Lcom/pymcl/core/instance/Instance;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v7

    .local v7, "v":Ljava/lang/String;
    invoke-direct {v0, v4, v7}, Lcom/pymcl/android/data/AiToolHostImpl;->mcOf(Lcom/pymcl/core/instance/Instance;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .local v5, "mc":Ljava/lang/String;
    sget-object v6, Lcom/pymcl/core/mods/ResKind;->MOD:Lcom/pymcl/core/mods/ResKind;

    if-ne v15, v6, :cond_9

    invoke-direct {v0, v7}, Lcom/pymcl/android/data/AiToolHostImpl;->loaderOf(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    goto :goto_5

    :cond_9
    const-string v6, ""

    .line 169
    .local v6, "loader":Ljava/lang/String;
    :goto_5
    invoke-direct {v0}, Lcom/pymcl/android/data/AiToolHostImpl;->getRepo()Lcom/pymcl/android/data/LauncherRepository;

    move-result-object v8

    invoke-virtual {v8}, Lcom/pymcl/android/data/LauncherRepository;->getCatalog()Lcom/pymcl/core/mods/ModCatalog;

    move-result-object v8

    invoke-virtual/range {v17 .. v17}, Lcom/pymcl/core/mods/ModHit;->getId()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v9, v5, v6}, Lcom/pymcl/core/mods/ModCatalog;->files(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;

    move-result-object v8

    check-cast v8, Ljava/lang/Iterable;

    .local v8, "$this$filter\\3":Ljava/lang/Iterable;
    const/4 v9, 0x0

    .line 184
    .local v9, "$i$f$filter\\3\\169":I
    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    check-cast v10, Ljava/util/Collection;

    .local v10, "destination\\4":Ljava/util/Collection;
    move-object/from16 v16, v8

    .local v16, "$this$filterTo\\4":Ljava/lang/Iterable;
    const/16 v18, 0x0

    .line 185
    .local v18, "$i$f$filterTo\\4\\184":I
    invoke-interface/range {v16 .. v16}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v19

    :goto_6
    invoke-interface/range {v19 .. v19}, Ljava/util/Iterator;->hasNext()Z

    move-result v20

    if-eqz v20, :cond_b

    invoke-interface/range {v19 .. v19}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    .local v1, "element\\4":Ljava/lang/Object;
    move-object v2, v1

    check-cast v2, Lcom/pymcl/core/mods/ModFile;

    .local v2, "it\\5":Lcom/pymcl/core/mods/ModFile;
    const/16 v20, 0x0

    .line 169
    .local v20, "$i$a$-filter-AiToolHostImpl$install$files$1\\5\\185\\0":I
    invoke-virtual {v2, v5, v6}, Lcom/pymcl/core/mods/ModFile;->matches(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v2

    .line 185
    .end local v2    # "it\\5":Lcom/pymcl/core/mods/ModFile;
    .end local v20    # "$i$a$-filter-AiToolHostImpl$install$files$1\\5\\185\\0":I
    if-eqz v2, :cond_a

    invoke-interface {v10, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    :cond_a
    move-object/from16 v1, p2

    move-object/from16 v2, p4

    goto :goto_6

    .line 186
    .end local v1    # "element\\4":Ljava/lang/Object;
    :cond_b
    nop

    .end local v10    # "destination\\4":Ljava/util/Collection;
    .end local v16    # "$this$filterTo\\4":Ljava/lang/Iterable;
    .end local v18    # "$i$f$filterTo\\4\\184":I
    move-object v1, v10

    check-cast v1, Ljava/util/List;

    .line 184
    nop

    .end local v8    # "$this$filter\\3":Ljava/lang/Iterable;
    .end local v9    # "$i$f$filter\\3\\169":I
    check-cast v1, Ljava/util/Collection;

    .line 169
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_e

    .line 183
    const/4 v1, 0x0

    .line 169
    .local v1, "$i$a$-ifEmpty-AiToolHostImpl$install$files$2\\6\\169\\0":I
    sget-object v2, Lcom/pymcl/core/mods/ResKind;->WORLD:Lcom/pymcl/core/mods/ResKind;

    if-eq v15, v2, :cond_d

    sget-object v2, Lcom/pymcl/core/mods/ResKind;->RESOURCE:Lcom/pymcl/core/mods/ResKind;

    if-eq v15, v2, :cond_d

    sget-object v2, Lcom/pymcl/core/mods/ResKind;->SHADER:Lcom/pymcl/core/mods/ResKind;

    if-ne v15, v2, :cond_c

    goto :goto_7

    :cond_c
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v2

    goto :goto_8

    :cond_d
    :goto_7
    invoke-direct {v0}, Lcom/pymcl/android/data/AiToolHostImpl;->getRepo()Lcom/pymcl/android/data/LauncherRepository;

    move-result-object v2

    invoke-virtual {v2}, Lcom/pymcl/android/data/LauncherRepository;->getCatalog()Lcom/pymcl/core/mods/ModCatalog;

    move-result-object v18

    invoke-virtual/range {v17 .. v17}, Lcom/pymcl/core/mods/ModHit;->getId()Ljava/lang/String;

    move-result-object v19

    const/16 v22, 0x6

    const/16 v23, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    invoke-static/range {v18 .. v23}, Lcom/pymcl/core/mods/ModCatalog;->files$default(Lcom/pymcl/core/mods/ModCatalog;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/util/List;

    move-result-object v2

    :goto_8
    move-object v1, v2

    .end local v1    # "$i$a$-ifEmpty-AiToolHostImpl$install$files$2\\6\\169\\0":I
    :cond_e
    check-cast v1, Ljava/util/List;

    .line 170
    .local v1, "files":Ljava/util/List;
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/pymcl/core/mods/ModFile;

    if-nez v2, :cond_f

    sget-object v2, Lcom/pymcl/ai/ToolOutput;->Companion:Lcom/pymcl/ai/ToolOutput$Companion;

    sget-object v8, Lcom/pymcl/android/data/AiToolLogic;->INSTANCE:Lcom/pymcl/android/data/AiToolLogic;

    invoke-virtual/range {v17 .. v17}, Lcom/pymcl/core/mods/ModHit;->getTitle()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v9, v5, v6}, Lcom/pymcl/android/data/AiToolLogic;->noFileMessage(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v2, v8}, Lcom/pymcl/ai/ToolOutput$Companion;->err(Ljava/lang/String;)Lcom/pymcl/ai/ToolOutput;

    move-result-object v2

    return-object v2

    .line 171
    .local v2, "f":Lcom/pymcl/core/mods/ModFile;
    :cond_f
    iget-object v8, v0, Lcom/pymcl/android/data/AiToolHostImpl;->api:Lcom/pymcl/android/data/RepositoryUiApi;

    move-object v9, v6

    .end local v6    # "loader":Ljava/lang/String;
    .local v9, "loader":Ljava/lang/String;
    invoke-virtual {v4}, Lcom/pymcl/core/instance/Instance;->getName()Ljava/lang/String;

    move-result-object v6

    move-object v10, v8

    invoke-virtual/range {v17 .. v17}, Lcom/pymcl/core/mods/ModHit;->getId()Ljava/lang/String;

    move-result-object v8

    move-object/from16 v16, v9

    .end local v9    # "loader":Ljava/lang/String;
    .local v16, "loader":Ljava/lang/String;
    invoke-virtual {v2}, Lcom/pymcl/core/mods/ModFile;->getId()Ljava/lang/String;

    move-result-object v9

    invoke-static {v13}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, v11, Lcom/pymcl/android/data/AiToolHostImpl$install$1;->L$0:Ljava/lang/Object;

    invoke-static/range {p2 .. p2}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, v11, Lcom/pymcl/android/data/AiToolHostImpl$install$1;->L$1:Ljava/lang/Object;

    invoke-static/range {p3 .. p3}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, v11, Lcom/pymcl/android/data/AiToolHostImpl$install$1;->L$2:Ljava/lang/Object;

    invoke-static {v15}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, v11, Lcom/pymcl/android/data/AiToolHostImpl$install$1;->L$3:Ljava/lang/Object;

    invoke-static {v14}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, v11, Lcom/pymcl/android/data/AiToolHostImpl$install$1;->L$4:Ljava/lang/Object;

    move-object/from16 v0, v17

    .end local v17    # "hit":Lcom/pymcl/core/mods/ModHit;
    .local v0, "hit":Lcom/pymcl/core/mods/ModHit;
    iput-object v0, v11, Lcom/pymcl/android/data/AiToolHostImpl$install$1;->L$5:Ljava/lang/Object;

    iput-object v4, v11, Lcom/pymcl/android/data/AiToolHostImpl$install$1;->L$6:Ljava/lang/Object;

    iput-object v7, v11, Lcom/pymcl/android/data/AiToolHostImpl$install$1;->L$7:Ljava/lang/Object;

    .end local v0    # "hit":Lcom/pymcl/core/mods/ModHit;
    .restart local v17    # "hit":Lcom/pymcl/core/mods/ModHit;
    invoke-static {v5}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, v11, Lcom/pymcl/android/data/AiToolHostImpl$install$1;->L$8:Ljava/lang/Object;

    invoke-static/range {v16 .. v16}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, v11, Lcom/pymcl/android/data/AiToolHostImpl$install$1;->L$9:Ljava/lang/Object;

    invoke-static {v1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, v11, Lcom/pymcl/android/data/AiToolHostImpl$install$1;->L$10:Ljava/lang/Object;

    iput-object v2, v11, Lcom/pymcl/android/data/AiToolHostImpl$install$1;->L$11:Ljava/lang/Object;

    const/4 v0, 0x2

    iput v0, v11, Lcom/pymcl/android/data/AiToolHostImpl$install$1;->label:I

    move-object v0, v13

    move-object v13, v5

    move-object v5, v0

    move-object v0, v4

    move-object v4, v10

    move-object/from16 v10, p3

    .end local v4    # "i":Lcom/pymcl/core/instance/Instance;
    .end local v5    # "mc":Ljava/lang/String;
    .local v0, "i":Lcom/pymcl/core/instance/Instance;
    .local v13, "mc":Ljava/lang/String;
    invoke-virtual/range {v4 .. v11}, Lcom/pymcl/android/data/RepositoryUiApi;->installMod(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v12, :cond_10

    .line 157
    return-object v12

    .line 171
    :cond_10
    move-object v9, v0

    move-object v5, v1

    move-object/from16 v20, v7

    move-object v7, v13

    move-object v12, v14

    move-object v13, v15

    move-object/from16 v6, v16

    move-object/from16 v10, v17

    move-object/from16 v15, p1

    move-object/from16 v1, p2

    move-object/from16 v14, p3

    .line 157
    .end local v0    # "i":Lcom/pymcl/core/instance/Instance;
    .end local v16    # "loader":Ljava/lang/String;
    .end local v17    # "hit":Lcom/pymcl/core/mods/ModHit;
    .end local p1    # "kind":Ljava/lang/String;
    .end local p2    # "a":Ljava/util/Map;
    .end local p3    # "progress":Lkotlin/jvm/functions/Function2;
    .local v1, "a":Ljava/util/Map;
    .local v5, "files":Ljava/util/List;
    .restart local v6    # "loader":Ljava/lang/String;
    .local v7, "mc":Ljava/lang/String;
    .local v9, "i":Lcom/pymcl/core/instance/Instance;
    .local v10, "hit":Lcom/pymcl/core/mods/ModHit;
    .restart local v12    # "query":Ljava/lang/String;
    .local v13, "k":Lcom/pymcl/core/mods/ResKind;
    .local v14, "progress":Lkotlin/jvm/functions/Function2;
    .local v15, "kind":Ljava/lang/String;
    .local v20, "v":Ljava/lang/String;
    :goto_9
    move-object/from16 v18, v4

    check-cast v18, Ljava/lang/String;

    .line 172
    .local v18, "out":Ljava/lang/String;
    sget-object v0, Lcom/pymcl/ai/ToolOutput;->Companion:Lcom/pymcl/ai/ToolOutput$Companion;

    sget-object v16, Lcom/pymcl/android/data/AiToolLogic;->INSTANCE:Lcom/pymcl/android/data/AiToolLogic;

    invoke-virtual {v10}, Lcom/pymcl/core/mods/ModHit;->getTitle()Ljava/lang/String;

    move-result-object v17

    invoke-virtual {v9}, Lcom/pymcl/core/instance/Instance;->getName()Ljava/lang/String;

    move-result-object v19

    invoke-virtual {v2}, Lcom/pymcl/core/mods/ModFile;->getRequiredDeps()Ljava/util/List;

    move-result-object v21

    invoke-virtual/range {v16 .. v21}, Lcom/pymcl/android/data/AiToolLogic;->installedMessage(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Ljava/lang/String;

    move-result-object v4

    move-object/from16 p1, v1

    move-object/from16 p2, v2

    const/4 v1, 0x0

    const/4 v2, 0x2

    const/4 v8, 0x0

    .end local v1    # "a":Ljava/util/Map;
    .end local v2    # "f":Lcom/pymcl/core/mods/ModFile;
    .local p1, "a":Ljava/util/Map;
    .local p2, "f":Lcom/pymcl/core/mods/ModFile;
    invoke-static {v0, v4, v8, v2, v1}, Lcom/pymcl/ai/ToolOutput$Companion;->ok$default(Lcom/pymcl/ai/ToolOutput$Companion;Ljava/lang/String;ZILjava/lang/Object;)Lcom/pymcl/ai/ToolOutput;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private final loaderOf(Ljava/lang/String;)Ljava/lang/String;
    .locals 1
    .param p1, "v"    # Ljava/lang/String;

    .line 43
    sget-object v0, Lcom/pymcl/android/data/AiToolLogic;->INSTANCE:Lcom/pymcl/android/data/AiToolLogic;

    invoke-virtual {v0, p1}, Lcom/pymcl/android/data/AiToolLogic;->loaderOf(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private final mcOf(Lcom/pymcl/core/instance/Instance;Ljava/lang/String;)Ljava/lang/String;
    .locals 5
    .param p1, "i"    # Lcom/pymcl/core/instance/Instance;
    .param p2, "v"    # Ljava/lang/String;

    .line 42
    :try_start_0
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object v0, p0

    check-cast v0, Lcom/pymcl/android/data/AiToolHostImpl;

    .line 183
    .local v0, "$this$mcOf_u24lambda_u240\\1":Lcom/pymcl/android/data/AiToolHostImpl;
    const/4 v1, 0x0

    .line 42
    .local v1, "$i$a$-runCatching-AiToolHostImpl$mcOf$1\\1\\42\\0":I
    sget-object v2, Lcom/pymcl/core/util/FileUtil;->INSTANCE:Lcom/pymcl/core/util/FileUtil;

    invoke-virtual {p1, p2}, Lcom/pymcl/core/instance/Instance;->versionJson(Ljava/lang/String;)Ljava/io/File;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/pymcl/core/util/FileUtil;->readJsonObj(Ljava/io/File;)Ljava/util/Map;

    move-result-object v2

    .line 183
    .local v2, "it\\2":Ljava/util/Map;
    const/4 v3, 0x0

    .line 42
    .local v3, "$i$a$-let-AiToolHostImpl$mcOf$1$1\\2\\42\\1":I
    const-string v4, "inheritsFrom"

    invoke-static {v2, v4}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    if-nez v4, :cond_0

    const-string v4, "id"

    invoke-static {v2, v4}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .end local v0    # "$this$mcOf_u24lambda_u240\\1":Lcom/pymcl/android/data/AiToolHostImpl;
    .end local v1    # "$i$a$-runCatching-AiToolHostImpl$mcOf$1\\1\\42\\0":I
    .end local v2    # "it\\2":Ljava/util/Map;
    .end local v3    # "$i$a$-let-AiToolHostImpl$mcOf$1$1\\2\\42\\1":I
    :cond_0
    invoke-static {v4}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

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
    invoke-static {v0}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v0, 0x0

    :cond_1
    check-cast v0, Ljava/lang/String;

    if-nez v0, :cond_2

    move-object v0, p2

    :cond_2
    return-object v0
.end method

.method private final modInfo(Ljava/io/File;)Ljava/util/Map;
    .locals 1
    .param p1, "f"    # Ljava/io/File;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/io/File;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 180
    sget-object v0, Lcom/pymcl/android/data/AiToolLogic;->INSTANCE:Lcom/pymcl/android/data/AiToolLogic;

    invoke-virtual {v0, p1}, Lcom/pymcl/android/data/AiToolLogic;->modInfo(Ljava/io/File;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method private final resolveMod(Lcom/pymcl/core/instance/Instance;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 17
    .param p1, "i"    # Lcom/pymcl/core/instance/Instance;
    .param p2, "v"    # Ljava/lang/String;
    .param p3, "name"    # Ljava/lang/String;
    .param p4, "$completion"    # Lkotlin/coroutines/Continuation;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/pymcl/core/instance/Instance;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p4

    instance-of v2, v1, Lcom/pymcl/android/data/AiToolHostImpl$resolveMod$1;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Lcom/pymcl/android/data/AiToolHostImpl$resolveMod$1;

    iget v3, v2, Lcom/pymcl/android/data/AiToolHostImpl$resolveMod$1;->label:I

    const/high16 v4, -0x80000000

    and-int/2addr v3, v4

    if-eqz v3, :cond_0

    iget v3, v2, Lcom/pymcl/android/data/AiToolHostImpl$resolveMod$1;->label:I

    sub-int/2addr v3, v4

    iput v3, v2, Lcom/pymcl/android/data/AiToolHostImpl$resolveMod$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v2, Lcom/pymcl/android/data/AiToolHostImpl$resolveMod$1;

    invoke-direct {v2, v0, v1}, Lcom/pymcl/android/data/AiToolHostImpl$resolveMod$1;-><init>(Lcom/pymcl/android/data/AiToolHostImpl;Lkotlin/coroutines/Continuation;)V

    .local v2, "$continuation":Lkotlin/coroutines/Continuation;
    :goto_0
    iget-object v3, v2, Lcom/pymcl/android/data/AiToolHostImpl$resolveMod$1;->result:Ljava/lang/Object;

    .local v3, "$result":Ljava/lang/Object;
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v4

    .line 175
    iget v5, v2, Lcom/pymcl/android/data/AiToolHostImpl$resolveMod$1;->label:I

    packed-switch v5, :pswitch_data_0

    move-object/from16 v9, p2

    move-object/from16 v8, p3

    .end local v2    # "$continuation":Lkotlin/coroutines/Continuation;
    .end local v3    # "$result":Ljava/lang/Object;
    new-instance v2, Ljava/lang/IllegalStateException;

    const-string v3, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v2, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v2

    .restart local v2    # "$continuation":Lkotlin/coroutines/Continuation;
    .restart local v3    # "$result":Ljava/lang/Object;
    :pswitch_0
    iget-object v4, v2, Lcom/pymcl/android/data/AiToolHostImpl$resolveMod$1;->L$3:Ljava/lang/Object;

    check-cast v4, Lcom/pymcl/android/data/AiToolLogic;

    iget-object v5, v2, Lcom/pymcl/android/data/AiToolHostImpl$resolveMod$1;->L$2:Ljava/lang/Object;

    check-cast v5, Ljava/lang/String;

    .end local p3    # "name":Ljava/lang/String;
    .local v5, "name":Ljava/lang/String;
    iget-object v6, v2, Lcom/pymcl/android/data/AiToolHostImpl$resolveMod$1;->L$1:Ljava/lang/Object;

    check-cast v6, Ljava/lang/String;

    .end local p2    # "v":Ljava/lang/String;
    .local v6, "v":Ljava/lang/String;
    iget-object v7, v2, Lcom/pymcl/android/data/AiToolHostImpl$resolveMod$1;->L$0:Ljava/lang/Object;

    check-cast v7, Lcom/pymcl/core/instance/Instance;

    .end local p1    # "i":Lcom/pymcl/core/instance/Instance;
    .local v7, "i":Lcom/pymcl/core/instance/Instance;
    invoke-static {v3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object v8, v3

    goto :goto_1

    .end local v5    # "name":Ljava/lang/String;
    .end local v6    # "v":Ljava/lang/String;
    .end local v7    # "i":Lcom/pymcl/core/instance/Instance;
    .restart local p1    # "i":Lcom/pymcl/core/instance/Instance;
    .restart local p2    # "v":Ljava/lang/String;
    .restart local p3    # "name":Ljava/lang/String;
    :pswitch_1
    invoke-static {v3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 176
    sget-object v5, Lcom/pymcl/android/data/AiToolLogic;->INSTANCE:Lcom/pymcl/android/data/AiToolLogic;

    iget-object v6, v0, Lcom/pymcl/android/data/AiToolHostImpl;->api:Lcom/pymcl/android/data/RepositoryUiApi;

    invoke-virtual/range {p1 .. p1}, Lcom/pymcl/core/instance/Instance;->getName()Ljava/lang/String;

    move-result-object v7

    invoke-static/range {p1 .. p1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    iput-object v8, v2, Lcom/pymcl/android/data/AiToolHostImpl$resolveMod$1;->L$0:Ljava/lang/Object;

    invoke-static/range {p2 .. p2}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    iput-object v8, v2, Lcom/pymcl/android/data/AiToolHostImpl$resolveMod$1;->L$1:Ljava/lang/Object;

    move-object/from16 v8, p3

    iput-object v8, v2, Lcom/pymcl/android/data/AiToolHostImpl$resolveMod$1;->L$2:Ljava/lang/Object;

    iput-object v5, v2, Lcom/pymcl/android/data/AiToolHostImpl$resolveMod$1;->L$3:Ljava/lang/Object;

    const/4 v9, 0x1

    iput v9, v2, Lcom/pymcl/android/data/AiToolHostImpl$resolveMod$1;->label:I

    move-object/from16 v9, p2

    invoke-virtual {v6, v7, v9, v2}, Lcom/pymcl/android/data/RepositoryUiApi;->getInstalledMods(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v4, :cond_1

    .line 175
    return-object v4

    .line 176
    :cond_1
    move-object/from16 v7, p1

    move-object v4, v5

    move-object v5, v8

    move-object v8, v6

    move-object v6, v9

    .line 175
    .end local p1    # "i":Lcom/pymcl/core/instance/Instance;
    .end local p2    # "v":Ljava/lang/String;
    .end local p3    # "name":Ljava/lang/String;
    .restart local v5    # "name":Ljava/lang/String;
    .restart local v6    # "v":Ljava/lang/String;
    .restart local v7    # "i":Lcom/pymcl/core/instance/Instance;
    :goto_1
    check-cast v8, Ljava/lang/Iterable;

    .local v8, "$this$map\\1":Ljava/lang/Iterable;
    const/4 v9, 0x0

    .line 187
    .local v9, "$i$f$map\\1\\176":I
    new-instance v10, Ljava/util/ArrayList;

    const/16 v11, 0xa

    invoke-static {v8, v11}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v11

    invoke-direct {v10, v11}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v10, Ljava/util/Collection;

    .local v10, "destination\\2":Ljava/util/Collection;
    move-object v11, v8

    .local v11, "$this$mapTo\\2":Ljava/lang/Iterable;
    const/4 v12, 0x0

    .line 188
    .local v12, "$i$f$mapTo\\2\\187":I
    invoke-interface {v11}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v13

    :goto_2
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    move-result v14

    if-eqz v14, :cond_2

    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v14

    .line 189
    .local v14, "item\\2":Ljava/lang/Object;
    move-object v15, v14

    check-cast v15, Lcom/pymcl/android/ui/state/InstalledEntry;

    .local v15, "it\\3":Lcom/pymcl/android/ui/state/InstalledEntry;
    const/16 v16, 0x0

    .line 176
    .local v16, "$i$a$-map-AiToolHostImpl$resolveMod$2\\3\\189\\0":I
    invoke-virtual {v15}, Lcom/pymcl/android/ui/state/InstalledEntry;->getFilename()Ljava/lang/String;

    move-result-object v15

    .line 189
    .end local v15    # "it\\3":Lcom/pymcl/android/ui/state/InstalledEntry;
    .end local v16    # "$i$a$-map-AiToolHostImpl$resolveMod$2\\3\\189\\0":I
    invoke-interface {v10, v15}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 190
    .end local v14    # "item\\2":Ljava/lang/Object;
    :cond_2
    nop

    .end local v10    # "destination\\2":Ljava/util/Collection;
    .end local v11    # "$this$mapTo\\2":Ljava/lang/Iterable;
    .end local v12    # "$i$f$mapTo\\2\\187":I
    check-cast v10, Ljava/util/List;

    .line 187
    nop

    .line 176
    .end local v8    # "$this$map\\1":Ljava/lang/Iterable;
    .end local v9    # "$i$f$map\\1\\176":I
    invoke-virtual {v4, v10, v5}, Lcom/pymcl/android/data/AiToolLogic;->resolveModName(Ljava/util/List;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_3

    return-object v4

    :cond_3
    new-instance v4, Ljava/lang/IllegalArgumentException;

    sget-object v8, Lcom/pymcl/android/data/AiToolLogic;->INSTANCE:Lcom/pymcl/android/data/AiToolLogic;

    invoke-virtual {v8, v5}, Lcom/pymcl/android/data/AiToolLogic;->noModMessage(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-direct {v4, v8}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v4

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private final search(Ljava/lang/String;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 11
    .param p1, "kind"    # Ljava/lang/String;
    .param p2, "a"    # Ljava/util/Map;
    .param p3, "$completion"    # Lkotlin/coroutines/Continuation;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/pymcl/ai/ToolOutput;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 152
    sget-object v0, Lcom/pymcl/android/data/AiToolLogic;->INSTANCE:Lcom/pymcl/android/data/AiToolLogic;

    const-string v1, "query"

    invoke-virtual {v0, p2, v1}, Lcom/pymcl/android/data/AiToolLogic;->required(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 153
    .local v0, "q":Ljava/lang/String;
    invoke-direct {p0}, Lcom/pymcl/android/data/AiToolHostImpl;->getRepo()Lcom/pymcl/android/data/LauncherRepository;

    move-result-object v1

    invoke-virtual {v1}, Lcom/pymcl/android/data/LauncherRepository;->getCatalog()Lcom/pymcl/core/mods/ModCatalog;

    move-result-object v2

    sget-object v1, Lcom/pymcl/core/mods/ResKind;->Companion:Lcom/pymcl/core/mods/ResKind$Companion;

    invoke-virtual {v1, p1}, Lcom/pymcl/core/mods/ResKind$Companion;->of(Ljava/lang/String;)Lcom/pymcl/core/mods/ResKind;

    move-result-object v3

    move-object v1, v0

    check-cast v1, Ljava/lang/CharSequence;

    invoke-static {v1}, Lkotlin/text/StringsKt;->trim(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-direct {p0, p2}, Lcom/pymcl/android/data/AiToolHostImpl;->sourceOf(Ljava/util/Map;)Ljava/lang/String;

    move-result-object v5

    const/16 v9, 0x38

    const/4 v10, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v2 .. v10}, Lcom/pymcl/core/mods/ModCatalog;->search$default(Lcom/pymcl/core/mods/ModCatalog;Lcom/pymcl/core/mods/ResKind;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/Object;)Ljava/util/List;

    move-result-object v1

    .line 154
    .local v1, "hits":Ljava/util/List;
    sget-object v2, Lcom/pymcl/ai/ToolOutput;->Companion:Lcom/pymcl/ai/ToolOutput$Companion;

    sget-object v3, Lcom/pymcl/android/data/AiToolLogic;->INSTANCE:Lcom/pymcl/android/data/AiToolLogic;

    invoke-virtual {v3, v1}, Lcom/pymcl/android/data/AiToolLogic;->searchJson(Ljava/util/List;)Ljava/util/List;

    move-result-object v3

    const/4 v4, 0x1

    invoke-virtual {v2, v3, v4}, Lcom/pymcl/ai/ToolOutput$Companion;->json(Ljava/lang/Object;Z)Lcom/pymcl/ai/ToolOutput;

    move-result-object v2

    return-object v2
.end method

.method private final sourceOf(Ljava/util/Map;)Ljava/lang/String;
    .locals 1
    .param p1, "a"    # Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    .line 149
    sget-object v0, Lcom/pymcl/android/data/AiToolLogic;->INSTANCE:Lcom/pymcl/android/data/AiToolLogic;

    invoke-virtual {v0, p1}, Lcom/pymcl/android/data/AiToolLogic;->sourceOf(Ljava/util/Map;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private final tail(Ljava/io/File;I)Ljava/lang/String;
    .locals 1
    .param p1, "f"    # Ljava/io/File;
    .param p2, "n"    # I

    .line 178
    sget-object v0, Lcom/pymcl/android/data/AiToolLogic;->INSTANCE:Lcom/pymcl/android/data/AiToolLogic;

    invoke-virtual {v0, p1, p2}, Lcom/pymcl/android/data/AiToolLogic;->tail(Ljava/io/File;I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private final versionOf(Lcom/pymcl/core/instance/Instance;Ljava/util/Map;)Ljava/lang/String;
    .locals 6
    .param p1, "i"    # Lcom/pymcl/core/instance/Instance;
    .param p2, "a"    # Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/pymcl/core/instance/Instance;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    .line 35
    invoke-virtual {p1}, Lcom/pymcl/core/instance/Instance;->versions()Ljava/util/List;

    move-result-object v0

    .line 37
    .local v0, "vs":Ljava/util/List;
    const-string v1, "version"

    invoke-static {p2, v1}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    move-object v3, v1

    .line 183
    .local v3, "it\\1":Ljava/lang/String;
    const/4 v4, 0x0

    .line 37
    .local v4, "$i$a$-takeIf-AiToolHostImpl$versionOf$argOk$1\\1\\37\\0":I
    move-object v5, v3

    check-cast v5, Ljava/lang/CharSequence;

    invoke-static {v5}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v5

    if-nez v5, :cond_0

    invoke-interface {v0, v3}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    const/4 v5, 0x1

    goto :goto_0

    :cond_0
    const/4 v5, 0x0

    .end local v3    # "it\\1":Ljava/lang/String;
    .end local v4    # "$i$a$-takeIf-AiToolHostImpl$versionOf$argOk$1\\1\\37\\0":I
    :goto_0
    if-eqz v5, :cond_1

    goto :goto_1

    :cond_1
    move-object v1, v2

    .line 38
    .local v1, "argOk":Ljava/lang/String;
    :goto_1
    if-nez v1, :cond_3

    sget-object v3, Lcom/pymcl/android/data/AiToolLogic;->INSTANCE:Lcom/pymcl/android/data/AiToolLogic;

    invoke-virtual {p1}, Lcom/pymcl/core/instance/Instance;->meta()Ljava/util/Map;

    move-result-object v4

    const-string v5, "mc_version"

    invoke-static {v4, v5}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    new-instance v5, Lcom/pymcl/android/data/AiToolHostImpl$$ExternalSyntheticLambda2;

    invoke-direct {v5, p1}, Lcom/pymcl/android/data/AiToolHostImpl$$ExternalSyntheticLambda2;-><init>(Lcom/pymcl/core/instance/Instance;)V

    invoke-virtual {v3, v0, v2, v4, v5}, Lcom/pymcl/android/data/AiToolLogic;->pickVersion(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_2

    goto :goto_2

    .line 39
    :cond_2
    new-instance v2, Ljava/lang/IllegalStateException;

    sget-object v3, Lcom/pymcl/android/data/AiToolLogic;->INSTANCE:Lcom/pymcl/android/data/AiToolLogic;

    invoke-virtual {p1}, Lcom/pymcl/core/instance/Instance;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/pymcl/android/data/AiToolLogic;->noVersionMessage(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v2

    .line 38
    :cond_3
    move-object v2, v1

    :goto_2
    return-object v2
.end method

.method private static final versionOf$lambda$1(Lcom/pymcl/core/instance/Instance;Ljava/lang/String;)J
    .locals 2
    .param p0, "$i"    # Lcom/pymcl/core/instance/Instance;
    .param p1, "it"    # Ljava/lang/String;

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 38
    invoke-virtual {p0, p1}, Lcom/pymcl/core/instance/Instance;->versionDir(Ljava/lang/String;)Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->lastModified()J

    move-result-wide v0

    return-wide v0
.end method


# virtual methods
.method public affectedPaths(Ljava/lang/String;Ljava/util/Map;)Ljava/util/List;
    .locals 6
    .param p1, "name"    # Ljava/lang/String;
    .param p2, "args"    # Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)",
            "Ljava/util/List<",
            "Ljava/io/File;",
            ">;"
        }
    .end annotation

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "args"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 55
    :try_start_0
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object v0, p0

    check-cast v0, Lcom/pymcl/android/data/AiToolHostImpl;

    .local v0, "$this$affectedPaths_u24lambda_u240\\1":Lcom/pymcl/android/data/AiToolHostImpl;
    const/4 v1, 0x0

    .line 56
    .local v1, "$i$a$-runCatching-AiToolHostImpl$affectedPaths$1\\1\\55\\0":I
    invoke-direct {v0, p2}, Lcom/pymcl/android/data/AiToolHostImpl;->instOf(Ljava/util/Map;)Lcom/pymcl/core/instance/Instance;

    move-result-object v2

    .line 57
    .local v2, "i\\1":Lcom/pymcl/core/instance/Instance;
    sget-object v3, Lcom/pymcl/android/data/AiToolLogic;->INSTANCE:Lcom/pymcl/android/data/AiToolLogic;

    new-instance v4, Lcom/pymcl/android/data/AiToolHostImpl$$ExternalSyntheticLambda0;

    invoke-direct {v4, v0, v2, p2}, Lcom/pymcl/android/data/AiToolHostImpl$$ExternalSyntheticLambda0;-><init>(Lcom/pymcl/android/data/AiToolHostImpl;Lcom/pymcl/core/instance/Instance;Ljava/util/Map;)V

    new-instance v5, Lcom/pymcl/android/data/AiToolHostImpl$$ExternalSyntheticLambda1;

    invoke-direct {v5, v0}, Lcom/pymcl/android/data/AiToolHostImpl$$ExternalSyntheticLambda1;-><init>(Lcom/pymcl/android/data/AiToolHostImpl;)V

    invoke-virtual {v3, p1, p2, v4, v5}, Lcom/pymcl/android/data/AiToolLogic;->affectedPaths(Ljava/lang/String;Ljava/util/Map;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)Ljava/util/List;

    move-result-object v3

    .line 55
    .end local v0    # "$this$affectedPaths_u24lambda_u240\\1":Lcom/pymcl/android/data/AiToolHostImpl;
    .end local v1    # "$i$a$-runCatching-AiToolHostImpl$affectedPaths$1\\1\\55\\0":I
    .end local v2    # "i\\1":Lcom/pymcl/core/instance/Instance;
    invoke-static {v3}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

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

    .line 58
    :goto_0
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v1

    invoke-static {v0}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    move-object v0, v1

    :cond_0
    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method public currentInstance()Ljava/lang/String;
    .locals 3

    .line 26
    invoke-direct {p0}, Lcom/pymcl/android/data/AiToolHostImpl;->getRepo()Lcom/pymcl/android/data/LauncherRepository;

    move-result-object v0

    invoke-virtual {v0}, Lcom/pymcl/android/data/LauncherRepository;->getConfig()Lcom/pymcl/core/config/ConfigStore;

    move-result-object v0

    const-string v1, "default_instance"

    invoke-virtual {v0, v1}, Lcom/pymcl/core/config/ConfigStore;->string(Ljava/lang/String;)Ljava/lang/String;

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

    .line 183
    const/4 v0, 0x0

    .line 26
    .local v0, "$i$a$-ifEmpty-AiToolHostImpl$currentInstance$1\\1\\26\\0":I
    invoke-direct {p0}, Lcom/pymcl/android/data/AiToolHostImpl;->getRepo()Lcom/pymcl/android/data/LauncherRepository;

    move-result-object v1

    invoke-virtual {v1}, Lcom/pymcl/android/data/LauncherRepository;->getInstances()Lcom/pymcl/core/instance/InstanceManager;

    move-result-object v1

    invoke-virtual {v1}, Lcom/pymcl/core/instance/InstanceManager;->getRootName()Ljava/lang/String;

    move-result-object v1

    const-string v2, "<get-rootName>(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v0, v1

    .end local v0    # "$i$a$-ifEmpty-AiToolHostImpl$currentInstance$1\\1\\26\\0":I
    :cond_1
    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public describe(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;
    .locals 1
    .param p1, "name"    # Ljava/lang/String;
    .param p2, "args"    # Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "args"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 53
    sget-object v0, Lcom/pymcl/android/data/AiToolLogic;->INSTANCE:Lcom/pymcl/android/data/AiToolLogic;

    invoke-virtual {v0, p1, p2}, Lcom/pymcl/android/data/AiToolLogic;->describe(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public execute(Ljava/lang/String;Ljava/util/Map;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 7
    .param p1, "name"    # Ljava/lang/String;
    .param p2, "args"    # Ljava/util/Map;
    .param p3, "progress"    # Lkotlin/jvm/functions/Function2;
    .param p4, "$completion"    # Lkotlin/coroutines/Continuation;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Ljava/lang/Float;",
            "-",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/pymcl/ai/ToolOutput;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 62
    invoke-static {}, Lkotlinx/coroutines/Dispatchers;->getIO()Lkotlinx/coroutines/CoroutineDispatcher;

    move-result-object v0

    check-cast v0, Lkotlin/coroutines/CoroutineContext;

    new-instance v1, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;

    const/4 v6, 0x0

    move-object v3, p0

    move-object v2, p1

    move-object v4, p2

    move-object v5, p3

    .end local p1    # "name":Ljava/lang/String;
    .end local p2    # "args":Ljava/util/Map;
    .end local p3    # "progress":Lkotlin/jvm/functions/Function2;
    .local v2, "name":Ljava/lang/String;
    .local v4, "args":Ljava/util/Map;
    .local v5, "progress":Lkotlin/jvm/functions/Function2;
    invoke-direct/range {v1 .. v6}, Lcom/pymcl/android/data/AiToolHostImpl$execute$2;-><init>(Ljava/lang/String;Lcom/pymcl/android/data/AiToolHostImpl;Ljava/util/Map;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)V

    check-cast v1, Lkotlin/jvm/functions/Function2;

    invoke-static {v0, v1, p4}, Lkotlinx/coroutines/BuildersKt;->withContext(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    .line 147
    return-object p1
.end method

.method public launcherStateSummary(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 3
    .param p1, "$completion"    # Lkotlin/coroutines/Continuation;
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

    .line 45
    invoke-static {}, Lkotlinx/coroutines/Dispatchers;->getIO()Lkotlinx/coroutines/CoroutineDispatcher;

    move-result-object v0

    check-cast v0, Lkotlin/coroutines/CoroutineContext;

    new-instance v1, Lcom/pymcl/android/data/AiToolHostImpl$launcherStateSummary$2;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/pymcl/android/data/AiToolHostImpl$launcherStateSummary$2;-><init>(Lcom/pymcl/android/data/AiToolHostImpl;Lkotlin/coroutines/Continuation;)V

    check-cast v1, Lkotlin/jvm/functions/Function2;

    invoke-static {v0, v1, p1}, Lkotlinx/coroutines/BuildersKt;->withContext(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    .line 51
    return-object v0
.end method
