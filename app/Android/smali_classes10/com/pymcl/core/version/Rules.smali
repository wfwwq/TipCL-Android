.class public final Lcom/pymcl/core/version/Rules;
.super Ljava/lang/Object;
.source "Versions.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nVersions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Versions.kt\ncom/pymcl/core/version/Rules\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,119:1\n1#2:120\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J&\u0010\u0004\u001a\u00020\u00052\u0016\u0010\u0006\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0007j\u0004\u0018\u0001`\u00082\u0006\u0010\t\u001a\u00020\nJ*\u0010\u000b\u001a\u00020\u00052\u0018\u0010\u000c\u001a\u0014\u0012\u0004\u0012\u00020\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u00010\rj\u0002`\u000f2\u0006\u0010\t\u001a\u00020\nH\u0002\u00a8\u0006\u0010"
    }
    d2 = {
        "Lcom/pymcl/core/version/Rules;",
        "",
        "<init>",
        "()V",
        "allowed",
        "",
        "rules",
        "",
        "Lcom/pymcl/core/util/JArr;",
        "env",
        "Lcom/pymcl/core/version/RuleEnv;",
        "matches",
        "r",
        "",
        "",
        "Lcom/pymcl/core/util/JObj;",
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
.field public static final INSTANCE:Lcom/pymcl/core/version/Rules;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/pymcl/core/version/Rules;

    invoke-direct {v0}, Lcom/pymcl/core/version/Rules;-><init>()V

    sput-object v0, Lcom/pymcl/core/version/Rules;->INSTANCE:Lcom/pymcl/core/version/Rules;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final matches(Ljava/util/Map;Lcom/pymcl/core/version/RuleEnv;)Z
    .locals 10
    .param p1, "r"    # Ljava/util/Map;
    .param p2, "env"    # Lcom/pymcl/core/version/RuleEnv;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Lcom/pymcl/core/version/RuleEnv;",
            ")Z"
        }
    .end annotation

    .line 30
    const-string v0, "os"

    invoke-static {p1, v0}, Lcom/pymcl/core/util/JsonKt;->obj(Ljava/util/Map;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_4

    .local v0, "os":Ljava/util/Map;
    const/4 v3, 0x0

    .line 31
    .local v3, "$i$a$-let-Rules$matches$1":I
    const-string v4, "name"

    invoke-static {v0, v4}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_0

    .line 120
    .local v4, "it":Ljava/lang/String;
    const/4 v5, 0x0

    .line 31
    .local v5, "$i$a$-let-Rules$matches$1$1":I
    invoke-virtual {p2}, Lcom/pymcl/core/version/RuleEnv;->getOsName()Ljava/lang/String;

    move-result-object v6

    invoke-static {v4, v6}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_0

    return v2

    .line 32
    .end local v4    # "it":Ljava/lang/String;
    .end local v5    # "$i$a$-let-Rules$matches$1$1":I
    :cond_0
    const-string v4, "arch"

    invoke-static {v0, v4}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_2

    .line 120
    .restart local v4    # "it":Ljava/lang/String;
    const/4 v5, 0x0

    .line 32
    .local v5, "$i$a$-let-Rules$matches$1$2":I
    const-string v6, "x86"

    invoke-static {v4, v6}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_1

    invoke-virtual {p2}, Lcom/pymcl/core/version/RuleEnv;->is64()Z

    move-result v7

    if-eqz v7, :cond_1

    return v2

    :cond_1
    invoke-static {v4, v6}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_2

    invoke-virtual {p2}, Lcom/pymcl/core/version/RuleEnv;->getArch()Ljava/lang/String;

    move-result-object v6

    check-cast v6, Ljava/lang/CharSequence;

    move-object v7, v4

    check-cast v7, Ljava/lang/CharSequence;

    const/4 v8, 0x2

    const/4 v9, 0x0

    invoke-static {v6, v7, v2, v8, v9}, Lkotlin/text/StringsKt;->contains$default(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_2

    return v2

    .line 33
    .end local v4    # "it":Ljava/lang/String;
    .end local v5    # "$i$a$-let-Rules$matches$1$2":I
    :cond_2
    const-string v4, "version"

    invoke-static {v0, v4}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_4

    .line 120
    .restart local v4    # "it":Ljava/lang/String;
    const/4 v5, 0x0

    .line 33
    .local v5, "$i$a$-let-Rules$matches$1$3":I
    invoke-virtual {p2}, Lcom/pymcl/core/version/RuleEnv;->getOsVersion()Ljava/lang/String;

    move-result-object v6

    check-cast v6, Ljava/lang/CharSequence;

    invoke-interface {v6}, Ljava/lang/CharSequence;->length()I

    move-result v6

    if-lez v6, :cond_3

    move v6, v1

    goto :goto_0

    :cond_3
    move v6, v2

    :goto_0
    if-eqz v6, :cond_4

    new-instance v6, Lkotlin/text/Regex;

    invoke-direct {v6, v4}, Lkotlin/text/Regex;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2}, Lcom/pymcl/core/version/RuleEnv;->getOsVersion()Ljava/lang/String;

    move-result-object v7

    check-cast v7, Ljava/lang/CharSequence;

    invoke-virtual {v6, v7}, Lkotlin/text/Regex;->containsMatchIn(Ljava/lang/CharSequence;)Z

    move-result v6

    if-nez v6, :cond_4

    return v2

    .line 30
    .end local v0    # "os":Ljava/util/Map;
    .end local v3    # "$i$a$-let-Rules$matches$1":I
    .end local v4    # "it":Ljava/lang/String;
    .end local v5    # "$i$a$-let-Rules$matches$1$3":I
    :cond_4
    nop

    .line 35
    const-string v0, "features"

    invoke-static {p1, v0}, Lcom/pymcl/core/util/JsonKt;->obj(Ljava/util/Map;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v0

    if-eqz v0, :cond_7

    .line 120
    .local v0, "f":Ljava/util/Map;
    const/4 v3, 0x0

    .line 35
    .local v3, "$i$a$-let-Rules$matches$2":I
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_5
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_7

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/Map$Entry;

    invoke-interface {v5}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    .local v6, "k":Ljava/lang/String;
    invoke-interface {v5}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v5

    .local v5, "v":Ljava/lang/Object;
    invoke-virtual {p2}, Lcom/pymcl/core/version/RuleEnv;->getFeatures()Ljava/util/Map;

    move-result-object v7

    invoke-interface {v7, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Boolean;

    if-eqz v7, :cond_6

    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v7

    goto :goto_1

    :cond_6
    move v7, v2

    :goto_1
    invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v7

    invoke-static {v7, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_5

    return v2

    .line 36
    .end local v0    # "f":Ljava/util/Map;
    .end local v3    # "$i$a$-let-Rules$matches$2":I
    .end local v5    # "v":Ljava/lang/Object;
    .end local v6    # "k":Ljava/lang/String;
    :cond_7
    return v1
.end method


# virtual methods
.method public final allowed(Ljava/util/List;Lcom/pymcl/core/version/RuleEnv;)Z
    .locals 5
    .param p1, "rules"    # Ljava/util/List;
    .param p2, "env"    # Lcom/pymcl/core/version/RuleEnv;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;",
            "Lcom/pymcl/core/version/RuleEnv;",
            ")Z"
        }
    .end annotation

    const-string v0, "env"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    move-object v0, p1

    check-cast v0, Ljava/util/Collection;

    const/4 v1, 0x1

    if-eqz v0, :cond_1

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    move v0, v1

    :goto_1
    if-eqz v0, :cond_2

    return v1

    .line 25
    :cond_2
    const/4 v0, 0x0

    .line 26
    .local v0, "ok":Z
    invoke-static {p1}, Lcom/pymcl/core/util/JsonKt;->objs(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_3
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map;

    .local v2, "r":Ljava/util/Map;
    invoke-direct {p0, v2, p2}, Lcom/pymcl/core/version/Rules;->matches(Ljava/util/Map;Lcom/pymcl/core/version/RuleEnv;)Z

    move-result v3

    if-eqz v3, :cond_3

    const-string v3, "action"

    invoke-static {v2, v3}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v4, "allow"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    .end local v2    # "r":Ljava/util/Map;
    goto :goto_2

    .line 27
    :cond_4
    return v0
.end method
