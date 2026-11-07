.class public final Lcom/pymcl/multiplayer/MultiplayerController;
.super Ljava/lang/Object;
.source "MultiplayerController.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/pymcl/multiplayer/MultiplayerController$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nMultiplayerController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultiplayerController.kt\ncom/pymcl/multiplayer/MultiplayerController\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,168:1\n1#2:169\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000|\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0010 \n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\t\u0018\u0000 B2\u00020\u0001:\u0001BB\u0011\u0008\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0006\u0010/\u001a\u00020*J\u0008\u00100\u001a\u000201H\u0002J\u001a\u00102\u001a\u00020*2\n\u0008\u0002\u00103\u001a\u0004\u0018\u000104H\u0086@\u00a2\u0006\u0002\u00105J\u0016\u00106\u001a\u00020*2\u0006\u00107\u001a\u00020\u0015H\u0086@\u00a2\u0006\u0002\u00108J\u0010\u00109\u001a\u0004\u0018\u00010:2\u0006\u00107\u001a\u00020\u0015J\u000e\u0010;\u001a\u000201H\u0086@\u00a2\u0006\u0002\u0010<J\u0008\u0010=\u001a\u0004\u0018\u00010\u0015J\u0008\u0010>\u001a\u000201H\u0002J\u0008\u0010?\u001a\u000201H\u0002J\u000e\u0010@\u001a\u0002012\u0006\u0010A\u001a\u00020*R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\n0\u000c\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000eR\u0016\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0019\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000c\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010\u000eR\u0014\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u00150\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u00150\u0017\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0018\u0010\u0019R\"\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0008\u0010\u001a\u001a\u0004\u0018\u00010\u001b@BX\u0086\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001d\u0010\u001eR\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008 \u0010!\"\u0004\u0008\"\u0010#R \u0010$\u001a\u0008\u0012\u0004\u0012\u00020\u00150%X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008&\u0010\'\"\u0004\u0008(\u0010)R\u001e\u0010+\u001a\u00020*2\u0006\u0010\u001a\u001a\u00020*@BX\u0086\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008+\u0010,R\u0010\u0010-\u001a\u0004\u0018\u00010.X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006C"
    }
    d2 = {
        "Lcom/pymcl/multiplayer/MultiplayerController;",
        "",
        "app",
        "Landroid/content/Context;",
        "<init>",
        "(Landroid/content/Context;)V",
        "scope",
        "Lkotlinx/coroutines/CoroutineScope;",
        "_state",
        "Lkotlinx/coroutines/flow/MutableStateFlow;",
        "Lcom/pymcl/multiplayer/MultiplayerState;",
        "state",
        "Lkotlinx/coroutines/flow/StateFlow;",
        "getState",
        "()Lkotlinx/coroutines/flow/StateFlow;",
        "_vpnPermission",
        "Landroid/content/Intent;",
        "vpnPermission",
        "getVpnPermission",
        "_notices",
        "Lkotlinx/coroutines/flow/MutableSharedFlow;",
        "",
        "notices",
        "Lkotlinx/coroutines/flow/SharedFlow;",
        "getNotices",
        "()Lkotlinx/coroutines/flow/SharedFlow;",
        "value",
        "Lnet/burningtnt/terracotta/TerracottaAndroidAPI$Metadata;",
        "metadata",
        "getMetadata",
        "()Lnet/burningtnt/terracotta/TerracottaAndroidAPI$Metadata;",
        "playerName",
        "getPlayerName",
        "()Ljava/lang/String;",
        "setPlayerName",
        "(Ljava/lang/String;)V",
        "extraNodes",
        "",
        "getExtraNodes",
        "()Ljava/util/List;",
        "setExtraNodes",
        "(Ljava/util/List;)V",
        "",
        "isHost",
        "()Z",
        "poller",
        "Lkotlinx/coroutines/Job;",
        "initialize",
        "startPolling",
        "",
        "host",
        "port",
        "",
        "(Ljava/lang/Integer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "join",
        "code",
        "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "parseRoomType",
        "Lnet/burningtnt/terracotta/TerracottaAndroidAPI$RoomType;",
        "stop",
        "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "collectLogs",
        "ensureWaiting",
        "requestVpn",
        "onVpnPermissionResult",
        "granted",
        "Companion",
        "PyMCL-Android:multiplayer_debug"
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
.field public static final Companion:Lcom/pymcl/multiplayer/MultiplayerController$Companion;

.field private static final DEFAULT_EXTRA_NODES:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private static final TAG:Ljava/lang/String; = "PyMCL-MP"

.field public static final VPN_DENIED_NOTICE:Ljava/lang/String; = "\u6ca1\u6709\u83b7\u5f97 VPN \u6388\u6743\uff0c\u8054\u673a\u5df2\u53d6\u6d88\u3002\u9676\u74e6\u8054\u673a\u9700\u8981\u5efa\u7acb\u865a\u62df\u7f51\u5361\uff0c\u8bf7\u91cd\u65b0\u70b9\u300c\u521b\u5efa\u300d\u6216\u300c\u52a0\u5165\u300d\u5e76\u5728\u7cfb\u7edf\u5f39\u7a97\u91cc\u5141\u8bb8"

.field private static volatile instance:Lcom/pymcl/multiplayer/MultiplayerController;

.field private static final isNativeAvailable$delegate:Lkotlin/Lazy;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/Lazy<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final _notices:Lkotlinx/coroutines/flow/MutableSharedFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/MutableSharedFlow<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final _state:Lkotlinx/coroutines/flow/MutableStateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/MutableStateFlow<",
            "Lcom/pymcl/multiplayer/MultiplayerState;",
            ">;"
        }
    .end annotation
.end field

.field private final _vpnPermission:Lkotlinx/coroutines/flow/MutableStateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/MutableStateFlow<",
            "Landroid/content/Intent;",
            ">;"
        }
    .end annotation
.end field

.field private final app:Landroid/content/Context;

.field private extraNodes:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private volatile isHost:Z

.field private metadata:Lnet/burningtnt/terracotta/TerracottaAndroidAPI$Metadata;

.field private final notices:Lkotlinx/coroutines/flow/SharedFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/SharedFlow<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private playerName:Ljava/lang/String;

.field private poller:Lkotlinx/coroutines/Job;

.field private final scope:Lkotlinx/coroutines/CoroutineScope;

.field private final state:Lkotlinx/coroutines/flow/StateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Lcom/pymcl/multiplayer/MultiplayerState;",
            ">;"
        }
    .end annotation
.end field

.field private final vpnPermission:Lkotlinx/coroutines/flow/StateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Landroid/content/Intent;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static synthetic $r8$lambda$7MYb2KDauSh2xDEAumCgyXEvOsE(Lcom/pymcl/multiplayer/MultiplayerController;)V
    .locals 0

    invoke-static {p0}, Lcom/pymcl/multiplayer/MultiplayerController;->initialize$lambda$0(Lcom/pymcl/multiplayer/MultiplayerController;)V

    return-void
.end method

.method public static synthetic $r8$lambda$iLYOWzuWJXpZ1CdwYtvmcThxBOg()Z
    .locals 1

    invoke-static {}, Lcom/pymcl/multiplayer/MultiplayerController;->isNativeAvailable_delegate$lambda$0()Z

    move-result v0

    return v0
.end method

.method public static synthetic $r8$lambda$o3dx1RkT3Xw0jIvPZnbuj1tHMOA(Lcom/pymcl/multiplayer/MultiplayerController;Ljava/lang/String;)Z
    .locals 0

    invoke-static {p0, p1}, Lcom/pymcl/multiplayer/MultiplayerController;->initialize$lambda$1(Lcom/pymcl/multiplayer/MultiplayerController;Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/pymcl/multiplayer/MultiplayerController$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/pymcl/multiplayer/MultiplayerController$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/pymcl/multiplayer/MultiplayerController;->Companion:Lcom/pymcl/multiplayer/MultiplayerController$Companion;

    .line 76
    const-string v0, "https://terracotta.glavo.site/acebc7d8-1208-47fd-b212-d03ac49e36e0"

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lcom/pymcl/multiplayer/MultiplayerController;->DEFAULT_EXTRA_NODES:Ljava/util/List;

    .line 79
    new-instance v0, Lcom/pymcl/multiplayer/MultiplayerController$$ExternalSyntheticLambda0;

    invoke-direct {v0}, Lcom/pymcl/multiplayer/MultiplayerController$$ExternalSyntheticLambda0;-><init>()V

    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    sput-object v0, Lcom/pymcl/multiplayer/MultiplayerController;->isNativeAvailable$delegate:Lkotlin/Lazy;

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;)V
    .locals 4
    .param p1, "app"    # Landroid/content/Context;

    .line 70
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/pymcl/multiplayer/MultiplayerController;->app:Landroid/content/Context;

    .line 82
    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-static {v1, v0, v1}, Lkotlinx/coroutines/SupervisorKt;->SupervisorJob$default(Lkotlinx/coroutines/Job;ILjava/lang/Object;)Lkotlinx/coroutines/CompletableJob;

    move-result-object v0

    invoke-static {}, Lkotlinx/coroutines/Dispatchers;->getIO()Lkotlinx/coroutines/CoroutineDispatcher;

    move-result-object v2

    check-cast v2, Lkotlin/coroutines/CoroutineContext;

    invoke-interface {v0, v2}, Lkotlinx/coroutines/CompletableJob;->plus(Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;

    move-result-object v0

    invoke-static {v0}, Lkotlinx/coroutines/CoroutineScopeKt;->CoroutineScope(Lkotlin/coroutines/CoroutineContext;)Lkotlinx/coroutines/CoroutineScope;

    move-result-object v0

    iput-object v0, p0, Lcom/pymcl/multiplayer/MultiplayerController;->scope:Lkotlinx/coroutines/CoroutineScope;

    .line 83
    sget-object v0, Lcom/pymcl/multiplayer/MultiplayerState$Uninitialized;->INSTANCE:Lcom/pymcl/multiplayer/MultiplayerState$Uninitialized;

    invoke-static {v0}, Lkotlinx/coroutines/flow/StateFlowKt;->MutableStateFlow(Ljava/lang/Object;)Lkotlinx/coroutines/flow/MutableStateFlow;

    move-result-object v0

    iput-object v0, p0, Lcom/pymcl/multiplayer/MultiplayerController;->_state:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 84
    iget-object v0, p0, Lcom/pymcl/multiplayer/MultiplayerController;->_state:Lkotlinx/coroutines/flow/MutableStateFlow;

    check-cast v0, Lkotlinx/coroutines/flow/StateFlow;

    iput-object v0, p0, Lcom/pymcl/multiplayer/MultiplayerController;->state:Lkotlinx/coroutines/flow/StateFlow;

    .line 86
    invoke-static {v1}, Lkotlinx/coroutines/flow/StateFlowKt;->MutableStateFlow(Ljava/lang/Object;)Lkotlinx/coroutines/flow/MutableStateFlow;

    move-result-object v0

    iput-object v0, p0, Lcom/pymcl/multiplayer/MultiplayerController;->_vpnPermission:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 87
    iget-object v0, p0, Lcom/pymcl/multiplayer/MultiplayerController;->_vpnPermission:Lkotlinx/coroutines/flow/MutableStateFlow;

    check-cast v0, Lkotlinx/coroutines/flow/StateFlow;

    iput-object v0, p0, Lcom/pymcl/multiplayer/MultiplayerController;->vpnPermission:Lkotlinx/coroutines/flow/StateFlow;

    .line 89
    const/4 v0, 0x4

    const/4 v2, 0x5

    const/4 v3, 0x0

    invoke-static {v3, v0, v1, v2, v1}, Lkotlinx/coroutines/flow/SharedFlowKt;->MutableSharedFlow$default(IILkotlinx/coroutines/channels/BufferOverflow;ILjava/lang/Object;)Lkotlinx/coroutines/flow/MutableSharedFlow;

    move-result-object v0

    iput-object v0, p0, Lcom/pymcl/multiplayer/MultiplayerController;->_notices:Lkotlinx/coroutines/flow/MutableSharedFlow;

    .line 90
    iget-object v0, p0, Lcom/pymcl/multiplayer/MultiplayerController;->_notices:Lkotlinx/coroutines/flow/MutableSharedFlow;

    check-cast v0, Lkotlinx/coroutines/flow/SharedFlow;

    iput-object v0, p0, Lcom/pymcl/multiplayer/MultiplayerController;->notices:Lkotlinx/coroutines/flow/SharedFlow;

    .line 93
    sget-object v0, Lcom/pymcl/multiplayer/MultiplayerController;->DEFAULT_EXTRA_NODES:Ljava/util/List;

    iput-object v0, p0, Lcom/pymcl/multiplayer/MultiplayerController;->extraNodes:Ljava/util/List;

    .line 70
    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/pymcl/multiplayer/MultiplayerController;-><init>(Landroid/content/Context;)V

    return-void
.end method

.method public static final synthetic access$ensureWaiting(Lcom/pymcl/multiplayer/MultiplayerController;)V
    .locals 0
    .param p0, "$this"    # Lcom/pymcl/multiplayer/MultiplayerController;

    .line 70
    invoke-direct {p0}, Lcom/pymcl/multiplayer/MultiplayerController;->ensureWaiting()V

    return-void
.end method

.method public static final synthetic access$getApp$p(Lcom/pymcl/multiplayer/MultiplayerController;)Landroid/content/Context;
    .locals 1
    .param p0, "$this"    # Lcom/pymcl/multiplayer/MultiplayerController;

    .line 70
    iget-object v0, p0, Lcom/pymcl/multiplayer/MultiplayerController;->app:Landroid/content/Context;

    return-object v0
.end method

.method public static final synthetic access$getDEFAULT_EXTRA_NODES$cp()Ljava/util/List;
    .locals 1

    .line 70
    sget-object v0, Lcom/pymcl/multiplayer/MultiplayerController;->DEFAULT_EXTRA_NODES:Ljava/util/List;

    return-object v0
.end method

.method public static final synthetic access$getInstance$cp()Lcom/pymcl/multiplayer/MultiplayerController;
    .locals 1

    .line 70
    sget-object v0, Lcom/pymcl/multiplayer/MultiplayerController;->instance:Lcom/pymcl/multiplayer/MultiplayerController;

    return-object v0
.end method

.method public static final synthetic access$get_notices$p(Lcom/pymcl/multiplayer/MultiplayerController;)Lkotlinx/coroutines/flow/MutableSharedFlow;
    .locals 1
    .param p0, "$this"    # Lcom/pymcl/multiplayer/MultiplayerController;

    .line 70
    iget-object v0, p0, Lcom/pymcl/multiplayer/MultiplayerController;->_notices:Lkotlinx/coroutines/flow/MutableSharedFlow;

    return-object v0
.end method

.method public static final synthetic access$get_state$p(Lcom/pymcl/multiplayer/MultiplayerController;)Lkotlinx/coroutines/flow/MutableStateFlow;
    .locals 1
    .param p0, "$this"    # Lcom/pymcl/multiplayer/MultiplayerController;

    .line 70
    iget-object v0, p0, Lcom/pymcl/multiplayer/MultiplayerController;->_state:Lkotlinx/coroutines/flow/MutableStateFlow;

    return-object v0
.end method

.method public static final synthetic access$isNativeAvailable$delegate$cp()Lkotlin/Lazy;
    .locals 1

    .line 70
    sget-object v0, Lcom/pymcl/multiplayer/MultiplayerController;->isNativeAvailable$delegate:Lkotlin/Lazy;

    return-object v0
.end method

.method public static final synthetic access$requestVpn(Lcom/pymcl/multiplayer/MultiplayerController;)V
    .locals 0
    .param p0, "$this"    # Lcom/pymcl/multiplayer/MultiplayerController;

    .line 70
    invoke-direct {p0}, Lcom/pymcl/multiplayer/MultiplayerController;->requestVpn()V

    return-void
.end method

.method public static final synthetic access$setHost$p(Lcom/pymcl/multiplayer/MultiplayerController;Z)V
    .locals 0
    .param p0, "$this"    # Lcom/pymcl/multiplayer/MultiplayerController;
    .param p1, "<set-?>"    # Z

    .line 70
    iput-boolean p1, p0, Lcom/pymcl/multiplayer/MultiplayerController;->isHost:Z

    return-void
.end method

.method public static final synthetic access$setInstance$cp(Lcom/pymcl/multiplayer/MultiplayerController;)V
    .locals 0
    .param p0, "<set-?>"    # Lcom/pymcl/multiplayer/MultiplayerController;

    .line 70
    sput-object p0, Lcom/pymcl/multiplayer/MultiplayerController;->instance:Lcom/pymcl/multiplayer/MultiplayerController;

    return-void
.end method

.method private final ensureWaiting()V
    .locals 2

    .line 152
    iget-object v0, p0, Lcom/pymcl/multiplayer/MultiplayerController;->_state:Lkotlinx/coroutines/flow/MutableStateFlow;

    invoke-interface {v0}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    move-result-object v0

    instance-of v0, v0, Lcom/pymcl/multiplayer/MultiplayerState$Waiting;

    if-nez v0, :cond_0

    :try_start_0
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object v0, p0

    check-cast v0, Lcom/pymcl/multiplayer/MultiplayerController;

    .line 169
    .local v0, "$this$ensureWaiting_u24lambda_u240":Lcom/pymcl/multiplayer/MultiplayerController;
    const/4 v1, 0x0

    .line 152
    .local v1, "$i$a$-runCatching-MultiplayerController$ensureWaiting$1":I
    invoke-static {}, Lnet/burningtnt/terracotta/TerracottaAndroidAPI;->setWaiting()V

    .end local v0    # "$this$ensureWaiting_u24lambda_u240":Lcom/pymcl/multiplayer/MultiplayerController;
    .end local v1    # "$i$a$-runCatching-MultiplayerController$ensureWaiting$1":I
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    :goto_0
    return-void
.end method

.method public static synthetic host$default(Lcom/pymcl/multiplayer/MultiplayerController;Ljava/lang/Integer;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 125
    and-int/lit8 p3, p3, 0x1

    if-eqz p3, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/pymcl/multiplayer/MultiplayerController;->host(Ljava/lang/Integer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private static final initialize$lambda$0(Lcom/pymcl/multiplayer/MultiplayerController;)V
    .locals 6
    .param p0, "this$0"    # Lcom/pymcl/multiplayer/MultiplayerController;

    .line 101
    iget-object v0, p0, Lcom/pymcl/multiplayer/MultiplayerController;->scope:Lkotlinx/coroutines/CoroutineScope;

    invoke-static {}, Lkotlinx/coroutines/Dispatchers;->getMain()Lkotlinx/coroutines/MainCoroutineDispatcher;

    move-result-object v1

    check-cast v1, Lkotlin/coroutines/CoroutineContext;

    new-instance v2, Lcom/pymcl/multiplayer/MultiplayerController$initialize$1$1;

    const/4 v3, 0x0

    invoke-direct {v2, p0, v3}, Lcom/pymcl/multiplayer/MultiplayerController$initialize$1$1;-><init>(Lcom/pymcl/multiplayer/MultiplayerController;Lkotlin/coroutines/Continuation;)V

    move-object v3, v2

    check-cast v3, Lkotlin/jvm/functions/Function2;

    const/4 v4, 0x2

    const/4 v5, 0x0

    const/4 v2, 0x0

    invoke-static/range {v0 .. v5}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    return-void
.end method

.method private static final initialize$lambda$1(Lcom/pymcl/multiplayer/MultiplayerController;Ljava/lang/String;)Z
    .locals 4
    .param p0, "this$0"    # Lcom/pymcl/multiplayer/MultiplayerController;
    .param p1, "c"    # Ljava/lang/String;

    const-string v0, "c"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 103
    const/4 v0, 0x0

    :try_start_0
    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object v1, p0

    .line 169
    .local v1, "$this$initialize_u24lambda_u241_u240":Lcom/pymcl/multiplayer/MultiplayerController;
    const/4 v2, 0x0

    .line 103
    .local v2, "$i$a$-runCatching-MultiplayerController$initialize$2$1":I
    invoke-static {p1}, Lnet/burningtnt/terracotta/TerracottaAndroidAPI;->parseRoomCode(Ljava/lang/String;)Lnet/burningtnt/terracotta/TerracottaAndroidAPI$RoomType;

    move-result-object v3

    if-eqz v3, :cond_0

    const/4 v3, 0x1

    goto :goto_0

    :cond_0
    move v3, v0

    .end local v1    # "$this$initialize_u24lambda_u241_u240":Lcom/pymcl/multiplayer/MultiplayerController;
    .end local v2    # "$i$a$-runCatching-MultiplayerController$initialize$2$1":I
    :goto_0
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-static {v1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v1

    sget-object v2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    :goto_1
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v1}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    move-object v1, v0

    :cond_1
    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method private static final isNativeAvailable_delegate$lambda$0()Z
    .locals 3

    .line 79
    sget-object v0, Lcom/pymcl/multiplayer/MultiplayerController;->Companion:Lcom/pymcl/multiplayer/MultiplayerController$Companion;

    :try_start_0
    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 169
    .local v0, "$this$isNativeAvailable_delegate_u24lambda_u240_u240":Lcom/pymcl/multiplayer/MultiplayerController$Companion;
    const/4 v1, 0x0

    .line 79
    .local v1, "$i$a$-runCatching-MultiplayerController$Companion$isNativeAvailable$2$1":I
    const-string v2, "net.burningtnt.terracotta.TerracottaAndroidAPI"

    invoke-static {v2}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    const/4 v0, 0x1

    .end local v0    # "$this$isNativeAvailable_delegate_u24lambda_u240_u240":Lcom/pymcl/multiplayer/MultiplayerController$Companion;
    .end local v1    # "$i$a$-runCatching-MultiplayerController$Companion$isNativeAvailable$2$1":I
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

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
    invoke-static {v0}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v1

    if-nez v1, :cond_0

    goto :goto_1

    .line 169
    .local v1, "it":Ljava/lang/Throwable;
    :cond_0
    const/4 v0, 0x0

    .line 79
    .local v0, "$i$a$-getOrElse-MultiplayerController$Companion$isNativeAvailable$2$2":I
    const/4 v0, 0x0

    .end local v0    # "$i$a$-getOrElse-MultiplayerController$Companion$isNativeAvailable$2$2":I
    .end local v1    # "it":Ljava/lang/Throwable;
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    :goto_1
    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method private final requestVpn()V
    .locals 3

    .line 155
    iget-object v0, p0, Lcom/pymcl/multiplayer/MultiplayerController;->app:Landroid/content/Context;

    invoke-static {v0}, Landroid/net/VpnService;->prepare(Landroid/content/Context;)Landroid/content/Intent;

    move-result-object v0

    .line 156
    .local v0, "intent":Landroid/content/Intent;
    if-nez v0, :cond_0

    sget-object v1, Lcom/pymcl/multiplayer/TerracottaVpnService;->Companion:Lcom/pymcl/multiplayer/TerracottaVpnService$Companion;

    iget-object v2, p0, Lcom/pymcl/multiplayer/MultiplayerController;->app:Landroid/content/Context;

    invoke-virtual {v1, v2}, Lcom/pymcl/multiplayer/TerracottaVpnService$Companion;->start(Landroid/content/Context;)Landroid/content/ComponentName;

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lcom/pymcl/multiplayer/MultiplayerController;->_vpnPermission:Lkotlinx/coroutines/flow/MutableStateFlow;

    invoke-interface {v1, v0}, Lkotlinx/coroutines/flow/MutableStateFlow;->setValue(Ljava/lang/Object;)V

    .line 157
    :goto_0
    return-void
.end method

.method private final startPolling()V
    .locals 9

    .line 111
    iget-object v0, p0, Lcom/pymcl/multiplayer/MultiplayerController;->poller:Lkotlinx/coroutines/Job;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    const/4 v2, 0x1

    invoke-static {v0, v1, v2, v1}, Lkotlinx/coroutines/Job$DefaultImpls;->cancel$default(Lkotlinx/coroutines/Job;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    .line 112
    :cond_0
    iget-object v3, p0, Lcom/pymcl/multiplayer/MultiplayerController;->scope:Lkotlinx/coroutines/CoroutineScope;

    new-instance v0, Lcom/pymcl/multiplayer/MultiplayerController$startPolling$1;

    invoke-direct {v0, p0, v1}, Lcom/pymcl/multiplayer/MultiplayerController$startPolling$1;-><init>(Lcom/pymcl/multiplayer/MultiplayerController;Lkotlin/coroutines/Continuation;)V

    move-object v6, v0

    check-cast v6, Lkotlin/jvm/functions/Function2;

    const/4 v7, 0x3

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v3 .. v8}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    move-result-object v0

    iput-object v0, p0, Lcom/pymcl/multiplayer/MultiplayerController;->poller:Lkotlinx/coroutines/Job;

    .line 122
    return-void
.end method


# virtual methods
.method public final collectLogs()Ljava/lang/String;
    .locals 7

    .line 150
    iget-object v0, p0, Lcom/pymcl/multiplayer/MultiplayerController;->metadata:Lnet/burningtnt/terracotta/TerracottaAndroidAPI$Metadata;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    goto :goto_2

    :cond_0
    :try_start_0
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object v0, p0

    check-cast v0, Lcom/pymcl/multiplayer/MultiplayerController;

    .line 169
    .local v0, "$this$collectLogs_u24lambda_u240":Lcom/pymcl/multiplayer/MultiplayerController;
    const/4 v2, 0x0

    .line 150
    .local v2, "$i$a$-runCatching-MultiplayerController$collectLogs$1":I
    invoke-static {}, Lnet/burningtnt/terracotta/TerracottaAndroidAPI;->collectLogs()Ljava/io/Reader;

    move-result-object v3

    check-cast v3, Ljava/io/Closeable;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    :try_start_1
    move-object v4, v3

    check-cast v4, Ljava/io/Reader;

    .line 169
    .local v4, "it":Ljava/io/Reader;
    const/4 v5, 0x0

    .line 150
    .local v5, "$i$a$-use-MultiplayerController$collectLogs$1$1":I
    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-static {v4}, Lkotlin/io/TextStreamsKt;->readText(Ljava/io/Reader;)Ljava/lang/String;

    move-result-object v6
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .end local v4    # "it":Ljava/io/Reader;
    .end local v5    # "$i$a$-use-MultiplayerController$collectLogs$1$1":I
    :try_start_2
    invoke-static {v3, v1}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .end local v0    # "$this$collectLogs_u24lambda_u240":Lcom/pymcl/multiplayer/MultiplayerController;
    .end local v2    # "$i$a$-runCatching-MultiplayerController$collectLogs$1":I
    invoke-static {v6}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    goto :goto_0

    .restart local v0    # "$this$collectLogs_u24lambda_u240":Lcom/pymcl/multiplayer/MultiplayerController;
    .restart local v2    # "$i$a$-runCatching-MultiplayerController$collectLogs$1":I
    :catchall_0
    move-exception v4

    .end local v0    # "$this$collectLogs_u24lambda_u240":Lcom/pymcl/multiplayer/MultiplayerController;
    .end local v2    # "$i$a$-runCatching-MultiplayerController$collectLogs$1":I
    :try_start_3
    throw v4
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .restart local v0    # "$this$collectLogs_u24lambda_u240":Lcom/pymcl/multiplayer/MultiplayerController;
    .restart local v2    # "$i$a$-runCatching-MultiplayerController$collectLogs$1":I
    :catchall_1
    move-exception v5

    :try_start_4
    invoke-static {v3, v4}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v5
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .end local v0    # "$this$collectLogs_u24lambda_u240":Lcom/pymcl/multiplayer/MultiplayerController;
    .end local v2    # "$i$a$-runCatching-MultiplayerController$collectLogs$1":I
    :catchall_2
    move-exception v0

    sget-object v2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    :goto_0
    invoke-static {v0}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    goto :goto_1

    :cond_1
    move-object v1, v0

    :goto_1
    check-cast v1, Ljava/lang/String;

    :goto_2
    return-object v1
.end method

.method public final getExtraNodes()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 93
    iget-object v0, p0, Lcom/pymcl/multiplayer/MultiplayerController;->extraNodes:Ljava/util/List;

    return-object v0
.end method

.method public final getMetadata()Lnet/burningtnt/terracotta/TerracottaAndroidAPI$Metadata;
    .locals 1

    .line 91
    iget-object v0, p0, Lcom/pymcl/multiplayer/MultiplayerController;->metadata:Lnet/burningtnt/terracotta/TerracottaAndroidAPI$Metadata;

    return-object v0
.end method

.method public final getNotices()Lkotlinx/coroutines/flow/SharedFlow;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/SharedFlow<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 90
    iget-object v0, p0, Lcom/pymcl/multiplayer/MultiplayerController;->notices:Lkotlinx/coroutines/flow/SharedFlow;

    return-object v0
.end method

.method public final getPlayerName()Ljava/lang/String;
    .locals 1

    .line 92
    iget-object v0, p0, Lcom/pymcl/multiplayer/MultiplayerController;->playerName:Ljava/lang/String;

    return-object v0
.end method

.method public final getState()Lkotlinx/coroutines/flow/StateFlow;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Lcom/pymcl/multiplayer/MultiplayerState;",
            ">;"
        }
    .end annotation

    .line 84
    iget-object v0, p0, Lcom/pymcl/multiplayer/MultiplayerController;->state:Lkotlinx/coroutines/flow/StateFlow;

    return-object v0
.end method

.method public final getVpnPermission()Lkotlinx/coroutines/flow/StateFlow;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Landroid/content/Intent;",
            ">;"
        }
    .end annotation

    .line 87
    iget-object v0, p0, Lcom/pymcl/multiplayer/MultiplayerController;->vpnPermission:Lkotlinx/coroutines/flow/StateFlow;

    return-object v0
.end method

.method public final host(Ljava/lang/Integer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 3
    .param p1, "port"    # Ljava/lang/Integer;
    .param p2, "$completion"    # Lkotlin/coroutines/Continuation;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Integer;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 125
    invoke-static {}, Lkotlinx/coroutines/Dispatchers;->getIO()Lkotlinx/coroutines/CoroutineDispatcher;

    move-result-object v0

    check-cast v0, Lkotlin/coroutines/CoroutineContext;

    new-instance v1, Lcom/pymcl/multiplayer/MultiplayerController$host$2;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, Lcom/pymcl/multiplayer/MultiplayerController$host$2;-><init>(Lcom/pymcl/multiplayer/MultiplayerController;Ljava/lang/Integer;Lkotlin/coroutines/Continuation;)V

    check-cast v1, Lkotlin/jvm/functions/Function2;

    invoke-static {v0, v1, p2}, Lkotlinx/coroutines/BuildersKt;->withContext(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    .line 130
    return-object v0
.end method

.method public final declared-synchronized initialize()Z
    .locals 6

    monitor-enter p0

    .line 99
    :try_start_0
    iget-object v0, p0, Lcom/pymcl/multiplayer/MultiplayerController;->metadata:Lnet/burningtnt/terracotta/TerracottaAndroidAPI$Metadata;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    monitor-exit p0

    return v1

    .line 100
    :cond_0
    nop

    .line 101
    :try_start_1
    iget-object v0, p0, Lcom/pymcl/multiplayer/MultiplayerController;->app:Landroid/content/Context;

    new-instance v2, Lcom/pymcl/multiplayer/MultiplayerController$$ExternalSyntheticLambda1;

    invoke-direct {v2, p0}, Lcom/pymcl/multiplayer/MultiplayerController$$ExternalSyntheticLambda1;-><init>(Lcom/pymcl/multiplayer/MultiplayerController;)V

    invoke-static {v0, v2}, Lnet/burningtnt/terracotta/TerracottaAndroidAPI;->initialize(Landroid/content/Context;Lnet/burningtnt/terracotta/TerracottaAndroidAPI$VpnServiceCallback;)Lnet/burningtnt/terracotta/TerracottaAndroidAPI$Metadata;

    move-result-object v0

    iput-object v0, p0, Lcom/pymcl/multiplayer/MultiplayerController;->metadata:Lnet/burningtnt/terracotta/TerracottaAndroidAPI$Metadata;

    .line 102
    const-string v0, "PyMCL-MP"

    iget-object v2, p0, Lcom/pymcl/multiplayer/MultiplayerController;->metadata:Lnet/burningtnt/terracotta/TerracottaAndroidAPI$Metadata;

    const/4 v3, 0x0

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Lnet/burningtnt/terracotta/TerracottaAndroidAPI$Metadata;->getTerracottaVersion()Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    :cond_1
    move-object v2, v3

    :goto_0
    iget-object v4, p0, Lcom/pymcl/multiplayer/MultiplayerController;->metadata:Lnet/burningtnt/terracotta/TerracottaAndroidAPI$Metadata;

    if-eqz v4, :cond_2

    invoke-virtual {v4}, Lnet/burningtnt/terracotta/TerracottaAndroidAPI$Metadata;->getEasyTierVersion()Ljava/lang/String;

    move-result-object v3

    :cond_2
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Terracotta "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v4, " / EasyTier "

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 103
    sget-object v0, Lcom/pymcl/multiplayer/TerracottaInterop;->INSTANCE:Lcom/pymcl/multiplayer/TerracottaInterop;

    new-instance v2, Lcom/pymcl/multiplayer/MultiplayerController$$ExternalSyntheticLambda2;

    invoke-direct {v2, p0}, Lcom/pymcl/multiplayer/MultiplayerController$$ExternalSyntheticLambda2;-><init>(Lcom/pymcl/multiplayer/MultiplayerController;)V

    invoke-virtual {v0, v2}, Lcom/pymcl/multiplayer/TerracottaInterop;->setNativeVerifier(Lkotlin/jvm/functions/Function1;)V

    .line 104
    invoke-direct {p0}, Lcom/pymcl/multiplayer/MultiplayerController;->startPolling()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    .line 105
    :catchall_0
    move-exception v0

    .line 106
    .local v0, "t":Ljava/lang/Throwable;
    :try_start_2
    const-string v1, "PyMCL-MP"

    const-string v2, "init failed"

    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    iget-object v1, p0, Lcom/pymcl/multiplayer/MultiplayerController;->_state:Lkotlinx/coroutines/flow/MutableStateFlow;

    new-instance v2, Lcom/pymcl/multiplayer/MultiplayerState$Unavailable;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_3

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v3

    .end local p0    # "this":Lcom/pymcl/multiplayer/MultiplayerController;
    :cond_3
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-direct {v2, v3}, Lcom/pymcl/multiplayer/MultiplayerState$Unavailable;-><init>(Ljava/lang/String;)V

    invoke-interface {v1, v2}, Lkotlinx/coroutines/flow/MutableStateFlow;->setValue(Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    const/4 v1, 0x0

    .line 100
    .end local v0    # "t":Ljava/lang/Throwable;
    :goto_1
    monitor-exit p0

    return v1

    .line 98
    :catchall_1
    move-exception v0

    :try_start_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    throw v0
.end method

.method public final isHost()Z
    .locals 1

    .line 94
    iget-boolean v0, p0, Lcom/pymcl/multiplayer/MultiplayerController;->isHost:Z

    return v0
.end method

.method public final join(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 3
    .param p1, "code"    # Ljava/lang/String;
    .param p2, "$completion"    # Lkotlin/coroutines/Continuation;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 133
    invoke-static {}, Lkotlinx/coroutines/Dispatchers;->getIO()Lkotlinx/coroutines/CoroutineDispatcher;

    move-result-object v0

    check-cast v0, Lkotlin/coroutines/CoroutineContext;

    new-instance v1, Lcom/pymcl/multiplayer/MultiplayerController$join$2;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, Lcom/pymcl/multiplayer/MultiplayerController$join$2;-><init>(Lcom/pymcl/multiplayer/MultiplayerController;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    check-cast v1, Lkotlin/jvm/functions/Function2;

    invoke-static {v0, v1, p2}, Lkotlinx/coroutines/BuildersKt;->withContext(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    .line 139
    return-object v0
.end method

.method public final onVpnPermissionResult(Z)V
    .locals 8
    .param p1, "granted"    # Z

    .line 160
    iget-object v0, p0, Lcom/pymcl/multiplayer/MultiplayerController;->_vpnPermission:Lkotlinx/coroutines/flow/MutableStateFlow;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lkotlinx/coroutines/flow/MutableStateFlow;->setValue(Ljava/lang/Object;)V

    .line 161
    if-eqz p1, :cond_0

    sget-object v0, Lcom/pymcl/multiplayer/TerracottaVpnService;->Companion:Lcom/pymcl/multiplayer/TerracottaVpnService$Companion;

    iget-object v1, p0, Lcom/pymcl/multiplayer/MultiplayerController;->app:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lcom/pymcl/multiplayer/TerracottaVpnService$Companion;->start(Landroid/content/Context;)Landroid/content/ComponentName;

    goto :goto_0

    .line 162
    :cond_0
    iget-object v2, p0, Lcom/pymcl/multiplayer/MultiplayerController;->scope:Lkotlinx/coroutines/CoroutineScope;

    new-instance v0, Lcom/pymcl/multiplayer/MultiplayerController$onVpnPermissionResult$1;

    invoke-direct {v0, p0, v1}, Lcom/pymcl/multiplayer/MultiplayerController$onVpnPermissionResult$1;-><init>(Lcom/pymcl/multiplayer/MultiplayerController;Lkotlin/coroutines/Continuation;)V

    move-object v5, v0

    check-cast v5, Lkotlin/jvm/functions/Function2;

    const/4 v6, 0x3

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v2 .. v7}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    .line 166
    :goto_0
    return-void
.end method

.method public final parseRoomType(Ljava/lang/String;)Lnet/burningtnt/terracotta/TerracottaAndroidAPI$RoomType;
    .locals 4
    .param p1, "code"    # Ljava/lang/String;

    const-string v0, "code"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 142
    iget-object v0, p0, Lcom/pymcl/multiplayer/MultiplayerController;->metadata:Lnet/burningtnt/terracotta/TerracottaAndroidAPI$Metadata;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    goto :goto_2

    :cond_0
    :try_start_0
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object v0, p0

    check-cast v0, Lcom/pymcl/multiplayer/MultiplayerController;

    .line 169
    .local v0, "$this$parseRoomType_u24lambda_u240":Lcom/pymcl/multiplayer/MultiplayerController;
    const/4 v2, 0x0

    .line 142
    .local v2, "$i$a$-runCatching-MultiplayerController$parseRoomType$1":I
    invoke-static {p1}, Lnet/burningtnt/terracotta/TerracottaAndroidAPI;->parseRoomCode(Ljava/lang/String;)Lnet/burningtnt/terracotta/TerracottaAndroidAPI$RoomType;

    move-result-object v3

    .end local v0    # "$this$parseRoomType_u24lambda_u240":Lcom/pymcl/multiplayer/MultiplayerController;
    .end local v2    # "$i$a$-runCatching-MultiplayerController$parseRoomType$1":I
    invoke-static {v3}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    sget-object v2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    :goto_0
    invoke-static {v0}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    goto :goto_1

    :cond_1
    move-object v1, v0

    :goto_1
    check-cast v1, Lnet/burningtnt/terracotta/TerracottaAndroidAPI$RoomType;

    :goto_2
    return-object v1
.end method

.method public final setExtraNodes(Ljava/util/List;)V
    .locals 1
    .param p1, "<set-?>"    # Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 93
    iput-object p1, p0, Lcom/pymcl/multiplayer/MultiplayerController;->extraNodes:Ljava/util/List;

    return-void
.end method

.method public final setPlayerName(Ljava/lang/String;)V
    .locals 0
    .param p1, "<set-?>"    # Ljava/lang/String;

    .line 92
    iput-object p1, p0, Lcom/pymcl/multiplayer/MultiplayerController;->playerName:Ljava/lang/String;

    return-void
.end method

.method public final stop(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 3
    .param p1, "$completion"    # Lkotlin/coroutines/Continuation;
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

    .line 144
    invoke-static {}, Lkotlinx/coroutines/Dispatchers;->getIO()Lkotlinx/coroutines/CoroutineDispatcher;

    move-result-object v0

    check-cast v0, Lkotlin/coroutines/CoroutineContext;

    new-instance v1, Lcom/pymcl/multiplayer/MultiplayerController$stop$2;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/pymcl/multiplayer/MultiplayerController$stop$2;-><init>(Lcom/pymcl/multiplayer/MultiplayerController;Lkotlin/coroutines/Continuation;)V

    check-cast v1, Lkotlin/jvm/functions/Function2;

    invoke-static {v0, v1, p1}, Lkotlinx/coroutines/BuildersKt;->withContext(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    if-ne v0, v1, :cond_0

    return-object v0

    :cond_0
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 148
    return-object v0
.end method
