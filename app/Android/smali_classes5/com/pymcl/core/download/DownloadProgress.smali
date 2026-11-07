.class public final Lcom/pymcl/core/download/DownloadProgress;
.super Ljava/lang/Object;
.source "DownloadManager.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\t\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0012\n\u0002\u0010\u0007\n\u0002\u0008\u0012\u0008\u0086\u0008\u0018\u00002\u00020\u0001Bm\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\t\u0012\u0008\u0008\u0002\u0010\n\u001a\u00020\t\u0012\u0008\u0008\u0002\u0010\u000b\u001a\u00020\t\u0012\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\r\u001a\u00020\u000e\u0012\n\u0008\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\t\u0010$\u001a\u00020\u0003H\u00c6\u0003J\t\u0010%\u001a\u00020\u0005H\u00c6\u0003J\t\u0010&\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\'\u001a\u00020\u0005H\u00c6\u0003J\t\u0010(\u001a\u00020\tH\u00c6\u0003J\t\u0010)\u001a\u00020\tH\u00c6\u0003J\t\u0010*\u001a\u00020\tH\u00c6\u0003J\t\u0010+\u001a\u00020\u0003H\u00c6\u0003J\t\u0010,\u001a\u00020\u000eH\u00c6\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003Jo\u0010.\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0008\u001a\u00020\t2\u0008\u0008\u0002\u0010\n\u001a\u00020\t2\u0008\u0008\u0002\u0010\u000b\u001a\u00020\t2\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u00032\u0008\u0008\u0002\u0010\r\u001a\u00020\u000e2\n\u0008\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0014\u0010/\u001a\u00020\u000e2\u0008\u00100\u001a\u0004\u0018\u00010\u0001H\u00d6\u0083\u0004J\n\u00101\u001a\u00020\u0005H\u00d6\u0081\u0004J\n\u00102\u001a\u00020\u0003H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0014\u0010\u0015R\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0016\u0010\u0015R\u0011\u0010\u0007\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0017\u0010\u0015R\u0011\u0010\u0008\u001a\u00020\t\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0018\u0010\u0019R\u0011\u0010\n\u001a\u00020\t\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001a\u0010\u0019R\u0011\u0010\u000b\u001a\u00020\t\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001b\u0010\u0019R\u0011\u0010\u000c\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001c\u0010\u0013R\u0011\u0010\r\u001a\u00020\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001d\u0010\u001eR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001f\u0010\u0013R\u0011\u0010 \u001a\u00020!8F\u00a2\u0006\u0006\u001a\u0004\u0008\"\u0010#\u00a8\u00063"
    }
    d2 = {
        "Lcom/pymcl/core/download/DownloadProgress;",
        "",
        "taskName",
        "",
        "totalFiles",
        "",
        "doneFiles",
        "failedFiles",
        "totalBytes",
        "",
        "doneBytes",
        "speedBps",
        "current",
        "finished",
        "",
        "error",
        "<init>",
        "(Ljava/lang/String;IIIJJJLjava/lang/String;ZLjava/lang/String;)V",
        "getTaskName",
        "()Ljava/lang/String;",
        "getTotalFiles",
        "()I",
        "getDoneFiles",
        "getFailedFiles",
        "getTotalBytes",
        "()J",
        "getDoneBytes",
        "getSpeedBps",
        "getCurrent",
        "getFinished",
        "()Z",
        "getError",
        "fraction",
        "",
        "getFraction",
        "()F",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "component8",
        "component9",
        "component10",
        "copy",
        "equals",
        "other",
        "hashCode",
        "toString",
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


# instance fields
.field private final current:Ljava/lang/String;

.field private final doneBytes:J

.field private final doneFiles:I

.field private final error:Ljava/lang/String;

.field private final failedFiles:I

.field private final finished:Z

.field private final speedBps:J

.field private final taskName:Ljava/lang/String;

.field private final totalBytes:J

.field private final totalFiles:I


# direct methods
.method public constructor <init>()V
    .locals 16

    const/16 v14, 0x3ff

    const/4 v15, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const-wide/16 v5, 0x0

    const-wide/16 v7, 0x0

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    move-object/from16 v0, p0

    invoke-direct/range {v0 .. v15}, Lcom/pymcl/core/download/DownloadProgress;-><init>(Ljava/lang/String;IIIJJJLjava/lang/String;ZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;IIIJJJLjava/lang/String;ZLjava/lang/String;)V
    .locals 1
    .param p1, "taskName"    # Ljava/lang/String;
    .param p2, "totalFiles"    # I
    .param p3, "doneFiles"    # I
    .param p4, "failedFiles"    # I
    .param p5, "totalBytes"    # J
    .param p7, "doneBytes"    # J
    .param p9, "speedBps"    # J
    .param p11, "current"    # Ljava/lang/String;
    .param p12, "finished"    # Z
    .param p13, "error"    # Ljava/lang/String;

    const-string v0, "taskName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "current"

    invoke-static {p11, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    iput-object p1, p0, Lcom/pymcl/core/download/DownloadProgress;->taskName:Ljava/lang/String;

    iput p2, p0, Lcom/pymcl/core/download/DownloadProgress;->totalFiles:I

    iput p3, p0, Lcom/pymcl/core/download/DownloadProgress;->doneFiles:I

    iput p4, p0, Lcom/pymcl/core/download/DownloadProgress;->failedFiles:I

    .line 28
    iput-wide p5, p0, Lcom/pymcl/core/download/DownloadProgress;->totalBytes:J

    iput-wide p7, p0, Lcom/pymcl/core/download/DownloadProgress;->doneBytes:J

    iput-wide p9, p0, Lcom/pymcl/core/download/DownloadProgress;->speedBps:J

    iput-object p11, p0, Lcom/pymcl/core/download/DownloadProgress;->current:Ljava/lang/String;

    iput-boolean p12, p0, Lcom/pymcl/core/download/DownloadProgress;->finished:Z

    iput-object p13, p0, Lcom/pymcl/core/download/DownloadProgress;->error:Ljava/lang/String;

    .line 26
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;IIIJJJLjava/lang/String;ZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 13

    .line 26
    move/from16 v0, p14

    and-int/lit8 v1, v0, 0x1

    const-string v2, ""

    if-eqz v1, :cond_0

    .line 27
    move-object p1, v2

    .line 26
    :cond_0
    and-int/lit8 v1, v0, 0x2

    const/4 v3, 0x0

    if-eqz v1, :cond_1

    .line 27
    move v1, v3

    goto :goto_0

    .line 26
    :cond_1
    move v1, p2

    :goto_0
    and-int/lit8 v4, v0, 0x4

    if-eqz v4, :cond_2

    .line 27
    move v4, v3

    goto :goto_1

    .line 26
    :cond_2
    move/from16 v4, p3

    :goto_1
    and-int/lit8 v5, v0, 0x8

    if-eqz v5, :cond_3

    .line 27
    move v5, v3

    goto :goto_2

    .line 26
    :cond_3
    move/from16 v5, p4

    :goto_2
    and-int/lit8 v6, v0, 0x10

    const-wide/16 v7, 0x0

    if-eqz v6, :cond_4

    .line 28
    move-wide v9, v7

    goto :goto_3

    .line 26
    :cond_4
    move-wide/from16 v9, p5

    :goto_3
    and-int/lit8 v6, v0, 0x20

    if-eqz v6, :cond_5

    .line 28
    move-wide v11, v7

    goto :goto_4

    .line 26
    :cond_5
    move-wide/from16 v11, p7

    :goto_4
    and-int/lit8 v6, v0, 0x40

    if-eqz v6, :cond_6

    .line 28
    goto :goto_5

    .line 26
    :cond_6
    move-wide/from16 v7, p9

    :goto_5
    and-int/lit16 v6, v0, 0x80

    if-eqz v6, :cond_7

    .line 28
    goto :goto_6

    .line 26
    :cond_7
    move-object/from16 v2, p11

    :goto_6
    and-int/lit16 v6, v0, 0x100

    if-eqz v6, :cond_8

    .line 28
    goto :goto_7

    .line 26
    :cond_8
    move/from16 v3, p12

    :goto_7
    and-int/lit16 v0, v0, 0x200

    if-eqz v0, :cond_9

    .line 28
    const/4 v0, 0x0

    goto :goto_8

    .line 26
    :cond_9
    move-object/from16 v0, p13

    :goto_8
    move-object p2, p1

    move-object/from16 p14, v0

    move/from16 p3, v1

    move-object/from16 p12, v2

    move/from16 p13, v3

    move/from16 p4, v4

    move/from16 p5, v5

    move-wide/from16 p10, v7

    move-wide/from16 p6, v9

    move-wide/from16 p8, v11

    move-object p1, p0

    invoke-direct/range {p1 .. p14}, Lcom/pymcl/core/download/DownloadProgress;-><init>(Ljava/lang/String;IIIJJJLjava/lang/String;ZLjava/lang/String;)V

    .line 29
    return-void
.end method

.method public static synthetic copy$default(Lcom/pymcl/core/download/DownloadProgress;Ljava/lang/String;IIIJJJLjava/lang/String;ZLjava/lang/String;ILjava/lang/Object;)Lcom/pymcl/core/download/DownloadProgress;
    .locals 12

    move/from16 v0, p14

    and-int/lit8 v1, v0, 0x1

    if-eqz v1, :cond_0

    iget-object p1, p0, Lcom/pymcl/core/download/DownloadProgress;->taskName:Ljava/lang/String;

    :cond_0
    and-int/lit8 v1, v0, 0x2

    if-eqz v1, :cond_1

    iget v1, p0, Lcom/pymcl/core/download/DownloadProgress;->totalFiles:I

    goto :goto_0

    :cond_1
    move v1, p2

    :goto_0
    and-int/lit8 v2, v0, 0x4

    if-eqz v2, :cond_2

    iget v2, p0, Lcom/pymcl/core/download/DownloadProgress;->doneFiles:I

    goto :goto_1

    :cond_2
    move v2, p3

    :goto_1
    and-int/lit8 v3, v0, 0x8

    if-eqz v3, :cond_3

    iget v3, p0, Lcom/pymcl/core/download/DownloadProgress;->failedFiles:I

    goto :goto_2

    :cond_3
    move/from16 v3, p4

    :goto_2
    and-int/lit8 v4, v0, 0x10

    if-eqz v4, :cond_4

    iget-wide v4, p0, Lcom/pymcl/core/download/DownloadProgress;->totalBytes:J

    goto :goto_3

    :cond_4
    move-wide/from16 v4, p5

    :goto_3
    and-int/lit8 v6, v0, 0x20

    if-eqz v6, :cond_5

    iget-wide v6, p0, Lcom/pymcl/core/download/DownloadProgress;->doneBytes:J

    goto :goto_4

    :cond_5
    move-wide/from16 v6, p7

    :goto_4
    and-int/lit8 v8, v0, 0x40

    if-eqz v8, :cond_6

    iget-wide v8, p0, Lcom/pymcl/core/download/DownloadProgress;->speedBps:J

    goto :goto_5

    :cond_6
    move-wide/from16 v8, p9

    :goto_5
    and-int/lit16 v10, v0, 0x80

    if-eqz v10, :cond_7

    iget-object v10, p0, Lcom/pymcl/core/download/DownloadProgress;->current:Ljava/lang/String;

    goto :goto_6

    :cond_7
    move-object/from16 v10, p11

    :goto_6
    and-int/lit16 v11, v0, 0x100

    if-eqz v11, :cond_8

    iget-boolean v11, p0, Lcom/pymcl/core/download/DownloadProgress;->finished:Z

    goto :goto_7

    :cond_8
    move/from16 v11, p12

    :goto_7
    and-int/lit16 v0, v0, 0x200

    if-eqz v0, :cond_9

    iget-object v0, p0, Lcom/pymcl/core/download/DownloadProgress;->error:Ljava/lang/String;

    move-object/from16 p15, v0

    goto :goto_8

    :cond_9
    move-object/from16 p15, p13

    :goto_8
    move-object p2, p0

    move-object p3, p1

    move/from16 p4, v1

    move/from16 p5, v2

    move/from16 p6, v3

    move-wide/from16 p7, v4

    move-wide/from16 p9, v6

    move-wide/from16 p11, v8

    move-object/from16 p13, v10

    move/from16 p14, v11

    invoke-virtual/range {p2 .. p15}, Lcom/pymcl/core/download/DownloadProgress;->copy(Ljava/lang/String;IIIJJJLjava/lang/String;ZLjava/lang/String;)Lcom/pymcl/core/download/DownloadProgress;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/pymcl/core/download/DownloadProgress;->taskName:Ljava/lang/String;

    return-object v0
.end method

.method public final component10()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/pymcl/core/download/DownloadProgress;->error:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lcom/pymcl/core/download/DownloadProgress;->totalFiles:I

    return v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lcom/pymcl/core/download/DownloadProgress;->doneFiles:I

    return v0
.end method

.method public final component4()I
    .locals 1

    iget v0, p0, Lcom/pymcl/core/download/DownloadProgress;->failedFiles:I

    return v0
.end method

.method public final component5()J
    .locals 2

    iget-wide v0, p0, Lcom/pymcl/core/download/DownloadProgress;->totalBytes:J

    return-wide v0
.end method

.method public final component6()J
    .locals 2

    iget-wide v0, p0, Lcom/pymcl/core/download/DownloadProgress;->doneBytes:J

    return-wide v0
.end method

.method public final component7()J
    .locals 2

    iget-wide v0, p0, Lcom/pymcl/core/download/DownloadProgress;->speedBps:J

    return-wide v0
.end method

.method public final component8()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/pymcl/core/download/DownloadProgress;->current:Ljava/lang/String;

    return-object v0
.end method

.method public final component9()Z
    .locals 1

    iget-boolean v0, p0, Lcom/pymcl/core/download/DownloadProgress;->finished:Z

    return v0
.end method

.method public final copy(Ljava/lang/String;IIIJJJLjava/lang/String;ZLjava/lang/String;)Lcom/pymcl/core/download/DownloadProgress;
    .locals 15

    const-string v0, "taskName"

    move-object/from16 v2, p1

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "current"

    move-object/from16 v12, p11

    invoke-static {v12, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/pymcl/core/download/DownloadProgress;

    move/from16 v3, p2

    move/from16 v4, p3

    move/from16 v5, p4

    move-wide/from16 v6, p5

    move-wide/from16 v8, p7

    move-wide/from16 v10, p9

    move/from16 v13, p12

    move-object/from16 v14, p13

    invoke-direct/range {v1 .. v14}, Lcom/pymcl/core/download/DownloadProgress;-><init>(Ljava/lang/String;IIIJJJLjava/lang/String;ZLjava/lang/String;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/pymcl/core/download/DownloadProgress;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    move-object v1, p1

    check-cast v1, Lcom/pymcl/core/download/DownloadProgress;

    iget-object v3, p0, Lcom/pymcl/core/download/DownloadProgress;->taskName:Ljava/lang/String;

    iget-object v4, v1, Lcom/pymcl/core/download/DownloadProgress;->taskName:Ljava/lang/String;

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_2

    return v2

    :cond_2
    iget v3, p0, Lcom/pymcl/core/download/DownloadProgress;->totalFiles:I

    iget v4, v1, Lcom/pymcl/core/download/DownloadProgress;->totalFiles:I

    if-eq v3, v4, :cond_3

    return v2

    :cond_3
    iget v3, p0, Lcom/pymcl/core/download/DownloadProgress;->doneFiles:I

    iget v4, v1, Lcom/pymcl/core/download/DownloadProgress;->doneFiles:I

    if-eq v3, v4, :cond_4

    return v2

    :cond_4
    iget v3, p0, Lcom/pymcl/core/download/DownloadProgress;->failedFiles:I

    iget v4, v1, Lcom/pymcl/core/download/DownloadProgress;->failedFiles:I

    if-eq v3, v4, :cond_5

    return v2

    :cond_5
    iget-wide v3, p0, Lcom/pymcl/core/download/DownloadProgress;->totalBytes:J

    iget-wide v5, v1, Lcom/pymcl/core/download/DownloadProgress;->totalBytes:J

    cmp-long v3, v3, v5

    if-eqz v3, :cond_6

    return v2

    :cond_6
    iget-wide v3, p0, Lcom/pymcl/core/download/DownloadProgress;->doneBytes:J

    iget-wide v5, v1, Lcom/pymcl/core/download/DownloadProgress;->doneBytes:J

    cmp-long v3, v3, v5

    if-eqz v3, :cond_7

    return v2

    :cond_7
    iget-wide v3, p0, Lcom/pymcl/core/download/DownloadProgress;->speedBps:J

    iget-wide v5, v1, Lcom/pymcl/core/download/DownloadProgress;->speedBps:J

    cmp-long v3, v3, v5

    if-eqz v3, :cond_8

    return v2

    :cond_8
    iget-object v3, p0, Lcom/pymcl/core/download/DownloadProgress;->current:Ljava/lang/String;

    iget-object v4, v1, Lcom/pymcl/core/download/DownloadProgress;->current:Ljava/lang/String;

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_9

    return v2

    :cond_9
    iget-boolean v3, p0, Lcom/pymcl/core/download/DownloadProgress;->finished:Z

    iget-boolean v4, v1, Lcom/pymcl/core/download/DownloadProgress;->finished:Z

    if-eq v3, v4, :cond_a

    return v2

    :cond_a
    iget-object v3, p0, Lcom/pymcl/core/download/DownloadProgress;->error:Ljava/lang/String;

    iget-object v1, v1, Lcom/pymcl/core/download/DownloadProgress;->error:Ljava/lang/String;

    invoke-static {v3, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    return v0
.end method

.method public final getCurrent()Ljava/lang/String;
    .locals 1

    .line 28
    iget-object v0, p0, Lcom/pymcl/core/download/DownloadProgress;->current:Ljava/lang/String;

    return-object v0
.end method

.method public final getDoneBytes()J
    .locals 2

    .line 28
    iget-wide v0, p0, Lcom/pymcl/core/download/DownloadProgress;->doneBytes:J

    return-wide v0
.end method

.method public final getDoneFiles()I
    .locals 1

    .line 27
    iget v0, p0, Lcom/pymcl/core/download/DownloadProgress;->doneFiles:I

    return v0
.end method

.method public final getError()Ljava/lang/String;
    .locals 1

    .line 28
    iget-object v0, p0, Lcom/pymcl/core/download/DownloadProgress;->error:Ljava/lang/String;

    return-object v0
.end method

.method public final getFailedFiles()I
    .locals 1

    .line 27
    iget v0, p0, Lcom/pymcl/core/download/DownloadProgress;->failedFiles:I

    return v0
.end method

.method public final getFinished()Z
    .locals 1

    .line 28
    iget-boolean v0, p0, Lcom/pymcl/core/download/DownloadProgress;->finished:Z

    return v0
.end method

.method public final getFraction()F
    .locals 4

    .line 29
    iget-wide v0, p0, Lcom/pymcl/core/download/DownloadProgress;->totalBytes:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    const/4 v1, 0x0

    if-lez v0, :cond_0

    iget-wide v2, p0, Lcom/pymcl/core/download/DownloadProgress;->doneBytes:J

    long-to-float v0, v2

    iget-wide v2, p0, Lcom/pymcl/core/download/DownloadProgress;->totalBytes:J

    long-to-float v2, v2

    div-float/2addr v0, v2

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-static {v0, v1, v2}, Lkotlin/ranges/RangesKt;->coerceIn(FFF)F

    move-result v1

    goto :goto_0

    :cond_0
    iget v0, p0, Lcom/pymcl/core/download/DownloadProgress;->totalFiles:I

    if-lez v0, :cond_1

    iget v0, p0, Lcom/pymcl/core/download/DownloadProgress;->doneFiles:I

    int-to-float v0, v0

    iget v1, p0, Lcom/pymcl/core/download/DownloadProgress;->totalFiles:I

    int-to-float v1, v1

    div-float v1, v0, v1

    :cond_1
    :goto_0
    return v1
.end method

.method public final getSpeedBps()J
    .locals 2

    .line 28
    iget-wide v0, p0, Lcom/pymcl/core/download/DownloadProgress;->speedBps:J

    return-wide v0
.end method

.method public final getTaskName()Ljava/lang/String;
    .locals 1

    .line 27
    iget-object v0, p0, Lcom/pymcl/core/download/DownloadProgress;->taskName:Ljava/lang/String;

    return-object v0
.end method

.method public final getTotalBytes()J
    .locals 2

    .line 28
    iget-wide v0, p0, Lcom/pymcl/core/download/DownloadProgress;->totalBytes:J

    return-wide v0
.end method

.method public final getTotalFiles()I
    .locals 1

    .line 27
    iget v0, p0, Lcom/pymcl/core/download/DownloadProgress;->totalFiles:I

    return v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/pymcl/core/download/DownloadProgress;->taskName:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v1, v0, 0x1f

    iget v2, p0, Lcom/pymcl/core/download/DownloadProgress;->totalFiles:I

    invoke-static {v2}, Ljava/lang/Integer;->hashCode(I)I

    move-result v2

    add-int/2addr v1, v2

    mul-int/lit8 v0, v1, 0x1f

    iget v2, p0, Lcom/pymcl/core/download/DownloadProgress;->doneFiles:I

    invoke-static {v2}, Ljava/lang/Integer;->hashCode(I)I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v1, v0, 0x1f

    iget v2, p0, Lcom/pymcl/core/download/DownloadProgress;->failedFiles:I

    invoke-static {v2}, Ljava/lang/Integer;->hashCode(I)I

    move-result v2

    add-int/2addr v1, v2

    mul-int/lit8 v0, v1, 0x1f

    iget-wide v2, p0, Lcom/pymcl/core/download/DownloadProgress;->totalBytes:J

    invoke-static {v2, v3}, Ljava/lang/Long;->hashCode(J)I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v1, v0, 0x1f

    iget-wide v2, p0, Lcom/pymcl/core/download/DownloadProgress;->doneBytes:J

    invoke-static {v2, v3}, Ljava/lang/Long;->hashCode(J)I

    move-result v2

    add-int/2addr v1, v2

    mul-int/lit8 v0, v1, 0x1f

    iget-wide v2, p0, Lcom/pymcl/core/download/DownloadProgress;->speedBps:J

    invoke-static {v2, v3}, Ljava/lang/Long;->hashCode(J)I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v1, v0, 0x1f

    iget-object v2, p0, Lcom/pymcl/core/download/DownloadProgress;->current:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    add-int/2addr v1, v2

    mul-int/lit8 v0, v1, 0x1f

    iget-boolean v2, p0, Lcom/pymcl/core/download/DownloadProgress;->finished:Z

    invoke-static {v2}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v1, v0, 0x1f

    iget-object v2, p0, Lcom/pymcl/core/download/DownloadProgress;->error:Ljava/lang/String;

    if-nez v2, :cond_0

    const/4 v2, 0x0

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lcom/pymcl/core/download/DownloadProgress;->error:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v1, v2

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 15

    iget-object v0, p0, Lcom/pymcl/core/download/DownloadProgress;->taskName:Ljava/lang/String;

    iget v1, p0, Lcom/pymcl/core/download/DownloadProgress;->totalFiles:I

    iget v2, p0, Lcom/pymcl/core/download/DownloadProgress;->doneFiles:I

    iget v3, p0, Lcom/pymcl/core/download/DownloadProgress;->failedFiles:I

    iget-wide v4, p0, Lcom/pymcl/core/download/DownloadProgress;->totalBytes:J

    iget-wide v6, p0, Lcom/pymcl/core/download/DownloadProgress;->doneBytes:J

    iget-wide v8, p0, Lcom/pymcl/core/download/DownloadProgress;->speedBps:J

    iget-object v10, p0, Lcom/pymcl/core/download/DownloadProgress;->current:Ljava/lang/String;

    iget-boolean v11, p0, Lcom/pymcl/core/download/DownloadProgress;->finished:Z

    iget-object v12, p0, Lcom/pymcl/core/download/DownloadProgress;->error:Ljava/lang/String;

    new-instance v13, Ljava/lang/StringBuilder;

    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    const-string v14, "DownloadProgress(taskName="

    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v13

    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v13, ", totalFiles="

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", doneFiles="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", failedFiles="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", totalBytes="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", doneBytes="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", speedBps="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v8, v9}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", current="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", finished="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", error="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
