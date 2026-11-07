.class public final Lcom/pymcl/android/data/AiBridge;
.super Ljava/lang/Object;
.source "AiBridge.kt"

# interfaces
.implements Lcom/pymcl/android/data/AiUiExtras;


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nAiBridge.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AiBridge.kt\ncom/pymcl/android/data/AiBridge\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,219:1\n1#2:220\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00ca\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0007\n\u0002\u0010$\n\u0002\u0010 \n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0003\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\u0008\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J2\u0010\u0018\u001a\u0002H\u0019\"\u0004\u0008\u0000\u0010\u00192\u001c\u0010\u001a\u001a\u0018\u0008\u0001\u0012\n\u0012\u0008\u0012\u0004\u0012\u0002H\u00190\u001c\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u001bH\u0082@\u00a2\u0006\u0002\u0010\u001eJ*\u0010$\u001a\u0008\u0012\u0004\u0012\u00020&0%2\u0006\u0010\'\u001a\u00020(2\u0008\u0010)\u001a\u0004\u0018\u00010(2\u0008\u0010*\u001a\u0004\u0018\u00010(H\u0016J\u0008\u0010+\u001a\u00020,H\u0016J\u0010\u0010-\u001a\u00020\"2\u0006\u0010\'\u001a\u00020(H\u0016J \u0010.\u001a\u00020\"2\u0006\u0010/\u001a\u00020\"2\u0006\u00100\u001a\u00020\"2\u0006\u00101\u001a\u00020\"H\u0016J*\u00102\u001a\u00020\"2\u0018\u00103\u001a\u0014\u0012\u0004\u0012\u00020(\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020(05042\u0006\u00106\u001a\u00020\"H\u0016J\n\u00107\u001a\u0004\u0018\u00010&H\u0016J\u000e\u00108\u001a\u000209H\u0096@\u00a2\u0006\u0002\u0010:J\u0014\u0010;\u001a\u0008\u0012\u0004\u0012\u00020<05H\u0096@\u00a2\u0006\u0002\u0010:J\u0010\u0010=\u001a\u0004\u0018\u00010(H\u0096@\u00a2\u0006\u0002\u0010:J\u000e\u0010>\u001a\u00020(H\u0096@\u00a2\u0006\u0002\u0010:J\u0016\u0010?\u001a\u00020,2\u0006\u0010@\u001a\u00020(H\u0096@\u00a2\u0006\u0002\u0010AJ\u0016\u0010B\u001a\u00020,2\u0006\u0010@\u001a\u00020(H\u0096@\u00a2\u0006\u0002\u0010AJ\u001c\u0010C\u001a\u0008\u0012\u0004\u0012\u00020D052\u0006\u0010)\u001a\u00020(H\u0096@\u00a2\u0006\u0002\u0010AJ\u001e\u0010E\u001a\u0008\u0012\u0004\u0012\u00020(052\u0008\u0010F\u001a\u0004\u0018\u00010GH\u0096@\u00a2\u0006\u0002\u0010HJ$\u0010I\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020(0J2\u0008\u0010F\u001a\u0004\u0018\u00010GH\u0096@\u00a2\u0006\u0002\u0010HJ\u000e\u0010K\u001a\u00020GH\u0096@\u00a2\u0006\u0002\u0010:J\u0016\u0010L\u001a\u00020,2\u0006\u0010F\u001a\u00020GH\u0096@\u00a2\u0006\u0002\u0010HJ\u0010\u0010M\u001a\u00020(2\u0006\u0010N\u001a\u00020OH\u0016J\n\u0010P\u001a\u0004\u0018\u00010(H\u0016J\u0014\u0010Q\u001a\u0008\u0012\u0004\u0012\u00020R05H\u0096@\u00a2\u0006\u0002\u0010:J.\u0010S\u001a\u00020,2\u0006\u0010T\u001a\u00020(2\u0006\u0010U\u001a\u00020(2\u0006\u0010V\u001a\u00020(2\u0006\u00101\u001a\u00020\"H\u0096@\u00a2\u0006\u0002\u0010WJ\u0016\u0010X\u001a\u00020,2\u0006\u0010Y\u001a\u00020RH\u0096@\u00a2\u0006\u0002\u0010ZJ\u000e\u0010_\u001a\u0008\u0012\u0004\u0012\u00020\\05H\u0016J\u0010\u0010`\u001a\u00020\"2\u0006\u0010@\u001a\u00020(H\u0016J\u0008\u0010a\u001a\u00020bH\u0016J\u0012\u0010c\u001a\u00020\"2\u0008\u0010)\u001a\u0004\u0018\u00010(H\u0016J\u001a\u0010d\u001a\n\u0012\u0004\u0012\u00020&\u0018\u00010%2\u0008\u0010)\u001a\u0004\u0018\u00010(H\u0016J\u000e\u0010e\u001a\u0008\u0012\u0004\u0012\u00020(05H\u0016J\u000e\u0010f\u001a\u0008\u0012\u0004\u0012\u00020g05H\u0016J\u0008\u0010h\u001a\u00020(H\u0016J\u0014\u0010i\u001a\u0008\u0012\u0004\u0012\u00020D0%2\u0006\u0010\'\u001a\u00020(R\u0016\u0010\u0008\u001a\n \t*\u0004\u0018\u00010\u00030\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00020\u000b8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000c\u0010\rR\u0011\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u0011R\u001b\u0010\u0012\u001a\u00020\u00138BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0016\u0010\u0017\u001a\u0004\u0008\u0014\u0010\u0015R\u000e\u0010\u001f\u001a\u00020 X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010!\u001a\u00020\"8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008!\u0010#R\u001a\u0010[\u001a\u0008\u0012\u0004\u0012\u00020\\0%8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008]\u0010^\u00ca\u0001\u000c\u0008k\u0012\u0008\u0008l\u0012\u0004\u0008\u0003\u0010\u0000\u00a8\u0006j"
    }
    d2 = {
        "Lcom/pymcl/android/data/AiBridge;",
        "Lcom/pymcl/android/data/AiUiExtras;",
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
        "host",
        "Lcom/pymcl/android/data/AiToolHostImpl;",
        "getHost",
        "()Lcom/pymcl/android/data/AiToolHostImpl;",
        "service",
        "Lcom/pymcl/ai/AiService;",
        "getService",
        "()Lcom/pymcl/ai/AiService;",
        "service$delegate",
        "Lkotlin/Lazy;",
        "io",
        "T",
        "b",
        "Lkotlin/Function1;",
        "Lkotlin/coroutines/Continuation;",
        "",
        "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "fmt",
        "Ljava/text/SimpleDateFormat;",
        "isRunning",
        "",
        "()Z",
        "send",
        "Lkotlinx/coroutines/flow/Flow;",
        "Lcom/pymcl/ai/AiEvent;",
        "text",
        "",
        "chatId",
        "hidden",
        "stop",
        "",
        "steer",
        "confirm",
        "ok",
        "always",
        "global",
        "answer",
        "answers",
        "",
        "",
        "skipped",
        "pendingCard",
        "rewind",
        "Lcom/pymcl/ai/RewindOutcome;",
        "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "chats",
        "Lcom/pymcl/android/ui/state/ChatSummary;",
        "activeChat",
        "newChat",
        "setActive",
        "id",
        "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "deleteChat",
        "history",
        "Lcom/pymcl/android/ui/state/AiItem;",
        "models",
        "st",
        "Lcom/pymcl/ai/AiSettings;",
        "(Lcom/pymcl/ai/AiSettings;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "testConnection",
        "Lkotlin/Pair;",
        "settings",
        "saveSettings",
        "describeError",
        "e",
        "",
        "takeNetNotice",
        "rules",
        "Lcom/pymcl/android/ui/state/PermissionRule;",
        "addRule",
        "tool",
        "behavior",
        "content",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "removeRule",
        "rule",
        "(Lcom/pymcl/android/ui/state/PermissionRule;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "backgroundEvents",
        "Lcom/pymcl/ai/BgTaskInfo;",
        "getBackgroundEvents",
        "()Lkotlinx/coroutines/flow/Flow;",
        "backgroundTasks",
        "cancelTask",
        "clearFinishedTasks",
        "Lcom/pymcl/ai/BgClearResult;",
        "needsReport",
        "report",
        "mcpToolNames",
        "mcpStatus",
        "Lcom/pymcl/ai/McpServerStatus;",
        "usageText",
        "sendAsItems",
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
.field private final ctx:Landroid/content/Context;

.field private final fmt:Ljava/text/SimpleDateFormat;

.field private final host:Lcom/pymcl/android/data/AiToolHostImpl;

.field private final service$delegate:Lkotlin/Lazy;


# direct methods
.method public static synthetic $r8$lambda$2juOAFlbY-5xncO6ThF-wKtEkk0(Lcom/pymcl/android/data/AiBridge;)Lcom/pymcl/ai/AiSettings;
    .locals 0

    invoke-static {p0}, Lcom/pymcl/android/data/AiBridge;->service_delegate$lambda$0$0(Lcom/pymcl/android/data/AiBridge;)Lcom/pymcl/ai/AiSettings;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$bWV90bjrBdxOfLLhGerw8RqkZi4(Lcom/pymcl/android/data/AiBridge;)Lcom/pymcl/ai/AiService;
    .locals 0

    invoke-static {p0}, Lcom/pymcl/android/data/AiBridge;->service_delegate$lambda$0(Lcom/pymcl/android/data/AiBridge;)Lcom/pymcl/ai/AiService;

    move-result-object p0

    return-object p0
.end method

.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x8

    sput v0, Lcom/pymcl/android/data/AiBridge;->$stable:I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/pymcl/android/data/RepositoryUiApi;)V
    .locals 3
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "api"    # Lcom/pymcl/android/data/RepositoryUiApi;

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "api"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 66
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 67
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/pymcl/android/data/AiBridge;->ctx:Landroid/content/Context;

    .line 68
    sget-object v0, Lcom/pymcl/android/data/AiLang;->INSTANCE:Lcom/pymcl/android/data/AiLang;

    invoke-virtual {v0}, Lcom/pymcl/android/data/AiLang;->install()V

    .line 70
    new-instance v0, Lcom/pymcl/android/data/AiToolHostImpl;

    iget-object v1, p0, Lcom/pymcl/android/data/AiBridge;->ctx:Landroid/content/Context;

    const-string v2, "ctx"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, v1, p2}, Lcom/pymcl/android/data/AiToolHostImpl;-><init>(Landroid/content/Context;Lcom/pymcl/android/data/RepositoryUiApi;)V

    iput-object v0, p0, Lcom/pymcl/android/data/AiBridge;->host:Lcom/pymcl/android/data/AiToolHostImpl;

    .line 71
    new-instance v0, Lcom/pymcl/android/data/AiBridge$$ExternalSyntheticLambda1;

    invoke-direct {v0, p0}, Lcom/pymcl/android/data/AiBridge$$ExternalSyntheticLambda1;-><init>(Lcom/pymcl/android/data/AiBridge;)V

    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/pymcl/android/data/AiBridge;->service$delegate:Lkotlin/Lazy;

    .line 75
    new-instance v0, Ljava/text/SimpleDateFormat;

    const-string v1, "MM-dd HH:mm"

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    iput-object v0, p0, Lcom/pymcl/android/data/AiBridge;->fmt:Ljava/text/SimpleDateFormat;

    .line 66
    return-void
.end method

.method public static final synthetic access$getFmt$p(Lcom/pymcl/android/data/AiBridge;)Ljava/text/SimpleDateFormat;
    .locals 1
    .param p0, "$this"    # Lcom/pymcl/android/data/AiBridge;

    .line 66
    iget-object v0, p0, Lcom/pymcl/android/data/AiBridge;->fmt:Ljava/text/SimpleDateFormat;

    return-object v0
.end method

.method public static final synthetic access$getRepo(Lcom/pymcl/android/data/AiBridge;)Lcom/pymcl/android/data/LauncherRepository;
    .locals 1
    .param p0, "$this"    # Lcom/pymcl/android/data/AiBridge;

    .line 66
    invoke-direct {p0}, Lcom/pymcl/android/data/AiBridge;->getRepo()Lcom/pymcl/android/data/LauncherRepository;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$getService(Lcom/pymcl/android/data/AiBridge;)Lcom/pymcl/ai/AiService;
    .locals 1
    .param p0, "$this"    # Lcom/pymcl/android/data/AiBridge;

    .line 66
    invoke-direct {p0}, Lcom/pymcl/android/data/AiBridge;->getService()Lcom/pymcl/ai/AiService;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$io(Lcom/pymcl/android/data/AiBridge;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 1
    .param p0, "$this"    # Lcom/pymcl/android/data/AiBridge;
    .param p1, "b"    # Lkotlin/jvm/functions/Function1;
    .param p2, "$completion"    # Lkotlin/coroutines/Continuation;

    .line 66
    invoke-direct {p0, p1, p2}, Lcom/pymcl/android/data/AiBridge;->io(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method private final getRepo()Lcom/pymcl/android/data/LauncherRepository;
    .locals 3

    .line 69
    sget-object v0, Lcom/pymcl/android/data/LauncherRepository;->Companion:Lcom/pymcl/android/data/LauncherRepository$Companion;

    iget-object v1, p0, Lcom/pymcl/android/data/AiBridge;->ctx:Landroid/content/Context;

    const-string v2, "ctx"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/pymcl/android/data/LauncherRepository$Companion;->get(Landroid/content/Context;)Lcom/pymcl/android/data/LauncherRepository;

    move-result-object v0

    return-object v0
.end method

.method private final getService()Lcom/pymcl/ai/AiService;
    .locals 1

    .line 71
    iget-object v0, p0, Lcom/pymcl/android/data/AiBridge;->service$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/pymcl/ai/AiService;

    return-object v0
.end method

.method private final io(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 3
    .param p1, "b"    # Lkotlin/jvm/functions/Function1;
    .param p2, "$completion"    # Lkotlin/coroutines/Continuation;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lkotlin/coroutines/Continuation<",
            "-TT;>;+",
            "Ljava/lang/Object;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-TT;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 74
    invoke-static {}, Lkotlinx/coroutines/Dispatchers;->getIO()Lkotlinx/coroutines/CoroutineDispatcher;

    move-result-object v0

    check-cast v0, Lkotlin/coroutines/CoroutineContext;

    new-instance v1, Lcom/pymcl/android/data/AiBridge$io$2;

    const/4 v2, 0x0

    invoke-direct {v1, p1, v2}, Lcom/pymcl/android/data/AiBridge$io$2;-><init>(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)V

    check-cast v1, Lkotlin/jvm/functions/Function2;

    invoke-static {v0, v1, p2}, Lkotlinx/coroutines/BuildersKt;->withContext(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method private static final service_delegate$lambda$0(Lcom/pymcl/android/data/AiBridge;)Lcom/pymcl/ai/AiService;
    .locals 11
    .param p0, "this$0"    # Lcom/pymcl/android/data/AiBridge;

    .line 72
    new-instance v0, Lcom/pymcl/ai/AiService;

    invoke-direct {p0}, Lcom/pymcl/android/data/AiBridge;->getRepo()Lcom/pymcl/android/data/LauncherRepository;

    move-result-object v1

    invoke-virtual {v1}, Lcom/pymcl/android/data/LauncherRepository;->getPaths()Lcom/pymcl/core/config/LauncherPaths;

    move-result-object v1

    invoke-virtual {v1}, Lcom/pymcl/core/config/LauncherPaths;->getRoot()Ljava/io/File;

    move-result-object v1

    invoke-direct {p0}, Lcom/pymcl/android/data/AiBridge;->getRepo()Lcom/pymcl/android/data/LauncherRepository;

    move-result-object v2

    invoke-virtual {v2}, Lcom/pymcl/android/data/LauncherRepository;->getPaths()Lcom/pymcl/core/config/LauncherPaths;

    move-result-object v2

    invoke-virtual {v2}, Lcom/pymcl/core/config/LauncherPaths;->getCacheDir()Ljava/io/File;

    move-result-object v2

    new-instance v3, Lcom/pymcl/android/data/AiBridge$$ExternalSyntheticLambda0;

    invoke-direct {v3, p0}, Lcom/pymcl/android/data/AiBridge$$ExternalSyntheticLambda0;-><init>(Lcom/pymcl/android/data/AiBridge;)V

    iget-object v4, p0, Lcom/pymcl/android/data/AiBridge;->host:Lcom/pymcl/android/data/AiToolHostImpl;

    check-cast v4, Lcom/pymcl/ai/AiToolHost;

    const/16 v9, 0xf0

    const/4 v10, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v0 .. v10}, Lcom/pymcl/ai/AiService;-><init>(Ljava/io/File;Ljava/io/File;Lkotlin/jvm/functions/Function0;Lcom/pymcl/ai/AiToolHost;Lcom/pymcl/ai/AiHttp;ZLcom/pymcl/ai/McpHttp;Lcom/pymcl/ai/HookHttp;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method private static final service_delegate$lambda$0$0(Lcom/pymcl/android/data/AiBridge;)Lcom/pymcl/ai/AiSettings;
    .locals 2
    .param p0, "this$0"    # Lcom/pymcl/android/data/AiBridge;

    .line 72
    sget-object v0, Lcom/pymcl/ai/AiSettings;->Companion:Lcom/pymcl/ai/AiSettings$Companion;

    invoke-direct {p0}, Lcom/pymcl/android/data/AiBridge;->getRepo()Lcom/pymcl/android/data/LauncherRepository;

    move-result-object v1

    invoke-virtual {v1}, Lcom/pymcl/android/data/LauncherRepository;->getConfig()Lcom/pymcl/core/config/ConfigStore;

    move-result-object v1

    invoke-virtual {v1}, Lcom/pymcl/core/config/ConfigStore;->snapshot()Ljava/util/Map;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/pymcl/ai/AiSettings$Companion;->from(Ljava/util/Map;)Lcom/pymcl/ai/AiSettings;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public activeChat(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 2
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

    .line 86
    new-instance v0, Lcom/pymcl/android/data/AiBridge$activeChat$2;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/pymcl/android/data/AiBridge$activeChat$2;-><init>(Lcom/pymcl/android/data/AiBridge;Lkotlin/coroutines/Continuation;)V

    check-cast v0, Lkotlin/jvm/functions/Function1;

    invoke-direct {p0, v0, p1}, Lcom/pymcl/android/data/AiBridge;->io(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public addRule(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 10
    .param p1, "tool"    # Ljava/lang/String;
    .param p2, "behavior"    # Ljava/lang/String;
    .param p3, "content"    # Ljava/lang/String;
    .param p4, "global"    # Z
    .param p5, "$completion"    # Lkotlin/coroutines/Continuation;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
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

    instance-of v0, p5, Lcom/pymcl/android/data/AiBridge$addRule$1;

    if-eqz v0, :cond_0

    move-object v0, p5

    check-cast v0, Lcom/pymcl/android/data/AiBridge$addRule$1;

    iget v1, v0, Lcom/pymcl/android/data/AiBridge$addRule$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget v1, v0, Lcom/pymcl/android/data/AiBridge$addRule$1;->label:I

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/pymcl/android/data/AiBridge$addRule$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/pymcl/android/data/AiBridge$addRule$1;

    invoke-direct {v0, p0, p5}, Lcom/pymcl/android/data/AiBridge$addRule$1;-><init>(Lcom/pymcl/android/data/AiBridge;Lkotlin/coroutines/Continuation;)V

    .local v0, "$continuation":Lkotlin/coroutines/Continuation;
    :goto_0
    iget-object v1, v0, Lcom/pymcl/android/data/AiBridge$addRule$1;->result:Ljava/lang/Object;

    .local v1, "$result":Ljava/lang/Object;
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v2

    .line 98
    iget v3, v0, Lcom/pymcl/android/data/AiBridge$addRule$1;->label:I

    packed-switch v3, :pswitch_data_0

    move-object v5, p1

    move-object v6, p2

    .end local v0    # "$continuation":Lkotlin/coroutines/Continuation;
    .end local v1    # "$result":Ljava/lang/Object;
    .end local p1    # "tool":Ljava/lang/String;
    .end local p2    # "behavior":Ljava/lang/String;
    .local v5, "tool":Ljava/lang/String;
    .local v6, "behavior":Ljava/lang/String;
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .end local v5    # "tool":Ljava/lang/String;
    .end local v6    # "behavior":Ljava/lang/String;
    .restart local v0    # "$continuation":Lkotlin/coroutines/Continuation;
    .restart local v1    # "$result":Ljava/lang/Object;
    .restart local p1    # "tool":Ljava/lang/String;
    .restart local p2    # "behavior":Ljava/lang/String;
    :pswitch_0
    iget-boolean p4, v0, Lcom/pymcl/android/data/AiBridge$addRule$1;->Z$0:Z

    iget-object v2, v0, Lcom/pymcl/android/data/AiBridge$addRule$1;->L$2:Ljava/lang/Object;

    move-object p3, v2

    check-cast p3, Ljava/lang/String;

    iget-object v2, v0, Lcom/pymcl/android/data/AiBridge$addRule$1;->L$1:Ljava/lang/Object;

    move-object p2, v2

    check-cast p2, Ljava/lang/String;

    iget-object v2, v0, Lcom/pymcl/android/data/AiBridge$addRule$1;->L$0:Ljava/lang/Object;

    move-object p1, v2

    check-cast p1, Ljava/lang/String;

    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object v4, p0

    goto :goto_1

    :pswitch_1
    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    new-instance v3, Lcom/pymcl/android/data/AiBridge$addRule$2;

    const/4 v9, 0x0

    move-object v4, p0

    move-object v5, p1

    move-object v6, p2

    move-object v7, p3

    move v8, p4

    .end local p1    # "tool":Ljava/lang/String;
    .end local p2    # "behavior":Ljava/lang/String;
    .end local p3    # "content":Ljava/lang/String;
    .end local p4    # "global":Z
    .restart local v5    # "tool":Ljava/lang/String;
    .restart local v6    # "behavior":Ljava/lang/String;
    .local v7, "content":Ljava/lang/String;
    .local v8, "global":Z
    invoke-direct/range {v3 .. v9}, Lcom/pymcl/android/data/AiBridge$addRule$2;-><init>(Lcom/pymcl/android/data/AiBridge;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLkotlin/coroutines/Continuation;)V

    check-cast v3, Lkotlin/jvm/functions/Function1;

    invoke-static {v5}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, v0, Lcom/pymcl/android/data/AiBridge$addRule$1;->L$0:Ljava/lang/Object;

    invoke-static {v6}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, v0, Lcom/pymcl/android/data/AiBridge$addRule$1;->L$1:Ljava/lang/Object;

    invoke-static {v7}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, v0, Lcom/pymcl/android/data/AiBridge$addRule$1;->L$2:Ljava/lang/Object;

    iput-boolean v8, v0, Lcom/pymcl/android/data/AiBridge$addRule$1;->Z$0:Z

    const/4 p1, 0x1

    iput p1, v0, Lcom/pymcl/android/data/AiBridge$addRule$1;->label:I

    invoke-direct {p0, v3, v0}, Lcom/pymcl/android/data/AiBridge;->io(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v2, :cond_1

    return-object v2

    :cond_1
    move-object p1, v5

    move-object p2, v6

    move-object p3, v7

    move p4, v8

    .end local v5    # "tool":Ljava/lang/String;
    .end local v6    # "behavior":Ljava/lang/String;
    .end local v7    # "content":Ljava/lang/String;
    .end local v8    # "global":Z
    .restart local p1    # "tool":Ljava/lang/String;
    .restart local p2    # "behavior":Ljava/lang/String;
    .restart local p3    # "content":Ljava/lang/String;
    .restart local p4    # "global":Z
    :goto_1
    sget-object v2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v2

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public answer(Ljava/util/Map;Z)Z
    .locals 2
    .param p1, "answers"    # Ljava/util/Map;
    .param p2, "skipped"    # Z
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;Z)Z"
        }
    .end annotation

    const-string v0, "answers"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 82
    invoke-direct {p0}, Lcom/pymcl/android/data/AiBridge;->getService()Lcom/pymcl/ai/AiService;

    move-result-object v0

    new-instance v1, Lcom/pymcl/ai/AskAnswer;

    invoke-direct {v1, p1, p2}, Lcom/pymcl/ai/AskAnswer;-><init>(Ljava/util/Map;Z)V

    invoke-virtual {v0, v1}, Lcom/pymcl/ai/AiService;->answer(Lcom/pymcl/ai/AskAnswer;)Z

    move-result v0

    return v0
.end method

.method public backgroundTasks()Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/pymcl/ai/BgTaskInfo;",
            ">;"
        }
    .end annotation

    .line 101
    invoke-direct {p0}, Lcom/pymcl/android/data/AiBridge;->getService()Lcom/pymcl/ai/AiService;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-static {v0, v1, v2, v1}, Lcom/pymcl/ai/AiService;->backgroundTasks$default(Lcom/pymcl/ai/AiService;Ljava/lang/String;ILjava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public cancelTask(Ljava/lang/String;)Z
    .locals 1
    .param p1, "id"    # Ljava/lang/String;

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 102
    invoke-direct {p0}, Lcom/pymcl/android/data/AiBridge;->getService()Lcom/pymcl/ai/AiService;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/pymcl/ai/AiService;->cancelTask(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public chats(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 2
    .param p1, "$completion"    # Lkotlin/coroutines/Continuation;
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

    .line 85
    new-instance v0, Lcom/pymcl/android/data/AiBridge$chats$2;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/pymcl/android/data/AiBridge$chats$2;-><init>(Lcom/pymcl/android/data/AiBridge;Lkotlin/coroutines/Continuation;)V

    check-cast v0, Lkotlin/jvm/functions/Function1;

    invoke-direct {p0, v0, p1}, Lcom/pymcl/android/data/AiBridge;->io(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public clearFinishedTasks()Lcom/pymcl/ai/BgClearResult;
    .locals 4

    .line 103
    invoke-direct {p0}, Lcom/pymcl/android/data/AiBridge;->getService()Lcom/pymcl/ai/AiService;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x3

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2, v3}, Lcom/pymcl/ai/AiService;->clearFinishedTasks$default(Lcom/pymcl/ai/AiService;Ljava/lang/String;ZILjava/lang/Object;)Lcom/pymcl/ai/BgClearResult;

    move-result-object v0

    return-object v0
.end method

.method public confirm(ZZZ)Z
    .locals 3
    .param p1, "ok"    # Z
    .param p2, "always"    # Z
    .param p3, "global"    # Z

    .line 81
    invoke-direct {p0}, Lcom/pymcl/android/data/AiBridge;->getService()Lcom/pymcl/ai/AiService;

    move-result-object v0

    new-instance v1, Lcom/pymcl/ai/ConfirmAnswer;

    if-eqz p3, :cond_0

    const-string v2, "global"

    goto :goto_0

    :cond_0
    const-string v2, "instance"

    :goto_0
    invoke-direct {v1, p1, p2, v2}, Lcom/pymcl/ai/ConfirmAnswer;-><init>(ZZLjava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/pymcl/ai/AiService;->confirm(Lcom/pymcl/ai/ConfirmAnswer;)Z

    move-result v0

    return v0
.end method

.method public deleteChat(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 5
    .param p1, "id"    # Ljava/lang/String;
    .param p2, "$completion"    # Lkotlin/coroutines/Continuation;
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

    instance-of v0, p2, Lcom/pymcl/android/data/AiBridge$deleteChat$1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/pymcl/android/data/AiBridge$deleteChat$1;

    iget v1, v0, Lcom/pymcl/android/data/AiBridge$deleteChat$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget v1, v0, Lcom/pymcl/android/data/AiBridge$deleteChat$1;->label:I

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/pymcl/android/data/AiBridge$deleteChat$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/pymcl/android/data/AiBridge$deleteChat$1;

    invoke-direct {v0, p0, p2}, Lcom/pymcl/android/data/AiBridge$deleteChat$1;-><init>(Lcom/pymcl/android/data/AiBridge;Lkotlin/coroutines/Continuation;)V

    .local v0, "$continuation":Lkotlin/coroutines/Continuation;
    :goto_0
    iget-object v1, v0, Lcom/pymcl/android/data/AiBridge$deleteChat$1;->result:Ljava/lang/Object;

    .local v1, "$result":Ljava/lang/Object;
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v2

    .line 89
    iget v3, v0, Lcom/pymcl/android/data/AiBridge$deleteChat$1;->label:I

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
    iget-object v2, v0, Lcom/pymcl/android/data/AiBridge$deleteChat$1;->L$0:Ljava/lang/Object;

    move-object p1, v2

    check-cast p1, Ljava/lang/String;

    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :pswitch_1
    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    invoke-direct {p0}, Lcom/pymcl/android/data/AiBridge;->getService()Lcom/pymcl/ai/AiService;

    move-result-object v3

    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    iput-object v4, v0, Lcom/pymcl/android/data/AiBridge$deleteChat$1;->L$0:Ljava/lang/Object;

    const/4 v4, 0x1

    iput v4, v0, Lcom/pymcl/android/data/AiBridge$deleteChat$1;->label:I

    invoke-virtual {v3, p1, v0}, Lcom/pymcl/ai/AiService;->deleteChatAwait(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v2, :cond_1

    return-object v2

    :cond_1
    :goto_1
    sget-object v2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v2

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public describeError(Ljava/lang/Throwable;)Ljava/lang/String;
    .locals 1
    .param p1, "e"    # Ljava/lang/Throwable;

    const-string v0, "e"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 95
    invoke-direct {p0}, Lcom/pymcl/android/data/AiBridge;->getService()Lcom/pymcl/ai/AiService;

    move-result-object v0

    invoke-virtual {v0}, Lcom/pymcl/ai/AiService;->getClient()Lcom/pymcl/ai/AiClient;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/pymcl/ai/AiClient;->describeError(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getBackgroundEvents()Lkotlinx/coroutines/flow/Flow;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/Flow<",
            "Lcom/pymcl/ai/BgTaskInfo;",
            ">;"
        }
    .end annotation

    .line 100
    invoke-direct {p0}, Lcom/pymcl/android/data/AiBridge;->getService()Lcom/pymcl/ai/AiService;

    move-result-object v0

    invoke-virtual {v0}, Lcom/pymcl/ai/AiService;->getBackgroundEvents()Lkotlinx/coroutines/flow/Flow;

    move-result-object v0

    return-object v0
.end method

.method public final getHost()Lcom/pymcl/android/data/AiToolHostImpl;
    .locals 1

    .line 70
    iget-object v0, p0, Lcom/pymcl/android/data/AiBridge;->host:Lcom/pymcl/android/data/AiToolHostImpl;

    return-object v0
.end method

.method public history(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 2
    .param p1, "chatId"    # Ljava/lang/String;
    .param p2, "$completion"    # Lkotlin/coroutines/Continuation;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/util/List<",
            "+",
            "Lcom/pymcl/android/ui/state/AiItem;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 90
    new-instance v0, Lcom/pymcl/android/data/AiBridge$history$2;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, Lcom/pymcl/android/data/AiBridge$history$2;-><init>(Lcom/pymcl/android/data/AiBridge;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    check-cast v0, Lkotlin/jvm/functions/Function1;

    invoke-direct {p0, v0, p2}, Lcom/pymcl/android/data/AiBridge;->io(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public isRunning()Z
    .locals 1

    .line 77
    invoke-direct {p0}, Lcom/pymcl/android/data/AiBridge;->getService()Lcom/pymcl/ai/AiService;

    move-result-object v0

    invoke-virtual {v0}, Lcom/pymcl/ai/AiService;->isRunning()Z

    move-result v0

    return v0
.end method

.method public mcpStatus()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/pymcl/ai/McpServerStatus;",
            ">;"
        }
    .end annotation

    .line 107
    invoke-direct {p0}, Lcom/pymcl/android/data/AiBridge;->getService()Lcom/pymcl/ai/AiService;

    move-result-object v0

    invoke-virtual {v0}, Lcom/pymcl/ai/AiService;->mcpStatus()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public mcpToolNames()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 106
    invoke-direct {p0}, Lcom/pymcl/android/data/AiBridge;->getService()Lcom/pymcl/ai/AiService;

    move-result-object v0

    invoke-virtual {v0}, Lcom/pymcl/ai/AiService;->mcpToolNames()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public models(Lcom/pymcl/ai/AiSettings;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 6
    .param p1, "st"    # Lcom/pymcl/ai/AiSettings;
    .param p2, "$completion"    # Lkotlin/coroutines/Continuation;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/pymcl/ai/AiSettings;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lcom/pymcl/android/data/AiBridge$models$1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/pymcl/android/data/AiBridge$models$1;

    iget v1, v0, Lcom/pymcl/android/data/AiBridge$models$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget v1, v0, Lcom/pymcl/android/data/AiBridge$models$1;->label:I

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/pymcl/android/data/AiBridge$models$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/pymcl/android/data/AiBridge$models$1;

    invoke-direct {v0, p0, p2}, Lcom/pymcl/android/data/AiBridge$models$1;-><init>(Lcom/pymcl/android/data/AiBridge;Lkotlin/coroutines/Continuation;)V

    .local v0, "$continuation":Lkotlin/coroutines/Continuation;
    :goto_0
    iget-object v1, v0, Lcom/pymcl/android/data/AiBridge$models$1;->result:Ljava/lang/Object;

    .local v1, "$result":Ljava/lang/Object;
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v2

    .line 91
    iget v3, v0, Lcom/pymcl/android/data/AiBridge$models$1;->label:I

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
    iget-object v2, v0, Lcom/pymcl/android/data/AiBridge$models$1;->L$0:Ljava/lang/Object;

    move-object p1, v2

    check-cast p1, Lcom/pymcl/ai/AiSettings;

    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object v3, v1

    goto :goto_3

    :pswitch_1
    iget-object v3, v0, Lcom/pymcl/android/data/AiBridge$models$1;->L$1:Ljava/lang/Object;

    check-cast v3, Lcom/pymcl/ai/AiService;

    iget-object v4, v0, Lcom/pymcl/android/data/AiBridge$models$1;->L$0:Ljava/lang/Object;

    move-object p1, v4

    check-cast p1, Lcom/pymcl/ai/AiSettings;

    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object v4, v1

    goto :goto_1

    :pswitch_2
    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    invoke-direct {p0}, Lcom/pymcl/android/data/AiBridge;->getService()Lcom/pymcl/ai/AiService;

    move-result-object v3

    if-nez p1, :cond_2

    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    iput-object v4, v0, Lcom/pymcl/android/data/AiBridge$models$1;->L$0:Ljava/lang/Object;

    iput-object v3, v0, Lcom/pymcl/android/data/AiBridge$models$1;->L$1:Ljava/lang/Object;

    const/4 v4, 0x1

    iput v4, v0, Lcom/pymcl/android/data/AiBridge$models$1;->label:I

    invoke-virtual {p0, v0}, Lcom/pymcl/android/data/AiBridge;->settings(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v2, :cond_1

    return-object v2

    :cond_1
    :goto_1
    check-cast v4, Lcom/pymcl/ai/AiSettings;

    goto :goto_2

    :cond_2
    move-object v4, p1

    :goto_2
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    iput-object v5, v0, Lcom/pymcl/android/data/AiBridge$models$1;->L$0:Ljava/lang/Object;

    const/4 v5, 0x0

    iput-object v5, v0, Lcom/pymcl/android/data/AiBridge$models$1;->L$1:Ljava/lang/Object;

    const/4 v5, 0x2

    iput v5, v0, Lcom/pymcl/android/data/AiBridge$models$1;->label:I

    invoke-virtual {v3, v4, v0}, Lcom/pymcl/ai/AiService;->listModels(Lcom/pymcl/ai/AiSettings;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v2, :cond_3

    return-object v2

    :cond_3
    :goto_3
    return-object v3

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public needsReport(Ljava/lang/String;)Z
    .locals 1
    .param p1, "chatId"    # Ljava/lang/String;

    .line 104
    invoke-direct {p0}, Lcom/pymcl/android/data/AiBridge;->getService()Lcom/pymcl/ai/AiService;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/pymcl/ai/AiService;->needsReport(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public newChat(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 1
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

    .line 87
    invoke-direct {p0}, Lcom/pymcl/android/data/AiBridge;->getService()Lcom/pymcl/ai/AiService;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/pymcl/ai/AiService;->newChatAwait(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public pendingCard()Lcom/pymcl/ai/AiEvent;
    .locals 1

    .line 83
    invoke-direct {p0}, Lcom/pymcl/android/data/AiBridge;->getService()Lcom/pymcl/ai/AiService;

    move-result-object v0

    invoke-virtual {v0}, Lcom/pymcl/ai/AiService;->pendingCard()Lcom/pymcl/ai/AiEvent;

    move-result-object v0

    return-object v0
.end method

.method public removeRule(Lcom/pymcl/android/ui/state/PermissionRule;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 5
    .param p1, "rule"    # Lcom/pymcl/android/ui/state/PermissionRule;
    .param p2, "$completion"    # Lkotlin/coroutines/Continuation;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/pymcl/android/ui/state/PermissionRule;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lcom/pymcl/android/data/AiBridge$removeRule$1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/pymcl/android/data/AiBridge$removeRule$1;

    iget v1, v0, Lcom/pymcl/android/data/AiBridge$removeRule$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget v1, v0, Lcom/pymcl/android/data/AiBridge$removeRule$1;->label:I

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/pymcl/android/data/AiBridge$removeRule$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/pymcl/android/data/AiBridge$removeRule$1;

    invoke-direct {v0, p0, p2}, Lcom/pymcl/android/data/AiBridge$removeRule$1;-><init>(Lcom/pymcl/android/data/AiBridge;Lkotlin/coroutines/Continuation;)V

    .local v0, "$continuation":Lkotlin/coroutines/Continuation;
    :goto_0
    iget-object v1, v0, Lcom/pymcl/android/data/AiBridge$removeRule$1;->result:Ljava/lang/Object;

    .local v1, "$result":Ljava/lang/Object;
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v2

    .line 99
    iget v3, v0, Lcom/pymcl/android/data/AiBridge$removeRule$1;->label:I

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
    iget-object v2, v0, Lcom/pymcl/android/data/AiBridge$removeRule$1;->L$0:Ljava/lang/Object;

    move-object p1, v2

    check-cast p1, Lcom/pymcl/android/ui/state/PermissionRule;

    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :pswitch_1
    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    new-instance v3, Lcom/pymcl/android/data/AiBridge$removeRule$2;

    const/4 v4, 0x0

    invoke-direct {v3, p0, p1, v4}, Lcom/pymcl/android/data/AiBridge$removeRule$2;-><init>(Lcom/pymcl/android/data/AiBridge;Lcom/pymcl/android/ui/state/PermissionRule;Lkotlin/coroutines/Continuation;)V

    check-cast v3, Lkotlin/jvm/functions/Function1;

    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    iput-object v4, v0, Lcom/pymcl/android/data/AiBridge$removeRule$1;->L$0:Ljava/lang/Object;

    const/4 v4, 0x1

    iput v4, v0, Lcom/pymcl/android/data/AiBridge$removeRule$1;->label:I

    invoke-direct {p0, v3, v0}, Lcom/pymcl/android/data/AiBridge;->io(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v2, :cond_1

    return-object v2

    :cond_1
    :goto_1
    sget-object v2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v2

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public report(Ljava/lang/String;)Lkotlinx/coroutines/flow/Flow;
    .locals 1
    .param p1, "chatId"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lkotlinx/coroutines/flow/Flow<",
            "Lcom/pymcl/ai/AiEvent;",
            ">;"
        }
    .end annotation

    .line 105
    invoke-direct {p0}, Lcom/pymcl/android/data/AiBridge;->getService()Lcom/pymcl/ai/AiService;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/pymcl/ai/AiService;->report(Ljava/lang/String;)Lkotlinx/coroutines/flow/Flow;

    move-result-object v0

    return-object v0
.end method

.method public rewind(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 3
    .param p1, "$completion"    # Lkotlin/coroutines/Continuation;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/pymcl/ai/RewindOutcome;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 84
    invoke-direct {p0}, Lcom/pymcl/android/data/AiBridge;->getService()Lcom/pymcl/ai/AiService;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-static {v0, v1, p1, v2, v1}, Lcom/pymcl/ai/AiService;->rewind$default(Lcom/pymcl/ai/AiService;Ljava/lang/String;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public rules(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 2
    .param p1, "$completion"    # Lkotlin/coroutines/Continuation;
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

    .line 97
    new-instance v0, Lcom/pymcl/android/data/AiBridge$rules$2;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/pymcl/android/data/AiBridge$rules$2;-><init>(Lcom/pymcl/android/data/AiBridge;Lkotlin/coroutines/Continuation;)V

    check-cast v0, Lkotlin/jvm/functions/Function1;

    invoke-direct {p0, v0, p1}, Lcom/pymcl/android/data/AiBridge;->io(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public saveSettings(Lcom/pymcl/ai/AiSettings;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 5
    .param p1, "st"    # Lcom/pymcl/ai/AiSettings;
    .param p2, "$completion"    # Lkotlin/coroutines/Continuation;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/pymcl/ai/AiSettings;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lcom/pymcl/android/data/AiBridge$saveSettings$1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/pymcl/android/data/AiBridge$saveSettings$1;

    iget v1, v0, Lcom/pymcl/android/data/AiBridge$saveSettings$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget v1, v0, Lcom/pymcl/android/data/AiBridge$saveSettings$1;->label:I

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/pymcl/android/data/AiBridge$saveSettings$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/pymcl/android/data/AiBridge$saveSettings$1;

    invoke-direct {v0, p0, p2}, Lcom/pymcl/android/data/AiBridge$saveSettings$1;-><init>(Lcom/pymcl/android/data/AiBridge;Lkotlin/coroutines/Continuation;)V

    .local v0, "$continuation":Lkotlin/coroutines/Continuation;
    :goto_0
    iget-object v1, v0, Lcom/pymcl/android/data/AiBridge$saveSettings$1;->result:Ljava/lang/Object;

    .local v1, "$result":Ljava/lang/Object;
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v2

    .line 94
    iget v3, v0, Lcom/pymcl/android/data/AiBridge$saveSettings$1;->label:I

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
    iget-object v2, v0, Lcom/pymcl/android/data/AiBridge$saveSettings$1;->L$0:Ljava/lang/Object;

    move-object p1, v2

    check-cast p1, Lcom/pymcl/ai/AiSettings;

    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :pswitch_1
    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    new-instance v3, Lcom/pymcl/android/data/AiBridge$saveSettings$2;

    const/4 v4, 0x0

    invoke-direct {v3, p0, p1, v4}, Lcom/pymcl/android/data/AiBridge$saveSettings$2;-><init>(Lcom/pymcl/android/data/AiBridge;Lcom/pymcl/ai/AiSettings;Lkotlin/coroutines/Continuation;)V

    check-cast v3, Lkotlin/jvm/functions/Function1;

    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    iput-object v4, v0, Lcom/pymcl/android/data/AiBridge$saveSettings$1;->L$0:Ljava/lang/Object;

    const/4 v4, 0x1

    iput v4, v0, Lcom/pymcl/android/data/AiBridge$saveSettings$1;->label:I

    invoke-direct {p0, v3, v0}, Lcom/pymcl/android/data/AiBridge;->io(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v2, :cond_1

    return-object v2

    :cond_1
    :goto_1
    sget-object v2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v2

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public send(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lkotlinx/coroutines/flow/Flow;
    .locals 1
    .param p1, "text"    # Ljava/lang/String;
    .param p2, "chatId"    # Ljava/lang/String;
    .param p3, "hidden"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lkotlinx/coroutines/flow/Flow<",
            "Lcom/pymcl/ai/AiEvent;",
            ">;"
        }
    .end annotation

    const-string v0, "text"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 78
    invoke-direct {p0}, Lcom/pymcl/android/data/AiBridge;->getService()Lcom/pymcl/ai/AiService;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3}, Lcom/pymcl/ai/AiService;->send(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lkotlinx/coroutines/flow/Flow;

    move-result-object v0

    return-object v0
.end method

.method public final sendAsItems(Ljava/lang/String;)Lkotlinx/coroutines/flow/Flow;
    .locals 2
    .param p1, "text"    # Ljava/lang/String;
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

    const-string v0, "text"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 111
    new-instance v0, Lcom/pymcl/android/data/AiBridge$sendAsItems$1;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, Lcom/pymcl/android/data/AiBridge$sendAsItems$1;-><init>(Lcom/pymcl/android/data/AiBridge;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    check-cast v0, Lkotlin/jvm/functions/Function2;

    invoke-static {v0}, Lkotlinx/coroutines/flow/FlowKt;->flow(Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/flow/Flow;

    move-result-object v0

    .line 114
    return-object v0
.end method

.method public setActive(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 5
    .param p1, "id"    # Ljava/lang/String;
    .param p2, "$completion"    # Lkotlin/coroutines/Continuation;
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

    instance-of v0, p2, Lcom/pymcl/android/data/AiBridge$setActive$1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/pymcl/android/data/AiBridge$setActive$1;

    iget v1, v0, Lcom/pymcl/android/data/AiBridge$setActive$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget v1, v0, Lcom/pymcl/android/data/AiBridge$setActive$1;->label:I

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/pymcl/android/data/AiBridge$setActive$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/pymcl/android/data/AiBridge$setActive$1;

    invoke-direct {v0, p0, p2}, Lcom/pymcl/android/data/AiBridge$setActive$1;-><init>(Lcom/pymcl/android/data/AiBridge;Lkotlin/coroutines/Continuation;)V

    .local v0, "$continuation":Lkotlin/coroutines/Continuation;
    :goto_0
    iget-object v1, v0, Lcom/pymcl/android/data/AiBridge$setActive$1;->result:Ljava/lang/Object;

    .local v1, "$result":Ljava/lang/Object;
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v2

    .line 88
    iget v3, v0, Lcom/pymcl/android/data/AiBridge$setActive$1;->label:I

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
    iget-object v2, v0, Lcom/pymcl/android/data/AiBridge$setActive$1;->L$0:Ljava/lang/Object;

    move-object p1, v2

    check-cast p1, Ljava/lang/String;

    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :pswitch_1
    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    invoke-direct {p0}, Lcom/pymcl/android/data/AiBridge;->getService()Lcom/pymcl/ai/AiService;

    move-result-object v3

    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    iput-object v4, v0, Lcom/pymcl/android/data/AiBridge$setActive$1;->L$0:Ljava/lang/Object;

    const/4 v4, 0x1

    iput v4, v0, Lcom/pymcl/android/data/AiBridge$setActive$1;->label:I

    invoke-virtual {v3, p1, v0}, Lcom/pymcl/ai/AiService;->setActiveAwait(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v2, :cond_1

    return-object v2

    :cond_1
    :goto_1
    sget-object v2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v2

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public settings(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 2
    .param p1, "$completion"    # Lkotlin/coroutines/Continuation;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/pymcl/ai/AiSettings;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 93
    new-instance v0, Lcom/pymcl/android/data/AiBridge$settings$2;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/pymcl/android/data/AiBridge$settings$2;-><init>(Lcom/pymcl/android/data/AiBridge;Lkotlin/coroutines/Continuation;)V

    check-cast v0, Lkotlin/jvm/functions/Function1;

    invoke-direct {p0, v0, p1}, Lcom/pymcl/android/data/AiBridge;->io(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public steer(Ljava/lang/String;)Z
    .locals 1
    .param p1, "text"    # Ljava/lang/String;

    const-string v0, "text"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 80
    invoke-direct {p0}, Lcom/pymcl/android/data/AiBridge;->getService()Lcom/pymcl/ai/AiService;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/pymcl/ai/AiService;->steer(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public stop()V
    .locals 1

    .line 79
    invoke-direct {p0}, Lcom/pymcl/android/data/AiBridge;->getService()Lcom/pymcl/ai/AiService;

    move-result-object v0

    invoke-virtual {v0}, Lcom/pymcl/ai/AiService;->stop()V

    return-void
.end method

.method public takeNetNotice()Ljava/lang/String;
    .locals 1

    .line 96
    invoke-direct {p0}, Lcom/pymcl/android/data/AiBridge;->getService()Lcom/pymcl/ai/AiService;

    move-result-object v0

    invoke-virtual {v0}, Lcom/pymcl/ai/AiService;->takeNetNotice()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public testConnection(Lcom/pymcl/ai/AiSettings;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 6
    .param p1, "st"    # Lcom/pymcl/ai/AiSettings;
    .param p2, "$completion"    # Lkotlin/coroutines/Continuation;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/pymcl/ai/AiSettings;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Pair<",
            "Ljava/lang/Boolean;",
            "Ljava/lang/String;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lcom/pymcl/android/data/AiBridge$testConnection$1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/pymcl/android/data/AiBridge$testConnection$1;

    iget v1, v0, Lcom/pymcl/android/data/AiBridge$testConnection$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget v1, v0, Lcom/pymcl/android/data/AiBridge$testConnection$1;->label:I

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/pymcl/android/data/AiBridge$testConnection$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/pymcl/android/data/AiBridge$testConnection$1;

    invoke-direct {v0, p0, p2}, Lcom/pymcl/android/data/AiBridge$testConnection$1;-><init>(Lcom/pymcl/android/data/AiBridge;Lkotlin/coroutines/Continuation;)V

    .local v0, "$continuation":Lkotlin/coroutines/Continuation;
    :goto_0
    iget-object v1, v0, Lcom/pymcl/android/data/AiBridge$testConnection$1;->result:Ljava/lang/Object;

    .local v1, "$result":Ljava/lang/Object;
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v2

    .line 92
    iget v3, v0, Lcom/pymcl/android/data/AiBridge$testConnection$1;->label:I

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
    iget-object v2, v0, Lcom/pymcl/android/data/AiBridge$testConnection$1;->L$0:Ljava/lang/Object;

    move-object p1, v2

    check-cast p1, Lcom/pymcl/ai/AiSettings;

    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object v3, v1

    goto :goto_3

    :pswitch_1
    iget-object v3, v0, Lcom/pymcl/android/data/AiBridge$testConnection$1;->L$1:Ljava/lang/Object;

    check-cast v3, Lcom/pymcl/ai/AiService;

    iget-object v4, v0, Lcom/pymcl/android/data/AiBridge$testConnection$1;->L$0:Ljava/lang/Object;

    move-object p1, v4

    check-cast p1, Lcom/pymcl/ai/AiSettings;

    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object v4, v1

    goto :goto_1

    :pswitch_2
    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    invoke-direct {p0}, Lcom/pymcl/android/data/AiBridge;->getService()Lcom/pymcl/ai/AiService;

    move-result-object v3

    if-nez p1, :cond_2

    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    iput-object v4, v0, Lcom/pymcl/android/data/AiBridge$testConnection$1;->L$0:Ljava/lang/Object;

    iput-object v3, v0, Lcom/pymcl/android/data/AiBridge$testConnection$1;->L$1:Ljava/lang/Object;

    const/4 v4, 0x1

    iput v4, v0, Lcom/pymcl/android/data/AiBridge$testConnection$1;->label:I

    invoke-virtual {p0, v0}, Lcom/pymcl/android/data/AiBridge;->settings(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v2, :cond_1

    return-object v2

    :cond_1
    :goto_1
    check-cast v4, Lcom/pymcl/ai/AiSettings;

    goto :goto_2

    :cond_2
    move-object v4, p1

    :goto_2
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    iput-object v5, v0, Lcom/pymcl/android/data/AiBridge$testConnection$1;->L$0:Ljava/lang/Object;

    const/4 v5, 0x0

    iput-object v5, v0, Lcom/pymcl/android/data/AiBridge$testConnection$1;->L$1:Ljava/lang/Object;

    const/4 v5, 0x2

    iput v5, v0, Lcom/pymcl/android/data/AiBridge$testConnection$1;->label:I

    invoke-virtual {v3, v4, v0}, Lcom/pymcl/ai/AiService;->testConnection(Lcom/pymcl/ai/AiSettings;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v2, :cond_3

    return-object v2

    :cond_3
    :goto_3
    return-object v3

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public usageText()Ljava/lang/String;
    .locals 7

    .line 108
    invoke-direct {p0}, Lcom/pymcl/android/data/AiBridge;->getService()Lcom/pymcl/ai/AiService;

    move-result-object v0

    invoke-virtual {v0}, Lcom/pymcl/ai/AiService;->getSessionUsage()Lcom/pymcl/ai/Usage;

    move-result-object v0

    .line 220
    .local v0, "u\\1":Lcom/pymcl/ai/Usage;
    const/4 v1, 0x0

    .line 108
    .local v1, "$i$a$-let-AiBridge$usageText$1\\1\\108\\0":I
    invoke-virtual {v0}, Lcom/pymcl/ai/Usage;->getPrompt()J

    move-result-wide v2

    invoke-virtual {v0}, Lcom/pymcl/ai/Usage;->getCompletion()J

    move-result-wide v4

    add-long/2addr v2, v4

    const-wide/16 v4, 0x0

    cmp-long v2, v2, v4

    const-string v3, ""

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    sget-object v2, Lcom/pymcl/ai/AiText;->INSTANCE:Lcom/pymcl/ai/AiText;

    invoke-virtual {v0}, Lcom/pymcl/ai/Usage;->getPrompt()J

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    invoke-virtual {v0}, Lcom/pymcl/ai/Usage;->getCompletion()J

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    filled-new-array {v4, v5}, [Ljava/lang/Object;

    move-result-object v4

    const-string v5, "\u672c\u4f1a\u8bdd\uff1a\u8f93\u5165 {0} / \u8f93\u51fa {1} tokens"

    invoke-virtual {v2, v5, v4}, Lcom/pymcl/ai/AiText;->t(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0}, Lcom/pymcl/ai/Usage;->getEstimated()Z

    move-result v4

    if-eqz v4, :cond_1

    sget-object v3, Lcom/pymcl/ai/AiText;->INSTANCE:Lcom/pymcl/ai/AiText;

    const/4 v4, 0x0

    new-array v4, v4, [Ljava/lang/Object;

    const-string v5, "\uff08\u4f30\u7b97\uff09"

    invoke-virtual {v3, v5, v4}, Lcom/pymcl/ai/AiText;->t(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    :cond_1
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .end local v0    # "u\\1":Lcom/pymcl/ai/Usage;
    .end local v1    # "$i$a$-let-AiBridge$usageText$1\\1\\108\\0":I
    :goto_0
    return-object v3
.end method
