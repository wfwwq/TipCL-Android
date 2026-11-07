.class public abstract Lorg/apache/commons/io/build/AbstractStreamBuilder;
.super Lorg/apache/commons/io/build/AbstractOriginSupplier;
.source "AbstractStreamBuilder.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        "B:",
        "Lorg/apache/commons/io/build/AbstractStreamBuilder<",
        "TT;TB;>;>",
        "Lorg/apache/commons/io/build/AbstractOriginSupplier<",
        "TT;TB;>;"
    }
.end annotation


# static fields
.field private static final DEFAULT_MAX_VALUE:I = 0x7fffffff

.field private static final DEFAULT_OPEN_OPTIONS:[Ljava/nio/file/OpenOption;


# instance fields
.field private bufferSize:I

.field private bufferSizeChecker:Ljava/util/function/IntUnaryOperator;

.field private bufferSizeDefault:I

.field private bufferSizeMax:I

.field private charset:Ljava/nio/charset/Charset;

.field private charsetDefault:Ljava/nio/charset/Charset;

.field private final defaultSizeChecker:Ljava/util/function/IntUnaryOperator;

.field private openOptions:[Ljava/nio/file/OpenOption;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 44
    sget-object v0, Lorg/apache/commons/io/file/PathUtils;->EMPTY_OPEN_OPTION_ARRAY:[Ljava/nio/file/OpenOption;

    sput-object v0, Lorg/apache/commons/io/build/AbstractStreamBuilder;->DEFAULT_OPEN_OPTIONS:[Ljava/nio/file/OpenOption;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 40
    .local p0, "this":Lorg/apache/commons/io/build/AbstractStreamBuilder;, "Lorg/apache/commons/io/build/AbstractStreamBuilder<TT;TB;>;"
    invoke-direct {p0}, Lorg/apache/commons/io/build/AbstractOriginSupplier;-><init>()V

    .line 49
    const/16 v0, 0x2000

    iput v0, p0, Lorg/apache/commons/io/build/AbstractStreamBuilder;->bufferSize:I

    .line 54
    iput v0, p0, Lorg/apache/commons/io/build/AbstractStreamBuilder;->bufferSizeDefault:I

    .line 59
    const v0, 0x7fffffff

    iput v0, p0, Lorg/apache/commons/io/build/AbstractStreamBuilder;->bufferSizeMax:I

    .line 64
    invoke-static {}, Ljava/nio/charset/Charset;->defaultCharset()Ljava/nio/charset/Charset;

    move-result-object v0

    iput-object v0, p0, Lorg/apache/commons/io/build/AbstractStreamBuilder;->charset:Ljava/nio/charset/Charset;

    .line 69
    invoke-static {}, Ljava/nio/charset/Charset;->defaultCharset()Ljava/nio/charset/Charset;

    move-result-object v0

    iput-object v0, p0, Lorg/apache/commons/io/build/AbstractStreamBuilder;->charsetDefault:Ljava/nio/charset/Charset;

    .line 71
    sget-object v0, Lorg/apache/commons/io/build/AbstractStreamBuilder;->DEFAULT_OPEN_OPTIONS:[Ljava/nio/file/OpenOption;

    iput-object v0, p0, Lorg/apache/commons/io/build/AbstractStreamBuilder;->openOptions:[Ljava/nio/file/OpenOption;

    .line 76
    new-instance v0, Lorg/apache/commons/io/build/AbstractStreamBuilder$$ExternalSyntheticLambda0;

    invoke-direct {v0, p0}, Lorg/apache/commons/io/build/AbstractStreamBuilder$$ExternalSyntheticLambda0;-><init>(Lorg/apache/commons/io/build/AbstractStreamBuilder;)V

    iput-object v0, p0, Lorg/apache/commons/io/build/AbstractStreamBuilder;->defaultSizeChecker:Ljava/util/function/IntUnaryOperator;

    .line 81
    iget-object v0, p0, Lorg/apache/commons/io/build/AbstractStreamBuilder;->defaultSizeChecker:Ljava/util/function/IntUnaryOperator;

    iput-object v0, p0, Lorg/apache/commons/io/build/AbstractStreamBuilder;->bufferSizeChecker:Ljava/util/function/IntUnaryOperator;

    return-void
.end method

.method private checkBufferSize(I)I
    .locals 1
    .param p1, "size"    # I

    .line 90
    .local p0, "this":Lorg/apache/commons/io/build/AbstractStreamBuilder;, "Lorg/apache/commons/io/build/AbstractStreamBuilder<TT;TB;>;"
    iget-object v0, p0, Lorg/apache/commons/io/build/AbstractStreamBuilder;->bufferSizeChecker:Ljava/util/function/IntUnaryOperator;

    invoke-interface {v0, p1}, Ljava/util/function/IntUnaryOperator;->applyAsInt(I)I

    move-result v0

    return v0
.end method

.method private throwIae(II)I
    .locals 3
    .param p1, "size"    # I
    .param p2, "max"    # I

    .line 337
    .local p0, "this":Lorg/apache/commons/io/build/AbstractStreamBuilder;, "Lorg/apache/commons/io/build/AbstractStreamBuilder<TT;TB;>;"
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    filled-new-array {v1, v2}, [Ljava/lang/Object;

    move-result-object v1

    const-string v2, "Request %,d exceeds maximum %,d"

    invoke-static {v2, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method protected getBufferSize()I
    .locals 1

    .line 99
    .local p0, "this":Lorg/apache/commons/io/build/AbstractStreamBuilder;, "Lorg/apache/commons/io/build/AbstractStreamBuilder<TT;TB;>;"
    iget v0, p0, Lorg/apache/commons/io/build/AbstractStreamBuilder;->bufferSize:I

    return v0
.end method

.method protected getBufferSizeDefault()I
    .locals 1

    .line 108
    .local p0, "this":Lorg/apache/commons/io/build/AbstractStreamBuilder;, "Lorg/apache/commons/io/build/AbstractStreamBuilder<TT;TB;>;"
    iget v0, p0, Lorg/apache/commons/io/build/AbstractStreamBuilder;->bufferSizeDefault:I

    return v0
.end method

.method protected getCharSequence()Ljava/lang/CharSequence;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 122
    .local p0, "this":Lorg/apache/commons/io/build/AbstractStreamBuilder;, "Lorg/apache/commons/io/build/AbstractStreamBuilder<TT;TB;>;"
    invoke-virtual {p0}, Lorg/apache/commons/io/build/AbstractStreamBuilder;->checkOrigin()Lorg/apache/commons/io/build/AbstractOrigin;

    move-result-object v0

    invoke-virtual {p0}, Lorg/apache/commons/io/build/AbstractStreamBuilder;->getCharset()Ljava/nio/charset/Charset;

    move-result-object v1

    invoke-virtual {v0, v1}, Lorg/apache/commons/io/build/AbstractOrigin;->getCharSequence(Ljava/nio/charset/Charset;)Ljava/lang/CharSequence;

    move-result-object v0

    return-object v0
.end method

.method public getCharset()Ljava/nio/charset/Charset;
    .locals 1

    .line 131
    .local p0, "this":Lorg/apache/commons/io/build/AbstractStreamBuilder;, "Lorg/apache/commons/io/build/AbstractStreamBuilder<TT;TB;>;"
    iget-object v0, p0, Lorg/apache/commons/io/build/AbstractStreamBuilder;->charset:Ljava/nio/charset/Charset;

    return-object v0
.end method

.method protected getCharsetDefault()Ljava/nio/charset/Charset;
    .locals 1

    .line 140
    .local p0, "this":Lorg/apache/commons/io/build/AbstractStreamBuilder;, "Lorg/apache/commons/io/build/AbstractStreamBuilder<TT;TB;>;"
    iget-object v0, p0, Lorg/apache/commons/io/build/AbstractStreamBuilder;->charsetDefault:Ljava/nio/charset/Charset;

    return-object v0
.end method

.method protected getInputStream()Ljava/io/InputStream;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 154
    .local p0, "this":Lorg/apache/commons/io/build/AbstractStreamBuilder;, "Lorg/apache/commons/io/build/AbstractStreamBuilder<TT;TB;>;"
    invoke-virtual {p0}, Lorg/apache/commons/io/build/AbstractStreamBuilder;->checkOrigin()Lorg/apache/commons/io/build/AbstractOrigin;

    move-result-object v0

    invoke-virtual {p0}, Lorg/apache/commons/io/build/AbstractStreamBuilder;->getOpenOptions()[Ljava/nio/file/OpenOption;

    move-result-object v1

    invoke-virtual {v0, v1}, Lorg/apache/commons/io/build/AbstractOrigin;->getInputStream([Ljava/nio/file/OpenOption;)Ljava/io/InputStream;

    move-result-object v0

    return-object v0
.end method

.method protected getOpenOptions()[Ljava/nio/file/OpenOption;
    .locals 1

    .line 163
    .local p0, "this":Lorg/apache/commons/io/build/AbstractStreamBuilder;, "Lorg/apache/commons/io/build/AbstractStreamBuilder<TT;TB;>;"
    iget-object v0, p0, Lorg/apache/commons/io/build/AbstractStreamBuilder;->openOptions:[Ljava/nio/file/OpenOption;

    return-object v0
.end method

.method protected getOutputStream()Ljava/io/OutputStream;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 177
    .local p0, "this":Lorg/apache/commons/io/build/AbstractStreamBuilder;, "Lorg/apache/commons/io/build/AbstractStreamBuilder<TT;TB;>;"
    invoke-virtual {p0}, Lorg/apache/commons/io/build/AbstractStreamBuilder;->checkOrigin()Lorg/apache/commons/io/build/AbstractOrigin;

    move-result-object v0

    invoke-virtual {p0}, Lorg/apache/commons/io/build/AbstractStreamBuilder;->getOpenOptions()[Ljava/nio/file/OpenOption;

    move-result-object v1

    invoke-virtual {v0, v1}, Lorg/apache/commons/io/build/AbstractOrigin;->getOutputStream([Ljava/nio/file/OpenOption;)Ljava/io/OutputStream;

    move-result-object v0

    return-object v0
.end method

.method protected getPath()Ljava/nio/file/Path;
    .locals 1

    .line 190
    .local p0, "this":Lorg/apache/commons/io/build/AbstractStreamBuilder;, "Lorg/apache/commons/io/build/AbstractStreamBuilder<TT;TB;>;"
    invoke-virtual {p0}, Lorg/apache/commons/io/build/AbstractStreamBuilder;->checkOrigin()Lorg/apache/commons/io/build/AbstractOrigin;

    move-result-object v0

    invoke-virtual {v0}, Lorg/apache/commons/io/build/AbstractOrigin;->getPath()Ljava/nio/file/Path;

    move-result-object v0

    return-object v0
.end method

.method protected getWriter()Ljava/io/Writer;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 204
    .local p0, "this":Lorg/apache/commons/io/build/AbstractStreamBuilder;, "Lorg/apache/commons/io/build/AbstractStreamBuilder<TT;TB;>;"
    invoke-virtual {p0}, Lorg/apache/commons/io/build/AbstractStreamBuilder;->checkOrigin()Lorg/apache/commons/io/build/AbstractOrigin;

    move-result-object v0

    invoke-virtual {p0}, Lorg/apache/commons/io/build/AbstractStreamBuilder;->getCharset()Ljava/nio/charset/Charset;

    move-result-object v1

    invoke-virtual {p0}, Lorg/apache/commons/io/build/AbstractStreamBuilder;->getOpenOptions()[Ljava/nio/file/OpenOption;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/apache/commons/io/build/AbstractOrigin;->getWriter(Ljava/nio/charset/Charset;[Ljava/nio/file/OpenOption;)Ljava/io/Writer;

    move-result-object v0

    return-object v0
.end method

.method synthetic lambda$new$0$org-apache-commons-io-build-AbstractStreamBuilder(I)I
    .locals 1
    .param p1, "size"    # I

    .line 76
    .local p0, "this":Lorg/apache/commons/io/build/AbstractStreamBuilder;, "Lorg/apache/commons/io/build/AbstractStreamBuilder<TT;TB;>;"
    iget v0, p0, Lorg/apache/commons/io/build/AbstractStreamBuilder;->bufferSizeMax:I

    if-le p1, v0, :cond_0

    iget v0, p0, Lorg/apache/commons/io/build/AbstractStreamBuilder;->bufferSizeMax:I

    invoke-direct {p0, p1, v0}, Lorg/apache/commons/io/build/AbstractStreamBuilder;->throwIae(II)I

    move-result v0

    goto :goto_0

    :cond_0
    move v0, p1

    :goto_0
    return v0
.end method

.method public setBufferSize(I)Lorg/apache/commons/io/build/AbstractStreamBuilder;
    .locals 1
    .param p1, "bufferSize"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TB;"
        }
    .end annotation

    .line 217
    .local p0, "this":Lorg/apache/commons/io/build/AbstractStreamBuilder;, "Lorg/apache/commons/io/build/AbstractStreamBuilder<TT;TB;>;"
    if-lez p1, :cond_0

    move v0, p1

    goto :goto_0

    :cond_0
    iget v0, p0, Lorg/apache/commons/io/build/AbstractStreamBuilder;->bufferSizeDefault:I

    :goto_0
    invoke-direct {p0, v0}, Lorg/apache/commons/io/build/AbstractStreamBuilder;->checkBufferSize(I)I

    move-result v0

    iput v0, p0, Lorg/apache/commons/io/build/AbstractStreamBuilder;->bufferSize:I

    .line 218
    invoke-virtual {p0}, Lorg/apache/commons/io/build/AbstractStreamBuilder;->asThis()Lorg/apache/commons/io/build/AbstractSupplier;

    move-result-object v0

    check-cast v0, Lorg/apache/commons/io/build/AbstractStreamBuilder;

    return-object v0
.end method

.method public setBufferSize(Ljava/lang/Integer;)Lorg/apache/commons/io/build/AbstractStreamBuilder;
    .locals 1
    .param p1, "bufferSize"    # Ljava/lang/Integer;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Integer;",
            ")TB;"
        }
    .end annotation

    .line 231
    .local p0, "this":Lorg/apache/commons/io/build/AbstractStreamBuilder;, "Lorg/apache/commons/io/build/AbstractStreamBuilder<TT;TB;>;"
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v0

    goto :goto_0

    :cond_0
    iget v0, p0, Lorg/apache/commons/io/build/AbstractStreamBuilder;->bufferSizeDefault:I

    :goto_0
    invoke-virtual {p0, v0}, Lorg/apache/commons/io/build/AbstractStreamBuilder;->setBufferSize(I)Lorg/apache/commons/io/build/AbstractStreamBuilder;

    .line 232
    invoke-virtual {p0}, Lorg/apache/commons/io/build/AbstractStreamBuilder;->asThis()Lorg/apache/commons/io/build/AbstractSupplier;

    move-result-object v0

    check-cast v0, Lorg/apache/commons/io/build/AbstractStreamBuilder;

    return-object v0
.end method

.method public setBufferSizeChecker(Ljava/util/function/IntUnaryOperator;)Lorg/apache/commons/io/build/AbstractStreamBuilder;
    .locals 1
    .param p1, "bufferSizeChecker"    # Ljava/util/function/IntUnaryOperator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/function/IntUnaryOperator;",
            ")TB;"
        }
    .end annotation

    .line 243
    .local p0, "this":Lorg/apache/commons/io/build/AbstractStreamBuilder;, "Lorg/apache/commons/io/build/AbstractStreamBuilder<TT;TB;>;"
    if-eqz p1, :cond_0

    move-object v0, p1

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lorg/apache/commons/io/build/AbstractStreamBuilder;->defaultSizeChecker:Ljava/util/function/IntUnaryOperator;

    :goto_0
    iput-object v0, p0, Lorg/apache/commons/io/build/AbstractStreamBuilder;->bufferSizeChecker:Ljava/util/function/IntUnaryOperator;

    .line 244
    invoke-virtual {p0}, Lorg/apache/commons/io/build/AbstractStreamBuilder;->asThis()Lorg/apache/commons/io/build/AbstractSupplier;

    move-result-object v0

    check-cast v0, Lorg/apache/commons/io/build/AbstractStreamBuilder;

    return-object v0
.end method

.method protected setBufferSizeDefault(I)Lorg/apache/commons/io/build/AbstractStreamBuilder;
    .locals 1
    .param p1, "bufferSizeDefault"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TB;"
        }
    .end annotation

    .line 257
    .local p0, "this":Lorg/apache/commons/io/build/AbstractStreamBuilder;, "Lorg/apache/commons/io/build/AbstractStreamBuilder<TT;TB;>;"
    iput p1, p0, Lorg/apache/commons/io/build/AbstractStreamBuilder;->bufferSizeDefault:I

    .line 258
    invoke-virtual {p0}, Lorg/apache/commons/io/build/AbstractStreamBuilder;->asThis()Lorg/apache/commons/io/build/AbstractSupplier;

    move-result-object v0

    check-cast v0, Lorg/apache/commons/io/build/AbstractStreamBuilder;

    return-object v0
.end method

.method public setBufferSizeMax(I)Lorg/apache/commons/io/build/AbstractStreamBuilder;
    .locals 1
    .param p1, "bufferSizeMax"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TB;"
        }
    .end annotation

    .line 270
    .local p0, "this":Lorg/apache/commons/io/build/AbstractStreamBuilder;, "Lorg/apache/commons/io/build/AbstractStreamBuilder<TT;TB;>;"
    if-lez p1, :cond_0

    move v0, p1

    goto :goto_0

    :cond_0
    const v0, 0x7fffffff

    :goto_0
    iput v0, p0, Lorg/apache/commons/io/build/AbstractStreamBuilder;->bufferSizeMax:I

    .line 271
    invoke-virtual {p0}, Lorg/apache/commons/io/build/AbstractStreamBuilder;->asThis()Lorg/apache/commons/io/build/AbstractSupplier;

    move-result-object v0

    check-cast v0, Lorg/apache/commons/io/build/AbstractStreamBuilder;

    return-object v0
.end method

.method public setCharset(Ljava/lang/String;)Lorg/apache/commons/io/build/AbstractStreamBuilder;
    .locals 1
    .param p1, "charset"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")TB;"
        }
    .end annotation

    .line 298
    .local p0, "this":Lorg/apache/commons/io/build/AbstractStreamBuilder;, "Lorg/apache/commons/io/build/AbstractStreamBuilder<TT;TB;>;"
    iget-object v0, p0, Lorg/apache/commons/io/build/AbstractStreamBuilder;->charsetDefault:Ljava/nio/charset/Charset;

    invoke-static {p1, v0}, Lorg/apache/commons/io/Charsets;->toCharset(Ljava/lang/String;Ljava/nio/charset/Charset;)Ljava/nio/charset/Charset;

    move-result-object v0

    invoke-virtual {p0, v0}, Lorg/apache/commons/io/build/AbstractStreamBuilder;->setCharset(Ljava/nio/charset/Charset;)Lorg/apache/commons/io/build/AbstractStreamBuilder;

    move-result-object v0

    return-object v0
.end method

.method public setCharset(Ljava/nio/charset/Charset;)Lorg/apache/commons/io/build/AbstractStreamBuilder;
    .locals 1
    .param p1, "charset"    # Ljava/nio/charset/Charset;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/nio/charset/Charset;",
            ")TB;"
        }
    .end annotation

    .line 284
    .local p0, "this":Lorg/apache/commons/io/build/AbstractStreamBuilder;, "Lorg/apache/commons/io/build/AbstractStreamBuilder<TT;TB;>;"
    iget-object v0, p0, Lorg/apache/commons/io/build/AbstractStreamBuilder;->charsetDefault:Ljava/nio/charset/Charset;

    invoke-static {p1, v0}, Lorg/apache/commons/io/Charsets;->toCharset(Ljava/nio/charset/Charset;Ljava/nio/charset/Charset;)Ljava/nio/charset/Charset;

    move-result-object v0

    iput-object v0, p0, Lorg/apache/commons/io/build/AbstractStreamBuilder;->charset:Ljava/nio/charset/Charset;

    .line 285
    invoke-virtual {p0}, Lorg/apache/commons/io/build/AbstractStreamBuilder;->asThis()Lorg/apache/commons/io/build/AbstractSupplier;

    move-result-object v0

    check-cast v0, Lorg/apache/commons/io/build/AbstractStreamBuilder;

    return-object v0
.end method

.method protected setCharsetDefault(Ljava/nio/charset/Charset;)Lorg/apache/commons/io/build/AbstractStreamBuilder;
    .locals 1
    .param p1, "defaultCharset"    # Ljava/nio/charset/Charset;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/nio/charset/Charset;",
            ")TB;"
        }
    .end annotation

    .line 311
    .local p0, "this":Lorg/apache/commons/io/build/AbstractStreamBuilder;, "Lorg/apache/commons/io/build/AbstractStreamBuilder<TT;TB;>;"
    iput-object p1, p0, Lorg/apache/commons/io/build/AbstractStreamBuilder;->charsetDefault:Ljava/nio/charset/Charset;

    .line 312
    invoke-virtual {p0}, Lorg/apache/commons/io/build/AbstractStreamBuilder;->asThis()Lorg/apache/commons/io/build/AbstractSupplier;

    move-result-object v0

    check-cast v0, Lorg/apache/commons/io/build/AbstractStreamBuilder;

    return-object v0
.end method

.method public varargs setOpenOptions([Ljava/nio/file/OpenOption;)Lorg/apache/commons/io/build/AbstractStreamBuilder;
    .locals 1
    .param p1, "openOptions"    # [Ljava/nio/file/OpenOption;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Ljava/nio/file/OpenOption;",
            ")TB;"
        }
    .end annotation

    .line 332
    .local p0, "this":Lorg/apache/commons/io/build/AbstractStreamBuilder;, "Lorg/apache/commons/io/build/AbstractStreamBuilder<TT;TB;>;"
    if-eqz p1, :cond_0

    move-object v0, p1

    goto :goto_0

    :cond_0
    sget-object v0, Lorg/apache/commons/io/build/AbstractStreamBuilder;->DEFAULT_OPEN_OPTIONS:[Ljava/nio/file/OpenOption;

    :goto_0
    iput-object v0, p0, Lorg/apache/commons/io/build/AbstractStreamBuilder;->openOptions:[Ljava/nio/file/OpenOption;

    .line 333
    invoke-virtual {p0}, Lorg/apache/commons/io/build/AbstractStreamBuilder;->asThis()Lorg/apache/commons/io/build/AbstractSupplier;

    move-result-object v0

    check-cast v0, Lorg/apache/commons/io/build/AbstractStreamBuilder;

    return-object v0
.end method
