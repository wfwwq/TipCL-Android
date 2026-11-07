.class public final Lcom/pymcl/ai/McpClient;
.super Ljava/lang/Object;
.source "Mcp.kt"

# interfaces
.implements Ljava/io/Closeable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/pymcl/ai/McpClient$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nMcp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Mcp.kt\ncom/pymcl/ai/McpClient\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,552:1\n1#2:553\n1#2:567\n2068#3,2:554\n1795#3,10:556\n2068#3:566\n2069#3:568\n1805#3:569\n777#3:570\n873#3,2:571\n296#3,2:573\n2068#3,2:575\n*S KotlinDebug\n*F\n+ 1 Mcp.kt\ncom/pymcl/ai/McpClient\n*L\n342#1:567\n250#1:554,2\n342#1:556,10\n342#1:566\n342#1:568\n342#1:569\n342#1:570\n342#1:571,2\n342#1:573,2\n375#1:575,2\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0010\u000b\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\t\n\u0002\u0010$\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\r\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0018\u0000 a2\u00020\u0001:\u0001aB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0014\u00108\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r09H\u0002J\u0006\u0010:\u001a\u00020/J \u0010;\u001a\u00020\"2\u0018\u0010<\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0015j\u0002`\u0017J\u0006\u0010=\u001a\u00020\"J\u0010\u0010>\u001a\u00020/2\u0006\u0010?\u001a\u00020\u0013H\u0002J\u000e\u0010@\u001a\u00020A2\u0006\u0010B\u001a\u00020\rJ\u000e\u0010C\u001a\u00020A2\u0006\u0010B\u001a\u00020\rJ\r\u0010D\u001a\u0004\u0018\u00010E\u00a2\u0006\u0002\u0010FJ\r\u0010G\u001a\u0004\u0018\u00010E\u00a2\u0006\u0002\u0010FJ\u000c\u0010H\u001a\u0008\u0012\u0004\u0012\u00020J0IJR\u0010K\u001a(\u0012\u001c\u0012\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0015j\u0002`\u00170I\u0012\u0006\u0012\u0004\u0018\u00010\r0L2\u0006\u0010M\u001a\u00020\r2\u0006\u0010N\u001a\u00020\r2\u0008\u0010O\u001a\u0004\u0018\u00010\r2\u0008\u0008\u0002\u0010P\u001a\u00020EH\u0002J\u0010\u0010Q\u001a\u00020A2\u0008\u0010O\u001a\u0004\u0018\u00010\rJ\u000e\u0010R\u001a\u00020A2\u0006\u0010B\u001a\u00020\rJ\u0010\u0010S\u001a\u00020A2\u0008\u0010O\u001a\u0004\u0018\u00010\rJ,\u0010T\u001a\u00020A2\u0006\u0010U\u001a\u00020\r2\u001c\u0010V\u001a\u0018\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0018\u00010\u0015j\u0004\u0018\u0001`\u0017J(\u0010W\u001a\u00020A2\u0006\u0010U\u001a\u00020\r2\u0018\u0010V\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0015j\u0002`\u0017J\u0010\u0010X\u001a\u00020/2\u0006\u0010M\u001a\u00020\rH\u0002J\u0010\u0010Y\u001a\u00020Z2\u0006\u0010[\u001a\u00020\rH\u0002J:\u0010\\\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0015j\u0002`\u00172\u0006\u0010M\u001a\u00020\r2\u0018\u0010]\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0015j\u0002`\u0017J4\u0010^\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0015j\u0002`\u00172\u0018\u0010<\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0015j\u0002`\u0017H\u0002J\u0008\u0010_\u001a\u00020/H\u0002J\u0008\u0010`\u001a\u00020/H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000c\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R2\u0010\u0011\u001a&\u0012\u0004\u0012\u00020\u0013\u0012\u001c\u0012\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0015j\u0002`\u00170\u00140\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\r@BX\u0086\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001a\u0010\u001bRB\u0010\u001c\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0015j\u0002`\u00172\u0018\u0010\u0018\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0015j\u0002`\u0017@BX\u0086\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001d\u0010\u001eR\u001e\u0010\u001f\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\r@BX\u0086\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008 \u0010\u001bR\u0011\u0010!\u001a\u00020\"8F\u00a2\u0006\u0006\u001a\u0004\u0008#\u0010$R\u0011\u0010%\u001a\u00020\"8F\u00a2\u0006\u0006\u001a\u0004\u0008&\u0010$R\u0011\u0010\'\u001a\u00020\"8F\u00a2\u0006\u0006\u001a\u0004\u0008(\u0010$R\u0011\u0010)\u001a\u00020*\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008+\u0010,R(\u0010-\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020/\u0018\u00010.X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u00080\u00101\"\u0004\u00082\u00103R\u000e\u00104\u001a\u00020\"X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u00105\u001a\u0004\u0018\u00010\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u00106\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\r@BX\u0086\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00087\u0010\u001b\u00a8\u0006b"
    }
    d2 = {
        "Lcom/pymcl/ai/McpClient;",
        "Ljava/io/Closeable;",
        "config",
        "Lcom/pymcl/ai/McpServerConfig;",
        "http",
        "Lcom/pymcl/ai/McpHttp;",
        "<init>",
        "(Lcom/pymcl/ai/McpServerConfig;Lcom/pymcl/ai/McpHttp;)V",
        "getConfig",
        "()Lcom/pymcl/ai/McpServerConfig;",
        "ids",
        "Ljava/util/concurrent/atomic/AtomicLong;",
        "session",
        "",
        "sseEndpoint",
        "sseStream",
        "Lcom/pymcl/ai/AiLineStream;",
        "waiting",
        "Ljava/util/concurrent/ConcurrentHashMap;",
        "",
        "Ljava/util/concurrent/CompletableFuture;",
        "",
        "",
        "Lcom/pymcl/core/util/JObj;",
        "value",
        "serverInfo",
        "getServerInfo",
        "()Ljava/lang/String;",
        "capabilities",
        "getCapabilities",
        "()Ljava/util/Map;",
        "protocolVersion",
        "getProtocolVersion",
        "hasResources",
        "",
        "getHasResources",
        "()Z",
        "hasPrompts",
        "getHasPrompts",
        "hasSubscribe",
        "getHasSubscribe",
        "changes",
        "Lcom/pymcl/ai/McpChangeSet;",
        "getChanges",
        "()Lcom/pymcl/ai/McpChangeSet;",
        "onNotification",
        "Lkotlin/Function1;",
        "",
        "getOnNotification",
        "()Lkotlin/jvm/functions/Function1;",
        "setOnNotification",
        "(Lkotlin/jvm/functions/Function1;)V",
        "closed",
        "listenStream",
        "listenerState",
        "getListenerState",
        "baseHeaders",
        "",
        "connect",
        "handleIncoming",
        "o",
        "startListener",
        "sleepQuiet",
        "ms",
        "subscribe",
        "Lcom/pymcl/ai/ToolOutput;",
        "uri",
        "unsubscribe",
        "countResources",
        "",
        "()Ljava/lang/Integer;",
        "countPrompts",
        "listTools",
        "",
        "Lcom/pymcl/ai/McpTool;",
        "paged",
        "Lkotlin/Pair;",
        "method",
        "key",
        "cursor",
        "maxItems",
        "listResources",
        "readResource",
        "listPrompts",
        "getPrompt",
        "name",
        "args",
        "callTool",
        "notify",
        "post",
        "Lcom/pymcl/ai/McpHttp$Resp;",
        "body",
        "rpc",
        "params",
        "unwrap",
        "openSse",
        "close",
        "Companion",
        "PyMCL-Android:ai"
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
.field public static final CLIENT_NAME:Ljava/lang/String; = "PyMCL-Android"

.field public static final Companion:Lcom/pymcl/ai/McpClient$Companion;

.field public static final MAX_PAGES:I = 0x14

.field public static final PROTOCOL:Ljava/lang/String; = "2025-06-18"


# instance fields
.field private volatile capabilities:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private final changes:Lcom/pymcl/ai/McpChangeSet;

.field private volatile closed:Z

.field private final config:Lcom/pymcl/ai/McpServerConfig;

.field private final http:Lcom/pymcl/ai/McpHttp;

.field private final ids:Ljava/util/concurrent/atomic/AtomicLong;

.field private volatile listenStream:Lcom/pymcl/ai/AiLineStream;

.field private volatile listenerState:Ljava/lang/String;

.field private volatile onNotification:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field private volatile protocolVersion:Ljava/lang/String;

.field private volatile serverInfo:Ljava/lang/String;

.field private volatile session:Ljava/lang/String;

.field private volatile sseEndpoint:Ljava/lang/String;

.field private volatile sseStream:Lcom/pymcl/ai/AiLineStream;

.field private final waiting:Ljava/util/concurrent/ConcurrentHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentHashMap<",
            "Ljava/lang/Long;",
            "Ljava/util/concurrent/CompletableFuture<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;>;>;"
        }
    .end annotation
.end field


# direct methods
.method public static synthetic $r8$lambda$ECpq03nYJK82qBHLA3MolFVbHmc(Lcom/pymcl/ai/McpClient;Lkotlin/jvm/internal/Ref$BooleanRef;Ljava/lang/String;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/pymcl/ai/McpClient;->startListener$lambda$0$0(Lcom/pymcl/ai/McpClient;Lkotlin/jvm/internal/Ref$BooleanRef;Ljava/lang/String;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$M30yybyAfTsFpq_FZQyBT5mXPec(Lcom/pymcl/ai/McpHttp$Resp;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lcom/pymcl/ai/McpClient;->rpc$lambda$2(Lcom/pymcl/ai/McpHttp$Resp;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$SgVmbY3TiXuyuLspy6CiV2_PDEs(Ljava/util/Map;)Ljava/lang/CharSequence;
    .locals 0

    invoke-static {p0}, Lcom/pymcl/ai/McpClient;->callTool$lambda$0(Ljava/util/Map;)Ljava/lang/CharSequence;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$ZVQIMk7-d1ZvXTcQqL5l0rIO0kY(Lcom/pymcl/ai/McpHttp$Resp;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lcom/pymcl/ai/McpClient;->rpc$lambda$4(Lcom/pymcl/ai/McpHttp$Resp;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$fvGURg3qLtbSagQ1Zbl9dV9-oPk(Lcom/pymcl/ai/McpClient;JLkotlin/jvm/internal/Ref$ObjectRef;Ljava/lang/String;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lcom/pymcl/ai/McpClient;->rpc$lambda$3(Lcom/pymcl/ai/McpClient;JLkotlin/jvm/internal/Ref$ObjectRef;Ljava/lang/String;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$lqwGxD9ohtd_jYUFzP7Tee7sGC8(Lcom/pymcl/ai/McpHttp$Resp;Ljava/lang/StringBuilder;Lkotlin/jvm/internal/Ref$ObjectRef;Ljava/util/concurrent/CompletableFuture;Lcom/pymcl/ai/McpClient;)V
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lcom/pymcl/ai/McpClient;->openSse$lambda$0(Lcom/pymcl/ai/McpHttp$Resp;Ljava/lang/StringBuilder;Lkotlin/jvm/internal/Ref$ObjectRef;Ljava/util/concurrent/CompletableFuture;Lcom/pymcl/ai/McpClient;)V

    return-void
.end method

.method public static synthetic $r8$lambda$vCuU93mi3d1PTEpN4Amlkg-gscg(Lcom/pymcl/ai/McpClient;)V
    .locals 0

    invoke-static {p0}, Lcom/pymcl/ai/McpClient;->startListener$lambda$0(Lcom/pymcl/ai/McpClient;)V

    return-void
.end method

.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/pymcl/ai/McpClient$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/pymcl/ai/McpClient$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/pymcl/ai/McpClient;->Companion:Lcom/pymcl/ai/McpClient$Companion;

    return-void
.end method

.method public constructor <init>(Lcom/pymcl/ai/McpServerConfig;Lcom/pymcl/ai/McpHttp;)V
    .locals 3
    .param p1, "config"    # Lcom/pymcl/ai/McpServerConfig;
    .param p2, "http"    # Lcom/pymcl/ai/McpHttp;

    const-string v0, "config"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "http"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 147
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/pymcl/ai/McpClient;->config:Lcom/pymcl/ai/McpServerConfig;

    iput-object p2, p0, Lcom/pymcl/ai/McpClient;->http:Lcom/pymcl/ai/McpHttp;

    .line 149
    new-instance v0, Ljava/util/concurrent/atomic/AtomicLong;

    const-wide/16 v1, 0x1

    invoke-direct {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicLong;-><init>(J)V

    iput-object v0, p0, Lcom/pymcl/ai/McpClient;->ids:Ljava/util/concurrent/atomic/AtomicLong;

    .line 153
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Lcom/pymcl/ai/McpClient;->waiting:Ljava/util/concurrent/ConcurrentHashMap;

    .line 154
    const-string v0, ""

    iput-object v0, p0, Lcom/pymcl/ai/McpClient;->serverInfo:Ljava/lang/String;

    .line 156
    const/4 v0, 0x0

    new-array v0, v0, [Lkotlin/Pair;

    invoke-static {v0}, Lcom/pymcl/core/util/JsonKt;->jobj([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v0

    iput-object v0, p0, Lcom/pymcl/ai/McpClient;->capabilities:Ljava/util/Map;

    .line 158
    const-string v0, "2025-06-18"

    iput-object v0, p0, Lcom/pymcl/ai/McpClient;->protocolVersion:Ljava/lang/String;

    .line 164
    new-instance v0, Lcom/pymcl/ai/McpChangeSet;

    invoke-direct {v0}, Lcom/pymcl/ai/McpChangeSet;-><init>()V

    iput-object v0, p0, Lcom/pymcl/ai/McpClient;->changes:Lcom/pymcl/ai/McpChangeSet;

    .line 170
    const-string v0, "idle"

    iput-object v0, p0, Lcom/pymcl/ai/McpClient;->listenerState:Ljava/lang/String;

    .line 147
    return-void
.end method

.method private final baseHeaders()Ljava/util/Map;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 172
    iget-object v0, p0, Lcom/pymcl/ai/McpClient;->config:Lcom/pymcl/ai/McpServerConfig;

    invoke-virtual {v0}, Lcom/pymcl/ai/McpServerConfig;->getHeaders()Ljava/util/Map;

    move-result-object v0

    const/4 v1, 0x2

    new-array v1, v1, [Lkotlin/Pair;

    iget-object v2, p0, Lcom/pymcl/ai/McpClient;->session:Ljava/lang/String;

    if-eqz v2, :cond_0

    .line 553
    nop

    .local v2, "it":Ljava/lang/String;
    const/4 v3, 0x0

    .line 172
    .local v3, "$i$a$-let-McpClient$baseHeaders$1":I
    const-string v4, "Mcp-Session-Id"

    invoke-static {v4, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    .end local v2    # "it":Ljava/lang/String;
    .end local v3    # "$i$a$-let-McpClient$baseHeaders$1":I
    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "MCP-Protocol-Version"

    iget-object v3, p0, Lcom/pymcl/ai/McpClient;->protocolVersion:Ljava/lang/String;

    invoke-static {v2, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOfNotNull([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-static {v0, v1}, Lkotlin/collections/MapsKt;->plus(Ljava/util/Map;Ljava/lang/Iterable;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method private static final callTool$lambda$0(Ljava/util/Map;)Ljava/lang/CharSequence;
    .locals 1
    .param p0, "c"    # Ljava/util/Map;

    const-string v0, "c"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 303
    sget-object v0, Lcom/pymcl/ai/McpFormat;->INSTANCE:Lcom/pymcl/ai/McpFormat;

    invoke-virtual {v0, p0}, Lcom/pymcl/ai/McpFormat;->content(Ljava/util/Map;)Ljava/lang/String;

    move-result-object v0

    check-cast v0, Ljava/lang/CharSequence;

    return-object v0
.end method

.method private final notify(Ljava/lang/String;)V
    .locals 6
    .param p1, "method"    # Ljava/lang/String;

    .line 308
    sget-object v0, Lcom/pymcl/core/util/Json;->INSTANCE:Lcom/pymcl/core/util/Json;

    const/4 v1, 0x2

    new-array v2, v1, [Lkotlin/Pair;

    const-string v3, "jsonrpc"

    const-string v4, "2.0"

    invoke-static {v3, v4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const-string v3, "method"

    invoke-static {v3, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    const/4 v5, 0x1

    aput-object v3, v2, v5

    invoke-static {v2}, Lcom/pymcl/core/util/JsonKt;->jobj([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v2

    const/4 v3, 0x0

    invoke-static {v0, v2, v4, v1, v3}, Lcom/pymcl/core/util/Json;->stringify$default(Lcom/pymcl/core/util/Json;Ljava/lang/Object;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 309
    .local v0, "body":Ljava/lang/String;
    :try_start_0
    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object v1, p0

    check-cast v1, Lcom/pymcl/ai/McpClient;

    .line 553
    .local v1, "$this$notify_u24lambda_u240":Lcom/pymcl/ai/McpClient;
    const/4 v2, 0x0

    .line 309
    .local v2, "$i$a$-runCatching-McpClient$notify$1":I
    invoke-direct {v1, v0}, Lcom/pymcl/ai/McpClient;->post(Ljava/lang/String;)Lcom/pymcl/ai/McpHttp$Resp;

    move-result-object v3

    invoke-virtual {v3}, Lcom/pymcl/ai/McpHttp$Resp;->getLines()Lcom/pymcl/ai/AiLineStream;

    move-result-object v3

    invoke-interface {v3}, Lcom/pymcl/ai/AiLineStream;->close()V

    .end local v1    # "$this$notify_u24lambda_u240":Lcom/pymcl/ai/McpClient;
    .end local v2    # "$i$a$-runCatching-McpClient$notify$1":I
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-static {v1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v1

    sget-object v2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 310
    :goto_0
    return-void
.end method

.method private final openSse()V
    .locals 12

    .line 353
    iget-object v0, p0, Lcom/pymcl/ai/McpClient;->http:Lcom/pymcl/ai/McpHttp;

    iget-object v1, p0, Lcom/pymcl/ai/McpClient;->config:Lcom/pymcl/ai/McpServerConfig;

    invoke-virtual {v1}, Lcom/pymcl/ai/McpServerConfig;->getUrl()Ljava/lang/String;

    move-result-object v2

    iget-object v1, p0, Lcom/pymcl/ai/McpClient;->config:Lcom/pymcl/ai/McpServerConfig;

    invoke-virtual {v1}, Lcom/pymcl/ai/McpServerConfig;->getHeaders()Ljava/util/Map;

    move-result-object v1

    const-string v3, "Accept"

    const-string v4, "text/event-stream"

    invoke-static {v3, v4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/collections/MapsKt;->plus(Ljava/util/Map;Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v3

    const/4 v4, 0x0

    const/4 v5, 0x0

    const-string v1, "GET"

    invoke-interface/range {v0 .. v5}, Lcom/pymcl/ai/McpHttp;->request(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;I)Lcom/pymcl/ai/McpHttp$Resp;

    move-result-object v7

    .line 354
    .local v7, "r":Lcom/pymcl/ai/McpHttp$Resp;
    invoke-virtual {v7}, Lcom/pymcl/ai/McpHttp$Resp;->getCode()I

    move-result v0

    const/16 v1, 0xc8

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-gt v1, v0, :cond_0

    const/16 v1, 0x12c

    if-ge v0, v1, :cond_0

    move v3, v2

    :cond_0
    if-eqz v3, :cond_2

    .line 355
    invoke-virtual {v7}, Lcom/pymcl/ai/McpHttp$Resp;->getLines()Lcom/pymcl/ai/AiLineStream;

    move-result-object v0

    iput-object v0, p0, Lcom/pymcl/ai/McpClient;->sseStream:Lcom/pymcl/ai/AiLineStream;

    .line 356
    new-instance v10, Ljava/util/concurrent/CompletableFuture;

    invoke-direct {v10}, Ljava/util/concurrent/CompletableFuture;-><init>()V

    .line 357
    .local v10, "gotEndpoint":Ljava/util/concurrent/CompletableFuture;
    new-instance v9, Lkotlin/jvm/internal/Ref$ObjectRef;

    invoke-direct {v9}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    .local v9, "event":Lkotlin/jvm/internal/Ref$ObjectRef;
    const-string v0, ""

    iput-object v0, v9, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 358
    .local v8, "data":Ljava/lang/StringBuilder;
    new-instance v0, Ljava/lang/Thread;

    new-instance v6, Lcom/pymcl/ai/McpClient$$ExternalSyntheticLambda5;

    move-object v11, p0

    invoke-direct/range {v6 .. v11}, Lcom/pymcl/ai/McpClient$$ExternalSyntheticLambda5;-><init>(Lcom/pymcl/ai/McpHttp$Resp;Ljava/lang/StringBuilder;Lkotlin/jvm/internal/Ref$ObjectRef;Ljava/util/concurrent/CompletableFuture;Lcom/pymcl/ai/McpClient;)V

    .line 376
    iget-object v1, v11, Lcom/pymcl/ai/McpClient;->config:Lcom/pymcl/ai/McpServerConfig;

    invoke-virtual {v1}, Lcom/pymcl/ai/McpServerConfig;->getName()Ljava/lang/String;

    move-result-object v1

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "mcp-sse-"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 358
    invoke-direct {v0, v6, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V

    move-object v1, v0

    .line 377
    .local v1, "t":Ljava/lang/Thread;
    invoke-virtual {v1, v2}, Ljava/lang/Thread;->setDaemon(Z)V

    invoke-virtual {v1}, Ljava/lang/Thread;->start()V

    .line 378
    :try_start_0
    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v2, 0xf

    invoke-virtual {v10, v2, v3, v0}, Ljava/util/concurrent/CompletableFuture;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-object v2, v0

    .line 379
    .local v2, "ep":Ljava/lang/String;
    :try_start_1
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object v0, v11

    check-cast v0, Lcom/pymcl/ai/McpClient;

    .line 553
    .local v0, "$this$openSse_u24lambda_u241":Lcom/pymcl/ai/McpClient;
    const/4 v3, 0x0

    .line 379
    .local v3, "$i$a$-runCatching-McpClient$openSse$1":I
    new-instance v4, Ljava/net/URL;

    new-instance v5, Ljava/net/URL;

    iget-object v6, v0, Lcom/pymcl/ai/McpClient;->config:Lcom/pymcl/ai/McpServerConfig;

    invoke-virtual {v6}, Lcom/pymcl/ai/McpServerConfig;->getUrl()Ljava/lang/String;

    move-result-object v6

    invoke-direct {v5, v6}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    invoke-direct {v4, v5, v2}, Ljava/net/URL;-><init>(Ljava/net/URL;Ljava/lang/String;)V

    invoke-virtual {v4}, Ljava/net/URL;->toString()Ljava/lang/String;

    move-result-object v4

    .end local v0    # "$this$openSse_u24lambda_u241":Lcom/pymcl/ai/McpClient;
    .end local v3    # "$i$a$-runCatching-McpClient$openSse$1":I
    invoke-static {v4}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    sget-object v3, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    :goto_0
    invoke-static {v0}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    move-object v0, v2

    :cond_1
    check-cast v0, Ljava/lang/String;

    iput-object v0, v11, Lcom/pymcl/ai/McpClient;->sseEndpoint:Ljava/lang/String;

    .line 380
    return-void

    .line 378
    .end local v2    # "ep":Ljava/lang/String;
    :catch_0
    move-exception v0

    .local v0, "e":Ljava/lang/Exception;
    new-instance v2, Lcom/pymcl/ai/McpException;

    const-string v3, "SSE \u6ca1\u6709\u7ed9\u51fa endpoint"

    invoke-direct {v2, v3}, Lcom/pymcl/ai/McpException;-><init>(Ljava/lang/String;)V

    throw v2

    .line 354
    .end local v0    # "e":Ljava/lang/Exception;
    .end local v1    # "t":Ljava/lang/Thread;
    .end local v8    # "data":Ljava/lang/StringBuilder;
    .end local v9    # "event":Lkotlin/jvm/internal/Ref$ObjectRef;
    .end local v10    # "gotEndpoint":Ljava/util/concurrent/CompletableFuture;
    :cond_2
    move-object v11, p0

    invoke-virtual {v7}, Lcom/pymcl/ai/McpHttp$Resp;->getLines()Lcom/pymcl/ai/AiLineStream;

    move-result-object v0

    invoke-interface {v0}, Lcom/pymcl/ai/AiLineStream;->close()V

    new-instance v0, Lcom/pymcl/ai/McpException;

    invoke-virtual {v7}, Lcom/pymcl/ai/McpHttp$Resp;->getCode()I

    move-result v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "SSE \u8fde\u63a5\u5931\u8d25 HTTP "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/pymcl/ai/McpException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private static final openSse$lambda$0(Lcom/pymcl/ai/McpHttp$Resp;Ljava/lang/StringBuilder;Lkotlin/jvm/internal/Ref$ObjectRef;Ljava/util/concurrent/CompletableFuture;Lcom/pymcl/ai/McpClient;)V
    .locals 11
    .param p0, "$r"    # Lcom/pymcl/ai/McpHttp$Resp;
    .param p1, "$data"    # Ljava/lang/StringBuilder;
    .param p2, "$event"    # Lkotlin/jvm/internal/Ref$ObjectRef;
    .param p3, "$gotEndpoint"    # Ljava/util/concurrent/CompletableFuture;
    .param p4, "this$0"    # Lcom/pymcl/ai/McpClient;

    .line 359
    const-string v0, "data:"

    const-string v1, "event:"

    .line 360
    :cond_0
    :goto_0
    nop

    .line 361
    :try_start_0
    invoke-virtual {p0}, Lcom/pymcl/ai/McpHttp$Resp;->getLines()Lcom/pymcl/ai/AiLineStream;

    move-result-object v2

    invoke-interface {v2}, Lcom/pymcl/ai/AiLineStream;->readLine()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_1

    goto/16 :goto_6

    .line 362
    .local v2, "l":Ljava/lang/String;
    :cond_1
    nop

    .line 363
    move-object v3, v2

    check-cast v3, Ljava/lang/CharSequence;

    invoke-interface {v3}, Ljava/lang/CharSequence;->length()I

    move-result v3

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-nez v3, :cond_2

    move v3, v4

    goto :goto_1

    :cond_2
    move v3, v5

    :goto_1
    const/4 v6, 0x0

    if-eqz v3, :cond_6

    .line 364
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const-string v4, "toString(...)"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .local v3, "d":Ljava/lang/String;
    invoke-virtual {p1, v5}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 365
    iget-object v4, p2, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    const-string v5, "endpoint"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    move-object v4, v3

    check-cast v4, Ljava/lang/CharSequence;

    invoke-static {v4}, Lkotlin/text/StringsKt;->trim(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p3, v4}, Ljava/util/concurrent/CompletableFuture;->complete(Ljava/lang/Object;)Z

    goto :goto_4

    .line 366
    :cond_3
    move-object v4, v3

    check-cast v4, Ljava/lang/CharSequence;

    invoke-static {v4}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v4
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    if-nez v4, :cond_5

    :try_start_1
    sget-object v4, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object v4, p4

    .line 553
    .local v4, "$this$openSse_u24lambda_u240_u240":Lcom/pymcl/ai/McpClient;
    const/4 v5, 0x0

    .line 366
    .local v5, "$i$a$-runCatching-McpClient$openSse$t$1$1":I
    sget-object v7, Lcom/pymcl/core/util/Json;->INSTANCE:Lcom/pymcl/core/util/Json;

    invoke-virtual {v7, v3}, Lcom/pymcl/core/util/Json;->obj(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v7

    .end local v4    # "$this$openSse_u24lambda_u240_u240":Lcom/pymcl/ai/McpClient;
    .end local v5    # "$i$a$-runCatching-McpClient$openSse$t$1$1":I
    invoke-static {v7}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception v4

    :try_start_2
    sget-object v5, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v4}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v4

    invoke-static {v4}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    :goto_2
    invoke-static {v4}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    goto :goto_3

    :cond_4
    move-object v6, v4

    :goto_3
    check-cast v6, Ljava/util/Map;

    if-eqz v6, :cond_5

    .line 553
    .local v6, "o":Ljava/util/Map;
    const/4 v4, 0x0

    .line 366
    .local v4, "$i$a$-let-McpClient$openSse$t$1$2":I
    invoke-virtual {p4, v6}, Lcom/pymcl/ai/McpClient;->handleIncoming(Ljava/util/Map;)Z

    move-result v5

    if-nez v5, :cond_5

    const-string v5, "id"

    invoke-static {v6, v5}, Lcom/pymcl/core/util/JsonKt;->long(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v5

    if-eqz v5, :cond_5

    check-cast v5, Ljava/lang/Number;

    invoke-virtual {v5}, Ljava/lang/Number;->longValue()J

    move-result-wide v7

    .line 553
    .local v7, "it":J
    const/4 v5, 0x0

    .line 366
    .local v5, "$i$a$-let-McpClient$openSse$t$1$2$1":I
    iget-object v9, p4, Lcom/pymcl/ai/McpClient;->waiting:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v10

    invoke-virtual {v9, v10}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/util/concurrent/CompletableFuture;

    if-eqz v9, :cond_5

    invoke-virtual {v9, v6}, Ljava/util/concurrent/CompletableFuture;->complete(Ljava/lang/Object;)Z

    .line 367
    .end local v4    # "$i$a$-let-McpClient$openSse$t$1$2":I
    .end local v5    # "$i$a$-let-McpClient$openSse$t$1$2$1":I
    .end local v6    # "o":Ljava/util/Map;
    .end local v7    # "it":J
    :cond_5
    :goto_4
    const-string v4, ""

    iput-object v4, p2, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .end local v3    # "d":Ljava/lang/String;
    goto/16 :goto_0

    .line 369
    :cond_6
    const/4 v3, 0x2

    invoke-static {v2, v1, v5, v3, v6}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_7

    move-object v3, v1

    check-cast v3, Ljava/lang/CharSequence;

    invoke-static {v2, v3}, Lkotlin/text/StringsKt;->removePrefix(Ljava/lang/String;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v3

    check-cast v3, Ljava/lang/CharSequence;

    invoke-static {v3}, Lkotlin/text/StringsKt;->trim(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    iput-object v3, p2, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    goto/16 :goto_0

    .line 370
    :cond_7
    invoke-static {v2, v0, v5, v3, v6}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    move-object v3, p1

    check-cast v3, Ljava/lang/CharSequence;

    invoke-interface {v3}, Ljava/lang/CharSequence;->length()I

    move-result v3

    if-lez v3, :cond_8

    goto :goto_5

    :cond_8
    move v4, v5

    :goto_5
    if-eqz v4, :cond_9

    const/16 v3, 0xa

    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_9
    move-object v3, v0

    check-cast v3, Ljava/lang/CharSequence;

    invoke-static {v2, v3}, Lkotlin/text/StringsKt;->removePrefix(Ljava/lang/String;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v3

    const-string v4, " "

    check-cast v4, Ljava/lang/CharSequence;

    invoke-static {v3, v4}, Lkotlin/text/StringsKt;->removePrefix(Ljava/lang/String;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    goto/16 :goto_0

    .line 373
    .end local v2    # "l":Ljava/lang/String;
    :catch_0
    move-exception v0

    .line 374
    :goto_6
    new-instance v0, Lcom/pymcl/ai/McpException;

    const-string v1, "SSE \u6d41\u5df2\u5173\u95ed"

    invoke-direct {v0, v1}, Lcom/pymcl/ai/McpException;-><init>(Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Throwable;

    invoke-virtual {p3, v0}, Ljava/util/concurrent/CompletableFuture;->completeExceptionally(Ljava/lang/Throwable;)Z

    .line 375
    iget-object v0, p4, Lcom/pymcl/ai/McpClient;->waiting:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->values()Ljava/util/Collection;

    move-result-object v0

    const-string v2, "<get-values>(...)"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Iterable;

    .local v0, "$this$forEach$iv":Ljava/lang/Iterable;
    const/4 v2, 0x0

    .line 575
    .local v2, "$i$f$forEach":I
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_7
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_a

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    .local v4, "element$iv":Ljava/lang/Object;
    move-object v5, v4

    check-cast v5, Ljava/util/concurrent/CompletableFuture;

    .local v5, "it":Ljava/util/concurrent/CompletableFuture;
    const/4 v6, 0x0

    .line 375
    .local v6, "$i$a$-forEach-McpClient$openSse$t$1$4":I
    new-instance v7, Lcom/pymcl/ai/McpException;

    invoke-direct {v7, v1}, Lcom/pymcl/ai/McpException;-><init>(Ljava/lang/String;)V

    check-cast v7, Ljava/lang/Throwable;

    invoke-virtual {v5, v7}, Ljava/util/concurrent/CompletableFuture;->completeExceptionally(Ljava/lang/Throwable;)Z

    .line 575
    .end local v5    # "it":Ljava/util/concurrent/CompletableFuture;
    .end local v6    # "$i$a$-forEach-McpClient$openSse$t$1$4":I
    nop

    .end local v4    # "element$iv":Ljava/lang/Object;
    goto :goto_7

    .line 576
    :cond_a
    nop

    .line 376
    .end local v0    # "$this$forEach$iv":Ljava/lang/Iterable;
    .end local v2    # "$i$f$forEach":I
    return-void
.end method

.method private final paged(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lkotlin/Pair;
    .locals 9
    .param p1, "method"    # Ljava/lang/String;
    .param p2, "key"    # Ljava/lang/String;
    .param p3, "cursor"    # Ljava/lang/String;
    .param p4, "maxItems"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "I)",
            "Lkotlin/Pair<",
            "Ljava/util/List<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;>;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 262
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    check-cast v0, Ljava/util/List;

    .local v0, "out":Ljava/util/List;
    move-object v1, p3

    .local v1, "c":Ljava/lang/String;
    const/4 v2, 0x0

    .line 264
    .local v2, "pages":I
    :cond_0
    const/4 v3, 0x0

    if-eqz v1, :cond_1

    const/4 v4, 0x1

    new-array v4, v4, [Lkotlin/Pair;

    const-string v5, "cursor"

    invoke-static {v5, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v5

    aput-object v5, v4, v3

    invoke-static {v4}, Lcom/pymcl/core/util/JsonKt;->jobj([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v3

    goto :goto_0

    :cond_1
    new-array v3, v3, [Lkotlin/Pair;

    invoke-static {v3}, Lcom/pymcl/core/util/JsonKt;->jobj([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v3

    :goto_0
    invoke-virtual {p0, p1, v3}, Lcom/pymcl/ai/McpClient;->rpc(Ljava/lang/String;Ljava/util/Map;)Ljava/util/Map;

    move-result-object v3

    .line 265
    .local v3, "r":Ljava/util/Map;
    move-object v4, v0

    check-cast v4, Ljava/util/Collection;

    invoke-static {v3, p2}, Lcom/pymcl/core/util/JsonKt;->arr(Ljava/util/Map;Ljava/lang/String;)Ljava/util/List;

    move-result-object v5

    invoke-static {v5}, Lcom/pymcl/core/util/JsonKt;->objs(Ljava/util/List;)Ljava/util/List;

    move-result-object v5

    check-cast v5, Ljava/lang/Iterable;

    invoke-static {v4, v5}, Lkotlin/collections/CollectionsKt;->addAll(Ljava/util/Collection;Ljava/lang/Iterable;)Z

    .line 266
    const-string v4, "nextCursor"

    invoke-static {v3, v4}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    if-eqz v4, :cond_2

    move-object v6, v4

    .line 553
    .local v6, "it":Ljava/lang/String;
    const/4 v7, 0x0

    .line 266
    .local v7, "$i$a$-takeIf-McpClient$paged$1":I
    move-object v8, v6

    check-cast v8, Ljava/lang/CharSequence;

    invoke-static {v8}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v8

    .end local v6    # "it":Ljava/lang/String;
    .end local v7    # "$i$a$-takeIf-McpClient$paged$1":I
    if-nez v8, :cond_2

    goto :goto_1

    :cond_2
    move-object v4, v5

    :goto_1
    move-object v1, v4

    .line 267
    .end local v3    # "r":Ljava/util/Map;
    if-nez p3, :cond_3

    if-eqz v1, :cond_3

    add-int/lit8 v2, v2, 0x1

    const/16 v3, 0x14

    if-ge v2, v3, :cond_3

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    if-lt v3, p4, :cond_0

    .line 268
    :cond_3
    invoke-static {v0, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    return-object v3
.end method

.method static synthetic paged$default(Lcom/pymcl/ai/McpClient;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/Object;)Lkotlin/Pair;
    .locals 0

    .line 261
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_0

    const/16 p4, 0xc8

    :cond_0
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/pymcl/ai/McpClient;->paged(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lkotlin/Pair;

    move-result-object p0

    return-object p0
.end method

.method private final post(Ljava/lang/String;)Lcom/pymcl/ai/McpHttp$Resp;
    .locals 7
    .param p1, "body"    # Ljava/lang/String;

    .line 313
    iget-object v0, p0, Lcom/pymcl/ai/McpClient;->config:Lcom/pymcl/ai/McpServerConfig;

    invoke-virtual {v0}, Lcom/pymcl/ai/McpServerConfig;->getType()Ljava/lang/String;

    move-result-object v0

    const-string v1, "sse"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/pymcl/ai/McpClient;->sseEndpoint:Ljava/lang/String;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/pymcl/ai/McpException;

    const-string v1, "SSE \u672a\u62ff\u5230 endpoint"

    invoke-direct {v0, v1}, Lcom/pymcl/ai/McpException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    iget-object v0, p0, Lcom/pymcl/ai/McpClient;->config:Lcom/pymcl/ai/McpServerConfig;

    invoke-virtual {v0}, Lcom/pymcl/ai/McpServerConfig;->getUrl()Ljava/lang/String;

    move-result-object v0

    :goto_0
    move-object v3, v0

    .line 314
    .local v3, "url":Ljava/lang/String;
    iget-object v1, p0, Lcom/pymcl/ai/McpClient;->http:Lcom/pymcl/ai/McpHttp;

    invoke-direct {p0}, Lcom/pymcl/ai/McpClient;->baseHeaders()Ljava/util/Map;

    move-result-object v0

    const-string v2, "Accept"

    const-string v4, "application/json, text/event-stream"

    invoke-static {v2, v4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    invoke-static {v0, v2}, Lkotlin/collections/MapsKt;->plus(Ljava/util/Map;Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v4

    iget-object v0, p0, Lcom/pymcl/ai/McpClient;->config:Lcom/pymcl/ai/McpServerConfig;

    invoke-virtual {v0}, Lcom/pymcl/ai/McpServerConfig;->getTimeoutMs()I

    move-result v6

    const-string v2, "POST"

    move-object v5, p1

    .end local p1    # "body":Ljava/lang/String;
    .local v5, "body":Ljava/lang/String;
    invoke-interface/range {v1 .. v6}, Lcom/pymcl/ai/McpHttp;->request(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;I)Lcom/pymcl/ai/McpHttp$Resp;

    move-result-object p1

    return-object p1
.end method

.method private static final rpc$lambda$2(Lcom/pymcl/ai/McpHttp$Resp;)Ljava/lang/String;
    .locals 1
    .param p0, "$r"    # Lcom/pymcl/ai/McpHttp$Resp;

    .line 332
    invoke-virtual {p0}, Lcom/pymcl/ai/McpHttp$Resp;->getLines()Lcom/pymcl/ai/AiLineStream;

    move-result-object v0

    invoke-interface {v0}, Lcom/pymcl/ai/AiLineStream;->readLine()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private static final rpc$lambda$3(Lcom/pymcl/ai/McpClient;JLkotlin/jvm/internal/Ref$ObjectRef;Ljava/lang/String;)Lkotlin/Unit;
    .locals 4
    .param p0, "this$0"    # Lcom/pymcl/ai/McpClient;
    .param p1, "$id"    # J
    .param p3, "$found"    # Lkotlin/jvm/internal/Ref$ObjectRef;
    .param p4, "data"    # Ljava/lang/String;

    const-string v0, "data"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 335
    :try_start_0
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object v0, p0

    .line 553
    .local v0, "$this$rpc_u24lambda_u243_u240":Lcom/pymcl/ai/McpClient;
    const/4 v1, 0x0

    .line 335
    .local v1, "$i$a$-runCatching-McpClient$rpc$p$1$1":I
    sget-object v2, Lcom/pymcl/core/util/Json;->INSTANCE:Lcom/pymcl/core/util/Json;

    invoke-virtual {v2, p4}, Lcom/pymcl/core/util/Json;->obj(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v2

    .end local v0    # "$this$rpc_u24lambda_u243_u240":Lcom/pymcl/ai/McpClient;
    .end local v1    # "$i$a$-runCatching-McpClient$rpc$p$1$1":I
    invoke-static {v2}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

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

    if-eqz v1, :cond_0

    const/4 v0, 0x0

    :cond_0
    check-cast v0, Ljava/util/Map;

    if-eqz v0, :cond_2

    .line 553
    .local v0, "o":Ljava/util/Map;
    const/4 v1, 0x0

    .line 335
    .local v1, "$i$a$-let-McpClient$rpc$p$1$2":I
    invoke-virtual {p0, v0}, Lcom/pymcl/ai/McpClient;->handleIncoming(Ljava/util/Map;)Z

    move-result v2

    if-nez v2, :cond_2

    const-string v2, "id"

    invoke-static {v0, v2}, Lcom/pymcl/core/util/JsonKt;->long(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v2

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    cmp-long v2, v2, p1

    if-nez v2, :cond_2

    iput-object v0, p3, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .end local v0    # "o":Ljava/util/Map;
    .end local v1    # "$i$a$-let-McpClient$rpc$p$1$2":I
    :cond_2
    :goto_1
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method private static final rpc$lambda$4(Lcom/pymcl/ai/McpHttp$Resp;)Ljava/lang/String;
    .locals 1
    .param p0, "$r"    # Lcom/pymcl/ai/McpHttp$Resp;

    .line 340
    invoke-virtual {p0}, Lcom/pymcl/ai/McpHttp$Resp;->getLines()Lcom/pymcl/ai/AiLineStream;

    move-result-object v0

    invoke-interface {v0}, Lcom/pymcl/ai/AiLineStream;->readLine()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private final sleepQuiet(J)V
    .locals 1
    .param p1, "ms"    # J

    .line 224
    :try_start_0
    invoke-static {p1, p2}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    :goto_0
    return-void
.end method

.method private static final startListener$lambda$0(Lcom/pymcl/ai/McpClient;)V
    .locals 12
    .param p0, "this$0"    # Lcom/pymcl/ai/McpClient;

    .line 202
    const-string v1, "text/event-stream"

    const/4 v0, 0x0

    move v2, v0

    .line 203
    .local v2, "fails":I
    :goto_0
    iget-boolean v0, p0, Lcom/pymcl/ai/McpClient;->closed:Z

    if-nez v0, :cond_9

    .line 204
    const/4 v3, 0x0

    :try_start_0
    iget-object v4, p0, Lcom/pymcl/ai/McpClient;->http:Lcom/pymcl/ai/McpHttp;

    const-string v5, "GET"

    iget-object v0, p0, Lcom/pymcl/ai/McpClient;->config:Lcom/pymcl/ai/McpServerConfig;

    invoke-virtual {v0}, Lcom/pymcl/ai/McpServerConfig;->getUrl()Ljava/lang/String;

    move-result-object v6

    invoke-direct {p0}, Lcom/pymcl/ai/McpClient;->baseHeaders()Ljava/util/Map;

    move-result-object v0

    const-string v7, "Accept"

    invoke-static {v7, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v7

    invoke-static {v0, v7}, Lkotlin/collections/MapsKt;->plus(Ljava/util/Map;Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v7

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-interface/range {v4 .. v9}, Lcom/pymcl/ai/McpHttp;->request(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;I)Lcom/pymcl/ai/McpHttp$Resp;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    move-object v0, v3

    :goto_1
    move-object v4, v0

    .line 205
    .local v4, "r":Lcom/pymcl/ai/McpHttp$Resp;
    const/4 v5, 0x3

    if-nez v4, :cond_0

    add-int/lit8 v2, v2, 0x1

    if-ge v2, v5, :cond_9

    sget-object v0, Lcom/pymcl/ai/McpNotify;->INSTANCE:Lcom/pymcl/ai/McpNotify;

    invoke-virtual {v0, v2}, Lcom/pymcl/ai/McpNotify;->backoffMs(I)J

    move-result-wide v5

    invoke-direct {p0, v5, v6}, Lcom/pymcl/ai/McpClient;->sleepQuiet(J)V

    goto :goto_0

    .line 206
    :cond_0
    invoke-virtual {v4}, Lcom/pymcl/ai/McpHttp$Resp;->getCode()I

    move-result v0

    const/16 v6, 0x195

    if-eq v0, v6, :cond_8

    invoke-virtual {v4}, Lcom/pymcl/ai/McpHttp$Resp;->getCode()I

    move-result v0

    const/16 v6, 0x12c

    const/16 v7, 0xc8

    const/4 v8, 0x0

    const/4 v9, 0x1

    if-gt v7, v0, :cond_1

    if-ge v0, v6, :cond_1

    move v0, v9

    goto :goto_2

    :cond_1
    move v0, v8

    :goto_2
    if-eqz v0, :cond_2

    invoke-virtual {v4}, Lcom/pymcl/ai/McpHttp$Resp;->getContentType()Ljava/lang/String;

    move-result-object v0

    check-cast v0, Ljava/lang/CharSequence;

    move-object v10, v1

    check-cast v10, Ljava/lang/CharSequence;

    const/4 v11, 0x2

    invoke-static {v0, v10, v8, v11, v3}, Lkotlin/text/StringsKt;->contains$default(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto/16 :goto_9

    .line 207
    :cond_2
    invoke-virtual {v4}, Lcom/pymcl/ai/McpHttp$Resp;->getCode()I

    move-result v0

    if-gt v7, v0, :cond_3

    if-ge v0, v6, :cond_3

    move v0, v9

    goto :goto_3

    :cond_3
    move v0, v8

    :goto_3
    if-nez v0, :cond_4

    invoke-virtual {v4}, Lcom/pymcl/ai/McpHttp$Resp;->getLines()Lcom/pymcl/ai/AiLineStream;

    move-result-object v0

    invoke-interface {v0}, Lcom/pymcl/ai/AiLineStream;->close()V

    add-int/lit8 v2, v2, 0x1

    if-ge v2, v5, :cond_9

    sget-object v0, Lcom/pymcl/ai/McpNotify;->INSTANCE:Lcom/pymcl/ai/McpNotify;

    invoke-virtual {v0, v2}, Lcom/pymcl/ai/McpNotify;->backoffMs(I)J

    move-result-wide v5

    invoke-direct {p0, v5, v6}, Lcom/pymcl/ai/McpClient;->sleepQuiet(J)V

    goto/16 :goto_0

    .line 208
    :cond_4
    invoke-virtual {v4}, Lcom/pymcl/ai/McpHttp$Resp;->getLines()Lcom/pymcl/ai/AiLineStream;

    move-result-object v0

    iput-object v0, p0, Lcom/pymcl/ai/McpClient;->listenStream:Lcom/pymcl/ai/AiLineStream;

    .line 209
    new-instance v0, Lkotlin/jvm/internal/Ref$BooleanRef;

    invoke-direct {v0}, Lkotlin/jvm/internal/Ref$BooleanRef;-><init>()V

    move-object v6, v0

    .line 210
    .local v6, "got":Lkotlin/jvm/internal/Ref$BooleanRef;
    new-instance v0, Lcom/pymcl/ai/SseParser;

    new-instance v7, Lcom/pymcl/ai/McpClient$$ExternalSyntheticLambda6;

    invoke-direct {v7, p0, v6}, Lcom/pymcl/ai/McpClient$$ExternalSyntheticLambda6;-><init>(Lcom/pymcl/ai/McpClient;Lkotlin/jvm/internal/Ref$BooleanRef;)V

    invoke-direct {v0, v7}, Lcom/pymcl/ai/SseParser;-><init>(Lkotlin/jvm/functions/Function1;)V

    move-object v7, v0

    .line 211
    .local v7, "p":Lcom/pymcl/ai/SseParser;
    nop

    :goto_4
    :try_start_1
    iget-boolean v0, p0, Lcom/pymcl/ai/McpClient;->closed:Z

    if-nez v0, :cond_6

    invoke-virtual {v4}, Lcom/pymcl/ai/McpHttp$Resp;->getLines()Lcom/pymcl/ai/AiLineStream;

    move-result-object v0

    invoke-interface {v0}, Lcom/pymcl/ai/AiLineStream;->readLine()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_5

    goto :goto_5

    .local v0, "l":Ljava/lang/String;
    :cond_5
    invoke-virtual {v7, v0}, Lcom/pymcl/ai/SseParser;->feed(Ljava/lang/String;)V

    .end local v0    # "l":Ljava/lang/String;
    goto :goto_4

    :cond_6
    :goto_5
    invoke-virtual {v7}, Lcom/pymcl/ai/SseParser;->flush()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_6

    :catch_1
    move-exception v0

    .line 212
    :goto_6
    :try_start_2
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object v0, p0

    .line 553
    .local v0, "$this$startListener_u24lambda_u240_u241":Lcom/pymcl/ai/McpClient;
    const/4 v10, 0x0

    .line 212
    .local v10, "$i$a$-runCatching-McpClient$startListener$t$1$2":I
    invoke-virtual {v4}, Lcom/pymcl/ai/McpHttp$Resp;->getLines()Lcom/pymcl/ai/AiLineStream;

    move-result-object v11

    invoke-interface {v11}, Lcom/pymcl/ai/AiLineStream;->close()V

    .end local v0    # "$this$startListener_u24lambda_u240_u241":Lcom/pymcl/ai/McpClient;
    .end local v10    # "$i$a$-runCatching-McpClient$startListener$t$1$2":I
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_7

    :catchall_0
    move-exception v0

    sget-object v10, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    :goto_7
    iput-object v3, p0, Lcom/pymcl/ai/McpClient;->listenStream:Lcom/pymcl/ai/AiLineStream;

    .line 213
    iget-boolean v0, p0, Lcom/pymcl/ai/McpClient;->closed:Z

    if-nez v0, :cond_9

    .line 214
    iget-boolean v0, v6, Lkotlin/jvm/internal/Ref$BooleanRef;->element:Z

    if-eqz v0, :cond_7

    goto :goto_8

    :cond_7
    add-int/lit8 v8, v2, 0x1

    :goto_8
    move v2, v8

    .line 215
    if-ge v2, v5, :cond_9

    .line 216
    sget-object v0, Lcom/pymcl/ai/McpNotify;->INSTANCE:Lcom/pymcl/ai/McpNotify;

    invoke-static {v2, v9}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    move-result v3

    invoke-virtual {v0, v3}, Lcom/pymcl/ai/McpNotify;->backoffMs(I)J

    move-result-wide v8

    invoke-direct {p0, v8, v9}, Lcom/pymcl/ai/McpClient;->sleepQuiet(J)V

    .end local v4    # "r":Lcom/pymcl/ai/McpHttp$Resp;
    .end local v6    # "got":Lkotlin/jvm/internal/Ref$BooleanRef;
    .end local v7    # "p":Lcom/pymcl/ai/SseParser;
    goto/16 :goto_0

    .line 206
    .restart local v4    # "r":Lcom/pymcl/ai/McpHttp$Resp;
    :cond_8
    :goto_9
    invoke-virtual {v4}, Lcom/pymcl/ai/McpHttp$Resp;->getLines()Lcom/pymcl/ai/AiLineStream;

    move-result-object v0

    invoke-interface {v0}, Lcom/pymcl/ai/AiLineStream;->close()V

    const-string v0, "unsupported"

    iput-object v0, p0, Lcom/pymcl/ai/McpClient;->listenerState:Ljava/lang/String;

    return-void

    .line 218
    .end local v4    # "r":Lcom/pymcl/ai/McpHttp$Resp;
    :cond_9
    iget-object v0, p0, Lcom/pymcl/ai/McpClient;->listenerState:Ljava/lang/String;

    const-string v1, "listening"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_a

    const-string v0, "stopped"

    iput-object v0, p0, Lcom/pymcl/ai/McpClient;->listenerState:Ljava/lang/String;

    .line 219
    :cond_a
    return-void
.end method

.method private static final startListener$lambda$0$0(Lcom/pymcl/ai/McpClient;Lkotlin/jvm/internal/Ref$BooleanRef;Ljava/lang/String;)Lkotlin/Unit;
    .locals 3
    .param p0, "this$0"    # Lcom/pymcl/ai/McpClient;
    .param p1, "$got"    # Lkotlin/jvm/internal/Ref$BooleanRef;
    .param p2, "data"    # Ljava/lang/String;

    const-string v0, "data"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 210
    :try_start_0
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object v0, p0

    .line 553
    .local v0, "$this$startListener_u24lambda_u240_u240_u240":Lcom/pymcl/ai/McpClient;
    const/4 v1, 0x0

    .line 210
    .local v1, "$i$a$-runCatching-McpClient$startListener$t$1$p$1$1":I
    sget-object v2, Lcom/pymcl/core/util/Json;->INSTANCE:Lcom/pymcl/core/util/Json;

    invoke-virtual {v2, p2}, Lcom/pymcl/core/util/Json;->obj(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v2

    .end local v0    # "$this$startListener_u24lambda_u240_u240_u240":Lcom/pymcl/ai/McpClient;
    .end local v1    # "$i$a$-runCatching-McpClient$startListener$t$1$p$1$1":I
    invoke-static {v2}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

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

    if-eqz v1, :cond_0

    const/4 v0, 0x0

    :cond_0
    check-cast v0, Ljava/util/Map;

    if-eqz v0, :cond_1

    .line 553
    .local v0, "it":Ljava/util/Map;
    const/4 v1, 0x0

    .line 210
    .local v1, "$i$a$-let-McpClient$startListener$t$1$p$1$2":I
    const/4 v2, 0x1

    iput-boolean v2, p1, Lkotlin/jvm/internal/Ref$BooleanRef;->element:Z

    invoke-virtual {p0, v0}, Lcom/pymcl/ai/McpClient;->handleIncoming(Ljava/util/Map;)Z

    .end local v0    # "it":Ljava/util/Map;
    .end local v1    # "$i$a$-let-McpClient$startListener$t$1$p$1$2":I
    :cond_1
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method private final unwrap(Ljava/util/Map;)Ljava/util/Map;
    .locals 7
    .param p1, "o"    # Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 348
    const-string v0, "error"

    invoke-static {p1, v0}, Lcom/pymcl/core/util/JsonKt;->obj(Ljava/util/Map;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 553
    .local v0, "it":Ljava/util/Map;
    const/4 v1, 0x0

    .line 348
    .local v1, "$i$a$-let-McpClient$unwrap$1":I
    new-instance v2, Lcom/pymcl/ai/McpException;

    const-string v3, "code"

    invoke-static {v0, v3}, Lcom/pymcl/core/util/JsonKt;->long(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v3

    const-string v4, ""

    if-nez v3, :cond_0

    move-object v3, v4

    :cond_0
    const-string v5, "message"

    invoke-static {v0, v5}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    if-nez v5, :cond_1

    goto :goto_0

    :cond_1
    move-object v4, v5

    :goto_0
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "MCP \u9519\u8bef "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v5, ": "

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Lcom/pymcl/ai/McpException;-><init>(Ljava/lang/String;)V

    throw v2

    .line 349
    .end local v0    # "it":Ljava/util/Map;
    .end local v1    # "$i$a$-let-McpClient$unwrap$1":I
    :cond_2
    const-string v0, "result"

    invoke-static {p1, v0}, Lcom/pymcl/core/util/JsonKt;->obj(Ljava/util/Map;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v0

    if-nez v0, :cond_3

    const/4 v0, 0x0

    new-array v0, v0, [Lkotlin/Pair;

    invoke-static {v0}, Lcom/pymcl/core/util/JsonKt;->jobj([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v0

    :cond_3
    return-object v0
.end method


# virtual methods
.method public final callTool(Ljava/lang/String;Ljava/util/Map;)Lcom/pymcl/ai/ToolOutput;
    .locals 17
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
            "Lcom/pymcl/ai/ToolOutput;"
        }
    .end annotation

    move-object/from16 v0, p1

    move-object/from16 v1, p2

    const-string v2, "name"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "args"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 302
    const/4 v3, 0x2

    new-array v4, v3, [Lkotlin/Pair;

    invoke-static {v2, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/4 v5, 0x0

    aput-object v2, v4, v5

    const-string v2, "arguments"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/4 v6, 0x1

    aput-object v2, v4, v6

    invoke-static {v4}, Lcom/pymcl/core/util/JsonKt;->jobj([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v2

    const-string v4, "tools/call"

    move-object/from16 v7, p0

    invoke-virtual {v7, v4, v2}, Lcom/pymcl/ai/McpClient;->rpc(Ljava/lang/String;Ljava/util/Map;)Ljava/util/Map;

    move-result-object v2

    .line 303
    .local v2, "r":Ljava/util/Map;
    const-string v4, "content"

    invoke-static {v2, v4}, Lcom/pymcl/core/util/JsonKt;->arr(Ljava/util/Map;Ljava/lang/String;)Ljava/util/List;

    move-result-object v4

    invoke-static {v4}, Lcom/pymcl/core/util/JsonKt;->objs(Ljava/util/List;)Ljava/util/List;

    move-result-object v4

    move-object v8, v4

    check-cast v8, Ljava/lang/Iterable;

    const-string v4, "\n"

    move-object v9, v4

    check-cast v9, Ljava/lang/CharSequence;

    new-instance v14, Lcom/pymcl/ai/McpClient$$ExternalSyntheticLambda4;

    invoke-direct {v14}, Lcom/pymcl/ai/McpClient$$ExternalSyntheticLambda4;-><init>()V

    const/16 v15, 0x1e

    const/16 v16, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-static/range {v8 .. v16}, Lkotlin/collections/CollectionsKt;->joinToString$default(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    check-cast v4, Ljava/lang/CharSequence;

    invoke-static {v4}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v8

    if-eqz v8, :cond_2

    .line 553
    const/4 v4, 0x0

    .line 303
    .local v4, "$i$a$-ifBlank-McpClient$callTool$text$2":I
    const-string v8, "structuredContent"

    invoke-static {v2, v8}, Lcom/pymcl/core/util/JsonKt;->obj(Ljava/util/Map;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v8

    if-eqz v8, :cond_0

    .line 553
    .local v8, "it":Ljava/util/Map;
    const/4 v9, 0x0

    .line 303
    .local v9, "$i$a$-let-McpClient$callTool$text$2$1":I
    sget-object v10, Lcom/pymcl/core/util/Json;->INSTANCE:Lcom/pymcl/core/util/Json;

    const/4 v11, 0x0

    invoke-static {v10, v8, v5, v3, v11}, Lcom/pymcl/core/util/Json;->stringify$default(Lcom/pymcl/core/util/Json;Ljava/lang/Object;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    .end local v8    # "it":Ljava/util/Map;
    .end local v9    # "$i$a$-let-McpClient$callTool$text$2$1":I
    if-nez v3, :cond_1

    :cond_0
    const-string v3, "\uff08\u65e0\u8f93\u51fa\uff09"

    :cond_1
    move-object v4, v3

    .end local v4    # "$i$a$-ifBlank-McpClient$callTool$text$2":I
    :cond_2
    move-object v3, v4

    check-cast v3, Ljava/lang/String;

    .line 304
    .local v3, "text":Ljava/lang/String;
    new-instance v4, Lcom/pymcl/ai/ToolOutput;

    const-string v5, "isError"

    invoke-static {v2, v5}, Lcom/pymcl/core/util/JsonKt;->bool(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v5

    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v8

    invoke-static {v5, v8}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    xor-int/2addr v5, v6

    invoke-direct {v4, v5, v3, v6}, Lcom/pymcl/ai/ToolOutput;-><init>(ZLjava/lang/String;Z)V

    return-object v4
.end method

.method public close()V
    .locals 8

    .line 383
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/pymcl/ai/McpClient;->closed:Z

    .line 384
    const/4 v1, 0x0

    :try_start_0
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object v0, p0

    check-cast v0, Lcom/pymcl/ai/McpClient;

    .line 553
    .local v0, "$this$close_u24lambda_u240":Lcom/pymcl/ai/McpClient;
    const/4 v2, 0x0

    .line 384
    .local v2, "$i$a$-runCatching-McpClient$close$1":I
    iget-object v3, v0, Lcom/pymcl/ai/McpClient;->listenStream:Lcom/pymcl/ai/AiLineStream;

    if-eqz v3, :cond_0

    invoke-interface {v3}, Lcom/pymcl/ai/AiLineStream;->close()V

    sget-object v3, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    goto :goto_0

    :cond_0
    move-object v3, v1

    .end local v0    # "$this$close_u24lambda_u240":Lcom/pymcl/ai/McpClient;
    .end local v2    # "$i$a$-runCatching-McpClient$close$1":I
    :goto_0
    invoke-static {v3}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v0

    sget-object v2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 385
    :goto_1
    :try_start_1
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object v0, p0

    check-cast v0, Lcom/pymcl/ai/McpClient;

    .line 553
    .local v0, "$this$close_u24lambda_u241":Lcom/pymcl/ai/McpClient;
    const/4 v2, 0x0

    .line 385
    .local v2, "$i$a$-runCatching-McpClient$close$2":I
    iget-object v3, v0, Lcom/pymcl/ai/McpClient;->sseStream:Lcom/pymcl/ai/AiLineStream;

    if-eqz v3, :cond_1

    invoke-interface {v3}, Lcom/pymcl/ai/AiLineStream;->close()V

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .end local v0    # "$this$close_u24lambda_u241":Lcom/pymcl/ai/McpClient;
    .end local v2    # "$i$a$-runCatching-McpClient$close$2":I
    :cond_1
    invoke-static {v1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception v0

    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 386
    :goto_2
    iget-object v0, p0, Lcom/pymcl/ai/McpClient;->config:Lcom/pymcl/ai/McpServerConfig;

    invoke-virtual {v0}, Lcom/pymcl/ai/McpServerConfig;->getType()Ljava/lang/String;

    move-result-object v0

    const-string v1, "sse"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/pymcl/ai/McpClient;->session:Ljava/lang/String;

    if-eqz v0, :cond_2

    :try_start_2
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object v0, p0

    check-cast v0, Lcom/pymcl/ai/McpClient;

    .line 553
    .local v0, "$this$close_u24lambda_u242":Lcom/pymcl/ai/McpClient;
    const/4 v1, 0x0

    .line 386
    .local v1, "$i$a$-runCatching-McpClient$close$3":I
    iget-object v2, v0, Lcom/pymcl/ai/McpClient;->http:Lcom/pymcl/ai/McpHttp;

    const-string v3, "DELETE"

    iget-object v4, v0, Lcom/pymcl/ai/McpClient;->config:Lcom/pymcl/ai/McpServerConfig;

    invoke-virtual {v4}, Lcom/pymcl/ai/McpServerConfig;->getUrl()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v0}, Lcom/pymcl/ai/McpClient;->baseHeaders()Ljava/util/Map;

    move-result-object v5

    const/4 v6, 0x0

    const/16 v7, 0x1388

    invoke-interface/range {v2 .. v7}, Lcom/pymcl/ai/McpHttp;->request(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;I)Lcom/pymcl/ai/McpHttp$Resp;

    move-result-object v2

    invoke-virtual {v2}, Lcom/pymcl/ai/McpHttp$Resp;->getLines()Lcom/pymcl/ai/AiLineStream;

    move-result-object v2

    invoke-interface {v2}, Lcom/pymcl/ai/AiLineStream;->close()V

    .end local v0    # "$this$close_u24lambda_u242":Lcom/pymcl/ai/McpClient;
    .end local v1    # "$i$a$-runCatching-McpClient$close$3":I
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    goto :goto_3

    :catchall_2
    move-exception v0

    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 387
    :cond_2
    :goto_3
    return-void
.end method

.method public final connect()V
    .locals 10

    .line 175
    iget-object v0, p0, Lcom/pymcl/ai/McpClient;->config:Lcom/pymcl/ai/McpServerConfig;

    invoke-virtual {v0}, Lcom/pymcl/ai/McpServerConfig;->getType()Ljava/lang/String;

    move-result-object v0

    const-string v1, "sse"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lcom/pymcl/ai/McpClient;->openSse()V

    .line 176
    :cond_0
    const/4 v0, 0x3

    new-array v0, v0, [Lkotlin/Pair;

    const-string v1, "2025-06-18"

    const-string v2, "protocolVersion"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v3, 0x0

    aput-object v1, v0, v3

    new-array v1, v3, [Lkotlin/Pair;

    invoke-static {v1}, Lcom/pymcl/core/util/JsonKt;->jobj([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v1

    const-string v4, "capabilities"

    invoke-static {v4, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v5, 0x1

    aput-object v1, v0, v5

    const/4 v1, 0x2

    new-array v6, v1, [Lkotlin/Pair;

    const-string v7, "PyMCL-Android"

    const-string v8, "name"

    invoke-static {v8, v7}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v7

    aput-object v7, v6, v3

    const-string v7, "0.9.3"

    const-string v9, "version"

    invoke-static {v9, v7}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v7

    aput-object v7, v6, v5

    invoke-static {v6}, Lcom/pymcl/core/util/JsonKt;->jobj([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v5

    const-string v6, "clientInfo"

    invoke-static {v6, v5}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v5

    aput-object v5, v0, v1

    invoke-static {v0}, Lcom/pymcl/core/util/JsonKt;->jobj([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v0

    const-string v1, "initialize"

    invoke-virtual {p0, v1, v0}, Lcom/pymcl/ai/McpClient;->rpc(Ljava/lang/String;Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    .line 177
    .local v0, "r":Ljava/util/Map;
    invoke-static {v0, v4}, Lcom/pymcl/core/util/JsonKt;->obj(Ljava/util/Map;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v1

    if-nez v1, :cond_1

    new-array v1, v3, [Lkotlin/Pair;

    invoke-static {v1}, Lcom/pymcl/core/util/JsonKt;->jobj([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v1

    :cond_1
    iput-object v1, p0, Lcom/pymcl/ai/McpClient;->capabilities:Ljava/util/Map;

    .line 178
    invoke-static {v0, v2}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_3

    move-object v2, v1

    .line 553
    .local v2, "it":Ljava/lang/String;
    const/4 v3, 0x0

    .line 178
    .local v3, "$i$a$-takeIf-McpClient$connect$1":I
    move-object v4, v2

    check-cast v4, Ljava/lang/CharSequence;

    invoke-static {v4}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v4

    .end local v2    # "it":Ljava/lang/String;
    .end local v3    # "$i$a$-takeIf-McpClient$connect$1":I
    if-nez v4, :cond_2

    goto :goto_0

    :cond_2
    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_3

    .line 553
    .local v1, "it":Ljava/lang/String;
    const/4 v2, 0x0

    .line 178
    .local v2, "$i$a$-let-McpClient$connect$2":I
    iput-object v1, p0, Lcom/pymcl/ai/McpClient;->protocolVersion:Ljava/lang/String;

    .line 179
    .end local v1    # "it":Ljava/lang/String;
    .end local v2    # "$i$a$-let-McpClient$connect$2":I
    :cond_3
    const-string v1, "serverInfo"

    invoke-static {v0, v1}, Lcom/pymcl/core/util/JsonKt;->obj(Ljava/util/Map;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v2

    invoke-static {v2, v8}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_4

    iget-object v2, p0, Lcom/pymcl/ai/McpClient;->config:Lcom/pymcl/ai/McpServerConfig;

    invoke-virtual {v2}, Lcom/pymcl/ai/McpServerConfig;->getName()Ljava/lang/String;

    move-result-object v2

    :cond_4
    invoke-static {v0, v1}, Lcom/pymcl/core/util/JsonKt;->obj(Ljava/util/Map;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v1

    invoke-static {v1, v9}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_5

    .line 553
    nop

    .restart local v1    # "it":Ljava/lang/String;
    const/4 v3, 0x0

    .line 179
    .local v3, "$i$a$-let-McpClient$connect$3":I
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, " "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .end local v1    # "it":Ljava/lang/String;
    .end local v3    # "$i$a$-let-McpClient$connect$3":I
    if-nez v1, :cond_6

    :cond_5
    const-string v1, ""

    :cond_6
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/pymcl/ai/McpClient;->serverInfo:Ljava/lang/String;

    .line 180
    const-string v1, "notifications/initialized"

    invoke-direct {p0, v1}, Lcom/pymcl/ai/McpClient;->notify(Ljava/lang/String;)V

    .line 181
    return-void
.end method

.method public final countPrompts()Ljava/lang/Integer;
    .locals 9

    .line 244
    invoke-virtual {p0}, Lcom/pymcl/ai/McpClient;->getHasPrompts()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    goto :goto_2

    :cond_0
    :try_start_0
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object v0, p0

    check-cast v0, Lcom/pymcl/ai/McpClient;

    move-object v2, v0

    .line 553
    .local v2, "$this$countPrompts_u24lambda_u240":Lcom/pymcl/ai/McpClient;
    const/4 v0, 0x0

    .line 244
    .local v0, "$i$a$-runCatching-McpClient$countPrompts$1":I
    const-string v3, "prompts/list"

    const-string v4, "prompts"

    const/16 v7, 0x8

    const/4 v8, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v2 .. v8}, Lcom/pymcl/ai/McpClient;->paged$default(Lcom/pymcl/ai/McpClient;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    invoke-virtual {v3}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    .end local v0    # "$i$a$-runCatching-McpClient$countPrompts$1":I
    .end local v2    # "$this$countPrompts_u24lambda_u240":Lcom/pymcl/ai/McpClient;
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

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
    check-cast v1, Ljava/lang/Integer;

    :goto_2
    return-object v1
.end method

.method public final countResources()Ljava/lang/Integer;
    .locals 9

    .line 243
    invoke-virtual {p0}, Lcom/pymcl/ai/McpClient;->getHasResources()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    goto :goto_2

    :cond_0
    :try_start_0
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object v0, p0

    check-cast v0, Lcom/pymcl/ai/McpClient;

    move-object v2, v0

    .line 553
    .local v2, "$this$countResources_u24lambda_u240":Lcom/pymcl/ai/McpClient;
    const/4 v0, 0x0

    .line 243
    .local v0, "$i$a$-runCatching-McpClient$countResources$1":I
    const-string v3, "resources/list"

    const-string v4, "resources"

    const/16 v7, 0x8

    const/4 v8, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v2 .. v8}, Lcom/pymcl/ai/McpClient;->paged$default(Lcom/pymcl/ai/McpClient;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    invoke-virtual {v3}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    .end local v0    # "$i$a$-runCatching-McpClient$countResources$1":I
    .end local v2    # "$this$countResources_u24lambda_u240":Lcom/pymcl/ai/McpClient;
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

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
    check-cast v1, Ljava/lang/Integer;

    :goto_2
    return-object v1
.end method

.method public final getCapabilities()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 156
    iget-object v0, p0, Lcom/pymcl/ai/McpClient;->capabilities:Ljava/util/Map;

    return-object v0
.end method

.method public final getChanges()Lcom/pymcl/ai/McpChangeSet;
    .locals 1

    .line 164
    iget-object v0, p0, Lcom/pymcl/ai/McpClient;->changes:Lcom/pymcl/ai/McpChangeSet;

    return-object v0
.end method

.method public final getConfig()Lcom/pymcl/ai/McpServerConfig;
    .locals 1

    .line 147
    iget-object v0, p0, Lcom/pymcl/ai/McpClient;->config:Lcom/pymcl/ai/McpServerConfig;

    return-object v0
.end method

.method public final getHasPrompts()Z
    .locals 2

    .line 160
    iget-object v0, p0, Lcom/pymcl/ai/McpClient;->capabilities:Ljava/util/Map;

    const-string v1, "prompts"

    invoke-static {v0, v1}, Lcom/pymcl/core/util/JsonKt;->obj(Ljava/util/Map;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final getHasResources()Z
    .locals 2

    .line 159
    iget-object v0, p0, Lcom/pymcl/ai/McpClient;->capabilities:Ljava/util/Map;

    const-string v1, "resources"

    invoke-static {v0, v1}, Lcom/pymcl/core/util/JsonKt;->obj(Ljava/util/Map;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final getHasSubscribe()Z
    .locals 2

    .line 162
    sget-object v0, Lcom/pymcl/ai/McpNotify;->INSTANCE:Lcom/pymcl/ai/McpNotify;

    iget-object v1, p0, Lcom/pymcl/ai/McpClient;->capabilities:Ljava/util/Map;

    invoke-virtual {v0, v1}, Lcom/pymcl/ai/McpNotify;->canSubscribe(Ljava/util/Map;)Z

    move-result v0

    return v0
.end method

.method public final getListenerState()Ljava/lang/String;
    .locals 1

    .line 170
    iget-object v0, p0, Lcom/pymcl/ai/McpClient;->listenerState:Ljava/lang/String;

    return-object v0
.end method

.method public final getOnNotification()Lkotlin/jvm/functions/Function1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function1<",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    .line 166
    iget-object v0, p0, Lcom/pymcl/ai/McpClient;->onNotification:Lkotlin/jvm/functions/Function1;

    return-object v0
.end method

.method public final getPrompt(Ljava/lang/String;Ljava/util/Map;)Lcom/pymcl/ai/ToolOutput;
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
            "Lcom/pymcl/ai/ToolOutput;"
        }
    .end annotation

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 294
    invoke-virtual {p0}, Lcom/pymcl/ai/McpClient;->getHasPrompts()Z

    move-result v1

    if-nez v1, :cond_0

    sget-object v0, Lcom/pymcl/ai/ToolOutput;->Companion:Lcom/pymcl/ai/ToolOutput$Companion;

    iget-object v1, p0, Lcom/pymcl/ai/McpClient;->config:Lcom/pymcl/ai/McpServerConfig;

    invoke-virtual {v1}, Lcom/pymcl/ai/McpServerConfig;->getName()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\u670d\u52a1\u5668 "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " \u6ca1\u6709\u58f0\u660e prompts \u80fd\u529b"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/pymcl/ai/ToolOutput$Companion;->err(Ljava/lang/String;)Lcom/pymcl/ai/ToolOutput;

    move-result-object v0

    return-object v0

    .line 295
    :cond_0
    move-object v1, p1

    check-cast v1, Ljava/lang/CharSequence;

    invoke-static {v1}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_1

    sget-object v0, Lcom/pymcl/ai/ToolOutput;->Companion:Lcom/pymcl/ai/ToolOutput$Companion;

    const-string v1, "\u7f3a\u5c11 name"

    invoke-virtual {v0, v1}, Lcom/pymcl/ai/ToolOutput$Companion;->err(Ljava/lang/String;)Lcom/pymcl/ai/ToolOutput;

    move-result-object v0

    return-object v0

    .line 296
    :cond_1
    const/4 v1, 0x1

    new-array v2, v1, [Lkotlin/Pair;

    const/4 v3, 0x0

    invoke-static {v0, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    aput-object v0, v2, v3

    invoke-static {v2}, Lcom/pymcl/core/util/JsonKt;->jobj([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v0

    .local v0, "p":Ljava/util/Map;
    sget-object v2, Lcom/pymcl/ai/McpFormat;->INSTANCE:Lcom/pymcl/ai/McpFormat;

    invoke-virtual {v2, p2}, Lcom/pymcl/ai/McpFormat;->promptArgs(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v2

    move-object v3, v2

    .line 553
    .local v3, "it":Ljava/util/Map;
    const/4 v4, 0x0

    .line 296
    .local v4, "$i$a$-takeIf-McpClient$getPrompt$1":I
    invoke-interface {v3}, Ljava/util/Map;->isEmpty()Z

    move-result v5

    .end local v3    # "it":Ljava/util/Map;
    .end local v4    # "$i$a$-takeIf-McpClient$getPrompt$1":I
    if-nez v5, :cond_2

    goto :goto_0

    :cond_2
    const/4 v2, 0x0

    :goto_0
    if-eqz v2, :cond_3

    .line 553
    .local v2, "it":Ljava/util/Map;
    const/4 v3, 0x0

    .line 296
    .local v3, "$i$a$-let-McpClient$getPrompt$2":I
    const-string v4, "arguments"

    invoke-interface {v0, v4, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 297
    .end local v2    # "it":Ljava/util/Map;
    .end local v3    # "$i$a$-let-McpClient$getPrompt$2":I
    :cond_3
    new-instance v2, Lcom/pymcl/ai/ToolOutput;

    sget-object v3, Lcom/pymcl/ai/McpFormat;->INSTANCE:Lcom/pymcl/ai/McpFormat;

    const-string v4, "prompts/get"

    invoke-virtual {p0, v4, v0}, Lcom/pymcl/ai/McpClient;->rpc(Ljava/lang/String;Ljava/util/Map;)Ljava/util/Map;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/pymcl/ai/McpFormat;->promptResult(Ljava/util/Map;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v1, v3, v1}, Lcom/pymcl/ai/ToolOutput;-><init>(ZLjava/lang/String;Z)V

    return-object v2
.end method

.method public final getProtocolVersion()Ljava/lang/String;
    .locals 1

    .line 158
    iget-object v0, p0, Lcom/pymcl/ai/McpClient;->protocolVersion:Ljava/lang/String;

    return-object v0
.end method

.method public final getServerInfo()Ljava/lang/String;
    .locals 1

    .line 154
    iget-object v0, p0, Lcom/pymcl/ai/McpClient;->serverInfo:Ljava/lang/String;

    return-object v0
.end method

.method public final handleIncoming(Ljava/util/Map;)Z
    .locals 9
    .param p1, "o"    # Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)Z"
        }
    .end annotation

    const-string v0, "o"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 187
    sget-object v0, Lcom/pymcl/ai/McpNotify;->INSTANCE:Lcom/pymcl/ai/McpNotify;

    invoke-virtual {v0, p1}, Lcom/pymcl/ai/McpNotify;->classify(Ljava/util/Map;)Lcom/pymcl/ai/McpNotify$Msg;

    move-result-object v0

    .line 188
    .local v0, "m":Lcom/pymcl/ai/McpNotify$Msg;
    instance-of v1, v0, Lcom/pymcl/ai/McpNotify$Msg$Notification;

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/pymcl/ai/McpClient;->changes:Lcom/pymcl/ai/McpChangeSet;

    move-object v4, v0

    check-cast v4, Lcom/pymcl/ai/McpNotify$Msg$Notification;

    invoke-virtual {v4}, Lcom/pymcl/ai/McpNotify$Msg$Notification;->getMethod()Ljava/lang/String;

    move-result-object v4

    move-object v5, v0

    check-cast v5, Lcom/pymcl/ai/McpNotify$Msg$Notification;

    invoke-virtual {v5}, Lcom/pymcl/ai/McpNotify$Msg$Notification;->getParams()Ljava/util/Map;

    move-result-object v5

    invoke-virtual {v1, v4, v5}, Lcom/pymcl/ai/McpChangeSet;->apply(Ljava/lang/String;Ljava/util/Map;)Z

    move-result v1

    if-eqz v1, :cond_3

    :try_start_0
    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object v1, p0

    check-cast v1, Lcom/pymcl/ai/McpClient;

    .line 553
    .local v1, "$this$handleIncoming_u24lambda_u240":Lcom/pymcl/ai/McpClient;
    const/4 v4, 0x0

    .line 188
    .local v4, "$i$a$-runCatching-McpClient$handleIncoming$1":I
    iget-object v5, v1, Lcom/pymcl/ai/McpClient;->onNotification:Lkotlin/jvm/functions/Function1;

    if-eqz v5, :cond_0

    move-object v2, v0

    check-cast v2, Lcom/pymcl/ai/McpNotify$Msg$Notification;

    invoke-virtual {v2}, Lcom/pymcl/ai/McpNotify$Msg$Notification;->getMethod()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v5, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .end local v1    # "$this$handleIncoming_u24lambda_u240":Lcom/pymcl/ai/McpClient;
    .end local v4    # "$i$a$-runCatching-McpClient$handleIncoming$1":I
    :cond_0
    invoke-static {v2}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v1

    sget-object v2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 189
    :cond_1
    instance-of v1, v0, Lcom/pymcl/ai/McpNotify$Msg$Request;

    const/4 v4, 0x0

    if-eqz v1, :cond_2

    :try_start_1
    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object v1, p0

    check-cast v1, Lcom/pymcl/ai/McpClient;

    .line 553
    .local v1, "$this$handleIncoming_u24lambda_u241":Lcom/pymcl/ai/McpClient;
    const/4 v5, 0x0

    .line 189
    .local v5, "$i$a$-runCatching-McpClient$handleIncoming$2":I
    sget-object v6, Lcom/pymcl/core/util/Json;->INSTANCE:Lcom/pymcl/core/util/Json;

    sget-object v7, Lcom/pymcl/ai/McpNotify;->INSTANCE:Lcom/pymcl/ai/McpNotify;

    move-object v8, v0

    check-cast v8, Lcom/pymcl/ai/McpNotify$Msg$Request;

    invoke-virtual {v7, v8}, Lcom/pymcl/ai/McpNotify;->replyFor(Lcom/pymcl/ai/McpNotify$Msg$Request;)Ljava/util/Map;

    move-result-object v7

    const/4 v8, 0x2

    invoke-static {v6, v7, v4, v8, v2}, Lcom/pymcl/core/util/Json;->stringify$default(Lcom/pymcl/core/util/Json;Ljava/lang/Object;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/pymcl/ai/McpClient;->post(Ljava/lang/String;)Lcom/pymcl/ai/McpHttp$Resp;

    move-result-object v2

    invoke-virtual {v2}, Lcom/pymcl/ai/McpHttp$Resp;->getLines()Lcom/pymcl/ai/AiLineStream;

    move-result-object v2

    invoke-interface {v2}, Lcom/pymcl/ai/AiLineStream;->close()V

    .end local v1    # "$this$handleIncoming_u24lambda_u241":Lcom/pymcl/ai/McpClient;
    .end local v5    # "$i$a$-runCatching-McpClient$handleIncoming$2":I
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-static {v1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception v1

    sget-object v2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 190
    :cond_2
    move v3, v4

    .line 191
    .end local v0    # "m":Lcom/pymcl/ai/McpNotify$Msg;
    :cond_3
    :goto_0
    return v3
.end method

.method public final listPrompts(Ljava/lang/String;)Lcom/pymcl/ai/ToolOutput;
    .locals 8
    .param p1, "cursor"    # Ljava/lang/String;

    .line 288
    invoke-virtual {p0}, Lcom/pymcl/ai/McpClient;->getHasPrompts()Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Lcom/pymcl/ai/ToolOutput;->Companion:Lcom/pymcl/ai/ToolOutput$Companion;

    iget-object v1, p0, Lcom/pymcl/ai/McpClient;->config:Lcom/pymcl/ai/McpServerConfig;

    invoke-virtual {v1}, Lcom/pymcl/ai/McpServerConfig;->getName()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\u670d\u52a1\u5668 "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " \u6ca1\u6709\u58f0\u660e prompts \u80fd\u529b"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/pymcl/ai/ToolOutput$Companion;->err(Ljava/lang/String;)Lcom/pymcl/ai/ToolOutput;

    move-result-object v0

    return-object v0

    .line 289
    :cond_0
    const/16 v6, 0x8

    const/4 v7, 0x0

    const-string v2, "prompts/list"

    const-string v3, "prompts"

    const/4 v5, 0x0

    move-object v1, p0

    move-object v4, p1

    .end local p1    # "cursor":Ljava/lang/String;
    .local v4, "cursor":Ljava/lang/String;
    invoke-static/range {v1 .. v7}, Lcom/pymcl/ai/McpClient;->paged$default(Lcom/pymcl/ai/McpClient;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    invoke-virtual {p1}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    .local v0, "ps":Ljava/util/List;
    invoke-virtual {p1}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    .line 290
    .local p1, "next":Ljava/lang/String;
    new-instance v1, Lcom/pymcl/ai/ToolOutput;

    sget-object v2, Lcom/pymcl/ai/McpFormat;->INSTANCE:Lcom/pymcl/ai/McpFormat;

    invoke-virtual {v2, v0, p1}, Lcom/pymcl/ai/McpFormat;->promptList(Ljava/util/List;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    invoke-direct {v1, v3, v2, v3}, Lcom/pymcl/ai/ToolOutput;-><init>(ZLjava/lang/String;Z)V

    return-object v1
.end method

.method public final listResources(Ljava/lang/String;)Lcom/pymcl/ai/ToolOutput;
    .locals 12
    .param p1, "cursor"    # Ljava/lang/String;

    .line 273
    invoke-virtual {p0}, Lcom/pymcl/ai/McpClient;->getHasResources()Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Lcom/pymcl/ai/ToolOutput;->Companion:Lcom/pymcl/ai/ToolOutput$Companion;

    iget-object v1, p0, Lcom/pymcl/ai/McpClient;->config:Lcom/pymcl/ai/McpServerConfig;

    invoke-virtual {v1}, Lcom/pymcl/ai/McpServerConfig;->getName()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\u670d\u52a1\u5668 "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " \u6ca1\u6709\u58f0\u660e resources \u80fd\u529b"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/pymcl/ai/ToolOutput$Companion;->err(Ljava/lang/String;)Lcom/pymcl/ai/ToolOutput;

    move-result-object v0

    return-object v0

    .line 274
    :cond_0
    const/16 v6, 0x8

    const/4 v7, 0x0

    const-string v2, "resources/list"

    const-string v3, "resources"

    const/4 v5, 0x0

    move-object v1, p0

    move-object v4, p1

    .end local p1    # "cursor":Ljava/lang/String;
    .local v4, "cursor":Ljava/lang/String;
    invoke-static/range {v1 .. v7}, Lcom/pymcl/ai/McpClient;->paged$default(Lcom/pymcl/ai/McpClient;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    invoke-virtual {p1}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ljava/util/List;

    .local v2, "res":Ljava/util/List;
    invoke-virtual {p1}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    .line 275
    .local p1, "next":Ljava/lang/String;
    if-nez v4, :cond_2

    :try_start_0
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object v0, v1

    check-cast v0, Lcom/pymcl/ai/McpClient;

    move-object v5, v0

    .line 553
    .local v5, "$this$listResources_u24lambda_u240":Lcom/pymcl/ai/McpClient;
    const/4 v0, 0x0

    .line 275
    .local v0, "$i$a$-runCatching-McpClient$listResources$tpl$1":I
    const-string v6, "resources/templates/list"

    const-string v7, "resourceTemplates"

    const/16 v10, 0x8

    const/4 v11, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-static/range {v5 .. v11}, Lcom/pymcl/ai/McpClient;->paged$default(Lcom/pymcl/ai/McpClient;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    invoke-virtual {v3}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    .end local v0    # "$i$a$-runCatching-McpClient$listResources$tpl$1":I
    .end local v5    # "$this$listResources_u24lambda_u240":Lcom/pymcl/ai/McpClient;
    invoke-static {v3}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    sget-object v3, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    :goto_0
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v3

    invoke-static {v0}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    move-object v0, v3

    :cond_1
    check-cast v0, Ljava/util/List;

    goto :goto_1

    :cond_2
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v0

    .line 276
    .local v0, "tpl":Ljava/util/List;
    :goto_1
    new-instance v3, Lcom/pymcl/ai/ToolOutput;

    sget-object v5, Lcom/pymcl/ai/McpFormat;->INSTANCE:Lcom/pymcl/ai/McpFormat;

    invoke-virtual {v5, v2, v0, p1}, Lcom/pymcl/ai/McpFormat;->resourceList(Ljava/util/List;Ljava/util/List;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x1

    invoke-direct {v3, v6, v5, v6}, Lcom/pymcl/ai/ToolOutput;-><init>(ZLjava/lang/String;Z)V

    return-object v3
.end method

.method public final listTools()Ljava/util/List;
    .locals 27
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/pymcl/ai/McpTool;",
            ">;"
        }
    .end annotation

    .line 247
    move-object/from16 v0, p0

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    check-cast v1, Ljava/util/List;

    .local v1, "out":Ljava/util/List;
    const/4 v2, 0x0

    .local v2, "cursor":Ljava/lang/String;
    const/4 v3, 0x0

    .line 249
    .local v3, "pages":I
    :cond_0
    const/4 v4, 0x0

    const/4 v5, 0x1

    if-eqz v2, :cond_1

    new-array v6, v5, [Lkotlin/Pair;

    const-string v7, "cursor"

    invoke-static {v7, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v7

    aput-object v7, v6, v4

    invoke-static {v6}, Lcom/pymcl/core/util/JsonKt;->jobj([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v6

    goto :goto_0

    :cond_1
    new-array v6, v4, [Lkotlin/Pair;

    invoke-static {v6}, Lcom/pymcl/core/util/JsonKt;->jobj([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v6

    :goto_0
    const-string v7, "tools/list"

    invoke-virtual {v0, v7, v6}, Lcom/pymcl/ai/McpClient;->rpc(Ljava/lang/String;Ljava/util/Map;)Ljava/util/Map;

    move-result-object v6

    .line 250
    .local v6, "r":Ljava/util/Map;
    const-string v7, "tools"

    invoke-static {v6, v7}, Lcom/pymcl/core/util/JsonKt;->arr(Ljava/util/Map;Ljava/lang/String;)Ljava/util/List;

    move-result-object v7

    invoke-static {v7}, Lcom/pymcl/core/util/JsonKt;->objs(Ljava/util/List;)Ljava/util/List;

    move-result-object v7

    check-cast v7, Ljava/lang/Iterable;

    .local v7, "$this$forEach$iv":Ljava/lang/Iterable;
    const/4 v8, 0x0

    .line 554
    .local v8, "$i$f$forEach":I
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_1
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_6

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    .local v10, "element$iv":Ljava/lang/Object;
    move-object v11, v10

    check-cast v11, Ljava/util/Map;

    .local v11, "t":Ljava/util/Map;
    const/4 v12, 0x0

    .line 251
    .local v12, "$i$a$-forEach-McpClient$listTools$1":I
    const-string v13, "annotations"

    invoke-static {v11, v13}, Lcom/pymcl/core/util/JsonKt;->obj(Ljava/util/Map;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v13

    .line 252
    .local v13, "ann":Ljava/util/Map;
    move-object v14, v1

    check-cast v14, Ljava/util/Collection;

    iget-object v15, v0, Lcom/pymcl/ai/McpClient;->config:Lcom/pymcl/ai/McpServerConfig;

    invoke-virtual {v15}, Lcom/pymcl/ai/McpServerConfig;->getName()Ljava/lang/String;

    move-result-object v17

    const-string v15, "name"

    invoke-static {v11, v15}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v18

    if-nez v18, :cond_2

    move/from16 v26, v5

    goto :goto_3

    :cond_2
    const-string v15, "description"

    invoke-static {v11, v15}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v15

    if-nez v15, :cond_3

    const-string v15, ""

    :cond_3
    move-object/from16 v19, v15

    const-string v15, "inputSchema"

    invoke-static {v11, v15}, Lcom/pymcl/core/util/JsonKt;->obj(Ljava/util/Map;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v15

    if-nez v15, :cond_4

    new-array v15, v4, [Lkotlin/Pair;

    invoke-static {v15}, Lcom/pymcl/core/util/JsonKt;->jobj([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v15

    :cond_4
    move-object/from16 v20, v15

    .line 253
    const-string v15, "readOnlyHint"

    invoke-static {v13, v15}, Lcom/pymcl/core/util/JsonKt;->bool(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v4

    move/from16 v26, v5

    invoke-static/range {v26 .. v26}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v5

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v21

    const-string v4, "destructiveHint"

    invoke-static {v13, v4}, Lcom/pymcl/core/util/JsonKt;->bool(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v4

    invoke-static/range {v26 .. v26}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v5

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-static {v13, v15}, Lcom/pymcl/core/util/JsonKt;->bool(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v4

    invoke-static/range {v26 .. v26}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v5

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_5

    move/from16 v22, v26

    goto :goto_2

    :cond_5
    const/16 v22, 0x0

    .line 252
    :goto_2
    new-instance v16, Lcom/pymcl/ai/McpTool;

    const/16 v23, 0x0

    const/16 v24, 0x40

    const/16 v25, 0x0

    invoke-direct/range {v16 .. v25}, Lcom/pymcl/ai/McpTool;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v4, v16

    invoke-interface {v14, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 254
    nop

    .line 554
    .end local v11    # "t":Ljava/util/Map;
    .end local v12    # "$i$a$-forEach-McpClient$listTools$1":I
    .end local v13    # "ann":Ljava/util/Map;
    :goto_3
    move/from16 v5, v26

    const/4 v4, 0x0

    .end local v10    # "element$iv":Ljava/lang/Object;
    goto/16 :goto_1

    .line 555
    :cond_6
    nop

    .line 255
    .end local v7    # "$this$forEach$iv":Ljava/lang/Iterable;
    .end local v8    # "$i$f$forEach":I
    const-string v4, "nextCursor"

    invoke-static {v6, v4}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    if-eqz v4, :cond_7

    move-object v7, v4

    .line 553
    .local v7, "it":Ljava/lang/String;
    const/4 v8, 0x0

    .line 255
    .local v8, "$i$a$-takeIf-McpClient$listTools$2":I
    move-object v9, v7

    check-cast v9, Ljava/lang/CharSequence;

    invoke-static {v9}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v9

    .end local v7    # "it":Ljava/lang/String;
    .end local v8    # "$i$a$-takeIf-McpClient$listTools$2":I
    if-nez v9, :cond_7

    goto :goto_4

    :cond_7
    move-object v4, v5

    :goto_4
    move-object v2, v4

    .line 256
    .end local v6    # "r":Ljava/util/Map;
    if-eqz v2, :cond_8

    add-int/lit8 v3, v3, 0x1

    const/16 v4, 0x14

    if-lt v3, v4, :cond_0

    .line 257
    :cond_8
    return-object v1
.end method

.method public final readResource(Ljava/lang/String;)Lcom/pymcl/ai/ToolOutput;
    .locals 6
    .param p1, "uri"    # Ljava/lang/String;

    const-string v0, "uri"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 280
    invoke-virtual {p0}, Lcom/pymcl/ai/McpClient;->getHasResources()Z

    move-result v1

    if-nez v1, :cond_0

    sget-object v0, Lcom/pymcl/ai/ToolOutput;->Companion:Lcom/pymcl/ai/ToolOutput$Companion;

    iget-object v1, p0, Lcom/pymcl/ai/McpClient;->config:Lcom/pymcl/ai/McpServerConfig;

    invoke-virtual {v1}, Lcom/pymcl/ai/McpServerConfig;->getName()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\u670d\u52a1\u5668 "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " \u6ca1\u6709\u58f0\u660e resources \u80fd\u529b"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/pymcl/ai/ToolOutput$Companion;->err(Ljava/lang/String;)Lcom/pymcl/ai/ToolOutput;

    move-result-object v0

    return-object v0

    .line 281
    :cond_0
    move-object v1, p1

    check-cast v1, Ljava/lang/CharSequence;

    invoke-static {v1}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_1

    sget-object v0, Lcom/pymcl/ai/ToolOutput;->Companion:Lcom/pymcl/ai/ToolOutput$Companion;

    const-string v1, "\u7f3a\u5c11 uri"

    invoke-virtual {v0, v1}, Lcom/pymcl/ai/ToolOutput$Companion;->err(Ljava/lang/String;)Lcom/pymcl/ai/ToolOutput;

    move-result-object v0

    return-object v0

    .line 282
    :cond_1
    new-instance v1, Lcom/pymcl/ai/ToolOutput;

    sget-object v2, Lcom/pymcl/ai/McpFormat;->INSTANCE:Lcom/pymcl/ai/McpFormat;

    const/4 v3, 0x1

    new-array v4, v3, [Lkotlin/Pair;

    const/4 v5, 0x0

    invoke-static {v0, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    aput-object v0, v4, v5

    invoke-static {v4}, Lcom/pymcl/core/util/JsonKt;->jobj([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v0

    const-string v4, "resources/read"

    invoke-virtual {p0, v4, v0}, Lcom/pymcl/ai/McpClient;->rpc(Ljava/lang/String;Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/pymcl/ai/McpFormat;->readResult(Ljava/util/Map;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v3, v0, v3}, Lcom/pymcl/ai/ToolOutput;-><init>(ZLjava/lang/String;Z)V

    .line 283
    .local v1, "out":Lcom/pymcl/ai/ToolOutput;
    iget-object v0, p0, Lcom/pymcl/ai/McpClient;->changes:Lcom/pymcl/ai/McpChangeSet;

    invoke-virtual {v0, p1}, Lcom/pymcl/ai/McpChangeSet;->clearUpdated(Ljava/lang/String;)V

    .line 284
    return-object v1
.end method

.method public final rpc(Ljava/lang/String;Ljava/util/Map;)Ljava/util/Map;
    .locals 27
    .param p1, "method"    # Ljava/lang/String;
    .param p2, "params"    # Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    const-string v0, "method"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "params"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 318
    iget-object v5, v1, Lcom/pymcl/ai/McpClient;->ids:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v5}, Ljava/util/concurrent/atomic/AtomicLong;->getAndIncrement()J

    move-result-wide v5

    .line 319
    .local v5, "id":J
    sget-object v7, Lcom/pymcl/core/util/Json;->INSTANCE:Lcom/pymcl/core/util/Json;

    const/4 v8, 0x4

    new-array v8, v8, [Lkotlin/Pair;

    const-string v9, "jsonrpc"

    const-string v10, "2.0"

    invoke-static {v9, v10}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v9

    const/4 v10, 0x0

    aput-object v9, v8, v10

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v9

    const-string v11, "id"

    invoke-static {v11, v9}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v9

    const/4 v12, 0x1

    aput-object v9, v8, v12

    invoke-static {v0, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/4 v9, 0x2

    aput-object v0, v8, v9

    const/4 v0, 0x3

    invoke-static {v4, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v4

    aput-object v4, v8, v0

    invoke-static {v8}, Lcom/pymcl/core/util/JsonKt;->jobj([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v0

    const/4 v4, 0x0

    invoke-static {v7, v0, v10, v9, v4}, Lcom/pymcl/core/util/Json;->stringify$default(Lcom/pymcl/core/util/Json;Ljava/lang/Object;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    .line 320
    .local v7, "body":Ljava/lang/String;
    iget-object v0, v1, Lcom/pymcl/ai/McpClient;->config:Lcom/pymcl/ai/McpServerConfig;

    invoke-virtual {v0}, Lcom/pymcl/ai/McpServerConfig;->getType()Ljava/lang/String;

    move-result-object v0

    const-string v8, "sse"

    invoke-static {v0, v8}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    const-string v8, "HTTP "

    const/16 v13, 0x12c

    const/16 v14, 0xc8

    if-eqz v0, :cond_2

    .line 321
    new-instance v0, Ljava/util/concurrent/CompletableFuture;

    invoke-direct {v0}, Ljava/util/concurrent/CompletableFuture;-><init>()V

    move-object v4, v0

    .local v4, "f":Ljava/util/concurrent/CompletableFuture;
    iget-object v0, v1, Lcom/pymcl/ai/McpClient;->waiting:Ljava/util/concurrent/ConcurrentHashMap;

    check-cast v0, Ljava/util/Map;

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v9

    invoke-interface {v0, v9, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 322
    nop

    .line 323
    :try_start_0
    invoke-direct {v1, v7}, Lcom/pymcl/ai/McpClient;->post(Ljava/lang/String;)Lcom/pymcl/ai/McpHttp$Resp;

    move-result-object v0

    .local v0, "r":Lcom/pymcl/ai/McpHttp$Resp;
    invoke-virtual {v0}, Lcom/pymcl/ai/McpHttp$Resp;->getCode()I

    move-result v9

    .local v9, "code":I
    invoke-virtual {v0}, Lcom/pymcl/ai/McpHttp$Resp;->getLines()Lcom/pymcl/ai/AiLineStream;

    move-result-object v11

    invoke-interface {v11}, Lcom/pymcl/ai/AiLineStream;->close()V

    .line 324
    if-gt v14, v9, :cond_0

    if-ge v9, v13, :cond_0

    move v10, v12

    :cond_0
    if-eqz v10, :cond_1

    .line 325
    iget-object v8, v1, Lcom/pymcl/ai/McpClient;->config:Lcom/pymcl/ai/McpServerConfig;

    invoke-virtual {v8}, Lcom/pymcl/ai/McpServerConfig;->getTimeoutMs()I

    move-result v8

    int-to-long v10, v8

    sget-object v8, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v4, v10, v11, v8}, Ljava/util/concurrent/CompletableFuture;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    move-result-object v8

    const-string v10, "get(...)"

    invoke-static {v8, v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v8, Ljava/util/Map;

    invoke-direct {v1, v8}, Lcom/pymcl/ai/McpClient;->unwrap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v8
    :try_end_0
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 326
    .end local v0    # "r":Lcom/pymcl/ai/McpHttp$Resp;
    .end local v9    # "code":I
    iget-object v10, v1, Lcom/pymcl/ai/McpClient;->waiting:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v11

    invoke-virtual {v10, v11}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 325
    .restart local v0    # "r":Lcom/pymcl/ai/McpHttp$Resp;
    .restart local v9    # "code":I
    return-object v8

    .line 324
    :cond_1
    :try_start_1
    new-instance v10, Lcom/pymcl/ai/McpException;

    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v11, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-direct {v10, v8}, Lcom/pymcl/ai/McpException;-><init>(Ljava/lang/String;)V

    .end local v4    # "f":Ljava/util/concurrent/CompletableFuture;
    .end local v5    # "id":J
    .end local v7    # "body":Ljava/lang/String;
    .end local p1    # "method":Ljava/lang/String;
    .end local p2    # "params":Ljava/util/Map;
    throw v10
    :try_end_1
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 325
    .end local v0    # "r":Lcom/pymcl/ai/McpHttp$Resp;
    .end local v9    # "code":I
    .restart local v4    # "f":Ljava/util/concurrent/CompletableFuture;
    .restart local v5    # "id":J
    .restart local v7    # "body":Ljava/lang/String;
    .restart local p1    # "method":Ljava/lang/String;
    .restart local p2    # "params":Ljava/util/Map;
    :catchall_0
    move-exception v0

    goto :goto_0

    :catch_0
    move-exception v0

    .local v0, "e":Ljava/util/concurrent/TimeoutException;
    :try_start_2
    new-instance v8, Lcom/pymcl/ai/McpException;

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v9, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    const-string v10, " \u8d85\u65f6"

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-direct {v8, v9}, Lcom/pymcl/ai/McpException;-><init>(Ljava/lang/String;)V

    .end local v4    # "f":Ljava/util/concurrent/CompletableFuture;
    .end local v5    # "id":J
    .end local v7    # "body":Ljava/lang/String;
    .end local p1    # "method":Ljava/lang/String;
    .end local p2    # "params":Ljava/util/Map;
    throw v8
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .end local v0    # "e":Ljava/util/concurrent/TimeoutException;
    .restart local v4    # "f":Ljava/util/concurrent/CompletableFuture;
    .restart local v5    # "id":J
    .restart local v7    # "body":Ljava/lang/String;
    .restart local p1    # "method":Ljava/lang/String;
    .restart local p2    # "params":Ljava/util/Map;
    :goto_0
    iget-object v8, v1, Lcom/pymcl/ai/McpClient;->waiting:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v9

    invoke-virtual {v8, v9}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    throw v0

    .line 328
    .end local v4    # "f":Ljava/util/concurrent/CompletableFuture;
    :cond_2
    invoke-direct {v1, v7}, Lcom/pymcl/ai/McpClient;->post(Ljava/lang/String;)Lcom/pymcl/ai/McpHttp$Resp;

    move-result-object v15

    .line 329
    .local v15, "r":Lcom/pymcl/ai/McpHttp$Resp;
    invoke-virtual {v15}, Lcom/pymcl/ai/McpHttp$Resp;->getHeaders()Ljava/util/Map;

    move-result-object v0

    const-string v12, "mcp-session-id"

    invoke-interface {v0, v12}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-eqz v0, :cond_4

    move-object v12, v0

    .line 553
    .local v12, "it":Ljava/lang/String;
    const/16 v17, 0x0

    .line 329
    .local v17, "$i$a$-takeIf-McpClient$rpc$1":I
    move-object/from16 v18, v12

    check-cast v18, Ljava/lang/CharSequence;

    invoke-static/range {v18 .. v18}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v18

    .end local v12    # "it":Ljava/lang/String;
    .end local v17    # "$i$a$-takeIf-McpClient$rpc$1":I
    if-nez v18, :cond_3

    goto :goto_1

    :cond_3
    move-object v0, v4

    :goto_1
    if-eqz v0, :cond_4

    .line 553
    .local v0, "it":Ljava/lang/String;
    const/4 v12, 0x0

    .line 329
    .local v12, "$i$a$-let-McpClient$rpc$2":I
    iput-object v0, v1, Lcom/pymcl/ai/McpClient;->session:Ljava/lang/String;

    .line 330
    .end local v0    # "it":Ljava/lang/String;
    .end local v12    # "$i$a$-let-McpClient$rpc$2":I
    :cond_4
    nop

    .line 331
    :try_start_3
    invoke-virtual {v15}, Lcom/pymcl/ai/McpHttp$Resp;->getCode()I

    move-result v0

    const/16 v12, 0x194

    if-ne v0, v12, :cond_6

    iget-object v0, v1, Lcom/pymcl/ai/McpClient;->session:Ljava/lang/String;

    if-nez v0, :cond_5

    goto :goto_2

    :cond_5
    iput-object v4, v1, Lcom/pymcl/ai/McpClient;->session:Ljava/lang/String;

    new-instance v0, Lcom/pymcl/ai/McpException;

    const-string v4, "\u4f1a\u8bdd\u5df2\u5931\u6548\uff08HTTP 404\uff09"

    invoke-direct {v0, v4}, Lcom/pymcl/ai/McpException;-><init>(Ljava/lang/String;)V

    .end local v5    # "id":J
    .end local v7    # "body":Ljava/lang/String;
    .end local v15    # "r":Lcom/pymcl/ai/McpHttp$Resp;
    .end local p1    # "method":Ljava/lang/String;
    .end local p2    # "params":Ljava/util/Map;
    throw v0

    .line 332
    .restart local v5    # "id":J
    .restart local v7    # "body":Ljava/lang/String;
    .restart local v15    # "r":Lcom/pymcl/ai/McpHttp$Resp;
    .restart local p1    # "method":Ljava/lang/String;
    .restart local p2    # "params":Ljava/util/Map;
    :cond_6
    :goto_2
    invoke-virtual {v15}, Lcom/pymcl/ai/McpHttp$Resp;->getCode()I

    move-result v0

    if-gt v14, v0, :cond_7

    if-ge v0, v13, :cond_7

    const/4 v0, 0x1

    goto :goto_3

    :cond_7
    move v0, v10

    :goto_3
    if-eqz v0, :cond_16

    .line 333
    invoke-virtual {v15}, Lcom/pymcl/ai/McpHttp$Resp;->getContentType()Ljava/lang/String;

    move-result-object v0

    check-cast v0, Ljava/lang/CharSequence;

    const-string v8, "text/event-stream"

    check-cast v8, Ljava/lang/CharSequence;

    invoke-static {v0, v8, v10, v9, v4}, Lkotlin/text/StringsKt;->contains$default(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_b

    .line 334
    new-instance v0, Lkotlin/jvm/internal/Ref$ObjectRef;

    invoke-direct {v0}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    .line 335
    .local v0, "found":Lkotlin/jvm/internal/Ref$ObjectRef;
    new-instance v4, Lcom/pymcl/ai/SseParser;

    new-instance v8, Lcom/pymcl/ai/McpClient$$ExternalSyntheticLambda2;

    invoke-direct {v8, v1, v5, v6, v0}, Lcom/pymcl/ai/McpClient$$ExternalSyntheticLambda2;-><init>(Lcom/pymcl/ai/McpClient;JLkotlin/jvm/internal/Ref$ObjectRef;)V

    invoke-direct {v4, v8}, Lcom/pymcl/ai/SseParser;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 336
    .local v4, "p":Lcom/pymcl/ai/SseParser;
    :goto_4
    iget-object v8, v0, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    if-nez v8, :cond_9

    invoke-virtual {v15}, Lcom/pymcl/ai/McpHttp$Resp;->getLines()Lcom/pymcl/ai/AiLineStream;

    move-result-object v8

    invoke-interface {v8}, Lcom/pymcl/ai/AiLineStream;->readLine()Ljava/lang/String;

    move-result-object v8

    if-nez v8, :cond_8

    goto :goto_5

    .local v8, "l":Ljava/lang/String;
    :cond_8
    invoke-virtual {v4, v8}, Lcom/pymcl/ai/SseParser;->feed(Ljava/lang/String;)V

    .end local v8    # "l":Ljava/lang/String;
    goto :goto_4

    .line 337
    :cond_9
    :goto_5
    invoke-virtual {v4}, Lcom/pymcl/ai/SseParser;->flush()V

    .line 338
    iget-object v8, v0, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v8, Ljava/util/Map;

    if-eqz v8, :cond_a

    invoke-direct {v1, v8}, Lcom/pymcl/ai/McpClient;->unwrap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v8
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 344
    .end local v0    # "found":Lkotlin/jvm/internal/Ref$ObjectRef;
    .end local v4    # "p":Lcom/pymcl/ai/SseParser;
    invoke-virtual {v15}, Lcom/pymcl/ai/McpHttp$Resp;->getLines()Lcom/pymcl/ai/AiLineStream;

    move-result-object v9

    invoke-interface {v9}, Lcom/pymcl/ai/AiLineStream;->close()V

    .line 338
    .restart local v0    # "found":Lkotlin/jvm/internal/Ref$ObjectRef;
    .restart local v4    # "p":Lcom/pymcl/ai/SseParser;
    return-object v8

    :cond_a
    :try_start_4
    new-instance v8, Lcom/pymcl/ai/McpException;

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v9, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    const-string v10, " \u6ca1\u6709\u8fd4\u56de\u7ed3\u679c"

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-direct {v8, v9}, Lcom/pymcl/ai/McpException;-><init>(Ljava/lang/String;)V

    .end local v5    # "id":J
    .end local v7    # "body":Ljava/lang/String;
    .end local v15    # "r":Lcom/pymcl/ai/McpHttp$Resp;
    .end local p1    # "method":Ljava/lang/String;
    .end local p2    # "params":Ljava/util/Map;
    throw v8

    .line 340
    .end local v0    # "found":Lkotlin/jvm/internal/Ref$ObjectRef;
    .end local v4    # "p":Lcom/pymcl/ai/SseParser;
    .restart local v5    # "id":J
    .restart local v7    # "body":Ljava/lang/String;
    .restart local v15    # "r":Lcom/pymcl/ai/McpHttp$Resp;
    .restart local p1    # "method":Ljava/lang/String;
    .restart local p2    # "params":Ljava/util/Map;
    :cond_b
    new-instance v0, Lcom/pymcl/ai/McpClient$$ExternalSyntheticLambda3;

    invoke-direct {v0, v15}, Lcom/pymcl/ai/McpClient$$ExternalSyntheticLambda3;-><init>(Lcom/pymcl/ai/McpHttp$Resp;)V

    invoke-static {v0}, Lkotlin/sequences/SequencesKt;->generateSequence(Lkotlin/jvm/functions/Function0;)Lkotlin/sequences/Sequence;

    move-result-object v17

    const-string v0, "\n"

    move-object/from16 v18, v0

    check-cast v18, Ljava/lang/CharSequence;

    const/16 v24, 0x3e

    const/16 v25, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    invoke-static/range {v17 .. v25}, Lkotlin/sequences/SequencesKt;->joinToString$default(Lkotlin/sequences/Sequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 341
    .local v0, "txt":Ljava/lang/String;
    sget-object v8, Lcom/pymcl/core/util/Json;->INSTANCE:Lcom/pymcl/core/util/Json;

    invoke-virtual {v8, v0}, Lcom/pymcl/core/util/Json;->parse(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v8

    .line 342
    .local v8, "v":Ljava/lang/Object;
    instance-of v9, v8, Ljava/util/List;

    if-eqz v9, :cond_14

    move-object v9, v8

    check-cast v9, Ljava/lang/Iterable;

    .local v9, "$this$mapNotNull$iv":Ljava/lang/Iterable;
    const/4 v12, 0x0

    .line 556
    .local v12, "$i$f$mapNotNull":I
    new-instance v13, Ljava/util/ArrayList;

    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    check-cast v13, Ljava/util/Collection;

    .local v13, "destination$iv$iv":Ljava/util/Collection;
    move-object v14, v9

    .local v14, "$this$mapNotNullTo$iv$iv":Ljava/lang/Iterable;
    const/16 v17, 0x0

    .line 565
    .local v17, "$i$f$mapNotNullTo":I
    move-object/from16 v18, v14

    .local v18, "$this$forEach$iv$iv$iv":Ljava/lang/Iterable;
    const/16 v19, 0x0

    .line 566
    .local v19, "$i$f$forEach":I
    invoke-interface/range {v18 .. v18}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v20

    :goto_6
    invoke-interface/range {v20 .. v20}, Ljava/util/Iterator;->hasNext()Z

    move-result v21

    if-eqz v21, :cond_d

    invoke-interface/range {v20 .. v20}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v21

    .local v21, "element$iv$iv$iv":Ljava/lang/Object;
    move-object/from16 v22, v21

    .local v22, "element$iv$iv":Ljava/lang/Object;
    const/16 v23, 0x0

    .line 565
    .local v23, "$i$a$-forEach-CollectionsKt___CollectionsKt$mapNotNullTo$1$iv$iv":I
    move-object/from16 v24, v22

    .local v24, "it":Ljava/lang/Object;
    const/16 v25, 0x0

    .line 342
    .local v25, "$i$a$-mapNotNull-McpClient$rpc$o$1":I
    invoke-static/range {v24 .. v24}, Lcom/pymcl/core/util/JsonKt;->o(Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v26

    .line 565
    .end local v24    # "it":Ljava/lang/Object;
    .end local v25    # "$i$a$-mapNotNull-McpClient$rpc$o$1":I
    if-eqz v26, :cond_c

    move-object/from16 v24, v26

    .line 567
    .local v24, "it$iv$iv":Ljava/lang/Object;
    const/16 v25, 0x0

    .line 565
    .local v25, "$i$a$-let-CollectionsKt___CollectionsKt$mapNotNullTo$1$1$iv$iv":I
    move-object/from16 v4, v24

    .end local v24    # "it$iv$iv":Ljava/lang/Object;
    .local v4, "it$iv$iv":Ljava/lang/Object;
    invoke-interface {v13, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 566
    .end local v4    # "it$iv$iv":Ljava/lang/Object;
    .end local v22    # "element$iv$iv":Ljava/lang/Object;
    .end local v23    # "$i$a$-forEach-CollectionsKt___CollectionsKt$mapNotNullTo$1$iv$iv":I
    .end local v25    # "$i$a$-let-CollectionsKt___CollectionsKt$mapNotNullTo$1$1$iv$iv":I
    :cond_c
    const/4 v4, 0x0

    .end local v21    # "element$iv$iv$iv":Ljava/lang/Object;
    goto :goto_6

    .line 568
    :cond_d
    nop

    .line 569
    .end local v18    # "$this$forEach$iv$iv$iv":Ljava/lang/Iterable;
    .end local v19    # "$i$f$forEach":I
    nop

    .end local v13    # "destination$iv$iv":Ljava/util/Collection;
    .end local v14    # "$this$mapNotNullTo$iv$iv":Ljava/lang/Iterable;
    .end local v17    # "$i$f$mapNotNullTo":I
    move-object v4, v13

    check-cast v4, Ljava/util/List;

    .line 556
    nop

    .line 342
    .end local v9    # "$this$mapNotNull$iv":Ljava/lang/Iterable;
    .end local v12    # "$i$f$mapNotNull":I
    check-cast v4, Ljava/lang/Iterable;

    .local v4, "$this$filter$iv":Ljava/lang/Iterable;
    const/4 v9, 0x0

    .line 570
    .local v9, "$i$f$filter":I
    new-instance v12, Ljava/util/ArrayList;

    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    check-cast v12, Ljava/util/Collection;

    .local v12, "destination$iv$iv":Ljava/util/Collection;
    move-object v13, v4

    .local v13, "$this$filterTo$iv$iv":Ljava/lang/Iterable;
    const/4 v14, 0x0

    .line 571
    .local v14, "$i$f$filterTo":I
    invoke-interface {v13}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v17

    :goto_7
    invoke-interface/range {v17 .. v17}, Ljava/util/Iterator;->hasNext()Z

    move-result v18

    if-eqz v18, :cond_f

    invoke-interface/range {v17 .. v17}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v18

    move-object/from16 v19, v18

    .local v19, "element$iv$iv":Ljava/lang/Object;
    move-object/from16 v18, v19

    check-cast v18, Ljava/util/Map;

    move-object/from16 v20, v18

    .local v20, "it":Ljava/util/Map;
    const/16 v18, 0x0

    .line 342
    .local v18, "$i$a$-filter-McpClient$rpc$o$2":I
    move-object/from16 v10, v20

    .end local v20    # "it":Ljava/util/Map;
    .local v10, "it":Ljava/util/Map;
    invoke-virtual {v1, v10}, Lcom/pymcl/ai/McpClient;->handleIncoming(Ljava/util/Map;)Z

    move-result v20

    .line 571
    .end local v10    # "it":Ljava/util/Map;
    .end local v18    # "$i$a$-filter-McpClient$rpc$o$2":I
    if-nez v20, :cond_e

    move-object/from16 v10, v19

    .end local v19    # "element$iv$iv":Ljava/lang/Object;
    .local v10, "element$iv$iv":Ljava/lang/Object;
    invoke-interface {v12, v10}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_8

    .end local v10    # "element$iv$iv":Ljava/lang/Object;
    .restart local v19    # "element$iv$iv":Ljava/lang/Object;
    :cond_e
    move-object/from16 v10, v19

    .end local v19    # "element$iv$iv":Ljava/lang/Object;
    .restart local v10    # "element$iv$iv":Ljava/lang/Object;
    :goto_8
    const/4 v10, 0x0

    goto :goto_7

    .line 572
    .end local v10    # "element$iv$iv":Ljava/lang/Object;
    :cond_f
    nop

    .end local v12    # "destination$iv$iv":Ljava/util/Collection;
    .end local v13    # "$this$filterTo$iv$iv":Ljava/lang/Iterable;
    .end local v14    # "$i$f$filterTo":I
    move-object v10, v12

    check-cast v10, Ljava/util/List;

    .line 570
    nop

    .line 342
    .end local v4    # "$this$filter$iv":Ljava/lang/Iterable;
    .end local v9    # "$i$f$filter":I
    check-cast v10, Ljava/lang/Iterable;

    .local v10, "$this$firstOrNull$iv":Ljava/lang/Iterable;
    const/4 v4, 0x0

    .line 573
    .local v4, "$i$f$firstOrNull":I
    invoke-interface {v10}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :cond_10
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_13

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    .local v12, "element$iv":Ljava/lang/Object;
    move-object v13, v12

    check-cast v13, Ljava/util/Map;

    .local v13, "it":Ljava/util/Map;
    const/4 v14, 0x0

    .line 342
    .local v14, "$i$a$-firstOrNull-McpClient$rpc$o$3":I
    invoke-static {v13, v11}, Lcom/pymcl/core/util/JsonKt;->long(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v17

    if-nez v17, :cond_12

    :cond_11
    goto :goto_9

    :cond_12
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Long;->longValue()J

    move-result-wide v17

    cmp-long v17, v17, v5

    if-nez v17, :cond_11

    const/4 v13, 0x1

    goto :goto_a

    :goto_9
    const/4 v13, 0x0

    .line 573
    .end local v13    # "it":Ljava/util/Map;
    .end local v14    # "$i$a$-firstOrNull-McpClient$rpc$o$3":I
    :goto_a
    if-eqz v13, :cond_10

    move-object v4, v12

    goto :goto_b

    .line 574
    .end local v12    # "element$iv":Ljava/lang/Object;
    :cond_13
    const/4 v4, 0x0

    .line 342
    .end local v4    # "$i$f$firstOrNull":I
    .end local v10    # "$this$firstOrNull$iv":Ljava/lang/Iterable;
    :goto_b
    check-cast v4, Ljava/util/Map;

    goto :goto_c

    :cond_14
    invoke-static {v8}, Lcom/pymcl/core/util/JsonKt;->o(Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v4

    :goto_c
    if-eqz v4, :cond_15

    .line 343
    .local v4, "o":Ljava/util/Map;
    invoke-direct {v1, v4}, Lcom/pymcl/ai/McpClient;->unwrap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v9
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 344
    .end local v0    # "txt":Ljava/lang/String;
    .end local v4    # "o":Ljava/util/Map;
    .end local v8    # "v":Ljava/lang/Object;
    invoke-virtual {v15}, Lcom/pymcl/ai/McpHttp$Resp;->getLines()Lcom/pymcl/ai/AiLineStream;

    move-result-object v10

    invoke-interface {v10}, Lcom/pymcl/ai/AiLineStream;->close()V

    .line 343
    .restart local v0    # "txt":Ljava/lang/String;
    .restart local v4    # "o":Ljava/util/Map;
    .restart local v8    # "v":Ljava/lang/Object;
    return-object v9

    .line 342
    .end local v4    # "o":Ljava/util/Map;
    :cond_15
    :try_start_5
    new-instance v4, Lcom/pymcl/ai/McpException;

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v9, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    const-string v10, " \u54cd\u5e94\u4e0d\u662f JSON-RPC"

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-direct {v4, v9}, Lcom/pymcl/ai/McpException;-><init>(Ljava/lang/String;)V

    .end local v5    # "id":J
    .end local v7    # "body":Ljava/lang/String;
    .end local v15    # "r":Lcom/pymcl/ai/McpHttp$Resp;
    .end local p1    # "method":Ljava/lang/String;
    .end local p2    # "params":Ljava/util/Map;
    throw v4

    .line 332
    .end local v0    # "txt":Ljava/lang/String;
    .end local v8    # "v":Ljava/lang/Object;
    .restart local v5    # "id":J
    .restart local v7    # "body":Ljava/lang/String;
    .restart local v15    # "r":Lcom/pymcl/ai/McpHttp$Resp;
    .restart local p1    # "method":Ljava/lang/String;
    .restart local p2    # "params":Ljava/util/Map;
    :cond_16
    new-instance v0, Lcom/pymcl/ai/McpException;

    invoke-virtual {v15}, Lcom/pymcl/ai/McpHttp$Resp;->getCode()I

    move-result v4

    new-instance v9, Lcom/pymcl/ai/McpClient$$ExternalSyntheticLambda1;

    invoke-direct {v9, v15}, Lcom/pymcl/ai/McpClient$$ExternalSyntheticLambda1;-><init>(Lcom/pymcl/ai/McpHttp$Resp;)V

    invoke-static {v9}, Lkotlin/sequences/SequencesKt;->generateSequence(Lkotlin/jvm/functions/Function0;)Lkotlin/sequences/Sequence;

    move-result-object v9

    const/4 v10, 0x5

    invoke-static {v9, v10}, Lkotlin/sequences/SequencesKt;->take(Lkotlin/sequences/Sequence;I)Lkotlin/sequences/Sequence;

    move-result-object v16

    const-string v9, " "

    move-object/from16 v17, v9

    check-cast v17, Ljava/lang/CharSequence;

    const/16 v23, 0x3e

    const/16 v24, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    invoke-static/range {v16 .. v24}, Lkotlin/sequences/SequencesKt;->joinToString$default(Lkotlin/sequences/Sequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v9

    invoke-static {v9, v14}, Lkotlin/text/StringsKt;->take(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v9

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v8, ": "

    invoke-virtual {v4, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v0, v4}, Lcom/pymcl/ai/McpException;-><init>(Ljava/lang/String;)V

    .end local v5    # "id":J
    .end local v7    # "body":Ljava/lang/String;
    .end local v15    # "r":Lcom/pymcl/ai/McpHttp$Resp;
    .end local p1    # "method":Ljava/lang/String;
    .end local p2    # "params":Ljava/util/Map;
    throw v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 343
    .restart local v5    # "id":J
    .restart local v7    # "body":Ljava/lang/String;
    .restart local v15    # "r":Lcom/pymcl/ai/McpHttp$Resp;
    .restart local p1    # "method":Ljava/lang/String;
    .restart local p2    # "params":Ljava/util/Map;
    :catchall_1
    move-exception v0

    invoke-virtual {v15}, Lcom/pymcl/ai/McpHttp$Resp;->getLines()Lcom/pymcl/ai/AiLineStream;

    move-result-object v4

    invoke-interface {v4}, Lcom/pymcl/ai/AiLineStream;->close()V

    throw v0
.end method

.method public final setOnNotification(Lkotlin/jvm/functions/Function1;)V
    .locals 0
    .param p1, "<set-?>"    # Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 166
    iput-object p1, p0, Lcom/pymcl/ai/McpClient;->onNotification:Lkotlin/jvm/functions/Function1;

    return-void
.end method

.method public final startListener()Z
    .locals 5

    .line 199
    iget-object v0, p0, Lcom/pymcl/ai/McpClient;->config:Lcom/pymcl/ai/McpServerConfig;

    invoke-virtual {v0}, Lcom/pymcl/ai/McpServerConfig;->getType()Ljava/lang/String;

    move-result-object v0

    const-string v1, "http"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Lcom/pymcl/ai/McpClient;->closed:Z

    if-nez v0, :cond_1

    sget-object v0, Lcom/pymcl/ai/McpNotify;->INSTANCE:Lcom/pymcl/ai/McpNotify;

    iget-object v1, p0, Lcom/pymcl/ai/McpClient;->capabilities:Ljava/util/Map;

    invoke-virtual {v0, v1}, Lcom/pymcl/ai/McpNotify;->wantsListener(Ljava/util/Map;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/pymcl/ai/McpClient;->listenerState:Ljava/lang/String;

    const-string v1, "listening"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/pymcl/ai/McpClient;->listenerState:Ljava/lang/String;

    const-string v2, "unsupported"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 200
    :cond_0
    iput-object v1, p0, Lcom/pymcl/ai/McpClient;->listenerState:Ljava/lang/String;

    .line 201
    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lcom/pymcl/ai/McpClient$$ExternalSyntheticLambda0;

    invoke-direct {v1, p0}, Lcom/pymcl/ai/McpClient$$ExternalSyntheticLambda0;-><init>(Lcom/pymcl/ai/McpClient;)V

    .line 219
    iget-object v2, p0, Lcom/pymcl/ai/McpClient;->config:Lcom/pymcl/ai/McpServerConfig;

    invoke-virtual {v2}, Lcom/pymcl/ai/McpServerConfig;->getName()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "mcp-listen-"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 201
    invoke-direct {v0, v1, v2}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V

    .line 220
    .local v0, "t":Ljava/lang/Thread;
    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/lang/Thread;->setDaemon(Z)V

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 221
    return v1

    .line 199
    .end local v0    # "t":Ljava/lang/Thread;
    :cond_1
    :goto_0
    const/4 v0, 0x0

    return v0
.end method

.method public final subscribe(Ljava/lang/String;)Lcom/pymcl/ai/ToolOutput;
    .locals 4
    .param p1, "uri"    # Ljava/lang/String;

    const-string v0, "uri"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 228
    invoke-virtual {p0}, Lcom/pymcl/ai/McpClient;->getHasSubscribe()Z

    move-result v1

    if-nez v1, :cond_0

    sget-object v0, Lcom/pymcl/ai/ToolOutput;->Companion:Lcom/pymcl/ai/ToolOutput$Companion;

    iget-object v1, p0, Lcom/pymcl/ai/McpClient;->config:Lcom/pymcl/ai/McpServerConfig;

    invoke-virtual {v1}, Lcom/pymcl/ai/McpServerConfig;->getName()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\u670d\u52a1\u5668 "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " \u4e0d\u652f\u6301\u8ba2\u9605\u8d44\u6e90\uff08resources.subscribe\uff09"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/pymcl/ai/ToolOutput$Companion;->err(Ljava/lang/String;)Lcom/pymcl/ai/ToolOutput;

    move-result-object v0

    return-object v0

    .line 229
    :cond_0
    move-object v1, p1

    check-cast v1, Ljava/lang/CharSequence;

    invoke-static {v1}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_1

    sget-object v0, Lcom/pymcl/ai/ToolOutput;->Companion:Lcom/pymcl/ai/ToolOutput$Companion;

    const-string v1, "\u7f3a\u5c11 uri"

    invoke-virtual {v0, v1}, Lcom/pymcl/ai/ToolOutput$Companion;->err(Ljava/lang/String;)Lcom/pymcl/ai/ToolOutput;

    move-result-object v0

    return-object v0

    .line 230
    :cond_1
    const/4 v1, 0x1

    new-array v2, v1, [Lkotlin/Pair;

    const/4 v3, 0x0

    invoke-static {v0, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    aput-object v0, v2, v3

    invoke-static {v2}, Lcom/pymcl/core/util/JsonKt;->jobj([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v0

    const-string v2, "resources/subscribe"

    invoke-virtual {p0, v2, v0}, Lcom/pymcl/ai/McpClient;->rpc(Ljava/lang/String;Ljava/util/Map;)Ljava/util/Map;

    .line 231
    new-instance v0, Lcom/pymcl/ai/ToolOutput;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\u5df2\u8ba2\u9605 "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "\uff1a\u8d44\u6e90\u6709\u66f4\u65b0\u65f6\u4f1a\u5728\u4e0b\u4e00\u8f6e\u63d0\u793a\u4f60"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2, v1}, Lcom/pymcl/ai/ToolOutput;-><init>(ZLjava/lang/String;Z)V

    return-object v0
.end method

.method public final unsubscribe(Ljava/lang/String;)Lcom/pymcl/ai/ToolOutput;
    .locals 4
    .param p1, "uri"    # Ljava/lang/String;

    const-string v0, "uri"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 235
    invoke-virtual {p0}, Lcom/pymcl/ai/McpClient;->getHasSubscribe()Z

    move-result v1

    if-nez v1, :cond_0

    sget-object v0, Lcom/pymcl/ai/ToolOutput;->Companion:Lcom/pymcl/ai/ToolOutput$Companion;

    iget-object v1, p0, Lcom/pymcl/ai/McpClient;->config:Lcom/pymcl/ai/McpServerConfig;

    invoke-virtual {v1}, Lcom/pymcl/ai/McpServerConfig;->getName()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\u670d\u52a1\u5668 "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " \u4e0d\u652f\u6301\u8ba2\u9605\u8d44\u6e90\uff08resources.subscribe\uff09"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/pymcl/ai/ToolOutput$Companion;->err(Ljava/lang/String;)Lcom/pymcl/ai/ToolOutput;

    move-result-object v0

    return-object v0

    .line 236
    :cond_0
    move-object v1, p1

    check-cast v1, Ljava/lang/CharSequence;

    invoke-static {v1}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_1

    sget-object v0, Lcom/pymcl/ai/ToolOutput;->Companion:Lcom/pymcl/ai/ToolOutput$Companion;

    const-string v1, "\u7f3a\u5c11 uri"

    invoke-virtual {v0, v1}, Lcom/pymcl/ai/ToolOutput$Companion;->err(Ljava/lang/String;)Lcom/pymcl/ai/ToolOutput;

    move-result-object v0

    return-object v0

    .line 237
    :cond_1
    const/4 v1, 0x1

    new-array v2, v1, [Lkotlin/Pair;

    const/4 v3, 0x0

    invoke-static {v0, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    aput-object v0, v2, v3

    invoke-static {v2}, Lcom/pymcl/core/util/JsonKt;->jobj([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v0

    const-string v2, "resources/unsubscribe"

    invoke-virtual {p0, v2, v0}, Lcom/pymcl/ai/McpClient;->rpc(Ljava/lang/String;Ljava/util/Map;)Ljava/util/Map;

    .line 238
    iget-object v0, p0, Lcom/pymcl/ai/McpClient;->changes:Lcom/pymcl/ai/McpChangeSet;

    invoke-virtual {v0, p1}, Lcom/pymcl/ai/McpChangeSet;->clearUpdated(Ljava/lang/String;)V

    .line 239
    new-instance v0, Lcom/pymcl/ai/ToolOutput;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\u5df2\u53d6\u6d88\u8ba2\u9605 "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2, v1}, Lcom/pymcl/ai/ToolOutput;-><init>(ZLjava/lang/String;Z)V

    return-object v0
.end method
