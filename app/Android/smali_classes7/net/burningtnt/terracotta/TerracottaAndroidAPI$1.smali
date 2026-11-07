.class Lnet/burningtnt/terracotta/TerracottaAndroidAPI$1;
.super Ljava/io/InputStream;
.source "TerracottaAndroidAPI.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lnet/burningtnt/terracotta/TerracottaAndroidAPI;->collectLogs()Ljava/io/Reader;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field private final closed:Ljava/util/concurrent/atomic/AtomicBoolean;

.field final synthetic val$file:Ljava/io/RandomAccessFile;

.field final synthetic val$ptr:J


# direct methods
.method constructor <init>(Ljava/io/RandomAccessFile;J)V
    .locals 0

    .line 325
    iput-object p1, p0, Lnet/burningtnt/terracotta/TerracottaAndroidAPI$1;->val$file:Ljava/io/RandomAccessFile;

    iput-wide p2, p0, Lnet/burningtnt/terracotta/TerracottaAndroidAPI$1;->val$ptr:J

    invoke-direct {p0}, Ljava/io/InputStream;-><init>()V

    .line 326
    new-instance p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 p2, 0x0

    invoke-direct {p1, p2}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object p1, p0, Lnet/burningtnt/terracotta/TerracottaAndroidAPI$1;->closed:Ljava/util/concurrent/atomic/AtomicBoolean;

    return-void
.end method

.method private assertOpen()V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 365
    iget-object v0, p0, Lnet/burningtnt/terracotta/TerracottaAndroidAPI$1;->closed:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-nez v0, :cond_0

    .line 368
    return-void

    .line 366
    :cond_0
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Stream has already been closed"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private cleanup()V
    .locals 3

    .line 371
    iget-object v0, p0, Lnet/burningtnt/terracotta/TerracottaAndroidAPI$1;->closed:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 372
    iget-wide v0, p0, Lnet/burningtnt/terracotta/TerracottaAndroidAPI$1;->val$ptr:J

    invoke-static {v0, v1}, Lnet/burningtnt/terracotta/TerracottaAndroidAPI;->-$$Nest$smfinishExportLogs0(J)V

    .line 374
    :cond_0
    return-void
.end method


# virtual methods
.method public available()I
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 348
    invoke-direct {p0}, Lnet/burningtnt/terracotta/TerracottaAndroidAPI$1;->assertOpen()V

    .line 349
    iget-object v0, p0, Lnet/burningtnt/terracotta/TerracottaAndroidAPI$1;->val$file:Ljava/io/RandomAccessFile;

    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->length()J

    move-result-wide v0

    iget-object v2, p0, Lnet/burningtnt/terracotta/TerracottaAndroidAPI$1;->val$file:Ljava/io/RandomAccessFile;

    invoke-virtual {v2}, Ljava/io/RandomAccessFile;->getFilePointer()J

    move-result-wide v2

    sub-long/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->toIntExact(J)I

    move-result v0

    return v0
.end method

.method public close()V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 354
    invoke-super {p0}, Ljava/io/InputStream;->close()V

    .line 355
    invoke-direct {p0}, Lnet/burningtnt/terracotta/TerracottaAndroidAPI$1;->cleanup()V

    .line 356
    return-void
.end method

.method protected finalize()V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    .line 360
    invoke-super {p0}, Ljava/lang/Object;->finalize()V

    .line 361
    invoke-direct {p0}, Lnet/burningtnt/terracotta/TerracottaAndroidAPI$1;->cleanup()V

    .line 362
    return-void
.end method

.method public read()I
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 330
    invoke-direct {p0}, Lnet/burningtnt/terracotta/TerracottaAndroidAPI$1;->assertOpen()V

    .line 331
    iget-object v0, p0, Lnet/burningtnt/terracotta/TerracottaAndroidAPI$1;->val$file:Ljava/io/RandomAccessFile;

    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->read()I

    move-result v0

    return v0
.end method

.method public read([B)I
    .locals 1
    .param p1, "b"    # [B
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 336
    invoke-direct {p0}, Lnet/burningtnt/terracotta/TerracottaAndroidAPI$1;->assertOpen()V

    .line 337
    iget-object v0, p0, Lnet/burningtnt/terracotta/TerracottaAndroidAPI$1;->val$file:Ljava/io/RandomAccessFile;

    invoke-virtual {v0, p1}, Ljava/io/RandomAccessFile;->read([B)I

    move-result v0

    return v0
.end method

.method public read([BII)I
    .locals 1
    .param p1, "b"    # [B
    .param p2, "off"    # I
    .param p3, "len"    # I
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 342
    invoke-direct {p0}, Lnet/burningtnt/terracotta/TerracottaAndroidAPI$1;->assertOpen()V

    .line 343
    iget-object v0, p0, Lnet/burningtnt/terracotta/TerracottaAndroidAPI$1;->val$file:Ljava/io/RandomAccessFile;

    invoke-virtual {v0, p1, p2, p3}, Ljava/io/RandomAccessFile;->read([BII)I

    move-result v0

    return v0
.end method
