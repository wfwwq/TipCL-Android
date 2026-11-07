.class public final Lcom/pymcl/core/mods/ModsToml;
.super Ljava/lang/Object;
.source "ModConflicts.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nModConflicts.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModConflicts.kt\ncom/pymcl/core/mods/ModsToml\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,327:1\n777#2:328\n873#2,2:329\n1795#2,10:338\n2068#2:348\n2069#2:351\n1805#2:352\n460#3,7:331\n1#4:349\n1#4:350\n*S KotlinDebug\n*F\n+ 1 ModConflicts.kt\ncom/pymcl/core/mods/ModsToml\n*L\n227#1:328\n227#1:329,2\n238#1:338,10\n238#1:348\n238#1:351\n238#1:352\n236#1:331,7\n238#1:350\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0005\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J:\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\u00082\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\n\u001a\u00020\u00082\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00082\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u0008\u00a8\u0006\r"
    }
    d2 = {
        "Lcom/pymcl/core/mods/ModsToml;",
        "",
        "<init>",
        "()V",
        "parse",
        "",
        "Lcom/pymcl/core/mods/ModMeta;",
        "text",
        "",
        "loader",
        "file",
        "nestedIn",
        "manifestVersion",
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
.field public static final INSTANCE:Lcom/pymcl/core/mods/ModsToml;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/pymcl/core/mods/ModsToml;

    invoke-direct {v0}, Lcom/pymcl/core/mods/ModsToml;-><init>()V

    sput-object v0, Lcom/pymcl/core/mods/ModsToml;->INSTANCE:Lcom/pymcl/core/mods/ModsToml;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 204
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic parse$default(Lcom/pymcl/core/mods/ModsToml;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/util/List;
    .locals 6

    .line 205
    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_0

    const/4 p4, 0x0

    :cond_0
    move-object v4, p4

    and-int/lit8 p4, p6, 0x10

    if-eqz p4, :cond_1

    const-string p5, ""

    :cond_1
    move-object v5, p5

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    invoke-virtual/range {v0 .. v5}, Lcom/pymcl/core/mods/ModsToml;->parse(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final parse(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;
    .locals 36
    .param p1, "text"    # Ljava/lang/String;
    .param p2, "loader"    # Ljava/lang/String;
    .param p3, "file"    # Ljava/lang/String;
    .param p4, "nestedIn"    # Ljava/lang/String;
    .param p5, "manifestVersion"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Lcom/pymcl/core/mods/ModMeta;",
            ">;"
        }
    .end annotation

    move-object/from16 v0, p1

    const-string v1, "text"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "loader"

    move-object/from16 v6, p2

    invoke-static {v6, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "file"

    move-object/from16 v7, p3

    invoke-static {v7, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "manifestVersion"

    move-object/from16 v13, p5

    invoke-static {v13, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 207
    const/4 v1, 0x1

    new-array v2, v1, [Lcom/pymcl/core/mods/ModsToml$parse$Block;

    new-instance v3, Lcom/pymcl/core/mods/ModsToml$parse$Block;

    const-string v14, ""

    const/4 v15, 0x0

    const/4 v4, 0x2

    invoke-direct {v3, v14, v15, v4, v15}, Lcom/pymcl/core/mods/ModsToml$parse$Block;-><init>(Ljava/lang/String;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v5, 0x0

    aput-object v3, v2, v5

    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->mutableListOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v16

    .line 208
    .local v16, "blocks":Ljava/util/List;
    move-object v2, v0

    check-cast v2, Ljava/lang/CharSequence;

    invoke-static {v2}, Lkotlin/text/StringsKt;->lines(Ljava/lang/CharSequence;)Ljava/util/List;

    move-result-object v2

    .local v2, "lines":Ljava/util/List;
    const/4 v3, 0x0

    .line 209
    .local v3, "i":I
    :goto_0
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v8

    if-ge v3, v8, :cond_b

    .line 210
    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/String;

    check-cast v8, Ljava/lang/CharSequence;

    invoke-static {v8}, Lkotlin/text/StringsKt;->trim(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v8

    .local v8, "line":Ljava/lang/String;
    add-int/lit8 v3, v3, 0x1

    .line 211
    move-object v10, v8

    check-cast v10, Ljava/lang/CharSequence;

    invoke-interface {v10}, Ljava/lang/CharSequence;->length()I

    move-result v10

    if-nez v10, :cond_0

    move v10, v1

    goto :goto_1

    :cond_0
    move v10, v5

    :goto_1
    if-nez v10, :cond_a

    const-string v10, "#"

    invoke-static {v8, v10, v5, v4, v15}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_1

    goto/16 :goto_5

    .line 212
    :cond_1
    const-string v10, "["

    invoke-static {v8, v10, v5, v4, v15}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v10

    const/16 v11, 0x23

    if-eqz v10, :cond_2

    move-object/from16 v9, v16

    check-cast v9, Ljava/util/Collection;

    new-instance v10, Lcom/pymcl/core/mods/ModsToml$parse$Block;

    invoke-static {v8, v11, v15, v4, v15}, Lkotlin/text/StringsKt;->substringBefore$default(Ljava/lang/String;CLjava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v11

    check-cast v11, Ljava/lang/CharSequence;

    invoke-static {v11}, Lkotlin/text/StringsKt;->trim(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v11

    invoke-virtual {v11}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v11

    new-array v12, v4, [C

    fill-array-data v12, :array_0

    invoke-static {v11, v12}, Lkotlin/text/StringsKt;->trim(Ljava/lang/String;[C)Ljava/lang/String;

    move-result-object v11

    check-cast v11, Ljava/lang/CharSequence;

    invoke-static {v11}, Lkotlin/text/StringsKt;->trim(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v11

    invoke-virtual {v11}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v11

    invoke-direct {v10, v11, v15, v4, v15}, Lcom/pymcl/core/mods/ModsToml$parse$Block;-><init>(Ljava/lang/String;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v9, v10}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto/16 :goto_5

    .line 213
    :cond_2
    move-object/from16 v17, v8

    check-cast v17, Ljava/lang/CharSequence;

    const/16 v21, 0x6

    const/16 v22, 0x0

    const/16 v18, 0x3d

    const/16 v19, 0x0

    const/16 v20, 0x0

    invoke-static/range {v17 .. v22}, Lkotlin/text/StringsKt;->indexOf$default(Ljava/lang/CharSequence;CIZILjava/lang/Object;)I

    move-result v10

    .local v10, "eq":I
    if-lez v10, :cond_a

    .line 214
    invoke-virtual {v8, v5, v10}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v12

    const-string v11, "substring(...)"

    invoke-static {v12, v11}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v12, Ljava/lang/CharSequence;

    invoke-static {v12}, Lkotlin/text/StringsKt;->trim(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v12

    invoke-virtual {v12}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v12

    const/16 v18, 0x22

    new-array v9, v1, [C

    aput-char v18, v9, v5

    invoke-static {v12, v9}, Lkotlin/text/StringsKt;->trim(Ljava/lang/String;[C)Ljava/lang/String;

    move-result-object v9

    .line 215
    .local v9, "key":Ljava/lang/String;
    add-int/lit8 v12, v10, 0x1

    invoke-virtual {v8, v12}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v12

    invoke-static {v12, v11}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v12, Ljava/lang/CharSequence;

    invoke-static {v12}, Lkotlin/text/StringsKt;->trim(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v12

    invoke-virtual {v12}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v12

    .line 216
    .local v12, "v":Ljava/lang/String;
    const-string v1, "\'\'\'"

    invoke-static {v12, v1, v5, v4, v15}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    const-string v1, "\"\"\""

    invoke-static {v12, v1, v5, v4, v15}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    goto :goto_3

    .line 220
    :cond_3
    nop

    .line 221
    const-string v1, "\""

    invoke-static {v12, v1, v5, v4, v15}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    const/4 v1, 0x1

    invoke-virtual {v12, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, v11}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    move/from16 v11, v18

    invoke-static {v5, v11, v15, v4, v15}, Lkotlin/text/StringsKt;->substringBefore$default(Ljava/lang/String;CLjava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    goto :goto_2

    .line 222
    :cond_4
    const/4 v1, 0x1

    const-string v5, "\'"

    const/4 v1, 0x0

    invoke-static {v12, v5, v1, v4, v15}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_5

    const/4 v1, 0x1

    invoke-virtual {v12, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, v11}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v1, 0x27

    invoke-static {v5, v1, v15, v4, v15}, Lkotlin/text/StringsKt;->substringBefore$default(Ljava/lang/String;CLjava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    goto :goto_2

    .line 223
    :cond_5
    const/16 v1, 0x23

    invoke-static {v12, v1, v15, v4, v15}, Lkotlin/text/StringsKt;->substringBefore$default(Ljava/lang/String;CLjava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    check-cast v1, Ljava/lang/CharSequence;

    invoke-static {v1}, Lkotlin/text/StringsKt;->trim(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v5

    .line 220
    :goto_2
    nop

    .line 225
    .end local v12    # "v":Ljava/lang/String;
    .local v5, "v":Ljava/lang/String;
    invoke-static/range {v16 .. v16}, Lkotlin/collections/CollectionsKt;->last(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/pymcl/core/mods/ModsToml$parse$Block;

    invoke-virtual {v1}, Lcom/pymcl/core/mods/ModsToml$parse$Block;->getKv()Ljava/util/Map;

    move-result-object v1

    invoke-interface {v1, v9, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_5

    .line 217
    .end local v5    # "v":Ljava/lang/String;
    .restart local v12    # "v":Ljava/lang/String;
    :cond_6
    :goto_3
    const/4 v1, 0x3

    invoke-static {v12, v1}, Lkotlin/text/StringsKt;->take(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v5

    .local v5, "q":Ljava/lang/String;
    invoke-virtual {v12}, Ljava/lang/String;->length()I

    move-result v4

    const/4 v15, 0x6

    if-lt v4, v15, :cond_7

    invoke-virtual {v12, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v11}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Ljava/lang/CharSequence;

    move-object v4, v5

    check-cast v4, Ljava/lang/CharSequence;

    const/4 v0, 0x2

    const/4 v11, 0x0

    const/4 v15, 0x0

    invoke-static {v1, v4, v11, v0, v15}, Lkotlin/text/StringsKt;->contains$default(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    :cond_7
    :goto_4
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v0

    if-ge v3, v0, :cond_8

    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/CharSequence;

    move-object v1, v5

    check-cast v1, Ljava/lang/CharSequence;

    const/4 v4, 0x2

    const/4 v11, 0x0

    const/4 v15, 0x0

    invoke-static {v0, v1, v11, v4, v15}, Lkotlin/text/StringsKt;->contains$default(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_8

    add-int/lit8 v3, v3, 0x1

    goto :goto_4

    :cond_8
    add-int/lit8 v3, v3, 0x1

    .line 218
    :cond_9
    invoke-static/range {v16 .. v16}, Lkotlin/collections/CollectionsKt;->last(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/pymcl/core/mods/ModsToml$parse$Block;

    invoke-virtual {v0}, Lcom/pymcl/core/mods/ModsToml$parse$Block;->getKv()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0, v9, v14}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v0, p1

    const/4 v1, 0x1

    const/4 v4, 0x2

    const/4 v5, 0x0

    const/4 v15, 0x0

    goto/16 :goto_0

    .line 209
    .end local v5    # "q":Ljava/lang/String;
    .end local v8    # "line":Ljava/lang/String;
    .end local v9    # "key":Ljava/lang/String;
    .end local v10    # "eq":I
    .end local v12    # "v":Ljava/lang/String;
    :cond_a
    :goto_5
    move-object/from16 v0, p1

    const/4 v1, 0x1

    const/4 v4, 0x2

    const/4 v5, 0x0

    const/4 v15, 0x0

    goto/16 :goto_0

    .line 227
    :cond_b
    move-object/from16 v0, v16

    check-cast v0, Ljava/lang/Iterable;

    .local v0, "$this$filter$iv":Ljava/lang/Iterable;
    const/4 v1, 0x0

    .line 328
    .local v1, "$i$f$filter":I
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    check-cast v4, Ljava/util/Collection;

    .local v4, "destination$iv$iv":Ljava/util/Collection;
    move-object v5, v0

    .local v5, "$this$filterTo$iv$iv":Ljava/lang/Iterable;
    const/4 v8, 0x0

    .line 329
    .local v8, "$i$f$filterTo":I
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_6
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_d

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    .local v10, "element$iv$iv":Ljava/lang/Object;
    move-object v11, v10

    check-cast v11, Lcom/pymcl/core/mods/ModsToml$parse$Block;

    .local v11, "it":Lcom/pymcl/core/mods/ModsToml$parse$Block;
    const/4 v12, 0x0

    .line 227
    .local v12, "$i$a$-filter-ModsToml$parse$mods$1":I
    invoke-virtual {v11}, Lcom/pymcl/core/mods/ModsToml$parse$Block;->getHeader()Ljava/lang/String;

    move-result-object v15

    move-object/from16 v22, v0

    .end local v0    # "$this$filter$iv":Ljava/lang/Iterable;
    .local v22, "$this$filter$iv":Ljava/lang/Iterable;
    const-string v0, "mods"

    invoke-static {v15, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    .line 329
    .end local v11    # "it":Lcom/pymcl/core/mods/ModsToml$parse$Block;
    .end local v12    # "$i$a$-filter-ModsToml$parse$mods$1":I
    if-eqz v0, :cond_c

    invoke-interface {v4, v10}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    :cond_c
    move-object/from16 v0, v22

    goto :goto_6

    .line 330
    .end local v10    # "element$iv$iv":Ljava/lang/Object;
    .end local v22    # "$this$filter$iv":Ljava/lang/Iterable;
    .restart local v0    # "$this$filter$iv":Ljava/lang/Iterable;
    :cond_d
    move-object/from16 v22, v0

    .end local v0    # "$this$filter$iv":Ljava/lang/Iterable;
    .end local v4    # "destination$iv$iv":Ljava/util/Collection;
    .end local v5    # "$this$filterTo$iv$iv":Ljava/lang/Iterable;
    .end local v8    # "$i$f$filterTo":I
    .restart local v22    # "$this$filter$iv":Ljava/lang/Iterable;
    move-object v0, v4

    check-cast v0, Ljava/util/List;

    .line 328
    nop

    .line 227
    .end local v1    # "$i$f$filter":I
    .end local v22    # "$this$filter$iv":Ljava/lang/Iterable;
    nop

    .line 228
    .local v0, "mods":Ljava/util/List;
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 229
    .local v1, "depsBy":Ljava/util/HashMap;
    invoke-interface/range {v16 .. v16}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_7
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    const-string v15, "modId"

    if-eqz v5, :cond_17

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/pymcl/core/mods/ModsToml$parse$Block;

    .line 230
    .local v5, "b":Lcom/pymcl/core/mods/ModsToml$parse$Block;
    invoke-virtual {v5}, Lcom/pymcl/core/mods/ModsToml$parse$Block;->getHeader()Ljava/lang/String;

    move-result-object v8

    const-string v9, "dependencies."

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x2

    invoke-static {v8, v9, v11, v12, v10}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_16

    .line 231
    invoke-virtual {v5}, Lcom/pymcl/core/mods/ModsToml$parse$Block;->getHeader()Ljava/lang/String;

    move-result-object v8

    check-cast v9, Ljava/lang/CharSequence;

    invoke-static {v8, v9}, Lkotlin/text/StringsKt;->removePrefix(Ljava/lang/String;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v8

    const/4 v9, 0x1

    new-array v10, v9, [C

    const/16 v18, 0x22

    aput-char v18, v10, v11

    invoke-static {v8, v10}, Lkotlin/text/StringsKt;->trim(Ljava/lang/String;[C)Ljava/lang/String;

    move-result-object v8

    .line 232
    .local v8, "owner":Ljava/lang/String;
    invoke-virtual {v5}, Lcom/pymcl/core/mods/ModsToml$parse$Block;->getKv()Ljava/util/Map;

    move-result-object v10

    invoke-interface {v10, v15}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/String;

    if-nez v10, :cond_e

    goto :goto_7

    :cond_e
    move-object/from16 v23, v10

    .line 233
    .local v23, "id":Ljava/lang/String;
    invoke-virtual {v5}, Lcom/pymcl/core/mods/ModsToml$parse$Block;->getKv()Ljava/util/Map;

    move-result-object v10

    const-string v11, "type"

    invoke-interface {v10, v11}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/String;

    if-eqz v10, :cond_f

    sget-object v11, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v10, v11}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v15

    const-string v10, "toLowerCase(...)"

    invoke-static {v15, v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_8

    :cond_f
    const/4 v15, 0x0

    .line 234
    .local v15, "type":Ljava/lang/String;
    :goto_8
    const-string v10, "discouraged"

    const-string v11, "incompatible"

    if-eqz v15, :cond_10

    invoke-virtual {v15}, Ljava/lang/String;->hashCode()I

    move-result v12

    sparse-switch v12, :sswitch_data_0

    goto :goto_9

    :sswitch_0
    const-string v12, "optional"

    invoke-virtual {v15, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_11

    goto :goto_9

    :sswitch_1
    invoke-virtual {v15, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_11

    goto :goto_9

    :sswitch_2
    const-string v12, "required"

    invoke-virtual {v15, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_10

    goto :goto_a

    :sswitch_3
    invoke-virtual {v15, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_11

    :cond_10
    :goto_9
    invoke-virtual {v5}, Lcom/pymcl/core/mods/ModsToml$parse$Block;->getKv()Ljava/util/Map;

    move-result-object v12

    const-string v9, "mandatory"

    invoke-interface {v12, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/String;

    if-eqz v9, :cond_11

    invoke-static {v9}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    move-result v9

    :goto_a
    move/from16 v25, v9

    goto :goto_b

    :cond_11
    const/16 v25, 0x0

    .line 235
    .local v25, "mandatory":Z
    :goto_b
    invoke-static {v15, v11}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_12

    :goto_c
    move-object/from16 v27, v11

    goto :goto_d

    :cond_12
    invoke-static {v15, v10}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_13

    const-string v11, "conflicts"

    goto :goto_c

    :cond_13
    const-string v11, "depends"

    goto :goto_c

    .line 236
    .local v27, "kind":Ljava/lang/String;
    :goto_d
    move-object v9, v1

    check-cast v9, Ljava/util/Map;

    .local v9, "$this$getOrPut$iv":Ljava/util/Map;
    move-object v10, v8

    .local v10, "key$iv":Ljava/lang/Object;
    const/4 v11, 0x0

    .line 331
    .local v11, "$i$f$getOrPut":I
    invoke-interface {v9, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    .line 332
    .local v12, "value$iv":Ljava/lang/Object;
    if-nez v12, :cond_14

    .line 333
    const/16 v22, 0x0

    .line 236
    .local v22, "$i$a$-getOrPut-ModsToml$parse$1":I
    new-instance v24, Ljava/util/ArrayList;

    invoke-direct/range {v24 .. v24}, Ljava/util/ArrayList;-><init>()V

    check-cast v24, Ljava/util/List;

    .line 333
    .end local v22    # "$i$a$-getOrPut-ModsToml$parse$1":I
    move-object/from16 v22, v24

    .line 334
    .local v22, "answer$iv":Ljava/lang/Object;
    move-object/from16 v28, v0

    move-object/from16 v0, v22

    .end local v22    # "answer$iv":Ljava/lang/Object;
    .local v0, "answer$iv":Ljava/lang/Object;
    .local v28, "mods":Ljava/util/List;
    invoke-interface {v9, v10, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 335
    nop

    .end local v0    # "answer$iv":Ljava/lang/Object;
    goto :goto_e

    .line 337
    .end local v28    # "mods":Ljava/util/List;
    .local v0, "mods":Ljava/util/List;
    :cond_14
    move-object/from16 v28, v0

    .end local v0    # "mods":Ljava/util/List;
    .restart local v28    # "mods":Ljava/util/List;
    move-object/from16 v22, v12

    .line 332
    :goto_e
    nop

    .end local v9    # "$this$getOrPut$iv":Ljava/util/Map;
    .end local v10    # "key$iv":Ljava/lang/Object;
    .end local v11    # "$i$f$getOrPut":I
    .end local v12    # "value$iv":Ljava/lang/Object;
    move-object/from16 v0, v22

    check-cast v0, Ljava/util/Collection;

    .line 236
    new-instance v22, Lcom/pymcl/core/mods/ModDep;

    invoke-virtual {v5}, Lcom/pymcl/core/mods/ModsToml$parse$Block;->getKv()Ljava/util/Map;

    move-result-object v9

    const-string v10, "versionRange"

    invoke-interface {v9, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/String;

    if-nez v9, :cond_15

    move-object/from16 v24, v14

    goto :goto_f

    :cond_15
    move-object/from16 v24, v9

    :goto_f
    const/16 v26, 0x1

    invoke-direct/range {v22 .. v27}, Lcom/pymcl/core/mods/ModDep;-><init>(Ljava/lang/String;Ljava/lang/Object;ZZLjava/lang/String;)V

    move-object/from16 v9, v22

    invoke-interface {v0, v9}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move-object/from16 v0, v28

    goto/16 :goto_7

    .line 230
    .end local v8    # "owner":Ljava/lang/String;
    .end local v15    # "type":Ljava/lang/String;
    .end local v23    # "id":Ljava/lang/String;
    .end local v25    # "mandatory":Z
    .end local v27    # "kind":Ljava/lang/String;
    .end local v28    # "mods":Ljava/util/List;
    .restart local v0    # "mods":Ljava/util/List;
    :cond_16
    move-object/from16 v28, v0

    const/16 v18, 0x22

    .end local v0    # "mods":Ljava/util/List;
    .restart local v28    # "mods":Ljava/util/List;
    goto/16 :goto_7

    .line 238
    .end local v5    # "b":Lcom/pymcl/core/mods/ModsToml$parse$Block;
    .end local v28    # "mods":Ljava/util/List;
    .restart local v0    # "mods":Ljava/util/List;
    :cond_17
    move-object/from16 v28, v0

    .end local v0    # "mods":Ljava/util/List;
    .restart local v28    # "mods":Ljava/util/List;
    move-object/from16 v0, v28

    check-cast v0, Ljava/lang/Iterable;

    .local v0, "$this$mapNotNull$iv":Ljava/lang/Iterable;
    const/16 v18, 0x0

    .line 338
    .local v18, "$i$f$mapNotNull":I
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    check-cast v4, Ljava/util/Collection;

    .restart local v4    # "destination$iv$iv":Ljava/util/Collection;
    move-object/from16 v22, v0

    .local v22, "$this$mapNotNullTo$iv$iv":Ljava/lang/Iterable;
    const/16 v23, 0x0

    .line 347
    .local v23, "$i$f$mapNotNullTo":I
    move-object/from16 v24, v22

    .local v24, "$this$forEach$iv$iv$iv":Ljava/lang/Iterable;
    const/16 v25, 0x0

    .line 348
    .local v25, "$i$f$forEach":I
    invoke-interface/range {v24 .. v24}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v26

    :goto_10
    invoke-interface/range {v26 .. v26}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_21

    invoke-interface/range {v26 .. v26}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v27

    .local v27, "element$iv$iv$iv":Ljava/lang/Object;
    move-object/from16 v29, v27

    .local v29, "element$iv$iv":Ljava/lang/Object;
    const/16 v30, 0x0

    .line 347
    .local v30, "$i$a$-forEach-CollectionsKt___CollectionsKt$mapNotNullTo$1$iv$iv":I
    move-object/from16 v31, v29

    check-cast v31, Lcom/pymcl/core/mods/ModsToml$parse$Block;

    .local v31, "b":Lcom/pymcl/core/mods/ModsToml$parse$Block;
    const/16 v32, 0x0

    .line 239
    .local v32, "$i$a$-mapNotNull-ModsToml$parse$2":I
    invoke-virtual/range {v31 .. v31}, Lcom/pymcl/core/mods/ModsToml$parse$Block;->getKv()Ljava/util/Map;

    move-result-object v5

    invoke-interface {v5, v15}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    if-nez v5, :cond_18

    move-object/from16 v17, v0

    move-object/from16 v20, v2

    move/from16 v19, v3

    move-object v0, v4

    const/4 v2, 0x0

    const/16 v21, 0x1

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x2

    goto/16 :goto_12

    .line 240
    .local v5, "id":Ljava/lang/String;
    :cond_18
    invoke-virtual/range {v31 .. v31}, Lcom/pymcl/core/mods/ModsToml$parse$Block;->getKv()Ljava/util/Map;

    move-result-object v8

    const-string v9, "version"

    invoke-interface {v8, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/String;

    if-nez v8, :cond_19

    move-object v8, v14

    .line 241
    .local v8, "ver":Ljava/lang/String;
    :cond_19
    move-object v9, v8

    check-cast v9, Ljava/lang/CharSequence;

    const-string v10, "${file.jarVersion}"

    check-cast v10, Ljava/lang/CharSequence;

    move-object/from16 v17, v0

    const/4 v0, 0x2

    const/4 v11, 0x0

    const/4 v12, 0x0

    .end local v0    # "$this$mapNotNull$iv":Ljava/lang/Iterable;
    .local v17, "$this$mapNotNull$iv":Ljava/lang/Iterable;
    invoke-static {v9, v10, v12, v0, v11}, Lkotlin/text/StringsKt;->contains$default(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_1a

    move-object/from16 v8, p5

    .line 242
    :cond_1a
    invoke-virtual/range {v31 .. v31}, Lcom/pymcl/core/mods/ModsToml$parse$Block;->getKv()Ljava/util/Map;

    move-result-object v9

    const-string v10, "displayName"

    invoke-interface {v9, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/String;

    if-eqz v9, :cond_1d

    check-cast v9, Ljava/lang/CharSequence;

    invoke-interface {v9}, Ljava/lang/CharSequence;->length()I

    move-result v10

    if-nez v10, :cond_1b

    const/4 v10, 0x1

    goto :goto_11

    :cond_1b
    move v10, v12

    :goto_11
    if-eqz v10, :cond_1c

    .line 349
    const/4 v9, 0x0

    .line 242
    .local v9, "$i$a$-ifEmpty-ModsToml$parse$2$1":I
    move-object v9, v11

    .end local v9    # "$i$a$-ifEmpty-ModsToml$parse$2$1":I
    :cond_1c
    check-cast v9, Ljava/lang/String;

    if-nez v9, :cond_1e

    :cond_1d
    move-object v9, v5

    :cond_1e
    invoke-virtual {v1, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/util/List;

    if-nez v10, :cond_1f

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v10

    :cond_1f
    move-object/from16 v20, v2

    .end local v2    # "lines":Ljava/util/List;
    .local v20, "lines":Ljava/util/List;
    new-instance v2, Lcom/pymcl/core/mods/ModMeta;

    move-object/from16 v21, v4

    move-object v4, v9

    move-object v9, v10

    .end local v4    # "destination$iv$iv":Ljava/util/Collection;
    .local v21, "destination$iv$iv":Ljava/util/Collection;
    const/4 v10, 0x0

    move-object/from16 v33, v11

    const/16 v11, 0x80

    move/from16 v34, v12

    const/4 v12, 0x0

    move/from16 v35, v0

    move/from16 v19, v3

    move-object v3, v5

    move-object v5, v8

    move-object/from16 v0, v21

    const/16 v21, 0x1

    move-object/from16 v8, p4

    .end local v8    # "ver":Ljava/lang/String;
    .end local v21    # "destination$iv$iv":Ljava/util/Collection;
    .local v0, "destination$iv$iv":Ljava/util/Collection;
    .local v3, "id":Ljava/lang/String;
    .local v5, "ver":Ljava/lang/String;
    .local v19, "i":I
    invoke-direct/range {v2 .. v12}, Lcom/pymcl/core/mods/ModMeta;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 347
    .end local v3    # "id":Ljava/lang/String;
    .end local v5    # "ver":Ljava/lang/String;
    .end local v31    # "b":Lcom/pymcl/core/mods/ModsToml$parse$Block;
    .end local v32    # "$i$a$-mapNotNull-ModsToml$parse$2":I
    :goto_12
    if-eqz v2, :cond_20

    .line 350
    .local v2, "it$iv$iv":Ljava/lang/Object;
    const/4 v3, 0x0

    .line 347
    .local v3, "$i$a$-let-CollectionsKt___CollectionsKt$mapNotNullTo$1$1$iv$iv":I
    invoke-interface {v0, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 348
    .end local v2    # "it$iv$iv":Ljava/lang/Object;
    .end local v3    # "$i$a$-let-CollectionsKt___CollectionsKt$mapNotNullTo$1$1$iv$iv":I
    .end local v29    # "element$iv$iv":Ljava/lang/Object;
    .end local v30    # "$i$a$-forEach-CollectionsKt___CollectionsKt$mapNotNullTo$1$iv$iv":I
    :cond_20
    move-object/from16 v6, p2

    move-object/from16 v7, p3

    move-object v4, v0

    move-object/from16 v0, v17

    move/from16 v3, v19

    move-object/from16 v2, v20

    .end local v27    # "element$iv$iv$iv":Ljava/lang/Object;
    goto/16 :goto_10

    .line 351
    .end local v17    # "$this$mapNotNull$iv":Ljava/lang/Iterable;
    .end local v19    # "i":I
    .end local v20    # "lines":Ljava/util/List;
    .local v0, "$this$mapNotNull$iv":Ljava/lang/Iterable;
    .local v2, "lines":Ljava/util/List;
    .local v3, "i":I
    .restart local v4    # "destination$iv$iv":Ljava/util/Collection;
    :cond_21
    move-object/from16 v17, v0

    move-object v0, v4

    .line 352
    .end local v4    # "destination$iv$iv":Ljava/util/Collection;
    .end local v24    # "$this$forEach$iv$iv$iv":Ljava/lang/Iterable;
    .end local v25    # "$i$f$forEach":I
    .local v0, "destination$iv$iv":Ljava/util/Collection;
    .restart local v17    # "$this$mapNotNull$iv":Ljava/lang/Iterable;
    nop

    .end local v0    # "destination$iv$iv":Ljava/util/Collection;
    .end local v22    # "$this$mapNotNullTo$iv$iv":Ljava/lang/Iterable;
    .end local v23    # "$i$f$mapNotNullTo":I
    check-cast v0, Ljava/util/List;

    .line 338
    nop

    .line 238
    .end local v17    # "$this$mapNotNull$iv":Ljava/lang/Iterable;
    .end local v18    # "$i$f$mapNotNull":I
    return-object v0

    :sswitch_data_0
    .sparse-switch
        -0x1fc9bea4 -> :sswitch_3
        -0x176ed461 -> :sswitch_2
        -0x10178247 -> :sswitch_1
        -0x4b5b4a0 -> :sswitch_0
    .end sparse-switch

    :array_0
    .array-data 2
        0x5bs
        0x5ds
    .end array-data
.end method
