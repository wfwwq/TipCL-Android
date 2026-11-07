.class final Lcom/pymcl/core/util/Json$Parser;
.super Ljava/lang/Object;
.source "Json.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/pymcl/core/util/Json;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "Parser"
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nJson.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Json.kt\ncom/pymcl/core/util/Json$Parser\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,94:1\n1#2:95\n1107#3,2:96\n*S KotlinDebug\n*F\n+ 1 Json.kt\ncom/pymcl/core/util/Json$Parser\n*L\n68#1:96,2\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0010\u0008\n\u0002\u0008\u0005\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000c\n\u0002\u0008\u0006\u0008\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0006\u0010\u000e\u001a\u00020\u000fJ\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u0001J\u000e\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0013J\u001a\u0010\u0014\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0015\u001a\u00020\u00032\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u0001J\u0006\u0010\u0017\u001a\u00020\u0001J\u0006\u0010\u0018\u001a\u00020\u0003R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007R\u001a\u0010\u0008\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\n\u0010\u000b\"\u0004\u0008\u000c\u0010\r\u00a8\u0006\u0019"
    }
    d2 = {
        "Lcom/pymcl/core/util/Json$Parser;",
        "",
        "s",
        "",
        "<init>",
        "(Ljava/lang/String;)V",
        "getS",
        "()Ljava/lang/String;",
        "i",
        "",
        "getI",
        "()I",
        "setI",
        "(I)V",
        "ws",
        "",
        "value",
        "expect",
        "c",
        "",
        "lit",
        "w",
        "v",
        "number",
        "string",
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


# instance fields
.field private i:I

.field private final s:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1
    .param p1, "s"    # Ljava/lang/String;

    const-string v0, "s"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 49
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/pymcl/core/util/Json$Parser;->s:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final expect(C)V
    .locals 4
    .param p1, "c"    # C

    .line 65
    iget v0, p0, Lcom/pymcl/core/util/Json$Parser;->i:I

    iget-object v1, p0, Lcom/pymcl/core/util/Json$Parser;->s:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v2, 0x1

    if-ge v0, v1, :cond_0

    iget-object v0, p0, Lcom/pymcl/core/util/Json$Parser;->s:Ljava/lang/String;

    iget v1, p0, Lcom/pymcl/core/util/Json$Parser;->i:I

    invoke-virtual {v0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v0

    if-ne v0, p1, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    iget v0, p0, Lcom/pymcl/core/util/Json$Parser;->i:I

    add-int/2addr v0, v2

    iput v0, p0, Lcom/pymcl/core/util/Json$Parser;->i:I

    return-void

    .line 95
    :cond_1
    const/4 v0, 0x0

    .line 65
    .local v0, "$i$a$-require-Json$Parser$expect$1":I
    iget v1, p0, Lcom/pymcl/core/util/Json$Parser;->i:I

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "JSON \u671f\u671b \'"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "\' @"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .end local v0    # "$i$a$-require-Json$Parser$expect$1":I
    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public final getI()I
    .locals 1

    .line 50
    iget v0, p0, Lcom/pymcl/core/util/Json$Parser;->i:I

    return v0
.end method

.method public final getS()Ljava/lang/String;
    .locals 1

    .line 49
    iget-object v0, p0, Lcom/pymcl/core/util/Json$Parser;->s:Ljava/lang/String;

    return-object v0
.end method

.method public final lit(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7
    .param p1, "w"    # Ljava/lang/String;
    .param p2, "v"    # Ljava/lang/Object;

    const-string v0, "w"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 66
    iget-object v1, p0, Lcom/pymcl/core/util/Json$Parser;->s:Ljava/lang/String;

    iget v3, p0, Lcom/pymcl/core/util/Json$Parser;->i:I

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v2, p1

    .end local p1    # "w":Ljava/lang/String;
    .local v2, "w":Ljava/lang/String;
    invoke-static/range {v1 .. v6}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;IZILjava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget p1, p0, Lcom/pymcl/core/util/Json$Parser;->i:I

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v0

    add-int/2addr p1, v0

    iput p1, p0, Lcom/pymcl/core/util/Json$Parser;->i:I

    return-object p2

    .line 95
    :cond_0
    const/4 p1, 0x0

    .line 66
    .local p1, "$i$a$-require-Json$Parser$lit$1":I
    iget v0, p0, Lcom/pymcl/core/util/Json$Parser;->i:I

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "JSON \u975e\u6cd5\u5b57\u9762\u91cf @"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .end local p1    # "$i$a$-require-Json$Parser$lit$1":I
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final number()Ljava/lang/Object;
    .locals 13

    .line 67
    iget v0, p0, Lcom/pymcl/core/util/Json$Parser;->i:I

    .local v0, "st":I
    iget v1, p0, Lcom/pymcl/core/util/Json$Parser;->i:I

    const/4 v2, 0x1

    :goto_0
    add-int/2addr v1, v2

    iput v1, p0, Lcom/pymcl/core/util/Json$Parser;->i:I

    iget v1, p0, Lcom/pymcl/core/util/Json$Parser;->i:I

    iget-object v3, p0, Lcom/pymcl/core/util/Json$Parser;->s:Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    const/4 v4, 0x0

    const/4 v5, 0x2

    const/4 v6, 0x0

    if-ge v1, v3, :cond_1

    iget-object v1, p0, Lcom/pymcl/core/util/Json$Parser;->s:Ljava/lang/String;

    iget v3, p0, Lcom/pymcl/core/util/Json$Parser;->i:I

    invoke-virtual {v1, v3}, Ljava/lang/String;->charAt(I)C

    move-result v1

    invoke-static {v1}, Ljava/lang/Character;->isDigit(C)Z

    move-result v1

    if-nez v1, :cond_0

    const-string v1, ".eE+-"

    check-cast v1, Ljava/lang/CharSequence;

    iget-object v3, p0, Lcom/pymcl/core/util/Json$Parser;->s:Ljava/lang/String;

    iget v7, p0, Lcom/pymcl/core/util/Json$Parser;->i:I

    invoke-virtual {v3, v7}, Ljava/lang/String;->charAt(I)C

    move-result v3

    invoke-static {v1, v3, v6, v5, v4}, Lkotlin/text/StringsKt;->contains$default(Ljava/lang/CharSequence;CZILjava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    :cond_0
    iget v1, p0, Lcom/pymcl/core/util/Json$Parser;->i:I

    goto :goto_0

    .line 68
    :cond_1
    iget-object v1, p0, Lcom/pymcl/core/util/Json$Parser;->s:Ljava/lang/String;

    iget v3, p0, Lcom/pymcl/core/util/Json$Parser;->i:I

    invoke-virtual {v1, v0, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    const-string v3, "substring(...)"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .local v1, "t":Ljava/lang/String;
    move-object v3, v1

    check-cast v3, Ljava/lang/CharSequence;

    .local v3, "$this$any$iv":Ljava/lang/CharSequence;
    const/4 v7, 0x0

    .line 96
    .local v7, "$i$f$any":I
    move v8, v6

    :goto_1
    invoke-interface {v3}, Ljava/lang/CharSequence;->length()I

    move-result v9

    if-ge v8, v9, :cond_3

    invoke-interface {v3, v8}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v9

    .local v9, "element$iv":C
    move v10, v9

    .local v10, "it":C
    const/4 v11, 0x0

    .line 68
    .local v11, "$i$a$-any-Json$Parser$number$1":I
    const-string v12, ".eE"

    check-cast v12, Ljava/lang/CharSequence;

    invoke-static {v12, v10, v6, v5, v4}, Lkotlin/text/StringsKt;->contains$default(Ljava/lang/CharSequence;CZILjava/lang/Object;)Z

    move-result v10

    .line 96
    .end local v10    # "it":C
    .end local v11    # "$i$a$-any-Json$Parser$number$1":I
    if-eqz v10, :cond_2

    goto :goto_2

    .end local v9    # "element$iv":C
    :cond_2
    add-int/lit8 v8, v8, 0x1

    goto :goto_1

    .line 97
    :cond_3
    move v2, v6

    .line 68
    .end local v3    # "$this$any$iv":Ljava/lang/CharSequence;
    .end local v7    # "$i$f$any":I
    :goto_2
    if-eqz v2, :cond_4

    :goto_3
    invoke-static {v1}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    goto :goto_4

    :cond_4
    invoke-static {v1}, Lkotlin/text/StringsKt;->toLongOrNull(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v2

    if-nez v2, :cond_5

    goto :goto_3

    :cond_5
    :goto_4
    return-object v2
.end method

.method public final setI(I)V
    .locals 0
    .param p1, "<set-?>"    # I

    .line 50
    iput p1, p0, Lcom/pymcl/core/util/Json$Parser;->i:I

    return-void
.end method

.method public final string()Ljava/lang/String;
    .locals 6

    .line 70
    const/16 v0, 0x22

    invoke-virtual {p0, v0}, Lcom/pymcl/core/util/Json$Parser;->expect(C)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 71
    .local v0, "sb":Ljava/lang/StringBuilder;
    :goto_0
    iget-object v1, p0, Lcom/pymcl/core/util/Json$Parser;->s:Ljava/lang/String;

    iget v2, p0, Lcom/pymcl/core/util/Json$Parser;->i:I

    add-int/lit8 v3, v2, 0x1

    iput v3, p0, Lcom/pymcl/core/util/Json$Parser;->i:I

    invoke-virtual {v1, v2}, Ljava/lang/String;->charAt(I)C

    move-result v1

    .line 72
    .local v1, "c":C
    sparse-switch v1, :sswitch_data_0

    .line 75
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_2

    .line 73
    :sswitch_0
    iget-object v2, p0, Lcom/pymcl/core/util/Json$Parser;->s:Ljava/lang/String;

    iget v3, p0, Lcom/pymcl/core/util/Json$Parser;->i:I

    add-int/lit8 v4, v3, 0x1

    iput v4, p0, Lcom/pymcl/core/util/Json$Parser;->i:I

    invoke-virtual {v2, v3}, Ljava/lang/String;->charAt(I)C

    move-result v2

    .local v2, "e":C
    sparse-switch v2, :sswitch_data_1

    .line 74
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .end local v2    # "e":C
    goto :goto_2

    .restart local v2    # "e":C
    :sswitch_1
    iget-object v3, p0, Lcom/pymcl/core/util/Json$Parser;->s:Ljava/lang/String;

    iget v4, p0, Lcom/pymcl/core/util/Json$Parser;->i:I

    iget v5, p0, Lcom/pymcl/core/util/Json$Parser;->i:I

    add-int/lit8 v5, v5, 0x4

    invoke-virtual {v3, v4, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v3

    const-string v4, "substring(...)"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v4, 0x10

    invoke-static {v4}, Lkotlin/text/CharsKt;->checkRadix(I)I

    move-result v4

    invoke-static {v3, v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v3

    int-to-char v3, v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget v3, p0, Lcom/pymcl/core/util/Json$Parser;->i:I

    add-int/lit8 v3, v3, 0x4

    iput v3, p0, Lcom/pymcl/core/util/Json$Parser;->i:I

    sget-object v3, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    goto :goto_2

    .line 73
    :sswitch_2
    const/16 v3, 0x9

    goto :goto_1

    :sswitch_3
    const/16 v3, 0xd

    goto :goto_1

    :sswitch_4
    const/16 v3, 0xa

    goto :goto_1

    :sswitch_5
    const/16 v3, 0xc

    goto :goto_1

    :sswitch_6
    const/16 v3, 0x8

    :goto_1
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_2

    .line 72
    .end local v2    # "e":C
    :sswitch_7
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v3, "toString(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v2

    .line 75
    :goto_2
    goto :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        0x22 -> :sswitch_7
        0x5c -> :sswitch_0
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x62 -> :sswitch_6
        0x66 -> :sswitch_5
        0x6e -> :sswitch_4
        0x72 -> :sswitch_3
        0x74 -> :sswitch_2
        0x75 -> :sswitch_1
    .end sparse-switch
.end method

.method public final value()Ljava/lang/Object;
    .locals 8

    .line 53
    invoke-virtual {p0}, Lcom/pymcl/core/util/Json$Parser;->ws()V

    iget v0, p0, Lcom/pymcl/core/util/Json$Parser;->i:I

    iget-object v1, p0, Lcom/pymcl/core/util/Json$Parser;->s:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-ge v0, v1, :cond_0

    move v0, v3

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    if-eqz v0, :cond_7

    .line 54
    iget-object v0, p0, Lcom/pymcl/core/util/Json$Parser;->s:Ljava/lang/String;

    iget v1, p0, Lcom/pymcl/core/util/Json$Parser;->i:I

    invoke-virtual {v0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v0

    .local v0, "c":C
    const/16 v1, 0x2c

    sparse-switch v0, :sswitch_data_0

    .line 62
    const/16 v1, 0x2d

    if-eq v0, v1, :cond_6

    invoke-static {v0}, Ljava/lang/Character;->isDigit(C)Z

    move-result v1

    if-eqz v1, :cond_5

    goto/16 :goto_4

    .line 55
    :sswitch_0
    iget v2, p0, Lcom/pymcl/core/util/Json$Parser;->i:I

    add-int/2addr v2, v3

    iput v2, p0, Lcom/pymcl/core/util/Json$Parser;->i:I

    new-instance v2, Ljava/util/LinkedHashMap;

    invoke-direct {v2}, Ljava/util/LinkedHashMap;-><init>()V

    .local v2, "m":Ljava/util/LinkedHashMap;
    invoke-virtual {p0}, Lcom/pymcl/core/util/Json$Parser;->ws()V

    iget-object v4, p0, Lcom/pymcl/core/util/Json$Parser;->s:Ljava/lang/String;

    iget v5, p0, Lcom/pymcl/core/util/Json$Parser;->i:I

    invoke-virtual {v4, v5}, Ljava/lang/String;->charAt(I)C

    move-result v4

    const/16 v5, 0x7d

    if-ne v4, v5, :cond_1

    iget v1, p0, Lcom/pymcl/core/util/Json$Parser;->i:I

    add-int/2addr v1, v3

    iput v1, p0, Lcom/pymcl/core/util/Json$Parser;->i:I

    return-object v2

    .line 56
    :cond_1
    :goto_1
    invoke-virtual {p0}, Lcom/pymcl/core/util/Json$Parser;->ws()V

    invoke-virtual {p0}, Lcom/pymcl/core/util/Json$Parser;->string()Ljava/lang/String;

    move-result-object v4

    .local v4, "k":Ljava/lang/String;
    invoke-virtual {p0}, Lcom/pymcl/core/util/Json$Parser;->ws()V

    const/16 v6, 0x3a

    invoke-virtual {p0, v6}, Lcom/pymcl/core/util/Json$Parser;->expect(C)V

    move-object v6, v2

    check-cast v6, Ljava/util/Map;

    invoke-virtual {p0}, Lcom/pymcl/core/util/Json$Parser;->value()Ljava/lang/Object;

    move-result-object v7

    invoke-interface {v6, v4, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Lcom/pymcl/core/util/Json$Parser;->ws()V

    iget-object v6, p0, Lcom/pymcl/core/util/Json$Parser;->s:Ljava/lang/String;

    iget v7, p0, Lcom/pymcl/core/util/Json$Parser;->i:I

    invoke-virtual {v6, v7}, Ljava/lang/String;->charAt(I)C

    move-result v6

    if-ne v6, v1, :cond_2

    iget v6, p0, Lcom/pymcl/core/util/Json$Parser;->i:I

    add-int/2addr v6, v3

    iput v6, p0, Lcom/pymcl/core/util/Json$Parser;->i:I

    goto :goto_1

    :cond_2
    invoke-virtual {p0, v5}, Lcom/pymcl/core/util/Json$Parser;->expect(C)V

    return-object v2

    .line 60
    .end local v2    # "m":Ljava/util/LinkedHashMap;
    .end local v4    # "k":Ljava/lang/String;
    :sswitch_1
    const-string v1, "true"

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    goto :goto_2

    :sswitch_2
    const-string v1, "null"

    const/4 v2, 0x0

    goto :goto_2

    :sswitch_3
    const-string v1, "false"

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    :goto_2
    invoke-virtual {p0, v1, v2}, Lcom/pymcl/core/util/Json$Parser;->lit(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    goto/16 :goto_5

    .line 57
    :sswitch_4
    iget v2, p0, Lcom/pymcl/core/util/Json$Parser;->i:I

    add-int/2addr v2, v3

    iput v2, p0, Lcom/pymcl/core/util/Json$Parser;->i:I

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .local v2, "l":Ljava/util/ArrayList;
    invoke-virtual {p0}, Lcom/pymcl/core/util/Json$Parser;->ws()V

    iget-object v4, p0, Lcom/pymcl/core/util/Json$Parser;->s:Ljava/lang/String;

    iget v5, p0, Lcom/pymcl/core/util/Json$Parser;->i:I

    invoke-virtual {v4, v5}, Ljava/lang/String;->charAt(I)C

    move-result v4

    const/16 v5, 0x5d

    if-ne v4, v5, :cond_3

    iget v1, p0, Lcom/pymcl/core/util/Json$Parser;->i:I

    add-int/2addr v1, v3

    iput v1, p0, Lcom/pymcl/core/util/Json$Parser;->i:I

    return-object v2

    .line 58
    :cond_3
    :goto_3
    invoke-virtual {p0}, Lcom/pymcl/core/util/Json$Parser;->value()Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {p0}, Lcom/pymcl/core/util/Json$Parser;->ws()V

    iget-object v4, p0, Lcom/pymcl/core/util/Json$Parser;->s:Ljava/lang/String;

    iget v6, p0, Lcom/pymcl/core/util/Json$Parser;->i:I

    invoke-virtual {v4, v6}, Ljava/lang/String;->charAt(I)C

    move-result v4

    if-ne v4, v1, :cond_4

    iget v4, p0, Lcom/pymcl/core/util/Json$Parser;->i:I

    add-int/2addr v4, v3

    iput v4, p0, Lcom/pymcl/core/util/Json$Parser;->i:I

    goto :goto_3

    :cond_4
    invoke-virtual {p0, v5}, Lcom/pymcl/core/util/Json$Parser;->expect(C)V

    return-object v2

    .line 61
    .end local v2    # "l":Ljava/util/ArrayList;
    :sswitch_5
    const-wide/high16 v1, 0x7ff8000000000000L    # Double.NaN

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    const-string v2, "NaN"

    invoke-virtual {p0, v2, v1}, Lcom/pymcl/core/util/Json$Parser;->lit(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    goto :goto_5

    .line 59
    :sswitch_6
    invoke-virtual {p0}, Lcom/pymcl/core/util/Json$Parser;->string()Ljava/lang/String;

    move-result-object v1

    goto :goto_5

    .line 62
    :cond_5
    new-instance v1, Ljava/lang/IllegalArgumentException;

    iget v2, p0, Lcom/pymcl/core/util/Json$Parser;->i:I

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "JSON \u975e\u6cd5\u5b57\u7b26 \'"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, "\' @"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_6
    :goto_4
    invoke-virtual {p0}, Lcom/pymcl/core/util/Json$Parser;->number()Ljava/lang/Object;

    move-result-object v1

    .line 54
    .end local v0    # "c":C
    :goto_5
    return-object v1

    .line 95
    :cond_7
    const/4 v0, 0x0

    .line 53
    .local v0, "$i$a$-require-Json$Parser$value$1":I
    nop

    .end local v0    # "$i$a$-require-Json$Parser$value$1":I
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "JSON \u610f\u5916\u7ed3\u675f"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :sswitch_data_0
    .sparse-switch
        0x22 -> :sswitch_6
        0x4e -> :sswitch_5
        0x5b -> :sswitch_4
        0x66 -> :sswitch_3
        0x6e -> :sswitch_2
        0x74 -> :sswitch_1
        0x7b -> :sswitch_0
    .end sparse-switch
.end method

.method public final ws()V
    .locals 2

    .line 51
    nop

    :goto_0
    iget v0, p0, Lcom/pymcl/core/util/Json$Parser;->i:I

    iget-object v1, p0, Lcom/pymcl/core/util/Json$Parser;->s:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    if-ge v0, v1, :cond_0

    iget-object v0, p0, Lcom/pymcl/core/util/Json$Parser;->s:Ljava/lang/String;

    iget v1, p0, Lcom/pymcl/core/util/Json$Parser;->i:I

    invoke-virtual {v0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v0

    invoke-static {v0}, Lkotlin/text/CharsKt;->isWhitespace(C)Z

    move-result v0

    if-eqz v0, :cond_0

    iget v0, p0, Lcom/pymcl/core/util/Json$Parser;->i:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/pymcl/core/util/Json$Parser;->i:I

    goto :goto_0

    :cond_0
    return-void
.end method
