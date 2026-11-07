.class public final Lcom/pymcl/ai/AiEndpoints;
.super Ljava/lang/Object;
.source "AiSettings.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nAiSettings.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AiSettings.kt\ncom/pymcl/ai/AiEndpoints\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,179:1\n1#2:180\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005J\u000e\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005J\u000e\u0010\u0008\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u0005J$\u0010\u000b\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u000cj\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005`\rH\u0002J\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0010\u001a\u00020\u0011J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0010\u001a\u00020\u0011\u00a8\u0006\u0014"
    }
    d2 = {
        "Lcom/pymcl/ai/AiEndpoints;",
        "",
        "<init>",
        "()V",
        "normalizeBase",
        "",
        "u",
        "withScheme",
        "hostOf",
        "isBuiltinHost",
        "",
        "baseHeaders",
        "Ljava/util/LinkedHashMap;",
        "Lkotlin/collections/LinkedHashMap;",
        "resolve",
        "Lcom/pymcl/ai/AiEndpoint;",
        "st",
        "Lcom/pymcl/ai/AiSettings;",
        "validate",
        "keyHint",
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


# static fields
.field public static final INSTANCE:Lcom/pymcl/ai/AiEndpoints;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/pymcl/ai/AiEndpoints;

    invoke-direct {v0}, Lcom/pymcl/ai/AiEndpoints;-><init>()V

    sput-object v0, Lcom/pymcl/ai/AiEndpoints;->INSTANCE:Lcom/pymcl/ai/AiEndpoints;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 115
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final baseHeaders()Ljava/util/LinkedHashMap;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/LinkedHashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 143
    const/4 v0, 0x1

    new-array v0, v0, [Lkotlin/Pair;

    const-string v1, "X-PyMCL-Client"

    const-string v2, "PyMCL/1.0.1"

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-static {v0}, Lkotlin/collections/MapsKt;->linkedMapOf([Lkotlin/Pair;)Ljava/util/LinkedHashMap;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final hostOf(Ljava/lang/String;)Ljava/lang/String;
    .locals 5
    .param p1, "u"    # Ljava/lang/String;

    const-string v0, ""

    const-string v1, "u"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 140
    :try_start_0
    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object v1, p0

    check-cast v1, Lcom/pymcl/ai/AiEndpoints;

    .line 180
    .local v1, "$this$hostOf_u24lambda_u240":Lcom/pymcl/ai/AiEndpoints;
    const/4 v2, 0x0

    .line 140
    .local v2, "$i$a$-runCatching-AiEndpoints$hostOf$1":I
    new-instance v3, Ljava/net/URI;

    invoke-virtual {v1, p1}, Lcom/pymcl/ai/AiEndpoints;->withScheme(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, v4}, Ljava/net/URI;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3}, Ljava/net/URI;->getHost()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_0

    sget-object v4, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v3, v4}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v3

    const-string v4, "toLowerCase(...)"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez v3, :cond_1

    :cond_0
    move-object v3, v0

    .end local v1    # "$this$hostOf_u24lambda_u240":Lcom/pymcl/ai/AiEndpoints;
    .end local v2    # "$i$a$-runCatching-AiEndpoints$hostOf$1":I
    :cond_1
    invoke-static {v3}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

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

    goto :goto_1

    :cond_2
    move-object v0, v1

    :goto_1
    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public final isBuiltinHost(Ljava/lang/String;)Z
    .locals 2
    .param p1, "u"    # Ljava/lang/String;

    const-string v0, "u"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 141
    move-object v0, p1

    check-cast v0, Ljava/lang/CharSequence;

    invoke-static {v0}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0, p1}, Lcom/pymcl/ai/AiEndpoints;->hostOf(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lcom/pymcl/ai/Builtin;->INSTANCE:Lcom/pymcl/ai/Builtin;

    invoke-virtual {v1}, Lcom/pymcl/ai/Builtin;->getGatewayUrl()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/pymcl/ai/AiEndpoints;->hostOf(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final keyHint(Lcom/pymcl/ai/AiSettings;)Ljava/lang/String;
    .locals 3
    .param p1, "st"    # Lcom/pymcl/ai/AiSettings;

    const-string v0, "st"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 176
    sget-object v0, Lcom/pymcl/ai/AiMode;->INSTANCE:Lcom/pymcl/ai/AiMode;

    invoke-virtual {p1}, Lcom/pymcl/ai/AiSettings;->getMode()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/pymcl/ai/AiMode;->normalize(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "custom"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lcom/pymcl/ai/AiSettings;->getApiKey()Ljava/lang/String;

    move-result-object v0

    check-cast v0, Ljava/lang/CharSequence;

    invoke-static {v0}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1}, Lcom/pymcl/ai/AiEndpoints;->resolve(Lcom/pymcl/ai/AiSettings;)Lcom/pymcl/ai/AiEndpoint;

    move-result-object v0

    invoke-virtual {v0}, Lcom/pymcl/ai/AiEndpoint;->getSendsBuiltinKey()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0, p1}, Lcom/pymcl/ai/AiEndpoints;->resolve(Lcom/pymcl/ai/AiSettings;)Lcom/pymcl/ai/AiEndpoint;

    move-result-object v0

    invoke-virtual {v0}, Lcom/pymcl/ai/AiEndpoint;->getProblem()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    .line 177
    sget-object v0, Lcom/pymcl/ai/AiText;->INSTANCE:Lcom/pymcl/ai/AiText;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u672a\u586b API Key\uff1a\u8bf7\u6c42\u5c06\u4e0d\u5e26\u9274\u6743\u5934\uff08\u672c\u5730/\u514d\u9274\u6743\u670d\u52a1\u53ef\u8fd9\u6837\u7528\uff09"

    invoke-virtual {v0, v2, v1}, Lcom/pymcl/ai/AiText;->t(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public final normalizeBase(Ljava/lang/String;)Ljava/lang/String;
    .locals 5
    .param p1, "u"    # Ljava/lang/String;

    const-string v0, "u"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 121
    invoke-virtual {p0, p1}, Lcom/pymcl/ai/AiEndpoints;->withScheme(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 122
    .local v0, "s":Ljava/lang/String;
    move-object v1, v0

    check-cast v1, Ljava/lang/CharSequence;

    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    move v1, v3

    :goto_0
    if-eqz v1, :cond_1

    return-object v0

    .line 123
    :cond_1
    const-string v1, "/chat/completions"

    check-cast v1, Ljava/lang/CharSequence;

    invoke-static {v0, v1}, Lkotlin/text/StringsKt;->removeSuffix(Ljava/lang/String;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v1

    const-string v4, "/models"

    check-cast v4, Ljava/lang/CharSequence;

    invoke-static {v1, v4}, Lkotlin/text/StringsKt;->removeSuffix(Ljava/lang/String;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v1

    new-array v2, v2, [C

    const/16 v4, 0x2f

    aput-char v4, v2, v3

    invoke-static {v1, v2}, Lkotlin/text/StringsKt;->trimEnd(Ljava/lang/String;[C)Ljava/lang/String;

    move-result-object v0

    .line 124
    new-instance v1, Lkotlin/text/Regex;

    const-string v2, "/v\\d+[a-z]*$"

    invoke-direct {v1, v2}, Lkotlin/text/Regex;-><init>(Ljava/lang/String;)V

    move-object v2, v0

    check-cast v2, Ljava/lang/CharSequence;

    invoke-virtual {v1, v2}, Lkotlin/text/Regex;->containsMatchIn(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_2

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "/v1"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 125
    :cond_2
    return-object v0
.end method

.method public final resolve(Lcom/pymcl/ai/AiSettings;)Lcom/pymcl/ai/AiEndpoint;
    .locals 25
    .param p1, "st"    # Lcom/pymcl/ai/AiSettings;

    move-object/from16 v0, p0

    const-string v1, "st"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 146
    sget-object v1, Lcom/pymcl/ai/AiMode;->INSTANCE:Lcom/pymcl/ai/AiMode;

    invoke-virtual {v2}, Lcom/pymcl/ai/AiSettings;->getMode()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/pymcl/ai/AiMode;->normalize(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 147
    const-string v3, "builtin"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    const-string v4, "/models"

    const-string v5, "/chat/completions"

    const-string v6, "Bearer "

    const-string v7, "Authorization"

    if-eqz v3, :cond_0

    .line 148
    sget-object v1, Lcom/pymcl/ai/Builtin;->INSTANCE:Lcom/pymcl/ai/Builtin;

    invoke-virtual {v1}, Lcom/pymcl/ai/Builtin;->getApiBase()Ljava/lang/String;

    move-result-object v1

    .line 149
    .local v1, "base":Ljava/lang/String;
    new-instance v8, Lcom/pymcl/ai/AiEndpoint;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-direct {v0}, Lcom/pymcl/ai/AiEndpoints;->baseHeaders()Ljava/util/LinkedHashMap;

    move-result-object v3

    check-cast v3, Ljava/util/Map;

    sget-object v4, Lcom/pymcl/ai/Builtin;->INSTANCE:Lcom/pymcl/ai/Builtin;

    invoke-virtual {v4}, Lcom/pymcl/ai/Builtin;->getApiKey()Ljava/lang/String;

    move-result-object v4

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v7, v4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v4

    invoke-static {v3, v4}, Lkotlin/collections/MapsKt;->plus(Ljava/util/Map;Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v11

    const/16 v17, 0x60

    const/16 v18, 0x0

    const/4 v12, 0x1

    const-string v13, "builtin"

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x1

    invoke-direct/range {v8 .. v18}, Lcom/pymcl/ai/AiEndpoint;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/lang/String;Ljava/lang/String;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .end local v1    # "base":Ljava/lang/String;
    goto/16 :goto_a

    .line 151
    :cond_0
    const-string v3, "gateway"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    const/4 v3, 0x1

    const/4 v8, 0x0

    if-eqz v1, :cond_6

    .line 152
    invoke-virtual {v2}, Lcom/pymcl/ai/AiSettings;->getGatewayUrl()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/pymcl/ai/AiEndpoints;->withScheme(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 153
    .local v1, "gw":Ljava/lang/String;
    move-object v4, v1

    check-cast v4, Ljava/lang/CharSequence;

    invoke-interface {v4}, Ljava/lang/CharSequence;->length()I

    move-result v4

    if-nez v4, :cond_1

    move v4, v3

    goto :goto_0

    :cond_1
    move v4, v8

    :goto_0
    if-eqz v4, :cond_2

    new-instance v9, Lcom/pymcl/ai/AiEndpoint;

    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    move-result-object v12

    sget-object v3, Lcom/pymcl/ai/AiText;->INSTANCE:Lcom/pymcl/ai/AiText;

    const-string v4, "\u81ea\u5efa AI \u7f51\u5173\u9700\u8981\u586b\u5199\u7f51\u5173\u5730\u5740"

    new-array v5, v8, [Ljava/lang/Object;

    invoke-virtual {v3, v4, v5}, Lcom/pymcl/ai/AiText;->t(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v15

    const/16 v18, 0xc0

    const/16 v19, 0x0

    const-string v10, ""

    const-string v11, ""

    const/4 v13, 0x0

    const-string v14, "gateway"

    const/16 v16, 0x0

    const/16 v17, 0x0

    invoke-direct/range {v9 .. v19}, Lcom/pymcl/ai/AiEndpoint;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/lang/String;Ljava/lang/String;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v8, v9

    goto/16 :goto_a

    .line 155
    :cond_2
    invoke-direct {v0}, Lcom/pymcl/ai/AiEndpoints;->baseHeaders()Ljava/util/LinkedHashMap;

    move-result-object v4

    .local v4, "h":Ljava/util/LinkedHashMap;
    invoke-virtual {v2}, Lcom/pymcl/ai/AiSettings;->getGatewayKey()Ljava/lang/String;

    move-result-object v5

    check-cast v5, Ljava/lang/CharSequence;

    invoke-static {v5}, Lkotlin/text/StringsKt;->trim(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v5

    move-object v9, v5

    .line 180
    .local v9, "it":Ljava/lang/String;
    const/4 v10, 0x0

    .line 155
    .local v10, "$i$a$-takeIf-AiEndpoints$resolve$1":I
    move-object v11, v9

    check-cast v11, Ljava/lang/CharSequence;

    invoke-interface {v11}, Ljava/lang/CharSequence;->length()I

    move-result v11

    if-lez v11, :cond_3

    goto :goto_1

    :cond_3
    move v3, v8

    .end local v9    # "it":Ljava/lang/String;
    .end local v10    # "$i$a$-takeIf-AiEndpoints$resolve$1":I
    :goto_1
    if-eqz v3, :cond_4

    goto :goto_2

    :cond_4
    const/4 v5, 0x0

    :goto_2
    if-eqz v5, :cond_5

    .line 180
    .local v5, "it":Ljava/lang/String;
    const/4 v3, 0x0

    .line 155
    .local v3, "$i$a$-let-AiEndpoints$resolve$2":I
    move-object v8, v4

    check-cast v8, Ljava/util/Map;

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-interface {v8, v7, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 156
    .end local v3    # "$i$a$-let-AiEndpoints$resolve$2":I
    .end local v5    # "it":Ljava/lang/String;
    :cond_5
    new-instance v9, Lcom/pymcl/ai/AiEndpoint;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v5, "/pymcl/chat"

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v5, "/pymcl/models"

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    move-object v12, v4

    check-cast v12, Ljava/util/Map;

    const/16 v18, 0xa0

    const/16 v19, 0x0

    const/4 v13, 0x0

    const-string v14, "gateway"

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    invoke-direct/range {v9 .. v19}, Lcom/pymcl/ai/AiEndpoint;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/lang/String;Ljava/lang/String;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v8, v9

    .end local v1    # "gw":Ljava/lang/String;
    .end local v4    # "h":Ljava/util/LinkedHashMap;
    goto/16 :goto_a

    .line 160
    :cond_6
    invoke-virtual {v2}, Lcom/pymcl/ai/AiSettings;->getBaseUrl()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/pymcl/ai/AiEndpoints;->normalizeBase(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 161
    .local v1, "base":Ljava/lang/String;
    move-object v9, v1

    check-cast v9, Ljava/lang/CharSequence;

    invoke-interface {v9}, Ljava/lang/CharSequence;->length()I

    move-result v9

    if-nez v9, :cond_7

    move v9, v3

    goto :goto_3

    :cond_7
    move v9, v8

    :goto_3
    if-eqz v9, :cond_8

    new-instance v10, Lcom/pymcl/ai/AiEndpoint;

    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    move-result-object v13

    sget-object v3, Lcom/pymcl/ai/AiText;->INSTANCE:Lcom/pymcl/ai/AiText;

    const-string v4, "\u81ea\u5b9a\u4e49\u7aef\u70b9\u9700\u8981\u586b\u5199\u7aef\u70b9\u5730\u5740\uff08\u6216\u6539\u7528\u5185\u7f6e\u516c\u76ca\u7f51\u5173\uff09"

    new-array v5, v8, [Ljava/lang/Object;

    invoke-virtual {v3, v4, v5}, Lcom/pymcl/ai/AiText;->t(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v16

    const/16 v19, 0xc0

    const/16 v20, 0x0

    const-string v11, ""

    const-string v12, ""

    const/4 v14, 0x0

    const-string v15, "custom"

    const/16 v17, 0x0

    const/16 v18, 0x0

    invoke-direct/range {v10 .. v20}, Lcom/pymcl/ai/AiEndpoint;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/lang/String;Ljava/lang/String;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v8, v10

    goto/16 :goto_a

    .line 163
    :cond_8
    invoke-virtual {v2}, Lcom/pymcl/ai/AiSettings;->getApiKey()Ljava/lang/String;

    move-result-object v9

    check-cast v9, Ljava/lang/CharSequence;

    invoke-static {v9}, Lkotlin/text/StringsKt;->trim(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v9

    .line 165
    .local v9, "userKey":Ljava/lang/String;
    invoke-virtual {v0, v1}, Lcom/pymcl/ai/AiEndpoints;->isBuiltinHost(Ljava/lang/String;)Z

    move-result v10

    if-eqz v10, :cond_a

    sget-object v10, Lcom/pymcl/ai/Builtin;->INSTANCE:Lcom/pymcl/ai/Builtin;

    invoke-virtual {v10}, Lcom/pymcl/ai/Builtin;->getApiBase()Ljava/lang/String;

    move-result-object v10

    invoke-static {v1, v10}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_9

    sget-object v10, Lcom/pymcl/ai/Builtin;->INSTANCE:Lcom/pymcl/ai/Builtin;

    invoke-virtual {v10}, Lcom/pymcl/ai/Builtin;->getApiBase()Ljava/lang/String;

    move-result-object v11

    const/4 v15, 0x4

    const/16 v16, 0x0

    const-string v12, "https://"

    const-string v13, "http://"

    const/4 v14, 0x0

    invoke-static/range {v11 .. v16}, Lkotlin/text/StringsKt;->replaceFirst$default(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v10

    invoke-static {v1, v10}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_a

    :cond_9
    move v10, v3

    goto :goto_4

    :cond_a
    move v10, v8

    .line 166
    .local v10, "builtinBase":Z
    :goto_4
    move-object v11, v9

    check-cast v11, Ljava/lang/CharSequence;

    invoke-interface {v11}, Ljava/lang/CharSequence;->length()I

    move-result v12

    if-nez v12, :cond_b

    move v12, v3

    goto :goto_5

    :cond_b
    move v12, v8

    :goto_5
    if-eqz v12, :cond_d

    .line 180
    const/4 v11, 0x0

    .line 166
    .local v11, "$i$a$-ifEmpty-AiEndpoints$resolve$key$1":I
    if-eqz v10, :cond_c

    sget-object v12, Lcom/pymcl/ai/Builtin;->INSTANCE:Lcom/pymcl/ai/Builtin;

    invoke-virtual {v12}, Lcom/pymcl/ai/Builtin;->getApiKey()Ljava/lang/String;

    move-result-object v12

    goto :goto_6

    :cond_c
    const-string v12, ""

    :goto_6
    move-object v11, v12

    .end local v11    # "$i$a$-ifEmpty-AiEndpoints$resolve$key$1":I
    :cond_d
    check-cast v11, Ljava/lang/String;

    .line 167
    .local v11, "key":Ljava/lang/String;
    invoke-direct {v0}, Lcom/pymcl/ai/AiEndpoints;->baseHeaders()Ljava/util/LinkedHashMap;

    move-result-object v12

    .local v12, "h":Ljava/util/LinkedHashMap;
    move-object v13, v11

    check-cast v13, Ljava/lang/CharSequence;

    invoke-interface {v13}, Ljava/lang/CharSequence;->length()I

    move-result v13

    if-lez v13, :cond_e

    move v13, v3

    goto :goto_7

    :cond_e
    move v13, v8

    :goto_7
    if-eqz v13, :cond_f

    move-object v13, v12

    check-cast v13, Ljava/util/Map;

    new-instance v14, Ljava/lang/StringBuilder;

    invoke-direct {v14}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v14, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-interface {v13, v7, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 168
    :cond_f
    new-instance v14, Lcom/pymcl/ai/AiEndpoint;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v15

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v16

    move-object/from16 v17, v12

    check-cast v17, Ljava/util/Map;

    move-object v4, v9

    check-cast v4, Ljava/lang/CharSequence;

    invoke-interface {v4}, Ljava/lang/CharSequence;->length()I

    move-result v4

    if-nez v4, :cond_10

    move v4, v3

    goto :goto_8

    :cond_10
    move v4, v8

    :goto_8
    if-eqz v4, :cond_11

    if-eqz v10, :cond_11

    move/from16 v22, v3

    goto :goto_9

    :cond_11
    move/from16 v22, v8

    :goto_9
    const/16 v23, 0x20

    const/16 v24, 0x0

    const/16 v18, 0x0

    const-string v19, "custom"

    const/16 v20, 0x0

    const/16 v21, 0x0

    invoke-direct/range {v14 .. v24}, Lcom/pymcl/ai/AiEndpoint;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/lang/String;Ljava/lang/String;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v8, v14

    .line 171
    .end local v1    # "base":Ljava/lang/String;
    .end local v9    # "userKey":Ljava/lang/String;
    .end local v10    # "builtinBase":Z
    .end local v11    # "key":Ljava/lang/String;
    .end local v12    # "h":Ljava/util/LinkedHashMap;
    :goto_a
    return-object v8
.end method

.method public final validate(Lcom/pymcl/ai/AiSettings;)Ljava/lang/String;
    .locals 1
    .param p1, "st"    # Lcom/pymcl/ai/AiSettings;

    const-string v0, "st"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 174
    invoke-virtual {p0, p1}, Lcom/pymcl/ai/AiEndpoints;->resolve(Lcom/pymcl/ai/AiSettings;)Lcom/pymcl/ai/AiEndpoint;

    move-result-object v0

    invoke-virtual {v0}, Lcom/pymcl/ai/AiEndpoint;->getProblem()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final withScheme(Ljava/lang/String;)Ljava/lang/String;
    .locals 8
    .param p1, "u"    # Ljava/lang/String;

    const-string v0, "u"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 130
    move-object v0, p1

    check-cast v0, Ljava/lang/CharSequence;

    invoke-static {v0}, Lkotlin/text/StringsKt;->trim(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v2, v1, [C

    const/4 v3, 0x0

    const/16 v4, 0x2f

    aput-char v4, v2, v3

    invoke-static {v0, v2}, Lkotlin/text/StringsKt;->trimEnd(Ljava/lang/String;[C)Ljava/lang/String;

    move-result-object v0

    .line 131
    .local v0, "s":Ljava/lang/String;
    move-object v2, v0

    check-cast v2, Ljava/lang/CharSequence;

    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    move v1, v3

    :goto_0
    if-eqz v1, :cond_1

    return-object v0

    .line 132
    :cond_1
    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v0, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "toLowerCase(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 133
    .local v1, "lower":Ljava/lang/String;
    nop

    .line 134
    const-string v2, "http://"

    const/4 v4, 0x2

    const/4 v5, 0x0

    invoke-static {v1, v2, v3, v4, v5}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v6

    const-string v7, "substring(...)"

    if-eqz v6, :cond_2

    const/4 v3, 0x7

    invoke-virtual {v0, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    goto :goto_1

    .line 135
    :cond_2
    const-string v2, "https://"

    invoke-static {v1, v2, v3, v4, v5}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    const/16 v3, 0x8

    invoke-virtual {v0, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    goto :goto_1

    .line 136
    :cond_3
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 133
    :goto_1
    return-object v2
.end method
