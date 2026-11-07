.class public abstract Lorg/apache/commons/compress/harmony/pack200/BandSet;
.super Ljava/lang/Object;
.source "BandSet.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/apache/commons/compress/harmony/pack200/BandSet$BandAnalysisResults;,
        Lorg/apache/commons/compress/harmony/pack200/BandSet$BandData;
    }
.end annotation


# static fields
.field private static final EMPTY_BYTE_ARRAY:[B

.field private static final effortThresholds:[I


# instance fields
.field private canonicalLargest:[J

.field private canonicalSmallest:[J

.field final effort:I

.field protected final segmentHeader:Lorg/apache/commons/compress/harmony/pack200/SegmentHeader;


# direct methods
.method public static synthetic $r8$lambda$RqCD3zSvnfgO6EXcT0JyNGOcuC0(Ljava/lang/Integer;)I
    .locals 0

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    return p0
.end method

.method public static synthetic $r8$lambda$jYZje6IE9GevyXAfkN1d0xvKij4(Ljava/lang/Long;)J
    .locals 2

    invoke-virtual {p0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    return-wide v0
.end method

.method static constructor <clinit>()V
    .locals 1

    .line 33
    const/4 v0, 0x0

    new-array v0, v0, [B

    sput-object v0, Lorg/apache/commons/compress/harmony/pack200/BandSet;->EMPTY_BYTE_ARRAY:[B

    .line 185
    const/16 v0, 0xa

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    sput-object v0, Lorg/apache/commons/compress/harmony/pack200/BandSet;->effortThresholds:[I

    return-void

    nop

    :array_0
    .array-data 4
        0x0
        0x0
        0x3e8
        0x1f4
        0x64
        0x64
        0x64
        0x64
        0x64
        0x0
    .end array-data
.end method

.method public constructor <init>(ILorg/apache/commons/compress/harmony/pack200/SegmentHeader;)V
    .locals 0
    .param p1, "effort"    # I
    .param p2, "header"    # Lorg/apache/commons/compress/harmony/pack200/SegmentHeader;

    .line 200
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 201
    iput p1, p0, Lorg/apache/commons/compress/harmony/pack200/BandSet;->effort:I

    .line 202
    iput-object p2, p0, Lorg/apache/commons/compress/harmony/pack200/BandSet;->segmentHeader:Lorg/apache/commons/compress/harmony/pack200/SegmentHeader;

    .line 203
    return-void
.end method

.method private analyseBand(Ljava/lang/String;[ILorg/apache/commons/compress/harmony/pack200/BHSDCodec;)Lorg/apache/commons/compress/harmony/pack200/BandSet$BandAnalysisResults;
    .locals 9
    .param p1, "name"    # Ljava/lang/String;
    .param p2, "band"    # [I
    .param p3, "defaultCodec"    # Lorg/apache/commons/compress/harmony/pack200/BHSDCodec;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/commons/compress/harmony/pack200/Pack200Exception;
        }
    .end annotation

    .line 207
    new-instance v0, Lorg/apache/commons/compress/harmony/pack200/BandSet$BandAnalysisResults;

    invoke-direct {v0, p0}, Lorg/apache/commons/compress/harmony/pack200/BandSet$BandAnalysisResults;-><init>(Lorg/apache/commons/compress/harmony/pack200/BandSet;)V

    move-object v6, v0

    .line 209
    .local v6, "results":Lorg/apache/commons/compress/harmony/pack200/BandSet$BandAnalysisResults;
    iget-object v0, p0, Lorg/apache/commons/compress/harmony/pack200/BandSet;->canonicalLargest:[J

    if-nez v0, :cond_0

    .line 210
    const/16 v0, 0x74

    new-array v1, v0, [J

    iput-object v1, p0, Lorg/apache/commons/compress/harmony/pack200/BandSet;->canonicalLargest:[J

    .line 211
    new-array v0, v0, [J

    iput-object v0, p0, Lorg/apache/commons/compress/harmony/pack200/BandSet;->canonicalSmallest:[J

    .line 212
    const/4 v0, 0x1

    .local v0, "i":I
    :goto_0
    iget-object v1, p0, Lorg/apache/commons/compress/harmony/pack200/BandSet;->canonicalLargest:[J

    array-length v1, v1

    if-ge v0, v1, :cond_0

    .line 213
    iget-object v1, p0, Lorg/apache/commons/compress/harmony/pack200/BandSet;->canonicalLargest:[J

    invoke-static {v0}, Lorg/apache/commons/compress/harmony/pack200/CodecEncoding;->getCanonicalCodec(I)Lorg/apache/commons/compress/harmony/pack200/BHSDCodec;

    move-result-object v2

    invoke-virtual {v2}, Lorg/apache/commons/compress/harmony/pack200/BHSDCodec;->largest()J

    move-result-wide v2

    aput-wide v2, v1, v0

    .line 214
    iget-object v1, p0, Lorg/apache/commons/compress/harmony/pack200/BandSet;->canonicalSmallest:[J

    invoke-static {v0}, Lorg/apache/commons/compress/harmony/pack200/CodecEncoding;->getCanonicalCodec(I)Lorg/apache/commons/compress/harmony/pack200/BHSDCodec;

    move-result-object v2

    invoke-virtual {v2}, Lorg/apache/commons/compress/harmony/pack200/BHSDCodec;->smallest()J

    move-result-wide v2

    aput-wide v2, v1, v0

    .line 212
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 217
    .end local v0    # "i":I
    :cond_0
    new-instance v5, Lorg/apache/commons/compress/harmony/pack200/BandSet$BandData;

    invoke-direct {v5, p0, p2}, Lorg/apache/commons/compress/harmony/pack200/BandSet$BandData;-><init>(Lorg/apache/commons/compress/harmony/pack200/BandSet;[I)V

    .line 220
    .local v5, "bandData":Lorg/apache/commons/compress/harmony/pack200/BandSet$BandData;
    invoke-virtual {p3, p2}, Lorg/apache/commons/compress/harmony/pack200/BHSDCodec;->encode([I)[B

    move-result-object v7

    .line 221
    .local v7, "encoded":[B
    invoke-static {v6, v7}, Lorg/apache/commons/compress/harmony/pack200/BandSet$BandAnalysisResults;->access$002(Lorg/apache/commons/compress/harmony/pack200/BandSet$BandAnalysisResults;[B)[B

    .line 224
    array-length v0, v7

    array-length v1, p2

    add-int/lit8 v1, v1, 0x17

    iget v2, p0, Lorg/apache/commons/compress/harmony/pack200/BandSet;->effort:I

    mul-int/lit8 v2, v2, 0x2

    sub-int/2addr v1, v2

    if-gt v0, v1, :cond_1

    .line 225
    return-object v6

    .line 229
    :cond_1
    invoke-virtual {v5}, Lorg/apache/commons/compress/harmony/pack200/BandSet$BandData;->anyNegatives()Z

    move-result v0

    if-nez v0, :cond_2

    invoke-static {v5}, Lorg/apache/commons/compress/harmony/pack200/BandSet$BandData;->access$100(Lorg/apache/commons/compress/harmony/pack200/BandSet$BandData;)I

    move-result v0

    int-to-long v0, v0

    sget-object v2, Lorg/apache/commons/compress/harmony/pack200/Codec;->BYTE1:Lorg/apache/commons/compress/harmony/pack200/BHSDCodec;

    invoke-virtual {v2}, Lorg/apache/commons/compress/harmony/pack200/BHSDCodec;->largest()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-gtz v0, :cond_2

    .line 230
    sget-object v0, Lorg/apache/commons/compress/harmony/pack200/Codec;->BYTE1:Lorg/apache/commons/compress/harmony/pack200/BHSDCodec;

    invoke-virtual {v0, p2}, Lorg/apache/commons/compress/harmony/pack200/BHSDCodec;->encode([I)[B

    move-result-object v0

    invoke-static {v6, v0}, Lorg/apache/commons/compress/harmony/pack200/BandSet$BandAnalysisResults;->access$002(Lorg/apache/commons/compress/harmony/pack200/BandSet$BandAnalysisResults;[B)[B

    .line 231
    sget-object v0, Lorg/apache/commons/compress/harmony/pack200/Codec;->BYTE1:Lorg/apache/commons/compress/harmony/pack200/BHSDCodec;

    invoke-static {v6, v0}, Lorg/apache/commons/compress/harmony/pack200/BandSet$BandAnalysisResults;->access$202(Lorg/apache/commons/compress/harmony/pack200/BandSet$BandAnalysisResults;Lorg/apache/commons/compress/harmony/pack200/Codec;)Lorg/apache/commons/compress/harmony/pack200/Codec;

    .line 232
    return-object v6

    .line 236
    :cond_2
    iget v0, p0, Lorg/apache/commons/compress/harmony/pack200/BandSet;->effort:I

    const/4 v1, 0x3

    if-le v0, v1, :cond_5

    const-string v0, "POPULATION"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    .line 237
    invoke-virtual {v5}, Lorg/apache/commons/compress/harmony/pack200/BandSet$BandData;->numDistinctValues()I

    move-result v0

    .line 238
    .local v0, "numDistinctValues":I
    int-to-float v1, v0

    array-length v2, p2

    int-to-float v2, v2

    div-float v8, v1, v2

    .line 241
    .local v8, "distinctValuesAsProportion":F
    const/16 v1, 0x64

    if-lt v0, v1, :cond_4

    float-to-double v1, v8

    const-wide v3, 0x3f947ae147ae147bL    # 0.02

    cmpg-double v1, v1, v3

    if-ltz v1, :cond_4

    iget v1, p0, Lorg/apache/commons/compress/harmony/pack200/BandSet;->effort:I

    const/4 v2, 0x6

    if-le v1, v2, :cond_3

    float-to-double v1, v8

    const-wide v3, 0x3fa47ae147ae147bL    # 0.04

    cmpg-double v1, v1, v3

    if-gez v1, :cond_3

    goto :goto_1

    :cond_3
    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    goto :goto_2

    .line 242
    :cond_4
    :goto_1
    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    .end local p1    # "name":Ljava/lang/String;
    .end local p2    # "band":[I
    .end local p3    # "defaultCodec":Lorg/apache/commons/compress/harmony/pack200/BHSDCodec;
    .local v2, "name":Ljava/lang/String;
    .local v3, "band":[I
    .local v4, "defaultCodec":Lorg/apache/commons/compress/harmony/pack200/BHSDCodec;
    invoke-direct/range {v1 .. v6}, Lorg/apache/commons/compress/harmony/pack200/BandSet;->encodeWithPopulationCodec(Ljava/lang/String;[ILorg/apache/commons/compress/harmony/pack200/BHSDCodec;Lorg/apache/commons/compress/harmony/pack200/BandSet$BandData;Lorg/apache/commons/compress/harmony/pack200/BandSet$BandAnalysisResults;)V

    .line 243
    invoke-direct {p0, v6}, Lorg/apache/commons/compress/harmony/pack200/BandSet;->timeToStop(Lorg/apache/commons/compress/harmony/pack200/BandSet$BandAnalysisResults;)Z

    move-result p1

    if-eqz p1, :cond_6

    .line 244
    return-object v6

    .line 236
    .end local v0    # "numDistinctValues":I
    .end local v2    # "name":Ljava/lang/String;
    .end local v3    # "band":[I
    .end local v4    # "defaultCodec":Lorg/apache/commons/compress/harmony/pack200/BHSDCodec;
    .end local v8    # "distinctValuesAsProportion":F
    .restart local p1    # "name":Ljava/lang/String;
    .restart local p2    # "band":[I
    .restart local p3    # "defaultCodec":Lorg/apache/commons/compress/harmony/pack200/BHSDCodec;
    :cond_5
    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    .line 249
    .end local p1    # "name":Ljava/lang/String;
    .end local p2    # "band":[I
    .end local p3    # "defaultCodec":Lorg/apache/commons/compress/harmony/pack200/BHSDCodec;
    .restart local v2    # "name":Ljava/lang/String;
    .restart local v3    # "band":[I
    .restart local v4    # "defaultCodec":Lorg/apache/commons/compress/harmony/pack200/BHSDCodec;
    :cond_6
    :goto_2
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 252
    .local p1, "codecFamiliesToTry":Ljava/util/List;, "Ljava/util/List<[Lorg/apache/commons/compress/harmony/pack200/BHSDCodec;>;"
    invoke-virtual {v5}, Lorg/apache/commons/compress/harmony/pack200/BandSet$BandData;->mainlyPositiveDeltas()Z

    move-result p2

    if-eqz p2, :cond_7

    invoke-virtual {v5}, Lorg/apache/commons/compress/harmony/pack200/BandSet$BandData;->mainlySmallDeltas()Z

    move-result p2

    if-eqz p2, :cond_7

    .line 253
    sget-object p2, Lorg/apache/commons/compress/harmony/pack200/CanonicalCodecFamilies;->deltaUnsignedCodecs2:[Lorg/apache/commons/compress/harmony/pack200/BHSDCodec;

    invoke-interface {p1, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 256
    :cond_7
    invoke-virtual {v5}, Lorg/apache/commons/compress/harmony/pack200/BandSet$BandData;->wellCorrelated()Z

    move-result p2

    if-eqz p2, :cond_9

    .line 257
    invoke-virtual {v5}, Lorg/apache/commons/compress/harmony/pack200/BandSet$BandData;->mainlyPositiveDeltas()Z

    move-result p2

    if-eqz p2, :cond_8

    .line 258
    sget-object p2, Lorg/apache/commons/compress/harmony/pack200/CanonicalCodecFamilies;->deltaUnsignedCodecs1:[Lorg/apache/commons/compress/harmony/pack200/BHSDCodec;

    invoke-interface {p1, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 259
    sget-object p2, Lorg/apache/commons/compress/harmony/pack200/CanonicalCodecFamilies;->deltaUnsignedCodecs3:[Lorg/apache/commons/compress/harmony/pack200/BHSDCodec;

    invoke-interface {p1, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 260
    sget-object p2, Lorg/apache/commons/compress/harmony/pack200/CanonicalCodecFamilies;->deltaUnsignedCodecs4:[Lorg/apache/commons/compress/harmony/pack200/BHSDCodec;

    invoke-interface {p1, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 261
    sget-object p2, Lorg/apache/commons/compress/harmony/pack200/CanonicalCodecFamilies;->deltaUnsignedCodecs5:[Lorg/apache/commons/compress/harmony/pack200/BHSDCodec;

    invoke-interface {p1, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 262
    sget-object p2, Lorg/apache/commons/compress/harmony/pack200/CanonicalCodecFamilies;->nonDeltaUnsignedCodecs1:[Lorg/apache/commons/compress/harmony/pack200/BHSDCodec;

    invoke-interface {p1, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 263
    sget-object p2, Lorg/apache/commons/compress/harmony/pack200/CanonicalCodecFamilies;->nonDeltaUnsignedCodecs3:[Lorg/apache/commons/compress/harmony/pack200/BHSDCodec;

    invoke-interface {p1, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 264
    sget-object p2, Lorg/apache/commons/compress/harmony/pack200/CanonicalCodecFamilies;->nonDeltaUnsignedCodecs4:[Lorg/apache/commons/compress/harmony/pack200/BHSDCodec;

    invoke-interface {p1, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 265
    sget-object p2, Lorg/apache/commons/compress/harmony/pack200/CanonicalCodecFamilies;->nonDeltaUnsignedCodecs5:[Lorg/apache/commons/compress/harmony/pack200/BHSDCodec;

    invoke-interface {p1, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 266
    sget-object p2, Lorg/apache/commons/compress/harmony/pack200/CanonicalCodecFamilies;->nonDeltaUnsignedCodecs2:[Lorg/apache/commons/compress/harmony/pack200/BHSDCodec;

    invoke-interface {p1, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_3

    .line 268
    :cond_8
    sget-object p2, Lorg/apache/commons/compress/harmony/pack200/CanonicalCodecFamilies;->deltaSignedCodecs1:[Lorg/apache/commons/compress/harmony/pack200/BHSDCodec;

    invoke-interface {p1, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 269
    sget-object p2, Lorg/apache/commons/compress/harmony/pack200/CanonicalCodecFamilies;->deltaSignedCodecs3:[Lorg/apache/commons/compress/harmony/pack200/BHSDCodec;

    invoke-interface {p1, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 270
    sget-object p2, Lorg/apache/commons/compress/harmony/pack200/CanonicalCodecFamilies;->deltaSignedCodecs2:[Lorg/apache/commons/compress/harmony/pack200/BHSDCodec;

    invoke-interface {p1, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 271
    sget-object p2, Lorg/apache/commons/compress/harmony/pack200/CanonicalCodecFamilies;->deltaSignedCodecs4:[Lorg/apache/commons/compress/harmony/pack200/BHSDCodec;

    invoke-interface {p1, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 272
    sget-object p2, Lorg/apache/commons/compress/harmony/pack200/CanonicalCodecFamilies;->deltaSignedCodecs5:[Lorg/apache/commons/compress/harmony/pack200/BHSDCodec;

    invoke-interface {p1, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 273
    sget-object p2, Lorg/apache/commons/compress/harmony/pack200/CanonicalCodecFamilies;->nonDeltaSignedCodecs1:[Lorg/apache/commons/compress/harmony/pack200/BHSDCodec;

    invoke-interface {p1, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 274
    sget-object p2, Lorg/apache/commons/compress/harmony/pack200/CanonicalCodecFamilies;->nonDeltaSignedCodecs2:[Lorg/apache/commons/compress/harmony/pack200/BHSDCodec;

    invoke-interface {p1, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_3

    .line 276
    :cond_9
    invoke-virtual {v5}, Lorg/apache/commons/compress/harmony/pack200/BandSet$BandData;->anyNegatives()Z

    move-result p2

    if-eqz p2, :cond_a

    .line 277
    sget-object p2, Lorg/apache/commons/compress/harmony/pack200/CanonicalCodecFamilies;->nonDeltaSignedCodecs1:[Lorg/apache/commons/compress/harmony/pack200/BHSDCodec;

    invoke-interface {p1, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 278
    sget-object p2, Lorg/apache/commons/compress/harmony/pack200/CanonicalCodecFamilies;->nonDeltaSignedCodecs2:[Lorg/apache/commons/compress/harmony/pack200/BHSDCodec;

    invoke-interface {p1, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 279
    sget-object p2, Lorg/apache/commons/compress/harmony/pack200/CanonicalCodecFamilies;->deltaSignedCodecs1:[Lorg/apache/commons/compress/harmony/pack200/BHSDCodec;

    invoke-interface {p1, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 280
    sget-object p2, Lorg/apache/commons/compress/harmony/pack200/CanonicalCodecFamilies;->deltaSignedCodecs2:[Lorg/apache/commons/compress/harmony/pack200/BHSDCodec;

    invoke-interface {p1, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 281
    sget-object p2, Lorg/apache/commons/compress/harmony/pack200/CanonicalCodecFamilies;->deltaSignedCodecs3:[Lorg/apache/commons/compress/harmony/pack200/BHSDCodec;

    invoke-interface {p1, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 282
    sget-object p2, Lorg/apache/commons/compress/harmony/pack200/CanonicalCodecFamilies;->deltaSignedCodecs4:[Lorg/apache/commons/compress/harmony/pack200/BHSDCodec;

    invoke-interface {p1, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 283
    sget-object p2, Lorg/apache/commons/compress/harmony/pack200/CanonicalCodecFamilies;->deltaSignedCodecs5:[Lorg/apache/commons/compress/harmony/pack200/BHSDCodec;

    invoke-interface {p1, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_3

    .line 285
    :cond_a
    sget-object p2, Lorg/apache/commons/compress/harmony/pack200/CanonicalCodecFamilies;->nonDeltaUnsignedCodecs1:[Lorg/apache/commons/compress/harmony/pack200/BHSDCodec;

    invoke-interface {p1, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 286
    sget-object p2, Lorg/apache/commons/compress/harmony/pack200/CanonicalCodecFamilies;->nonDeltaUnsignedCodecs3:[Lorg/apache/commons/compress/harmony/pack200/BHSDCodec;

    invoke-interface {p1, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 287
    sget-object p2, Lorg/apache/commons/compress/harmony/pack200/CanonicalCodecFamilies;->nonDeltaUnsignedCodecs4:[Lorg/apache/commons/compress/harmony/pack200/BHSDCodec;

    invoke-interface {p1, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 288
    sget-object p2, Lorg/apache/commons/compress/harmony/pack200/CanonicalCodecFamilies;->nonDeltaUnsignedCodecs5:[Lorg/apache/commons/compress/harmony/pack200/BHSDCodec;

    invoke-interface {p1, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 289
    sget-object p2, Lorg/apache/commons/compress/harmony/pack200/CanonicalCodecFamilies;->nonDeltaUnsignedCodecs2:[Lorg/apache/commons/compress/harmony/pack200/BHSDCodec;

    invoke-interface {p1, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 290
    sget-object p2, Lorg/apache/commons/compress/harmony/pack200/CanonicalCodecFamilies;->deltaUnsignedCodecs1:[Lorg/apache/commons/compress/harmony/pack200/BHSDCodec;

    invoke-interface {p1, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 291
    sget-object p2, Lorg/apache/commons/compress/harmony/pack200/CanonicalCodecFamilies;->deltaUnsignedCodecs3:[Lorg/apache/commons/compress/harmony/pack200/BHSDCodec;

    invoke-interface {p1, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 292
    sget-object p2, Lorg/apache/commons/compress/harmony/pack200/CanonicalCodecFamilies;->deltaUnsignedCodecs4:[Lorg/apache/commons/compress/harmony/pack200/BHSDCodec;

    invoke-interface {p1, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 293
    sget-object p2, Lorg/apache/commons/compress/harmony/pack200/CanonicalCodecFamilies;->deltaUnsignedCodecs5:[Lorg/apache/commons/compress/harmony/pack200/BHSDCodec;

    invoke-interface {p1, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 295
    :goto_3
    const-string p2, "cpint"

    invoke-virtual {v2, p2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_b

    .line 296
    sget-object p2, Ljava/lang/System;->out:Ljava/io/PrintStream;

    const-string p3, ""

    invoke-virtual {p2, p3}, Ljava/io/PrintStream;->print(Ljava/lang/String;)V

    .line 299
    :cond_b
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_4
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_d

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    move-object v8, p3

    check-cast v8, [Lorg/apache/commons/compress/harmony/pack200/BHSDCodec;

    .line 300
    .local v8, "family":[Lorg/apache/commons/compress/harmony/pack200/BHSDCodec;
    invoke-direct/range {v1 .. v8}, Lorg/apache/commons/compress/harmony/pack200/BandSet;->tryCodecs(Ljava/lang/String;[ILorg/apache/commons/compress/harmony/pack200/BHSDCodec;Lorg/apache/commons/compress/harmony/pack200/BandSet$BandData;Lorg/apache/commons/compress/harmony/pack200/BandSet$BandAnalysisResults;[B[Lorg/apache/commons/compress/harmony/pack200/BHSDCodec;)V

    .line 301
    invoke-direct {p0, v6}, Lorg/apache/commons/compress/harmony/pack200/BandSet;->timeToStop(Lorg/apache/commons/compress/harmony/pack200/BandSet$BandAnalysisResults;)Z

    move-result p3

    if-eqz p3, :cond_c

    .line 302
    goto :goto_5

    .line 304
    .end local v8    # "family":[Lorg/apache/commons/compress/harmony/pack200/BHSDCodec;
    :cond_c
    goto :goto_4

    .line 306
    :cond_d
    :goto_5
    return-object v6
.end method

.method private encodeWithPopulationCodec(Ljava/lang/String;[ILorg/apache/commons/compress/harmony/pack200/BHSDCodec;Lorg/apache/commons/compress/harmony/pack200/BandSet$BandData;Lorg/apache/commons/compress/harmony/pack200/BandSet$BandAnalysisResults;)V
    .locals 30
    .param p1, "name"    # Ljava/lang/String;
    .param p2, "band"    # [I
    .param p3, "defaultCodec"    # Lorg/apache/commons/compress/harmony/pack200/BHSDCodec;
    .param p4, "bandData"    # Lorg/apache/commons/compress/harmony/pack200/BandSet$BandData;
    .param p5, "results"    # Lorg/apache/commons/compress/harmony/pack200/BandSet$BandAnalysisResults;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/commons/compress/harmony/pack200/Pack200Exception;
        }
    .end annotation

    .line 513
    move-object/from16 v0, p0

    move-object/from16 v1, p2

    move-object/from16 v2, p3

    move-object/from16 v3, p5

    const/4 v4, 0x3

    invoke-static {v3, v4}, Lorg/apache/commons/compress/harmony/pack200/BandSet$BandAnalysisResults;->access$412(Lorg/apache/commons/compress/harmony/pack200/BandSet$BandAnalysisResults;I)I

    .line 514
    invoke-static/range {p4 .. p4}, Lorg/apache/commons/compress/harmony/pack200/BandSet$BandData;->access$500(Lorg/apache/commons/compress/harmony/pack200/BandSet$BandData;)Ljava/util/Map;

    move-result-object v5

    .line 516
    .local v5, "distinctValues":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/Integer;Ljava/lang/Integer;>;"
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 517
    .local v6, "favored":Ljava/util/List;, "Ljava/util/List<Ljava/lang/Integer;>;"
    new-instance v7, Lorg/apache/commons/compress/harmony/pack200/BandSet$$ExternalSyntheticLambda0;

    invoke-direct {v7, v5, v6}, Lorg/apache/commons/compress/harmony/pack200/BandSet$$ExternalSyntheticLambda0;-><init>(Ljava/util/Map;Ljava/util/List;)V

    invoke-interface {v5, v7}, Ljava/util/Map;->forEach(Ljava/util/function/BiConsumer;)V

    .line 524
    invoke-interface {v5}, Ljava/util/Map;->size()I

    move-result v7

    const/16 v8, 0xff

    if-le v7, v8, :cond_0

    .line 525
    new-instance v7, Lorg/apache/commons/compress/harmony/pack200/BandSet$$ExternalSyntheticLambda1;

    invoke-direct {v7, v5}, Lorg/apache/commons/compress/harmony/pack200/BandSet$$ExternalSyntheticLambda1;-><init>(Ljava/util/Map;)V

    invoke-interface {v6, v7}, Ljava/util/List;->sort(Ljava/util/Comparator;)V

    .line 528
    :cond_0
    new-instance v7, Ljava/util/HashMap;

    invoke-direct {v7}, Ljava/util/HashMap;-><init>()V

    .line 529
    .local v7, "favoredToIndex":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/Integer;Ljava/lang/Integer;>;"
    const/4 v8, 0x0

    .local v8, "i":I
    :goto_0
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v9

    if-ge v8, v9, :cond_1

    .line 530
    invoke-interface {v6, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/Integer;

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-interface {v7, v9, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 529
    add-int/lit8 v8, v8, 0x1

    goto :goto_0

    .line 533
    .end local v8    # "i":I
    :cond_1
    new-instance v8, Lorg/apache/commons/compress/harmony/pack200/IntList;

    invoke-direct {v8}, Lorg/apache/commons/compress/harmony/pack200/IntList;-><init>()V

    .line 534
    .local v8, "unfavoured":Lorg/apache/commons/compress/harmony/pack200/IntList;
    array-length v9, v1

    new-array v9, v9, [I

    .line 535
    .local v9, "tokens":[I
    const/4 v10, 0x0

    .local v10, "i":I
    :goto_1
    array-length v11, v1

    const/4 v12, 0x0

    const/4 v13, 0x1

    if-ge v10, v11, :cond_3

    .line 536
    aget v11, v1, v10

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-interface {v7, v11}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/Integer;

    .line 537
    .local v11, "favouredIndex":Ljava/lang/Integer;
    if-nez v11, :cond_2

    .line 538
    aput v12, v9, v10

    .line 539
    aget v12, v1, v10

    invoke-virtual {v8, v12}, Lorg/apache/commons/compress/harmony/pack200/IntList;->add(I)Z

    goto :goto_2

    .line 541
    :cond_2
    invoke-virtual {v11}, Ljava/lang/Integer;->intValue()I

    move-result v12

    add-int/2addr v12, v13

    aput v12, v9, v10

    .line 535
    .end local v11    # "favouredIndex":Ljava/lang/Integer;
    :goto_2
    add-int/lit8 v10, v10, 0x1

    goto :goto_1

    .line 544
    .end local v10    # "i":I
    :cond_3
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v10

    sub-int/2addr v10, v13

    invoke-interface {v6, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/Integer;

    invoke-interface {v6, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 545
    invoke-virtual {v0, v6}, Lorg/apache/commons/compress/harmony/pack200/BandSet;->integerListToArray(Ljava/util/List;)[I

    move-result-object v10

    .line 546
    .local v10, "favouredBand":[I
    invoke-virtual {v8}, Lorg/apache/commons/compress/harmony/pack200/IntList;->toArray()[I

    move-result-object v11

    .line 549
    .local v11, "unfavouredBand":[I
    const-string v14, "POPULATION"

    invoke-direct {v0, v14, v10, v2}, Lorg/apache/commons/compress/harmony/pack200/BandSet;->analyseBand(Ljava/lang/String;[ILorg/apache/commons/compress/harmony/pack200/BHSDCodec;)Lorg/apache/commons/compress/harmony/pack200/BandSet$BandAnalysisResults;

    move-result-object v15

    .line 550
    .local v15, "favouredResults":Lorg/apache/commons/compress/harmony/pack200/BandSet$BandAnalysisResults;
    invoke-direct {v0, v14, v11, v2}, Lorg/apache/commons/compress/harmony/pack200/BandSet;->analyseBand(Ljava/lang/String;[ILorg/apache/commons/compress/harmony/pack200/BHSDCodec;)Lorg/apache/commons/compress/harmony/pack200/BandSet$BandAnalysisResults;

    move-result-object v16

    .line 552
    .local v16, "unfavouredResults":Lorg/apache/commons/compress/harmony/pack200/BandSet$BandAnalysisResults;
    const/16 v17, 0x0

    .line 553
    .local v17, "tdefL":I
    const/16 v18, 0x0

    .line 554
    .local v18, "l":I
    const/16 v19, 0x0

    .line 556
    .local v19, "tokenCodec":Lorg/apache/commons/compress/harmony/pack200/Codec;
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v20

    add-int/lit8 v12, v20, -0x1

    .line 557
    .local v12, "k":I
    const/16 v4, 0x100

    if-ge v12, v4, :cond_4

    .line 558
    const/16 v17, 0x1

    .line 559
    sget-object v4, Lorg/apache/commons/compress/harmony/pack200/Codec;->BYTE1:Lorg/apache/commons/compress/harmony/pack200/BHSDCodec;

    invoke-virtual {v4, v9}, Lorg/apache/commons/compress/harmony/pack200/BHSDCodec;->encode([I)[B

    move-result-object v4

    move/from16 v0, v18

    move-object/from16 v14, v19

    .local v4, "tokensEncoded":[B
    goto/16 :goto_5

    .line 561
    .end local v4    # "tokensEncoded":[B
    :cond_4
    invoke-direct {v0, v14, v9, v2}, Lorg/apache/commons/compress/harmony/pack200/BandSet;->analyseBand(Ljava/lang/String;[ILorg/apache/commons/compress/harmony/pack200/BHSDCodec;)Lorg/apache/commons/compress/harmony/pack200/BandSet$BandAnalysisResults;

    move-result-object v4

    .line 562
    .local v4, "tokenResults":Lorg/apache/commons/compress/harmony/pack200/BandSet$BandAnalysisResults;
    invoke-static {v4}, Lorg/apache/commons/compress/harmony/pack200/BandSet$BandAnalysisResults;->access$200(Lorg/apache/commons/compress/harmony/pack200/BandSet$BandAnalysisResults;)Lorg/apache/commons/compress/harmony/pack200/Codec;

    move-result-object v14

    .line 563
    .end local v19    # "tokenCodec":Lorg/apache/commons/compress/harmony/pack200/Codec;
    .local v14, "tokenCodec":Lorg/apache/commons/compress/harmony/pack200/Codec;
    invoke-static {v4}, Lorg/apache/commons/compress/harmony/pack200/BandSet$BandAnalysisResults;->access$000(Lorg/apache/commons/compress/harmony/pack200/BandSet$BandAnalysisResults;)[B

    move-result-object v19

    .line 564
    .local v19, "tokensEncoded":[B
    if-nez v14, :cond_5

    .line 565
    move-object/from16 v14, p3

    .line 567
    :cond_5
    move-object/from16 v22, v14

    check-cast v22, Lorg/apache/commons/compress/harmony/pack200/BHSDCodec;

    invoke-virtual/range {v22 .. v22}, Lorg/apache/commons/compress/harmony/pack200/BHSDCodec;->getL()I

    move-result v18

    .line 568
    move-object/from16 v22, v14

    check-cast v22, Lorg/apache/commons/compress/harmony/pack200/BHSDCodec;

    invoke-virtual/range {v22 .. v22}, Lorg/apache/commons/compress/harmony/pack200/BHSDCodec;->getH()I

    move-result v13

    .line 569
    .local v13, "h":I
    move-object/from16 v22, v14

    check-cast v22, Lorg/apache/commons/compress/harmony/pack200/BHSDCodec;

    invoke-virtual/range {v22 .. v22}, Lorg/apache/commons/compress/harmony/pack200/BHSDCodec;->getS()I

    move-result v22

    .line 570
    .local v22, "s":I
    move-object/from16 v24, v14

    check-cast v24, Lorg/apache/commons/compress/harmony/pack200/BHSDCodec;

    invoke-virtual/range {v24 .. v24}, Lorg/apache/commons/compress/harmony/pack200/BHSDCodec;->getB()I

    move-result v0

    .line 571
    .local v0, "b":I
    move-object/from16 v24, v14

    check-cast v24, Lorg/apache/commons/compress/harmony/pack200/BHSDCodec;

    invoke-virtual/range {v24 .. v24}, Lorg/apache/commons/compress/harmony/pack200/BHSDCodec;->isDelta()Z

    move-result v24

    .line 572
    .local v24, "d":I
    if-nez v22, :cond_8

    if-nez v24, :cond_8

    .line 573
    const/16 v25, 0x1

    .line 574
    .local v25, "canUseTDefL":Z
    const/4 v1, 0x1

    if-le v0, v1, :cond_6

    .line 575
    new-instance v1, Lorg/apache/commons/compress/harmony/pack200/BHSDCodec;

    move/from16 v26, v0

    .end local v0    # "b":I
    .local v26, "b":I
    add-int/lit8 v0, v26, -0x1

    invoke-direct {v1, v0, v13}, Lorg/apache/commons/compress/harmony/pack200/BHSDCodec;-><init>(II)V

    .line 576
    .local v1, "oneLowerB":Lorg/apache/commons/compress/harmony/pack200/BHSDCodec;
    invoke-virtual {v1}, Lorg/apache/commons/compress/harmony/pack200/BHSDCodec;->largest()J

    move-result-wide v27

    move-object/from16 v29, v1

    .end local v1    # "oneLowerB":Lorg/apache/commons/compress/harmony/pack200/BHSDCodec;
    .local v29, "oneLowerB":Lorg/apache/commons/compress/harmony/pack200/BHSDCodec;
    int-to-long v0, v12

    cmp-long v0, v27, v0

    if-ltz v0, :cond_7

    .line 577
    const/16 v25, 0x0

    goto :goto_3

    .line 574
    .end local v26    # "b":I
    .end local v29    # "oneLowerB":Lorg/apache/commons/compress/harmony/pack200/BHSDCodec;
    .restart local v0    # "b":I
    :cond_6
    move/from16 v26, v0

    .line 580
    .end local v0    # "b":I
    .restart local v26    # "b":I
    :cond_7
    :goto_3
    if-eqz v25, :cond_9

    .line 581
    sparse-switch v18, :sswitch_data_0

    goto :goto_4

    .line 613
    :sswitch_0
    const/16 v17, 0xb

    move/from16 v0, v18

    move-object/from16 v4, v19

    goto :goto_5

    .line 610
    :sswitch_1
    const/16 v17, 0xa

    .line 611
    move/from16 v0, v18

    move-object/from16 v4, v19

    goto :goto_5

    .line 607
    :sswitch_2
    const/16 v17, 0x9

    .line 608
    move/from16 v0, v18

    move-object/from16 v4, v19

    goto :goto_5

    .line 604
    :sswitch_3
    const/16 v17, 0x8

    .line 605
    move/from16 v0, v18

    move-object/from16 v4, v19

    goto :goto_5

    .line 601
    :sswitch_4
    const/16 v17, 0x7

    .line 602
    move/from16 v0, v18

    move-object/from16 v4, v19

    goto :goto_5

    .line 598
    :sswitch_5
    const/16 v17, 0x6

    .line 599
    move/from16 v0, v18

    move-object/from16 v4, v19

    goto :goto_5

    .line 595
    :sswitch_6
    const/16 v17, 0x5

    .line 596
    move/from16 v0, v18

    move-object/from16 v4, v19

    goto :goto_5

    .line 592
    :sswitch_7
    const/16 v17, 0x4

    .line 593
    move/from16 v0, v18

    move-object/from16 v4, v19

    goto :goto_5

    .line 589
    :sswitch_8
    const/16 v17, 0x3

    .line 590
    move/from16 v0, v18

    move-object/from16 v4, v19

    goto :goto_5

    .line 586
    :sswitch_9
    const/16 v17, 0x2

    .line 587
    move/from16 v0, v18

    move-object/from16 v4, v19

    goto :goto_5

    .line 583
    :sswitch_a
    const/16 v17, 0x1

    .line 584
    move/from16 v0, v18

    move-object/from16 v4, v19

    goto :goto_5

    .line 572
    .end local v25    # "canUseTDefL":Z
    .end local v26    # "b":I
    .restart local v0    # "b":I
    :cond_8
    move/from16 v26, v0

    .line 620
    .end local v0    # "b":I
    .end local v4    # "tokenResults":Lorg/apache/commons/compress/harmony/pack200/BandSet$BandAnalysisResults;
    .end local v13    # "h":I
    .end local v22    # "s":I
    .end local v24    # "d":I
    :cond_9
    :goto_4
    move/from16 v0, v18

    move-object/from16 v4, v19

    .end local v18    # "l":I
    .end local v19    # "tokensEncoded":[B
    .local v0, "l":I
    .local v4, "tokensEncoded":[B
    :goto_5
    invoke-static {v15}, Lorg/apache/commons/compress/harmony/pack200/BandSet$BandAnalysisResults;->access$000(Lorg/apache/commons/compress/harmony/pack200/BandSet$BandAnalysisResults;)[B

    move-result-object v1

    .line 621
    .local v1, "favouredEncoded":[B
    invoke-static/range {v16 .. v16}, Lorg/apache/commons/compress/harmony/pack200/BandSet$BandAnalysisResults;->access$000(Lorg/apache/commons/compress/harmony/pack200/BandSet$BandAnalysisResults;)[B

    move-result-object v13

    .line 622
    .local v13, "unfavouredEncoded":[B
    move-object/from16 v18, v5

    .end local v5    # "distinctValues":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/Integer;Ljava/lang/Integer;>;"
    .local v18, "distinctValues":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/Integer;Ljava/lang/Integer;>;"
    invoke-static {v15}, Lorg/apache/commons/compress/harmony/pack200/BandSet$BandAnalysisResults;->access$200(Lorg/apache/commons/compress/harmony/pack200/BandSet$BandAnalysisResults;)Lorg/apache/commons/compress/harmony/pack200/Codec;

    move-result-object v5

    .line 623
    .local v5, "favouredCodec":Lorg/apache/commons/compress/harmony/pack200/Codec;
    move-object/from16 v19, v6

    .end local v6    # "favored":Ljava/util/List;, "Ljava/util/List<Ljava/lang/Integer;>;"
    .local v19, "favored":Ljava/util/List;, "Ljava/util/List<Ljava/lang/Integer;>;"
    invoke-static/range {v16 .. v16}, Lorg/apache/commons/compress/harmony/pack200/BandSet$BandAnalysisResults;->access$200(Lorg/apache/commons/compress/harmony/pack200/BandSet$BandAnalysisResults;)Lorg/apache/commons/compress/harmony/pack200/Codec;

    move-result-object v6

    .line 625
    .local v6, "unfavouredCodec":Lorg/apache/commons/compress/harmony/pack200/Codec;
    move-object/from16 v22, v7

    if-nez v5, :cond_a

    const/4 v7, 0x1

    goto :goto_6

    :cond_a
    const/4 v7, 0x0

    .end local v7    # "favoredToIndex":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/Integer;Ljava/lang/Integer;>;"
    .local v22, "favoredToIndex":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/Integer;Ljava/lang/Integer;>;"
    :goto_6
    add-int/lit16 v7, v7, 0x8d

    mul-int/lit8 v23, v17, 0x4

    add-int v7, v7, v23

    if-nez v6, :cond_b

    const/16 v23, 0x2

    goto :goto_7

    :cond_b
    const/16 v23, 0x0

    :goto_7
    add-int v7, v7, v23

    .line 626
    .local v7, "specifier":I
    move/from16 v23, v7

    .end local v7    # "specifier":I
    .local v23, "specifier":I
    new-instance v7, Lorg/apache/commons/compress/harmony/pack200/IntList;

    move-object/from16 v24, v8

    const/4 v8, 0x3

    .end local v8    # "unfavoured":Lorg/apache/commons/compress/harmony/pack200/IntList;
    .local v24, "unfavoured":Lorg/apache/commons/compress/harmony/pack200/IntList;
    invoke-direct {v7, v8}, Lorg/apache/commons/compress/harmony/pack200/IntList;-><init>(I)V

    .line 627
    .local v7, "extraBandMetadata":Lorg/apache/commons/compress/harmony/pack200/IntList;
    const/4 v8, 0x0

    if-eqz v5, :cond_c

    .line 628
    invoke-static {v5, v8}, Lorg/apache/commons/compress/harmony/pack200/CodecEncoding;->getSpecifier(Lorg/apache/commons/compress/harmony/pack200/Codec;Lorg/apache/commons/compress/harmony/pack200/Codec;)[I

    move-result-object v20

    invoke-static/range {v20 .. v20}, Ljava/util/stream/IntStream;->of([I)Ljava/util/stream/IntStream;

    move-result-object v8

    invoke-static {v7}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v20, v9

    .end local v9    # "tokens":[I
    .local v20, "tokens":[I
    new-instance v9, Lorg/apache/commons/compress/harmony/pack200/BandSet$$ExternalSyntheticLambda2;

    invoke-direct {v9, v7}, Lorg/apache/commons/compress/harmony/pack200/BandSet$$ExternalSyntheticLambda2;-><init>(Lorg/apache/commons/compress/harmony/pack200/IntList;)V

    invoke-interface {v8, v9}, Ljava/util/stream/IntStream;->forEach(Ljava/util/function/IntConsumer;)V

    goto :goto_8

    .line 627
    .end local v20    # "tokens":[I
    .restart local v9    # "tokens":[I
    :cond_c
    move-object/from16 v20, v9

    .line 630
    .end local v9    # "tokens":[I
    .restart local v20    # "tokens":[I
    :goto_8
    if-nez v17, :cond_d

    .line 631
    const/4 v8, 0x0

    invoke-static {v14, v8}, Lorg/apache/commons/compress/harmony/pack200/CodecEncoding;->getSpecifier(Lorg/apache/commons/compress/harmony/pack200/Codec;Lorg/apache/commons/compress/harmony/pack200/Codec;)[I

    move-result-object v9

    invoke-static {v9}, Ljava/util/stream/IntStream;->of([I)Ljava/util/stream/IntStream;

    move-result-object v8

    invoke-static {v7}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v9, Lorg/apache/commons/compress/harmony/pack200/BandSet$$ExternalSyntheticLambda2;

    invoke-direct {v9, v7}, Lorg/apache/commons/compress/harmony/pack200/BandSet$$ExternalSyntheticLambda2;-><init>(Lorg/apache/commons/compress/harmony/pack200/IntList;)V

    invoke-interface {v8, v9}, Ljava/util/stream/IntStream;->forEach(Ljava/util/function/IntConsumer;)V

    .line 633
    :cond_d
    if-eqz v6, :cond_e

    .line 634
    const/4 v8, 0x0

    invoke-static {v6, v8}, Lorg/apache/commons/compress/harmony/pack200/CodecEncoding;->getSpecifier(Lorg/apache/commons/compress/harmony/pack200/Codec;Lorg/apache/commons/compress/harmony/pack200/Codec;)[I

    move-result-object v8

    invoke-static {v8}, Ljava/util/stream/IntStream;->of([I)Ljava/util/stream/IntStream;

    move-result-object v8

    invoke-static {v7}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v9, Lorg/apache/commons/compress/harmony/pack200/BandSet$$ExternalSyntheticLambda2;

    invoke-direct {v9, v7}, Lorg/apache/commons/compress/harmony/pack200/BandSet$$ExternalSyntheticLambda2;-><init>(Lorg/apache/commons/compress/harmony/pack200/IntList;)V

    invoke-interface {v8, v9}, Ljava/util/stream/IntStream;->forEach(Ljava/util/function/IntConsumer;)V

    .line 636
    :cond_e
    invoke-virtual {v7}, Lorg/apache/commons/compress/harmony/pack200/IntList;->toArray()[I

    move-result-object v8

    .line 637
    .local v8, "extraMetadata":[I
    sget-object v9, Lorg/apache/commons/compress/harmony/pack200/Codec;->UNSIGNED5:Lorg/apache/commons/compress/harmony/pack200/BHSDCodec;

    invoke-virtual {v9, v8}, Lorg/apache/commons/compress/harmony/pack200/BHSDCodec;->encode([I)[B

    move-result-object v9

    .line 638
    .local v9, "extraMetadataEncoded":[B
    invoke-virtual {v2}, Lorg/apache/commons/compress/harmony/pack200/BHSDCodec;->isSigned()Z

    move-result v25

    if-eqz v25, :cond_f

    .line 639
    rsub-int/lit8 v23, v23, -0x1

    goto :goto_9

    .line 641
    :cond_f
    invoke-virtual {v2}, Lorg/apache/commons/compress/harmony/pack200/BHSDCodec;->getL()I

    move-result v25

    add-int v23, v23, v25

    .line 643
    :goto_9
    move-object/from16 v25, v7

    .end local v7    # "extraBandMetadata":Lorg/apache/commons/compress/harmony/pack200/IntList;
    .local v25, "extraBandMetadata":Lorg/apache/commons/compress/harmony/pack200/IntList;
    filled-new-array/range {v23 .. v23}, [I

    move-result-object v7

    invoke-virtual {v2, v7}, Lorg/apache/commons/compress/harmony/pack200/BHSDCodec;->encode([I)[B

    move-result-object v7

    .line 644
    .local v7, "firstValueEncoded":[B
    array-length v2, v7

    move/from16 v26, v2

    array-length v2, v1

    add-int v2, v26, v2

    move/from16 v26, v2

    array-length v2, v4

    add-int v2, v26, v2

    move/from16 v26, v2

    array-length v2, v13

    add-int v2, v26, v2

    .line 646
    .local v2, "totalBandLength":I
    move-object/from16 v26, v10

    .end local v10    # "favouredBand":[I
    .local v26, "favouredBand":[I
    array-length v10, v9

    add-int/2addr v10, v2

    move-object/from16 v27, v11

    .end local v11    # "unfavouredBand":[I
    .local v27, "unfavouredBand":[I
    invoke-static {v3}, Lorg/apache/commons/compress/harmony/pack200/BandSet$BandAnalysisResults;->access$000(Lorg/apache/commons/compress/harmony/pack200/BandSet$BandAnalysisResults;)[B

    move-result-object v11

    array-length v11, v11

    if-ge v10, v11, :cond_11

    .line 647
    invoke-static {v3}, Lorg/apache/commons/compress/harmony/pack200/BandSet$BandAnalysisResults;->access$000(Lorg/apache/commons/compress/harmony/pack200/BandSet$BandAnalysisResults;)[B

    move-result-object v10

    array-length v10, v10

    array-length v11, v9

    add-int/2addr v11, v2

    sub-int/2addr v10, v11

    invoke-static {v3, v10}, Lorg/apache/commons/compress/harmony/pack200/BandSet$BandAnalysisResults;->access$612(Lorg/apache/commons/compress/harmony/pack200/BandSet$BandAnalysisResults;I)I

    .line 648
    new-array v10, v2, [B

    .line 649
    .local v10, "encodedBand":[B
    array-length v11, v7

    move/from16 v28, v2

    const/4 v2, 0x0

    .end local v2    # "totalBandLength":I
    .local v28, "totalBandLength":I
    invoke-static {v7, v2, v10, v2, v11}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 650
    array-length v11, v7

    move-object/from16 v21, v9

    .end local v9    # "extraMetadataEncoded":[B
    .local v21, "extraMetadataEncoded":[B
    array-length v9, v1

    invoke-static {v1, v2, v10, v11, v9}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 651
    array-length v9, v7

    array-length v11, v1

    add-int/2addr v9, v11

    array-length v11, v4

    invoke-static {v4, v2, v10, v9, v11}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 652
    array-length v9, v7

    array-length v11, v1

    add-int/2addr v9, v11

    array-length v11, v4

    add-int/2addr v9, v11

    array-length v11, v13

    invoke-static {v13, v2, v10, v9, v11}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 654
    invoke-static {v3, v10}, Lorg/apache/commons/compress/harmony/pack200/BandSet$BandAnalysisResults;->access$002(Lorg/apache/commons/compress/harmony/pack200/BandSet$BandAnalysisResults;[B)[B

    .line 655
    invoke-static {v3, v8}, Lorg/apache/commons/compress/harmony/pack200/BandSet$BandAnalysisResults;->access$302(Lorg/apache/commons/compress/harmony/pack200/BandSet$BandAnalysisResults;[I)[I

    .line 656
    if-eqz v0, :cond_10

    .line 657
    new-instance v2, Lorg/apache/commons/compress/harmony/pack200/PopulationCodec;

    invoke-direct {v2, v5, v0, v6}, Lorg/apache/commons/compress/harmony/pack200/PopulationCodec;-><init>(Lorg/apache/commons/compress/harmony/pack200/Codec;ILorg/apache/commons/compress/harmony/pack200/Codec;)V

    invoke-static {v3, v2}, Lorg/apache/commons/compress/harmony/pack200/BandSet$BandAnalysisResults;->access$202(Lorg/apache/commons/compress/harmony/pack200/BandSet$BandAnalysisResults;Lorg/apache/commons/compress/harmony/pack200/Codec;)Lorg/apache/commons/compress/harmony/pack200/Codec;

    goto :goto_a

    .line 659
    :cond_10
    new-instance v2, Lorg/apache/commons/compress/harmony/pack200/PopulationCodec;

    invoke-direct {v2, v5, v14, v6}, Lorg/apache/commons/compress/harmony/pack200/PopulationCodec;-><init>(Lorg/apache/commons/compress/harmony/pack200/Codec;Lorg/apache/commons/compress/harmony/pack200/Codec;Lorg/apache/commons/compress/harmony/pack200/Codec;)V

    invoke-static {v3, v2}, Lorg/apache/commons/compress/harmony/pack200/BandSet$BandAnalysisResults;->access$202(Lorg/apache/commons/compress/harmony/pack200/BandSet$BandAnalysisResults;Lorg/apache/commons/compress/harmony/pack200/Codec;)Lorg/apache/commons/compress/harmony/pack200/Codec;

    goto :goto_a

    .line 646
    .end local v10    # "encodedBand":[B
    .end local v21    # "extraMetadataEncoded":[B
    .end local v28    # "totalBandLength":I
    .restart local v2    # "totalBandLength":I
    .restart local v9    # "extraMetadataEncoded":[B
    :cond_11
    move/from16 v28, v2

    move-object/from16 v21, v9

    .line 662
    .end local v2    # "totalBandLength":I
    .end local v9    # "extraMetadataEncoded":[B
    .restart local v21    # "extraMetadataEncoded":[B
    .restart local v28    # "totalBandLength":I
    :goto_a
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x4 -> :sswitch_a
        0x8 -> :sswitch_9
        0x10 -> :sswitch_8
        0x20 -> :sswitch_7
        0x40 -> :sswitch_6
        0x80 -> :sswitch_5
        0xc0 -> :sswitch_4
        0xe0 -> :sswitch_3
        0xf0 -> :sswitch_2
        0xf8 -> :sswitch_1
        0xfc -> :sswitch_0
    .end sparse-switch
.end method

.method private flatten([[J)[J
    .locals 11
    .param p1, "flags"    # [[J

    .line 668
    const/4 v0, 0x0

    .line 669
    .local v0, "totalSize":I
    array-length v1, p1

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_0

    aget-object v4, p1, v3

    .line 670
    .local v4, "flag":[J
    array-length v5, v4

    add-int/2addr v0, v5

    .line 669
    .end local v4    # "flag":[J
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 672
    :cond_0
    new-array v1, v0, [J

    .line 673
    .local v1, "flatArray":[J
    const/4 v3, 0x0

    .line 674
    .local v3, "index":I
    array-length v4, p1

    move v5, v2

    :goto_1
    if-ge v5, v4, :cond_2

    aget-object v6, p1, v5

    .line 675
    .local v6, "flag":[J
    array-length v7, v6

    move v8, v2

    :goto_2
    if-ge v8, v7, :cond_1

    aget-wide v9, v6, v8

    .line 676
    .local v9, "element":J
    aput-wide v9, v1, v3

    .line 677
    nop

    .end local v9    # "element":J
    add-int/lit8 v3, v3, 0x1

    .line 675
    add-int/lit8 v8, v8, 0x1

    goto :goto_2

    .line 674
    .end local v6    # "flag":[J
    :cond_1
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    .line 680
    :cond_2
    return-object v1
.end method

.method static synthetic lambda$encodeFlags$0([JI)I
    .locals 2
    .param p0, "flags"    # [J
    .param p1, "i"    # I

    .line 437
    aget-wide v0, p0, p1

    long-to-int v0, v0

    return v0
.end method

.method static synthetic lambda$encodeWithPopulationCodec$1(Ljava/util/Map;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;)V
    .locals 2
    .param p0, "distinctValues"    # Ljava/util/Map;
    .param p1, "favored"    # Ljava/util/List;
    .param p2, "k"    # Ljava/lang/Integer;
    .param p3, "v"    # Ljava/lang/Integer;

    .line 518
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/4 v1, 0x2

    if-gt v0, v1, :cond_0

    invoke-interface {p0}, Ljava/util/Map;->size()I

    move-result v0

    const/16 v1, 0x100

    if-ge v0, v1, :cond_1

    .line 519
    :cond_0
    invoke-interface {p1, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 521
    :cond_1
    return-void
.end method

.method static synthetic lambda$encodeWithPopulationCodec$2(Ljava/util/Map;Ljava/lang/Integer;Ljava/lang/Integer;)I
    .locals 2
    .param p0, "distinctValues"    # Ljava/util/Map;
    .param p1, "arg0"    # Ljava/lang/Integer;
    .param p2, "arg1"    # Ljava/lang/Integer;

    .line 525
    invoke-interface {p0, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-interface {p0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Ljava/lang/Integer;->compareTo(Ljava/lang/Integer;)I

    move-result v0

    return v0
.end method

.method private timeToStop(Lorg/apache/commons/compress/harmony/pack200/BandSet$BandAnalysisResults;)Z
    .locals 4
    .param p1, "results"    # Lorg/apache/commons/compress/harmony/pack200/BandSet$BandAnalysisResults;

    .line 715
    iget v0, p0, Lorg/apache/commons/compress/harmony/pack200/BandSet;->effort:I

    const/4 v1, 0x6

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-le v0, v1, :cond_1

    .line 716
    invoke-static {p1}, Lorg/apache/commons/compress/harmony/pack200/BandSet$BandAnalysisResults;->access$400(Lorg/apache/commons/compress/harmony/pack200/BandSet$BandAnalysisResults;)I

    move-result v0

    iget v1, p0, Lorg/apache/commons/compress/harmony/pack200/BandSet;->effort:I

    mul-int/lit8 v1, v1, 0x2

    if-lt v0, v1, :cond_0

    goto :goto_0

    :cond_0
    move v2, v3

    :goto_0
    return v2

    .line 718
    :cond_1
    invoke-static {p1}, Lorg/apache/commons/compress/harmony/pack200/BandSet$BandAnalysisResults;->access$400(Lorg/apache/commons/compress/harmony/pack200/BandSet$BandAnalysisResults;)I

    move-result v0

    iget v1, p0, Lorg/apache/commons/compress/harmony/pack200/BandSet;->effort:I

    if-lt v0, v1, :cond_2

    goto :goto_1

    :cond_2
    move v2, v3

    :goto_1
    return v2
.end method

.method private tryCodecs(Ljava/lang/String;[ILorg/apache/commons/compress/harmony/pack200/BHSDCodec;Lorg/apache/commons/compress/harmony/pack200/BandSet$BandData;Lorg/apache/commons/compress/harmony/pack200/BandSet$BandAnalysisResults;[B[Lorg/apache/commons/compress/harmony/pack200/BHSDCodec;)V
    .locals 14
    .param p1, "name"    # Ljava/lang/String;
    .param p2, "band"    # [I
    .param p3, "defaultCodec"    # Lorg/apache/commons/compress/harmony/pack200/BHSDCodec;
    .param p4, "bandData"    # Lorg/apache/commons/compress/harmony/pack200/BandSet$BandData;
    .param p5, "results"    # Lorg/apache/commons/compress/harmony/pack200/BandSet$BandAnalysisResults;
    .param p6, "encoded"    # [B
    .param p7, "potentialCodecs"    # [Lorg/apache/commons/compress/harmony/pack200/BHSDCodec;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/commons/compress/harmony/pack200/Pack200Exception;
        }
    .end annotation

    .line 725
    move-object/from16 v0, p2

    move-object/from16 v1, p3

    move-object/from16 v2, p5

    move-object/from16 v3, p6

    move-object/from16 v4, p7

    array-length v5, v4

    const/4 v6, 0x0

    :goto_0
    if-ge v6, v5, :cond_5

    aget-object v7, v4, v6

    .line 726
    .local v7, "potential":Lorg/apache/commons/compress/harmony/pack200/BHSDCodec;
    invoke-virtual {v7, v1}, Lorg/apache/commons/compress/harmony/pack200/BHSDCodec;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_0

    .line 727
    return-void

    .line 730
    :cond_0
    invoke-virtual {v7}, Lorg/apache/commons/compress/harmony/pack200/BHSDCodec;->isDelta()Z

    move-result v8

    const/4 v9, 0x0

    if-eqz v8, :cond_2

    .line 731
    invoke-virtual {v7}, Lorg/apache/commons/compress/harmony/pack200/BHSDCodec;->largest()J

    move-result-wide v10

    invoke-static/range {p4 .. p4}, Lorg/apache/commons/compress/harmony/pack200/BandSet$BandData;->access$700(Lorg/apache/commons/compress/harmony/pack200/BandSet$BandData;)I

    move-result v8

    int-to-long v12, v8

    cmp-long v8, v10, v12

    if-ltz v8, :cond_3

    invoke-virtual {v7}, Lorg/apache/commons/compress/harmony/pack200/BHSDCodec;->smallest()J

    move-result-wide v10

    invoke-static/range {p4 .. p4}, Lorg/apache/commons/compress/harmony/pack200/BandSet$BandData;->access$800(Lorg/apache/commons/compress/harmony/pack200/BandSet$BandData;)I

    move-result v8

    int-to-long v12, v8

    cmp-long v8, v10, v12

    if-gtz v8, :cond_3

    invoke-virtual {v7}, Lorg/apache/commons/compress/harmony/pack200/BHSDCodec;->largest()J

    move-result-wide v10

    invoke-static/range {p4 .. p4}, Lorg/apache/commons/compress/harmony/pack200/BandSet$BandData;->access$100(Lorg/apache/commons/compress/harmony/pack200/BandSet$BandData;)I

    move-result v8

    int-to-long v12, v8

    cmp-long v8, v10, v12

    if-ltz v8, :cond_3

    .line 732
    invoke-virtual {v7}, Lorg/apache/commons/compress/harmony/pack200/BHSDCodec;->smallest()J

    move-result-wide v10

    invoke-static/range {p4 .. p4}, Lorg/apache/commons/compress/harmony/pack200/BandSet$BandData;->access$900(Lorg/apache/commons/compress/harmony/pack200/BandSet$BandData;)I

    move-result v8

    int-to-long v12, v8

    cmp-long v8, v10, v12

    if-gtz v8, :cond_3

    .line 734
    invoke-virtual {v7, v0}, Lorg/apache/commons/compress/harmony/pack200/BHSDCodec;->encode([I)[B

    move-result-object v8

    .line 735
    .local v8, "encoded2":[B
    invoke-static {v2}, Lorg/apache/commons/compress/harmony/pack200/BandSet$BandAnalysisResults;->access$408(Lorg/apache/commons/compress/harmony/pack200/BandSet$BandAnalysisResults;)I

    .line 736
    invoke-static {v7, v9}, Lorg/apache/commons/compress/harmony/pack200/CodecEncoding;->getSpecifier(Lorg/apache/commons/compress/harmony/pack200/Codec;Lorg/apache/commons/compress/harmony/pack200/Codec;)[I

    move-result-object v9

    invoke-virtual {v1, v9}, Lorg/apache/commons/compress/harmony/pack200/BHSDCodec;->encode([I)[B

    move-result-object v9

    .line 737
    .local v9, "specifierEncoded":[B
    array-length v10, v3

    array-length v11, v8

    sub-int/2addr v10, v11

    array-length v11, v9

    sub-int/2addr v10, v11

    .line 738
    .local v10, "saved":I
    invoke-static {v2}, Lorg/apache/commons/compress/harmony/pack200/BandSet$BandAnalysisResults;->access$600(Lorg/apache/commons/compress/harmony/pack200/BandSet$BandAnalysisResults;)I

    move-result v11

    if-le v10, v11, :cond_1

    .line 739
    invoke-static {v2, v7}, Lorg/apache/commons/compress/harmony/pack200/BandSet$BandAnalysisResults;->access$202(Lorg/apache/commons/compress/harmony/pack200/BandSet$BandAnalysisResults;Lorg/apache/commons/compress/harmony/pack200/Codec;)Lorg/apache/commons/compress/harmony/pack200/Codec;

    .line 740
    invoke-static {v2, v8}, Lorg/apache/commons/compress/harmony/pack200/BandSet$BandAnalysisResults;->access$002(Lorg/apache/commons/compress/harmony/pack200/BandSet$BandAnalysisResults;[B)[B

    .line 741
    invoke-static {v2, v10}, Lorg/apache/commons/compress/harmony/pack200/BandSet$BandAnalysisResults;->access$602(Lorg/apache/commons/compress/harmony/pack200/BandSet$BandAnalysisResults;I)I

    .line 743
    .end local v8    # "encoded2":[B
    .end local v9    # "specifierEncoded":[B
    .end local v10    # "saved":I
    :cond_1
    goto :goto_1

    .line 744
    :cond_2
    invoke-virtual {v7}, Lorg/apache/commons/compress/harmony/pack200/BHSDCodec;->largest()J

    move-result-wide v10

    invoke-static/range {p4 .. p4}, Lorg/apache/commons/compress/harmony/pack200/BandSet$BandData;->access$100(Lorg/apache/commons/compress/harmony/pack200/BandSet$BandData;)I

    move-result v8

    int-to-long v12, v8

    cmp-long v8, v10, v12

    if-ltz v8, :cond_3

    invoke-virtual {v7}, Lorg/apache/commons/compress/harmony/pack200/BHSDCodec;->smallest()J

    move-result-wide v10

    invoke-static/range {p4 .. p4}, Lorg/apache/commons/compress/harmony/pack200/BandSet$BandData;->access$900(Lorg/apache/commons/compress/harmony/pack200/BandSet$BandData;)I

    move-result v8

    int-to-long v12, v8

    cmp-long v8, v10, v12

    if-gtz v8, :cond_3

    .line 745
    invoke-virtual {v7, v0}, Lorg/apache/commons/compress/harmony/pack200/BHSDCodec;->encode([I)[B

    move-result-object v8

    .line 746
    .restart local v8    # "encoded2":[B
    invoke-static {v2}, Lorg/apache/commons/compress/harmony/pack200/BandSet$BandAnalysisResults;->access$408(Lorg/apache/commons/compress/harmony/pack200/BandSet$BandAnalysisResults;)I

    .line 747
    invoke-static {v7, v9}, Lorg/apache/commons/compress/harmony/pack200/CodecEncoding;->getSpecifier(Lorg/apache/commons/compress/harmony/pack200/Codec;Lorg/apache/commons/compress/harmony/pack200/Codec;)[I

    move-result-object v9

    invoke-virtual {v1, v9}, Lorg/apache/commons/compress/harmony/pack200/BHSDCodec;->encode([I)[B

    move-result-object v9

    .line 748
    .restart local v9    # "specifierEncoded":[B
    array-length v10, v3

    array-length v11, v8

    sub-int/2addr v10, v11

    array-length v11, v9

    sub-int/2addr v10, v11

    .line 749
    .restart local v10    # "saved":I
    invoke-static {v2}, Lorg/apache/commons/compress/harmony/pack200/BandSet$BandAnalysisResults;->access$600(Lorg/apache/commons/compress/harmony/pack200/BandSet$BandAnalysisResults;)I

    move-result v11

    if-le v10, v11, :cond_3

    .line 750
    invoke-static {v2, v7}, Lorg/apache/commons/compress/harmony/pack200/BandSet$BandAnalysisResults;->access$202(Lorg/apache/commons/compress/harmony/pack200/BandSet$BandAnalysisResults;Lorg/apache/commons/compress/harmony/pack200/Codec;)Lorg/apache/commons/compress/harmony/pack200/Codec;

    .line 751
    invoke-static {v2, v8}, Lorg/apache/commons/compress/harmony/pack200/BandSet$BandAnalysisResults;->access$002(Lorg/apache/commons/compress/harmony/pack200/BandSet$BandAnalysisResults;[B)[B

    .line 752
    invoke-static {v2, v10}, Lorg/apache/commons/compress/harmony/pack200/BandSet$BandAnalysisResults;->access$602(Lorg/apache/commons/compress/harmony/pack200/BandSet$BandAnalysisResults;I)I

    .line 755
    .end local v8    # "encoded2":[B
    .end local v9    # "specifierEncoded":[B
    .end local v10    # "saved":I
    :cond_3
    :goto_1
    invoke-direct {p0, v2}, Lorg/apache/commons/compress/harmony/pack200/BandSet;->timeToStop(Lorg/apache/commons/compress/harmony/pack200/BandSet$BandAnalysisResults;)Z

    move-result v8

    if-eqz v8, :cond_4

    .line 756
    return-void

    .line 725
    .end local v7    # "potential":Lorg/apache/commons/compress/harmony/pack200/BHSDCodec;
    :cond_4
    add-int/lit8 v6, v6, 0x1

    goto/16 :goto_0

    .line 759
    :cond_5
    return-void
.end method


# virtual methods
.method protected cpEntryListToArray(Ljava/util/List;)[I
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lorg/apache/commons/compress/harmony/pack200/ConstantPoolEntry;",
            ">;)[I"
        }
    .end annotation

    .line 316
    .local p1, "list":Ljava/util/List;, "Ljava/util/List<+Lorg/apache/commons/compress/harmony/pack200/ConstantPoolEntry;>;"
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    new-array v0, v0, [I

    .line 317
    .local v0, "array":[I
    const/4 v1, 0x0

    .local v1, "i":I
    :goto_0
    array-length v2, v0

    if-ge v1, v2, :cond_1

    .line 318
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lorg/apache/commons/compress/harmony/pack200/ConstantPoolEntry;

    invoke-virtual {v2}, Lorg/apache/commons/compress/harmony/pack200/ConstantPoolEntry;->getIndex()I

    move-result v2

    aput v2, v0, v1

    .line 319
    aget v2, v0, v1

    if-ltz v2, :cond_0

    .line 317
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 320
    :cond_0
    new-instance v2, Ljava/lang/IllegalArgumentException;

    const-string v3, "Index should be > 0"

    invoke-direct {v2, v3}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v2

    .line 323
    .end local v1    # "i":I
    :cond_1
    return-object v0
.end method

.method protected cpEntryOrNullListToArray(Ljava/util/List;)[I
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lorg/apache/commons/compress/harmony/pack200/ConstantPoolEntry;",
            ">;)[I"
        }
    .end annotation

    .line 333
    .local p1, "list":Ljava/util/List;, "Ljava/util/List<+Lorg/apache/commons/compress/harmony/pack200/ConstantPoolEntry;>;"
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    new-array v0, v0, [I

    .line 334
    .local v0, "array":[I
    const/4 v1, 0x0

    .local v1, "j":I
    :goto_0
    array-length v2, v0

    if-ge v1, v2, :cond_3

    .line 335
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lorg/apache/commons/compress/harmony/pack200/ConstantPoolEntry;

    .line 336
    .local v2, "cpEntry":Lorg/apache/commons/compress/harmony/pack200/ConstantPoolEntry;
    if-nez v2, :cond_0

    const/4 v3, 0x0

    goto :goto_1

    :cond_0
    invoke-virtual {v2}, Lorg/apache/commons/compress/harmony/pack200/ConstantPoolEntry;->getIndex()I

    move-result v3

    add-int/lit8 v3, v3, 0x1

    :goto_1
    aput v3, v0, v1

    .line 337
    if-eqz v2, :cond_2

    invoke-virtual {v2}, Lorg/apache/commons/compress/harmony/pack200/ConstantPoolEntry;->getIndex()I

    move-result v3

    if-ltz v3, :cond_1

    goto :goto_2

    .line 338
    :cond_1
    new-instance v3, Ljava/lang/IllegalArgumentException;

    const-string v4, "Index should be > 0"

    invoke-direct {v3, v4}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v3

    .line 334
    .end local v2    # "cpEntry":Lorg/apache/commons/compress/harmony/pack200/ConstantPoolEntry;
    :cond_2
    :goto_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 341
    .end local v1    # "j":I
    :cond_3
    return-object v0
.end method

.method public encodeBandInt(Ljava/lang/String;[ILorg/apache/commons/compress/harmony/pack200/BHSDCodec;)[B
    .locals 10
    .param p1, "name"    # Ljava/lang/String;
    .param p2, "ints"    # [I
    .param p3, "defaultCodec"    # Lorg/apache/commons/compress/harmony/pack200/BHSDCodec;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/commons/compress/harmony/pack200/Pack200Exception;
        }
    .end annotation

    .line 354
    const/4 v0, 0x0

    .line 359
    .local v0, "encodedBand":[B
    iget v1, p0, Lorg/apache/commons/compress/harmony/pack200/BandSet;->effort:I

    const/4 v2, -0x1

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-le v1, v4, :cond_4

    array-length v1, p2

    sget-object v5, Lorg/apache/commons/compress/harmony/pack200/BandSet;->effortThresholds:[I

    iget v6, p0, Lorg/apache/commons/compress/harmony/pack200/BandSet;->effort:I

    aget v5, v5, v6

    if-lt v1, v5, :cond_4

    .line 360
    invoke-direct {p0, p1, p2, p3}, Lorg/apache/commons/compress/harmony/pack200/BandSet;->analyseBand(Ljava/lang/String;[ILorg/apache/commons/compress/harmony/pack200/BHSDCodec;)Lorg/apache/commons/compress/harmony/pack200/BandSet$BandAnalysisResults;

    move-result-object v1

    .line 361
    .local v1, "results":Lorg/apache/commons/compress/harmony/pack200/BandSet$BandAnalysisResults;
    invoke-static {v1}, Lorg/apache/commons/compress/harmony/pack200/BandSet$BandAnalysisResults;->access$200(Lorg/apache/commons/compress/harmony/pack200/BandSet$BandAnalysisResults;)Lorg/apache/commons/compress/harmony/pack200/Codec;

    move-result-object v5

    .line 362
    .local v5, "betterCodec":Lorg/apache/commons/compress/harmony/pack200/Codec;
    invoke-static {v1}, Lorg/apache/commons/compress/harmony/pack200/BandSet$BandAnalysisResults;->access$000(Lorg/apache/commons/compress/harmony/pack200/BandSet$BandAnalysisResults;)[B

    move-result-object v0

    .line 363
    if-eqz v5, :cond_4

    .line 364
    instance-of v6, v5, Lorg/apache/commons/compress/harmony/pack200/BHSDCodec;

    if-eqz v6, :cond_2

    .line 365
    invoke-static {v5, p3}, Lorg/apache/commons/compress/harmony/pack200/CodecEncoding;->getSpecifier(Lorg/apache/commons/compress/harmony/pack200/Codec;Lorg/apache/commons/compress/harmony/pack200/Codec;)[I

    move-result-object v6

    .line 366
    .local v6, "specifierBand":[I
    aget v7, v6, v3

    .line 367
    .local v7, "specifier":I
    array-length v8, v6

    if-le v8, v4, :cond_0

    .line 368
    const/4 v4, 0x1

    .local v4, "i":I
    :goto_0
    array-length v8, v6

    if-ge v4, v8, :cond_0

    .line 369
    iget-object v8, p0, Lorg/apache/commons/compress/harmony/pack200/BandSet;->segmentHeader:Lorg/apache/commons/compress/harmony/pack200/SegmentHeader;

    aget v9, v6, v4

    invoke-virtual {v8, v9}, Lorg/apache/commons/compress/harmony/pack200/SegmentHeader;->appendBandCodingSpecifier(I)V

    .line 368
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 372
    .end local v4    # "i":I
    :cond_0
    invoke-virtual {p3}, Lorg/apache/commons/compress/harmony/pack200/BHSDCodec;->isSigned()Z

    move-result v4

    if-eqz v4, :cond_1

    .line 373
    sub-int/2addr v2, v7

    .end local v7    # "specifier":I
    .local v2, "specifier":I
    goto :goto_1

    .line 375
    .end local v2    # "specifier":I
    .restart local v7    # "specifier":I
    :cond_1
    invoke-virtual {p3}, Lorg/apache/commons/compress/harmony/pack200/BHSDCodec;->getL()I

    move-result v2

    add-int/2addr v2, v7

    .line 377
    .end local v7    # "specifier":I
    .restart local v2    # "specifier":I
    :goto_1
    filled-new-array {v2}, [I

    move-result-object v4

    invoke-virtual {p3, v4}, Lorg/apache/commons/compress/harmony/pack200/BHSDCodec;->encode([I)[B

    move-result-object v4

    .line 378
    .local v4, "specifierEncoded":[B
    array-length v7, v4

    array-length v8, v0

    add-int/2addr v7, v8

    new-array v7, v7, [B

    .line 379
    .local v7, "band":[B
    array-length v8, v4

    invoke-static {v4, v3, v7, v3, v8}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 380
    array-length v8, v4

    array-length v9, v0

    invoke-static {v0, v3, v7, v8, v9}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 381
    return-object v7

    .line 383
    .end local v2    # "specifier":I
    .end local v4    # "specifierEncoded":[B
    .end local v6    # "specifierBand":[I
    .end local v7    # "band":[B
    :cond_2
    instance-of v6, v5, Lorg/apache/commons/compress/harmony/pack200/PopulationCodec;

    if-eqz v6, :cond_3

    .line 384
    invoke-static {v1}, Lorg/apache/commons/compress/harmony/pack200/BandSet$BandAnalysisResults;->access$300(Lorg/apache/commons/compress/harmony/pack200/BandSet$BandAnalysisResults;)[I

    move-result-object v2

    invoke-static {v2}, Ljava/util/stream/IntStream;->of([I)Ljava/util/stream/IntStream;

    move-result-object v2

    iget-object v3, p0, Lorg/apache/commons/compress/harmony/pack200/BandSet;->segmentHeader:Lorg/apache/commons/compress/harmony/pack200/SegmentHeader;

    invoke-static {v3}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v4, Lorg/apache/commons/compress/harmony/pack200/BandSet$$ExternalSyntheticLambda3;

    invoke-direct {v4, v3}, Lorg/apache/commons/compress/harmony/pack200/BandSet$$ExternalSyntheticLambda3;-><init>(Lorg/apache/commons/compress/harmony/pack200/SegmentHeader;)V

    invoke-interface {v2, v4}, Ljava/util/stream/IntStream;->forEach(Ljava/util/function/IntConsumer;)V

    .line 385
    return-object v0

    .line 387
    :cond_3
    instance-of v6, v5, Lorg/apache/commons/compress/harmony/pack200/RunCodec;

    .line 394
    .end local v1    # "results":Lorg/apache/commons/compress/harmony/pack200/BandSet$BandAnalysisResults;
    .end local v5    # "betterCodec":Lorg/apache/commons/compress/harmony/pack200/Codec;
    :cond_4
    array-length v1, p2

    if-lez v1, :cond_8

    .line 395
    if-nez v0, :cond_5

    .line 396
    invoke-virtual {p3, p2}, Lorg/apache/commons/compress/harmony/pack200/BHSDCodec;->encode([I)[B

    move-result-object v0

    .line 398
    :cond_5
    aget v1, p2, v3

    .line 399
    .local v1, "first":I
    invoke-virtual {p3}, Lorg/apache/commons/compress/harmony/pack200/BHSDCodec;->getB()I

    move-result v5

    if-eq v5, v4, :cond_7

    .line 400
    invoke-virtual {p3}, Lorg/apache/commons/compress/harmony/pack200/BHSDCodec;->isSigned()Z

    move-result v4

    if-eqz v4, :cond_6

    const/16 v4, -0x100

    if-lt v1, v4, :cond_6

    if-gt v1, v2, :cond_6

    .line 401
    invoke-static {p3}, Lorg/apache/commons/compress/harmony/pack200/CodecEncoding;->getSpecifierForDefaultCodec(Lorg/apache/commons/compress/harmony/pack200/BHSDCodec;)I

    move-result v4

    sub-int/2addr v2, v4

    .line 402
    .restart local v2    # "specifier":I
    filled-new-array {v2}, [I

    move-result-object v4

    invoke-virtual {p3, v4}, Lorg/apache/commons/compress/harmony/pack200/BHSDCodec;->encode([I)[B

    move-result-object v4

    .line 403
    .restart local v4    # "specifierEncoded":[B
    array-length v5, v4

    array-length v6, v0

    add-int/2addr v5, v6

    new-array v5, v5, [B

    .line 404
    .local v5, "band":[B
    array-length v6, v4

    invoke-static {v4, v3, v5, v3, v6}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 405
    array-length v6, v4

    array-length v7, v0

    invoke-static {v0, v3, v5, v6, v7}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 406
    return-object v5

    .line 408
    .end local v2    # "specifier":I
    .end local v4    # "specifierEncoded":[B
    .end local v5    # "band":[B
    :cond_6
    invoke-virtual {p3}, Lorg/apache/commons/compress/harmony/pack200/BHSDCodec;->isSigned()Z

    move-result v2

    if-nez v2, :cond_7

    invoke-virtual {p3}, Lorg/apache/commons/compress/harmony/pack200/BHSDCodec;->getL()I

    move-result v2

    if-lt v1, v2, :cond_7

    invoke-virtual {p3}, Lorg/apache/commons/compress/harmony/pack200/BHSDCodec;->getL()I

    move-result v2

    add-int/lit16 v2, v2, 0xff

    if-gt v1, v2, :cond_7

    .line 409
    invoke-static {p3}, Lorg/apache/commons/compress/harmony/pack200/CodecEncoding;->getSpecifierForDefaultCodec(Lorg/apache/commons/compress/harmony/pack200/BHSDCodec;)I

    move-result v2

    invoke-virtual {p3}, Lorg/apache/commons/compress/harmony/pack200/BHSDCodec;->getL()I

    move-result v4

    add-int/2addr v2, v4

    .line 410
    .restart local v2    # "specifier":I
    filled-new-array {v2}, [I

    move-result-object v4

    invoke-virtual {p3, v4}, Lorg/apache/commons/compress/harmony/pack200/BHSDCodec;->encode([I)[B

    move-result-object v4

    .line 411
    .restart local v4    # "specifierEncoded":[B
    array-length v5, v4

    array-length v6, v0

    add-int/2addr v5, v6

    new-array v5, v5, [B

    .line 412
    .restart local v5    # "band":[B
    array-length v6, v4

    invoke-static {v4, v3, v5, v3, v6}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 413
    array-length v6, v4

    array-length v7, v0

    invoke-static {v0, v3, v5, v6, v7}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 414
    return-object v5

    .line 417
    .end local v2    # "specifier":I
    .end local v4    # "specifierEncoded":[B
    .end local v5    # "band":[B
    :cond_7
    return-object v0

    .line 419
    .end local v1    # "first":I
    :cond_8
    sget-object v1, Lorg/apache/commons/compress/harmony/pack200/BandSet;->EMPTY_BYTE_ARRAY:[B

    return-object v1
.end method

.method protected encodeFlags(Ljava/lang/String;[JLorg/apache/commons/compress/harmony/pack200/BHSDCodec;Lorg/apache/commons/compress/harmony/pack200/BHSDCodec;Z)[B
    .locals 8
    .param p1, "name"    # Ljava/lang/String;
    .param p2, "flags"    # [J
    .param p3, "loCodec"    # Lorg/apache/commons/compress/harmony/pack200/BHSDCodec;
    .param p4, "hiCodec"    # Lorg/apache/commons/compress/harmony/pack200/BHSDCodec;
    .param p5, "haveHiFlags"    # Z
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/commons/compress/harmony/pack200/Pack200Exception;
        }
    .end annotation

    .line 435
    if-nez p5, :cond_0

    .line 436
    array-length v0, p2

    new-array v0, v0, [I

    .line 437
    .local v0, "loBits":[I
    new-instance v1, Lorg/apache/commons/compress/harmony/pack200/BandSet$$ExternalSyntheticLambda5;

    invoke-direct {v1, p2}, Lorg/apache/commons/compress/harmony/pack200/BandSet$$ExternalSyntheticLambda5;-><init>([J)V

    invoke-static {v0, v1}, Ljava/util/Arrays;->setAll([ILjava/util/function/IntUnaryOperator;)V

    .line 438
    invoke-virtual {p0, p1, v0, p3}, Lorg/apache/commons/compress/harmony/pack200/BandSet;->encodeBandInt(Ljava/lang/String;[ILorg/apache/commons/compress/harmony/pack200/BHSDCodec;)[B

    move-result-object v1

    return-object v1

    .line 440
    .end local v0    # "loBits":[I
    :cond_0
    array-length v0, p2

    new-array v0, v0, [I

    .line 441
    .local v0, "hiBits":[I
    array-length v1, p2

    new-array v1, v1, [I

    .line 442
    .local v1, "loBits":[I
    const/4 v2, 0x0

    .local v2, "i":I
    :goto_0
    array-length v3, p2

    if-ge v2, v3, :cond_1

    .line 443
    aget-wide v3, p2, v2

    .line 444
    .local v3, "l":J
    const/16 v5, 0x20

    shr-long v5, v3, v5

    long-to-int v5, v5

    aput v5, v0, v2

    .line 445
    long-to-int v5, v3

    aput v5, v1, v2

    .line 442
    .end local v3    # "l":J
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 447
    .end local v2    # "i":I
    :cond_1
    invoke-virtual {p0, p1, v0, p4}, Lorg/apache/commons/compress/harmony/pack200/BandSet;->encodeBandInt(Ljava/lang/String;[ILorg/apache/commons/compress/harmony/pack200/BHSDCodec;)[B

    move-result-object v2

    .line 448
    .local v2, "hi":[B
    invoke-virtual {p0, p1, v1, p3}, Lorg/apache/commons/compress/harmony/pack200/BandSet;->encodeBandInt(Ljava/lang/String;[ILorg/apache/commons/compress/harmony/pack200/BHSDCodec;)[B

    move-result-object v3

    .line 449
    .local v3, "lo":[B
    array-length v4, v2

    array-length v5, v3

    add-int/2addr v4, v5

    new-array v4, v4, [B

    .line 450
    .local v4, "total":[B
    array-length v5, v2

    const/4 v6, 0x0

    invoke-static {v2, v6, v4, v6, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 451
    array-length v5, v2

    add-int/lit8 v5, v5, 0x1

    array-length v7, v3

    invoke-static {v3, v6, v4, v5, v7}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 452
    return-object v4
.end method

.method protected encodeFlags(Ljava/lang/String;[[JLorg/apache/commons/compress/harmony/pack200/BHSDCodec;Lorg/apache/commons/compress/harmony/pack200/BHSDCodec;Z)[B
    .locals 6
    .param p1, "name"    # Ljava/lang/String;
    .param p2, "flags"    # [[J
    .param p3, "loCodec"    # Lorg/apache/commons/compress/harmony/pack200/BHSDCodec;
    .param p4, "hiCodec"    # Lorg/apache/commons/compress/harmony/pack200/BHSDCodec;
    .param p5, "haveHiFlags"    # Z
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/commons/compress/harmony/pack200/Pack200Exception;
        }
    .end annotation

    .line 484
    invoke-direct {p0, p2}, Lorg/apache/commons/compress/harmony/pack200/BandSet;->flatten([[J)[J

    move-result-object v2

    move-object v0, p0

    move-object v1, p1

    move-object v3, p3

    move-object v4, p4

    move v5, p5

    .end local p1    # "name":Ljava/lang/String;
    .end local p3    # "loCodec":Lorg/apache/commons/compress/harmony/pack200/BHSDCodec;
    .end local p4    # "hiCodec":Lorg/apache/commons/compress/harmony/pack200/BHSDCodec;
    .end local p5    # "haveHiFlags":Z
    .local v1, "name":Ljava/lang/String;
    .local v3, "loCodec":Lorg/apache/commons/compress/harmony/pack200/BHSDCodec;
    .local v4, "hiCodec":Lorg/apache/commons/compress/harmony/pack200/BHSDCodec;
    .local v5, "haveHiFlags":Z
    invoke-virtual/range {v0 .. v5}, Lorg/apache/commons/compress/harmony/pack200/BandSet;->encodeFlags(Ljava/lang/String;[JLorg/apache/commons/compress/harmony/pack200/BHSDCodec;Lorg/apache/commons/compress/harmony/pack200/BHSDCodec;Z)[B

    move-result-object p1

    return-object p1
.end method

.method public encodeScalar(ILorg/apache/commons/compress/harmony/pack200/BHSDCodec;)[B
    .locals 1
    .param p1, "value"    # I
    .param p2, "codec"    # Lorg/apache/commons/compress/harmony/pack200/BHSDCodec;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/commons/compress/harmony/pack200/Pack200Exception;
        }
    .end annotation

    .line 496
    invoke-virtual {p2, p1}, Lorg/apache/commons/compress/harmony/pack200/BHSDCodec;->encode(I)[B

    move-result-object v0

    return-object v0
.end method

.method public encodeScalar([ILorg/apache/commons/compress/harmony/pack200/BHSDCodec;)[B
    .locals 1
    .param p1, "band"    # [I
    .param p2, "codec"    # Lorg/apache/commons/compress/harmony/pack200/BHSDCodec;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/commons/compress/harmony/pack200/Pack200Exception;
        }
    .end annotation

    .line 508
    invoke-virtual {p2, p1}, Lorg/apache/commons/compress/harmony/pack200/BHSDCodec;->encode([I)[B

    move-result-object v0

    return-object v0
.end method

.method protected integerListToArray(Ljava/util/List;)[I
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;)[I"
        }
    .end annotation

    .line 690
    .local p1, "integerList":Ljava/util/List;, "Ljava/util/List<Ljava/lang/Integer;>;"
    invoke-interface {p1}, Ljava/util/List;->stream()Ljava/util/stream/Stream;

    move-result-object v0

    new-instance v1, Lorg/apache/commons/compress/harmony/pack200/BandSet$$ExternalSyntheticLambda6;

    invoke-direct {v1}, Lorg/apache/commons/compress/harmony/pack200/BandSet$$ExternalSyntheticLambda6;-><init>()V

    invoke-interface {v0, v1}, Ljava/util/stream/Stream;->mapToInt(Ljava/util/function/ToIntFunction;)Ljava/util/stream/IntStream;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/stream/IntStream;->toArray()[I

    move-result-object v0

    return-object v0
.end method

.method protected longListToArray(Ljava/util/List;)[J
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Long;",
            ">;)[J"
        }
    .end annotation

    .line 700
    .local p1, "longList":Ljava/util/List;, "Ljava/util/List<Ljava/lang/Long;>;"
    invoke-interface {p1}, Ljava/util/List;->stream()Ljava/util/stream/Stream;

    move-result-object v0

    new-instance v1, Lorg/apache/commons/compress/harmony/pack200/BandSet$$ExternalSyntheticLambda4;

    invoke-direct {v1}, Lorg/apache/commons/compress/harmony/pack200/BandSet$$ExternalSyntheticLambda4;-><init>()V

    invoke-interface {v0, v1}, Ljava/util/stream/Stream;->mapToLong(Ljava/util/function/ToLongFunction;)Ljava/util/stream/LongStream;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/stream/LongStream;->toArray()[J

    move-result-object v0

    return-object v0
.end method

.method public abstract pack(Ljava/io/OutputStream;)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Lorg/apache/commons/compress/harmony/pack200/Pack200Exception;
        }
    .end annotation
.end method
