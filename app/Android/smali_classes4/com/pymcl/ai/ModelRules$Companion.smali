.class public final Lcom/pymcl/ai/ModelRules$Companion;
.super Ljava/lang/Object;
.source "ModelRules.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/pymcl/ai/ModelRules;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nModelRules.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModelRules.kt\ncom/pymcl/ai/ModelRules$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,84:1\n1#2:85\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0006\u0010\u000c\u001a\u00020\rJ\u0010\u0010\u000e\u001a\u00020\r2\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u0006H\u0002R-\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0005j\u0002`\u00078FX\u0086\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\n\u0010\u000b\u001a\u0004\u0008\u0008\u0010\t\u00a8\u0006\u0014"
    }
    d2 = {
        "Lcom/pymcl/ai/ModelRules$Companion;",
        "",
        "<init>",
        "()V",
        "BUILTIN_JSON",
        "",
        "",
        "Lcom/pymcl/core/util/JObj;",
        "getBUILTIN_JSON",
        "()Ljava/util/Map;",
        "BUILTIN_JSON$delegate",
        "Lkotlin/Lazy;",
        "builtin",
        "Lcom/pymcl/ai/ModelRules;",
        "load",
        "userFile",
        "Ljava/io/File;",
        "rx",
        "Lkotlin/text/Regex;",
        "p",
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
.method private constructor <init>()V
    .locals 0

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lcom/pymcl/ai/ModelRules$Companion;-><init>()V

    return-void
.end method

.method public static final synthetic access$rx(Lcom/pymcl/ai/ModelRules$Companion;Ljava/lang/String;)Lkotlin/text/Regex;
    .locals 1
    .param p0, "$this"    # Lcom/pymcl/ai/ModelRules$Companion;
    .param p1, "p"    # Ljava/lang/String;

    .line 26
    invoke-direct {p0, p1}, Lcom/pymcl/ai/ModelRules$Companion;->rx(Ljava/lang/String;)Lkotlin/text/Regex;

    move-result-object v0

    return-object v0
.end method

.method private final rx(Ljava/lang/String;)Lkotlin/text/Regex;
    .locals 4
    .param p1, "p"    # Ljava/lang/String;

    .line 36
    :try_start_0
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object v0, p0

    check-cast v0, Lcom/pymcl/ai/ModelRules$Companion;

    .line 85
    .local v0, "$this$rx_u24lambda_u240":Lcom/pymcl/ai/ModelRules$Companion;
    const/4 v1, 0x0

    .line 36
    .local v1, "$i$a$-runCatching-ModelRules$Companion$rx$1":I
    new-instance v2, Lkotlin/text/Regex;

    sget-object v3, Lkotlin/text/RegexOption;->IGNORE_CASE:Lkotlin/text/RegexOption;

    invoke-direct {v2, p1, v3}, Lkotlin/text/Regex;-><init>(Ljava/lang/String;Lkotlin/text/RegexOption;)V

    .end local v0    # "$this$rx_u24lambda_u240":Lcom/pymcl/ai/ModelRules$Companion;
    .end local v1    # "$i$a$-runCatching-ModelRules$Companion$rx$1":I
    invoke-static {v2}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    :goto_0
    invoke-static {v0}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v0, 0x0

    :cond_0
    check-cast v0, Lkotlin/text/Regex;

    return-object v0
.end method


# virtual methods
.method public final builtin()Lcom/pymcl/ai/ModelRules;
    .locals 2

    .line 30
    new-instance v0, Lcom/pymcl/ai/ModelRules;

    invoke-virtual {p0}, Lcom/pymcl/ai/ModelRules$Companion;->getBUILTIN_JSON()Ljava/util/Map;

    move-result-object v1

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/pymcl/ai/ModelRules;-><init>(Ljava/util/List;)V

    return-object v0
.end method

.method public final getBUILTIN_JSON()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 27
    invoke-static {}, Lcom/pymcl/ai/ModelRules;->access$getBUILTIN_JSON$delegate$cp()Lkotlin/Lazy;

    move-result-object v0

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    return-object v0
.end method

.method public final load(Ljava/io/File;)Lcom/pymcl/ai/ModelRules;
    .locals 8
    .param p1, "userFile"    # Ljava/io/File;

    .line 33
    const/4 v0, 0x1

    const/4 v1, 0x0

    if-eqz p1, :cond_2

    move-object v2, p1

    .line 85
    .local v2, "it":Ljava/io/File;
    const/4 v3, 0x0

    .line 33
    .local v3, "$i$a$-takeIf-ModelRules$Companion$load$user$1":I
    invoke-virtual {v2}, Ljava/io/File;->isFile()Z

    move-result v2

    .end local v2    # "it":Ljava/io/File;
    .end local v3    # "$i$a$-takeIf-ModelRules$Companion$load$user$1":I
    if-eqz v2, :cond_0

    move-object v2, p1

    goto :goto_0

    :cond_0
    move-object v2, v1

    :goto_0
    if-eqz v2, :cond_2

    .line 85
    .restart local v2    # "it":Ljava/io/File;
    const/4 v3, 0x0

    .line 33
    .local v3, "$i$a$-let-ModelRules$Companion$load$user$2":I
    sget-object v4, Lcom/pymcl/ai/ModelRules;->Companion:Lcom/pymcl/ai/ModelRules$Companion;

    :try_start_0
    sget-object v5, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 85
    .local v4, "$this$load_u24lambda_u241_u240":Lcom/pymcl/ai/ModelRules$Companion;
    const/4 v5, 0x0

    .line 33
    .local v5, "$i$a$-runCatching-ModelRules$Companion$load$user$2$1":I
    sget-object v6, Lcom/pymcl/core/util/Json;->INSTANCE:Lcom/pymcl/core/util/Json;

    invoke-static {v2, v1, v0, v1}, Lkotlin/io/FilesKt;->readText$default(Ljava/io/File;Ljava/nio/charset/Charset;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Lcom/pymcl/core/util/Json;->obj(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v6

    .end local v4    # "$this$load_u24lambda_u241_u240":Lcom/pymcl/ai/ModelRules$Companion;
    .end local v5    # "$i$a$-runCatching-ModelRules$Companion$load$user$2$1":I
    invoke-static {v6}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v4

    sget-object v5, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v4}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v4

    invoke-static {v4}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    :goto_1
    invoke-static {v4}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    goto :goto_2

    :cond_1
    move-object v1, v4

    :goto_2
    check-cast v1, Ljava/util/Map;

    .line 34
    .end local v2    # "it":Ljava/io/File;
    .end local v3    # "$i$a$-let-ModelRules$Companion$load$user$2":I
    .local v1, "user":Ljava/util/Map;
    :cond_2
    new-instance v2, Lcom/pymcl/ai/ModelRules;

    const/4 v3, 0x2

    new-array v3, v3, [Ljava/util/Map;

    const/4 v4, 0x0

    invoke-virtual {p0}, Lcom/pymcl/ai/ModelRules$Companion;->getBUILTIN_JSON()Ljava/util/Map;

    move-result-object v5

    aput-object v5, v3, v4

    aput-object v1, v3, v0

    invoke-static {v3}, Lkotlin/collections/CollectionsKt;->listOfNotNull([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-direct {v2, v0}, Lcom/pymcl/ai/ModelRules;-><init>(Ljava/util/List;)V

    return-object v2
.end method
