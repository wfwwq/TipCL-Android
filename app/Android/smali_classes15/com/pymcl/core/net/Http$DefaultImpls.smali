.class public final Lcom/pymcl/core/net/Http$DefaultImpls;
.super Ljava/lang/Object;
.source "Http.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/pymcl/core/net/Http;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "DefaultImpls"
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x4,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static get(Lcom/pymcl/core/net/Http;Ljava/lang/String;Ljava/util/Map;I)Lcom/pymcl/core/net/HttpResponse;
    .locals 1
    .param p0, "$this"    # Lcom/pymcl/core/net/Http;
    .param p1, "url"    # Ljava/lang/String;
    .param p2, "headers"    # Ljava/util/Map;
    .param p3, "timeoutMs"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/pymcl/core/net/Http;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;I)",
            "Lcom/pymcl/core/net/HttpResponse;"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "url"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "headers"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    invoke-static {p0, p1, p2, p3}, Lcom/pymcl/core/net/Http;->access$get$jd(Lcom/pymcl/core/net/Http;Ljava/lang/String;Ljava/util/Map;I)Lcom/pymcl/core/net/HttpResponse;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic get$default(Lcom/pymcl/core/net/Http;Ljava/lang/String;Ljava/util/Map;IILjava/lang/Object;)Lcom/pymcl/core/net/HttpResponse;
    .locals 0

    .line 24
    invoke-static/range {p0 .. p5}, Lcom/pymcl/core/net/Http;->get$default(Lcom/pymcl/core/net/Http;Ljava/lang/String;Ljava/util/Map;IILjava/lang/Object;)Lcom/pymcl/core/net/HttpResponse;

    move-result-object p0

    return-object p0
.end method

.method public static getText(Lcom/pymcl/core/net/Http;Ljava/lang/String;Ljava/util/Map;I)Ljava/lang/String;
    .locals 1
    .param p0, "$this"    # Lcom/pymcl/core/net/Http;
    .param p1, "url"    # Ljava/lang/String;
    .param p2, "headers"    # Ljava/util/Map;
    .param p3, "timeoutMs"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/pymcl/core/net/Http;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;I)",
            "Ljava/lang/String;"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "url"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "headers"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    invoke-static {p0, p1, p2, p3}, Lcom/pymcl/core/net/Http;->access$getText$jd(Lcom/pymcl/core/net/Http;Ljava/lang/String;Ljava/util/Map;I)Ljava/lang/String;

    move-result-object v0

    .line 27
    return-object v0
.end method

.method public static synthetic getText$default(Lcom/pymcl/core/net/Http;Ljava/lang/String;Ljava/util/Map;IILjava/lang/Object;)Ljava/lang/String;
    .locals 0

    .line 25
    invoke-static/range {p0 .. p5}, Lcom/pymcl/core/net/Http;->getText$default(Lcom/pymcl/core/net/Http;Ljava/lang/String;Ljava/util/Map;IILjava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    .line 27
    return-object p0
.end method

.method public static synthetic openStream$default(Lcom/pymcl/core/net/Http;Ljava/lang/String;Ljava/util/Map;IILjava/lang/Object;)Lkotlin/Triple;
    .locals 0

    .line 22
    invoke-static/range {p0 .. p5}, Lcom/pymcl/core/net/Http;->openStream$default(Lcom/pymcl/core/net/Http;Ljava/lang/String;Ljava/util/Map;IILjava/lang/Object;)Lkotlin/Triple;

    move-result-object p0

    return-object p0
.end method

.method public static postForm(Lcom/pymcl/core/net/Http;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;)Lcom/pymcl/core/net/HttpResponse;
    .locals 1
    .param p0, "$this"    # Lcom/pymcl/core/net/Http;
    .param p1, "url"    # Ljava/lang/String;
    .param p2, "form"    # Ljava/util/Map;
    .param p3, "headers"    # Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/pymcl/core/net/Http;",
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

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "url"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "form"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "headers"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 30
    invoke-static {p0, p1, p2, p3}, Lcom/pymcl/core/net/Http;->access$postForm$jd(Lcom/pymcl/core/net/Http;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;)Lcom/pymcl/core/net/HttpResponse;

    move-result-object v0

    .line 31
    return-object v0
.end method

.method public static synthetic postForm$default(Lcom/pymcl/core/net/Http;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;ILjava/lang/Object;)Lcom/pymcl/core/net/HttpResponse;
    .locals 0

    .line 30
    invoke-static/range {p0 .. p5}, Lcom/pymcl/core/net/Http;->postForm$default(Lcom/pymcl/core/net/Http;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;ILjava/lang/Object;)Lcom/pymcl/core/net/HttpResponse;

    move-result-object p0

    .line 31
    return-object p0
.end method

.method public static postJson(Lcom/pymcl/core/net/Http;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lcom/pymcl/core/net/HttpResponse;
    .locals 1
    .param p0, "$this"    # Lcom/pymcl/core/net/Http;
    .param p1, "url"    # Ljava/lang/String;
    .param p2, "json"    # Ljava/lang/String;
    .param p3, "headers"    # Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/pymcl/core/net/Http;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/pymcl/core/net/HttpResponse;"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "url"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "json"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "headers"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    invoke-static {p0, p1, p2, p3}, Lcom/pymcl/core/net/Http;->access$postJson$jd(Lcom/pymcl/core/net/Http;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lcom/pymcl/core/net/HttpResponse;

    move-result-object v0

    .line 29
    return-object v0
.end method

.method public static synthetic postJson$default(Lcom/pymcl/core/net/Http;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILjava/lang/Object;)Lcom/pymcl/core/net/HttpResponse;
    .locals 0

    .line 28
    invoke-static/range {p0 .. p5}, Lcom/pymcl/core/net/Http;->postJson$default(Lcom/pymcl/core/net/Http;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILjava/lang/Object;)Lcom/pymcl/core/net/HttpResponse;

    move-result-object p0

    .line 29
    return-object p0
.end method

.method public static synthetic request$default(Lcom/pymcl/core/net/Http;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;[BIILjava/lang/Object;)Lcom/pymcl/core/net/HttpResponse;
    .locals 0

    .line 20
    invoke-static/range {p0 .. p7}, Lcom/pymcl/core/net/Http;->request$default(Lcom/pymcl/core/net/Http;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;[BIILjava/lang/Object;)Lcom/pymcl/core/net/HttpResponse;

    move-result-object p0

    return-object p0
.end method
