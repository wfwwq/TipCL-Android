.class public final Lcom/pymcl/ai/UrlConnectionMcpHttp;
.super Ljava/lang/Object;
.source "Mcp.kt"

# interfaces
.implements Lcom/pymcl/ai/McpHttp;


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nMcp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Mcp.kt\ncom/pymcl/ai/UrlConnectionMcpHttp\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,552:1\n221#2,2:553\n1#3:555\n635#4,7:556\n625#4:563\n571#4:564\n610#4:569\n559#4:570\n1419#5,4:565\n*S KotlinDebug\n*F\n+ 1 Mcp.kt\ncom/pymcl/ai/UrlConnectionMcpHttp\n*L\n26#1:553,2\n30#1:556,7\n30#1:563\n30#1:564\n30#1:569\n30#1:570\n30#1:565,4\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010$\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J>\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\u00072\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\n2\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u000c\u001a\u00020\rH\u0016\u00a8\u0006\u000e"
    }
    d2 = {
        "Lcom/pymcl/ai/UrlConnectionMcpHttp;",
        "Lcom/pymcl/ai/McpHttp;",
        "<init>",
        "()V",
        "request",
        "Lcom/pymcl/ai/McpHttp$Resp;",
        "method",
        "",
        "url",
        "headers",
        "",
        "body",
        "timeoutMs",
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


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public request(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;I)Lcom/pymcl/ai/McpHttp$Resp;
    .locals 21
    .param p1, "method"    # Ljava/lang/String;
    .param p2, "url"    # Ljava/lang/String;
    .param p3, "headers"    # Ljava/util/Map;
    .param p4, "body"    # Ljava/lang/String;
    .param p5, "timeoutMs"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            "I)",
            "Lcom/pymcl/ai/McpHttp$Resp;"
        }
    .end annotation

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p4

    const-string v0, "method"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "url"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "headers"

    move-object/from16 v4, p3

    invoke-static {v4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    new-instance v0, Ljava/net/URL;

    invoke-direct {v0, v2}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v0

    const-string v5, "null cannot be cast to non-null type java.net.HttpURLConnection"

    invoke-static {v0, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/net/HttpURLConnection;

    move-object v5, v0

    .local v5, "$this$request_u24lambda_u240":Ljava/net/HttpURLConnection;
    const/4 v6, 0x0

    .line 25
    .local v6, "$i$a$-apply-UrlConnectionMcpHttp$request$c$1":I
    invoke-virtual {v5, v1}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    const/16 v7, 0x3a98

    invoke-virtual {v5, v7}, Ljava/net/HttpURLConnection;->setConnectTimeout(I)V

    move/from16 v7, p5

    invoke-virtual {v5, v7}, Ljava/net/HttpURLConnection;->setReadTimeout(I)V

    const/4 v8, 0x1

    invoke-virtual {v5, v8}, Ljava/net/HttpURLConnection;->setInstanceFollowRedirects(Z)V

    .line 26
    const-string v9, "User-Agent"

    const-string v10, "PyMCL/1.0.1"

    invoke-virtual {v5, v9, v10}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    move-object/from16 v9, p3

    .local v9, "$this$forEach$iv":Ljava/util/Map;
    const/4 v10, 0x0

    .line 553
    .local v10, "$i$f$forEach":I
    invoke-interface {v9}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v11

    invoke-interface {v11}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :goto_0
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_0

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/util/Map$Entry;

    .local v12, "element$iv":Ljava/util/Map$Entry;
    const/4 v13, 0x0

    .local v13, "$i$a$-forEach-UrlConnectionMcpHttp$request$c$1$1":I
    invoke-interface {v12}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ljava/lang/String;

    .local v14, "k":Ljava/lang/String;
    invoke-interface {v12}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Ljava/lang/String;

    .line 26
    .local v15, "v":Ljava/lang/String;
    invoke-virtual {v5, v14, v15}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 553
    .end local v13    # "$i$a$-forEach-UrlConnectionMcpHttp$request$c$1$1":I
    .end local v14    # "k":Ljava/lang/String;
    .end local v15    # "v":Ljava/lang/String;
    nop

    .end local v12    # "element$iv":Ljava/util/Map$Entry;
    goto :goto_0

    .line 554
    :cond_0
    nop

    .line 27
    .end local v9    # "$this$forEach$iv":Ljava/util/Map;
    .end local v10    # "$i$f$forEach":I
    nop

    .line 24
    .end local v5    # "$this$request_u24lambda_u240":Ljava/net/HttpURLConnection;
    .end local v6    # "$i$a$-apply-UrlConnectionMcpHttp$request$c$1":I
    move-object v5, v0

    .line 28
    .local v5, "c":Ljava/net/HttpURLConnection;
    if-eqz v3, :cond_1

    invoke-virtual {v5, v8}, Ljava/net/HttpURLConnection;->setDoOutput(Z)V

    const-string v0, "Content-Type"

    const-string v6, "application/json"

    invoke-virtual {v5, v0, v6}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v5}, Ljava/net/HttpURLConnection;->getOutputStream()Ljava/io/OutputStream;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Ljava/io/Closeable;

    :try_start_0
    move-object v0, v6

    check-cast v0, Ljava/io/OutputStream;

    .line 555
    .local v0, "it":Ljava/io/OutputStream;
    const/4 v9, 0x0

    .line 28
    .local v9, "$i$a$-use-UrlConnectionMcpHttp$request$1":I
    sget-object v10, Lkotlin/text/Charsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {v3, v10}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v10

    const-string v11, "getBytes(...)"

    invoke-static {v10, v11}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v10}, Ljava/io/OutputStream;->write([B)V

    .end local v0    # "it":Ljava/io/OutputStream;
    .end local v9    # "$i$a$-use-UrlConnectionMcpHttp$request$1":I
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v0, 0x0

    invoke-static {v6, v0}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    goto :goto_1

    :catchall_0
    move-exception v0

    move-object v8, v0

    .end local v5    # "c":Ljava/net/HttpURLConnection;
    .end local p1    # "method":Ljava/lang/String;
    .end local p2    # "url":Ljava/lang/String;
    .end local p3    # "headers":Ljava/util/Map;
    .end local p4    # "body":Ljava/lang/String;
    .end local p5    # "timeoutMs":I
    :try_start_1
    throw v8
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .restart local v5    # "c":Ljava/net/HttpURLConnection;
    .restart local p1    # "method":Ljava/lang/String;
    .restart local p2    # "url":Ljava/lang/String;
    .restart local p3    # "headers":Ljava/util/Map;
    .restart local p4    # "body":Ljava/lang/String;
    .restart local p5    # "timeoutMs":I
    :catchall_1
    move-exception v0

    invoke-static {v6, v8}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v0

    .line 29
    :cond_1
    :goto_1
    invoke-virtual {v5}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result v0

    .line 30
    .local v0, "code":I
    invoke-virtual {v5}, Ljava/net/HttpURLConnection;->getHeaderFields()Ljava/util/Map;

    move-result-object v6

    const-string v9, "getHeaderFields(...)"

    invoke-static {v6, v9}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .local v6, "$this$filterKeys$iv":Ljava/util/Map;
    const/4 v9, 0x0

    .line 556
    .local v9, "$i$f$filterKeys":I
    new-instance v10, Ljava/util/LinkedHashMap;

    invoke-direct {v10}, Ljava/util/LinkedHashMap;-><init>()V

    .line 557
    .local v10, "result$iv":Ljava/util/LinkedHashMap;
    invoke-interface {v6}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v11

    invoke-interface {v11}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :cond_2
    :goto_2
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_4

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/util/Map$Entry;

    .line 558
    .local v12, "entry$iv":Ljava/util/Map$Entry;
    invoke-interface {v12}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ljava/lang/String;

    .local v14, "it":Ljava/lang/String;
    const/4 v15, 0x0

    .line 30
    .local v15, "$i$a$-filterKeys-UrlConnectionMcpHttp$request$hs$1":I
    if-eqz v14, :cond_3

    move v13, v8

    goto :goto_3

    :cond_3
    const/4 v13, 0x0

    .line 558
    .end local v14    # "it":Ljava/lang/String;
    .end local v15    # "$i$a$-filterKeys-UrlConnectionMcpHttp$request$hs$1":I
    :goto_3
    if-eqz v13, :cond_2

    .line 559
    invoke-interface {v12}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v13

    invoke-interface {v12}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v14

    invoke-virtual {v10, v13, v14}, Ljava/util/LinkedHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    .line 562
    .end local v12    # "entry$iv":Ljava/util/Map$Entry;
    :cond_4
    move-object v6, v10

    check-cast v6, Ljava/util/Map;

    .line 30
    .end local v6    # "$this$filterKeys$iv":Ljava/util/Map;
    .end local v9    # "$i$f$filterKeys":I
    .end local v10    # "result$iv":Ljava/util/LinkedHashMap;
    nop

    .local v6, "$this$mapKeys$iv":Ljava/util/Map;
    const/4 v9, 0x0

    .line 563
    .local v9, "$i$f$mapKeys":I
    new-instance v10, Ljava/util/LinkedHashMap;

    invoke-interface {v6}, Ljava/util/Map;->size()I

    move-result v11

    invoke-static {v11}, Lkotlin/collections/MapsKt;->mapCapacity(I)I

    move-result v11

    invoke-direct {v10, v11}, Ljava/util/LinkedHashMap;-><init>(I)V

    check-cast v10, Ljava/util/Map;

    .local v10, "destination$iv$iv":Ljava/util/Map;
    move-object v11, v6

    .local v11, "$this$mapKeysTo$iv$iv":Ljava/util/Map;
    const/4 v12, 0x0

    .line 564
    .local v12, "$i$f$mapKeysTo":I
    invoke-interface {v11}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v14

    check-cast v14, Ljava/lang/Iterable;

    .local v14, "$this$associateByTo$iv$iv$iv":Ljava/lang/Iterable;
    move-object v15, v10

    .local v15, "destination$iv$iv$iv":Ljava/util/Map;
    const/16 v16, 0x0

    .line 565
    .local v16, "$i$f$associateByTo":I
    invoke-interface {v14}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v17

    :goto_4
    invoke-interface/range {v17 .. v17}, Ljava/util/Iterator;->hasNext()Z

    move-result v18

    if-eqz v18, :cond_5

    invoke-interface/range {v17 .. v17}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v18

    .line 566
    .local v18, "element$iv$iv$iv":Ljava/lang/Object;
    move-object/from16 v19, v18

    check-cast v19, Ljava/util/Map$Entry;

    .local v19, "it":Ljava/util/Map$Entry;
    const/16 v20, 0x0

    .line 30
    .local v20, "$i$a$-mapKeys-UrlConnectionMcpHttp$request$hs$2":I
    invoke-interface/range {v19 .. v19}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v8

    const-string v13, "<get-key>(...)"

    invoke-static {v8, v13}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v8, Ljava/lang/String;

    sget-object v13, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v8, v13}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v8

    const-string v13, "toLowerCase(...)"

    invoke-static {v8, v13}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 566
    .end local v19    # "it":Ljava/util/Map$Entry;
    .end local v20    # "$i$a$-mapKeys-UrlConnectionMcpHttp$request$hs$2":I
    move-object/from16 v13, v18

    check-cast v13, Ljava/util/Map$Entry;

    .local v13, "it$iv$iv":Ljava/util/Map$Entry;
    const/16 v19, 0x0

    .line 564
    .local v19, "$i$a$-associateByTo-MapsKt__MapsKt$mapKeysTo$1$iv$iv":I
    invoke-interface {v13}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v13

    .line 566
    .end local v13    # "it$iv$iv":Ljava/util/Map$Entry;
    .end local v19    # "$i$a$-associateByTo-MapsKt__MapsKt$mapKeysTo$1$iv$iv":I
    invoke-interface {v15, v8, v13}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v8, 0x1

    goto :goto_4

    .line 568
    .end local v18    # "element$iv$iv$iv":Ljava/lang/Object;
    :cond_5
    nop

    .line 564
    .end local v14    # "$this$associateByTo$iv$iv$iv":Ljava/lang/Iterable;
    .end local v15    # "destination$iv$iv$iv":Ljava/util/Map;
    .end local v16    # "$i$f$associateByTo":I
    nop

    .line 563
    .end local v10    # "destination$iv$iv":Ljava/util/Map;
    .end local v11    # "$this$mapKeysTo$iv$iv":Ljava/util/Map;
    .end local v12    # "$i$f$mapKeysTo":I
    nop

    .line 30
    .end local v6    # "$this$mapKeys$iv":Ljava/util/Map;
    .end local v9    # "$i$f$mapKeys":I
    nop

    .local v15, "$this$mapValues$iv":Ljava/util/Map;
    const/4 v6, 0x0

    .line 569
    .local v6, "$i$f$mapValues":I
    new-instance v8, Ljava/util/LinkedHashMap;

    invoke-interface {v15}, Ljava/util/Map;->size()I

    move-result v9

    invoke-static {v9}, Lkotlin/collections/MapsKt;->mapCapacity(I)I

    move-result v9

    invoke-direct {v8, v9}, Ljava/util/LinkedHashMap;-><init>(I)V

    check-cast v8, Ljava/util/Map;

    .local v8, "destination$iv$iv":Ljava/util/Map;
    move-object v9, v15

    .local v9, "$this$mapValuesTo$iv$iv":Ljava/util/Map;
    const/4 v10, 0x0

    .line 570
    .local v10, "$i$f$mapValuesTo":I
    invoke-interface {v9}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v11

    check-cast v11, Ljava/lang/Iterable;

    .local v11, "$this$associateByTo$iv$iv$iv":Ljava/lang/Iterable;
    move-object v12, v8

    .local v12, "destination$iv$iv$iv":Ljava/util/Map;
    const/4 v13, 0x0

    .line 565
    .local v13, "$i$f$associateByTo":I
    invoke-interface {v11}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v14

    :goto_5
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    move-result v16

    const-string v17, ""

    if-eqz v16, :cond_7

    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v16

    .line 566
    .local v16, "element$iv$iv$iv":Ljava/lang/Object;
    move-object/from16 v18, v16

    check-cast v18, Ljava/util/Map$Entry;

    .local v18, "it$iv$iv":Ljava/util/Map$Entry;
    const/16 v19, 0x0

    .line 570
    .local v19, "$i$a$-associateByTo-MapsKt__MapsKt$mapValuesTo$1$iv$iv":I
    invoke-interface/range {v18 .. v18}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    .line 566
    .end local v18    # "it$iv$iv":Ljava/util/Map$Entry;
    .end local v19    # "$i$a$-associateByTo-MapsKt__MapsKt$mapValuesTo$1$iv$iv":I
    move-object/from16 v18, v16

    check-cast v18, Ljava/util/Map$Entry;

    .local v18, "it":Ljava/util/Map$Entry;
    const/16 v19, 0x0

    .line 30
    .local v19, "$i$a$-mapValues-UrlConnectionMcpHttp$request$hs$3":I
    invoke-interface/range {v18 .. v18}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    const-string v3, "<get-value>(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Ljava/util/List;

    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    if-nez v2, :cond_6

    move-object/from16 v2, v17

    .line 566
    .end local v18    # "it":Ljava/util/Map$Entry;
    .end local v19    # "$i$a$-mapValues-UrlConnectionMcpHttp$request$hs$3":I
    :cond_6
    invoke-interface {v12, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p4

    goto :goto_5

    .line 568
    .end local v16    # "element$iv$iv$iv":Ljava/lang/Object;
    :cond_7
    nop

    .line 570
    .end local v11    # "$this$associateByTo$iv$iv$iv":Ljava/lang/Iterable;
    .end local v12    # "destination$iv$iv$iv":Ljava/util/Map;
    .end local v13    # "$i$f$associateByTo":I
    nop

    .line 569
    .end local v8    # "destination$iv$iv":Ljava/util/Map;
    .end local v9    # "$this$mapValuesTo$iv$iv":Ljava/util/Map;
    .end local v10    # "$i$f$mapValuesTo":I
    nop

    .line 30
    .end local v6    # "$i$f$mapValues":I
    .end local v15    # "$this$mapValues$iv":Ljava/util/Map;
    nop

    .line 31
    .local v12, "hs":Ljava/util/Map;
    const/16 v1, 0xc8

    if-gt v1, v0, :cond_8

    const/16 v1, 0x12c

    if-ge v0, v1, :cond_8

    const/4 v8, 0x1

    goto :goto_6

    :cond_8
    const/4 v8, 0x0

    :goto_6
    if-eqz v8, :cond_9

    :goto_7
    invoke-virtual {v5}, Ljava/net/HttpURLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object v1

    goto :goto_8

    :cond_9
    invoke-virtual {v5}, Ljava/net/HttpURLConnection;->getErrorStream()Ljava/io/InputStream;

    move-result-object v1

    if-nez v1, :cond_a

    goto :goto_7

    .line 32
    .local v1, "stream":Ljava/io/InputStream;
    :cond_a
    :goto_8
    new-instance v2, Ljava/io/BufferedReader;

    new-instance v3, Ljava/io/InputStreamReader;

    sget-object v6, Lkotlin/text/Charsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-direct {v3, v1, v6}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/nio/charset/Charset;)V

    check-cast v3, Ljava/io/Reader;

    invoke-direct {v2, v3}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    .line 33
    .local v2, "r":Ljava/io/BufferedReader;
    new-instance v3, Lcom/pymcl/ai/McpHttp$Resp;

    invoke-virtual {v5}, Ljava/net/HttpURLConnection;->getContentType()Ljava/lang/String;

    move-result-object v6

    if-nez v6, :cond_b

    move-object/from16 v6, v17

    :cond_b
    new-instance v8, Lcom/pymcl/ai/UrlConnectionMcpHttp$request$2;

    invoke-direct {v8, v2, v5}, Lcom/pymcl/ai/UrlConnectionMcpHttp$request$2;-><init>(Ljava/io/BufferedReader;Ljava/net/HttpURLConnection;)V

    check-cast v8, Lcom/pymcl/ai/AiLineStream;

    invoke-direct {v3, v0, v12, v6, v8}, Lcom/pymcl/ai/McpHttp$Resp;-><init>(ILjava/util/Map;Ljava/lang/String;Lcom/pymcl/ai/AiLineStream;)V

    return-object v3
.end method
