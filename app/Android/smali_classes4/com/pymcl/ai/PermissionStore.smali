.class public final Lcom/pymcl/ai/PermissionStore;
.super Ljava/lang/Object;
.source "Permission.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nPermission.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Permission.kt\ncom/pymcl/ai/PermissionStore\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,143:1\n1#2:144\n1#2:159\n1#2:176\n1544#3:145\n1633#3,2:146\n1795#3,10:148\n2068#3:158\n2069#3:160\n1805#3:161\n1635#3,3:162\n1795#3,10:165\n2068#3:175\n2069#3:177\n1805#3:178\n*S KotlinDebug\n*F\n+ 1 Permission.kt\ncom/pymcl/ai/PermissionStore\n*L\n106#1:159\n134#1:176\n105#1:145\n105#1:146,2\n106#1:148,10\n106#1:158\n106#1:160\n106#1:161\n105#1:162,3\n134#1:165,10\n134#1:175\n134#1:177\n134#1:178\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u000b\n\u0002\u0008\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0008\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007j\u0002`\tH\u0002J\u001a\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\u0008\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007j\u0002`\tH\u0002J4\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000c2\u001c\u0010\u000e\u001a\u0018\u0012\u0004\u0012\u00020\u0008\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0007j\u0004\u0018\u0001`\t2\u0006\u0010\u000f\u001a\u00020\u0008H\u0002J\u000c\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000cJ\u0014\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000c2\u0006\u0010\u0012\u001a\u00020\u0008J\u0014\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000c2\u0006\u0010\u0012\u001a\u00020\u0008J\u0016\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0008J\u0016\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00082\u0006\u0010\u0012\u001a\u00020\u0008R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"
    }
    d2 = {
        "Lcom/pymcl/ai/PermissionStore;",
        "",
        "file",
        "Ljava/io/File;",
        "<init>",
        "(Ljava/io/File;)V",
        "load",
        "",
        "",
        "Lcom/pymcl/core/util/JObj;",
        "empty",
        "rulesOf",
        "",
        "Lcom/pymcl/ai/PermissionRule;",
        "bucket",
        "scope",
        "global",
        "instance",
        "inst",
        "effective",
        "add",
        "",
        "rule",
        "remove",
        "key",
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


# instance fields
.field private final file:Ljava/io/File;


# direct methods
.method public static synthetic $r8$lambda$-j3XhcszPtaAsIyWSpOl_yHDako(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/internal/Ref$BooleanRef;Ljava/lang/Object;)Z
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/pymcl/ai/PermissionStore;->remove$lambda$0$1(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/internal/Ref$BooleanRef;Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static synthetic $r8$lambda$ug9sJ3NuyqqxZSVUimkF9h3EebI(Lcom/pymcl/ai/PermissionRule;Ljava/lang/Object;)Z
    .locals 0

    invoke-static {p0, p1}, Lcom/pymcl/ai/PermissionStore;->add$lambda$0$4(Lcom/pymcl/ai/PermissionRule;Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public constructor <init>(Ljava/io/File;)V
    .locals 1
    .param p1, "file"    # Ljava/io/File;

    const-string v0, "file"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 101
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/pymcl/ai/PermissionStore;->file:Ljava/io/File;

    return-void
.end method

.method private static final add$lambda$0$4(Lcom/pymcl/ai/PermissionRule;Ljava/lang/Object;)Z
    .locals 9
    .param p0, "$rule"    # Lcom/pymcl/ai/PermissionRule;
    .param p1, "e"    # Ljava/lang/Object;

    .line 126
    invoke-static {p1}, Lcom/pymcl/core/util/JsonKt;->o(Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    move-object v4, v0

    .line 144
    .local v4, "it":Ljava/util/Map;
    const/4 v0, 0x0

    .line 126
    .local v0, "$i$a$-let-PermissionStore$add$1$1$1":I
    sget-object v3, Lcom/pymcl/ai/PermissionRule;->Companion:Lcom/pymcl/ai/PermissionRule$Companion;

    const/4 v7, 0x4

    const/4 v8, 0x0

    const-string v5, ""

    const/4 v6, 0x0

    invoke-static/range {v3 .. v8}, Lcom/pymcl/ai/PermissionRule$Companion;->from$default(Lcom/pymcl/ai/PermissionRule$Companion;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/pymcl/ai/PermissionRule;

    move-result-object v3

    .line 144
    .local v3, "r":Lcom/pymcl/ai/PermissionRule;
    const/4 v5, 0x0

    .line 126
    .local v5, "$i$a$-let-PermissionStore$add$1$1$1$1":I
    invoke-virtual {v3}, Lcom/pymcl/ai/PermissionRule;->getToolName()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p0}, Lcom/pymcl/ai/PermissionRule;->getToolName()Ljava/lang/String;

    move-result-object v7

    invoke-static {v6, v7}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_0

    invoke-virtual {v3}, Lcom/pymcl/ai/PermissionRule;->getRuleContent()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p0}, Lcom/pymcl/ai/PermissionRule;->getRuleContent()Ljava/lang/String;

    move-result-object v7

    invoke-static {v6, v7}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_0

    move v3, v1

    goto :goto_0

    :cond_0
    move v3, v2

    .end local v0    # "$i$a$-let-PermissionStore$add$1$1$1":I
    .end local v3    # "r":Lcom/pymcl/ai/PermissionRule;
    .end local v4    # "it":Ljava/util/Map;
    .end local v5    # "$i$a$-let-PermissionStore$add$1$1$1$1":I
    :goto_0
    if-ne v3, v1, :cond_1

    move v0, v1

    goto :goto_1

    :cond_1
    move v0, v2

    :goto_1
    if-nez v0, :cond_4

    invoke-virtual {p0}, Lcom/pymcl/ai/PermissionRule;->getToolName()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p0}, Lcom/pymcl/ai/PermissionRule;->getRuleContent()Ljava/lang/String;

    move-result-object v0

    check-cast v0, Ljava/lang/CharSequence;

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_2

    move v0, v1

    goto :goto_2

    :cond_2
    move v0, v2

    :goto_2
    if-eqz v0, :cond_3

    goto :goto_3

    :cond_3
    move v1, v2

    :cond_4
    :goto_3
    return v1
.end method

.method private final empty()Ljava/util/Map;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 103
    const/4 v0, 0x3

    new-array v0, v0, [Lkotlin/Pair;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    check-cast v1, Ljava/util/List;

    const-string v2, "allow"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    check-cast v1, Ljava/util/List;

    const-string v2, "deny"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    check-cast v1, Ljava/util/List;

    const-string v2, "ask"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x2

    aput-object v1, v0, v2

    invoke-static {v0}, Lcom/pymcl/core/util/JsonKt;->jobj([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method private final load()Ljava/util/Map;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 102
    :try_start_0
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object v0, p0

    check-cast v0, Lcom/pymcl/ai/PermissionStore;

    .line 144
    .local v0, "$this$load_u24lambda_u240":Lcom/pymcl/ai/PermissionStore;
    const/4 v1, 0x0

    .line 102
    .local v1, "$i$a$-runCatching-PermissionStore$load$1":I
    sget-object v2, Lcom/pymcl/core/util/FileUtil;->INSTANCE:Lcom/pymcl/core/util/FileUtil;

    iget-object v3, v0, Lcom/pymcl/ai/PermissionStore;->file:Ljava/io/File;

    invoke-virtual {v2, v3}, Lcom/pymcl/core/util/FileUtil;->readJsonObj(Ljava/io/File;)Ljava/util/Map;

    move-result-object v2

    .end local v0    # "$this$load_u24lambda_u240":Lcom/pymcl/ai/PermissionStore;
    .end local v1    # "$i$a$-runCatching-PermissionStore$load$1":I
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
    check-cast v0, Ljava/util/Map;

    if-nez v0, :cond_1

    const/4 v0, 0x3

    new-array v0, v0, [Lkotlin/Pair;

    const-wide/16 v1, 0x1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const-string v2, "version"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "global"

    invoke-direct {p0}, Lcom/pymcl/ai/PermissionStore;->empty()Ljava/util/Map;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v3, 0x1

    aput-object v1, v0, v3

    new-array v1, v2, [Lkotlin/Pair;

    invoke-static {v1}, Lcom/pymcl/core/util/JsonKt;->jobj([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v1

    const-string v2, "per_instance"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x2

    aput-object v1, v0, v2

    invoke-static {v0}, Lcom/pymcl/core/util/JsonKt;->jobj([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v0

    :cond_1
    return-object v0
.end method

.method private static final remove$lambda$0$1(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/internal/Ref$BooleanRef;Ljava/lang/Object;)Z
    .locals 9
    .param p0, "$b"    # Ljava/lang/String;
    .param p1, "$key"    # Ljava/lang/String;
    .param p2, "$removed"    # Lkotlin/jvm/internal/Ref$BooleanRef;
    .param p3, "e"    # Ljava/lang/Object;

    .line 136
    instance-of v0, p3, Ljava/lang/String;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    new-instance v2, Lcom/pymcl/ai/PermissionRule;

    move-object v3, p3

    check-cast v3, Ljava/lang/String;

    const/16 v7, 0x8

    const/4 v8, 0x0

    const-string v4, ""

    const/4 v6, 0x0

    move-object v5, p0

    .end local p0    # "$b":Ljava/lang/String;
    .local v5, "$b":Ljava/lang/String;
    invoke-direct/range {v2 .. v8}, Lcom/pymcl/ai/PermissionRule;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_0

    .end local v5    # "$b":Ljava/lang/String;
    .restart local p0    # "$b":Ljava/lang/String;
    :cond_0
    move-object v5, p0

    .end local p0    # "$b":Ljava/lang/String;
    .restart local v5    # "$b":Ljava/lang/String;
    instance-of p0, p3, Ljava/util/Map;

    if-eqz p0, :cond_1

    sget-object p0, Lcom/pymcl/ai/PermissionRule;->Companion:Lcom/pymcl/ai/PermissionRule$Companion;

    invoke-static {p3}, Lcom/pymcl/core/util/JsonKt;->o(Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    const-string v2, ""

    invoke-virtual {p0, v0, v2, v5}, Lcom/pymcl/ai/PermissionRule$Companion;->from(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)Lcom/pymcl/ai/PermissionRule;

    move-result-object v2

    goto :goto_0

    :cond_1
    move-object v2, v1

    .line 137
    .local v2, "r":Lcom/pymcl/ai/PermissionRule;
    :goto_0
    if-eqz v2, :cond_2

    invoke-virtual {v2}, Lcom/pymcl/ai/PermissionRule;->getKey()Ljava/lang/String;

    move-result-object v1

    :cond_2
    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    move v0, p0

    .line 144
    .local v0, "it":Z
    const/4 v1, 0x0

    .line 137
    .local v1, "$i$a$-also-PermissionStore$remove$1$1$1":I
    if-eqz v0, :cond_3

    const/4 v3, 0x1

    iput-boolean v3, p2, Lkotlin/jvm/internal/Ref$BooleanRef;->element:Z

    .end local v0    # "it":Z
    .end local v1    # "$i$a$-also-PermissionStore$remove$1$1$1":I
    :cond_3
    return p0
.end method

.method private final rulesOf(Ljava/util/Map;Ljava/lang/String;)Ljava/util/List;
    .locals 27
    .param p1, "bucket"    # Ljava/util/Map;
    .param p2, "scope"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Lcom/pymcl/ai/PermissionRule;",
            ">;"
        }
    .end annotation

    .line 105
    move-object/from16 v0, p2

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/String;

    const/4 v2, 0x0

    const-string v3, "allow"

    aput-object v3, v1, v2

    const/4 v2, 0x1

    const-string v3, "deny"

    aput-object v3, v1, v2

    const/4 v2, 0x2

    const-string v3, "ask"

    aput-object v3, v1, v2

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    .local v1, "$this$flatMap$iv":Ljava/lang/Iterable;
    const/4 v2, 0x0

    .line 145
    .local v2, "$i$f$flatMap":I
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    check-cast v3, Ljava/util/Collection;

    .local v3, "destination$iv$iv":Ljava/util/Collection;
    move-object v4, v1

    .local v4, "$this$flatMapTo$iv$iv":Ljava/lang/Iterable;
    const/4 v5, 0x0

    .line 146
    .local v5, "$i$f$flatMapTo":I
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_5

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    .line 147
    .local v7, "element$iv$iv":Ljava/lang/Object;
    move-object v8, v7

    check-cast v8, Ljava/lang/String;

    .local v8, "b":Ljava/lang/String;
    const/4 v9, 0x0

    .line 106
    .local v9, "$i$a$-flatMap-PermissionStore$rulesOf$1":I
    move-object/from16 v10, p1

    invoke-static {v10, v8}, Lcom/pymcl/core/util/JsonKt;->arr(Ljava/util/Map;Ljava/lang/String;)Ljava/util/List;

    move-result-object v11

    if-nez v11, :cond_0

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v11

    :cond_0
    check-cast v11, Ljava/lang/Iterable;

    .local v11, "$this$mapNotNull$iv":Ljava/lang/Iterable;
    const/4 v12, 0x0

    .line 148
    .local v12, "$i$f$mapNotNull":I
    new-instance v13, Ljava/util/ArrayList;

    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    check-cast v13, Ljava/util/Collection;

    .local v13, "destination$iv$iv":Ljava/util/Collection;
    move-object v14, v11

    .local v14, "$this$mapNotNullTo$iv$iv":Ljava/lang/Iterable;
    const/4 v15, 0x0

    .line 157
    .local v15, "$i$f$mapNotNullTo":I
    move-object/from16 v16, v14

    .local v16, "$this$forEach$iv$iv$iv":Ljava/lang/Iterable;
    const/16 v17, 0x0

    .line 158
    .local v17, "$i$f$forEach":I
    invoke-interface/range {v16 .. v16}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v18

    :goto_1
    invoke-interface/range {v18 .. v18}, Ljava/util/Iterator;->hasNext()Z

    move-result v19

    if-eqz v19, :cond_4

    invoke-interface/range {v18 .. v18}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v19

    .local v19, "element$iv$iv$iv":Ljava/lang/Object;
    move-object/from16 v20, v19

    .local v20, "element$iv$iv":Ljava/lang/Object;
    const/16 v21, 0x0

    .line 157
    .local v21, "$i$a$-forEach-CollectionsKt___CollectionsKt$mapNotNullTo$1$iv$iv":I
    move-object/from16 v22, v20

    .local v22, "e":Ljava/lang/Object;
    const/16 v23, 0x0

    .line 107
    .local v23, "$i$a$-mapNotNull-PermissionStore$rulesOf$1$1":I
    nop

    .line 108
    move-object/from16 v24, v1

    move-object/from16 v1, v22

    move/from16 v22, v2

    .end local v2    # "$i$f$flatMap":I
    .local v1, "e":Ljava/lang/Object;
    .local v22, "$i$f$flatMap":I
    .local v24, "$this$flatMap$iv":Ljava/lang/Iterable;
    instance-of v2, v1, Ljava/lang/String;

    if-eqz v2, :cond_1

    new-instance v2, Lcom/pymcl/ai/PermissionRule;

    move-object/from16 v25, v4

    .end local v4    # "$this$flatMapTo$iv$iv":Ljava/lang/Iterable;
    .local v25, "$this$flatMapTo$iv$iv":Ljava/lang/Iterable;
    move-object v4, v1

    check-cast v4, Ljava/lang/String;

    move/from16 v26, v5

    .end local v5    # "$i$f$flatMapTo":I
    .local v26, "$i$f$flatMapTo":I
    const-string v5, ""

    invoke-direct {v2, v4, v5, v8, v0}, Lcom/pymcl/ai/PermissionRule;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_2

    .line 109
    .end local v25    # "$this$flatMapTo$iv$iv":Ljava/lang/Iterable;
    .end local v26    # "$i$f$flatMapTo":I
    .restart local v4    # "$this$flatMapTo$iv$iv":Ljava/lang/Iterable;
    .restart local v5    # "$i$f$flatMapTo":I
    :cond_1
    move-object/from16 v25, v4

    move/from16 v26, v5

    .end local v4    # "$this$flatMapTo$iv$iv":Ljava/lang/Iterable;
    .end local v5    # "$i$f$flatMapTo":I
    .restart local v25    # "$this$flatMapTo$iv$iv":Ljava/lang/Iterable;
    .restart local v26    # "$i$f$flatMapTo":I
    instance-of v2, v1, Ljava/util/Map;

    if-eqz v2, :cond_2

    sget-object v2, Lcom/pymcl/ai/PermissionRule;->Companion:Lcom/pymcl/ai/PermissionRule$Companion;

    invoke-static {v1}, Lcom/pymcl/core/util/JsonKt;->o(Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v4

    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v2, v4, v0, v8}, Lcom/pymcl/ai/PermissionRule$Companion;->from(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)Lcom/pymcl/ai/PermissionRule;

    move-result-object v2

    goto :goto_2

    .line 110
    :cond_2
    const/4 v2, 0x0

    .line 111
    :goto_2
    nop

    .line 157
    .end local v1    # "e":Ljava/lang/Object;
    .end local v23    # "$i$a$-mapNotNull-PermissionStore$rulesOf$1$1":I
    if-eqz v2, :cond_3

    .line 159
    .local v2, "it$iv$iv":Ljava/lang/Object;
    const/4 v1, 0x0

    .line 157
    .local v1, "$i$a$-let-CollectionsKt___CollectionsKt$mapNotNullTo$1$1$iv$iv":I
    invoke-interface {v13, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 158
    .end local v1    # "$i$a$-let-CollectionsKt___CollectionsKt$mapNotNullTo$1$1$iv$iv":I
    .end local v2    # "it$iv$iv":Ljava/lang/Object;
    .end local v20    # "element$iv$iv":Ljava/lang/Object;
    .end local v21    # "$i$a$-forEach-CollectionsKt___CollectionsKt$mapNotNullTo$1$iv$iv":I
    :cond_3
    move/from16 v2, v22

    move-object/from16 v1, v24

    move-object/from16 v4, v25

    move/from16 v5, v26

    .end local v19    # "element$iv$iv$iv":Ljava/lang/Object;
    goto :goto_1

    .line 160
    .end local v22    # "$i$f$flatMap":I
    .end local v24    # "$this$flatMap$iv":Ljava/lang/Iterable;
    .end local v25    # "$this$flatMapTo$iv$iv":Ljava/lang/Iterable;
    .end local v26    # "$i$f$flatMapTo":I
    .local v1, "$this$flatMap$iv":Ljava/lang/Iterable;
    .local v2, "$i$f$flatMap":I
    .restart local v4    # "$this$flatMapTo$iv$iv":Ljava/lang/Iterable;
    .restart local v5    # "$i$f$flatMapTo":I
    :cond_4
    move-object/from16 v24, v1

    move/from16 v22, v2

    move-object/from16 v25, v4

    move/from16 v26, v5

    .line 161
    .end local v1    # "$this$flatMap$iv":Ljava/lang/Iterable;
    .end local v2    # "$i$f$flatMap":I
    .end local v4    # "$this$flatMapTo$iv$iv":Ljava/lang/Iterable;
    .end local v5    # "$i$f$flatMapTo":I
    .end local v16    # "$this$forEach$iv$iv$iv":Ljava/lang/Iterable;
    .end local v17    # "$i$f$forEach":I
    .restart local v22    # "$i$f$flatMap":I
    .restart local v24    # "$this$flatMap$iv":Ljava/lang/Iterable;
    .restart local v25    # "$this$flatMapTo$iv$iv":Ljava/lang/Iterable;
    .restart local v26    # "$i$f$flatMapTo":I
    nop

    .end local v13    # "destination$iv$iv":Ljava/util/Collection;
    .end local v14    # "$this$mapNotNullTo$iv$iv":Ljava/lang/Iterable;
    .end local v15    # "$i$f$mapNotNullTo":I
    move-object v1, v13

    check-cast v1, Ljava/util/List;

    .line 148
    nop

    .end local v11    # "$this$mapNotNull$iv":Ljava/lang/Iterable;
    .end local v12    # "$i$f$mapNotNull":I
    check-cast v1, Ljava/lang/Iterable;

    .line 112
    nop

    .line 147
    .end local v8    # "b":Ljava/lang/String;
    .end local v9    # "$i$a$-flatMap-PermissionStore$rulesOf$1":I
    nop

    .line 162
    .local v1, "list$iv$iv":Ljava/lang/Iterable;
    invoke-static {v3, v1}, Lkotlin/collections/CollectionsKt;->addAll(Ljava/util/Collection;Ljava/lang/Iterable;)Z

    move-object/from16 v1, v24

    goto/16 :goto_0

    .line 164
    .end local v7    # "element$iv$iv":Ljava/lang/Object;
    .end local v22    # "$i$f$flatMap":I
    .end local v24    # "$this$flatMap$iv":Ljava/lang/Iterable;
    .end local v25    # "$this$flatMapTo$iv$iv":Ljava/lang/Iterable;
    .end local v26    # "$i$f$flatMapTo":I
    .local v1, "$this$flatMap$iv":Ljava/lang/Iterable;
    .restart local v2    # "$i$f$flatMap":I
    .restart local v4    # "$this$flatMapTo$iv$iv":Ljava/lang/Iterable;
    .restart local v5    # "$i$f$flatMapTo":I
    :cond_5
    move-object/from16 v24, v1

    .end local v1    # "$this$flatMap$iv":Ljava/lang/Iterable;
    .end local v3    # "destination$iv$iv":Ljava/util/Collection;
    .end local v4    # "$this$flatMapTo$iv$iv":Ljava/lang/Iterable;
    .end local v5    # "$i$f$flatMapTo":I
    .restart local v24    # "$this$flatMap$iv":Ljava/lang/Iterable;
    move-object v1, v3

    check-cast v1, Ljava/util/List;

    .line 145
    nop

    .line 113
    .end local v2    # "$i$f$flatMap":I
    .end local v24    # "$this$flatMap$iv":Ljava/lang/Iterable;
    return-object v1
.end method


# virtual methods
.method public final add(Lcom/pymcl/ai/PermissionRule;Ljava/lang/String;)Z
    .locals 12
    .param p1, "rule"    # Lcom/pymcl/ai/PermissionRule;
    .param p2, "inst"    # Ljava/lang/String;

    const-string v0, "rule"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "inst"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 120
    monitor-enter p0

    const/4 v0, 0x0

    .line 121
    .local v0, "$i$a$-synchronized-PermissionStore$add$1":I
    :try_start_0
    invoke-direct {p0}, Lcom/pymcl/ai/PermissionStore;->load()Ljava/util/Map;

    move-result-object v1

    .line 122
    .local v1, "m":Ljava/util/Map;
    invoke-virtual {p1}, Lcom/pymcl/ai/PermissionRule;->getScope()Ljava/lang/String;

    move-result-object v2

    const-string v3, "global"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    const/4 v3, 0x0

    if-nez v2, :cond_2

    :try_start_1
    move-object v2, p2

    check-cast v2, Ljava/lang/CharSequence;

    invoke-static {v2}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    .line 123
    :cond_0
    const-string v2, "per_instance"

    invoke-static {v1, v2}, Lcom/pymcl/core/util/JsonKt;->obj(Ljava/util/Map;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v2

    if-nez v2, :cond_1

    new-array v2, v3, [Lkotlin/Pair;

    invoke-static {v2}, Lcom/pymcl/core/util/JsonKt;->jobj([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v2

    move-object v4, v2

    .line 144
    .local v4, "it":Ljava/util/Map;
    const/4 v5, 0x0

    .line 123
    .local v5, "$i$a$-also-PermissionStore$add$1$bucket$pi$1":I
    const-string v6, "per_instance"

    invoke-interface {v1, v6, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .end local v4    # "it":Ljava/util/Map;
    .end local v5    # "$i$a$-also-PermissionStore$add$1$bucket$pi$1":I
    .local v2, "pi":Ljava/util/Map;
    :cond_1
    invoke-static {v2, p2}, Lcom/pymcl/core/util/JsonKt;->obj(Ljava/util/Map;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v4

    if-nez v4, :cond_3

    invoke-direct {p0}, Lcom/pymcl/ai/PermissionStore;->empty()Ljava/util/Map;

    move-result-object v4

    move-object v5, v4

    .line 144
    .local v5, "it":Ljava/util/Map;
    const/4 v6, 0x0

    .line 123
    .local v6, "$i$a$-also-PermissionStore$add$1$bucket$2":I
    invoke-interface {v2, p2, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .end local v5    # "it":Ljava/util/Map;
    .end local v6    # "$i$a$-also-PermissionStore$add$1$bucket$2":I
    goto :goto_1

    .line 120
    .end local v0    # "$i$a$-synchronized-PermissionStore$add$1":I
    .end local v1    # "m":Ljava/util/Map;
    .end local v2    # "pi":Ljava/util/Map;
    :catchall_0
    move-exception v0

    move-object v5, p1

    goto/16 :goto_5

    .line 122
    .restart local v0    # "$i$a$-synchronized-PermissionStore$add$1":I
    .restart local v1    # "m":Ljava/util/Map;
    :cond_2
    :goto_0
    :try_start_2
    const-string v2, "global"

    invoke-static {v1, v2}, Lcom/pymcl/core/util/JsonKt;->obj(Ljava/util/Map;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    if-nez v4, :cond_3

    :try_start_3
    invoke-direct {p0}, Lcom/pymcl/ai/PermissionStore;->empty()Ljava/util/Map;

    move-result-object v4

    move-object v2, v4

    .line 144
    .local v2, "it":Ljava/util/Map;
    const/4 v5, 0x0

    .line 122
    .local v5, "$i$a$-also-PermissionStore$add$1$bucket$1":I
    const-string v6, "global"

    invoke-interface {v1, v6, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .end local v2    # "it":Ljava/util/Map;
    .end local v5    # "$i$a$-also-PermissionStore$add$1$bucket$1":I
    :cond_3
    :goto_1
    nop

    .line 124
    .local v4, "bucket":Ljava/util/Map;
    :try_start_4
    invoke-virtual {p1}, Lcom/pymcl/ai/PermissionRule;->getBehavior()Ljava/lang/String;

    move-result-object v2

    invoke-static {v4, v2}, Lcom/pymcl/core/util/JsonKt;->arr(Ljava/util/Map;Ljava/lang/String;)Ljava/util/List;

    move-result-object v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    if-nez v2, :cond_4

    :try_start_5
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    check-cast v2, Ljava/util/List;

    move-object v5, v2

    .line 144
    .local v5, "it":Ljava/util/List;
    const/4 v6, 0x0

    .line 124
    .local v6, "$i$a$-also-PermissionStore$add$1$list$1":I
    invoke-virtual {p1}, Lcom/pymcl/ai/PermissionRule;->getBehavior()Ljava/lang/String;

    move-result-object v7

    invoke-interface {v4, v7, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 126
    .end local v5    # "it":Ljava/util/List;
    .end local v6    # "$i$a$-also-PermissionStore$add$1$list$1":I
    .local v2, "list":Ljava/util/List;
    :cond_4
    const/4 v5, 0x3

    :try_start_6
    new-array v5, v5, [Ljava/lang/String;

    const-string v6, "allow"

    aput-object v6, v5, v3

    const-string v3, "deny"

    const/4 v6, 0x1

    aput-object v3, v5, v6

    const-string v3, "ask"

    const/4 v6, 0x2

    aput-object v3, v5, v6

    invoke-static {v5}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_5
    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    if-eqz v5, :cond_6

    :try_start_7
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    .local v5, "b":Ljava/lang/String;
    invoke-static {v4, v5}, Lcom/pymcl/core/util/JsonKt;->arr(Ljava/util/Map;Ljava/lang/String;)Ljava/util/List;

    move-result-object v6

    if-eqz v6, :cond_5

    new-instance v7, Lcom/pymcl/ai/PermissionStore$$ExternalSyntheticLambda1;

    invoke-direct {v7, p1}, Lcom/pymcl/ai/PermissionStore$$ExternalSyntheticLambda1;-><init>(Lcom/pymcl/ai/PermissionRule;)V

    invoke-static {v6, v7}, Lkotlin/collections/CollectionsKt;->removeAll(Ljava/util/List;Lkotlin/jvm/functions/Function1;)Z
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    goto :goto_2

    .line 127
    .end local v5    # "b":Ljava/lang/String;
    :cond_6
    :try_start_8
    invoke-virtual {p1}, Lcom/pymcl/ai/PermissionRule;->getScope()Ljava/lang/String;

    move-result-object v3

    const-string v5, "global"

    invoke-static {v3, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    if-nez v3, :cond_8

    :try_start_9
    move-object v3, p2

    check-cast v3, Ljava/lang/CharSequence;

    invoke-static {v3}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_7

    goto :goto_3

    :cond_7
    const-string v3, "instance"
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    goto :goto_4

    :cond_8
    :goto_3
    :try_start_a
    const-string v3, "global"
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_2

    :goto_4
    move-object v9, v3

    const/4 v10, 0x7

    const/4 v11, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v5, p1

    .end local p1    # "rule":Lcom/pymcl/ai/PermissionRule;
    .local v5, "rule":Lcom/pymcl/ai/PermissionRule;
    :try_start_b
    invoke-static/range {v5 .. v11}, Lcom/pymcl/ai/PermissionRule;->copy$default(Lcom/pymcl/ai/PermissionRule;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/pymcl/ai/PermissionRule;

    move-result-object p1

    invoke-virtual {p1}, Lcom/pymcl/ai/PermissionRule;->toJson()Ljava/util/Map;

    move-result-object p1

    invoke-interface {v2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 128
    const-string p1, "version"

    const-wide/16 v6, 0x1

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-interface {v1, p1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 129
    sget-object p1, Lcom/pymcl/core/util/FileUtil;->INSTANCE:Lcom/pymcl/core/util/FileUtil;

    iget-object v3, p0, Lcom/pymcl/ai/PermissionStore;->file:Ljava/io/File;

    invoke-virtual {p1, v3, v1}, Lcom/pymcl/core/util/FileUtil;->writeJson(Ljava/io/File;Ljava/lang/Object;)Z

    move-result p1
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_1

    .line 120
    .end local v0    # "$i$a$-synchronized-PermissionStore$add$1":I
    .end local v1    # "m":Ljava/util/Map;
    .end local v2    # "list":Ljava/util/List;
    .end local v4    # "bucket":Ljava/util/Map;
    monitor-exit p0

    .line 130
    return p1

    .line 120
    :catchall_1
    move-exception v0

    goto :goto_5

    .end local v5    # "rule":Lcom/pymcl/ai/PermissionRule;
    .restart local p1    # "rule":Lcom/pymcl/ai/PermissionRule;
    :catchall_2
    move-exception v0

    move-object v5, p1

    .end local p1    # "rule":Lcom/pymcl/ai/PermissionRule;
    .restart local v5    # "rule":Lcom/pymcl/ai/PermissionRule;
    :goto_5
    monitor-exit p0

    throw v0
.end method

.method public final effective(Ljava/lang/String;)Ljava/util/List;
    .locals 2
    .param p1, "inst"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Lcom/pymcl/ai/PermissionRule;",
            ">;"
        }
    .end annotation

    const-string v0, "inst"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 118
    invoke-virtual {p0, p1}, Lcom/pymcl/ai/PermissionStore;->instance(Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    invoke-virtual {p0}, Lcom/pymcl/ai/PermissionStore;->global()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-static {v0, v1}, Lkotlin/collections/CollectionsKt;->plus(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final global()Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/pymcl/ai/PermissionRule;",
            ">;"
        }
    .end annotation

    .line 115
    monitor-enter p0

    .line 144
    const/4 v0, 0x0

    .line 115
    .local v0, "$i$a$-synchronized-PermissionStore$global$1":I
    :try_start_0
    invoke-direct {p0}, Lcom/pymcl/ai/PermissionStore;->load()Ljava/util/Map;

    move-result-object v1

    const-string v2, "global"

    invoke-static {v1, v2}, Lcom/pymcl/core/util/JsonKt;->obj(Ljava/util/Map;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v1

    const-string v2, "global"

    invoke-direct {p0, v1, v2}, Lcom/pymcl/ai/PermissionStore;->rulesOf(Ljava/util/Map;Ljava/lang/String;)Ljava/util/List;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .end local v0    # "$i$a$-synchronized-PermissionStore$global$1":I
    monitor-exit p0

    return-object v1

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final instance(Ljava/lang/String;)Ljava/util/List;
    .locals 3
    .param p1, "inst"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Lcom/pymcl/ai/PermissionRule;",
            ">;"
        }
    .end annotation

    const-string v0, "inst"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 116
    monitor-enter p0

    .line 144
    const/4 v0, 0x0

    .line 116
    .local v0, "$i$a$-synchronized-PermissionStore$instance$1":I
    :try_start_0
    move-object v1, p1

    check-cast v1, Ljava/lang/CharSequence;

    invoke-static {v1}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v1

    goto :goto_0

    :cond_0
    invoke-direct {p0}, Lcom/pymcl/ai/PermissionStore;->load()Ljava/util/Map;

    move-result-object v1

    const-string v2, "per_instance"

    invoke-static {v1, v2}, Lcom/pymcl/core/util/JsonKt;->obj(Ljava/util/Map;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v1

    invoke-static {v1, p1}, Lcom/pymcl/core/util/JsonKt;->obj(Ljava/util/Map;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v1

    const-string v2, "instance"

    invoke-direct {p0, v1, v2}, Lcom/pymcl/ai/PermissionStore;->rulesOf(Ljava/util/Map;Ljava/lang/String;)Ljava/util/List;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .end local v0    # "$i$a$-synchronized-PermissionStore$instance$1":I
    :goto_0
    monitor-exit p0

    return-object v1

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final remove(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 21
    .param p1, "key"    # Ljava/lang/String;
    .param p2, "inst"    # Ljava/lang/String;

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    const-string v0, "key"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "inst"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 132
    monitor-enter p0

    const/4 v0, 0x0

    .line 133
    .local v0, "$i$a$-synchronized-PermissionStore$remove$1":I
    :try_start_0
    invoke-direct {v1}, Lcom/pymcl/ai/PermissionStore;->load()Ljava/util/Map;

    move-result-object v4

    .local v4, "m":Ljava/util/Map;
    new-instance v5, Lkotlin/jvm/internal/Ref$BooleanRef;

    invoke-direct {v5}, Lkotlin/jvm/internal/Ref$BooleanRef;-><init>()V

    .line 134
    .local v5, "removed":Lkotlin/jvm/internal/Ref$BooleanRef;
    const-string v6, "global"

    invoke-static {v4, v6}, Lcom/pymcl/core/util/JsonKt;->obj(Ljava/util/Map;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v6

    invoke-static {v6}, Lkotlin/collections/CollectionsKt;->listOfNotNull(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v6

    check-cast v6, Ljava/util/Collection;

    move-object v7, v3

    check-cast v7, Ljava/lang/CharSequence;

    invoke-static {v7}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v7

    if-nez v7, :cond_0

    const-string v7, "per_instance"

    invoke-static {v4, v7}, Lcom/pymcl/core/util/JsonKt;->obj(Ljava/util/Map;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v7

    invoke-static {v7, v3}, Lcom/pymcl/core/util/JsonKt;->obj(Ljava/util/Map;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v7

    invoke-static {v7}, Lkotlin/collections/CollectionsKt;->listOfNotNull(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v7

    move/from16 v20, v0

    goto :goto_3

    :cond_0
    const-string v7, "per_instance"

    invoke-static {v4, v7}, Lcom/pymcl/core/util/JsonKt;->obj(Ljava/util/Map;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v7

    if-eqz v7, :cond_3

    invoke-interface {v7}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v7

    if-eqz v7, :cond_3

    check-cast v7, Ljava/lang/Iterable;

    .local v7, "$this$mapNotNull$iv":Ljava/lang/Iterable;
    const/4 v8, 0x0

    .line 165
    .local v8, "$i$f$mapNotNull":I
    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    check-cast v9, Ljava/util/Collection;

    .local v9, "destination$iv$iv":Ljava/util/Collection;
    move-object v10, v7

    .local v10, "$this$mapNotNullTo$iv$iv":Ljava/lang/Iterable;
    const/4 v11, 0x0

    .line 174
    .local v11, "$i$f$mapNotNullTo":I
    move-object v12, v10

    .local v12, "$this$forEach$iv$iv$iv":Ljava/lang/Iterable;
    const/4 v13, 0x0

    .line 175
    .local v13, "$i$f$forEach":I
    invoke-interface {v12}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v14

    :goto_0
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    move-result v15

    if-eqz v15, :cond_2

    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v15

    .local v15, "element$iv$iv$iv":Ljava/lang/Object;
    move-object/from16 v16, v15

    .local v16, "element$iv$iv":Ljava/lang/Object;
    const/16 v17, 0x0

    .line 174
    .local v17, "$i$a$-forEach-CollectionsKt___CollectionsKt$mapNotNullTo$1$iv$iv":I
    move-object/from16 v18, v16

    .local v18, "it":Ljava/lang/Object;
    const/16 v19, 0x0

    .line 134
    .local v19, "$i$a$-mapNotNull-PermissionStore$remove$1$buckets$1":I
    invoke-static/range {v18 .. v18}, Lcom/pymcl/core/util/JsonKt;->o(Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v20

    .line 174
    .end local v18    # "it":Ljava/lang/Object;
    .end local v19    # "$i$a$-mapNotNull-PermissionStore$remove$1$buckets$1":I
    if-eqz v20, :cond_1

    move-object/from16 v18, v20

    .line 176
    .local v18, "it$iv$iv":Ljava/lang/Object;
    const/16 v19, 0x0

    .line 174
    .local v19, "$i$a$-let-CollectionsKt___CollectionsKt$mapNotNullTo$1$1$iv$iv":I
    move/from16 v20, v0

    move-object/from16 v0, v18

    .end local v18    # "it$iv$iv":Ljava/lang/Object;
    .local v0, "it$iv$iv":Ljava/lang/Object;
    .local v20, "$i$a$-synchronized-PermissionStore$remove$1":I
    invoke-interface {v9, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .end local v0    # "it$iv$iv":Ljava/lang/Object;
    .end local v19    # "$i$a$-let-CollectionsKt___CollectionsKt$mapNotNullTo$1$1$iv$iv":I
    goto :goto_1

    .end local v20    # "$i$a$-synchronized-PermissionStore$remove$1":I
    .local v0, "$i$a$-synchronized-PermissionStore$remove$1":I
    :cond_1
    move/from16 v20, v0

    .line 175
    .end local v0    # "$i$a$-synchronized-PermissionStore$remove$1":I
    .end local v16    # "element$iv$iv":Ljava/lang/Object;
    .end local v17    # "$i$a$-forEach-CollectionsKt___CollectionsKt$mapNotNullTo$1$iv$iv":I
    .restart local v20    # "$i$a$-synchronized-PermissionStore$remove$1":I
    :goto_1
    move/from16 v0, v20

    .end local v15    # "element$iv$iv$iv":Ljava/lang/Object;
    goto :goto_0

    .line 177
    .end local v20    # "$i$a$-synchronized-PermissionStore$remove$1":I
    .restart local v0    # "$i$a$-synchronized-PermissionStore$remove$1":I
    :cond_2
    move/from16 v20, v0

    .line 178
    .end local v0    # "$i$a$-synchronized-PermissionStore$remove$1":I
    .end local v12    # "$this$forEach$iv$iv$iv":Ljava/lang/Iterable;
    .end local v13    # "$i$f$forEach":I
    .restart local v20    # "$i$a$-synchronized-PermissionStore$remove$1":I
    nop

    .end local v9    # "destination$iv$iv":Ljava/util/Collection;
    .end local v10    # "$this$mapNotNullTo$iv$iv":Ljava/lang/Iterable;
    .end local v11    # "$i$f$mapNotNullTo":I
    move-object v0, v9

    check-cast v0, Ljava/util/List;

    .line 165
    move-object v7, v0

    .end local v7    # "$this$mapNotNull$iv":Ljava/lang/Iterable;
    .end local v8    # "$i$f$mapNotNull":I
    goto :goto_2

    .line 134
    .end local v20    # "$i$a$-synchronized-PermissionStore$remove$1":I
    .restart local v0    # "$i$a$-synchronized-PermissionStore$remove$1":I
    :cond_3
    move/from16 v20, v0

    .end local v0    # "$i$a$-synchronized-PermissionStore$remove$1":I
    .restart local v20    # "$i$a$-synchronized-PermissionStore$remove$1":I
    const/4 v0, 0x0

    move-object v7, v0

    :goto_2
    if-nez v7, :cond_4

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v7

    :cond_4
    :goto_3
    check-cast v7, Ljava/lang/Iterable;

    invoke-static {v6, v7}, Lkotlin/collections/CollectionsKt;->plus(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    .line 135
    .local v0, "buckets":Ljava/util/List;
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_5
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_7

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/Map;

    .local v7, "bk":Ljava/util/Map;
    const/4 v8, 0x3

    new-array v8, v8, [Ljava/lang/String;

    const-string v9, "allow"

    const/4 v10, 0x0

    aput-object v9, v8, v10

    const-string v9, "deny"

    const/4 v10, 0x1

    aput-object v9, v8, v10

    const-string v9, "ask"

    const/4 v10, 0x2

    aput-object v9, v8, v10

    invoke-static {v8}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v8

    invoke-interface {v8}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :cond_6
    :goto_4
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_5

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/String;

    .line 136
    .local v9, "b":Ljava/lang/String;
    invoke-static {v7, v9}, Lcom/pymcl/core/util/JsonKt;->arr(Ljava/util/Map;Ljava/lang/String;)Ljava/util/List;

    move-result-object v10

    if-eqz v10, :cond_6

    new-instance v11, Lcom/pymcl/ai/PermissionStore$$ExternalSyntheticLambda0;

    invoke-direct {v11, v9, v2, v5}, Lcom/pymcl/ai/PermissionStore$$ExternalSyntheticLambda0;-><init>(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/internal/Ref$BooleanRef;)V

    invoke-static {v10, v11}, Lkotlin/collections/CollectionsKt;->removeAll(Ljava/util/List;Lkotlin/jvm/functions/Function1;)Z

    goto :goto_4

    .line 139
    .end local v7    # "bk":Ljava/util/Map;
    .end local v9    # "b":Ljava/lang/String;
    :cond_7
    iget-boolean v6, v5, Lkotlin/jvm/internal/Ref$BooleanRef;->element:Z

    if-eqz v6, :cond_8

    sget-object v6, Lcom/pymcl/core/util/FileUtil;->INSTANCE:Lcom/pymcl/core/util/FileUtil;

    iget-object v7, v1, Lcom/pymcl/ai/PermissionStore;->file:Ljava/io/File;

    invoke-virtual {v6, v7, v4}, Lcom/pymcl/core/util/FileUtil;->writeJson(Ljava/io/File;Ljava/lang/Object;)Z

    .line 140
    :cond_8
    iget-boolean v6, v5, Lkotlin/jvm/internal/Ref$BooleanRef;->element:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 132
    .end local v0    # "buckets":Ljava/util/List;
    .end local v4    # "m":Ljava/util/Map;
    .end local v5    # "removed":Lkotlin/jvm/internal/Ref$BooleanRef;
    .end local v20    # "$i$a$-synchronized-PermissionStore$remove$1":I
    monitor-exit p0

    .line 141
    return v6

    .line 132
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method
