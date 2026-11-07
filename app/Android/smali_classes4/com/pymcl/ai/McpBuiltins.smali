.class public final Lcom/pymcl/ai/McpBuiltins;
.super Ljava/lang/Object;
.source "Mcp.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/pymcl/ai/McpBuiltins$Tpl;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nMcp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Mcp.kt\ncom/pymcl/ai/McpBuiltins\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,552:1\n1739#2:553\n1814#2,3:554\n777#2:557\n873#2,2:558\n1739#2:560\n1814#2,3:561\n1795#2,10:565\n2068#2:575\n2069#2:577\n1805#2:578\n1739#2:579\n1814#2,3:580\n1#3:564\n1#3:576\n*S KotlinDebug\n*F\n+ 1 Mcp.kt\ncom/pymcl/ai/McpBuiltins\n*L\n71#1:553\n71#1:554,3\n77#1:557\n77#1:558,2\n78#1:560\n78#1:561,3\n69#1:565,10\n69#1:575\n69#1:577\n69#1:578\n69#1:579\n69#1:580,3\n69#1:576\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\u0008\u0002\u0008\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001\u0018B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000e\u0010\u000e\u001a\u00020\u000c2\u0006\u0010\u000f\u001a\u00020\u000cJB\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u00110\u00052\u0006\u0010\u0012\u001a\u00020\u000c2\u001c\u0010\u0013\u001a\u0018\u0012\u0004\u0012\u00020\u000c\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0014j\u0004\u0018\u0001`\u00152\u000e\u0008\u0002\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u0017R!\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00058BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\t\u0010\n\u001a\u0004\u0008\u0007\u0010\u0008R\u0017\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u00058F\u00a2\u0006\u0006\u001a\u0004\u0008\r\u0010\u0008\u00a8\u0006\u0019"
    }
    d2 = {
        "Lcom/pymcl/ai/McpBuiltins;",
        "",
        "<init>",
        "()V",
        "TEMPLATES",
        "",
        "Lcom/pymcl/ai/McpBuiltins$Tpl;",
        "getTEMPLATES",
        "()Ljava/util/List;",
        "TEMPLATES$delegate",
        "Lkotlin/Lazy;",
        "NAMES",
        "",
        "getNAMES",
        "kindOf",
        "name",
        "forServer",
        "Lcom/pymcl/ai/McpTool;",
        "server",
        "capabilities",
        "",
        "Lcom/pymcl/core/util/JObj;",
        "existing",
        "",
        "Tpl",
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
.field public static final INSTANCE:Lcom/pymcl/ai/McpBuiltins;

.field private static final TEMPLATES$delegate:Lkotlin/Lazy;


# direct methods
.method public static synthetic $r8$lambda$KJ43v7TWJeAOkBSoup2_FGrFOW4()Ljava/util/List;
    .locals 1

    invoke-static {}, Lcom/pymcl/ai/McpBuiltins;->TEMPLATES_delegate$lambda$0()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/pymcl/ai/McpBuiltins;

    invoke-direct {v0}, Lcom/pymcl/ai/McpBuiltins;-><init>()V

    sput-object v0, Lcom/pymcl/ai/McpBuiltins;->INSTANCE:Lcom/pymcl/ai/McpBuiltins;

    .line 67
    new-instance v0, Lcom/pymcl/ai/McpBuiltins$$ExternalSyntheticLambda0;

    invoke-direct {v0}, Lcom/pymcl/ai/McpBuiltins$$ExternalSyntheticLambda0;-><init>()V

    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    sput-object v0, Lcom/pymcl/ai/McpBuiltins;->TEMPLATES$delegate:Lkotlin/Lazy;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 64
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static final TEMPLATES_delegate$lambda$0()Ljava/util/List;
    .locals 16

    .line 68
    const-class v0, Lcom/pymcl/ai/McpBuiltins;

    const-string v1, "/pymcl_ai/mcp_builtin_schemas.json"

    invoke-virtual {v0, v1}, Ljava/lang/Class;->getResourceAsStream(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    move-object v1, v0

    check-cast v1, Ljava/io/Closeable;

    :try_start_0
    move-object v0, v1

    check-cast v0, Ljava/io/InputStream;

    .line 564
    .local v0, "it":Ljava/io/InputStream;
    const/4 v2, 0x0

    .local v2, "$i$a$-use-McpBuiltins$TEMPLATES$2$txt$1":I
    new-instance v3, Ljava/lang/String;

    .line 68
    invoke-static {v0}, Lkotlin/io/ByteStreamsKt;->readBytes(Ljava/io/InputStream;)[B

    move-result-object v4

    sget-object v5, Lkotlin/text/Charsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-direct {v3, v4, v5}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .end local v0    # "it":Ljava/io/InputStream;
    .end local v2    # "$i$a$-use-McpBuiltins$TEMPLATES$2$txt$1":I
    const/4 v0, 0x0

    invoke-static {v1, v0}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 69
    .local v3, "txt":Ljava/lang/String;
    sget-object v0, Lcom/pymcl/core/util/Json;->INSTANCE:Lcom/pymcl/core/util/Json;

    invoke-virtual {v0, v3}, Lcom/pymcl/core/util/Json;->parse(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type kotlin.collections.List<*>"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    .local v0, "$this$mapNotNull$iv":Ljava/lang/Iterable;
    const/4 v1, 0x0

    .line 565
    .local v1, "$i$f$mapNotNull":I
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    check-cast v2, Ljava/util/Collection;

    .local v2, "destination$iv$iv":Ljava/util/Collection;
    move-object v4, v0

    .local v4, "$this$mapNotNullTo$iv$iv":Ljava/lang/Iterable;
    const/4 v5, 0x0

    .line 574
    .local v5, "$i$f$mapNotNullTo":I
    move-object v6, v4

    .local v6, "$this$forEach$iv$iv$iv":Ljava/lang/Iterable;
    const/4 v7, 0x0

    .line 575
    .local v7, "$i$f$forEach":I
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_0
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_1

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    .local v9, "element$iv$iv$iv":Ljava/lang/Object;
    move-object v10, v9

    .local v10, "element$iv$iv":Ljava/lang/Object;
    const/4 v11, 0x0

    .line 574
    .local v11, "$i$a$-forEach-CollectionsKt___CollectionsKt$mapNotNullTo$1$iv$iv":I
    move-object v12, v10

    .local v12, "it":Ljava/lang/Object;
    const/4 v13, 0x0

    .line 69
    .local v13, "$i$a$-mapNotNull-McpBuiltins$TEMPLATES$2$1":I
    invoke-static {v12}, Lcom/pymcl/core/util/JsonKt;->o(Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v12

    .line 574
    .end local v12    # "it":Ljava/lang/Object;
    .end local v13    # "$i$a$-mapNotNull-McpBuiltins$TEMPLATES$2$1":I
    if-eqz v12, :cond_0

    .line 576
    .local v12, "it$iv$iv":Ljava/lang/Object;
    const/4 v13, 0x0

    .line 574
    .local v13, "$i$a$-let-CollectionsKt___CollectionsKt$mapNotNullTo$1$1$iv$iv":I
    invoke-interface {v2, v12}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 575
    .end local v10    # "element$iv$iv":Ljava/lang/Object;
    .end local v11    # "$i$a$-forEach-CollectionsKt___CollectionsKt$mapNotNullTo$1$iv$iv":I
    .end local v12    # "it$iv$iv":Ljava/lang/Object;
    .end local v13    # "$i$a$-let-CollectionsKt___CollectionsKt$mapNotNullTo$1$1$iv$iv":I
    :cond_0
    nop

    .end local v9    # "element$iv$iv$iv":Ljava/lang/Object;
    goto :goto_0

    .line 577
    :cond_1
    nop

    .line 578
    .end local v6    # "$this$forEach$iv$iv$iv":Ljava/lang/Iterable;
    .end local v7    # "$i$f$forEach":I
    nop

    .end local v2    # "destination$iv$iv":Ljava/util/Collection;
    .end local v4    # "$this$mapNotNullTo$iv$iv":Ljava/lang/Iterable;
    .end local v5    # "$i$f$mapNotNullTo":I
    check-cast v2, Ljava/util/List;

    .line 565
    nop

    .end local v0    # "$this$mapNotNull$iv":Ljava/lang/Iterable;
    .end local v1    # "$i$f$mapNotNull":I
    check-cast v2, Ljava/lang/Iterable;

    .line 69
    nop

    .local v2, "$this$map$iv":Ljava/lang/Iterable;
    const/4 v0, 0x0

    .line 579
    .local v0, "$i$f$map":I
    new-instance v1, Ljava/util/ArrayList;

    const/16 v4, 0xa

    invoke-static {v2, v4}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v1, v4}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v1, Ljava/util/Collection;

    .local v1, "destination$iv$iv":Ljava/util/Collection;
    move-object v4, v2

    .local v4, "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    const/4 v5, 0x0

    .line 580
    .local v5, "$i$f$mapTo":I
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_1
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_4

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    .line 581
    .local v7, "item$iv$iv":Ljava/lang/Object;
    move-object v8, v7

    check-cast v8, Ljava/util/Map;

    .local v8, "it":Ljava/util/Map;
    const/4 v9, 0x0

    .line 69
    .local v9, "$i$a$-map-McpBuiltins$TEMPLATES$2$2":I
    new-instance v10, Lcom/pymcl/ai/McpBuiltins$Tpl;

    const-string v11, "name"

    invoke-static {v8, v11}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    invoke-static {v11}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    const-string v12, "capability"

    invoke-static {v8, v12}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    invoke-static {v12}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    const-string v13, "description"

    invoke-static {v8, v13}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    if-nez v13, :cond_2

    const-string v13, ""

    :cond_2
    const-string v14, "parameters"

    invoke-static {v8, v14}, Lcom/pymcl/core/util/JsonKt;->obj(Ljava/util/Map;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v14

    if-nez v14, :cond_3

    const/4 v14, 0x0

    new-array v14, v14, [Lkotlin/Pair;

    invoke-static {v14}, Lcom/pymcl/core/util/JsonKt;->jobj([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v14

    :cond_3
    const-string v15, "requires"

    invoke-static {v8, v15}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v15

    invoke-direct/range {v10 .. v15}, Lcom/pymcl/ai/McpBuiltins$Tpl;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)V

    .line 581
    .end local v8    # "it":Ljava/util/Map;
    .end local v9    # "$i$a$-map-McpBuiltins$TEMPLATES$2$2":I
    invoke-interface {v1, v10}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 582
    .end local v7    # "item$iv$iv":Ljava/lang/Object;
    :cond_4
    nop

    .end local v1    # "destination$iv$iv":Ljava/util/Collection;
    .end local v4    # "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    .end local v5    # "$i$f$mapTo":I
    check-cast v1, Ljava/util/List;

    .line 579
    nop

    .line 69
    .end local v0    # "$i$f$map":I
    .end local v2    # "$this$map$iv":Ljava/lang/Iterable;
    return-object v1

    .line 68
    .end local v3    # "txt":Ljava/lang/String;
    :catchall_0
    move-exception v0

    move-object v2, v0

    :try_start_1
    throw v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :catchall_1
    move-exception v0

    invoke-static {v1, v2}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v0
.end method

.method public static synthetic forServer$default(Lcom/pymcl/ai/McpBuiltins;Ljava/lang/String;Ljava/util/Map;Ljava/util/Collection;ILjava/lang/Object;)Ljava/util/List;
    .locals 0

    .line 75
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object p3

    check-cast p3, Ljava/util/Collection;

    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Lcom/pymcl/ai/McpBuiltins;->forServer(Ljava/lang/String;Ljava/util/Map;Ljava/util/Collection;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method private final getTEMPLATES()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/pymcl/ai/McpBuiltins$Tpl;",
            ">;"
        }
    .end annotation

    .line 67
    sget-object v0, Lcom/pymcl/ai/McpBuiltins;->TEMPLATES$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    return-object v0
.end method


# virtual methods
.method public final forServer(Ljava/lang/String;Ljava/util/Map;Ljava/util/Collection;)Ljava/util/List;
    .locals 20
    .param p1, "server"    # Ljava/lang/String;
    .param p2, "capabilities"    # Ljava/util/Map;
    .param p3, "existing"    # Ljava/util/Collection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/util/Collection<",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/util/List<",
            "Lcom/pymcl/ai/McpTool;",
            ">;"
        }
    .end annotation

    move-object/from16 v0, p3

    const-string v1, "server"

    move-object/from16 v3, p1

    invoke-static {v3, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "existing"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 76
    if-nez p2, :cond_0

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v1

    return-object v1

    :cond_0
    move-object/from16 v1, p2

    .line 77
    .local v1, "caps":Ljava/util/Map;
    invoke-direct/range {p0 .. p0}, Lcom/pymcl/ai/McpBuiltins;->getTEMPLATES()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    .local v2, "$this$filter$iv":Ljava/lang/Iterable;
    const/4 v4, 0x0

    .line 557
    .local v4, "$i$f$filter":I
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    check-cast v5, Ljava/util/Collection;

    .local v5, "destination$iv$iv":Ljava/util/Collection;
    move-object v6, v2

    .local v6, "$this$filterTo$iv$iv":Ljava/lang/Iterable;
    const/4 v7, 0x0

    .line 558
    .local v7, "$i$f$filterTo":I
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :cond_1
    :goto_0
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    const/4 v10, 0x0

    if-eqz v9, :cond_4

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    .local v9, "element$iv$iv":Ljava/lang/Object;
    move-object v11, v9

    check-cast v11, Lcom/pymcl/ai/McpBuiltins$Tpl;

    .local v11, "it":Lcom/pymcl/ai/McpBuiltins$Tpl;
    const/4 v12, 0x0

    .line 77
    .local v12, "$i$a$-filter-McpBuiltins$forServer$1":I
    invoke-virtual {v11}, Lcom/pymcl/ai/McpBuiltins$Tpl;->getCapability()Ljava/lang/String;

    move-result-object v13

    invoke-static {v1, v13}, Lcom/pymcl/core/util/JsonKt;->obj(Ljava/util/Map;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v13

    if-eqz v13, :cond_3

    invoke-virtual {v11}, Lcom/pymcl/ai/McpBuiltins$Tpl;->getRequires()Ljava/lang/String;

    move-result-object v13

    const/4 v14, 0x1

    if-eqz v13, :cond_2

    invoke-virtual {v11}, Lcom/pymcl/ai/McpBuiltins$Tpl;->getCapability()Ljava/lang/String;

    move-result-object v13

    invoke-static {v1, v13}, Lcom/pymcl/core/util/JsonKt;->obj(Ljava/util/Map;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v13

    invoke-virtual {v11}, Lcom/pymcl/ai/McpBuiltins$Tpl;->getRequires()Ljava/lang/String;

    move-result-object v15

    invoke-static {v13, v15}, Lcom/pymcl/core/util/JsonKt;->bool(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v13

    invoke-static {v14}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v15

    invoke-static {v13, v15}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_3

    :cond_2
    invoke-virtual {v11}, Lcom/pymcl/ai/McpBuiltins$Tpl;->getName()Ljava/lang/String;

    move-result-object v13

    invoke-interface {v0, v13}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_3

    move v10, v14

    .line 558
    .end local v11    # "it":Lcom/pymcl/ai/McpBuiltins$Tpl;
    .end local v12    # "$i$a$-filter-McpBuiltins$forServer$1":I
    :cond_3
    if-eqz v10, :cond_1

    invoke-interface {v5, v9}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 559
    .end local v9    # "element$iv$iv":Ljava/lang/Object;
    :cond_4
    nop

    .end local v5    # "destination$iv$iv":Ljava/util/Collection;
    .end local v6    # "$this$filterTo$iv$iv":Ljava/lang/Iterable;
    .end local v7    # "$i$f$filterTo":I
    check-cast v5, Ljava/util/List;

    .line 557
    nop

    .end local v2    # "$this$filter$iv":Ljava/lang/Iterable;
    .end local v4    # "$i$f$filter":I
    check-cast v5, Ljava/lang/Iterable;

    .line 78
    move-object v11, v5

    .local v11, "$this$map$iv":Ljava/lang/Iterable;
    const/4 v12, 0x0

    .line 560
    .local v12, "$i$f$map":I
    new-instance v2, Ljava/util/ArrayList;

    const/16 v4, 0xa

    invoke-static {v11, v4}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v2, v4}, Ljava/util/ArrayList;-><init>(I)V

    move-object v13, v2

    check-cast v13, Ljava/util/Collection;

    .local v13, "destination$iv$iv":Ljava/util/Collection;
    move-object v14, v11

    .local v14, "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    const/4 v15, 0x0

    .line 561
    .local v15, "$i$f$mapTo":I
    invoke-interface {v14}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v16

    :goto_1
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_6

    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v17

    .line 562
    .local v17, "item$iv$iv":Ljava/lang/Object;
    move-object/from16 v18, v17

    check-cast v18, Lcom/pymcl/ai/McpBuiltins$Tpl;

    .local v18, "it":Lcom/pymcl/ai/McpBuiltins$Tpl;
    const/16 v19, 0x0

    .line 78
    .local v19, "$i$a$-map-McpBuiltins$forServer$2":I
    new-instance v2, Lcom/pymcl/ai/McpTool;

    invoke-virtual/range {v18 .. v18}, Lcom/pymcl/ai/McpBuiltins$Tpl;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual/range {v18 .. v18}, Lcom/pymcl/ai/McpBuiltins$Tpl;->getDescription()Ljava/lang/String;

    move-result-object v5

    invoke-virtual/range {v18 .. v18}, Lcom/pymcl/ai/McpBuiltins$Tpl;->getParameters()Ljava/util/Map;

    move-result-object v6

    invoke-static {v6}, Lcom/pymcl/core/util/JsonKt;->deepCopy(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    invoke-static {v6}, Lcom/pymcl/core/util/JsonKt;->o(Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v6

    if-nez v6, :cond_5

    new-array v6, v10, [Lkotlin/Pair;

    invoke-static {v6}, Lcom/pymcl/core/util/JsonKt;->jobj([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v6

    :cond_5
    sget-object v7, Lcom/pymcl/ai/McpBuiltins;->INSTANCE:Lcom/pymcl/ai/McpBuiltins;

    invoke-virtual/range {v18 .. v18}, Lcom/pymcl/ai/McpBuiltins$Tpl;->getName()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Lcom/pymcl/ai/McpBuiltins;->kindOf(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    const/4 v7, 0x1

    const/4 v8, 0x0

    invoke-direct/range {v2 .. v9}, Lcom/pymcl/ai/McpTool;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZZLjava/lang/String;)V

    .line 562
    .end local v18    # "it":Lcom/pymcl/ai/McpBuiltins$Tpl;
    .end local v19    # "$i$a$-map-McpBuiltins$forServer$2":I
    invoke-interface {v13, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move-object/from16 v3, p1

    goto :goto_1

    .line 563
    .end local v17    # "item$iv$iv":Ljava/lang/Object;
    :cond_6
    nop

    .end local v13    # "destination$iv$iv":Ljava/util/Collection;
    .end local v14    # "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    .end local v15    # "$i$f$mapTo":I
    move-object v2, v13

    check-cast v2, Ljava/util/List;

    .line 560
    nop

    .line 77
    .end local v11    # "$this$map$iv":Ljava/lang/Iterable;
    .end local v12    # "$i$f$map":I
    return-object v2
.end method

.method public final getNAMES()Ljava/util/List;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 71
    invoke-direct {p0}, Lcom/pymcl/ai/McpBuiltins;->getTEMPLATES()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    .local v0, "$this$map$iv":Ljava/lang/Iterable;
    const/4 v1, 0x0

    .line 553
    .local v1, "$i$f$map":I
    new-instance v2, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {v0, v3}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v2, Ljava/util/Collection;

    .local v2, "destination$iv$iv":Ljava/util/Collection;
    move-object v3, v0

    .local v3, "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    const/4 v4, 0x0

    .line 554
    .local v4, "$i$f$mapTo":I
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_0

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    .line 555
    .local v6, "item$iv$iv":Ljava/lang/Object;
    move-object v7, v6

    check-cast v7, Lcom/pymcl/ai/McpBuiltins$Tpl;

    .local v7, "it":Lcom/pymcl/ai/McpBuiltins$Tpl;
    const/4 v8, 0x0

    .line 71
    .local v8, "$i$a$-map-McpBuiltins$NAMES$1":I
    invoke-virtual {v7}, Lcom/pymcl/ai/McpBuiltins$Tpl;->getName()Ljava/lang/String;

    move-result-object v7

    .line 555
    .end local v7    # "it":Lcom/pymcl/ai/McpBuiltins$Tpl;
    .end local v8    # "$i$a$-map-McpBuiltins$NAMES$1":I
    invoke-interface {v2, v7}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 556
    .end local v6    # "item$iv$iv":Ljava/lang/Object;
    :cond_0
    nop

    .end local v2    # "destination$iv$iv":Ljava/util/Collection;
    .end local v3    # "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    .end local v4    # "$i$f$mapTo":I
    check-cast v2, Ljava/util/List;

    .line 553
    nop

    .line 71
    .end local v0    # "$this$map$iv":Ljava/lang/Iterable;
    .end local v1    # "$i$f$map":I
    return-object v2
.end method

.method public final kindOf(Ljava/lang/String;)Ljava/lang/String;
    .locals 1
    .param p1, "name"    # Ljava/lang/String;

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 73
    const-string v0, "mcp_"

    check-cast v0, Ljava/lang/CharSequence;

    invoke-static {p1, v0}, Lkotlin/text/StringsKt;->removePrefix(Ljava/lang/String;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
