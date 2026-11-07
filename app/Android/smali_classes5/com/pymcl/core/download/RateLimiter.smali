.class public final Lcom/pymcl/core/download/RateLimiter;
.super Ljava/lang/Object;
.source "DownloadManager.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0006\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0003R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007\"\u0004\u0008\u0008\u0010\u0005R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u000cX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"
    }
    d2 = {
        "Lcom/pymcl/core/download/RateLimiter;",
        "",
        "kbps",
        "",
        "<init>",
        "(I)V",
        "getKbps",
        "()I",
        "setKbps",
        "avail",
        "",
        "last",
        "",
        "acquire",
        "",
        "n",
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
.field private avail:D

.field private volatile kbps:I

.field private last:J


# direct methods
.method public constructor <init>(I)V
    .locals 2
    .param p1, "kbps"    # I

    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/pymcl/core/download/RateLimiter;->kbps:I

    .line 33
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/pymcl/core/download/RateLimiter;->last:J

    .line 32
    return-void
.end method


# virtual methods
.method public final acquire(I)V
    .locals 17
    .param p1, "n"    # I

    .line 35
    move-object/from16 v1, p0

    move/from16 v2, p1

    iget v0, v1, Lcom/pymcl/core/download/RateLimiter;->kbps:I

    if-gtz v0, :cond_0

    return-void

    .line 36
    :cond_0
    :goto_0
    nop

    .line 37
    const-wide/16 v3, 0x0

    .line 38
    .local v3, "wait":J
    monitor-enter p0

    const/4 v0, 0x0

    .line 39
    .local v0, "$i$a$-synchronized-RateLimiter$acquire$1":I
    :try_start_0
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v5

    .local v5, "now":J
    iget v7, v1, Lcom/pymcl/core/download/RateLimiter;->kbps:I

    int-to-double v7, v7

    const-wide/high16 v9, 0x4090000000000000L    # 1024.0

    mul-double/2addr v7, v9

    .line 40
    .local v7, "rate":D
    iget-wide v9, v1, Lcom/pymcl/core/download/RateLimiter;->avail:D

    iget-wide v11, v1, Lcom/pymcl/core/download/RateLimiter;->last:J

    sub-long v11, v5, v11

    long-to-double v11, v11

    const-wide v13, 0x41cdcd6500000000L    # 1.0E9

    div-double/2addr v11, v13

    mul-double/2addr v11, v7

    add-double/2addr v9, v11

    invoke-static {v7, v8, v9, v10}, Ljava/lang/Math;->min(DD)D

    move-result-wide v9

    iput-wide v9, v1, Lcom/pymcl/core/download/RateLimiter;->avail:D

    iput-wide v5, v1, Lcom/pymcl/core/download/RateLimiter;->last:J

    .line 41
    iget-wide v9, v1, Lcom/pymcl/core/download/RateLimiter;->avail:D

    int-to-double v11, v2

    cmpl-double v9, v9, v11

    if-gez v9, :cond_2

    iget-wide v9, v1, Lcom/pymcl/core/download/RateLimiter;->avail:D

    cmpl-double v9, v9, v7

    if-ltz v9, :cond_1

    goto :goto_1

    .line 42
    :cond_1
    int-to-double v9, v2

    iget-wide v11, v1, Lcom/pymcl/core/download/RateLimiter;->avail:D

    sub-double/2addr v9, v11

    div-double/2addr v9, v7

    const/16 v11, 0x3e8

    int-to-double v11, v11

    mul-double/2addr v9, v11

    double-to-long v11, v9

    const-wide/16 v13, 0x1

    const-wide/16 v15, 0x3e8

    invoke-static/range {v11 .. v16}, Lkotlin/ranges/RangesKt;->coerceIn(JJJ)J

    move-result-wide v9

    move-wide v3, v9

    .line 43
    nop

    .end local v0    # "$i$a$-synchronized-RateLimiter$acquire$1":I
    .end local v5    # "now":J
    .end local v7    # "rate":D
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 38
    monitor-exit p0

    .line 44
    invoke-static {v3, v4}, Ljava/lang/Thread;->sleep(J)V

    .end local v3    # "wait":J
    goto :goto_0

    .line 41
    .restart local v0    # "$i$a$-synchronized-RateLimiter$acquire$1":I
    .restart local v3    # "wait":J
    .restart local v5    # "now":J
    .restart local v7    # "rate":D
    :cond_2
    :goto_1
    :try_start_1
    iget-wide v9, v1, Lcom/pymcl/core/download/RateLimiter;->avail:D

    int-to-double v11, v2

    sub-double/2addr v9, v11

    iput-wide v9, v1, Lcom/pymcl/core/download/RateLimiter;->avail:D
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 38
    .end local v0    # "$i$a$-synchronized-RateLimiter$acquire$1":I
    .end local v5    # "now":J
    .end local v7    # "rate":D
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final getKbps()I
    .locals 1

    .line 32
    iget v0, p0, Lcom/pymcl/core/download/RateLimiter;->kbps:I

    return v0
.end method

.method public final setKbps(I)V
    .locals 0
    .param p1, "<set-?>"    # I

    .line 32
    iput p1, p0, Lcom/pymcl/core/download/RateLimiter;->kbps:I

    return-void
.end method
