.class public final Lcom/pymcl/ai/RewindOutcome;
.super Ljava/lang/Object;
.source "AiService.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u001d\u0008\u0086\u0008\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\t\u0012\u0008\u0008\u0002\u0010\n\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u000e\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u0006J\u0010\u0010\u001a\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u0006H\u0002J\t\u0010\u001b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001c\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001d\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u001e\u001a\u00020\u0006H\u00c6\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\t\u0010 \u001a\u00020\u0003H\u00c6\u0003JG\u0010!\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00062\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\t2\u0008\u0008\u0002\u0010\n\u001a\u00020\u0003H\u00c6\u0001J\u0014\u0010\"\u001a\u00020\u00062\u0008\u0010#\u001a\u0004\u0018\u00010\u0001H\u00d6\u0083\u0004J\n\u0010$\u001a\u00020\u0003H\u00d6\u0081\u0004J\n\u0010%\u001a\u00020\tH\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010\u0011R\u0013\u0010\u0008\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\u0014R\u0011\u0010\n\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0015\u0010\u000eR\u0011\u0010\u0016\u001a\u00020\t8F\u00a2\u0006\u0006\u001a\u0004\u0008\u0017\u0010\u0014\u00a8\u0006&"
    }
    d2 = {
        "Lcom/pymcl/ai/RewindOutcome;",
        "",
        "restoredFiles",
        "",
        "failed",
        "hadDiskChanges",
        "",
        "rewindable",
        "userText",
        "",
        "cancelledTasks",
        "<init>",
        "(IIZZLjava/lang/String;I)V",
        "getRestoredFiles",
        "()I",
        "getFailed",
        "getHadDiskChanges",
        "()Z",
        "getRewindable",
        "getUserText",
        "()Ljava/lang/String;",
        "getCancelledTasks",
        "message",
        "getMessage",
        "messageIn",
        "en",
        "baseMessage",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "copy",
        "equals",
        "other",
        "hashCode",
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
.field private final cancelledTasks:I

.field private final failed:I

.field private final hadDiskChanges:Z

.field private final restoredFiles:I

.field private final rewindable:Z

.field private final userText:Ljava/lang/String;


# direct methods
.method public constructor <init>(IIZZLjava/lang/String;I)V
    .locals 0
    .param p1, "restoredFiles"    # I
    .param p2, "failed"    # I
    .param p3, "hadDiskChanges"    # Z
    .param p4, "rewindable"    # Z
    .param p5, "userText"    # Ljava/lang/String;
    .param p6, "cancelledTasks"    # I

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/pymcl/ai/RewindOutcome;->restoredFiles:I

    iput p2, p0, Lcom/pymcl/ai/RewindOutcome;->failed:I

    iput-boolean p3, p0, Lcom/pymcl/ai/RewindOutcome;->hadDiskChanges:Z

    iput-boolean p4, p0, Lcom/pymcl/ai/RewindOutcome;->rewindable:Z

    iput-object p5, p0, Lcom/pymcl/ai/RewindOutcome;->userText:Ljava/lang/String;

    .line 16
    iput p6, p0, Lcom/pymcl/ai/RewindOutcome;->cancelledTasks:I

    .line 14
    return-void
.end method

.method public synthetic constructor <init>(IIZZLjava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 7

    .line 14
    and-int/lit8 p7, p7, 0x20

    if-eqz p7, :cond_0

    .line 16
    const/4 p6, 0x0

    move v6, p6

    goto :goto_0

    .line 14
    :cond_0
    move v6, p6

    :goto_0
    move-object v0, p0

    move v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    move-object v5, p5

    invoke-direct/range {v0 .. v6}, Lcom/pymcl/ai/RewindOutcome;-><init>(IIZZLjava/lang/String;I)V

    .line 16
    return-void
.end method

.method private final baseMessage(Z)Ljava/lang/String;
    .locals 3
    .param p1, "en"    # Z

    .line 20
    nop

    .line 21
    iget-object v0, p0, Lcom/pymcl/ai/RewindOutcome;->userText:Ljava/lang/String;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    sget-object v0, Lcom/pymcl/ai/AiText;->INSTANCE:Lcom/pymcl/ai/AiText;

    const-string v2, "\u6ca1\u6709\u53ef\u64a4\u56de\u7684\u5bf9\u8bdd"

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v0, p1, v2, v1}, Lcom/pymcl/ai/AiText;->tIn(ZLjava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 22
    :cond_0
    iget v0, p0, Lcom/pymcl/ai/RewindOutcome;->failed:I

    if-lez v0, :cond_1

    sget-object v0, Lcom/pymcl/ai/AiText;->INSTANCE:Lcom/pymcl/ai/AiText;

    const-string v2, "\u5bf9\u8bdd\u5df2\u56de\u9000\uff0c\u4f46\u78c1\u76d8\u6539\u52a8\u6ca1\u80fd\u5168\u90e8\u8fd8\u539f\uff0c\u8bf7\u624b\u52a8\u68c0\u67e5\u76f8\u5173\u6587\u4ef6"

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v0, p1, v2, v1}, Lcom/pymcl/ai/AiText;->tIn(ZLjava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 23
    :cond_1
    iget-boolean v0, p0, Lcom/pymcl/ai/RewindOutcome;->rewindable:Z

    if-nez v0, :cond_2

    sget-object v0, Lcom/pymcl/ai/AiText;->INSTANCE:Lcom/pymcl/ai/AiText;

    const-string v2, "\u5df2\u64a4\u56de\uff1a\u53ea\u56de\u9000\u4e86\u5bf9\u8bdd\uff0c\u8fd9\u4e00\u8f6e\u7684\u78c1\u76d8\u6539\u52a8\u65e0\u6cd5\u81ea\u52a8\u8fd8\u539f"

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v0, p1, v2, v1}, Lcom/pymcl/ai/AiText;->tIn(ZLjava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 24
    :cond_2
    iget-boolean v0, p0, Lcom/pymcl/ai/RewindOutcome;->hadDiskChanges:Z

    if-eqz v0, :cond_3

    iget v0, p0, Lcom/pymcl/ai/RewindOutcome;->restoredFiles:I

    if-lez v0, :cond_3

    sget-object v0, Lcom/pymcl/ai/AiText;->INSTANCE:Lcom/pymcl/ai/AiText;

    iget v1, p0, Lcom/pymcl/ai/RewindOutcome;->restoredFiles:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    const-string v2, "\u5df2\u64a4\u56de\uff1a{0} \u4e2a\u6587\u4ef6\u7684\u6539\u52a8\u5df2\u8fd8\u539f"

    invoke-virtual {v0, p1, v2, v1}, Lcom/pymcl/ai/AiText;->tIn(ZLjava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 25
    :cond_3
    sget-object v0, Lcom/pymcl/ai/AiText;->INSTANCE:Lcom/pymcl/ai/AiText;

    const-string v2, "\u5df2\u64a4\u56de\uff1a\u53ea\u56de\u9000\u4e86\u5bf9\u8bdd\uff0c\u8fd9\u4e00\u8f6e\u6ca1\u6709\u53ef\u8fd8\u539f\u7684\u78c1\u76d8\u6539\u52a8"

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v0, p1, v2, v1}, Lcom/pymcl/ai/AiText;->tIn(ZLjava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 26
    :goto_0
    return-object v0
.end method

.method public static synthetic copy$default(Lcom/pymcl/ai/RewindOutcome;IIZZLjava/lang/String;IILjava/lang/Object;)Lcom/pymcl/ai/RewindOutcome;
    .locals 0

    and-int/lit8 p8, p7, 0x1

    if-eqz p8, :cond_0

    iget p1, p0, Lcom/pymcl/ai/RewindOutcome;->restoredFiles:I

    :cond_0
    and-int/lit8 p8, p7, 0x2

    if-eqz p8, :cond_1

    iget p2, p0, Lcom/pymcl/ai/RewindOutcome;->failed:I

    :cond_1
    and-int/lit8 p8, p7, 0x4

    if-eqz p8, :cond_2

    iget-boolean p3, p0, Lcom/pymcl/ai/RewindOutcome;->hadDiskChanges:Z

    :cond_2
    and-int/lit8 p8, p7, 0x8

    if-eqz p8, :cond_3

    iget-boolean p4, p0, Lcom/pymcl/ai/RewindOutcome;->rewindable:Z

    :cond_3
    and-int/lit8 p8, p7, 0x10

    if-eqz p8, :cond_4

    iget-object p5, p0, Lcom/pymcl/ai/RewindOutcome;->userText:Ljava/lang/String;

    :cond_4
    and-int/lit8 p7, p7, 0x20

    if-eqz p7, :cond_5

    iget p6, p0, Lcom/pymcl/ai/RewindOutcome;->cancelledTasks:I

    :cond_5
    move-object p7, p5

    move p8, p6

    move p5, p3

    move p6, p4

    move p3, p1

    move p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p8}, Lcom/pymcl/ai/RewindOutcome;->copy(IIZZLjava/lang/String;I)Lcom/pymcl/ai/RewindOutcome;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/pymcl/ai/RewindOutcome;->restoredFiles:I

    return v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lcom/pymcl/ai/RewindOutcome;->failed:I

    return v0
.end method

.method public final component3()Z
    .locals 1

    iget-boolean v0, p0, Lcom/pymcl/ai/RewindOutcome;->hadDiskChanges:Z

    return v0
.end method

.method public final component4()Z
    .locals 1

    iget-boolean v0, p0, Lcom/pymcl/ai/RewindOutcome;->rewindable:Z

    return v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/pymcl/ai/RewindOutcome;->userText:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()I
    .locals 1

    iget v0, p0, Lcom/pymcl/ai/RewindOutcome;->cancelledTasks:I

    return v0
.end method

.method public final copy(IIZZLjava/lang/String;I)Lcom/pymcl/ai/RewindOutcome;
    .locals 7

    new-instance v0, Lcom/pymcl/ai/RewindOutcome;

    move v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    move-object v5, p5

    move v6, p6

    invoke-direct/range {v0 .. v6}, Lcom/pymcl/ai/RewindOutcome;-><init>(IIZZLjava/lang/String;I)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 5

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/pymcl/ai/RewindOutcome;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    move-object v1, p1

    check-cast v1, Lcom/pymcl/ai/RewindOutcome;

    iget v3, p0, Lcom/pymcl/ai/RewindOutcome;->restoredFiles:I

    iget v4, v1, Lcom/pymcl/ai/RewindOutcome;->restoredFiles:I

    if-eq v3, v4, :cond_2

    return v2

    :cond_2
    iget v3, p0, Lcom/pymcl/ai/RewindOutcome;->failed:I

    iget v4, v1, Lcom/pymcl/ai/RewindOutcome;->failed:I

    if-eq v3, v4, :cond_3

    return v2

    :cond_3
    iget-boolean v3, p0, Lcom/pymcl/ai/RewindOutcome;->hadDiskChanges:Z

    iget-boolean v4, v1, Lcom/pymcl/ai/RewindOutcome;->hadDiskChanges:Z

    if-eq v3, v4, :cond_4

    return v2

    :cond_4
    iget-boolean v3, p0, Lcom/pymcl/ai/RewindOutcome;->rewindable:Z

    iget-boolean v4, v1, Lcom/pymcl/ai/RewindOutcome;->rewindable:Z

    if-eq v3, v4, :cond_5

    return v2

    :cond_5
    iget-object v3, p0, Lcom/pymcl/ai/RewindOutcome;->userText:Ljava/lang/String;

    iget-object v4, v1, Lcom/pymcl/ai/RewindOutcome;->userText:Ljava/lang/String;

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_6

    return v2

    :cond_6
    iget v3, p0, Lcom/pymcl/ai/RewindOutcome;->cancelledTasks:I

    iget v1, v1, Lcom/pymcl/ai/RewindOutcome;->cancelledTasks:I

    if-eq v3, v1, :cond_7

    return v2

    :cond_7
    return v0
.end method

.method public final getCancelledTasks()I
    .locals 1

    .line 16
    iget v0, p0, Lcom/pymcl/ai/RewindOutcome;->cancelledTasks:I

    return v0
.end method

.method public final getFailed()I
    .locals 1

    .line 14
    iget v0, p0, Lcom/pymcl/ai/RewindOutcome;->failed:I

    return v0
.end method

.method public final getHadDiskChanges()Z
    .locals 1

    .line 14
    iget-boolean v0, p0, Lcom/pymcl/ai/RewindOutcome;->hadDiskChanges:Z

    return v0
.end method

.method public final getMessage()Ljava/lang/String;
    .locals 1

    .line 18
    sget-object v0, Lcom/pymcl/ai/AiText;->INSTANCE:Lcom/pymcl/ai/AiText;

    invoke-virtual {v0}, Lcom/pymcl/ai/AiText;->getEnglish()Lkotlin/jvm/functions/Function0;

    move-result-object v0

    invoke-interface {v0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    invoke-virtual {p0, v0}, Lcom/pymcl/ai/RewindOutcome;->messageIn(Z)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final getRestoredFiles()I
    .locals 1

    .line 14
    iget v0, p0, Lcom/pymcl/ai/RewindOutcome;->restoredFiles:I

    return v0
.end method

.method public final getRewindable()Z
    .locals 1

    .line 14
    iget-boolean v0, p0, Lcom/pymcl/ai/RewindOutcome;->rewindable:Z

    return v0
.end method

.method public final getUserText()Ljava/lang/String;
    .locals 1

    .line 14
    iget-object v0, p0, Lcom/pymcl/ai/RewindOutcome;->userText:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget v0, p0, Lcom/pymcl/ai/RewindOutcome;->restoredFiles:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    mul-int/lit8 v1, v0, 0x1f

    iget v2, p0, Lcom/pymcl/ai/RewindOutcome;->failed:I

    invoke-static {v2}, Ljava/lang/Integer;->hashCode(I)I

    move-result v2

    add-int/2addr v1, v2

    mul-int/lit8 v0, v1, 0x1f

    iget-boolean v2, p0, Lcom/pymcl/ai/RewindOutcome;->hadDiskChanges:Z

    invoke-static {v2}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v1, v0, 0x1f

    iget-boolean v2, p0, Lcom/pymcl/ai/RewindOutcome;->rewindable:Z

    invoke-static {v2}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v2

    add-int/2addr v1, v2

    mul-int/lit8 v0, v1, 0x1f

    iget-object v2, p0, Lcom/pymcl/ai/RewindOutcome;->userText:Ljava/lang/String;

    if-nez v2, :cond_0

    const/4 v2, 0x0

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lcom/pymcl/ai/RewindOutcome;->userText:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/lit8 v1, v0, 0x1f

    iget v2, p0, Lcom/pymcl/ai/RewindOutcome;->cancelledTasks:I

    invoke-static {v2}, Ljava/lang/Integer;->hashCode(I)I

    move-result v2

    add-int/2addr v1, v2

    return v1
.end method

.method public final messageIn(Z)Ljava/lang/String;
    .locals 4
    .param p1, "en"    # Z

    .line 19
    invoke-direct {p0, p1}, Lcom/pymcl/ai/RewindOutcome;->baseMessage(Z)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/pymcl/ai/RewindOutcome;->userText:Ljava/lang/String;

    if-eqz v1, :cond_0

    iget v1, p0, Lcom/pymcl/ai/RewindOutcome;->cancelledTasks:I

    if-lez v1, :cond_0

    sget-object v1, Lcom/pymcl/ai/AiText;->INSTANCE:Lcom/pymcl/ai/AiText;

    iget v2, p0, Lcom/pymcl/ai/RewindOutcome;->cancelledTasks:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    filled-new-array {v2}, [Ljava/lang/Object;

    move-result-object v2

    const-string v3, "\uff1b\u5e76\u53d6\u6d88\u4e86 {0} \u4e2a\u540e\u53f0\u4efb\u52a1"

    invoke-virtual {v1, p1, v3, v2}, Lcom/pymcl/ai/AiText;->tIn(ZLjava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_0
    const-string v1, ""

    :goto_0
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 8

    iget v0, p0, Lcom/pymcl/ai/RewindOutcome;->restoredFiles:I

    iget v1, p0, Lcom/pymcl/ai/RewindOutcome;->failed:I

    iget-boolean v2, p0, Lcom/pymcl/ai/RewindOutcome;->hadDiskChanges:Z

    iget-boolean v3, p0, Lcom/pymcl/ai/RewindOutcome;->rewindable:Z

    iget-object v4, p0, Lcom/pymcl/ai/RewindOutcome;->userText:Ljava/lang/String;

    iget v5, p0, Lcom/pymcl/ai/RewindOutcome;->cancelledTasks:I

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "RewindOutcome(restoredFiles="

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v6, ", failed="

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", hadDiskChanges="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", rewindable="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", userText="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", cancelledTasks="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
