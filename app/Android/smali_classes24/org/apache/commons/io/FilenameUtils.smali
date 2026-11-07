.class public Lorg/apache/commons/io/FilenameUtils;
.super Ljava/lang/Object;
.source "FilenameUtils.java"


# static fields
.field private static final BASE_16:I = 0x10

.field private static final EMPTY_STRING:Ljava/lang/String; = ""

.field private static final EMPTY_STRING_ARRAY:[Ljava/lang/String;

.field public static final EXTENSION_SEPARATOR:C = '.'

.field public static final EXTENSION_SEPARATOR_STR:Ljava/lang/String;

.field private static final IPV4_MAX_OCTET_VALUE:I = 0xff

.field private static final IPV4_PATTERN:Ljava/util/regex/Pattern;

.field private static final IPV6_MAX_HEX_DIGITS_PER_GROUP:I = 0x4

.field private static final IPV6_MAX_HEX_GROUPS:I = 0x8

.field private static final MAX_UNSIGNED_SHORT:I = 0xffff

.field private static final NOT_FOUND:I = -0x1

.field private static final OTHER_SEPARATOR:C

.field private static final REG_NAME_PART_PATTERN:Ljava/util/regex/Pattern;

.field private static final SYSTEM_NAME_SEPARATOR:C

.field private static final UNIX_NAME_SEPARATOR:C = '/'

.field private static final WINDOWS_NAME_SEPARATOR:C = '\\'


# direct methods
.method public static synthetic $r8$lambda$7lpm9zkoZuDoAjfOA0iYE2U94XQ(Ljava/lang/String;Ljava/lang/Object;)Z
    .locals 0

    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method static constructor <clinit>()V
    .locals 1

    .line 100
    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/String;

    sput-object v0, Lorg/apache/commons/io/FilenameUtils;->EMPTY_STRING_ARRAY:[Ljava/lang/String;

    .line 116
    const/16 v0, 0x2e

    invoke-static {v0}, Ljava/lang/Character;->toString(C)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lorg/apache/commons/io/FilenameUtils;->EXTENSION_SEPARATOR_STR:Ljava/lang/String;

    .line 131
    sget-char v0, Ljava/io/File;->separatorChar:C

    sput-char v0, Lorg/apache/commons/io/FilenameUtils;->SYSTEM_NAME_SEPARATOR:C

    .line 136
    sget-char v0, Lorg/apache/commons/io/FilenameUtils;->SYSTEM_NAME_SEPARATOR:C

    invoke-static {v0}, Lorg/apache/commons/io/FilenameUtils;->flipSeparator(C)C

    move-result v0

    sput-char v0, Lorg/apache/commons/io/FilenameUtils;->OTHER_SEPARATOR:C

    .line 138
    const-string v0, "^(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})$"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lorg/apache/commons/io/FilenameUtils;->IPV4_PATTERN:Ljava/util/regex/Pattern;

    .line 150
    const-string v0, "^[a-zA-Z0-9][a-zA-Z0-9-]*$"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lorg/apache/commons/io/FilenameUtils;->REG_NAME_PART_PATTERN:Ljava/util/regex/Pattern;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1681
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1682
    return-void
.end method

.method public static concat(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 5
    .param p0, "basePath"    # Ljava/lang/String;
    .param p1, "fullFileNameToAdd"    # Ljava/lang/String;

    .line 202
    invoke-static {p1}, Lorg/apache/commons/io/FilenameUtils;->getPrefixLength(Ljava/lang/String;)I

    move-result v0

    .line 203
    .local v0, "prefix":I
    const/4 v1, 0x0

    if-gez v0, :cond_0

    .line 204
    return-object v1

    .line 206
    :cond_0
    if-lez v0, :cond_1

    .line 207
    invoke-static {p1}, Lorg/apache/commons/io/FilenameUtils;->normalize(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    return-object v1

    .line 209
    :cond_1
    if-nez p0, :cond_2

    .line 210
    return-object v1

    .line 212
    :cond_2
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    .line 213
    .local v1, "len":I
    if-nez v1, :cond_3

    .line 214
    invoke-static {p1}, Lorg/apache/commons/io/FilenameUtils;->normalize(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    return-object v2

    .line 216
    :cond_3
    add-int/lit8 v2, v1, -0x1

    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    move-result v2

    .line 217
    .local v2, "ch":C
    invoke-static {v2}, Lorg/apache/commons/io/FilenameUtils;->isSeparator(C)Z

    move-result v3

    if-eqz v3, :cond_4

    .line 218
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lorg/apache/commons/io/FilenameUtils;->normalize(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    return-object v3

    .line 220
    :cond_4
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const/16 v4, 0x2f

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lorg/apache/commons/io/FilenameUtils;->normalize(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    return-object v3
.end method

.method public static directoryContains(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 4
    .param p0, "canonicalParent"    # Ljava/lang/String;
    .param p1, "canonicalChild"    # Ljava/lang/String;

    .line 245
    invoke-static {p0}, Lorg/apache/commons/io/FilenameUtils;->isEmpty(Ljava/lang/String;)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_4

    invoke-static {p1}, Lorg/apache/commons/io/FilenameUtils;->isEmpty(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    .line 249
    :cond_0
    sget-object v0, Lorg/apache/commons/io/IOCase;->SYSTEM:Lorg/apache/commons/io/IOCase;

    invoke-virtual {v0, p0, p1}, Lorg/apache/commons/io/IOCase;->checkEquals(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 250
    return v1

    .line 253
    :cond_1
    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v0

    const/16 v2, 0x2f

    const/4 v3, 0x1

    if-ne v0, v2, :cond_2

    move v1, v3

    :cond_2
    invoke-static {v1}, Lorg/apache/commons/io/FilenameUtils;->toSeparator(Z)C

    move-result v0

    .line 254
    .local v0, "separator":C
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    sub-int/2addr v1, v3

    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v1

    if-ne v1, v0, :cond_3

    move-object v1, p0

    goto :goto_0

    :cond_3
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 256
    .local v1, "parentWithEndSeparator":Ljava/lang/String;
    :goto_0
    sget-object v2, Lorg/apache/commons/io/IOCase;->SYSTEM:Lorg/apache/commons/io/IOCase;

    invoke-virtual {v2, p1, v1}, Lorg/apache/commons/io/IOCase;->checkStartsWith(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v2

    return v2

    .line 246
    .end local v0    # "separator":C
    .end local v1    # "parentWithEndSeparator":Ljava/lang/String;
    :cond_4
    :goto_1
    return v1
.end method

.method private static doGetFullPath(Ljava/lang/String;Z)Ljava/lang/String;
    .locals 4
    .param p0, "fileName"    # Ljava/lang/String;
    .param p1, "includeSeparator"    # Z

    .line 268
    const/4 v0, 0x0

    if-nez p0, :cond_0

    .line 269
    return-object v0

    .line 271
    :cond_0
    invoke-static {p0}, Lorg/apache/commons/io/FilenameUtils;->getPrefixLength(Ljava/lang/String;)I

    move-result v1

    .line 272
    .local v1, "prefix":I
    if-gez v1, :cond_1

    .line 273
    return-object v0

    .line 275
    :cond_1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    if-lt v1, v0, :cond_3

    .line 276
    if-eqz p1, :cond_2

    .line 277
    invoke-static {p0}, Lorg/apache/commons/io/FilenameUtils;->getPrefix(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 279
    :cond_2
    return-object p0

    .line 281
    :cond_3
    invoke-static {p0}, Lorg/apache/commons/io/FilenameUtils;->indexOfLastSeparator(Ljava/lang/String;)I

    move-result v0

    .line 282
    .local v0, "index":I
    const/4 v2, 0x0

    if-gez v0, :cond_4

    .line 283
    invoke-virtual {p0, v2, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    return-object v2

    .line 285
    :cond_4
    add-int v3, v0, p1

    .line 286
    .local v3, "end":I
    if-nez v3, :cond_5

    .line 287
    add-int/lit8 v3, v3, 0x1

    .line 289
    :cond_5
    invoke-virtual {p0, v2, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    return-object v2
.end method

.method private static doGetPath(Ljava/lang/String;I)Ljava/lang/String;
    .locals 4
    .param p0, "fileName"    # Ljava/lang/String;
    .param p1, "separatorAdd"    # I

    .line 301
    const/4 v0, 0x0

    if-nez p0, :cond_0

    .line 302
    return-object v0

    .line 304
    :cond_0
    invoke-static {p0}, Lorg/apache/commons/io/FilenameUtils;->getPrefixLength(Ljava/lang/String;)I

    move-result v1

    .line 305
    .local v1, "prefix":I
    if-gez v1, :cond_1

    .line 306
    return-object v0

    .line 308
    :cond_1
    invoke-static {p0}, Lorg/apache/commons/io/FilenameUtils;->indexOfLastSeparator(Ljava/lang/String;)I

    move-result v0

    .line 309
    .local v0, "index":I
    add-int v2, v0, p1

    .line 310
    .local v2, "endIndex":I
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v3

    if-ge v1, v3, :cond_3

    if-ltz v0, :cond_3

    if-lt v1, v2, :cond_2

    goto :goto_0

    .line 313
    :cond_2
    invoke-virtual {p0, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lorg/apache/commons/io/FilenameUtils;->requireNonNullChars(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    return-object v3

    .line 311
    :cond_3
    :goto_0
    const-string v3, ""

    return-object v3
.end method

.method private static doNormalize(Ljava/lang/String;CZ)Ljava/lang/String;
    .locals 16
    .param p0, "fileName"    # Ljava/lang/String;
    .param p1, "separator"    # C
    .param p2, "keepSeparator"    # Z

    .line 326
    move-object/from16 v0, p0

    move/from16 v1, p1

    const/4 v2, 0x0

    if-nez v0, :cond_0

    .line 327
    return-object v2

    .line 330
    :cond_0
    invoke-static {v0}, Lorg/apache/commons/io/FilenameUtils;->requireNonNullChars(Ljava/lang/String;)Ljava/lang/String;

    .line 332
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v3

    .line 333
    .local v3, "size":I
    if-nez v3, :cond_1

    .line 334
    return-object v0

    .line 336
    :cond_1
    invoke-static {v0}, Lorg/apache/commons/io/FilenameUtils;->getPrefixLength(Ljava/lang/String;)I

    move-result v4

    .line 337
    .local v4, "prefix":I
    if-gez v4, :cond_2

    .line 338
    return-object v2

    .line 341
    :cond_2
    add-int/lit8 v5, v3, 0x2

    new-array v5, v5, [C

    .line 342
    .local v5, "array":[C
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v6

    const/4 v7, 0x0

    invoke-virtual {v0, v7, v6, v5, v7}, Ljava/lang/String;->getChars(II[CI)V

    .line 345
    invoke-static {v1}, Lorg/apache/commons/io/FilenameUtils;->flipSeparator(C)C

    move-result v6

    .line 346
    .local v6, "otherSeparator":C
    const/4 v8, 0x0

    .local v8, "i":I
    :goto_0
    array-length v9, v5

    if-ge v8, v9, :cond_4

    .line 347
    aget-char v9, v5, v8

    if-ne v9, v6, :cond_3

    .line 348
    aput-char v1, v5, v8

    .line 346
    :cond_3
    add-int/lit8 v8, v8, 0x1

    goto :goto_0

    .line 353
    .end local v8    # "i":I
    :cond_4
    const/4 v8, 0x1

    .line 354
    .local v8, "lastIsDirectory":Z
    add-int/lit8 v9, v3, -0x1

    aget-char v9, v5, v9

    if-eq v9, v1, :cond_5

    .line 355
    add-int/lit8 v9, v3, 0x1

    .end local v3    # "size":I
    .local v9, "size":I
    aput-char v1, v5, v3

    .line 356
    const/4 v8, 0x0

    move v3, v9

    .line 362
    .end local v9    # "size":I
    .restart local v3    # "size":I
    :cond_5
    const/4 v9, 0x1

    if-eqz v4, :cond_6

    move v10, v4

    goto :goto_1

    :cond_6
    move v10, v9

    .local v10, "i":I
    :goto_1
    if-ge v10, v3, :cond_8

    .line 363
    aget-char v11, v5, v10

    if-ne v11, v1, :cond_7

    add-int/lit8 v11, v10, -0x1

    aget-char v11, v5, v11

    if-ne v11, v1, :cond_7

    .line 364
    add-int/lit8 v11, v10, -0x1

    sub-int v12, v3, v10

    invoke-static {v5, v10, v5, v11, v12}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 365
    add-int/lit8 v3, v3, -0x1

    .line 366
    add-int/lit8 v10, v10, -0x1

    .line 362
    :cond_7
    add-int/2addr v10, v9

    goto :goto_1

    .line 371
    .end local v10    # "i":I
    :cond_8
    add-int/lit8 v10, v4, 0x1

    .restart local v10    # "i":I
    :goto_2
    const/16 v11, 0x2e

    if-ge v10, v3, :cond_c

    .line 372
    aget-char v12, v5, v10

    if-ne v12, v1, :cond_b

    add-int/lit8 v12, v10, -0x1

    aget-char v12, v5, v12

    if-ne v12, v11, :cond_b

    add-int/lit8 v11, v4, 0x1

    if-eq v10, v11, :cond_9

    add-int/lit8 v11, v10, -0x2

    aget-char v11, v5, v11

    if-ne v11, v1, :cond_b

    .line 374
    :cond_9
    add-int/lit8 v11, v3, -0x1

    if-ne v10, v11, :cond_a

    .line 375
    const/4 v8, 0x1

    .line 377
    :cond_a
    add-int/lit8 v11, v10, 0x1

    add-int/lit8 v12, v10, -0x1

    sub-int v13, v3, v10

    invoke-static {v5, v11, v5, v12, v13}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 378
    add-int/lit8 v3, v3, -0x2

    .line 379
    add-int/lit8 v10, v10, -0x1

    .line 371
    :cond_b
    add-int/2addr v10, v9

    goto :goto_2

    .line 385
    .end local v10    # "i":I
    :cond_c
    add-int/lit8 v10, v4, 0x2

    .restart local v10    # "i":I
    :goto_3
    if-ge v10, v3, :cond_13

    .line 386
    aget-char v12, v5, v10

    if-ne v12, v1, :cond_12

    add-int/lit8 v12, v10, -0x1

    aget-char v12, v5, v12

    if-ne v12, v11, :cond_12

    add-int/lit8 v12, v10, -0x2

    aget-char v12, v5, v12

    if-ne v12, v11, :cond_12

    add-int/lit8 v12, v4, 0x2

    if-eq v10, v12, :cond_d

    add-int/lit8 v12, v10, -0x3

    aget-char v12, v5, v12

    if-ne v12, v1, :cond_12

    .line 388
    :cond_d
    add-int/lit8 v12, v4, 0x2

    if-ne v10, v12, :cond_e

    .line 389
    return-object v2

    .line 391
    :cond_e
    add-int/lit8 v12, v3, -0x1

    if-ne v10, v12, :cond_f

    .line 392
    const/4 v8, 0x1

    .line 395
    :cond_f
    add-int/lit8 v12, v10, -0x4

    .local v12, "j":I
    :goto_4
    if-lt v12, v4, :cond_11

    .line 396
    aget-char v13, v5, v12

    if-ne v13, v1, :cond_10

    .line 398
    add-int/lit8 v13, v10, 0x1

    add-int/lit8 v14, v12, 0x1

    sub-int v15, v3, v10

    invoke-static {v5, v13, v5, v14, v15}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 399
    sub-int v13, v10, v12

    sub-int/2addr v3, v13

    .line 400
    add-int/lit8 v10, v12, 0x1

    .line 401
    goto :goto_5

    .line 395
    :cond_10
    add-int/lit8 v12, v12, -0x1

    goto :goto_4

    .line 405
    :cond_11
    add-int/lit8 v13, v10, 0x1

    sub-int v14, v3, v10

    invoke-static {v5, v13, v5, v4, v14}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 406
    add-int/lit8 v13, v10, 0x1

    sub-int/2addr v13, v4

    sub-int/2addr v3, v13

    .line 407
    add-int/lit8 v10, v4, 0x1

    .line 385
    .end local v12    # "j":I
    :cond_12
    :goto_5
    add-int/2addr v10, v9

    goto :goto_3

    .line 411
    .end local v10    # "i":I
    :cond_13
    if-gtz v3, :cond_14

    .line 412
    const-string v2, ""

    return-object v2

    .line 414
    :cond_14
    if-gt v3, v4, :cond_15

    .line 415
    new-instance v2, Ljava/lang/String;

    invoke-direct {v2, v5, v7, v3}, Ljava/lang/String;-><init>([CII)V

    return-object v2

    .line 417
    :cond_15
    if-eqz v8, :cond_16

    if-eqz p2, :cond_16

    .line 418
    new-instance v2, Ljava/lang/String;

    invoke-direct {v2, v5, v7, v3}, Ljava/lang/String;-><init>([CII)V

    return-object v2

    .line 420
    :cond_16
    new-instance v2, Ljava/lang/String;

    add-int/lit8 v9, v3, -0x1

    invoke-direct {v2, v5, v7, v9}, Ljava/lang/String;-><init>([CII)V

    return-object v2
.end method

.method public static equals(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 2
    .param p0, "fileName1"    # Ljava/lang/String;
    .param p1, "fileName2"    # Ljava/lang/String;

    .line 436
    const/4 v0, 0x0

    sget-object v1, Lorg/apache/commons/io/IOCase;->SENSITIVE:Lorg/apache/commons/io/IOCase;

    invoke-static {p0, p1, v0, v1}, Lorg/apache/commons/io/FilenameUtils;->equals(Ljava/lang/String;Ljava/lang/String;ZLorg/apache/commons/io/IOCase;)Z

    move-result v0

    return v0
.end method

.method public static equals(Ljava/lang/String;Ljava/lang/String;ZLorg/apache/commons/io/IOCase;)Z
    .locals 1
    .param p0, "fileName1"    # Ljava/lang/String;
    .param p1, "fileName2"    # Ljava/lang/String;
    .param p2, "normalize"    # Z
    .param p3, "ioCase"    # Lorg/apache/commons/io/IOCase;

    .line 452
    const/4 v0, 0x0

    if-eqz p0, :cond_3

    if-nez p1, :cond_0

    goto :goto_0

    .line 455
    :cond_0
    if-eqz p2, :cond_2

    .line 456
    invoke-static {p0}, Lorg/apache/commons/io/FilenameUtils;->normalize(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 457
    if-nez p0, :cond_1

    .line 458
    return v0

    .line 460
    :cond_1
    invoke-static {p1}, Lorg/apache/commons/io/FilenameUtils;->normalize(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 461
    if-nez p1, :cond_2

    .line 462
    return v0

    .line 465
    :cond_2
    sget-object v0, Lorg/apache/commons/io/IOCase;->SENSITIVE:Lorg/apache/commons/io/IOCase;

    invoke-static {p3, v0}, Lorg/apache/commons/io/IOCase;->value(Lorg/apache/commons/io/IOCase;Lorg/apache/commons/io/IOCase;)Lorg/apache/commons/io/IOCase;

    move-result-object v0

    invoke-virtual {v0, p0, p1}, Lorg/apache/commons/io/IOCase;->checkEquals(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    return v0

    .line 453
    :cond_3
    :goto_0
    if-nez p0, :cond_4

    if-nez p1, :cond_4

    const/4 v0, 0x1

    :cond_4
    return v0
.end method

.method public static equalsNormalized(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 2
    .param p0, "fileName1"    # Ljava/lang/String;
    .param p1, "fileName2"    # Ljava/lang/String;

    .line 481
    const/4 v0, 0x1

    sget-object v1, Lorg/apache/commons/io/IOCase;->SENSITIVE:Lorg/apache/commons/io/IOCase;

    invoke-static {p0, p1, v0, v1}, Lorg/apache/commons/io/FilenameUtils;->equals(Ljava/lang/String;Ljava/lang/String;ZLorg/apache/commons/io/IOCase;)Z

    move-result v0

    return v0
.end method

.method public static equalsNormalizedOnSystem(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 2
    .param p0, "fileName1"    # Ljava/lang/String;
    .param p1, "fileName2"    # Ljava/lang/String;

    .line 499
    const/4 v0, 0x1

    sget-object v1, Lorg/apache/commons/io/IOCase;->SYSTEM:Lorg/apache/commons/io/IOCase;

    invoke-static {p0, p1, v0, v1}, Lorg/apache/commons/io/FilenameUtils;->equals(Ljava/lang/String;Ljava/lang/String;ZLorg/apache/commons/io/IOCase;)Z

    move-result v0

    return v0
.end method

.method public static equalsOnSystem(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 2
    .param p0, "fileName1"    # Ljava/lang/String;
    .param p1, "fileName2"    # Ljava/lang/String;

    .line 515
    const/4 v0, 0x0

    sget-object v1, Lorg/apache/commons/io/IOCase;->SYSTEM:Lorg/apache/commons/io/IOCase;

    invoke-static {p0, p1, v0, v1}, Lorg/apache/commons/io/FilenameUtils;->equals(Ljava/lang/String;Ljava/lang/String;ZLorg/apache/commons/io/IOCase;)Z

    move-result v0

    return v0
.end method

.method static flipSeparator(C)C
    .locals 2
    .param p0, "ch"    # C

    .line 525
    const/16 v0, 0x5c

    const/16 v1, 0x2f

    if-ne p0, v1, :cond_0

    .line 526
    return v0

    .line 528
    :cond_0
    if-ne p0, v0, :cond_1

    .line 529
    return v1

    .line 531
    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-static {p0}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private static getAdsCriticalOffset(Ljava/lang/String;)I
    .locals 3
    .param p0, "fileName"    # Ljava/lang/String;

    .line 542
    sget-char v0, Lorg/apache/commons/io/FilenameUtils;->SYSTEM_NAME_SEPARATOR:C

    invoke-virtual {p0, v0}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v0

    .line 543
    .local v0, "offset1":I
    sget-char v1, Lorg/apache/commons/io/FilenameUtils;->OTHER_SEPARATOR:C

    invoke-virtual {p0, v1}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v1

    .line 544
    .local v1, "offset2":I
    const/4 v2, -0x1

    if-ne v0, v2, :cond_1

    .line 545
    if-ne v1, v2, :cond_0

    .line 546
    const/4 v2, 0x0

    return v2

    .line 548
    :cond_0
    add-int/lit8 v2, v1, 0x1

    return v2

    .line 550
    :cond_1
    if-ne v1, v2, :cond_2

    .line 551
    add-int/lit8 v2, v0, 0x1

    return v2

    .line 553
    :cond_2
    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result v2

    add-int/lit8 v2, v2, 0x1

    return v2
.end method

.method public static getBaseName(Ljava/lang/String;)Ljava/lang/String;
    .locals 1
    .param p0, "fileName"    # Ljava/lang/String;

    .line 577
    invoke-static {p0}, Lorg/apache/commons/io/FilenameUtils;->getName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lorg/apache/commons/io/FilenameUtils;->removeExtension(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static getExtension(Ljava/lang/String;)Ljava/lang/String;
    .locals 2
    .param p0, "fileName"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalArgumentException;
        }
    .end annotation

    .line 611
    if-nez p0, :cond_0

    .line 612
    const/4 v0, 0x0

    return-object v0

    .line 614
    :cond_0
    invoke-static {p0}, Lorg/apache/commons/io/FilenameUtils;->indexOfExtension(Ljava/lang/String;)I

    move-result v0

    .line 615
    .local v0, "index":I
    const/4 v1, -0x1

    if-ne v0, v1, :cond_1

    .line 616
    const-string v1, ""

    return-object v1

    .line 618
    :cond_1
    add-int/lit8 v1, v0, 0x1

    invoke-virtual {p0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    return-object v1
.end method

.method public static getFullPath(Ljava/lang/String;)Ljava/lang/String;
    .locals 1
    .param p0, "fileName"    # Ljava/lang/String;

    .line 650
    const/4 v0, 0x1

    invoke-static {p0, v0}, Lorg/apache/commons/io/FilenameUtils;->doGetFullPath(Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static getFullPathNoEndSeparator(Ljava/lang/String;)Ljava/lang/String;
    .locals 1
    .param p0, "fileName"    # Ljava/lang/String;

    .line 683
    const/4 v0, 0x0

    invoke-static {p0, v0}, Lorg/apache/commons/io/FilenameUtils;->doGetFullPath(Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static getName(Ljava/lang/String;)Ljava/lang/String;
    .locals 2
    .param p0, "fileName"    # Ljava/lang/String;

    .line 707
    if-nez p0, :cond_0

    .line 708
    const/4 v0, 0x0

    return-object v0

    .line 710
    :cond_0
    invoke-static {p0}, Lorg/apache/commons/io/FilenameUtils;->requireNonNullChars(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0}, Lorg/apache/commons/io/FilenameUtils;->indexOfLastSeparator(Ljava/lang/String;)I

    move-result v1

    add-int/lit8 v1, v1, 0x1

    invoke-virtual {v0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static getPath(Ljava/lang/String;)Ljava/lang/String;
    .locals 1
    .param p0, "fileName"    # Ljava/lang/String;

    .line 740
    const/4 v0, 0x1

    invoke-static {p0, v0}, Lorg/apache/commons/io/FilenameUtils;->doGetPath(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static getPathNoEndSeparator(Ljava/lang/String;)Ljava/lang/String;
    .locals 1
    .param p0, "fileName"    # Ljava/lang/String;

    .line 771
    const/4 v0, 0x0

    invoke-static {p0, v0}, Lorg/apache/commons/io/FilenameUtils;->doGetPath(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static getPrefix(Ljava/lang/String;)Ljava/lang/String;
    .locals 3
    .param p0, "fileName"    # Ljava/lang/String;

    .line 807
    const/4 v0, 0x0

    if-nez p0, :cond_0

    .line 808
    return-object v0

    .line 810
    :cond_0
    invoke-static {p0}, Lorg/apache/commons/io/FilenameUtils;->getPrefixLength(Ljava/lang/String;)I

    move-result v1

    .line 811
    .local v1, "len":I
    if-gez v1, :cond_1

    .line 812
    return-object v0

    .line 814
    :cond_1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    if-le v1, v0, :cond_2

    .line 815
    invoke-static {p0}, Lorg/apache/commons/io/FilenameUtils;->requireNonNullChars(Ljava/lang/String;)Ljava/lang/String;

    .line 816
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v2, 0x2f

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 818
    :cond_2
    const/4 v0, 0x0

    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lorg/apache/commons/io/FilenameUtils;->requireNonNullChars(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static getPrefixLength(Ljava/lang/String;)I
    .locals 10
    .param p0, "fileName"    # Ljava/lang/String;

    .line 865
    const/4 v0, -0x1

    if-nez p0, :cond_0

    .line 866
    return v0

    .line 868
    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    .line 869
    .local v1, "len":I
    const/4 v2, 0x0

    if-nez v1, :cond_1

    .line 870
    return v2

    .line 872
    :cond_1
    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    move-result v3

    .line 873
    .local v3, "ch0":C
    const/16 v4, 0x3a

    if-ne v3, v4, :cond_2

    .line 874
    return v0

    .line 876
    :cond_2
    const/16 v5, 0x7e

    const/4 v6, 0x1

    const/4 v7, 0x2

    if-ne v1, v6, :cond_4

    .line 877
    if-ne v3, v5, :cond_3

    .line 878
    return v7

    .line 880
    :cond_3
    invoke-static {v3}, Lorg/apache/commons/io/FilenameUtils;->isSeparator(C)Z

    move-result v0

    return v0

    .line 882
    :cond_4
    const/16 v8, 0x5c

    const/16 v9, 0x2f

    if-ne v3, v5, :cond_8

    .line 883
    invoke-virtual {p0, v9, v6}, Ljava/lang/String;->indexOf(II)I

    move-result v2

    .line 884
    .local v2, "posUnix":I
    invoke-virtual {p0, v8, v6}, Ljava/lang/String;->indexOf(II)I

    move-result v4

    .line 885
    .local v4, "posWin":I
    if-ne v2, v0, :cond_5

    if-ne v4, v0, :cond_5

    .line 886
    add-int/lit8 v0, v1, 0x1

    return v0

    .line 888
    :cond_5
    if-ne v2, v0, :cond_6

    move v5, v4

    goto :goto_0

    :cond_6
    move v5, v2

    .line 889
    .end local v2    # "posUnix":I
    .local v5, "posUnix":I
    :goto_0
    if-ne v4, v0, :cond_7

    move v0, v5

    goto :goto_1

    :cond_7
    move v0, v4

    .line 890
    .end local v4    # "posWin":I
    .local v0, "posWin":I
    :goto_1
    invoke-static {v5, v0}, Ljava/lang/Math;->min(II)I

    move-result v2

    add-int/2addr v2, v6

    return v2

    .line 892
    .end local v0    # "posWin":I
    .end local v5    # "posUnix":I
    :cond_8
    invoke-virtual {p0, v6}, Ljava/lang/String;->charAt(I)C

    move-result v5

    .line 893
    .local v5, "ch1":C
    if-ne v5, v4, :cond_e

    .line 894
    invoke-static {v3}, Ljava/lang/Character;->toUpperCase(C)C

    move-result v3

    .line 895
    const/16 v4, 0x41

    if-lt v3, v4, :cond_c

    const/16 v4, 0x5a

    if-gt v3, v4, :cond_c

    .line 896
    if-ne v1, v7, :cond_9

    invoke-static {}, Lorg/apache/commons/io/FileSystem;->getCurrent()Lorg/apache/commons/io/FileSystem;

    move-result-object v0

    invoke-virtual {v0}, Lorg/apache/commons/io/FileSystem;->supportsDriveLetter()Z

    move-result v0

    if-nez v0, :cond_9

    .line 897
    return v2

    .line 899
    :cond_9
    if-eq v1, v7, :cond_b

    invoke-virtual {p0, v7}, Ljava/lang/String;->charAt(I)C

    move-result v0

    invoke-static {v0}, Lorg/apache/commons/io/FilenameUtils;->isSeparator(C)Z

    move-result v0

    if-nez v0, :cond_a

    goto :goto_2

    .line 902
    :cond_a
    const/4 v0, 0x3

    return v0

    .line 900
    :cond_b
    :goto_2
    return v7

    .line 904
    :cond_c
    if-ne v3, v9, :cond_d

    .line 905
    return v6

    .line 907
    :cond_d
    return v0

    .line 910
    :cond_e
    invoke-static {v3}, Lorg/apache/commons/io/FilenameUtils;->isSeparator(C)Z

    move-result v2

    if-eqz v2, :cond_16

    invoke-static {v5}, Lorg/apache/commons/io/FilenameUtils;->isSeparator(C)Z

    move-result v2

    if-nez v2, :cond_f

    goto :goto_6

    .line 913
    :cond_f
    invoke-virtual {p0, v9, v7}, Ljava/lang/String;->indexOf(II)I

    move-result v2

    .line 914
    .restart local v2    # "posUnix":I
    invoke-virtual {p0, v8, v7}, Ljava/lang/String;->indexOf(II)I

    move-result v4

    .line 915
    .restart local v4    # "posWin":I
    if-ne v2, v0, :cond_10

    if-eq v4, v0, :cond_15

    :cond_10
    if-eq v2, v7, :cond_15

    if-ne v4, v7, :cond_11

    goto :goto_5

    .line 918
    :cond_11
    if-ne v2, v0, :cond_12

    move v8, v4

    goto :goto_3

    :cond_12
    move v8, v2

    .line 919
    .end local v2    # "posUnix":I
    .local v8, "posUnix":I
    :goto_3
    if-ne v4, v0, :cond_13

    move v2, v8

    goto :goto_4

    :cond_13
    move v2, v4

    .line 920
    .end local v4    # "posWin":I
    .local v2, "posWin":I
    :goto_4
    invoke-static {v8, v2}, Ljava/lang/Math;->min(II)I

    move-result v4

    add-int/2addr v4, v6

    .line 921
    .local v4, "pos":I
    add-int/lit8 v6, v4, -0x1

    invoke-virtual {p0, v7, v6}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v6

    .line 922
    .local v6, "hostnamePart":Ljava/lang/String;
    invoke-static {v6}, Lorg/apache/commons/io/FilenameUtils;->isValidHostName(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_14

    move v0, v4

    :cond_14
    return v0

    .line 916
    .end local v6    # "hostnamePart":Ljava/lang/String;
    .end local v8    # "posUnix":I
    .local v2, "posUnix":I
    .local v4, "posWin":I
    :cond_15
    :goto_5
    return v0

    .line 911
    .end local v2    # "posUnix":I
    .end local v4    # "posWin":I
    :cond_16
    :goto_6
    invoke-static {v3}, Lorg/apache/commons/io/FilenameUtils;->isSeparator(C)Z

    move-result v0

    return v0
.end method

.method public static indexOfExtension(Ljava/lang/String;)I
    .locals 3
    .param p0, "fileName"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalArgumentException;
        }
    .end annotation

    .line 948
    const/4 v0, -0x1

    if-nez p0, :cond_0

    .line 949
    return v0

    .line 951
    :cond_0
    invoke-static {}, Lorg/apache/commons/io/FilenameUtils;->isSystemWindows()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 953
    const/16 v1, 0x3a

    invoke-static {p0}, Lorg/apache/commons/io/FilenameUtils;->getAdsCriticalOffset(Ljava/lang/String;)I

    move-result v2

    invoke-virtual {p0, v1, v2}, Ljava/lang/String;->indexOf(II)I

    move-result v1

    .line 954
    .local v1, "offset":I
    if-ne v1, v0, :cond_1

    goto :goto_0

    .line 955
    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v2, "NTFS ADS separator (\':\') in file name is forbidden."

    invoke-direct {v0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 958
    .end local v1    # "offset":I
    :cond_2
    :goto_0
    const/16 v1, 0x2e

    invoke-virtual {p0, v1}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v1

    .line 959
    .local v1, "extensionPos":I
    invoke-static {p0}, Lorg/apache/commons/io/FilenameUtils;->indexOfLastSeparator(Ljava/lang/String;)I

    move-result v2

    .line 960
    .local v2, "lastSeparator":I
    if-le v2, v1, :cond_3

    goto :goto_1

    :cond_3
    move v0, v1

    :goto_1
    return v0
.end method

.method public static indexOfLastSeparator(Ljava/lang/String;)I
    .locals 3
    .param p0, "fileName"    # Ljava/lang/String;

    .line 976
    if-nez p0, :cond_0

    .line 977
    const/4 v0, -0x1

    return v0

    .line 979
    :cond_0
    const/16 v0, 0x2f

    invoke-virtual {p0, v0}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v0

    .line 980
    .local v0, "lastUnixPos":I
    const/16 v1, 0x5c

    invoke-virtual {p0, v1}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v1

    .line 981
    .local v1, "lastWindowsPos":I
    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result v2

    return v2
.end method

.method private static isEmpty(Ljava/lang/String;)Z
    .locals 1
    .param p0, "string"    # Ljava/lang/String;

    .line 985
    if-eqz p0, :cond_1

    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public static isExtension(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 3
    .param p0, "fileName"    # Ljava/lang/String;
    .param p1, "extension"    # Ljava/lang/String;

    .line 1025
    const/4 v0, 0x0

    if-nez p0, :cond_0

    .line 1026
    return v0

    .line 1028
    :cond_0
    invoke-static {p0}, Lorg/apache/commons/io/FilenameUtils;->requireNonNullChars(Ljava/lang/String;)Ljava/lang/String;

    .line 1030
    invoke-static {p1}, Lorg/apache/commons/io/FilenameUtils;->isEmpty(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 1031
    invoke-static {p0}, Lorg/apache/commons/io/FilenameUtils;->indexOfExtension(Ljava/lang/String;)I

    move-result v1

    const/4 v2, -0x1

    if-ne v1, v2, :cond_1

    const/4 v0, 0x1

    :cond_1
    return v0

    .line 1033
    :cond_2
    invoke-static {p0}, Lorg/apache/commons/io/FilenameUtils;->getExtension(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public static isExtension(Ljava/lang/String;Ljava/util/Collection;)Z
    .locals 3
    .param p0, "fileName"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Collection<",
            "Ljava/lang/String;",
            ">;)Z"
        }
    .end annotation

    .line 1001
    .local p1, "extensions":Ljava/util/Collection;, "Ljava/util/Collection<Ljava/lang/String;>;"
    const/4 v0, 0x0

    if-nez p0, :cond_0

    .line 1002
    return v0

    .line 1004
    :cond_0
    invoke-static {p0}, Lorg/apache/commons/io/FilenameUtils;->requireNonNullChars(Ljava/lang/String;)Ljava/lang/String;

    .line 1006
    if-eqz p1, :cond_2

    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_0

    .line 1009
    :cond_1
    invoke-static {p0}, Lorg/apache/commons/io/FilenameUtils;->getExtension(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0

    .line 1007
    :cond_2
    :goto_0
    invoke-static {p0}, Lorg/apache/commons/io/FilenameUtils;->indexOfExtension(Ljava/lang/String;)I

    move-result v1

    const/4 v2, -0x1

    if-ne v1, v2, :cond_3

    const/4 v0, 0x1

    :cond_3
    return v0
.end method

.method public static varargs isExtension(Ljava/lang/String;[Ljava/lang/String;)Z
    .locals 3
    .param p0, "fileName"    # Ljava/lang/String;
    .param p1, "extensions"    # [Ljava/lang/String;

    .line 1049
    const/4 v0, 0x0

    if-nez p0, :cond_0

    .line 1050
    return v0

    .line 1052
    :cond_0
    invoke-static {p0}, Lorg/apache/commons/io/FilenameUtils;->requireNonNullChars(Ljava/lang/String;)Ljava/lang/String;

    .line 1054
    if-eqz p1, :cond_2

    array-length v1, p1

    if-nez v1, :cond_1

    goto :goto_0

    .line 1057
    :cond_1
    invoke-static {p0}, Lorg/apache/commons/io/FilenameUtils;->getExtension(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 1058
    .local v0, "fileExt":Ljava/lang/String;
    invoke-static {p1}, Ljava/util/stream/Stream;->of([Ljava/lang/Object;)Ljava/util/stream/Stream;

    move-result-object v1

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, Lorg/apache/commons/io/FilenameUtils$$ExternalSyntheticLambda0;

    invoke-direct {v2, v0}, Lorg/apache/commons/io/FilenameUtils$$ExternalSyntheticLambda0;-><init>(Ljava/lang/String;)V

    invoke-interface {v1, v2}, Ljava/util/stream/Stream;->anyMatch(Ljava/util/function/Predicate;)Z

    move-result v1

    return v1

    .line 1055
    .end local v0    # "fileExt":Ljava/lang/String;
    :cond_2
    :goto_0
    invoke-static {p0}, Lorg/apache/commons/io/FilenameUtils;->indexOfExtension(Ljava/lang/String;)I

    move-result v1

    const/4 v2, -0x1

    if-ne v1, v2, :cond_3

    const/4 v0, 0x1

    :cond_3
    return v0
.end method

.method private static isIPv4Address(Ljava/lang/String;)Z
    .locals 8
    .param p0, "name"    # Ljava/lang/String;

    .line 1069
    sget-object v0, Lorg/apache/commons/io/FilenameUtils;->IPV4_PATTERN:Ljava/util/regex/Pattern;

    invoke-virtual {v0, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v0

    .line 1070
    .local v0, "m":Ljava/util/regex/Matcher;
    invoke-virtual {v0}, Ljava/util/regex/Matcher;->matches()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_4

    invoke-virtual {v0}, Ljava/util/regex/Matcher;->groupCount()I

    move-result v1

    const/4 v3, 0x4

    if-eq v1, v3, :cond_0

    goto :goto_1

    .line 1075
    :cond_0
    const/4 v1, 0x1

    .local v1, "i":I
    :goto_0
    const/4 v4, 0x1

    if-gt v1, v3, :cond_3

    .line 1076
    invoke-virtual {v0, v1}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v5

    .line 1077
    .local v5, "ipSegment":Ljava/lang/String;
    invoke-static {v5}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v6

    .line 1078
    .local v6, "iIpSegment":I
    const/16 v7, 0xff

    if-le v6, v7, :cond_1

    .line 1079
    return v2

    .line 1082
    :cond_1
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v7

    if-le v7, v4, :cond_2

    const-string v4, "0"

    invoke-virtual {v5, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_2

    .line 1083
    return v2

    .line 1075
    .end local v5    # "ipSegment":Ljava/lang/String;
    .end local v6    # "iIpSegment":I
    :cond_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 1088
    .end local v1    # "i":I
    :cond_3
    return v4

    .line 1071
    :cond_4
    :goto_1
    return v2
.end method

.method private static isIPv6Address(Ljava/lang/String;)Z
    .locals 10
    .param p0, "inet6Address"    # Ljava/lang/String;

    .line 1099
    const-string v0, "::"

    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    .line 1100
    .local v1, "containsCompressedZeroes":Z
    const/4 v2, 0x0

    if-eqz v1, :cond_0

    invoke-virtual {p0, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v3

    invoke-virtual {p0, v0}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result v4

    if-eq v3, v4, :cond_0

    .line 1101
    return v2

    .line 1103
    :cond_0
    const-string v3, ":"

    invoke-virtual {p0, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_2

    .line 1104
    :cond_1
    invoke-virtual {p0, v3}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-virtual {p0, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v4

    if-nez v4, :cond_3

    .line 1105
    :cond_2
    return v2

    .line 1107
    :cond_3
    invoke-virtual {p0, v3}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v3

    .line 1108
    .local v3, "octets":[Ljava/lang/String;
    if-eqz v1, :cond_6

    .line 1109
    new-instance v4, Ljava/util/ArrayList;

    invoke-static {v3}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 1110
    .local v4, "octetList":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    invoke-virtual {p0, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_4

    .line 1112
    const-string v0, ""

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 1113
    :cond_4
    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_5

    .line 1114
    invoke-interface {v4, v2}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 1116
    :cond_5
    :goto_0
    sget-object v0, Lorg/apache/commons/io/FilenameUtils;->EMPTY_STRING_ARRAY:[Ljava/lang/String;

    invoke-interface {v4, v0}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, [Ljava/lang/String;

    .line 1118
    .end local v4    # "octetList":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    :cond_6
    array-length v0, v3

    const/16 v4, 0x8

    if-le v0, v4, :cond_7

    .line 1119
    return v2

    .line 1121
    :cond_7
    const/4 v0, 0x0

    .line 1122
    .local v0, "validOctets":I
    const/4 v5, 0x0

    .line 1123
    .local v5, "emptyOctets":I
    const/4 v6, 0x0

    .local v6, "index":I
    :goto_1
    array-length v7, v3

    const/4 v8, 0x1

    if-ge v6, v7, :cond_e

    .line 1124
    aget-object v7, v3, v6

    .line 1125
    .local v7, "octet":Ljava/lang/String;
    invoke-virtual {v7}, Ljava/lang/String;->isEmpty()Z

    move-result v9

    if-eqz v9, :cond_8

    .line 1126
    add-int/lit8 v5, v5, 0x1

    .line 1127
    if-le v5, v8, :cond_c

    .line 1128
    return v2

    .line 1131
    :cond_8
    const/4 v5, 0x0

    .line 1133
    array-length v9, v3

    sub-int/2addr v9, v8

    if-ne v6, v9, :cond_a

    const-string v8, "."

    invoke-virtual {v7, v8}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v8

    if-eqz v8, :cond_a

    .line 1134
    invoke-static {v7}, Lorg/apache/commons/io/FilenameUtils;->isIPv4Address(Ljava/lang/String;)Z

    move-result v8

    if-nez v8, :cond_9

    .line 1135
    return v2

    .line 1137
    :cond_9
    add-int/lit8 v0, v0, 0x2

    .line 1138
    goto :goto_2

    .line 1140
    :cond_a
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v8

    const/4 v9, 0x4

    if-le v8, v9, :cond_b

    .line 1141
    return v2

    .line 1145
    :cond_b
    const/16 v8, 0x10

    :try_start_0
    invoke-static {v7, v8}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v8
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 1148
    .local v8, "octetInt":I
    nop

    .line 1149
    if-ltz v8, :cond_d

    const v9, 0xffff

    if-le v8, v9, :cond_c

    goto :goto_3

    .line 1153
    .end local v8    # "octetInt":I
    :cond_c
    add-int/lit8 v0, v0, 0x1

    .line 1123
    .end local v7    # "octet":Ljava/lang/String;
    :goto_2
    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    .line 1150
    .restart local v7    # "octet":Ljava/lang/String;
    .restart local v8    # "octetInt":I
    :cond_d
    :goto_3
    return v2

    .line 1146
    .end local v8    # "octetInt":I
    :catch_0
    move-exception v4

    .line 1147
    .local v4, "e":Ljava/lang/NumberFormatException;
    return v2

    .line 1155
    .end local v4    # "e":Ljava/lang/NumberFormatException;
    .end local v6    # "index":I
    .end local v7    # "octet":Ljava/lang/String;
    :cond_e
    if-gt v0, v4, :cond_10

    if-ge v0, v4, :cond_f

    if-eqz v1, :cond_10

    :cond_f
    move v2, v8

    :cond_10
    return v2
.end method

.method private static isRFC3986HostName(Ljava/lang/String;)Z
    .locals 5
    .param p0, "name"    # Ljava/lang/String;

    .line 1167
    const-string v0, "\\."

    const/4 v1, -0x1

    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object v0

    .line 1168
    .local v0, "parts":[Ljava/lang/String;
    const/4 v1, 0x0

    .local v1, "i":I
    :goto_0
    array-length v2, v0

    const/4 v3, 0x1

    if-ge v1, v2, :cond_3

    .line 1169
    aget-object v2, v0, v1

    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    move-result v2

    const/4 v4, 0x0

    if-eqz v2, :cond_1

    .line 1171
    array-length v2, v0

    sub-int/2addr v2, v3

    if-ne v1, v2, :cond_0

    goto :goto_1

    :cond_0
    move v3, v4

    :goto_1
    return v3

    .line 1173
    :cond_1
    sget-object v2, Lorg/apache/commons/io/FilenameUtils;->REG_NAME_PART_PATTERN:Ljava/util/regex/Pattern;

    aget-object v3, v0, v1

    invoke-virtual {v2, v3}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/regex/Matcher;->matches()Z

    move-result v2

    if-nez v2, :cond_2

    .line 1174
    return v4

    .line 1168
    :cond_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 1177
    .end local v1    # "i":I
    :cond_3
    return v3
.end method

.method private static isSeparator(C)Z
    .locals 1
    .param p0, "ch"    # C

    .line 1187
    const/16 v0, 0x2f

    if-eq p0, v0, :cond_1

    const/16 v0, 0x5c

    if-ne p0, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method static isSystemWindows()Z
    .locals 2

    .line 1196
    sget-char v0, Lorg/apache/commons/io/FilenameUtils;->SYSTEM_NAME_SEPARATOR:C

    const/16 v1, 0x5c

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private static isValidHostName(Ljava/lang/String;)Z
    .locals 1
    .param p0, "name"    # Ljava/lang/String;

    .line 1212
    invoke-static {p0}, Lorg/apache/commons/io/FilenameUtils;->isIPv6Address(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-static {p0}, Lorg/apache/commons/io/FilenameUtils;->isRFC3986HostName(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public static normalize(Ljava/lang/String;)Ljava/lang/String;
    .locals 2
    .param p0, "fileName"    # Ljava/lang/String;

    .line 1257
    sget-char v0, Lorg/apache/commons/io/FilenameUtils;->SYSTEM_NAME_SEPARATOR:C

    const/4 v1, 0x1

    invoke-static {p0, v0, v1}, Lorg/apache/commons/io/FilenameUtils;->doNormalize(Ljava/lang/String;CZ)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static normalize(Ljava/lang/String;Z)Ljava/lang/String;
    .locals 2
    .param p0, "fileName"    # Ljava/lang/String;
    .param p1, "unixSeparator"    # Z

    .line 1306
    invoke-static {p1}, Lorg/apache/commons/io/FilenameUtils;->toSeparator(Z)C

    move-result v0

    const/4 v1, 0x1

    invoke-static {p0, v0, v1}, Lorg/apache/commons/io/FilenameUtils;->doNormalize(Ljava/lang/String;CZ)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static normalizeNoEndSeparator(Ljava/lang/String;)Ljava/lang/String;
    .locals 2
    .param p0, "fileName"    # Ljava/lang/String;

    .line 1352
    sget-char v0, Lorg/apache/commons/io/FilenameUtils;->SYSTEM_NAME_SEPARATOR:C

    const/4 v1, 0x0

    invoke-static {p0, v0, v1}, Lorg/apache/commons/io/FilenameUtils;->doNormalize(Ljava/lang/String;CZ)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static normalizeNoEndSeparator(Ljava/lang/String;Z)Ljava/lang/String;
    .locals 2
    .param p0, "fileName"    # Ljava/lang/String;
    .param p1, "unixSeparator"    # Z

    .line 1400
    invoke-static {p1}, Lorg/apache/commons/io/FilenameUtils;->toSeparator(Z)C

    move-result v0

    const/4 v1, 0x0

    invoke-static {p0, v0, v1}, Lorg/apache/commons/io/FilenameUtils;->doNormalize(Ljava/lang/String;CZ)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static removeExtension(Ljava/lang/String;)Ljava/lang/String;
    .locals 2
    .param p0, "fileName"    # Ljava/lang/String;

    .line 1422
    if-nez p0, :cond_0

    .line 1423
    const/4 v0, 0x0

    return-object v0

    .line 1425
    :cond_0
    invoke-static {p0}, Lorg/apache/commons/io/FilenameUtils;->requireNonNullChars(Ljava/lang/String;)Ljava/lang/String;

    .line 1427
    invoke-static {p0}, Lorg/apache/commons/io/FilenameUtils;->indexOfExtension(Ljava/lang/String;)I

    move-result v0

    .line 1428
    .local v0, "index":I
    const/4 v1, -0x1

    if-ne v0, v1, :cond_1

    .line 1429
    return-object p0

    .line 1431
    :cond_1
    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    return-object v1
.end method

.method private static requireNonNullChars(Ljava/lang/String;)Ljava/lang/String;
    .locals 2
    .param p0, "path"    # Ljava/lang/String;

    .line 1444
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Ljava/lang/String;->indexOf(I)I

    move-result v0

    if-gez v0, :cond_0

    .line 1448
    return-object p0

    .line 1445
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Null character present in file/path name. There are no known legitimate use cases for such data, but several injection attacks may use it"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static separatorsToSystem(Ljava/lang/String;)Ljava/lang/String;
    .locals 1
    .param p0, "path"    # Ljava/lang/String;

    .line 1458
    invoke-static {}, Lorg/apache/commons/io/FileSystem;->getCurrent()Lorg/apache/commons/io/FileSystem;

    move-result-object v0

    invoke-virtual {v0, p0}, Lorg/apache/commons/io/FileSystem;->normalizeSeparators(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static separatorsToUnix(Ljava/lang/String;)Ljava/lang/String;
    .locals 1
    .param p0, "path"    # Ljava/lang/String;

    .line 1468
    sget-object v0, Lorg/apache/commons/io/FileSystem;->LINUX:Lorg/apache/commons/io/FileSystem;

    invoke-virtual {v0, p0}, Lorg/apache/commons/io/FileSystem;->normalizeSeparators(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static separatorsToWindows(Ljava/lang/String;)Ljava/lang/String;
    .locals 1
    .param p0, "path"    # Ljava/lang/String;

    .line 1478
    sget-object v0, Lorg/apache/commons/io/FileSystem;->WINDOWS:Lorg/apache/commons/io/FileSystem;

    invoke-virtual {v0, p0}, Lorg/apache/commons/io/FileSystem;->normalizeSeparators(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method static splitOnTokens(Ljava/lang/String;)[Ljava/lang/String;
    .locals 11
    .param p0, "text"    # Ljava/lang/String;

    .line 1493
    const/16 v0, 0x3f

    invoke-virtual {p0, v0}, Ljava/lang/String;->indexOf(I)I

    move-result v1

    const/16 v2, 0x2a

    const/4 v3, 0x0

    const/4 v4, -0x1

    if-ne v1, v4, :cond_0

    invoke-virtual {p0, v2}, Ljava/lang/String;->indexOf(I)I

    move-result v1

    if-ne v1, v4, :cond_0

    .line 1494
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/String;

    aput-object p0, v0, v3

    return-object v0

    .line 1497
    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v1

    .line 1498
    .local v1, "array":[C
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 1499
    .local v4, "list":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/String;>;"
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 1500
    .local v5, "buffer":Ljava/lang/StringBuilder;
    const/4 v6, 0x0

    .line 1501
    .local v6, "prevChar":C
    array-length v7, v1

    move v8, v3

    :goto_0
    if-ge v8, v7, :cond_6

    aget-char v9, v1, v8

    .line 1502
    .local v9, "ch":C
    if-eq v9, v0, :cond_2

    if-ne v9, v2, :cond_1

    goto :goto_1

    .line 1513
    :cond_1
    invoke-virtual {v5, v9}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_2

    .line 1503
    :cond_2
    :goto_1
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->length()I

    move-result v10

    if-eqz v10, :cond_3

    .line 1504
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v4, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1505
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 1507
    :cond_3
    if-ne v9, v0, :cond_4

    .line 1508
    const-string v10, "?"

    invoke-virtual {v4, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 1509
    :cond_4
    if-eq v6, v2, :cond_5

    .line 1510
    const-string v10, "*"

    invoke-virtual {v4, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1515
    :cond_5
    :goto_2
    move v6, v9

    .line 1501
    .end local v9    # "ch":C
    add-int/lit8 v8, v8, 0x1

    goto :goto_0

    .line 1517
    :cond_6
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->length()I

    move-result v0

    if-eqz v0, :cond_7

    .line 1518
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1521
    :cond_7
    sget-object v0, Lorg/apache/commons/io/FilenameUtils;->EMPTY_STRING_ARRAY:[Ljava/lang/String;

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    return-object v0
.end method

.method private static toSeparator(Z)C
    .locals 1
    .param p0, "unixSeparator"    # Z

    .line 1531
    if-eqz p0, :cond_0

    const/16 v0, 0x2f

    goto :goto_0

    :cond_0
    const/16 v0, 0x5c

    :goto_0
    return v0
.end method

.method public static wildcardMatch(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 1
    .param p0, "fileName"    # Ljava/lang/String;
    .param p1, "wildcardMatcher"    # Ljava/lang/String;

    .line 1557
    sget-object v0, Lorg/apache/commons/io/IOCase;->SENSITIVE:Lorg/apache/commons/io/IOCase;

    invoke-static {p0, p1, v0}, Lorg/apache/commons/io/FilenameUtils;->wildcardMatch(Ljava/lang/String;Ljava/lang/String;Lorg/apache/commons/io/IOCase;)Z

    move-result v0

    return v0
.end method

.method public static wildcardMatch(Ljava/lang/String;Ljava/lang/String;Lorg/apache/commons/io/IOCase;)Z
    .locals 9
    .param p0, "fileName"    # Ljava/lang/String;
    .param p1, "wildcardMatcher"    # Ljava/lang/String;
    .param p2, "ioCase"    # Lorg/apache/commons/io/IOCase;

    .line 1575
    const/4 v0, 0x1

    if-nez p0, :cond_0

    if-nez p1, :cond_0

    .line 1576
    return v0

    .line 1578
    :cond_0
    const/4 v1, 0x0

    if-eqz p0, :cond_d

    if-nez p1, :cond_1

    goto/16 :goto_4

    .line 1581
    :cond_1
    sget-object v2, Lorg/apache/commons/io/IOCase;->SENSITIVE:Lorg/apache/commons/io/IOCase;

    invoke-static {p2, v2}, Lorg/apache/commons/io/IOCase;->value(Lorg/apache/commons/io/IOCase;Lorg/apache/commons/io/IOCase;)Lorg/apache/commons/io/IOCase;

    move-result-object v2

    .line 1582
    .end local p2    # "ioCase":Lorg/apache/commons/io/IOCase;
    .local v2, "ioCase":Lorg/apache/commons/io/IOCase;
    invoke-static {p1}, Lorg/apache/commons/io/FilenameUtils;->splitOnTokens(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v3

    .line 1583
    .local v3, "wcs":[Ljava/lang/String;
    const/4 p2, 0x0

    .line 1584
    .local p2, "anyChars":Z
    const/4 v4, 0x0

    .line 1585
    .local v4, "textIdx":I
    const/4 v5, 0x0

    .line 1586
    .local v5, "wcsIdx":I
    new-instance v6, Ljava/util/ArrayDeque;

    array-length v7, v3

    invoke-direct {v6, v7}, Ljava/util/ArrayDeque;-><init>(I)V

    .line 1590
    .local v6, "backtrack":Ljava/util/Deque;, "Ljava/util/Deque<[I>;"
    :cond_2
    invoke-interface {v6}, Ljava/util/Deque;->isEmpty()Z

    move-result v7

    if-nez v7, :cond_3

    .line 1591
    invoke-interface {v6}, Ljava/util/Deque;->pop()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, [I

    .line 1592
    .local v7, "array":[I
    aget v5, v7, v1

    .line 1593
    aget v4, v7, v0

    .line 1594
    const/4 p2, 0x1

    .line 1598
    .end local v7    # "array":[I
    :cond_3
    :goto_0
    array-length v7, v3

    if-ge v5, v7, :cond_b

    .line 1600
    aget-object v7, v3, v5

    const-string v8, "?"

    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_5

    .line 1602
    add-int/lit8 v4, v4, 0x1

    .line 1603
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v7

    if-le v4, v7, :cond_4

    .line 1604
    goto :goto_3

    .line 1606
    :cond_4
    const/4 p2, 0x0

    goto :goto_2

    .line 1608
    :cond_5
    aget-object v7, v3, v5

    const-string v8, "*"

    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_6

    .line 1610
    const/4 p2, 0x1

    .line 1611
    array-length v7, v3

    sub-int/2addr v7, v0

    if-ne v5, v7, :cond_a

    .line 1612
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v4

    goto :goto_2

    .line 1617
    :cond_6
    if-eqz p2, :cond_8

    .line 1619
    aget-object v7, v3, v5

    invoke-virtual {v2, p0, v4, v7}, Lorg/apache/commons/io/IOCase;->checkIndexOf(Ljava/lang/String;ILjava/lang/String;)I

    move-result v4

    .line 1620
    const/4 v7, -0x1

    if-ne v4, v7, :cond_7

    .line 1622
    goto :goto_3

    .line 1624
    :cond_7
    add-int/lit8 v7, v4, 0x1

    aget-object v8, v3, v5

    invoke-virtual {v2, p0, v7, v8}, Lorg/apache/commons/io/IOCase;->checkIndexOf(Ljava/lang/String;ILjava/lang/String;)I

    move-result v7

    .line 1625
    .local v7, "repeat":I
    if-ltz v7, :cond_9

    .line 1626
    filled-new-array {v5, v7}, [I

    move-result-object v8

    invoke-interface {v6, v8}, Ljava/util/Deque;->push(Ljava/lang/Object;)V

    goto :goto_1

    .line 1628
    .end local v7    # "repeat":I
    :cond_8
    aget-object v7, v3, v5

    invoke-virtual {v2, p0, v4, v7}, Lorg/apache/commons/io/IOCase;->checkRegionMatches(Ljava/lang/String;ILjava/lang/String;)Z

    move-result v7

    if-nez v7, :cond_9

    .line 1631
    goto :goto_3

    .line 1628
    :cond_9
    :goto_1
    nop

    .line 1635
    aget-object v7, v3, v5

    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v7

    add-int/2addr v4, v7

    .line 1636
    const/4 p2, 0x0

    .line 1639
    :cond_a
    :goto_2
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 1643
    :cond_b
    :goto_3
    array-length v7, v3

    if-ne v5, v7, :cond_c

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v7

    if-ne v4, v7, :cond_c

    .line 1644
    return v0

    .line 1647
    :cond_c
    invoke-interface {v6}, Ljava/util/Deque;->isEmpty()Z

    move-result v7

    if-eqz v7, :cond_2

    .line 1649
    return v1

    .line 1579
    .end local v2    # "ioCase":Lorg/apache/commons/io/IOCase;
    .end local v3    # "wcs":[Ljava/lang/String;
    .end local v4    # "textIdx":I
    .end local v5    # "wcsIdx":I
    .end local v6    # "backtrack":Ljava/util/Deque;, "Ljava/util/Deque<[I>;"
    .local p2, "ioCase":Lorg/apache/commons/io/IOCase;
    :cond_d
    :goto_4
    return v1
.end method

.method public static wildcardMatchOnSystem(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 1
    .param p0, "fileName"    # Ljava/lang/String;
    .param p1, "wildcardMatcher"    # Ljava/lang/String;

    .line 1675
    sget-object v0, Lorg/apache/commons/io/IOCase;->SYSTEM:Lorg/apache/commons/io/IOCase;

    invoke-static {p0, p1, v0}, Lorg/apache/commons/io/FilenameUtils;->wildcardMatch(Ljava/lang/String;Ljava/lang/String;Lorg/apache/commons/io/IOCase;)Z

    move-result v0

    return v0
.end method
