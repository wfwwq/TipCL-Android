.class final Lcom/pymcl/runtime/process/FclJavaProcessRunner$Tail;
.super Ljava/lang/Object;
.source "FclJavaProcessRunner.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/pymcl/runtime/process/FclJavaProcessRunner;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "Tail"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0002\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0006\u0010\u000f\u001a\u00020\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u000c\u001a\u00060\rj\u0002`\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"
    }
    d2 = {
        "Lcom/pymcl/runtime/process/FclJavaProcessRunner$Tail;",
        "",
        "f",
        "Ljava/io/File;",
        "out",
        "Lkotlin/Function1;",
        "",
        "",
        "<init>",
        "(Ljava/io/File;Lkotlin/jvm/functions/Function1;)V",
        "pos",
        "",
        "buf",
        "Ljava/lang/StringBuilder;",
        "Lkotlin/text/StringBuilder;",
        "poll",
        "PyMCL-Android:runtime_debug"
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
.field private final buf:Ljava/lang/StringBuilder;

.field private final f:Ljava/io/File;

.field private final out:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field private pos:J


# direct methods
.method public constructor <init>(Ljava/io/File;Lkotlin/jvm/functions/Function1;)V
    .locals 1
    .param p1, "f"    # Ljava/io/File;
    .param p2, "out"    # Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/io/File;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const-string v0, "f"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "out"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 98
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/pymcl/runtime/process/FclJavaProcessRunner$Tail;->f:Ljava/io/File;

    iput-object p2, p0, Lcom/pymcl/runtime/process/FclJavaProcessRunner$Tail;->out:Lkotlin/jvm/functions/Function1;

    .line 99
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iput-object v0, p0, Lcom/pymcl/runtime/process/FclJavaProcessRunner$Tail;->buf:Ljava/lang/StringBuilder;

    .line 98
    return-void
.end method


# virtual methods
.method public final poll()V
    .locals 8

    .line 101
    iget-object v0, p0, Lcom/pymcl/runtime/process/FclJavaProcessRunner$Tail;->f:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->isFile()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/pymcl/runtime/process/FclJavaProcessRunner$Tail;->f:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->length()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/pymcl/runtime/process/FclJavaProcessRunner$Tail;->pos:J

    cmp-long v0, v0, v2

    if-gtz v0, :cond_0

    goto :goto_1

    .line 102
    :cond_0
    new-instance v0, Ljava/io/RandomAccessFile;

    iget-object v1, p0, Lcom/pymcl/runtime/process/FclJavaProcessRunner$Tail;->f:Ljava/io/File;

    const-string v2, "r"

    invoke-direct {v0, v1, v2}, Ljava/io/RandomAccessFile;-><init>(Ljava/io/File;Ljava/lang/String;)V

    check-cast v0, Ljava/io/Closeable;

    :try_start_0
    move-object v1, v0

    check-cast v1, Ljava/io/RandomAccessFile;

    .local v1, "r":Ljava/io/RandomAccessFile;
    const/4 v2, 0x0

    .line 103
    .local v2, "$i$a$-use-FclJavaProcessRunner$Tail$poll$1":I
    iget-wide v3, p0, Lcom/pymcl/runtime/process/FclJavaProcessRunner$Tail;->pos:J

    invoke-virtual {v1, v3, v4}, Ljava/io/RandomAccessFile;->seek(J)V

    invoke-virtual {v1}, Ljava/io/RandomAccessFile;->length()J

    move-result-wide v3

    iget-wide v5, p0, Lcom/pymcl/runtime/process/FclJavaProcessRunner$Tail;->pos:J

    sub-long/2addr v3, v5

    long-to-int v3, v3

    const/high16 v4, 0x100000

    invoke-static {v3, v4}, Lkotlin/ranges/RangesKt;->coerceAtMost(II)I

    move-result v3

    new-array v3, v3, [B

    .local v3, "b":[B
    invoke-virtual {v1, v3}, Ljava/io/RandomAccessFile;->readFully([B)V

    iget-wide v4, p0, Lcom/pymcl/runtime/process/FclJavaProcessRunner$Tail;->pos:J

    array-length v6, v3

    int-to-long v6, v6

    add-long/2addr v4, v6

    iput-wide v4, p0, Lcom/pymcl/runtime/process/FclJavaProcessRunner$Tail;->pos:J

    .line 104
    iget-object v4, p0, Lcom/pymcl/runtime/process/FclJavaProcessRunner$Tail;->buf:Ljava/lang/StringBuilder;

    new-instance v5, Ljava/lang/String;

    sget-object v6, Lkotlin/text/Charsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-direct {v5, v3, v6}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 102
    .end local v1    # "r":Ljava/io/RandomAccessFile;
    .end local v2    # "$i$a$-use-FclJavaProcessRunner$Tail$poll$1":I
    .end local v3    # "b":[B
    const/4 v1, 0x0

    invoke-static {v0, v1}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 106
    :goto_0
    iget-object v0, p0, Lcom/pymcl/runtime/process/FclJavaProcessRunner$Tail;->buf:Ljava/lang/StringBuilder;

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->indexOf(Ljava/lang/String;)I

    move-result v0

    .local v0, "i":I
    if-ltz v0, :cond_1

    iget-object v1, p0, Lcom/pymcl/runtime/process/FclJavaProcessRunner$Tail;->out:Lkotlin/jvm/functions/Function1;

    iget-object v2, p0, Lcom/pymcl/runtime/process/FclJavaProcessRunner$Tail;->buf:Ljava/lang/StringBuilder;

    const/4 v3, 0x0

    invoke-virtual {v2, v3, v0}, Ljava/lang/StringBuilder;->substring(II)Ljava/lang/String;

    move-result-object v2

    const-string v4, "substring(...)"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v4, 0x1

    new-array v4, v4, [C

    const/16 v5, 0xd

    aput-char v5, v4, v3

    invoke-static {v2, v4}, Lkotlin/text/StringsKt;->trimEnd(Ljava/lang/String;[C)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p0, Lcom/pymcl/runtime/process/FclJavaProcessRunner$Tail;->buf:Ljava/lang/StringBuilder;

    add-int/lit8 v2, v0, 0x1

    invoke-virtual {v1, v3, v2}, Ljava/lang/StringBuilder;->delete(II)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 107
    .end local v0    # "i":I
    :cond_1
    return-void

    .line 102
    :catchall_0
    move-exception v1

    :try_start_1
    throw v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :catchall_1
    move-exception v2

    invoke-static {v0, v1}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v2

    .line 101
    :cond_2
    :goto_1
    return-void
.end method
