.class public final Lcom/pymcl/core/version/VersionFilterKt;
.super Ljava/lang/Object;
.source "VersionFilter.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nVersionFilter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VersionFilter.kt\ncom/pymcl/core/version/VersionFilterKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,45:1\n777#2:46\n873#2,2:47\n777#2:50\n873#2,2:51\n1849#2,8:53\n777#2:61\n873#2,2:62\n777#2:64\n873#2:65\n1939#2,3:66\n874#2:69\n777#2:70\n873#2,2:71\n832#2:73\n862#2,2:74\n1#3:49\n*S KotlinDebug\n*F\n+ 1 VersionFilter.kt\ncom/pymcl/core/version/VersionFilterKt\n*L\n14#1:46\n14#1:47,2\n18#1:50\n18#1:51,2\n18#1:53,8\n21#1:61\n21#1:62,2\n22#1:64\n22#1:65\n22#1:66,3\n22#1:69\n23#1:70\n23#1:71,2\n23#1:73\n23#1:74,2\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u001e\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\"\n\u0000\u001a6\u0010\u0000\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u000e\u0008\u0002\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00082\u0008\u0008\u0002\u0010\t\u001a\u00020\n\u001a\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0006H\u0000\u001a\u001c\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00122\u000c\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0008\"\u000e\u0010\u000b\u001a\u00020\u000cX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"
    }
    d2 = {
        "filterVersions",
        "",
        "Lcom/pymcl/core/version/ManifestEntry;",
        "manifest",
        "Lcom/pymcl/core/version/VersionManifest;",
        "query",
        "",
        "types",
        "",
        "limit",
        "",
        "NUMERIC",
        "Lkotlin/text/Regex;",
        "versionMatches",
        "",
        "id",
        "word",
        "normalizeVersionTypes",
        "",
        "PyMCL-Android:core"
    }
    k = 0x2
    mv = {
        0x2,
        0x4,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final NUMERIC:Lkotlin/text/Regex;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 26
    new-instance v0, Lkotlin/text/Regex;

    const-string v1, "^\\d+(\\.\\d+)*$"

    invoke-direct {v0, v1}, Lkotlin/text/Regex;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/pymcl/core/version/VersionFilterKt;->NUMERIC:Lkotlin/text/Regex;

    return-void
.end method

.method public static final filterVersions(Lcom/pymcl/core/version/VersionManifest;Ljava/lang/String;Ljava/util/Collection;I)Ljava/util/List;
    .locals 24
    .param p0, "manifest"    # Lcom/pymcl/core/version/VersionManifest;
    .param p1, "query"    # Ljava/lang/String;
    .param p2, "types"    # Ljava/util/Collection;
    .param p3, "limit"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/pymcl/core/version/VersionManifest;",
            "Ljava/lang/String;",
            "Ljava/util/Collection<",
            "Ljava/lang/String;",
            ">;I)",
            "Ljava/util/List<",
            "Lcom/pymcl/core/version/ManifestEntry;",
            ">;"
        }
    .end annotation

    move-object/from16 v0, p1

    move/from16 v1, p3

    const-string v2, "manifest"

    move-object/from16 v3, p0

    invoke-static {v3, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "query"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "types"

    move-object/from16 v4, p2

    invoke-static {v4, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    invoke-static {v4}, Lcom/pymcl/core/version/VersionFilterKt;->normalizeVersionTypes(Ljava/util/Collection;)Ljava/util/Set;

    move-result-object v2

    .line 14
    .local v2, "t":Ljava/util/Set;
    invoke-virtual {v3}, Lcom/pymcl/core/version/VersionManifest;->getVersions()Ljava/util/List;

    move-result-object v5

    check-cast v5, Ljava/lang/Iterable;

    .local v5, "$this$filter$iv":Ljava/lang/Iterable;
    const/4 v6, 0x0

    .line 46
    .local v6, "$i$f$filter":I
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    check-cast v7, Ljava/util/Collection;

    .local v7, "destination$iv$iv":Ljava/util/Collection;
    move-object v8, v5

    .local v8, "$this$filterTo$iv$iv":Ljava/lang/Iterable;
    const/4 v9, 0x0

    .line 47
    .local v9, "$i$f$filterTo":I
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :cond_0
    :goto_0
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    const/4 v13, 0x1

    if-eqz v11, :cond_3

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    .local v11, "element$iv$iv":Ljava/lang/Object;
    move-object v14, v11

    check-cast v14, Lcom/pymcl/core/version/ManifestEntry;

    .local v14, "it":Lcom/pymcl/core/version/ManifestEntry;
    const/4 v15, 0x0

    .line 14
    .local v15, "$i$a$-filter-VersionFilterKt$filterVersions$pool$1":I
    if-eqz v2, :cond_2

    invoke-virtual {v14}, Lcom/pymcl/core/version/ManifestEntry;->getType()Ljava/lang/String;

    move-result-object v12

    invoke-interface {v2, v12}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_1

    goto :goto_1

    :cond_1
    const/4 v12, 0x0

    goto :goto_2

    :cond_2
    :goto_1
    move v12, v13

    .line 47
    .end local v14    # "it":Lcom/pymcl/core/version/ManifestEntry;
    .end local v15    # "$i$a$-filter-VersionFilterKt$filterVersions$pool$1":I
    :goto_2
    if-eqz v12, :cond_0

    invoke-interface {v7, v11}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 48
    .end local v11    # "element$iv$iv":Ljava/lang/Object;
    :cond_3
    nop

    .end local v7    # "destination$iv$iv":Ljava/util/Collection;
    .end local v8    # "$this$filterTo$iv$iv":Ljava/lang/Iterable;
    .end local v9    # "$i$f$filterTo":I
    check-cast v7, Ljava/util/List;

    .line 46
    nop

    .line 14
    .end local v5    # "$this$filter$iv":Ljava/lang/Iterable;
    .end local v6    # "$i$f$filter":I
    nop

    .line 15
    .local v7, "pool":Ljava/util/List;
    move-object v5, v0

    check-cast v5, Ljava/lang/CharSequence;

    invoke-static {v5}, Lkotlin/text/StringsKt;->trim(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v5

    .line 16
    .local v5, "q":Ljava/lang/String;
    const-string v6, "latest"

    invoke-static {v5, v6, v13}, Lkotlin/text/StringsKt;->equals(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v6

    if-nez v6, :cond_13

    const-string v6, "\u6700\u65b0"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_4

    goto/16 :goto_b

    .line 20
    :cond_4
    move-object v6, v5

    check-cast v6, Ljava/lang/CharSequence;

    invoke-interface {v6}, Ljava/lang/CharSequence;->length()I

    move-result v6

    if-nez v6, :cond_5

    move v6, v13

    goto :goto_3

    :cond_5
    const/4 v6, 0x0

    :goto_3
    if-eqz v6, :cond_6

    move-object v6, v7

    check-cast v6, Ljava/lang/Iterable;

    invoke-static {v6, v1}, Lkotlin/collections/CollectionsKt;->take(Ljava/lang/Iterable;I)Ljava/util/List;

    move-result-object v6

    return-object v6

    .line 21
    :cond_6
    move-object v6, v5

    check-cast v6, Ljava/lang/CharSequence;

    new-instance v8, Lkotlin/text/Regex;

    const-string v9, "\\s+"

    invoke-direct {v8, v9}, Lkotlin/text/Regex;-><init>(Ljava/lang/String;)V

    const/4 v9, 0x0

    invoke-virtual {v8, v6, v9}, Lkotlin/text/Regex;->split(Ljava/lang/CharSequence;I)Ljava/util/List;

    move-result-object v6

    check-cast v6, Ljava/lang/Iterable;

    .local v6, "$this$filter$iv":Ljava/lang/Iterable;
    const/4 v8, 0x0

    .line 61
    .local v8, "$i$f$filter":I
    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    check-cast v9, Ljava/util/Collection;

    .local v9, "destination$iv$iv":Ljava/util/Collection;
    move-object v10, v6

    .local v10, "$this$filterTo$iv$iv":Ljava/lang/Iterable;
    const/4 v11, 0x0

    .line 62
    .local v11, "$i$f$filterTo":I
    invoke-interface {v10}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v12

    :cond_7
    :goto_4
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v14

    if-eqz v14, :cond_9

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v14

    .local v14, "element$iv$iv":Ljava/lang/Object;
    move-object v15, v14

    check-cast v15, Ljava/lang/String;

    .local v15, "it":Ljava/lang/String;
    const/16 v17, 0x0

    .line 21
    .local v17, "$i$a$-filter-VersionFilterKt$filterVersions$words$1":I
    move-object/from16 v18, v15

    check-cast v18, Ljava/lang/CharSequence;

    invoke-interface/range {v18 .. v18}, Ljava/lang/CharSequence;->length()I

    move-result v18

    if-lez v18, :cond_8

    move/from16 v18, v13

    goto :goto_5

    :cond_8
    const/16 v18, 0x0

    .line 62
    .end local v15    # "it":Ljava/lang/String;
    .end local v17    # "$i$a$-filter-VersionFilterKt$filterVersions$words$1":I
    :goto_5
    if-eqz v18, :cond_7

    invoke-interface {v9, v14}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_4

    .line 63
    .end local v14    # "element$iv$iv":Ljava/lang/Object;
    :cond_9
    nop

    .end local v9    # "destination$iv$iv":Ljava/util/Collection;
    .end local v10    # "$this$filterTo$iv$iv":Ljava/lang/Iterable;
    .end local v11    # "$i$f$filterTo":I
    check-cast v9, Ljava/util/List;

    .line 61
    nop

    .line 21
    .end local v6    # "$this$filter$iv":Ljava/lang/Iterable;
    .end local v8    # "$i$f$filter":I
    nop

    .line 22
    .local v9, "words":Ljava/util/List;
    move-object v6, v7

    check-cast v6, Ljava/lang/Iterable;

    .restart local v6    # "$this$filter$iv":Ljava/lang/Iterable;
    const/4 v8, 0x0

    .line 64
    .restart local v8    # "$i$f$filter":I
    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    check-cast v10, Ljava/util/Collection;

    .local v10, "destination$iv$iv":Ljava/util/Collection;
    move-object v11, v6

    .local v11, "$this$filterTo$iv$iv":Ljava/lang/Iterable;
    const/4 v12, 0x0

    .line 65
    .local v12, "$i$f$filterTo":I
    invoke-interface {v11}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v14

    :goto_6
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    move-result v15

    if-eqz v15, :cond_e

    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v15

    .local v15, "element$iv$iv":Ljava/lang/Object;
    move-object/from16 v17, v15

    check-cast v17, Lcom/pymcl/core/version/ManifestEntry;

    .local v17, "e":Lcom/pymcl/core/version/ManifestEntry;
    const/16 v18, 0x0

    .line 22
    .local v18, "$i$a$-filter-VersionFilterKt$filterVersions$hits$1":I
    move-object v13, v9

    check-cast v13, Ljava/lang/Iterable;

    .local v13, "$this$all$iv":Ljava/lang/Iterable;
    const/16 v20, 0x0

    .line 66
    .local v20, "$i$f$all":I
    instance-of v0, v13, Ljava/util/Collection;

    if-eqz v0, :cond_a

    move-object v0, v13

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_a

    const/4 v0, 0x1

    goto :goto_8

    .line 67
    :cond_a
    invoke-interface {v13}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_7
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v21

    if-eqz v21, :cond_c

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v21

    move-object/from16 v22, v0

    .local v21, "element$iv":Ljava/lang/Object;
    move-object/from16 v0, v21

    check-cast v0, Ljava/lang/String;

    .local v0, "it":Ljava/lang/String;
    const/16 v23, 0x0

    .line 22
    .local v23, "$i$a$-all-VersionFilterKt$filterVersions$hits$1$1":I
    invoke-virtual/range {v17 .. v17}, Lcom/pymcl/core/version/ManifestEntry;->getId()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v0}, Lcom/pymcl/core/version/VersionFilterKt;->versionMatches(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    .line 67
    .end local v0    # "it":Ljava/lang/String;
    .end local v23    # "$i$a$-all-VersionFilterKt$filterVersions$hits$1$1":I
    if-nez v0, :cond_b

    const/4 v0, 0x0

    goto :goto_8

    :cond_b
    move-object/from16 v3, p0

    move-object/from16 v0, v22

    goto :goto_7

    .line 68
    .end local v21    # "element$iv":Ljava/lang/Object;
    :cond_c
    const/4 v0, 0x1

    .line 22
    .end local v13    # "$this$all$iv":Ljava/lang/Iterable;
    .end local v20    # "$i$f$all":I
    :goto_8
    nop

    .line 65
    .end local v17    # "e":Lcom/pymcl/core/version/ManifestEntry;
    .end local v18    # "$i$a$-filter-VersionFilterKt$filterVersions$hits$1":I
    if-eqz v0, :cond_d

    invoke-interface {v10, v15}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    :cond_d
    const/4 v13, 0x1

    move-object/from16 v3, p0

    move-object/from16 v0, p1

    goto :goto_6

    .line 69
    .end local v15    # "element$iv$iv":Ljava/lang/Object;
    :cond_e
    nop

    .end local v10    # "destination$iv$iv":Ljava/util/Collection;
    .end local v11    # "$this$filterTo$iv$iv":Ljava/lang/Iterable;
    .end local v12    # "$i$f$filterTo":I
    move-object v0, v10

    check-cast v0, Ljava/util/List;

    .line 64
    nop

    .line 22
    .end local v6    # "$this$filter$iv":Ljava/lang/Iterable;
    .end local v8    # "$i$f$filter":I
    nop

    .line 23
    .local v0, "hits":Ljava/util/List;
    move-object v3, v0

    check-cast v3, Ljava/lang/Iterable;

    .local v3, "$this$filter$iv":Ljava/lang/Iterable;
    const/4 v6, 0x0

    .line 70
    .local v6, "$i$f$filter":I
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    check-cast v8, Ljava/util/Collection;

    .local v8, "destination$iv$iv":Ljava/util/Collection;
    move-object v10, v3

    .local v10, "$this$filterTo$iv$iv":Ljava/lang/Iterable;
    const/4 v11, 0x0

    .line 71
    .local v11, "$i$f$filterTo":I
    invoke-interface {v10}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v12

    :goto_9
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    if-eqz v13, :cond_10

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    .local v13, "element$iv$iv":Ljava/lang/Object;
    move-object v14, v13

    check-cast v14, Lcom/pymcl/core/version/ManifestEntry;

    .local v14, "it":Lcom/pymcl/core/version/ManifestEntry;
    const/4 v15, 0x0

    .line 23
    .local v15, "$i$a$-filter-VersionFilterKt$filterVersions$3":I
    move-object/from16 v16, v0

    .end local v0    # "hits":Ljava/util/List;
    .local v16, "hits":Ljava/util/List;
    invoke-virtual {v14}, Lcom/pymcl/core/version/ManifestEntry;->getId()Ljava/lang/String;

    move-result-object v0

    move-object/from16 v17, v3

    const/4 v3, 0x1

    .end local v3    # "$this$filter$iv":Ljava/lang/Iterable;
    .local v17, "$this$filter$iv":Ljava/lang/Iterable;
    invoke-static {v0, v5, v3}, Lkotlin/text/StringsKt;->equals(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v0

    .line 71
    .end local v14    # "it":Lcom/pymcl/core/version/ManifestEntry;
    .end local v15    # "$i$a$-filter-VersionFilterKt$filterVersions$3":I
    if-eqz v0, :cond_f

    invoke-interface {v8, v13}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    :cond_f
    move-object/from16 v0, v16

    move-object/from16 v3, v17

    goto :goto_9

    .line 72
    .end local v13    # "element$iv$iv":Ljava/lang/Object;
    .end local v16    # "hits":Ljava/util/List;
    .end local v17    # "$this$filter$iv":Ljava/lang/Iterable;
    .restart local v0    # "hits":Ljava/util/List;
    .restart local v3    # "$this$filter$iv":Ljava/lang/Iterable;
    :cond_10
    move-object/from16 v16, v0

    move-object/from16 v17, v3

    .end local v0    # "hits":Ljava/util/List;
    .end local v3    # "$this$filter$iv":Ljava/lang/Iterable;
    .end local v8    # "destination$iv$iv":Ljava/util/Collection;
    .end local v10    # "$this$filterTo$iv$iv":Ljava/lang/Iterable;
    .end local v11    # "$i$f$filterTo":I
    .restart local v16    # "hits":Ljava/util/List;
    .restart local v17    # "$this$filter$iv":Ljava/lang/Iterable;
    move-object v0, v8

    check-cast v0, Ljava/util/List;

    .line 70
    nop

    .end local v6    # "$i$f$filter":I
    .end local v17    # "$this$filter$iv":Ljava/lang/Iterable;
    check-cast v0, Ljava/util/Collection;

    .line 23
    move-object/from16 v3, v16

    check-cast v3, Ljava/lang/Iterable;

    .local v3, "$this$filterNot$iv":Ljava/lang/Iterable;
    const/4 v6, 0x0

    .line 73
    .local v6, "$i$f$filterNot":I
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    check-cast v8, Ljava/util/Collection;

    .restart local v8    # "destination$iv$iv":Ljava/util/Collection;
    move-object v10, v3

    .local v10, "$this$filterNotTo$iv$iv":Ljava/lang/Iterable;
    const/4 v11, 0x0

    .line 74
    .local v11, "$i$f$filterNotTo":I
    invoke-interface {v10}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v12

    :goto_a
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    if-eqz v13, :cond_12

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    .restart local v13    # "element$iv$iv":Ljava/lang/Object;
    move-object v14, v13

    check-cast v14, Lcom/pymcl/core/version/ManifestEntry;

    .restart local v14    # "it":Lcom/pymcl/core/version/ManifestEntry;
    const/4 v15, 0x0

    .line 23
    .local v15, "$i$a$-filterNot-VersionFilterKt$filterVersions$4":I
    move-object/from16 v17, v3

    .end local v3    # "$this$filterNot$iv":Ljava/lang/Iterable;
    .local v17, "$this$filterNot$iv":Ljava/lang/Iterable;
    invoke-virtual {v14}, Lcom/pymcl/core/version/ManifestEntry;->getId()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x1

    invoke-static {v3, v5, v4}, Lkotlin/text/StringsKt;->equals(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v3

    .line 74
    .end local v14    # "it":Lcom/pymcl/core/version/ManifestEntry;
    .end local v15    # "$i$a$-filterNot-VersionFilterKt$filterVersions$4":I
    if-nez v3, :cond_11

    invoke-interface {v8, v13}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    :cond_11
    move-object/from16 v4, p2

    move-object/from16 v3, v17

    goto :goto_a

    .line 75
    .end local v13    # "element$iv$iv":Ljava/lang/Object;
    .end local v17    # "$this$filterNot$iv":Ljava/lang/Iterable;
    .restart local v3    # "$this$filterNot$iv":Ljava/lang/Iterable;
    :cond_12
    move-object/from16 v17, v3

    .end local v3    # "$this$filterNot$iv":Ljava/lang/Iterable;
    .end local v8    # "destination$iv$iv":Ljava/util/Collection;
    .end local v10    # "$this$filterNotTo$iv$iv":Ljava/lang/Iterable;
    .end local v11    # "$i$f$filterNotTo":I
    .restart local v17    # "$this$filterNot$iv":Ljava/lang/Iterable;
    move-object v3, v8

    check-cast v3, Ljava/util/List;

    .line 73
    nop

    .end local v6    # "$i$f$filterNot":I
    .end local v17    # "$this$filterNot$iv":Ljava/lang/Iterable;
    check-cast v3, Ljava/lang/Iterable;

    .line 23
    invoke-static {v0, v3}, Lkotlin/collections/CollectionsKt;->plus(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v0, v1}, Lkotlin/collections/CollectionsKt;->take(Ljava/lang/Iterable;I)Ljava/util/List;

    move-result-object v0

    return-object v0

    .line 17
    .end local v9    # "words":Ljava/util/List;
    .end local v16    # "hits":Ljava/util/List;
    :cond_13
    :goto_b
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/String;

    invoke-virtual/range {p0 .. p0}, Lcom/pymcl/core/version/VersionManifest;->getLatestRelease()Ljava/lang/String;

    move-result-object v3

    .line 49
    move-object v4, v3

    .local v4, "it":Ljava/lang/String;
    const/4 v6, 0x0

    .line 17
    .local v6, "$i$a$-takeIf-VersionFilterKt$filterVersions$ids$1":I
    if-eqz v2, :cond_15

    const-string v8, "release"

    invoke-interface {v2, v8}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_14

    goto :goto_c

    :cond_14
    const/4 v9, 0x0

    goto :goto_d

    :cond_15
    :goto_c
    const/4 v9, 0x1

    .end local v4    # "it":Ljava/lang/String;
    .end local v6    # "$i$a$-takeIf-VersionFilterKt$filterVersions$ids$1":I
    :goto_d
    const/4 v4, 0x0

    if-eqz v9, :cond_16

    goto :goto_e

    :cond_16
    move-object v3, v4

    :goto_e
    const/16 v16, 0x0

    aput-object v3, v0, v16

    invoke-virtual/range {p0 .. p0}, Lcom/pymcl/core/version/VersionManifest;->getLatestSnapshot()Ljava/lang/String;

    move-result-object v3

    .line 49
    move-object v6, v3

    .local v6, "it":Ljava/lang/String;
    const/4 v8, 0x0

    .line 17
    .local v8, "$i$a$-takeIf-VersionFilterKt$filterVersions$ids$2":I
    if-eqz v2, :cond_17

    const-string v9, "snapshot"

    invoke-interface {v2, v9}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_17

    const/4 v12, 0x1

    goto :goto_f

    :cond_17
    move/from16 v12, v16

    .end local v6    # "it":Ljava/lang/String;
    .end local v8    # "$i$a$-takeIf-VersionFilterKt$filterVersions$ids$2":I
    :goto_f
    if-eqz v12, :cond_18

    move-object v4, v3

    :cond_18
    const/16 v19, 0x1

    aput-object v4, v0, v19

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOfNotNull([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    .line 18
    .local v0, "ids":Ljava/util/List;
    move-object v3, v7

    check-cast v3, Ljava/lang/Iterable;

    .local v3, "$this$filter$iv":Ljava/lang/Iterable;
    const/4 v4, 0x0

    .line 50
    .local v4, "$i$f$filter":I
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    check-cast v6, Ljava/util/Collection;

    .local v6, "destination$iv$iv":Ljava/util/Collection;
    move-object v8, v3

    .local v8, "$this$filterTo$iv$iv":Ljava/lang/Iterable;
    const/4 v9, 0x0

    .line 51
    .local v9, "$i$f$filterTo":I
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :cond_19
    :goto_10
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_1a

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    .local v11, "element$iv$iv":Ljava/lang/Object;
    move-object v12, v11

    check-cast v12, Lcom/pymcl/core/version/ManifestEntry;

    .local v12, "it":Lcom/pymcl/core/version/ManifestEntry;
    const/4 v13, 0x0

    .line 18
    .local v13, "$i$a$-filter-VersionFilterKt$filterVersions$1":I
    invoke-virtual {v12}, Lcom/pymcl/core/version/ManifestEntry;->getId()Ljava/lang/String;

    move-result-object v14

    invoke-interface {v0, v14}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v12

    .line 51
    .end local v12    # "it":Lcom/pymcl/core/version/ManifestEntry;
    .end local v13    # "$i$a$-filter-VersionFilterKt$filterVersions$1":I
    if-eqz v12, :cond_19

    invoke-interface {v6, v11}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_10

    .line 52
    .end local v11    # "element$iv$iv":Ljava/lang/Object;
    :cond_1a
    nop

    .end local v6    # "destination$iv$iv":Ljava/util/Collection;
    .end local v8    # "$this$filterTo$iv$iv":Ljava/lang/Iterable;
    .end local v9    # "$i$f$filterTo":I
    check-cast v6, Ljava/util/List;

    .line 50
    nop

    .end local v3    # "$this$filter$iv":Ljava/lang/Iterable;
    .end local v4    # "$i$f$filter":I
    check-cast v6, Ljava/lang/Iterable;

    .line 18
    nop

    .local v6, "$this$distinctBy$iv":Ljava/lang/Iterable;
    const/4 v3, 0x0

    .line 53
    .local v3, "$i$f$distinctBy":I
    new-instance v4, Ljava/util/HashSet;

    invoke-direct {v4}, Ljava/util/HashSet;-><init>()V

    .line 54
    .local v4, "set$iv":Ljava/util/HashSet;
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 55
    .local v8, "list$iv":Ljava/util/ArrayList;
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :cond_1b
    :goto_11
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_1c

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    .line 56
    .local v10, "e$iv":Ljava/lang/Object;
    move-object v11, v10

    check-cast v11, Lcom/pymcl/core/version/ManifestEntry;

    .local v11, "it":Lcom/pymcl/core/version/ManifestEntry;
    const/4 v12, 0x0

    .line 18
    .local v12, "$i$a$-distinctBy-VersionFilterKt$filterVersions$2":I
    invoke-virtual {v11}, Lcom/pymcl/core/version/ManifestEntry;->getId()Ljava/lang/String;

    move-result-object v11

    .line 56
    .end local v11    # "it":Lcom/pymcl/core/version/ManifestEntry;
    .end local v12    # "$i$a$-distinctBy-VersionFilterKt$filterVersions$2":I
    nop

    .line 57
    .local v11, "key$iv":Ljava/lang/Object;
    invoke-virtual {v4, v11}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_1b

    .line 58
    invoke-virtual {v8, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_11

    .line 60
    .end local v10    # "e$iv":Ljava/lang/Object;
    .end local v11    # "key$iv":Ljava/lang/Object;
    :cond_1c
    move-object v3, v8

    check-cast v3, Ljava/util/List;

    .end local v3    # "$i$f$distinctBy":I
    .end local v4    # "set$iv":Ljava/util/HashSet;
    .end local v6    # "$this$distinctBy$iv":Ljava/lang/Iterable;
    .end local v8    # "list$iv":Ljava/util/ArrayList;
    check-cast v3, Ljava/lang/Iterable;

    .line 18
    invoke-static {v3, v1}, Lkotlin/collections/CollectionsKt;->take(Ljava/lang/Iterable;I)Ljava/util/List;

    move-result-object v3

    return-object v3
.end method

.method public static synthetic filterVersions$default(Lcom/pymcl/core/version/VersionManifest;Ljava/lang/String;Ljava/util/Collection;IILjava/lang/Object;)Ljava/util/List;
    .locals 0

    .line 12
    and-int/lit8 p5, p4, 0x4

    if-eqz p5, :cond_0

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object p2

    check-cast p2, Ljava/util/Collection;

    :cond_0
    and-int/lit8 p4, p4, 0x8

    if-eqz p4, :cond_1

    const p3, 0x7fffffff

    :cond_1
    invoke-static {p0, p1, p2, p3}, Lcom/pymcl/core/version/VersionFilterKt;->filterVersions(Lcom/pymcl/core/version/VersionManifest;Ljava/lang/String;Ljava/util/Collection;I)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static final normalizeVersionTypes(Ljava/util/Collection;)Ljava/util/Set;
    .locals 11
    .param p0, "types"    # Ljava/util/Collection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    const-string v0, "types"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 34
    .local v0, "out":Ljava/util/HashSet;
    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_6

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .local v2, "raw":Ljava/lang/String;
    move-object v4, v2

    check-cast v4, Ljava/lang/CharSequence;

    invoke-static {v4}, Lkotlin/text/StringsKt;->trim(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v4

    sget-object v5, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v4, v5}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "toLowerCase(...)"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v4}, Ljava/lang/String;->hashCode()I

    move-result v6

    const-string v7, "release"

    const-string v8, "snapshot"

    const-string v9, "old_alpha"

    const-string v10, "old_beta"

    sparse-switch v6, :sswitch_data_0

    :goto_1
    goto/16 :goto_2

    :sswitch_0
    invoke-virtual {v4, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    goto :goto_1

    :sswitch_1
    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_4

    goto :goto_1

    :sswitch_2
    invoke-virtual {v4, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_2

    goto :goto_1

    :sswitch_3
    const-string v3, "snapshots"

    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_2

    goto :goto_1

    :sswitch_4
    invoke-virtual {v4, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1

    goto :goto_1

    :sswitch_5
    const-string v3, "alpha"

    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    goto :goto_1

    .line 39
    :cond_0
    move-object v3, v0

    check-cast v3, Ljava/util/Collection;

    invoke-interface {v3, v9}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 34
    :sswitch_6
    const-string v3, "\u8fdc\u53e4\u7248"

    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_5

    goto :goto_1

    :sswitch_7
    const-string v3, "\u6b63\u5f0f\u7248"

    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_4

    goto :goto_1

    :sswitch_8
    const-string v3, "beta"

    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1

    goto :goto_1

    .line 38
    :cond_1
    move-object v3, v0

    check-cast v3, Ljava/util/Collection;

    invoke-interface {v3, v10}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 34
    :sswitch_9
    const-string v3, "\u5feb\u7167"

    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_2

    goto :goto_1

    .line 37
    :cond_2
    move-object v3, v0

    check-cast v3, Ljava/util/Collection;

    invoke-interface {v3, v8}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 34
    :sswitch_a
    const-string v3, "old"

    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_5

    goto :goto_1

    :sswitch_b
    const-string v6, "all"

    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_3

    goto :goto_1

    :sswitch_c
    const-string v6, "*"

    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_3

    goto/16 :goto_1

    :sswitch_d
    const-string v6, ""

    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_3

    goto/16 :goto_1

    .line 35
    :cond_3
    return-object v3

    .line 34
    :sswitch_e
    const-string v3, "releases"

    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_4

    goto/16 :goto_1

    .line 36
    :cond_4
    move-object v3, v0

    check-cast v3, Ljava/util/Collection;

    invoke-interface {v3, v7}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 34
    :sswitch_f
    const-string v3, "legacy"

    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_5

    goto/16 :goto_1

    .line 40
    :cond_5
    move-object v3, v0

    check-cast v3, Ljava/util/Collection;

    invoke-interface {v3, v10}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move-object v3, v0

    check-cast v3, Ljava/util/Collection;

    invoke-interface {v3, v9}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 41
    :goto_2
    move-object v3, v0

    check-cast v3, Ljava/util/Collection;

    move-object v4, v2

    check-cast v4, Ljava/lang/CharSequence;

    invoke-static {v4}, Lkotlin/text/StringsKt;->trim(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v4

    sget-object v6, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v4, v6}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v3, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 43
    .end local v2    # "raw":Ljava/lang/String;
    :cond_6
    move-object v1, v0

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_7

    .line 49
    const/4 v1, 0x0

    .line 43
    .local v1, "$i$a$-ifEmpty-VersionFilterKt$normalizeVersionTypes$1":I
    nop

    .end local v1    # "$i$a$-ifEmpty-VersionFilterKt$normalizeVersionTypes$1":I
    goto :goto_3

    :cond_7
    move-object v3, v1

    :goto_3
    check-cast v3, Ljava/util/Set;

    return-object v3

    :sswitch_data_0
    .sparse-switch
        -0x41f50c37 -> :sswitch_f
        -0x20dc26b4 -> :sswitch_e
        0x0 -> :sswitch_d
        0x2a -> :sswitch_c
        0x179a1 -> :sswitch_b
        0x1ae27 -> :sswitch_a
        0xc0edc -> :sswitch_9
        0x2e15f0 -> :sswitch_8
        0x19f13bc -> :sswitch_7
        0x226a3c0 -> :sswitch_6
        0x589b15e -> :sswitch_5
        0xbd0e108 -> :sswitch_4
        0xe5fe32f -> :sswitch_3
        0x10fad5c4 -> :sswitch_2
        0x41012807 -> :sswitch_1
        0x6e404946 -> :sswitch_0
    .end sparse-switch
.end method

.method public static final versionMatches(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 6
    .param p0, "id"    # Ljava/lang/String;
    .param p1, "word"    # Ljava/lang/String;

    const-string v0, "id"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "word"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    sget-object v0, Lcom/pymcl/core/version/VersionFilterKt;->NUMERIC:Lkotlin/text/Regex;

    move-object v1, p1

    check-cast v1, Ljava/lang/CharSequence;

    invoke-virtual {v0, v1}, Lkotlin/text/Regex;->matches(Ljava/lang/CharSequence;)Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_1

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, "."

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x0

    const/4 v3, 0x2

    const/4 v4, 0x0

    invoke-static {p0, v0, v2, v3, v4}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v5, "-"

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0, v2, v3, v4}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v5, " "

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0, v2, v3, v4}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v5, "_"

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0, v2, v3, v4}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    move v1, v2

    goto :goto_0

    .line 29
    :cond_1
    move-object v0, p0

    check-cast v0, Ljava/lang/CharSequence;

    move-object v2, p1

    check-cast v2, Ljava/lang/CharSequence;

    invoke-static {v0, v2, v1}, Lkotlin/text/StringsKt;->contains(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v1

    :cond_2
    :goto_0
    return v1
.end method
