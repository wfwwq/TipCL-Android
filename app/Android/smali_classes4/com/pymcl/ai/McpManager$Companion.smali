.class public final Lcom/pymcl/ai/McpManager$Companion;
.super Ljava/lang/Object;
.source "Mcp.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/pymcl/ai/McpManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nMcp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Mcp.kt\ncom/pymcl/ai/McpManager$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,552:1\n1795#2,10:553\n2068#2:563\n1358#2,2:565\n1435#2,4:567\n2069#2:572\n1805#2:573\n1#3:564\n1#3:571\n*S KotlinDebug\n*F\n+ 1 Mcp.kt\ncom/pymcl/ai/McpManager$Companion\n*L\n430#1:553,10\n430#1:563\n436#1:565,2\n436#1:567,4\n430#1:572\n430#1:573\n430#1:571\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0000\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005J\u0010\u0010\u0008\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005H\u0002J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000c\u001a\u00020\u0005J&\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u000e2\u0018\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0011j\u0002`\u0012\u00a8\u0006\u0013"
    }
    d2 = {
        "Lcom/pymcl/ai/McpManager$Companion;",
        "",
        "<init>",
        "()V",
        "fullName",
        "",
        "server",
        "tool",
        "sanitize",
        "s",
        "isMcp",
        "",
        "name",
        "parseConfig",
        "",
        "Lcom/pymcl/ai/McpServerConfig;",
        "o",
        "",
        "Lcom/pymcl/core/util/JObj;",
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

    .line 423
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lcom/pymcl/ai/McpManager$Companion;-><init>()V

    return-void
.end method

.method private final sanitize(Ljava/lang/String;)Ljava/lang/String;
    .locals 3
    .param p1, "s"    # Ljava/lang/String;

    .line 425
    move-object v0, p1

    check-cast v0, Ljava/lang/CharSequence;

    new-instance v1, Lkotlin/text/Regex;

    const-string v2, "[^A-Za-z0-9_-]"

    invoke-direct {v1, v2}, Lkotlin/text/Regex;-><init>(Ljava/lang/String;)V

    const-string v2, "_"

    invoke-virtual {v1, v0, v2}, Lkotlin/text/Regex;->replace(Ljava/lang/CharSequence;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x28

    invoke-static {v0, v1}, Lkotlin/text/StringsKt;->take(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final fullName(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 4
    .param p1, "server"    # Ljava/lang/String;
    .param p2, "tool"    # Ljava/lang/String;

    const-string v0, "server"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "tool"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 424
    invoke-direct {p0, p1}, Lcom/pymcl/ai/McpManager$Companion;->sanitize(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, p2}, Lcom/pymcl/ai/McpManager$Companion;->sanitize(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "mcp__"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, "__"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final isMcp(Ljava/lang/String;)Z
    .locals 4
    .param p1, "name"    # Ljava/lang/String;

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 426
    const/4 v0, 0x2

    const/4 v1, 0x0

    const-string v2, "mcp__"

    const/4 v3, 0x0

    invoke-static {p1, v2, v3, v0, v1}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public final parseConfig(Ljava/util/Map;)Ljava/util/List;
    .locals 33
    .param p1, "o"    # Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)",
            "Ljava/util/List<",
            "Lcom/pymcl/ai/McpServerConfig;",
            ">;"
        }
    .end annotation

    move-object/from16 v0, p1

    const-string v1, "o"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 429
    const-string v1, "mcpServers"

    invoke-static {v0, v1}, Lcom/pymcl/core/util/JsonKt;->obj(Ljava/util/Map;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v1

    if-nez v1, :cond_0

    const-string v1, "servers"

    invoke-static {v0, v1}, Lcom/pymcl/core/util/JsonKt;->obj(Ljava/util/Map;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v1

    if-nez v1, :cond_0

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v1

    return-object v1

    .line 430
    .local v1, "servers":Ljava/util/Map;
    :cond_0
    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    .local v2, "$this$mapNotNull$iv":Ljava/lang/Iterable;
    const/4 v3, 0x0

    .line 553
    .local v3, "$i$f$mapNotNull":I
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    check-cast v4, Ljava/util/Collection;

    .local v4, "destination$iv$iv":Ljava/util/Collection;
    move-object v5, v2

    .local v5, "$this$mapNotNullTo$iv$iv":Ljava/lang/Iterable;
    const/4 v6, 0x0

    .line 562
    .local v6, "$i$f$mapNotNullTo":I
    move-object v7, v5

    .local v7, "$this$forEach$iv$iv$iv":Ljava/lang/Iterable;
    const/4 v8, 0x0

    .line 563
    .local v8, "$i$f$forEach":I
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_0
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_16

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    .local v10, "element$iv$iv$iv":Ljava/lang/Object;
    move-object v11, v10

    .local v11, "element$iv$iv":Ljava/lang/Object;
    const/4 v12, 0x0

    .line 562
    .local v12, "$i$a$-forEach-CollectionsKt___CollectionsKt$mapNotNullTo$1$iv$iv":I
    move-object v13, v11

    check-cast v13, Ljava/util/Map$Entry;

    const/4 v14, 0x0

    .local v14, "$i$a$-mapNotNull-McpManager$Companion$parseConfig$1":I
    invoke-interface {v13}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v15

    move-object/from16 v17, v15

    check-cast v17, Ljava/lang/String;

    .local v17, "name":Ljava/lang/String;
    invoke-interface {v13}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v13

    .line 431
    .local v13, "v":Ljava/lang/Object;
    invoke-static {v13}, Lcom/pymcl/core/util/JsonKt;->o(Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v15

    if-nez v15, :cond_1

    move-object/from16 v24, v1

    move-object/from16 v25, v2

    move/from16 v26, v3

    move-object/from16 v27, v5

    move/from16 v28, v6

    const/4 v0, 0x0

    goto/16 :goto_b

    .line 432
    .local v15, "s":Ljava/util/Map;
    :cond_1
    const-string v0, "url"

    invoke-static {v15, v0}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v18, ""

    if-nez v0, :cond_2

    move-object/from16 v0, v18

    :cond_2
    check-cast v0, Ljava/lang/CharSequence;

    invoke-static {v0}, Lkotlin/text/StringsKt;->trim(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    .line 433
    .local v0, "url":Ljava/lang/String;
    move-object/from16 v24, v1

    .end local v1    # "servers":Ljava/util/Map;
    .local v24, "servers":Ljava/util/Map;
    const-string v1, "command"

    invoke-static {v15, v1}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_3

    move-object/from16 v22, v18

    goto :goto_1

    :cond_3
    move-object/from16 v22, v1

    .line 434
    .local v22, "cmd":Ljava/lang/String;
    :goto_1
    const-string v1, "type"

    invoke-static {v15, v1}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_4

    const-string v1, "transport"

    invoke-static {v15, v1}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    :cond_4
    move-object/from16 v25, v2

    .end local v2    # "$this$mapNotNull$iv":Ljava/lang/Iterable;
    .local v25, "$this$mapNotNull$iv":Ljava/lang/Iterable;
    const-string v2, "stdio"

    move/from16 v26, v3

    .end local v3    # "$i$f$mapNotNull":I
    .local v26, "$i$f$mapNotNull":I
    const-string v3, "http"

    move-object/from16 v27, v5

    .end local v5    # "$this$mapNotNullTo$iv$iv":Ljava/lang/Iterable;
    .local v27, "$this$mapNotNullTo$iv$iv":Ljava/lang/Iterable;
    const-string v5, "sse"

    move/from16 v28, v6

    .end local v6    # "$i$f$mapNotNullTo":I
    .local v28, "$i$f$mapNotNullTo":I
    if-eqz v1, :cond_a

    const/16 v19, 0x0

    sget-object v6, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v1, v6}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v1

    const-string v6, "toLowerCase(...)"

    invoke-static {v1, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz v1, :cond_b

    .line 564
    .local v1, "it":Ljava/lang/String;
    const/4 v6, 0x0

    .line 434
    .local v6, "$i$a$-let-McpManager$Companion$parseConfig$1$type$1":I
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v20

    sparse-switch v20, :sswitch_data_0

    move/from16 v20, v6

    .end local v6    # "$i$a$-let-McpManager$Companion$parseConfig$1$type$1":I
    .local v20, "$i$a$-let-McpManager$Companion$parseConfig$1$type$1":I
    goto :goto_2

    .end local v20    # "$i$a$-let-McpManager$Companion$parseConfig$1$type$1":I
    .restart local v6    # "$i$a$-let-McpManager$Companion$parseConfig$1$type$1":I
    :sswitch_0
    move/from16 v20, v6

    .end local v6    # "$i$a$-let-McpManager$Companion$parseConfig$1$type$1":I
    .restart local v20    # "$i$a$-let-McpManager$Companion$parseConfig$1$type$1":I
    const-string v6, "streamable-http"

    invoke-virtual {v1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_7

    goto :goto_2

    .end local v20    # "$i$a$-let-McpManager$Companion$parseConfig$1$type$1":I
    .restart local v6    # "$i$a$-let-McpManager$Companion$parseConfig$1$type$1":I
    :sswitch_1
    move/from16 v20, v6

    .end local v6    # "$i$a$-let-McpManager$Companion$parseConfig$1$type$1":I
    .restart local v20    # "$i$a$-let-McpManager$Companion$parseConfig$1$type$1":I
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_5

    goto :goto_2

    :cond_5
    move-object v1, v2

    goto :goto_2

    .end local v20    # "$i$a$-let-McpManager$Companion$parseConfig$1$type$1":I
    .restart local v6    # "$i$a$-let-McpManager$Companion$parseConfig$1$type$1":I
    :sswitch_2
    move/from16 v20, v6

    .end local v6    # "$i$a$-let-McpManager$Companion$parseConfig$1$type$1":I
    .restart local v20    # "$i$a$-let-McpManager$Companion$parseConfig$1$type$1":I
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_7

    goto :goto_2

    .end local v20    # "$i$a$-let-McpManager$Companion$parseConfig$1$type$1":I
    .restart local v6    # "$i$a$-let-McpManager$Companion$parseConfig$1$type$1":I
    :sswitch_3
    move/from16 v20, v6

    .end local v6    # "$i$a$-let-McpManager$Companion$parseConfig$1$type$1":I
    .restart local v20    # "$i$a$-let-McpManager$Companion$parseConfig$1$type$1":I
    invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_6

    goto :goto_2

    :cond_6
    move-object v1, v5

    goto :goto_2

    .end local v20    # "$i$a$-let-McpManager$Companion$parseConfig$1$type$1":I
    .restart local v6    # "$i$a$-let-McpManager$Companion$parseConfig$1$type$1":I
    :sswitch_4
    move/from16 v20, v6

    .end local v6    # "$i$a$-let-McpManager$Companion$parseConfig$1$type$1":I
    .restart local v20    # "$i$a$-let-McpManager$Companion$parseConfig$1$type$1":I
    const-string v6, "streamablehttp"

    invoke-virtual {v1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_8

    :cond_7
    move-object v1, v3

    .end local v1    # "it":Ljava/lang/String;
    .end local v20    # "$i$a$-let-McpManager$Companion$parseConfig$1$type$1":I
    :cond_8
    :goto_2
    if-nez v1, :cond_9

    goto :goto_3

    :cond_9
    move-object/from16 v20, v0

    move-object v2, v1

    goto :goto_6

    :cond_a
    const/16 v19, 0x0

    .line 435
    :cond_b
    :goto_3
    move-object v1, v0

    check-cast v1, Ljava/lang/CharSequence;

    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-lez v1, :cond_c

    const/4 v1, 0x1

    goto :goto_4

    :cond_c
    move/from16 v1, v19

    :goto_4
    if-eqz v1, :cond_e

    const/4 v1, 0x1

    new-array v2, v1, [C

    const/16 v1, 0x2f

    aput-char v1, v2, v19

    invoke-static {v0, v2}, Lkotlin/text/StringsKt;->trimEnd(Ljava/lang/String;[C)Ljava/lang/String;

    move-result-object v1

    const-string v2, "/sse"

    const/4 v6, 0x2

    move-object/from16 v20, v0

    move-object/from16 v16, v3

    move/from16 v3, v19

    const/4 v0, 0x0

    .end local v0    # "url":Ljava/lang/String;
    .local v20, "url":Ljava/lang/String;
    invoke-static {v1, v2, v3, v6, v0}, Lkotlin/text/StringsKt;->endsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_d

    move-object v2, v5

    goto :goto_6

    :cond_d
    move-object/from16 v2, v16

    goto :goto_6

    .end local v20    # "url":Ljava/lang/String;
    .restart local v0    # "url":Ljava/lang/String;
    :cond_e
    move-object/from16 v20, v0

    .end local v0    # "url":Ljava/lang/String;
    .restart local v20    # "url":Ljava/lang/String;
    move-object/from16 v0, v22

    check-cast v0, Ljava/lang/CharSequence;

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-lez v0, :cond_f

    const/4 v1, 0x1

    goto :goto_5

    :cond_f
    const/4 v1, 0x0

    :goto_5
    if-eqz v1, :cond_10

    goto :goto_6

    :cond_10
    const-string v2, "unknown"

    .line 434
    :goto_6
    nop

    .line 436
    .local v2, "type":Ljava/lang/String;
    const-string v0, "headers"

    invoke-static {v15, v0}, Lcom/pymcl/core/util/JsonKt;->obj(Ljava/util/Map;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v0

    if-eqz v0, :cond_12

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    if-eqz v0, :cond_12

    check-cast v0, Ljava/lang/Iterable;

    .local v0, "$this$associate$iv":Ljava/lang/Iterable;
    const/4 v1, 0x0

    .line 565
    .local v1, "$i$f$associate":I
    const/16 v3, 0xa

    invoke-static {v0, v3}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-static {v3}, Lkotlin/collections/MapsKt;->mapCapacity(I)I

    move-result v3

    const/16 v5, 0x10

    invoke-static {v3, v5}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    move-result v3

    .line 566
    .local v3, "capacity$iv":I
    new-instance v5, Ljava/util/LinkedHashMap;

    invoke-direct {v5, v3}, Ljava/util/LinkedHashMap;-><init>(I)V

    check-cast v5, Ljava/util/Map;

    .local v5, "destination$iv$iv":Ljava/util/Map;
    move-object v6, v0

    .local v6, "$this$associateTo$iv$iv":Ljava/lang/Iterable;
    const/16 v16, 0x0

    .line 567
    .local v16, "$i$f$associateTo":I
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v21

    :goto_7
    invoke-interface/range {v21 .. v21}, Ljava/util/Iterator;->hasNext()Z

    move-result v23

    if-eqz v23, :cond_11

    invoke-interface/range {v21 .. v21}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v23

    .line 568
    .local v23, "element$iv$iv":Ljava/lang/Object;
    move-object/from16 v29, v23

    check-cast v29, Ljava/util/Map$Entry;

    const/16 v30, 0x0

    .local v30, "$i$a$-associate-McpManager$Companion$parseConfig$1$1":I
    invoke-interface/range {v29 .. v29}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v31

    move-object/from16 v32, v0

    .end local v0    # "$this$associate$iv":Ljava/lang/Iterable;
    .local v32, "$this$associate$iv":Ljava/lang/Iterable;
    move-object/from16 v0, v31

    check-cast v0, Ljava/lang/String;

    .local v0, "k":Ljava/lang/String;
    invoke-interface/range {v29 .. v29}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v29

    .line 436
    .local v29, "x":Ljava/lang/Object;
    move/from16 v31, v1

    .end local v1    # "$i$f$associate":I
    .local v31, "$i$f$associate":I
    invoke-static/range {v29 .. v29}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    .line 568
    .end local v0    # "k":Ljava/lang/String;
    .end local v29    # "x":Ljava/lang/Object;
    .end local v30    # "$i$a$-associate-McpManager$Companion$parseConfig$1$1":I
    invoke-virtual {v0}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object v0

    invoke-interface {v5, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move/from16 v1, v31

    move-object/from16 v0, v32

    goto :goto_7

    .line 570
    .end local v23    # "element$iv$iv":Ljava/lang/Object;
    .end local v31    # "$i$f$associate":I
    .end local v32    # "$this$associate$iv":Ljava/lang/Iterable;
    .local v0, "$this$associate$iv":Ljava/lang/Iterable;
    .restart local v1    # "$i$f$associate":I
    :cond_11
    move-object/from16 v32, v0

    move/from16 v31, v1

    .line 566
    .end local v0    # "$this$associate$iv":Ljava/lang/Iterable;
    .end local v1    # "$i$f$associate":I
    .end local v5    # "destination$iv$iv":Ljava/util/Map;
    .end local v6    # "$this$associateTo$iv$iv":Ljava/lang/Iterable;
    .end local v16    # "$i$f$associateTo":I
    .restart local v31    # "$i$f$associate":I
    .restart local v32    # "$this$associate$iv":Ljava/lang/Iterable;
    nop

    .line 436
    .end local v3    # "capacity$iv":I
    .end local v31    # "$i$f$associate":I
    .end local v32    # "$this$associate$iv":Ljava/lang/Iterable;
    goto :goto_8

    :cond_12
    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    move-result-object v5

    .line 437
    :goto_8
    const-string v0, "enabled"

    invoke-static {v15, v0}, Lcom/pymcl/core/util/JsonKt;->bool(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v0

    const/16 v19, 0x0

    invoke-static/range {v19 .. v19}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_13

    const-string v0, "disabled"

    invoke-static {v15, v0}, Lcom/pymcl/core/util/JsonKt;->bool(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v0

    const/16 v18, 0x1

    invoke-static/range {v18 .. v18}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_13

    move/from16 v21, v18

    goto :goto_9

    :cond_13
    move/from16 v21, v19

    :goto_9
    const-string v0, "timeout"

    invoke-static {v15, v0}, Lcom/pymcl/core/util/JsonKt;->int(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_14

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    goto :goto_a

    :cond_14
    const/16 v0, 0x3c

    :goto_a
    mul-int/lit16 v0, v0, 0x3e8

    const/16 v1, 0x1388

    const v3, 0x927c0

    invoke-static {v0, v1, v3}, Lkotlin/ranges/RangesKt;->coerceIn(III)I

    move-result v23

    .line 436
    new-instance v16, Lcom/pymcl/ai/McpServerConfig;

    move-object/from16 v18, v2

    move-object/from16 v19, v20

    move-object/from16 v20, v5

    .end local v2    # "type":Ljava/lang/String;
    .end local v20    # "url":Ljava/lang/String;
    .local v18, "type":Ljava/lang/String;
    .local v19, "url":Ljava/lang/String;
    invoke-direct/range {v16 .. v23}, Lcom/pymcl/ai/McpServerConfig;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/lang/String;I)V

    .line 437
    .end local v15    # "s":Ljava/util/Map;
    .end local v18    # "type":Ljava/lang/String;
    .end local v19    # "url":Ljava/lang/String;
    .end local v22    # "cmd":Ljava/lang/String;
    move-object/from16 v0, v16

    .line 562
    .end local v13    # "v":Ljava/lang/Object;
    .end local v14    # "$i$a$-mapNotNull-McpManager$Companion$parseConfig$1":I
    .end local v17    # "name":Ljava/lang/String;
    :goto_b
    if-eqz v0, :cond_15

    .line 571
    .local v0, "it$iv$iv":Ljava/lang/Object;
    const/4 v1, 0x0

    .line 562
    .local v1, "$i$a$-let-CollectionsKt___CollectionsKt$mapNotNullTo$1$1$iv$iv":I
    invoke-interface {v4, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 563
    .end local v0    # "it$iv$iv":Ljava/lang/Object;
    .end local v1    # "$i$a$-let-CollectionsKt___CollectionsKt$mapNotNullTo$1$1$iv$iv":I
    .end local v11    # "element$iv$iv":Ljava/lang/Object;
    .end local v12    # "$i$a$-forEach-CollectionsKt___CollectionsKt$mapNotNullTo$1$iv$iv":I
    :cond_15
    move-object/from16 v0, p1

    move-object/from16 v1, v24

    move-object/from16 v2, v25

    move/from16 v3, v26

    move-object/from16 v5, v27

    move/from16 v6, v28

    .end local v10    # "element$iv$iv$iv":Ljava/lang/Object;
    goto/16 :goto_0

    .line 572
    .end local v24    # "servers":Ljava/util/Map;
    .end local v25    # "$this$mapNotNull$iv":Ljava/lang/Iterable;
    .end local v26    # "$i$f$mapNotNull":I
    .end local v27    # "$this$mapNotNullTo$iv$iv":Ljava/lang/Iterable;
    .end local v28    # "$i$f$mapNotNullTo":I
    .local v1, "servers":Ljava/util/Map;
    .local v2, "$this$mapNotNull$iv":Ljava/lang/Iterable;
    .local v3, "$i$f$mapNotNull":I
    .local v5, "$this$mapNotNullTo$iv$iv":Ljava/lang/Iterable;
    .local v6, "$i$f$mapNotNullTo":I
    :cond_16
    nop

    .line 573
    .end local v7    # "$this$forEach$iv$iv$iv":Ljava/lang/Iterable;
    .end local v8    # "$i$f$forEach":I
    nop

    .end local v4    # "destination$iv$iv":Ljava/util/Collection;
    .end local v5    # "$this$mapNotNullTo$iv$iv":Ljava/lang/Iterable;
    .end local v6    # "$i$f$mapNotNullTo":I
    move-object v0, v4

    check-cast v0, Ljava/util/List;

    .line 553
    nop

    .line 430
    .end local v2    # "$this$mapNotNull$iv":Ljava/lang/Iterable;
    .end local v3    # "$i$f$mapNotNull":I
    return-object v0

    :sswitch_data_0
    .sparse-switch
        -0x3f31cf9e -> :sswitch_4
        0x1be05 -> :sswitch_3
        0x310888 -> :sswitch_2
        0x68ace89 -> :sswitch_1
        0x55b2fd9b -> :sswitch_0
    .end sparse-switch
.end method
