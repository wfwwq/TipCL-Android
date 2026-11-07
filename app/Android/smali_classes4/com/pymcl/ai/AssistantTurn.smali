.class public final Lcom/pymcl/ai/AssistantTurn;
.super Ljava/lang/Object;
.source "Sse.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nSse.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sse.kt\ncom/pymcl/ai/AssistantTurn\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,96:1\n1739#2:97\n1814#2,3:98\n*S KotlinDebug\n*F\n+ 1 Sse.kt\ncom/pymcl/ai/AssistantTurn\n*L\n37#1:97\n37#1:98,3\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000e\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0086\u0008\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000c\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\t\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0018\u0010\u0017\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0018j\u0002`\u0019J\t\u0010\u001a\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001b\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006H\u00c6\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010\u001f\u001a\u00020\u0003H\u00c6\u0003JO\u0010 \u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0008\u0002\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00062\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\t2\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u0003H\u00c6\u0001J\u0014\u0010!\u001a\u00020\"2\u0008\u0010#\u001a\u0004\u0018\u00010\u0001H\u00d6\u0083\u0004J\n\u0010$\u001a\u00020%H\u00d6\u0081\u0004J\n\u0010&\u001a\u00020\u0003H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u000fR\u0017\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010\u0012R\u0013\u0010\u0008\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\u0014R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0015\u0010\u000fR\u0011\u0010\u000b\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0016\u0010\u000f\u00a8\u0006\'"
    }
    d2 = {
        "Lcom/pymcl/ai/AssistantTurn;",
        "",
        "content",
        "",
        "reasoning",
        "toolCalls",
        "",
        "Lcom/pymcl/ai/ToolCall;",
        "usage",
        "Lcom/pymcl/ai/Usage;",
        "finishReason",
        "model",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/pymcl/ai/Usage;Ljava/lang/String;Ljava/lang/String;)V",
        "getContent",
        "()Ljava/lang/String;",
        "getReasoning",
        "getToolCalls",
        "()Ljava/util/List;",
        "getUsage",
        "()Lcom/pymcl/ai/Usage;",
        "getFinishReason",
        "getModel",
        "toMessage",
        "",
        "Lcom/pymcl/core/util/JObj;",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "copy",
        "equals",
        "",
        "other",
        "hashCode",
        "",
        "toString",
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
.field private final content:Ljava/lang/String;

.field private final finishReason:Ljava/lang/String;

.field private final model:Ljava/lang/String;

.field private final reasoning:Ljava/lang/String;

.field private final toolCalls:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/pymcl/ai/ToolCall;",
            ">;"
        }
    .end annotation
.end field

.field private final usage:Lcom/pymcl/ai/Usage;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/pymcl/ai/Usage;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1
    .param p1, "content"    # Ljava/lang/String;
    .param p2, "reasoning"    # Ljava/lang/String;
    .param p3, "toolCalls"    # Ljava/util/List;
    .param p4, "usage"    # Lcom/pymcl/ai/Usage;
    .param p5, "finishReason"    # Ljava/lang/String;
    .param p6, "model"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/pymcl/ai/ToolCall;",
            ">;",
            "Lcom/pymcl/ai/Usage;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    const-string v0, "content"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "reasoning"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "toolCalls"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "model"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 34
    iput-object p1, p0, Lcom/pymcl/ai/AssistantTurn;->content:Ljava/lang/String;

    iput-object p2, p0, Lcom/pymcl/ai/AssistantTurn;->reasoning:Ljava/lang/String;

    iput-object p3, p0, Lcom/pymcl/ai/AssistantTurn;->toolCalls:Ljava/util/List;

    iput-object p4, p0, Lcom/pymcl/ai/AssistantTurn;->usage:Lcom/pymcl/ai/Usage;

    iput-object p5, p0, Lcom/pymcl/ai/AssistantTurn;->finishReason:Ljava/lang/String;

    iput-object p6, p0, Lcom/pymcl/ai/AssistantTurn;->model:Ljava/lang/String;

    .line 33
    return-void
.end method

.method public static synthetic copy$default(Lcom/pymcl/ai/AssistantTurn;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/pymcl/ai/Usage;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/pymcl/ai/AssistantTurn;
    .locals 0

    and-int/lit8 p8, p7, 0x1

    if-eqz p8, :cond_0

    iget-object p1, p0, Lcom/pymcl/ai/AssistantTurn;->content:Ljava/lang/String;

    :cond_0
    and-int/lit8 p8, p7, 0x2

    if-eqz p8, :cond_1

    iget-object p2, p0, Lcom/pymcl/ai/AssistantTurn;->reasoning:Ljava/lang/String;

    :cond_1
    and-int/lit8 p8, p7, 0x4

    if-eqz p8, :cond_2

    iget-object p3, p0, Lcom/pymcl/ai/AssistantTurn;->toolCalls:Ljava/util/List;

    :cond_2
    and-int/lit8 p8, p7, 0x8

    if-eqz p8, :cond_3

    iget-object p4, p0, Lcom/pymcl/ai/AssistantTurn;->usage:Lcom/pymcl/ai/Usage;

    :cond_3
    and-int/lit8 p8, p7, 0x10

    if-eqz p8, :cond_4

    iget-object p5, p0, Lcom/pymcl/ai/AssistantTurn;->finishReason:Ljava/lang/String;

    :cond_4
    and-int/lit8 p7, p7, 0x20

    if-eqz p7, :cond_5

    iget-object p6, p0, Lcom/pymcl/ai/AssistantTurn;->model:Ljava/lang/String;

    :cond_5
    move-object p7, p5

    move-object p8, p6

    move-object p5, p3

    move-object p6, p4

    move-object p3, p1

    move-object p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p8}, Lcom/pymcl/ai/AssistantTurn;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/pymcl/ai/Usage;Ljava/lang/String;Ljava/lang/String;)Lcom/pymcl/ai/AssistantTurn;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/pymcl/ai/AssistantTurn;->content:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/pymcl/ai/AssistantTurn;->reasoning:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/pymcl/ai/ToolCall;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/pymcl/ai/AssistantTurn;->toolCalls:Ljava/util/List;

    return-object v0
.end method

.method public final component4()Lcom/pymcl/ai/Usage;
    .locals 1

    iget-object v0, p0, Lcom/pymcl/ai/AssistantTurn;->usage:Lcom/pymcl/ai/Usage;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/pymcl/ai/AssistantTurn;->finishReason:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/pymcl/ai/AssistantTurn;->model:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/pymcl/ai/Usage;Ljava/lang/String;Ljava/lang/String;)Lcom/pymcl/ai/AssistantTurn;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/pymcl/ai/ToolCall;",
            ">;",
            "Lcom/pymcl/ai/Usage;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lcom/pymcl/ai/AssistantTurn;"
        }
    .end annotation

    const-string v0, "content"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "reasoning"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "toolCalls"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "model"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/pymcl/ai/AssistantTurn;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    invoke-direct/range {v1 .. v7}, Lcom/pymcl/ai/AssistantTurn;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/pymcl/ai/Usage;Ljava/lang/String;Ljava/lang/String;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 5

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/pymcl/ai/AssistantTurn;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    move-object v1, p1

    check-cast v1, Lcom/pymcl/ai/AssistantTurn;

    iget-object v3, p0, Lcom/pymcl/ai/AssistantTurn;->content:Ljava/lang/String;

    iget-object v4, v1, Lcom/pymcl/ai/AssistantTurn;->content:Ljava/lang/String;

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_2

    return v2

    :cond_2
    iget-object v3, p0, Lcom/pymcl/ai/AssistantTurn;->reasoning:Ljava/lang/String;

    iget-object v4, v1, Lcom/pymcl/ai/AssistantTurn;->reasoning:Ljava/lang/String;

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_3

    return v2

    :cond_3
    iget-object v3, p0, Lcom/pymcl/ai/AssistantTurn;->toolCalls:Ljava/util/List;

    iget-object v4, v1, Lcom/pymcl/ai/AssistantTurn;->toolCalls:Ljava/util/List;

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_4

    return v2

    :cond_4
    iget-object v3, p0, Lcom/pymcl/ai/AssistantTurn;->usage:Lcom/pymcl/ai/Usage;

    iget-object v4, v1, Lcom/pymcl/ai/AssistantTurn;->usage:Lcom/pymcl/ai/Usage;

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_5

    return v2

    :cond_5
    iget-object v3, p0, Lcom/pymcl/ai/AssistantTurn;->finishReason:Ljava/lang/String;

    iget-object v4, v1, Lcom/pymcl/ai/AssistantTurn;->finishReason:Ljava/lang/String;

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_6

    return v2

    :cond_6
    iget-object v3, p0, Lcom/pymcl/ai/AssistantTurn;->model:Ljava/lang/String;

    iget-object v1, v1, Lcom/pymcl/ai/AssistantTurn;->model:Ljava/lang/String;

    invoke-static {v3, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    return v0
.end method

.method public final getContent()Ljava/lang/String;
    .locals 1

    .line 34
    iget-object v0, p0, Lcom/pymcl/ai/AssistantTurn;->content:Ljava/lang/String;

    return-object v0
.end method

.method public final getFinishReason()Ljava/lang/String;
    .locals 1

    .line 34
    iget-object v0, p0, Lcom/pymcl/ai/AssistantTurn;->finishReason:Ljava/lang/String;

    return-object v0
.end method

.method public final getModel()Ljava/lang/String;
    .locals 1

    .line 34
    iget-object v0, p0, Lcom/pymcl/ai/AssistantTurn;->model:Ljava/lang/String;

    return-object v0
.end method

.method public final getReasoning()Ljava/lang/String;
    .locals 1

    .line 34
    iget-object v0, p0, Lcom/pymcl/ai/AssistantTurn;->reasoning:Ljava/lang/String;

    return-object v0
.end method

.method public final getToolCalls()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/pymcl/ai/ToolCall;",
            ">;"
        }
    .end annotation

    .line 34
    iget-object v0, p0, Lcom/pymcl/ai/AssistantTurn;->toolCalls:Ljava/util/List;

    return-object v0
.end method

.method public final getUsage()Lcom/pymcl/ai/Usage;
    .locals 1

    .line 34
    iget-object v0, p0, Lcom/pymcl/ai/AssistantTurn;->usage:Lcom/pymcl/ai/Usage;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/pymcl/ai/AssistantTurn;->content:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v1, v0, 0x1f

    iget-object v2, p0, Lcom/pymcl/ai/AssistantTurn;->reasoning:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    add-int/2addr v1, v2

    mul-int/lit8 v0, v1, 0x1f

    iget-object v2, p0, Lcom/pymcl/ai/AssistantTurn;->toolCalls:Ljava/util/List;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v1, v0, 0x1f

    iget-object v2, p0, Lcom/pymcl/ai/AssistantTurn;->usage:Lcom/pymcl/ai/Usage;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lcom/pymcl/ai/AssistantTurn;->usage:Lcom/pymcl/ai/Usage;

    invoke-virtual {v2}, Lcom/pymcl/ai/Usage;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v1, v2

    mul-int/lit8 v0, v1, 0x1f

    iget-object v2, p0, Lcom/pymcl/ai/AssistantTurn;->finishReason:Ljava/lang/String;

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    iget-object v2, p0, Lcom/pymcl/ai/AssistantTurn;->finishReason:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v0, v3

    mul-int/lit8 v1, v0, 0x1f

    iget-object v2, p0, Lcom/pymcl/ai/AssistantTurn;->model:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    add-int/2addr v1, v2

    return v1
.end method

.method public final toMessage()Ljava/util/Map;
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 36
    const/4 v0, 0x2

    new-array v0, v0, [Lkotlin/Pair;

    const-string v1, "role"

    const-string v2, "assistant"

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "content"

    iget-object v3, p0, Lcom/pymcl/ai/AssistantTurn;->content:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v3, 0x1

    aput-object v1, v0, v3

    invoke-static {v0}, Lcom/pymcl/core/util/JsonKt;->jobj([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v0

    move-object v1, v0

    .local v1, "it":Ljava/util/Map;
    const/4 v4, 0x0

    .line 37
    .local v4, "$i$a$-also-AssistantTurn$toMessage$1":I
    iget-object v5, p0, Lcom/pymcl/ai/AssistantTurn;->toolCalls:Ljava/util/List;

    check-cast v5, Ljava/util/Collection;

    invoke-interface {v5}, Ljava/util/Collection;->isEmpty()Z

    move-result v5

    if-nez v5, :cond_1

    iget-object v5, p0, Lcom/pymcl/ai/AssistantTurn;->toolCalls:Ljava/util/List;

    check-cast v5, Ljava/lang/Iterable;

    .local v5, "$this$map$iv":Ljava/lang/Iterable;
    const/4 v6, 0x0

    .line 97
    .local v6, "$i$f$map":I
    new-instance v7, Ljava/util/ArrayList;

    const/16 v8, 0xa

    invoke-static {v5, v8}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v8

    invoke-direct {v7, v8}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v7, Ljava/util/Collection;

    .local v7, "destination$iv$iv":Ljava/util/Collection;
    move-object v8, v5

    .local v8, "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    const/4 v9, 0x0

    .line 98
    .local v9, "$i$f$mapTo":I
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_0
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_0

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    .line 99
    .local v11, "item$iv$iv":Ljava/lang/Object;
    move-object v12, v11

    check-cast v12, Lcom/pymcl/ai/ToolCall;

    .local v12, "t":Lcom/pymcl/ai/ToolCall;
    const/4 v13, 0x0

    .line 37
    .local v13, "$i$a$-map-AssistantTurn$toMessage$1$1":I
    invoke-virtual {v12}, Lcom/pymcl/ai/ToolCall;->toJson()Ljava/util/Map;

    move-result-object v12

    .line 99
    .end local v12    # "t":Lcom/pymcl/ai/ToolCall;
    .end local v13    # "$i$a$-map-AssistantTurn$toMessage$1$1":I
    invoke-interface {v7, v12}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 100
    .end local v11    # "item$iv$iv":Ljava/lang/Object;
    :cond_0
    nop

    .end local v7    # "destination$iv$iv":Ljava/util/Collection;
    .end local v8    # "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    .end local v9    # "$i$f$mapTo":I
    check-cast v7, Ljava/util/List;

    .line 97
    nop

    .end local v5    # "$this$map$iv":Ljava/lang/Iterable;
    .end local v6    # "$i$f$map":I
    check-cast v7, Ljava/util/Collection;

    .line 37
    invoke-static {v7}, Lkotlin/collections/CollectionsKt;->toMutableList(Ljava/util/Collection;)Ljava/util/List;

    move-result-object v5

    const-string v6, "tool_calls"

    invoke-interface {v1, v6, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    :cond_1
    iget-object v5, p0, Lcom/pymcl/ai/AssistantTurn;->reasoning:Ljava/lang/String;

    check-cast v5, Ljava/lang/CharSequence;

    invoke-interface {v5}, Ljava/lang/CharSequence;->length()I

    move-result v5

    if-lez v5, :cond_2

    move v2, v3

    :cond_2
    if-eqz v2, :cond_3

    const-string v2, "reasoning_content"

    iget-object v3, p0, Lcom/pymcl/ai/AssistantTurn;->reasoning:Ljava/lang/String;

    invoke-interface {v1, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    :cond_3
    nop

    .line 36
    .end local v1    # "it":Ljava/util/Map;
    .end local v4    # "$i$a$-also-AssistantTurn$toMessage$1":I
    nop

    .line 39
    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 8

    iget-object v0, p0, Lcom/pymcl/ai/AssistantTurn;->content:Ljava/lang/String;

    iget-object v1, p0, Lcom/pymcl/ai/AssistantTurn;->reasoning:Ljava/lang/String;

    iget-object v2, p0, Lcom/pymcl/ai/AssistantTurn;->toolCalls:Ljava/util/List;

    iget-object v3, p0, Lcom/pymcl/ai/AssistantTurn;->usage:Lcom/pymcl/ai/Usage;

    iget-object v4, p0, Lcom/pymcl/ai/AssistantTurn;->finishReason:Ljava/lang/String;

    iget-object v5, p0, Lcom/pymcl/ai/AssistantTurn;->model:Ljava/lang/String;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "AssistantTurn(content="

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v6, ", reasoning="

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", toolCalls="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", usage="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", finishReason="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", model="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
