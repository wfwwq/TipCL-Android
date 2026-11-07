.class public final Lcom/pymcl/ai/RollbackResult;
.super Ljava/lang/Object;
.source "Checkpoint.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0012\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0008\u0018\u00002\u00020\u0001B\'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0006H\u00c6\u0003J1\u0010\u0014\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006H\u00c6\u0001J\u0014\u0010\u0015\u001a\u00020\u00062\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u00d6\u0083\u0004J\n\u0010\u0017\u001a\u00020\u0003H\u00d6\u0081\u0004J\n\u0010\u0018\u001a\u00020\u0019H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u000e\u00a8\u0006\u001a"
    }
    d2 = {
        "Lcom/pymcl/ai/RollbackResult;",
        "",
        "restored",
        "",
        "failed",
        "hadEntries",
        "",
        "rewindable",
        "<init>",
        "(IIZZ)V",
        "getRestored",
        "()I",
        "getFailed",
        "getHadEntries",
        "()Z",
        "getRewindable",
        "component1",
        "component2",
        "component3",
        "component4",
        "copy",
        "equals",
        "other",
        "hashCode",
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
.field private final failed:I

.field private final hadEntries:Z

.field private final restored:I

.field private final rewindable:Z


# direct methods
.method public constructor <init>(IIZZ)V
    .locals 0
    .param p1, "restored"    # I
    .param p2, "failed"    # I
    .param p3, "hadEntries"    # Z
    .param p4, "rewindable"    # Z

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/pymcl/ai/RollbackResult;->restored:I

    iput p2, p0, Lcom/pymcl/ai/RollbackResult;->failed:I

    iput-boolean p3, p0, Lcom/pymcl/ai/RollbackResult;->hadEntries:Z

    iput-boolean p4, p0, Lcom/pymcl/ai/RollbackResult;->rewindable:Z

    return-void
.end method

.method public static synthetic copy$default(Lcom/pymcl/ai/RollbackResult;IIZZILjava/lang/Object;)Lcom/pymcl/ai/RollbackResult;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget p1, p0, Lcom/pymcl/ai/RollbackResult;->restored:I

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget p2, p0, Lcom/pymcl/ai/RollbackResult;->failed:I

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget-boolean p3, p0, Lcom/pymcl/ai/RollbackResult;->hadEntries:Z

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget-boolean p4, p0, Lcom/pymcl/ai/RollbackResult;->rewindable:Z

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/pymcl/ai/RollbackResult;->copy(IIZZ)Lcom/pymcl/ai/RollbackResult;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/pymcl/ai/RollbackResult;->restored:I

    return v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lcom/pymcl/ai/RollbackResult;->failed:I

    return v0
.end method

.method public final component3()Z
    .locals 1

    iget-boolean v0, p0, Lcom/pymcl/ai/RollbackResult;->hadEntries:Z

    return v0
.end method

.method public final component4()Z
    .locals 1

    iget-boolean v0, p0, Lcom/pymcl/ai/RollbackResult;->rewindable:Z

    return v0
.end method

.method public final copy(IIZZ)Lcom/pymcl/ai/RollbackResult;
    .locals 1

    new-instance v0, Lcom/pymcl/ai/RollbackResult;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/pymcl/ai/RollbackResult;-><init>(IIZZ)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 5

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/pymcl/ai/RollbackResult;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    move-object v1, p1

    check-cast v1, Lcom/pymcl/ai/RollbackResult;

    iget v3, p0, Lcom/pymcl/ai/RollbackResult;->restored:I

    iget v4, v1, Lcom/pymcl/ai/RollbackResult;->restored:I

    if-eq v3, v4, :cond_2

    return v2

    :cond_2
    iget v3, p0, Lcom/pymcl/ai/RollbackResult;->failed:I

    iget v4, v1, Lcom/pymcl/ai/RollbackResult;->failed:I

    if-eq v3, v4, :cond_3

    return v2

    :cond_3
    iget-boolean v3, p0, Lcom/pymcl/ai/RollbackResult;->hadEntries:Z

    iget-boolean v4, v1, Lcom/pymcl/ai/RollbackResult;->hadEntries:Z

    if-eq v3, v4, :cond_4

    return v2

    :cond_4
    iget-boolean v3, p0, Lcom/pymcl/ai/RollbackResult;->rewindable:Z

    iget-boolean v1, v1, Lcom/pymcl/ai/RollbackResult;->rewindable:Z

    if-eq v3, v1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getFailed()I
    .locals 1

    .line 8
    iget v0, p0, Lcom/pymcl/ai/RollbackResult;->failed:I

    return v0
.end method

.method public final getHadEntries()Z
    .locals 1

    .line 8
    iget-boolean v0, p0, Lcom/pymcl/ai/RollbackResult;->hadEntries:Z

    return v0
.end method

.method public final getRestored()I
    .locals 1

    .line 8
    iget v0, p0, Lcom/pymcl/ai/RollbackResult;->restored:I

    return v0
.end method

.method public final getRewindable()Z
    .locals 1

    .line 8
    iget-boolean v0, p0, Lcom/pymcl/ai/RollbackResult;->rewindable:Z

    return v0
.end method

.method public hashCode()I
    .locals 3

    iget v0, p0, Lcom/pymcl/ai/RollbackResult;->restored:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    mul-int/lit8 v1, v0, 0x1f

    iget v2, p0, Lcom/pymcl/ai/RollbackResult;->failed:I

    invoke-static {v2}, Ljava/lang/Integer;->hashCode(I)I

    move-result v2

    add-int/2addr v1, v2

    mul-int/lit8 v0, v1, 0x1f

    iget-boolean v2, p0, Lcom/pymcl/ai/RollbackResult;->hadEntries:Z

    invoke-static {v2}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v1, v0, 0x1f

    iget-boolean v2, p0, Lcom/pymcl/ai/RollbackResult;->rewindable:Z

    invoke-static {v2}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v2

    add-int/2addr v1, v2

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget v0, p0, Lcom/pymcl/ai/RollbackResult;->restored:I

    iget v1, p0, Lcom/pymcl/ai/RollbackResult;->failed:I

    iget-boolean v2, p0, Lcom/pymcl/ai/RollbackResult;->hadEntries:Z

    iget-boolean v3, p0, Lcom/pymcl/ai/RollbackResult;->rewindable:Z

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "RollbackResult(restored="

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v4, ", failed="

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", hadEntries="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", rewindable="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
