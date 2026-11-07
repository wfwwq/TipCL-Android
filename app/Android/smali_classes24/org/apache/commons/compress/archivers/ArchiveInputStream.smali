.class public abstract Lorg/apache/commons/compress/archivers/ArchiveInputStream;
.super Ljava/io/FilterInputStream;
.source "ArchiveInputStream.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E::",
        "Lorg/apache/commons/compress/archivers/ArchiveEntry;",
        ">",
        "Ljava/io/FilterInputStream;"
    }
.end annotation


# static fields
.field private static final BYTE_MASK:I = 0xff


# instance fields
.field private bytesRead:J

.field private charset:Ljava/nio/charset/Charset;

.field private final single:[B


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 62
    .local p0, "this":Lorg/apache/commons/compress/archivers/ArchiveInputStream;, "Lorg/apache/commons/compress/archivers/ArchiveInputStream<TE;>;"
    sget-object v0, Lorg/apache/commons/io/input/NullInputStream;->INSTANCE:Lorg/apache/commons/io/input/NullInputStream;

    invoke-static {}, Ljava/nio/charset/Charset;->defaultCharset()Ljava/nio/charset/Charset;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lorg/apache/commons/compress/archivers/ArchiveInputStream;-><init>(Ljava/io/InputStream;Ljava/nio/charset/Charset;)V

    .line 63
    return-void
.end method

.method protected constructor <init>(Ljava/io/InputStream;Ljava/lang/String;)V
    .locals 1
    .param p1, "inputStream"    # Ljava/io/InputStream;
    .param p2, "charsetName"    # Ljava/lang/String;

    .line 86
    .local p0, "this":Lorg/apache/commons/compress/archivers/ArchiveInputStream;, "Lorg/apache/commons/compress/archivers/ArchiveInputStream<TE;>;"
    invoke-static {p2}, Lorg/apache/commons/io/Charsets;->toCharset(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lorg/apache/commons/compress/archivers/ArchiveInputStream;-><init>(Ljava/io/InputStream;Ljava/nio/charset/Charset;)V

    .line 87
    return-void
.end method

.method private constructor <init>(Ljava/io/InputStream;Ljava/nio/charset/Charset;)V
    .locals 1
    .param p1, "inputStream"    # Ljava/io/InputStream;
    .param p2, "charset"    # Ljava/nio/charset/Charset;

    .line 74
    .local p0, "this":Lorg/apache/commons/compress/archivers/ArchiveInputStream;, "Lorg/apache/commons/compress/archivers/ArchiveInputStream<TE;>;"
    invoke-direct {p0, p1}, Ljava/io/FilterInputStream;-><init>(Ljava/io/InputStream;)V

    .line 51
    const/4 v0, 0x1

    new-array v0, v0, [B

    iput-object v0, p0, Lorg/apache/commons/compress/archivers/ArchiveInputStream;->single:[B

    .line 75
    invoke-static {p2}, Lorg/apache/commons/io/Charsets;->toCharset(Ljava/nio/charset/Charset;)Ljava/nio/charset/Charset;

    move-result-object v0

    iput-object v0, p0, Lorg/apache/commons/compress/archivers/ArchiveInputStream;->charset:Ljava/nio/charset/Charset;

    .line 76
    return-void
.end method


# virtual methods
.method public canReadEntryData(Lorg/apache/commons/compress/archivers/ArchiveEntry;)Z
    .locals 1
    .param p1, "archiveEntry"    # Lorg/apache/commons/compress/archivers/ArchiveEntry;

    .line 101
    .local p0, "this":Lorg/apache/commons/compress/archivers/ArchiveInputStream;, "Lorg/apache/commons/compress/archivers/ArchiveInputStream<TE;>;"
    const/4 v0, 0x1

    return v0
.end method

.method protected count(I)V
    .locals 2
    .param p1, "read"    # I

    .line 110
    .local p0, "this":Lorg/apache/commons/compress/archivers/ArchiveInputStream;, "Lorg/apache/commons/compress/archivers/ArchiveInputStream<TE;>;"
    int-to-long v0, p1

    invoke-virtual {p0, v0, v1}, Lorg/apache/commons/compress/archivers/ArchiveInputStream;->count(J)V

    .line 111
    return-void
.end method

.method protected count(J)V
    .locals 2
    .param p1, "read"    # J

    .line 120
    .local p0, "this":Lorg/apache/commons/compress/archivers/ArchiveInputStream;, "Lorg/apache/commons/compress/archivers/ArchiveInputStream<TE;>;"
    const-wide/16 v0, -0x1

    cmp-long v0, p1, v0

    if-eqz v0, :cond_0

    .line 121
    iget-wide v0, p0, Lorg/apache/commons/compress/archivers/ArchiveInputStream;->bytesRead:J

    add-long/2addr v0, p1

    iput-wide v0, p0, Lorg/apache/commons/compress/archivers/ArchiveInputStream;->bytesRead:J

    .line 123
    :cond_0
    return-void
.end method

.method public getBytesRead()J
    .locals 2

    .line 132
    .local p0, "this":Lorg/apache/commons/compress/archivers/ArchiveInputStream;, "Lorg/apache/commons/compress/archivers/ArchiveInputStream<TE;>;"
    iget-wide v0, p0, Lorg/apache/commons/compress/archivers/ArchiveInputStream;->bytesRead:J

    return-wide v0
.end method

.method public getCharset()Ljava/nio/charset/Charset;
    .locals 1

    .line 141
    .local p0, "this":Lorg/apache/commons/compress/archivers/ArchiveInputStream;, "Lorg/apache/commons/compress/archivers/ArchiveInputStream<TE;>;"
    iget-object v0, p0, Lorg/apache/commons/compress/archivers/ArchiveInputStream;->charset:Ljava/nio/charset/Charset;

    return-object v0
.end method

.method public getCount()I
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 152
    .local p0, "this":Lorg/apache/commons/compress/archivers/ArchiveInputStream;, "Lorg/apache/commons/compress/archivers/ArchiveInputStream<TE;>;"
    iget-wide v0, p0, Lorg/apache/commons/compress/archivers/ArchiveInputStream;->bytesRead:J

    long-to-int v0, v0

    return v0
.end method

.method public abstract getNextEntry()Lorg/apache/commons/compress/archivers/ArchiveEntry;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TE;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation
.end method

.method protected pushedBackBytes(J)V
    .locals 2
    .param p1, "pushedBack"    # J

    .line 170
    .local p0, "this":Lorg/apache/commons/compress/archivers/ArchiveInputStream;, "Lorg/apache/commons/compress/archivers/ArchiveInputStream<TE;>;"
    iget-wide v0, p0, Lorg/apache/commons/compress/archivers/ArchiveInputStream;->bytesRead:J

    sub-long/2addr v0, p1

    iput-wide v0, p0, Lorg/apache/commons/compress/archivers/ArchiveInputStream;->bytesRead:J

    .line 171
    return-void
.end method

.method public read()I
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 185
    .local p0, "this":Lorg/apache/commons/compress/archivers/ArchiveInputStream;, "Lorg/apache/commons/compress/archivers/ArchiveInputStream<TE;>;"
    iget-object v0, p0, Lorg/apache/commons/compress/archivers/ArchiveInputStream;->single:[B

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-virtual {p0, v0, v2, v1}, Lorg/apache/commons/compress/archivers/ArchiveInputStream;->read([BII)I

    move-result v0

    .line 186
    .local v0, "num":I
    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lorg/apache/commons/compress/archivers/ArchiveInputStream;->single:[B

    aget-byte v1, v1, v2

    and-int/lit16 v1, v1, 0xff

    :goto_0
    return v1
.end method
