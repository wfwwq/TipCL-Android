.class public final Lcom/pymcl/core/mods/FabricPredicate;
.super Ljava/lang/Object;
.source "ModConflicts.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nModConflicts.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModConflicts.kt\ncom/pymcl/core/mods/FabricPredicate\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,327:1\n1960#2,3:328\n1939#2,3:331\n296#2,2:334\n1939#2,2:336\n1941#2:339\n1#3:338\n*S KotlinDebug\n*F\n+ 1 ModConflicts.kt\ncom/pymcl/core/mods/FabricPredicate\n*L\n90#1:328,3\n97#1:331,3\n100#1:334,2\n117#1:336,2\n117#1:339\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0008\n\u0002\u0010\u0008\n\u0000\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0007\u001a\u00020\u0008J\u0016\u0010\t\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0008J\u0018\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u00082\u0006\u0010\u000c\u001a\u00020\u0008H\u0002J \u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00082\u0006\u0010\u000f\u001a\u00020\u00082\u0006\u0010\u0010\u001a\u00020\u0011H\u0002\u00a8\u0006\u0012"
    }
    d2 = {
        "Lcom/pymcl/core/mods/FabricPredicate;",
        "",
        "<init>",
        "()V",
        "matches",
        "",
        "spec",
        "version",
        "",
        "matchesOne",
        "single",
        "p",
        "v",
        "sameParts",
        "a",
        "b",
        "n",
        "",
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
.field public static final INSTANCE:Lcom/pymcl/core/mods/FabricPredicate;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/pymcl/core/mods/FabricPredicate;

    invoke-direct {v0}, Lcom/pymcl/core/mods/FabricPredicate;-><init>()V

    sput-object v0, Lcom/pymcl/core/mods/FabricPredicate;->INSTANCE:Lcom/pymcl/core/mods/FabricPredicate;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 86
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final sameParts(Ljava/lang/String;Ljava/lang/String;I)Z
    .locals 20
    .param p1, "a"    # Ljava/lang/String;
    .param p2, "b"    # Ljava/lang/String;
    .param p3, "n"    # I

    .line 116
    const/16 v0, 0x2b

    const/4 v1, 0x0

    const/4 v2, 0x2

    move-object/from16 v3, p1

    invoke-static {v3, v0, v1, v2, v1}, Lkotlin/text/StringsKt;->substringBefore$default(Ljava/lang/String;CLjava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    const/16 v5, 0x2d

    invoke-static {v4, v5, v1, v2, v1}, Lkotlin/text/StringsKt;->substringBefore$default(Ljava/lang/String;CLjava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    move-object v6, v4

    check-cast v6, Ljava/lang/CharSequence;

    const/4 v4, 0x1

    new-array v7, v4, [C

    const/4 v12, 0x0

    const/16 v13, 0x2e

    aput-char v13, v7, v12

    const/4 v10, 0x6

    const/4 v11, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-static/range {v6 .. v11}, Lkotlin/text/StringsKt;->split$default(Ljava/lang/CharSequence;[CZIILjava/lang/Object;)Ljava/util/List;

    move-result-object v6

    move-object/from16 v7, p2

    .local v6, "x":Ljava/util/List;
    invoke-static {v7, v0, v1, v2, v1}, Lkotlin/text/StringsKt;->substringBefore$default(Ljava/lang/String;CLjava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v5, v1, v2, v1}, Lkotlin/text/StringsKt;->substringBefore$default(Ljava/lang/String;CLjava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    move-object v14, v0

    check-cast v14, Ljava/lang/CharSequence;

    new-array v15, v4, [C

    aput-char v13, v15, v12

    const/16 v18, 0x6

    const/16 v19, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    invoke-static/range {v14 .. v19}, Lkotlin/text/StringsKt;->split$default(Ljava/lang/CharSequence;[CZIILjava/lang/Object;)Ljava/util/List;

    move-result-object v0

    .line 117
    .local v0, "y":Ljava/util/List;
    move/from16 v1, p3

    invoke-static {v12, v1}, Lkotlin/ranges/RangesKt;->until(II)Lkotlin/ranges/IntRange;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    .local v2, "$this$all$iv":Ljava/lang/Iterable;
    const/4 v5, 0x0

    .line 336
    .local v5, "$i$f$all":I
    instance-of v8, v2, Ljava/util/Collection;

    if-eqz v8, :cond_0

    move-object v8, v2

    check-cast v8, Ljava/util/Collection;

    invoke-interface {v8}, Ljava/util/Collection;->isEmpty()Z

    move-result v8

    if-eqz v8, :cond_0

    goto :goto_4

    .line 337
    :cond_0
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :cond_1
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_6

    move-object v9, v8

    check-cast v9, Lkotlin/collections/IntIterator;

    invoke-virtual {v9}, Lkotlin/collections/IntIterator;->nextInt()I

    move-result v9

    .local v9, "element$iv":I
    move v10, v9

    .local v10, "it":I
    const/4 v11, 0x0

    .line 117
    .local v11, "$i$a$-all-FabricPredicate$sameParts$1":I
    if-ltz v10, :cond_2

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v13

    if-ge v10, v13, :cond_2

    move v13, v4

    goto :goto_0

    :cond_2
    move v13, v12

    :goto_0
    const-string v14, "0"

    if-eqz v13, :cond_3

    invoke-interface {v6, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v13

    goto :goto_1

    :cond_3
    move v13, v10

    .line 338
    .local v13, "it":I
    const/4 v15, 0x0

    .line 117
    .local v15, "$i$a$-getOrElse-FabricPredicate$sameParts$1$1":I
    move-object v13, v14

    .end local v13    # "it":I
    .end local v15    # "$i$a$-getOrElse-FabricPredicate$sameParts$1$1":I
    :goto_1
    if-ltz v10, :cond_4

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v15

    if-ge v10, v15, :cond_4

    move v15, v4

    goto :goto_2

    :cond_4
    move v15, v12

    :goto_2
    if-eqz v15, :cond_5

    invoke-interface {v0, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v14

    goto :goto_3

    .line 338
    :cond_5
    move v15, v10

    .local v15, "it":I
    const/16 v16, 0x0

    .line 117
    .local v16, "$i$a$-getOrElse-FabricPredicate$sameParts$1$2":I
    nop

    .end local v15    # "it":I
    .end local v16    # "$i$a$-getOrElse-FabricPredicate$sameParts$1$2":I
    :goto_3
    invoke-static {v13, v14}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    .line 337
    .end local v10    # "it":I
    .end local v11    # "$i$a$-all-FabricPredicate$sameParts$1":I
    if-nez v10, :cond_1

    move v4, v12

    goto :goto_4

    .line 339
    .end local v9    # "element$iv":I
    :cond_6
    nop

    .line 117
    .end local v2    # "$this$all$iv":Ljava/lang/Iterable;
    .end local v5    # "$i$f$all":I
    :goto_4
    return v4
.end method

.method private final single(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 19
    .param p1, "p"    # Ljava/lang/String;
    .param p2, "v"    # Ljava/lang/String;

    .line 100
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    const/4 v3, 0x7

    new-array v3, v3, [Ljava/lang/String;

    const/4 v4, 0x0

    const-string v5, ">="

    aput-object v5, v3, v4

    const/4 v6, 0x1

    const-string v7, "<="

    aput-object v7, v3, v6

    const/4 v8, 0x2

    const-string v9, ">"

    aput-object v9, v3, v8

    const/4 v10, 0x3

    const-string v11, "<"

    aput-object v11, v3, v10

    const/4 v10, 0x4

    const-string v12, "="

    aput-object v12, v3, v10

    const/4 v10, 0x5

    const-string v12, "~"

    aput-object v12, v3, v10

    const/4 v10, 0x6

    const-string v13, "^"

    aput-object v13, v3, v10

    invoke-static {v3}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    .local v3, "$this$firstOrNull$iv":Ljava/lang/Iterable;
    const/4 v10, 0x0

    .line 334
    .local v10, "$i$f$firstOrNull":I
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v14

    :goto_0
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    move-result v15

    const/4 v6, 0x0

    if-eqz v15, :cond_1

    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v15

    .local v15, "element$iv":Ljava/lang/Object;
    move-object v4, v15

    check-cast v4, Ljava/lang/String;

    .local v4, "it":Ljava/lang/String;
    const/16 v17, 0x0

    .line 100
    .local v17, "$i$a$-firstOrNull-FabricPredicate$single$op$1":I
    move-object/from16 v18, v3

    const/4 v3, 0x0

    .end local v3    # "$this$firstOrNull$iv":Ljava/lang/Iterable;
    .local v18, "$this$firstOrNull$iv":Ljava/lang/Iterable;
    invoke-static {v1, v4, v3, v8, v6}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v4

    .line 334
    .end local v4    # "it":Ljava/lang/String;
    .end local v17    # "$i$a$-firstOrNull-FabricPredicate$single$op$1":I
    if-eqz v4, :cond_0

    goto :goto_1

    :cond_0
    move-object/from16 v3, v18

    const/4 v4, 0x0

    const/4 v6, 0x1

    goto :goto_0

    .line 335
    .end local v15    # "element$iv":Ljava/lang/Object;
    .end local v18    # "$this$firstOrNull$iv":Ljava/lang/Iterable;
    .restart local v3    # "$this$firstOrNull$iv":Ljava/lang/Iterable;
    :cond_1
    move-object/from16 v18, v3

    .end local v3    # "$this$firstOrNull$iv":Ljava/lang/Iterable;
    .restart local v18    # "$this$firstOrNull$iv":Ljava/lang/Iterable;
    move-object v15, v6

    .line 100
    .end local v10    # "$i$f$firstOrNull":I
    .end local v18    # "$this$firstOrNull$iv":Ljava/lang/Iterable;
    :goto_1
    check-cast v15, Ljava/lang/String;

    if-nez v15, :cond_2

    const-string v15, ""

    .line 101
    .local v15, "op":Ljava/lang/String;
    :cond_2
    move-object v3, v15

    check-cast v3, Ljava/lang/CharSequence;

    invoke-static {v1, v3}, Lkotlin/text/StringsKt;->removePrefix(Ljava/lang/String;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v3

    check-cast v3, Ljava/lang/CharSequence;

    invoke-static {v3}, Lkotlin/text/StringsKt;->trim(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    .line 102
    .local v3, "target":Ljava/lang/String;
    move-object v4, v3

    check-cast v4, Ljava/lang/CharSequence;

    invoke-interface {v4}, Ljava/lang/CharSequence;->length()I

    move-result v4

    if-nez v4, :cond_3

    const/4 v4, 0x1

    goto :goto_2

    :cond_3
    const/4 v4, 0x0

    :goto_2
    if-nez v4, :cond_13

    const-string v4, "*"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_4

    goto/16 :goto_a

    .line 103
    :cond_4
    const-string v4, ".x"

    const/4 v10, 0x0

    invoke-static {v3, v4, v10, v8, v6}, Lkotlin/text/StringsKt;->endsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_10

    const-string v4, ".X"

    invoke-static {v3, v4, v10, v8, v6}, Lkotlin/text/StringsKt;->endsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_10

    const-string v4, ".*"

    invoke-static {v3, v4, v10, v8, v6}, Lkotlin/text/StringsKt;->endsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_5

    goto/16 :goto_7

    .line 107
    :cond_5
    sget-object v4, Lcom/pymcl/core/mods/ModVersion;->INSTANCE:Lcom/pymcl/core/mods/ModVersion;

    invoke-virtual {v4, v2, v3}, Lcom/pymcl/core/mods/ModVersion;->compare(Ljava/lang/String;Ljava/lang/String;)I

    move-result v4

    .line 108
    .local v4, "c":I
    invoke-virtual {v15}, Ljava/lang/String;->hashCode()I

    move-result v6

    sparse-switch v6, :sswitch_data_0

    :cond_6
    :goto_3
    goto/16 :goto_5

    :sswitch_0
    invoke-virtual {v15, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_6

    .line 109
    if-ltz v4, :cond_e

    goto :goto_4

    .line 108
    :sswitch_1
    invoke-virtual {v15, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_7

    goto :goto_3

    .line 109
    :cond_7
    if-gtz v4, :cond_e

    goto :goto_4

    .line 108
    :sswitch_2
    invoke-virtual {v15, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_8

    goto :goto_3

    .line 110
    :cond_8
    if-ltz v4, :cond_9

    invoke-direct {v0, v2, v3, v8}, Lcom/pymcl/core/mods/FabricPredicate;->sameParts(Ljava/lang/String;Ljava/lang/String;I)Z

    move-result v5

    if-eqz v5, :cond_9

    const/16 v16, 0x1

    goto :goto_6

    :cond_9
    const/16 v16, 0x0

    goto :goto_6

    .line 108
    :sswitch_3
    invoke-virtual {v15, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_a

    goto :goto_3

    .line 111
    :cond_a
    if-ltz v4, :cond_b

    const/4 v5, 0x1

    invoke-direct {v0, v2, v3, v5}, Lcom/pymcl/core/mods/FabricPredicate;->sameParts(Ljava/lang/String;Ljava/lang/String;I)Z

    move-result v6

    if-eqz v6, :cond_b

    const/16 v16, 0x1

    goto :goto_6

    :cond_b
    const/16 v16, 0x0

    goto :goto_6

    .line 108
    :sswitch_4
    invoke-virtual {v15, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_c

    goto :goto_3

    .line 109
    :cond_c
    if-lez v4, :cond_e

    goto :goto_4

    .line 108
    :sswitch_5
    invoke-virtual {v15, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_d

    goto :goto_3

    .line 109
    :cond_d
    if-gez v4, :cond_e

    :goto_4
    const/16 v16, 0x1

    goto :goto_6

    :cond_e
    const/16 v16, 0x0

    goto :goto_6

    .line 112
    :goto_5
    if-nez v4, :cond_f

    const/16 v16, 0x1

    goto :goto_6

    :cond_f
    const/16 v16, 0x0

    .line 108
    :goto_6
    return v16

    .line 104
    .end local v4    # "c":I
    :cond_10
    :goto_7
    invoke-static {v3, v8}, Lkotlin/text/StringsKt;->dropLast(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v4

    .line 105
    .local v4, "prefix":Ljava/lang/String;
    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_12

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    const-string v7, "."

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    const/4 v10, 0x0

    invoke-static {v2, v5, v10, v8, v6}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_12

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    const-string v7, "-"

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v2, v5, v10, v8, v6}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_12

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    const-string v7, "+"

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v2, v5, v10, v8, v6}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_11

    goto :goto_8

    :cond_11
    move/from16 v16, v10

    goto :goto_9

    :cond_12
    :goto_8
    const/16 v16, 0x1

    :goto_9
    return v16

    .line 102
    .end local v4    # "prefix":Ljava/lang/String;
    :cond_13
    :goto_a
    const/16 v16, 0x1

    return v16

    nop

    :sswitch_data_0
    .sparse-switch
        0x3c -> :sswitch_5
        0x3e -> :sswitch_4
        0x5e -> :sswitch_3
        0x7e -> :sswitch_2
        0x781 -> :sswitch_1
        0x7bf -> :sswitch_0
    .end sparse-switch
.end method


# virtual methods
.method public final matches(Ljava/lang/Object;Ljava/lang/String;)Z
    .locals 10
    .param p1, "spec"    # Ljava/lang/Object;
    .param p2, "version"    # Ljava/lang/String;

    const-string v0, "version"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 87
    nop

    .line 88
    const/4 v0, 0x1

    if-nez p1, :cond_0

    goto :goto_1

    .line 89
    :cond_0
    instance-of v1, p1, Ljava/lang/String;

    if-eqz v1, :cond_1

    move-object v0, p1

    check-cast v0, Ljava/lang/String;

    invoke-virtual {p0, v0, p2}, Lcom/pymcl/core/mods/FabricPredicate;->matchesOne(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    goto :goto_1

    .line 90
    :cond_1
    instance-of v1, p1, Ljava/util/List;

    if-eqz v1, :cond_8

    move-object v1, p1

    check-cast v1, Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_9

    move-object v1, p1

    check-cast v1, Ljava/lang/Iterable;

    .local v1, "$this$any$iv":Ljava/lang/Iterable;
    const/4 v2, 0x0

    .line 328
    .local v2, "$i$f$any":I
    instance-of v3, v1, Ljava/util/Collection;

    const/4 v4, 0x0

    if-eqz v3, :cond_2

    move-object v3, v1

    check-cast v3, Ljava/util/Collection;

    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_2

    move v1, v4

    goto :goto_0

    .line 329
    :cond_2
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_3
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_6

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    .local v5, "element$iv":Ljava/lang/Object;
    move-object v6, v5

    .local v6, "it":Ljava/lang/Object;
    const/4 v7, 0x0

    .line 90
    .local v7, "$i$a$-any-FabricPredicate$matches$1":I
    sget-object v8, Lcom/pymcl/core/mods/FabricPredicate;->INSTANCE:Lcom/pymcl/core/mods/FabricPredicate;

    if-eqz v6, :cond_4

    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v9

    if-nez v9, :cond_5

    :cond_4
    const-string v9, "*"

    :cond_5
    invoke-virtual {v8, v9, p2}, Lcom/pymcl/core/mods/FabricPredicate;->matchesOne(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v6

    .line 329
    .end local v6    # "it":Ljava/lang/Object;
    .end local v7    # "$i$a$-any-FabricPredicate$matches$1":I
    if-eqz v6, :cond_3

    move v1, v0

    goto :goto_0

    .line 330
    .end local v5    # "element$iv":Ljava/lang/Object;
    :cond_6
    move v1, v4

    .line 90
    .end local v1    # "$this$any$iv":Ljava/lang/Iterable;
    .end local v2    # "$i$f$any":I
    :goto_0
    if-eqz v1, :cond_7

    goto :goto_1

    :cond_7
    move v0, v4

    goto :goto_1

    .line 91
    :cond_8
    nop

    .line 92
    :cond_9
    :goto_1
    return v0
.end method

.method public final matchesOne(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 10
    .param p1, "spec"    # Ljava/lang/String;
    .param p2, "version"    # Ljava/lang/String;

    const-string v0, "spec"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "version"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 95
    move-object v0, p1

    check-cast v0, Ljava/lang/CharSequence;

    invoke-static {v0}, Lkotlin/text/StringsKt;->trim(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    .line 96
    .local v0, "s":Ljava/lang/String;
    move-object v1, v0

    check-cast v1, Ljava/lang/CharSequence;

    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-nez v1, :cond_0

    move v1, v3

    goto :goto_0

    :cond_0
    move v1, v2

    :goto_0
    if-nez v1, :cond_5

    const-string v1, "*"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    move-object v1, p2

    check-cast v1, Ljava/lang/CharSequence;

    invoke-static {v1}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_2

    .line 97
    :cond_1
    move-object v1, v0

    check-cast v1, Ljava/lang/CharSequence;

    new-instance v4, Lkotlin/text/Regex;

    const-string v5, "\\s+"

    invoke-direct {v4, v5}, Lkotlin/text/Regex;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v1, v2}, Lkotlin/text/Regex;->split(Ljava/lang/CharSequence;I)Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    .local v1, "$this$all$iv":Ljava/lang/Iterable;
    const/4 v4, 0x0

    .line 331
    .local v4, "$i$f$all":I
    instance-of v5, v1, Ljava/util/Collection;

    if-eqz v5, :cond_2

    move-object v5, v1

    check-cast v5, Ljava/util/Collection;

    invoke-interface {v5}, Ljava/util/Collection;->isEmpty()Z

    move-result v5

    if-eqz v5, :cond_2

    move v2, v3

    goto :goto_1

    .line 332
    :cond_2
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_3
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_4

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    .local v6, "element$iv":Ljava/lang/Object;
    move-object v7, v6

    check-cast v7, Ljava/lang/String;

    .local v7, "it":Ljava/lang/String;
    const/4 v8, 0x0

    .line 97
    .local v8, "$i$a$-all-FabricPredicate$matchesOne$1":I
    sget-object v9, Lcom/pymcl/core/mods/FabricPredicate;->INSTANCE:Lcom/pymcl/core/mods/FabricPredicate;

    invoke-direct {v9, v7, p2}, Lcom/pymcl/core/mods/FabricPredicate;->single(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v7

    .line 332
    .end local v7    # "it":Ljava/lang/String;
    .end local v8    # "$i$a$-all-FabricPredicate$matchesOne$1":I
    if-nez v7, :cond_3

    goto :goto_1

    .line 333
    .end local v6    # "element$iv":Ljava/lang/Object;
    :cond_4
    move v2, v3

    .line 97
    .end local v1    # "$this$all$iv":Ljava/lang/Iterable;
    .end local v4    # "$i$f$all":I
    :goto_1
    return v2

    .line 96
    :cond_5
    :goto_2
    return v3
.end method
