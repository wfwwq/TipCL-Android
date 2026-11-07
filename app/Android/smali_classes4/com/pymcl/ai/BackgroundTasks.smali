.class public final Lcom/pymcl/ai/BackgroundTasks;
.super Ljava/lang/Object;
.source "Background.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/pymcl/ai/BackgroundTasks$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nBackground.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Background.kt\ncom/pymcl/ai/BackgroundTasks\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,166:1\n1#2:167\n1739#3:168\n1814#3,3:169\n2068#3,2:172\n1221#3:174\n777#3:175\n873#3,2:176\n1739#3:178\n1814#3,3:179\n777#3:182\n873#3,2:183\n2068#3,2:185\n1221#3:187\n777#3:188\n873#3,2:189\n1739#3:191\n1814#3,3:192\n777#3:195\n873#3,2:196\n2068#3,2:198\n2068#3,2:200\n2068#3,2:202\n777#3:204\n873#3,2:205\n1221#3:207\n777#3:208\n873#3,2:209\n777#3:211\n873#3,2:212\n2068#3,2:214\n2068#3,2:216\n2068#3,2:218\n*S KotlinDebug\n*F\n+ 1 Background.kt\ncom/pymcl/ai/BackgroundTasks\n*L\n56#1:168\n56#1:169,3\n56#1:172,2\n67#1:174\n68#1:175\n68#1:176,2\n68#1:178\n68#1:179,3\n68#1:182\n68#1:183,2\n69#1:185,2\n70#1:187\n70#1:188\n70#1:189,2\n71#1:191\n71#1:192,3\n114#1:195\n114#1:196,2\n115#1:198,2\n116#1:200,2\n118#1:202,2\n123#1:204\n123#1:205,2\n123#1:207\n124#1:208\n124#1:209,2\n125#1:211\n125#1:212,2\n131#1:214,2\n142#1:216,2\n150#1:218,2\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0008\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\"\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u0000 D2\u00020\u0001:\u0001DB\u001b\u0012\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0008\u0010\u001d\u001a\u00020\u0016H\u0002J&\u0010\u001e\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u001f\u001a\u00020\n2\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\u0015H\u0002J|\u0010!\u001a\u00020\n2\u0006\u0010\"\u001a\u00020\n2\u0006\u0010#\u001a\u00020\n2\u0006\u0010$\u001a\u00020\n2\u0006\u0010%\u001a\u00020\n2\u0008\u0008\u0002\u0010&\u001a\u00020\n2E\u0010\'\u001aA\u0008\u0001\u0012\'\u0012%\u0012\u0006\u0012\u0004\u0018\u00010)\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00160(\u00a2\u0006\u000c\u0008*\u0012\u0008\u0008+\u0012\u0004\u0008\u0008(,\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020.0-\u0012\u0006\u0012\u0004\u0018\u00010\u00010(\u00a2\u0006\u0002\u0010/J\u000e\u00100\u001a\u0002012\u0006\u0010\u001f\u001a\u00020\nJ8\u00105\u001a\u0008\u0012\u0004\u0012\u00020\u000b062\u0006\u0010\"\u001a\u00020\n2\u000c\u00107\u001a\u0008\u0012\u0004\u0012\u00020\n082\u000c\u00109\u001a\u0008\u0012\u0004\u0012\u00020\n08H\u0086@\u00a2\u0006\u0002\u0010:J\u0010\u0010;\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u001f\u001a\u00020\nJ\u0018\u0010<\u001a\u0008\u0012\u0004\u0012\u00020\u000b062\n\u0008\u0002\u0010\"\u001a\u0004\u0018\u00010\nJ\u0014\u0010=\u001a\u0008\u0012\u0004\u0012\u00020\u000b062\u0006\u0010\"\u001a\u00020\nJ\u0014\u0010>\u001a\u0008\u0012\u0004\u0012\u00020\u000b062\u0006\u0010\"\u001a\u00020\nJ\u0014\u0010?\u001a\u0008\u0012\u0004\u0012\u00020\u000b062\u0006\u0010\"\u001a\u00020\nJ\u001c\u0010@\u001a\u00020A2\n\u0008\u0002\u0010\"\u001a\u0004\u0018\u00010\n2\u0008\u0008\u0002\u0010B\u001a\u000201J\u000e\u0010C\u001a\u00020\u00162\u0006\u0010\"\u001a\u00020\nR\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0008\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000c\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\r0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\u0011\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010\u0013R(\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0017\u0010\u0018\"\u0004\u0008\u0019\u0010\u001aR\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u000e\u00a2\u0006\u0002\n\u0000RN\u00102\u001aB\u0012\u000c\u0012\n 4*\u0004\u0018\u00010\n0\n\u0012\u000c\u0012\n 4*\u0004\u0018\u00010101 4* \u0012\u000c\u0012\n 4*\u0004\u0018\u00010\n0\n\u0012\u000c\u0012\n 4*\u0004\u0018\u00010101\u0018\u00010303X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006E"
    }
    d2 = {
        "Lcom/pymcl/ai/BackgroundTasks;",
        "",
        "file",
        "Ljava/io/File;",
        "scope",
        "Lkotlinx/coroutines/CoroutineScope;",
        "<init>",
        "(Ljava/io/File;Lkotlinx/coroutines/CoroutineScope;)V",
        "tasks",
        "Ljava/util/concurrent/ConcurrentHashMap;",
        "",
        "Lcom/pymcl/ai/BgTaskInfo;",
        "jobs",
        "Lkotlinx/coroutines/Job;",
        "_events",
        "Lkotlinx/coroutines/flow/MutableSharedFlow;",
        "events",
        "Lkotlinx/coroutines/flow/SharedFlow;",
        "getEvents",
        "()Lkotlinx/coroutines/flow/SharedFlow;",
        "onFinished",
        "Lkotlin/Function1;",
        "",
        "getOnFinished",
        "()Lkotlin/jvm/functions/Function1;",
        "setOnFinished",
        "(Lkotlin/jvm/functions/Function1;)V",
        "seq",
        "",
        "persist",
        "update",
        "id",
        "f",
        "start",
        "chatId",
        "callId",
        "tool",
        "title",
        "turnId",
        "block",
        "Lkotlin/Function2;",
        "",
        "Lkotlin/ParameterName;",
        "name",
        "progress",
        "Lkotlin/coroutines/Continuation;",
        "Lcom/pymcl/ai/ToolOutput;",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)Ljava/lang/String;",
        "cancel",
        "",
        "silentCancel",
        "Ljava/util/concurrent/ConcurrentHashMap$KeySetView;",
        "kotlin.jvm.PlatformType",
        "cancelForRewind",
        "",
        "turnIds",
        "",
        "callIds",
        "(Ljava/lang/String;Ljava/util/Set;Ljava/util/Set;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "get",
        "list",
        "running",
        "unreported",
        "takeFinished",
        "clearFinished",
        "Lcom/pymcl/ai/BgClearResult;",
        "keepUnreported",
        "dropChat",
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
.field public static final Companion:Lcom/pymcl/ai/BackgroundTasks$Companion;

.field public static final KEEP_REPORTED:I = 0x1e

.field public static final MAX_RESULT:I = 0xbb8


# instance fields
.field private final _events:Lkotlinx/coroutines/flow/MutableSharedFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/MutableSharedFlow<",
            "Lcom/pymcl/ai/BgTaskInfo;",
            ">;"
        }
    .end annotation
.end field

.field private final events:Lkotlinx/coroutines/flow/SharedFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/SharedFlow<",
            "Lcom/pymcl/ai/BgTaskInfo;",
            ">;"
        }
    .end annotation
.end field

.field private final file:Ljava/io/File;

.field private final jobs:Ljava/util/concurrent/ConcurrentHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentHashMap<",
            "Ljava/lang/String;",
            "Lkotlinx/coroutines/Job;",
            ">;"
        }
    .end annotation
.end field

.field private volatile onFinished:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/pymcl/ai/BgTaskInfo;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field private final scope:Lkotlinx/coroutines/CoroutineScope;

.field private seq:I

.field private final silentCancel:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentHashMap$KeySetView<",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final tasks:Ljava/util/concurrent/ConcurrentHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentHashMap<",
            "Ljava/lang/String;",
            "Lcom/pymcl/ai/BgTaskInfo;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static synthetic $r8$lambda$Gq5q_K2xy_efrQMeVIUK4gdcClQ(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Ljava/lang/Object;)Lcom/pymcl/ai/BgTaskInfo;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/pymcl/ai/BackgroundTasks;->update$lambda$1(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Ljava/lang/Object;)Lcom/pymcl/ai/BgTaskInfo;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$Gygsd49-nDHGymAyocAskspIIFI(Ljava/lang/String;Lcom/pymcl/ai/BgTaskInfo;)Lcom/pymcl/ai/BgTaskInfo;
    .locals 0

    invoke-static {p0, p1}, Lcom/pymcl/ai/BackgroundTasks;->cancelForRewind$lambda$3$0(Ljava/lang/String;Lcom/pymcl/ai/BgTaskInfo;)Lcom/pymcl/ai/BgTaskInfo;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$MFh_i5B_LEFEuHqfvLw-DurP3ZY(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Ljava/lang/Object;)Lcom/pymcl/ai/BgTaskInfo;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/pymcl/ai/BackgroundTasks;->cancelForRewind$lambda$3$1(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Ljava/lang/Object;)Lcom/pymcl/ai/BgTaskInfo;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$hhUru8YFD9r4gT9cww8PKgU30hs(Lkotlin/jvm/functions/Function1;Ljava/lang/String;Lcom/pymcl/ai/BgTaskInfo;)Lcom/pymcl/ai/BgTaskInfo;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/pymcl/ai/BackgroundTasks;->update$lambda$0(Lkotlin/jvm/functions/Function1;Ljava/lang/String;Lcom/pymcl/ai/BgTaskInfo;)Lcom/pymcl/ai/BgTaskInfo;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$yRpgyV8FZXlQZDCHFQOajd1NVyg(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Ljava/lang/Object;)Lcom/pymcl/ai/BgTaskInfo;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/pymcl/ai/BackgroundTasks;->takeFinished$lambda$0$1(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Ljava/lang/Object;)Lcom/pymcl/ai/BgTaskInfo;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$zlQQHy7hDPrnbUE2E-N7V0qZkSM(Ljava/lang/String;Lcom/pymcl/ai/BgTaskInfo;)Lcom/pymcl/ai/BgTaskInfo;
    .locals 0

    invoke-static {p0, p1}, Lcom/pymcl/ai/BackgroundTasks;->takeFinished$lambda$0$0(Ljava/lang/String;Lcom/pymcl/ai/BgTaskInfo;)Lcom/pymcl/ai/BgTaskInfo;

    move-result-object p0

    return-object p0
.end method

.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/pymcl/ai/BackgroundTasks$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/pymcl/ai/BackgroundTasks$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/pymcl/ai/BackgroundTasks;->Companion:Lcom/pymcl/ai/BackgroundTasks$Companion;

    return-void
.end method

.method public constructor <init>(Ljava/io/File;Lkotlinx/coroutines/CoroutineScope;)V
    .locals 31
    .param p1, "file"    # Ljava/io/File;
    .param p2, "scope"    # Lkotlinx/coroutines/CoroutineScope;

    move-object/from16 v1, p0

    move-object/from16 v2, p2

    const-string v0, "scope"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 42
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    move-object/from16 v3, p1

    iput-object v3, v1, Lcom/pymcl/ai/BackgroundTasks;->file:Ljava/io/File;

    iput-object v2, v1, Lcom/pymcl/ai/BackgroundTasks;->scope:Lkotlinx/coroutines/CoroutineScope;

    .line 45
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, v1, Lcom/pymcl/ai/BackgroundTasks;->tasks:Ljava/util/concurrent/ConcurrentHashMap;

    .line 46
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, v1, Lcom/pymcl/ai/BackgroundTasks;->jobs:Ljava/util/concurrent/ConcurrentHashMap;

    .line 47
    const/4 v0, 0x5

    const/4 v4, 0x0

    const/16 v5, 0x100

    const/4 v6, 0x0

    invoke-static {v4, v5, v6, v0, v6}, Lkotlinx/coroutines/flow/SharedFlowKt;->MutableSharedFlow$default(IILkotlinx/coroutines/channels/BufferOverflow;ILjava/lang/Object;)Lkotlinx/coroutines/flow/MutableSharedFlow;

    move-result-object v0

    iput-object v0, v1, Lcom/pymcl/ai/BackgroundTasks;->_events:Lkotlinx/coroutines/flow/MutableSharedFlow;

    .line 49
    iget-object v0, v1, Lcom/pymcl/ai/BackgroundTasks;->_events:Lkotlinx/coroutines/flow/MutableSharedFlow;

    check-cast v0, Lkotlinx/coroutines/flow/SharedFlow;

    iput-object v0, v1, Lcom/pymcl/ai/BackgroundTasks;->events:Lkotlinx/coroutines/flow/SharedFlow;

    .line 54
    nop

    .line 55
    iget-object v0, v1, Lcom/pymcl/ai/BackgroundTasks;->file:Ljava/io/File;

    if-eqz v0, :cond_6

    move-object v4, v0

    .line 167
    .local v4, "it":Ljava/io/File;
    const/4 v5, 0x0

    .line 55
    .local v5, "$i$a$-takeIf-BackgroundTasks$1":I
    invoke-virtual {v4}, Ljava/io/File;->isFile()Z

    move-result v4

    .end local v4    # "it":Ljava/io/File;
    .end local v5    # "$i$a$-takeIf-BackgroundTasks$1":I
    if-eqz v4, :cond_0

    goto :goto_0

    :cond_0
    move-object v0, v6

    :goto_0
    if-eqz v0, :cond_6

    move-object v4, v0

    .local v4, "f":Ljava/io/File;
    const/4 v5, 0x0

    .line 56
    .local v5, "$i$a$-let-BackgroundTasks$2":I
    :try_start_0
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object v0, v1

    check-cast v0, Lcom/pymcl/ai/BackgroundTasks;

    .line 167
    .local v0, "$this$lambda_u241_u240":Lcom/pymcl/ai/BackgroundTasks;
    const/4 v7, 0x0

    .line 56
    .local v7, "$i$a$-runCatching-BackgroundTasks$2$1":I
    sget-object v8, Lcom/pymcl/core/util/FileUtil;->INSTANCE:Lcom/pymcl/core/util/FileUtil;

    invoke-virtual {v8, v4}, Lcom/pymcl/core/util/FileUtil;->readJsonObj(Ljava/io/File;)Ljava/util/Map;

    move-result-object v8

    .end local v0    # "$this$lambda_u241_u240":Lcom/pymcl/ai/BackgroundTasks;
    .end local v7    # "$i$a$-runCatching-BackgroundTasks$2$1":I
    invoke-static {v8}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v0

    sget-object v7, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    :goto_1
    invoke-static {v0}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_1

    move-object v0, v6

    :cond_1
    check-cast v0, Ljava/util/Map;

    if-eqz v0, :cond_2

    const-string v6, "tasks"

    invoke-static {v0, v6}, Lcom/pymcl/core/util/JsonKt;->arr(Ljava/util/Map;Ljava/lang/String;)Ljava/util/List;

    move-result-object v6

    :cond_2
    invoke-static {v6}, Lcom/pymcl/core/util/JsonKt;->objs(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    .local v0, "$this$map$iv":Ljava/lang/Iterable;
    sget-object v6, Lcom/pymcl/ai/BgTaskInfo;->Companion:Lcom/pymcl/ai/BgTaskInfo$Companion;

    const/4 v7, 0x0

    .line 168
    .local v7, "$i$f$map":I
    new-instance v8, Ljava/util/ArrayList;

    const/16 v9, 0xa

    invoke-static {v0, v9}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v9

    invoke-direct {v8, v9}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v8, Ljava/util/Collection;

    .local v8, "destination$iv$iv":Ljava/util/Collection;
    move-object v9, v0

    .local v9, "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    const/4 v10, 0x0

    .line 169
    .local v10, "$i$f$mapTo":I
    invoke-interface {v9}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :goto_2
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_3

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    .line 170
    .local v12, "item$iv$iv":Ljava/lang/Object;
    move-object v13, v12

    check-cast v13, Ljava/util/Map;

    .local v13, "p0":Ljava/util/Map;
    const/4 v14, 0x0

    .line 56
    .local v14, "$i$a$-map-BackgroundTasks$2$2":I
    invoke-virtual {v6, v13}, Lcom/pymcl/ai/BgTaskInfo$Companion;->from(Ljava/util/Map;)Lcom/pymcl/ai/BgTaskInfo;

    move-result-object v13

    .line 170
    .end local v13    # "p0":Ljava/util/Map;
    .end local v14    # "$i$a$-map-BackgroundTasks$2$2":I
    invoke-interface {v8, v13}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 171
    .end local v12    # "item$iv$iv":Ljava/lang/Object;
    :cond_3
    nop

    .end local v8    # "destination$iv$iv":Ljava/util/Collection;
    .end local v9    # "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    .end local v10    # "$i$f$mapTo":I
    move-object v6, v8

    check-cast v6, Ljava/util/List;

    .line 168
    nop

    .end local v0    # "$this$map$iv":Ljava/lang/Iterable;
    .end local v7    # "$i$f$map":I
    check-cast v6, Ljava/lang/Iterable;

    .line 56
    nop

    .local v6, "$this$forEach$iv":Ljava/lang/Iterable;
    const/4 v0, 0x0

    .line 172
    .local v0, "$i$f$forEach":I
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_3
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_5

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    .local v8, "element$iv":Ljava/lang/Object;
    move-object v9, v8

    check-cast v9, Lcom/pymcl/ai/BgTaskInfo;

    .local v9, "t":Lcom/pymcl/ai/BgTaskInfo;
    const/16 v27, 0x0

    .line 57
    .local v27, "$i$a$-forEach-BackgroundTasks$2$3":I
    iget-object v10, v1, Lcom/pymcl/ai/BackgroundTasks;->tasks:Ljava/util/concurrent/ConcurrentHashMap;

    check-cast v10, Ljava/util/Map;

    invoke-virtual {v9}, Lcom/pymcl/ai/BgTaskInfo;->getId()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v9}, Lcom/pymcl/ai/BgTaskInfo;->getState()Ljava/lang/String;

    move-result-object v12

    const-string v13, "running"

    invoke-static {v12, v13}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_4

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v21

    const/16 v25, 0x1bdf

    const/16 v26, 0x0

    move-object v12, v10

    const/4 v10, 0x0

    move-object v13, v11

    const/4 v11, 0x0

    move-object v14, v12

    const/4 v12, 0x0

    move-object v15, v13

    const/4 v13, 0x0

    move-object/from16 v16, v14

    const/4 v14, 0x0

    move-object/from16 v17, v15

    const-string v15, "interrupted"

    move-object/from16 v18, v16

    const/16 v16, 0x0

    move-object/from16 v19, v17

    const/16 v17, 0x0

    move-object/from16 v20, v18

    const/16 v18, 0x0

    move-object/from16 v24, v19

    move-object/from16 v23, v20

    const-wide/16 v19, 0x0

    move-object/from16 v28, v23

    const/16 v23, 0x0

    move-object/from16 v29, v24

    const/16 v24, 0x0

    move/from16 v30, v0

    move-object/from16 v0, v28

    move-object/from16 v2, v29

    .end local v0    # "$i$f$forEach":I
    .local v30, "$i$f$forEach":I
    invoke-static/range {v9 .. v26}, Lcom/pymcl/ai/BgTaskInfo;->copy$default(Lcom/pymcl/ai/BgTaskInfo;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/String;JJZLjava/lang/String;ILjava/lang/Object;)Lcom/pymcl/ai/BgTaskInfo;

    move-result-object v10

    goto :goto_4

    .end local v30    # "$i$f$forEach":I
    .restart local v0    # "$i$f$forEach":I
    :cond_4
    move/from16 v30, v0

    move-object v0, v10

    move-object v2, v11

    .end local v0    # "$i$f$forEach":I
    .restart local v30    # "$i$f$forEach":I
    move-object v10, v9

    :goto_4
    invoke-interface {v0, v2, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    nop

    .line 172
    .end local v9    # "t":Lcom/pymcl/ai/BgTaskInfo;
    .end local v27    # "$i$a$-forEach-BackgroundTasks$2$3":I
    move-object/from16 v2, p2

    move/from16 v0, v30

    .end local v8    # "element$iv":Ljava/lang/Object;
    goto :goto_3

    .line 173
    .end local v30    # "$i$f$forEach":I
    .restart local v0    # "$i$f$forEach":I
    :cond_5
    move/from16 v30, v0

    .line 59
    .end local v0    # "$i$f$forEach":I
    .end local v6    # "$this$forEach$iv":Ljava/lang/Iterable;
    nop

    .line 55
    .end local v4    # "f":Ljava/io/File;
    .end local v5    # "$i$a$-let-BackgroundTasks$2":I
    :cond_6
    nop

    .line 60
    nop

    .line 107
    invoke-static {}, Ljava/util/concurrent/ConcurrentHashMap;->newKeySet()Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    move-result-object v0

    iput-object v0, v1, Lcom/pymcl/ai/BackgroundTasks;->silentCancel:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 42
    return-void
.end method

.method public synthetic constructor <init>(Ljava/io/File;Lkotlinx/coroutines/CoroutineScope;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 42
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x1

    const/4 p3, 0x0

    invoke-static {p3, p2, p3}, Lkotlinx/coroutines/SupervisorKt;->SupervisorJob$default(Lkotlinx/coroutines/Job;ILjava/lang/Object;)Lkotlinx/coroutines/CompletableJob;

    move-result-object p2

    invoke-static {}, Lkotlinx/coroutines/Dispatchers;->getIO()Lkotlinx/coroutines/CoroutineDispatcher;

    move-result-object p3

    check-cast p3, Lkotlin/coroutines/CoroutineContext;

    invoke-interface {p2, p3}, Lkotlinx/coroutines/CompletableJob;->plus(Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;

    move-result-object p2

    invoke-static {p2}, Lkotlinx/coroutines/CoroutineScopeKt;->CoroutineScope(Lkotlin/coroutines/CoroutineContext;)Lkotlinx/coroutines/CoroutineScope;

    move-result-object p2

    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/pymcl/ai/BackgroundTasks;-><init>(Ljava/io/File;Lkotlinx/coroutines/CoroutineScope;)V

    return-void
.end method

.method public static final synthetic access$getJobs$p(Lcom/pymcl/ai/BackgroundTasks;)Ljava/util/concurrent/ConcurrentHashMap;
    .locals 1
    .param p0, "$this"    # Lcom/pymcl/ai/BackgroundTasks;

    .line 42
    iget-object v0, p0, Lcom/pymcl/ai/BackgroundTasks;->jobs:Ljava/util/concurrent/ConcurrentHashMap;

    return-object v0
.end method

.method public static final synthetic access$getSilentCancel$p(Lcom/pymcl/ai/BackgroundTasks;)Ljava/util/concurrent/ConcurrentHashMap$KeySetView;
    .locals 1
    .param p0, "$this"    # Lcom/pymcl/ai/BackgroundTasks;

    .line 42
    iget-object v0, p0, Lcom/pymcl/ai/BackgroundTasks;->silentCancel:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    return-object v0
.end method

.method public static final synthetic access$persist(Lcom/pymcl/ai/BackgroundTasks;)V
    .locals 0
    .param p0, "$this"    # Lcom/pymcl/ai/BackgroundTasks;

    .line 42
    invoke-direct {p0}, Lcom/pymcl/ai/BackgroundTasks;->persist()V

    return-void
.end method

.method public static final synthetic access$update(Lcom/pymcl/ai/BackgroundTasks;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Lcom/pymcl/ai/BgTaskInfo;
    .locals 1
    .param p0, "$this"    # Lcom/pymcl/ai/BackgroundTasks;
    .param p1, "id"    # Ljava/lang/String;
    .param p2, "f"    # Lkotlin/jvm/functions/Function1;

    .line 42
    invoke-direct {p0, p1, p2}, Lcom/pymcl/ai/BackgroundTasks;->update(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Lcom/pymcl/ai/BgTaskInfo;

    move-result-object v0

    return-object v0
.end method

.method private static final cancelForRewind$lambda$3$0(Ljava/lang/String;Lcom/pymcl/ai/BgTaskInfo;)Lcom/pymcl/ai/BgTaskInfo;
    .locals 19
    .param p1, "x"    # Lcom/pymcl/ai/BgTaskInfo;

    const-string v0, "<unused var>"

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "x"

    move-object/from16 v1, p1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 118
    invoke-virtual {v1}, Lcom/pymcl/ai/BgTaskInfo;->getRunning()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/16 v17, 0x17ff

    const/16 v18, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const-wide/16 v11, 0x0

    const-wide/16 v13, 0x0

    const/4 v15, 0x1

    const/16 v16, 0x0

    invoke-static/range {v1 .. v18}, Lcom/pymcl/ai/BgTaskInfo;->copy$default(Lcom/pymcl/ai/BgTaskInfo;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/String;JJZLjava/lang/String;ILjava/lang/Object;)Lcom/pymcl/ai/BgTaskInfo;

    move-result-object v0

    move-object v1, v0

    :goto_0
    return-object v1
.end method

.method private static final cancelForRewind$lambda$3$1(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Ljava/lang/Object;)Lcom/pymcl/ai/BgTaskInfo;
    .locals 1
    .param p0, "$tmp0"    # Lkotlin/jvm/functions/Function2;
    .param p1, "p0"    # Ljava/lang/Object;
    .param p2, "p1"    # Ljava/lang/Object;

    .line 118
    invoke-interface {p0, p1, p2}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/pymcl/ai/BgTaskInfo;

    return-object v0
.end method

.method public static synthetic clearFinished$default(Lcom/pymcl/ai/BackgroundTasks;Ljava/lang/String;ZILjava/lang/Object;)Lcom/pymcl/ai/BgClearResult;
    .locals 0

    .line 139
    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    const/4 p1, 0x0

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    const/4 p2, 0x1

    :cond_1
    invoke-virtual {p0, p1, p2}, Lcom/pymcl/ai/BackgroundTasks;->clearFinished(Ljava/lang/String;Z)Lcom/pymcl/ai/BgClearResult;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic list$default(Lcom/pymcl/ai/BackgroundTasks;Ljava/lang/String;ILjava/lang/Object;)Ljava/util/List;
    .locals 0

    .line 123
    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-virtual {p0, p1}, Lcom/pymcl/ai/BackgroundTasks;->list(Ljava/lang/String;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method private final persist()V
    .locals 21

    .line 63
    move-object/from16 v1, p0

    iget-object v0, v1, Lcom/pymcl/ai/BackgroundTasks;->file:Ljava/io/File;

    if-nez v0, :cond_0

    return-void

    :cond_0
    move-object v2, v0

    .line 64
    .local v2, "f":Ljava/io/File;
    monitor-enter p0

    const/4 v3, 0x0

    .line 67
    .local v3, "$i$a$-synchronized-BackgroundTasks$persist$1":I
    :try_start_0
    iget-object v0, v1, Lcom/pymcl/ai/BackgroundTasks;->tasks:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->values()Ljava/util/Collection;

    move-result-object v0

    const-string v4, "<get-values>(...)"

    invoke-static {v0, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Iterable;

    .local v0, "$this$sortedBy$iv":Ljava/lang/Iterable;
    const/4 v4, 0x0

    .line 174
    .local v4, "$i$f$sortedBy":I
    new-instance v5, Lcom/pymcl/ai/BackgroundTasks$persist$lambda$0$$inlined$sortedBy$1;

    invoke-direct {v5}, Lcom/pymcl/ai/BackgroundTasks$persist$lambda$0$$inlined$sortedBy$1;-><init>()V

    check-cast v5, Ljava/util/Comparator;

    invoke-static {v0, v5}, Lkotlin/collections/CollectionsKt;->sortedWith(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object v5

    .line 67
    .end local v0    # "$this$sortedBy$iv":Ljava/lang/Iterable;
    .end local v4    # "$i$f$sortedBy":I
    nop

    .line 68
    .local v5, "all":Ljava/util/List;
    move-object v0, v5

    check-cast v0, Ljava/lang/Iterable;

    .local v0, "$this$filter$iv":Ljava/lang/Iterable;
    const/4 v4, 0x0

    .line 175
    .local v4, "$i$f$filter":I
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    check-cast v6, Ljava/util/Collection;

    .local v6, "destination$iv$iv":Ljava/util/Collection;
    move-object v7, v0

    .local v7, "$this$filterTo$iv$iv":Ljava/lang/Iterable;
    const/4 v8, 0x0

    .line 176
    .local v8, "$i$f$filterTo":I
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :cond_1
    :goto_0
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_2

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    .local v10, "element$iv$iv":Ljava/lang/Object;
    move-object v11, v10

    check-cast v11, Lcom/pymcl/ai/BgTaskInfo;

    .local v11, "it":Lcom/pymcl/ai/BgTaskInfo;
    const/4 v12, 0x0

    .line 68
    .local v12, "$i$a$-filter-BackgroundTasks$persist$1$drop$1":I
    invoke-virtual {v11}, Lcom/pymcl/ai/BgTaskInfo;->getReported()Z

    move-result v13

    .line 176
    .end local v11    # "it":Lcom/pymcl/ai/BgTaskInfo;
    .end local v12    # "$i$a$-filter-BackgroundTasks$persist$1$drop$1":I
    if-eqz v13, :cond_1

    invoke-interface {v6, v10}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 177
    .end local v10    # "element$iv$iv":Ljava/lang/Object;
    :cond_2
    nop

    .end local v6    # "destination$iv$iv":Ljava/util/Collection;
    .end local v7    # "$this$filterTo$iv$iv":Ljava/lang/Iterable;
    .end local v8    # "$i$f$filterTo":I
    check-cast v6, Ljava/util/List;

    .line 175
    nop

    .line 68
    .end local v0    # "$this$filter$iv":Ljava/lang/Iterable;
    .end local v4    # "$i$f$filter":I
    const/16 v0, 0x1e

    invoke-static {v6, v0}, Lkotlin/collections/CollectionsKt;->dropLast(Ljava/util/List;I)Ljava/util/List;

    move-result-object v4

    check-cast v4, Ljava/lang/Iterable;

    .local v4, "$this$map$iv":Ljava/lang/Iterable;
    const/4 v6, 0x0

    .line 178
    .local v6, "$i$f$map":I
    new-instance v7, Ljava/util/ArrayList;

    const/16 v8, 0xa

    invoke-static {v4, v8}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v9

    invoke-direct {v7, v9}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v7, Ljava/util/Collection;

    .local v7, "destination$iv$iv":Ljava/util/Collection;
    move-object v9, v4

    .local v9, "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    const/4 v10, 0x0

    .line 179
    .local v10, "$i$f$mapTo":I
    invoke-interface {v9}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :goto_1
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_3

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    .line 180
    .local v12, "item$iv$iv":Ljava/lang/Object;
    move-object v13, v12

    check-cast v13, Lcom/pymcl/ai/BgTaskInfo;

    .local v13, "it":Lcom/pymcl/ai/BgTaskInfo;
    const/4 v14, 0x0

    .line 68
    .local v14, "$i$a$-map-BackgroundTasks$persist$1$drop$2":I
    invoke-virtual {v13}, Lcom/pymcl/ai/BgTaskInfo;->getId()Ljava/lang/String;

    move-result-object v15

    .line 180
    .end local v13    # "it":Lcom/pymcl/ai/BgTaskInfo;
    .end local v14    # "$i$a$-map-BackgroundTasks$persist$1$drop$2":I
    invoke-interface {v7, v15}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 181
    .end local v12    # "item$iv$iv":Ljava/lang/Object;
    :cond_3
    nop

    .end local v7    # "destination$iv$iv":Ljava/util/Collection;
    .end local v9    # "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    .end local v10    # "$i$f$mapTo":I
    check-cast v7, Ljava/util/List;

    .line 178
    nop

    .end local v4    # "$this$map$iv":Ljava/lang/Iterable;
    .end local v6    # "$i$f$map":I
    check-cast v7, Ljava/lang/Iterable;

    .line 68
    nop

    .local v7, "$this$filter$iv":Ljava/lang/Iterable;
    const/4 v4, 0x0

    .line 182
    .local v4, "$i$f$filter":I
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    check-cast v6, Ljava/util/Collection;

    .local v6, "destination$iv$iv":Ljava/util/Collection;
    move-object v9, v7

    .local v9, "$this$filterTo$iv$iv":Ljava/lang/Iterable;
    const/4 v10, 0x0

    .line 183
    .local v10, "$i$f$filterTo":I
    invoke-interface {v9}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :cond_4
    :goto_2
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_5

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    .local v12, "element$iv$iv":Ljava/lang/Object;
    move-object v13, v12

    check-cast v13, Ljava/lang/String;

    .local v13, "it":Ljava/lang/String;
    const/4 v14, 0x0

    .line 68
    .local v14, "$i$a$-filter-BackgroundTasks$persist$1$drop$3":I
    iget-object v15, v1, Lcom/pymcl/ai/BackgroundTasks;->jobs:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v15}, Ljava/util/concurrent/ConcurrentHashMap;->keySet()Ljava/util/Set;

    move-result-object v15

    check-cast v15, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    invoke-virtual {v15, v13}, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;->contains(Ljava/lang/Object;)Z

    move-result v15

    .line 183
    .end local v13    # "it":Ljava/lang/String;
    .end local v14    # "$i$a$-filter-BackgroundTasks$persist$1$drop$3":I
    if-nez v15, :cond_4

    invoke-interface {v6, v12}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 184
    .end local v12    # "element$iv$iv":Ljava/lang/Object;
    :cond_5
    nop

    .end local v6    # "destination$iv$iv":Ljava/util/Collection;
    .end local v9    # "$this$filterTo$iv$iv":Ljava/lang/Iterable;
    .end local v10    # "$i$f$filterTo":I
    check-cast v6, Ljava/util/List;

    .line 182
    nop

    .line 68
    .end local v4    # "$i$f$filter":I
    .end local v7    # "$this$filter$iv":Ljava/lang/Iterable;
    nop

    .line 69
    .local v6, "drop":Ljava/util/List;
    move-object v4, v6

    check-cast v4, Ljava/lang/Iterable;

    .local v4, "$this$forEach$iv":Ljava/lang/Iterable;
    const/4 v7, 0x0

    .line 185
    .local v7, "$i$f$forEach":I
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_3
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_6

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    .local v10, "element$iv":Ljava/lang/Object;
    move-object v11, v10

    check-cast v11, Ljava/lang/String;

    .local v11, "it":Ljava/lang/String;
    const/4 v12, 0x0

    .line 69
    .local v12, "$i$a$-forEach-BackgroundTasks$persist$1$1":I
    iget-object v13, v1, Lcom/pymcl/ai/BackgroundTasks;->tasks:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v13, v11}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 185
    nop

    .end local v10    # "element$iv":Ljava/lang/Object;
    .end local v11    # "it":Ljava/lang/String;
    .end local v12    # "$i$a$-forEach-BackgroundTasks$persist$1$1":I
    goto :goto_3

    .line 186
    :cond_6
    nop

    .line 70
    .end local v4    # "$this$forEach$iv":Ljava/lang/Iterable;
    .end local v7    # "$i$f$forEach":I
    iget-object v4, v1, Lcom/pymcl/ai/BackgroundTasks;->tasks:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v4}, Ljava/util/concurrent/ConcurrentHashMap;->values()Ljava/util/Collection;

    move-result-object v4

    const-string v7, "<get-values>(...)"

    invoke-static {v4, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v4, Ljava/lang/Iterable;

    .local v4, "$this$sortedBy$iv":Ljava/lang/Iterable;
    const/4 v7, 0x0

    .line 187
    .local v7, "$i$f$sortedBy":I
    new-instance v9, Lcom/pymcl/ai/BackgroundTasks$persist$lambda$0$$inlined$sortedBy$2;

    invoke-direct {v9}, Lcom/pymcl/ai/BackgroundTasks$persist$lambda$0$$inlined$sortedBy$2;-><init>()V

    check-cast v9, Ljava/util/Comparator;

    invoke-static {v4, v9}, Lkotlin/collections/CollectionsKt;->sortedWith(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object v9

    .line 70
    .end local v4    # "$this$sortedBy$iv":Ljava/lang/Iterable;
    .end local v7    # "$i$f$sortedBy":I
    nop

    .line 167
    .local v9, "l":Ljava/util/List;
    const/4 v4, 0x0

    .line 70
    .local v4, "$i$a$-let-BackgroundTasks$persist$1$keep$2":I
    move-object v7, v9

    check-cast v7, Ljava/lang/Iterable;

    .local v7, "$this$filter$iv":Ljava/lang/Iterable;
    const/4 v10, 0x0

    .line 188
    .local v10, "$i$f$filter":I
    new-instance v11, Ljava/util/ArrayList;

    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    check-cast v11, Ljava/util/Collection;

    .local v11, "destination$iv$iv":Ljava/util/Collection;
    move-object v12, v7

    .local v12, "$this$filterTo$iv$iv":Ljava/lang/Iterable;
    const/4 v13, 0x0

    .line 189
    .local v13, "$i$f$filterTo":I
    invoke-interface {v12}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v14

    :cond_7
    :goto_4
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    move-result v15

    if-eqz v15, :cond_8

    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v15

    .local v15, "element$iv$iv":Ljava/lang/Object;
    move-object/from16 v16, v15

    check-cast v16, Lcom/pymcl/ai/BgTaskInfo;

    .local v16, "it":Lcom/pymcl/ai/BgTaskInfo;
    const/16 v17, 0x0

    .line 70
    .local v17, "$i$a$-filter-BackgroundTasks$persist$1$keep$2$1":I
    invoke-virtual/range {v16 .. v16}, Lcom/pymcl/ai/BgTaskInfo;->getReported()Z

    move-result v18

    .line 189
    .end local v16    # "it":Lcom/pymcl/ai/BgTaskInfo;
    .end local v17    # "$i$a$-filter-BackgroundTasks$persist$1$keep$2$1":I
    if-nez v18, :cond_7

    invoke-interface {v11, v15}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_4

    .line 190
    .end local v15    # "element$iv$iv":Ljava/lang/Object;
    :cond_8
    nop

    .end local v11    # "destination$iv$iv":Ljava/util/Collection;
    .end local v12    # "$this$filterTo$iv$iv":Ljava/lang/Iterable;
    .end local v13    # "$i$f$filterTo":I
    check-cast v11, Ljava/util/List;

    .line 188
    nop

    .end local v7    # "$this$filter$iv":Ljava/lang/Iterable;
    .end local v10    # "$i$f$filter":I
    check-cast v11, Ljava/util/Collection;

    .line 70
    move-object v7, v9

    check-cast v7, Ljava/lang/Iterable;

    .restart local v7    # "$this$filter$iv":Ljava/lang/Iterable;
    const/4 v10, 0x0

    .line 188
    .restart local v10    # "$i$f$filter":I
    new-instance v12, Ljava/util/ArrayList;

    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    check-cast v12, Ljava/util/Collection;

    .local v12, "destination$iv$iv":Ljava/util/Collection;
    move-object v13, v7

    .local v13, "$this$filterTo$iv$iv":Ljava/lang/Iterable;
    const/4 v14, 0x0

    .line 189
    .local v14, "$i$f$filterTo":I
    invoke-interface {v13}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v15

    :goto_5
    invoke-interface {v15}, Ljava/util/Iterator;->hasNext()Z

    move-result v16

    if-eqz v16, :cond_a

    invoke-interface {v15}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v16

    move-object/from16 v17, v16

    .local v17, "element$iv$iv":Ljava/lang/Object;
    move-object/from16 v16, v17

    check-cast v16, Lcom/pymcl/ai/BgTaskInfo;

    .restart local v16    # "it":Lcom/pymcl/ai/BgTaskInfo;
    const/16 v18, 0x0

    .line 70
    .local v18, "$i$a$-filter-BackgroundTasks$persist$1$keep$2$2":I
    invoke-virtual/range {v16 .. v16}, Lcom/pymcl/ai/BgTaskInfo;->getReported()Z

    move-result v19

    .line 189
    .end local v16    # "it":Lcom/pymcl/ai/BgTaskInfo;
    .end local v18    # "$i$a$-filter-BackgroundTasks$persist$1$keep$2$2":I
    if-eqz v19, :cond_9

    move-object/from16 v8, v17

    .end local v17    # "element$iv$iv":Ljava/lang/Object;
    .local v8, "element$iv$iv":Ljava/lang/Object;
    invoke-interface {v12, v8}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_6

    .end local v8    # "element$iv$iv":Ljava/lang/Object;
    .restart local v17    # "element$iv$iv":Ljava/lang/Object;
    :cond_9
    move-object/from16 v8, v17

    .end local v17    # "element$iv$iv":Ljava/lang/Object;
    .restart local v8    # "element$iv$iv":Ljava/lang/Object;
    :goto_6
    const/16 v8, 0xa

    goto :goto_5

    .line 190
    .end local v8    # "element$iv$iv":Ljava/lang/Object;
    :cond_a
    nop

    .end local v12    # "destination$iv$iv":Ljava/util/Collection;
    .end local v13    # "$this$filterTo$iv$iv":Ljava/lang/Iterable;
    .end local v14    # "$i$f$filterTo":I
    move-object v8, v12

    check-cast v8, Ljava/util/List;

    .line 188
    nop

    .line 70
    .end local v7    # "$this$filter$iv":Ljava/lang/Iterable;
    .end local v10    # "$i$f$filter":I
    invoke-static {v8, v0}, Lkotlin/collections/CollectionsKt;->takeLast(Ljava/util/List;I)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v11, v0}, Lkotlin/collections/CollectionsKt;->plus(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .end local v4    # "$i$a$-let-BackgroundTasks$persist$1$keep$2":I
    .end local v9    # "l":Ljava/util/List;
    move-object v4, v0

    .line 71
    .local v4, "keep":Ljava/util/List;
    :try_start_1
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object v0, v1

    check-cast v0, Lcom/pymcl/ai/BackgroundTasks;

    .line 167
    .local v0, "$this$persist_u24lambda_u240_u247":Lcom/pymcl/ai/BackgroundTasks;
    const/4 v7, 0x0

    .line 71
    .local v7, "$i$a$-runCatching-BackgroundTasks$persist$1$2":I
    sget-object v8, Lcom/pymcl/core/util/FileUtil;->INSTANCE:Lcom/pymcl/core/util/FileUtil;

    const/4 v9, 0x2

    new-array v9, v9, [Lkotlin/Pair;

    const-string v10, "version"

    const-wide/16 v11, 0x1

    invoke-static {v11, v12}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v11

    invoke-static {v10, v11}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v10

    const/4 v11, 0x0

    aput-object v10, v9, v11

    const-string v10, "tasks"

    move-object v11, v4

    check-cast v11, Ljava/lang/Iterable;

    .local v11, "$this$map$iv":Ljava/lang/Iterable;
    const/4 v12, 0x0

    .line 191
    .local v12, "$i$f$map":I
    new-instance v13, Ljava/util/ArrayList;

    const/16 v14, 0xa

    invoke-static {v11, v14}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v14

    invoke-direct {v13, v14}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v13, Ljava/util/Collection;

    .local v13, "destination$iv$iv":Ljava/util/Collection;
    move-object v14, v11

    .local v14, "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    const/4 v15, 0x0

    .line 192
    .local v15, "$i$f$mapTo":I
    invoke-interface {v14}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v16

    :goto_7
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->hasNext()Z

    move-result v17

    if-eqz v17, :cond_b

    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v17

    .line 193
    .local v17, "item$iv$iv":Ljava/lang/Object;
    move-object/from16 v18, v17

    check-cast v18, Lcom/pymcl/ai/BgTaskInfo;

    .local v18, "it":Lcom/pymcl/ai/BgTaskInfo;
    const/16 v19, 0x0

    .line 71
    .local v19, "$i$a$-map-BackgroundTasks$persist$1$2$1":I
    move-object/from16 v20, v0

    .end local v0    # "$this$persist_u24lambda_u240_u247":Lcom/pymcl/ai/BackgroundTasks;
    .local v20, "$this$persist_u24lambda_u240_u247":Lcom/pymcl/ai/BackgroundTasks;
    invoke-virtual/range {v18 .. v18}, Lcom/pymcl/ai/BgTaskInfo;->toJson()Ljava/util/Map;

    move-result-object v0

    .line 193
    .end local v18    # "it":Lcom/pymcl/ai/BgTaskInfo;
    .end local v19    # "$i$a$-map-BackgroundTasks$persist$1$2$1":I
    invoke-interface {v13, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move-object/from16 v0, v20

    goto :goto_7

    .line 194
    .end local v17    # "item$iv$iv":Ljava/lang/Object;
    .end local v20    # "$this$persist_u24lambda_u240_u247":Lcom/pymcl/ai/BackgroundTasks;
    .restart local v0    # "$this$persist_u24lambda_u240_u247":Lcom/pymcl/ai/BackgroundTasks;
    :cond_b
    move-object/from16 v20, v0

    .end local v0    # "$this$persist_u24lambda_u240_u247":Lcom/pymcl/ai/BackgroundTasks;
    .end local v13    # "destination$iv$iv":Ljava/util/Collection;
    .end local v14    # "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    .end local v15    # "$i$f$mapTo":I
    .restart local v20    # "$this$persist_u24lambda_u240_u247":Lcom/pymcl/ai/BackgroundTasks;
    move-object v0, v13

    check-cast v0, Ljava/util/List;

    .line 191
    nop

    .end local v11    # "$this$map$iv":Ljava/lang/Iterable;
    .end local v12    # "$i$f$map":I
    check-cast v0, Ljava/util/Collection;

    .line 71
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->toMutableList(Ljava/util/Collection;)Ljava/util/List;

    move-result-object v0

    invoke-static {v10, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/4 v10, 0x1

    aput-object v0, v9, v10

    invoke-static {v9}, Lcom/pymcl/core/util/JsonKt;->jobj([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v0

    invoke-virtual {v8, v2, v0}, Lcom/pymcl/core/util/FileUtil;->writeJson(Ljava/io/File;Ljava/lang/Object;)Z

    move-result v0

    .end local v7    # "$i$a$-runCatching-BackgroundTasks$persist$1$2":I
    .end local v20    # "$this$persist_u24lambda_u240_u247":Lcom/pymcl/ai/BackgroundTasks;
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_8

    :catchall_0
    move-exception v0

    :try_start_2
    sget-object v7, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 64
    .end local v3    # "$i$a$-synchronized-BackgroundTasks$persist$1":I
    .end local v4    # "keep":Ljava/util/List;
    .end local v5    # "all":Ljava/util/List;
    .end local v6    # "drop":Ljava/util/List;
    :goto_8
    monitor-exit p0

    .line 73
    return-void

    .line 64
    :catchall_1
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public static synthetic start$default(Lcom/pymcl/ai/BackgroundTasks;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Ljava/lang/String;
    .locals 7

    .line 81
    and-int/lit8 p7, p7, 0x10

    if-eqz p7, :cond_0

    const-string p5, ""

    :cond_0
    move-object v5, p5

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v6, p6

    invoke-virtual/range {v0 .. v6}, Lcom/pymcl/ai/BackgroundTasks;->start(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static final takeFinished$lambda$0$0(Ljava/lang/String;Lcom/pymcl/ai/BgTaskInfo;)Lcom/pymcl/ai/BgTaskInfo;
    .locals 19
    .param p1, "x"    # Lcom/pymcl/ai/BgTaskInfo;

    const-string v0, "<unused var>"

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "x"

    move-object/from16 v1, p1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 131
    const/16 v17, 0x17ff

    const/16 v18, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const-wide/16 v11, 0x0

    const-wide/16 v13, 0x0

    const/4 v15, 0x1

    const/16 v16, 0x0

    invoke-static/range {v1 .. v18}, Lcom/pymcl/ai/BgTaskInfo;->copy$default(Lcom/pymcl/ai/BgTaskInfo;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/String;JJZLjava/lang/String;ILjava/lang/Object;)Lcom/pymcl/ai/BgTaskInfo;

    move-result-object v0

    return-object v0
.end method

.method private static final takeFinished$lambda$0$1(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Ljava/lang/Object;)Lcom/pymcl/ai/BgTaskInfo;
    .locals 1
    .param p0, "$tmp0"    # Lkotlin/jvm/functions/Function2;
    .param p1, "p0"    # Ljava/lang/Object;
    .param p2, "p1"    # Ljava/lang/Object;

    .line 131
    invoke-interface {p0, p1, p2}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/pymcl/ai/BgTaskInfo;

    return-object v0
.end method

.method private final update(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Lcom/pymcl/ai/BgTaskInfo;
    .locals 3
    .param p1, "id"    # Ljava/lang/String;
    .param p2, "f"    # Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/pymcl/ai/BgTaskInfo;",
            "Lcom/pymcl/ai/BgTaskInfo;",
            ">;)",
            "Lcom/pymcl/ai/BgTaskInfo;"
        }
    .end annotation

    .line 76
    iget-object v0, p0, Lcom/pymcl/ai/BackgroundTasks;->tasks:Ljava/util/concurrent/ConcurrentHashMap;

    new-instance v1, Lcom/pymcl/ai/BackgroundTasks$$ExternalSyntheticLambda4;

    invoke-direct {v1, p2}, Lcom/pymcl/ai/BackgroundTasks$$ExternalSyntheticLambda4;-><init>(Lkotlin/jvm/functions/Function1;)V

    new-instance v2, Lcom/pymcl/ai/BackgroundTasks$$ExternalSyntheticLambda5;

    invoke-direct {v2, v1}, Lcom/pymcl/ai/BackgroundTasks$$ExternalSyntheticLambda5;-><init>(Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {v0, p1, v2}, Ljava/util/concurrent/ConcurrentHashMap;->computeIfPresent(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/pymcl/ai/BgTaskInfo;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 77
    .local v0, "n":Lcom/pymcl/ai/BgTaskInfo;
    :cond_0
    iget-object v1, p0, Lcom/pymcl/ai/BackgroundTasks;->_events:Lkotlinx/coroutines/flow/MutableSharedFlow;

    invoke-interface {v1, v0}, Lkotlinx/coroutines/flow/MutableSharedFlow;->tryEmit(Ljava/lang/Object;)Z

    return-object v0
.end method

.method private static final update$lambda$0(Lkotlin/jvm/functions/Function1;Ljava/lang/String;Lcom/pymcl/ai/BgTaskInfo;)Lcom/pymcl/ai/BgTaskInfo;
    .locals 1
    .param p0, "$f"    # Lkotlin/jvm/functions/Function1;
    .param p2, "t"    # Lcom/pymcl/ai/BgTaskInfo;

    const-string v0, "<unused var>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "t"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 76
    invoke-interface {p0, p2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/pymcl/ai/BgTaskInfo;

    return-object p1
.end method

.method private static final update$lambda$1(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Ljava/lang/Object;)Lcom/pymcl/ai/BgTaskInfo;
    .locals 1
    .param p0, "$tmp0"    # Lkotlin/jvm/functions/Function2;
    .param p1, "p0"    # Ljava/lang/Object;
    .param p2, "p1"    # Ljava/lang/Object;

    .line 76
    invoke-interface {p0, p1, p2}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/pymcl/ai/BgTaskInfo;

    return-object v0
.end method


# virtual methods
.method public final cancel(Ljava/lang/String;)Z
    .locals 4
    .param p1, "id"    # Ljava/lang/String;

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 104
    iget-object v0, p0, Lcom/pymcl/ai/BackgroundTasks;->jobs:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkotlinx/coroutines/Job;

    if-eqz v0, :cond_0

    .line 167
    .local v0, "it":Lkotlinx/coroutines/Job;
    const/4 v1, 0x0

    .line 104
    .local v1, "$i$a$-let-BackgroundTasks$cancel$1":I
    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-static {v0, v2, v3, v2}, Lkotlinx/coroutines/Job$DefaultImpls;->cancel$default(Lkotlinx/coroutines/Job;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    .end local v0    # "it":Lkotlinx/coroutines/Job;
    .end local v1    # "$i$a$-let-BackgroundTasks$cancel$1":I
    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    return v3
.end method

.method public final cancelForRewind(Ljava/lang/String;Ljava/util/Set;Ljava/util/Set;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 17
    .param p1, "chatId"    # Ljava/lang/String;
    .param p2, "turnIds"    # Ljava/util/Set;
    .param p3, "callIds"    # Ljava/util/Set;
    .param p4, "$completion"    # Lkotlin/coroutines/Continuation;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/util/List<",
            "Lcom/pymcl/ai/BgTaskInfo;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p4

    instance-of v2, v1, Lcom/pymcl/ai/BackgroundTasks$cancelForRewind$1;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Lcom/pymcl/ai/BackgroundTasks$cancelForRewind$1;

    iget v3, v2, Lcom/pymcl/ai/BackgroundTasks$cancelForRewind$1;->label:I

    const/high16 v4, -0x80000000

    and-int/2addr v3, v4

    if-eqz v3, :cond_0

    iget v3, v2, Lcom/pymcl/ai/BackgroundTasks$cancelForRewind$1;->label:I

    sub-int/2addr v3, v4

    iput v3, v2, Lcom/pymcl/ai/BackgroundTasks$cancelForRewind$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v2, Lcom/pymcl/ai/BackgroundTasks$cancelForRewind$1;

    invoke-direct {v2, v0, v1}, Lcom/pymcl/ai/BackgroundTasks$cancelForRewind$1;-><init>(Lcom/pymcl/ai/BackgroundTasks;Lkotlin/coroutines/Continuation;)V

    .local v2, "$continuation":Lkotlin/coroutines/Continuation;
    :goto_0
    iget-object v3, v2, Lcom/pymcl/ai/BackgroundTasks$cancelForRewind$1;->result:Ljava/lang/Object;

    .local v3, "$result":Ljava/lang/Object;
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v4

    .line 113
    iget v5, v2, Lcom/pymcl/ai/BackgroundTasks$cancelForRewind$1;->label:I

    packed-switch v5, :pswitch_data_0

    .end local p0    # "this":Lcom/pymcl/ai/BackgroundTasks;
    move-object/from16 v6, p2

    move-object/from16 v1, p3

    .end local v2    # "$continuation":Lkotlin/coroutines/Continuation;
    .end local v3    # "$result":Ljava/lang/Object;
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .restart local v2    # "$continuation":Lkotlin/coroutines/Continuation;
    .restart local v3    # "$result":Ljava/lang/Object;
    .restart local p0    # "this":Lcom/pymcl/ai/BackgroundTasks;
    :pswitch_0
    const/4 v5, 0x0

    .local v5, "$i$f$forEach":I
    const/4 v7, 0x0

    .local v7, "$i$a$-forEach-BackgroundTasks$cancelForRewind$3":I
    iget-object v8, v2, Lcom/pymcl/ai/BackgroundTasks$cancelForRewind$1;->L$7:Ljava/lang/Object;

    check-cast v8, Lcom/pymcl/ai/BgTaskInfo;

    .local v8, "t":Lcom/pymcl/ai/BgTaskInfo;
    iget-object v9, v2, Lcom/pymcl/ai/BackgroundTasks$cancelForRewind$1;->L$6:Ljava/lang/Object;

    .local v9, "element$iv":Ljava/lang/Object;
    iget-object v10, v2, Lcom/pymcl/ai/BackgroundTasks$cancelForRewind$1;->L$5:Ljava/lang/Object;

    check-cast v10, Ljava/util/Iterator;

    iget-object v11, v2, Lcom/pymcl/ai/BackgroundTasks$cancelForRewind$1;->L$4:Ljava/lang/Object;

    check-cast v11, Ljava/lang/Iterable;

    .local v11, "$this$forEach$iv":Ljava/lang/Iterable;
    iget-object v12, v2, Lcom/pymcl/ai/BackgroundTasks$cancelForRewind$1;->L$3:Ljava/lang/Object;

    check-cast v12, Ljava/util/List;

    .local v12, "hit":Ljava/util/List;
    iget-object v13, v2, Lcom/pymcl/ai/BackgroundTasks$cancelForRewind$1;->L$2:Ljava/lang/Object;

    check-cast v13, Ljava/util/Set;

    .end local p3    # "callIds":Ljava/util/Set;
    .local v13, "callIds":Ljava/util/Set;
    iget-object v14, v2, Lcom/pymcl/ai/BackgroundTasks$cancelForRewind$1;->L$1:Ljava/lang/Object;

    check-cast v14, Ljava/util/Set;

    .end local p2    # "turnIds":Ljava/util/Set;
    .local v14, "turnIds":Ljava/util/Set;
    iget-object v15, v2, Lcom/pymcl/ai/BackgroundTasks$cancelForRewind$1;->L$0:Ljava/lang/Object;

    check-cast v15, Ljava/lang/String;

    .end local p1    # "chatId":Ljava/lang/String;
    .local v15, "chatId":Ljava/lang/String;
    invoke-static {v3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object v6, v0

    move-object v0, v3

    move-object/from16 v16, v15

    move-object v3, v1

    move-object v15, v14

    const/4 v1, 0x1

    move-object v14, v8

    move v8, v5

    move-object v5, v0

    goto/16 :goto_7

    .end local v5    # "$i$f$forEach":I
    .end local v7    # "$i$a$-forEach-BackgroundTasks$cancelForRewind$3":I
    .end local v8    # "t":Lcom/pymcl/ai/BgTaskInfo;
    .end local v9    # "element$iv":Ljava/lang/Object;
    .end local v11    # "$this$forEach$iv":Ljava/lang/Iterable;
    .end local v12    # "hit":Ljava/util/List;
    .end local v13    # "callIds":Ljava/util/Set;
    .end local v14    # "turnIds":Ljava/util/Set;
    .end local v15    # "chatId":Ljava/lang/String;
    .restart local p1    # "chatId":Ljava/lang/String;
    .restart local p2    # "turnIds":Ljava/util/Set;
    .restart local p3    # "callIds":Ljava/util/Set;
    :pswitch_1
    invoke-static {v3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 114
    invoke-virtual/range {p0 .. p1}, Lcom/pymcl/ai/BackgroundTasks;->running(Ljava/lang/String;)Ljava/util/List;

    move-result-object v5

    check-cast v5, Ljava/lang/Iterable;

    .local v5, "$this$filter$iv":Ljava/lang/Iterable;
    const/4 v7, 0x0

    .line 195
    .local v7, "$i$f$filter":I
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    check-cast v8, Ljava/util/Collection;

    .local v8, "destination$iv$iv":Ljava/util/Collection;
    move-object v9, v5

    .local v9, "$this$filterTo$iv$iv":Ljava/lang/Iterable;
    const/4 v10, 0x0

    .line 196
    .local v10, "$i$f$filterTo":I
    invoke-interface {v9}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :goto_1
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_6

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    .local v12, "element$iv$iv":Ljava/lang/Object;
    move-object v13, v12

    check-cast v13, Lcom/pymcl/ai/BgTaskInfo;

    .local v13, "it":Lcom/pymcl/ai/BgTaskInfo;
    const/4 v14, 0x0

    .line 114
    .local v14, "$i$a$-filter-BackgroundTasks$cancelForRewind$hit$1":I
    invoke-virtual {v13}, Lcom/pymcl/ai/BgTaskInfo;->getTurnId()Ljava/lang/String;

    move-result-object v15

    check-cast v15, Ljava/lang/CharSequence;

    invoke-interface {v15}, Ljava/lang/CharSequence;->length()I

    move-result v15

    const/16 v16, 0x0

    if-lez v15, :cond_1

    const/4 v15, 0x1

    goto :goto_2

    :cond_1
    move/from16 v15, v16

    :goto_2
    if-eqz v15, :cond_3

    invoke-virtual {v13}, Lcom/pymcl/ai/BgTaskInfo;->getTurnId()Ljava/lang/String;

    move-result-object v15

    move-object/from16 v6, p2

    invoke-interface {v6, v15}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v15

    if-nez v15, :cond_2

    goto :goto_3

    :cond_2
    move-object/from16 v1, p3

    goto :goto_4

    :cond_3
    move-object/from16 v6, p2

    :goto_3
    invoke-virtual {v13}, Lcom/pymcl/ai/BgTaskInfo;->getCallId()Ljava/lang/String;

    move-result-object v15

    move-object/from16 v1, p3

    invoke-interface {v1, v15}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_4

    :goto_4
    const/16 v16, 0x1

    .line 196
    .end local v13    # "it":Lcom/pymcl/ai/BgTaskInfo;
    .end local v14    # "$i$a$-filter-BackgroundTasks$cancelForRewind$hit$1":I
    :cond_4
    if-eqz v16, :cond_5

    invoke-interface {v8, v12}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    :cond_5
    move-object/from16 v1, p4

    goto :goto_1

    .line 197
    .end local v12    # "element$iv$iv":Ljava/lang/Object;
    :cond_6
    move-object/from16 v6, p2

    move-object/from16 v1, p3

    .end local v8    # "destination$iv$iv":Ljava/util/Collection;
    .end local v9    # "$this$filterTo$iv$iv":Ljava/lang/Iterable;
    .end local v10    # "$i$f$filterTo":I
    check-cast v8, Ljava/util/List;

    .line 195
    nop

    .line 114
    .end local v5    # "$this$filter$iv":Ljava/lang/Iterable;
    .end local v7    # "$i$f$filter":I
    nop

    .line 115
    .local v8, "hit":Ljava/util/List;
    move-object v5, v8

    check-cast v5, Ljava/lang/Iterable;

    .local v5, "$this$forEach$iv":Ljava/lang/Iterable;
    const/4 v7, 0x0

    .line 198
    .local v7, "$i$f$forEach":I
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_5
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_8

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    .local v10, "element$iv":Ljava/lang/Object;
    move-object v11, v10

    check-cast v11, Lcom/pymcl/ai/BgTaskInfo;

    .local v11, "t":Lcom/pymcl/ai/BgTaskInfo;
    const/4 v12, 0x0

    .line 115
    .local v12, "$i$a$-forEach-BackgroundTasks$cancelForRewind$2":I
    iget-object v13, v0, Lcom/pymcl/ai/BackgroundTasks;->silentCancel:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    const-string v14, "silentCancel"

    invoke-static {v13, v14}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v13, Ljava/util/Collection;

    invoke-virtual {v11}, Lcom/pymcl/ai/BgTaskInfo;->getId()Ljava/lang/String;

    move-result-object v14

    invoke-interface {v13, v14}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    iget-object v13, v0, Lcom/pymcl/ai/BackgroundTasks;->jobs:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v11}, Lcom/pymcl/ai/BgTaskInfo;->getId()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v13, v14}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lkotlinx/coroutines/Job;

    if-eqz v13, :cond_7

    const/4 v14, 0x0

    const/4 v15, 0x1

    invoke-static {v13, v14, v15, v14}, Lkotlinx/coroutines/Job$DefaultImpls;->cancel$default(Lkotlinx/coroutines/Job;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    .line 198
    .end local v10    # "element$iv":Ljava/lang/Object;
    .end local v11    # "t":Lcom/pymcl/ai/BgTaskInfo;
    .end local v12    # "$i$a$-forEach-BackgroundTasks$cancelForRewind$2":I
    :cond_7
    goto :goto_5

    .line 199
    :cond_8
    nop

    .line 116
    .end local v5    # "$this$forEach$iv":Ljava/lang/Iterable;
    .end local v7    # "$i$f$forEach":I
    move-object v5, v8

    check-cast v5, Ljava/lang/Iterable;

    .restart local v5    # "$this$forEach$iv":Ljava/lang/Iterable;
    const/4 v7, 0x0

    .line 200
    .restart local v7    # "$i$f$forEach":I
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v9

    move-object v11, v5

    move-object v12, v8

    move-object v10, v9

    move-object v9, v0

    move-object v5, v3

    move v8, v7

    move-object/from16 v3, p4

    move-object v7, v4

    move-object v4, v2

    move-object v2, v1

    move-object/from16 v1, p1

    .end local v7    # "$i$f$forEach":I
    .end local p0    # "this":Lcom/pymcl/ai/BackgroundTasks;
    .end local p1    # "chatId":Ljava/lang/String;
    .end local p2    # "turnIds":Ljava/util/Set;
    .end local p3    # "callIds":Ljava/util/Set;
    .end local p4    # "$completion":Lkotlin/coroutines/Continuation;
    .local v1, "chatId":Ljava/lang/String;
    .local v2, "callIds":Ljava/util/Set;
    .local v3, "$completion":Lkotlin/coroutines/Continuation;
    .local v4, "$continuation":Lkotlin/coroutines/Continuation;
    .local v5, "$result":Ljava/lang/Object;
    .local v6, "turnIds":Ljava/util/Set;
    .local v8, "$i$f$forEach":I
    .local v9, "this":Lcom/pymcl/ai/BackgroundTasks;
    .local v11, "$this$forEach$iv":Ljava/lang/Iterable;
    .local v12, "hit":Ljava/util/List;
    :goto_6
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    if-eqz v13, :cond_b

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    .local v13, "element$iv":Ljava/lang/Object;
    move-object v14, v13

    check-cast v14, Lcom/pymcl/ai/BgTaskInfo;

    .local v14, "t":Lcom/pymcl/ai/BgTaskInfo;
    const/4 v15, 0x0

    .line 116
    .local v15, "$i$a$-forEach-BackgroundTasks$cancelForRewind$3":I
    nop

    .restart local p0    # "this":Lcom/pymcl/ai/BackgroundTasks;
    iget-object v0, v9, Lcom/pymcl/ai/BackgroundTasks;->jobs:Ljava/util/concurrent/ConcurrentHashMap;

    move-object/from16 p1, v1

    .end local v1    # "chatId":Ljava/lang/String;
    .restart local p1    # "chatId":Ljava/lang/String;
    invoke-virtual {v14}, Lcom/pymcl/ai/BgTaskInfo;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkotlinx/coroutines/Job;

    if-eqz v0, :cond_a

    .end local p0    # "this":Lcom/pymcl/ai/BackgroundTasks;
    invoke-static/range {p1 .. p1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    iput-object v1, v4, Lcom/pymcl/ai/BackgroundTasks$cancelForRewind$1;->L$0:Ljava/lang/Object;

    invoke-static {v6}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    iput-object v1, v4, Lcom/pymcl/ai/BackgroundTasks$cancelForRewind$1;->L$1:Ljava/lang/Object;

    invoke-static {v2}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    iput-object v1, v4, Lcom/pymcl/ai/BackgroundTasks$cancelForRewind$1;->L$2:Ljava/lang/Object;

    iput-object v12, v4, Lcom/pymcl/ai/BackgroundTasks$cancelForRewind$1;->L$3:Ljava/lang/Object;

    invoke-static {v11}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    iput-object v1, v4, Lcom/pymcl/ai/BackgroundTasks$cancelForRewind$1;->L$4:Ljava/lang/Object;

    iput-object v10, v4, Lcom/pymcl/ai/BackgroundTasks$cancelForRewind$1;->L$5:Ljava/lang/Object;

    invoke-static {v13}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    iput-object v1, v4, Lcom/pymcl/ai/BackgroundTasks$cancelForRewind$1;->L$6:Ljava/lang/Object;

    invoke-static {v14}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    iput-object v1, v4, Lcom/pymcl/ai/BackgroundTasks$cancelForRewind$1;->L$7:Ljava/lang/Object;

    const/4 v1, 0x1

    iput v1, v4, Lcom/pymcl/ai/BackgroundTasks$cancelForRewind$1;->label:I

    invoke-interface {v0, v4}, Lkotlinx/coroutines/Job;->join(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v7, :cond_9

    .line 113
    return-object v7

    .line 116
    :cond_9
    move-object/from16 v16, v13

    move-object v13, v2

    move-object v2, v4

    move-object v4, v7

    move v7, v15

    move-object v15, v6

    move-object v6, v9

    move-object/from16 v9, v16

    move-object/from16 v16, p1

    .end local v4    # "$continuation":Lkotlin/coroutines/Continuation;
    .end local p1    # "chatId":Ljava/lang/String;
    .local v2, "$continuation":Lkotlin/coroutines/Continuation;
    .local v6, "this":Lcom/pymcl/ai/BackgroundTasks;
    .local v7, "$i$a$-forEach-BackgroundTasks$cancelForRewind$3":I
    .local v9, "element$iv":Ljava/lang/Object;
    .local v13, "callIds":Ljava/util/Set;
    .local v15, "turnIds":Ljava/util/Set;
    .local v16, "chatId":Ljava/lang/String;
    :goto_7
    check-cast v0, Lkotlin/Unit;

    move-object v7, v4

    move-object v9, v6

    move-object v6, v15

    move-object v4, v2

    move-object v2, v13

    goto :goto_8

    .end local v7    # "$i$a$-forEach-BackgroundTasks$cancelForRewind$3":I
    .end local v16    # "chatId":Ljava/lang/String;
    .local v2, "callIds":Ljava/util/Set;
    .restart local v4    # "$continuation":Lkotlin/coroutines/Continuation;
    .local v6, "turnIds":Ljava/util/Set;
    .local v9, "this":Lcom/pymcl/ai/BackgroundTasks;
    .local v13, "element$iv":Ljava/lang/Object;
    .local v15, "$i$a$-forEach-BackgroundTasks$cancelForRewind$3":I
    .restart local p1    # "chatId":Ljava/lang/String;
    :cond_a
    const/4 v1, 0x1

    move-object/from16 v16, p1

    .line 200
    .end local v13    # "element$iv":Ljava/lang/Object;
    .end local v14    # "t":Lcom/pymcl/ai/BgTaskInfo;
    .end local v15    # "$i$a$-forEach-BackgroundTasks$cancelForRewind$3":I
    .end local p1    # "chatId":Ljava/lang/String;
    .restart local v16    # "chatId":Ljava/lang/String;
    :goto_8
    move-object/from16 v0, p0

    move-object/from16 v1, v16

    goto :goto_6

    .line 201
    .end local v16    # "chatId":Ljava/lang/String;
    .restart local v1    # "chatId":Ljava/lang/String;
    :cond_b
    move-object/from16 p1, v1

    .line 118
    .end local v1    # "chatId":Ljava/lang/String;
    .end local v8    # "$i$f$forEach":I
    .end local v11    # "$this$forEach$iv":Ljava/lang/Iterable;
    .restart local p1    # "chatId":Ljava/lang/String;
    move-object v0, v12

    check-cast v0, Ljava/lang/Iterable;

    .local v0, "$this$forEach$iv":Ljava/lang/Iterable;
    const/4 v1, 0x0

    .line 202
    .local v1, "$i$f$forEach":I
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_9
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_c

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    .local v8, "element$iv":Ljava/lang/Object;
    move-object v10, v8

    check-cast v10, Lcom/pymcl/ai/BgTaskInfo;

    .local v10, "t":Lcom/pymcl/ai/BgTaskInfo;
    const/4 v11, 0x0

    .line 118
    .local v11, "$i$a$-forEach-BackgroundTasks$cancelForRewind$4":I
    iget-object v13, v9, Lcom/pymcl/ai/BackgroundTasks;->tasks:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v10}, Lcom/pymcl/ai/BgTaskInfo;->getId()Ljava/lang/String;

    move-result-object v14

    new-instance v15, Lcom/pymcl/ai/BackgroundTasks$$ExternalSyntheticLambda2;

    invoke-direct {v15}, Lcom/pymcl/ai/BackgroundTasks$$ExternalSyntheticLambda2;-><init>()V

    move-object/from16 p2, v0

    .end local v0    # "$this$forEach$iv":Ljava/lang/Iterable;
    .local p2, "$this$forEach$iv":Ljava/lang/Iterable;
    new-instance v0, Lcom/pymcl/ai/BackgroundTasks$$ExternalSyntheticLambda3;

    invoke-direct {v0, v15}, Lcom/pymcl/ai/BackgroundTasks$$ExternalSyntheticLambda3;-><init>(Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {v13, v14, v0}, Ljava/util/concurrent/ConcurrentHashMap;->computeIfPresent(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;

    .line 202
    .end local v8    # "element$iv":Ljava/lang/Object;
    .end local v10    # "t":Lcom/pymcl/ai/BgTaskInfo;
    .end local v11    # "$i$a$-forEach-BackgroundTasks$cancelForRewind$4":I
    move-object/from16 v0, p2

    goto :goto_9

    .line 203
    .end local p2    # "$this$forEach$iv":Ljava/lang/Iterable;
    .restart local v0    # "$this$forEach$iv":Ljava/lang/Iterable;
    :cond_c
    move-object/from16 p2, v0

    .line 119
    .end local v0    # "$this$forEach$iv":Ljava/lang/Iterable;
    .end local v1    # "$i$f$forEach":I
    move-object v0, v12

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_d

    invoke-direct {v9}, Lcom/pymcl/ai/BackgroundTasks;->persist()V

    .line 120
    :cond_d
    return-object v12

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final clearFinished(Ljava/lang/String;Z)Lcom/pymcl/ai/BgClearResult;
    .locals 9
    .param p1, "chatId"    # Ljava/lang/String;
    .param p2, "keepUnreported"    # Z

    .line 140
    monitor-enter p0

    const/4 v0, 0x0

    .line 141
    .local v0, "$i$a$-synchronized-BackgroundTasks$clearFinished$r$1":I
    :try_start_0
    sget-object v1, Lcom/pymcl/ai/BgClearResult;->Companion:Lcom/pymcl/ai/BgClearResult$Companion;

    invoke-virtual {p0, p1}, Lcom/pymcl/ai/BackgroundTasks;->list(Ljava/lang/String;)Ljava/util/List;

    move-result-object v2

    iget-object v3, p0, Lcom/pymcl/ai/BackgroundTasks;->jobs:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v3}, Ljava/util/concurrent/ConcurrentHashMap;->keySet()Ljava/util/Set;

    move-result-object v3

    const-string v4, "<get-keys>(...)"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v2, p2, v3}, Lcom/pymcl/ai/BgClearResult$Companion;->select(Ljava/util/List;ZLjava/util/Set;)Lcom/pymcl/ai/BgClearResult;

    move-result-object v1

    .line 142
    .local v1, "res":Lcom/pymcl/ai/BgClearResult;
    invoke-virtual {v1}, Lcom/pymcl/ai/BgClearResult;->getRemovedIds()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    .local v2, "$this$forEach$iv":Ljava/lang/Iterable;
    const/4 v3, 0x0

    .line 216
    .local v3, "$i$f$forEach":I
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    .local v5, "element$iv":Ljava/lang/Object;
    move-object v6, v5

    check-cast v6, Ljava/lang/String;

    .local v6, "it":Ljava/lang/String;
    const/4 v7, 0x0

    .line 142
    .local v7, "$i$a$-forEach-BackgroundTasks$clearFinished$r$1$1":I
    iget-object v8, p0, Lcom/pymcl/ai/BackgroundTasks;->tasks:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v8, v6}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 216
    nop

    .end local v5    # "element$iv":Ljava/lang/Object;
    .end local v6    # "it":Ljava/lang/String;
    .end local v7    # "$i$a$-forEach-BackgroundTasks$clearFinished$r$1$1":I
    goto :goto_0

    .line 217
    :cond_0
    nop

    .line 143
    .end local v2    # "$this$forEach$iv":Ljava/lang/Iterable;
    .end local v3    # "$i$f$forEach":I
    nop

    .line 140
    .end local v0    # "$i$a$-synchronized-BackgroundTasks$clearFinished$r$1":I
    .end local v1    # "res":Lcom/pymcl/ai/BgClearResult;
    monitor-exit p0

    .line 145
    .local v1, "r":Lcom/pymcl/ai/BgClearResult;
    invoke-virtual {v1}, Lcom/pymcl/ai/BgClearResult;->getRemoved()I

    move-result v0

    if-lez v0, :cond_1

    invoke-direct {p0}, Lcom/pymcl/ai/BackgroundTasks;->persist()V

    .line 146
    :cond_1
    return-object v1

    .line 140
    .end local v1    # "r":Lcom/pymcl/ai/BgClearResult;
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final dropChat(Ljava/lang/String;)V
    .locals 8
    .param p1, "chatId"    # Ljava/lang/String;

    const-string v0, "chatId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 150
    invoke-virtual {p0, p1}, Lcom/pymcl/ai/BackgroundTasks;->list(Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    .local v0, "$this$forEach$iv":Ljava/lang/Iterable;
    const/4 v1, 0x0

    .line 218
    .local v1, "$i$f$forEach":I
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    .local v3, "element$iv":Ljava/lang/Object;
    move-object v4, v3

    check-cast v4, Lcom/pymcl/ai/BgTaskInfo;

    .local v4, "it":Lcom/pymcl/ai/BgTaskInfo;
    const/4 v5, 0x0

    .line 150
    .local v5, "$i$a$-forEach-BackgroundTasks$dropChat$1":I
    invoke-virtual {v4}, Lcom/pymcl/ai/BgTaskInfo;->getId()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p0, v6}, Lcom/pymcl/ai/BackgroundTasks;->cancel(Ljava/lang/String;)Z

    iget-object v6, p0, Lcom/pymcl/ai/BackgroundTasks;->tasks:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v4}, Lcom/pymcl/ai/BgTaskInfo;->getId()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 218
    .end local v4    # "it":Lcom/pymcl/ai/BgTaskInfo;
    .end local v5    # "$i$a$-forEach-BackgroundTasks$dropChat$1":I
    nop

    .end local v3    # "element$iv":Ljava/lang/Object;
    goto :goto_0

    .line 219
    :cond_0
    nop

    .line 150
    .end local v0    # "$this$forEach$iv":Ljava/lang/Iterable;
    .end local v1    # "$i$f$forEach":I
    invoke-direct {p0}, Lcom/pymcl/ai/BackgroundTasks;->persist()V

    return-void
.end method

.method public final get(Ljava/lang/String;)Lcom/pymcl/ai/BgTaskInfo;
    .locals 1
    .param p1, "id"    # Ljava/lang/String;

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 122
    iget-object v0, p0, Lcom/pymcl/ai/BackgroundTasks;->tasks:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/pymcl/ai/BgTaskInfo;

    return-object v0
.end method

.method public final getEvents()Lkotlinx/coroutines/flow/SharedFlow;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/SharedFlow<",
            "Lcom/pymcl/ai/BgTaskInfo;",
            ">;"
        }
    .end annotation

    .line 49
    iget-object v0, p0, Lcom/pymcl/ai/BackgroundTasks;->events:Lkotlinx/coroutines/flow/SharedFlow;

    return-object v0
.end method

.method public final getOnFinished()Lkotlin/jvm/functions/Function1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function1<",
            "Lcom/pymcl/ai/BgTaskInfo;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    .line 51
    iget-object v0, p0, Lcom/pymcl/ai/BackgroundTasks;->onFinished:Lkotlin/jvm/functions/Function1;

    return-object v0
.end method

.method public final list(Ljava/lang/String;)Ljava/util/List;
    .locals 10
    .param p1, "chatId"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Lcom/pymcl/ai/BgTaskInfo;",
            ">;"
        }
    .end annotation

    .line 123
    iget-object v0, p0, Lcom/pymcl/ai/BackgroundTasks;->tasks:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->values()Ljava/util/Collection;

    move-result-object v0

    const-string v1, "<get-values>(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Iterable;

    .local v0, "$this$filter$iv":Ljava/lang/Iterable;
    const/4 v1, 0x0

    .line 204
    .local v1, "$i$f$filter":I
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    check-cast v2, Ljava/util/Collection;

    .local v2, "destination$iv$iv":Ljava/util/Collection;
    move-object v3, v0

    .local v3, "$this$filterTo$iv$iv":Ljava/lang/Iterable;
    const/4 v4, 0x0

    .line 205
    .local v4, "$i$f$filterTo":I
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_0
    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    .local v6, "element$iv$iv":Ljava/lang/Object;
    move-object v7, v6

    check-cast v7, Lcom/pymcl/ai/BgTaskInfo;

    .local v7, "it":Lcom/pymcl/ai/BgTaskInfo;
    const/4 v8, 0x0

    .line 123
    .local v8, "$i$a$-filter-BackgroundTasks$list$1":I
    if-eqz p1, :cond_2

    invoke-virtual {v7}, Lcom/pymcl/ai/BgTaskInfo;->getChatId()Ljava/lang/String;

    move-result-object v9

    invoke-static {v9, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_1

    goto :goto_1

    :cond_1
    const/4 v9, 0x0

    goto :goto_2

    :cond_2
    :goto_1
    const/4 v9, 0x1

    .line 205
    .end local v7    # "it":Lcom/pymcl/ai/BgTaskInfo;
    .end local v8    # "$i$a$-filter-BackgroundTasks$list$1":I
    :goto_2
    if-eqz v9, :cond_0

    invoke-interface {v2, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 206
    .end local v6    # "element$iv$iv":Ljava/lang/Object;
    :cond_3
    nop

    .end local v2    # "destination$iv$iv":Ljava/util/Collection;
    .end local v3    # "$this$filterTo$iv$iv":Ljava/lang/Iterable;
    .end local v4    # "$i$f$filterTo":I
    check-cast v2, Ljava/util/List;

    .line 204
    nop

    .end local v0    # "$this$filter$iv":Ljava/lang/Iterable;
    .end local v1    # "$i$f$filter":I
    check-cast v2, Ljava/lang/Iterable;

    .line 123
    nop

    .local v2, "$this$sortedBy$iv":Ljava/lang/Iterable;
    const/4 v0, 0x0

    .line 207
    .local v0, "$i$f$sortedBy":I
    new-instance v1, Lcom/pymcl/ai/BackgroundTasks$list$$inlined$sortedBy$1;

    invoke-direct {v1}, Lcom/pymcl/ai/BackgroundTasks$list$$inlined$sortedBy$1;-><init>()V

    check-cast v1, Ljava/util/Comparator;

    invoke-static {v2, v1}, Lkotlin/collections/CollectionsKt;->sortedWith(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object v0

    .line 123
    .end local v0    # "$i$f$sortedBy":I
    .end local v2    # "$this$sortedBy$iv":Ljava/lang/Iterable;
    return-object v0
.end method

.method public final running(Ljava/lang/String;)Ljava/util/List;
    .locals 9
    .param p1, "chatId"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Lcom/pymcl/ai/BgTaskInfo;",
            ">;"
        }
    .end annotation

    const-string v0, "chatId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 124
    invoke-virtual {p0, p1}, Lcom/pymcl/ai/BackgroundTasks;->list(Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    .local v0, "$this$filter$iv":Ljava/lang/Iterable;
    const/4 v1, 0x0

    .line 208
    .local v1, "$i$f$filter":I
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    check-cast v2, Ljava/util/Collection;

    .local v2, "destination$iv$iv":Ljava/util/Collection;
    move-object v3, v0

    .local v3, "$this$filterTo$iv$iv":Ljava/lang/Iterable;
    const/4 v4, 0x0

    .line 209
    .local v4, "$i$f$filterTo":I
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_0
    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_1

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    .local v6, "element$iv$iv":Ljava/lang/Object;
    move-object v7, v6

    check-cast v7, Lcom/pymcl/ai/BgTaskInfo;

    .local v7, "it":Lcom/pymcl/ai/BgTaskInfo;
    const/4 v8, 0x0

    .line 124
    .local v8, "$i$a$-filter-BackgroundTasks$running$1":I
    invoke-virtual {v7}, Lcom/pymcl/ai/BgTaskInfo;->getRunning()Z

    move-result v7

    .line 209
    .end local v7    # "it":Lcom/pymcl/ai/BgTaskInfo;
    .end local v8    # "$i$a$-filter-BackgroundTasks$running$1":I
    if-eqz v7, :cond_0

    invoke-interface {v2, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 210
    .end local v6    # "element$iv$iv":Ljava/lang/Object;
    :cond_1
    nop

    .end local v2    # "destination$iv$iv":Ljava/util/Collection;
    .end local v3    # "$this$filterTo$iv$iv":Ljava/lang/Iterable;
    .end local v4    # "$i$f$filterTo":I
    check-cast v2, Ljava/util/List;

    .line 208
    nop

    .line 124
    .end local v0    # "$this$filter$iv":Ljava/lang/Iterable;
    .end local v1    # "$i$f$filter":I
    return-object v2
.end method

.method public final setOnFinished(Lkotlin/jvm/functions/Function1;)V
    .locals 0
    .param p1, "<set-?>"    # Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/pymcl/ai/BgTaskInfo;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 51
    iput-object p1, p0, Lcom/pymcl/ai/BackgroundTasks;->onFinished:Lkotlin/jvm/functions/Function1;

    return-void
.end method

.method public final start(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)Ljava/lang/String;
    .locals 21
    .param p1, "chatId"    # Ljava/lang/String;
    .param p2, "callId"    # Ljava/lang/String;
    .param p3, "tool"    # Ljava/lang/String;
    .param p4, "title"    # Ljava/lang/String;
    .param p5, "turnId"    # Ljava/lang/String;
    .param p6, "block"    # Lkotlin/jvm/functions/Function2;
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
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Ljava/lang/Float;",
            "-",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;-",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/pymcl/ai/ToolOutput;",
            ">;+",
            "Ljava/lang/Object;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v2, p6

    const-string v0, "chatId"

    move-object/from16 v5, p1

    invoke-static {v5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callId"

    move-object/from16 v6, p2

    invoke-static {v6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "tool"

    move-object/from16 v7, p3

    invoke-static {v7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "title"

    move-object/from16 v8, p4

    invoke-static {v8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "turnId"

    move-object/from16 v3, p5

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "block"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 82
    monitor-enter p0

    .line 167
    const/4 v0, 0x0

    .line 82
    .local v0, "$i$a$-synchronized-BackgroundTasks$start$id$1":I
    :try_start_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v9

    const/16 v4, 0x24

    invoke-static {v4}, Lkotlin/text/CharsKt;->checkRadix(I)I

    move-result v4

    invoke-static {v9, v10, v4}, Ljava/lang/Long;->toString(JI)Ljava/lang/String;

    move-result-object v4

    const-string v9, "toString(...)"

    invoke-static {v4, v9}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget v9, v1, Lcom/pymcl/ai/BackgroundTasks;->seq:I

    add-int/lit8 v9, v9, 0x1

    iput v9, v1, Lcom/pymcl/ai/BackgroundTasks;->seq:I

    iget v9, v1, Lcom/pymcl/ai/BackgroundTasks;->seq:I

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    const-string v11, "bg-"

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {v10, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v10, "-"

    invoke-virtual {v4, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .end local v0    # "$i$a$-synchronized-BackgroundTasks$start$id$1":I
    monitor-exit p0

    .line 83
    .local v4, "id":Ljava/lang/String;
    new-instance v3, Lcom/pymcl/ai/BgTaskInfo;

    const-string v9, "running"

    const-string v11, "\u540e\u53f0\u8fd0\u884c\u4e2d"

    const/16 v19, 0xf00

    const/16 v20, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x0

    const-wide/16 v13, 0x0

    const-wide/16 v15, 0x0

    const/16 v17, 0x0

    move-object/from16 v18, p5

    invoke-direct/range {v3 .. v20}, Lcom/pymcl/ai/BgTaskInfo;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/String;JJZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 84
    .local v3, "t":Lcom/pymcl/ai/BgTaskInfo;
    iget-object v0, v1, Lcom/pymcl/ai/BackgroundTasks;->tasks:Ljava/util/concurrent/ConcurrentHashMap;

    check-cast v0, Ljava/util/Map;

    invoke-interface {v0, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, v1, Lcom/pymcl/ai/BackgroundTasks;->_events:Lkotlinx/coroutines/flow/MutableSharedFlow;

    invoke-interface {v0, v3}, Lkotlinx/coroutines/flow/MutableSharedFlow;->tryEmit(Ljava/lang/Object;)Z

    invoke-direct {v1}, Lcom/pymcl/ai/BackgroundTasks;->persist()V

    .line 87
    iget-object v5, v1, Lcom/pymcl/ai/BackgroundTasks;->scope:Lkotlinx/coroutines/CoroutineScope;

    sget-object v7, Lkotlinx/coroutines/CoroutineStart;->LAZY:Lkotlinx/coroutines/CoroutineStart;

    new-instance v0, Lcom/pymcl/ai/BackgroundTasks$start$job$1;

    const/4 v6, 0x0

    invoke-direct {v0, v2, v1, v4, v6}, Lcom/pymcl/ai/BackgroundTasks$start$job$1;-><init>(Lkotlin/jvm/functions/Function2;Lcom/pymcl/ai/BackgroundTasks;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    move-object v8, v0

    check-cast v8, Lkotlin/jvm/functions/Function2;

    const/4 v9, 0x1

    invoke-static/range {v5 .. v10}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    move-result-object v0

    .line 100
    .local v0, "job":Lkotlinx/coroutines/Job;
    iget-object v5, v1, Lcom/pymcl/ai/BackgroundTasks;->jobs:Ljava/util/concurrent/ConcurrentHashMap;

    check-cast v5, Ljava/util/Map;

    invoke-interface {v5, v4, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v0}, Lkotlinx/coroutines/Job;->start()Z

    .line 101
    return-object v4

    .line 82
    .end local v0    # "job":Lkotlinx/coroutines/Job;
    .end local v3    # "t":Lcom/pymcl/ai/BgTaskInfo;
    .end local v4    # "id":Ljava/lang/String;
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final takeFinished(Ljava/lang/String;)Ljava/util/List;
    .locals 11
    .param p1, "chatId"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Lcom/pymcl/ai/BgTaskInfo;",
            ">;"
        }
    .end annotation

    const-string v0, "chatId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 129
    invoke-virtual {p0, p1}, Lcom/pymcl/ai/BackgroundTasks;->unreported(Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    .line 130
    .local v0, "list":Ljava/util/List;
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    .line 131
    :cond_0
    move-object v1, v0

    check-cast v1, Ljava/lang/Iterable;

    .local v1, "$this$forEach$iv":Ljava/lang/Iterable;
    const/4 v2, 0x0

    .line 214
    .local v2, "$i$f$forEach":I
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    .local v4, "element$iv":Ljava/lang/Object;
    move-object v5, v4

    check-cast v5, Lcom/pymcl/ai/BgTaskInfo;

    .local v5, "t":Lcom/pymcl/ai/BgTaskInfo;
    const/4 v6, 0x0

    .line 131
    .local v6, "$i$a$-forEach-BackgroundTasks$takeFinished$1":I
    iget-object v7, p0, Lcom/pymcl/ai/BackgroundTasks;->tasks:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v5}, Lcom/pymcl/ai/BgTaskInfo;->getId()Ljava/lang/String;

    move-result-object v8

    new-instance v9, Lcom/pymcl/ai/BackgroundTasks$$ExternalSyntheticLambda0;

    invoke-direct {v9}, Lcom/pymcl/ai/BackgroundTasks$$ExternalSyntheticLambda0;-><init>()V

    new-instance v10, Lcom/pymcl/ai/BackgroundTasks$$ExternalSyntheticLambda1;

    invoke-direct {v10, v9}, Lcom/pymcl/ai/BackgroundTasks$$ExternalSyntheticLambda1;-><init>(Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {v7, v8, v10}, Ljava/util/concurrent/ConcurrentHashMap;->computeIfPresent(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;

    .line 214
    .end local v5    # "t":Lcom/pymcl/ai/BgTaskInfo;
    .end local v6    # "$i$a$-forEach-BackgroundTasks$takeFinished$1":I
    nop

    .end local v4    # "element$iv":Ljava/lang/Object;
    goto :goto_0

    .line 215
    :cond_1
    nop

    .line 132
    .end local v1    # "$this$forEach$iv":Ljava/lang/Iterable;
    .end local v2    # "$i$f$forEach":I
    invoke-direct {p0}, Lcom/pymcl/ai/BackgroundTasks;->persist()V

    return-object v0
.end method

.method public final unreported(Ljava/lang/String;)Ljava/util/List;
    .locals 10
    .param p1, "chatId"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Lcom/pymcl/ai/BgTaskInfo;",
            ">;"
        }
    .end annotation

    const-string v0, "chatId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 125
    invoke-virtual {p0, p1}, Lcom/pymcl/ai/BackgroundTasks;->list(Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    .local v0, "$this$filter$iv":Ljava/lang/Iterable;
    const/4 v1, 0x0

    .line 211
    .local v1, "$i$f$filter":I
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    check-cast v2, Ljava/util/Collection;

    .local v2, "destination$iv$iv":Ljava/util/Collection;
    move-object v3, v0

    .local v3, "$this$filterTo$iv$iv":Ljava/lang/Iterable;
    const/4 v4, 0x0

    .line 212
    .local v4, "$i$f$filterTo":I
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_0
    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_2

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    .local v6, "element$iv$iv":Ljava/lang/Object;
    move-object v7, v6

    check-cast v7, Lcom/pymcl/ai/BgTaskInfo;

    .local v7, "it":Lcom/pymcl/ai/BgTaskInfo;
    const/4 v8, 0x0

    .line 125
    .local v8, "$i$a$-filter-BackgroundTasks$unreported$1":I
    invoke-virtual {v7}, Lcom/pymcl/ai/BgTaskInfo;->getRunning()Z

    move-result v9

    if-nez v9, :cond_1

    invoke-virtual {v7}, Lcom/pymcl/ai/BgTaskInfo;->getReported()Z

    move-result v9

    if-nez v9, :cond_1

    const/4 v9, 0x1

    goto :goto_1

    :cond_1
    const/4 v9, 0x0

    .line 212
    .end local v7    # "it":Lcom/pymcl/ai/BgTaskInfo;
    .end local v8    # "$i$a$-filter-BackgroundTasks$unreported$1":I
    :goto_1
    if-eqz v9, :cond_0

    invoke-interface {v2, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 213
    .end local v6    # "element$iv$iv":Ljava/lang/Object;
    :cond_2
    nop

    .end local v2    # "destination$iv$iv":Ljava/util/Collection;
    .end local v3    # "$this$filterTo$iv$iv":Ljava/lang/Iterable;
    .end local v4    # "$i$f$filterTo":I
    check-cast v2, Ljava/util/List;

    .line 211
    nop

    .line 125
    .end local v0    # "$this$filter$iv":Ljava/lang/Iterable;
    .end local v1    # "$i$f$filter":I
    return-object v2
.end method
