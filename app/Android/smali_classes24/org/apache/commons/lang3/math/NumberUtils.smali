.class public Lorg/apache/commons/lang3/math/NumberUtils;
.super Ljava/lang/Object;
.source "NumberUtils.java"


# static fields
.field public static final BYTE_MINUS_ONE:Ljava/lang/Byte;

.field public static final BYTE_ONE:Ljava/lang/Byte;

.field public static final BYTE_ZERO:Ljava/lang/Byte;

.field public static final DOUBLE_MINUS_ONE:Ljava/lang/Double;

.field public static final DOUBLE_ONE:Ljava/lang/Double;

.field public static final DOUBLE_ZERO:Ljava/lang/Double;

.field public static final FLOAT_MINUS_ONE:Ljava/lang/Float;

.field public static final FLOAT_ONE:Ljava/lang/Float;

.field public static final FLOAT_ZERO:Ljava/lang/Float;

.field public static final INTEGER_MINUS_ONE:Ljava/lang/Integer;

.field public static final INTEGER_ONE:Ljava/lang/Integer;

.field public static final INTEGER_TWO:Ljava/lang/Integer;

.field public static final INTEGER_ZERO:Ljava/lang/Integer;

.field public static final LONG_INT_MAX_VALUE:Ljava/lang/Long;

.field public static final LONG_INT_MIN_VALUE:Ljava/lang/Long;

.field public static final LONG_MINUS_ONE:Ljava/lang/Long;

.field public static final LONG_ONE:Ljava/lang/Long;

.field public static final LONG_ZERO:Ljava/lang/Long;

.field public static final SHORT_MINUS_ONE:Ljava/lang/Short;

.field public static final SHORT_ONE:Ljava/lang/Short;

.field public static final SHORT_ZERO:Ljava/lang/Short;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 36
    const-wide/16 v0, 0x0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    sput-object v0, Lorg/apache/commons/lang3/math/NumberUtils;->LONG_ZERO:Ljava/lang/Long;

    .line 38
    const-wide/16 v0, 0x1

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    sput-object v0, Lorg/apache/commons/lang3/math/NumberUtils;->LONG_ONE:Ljava/lang/Long;

    .line 40
    const-wide/16 v0, -0x1

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    sput-object v0, Lorg/apache/commons/lang3/math/NumberUtils;->LONG_MINUS_ONE:Ljava/lang/Long;

    .line 42
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    sput-object v1, Lorg/apache/commons/lang3/math/NumberUtils;->INTEGER_ZERO:Ljava/lang/Integer;

    .line 44
    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    sput-object v2, Lorg/apache/commons/lang3/math/NumberUtils;->INTEGER_ONE:Ljava/lang/Integer;

    .line 46
    const/4 v2, 0x2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    sput-object v2, Lorg/apache/commons/lang3/math/NumberUtils;->INTEGER_TWO:Ljava/lang/Integer;

    .line 48
    const/4 v2, -0x1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    sput-object v3, Lorg/apache/commons/lang3/math/NumberUtils;->INTEGER_MINUS_ONE:Ljava/lang/Integer;

    .line 50
    invoke-static {v0}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v3

    sput-object v3, Lorg/apache/commons/lang3/math/NumberUtils;->SHORT_ZERO:Ljava/lang/Short;

    .line 52
    invoke-static {v1}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v3

    sput-object v3, Lorg/apache/commons/lang3/math/NumberUtils;->SHORT_ONE:Ljava/lang/Short;

    .line 54
    invoke-static {v2}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v3

    sput-object v3, Lorg/apache/commons/lang3/math/NumberUtils;->SHORT_MINUS_ONE:Ljava/lang/Short;

    .line 56
    invoke-static {v0}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v0

    sput-object v0, Lorg/apache/commons/lang3/math/NumberUtils;->BYTE_ZERO:Ljava/lang/Byte;

    .line 58
    invoke-static {v1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v0

    sput-object v0, Lorg/apache/commons/lang3/math/NumberUtils;->BYTE_ONE:Ljava/lang/Byte;

    .line 60
    invoke-static {v2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v0

    sput-object v0, Lorg/apache/commons/lang3/math/NumberUtils;->BYTE_MINUS_ONE:Ljava/lang/Byte;

    .line 62
    const-wide/16 v0, 0x0

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    sput-object v0, Lorg/apache/commons/lang3/math/NumberUtils;->DOUBLE_ZERO:Ljava/lang/Double;

    .line 64
    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    sput-object v0, Lorg/apache/commons/lang3/math/NumberUtils;->DOUBLE_ONE:Ljava/lang/Double;

    .line 66
    const-wide/high16 v0, -0x4010000000000000L    # -1.0

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    sput-object v0, Lorg/apache/commons/lang3/math/NumberUtils;->DOUBLE_MINUS_ONE:Ljava/lang/Double;

    .line 68
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    sput-object v0, Lorg/apache/commons/lang3/math/NumberUtils;->FLOAT_ZERO:Ljava/lang/Float;

    .line 70
    const/high16 v0, 0x3f800000    # 1.0f

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    sput-object v0, Lorg/apache/commons/lang3/math/NumberUtils;->FLOAT_ONE:Ljava/lang/Float;

    .line 72
    const/high16 v0, -0x40800000    # -1.0f

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    sput-object v0, Lorg/apache/commons/lang3/math/NumberUtils;->FLOAT_MINUS_ONE:Ljava/lang/Float;

    .line 79
    const-wide/32 v0, 0x7fffffff

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    sput-object v0, Lorg/apache/commons/lang3/math/NumberUtils;->LONG_INT_MAX_VALUE:Ljava/lang/Long;

    .line 86
    const-wide/32 v0, -0x80000000

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    sput-object v0, Lorg/apache/commons/lang3/math/NumberUtils;->LONG_INT_MIN_VALUE:Ljava/lang/Long;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1848
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1849
    return-void
.end method

.method public static compare(BB)I
    .locals 1
    .param p0, "x"    # B
    .param p1, "y"    # B

    .line 100
    sub-int v0, p0, p1

    return v0
.end method

.method public static compare(II)I
    .locals 1
    .param p0, "x"    # I
    .param p1, "y"    # I

    .line 114
    if-ne p0, p1, :cond_0

    .line 115
    const/4 v0, 0x0

    return v0

    .line 117
    :cond_0
    if-ge p0, p1, :cond_1

    const/4 v0, -0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x1

    :goto_0
    return v0
.end method

.method public static compare(JJ)I
    .locals 1
    .param p0, "x"    # J
    .param p2, "y"    # J

    .line 131
    cmp-long v0, p0, p2

    if-nez v0, :cond_0

    .line 132
    const/4 v0, 0x0

    return v0

    .line 134
    :cond_0
    cmp-long v0, p0, p2

    if-gez v0, :cond_1

    const/4 v0, -0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x1

    :goto_0
    return v0
.end method

.method public static compare(SS)I
    .locals 1
    .param p0, "x"    # S
    .param p1, "y"    # S

    .line 148
    if-ne p0, p1, :cond_0

    .line 149
    const/4 v0, 0x0

    return v0

    .line 151
    :cond_0
    if-ge p0, p1, :cond_1

    const/4 v0, -0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x1

    :goto_0
    return v0
.end method

.method public static createBigDecimal(Ljava/lang/String;)Ljava/math/BigDecimal;
    .locals 2
    .param p0, "str"    # Ljava/lang/String;

    .line 164
    if-nez p0, :cond_0

    .line 165
    const/4 v0, 0x0

    return-object v0

    .line 168
    :cond_0
    invoke-static {p0}, Lorg/apache/commons/lang3/StringUtils;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 171
    new-instance v0, Ljava/math/BigDecimal;

    invoke-direct {v0, p0}, Ljava/math/BigDecimal;-><init>(Ljava/lang/String;)V

    return-object v0

    .line 169
    :cond_1
    new-instance v0, Ljava/lang/NumberFormatException;

    const-string v1, "A blank string is not a valid number"

    invoke-direct {v0, v1}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static createBigInteger(Ljava/lang/String;)Ljava/math/BigInteger;
    .locals 6
    .param p0, "str"    # Ljava/lang/String;

    .line 185
    if-nez p0, :cond_0

    .line 186
    const/4 v0, 0x0

    return-object v0

    .line 188
    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_8

    .line 191
    const/4 v0, 0x0

    .line 192
    .local v0, "pos":I
    const/16 v1, 0xa

    .line 193
    .local v1, "radix":I
    const/4 v2, 0x0

    .line 194
    .local v2, "negate":Z
    const/4 v3, 0x0

    invoke-virtual {p0, v3}, Ljava/lang/String;->charAt(I)C

    move-result v3

    .line 195
    .local v3, "char0":C
    const/16 v4, 0x2d

    if-ne v3, v4, :cond_1

    .line 196
    const/4 v2, 0x1

    .line 197
    const/4 v0, 0x1

    goto :goto_0

    .line 198
    :cond_1
    const/16 v4, 0x2b

    if-ne v3, v4, :cond_2

    .line 199
    const/4 v0, 0x1

    .line 201
    :cond_2
    :goto_0
    const-string v4, "0x"

    invoke-virtual {p0, v4, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;I)Z

    move-result v4

    if-nez v4, :cond_5

    const-string v4, "0X"

    invoke-virtual {p0, v4, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;I)Z

    move-result v4

    if-eqz v4, :cond_3

    goto :goto_1

    .line 204
    :cond_3
    const-string v4, "#"

    invoke-virtual {p0, v4, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;I)Z

    move-result v4

    if-eqz v4, :cond_4

    .line 205
    const/16 v1, 0x10

    .line 206
    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    .line 207
    :cond_4
    const-string v4, "0"

    invoke-virtual {p0, v4, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;I)Z

    move-result v4

    if-eqz v4, :cond_6

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v4

    add-int/lit8 v5, v0, 0x1

    if-le v4, v5, :cond_6

    .line 208
    const/16 v1, 0x8

    .line 209
    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    .line 202
    :cond_5
    :goto_1
    const/16 v1, 0x10

    .line 203
    add-int/lit8 v0, v0, 0x2

    .line 212
    :cond_6
    :goto_2
    new-instance v4, Ljava/math/BigInteger;

    invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v5

    invoke-direct {v4, v5, v1}, Ljava/math/BigInteger;-><init>(Ljava/lang/String;I)V

    .line 213
    .local v4, "value":Ljava/math/BigInteger;
    if-eqz v2, :cond_7

    invoke-virtual {v4}, Ljava/math/BigInteger;->negate()Ljava/math/BigInteger;

    move-result-object v5

    goto :goto_3

    :cond_7
    move-object v5, v4

    :goto_3
    return-object v5

    .line 189
    .end local v0    # "pos":I
    .end local v1    # "radix":I
    .end local v2    # "negate":Z
    .end local v3    # "char0":C
    .end local v4    # "value":Ljava/math/BigInteger;
    :cond_8
    new-instance v0, Ljava/lang/NumberFormatException;

    const-string v1, "An empty string is not a valid number"

    invoke-direct {v0, v1}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static createDouble(Ljava/lang/String;)Ljava/lang/Double;
    .locals 1
    .param p0, "str"    # Ljava/lang/String;

    .line 226
    if-nez p0, :cond_0

    .line 227
    const/4 v0, 0x0

    return-object v0

    .line 229
    :cond_0
    invoke-static {p0}, Ljava/lang/Double;->valueOf(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v0

    return-object v0
.end method

.method public static createFloat(Ljava/lang/String;)Ljava/lang/Float;
    .locals 1
    .param p0, "str"    # Ljava/lang/String;

    .line 242
    if-nez p0, :cond_0

    .line 243
    const/4 v0, 0x0

    return-object v0

    .line 245
    :cond_0
    invoke-static {p0}, Ljava/lang/Float;->valueOf(Ljava/lang/String;)Ljava/lang/Float;

    move-result-object v0

    return-object v0
.end method

.method public static createInteger(Ljava/lang/String;)Ljava/lang/Integer;
    .locals 1
    .param p0, "str"    # Ljava/lang/String;

    .line 260
    if-nez p0, :cond_0

    .line 261
    const/4 v0, 0x0

    return-object v0

    .line 264
    :cond_0
    invoke-static {p0}, Ljava/lang/Integer;->decode(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public static createLong(Ljava/lang/String;)Ljava/lang/Long;
    .locals 1
    .param p0, "str"    # Ljava/lang/String;

    .line 279
    if-nez p0, :cond_0

    .line 280
    const/4 v0, 0x0

    return-object v0

    .line 282
    :cond_0
    invoke-static {p0}, Ljava/lang/Long;->decode(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v0

    return-object v0
.end method

.method public static createNumber(Ljava/lang/String;)Ljava/lang/Number;
    .locals 21
    .param p0, "str"    # Ljava/lang/String;

    .line 317
    move-object/from16 v1, p0

    if-nez v1, :cond_0

    .line 318
    const/4 v0, 0x0

    return-object v0

    .line 320
    :cond_0
    invoke-static {v1}, Lorg/apache/commons/lang3/StringUtils;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_24

    .line 324
    const/4 v0, 0x3

    new-array v0, v0, [Ljava/lang/String;

    const-string v2, "0x"

    const/4 v3, 0x0

    aput-object v2, v0, v3

    const-string v2, "0X"

    const/4 v4, 0x1

    aput-object v2, v0, v4

    const/4 v2, 0x2

    const-string v5, "#"

    aput-object v5, v0, v2

    move-object v2, v0

    .line 325
    .local v2, "hexPrefixes":[Ljava/lang/String;
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v5

    .line 326
    .local v5, "length":I
    invoke-virtual {v1, v3}, Ljava/lang/String;->charAt(I)C

    move-result v0

    const/16 v6, 0x2b

    const/16 v7, 0x2d

    if-eq v0, v6, :cond_2

    invoke-virtual {v1, v3}, Ljava/lang/String;->charAt(I)C

    move-result v0

    if-ne v0, v7, :cond_1

    goto :goto_0

    :cond_1
    move v0, v3

    goto :goto_1

    :cond_2
    :goto_0
    move v0, v4

    :goto_1
    move v6, v0

    .line 327
    .local v6, "offset":I
    const/4 v0, 0x0

    .line 328
    .local v0, "pfxLen":I
    array-length v8, v2

    move v9, v3

    :goto_2
    if-ge v9, v8, :cond_4

    aget-object v10, v2, v9

    .line 329
    .local v10, "pfx":Ljava/lang/String;
    invoke-virtual {v1, v10, v6}, Ljava/lang/String;->startsWith(Ljava/lang/String;I)Z

    move-result v11

    if-eqz v11, :cond_3

    .line 330
    invoke-virtual {v10}, Ljava/lang/String;->length()I

    move-result v8

    add-int/2addr v8, v6

    add-int/2addr v0, v8

    .line 331
    move v8, v0

    goto :goto_3

    .line 328
    .end local v10    # "pfx":Ljava/lang/String;
    :cond_3
    add-int/lit8 v9, v9, 0x1

    goto :goto_2

    :cond_4
    move v8, v0

    .line 334
    .end local v0    # "pfxLen":I
    .local v8, "pfxLen":I
    :goto_3
    if-lez v8, :cond_b

    .line 335
    const/4 v0, 0x0

    .line 336
    .local v0, "firstSigDigit":C
    move v3, v8

    .local v3, "i":I
    :goto_4
    if-ge v3, v5, :cond_6

    .line 337
    invoke-virtual {v1, v3}, Ljava/lang/String;->charAt(I)C

    move-result v0

    .line 338
    const/16 v4, 0x30

    if-eq v0, v4, :cond_5

    .line 339
    goto :goto_5

    .line 341
    :cond_5
    add-int/lit8 v8, v8, 0x1

    .line 336
    add-int/lit8 v3, v3, 0x1

    goto :goto_4

    .line 343
    .end local v3    # "i":I
    :cond_6
    :goto_5
    sub-int v3, v5, v8

    .line 344
    .local v3, "hexDigits":I
    const/16 v4, 0x10

    if-gt v3, v4, :cond_a

    const/16 v7, 0x37

    if-ne v3, v4, :cond_7

    if-le v0, v7, :cond_7

    goto :goto_7

    .line 347
    :cond_7
    const/16 v4, 0x8

    if-gt v3, v4, :cond_9

    if-ne v3, v4, :cond_8

    if-le v0, v7, :cond_8

    goto :goto_6

    .line 350
    :cond_8
    invoke-static {v1}, Lorg/apache/commons/lang3/math/NumberUtils;->createInteger(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v4

    return-object v4

    .line 348
    :cond_9
    :goto_6
    invoke-static {v1}, Lorg/apache/commons/lang3/math/NumberUtils;->createLong(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v4

    return-object v4

    .line 345
    :cond_a
    :goto_7
    invoke-static {v1}, Lorg/apache/commons/lang3/math/NumberUtils;->createBigInteger(Ljava/lang/String;)Ljava/math/BigInteger;

    move-result-object v4

    return-object v4

    .line 352
    .end local v0    # "firstSigDigit":C
    .end local v3    # "hexDigits":I
    :cond_b
    add-int/lit8 v0, v5, -0x1

    invoke-virtual {v1, v0}, Ljava/lang/String;->charAt(I)C

    move-result v9

    .line 356
    .local v9, "lastChar":C
    const/16 v0, 0x2e

    invoke-virtual {v1, v0}, Ljava/lang/String;->indexOf(I)I

    move-result v10

    .line 357
    .local v10, "decPos":I
    const/16 v11, 0x65

    invoke-virtual {v1, v11}, Ljava/lang/String;->indexOf(I)I

    move-result v11

    const/16 v12, 0x45

    invoke-virtual {v1, v12}, Ljava/lang/String;->indexOf(I)I

    move-result v12

    add-int/2addr v11, v12

    add-int/2addr v11, v4

    .line 362
    .local v11, "expPos":I
    invoke-static {v9}, Ljava/lang/Character;->isDigit(C)Z

    move-result v12

    if-nez v12, :cond_c

    if-eq v9, v0, :cond_c

    move v0, v4

    goto :goto_8

    :cond_c
    move v0, v3

    :goto_8
    move v12, v0

    .line 363
    .local v12, "requestType":Z
    const-string v13, " is not a valid number."

    const/4 v0, -0x1

    if-le v10, v0, :cond_10

    .line 364
    if-le v11, v0, :cond_e

    .line 365
    if-lt v11, v10, :cond_d

    if-gt v11, v5, :cond_d

    .line 368
    add-int/lit8 v14, v10, 0x1

    invoke-virtual {v1, v14, v11}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v14

    .local v14, "dec":Ljava/lang/String;
    goto :goto_a

    .line 366
    .end local v14    # "dec":Ljava/lang/String;
    :cond_d
    new-instance v0, Ljava/lang/NumberFormatException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v0, v3}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 371
    :cond_e
    add-int/lit8 v14, v10, 0x1

    if-eqz v12, :cond_f

    add-int/lit8 v15, v5, -0x1

    goto :goto_9

    :cond_f
    move v15, v5

    :goto_9
    invoke-virtual {v1, v14, v15}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v14

    .line 373
    .restart local v14    # "dec":Ljava/lang/String;
    :goto_a
    invoke-static {v1, v10}, Lorg/apache/commons/lang3/math/NumberUtils;->getMantissa(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v15

    .local v15, "mant":Ljava/lang/String;
    goto :goto_d

    .line 375
    .end local v14    # "dec":Ljava/lang/String;
    .end local v15    # "mant":Ljava/lang/String;
    :cond_10
    if-le v11, v0, :cond_12

    .line 376
    if-gt v11, v5, :cond_11

    .line 379
    invoke-static {v1, v11}, Lorg/apache/commons/lang3/math/NumberUtils;->getMantissa(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v14

    move-object v15, v14

    .local v14, "mant":Ljava/lang/String;
    goto :goto_c

    .line 377
    .end local v14    # "mant":Ljava/lang/String;
    :cond_11
    new-instance v0, Ljava/lang/NumberFormatException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v0, v3}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 382
    :cond_12
    if-eqz v12, :cond_13

    add-int/lit8 v14, v5, -0x1

    goto :goto_b

    :cond_13
    move v14, v5

    :goto_b
    invoke-static {v1, v14}, Lorg/apache/commons/lang3/math/NumberUtils;->getMantissa(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v14

    move-object v15, v14

    .line 384
    .restart local v15    # "mant":Ljava/lang/String;
    :goto_c
    const/4 v14, 0x0

    .line 386
    .local v14, "dec":Ljava/lang/String;
    :goto_d
    const/16 v16, 0x0

    const-wide/16 v17, 0x0

    if-eqz v12, :cond_1c

    .line 387
    if-le v11, v0, :cond_14

    add-int/lit8 v0, v5, -0x1

    if-ge v11, v0, :cond_14

    .line 388
    add-int/lit8 v0, v11, 0x1

    add-int/lit8 v4, v5, -0x1

    invoke-virtual {v1, v0, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    move-object v4, v0

    .local v0, "exp":Ljava/lang/String;
    goto :goto_e

    .line 390
    .end local v0    # "exp":Ljava/lang/String;
    :cond_14
    const/4 v0, 0x0

    move-object v4, v0

    .line 393
    .local v4, "exp":Ljava/lang/String;
    :goto_e
    add-int/lit8 v0, v5, -0x1

    invoke-virtual {v1, v3, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v7

    .line 394
    .local v7, "numeric":Ljava/lang/String;
    sparse-switch v9, :sswitch_data_0

    goto/16 :goto_11

    .line 397
    :sswitch_0
    if-nez v14, :cond_17

    if-nez v4, :cond_17

    .line 399
    invoke-virtual {v7}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_15

    invoke-virtual {v7, v3}, Ljava/lang/String;->charAt(I)C

    move-result v0

    const/16 v3, 0x2d

    if-ne v0, v3, :cond_15

    const/4 v0, 0x1

    invoke-virtual {v7, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lorg/apache/commons/lang3/math/NumberUtils;->isDigits(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_16

    :cond_15
    invoke-static {v7}, Lorg/apache/commons/lang3/math/NumberUtils;->isDigits(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_17

    .line 401
    :cond_16
    :try_start_0
    invoke-static {v7}, Lorg/apache/commons/lang3/math/NumberUtils;->createLong(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    .line 402
    :catch_0
    move-exception v0

    .line 405
    invoke-static {v7}, Lorg/apache/commons/lang3/math/NumberUtils;->createBigInteger(Ljava/lang/String;)Ljava/math/BigInteger;

    move-result-object v0

    return-object v0

    .line 408
    :cond_17
    new-instance v0, Ljava/lang/NumberFormatException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v0, v3}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 412
    :sswitch_1
    :try_start_1
    invoke-static {v1}, Lorg/apache/commons/lang3/math/NumberUtils;->createFloat(Ljava/lang/String;)Ljava/lang/Float;

    move-result-object v0

    .line 413
    .local v0, "f":Ljava/lang/Float;
    invoke-virtual {v0}, Ljava/lang/Float;->isInfinite()Z

    move-result v3

    if-nez v3, :cond_19

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v3

    cmpl-float v3, v3, v16

    if-nez v3, :cond_18

    invoke-static {v15, v14}, Lorg/apache/commons/lang3/math/NumberUtils;->isZero(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v3
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_1

    if-eqz v3, :cond_19

    .line 416
    :cond_18
    return-object v0

    .line 421
    .end local v0    # "f":Ljava/lang/Float;
    :cond_19
    goto :goto_f

    .line 419
    :catch_1
    move-exception v0

    .line 426
    :goto_f
    :sswitch_2
    :try_start_2
    invoke-static {v1}, Lorg/apache/commons/lang3/math/NumberUtils;->createDouble(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v0

    .line 427
    .local v0, "d":Ljava/lang/Double;
    invoke-virtual {v0}, Ljava/lang/Double;->isInfinite()Z

    move-result v3

    if-nez v3, :cond_1b

    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v19

    cmpl-double v3, v19, v17

    if-nez v3, :cond_1a

    invoke-static {v15, v14}, Lorg/apache/commons/lang3/math/NumberUtils;->isZero(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v3
    :try_end_2
    .catch Ljava/lang/NumberFormatException; {:try_start_2 .. :try_end_2} :catch_2

    if-eqz v3, :cond_1b

    .line 428
    :cond_1a
    return-object v0

    .line 432
    .end local v0    # "d":Ljava/lang/Double;
    :cond_1b
    goto :goto_10

    .line 430
    :catch_2
    move-exception v0

    .line 434
    :goto_10
    :try_start_3
    invoke-static {v7}, Lorg/apache/commons/lang3/math/NumberUtils;->createBigDecimal(Ljava/lang/String;)Ljava/math/BigDecimal;

    move-result-object v0
    :try_end_3
    .catch Ljava/lang/NumberFormatException; {:try_start_3 .. :try_end_3} :catch_3

    return-object v0

    .line 435
    :catch_3
    move-exception v0

    .line 440
    :goto_11
    new-instance v0, Ljava/lang/NumberFormatException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v0, v3}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 446
    .end local v4    # "exp":Ljava/lang/String;
    .end local v7    # "numeric":Ljava/lang/String;
    :cond_1c
    if-le v11, v0, :cond_1d

    add-int/lit8 v0, v5, -0x1

    if-ge v11, v0, :cond_1d

    .line 447
    add-int/lit8 v0, v11, 0x1

    invoke-virtual {v1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    move-object v3, v0

    .local v0, "exp":Ljava/lang/String;
    goto :goto_12

    .line 449
    .end local v0    # "exp":Ljava/lang/String;
    :cond_1d
    const/4 v0, 0x0

    move-object v3, v0

    .line 451
    .local v3, "exp":Ljava/lang/String;
    :goto_12
    if-nez v14, :cond_1e

    if-nez v3, :cond_1e

    .line 454
    :try_start_4
    invoke-static {v1}, Lorg/apache/commons/lang3/math/NumberUtils;->createInteger(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0
    :try_end_4
    .catch Ljava/lang/NumberFormatException; {:try_start_4 .. :try_end_4} :catch_4

    return-object v0

    .line 455
    :catch_4
    move-exception v0

    .line 459
    :try_start_5
    invoke-static {v1}, Lorg/apache/commons/lang3/math/NumberUtils;->createLong(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v0
    :try_end_5
    .catch Ljava/lang/NumberFormatException; {:try_start_5 .. :try_end_5} :catch_5

    return-object v0

    .line 460
    :catch_5
    move-exception v0

    .line 463
    invoke-static {v1}, Lorg/apache/commons/lang3/math/NumberUtils;->createBigInteger(Ljava/lang/String;)Ljava/math/BigInteger;

    move-result-object v0

    return-object v0

    .line 468
    :cond_1e
    :try_start_6
    invoke-static {v1}, Lorg/apache/commons/lang3/math/NumberUtils;->createFloat(Ljava/lang/String;)Ljava/lang/Float;

    move-result-object v0

    .line 469
    .local v0, "f":Ljava/lang/Float;
    invoke-static {v1}, Lorg/apache/commons/lang3/math/NumberUtils;->createDouble(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v4

    .line 470
    .local v4, "d":Ljava/lang/Double;
    invoke-virtual {v0}, Ljava/lang/Float;->isInfinite()Z

    move-result v7

    if-nez v7, :cond_20

    .line 471
    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v7

    cmpl-float v7, v7, v16

    if-nez v7, :cond_1f

    invoke-static {v15, v14}, Lorg/apache/commons/lang3/math/NumberUtils;->isZero(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_20

    .line 472
    :cond_1f
    invoke-virtual {v0}, Ljava/lang/Float;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v4}, Ljava/lang/Double;->toString()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v7, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_20

    .line 473
    return-object v0

    .line 475
    :cond_20
    invoke-virtual {v4}, Ljava/lang/Double;->isInfinite()Z

    move-result v7

    if-nez v7, :cond_23

    invoke-virtual {v4}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v19

    cmpl-double v7, v19, v17

    if-nez v7, :cond_21

    invoke-static {v15, v14}, Lorg/apache/commons/lang3/math/NumberUtils;->isZero(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_23

    .line 476
    :cond_21
    invoke-static {v1}, Lorg/apache/commons/lang3/math/NumberUtils;->createBigDecimal(Ljava/lang/String;)Ljava/math/BigDecimal;

    move-result-object v7

    .line 477
    .local v7, "b":Ljava/math/BigDecimal;
    invoke-virtual {v4}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v16

    invoke-static/range {v16 .. v17}, Ljava/math/BigDecimal;->valueOf(D)Ljava/math/BigDecimal;

    move-result-object v13

    invoke-virtual {v7, v13}, Ljava/math/BigDecimal;->compareTo(Ljava/math/BigDecimal;)I

    move-result v13
    :try_end_6
    .catch Ljava/lang/NumberFormatException; {:try_start_6 .. :try_end_6} :catch_6

    if-nez v13, :cond_22

    .line 478
    return-object v4

    .line 480
    :cond_22
    return-object v7

    .line 484
    .end local v0    # "f":Ljava/lang/Float;
    .end local v4    # "d":Ljava/lang/Double;
    .end local v7    # "b":Ljava/math/BigDecimal;
    :cond_23
    goto :goto_13

    .line 482
    :catch_6
    move-exception v0

    .line 485
    :goto_13
    invoke-static {v1}, Lorg/apache/commons/lang3/math/NumberUtils;->createBigDecimal(Ljava/lang/String;)Ljava/math/BigDecimal;

    move-result-object v0

    return-object v0

    .line 321
    .end local v2    # "hexPrefixes":[Ljava/lang/String;
    .end local v3    # "exp":Ljava/lang/String;
    .end local v5    # "length":I
    .end local v6    # "offset":I
    .end local v8    # "pfxLen":I
    .end local v9    # "lastChar":C
    .end local v10    # "decPos":I
    .end local v11    # "expPos":I
    .end local v12    # "requestType":Z
    .end local v14    # "dec":Ljava/lang/String;
    .end local v15    # "mant":Ljava/lang/String;
    :cond_24
    new-instance v0, Ljava/lang/NumberFormatException;

    const-string v2, "A blank string is not a valid number"

    invoke-direct {v0, v2}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    throw v0

    nop

    :sswitch_data_0
    .sparse-switch
        0x44 -> :sswitch_2
        0x46 -> :sswitch_1
        0x4c -> :sswitch_0
        0x64 -> :sswitch_2
        0x66 -> :sswitch_1
        0x6c -> :sswitch_0
    .end sparse-switch
.end method

.method private static getMantissa(Ljava/lang/String;I)Ljava/lang/String;
    .locals 4
    .param p0, "str"    # Ljava/lang/String;
    .param p1, "stopPos"    # I

    .line 498
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    move-result v1

    .line 499
    .local v1, "firstChar":C
    const/16 v2, 0x2d

    const/4 v3, 0x1

    if-eq v1, v2, :cond_1

    const/16 v2, 0x2b

    if-ne v1, v2, :cond_0

    goto :goto_0

    :cond_0
    move v2, v0

    goto :goto_1

    :cond_1
    :goto_0
    move v2, v3

    .line 501
    .local v2, "hasSign":Z
    :goto_1
    if-eqz v2, :cond_2

    invoke-virtual {p0, v3, p1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    goto :goto_2

    :cond_2
    invoke-virtual {p0, v0, p1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    :goto_2
    return-object v0
.end method

.method private static isAllZeros(Ljava/lang/String;)Z
    .locals 4
    .param p0, "str"    # Ljava/lang/String;

    .line 513
    const/4 v0, 0x1

    if-nez p0, :cond_0

    .line 514
    return v0

    .line 516
    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    sub-int/2addr v1, v0

    .local v1, "i":I
    :goto_0
    if-ltz v1, :cond_2

    .line 517
    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v2

    const/16 v3, 0x30

    if-eq v2, v3, :cond_1

    .line 518
    const/4 v0, 0x0

    return v0

    .line 516
    :cond_1
    add-int/lit8 v1, v1, -0x1

    goto :goto_0

    .line 521
    .end local v1    # "i":I
    :cond_2
    return v0
.end method

.method public static isCreatable(Ljava/lang/String;)Z
    .locals 19
    .param p0, "str"    # Ljava/lang/String;

    .line 547
    invoke-static/range {p0 .. p0}, Lorg/apache/commons/lang3/StringUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 548
    return v1

    .line 550
    :cond_0
    invoke-virtual/range {p0 .. p0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    .line 551
    .local v0, "chars":[C
    array-length v2, v0

    .line 552
    .local v2, "sz":I
    const/4 v3, 0x0

    .line 553
    .local v3, "hasExp":Z
    const/4 v4, 0x0

    .line 554
    .local v4, "hasDecPoint":Z
    const/4 v5, 0x0

    .line 555
    .local v5, "allowSigns":Z
    const/4 v6, 0x0

    .line 557
    .local v6, "foundDigit":Z
    aget-char v7, v0, v1

    const/16 v8, 0x2b

    const/16 v9, 0x2d

    if-eq v7, v9, :cond_2

    aget-char v7, v0, v1

    if-ne v7, v8, :cond_1

    goto :goto_0

    :cond_1
    move v7, v1

    goto :goto_1

    :cond_2
    :goto_0
    const/4 v7, 0x1

    .line 558
    .local v7, "start":I
    :goto_1
    add-int/lit8 v11, v7, 0x1

    const/16 v12, 0x46

    const/16 v13, 0x66

    const/16 v14, 0x39

    const/16 v15, 0x2e

    move/from16 v16, v1

    const/16 v1, 0x30

    if-le v2, v11, :cond_f

    aget-char v11, v0, v7

    if-ne v11, v1, :cond_f

    move-object/from16 v11, p0

    invoke-static {v11, v15}, Lorg/apache/commons/lang3/StringUtils;->contains(Ljava/lang/CharSequence;I)Z

    move-result v17

    if-nez v17, :cond_e

    .line 559
    add-int/lit8 v17, v7, 0x1

    const/16 v18, 0x1

    aget-char v10, v0, v17

    const/16 v9, 0x78

    if-eq v10, v9, :cond_7

    add-int/lit8 v9, v7, 0x1

    aget-char v9, v0, v9

    const/16 v10, 0x58

    if-ne v9, v10, :cond_3

    goto :goto_4

    .line 574
    :cond_3
    add-int/lit8 v9, v7, 0x1

    aget-char v9, v0, v9

    invoke-static {v9}, Ljava/lang/Character;->isDigit(C)Z

    move-result v9

    if-eqz v9, :cond_10

    .line 576
    add-int/lit8 v8, v7, 0x1

    .line 577
    .local v8, "i":I
    :goto_2
    array-length v9, v0

    if-ge v8, v9, :cond_6

    .line 578
    aget-char v9, v0, v8

    if-lt v9, v1, :cond_5

    aget-char v9, v0, v8

    const/16 v10, 0x37

    if-le v9, v10, :cond_4

    goto :goto_3

    .line 577
    :cond_4
    add-int/lit8 v8, v8, 0x1

    goto :goto_2

    .line 579
    :cond_5
    :goto_3
    return v16

    .line 582
    :cond_6
    return v18

    .line 560
    .end local v8    # "i":I
    :cond_7
    :goto_4
    add-int/lit8 v8, v7, 0x2

    .line 561
    .restart local v8    # "i":I
    if-ne v8, v2, :cond_8

    .line 562
    return v16

    .line 565
    :cond_8
    :goto_5
    array-length v9, v0

    if-ge v8, v9, :cond_d

    .line 566
    aget-char v9, v0, v8

    if-lt v9, v1, :cond_9

    aget-char v9, v0, v8

    if-le v9, v14, :cond_b

    :cond_9
    aget-char v9, v0, v8

    const/16 v10, 0x61

    if-lt v9, v10, :cond_a

    aget-char v9, v0, v8

    if-le v9, v13, :cond_b

    :cond_a
    aget-char v9, v0, v8

    const/16 v10, 0x41

    if-lt v9, v10, :cond_c

    aget-char v9, v0, v8

    if-le v9, v12, :cond_b

    goto :goto_6

    .line 565
    :cond_b
    add-int/lit8 v8, v8, 0x1

    goto :goto_5

    .line 569
    :cond_c
    :goto_6
    return v16

    .line 572
    :cond_d
    return v18

    .line 558
    .end local v8    # "i":I
    :cond_e
    const/16 v18, 0x1

    goto :goto_7

    :cond_f
    const/16 v18, 0x1

    move-object/from16 v11, p0

    .line 585
    :cond_10
    :goto_7
    add-int/lit8 v2, v2, -0x1

    .line 587
    move v9, v7

    .line 590
    .local v9, "i":I
    :goto_8
    const/16 v10, 0x45

    const/16 v8, 0x65

    if-lt v9, v2, :cond_1f

    add-int/lit8 v12, v2, 0x1

    if-ge v9, v12, :cond_11

    if-eqz v5, :cond_11

    if-nez v6, :cond_11

    const/16 v12, 0x46

    goto/16 :goto_e

    .line 623
    :cond_11
    array-length v12, v0

    if-ge v9, v12, :cond_1d

    .line 624
    aget-char v12, v0, v9

    if-lt v12, v1, :cond_12

    aget-char v1, v0, v9

    if-gt v1, v14, :cond_12

    .line 626
    return v18

    .line 628
    :cond_12
    aget-char v1, v0, v9

    if-eq v1, v8, :cond_1c

    aget-char v1, v0, v9

    if-ne v1, v10, :cond_13

    goto :goto_c

    .line 632
    :cond_13
    aget-char v1, v0, v9

    if-ne v1, v15, :cond_16

    .line 633
    if-nez v4, :cond_15

    if-eqz v3, :cond_14

    goto :goto_9

    .line 638
    :cond_14
    return v6

    .line 635
    :cond_15
    :goto_9
    return v16

    .line 640
    :cond_16
    if-nez v5, :cond_18

    aget-char v1, v0, v9

    const/16 v8, 0x64

    if-eq v1, v8, :cond_17

    aget-char v1, v0, v9

    const/16 v8, 0x44

    if-eq v1, v8, :cond_17

    aget-char v1, v0, v9

    if-eq v1, v13, :cond_17

    aget-char v1, v0, v9

    const/16 v12, 0x46

    if-ne v1, v12, :cond_18

    .line 645
    :cond_17
    return v6

    .line 647
    :cond_18
    aget-char v1, v0, v9

    const/16 v8, 0x6c

    if-eq v1, v8, :cond_1a

    aget-char v1, v0, v9

    const/16 v8, 0x4c

    if-ne v1, v8, :cond_19

    goto :goto_a

    .line 653
    :cond_19
    return v16

    .line 650
    :cond_1a
    :goto_a
    if-eqz v6, :cond_1b

    if-nez v3, :cond_1b

    if-nez v4, :cond_1b

    move/from16 v1, v18

    goto :goto_b

    :cond_1b
    move/from16 v1, v16

    :goto_b
    return v1

    .line 630
    :cond_1c
    :goto_c
    return v16

    .line 657
    :cond_1d
    if-nez v5, :cond_1e

    if-eqz v6, :cond_1e

    move/from16 v1, v18

    goto :goto_d

    :cond_1e
    move/from16 v1, v16

    :goto_d
    return v1

    .line 591
    :cond_1f
    :goto_e
    aget-char v12, v0, v9

    if-lt v12, v1, :cond_20

    aget-char v12, v0, v9

    if-gt v12, v14, :cond_20

    .line 592
    const/4 v6, 0x1

    .line 593
    const/4 v5, 0x0

    const/16 v10, 0x2b

    const/16 v12, 0x2d

    goto :goto_12

    .line 595
    :cond_20
    aget-char v12, v0, v9

    if-ne v12, v15, :cond_23

    .line 596
    if-nez v4, :cond_22

    if-eqz v3, :cond_21

    goto :goto_f

    .line 600
    :cond_21
    const/4 v4, 0x1

    const/16 v10, 0x2b

    const/16 v12, 0x2d

    goto :goto_12

    .line 598
    :cond_22
    :goto_f
    return v16

    .line 601
    :cond_23
    aget-char v12, v0, v9

    if-eq v12, v8, :cond_28

    aget-char v8, v0, v9

    if-ne v8, v10, :cond_24

    const/16 v10, 0x2b

    const/16 v12, 0x2d

    goto :goto_11

    .line 612
    :cond_24
    aget-char v8, v0, v9

    const/16 v10, 0x2b

    if-eq v8, v10, :cond_26

    aget-char v8, v0, v9

    const/16 v12, 0x2d

    if-ne v8, v12, :cond_25

    goto :goto_10

    .line 619
    :cond_25
    return v16

    .line 612
    :cond_26
    const/16 v12, 0x2d

    .line 613
    :goto_10
    if-nez v5, :cond_27

    .line 614
    return v16

    .line 616
    :cond_27
    const/4 v5, 0x0

    .line 617
    const/4 v6, 0x0

    goto :goto_12

    .line 601
    :cond_28
    const/16 v10, 0x2b

    const/16 v12, 0x2d

    .line 603
    :goto_11
    if-eqz v3, :cond_29

    .line 605
    return v16

    .line 607
    :cond_29
    if-nez v6, :cond_2a

    .line 608
    return v16

    .line 610
    :cond_2a
    const/4 v3, 0x1

    .line 611
    const/4 v5, 0x1

    .line 621
    :goto_12
    add-int/lit8 v9, v9, 0x1

    move v8, v10

    const/16 v12, 0x46

    goto/16 :goto_8
.end method

.method public static isDigits(Ljava/lang/String;)Z
    .locals 1
    .param p0, "str"    # Ljava/lang/String;

    .line 671
    invoke-static {p0}, Lorg/apache/commons/lang3/StringUtils;->isNumeric(Ljava/lang/CharSequence;)Z

    move-result v0

    return v0
.end method

.method public static isNumber(Ljava/lang/String;)Z
    .locals 1
    .param p0, "str"    # Ljava/lang/String;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 701
    invoke-static {p0}, Lorg/apache/commons/lang3/math/NumberUtils;->isCreatable(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public static isParsable(Ljava/lang/String;)Z
    .locals 4
    .param p0, "str"    # Ljava/lang/String;

    .line 722
    invoke-static {p0}, Lorg/apache/commons/lang3/StringUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 723
    return v1

    .line 725
    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v2, 0x1

    sub-int/2addr v0, v2

    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    move-result v0

    const/16 v3, 0x2e

    if-ne v0, v3, :cond_1

    .line 726
    return v1

    .line 728
    :cond_1
    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v0

    const/16 v3, 0x2d

    if-ne v0, v3, :cond_3

    .line 729
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    if-ne v0, v2, :cond_2

    .line 730
    return v1

    .line 732
    :cond_2
    invoke-static {p0, v2}, Lorg/apache/commons/lang3/math/NumberUtils;->withDecimalsParsing(Ljava/lang/String;I)Z

    move-result v0

    return v0

    .line 734
    :cond_3
    invoke-static {p0, v1}, Lorg/apache/commons/lang3/math/NumberUtils;->withDecimalsParsing(Ljava/lang/String;I)Z

    move-result v0

    return v0
.end method

.method private static isZero(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 1
    .param p0, "mant"    # Ljava/lang/String;
    .param p1, "dec"    # Ljava/lang/String;

    .line 764
    invoke-static {p0}, Lorg/apache/commons/lang3/math/NumberUtils;->isAllZeros(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p1}, Lorg/apache/commons/lang3/math/NumberUtils;->isAllZeros(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public static max(BBB)B
    .locals 0
    .param p0, "a"    # B
    .param p1, "b"    # B
    .param p2, "c"    # B

    .line 800
    if-le p1, p0, :cond_0

    .line 801
    move p0, p1

    .line 803
    :cond_0
    if-le p2, p0, :cond_1

    .line 804
    move p0, p2

    .line 806
    :cond_1
    return p0
.end method

.method public static varargs max([B)B
    .locals 3
    .param p0, "array"    # [B

    .line 778
    invoke-static {p0}, Lorg/apache/commons/lang3/math/NumberUtils;->validateArray(Ljava/lang/Object;)V

    .line 781
    const/4 v0, 0x0

    aget-byte v0, p0, v0

    .line 782
    .local v0, "max":B
    const/4 v1, 0x1

    .local v1, "i":I
    :goto_0
    array-length v2, p0

    if-ge v1, v2, :cond_1

    .line 783
    aget-byte v2, p0, v1

    if-le v2, v0, :cond_0

    .line 784
    aget-byte v0, p0, v1

    .line 782
    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 788
    .end local v1    # "i":I
    :cond_1
    return v0
.end method

.method public static max(DDD)D
    .locals 2
    .param p0, "a"    # D
    .param p2, "b"    # D
    .param p4, "c"    # D

    .line 850
    invoke-static {p0, p1, p2, p3}, Ljava/lang/Math;->max(DD)D

    move-result-wide v0

    invoke-static {v0, v1, p4, p5}, Ljava/lang/Math;->max(DD)D

    move-result-wide v0

    return-wide v0
.end method

.method public static varargs max([D)D
    .locals 5
    .param p0, "array"    # [D

    .line 821
    invoke-static {p0}, Lorg/apache/commons/lang3/math/NumberUtils;->validateArray(Ljava/lang/Object;)V

    .line 824
    const/4 v0, 0x0

    aget-wide v0, p0, v0

    .line 825
    .local v0, "max":D
    const/4 v2, 0x1

    .local v2, "j":I
    :goto_0
    array-length v3, p0

    if-ge v2, v3, :cond_2

    .line 826
    aget-wide v3, p0, v2

    invoke-static {v3, v4}, Ljava/lang/Double;->isNaN(D)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 827
    const-wide/high16 v3, 0x7ff8000000000000L    # Double.NaN

    return-wide v3

    .line 829
    :cond_0
    aget-wide v3, p0, v2

    cmpl-double v3, v3, v0

    if-lez v3, :cond_1

    .line 830
    aget-wide v0, p0, v2

    .line 825
    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 834
    .end local v2    # "j":I
    :cond_2
    return-wide v0
.end method

.method public static max(FFF)F
    .locals 1
    .param p0, "a"    # F
    .param p1, "b"    # F
    .param p2, "c"    # F

    .line 929
    invoke-static {p0, p1}, Ljava/lang/Math;->max(FF)F

    move-result v0

    invoke-static {v0, p2}, Ljava/lang/Math;->max(FF)F

    move-result v0

    return v0
.end method

.method public static varargs max([F)F
    .locals 3
    .param p0, "array"    # [F

    .line 865
    invoke-static {p0}, Lorg/apache/commons/lang3/math/NumberUtils;->validateArray(Ljava/lang/Object;)V

    .line 868
    const/4 v0, 0x0

    aget v0, p0, v0

    .line 869
    .local v0, "max":F
    const/4 v1, 0x1

    .local v1, "j":I
    :goto_0
    array-length v2, p0

    if-ge v1, v2, :cond_2

    .line 870
    aget v2, p0, v1

    invoke-static {v2}, Ljava/lang/Float;->isNaN(F)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 871
    const/high16 v2, 0x7fc00000    # Float.NaN

    return v2

    .line 873
    :cond_0
    aget v2, p0, v1

    cmpl-float v2, v2, v0

    if-lez v2, :cond_1

    .line 874
    aget v0, p0, v1

    .line 869
    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 878
    .end local v1    # "j":I
    :cond_2
    return v0
.end method

.method public static max(III)I
    .locals 0
    .param p0, "a"    # I
    .param p1, "b"    # I
    .param p2, "c"    # I

    .line 965
    if-le p1, p0, :cond_0

    .line 966
    move p0, p1

    .line 968
    :cond_0
    if-le p2, p0, :cond_1

    .line 969
    move p0, p2

    .line 971
    :cond_1
    return p0
.end method

.method public static varargs max([I)I
    .locals 3
    .param p0, "array"    # [I

    .line 943
    invoke-static {p0}, Lorg/apache/commons/lang3/math/NumberUtils;->validateArray(Ljava/lang/Object;)V

    .line 946
    const/4 v0, 0x0

    aget v0, p0, v0

    .line 947
    .local v0, "max":I
    const/4 v1, 0x1

    .local v1, "j":I
    :goto_0
    array-length v2, p0

    if-ge v1, v2, :cond_1

    .line 948
    aget v2, p0, v1

    if-le v2, v0, :cond_0

    .line 949
    aget v0, p0, v1

    .line 947
    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 953
    .end local v1    # "j":I
    :cond_1
    return v0
.end method

.method public static max(JJJ)J
    .locals 1
    .param p0, "a"    # J
    .param p2, "b"    # J
    .param p4, "c"    # J

    .line 1008
    cmp-long v0, p2, p0

    if-lez v0, :cond_0

    .line 1009
    move-wide p0, p2

    .line 1011
    :cond_0
    cmp-long v0, p4, p0

    if-lez v0, :cond_1

    .line 1012
    move-wide p0, p4

    .line 1014
    :cond_1
    return-wide p0
.end method

.method public static varargs max([J)J
    .locals 5
    .param p0, "array"    # [J

    .line 985
    invoke-static {p0}, Lorg/apache/commons/lang3/math/NumberUtils;->validateArray(Ljava/lang/Object;)V

    .line 988
    const/4 v0, 0x0

    aget-wide v0, p0, v0

    .line 989
    .local v0, "max":J
    const/4 v2, 0x1

    .local v2, "j":I
    :goto_0
    array-length v3, p0

    if-ge v2, v3, :cond_1

    .line 990
    aget-wide v3, p0, v2

    cmp-long v3, v3, v0

    if-lez v3, :cond_0

    .line 991
    aget-wide v0, p0, v2

    .line 989
    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 995
    .end local v2    # "j":I
    :cond_1
    return-wide v0
.end method

.method public static max(SSS)S
    .locals 0
    .param p0, "a"    # S
    .param p1, "b"    # S
    .param p2, "c"    # S

    .line 1050
    if-le p1, p0, :cond_0

    .line 1051
    move p0, p1

    .line 1053
    :cond_0
    if-le p2, p0, :cond_1

    .line 1054
    move p0, p2

    .line 1056
    :cond_1
    return p0
.end method

.method public static varargs max([S)S
    .locals 3
    .param p0, "array"    # [S

    .line 1028
    invoke-static {p0}, Lorg/apache/commons/lang3/math/NumberUtils;->validateArray(Ljava/lang/Object;)V

    .line 1031
    const/4 v0, 0x0

    aget-short v0, p0, v0

    .line 1032
    .local v0, "max":S
    const/4 v1, 0x1

    .local v1, "i":I
    :goto_0
    array-length v2, p0

    if-ge v1, v2, :cond_1

    .line 1033
    aget-short v2, p0, v1

    if-le v2, v0, :cond_0

    .line 1034
    aget-short v0, p0, v1

    .line 1032
    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 1038
    .end local v1    # "i":I
    :cond_1
    return v0
.end method

.method public static min(BBB)B
    .locals 0
    .param p0, "a"    # B
    .param p1, "b"    # B
    .param p2, "c"    # B

    .line 1092
    if-ge p1, p0, :cond_0

    .line 1093
    move p0, p1

    .line 1095
    :cond_0
    if-ge p2, p0, :cond_1

    .line 1096
    move p0, p2

    .line 1098
    :cond_1
    return p0
.end method

.method public static varargs min([B)B
    .locals 3
    .param p0, "array"    # [B

    .line 1070
    invoke-static {p0}, Lorg/apache/commons/lang3/math/NumberUtils;->validateArray(Ljava/lang/Object;)V

    .line 1073
    const/4 v0, 0x0

    aget-byte v0, p0, v0

    .line 1074
    .local v0, "min":B
    const/4 v1, 0x1

    .local v1, "i":I
    :goto_0
    array-length v2, p0

    if-ge v1, v2, :cond_1

    .line 1075
    aget-byte v2, p0, v1

    if-ge v2, v0, :cond_0

    .line 1076
    aget-byte v0, p0, v1

    .line 1074
    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 1080
    .end local v1    # "i":I
    :cond_1
    return v0
.end method

.method public static min(DDD)D
    .locals 2
    .param p0, "a"    # D
    .param p2, "b"    # D
    .param p4, "c"    # D

    .line 1142
    invoke-static {p0, p1, p2, p3}, Ljava/lang/Math;->min(DD)D

    move-result-wide v0

    invoke-static {v0, v1, p4, p5}, Ljava/lang/Math;->min(DD)D

    move-result-wide v0

    return-wide v0
.end method

.method public static varargs min([D)D
    .locals 5
    .param p0, "array"    # [D

    .line 1113
    invoke-static {p0}, Lorg/apache/commons/lang3/math/NumberUtils;->validateArray(Ljava/lang/Object;)V

    .line 1116
    const/4 v0, 0x0

    aget-wide v0, p0, v0

    .line 1117
    .local v0, "min":D
    const/4 v2, 0x1

    .local v2, "i":I
    :goto_0
    array-length v3, p0

    if-ge v2, v3, :cond_2

    .line 1118
    aget-wide v3, p0, v2

    invoke-static {v3, v4}, Ljava/lang/Double;->isNaN(D)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 1119
    const-wide/high16 v3, 0x7ff8000000000000L    # Double.NaN

    return-wide v3

    .line 1121
    :cond_0
    aget-wide v3, p0, v2

    cmpg-double v3, v3, v0

    if-gez v3, :cond_1

    .line 1122
    aget-wide v0, p0, v2

    .line 1117
    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 1126
    .end local v2    # "i":I
    :cond_2
    return-wide v0
.end method

.method public static min(FFF)F
    .locals 1
    .param p0, "a"    # F
    .param p1, "b"    # F
    .param p2, "c"    # F

    .line 1186
    invoke-static {p0, p1}, Ljava/lang/Math;->min(FF)F

    move-result v0

    invoke-static {v0, p2}, Ljava/lang/Math;->min(FF)F

    move-result v0

    return v0
.end method

.method public static varargs min([F)F
    .locals 3
    .param p0, "array"    # [F

    .line 1157
    invoke-static {p0}, Lorg/apache/commons/lang3/math/NumberUtils;->validateArray(Ljava/lang/Object;)V

    .line 1160
    const/4 v0, 0x0

    aget v0, p0, v0

    .line 1161
    .local v0, "min":F
    const/4 v1, 0x1

    .local v1, "i":I
    :goto_0
    array-length v2, p0

    if-ge v1, v2, :cond_2

    .line 1162
    aget v2, p0, v1

    invoke-static {v2}, Ljava/lang/Float;->isNaN(F)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 1163
    const/high16 v2, 0x7fc00000    # Float.NaN

    return v2

    .line 1165
    :cond_0
    aget v2, p0, v1

    cmpg-float v2, v2, v0

    if-gez v2, :cond_1

    .line 1166
    aget v0, p0, v1

    .line 1161
    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 1170
    .end local v1    # "i":I
    :cond_2
    return v0
.end method

.method public static min(III)I
    .locals 0
    .param p0, "a"    # I
    .param p1, "b"    # I
    .param p2, "c"    # I

    .line 1222
    if-ge p1, p0, :cond_0

    .line 1223
    move p0, p1

    .line 1225
    :cond_0
    if-ge p2, p0, :cond_1

    .line 1226
    move p0, p2

    .line 1228
    :cond_1
    return p0
.end method

.method public static varargs min([I)I
    .locals 3
    .param p0, "array"    # [I

    .line 1200
    invoke-static {p0}, Lorg/apache/commons/lang3/math/NumberUtils;->validateArray(Ljava/lang/Object;)V

    .line 1203
    const/4 v0, 0x0

    aget v0, p0, v0

    .line 1204
    .local v0, "min":I
    const/4 v1, 0x1

    .local v1, "j":I
    :goto_0
    array-length v2, p0

    if-ge v1, v2, :cond_1

    .line 1205
    aget v2, p0, v1

    if-ge v2, v0, :cond_0

    .line 1206
    aget v0, p0, v1

    .line 1204
    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 1210
    .end local v1    # "j":I
    :cond_1
    return v0
.end method

.method public static min(JJJ)J
    .locals 1
    .param p0, "a"    # J
    .param p2, "b"    # J
    .param p4, "c"    # J

    .line 1265
    cmp-long v0, p2, p0

    if-gez v0, :cond_0

    .line 1266
    move-wide p0, p2

    .line 1268
    :cond_0
    cmp-long v0, p4, p0

    if-gez v0, :cond_1

    .line 1269
    move-wide p0, p4

    .line 1271
    :cond_1
    return-wide p0
.end method

.method public static varargs min([J)J
    .locals 5
    .param p0, "array"    # [J

    .line 1242
    invoke-static {p0}, Lorg/apache/commons/lang3/math/NumberUtils;->validateArray(Ljava/lang/Object;)V

    .line 1245
    const/4 v0, 0x0

    aget-wide v0, p0, v0

    .line 1246
    .local v0, "min":J
    const/4 v2, 0x1

    .local v2, "i":I
    :goto_0
    array-length v3, p0

    if-ge v2, v3, :cond_1

    .line 1247
    aget-wide v3, p0, v2

    cmp-long v3, v3, v0

    if-gez v3, :cond_0

    .line 1248
    aget-wide v0, p0, v2

    .line 1246
    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 1252
    .end local v2    # "i":I
    :cond_1
    return-wide v0
.end method

.method public static min(SSS)S
    .locals 0
    .param p0, "a"    # S
    .param p1, "b"    # S
    .param p2, "c"    # S

    .line 1307
    if-ge p1, p0, :cond_0

    .line 1308
    move p0, p1

    .line 1310
    :cond_0
    if-ge p2, p0, :cond_1

    .line 1311
    move p0, p2

    .line 1313
    :cond_1
    return p0
.end method

.method public static varargs min([S)S
    .locals 3
    .param p0, "array"    # [S

    .line 1285
    invoke-static {p0}, Lorg/apache/commons/lang3/math/NumberUtils;->validateArray(Ljava/lang/Object;)V

    .line 1288
    const/4 v0, 0x0

    aget-short v0, p0, v0

    .line 1289
    .local v0, "min":S
    const/4 v1, 0x1

    .local v1, "i":I
    :goto_0
    array-length v2, p0

    if-ge v1, v2, :cond_1

    .line 1290
    aget-short v2, p0, v1

    if-ge v2, v0, :cond_0

    .line 1291
    aget-short v0, p0, v1

    .line 1289
    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 1295
    .end local v1    # "i":I
    :cond_1
    return v0
.end method

.method public static toByte(Ljava/lang/String;)B
    .locals 1
    .param p0, "str"    # Ljava/lang/String;

    .line 1334
    const/4 v0, 0x0

    invoke-static {p0, v0}, Lorg/apache/commons/lang3/math/NumberUtils;->toByte(Ljava/lang/String;B)B

    move-result v0

    return v0
.end method

.method public static toByte(Ljava/lang/String;B)B
    .locals 1
    .param p0, "str"    # Ljava/lang/String;
    .param p1, "defaultValue"    # B

    .line 1355
    if-nez p0, :cond_0

    .line 1356
    return p1

    .line 1359
    :cond_0
    :try_start_0
    invoke-static {p0}, Ljava/lang/Byte;->parseByte(Ljava/lang/String;)B

    move-result v0
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    return v0

    .line 1360
    :catch_0
    move-exception v0

    .line 1361
    .local v0, "nfe":Ljava/lang/NumberFormatException;
    return p1
.end method

.method public static toDouble(Ljava/lang/String;)D
    .locals 2
    .param p0, "str"    # Ljava/lang/String;

    .line 1425
    const-wide/16 v0, 0x0

    invoke-static {p0, v0, v1}, Lorg/apache/commons/lang3/math/NumberUtils;->toDouble(Ljava/lang/String;D)D

    move-result-wide v0

    return-wide v0
.end method

.method public static toDouble(Ljava/lang/String;D)D
    .locals 2
    .param p0, "str"    # Ljava/lang/String;
    .param p1, "defaultValue"    # D

    .line 1448
    if-nez p0, :cond_0

    .line 1449
    return-wide p1

    .line 1452
    :cond_0
    :try_start_0
    invoke-static {p0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v0
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    return-wide v0

    .line 1453
    :catch_0
    move-exception v0

    .line 1454
    .local v0, "nfe":Ljava/lang/NumberFormatException;
    return-wide p1
.end method

.method public static toDouble(Ljava/math/BigDecimal;)D
    .locals 2
    .param p0, "value"    # Ljava/math/BigDecimal;

    .line 1382
    const-wide/16 v0, 0x0

    invoke-static {p0, v0, v1}, Lorg/apache/commons/lang3/math/NumberUtils;->toDouble(Ljava/math/BigDecimal;D)D

    move-result-wide v0

    return-wide v0
.end method

.method public static toDouble(Ljava/math/BigDecimal;D)D
    .locals 2
    .param p0, "value"    # Ljava/math/BigDecimal;
    .param p1, "defaultValue"    # D

    .line 1403
    if-nez p0, :cond_0

    move-wide v0, p1

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Ljava/math/BigDecimal;->doubleValue()D

    move-result-wide v0

    :goto_0
    return-wide v0
.end method

.method public static toFloat(Ljava/lang/String;)F
    .locals 1
    .param p0, "str"    # Ljava/lang/String;

    .line 1477
    const/4 v0, 0x0

    invoke-static {p0, v0}, Lorg/apache/commons/lang3/math/NumberUtils;->toFloat(Ljava/lang/String;F)F

    move-result v0

    return v0
.end method

.method public static toFloat(Ljava/lang/String;F)F
    .locals 1
    .param p0, "str"    # Ljava/lang/String;
    .param p1, "defaultValue"    # F

    .line 1500
    if-nez p0, :cond_0

    .line 1501
    return p1

    .line 1504
    :cond_0
    :try_start_0
    invoke-static {p0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v0
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    return v0

    .line 1505
    :catch_0
    move-exception v0

    .line 1506
    .local v0, "nfe":Ljava/lang/NumberFormatException;
    return p1
.end method

.method public static toInt(Ljava/lang/String;)I
    .locals 1
    .param p0, "str"    # Ljava/lang/String;

    .line 1528
    const/4 v0, 0x0

    invoke-static {p0, v0}, Lorg/apache/commons/lang3/math/NumberUtils;->toInt(Ljava/lang/String;I)I

    move-result v0

    return v0
.end method

.method public static toInt(Ljava/lang/String;I)I
    .locals 1
    .param p0, "str"    # Ljava/lang/String;
    .param p1, "defaultValue"    # I

    .line 1549
    if-nez p0, :cond_0

    .line 1550
    return p1

    .line 1553
    :cond_0
    :try_start_0
    invoke-static {p0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    return v0

    .line 1554
    :catch_0
    move-exception v0

    .line 1555
    .local v0, "nfe":Ljava/lang/NumberFormatException;
    return p1
.end method

.method public static toLong(Ljava/lang/String;)J
    .locals 2
    .param p0, "str"    # Ljava/lang/String;

    .line 1577
    const-wide/16 v0, 0x0

    invoke-static {p0, v0, v1}, Lorg/apache/commons/lang3/math/NumberUtils;->toLong(Ljava/lang/String;J)J

    move-result-wide v0

    return-wide v0
.end method

.method public static toLong(Ljava/lang/String;J)J
    .locals 2
    .param p0, "str"    # Ljava/lang/String;
    .param p1, "defaultValue"    # J

    .line 1598
    if-nez p0, :cond_0

    .line 1599
    return-wide p1

    .line 1602
    :cond_0
    :try_start_0
    invoke-static {p0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    return-wide v0

    .line 1603
    :catch_0
    move-exception v0

    .line 1604
    .local v0, "nfe":Ljava/lang/NumberFormatException;
    return-wide p1
.end method

.method public static toScaledBigDecimal(Ljava/lang/Double;)Ljava/math/BigDecimal;
    .locals 2
    .param p0, "value"    # Ljava/lang/Double;

    .line 1659
    sget-object v0, Lorg/apache/commons/lang3/math/NumberUtils;->INTEGER_TWO:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    sget-object v1, Ljava/math/RoundingMode;->HALF_EVEN:Ljava/math/RoundingMode;

    invoke-static {p0, v0, v1}, Lorg/apache/commons/lang3/math/NumberUtils;->toScaledBigDecimal(Ljava/lang/Double;ILjava/math/RoundingMode;)Ljava/math/BigDecimal;

    move-result-object v0

    return-object v0
.end method

.method public static toScaledBigDecimal(Ljava/lang/Double;ILjava/math/RoundingMode;)Ljava/math/BigDecimal;
    .locals 2
    .param p0, "value"    # Ljava/lang/Double;
    .param p1, "scale"    # I
    .param p2, "roundingMode"    # Ljava/math/RoundingMode;

    .line 1675
    if-nez p0, :cond_0

    .line 1676
    sget-object v0, Ljava/math/BigDecimal;->ZERO:Ljava/math/BigDecimal;

    return-object v0

    .line 1678
    :cond_0
    nop

    .line 1679
    invoke-virtual {p0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/math/BigDecimal;->valueOf(D)Ljava/math/BigDecimal;

    move-result-object v0

    .line 1678
    invoke-static {v0, p1, p2}, Lorg/apache/commons/lang3/math/NumberUtils;->toScaledBigDecimal(Ljava/math/BigDecimal;ILjava/math/RoundingMode;)Ljava/math/BigDecimal;

    move-result-object v0

    return-object v0
.end method

.method public static toScaledBigDecimal(Ljava/lang/Float;)Ljava/math/BigDecimal;
    .locals 2
    .param p0, "value"    # Ljava/lang/Float;

    .line 1698
    sget-object v0, Lorg/apache/commons/lang3/math/NumberUtils;->INTEGER_TWO:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    sget-object v1, Ljava/math/RoundingMode;->HALF_EVEN:Ljava/math/RoundingMode;

    invoke-static {p0, v0, v1}, Lorg/apache/commons/lang3/math/NumberUtils;->toScaledBigDecimal(Ljava/lang/Float;ILjava/math/RoundingMode;)Ljava/math/BigDecimal;

    move-result-object v0

    return-object v0
.end method

.method public static toScaledBigDecimal(Ljava/lang/Float;ILjava/math/RoundingMode;)Ljava/math/BigDecimal;
    .locals 2
    .param p0, "value"    # Ljava/lang/Float;
    .param p1, "scale"    # I
    .param p2, "roundingMode"    # Ljava/math/RoundingMode;

    .line 1714
    if-nez p0, :cond_0

    .line 1715
    sget-object v0, Ljava/math/BigDecimal;->ZERO:Ljava/math/BigDecimal;

    return-object v0

    .line 1717
    :cond_0
    nop

    .line 1718
    invoke-virtual {p0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    float-to-double v0, v0

    invoke-static {v0, v1}, Ljava/math/BigDecimal;->valueOf(D)Ljava/math/BigDecimal;

    move-result-object v0

    .line 1717
    invoke-static {v0, p1, p2}, Lorg/apache/commons/lang3/math/NumberUtils;->toScaledBigDecimal(Ljava/math/BigDecimal;ILjava/math/RoundingMode;)Ljava/math/BigDecimal;

    move-result-object v0

    return-object v0
.end method

.method public static toScaledBigDecimal(Ljava/lang/String;)Ljava/math/BigDecimal;
    .locals 2
    .param p0, "value"    # Ljava/lang/String;

    .line 1737
    sget-object v0, Lorg/apache/commons/lang3/math/NumberUtils;->INTEGER_TWO:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    sget-object v1, Ljava/math/RoundingMode;->HALF_EVEN:Ljava/math/RoundingMode;

    invoke-static {p0, v0, v1}, Lorg/apache/commons/lang3/math/NumberUtils;->toScaledBigDecimal(Ljava/lang/String;ILjava/math/RoundingMode;)Ljava/math/BigDecimal;

    move-result-object v0

    return-object v0
.end method

.method public static toScaledBigDecimal(Ljava/lang/String;ILjava/math/RoundingMode;)Ljava/math/BigDecimal;
    .locals 1
    .param p0, "value"    # Ljava/lang/String;
    .param p1, "scale"    # I
    .param p2, "roundingMode"    # Ljava/math/RoundingMode;

    .line 1753
    if-nez p0, :cond_0

    .line 1754
    sget-object v0, Ljava/math/BigDecimal;->ZERO:Ljava/math/BigDecimal;

    return-object v0

    .line 1756
    :cond_0
    nop

    .line 1757
    invoke-static {p0}, Lorg/apache/commons/lang3/math/NumberUtils;->createBigDecimal(Ljava/lang/String;)Ljava/math/BigDecimal;

    move-result-object v0

    .line 1756
    invoke-static {v0, p1, p2}, Lorg/apache/commons/lang3/math/NumberUtils;->toScaledBigDecimal(Ljava/math/BigDecimal;ILjava/math/RoundingMode;)Ljava/math/BigDecimal;

    move-result-object v0

    return-object v0
.end method

.method public static toScaledBigDecimal(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;
    .locals 2
    .param p0, "value"    # Ljava/math/BigDecimal;

    .line 1621
    sget-object v0, Lorg/apache/commons/lang3/math/NumberUtils;->INTEGER_TWO:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    sget-object v1, Ljava/math/RoundingMode;->HALF_EVEN:Ljava/math/RoundingMode;

    invoke-static {p0, v0, v1}, Lorg/apache/commons/lang3/math/NumberUtils;->toScaledBigDecimal(Ljava/math/BigDecimal;ILjava/math/RoundingMode;)Ljava/math/BigDecimal;

    move-result-object v0

    return-object v0
.end method

.method public static toScaledBigDecimal(Ljava/math/BigDecimal;ILjava/math/RoundingMode;)Ljava/math/BigDecimal;
    .locals 1
    .param p0, "value"    # Ljava/math/BigDecimal;
    .param p1, "scale"    # I
    .param p2, "roundingMode"    # Ljava/math/RoundingMode;

    .line 1637
    if-nez p0, :cond_0

    .line 1638
    sget-object v0, Ljava/math/BigDecimal;->ZERO:Ljava/math/BigDecimal;

    return-object v0

    .line 1640
    :cond_0
    nop

    .line 1642
    if-nez p2, :cond_1

    sget-object v0, Ljava/math/RoundingMode;->HALF_EVEN:Ljava/math/RoundingMode;

    goto :goto_0

    :cond_1
    move-object v0, p2

    .line 1640
    :goto_0
    invoke-virtual {p0, p1, v0}, Ljava/math/BigDecimal;->setScale(ILjava/math/RoundingMode;)Ljava/math/BigDecimal;

    move-result-object v0

    return-object v0
.end method

.method public static toShort(Ljava/lang/String;)S
    .locals 1
    .param p0, "str"    # Ljava/lang/String;

    .line 1781
    const/4 v0, 0x0

    invoke-static {p0, v0}, Lorg/apache/commons/lang3/math/NumberUtils;->toShort(Ljava/lang/String;S)S

    move-result v0

    return v0
.end method

.method public static toShort(Ljava/lang/String;S)S
    .locals 1
    .param p0, "str"    # Ljava/lang/String;
    .param p1, "defaultValue"    # S

    .line 1802
    if-nez p0, :cond_0

    .line 1803
    return p1

    .line 1806
    :cond_0
    :try_start_0
    invoke-static {p0}, Ljava/lang/Short;->parseShort(Ljava/lang/String;)S

    move-result v0
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    return v0

    .line 1807
    :catch_0
    move-exception v0

    .line 1808
    .local v0, "nfe":Ljava/lang/NumberFormatException;
    return p1
.end method

.method private static validateArray(Ljava/lang/Object;)V
    .locals 3
    .param p0, "array"    # Ljava/lang/Object;

    .line 1820
    const-string v0, "array"

    invoke-static {p0, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 1821
    invoke-static {p0}, Ljava/lang/reflect/Array;->getLength(Ljava/lang/Object;)I

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    const-string v2, "Array cannot be empty."

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v2, v1}, Lorg/apache/commons/lang3/Validate;->isTrue(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 1822
    return-void
.end method

.method private static withDecimalsParsing(Ljava/lang/String;I)Z
    .locals 6
    .param p0, "str"    # Ljava/lang/String;
    .param p1, "beginIdx"    # I

    .line 1825
    const/4 v0, 0x0

    .line 1826
    .local v0, "decimalPoints":I
    move v1, p1

    .local v1, "i":I
    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v2

    const/4 v3, 0x1

    if-ge v1, v2, :cond_4

    .line 1827
    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v2

    const/16 v4, 0x2e

    const/4 v5, 0x0

    if-ne v2, v4, :cond_0

    move v2, v3

    goto :goto_1

    :cond_0
    move v2, v5

    .line 1828
    .local v2, "isDecimalPoint":Z
    :goto_1
    if-eqz v2, :cond_1

    .line 1829
    add-int/lit8 v0, v0, 0x1

    .line 1831
    :cond_1
    if-le v0, v3, :cond_2

    .line 1832
    return v5

    .line 1834
    :cond_2
    if-nez v2, :cond_3

    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v3

    invoke-static {v3}, Ljava/lang/Character;->isDigit(C)Z

    move-result v3

    if-nez v3, :cond_3

    .line 1835
    return v5

    .line 1826
    .end local v2    # "isDecimalPoint":Z
    :cond_3
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 1838
    .end local v1    # "i":I
    :cond_4
    return v3
.end method
