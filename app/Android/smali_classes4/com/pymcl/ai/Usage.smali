.class public final Lcom/pymcl/ai/Usage;
.super Ljava/lang/Object;
.source "Sse.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0012\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0008\u0018\u00002\u00020\u0001B/\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0011\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0000H\u0086\u0002J\t\u0010\u0012\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0007H\u00c6\u0003J1\u0010\u0016\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0007H\u00c6\u0001J\u0014\u0010\u0017\u001a\u00020\u00072\u0008\u0010\u0018\u001a\u0004\u0018\u00010\u0001H\u00d6\u0083\u0004J\n\u0010\u0019\u001a\u00020\u001aH\u00d6\u0081\u0004J\n\u0010\u001b\u001a\u00020\u001cH\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u001d"
    }
    d2 = {
        "Lcom/pymcl/ai/Usage;",
        "",
        "prompt",
        "",
        "completion",
        "total",
        "estimated",
        "",
        "<init>",
        "(JJJZ)V",
        "getPrompt",
        "()J",
        "getCompletion",
        "getTotal",
        "getEstimated",
        "()Z",
        "plus",
        "o",
        "component1",
        "component2",
        "component3",
        "component4",
        "copy",
        "equals",
        "other",
        "hashCode",
        "",
        "toString",
        "",
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
.field private final completion:J

.field private final estimated:Z

.field private final prompt:J

.field private final total:J


# direct methods
.method public constructor <init>()V
    .locals 10

    const/16 v8, 0xf

    const/4 v9, 0x0

    const-wide/16 v1, 0x0

    const-wide/16 v3, 0x0

    const-wide/16 v5, 0x0

    const/4 v7, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v9}, Lcom/pymcl/ai/Usage;-><init>(JJJZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(JJJZ)V
    .locals 0
    .param p1, "prompt"    # J
    .param p3, "completion"    # J
    .param p5, "total"    # J
    .param p7, "estimated"    # Z

    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lcom/pymcl/ai/Usage;->prompt:J

    iput-wide p3, p0, Lcom/pymcl/ai/Usage;->completion:J

    iput-wide p5, p0, Lcom/pymcl/ai/Usage;->total:J

    iput-boolean p7, p0, Lcom/pymcl/ai/Usage;->estimated:Z

    return-void
.end method

.method public synthetic constructor <init>(JJJZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 2

    .line 29
    and-int/lit8 p9, p8, 0x1

    const-wide/16 v0, 0x0

    if-eqz p9, :cond_0

    move-wide p1, v0

    :cond_0
    and-int/lit8 p9, p8, 0x2

    if-eqz p9, :cond_1

    move-wide p3, v0

    :cond_1
    and-int/lit8 p9, p8, 0x4

    if-eqz p9, :cond_2

    move-wide p5, v0

    :cond_2
    and-int/lit8 p8, p8, 0x8

    if-eqz p8, :cond_3

    const/4 p7, 0x0

    :cond_3
    move p8, p7

    move-wide p6, p5

    move-wide p4, p3

    move-wide p2, p1

    move-object p1, p0

    invoke-direct/range {p1 .. p8}, Lcom/pymcl/ai/Usage;-><init>(JJJZ)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/pymcl/ai/Usage;JJJZILjava/lang/Object;)Lcom/pymcl/ai/Usage;
    .locals 8

    and-int/lit8 v0, p8, 0x1

    if-eqz v0, :cond_0

    iget-wide p1, p0, Lcom/pymcl/ai/Usage;->prompt:J

    :cond_0
    move-wide v1, p1

    and-int/lit8 p1, p8, 0x2

    if-eqz p1, :cond_1

    iget-wide p3, p0, Lcom/pymcl/ai/Usage;->completion:J

    :cond_1
    move-wide v3, p3

    and-int/lit8 p1, p8, 0x4

    if-eqz p1, :cond_2

    iget-wide p5, p0, Lcom/pymcl/ai/Usage;->total:J

    :cond_2
    move-wide v5, p5

    and-int/lit8 p1, p8, 0x8

    if-eqz p1, :cond_3

    iget-boolean p7, p0, Lcom/pymcl/ai/Usage;->estimated:Z

    :cond_3
    move-object v0, p0

    move v7, p7

    invoke-virtual/range {v0 .. v7}, Lcom/pymcl/ai/Usage;->copy(JJJZ)Lcom/pymcl/ai/Usage;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()J
    .locals 2

    iget-wide v0, p0, Lcom/pymcl/ai/Usage;->prompt:J

    return-wide v0
.end method

.method public final component2()J
    .locals 2

    iget-wide v0, p0, Lcom/pymcl/ai/Usage;->completion:J

    return-wide v0
.end method

.method public final component3()J
    .locals 2

    iget-wide v0, p0, Lcom/pymcl/ai/Usage;->total:J

    return-wide v0
.end method

.method public final component4()Z
    .locals 1

    iget-boolean v0, p0, Lcom/pymcl/ai/Usage;->estimated:Z

    return v0
.end method

.method public final copy(JJJZ)Lcom/pymcl/ai/Usage;
    .locals 8

    new-instance v0, Lcom/pymcl/ai/Usage;

    move-wide v1, p1

    move-wide v3, p3

    move-wide v5, p5

    move v7, p7

    invoke-direct/range {v0 .. v7}, Lcom/pymcl/ai/Usage;-><init>(JJJZ)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/pymcl/ai/Usage;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    move-object v1, p1

    check-cast v1, Lcom/pymcl/ai/Usage;

    iget-wide v3, p0, Lcom/pymcl/ai/Usage;->prompt:J

    iget-wide v5, v1, Lcom/pymcl/ai/Usage;->prompt:J

    cmp-long v3, v3, v5

    if-eqz v3, :cond_2

    return v2

    :cond_2
    iget-wide v3, p0, Lcom/pymcl/ai/Usage;->completion:J

    iget-wide v5, v1, Lcom/pymcl/ai/Usage;->completion:J

    cmp-long v3, v3, v5

    if-eqz v3, :cond_3

    return v2

    :cond_3
    iget-wide v3, p0, Lcom/pymcl/ai/Usage;->total:J

    iget-wide v5, v1, Lcom/pymcl/ai/Usage;->total:J

    cmp-long v3, v3, v5

    if-eqz v3, :cond_4

    return v2

    :cond_4
    iget-boolean v3, p0, Lcom/pymcl/ai/Usage;->estimated:Z

    iget-boolean v1, v1, Lcom/pymcl/ai/Usage;->estimated:Z

    if-eq v3, v1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getCompletion()J
    .locals 2

    .line 29
    iget-wide v0, p0, Lcom/pymcl/ai/Usage;->completion:J

    return-wide v0
.end method

.method public final getEstimated()Z
    .locals 1

    .line 29
    iget-boolean v0, p0, Lcom/pymcl/ai/Usage;->estimated:Z

    return v0
.end method

.method public final getPrompt()J
    .locals 2

    .line 29
    iget-wide v0, p0, Lcom/pymcl/ai/Usage;->prompt:J

    return-wide v0
.end method

.method public final getTotal()J
    .locals 2

    .line 29
    iget-wide v0, p0, Lcom/pymcl/ai/Usage;->total:J

    return-wide v0
.end method

.method public hashCode()I
    .locals 4

    iget-wide v0, p0, Lcom/pymcl/ai/Usage;->prompt:J

    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    move-result v0

    mul-int/lit8 v1, v0, 0x1f

    iget-wide v2, p0, Lcom/pymcl/ai/Usage;->completion:J

    invoke-static {v2, v3}, Ljava/lang/Long;->hashCode(J)I

    move-result v2

    add-int/2addr v1, v2

    mul-int/lit8 v0, v1, 0x1f

    iget-wide v2, p0, Lcom/pymcl/ai/Usage;->total:J

    invoke-static {v2, v3}, Ljava/lang/Long;->hashCode(J)I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v1, v0, 0x1f

    iget-boolean v2, p0, Lcom/pymcl/ai/Usage;->estimated:Z

    invoke-static {v2}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v2

    add-int/2addr v1, v2

    return v1
.end method

.method public final plus(Lcom/pymcl/ai/Usage;)Lcom/pymcl/ai/Usage;
    .locals 10
    .param p1, "o"    # Lcom/pymcl/ai/Usage;

    const-string v0, "o"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 30
    new-instance v1, Lcom/pymcl/ai/Usage;

    iget-wide v2, p0, Lcom/pymcl/ai/Usage;->prompt:J

    iget-wide v4, p1, Lcom/pymcl/ai/Usage;->prompt:J

    add-long/2addr v2, v4

    iget-wide v4, p0, Lcom/pymcl/ai/Usage;->completion:J

    iget-wide v6, p1, Lcom/pymcl/ai/Usage;->completion:J

    add-long/2addr v4, v6

    iget-wide v6, p0, Lcom/pymcl/ai/Usage;->total:J

    iget-wide v8, p1, Lcom/pymcl/ai/Usage;->total:J

    add-long/2addr v6, v8

    iget-boolean v0, p0, Lcom/pymcl/ai/Usage;->estimated:Z

    if-nez v0, :cond_1

    iget-boolean v0, p1, Lcom/pymcl/ai/Usage;->estimated:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    move v8, v0

    invoke-direct/range {v1 .. v8}, Lcom/pymcl/ai/Usage;-><init>(JJJZ)V

    return-object v1
.end method

.method public toString()Ljava/lang/String;
    .locals 9

    iget-wide v0, p0, Lcom/pymcl/ai/Usage;->prompt:J

    iget-wide v2, p0, Lcom/pymcl/ai/Usage;->completion:J

    iget-wide v4, p0, Lcom/pymcl/ai/Usage;->total:J

    iget-boolean v6, p0, Lcom/pymcl/ai/Usage;->estimated:Z

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "Usage(prompt="

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", completion="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", total="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", estimated="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
