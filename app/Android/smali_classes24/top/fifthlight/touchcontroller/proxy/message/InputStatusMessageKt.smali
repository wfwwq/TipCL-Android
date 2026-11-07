.class public final Ltop/fifthlight/touchcontroller/proxy/message/InputStatusMessageKt;
.super Ljava/lang/Object;
.source "InputStatusMessage.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nInputStatusMessage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InputStatusMessage.kt\ntop/fifthlight/touchcontroller/proxy/message/InputStatusMessageKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,134:1\n1#2:135\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0010\u000e\n\u0002\u0008\u0004\u001a(\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0002\u001a(\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0002\u00a8\u0006\u0007"
    }
    d2 = {
        "convertUtf16RangeToUtf8",
        "Lkotlin/Pair;",
        "",
        "",
        "start",
        "length",
        "convertUtf8RangeToUtf16",
        "TouchController-Proxy-Client"
    }
    k = 0x2
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final synthetic access$convertUtf16RangeToUtf8(Ljava/lang/String;II)Lkotlin/Pair;
    .locals 1
    .param p0, "$receiver"    # Ljava/lang/String;
    .param p1, "start"    # I
    .param p2, "length"    # I

    .line 1
    invoke-static {p0, p1, p2}, Ltop/fifthlight/touchcontroller/proxy/message/InputStatusMessageKt;->convertUtf16RangeToUtf8(Ljava/lang/String;II)Lkotlin/Pair;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$convertUtf8RangeToUtf16(Ljava/lang/String;II)Lkotlin/Pair;
    .locals 1
    .param p0, "$receiver"    # Ljava/lang/String;
    .param p1, "start"    # I
    .param p2, "length"    # I

    .line 1
    invoke-static {p0, p1, p2}, Ltop/fifthlight/touchcontroller/proxy/message/InputStatusMessageKt;->convertUtf8RangeToUtf16(Ljava/lang/String;II)Lkotlin/Pair;

    move-result-object v0

    return-object v0
.end method

.method private static final convertUtf16RangeToUtf8(Ljava/lang/String;II)Lkotlin/Pair;
    .locals 7
    .param p0, "$this$convertUtf16RangeToUtf8"    # Ljava/lang/String;
    .param p1, "start"    # I
    .param p2, "length"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "II)",
            "Lkotlin/Pair<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .line 8
    const/4 v0, 0x1

    const/4 v1, 0x0

    if-ltz p1, :cond_0

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v2

    if-gt p1, v2, :cond_0

    move v2, v0

    goto :goto_0

    :cond_0
    move v2, v1

    :goto_0
    if-eqz v2, :cond_3

    .line 9
    if-ltz p2, :cond_1

    add-int v2, p1, p2

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v3

    if-gt v2, v3, :cond_1

    goto :goto_1

    :cond_1
    move v0, v1

    :goto_1
    if-eqz v0, :cond_2

    .line 11
    invoke-virtual {p0, v1, p1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    const-string/jumbo v1, "substring(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .local v0, "prefix":Ljava/lang/String;
    sget-object v2, Lkotlin/text/Charsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {v0, v2}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v2

    const-string v3, "getBytes(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v2, v2

    .line 14
    .local v2, "byteStart":I
    add-int v4, p1, p2

    invoke-virtual {p0, p1, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .local v4, "segment":Ljava/lang/String;
    sget-object v1, Lkotlin/text/Charsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {v4, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v1

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v1, v1

    .line 17
    .local v1, "byteLength":I
    new-instance v3, Lkotlin/Pair;

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-direct {v3, v5, v6}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v3

    .line 135
    .end local v0    # "prefix":Ljava/lang/String;
    .end local v1    # "byteLength":I
    .end local v2    # "byteStart":I
    .end local v4    # "segment":Ljava/lang/String;
    :cond_2
    const/4 v0, 0x0

    .line 9
    .local v0, "$i$a$-require-InputStatusMessageKt$convertUtf16RangeToUtf8$2":I
    nop

    .end local v0    # "$i$a$-require-InputStatusMessageKt$convertUtf16RangeToUtf8$2":I
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "UTF-16 length out of bounds"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 135
    :cond_3
    const/4 v0, 0x0

    .line 8
    .local v0, "$i$a$-require-InputStatusMessageKt$convertUtf16RangeToUtf8$1":I
    nop

    .end local v0    # "$i$a$-require-InputStatusMessageKt$convertUtf16RangeToUtf8$1":I
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "UTF-16 start out of bounds"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private static final convertUtf8RangeToUtf16(Ljava/lang/String;II)Lkotlin/Pair;
    .locals 10
    .param p0, "$this$convertUtf8RangeToUtf16"    # Ljava/lang/String;
    .param p1, "start"    # I
    .param p2, "length"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "II)",
            "Lkotlin/Pair<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .line 21
    sget-object v0, Lkotlin/text/Charsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {p0, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v0

    const-string v1, "getBytes(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    .local v0, "allBytes":[B
    if-ltz p1, :cond_1

    array-length v1, v0

    if-gt p1, v1, :cond_1

    .line 25
    if-ltz p2, :cond_0

    add-int v1, p1, p2

    array-length v2, v0

    if-gt v1, v2, :cond_0

    .line 29
    const/4 v1, 0x0

    invoke-static {v0, v1, p1}, Lkotlin/collections/ArraysKt;->copyOfRange([BII)[B

    move-result-object v1

    .local v1, "beforeBytes":[B
    new-instance v2, Ljava/lang/String;

    .line 30
    sget-object v3, Lkotlin/text/Charsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-direct {v2, v1, v3}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .line 31
    .local v2, "beforeString":Ljava/lang/String;
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v3

    .line 33
    .local v3, "utf16Start":I
    add-int v4, p1, p2

    invoke-static {v0, p1, v4}, Lkotlin/collections/ArraysKt;->copyOfRange([BII)[B

    move-result-object v4

    .local v4, "segmentBytes":[B
    new-instance v5, Ljava/lang/String;

    .line 34
    sget-object v6, Lkotlin/text/Charsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-direct {v5, v4, v6}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .line 35
    .local v5, "segmentString":Ljava/lang/String;
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v6

    .line 37
    .local v6, "utf16Length":I
    new-instance v7, Lkotlin/Pair;

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-direct {v7, v8, v9}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v7

    .line 26
    .end local v1    # "beforeBytes":[B
    .end local v2    # "beforeString":Ljava/lang/String;
    .end local v3    # "utf16Start":I
    .end local v4    # "segmentBytes":[B
    .end local v5    # "segmentString":Ljava/lang/String;
    .end local v6    # "utf16Length":I
    :cond_0
    new-instance v1, Ljava/lang/IndexOutOfBoundsException;

    const-string v2, "UTF-8 length out of bounds"

    invoke-direct {v1, v2}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 23
    :cond_1
    new-instance v1, Ljava/lang/IndexOutOfBoundsException;

    const-string v2, "UTF-8 start out of bounds"

    invoke-direct {v1, v2}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v1
.end method
