.class public final Lcom/pymcl/android/data/AiSettingsForm$Companion;
.super Ljava/lang/Object;
.source "AiSettingsForm.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/pymcl/android/data/AiSettingsForm;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nAiSettingsForm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AiSettingsForm.kt\ncom/pymcl/android/data/AiSettingsForm$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,63:1\n1#2:64\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\"\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\n0\t2\u000c\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000c\u001a\u00020\nJ\u001c\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u000e2\u0006\u0010\u000f\u001a\u00020\n\u00a8\u0006\u0010"
    }
    d2 = {
        "Lcom/pymcl/android/data/AiSettingsForm$Companion;",
        "",
        "<init>",
        "()V",
        "from",
        "Lcom/pymcl/android/data/AiSettingsForm;",
        "st",
        "Lcom/pymcl/ai/AiSettings;",
        "modelOptions",
        "",
        "",
        "list",
        "current",
        "splitDetail",
        "Lkotlin/Pair;",
        "msg",
        "PyMCL-Android:app_debug"
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
.method private constructor <init>()V
    .locals 0

    .line 49
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lcom/pymcl/android/data/AiSettingsForm$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final from(Lcom/pymcl/ai/AiSettings;)Lcom/pymcl/android/data/AiSettingsForm;
    .locals 12
    .param p1, "st"    # Lcom/pymcl/ai/AiSettings;

    const-string v0, "st"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 50
    new-instance v1, Lcom/pymcl/android/data/AiSettingsForm;

    .line 51
    sget-object v0, Lcom/pymcl/ai/AiMode;->INSTANCE:Lcom/pymcl/ai/AiMode;

    invoke-virtual {p1}, Lcom/pymcl/ai/AiSettings;->getMode()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/pymcl/ai/AiMode;->uiIndex(Ljava/lang/String;)I

    move-result v2

    invoke-virtual {p1}, Lcom/pymcl/ai/AiSettings;->getBaseUrl()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Lcom/pymcl/ai/AiSettings;->getApiKey()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1}, Lcom/pymcl/ai/AiSettings;->getGatewayUrl()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p1}, Lcom/pymcl/ai/AiSettings;->getGatewayKey()Ljava/lang/String;

    move-result-object v6

    .line 52
    invoke-virtual {p1}, Lcom/pymcl/ai/AiSettings;->getModel()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {p1}, Lcom/pymcl/ai/AiSettings;->getContextWindow()I

    move-result v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {p1}, Lcom/pymcl/ai/AiSettings;->getFallbackModel()Ljava/lang/String;

    move-result-object v9

    sget-object v0, Lcom/pymcl/ai/Permission;->INSTANCE:Lcom/pymcl/ai/Permission;

    invoke-virtual {p1}, Lcom/pymcl/ai/AiSettings;->getPermissionMode()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v0, v10}, Lcom/pymcl/ai/Permission;->uiIndex(Ljava/lang/String;)I

    move-result v0

    sget-object v10, Lcom/pymcl/ai/Permission;->INSTANCE:Lcom/pymcl/ai/Permission;

    invoke-virtual {v10}, Lcom/pymcl/ai/Permission;->getUI_LABELS()Ljava/util/List;

    move-result-object v10

    invoke-interface {v10}, Ljava/util/List;->size()I

    move-result v10

    add-int/lit8 v10, v10, -0x1

    const/4 v11, 0x0

    invoke-static {v0, v11, v10}, Lkotlin/ranges/RangesKt;->coerceIn(III)I

    move-result v10

    .line 50
    invoke-direct/range {v1 .. v10}, Lcom/pymcl/android/data/AiSettingsForm;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    .line 53
    return-object v1
.end method

.method public final modelOptions(Ljava/util/List;Ljava/lang/String;)Ljava/util/List;
    .locals 6
    .param p1, "list"    # Ljava/util/List;
    .param p2, "current"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    const-string v0, "list"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "current"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 55
    move-object v0, p2

    check-cast v0, Ljava/lang/CharSequence;

    invoke-static {v0}, Lkotlin/text/StringsKt;->trim(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    move-object v1, v0

    .line 64
    .local v1, "it\\1":Ljava/lang/String;
    const/4 v2, 0x0

    .line 55
    .local v2, "$i$a$-takeIf-AiSettingsForm$Companion$modelOptions$1\\1\\55\\0":I
    move-object v3, v1

    check-cast v3, Ljava/lang/CharSequence;

    invoke-interface {v3}, Ljava/lang/CharSequence;->length()I

    move-result v3

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-lez v3, :cond_0

    move v3, v4

    goto :goto_0

    :cond_0
    move v3, v5

    :goto_0
    if-eqz v3, :cond_1

    invoke-interface {p1, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1

    goto :goto_1

    :cond_1
    move v4, v5

    .end local v1    # "it\\1":Ljava/lang/String;
    .end local v2    # "$i$a$-takeIf-AiSettingsForm$Companion$modelOptions$1\\1\\55\\0":I
    :goto_1
    if-eqz v4, :cond_2

    goto :goto_2

    :cond_2
    const/4 v0, 0x0

    :goto_2
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOfNotNull(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    move-object v1, p1

    check-cast v1, Ljava/lang/Iterable;

    invoke-static {v0, v1}, Lkotlin/collections/CollectionsKt;->plus(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->distinct(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final splitDetail(Ljava/lang/String;)Lkotlin/Pair;
    .locals 7
    .param p1, "msg"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lkotlin/Pair<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    const-string v0, "msg"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 58
    move-object v1, p1

    check-cast v1, Ljava/lang/CharSequence;

    const/4 v5, 0x6

    const/4 v6, 0x0

    const-string v2, "\n\u8be6\u60c5\uff1a"

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Lkotlin/text/StringsKt;->indexOf$default(Ljava/lang/CharSequence;Ljava/lang/String;IZILjava/lang/Object;)I

    move-result v0

    .line 59
    .local v0, "i":I
    const/4 v1, 0x0

    if-gez v0, :cond_0

    invoke-static {p1, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    goto :goto_1

    :cond_0
    const/4 v2, 0x0

    invoke-virtual {p1, v2, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    const-string v3, "substring(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    add-int/lit8 v4, v0, 0x4

    invoke-virtual {p1, v4}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v4, Ljava/lang/CharSequence;

    invoke-static {v4}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 64
    const/4 v3, 0x0

    .line 59
    .local v3, "$i$a$-ifBlank-AiSettingsForm$Companion$splitDetail$1\\1\\59\\0":I
    nop

    .end local v3    # "$i$a$-ifBlank-AiSettingsForm$Companion$splitDetail$1\\1\\59\\0":I
    goto :goto_0

    :cond_1
    move-object v1, v4

    :goto_0
    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    :goto_1
    return-object v1
.end method
