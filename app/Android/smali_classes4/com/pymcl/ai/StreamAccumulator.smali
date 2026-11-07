.class public final Lcom/pymcl/ai/StreamAccumulator;
.super Ljava/lang/Object;
.source "Sse.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/pymcl/ai/StreamAccumulator$Partial;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nSse.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sse.kt\ncom/pymcl/ai/StreamAccumulator\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,96:1\n1#2:97\n2077#3,2:98\n296#3,2:100\n2079#3:109\n777#3:110\n873#3,2:111\n1739#3:113\n1814#3,3:114\n460#4,7:102\n*S KotlinDebug\n*F\n+ 1 Sse.kt\ncom/pymcl/ai/StreamAccumulator\n*L\n75#1:98,2\n78#1:100,2\n75#1:109\n90#1:110\n90#1:111,2\n90#1:113\n90#1:114,3\n80#1:102,7\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u000b\n\u0002\u0008\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0018\u00002\u00020\u0001:\u0001)B3\u0012\u0014\u0008\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u0014\u0008\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u000e\u0010!\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020\u0004J\u000c\u0010#\u001a\u0008\u0012\u0004\u0012\u00020%0$J\u000e\u0010&\u001a\u00020\'2\u0006\u0010(\u001a\u00020\u0004R\u001a\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u00060\nj\u0002`\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u000c\u001a\u00060\nj\u0002`\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\"\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0012@BX\u0086\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0014\u0010\u0015R\"\u0010\u0016\u001a\u0004\u0018\u00010\u00042\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0004@BX\u0086\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0017\u0010\u0018R\u001e\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0011\u001a\u00020\u0019@BX\u0086\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001b\u0010\u001cR\"\u0010\u001d\u001a\u0004\u0018\u00010\u00042\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0004@BX\u0086\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001e\u0010\u0018R\u001e\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0004@BX\u0086\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008 \u0010\u0018\u00a8\u0006*"
    }
    d2 = {
        "Lcom/pymcl/ai/StreamAccumulator;",
        "",
        "onContent",
        "Lkotlin/Function1;",
        "",
        "",
        "onReasoning",
        "<init>",
        "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V",
        "content",
        "Ljava/lang/StringBuilder;",
        "Lkotlin/text/StringBuilder;",
        "reasoning",
        "calls",
        "Ljava/util/SortedMap;",
        "",
        "Lcom/pymcl/ai/StreamAccumulator$Partial;",
        "value",
        "Lcom/pymcl/ai/Usage;",
        "usage",
        "getUsage",
        "()Lcom/pymcl/ai/Usage;",
        "finishReason",
        "getFinishReason",
        "()Ljava/lang/String;",
        "",
        "done",
        "getDone",
        "()Z",
        "error",
        "getError",
        "model",
        "getModel",
        "accept",
        "data",
        "toolCalls",
        "",
        "Lcom/pymcl/ai/ToolCall;",
        "result",
        "Lcom/pymcl/ai/AssistantTurn;",
        "requestModel",
        "Partial",
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


# instance fields
.field private final calls:Ljava/util/SortedMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/SortedMap<",
            "Ljava/lang/Integer;",
            "Lcom/pymcl/ai/StreamAccumulator$Partial;",
            ">;"
        }
    .end annotation
.end field

.field private final content:Ljava/lang/StringBuilder;

.field private done:Z

.field private error:Ljava/lang/String;

.field private finishReason:Ljava/lang/String;

.field private model:Ljava/lang/String;

.field private final onContent:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field private final onReasoning:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field private final reasoning:Ljava/lang/StringBuilder;

.field private usage:Lcom/pymcl/ai/Usage;


# direct methods
.method public static synthetic $r8$lambda$Urh5Ozyt4mxMJy9pQNIdKMPAXG0(Ljava/lang/String;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/pymcl/ai/StreamAccumulator;->_init_$lambda$0(Ljava/lang/String;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$XH_hZ4NPOkJqqrNFGo9oPedhXNE(Ljava/lang/String;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/pymcl/ai/StreamAccumulator;->_init_$lambda$1(Ljava/lang/String;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public constructor <init>()V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x3

    invoke-direct {p0, v0, v0, v1, v0}, Lcom/pymcl/ai/StreamAccumulator;-><init>(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V
    .locals 1
    .param p1, "onContent"    # Lkotlin/jvm/functions/Function1;
    .param p2, "onReasoning"    # Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const-string v0, "onContent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onReasoning"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 46
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 47
    iput-object p1, p0, Lcom/pymcl/ai/StreamAccumulator;->onContent:Lkotlin/jvm/functions/Function1;

    .line 48
    iput-object p2, p0, Lcom/pymcl/ai/StreamAccumulator;->onReasoning:Lkotlin/jvm/functions/Function1;

    .line 50
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iput-object v0, p0, Lcom/pymcl/ai/StreamAccumulator;->content:Ljava/lang/StringBuilder;

    .line 51
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iput-object v0, p0, Lcom/pymcl/ai/StreamAccumulator;->reasoning:Ljava/lang/StringBuilder;

    .line 53
    const/4 v0, 0x0

    new-array v0, v0, [Lkotlin/Pair;

    invoke-static {v0}, Lkotlin/collections/MapsKt;->sortedMapOf([Lkotlin/Pair;)Ljava/util/SortedMap;

    move-result-object v0

    iput-object v0, p0, Lcom/pymcl/ai/StreamAccumulator;->calls:Ljava/util/SortedMap;

    .line 58
    const-string v0, ""

    iput-object v0, p0, Lcom/pymcl/ai/StreamAccumulator;->model:Ljava/lang/String;

    .line 46
    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 46
    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    .line 47
    new-instance p1, Lcom/pymcl/ai/StreamAccumulator$$ExternalSyntheticLambda0;

    invoke-direct {p1}, Lcom/pymcl/ai/StreamAccumulator$$ExternalSyntheticLambda0;-><init>()V

    .line 46
    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    .line 48
    new-instance p2, Lcom/pymcl/ai/StreamAccumulator$$ExternalSyntheticLambda1;

    invoke-direct {p2}, Lcom/pymcl/ai/StreamAccumulator$$ExternalSyntheticLambda1;-><init>()V

    .line 46
    :cond_1
    invoke-direct {p0, p1, p2}, Lcom/pymcl/ai/StreamAccumulator;-><init>(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 49
    return-void
.end method

.method private static final _init_$lambda$0(Ljava/lang/String;)Lkotlin/Unit;
    .locals 1
    .param p0, "it"    # Ljava/lang/String;

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 47
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method private static final _init_$lambda$1(Ljava/lang/String;)Lkotlin/Unit;
    .locals 1
    .param p0, "it"    # Ljava/lang/String;

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 48
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method


# virtual methods
.method public final accept(Ljava/lang/String;)V
    .locals 33
    .param p1, "data"    # Ljava/lang/String;

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    const-string v0, "data"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 62
    move-object v0, v2

    check-cast v0, Ljava/lang/CharSequence;

    invoke-static {v0}, Lkotlin/text/StringsKt;->trim(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    .line 63
    .local v3, "d":Ljava/lang/String;
    move-object v0, v3

    check-cast v0, Ljava/lang/CharSequence;

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-nez v0, :cond_0

    move v0, v4

    goto :goto_0

    :cond_0
    move v0, v5

    :goto_0
    if-eqz v0, :cond_1

    return-void

    .line 64
    :cond_1
    const-string v0, "[DONE]"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    iput-boolean v4, v1, Lcom/pymcl/ai/StreamAccumulator;->done:Z

    return-void

    .line 65
    :cond_2
    :try_start_0
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object v0, v1

    check-cast v0, Lcom/pymcl/ai/StreamAccumulator;

    .line 97
    .local v0, "$this$accept_u24lambda_u240":Lcom/pymcl/ai/StreamAccumulator;
    const/4 v6, 0x0

    .line 65
    .local v6, "$i$a$-runCatching-StreamAccumulator$accept$o$1":I
    sget-object v7, Lcom/pymcl/core/util/Json;->INSTANCE:Lcom/pymcl/core/util/Json;

    invoke-virtual {v7, v3}, Lcom/pymcl/core/util/Json;->obj(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v7

    .end local v0    # "$this$accept_u24lambda_u240":Lcom/pymcl/ai/StreamAccumulator;
    .end local v6    # "$i$a$-runCatching-StreamAccumulator$accept$o$1":I
    invoke-static {v7}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v0

    sget-object v6, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    :goto_1
    invoke-static {v0}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    move-result v6

    const/4 v7, 0x0

    if-eqz v6, :cond_3

    move-object v0, v7

    :cond_3
    check-cast v0, Ljava/util/Map;

    if-nez v0, :cond_4

    return-void

    .line 66
    .local v0, "o":Ljava/util/Map;
    :cond_4
    const-string v6, "error"

    invoke-static {v0, v6}, Lcom/pymcl/core/util/JsonKt;->obj(Ljava/util/Map;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v6

    const/4 v8, 0x2

    const-string v9, "message"

    if-eqz v6, :cond_6

    .line 97
    .local v6, "e":Ljava/util/Map;
    const/4 v10, 0x0

    .line 66
    .local v10, "$i$a$-let-StreamAccumulator$accept$1":I
    invoke-static {v6, v9}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    if-nez v11, :cond_5

    sget-object v11, Lcom/pymcl/core/util/Json;->INSTANCE:Lcom/pymcl/core/util/Json;

    invoke-static {v11, v6, v5, v8, v7}, Lcom/pymcl/core/util/Json;->stringify$default(Lcom/pymcl/core/util/Json;Ljava/lang/Object;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v11

    :cond_5
    iput-object v11, v1, Lcom/pymcl/ai/StreamAccumulator;->error:Ljava/lang/String;

    .line 67
    .end local v6    # "e":Ljava/util/Map;
    .end local v10    # "$i$a$-let-StreamAccumulator$accept$1":I
    :cond_6
    const-string v6, "model"

    invoke-static {v0, v6}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    if-eqz v6, :cond_8

    .line 97
    .local v6, "it":Ljava/lang/String;
    const/4 v10, 0x0

    .line 67
    .local v10, "$i$a$-let-StreamAccumulator$accept$2":I
    move-object v11, v6

    check-cast v11, Ljava/lang/CharSequence;

    invoke-interface {v11}, Ljava/lang/CharSequence;->length()I

    move-result v11

    if-lez v11, :cond_7

    move v11, v4

    goto :goto_2

    :cond_7
    move v11, v5

    :goto_2
    if-eqz v11, :cond_8

    iput-object v6, v1, Lcom/pymcl/ai/StreamAccumulator;->model:Ljava/lang/String;

    .line 68
    .end local v6    # "it":Ljava/lang/String;
    .end local v10    # "$i$a$-let-StreamAccumulator$accept$2":I
    :cond_8
    const-string v6, "usage"

    invoke-static {v0, v6}, Lcom/pymcl/core/util/JsonKt;->obj(Ljava/util/Map;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v6

    if-eqz v6, :cond_e

    .line 97
    .local v6, "u":Ljava/util/Map;
    const/4 v10, 0x0

    .line 68
    .local v10, "$i$a$-let-StreamAccumulator$accept$3":I
    new-instance v11, Lcom/pymcl/ai/Usage;

    const-string v12, "prompt_tokens"

    invoke-static {v6, v12}, Lcom/pymcl/core/util/JsonKt;->long(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v13

    const-wide/16 v14, 0x0

    if-eqz v13, :cond_9

    invoke-virtual {v13}, Ljava/lang/Long;->longValue()J

    move-result-wide v16

    goto :goto_3

    :cond_9
    move-wide/from16 v16, v14

    :goto_3
    const-string v13, "completion_tokens"

    invoke-static {v6, v13}, Lcom/pymcl/core/util/JsonKt;->long(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v18

    if-eqz v18, :cond_a

    invoke-virtual/range {v18 .. v18}, Ljava/lang/Long;->longValue()J

    move-result-wide v18

    goto :goto_4

    :cond_a
    move-wide/from16 v18, v14

    :goto_4
    const-string v4, "total_tokens"

    invoke-static {v6, v4}, Lcom/pymcl/core/util/JsonKt;->long(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v4

    if-eqz v4, :cond_b

    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    move-result-wide v12

    goto :goto_6

    :cond_b
    invoke-static {v6, v12}, Lcom/pymcl/core/util/JsonKt;->long(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v4

    if-eqz v4, :cond_c

    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    move-result-wide v21

    goto :goto_5

    :cond_c
    move-wide/from16 v21, v14

    :goto_5
    invoke-static {v6, v13}, Lcom/pymcl/core/util/JsonKt;->long(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v4

    if-eqz v4, :cond_d

    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    move-result-wide v14

    :cond_d
    add-long v12, v21, v14

    :goto_6
    move-wide/from16 v14, v18

    const/16 v19, 0x8

    const/16 v20, 0x0

    const/16 v18, 0x0

    move-wide/from16 v31, v16

    move-wide/from16 v16, v12

    move-wide/from16 v12, v31

    invoke-direct/range {v11 .. v20}, Lcom/pymcl/ai/Usage;-><init>(JJJZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v11, v1, Lcom/pymcl/ai/StreamAccumulator;->usage:Lcom/pymcl/ai/Usage;

    .line 69
    .end local v6    # "u":Ljava/util/Map;
    .end local v10    # "$i$a$-let-StreamAccumulator$accept$3":I
    :cond_e
    const-string v4, "choices"

    invoke-static {v0, v4}, Lcom/pymcl/core/util/JsonKt;->arr(Ljava/util/Map;Ljava/lang/String;)Ljava/util/List;

    move-result-object v4

    invoke-static {v4}, Lcom/pymcl/core/util/JsonKt;->objs(Ljava/util/List;)Ljava/util/List;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_7
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_32

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/Map;

    .line 70
    .local v6, "ch":Ljava/util/Map;
    const-string v10, "finish_reason"

    invoke-static {v6, v10}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    if-eqz v10, :cond_10

    .line 97
    .local v10, "it":Ljava/lang/String;
    const/4 v11, 0x0

    .line 70
    .local v11, "$i$a$-let-StreamAccumulator$accept$4":I
    move-object v12, v10

    check-cast v12, Ljava/lang/CharSequence;

    invoke-interface {v12}, Ljava/lang/CharSequence;->length()I

    move-result v12

    if-lez v12, :cond_f

    const/4 v12, 0x1

    goto :goto_8

    :cond_f
    move v12, v5

    :goto_8
    if-eqz v12, :cond_10

    const-string v12, "null"

    invoke-static {v10, v12}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_10

    iput-object v10, v1, Lcom/pymcl/ai/StreamAccumulator;->finishReason:Ljava/lang/String;

    .line 71
    .end local v10    # "it":Ljava/lang/String;
    .end local v11    # "$i$a$-let-StreamAccumulator$accept$4":I
    :cond_10
    const-string v10, "delta"

    invoke-static {v6, v10}, Lcom/pymcl/core/util/JsonKt;->obj(Ljava/util/Map;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v10

    if-nez v10, :cond_11

    invoke-static {v6, v9}, Lcom/pymcl/core/util/JsonKt;->obj(Ljava/util/Map;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v10

    if-nez v10, :cond_11

    goto :goto_7

    .line 72
    .local v10, "delta":Ljava/util/Map;
    :cond_11
    const-string v11, "reasoning_content"

    invoke-static {v10, v11}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    if-eqz v11, :cond_14

    move-object v12, v11

    .line 97
    .local v12, "it":Ljava/lang/String;
    const/4 v13, 0x0

    .line 72
    .local v13, "$i$a$-takeIf-StreamAccumulator$accept$5":I
    move-object v14, v12

    check-cast v14, Ljava/lang/CharSequence;

    invoke-interface {v14}, Ljava/lang/CharSequence;->length()I

    move-result v14

    if-lez v14, :cond_12

    const/4 v14, 0x1

    goto :goto_9

    :cond_12
    move v14, v5

    .end local v12    # "it":Ljava/lang/String;
    .end local v13    # "$i$a$-takeIf-StreamAccumulator$accept$5":I
    :goto_9
    if-eqz v14, :cond_13

    goto :goto_a

    :cond_13
    move-object v11, v7

    :goto_a
    if-eqz v11, :cond_14

    .line 97
    .local v11, "it":Ljava/lang/String;
    const/4 v12, 0x0

    .line 72
    .local v12, "$i$a$-let-StreamAccumulator$accept$6":I
    iget-object v13, v1, Lcom/pymcl/ai/StreamAccumulator;->reasoning:Ljava/lang/StringBuilder;

    invoke-virtual {v13, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v13, v1, Lcom/pymcl/ai/StreamAccumulator;->onReasoning:Lkotlin/jvm/functions/Function1;

    invoke-interface {v13, v11}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .end local v11    # "it":Ljava/lang/String;
    .end local v12    # "$i$a$-let-StreamAccumulator$accept$6":I
    goto :goto_d

    .line 73
    :cond_14
    const-string v11, "reasoning"

    invoke-static {v10, v11}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    if-eqz v11, :cond_17

    move-object v12, v11

    .line 97
    .local v12, "it":Ljava/lang/String;
    const/4 v13, 0x0

    .line 73
    .local v13, "$i$a$-takeIf-StreamAccumulator$accept$7":I
    move-object v14, v12

    check-cast v14, Ljava/lang/CharSequence;

    invoke-interface {v14}, Ljava/lang/CharSequence;->length()I

    move-result v14

    if-lez v14, :cond_15

    const/4 v14, 0x1

    goto :goto_b

    :cond_15
    move v14, v5

    .end local v12    # "it":Ljava/lang/String;
    .end local v13    # "$i$a$-takeIf-StreamAccumulator$accept$7":I
    :goto_b
    if-eqz v14, :cond_16

    goto :goto_c

    :cond_16
    move-object v11, v7

    :goto_c
    if-eqz v11, :cond_17

    .line 97
    .restart local v11    # "it":Ljava/lang/String;
    const/4 v12, 0x0

    .line 73
    .local v12, "$i$a$-let-StreamAccumulator$accept$8":I
    iget-object v13, v1, Lcom/pymcl/ai/StreamAccumulator;->reasoning:Ljava/lang/StringBuilder;

    invoke-virtual {v13, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v13, v1, Lcom/pymcl/ai/StreamAccumulator;->onReasoning:Lkotlin/jvm/functions/Function1;

    invoke-interface {v13, v11}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 74
    .end local v11    # "it":Ljava/lang/String;
    .end local v12    # "$i$a$-let-StreamAccumulator$accept$8":I
    :cond_17
    :goto_d
    const-string v11, "content"

    invoke-interface {v10, v11}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    instance-of v12, v11, Ljava/lang/String;

    if-eqz v12, :cond_18

    check-cast v11, Ljava/lang/String;

    goto :goto_e

    :cond_18
    move-object v11, v7

    :goto_e
    if-eqz v11, :cond_1b

    move-object v12, v11

    .line 97
    .local v12, "it":Ljava/lang/String;
    const/4 v13, 0x0

    .line 74
    .local v13, "$i$a$-takeIf-StreamAccumulator$accept$9":I
    move-object v14, v12

    check-cast v14, Ljava/lang/CharSequence;

    invoke-interface {v14}, Ljava/lang/CharSequence;->length()I

    move-result v14

    if-lez v14, :cond_19

    const/4 v14, 0x1

    goto :goto_f

    :cond_19
    move v14, v5

    .end local v12    # "it":Ljava/lang/String;
    .end local v13    # "$i$a$-takeIf-StreamAccumulator$accept$9":I
    :goto_f
    if-eqz v14, :cond_1a

    goto :goto_10

    :cond_1a
    move-object v11, v7

    :goto_10
    if-eqz v11, :cond_1b

    .line 97
    .restart local v11    # "it":Ljava/lang/String;
    const/4 v12, 0x0

    .line 74
    .local v12, "$i$a$-let-StreamAccumulator$accept$10":I
    iget-object v13, v1, Lcom/pymcl/ai/StreamAccumulator;->content:Ljava/lang/StringBuilder;

    invoke-virtual {v13, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v13, v1, Lcom/pymcl/ai/StreamAccumulator;->onContent:Lkotlin/jvm/functions/Function1;

    invoke-interface {v13, v11}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 75
    .end local v11    # "it":Ljava/lang/String;
    .end local v12    # "$i$a$-let-StreamAccumulator$accept$10":I
    :cond_1b
    const-string v11, "tool_calls"

    invoke-static {v10, v11}, Lcom/pymcl/core/util/JsonKt;->arr(Ljava/util/Map;Ljava/lang/String;)Ljava/util/List;

    move-result-object v11

    invoke-static {v11}, Lcom/pymcl/core/util/JsonKt;->objs(Ljava/util/List;)Ljava/util/List;

    move-result-object v11

    check-cast v11, Ljava/lang/Iterable;

    .local v11, "$this$forEachIndexed$iv":Ljava/lang/Iterable;
    const/4 v12, 0x0

    .line 98
    .local v12, "$i$f$forEachIndexed":I
    const/4 v13, 0x0

    .line 99
    .local v13, "index$iv":I
    invoke-interface {v11}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v14

    :goto_11
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    move-result v15

    if-eqz v15, :cond_31

    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v15

    .local v15, "item$iv":Ljava/lang/Object;
    add-int/lit8 v16, v13, 0x1

    .end local v13    # "index$iv":I
    .local v16, "index$iv":I
    if-gez v13, :cond_1c

    invoke-static {}, Lkotlin/collections/CollectionsKt;->throwIndexOverflow()V

    :cond_1c
    move-object v5, v15

    check-cast v5, Ljava/util/Map;

    .local v5, "tc":Ljava/util/Map;
    .local v13, "pos":I
    const/16 v18, 0x0

    .line 76
    .local v18, "$i$a$-forEachIndexed-StreamAccumulator$accept$11":I
    const-string v7, "index"

    invoke-static {v5, v7}, Lcom/pymcl/core/util/JsonKt;->int(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v7

    const-string v8, "id"

    if-eqz v7, :cond_1d

    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    move-result v7

    move-object/from16 v22, v0

    move-object/from16 v23, v3

    goto/16 :goto_17

    :cond_1d
    move-object v7, v1

    check-cast v7, Lcom/pymcl/ai/StreamAccumulator;

    .local v7, "$this$accept_u24lambda_u2411_u240":Lcom/pymcl/ai/StreamAccumulator;
    const/16 v21, 0x0

    .line 78
    .local v21, "$i$a$-run-StreamAccumulator$accept$11$idx$1":I
    move-object/from16 v22, v0

    .end local v0    # "o":Ljava/util/Map;
    .local v22, "o":Ljava/util/Map;
    invoke-static {v5, v8}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .local v0, "id":Ljava/lang/String;
    iget-object v2, v7, Lcom/pymcl/ai/StreamAccumulator;->calls:Ljava/util/SortedMap;

    invoke-interface {v2}, Ljava/util/SortedMap;->entrySet()Ljava/util/Set;

    move-result-object v2

    move-object/from16 v23, v3

    .end local v3    # "d":Ljava/lang/String;
    .local v23, "d":Ljava/lang/String;
    const-string v3, "<get-entries>(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Ljava/lang/Iterable;

    .local v2, "$this$firstOrNull$iv":Ljava/lang/Iterable;
    const/4 v3, 0x0

    .line 100
    .local v3, "$i$f$firstOrNull":I
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v24

    :goto_12
    invoke-interface/range {v24 .. v24}, Ljava/util/Iterator;->hasNext()Z

    move-result v25

    if-eqz v25, :cond_21

    invoke-interface/range {v24 .. v24}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v25

    .local v25, "element$iv":Ljava/lang/Object;
    move-object/from16 v26, v25

    check-cast v26, Ljava/util/Map$Entry;

    .local v26, "it":Ljava/util/Map$Entry;
    const/16 v27, 0x0

    .line 78
    .local v27, "$i$a$-firstOrNull-StreamAccumulator$accept$11$idx$1$1":I
    if-eqz v0, :cond_1e

    invoke-interface/range {v26 .. v26}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v28

    check-cast v28, Lcom/pymcl/ai/StreamAccumulator$Partial;

    move-object/from16 v29, v2

    .end local v2    # "$this$firstOrNull$iv":Ljava/lang/Iterable;
    .local v29, "$this$firstOrNull$iv":Ljava/lang/Iterable;
    invoke-virtual/range {v28 .. v28}, Lcom/pymcl/ai/StreamAccumulator$Partial;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1f

    const/4 v2, 0x1

    goto :goto_13

    .end local v29    # "$this$firstOrNull$iv":Ljava/lang/Iterable;
    .restart local v2    # "$this$firstOrNull$iv":Ljava/lang/Iterable;
    :cond_1e
    move-object/from16 v29, v2

    .end local v2    # "$this$firstOrNull$iv":Ljava/lang/Iterable;
    .restart local v29    # "$this$firstOrNull$iv":Ljava/lang/Iterable;
    :cond_1f
    const/4 v2, 0x0

    .line 100
    .end local v26    # "it":Ljava/util/Map$Entry;
    .end local v27    # "$i$a$-firstOrNull-StreamAccumulator$accept$11$idx$1$1":I
    :goto_13
    if-eqz v2, :cond_20

    goto :goto_14

    :cond_20
    move-object/from16 v2, v29

    goto :goto_12

    .line 101
    .end local v25    # "element$iv":Ljava/lang/Object;
    .end local v29    # "$this$firstOrNull$iv":Ljava/lang/Iterable;
    .restart local v2    # "$this$firstOrNull$iv":Ljava/lang/Iterable;
    :cond_21
    move-object/from16 v29, v2

    .end local v2    # "$this$firstOrNull$iv":Ljava/lang/Iterable;
    .restart local v29    # "$this$firstOrNull$iv":Ljava/lang/Iterable;
    const/16 v25, 0x0

    .line 78
    .end local v3    # "$i$f$firstOrNull":I
    .end local v29    # "$this$firstOrNull$iv":Ljava/lang/Iterable;
    :goto_14
    check-cast v25, Ljava/util/Map$Entry;

    if-eqz v25, :cond_22

    invoke-interface/range {v25 .. v25}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    if-eqz v2, :cond_22

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    goto :goto_15

    :cond_22
    if-eqz v0, :cond_23

    iget-object v2, v7, Lcom/pymcl/ai/StreamAccumulator;->calls:Ljava/util/SortedMap;

    invoke-interface {v2}, Ljava/util/SortedMap;->size()I

    move-result v2

    :goto_15
    move v7, v2

    goto :goto_16

    :cond_23
    move v7, v13

    .line 76
    .end local v0    # "id":Ljava/lang/String;
    .end local v7    # "$this$accept_u24lambda_u2411_u240":Lcom/pymcl/ai/StreamAccumulator;
    .end local v21    # "$i$a$-run-StreamAccumulator$accept$11$idx$1":I
    :goto_16
    nop

    .line 80
    .local v7, "idx":I
    :goto_17
    iget-object v0, v1, Lcom/pymcl/ai/StreamAccumulator;->calls:Ljava/util/SortedMap;

    check-cast v0, Ljava/util/Map;

    .local v0, "$this$getOrPut$iv":Ljava/util/Map;
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    .local v2, "key$iv":Ljava/lang/Object;
    const/4 v3, 0x0

    .line 102
    .local v3, "$i$f$getOrPut":I
    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v21

    .line 103
    .local v21, "value$iv":Ljava/lang/Object;
    if-nez v21, :cond_24

    .line 104
    const/16 v24, 0x0

    .line 80
    .local v24, "$i$a$-getOrPut-StreamAccumulator$accept$11$p$1":I
    new-instance v25, Lcom/pymcl/ai/StreamAccumulator$Partial;

    const/16 v29, 0x7

    const/16 v30, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    invoke-direct/range {v25 .. v30}, Lcom/pymcl/ai/StreamAccumulator$Partial;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 104
    .end local v24    # "$i$a$-getOrPut-StreamAccumulator$accept$11$p$1":I
    move-object/from16 v24, v25

    .line 105
    .local v24, "answer$iv":Ljava/lang/Object;
    move-object/from16 v1, v24

    .end local v24    # "answer$iv":Ljava/lang/Object;
    .local v1, "answer$iv":Ljava/lang/Object;
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 106
    nop

    .end local v1    # "answer$iv":Ljava/lang/Object;
    goto :goto_18

    .line 108
    :cond_24
    move-object/from16 v24, v21

    .line 103
    :goto_18
    nop

    .line 80
    .end local v0    # "$this$getOrPut$iv":Ljava/util/Map;
    .end local v2    # "key$iv":Ljava/lang/Object;
    .end local v3    # "$i$f$getOrPut":I
    .end local v21    # "value$iv":Ljava/lang/Object;
    move-object/from16 v0, v24

    check-cast v0, Lcom/pymcl/ai/StreamAccumulator$Partial;

    .line 81
    .local v0, "p":Lcom/pymcl/ai/StreamAccumulator$Partial;
    invoke-static {v5, v8}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_27

    move-object v2, v1

    .line 97
    .local v2, "it":Ljava/lang/String;
    const/4 v3, 0x0

    .line 81
    .local v3, "$i$a$-takeIf-StreamAccumulator$accept$11$1":I
    move-object v8, v2

    check-cast v8, Ljava/lang/CharSequence;

    invoke-interface {v8}, Ljava/lang/CharSequence;->length()I

    move-result v8

    if-lez v8, :cond_25

    const/4 v8, 0x1

    goto :goto_19

    :cond_25
    const/4 v8, 0x0

    .end local v2    # "it":Ljava/lang/String;
    .end local v3    # "$i$a$-takeIf-StreamAccumulator$accept$11$1":I
    :goto_19
    if-eqz v8, :cond_26

    goto :goto_1a

    :cond_26
    const/4 v1, 0x0

    :goto_1a
    if-eqz v1, :cond_27

    .line 97
    .local v1, "it":Ljava/lang/String;
    const/4 v2, 0x0

    .line 81
    .local v2, "$i$a$-let-StreamAccumulator$accept$11$2":I
    invoke-virtual {v0, v1}, Lcom/pymcl/ai/StreamAccumulator$Partial;->setId(Ljava/lang/String;)V

    .line 82
    .end local v1    # "it":Ljava/lang/String;
    .end local v2    # "$i$a$-let-StreamAccumulator$accept$11$2":I
    :cond_27
    const-string v1, "function"

    invoke-static {v5, v1}, Lcom/pymcl/core/util/JsonKt;->obj(Ljava/util/Map;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v1

    if-eqz v1, :cond_30

    .local v1, "f":Ljava/util/Map;
    const/4 v2, 0x0

    .line 83
    .local v2, "$i$a$-let-StreamAccumulator$accept$11$3":I
    const-string v3, "name"

    invoke-static {v1, v3}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_2d

    move-object v8, v3

    .line 97
    .local v8, "it":Ljava/lang/String;
    const/16 v21, 0x0

    .line 83
    .local v21, "$i$a$-takeIf-StreamAccumulator$accept$11$3$1":I
    move-object/from16 v24, v8

    check-cast v24, Ljava/lang/CharSequence;

    invoke-interface/range {v24 .. v24}, Ljava/lang/CharSequence;->length()I

    move-result v24

    if-lez v24, :cond_28

    const/16 v24, 0x1

    goto :goto_1b

    :cond_28
    const/16 v24, 0x0

    .end local v8    # "it":Ljava/lang/String;
    .end local v21    # "$i$a$-takeIf-StreamAccumulator$accept$11$3$1":I
    :goto_1b
    if-eqz v24, :cond_29

    goto :goto_1c

    :cond_29
    const/4 v3, 0x0

    :goto_1c
    if-eqz v3, :cond_2d

    .line 97
    .local v3, "it":Ljava/lang/String;
    const/4 v8, 0x0

    .line 83
    .local v8, "$i$a$-let-StreamAccumulator$accept$11$3$2":I
    invoke-virtual {v0}, Lcom/pymcl/ai/StreamAccumulator$Partial;->getName()Ljava/lang/String;

    move-result-object v21

    check-cast v21, Ljava/lang/CharSequence;

    invoke-interface/range {v21 .. v21}, Ljava/lang/CharSequence;->length()I

    move-result v21

    if-nez v21, :cond_2a

    const/16 v21, 0x1

    goto :goto_1d

    :cond_2a
    const/16 v21, 0x0

    :goto_1d
    if-eqz v21, :cond_2b

    move/from16 v21, v2

    move-object v2, v3

    move-object/from16 v24, v4

    goto :goto_1e

    :cond_2b
    move/from16 v21, v2

    .end local v2    # "$i$a$-let-StreamAccumulator$accept$11$3":I
    .local v21, "$i$a$-let-StreamAccumulator$accept$11$3":I
    invoke-virtual {v0}, Lcom/pymcl/ai/StreamAccumulator$Partial;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2c

    invoke-virtual {v0}, Lcom/pymcl/ai/StreamAccumulator$Partial;->getName()Ljava/lang/String;

    move-result-object v2

    move-object/from16 v24, v4

    goto :goto_1e

    :cond_2c
    invoke-virtual {v0}, Lcom/pymcl/ai/StreamAccumulator$Partial;->getName()Ljava/lang/String;

    move-result-object v2

    move-object/from16 v24, v4

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    :goto_1e
    invoke-virtual {v0, v2}, Lcom/pymcl/ai/StreamAccumulator$Partial;->setName(Ljava/lang/String;)V

    .end local v3    # "it":Ljava/lang/String;
    .end local v8    # "$i$a$-let-StreamAccumulator$accept$11$3$2":I
    goto :goto_1f

    .end local v21    # "$i$a$-let-StreamAccumulator$accept$11$3":I
    .restart local v2    # "$i$a$-let-StreamAccumulator$accept$11$3":I
    :cond_2d
    move/from16 v21, v2

    move-object/from16 v24, v4

    .line 84
    .end local v2    # "$i$a$-let-StreamAccumulator$accept$11$3":I
    .restart local v21    # "$i$a$-let-StreamAccumulator$accept$11$3":I
    :goto_1f
    const-string v2, "arguments"

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    .local v2, "a":Ljava/lang/Object;
    instance-of v3, v2, Ljava/lang/String;

    if-eqz v3, :cond_2e

    invoke-virtual {v0}, Lcom/pymcl/ai/StreamAccumulator$Partial;->getArgs()Ljava/lang/StringBuilder;

    move-result-object v3

    move-object v4, v2

    check-cast v4, Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v17, v0

    move-object/from16 v19, v1

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v8, 0x2

    goto :goto_20

    :cond_2e
    instance-of v3, v2, Ljava/util/Map;

    if-eqz v3, :cond_2f

    invoke-virtual {v0}, Lcom/pymcl/ai/StreamAccumulator$Partial;->getArgs()Ljava/lang/StringBuilder;

    move-result-object v3

    sget-object v4, Lcom/pymcl/core/util/Json;->INSTANCE:Lcom/pymcl/core/util/Json;

    move-object/from16 v17, v0

    move-object/from16 v19, v1

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v8, 0x2

    .end local v0    # "p":Lcom/pymcl/ai/StreamAccumulator$Partial;
    .end local v1    # "f":Ljava/util/Map;
    .local v17, "p":Lcom/pymcl/ai/StreamAccumulator$Partial;
    .local v19, "f":Ljava/util/Map;
    invoke-static {v4, v2, v1, v8, v0}, Lcom/pymcl/core/util/Json;->stringify$default(Lcom/pymcl/core/util/Json;Ljava/lang/Object;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_20

    .end local v17    # "p":Lcom/pymcl/ai/StreamAccumulator$Partial;
    .end local v19    # "f":Ljava/util/Map;
    .restart local v0    # "p":Lcom/pymcl/ai/StreamAccumulator$Partial;
    .restart local v1    # "f":Ljava/util/Map;
    :cond_2f
    move-object/from16 v17, v0

    move-object/from16 v19, v1

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v8, 0x2

    .end local v0    # "p":Lcom/pymcl/ai/StreamAccumulator$Partial;
    .end local v1    # "f":Ljava/util/Map;
    .restart local v17    # "p":Lcom/pymcl/ai/StreamAccumulator$Partial;
    .restart local v19    # "f":Ljava/util/Map;
    sget-object v3, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 85
    .end local v2    # "a":Ljava/lang/Object;
    :goto_20
    nop

    .end local v19    # "f":Ljava/util/Map;
    .end local v21    # "$i$a$-let-StreamAccumulator$accept$11$3":I
    goto :goto_21

    .line 82
    .end local v17    # "p":Lcom/pymcl/ai/StreamAccumulator$Partial;
    .restart local v0    # "p":Lcom/pymcl/ai/StreamAccumulator$Partial;
    :cond_30
    move-object/from16 v17, v0

    move-object/from16 v24, v4

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v8, 0x2

    .end local v0    # "p":Lcom/pymcl/ai/StreamAccumulator$Partial;
    .restart local v17    # "p":Lcom/pymcl/ai/StreamAccumulator$Partial;
    :goto_21
    nop

    .line 86
    nop

    .line 99
    .end local v5    # "tc":Ljava/util/Map;
    .end local v7    # "idx":I
    .end local v13    # "pos":I
    .end local v17    # "p":Lcom/pymcl/ai/StreamAccumulator$Partial;
    .end local v18    # "$i$a$-forEachIndexed-StreamAccumulator$accept$11":I
    move-object/from16 v2, p1

    move-object v7, v0

    move v5, v1

    move/from16 v13, v16

    move-object/from16 v0, v22

    move-object/from16 v3, v23

    move-object/from16 v4, v24

    move-object/from16 v1, p0

    .end local v15    # "item$iv":Ljava/lang/Object;
    goto/16 :goto_11

    .line 109
    .end local v16    # "index$iv":I
    .end local v22    # "o":Ljava/util/Map;
    .end local v23    # "d":Ljava/lang/String;
    .local v0, "o":Ljava/util/Map;
    .local v3, "d":Ljava/lang/String;
    .local v13, "index$iv":I
    :cond_31
    move-object/from16 v22, v0

    move-object/from16 v23, v3

    move-object/from16 v24, v4

    move v1, v5

    move-object v0, v7

    .end local v0    # "o":Ljava/util/Map;
    .end local v3    # "d":Ljava/lang/String;
    .restart local v22    # "o":Ljava/util/Map;
    .restart local v23    # "d":Ljava/lang/String;
    move-object/from16 v2, p1

    move-object/from16 v0, v22

    move-object/from16 v1, p0

    .end local v6    # "ch":Ljava/util/Map;
    .end local v10    # "delta":Ljava/util/Map;
    .end local v11    # "$this$forEachIndexed$iv":Ljava/lang/Iterable;
    .end local v12    # "$i$f$forEachIndexed":I
    .end local v13    # "index$iv":I
    goto/16 :goto_7

    .line 88
    .end local v22    # "o":Ljava/util/Map;
    .end local v23    # "d":Ljava/lang/String;
    .restart local v0    # "o":Ljava/util/Map;
    .restart local v3    # "d":Ljava/lang/String;
    :cond_32
    return-void
.end method

.method public final getDone()Z
    .locals 1

    .line 56
    iget-boolean v0, p0, Lcom/pymcl/ai/StreamAccumulator;->done:Z

    return v0
.end method

.method public final getError()Ljava/lang/String;
    .locals 1

    .line 57
    iget-object v0, p0, Lcom/pymcl/ai/StreamAccumulator;->error:Ljava/lang/String;

    return-object v0
.end method

.method public final getFinishReason()Ljava/lang/String;
    .locals 1

    .line 55
    iget-object v0, p0, Lcom/pymcl/ai/StreamAccumulator;->finishReason:Ljava/lang/String;

    return-object v0
.end method

.method public final getModel()Ljava/lang/String;
    .locals 1

    .line 58
    iget-object v0, p0, Lcom/pymcl/ai/StreamAccumulator;->model:Ljava/lang/String;

    return-object v0
.end method

.method public final getUsage()Lcom/pymcl/ai/Usage;
    .locals 1

    .line 54
    iget-object v0, p0, Lcom/pymcl/ai/StreamAccumulator;->usage:Lcom/pymcl/ai/Usage;

    return-object v0
.end method

.method public final result(Ljava/lang/String;)Lcom/pymcl/ai/AssistantTurn;
    .locals 8
    .param p1, "requestModel"    # Ljava/lang/String;

    const-string v0, "requestModel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 94
    iget-object v0, p0, Lcom/pymcl/ai/StreamAccumulator;->content:Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v0, "toString(...)"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Lcom/pymcl/ai/StreamAccumulator;->reasoning:Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/pymcl/ai/StreamAccumulator;->toolCalls()Ljava/util/List;

    move-result-object v4

    iget-object v5, p0, Lcom/pymcl/ai/StreamAccumulator;->usage:Lcom/pymcl/ai/Usage;

    iget-object v6, p0, Lcom/pymcl/ai/StreamAccumulator;->finishReason:Ljava/lang/String;

    iget-object v0, p0, Lcom/pymcl/ai/StreamAccumulator;->model:Ljava/lang/String;

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

    .line 97
    const/4 v0, 0x0

    .line 94
    .local v0, "$i$a$-ifEmpty-StreamAccumulator$result$1":I
    move-object v0, p1

    .end local v0    # "$i$a$-ifEmpty-StreamAccumulator$result$1":I
    :cond_1
    move-object v7, v0

    check-cast v7, Ljava/lang/String;

    new-instance v1, Lcom/pymcl/ai/AssistantTurn;

    invoke-direct/range {v1 .. v7}, Lcom/pymcl/ai/AssistantTurn;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/pymcl/ai/Usage;Ljava/lang/String;Ljava/lang/String;)V

    return-object v1
.end method

.method public final toolCalls()Ljava/util/List;
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/pymcl/ai/ToolCall;",
            ">;"
        }
    .end annotation

    .line 90
    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/pymcl/ai/StreamAccumulator;->calls:Ljava/util/SortedMap;

    invoke-interface {v1}, Ljava/util/SortedMap;->entrySet()Ljava/util/Set;

    move-result-object v1

    const-string v2, "<get-entries>(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Ljava/lang/Iterable;

    .local v1, "$this$filter$iv":Ljava/lang/Iterable;
    const/4 v2, 0x0

    .line 110
    .local v2, "$i$f$filter":I
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    check-cast v3, Ljava/util/Collection;

    .local v3, "destination$iv$iv":Ljava/util/Collection;
    move-object v4, v1

    .local v4, "$this$filterTo$iv$iv":Ljava/lang/Iterable;
    const/4 v5, 0x0

    .line 111
    .local v5, "$i$f$filterTo":I
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_0
    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    const/4 v9, 0x0

    if-eqz v7, :cond_2

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    .local v7, "element$iv$iv":Ljava/lang/Object;
    move-object v10, v7

    check-cast v10, Ljava/util/Map$Entry;

    .local v10, "it":Ljava/util/Map$Entry;
    const/4 v11, 0x0

    .line 90
    .local v11, "$i$a$-filter-StreamAccumulator$toolCalls$1":I
    invoke-interface {v10}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lcom/pymcl/ai/StreamAccumulator$Partial;

    invoke-virtual {v12}, Lcom/pymcl/ai/StreamAccumulator$Partial;->getName()Ljava/lang/String;

    move-result-object v12

    check-cast v12, Ljava/lang/CharSequence;

    invoke-interface {v12}, Ljava/lang/CharSequence;->length()I

    move-result v12

    if-lez v12, :cond_1

    const/4 v8, 0x1

    goto :goto_1

    :cond_1
    move v8, v9

    .line 111
    .end local v10    # "it":Ljava/util/Map$Entry;
    .end local v11    # "$i$a$-filter-StreamAccumulator$toolCalls$1":I
    :goto_1
    if-eqz v8, :cond_0

    invoke-interface {v3, v7}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 112
    .end local v7    # "element$iv$iv":Ljava/lang/Object;
    :cond_2
    nop

    .end local v3    # "destination$iv$iv":Ljava/util/Collection;
    .end local v4    # "$this$filterTo$iv$iv":Ljava/lang/Iterable;
    .end local v5    # "$i$f$filterTo":I
    check-cast v3, Ljava/util/List;

    .line 110
    nop

    .end local v1    # "$this$filter$iv":Ljava/lang/Iterable;
    .end local v2    # "$i$f$filter":I
    check-cast v3, Ljava/lang/Iterable;

    .line 90
    nop

    .local v3, "$this$map$iv":Ljava/lang/Iterable;
    const/4 v1, 0x0

    .line 113
    .local v1, "$i$f$map":I
    new-instance v2, Ljava/util/ArrayList;

    const/16 v4, 0xa

    invoke-static {v3, v4}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v2, v4}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v2, Ljava/util/Collection;

    .local v2, "destination$iv$iv":Ljava/util/Collection;
    move-object v4, v3

    .local v4, "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    const/4 v5, 0x0

    .line 114
    .local v5, "$i$f$mapTo":I
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_2
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_5

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    .line 115
    .local v7, "item$iv$iv":Ljava/lang/Object;
    move-object v10, v7

    check-cast v10, Ljava/util/Map$Entry;

    const/4 v11, 0x0

    .local v11, "$i$a$-map-StreamAccumulator$toolCalls$2":I
    invoke-static {v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-interface {v10}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/lang/Integer;

    .local v12, "i":Ljava/lang/Integer;
    invoke-interface {v10}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lcom/pymcl/ai/StreamAccumulator$Partial;

    .line 91
    .local v10, "p":Lcom/pymcl/ai/StreamAccumulator$Partial;
    invoke-virtual {v10}, Lcom/pymcl/ai/StreamAccumulator$Partial;->getId()Ljava/lang/String;

    move-result-object v13

    check-cast v13, Ljava/lang/CharSequence;

    invoke-interface {v13}, Ljava/lang/CharSequence;->length()I

    move-result v14

    if-nez v14, :cond_3

    const/4 v14, 0x1

    goto :goto_3

    :cond_3
    move v14, v9

    :goto_3
    if-eqz v14, :cond_4

    .line 97
    const/4 v13, 0x0

    .line 91
    .local v13, "$i$a$-ifEmpty-StreamAccumulator$toolCalls$2$1":I
    invoke-virtual {v10}, Lcom/pymcl/ai/StreamAccumulator$Partial;->getName()Ljava/lang/String;

    move-result-object v14

    new-instance v15, Ljava/lang/StringBuilder;

    invoke-direct {v15}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "call_"

    invoke-virtual {v15, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v8

    const-string v15, "_"

    invoke-virtual {v8, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v13

    .end local v13    # "$i$a$-ifEmpty-StreamAccumulator$toolCalls$2$1":I
    :cond_4
    check-cast v13, Ljava/lang/String;

    invoke-virtual {v10}, Lcom/pymcl/ai/StreamAccumulator$Partial;->getName()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v10}, Lcom/pymcl/ai/StreamAccumulator$Partial;->getArgs()Ljava/lang/StringBuilder;

    move-result-object v14

    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v14

    const-string v15, "toString(...)"

    invoke-static {v14, v15}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v15, Lcom/pymcl/ai/ToolCall;

    invoke-direct {v15, v13, v8, v14}, Lcom/pymcl/ai/ToolCall;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 115
    .end local v10    # "p":Lcom/pymcl/ai/StreamAccumulator$Partial;
    .end local v11    # "$i$a$-map-StreamAccumulator$toolCalls$2":I
    .end local v12    # "i":Ljava/lang/Integer;
    invoke-interface {v2, v15}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 116
    .end local v7    # "item$iv$iv":Ljava/lang/Object;
    :cond_5
    nop

    .end local v2    # "destination$iv$iv":Ljava/util/Collection;
    .end local v4    # "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    .end local v5    # "$i$f$mapTo":I
    check-cast v2, Ljava/util/List;

    .line 113
    nop

    .line 92
    .end local v1    # "$i$f$map":I
    .end local v3    # "$this$map$iv":Ljava/lang/Iterable;
    return-object v2
.end method
