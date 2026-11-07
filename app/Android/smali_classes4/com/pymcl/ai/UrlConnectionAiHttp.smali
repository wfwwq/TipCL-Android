.class public final Lcom/pymcl/ai/UrlConnectionAiHttp;
.super Ljava/lang/Object;
.source "Transport.kt"

# interfaces
.implements Lcom/pymcl/ai/AiHttp;


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nTransport.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transport.kt\ncom/pymcl/ai/UrlConnectionAiHttp\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,67:1\n221#2,2:68\n1#3:70\n*S KotlinDebug\n*F\n+ 1 Transport.kt\ncom/pymcl/ai/UrlConnectionAiHttp\n*L\n30#1:68,2\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J<\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\u00072\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\n2\u0006\u0010\u000b\u001a\u00020\u000c2\u0006\u0010\r\u001a\u00020\u000cH\u0002J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0007H\u0002J\u0010\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0005H\u0002J<\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0006\u001a\u00020\u00072\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\n2\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u000c2\u0006\u0010\u0016\u001a\u00020\u000cH\u0016J4\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00072\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\n2\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u000cH\u0016J,\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00072\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\n2\u0006\u0010\u0018\u001a\u00020\u000cH\u0016\u00a8\u0006\u001a"
    }
    d2 = {
        "Lcom/pymcl/ai/UrlConnectionAiHttp;",
        "Lcom/pymcl/ai/AiHttp;",
        "<init>",
        "()V",
        "open",
        "Ljava/net/HttpURLConnection;",
        "url",
        "",
        "method",
        "headers",
        "",
        "cto",
        "",
        "rto",
        "send",
        "",
        "c",
        "body",
        "check",
        "postStream",
        "Lcom/pymcl/ai/AiLineStream;",
        "connectTimeoutMs",
        "readTimeoutMs",
        "post",
        "timeoutMs",
        "get",
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


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final check(Ljava/net/HttpURLConnection;)V
    .locals 6
    .param p1, "c"    # Ljava/net/HttpURLConnection;

    .line 40
    invoke-virtual {p1}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result v0

    .line 41
    .local v0, "code":I
    const/16 v1, 0xc8

    const/4 v2, 0x0

    if-gt v1, v0, :cond_0

    const/16 v1, 0x12c

    if-ge v0, v1, :cond_0

    const/4 v2, 0x1

    :cond_0
    if-nez v2, :cond_3

    .line 42
    :try_start_0
    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object v1, p0

    check-cast v1, Lcom/pymcl/ai/UrlConnectionAiHttp;

    .line 70
    .local v1, "$this$check_u24lambda_u240":Lcom/pymcl/ai/UrlConnectionAiHttp;
    const/4 v2, 0x0

    .line 42
    .local v2, "$i$a$-runCatching-UrlConnectionAiHttp$check$err$1":I
    invoke-virtual {p1}, Ljava/net/HttpURLConnection;->getErrorStream()Ljava/io/InputStream;

    move-result-object v3

    if-nez v3, :cond_1

    invoke-virtual {p1}, Ljava/net/HttpURLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object v3

    :cond_1
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-static {v3}, Lkotlin/io/ByteStreamsKt;->readBytes(Ljava/io/InputStream;)[B

    move-result-object v3

    sget-object v4, Lkotlin/text/Charsets;->UTF_8:Ljava/nio/charset/Charset;

    new-instance v5, Ljava/lang/String;

    invoke-direct {v5, v3, v4}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .end local v1    # "$this$check_u24lambda_u240":Lcom/pymcl/ai/UrlConnectionAiHttp;
    .end local v2    # "$i$a$-runCatching-UrlConnectionAiHttp$check$err$1":I
    invoke-static {v5}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v1

    sget-object v2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    :goto_0
    invoke-static {v1}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    const-string v1, ""

    :cond_2
    check-cast v1, Ljava/lang/String;

    .line 43
    .local v1, "err":Ljava/lang/String;
    invoke-virtual {p1}, Ljava/net/HttpURLConnection;->disconnect()V

    new-instance v2, Lcom/pymcl/ai/AiHttpException;

    invoke-direct {v2, v0, v1}, Lcom/pymcl/ai/AiHttpException;-><init>(ILjava/lang/String;)V

    throw v2

    .line 45
    .end local v1    # "err":Ljava/lang/String;
    :cond_3
    return-void
.end method

.method private final open(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;II)Ljava/net/HttpURLConnection;
    .locals 10
    .param p1, "url"    # Ljava/lang/String;
    .param p2, "method"    # Ljava/lang/String;
    .param p3, "headers"    # Ljava/util/Map;
    .param p4, "cto"    # I
    .param p5, "rto"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;II)",
            "Ljava/net/HttpURLConnection;"
        }
    .end annotation

    .line 27
    new-instance v0, Ljava/net/URL;

    invoke-direct {v0, p1}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type java.net.HttpURLConnection"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/net/HttpURLConnection;

    move-object v1, v0

    .local v1, "$this$open_u24lambda_u240":Ljava/net/HttpURLConnection;
    const/4 v2, 0x0

    .line 28
    .local v2, "$i$a$-apply-UrlConnectionAiHttp$open$1":I
    invoke-virtual {v1, p2}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    invoke-virtual {v1, p4}, Ljava/net/HttpURLConnection;->setConnectTimeout(I)V

    invoke-virtual {v1, p5}, Ljava/net/HttpURLConnection;->setReadTimeout(I)V

    const/4 v3, 0x1

    invoke-virtual {v1, v3}, Ljava/net/HttpURLConnection;->setInstanceFollowRedirects(Z)V

    .line 29
    const-string v3, "User-Agent"

    const-string v4, "PyMCL/1.0.1"

    invoke-virtual {v1, v3, v4}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 30
    move-object v3, p3

    .local v3, "$this$forEach$iv":Ljava/util/Map;
    const/4 v4, 0x0

    .line 68
    .local v4, "$i$f$forEach":I
    invoke-interface {v3}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_0

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/Map$Entry;

    .local v6, "element$iv":Ljava/util/Map$Entry;
    const/4 v7, 0x0

    .local v7, "$i$a$-forEach-UrlConnectionAiHttp$open$1$1":I
    invoke-interface {v6}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/String;

    .local v8, "k":Ljava/lang/String;
    invoke-interface {v6}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/String;

    .line 30
    .local v9, "v":Ljava/lang/String;
    invoke-virtual {v1, v8, v9}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 68
    .end local v7    # "$i$a$-forEach-UrlConnectionAiHttp$open$1$1":I
    .end local v8    # "k":Ljava/lang/String;
    .end local v9    # "v":Ljava/lang/String;
    nop

    .end local v6    # "element$iv":Ljava/util/Map$Entry;
    goto :goto_0

    .line 69
    :cond_0
    nop

    .line 31
    .end local v3    # "$this$forEach$iv":Ljava/util/Map;
    .end local v4    # "$i$f$forEach":I
    nop

    .line 27
    .end local v1    # "$this$open_u24lambda_u240":Ljava/net/HttpURLConnection;
    .end local v2    # "$i$a$-apply-UrlConnectionAiHttp$open$1":I
    nop

    .line 31
    return-object v0
.end method

.method private final send(Ljava/net/HttpURLConnection;Ljava/lang/String;)V
    .locals 5
    .param p1, "c"    # Ljava/net/HttpURLConnection;
    .param p2, "body"    # Ljava/lang/String;

    .line 34
    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Ljava/net/HttpURLConnection;->setDoOutput(Z)V

    .line 35
    const-string v0, "Content-Type"

    const-string v1, "application/json; charset=utf-8"

    invoke-virtual {p1, v0, v1}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 36
    invoke-virtual {p1}, Ljava/net/HttpURLConnection;->getOutputStream()Ljava/io/OutputStream;

    move-result-object v0

    check-cast v0, Ljava/io/Closeable;

    :try_start_0
    move-object v1, v0

    check-cast v1, Ljava/io/OutputStream;

    .line 70
    .local v1, "it":Ljava/io/OutputStream;
    const/4 v2, 0x0

    .line 36
    .local v2, "$i$a$-use-UrlConnectionAiHttp$send$1":I
    sget-object v3, Lkotlin/text/Charsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {p2, v3}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v3

    const-string v4, "getBytes(...)"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v3}, Ljava/io/OutputStream;->write([B)V

    .end local v1    # "it":Ljava/io/OutputStream;
    .end local v2    # "$i$a$-use-UrlConnectionAiHttp$send$1":I
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 37
    return-void

    .line 36
    :catchall_0
    move-exception v1

    .end local p1    # "c":Ljava/net/HttpURLConnection;
    .end local p2    # "body":Ljava/lang/String;
    :try_start_1
    throw v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .restart local p1    # "c":Ljava/net/HttpURLConnection;
    .restart local p2    # "body":Ljava/lang/String;
    :catchall_1
    move-exception v2

    invoke-static {v0, v1}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v2
.end method


# virtual methods
.method public get(Ljava/lang/String;Ljava/util/Map;I)Ljava/lang/String;
    .locals 7
    .param p1, "url"    # Ljava/lang/String;
    .param p2, "headers"    # Ljava/util/Map;
    .param p3, "timeoutMs"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;I)",
            "Ljava/lang/String;"
        }
    .end annotation

    const-string v0, "url"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "headers"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 63
    const-string v3, "GET"

    move v6, p3

    move-object v1, p0

    move-object v2, p1

    move-object v4, p2

    move v5, p3

    .end local p1    # "url":Ljava/lang/String;
    .end local p2    # "headers":Ljava/util/Map;
    .end local p3    # "timeoutMs":I
    .local v2, "url":Ljava/lang/String;
    .local v4, "headers":Ljava/util/Map;
    .local v5, "timeoutMs":I
    invoke-direct/range {v1 .. v6}, Lcom/pymcl/ai/UrlConnectionAiHttp;->open(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;II)Ljava/net/HttpURLConnection;

    move-result-object p1

    .line 64
    .local p1, "c":Ljava/net/HttpURLConnection;
    :try_start_0
    invoke-direct {p0, p1}, Lcom/pymcl/ai/UrlConnectionAiHttp;->check(Ljava/net/HttpURLConnection;)V

    invoke-virtual {p1}, Ljava/net/HttpURLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object p2

    const-string p3, "getInputStream(...)"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2}, Lkotlin/io/ByteStreamsKt;->readBytes(Ljava/io/InputStream;)[B

    move-result-object p2

    sget-object p3, Lkotlin/text/Charsets;->UTF_8:Ljava/nio/charset/Charset;

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, p2, p3}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p1}, Ljava/net/HttpURLConnection;->disconnect()V

    return-object v0

    :catchall_0
    move-exception v0

    move-object p2, v0

    invoke-virtual {p1}, Ljava/net/HttpURLConnection;->disconnect()V

    throw p2
.end method

.method public post(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;I)Ljava/lang/String;
    .locals 7
    .param p1, "url"    # Ljava/lang/String;
    .param p2, "headers"    # Ljava/util/Map;
    .param p3, "body"    # Ljava/lang/String;
    .param p4, "timeoutMs"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            "I)",
            "Ljava/lang/String;"
        }
    .end annotation

    const-string v0, "url"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "headers"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "body"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 58
    const-string v3, "POST"

    const/16 v5, 0x3a98

    move-object v1, p0

    move-object v2, p1

    move-object v4, p2

    move v6, p4

    .end local p1    # "url":Ljava/lang/String;
    .end local p2    # "headers":Ljava/util/Map;
    .end local p4    # "timeoutMs":I
    .local v2, "url":Ljava/lang/String;
    .local v4, "headers":Ljava/util/Map;
    .local v6, "timeoutMs":I
    invoke-direct/range {v1 .. v6}, Lcom/pymcl/ai/UrlConnectionAiHttp;->open(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;II)Ljava/net/HttpURLConnection;

    move-result-object p1

    .line 59
    .local p1, "c":Ljava/net/HttpURLConnection;
    :try_start_0
    invoke-direct {p0, p1, p3}, Lcom/pymcl/ai/UrlConnectionAiHttp;->send(Ljava/net/HttpURLConnection;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lcom/pymcl/ai/UrlConnectionAiHttp;->check(Ljava/net/HttpURLConnection;)V

    invoke-virtual {p1}, Ljava/net/HttpURLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object p2

    const-string p4, "getInputStream(...)"

    invoke-static {p2, p4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2}, Lkotlin/io/ByteStreamsKt;->readBytes(Ljava/io/InputStream;)[B

    move-result-object p2

    sget-object p4, Lkotlin/text/Charsets;->UTF_8:Ljava/nio/charset/Charset;

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, p2, p4}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p1}, Ljava/net/HttpURLConnection;->disconnect()V

    return-object v0

    :catchall_0
    move-exception v0

    move-object p2, v0

    invoke-virtual {p1}, Ljava/net/HttpURLConnection;->disconnect()V

    throw p2
.end method

.method public postStream(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;II)Lcom/pymcl/ai/AiLineStream;
    .locals 7
    .param p1, "url"    # Ljava/lang/String;
    .param p2, "headers"    # Ljava/util/Map;
    .param p3, "body"    # Ljava/lang/String;
    .param p4, "connectTimeoutMs"    # I
    .param p5, "readTimeoutMs"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            "II)",
            "Lcom/pymcl/ai/AiLineStream;"
        }
    .end annotation

    const-string v0, "url"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "headers"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "body"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 48
    const-string v0, "Accept"

    const-string v1, "text/event-stream"

    invoke-static {v0, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    invoke-static {p2, v0}, Lkotlin/collections/MapsKt;->plus(Ljava/util/Map;Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v4

    const-string v3, "POST"

    move-object v1, p0

    move-object v2, p1

    move v5, p4

    move v6, p5

    .end local p1    # "url":Ljava/lang/String;
    .end local p4    # "connectTimeoutMs":I
    .end local p5    # "readTimeoutMs":I
    .local v2, "url":Ljava/lang/String;
    .local v5, "connectTimeoutMs":I
    .local v6, "readTimeoutMs":I
    invoke-direct/range {v1 .. v6}, Lcom/pymcl/ai/UrlConnectionAiHttp;->open(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;II)Ljava/net/HttpURLConnection;

    move-result-object p1

    .line 49
    .local p1, "c":Ljava/net/HttpURLConnection;
    invoke-direct {p0, p1, p3}, Lcom/pymcl/ai/UrlConnectionAiHttp;->send(Ljava/net/HttpURLConnection;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lcom/pymcl/ai/UrlConnectionAiHttp;->check(Ljava/net/HttpURLConnection;)V

    .line 50
    new-instance p4, Ljava/io/BufferedReader;

    new-instance p5, Ljava/io/InputStreamReader;

    invoke-virtual {p1}, Ljava/net/HttpURLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object v0

    sget-object v3, Lkotlin/text/Charsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-direct {p5, v0, v3}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/nio/charset/Charset;)V

    check-cast p5, Ljava/io/Reader;

    invoke-direct {p4, p5}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    .line 51
    .local p4, "r":Ljava/io/BufferedReader;
    new-instance p5, Lcom/pymcl/ai/UrlConnectionAiHttp$postStream$1;

    invoke-direct {p5, p4, p1}, Lcom/pymcl/ai/UrlConnectionAiHttp$postStream$1;-><init>(Ljava/io/BufferedReader;Ljava/net/HttpURLConnection;)V

    check-cast p5, Lcom/pymcl/ai/AiLineStream;

    return-object p5
.end method
