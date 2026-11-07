.class public final Lcom/pymcl/core/download/DownloadManager;
.super Ljava/lang/Object;
.source "DownloadManager.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/pymcl/core/download/DownloadManager$Companion;,
        Lcom/pymcl/core/download/DownloadManager$NoSegment;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nDownloadManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DownloadManager.kt\ncom/pymcl/core/download/DownloadManager\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,208:1\n204#1,3:210\n204#1,3:224\n1#2:209\n1739#3:213\n1814#3,3:214\n2068#3,2:217\n296#3,2:219\n1960#3,3:221\n*S KotlinDebug\n*F\n+ 1 DownloadManager.kt\ncom/pymcl/core/download/DownloadManager\n*L\n167#1:210,3\n184#1:224,3\n177#1:213\n177#1:214,3\n190#1:217,2\n191#1:219,2\n192#1:221,3\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010\u0002\n\u0002\u0008\u000f\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010$\n\u0002\u0008\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\u0008\u0003\u0018\u0000 H2\u00020\u0001:\u0002HIB]\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0005\u0012\u000e\u0008\u0002\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0014\u0008\u0002\u0010\u000c\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u001a\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0*2\u0006\u0010+\u001a\u00020\u000bJ<\u0010,\u001a\u00020\u000f2\u0006\u0010-\u001a\u00020\u000b2\u000c\u0010.\u001a\u0008\u0012\u0004\u0012\u0002000/2\u0016\u0008\u0002\u00101\u001a\u0010\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u000f\u0018\u00010\rH\u0086@\u00a2\u0006\u0002\u00102J\u000e\u00103\u001a\u0002042\u0006\u00105\u001a\u000200J\u0010\u00106\u001a\u00020\u000b2\u0006\u00107\u001a\u00020\u000bH\u0002J4\u00108\u001a\u00020\u000f2\u0006\u00105\u001a\u0002002\u0014\u0008\u0002\u00109\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000f0\r2\u000e\u0008\u0002\u0010:\u001a\u0008\u0012\u0004\u0012\u0002040\nJ\u0016\u0010;\u001a\u00020\u000f2\u000c\u0010:\u001a\u0008\u0012\u0004\u0012\u0002040\nH\u0002J2\u0010<\u001a\u00020\u000f2\u0006\u00105\u001a\u0002002\u0012\u00109\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000f0\r2\u000c\u0010:\u001a\u0008\u0012\u0004\u0012\u0002040\nH\u0002J<\u0010=\u001a\u00020\u000e2\u0006\u0010+\u001a\u00020\u000b2\u0006\u0010>\u001a\u00020?2\u0012\u00109\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000f0\r2\u000e\u0008\u0002\u0010:\u001a\u0008\u0012\u0004\u0012\u0002040\nH\u0002JD\u0010@\u001a\u00020\u000f2\u0006\u0010+\u001a\u00020\u000b2\u0006\u0010>\u001a\u00020?2\u0006\u0010A\u001a\u00020\u000e2\u0012\u00109\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000f0\r2\u000e\u0008\u0002\u0010:\u001a\u0008\u0012\u0004\u0012\u0002040\nH\u0002JU\u0010B\u001a\u00020\u000f2\u0006\u0010C\u001a\u00020D2\u001e\u0010E\u001a\u001a\u0012\u0004\u0012\u00020G\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000f0F2\u0012\u00109\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000f0\r2\u000e\u0008\u0008\u0010:\u001a\u0008\u0012\u0004\u0012\u0002040\nH\u0082\u0008R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0012\u0010\u0013\"\u0004\u0008\u0014\u0010\u0015R\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0016\u0010\u0013\"\u0004\u0008\u0017\u0010\u0015R\u001a\u0010\u0008\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0018\u0010\u0013\"\u0004\u0008\u0019\u0010\u0015R \u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u001a\u0010\u001b\"\u0004\u0008\u001c\u0010\u001dR\u001a\u0010\u000c\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u001e\u001a\u00020\u001f\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008 \u0010!R\u0014\u0010\"\u001a\u0008\u0012\u0004\u0012\u00020$0#X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010%\u001a\u0008\u0012\u0004\u0012\u00020$0&\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\'\u0010(\u00a8\u0006J"
    }
    d2 = {
        "Lcom/pymcl/core/download/DownloadManager;",
        "",
        "http",
        "Lcom/pymcl/core/net/Http;",
        "threads",
        "",
        "segments",
        "limitKbps",
        "retries",
        "curseforgeKey",
        "Lkotlin/Function0;",
        "",
        "sleeper",
        "Lkotlin/Function1;",
        "",
        "",
        "<init>",
        "(Lcom/pymcl/core/net/Http;IIIILkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V",
        "getThreads",
        "()I",
        "setThreads",
        "(I)V",
        "getSegments",
        "setSegments",
        "getRetries",
        "setRetries",
        "getCurseforgeKey",
        "()Lkotlin/jvm/functions/Function0;",
        "setCurseforgeKey",
        "(Lkotlin/jvm/functions/Function0;)V",
        "limiter",
        "Lcom/pymcl/core/download/RateLimiter;",
        "getLimiter",
        "()Lcom/pymcl/core/download/RateLimiter;",
        "_progress",
        "Lkotlinx/coroutines/flow/MutableStateFlow;",
        "Lcom/pymcl/core/download/DownloadProgress;",
        "progress",
        "Lkotlinx/coroutines/flow/StateFlow;",
        "getProgress",
        "()Lkotlinx/coroutines/flow/StateFlow;",
        "headersFor",
        "",
        "url",
        "downloadAll",
        "name",
        "items",
        "",
        "Lcom/pymcl/core/download/DownloadItem;",
        "onProgress",
        "(Ljava/lang/String;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "isValid",
        "",
        "item",
        "algoOf",
        "h",
        "download",
        "onBytes",
        "isCancelled",
        "checkCancel",
        "downloadLocked",
        "downloadSingle",
        "out",
        "Ljava/io/File;",
        "downloadSegmented",
        "size",
        "pump",
        "i",
        "Ljava/io/InputStream;",
        "write",
        "Lkotlin/Function3;",
        "",
        "Companion",
        "NoSegment",
        "PyMCL-Android:core"
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
.field public static final Companion:Lcom/pymcl/core/download/DownloadManager$Companion;

.field public static final SEG_MIN:J = 0x800000L

.field private static final destLocks:Ljava/util/concurrent/ConcurrentHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentHashMap<",
            "Ljava/lang/String;",
            "Ljava/util/concurrent/locks/ReentrantLock;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final _progress:Lkotlinx/coroutines/flow/MutableStateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/MutableStateFlow<",
            "Lcom/pymcl/core/download/DownloadProgress;",
            ">;"
        }
    .end annotation
.end field

.field private curseforgeKey:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final http:Lcom/pymcl/core/net/Http;

.field private final limiter:Lcom/pymcl/core/download/RateLimiter;

.field private final progress:Lkotlinx/coroutines/flow/StateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Lcom/pymcl/core/download/DownloadProgress;",
            ">;"
        }
    .end annotation
.end field

.field private retries:I

.field private segments:I

.field private final sleeper:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Ljava/lang/Long;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field private threads:I


# direct methods
.method public static synthetic $r8$lambda$ILd_qD6_dXNl0uWXrfTW2nEYu-0()Z
    .locals 1

    invoke-static {}, Lcom/pymcl/core/download/DownloadManager;->downloadSegmented$lambda$0()Z

    move-result v0

    return v0
.end method

.method public static synthetic $r8$lambda$Qn5x3JhCoNX_goITQx4WgbgOy6E(J)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/pymcl/core/download/DownloadManager;->_init_$lambda$1(J)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$QwStoZF3oxu123ySWw8GP-FQK_w(I)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/pymcl/core/download/DownloadManager;->download$lambda$0(I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$XjASQZQ95HyeEGibSj4wPNJhadU()Z
    .locals 1

    invoke-static {}, Lcom/pymcl/core/download/DownloadManager;->downloadSingle$lambda$0()Z

    move-result v0

    return v0
.end method

.method public static synthetic $r8$lambda$fTN-eVYHK2ick5pmW3SOAn5TB0U()Z
    .locals 1

    invoke-static {}, Lcom/pymcl/core/download/DownloadManager;->download$lambda$1()Z

    move-result v0

    return v0
.end method

.method public static synthetic $r8$lambda$lhXc-H1bJyY3VLbWwPZ0f0NiDSk(Ljava/util/concurrent/atomic/AtomicLong;Lkotlin/jvm/functions/Function1;I)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/pymcl/core/download/DownloadManager;->downloadLocked$lambda$0(Ljava/util/concurrent/atomic/AtomicLong;Lkotlin/jvm/functions/Function1;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$nzzqnaqO0koVIjSLukibBtVUbRA(Lcom/pymcl/core/download/DownloadManager;Ljava/lang/String;JJLjava/io/File;Ljava/util/List;Lkotlin/jvm/functions/Function0;Ljava/util/concurrent/atomic/AtomicLong;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    invoke-static/range {p0 .. p10}, Lcom/pymcl/core/download/DownloadManager;->downloadSegmented$lambda$2$0(Lcom/pymcl/core/download/DownloadManager;Ljava/lang/String;JJLjava/io/File;Ljava/util/List;Lkotlin/jvm/functions/Function0;Ljava/util/concurrent/atomic/AtomicLong;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public static synthetic $r8$lambda$rR4rXrDcpK8Cr-a95dGku5Lt2eQ()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lcom/pymcl/core/download/DownloadManager;->_init_$lambda$0()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/pymcl/core/download/DownloadManager$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/pymcl/core/download/DownloadManager$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/pymcl/core/download/DownloadManager;->Companion:Lcom/pymcl/core/download/DownloadManager$Companion;

    .line 67
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    sput-object v0, Lcom/pymcl/core/download/DownloadManager;->destLocks:Ljava/util/concurrent/ConcurrentHashMap;

    return-void
.end method

.method public constructor <init>(Lcom/pymcl/core/net/Http;IIIILkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V
    .locals 25
    .param p1, "http"    # Lcom/pymcl/core/net/Http;
    .param p2, "threads"    # I
    .param p3, "segments"    # I
    .param p4, "limitKbps"    # I
    .param p5, "retries"    # I
    .param p6, "curseforgeKey"    # Lkotlin/jvm/functions/Function0;
    .param p7, "sleeper"    # Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/pymcl/core/net/Http;",
            "IIII",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/String;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Long;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p6

    move-object/from16 v3, p7

    const-string v4, "http"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "curseforgeKey"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "sleeper"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 55
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 56
    iput-object v1, v0, Lcom/pymcl/core/download/DownloadManager;->http:Lcom/pymcl/core/net/Http;

    .line 57
    move/from16 v4, p2

    iput v4, v0, Lcom/pymcl/core/download/DownloadManager;->threads:I

    .line 58
    move/from16 v5, p3

    iput v5, v0, Lcom/pymcl/core/download/DownloadManager;->segments:I

    .line 60
    move/from16 v6, p5

    iput v6, v0, Lcom/pymcl/core/download/DownloadManager;->retries:I

    .line 61
    iput-object v2, v0, Lcom/pymcl/core/download/DownloadManager;->curseforgeKey:Lkotlin/jvm/functions/Function0;

    .line 62
    iput-object v3, v0, Lcom/pymcl/core/download/DownloadManager;->sleeper:Lkotlin/jvm/functions/Function1;

    .line 70
    new-instance v7, Lcom/pymcl/core/download/RateLimiter;

    move/from16 v8, p4

    invoke-direct {v7, v8}, Lcom/pymcl/core/download/RateLimiter;-><init>(I)V

    iput-object v7, v0, Lcom/pymcl/core/download/DownloadManager;->limiter:Lcom/pymcl/core/download/RateLimiter;

    .line 71
    new-instance v9, Lcom/pymcl/core/download/DownloadProgress;

    const/16 v23, 0x3ff

    const/16 v24, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const-wide/16 v14, 0x0

    const-wide/16 v16, 0x0

    const-wide/16 v18, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    invoke-direct/range {v9 .. v24}, Lcom/pymcl/core/download/DownloadProgress;-><init>(Ljava/lang/String;IIIJJJLjava/lang/String;ZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v9}, Lkotlinx/coroutines/flow/StateFlowKt;->MutableStateFlow(Ljava/lang/Object;)Lkotlinx/coroutines/flow/MutableStateFlow;

    move-result-object v7

    iput-object v7, v0, Lcom/pymcl/core/download/DownloadManager;->_progress:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 72
    iget-object v7, v0, Lcom/pymcl/core/download/DownloadManager;->_progress:Lkotlinx/coroutines/flow/MutableStateFlow;

    invoke-static {v7}, Lkotlinx/coroutines/flow/FlowKt;->asStateFlow(Lkotlinx/coroutines/flow/MutableStateFlow;)Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v7

    iput-object v7, v0, Lcom/pymcl/core/download/DownloadManager;->progress:Lkotlinx/coroutines/flow/StateFlow;

    .line 55
    return-void
.end method

.method public synthetic constructor <init>(Lcom/pymcl/core/net/Http;IIIILkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 6

    .line 55
    and-int/lit8 v0, p8, 0x2

    if-eqz v0, :cond_0

    .line 57
    const/16 v0, 0x8

    goto :goto_0

    .line 55
    :cond_0
    move v0, p2

    :goto_0
    and-int/lit8 v1, p8, 0x4

    if-eqz v1, :cond_1

    .line 58
    const/4 v1, 0x4

    goto :goto_1

    .line 55
    :cond_1
    move v1, p3

    :goto_1
    and-int/lit8 v2, p8, 0x8

    if-eqz v2, :cond_2

    .line 59
    const/4 v2, 0x0

    goto :goto_2

    .line 55
    :cond_2
    move v2, p4

    :goto_2
    and-int/lit8 v3, p8, 0x10

    if-eqz v3, :cond_3

    .line 60
    const/4 v3, 0x3

    goto :goto_3

    .line 55
    :cond_3
    move v3, p5

    :goto_3
    and-int/lit8 v4, p8, 0x20

    if-eqz v4, :cond_4

    .line 61
    new-instance v4, Lcom/pymcl/core/download/DownloadManager$$ExternalSyntheticLambda5;

    invoke-direct {v4}, Lcom/pymcl/core/download/DownloadManager$$ExternalSyntheticLambda5;-><init>()V

    goto :goto_4

    .line 55
    :cond_4
    move-object v4, p6

    :goto_4
    and-int/lit8 v5, p8, 0x40

    if-eqz v5, :cond_5

    .line 62
    new-instance v5, Lcom/pymcl/core/download/DownloadManager$$ExternalSyntheticLambda6;

    invoke-direct {v5}, Lcom/pymcl/core/download/DownloadManager$$ExternalSyntheticLambda6;-><init>()V

    goto :goto_5

    .line 55
    :cond_5
    move-object v5, p7

    :goto_5
    move-object p2, p0

    move-object p3, p1

    move p4, v0

    move p5, v1

    move p6, v2

    move p7, v3

    move-object p8, v4

    move-object p9, v5

    invoke-direct/range {p2 .. p9}, Lcom/pymcl/core/download/DownloadManager;-><init>(Lcom/pymcl/core/net/Http;IIIILkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V

    .line 63
    return-void
.end method

.method private static final _init_$lambda$0()Ljava/lang/String;
    .locals 1

    .line 61
    const-string v0, ""

    return-object v0
.end method

.method private static final _init_$lambda$1(J)Lkotlin/Unit;
    .locals 1
    .param p0, "it"    # J

    .line 62
    invoke-static {p0, p1}, Ljava/lang/Thread;->sleep(J)V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method public static final synthetic access$getDestLocks$cp()Ljava/util/concurrent/ConcurrentHashMap;
    .locals 1

    .line 55
    sget-object v0, Lcom/pymcl/core/download/DownloadManager;->destLocks:Ljava/util/concurrent/ConcurrentHashMap;

    return-object v0
.end method

.method public static final synthetic access$get_progress$p(Lcom/pymcl/core/download/DownloadManager;)Lkotlinx/coroutines/flow/MutableStateFlow;
    .locals 1
    .param p0, "$this"    # Lcom/pymcl/core/download/DownloadManager;

    .line 55
    iget-object v0, p0, Lcom/pymcl/core/download/DownloadManager;->_progress:Lkotlinx/coroutines/flow/MutableStateFlow;

    return-object v0
.end method

.method private final algoOf(Ljava/lang/String;)Ljava/lang/String;
    .locals 1
    .param p1, "h"    # Ljava/lang/String;

    .line 113
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    const-string v0, "SHA-1"

    goto :goto_0

    :sswitch_0
    const-string v0, "SHA-512"

    goto :goto_0

    :sswitch_1
    const-string v0, "SHA-256"

    goto :goto_0

    :sswitch_2
    const-string v0, "MD5"

    :goto_0
    return-object v0

    nop

    :sswitch_data_0
    .sparse-switch
        0x20 -> :sswitch_2
        0x40 -> :sswitch_1
        0x80 -> :sswitch_0
    .end sparse-switch
.end method

.method private final checkCancel(Lkotlin/jvm/functions/Function0;)V
    .locals 2
    .param p1, "isCancelled"    # Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    .line 130
    invoke-interface {p1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/util/concurrent/CancellationException;

    const-string v1, "\u4e0b\u8f7d\u5df2\u53d6\u6d88"

    invoke-direct {v0, v1}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static synthetic download$default(Lcom/pymcl/core/download/DownloadManager;Lcom/pymcl/core/download/DownloadItem;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;ILjava/lang/Object;)V
    .locals 0

    .line 120
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    new-instance p2, Lcom/pymcl/core/download/DownloadManager$$ExternalSyntheticLambda3;

    invoke-direct {p2}, Lcom/pymcl/core/download/DownloadManager$$ExternalSyntheticLambda3;-><init>()V

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    new-instance p3, Lcom/pymcl/core/download/DownloadManager$$ExternalSyntheticLambda4;

    invoke-direct {p3}, Lcom/pymcl/core/download/DownloadManager$$ExternalSyntheticLambda4;-><init>()V

    :cond_1
    invoke-virtual {p0, p1, p2, p3}, Lcom/pymcl/core/download/DownloadManager;->download(Lcom/pymcl/core/download/DownloadItem;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V

    return-void
.end method

.method private static final download$lambda$0(I)Lkotlin/Unit;
    .locals 1
    .param p0, "it"    # I

    .line 120
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method private static final download$lambda$1()Z
    .locals 1

    .line 120
    const/4 v0, 0x0

    return v0
.end method

.method public static synthetic downloadAll$default(Lcom/pymcl/core/download/DownloadManager;Ljava/lang/String;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 81
    and-int/lit8 p5, p5, 0x4

    if-eqz p5, :cond_0

    const/4 p3, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/pymcl/core/download/DownloadManager;->downloadAll(Ljava/lang/String;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final downloadLocked(Lcom/pymcl/core/download/DownloadItem;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V
    .locals 24
    .param p1, "item"    # Lcom/pymcl/core/download/DownloadItem;
    .param p2, "onBytes"    # Lkotlin/jvm/functions/Function1;
    .param p3, "isCancelled"    # Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/pymcl/core/download/DownloadItem;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    .line 133
    move-object/from16 v1, p0

    move-object/from16 v8, p2

    move-object/from16 v7, p3

    invoke-virtual/range {p1 .. p1}, Lcom/pymcl/core/download/DownloadItem;->getDest()Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    .line 134
    :cond_0
    new-instance v3, Ljava/io/File;

    invoke-virtual/range {p1 .. p1}, Lcom/pymcl/core/download/DownloadItem;->getDest()Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v0

    invoke-virtual/range {p1 .. p1}, Lcom/pymcl/core/download/DownloadItem;->getDest()Ljava/io/File;

    move-result-object v2

    invoke-virtual {v2}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v2

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v4, ".part"

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v3, v0, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 135
    .local v3, "part":Ljava/io/File;
    const/4 v2, 0x0

    .line 136
    .local v2, "last":Ljava/lang/Exception;
    nop

    .line 137
    :try_start_0
    invoke-virtual/range {p1 .. p1}, Lcom/pymcl/core/download/DownloadItem;->getUrls()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v15

    :goto_0
    invoke-interface {v15}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_d

    invoke-interface {v15}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    move-object v4, v0

    .local v4, "url":Ljava/lang/String;
    const/4 v0, 0x0

    .local v0, "attempt":I
    iget v10, v1, Lcom/pymcl/core/download/DownloadManager;->retries:I
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_17

    move v11, v0

    move-object/from16 v16, v2

    .end local v0    # "attempt":I
    .end local v2    # "last":Ljava/lang/Exception;
    .local v11, "attempt":I
    .local v16, "last":Ljava/lang/Exception;
    :goto_1
    if-ge v11, v10, :cond_c

    .line 138
    :try_start_1
    invoke-direct {v1, v7}, Lcom/pymcl/core/download/DownloadManager;->checkCancel(Lkotlin/jvm/functions/Function0;)V

    .line 139
    new-instance v0, Ljava/util/concurrent/atomic/AtomicLong;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicLong;-><init>()V
    :try_end_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_1 .. :try_end_1} :catch_16

    move-object v12, v0

    .line 140
    .local v12, "counted":Ljava/util/concurrent/atomic/AtomicLong;
    nop

    .line 141
    const/16 v17, 0x0

    const/4 v14, 0x1

    :try_start_2
    invoke-virtual {v3}, Ljava/io/File;->delete()Z

    .line 142
    new-instance v6, Lcom/pymcl/core/download/DownloadManager$$ExternalSyntheticLambda7;

    invoke-direct {v6, v12, v8}, Lcom/pymcl/core/download/DownloadManager$$ExternalSyntheticLambda7;-><init>(Ljava/util/concurrent/atomic/AtomicLong;Lkotlin/jvm/functions/Function1;)V

    .line 143
    .local v6, "counting":Lkotlin/jvm/functions/Function1;
    invoke-virtual/range {p1 .. p1}, Lcom/pymcl/core/download/DownloadItem;->getSize()Ljava/lang/Long;

    move-result-object v0
    :try_end_2
    .catch Ljava/util/concurrent/CancellationException; {:try_start_2 .. :try_end_2} :catch_15
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_14

    .line 144
    .local v0, "sz":Ljava/lang/Long;
    const-string v2, ": \u671f\u671b "

    if-eqz v0, :cond_1

    :try_start_3
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v18

    const-wide/32 v20, 0x800000

    cmp-long v5, v18, v20

    if-ltz v5, :cond_1

    iget v5, v1, Lcom/pymcl/core/download/DownloadManager;->segments:I
    :try_end_3
    .catch Ljava/util/concurrent/CancellationException; {:try_start_3 .. :try_end_3} :catch_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2

    if-le v5, v14, :cond_1

    move-object/from16 v18, v2

    move-object v2, v4

    .end local v4    # "url":Ljava/lang/String;
    .local v2, "url":Ljava/lang/String;
    :try_start_4
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    move-object/from16 v14, v18

    invoke-direct/range {v1 .. v7}, Lcom/pymcl/core/download/DownloadManager;->downloadSegmented(Ljava/lang/String;Ljava/io/File;JLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V
    :try_end_4
    .catch Ljava/util/concurrent/CancellationException; {:try_start_4 .. :try_end_4} :catch_1
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    move-object/from16 v21, v2

    move-object/from16 v22, v6

    goto/16 :goto_2

    .line 152
    .end local v0    # "sz":Ljava/lang/Long;
    .end local v6    # "counting":Lkotlin/jvm/functions/Function1;
    :catch_0
    move-exception v0

    move-object/from16 v21, v2

    move v2, v10

    move v4, v11

    move-object v5, v12

    const/16 v18, 0x0

    const/16 v19, 0x1

    const/16 v20, 0x2

    goto/16 :goto_a

    .line 151
    :catch_1
    move-exception v0

    move-object/from16 v21, v2

    move v4, v11

    move-object v5, v12

    goto/16 :goto_c

    .line 152
    .end local v2    # "url":Ljava/lang/String;
    .restart local v4    # "url":Ljava/lang/String;
    :catch_2
    move-exception v0

    move-object v2, v4

    move-object/from16 v21, v2

    move v2, v10

    move v4, v11

    move-object v5, v12

    const/16 v18, 0x0

    const/16 v19, 0x1

    const/16 v20, 0x2

    .end local v4    # "url":Ljava/lang/String;
    .restart local v2    # "url":Ljava/lang/String;
    goto/16 :goto_a

    .line 151
    .end local v2    # "url":Ljava/lang/String;
    .restart local v4    # "url":Ljava/lang/String;
    :catch_3
    move-exception v0

    move-object v2, v4

    move-object/from16 v21, v2

    move v4, v11

    move-object v5, v12

    .end local v4    # "url":Ljava/lang/String;
    .restart local v2    # "url":Ljava/lang/String;
    goto/16 :goto_c

    .line 144
    .end local v2    # "url":Ljava/lang/String;
    .restart local v0    # "sz":Ljava/lang/Long;
    .restart local v4    # "url":Ljava/lang/String;
    .restart local v6    # "counting":Lkotlin/jvm/functions/Function1;
    :cond_1
    move-object v14, v2

    move-object v2, v4

    .line 145
    .end local v4    # "url":Ljava/lang/String;
    .restart local v2    # "url":Ljava/lang/String;
    :try_start_5
    invoke-direct {v1, v2, v3, v6, v7}, Lcom/pymcl/core/download/DownloadManager;->downloadSingle(Ljava/lang/String;Ljava/io/File;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)J

    move-result-wide v4
    :try_end_5
    .catch Ljava/util/concurrent/CancellationException; {:try_start_5 .. :try_end_5} :catch_13
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_12

    .line 146
    .local v4, "got":J
    if-eqz v0, :cond_3

    :try_start_6
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v20

    const-wide/16 v22, 0x0

    cmp-long v18, v20, v22

    if-lez v18, :cond_3

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v20

    cmp-long v18, v4, v20

    if-nez v18, :cond_2

    move-object/from16 v21, v2

    move-object/from16 v22, v6

    goto :goto_2

    :cond_2
    new-instance v9, Lcom/pymcl/core/download/DownloadError;

    invoke-virtual/range {p1 .. p1}, Lcom/pymcl/core/download/DownloadItem;->getName()Ljava/lang/String;

    move-result-object v13
    :try_end_6
    .catch Ljava/util/concurrent/CancellationException; {:try_start_6 .. :try_end_6} :catch_5
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_4

    move-object/from16 v21, v2

    .end local v2    # "url":Ljava/lang/String;
    .local v21, "url":Ljava/lang/String;
    :try_start_7
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v22, v6

    .end local v6    # "counting":Lkotlin/jvm/functions/Function1;
    .local v22, "counting":Lkotlin/jvm/functions/Function1;
    const-string v6, "\u6587\u4ef6\u4e0d\u5b8c\u6574 "

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v6, " \u5b57\u8282\uff0c\u5b9e\u5f97 "

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v6, " \u5b57\u8282"

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v6, 0x2

    const/4 v13, 0x0

    invoke-direct {v9, v2, v13, v6, v13}, Lcom/pymcl/core/download/DownloadError;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .end local v3    # "part":Ljava/io/File;
    .end local v11    # "attempt":I
    .end local v12    # "counted":Ljava/util/concurrent/atomic/AtomicLong;
    .end local v16    # "last":Ljava/lang/Exception;
    .end local v21    # "url":Ljava/lang/String;
    .end local p1    # "item":Lcom/pymcl/core/download/DownloadItem;
    .end local p2    # "onBytes":Lkotlin/jvm/functions/Function1;
    .end local p3    # "isCancelled":Lkotlin/jvm/functions/Function0;
    throw v9
    :try_end_7
    .catch Ljava/util/concurrent/CancellationException; {:try_start_7 .. :try_end_7} :catch_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_6

    .line 152
    .end local v0    # "sz":Ljava/lang/Long;
    .end local v4    # "got":J
    .end local v22    # "counting":Lkotlin/jvm/functions/Function1;
    .restart local v2    # "url":Ljava/lang/String;
    .restart local v3    # "part":Ljava/io/File;
    .restart local v11    # "attempt":I
    .restart local v12    # "counted":Ljava/util/concurrent/atomic/AtomicLong;
    .restart local v16    # "last":Ljava/lang/Exception;
    .restart local p1    # "item":Lcom/pymcl/core/download/DownloadItem;
    .restart local p2    # "onBytes":Lkotlin/jvm/functions/Function1;
    .restart local p3    # "isCancelled":Lkotlin/jvm/functions/Function0;
    :catch_4
    move-exception v0

    move-object/from16 v21, v2

    move v2, v10

    move v4, v11

    move-object v5, v12

    const/16 v18, 0x0

    const/16 v19, 0x1

    const/16 v20, 0x2

    .end local v2    # "url":Ljava/lang/String;
    .restart local v21    # "url":Ljava/lang/String;
    goto/16 :goto_a

    .line 151
    .end local v21    # "url":Ljava/lang/String;
    .restart local v2    # "url":Ljava/lang/String;
    :catch_5
    move-exception v0

    move-object/from16 v21, v2

    move v4, v11

    move-object v5, v12

    .end local v2    # "url":Ljava/lang/String;
    .restart local v21    # "url":Ljava/lang/String;
    goto/16 :goto_c

    .line 146
    .end local v21    # "url":Ljava/lang/String;
    .restart local v0    # "sz":Ljava/lang/Long;
    .restart local v2    # "url":Ljava/lang/String;
    .restart local v4    # "got":J
    .restart local v6    # "counting":Lkotlin/jvm/functions/Function1;
    :cond_3
    move-object/from16 v21, v2

    move-object/from16 v22, v6

    .line 147
    .end local v2    # "url":Ljava/lang/String;
    .end local v4    # "got":J
    .end local v6    # "counting":Lkotlin/jvm/functions/Function1;
    .restart local v21    # "url":Ljava/lang/String;
    .restart local v22    # "counting":Lkotlin/jvm/functions/Function1;
    :goto_2
    :try_start_8
    invoke-virtual/range {p1 .. p1}, Lcom/pymcl/core/download/DownloadItem;->getHash()Ljava/lang/String;

    move-result-object v2

    check-cast v2, Ljava/lang/CharSequence;
    :try_end_8
    .catch Ljava/util/concurrent/CancellationException; {:try_start_8 .. :try_end_8} :catch_11
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_10

    if-eqz v2, :cond_5

    :try_start_9
    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    move-result v2
    :try_end_9
    .catch Ljava/util/concurrent/CancellationException; {:try_start_9 .. :try_end_9} :catch_7
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_6

    if-nez v2, :cond_4

    goto :goto_3

    :cond_4
    move/from16 v2, v17

    goto :goto_4

    .line 152
    .end local v0    # "sz":Ljava/lang/Long;
    .end local v22    # "counting":Lkotlin/jvm/functions/Function1;
    :catch_6
    move-exception v0

    move v2, v10

    move v4, v11

    move-object v5, v12

    const/16 v18, 0x0

    const/16 v19, 0x1

    const/16 v20, 0x2

    goto/16 :goto_a

    .line 151
    :catch_7
    move-exception v0

    move v4, v11

    move-object v5, v12

    goto/16 :goto_c

    .line 147
    .restart local v0    # "sz":Ljava/lang/Long;
    .restart local v22    # "counting":Lkotlin/jvm/functions/Function1;
    :cond_5
    :goto_3
    const/4 v2, 0x1

    :goto_4
    if-nez v2, :cond_7

    :try_start_a
    sget-object v2, Lcom/pymcl/core/util/FileUtil;->INSTANCE:Lcom/pymcl/core/util/FileUtil;

    invoke-virtual/range {p1 .. p1}, Lcom/pymcl/core/download/DownloadItem;->getHash()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v1, v4}, Lcom/pymcl/core/download/DownloadManager;->algoOf(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Lcom/pymcl/core/util/FileUtil;->hash(Ljava/io/File;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 148
    .local v2, "got":Ljava/lang/String;
    invoke-virtual/range {p1 .. p1}, Lcom/pymcl/core/download/DownloadItem;->getHash()Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x1

    invoke-static {v2, v4, v5}, Lkotlin/text/StringsKt;->equals(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v4

    if-eqz v4, :cond_6

    const/4 v6, 0x2

    const/4 v13, 0x0

    goto :goto_6

    :cond_6
    new-instance v4, Lcom/pymcl/core/download/DownloadError;

    invoke-virtual/range {p1 .. p1}, Lcom/pymcl/core/download/DownloadItem;->getName()Ljava/lang/String;

    move-result-object v6

    invoke-virtual/range {p1 .. p1}, Lcom/pymcl/core/download/DownloadItem;->getHash()Ljava/lang/String;

    move-result-object v9

    new-instance v13, Ljava/lang/StringBuilder;

    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "\u6821\u9a8c\u5931\u8d25 "

    invoke-virtual {v13, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    const-string v6, " \u5b9e\u5f97 "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5
    :try_end_a
    .catch Ljava/util/concurrent/CancellationException; {:try_start_a .. :try_end_a} :catch_7
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_9

    const/4 v6, 0x2

    const/4 v13, 0x0

    :try_start_b
    invoke-direct {v4, v5, v13, v6, v13}, Lcom/pymcl/core/download/DownloadError;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .end local v3    # "part":Ljava/io/File;
    .end local v11    # "attempt":I
    .end local v12    # "counted":Ljava/util/concurrent/atomic/AtomicLong;
    .end local v16    # "last":Ljava/lang/Exception;
    .end local v21    # "url":Ljava/lang/String;
    .end local p1    # "item":Lcom/pymcl/core/download/DownloadItem;
    .end local p2    # "onBytes":Lkotlin/jvm/functions/Function1;
    .end local p3    # "isCancelled":Lkotlin/jvm/functions/Function0;
    throw v4
    :try_end_b
    .catch Ljava/util/concurrent/CancellationException; {:try_start_b .. :try_end_b} :catch_7
    .catch Ljava/lang/Exception; {:try_start_b .. :try_end_b} :catch_8

    .line 152
    .end local v0    # "sz":Ljava/lang/Long;
    .end local v2    # "got":Ljava/lang/String;
    .end local v22    # "counting":Lkotlin/jvm/functions/Function1;
    .restart local v3    # "part":Ljava/io/File;
    .restart local v11    # "attempt":I
    .restart local v12    # "counted":Ljava/util/concurrent/atomic/AtomicLong;
    .restart local v16    # "last":Ljava/lang/Exception;
    .restart local v21    # "url":Ljava/lang/String;
    .restart local p1    # "item":Lcom/pymcl/core/download/DownloadItem;
    .restart local p2    # "onBytes":Lkotlin/jvm/functions/Function1;
    .restart local p3    # "isCancelled":Lkotlin/jvm/functions/Function0;
    :catch_8
    move-exception v0

    goto :goto_5

    :catch_9
    move-exception v0

    const/4 v6, 0x2

    const/4 v13, 0x0

    :goto_5
    move/from16 v20, v6

    move v2, v10

    move v4, v11

    move-object v5, v12

    move-object/from16 v18, v13

    const/16 v19, 0x1

    goto/16 :goto_a

    .line 147
    .restart local v0    # "sz":Ljava/lang/Long;
    .restart local v22    # "counting":Lkotlin/jvm/functions/Function1;
    :cond_7
    const/4 v6, 0x2

    const/4 v13, 0x0

    .line 149
    :goto_6
    :try_start_c
    invoke-virtual/range {p1 .. p1}, Lcom/pymcl/core/download/DownloadItem;->getDest()Ljava/io/File;

    move-result-object v2

    invoke-virtual {v2}, Ljava/io/File;->delete()Z

    invoke-virtual/range {p1 .. p1}, Lcom/pymcl/core/download/DownloadItem;->getDest()Ljava/io/File;

    move-result-object v2

    invoke-virtual {v3, v2}, Ljava/io/File;->renameTo(Ljava/io/File;)Z

    move-result v2
    :try_end_c
    .catch Ljava/util/concurrent/CancellationException; {:try_start_c .. :try_end_c} :catch_11
    .catch Ljava/lang/Exception; {:try_start_c .. :try_end_c} :catch_f

    if-nez v2, :cond_8

    move v2, v10

    :try_start_d
    invoke-virtual/range {p1 .. p1}, Lcom/pymcl/core/download/DownloadItem;->getDest()Ljava/io/File;

    move-result-object v10
    :try_end_d
    .catch Ljava/util/concurrent/CancellationException; {:try_start_d .. :try_end_d} :catch_11
    .catch Ljava/lang/Exception; {:try_start_d .. :try_end_d} :catch_e

    move-object/from16 v18, v13

    const/4 v13, 0x4

    const/4 v14, 0x0

    move v4, v11

    .end local v11    # "attempt":I
    .local v4, "attempt":I
    const/4 v11, 0x1

    move-object v5, v12

    .end local v12    # "counted":Ljava/util/concurrent/atomic/AtomicLong;
    .local v5, "counted":Ljava/util/concurrent/atomic/AtomicLong;
    const/4 v12, 0x0

    move-object v9, v3

    move/from16 v20, v6

    const/16 v19, 0x1

    .end local v3    # "part":Ljava/io/File;
    .local v9, "part":Ljava/io/File;
    :try_start_e
    invoke-static/range {v9 .. v14}, Lkotlin/io/FilesKt;->copyTo$default(Ljava/io/File;Ljava/io/File;ZIILjava/lang/Object;)Ljava/io/File;
    :try_end_e
    .catch Ljava/util/concurrent/CancellationException; {:try_start_e .. :try_end_e} :catch_d
    .catch Ljava/lang/Exception; {:try_start_e .. :try_end_e} :catch_c

    .end local v9    # "part":Ljava/io/File;
    .restart local v3    # "part":Ljava/io/File;
    :try_start_f
    invoke-virtual {v3}, Ljava/io/File;->delete()Z
    :try_end_f
    .catch Ljava/util/concurrent/CancellationException; {:try_start_f .. :try_end_f} :catch_b
    .catch Ljava/lang/Exception; {:try_start_f .. :try_end_f} :catch_a

    goto :goto_7

    .line 152
    .end local v0    # "sz":Ljava/lang/Long;
    .end local v22    # "counting":Lkotlin/jvm/functions/Function1;
    :catch_a
    move-exception v0

    goto/16 :goto_a

    .line 151
    :catch_b
    move-exception v0

    goto/16 :goto_c

    .line 152
    .end local v3    # "part":Ljava/io/File;
    .restart local v9    # "part":Ljava/io/File;
    :catch_c
    move-exception v0

    move-object v3, v9

    .end local v9    # "part":Ljava/io/File;
    .restart local v3    # "part":Ljava/io/File;
    goto/16 :goto_a

    .line 151
    .end local v3    # "part":Ljava/io/File;
    .restart local v9    # "part":Ljava/io/File;
    :catch_d
    move-exception v0

    move-object v3, v9

    .end local v9    # "part":Ljava/io/File;
    .restart local v3    # "part":Ljava/io/File;
    goto/16 :goto_c

    .line 152
    .end local v4    # "attempt":I
    .end local v5    # "counted":Ljava/util/concurrent/atomic/AtomicLong;
    .restart local v11    # "attempt":I
    .restart local v12    # "counted":Ljava/util/concurrent/atomic/AtomicLong;
    :catch_e
    move-exception v0

    move/from16 v20, v6

    goto :goto_8

    .line 149
    .restart local v0    # "sz":Ljava/lang/Long;
    .restart local v22    # "counting":Lkotlin/jvm/functions/Function1;
    :cond_8
    move v4, v11

    move-object v5, v12

    .line 150
    .end local v11    # "attempt":I
    .end local v12    # "counted":Ljava/util/concurrent/atomic/AtomicLong;
    .restart local v4    # "attempt":I
    .restart local v5    # "counted":Ljava/util/concurrent/atomic/AtomicLong;
    :goto_7
    return-void

    .line 152
    .end local v0    # "sz":Ljava/lang/Long;
    .end local v4    # "attempt":I
    .end local v5    # "counted":Ljava/util/concurrent/atomic/AtomicLong;
    .end local v22    # "counting":Lkotlin/jvm/functions/Function1;
    .restart local v11    # "attempt":I
    .restart local v12    # "counted":Ljava/util/concurrent/atomic/AtomicLong;
    :catch_f
    move-exception v0

    move/from16 v20, v6

    move v2, v10

    :goto_8
    move v4, v11

    move-object v5, v12

    move-object/from16 v18, v13

    const/16 v19, 0x1

    goto :goto_9

    :catch_10
    move-exception v0

    move v2, v10

    move v4, v11

    move-object v5, v12

    const/16 v18, 0x0

    const/16 v19, 0x1

    const/16 v20, 0x2

    .end local v11    # "attempt":I
    .end local v12    # "counted":Ljava/util/concurrent/atomic/AtomicLong;
    .restart local v4    # "attempt":I
    .restart local v5    # "counted":Ljava/util/concurrent/atomic/AtomicLong;
    :goto_9
    goto :goto_a

    .line 151
    .end local v4    # "attempt":I
    .end local v5    # "counted":Ljava/util/concurrent/atomic/AtomicLong;
    .restart local v11    # "attempt":I
    .restart local v12    # "counted":Ljava/util/concurrent/atomic/AtomicLong;
    :catch_11
    move-exception v0

    move v4, v11

    move-object v5, v12

    .end local v11    # "attempt":I
    .end local v12    # "counted":Ljava/util/concurrent/atomic/AtomicLong;
    .restart local v4    # "attempt":I
    .restart local v5    # "counted":Ljava/util/concurrent/atomic/AtomicLong;
    goto/16 :goto_c

    .line 152
    .end local v4    # "attempt":I
    .end local v5    # "counted":Ljava/util/concurrent/atomic/AtomicLong;
    .end local v21    # "url":Ljava/lang/String;
    .local v2, "url":Ljava/lang/String;
    .restart local v11    # "attempt":I
    .restart local v12    # "counted":Ljava/util/concurrent/atomic/AtomicLong;
    :catch_12
    move-exception v0

    move-object/from16 v21, v2

    move v2, v10

    move v4, v11

    move-object v5, v12

    const/16 v18, 0x0

    const/16 v19, 0x1

    const/16 v20, 0x2

    .end local v2    # "url":Ljava/lang/String;
    .end local v11    # "attempt":I
    .end local v12    # "counted":Ljava/util/concurrent/atomic/AtomicLong;
    .restart local v4    # "attempt":I
    .restart local v5    # "counted":Ljava/util/concurrent/atomic/AtomicLong;
    .restart local v21    # "url":Ljava/lang/String;
    goto :goto_a

    .line 151
    .end local v4    # "attempt":I
    .end local v5    # "counted":Ljava/util/concurrent/atomic/AtomicLong;
    .end local v21    # "url":Ljava/lang/String;
    .restart local v2    # "url":Ljava/lang/String;
    .restart local v11    # "attempt":I
    .restart local v12    # "counted":Ljava/util/concurrent/atomic/AtomicLong;
    :catch_13
    move-exception v0

    move-object/from16 v21, v2

    move v4, v11

    move-object v5, v12

    .end local v2    # "url":Ljava/lang/String;
    .end local v11    # "attempt":I
    .end local v12    # "counted":Ljava/util/concurrent/atomic/AtomicLong;
    .restart local v4    # "attempt":I
    .restart local v5    # "counted":Ljava/util/concurrent/atomic/AtomicLong;
    .restart local v21    # "url":Ljava/lang/String;
    goto/16 :goto_c

    .line 152
    .end local v5    # "counted":Ljava/util/concurrent/atomic/AtomicLong;
    .end local v21    # "url":Ljava/lang/String;
    .local v4, "url":Ljava/lang/String;
    .restart local v11    # "attempt":I
    .restart local v12    # "counted":Ljava/util/concurrent/atomic/AtomicLong;
    :catch_14
    move-exception v0

    move-object/from16 v21, v4

    move v2, v10

    move v4, v11

    move-object v5, v12

    move/from16 v19, v14

    const/16 v18, 0x0

    const/16 v20, 0x2

    .line 153
    .end local v11    # "attempt":I
    .end local v12    # "counted":Ljava/util/concurrent/atomic/AtomicLong;
    .local v0, "e":Ljava/lang/Exception;
    .local v4, "attempt":I
    .restart local v5    # "counted":Ljava/util/concurrent/atomic/AtomicLong;
    .restart local v21    # "url":Ljava/lang/String;
    :goto_a
    move-object/from16 v16, v0

    :try_start_10
    invoke-virtual {v5}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide v9

    long-to-int v6, v9

    neg-int v6, v6

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-interface {v8, v6}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 154
    instance-of v6, v0, Lcom/pymcl/core/net/HttpException;

    if-eqz v6, :cond_a

    const/4 v6, 0x3

    new-array v6, v6, [Ljava/lang/Integer;

    const/16 v9, 0x194

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    aput-object v9, v6, v17

    const/16 v9, 0x193

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    aput-object v9, v6, v19

    const/16 v9, 0x19a

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    aput-object v9, v6, v20

    invoke-static {v6}, Lkotlin/collections/SetsKt;->setOf([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v6

    move-object v9, v0

    check-cast v9, Lcom/pymcl/core/net/HttpException;

    invoke-virtual {v9}, Lcom/pymcl/core/net/HttpException;->getCode()I

    move-result v9

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-interface {v6, v9}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_9

    goto :goto_b

    :cond_9
    move-object/from16 v2, v16

    goto/16 :goto_0

    .line 155
    :cond_a
    :goto_b
    iget v6, v1, Lcom/pymcl/core/download/DownloadManager;->retries:I

    add-int/lit8 v6, v6, -0x1

    if-ge v4, v6, :cond_b

    invoke-direct {v1, v7}, Lcom/pymcl/core/download/DownloadManager;->checkCancel(Lkotlin/jvm/functions/Function0;)V

    iget-object v6, v1, Lcom/pymcl/core/download/DownloadManager;->sleeper:Lkotlin/jvm/functions/Function1;

    add-int/lit8 v11, v4, 0x1

    int-to-long v9, v11

    const-wide/16 v11, 0x3e8

    mul-long/2addr v9, v11

    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v9

    invoke-interface {v6, v9}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 137
    .end local v0    # "e":Ljava/lang/Exception;
    .end local v5    # "counted":Ljava/util/concurrent/atomic/AtomicLong;
    :cond_b
    add-int/lit8 v11, v4, 0x1

    move v10, v2

    move-object/from16 v4, v21

    .end local v4    # "attempt":I
    .restart local v11    # "attempt":I
    goto/16 :goto_1

    .line 151
    .end local v21    # "url":Ljava/lang/String;
    .local v4, "url":Ljava/lang/String;
    .restart local v12    # "counted":Ljava/util/concurrent/atomic/AtomicLong;
    :catch_15
    move-exception v0

    move-object/from16 v21, v4

    move v4, v11

    move-object v5, v12

    .end local v11    # "attempt":I
    .end local v12    # "counted":Ljava/util/concurrent/atomic/AtomicLong;
    .local v0, "e":Ljava/util/concurrent/CancellationException;
    .local v4, "attempt":I
    .restart local v5    # "counted":Ljava/util/concurrent/atomic/AtomicLong;
    .restart local v21    # "url":Ljava/lang/String;
    :goto_c
    invoke-virtual {v5}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide v9

    long-to-int v2, v9

    neg-int v2, v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v8, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .end local v3    # "part":Ljava/io/File;
    .end local v16    # "last":Ljava/lang/Exception;
    .end local p1    # "item":Lcom/pymcl/core/download/DownloadItem;
    .end local p2    # "onBytes":Lkotlin/jvm/functions/Function1;
    .end local p3    # "isCancelled":Lkotlin/jvm/functions/Function0;
    throw v0
    :try_end_10
    .catch Ljava/util/concurrent/CancellationException; {:try_start_10 .. :try_end_10} :catch_16

    .line 158
    .end local v0    # "e":Ljava/util/concurrent/CancellationException;
    .end local v4    # "attempt":I
    .end local v5    # "counted":Ljava/util/concurrent/atomic/AtomicLong;
    .end local v21    # "url":Ljava/lang/String;
    .restart local v3    # "part":Ljava/io/File;
    .restart local v16    # "last":Ljava/lang/Exception;
    .restart local p1    # "item":Lcom/pymcl/core/download/DownloadItem;
    .restart local p2    # "onBytes":Lkotlin/jvm/functions/Function1;
    .restart local p3    # "isCancelled":Lkotlin/jvm/functions/Function0;
    :catch_16
    move-exception v0

    move-object/from16 v2, v16

    goto :goto_e

    .line 137
    .local v4, "url":Ljava/lang/String;
    .restart local v11    # "attempt":I
    :cond_c
    move-object/from16 v21, v4

    move v4, v11

    .end local v11    # "attempt":I
    .local v4, "attempt":I
    .restart local v21    # "url":Ljava/lang/String;
    move-object/from16 v2, v16

    goto/16 :goto_0

    .line 159
    .end local v4    # "attempt":I
    .end local v16    # "last":Ljava/lang/Exception;
    .end local v21    # "url":Ljava/lang/String;
    .local v2, "last":Ljava/lang/Exception;
    :cond_d
    const/16 v18, 0x0

    invoke-virtual {v3}, Ljava/io/File;->delete()Z

    .line 160
    new-instance v0, Lcom/pymcl/core/download/DownloadError;

    invoke-virtual/range {p1 .. p1}, Lcom/pymcl/core/download/DownloadItem;->getName()Ljava/lang/String;

    move-result-object v4

    if-eqz v2, :cond_e

    invoke-virtual {v2}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v9

    goto :goto_d

    :cond_e
    move-object/from16 v9, v18

    :goto_d
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "\u4e0b\u8f7d\u5931\u8d25 "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, ": "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    move-object v5, v2

    check-cast v5, Ljava/lang/Throwable;

    invoke-direct {v0, v4, v5}, Lcom/pymcl/core/download/DownloadError;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    .line 158
    :catch_17
    move-exception v0

    .restart local v0    # "e":Ljava/util/concurrent/CancellationException;
    :goto_e
    invoke-virtual {v3}, Ljava/io/File;->delete()Z

    throw v0
.end method

.method private static final downloadLocked$lambda$0(Ljava/util/concurrent/atomic/AtomicLong;Lkotlin/jvm/functions/Function1;I)Lkotlin/Unit;
    .locals 2
    .param p0, "$counted"    # Ljava/util/concurrent/atomic/AtomicLong;
    .param p1, "$onBytes"    # Lkotlin/jvm/functions/Function1;
    .param p2, "it"    # I

    .line 142
    int-to-long v0, p2

    invoke-virtual {p0, v0, v1}, Ljava/util/concurrent/atomic/AtomicLong;->addAndGet(J)J

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method private final downloadSegmented(Ljava/lang/String;Ljava/io/File;JLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V
    .locals 29
    .param p1, "url"    # Ljava/lang/String;
    .param p2, "out"    # Ljava/io/File;
    .param p3, "size"    # J
    .param p5, "onBytes"    # Lkotlin/jvm/functions/Function1;
    .param p6, "isCancelled"    # Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/io/File;",
            "J",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    .line 172
    move-object/from16 v1, p0

    move-object/from16 v7, p2

    move-wide/from16 v12, p3

    new-instance v0, Ljava/io/RandomAccessFile;

    const-string v2, "rw"

    invoke-direct {v0, v7, v2}, Ljava/io/RandomAccessFile;-><init>(Ljava/io/File;Ljava/lang/String;)V

    move-object v2, v0

    check-cast v2, Ljava/io/Closeable;

    :try_start_0
    move-object v0, v2

    check-cast v0, Ljava/io/RandomAccessFile;

    .line 209
    .local v0, "it":Ljava/io/RandomAccessFile;
    const/4 v3, 0x0

    .line 172
    .local v3, "$i$a$-use-DownloadManager$downloadSegmented$2":I
    invoke-virtual {v0, v12, v13}, Ljava/io/RandomAccessFile;->setLength(J)V

    .end local v0    # "it":Ljava/io/RandomAccessFile;
    .end local v3    # "$i$a$-use-DownloadManager$downloadSegmented$2":I
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v14, 0x0

    invoke-static {v2, v14}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 173
    iget v0, v1, Lcom/pymcl/core/download/DownloadManager;->segments:I

    const/high16 v2, 0x100000

    int-to-long v2, v2

    div-long v2, v12, v2

    long-to-int v2, v2

    const/4 v15, 0x1

    invoke-static {v2, v15}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    move-result v2

    invoke-static {v0, v2}, Lkotlin/ranges/RangesKt;->coerceAtMost(II)I

    move-result v0

    .line 174
    .local v0, "n":I
    int-to-long v2, v0

    div-long v16, v12, v2

    .line 175
    .local v16, "seg":J
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    check-cast v2, Ljava/util/List;

    invoke-static {v2}, Ljava/util/Collections;->synchronizedList(Ljava/util/List;)Ljava/util/List;

    move-result-object v8

    .line 176
    .local v8, "errs":Ljava/util/List;
    new-instance v10, Ljava/util/concurrent/atomic/AtomicLong;

    invoke-direct {v10}, Ljava/util/concurrent/atomic/AtomicLong;-><init>()V

    .line 177
    .local v10, "segBytes":Ljava/util/concurrent/atomic/AtomicLong;
    const/4 v2, 0x0

    invoke-static {v2, v0}, Lkotlin/ranges/RangesKt;->until(II)Lkotlin/ranges/IntRange;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    .local v3, "$this$map$iv":Ljava/lang/Iterable;
    const/16 v18, 0x0

    .line 213
    .local v18, "$i$f$map":I
    new-instance v4, Ljava/util/ArrayList;

    const/16 v5, 0xa

    invoke-static {v3, v5}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v4, Ljava/util/Collection;

    .local v4, "destination$iv$iv":Ljava/util/Collection;
    move-object/from16 v19, v3

    .local v19, "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    const/16 v20, 0x0

    .line 214
    .local v20, "$i$f$mapTo":I
    invoke-interface/range {v19 .. v19}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v21

    :goto_0
    invoke-interface/range {v21 .. v21}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_1

    move-object/from16 v5, v21

    check-cast v5, Lkotlin/collections/IntIterator;

    invoke-virtual {v5}, Lkotlin/collections/IntIterator;->nextInt()I

    move-result v22

    .line 215
    .local v22, "item$iv$iv":I
    move/from16 v5, v22

    .local v5, "k":I
    const/16 v23, 0x0

    .line 178
    .local v23, "$i$a$-map-DownloadManager$downloadSegmented$ts$1":I
    move-object v9, v3

    .end local v3    # "$this$map$iv":Ljava/lang/Iterable;
    .local v9, "$this$map$iv":Ljava/lang/Iterable;
    int-to-long v2, v5

    mul-long v2, v2, v16

    .local v2, "from":J
    add-int/lit8 v11, v0, -0x1

    const-wide/16 v24, 0x1

    if-ne v5, v11, :cond_0

    sub-long v24, v12, v24

    goto :goto_1

    :cond_0
    add-long v26, v2, v16

    sub-long v24, v26, v24

    .line 179
    .local v24, "to":J
    :goto_1
    new-instance v11, Ljava/lang/Thread;

    move/from16 v26, v0

    .end local v0    # "n":I
    .local v26, "n":I
    new-instance v0, Lcom/pymcl/core/download/DownloadManager$$ExternalSyntheticLambda2;

    move-object v15, v4

    move/from16 v27, v5

    move-object v14, v11

    move-wide/from16 v5, v24

    const/16 v28, 0x0

    move-object/from16 v11, p5

    move-wide v3, v2

    move-object/from16 v24, v9

    move-object/from16 v2, p1

    move-object/from16 v9, p6

    .end local v2    # "from":J
    .end local v4    # "destination$iv$iv":Ljava/util/Collection;
    .end local v9    # "$this$map$iv":Ljava/lang/Iterable;
    .local v3, "from":J
    .local v5, "to":J
    .local v15, "destination$iv$iv":Ljava/util/Collection;
    .local v24, "$this$map$iv":Ljava/lang/Iterable;
    .local v27, "k":I
    invoke-direct/range {v0 .. v11}, Lcom/pymcl/core/download/DownloadManager$$ExternalSyntheticLambda2;-><init>(Lcom/pymcl/core/download/DownloadManager;Ljava/lang/String;JJLjava/io/File;Ljava/util/List;Lkotlin/jvm/functions/Function0;Ljava/util/concurrent/atomic/AtomicLong;Lkotlin/jvm/functions/Function1;)V

    invoke-direct {v14, v0}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 188
    move-object v0, v14

    .line 209
    .local v0, "it":Ljava/lang/Thread;
    const/4 v2, 0x0

    .line 188
    .local v2, "$i$a$-also-DownloadManager$downloadSegmented$ts$1$2":I
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 215
    .end local v0    # "it":Ljava/lang/Thread;
    .end local v2    # "$i$a$-also-DownloadManager$downloadSegmented$ts$1$2":I
    .end local v3    # "from":J
    .end local v5    # "to":J
    .end local v23    # "$i$a$-map-DownloadManager$downloadSegmented$ts$1":I
    .end local v27    # "k":I
    invoke-interface {v15, v14}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move-object v4, v15

    move-object/from16 v3, v24

    move/from16 v0, v26

    move/from16 v2, v28

    const/4 v14, 0x0

    const/4 v15, 0x1

    goto :goto_0

    .line 216
    .end local v15    # "destination$iv$iv":Ljava/util/Collection;
    .end local v22    # "item$iv$iv":I
    .end local v24    # "$this$map$iv":Ljava/lang/Iterable;
    .end local v26    # "n":I
    .local v0, "n":I
    .local v3, "$this$map$iv":Ljava/lang/Iterable;
    .restart local v4    # "destination$iv$iv":Ljava/util/Collection;
    :cond_1
    move-object/from16 v11, p5

    move/from16 v26, v0

    move/from16 v28, v2

    move-object/from16 v24, v3

    move-object v15, v4

    .end local v0    # "n":I
    .end local v3    # "$this$map$iv":Ljava/lang/Iterable;
    .end local v4    # "destination$iv$iv":Ljava/util/Collection;
    .end local v19    # "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    .end local v20    # "$i$f$mapTo":I
    .restart local v24    # "$this$map$iv":Ljava/lang/Iterable;
    .restart local v26    # "n":I
    move-object v0, v15

    check-cast v0, Ljava/util/List;

    .line 213
    nop

    .line 177
    .end local v18    # "$i$f$map":I
    .end local v24    # "$this$map$iv":Ljava/lang/Iterable;
    nop

    .line 190
    .local v0, "ts":Ljava/util/List;
    move-object v2, v0

    check-cast v2, Ljava/lang/Iterable;

    .local v2, "$this$forEach$iv":Ljava/lang/Iterable;
    const/4 v3, 0x0

    .line 217
    .local v3, "$i$f$forEach":I
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    .local v5, "element$iv":Ljava/lang/Object;
    move-object v6, v5

    check-cast v6, Ljava/lang/Thread;

    .local v6, "it":Ljava/lang/Thread;
    const/4 v9, 0x0

    .line 190
    .local v9, "$i$a$-forEach-DownloadManager$downloadSegmented$3":I
    invoke-virtual {v6}, Ljava/lang/Thread;->join()V

    .line 217
    .end local v6    # "it":Ljava/lang/Thread;
    .end local v9    # "$i$a$-forEach-DownloadManager$downloadSegmented$3":I
    nop

    .end local v5    # "element$iv":Ljava/lang/Object;
    goto :goto_2

    .line 218
    :cond_2
    nop

    .line 191
    .end local v2    # "$this$forEach$iv":Ljava/lang/Iterable;
    .end local v3    # "$i$f$forEach":I
    invoke-static {v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    move-object v2, v8

    check-cast v2, Ljava/lang/Iterable;

    .local v2, "$this$firstOrNull$iv":Ljava/lang/Iterable;
    const/4 v3, 0x0

    .line 219
    .local v3, "$i$f$firstOrNull":I
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_3
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_4

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    .restart local v5    # "element$iv":Ljava/lang/Object;
    move-object v6, v5

    check-cast v6, Ljava/lang/Throwable;

    .local v6, "it":Ljava/lang/Throwable;
    const/4 v9, 0x0

    .line 191
    .local v9, "$i$a$-firstOrNull-DownloadManager$downloadSegmented$4":I
    instance-of v6, v6, Ljava/util/concurrent/CancellationException;

    .line 219
    .end local v6    # "it":Ljava/lang/Throwable;
    .end local v9    # "$i$a$-firstOrNull-DownloadManager$downloadSegmented$4":I
    if-eqz v6, :cond_3

    goto :goto_3

    .line 220
    .end local v5    # "element$iv":Ljava/lang/Object;
    :cond_4
    const/4 v5, 0x0

    .line 191
    .end local v2    # "$this$firstOrNull$iv":Ljava/lang/Iterable;
    .end local v3    # "$i$f$firstOrNull":I
    :goto_3
    check-cast v5, Ljava/lang/Throwable;

    if-nez v5, :cond_b

    .line 192
    move-object v2, v8

    check-cast v2, Ljava/lang/Iterable;

    .local v2, "$this$any$iv":Ljava/lang/Iterable;
    const/4 v3, 0x0

    .line 221
    .local v3, "$i$f$any":I
    instance-of v4, v2, Ljava/util/Collection;

    if-eqz v4, :cond_5

    move-object v4, v2

    check-cast v4, Ljava/util/Collection;

    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_5

    move/from16 v15, v28

    goto :goto_4

    .line 222
    :cond_5
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_6
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_7

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    .restart local v5    # "element$iv":Ljava/lang/Object;
    move-object v6, v5

    check-cast v6, Ljava/lang/Throwable;

    .restart local v6    # "it":Ljava/lang/Throwable;
    const/4 v9, 0x0

    .line 192
    .local v9, "$i$a$-any-DownloadManager$downloadSegmented$6":I
    instance-of v6, v6, Lcom/pymcl/core/download/DownloadManager$NoSegment;

    .line 222
    .end local v6    # "it":Ljava/lang/Throwable;
    .end local v9    # "$i$a$-any-DownloadManager$downloadSegmented$6":I
    if-eqz v6, :cond_6

    const/4 v15, 0x1

    goto :goto_4

    .line 223
    .end local v5    # "element$iv":Ljava/lang/Object;
    :cond_7
    move/from16 v15, v28

    .line 192
    .end local v2    # "$this$any$iv":Ljava/lang/Iterable;
    .end local v3    # "$i$f$any":I
    :goto_4
    if-eqz v15, :cond_9

    .line 194
    invoke-virtual {v10}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide v2

    long-to-int v2, v2

    neg-int v2, v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v11, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 195
    nop

    .line 209
    move-object/from16 v2, p2

    .local v2, "it":Ljava/io/File;
    const/4 v3, 0x0

    .line 195
    .local v3, "$i$a$-also-DownloadManager$downloadSegmented$got$1":I
    invoke-virtual {v2}, Ljava/io/File;->delete()Z

    sget-object v2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    move-object/from16 v3, p1

    move-object/from16 v9, p6

    .end local v2    # "it":Ljava/io/File;
    .end local v3    # "$i$a$-also-DownloadManager$downloadSegmented$got$1":I
    invoke-direct {v1, v3, v7, v11, v9}, Lcom/pymcl/core/download/DownloadManager;->downloadSingle(Ljava/lang/String;Ljava/io/File;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)J

    move-result-wide v4

    .line 196
    .local v4, "got":J
    cmp-long v2, v4, v12

    if-nez v2, :cond_8

    .line 197
    return-void

    .line 196
    :cond_8
    new-instance v2, Lcom/pymcl/core/download/DownloadError;

    invoke-virtual {v7}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v6

    new-instance v14, Ljava/lang/StringBuilder;

    invoke-direct {v14}, Ljava/lang/StringBuilder;-><init>()V

    const-string v15, "\u6587\u4ef6\u4e0d\u5b8c\u6574 "

    invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v14

    invoke-virtual {v14, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    const-string v14, ": \u671f\u671b "

    invoke-virtual {v6, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, v12, v13}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v6

    const-string v14, " \u5b57\u8282\uff0c\u5b9e\u5f97 "

    invoke-virtual {v6, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v6

    const-string v14, " \u5b57\u8282"

    invoke-virtual {v6, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    const/4 v14, 0x2

    const/4 v15, 0x0

    invoke-direct {v2, v6, v15, v14, v15}, Lcom/pymcl/core/download/DownloadError;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    throw v2

    .line 199
    .end local v4    # "got":J
    :cond_9
    move-object/from16 v3, p1

    move-object/from16 v9, p6

    invoke-static {v8}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Throwable;

    if-nez v2, :cond_a

    .line 200
    return-void

    .line 209
    .local v2, "it":Ljava/lang/Throwable;
    :cond_a
    const/4 v4, 0x0

    .line 199
    .local v4, "$i$a$-let-DownloadManager$downloadSegmented$7":I
    throw v2

    .line 191
    .end local v2    # "it":Ljava/lang/Throwable;
    .end local v4    # "$i$a$-let-DownloadManager$downloadSegmented$7":I
    :cond_b
    move-object/from16 v3, p1

    move-object/from16 v9, p6

    .line 209
    .local v5, "it":Ljava/lang/Throwable;
    const/4 v2, 0x0

    .line 191
    .local v2, "$i$a$-let-DownloadManager$downloadSegmented$5":I
    throw v5

    .line 172
    .end local v0    # "ts":Ljava/util/List;
    .end local v2    # "$i$a$-let-DownloadManager$downloadSegmented$5":I
    .end local v5    # "it":Ljava/lang/Throwable;
    .end local v8    # "errs":Ljava/util/List;
    .end local v10    # "segBytes":Ljava/util/concurrent/atomic/AtomicLong;
    .end local v16    # "seg":J
    .end local v26    # "n":I
    :catchall_0
    move-exception v0

    move-object/from16 v3, p1

    move-object/from16 v11, p5

    move-object/from16 v9, p6

    move-object v4, v0

    .end local p1    # "url":Ljava/lang/String;
    .end local p2    # "out":Ljava/io/File;
    .end local p3    # "size":J
    .end local p5    # "onBytes":Lkotlin/jvm/functions/Function1;
    .end local p6    # "isCancelled":Lkotlin/jvm/functions/Function0;
    :try_start_1
    throw v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .restart local p1    # "url":Ljava/lang/String;
    .restart local p2    # "out":Ljava/io/File;
    .restart local p3    # "size":J
    .restart local p5    # "onBytes":Lkotlin/jvm/functions/Function1;
    .restart local p6    # "isCancelled":Lkotlin/jvm/functions/Function0;
    :catchall_1
    move-exception v0

    invoke-static {v2, v4}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v0
.end method

.method static synthetic downloadSegmented$default(Lcom/pymcl/core/download/DownloadManager;Ljava/lang/String;Ljava/io/File;JLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;ILjava/lang/Object;)V
    .locals 7

    .line 171
    and-int/lit8 p7, p7, 0x10

    if-eqz p7, :cond_0

    new-instance p6, Lcom/pymcl/core/download/DownloadManager$$ExternalSyntheticLambda0;

    invoke-direct {p6}, Lcom/pymcl/core/download/DownloadManager$$ExternalSyntheticLambda0;-><init>()V

    :cond_0
    move-object v6, p6

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-wide v3, p3

    move-object v5, p5

    invoke-direct/range {v0 .. v6}, Lcom/pymcl/core/download/DownloadManager;->downloadSegmented(Ljava/lang/String;Ljava/io/File;JLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V

    return-void
.end method

.method private static final downloadSegmented$lambda$0()Z
    .locals 1

    .line 171
    const/4 v0, 0x0

    return v0
.end method

.method private static final downloadSegmented$lambda$2$0(Lcom/pymcl/core/download/DownloadManager;Ljava/lang/String;JJLjava/io/File;Ljava/util/List;Lkotlin/jvm/functions/Function0;Ljava/util/concurrent/atomic/AtomicLong;Lkotlin/jvm/functions/Function1;)V
    .locals 27
    .param p0, "this$0"    # Lcom/pymcl/core/download/DownloadManager;
    .param p1, "$url"    # Ljava/lang/String;
    .param p2, "$from"    # J
    .param p4, "$to"    # J
    .param p6, "$out"    # Ljava/io/File;
    .param p7, "$errs"    # Ljava/util/List;
    .param p8, "$isCancelled"    # Lkotlin/jvm/functions/Function0;
    .param p9, "$segBytes"    # Ljava/util/concurrent/atomic/AtomicLong;
    .param p10, "$onBytes"    # Lkotlin/jvm/functions/Function1;

    .line 180
    move-wide/from16 v1, p2

    move-wide/from16 v3, p4

    const-string v0, "-"

    .line 181
    move-object/from16 v5, p0

    :try_start_0
    iget-object v6, v5, Lcom/pymcl/core/download/DownloadManager;->http:Lcom/pymcl/core/net/Http;

    invoke-virtual/range {p0 .. p1}, Lcom/pymcl/core/download/DownloadManager;->headersFor(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v7

    const-string v8, "Range"

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    const-string v10, "bytes="

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {v9, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {v9, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-static {v8, v9}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v8

    invoke-static {v7, v8}, Lkotlin/collections/MapsKt;->plus(Ljava/util/Map;Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v8

    const/4 v10, 0x4

    const/4 v11, 0x0

    const/4 v9, 0x0

    move-object/from16 v7, p1

    invoke-static/range {v6 .. v11}, Lcom/pymcl/core/net/Http;->openStream$default(Lcom/pymcl/core/net/Http;Ljava/lang/String;Ljava/util/Map;IILjava/lang/Object;)Lkotlin/Triple;

    move-result-object v6

    invoke-virtual {v6}, Lkotlin/Triple;->component1()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Number;

    invoke-virtual {v7}, Ljava/lang/Number;->intValue()I

    move-result v7

    .local v7, "code":I
    invoke-virtual {v6}, Lkotlin/Triple;->component3()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/io/InputStream;

    .line 182
    .local v6, "ins":Ljava/io/InputStream;
    const/16 v8, 0xce

    if-ne v7, v8, :cond_2

    .line 183
    const-wide/16 v8, 0x0

    .line 184
    .local v8, "got":J
    new-instance v10, Ljava/io/RandomAccessFile;

    const-string v11, "rw"
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_a

    move-object/from16 v12, p6

    :try_start_1
    invoke-direct {v10, v12, v11}, Ljava/io/RandomAccessFile;-><init>(Ljava/io/File;Ljava/lang/String;)V

    check-cast v10, Ljava/io/Closeable;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_8

    :try_start_2
    move-object v11, v10

    check-cast v11, Ljava/io/RandomAccessFile;

    .line 209
    .local v11, "raf":Ljava/io/RandomAccessFile;
    const/4 v13, 0x0

    .line 184
    .local v13, "$i$a$-use-DownloadManager$downloadSegmented$ts$1$1$1":I
    invoke-virtual {v11, v1, v2}, Ljava/io/RandomAccessFile;->seek(J)V

    move-object v14, v6

    check-cast v14, Ljava/io/Closeable;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_6

    :try_start_3
    move-object v15, v14

    check-cast v15, Ljava/io/InputStream;

    .line 209
    .local v15, "it":Ljava/io/InputStream;
    const/16 v16, 0x0

    .line 184
    .local v16, "$i$a$-use-DownloadManager$downloadSegmented$ts$1$1$1$1":I
    move-object/from16 v17, p8

    .local v17, "isCancelled$iv":Lkotlin/jvm/functions/Function0;
    move-object/from16 v18, v15

    .local v18, "i$iv":Ljava/io/InputStream;
    move-object/from16 v19, p0

    .local v19, "this_$iv":Lcom/pymcl/core/download/DownloadManager;
    const/16 v20, 0x0

    .line 224
    .local v20, "$i$f$pump":I
    const v5, 0x8000

    new-array v5, v5, [B
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 225
    .local v5, "buf$iv":[B
    :goto_0
    move-object/from16 v21, v6

    move-object/from16 v6, v17

    move/from16 v17, v7

    move-object/from16 v7, v19

    .end local v19    # "this_$iv":Lcom/pymcl/core/download/DownloadManager;
    .local v6, "isCancelled$iv":Lkotlin/jvm/functions/Function0;
    .local v7, "this_$iv":Lcom/pymcl/core/download/DownloadManager;
    .local v17, "code":I
    .local v21, "ins":Ljava/io/InputStream;
    :try_start_4
    invoke-direct {v7, v6}, Lcom/pymcl/core/download/DownloadManager;->checkCancel(Lkotlin/jvm/functions/Function0;)V

    move-object/from16 v19, v6

    move-object/from16 v6, v18

    .end local v18    # "i$iv":Ljava/io/InputStream;
    .local v6, "i$iv":Ljava/io/InputStream;
    .local v19, "isCancelled$iv":Lkotlin/jvm/functions/Function0;
    invoke-virtual {v6, v5}, Ljava/io/InputStream;->read([B)I

    move-result v18

    move/from16 v22, v18

    .local v22, "r$iv":I
    if-ltz v22, :cond_0

    move-object/from16 v18, v5

    .end local v5    # "buf$iv":[B
    .local v18, "buf$iv":[B
    iget-object v5, v7, Lcom/pymcl/core/download/DownloadManager;->limiter:Lcom/pymcl/core/download/RateLimiter;

    move-object/from16 v23, v6

    move/from16 v6, v22

    .end local v22    # "r$iv":I
    .local v6, "r$iv":I
    .local v23, "i$iv":Ljava/io/InputStream;
    invoke-virtual {v5, v6}, Lcom/pymcl/core/download/RateLimiter;->acquire(I)V

    const/4 v5, 0x0

    .local v5, "p1":I
    move-object/from16 v22, v18

    .local v22, "p0":[B
    move-object/from16 v24, v22

    .end local v22    # "p0":[B
    .local v24, "p0":[B
    move/from16 v22, v6

    .local v22, "p2":I
    const/16 v25, 0x0

    .line 184
    .local v25, "$i$a$-pump-DownloadManager$downloadSegmented$ts$1$1$1$1$1":I
    move/from16 v26, v22

    move-object/from16 v22, v7

    move/from16 v7, v26

    move/from16 v26, v6

    move-object/from16 v6, v24

    .end local v24    # "p0":[B
    .local v6, "p0":[B
    .local v7, "p2":I
    .local v22, "this_$iv":Lcom/pymcl/core/download/DownloadManager;
    .local v26, "r$iv":I
    invoke-virtual {v11, v6, v5, v7}, Ljava/io/RandomAccessFile;->write([BII)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 225
    .end local v5    # "p1":I
    .end local v6    # "p0":[B
    .end local v7    # "p2":I
    .end local v25    # "$i$a$-pump-DownloadManager$downloadSegmented$ts$1$1$1$1$1":I
    move/from16 v5, v26

    .local v5, "b":I
    const/4 v6, 0x0

    .line 184
    .local v6, "$i$a$-pump-DownloadManager$downloadSegmented$ts$1$1$1$1$2":I
    move/from16 v24, v6

    .end local v6    # "$i$a$-pump-DownloadManager$downloadSegmented$ts$1$1$1$1$2":I
    .local v24, "$i$a$-pump-DownloadManager$downloadSegmented$ts$1$1$1$1$2":I
    int-to-long v6, v5

    add-long/2addr v8, v6

    int-to-long v6, v5

    move/from16 v25, v5

    move-object/from16 v5, p9

    .end local v5    # "b":I
    .local v25, "b":I
    :try_start_5
    invoke-virtual {v5, v6, v7}, Ljava/util/concurrent/atomic/AtomicLong;->addAndGet(J)J

    invoke-static/range {v25 .. v25}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    move-object/from16 v7, p10

    :try_start_6
    invoke-interface {v7, v6}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 225
    nop

    .end local v24    # "$i$a$-pump-DownloadManager$downloadSegmented$ts$1$1$1$1$2":I
    .end local v25    # "b":I
    move/from16 v7, v17

    move-object/from16 v5, v18

    move-object/from16 v17, v19

    move-object/from16 v6, v21

    move-object/from16 v19, v22

    move-object/from16 v18, v23

    .end local v26    # "r$iv":I
    goto :goto_0

    .line 184
    .end local v15    # "it":Ljava/io/InputStream;
    .end local v16    # "$i$a$-use-DownloadManager$downloadSegmented$ts$1$1$1$1":I
    .end local v18    # "buf$iv":[B
    .end local v19    # "isCancelled$iv":Lkotlin/jvm/functions/Function0;
    .end local v20    # "$i$f$pump":I
    .end local v22    # "this_$iv":Lcom/pymcl/core/download/DownloadManager;
    .end local v23    # "i$iv":Ljava/io/InputStream;
    :catchall_0
    move-exception v0

    goto :goto_1

    .line 225
    .local v5, "buf$iv":[B
    .local v6, "i$iv":Ljava/io/InputStream;
    .local v7, "this_$iv":Lcom/pymcl/core/download/DownloadManager;
    .restart local v15    # "it":Ljava/io/InputStream;
    .restart local v16    # "$i$a$-use-DownloadManager$downloadSegmented$ts$1$1$1$1":I
    .restart local v19    # "isCancelled$iv":Lkotlin/jvm/functions/Function0;
    .restart local v20    # "$i$f$pump":I
    .local v22, "r$iv":I
    :cond_0
    move-object/from16 v18, v5

    move-object/from16 v23, v6

    move/from16 v26, v22

    move-object/from16 v5, p9

    move-object/from16 v22, v7

    move-object/from16 v7, p10

    .line 226
    .end local v5    # "buf$iv":[B
    .end local v6    # "i$iv":Ljava/io/InputStream;
    .end local v7    # "this_$iv":Lcom/pymcl/core/download/DownloadManager;
    .restart local v18    # "buf$iv":[B
    .local v22, "this_$iv":Lcom/pymcl/core/download/DownloadManager;
    .restart local v23    # "i$iv":Ljava/io/InputStream;
    nop

    .line 184
    .end local v18    # "buf$iv":[B
    .end local v19    # "isCancelled$iv":Lkotlin/jvm/functions/Function0;
    .end local v20    # "$i$f$pump":I
    .end local v22    # "this_$iv":Lcom/pymcl/core/download/DownloadManager;
    .end local v23    # "i$iv":Ljava/io/InputStream;
    nop

    .end local v15    # "it":Ljava/io/InputStream;
    .end local v16    # "$i$a$-use-DownloadManager$downloadSegmented$ts$1$1$1$1":I
    sget-object v6, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    const/4 v6, 0x0

    :try_start_7
    invoke-static {v14, v6}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .end local v11    # "raf":Ljava/io/RandomAccessFile;
    .end local v13    # "$i$a$-use-DownloadManager$downloadSegmented$ts$1$1$1":I
    sget-object v11, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_5

    :try_start_8
    invoke-static {v10, v6}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 186
    sub-long v10, v3, v1

    const-wide/16 v13, 0x1

    add-long/2addr v10, v13

    cmp-long v6, v8, v10

    if-nez v6, :cond_1

    move-object/from16 v6, p7

    goto/16 :goto_7

    :cond_1
    new-instance v6, Ljava/io/IOException;

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    const-string v11, "\u5206\u7247\u4e0d\u5b8c\u6574 bytes="

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {v10, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v10, "\uff1a\u5b9e\u5f97 "

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v8, v9}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v10, " \u5b57\u8282"

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v6, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .end local p0    # "this$0":Lcom/pymcl/core/download/DownloadManager;
    .end local p1    # "$url":Ljava/lang/String;
    .end local p2    # "$from":J
    .end local p4    # "$to":J
    .end local p6    # "$out":Ljava/io/File;
    .end local p7    # "$errs":Ljava/util/List;
    .end local p8    # "$isCancelled":Lkotlin/jvm/functions/Function0;
    .end local p9    # "$segBytes":Ljava/util/concurrent/atomic/AtomicLong;
    .end local p10    # "$onBytes":Lkotlin/jvm/functions/Function1;
    throw v6
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_9

    .line 184
    .restart local v11    # "raf":Ljava/io/RandomAccessFile;
    .restart local v13    # "$i$a$-use-DownloadManager$downloadSegmented$ts$1$1$1":I
    .restart local p0    # "this$0":Lcom/pymcl/core/download/DownloadManager;
    .restart local p1    # "$url":Ljava/lang/String;
    .restart local p2    # "$from":J
    .restart local p4    # "$to":J
    .restart local p6    # "$out":Ljava/io/File;
    .restart local p7    # "$errs":Ljava/util/List;
    .restart local p8    # "$isCancelled":Lkotlin/jvm/functions/Function0;
    .restart local p9    # "$segBytes":Ljava/util/concurrent/atomic/AtomicLong;
    .restart local p10    # "$onBytes":Lkotlin/jvm/functions/Function1;
    :catchall_1
    move-exception v0

    goto :goto_2

    :catchall_2
    move-exception v0

    move-object/from16 v5, p9

    :goto_1
    move-object/from16 v7, p10

    :goto_2
    move-object v6, v0

    goto :goto_3

    .end local v17    # "code":I
    .end local v21    # "ins":Ljava/io/InputStream;
    .local v6, "ins":Ljava/io/InputStream;
    .local v7, "code":I
    :catchall_3
    move-exception v0

    move-object/from16 v5, p9

    move-object/from16 v21, v6

    move/from16 v17, v7

    move-object/from16 v7, p10

    move-object v6, v0

    .end local v6    # "ins":Ljava/io/InputStream;
    .end local v7    # "code":I
    .end local v8    # "got":J
    .end local v11    # "raf":Ljava/io/RandomAccessFile;
    .end local v13    # "$i$a$-use-DownloadManager$downloadSegmented$ts$1$1$1":I
    .end local p0    # "this$0":Lcom/pymcl/core/download/DownloadManager;
    .end local p1    # "$url":Ljava/lang/String;
    .end local p2    # "$from":J
    .end local p4    # "$to":J
    .end local p6    # "$out":Ljava/io/File;
    .end local p7    # "$errs":Ljava/util/List;
    .end local p8    # "$isCancelled":Lkotlin/jvm/functions/Function0;
    .end local p9    # "$segBytes":Ljava/util/concurrent/atomic/AtomicLong;
    .end local p10    # "$onBytes":Lkotlin/jvm/functions/Function1;
    :goto_3
    :try_start_9
    throw v6
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_4

    .restart local v8    # "got":J
    .restart local v11    # "raf":Ljava/io/RandomAccessFile;
    .restart local v13    # "$i$a$-use-DownloadManager$downloadSegmented$ts$1$1$1":I
    .restart local v17    # "code":I
    .restart local v21    # "ins":Ljava/io/InputStream;
    .restart local p0    # "this$0":Lcom/pymcl/core/download/DownloadManager;
    .restart local p1    # "$url":Ljava/lang/String;
    .restart local p2    # "$from":J
    .restart local p4    # "$to":J
    .restart local p6    # "$out":Ljava/io/File;
    .restart local p7    # "$errs":Ljava/util/List;
    .restart local p8    # "$isCancelled":Lkotlin/jvm/functions/Function0;
    .restart local p9    # "$segBytes":Ljava/util/concurrent/atomic/AtomicLong;
    .restart local p10    # "$onBytes":Lkotlin/jvm/functions/Function1;
    :catchall_4
    move-exception v0

    :try_start_a
    invoke-static {v14, v6}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .end local v8    # "got":J
    .end local v17    # "code":I
    .end local v21    # "ins":Ljava/io/InputStream;
    .end local p0    # "this$0":Lcom/pymcl/core/download/DownloadManager;
    .end local p1    # "$url":Ljava/lang/String;
    .end local p2    # "$from":J
    .end local p4    # "$to":J
    .end local p6    # "$out":Ljava/io/File;
    .end local p7    # "$errs":Ljava/util/List;
    .end local p8    # "$isCancelled":Lkotlin/jvm/functions/Function0;
    .end local p9    # "$segBytes":Ljava/util/concurrent/atomic/AtomicLong;
    .end local p10    # "$onBytes":Lkotlin/jvm/functions/Function1;
    throw v0
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_5

    .end local v11    # "raf":Ljava/io/RandomAccessFile;
    .end local v13    # "$i$a$-use-DownloadManager$downloadSegmented$ts$1$1$1":I
    .restart local v8    # "got":J
    .restart local v17    # "code":I
    .restart local v21    # "ins":Ljava/io/InputStream;
    .restart local p0    # "this$0":Lcom/pymcl/core/download/DownloadManager;
    .restart local p1    # "$url":Ljava/lang/String;
    .restart local p2    # "$from":J
    .restart local p4    # "$to":J
    .restart local p6    # "$out":Ljava/io/File;
    .restart local p7    # "$errs":Ljava/util/List;
    .restart local p8    # "$isCancelled":Lkotlin/jvm/functions/Function0;
    .restart local p9    # "$segBytes":Ljava/util/concurrent/atomic/AtomicLong;
    .restart local p10    # "$onBytes":Lkotlin/jvm/functions/Function1;
    :catchall_5
    move-exception v0

    move-object v6, v0

    goto :goto_4

    .end local v17    # "code":I
    .end local v21    # "ins":Ljava/io/InputStream;
    .restart local v6    # "ins":Ljava/io/InputStream;
    .restart local v7    # "code":I
    :catchall_6
    move-exception v0

    move-object/from16 v5, p9

    move-object/from16 v21, v6

    move/from16 v17, v7

    move-object/from16 v7, p10

    move-object v6, v0

    .end local v6    # "ins":Ljava/io/InputStream;
    .end local v7    # "code":I
    .end local v8    # "got":J
    .end local p0    # "this$0":Lcom/pymcl/core/download/DownloadManager;
    .end local p1    # "$url":Ljava/lang/String;
    .end local p2    # "$from":J
    .end local p4    # "$to":J
    .end local p6    # "$out":Ljava/io/File;
    .end local p7    # "$errs":Ljava/util/List;
    .end local p8    # "$isCancelled":Lkotlin/jvm/functions/Function0;
    .end local p9    # "$segBytes":Ljava/util/concurrent/atomic/AtomicLong;
    .end local p10    # "$onBytes":Lkotlin/jvm/functions/Function1;
    :goto_4
    :try_start_b
    throw v6
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_7

    .restart local v8    # "got":J
    .restart local v17    # "code":I
    .restart local v21    # "ins":Ljava/io/InputStream;
    .restart local p0    # "this$0":Lcom/pymcl/core/download/DownloadManager;
    .restart local p1    # "$url":Ljava/lang/String;
    .restart local p2    # "$from":J
    .restart local p4    # "$to":J
    .restart local p6    # "$out":Ljava/io/File;
    .restart local p7    # "$errs":Ljava/util/List;
    .restart local p8    # "$isCancelled":Lkotlin/jvm/functions/Function0;
    .restart local p9    # "$segBytes":Ljava/util/concurrent/atomic/AtomicLong;
    .restart local p10    # "$onBytes":Lkotlin/jvm/functions/Function1;
    :catchall_7
    move-exception v0

    :try_start_c
    invoke-static {v10, v6}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .end local p0    # "this$0":Lcom/pymcl/core/download/DownloadManager;
    .end local p1    # "$url":Ljava/lang/String;
    .end local p2    # "$from":J
    .end local p4    # "$to":J
    .end local p6    # "$out":Ljava/io/File;
    .end local p7    # "$errs":Ljava/util/List;
    .end local p8    # "$isCancelled":Lkotlin/jvm/functions/Function0;
    .end local p9    # "$segBytes":Ljava/util/concurrent/atomic/AtomicLong;
    .end local p10    # "$onBytes":Lkotlin/jvm/functions/Function1;
    throw v0

    .line 187
    .end local v8    # "got":J
    .end local v17    # "code":I
    .end local v21    # "ins":Ljava/io/InputStream;
    .restart local p0    # "this$0":Lcom/pymcl/core/download/DownloadManager;
    .restart local p1    # "$url":Ljava/lang/String;
    .restart local p2    # "$from":J
    .restart local p4    # "$to":J
    .restart local p6    # "$out":Ljava/io/File;
    .restart local p7    # "$errs":Ljava/util/List;
    .restart local p8    # "$isCancelled":Lkotlin/jvm/functions/Function0;
    .restart local p9    # "$segBytes":Ljava/util/concurrent/atomic/AtomicLong;
    .restart local p10    # "$onBytes":Lkotlin/jvm/functions/Function1;
    :catchall_8
    move-exception v0

    goto :goto_5

    .line 182
    .restart local v6    # "ins":Ljava/io/InputStream;
    .restart local v7    # "code":I
    :cond_2
    move-object/from16 v12, p6

    move-object/from16 v5, p9

    move-object/from16 v21, v6

    move/from16 v17, v7

    move-object/from16 v7, p10

    .end local v6    # "ins":Ljava/io/InputStream;
    .end local v7    # "code":I
    .restart local v17    # "code":I
    .restart local v21    # "ins":Ljava/io/InputStream;
    invoke-virtual/range {v21 .. v21}, Ljava/io/InputStream;->close()V

    new-instance v0, Lcom/pymcl/core/download/DownloadManager$NoSegment;

    invoke-direct {v0}, Lcom/pymcl/core/download/DownloadManager$NoSegment;-><init>()V

    .end local p0    # "this$0":Lcom/pymcl/core/download/DownloadManager;
    .end local p1    # "$url":Ljava/lang/String;
    .end local p2    # "$from":J
    .end local p4    # "$to":J
    .end local p6    # "$out":Ljava/io/File;
    .end local p7    # "$errs":Ljava/util/List;
    .end local p8    # "$isCancelled":Lkotlin/jvm/functions/Function0;
    .end local p9    # "$segBytes":Ljava/util/concurrent/atomic/AtomicLong;
    .end local p10    # "$onBytes":Lkotlin/jvm/functions/Function1;
    throw v0
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_9

    .line 187
    .end local v17    # "code":I
    .end local v21    # "ins":Ljava/io/InputStream;
    .restart local p0    # "this$0":Lcom/pymcl/core/download/DownloadManager;
    .restart local p1    # "$url":Ljava/lang/String;
    .restart local p2    # "$from":J
    .restart local p4    # "$to":J
    .restart local p6    # "$out":Ljava/io/File;
    .restart local p7    # "$errs":Ljava/util/List;
    .restart local p8    # "$isCancelled":Lkotlin/jvm/functions/Function0;
    .restart local p9    # "$segBytes":Ljava/util/concurrent/atomic/AtomicLong;
    .restart local p10    # "$onBytes":Lkotlin/jvm/functions/Function1;
    :catchall_9
    move-exception v0

    goto :goto_6

    :catchall_a
    move-exception v0

    move-object/from16 v12, p6

    :goto_5
    move-object/from16 v5, p9

    move-object/from16 v7, p10

    :goto_6
    move-object/from16 v6, p7

    .local v0, "e":Ljava/lang/Throwable;
    invoke-interface {v6, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 188
    .end local v0    # "e":Ljava/lang/Throwable;
    :goto_7
    return-void
.end method

.method private final downloadSingle(Ljava/lang/String;Ljava/io/File;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)J
    .locals 24
    .param p1, "url"    # Ljava/lang/String;
    .param p2, "out"    # Ljava/io/File;
    .param p3, "onBytes"    # Lkotlin/jvm/functions/Function1;
    .param p4, "isCancelled"    # Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/io/File;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/Boolean;",
            ">;)J"
        }
    .end annotation

    .line 165
    move-object/from16 v1, p0

    iget-object v2, v1, Lcom/pymcl/core/download/DownloadManager;->http:Lcom/pymcl/core/net/Http;

    invoke-virtual/range {p0 .. p1}, Lcom/pymcl/core/download/DownloadManager;->headersFor(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v4

    const/4 v6, 0x4

    const/4 v7, 0x0

    const/4 v5, 0x0

    move-object/from16 v3, p1

    invoke-static/range {v2 .. v7}, Lcom/pymcl/core/net/Http;->openStream$default(Lcom/pymcl/core/net/Http;Ljava/lang/String;Ljava/util/Map;IILjava/lang/Object;)Lkotlin/Triple;

    move-result-object v0

    invoke-virtual {v0}, Lkotlin/Triple;->component3()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ljava/io/InputStream;

    .line 166
    .local v2, "ins":Ljava/io/InputStream;
    const-wide/16 v3, 0x0

    .line 167
    .local v3, "n":J
    move-object v5, v2

    check-cast v5, Ljava/io/Closeable;

    :try_start_0
    move-object v0, v5

    check-cast v0, Ljava/io/InputStream;

    move-object v6, v0

    .line 209
    .local v6, "i":Ljava/io/InputStream;
    const/4 v7, 0x0

    .local v7, "$i$a$-use-DownloadManager$downloadSingle$2":I
    new-instance v0, Ljava/io/FileOutputStream;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_b

    .line 167
    move-object/from16 v8, p2

    :try_start_1
    invoke-direct {v0, v8}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    move-object v9, v0

    check-cast v9, Ljava/io/Closeable;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_a

    :try_start_2
    move-object v0, v9

    check-cast v0, Ljava/io/FileOutputStream;

    .line 209
    .local v0, "o":Ljava/io/FileOutputStream;
    const/4 v10, 0x0

    .line 167
    .local v10, "$i$a$-use-DownloadManager$downloadSingle$2$1":I
    move-object/from16 v11, p4

    .local v11, "isCancelled$iv":Lkotlin/jvm/functions/Function0;
    move-object v12, v6

    .local v12, "i$iv":Ljava/io/InputStream;
    move-object/from16 v13, p0

    .local v13, "this_$iv":Lcom/pymcl/core/download/DownloadManager;
    const/4 v14, 0x0

    .line 210
    .local v14, "$i$f$pump":I
    const v15, 0x8000

    new-array v15, v15, [B
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_7

    .line 211
    .local v15, "buf$iv":[B
    :goto_0
    :try_start_3
    invoke-direct {v13, v11}, Lcom/pymcl/core/download/DownloadManager;->checkCancel(Lkotlin/jvm/functions/Function0;)V

    invoke-virtual {v12, v15}, Ljava/io/InputStream;->read([B)I

    move-result v16

    move/from16 v17, v16

    .local v17, "r$iv":I
    if-ltz v17, :cond_0

    iget-object v1, v13, Lcom/pymcl/core/download/DownloadManager;->limiter:Lcom/pymcl/core/download/RateLimiter;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_6

    move-object/from16 v16, v2

    move/from16 v2, v17

    .end local v17    # "r$iv":I
    .local v2, "r$iv":I
    .local v16, "ins":Ljava/io/InputStream;
    :try_start_4
    invoke-virtual {v1, v2}, Lcom/pymcl/core/download/RateLimiter;->acquire(I)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    const/4 v1, 0x0

    .local v1, "p1":I
    move-object/from16 v17, v15

    .local v17, "p0":[B
    move/from16 v18, v2

    .local v18, "p2":I
    move-object/from16 v19, v17

    .end local v17    # "p0":[B
    .local v19, "p0":[B
    const/16 v17, 0x0

    .line 167
    .local v17, "$i$a$-pump-DownloadManager$downloadSingle$2$1$1":I
    move/from16 v20, v2

    move-wide/from16 v22, v3

    move-object/from16 v3, v19

    move-wide/from16 v18, v22

    .end local v19    # "p0":[B
    .local v2, "p2":I
    .local v3, "p0":[B
    .local v18, "n":J
    .local v20, "r$iv":I
    :try_start_5
    invoke-virtual {v0, v3, v1, v2}, Ljava/io/FileOutputStream;->write([BII)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 211
    .end local v1    # "p1":I
    .end local v2    # "p2":I
    .end local v3    # "p0":[B
    .end local v17    # "$i$a$-pump-DownloadManager$downloadSingle$2$1$1":I
    move/from16 v1, v20

    .local v1, "it":I
    const/4 v2, 0x0

    .line 167
    .local v2, "$i$a$-pump-DownloadManager$downloadSingle$2$1$2":I
    int-to-long v3, v1

    add-long v3, v18, v3

    move-object/from16 v17, v0

    .end local v0    # "o":Ljava/io/FileOutputStream;
    .end local v18    # "n":J
    .local v3, "n":J
    .local v17, "o":Ljava/io/FileOutputStream;
    :try_start_6
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    move/from16 v21, v1

    move-object/from16 v1, p3

    .end local v1    # "it":I
    .local v21, "it":I
    :try_start_7
    invoke-interface {v1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 211
    nop

    .end local v2    # "$i$a$-pump-DownloadManager$downloadSingle$2$1$2":I
    .end local v21    # "it":I
    move-object/from16 v1, p0

    move-object/from16 v2, v16

    move-object/from16 v0, v17

    .end local v20    # "r$iv":I
    goto :goto_0

    .line 167
    .end local v10    # "$i$a$-use-DownloadManager$downloadSingle$2$1":I
    .end local v11    # "isCancelled$iv":Lkotlin/jvm/functions/Function0;
    .end local v12    # "i$iv":Ljava/io/InputStream;
    .end local v13    # "this_$iv":Lcom/pymcl/core/download/DownloadManager;
    .end local v14    # "$i$f$pump":I
    .end local v15    # "buf$iv":[B
    .end local v17    # "o":Ljava/io/FileOutputStream;
    :catchall_0
    move-exception v0

    goto :goto_1

    :catchall_1
    move-exception v0

    move-object/from16 v1, p3

    :goto_1
    move-object v2, v0

    goto :goto_3

    .end local v3    # "n":J
    .restart local v18    # "n":J
    :catchall_2
    move-exception v0

    move-object/from16 v1, p3

    goto :goto_2

    .end local v18    # "n":J
    .restart local v3    # "n":J
    :catchall_3
    move-exception v0

    move-object/from16 v1, p3

    move-wide/from16 v18, v3

    move-object v2, v0

    .end local v3    # "n":J
    .restart local v18    # "n":J
    goto :goto_3

    .line 211
    .end local v16    # "ins":Ljava/io/InputStream;
    .end local v18    # "n":J
    .restart local v0    # "o":Ljava/io/FileOutputStream;
    .local v2, "ins":Ljava/io/InputStream;
    .restart local v3    # "n":J
    .restart local v10    # "$i$a$-use-DownloadManager$downloadSingle$2$1":I
    .restart local v11    # "isCancelled$iv":Lkotlin/jvm/functions/Function0;
    .restart local v12    # "i$iv":Ljava/io/InputStream;
    .restart local v13    # "this_$iv":Lcom/pymcl/core/download/DownloadManager;
    .restart local v14    # "$i$f$pump":I
    .restart local v15    # "buf$iv":[B
    .local v17, "r$iv":I
    :cond_0
    move-object/from16 v1, p3

    move-object/from16 v16, v2

    move-wide/from16 v18, v3

    move/from16 v20, v17

    move-object/from16 v17, v0

    .line 212
    .end local v0    # "o":Ljava/io/FileOutputStream;
    .end local v2    # "ins":Ljava/io/InputStream;
    .end local v3    # "n":J
    .restart local v16    # "ins":Ljava/io/InputStream;
    .local v17, "o":Ljava/io/FileOutputStream;
    .restart local v18    # "n":J
    nop

    .line 167
    .end local v11    # "isCancelled$iv":Lkotlin/jvm/functions/Function0;
    .end local v12    # "i$iv":Ljava/io/InputStream;
    .end local v13    # "this_$iv":Lcom/pymcl/core/download/DownloadManager;
    .end local v14    # "$i$f$pump":I
    .end local v15    # "buf$iv":[B
    nop

    .end local v10    # "$i$a$-use-DownloadManager$downloadSingle$2$1":I
    .end local v17    # "o":Ljava/io/FileOutputStream;
    :try_start_8
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_5

    const/4 v0, 0x0

    :try_start_9
    invoke-static {v9, v0}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .end local v6    # "i":Ljava/io/InputStream;
    .end local v7    # "$i$a$-use-DownloadManager$downloadSingle$2":I
    sget-object v2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_4

    invoke-static {v5, v0}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 168
    return-wide v18

    .line 167
    :catchall_4
    move-exception v0

    move-object v2, v0

    move-wide/from16 v3, v18

    goto :goto_5

    .restart local v6    # "i":Ljava/io/InputStream;
    .restart local v7    # "$i$a$-use-DownloadManager$downloadSingle$2":I
    :catchall_5
    move-exception v0

    :goto_2
    move-object v2, v0

    move-wide/from16 v3, v18

    goto :goto_3

    .end local v16    # "ins":Ljava/io/InputStream;
    .end local v18    # "n":J
    .restart local v2    # "ins":Ljava/io/InputStream;
    .restart local v3    # "n":J
    :catchall_6
    move-exception v0

    move-object/from16 v1, p3

    move-object/from16 v16, v2

    move-wide/from16 v18, v3

    move-object v2, v0

    .end local v2    # "ins":Ljava/io/InputStream;
    .end local v3    # "n":J
    .restart local v16    # "ins":Ljava/io/InputStream;
    .restart local v18    # "n":J
    goto :goto_3

    .end local v16    # "ins":Ljava/io/InputStream;
    .end local v18    # "n":J
    .restart local v2    # "ins":Ljava/io/InputStream;
    .restart local v3    # "n":J
    :catchall_7
    move-exception v0

    move-object/from16 v1, p3

    move-object/from16 v16, v2

    move-object v2, v0

    .end local v2    # "ins":Ljava/io/InputStream;
    .end local v3    # "n":J
    .end local v6    # "i":Ljava/io/InputStream;
    .end local v7    # "$i$a$-use-DownloadManager$downloadSingle$2":I
    .end local p1    # "url":Ljava/lang/String;
    .end local p2    # "out":Ljava/io/File;
    .end local p3    # "onBytes":Lkotlin/jvm/functions/Function1;
    .end local p4    # "isCancelled":Lkotlin/jvm/functions/Function0;
    :goto_3
    :try_start_a
    throw v2
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_8

    .restart local v3    # "n":J
    .restart local v6    # "i":Ljava/io/InputStream;
    .restart local v7    # "$i$a$-use-DownloadManager$downloadSingle$2":I
    .restart local v16    # "ins":Ljava/io/InputStream;
    .restart local p1    # "url":Ljava/lang/String;
    .restart local p2    # "out":Ljava/io/File;
    .restart local p3    # "onBytes":Lkotlin/jvm/functions/Function1;
    .restart local p4    # "isCancelled":Lkotlin/jvm/functions/Function0;
    :catchall_8
    move-exception v0

    :try_start_b
    invoke-static {v9, v2}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .end local v3    # "n":J
    .end local v16    # "ins":Ljava/io/InputStream;
    .end local p1    # "url":Ljava/lang/String;
    .end local p2    # "out":Ljava/io/File;
    .end local p3    # "onBytes":Lkotlin/jvm/functions/Function1;
    .end local p4    # "isCancelled":Lkotlin/jvm/functions/Function0;
    throw v0
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_9

    .end local v6    # "i":Ljava/io/InputStream;
    .end local v7    # "$i$a$-use-DownloadManager$downloadSingle$2":I
    .restart local v3    # "n":J
    .restart local v16    # "ins":Ljava/io/InputStream;
    .restart local p1    # "url":Ljava/lang/String;
    .restart local p2    # "out":Ljava/io/File;
    .restart local p3    # "onBytes":Lkotlin/jvm/functions/Function1;
    .restart local p4    # "isCancelled":Lkotlin/jvm/functions/Function0;
    :catchall_9
    move-exception v0

    move-object v2, v0

    goto :goto_5

    .end local v16    # "ins":Ljava/io/InputStream;
    .restart local v2    # "ins":Ljava/io/InputStream;
    :catchall_a
    move-exception v0

    goto :goto_4

    :catchall_b
    move-exception v0

    move-object/from16 v8, p2

    :goto_4
    move-object/from16 v1, p3

    move-object/from16 v16, v2

    move-object v2, v0

    .end local v2    # "ins":Ljava/io/InputStream;
    .end local v3    # "n":J
    .end local p1    # "url":Ljava/lang/String;
    .end local p2    # "out":Ljava/io/File;
    .end local p3    # "onBytes":Lkotlin/jvm/functions/Function1;
    .end local p4    # "isCancelled":Lkotlin/jvm/functions/Function0;
    :goto_5
    :try_start_c
    throw v2
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_c

    .restart local v3    # "n":J
    .restart local v16    # "ins":Ljava/io/InputStream;
    .restart local p1    # "url":Ljava/lang/String;
    .restart local p2    # "out":Ljava/io/File;
    .restart local p3    # "onBytes":Lkotlin/jvm/functions/Function1;
    .restart local p4    # "isCancelled":Lkotlin/jvm/functions/Function0;
    :catchall_c
    move-exception v0

    invoke-static {v5, v2}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v0
.end method

.method static synthetic downloadSingle$default(Lcom/pymcl/core/download/DownloadManager;Ljava/lang/String;Ljava/io/File;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;ILjava/lang/Object;)J
    .locals 0

    .line 164
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_0

    new-instance p4, Lcom/pymcl/core/download/DownloadManager$$ExternalSyntheticLambda1;

    invoke-direct {p4}, Lcom/pymcl/core/download/DownloadManager$$ExternalSyntheticLambda1;-><init>()V

    :cond_0
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/pymcl/core/download/DownloadManager;->downloadSingle(Ljava/lang/String;Ljava/io/File;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)J

    move-result-wide p0

    return-wide p0
.end method

.method private static final downloadSingle$lambda$0()Z
    .locals 1

    .line 164
    const/4 v0, 0x0

    return v0
.end method

.method private final pump(Ljava/io/InputStream;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V
    .locals 5
    .param p1, "i"    # Ljava/io/InputStream;
    .param p2, "write"    # Lkotlin/jvm/functions/Function3;
    .param p3, "onBytes"    # Lkotlin/jvm/functions/Function1;
    .param p4, "isCancelled"    # Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/io/InputStream;",
            "Lkotlin/jvm/functions/Function3<",
            "-[B-",
            "Ljava/lang/Integer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x0

    .line 204
    .local v0, "$i$f$pump":I
    const v1, 0x8000

    new-array v1, v1, [B

    .line 205
    .local v1, "buf":[B
    :goto_0
    invoke-direct {p0, p4}, Lcom/pymcl/core/download/DownloadManager;->checkCancel(Lkotlin/jvm/functions/Function0;)V

    invoke-virtual {p1, v1}, Ljava/io/InputStream;->read([B)I

    move-result v2

    .local v2, "r":I
    if-ltz v2, :cond_0

    iget-object v3, p0, Lcom/pymcl/core/download/DownloadManager;->limiter:Lcom/pymcl/core/download/RateLimiter;

    invoke-virtual {v3, v2}, Lcom/pymcl/core/download/RateLimiter;->acquire(I)V

    const/4 v3, 0x0

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {p2, v1, v3, v4}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {p3, v3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 206
    .end local v2    # "r":I
    :cond_0
    return-void
.end method


# virtual methods
.method public final download(Lcom/pymcl/core/download/DownloadItem;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V
    .locals 3
    .param p1, "item"    # Lcom/pymcl/core/download/DownloadItem;
    .param p2, "onBytes"    # Lkotlin/jvm/functions/Function1;
    .param p3, "isCancelled"    # Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/pymcl/core/download/DownloadItem;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    const-string v0, "item"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onBytes"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "isCancelled"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 121
    sget-object v0, Lcom/pymcl/core/download/DownloadManager;->Companion:Lcom/pymcl/core/download/DownloadManager$Companion;

    invoke-virtual {p1}, Lcom/pymcl/core/download/DownloadItem;->getDest()Ljava/io/File;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/pymcl/core/download/DownloadManager$Companion;->lockOf$PyMCL_Android_core(Ljava/io/File;)Ljava/util/concurrent/locks/ReentrantLock;

    move-result-object v0

    .line 122
    .local v0, "lock":Ljava/util/concurrent/locks/ReentrantLock;
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->tryLock()Z

    move-result v1

    xor-int/lit8 v1, v1, 0x1

    .line 123
    .local v1, "waited":Z
    if-eqz v1, :cond_0

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    .line 124
    :cond_0
    nop

    .line 125
    if-eqz v1, :cond_1

    :try_start_0
    invoke-virtual {p0, p1}, Lcom/pymcl/core/download/DownloadManager;->isValid(Lcom/pymcl/core/download/DownloadItem;)Z

    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v2, :cond_1

    .line 127
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 125
    return-void

    .line 126
    :cond_1
    :try_start_1
    invoke-direct {p0, p1, p2, p3}, Lcom/pymcl/core/download/DownloadManager;->downloadLocked(Lcom/pymcl/core/download/DownloadItem;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 127
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 128
    return-void

    .line 127
    :catchall_0
    move-exception v2

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    throw v2
.end method

.method public final downloadAll(Ljava/lang/String;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 6
    .param p1, "name"    # Ljava/lang/String;
    .param p2, "items"    # Ljava/util/List;
    .param p3, "onProgress"    # Lkotlin/jvm/functions/Function1;
    .param p4, "$completion"    # Lkotlin/coroutines/Continuation;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/pymcl/core/download/DownloadItem;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/pymcl/core/download/DownloadProgress;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 81
    new-instance v0, Lcom/pymcl/core/download/DownloadManager$downloadAll$2;

    const/4 v5, 0x0

    move-object v2, p0

    move-object v3, p1

    move-object v1, p2

    move-object v4, p3

    .end local p1    # "name":Ljava/lang/String;
    .end local p2    # "items":Ljava/util/List;
    .end local p3    # "onProgress":Lkotlin/jvm/functions/Function1;
    .local v1, "items":Ljava/util/List;
    .local v3, "name":Ljava/lang/String;
    .local v4, "onProgress":Lkotlin/jvm/functions/Function1;
    invoke-direct/range {v0 .. v5}, Lcom/pymcl/core/download/DownloadManager$downloadAll$2;-><init>(Ljava/util/List;Lcom/pymcl/core/download/DownloadManager;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)V

    check-cast v0, Lkotlin/jvm/functions/Function2;

    invoke-static {v0, p4}, Lkotlinx/coroutines/CoroutineScopeKt;->coroutineScope(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 106
    return-object p1
.end method

.method public final getCurseforgeKey()Lkotlin/jvm/functions/Function0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 61
    iget-object v0, p0, Lcom/pymcl/core/download/DownloadManager;->curseforgeKey:Lkotlin/jvm/functions/Function0;

    return-object v0
.end method

.method public final getLimiter()Lcom/pymcl/core/download/RateLimiter;
    .locals 1

    .line 70
    iget-object v0, p0, Lcom/pymcl/core/download/DownloadManager;->limiter:Lcom/pymcl/core/download/RateLimiter;

    return-object v0
.end method

.method public final getProgress()Lkotlinx/coroutines/flow/StateFlow;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Lcom/pymcl/core/download/DownloadProgress;",
            ">;"
        }
    .end annotation

    .line 72
    iget-object v0, p0, Lcom/pymcl/core/download/DownloadManager;->progress:Lkotlinx/coroutines/flow/StateFlow;

    return-object v0
.end method

.method public final getRetries()I
    .locals 1

    .line 60
    iget v0, p0, Lcom/pymcl/core/download/DownloadManager;->retries:I

    return v0
.end method

.method public final getSegments()I
    .locals 1

    .line 58
    iget v0, p0, Lcom/pymcl/core/download/DownloadManager;->segments:I

    return v0
.end method

.method public final getThreads()I
    .locals 1

    .line 57
    iget v0, p0, Lcom/pymcl/core/download/DownloadManager;->threads:I

    return v0
.end method

.method public final headersFor(Ljava/lang/String;)Ljava/util/Map;
    .locals 8
    .param p1, "url"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    const-string v0, "url"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 75
    const/4 v0, 0x1

    new-array v1, v0, [Lkotlin/Pair;

    const-string v2, "User-Agent"

    const-string v3, "PyMCL/1.0.1"

    invoke-static {v2, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v1}, Lkotlin/collections/MapsKt;->linkedMapOf([Lkotlin/Pair;)Ljava/util/LinkedHashMap;

    move-result-object v1

    .line 76
    .local v1, "h":Ljava/util/LinkedHashMap;
    move-object v2, p1

    check-cast v2, Ljava/lang/CharSequence;

    const-string v4, "api.curseforge.com"

    check-cast v4, Ljava/lang/CharSequence;

    const/4 v5, 0x2

    const/4 v6, 0x0

    invoke-static {v2, v4, v3, v5, v6}, Lkotlin/text/StringsKt;->contains$default(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    move-object v2, p1

    check-cast v2, Ljava/lang/CharSequence;

    const-string v4, "/curseforge/v1/"

    check-cast v4, Ljava/lang/CharSequence;

    invoke-static {v2, v4, v3, v5, v6}, Lkotlin/text/StringsKt;->contains$default(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    :cond_0
    iget-object v2, p0, Lcom/pymcl/core/download/DownloadManager;->curseforgeKey:Lkotlin/jvm/functions/Function0;

    invoke-interface {v2}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object v2

    move-object v4, v2

    check-cast v4, Ljava/lang/String;

    .line 209
    .local v4, "it":Ljava/lang/String;
    const/4 v5, 0x0

    .line 76
    .local v5, "$i$a$-takeIf-DownloadManager$headersFor$1":I
    move-object v7, v4

    check-cast v7, Ljava/lang/CharSequence;

    invoke-interface {v7}, Ljava/lang/CharSequence;->length()I

    move-result v7

    if-lez v7, :cond_1

    goto :goto_0

    :cond_1
    move v0, v3

    .end local v4    # "it":Ljava/lang/String;
    .end local v5    # "$i$a$-takeIf-DownloadManager$headersFor$1":I
    :goto_0
    if-eqz v0, :cond_2

    move-object v6, v2

    :cond_2
    check-cast v6, Ljava/lang/String;

    if-eqz v6, :cond_3

    .line 209
    .local v6, "it":Ljava/lang/String;
    const/4 v0, 0x0

    .line 76
    .local v0, "$i$a$-let-DownloadManager$headersFor$2":I
    move-object v2, v1

    check-cast v2, Ljava/util/Map;

    const-string v3, "x-api-key"

    invoke-interface {v2, v3, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 77
    .end local v0    # "$i$a$-let-DownloadManager$headersFor$2":I
    .end local v6    # "it":Ljava/lang/String;
    :cond_3
    move-object v0, v1

    check-cast v0, Ljava/util/Map;

    return-object v0
.end method

.method public final isValid(Lcom/pymcl/core/download/DownloadItem;)Z
    .locals 7
    .param p1, "item"    # Lcom/pymcl/core/download/DownloadItem;

    const-string v0, "item"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 109
    invoke-virtual {p1}, Lcom/pymcl/core/download/DownloadItem;->getDest()Ljava/io/File;

    move-result-object v0

    .local v0, "f":Ljava/io/File;
    invoke-virtual {v0}, Ljava/io/File;->isFile()Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_0

    return v2

    .line 110
    :cond_0
    invoke-virtual {p1}, Lcom/pymcl/core/download/DownloadItem;->getSize()Ljava/lang/Long;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-virtual {p1}, Lcom/pymcl/core/download/DownloadItem;->getSize()Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    const-wide/16 v5, 0x0

    cmp-long v1, v3, v5

    if-lez v1, :cond_2

    invoke-virtual {v0}, Ljava/io/File;->length()J

    move-result-wide v3

    invoke-virtual {p1}, Lcom/pymcl/core/download/DownloadItem;->getSize()Ljava/lang/Long;

    move-result-object v1

    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v5

    cmp-long v1, v3, v5

    if-eqz v1, :cond_2

    :goto_0
    return v2

    .line 111
    :cond_2
    invoke-virtual {p1}, Lcom/pymcl/core/download/DownloadItem;->getHash()Ljava/lang/String;

    move-result-object v1

    check-cast v1, Ljava/lang/CharSequence;

    const/4 v3, 0x1

    if-eqz v1, :cond_4

    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-nez v1, :cond_3

    goto :goto_1

    :cond_3
    move v1, v2

    goto :goto_2

    :cond_4
    :goto_1
    move v1, v3

    :goto_2
    if-nez v1, :cond_5

    sget-object v1, Lcom/pymcl/core/util/FileUtil;->INSTANCE:Lcom/pymcl/core/util/FileUtil;

    invoke-virtual {p1}, Lcom/pymcl/core/download/DownloadItem;->getHash()Ljava/lang/String;

    move-result-object v4

    invoke-direct {p0, v4}, Lcom/pymcl/core/download/DownloadManager;->algoOf(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v0, v4}, Lcom/pymcl/core/util/FileUtil;->hash(Ljava/io/File;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/pymcl/core/download/DownloadItem;->getHash()Ljava/lang/String;

    move-result-object v4

    invoke-static {v1, v4, v3}, Lkotlin/text/StringsKt;->equals(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v1

    if-eqz v1, :cond_6

    :cond_5
    move v2, v3

    :cond_6
    return v2
.end method

.method public final setCurseforgeKey(Lkotlin/jvm/functions/Function0;)V
    .locals 1
    .param p1, "<set-?>"    # Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 61
    iput-object p1, p0, Lcom/pymcl/core/download/DownloadManager;->curseforgeKey:Lkotlin/jvm/functions/Function0;

    return-void
.end method

.method public final setRetries(I)V
    .locals 0
    .param p1, "<set-?>"    # I

    .line 60
    iput p1, p0, Lcom/pymcl/core/download/DownloadManager;->retries:I

    return-void
.end method

.method public final setSegments(I)V
    .locals 0
    .param p1, "<set-?>"    # I

    .line 58
    iput p1, p0, Lcom/pymcl/core/download/DownloadManager;->segments:I

    return-void
.end method

.method public final setThreads(I)V
    .locals 0
    .param p1, "<set-?>"    # I

    .line 57
    iput p1, p0, Lcom/pymcl/core/download/DownloadManager;->threads:I

    return-void
.end method
