.class public Lorg/apache/commons/lang3/time/DurationFormatUtils;
.super Ljava/lang/Object;
.source "DurationFormatUtils.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/apache/commons/lang3/time/DurationFormatUtils$Token;
    }
.end annotation


# static fields
.field static final H:Ljava/lang/String; = "H"

.field public static final ISO_EXTENDED_FORMAT_PATTERN:Ljava/lang/String; = "\'P\'yyyy\'Y\'M\'M\'d\'DT\'H\'H\'m\'M\'s.SSS\'S\'"

.field static final M:Ljava/lang/String; = "M"

.field static final S:Ljava/lang/String; = "S"

.field static final d:Ljava/lang/String; = "d"

.field static final m:Ljava/lang/String; = "m"

.field static final s:Ljava/lang/String; = "s"

.field static final y:Ljava/lang/String; = "y"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 768
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 769
    return-void
.end method

.method static format([Lorg/apache/commons/lang3/time/DurationFormatUtils$Token;JJJJJJJZ)Ljava/lang/String;
    .locals 29
    .param p0, "tokens"    # [Lorg/apache/commons/lang3/time/DurationFormatUtils$Token;
    .param p1, "years"    # J
    .param p3, "months"    # J
    .param p5, "days"    # J
    .param p7, "hours"    # J
    .param p9, "minutes"    # J
    .param p11, "seconds"    # J
    .param p13, "milliseconds"    # J
    .param p15, "padWithZeros"    # Z

    .line 235
    move-object/from16 v0, p0

    move-wide/from16 v1, p1

    move-wide/from16 v3, p3

    move-wide/from16 v5, p5

    move-wide/from16 v7, p7

    move-wide/from16 v9, p9

    move/from16 v15, p15

    new-instance v16, Ljava/lang/StringBuilder;

    invoke-direct/range {v16 .. v16}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v17, v16

    .line 236
    .local v17, "buffer":Ljava/lang/StringBuilder;
    const/16 v16, 0x0

    .line 237
    .local v16, "lastOutputSeconds":Z
    const/16 v18, 0x0

    .line 238
    .local v18, "lastOutputZero":Z
    const/16 v19, -0x1

    .line 239
    .local v19, "optionalStart":I
    const/16 v20, 0x0

    .line 240
    .local v20, "firstOptionalNonLiteral":Z
    const/16 v21, -0x1

    .line 241
    .local v21, "optionalIndex":I
    const/16 v22, 0x0

    .line 242
    .local v22, "inOptional":Z
    array-length v13, v0

    move/from16 v14, v21

    const/4 v0, 0x0

    .end local v21    # "optionalIndex":I
    .local v14, "optionalIndex":I
    :goto_0
    if-ge v0, v13, :cond_23

    aget-object v23, p0, v0

    .line 243
    .local v23, "token":Lorg/apache/commons/lang3/time/DurationFormatUtils$Token;
    move/from16 v24, v0

    invoke-virtual/range {v23 .. v23}, Lorg/apache/commons/lang3/time/DurationFormatUtils$Token;->getValue()Ljava/lang/Object;

    move-result-object v0

    .line 244
    .local v0, "value":Ljava/lang/Object;
    move/from16 v25, v13

    instance-of v13, v0, Ljava/lang/StringBuilder;

    .line 245
    .local v13, "isLiteral":Z
    move/from16 v26, v13

    .end local v13    # "isLiteral":Z
    .local v26, "isLiteral":Z
    invoke-virtual/range {v23 .. v23}, Lorg/apache/commons/lang3/time/DurationFormatUtils$Token;->getCount()I

    move-result v13

    .line 246
    .local v13, "count":I
    invoke-static/range {v23 .. v23}, Lorg/apache/commons/lang3/time/DurationFormatUtils$Token;->access$000(Lorg/apache/commons/lang3/time/DurationFormatUtils$Token;)I

    move-result v11

    if-eq v14, v11, :cond_1

    .line 247
    invoke-static/range {v23 .. v23}, Lorg/apache/commons/lang3/time/DurationFormatUtils$Token;->access$000(Lorg/apache/commons/lang3/time/DurationFormatUtils$Token;)I

    move-result v11

    .line 248
    .end local v14    # "optionalIndex":I
    .local v11, "optionalIndex":I
    const/4 v12, -0x1

    if-le v11, v12, :cond_0

    .line 250
    invoke-virtual/range {v17 .. v17}, Ljava/lang/StringBuilder;->length()I

    move-result v12

    .line 251
    .end local v19    # "optionalStart":I
    .local v12, "optionalStart":I
    const/16 v18, 0x0

    .line 252
    const/4 v14, 0x1

    .line 253
    .end local v22    # "inOptional":Z
    .local v14, "inOptional":Z
    const/16 v20, 0x0

    move/from16 v22, v14

    move v14, v11

    goto :goto_1

    .line 256
    .end local v12    # "optionalStart":I
    .end local v14    # "inOptional":Z
    .restart local v19    # "optionalStart":I
    .restart local v22    # "inOptional":Z
    :cond_0
    const/4 v12, 0x0

    move v14, v11

    move/from16 v22, v12

    move/from16 v12, v19

    .end local v22    # "inOptional":Z
    .local v12, "inOptional":Z
    goto :goto_1

    .line 246
    .end local v11    # "optionalIndex":I
    .end local v12    # "inOptional":Z
    .local v14, "optionalIndex":I
    .restart local v22    # "inOptional":Z
    :cond_1
    move/from16 v12, v19

    .line 259
    .end local v19    # "optionalStart":I
    .local v12, "optionalStart":I
    :goto_1
    if-eqz v26, :cond_4

    .line 260
    if-eqz v22, :cond_3

    if-nez v18, :cond_2

    goto :goto_2

    :cond_2
    move-object v11, v0

    move/from16 v19, v14

    move-object/from16 v14, v17

    move-wide/from16 v0, p13

    goto/16 :goto_11

    .line 261
    :cond_3
    :goto_2
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v11

    move/from16 v19, v14

    move-object/from16 v14, v17

    .end local v17    # "buffer":Ljava/lang/StringBuilder;
    .local v14, "buffer":Ljava/lang/StringBuilder;
    .local v19, "optionalIndex":I
    invoke-virtual {v14, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object v11, v0

    move-wide/from16 v0, p13

    goto/16 :goto_11

    .line 263
    .end local v19    # "optionalIndex":I
    .local v14, "optionalIndex":I
    .restart local v17    # "buffer":Ljava/lang/StringBuilder;
    :cond_4
    move/from16 v19, v14

    move-object/from16 v14, v17

    .end local v17    # "buffer":Ljava/lang/StringBuilder;
    .local v14, "buffer":Ljava/lang/StringBuilder;
    .restart local v19    # "optionalIndex":I
    const-string/jumbo v11, "y"

    invoke-virtual {v0, v11}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v11

    const-wide/16 v27, 0x0

    move/from16 v17, v11

    if-eqz v17, :cond_8

    .line 264
    const/16 v16, 0x0

    .line 265
    cmp-long v17, v1, v27

    if-nez v17, :cond_5

    const/4 v11, 0x1

    goto :goto_3

    :cond_5
    const/4 v11, 0x0

    .line 266
    .end local v18    # "lastOutputZero":Z
    .local v11, "lastOutputZero":Z
    :goto_3
    if-eqz v22, :cond_7

    if-nez v11, :cond_6

    goto :goto_4

    :cond_6
    move/from16 v17, v11

    goto :goto_5

    .line 267
    :cond_7
    :goto_4
    move/from16 v17, v11

    .end local v11    # "lastOutputZero":Z
    .local v17, "lastOutputZero":Z
    invoke-static {v1, v2, v15, v13}, Lorg/apache/commons/lang3/time/DurationFormatUtils;->paddedValue(JZI)Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v14, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 313
    :goto_5
    move-object v11, v0

    move/from16 v18, v17

    move-wide/from16 v0, p13

    goto/16 :goto_11

    .line 269
    .end local v17    # "lastOutputZero":Z
    .restart local v18    # "lastOutputZero":Z
    :cond_8
    const-string v11, "M"

    invoke-virtual {v0, v11}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_c

    .line 270
    const/4 v11, 0x0

    .line 271
    .end local v16    # "lastOutputSeconds":Z
    .local v11, "lastOutputSeconds":Z
    cmp-long v16, v3, v27

    if-nez v16, :cond_9

    const/16 v17, 0x1

    goto :goto_6

    :cond_9
    const/16 v17, 0x0

    .line 272
    .end local v18    # "lastOutputZero":Z
    .restart local v17    # "lastOutputZero":Z
    :goto_6
    if-eqz v22, :cond_a

    if-nez v17, :cond_b

    .line 273
    :cond_a
    invoke-static {v3, v4, v15, v13}, Lorg/apache/commons/lang3/time/DurationFormatUtils;->paddedValue(JZI)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v14, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 313
    :cond_b
    move/from16 v16, v11

    move/from16 v18, v17

    move-object v11, v0

    move-wide/from16 v0, p13

    goto/16 :goto_11

    .line 275
    .end local v11    # "lastOutputSeconds":Z
    .end local v17    # "lastOutputZero":Z
    .restart local v16    # "lastOutputSeconds":Z
    .restart local v18    # "lastOutputZero":Z
    :cond_c
    const-string v1, "d"

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_10

    .line 276
    const/4 v1, 0x0

    .line 277
    .end local v16    # "lastOutputSeconds":Z
    .local v1, "lastOutputSeconds":Z
    cmp-long v2, v5, v27

    if-nez v2, :cond_d

    const/4 v11, 0x1

    goto :goto_7

    :cond_d
    const/4 v11, 0x0

    .line 278
    .end local v18    # "lastOutputZero":Z
    .local v11, "lastOutputZero":Z
    :goto_7
    if-eqz v22, :cond_e

    if-nez v11, :cond_f

    .line 279
    :cond_e
    invoke-static {v5, v6, v15, v13}, Lorg/apache/commons/lang3/time/DurationFormatUtils;->paddedValue(JZI)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v14, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 313
    :cond_f
    :goto_8
    move/from16 v16, v1

    move/from16 v18, v11

    move-object v11, v0

    move-wide/from16 v0, p13

    goto/16 :goto_11

    .line 281
    .end local v1    # "lastOutputSeconds":Z
    .end local v11    # "lastOutputZero":Z
    .restart local v16    # "lastOutputSeconds":Z
    .restart local v18    # "lastOutputZero":Z
    :cond_10
    const-string v1, "H"

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_13

    .line 282
    const/4 v1, 0x0

    .line 283
    .end local v16    # "lastOutputSeconds":Z
    .restart local v1    # "lastOutputSeconds":Z
    cmp-long v2, v7, v27

    if-nez v2, :cond_11

    const/4 v11, 0x1

    goto :goto_9

    :cond_11
    const/4 v11, 0x0

    .line 284
    .end local v18    # "lastOutputZero":Z
    .restart local v11    # "lastOutputZero":Z
    :goto_9
    if-eqz v22, :cond_12

    if-nez v11, :cond_f

    .line 285
    :cond_12
    invoke-static {v7, v8, v15, v13}, Lorg/apache/commons/lang3/time/DurationFormatUtils;->paddedValue(JZI)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v14, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_8

    .line 287
    .end local v1    # "lastOutputSeconds":Z
    .end local v11    # "lastOutputZero":Z
    .restart local v16    # "lastOutputSeconds":Z
    .restart local v18    # "lastOutputZero":Z
    :cond_13
    const-string v1, "m"

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_16

    .line 288
    const/4 v1, 0x0

    .line 289
    .end local v16    # "lastOutputSeconds":Z
    .restart local v1    # "lastOutputSeconds":Z
    cmp-long v2, v9, v27

    if-nez v2, :cond_14

    const/4 v11, 0x1

    goto :goto_a

    :cond_14
    const/4 v11, 0x0

    .line 290
    .end local v18    # "lastOutputZero":Z
    .restart local v11    # "lastOutputZero":Z
    :goto_a
    if-eqz v22, :cond_15

    if-nez v11, :cond_f

    .line 291
    :cond_15
    invoke-static {v9, v10, v15, v13}, Lorg/apache/commons/lang3/time/DurationFormatUtils;->paddedValue(JZI)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v14, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_8

    .line 293
    .end local v1    # "lastOutputSeconds":Z
    .end local v11    # "lastOutputZero":Z
    .restart local v16    # "lastOutputSeconds":Z
    .restart local v18    # "lastOutputZero":Z
    :cond_16
    const-string/jumbo v1, "s"

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1a

    .line 294
    const/4 v1, 0x1

    .line 295
    .end local v16    # "lastOutputSeconds":Z
    .restart local v1    # "lastOutputSeconds":Z
    cmp-long v2, p11, v27

    if-nez v2, :cond_17

    const/4 v11, 0x1

    goto :goto_b

    :cond_17
    const/4 v11, 0x0

    .line 296
    .end local v18    # "lastOutputZero":Z
    .restart local v11    # "lastOutputZero":Z
    :goto_b
    if-eqz v22, :cond_19

    if-nez v11, :cond_18

    goto :goto_c

    :cond_18
    move/from16 v16, v1

    move-wide/from16 v1, p11

    goto :goto_d

    .line 297
    :cond_19
    :goto_c
    move/from16 v16, v1

    move-wide/from16 v1, p11

    .end local v1    # "lastOutputSeconds":Z
    .restart local v16    # "lastOutputSeconds":Z
    invoke-static {v1, v2, v15, v13}, Lorg/apache/commons/lang3/time/DurationFormatUtils;->paddedValue(JZI)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v14, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 313
    :goto_d
    move/from16 v18, v11

    move-object v11, v0

    move-wide/from16 v0, p13

    goto :goto_11

    .line 299
    .end local v11    # "lastOutputZero":Z
    .restart local v18    # "lastOutputZero":Z
    :cond_1a
    move-wide/from16 v1, p11

    const-string v3, "S"

    invoke-virtual {v0, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_20

    .line 300
    cmp-long v3, p13, v27

    if-nez v3, :cond_1b

    const/4 v3, 0x1

    goto :goto_e

    :cond_1b
    const/4 v3, 0x0

    .line 301
    .end local v18    # "lastOutputZero":Z
    .local v3, "lastOutputZero":Z
    :goto_e
    if-eqz v22, :cond_1d

    if-nez v3, :cond_1c

    goto :goto_f

    :cond_1c
    move-object v11, v0

    move-wide/from16 v0, p13

    goto :goto_10

    .line 302
    :cond_1d
    :goto_f
    if-eqz v16, :cond_1f

    .line 304
    const/4 v4, 0x3

    if-eqz v15, :cond_1e

    invoke-static {v4, v13}, Ljava/lang/Math;->max(II)I

    move-result v4

    .line 305
    .local v4, "width":I
    :cond_1e
    move-object v11, v0

    const/4 v2, 0x1

    move-wide/from16 v0, p13

    .end local v0    # "value":Ljava/lang/Object;
    .local v11, "value":Ljava/lang/Object;
    invoke-static {v0, v1, v2, v4}, Lorg/apache/commons/lang3/time/DurationFormatUtils;->paddedValue(JZI)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v14, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 306
    .end local v4    # "width":I
    goto :goto_10

    .line 307
    .end local v11    # "value":Ljava/lang/Object;
    .restart local v0    # "value":Ljava/lang/Object;
    :cond_1f
    move-object v11, v0

    move-wide/from16 v0, p13

    .end local v0    # "value":Ljava/lang/Object;
    .restart local v11    # "value":Ljava/lang/Object;
    invoke-static {v0, v1, v15, v13}, Lorg/apache/commons/lang3/time/DurationFormatUtils;->paddedValue(JZI)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v14, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 310
    :goto_10
    const/4 v2, 0x0

    move/from16 v16, v2

    move/from16 v18, v3

    .end local v16    # "lastOutputSeconds":Z
    .local v2, "lastOutputSeconds":Z
    goto :goto_11

    .line 299
    .end local v2    # "lastOutputSeconds":Z
    .end local v3    # "lastOutputZero":Z
    .end local v11    # "value":Ljava/lang/Object;
    .restart local v0    # "value":Ljava/lang/Object;
    .restart local v16    # "lastOutputSeconds":Z
    .restart local v18    # "lastOutputZero":Z
    :cond_20
    move-object v11, v0

    move-wide/from16 v0, p13

    .line 313
    .end local v0    # "value":Ljava/lang/Object;
    .restart local v11    # "value":Ljava/lang/Object;
    :goto_11
    if-eqz v22, :cond_22

    if-nez v26, :cond_22

    if-nez v20, :cond_22

    .line 314
    const/4 v2, 0x1

    .line 315
    .end local v20    # "firstOptionalNonLiteral":Z
    .local v2, "firstOptionalNonLiteral":Z
    if-eqz v18, :cond_21

    .line 316
    invoke-virtual {v14}, Ljava/lang/StringBuilder;->length()I

    move-result v3

    invoke-virtual {v14, v12, v3}, Ljava/lang/StringBuilder;->delete(II)Ljava/lang/StringBuilder;

    .line 242
    .end local v11    # "value":Ljava/lang/Object;
    .end local v13    # "count":I
    .end local v23    # "token":Lorg/apache/commons/lang3/time/DurationFormatUtils$Token;
    .end local v26    # "isLiteral":Z
    :cond_21
    move/from16 v20, v2

    .end local v2    # "firstOptionalNonLiteral":Z
    .restart local v20    # "firstOptionalNonLiteral":Z
    :cond_22
    add-int/lit8 v2, v24, 0x1

    move-wide/from16 v3, p3

    move v0, v2

    move-object/from16 v17, v14

    move/from16 v14, v19

    move/from16 v13, v25

    move-wide/from16 v1, p1

    move/from16 v19, v12

    goto/16 :goto_0

    .line 320
    .end local v12    # "optionalStart":I
    .local v14, "optionalIndex":I
    .local v17, "buffer":Ljava/lang/StringBuilder;
    .local v19, "optionalStart":I
    :cond_23
    move v2, v14

    move-object/from16 v14, v17

    .end local v17    # "buffer":Ljava/lang/StringBuilder;
    .local v2, "optionalIndex":I
    .local v14, "buffer":Ljava/lang/StringBuilder;
    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    return-object v3
.end method

.method public static formatDuration(JLjava/lang/String;)Ljava/lang/String;
    .locals 1
    .param p0, "durationMillis"    # J
    .param p2, "format"    # Ljava/lang/String;

    .line 335
    const/4 v0, 0x1

    invoke-static {p0, p1, p2, v0}, Lorg/apache/commons/lang3/time/DurationFormatUtils;->formatDuration(JLjava/lang/String;Z)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static formatDuration(JLjava/lang/String;Z)Ljava/lang/String;
    .locals 19
    .param p0, "durationMillis"    # J
    .param p2, "format"    # Ljava/lang/String;
    .param p3, "padWithZeros"    # Z

    .line 352
    const-wide v2, 0x7fffffffffffffffL

    const-string v6, "durationMillis must not be negative"

    const-wide/16 v0, 0x0

    move-wide/from16 v4, p0

    invoke-static/range {v0 .. v6}, Lorg/apache/commons/lang3/Validate;->inclusiveBetween(JJJLjava/lang/String;)V

    .line 354
    invoke-static/range {p2 .. p2}, Lorg/apache/commons/lang3/time/DurationFormatUtils;->lexx(Ljava/lang/String;)[Lorg/apache/commons/lang3/time/DurationFormatUtils$Token;

    move-result-object v1

    .line 356
    .local v1, "tokens":[Lorg/apache/commons/lang3/time/DurationFormatUtils$Token;
    const-wide/16 v2, 0x0

    .line 357
    .local v2, "days":J
    const-wide/16 v4, 0x0

    .line 358
    .local v4, "hours":J
    const-wide/16 v6, 0x0

    .line 359
    .local v6, "minutes":J
    const-wide/16 v8, 0x0

    .line 360
    .local v8, "seconds":J
    move-wide/from16 v10, p0

    .line 362
    .local v10, "milliseconds":J
    const-string v0, "d"

    invoke-static {v1, v0}, Lorg/apache/commons/lang3/time/DurationFormatUtils$Token;->containsTokenWithValue([Lorg/apache/commons/lang3/time/DurationFormatUtils$Token;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 363
    const-wide/32 v12, 0x5265c00

    div-long v2, v10, v12

    .line 364
    mul-long/2addr v12, v2

    sub-long/2addr v10, v12

    .line 366
    :cond_0
    const-string v0, "H"

    invoke-static {v1, v0}, Lorg/apache/commons/lang3/time/DurationFormatUtils$Token;->containsTokenWithValue([Lorg/apache/commons/lang3/time/DurationFormatUtils$Token;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 367
    const-wide/32 v12, 0x36ee80

    div-long v4, v10, v12

    .line 368
    mul-long/2addr v12, v4

    sub-long/2addr v10, v12

    .line 370
    :cond_1
    const-string v0, "m"

    invoke-static {v1, v0}, Lorg/apache/commons/lang3/time/DurationFormatUtils$Token;->containsTokenWithValue([Lorg/apache/commons/lang3/time/DurationFormatUtils$Token;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 371
    const-wide/32 v12, 0xea60

    div-long v6, v10, v12

    .line 372
    mul-long/2addr v12, v6

    sub-long/2addr v10, v12

    move-wide/from16 v17, v10

    move-wide v10, v6

    move-wide/from16 v6, v17

    goto :goto_0

    .line 370
    :cond_2
    move-wide/from16 v17, v10

    move-wide v10, v6

    move-wide/from16 v6, v17

    .line 374
    .local v6, "milliseconds":J
    .local v10, "minutes":J
    :goto_0
    const-string/jumbo v0, "s"

    invoke-static {v1, v0}, Lorg/apache/commons/lang3/time/DurationFormatUtils$Token;->containsTokenWithValue([Lorg/apache/commons/lang3/time/DurationFormatUtils$Token;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 375
    const-wide/16 v12, 0x3e8

    div-long v8, v6, v12

    .line 376
    mul-long/2addr v12, v8

    sub-long/2addr v6, v12

    move-wide v14, v6

    move-wide v12, v8

    goto :goto_1

    .line 374
    :cond_3
    move-wide v14, v6

    move-wide v12, v8

    .line 379
    .end local v6    # "milliseconds":J
    .end local v8    # "seconds":J
    .local v12, "seconds":J
    .local v14, "milliseconds":J
    :goto_1
    move-wide v6, v2

    .end local v2    # "days":J
    .local v6, "days":J
    const-wide/16 v2, 0x0

    move-wide v8, v4

    .end local v4    # "hours":J
    .local v8, "hours":J
    const-wide/16 v4, 0x0

    move/from16 v16, p3

    invoke-static/range {v1 .. v16}, Lorg/apache/commons/lang3/time/DurationFormatUtils;->format([Lorg/apache/commons/lang3/time/DurationFormatUtils$Token;JJJJJJJZ)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static formatDurationHMS(J)Ljava/lang/String;
    .locals 1
    .param p0, "durationMillis"    # J

    .line 392
    const-string v0, "HH:mm:ss.SSS"

    invoke-static {p0, p1, v0}, Lorg/apache/commons/lang3/time/DurationFormatUtils;->formatDuration(JLjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static formatDurationISO(J)Ljava/lang/String;
    .locals 2
    .param p0, "durationMillis"    # J

    .line 407
    const-string v0, "\'P\'yyyy\'Y\'M\'M\'d\'DT\'H\'H\'m\'M\'s.SSS\'S\'"

    const/4 v1, 0x0

    invoke-static {p0, p1, v0, v1}, Lorg/apache/commons/lang3/time/DurationFormatUtils;->formatDuration(JLjava/lang/String;Z)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static formatDurationWords(JZZ)Ljava/lang/String;
    .locals 9
    .param p0, "durationMillis"    # J
    .param p2, "suppressLeadingZeroElements"    # Z
    .param p3, "suppressTrailingZeroElements"    # Z

    .line 429
    const-string v0, "d\' days \'H\' hours \'m\' minutes \'s\' seconds\'"

    invoke-static {p0, p1, v0}, Lorg/apache/commons/lang3/time/DurationFormatUtils;->formatDuration(JLjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 430
    .local v0, "duration":Ljava/lang/String;
    const-string v1, " 0 minutes"

    const-string v2, " 0 hours"

    const-string v3, " 0 days"

    const-string v4, " "

    const-string v5, ""

    if-eqz p2, :cond_1

    .line 432
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 433
    invoke-static {v0, v3, v5}, Lorg/apache/commons/lang3/StringUtils;->replaceOnce(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 434
    .local v6, "tmp":Ljava/lang/String;
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v7

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v8

    if-eq v7, v8, :cond_0

    .line 435
    move-object v0, v6

    .line 436
    invoke-static {v0, v2, v5}, Lorg/apache/commons/lang3/StringUtils;->replaceOnce(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 437
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v7

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v8

    if-eq v7, v8, :cond_0

    .line 438
    move-object v0, v6

    .line 439
    invoke-static {v0, v1, v5}, Lorg/apache/commons/lang3/StringUtils;->replaceOnce(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 440
    move-object v0, v6

    .line 443
    :cond_0
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v7

    if-nez v7, :cond_1

    .line 445
    const/4 v7, 0x1

    invoke-virtual {v0, v7}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    .line 448
    .end local v6    # "tmp":Ljava/lang/String;
    :cond_1
    if-eqz p3, :cond_2

    .line 449
    const-string v6, " 0 seconds"

    invoke-static {v0, v6, v5}, Lorg/apache/commons/lang3/StringUtils;->replaceOnce(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 450
    .restart local v6    # "tmp":Ljava/lang/String;
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v7

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v8

    if-eq v7, v8, :cond_2

    .line 451
    move-object v0, v6

    .line 452
    invoke-static {v0, v1, v5}, Lorg/apache/commons/lang3/StringUtils;->replaceOnce(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 453
    .end local v6    # "tmp":Ljava/lang/String;
    .local v1, "tmp":Ljava/lang/String;
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v6

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v7

    if-eq v6, v7, :cond_2

    .line 454
    move-object v0, v1

    .line 455
    invoke-static {v0, v2, v5}, Lorg/apache/commons/lang3/StringUtils;->replaceOnce(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 456
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v6

    if-eq v2, v6, :cond_2

    .line 457
    invoke-static {v1, v3, v5}, Lorg/apache/commons/lang3/StringUtils;->replaceOnce(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 463
    .end local v1    # "tmp":Ljava/lang/String;
    :cond_2
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 464
    const-string v1, " 1 seconds"

    const-string v2, " 1 second"

    invoke-static {v0, v1, v2}, Lorg/apache/commons/lang3/StringUtils;->replaceOnce(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 465
    const-string v1, " 1 minutes"

    const-string v2, " 1 minute"

    invoke-static {v0, v1, v2}, Lorg/apache/commons/lang3/StringUtils;->replaceOnce(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 466
    const-string v1, " 1 hours"

    const-string v2, " 1 hour"

    invoke-static {v0, v1, v2}, Lorg/apache/commons/lang3/StringUtils;->replaceOnce(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 467
    const-string v1, " 1 days"

    const-string v2, " 1 day"

    invoke-static {v0, v1, v2}, Lorg/apache/commons/lang3/StringUtils;->replaceOnce(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 468
    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    return-object v1
.end method

.method public static formatPeriod(JJLjava/lang/String;)Ljava/lang/String;
    .locals 7
    .param p0, "startMillis"    # J
    .param p2, "endMillis"    # J
    .param p4, "format"    # Ljava/lang/String;

    .line 481
    const/4 v5, 0x1

    invoke-static {}, Ljava/util/TimeZone;->getDefault()Ljava/util/TimeZone;

    move-result-object v6

    move-wide v0, p0

    move-wide v2, p2

    move-object v4, p4

    .end local p0    # "startMillis":J
    .end local p2    # "endMillis":J
    .end local p4    # "format":Ljava/lang/String;
    .local v0, "startMillis":J
    .local v2, "endMillis":J
    .local v4, "format":Ljava/lang/String;
    invoke-static/range {v0 .. v6}, Lorg/apache/commons/lang3/time/DurationFormatUtils;->formatPeriod(JJLjava/lang/String;ZLjava/util/TimeZone;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static formatPeriod(JJLjava/lang/String;ZLjava/util/TimeZone;)Ljava/lang/String;
    .locals 31
    .param p0, "startMillis"    # J
    .param p2, "endMillis"    # J
    .param p4, "format"    # Ljava/lang/String;
    .param p5, "padWithZeros"    # Z
    .param p6, "timezone"    # Ljava/util/TimeZone;

    .line 509
    move-wide/from16 v0, p0

    move-wide/from16 v2, p2

    cmp-long v4, v0, v2

    const/4 v5, 0x0

    const/4 v6, 0x1

    if-gtz v4, :cond_0

    move v4, v6

    goto :goto_0

    :cond_0
    move v4, v5

    :goto_0
    const-string/jumbo v7, "startMillis must not be greater than endMillis"

    new-array v5, v5, [Ljava/lang/Object;

    invoke-static {v4, v7, v5}, Lorg/apache/commons/lang3/Validate;->isTrue(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 518
    invoke-static/range {p4 .. p4}, Lorg/apache/commons/lang3/time/DurationFormatUtils;->lexx(Ljava/lang/String;)[Lorg/apache/commons/lang3/time/DurationFormatUtils$Token;

    move-result-object v8

    .line 522
    .local v8, "tokens":[Lorg/apache/commons/lang3/time/DurationFormatUtils$Token;
    invoke-static/range {p6 .. p6}, Ljava/util/Calendar;->getInstance(Ljava/util/TimeZone;)Ljava/util/Calendar;

    move-result-object v4

    .line 523
    .local v4, "start":Ljava/util/Calendar;
    new-instance v5, Ljava/util/Date;

    invoke-direct {v5, v0, v1}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {v4, v5}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V

    .line 524
    invoke-static/range {p6 .. p6}, Ljava/util/Calendar;->getInstance(Ljava/util/TimeZone;)Ljava/util/Calendar;

    move-result-object v5

    .line 525
    .local v5, "end":Ljava/util/Calendar;
    new-instance v7, Ljava/util/Date;

    invoke-direct {v7, v2, v3}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {v5, v7}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V

    .line 528
    const/16 v7, 0xe

    invoke-virtual {v5, v7}, Ljava/util/Calendar;->get(I)I

    move-result v9

    invoke-virtual {v4, v7}, Ljava/util/Calendar;->get(I)I

    move-result v7

    sub-int/2addr v9, v7

    .line 529
    .local v9, "milliseconds":I
    const/16 v7, 0xd

    invoke-virtual {v5, v7}, Ljava/util/Calendar;->get(I)I

    move-result v10

    invoke-virtual {v4, v7}, Ljava/util/Calendar;->get(I)I

    move-result v7

    sub-int/2addr v10, v7

    .line 530
    .local v10, "seconds":I
    const/16 v7, 0xc

    invoke-virtual {v5, v7}, Ljava/util/Calendar;->get(I)I

    move-result v11

    invoke-virtual {v4, v7}, Ljava/util/Calendar;->get(I)I

    move-result v7

    sub-int/2addr v11, v7

    .line 531
    .local v11, "minutes":I
    const/16 v7, 0xb

    invoke-virtual {v5, v7}, Ljava/util/Calendar;->get(I)I

    move-result v12

    invoke-virtual {v4, v7}, Ljava/util/Calendar;->get(I)I

    move-result v7

    sub-int/2addr v12, v7

    .line 532
    .local v12, "hours":I
    const/4 v7, 0x5

    invoke-virtual {v5, v7}, Ljava/util/Calendar;->get(I)I

    move-result v13

    invoke-virtual {v4, v7}, Ljava/util/Calendar;->get(I)I

    move-result v14

    sub-int/2addr v13, v14

    .line 533
    .local v13, "days":I
    const/4 v14, 0x2

    invoke-virtual {v5, v14}, Ljava/util/Calendar;->get(I)I

    move-result v15

    invoke-virtual {v4, v14}, Ljava/util/Calendar;->get(I)I

    move-result v16

    sub-int v15, v15, v16

    .line 534
    .local v15, "months":I
    invoke-virtual {v5, v6}, Ljava/util/Calendar;->get(I)I

    move-result v16

    invoke-virtual {v4, v6}, Ljava/util/Calendar;->get(I)I

    move-result v17

    sub-int v16, v16, v17

    .line 537
    .local v16, "years":I
    :goto_1
    if-gez v9, :cond_1

    .line 538
    add-int/lit16 v9, v9, 0x3e8

    .line 539
    add-int/lit8 v10, v10, -0x1

    goto :goto_1

    .line 541
    :cond_1
    :goto_2
    if-gez v10, :cond_2

    .line 542
    add-int/lit8 v10, v10, 0x3c

    .line 543
    add-int/lit8 v11, v11, -0x1

    goto :goto_2

    .line 545
    :cond_2
    :goto_3
    if-gez v11, :cond_3

    .line 546
    add-int/lit8 v11, v11, 0x3c

    .line 547
    add-int/lit8 v12, v12, -0x1

    goto :goto_3

    .line 549
    :cond_3
    :goto_4
    if-gez v12, :cond_4

    .line 550
    add-int/lit8 v12, v12, 0x18

    .line 551
    add-int/lit8 v13, v13, -0x1

    goto :goto_4

    .line 554
    :cond_4
    const-string v6, "M"

    invoke-static {v8, v6}, Lorg/apache/commons/lang3/time/DurationFormatUtils$Token;->containsTokenWithValue([Lorg/apache/commons/lang3/time/DurationFormatUtils$Token;Ljava/lang/Object;)Z

    move-result v6

    const-string/jumbo v14, "y"

    if-eqz v6, :cond_9

    .line 555
    :goto_5
    if-gez v13, :cond_5

    .line 556
    invoke-virtual {v4, v7}, Ljava/util/Calendar;->getActualMaximum(I)I

    move-result v6

    add-int/2addr v13, v6

    .line 557
    add-int/lit8 v15, v15, -0x1

    .line 558
    const/4 v6, 0x2

    const/4 v7, 0x1

    invoke-virtual {v4, v6, v7}, Ljava/util/Calendar;->add(II)V

    const/4 v7, 0x5

    goto :goto_5

    .line 561
    :cond_5
    :goto_6
    if-gez v15, :cond_6

    .line 562
    add-int/lit8 v15, v15, 0xc

    .line 563
    add-int/lit8 v16, v16, -0x1

    goto :goto_6

    .line 566
    :cond_6
    invoke-static {v8, v14}, Lorg/apache/commons/lang3/time/DurationFormatUtils$Token;->containsTokenWithValue([Lorg/apache/commons/lang3/time/DurationFormatUtils$Token;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_8

    if-eqz v16, :cond_8

    .line 567
    :goto_7
    if-eqz v16, :cond_7

    .line 568
    mul-int/lit8 v6, v16, 0xc

    add-int/2addr v15, v6

    .line 569
    const/16 v16, 0x0

    goto :goto_7

    .line 567
    :cond_7
    move v6, v15

    move/from16 v7, v16

    goto/16 :goto_b

    .line 619
    :cond_8
    move v6, v15

    move/from16 v7, v16

    goto/16 :goto_b

    .line 575
    :cond_9
    invoke-static {v8, v14}, Lorg/apache/commons/lang3/time/DurationFormatUtils$Token;->containsTokenWithValue([Lorg/apache/commons/lang3/time/DurationFormatUtils$Token;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_d

    .line 576
    const/4 v7, 0x1

    invoke-virtual {v5, v7}, Ljava/util/Calendar;->get(I)I

    move-result v6

    .line 577
    .local v6, "target":I
    if-gez v15, :cond_a

    .line 579
    add-int/lit8 v6, v6, -0x1

    .line 582
    :cond_a
    :goto_8
    invoke-virtual {v4, v7}, Ljava/util/Calendar;->get(I)I

    move-result v14

    if-eq v14, v6, :cond_c

    .line 583
    const/4 v7, 0x6

    invoke-virtual {v4, v7}, Ljava/util/Calendar;->getActualMaximum(I)I

    move-result v14

    invoke-virtual {v4, v7}, Ljava/util/Calendar;->get(I)I

    move-result v20

    sub-int v14, v14, v20

    add-int/2addr v13, v14

    .line 586
    instance-of v14, v4, Ljava/util/GregorianCalendar;

    if-eqz v14, :cond_b

    .line 587
    const/4 v14, 0x2

    invoke-virtual {v4, v14}, Ljava/util/Calendar;->get(I)I

    move-result v7

    const/4 v14, 0x1

    if-ne v7, v14, :cond_b

    .line 588
    const/4 v7, 0x5

    invoke-virtual {v4, v7}, Ljava/util/Calendar;->get(I)I

    move-result v14

    const/16 v7, 0x1d

    if-ne v14, v7, :cond_b

    .line 589
    add-int/lit8 v13, v13, 0x1

    .line 592
    :cond_b
    const/4 v7, 0x1

    invoke-virtual {v4, v7, v7}, Ljava/util/Calendar;->add(II)V

    .line 594
    const/4 v7, 0x6

    invoke-virtual {v4, v7}, Ljava/util/Calendar;->get(I)I

    move-result v7

    add-int/2addr v13, v7

    const/4 v7, 0x1

    goto :goto_8

    .line 597
    :cond_c
    const/16 v16, 0x0

    .line 600
    .end local v6    # "target":I
    :cond_d
    :goto_9
    const/4 v14, 0x2

    invoke-virtual {v4, v14}, Ljava/util/Calendar;->get(I)I

    move-result v6

    invoke-virtual {v5, v14}, Ljava/util/Calendar;->get(I)I

    move-result v7

    if-eq v6, v7, :cond_e

    .line 601
    const/4 v7, 0x5

    invoke-virtual {v4, v7}, Ljava/util/Calendar;->getActualMaximum(I)I

    move-result v6

    add-int/2addr v13, v6

    .line 602
    const/4 v6, 0x1

    invoke-virtual {v4, v14, v6}, Ljava/util/Calendar;->add(II)V

    goto :goto_9

    .line 605
    :cond_e
    const/4 v7, 0x5

    const/4 v6, 0x0

    move v15, v6

    .line 607
    :goto_a
    if-gez v13, :cond_f

    .line 608
    invoke-virtual {v4, v7}, Ljava/util/Calendar;->getActualMaximum(I)I

    move-result v6

    add-int/2addr v13, v6

    .line 609
    add-int/lit8 v15, v15, -0x1

    .line 610
    const/4 v6, 0x1

    const/4 v14, 0x2

    invoke-virtual {v4, v14, v6}, Ljava/util/Calendar;->add(II)V

    goto :goto_a

    .line 607
    :cond_f
    move v6, v15

    move/from16 v7, v16

    .line 619
    .end local v15    # "months":I
    .end local v16    # "years":I
    .local v6, "months":I
    .local v7, "years":I
    :goto_b
    const-string v14, "d"

    invoke-static {v8, v14}, Lorg/apache/commons/lang3/time/DurationFormatUtils$Token;->containsTokenWithValue([Lorg/apache/commons/lang3/time/DurationFormatUtils$Token;Ljava/lang/Object;)Z

    move-result v14

    if-nez v14, :cond_10

    .line 620
    mul-int/lit8 v14, v13, 0x18

    add-int/2addr v12, v14

    .line 621
    const/4 v13, 0x0

    .line 623
    :cond_10
    const-string v14, "H"

    invoke-static {v8, v14}, Lorg/apache/commons/lang3/time/DurationFormatUtils$Token;->containsTokenWithValue([Lorg/apache/commons/lang3/time/DurationFormatUtils$Token;Ljava/lang/Object;)Z

    move-result v14

    if-nez v14, :cond_11

    .line 624
    mul-int/lit8 v14, v12, 0x3c

    add-int/2addr v11, v14

    .line 625
    const/4 v12, 0x0

    .line 627
    :cond_11
    const-string v14, "m"

    invoke-static {v8, v14}, Lorg/apache/commons/lang3/time/DurationFormatUtils$Token;->containsTokenWithValue([Lorg/apache/commons/lang3/time/DurationFormatUtils$Token;Ljava/lang/Object;)Z

    move-result v14

    if-nez v14, :cond_12

    .line 628
    mul-int/lit8 v14, v11, 0x3c

    add-int/2addr v10, v14

    .line 629
    const/4 v11, 0x0

    .line 631
    :cond_12
    const-string/jumbo v14, "s"

    invoke-static {v8, v14}, Lorg/apache/commons/lang3/time/DurationFormatUtils$Token;->containsTokenWithValue([Lorg/apache/commons/lang3/time/DurationFormatUtils$Token;Ljava/lang/Object;)Z

    move-result v14

    if-nez v14, :cond_13

    .line 632
    mul-int/lit16 v14, v10, 0x3e8

    add-int/2addr v9, v14

    .line 633
    const/4 v10, 0x0

    .line 636
    :cond_13
    int-to-long v14, v7

    int-to-long v0, v6

    move-wide/from16 v17, v0

    move v0, v13

    move-wide v15, v14

    .end local v13    # "days":I
    .local v0, "days":I
    int-to-long v13, v0

    move/from16 v19, v0

    .end local v0    # "days":I
    .local v19, "days":I
    int-to-long v0, v12

    move-wide/from16 v20, v0

    int-to-long v0, v11

    move-wide/from16 v22, v0

    int-to-long v0, v10

    move-wide/from16 v24, v0

    int-to-long v0, v9

    move/from16 v26, v19

    move-wide/from16 v27, v22

    move/from16 v23, p5

    move-wide/from16 v29, v0

    move v1, v9

    move v0, v10

    move-wide v9, v15

    move-wide/from16 v15, v20

    move-wide/from16 v19, v24

    move-wide/from16 v21, v29

    move/from16 v24, v11

    move/from16 v25, v12

    move-wide/from16 v11, v17

    move-wide/from16 v17, v27

    .end local v9    # "milliseconds":I
    .end local v10    # "seconds":I
    .end local v11    # "minutes":I
    .end local v12    # "hours":I
    .end local v19    # "days":I
    .local v0, "seconds":I
    .local v1, "milliseconds":I
    .local v24, "minutes":I
    .local v25, "hours":I
    .local v26, "days":I
    invoke-static/range {v8 .. v23}, Lorg/apache/commons/lang3/time/DurationFormatUtils;->format([Lorg/apache/commons/lang3/time/DurationFormatUtils$Token;JJJJJJJZ)Ljava/lang/String;

    move-result-object v9

    return-object v9
.end method

.method public static formatPeriodISO(JJ)Ljava/lang/String;
    .locals 7
    .param p0, "startMillis"    # J
    .param p2, "endMillis"    # J

    .line 649
    const/4 v5, 0x0

    invoke-static {}, Ljava/util/TimeZone;->getDefault()Ljava/util/TimeZone;

    move-result-object v6

    const-string v4, "\'P\'yyyy\'Y\'M\'M\'d\'DT\'H\'H\'m\'M\'s.SSS\'S\'"

    move-wide v0, p0

    move-wide v2, p2

    .end local p0    # "startMillis":J
    .end local p2    # "endMillis":J
    .local v0, "startMillis":J
    .local v2, "endMillis":J
    invoke-static/range {v0 .. v6}, Lorg/apache/commons/lang3/time/DurationFormatUtils;->formatPeriod(JJLjava/lang/String;ZLjava/util/TimeZone;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method static lexx(Ljava/lang/String;)[Lorg/apache/commons/lang3/time/DurationFormatUtils$Token;
    .locals 12
    .param p0, "format"    # Ljava/lang/String;

    .line 658
    new-instance v0, Ljava/util/ArrayList;

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 660
    .local v0, "list":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lorg/apache/commons/lang3/time/DurationFormatUtils$Token;>;"
    const/4 v1, 0x0

    .line 663
    .local v1, "inLiteral":Z
    const/4 v2, 0x0

    .line 664
    .local v2, "buffer":Ljava/lang/StringBuilder;
    const/4 v3, 0x0

    .line 665
    .local v3, "previous":Lorg/apache/commons/lang3/time/DurationFormatUtils$Token;
    const/4 v4, 0x0

    .line 666
    .local v4, "inOptional":Z
    const/4 v5, -0x1

    .line 667
    .local v5, "optionalIndex":I
    const/4 v6, 0x0

    .local v6, "i":I
    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v7

    if-ge v6, v7, :cond_7

    .line 668
    invoke-virtual {p0, v6}, Ljava/lang/String;->charAt(I)C

    move-result v7

    .line 669
    .local v7, "ch":C
    if-eqz v1, :cond_0

    const/16 v8, 0x27

    if-eq v7, v8, :cond_0

    .line 670
    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 671
    goto/16 :goto_4

    .line 673
    :cond_0
    const/4 v8, 0x0

    .line 674
    .local v8, "value":Ljava/lang/String;
    sparse-switch v7, :sswitch_data_0

    .line 721
    if-nez v2, :cond_4

    .line 722
    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    move-object v2, v9

    .line 723
    new-instance v9, Lorg/apache/commons/lang3/time/DurationFormatUtils$Token;

    invoke-direct {v9, v2, v4, v5}, Lorg/apache/commons/lang3/time/DurationFormatUtils$Token;-><init>(Ljava/lang/Object;ZI)V

    invoke-virtual {v0, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_1

    .line 700
    :sswitch_0
    const-string/jumbo v8, "y"

    .line 701
    goto/16 :goto_2

    .line 715
    :sswitch_1
    const-string/jumbo v8, "s"

    .line 716
    goto :goto_2

    .line 712
    :sswitch_2
    const-string v8, "m"

    .line 713
    goto :goto_2

    .line 706
    :sswitch_3
    const-string v8, "d"

    .line 707
    goto :goto_2

    .line 684
    :sswitch_4
    if-eqz v4, :cond_1

    .line 687
    const/4 v4, 0x0

    .line 688
    goto :goto_2

    .line 685
    :cond_1
    new-instance v9, Ljava/lang/IllegalArgumentException;

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    const-string v11, "Attempting to close unopened optional block at index: "

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {v10, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-direct {v9, v10}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v9

    .line 677
    :sswitch_5
    if-nez v4, :cond_2

    .line 680
    add-int/lit8 v5, v5, 0x1

    .line 681
    const/4 v4, 0x1

    .line 682
    goto :goto_2

    .line 678
    :cond_2
    new-instance v9, Ljava/lang/IllegalArgumentException;

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    const-string v11, "Nested optional block at index: "

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {v10, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-direct {v9, v10}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v9

    .line 718
    :sswitch_6
    const-string v8, "S"

    .line 719
    goto :goto_2

    .line 703
    :sswitch_7
    const-string v8, "M"

    .line 704
    goto :goto_2

    .line 709
    :sswitch_8
    const-string v8, "H"

    .line 710
    goto :goto_2

    .line 690
    :sswitch_9
    if-eqz v1, :cond_3

    .line 691
    const/4 v2, 0x0

    .line 692
    const/4 v1, 0x0

    goto :goto_2

    .line 694
    :cond_3
    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    move-object v2, v9

    .line 695
    new-instance v9, Lorg/apache/commons/lang3/time/DurationFormatUtils$Token;

    invoke-direct {v9, v2, v4, v5}, Lorg/apache/commons/lang3/time/DurationFormatUtils$Token;-><init>(Ljava/lang/Object;ZI)V

    invoke-virtual {v0, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 696
    const/4 v1, 0x1

    .line 698
    goto :goto_2

    .line 725
    :cond_4
    :goto_1
    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 728
    :goto_2
    if-eqz v8, :cond_6

    .line 729
    if-eqz v3, :cond_5

    invoke-virtual {v3}, Lorg/apache/commons/lang3/time/DurationFormatUtils$Token;->getValue()Ljava/lang/Object;

    move-result-object v9

    invoke-virtual {v9, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_5

    .line 730
    invoke-virtual {v3}, Lorg/apache/commons/lang3/time/DurationFormatUtils$Token;->increment()V

    goto :goto_3

    .line 732
    :cond_5
    new-instance v9, Lorg/apache/commons/lang3/time/DurationFormatUtils$Token;

    invoke-direct {v9, v8, v4, v5}, Lorg/apache/commons/lang3/time/DurationFormatUtils$Token;-><init>(Ljava/lang/Object;ZI)V

    .line 733
    .local v9, "token":Lorg/apache/commons/lang3/time/DurationFormatUtils$Token;
    invoke-virtual {v0, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 734
    move-object v3, v9

    .line 736
    .end local v9    # "token":Lorg/apache/commons/lang3/time/DurationFormatUtils$Token;
    :goto_3
    const/4 v2, 0x0

    .line 667
    .end local v7    # "ch":C
    .end local v8    # "value":Ljava/lang/String;
    :cond_6
    :goto_4
    add-int/lit8 v6, v6, 0x1

    goto/16 :goto_0

    .line 739
    .end local v6    # "i":I
    :cond_7
    if-nez v1, :cond_9

    .line 742
    if-nez v4, :cond_8

    .line 745
    invoke-static {}, Lorg/apache/commons/lang3/time/DurationFormatUtils$Token;->access$100()[Lorg/apache/commons/lang3/time/DurationFormatUtils$Token;

    move-result-object v6

    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v6

    check-cast v6, [Lorg/apache/commons/lang3/time/DurationFormatUtils$Token;

    return-object v6

    .line 743
    :cond_8
    new-instance v6, Ljava/lang/IllegalArgumentException;

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "Unmatched optional in format: "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-direct {v6, v7}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v6

    .line 740
    :cond_9
    new-instance v6, Ljava/lang/IllegalArgumentException;

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "Unmatched quote in format: "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-direct {v6, v7}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v6

    nop

    :sswitch_data_0
    .sparse-switch
        0x27 -> :sswitch_9
        0x48 -> :sswitch_8
        0x4d -> :sswitch_7
        0x53 -> :sswitch_6
        0x5b -> :sswitch_5
        0x5d -> :sswitch_4
        0x64 -> :sswitch_3
        0x6d -> :sswitch_2
        0x73 -> :sswitch_1
        0x79 -> :sswitch_0
    .end sparse-switch
.end method

.method private static paddedValue(JZI)Ljava/lang/String;
    .locals 2
    .param p0, "value"    # J
    .param p2, "padWithZeros"    # Z
    .param p3, "count"    # I

    .line 758
    invoke-static {p0, p1}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    .line 759
    .local v0, "longString":Ljava/lang/String;
    if-eqz p2, :cond_0

    const/16 v1, 0x30

    invoke-static {v0, p3, v1}, Lorg/apache/commons/lang3/StringUtils;->leftPad(Ljava/lang/String;IC)Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_0
    move-object v1, v0

    :goto_0
    return-object v1
.end method
