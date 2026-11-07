.class public final Lcom/pymcl/core/mods/MavenRange$Companion;
.super Ljava/lang/Object;
.source "ModConflicts.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/pymcl/core/mods/MavenRange;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nModConflicts.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModConflicts.kt\ncom/pymcl/core/mods/MavenRange$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,327:1\n1#2:328\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Lcom/pymcl/core/mods/MavenRange$Companion;",
        "",
        "<init>",
        "()V",
        "parse",
        "Lcom/pymcl/core/mods/MavenRange;",
        "spec",
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


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 60
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lcom/pymcl/core/mods/MavenRange$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final parse(Ljava/lang/String;)Lcom/pymcl/core/mods/MavenRange;
    .locals 19
    .param p1, "spec"    # Ljava/lang/String;

    move-object/from16 v0, p1

    const-string v1, "spec"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 62
    move-object v1, v0

    check-cast v1, Ljava/lang/CharSequence;

    invoke-static {v1}, Lkotlin/text/StringsKt;->trim(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    .line 63
    .local v1, "s":Ljava/lang/String;
    move-object v2, v1

    check-cast v2, Ljava/lang/CharSequence;

    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    move-result v2

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-nez v2, :cond_0

    move v2, v4

    goto :goto_0

    :cond_0
    move v2, v3

    :goto_0
    const/4 v5, 0x0

    if-nez v2, :cond_12

    const-string v2, "*"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_12

    invoke-virtual {v1, v3}, Ljava/lang/String;->charAt(I)C

    move-result v2

    const/16 v6, 0x28

    const/16 v7, 0x5b

    if-eq v2, v7, :cond_1

    invoke-virtual {v1, v3}, Ljava/lang/String;->charAt(I)C

    move-result v2

    if-eq v2, v6, :cond_1

    goto/16 :goto_b

    .line 64
    :cond_1
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    check-cast v2, Ljava/util/List;

    .line 65
    .local v2, "out":Ljava/util/List;
    const/4 v8, 0x0

    .line 66
    .local v8, "i":I
    :goto_1
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v9

    if-ge v8, v9, :cond_10

    .line 67
    :goto_2
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v9

    const/16 v10, 0x2c

    if-ge v8, v9, :cond_3

    invoke-virtual {v1, v8}, Ljava/lang/String;->charAt(I)C

    move-result v9

    if-eq v9, v10, :cond_2

    invoke-virtual {v1, v8}, Ljava/lang/String;->charAt(I)C

    move-result v9

    invoke-static {v9}, Lkotlin/text/CharsKt;->isWhitespace(C)Z

    move-result v9

    if-eqz v9, :cond_3

    :cond_2
    add-int/lit8 v8, v8, 0x1

    goto :goto_2

    .line 68
    :cond_3
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v9

    if-ge v8, v9, :cond_10

    .line 69
    invoke-virtual {v1, v8}, Ljava/lang/String;->charAt(I)C

    move-result v9

    .local v9, "open":C
    if-eq v9, v7, :cond_5

    if-ne v9, v6, :cond_4

    goto :goto_3

    :cond_4
    move v11, v3

    goto :goto_4

    :cond_5
    :goto_3
    move v11, v4

    :goto_4
    const-string v12, "\u975e\u6cd5\u7248\u672c\u533a\u95f4: "

    if-eqz v11, :cond_f

    .line 70
    move-object v13, v1

    check-cast v13, Ljava/lang/CharSequence;

    const/4 v11, 0x2

    new-array v14, v11, [C

    fill-array-data v14, :array_0

    add-int/lit8 v15, v8, 0x1

    const/16 v17, 0x4

    const/16 v18, 0x0

    const/16 v16, 0x0

    invoke-static/range {v13 .. v18}, Lkotlin/text/StringsKt;->indexOfAny$default(Ljava/lang/CharSequence;[CIZILjava/lang/Object;)I

    move-result v13

    .local v13, "end":I
    if-le v13, v8, :cond_6

    move v14, v4

    goto :goto_5

    :cond_6
    move v14, v3

    :goto_5
    if-eqz v14, :cond_e

    .line 71
    add-int/lit8 v12, v8, 0x1

    invoke-virtual {v1, v12, v13}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v12

    const-string v14, "substring(...)"

    invoke-static {v12, v14}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .local v12, "body":Ljava/lang/String;
    invoke-virtual {v1, v13}, Ljava/lang/String;->charAt(I)C

    move-result v14

    .line 72
    .local v14, "close":C
    move-object v15, v12

    check-cast v15, Ljava/lang/CharSequence;

    invoke-static {v15, v10, v3, v11, v5}, Lkotlin/text/StringsKt;->contains$default(Ljava/lang/CharSequence;CZILjava/lang/Object;)Z

    move-result v15

    if-nez v15, :cond_7

    .line 73
    move-object v10, v12

    check-cast v10, Ljava/lang/CharSequence;

    invoke-static {v10}, Lkotlin/text/StringsKt;->trim(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v10

    .local v10, "v":Ljava/lang/String;
    move-object v11, v2

    check-cast v11, Ljava/util/Collection;

    new-instance v15, Lcom/pymcl/core/mods/MavenRange$Interval;

    invoke-direct {v15, v10, v4, v10, v4}, Lcom/pymcl/core/mods/MavenRange$Interval;-><init>(Ljava/lang/String;ZLjava/lang/String;Z)V

    invoke-interface {v11, v15}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_a

    .line 75
    .end local v10    # "v":Ljava/lang/String;
    :cond_7
    invoke-static {v12, v10, v5, v11, v5}, Lkotlin/text/StringsKt;->substringBefore$default(Ljava/lang/String;CLjava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v15

    check-cast v15, Ljava/lang/CharSequence;

    invoke-static {v15}, Lkotlin/text/StringsKt;->trim(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v15

    invoke-virtual {v15}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v15

    check-cast v15, Ljava/lang/CharSequence;

    invoke-interface {v15}, Ljava/lang/CharSequence;->length()I

    move-result v16

    if-nez v16, :cond_8

    move/from16 v16, v4

    goto :goto_6

    :cond_8
    move/from16 v16, v3

    :goto_6
    if-eqz v16, :cond_9

    .line 328
    const/4 v15, 0x0

    .line 75
    .local v15, "$i$a$-ifEmpty-MavenRange$Companion$parse$lo$1":I
    move-object v15, v5

    .end local v15    # "$i$a$-ifEmpty-MavenRange$Companion$parse$lo$1":I
    :cond_9
    check-cast v15, Ljava/lang/String;

    .local v15, "lo":Ljava/lang/String;
    invoke-static {v12, v10, v5, v11, v5}, Lkotlin/text/StringsKt;->substringAfter$default(Ljava/lang/String;CLjava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v10

    check-cast v10, Ljava/lang/CharSequence;

    invoke-static {v10}, Lkotlin/text/StringsKt;->trim(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v10

    check-cast v10, Ljava/lang/CharSequence;

    invoke-interface {v10}, Ljava/lang/CharSequence;->length()I

    move-result v11

    if-nez v11, :cond_a

    move v11, v4

    goto :goto_7

    :cond_a
    move v11, v3

    :goto_7
    if-eqz v11, :cond_b

    .line 328
    const/4 v10, 0x0

    .line 75
    .local v10, "$i$a$-ifEmpty-MavenRange$Companion$parse$hi$1":I
    move-object v10, v5

    .end local v10    # "$i$a$-ifEmpty-MavenRange$Companion$parse$hi$1":I
    :cond_b
    check-cast v10, Ljava/lang/String;

    .line 76
    .local v10, "hi":Ljava/lang/String;
    move-object v11, v2

    check-cast v11, Ljava/util/Collection;

    new-instance v3, Lcom/pymcl/core/mods/MavenRange$Interval;

    if-ne v9, v7, :cond_c

    goto :goto_8

    :cond_c
    const/4 v4, 0x0

    :goto_8
    const/16 v6, 0x5d

    if-ne v14, v6, :cond_d

    const/4 v6, 0x1

    goto :goto_9

    :cond_d
    const/4 v6, 0x0

    :goto_9
    invoke-direct {v3, v15, v4, v10, v6}, Lcom/pymcl/core/mods/MavenRange$Interval;-><init>(Ljava/lang/String;ZLjava/lang/String;Z)V

    invoke-interface {v11, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 78
    .end local v10    # "hi":Ljava/lang/String;
    .end local v15    # "lo":Ljava/lang/String;
    :goto_a
    add-int/lit8 v8, v13, 0x1

    const/4 v3, 0x0

    const/4 v4, 0x1

    const/16 v6, 0x28

    .end local v9    # "open":C
    .end local v12    # "body":Ljava/lang/String;
    .end local v13    # "end":I
    .end local v14    # "close":C
    goto/16 :goto_1

    .line 328
    .restart local v9    # "open":C
    .restart local v13    # "end":I
    :cond_e
    const/4 v3, 0x0

    .line 70
    .local v3, "$i$a$-require-MavenRange$Companion$parse$2":I
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .end local v3    # "$i$a$-require-MavenRange$Companion$parse$2":I
    new-instance v4, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v4, v3}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v4

    .line 328
    .end local v13    # "end":I
    :cond_f
    const/4 v3, 0x0

    .line 69
    .local v3, "$i$a$-require-MavenRange$Companion$parse$1":I
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .end local v3    # "$i$a$-require-MavenRange$Companion$parse$1":I
    new-instance v4, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v4, v3}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v4

    .line 80
    .end local v9    # "open":C
    :cond_10
    move-object v3, v2

    check-cast v3, Ljava/util/Collection;

    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_11

    .line 328
    const/4 v3, 0x0

    .line 80
    .local v3, "$i$a$-ifEmpty-MavenRange$Companion$parse$3":I
    move-object v3, v5

    .end local v3    # "$i$a$-ifEmpty-MavenRange$Companion$parse$3":I
    :cond_11
    check-cast v3, Ljava/util/List;

    new-instance v4, Lcom/pymcl/core/mods/MavenRange;

    invoke-direct {v4, v3, v5}, Lcom/pymcl/core/mods/MavenRange;-><init>(Ljava/util/List;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v4

    .line 63
    .end local v2    # "out":Ljava/util/List;
    .end local v8    # "i":I
    :cond_12
    :goto_b
    new-instance v2, Lcom/pymcl/core/mods/MavenRange;

    invoke-direct {v2, v5, v5}, Lcom/pymcl/core/mods/MavenRange;-><init>(Ljava/util/List;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v2

    :array_0
    .array-data 2
        0x5ds
        0x29s
    .end array-data
.end method
