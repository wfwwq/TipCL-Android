.class public final Lcom/pymcl/core/launch/LaunchArgsBuilder;
.super Ljava/lang/Object;
.source "LaunchArgs.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/pymcl/core/launch/LaunchArgsBuilder$WhenMappings;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nLaunchArgs.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LaunchArgs.kt\ncom/pymcl/core/launch/LaunchArgsBuilder\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,100:1\n1795#2,10:101\n2068#2:111\n2069#2:114\n1805#2:115\n1739#2:116\n1814#2,3:117\n2945#2,3:120\n1739#2:123\n1814#2,3:124\n1739#2:127\n1814#2,3:128\n1960#2,3:131\n777#2:134\n873#2,2:135\n777#2:137\n873#2,2:138\n2945#2,3:140\n1960#2,3:143\n1544#2:146\n1633#2,2:147\n1795#2,10:149\n2068#2:159\n2069#2:161\n1805#2:162\n1635#2,3:163\n1#3:112\n1#3:113\n1#3:160\n*S KotlinDebug\n*F\n+ 1 LaunchArgs.kt\ncom/pymcl/core/launch/LaunchArgsBuilder\n*L\n48#1:101,10\n48#1:111\n48#1:114\n48#1:115\n69#1:116\n69#1:117,3\n70#1:120,3\n72#1:123\n72#1:124,3\n73#1:127\n73#1:128,3\n74#1:131,3\n81#1:134\n81#1:135,2\n89#1:137\n89#1:138,2\n90#1:140,3\n94#1:143,3\n63#1:146\n63#1:147,2\n65#1:149,10\n65#1:159\n65#1:161\n65#1:162\n63#1:163,3\n48#1:113\n65#1:160\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0016\u0010\u0007\u001a\u00020\u00082\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u000cJ\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0005H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"
    }
    d2 = {
        "Lcom/pymcl/core/launch/LaunchArgsBuilder;",
        "",
        "<init>",
        "()V",
        "LAUNCHER_NAME",
        "",
        "LAUNCHER_VERSION",
        "build",
        "Lcom/pymcl/core/launch/LaunchSpec;",
        "v",
        "Lcom/pymcl/core/version/ResolvedVersion;",
        "o",
        "Lcom/pymcl/core/launch/LaunchOptions;",
        "compareMcSimple",
        "",
        "a",
        "b",
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
.field public static final INSTANCE:Lcom/pymcl/core/launch/LaunchArgsBuilder;

.field public static final LAUNCHER_NAME:Ljava/lang/String; = "PyMCL"

.field public static final LAUNCHER_VERSION:Ljava/lang/String; = "1.0.1"


# direct methods
.method public static synthetic $r8$lambda$S8DSfD8w8tiVEzGcxU9Cog6xcXs(Ljava/util/Map;Lkotlin/text/MatchResult;)Ljava/lang/CharSequence;
    .locals 0

    invoke-static {p0, p1}, Lcom/pymcl/core/launch/LaunchArgsBuilder;->build$sub$lambda$5(Ljava/util/Map;Lkotlin/text/MatchResult;)Ljava/lang/CharSequence;

    move-result-object p0

    return-object p0
.end method

.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/pymcl/core/launch/LaunchArgsBuilder;

    invoke-direct {v0}, Lcom/pymcl/core/launch/LaunchArgsBuilder;-><init>()V

    sput-object v0, Lcom/pymcl/core/launch/LaunchArgsBuilder;->INSTANCE:Lcom/pymcl/core/launch/LaunchArgsBuilder;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 41
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static final build$expand(Lcom/pymcl/core/version/RuleEnv;Ljava/util/List;)Ljava/util/List;
    .locals 26
    .param p0, "env"    # Lcom/pymcl/core/version/RuleEnv;
    .param p1, "a"    # Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/pymcl/core/version/RuleEnv;",
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;)",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 63
    if-eqz p1, :cond_9

    move-object/from16 v0, p1

    check-cast v0, Ljava/lang/Iterable;

    .local v0, "$this$flatMap$iv":Ljava/lang/Iterable;
    const/4 v1, 0x0

    .line 146
    .local v1, "$i$f$flatMap":I
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    check-cast v2, Ljava/util/Collection;

    .local v2, "destination$iv$iv":Ljava/util/Collection;
    move-object v3, v0

    .local v3, "$this$flatMapTo$iv$iv":Ljava/lang/Iterable;
    const/4 v4, 0x0

    .line 147
    .local v4, "$i$f$flatMapTo":I
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_8

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    .line 148
    .local v6, "element$iv$iv":Ljava/lang/Object;
    move-object v7, v6

    .local v7, "x":Ljava/lang/Object;
    const/4 v8, 0x0

    .line 63
    .local v8, "$i$a$-flatMap-LaunchArgsBuilder$build$expand$1":I
    nop

    .line 64
    instance-of v9, v7, Ljava/lang/String;

    if-eqz v9, :cond_0

    invoke-static {v7}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v9

    move-object/from16 v11, p0

    move-object/from16 v25, v0

    move/from16 v23, v1

    goto/16 :goto_4

    .line 65
    :cond_0
    instance-of v9, v7, Ljava/util/Map;

    if-eqz v9, :cond_7

    sget-object v9, Lcom/pymcl/core/version/Rules;->INSTANCE:Lcom/pymcl/core/version/Rules;

    invoke-static {v7}, Lcom/pymcl/core/util/JsonKt;->o(Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v10

    const-string v11, "rules"

    invoke-static {v10, v11}, Lcom/pymcl/core/util/JsonKt;->arr(Ljava/util/Map;Ljava/lang/String;)Ljava/util/List;

    move-result-object v10

    move-object/from16 v11, p0

    invoke-virtual {v9, v10, v11}, Lcom/pymcl/core/version/Rules;->allowed(Ljava/util/List;Lcom/pymcl/core/version/RuleEnv;)Z

    move-result v9

    if-eqz v9, :cond_6

    move-object v9, v7

    check-cast v9, Ljava/util/Map;

    const-string v10, "value"

    invoke-interface {v9, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    .line 112
    .local v9, "vv":Ljava/lang/Object;
    const/4 v10, 0x0

    .line 65
    .local v10, "$i$a$-let-LaunchArgsBuilder$build$expand$1$1":I
    instance-of v12, v9, Ljava/lang/String;

    if-eqz v12, :cond_1

    invoke-static {v9}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v12

    move-object/from16 v25, v0

    move/from16 v23, v1

    move-object v9, v12

    goto/16 :goto_4

    :cond_1
    invoke-static {v9}, Lcom/pymcl/core/util/JsonKt;->a(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v12

    if-eqz v12, :cond_5

    check-cast v12, Ljava/lang/Iterable;

    .local v12, "$this$mapNotNull$iv":Ljava/lang/Iterable;
    const/4 v13, 0x0

    .line 149
    .local v13, "$i$f$mapNotNull":I
    new-instance v14, Ljava/util/ArrayList;

    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    check-cast v14, Ljava/util/Collection;

    .local v14, "destination$iv$iv":Ljava/util/Collection;
    move-object v15, v12

    .local v15, "$this$mapNotNullTo$iv$iv":Ljava/lang/Iterable;
    const/16 v16, 0x0

    .line 158
    .local v16, "$i$f$mapNotNullTo":I
    move-object/from16 v17, v15

    .local v17, "$this$forEach$iv$iv$iv":Ljava/lang/Iterable;
    const/16 v18, 0x0

    .line 159
    .local v18, "$i$f$forEach":I
    invoke-interface/range {v17 .. v17}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v19

    :goto_1
    invoke-interface/range {v19 .. v19}, Ljava/util/Iterator;->hasNext()Z

    move-result v20

    if-eqz v20, :cond_4

    invoke-interface/range {v19 .. v19}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v20

    .local v20, "element$iv$iv$iv":Ljava/lang/Object;
    move-object/from16 v21, v20

    .local v21, "element$iv$iv":Ljava/lang/Object;
    const/16 v22, 0x0

    .line 158
    .local v22, "$i$a$-forEach-CollectionsKt___CollectionsKt$mapNotNullTo$1$iv$iv":I
    move-object/from16 v23, v21

    .local v23, "it":Ljava/lang/Object;
    const/16 v24, 0x0

    .line 65
    .local v24, "$i$a$-mapNotNull-LaunchArgsBuilder$build$expand$1$1$1":I
    move-object/from16 v25, v0

    move-object/from16 v0, v23

    move/from16 v23, v1

    .end local v1    # "$i$f$flatMap":I
    .local v0, "it":Ljava/lang/Object;
    .local v23, "$i$f$flatMap":I
    .local v25, "$this$flatMap$iv":Ljava/lang/Iterable;
    instance-of v1, v0, Ljava/lang/String;

    if-eqz v1, :cond_2

    move-object v1, v0

    check-cast v1, Ljava/lang/String;

    goto :goto_2

    :cond_2
    const/4 v1, 0x0

    .line 158
    .end local v0    # "it":Ljava/lang/Object;
    .end local v24    # "$i$a$-mapNotNull-LaunchArgsBuilder$build$expand$1$1$1":I
    :goto_2
    if-eqz v1, :cond_3

    .line 160
    .local v1, "it$iv$iv":Ljava/lang/Object;
    const/4 v0, 0x0

    .line 158
    .local v0, "$i$a$-let-CollectionsKt___CollectionsKt$mapNotNullTo$1$1$iv$iv":I
    invoke-interface {v14, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 159
    .end local v0    # "$i$a$-let-CollectionsKt___CollectionsKt$mapNotNullTo$1$1$iv$iv":I
    .end local v1    # "it$iv$iv":Ljava/lang/Object;
    .end local v21    # "element$iv$iv":Ljava/lang/Object;
    .end local v22    # "$i$a$-forEach-CollectionsKt___CollectionsKt$mapNotNullTo$1$iv$iv":I
    :cond_3
    move/from16 v1, v23

    move-object/from16 v0, v25

    .end local v20    # "element$iv$iv$iv":Ljava/lang/Object;
    goto :goto_1

    .line 161
    .end local v23    # "$i$f$flatMap":I
    .end local v25    # "$this$flatMap$iv":Ljava/lang/Iterable;
    .local v0, "$this$flatMap$iv":Ljava/lang/Iterable;
    .local v1, "$i$f$flatMap":I
    :cond_4
    move-object/from16 v25, v0

    move/from16 v23, v1

    .line 162
    .end local v0    # "$this$flatMap$iv":Ljava/lang/Iterable;
    .end local v1    # "$i$f$flatMap":I
    .end local v17    # "$this$forEach$iv$iv$iv":Ljava/lang/Iterable;
    .end local v18    # "$i$f$forEach":I
    .restart local v23    # "$i$f$flatMap":I
    .restart local v25    # "$this$flatMap$iv":Ljava/lang/Iterable;
    nop

    .end local v14    # "destination$iv$iv":Ljava/util/Collection;
    .end local v15    # "$this$mapNotNullTo$iv$iv":Ljava/lang/Iterable;
    .end local v16    # "$i$f$mapNotNullTo":I
    move-object v0, v14

    check-cast v0, Ljava/util/List;

    .line 149
    nop

    .line 65
    .end local v12    # "$this$mapNotNull$iv":Ljava/lang/Iterable;
    .end local v13    # "$i$f$mapNotNull":I
    goto :goto_3

    .end local v23    # "$i$f$flatMap":I
    .end local v25    # "$this$flatMap$iv":Ljava/lang/Iterable;
    .restart local v0    # "$this$flatMap$iv":Ljava/lang/Iterable;
    .restart local v1    # "$i$f$flatMap":I
    :cond_5
    move-object/from16 v25, v0

    move/from16 v23, v1

    .end local v0    # "$this$flatMap$iv":Ljava/lang/Iterable;
    .end local v1    # "$i$f$flatMap":I
    .restart local v23    # "$i$f$flatMap":I
    .restart local v25    # "$this$flatMap$iv":Ljava/lang/Iterable;
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v0

    :goto_3
    move-object v9, v0

    goto :goto_4

    .end local v9    # "vv":Ljava/lang/Object;
    .end local v10    # "$i$a$-let-LaunchArgsBuilder$build$expand$1$1":I
    .end local v23    # "$i$f$flatMap":I
    .end local v25    # "$this$flatMap$iv":Ljava/lang/Iterable;
    .restart local v0    # "$this$flatMap$iv":Ljava/lang/Iterable;
    .restart local v1    # "$i$f$flatMap":I
    :cond_6
    move-object/from16 v25, v0

    move/from16 v23, v1

    .end local v0    # "$this$flatMap$iv":Ljava/lang/Iterable;
    .end local v1    # "$i$f$flatMap":I
    .restart local v23    # "$i$f$flatMap":I
    .restart local v25    # "$this$flatMap$iv":Ljava/lang/Iterable;
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v9

    goto :goto_4

    .line 66
    .end local v23    # "$i$f$flatMap":I
    .end local v25    # "$this$flatMap$iv":Ljava/lang/Iterable;
    .restart local v0    # "$this$flatMap$iv":Ljava/lang/Iterable;
    .restart local v1    # "$i$f$flatMap":I
    :cond_7
    move-object/from16 v11, p0

    move-object/from16 v25, v0

    move/from16 v23, v1

    .end local v0    # "$this$flatMap$iv":Ljava/lang/Iterable;
    .end local v1    # "$i$f$flatMap":I
    .restart local v23    # "$i$f$flatMap":I
    .restart local v25    # "$this$flatMap$iv":Ljava/lang/Iterable;
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v9

    :goto_4
    check-cast v9, Ljava/lang/Iterable;

    .line 148
    .end local v7    # "x":Ljava/lang/Object;
    .end local v8    # "$i$a$-flatMap-LaunchArgsBuilder$build$expand$1":I
    nop

    .line 163
    .local v9, "list$iv$iv":Ljava/lang/Iterable;
    invoke-static {v2, v9}, Lkotlin/collections/CollectionsKt;->addAll(Ljava/util/Collection;Ljava/lang/Iterable;)Z

    move/from16 v1, v23

    move-object/from16 v0, v25

    goto/16 :goto_0

    .line 165
    .end local v6    # "element$iv$iv":Ljava/lang/Object;
    .end local v9    # "list$iv$iv":Ljava/lang/Iterable;
    .end local v23    # "$i$f$flatMap":I
    .end local v25    # "$this$flatMap$iv":Ljava/lang/Iterable;
    .restart local v0    # "$this$flatMap$iv":Ljava/lang/Iterable;
    .restart local v1    # "$i$f$flatMap":I
    :cond_8
    move-object/from16 v11, p0

    move-object/from16 v25, v0

    move/from16 v23, v1

    .end local v0    # "$this$flatMap$iv":Ljava/lang/Iterable;
    .end local v1    # "$i$f$flatMap":I
    .end local v2    # "destination$iv$iv":Ljava/util/Collection;
    .end local v3    # "$this$flatMapTo$iv$iv":Ljava/lang/Iterable;
    .end local v4    # "$i$f$flatMapTo":I
    .restart local v23    # "$i$f$flatMap":I
    .restart local v25    # "$this$flatMap$iv":Ljava/lang/Iterable;
    move-object v0, v2

    check-cast v0, Ljava/util/List;

    .line 146
    nop

    .line 63
    .end local v23    # "$i$f$flatMap":I
    .end local v25    # "$this$flatMap$iv":Ljava/lang/Iterable;
    goto :goto_5

    .line 66
    :cond_9
    move-object/from16 v11, p0

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v0

    :goto_5
    return-object v0
.end method

.method private static final build$sub(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;
    .locals 3
    .param p0, "vars"    # Ljava/util/Map;
    .param p1, "s"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            ")",
            "Ljava/lang/String;"
        }
    .end annotation

    .line 62
    new-instance v0, Lkotlin/text/Regex;

    const-string v1, "[$][{]([a-zA-Z_]+)[}]"

    invoke-direct {v0, v1}, Lkotlin/text/Regex;-><init>(Ljava/lang/String;)V

    move-object v1, p1

    check-cast v1, Ljava/lang/CharSequence;

    new-instance v2, Lcom/pymcl/core/launch/LaunchArgsBuilder$$ExternalSyntheticLambda0;

    invoke-direct {v2, p0}, Lcom/pymcl/core/launch/LaunchArgsBuilder$$ExternalSyntheticLambda0;-><init>(Ljava/util/Map;)V

    invoke-virtual {v0, v1, v2}, Lkotlin/text/Regex;->replace(Ljava/lang/CharSequence;Lkotlin/jvm/functions/Function1;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private static final build$sub$lambda$5(Ljava/util/Map;Lkotlin/text/MatchResult;)Ljava/lang/CharSequence;
    .locals 3
    .param p0, "$vars"    # Ljava/util/Map;
    .param p1, "m"    # Lkotlin/text/MatchResult;

    const-string v0, "m"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 62
    invoke-interface {p1}, Lkotlin/text/MatchResult;->getGroupValues()Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p0, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 112
    .local v0, "it":Ljava/lang/String;
    const/4 v1, 0x0

    .line 62
    .local v1, "$i$a$-let-LaunchArgsBuilder$build$sub$1$1":I
    sget-object v2, Lkotlin/text/Regex;->Companion:Lkotlin/text/Regex$Companion;

    invoke-virtual {v2, v0}, Lkotlin/text/Regex$Companion;->escapeReplacement(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .end local v0    # "it":Ljava/lang/String;
    .end local v1    # "$i$a$-let-LaunchArgsBuilder$build$sub$1$1":I
    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p1}, Lkotlin/text/MatchResult;->getValue()Ljava/lang/String;

    move-result-object v0

    :goto_0
    check-cast v0, Ljava/lang/CharSequence;

    return-object v0
.end method

.method private final compareMcSimple(Ljava/lang/String;Ljava/lang/String;)I
    .locals 1
    .param p1, "a"    # Ljava/lang/String;
    .param p2, "b"    # Ljava/lang/String;

    .line 98
    invoke-static {p1, p2}, Lcom/pymcl/core/loader/LoadersKt;->compareMc(Ljava/lang/String;Ljava/lang/String;)I

    move-result v0

    return v0
.end method


# virtual methods
.method public final build(Lcom/pymcl/core/version/ResolvedVersion;Lcom/pymcl/core/launch/LaunchOptions;)Lcom/pymcl/core/launch/LaunchSpec;
    .locals 46
    .param p1, "v"    # Lcom/pymcl/core/version/ResolvedVersion;
    .param p2, "o"    # Lcom/pymcl/core/launch/LaunchOptions;

    move-object/from16 v0, p1

    const-string v1, "v"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "o"

    move-object/from16 v2, p2

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 45
    const-string v1, ":"

    .line 46
    .local v1, "sep":Ljava/lang/String;
    invoke-virtual {v2}, Lcom/pymcl/core/launch/LaunchOptions;->getEnv()Lcom/pymcl/core/version/RuleEnv;

    move-result-object v3

    invoke-virtual {v0, v3}, Lcom/pymcl/core/version/ResolvedVersion;->libraries(Lcom/pymcl/core/version/RuleEnv;)Ljava/util/List;

    move-result-object v3

    .line 48
    .local v3, "libs":Ljava/util/List;
    move-object v4, v3

    check-cast v4, Ljava/lang/Iterable;

    .local v4, "$this$mapNotNull$iv":Ljava/lang/Iterable;
    const/4 v5, 0x0

    .line 101
    .local v5, "$i$f$mapNotNull":I
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    check-cast v6, Ljava/util/Collection;

    .local v6, "destination$iv$iv":Ljava/util/Collection;
    move-object v7, v4

    .local v7, "$this$mapNotNullTo$iv$iv":Ljava/lang/Iterable;
    const/4 v8, 0x0

    .line 110
    .local v8, "$i$f$mapNotNullTo":I
    move-object v9, v7

    .local v9, "$this$forEach$iv$iv$iv":Ljava/lang/Iterable;
    const/4 v10, 0x0

    .line 111
    .local v10, "$i$f$forEach":I
    invoke-interface {v9}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :goto_0
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_2

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    .local v12, "element$iv$iv$iv":Ljava/lang/Object;
    move-object v14, v12

    .local v14, "element$iv$iv":Ljava/lang/Object;
    const/4 v15, 0x0

    .line 110
    .local v15, "$i$a$-forEach-CollectionsKt___CollectionsKt$mapNotNullTo$1$iv$iv":I
    move-object/from16 v16, v14

    check-cast v16, Lcom/pymcl/core/version/Library;

    .local v16, "it":Lcom/pymcl/core/version/Library;
    const/16 v17, 0x0

    .line 48
    .local v17, "$i$a$-mapNotNull-LaunchArgsBuilder$build$cp$1":I
    invoke-virtual/range {v16 .. v16}, Lcom/pymcl/core/version/Library;->getArtifact()Lcom/pymcl/core/version/Artifact;

    move-result-object v18

    if-eqz v18, :cond_0

    .line 112
    .local v18, "a":Lcom/pymcl/core/version/Artifact;
    const/4 v13, 0x0

    .line 48
    .local v13, "$i$a$-let-LaunchArgsBuilder$build$cp$1$1":I
    sget-object v0, Lcom/pymcl/core/util/FileUtil;->INSTANCE:Lcom/pymcl/core/util/FileUtil;

    new-instance v2, Ljava/io/File;

    invoke-virtual/range {p2 .. p2}, Lcom/pymcl/core/launch/LaunchOptions;->getDirs()Lcom/pymcl/core/version/GameDirs;

    move-result-object v19

    move-object/from16 v20, v3

    .end local v3    # "libs":Ljava/util/List;
    .local v20, "libs":Ljava/util/List;
    invoke-virtual/range {v19 .. v19}, Lcom/pymcl/core/version/GameDirs;->getLibrariesDir()Ljava/io/File;

    move-result-object v3

    move-object/from16 v19, v4

    .end local v4    # "$this$mapNotNull$iv":Ljava/lang/Iterable;
    .local v19, "$this$mapNotNull$iv":Ljava/lang/Iterable;
    invoke-virtual/range {v18 .. v18}, Lcom/pymcl/core/version/Artifact;->getPath()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v2, v3, v4}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v0, v2}, Lcom/pymcl/core/util/FileUtil;->toLaunchPath(Ljava/io/File;)Ljava/lang/String;

    move-result-object v13

    .end local v13    # "$i$a$-let-LaunchArgsBuilder$build$cp$1$1":I
    .end local v18    # "a":Lcom/pymcl/core/version/Artifact;
    goto :goto_1

    .end local v19    # "$this$mapNotNull$iv":Ljava/lang/Iterable;
    .end local v20    # "libs":Ljava/util/List;
    .restart local v3    # "libs":Ljava/util/List;
    .restart local v4    # "$this$mapNotNull$iv":Ljava/lang/Iterable;
    :cond_0
    move-object/from16 v20, v3

    move-object/from16 v19, v4

    .end local v3    # "libs":Ljava/util/List;
    .end local v4    # "$this$mapNotNull$iv":Ljava/lang/Iterable;
    .restart local v19    # "$this$mapNotNull$iv":Ljava/lang/Iterable;
    .restart local v20    # "libs":Ljava/util/List;
    const/4 v13, 0x0

    .line 110
    .end local v16    # "it":Lcom/pymcl/core/version/Library;
    .end local v17    # "$i$a$-mapNotNull-LaunchArgsBuilder$build$cp$1":I
    :goto_1
    if-eqz v13, :cond_1

    .line 113
    .local v13, "it$iv$iv":Ljava/lang/Object;
    const/4 v0, 0x0

    .line 110
    .local v0, "$i$a$-let-CollectionsKt___CollectionsKt$mapNotNullTo$1$1$iv$iv":I
    invoke-interface {v6, v13}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 111
    .end local v0    # "$i$a$-let-CollectionsKt___CollectionsKt$mapNotNullTo$1$1$iv$iv":I
    .end local v13    # "it$iv$iv":Ljava/lang/Object;
    .end local v14    # "element$iv$iv":Ljava/lang/Object;
    .end local v15    # "$i$a$-forEach-CollectionsKt___CollectionsKt$mapNotNullTo$1$iv$iv":I
    :cond_1
    move-object/from16 v0, p1

    move-object/from16 v2, p2

    move-object/from16 v4, v19

    move-object/from16 v3, v20

    .end local v12    # "element$iv$iv$iv":Ljava/lang/Object;
    goto :goto_0

    .line 114
    .end local v19    # "$this$mapNotNull$iv":Ljava/lang/Iterable;
    .end local v20    # "libs":Ljava/util/List;
    .restart local v3    # "libs":Ljava/util/List;
    .restart local v4    # "$this$mapNotNull$iv":Ljava/lang/Iterable;
    :cond_2
    move-object/from16 v20, v3

    move-object/from16 v19, v4

    .line 115
    .end local v3    # "libs":Ljava/util/List;
    .end local v4    # "$this$mapNotNull$iv":Ljava/lang/Iterable;
    .end local v9    # "$this$forEach$iv$iv$iv":Ljava/lang/Iterable;
    .end local v10    # "$i$f$forEach":I
    .restart local v19    # "$this$mapNotNull$iv":Ljava/lang/Iterable;
    .restart local v20    # "libs":Ljava/util/List;
    nop

    .end local v6    # "destination$iv$iv":Ljava/util/Collection;
    .end local v7    # "$this$mapNotNullTo$iv$iv":Ljava/lang/Iterable;
    .end local v8    # "$i$f$mapNotNullTo":I
    move-object v0, v6

    check-cast v0, Ljava/util/List;

    .line 101
    nop

    .end local v5    # "$i$f$mapNotNull":I
    .end local v19    # "$this$mapNotNull$iv":Ljava/lang/Iterable;
    check-cast v0, Ljava/lang/Iterable;

    .line 48
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->distinct(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    sget-object v2, Lcom/pymcl/core/util/FileUtil;->INSTANCE:Lcom/pymcl/core/util/FileUtil;

    new-instance v3, Ljava/io/File;

    invoke-virtual/range {p2 .. p2}, Lcom/pymcl/core/launch/LaunchOptions;->getDirs()Lcom/pymcl/core/version/GameDirs;

    move-result-object v4

    invoke-virtual {v4}, Lcom/pymcl/core/version/GameDirs;->getVersionsDir()Ljava/io/File;

    move-result-object v4

    invoke-virtual/range {p1 .. p1}, Lcom/pymcl/core/version/ResolvedVersion;->getJarId()Ljava/lang/String;

    move-result-object v5

    invoke-virtual/range {p1 .. p1}, Lcom/pymcl/core/version/ResolvedVersion;->getJarId()Ljava/lang/String;

    move-result-object v6

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    const-string v7, "/"

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    const-string v6, ".jar"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v3, v4, v5}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v2, v3}, Lcom/pymcl/core/util/FileUtil;->toLaunchPath(Ljava/io/File;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Lkotlin/collections/CollectionsKt;->plus(Ljava/util/Collection;Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    .line 49
    .local v0, "cp":Ljava/util/List;
    sget-object v2, Lcom/pymcl/core/util/FileUtil;->INSTANCE:Lcom/pymcl/core/util/FileUtil;

    invoke-virtual/range {p2 .. p2}, Lcom/pymcl/core/launch/LaunchOptions;->getDirs()Lcom/pymcl/core/version/GameDirs;

    move-result-object v3

    invoke-virtual/range {p1 .. p1}, Lcom/pymcl/core/version/ResolvedVersion;->getId()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/pymcl/core/version/GameDirs;->nativesDir(Ljava/lang/String;)Ljava/io/File;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/pymcl/core/util/FileUtil;->toLaunchPath(Ljava/io/File;)Ljava/lang/String;

    move-result-object v2

    .line 50
    .local v2, "natives":Ljava/lang/String;
    invoke-virtual/range {p2 .. p2}, Lcom/pymcl/core/launch/LaunchOptions;->getWidth()I

    move-result v3

    .local v3, "w":I
    invoke-virtual/range {p2 .. p2}, Lcom/pymcl/core/launch/LaunchOptions;->getHeight()I

    move-result v4

    .line 51
    .local v4, "h":I
    invoke-virtual/range {p2 .. p2}, Lcom/pymcl/core/launch/LaunchOptions;->getFullscreen()Z

    move-result v5

    if-eqz v5, :cond_3

    const/16 v5, 0x500

    invoke-static {v3, v5}, Ljava/lang/Math;->max(II)I

    move-result v3

    const/16 v5, 0x2d0

    invoke-static {v4, v5}, Ljava/lang/Math;->max(II)I

    move-result v4

    .line 52
    :cond_3
    invoke-virtual/range {p2 .. p2}, Lcom/pymcl/core/launch/LaunchOptions;->getAccount()Lcom/pymcl/core/account/Account;

    move-result-object v5

    .line 53
    .local v5, "acc":Lcom/pymcl/core/account/Account;
    invoke-virtual {v5}, Lcom/pymcl/core/account/Account;->getUuid()Ljava/lang/String;

    move-result-object v6

    check-cast v6, Ljava/lang/CharSequence;

    invoke-interface {v6}, Ljava/lang/CharSequence;->length()I

    move-result v7

    const/4 v8, 0x1

    const/4 v9, 0x0

    if-nez v7, :cond_4

    move v7, v8

    goto :goto_2

    :cond_4
    move v7, v9

    :goto_2
    if-eqz v7, :cond_5

    .line 112
    const/4 v6, 0x0

    .line 53
    .local v6, "$i$a$-ifEmpty-LaunchArgsBuilder$build$uuid$1":I
    nop

    .end local v6    # "$i$a$-ifEmpty-LaunchArgsBuilder$build$uuid$1":I
    const-string v6, "00000000-0000-0000-0000-000000000000"

    :cond_5
    check-cast v6, Ljava/lang/String;

    .line 54
    .local v6, "uuid":Ljava/lang/String;
    invoke-virtual {v5}, Lcom/pymcl/core/account/Account;->getAccessToken()Ljava/lang/String;

    move-result-object v7

    check-cast v7, Ljava/lang/CharSequence;

    invoke-interface {v7}, Ljava/lang/CharSequence;->length()I

    move-result v10

    if-nez v10, :cond_6

    move v10, v8

    goto :goto_3

    :cond_6
    move v10, v9

    :goto_3
    const-string v11, "0"

    if-eqz v10, :cond_7

    .line 112
    const/4 v7, 0x0

    .line 54
    .local v7, "$i$a$-ifEmpty-LaunchArgsBuilder$build$tok$1":I
    move-object v7, v11

    .end local v7    # "$i$a$-ifEmpty-LaunchArgsBuilder$build$tok$1":I
    :cond_7
    check-cast v7, Ljava/lang/String;

    .line 55
    .local v7, "tok":Ljava/lang/String;
    const/16 v10, 0x17

    new-array v10, v10, [Lkotlin/Pair;

    const-string v12, "auth_player_name"

    invoke-virtual {v5}, Lcom/pymcl/core/account/Account;->getName()Ljava/lang/String;

    move-result-object v14

    invoke-static {v12, v14}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v12

    aput-object v12, v10, v9

    const-string v12, "auth_uuid"

    invoke-static {v12, v6}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v12

    aput-object v12, v10, v8

    const-string v12, "auth_access_token"

    invoke-static {v12, v7}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v12

    const/4 v14, 0x2

    aput-object v12, v10, v14

    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    const-string v15, "token:"

    invoke-virtual {v12, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v12

    invoke-virtual {v12, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v12

    const-string v15, ":"

    invoke-virtual {v12, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v12

    invoke-virtual {v12, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v12

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v12

    const-string v15, "auth_session"

    invoke-static {v15, v12}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v12

    const/4 v15, 0x3

    aput-object v12, v10, v15

    .line 56
    invoke-virtual {v5}, Lcom/pymcl/core/account/Account;->getType()Lcom/pymcl/core/account/AccountType;

    move-result-object v12

    invoke-virtual {v12}, Lcom/pymcl/core/account/AccountType;->getUserType()Ljava/lang/String;

    move-result-object v12

    move/from16 v16, v8

    const-string v8, "user_type"

    invoke-static {v8, v12}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v8

    const/4 v12, 0x4

    aput-object v8, v10, v12

    .line 55
    nop

    .line 56
    const-string v8, "user_properties"

    const-string v12, "{}"

    invoke-static {v8, v12}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v8

    const/4 v12, 0x5

    aput-object v8, v10, v12

    .line 55
    nop

    .line 56
    invoke-virtual {v5}, Lcom/pymcl/core/account/Account;->getXuid()Ljava/lang/String;

    move-result-object v8

    check-cast v8, Ljava/lang/CharSequence;

    invoke-interface {v8}, Ljava/lang/CharSequence;->length()I

    move-result v12

    if-nez v12, :cond_8

    move/from16 v12, v16

    goto :goto_4

    :cond_8
    move v12, v9

    :goto_4
    if-eqz v12, :cond_9

    .line 112
    const/4 v8, 0x0

    .line 56
    .local v8, "$i$a$-ifEmpty-LaunchArgsBuilder$build$vars$1":I
    nop

    .end local v8    # "$i$a$-ifEmpty-LaunchArgsBuilder$build$vars$1":I
    goto :goto_5

    :cond_9
    move-object v11, v8

    :goto_5
    const-string v8, "auth_xuid"

    invoke-static {v8, v11}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v8

    const/4 v11, 0x6

    aput-object v8, v10, v11

    .line 55
    nop

    .line 56
    invoke-virtual/range {p2 .. p2}, Lcom/pymcl/core/launch/LaunchOptions;->getClientId()Ljava/lang/String;

    move-result-object v8

    check-cast v8, Ljava/lang/CharSequence;

    invoke-interface {v8}, Ljava/lang/CharSequence;->length()I

    move-result v11

    if-nez v11, :cond_a

    move/from16 v11, v16

    goto :goto_6

    :cond_a
    move v11, v9

    :goto_6
    if-eqz v11, :cond_b

    .line 112
    const/4 v8, 0x0

    .line 56
    .local v8, "$i$a$-ifEmpty-LaunchArgsBuilder$build$vars$2":I
    nop

    .end local v8    # "$i$a$-ifEmpty-LaunchArgsBuilder$build$vars$2":I
    const-string v8, "pymcl"

    :cond_b
    const-string v11, "clientid"

    invoke-static {v11, v8}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v8

    const/4 v11, 0x7

    aput-object v8, v10, v11

    .line 55
    nop

    .line 57
    const-string v8, "version_name"

    invoke-virtual/range {p1 .. p1}, Lcom/pymcl/core/version/ResolvedVersion;->getId()Ljava/lang/String;

    move-result-object v11

    invoke-static {v8, v11}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v8

    const/16 v11, 0x8

    aput-object v8, v10, v11

    .line 55
    nop

    .line 57
    const-string v8, "version_type"

    invoke-virtual/range {p1 .. p1}, Lcom/pymcl/core/version/ResolvedVersion;->getType()Ljava/lang/String;

    move-result-object v11

    invoke-static {v8, v11}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v8

    const/16 v11, 0x9

    aput-object v8, v10, v11

    .line 55
    nop

    .line 57
    sget-object v8, Lcom/pymcl/core/util/FileUtil;->INSTANCE:Lcom/pymcl/core/util/FileUtil;

    invoke-virtual/range {p2 .. p2}, Lcom/pymcl/core/launch/LaunchOptions;->getGameDir()Ljava/io/File;

    move-result-object v12

    invoke-virtual {v8, v12}, Lcom/pymcl/core/util/FileUtil;->toLaunchPath(Ljava/io/File;)Ljava/lang/String;

    move-result-object v8

    const-string v12, "game_directory"

    invoke-static {v12, v8}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v8

    const/16 v12, 0xa

    aput-object v8, v10, v12

    .line 55
    nop

    .line 57
    sget-object v8, Lcom/pymcl/core/util/FileUtil;->INSTANCE:Lcom/pymcl/core/util/FileUtil;

    invoke-virtual/range {p2 .. p2}, Lcom/pymcl/core/launch/LaunchOptions;->getDirs()Lcom/pymcl/core/version/GameDirs;

    move-result-object v17

    invoke-virtual/range {v17 .. v17}, Lcom/pymcl/core/version/GameDirs;->getAssetsDir()Ljava/io/File;

    move-result-object v11

    invoke-virtual {v8, v11}, Lcom/pymcl/core/util/FileUtil;->toLaunchPath(Ljava/io/File;)Ljava/lang/String;

    move-result-object v8

    const-string v11, "assets_root"

    invoke-static {v11, v8}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v8

    const/16 v11, 0xb

    aput-object v8, v10, v11

    .line 55
    nop

    .line 58
    const-string v8, "assets_index_name"

    invoke-virtual/range {p1 .. p1}, Lcom/pymcl/core/version/ResolvedVersion;->getAssetsName()Ljava/lang/String;

    move-result-object v11

    invoke-static {v8, v11}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v8

    const/16 v11, 0xc

    aput-object v8, v10, v11

    .line 55
    nop

    .line 58
    sget-object v8, Lcom/pymcl/core/util/FileUtil;->INSTANCE:Lcom/pymcl/core/util/FileUtil;

    new-instance v11, Ljava/io/File;

    invoke-virtual/range {p2 .. p2}, Lcom/pymcl/core/launch/LaunchOptions;->getDirs()Lcom/pymcl/core/version/GameDirs;

    move-result-object v17

    move/from16 v19, v9

    invoke-virtual/range {v17 .. v17}, Lcom/pymcl/core/version/GameDirs;->getAssetsDir()Ljava/io/File;

    move-result-object v9

    invoke-virtual/range {p1 .. p1}, Lcom/pymcl/core/version/ResolvedVersion;->getAssetsName()Ljava/lang/String;

    move-result-object v13

    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    const-string v15, "virtual/"

    invoke-virtual {v12, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v12

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v12

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v12

    invoke-direct {v11, v9, v12}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v8, v11}, Lcom/pymcl/core/util/FileUtil;->toLaunchPath(Ljava/io/File;)Ljava/lang/String;

    move-result-object v8

    const-string v9, "game_assets"

    invoke-static {v9, v8}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v8

    const/16 v9, 0xd

    aput-object v8, v10, v9

    .line 55
    nop

    .line 58
    const-string v8, "natives_directory"

    invoke-static {v8, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v8

    const/16 v9, 0xe

    aput-object v8, v10, v9

    .line 55
    nop

    .line 59
    move-object/from16 v23, v0

    check-cast v23, Ljava/lang/Iterable;

    move-object/from16 v24, v1

    check-cast v24, Ljava/lang/CharSequence;

    const/16 v30, 0x3e

    const/16 v31, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    invoke-static/range {v23 .. v31}, Lkotlin/collections/CollectionsKt;->joinToString$default(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    const-string v9, "classpath"

    invoke-static {v9, v8}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v8

    const/16 v9, 0xf

    aput-object v8, v10, v9

    .line 55
    nop

    .line 59
    sget-object v8, Lcom/pymcl/core/util/FileUtil;->INSTANCE:Lcom/pymcl/core/util/FileUtil;

    invoke-virtual/range {p2 .. p2}, Lcom/pymcl/core/launch/LaunchOptions;->getDirs()Lcom/pymcl/core/version/GameDirs;

    move-result-object v9

    invoke-virtual {v9}, Lcom/pymcl/core/version/GameDirs;->getLibrariesDir()Ljava/io/File;

    move-result-object v9

    invoke-virtual {v8, v9}, Lcom/pymcl/core/util/FileUtil;->toLaunchPath(Ljava/io/File;)Ljava/lang/String;

    move-result-object v8

    const-string v9, "library_directory"

    invoke-static {v9, v8}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v8

    const/16 v9, 0x10

    aput-object v8, v10, v9

    .line 55
    nop

    .line 59
    const-string v8, "classpath_separator"

    invoke-static {v8, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v8

    const/16 v9, 0x11

    aput-object v8, v10, v9

    .line 55
    nop

    .line 60
    const-string v8, "launcher_name"

    const-string v11, "PyMCL"

    invoke-static {v8, v11}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v8

    const/16 v11, 0x12

    aput-object v8, v10, v11

    .line 55
    nop

    .line 60
    const-string v8, "launcher_version"

    const-string v11, "1.0.1"

    invoke-static {v8, v11}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v8

    const/16 v11, 0x13

    aput-object v8, v10, v11

    .line 55
    nop

    .line 60
    const-string v8, "resolution_width"

    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v11

    invoke-static {v8, v11}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v8

    const/16 v11, 0x14

    aput-object v8, v10, v11

    .line 55
    nop

    .line 60
    const-string v8, "resolution_height"

    invoke-static {v4}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v11

    invoke-static {v8, v11}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v8

    const/16 v11, 0x15

    aput-object v8, v10, v11

    .line 55
    nop

    .line 60
    new-instance v8, Ljava/io/File;

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->last(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/String;

    invoke-direct {v8, v11}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v8

    const-string v11, "primary_jar_name"

    invoke-static {v11, v8}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v8

    const/16 v11, 0x16

    aput-object v8, v10, v11

    .line 55
    invoke-static {v10}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v8

    .line 61
    .local v8, "vars":Ljava/util/Map;
    invoke-virtual/range {p2 .. p2}, Lcom/pymcl/core/launch/LaunchOptions;->getEnv()Lcom/pymcl/core/version/RuleEnv;

    move-result-object v23

    new-array v10, v14, [Lkotlin/Pair;

    const-string v11, "is_demo_user"

    invoke-static/range {v19 .. v19}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v12

    invoke-static {v11, v12}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v11

    aput-object v11, v10, v19

    const-string v11, "has_custom_resolution"

    invoke-static/range {v16 .. v16}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v12

    invoke-static {v11, v12}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v11

    aput-object v11, v10, v16

    invoke-static {v10}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v27

    const/16 v28, 0x7

    const/16 v24, 0x0

    invoke-static/range {v23 .. v29}, Lcom/pymcl/core/version/RuleEnv;->copy$default(Lcom/pymcl/core/version/RuleEnv;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILjava/lang/Object;)Lcom/pymcl/core/version/RuleEnv;

    move-result-object v10

    .line 68
    .local v10, "env":Lcom/pymcl/core/version/RuleEnv;
    invoke-virtual/range {p1 .. p1}, Lcom/pymcl/core/version/ResolvedVersion;->getMinecraftArguments()Ljava/lang/String;

    move-result-object v11

    if-eqz v11, :cond_c

    invoke-virtual/range {p1 .. p1}, Lcom/pymcl/core/version/ResolvedVersion;->getJvmArgs()Ljava/util/List;

    move-result-object v11

    if-nez v11, :cond_c

    move/from16 v11, v16

    goto :goto_7

    :cond_c
    move/from16 v11, v19

    .line 69
    .local v11, "legacy":Z
    :goto_7
    const-string v12, "-Djava.library.path="

    const-string v13, "-cp"

    if-eqz v11, :cond_d

    const/4 v15, 0x3

    new-array v15, v15, [Ljava/lang/String;

    move/from16 v22, v9

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v9, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {v9, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    aput-object v9, v15, v19

    aput-object v13, v15, v16

    move-object/from16 v23, v0

    check-cast v23, Ljava/lang/Iterable;

    move-object/from16 v24, v1

    check-cast v24, Ljava/lang/CharSequence;

    const/16 v30, 0x3e

    const/16 v31, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    invoke-static/range {v23 .. v31}, Lkotlin/collections/CollectionsKt;->joinToString$default(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v9

    aput-object v9, v15, v14

    invoke-static {v15}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v9

    move-object/from16 v24, v0

    move-object/from16 v25, v1

    move/from16 v30, v3

    move/from16 v31, v4

    move-object/from16 v32, v5

    move-object/from16 v33, v6

    goto/16 :goto_b

    :cond_d
    move/from16 v22, v9

    invoke-virtual/range {p1 .. p1}, Lcom/pymcl/core/version/ResolvedVersion;->getJvmArgs()Ljava/util/List;

    move-result-object v9

    invoke-static {v10, v9}, Lcom/pymcl/core/launch/LaunchArgsBuilder;->build$expand(Lcom/pymcl/core/version/RuleEnv;Ljava/util/List;)Ljava/util/List;

    move-result-object v9

    check-cast v9, Ljava/lang/Iterable;

    .local v9, "$this$map$iv":Ljava/lang/Iterable;
    const/4 v15, 0x0

    .line 116
    .local v15, "$i$f$map":I
    new-instance v14, Ljava/util/ArrayList;

    move-object/from16 v24, v0

    move-object/from16 v25, v1

    const/16 v0, 0xa

    .end local v0    # "cp":Ljava/util/List;
    .end local v1    # "sep":Ljava/lang/String;
    .local v24, "cp":Ljava/util/List;
    .local v25, "sep":Ljava/lang/String;
    invoke-static {v9, v0}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v14, v1}, Ljava/util/ArrayList;-><init>(I)V

    move-object v0, v14

    check-cast v0, Ljava/util/Collection;

    .local v0, "destination$iv$iv":Ljava/util/Collection;
    move-object v1, v9

    .local v1, "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    const/4 v14, 0x0

    .line 117
    .local v14, "$i$f$mapTo":I
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v26

    :goto_8
    invoke-interface/range {v26 .. v26}, Ljava/util/Iterator;->hasNext()Z

    move-result v27

    if-eqz v27, :cond_e

    invoke-interface/range {v26 .. v26}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v27

    .line 118
    .local v27, "item$iv$iv":Ljava/lang/Object;
    move-object/from16 v28, v1

    .end local v1    # "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    .local v28, "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    move-object/from16 v1, v27

    check-cast v1, Ljava/lang/String;

    .local v1, "p0":Ljava/lang/String;
    const/16 v29, 0x0

    .line 69
    .local v29, "$i$a$-map-LaunchArgsBuilder$build$jvm$1":I
    invoke-static {v8, v1}, Lcom/pymcl/core/launch/LaunchArgsBuilder;->build$sub(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 118
    .end local v1    # "p0":Ljava/lang/String;
    .end local v29    # "$i$a$-map-LaunchArgsBuilder$build$jvm$1":I
    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move-object/from16 v1, v28

    goto :goto_8

    .line 119
    .end local v27    # "item$iv$iv":Ljava/lang/Object;
    .end local v28    # "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    .local v1, "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    :cond_e
    move-object/from16 v28, v1

    .end local v0    # "destination$iv$iv":Ljava/util/Collection;
    .end local v1    # "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    .end local v14    # "$i$f$mapTo":I
    check-cast v0, Ljava/util/List;

    .line 116
    nop

    .end local v9    # "$this$map$iv":Ljava/lang/Iterable;
    .end local v15    # "$i$f$map":I
    check-cast v0, Ljava/util/Collection;

    .line 69
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->toMutableList(Ljava/util/Collection;)Ljava/util/List;

    move-result-object v9

    move-object v0, v9

    .local v0, "l":Ljava/util/List;
    const/4 v1, 0x0

    .line 70
    .local v1, "$i$a$-also-LaunchArgsBuilder$build$jvm$2":I
    move-object v14, v0

    check-cast v14, Ljava/lang/Iterable;

    .local v14, "$this$none$iv":Ljava/lang/Iterable;
    const/4 v15, 0x0

    .line 120
    .local v15, "$i$f$none":I
    move/from16 v26, v1

    .end local v1    # "$i$a$-also-LaunchArgsBuilder$build$jvm$2":I
    .local v26, "$i$a$-also-LaunchArgsBuilder$build$jvm$2":I
    instance-of v1, v14, Ljava/util/Collection;

    if-eqz v1, :cond_f

    move-object v1, v14

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_f

    move/from16 v30, v3

    move/from16 v31, v4

    move-object/from16 v32, v5

    move-object/from16 v33, v6

    move/from16 v1, v16

    goto :goto_a

    .line 121
    :cond_f
    invoke-interface {v14}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_9
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v27

    if-eqz v27, :cond_11

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v27

    move-object/from16 v28, v1

    .local v27, "element$iv":Ljava/lang/Object;
    move-object/from16 v1, v27

    check-cast v1, Ljava/lang/String;

    .local v1, "it":Ljava/lang/String;
    const/16 v29, 0x0

    .line 70
    .local v29, "$i$a$-none-LaunchArgsBuilder$build$jvm$2$1":I
    move/from16 v30, v3

    .end local v3    # "w":I
    .local v30, "w":I
    const-string v3, "-Djava.library.path"

    move/from16 v31, v4

    move-object/from16 v32, v5

    move-object/from16 v33, v6

    move/from16 v6, v19

    const/4 v4, 0x0

    const/4 v5, 0x2

    .end local v4    # "h":I
    .end local v5    # "acc":Lcom/pymcl/core/account/Account;
    .end local v6    # "uuid":Ljava/lang/String;
    .local v31, "h":I
    .local v32, "acc":Lcom/pymcl/core/account/Account;
    .local v33, "uuid":Ljava/lang/String;
    invoke-static {v1, v3, v6, v5, v4}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v1

    .line 121
    .end local v1    # "it":Ljava/lang/String;
    .end local v29    # "$i$a$-none-LaunchArgsBuilder$build$jvm$2$1":I
    if-eqz v1, :cond_10

    const/4 v1, 0x0

    goto :goto_a

    :cond_10
    move-object/from16 v1, v28

    move/from16 v3, v30

    move/from16 v4, v31

    move-object/from16 v5, v32

    move-object/from16 v6, v33

    const/16 v19, 0x0

    goto :goto_9

    .line 122
    .end local v27    # "element$iv":Ljava/lang/Object;
    .end local v30    # "w":I
    .end local v31    # "h":I
    .end local v32    # "acc":Lcom/pymcl/core/account/Account;
    .end local v33    # "uuid":Ljava/lang/String;
    .restart local v3    # "w":I
    .restart local v4    # "h":I
    .restart local v5    # "acc":Lcom/pymcl/core/account/Account;
    .restart local v6    # "uuid":Ljava/lang/String;
    :cond_11
    move/from16 v30, v3

    move/from16 v31, v4

    move-object/from16 v32, v5

    move-object/from16 v33, v6

    .end local v3    # "w":I
    .end local v4    # "h":I
    .end local v5    # "acc":Lcom/pymcl/core/account/Account;
    .end local v6    # "uuid":Ljava/lang/String;
    .restart local v30    # "w":I
    .restart local v31    # "h":I
    .restart local v32    # "acc":Lcom/pymcl/core/account/Account;
    .restart local v33    # "uuid":Ljava/lang/String;
    move/from16 v1, v16

    .line 70
    .end local v14    # "$this$none$iv":Ljava/lang/Iterable;
    .end local v15    # "$i$f$none":I
    :goto_a
    if-eqz v1, :cond_12

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v6, 0x0

    invoke-interface {v0, v6, v1}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 71
    :cond_12
    invoke-interface {v0, v13}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_13

    const-string v1, "-classpath"

    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_13

    move-object v1, v0

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1, v13}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move-object v1, v0

    check-cast v1, Ljava/util/Collection;

    move-object/from16 v34, v24

    check-cast v34, Ljava/lang/Iterable;

    move-object/from16 v35, v25

    check-cast v35, Ljava/lang/CharSequence;

    const/16 v41, 0x3e

    const/16 v42, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x0

    const/16 v38, 0x0

    const/16 v39, 0x0

    const/16 v40, 0x0

    invoke-static/range {v34 .. v42}, Lkotlin/collections/CollectionsKt;->joinToString$default(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 69
    .end local v0    # "l":Ljava/util/List;
    .end local v26    # "$i$a$-also-LaunchArgsBuilder$build$jvm$2":I
    :cond_13
    nop

    .line 72
    .local v9, "jvm":Ljava/util/List;
    :goto_b
    move-object v0, v9

    check-cast v0, Ljava/lang/Iterable;

    .local v0, "$this$map$iv":Ljava/lang/Iterable;
    const/4 v1, 0x0

    .line 123
    .local v1, "$i$f$map":I
    new-instance v3, Ljava/util/ArrayList;

    const/16 v4, 0xa

    invoke-static {v0, v4}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v3, v5}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v3, Ljava/util/Collection;

    .local v3, "destination$iv$iv":Ljava/util/Collection;
    move-object v4, v0

    .local v4, "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    const/4 v5, 0x0

    .line 124
    .local v5, "$i$f$mapTo":I
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_c
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    const-string v13, "--module-path"

    if-eqz v12, :cond_15

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    .line 125
    .local v12, "item$iv$iv":Ljava/lang/Object;
    move-object v14, v12

    check-cast v14, Ljava/lang/String;

    .local v14, "it":Ljava/lang/String;
    const/4 v15, 0x0

    .line 72
    .local v15, "$i$a$-map-LaunchArgsBuilder$build$1":I
    move-object/from16 v26, v0

    .end local v0    # "$this$map$iv":Ljava/lang/Iterable;
    .local v26, "$this$map$iv":Ljava/lang/Iterable;
    const-string v0, "-p"

    invoke-static {v14, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_14

    goto :goto_d

    :cond_14
    move-object v13, v14

    .line 125
    .end local v14    # "it":Ljava/lang/String;
    .end local v15    # "$i$a$-map-LaunchArgsBuilder$build$1":I
    :goto_d
    invoke-interface {v3, v13}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move-object/from16 v0, v26

    goto :goto_c

    .line 126
    .end local v12    # "item$iv$iv":Ljava/lang/Object;
    .end local v26    # "$this$map$iv":Ljava/lang/Iterable;
    .restart local v0    # "$this$map$iv":Ljava/lang/Iterable;
    :cond_15
    move-object/from16 v26, v0

    .end local v0    # "$this$map$iv":Ljava/lang/Iterable;
    .end local v3    # "destination$iv$iv":Ljava/util/Collection;
    .end local v4    # "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    .end local v5    # "$i$f$mapTo":I
    .restart local v26    # "$this$map$iv":Ljava/lang/Iterable;
    move-object v0, v3

    check-cast v0, Ljava/util/List;

    .line 123
    nop

    .line 72
    .end local v1    # "$i$f$map":I
    .end local v26    # "$this$map$iv":Ljava/lang/Iterable;
    nop

    .line 73
    .end local v9    # "jvm":Ljava/util/List;
    .local v0, "jvm":Ljava/util/List;
    if-eqz v11, :cond_16

    sget-object v1, Lcom/pymcl/core/launch/ArgSplit;->INSTANCE:Lcom/pymcl/core/launch/ArgSplit;

    invoke-virtual/range {p1 .. p1}, Lcom/pymcl/core/version/ResolvedVersion;->getMinecraftArguments()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v1, v3}, Lcom/pymcl/core/launch/ArgSplit;->split(Ljava/lang/String;)Ljava/util/List;

    move-result-object v1

    goto :goto_e

    :cond_16
    invoke-virtual/range {p1 .. p1}, Lcom/pymcl/core/version/ResolvedVersion;->getGameArgs()Ljava/util/List;

    move-result-object v1

    invoke-static {v10, v1}, Lcom/pymcl/core/launch/LaunchArgsBuilder;->build$expand(Lcom/pymcl/core/version/RuleEnv;Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    :goto_e
    check-cast v1, Ljava/lang/Iterable;

    .local v1, "$this$map$iv":Ljava/lang/Iterable;
    const/4 v3, 0x0

    .line 127
    .local v3, "$i$f$map":I
    new-instance v4, Ljava/util/ArrayList;

    const/16 v5, 0xa

    invoke-static {v1, v5}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v4, Ljava/util/Collection;

    .local v4, "destination$iv$iv":Ljava/util/Collection;
    move-object v5, v1

    .local v5, "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    const/4 v6, 0x0

    .line 128
    .local v6, "$i$f$mapTo":I
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_f
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_17

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    .line 129
    .restart local v12    # "item$iv$iv":Ljava/lang/Object;
    move-object v14, v12

    check-cast v14, Ljava/lang/String;

    .local v14, "p0":Ljava/lang/String;
    const/4 v15, 0x0

    .line 73
    .local v15, "$i$a$-map-LaunchArgsBuilder$build$game$1":I
    invoke-static {v8, v14}, Lcom/pymcl/core/launch/LaunchArgsBuilder;->build$sub(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v14

    .line 129
    .end local v14    # "p0":Ljava/lang/String;
    .end local v15    # "$i$a$-map-LaunchArgsBuilder$build$game$1":I
    invoke-interface {v4, v14}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_f

    .line 130
    .end local v12    # "item$iv$iv":Ljava/lang/Object;
    :cond_17
    nop

    .end local v4    # "destination$iv$iv":Ljava/util/Collection;
    .end local v5    # "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    .end local v6    # "$i$f$mapTo":I
    check-cast v4, Ljava/util/List;

    .line 127
    nop

    .end local v1    # "$this$map$iv":Ljava/lang/Iterable;
    .end local v3    # "$i$f$map":I
    check-cast v4, Ljava/util/Collection;

    .line 73
    invoke-static {v4}, Lkotlin/collections/CollectionsKt;->toMutableList(Ljava/util/Collection;)Ljava/util/List;

    move-result-object v39

    .line 74
    .local v39, "game":Ljava/util/List;
    move-object/from16 v1, v39

    check-cast v1, Ljava/lang/Iterable;

    .local v1, "$this$any$iv":Ljava/lang/Iterable;
    const/4 v3, 0x0

    .line 131
    .local v3, "$i$f$any":I
    instance-of v4, v1, Ljava/util/Collection;

    if-eqz v4, :cond_18

    move-object v4, v1

    check-cast v4, Ljava/util/Collection;

    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_18

    move-object/from16 v21, v0

    const/4 v0, 0x0

    goto :goto_11

    .line 132
    :cond_18
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_10
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_1a

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    .local v5, "element$iv":Ljava/lang/Object;
    move-object v6, v5

    check-cast v6, Ljava/lang/String;

    .local v6, "it":Ljava/lang/String;
    const/4 v9, 0x0

    .line 74
    .local v9, "$i$a$-any-LaunchArgsBuilder$build$2":I
    move-object v12, v6

    check-cast v12, Ljava/lang/CharSequence;

    const-string v14, "tweakClass"

    check-cast v14, Ljava/lang/CharSequence;

    move-object/from16 v21, v0

    move-object/from16 v26, v1

    const/4 v0, 0x2

    const/4 v1, 0x0

    const/4 v15, 0x0

    .end local v0    # "jvm":Ljava/util/List;
    .end local v1    # "$this$any$iv":Ljava/lang/Iterable;
    .local v21, "jvm":Ljava/util/List;
    .local v26, "$this$any$iv":Ljava/lang/Iterable;
    invoke-static {v12, v14, v1, v0, v15}, Lkotlin/text/StringsKt;->contains$default(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v6

    .line 132
    .end local v6    # "it":Ljava/lang/String;
    .end local v9    # "$i$a$-any-LaunchArgsBuilder$build$2":I
    if-eqz v6, :cond_19

    move/from16 v0, v16

    goto :goto_11

    :cond_19
    move-object/from16 v0, v21

    move-object/from16 v1, v26

    goto :goto_10

    .line 133
    .end local v5    # "element$iv":Ljava/lang/Object;
    .end local v21    # "jvm":Ljava/util/List;
    .end local v26    # "$this$any$iv":Ljava/lang/Iterable;
    .restart local v0    # "jvm":Ljava/util/List;
    .restart local v1    # "$this$any$iv":Ljava/lang/Iterable;
    :cond_1a
    move-object/from16 v21, v0

    move-object/from16 v26, v1

    .end local v0    # "jvm":Ljava/util/List;
    .end local v1    # "$this$any$iv":Ljava/lang/Iterable;
    .restart local v21    # "jvm":Ljava/util/List;
    .restart local v26    # "$this$any$iv":Ljava/lang/Iterable;
    const/4 v0, 0x0

    .line 74
    .end local v3    # "$i$f$any":I
    .end local v26    # "$this$any$iv":Ljava/lang/Iterable;
    :goto_11
    if-nez v0, :cond_1f

    move-object/from16 v40, v39

    check-cast v40, Ljava/lang/Iterable;

    const/16 v44, 0x6

    const/16 v45, 0x0

    const/16 v41, 0x2

    const/16 v42, 0x0

    const/16 v43, 0x0

    invoke-static/range {v40 .. v45}, Lkotlin/collections/CollectionsKt;->windowed$default(Ljava/lang/Iterable;IIZILjava/lang/Object;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    .local v0, "$this$any$iv":Ljava/lang/Iterable;
    const/4 v1, 0x0

    .line 131
    .local v1, "$i$f$any":I
    instance-of v3, v0, Ljava/util/Collection;

    if-eqz v3, :cond_1b

    move-object v3, v0

    check-cast v3, Ljava/util/Collection;

    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_1b

    const/4 v0, 0x0

    goto :goto_12

    .line 132
    :cond_1b
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_1c
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1d

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    .local v4, "element$iv":Ljava/lang/Object;
    move-object v5, v4

    check-cast v5, Ljava/util/List;

    .local v5, "it":Ljava/util/List;
    const/4 v6, 0x0

    .line 74
    .local v6, "$i$a$-any-LaunchArgsBuilder$build$3":I
    const/4 v9, 0x0

    invoke-interface {v5, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v12

    const-string v9, "--tweakClass"

    invoke-static {v12, v9}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    .line 132
    .end local v5    # "it":Ljava/util/List;
    .end local v6    # "$i$a$-any-LaunchArgsBuilder$build$3":I
    if-eqz v5, :cond_1c

    move/from16 v0, v16

    goto :goto_12

    .line 133
    .end local v4    # "element$iv":Ljava/lang/Object;
    :cond_1d
    const/4 v0, 0x0

    .line 74
    .end local v0    # "$this$any$iv":Ljava/lang/Iterable;
    .end local v1    # "$i$f$any":I
    :goto_12
    if-eqz v0, :cond_1e

    goto :goto_13

    :cond_1e
    move-object/from16 v0, v21

    const/4 v5, 0x2

    const/16 v19, 0x0

    goto :goto_14

    .line 75
    :cond_1f
    :goto_13
    move-object/from16 v0, v21

    check-cast v0, Ljava/util/Collection;

    const/4 v5, 0x2

    new-array v1, v5, [Ljava/lang/String;

    const-string v3, "-Dfml.ignoreInvalidMinecraftCertificates=true"

    const/16 v19, 0x0

    aput-object v3, v1, v19

    const-string v3, "-Dfml.ignorePatchDiscrepancies=true"

    aput-object v3, v1, v16

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-static {v0, v1}, Lkotlin/collections/CollectionsKt;->plus(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    .line 76
    .end local v21    # "jvm":Ljava/util/List;
    .local v0, "jvm":Ljava/util/List;
    :goto_14
    new-array v1, v5, [Ljava/lang/String;

    const-string v3, "-Dminecraft.launcher.brand=PyMCL"

    aput-object v3, v1, v19

    const-string v3, "-Dminecraft.launcher.version=1.0.1"

    aput-object v3, v1, v16

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->mutableListOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    .line 77
    .local v1, "extra":Ljava/util/List;
    invoke-virtual/range {p1 .. p1}, Lcom/pymcl/core/version/ResolvedVersion;->getJson()Ljava/util/Map;

    move-result-object v3

    const-string v4, "logging"

    invoke-static {v3, v4}, Lcom/pymcl/core/util/JsonKt;->obj(Ljava/util/Map;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v3

    const-string v4, "client"

    invoke-static {v3, v4}, Lcom/pymcl/core/util/JsonKt;->obj(Ljava/util/Map;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v3

    const-string v4, "file"

    invoke-static {v3, v4}, Lcom/pymcl/core/util/JsonKt;->obj(Ljava/util/Map;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v3

    const-string v4, "id"

    invoke-static {v3, v4}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_20

    .line 112
    .local v3, "it":Ljava/lang/String;
    const/4 v4, 0x0

    .line 77
    .local v4, "$i$a$-let-LaunchArgsBuilder$build$4":I
    move-object v5, v1

    check-cast v5, Ljava/util/Collection;

    sget-object v6, Lcom/pymcl/core/util/FileUtil;->INSTANCE:Lcom/pymcl/core/util/FileUtil;

    new-instance v9, Ljava/io/File;

    invoke-virtual/range {p2 .. p2}, Lcom/pymcl/core/launch/LaunchOptions;->getDirs()Lcom/pymcl/core/version/GameDirs;

    move-result-object v12

    invoke-virtual {v12}, Lcom/pymcl/core/version/GameDirs;->getAssetsDir()Ljava/io/File;

    move-result-object v12

    new-instance v14, Ljava/lang/StringBuilder;

    invoke-direct {v14}, Ljava/lang/StringBuilder;-><init>()V

    const-string v15, "log_configs/"

    invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v14

    invoke-virtual {v14, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v14

    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v14

    invoke-direct {v9, v12, v14}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v6, v9}, Lcom/pymcl/core/util/FileUtil;->toLaunchPath(Ljava/io/File;)Ljava/lang/String;

    move-result-object v6

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    const-string v12, "-Dlog4j.configurationFile="

    invoke-virtual {v9, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-interface {v5, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .end local v3    # "it":Ljava/lang/String;
    .end local v4    # "$i$a$-let-LaunchArgsBuilder$build$4":I
    sget-object v3, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    sget-object v3, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 78
    :cond_20
    sget-object v3, Lcom/pymcl/core/launch/ArgSplit;->INSTANCE:Lcom/pymcl/core/launch/ArgSplit;

    invoke-virtual/range {p2 .. p2}, Lcom/pymcl/core/launch/LaunchOptions;->getDefaultJvmArgs()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/pymcl/core/launch/ArgSplit;->split(Ljava/lang/String;)Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/util/Collection;

    sget-object v4, Lcom/pymcl/core/launch/ArgSplit;->INSTANCE:Lcom/pymcl/core/launch/ArgSplit;

    invoke-virtual/range {p2 .. p2}, Lcom/pymcl/core/launch/LaunchOptions;->getVersionJvmArgs()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Lcom/pymcl/core/launch/ArgSplit;->split(Ljava/lang/String;)Ljava/util/List;

    move-result-object v4

    check-cast v4, Ljava/lang/Iterable;

    invoke-static {v3, v4}, Lkotlin/collections/CollectionsKt;->plus(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/util/Collection;

    move-object v4, v0

    check-cast v4, Ljava/lang/Iterable;

    invoke-static {v3, v4}, Lkotlin/collections/CollectionsKt;->plus(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/util/Collection;

    move-object v4, v1

    check-cast v4, Ljava/lang/Iterable;

    invoke-static {v3, v4}, Lkotlin/collections/CollectionsKt;->plus(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v3

    .line 79
    .local v3, "all":Ljava/util/List;
    sget-object v4, Lcom/pymcl/core/launch/Gc;->INSTANCE:Lcom/pymcl/core/launch/Gc;

    invoke-virtual/range {p2 .. p2}, Lcom/pymcl/core/launch/LaunchOptions;->getGc()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5, v3}, Lcom/pymcl/core/launch/Gc;->apply(Ljava/lang/String;Ljava/util/List;)Ljava/util/List;

    move-result-object v3

    .line 80
    const/16 v4, 0x400

    if-eqz v11, :cond_21

    invoke-virtual/range {p1 .. p1}, Lcom/pymcl/core/version/ResolvedVersion;->getMcVersion()Ljava/lang/String;

    move-result-object v5

    const-string v6, "1.6"

    move-object/from16 v9, p0

    invoke-direct {v9, v5, v6}, Lcom/pymcl/core/launch/LaunchArgsBuilder;->compareMcSimple(Ljava/lang/String;Ljava/lang/String;)I

    move-result v5

    if-gez v5, :cond_22

    invoke-virtual/range {p2 .. p2}, Lcom/pymcl/core/launch/LaunchOptions;->getMemoryMb()I

    move-result v5

    invoke-static {v5, v4}, Ljava/lang/Math;->min(II)I

    move-result v5

    goto :goto_15

    :cond_21
    move-object/from16 v9, p0

    :cond_22
    invoke-virtual/range {p2 .. p2}, Lcom/pymcl/core/launch/LaunchOptions;->getMemoryMb()I

    move-result v5

    .line 81
    .local v5, "mem":I
    :goto_15
    const/4 v6, 0x2

    new-array v12, v6, [Ljava/lang/String;

    const/16 v6, 0x200

    invoke-static {v6, v5}, Ljava/lang/Math;->max(II)I

    move-result v6

    new-instance v14, Ljava/lang/StringBuilder;

    invoke-direct {v14}, Ljava/lang/StringBuilder;-><init>()V

    const-string v15, "-Xmx"

    invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v14

    invoke-virtual {v14, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v6

    const-string v14, "M"

    invoke-virtual {v6, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    const/16 v19, 0x0

    aput-object v6, v12, v19

    div-int/lit8 v6, v5, 0x2

    invoke-static {v6, v4}, Ljava/lang/Math;->min(II)I

    move-result v4

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v21, v0

    .end local v0    # "jvm":Ljava/util/List;
    .restart local v21    # "jvm":Ljava/util/List;
    const-string v0, "-Xms"

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    aput-object v4, v12, v16

    invoke-static {v12}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v4

    check-cast v4, Ljava/util/Collection;

    move-object v6, v3

    check-cast v6, Ljava/lang/Iterable;

    .local v6, "$this$filter$iv":Ljava/lang/Iterable;
    const/4 v12, 0x0

    .line 134
    .local v12, "$i$f$filter":I
    new-instance v14, Ljava/util/ArrayList;

    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    check-cast v14, Ljava/util/Collection;

    .local v14, "destination$iv$iv":Ljava/util/Collection;
    move-object/from16 v26, v6

    .local v26, "$this$filterTo$iv$iv":Ljava/lang/Iterable;
    const/16 v27, 0x0

    .line 135
    .local v27, "$i$f$filterTo":I
    invoke-interface/range {v26 .. v26}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v28

    :goto_16
    invoke-interface/range {v28 .. v28}, Ljava/util/Iterator;->hasNext()Z

    move-result v29

    if-eqz v29, :cond_25

    move-object/from16 v29, v1

    .end local v1    # "extra":Ljava/util/List;
    .local v29, "extra":Ljava/util/List;
    invoke-interface/range {v28 .. v28}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object/from16 v40, v2

    .end local v2    # "natives":Ljava/lang/String;
    .local v1, "element$iv$iv":Ljava/lang/Object;
    .local v40, "natives":Ljava/lang/String;
    move-object v2, v1

    check-cast v2, Ljava/lang/String;

    .local v2, "it":Ljava/lang/String;
    const/16 v34, 0x0

    .line 81
    .local v34, "$i$a$-filter-LaunchArgsBuilder$build$5":I
    move-object/from16 v35, v3

    move/from16 v41, v5

    move-object/from16 v36, v6

    const/4 v3, 0x0

    const/4 v5, 0x2

    const/4 v6, 0x0

    .end local v3    # "all":Ljava/util/List;
    .end local v5    # "mem":I
    .end local v6    # "$this$filter$iv":Ljava/lang/Iterable;
    .local v35, "all":Ljava/util/List;
    .local v36, "$this$filter$iv":Ljava/lang/Iterable;
    .local v41, "mem":I
    invoke-static {v2, v15, v6, v5, v3}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v17

    if-nez v17, :cond_23

    invoke-static {v2, v0, v6, v5, v3}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v37

    if-nez v37, :cond_23

    move/from16 v2, v16

    goto :goto_17

    :cond_23
    const/4 v2, 0x0

    .line 135
    .end local v2    # "it":Ljava/lang/String;
    .end local v34    # "$i$a$-filter-LaunchArgsBuilder$build$5":I
    :goto_17
    if-eqz v2, :cond_24

    invoke-interface {v14, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    :cond_24
    move-object/from16 v1, v29

    move-object/from16 v3, v35

    move-object/from16 v6, v36

    move-object/from16 v2, v40

    move/from16 v5, v41

    goto :goto_16

    .line 136
    .end local v29    # "extra":Ljava/util/List;
    .end local v35    # "all":Ljava/util/List;
    .end local v36    # "$this$filter$iv":Ljava/lang/Iterable;
    .end local v40    # "natives":Ljava/lang/String;
    .end local v41    # "mem":I
    .local v1, "extra":Ljava/util/List;
    .local v2, "natives":Ljava/lang/String;
    .restart local v3    # "all":Ljava/util/List;
    .restart local v5    # "mem":I
    .restart local v6    # "$this$filter$iv":Ljava/lang/Iterable;
    :cond_25
    move-object/from16 v29, v1

    move-object/from16 v40, v2

    move-object/from16 v35, v3

    move/from16 v41, v5

    move-object/from16 v36, v6

    .end local v1    # "extra":Ljava/util/List;
    .end local v2    # "natives":Ljava/lang/String;
    .end local v3    # "all":Ljava/util/List;
    .end local v5    # "mem":I
    .end local v6    # "$this$filter$iv":Ljava/lang/Iterable;
    .end local v14    # "destination$iv$iv":Ljava/util/Collection;
    .end local v26    # "$this$filterTo$iv$iv":Ljava/lang/Iterable;
    .end local v27    # "$i$f$filterTo":I
    .restart local v29    # "extra":Ljava/util/List;
    .restart local v35    # "all":Ljava/util/List;
    .restart local v36    # "$this$filter$iv":Ljava/lang/Iterable;
    .restart local v40    # "natives":Ljava/lang/String;
    .restart local v41    # "mem":I
    move-object v0, v14

    check-cast v0, Ljava/util/List;

    .line 134
    nop

    .end local v12    # "$i$f$filter":I
    .end local v36    # "$this$filter$iv":Ljava/lang/Iterable;
    check-cast v0, Ljava/lang/Iterable;

    .line 81
    invoke-static {v4, v0}, Lkotlin/collections/CollectionsKt;->plus(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    .line 83
    .end local v35    # "all":Ljava/util/List;
    .local v0, "all":Ljava/util/List;
    invoke-virtual/range {v32 .. v32}, Lcom/pymcl/core/account/Account;->getType()Lcom/pymcl/core/account/AccountType;

    move-result-object v1

    sget-object v2, Lcom/pymcl/core/launch/LaunchArgsBuilder$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v1}, Lcom/pymcl/core/account/AccountType;->ordinal()I

    move-result v1

    aget v1, v2, v1

    const-string v2, "-Dauthlibinjector.yggdrasil.prefetched="

    const-string v3, "="

    const-string v4, "-javaagent:"

    packed-switch v1, :pswitch_data_0

    .line 88
    const/4 v1, 0x0

    goto/16 :goto_1c

    .line 86
    :pswitch_0
    invoke-virtual/range {p2 .. p2}, Lcom/pymcl/core/launch/LaunchOptions;->getOfflineSkinApi()Ljava/lang/String;

    move-result-object v1

    check-cast v1, Ljava/lang/CharSequence;

    if-eqz v1, :cond_27

    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-nez v1, :cond_26

    goto :goto_18

    :cond_26
    const/4 v1, 0x0

    goto :goto_19

    :cond_27
    :goto_18
    move/from16 v1, v16

    :goto_19
    if-eqz v1, :cond_29

    :cond_28
    const/4 v1, 0x0

    goto/16 :goto_1c

    :cond_29
    invoke-virtual/range {p2 .. p2}, Lcom/pymcl/core/launch/LaunchOptions;->getAuthlibJar()Ljava/io/File;

    move-result-object v1

    if-eqz v1, :cond_28

    .local v1, "it":Ljava/io/File;
    const/4 v5, 0x0

    .line 87
    .local v5, "$i$a$-let-LaunchArgsBuilder$build$agent$3":I
    const/4 v6, 0x2

    new-array v12, v6, [Ljava/lang/String;

    sget-object v6, Lcom/pymcl/core/util/FileUtil;->INSTANCE:Lcom/pymcl/core/util/FileUtil;

    invoke-virtual {v6, v1}, Lcom/pymcl/core/util/FileUtil;->toLaunchPath(Ljava/io/File;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual/range {p2 .. p2}, Lcom/pymcl/core/launch/LaunchOptions;->getOfflineSkinApi()Ljava/lang/String;

    move-result-object v14

    new-instance v15, Ljava/lang/StringBuilder;

    invoke-direct {v15}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v15, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v15

    invoke-virtual {v15, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/16 v19, 0x0

    aput-object v3, v12, v19

    invoke-virtual/range {p2 .. p2}, Lcom/pymcl/core/launch/LaunchOptions;->getOfflineSkinPrefetched()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_2a

    .line 112
    nop

    .local v3, "p":Ljava/lang/String;
    const/4 v6, 0x0

    .line 87
    .local v6, "$i$a$-let-LaunchArgsBuilder$build$agent$3$1":I
    new-instance v14, Ljava/lang/StringBuilder;

    invoke-direct {v14}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v14, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .end local v3    # "p":Ljava/lang/String;
    .end local v6    # "$i$a$-let-LaunchArgsBuilder$build$agent$3$1":I
    goto :goto_1a

    :cond_2a
    const/4 v2, 0x0

    :goto_1a
    aput-object v2, v12, v16

    invoke-static {v12}, Lkotlin/collections/CollectionsKt;->listOfNotNull([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    .line 86
    .end local v1    # "it":Ljava/io/File;
    .end local v5    # "$i$a$-let-LaunchArgsBuilder$build$agent$3":I
    goto/16 :goto_1c

    .line 85
    :pswitch_1
    invoke-virtual/range {p2 .. p2}, Lcom/pymcl/core/launch/LaunchOptions;->getNide8Jar()Ljava/io/File;

    move-result-object v1

    if-eqz v1, :cond_2b

    .line 112
    .restart local v1    # "it":Ljava/io/File;
    const/4 v2, 0x0

    .line 85
    .local v2, "$i$a$-let-LaunchArgsBuilder$build$agent$2":I
    const/4 v5, 0x2

    new-array v6, v5, [Ljava/lang/String;

    sget-object v5, Lcom/pymcl/core/util/FileUtil;->INSTANCE:Lcom/pymcl/core/util/FileUtil;

    invoke-virtual {v5, v1}, Lcom/pymcl/core/util/FileUtil;->toLaunchPath(Ljava/io/File;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual/range {v32 .. v32}, Lcom/pymcl/core/account/Account;->getNide8Id()Ljava/lang/String;

    move-result-object v12

    new-instance v14, Ljava/lang/StringBuilder;

    invoke-direct {v14}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v14, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v14

    invoke-virtual {v14, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/16 v19, 0x0

    aput-object v3, v6, v19

    const-string v3, "-Dnide8auth.client=true"

    aput-object v3, v6, v16

    invoke-static {v6}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    .end local v1    # "it":Ljava/io/File;
    .end local v2    # "$i$a$-let-LaunchArgsBuilder$build$agent$2":I
    goto :goto_1c

    :cond_2b
    const/4 v1, 0x0

    goto :goto_1c

    .line 84
    :pswitch_2
    invoke-virtual/range {p2 .. p2}, Lcom/pymcl/core/launch/LaunchOptions;->getAuthlibJar()Ljava/io/File;

    move-result-object v1

    if-eqz v1, :cond_2d

    .line 112
    .restart local v1    # "it":Ljava/io/File;
    const/4 v5, 0x0

    .line 84
    .local v5, "$i$a$-let-LaunchArgsBuilder$build$agent$1":I
    const/4 v6, 0x2

    new-array v12, v6, [Ljava/lang/String;

    sget-object v6, Lcom/pymcl/core/util/FileUtil;->INSTANCE:Lcom/pymcl/core/util/FileUtil;

    invoke-virtual {v6, v1}, Lcom/pymcl/core/util/FileUtil;->toLaunchPath(Ljava/io/File;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual/range {v32 .. v32}, Lcom/pymcl/core/account/Account;->getApi()Ljava/lang/String;

    move-result-object v14

    new-instance v15, Ljava/lang/StringBuilder;

    invoke-direct {v15}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v15, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v15

    invoke-virtual {v15, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/16 v19, 0x0

    aput-object v3, v12, v19

    invoke-virtual/range {p2 .. p2}, Lcom/pymcl/core/launch/LaunchOptions;->getAuthlibPrefetched()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_2c

    .line 112
    nop

    .restart local v3    # "p":Ljava/lang/String;
    const/4 v6, 0x0

    .line 84
    .local v6, "$i$a$-let-LaunchArgsBuilder$build$agent$1$1":I
    new-instance v14, Ljava/lang/StringBuilder;

    invoke-direct {v14}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v14, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .end local v3    # "p":Ljava/lang/String;
    .end local v6    # "$i$a$-let-LaunchArgsBuilder$build$agent$1$1":I
    goto :goto_1b

    :cond_2c
    const/4 v2, 0x0

    :goto_1b
    aput-object v2, v12, v16

    invoke-static {v12}, Lkotlin/collections/CollectionsKt;->listOfNotNull([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    .end local v1    # "it":Ljava/io/File;
    .end local v5    # "$i$a$-let-LaunchArgsBuilder$build$agent$1":I
    goto :goto_1c

    :cond_2d
    const/4 v1, 0x0

    .line 83
    :goto_1c
    nop

    .line 89
    .local v1, "agent":Ljava/util/List;
    if-eqz v1, :cond_30

    move-object v2, v1

    check-cast v2, Ljava/util/Collection;

    move-object v3, v0

    check-cast v3, Ljava/lang/Iterable;

    .local v3, "$this$filter$iv":Ljava/lang/Iterable;
    const/4 v5, 0x0

    .line 137
    .local v5, "$i$f$filter":I
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    check-cast v6, Ljava/util/Collection;

    .local v6, "destination$iv$iv":Ljava/util/Collection;
    move-object v12, v3

    .local v12, "$this$filterTo$iv$iv":Ljava/lang/Iterable;
    const/4 v14, 0x0

    .line 138
    .local v14, "$i$f$filterTo":I
    invoke-interface {v12}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v15

    :goto_1d
    invoke-interface {v15}, Ljava/util/Iterator;->hasNext()Z

    move-result v26

    if-eqz v26, :cond_2f

    move-object/from16 v26, v0

    .end local v0    # "all":Ljava/util/List;
    .local v26, "all":Ljava/util/List;
    invoke-interface {v15}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v27, v1

    .end local v1    # "agent":Ljava/util/List;
    .local v0, "element$iv$iv":Ljava/lang/Object;
    .local v27, "agent":Ljava/util/List;
    move-object v1, v0

    check-cast v1, Ljava/lang/String;

    .local v1, "it":Ljava/lang/String;
    const/16 v28, 0x0

    .line 89
    .local v28, "$i$a$-filter-LaunchArgsBuilder$build$6":I
    move-object/from16 v34, v3

    move/from16 v35, v5

    move-object/from16 v42, v7

    const/4 v3, 0x0

    const/4 v5, 0x2

    const/4 v7, 0x0

    .end local v3    # "$this$filter$iv":Ljava/lang/Iterable;
    .end local v5    # "$i$f$filter":I
    .end local v7    # "tok":Ljava/lang/String;
    .local v34, "$this$filter$iv":Ljava/lang/Iterable;
    .local v35, "$i$f$filter":I
    .local v42, "tok":Ljava/lang/String;
    invoke-static {v1, v4, v7, v5, v3}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v36

    .line 138
    .end local v1    # "it":Ljava/lang/String;
    .end local v28    # "$i$a$-filter-LaunchArgsBuilder$build$6":I
    if-nez v36, :cond_2e

    invoke-interface {v6, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    :cond_2e
    move-object/from16 v0, v26

    move-object/from16 v1, v27

    move-object/from16 v3, v34

    move/from16 v5, v35

    move-object/from16 v7, v42

    goto :goto_1d

    .line 139
    .end local v26    # "all":Ljava/util/List;
    .end local v27    # "agent":Ljava/util/List;
    .end local v34    # "$this$filter$iv":Ljava/lang/Iterable;
    .end local v35    # "$i$f$filter":I
    .end local v42    # "tok":Ljava/lang/String;
    .local v0, "all":Ljava/util/List;
    .local v1, "agent":Ljava/util/List;
    .restart local v3    # "$this$filter$iv":Ljava/lang/Iterable;
    .restart local v5    # "$i$f$filter":I
    .restart local v7    # "tok":Ljava/lang/String;
    :cond_2f
    move-object/from16 v26, v0

    move-object/from16 v27, v1

    move-object/from16 v34, v3

    move/from16 v35, v5

    move-object/from16 v42, v7

    .end local v0    # "all":Ljava/util/List;
    .end local v1    # "agent":Ljava/util/List;
    .end local v3    # "$this$filter$iv":Ljava/lang/Iterable;
    .end local v5    # "$i$f$filter":I
    .end local v6    # "destination$iv$iv":Ljava/util/Collection;
    .end local v7    # "tok":Ljava/lang/String;
    .end local v12    # "$this$filterTo$iv$iv":Ljava/lang/Iterable;
    .end local v14    # "$i$f$filterTo":I
    .restart local v26    # "all":Ljava/util/List;
    .restart local v27    # "agent":Ljava/util/List;
    .restart local v34    # "$this$filter$iv":Ljava/lang/Iterable;
    .restart local v35    # "$i$f$filter":I
    .restart local v42    # "tok":Ljava/lang/String;
    move-object v0, v6

    check-cast v0, Ljava/util/List;

    .line 137
    nop

    .end local v34    # "$this$filter$iv":Ljava/lang/Iterable;
    .end local v35    # "$i$f$filter":I
    check-cast v0, Ljava/lang/Iterable;

    .line 89
    invoke-static {v2, v0}, Lkotlin/collections/CollectionsKt;->plus(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    move-object/from16 v37, v0

    .end local v26    # "all":Ljava/util/List;
    .restart local v0    # "all":Ljava/util/List;
    goto :goto_1e

    .end local v27    # "agent":Ljava/util/List;
    .end local v42    # "tok":Ljava/lang/String;
    .restart local v1    # "agent":Ljava/util/List;
    .restart local v7    # "tok":Ljava/lang/String;
    :cond_30
    move-object/from16 v26, v0

    move-object/from16 v27, v1

    move-object/from16 v42, v7

    .end local v0    # "all":Ljava/util/List;
    .end local v1    # "agent":Ljava/util/List;
    .end local v7    # "tok":Ljava/lang/String;
    .restart local v26    # "all":Ljava/util/List;
    .restart local v27    # "agent":Ljava/util/List;
    .restart local v42    # "tok":Ljava/lang/String;
    move-object/from16 v37, v26

    .line 90
    .end local v26    # "all":Ljava/util/List;
    .local v37, "all":Ljava/util/List;
    :goto_1e
    move-object/from16 v0, v39

    check-cast v0, Ljava/lang/Iterable;

    .local v0, "$this$none$iv":Ljava/lang/Iterable;
    const/4 v1, 0x0

    .line 140
    .local v1, "$i$f$none":I
    instance-of v2, v0, Ljava/util/Collection;

    if-eqz v2, :cond_31

    move-object v2, v0

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_31

    move/from16 v0, v16

    goto :goto_1f

    .line 141
    :cond_31
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_32
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_33

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    .local v3, "element$iv":Ljava/lang/Object;
    move-object v4, v3

    check-cast v4, Ljava/lang/String;

    .local v4, "it":Ljava/lang/String;
    const/4 v5, 0x0

    .line 90
    .local v5, "$i$a$-none-LaunchArgsBuilder$build$7":I
    const-string v6, "--width"

    invoke-static {v4, v6}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    .line 141
    .end local v4    # "it":Ljava/lang/String;
    .end local v5    # "$i$a$-none-LaunchArgsBuilder$build$7":I
    if-eqz v4, :cond_32

    const/4 v0, 0x0

    goto :goto_1f

    .line 142
    .end local v3    # "element$iv":Ljava/lang/Object;
    :cond_33
    move/from16 v0, v16

    .line 90
    .end local v0    # "$this$none$iv":Ljava/lang/Iterable;
    .end local v1    # "$i$f$none":I
    :goto_1f
    if-eqz v0, :cond_34

    invoke-virtual/range {p2 .. p2}, Lcom/pymcl/core/launch/LaunchOptions;->getFullscreen()Z

    move-result v0

    if-eqz v0, :cond_34

    move-object/from16 v0, v39

    check-cast v0, Ljava/util/Collection;

    const-string v1, "--fullscreen"

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 91
    :cond_34
    invoke-virtual/range {p2 .. p2}, Lcom/pymcl/core/launch/LaunchOptions;->getServer()Ljava/lang/String;

    move-result-object v0

    check-cast v0, Ljava/lang/CharSequence;

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-lez v0, :cond_35

    move/from16 v0, v16

    goto :goto_20

    :cond_35
    const/4 v0, 0x0

    :goto_20
    if-eqz v0, :cond_38

    move-object/from16 v0, v39

    check-cast v0, Ljava/util/Collection;

    const/4 v5, 0x2

    new-array v1, v5, [Ljava/lang/String;

    const-string v2, "--server"

    const/16 v19, 0x0

    aput-object v2, v1, v19

    invoke-virtual/range {p2 .. p2}, Lcom/pymcl/core/launch/LaunchOptions;->getServer()Ljava/lang/String;

    move-result-object v2

    aput-object v2, v1, v16

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-static {v0, v1}, Lkotlin/collections/CollectionsKt;->addAll(Ljava/util/Collection;Ljava/lang/Iterable;)Z

    move-object/from16 v0, v39

    check-cast v0, Ljava/util/Collection;

    new-array v1, v5, [Ljava/lang/String;

    const-string v2, "--port"

    aput-object v2, v1, v19

    invoke-virtual/range {p2 .. p2}, Lcom/pymcl/core/launch/LaunchOptions;->getPort()Ljava/lang/String;

    move-result-object v2

    check-cast v2, Ljava/lang/CharSequence;

    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    move-result v3

    if-nez v3, :cond_36

    move/from16 v6, v16

    goto :goto_21

    :cond_36
    const/4 v6, 0x0

    :goto_21
    if-eqz v6, :cond_37

    .line 112
    const/4 v2, 0x0

    .line 91
    .local v2, "$i$a$-ifEmpty-LaunchArgsBuilder$build$8":I
    nop

    .end local v2    # "$i$a$-ifEmpty-LaunchArgsBuilder$build$8":I
    const-string v2, "25565"

    :cond_37
    aput-object v2, v1, v16

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-static {v0, v1}, Lkotlin/collections/CollectionsKt;->addAll(Ljava/util/Collection;Ljava/lang/Iterable;)Z

    .line 92
    :cond_38
    move-object/from16 v0, v39

    check-cast v0, Ljava/util/Collection;

    sget-object v1, Lcom/pymcl/core/launch/ArgSplit;->INSTANCE:Lcom/pymcl/core/launch/ArgSplit;

    invoke-virtual/range {p2 .. p2}, Lcom/pymcl/core/launch/LaunchOptions;->getVersionGameArgs()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/pymcl/core/launch/ArgSplit;->split(Ljava/lang/String;)Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-static {v0, v1}, Lkotlin/collections/CollectionsKt;->addAll(Ljava/util/Collection;Ljava/lang/Iterable;)Z

    .line 93
    sget-object v0, Lcom/pymcl/core/java/JavaRequirement;->INSTANCE:Lcom/pymcl/core/java/JavaRequirement;

    invoke-virtual/range {p1 .. p1}, Lcom/pymcl/core/version/ResolvedVersion;->getMcVersion()Ljava/lang/String;

    move-result-object v1

    invoke-virtual/range {p1 .. p1}, Lcom/pymcl/core/version/ResolvedVersion;->getJavaMajor()Ljava/lang/Integer;

    move-result-object v4

    if-nez v4, :cond_3a

    invoke-virtual/range {p1 .. p1}, Lcom/pymcl/core/version/ResolvedVersion;->getMainClass()Ljava/lang/String;

    move-result-object v2

    check-cast v2, Ljava/lang/CharSequence;

    const-string v3, "bootstraplauncher"

    check-cast v3, Ljava/lang/CharSequence;

    move/from16 v6, v16

    invoke-static {v2, v3, v6}, Lkotlin/text/StringsKt;->contains(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v2

    if-eqz v2, :cond_39

    invoke-static/range {v22 .. v22}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    goto :goto_22

    :cond_39
    const/4 v4, 0x0

    goto :goto_22

    :cond_3a
    move/from16 v6, v16

    :goto_22
    invoke-virtual {v0, v1, v4}, Lcom/pymcl/core/java/JavaRequirement;->requiredMajor(Ljava/lang/String;Ljava/lang/Integer;)I

    move-result v0

    .line 94
    .local v0, "major":I
    const/16 v1, 0x9

    if-ge v0, v1, :cond_42

    move-object/from16 v1, v37

    check-cast v1, Ljava/lang/Iterable;

    .local v1, "$this$any$iv":Ljava/lang/Iterable;
    const/4 v2, 0x0

    .line 143
    .local v2, "$i$f$any":I
    instance-of v3, v1, Ljava/util/Collection;

    if-eqz v3, :cond_3b

    move-object v3, v1

    check-cast v3, Ljava/util/Collection;

    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_3b

    const/4 v14, 0x0

    goto :goto_26

    .line 144
    :cond_3b
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_23
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_40

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    .local v4, "element$iv":Ljava/lang/Object;
    move-object v5, v4

    check-cast v5, Ljava/lang/String;

    .local v5, "it":Ljava/lang/String;
    const/4 v7, 0x0

    .line 94
    .local v7, "$i$a$-any-LaunchArgsBuilder$build$9":I
    invoke-static {v5, v13}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_3d

    const-string v12, "--add-opens"

    const/4 v6, 0x2

    const/4 v14, 0x0

    const/4 v15, 0x0

    invoke-static {v5, v12, v14, v6, v15}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_3e

    const-string v12, "--add-exports"

    invoke-static {v5, v12, v14, v6, v15}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_3c

    goto :goto_24

    :cond_3c
    move v5, v14

    goto :goto_25

    :cond_3d
    const/4 v6, 0x2

    const/4 v14, 0x0

    const/4 v15, 0x0

    :cond_3e
    :goto_24
    const/4 v5, 0x1

    .line 144
    .end local v5    # "it":Ljava/lang/String;
    .end local v7    # "$i$a$-any-LaunchArgsBuilder$build$9":I
    :goto_25
    if-eqz v5, :cond_3f

    const/4 v14, 0x1

    goto :goto_26

    :cond_3f
    const/4 v6, 0x1

    goto :goto_23

    .line 145
    .end local v4    # "element$iv":Ljava/lang/Object;
    :cond_40
    const/4 v14, 0x0

    .line 94
    .end local v1    # "$this$any$iv":Ljava/lang/Iterable;
    .end local v2    # "$i$f$any":I
    :goto_26
    if-nez v14, :cond_41

    goto :goto_27

    .line 95
    :cond_41
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "\u8be5\u7248\u672c\u9700\u8981\u6a21\u5757\u5316\u53c2\u6570\uff0c\u8bf7\u6539\u7528 Java 17"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 96
    :cond_42
    :goto_27
    new-instance v34, Lcom/pymcl/core/launch/LaunchSpec;

    sget-object v1, Lcom/pymcl/core/util/FileUtil;->INSTANCE:Lcom/pymcl/core/util/FileUtil;

    invoke-virtual/range {p2 .. p2}, Lcom/pymcl/core/launch/LaunchOptions;->getGameDir()Ljava/io/File;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/pymcl/core/util/FileUtil;->toLaunchPath(Ljava/io/File;)Ljava/lang/String;

    move-result-object v36

    invoke-virtual/range {p1 .. p1}, Lcom/pymcl/core/version/ResolvedVersion;->getMainClass()Ljava/lang/String;

    move-result-object v38

    move/from16 v35, v0

    .end local v0    # "major":I
    .local v35, "major":I
    invoke-direct/range {v34 .. v39}, Lcom/pymcl/core/launch/LaunchSpec;-><init>(ILjava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;)V

    return-object v34

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
