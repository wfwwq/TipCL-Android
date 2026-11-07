.class public final Lcom/pymcl/core/mods/ModVersion;
.super Ljava/lang/Object;
.source "ModConflicts.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nModConflicts.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModConflicts.kt\ncom/pymcl/core/mods/ModVersion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,327:1\n1#2:328\n654#3,5:329\n*S KotlinDebug\n*F\n+ 1 ModConflicts.kt\ncom/pymcl/core/mods/ModVersion\n*L\n37#1:329,5\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0008\u0002\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\u0007J$\u0010\t\u001a\u00020\u00052\u000c\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u000b2\u000c\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u000bH\u0002\u00a8\u0006\r"
    }
    d2 = {
        "Lcom/pymcl/core/mods/ModVersion;",
        "",
        "<init>",
        "()V",
        "compare",
        "",
        "a",
        "",
        "b",
        "cmpParts",
        "x",
        "",
        "y",
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
.field public static final INSTANCE:Lcom/pymcl/core/mods/ModVersion;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/pymcl/core/mods/ModVersion;

    invoke-direct {v0}, Lcom/pymcl/core/mods/ModVersion;-><init>()V

    sput-object v0, Lcom/pymcl/core/mods/ModVersion;->INSTANCE:Lcom/pymcl/core/mods/ModVersion;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final cmpParts(Ljava/util/List;Ljava/util/List;)I
    .locals 19
    .param p1, "x"    # Ljava/util/List;
    .param p2, "y"    # Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)I"
        }
    .end annotation

    .line 30
    const/4 v0, 0x0

    .local v0, "i":I
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->size()I

    move-result v1

    invoke-interface/range {p2 .. p2}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    move-result v1

    :goto_0
    const/4 v2, 0x0

    if-ge v0, v1, :cond_b

    .line 31
    const/4 v3, 0x1

    if-ltz v0, :cond_0

    invoke-interface/range {p1 .. p1}, Ljava/util/List;->size()I

    move-result v4

    if-ge v0, v4, :cond_0

    move v4, v3

    goto :goto_1

    :cond_0
    move v4, v2

    :goto_1
    const-string v5, "0"

    if-eqz v4, :cond_1

    move-object/from16 v4, p1

    invoke-interface {v4, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    goto :goto_2

    :cond_1
    move-object/from16 v4, p1

    move v6, v0

    .line 328
    .local v6, "it":I
    const/4 v7, 0x0

    .line 31
    .local v7, "$i$a$-getOrElse-ModVersion$cmpParts$p$1":I
    move-object v6, v5

    .end local v6    # "it":I
    .end local v7    # "$i$a$-getOrElse-ModVersion$cmpParts$p$1":I
    :goto_2
    check-cast v6, Ljava/lang/String;

    .local v6, "p":Ljava/lang/String;
    if-ltz v0, :cond_2

    invoke-interface/range {p2 .. p2}, Ljava/util/List;->size()I

    move-result v7

    if-ge v0, v7, :cond_2

    move v7, v3

    goto :goto_3

    :cond_2
    move v7, v2

    :goto_3
    if-eqz v7, :cond_3

    move-object/from16 v7, p2

    invoke-interface {v7, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    goto :goto_4

    :cond_3
    move-object/from16 v7, p2

    move v8, v0

    .line 328
    .local v8, "it":I
    const/4 v9, 0x0

    .line 31
    .local v9, "$i$a$-getOrElse-ModVersion$cmpParts$q$1":I
    nop

    .end local v8    # "it":I
    .end local v9    # "$i$a$-getOrElse-ModVersion$cmpParts$q$1":I
    :goto_4
    check-cast v5, Ljava/lang/String;

    .line 32
    .local v5, "q":Ljava/lang/String;
    invoke-static {v6}, Lkotlin/text/StringsKt;->toLongOrNull(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v8

    .local v8, "pn":Ljava/lang/Long;
    invoke-static {v5}, Lkotlin/text/StringsKt;->toLongOrNull(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v9

    .line 33
    .local v9, "qn":Ljava/lang/Long;
    nop

    .line 34
    if-eqz v8, :cond_4

    if-eqz v9, :cond_4

    invoke-virtual {v8}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    invoke-virtual {v9}, Ljava/lang/Long;->longValue()J

    move-result-wide v10

    invoke-static {v2, v3, v10, v11}, Lkotlin/jvm/internal/Intrinsics;->compare(JJ)I

    move-result v2

    goto/16 :goto_a

    .line 37
    :cond_4
    move-object v10, v6

    .local v10, "$this$takeWhile$iv":Ljava/lang/String;
    const/4 v11, 0x0

    .line 329
    .local v11, "$i$f$takeWhile":I
    const/4 v12, 0x0

    .local v12, "index$iv":I
    invoke-virtual {v10}, Ljava/lang/String;->length()I

    move-result v13

    :goto_5
    const-string v14, "substring(...)"

    if-ge v12, v13, :cond_6

    .line 330
    invoke-virtual {v10, v12}, Ljava/lang/String;->charAt(I)C

    move-result v15

    .local v15, "it":C
    const/16 v16, 0x0

    .line 37
    .local v16, "$i$a$-takeWhile-ModVersion$cmpParts$c$pd$1":I
    invoke-static {v15}, Ljava/lang/Character;->isDigit(C)Z

    move-result v17

    .line 330
    .end local v15    # "it":C
    .end local v16    # "$i$a$-takeWhile-ModVersion$cmpParts$c$pd$1":I
    if-nez v17, :cond_5

    .line 331
    invoke-virtual {v10, v2, v12}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v13

    invoke-static {v13, v14}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v10, v13

    goto :goto_6

    .line 329
    :cond_5
    add-int/lit8 v12, v12, 0x1

    goto :goto_5

    .line 333
    .end local v12    # "index$iv":I
    :cond_6
    nop

    .line 37
    .end local v10    # "$this$takeWhile$iv":Ljava/lang/String;
    .end local v11    # "$i$f$takeWhile":I
    :goto_6
    invoke-static {v10}, Lkotlin/text/StringsKt;->toLongOrNull(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v10

    .local v10, "pd":Ljava/lang/Long;
    move-object v11, v5

    .local v11, "$this$takeWhile$iv":Ljava/lang/String;
    const/4 v12, 0x0

    .line 329
    .local v12, "$i$f$takeWhile":I
    const/4 v13, 0x0

    .local v13, "index$iv":I
    invoke-virtual {v11}, Ljava/lang/String;->length()I

    move-result v15

    :goto_7
    if-ge v13, v15, :cond_8

    .line 330
    invoke-virtual {v11, v13}, Ljava/lang/String;->charAt(I)C

    move-result v16

    .local v16, "it":C
    const/16 v17, 0x0

    .line 37
    .local v17, "$i$a$-takeWhile-ModVersion$cmpParts$c$qd$1":I
    invoke-static/range {v16 .. v16}, Ljava/lang/Character;->isDigit(C)Z

    move-result v18

    .line 330
    .end local v16    # "it":C
    .end local v17    # "$i$a$-takeWhile-ModVersion$cmpParts$c$qd$1":I
    if-nez v18, :cond_7

    .line 331
    invoke-virtual {v11, v2, v13}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v14}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v11, v2

    goto :goto_8

    .line 329
    :cond_7
    add-int/lit8 v13, v13, 0x1

    goto :goto_7

    .line 333
    .end local v13    # "index$iv":I
    :cond_8
    nop

    .line 37
    .end local v11    # "$this$takeWhile$iv":Ljava/lang/String;
    .end local v12    # "$i$f$takeWhile":I
    :goto_8
    invoke-static {v11}, Lkotlin/text/StringsKt;->toLongOrNull(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v2

    .line 38
    .local v2, "qd":Ljava/lang/Long;
    if-eqz v10, :cond_9

    if-eqz v2, :cond_9

    invoke-static {v10, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_9

    invoke-virtual {v10}, Ljava/lang/Long;->longValue()J

    move-result-wide v11

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v13

    invoke-static {v11, v12, v13, v14}, Lkotlin/jvm/internal/Intrinsics;->compare(JJ)I

    move-result v3

    goto :goto_9

    :cond_9
    invoke-static {v6, v5, v3}, Lkotlin/text/StringsKt;->compareTo(Ljava/lang/String;Ljava/lang/String;Z)I

    move-result v3

    :goto_9
    move v2, v3

    .line 33
    .end local v2    # "qd":Ljava/lang/Long;
    .end local v10    # "pd":Ljava/lang/Long;
    :goto_a
    nop

    .line 41
    .local v2, "c":I
    if-eqz v2, :cond_a

    return v2

    .line 30
    .end local v2    # "c":I
    .end local v5    # "q":Ljava/lang/String;
    .end local v6    # "p":Ljava/lang/String;
    .end local v8    # "pn":Ljava/lang/Long;
    .end local v9    # "qn":Ljava/lang/Long;
    :cond_a
    add-int/lit8 v0, v0, 0x1

    goto/16 :goto_0

    :cond_b
    move-object/from16 v4, p1

    move-object/from16 v7, p2

    .line 43
    .end local v0    # "i":I
    return v2
.end method

.method private static final compare$norm(Ljava/lang/String;)Ljava/lang/String;
    .locals 4
    .param p0, "s"    # Ljava/lang/String;

    .line 19
    move-object v0, p0

    check-cast v0, Ljava/lang/CharSequence;

    invoke-static {v0}, Lkotlin/text/StringsKt;->trim(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "v"

    check-cast v1, Ljava/lang/CharSequence;

    invoke-static {v0, v1}, Lkotlin/text/StringsKt;->removePrefix(Ljava/lang/String;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "V"

    check-cast v1, Ljava/lang/CharSequence;

    invoke-static {v0, v1}, Lkotlin/text/StringsKt;->removePrefix(Ljava/lang/String;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x2

    const/16 v3, 0x2b

    invoke-static {v0, v3, v1, v2, v1}, Lkotlin/text/StringsKt;->substringBefore$default(Ljava/lang/String;CLjava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final compare(Ljava/lang/String;Ljava/lang/String;)I
    .locals 13
    .param p1, "a"    # Ljava/lang/String;
    .param p2, "b"    # Ljava/lang/String;

    const-string v0, "a"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "b"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    invoke-static {p1}, Lcom/pymcl/core/mods/ModVersion;->compare$norm(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 328
    .local v0, "s":Ljava/lang/String;
    const/4 v1, 0x0

    .line 20
    .local v1, "$i$a$-let-ModVersion$compare$1":I
    move-object v2, v0

    check-cast v2, Ljava/lang/CharSequence;

    const/4 v6, 0x6

    const/4 v7, 0x0

    const/16 v3, 0x2d

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v2 .. v7}, Lkotlin/text/StringsKt;->indexOf$default(Ljava/lang/CharSequence;CIZILjava/lang/Object;)I

    move-result v2

    .local v2, "i":I
    const-string v3, ""

    const-string v4, "substring(...)"

    if-gez v2, :cond_0

    invoke-static {v0, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v6

    goto :goto_0

    :cond_0
    invoke-virtual {v0, v5, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    add-int/lit8 v7, v2, 0x1

    invoke-virtual {v0, v7}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v6, v7}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v6

    .end local v0    # "s":Ljava/lang/String;
    .end local v1    # "$i$a$-let-ModVersion$compare$1":I
    .end local v2    # "i":I
    :goto_0
    invoke-virtual {v6}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .local v0, "am":Ljava/lang/String;
    invoke-virtual {v6}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 21
    .local v1, "ap":Ljava/lang/String;
    invoke-static {p2}, Lcom/pymcl/core/mods/ModVersion;->compare$norm(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 328
    .local v2, "s":Ljava/lang/String;
    const/4 v6, 0x0

    .line 21
    .local v6, "$i$a$-let-ModVersion$compare$2":I
    move-object v7, v2

    check-cast v7, Ljava/lang/CharSequence;

    const/4 v11, 0x6

    const/4 v12, 0x0

    const/16 v8, 0x2d

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-static/range {v7 .. v12}, Lkotlin/text/StringsKt;->indexOf$default(Ljava/lang/CharSequence;CIZILjava/lang/Object;)I

    move-result v7

    .local v7, "i":I
    if-gez v7, :cond_1

    invoke-static {v2, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    goto :goto_1

    :cond_1
    invoke-virtual {v2, v5, v7}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    add-int/lit8 v8, v7, 0x1

    invoke-virtual {v2, v8}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v3, v8}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    .end local v2    # "s":Ljava/lang/String;
    .end local v6    # "$i$a$-let-ModVersion$compare$2":I
    .end local v7    # "i":I
    :goto_1
    invoke-virtual {v3}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .local v2, "bm":Ljava/lang/String;
    invoke-virtual {v3}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    .line 22
    .local v3, "bp":Ljava/lang/String;
    move-object v6, v0

    check-cast v6, Ljava/lang/CharSequence;

    const/4 v4, 0x2

    new-array v7, v4, [C

    fill-array-data v7, :array_0

    const/4 v10, 0x6

    const/4 v11, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-static/range {v6 .. v11}, Lkotlin/text/StringsKt;->split$default(Ljava/lang/CharSequence;[CZIILjava/lang/Object;)Ljava/util/List;

    move-result-object v6

    move-object v7, v2

    check-cast v7, Ljava/lang/CharSequence;

    new-array v8, v4, [C

    fill-array-data v8, :array_1

    const/4 v11, 0x6

    const/4 v12, 0x0

    const/4 v10, 0x0

    invoke-static/range {v7 .. v12}, Lkotlin/text/StringsKt;->split$default(Ljava/lang/CharSequence;[CZIILjava/lang/Object;)Ljava/util/List;

    move-result-object v7

    invoke-direct {p0, v6, v7}, Lcom/pymcl/core/mods/ModVersion;->cmpParts(Ljava/util/List;Ljava/util/List;)I

    move-result v6

    .line 23
    .local v6, "c":I
    if-eqz v6, :cond_2

    return v6

    .line 24
    :cond_2
    move-object v7, v1

    check-cast v7, Ljava/lang/CharSequence;

    invoke-interface {v7}, Ljava/lang/CharSequence;->length()I

    move-result v7

    const/4 v8, 0x1

    if-nez v7, :cond_3

    move v7, v8

    goto :goto_2

    :cond_3
    move v7, v5

    :goto_2
    if-eqz v7, :cond_5

    move-object v7, v3

    check-cast v7, Ljava/lang/CharSequence;

    invoke-interface {v7}, Ljava/lang/CharSequence;->length()I

    move-result v7

    if-nez v7, :cond_4

    move v7, v8

    goto :goto_3

    :cond_4
    move v7, v5

    :goto_3
    if-eqz v7, :cond_5

    return v5

    .line 25
    :cond_5
    move-object v7, v1

    check-cast v7, Ljava/lang/CharSequence;

    invoke-interface {v7}, Ljava/lang/CharSequence;->length()I

    move-result v7

    if-nez v7, :cond_6

    move v7, v8

    goto :goto_4

    :cond_6
    move v7, v5

    :goto_4
    if-eqz v7, :cond_7

    return v8

    .line 26
    :cond_7
    move-object v7, v3

    check-cast v7, Ljava/lang/CharSequence;

    invoke-interface {v7}, Ljava/lang/CharSequence;->length()I

    move-result v7

    if-nez v7, :cond_8

    move v5, v8

    :cond_8
    if-eqz v5, :cond_9

    const/4 v4, -0x1

    return v4

    .line 27
    :cond_9
    move-object v7, v1

    check-cast v7, Ljava/lang/CharSequence;

    new-array v8, v4, [C

    fill-array-data v8, :array_2

    const/4 v11, 0x6

    const/4 v12, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-static/range {v7 .. v12}, Lkotlin/text/StringsKt;->split$default(Ljava/lang/CharSequence;[CZIILjava/lang/Object;)Ljava/util/List;

    move-result-object v5

    move-object v7, v3

    check-cast v7, Ljava/lang/CharSequence;

    new-array v8, v4, [C

    fill-array-data v8, :array_3

    invoke-static/range {v7 .. v12}, Lkotlin/text/StringsKt;->split$default(Ljava/lang/CharSequence;[CZIILjava/lang/Object;)Ljava/util/List;

    move-result-object v4

    invoke-direct {p0, v5, v4}, Lcom/pymcl/core/mods/ModVersion;->cmpParts(Ljava/util/List;Ljava/util/List;)I

    move-result v4

    return v4

    nop

    :array_0
    .array-data 2
        0x2es
        0x5fs
    .end array-data

    :array_1
    .array-data 2
        0x2es
        0x5fs
    .end array-data

    :array_2
    .array-data 2
        0x2es
        0x2ds
    .end array-data

    :array_3
    .array-data 2
        0x2es
        0x2ds
    .end array-data
.end method
