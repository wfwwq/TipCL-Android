.class public Lorg/apache/commons/compress/harmony/unpack200/BcBands;
.super Lorg/apache/commons/compress/harmony/unpack200/BandSet;
.source "BcBands.java"


# instance fields
.field private bcByte:[I

.field private bcCaseCount:[I

.field private bcCaseValue:[I

.field private bcClassRef:[I

.field private bcDoubleRef:[I

.field private bcEscByte:[[I

.field private bcEscRef:[I

.field private bcEscRefSize:[I

.field private bcEscSize:[I

.field private bcFieldRef:[I

.field private bcFloatRef:[I

.field private bcIMethodRef:[I

.field private bcInitRef:[I

.field private bcIntRef:[I

.field private bcLabel:[I

.field private bcLocal:[I

.field private bcLongRef:[I

.field private bcMethodRef:[I

.field private bcShort:[I

.field private bcStringRef:[I

.field private bcSuperField:[I

.field private bcSuperMethod:[I

.field private bcThisField:[I

.field private bcThisMethod:[I

.field private methodByteCodePacked:[[[B

.field private wideByteCodes:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lorg/apache/commons/compress/harmony/unpack200/Segment;)V
    .locals 0
    .param p1, "segment"    # Lorg/apache/commons/compress/harmony/unpack200/Segment;

    .line 79
    invoke-direct {p0, p1}, Lorg/apache/commons/compress/harmony/unpack200/BandSet;-><init>(Lorg/apache/commons/compress/harmony/unpack200/Segment;)V

    .line 80
    return-void
.end method

.method private endsWithLoad(I)Z
    .locals 1
    .param p1, "codePacked"    # I

    .line 83
    const/16 v0, 0x15

    if-lt p1, v0, :cond_0

    const/16 v0, 0x19

    if-gt p1, v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private endsWithStore(I)Z
    .locals 1
    .param p1, "codePacked"    # I

    .line 87
    const/16 v0, 0x36

    if-lt p1, v0, :cond_0

    const/16 v0, 0x3a

    if-gt p1, v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private startsWithIf(I)Z
    .locals 1
    .param p1, "codePacked"    # I

    .line 423
    const/16 v0, 0x99

    if-lt p1, v0, :cond_0

    const/16 v0, 0xa6

    if-le p1, v0, :cond_2

    :cond_0
    const/16 v0, 0xc6

    if-eq p1, v0, :cond_2

    const/16 v0, 0xc7

    if-ne p1, v0, :cond_1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    goto :goto_1

    :cond_2
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method


# virtual methods
.method public getBcByte()[I
    .locals 1

    .line 91
    iget-object v0, p0, Lorg/apache/commons/compress/harmony/unpack200/BcBands;->bcByte:[I

    return-object v0
.end method

.method public getBcCaseCount()[I
    .locals 1

    .line 95
    iget-object v0, p0, Lorg/apache/commons/compress/harmony/unpack200/BcBands;->bcCaseCount:[I

    return-object v0
.end method

.method public getBcCaseValue()[I
    .locals 1

    .line 99
    iget-object v0, p0, Lorg/apache/commons/compress/harmony/unpack200/BcBands;->bcCaseValue:[I

    return-object v0
.end method

.method public getBcClassRef()[I
    .locals 1

    .line 103
    iget-object v0, p0, Lorg/apache/commons/compress/harmony/unpack200/BcBands;->bcClassRef:[I

    return-object v0
.end method

.method public getBcDoubleRef()[I
    .locals 1

    .line 107
    iget-object v0, p0, Lorg/apache/commons/compress/harmony/unpack200/BcBands;->bcDoubleRef:[I

    return-object v0
.end method

.method public getBcFieldRef()[I
    .locals 1

    .line 111
    iget-object v0, p0, Lorg/apache/commons/compress/harmony/unpack200/BcBands;->bcFieldRef:[I

    return-object v0
.end method

.method public getBcFloatRef()[I
    .locals 1

    .line 115
    iget-object v0, p0, Lorg/apache/commons/compress/harmony/unpack200/BcBands;->bcFloatRef:[I

    return-object v0
.end method

.method public getBcIMethodRef()[I
    .locals 1

    .line 119
    iget-object v0, p0, Lorg/apache/commons/compress/harmony/unpack200/BcBands;->bcIMethodRef:[I

    return-object v0
.end method

.method public getBcInitRef()[I
    .locals 1

    .line 123
    iget-object v0, p0, Lorg/apache/commons/compress/harmony/unpack200/BcBands;->bcInitRef:[I

    return-object v0
.end method

.method public getBcIntRef()[I
    .locals 1

    .line 127
    iget-object v0, p0, Lorg/apache/commons/compress/harmony/unpack200/BcBands;->bcIntRef:[I

    return-object v0
.end method

.method public getBcLabel()[I
    .locals 1

    .line 131
    iget-object v0, p0, Lorg/apache/commons/compress/harmony/unpack200/BcBands;->bcLabel:[I

    return-object v0
.end method

.method public getBcLocal()[I
    .locals 1

    .line 135
    iget-object v0, p0, Lorg/apache/commons/compress/harmony/unpack200/BcBands;->bcLocal:[I

    return-object v0
.end method

.method public getBcLongRef()[I
    .locals 1

    .line 139
    iget-object v0, p0, Lorg/apache/commons/compress/harmony/unpack200/BcBands;->bcLongRef:[I

    return-object v0
.end method

.method public getBcMethodRef()[I
    .locals 1

    .line 143
    iget-object v0, p0, Lorg/apache/commons/compress/harmony/unpack200/BcBands;->bcMethodRef:[I

    return-object v0
.end method

.method public getBcShort()[I
    .locals 1

    .line 147
    iget-object v0, p0, Lorg/apache/commons/compress/harmony/unpack200/BcBands;->bcShort:[I

    return-object v0
.end method

.method public getBcStringRef()[I
    .locals 1

    .line 151
    iget-object v0, p0, Lorg/apache/commons/compress/harmony/unpack200/BcBands;->bcStringRef:[I

    return-object v0
.end method

.method public getBcSuperField()[I
    .locals 1

    .line 155
    iget-object v0, p0, Lorg/apache/commons/compress/harmony/unpack200/BcBands;->bcSuperField:[I

    return-object v0
.end method

.method public getBcSuperMethod()[I
    .locals 1

    .line 159
    iget-object v0, p0, Lorg/apache/commons/compress/harmony/unpack200/BcBands;->bcSuperMethod:[I

    return-object v0
.end method

.method public getBcThisField()[I
    .locals 1

    .line 163
    iget-object v0, p0, Lorg/apache/commons/compress/harmony/unpack200/BcBands;->bcThisField:[I

    return-object v0
.end method

.method public getBcThisMethod()[I
    .locals 1

    .line 167
    iget-object v0, p0, Lorg/apache/commons/compress/harmony/unpack200/BcBands;->bcThisMethod:[I

    return-object v0
.end method

.method public getMethodByteCodePacked()[[[B
    .locals 1

    .line 171
    iget-object v0, p0, Lorg/apache/commons/compress/harmony/unpack200/BcBands;->methodByteCodePacked:[[[B

    return-object v0
.end method

.method public read(Ljava/io/InputStream;)V
    .locals 45
    .param p1, "in"    # Ljava/io/InputStream;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Lorg/apache/commons/compress/harmony/pack200/Pack200Exception;
        }
    .end annotation

    .line 182
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    iget-object v2, v0, Lorg/apache/commons/compress/harmony/unpack200/BcBands;->segment:Lorg/apache/commons/compress/harmony/unpack200/Segment;

    invoke-virtual {v2}, Lorg/apache/commons/compress/harmony/unpack200/Segment;->getAttrDefinitionBands()Lorg/apache/commons/compress/harmony/unpack200/AttrDefinitionBands;

    move-result-object v2

    invoke-virtual {v2}, Lorg/apache/commons/compress/harmony/unpack200/AttrDefinitionBands;->getAttributeDefinitionMap()Lorg/apache/commons/compress/harmony/unpack200/AttributeLayoutMap;

    move-result-object v2

    .line 183
    .local v2, "attributeDefinitionMap":Lorg/apache/commons/compress/harmony/unpack200/AttributeLayoutMap;
    iget-object v3, v0, Lorg/apache/commons/compress/harmony/unpack200/BcBands;->header:Lorg/apache/commons/compress/harmony/unpack200/SegmentHeader;

    invoke-virtual {v3}, Lorg/apache/commons/compress/harmony/unpack200/SegmentHeader;->getClassCount()I

    move-result v3

    .line 184
    .local v3, "classCount":I
    iget-object v4, v0, Lorg/apache/commons/compress/harmony/unpack200/BcBands;->segment:Lorg/apache/commons/compress/harmony/unpack200/Segment;

    invoke-virtual {v4}, Lorg/apache/commons/compress/harmony/unpack200/Segment;->getClassBands()Lorg/apache/commons/compress/harmony/unpack200/ClassBands;

    move-result-object v4

    invoke-virtual {v4}, Lorg/apache/commons/compress/harmony/unpack200/ClassBands;->getMethodFlags()[[J

    move-result-object v4

    .line 186
    .local v4, "methodFlags":[[J
    const/4 v5, 0x0

    .line 187
    .local v5, "bcCaseCountCount":I
    const/4 v6, 0x0

    .line 188
    .local v6, "bcByteCount":I
    const/4 v7, 0x0

    .line 189
    .local v7, "bcShortCount":I
    const/4 v8, 0x0

    .line 190
    .local v8, "bcLocalCount":I
    const/4 v9, 0x0

    .line 191
    .local v9, "bcLabelCount":I
    const/4 v10, 0x0

    .line 192
    .local v10, "bcIntRefCount":I
    const/4 v11, 0x0

    .line 193
    .local v11, "bcFloatRefCount":I
    const/4 v12, 0x0

    .line 194
    .local v12, "bcLongRefCount":I
    const/4 v13, 0x0

    .line 195
    .local v13, "bcDoubleRefCount":I
    const/4 v14, 0x0

    .line 196
    .local v14, "bcStringRefCount":I
    const/4 v15, 0x0

    .line 197
    .local v15, "bcClassRefCount":I
    const/16 v16, 0x0

    .line 198
    .local v16, "bcFieldRefCount":I
    const/16 v17, 0x0

    .line 199
    .local v17, "bcMethodRefCount":I
    const/16 v18, 0x0

    .line 200
    .local v18, "bcIMethodRefCount":I
    const/16 v19, 0x0

    .line 201
    .local v19, "bcThisFieldCount":I
    const/16 v20, 0x0

    .line 202
    .local v20, "bcSuperFieldCount":I
    const/16 v21, 0x0

    .line 203
    .local v21, "bcThisMethodCount":I
    const/16 v22, 0x0

    .line 204
    .local v22, "bcSuperMethodCount":I
    const/16 v23, 0x0

    .line 205
    .local v23, "bcInitRefCount":I
    const/16 v24, 0x0

    .line 206
    .local v24, "bcEscCount":I
    const/16 v25, 0x0

    .line 208
    .local v25, "bcEscRefCount":I
    move-object/from16 v26, v4

    .end local v4    # "methodFlags":[[J
    .local v26, "methodFlags":[[J
    const-string v4, "ACC_ABSTRACT"

    move/from16 v27, v5

    .end local v5    # "bcCaseCountCount":I
    .local v27, "bcCaseCountCount":I
    const/4 v5, 0x2

    invoke-virtual {v2, v4, v5}, Lorg/apache/commons/compress/harmony/unpack200/AttributeLayoutMap;->getAttributeLayout(Ljava/lang/String;I)Lorg/apache/commons/compress/harmony/unpack200/AttributeLayout;

    move-result-object v4

    .line 209
    .local v4, "abstractModifier":Lorg/apache/commons/compress/harmony/unpack200/AttributeLayout;
    move/from16 v28, v6

    .end local v6    # "bcByteCount":I
    .local v28, "bcByteCount":I
    const-string v6, "ACC_NATIVE"

    invoke-virtual {v2, v6, v5}, Lorg/apache/commons/compress/harmony/unpack200/AttributeLayoutMap;->getAttributeLayout(Ljava/lang/String;I)Lorg/apache/commons/compress/harmony/unpack200/AttributeLayout;

    move-result-object v6

    .line 211
    .local v6, "nativeModifier":Lorg/apache/commons/compress/harmony/unpack200/AttributeLayout;
    new-array v5, v3, [[[B

    iput-object v5, v0, Lorg/apache/commons/compress/harmony/unpack200/BcBands;->methodByteCodePacked:[[[B

    .line 212
    const/4 v5, 0x0

    .line 214
    .local v5, "bcParsed":I
    new-instance v30, Ljava/util/ArrayList;

    invoke-direct/range {v30 .. v30}, Ljava/util/ArrayList;-><init>()V

    move-object/from16 v31, v30

    .line 215
    .local v31, "switchIsTableSwitch":Ljava/util/List;, "Ljava/util/List<Ljava/lang/Boolean;>;"
    move-object/from16 v30, v2

    .end local v2    # "attributeDefinitionMap":Lorg/apache/commons/compress/harmony/unpack200/AttributeLayoutMap;
    .local v30, "attributeDefinitionMap":Lorg/apache/commons/compress/harmony/unpack200/AttributeLayoutMap;
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iput-object v2, v0, Lorg/apache/commons/compress/harmony/unpack200/BcBands;->wideByteCodes:Ljava/util/List;

    .line 216
    const/4 v2, 0x0

    move/from16 v32, v13

    move v13, v11

    move v11, v15

    move/from16 v15, v32

    move/from16 v32, v16

    move/from16 v33, v17

    move/from16 v34, v18

    move/from16 v35, v19

    move/from16 v36, v20

    move/from16 v37, v21

    move/from16 v38, v22

    move/from16 v39, v23

    move/from16 v40, v24

    move/from16 v41, v25

    move/from16 v16, v5

    move/from16 v17, v9

    move/from16 v5, v27

    move v9, v7

    move v7, v14

    move v14, v12

    move v12, v10

    move v10, v8

    move/from16 v8, v28

    .end local v18    # "bcIMethodRefCount":I
    .end local v19    # "bcThisFieldCount":I
    .end local v20    # "bcSuperFieldCount":I
    .end local v21    # "bcThisMethodCount":I
    .end local v22    # "bcSuperMethodCount":I
    .end local v23    # "bcInitRefCount":I
    .end local v24    # "bcEscCount":I
    .end local v25    # "bcEscRefCount":I
    .end local v27    # "bcCaseCountCount":I
    .end local v28    # "bcByteCount":I
    .local v2, "c":I
    .local v5, "bcCaseCountCount":I
    .local v7, "bcStringRefCount":I
    .local v8, "bcByteCount":I
    .local v9, "bcShortCount":I
    .local v10, "bcLocalCount":I
    .local v11, "bcClassRefCount":I
    .local v12, "bcIntRefCount":I
    .local v13, "bcFloatRefCount":I
    .local v14, "bcLongRefCount":I
    .local v15, "bcDoubleRefCount":I
    .local v16, "bcParsed":I
    .local v17, "bcLabelCount":I
    .local v32, "bcFieldRefCount":I
    .local v33, "bcMethodRefCount":I
    .local v34, "bcIMethodRefCount":I
    .local v35, "bcThisFieldCount":I
    .local v36, "bcSuperFieldCount":I
    .local v37, "bcThisMethodCount":I
    .local v38, "bcSuperMethodCount":I
    .local v39, "bcInitRefCount":I
    .local v40, "bcEscCount":I
    .local v41, "bcEscRefCount":I
    :goto_0
    if-ge v2, v3, :cond_b

    .line 217
    move/from16 v18, v2

    .end local v2    # "c":I
    .local v18, "c":I
    aget-object v2, v26, v18

    array-length v2, v2

    .line 218
    .local v2, "numberOfMethods":I
    move/from16 v19, v3

    .end local v3    # "classCount":I
    .local v19, "classCount":I
    iget-object v3, v0, Lorg/apache/commons/compress/harmony/unpack200/BcBands;->methodByteCodePacked:[[[B

    move-object/from16 v20, v3

    new-array v3, v2, [[B

    aput-object v3, v20, v18

    .line 219
    const/4 v3, 0x0

    .local v3, "m":I
    :goto_1
    if-ge v3, v2, :cond_a

    .line 220
    aget-object v20, v26, v18

    move/from16 v21, v2

    move/from16 v22, v3

    .end local v2    # "numberOfMethods":I
    .end local v3    # "m":I
    .local v21, "numberOfMethods":I
    .local v22, "m":I
    aget-wide v2, v20, v22

    .line 221
    .local v2, "methodFlag":J
    invoke-virtual {v4, v2, v3}, Lorg/apache/commons/compress/harmony/unpack200/AttributeLayout;->matches(J)Z

    move-result v20

    if-nez v20, :cond_9

    invoke-virtual {v6, v2, v3}, Lorg/apache/commons/compress/harmony/unpack200/AttributeLayout;->matches(J)Z

    move-result v20

    if-nez v20, :cond_9

    .line 222
    new-instance v20, Ljava/io/ByteArrayOutputStream;

    invoke-direct/range {v20 .. v20}, Ljava/io/ByteArrayOutputStream;-><init>()V

    move-object/from16 v23, v20

    .line 224
    .local v23, "codeBytes":Ljava/io/ByteArrayOutputStream;
    :goto_2
    move-wide/from16 v24, v2

    .end local v2    # "methodFlag":J
    .local v24, "methodFlag":J
    invoke-virtual {v1}, Ljava/io/InputStream;->read()I

    move-result v2

    and-int/lit16 v2, v2, 0xff

    int-to-byte v2, v2

    move v3, v2

    move-object/from16 v20, v4

    .end local v4    # "abstractModifier":Lorg/apache/commons/compress/harmony/unpack200/AttributeLayout;
    .local v3, "code":B
    .local v20, "abstractModifier":Lorg/apache/commons/compress/harmony/unpack200/AttributeLayout;
    const/4 v4, -0x1

    if-eq v2, v4, :cond_0

    .line 225
    move-object/from16 v2, v23

    .end local v23    # "codeBytes":Ljava/io/ByteArrayOutputStream;
    .local v2, "codeBytes":Ljava/io/ByteArrayOutputStream;
    invoke-virtual {v2, v3}, Ljava/io/ByteArrayOutputStream;->write(I)V

    move-object/from16 v4, v20

    move-wide/from16 v2, v24

    goto :goto_2

    .line 227
    .end local v2    # "codeBytes":Ljava/io/ByteArrayOutputStream;
    .restart local v23    # "codeBytes":Ljava/io/ByteArrayOutputStream;
    :cond_0
    move-object/from16 v2, v23

    .end local v23    # "codeBytes":Ljava/io/ByteArrayOutputStream;
    .restart local v2    # "codeBytes":Ljava/io/ByteArrayOutputStream;
    iget-object v4, v0, Lorg/apache/commons/compress/harmony/unpack200/BcBands;->methodByteCodePacked:[[[B

    aget-object v4, v4, v18

    invoke-virtual {v2}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v23

    aput-object v23, v4, v22

    .line 228
    iget-object v4, v0, Lorg/apache/commons/compress/harmony/unpack200/BcBands;->methodByteCodePacked:[[[B

    aget-object v4, v4, v18

    aget-object v4, v4, v22

    array-length v4, v4

    add-int v16, v16, v4

    .line 229
    iget-object v4, v0, Lorg/apache/commons/compress/harmony/unpack200/BcBands;->methodByteCodePacked:[[[B

    aget-object v4, v4, v18

    aget-object v4, v4, v22

    array-length v4, v4

    new-array v4, v4, [I

    .line 230
    .local v4, "codes":[I
    const/16 v23, 0x0

    move-object/from16 v27, v2

    move/from16 v2, v23

    .local v2, "i":I
    .local v27, "codeBytes":Ljava/io/ByteArrayOutputStream;
    :goto_3
    move/from16 v23, v3

    .end local v3    # "code":B
    .local v23, "code":B
    array-length v3, v4

    if-ge v2, v3, :cond_1

    .line 231
    iget-object v3, v0, Lorg/apache/commons/compress/harmony/unpack200/BcBands;->methodByteCodePacked:[[[B

    aget-object v3, v3, v18

    aget-object v3, v3, v22

    aget-byte v3, v3, v2

    and-int/lit16 v3, v3, 0xff

    aput v3, v4, v2

    .line 230
    add-int/lit8 v2, v2, 0x1

    move/from16 v3, v23

    goto :goto_3

    .line 233
    .end local v2    # "i":I
    :cond_1
    const/4 v2, 0x0

    .restart local v2    # "i":I
    :goto_4
    iget-object v3, v0, Lorg/apache/commons/compress/harmony/unpack200/BcBands;->methodByteCodePacked:[[[B

    aget-object v3, v3, v18

    aget-object v3, v3, v22

    array-length v3, v3

    if-ge v2, v3, :cond_8

    .line 234
    iget-object v3, v0, Lorg/apache/commons/compress/harmony/unpack200/BcBands;->methodByteCodePacked:[[[B

    aget-object v3, v3, v18

    aget-object v3, v3, v22

    aget-byte v3, v3, v2

    and-int/lit16 v3, v3, 0xff

    .line 235
    .local v3, "codePacked":I
    sparse-switch v3, :sswitch_data_0

    .line 370
    move/from16 v28, v2

    move-object/from16 v42, v4

    move/from16 v43, v5

    move-object/from16 v4, v31

    const/4 v5, 0x2

    .end local v2    # "i":I
    .end local v5    # "bcCaseCountCount":I
    .end local v31    # "switchIsTableSwitch":Ljava/util/List;, "Ljava/util/List<Ljava/lang/Boolean;>;"
    .local v4, "switchIsTableSwitch":Ljava/util/List;, "Ljava/util/List<Ljava/lang/Boolean;>;"
    .local v28, "i":I
    .local v42, "codes":[I
    .local v43, "bcCaseCountCount":I
    invoke-direct {v0, v3}, Lorg/apache/commons/compress/harmony/unpack200/BcBands;->endsWithLoad(I)Z

    move-result v2

    if-nez v2, :cond_7

    invoke-direct {v0, v3}, Lorg/apache/commons/compress/harmony/unpack200/BcBands;->endsWithStore(I)Z

    move-result v2

    if-eqz v2, :cond_5

    goto/16 :goto_8

    .line 367
    .end local v28    # "i":I
    .end local v42    # "codes":[I
    .end local v43    # "bcCaseCountCount":I
    .restart local v2    # "i":I
    .local v4, "codes":[I
    .restart local v5    # "bcCaseCountCount":I
    .restart local v31    # "switchIsTableSwitch":Ljava/util/List;, "Ljava/util/List<Ljava/lang/Boolean;>;"
    :sswitch_0
    add-int/lit8 v40, v40, 0x1

    .line 368
    move-object/from16 v42, v4

    move/from16 v43, v5

    move-object/from16 v4, v31

    const/4 v5, 0x2

    goto/16 :goto_9

    .line 364
    :sswitch_1
    add-int/lit8 v41, v41, 0x1

    .line 365
    move-object/from16 v42, v4

    move/from16 v43, v5

    move-object/from16 v4, v31

    const/4 v5, 0x2

    goto/16 :goto_9

    .line 270
    :sswitch_2
    add-int/lit8 v15, v15, 0x1

    .line 271
    move-object/from16 v42, v4

    move/from16 v43, v5

    move-object/from16 v4, v31

    const/4 v5, 0x2

    goto/16 :goto_9

    .line 253
    :sswitch_3
    add-int/lit8 v13, v13, 0x1

    .line 254
    move-object/from16 v42, v4

    move/from16 v43, v5

    move-object/from16 v4, v31

    const/4 v5, 0x2

    goto/16 :goto_9

    .line 249
    :sswitch_4
    add-int/lit8 v12, v12, 0x1

    .line 250
    move-object/from16 v42, v4

    move/from16 v43, v5

    move-object/from16 v4, v31

    const/4 v5, 0x2

    goto/16 :goto_9

    .line 361
    :sswitch_5
    add-int/lit8 v39, v39, 0x1

    .line 362
    move-object/from16 v42, v4

    move/from16 v43, v5

    move-object/from16 v4, v31

    const/4 v5, 0x2

    goto/16 :goto_9

    .line 339
    :sswitch_6
    add-int/lit8 v38, v38, 0x1

    .line 340
    move-object/from16 v42, v4

    move/from16 v43, v5

    move-object/from16 v4, v31

    const/4 v5, 0x2

    goto/16 :goto_9

    .line 331
    :sswitch_7
    add-int/lit8 v36, v36, 0x1

    .line 332
    move-object/from16 v42, v4

    move/from16 v43, v5

    move-object/from16 v4, v31

    const/4 v5, 0x2

    goto/16 :goto_9

    .line 321
    :sswitch_8
    add-int/lit8 v37, v37, 0x1

    .line 322
    move-object/from16 v42, v4

    move/from16 v43, v5

    move-object/from16 v4, v31

    const/4 v5, 0x2

    goto/16 :goto_9

    .line 313
    :sswitch_9
    add-int/lit8 v35, v35, 0x1

    .line 314
    move-object/from16 v42, v4

    move/from16 v43, v5

    move-object/from16 v4, v31

    const/4 v5, 0x2

    goto/16 :goto_9

    .line 256
    :sswitch_a
    add-int/lit8 v8, v8, 0x1

    move/from16 v28, v2

    move-object/from16 v42, v4

    move/from16 v43, v5

    const/4 v5, 0x2

    goto/16 :goto_7

    .line 346
    :sswitch_b
    move/from16 v28, v2

    .end local v2    # "i":I
    .restart local v28    # "i":I
    iget-object v2, v0, Lorg/apache/commons/compress/harmony/unpack200/BcBands;->methodByteCodePacked:[[[B

    aget-object v2, v2, v18

    aget-object v2, v2, v22

    add-int/lit8 v42, v28, 0x1

    aget-byte v2, v2, v42

    and-int/lit16 v2, v2, 0xff

    .line 347
    .local v2, "nextInstruction":I
    move-object/from16 v42, v4

    .end local v4    # "codes":[I
    .restart local v42    # "codes":[I
    iget-object v4, v0, Lorg/apache/commons/compress/harmony/unpack200/BcBands;->wideByteCodes:Ljava/util/List;

    move/from16 v43, v5

    .end local v5    # "bcCaseCountCount":I
    .restart local v43    # "bcCaseCountCount":I
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v4, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 348
    const/16 v4, 0x84

    if-ne v2, v4, :cond_2

    .line 349
    add-int/lit8 v10, v10, 0x1

    .line 350
    add-int/lit8 v9, v9, 0x1

    move/from16 v44, v2

    const/4 v5, 0x2

    goto :goto_6

    .line 351
    :cond_2
    invoke-direct {v0, v2}, Lorg/apache/commons/compress/harmony/unpack200/BcBands;->endsWithLoad(I)Z

    move-result v4

    if-nez v4, :cond_4

    invoke-direct {v0, v2}, Lorg/apache/commons/compress/harmony/unpack200/BcBands;->endsWithStore(I)Z

    move-result v4

    if-nez v4, :cond_4

    const/16 v4, 0xa9

    if-ne v2, v4, :cond_3

    move/from16 v44, v2

    const/4 v5, 0x2

    goto :goto_5

    .line 354
    :cond_3
    iget-object v4, v0, Lorg/apache/commons/compress/harmony/unpack200/BcBands;->segment:Lorg/apache/commons/compress/harmony/unpack200/Segment;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    move/from16 v44, v2

    .end local v2    # "nextInstruction":I
    .local v44, "nextInstruction":I
    const-string v2, "Found unhandled "

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static/range {v44 .. v44}, Lorg/apache/commons/compress/harmony/unpack200/bytecode/ByteCode;->getByteCode(I)Lorg/apache/commons/compress/harmony/unpack200/bytecode/ByteCode;

    move-result-object v5

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v5, 0x2

    invoke-virtual {v4, v5, v2}, Lorg/apache/commons/compress/harmony/unpack200/Segment;->log(ILjava/lang/String;)V

    goto :goto_6

    .line 351
    .end local v44    # "nextInstruction":I
    .restart local v2    # "nextInstruction":I
    :cond_4
    move/from16 v44, v2

    const/4 v5, 0x2

    .line 352
    .end local v2    # "nextInstruction":I
    .restart local v44    # "nextInstruction":I
    :goto_5
    add-int/lit8 v10, v10, 0x1

    .line 356
    :goto_6
    add-int/lit8 v2, v28, 0x1

    .line 357
    .end local v28    # "i":I
    .local v2, "i":I
    move-object/from16 v4, v31

    goto/16 :goto_9

    .line 235
    .end local v42    # "codes":[I
    .end local v43    # "bcCaseCountCount":I
    .end local v44    # "nextInstruction":I
    .restart local v4    # "codes":[I
    .restart local v5    # "bcCaseCountCount":I
    :sswitch_c
    move/from16 v28, v2

    move-object/from16 v42, v4

    move/from16 v43, v5

    const/4 v5, 0x2

    .line 264
    .end local v2    # "i":I
    .end local v4    # "codes":[I
    .end local v5    # "bcCaseCountCount":I
    .restart local v28    # "i":I
    .restart local v42    # "codes":[I
    .restart local v43    # "bcCaseCountCount":I
    :goto_7
    add-int/lit8 v11, v11, 0x1

    .line 265
    move/from16 v2, v28

    move-object/from16 v4, v31

    goto/16 :goto_9

    .line 303
    .end local v28    # "i":I
    .end local v42    # "codes":[I
    .end local v43    # "bcCaseCountCount":I
    .restart local v2    # "i":I
    .restart local v4    # "codes":[I
    .restart local v5    # "bcCaseCountCount":I
    :sswitch_d
    move/from16 v28, v2

    move-object/from16 v42, v4

    move/from16 v43, v5

    const/4 v5, 0x2

    .end local v2    # "i":I
    .end local v4    # "codes":[I
    .end local v5    # "bcCaseCountCount":I
    .restart local v28    # "i":I
    .restart local v42    # "codes":[I
    .restart local v43    # "bcCaseCountCount":I
    add-int/lit8 v34, v34, 0x1

    .line 304
    move-object/from16 v4, v31

    goto/16 :goto_9

    .line 300
    .end local v28    # "i":I
    .end local v42    # "codes":[I
    .end local v43    # "bcCaseCountCount":I
    .restart local v2    # "i":I
    .restart local v4    # "codes":[I
    .restart local v5    # "bcCaseCountCount":I
    :sswitch_e
    move/from16 v28, v2

    move-object/from16 v42, v4

    move/from16 v43, v5

    const/4 v5, 0x2

    .end local v2    # "i":I
    .end local v4    # "codes":[I
    .end local v5    # "bcCaseCountCount":I
    .restart local v28    # "i":I
    .restart local v42    # "codes":[I
    .restart local v43    # "bcCaseCountCount":I
    add-int/lit8 v33, v33, 0x1

    .line 301
    move-object/from16 v4, v31

    goto/16 :goto_9

    .line 295
    .end local v28    # "i":I
    .end local v42    # "codes":[I
    .end local v43    # "bcCaseCountCount":I
    .restart local v2    # "i":I
    .restart local v4    # "codes":[I
    .restart local v5    # "bcCaseCountCount":I
    :sswitch_f
    move/from16 v28, v2

    move-object/from16 v42, v4

    move/from16 v43, v5

    const/4 v5, 0x2

    .end local v2    # "i":I
    .end local v4    # "codes":[I
    .end local v5    # "bcCaseCountCount":I
    .restart local v28    # "i":I
    .restart local v42    # "codes":[I
    .restart local v43    # "bcCaseCountCount":I
    add-int/lit8 v32, v32, 0x1

    .line 296
    move-object/from16 v4, v31

    goto/16 :goto_9

    .line 287
    .end local v28    # "i":I
    .end local v42    # "codes":[I
    .end local v43    # "bcCaseCountCount":I
    .restart local v2    # "i":I
    .restart local v4    # "codes":[I
    .restart local v5    # "bcCaseCountCount":I
    :sswitch_10
    move/from16 v28, v2

    move-object/from16 v42, v4

    move/from16 v43, v5

    const/4 v5, 0x2

    .end local v2    # "i":I
    .end local v4    # "codes":[I
    .end local v5    # "bcCaseCountCount":I
    .restart local v28    # "i":I
    .restart local v42    # "codes":[I
    .restart local v43    # "bcCaseCountCount":I
    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    move-object/from16 v4, v31

    .end local v31    # "switchIsTableSwitch":Ljava/util/List;, "Ljava/util/List<Ljava/lang/Boolean;>;"
    .local v4, "switchIsTableSwitch":Ljava/util/List;, "Ljava/util/List<Ljava/lang/Boolean;>;"
    invoke-interface {v4, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 288
    add-int/lit8 v2, v43, 0x1

    .line 289
    .end local v43    # "bcCaseCountCount":I
    .local v2, "bcCaseCountCount":I
    add-int/lit8 v17, v17, 0x1

    .line 290
    move/from16 v43, v2

    move/from16 v2, v28

    goto/16 :goto_9

    .line 282
    .end local v28    # "i":I
    .end local v42    # "codes":[I
    .local v2, "i":I
    .local v4, "codes":[I
    .restart local v5    # "bcCaseCountCount":I
    .restart local v31    # "switchIsTableSwitch":Ljava/util/List;, "Ljava/util/List<Ljava/lang/Boolean;>;"
    :sswitch_11
    move/from16 v28, v2

    move-object/from16 v42, v4

    move/from16 v43, v5

    move-object/from16 v4, v31

    const/4 v5, 0x2

    .end local v2    # "i":I
    .end local v5    # "bcCaseCountCount":I
    .end local v31    # "switchIsTableSwitch":Ljava/util/List;, "Ljava/util/List<Ljava/lang/Boolean;>;"
    .local v4, "switchIsTableSwitch":Ljava/util/List;, "Ljava/util/List<Ljava/lang/Boolean;>;"
    .restart local v28    # "i":I
    .restart local v42    # "codes":[I
    .restart local v43    # "bcCaseCountCount":I
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {v4, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 283
    add-int/lit8 v2, v43, 0x1

    .line 284
    .end local v43    # "bcCaseCountCount":I
    .local v2, "bcCaseCountCount":I
    add-int/lit8 v17, v17, 0x1

    .line 285
    move/from16 v43, v2

    move/from16 v2, v28

    goto/16 :goto_9

    .line 273
    .end local v28    # "i":I
    .end local v42    # "codes":[I
    .local v2, "i":I
    .local v4, "codes":[I
    .restart local v5    # "bcCaseCountCount":I
    .restart local v31    # "switchIsTableSwitch":Ljava/util/List;, "Ljava/util/List<Ljava/lang/Boolean;>;"
    :sswitch_12
    move/from16 v28, v2

    move-object/from16 v42, v4

    move/from16 v43, v5

    move-object/from16 v4, v31

    const/4 v5, 0x2

    .end local v2    # "i":I
    .end local v5    # "bcCaseCountCount":I
    .end local v31    # "switchIsTableSwitch":Ljava/util/List;, "Ljava/util/List<Ljava/lang/Boolean;>;"
    .local v4, "switchIsTableSwitch":Ljava/util/List;, "Ljava/util/List<Ljava/lang/Boolean;>;"
    .restart local v28    # "i":I
    .restart local v42    # "codes":[I
    .restart local v43    # "bcCaseCountCount":I
    add-int/lit8 v10, v10, 0x1

    .line 274
    goto/16 :goto_9

    .line 279
    .end local v28    # "i":I
    .end local v42    # "codes":[I
    .end local v43    # "bcCaseCountCount":I
    .restart local v2    # "i":I
    .local v4, "codes":[I
    .restart local v5    # "bcCaseCountCount":I
    .restart local v31    # "switchIsTableSwitch":Ljava/util/List;, "Ljava/util/List<Ljava/lang/Boolean;>;"
    :sswitch_13
    move/from16 v28, v2

    move-object/from16 v42, v4

    move/from16 v43, v5

    move-object/from16 v4, v31

    const/4 v5, 0x2

    .end local v2    # "i":I
    .end local v5    # "bcCaseCountCount":I
    .end local v31    # "switchIsTableSwitch":Ljava/util/List;, "Ljava/util/List<Ljava/lang/Boolean;>;"
    .local v4, "switchIsTableSwitch":Ljava/util/List;, "Ljava/util/List<Ljava/lang/Boolean;>;"
    .restart local v28    # "i":I
    .restart local v42    # "codes":[I
    .restart local v43    # "bcCaseCountCount":I
    add-int/lit8 v17, v17, 0x1

    .line 280
    goto :goto_9

    .line 342
    .end local v28    # "i":I
    .end local v42    # "codes":[I
    .end local v43    # "bcCaseCountCount":I
    .restart local v2    # "i":I
    .local v4, "codes":[I
    .restart local v5    # "bcCaseCountCount":I
    .restart local v31    # "switchIsTableSwitch":Ljava/util/List;, "Ljava/util/List<Ljava/lang/Boolean;>;"
    :sswitch_14
    move/from16 v28, v2

    move-object/from16 v42, v4

    move/from16 v43, v5

    move-object/from16 v4, v31

    const/4 v5, 0x2

    .end local v2    # "i":I
    .end local v5    # "bcCaseCountCount":I
    .end local v31    # "switchIsTableSwitch":Ljava/util/List;, "Ljava/util/List<Ljava/lang/Boolean;>;"
    .local v4, "switchIsTableSwitch":Ljava/util/List;, "Ljava/util/List<Ljava/lang/Boolean;>;"
    .restart local v28    # "i":I
    .restart local v42    # "codes":[I
    .restart local v43    # "bcCaseCountCount":I
    add-int/lit8 v10, v10, 0x1

    .line 343
    add-int/lit8 v8, v8, 0x1

    .line 344
    goto :goto_9

    .line 267
    .end local v28    # "i":I
    .end local v42    # "codes":[I
    .end local v43    # "bcCaseCountCount":I
    .restart local v2    # "i":I
    .local v4, "codes":[I
    .restart local v5    # "bcCaseCountCount":I
    .restart local v31    # "switchIsTableSwitch":Ljava/util/List;, "Ljava/util/List<Ljava/lang/Boolean;>;"
    :sswitch_15
    move/from16 v28, v2

    move-object/from16 v42, v4

    move/from16 v43, v5

    move-object/from16 v4, v31

    const/4 v5, 0x2

    .end local v2    # "i":I
    .end local v5    # "bcCaseCountCount":I
    .end local v31    # "switchIsTableSwitch":Ljava/util/List;, "Ljava/util/List<Ljava/lang/Boolean;>;"
    .local v4, "switchIsTableSwitch":Ljava/util/List;, "Ljava/util/List<Ljava/lang/Boolean;>;"
    .restart local v28    # "i":I
    .restart local v42    # "codes":[I
    .restart local v43    # "bcCaseCountCount":I
    add-int/lit8 v14, v14, 0x1

    .line 268
    goto :goto_9

    .line 245
    .end local v28    # "i":I
    .end local v42    # "codes":[I
    .end local v43    # "bcCaseCountCount":I
    .restart local v2    # "i":I
    .local v4, "codes":[I
    .restart local v5    # "bcCaseCountCount":I
    .restart local v31    # "switchIsTableSwitch":Ljava/util/List;, "Ljava/util/List<Ljava/lang/Boolean;>;"
    :sswitch_16
    move/from16 v28, v2

    move-object/from16 v42, v4

    move/from16 v43, v5

    move-object/from16 v4, v31

    const/4 v5, 0x2

    .end local v2    # "i":I
    .end local v5    # "bcCaseCountCount":I
    .end local v31    # "switchIsTableSwitch":Ljava/util/List;, "Ljava/util/List<Ljava/lang/Boolean;>;"
    .local v4, "switchIsTableSwitch":Ljava/util/List;, "Ljava/util/List<Ljava/lang/Boolean;>;"
    .restart local v28    # "i":I
    .restart local v42    # "codes":[I
    .restart local v43    # "bcCaseCountCount":I
    add-int/lit8 v7, v7, 0x1

    .line 246
    goto :goto_9

    .line 241
    .end local v28    # "i":I
    .end local v42    # "codes":[I
    .end local v43    # "bcCaseCountCount":I
    .restart local v2    # "i":I
    .local v4, "codes":[I
    .restart local v5    # "bcCaseCountCount":I
    .restart local v31    # "switchIsTableSwitch":Ljava/util/List;, "Ljava/util/List<Ljava/lang/Boolean;>;"
    :sswitch_17
    move/from16 v28, v2

    move-object/from16 v42, v4

    move/from16 v43, v5

    move-object/from16 v4, v31

    const/4 v5, 0x2

    .end local v2    # "i":I
    .end local v5    # "bcCaseCountCount":I
    .end local v31    # "switchIsTableSwitch":Ljava/util/List;, "Ljava/util/List<Ljava/lang/Boolean;>;"
    .local v4, "switchIsTableSwitch":Ljava/util/List;, "Ljava/util/List<Ljava/lang/Boolean;>;"
    .restart local v28    # "i":I
    .restart local v42    # "codes":[I
    .restart local v43    # "bcCaseCountCount":I
    add-int/lit8 v9, v9, 0x1

    .line 242
    goto :goto_9

    .line 238
    .end local v28    # "i":I
    .end local v42    # "codes":[I
    .end local v43    # "bcCaseCountCount":I
    .restart local v2    # "i":I
    .local v4, "codes":[I
    .restart local v5    # "bcCaseCountCount":I
    .restart local v31    # "switchIsTableSwitch":Ljava/util/List;, "Ljava/util/List<Ljava/lang/Boolean;>;"
    :sswitch_18
    move/from16 v28, v2

    move-object/from16 v42, v4

    move/from16 v43, v5

    move-object/from16 v4, v31

    const/4 v5, 0x2

    .end local v2    # "i":I
    .end local v5    # "bcCaseCountCount":I
    .end local v31    # "switchIsTableSwitch":Ljava/util/List;, "Ljava/util/List<Ljava/lang/Boolean;>;"
    .local v4, "switchIsTableSwitch":Ljava/util/List;, "Ljava/util/List<Ljava/lang/Boolean;>;"
    .restart local v28    # "i":I
    .restart local v42    # "codes":[I
    .restart local v43    # "bcCaseCountCount":I
    add-int/lit8 v8, v8, 0x1

    .line 239
    goto :goto_9

    .line 372
    :cond_5
    invoke-direct {v0, v3}, Lorg/apache/commons/compress/harmony/unpack200/BcBands;->startsWithIf(I)Z

    move-result v2

    if-eqz v2, :cond_6

    .line 373
    add-int/lit8 v17, v17, 0x1

    move/from16 v2, v28

    goto :goto_9

    .line 372
    :cond_6
    move/from16 v2, v28

    goto :goto_9

    .line 371
    :cond_7
    :goto_8
    add-int/lit8 v10, v10, 0x1

    move/from16 v2, v28

    .line 233
    .end local v3    # "codePacked":I
    .end local v28    # "i":I
    .restart local v2    # "i":I
    :goto_9
    add-int/lit8 v2, v2, 0x1

    move-object/from16 v31, v4

    move-object/from16 v4, v42

    move/from16 v5, v43

    goto/16 :goto_4

    .end local v42    # "codes":[I
    .end local v43    # "bcCaseCountCount":I
    .local v4, "codes":[I
    .restart local v5    # "bcCaseCountCount":I
    .restart local v31    # "switchIsTableSwitch":Ljava/util/List;, "Ljava/util/List<Ljava/lang/Boolean;>;"
    :cond_8
    move/from16 v28, v2

    move-object/from16 v42, v4

    move/from16 v43, v5

    move-object/from16 v4, v31

    const/4 v5, 0x2

    .end local v2    # "i":I
    .end local v5    # "bcCaseCountCount":I
    .end local v31    # "switchIsTableSwitch":Ljava/util/List;, "Ljava/util/List<Ljava/lang/Boolean;>;"
    .local v4, "switchIsTableSwitch":Ljava/util/List;, "Ljava/util/List<Ljava/lang/Boolean;>;"
    .restart local v28    # "i":I
    .restart local v42    # "codes":[I
    .restart local v43    # "bcCaseCountCount":I
    move/from16 v29, v5

    move/from16 v5, v43

    goto :goto_a

    .line 221
    .end local v20    # "abstractModifier":Lorg/apache/commons/compress/harmony/unpack200/AttributeLayout;
    .end local v23    # "code":B
    .end local v24    # "methodFlag":J
    .end local v27    # "codeBytes":Ljava/io/ByteArrayOutputStream;
    .end local v28    # "i":I
    .end local v42    # "codes":[I
    .end local v43    # "bcCaseCountCount":I
    .local v2, "methodFlag":J
    .local v4, "abstractModifier":Lorg/apache/commons/compress/harmony/unpack200/AttributeLayout;
    .restart local v5    # "bcCaseCountCount":I
    .restart local v31    # "switchIsTableSwitch":Ljava/util/List;, "Ljava/util/List<Ljava/lang/Boolean;>;"
    :cond_9
    move-wide/from16 v24, v2

    move-object/from16 v20, v4

    move-object/from16 v4, v31

    const/16 v29, 0x2

    .line 219
    .end local v2    # "methodFlag":J
    .end local v31    # "switchIsTableSwitch":Ljava/util/List;, "Ljava/util/List<Ljava/lang/Boolean;>;"
    .local v4, "switchIsTableSwitch":Ljava/util/List;, "Ljava/util/List<Ljava/lang/Boolean;>;"
    .restart local v20    # "abstractModifier":Lorg/apache/commons/compress/harmony/unpack200/AttributeLayout;
    :goto_a
    add-int/lit8 v3, v22, 0x1

    move-object/from16 v31, v4

    move-object/from16 v4, v20

    move/from16 v2, v21

    .end local v22    # "m":I
    .local v3, "m":I
    goto/16 :goto_1

    .end local v20    # "abstractModifier":Lorg/apache/commons/compress/harmony/unpack200/AttributeLayout;
    .end local v21    # "numberOfMethods":I
    .local v2, "numberOfMethods":I
    .local v4, "abstractModifier":Lorg/apache/commons/compress/harmony/unpack200/AttributeLayout;
    .restart local v31    # "switchIsTableSwitch":Ljava/util/List;, "Ljava/util/List<Ljava/lang/Boolean;>;"
    :cond_a
    move/from16 v21, v2

    move/from16 v22, v3

    move-object/from16 v20, v4

    move-object/from16 v4, v31

    const/16 v29, 0x2

    .line 216
    .end local v2    # "numberOfMethods":I
    .end local v3    # "m":I
    .end local v31    # "switchIsTableSwitch":Ljava/util/List;, "Ljava/util/List<Ljava/lang/Boolean;>;"
    .local v4, "switchIsTableSwitch":Ljava/util/List;, "Ljava/util/List<Ljava/lang/Boolean;>;"
    .restart local v20    # "abstractModifier":Lorg/apache/commons/compress/harmony/unpack200/AttributeLayout;
    add-int/lit8 v2, v18, 0x1

    move/from16 v3, v19

    move-object/from16 v4, v20

    .end local v18    # "c":I
    .local v2, "c":I
    goto/16 :goto_0

    .end local v19    # "classCount":I
    .end local v20    # "abstractModifier":Lorg/apache/commons/compress/harmony/unpack200/AttributeLayout;
    .local v3, "classCount":I
    .local v4, "abstractModifier":Lorg/apache/commons/compress/harmony/unpack200/AttributeLayout;
    .restart local v31    # "switchIsTableSwitch":Ljava/util/List;, "Ljava/util/List<Ljava/lang/Boolean;>;"
    :cond_b
    move/from16 v18, v2

    move/from16 v19, v3

    move-object/from16 v20, v4

    move-object/from16 v4, v31

    .line 381
    .end local v2    # "c":I
    .end local v3    # "classCount":I
    .end local v31    # "switchIsTableSwitch":Ljava/util/List;, "Ljava/util/List<Ljava/lang/Boolean;>;"
    .local v4, "switchIsTableSwitch":Ljava/util/List;, "Ljava/util/List<Ljava/lang/Boolean;>;"
    .restart local v19    # "classCount":I
    .restart local v20    # "abstractModifier":Lorg/apache/commons/compress/harmony/unpack200/AttributeLayout;
    const-string v2, "bc_case_count"

    sget-object v3, Lorg/apache/commons/compress/harmony/pack200/Codec;->UNSIGNED5:Lorg/apache/commons/compress/harmony/pack200/BHSDCodec;

    invoke-virtual {v0, v2, v1, v3, v5}, Lorg/apache/commons/compress/harmony/unpack200/BcBands;->decodeBandInt(Ljava/lang/String;Ljava/io/InputStream;Lorg/apache/commons/compress/harmony/pack200/BHSDCodec;I)[I

    move-result-object v2

    iput-object v2, v0, Lorg/apache/commons/compress/harmony/unpack200/BcBands;->bcCaseCount:[I

    .line 382
    const/4 v2, 0x0

    .line 383
    .local v2, "bcCaseValueCount":I
    const/4 v3, 0x0

    .local v3, "i":I
    :goto_b
    move-object/from16 v18, v6

    .end local v6    # "nativeModifier":Lorg/apache/commons/compress/harmony/unpack200/AttributeLayout;
    .local v18, "nativeModifier":Lorg/apache/commons/compress/harmony/unpack200/AttributeLayout;
    iget-object v6, v0, Lorg/apache/commons/compress/harmony/unpack200/BcBands;->bcCaseCount:[I

    array-length v6, v6

    if-ge v3, v6, :cond_d

    .line 384
    invoke-interface {v4, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Boolean;

    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v6

    .line 385
    .local v6, "isTableSwitch":Z
    if-eqz v6, :cond_c

    .line 386
    add-int/lit8 v2, v2, 0x1

    move/from16 v21, v3

    goto :goto_c

    .line 388
    :cond_c
    move/from16 v21, v3

    .end local v3    # "i":I
    .local v21, "i":I
    iget-object v3, v0, Lorg/apache/commons/compress/harmony/unpack200/BcBands;->bcCaseCount:[I

    aget v3, v3, v21

    add-int/2addr v2, v3

    .line 383
    .end local v6    # "isTableSwitch":Z
    :goto_c
    add-int/lit8 v3, v21, 0x1

    move-object/from16 v6, v18

    .end local v21    # "i":I
    .restart local v3    # "i":I
    goto :goto_b

    :cond_d
    move/from16 v21, v3

    .line 391
    .end local v3    # "i":I
    const-string v3, "bc_case_value"

    sget-object v6, Lorg/apache/commons/compress/harmony/pack200/Codec;->DELTA5:Lorg/apache/commons/compress/harmony/pack200/BHSDCodec;

    invoke-virtual {v0, v3, v1, v6, v2}, Lorg/apache/commons/compress/harmony/unpack200/BcBands;->decodeBandInt(Ljava/lang/String;Ljava/io/InputStream;Lorg/apache/commons/compress/harmony/pack200/BHSDCodec;I)[I

    move-result-object v3

    iput-object v3, v0, Lorg/apache/commons/compress/harmony/unpack200/BcBands;->bcCaseValue:[I

    .line 395
    const/4 v3, 0x0

    move/from16 v6, v17

    .end local v17    # "bcLabelCount":I
    .local v3, "index":I
    .local v6, "bcLabelCount":I
    :goto_d
    if-ge v3, v5, :cond_e

    .line 396
    move/from16 v17, v2

    .end local v2    # "bcCaseValueCount":I
    .local v17, "bcCaseValueCount":I
    iget-object v2, v0, Lorg/apache/commons/compress/harmony/unpack200/BcBands;->bcCaseCount:[I

    aget v2, v2, v3

    add-int/2addr v6, v2

    .line 395
    add-int/lit8 v3, v3, 0x1

    move/from16 v2, v17

    goto :goto_d

    .end local v17    # "bcCaseValueCount":I
    .restart local v2    # "bcCaseValueCount":I
    :cond_e
    move/from16 v17, v2

    .line 398
    .end local v2    # "bcCaseValueCount":I
    .end local v3    # "index":I
    .restart local v17    # "bcCaseValueCount":I
    const-string v2, "bc_byte"

    sget-object v3, Lorg/apache/commons/compress/harmony/pack200/Codec;->BYTE1:Lorg/apache/commons/compress/harmony/pack200/BHSDCodec;

    invoke-virtual {v0, v2, v1, v3, v8}, Lorg/apache/commons/compress/harmony/unpack200/BcBands;->decodeBandInt(Ljava/lang/String;Ljava/io/InputStream;Lorg/apache/commons/compress/harmony/pack200/BHSDCodec;I)[I

    move-result-object v2

    iput-object v2, v0, Lorg/apache/commons/compress/harmony/unpack200/BcBands;->bcByte:[I

    .line 399
    const-string v2, "bc_short"

    sget-object v3, Lorg/apache/commons/compress/harmony/pack200/Codec;->DELTA5:Lorg/apache/commons/compress/harmony/pack200/BHSDCodec;

    invoke-virtual {v0, v2, v1, v3, v9}, Lorg/apache/commons/compress/harmony/unpack200/BcBands;->decodeBandInt(Ljava/lang/String;Ljava/io/InputStream;Lorg/apache/commons/compress/harmony/pack200/BHSDCodec;I)[I

    move-result-object v2

    iput-object v2, v0, Lorg/apache/commons/compress/harmony/unpack200/BcBands;->bcShort:[I

    .line 400
    const-string v2, "bc_local"

    sget-object v3, Lorg/apache/commons/compress/harmony/pack200/Codec;->UNSIGNED5:Lorg/apache/commons/compress/harmony/pack200/BHSDCodec;

    invoke-virtual {v0, v2, v1, v3, v10}, Lorg/apache/commons/compress/harmony/unpack200/BcBands;->decodeBandInt(Ljava/lang/String;Ljava/io/InputStream;Lorg/apache/commons/compress/harmony/pack200/BHSDCodec;I)[I

    move-result-object v2

    iput-object v2, v0, Lorg/apache/commons/compress/harmony/unpack200/BcBands;->bcLocal:[I

    .line 401
    const-string v2, "bc_label"

    sget-object v3, Lorg/apache/commons/compress/harmony/pack200/Codec;->BRANCH5:Lorg/apache/commons/compress/harmony/pack200/BHSDCodec;

    invoke-virtual {v0, v2, v1, v3, v6}, Lorg/apache/commons/compress/harmony/unpack200/BcBands;->decodeBandInt(Ljava/lang/String;Ljava/io/InputStream;Lorg/apache/commons/compress/harmony/pack200/BHSDCodec;I)[I

    move-result-object v2

    iput-object v2, v0, Lorg/apache/commons/compress/harmony/unpack200/BcBands;->bcLabel:[I

    .line 402
    const-string v2, "bc_intref"

    sget-object v3, Lorg/apache/commons/compress/harmony/pack200/Codec;->DELTA5:Lorg/apache/commons/compress/harmony/pack200/BHSDCodec;

    invoke-virtual {v0, v2, v1, v3, v12}, Lorg/apache/commons/compress/harmony/unpack200/BcBands;->decodeBandInt(Ljava/lang/String;Ljava/io/InputStream;Lorg/apache/commons/compress/harmony/pack200/BHSDCodec;I)[I

    move-result-object v2

    iput-object v2, v0, Lorg/apache/commons/compress/harmony/unpack200/BcBands;->bcIntRef:[I

    .line 403
    const-string v2, "bc_floatref"

    sget-object v3, Lorg/apache/commons/compress/harmony/pack200/Codec;->DELTA5:Lorg/apache/commons/compress/harmony/pack200/BHSDCodec;

    invoke-virtual {v0, v2, v1, v3, v13}, Lorg/apache/commons/compress/harmony/unpack200/BcBands;->decodeBandInt(Ljava/lang/String;Ljava/io/InputStream;Lorg/apache/commons/compress/harmony/pack200/BHSDCodec;I)[I

    move-result-object v2

    iput-object v2, v0, Lorg/apache/commons/compress/harmony/unpack200/BcBands;->bcFloatRef:[I

    .line 404
    const-string v2, "bc_longref"

    sget-object v3, Lorg/apache/commons/compress/harmony/pack200/Codec;->DELTA5:Lorg/apache/commons/compress/harmony/pack200/BHSDCodec;

    invoke-virtual {v0, v2, v1, v3, v14}, Lorg/apache/commons/compress/harmony/unpack200/BcBands;->decodeBandInt(Ljava/lang/String;Ljava/io/InputStream;Lorg/apache/commons/compress/harmony/pack200/BHSDCodec;I)[I

    move-result-object v2

    iput-object v2, v0, Lorg/apache/commons/compress/harmony/unpack200/BcBands;->bcLongRef:[I

    .line 405
    const-string v2, "bc_doubleref"

    sget-object v3, Lorg/apache/commons/compress/harmony/pack200/Codec;->DELTA5:Lorg/apache/commons/compress/harmony/pack200/BHSDCodec;

    invoke-virtual {v0, v2, v1, v3, v15}, Lorg/apache/commons/compress/harmony/unpack200/BcBands;->decodeBandInt(Ljava/lang/String;Ljava/io/InputStream;Lorg/apache/commons/compress/harmony/pack200/BHSDCodec;I)[I

    move-result-object v2

    iput-object v2, v0, Lorg/apache/commons/compress/harmony/unpack200/BcBands;->bcDoubleRef:[I

    .line 406
    const-string v2, "bc_stringref"

    sget-object v3, Lorg/apache/commons/compress/harmony/pack200/Codec;->DELTA5:Lorg/apache/commons/compress/harmony/pack200/BHSDCodec;

    invoke-virtual {v0, v2, v1, v3, v7}, Lorg/apache/commons/compress/harmony/unpack200/BcBands;->decodeBandInt(Ljava/lang/String;Ljava/io/InputStream;Lorg/apache/commons/compress/harmony/pack200/BHSDCodec;I)[I

    move-result-object v2

    iput-object v2, v0, Lorg/apache/commons/compress/harmony/unpack200/BcBands;->bcStringRef:[I

    .line 407
    const-string v2, "bc_classref"

    sget-object v3, Lorg/apache/commons/compress/harmony/pack200/Codec;->UNSIGNED5:Lorg/apache/commons/compress/harmony/pack200/BHSDCodec;

    invoke-virtual {v0, v2, v1, v3, v11}, Lorg/apache/commons/compress/harmony/unpack200/BcBands;->decodeBandInt(Ljava/lang/String;Ljava/io/InputStream;Lorg/apache/commons/compress/harmony/pack200/BHSDCodec;I)[I

    move-result-object v2

    iput-object v2, v0, Lorg/apache/commons/compress/harmony/unpack200/BcBands;->bcClassRef:[I

    .line 408
    const-string v2, "bc_fieldref"

    sget-object v3, Lorg/apache/commons/compress/harmony/pack200/Codec;->DELTA5:Lorg/apache/commons/compress/harmony/pack200/BHSDCodec;

    move-object/from16 v21, v4

    move/from16 v4, v32

    .end local v32    # "bcFieldRefCount":I
    .local v4, "bcFieldRefCount":I
    .local v21, "switchIsTableSwitch":Ljava/util/List;, "Ljava/util/List<Ljava/lang/Boolean;>;"
    invoke-virtual {v0, v2, v1, v3, v4}, Lorg/apache/commons/compress/harmony/unpack200/BcBands;->decodeBandInt(Ljava/lang/String;Ljava/io/InputStream;Lorg/apache/commons/compress/harmony/pack200/BHSDCodec;I)[I

    move-result-object v2

    iput-object v2, v0, Lorg/apache/commons/compress/harmony/unpack200/BcBands;->bcFieldRef:[I

    .line 409
    const-string v2, "bc_methodref"

    sget-object v3, Lorg/apache/commons/compress/harmony/pack200/Codec;->UNSIGNED5:Lorg/apache/commons/compress/harmony/pack200/BHSDCodec;

    move/from16 v22, v4

    move/from16 v4, v33

    .end local v33    # "bcMethodRefCount":I
    .local v4, "bcMethodRefCount":I
    .local v22, "bcFieldRefCount":I
    invoke-virtual {v0, v2, v1, v3, v4}, Lorg/apache/commons/compress/harmony/unpack200/BcBands;->decodeBandInt(Ljava/lang/String;Ljava/io/InputStream;Lorg/apache/commons/compress/harmony/pack200/BHSDCodec;I)[I

    move-result-object v2

    iput-object v2, v0, Lorg/apache/commons/compress/harmony/unpack200/BcBands;->bcMethodRef:[I

    .line 410
    const-string v2, "bc_imethodref"

    sget-object v3, Lorg/apache/commons/compress/harmony/pack200/Codec;->DELTA5:Lorg/apache/commons/compress/harmony/pack200/BHSDCodec;

    move/from16 v23, v4

    move/from16 v4, v34

    .end local v34    # "bcIMethodRefCount":I
    .local v4, "bcIMethodRefCount":I
    .local v23, "bcMethodRefCount":I
    invoke-virtual {v0, v2, v1, v3, v4}, Lorg/apache/commons/compress/harmony/unpack200/BcBands;->decodeBandInt(Ljava/lang/String;Ljava/io/InputStream;Lorg/apache/commons/compress/harmony/pack200/BHSDCodec;I)[I

    move-result-object v2

    iput-object v2, v0, Lorg/apache/commons/compress/harmony/unpack200/BcBands;->bcIMethodRef:[I

    .line 411
    const-string v2, "bc_thisfield"

    sget-object v3, Lorg/apache/commons/compress/harmony/pack200/Codec;->UNSIGNED5:Lorg/apache/commons/compress/harmony/pack200/BHSDCodec;

    move/from16 v24, v4

    move/from16 v4, v35

    .end local v35    # "bcThisFieldCount":I
    .local v4, "bcThisFieldCount":I
    .local v24, "bcIMethodRefCount":I
    invoke-virtual {v0, v2, v1, v3, v4}, Lorg/apache/commons/compress/harmony/unpack200/BcBands;->decodeBandInt(Ljava/lang/String;Ljava/io/InputStream;Lorg/apache/commons/compress/harmony/pack200/BHSDCodec;I)[I

    move-result-object v2

    iput-object v2, v0, Lorg/apache/commons/compress/harmony/unpack200/BcBands;->bcThisField:[I

    .line 412
    const-string v2, "bc_superfield"

    sget-object v3, Lorg/apache/commons/compress/harmony/pack200/Codec;->UNSIGNED5:Lorg/apache/commons/compress/harmony/pack200/BHSDCodec;

    move/from16 v25, v4

    move/from16 v4, v36

    .end local v36    # "bcSuperFieldCount":I
    .local v4, "bcSuperFieldCount":I
    .local v25, "bcThisFieldCount":I
    invoke-virtual {v0, v2, v1, v3, v4}, Lorg/apache/commons/compress/harmony/unpack200/BcBands;->decodeBandInt(Ljava/lang/String;Ljava/io/InputStream;Lorg/apache/commons/compress/harmony/pack200/BHSDCodec;I)[I

    move-result-object v2

    iput-object v2, v0, Lorg/apache/commons/compress/harmony/unpack200/BcBands;->bcSuperField:[I

    .line 413
    const-string v2, "bc_thismethod"

    sget-object v3, Lorg/apache/commons/compress/harmony/pack200/Codec;->UNSIGNED5:Lorg/apache/commons/compress/harmony/pack200/BHSDCodec;

    move/from16 v27, v4

    move/from16 v4, v37

    .end local v37    # "bcThisMethodCount":I
    .local v4, "bcThisMethodCount":I
    .local v27, "bcSuperFieldCount":I
    invoke-virtual {v0, v2, v1, v3, v4}, Lorg/apache/commons/compress/harmony/unpack200/BcBands;->decodeBandInt(Ljava/lang/String;Ljava/io/InputStream;Lorg/apache/commons/compress/harmony/pack200/BHSDCodec;I)[I

    move-result-object v2

    iput-object v2, v0, Lorg/apache/commons/compress/harmony/unpack200/BcBands;->bcThisMethod:[I

    .line 414
    const-string v2, "bc_supermethod"

    sget-object v3, Lorg/apache/commons/compress/harmony/pack200/Codec;->UNSIGNED5:Lorg/apache/commons/compress/harmony/pack200/BHSDCodec;

    move/from16 v28, v4

    move/from16 v4, v38

    .end local v38    # "bcSuperMethodCount":I
    .local v4, "bcSuperMethodCount":I
    .local v28, "bcThisMethodCount":I
    invoke-virtual {v0, v2, v1, v3, v4}, Lorg/apache/commons/compress/harmony/unpack200/BcBands;->decodeBandInt(Ljava/lang/String;Ljava/io/InputStream;Lorg/apache/commons/compress/harmony/pack200/BHSDCodec;I)[I

    move-result-object v2

    iput-object v2, v0, Lorg/apache/commons/compress/harmony/unpack200/BcBands;->bcSuperMethod:[I

    .line 415
    const-string v2, "bc_initref"

    sget-object v3, Lorg/apache/commons/compress/harmony/pack200/Codec;->UNSIGNED5:Lorg/apache/commons/compress/harmony/pack200/BHSDCodec;

    move/from16 v29, v4

    move/from16 v4, v39

    .end local v39    # "bcInitRefCount":I
    .local v4, "bcInitRefCount":I
    .local v29, "bcSuperMethodCount":I
    invoke-virtual {v0, v2, v1, v3, v4}, Lorg/apache/commons/compress/harmony/unpack200/BcBands;->decodeBandInt(Ljava/lang/String;Ljava/io/InputStream;Lorg/apache/commons/compress/harmony/pack200/BHSDCodec;I)[I

    move-result-object v2

    iput-object v2, v0, Lorg/apache/commons/compress/harmony/unpack200/BcBands;->bcInitRef:[I

    .line 416
    const-string v2, "bc_escref"

    sget-object v3, Lorg/apache/commons/compress/harmony/pack200/Codec;->UNSIGNED5:Lorg/apache/commons/compress/harmony/pack200/BHSDCodec;

    move/from16 v31, v4

    move/from16 v4, v41

    .end local v41    # "bcEscRefCount":I
    .local v4, "bcEscRefCount":I
    .local v31, "bcInitRefCount":I
    invoke-virtual {v0, v2, v1, v3, v4}, Lorg/apache/commons/compress/harmony/unpack200/BcBands;->decodeBandInt(Ljava/lang/String;Ljava/io/InputStream;Lorg/apache/commons/compress/harmony/pack200/BHSDCodec;I)[I

    move-result-object v2

    iput-object v2, v0, Lorg/apache/commons/compress/harmony/unpack200/BcBands;->bcEscRef:[I

    .line 417
    const-string v2, "bc_escrefsize"

    sget-object v3, Lorg/apache/commons/compress/harmony/pack200/Codec;->UNSIGNED5:Lorg/apache/commons/compress/harmony/pack200/BHSDCodec;

    invoke-virtual {v0, v2, v1, v3, v4}, Lorg/apache/commons/compress/harmony/unpack200/BcBands;->decodeBandInt(Ljava/lang/String;Ljava/io/InputStream;Lorg/apache/commons/compress/harmony/pack200/BHSDCodec;I)[I

    move-result-object v2

    iput-object v2, v0, Lorg/apache/commons/compress/harmony/unpack200/BcBands;->bcEscRefSize:[I

    .line 418
    const-string v2, "bc_escsize"

    sget-object v3, Lorg/apache/commons/compress/harmony/pack200/Codec;->UNSIGNED5:Lorg/apache/commons/compress/harmony/pack200/BHSDCodec;

    move/from16 v32, v4

    move/from16 v4, v40

    .end local v40    # "bcEscCount":I
    .local v4, "bcEscCount":I
    .local v32, "bcEscRefCount":I
    invoke-virtual {v0, v2, v1, v3, v4}, Lorg/apache/commons/compress/harmony/unpack200/BcBands;->decodeBandInt(Ljava/lang/String;Ljava/io/InputStream;Lorg/apache/commons/compress/harmony/pack200/BHSDCodec;I)[I

    move-result-object v2

    iput-object v2, v0, Lorg/apache/commons/compress/harmony/unpack200/BcBands;->bcEscSize:[I

    .line 419
    sget-object v2, Lorg/apache/commons/compress/harmony/pack200/Codec;->BYTE1:Lorg/apache/commons/compress/harmony/pack200/BHSDCodec;

    iget-object v3, v0, Lorg/apache/commons/compress/harmony/unpack200/BcBands;->bcEscSize:[I

    move/from16 v33, v4

    .end local v4    # "bcEscCount":I
    .local v33, "bcEscCount":I
    const-string v4, "bc_escbyte"

    invoke-virtual {v0, v4, v1, v2, v3}, Lorg/apache/commons/compress/harmony/unpack200/BcBands;->decodeBandInt(Ljava/lang/String;Ljava/io/InputStream;Lorg/apache/commons/compress/harmony/pack200/BHSDCodec;[I)[[I

    move-result-object v2

    iput-object v2, v0, Lorg/apache/commons/compress/harmony/unpack200/BcBands;->bcEscByte:[[I

    .line 420
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x10 -> :sswitch_18
        0x11 -> :sswitch_17
        0x12 -> :sswitch_16
        0x13 -> :sswitch_16
        0x14 -> :sswitch_15
        0x84 -> :sswitch_14
        0xa7 -> :sswitch_13
        0xa8 -> :sswitch_13
        0xa9 -> :sswitch_12
        0xaa -> :sswitch_11
        0xab -> :sswitch_10
        0xb2 -> :sswitch_f
        0xb3 -> :sswitch_f
        0xb4 -> :sswitch_f
        0xb5 -> :sswitch_f
        0xb6 -> :sswitch_e
        0xb7 -> :sswitch_e
        0xb8 -> :sswitch_e
        0xb9 -> :sswitch_d
        0xbb -> :sswitch_c
        0xbc -> :sswitch_18
        0xbd -> :sswitch_c
        0xc0 -> :sswitch_c
        0xc1 -> :sswitch_c
        0xc4 -> :sswitch_b
        0xc5 -> :sswitch_a
        0xc8 -> :sswitch_13
        0xc9 -> :sswitch_13
        0xca -> :sswitch_9
        0xcb -> :sswitch_9
        0xcc -> :sswitch_9
        0xcd -> :sswitch_9
        0xce -> :sswitch_8
        0xcf -> :sswitch_8
        0xd0 -> :sswitch_8
        0xd1 -> :sswitch_9
        0xd2 -> :sswitch_9
        0xd3 -> :sswitch_9
        0xd4 -> :sswitch_9
        0xd5 -> :sswitch_8
        0xd6 -> :sswitch_8
        0xd7 -> :sswitch_8
        0xd8 -> :sswitch_7
        0xd9 -> :sswitch_7
        0xda -> :sswitch_7
        0xdb -> :sswitch_7
        0xdc -> :sswitch_6
        0xdd -> :sswitch_6
        0xde -> :sswitch_6
        0xdf -> :sswitch_7
        0xe0 -> :sswitch_7
        0xe1 -> :sswitch_7
        0xe2 -> :sswitch_7
        0xe3 -> :sswitch_6
        0xe4 -> :sswitch_6
        0xe5 -> :sswitch_6
        0xe6 -> :sswitch_5
        0xe7 -> :sswitch_5
        0xe8 -> :sswitch_5
        0xe9 -> :sswitch_c
        0xea -> :sswitch_4
        0xeb -> :sswitch_3
        0xec -> :sswitch_c
        0xed -> :sswitch_4
        0xee -> :sswitch_3
        0xef -> :sswitch_2
        0xfd -> :sswitch_1
        0xfe -> :sswitch_0
    .end sparse-switch
.end method

.method public unpack()V
    .locals 40
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/commons/compress/harmony/pack200/Pack200Exception;
        }
    .end annotation

    .line 428
    move-object/from16 v0, p0

    iget-object v1, v0, Lorg/apache/commons/compress/harmony/unpack200/BcBands;->header:Lorg/apache/commons/compress/harmony/unpack200/SegmentHeader;

    invoke-virtual {v1}, Lorg/apache/commons/compress/harmony/unpack200/SegmentHeader;->getClassCount()I

    move-result v1

    .line 429
    .local v1, "classCount":I
    iget-object v2, v0, Lorg/apache/commons/compress/harmony/unpack200/BcBands;->segment:Lorg/apache/commons/compress/harmony/unpack200/Segment;

    invoke-virtual {v2}, Lorg/apache/commons/compress/harmony/unpack200/Segment;->getClassBands()Lorg/apache/commons/compress/harmony/unpack200/ClassBands;

    move-result-object v2

    invoke-virtual {v2}, Lorg/apache/commons/compress/harmony/unpack200/ClassBands;->getMethodFlags()[[J

    move-result-object v2

    .line 430
    .local v2, "methodFlags":[[J
    iget-object v3, v0, Lorg/apache/commons/compress/harmony/unpack200/BcBands;->segment:Lorg/apache/commons/compress/harmony/unpack200/Segment;

    invoke-virtual {v3}, Lorg/apache/commons/compress/harmony/unpack200/Segment;->getClassBands()Lorg/apache/commons/compress/harmony/unpack200/ClassBands;

    move-result-object v3

    invoke-virtual {v3}, Lorg/apache/commons/compress/harmony/unpack200/ClassBands;->getCodeMaxNALocals()[I

    move-result-object v3

    .line 431
    .local v3, "codeMaxNALocals":[I
    iget-object v4, v0, Lorg/apache/commons/compress/harmony/unpack200/BcBands;->segment:Lorg/apache/commons/compress/harmony/unpack200/Segment;

    invoke-virtual {v4}, Lorg/apache/commons/compress/harmony/unpack200/Segment;->getClassBands()Lorg/apache/commons/compress/harmony/unpack200/ClassBands;

    move-result-object v4

    invoke-virtual {v4}, Lorg/apache/commons/compress/harmony/unpack200/ClassBands;->getCodeMaxStack()[I

    move-result-object v4

    .line 432
    .local v4, "codeMaxStack":[I
    iget-object v5, v0, Lorg/apache/commons/compress/harmony/unpack200/BcBands;->segment:Lorg/apache/commons/compress/harmony/unpack200/Segment;

    invoke-virtual {v5}, Lorg/apache/commons/compress/harmony/unpack200/Segment;->getClassBands()Lorg/apache/commons/compress/harmony/unpack200/ClassBands;

    move-result-object v5

    invoke-virtual {v5}, Lorg/apache/commons/compress/harmony/unpack200/ClassBands;->getMethodAttributes()[[Ljava/util/ArrayList;

    move-result-object v5

    .line 433
    .local v5, "methodAttributes":[[Ljava/util/ArrayList;, "[[Ljava/util/ArrayList<Lorg/apache/commons/compress/harmony/unpack200/bytecode/Attribute;>;"
    iget-object v6, v0, Lorg/apache/commons/compress/harmony/unpack200/BcBands;->segment:Lorg/apache/commons/compress/harmony/unpack200/Segment;

    invoke-virtual {v6}, Lorg/apache/commons/compress/harmony/unpack200/Segment;->getClassBands()Lorg/apache/commons/compress/harmony/unpack200/ClassBands;

    move-result-object v6

    invoke-virtual {v6}, Lorg/apache/commons/compress/harmony/unpack200/ClassBands;->getMethodDescr()[[Ljava/lang/String;

    move-result-object v6

    .line 435
    .local v6, "methodDescr":[[Ljava/lang/String;
    iget-object v7, v0, Lorg/apache/commons/compress/harmony/unpack200/BcBands;->segment:Lorg/apache/commons/compress/harmony/unpack200/Segment;

    invoke-virtual {v7}, Lorg/apache/commons/compress/harmony/unpack200/Segment;->getAttrDefinitionBands()Lorg/apache/commons/compress/harmony/unpack200/AttrDefinitionBands;

    move-result-object v7

    invoke-virtual {v7}, Lorg/apache/commons/compress/harmony/unpack200/AttrDefinitionBands;->getAttributeDefinitionMap()Lorg/apache/commons/compress/harmony/unpack200/AttributeLayoutMap;

    move-result-object v7

    .line 437
    .local v7, "attributeDefinitionMap":Lorg/apache/commons/compress/harmony/unpack200/AttributeLayoutMap;
    const-string v8, "ACC_ABSTRACT"

    const/4 v9, 0x2

    invoke-virtual {v7, v8, v9}, Lorg/apache/commons/compress/harmony/unpack200/AttributeLayoutMap;->getAttributeLayout(Ljava/lang/String;I)Lorg/apache/commons/compress/harmony/unpack200/AttributeLayout;

    move-result-object v8

    .line 438
    .local v8, "abstractModifier":Lorg/apache/commons/compress/harmony/unpack200/AttributeLayout;
    const-string v10, "ACC_NATIVE"

    invoke-virtual {v7, v10, v9}, Lorg/apache/commons/compress/harmony/unpack200/AttributeLayoutMap;->getAttributeLayout(Ljava/lang/String;I)Lorg/apache/commons/compress/harmony/unpack200/AttributeLayout;

    move-result-object v10

    .line 439
    .local v10, "nativeModifier":Lorg/apache/commons/compress/harmony/unpack200/AttributeLayout;
    const-string v11, "ACC_STATIC"

    invoke-virtual {v7, v11, v9}, Lorg/apache/commons/compress/harmony/unpack200/AttributeLayoutMap;->getAttributeLayout(Ljava/lang/String;I)Lorg/apache/commons/compress/harmony/unpack200/AttributeLayout;

    move-result-object v9

    .line 441
    .local v9, "staticModifier":Lorg/apache/commons/compress/harmony/unpack200/AttributeLayout;
    iget-object v11, v0, Lorg/apache/commons/compress/harmony/unpack200/BcBands;->wideByteCodes:Ljava/util/List;

    invoke-interface {v11}, Ljava/util/List;->size()I

    move-result v11

    new-array v11, v11, [I

    .line 442
    .local v11, "wideByteCodeArray":[I
    const/4 v12, 0x0

    .local v12, "index":I
    :goto_0
    array-length v13, v11

    if-ge v12, v13, :cond_0

    .line 443
    iget-object v13, v0, Lorg/apache/commons/compress/harmony/unpack200/BcBands;->wideByteCodes:Ljava/util/List;

    invoke-interface {v13, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/lang/Integer;

    invoke-virtual {v13}, Ljava/lang/Integer;->intValue()I

    move-result v13

    aput v13, v11, v12

    .line 442
    add-int/lit8 v12, v12, 0x1

    goto :goto_0

    .line 445
    .end local v12    # "index":I
    :cond_0
    new-instance v12, Lorg/apache/commons/compress/harmony/unpack200/bytecode/OperandManager;

    iget-object v13, v0, Lorg/apache/commons/compress/harmony/unpack200/BcBands;->bcCaseCount:[I

    iget-object v14, v0, Lorg/apache/commons/compress/harmony/unpack200/BcBands;->bcCaseValue:[I

    iget-object v15, v0, Lorg/apache/commons/compress/harmony/unpack200/BcBands;->bcByte:[I

    move-object/from16 v34, v2

    .end local v2    # "methodFlags":[[J
    .local v34, "methodFlags":[[J
    iget-object v2, v0, Lorg/apache/commons/compress/harmony/unpack200/BcBands;->bcShort:[I

    move-object/from16 v16, v2

    iget-object v2, v0, Lorg/apache/commons/compress/harmony/unpack200/BcBands;->bcLocal:[I

    move-object/from16 v17, v2

    iget-object v2, v0, Lorg/apache/commons/compress/harmony/unpack200/BcBands;->bcLabel:[I

    move-object/from16 v18, v2

    iget-object v2, v0, Lorg/apache/commons/compress/harmony/unpack200/BcBands;->bcIntRef:[I

    move-object/from16 v19, v2

    iget-object v2, v0, Lorg/apache/commons/compress/harmony/unpack200/BcBands;->bcFloatRef:[I

    move-object/from16 v20, v2

    iget-object v2, v0, Lorg/apache/commons/compress/harmony/unpack200/BcBands;->bcLongRef:[I

    move-object/from16 v21, v2

    iget-object v2, v0, Lorg/apache/commons/compress/harmony/unpack200/BcBands;->bcDoubleRef:[I

    move-object/from16 v22, v2

    iget-object v2, v0, Lorg/apache/commons/compress/harmony/unpack200/BcBands;->bcStringRef:[I

    move-object/from16 v23, v2

    iget-object v2, v0, Lorg/apache/commons/compress/harmony/unpack200/BcBands;->bcClassRef:[I

    move-object/from16 v24, v2

    iget-object v2, v0, Lorg/apache/commons/compress/harmony/unpack200/BcBands;->bcFieldRef:[I

    move-object/from16 v25, v2

    iget-object v2, v0, Lorg/apache/commons/compress/harmony/unpack200/BcBands;->bcMethodRef:[I

    move-object/from16 v26, v2

    iget-object v2, v0, Lorg/apache/commons/compress/harmony/unpack200/BcBands;->bcIMethodRef:[I

    move-object/from16 v27, v2

    iget-object v2, v0, Lorg/apache/commons/compress/harmony/unpack200/BcBands;->bcThisField:[I

    move-object/from16 v28, v2

    iget-object v2, v0, Lorg/apache/commons/compress/harmony/unpack200/BcBands;->bcSuperField:[I

    move-object/from16 v29, v2

    iget-object v2, v0, Lorg/apache/commons/compress/harmony/unpack200/BcBands;->bcThisMethod:[I

    move-object/from16 v30, v2

    iget-object v2, v0, Lorg/apache/commons/compress/harmony/unpack200/BcBands;->bcSuperMethod:[I

    move-object/from16 v31, v2

    iget-object v2, v0, Lorg/apache/commons/compress/harmony/unpack200/BcBands;->bcInitRef:[I

    move-object/from16 v32, v2

    move-object/from16 v33, v11

    .end local v11    # "wideByteCodeArray":[I
    .local v33, "wideByteCodeArray":[I
    invoke-direct/range {v12 .. v33}, Lorg/apache/commons/compress/harmony/unpack200/bytecode/OperandManager;-><init>([I[I[I[I[I[I[I[I[I[I[I[I[I[I[I[I[I[I[I[I[I)V

    .line 448
    .local v12, "operandManager":Lorg/apache/commons/compress/harmony/unpack200/bytecode/OperandManager;
    iget-object v2, v0, Lorg/apache/commons/compress/harmony/unpack200/BcBands;->segment:Lorg/apache/commons/compress/harmony/unpack200/Segment;

    invoke-virtual {v12, v2}, Lorg/apache/commons/compress/harmony/unpack200/bytecode/OperandManager;->setSegment(Lorg/apache/commons/compress/harmony/unpack200/Segment;)V

    .line 450
    const/4 v2, 0x0

    .line 451
    .local v2, "i":I
    iget-object v11, v0, Lorg/apache/commons/compress/harmony/unpack200/BcBands;->segment:Lorg/apache/commons/compress/harmony/unpack200/Segment;

    invoke-virtual {v11}, Lorg/apache/commons/compress/harmony/unpack200/Segment;->getClassBands()Lorg/apache/commons/compress/harmony/unpack200/ClassBands;

    move-result-object v11

    invoke-virtual {v11}, Lorg/apache/commons/compress/harmony/unpack200/ClassBands;->getOrderedCodeAttributes()Ljava/util/ArrayList;

    move-result-object v11

    .line 452
    .local v11, "orderedCodeAttributes":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/util/List<Lorg/apache/commons/compress/harmony/unpack200/bytecode/Attribute;>;>;"
    const/4 v13, 0x0

    .line 455
    .local v13, "codeAttributeIndex":I
    iget-object v14, v0, Lorg/apache/commons/compress/harmony/unpack200/BcBands;->segment:Lorg/apache/commons/compress/harmony/unpack200/Segment;

    invoke-virtual {v14}, Lorg/apache/commons/compress/harmony/unpack200/Segment;->getClassBands()Lorg/apache/commons/compress/harmony/unpack200/ClassBands;

    move-result-object v14

    invoke-virtual {v14}, Lorg/apache/commons/compress/harmony/unpack200/ClassBands;->getCodeHandlerCount()[I

    move-result-object v20

    .line 456
    .local v20, "handlerCount":[I
    iget-object v14, v0, Lorg/apache/commons/compress/harmony/unpack200/BcBands;->segment:Lorg/apache/commons/compress/harmony/unpack200/Segment;

    invoke-virtual {v14}, Lorg/apache/commons/compress/harmony/unpack200/Segment;->getClassBands()Lorg/apache/commons/compress/harmony/unpack200/ClassBands;

    move-result-object v14

    invoke-virtual {v14}, Lorg/apache/commons/compress/harmony/unpack200/ClassBands;->getCodeHandlerStartP()[[I

    move-result-object v21

    .line 457
    .local v21, "handlerStartPCs":[[I
    iget-object v14, v0, Lorg/apache/commons/compress/harmony/unpack200/BcBands;->segment:Lorg/apache/commons/compress/harmony/unpack200/Segment;

    invoke-virtual {v14}, Lorg/apache/commons/compress/harmony/unpack200/Segment;->getClassBands()Lorg/apache/commons/compress/harmony/unpack200/ClassBands;

    move-result-object v14

    invoke-virtual {v14}, Lorg/apache/commons/compress/harmony/unpack200/ClassBands;->getCodeHandlerEndPO()[[I

    move-result-object v22

    .line 458
    .local v22, "handlerEndPCs":[[I
    iget-object v14, v0, Lorg/apache/commons/compress/harmony/unpack200/BcBands;->segment:Lorg/apache/commons/compress/harmony/unpack200/Segment;

    invoke-virtual {v14}, Lorg/apache/commons/compress/harmony/unpack200/Segment;->getClassBands()Lorg/apache/commons/compress/harmony/unpack200/ClassBands;

    move-result-object v14

    invoke-virtual {v14}, Lorg/apache/commons/compress/harmony/unpack200/ClassBands;->getCodeHandlerCatchPO()[[I

    move-result-object v23

    .line 459
    .local v23, "handlerCatchPCs":[[I
    iget-object v14, v0, Lorg/apache/commons/compress/harmony/unpack200/BcBands;->segment:Lorg/apache/commons/compress/harmony/unpack200/Segment;

    invoke-virtual {v14}, Lorg/apache/commons/compress/harmony/unpack200/Segment;->getClassBands()Lorg/apache/commons/compress/harmony/unpack200/ClassBands;

    move-result-object v14

    invoke-virtual {v14}, Lorg/apache/commons/compress/harmony/unpack200/ClassBands;->getCodeHandlerClassRCN()[[I

    move-result-object v24

    .line 461
    .local v24, "handlerClassTypes":[[I
    iget-object v14, v0, Lorg/apache/commons/compress/harmony/unpack200/BcBands;->segment:Lorg/apache/commons/compress/harmony/unpack200/Segment;

    invoke-virtual {v14}, Lorg/apache/commons/compress/harmony/unpack200/Segment;->getSegmentHeader()Lorg/apache/commons/compress/harmony/unpack200/SegmentHeader;

    move-result-object v14

    invoke-virtual {v14}, Lorg/apache/commons/compress/harmony/unpack200/SegmentHeader;->getOptions()Lorg/apache/commons/compress/harmony/unpack200/SegmentOptions;

    move-result-object v14

    invoke-virtual {v14}, Lorg/apache/commons/compress/harmony/unpack200/SegmentOptions;->hasAllCodeFlags()Z

    move-result v25

    .line 462
    .local v25, "allCodeHasFlags":Z
    iget-object v14, v0, Lorg/apache/commons/compress/harmony/unpack200/BcBands;->segment:Lorg/apache/commons/compress/harmony/unpack200/Segment;

    invoke-virtual {v14}, Lorg/apache/commons/compress/harmony/unpack200/Segment;->getClassBands()Lorg/apache/commons/compress/harmony/unpack200/ClassBands;

    move-result-object v14

    invoke-virtual {v14}, Lorg/apache/commons/compress/harmony/unpack200/ClassBands;->getCodeHasAttributes()[Z

    move-result-object v26

    .line 464
    .local v26, "codeHasFlags":[Z
    const/4 v14, 0x0

    .local v14, "c":I
    :goto_1
    if-ge v14, v1, :cond_e

    .line 465
    aget-object v15, v34, v14

    array-length v15, v15

    .line 466
    .local v15, "numberOfMethods":I
    const/16 v16, 0x0

    move/from16 v27, v1

    move/from16 v1, v16

    .local v1, "m":I
    .local v27, "classCount":I
    :goto_2
    if-ge v1, v15, :cond_d

    .line 467
    aget-object v16, v34, v14

    move-object/from16 v28, v3

    move-object/from16 v29, v4

    .end local v3    # "codeMaxNALocals":[I
    .end local v4    # "codeMaxStack":[I
    .local v28, "codeMaxNALocals":[I
    .local v29, "codeMaxStack":[I
    aget-wide v3, v16, v1

    .line 468
    .local v3, "methodFlag":J
    invoke-virtual {v8, v3, v4}, Lorg/apache/commons/compress/harmony/unpack200/AttributeLayout;->matches(J)Z

    move-result v16

    if-nez v16, :cond_c

    invoke-virtual {v10, v3, v4}, Lorg/apache/commons/compress/harmony/unpack200/AttributeLayout;->matches(J)Z

    move-result v16

    if-nez v16, :cond_c

    .line 469
    move/from16 v16, v14

    .end local v14    # "c":I
    .local v16, "c":I
    aget v14, v29, v2

    .line 470
    .local v14, "maxStack":I
    aget v17, v28, v2

    .line 471
    .local v17, "maxLocal":I
    invoke-virtual {v9, v3, v4}, Lorg/apache/commons/compress/harmony/unpack200/AttributeLayout;->matches(J)Z

    move-result v18

    if-nez v18, :cond_1

    .line 472
    add-int/lit8 v17, v17, 0x1

    .line 475
    :cond_1
    aget-object v18, v6, v16

    aget-object v18, v18, v1

    invoke-static/range {v18 .. v18}, Lorg/apache/commons/compress/harmony/unpack200/SegmentUtils;->countInvokeInterfaceArgs(Ljava/lang/String;)I

    move-result v18

    add-int v17, v17, v18

    .line 476
    move/from16 v30, v1

    .end local v1    # "m":I
    .local v30, "m":I
    iget-object v1, v0, Lorg/apache/commons/compress/harmony/unpack200/BcBands;->segment:Lorg/apache/commons/compress/harmony/unpack200/Segment;

    invoke-virtual {v1}, Lorg/apache/commons/compress/harmony/unpack200/Segment;->getCpBands()Lorg/apache/commons/compress/harmony/unpack200/CpBands;

    move-result-object v1

    invoke-virtual {v1}, Lorg/apache/commons/compress/harmony/unpack200/CpBands;->getCpClass()[Ljava/lang/String;

    move-result-object v1

    .line 477
    .local v1, "cpClass":[Ljava/lang/String;
    move-object/from16 v31, v1

    .end local v1    # "cpClass":[Ljava/lang/String;
    .local v31, "cpClass":[Ljava/lang/String;
    iget-object v1, v0, Lorg/apache/commons/compress/harmony/unpack200/BcBands;->segment:Lorg/apache/commons/compress/harmony/unpack200/Segment;

    invoke-virtual {v1}, Lorg/apache/commons/compress/harmony/unpack200/Segment;->getClassBands()Lorg/apache/commons/compress/harmony/unpack200/ClassBands;

    move-result-object v1

    invoke-virtual {v1}, Lorg/apache/commons/compress/harmony/unpack200/ClassBands;->getClassThisInts()[I

    move-result-object v1

    aget v1, v1, v16

    aget-object v1, v31, v1

    invoke-virtual {v12, v1}, Lorg/apache/commons/compress/harmony/unpack200/bytecode/OperandManager;->setCurrentClass(Ljava/lang/String;)V

    .line 478
    iget-object v1, v0, Lorg/apache/commons/compress/harmony/unpack200/BcBands;->segment:Lorg/apache/commons/compress/harmony/unpack200/Segment;

    invoke-virtual {v1}, Lorg/apache/commons/compress/harmony/unpack200/Segment;->getClassBands()Lorg/apache/commons/compress/harmony/unpack200/ClassBands;

    move-result-object v1

    invoke-virtual {v1}, Lorg/apache/commons/compress/harmony/unpack200/ClassBands;->getClassSuperInts()[I

    move-result-object v1

    aget v1, v1, v16

    aget-object v1, v31, v1

    invoke-virtual {v12, v1}, Lorg/apache/commons/compress/harmony/unpack200/bytecode/OperandManager;->setSuperClass(Ljava/lang/String;)V

    .line 479
    new-instance v19, Ljava/util/ArrayList;

    invoke-direct/range {v19 .. v19}, Ljava/util/ArrayList;-><init>()V

    move-object/from16 v1, v19

    .line 480
    .local v1, "exceptionTable":Ljava/util/List;, "Ljava/util/List<Lorg/apache/commons/compress/harmony/unpack200/bytecode/ExceptionTableEntry;>;"
    if-eqz v20, :cond_4

    .line 481
    const/16 v18, 0x0

    move-wide/from16 v35, v3

    move/from16 v3, v18

    .local v3, "j":I
    .local v35, "methodFlag":J
    :goto_3
    aget v4, v20, v2

    if-ge v3, v4, :cond_3

    .line 482
    aget-object v4, v24, v2

    aget v4, v4, v3

    add-int/lit8 v4, v4, -0x1

    .line 483
    .local v4, "handlerClass":I
    const/16 v18, 0x0

    .line 484
    .local v18, "cpHandlerClass":Lorg/apache/commons/compress/harmony/unpack200/bytecode/CPClass;
    move/from16 v19, v3

    .end local v3    # "j":I
    .local v19, "j":I
    const/4 v3, -0x1

    if-eq v4, v3, :cond_2

    .line 488
    iget-object v3, v0, Lorg/apache/commons/compress/harmony/unpack200/BcBands;->segment:Lorg/apache/commons/compress/harmony/unpack200/Segment;

    invoke-virtual {v3}, Lorg/apache/commons/compress/harmony/unpack200/Segment;->getCpBands()Lorg/apache/commons/compress/harmony/unpack200/CpBands;

    move-result-object v3

    invoke-virtual {v3, v4}, Lorg/apache/commons/compress/harmony/unpack200/CpBands;->cpClassValue(I)Lorg/apache/commons/compress/harmony/unpack200/bytecode/CPClass;

    move-result-object v18

    move-object/from16 v3, v18

    goto :goto_4

    .line 484
    :cond_2
    move-object/from16 v3, v18

    .line 490
    .end local v18    # "cpHandlerClass":Lorg/apache/commons/compress/harmony/unpack200/bytecode/CPClass;
    .local v3, "cpHandlerClass":Lorg/apache/commons/compress/harmony/unpack200/bytecode/CPClass;
    :goto_4
    move/from16 v18, v4

    .end local v4    # "handlerClass":I
    .local v18, "handlerClass":I
    new-instance v4, Lorg/apache/commons/compress/harmony/unpack200/bytecode/ExceptionTableEntry;

    aget-object v32, v21, v2

    move-object/from16 v37, v5

    .end local v5    # "methodAttributes":[[Ljava/util/ArrayList;, "[[Ljava/util/ArrayList<Lorg/apache/commons/compress/harmony/unpack200/bytecode/Attribute;>;"
    .local v37, "methodAttributes":[[Ljava/util/ArrayList;, "[[Ljava/util/ArrayList<Lorg/apache/commons/compress/harmony/unpack200/bytecode/Attribute;>;"
    aget v5, v32, v19

    aget-object v32, v22, v2

    move-object/from16 v38, v6

    .end local v6    # "methodDescr":[[Ljava/lang/String;
    .local v38, "methodDescr":[[Ljava/lang/String;
    aget v6, v32, v19

    aget-object v32, v23, v2

    move-object/from16 v39, v7

    .end local v7    # "attributeDefinitionMap":Lorg/apache/commons/compress/harmony/unpack200/AttributeLayoutMap;
    .local v39, "attributeDefinitionMap":Lorg/apache/commons/compress/harmony/unpack200/AttributeLayoutMap;
    aget v7, v32, v19

    invoke-direct {v4, v5, v6, v7, v3}, Lorg/apache/commons/compress/harmony/unpack200/bytecode/ExceptionTableEntry;-><init>(IIILorg/apache/commons/compress/harmony/unpack200/bytecode/CPClass;)V

    .line 492
    .local v4, "entry":Lorg/apache/commons/compress/harmony/unpack200/bytecode/ExceptionTableEntry;
    invoke-interface {v1, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 481
    .end local v3    # "cpHandlerClass":Lorg/apache/commons/compress/harmony/unpack200/bytecode/CPClass;
    .end local v4    # "entry":Lorg/apache/commons/compress/harmony/unpack200/bytecode/ExceptionTableEntry;
    .end local v18    # "handlerClass":I
    add-int/lit8 v3, v19, 0x1

    move-object/from16 v5, v37

    move-object/from16 v6, v38

    move-object/from16 v7, v39

    .end local v19    # "j":I
    .local v3, "j":I
    goto :goto_3

    .end local v37    # "methodAttributes":[[Ljava/util/ArrayList;, "[[Ljava/util/ArrayList<Lorg/apache/commons/compress/harmony/unpack200/bytecode/Attribute;>;"
    .end local v38    # "methodDescr":[[Ljava/lang/String;
    .end local v39    # "attributeDefinitionMap":Lorg/apache/commons/compress/harmony/unpack200/AttributeLayoutMap;
    .restart local v5    # "methodAttributes":[[Ljava/util/ArrayList;, "[[Ljava/util/ArrayList<Lorg/apache/commons/compress/harmony/unpack200/bytecode/Attribute;>;"
    .restart local v6    # "methodDescr":[[Ljava/lang/String;
    .restart local v7    # "attributeDefinitionMap":Lorg/apache/commons/compress/harmony/unpack200/AttributeLayoutMap;
    :cond_3
    move/from16 v19, v3

    move-object/from16 v37, v5

    move-object/from16 v38, v6

    move-object/from16 v39, v7

    .end local v3    # "j":I
    .end local v5    # "methodAttributes":[[Ljava/util/ArrayList;, "[[Ljava/util/ArrayList<Lorg/apache/commons/compress/harmony/unpack200/bytecode/Attribute;>;"
    .end local v6    # "methodDescr":[[Ljava/lang/String;
    .end local v7    # "attributeDefinitionMap":Lorg/apache/commons/compress/harmony/unpack200/AttributeLayoutMap;
    .restart local v19    # "j":I
    .restart local v37    # "methodAttributes":[[Ljava/util/ArrayList;, "[[Ljava/util/ArrayList<Lorg/apache/commons/compress/harmony/unpack200/bytecode/Attribute;>;"
    .restart local v38    # "methodDescr":[[Ljava/lang/String;
    .restart local v39    # "attributeDefinitionMap":Lorg/apache/commons/compress/harmony/unpack200/AttributeLayoutMap;
    goto :goto_5

    .line 480
    .end local v19    # "j":I
    .end local v35    # "methodFlag":J
    .end local v37    # "methodAttributes":[[Ljava/util/ArrayList;, "[[Ljava/util/ArrayList<Lorg/apache/commons/compress/harmony/unpack200/bytecode/Attribute;>;"
    .end local v38    # "methodDescr":[[Ljava/lang/String;
    .end local v39    # "attributeDefinitionMap":Lorg/apache/commons/compress/harmony/unpack200/AttributeLayoutMap;
    .local v3, "methodFlag":J
    .restart local v5    # "methodAttributes":[[Ljava/util/ArrayList;, "[[Ljava/util/ArrayList<Lorg/apache/commons/compress/harmony/unpack200/bytecode/Attribute;>;"
    .restart local v6    # "methodDescr":[[Ljava/lang/String;
    .restart local v7    # "attributeDefinitionMap":Lorg/apache/commons/compress/harmony/unpack200/AttributeLayoutMap;
    :cond_4
    move-wide/from16 v35, v3

    move-object/from16 v37, v5

    move-object/from16 v38, v6

    move-object/from16 v39, v7

    .line 495
    .end local v3    # "methodFlag":J
    .end local v5    # "methodAttributes":[[Ljava/util/ArrayList;, "[[Ljava/util/ArrayList<Lorg/apache/commons/compress/harmony/unpack200/bytecode/Attribute;>;"
    .end local v6    # "methodDescr":[[Ljava/lang/String;
    .end local v7    # "attributeDefinitionMap":Lorg/apache/commons/compress/harmony/unpack200/AttributeLayoutMap;
    .restart local v35    # "methodFlag":J
    .restart local v37    # "methodAttributes":[[Ljava/util/ArrayList;, "[[Ljava/util/ArrayList<Lorg/apache/commons/compress/harmony/unpack200/bytecode/Attribute;>;"
    .restart local v38    # "methodDescr":[[Ljava/lang/String;
    .restart local v39    # "attributeDefinitionMap":Lorg/apache/commons/compress/harmony/unpack200/AttributeLayoutMap;
    :goto_5
    move v3, v13

    .end local v13    # "codeAttributeIndex":I
    .local v3, "codeAttributeIndex":I
    new-instance v13, Lorg/apache/commons/compress/harmony/unpack200/bytecode/CodeAttribute;

    iget-object v4, v0, Lorg/apache/commons/compress/harmony/unpack200/BcBands;->methodByteCodePacked:[[[B

    aget-object v4, v4, v16

    aget-object v4, v4, v30

    iget-object v5, v0, Lorg/apache/commons/compress/harmony/unpack200/BcBands;->segment:Lorg/apache/commons/compress/harmony/unpack200/Segment;

    move-object/from16 v19, v1

    move-object/from16 v18, v12

    move/from16 v1, v16

    move-object/from16 v16, v4

    move v4, v15

    move/from16 v15, v17

    move-object/from16 v17, v5

    .end local v12    # "operandManager":Lorg/apache/commons/compress/harmony/unpack200/bytecode/OperandManager;
    .end local v16    # "c":I
    .end local v17    # "maxLocal":I
    .local v1, "c":I
    .local v4, "numberOfMethods":I
    .local v15, "maxLocal":I
    .local v18, "operandManager":Lorg/apache/commons/compress/harmony/unpack200/bytecode/OperandManager;
    .local v19, "exceptionTable":Ljava/util/List;, "Ljava/util/List<Lorg/apache/commons/compress/harmony/unpack200/bytecode/ExceptionTableEntry;>;"
    invoke-direct/range {v13 .. v19}, Lorg/apache/commons/compress/harmony/unpack200/bytecode/CodeAttribute;-><init>(II[BLorg/apache/commons/compress/harmony/unpack200/Segment;Lorg/apache/commons/compress/harmony/unpack200/bytecode/OperandManager;Ljava/util/List;)V

    .line 496
    .local v13, "codeAttr":Lorg/apache/commons/compress/harmony/unpack200/bytecode/CodeAttribute;
    aget-object v5, v37, v1

    aget-object v5, v5, v30

    .line 498
    .local v5, "methodAttributesList":Ljava/util/List;, "Ljava/util/List<Lorg/apache/commons/compress/harmony/unpack200/bytecode/Attribute;>;"
    const/4 v6, 0x0

    .line 499
    .local v6, "indexForCodeAttr":I
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_6
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_7

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lorg/apache/commons/compress/harmony/unpack200/bytecode/Attribute;

    .line 500
    .local v12, "attribute":Lorg/apache/commons/compress/harmony/unpack200/bytecode/Attribute;
    instance-of v0, v12, Lorg/apache/commons/compress/harmony/unpack200/bytecode/NewAttribute;

    if-eqz v0, :cond_6

    move-object v0, v12

    check-cast v0, Lorg/apache/commons/compress/harmony/unpack200/bytecode/NewAttribute;

    invoke-virtual {v0}, Lorg/apache/commons/compress/harmony/unpack200/bytecode/NewAttribute;->getLayoutIndex()I

    move-result v0

    move/from16 v16, v1

    .end local v1    # "c":I
    .restart local v16    # "c":I
    const/16 v1, 0xf

    if-lt v0, v1, :cond_5

    .line 501
    goto :goto_7

    .line 503
    :cond_5
    nop

    .end local v12    # "attribute":Lorg/apache/commons/compress/harmony/unpack200/bytecode/Attribute;
    add-int/lit8 v6, v6, 0x1

    .line 504
    move-object/from16 v0, p0

    move/from16 v1, v16

    goto :goto_6

    .line 500
    .end local v16    # "c":I
    .restart local v1    # "c":I
    .restart local v12    # "attribute":Lorg/apache/commons/compress/harmony/unpack200/bytecode/Attribute;
    :cond_6
    move/from16 v16, v1

    .end local v1    # "c":I
    .restart local v16    # "c":I
    goto :goto_7

    .line 499
    .end local v12    # "attribute":Lorg/apache/commons/compress/harmony/unpack200/bytecode/Attribute;
    .end local v16    # "c":I
    .restart local v1    # "c":I
    :cond_7
    move/from16 v16, v1

    .line 505
    .end local v1    # "c":I
    .restart local v16    # "c":I
    :goto_7
    invoke-interface {v5, v6, v13}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 506
    iget-object v0, v13, Lorg/apache/commons/compress/harmony/unpack200/bytecode/CodeAttribute;->byteCodeOffsets:Ljava/util/List;

    invoke-virtual {v13, v0}, Lorg/apache/commons/compress/harmony/unpack200/bytecode/CodeAttribute;->renumber(Ljava/util/List;)V

    .line 508
    if-eqz v25, :cond_8

    .line 509
    invoke-virtual {v11, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    .local v0, "currentAttributes":Ljava/util/List;, "Ljava/util/List<Lorg/apache/commons/compress/harmony/unpack200/bytecode/Attribute;>;"
    goto :goto_8

    .line 510
    .end local v0    # "currentAttributes":Ljava/util/List;, "Ljava/util/List<Lorg/apache/commons/compress/harmony/unpack200/bytecode/Attribute;>;"
    :cond_8
    aget-boolean v0, v26, v2

    if-eqz v0, :cond_9

    .line 511
    invoke-virtual {v11, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    .line 512
    .restart local v0    # "currentAttributes":Ljava/util/List;, "Ljava/util/List<Lorg/apache/commons/compress/harmony/unpack200/bytecode/Attribute;>;"
    add-int/lit8 v1, v3, 0x1

    move v3, v1

    .end local v3    # "codeAttributeIndex":I
    .local v1, "codeAttributeIndex":I
    goto :goto_8

    .line 514
    .end local v0    # "currentAttributes":Ljava/util/List;, "Ljava/util/List<Lorg/apache/commons/compress/harmony/unpack200/bytecode/Attribute;>;"
    .end local v1    # "codeAttributeIndex":I
    .restart local v3    # "codeAttributeIndex":I
    :cond_9
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 516
    .restart local v0    # "currentAttributes":Ljava/util/List;, "Ljava/util/List<Lorg/apache/commons/compress/harmony/unpack200/bytecode/Attribute;>;"
    :goto_8
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_9
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_b

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lorg/apache/commons/compress/harmony/unpack200/bytecode/Attribute;

    .line 517
    .local v7, "currentAttribute":Lorg/apache/commons/compress/harmony/unpack200/bytecode/Attribute;
    invoke-virtual {v13, v7}, Lorg/apache/commons/compress/harmony/unpack200/bytecode/CodeAttribute;->addAttribute(Lorg/apache/commons/compress/harmony/unpack200/bytecode/Attribute;)V

    .line 519
    invoke-virtual {v7}, Lorg/apache/commons/compress/harmony/unpack200/bytecode/Attribute;->hasBCIRenumbering()Z

    move-result v12

    if-eqz v12, :cond_a

    .line 520
    move-object v12, v7

    check-cast v12, Lorg/apache/commons/compress/harmony/unpack200/bytecode/BCIRenumberedAttribute;

    move-object/from16 v17, v0

    .end local v0    # "currentAttributes":Ljava/util/List;, "Ljava/util/List<Lorg/apache/commons/compress/harmony/unpack200/bytecode/Attribute;>;"
    .local v17, "currentAttributes":Ljava/util/List;, "Ljava/util/List<Lorg/apache/commons/compress/harmony/unpack200/bytecode/Attribute;>;"
    iget-object v0, v13, Lorg/apache/commons/compress/harmony/unpack200/bytecode/CodeAttribute;->byteCodeOffsets:Ljava/util/List;

    invoke-virtual {v12, v0}, Lorg/apache/commons/compress/harmony/unpack200/bytecode/BCIRenumberedAttribute;->renumber(Ljava/util/List;)V

    goto :goto_a

    .line 519
    .end local v17    # "currentAttributes":Ljava/util/List;, "Ljava/util/List<Lorg/apache/commons/compress/harmony/unpack200/bytecode/Attribute;>;"
    .restart local v0    # "currentAttributes":Ljava/util/List;, "Ljava/util/List<Lorg/apache/commons/compress/harmony/unpack200/bytecode/Attribute;>;"
    :cond_a
    move-object/from16 v17, v0

    .line 522
    .end local v0    # "currentAttributes":Ljava/util/List;, "Ljava/util/List<Lorg/apache/commons/compress/harmony/unpack200/bytecode/Attribute;>;"
    .end local v7    # "currentAttribute":Lorg/apache/commons/compress/harmony/unpack200/bytecode/Attribute;
    .restart local v17    # "currentAttributes":Ljava/util/List;, "Ljava/util/List<Lorg/apache/commons/compress/harmony/unpack200/bytecode/Attribute;>;"
    :goto_a
    move-object/from16 v0, v17

    goto :goto_9

    .line 523
    .end local v17    # "currentAttributes":Ljava/util/List;, "Ljava/util/List<Lorg/apache/commons/compress/harmony/unpack200/bytecode/Attribute;>;"
    .restart local v0    # "currentAttributes":Ljava/util/List;, "Ljava/util/List<Lorg/apache/commons/compress/harmony/unpack200/bytecode/Attribute;>;"
    :cond_b
    move-object/from16 v17, v0

    .end local v0    # "currentAttributes":Ljava/util/List;, "Ljava/util/List<Lorg/apache/commons/compress/harmony/unpack200/bytecode/Attribute;>;"
    .restart local v17    # "currentAttributes":Ljava/util/List;, "Ljava/util/List<Lorg/apache/commons/compress/harmony/unpack200/bytecode/Attribute;>;"
    add-int/lit8 v2, v2, 0x1

    move v13, v3

    goto :goto_b

    .line 468
    .end local v4    # "numberOfMethods":I
    .end local v16    # "c":I
    .end local v17    # "currentAttributes":Ljava/util/List;, "Ljava/util/List<Lorg/apache/commons/compress/harmony/unpack200/bytecode/Attribute;>;"
    .end local v18    # "operandManager":Lorg/apache/commons/compress/harmony/unpack200/bytecode/OperandManager;
    .end local v19    # "exceptionTable":Ljava/util/List;, "Ljava/util/List<Lorg/apache/commons/compress/harmony/unpack200/bytecode/ExceptionTableEntry;>;"
    .end local v30    # "m":I
    .end local v31    # "cpClass":[Ljava/lang/String;
    .end local v35    # "methodFlag":J
    .end local v37    # "methodAttributes":[[Ljava/util/ArrayList;, "[[Ljava/util/ArrayList<Lorg/apache/commons/compress/harmony/unpack200/bytecode/Attribute;>;"
    .end local v38    # "methodDescr":[[Ljava/lang/String;
    .end local v39    # "attributeDefinitionMap":Lorg/apache/commons/compress/harmony/unpack200/AttributeLayoutMap;
    .local v1, "m":I
    .local v3, "methodFlag":J
    .local v5, "methodAttributes":[[Ljava/util/ArrayList;, "[[Ljava/util/ArrayList<Lorg/apache/commons/compress/harmony/unpack200/bytecode/Attribute;>;"
    .local v6, "methodDescr":[[Ljava/lang/String;
    .local v7, "attributeDefinitionMap":Lorg/apache/commons/compress/harmony/unpack200/AttributeLayoutMap;
    .local v12, "operandManager":Lorg/apache/commons/compress/harmony/unpack200/bytecode/OperandManager;
    .local v13, "codeAttributeIndex":I
    .local v14, "c":I
    .local v15, "numberOfMethods":I
    :cond_c
    move/from16 v30, v1

    move-wide/from16 v35, v3

    move-object/from16 v37, v5

    move-object/from16 v38, v6

    move-object/from16 v39, v7

    move-object/from16 v18, v12

    move v3, v13

    move/from16 v16, v14

    move v4, v15

    .line 466
    .end local v1    # "m":I
    .end local v5    # "methodAttributes":[[Ljava/util/ArrayList;, "[[Ljava/util/ArrayList<Lorg/apache/commons/compress/harmony/unpack200/bytecode/Attribute;>;"
    .end local v6    # "methodDescr":[[Ljava/lang/String;
    .end local v7    # "attributeDefinitionMap":Lorg/apache/commons/compress/harmony/unpack200/AttributeLayoutMap;
    .end local v12    # "operandManager":Lorg/apache/commons/compress/harmony/unpack200/bytecode/OperandManager;
    .end local v13    # "codeAttributeIndex":I
    .end local v14    # "c":I
    .end local v15    # "numberOfMethods":I
    .local v3, "codeAttributeIndex":I
    .restart local v4    # "numberOfMethods":I
    .restart local v16    # "c":I
    .restart local v18    # "operandManager":Lorg/apache/commons/compress/harmony/unpack200/bytecode/OperandManager;
    .restart local v30    # "m":I
    .restart local v37    # "methodAttributes":[[Ljava/util/ArrayList;, "[[Ljava/util/ArrayList<Lorg/apache/commons/compress/harmony/unpack200/bytecode/Attribute;>;"
    .restart local v38    # "methodDescr":[[Ljava/lang/String;
    .restart local v39    # "attributeDefinitionMap":Lorg/apache/commons/compress/harmony/unpack200/AttributeLayoutMap;
    move v13, v3

    .end local v3    # "codeAttributeIndex":I
    .restart local v13    # "codeAttributeIndex":I
    :goto_b
    add-int/lit8 v1, v30, 0x1

    move-object/from16 v0, p0

    move v15, v4

    move/from16 v14, v16

    move-object/from16 v12, v18

    move-object/from16 v3, v28

    move-object/from16 v4, v29

    move-object/from16 v5, v37

    move-object/from16 v6, v38

    move-object/from16 v7, v39

    .end local v30    # "m":I
    .restart local v1    # "m":I
    goto/16 :goto_2

    .end local v16    # "c":I
    .end local v18    # "operandManager":Lorg/apache/commons/compress/harmony/unpack200/bytecode/OperandManager;
    .end local v28    # "codeMaxNALocals":[I
    .end local v29    # "codeMaxStack":[I
    .end local v37    # "methodAttributes":[[Ljava/util/ArrayList;, "[[Ljava/util/ArrayList<Lorg/apache/commons/compress/harmony/unpack200/bytecode/Attribute;>;"
    .end local v38    # "methodDescr":[[Ljava/lang/String;
    .end local v39    # "attributeDefinitionMap":Lorg/apache/commons/compress/harmony/unpack200/AttributeLayoutMap;
    .local v3, "codeMaxNALocals":[I
    .local v4, "codeMaxStack":[I
    .restart local v5    # "methodAttributes":[[Ljava/util/ArrayList;, "[[Ljava/util/ArrayList<Lorg/apache/commons/compress/harmony/unpack200/bytecode/Attribute;>;"
    .restart local v6    # "methodDescr":[[Ljava/lang/String;
    .restart local v7    # "attributeDefinitionMap":Lorg/apache/commons/compress/harmony/unpack200/AttributeLayoutMap;
    .restart local v12    # "operandManager":Lorg/apache/commons/compress/harmony/unpack200/bytecode/OperandManager;
    .restart local v14    # "c":I
    .restart local v15    # "numberOfMethods":I
    :cond_d
    move/from16 v30, v1

    move-object/from16 v28, v3

    move-object/from16 v29, v4

    move-object/from16 v37, v5

    move-object/from16 v38, v6

    move-object/from16 v39, v7

    move-object/from16 v18, v12

    move v3, v13

    move/from16 v16, v14

    move v4, v15

    .line 464
    .end local v1    # "m":I
    .end local v4    # "codeMaxStack":[I
    .end local v5    # "methodAttributes":[[Ljava/util/ArrayList;, "[[Ljava/util/ArrayList<Lorg/apache/commons/compress/harmony/unpack200/bytecode/Attribute;>;"
    .end local v6    # "methodDescr":[[Ljava/lang/String;
    .end local v7    # "attributeDefinitionMap":Lorg/apache/commons/compress/harmony/unpack200/AttributeLayoutMap;
    .end local v12    # "operandManager":Lorg/apache/commons/compress/harmony/unpack200/bytecode/OperandManager;
    .end local v13    # "codeAttributeIndex":I
    .end local v14    # "c":I
    .end local v15    # "numberOfMethods":I
    .local v3, "codeAttributeIndex":I
    .restart local v16    # "c":I
    .restart local v18    # "operandManager":Lorg/apache/commons/compress/harmony/unpack200/bytecode/OperandManager;
    .restart local v28    # "codeMaxNALocals":[I
    .restart local v29    # "codeMaxStack":[I
    .restart local v37    # "methodAttributes":[[Ljava/util/ArrayList;, "[[Ljava/util/ArrayList<Lorg/apache/commons/compress/harmony/unpack200/bytecode/Attribute;>;"
    .restart local v38    # "methodDescr":[[Ljava/lang/String;
    .restart local v39    # "attributeDefinitionMap":Lorg/apache/commons/compress/harmony/unpack200/AttributeLayoutMap;
    add-int/lit8 v14, v16, 0x1

    move-object/from16 v0, p0

    move/from16 v1, v27

    move-object/from16 v3, v28

    move-object/from16 v4, v29

    .end local v16    # "c":I
    .restart local v14    # "c":I
    goto/16 :goto_1

    .line 527
    .end local v14    # "c":I
    .end local v18    # "operandManager":Lorg/apache/commons/compress/harmony/unpack200/bytecode/OperandManager;
    .end local v27    # "classCount":I
    .end local v28    # "codeMaxNALocals":[I
    .end local v29    # "codeMaxStack":[I
    .end local v37    # "methodAttributes":[[Ljava/util/ArrayList;, "[[Ljava/util/ArrayList<Lorg/apache/commons/compress/harmony/unpack200/bytecode/Attribute;>;"
    .end local v38    # "methodDescr":[[Ljava/lang/String;
    .end local v39    # "attributeDefinitionMap":Lorg/apache/commons/compress/harmony/unpack200/AttributeLayoutMap;
    .local v1, "classCount":I
    .local v3, "codeMaxNALocals":[I
    .restart local v4    # "codeMaxStack":[I
    .restart local v5    # "methodAttributes":[[Ljava/util/ArrayList;, "[[Ljava/util/ArrayList<Lorg/apache/commons/compress/harmony/unpack200/bytecode/Attribute;>;"
    .restart local v6    # "methodDescr":[[Ljava/lang/String;
    .restart local v7    # "attributeDefinitionMap":Lorg/apache/commons/compress/harmony/unpack200/AttributeLayoutMap;
    .restart local v12    # "operandManager":Lorg/apache/commons/compress/harmony/unpack200/bytecode/OperandManager;
    .restart local v13    # "codeAttributeIndex":I
    :cond_e
    return-void
.end method
