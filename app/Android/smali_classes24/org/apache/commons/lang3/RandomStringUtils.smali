.class public Lorg/apache/commons/lang3/RandomStringUtils;
.super Ljava/lang/Object;
.source "RandomStringUtils.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 482
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 483
    return-void
.end method

.method public static random(I)Ljava/lang/String;
    .locals 1
    .param p0, "count"    # I

    .line 68
    const/4 v0, 0x0

    invoke-static {p0, v0, v0}, Lorg/apache/commons/lang3/RandomStringUtils;->random(IZZ)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static random(IIIZZ)Ljava/lang/String;
    .locals 7
    .param p0, "count"    # I
    .param p1, "start"    # I
    .param p2, "end"    # I
    .param p3, "letters"    # Z
    .param p4, "numbers"    # Z

    .line 127
    const/4 v5, 0x0

    invoke-static {}, Lorg/apache/commons/lang3/RandomStringUtils;->random()Ljava/util/concurrent/ThreadLocalRandom;

    move-result-object v6

    move v0, p0

    move v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    .end local p0    # "count":I
    .end local p1    # "start":I
    .end local p2    # "end":I
    .end local p3    # "letters":Z
    .end local p4    # "numbers":Z
    .local v0, "count":I
    .local v1, "start":I
    .local v2, "end":I
    .local v3, "letters":Z
    .local v4, "numbers":Z
    invoke-static/range {v0 .. v6}, Lorg/apache/commons/lang3/RandomStringUtils;->random(IIIZZ[CLjava/util/Random;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static varargs random(IIIZZ[C)Ljava/lang/String;
    .locals 7
    .param p0, "count"    # I
    .param p1, "start"    # I
    .param p2, "end"    # I
    .param p3, "letters"    # Z
    .param p4, "numbers"    # Z
    .param p5, "chars"    # [C

    .line 154
    invoke-static {}, Lorg/apache/commons/lang3/RandomStringUtils;->random()Ljava/util/concurrent/ThreadLocalRandom;

    move-result-object v6

    move v0, p0

    move v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    move-object v5, p5

    .end local p0    # "count":I
    .end local p1    # "start":I
    .end local p2    # "end":I
    .end local p3    # "letters":Z
    .end local p4    # "numbers":Z
    .end local p5    # "chars":[C
    .local v0, "count":I
    .local v1, "start":I
    .local v2, "end":I
    .local v3, "letters":Z
    .local v4, "numbers":Z
    .local v5, "chars":[C
    invoke-static/range {v0 .. v6}, Lorg/apache/commons/lang3/RandomStringUtils;->random(IIIZZ[CLjava/util/Random;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static random(IIIZZ[CLjava/util/Random;)Ljava/lang/String;
    .locals 7
    .param p0, "count"    # I
    .param p1, "start"    # I
    .param p2, "end"    # I
    .param p3, "letters"    # Z
    .param p4, "numbers"    # Z
    .param p5, "chars"    # [C
    .param p6, "random"    # Ljava/util/Random;

    .line 194
    if-nez p0, :cond_0

    .line 195
    const-string v0, ""

    return-object v0

    .line 197
    :cond_0
    if-ltz p0, :cond_12

    .line 200
    if-eqz p5, :cond_2

    array-length v0, p5

    if-eqz v0, :cond_1

    goto :goto_0

    .line 201
    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "The chars array must not be empty"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 204
    :cond_2
    :goto_0
    const-string v0, "Parameter end ("

    if-nez p1, :cond_5

    if-nez p2, :cond_5

    .line 205
    if-eqz p5, :cond_3

    .line 206
    array-length p2, p5

    goto :goto_1

    .line 207
    :cond_3
    if-nez p3, :cond_4

    if-nez p4, :cond_4

    .line 208
    const p2, 0x10ffff

    goto :goto_1

    .line 210
    :cond_4
    const/16 p2, 0x7b

    .line 211
    const/16 p1, 0x20

    goto :goto_1

    .line 213
    :cond_5
    if-le p2, p1, :cond_11

    .line 217
    :goto_1
    const/16 v1, 0x30

    .line 218
    .local v1, "zeroDigitAscii":I
    const/16 v2, 0x41

    .line 220
    .local v2, "firstLetterAscii":I
    if-nez p5, :cond_8

    const/16 v3, 0x41

    const/16 v4, 0x30

    if-eqz p4, :cond_6

    if-le p2, v4, :cond_7

    :cond_6
    if-eqz p3, :cond_8

    if-le p2, v3, :cond_7

    goto :goto_2

    .line 222
    :cond_7
    new-instance v5, Ljava/lang/IllegalArgumentException;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v6, ") must be greater then ("

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v4, ") for generating digits or greater then ("

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v3, ") for generating letters."

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v5, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v5

    .line 226
    :cond_8
    :goto_2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, p0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 227
    .local v0, "builder":Ljava/lang/StringBuilder;
    sub-int v3, p2, p1

    .line 229
    .local v3, "gap":I
    :goto_3
    add-int/lit8 v4, p0, -0x1

    .end local p0    # "count":I
    .local v4, "count":I
    if-eqz p0, :cond_10

    .line 231
    if-nez p5, :cond_9

    .line 232
    invoke-virtual {p6, v3}, Ljava/util/Random;->nextInt(I)I

    move-result p0

    add-int/2addr p0, p1

    .line 234
    .local p0, "codePoint":I
    invoke-static {p0}, Ljava/lang/Character;->getType(I)I

    move-result v5

    sparse-switch v5, :sswitch_data_0

    .line 239
    goto :goto_4

    .line 238
    :sswitch_0
    add-int/lit8 v4, v4, 0x1

    .line 239
    move p0, v4

    goto :goto_3

    .line 243
    .end local p0    # "codePoint":I
    :cond_9
    invoke-virtual {p6, v3}, Ljava/util/Random;->nextInt(I)I

    move-result p0

    add-int/2addr p0, p1

    aget-char p0, p5, p0

    .line 246
    .restart local p0    # "codePoint":I
    :goto_4
    invoke-static {p0}, Ljava/lang/Character;->charCount(I)I

    move-result v5

    .line 247
    .local v5, "numberOfChars":I
    if-nez v4, :cond_a

    const/4 v6, 0x1

    if-le v5, v6, :cond_a

    .line 248
    add-int/lit8 v4, v4, 0x1

    .line 249
    move p0, v4

    goto :goto_3

    .line 252
    :cond_a
    if-eqz p3, :cond_b

    invoke-static {p0}, Ljava/lang/Character;->isLetter(I)Z

    move-result v6

    if-nez v6, :cond_d

    :cond_b
    if-eqz p4, :cond_c

    .line 253
    invoke-static {p0}, Ljava/lang/Character;->isDigit(I)Z

    move-result v6

    if-nez v6, :cond_d

    :cond_c
    if-nez p3, :cond_f

    if-nez p4, :cond_f

    .line 255
    :cond_d
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->appendCodePoint(I)Ljava/lang/StringBuilder;

    .line 257
    const/4 v6, 0x2

    if-ne v5, v6, :cond_e

    .line 258
    add-int/lit8 v4, v4, -0x1

    move p0, v4

    goto :goto_5

    .line 257
    :cond_e
    move p0, v4

    goto :goto_5

    .line 262
    :cond_f
    add-int/lit8 v4, v4, 0x1

    move p0, v4

    .line 264
    .end local v4    # "count":I
    .end local v5    # "numberOfChars":I
    .local p0, "count":I
    :goto_5
    goto :goto_3

    .line 265
    .end local p0    # "count":I
    .restart local v4    # "count":I
    :cond_10
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 214
    .end local v0    # "builder":Ljava/lang/StringBuilder;
    .end local v1    # "zeroDigitAscii":I
    .end local v2    # "firstLetterAscii":I
    .end local v3    # "gap":I
    .end local v4    # "count":I
    .restart local p0    # "count":I
    :cond_11
    new-instance v1, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, ") must be greater than start ("

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, ")"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 198
    :cond_12
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Requested random string length "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " is less than 0."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    nop

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0x12 -> :sswitch_0
        0x13 -> :sswitch_0
    .end sparse-switch
.end method

.method public static random(ILjava/lang/String;)Ljava/lang/String;
    .locals 7
    .param p0, "count"    # I
    .param p1, "chars"    # Ljava/lang/String;

    .line 283
    if-nez p1, :cond_0

    .line 284
    const/4 v5, 0x0

    invoke-static {}, Lorg/apache/commons/lang3/RandomStringUtils;->random()Ljava/util/concurrent/ThreadLocalRandom;

    move-result-object v6

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move v0, p0

    .end local p0    # "count":I
    .local v0, "count":I
    invoke-static/range {v0 .. v6}, Lorg/apache/commons/lang3/RandomStringUtils;->random(IIIZZ[CLjava/util/Random;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 286
    .end local v0    # "count":I
    .restart local p0    # "count":I
    :cond_0
    move v0, p0

    .end local p0    # "count":I
    .restart local v0    # "count":I
    invoke-virtual {p1}, Ljava/lang/String;->toCharArray()[C

    move-result-object p0

    invoke-static {v0, p0}, Lorg/apache/commons/lang3/RandomStringUtils;->random(I[C)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static random(IZZ)Ljava/lang/String;
    .locals 1
    .param p0, "count"    # I
    .param p1, "letters"    # Z
    .param p2, "numbers"    # Z

    .line 87
    const/4 v0, 0x0

    invoke-static {p0, v0, v0, p1, p2}, Lorg/apache/commons/lang3/RandomStringUtils;->random(IIIZZ)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static varargs random(I[C)Ljava/lang/String;
    .locals 7
    .param p0, "count"    # I
    .param p1, "chars"    # [C

    .line 103
    if-nez p1, :cond_0

    .line 104
    const/4 v5, 0x0

    invoke-static {}, Lorg/apache/commons/lang3/RandomStringUtils;->random()Ljava/util/concurrent/ThreadLocalRandom;

    move-result-object v6

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move v0, p0

    .end local p0    # "count":I
    .local v0, "count":I
    invoke-static/range {v0 .. v6}, Lorg/apache/commons/lang3/RandomStringUtils;->random(IIIZZ[CLjava/util/Random;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 106
    .end local v0    # "count":I
    .restart local p0    # "count":I
    :cond_0
    move v0, p0

    .end local p0    # "count":I
    .restart local v0    # "count":I
    array-length v2, p1

    const/4 v4, 0x0

    invoke-static {}, Lorg/apache/commons/lang3/RandomStringUtils;->random()Ljava/util/concurrent/ThreadLocalRandom;

    move-result-object v6

    const/4 v1, 0x0

    const/4 v3, 0x0

    move-object v5, p1

    .end local p1    # "chars":[C
    .local v5, "chars":[C
    invoke-static/range {v0 .. v6}, Lorg/apache/commons/lang3/RandomStringUtils;->random(IIIZZ[CLjava/util/Random;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static random()Ljava/util/concurrent/ThreadLocalRandom;
    .locals 1

    .line 53
    invoke-static {}, Ljava/util/concurrent/ThreadLocalRandom;->current()Ljava/util/concurrent/ThreadLocalRandom;

    move-result-object v0

    return-object v0
.end method

.method public static randomAlphabetic(I)Ljava/lang/String;
    .locals 2
    .param p0, "count"    # I

    .line 301
    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-static {p0, v0, v1}, Lorg/apache/commons/lang3/RandomStringUtils;->random(IZZ)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static randomAlphabetic(II)Ljava/lang/String;
    .locals 1
    .param p0, "minLengthInclusive"    # I
    .param p1, "maxLengthExclusive"    # I

    .line 316
    invoke-static {p0, p1}, Lorg/apache/commons/lang3/RandomUtils;->nextInt(II)I

    move-result v0

    invoke-static {v0}, Lorg/apache/commons/lang3/RandomStringUtils;->randomAlphabetic(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static randomAlphanumeric(I)Ljava/lang/String;
    .locals 1
    .param p0, "count"    # I

    .line 331
    const/4 v0, 0x1

    invoke-static {p0, v0, v0}, Lorg/apache/commons/lang3/RandomStringUtils;->random(IZZ)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static randomAlphanumeric(II)Ljava/lang/String;
    .locals 1
    .param p0, "minLengthInclusive"    # I
    .param p1, "maxLengthExclusive"    # I

    .line 347
    invoke-static {p0, p1}, Lorg/apache/commons/lang3/RandomUtils;->nextInt(II)I

    move-result v0

    invoke-static {v0}, Lorg/apache/commons/lang3/RandomStringUtils;->randomAlphanumeric(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static randomAscii(I)Ljava/lang/String;
    .locals 3
    .param p0, "count"    # I

    .line 362
    const/16 v0, 0x7f

    const/4 v1, 0x0

    const/16 v2, 0x20

    invoke-static {p0, v2, v0, v1, v1}, Lorg/apache/commons/lang3/RandomStringUtils;->random(IIIZZ)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static randomAscii(II)Ljava/lang/String;
    .locals 1
    .param p0, "minLengthInclusive"    # I
    .param p1, "maxLengthExclusive"    # I

    .line 378
    invoke-static {p0, p1}, Lorg/apache/commons/lang3/RandomUtils;->nextInt(II)I

    move-result v0

    invoke-static {v0}, Lorg/apache/commons/lang3/RandomStringUtils;->randomAscii(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static randomGraph(I)Ljava/lang/String;
    .locals 3
    .param p0, "count"    # I

    .line 394
    const/16 v0, 0x7e

    const/4 v1, 0x0

    const/16 v2, 0x21

    invoke-static {p0, v2, v0, v1, v1}, Lorg/apache/commons/lang3/RandomStringUtils;->random(IIIZZ)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static randomGraph(II)Ljava/lang/String;
    .locals 1
    .param p0, "minLengthInclusive"    # I
    .param p1, "maxLengthExclusive"    # I

    .line 409
    invoke-static {p0, p1}, Lorg/apache/commons/lang3/RandomUtils;->nextInt(II)I

    move-result v0

    invoke-static {v0}, Lorg/apache/commons/lang3/RandomStringUtils;->randomGraph(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static randomNumeric(I)Ljava/lang/String;
    .locals 2
    .param p0, "count"    # I

    .line 424
    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-static {p0, v0, v1}, Lorg/apache/commons/lang3/RandomStringUtils;->random(IZZ)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static randomNumeric(II)Ljava/lang/String;
    .locals 1
    .param p0, "minLengthInclusive"    # I
    .param p1, "maxLengthExclusive"    # I

    .line 439
    invoke-static {p0, p1}, Lorg/apache/commons/lang3/RandomUtils;->nextInt(II)I

    move-result v0

    invoke-static {v0}, Lorg/apache/commons/lang3/RandomStringUtils;->randomNumeric(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static randomPrint(I)Ljava/lang/String;
    .locals 3
    .param p0, "count"    # I

    .line 455
    const/16 v0, 0x7e

    const/4 v1, 0x0

    const/16 v2, 0x20

    invoke-static {p0, v2, v0, v1, v1}, Lorg/apache/commons/lang3/RandomStringUtils;->random(IIIZZ)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static randomPrint(II)Ljava/lang/String;
    .locals 1
    .param p0, "minLengthInclusive"    # I
    .param p1, "maxLengthExclusive"    # I

    .line 471
    invoke-static {p0, p1}, Lorg/apache/commons/lang3/RandomUtils;->nextInt(II)I

    move-result v0

    invoke-static {v0}, Lorg/apache/commons/lang3/RandomStringUtils;->randomPrint(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
