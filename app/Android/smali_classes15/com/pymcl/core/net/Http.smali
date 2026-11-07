.class public interface abstract Lcom/pymcl/core/net/Http;
.super Ljava/lang/Object;
.source "Http.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/pymcl/core/net/Http$Companion;,
        Lcom/pymcl/core/net/Http$DefaultImpls;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008f\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016JD\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0014\u0008\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00082\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u000cH&JN\u0010\r\u001a \u0012\u0004\u0012\u00020\u000c\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0008\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0006\u001a\u00020\u00052\u0014\u0008\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00082\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u000cH&J0\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0014\u0008\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00082\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u000cH\u0016J0\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0014\u0008\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00082\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u000cH\u0016J.\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00052\u0014\u0008\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0008H\u0016J:\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00082\u0014\u0008\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0008H\u0016\u00a8\u0006\u0017\u00c0\u0006\u0003"
    }
    d2 = {
        "Lcom/pymcl/core/net/Http;",
        "",
        "request",
        "Lcom/pymcl/core/net/HttpResponse;",
        "method",
        "",
        "url",
        "headers",
        "",
        "body",
        "",
        "timeoutMs",
        "",
        "openStream",
        "Lkotlin/Triple;",
        "Ljava/io/InputStream;",
        "get",
        "getText",
        "postJson",
        "json",
        "postForm",
        "form",
        "Companion",
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


# static fields
.field public static final Companion:Lcom/pymcl/core/net/Http$Companion;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lcom/pymcl/core/net/Http$Companion;->$$INSTANCE:Lcom/pymcl/core/net/Http$Companion;

    sput-object v0, Lcom/pymcl/core/net/Http;->Companion:Lcom/pymcl/core/net/Http$Companion;

    return-void
.end method

.method public static synthetic access$get$jd(Lcom/pymcl/core/net/Http;Ljava/lang/String;Ljava/util/Map;I)Lcom/pymcl/core/net/HttpResponse;
    .locals 1
    .param p0, "$this"    # Lcom/pymcl/core/net/Http;
    .param p1, "url"    # Ljava/lang/String;
    .param p2, "headers"    # Ljava/util/Map;
    .param p3, "timeoutMs"    # I

    .line 19
    invoke-super {p0, p1, p2, p3}, Lcom/pymcl/core/net/Http;->get(Ljava/lang/String;Ljava/util/Map;I)Lcom/pymcl/core/net/HttpResponse;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic access$getText$jd(Lcom/pymcl/core/net/Http;Ljava/lang/String;Ljava/util/Map;I)Ljava/lang/String;
    .locals 1
    .param p0, "$this"    # Lcom/pymcl/core/net/Http;
    .param p1, "url"    # Ljava/lang/String;
    .param p2, "headers"    # Ljava/util/Map;
    .param p3, "timeoutMs"    # I

    .line 19
    invoke-super {p0, p1, p2, p3}, Lcom/pymcl/core/net/Http;->getText(Ljava/lang/String;Ljava/util/Map;I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic access$postForm$jd(Lcom/pymcl/core/net/Http;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;)Lcom/pymcl/core/net/HttpResponse;
    .locals 1
    .param p0, "$this"    # Lcom/pymcl/core/net/Http;
    .param p1, "url"    # Ljava/lang/String;
    .param p2, "form"    # Ljava/util/Map;
    .param p3, "headers"    # Ljava/util/Map;

    .line 19
    invoke-super {p0, p1, p2, p3}, Lcom/pymcl/core/net/Http;->postForm(Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;)Lcom/pymcl/core/net/HttpResponse;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic access$postJson$jd(Lcom/pymcl/core/net/Http;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lcom/pymcl/core/net/HttpResponse;
    .locals 1
    .param p0, "$this"    # Lcom/pymcl/core/net/Http;
    .param p1, "url"    # Ljava/lang/String;
    .param p2, "json"    # Ljava/lang/String;
    .param p3, "headers"    # Ljava/util/Map;

    .line 19
    invoke-super {p0, p1, p2, p3}, Lcom/pymcl/core/net/Http;->postJson(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lcom/pymcl/core/net/HttpResponse;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic get$default(Lcom/pymcl/core/net/Http;Ljava/lang/String;Ljava/util/Map;IILjava/lang/Object;)Lcom/pymcl/core/net/HttpResponse;
    .locals 0

    .line 24
    if-nez p5, :cond_2

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    move-result-object p2

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    const/16 p3, 0x3a98

    :cond_1
    invoke-interface {p0, p1, p2, p3}, Lcom/pymcl/core/net/Http;->get(Ljava/lang/String;Ljava/util/Map;I)Lcom/pymcl/core/net/HttpResponse;

    move-result-object p0

    return-object p0

    :cond_2
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: get"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static synthetic getText$default(Lcom/pymcl/core/net/Http;Ljava/lang/String;Ljava/util/Map;IILjava/lang/Object;)Ljava/lang/String;
    .locals 0

    .line 25
    if-nez p5, :cond_2

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    move-result-object p2

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    const/16 p3, 0x3a98

    :cond_1
    invoke-interface {p0, p1, p2, p3}, Lcom/pymcl/core/net/Http;->getText(Ljava/lang/String;Ljava/util/Map;I)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_2
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: getText"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static synthetic openStream$default(Lcom/pymcl/core/net/Http;Ljava/lang/String;Ljava/util/Map;IILjava/lang/Object;)Lkotlin/Triple;
    .locals 0

    .line 22
    if-nez p5, :cond_2

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    move-result-object p2

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    const/16 p3, 0x3a98

    :cond_1
    invoke-interface {p0, p1, p2, p3}, Lcom/pymcl/core/net/Http;->openStream(Ljava/lang/String;Ljava/util/Map;I)Lkotlin/Triple;

    move-result-object p0

    return-object p0

    :cond_2
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: openStream"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static synthetic postForm$default(Lcom/pymcl/core/net/Http;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;ILjava/lang/Object;)Lcom/pymcl/core/net/HttpResponse;
    .locals 0

    .line 30
    if-nez p5, :cond_1

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    move-result-object p3

    :cond_0
    invoke-interface {p0, p1, p2, p3}, Lcom/pymcl/core/net/Http;->postForm(Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;)Lcom/pymcl/core/net/HttpResponse;

    move-result-object p0

    return-object p0

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: postForm"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static synthetic postJson$default(Lcom/pymcl/core/net/Http;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILjava/lang/Object;)Lcom/pymcl/core/net/HttpResponse;
    .locals 0

    .line 28
    if-nez p5, :cond_1

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    move-result-object p3

    :cond_0
    invoke-interface {p0, p1, p2, p3}, Lcom/pymcl/core/net/Http;->postJson(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lcom/pymcl/core/net/HttpResponse;

    move-result-object p0

    return-object p0

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: postJson"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static synthetic request$default(Lcom/pymcl/core/net/Http;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;[BIILjava/lang/Object;)Lcom/pymcl/core/net/HttpResponse;
    .locals 6

    .line 20
    if-nez p7, :cond_3

    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_0

    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    move-result-object p3

    :cond_0
    move-object v3, p3

    and-int/lit8 p3, p6, 0x8

    if-eqz p3, :cond_1

    const/4 p4, 0x0

    :cond_1
    move-object v4, p4

    and-int/lit8 p3, p6, 0x10

    if-eqz p3, :cond_2

    const/16 p5, 0x3a98

    :cond_2
    move v5, p5

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    invoke-interface/range {v0 .. v5}, Lcom/pymcl/core/net/Http;->request(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;[BI)Lcom/pymcl/core/net/HttpResponse;

    move-result-object p0

    return-object p0

    :cond_3
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: request"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public get(Ljava/lang/String;Ljava/util/Map;I)Lcom/pymcl/core/net/HttpResponse;
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
            "Lcom/pymcl/core/net/HttpResponse;"
        }
    .end annotation

    const-string v0, "url"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "headers"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    const-string v2, "GET"

    const/4 v5, 0x0

    move-object v1, p0

    move-object v3, p1

    move-object v4, p2

    move v6, p3

    .end local p1    # "url":Ljava/lang/String;
    .end local p2    # "headers":Ljava/util/Map;
    .end local p3    # "timeoutMs":I
    .local v3, "url":Ljava/lang/String;
    .local v4, "headers":Ljava/util/Map;
    .local v6, "timeoutMs":I
    invoke-interface/range {v1 .. v6}, Lcom/pymcl/core/net/Http;->request(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;[BI)Lcom/pymcl/core/net/HttpResponse;

    move-result-object p1

    return-object p1
.end method

.method public getText(Ljava/lang/String;Ljava/util/Map;I)Ljava/lang/String;
    .locals 4
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

    .line 26
    invoke-interface {p0, p1, p2, p3}, Lcom/pymcl/core/net/Http;->get(Ljava/lang/String;Ljava/util/Map;I)Lcom/pymcl/core/net/HttpResponse;

    move-result-object v0

    .local v0, "r":Lcom/pymcl/core/net/HttpResponse;
    invoke-virtual {v0}, Lcom/pymcl/core/net/HttpResponse;->getOk()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lcom/pymcl/core/net/HttpResponse;->getText()Ljava/lang/String;

    move-result-object v1

    return-object v1

    :cond_0
    new-instance v1, Lcom/pymcl/core/net/HttpException;

    invoke-virtual {v0}, Lcom/pymcl/core/net/HttpResponse;->getCode()I

    move-result v2

    invoke-virtual {v0}, Lcom/pymcl/core/net/HttpResponse;->getText()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, v2, p1, v3}, Lcom/pymcl/core/net/HttpException;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    throw v1
.end method

.method public abstract openStream(Ljava/lang/String;Ljava/util/Map;I)Lkotlin/Triple;
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
.end method

.method public postForm(Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;)Lcom/pymcl/core/net/HttpResponse;
    .locals 9
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

    const-string v0, "url"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "form"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "headers"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 31
    const-string v0, "Content-Type"

    const-string v1, "application/x-www-form-urlencoded"

    invoke-static {v0, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    invoke-static {v0}, Lkotlin/collections/MapsKt;->mapOf(Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v0

    invoke-static {p3, v0}, Lkotlin/collections/MapsKt;->plus(Ljava/util/Map;Ljava/util/Map;)Ljava/util/Map;

    move-result-object v4

    sget-object v0, Lcom/pymcl/core/net/Http;->Companion:Lcom/pymcl/core/net/Http$Companion;

    invoke-virtual {v0, p2}, Lcom/pymcl/core/net/Http$Companion;->formEncode(Ljava/util/Map;)Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lkotlin/text/Charsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {v0, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v5

    const-string v0, "getBytes(...)"

    invoke-static {v5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v7, 0x10

    const/4 v8, 0x0

    const-string v2, "POST"

    const/4 v6, 0x0

    move-object v1, p0

    move-object v3, p1

    .end local p1    # "url":Ljava/lang/String;
    .local v3, "url":Ljava/lang/String;
    invoke-static/range {v1 .. v8}, Lcom/pymcl/core/net/Http;->request$default(Lcom/pymcl/core/net/Http;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;[BIILjava/lang/Object;)Lcom/pymcl/core/net/HttpResponse;

    move-result-object p1

    return-object p1
.end method

.method public postJson(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lcom/pymcl/core/net/HttpResponse;
    .locals 9
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

    const-string v0, "url"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "json"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "headers"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    const/4 v0, 0x2

    new-array v0, v0, [Lkotlin/Pair;

    const-string v1, "Content-Type"

    const-string v2, "application/json"

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v3, 0x0

    aput-object v1, v0, v3

    const-string v1, "Accept"

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    invoke-static {v0}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v0

    invoke-static {p3, v0}, Lkotlin/collections/MapsKt;->plus(Ljava/util/Map;Ljava/util/Map;)Ljava/util/Map;

    move-result-object v4

    sget-object v0, Lkotlin/text/Charsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {p2, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v5

    const-string v0, "getBytes(...)"

    invoke-static {v5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v7, 0x10

    const/4 v8, 0x0

    const-string v2, "POST"

    const/4 v6, 0x0

    move-object v1, p0

    move-object v3, p1

    .end local p1    # "url":Ljava/lang/String;
    .local v3, "url":Ljava/lang/String;
    invoke-static/range {v1 .. v8}, Lcom/pymcl/core/net/Http;->request$default(Lcom/pymcl/core/net/Http;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;[BIILjava/lang/Object;)Lcom/pymcl/core/net/HttpResponse;

    move-result-object p1

    return-object p1
.end method

.method public abstract request(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;[BI)Lcom/pymcl/core/net/HttpResponse;
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
.end method
