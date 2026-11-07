.class public final Lcom/pymcl/core/net/UrlConnectionHttp;
.super Ljava/lang/Object;
.source "Http.kt"

# interfaces
.implements Lcom/pymcl/core/net/Http;


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nHttp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Http.kt\ncom/pymcl/core/net/UrlConnectionHttp\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,67:1\n221#2,2:68\n635#3,7:70\n625#3:77\n571#3:78\n610#3:83\n559#3:84\n1419#4,4:79\n1#5:85\n*S KotlinDebug\n*F\n+ 1 Http.kt\ncom/pymcl/core/net/UrlConnectionHttp\n*L\n46#1:68,2\n49#1:70,7\n49#1:77\n49#1:78\n49#1:83\n49#1:84\n49#1:79,4\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J4\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00032\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u000b2\u0006\u0010\u000c\u001a\u00020\rH\u0002J\u001c\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u000b2\u0006\u0010\u000f\u001a\u00020\u0007H\u0002J>\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0008\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00032\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u000b2\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u000c\u001a\u00020\rH\u0016JJ\u0010\u0014\u001a \u0012\u0004\u0012\u00020\r\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u000b\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\t\u001a\u00020\u00032\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u000b2\u0006\u0010\u000c\u001a\u00020\rH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"
    }
    d2 = {
        "Lcom/pymcl/core/net/UrlConnectionHttp;",
        "Lcom/pymcl/core/net/Http;",
        "userAgent",
        "",
        "<init>",
        "(Ljava/lang/String;)V",
        "open",
        "Ljava/net/HttpURLConnection;",
        "method",
        "url",
        "headers",
        "",
        "timeoutMs",
        "",
        "hdrs",
        "c",
        "request",
        "Lcom/pymcl/core/net/HttpResponse;",
        "body",
        "",
        "openStream",
        "Lkotlin/Triple;",
        "Ljava/io/InputStream;",
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
.field private final userAgent:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-direct {p0, v0, v1, v0}, Lcom/pymcl/core/net/UrlConnectionHttp;-><init>(Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 1
    .param p1, "userAgent"    # Ljava/lang/String;

    const-string v0, "userAgent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 40
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/pymcl/core/net/UrlConnectionHttp;->userAgent:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 40
    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const-string p1, "PyMCL/1.0.1"

    :cond_0
    invoke-direct {p0, p1}, Lcom/pymcl/core/net/UrlConnectionHttp;-><init>(Ljava/lang/String;)V

    return-void
.end method

.method private final hdrs(Ljava/net/HttpURLConnection;)Ljava/util/Map;
    .locals 24
    .param p1, "c"    # Ljava/net/HttpURLConnection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/net/HttpURLConnection;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 49
    invoke-virtual/range {p1 .. p1}, Ljava/net/HttpURLConnection;->getHeaderFields()Ljava/util/Map;

    move-result-object v0

    const-string v1, "getHeaderFields(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .local v0, "$this$filterKeys$iv":Ljava/util/Map;
    const/4 v1, 0x0

    .line 70
    .local v1, "$i$f$filterKeys":I
    new-instance v2, Ljava/util/LinkedHashMap;

    invoke-direct {v2}, Ljava/util/LinkedHashMap;-><init>()V

    .line 71
    .local v2, "result$iv":Ljava/util/LinkedHashMap;
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_0
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/Map$Entry;

    .line 72
    .local v4, "entry$iv":Ljava/util/Map$Entry;
    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    .local v5, "it":Ljava/lang/String;
    const/4 v6, 0x0

    .line 49
    .local v6, "$i$a$-filterKeys-UrlConnectionHttp$hdrs$1":I
    if-eqz v5, :cond_1

    const/4 v7, 0x1

    goto :goto_1

    :cond_1
    const/4 v7, 0x0

    .line 72
    .end local v5    # "it":Ljava/lang/String;
    .end local v6    # "$i$a$-filterKeys-UrlConnectionHttp$hdrs$1":I
    :goto_1
    if-eqz v7, :cond_0

    .line 73
    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v5

    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v6

    invoke-virtual {v2, v5, v6}, Ljava/util/LinkedHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 76
    .end local v4    # "entry$iv":Ljava/util/Map$Entry;
    :cond_2
    move-object v0, v2

    check-cast v0, Ljava/util/Map;

    .line 49
    .end local v0    # "$this$filterKeys$iv":Ljava/util/Map;
    .end local v1    # "$i$f$filterKeys":I
    .end local v2    # "result$iv":Ljava/util/LinkedHashMap;
    nop

    .local v0, "$this$mapKeys$iv":Ljava/util/Map;
    const/4 v1, 0x0

    .line 77
    .local v1, "$i$f$mapKeys":I
    new-instance v2, Ljava/util/LinkedHashMap;

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v3

    invoke-static {v3}, Lkotlin/collections/MapsKt;->mapCapacity(I)I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/LinkedHashMap;-><init>(I)V

    check-cast v2, Ljava/util/Map;

    .local v2, "destination$iv$iv":Ljava/util/Map;
    move-object v3, v0

    .local v3, "$this$mapKeysTo$iv$iv":Ljava/util/Map;
    const/4 v4, 0x0

    .line 78
    .local v4, "$i$f$mapKeysTo":I
    invoke-interface {v3}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v5

    check-cast v5, Ljava/lang/Iterable;

    .local v5, "$this$associateByTo$iv$iv$iv":Ljava/lang/Iterable;
    move-object v6, v2

    .local v6, "destination$iv$iv$iv":Ljava/util/Map;
    const/4 v7, 0x0

    .line 79
    .local v7, "$i$f$associateByTo":I
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_2
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_3

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    .line 80
    .local v9, "element$iv$iv$iv":Ljava/lang/Object;
    move-object v10, v9

    check-cast v10, Ljava/util/Map$Entry;

    .local v10, "it":Ljava/util/Map$Entry;
    const/4 v11, 0x0

    .line 49
    .local v11, "$i$a$-mapKeys-UrlConnectionHttp$hdrs$2":I
    invoke-interface {v10}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v12

    const-string v13, "<get-key>(...)"

    invoke-static {v12, v13}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v12, Ljava/lang/String;

    sget-object v13, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v12, v13}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v12

    const-string v13, "toLowerCase(...)"

    invoke-static {v12, v13}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 80
    .end local v10    # "it":Ljava/util/Map$Entry;
    .end local v11    # "$i$a$-mapKeys-UrlConnectionHttp$hdrs$2":I
    move-object v10, v9

    check-cast v10, Ljava/util/Map$Entry;

    .local v10, "it$iv$iv":Ljava/util/Map$Entry;
    const/4 v11, 0x0

    .line 78
    .local v11, "$i$a$-associateByTo-MapsKt__MapsKt$mapKeysTo$1$iv$iv":I
    invoke-interface {v10}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v10

    .line 80
    .end local v10    # "it$iv$iv":Ljava/util/Map$Entry;
    .end local v11    # "$i$a$-associateByTo-MapsKt__MapsKt$mapKeysTo$1$iv$iv":I
    invoke-interface {v6, v12, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    .line 82
    .end local v9    # "element$iv$iv$iv":Ljava/lang/Object;
    :cond_3
    nop

    .line 78
    .end local v5    # "$this$associateByTo$iv$iv$iv":Ljava/lang/Iterable;
    .end local v6    # "destination$iv$iv$iv":Ljava/util/Map;
    .end local v7    # "$i$f$associateByTo":I
    nop

    .line 77
    .end local v2    # "destination$iv$iv":Ljava/util/Map;
    .end local v3    # "$this$mapKeysTo$iv$iv":Ljava/util/Map;
    .end local v4    # "$i$f$mapKeysTo":I
    nop

    .line 49
    .end local v0    # "$this$mapKeys$iv":Ljava/util/Map;
    .end local v1    # "$i$f$mapKeys":I
    nop

    .local v6, "$this$mapValues$iv":Ljava/util/Map;
    const/4 v0, 0x0

    .line 83
    .local v0, "$i$f$mapValues":I
    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-interface {v6}, Ljava/util/Map;->size()I

    move-result v2

    invoke-static {v2}, Lkotlin/collections/MapsKt;->mapCapacity(I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/LinkedHashMap;-><init>(I)V

    check-cast v1, Ljava/util/Map;

    .local v1, "destination$iv$iv":Ljava/util/Map;
    move-object v2, v6

    .local v2, "$this$mapValuesTo$iv$iv":Ljava/util/Map;
    const/4 v3, 0x0

    .line 84
    .local v3, "$i$f$mapValuesTo":I
    invoke-interface {v2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v4

    check-cast v4, Ljava/lang/Iterable;

    .local v4, "$this$associateByTo$iv$iv$iv":Ljava/lang/Iterable;
    move-object v5, v1

    .local v5, "destination$iv$iv$iv":Ljava/util/Map;
    const/4 v7, 0x0

    .line 79
    .restart local v7    # "$i$f$associateByTo":I
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_3
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_4

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    .line 80
    .restart local v9    # "element$iv$iv$iv":Ljava/lang/Object;
    move-object v10, v9

    check-cast v10, Ljava/util/Map$Entry;

    .restart local v10    # "it$iv$iv":Ljava/util/Map$Entry;
    const/4 v11, 0x0

    .line 84
    .local v11, "$i$a$-associateByTo-MapsKt__MapsKt$mapValuesTo$1$iv$iv":I
    invoke-interface {v10}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v10

    .line 80
    .end local v10    # "it$iv$iv":Ljava/util/Map$Entry;
    .end local v11    # "$i$a$-associateByTo-MapsKt__MapsKt$mapValuesTo$1$iv$iv":I
    move-object v11, v9

    check-cast v11, Ljava/util/Map$Entry;

    .local v11, "it":Ljava/util/Map$Entry;
    const/4 v12, 0x0

    .line 49
    .local v12, "$i$a$-mapValues-UrlConnectionHttp$hdrs$3":I
    invoke-interface {v11}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v13

    const-string v14, "<get-value>(...)"

    invoke-static {v13, v14}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v15, v13

    check-cast v15, Ljava/lang/Iterable;

    const-string v13, ","

    move-object/from16 v16, v13

    check-cast v16, Ljava/lang/CharSequence;

    const/16 v22, 0x3e

    const/16 v23, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    invoke-static/range {v15 .. v23}, Lkotlin/collections/CollectionsKt;->joinToString$default(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v11

    .line 80
    .end local v11    # "it":Ljava/util/Map$Entry;
    .end local v12    # "$i$a$-mapValues-UrlConnectionHttp$hdrs$3":I
    invoke-interface {v5, v10, v11}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_3

    .line 82
    .end local v9    # "element$iv$iv$iv":Ljava/lang/Object;
    :cond_4
    nop

    .line 84
    .end local v4    # "$this$associateByTo$iv$iv$iv":Ljava/lang/Iterable;
    .end local v5    # "destination$iv$iv$iv":Ljava/util/Map;
    .end local v7    # "$i$f$associateByTo":I
    nop

    .line 83
    .end local v1    # "destination$iv$iv":Ljava/util/Map;
    .end local v2    # "$this$mapValuesTo$iv$iv":Ljava/util/Map;
    .end local v3    # "$i$f$mapValuesTo":I
    nop

    .line 49
    .end local v0    # "$i$f$mapValues":I
    .end local v6    # "$this$mapValues$iv":Ljava/util/Map;
    return-object v5
.end method

.method private final open(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;I)Ljava/net/HttpURLConnection;
    .locals 8
    .param p1, "method"    # Ljava/lang/String;
    .param p2, "url"    # Ljava/lang/String;
    .param p3, "headers"    # Ljava/util/Map;
    .param p4, "timeoutMs"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;I)",
            "Ljava/net/HttpURLConnection;"
        }
    .end annotation

    .line 42
    new-instance v0, Ljava/net/URL;

    invoke-direct {v0, p2}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type java.net.HttpURLConnection"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/net/HttpURLConnection;

    .line 43
    .local v0, "c":Ljava/net/HttpURLConnection;
    invoke-virtual {v0, p1}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    invoke-virtual {v0, p4}, Ljava/net/HttpURLConnection;->setConnectTimeout(I)V

    const/16 v1, 0x7530

    invoke-static {p4, v1}, Ljava/lang/Math;->max(II)I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/net/HttpURLConnection;->setReadTimeout(I)V

    .line 44
    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/net/HttpURLConnection;->setInstanceFollowRedirects(Z)V

    .line 45
    const-string v1, "User-Agent"

    iget-object v2, p0, Lcom/pymcl/core/net/UrlConnectionHttp;->userAgent:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 46
    move-object v1, p3

    .local v1, "$this$forEach$iv":Ljava/util/Map;
    const/4 v2, 0x0

    .line 68
    .local v2, "$i$f$forEach":I
    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/Map$Entry;

    .local v4, "element$iv":Ljava/util/Map$Entry;
    const/4 v5, 0x0

    .local v5, "$i$a$-forEach-UrlConnectionHttp$open$1":I
    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    .local v6, "k":Ljava/lang/String;
    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    .line 46
    .local v7, "v":Ljava/lang/String;
    invoke-virtual {v0, v6, v7}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 68
    .end local v5    # "$i$a$-forEach-UrlConnectionHttp$open$1":I
    .end local v6    # "k":Ljava/lang/String;
    .end local v7    # "v":Ljava/lang/String;
    nop

    .end local v4    # "element$iv":Ljava/util/Map$Entry;
    goto :goto_0

    .line 69
    :cond_0
    nop

    .line 47
    .end local v1    # "$this$forEach$iv":Ljava/util/Map;
    .end local v2    # "$i$f$forEach":I
    return-object v0
.end method


# virtual methods
.method public bridge get(Ljava/lang/String;Ljava/util/Map;I)Lcom/pymcl/core/net/HttpResponse;
    .locals 1
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
            "Lcom/pymcl/core/net/HttpResponse;"
        }
    .end annotation

    .line 40
    invoke-super {p0, p1, p2, p3}, Lcom/pymcl/core/net/Http;->get(Ljava/lang/String;Ljava/util/Map;I)Lcom/pymcl/core/net/HttpResponse;

    move-result-object v0

    return-object v0
.end method

.method public bridge getText(Ljava/lang/String;Ljava/util/Map;I)Ljava/lang/String;
    .locals 1
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

    .line 40
    invoke-super {p0, p1, p2, p3}, Lcom/pymcl/core/net/Http;->getText(Ljava/lang/String;Ljava/util/Map;I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public openStream(Ljava/lang/String;Ljava/util/Map;I)Lkotlin/Triple;
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
            "Lkotlin/Triple<",
            "Ljava/lang/Integer;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Ljava/io/InputStream;",
            ">;"
        }
    .end annotation

    const-string v0, "url"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "headers"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 61
    const-string v0, "GET"

    invoke-direct {p0, v0, p1, p2, p3}, Lcom/pymcl/core/net/UrlConnectionHttp;->open(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;I)Ljava/net/HttpURLConnection;

    move-result-object v0

    .line 62
    .local v0, "c":Ljava/net/HttpURLConnection;
    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result v1

    .line 63
    .local v1, "code":I
    const/16 v2, 0x190

    if-lt v1, v2, :cond_2

    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getErrorStream()Ljava/io/InputStream;

    move-result-object v2

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    check-cast v2, Ljava/io/Closeable;

    :try_start_0
    move-object v4, v2

    check-cast v4, Ljava/io/InputStream;

    .line 85
    .local v4, "it":Ljava/io/InputStream;
    const/4 v5, 0x0

    .line 63
    .local v5, "$i$a$-use-UrlConnectionHttp$openStream$e$1":I
    invoke-static {v4}, Lkotlin/io/ByteStreamsKt;->readBytes(Ljava/io/InputStream;)[B

    move-result-object v6
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .end local v4    # "it":Ljava/io/InputStream;
    .end local v5    # "$i$a$-use-UrlConnectionHttp$openStream$e$1":I
    invoke-static {v2, v3}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    move-object v3, v6

    goto :goto_0

    :catchall_0
    move-exception v3

    .end local v0    # "c":Ljava/net/HttpURLConnection;
    .end local v1    # "code":I
    .end local p1    # "url":Ljava/lang/String;
    .end local p2    # "headers":Ljava/util/Map;
    .end local p3    # "timeoutMs":I
    :try_start_1
    throw v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .restart local v0    # "c":Ljava/net/HttpURLConnection;
    .restart local v1    # "code":I
    .restart local p1    # "url":Ljava/lang/String;
    .restart local p2    # "headers":Ljava/util/Map;
    .restart local p3    # "timeoutMs":I
    :catchall_1
    move-exception v4

    invoke-static {v2, v3}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v4

    .local v3, "e":[B
    :cond_0
    :goto_0
    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->disconnect()V

    new-instance v2, Lcom/pymcl/core/net/HttpException;

    if-eqz v3, :cond_1

    new-instance v4, Ljava/lang/String;

    sget-object v5, Lkotlin/text/Charsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-direct {v4, v3, v5}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    goto :goto_1

    :cond_1
    const-string v4, ""

    :goto_1
    invoke-direct {v2, v1, p1, v4}, Lcom/pymcl/core/net/HttpException;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    throw v2

    .line 64
    .end local v3    # "e":[B
    :cond_2
    new-instance v2, Lkotlin/Triple;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-direct {p0, v0}, Lcom/pymcl/core/net/UrlConnectionHttp;->hdrs(Ljava/net/HttpURLConnection;)Ljava/util/Map;

    move-result-object v4

    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object v5

    invoke-direct {v2, v3, v4, v5}, Lkotlin/Triple;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v2
.end method

.method public bridge postForm(Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;)Lcom/pymcl/core/net/HttpResponse;
    .locals 1
    .param p1, "url"    # Ljava/lang/String;
    .param p2, "form"    # Ljava/util/Map;
    .param p3, "headers"    # Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/pymcl/core/net/HttpResponse;"
        }
    .end annotation

    .line 40
    invoke-super {p0, p1, p2, p3}, Lcom/pymcl/core/net/Http;->postForm(Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;)Lcom/pymcl/core/net/HttpResponse;

    move-result-object v0

    return-object v0
.end method

.method public bridge postJson(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lcom/pymcl/core/net/HttpResponse;
    .locals 1
    .param p1, "url"    # Ljava/lang/String;
    .param p2, "json"    # Ljava/lang/String;
    .param p3, "headers"    # Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/pymcl/core/net/HttpResponse;"
        }
    .end annotation

    .line 40
    invoke-super {p0, p1, p2, p3}, Lcom/pymcl/core/net/Http;->postJson(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lcom/pymcl/core/net/HttpResponse;

    move-result-object v0

    return-object v0
.end method

.method public request(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;[BI)Lcom/pymcl/core/net/HttpResponse;
    .locals 7
    .param p1, "method"    # Ljava/lang/String;
    .param p2, "url"    # Ljava/lang/String;
    .param p3, "headers"    # Ljava/util/Map;
    .param p4, "body"    # [B
    .param p5, "timeoutMs"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;[BI)",
            "Lcom/pymcl/core/net/HttpResponse;"
        }
    .end annotation

    const-string v0, "method"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "url"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "headers"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 52
    invoke-direct {p0, p1, p2, p3, p5}, Lcom/pymcl/core/net/UrlConnectionHttp;->open(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;I)Ljava/net/HttpURLConnection;

    move-result-object v0

    .line 53
    .local v0, "c":Ljava/net/HttpURLConnection;
    nop

    .line 54
    const/4 v1, 0x0

    if-eqz p4, :cond_0

    const/4 v2, 0x1

    :try_start_0
    invoke-virtual {v0, v2}, Ljava/net/HttpURLConnection;->setDoOutput(Z)V

    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getOutputStream()Ljava/io/OutputStream;

    move-result-object v2

    check-cast v2, Ljava/io/Closeable;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_4

    :try_start_1
    move-object v3, v2

    check-cast v3, Ljava/io/OutputStream;

    .line 85
    .local v3, "it":Ljava/io/OutputStream;
    const/4 v4, 0x0

    .line 54
    .local v4, "$i$a$-use-UrlConnectionHttp$request$1":I
    invoke-virtual {v3, p4}, Ljava/io/OutputStream;->write([B)V

    .end local v3    # "it":Ljava/io/OutputStream;
    .end local v4    # "$i$a$-use-UrlConnectionHttp$request$1":I
    sget-object v3, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    invoke-static {v2, v1}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_4

    goto :goto_0

    :catchall_0
    move-exception v1

    .end local v0    # "c":Ljava/net/HttpURLConnection;
    .end local p1    # "method":Ljava/lang/String;
    .end local p2    # "url":Ljava/lang/String;
    .end local p3    # "headers":Ljava/util/Map;
    .end local p4    # "body":[B
    .end local p5    # "timeoutMs":I
    :try_start_3
    throw v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .restart local v0    # "c":Ljava/net/HttpURLConnection;
    .restart local p1    # "method":Ljava/lang/String;
    .restart local p2    # "url":Ljava/lang/String;
    .restart local p3    # "headers":Ljava/util/Map;
    .restart local p4    # "body":[B
    .restart local p5    # "timeoutMs":I
    :catchall_1
    move-exception v3

    :try_start_4
    invoke-static {v2, v1}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .end local v0    # "c":Ljava/net/HttpURLConnection;
    .end local p1    # "method":Ljava/lang/String;
    .end local p2    # "url":Ljava/lang/String;
    .end local p3    # "headers":Ljava/util/Map;
    .end local p4    # "body":[B
    .end local p5    # "timeoutMs":I
    throw v3

    .line 55
    .restart local v0    # "c":Ljava/net/HttpURLConnection;
    .restart local p1    # "method":Ljava/lang/String;
    .restart local p2    # "url":Ljava/lang/String;
    .restart local p3    # "headers":Ljava/util/Map;
    .restart local p4    # "body":[B
    .restart local p5    # "timeoutMs":I
    :cond_0
    :goto_0
    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result v2

    .line 56
    .local v2, "code":I
    const/16 v3, 0x190

    if-lt v2, v3, :cond_1

    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getErrorStream()Ljava/io/InputStream;

    move-result-object v3

    goto :goto_1

    :cond_1
    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object v3

    :goto_1
    if-eqz v3, :cond_2

    check-cast v3, Ljava/io/Closeable;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    :try_start_5
    move-object v4, v3

    check-cast v4, Ljava/io/InputStream;

    .line 85
    .local v4, "it":Ljava/io/InputStream;
    const/4 v5, 0x0

    .line 56
    .local v5, "$i$a$-use-UrlConnectionHttp$request$data$1":I
    invoke-static {v4}, Lkotlin/io/ByteStreamsKt;->readBytes(Ljava/io/InputStream;)[B

    move-result-object v6
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .end local v4    # "it":Ljava/io/InputStream;
    .end local v5    # "$i$a$-use-UrlConnectionHttp$request$data$1":I
    :try_start_6
    invoke-static {v3, v1}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    if-nez v6, :cond_3

    goto :goto_2

    :catchall_2
    move-exception v1

    .end local v0    # "c":Ljava/net/HttpURLConnection;
    .end local v2    # "code":I
    .end local p1    # "method":Ljava/lang/String;
    .end local p2    # "url":Ljava/lang/String;
    .end local p3    # "headers":Ljava/util/Map;
    .end local p4    # "body":[B
    .end local p5    # "timeoutMs":I
    :try_start_7
    throw v1
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    .restart local v0    # "c":Ljava/net/HttpURLConnection;
    .restart local v2    # "code":I
    .restart local p1    # "method":Ljava/lang/String;
    .restart local p2    # "url":Ljava/lang/String;
    .restart local p3    # "headers":Ljava/util/Map;
    .restart local p4    # "body":[B
    .restart local p5    # "timeoutMs":I
    :catchall_3
    move-exception v4

    :try_start_8
    invoke-static {v3, v1}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .end local v0    # "c":Ljava/net/HttpURLConnection;
    .end local p1    # "method":Ljava/lang/String;
    .end local p2    # "url":Ljava/lang/String;
    .end local p3    # "headers":Ljava/util/Map;
    .end local p4    # "body":[B
    .end local p5    # "timeoutMs":I
    throw v4

    .restart local v0    # "c":Ljava/net/HttpURLConnection;
    .restart local p1    # "method":Ljava/lang/String;
    .restart local p2    # "url":Ljava/lang/String;
    .restart local p3    # "headers":Ljava/util/Map;
    .restart local p4    # "body":[B
    .restart local p5    # "timeoutMs":I
    :cond_2
    :goto_2
    const/4 v1, 0x0

    new-array v6, v1, [B

    .line 57
    .local v6, "data":[B
    :cond_3
    new-instance v1, Lcom/pymcl/core/net/HttpResponse;

    invoke-direct {p0, v0}, Lcom/pymcl/core/net/UrlConnectionHttp;->hdrs(Ljava/net/HttpURLConnection;)Ljava/util/Map;

    move-result-object v3

    invoke-direct {v1, v2, v3, v6}, Lcom/pymcl/core/net/HttpResponse;-><init>(ILjava/util/Map;[B)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_4

    .line 58
    .end local v2    # "code":I
    .end local v6    # "data":[B
    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 57
    .restart local v2    # "code":I
    .restart local v6    # "data":[B
    return-object v1

    .end local v2    # "code":I
    .end local v6    # "data":[B
    :catchall_4
    move-exception v1

    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->disconnect()V

    throw v1
.end method
