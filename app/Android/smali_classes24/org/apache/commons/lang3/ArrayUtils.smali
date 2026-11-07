.class public Lorg/apache/commons/lang3/ArrayUtils;
.super Ljava/lang/Object;
.source "ArrayUtils.java"


# static fields
.field public static final EMPTY_BOOLEAN_ARRAY:[Z

.field public static final EMPTY_BOOLEAN_OBJECT_ARRAY:[Ljava/lang/Boolean;

.field public static final EMPTY_BYTE_ARRAY:[B

.field public static final EMPTY_BYTE_OBJECT_ARRAY:[Ljava/lang/Byte;

.field public static final EMPTY_CHARACTER_OBJECT_ARRAY:[Ljava/lang/Character;

.field public static final EMPTY_CHAR_ARRAY:[C

.field public static final EMPTY_CLASS_ARRAY:[Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field

.field public static final EMPTY_DOUBLE_ARRAY:[D

.field public static final EMPTY_DOUBLE_OBJECT_ARRAY:[Ljava/lang/Double;

.field public static final EMPTY_FIELD_ARRAY:[Ljava/lang/reflect/Field;

.field public static final EMPTY_FLOAT_ARRAY:[F

.field public static final EMPTY_FLOAT_OBJECT_ARRAY:[Ljava/lang/Float;

.field public static final EMPTY_INTEGER_OBJECT_ARRAY:[Ljava/lang/Integer;

.field public static final EMPTY_INT_ARRAY:[I

.field public static final EMPTY_LONG_ARRAY:[J

.field public static final EMPTY_LONG_OBJECT_ARRAY:[Ljava/lang/Long;

.field public static final EMPTY_METHOD_ARRAY:[Ljava/lang/reflect/Method;

.field public static final EMPTY_OBJECT_ARRAY:[Ljava/lang/Object;

.field public static final EMPTY_SHORT_ARRAY:[S

.field public static final EMPTY_SHORT_OBJECT_ARRAY:[Ljava/lang/Short;

.field public static final EMPTY_STRING_ARRAY:[Ljava/lang/String;

.field public static final EMPTY_THROWABLE_ARRAY:[Ljava/lang/Throwable;

.field public static final EMPTY_TYPE_ARRAY:[Ljava/lang/reflect/Type;

.field public static final INDEX_NOT_FOUND:I = -0x1


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 62
    const/4 v0, 0x0

    new-array v1, v0, [Z

    sput-object v1, Lorg/apache/commons/lang3/ArrayUtils;->EMPTY_BOOLEAN_ARRAY:[Z

    .line 67
    new-array v1, v0, [Ljava/lang/Boolean;

    sput-object v1, Lorg/apache/commons/lang3/ArrayUtils;->EMPTY_BOOLEAN_OBJECT_ARRAY:[Ljava/lang/Boolean;

    .line 72
    new-array v1, v0, [B

    sput-object v1, Lorg/apache/commons/lang3/ArrayUtils;->EMPTY_BYTE_ARRAY:[B

    .line 77
    new-array v1, v0, [Ljava/lang/Byte;

    sput-object v1, Lorg/apache/commons/lang3/ArrayUtils;->EMPTY_BYTE_OBJECT_ARRAY:[Ljava/lang/Byte;

    .line 82
    new-array v1, v0, [C

    sput-object v1, Lorg/apache/commons/lang3/ArrayUtils;->EMPTY_CHAR_ARRAY:[C

    .line 87
    new-array v1, v0, [Ljava/lang/Character;

    sput-object v1, Lorg/apache/commons/lang3/ArrayUtils;->EMPTY_CHARACTER_OBJECT_ARRAY:[Ljava/lang/Character;

    .line 92
    new-array v1, v0, [Ljava/lang/Class;

    sput-object v1, Lorg/apache/commons/lang3/ArrayUtils;->EMPTY_CLASS_ARRAY:[Ljava/lang/Class;

    .line 97
    new-array v1, v0, [D

    sput-object v1, Lorg/apache/commons/lang3/ArrayUtils;->EMPTY_DOUBLE_ARRAY:[D

    .line 102
    new-array v1, v0, [Ljava/lang/Double;

    sput-object v1, Lorg/apache/commons/lang3/ArrayUtils;->EMPTY_DOUBLE_OBJECT_ARRAY:[Ljava/lang/Double;

    .line 109
    new-array v1, v0, [Ljava/lang/reflect/Field;

    sput-object v1, Lorg/apache/commons/lang3/ArrayUtils;->EMPTY_FIELD_ARRAY:[Ljava/lang/reflect/Field;

    .line 114
    new-array v1, v0, [F

    sput-object v1, Lorg/apache/commons/lang3/ArrayUtils;->EMPTY_FLOAT_ARRAY:[F

    .line 119
    new-array v1, v0, [Ljava/lang/Float;

    sput-object v1, Lorg/apache/commons/lang3/ArrayUtils;->EMPTY_FLOAT_OBJECT_ARRAY:[Ljava/lang/Float;

    .line 124
    new-array v1, v0, [I

    sput-object v1, Lorg/apache/commons/lang3/ArrayUtils;->EMPTY_INT_ARRAY:[I

    .line 129
    new-array v1, v0, [Ljava/lang/Integer;

    sput-object v1, Lorg/apache/commons/lang3/ArrayUtils;->EMPTY_INTEGER_OBJECT_ARRAY:[Ljava/lang/Integer;

    .line 134
    new-array v1, v0, [J

    sput-object v1, Lorg/apache/commons/lang3/ArrayUtils;->EMPTY_LONG_ARRAY:[J

    .line 139
    new-array v1, v0, [Ljava/lang/Long;

    sput-object v1, Lorg/apache/commons/lang3/ArrayUtils;->EMPTY_LONG_OBJECT_ARRAY:[Ljava/lang/Long;

    .line 146
    new-array v1, v0, [Ljava/lang/reflect/Method;

    sput-object v1, Lorg/apache/commons/lang3/ArrayUtils;->EMPTY_METHOD_ARRAY:[Ljava/lang/reflect/Method;

    .line 151
    new-array v1, v0, [Ljava/lang/Object;

    sput-object v1, Lorg/apache/commons/lang3/ArrayUtils;->EMPTY_OBJECT_ARRAY:[Ljava/lang/Object;

    .line 156
    new-array v1, v0, [S

    sput-object v1, Lorg/apache/commons/lang3/ArrayUtils;->EMPTY_SHORT_ARRAY:[S

    .line 161
    new-array v1, v0, [Ljava/lang/Short;

    sput-object v1, Lorg/apache/commons/lang3/ArrayUtils;->EMPTY_SHORT_OBJECT_ARRAY:[Ljava/lang/Short;

    .line 166
    new-array v1, v0, [Ljava/lang/String;

    sput-object v1, Lorg/apache/commons/lang3/ArrayUtils;->EMPTY_STRING_ARRAY:[Ljava/lang/String;

    .line 173
    new-array v1, v0, [Ljava/lang/Throwable;

    sput-object v1, Lorg/apache/commons/lang3/ArrayUtils;->EMPTY_THROWABLE_ARRAY:[Ljava/lang/Throwable;

    .line 180
    new-array v0, v0, [Ljava/lang/reflect/Type;

    sput-object v0, Lorg/apache/commons/lang3/ArrayUtils;->EMPTY_TYPE_ARRAY:[Ljava/lang/reflect/Type;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 9643
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9644
    return-void
.end method

.method private static add(Ljava/lang/Object;ILjava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;
    .locals 4
    .param p0, "array"    # Ljava/lang/Object;
    .param p1, "index"    # I
    .param p2, "element"    # Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "I",
            "Ljava/lang/Object;",
            "Ljava/lang/Class<",
            "*>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 650
    .local p3, "clazz":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    const-string v0, "Index: "

    const/4 v1, 0x0

    if-nez p0, :cond_1

    .line 651
    if-nez p1, :cond_0

    .line 654
    const/4 v0, 0x1

    invoke-static {p3, v0}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;I)Ljava/lang/Object;

    move-result-object v0

    .line 655
    .local v0, "joinedArray":Ljava/lang/Object;
    invoke-static {v0, v1, p2}, Ljava/lang/reflect/Array;->set(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 656
    return-object v0

    .line 652
    .end local v0    # "joinedArray":Ljava/lang/Object;
    :cond_0
    new-instance v1, Ljava/lang/IndexOutOfBoundsException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, ", Length: 0"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 658
    :cond_1
    invoke-static {p0}, Ljava/lang/reflect/Array;->getLength(Ljava/lang/Object;)I

    move-result v2

    .line 659
    .local v2, "length":I
    if-gt p1, v2, :cond_3

    if-ltz p1, :cond_3

    .line 662
    add-int/lit8 v0, v2, 0x1

    invoke-static {p3, v0}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;I)Ljava/lang/Object;

    move-result-object v0

    .line 663
    .local v0, "result":Ljava/lang/Object;
    invoke-static {p0, v1, v0, v1, p1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 664
    invoke-static {v0, p1, p2}, Ljava/lang/reflect/Array;->set(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 665
    if-ge p1, v2, :cond_2

    .line 666
    add-int/lit8 v1, p1, 0x1

    sub-int v3, v2, p1

    invoke-static {p0, p1, v0, v1, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 668
    :cond_2
    return-object v0

    .line 660
    .end local v0    # "result":Ljava/lang/Object;
    :cond_3
    new-instance v1, Ljava/lang/IndexOutOfBoundsException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v3, ", Length: "

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public static add([BB)[B
    .locals 2
    .param p0, "array"    # [B
    .param p1, "element"    # B

    .line 275
    sget-object v0, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    invoke-static {p0, v0}, Lorg/apache/commons/lang3/ArrayUtils;->copyArrayGrow1(Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [B

    .line 276
    .local v0, "newArray":[B
    array-length v1, v0

    add-int/lit8 v1, v1, -0x1

    aput-byte p1, v0, v1

    .line 277
    return-object v0
.end method

.method public static add([BIB)[B
    .locals 2
    .param p0, "array"    # [B
    .param p1, "index"    # I
    .param p2, "element"    # B
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 313
    invoke-static {p2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v0

    sget-object v1, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    invoke-static {p0, p1, v0, v1}, Lorg/apache/commons/lang3/ArrayUtils;->add(Ljava/lang/Object;ILjava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [B

    return-object v0
.end method

.method public static add([CC)[C
    .locals 2
    .param p0, "array"    # [C
    .param p1, "element"    # C

    .line 339
    sget-object v0, Ljava/lang/Character;->TYPE:Ljava/lang/Class;

    invoke-static {p0, v0}, Lorg/apache/commons/lang3/ArrayUtils;->copyArrayGrow1(Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [C

    .line 340
    .local v0, "newArray":[C
    array-length v1, v0

    add-int/lit8 v1, v1, -0x1

    aput-char p1, v0, v1

    .line 341
    return-object v0
.end method

.method public static add([CIC)[C
    .locals 2
    .param p0, "array"    # [C
    .param p1, "index"    # I
    .param p2, "element"    # C
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 378
    invoke-static {p2}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v0

    sget-object v1, Ljava/lang/Character;->TYPE:Ljava/lang/Class;

    invoke-static {p0, p1, v0, v1}, Lorg/apache/commons/lang3/ArrayUtils;->add(Ljava/lang/Object;ILjava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [C

    return-object v0
.end method

.method public static add([DD)[D
    .locals 2
    .param p0, "array"    # [D
    .param p1, "element"    # D

    .line 405
    sget-object v0, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    invoke-static {p0, v0}, Lorg/apache/commons/lang3/ArrayUtils;->copyArrayGrow1(Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [D

    .line 406
    .local v0, "newArray":[D
    array-length v1, v0

    add-int/lit8 v1, v1, -0x1

    aput-wide p1, v0, v1

    .line 407
    return-object v0
.end method

.method public static add([DID)[D
    .locals 2
    .param p0, "array"    # [D
    .param p1, "index"    # I
    .param p2, "element"    # D
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 443
    invoke-static {p2, p3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    sget-object v1, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    invoke-static {p0, p1, v0, v1}, Lorg/apache/commons/lang3/ArrayUtils;->add(Ljava/lang/Object;ILjava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [D

    return-object v0
.end method

.method public static add([FF)[F
    .locals 2
    .param p0, "array"    # [F
    .param p1, "element"    # F

    .line 469
    sget-object v0, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    invoke-static {p0, v0}, Lorg/apache/commons/lang3/ArrayUtils;->copyArrayGrow1(Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [F

    .line 470
    .local v0, "newArray":[F
    array-length v1, v0

    add-int/lit8 v1, v1, -0x1

    aput p1, v0, v1

    .line 471
    return-object v0
.end method

.method public static add([FIF)[F
    .locals 2
    .param p0, "array"    # [F
    .param p1, "index"    # I
    .param p2, "element"    # F
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 507
    invoke-static {p2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    sget-object v1, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    invoke-static {p0, p1, v0, v1}, Lorg/apache/commons/lang3/ArrayUtils;->add(Ljava/lang/Object;ILjava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [F

    return-object v0
.end method

.method public static add([II)[I
    .locals 2
    .param p0, "array"    # [I
    .param p1, "element"    # I

    .line 533
    sget-object v0, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    invoke-static {p0, v0}, Lorg/apache/commons/lang3/ArrayUtils;->copyArrayGrow1(Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [I

    .line 534
    .local v0, "newArray":[I
    array-length v1, v0

    add-int/lit8 v1, v1, -0x1

    aput p1, v0, v1

    .line 535
    return-object v0
.end method

.method public static add([III)[I
    .locals 2
    .param p0, "array"    # [I
    .param p1, "index"    # I
    .param p2, "element"    # I
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 571
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    sget-object v1, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    invoke-static {p0, p1, v0, v1}, Lorg/apache/commons/lang3/ArrayUtils;->add(Ljava/lang/Object;ILjava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [I

    return-object v0
.end method

.method public static add([JIJ)[J
    .locals 2
    .param p0, "array"    # [J
    .param p1, "index"    # I
    .param p2, "element"    # J
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 607
    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    sget-object v1, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    invoke-static {p0, p1, v0, v1}, Lorg/apache/commons/lang3/ArrayUtils;->add(Ljava/lang/Object;ILjava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [J

    return-object v0
.end method

.method public static add([JJ)[J
    .locals 2
    .param p0, "array"    # [J
    .param p1, "element"    # J

    .line 633
    sget-object v0, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    invoke-static {p0, v0}, Lorg/apache/commons/lang3/ArrayUtils;->copyArrayGrow1(Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [J

    .line 634
    .local v0, "newArray":[J
    array-length v1, v0

    add-int/lit8 v1, v1, -0x1

    aput-wide p1, v0, v1

    .line 635
    return-object v0
.end method

.method public static add([Ljava/lang/Object;ILjava/lang/Object;)[Ljava/lang/Object;
    .locals 2
    .param p1, "index"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">([TT;ITT;)[TT;"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 771
    .local p0, "array":[Ljava/lang/Object;, "[TT;"
    .local p2, "element":Ljava/lang/Object;, "TT;"
    if-eqz p0, :cond_0

    .line 772
    invoke-static {p0}, Lorg/apache/commons/lang3/ArrayUtils;->getComponentType([Ljava/lang/Object;)Ljava/lang/Class;

    move-result-object v0

    .local v0, "clazz":Ljava/lang/Class;, "Ljava/lang/Class<TT;>;"
    goto :goto_0

    .line 773
    .end local v0    # "clazz":Ljava/lang/Class;, "Ljava/lang/Class<TT;>;"
    :cond_0
    if-eqz p2, :cond_1

    .line 774
    invoke-static {p2}, Lorg/apache/commons/lang3/ObjectUtils;->getClass(Ljava/lang/Object;)Ljava/lang/Class;

    move-result-object v0

    .line 778
    .restart local v0    # "clazz":Ljava/lang/Class;, "Ljava/lang/Class<TT;>;"
    :goto_0
    invoke-static {p0, p1, p2, v0}, Lorg/apache/commons/lang3/ArrayUtils;->add(Ljava/lang/Object;ILjava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Ljava/lang/Object;

    return-object v1

    .line 776
    .end local v0    # "clazz":Ljava/lang/Class;, "Ljava/lang/Class<TT;>;"
    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Array and element cannot both be null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static add([Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">([TT;TT;)[TT;"
        }
    .end annotation

    .line 814
    .local p0, "array":[Ljava/lang/Object;, "[TT;"
    .local p1, "element":Ljava/lang/Object;, "TT;"
    if-eqz p0, :cond_0

    .line 815
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    move-result-object v0

    .local v0, "type":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    goto :goto_0

    .line 816
    .end local v0    # "type":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    :cond_0
    if-eqz p1, :cond_1

    .line 817
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    .line 823
    .restart local v0    # "type":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    :goto_0
    invoke-static {p0, v0}, Lorg/apache/commons/lang3/ArrayUtils;->copyArrayGrow1(Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Ljava/lang/Object;

    .line 824
    .local v1, "newArray":[Ljava/lang/Object;, "[TT;"
    array-length v2, v1

    add-int/lit8 v2, v2, -0x1

    aput-object p1, v1, v2

    .line 825
    return-object v1

    .line 819
    .end local v0    # "type":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    .end local v1    # "newArray":[Ljava/lang/Object;, "[TT;"
    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Arguments cannot both be null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static add([SIS)[S
    .locals 2
    .param p0, "array"    # [S
    .param p1, "index"    # I
    .param p2, "element"    # S
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 704
    invoke-static {p2}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v0

    sget-object v1, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    invoke-static {p0, p1, v0, v1}, Lorg/apache/commons/lang3/ArrayUtils;->add(Ljava/lang/Object;ILjava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [S

    return-object v0
.end method

.method public static add([SS)[S
    .locals 2
    .param p0, "array"    # [S
    .param p1, "element"    # S

    .line 730
    sget-object v0, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    invoke-static {p0, v0}, Lorg/apache/commons/lang3/ArrayUtils;->copyArrayGrow1(Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [S

    .line 731
    .local v0, "newArray":[S
    array-length v1, v0

    add-int/lit8 v1, v1, -0x1

    aput-short p1, v0, v1

    .line 732
    return-object v0
.end method

.method public static add([ZIZ)[Z
    .locals 2
    .param p0, "array"    # [Z
    .param p1, "index"    # I
    .param p2, "element"    # Z
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 249
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    sget-object v1, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    invoke-static {p0, p1, v0, v1}, Lorg/apache/commons/lang3/ArrayUtils;->add(Ljava/lang/Object;ILjava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Z

    return-object v0
.end method

.method public static add([ZZ)[Z
    .locals 2
    .param p0, "array"    # [Z
    .param p1, "element"    # Z

    .line 212
    sget-object v0, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    invoke-static {p0, v0}, Lorg/apache/commons/lang3/ArrayUtils;->copyArrayGrow1(Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Z

    .line 213
    .local v0, "newArray":[Z
    array-length v1, v0

    add-int/lit8 v1, v1, -0x1

    aput-boolean p1, v0, v1

    .line 214
    return-object v0
.end method

.method public static varargs addAll([B[B)[B
    .locals 4
    .param p0, "array1"    # [B
    .param p1, "array2"    # [B

    .line 878
    if-nez p0, :cond_0

    .line 879
    invoke-static {p1}, Lorg/apache/commons/lang3/ArrayUtils;->clone([B)[B

    move-result-object v0

    return-object v0

    .line 881
    :cond_0
    if-nez p1, :cond_1

    .line 882
    invoke-static {p0}, Lorg/apache/commons/lang3/ArrayUtils;->clone([B)[B

    move-result-object v0

    return-object v0

    .line 884
    :cond_1
    array-length v0, p0

    array-length v1, p1

    add-int/2addr v0, v1

    new-array v0, v0, [B

    .line 885
    .local v0, "joinedArray":[B
    array-length v1, p0

    const/4 v2, 0x0

    invoke-static {p0, v2, v0, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 886
    array-length v1, p0

    array-length v3, p1

    invoke-static {p1, v2, v0, v1, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 887
    return-object v0
.end method

.method public static varargs addAll([C[C)[C
    .locals 4
    .param p0, "array1"    # [C
    .param p1, "array2"    # [C

    .line 909
    if-nez p0, :cond_0

    .line 910
    invoke-static {p1}, Lorg/apache/commons/lang3/ArrayUtils;->clone([C)[C

    move-result-object v0

    return-object v0

    .line 912
    :cond_0
    if-nez p1, :cond_1

    .line 913
    invoke-static {p0}, Lorg/apache/commons/lang3/ArrayUtils;->clone([C)[C

    move-result-object v0

    return-object v0

    .line 915
    :cond_1
    array-length v0, p0

    array-length v1, p1

    add-int/2addr v0, v1

    new-array v0, v0, [C

    .line 916
    .local v0, "joinedArray":[C
    array-length v1, p0

    const/4 v2, 0x0

    invoke-static {p0, v2, v0, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 917
    array-length v1, p0

    array-length v3, p1

    invoke-static {p1, v2, v0, v1, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 918
    return-object v0
.end method

.method public static varargs addAll([D[D)[D
    .locals 4
    .param p0, "array1"    # [D
    .param p1, "array2"    # [D

    .line 940
    if-nez p0, :cond_0

    .line 941
    invoke-static {p1}, Lorg/apache/commons/lang3/ArrayUtils;->clone([D)[D

    move-result-object v0

    return-object v0

    .line 943
    :cond_0
    if-nez p1, :cond_1

    .line 944
    invoke-static {p0}, Lorg/apache/commons/lang3/ArrayUtils;->clone([D)[D

    move-result-object v0

    return-object v0

    .line 946
    :cond_1
    array-length v0, p0

    array-length v1, p1

    add-int/2addr v0, v1

    new-array v0, v0, [D

    .line 947
    .local v0, "joinedArray":[D
    array-length v1, p0

    const/4 v2, 0x0

    invoke-static {p0, v2, v0, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 948
    array-length v1, p0

    array-length v3, p1

    invoke-static {p1, v2, v0, v1, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 949
    return-object v0
.end method

.method public static varargs addAll([F[F)[F
    .locals 4
    .param p0, "array1"    # [F
    .param p1, "array2"    # [F

    .line 971
    if-nez p0, :cond_0

    .line 972
    invoke-static {p1}, Lorg/apache/commons/lang3/ArrayUtils;->clone([F)[F

    move-result-object v0

    return-object v0

    .line 974
    :cond_0
    if-nez p1, :cond_1

    .line 975
    invoke-static {p0}, Lorg/apache/commons/lang3/ArrayUtils;->clone([F)[F

    move-result-object v0

    return-object v0

    .line 977
    :cond_1
    array-length v0, p0

    array-length v1, p1

    add-int/2addr v0, v1

    new-array v0, v0, [F

    .line 978
    .local v0, "joinedArray":[F
    array-length v1, p0

    const/4 v2, 0x0

    invoke-static {p0, v2, v0, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 979
    array-length v1, p0

    array-length v3, p1

    invoke-static {p1, v2, v0, v1, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 980
    return-object v0
.end method

.method public static varargs addAll([I[I)[I
    .locals 4
    .param p0, "array1"    # [I
    .param p1, "array2"    # [I

    .line 1002
    if-nez p0, :cond_0

    .line 1003
    invoke-static {p1}, Lorg/apache/commons/lang3/ArrayUtils;->clone([I)[I

    move-result-object v0

    return-object v0

    .line 1005
    :cond_0
    if-nez p1, :cond_1

    .line 1006
    invoke-static {p0}, Lorg/apache/commons/lang3/ArrayUtils;->clone([I)[I

    move-result-object v0

    return-object v0

    .line 1008
    :cond_1
    array-length v0, p0

    array-length v1, p1

    add-int/2addr v0, v1

    new-array v0, v0, [I

    .line 1009
    .local v0, "joinedArray":[I
    array-length v1, p0

    const/4 v2, 0x0

    invoke-static {p0, v2, v0, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 1010
    array-length v1, p0

    array-length v3, p1

    invoke-static {p1, v2, v0, v1, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 1011
    return-object v0
.end method

.method public static varargs addAll([J[J)[J
    .locals 4
    .param p0, "array1"    # [J
    .param p1, "array2"    # [J

    .line 1033
    if-nez p0, :cond_0

    .line 1034
    invoke-static {p1}, Lorg/apache/commons/lang3/ArrayUtils;->clone([J)[J

    move-result-object v0

    return-object v0

    .line 1036
    :cond_0
    if-nez p1, :cond_1

    .line 1037
    invoke-static {p0}, Lorg/apache/commons/lang3/ArrayUtils;->clone([J)[J

    move-result-object v0

    return-object v0

    .line 1039
    :cond_1
    array-length v0, p0

    array-length v1, p1

    add-int/2addr v0, v1

    new-array v0, v0, [J

    .line 1040
    .local v0, "joinedArray":[J
    array-length v1, p0

    const/4 v2, 0x0

    invoke-static {p0, v2, v0, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 1041
    array-length v1, p0

    array-length v3, p1

    invoke-static {p1, v2, v0, v1, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 1042
    return-object v0
.end method

.method public static varargs addAll([Ljava/lang/Object;[Ljava/lang/Object;)[Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">([TT;[TT;)[TT;"
        }
    .end annotation

    .line 1102
    .local p0, "array1":[Ljava/lang/Object;, "[TT;"
    .local p1, "array2":[Ljava/lang/Object;, "[TT;"
    if-nez p0, :cond_0

    .line 1103
    invoke-static {p1}, Lorg/apache/commons/lang3/ArrayUtils;->clone([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    return-object v0

    .line 1105
    :cond_0
    if-nez p1, :cond_1

    .line 1106
    invoke-static {p0}, Lorg/apache/commons/lang3/ArrayUtils;->clone([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    return-object v0

    .line 1108
    :cond_1
    invoke-static {p0}, Lorg/apache/commons/lang3/ArrayUtils;->getComponentType([Ljava/lang/Object;)Ljava/lang/Class;

    move-result-object v0

    .line 1109
    .local v0, "type1":Ljava/lang/Class;, "Ljava/lang/Class<TT;>;"
    array-length v1, p0

    array-length v2, p1

    add-int/2addr v1, v2

    invoke-static {v0, v1}, Lorg/apache/commons/lang3/ArrayUtils;->newInstance(Ljava/lang/Class;I)[Ljava/lang/Object;

    move-result-object v1

    .line 1110
    .local v1, "joinedArray":[Ljava/lang/Object;, "[TT;"
    array-length v2, p0

    const/4 v3, 0x0

    invoke-static {p0, v3, v1, v3, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 1112
    :try_start_0
    array-length v2, p0

    array-length v4, p1

    invoke-static {p1, v3, v1, v2, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V
    :try_end_0
    .catch Ljava/lang/ArrayStoreException; {:try_start_0 .. :try_end_0} :catch_0

    .line 1126
    nop

    .line 1127
    return-object v1

    .line 1113
    :catch_0
    move-exception v2

    .line 1120
    .local v2, "ase":Ljava/lang/ArrayStoreException;
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    move-result-object v3

    .line 1121
    .local v3, "type2":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    invoke-virtual {v0, v3}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v4

    if-nez v4, :cond_2

    .line 1122
    new-instance v4, Ljava/lang/IllegalArgumentException;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "Cannot store "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    const-string v6, " in an array of "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    .line 1123
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v4, v5, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v4

    .line 1125
    :cond_2
    throw v2
.end method

.method public static varargs addAll([S[S)[S
    .locals 4
    .param p0, "array1"    # [S
    .param p1, "array2"    # [S

    .line 1064
    if-nez p0, :cond_0

    .line 1065
    invoke-static {p1}, Lorg/apache/commons/lang3/ArrayUtils;->clone([S)[S

    move-result-object v0

    return-object v0

    .line 1067
    :cond_0
    if-nez p1, :cond_1

    .line 1068
    invoke-static {p0}, Lorg/apache/commons/lang3/ArrayUtils;->clone([S)[S

    move-result-object v0

    return-object v0

    .line 1070
    :cond_1
    array-length v0, p0

    array-length v1, p1

    add-int/2addr v0, v1

    new-array v0, v0, [S

    .line 1071
    .local v0, "joinedArray":[S
    array-length v1, p0

    const/4 v2, 0x0

    invoke-static {p0, v2, v0, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 1072
    array-length v1, p0

    array-length v3, p1

    invoke-static {p1, v2, v0, v1, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 1073
    return-object v0
.end method

.method public static varargs addAll([Z[Z)[Z
    .locals 4
    .param p0, "array1"    # [Z
    .param p1, "array2"    # [Z

    .line 847
    if-nez p0, :cond_0

    .line 848
    invoke-static {p1}, Lorg/apache/commons/lang3/ArrayUtils;->clone([Z)[Z

    move-result-object v0

    return-object v0

    .line 850
    :cond_0
    if-nez p1, :cond_1

    .line 851
    invoke-static {p0}, Lorg/apache/commons/lang3/ArrayUtils;->clone([Z)[Z

    move-result-object v0

    return-object v0

    .line 853
    :cond_1
    array-length v0, p0

    array-length v1, p1

    add-int/2addr v0, v1

    new-array v0, v0, [Z

    .line 854
    .local v0, "joinedArray":[Z
    array-length v1, p0

    const/4 v2, 0x0

    invoke-static {p0, v2, v0, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 855
    array-length v1, p0

    array-length v3, p1

    invoke-static {p1, v2, v0, v1, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 856
    return-object v0
.end method

.method public static addFirst([BB)[B
    .locals 2
    .param p0, "array"    # [B
    .param p1, "element"    # B

    .line 1179
    if-nez p0, :cond_0

    invoke-static {p0, p1}, Lorg/apache/commons/lang3/ArrayUtils;->add([BB)[B

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    new-array v0, v0, [B

    const/4 v1, 0x0

    aput-byte p1, v0, v1

    invoke-static {v1, p0, v0}, Lorg/apache/commons/lang3/ArrayUtils;->insert(I[B[B)[B

    move-result-object v0

    :goto_0
    return-object v0
.end method

.method public static addFirst([CC)[C
    .locals 2
    .param p0, "array"    # [C
    .param p1, "element"    # C

    .line 1205
    if-nez p0, :cond_0

    invoke-static {p0, p1}, Lorg/apache/commons/lang3/ArrayUtils;->add([CC)[C

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    new-array v0, v0, [C

    const/4 v1, 0x0

    aput-char p1, v0, v1

    invoke-static {v1, p0, v0}, Lorg/apache/commons/lang3/ArrayUtils;->insert(I[C[C)[C

    move-result-object v0

    :goto_0
    return-object v0
.end method

.method public static addFirst([DD)[D
    .locals 2
    .param p0, "array"    # [D
    .param p1, "element"    # D

    .line 1231
    if-nez p0, :cond_0

    invoke-static {p0, p1, p2}, Lorg/apache/commons/lang3/ArrayUtils;->add([DD)[D

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    new-array v0, v0, [D

    const/4 v1, 0x0

    aput-wide p1, v0, v1

    invoke-static {v1, p0, v0}, Lorg/apache/commons/lang3/ArrayUtils;->insert(I[D[D)[D

    move-result-object v0

    :goto_0
    return-object v0
.end method

.method public static addFirst([FF)[F
    .locals 2
    .param p0, "array"    # [F
    .param p1, "element"    # F

    .line 1257
    if-nez p0, :cond_0

    invoke-static {p0, p1}, Lorg/apache/commons/lang3/ArrayUtils;->add([FF)[F

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    new-array v0, v0, [F

    const/4 v1, 0x0

    aput p1, v0, v1

    invoke-static {v1, p0, v0}, Lorg/apache/commons/lang3/ArrayUtils;->insert(I[F[F)[F

    move-result-object v0

    :goto_0
    return-object v0
.end method

.method public static addFirst([II)[I
    .locals 2
    .param p0, "array"    # [I
    .param p1, "element"    # I

    .line 1283
    if-nez p0, :cond_0

    invoke-static {p0, p1}, Lorg/apache/commons/lang3/ArrayUtils;->add([II)[I

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    filled-new-array {p1}, [I

    move-result-object v1

    invoke-static {v0, p0, v1}, Lorg/apache/commons/lang3/ArrayUtils;->insert(I[I[I)[I

    move-result-object v0

    :goto_0
    return-object v0
.end method

.method public static addFirst([JJ)[J
    .locals 2
    .param p0, "array"    # [J
    .param p1, "element"    # J

    .line 1309
    if-nez p0, :cond_0

    invoke-static {p0, p1, p2}, Lorg/apache/commons/lang3/ArrayUtils;->add([JJ)[J

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    new-array v0, v0, [J

    const/4 v1, 0x0

    aput-wide p1, v0, v1

    invoke-static {v1, p0, v0}, Lorg/apache/commons/lang3/ArrayUtils;->insert(I[J[J)[J

    move-result-object v0

    :goto_0
    return-object v0
.end method

.method public static addFirst([Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">([TT;TT;)[TT;"
        }
    .end annotation

    .line 1366
    .local p0, "array":[Ljava/lang/Object;, "[TT;"
    .local p1, "element":Ljava/lang/Object;, "TT;"
    if-nez p0, :cond_0

    invoke-static {p0, p1}, Lorg/apache/commons/lang3/ArrayUtils;->add([Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0, p0, v1}, Lorg/apache/commons/lang3/ArrayUtils;->insert(I[Ljava/lang/Object;[Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    :goto_0
    return-object v0
.end method

.method public static addFirst([SS)[S
    .locals 2
    .param p0, "array"    # [S
    .param p1, "element"    # S

    .line 1335
    if-nez p0, :cond_0

    invoke-static {p0, p1}, Lorg/apache/commons/lang3/ArrayUtils;->add([SS)[S

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    new-array v0, v0, [S

    const/4 v1, 0x0

    aput-short p1, v0, v1

    invoke-static {v1, p0, v0}, Lorg/apache/commons/lang3/ArrayUtils;->insert(I[S[S)[S

    move-result-object v0

    :goto_0
    return-object v0
.end method

.method public static addFirst([ZZ)[Z
    .locals 2
    .param p0, "array"    # [Z
    .param p1, "element"    # Z

    .line 1153
    if-nez p0, :cond_0

    invoke-static {p0, p1}, Lorg/apache/commons/lang3/ArrayUtils;->add([ZZ)[Z

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    new-array v0, v0, [Z

    const/4 v1, 0x0

    aput-boolean p1, v0, v1

    invoke-static {v1, p0, v0}, Lorg/apache/commons/lang3/ArrayUtils;->insert(I[Z[Z)[Z

    move-result-object v0

    :goto_0
    return-object v0
.end method

.method public static clone([B)[B
    .locals 1
    .param p0, "array"    # [B

    .line 1394
    if-eqz p0, :cond_0

    invoke-virtual {p0}, [B->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [B

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public static clone([C)[C
    .locals 1
    .param p0, "array"    # [C

    .line 1408
    if-eqz p0, :cond_0

    invoke-virtual {p0}, [C->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [C

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public static clone([D)[D
    .locals 1
    .param p0, "array"    # [D

    .line 1422
    if-eqz p0, :cond_0

    invoke-virtual {p0}, [D->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [D

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public static clone([F)[F
    .locals 1
    .param p0, "array"    # [F

    .line 1436
    if-eqz p0, :cond_0

    invoke-virtual {p0}, [F->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [F

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public static clone([I)[I
    .locals 1
    .param p0, "array"    # [I

    .line 1450
    if-eqz p0, :cond_0

    invoke-virtual {p0}, [I->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [I

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public static clone([J)[J
    .locals 1
    .param p0, "array"    # [J

    .line 1464
    if-eqz p0, :cond_0

    invoke-virtual {p0}, [J->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [J

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public static clone([Ljava/lang/Object;)[Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">([TT;)[TT;"
        }
    .end annotation

    .line 1497
    .local p0, "array":[Ljava/lang/Object;, "[TT;"
    if-eqz p0, :cond_0

    invoke-virtual {p0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/Object;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public static clone([S)[S
    .locals 1
    .param p0, "array"    # [S

    .line 1478
    if-eqz p0, :cond_0

    invoke-virtual {p0}, [S->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [S

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public static clone([Z)[Z
    .locals 1
    .param p0, "array"    # [Z

    .line 1380
    if-eqz p0, :cond_0

    invoke-virtual {p0}, [Z->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Z

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public static contains([BB)Z
    .locals 2
    .param p0, "array"    # [B
    .param p1, "valueToFind"    # B

    .line 1525
    invoke-static {p0, p1}, Lorg/apache/commons/lang3/ArrayUtils;->indexOf([BB)I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public static contains([CC)Z
    .locals 2
    .param p0, "array"    # [C
    .param p1, "valueToFind"    # C

    .line 1540
    invoke-static {p0, p1}, Lorg/apache/commons/lang3/ArrayUtils;->indexOf([CC)I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public static contains([DD)Z
    .locals 2
    .param p0, "array"    # [D
    .param p1, "valueToFind"    # D

    .line 1554
    invoke-static {p0, p1, p2}, Lorg/apache/commons/lang3/ArrayUtils;->indexOf([DD)I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public static contains([DDD)Z
    .locals 6
    .param p0, "array"    # [D
    .param p1, "valueToFind"    # D
    .param p3, "tolerance"    # D

    .line 1572
    const/4 v3, 0x0

    move-object v0, p0

    move-wide v1, p1

    move-wide v4, p3

    .end local p0    # "array":[D
    .end local p1    # "valueToFind":D
    .end local p3    # "tolerance":D
    .local v0, "array":[D
    .local v1, "valueToFind":D
    .local v4, "tolerance":D
    invoke-static/range {v0 .. v5}, Lorg/apache/commons/lang3/ArrayUtils;->indexOf([DDID)I

    move-result p0

    const/4 p1, -0x1

    if-eq p0, p1, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static contains([FF)Z
    .locals 2
    .param p0, "array"    # [F
    .param p1, "valueToFind"    # F

    .line 1586
    invoke-static {p0, p1}, Lorg/apache/commons/lang3/ArrayUtils;->indexOf([FF)I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public static contains([II)Z
    .locals 2
    .param p0, "array"    # [I
    .param p1, "valueToFind"    # I

    .line 1600
    invoke-static {p0, p1}, Lorg/apache/commons/lang3/ArrayUtils;->indexOf([II)I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public static contains([JJ)Z
    .locals 2
    .param p0, "array"    # [J
    .param p1, "valueToFind"    # J

    .line 1614
    invoke-static {p0, p1, p2}, Lorg/apache/commons/lang3/ArrayUtils;->indexOf([JJ)I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public static contains([Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 2
    .param p0, "array"    # [Ljava/lang/Object;
    .param p1, "objectToFind"    # Ljava/lang/Object;

    .line 1628
    invoke-static {p0, p1}, Lorg/apache/commons/lang3/ArrayUtils;->indexOf([Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public static contains([SS)Z
    .locals 2
    .param p0, "array"    # [S
    .param p1, "valueToFind"    # S

    .line 1642
    invoke-static {p0, p1}, Lorg/apache/commons/lang3/ArrayUtils;->indexOf([SS)I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public static contains([ZZ)Z
    .locals 2
    .param p0, "array"    # [Z
    .param p1, "valueToFind"    # Z

    .line 1511
    invoke-static {p0, p1}, Lorg/apache/commons/lang3/ArrayUtils;->indexOf([ZZ)I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public static varargs containsAny([Ljava/lang/Object;[Ljava/lang/Object;)Z
    .locals 2
    .param p0, "array"    # [Ljava/lang/Object;
    .param p1, "objectsToFind"    # [Ljava/lang/Object;

    .line 1657
    invoke-static {p1}, Lorg/apache/commons/lang3/stream/Streams;->of([Ljava/lang/Object;)Ljava/util/stream/Stream;

    move-result-object v0

    new-instance v1, Lorg/apache/commons/lang3/ArrayUtils$$ExternalSyntheticLambda0;

    invoke-direct {v1, p0}, Lorg/apache/commons/lang3/ArrayUtils$$ExternalSyntheticLambda0;-><init>([Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/stream/Stream;->anyMatch(Ljava/util/function/Predicate;)Z

    move-result v0

    return v0
.end method

.method private static copyArrayGrow1(Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;
    .locals 3
    .param p0, "array"    # Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Ljava/lang/Class<",
            "*>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1670
    .local p1, "newArrayComponentType":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    if-eqz p0, :cond_0

    .line 1671
    invoke-static {p0}, Ljava/lang/reflect/Array;->getLength(Ljava/lang/Object;)I

    move-result v0

    .line 1672
    .local v0, "arrayLength":I
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    move-result-object v1

    add-int/lit8 v2, v0, 0x1

    invoke-static {v1, v2}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;I)Ljava/lang/Object;

    move-result-object v1

    .line 1673
    .local v1, "newArray":Ljava/lang/Object;
    const/4 v2, 0x0

    invoke-static {p0, v2, v1, v2, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 1674
    return-object v1

    .line 1676
    .end local v0    # "arrayLength":I
    .end local v1    # "newArray":Ljava/lang/Object;
    :cond_0
    const/4 v0, 0x1

    invoke-static {p1, v0}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;I)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public static get([Ljava/lang/Object;I)Ljava/lang/Object;
    .locals 1
    .param p1, "index"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">([TT;I)TT;"
        }
    .end annotation

    .line 1689
    .local p0, "array":[Ljava/lang/Object;, "[TT;"
    const/4 v0, 0x0

    invoke-static {p0, p1, v0}, Lorg/apache/commons/lang3/ArrayUtils;->get([Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public static get([Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .param p1, "index"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">([TT;ITT;)TT;"
        }
    .end annotation

    .line 1703
    .local p0, "array":[Ljava/lang/Object;, "[TT;"
    .local p2, "defaultValue":Ljava/lang/Object;, "TT;"
    invoke-static {p0, p1}, Lorg/apache/commons/lang3/ArrayUtils;->isArrayIndexValid([Ljava/lang/Object;I)Z

    move-result v0

    if-eqz v0, :cond_0

    aget-object v0, p0, p1

    goto :goto_0

    :cond_0
    move-object v0, p2

    :goto_0
    return-object v0
.end method

.method public static getComponentType([Ljava/lang/Object;)Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">([TT;)",
            "Ljava/lang/Class<",
            "TT;>;"
        }
    .end annotation

    .line 1715
    .local p0, "array":[Ljava/lang/Object;, "[TT;"
    invoke-static {p0}, Lorg/apache/commons/lang3/ObjectUtils;->getClass(Ljava/lang/Object;)Ljava/lang/Class;

    move-result-object v0

    invoke-static {v0}, Lorg/apache/commons/lang3/ClassUtils;->getComponentType(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object v0

    return-object v0
.end method

.method public static getLength(Ljava/lang/Object;)I
    .locals 1
    .param p0, "array"    # Ljava/lang/Object;

    .line 1739
    if-eqz p0, :cond_0

    invoke-static {p0}, Ljava/lang/reflect/Array;->getLength(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public static hashCode(Ljava/lang/Object;)I
    .locals 1
    .param p0, "array"    # Ljava/lang/Object;

    .line 1752
    new-instance v0, Lorg/apache/commons/lang3/builder/HashCodeBuilder;

    invoke-direct {v0}, Lorg/apache/commons/lang3/builder/HashCodeBuilder;-><init>()V

    invoke-virtual {v0, p0}, Lorg/apache/commons/lang3/builder/HashCodeBuilder;->append(Ljava/lang/Object;)Lorg/apache/commons/lang3/builder/HashCodeBuilder;

    move-result-object v0

    invoke-virtual {v0}, Lorg/apache/commons/lang3/builder/HashCodeBuilder;->toHashCode()I

    move-result v0

    return v0
.end method

.method public static indexOf([BB)I
    .locals 1
    .param p0, "array"    # [B
    .param p1, "valueToFind"    # B

    .line 2340
    const/4 v0, 0x0

    invoke-static {p0, p1, v0}, Lorg/apache/commons/lang3/ArrayUtils;->indexOf([BBI)I

    move-result v0

    return v0
.end method

.method public static indexOf([BBI)I
    .locals 3
    .param p0, "array"    # [B
    .param p1, "valueToFind"    # B
    .param p2, "startIndex"    # I

    .line 2360
    const/4 v0, -0x1

    if-nez p0, :cond_0

    .line 2361
    return v0

    .line 2363
    :cond_0
    if-gez p2, :cond_1

    .line 2364
    const/4 p2, 0x0

    .line 2366
    :cond_1
    move v1, p2

    .local v1, "i":I
    :goto_0
    array-length v2, p0

    if-ge v1, v2, :cond_3

    .line 2367
    aget-byte v2, p0, v1

    if-ne p1, v2, :cond_2

    .line 2368
    return v1

    .line 2366
    :cond_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 2371
    .end local v1    # "i":I
    :cond_3
    return v0
.end method

.method public static indexOf([CC)I
    .locals 1
    .param p0, "array"    # [C
    .param p1, "valueToFind"    # C

    .line 2387
    const/4 v0, 0x0

    invoke-static {p0, p1, v0}, Lorg/apache/commons/lang3/ArrayUtils;->indexOf([CCI)I

    move-result v0

    return v0
.end method

.method public static indexOf([CCI)I
    .locals 3
    .param p0, "array"    # [C
    .param p1, "valueToFind"    # C
    .param p2, "startIndex"    # I

    .line 2408
    const/4 v0, -0x1

    if-nez p0, :cond_0

    .line 2409
    return v0

    .line 2411
    :cond_0
    if-gez p2, :cond_1

    .line 2412
    const/4 p2, 0x0

    .line 2414
    :cond_1
    move v1, p2

    .local v1, "i":I
    :goto_0
    array-length v2, p0

    if-ge v1, v2, :cond_3

    .line 2415
    aget-char v2, p0, v1

    if-ne p1, v2, :cond_2

    .line 2416
    return v1

    .line 2414
    :cond_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 2419
    .end local v1    # "i":I
    :cond_3
    return v0
.end method

.method public static indexOf([DD)I
    .locals 1
    .param p0, "array"    # [D
    .param p1, "valueToFind"    # D

    .line 2434
    const/4 v0, 0x0

    invoke-static {p0, p1, p2, v0}, Lorg/apache/commons/lang3/ArrayUtils;->indexOf([DDI)I

    move-result v0

    return v0
.end method

.method public static indexOf([DDD)I
    .locals 6
    .param p0, "array"    # [D
    .param p1, "valueToFind"    # D
    .param p3, "tolerance"    # D

    .line 2452
    const/4 v3, 0x0

    move-object v0, p0

    move-wide v1, p1

    move-wide v4, p3

    .end local p0    # "array":[D
    .end local p1    # "valueToFind":D
    .end local p3    # "tolerance":D
    .local v0, "array":[D
    .local v1, "valueToFind":D
    .local v4, "tolerance":D
    invoke-static/range {v0 .. v5}, Lorg/apache/commons/lang3/ArrayUtils;->indexOf([DDID)I

    move-result p0

    return p0
.end method

.method public static indexOf([DDI)I
    .locals 6
    .param p0, "array"    # [D
    .param p1, "valueToFind"    # D
    .param p3, "startIndex"    # I

    .line 2472
    invoke-static {p0}, Lorg/apache/commons/lang3/ArrayUtils;->isEmpty([D)Z

    move-result v0

    const/4 v1, -0x1

    if-eqz v0, :cond_0

    .line 2473
    return v1

    .line 2475
    :cond_0
    if-gez p3, :cond_1

    .line 2476
    const/4 p3, 0x0

    .line 2478
    :cond_1
    invoke-static {p1, p2}, Ljava/lang/Double;->isNaN(D)Z

    move-result v0

    .line 2479
    .local v0, "searchNaN":Z
    move v2, p3

    .local v2, "i":I
    :goto_0
    array-length v3, p0

    if-ge v2, v3, :cond_4

    .line 2480
    aget-wide v3, p0, v2

    .line 2481
    .local v3, "element":D
    cmpl-double v5, p1, v3

    if-eqz v5, :cond_3

    if-eqz v0, :cond_2

    invoke-static {v3, v4}, Ljava/lang/Double;->isNaN(D)Z

    move-result v5

    if-eqz v5, :cond_2

    goto :goto_1

    .line 2479
    .end local v3    # "element":D
    :cond_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 2482
    .restart local v3    # "element":D
    :cond_3
    :goto_1
    return v2

    .line 2485
    .end local v2    # "i":I
    .end local v3    # "element":D
    :cond_4
    return v1
.end method

.method public static indexOf([DDID)I
    .locals 8
    .param p0, "array"    # [D
    .param p1, "valueToFind"    # D
    .param p3, "startIndex"    # I
    .param p4, "tolerance"    # D

    .line 2508
    invoke-static {p0}, Lorg/apache/commons/lang3/ArrayUtils;->isEmpty([D)Z

    move-result v0

    const/4 v1, -0x1

    if-eqz v0, :cond_0

    .line 2509
    return v1

    .line 2511
    :cond_0
    if-gez p3, :cond_1

    .line 2512
    const/4 p3, 0x0

    .line 2514
    :cond_1
    sub-double v2, p1, p4

    .line 2515
    .local v2, "min":D
    add-double v4, p1, p4

    .line 2516
    .local v4, "max":D
    move v0, p3

    .local v0, "i":I
    :goto_0
    array-length v6, p0

    if-ge v0, v6, :cond_3

    .line 2517
    aget-wide v6, p0, v0

    cmpl-double v6, v6, v2

    if-ltz v6, :cond_2

    aget-wide v6, p0, v0

    cmpg-double v6, v6, v4

    if-gtz v6, :cond_2

    .line 2518
    return v0

    .line 2516
    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 2521
    .end local v0    # "i":I
    :cond_3
    return v1
.end method

.method public static indexOf([FF)I
    .locals 1
    .param p0, "array"    # [F
    .param p1, "valueToFind"    # F

    .line 2536
    const/4 v0, 0x0

    invoke-static {p0, p1, v0}, Lorg/apache/commons/lang3/ArrayUtils;->indexOf([FFI)I

    move-result v0

    return v0
.end method

.method public static indexOf([FFI)I
    .locals 5
    .param p0, "array"    # [F
    .param p1, "valueToFind"    # F
    .param p2, "startIndex"    # I

    .line 2556
    invoke-static {p0}, Lorg/apache/commons/lang3/ArrayUtils;->isEmpty([F)Z

    move-result v0

    const/4 v1, -0x1

    if-eqz v0, :cond_0

    .line 2557
    return v1

    .line 2559
    :cond_0
    if-gez p2, :cond_1

    .line 2560
    const/4 p2, 0x0

    .line 2562
    :cond_1
    invoke-static {p1}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    .line 2563
    .local v0, "searchNaN":Z
    move v2, p2

    .local v2, "i":I
    :goto_0
    array-length v3, p0

    if-ge v2, v3, :cond_4

    .line 2564
    aget v3, p0, v2

    .line 2565
    .local v3, "element":F
    cmpl-float v4, p1, v3

    if-eqz v4, :cond_3

    if-eqz v0, :cond_2

    invoke-static {v3}, Ljava/lang/Float;->isNaN(F)Z

    move-result v4

    if-eqz v4, :cond_2

    goto :goto_1

    .line 2563
    .end local v3    # "element":F
    :cond_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 2566
    .restart local v3    # "element":F
    :cond_3
    :goto_1
    return v2

    .line 2569
    .end local v2    # "i":I
    .end local v3    # "element":F
    :cond_4
    return v1
.end method

.method public static indexOf([II)I
    .locals 1
    .param p0, "array"    # [I
    .param p1, "valueToFind"    # I

    .line 2584
    const/4 v0, 0x0

    invoke-static {p0, p1, v0}, Lorg/apache/commons/lang3/ArrayUtils;->indexOf([III)I

    move-result v0

    return v0
.end method

.method public static indexOf([III)I
    .locals 3
    .param p0, "array"    # [I
    .param p1, "valueToFind"    # I
    .param p2, "startIndex"    # I

    .line 2604
    const/4 v0, -0x1

    if-nez p0, :cond_0

    .line 2605
    return v0

    .line 2607
    :cond_0
    if-gez p2, :cond_1

    .line 2608
    const/4 p2, 0x0

    .line 2610
    :cond_1
    move v1, p2

    .local v1, "i":I
    :goto_0
    array-length v2, p0

    if-ge v1, v2, :cond_3

    .line 2611
    aget v2, p0, v1

    if-ne p1, v2, :cond_2

    .line 2612
    return v1

    .line 2610
    :cond_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 2615
    .end local v1    # "i":I
    :cond_3
    return v0
.end method

.method public static indexOf([JJ)I
    .locals 1
    .param p0, "array"    # [J
    .param p1, "valueToFind"    # J

    .line 2630
    const/4 v0, 0x0

    invoke-static {p0, p1, p2, v0}, Lorg/apache/commons/lang3/ArrayUtils;->indexOf([JJI)I

    move-result v0

    return v0
.end method

.method public static indexOf([JJI)I
    .locals 4
    .param p0, "array"    # [J
    .param p1, "valueToFind"    # J
    .param p3, "startIndex"    # I

    .line 2650
    const/4 v0, -0x1

    if-nez p0, :cond_0

    .line 2651
    return v0

    .line 2653
    :cond_0
    if-gez p3, :cond_1

    .line 2654
    const/4 p3, 0x0

    .line 2656
    :cond_1
    move v1, p3

    .local v1, "i":I
    :goto_0
    array-length v2, p0

    if-ge v1, v2, :cond_3

    .line 2657
    aget-wide v2, p0, v1

    cmp-long v2, p1, v2

    if-nez v2, :cond_2

    .line 2658
    return v1

    .line 2656
    :cond_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 2661
    .end local v1    # "i":I
    :cond_3
    return v0
.end method

.method public static indexOf([Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 1
    .param p0, "array"    # [Ljava/lang/Object;
    .param p1, "objectToFind"    # Ljava/lang/Object;

    .line 2676
    const/4 v0, 0x0

    invoke-static {p0, p1, v0}, Lorg/apache/commons/lang3/ArrayUtils;->indexOf([Ljava/lang/Object;Ljava/lang/Object;I)I

    move-result v0

    return v0
.end method

.method public static indexOf([Ljava/lang/Object;Ljava/lang/Object;I)I
    .locals 3
    .param p0, "array"    # [Ljava/lang/Object;
    .param p1, "objectToFind"    # Ljava/lang/Object;
    .param p2, "startIndex"    # I

    .line 2696
    const/4 v0, -0x1

    if-nez p0, :cond_0

    .line 2697
    return v0

    .line 2699
    :cond_0
    if-gez p2, :cond_1

    .line 2700
    const/4 p2, 0x0

    .line 2702
    :cond_1
    if-nez p1, :cond_4

    .line 2703
    move v1, p2

    .local v1, "i":I
    :goto_0
    array-length v2, p0

    if-ge v1, v2, :cond_3

    .line 2704
    aget-object v2, p0, v1

    if-nez v2, :cond_2

    .line 2705
    return v1

    .line 2703
    :cond_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .end local v1    # "i":I
    :cond_3
    goto :goto_2

    .line 2709
    :cond_4
    move v1, p2

    .restart local v1    # "i":I
    :goto_1
    array-length v2, p0

    if-ge v1, v2, :cond_6

    .line 2710
    aget-object v2, p0, v1

    invoke-virtual {p1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_5

    .line 2711
    return v1

    .line 2709
    :cond_5
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 2715
    .end local v1    # "i":I
    :cond_6
    :goto_2
    return v0
.end method

.method public static indexOf([SS)I
    .locals 1
    .param p0, "array"    # [S
    .param p1, "valueToFind"    # S

    .line 2730
    const/4 v0, 0x0

    invoke-static {p0, p1, v0}, Lorg/apache/commons/lang3/ArrayUtils;->indexOf([SSI)I

    move-result v0

    return v0
.end method

.method public static indexOf([SSI)I
    .locals 3
    .param p0, "array"    # [S
    .param p1, "valueToFind"    # S
    .param p2, "startIndex"    # I

    .line 2750
    const/4 v0, -0x1

    if-nez p0, :cond_0

    .line 2751
    return v0

    .line 2753
    :cond_0
    if-gez p2, :cond_1

    .line 2754
    const/4 p2, 0x0

    .line 2756
    :cond_1
    move v1, p2

    .local v1, "i":I
    :goto_0
    array-length v2, p0

    if-ge v1, v2, :cond_3

    .line 2757
    aget-short v2, p0, v1

    if-ne p1, v2, :cond_2

    .line 2758
    return v1

    .line 2756
    :cond_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 2761
    .end local v1    # "i":I
    :cond_3
    return v0
.end method

.method public static indexOf([ZZ)I
    .locals 1
    .param p0, "array"    # [Z
    .param p1, "valueToFind"    # Z

    .line 2293
    const/4 v0, 0x0

    invoke-static {p0, p1, v0}, Lorg/apache/commons/lang3/ArrayUtils;->indexOf([ZZI)I

    move-result v0

    return v0
.end method

.method public static indexOf([ZZI)I
    .locals 3
    .param p0, "array"    # [Z
    .param p1, "valueToFind"    # Z
    .param p2, "startIndex"    # I

    .line 2314
    invoke-static {p0}, Lorg/apache/commons/lang3/ArrayUtils;->isEmpty([Z)Z

    move-result v0

    const/4 v1, -0x1

    if-eqz v0, :cond_0

    .line 2315
    return v1

    .line 2317
    :cond_0
    if-gez p2, :cond_1

    .line 2318
    const/4 p2, 0x0

    .line 2320
    :cond_1
    move v0, p2

    .local v0, "i":I
    :goto_0
    array-length v2, p0

    if-ge v0, v2, :cond_3

    .line 2321
    aget-boolean v2, p0, v0

    if-ne p1, v2, :cond_2

    .line 2322
    return v0

    .line 2320
    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 2325
    .end local v0    # "i":I
    :cond_3
    return v1
.end method

.method public static indexesOf([BB)Ljava/util/BitSet;
    .locals 1
    .param p0, "array"    # [B
    .param p1, "valueToFind"    # B

    .line 1822
    const/4 v0, 0x0

    invoke-static {p0, p1, v0}, Lorg/apache/commons/lang3/ArrayUtils;->indexesOf([BBI)Ljava/util/BitSet;

    move-result-object v0

    return-object v0
.end method

.method public static indexesOf([BBI)Ljava/util/BitSet;
    .locals 2
    .param p0, "array"    # [B
    .param p1, "valueToFind"    # B
    .param p2, "startIndex"    # I

    .line 1841
    new-instance v0, Ljava/util/BitSet;

    invoke-direct {v0}, Ljava/util/BitSet;-><init>()V

    .line 1843
    .local v0, "bitSet":Ljava/util/BitSet;
    if-nez p0, :cond_0

    .line 1844
    return-object v0

    .line 1847
    :cond_0
    :goto_0
    array-length v1, p0

    if-ge p2, v1, :cond_2

    .line 1848
    invoke-static {p0, p1, p2}, Lorg/apache/commons/lang3/ArrayUtils;->indexOf([BBI)I

    move-result p2

    .line 1850
    const/4 v1, -0x1

    if-ne p2, v1, :cond_1

    .line 1851
    goto :goto_1

    .line 1854
    :cond_1
    invoke-virtual {v0, p2}, Ljava/util/BitSet;->set(I)V

    .line 1855
    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    .line 1858
    :cond_2
    :goto_1
    return-object v0
.end method

.method public static indexesOf([CC)Ljava/util/BitSet;
    .locals 1
    .param p0, "array"    # [C
    .param p1, "valueToFind"    # C

    .line 1873
    const/4 v0, 0x0

    invoke-static {p0, p1, v0}, Lorg/apache/commons/lang3/ArrayUtils;->indexesOf([CCI)Ljava/util/BitSet;

    move-result-object v0

    return-object v0
.end method

.method public static indexesOf([CCI)Ljava/util/BitSet;
    .locals 2
    .param p0, "array"    # [C
    .param p1, "valueToFind"    # C
    .param p2, "startIndex"    # I

    .line 1892
    new-instance v0, Ljava/util/BitSet;

    invoke-direct {v0}, Ljava/util/BitSet;-><init>()V

    .line 1894
    .local v0, "bitSet":Ljava/util/BitSet;
    if-nez p0, :cond_0

    .line 1895
    return-object v0

    .line 1898
    :cond_0
    :goto_0
    array-length v1, p0

    if-ge p2, v1, :cond_2

    .line 1899
    invoke-static {p0, p1, p2}, Lorg/apache/commons/lang3/ArrayUtils;->indexOf([CCI)I

    move-result p2

    .line 1901
    const/4 v1, -0x1

    if-ne p2, v1, :cond_1

    .line 1902
    goto :goto_1

    .line 1905
    :cond_1
    invoke-virtual {v0, p2}, Ljava/util/BitSet;->set(I)V

    .line 1906
    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    .line 1909
    :cond_2
    :goto_1
    return-object v0
.end method

.method public static indexesOf([DD)Ljava/util/BitSet;
    .locals 1
    .param p0, "array"    # [D
    .param p1, "valueToFind"    # D

    .line 1924
    const/4 v0, 0x0

    invoke-static {p0, p1, p2, v0}, Lorg/apache/commons/lang3/ArrayUtils;->indexesOf([DDI)Ljava/util/BitSet;

    move-result-object v0

    return-object v0
.end method

.method public static indexesOf([DDD)Ljava/util/BitSet;
    .locals 6
    .param p0, "array"    # [D
    .param p1, "valueToFind"    # D
    .param p3, "tolerance"    # D

    .line 1945
    const/4 v3, 0x0

    move-object v0, p0

    move-wide v1, p1

    move-wide v4, p3

    .end local p0    # "array":[D
    .end local p1    # "valueToFind":D
    .end local p3    # "tolerance":D
    .local v0, "array":[D
    .local v1, "valueToFind":D
    .local v4, "tolerance":D
    invoke-static/range {v0 .. v5}, Lorg/apache/commons/lang3/ArrayUtils;->indexesOf([DDID)Ljava/util/BitSet;

    move-result-object p0

    return-object p0
.end method

.method public static indexesOf([DDI)Ljava/util/BitSet;
    .locals 2
    .param p0, "array"    # [D
    .param p1, "valueToFind"    # D
    .param p3, "startIndex"    # I

    .line 1964
    new-instance v0, Ljava/util/BitSet;

    invoke-direct {v0}, Ljava/util/BitSet;-><init>()V

    .line 1966
    .local v0, "bitSet":Ljava/util/BitSet;
    if-nez p0, :cond_0

    .line 1967
    return-object v0

    .line 1970
    :cond_0
    :goto_0
    array-length v1, p0

    if-ge p3, v1, :cond_2

    .line 1971
    invoke-static {p0, p1, p2, p3}, Lorg/apache/commons/lang3/ArrayUtils;->indexOf([DDI)I

    move-result p3

    .line 1973
    const/4 v1, -0x1

    if-ne p3, v1, :cond_1

    .line 1974
    goto :goto_1

    .line 1977
    :cond_1
    invoke-virtual {v0, p3}, Ljava/util/BitSet;->set(I)V

    .line 1978
    add-int/lit8 p3, p3, 0x1

    goto :goto_0

    .line 1981
    :cond_2
    :goto_1
    return-object v0
.end method

.method public static indexesOf([DDID)Ljava/util/BitSet;
    .locals 2
    .param p0, "array"    # [D
    .param p1, "valueToFind"    # D
    .param p3, "startIndex"    # I
    .param p4, "tolerance"    # D

    .line 2006
    new-instance v0, Ljava/util/BitSet;

    invoke-direct {v0}, Ljava/util/BitSet;-><init>()V

    .line 2008
    .local v0, "bitSet":Ljava/util/BitSet;
    if-nez p0, :cond_0

    .line 2009
    return-object v0

    .line 2012
    :cond_0
    :goto_0
    array-length v1, p0

    if-ge p3, v1, :cond_2

    .line 2013
    invoke-static/range {p0 .. p5}, Lorg/apache/commons/lang3/ArrayUtils;->indexOf([DDID)I

    move-result p3

    .line 2015
    const/4 v1, -0x1

    if-ne p3, v1, :cond_1

    .line 2016
    goto :goto_1

    .line 2019
    :cond_1
    invoke-virtual {v0, p3}, Ljava/util/BitSet;->set(I)V

    .line 2020
    add-int/lit8 p3, p3, 0x1

    goto :goto_0

    .line 2023
    :cond_2
    :goto_1
    return-object v0
.end method

.method public static indexesOf([FF)Ljava/util/BitSet;
    .locals 1
    .param p0, "array"    # [F
    .param p1, "valueToFind"    # F

    .line 2038
    const/4 v0, 0x0

    invoke-static {p0, p1, v0}, Lorg/apache/commons/lang3/ArrayUtils;->indexesOf([FFI)Ljava/util/BitSet;

    move-result-object v0

    return-object v0
.end method

.method public static indexesOf([FFI)Ljava/util/BitSet;
    .locals 2
    .param p0, "array"    # [F
    .param p1, "valueToFind"    # F
    .param p2, "startIndex"    # I

    .line 2057
    new-instance v0, Ljava/util/BitSet;

    invoke-direct {v0}, Ljava/util/BitSet;-><init>()V

    .line 2059
    .local v0, "bitSet":Ljava/util/BitSet;
    if-nez p0, :cond_0

    .line 2060
    return-object v0

    .line 2063
    :cond_0
    :goto_0
    array-length v1, p0

    if-ge p2, v1, :cond_2

    .line 2064
    invoke-static {p0, p1, p2}, Lorg/apache/commons/lang3/ArrayUtils;->indexOf([FFI)I

    move-result p2

    .line 2066
    const/4 v1, -0x1

    if-ne p2, v1, :cond_1

    .line 2067
    goto :goto_1

    .line 2070
    :cond_1
    invoke-virtual {v0, p2}, Ljava/util/BitSet;->set(I)V

    .line 2071
    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    .line 2074
    :cond_2
    :goto_1
    return-object v0
.end method

.method public static indexesOf([II)Ljava/util/BitSet;
    .locals 1
    .param p0, "array"    # [I
    .param p1, "valueToFind"    # I

    .line 2089
    const/4 v0, 0x0

    invoke-static {p0, p1, v0}, Lorg/apache/commons/lang3/ArrayUtils;->indexesOf([III)Ljava/util/BitSet;

    move-result-object v0

    return-object v0
.end method

.method public static indexesOf([III)Ljava/util/BitSet;
    .locals 2
    .param p0, "array"    # [I
    .param p1, "valueToFind"    # I
    .param p2, "startIndex"    # I

    .line 2108
    new-instance v0, Ljava/util/BitSet;

    invoke-direct {v0}, Ljava/util/BitSet;-><init>()V

    .line 2110
    .local v0, "bitSet":Ljava/util/BitSet;
    if-nez p0, :cond_0

    .line 2111
    return-object v0

    .line 2114
    :cond_0
    :goto_0
    array-length v1, p0

    if-ge p2, v1, :cond_2

    .line 2115
    invoke-static {p0, p1, p2}, Lorg/apache/commons/lang3/ArrayUtils;->indexOf([III)I

    move-result p2

    .line 2117
    const/4 v1, -0x1

    if-ne p2, v1, :cond_1

    .line 2118
    goto :goto_1

    .line 2121
    :cond_1
    invoke-virtual {v0, p2}, Ljava/util/BitSet;->set(I)V

    .line 2122
    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    .line 2125
    :cond_2
    :goto_1
    return-object v0
.end method

.method public static indexesOf([JJ)Ljava/util/BitSet;
    .locals 1
    .param p0, "array"    # [J
    .param p1, "valueToFind"    # J

    .line 2140
    const/4 v0, 0x0

    invoke-static {p0, p1, p2, v0}, Lorg/apache/commons/lang3/ArrayUtils;->indexesOf([JJI)Ljava/util/BitSet;

    move-result-object v0

    return-object v0
.end method

.method public static indexesOf([JJI)Ljava/util/BitSet;
    .locals 2
    .param p0, "array"    # [J
    .param p1, "valueToFind"    # J
    .param p3, "startIndex"    # I

    .line 2159
    new-instance v0, Ljava/util/BitSet;

    invoke-direct {v0}, Ljava/util/BitSet;-><init>()V

    .line 2161
    .local v0, "bitSet":Ljava/util/BitSet;
    if-nez p0, :cond_0

    .line 2162
    return-object v0

    .line 2165
    :cond_0
    :goto_0
    array-length v1, p0

    if-ge p3, v1, :cond_2

    .line 2166
    invoke-static {p0, p1, p2, p3}, Lorg/apache/commons/lang3/ArrayUtils;->indexOf([JJI)I

    move-result p3

    .line 2168
    const/4 v1, -0x1

    if-ne p3, v1, :cond_1

    .line 2169
    goto :goto_1

    .line 2172
    :cond_1
    invoke-virtual {v0, p3}, Ljava/util/BitSet;->set(I)V

    .line 2173
    add-int/lit8 p3, p3, 0x1

    goto :goto_0

    .line 2176
    :cond_2
    :goto_1
    return-object v0
.end method

.method public static indexesOf([Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/BitSet;
    .locals 1
    .param p0, "array"    # [Ljava/lang/Object;
    .param p1, "objectToFind"    # Ljava/lang/Object;

    .line 2191
    const/4 v0, 0x0

    invoke-static {p0, p1, v0}, Lorg/apache/commons/lang3/ArrayUtils;->indexesOf([Ljava/lang/Object;Ljava/lang/Object;I)Ljava/util/BitSet;

    move-result-object v0

    return-object v0
.end method

.method public static indexesOf([Ljava/lang/Object;Ljava/lang/Object;I)Ljava/util/BitSet;
    .locals 2
    .param p0, "array"    # [Ljava/lang/Object;
    .param p1, "objectToFind"    # Ljava/lang/Object;
    .param p2, "startIndex"    # I

    .line 2210
    new-instance v0, Ljava/util/BitSet;

    invoke-direct {v0}, Ljava/util/BitSet;-><init>()V

    .line 2212
    .local v0, "bitSet":Ljava/util/BitSet;
    if-nez p0, :cond_0

    .line 2213
    return-object v0

    .line 2216
    :cond_0
    :goto_0
    array-length v1, p0

    if-ge p2, v1, :cond_2

    .line 2217
    invoke-static {p0, p1, p2}, Lorg/apache/commons/lang3/ArrayUtils;->indexOf([Ljava/lang/Object;Ljava/lang/Object;I)I

    move-result p2

    .line 2219
    const/4 v1, -0x1

    if-ne p2, v1, :cond_1

    .line 2220
    goto :goto_1

    .line 2223
    :cond_1
    invoke-virtual {v0, p2}, Ljava/util/BitSet;->set(I)V

    .line 2224
    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    .line 2227
    :cond_2
    :goto_1
    return-object v0
.end method

.method public static indexesOf([SS)Ljava/util/BitSet;
    .locals 1
    .param p0, "array"    # [S
    .param p1, "valueToFind"    # S

    .line 2242
    const/4 v0, 0x0

    invoke-static {p0, p1, v0}, Lorg/apache/commons/lang3/ArrayUtils;->indexesOf([SSI)Ljava/util/BitSet;

    move-result-object v0

    return-object v0
.end method

.method public static indexesOf([SSI)Ljava/util/BitSet;
    .locals 2
    .param p0, "array"    # [S
    .param p1, "valueToFind"    # S
    .param p2, "startIndex"    # I

    .line 2261
    new-instance v0, Ljava/util/BitSet;

    invoke-direct {v0}, Ljava/util/BitSet;-><init>()V

    .line 2263
    .local v0, "bitSet":Ljava/util/BitSet;
    if-nez p0, :cond_0

    .line 2264
    return-object v0

    .line 2267
    :cond_0
    :goto_0
    array-length v1, p0

    if-ge p2, v1, :cond_2

    .line 2268
    invoke-static {p0, p1, p2}, Lorg/apache/commons/lang3/ArrayUtils;->indexOf([SSI)I

    move-result p2

    .line 2270
    const/4 v1, -0x1

    if-ne p2, v1, :cond_1

    .line 2271
    goto :goto_1

    .line 2274
    :cond_1
    invoke-virtual {v0, p2}, Ljava/util/BitSet;->set(I)V

    .line 2275
    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    .line 2278
    :cond_2
    :goto_1
    return-object v0
.end method

.method public static indexesOf([ZZ)Ljava/util/BitSet;
    .locals 1
    .param p0, "array"    # [Z
    .param p1, "valueToFind"    # Z

    .line 1768
    const/4 v0, 0x0

    invoke-static {p0, p1, v0}, Lorg/apache/commons/lang3/ArrayUtils;->indexesOf([ZZI)Ljava/util/BitSet;

    move-result-object v0

    return-object v0
.end method

.method public static indexesOf([ZZI)Ljava/util/BitSet;
    .locals 2
    .param p0, "array"    # [Z
    .param p1, "valueToFind"    # Z
    .param p2, "startIndex"    # I

    .line 1790
    new-instance v0, Ljava/util/BitSet;

    invoke-direct {v0}, Ljava/util/BitSet;-><init>()V

    .line 1792
    .local v0, "bitSet":Ljava/util/BitSet;
    if-nez p0, :cond_0

    .line 1793
    return-object v0

    .line 1796
    :cond_0
    :goto_0
    array-length v1, p0

    if-ge p2, v1, :cond_2

    .line 1797
    invoke-static {p0, p1, p2}, Lorg/apache/commons/lang3/ArrayUtils;->indexOf([ZZI)I

    move-result p2

    .line 1799
    const/4 v1, -0x1

    if-ne p2, v1, :cond_1

    .line 1800
    goto :goto_1

    .line 1803
    :cond_1
    invoke-virtual {v0, p2}, Ljava/util/BitSet;->set(I)V

    .line 1804
    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    .line 1807
    :cond_2
    :goto_1
    return-object v0
.end method

.method public static varargs insert(I[B[B)[B
    .locals 3
    .param p0, "index"    # I
    .param p1, "array"    # [B
    .param p2, "values"    # [B

    .line 2826
    if-nez p1, :cond_0

    .line 2827
    const/4 v0, 0x0

    return-object v0

    .line 2829
    :cond_0
    invoke-static {p2}, Lorg/apache/commons/lang3/ArrayUtils;->isEmpty([B)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 2830
    invoke-static {p1}, Lorg/apache/commons/lang3/ArrayUtils;->clone([B)[B

    move-result-object v0

    return-object v0

    .line 2832
    :cond_1
    if-ltz p0, :cond_4

    array-length v0, p1

    if-gt p0, v0, :cond_4

    .line 2836
    array-length v0, p1

    array-length v1, p2

    add-int/2addr v0, v1

    new-array v0, v0, [B

    .line 2838
    .local v0, "result":[B
    array-length v1, p2

    const/4 v2, 0x0

    invoke-static {p2, v2, v0, p0, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 2839
    if-lez p0, :cond_2

    .line 2840
    invoke-static {p1, v2, v0, v2, p0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 2842
    :cond_2
    array-length v1, p1

    if-ge p0, v1, :cond_3

    .line 2843
    array-length v1, p2

    add-int/2addr v1, p0

    array-length v2, p1

    sub-int/2addr v2, p0

    invoke-static {p1, p0, v0, v1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 2845
    :cond_3
    return-object v0

    .line 2833
    .end local v0    # "result":[B
    :cond_4
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Index: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", Length: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    array-length v2, p1

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static varargs insert(I[C[C)[C
    .locals 3
    .param p0, "index"    # I
    .param p1, "array"    # [C
    .param p2, "values"    # [C

    .line 2868
    if-nez p1, :cond_0

    .line 2869
    const/4 v0, 0x0

    return-object v0

    .line 2871
    :cond_0
    invoke-static {p2}, Lorg/apache/commons/lang3/ArrayUtils;->isEmpty([C)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 2872
    invoke-static {p1}, Lorg/apache/commons/lang3/ArrayUtils;->clone([C)[C

    move-result-object v0

    return-object v0

    .line 2874
    :cond_1
    if-ltz p0, :cond_4

    array-length v0, p1

    if-gt p0, v0, :cond_4

    .line 2878
    array-length v0, p1

    array-length v1, p2

    add-int/2addr v0, v1

    new-array v0, v0, [C

    .line 2880
    .local v0, "result":[C
    array-length v1, p2

    const/4 v2, 0x0

    invoke-static {p2, v2, v0, p0, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 2881
    if-lez p0, :cond_2

    .line 2882
    invoke-static {p1, v2, v0, v2, p0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 2884
    :cond_2
    array-length v1, p1

    if-ge p0, v1, :cond_3

    .line 2885
    array-length v1, p2

    add-int/2addr v1, p0

    array-length v2, p1

    sub-int/2addr v2, p0

    invoke-static {p1, p0, v0, v1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 2887
    :cond_3
    return-object v0

    .line 2875
    .end local v0    # "result":[C
    :cond_4
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Index: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", Length: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    array-length v2, p1

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static varargs insert(I[D[D)[D
    .locals 3
    .param p0, "index"    # I
    .param p1, "array"    # [D
    .param p2, "values"    # [D

    .line 2910
    if-nez p1, :cond_0

    .line 2911
    const/4 v0, 0x0

    return-object v0

    .line 2913
    :cond_0
    invoke-static {p2}, Lorg/apache/commons/lang3/ArrayUtils;->isEmpty([D)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 2914
    invoke-static {p1}, Lorg/apache/commons/lang3/ArrayUtils;->clone([D)[D

    move-result-object v0

    return-object v0

    .line 2916
    :cond_1
    if-ltz p0, :cond_4

    array-length v0, p1

    if-gt p0, v0, :cond_4

    .line 2920
    array-length v0, p1

    array-length v1, p2

    add-int/2addr v0, v1

    new-array v0, v0, [D

    .line 2922
    .local v0, "result":[D
    array-length v1, p2

    const/4 v2, 0x0

    invoke-static {p2, v2, v0, p0, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 2923
    if-lez p0, :cond_2

    .line 2924
    invoke-static {p1, v2, v0, v2, p0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 2926
    :cond_2
    array-length v1, p1

    if-ge p0, v1, :cond_3

    .line 2927
    array-length v1, p2

    add-int/2addr v1, p0

    array-length v2, p1

    sub-int/2addr v2, p0

    invoke-static {p1, p0, v0, v1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 2929
    :cond_3
    return-object v0

    .line 2917
    .end local v0    # "result":[D
    :cond_4
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Index: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", Length: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    array-length v2, p1

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static varargs insert(I[F[F)[F
    .locals 3
    .param p0, "index"    # I
    .param p1, "array"    # [F
    .param p2, "values"    # [F

    .line 2952
    if-nez p1, :cond_0

    .line 2953
    const/4 v0, 0x0

    return-object v0

    .line 2955
    :cond_0
    invoke-static {p2}, Lorg/apache/commons/lang3/ArrayUtils;->isEmpty([F)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 2956
    invoke-static {p1}, Lorg/apache/commons/lang3/ArrayUtils;->clone([F)[F

    move-result-object v0

    return-object v0

    .line 2958
    :cond_1
    if-ltz p0, :cond_4

    array-length v0, p1

    if-gt p0, v0, :cond_4

    .line 2962
    array-length v0, p1

    array-length v1, p2

    add-int/2addr v0, v1

    new-array v0, v0, [F

    .line 2964
    .local v0, "result":[F
    array-length v1, p2

    const/4 v2, 0x0

    invoke-static {p2, v2, v0, p0, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 2965
    if-lez p0, :cond_2

    .line 2966
    invoke-static {p1, v2, v0, v2, p0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 2968
    :cond_2
    array-length v1, p1

    if-ge p0, v1, :cond_3

    .line 2969
    array-length v1, p2

    add-int/2addr v1, p0

    array-length v2, p1

    sub-int/2addr v2, p0

    invoke-static {p1, p0, v0, v1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 2971
    :cond_3
    return-object v0

    .line 2959
    .end local v0    # "result":[F
    :cond_4
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Index: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", Length: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    array-length v2, p1

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static varargs insert(I[I[I)[I
    .locals 3
    .param p0, "index"    # I
    .param p1, "array"    # [I
    .param p2, "values"    # [I

    .line 2994
    if-nez p1, :cond_0

    .line 2995
    const/4 v0, 0x0

    return-object v0

    .line 2997
    :cond_0
    invoke-static {p2}, Lorg/apache/commons/lang3/ArrayUtils;->isEmpty([I)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 2998
    invoke-static {p1}, Lorg/apache/commons/lang3/ArrayUtils;->clone([I)[I

    move-result-object v0

    return-object v0

    .line 3000
    :cond_1
    if-ltz p0, :cond_4

    array-length v0, p1

    if-gt p0, v0, :cond_4

    .line 3004
    array-length v0, p1

    array-length v1, p2

    add-int/2addr v0, v1

    new-array v0, v0, [I

    .line 3006
    .local v0, "result":[I
    array-length v1, p2

    const/4 v2, 0x0

    invoke-static {p2, v2, v0, p0, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 3007
    if-lez p0, :cond_2

    .line 3008
    invoke-static {p1, v2, v0, v2, p0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 3010
    :cond_2
    array-length v1, p1

    if-ge p0, v1, :cond_3

    .line 3011
    array-length v1, p2

    add-int/2addr v1, p0

    array-length v2, p1

    sub-int/2addr v2, p0

    invoke-static {p1, p0, v0, v1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 3013
    :cond_3
    return-object v0

    .line 3001
    .end local v0    # "result":[I
    :cond_4
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Index: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", Length: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    array-length v2, p1

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static varargs insert(I[J[J)[J
    .locals 3
    .param p0, "index"    # I
    .param p1, "array"    # [J
    .param p2, "values"    # [J

    .line 3036
    if-nez p1, :cond_0

    .line 3037
    const/4 v0, 0x0

    return-object v0

    .line 3039
    :cond_0
    invoke-static {p2}, Lorg/apache/commons/lang3/ArrayUtils;->isEmpty([J)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 3040
    invoke-static {p1}, Lorg/apache/commons/lang3/ArrayUtils;->clone([J)[J

    move-result-object v0

    return-object v0

    .line 3042
    :cond_1
    if-ltz p0, :cond_4

    array-length v0, p1

    if-gt p0, v0, :cond_4

    .line 3046
    array-length v0, p1

    array-length v1, p2

    add-int/2addr v0, v1

    new-array v0, v0, [J

    .line 3048
    .local v0, "result":[J
    array-length v1, p2

    const/4 v2, 0x0

    invoke-static {p2, v2, v0, p0, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 3049
    if-lez p0, :cond_2

    .line 3050
    invoke-static {p1, v2, v0, v2, p0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 3052
    :cond_2
    array-length v1, p1

    if-ge p0, v1, :cond_3

    .line 3053
    array-length v1, p2

    add-int/2addr v1, p0

    array-length v2, p1

    sub-int/2addr v2, p0

    invoke-static {p1, p0, v0, v1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 3055
    :cond_3
    return-object v0

    .line 3043
    .end local v0    # "result":[J
    :cond_4
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Index: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", Length: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    array-length v2, p1

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static varargs insert(I[Ljava/lang/Object;[Ljava/lang/Object;)[Ljava/lang/Object;
    .locals 5
    .param p0, "index"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(I[TT;[TT;)[TT;"
        }
    .end annotation

    .annotation runtime Ljava/lang/SafeVarargs;
    .end annotation

    .line 3130
    .local p1, "array":[Ljava/lang/Object;, "[TT;"
    .local p2, "values":[Ljava/lang/Object;, "[TT;"
    if-nez p1, :cond_0

    .line 3131
    const/4 v0, 0x0

    return-object v0

    .line 3133
    :cond_0
    invoke-static {p2}, Lorg/apache/commons/lang3/ArrayUtils;->isEmpty([Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 3134
    invoke-static {p1}, Lorg/apache/commons/lang3/ArrayUtils;->clone([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    return-object v0

    .line 3136
    :cond_1
    if-ltz p0, :cond_4

    array-length v0, p1

    if-gt p0, v0, :cond_4

    .line 3140
    invoke-static {p1}, Lorg/apache/commons/lang3/ArrayUtils;->getComponentType([Ljava/lang/Object;)Ljava/lang/Class;

    move-result-object v0

    .line 3141
    .local v0, "type":Ljava/lang/Class;, "Ljava/lang/Class<TT;>;"
    array-length v1, p1

    array-length v2, p2

    add-int/2addr v1, v2

    .line 3142
    .local v1, "length":I
    invoke-static {v0, v1}, Lorg/apache/commons/lang3/ArrayUtils;->newInstance(Ljava/lang/Class;I)[Ljava/lang/Object;

    move-result-object v2

    .line 3144
    .local v2, "result":[Ljava/lang/Object;, "[TT;"
    array-length v3, p2

    const/4 v4, 0x0

    invoke-static {p2, v4, v2, p0, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 3145
    if-lez p0, :cond_2

    .line 3146
    invoke-static {p1, v4, v2, v4, p0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 3148
    :cond_2
    array-length v3, p1

    if-ge p0, v3, :cond_3

    .line 3149
    array-length v3, p2

    add-int/2addr v3, p0

    array-length v4, p1

    sub-int/2addr v4, p0

    invoke-static {p1, p0, v2, v3, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 3151
    :cond_3
    return-object v2

    .line 3137
    .end local v0    # "type":Ljava/lang/Class;, "Ljava/lang/Class<TT;>;"
    .end local v1    # "length":I
    .end local v2    # "result":[Ljava/lang/Object;, "[TT;"
    :cond_4
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Index: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", Length: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    array-length v2, p1

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static varargs insert(I[S[S)[S
    .locals 3
    .param p0, "index"    # I
    .param p1, "array"    # [S
    .param p2, "values"    # [S

    .line 3078
    if-nez p1, :cond_0

    .line 3079
    const/4 v0, 0x0

    return-object v0

    .line 3081
    :cond_0
    invoke-static {p2}, Lorg/apache/commons/lang3/ArrayUtils;->isEmpty([S)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 3082
    invoke-static {p1}, Lorg/apache/commons/lang3/ArrayUtils;->clone([S)[S

    move-result-object v0

    return-object v0

    .line 3084
    :cond_1
    if-ltz p0, :cond_4

    array-length v0, p1

    if-gt p0, v0, :cond_4

    .line 3088
    array-length v0, p1

    array-length v1, p2

    add-int/2addr v0, v1

    new-array v0, v0, [S

    .line 3090
    .local v0, "result":[S
    array-length v1, p2

    const/4 v2, 0x0

    invoke-static {p2, v2, v0, p0, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 3091
    if-lez p0, :cond_2

    .line 3092
    invoke-static {p1, v2, v0, v2, p0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 3094
    :cond_2
    array-length v1, p1

    if-ge p0, v1, :cond_3

    .line 3095
    array-length v1, p2

    add-int/2addr v1, p0

    array-length v2, p1

    sub-int/2addr v2, p0

    invoke-static {p1, p0, v0, v1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 3097
    :cond_3
    return-object v0

    .line 3085
    .end local v0    # "result":[S
    :cond_4
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Index: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", Length: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    array-length v2, p1

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static varargs insert(I[Z[Z)[Z
    .locals 3
    .param p0, "index"    # I
    .param p1, "array"    # [Z
    .param p2, "values"    # [Z

    .line 2784
    if-nez p1, :cond_0

    .line 2785
    const/4 v0, 0x0

    return-object v0

    .line 2787
    :cond_0
    invoke-static {p2}, Lorg/apache/commons/lang3/ArrayUtils;->isEmpty([Z)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 2788
    invoke-static {p1}, Lorg/apache/commons/lang3/ArrayUtils;->clone([Z)[Z

    move-result-object v0

    return-object v0

    .line 2790
    :cond_1
    if-ltz p0, :cond_4

    array-length v0, p1

    if-gt p0, v0, :cond_4

    .line 2794
    array-length v0, p1

    array-length v1, p2

    add-int/2addr v0, v1

    new-array v0, v0, [Z

    .line 2796
    .local v0, "result":[Z
    array-length v1, p2

    const/4 v2, 0x0

    invoke-static {p2, v2, v0, p0, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 2797
    if-lez p0, :cond_2

    .line 2798
    invoke-static {p1, v2, v0, v2, p0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 2800
    :cond_2
    array-length v1, p1

    if-ge p0, v1, :cond_3

    .line 2801
    array-length v1, p2

    add-int/2addr v1, p0

    array-length v2, p1

    sub-int/2addr v2, p0

    invoke-static {p1, p0, v0, v1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 2803
    :cond_3
    return-object v0

    .line 2791
    .end local v0    # "result":[Z
    :cond_4
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Index: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", Length: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    array-length v2, p1

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private static isArrayEmpty(Ljava/lang/Object;)Z
    .locals 1
    .param p0, "array"    # Ljava/lang/Object;

    .line 3161
    invoke-static {p0}, Lorg/apache/commons/lang3/ArrayUtils;->getLength(Ljava/lang/Object;)I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public static isArrayIndexValid([Ljava/lang/Object;I)Z
    .locals 1
    .param p1, "index"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">([TT;I)Z"
        }
    .end annotation

    .line 3180
    .local p0, "array":[Ljava/lang/Object;, "[TT;"
    if-ltz p1, :cond_0

    invoke-static {p0}, Lorg/apache/commons/lang3/ArrayUtils;->getLength(Ljava/lang/Object;)I

    move-result v0

    if-le v0, p1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public static isEmpty([B)Z
    .locals 1
    .param p0, "array"    # [B

    .line 3202
    invoke-static {p0}, Lorg/apache/commons/lang3/ArrayUtils;->isArrayEmpty(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public static isEmpty([C)Z
    .locals 1
    .param p0, "array"    # [C

    .line 3213
    invoke-static {p0}, Lorg/apache/commons/lang3/ArrayUtils;->isArrayEmpty(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public static isEmpty([D)Z
    .locals 1
    .param p0, "array"    # [D

    .line 3224
    invoke-static {p0}, Lorg/apache/commons/lang3/ArrayUtils;->isArrayEmpty(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public static isEmpty([F)Z
    .locals 1
    .param p0, "array"    # [F

    .line 3235
    invoke-static {p0}, Lorg/apache/commons/lang3/ArrayUtils;->isArrayEmpty(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public static isEmpty([I)Z
    .locals 1
    .param p0, "array"    # [I

    .line 3246
    invoke-static {p0}, Lorg/apache/commons/lang3/ArrayUtils;->isArrayEmpty(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public static isEmpty([J)Z
    .locals 1
    .param p0, "array"    # [J

    .line 3257
    invoke-static {p0}, Lorg/apache/commons/lang3/ArrayUtils;->isArrayEmpty(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public static isEmpty([Ljava/lang/Object;)Z
    .locals 1
    .param p0, "array"    # [Ljava/lang/Object;

    .line 3268
    invoke-static {p0}, Lorg/apache/commons/lang3/ArrayUtils;->isArrayEmpty(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public static isEmpty([S)Z
    .locals 1
    .param p0, "array"    # [S

    .line 3279
    invoke-static {p0}, Lorg/apache/commons/lang3/ArrayUtils;->isArrayEmpty(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public static isEmpty([Z)Z
    .locals 1
    .param p0, "array"    # [Z

    .line 3191
    invoke-static {p0}, Lorg/apache/commons/lang3/ArrayUtils;->isArrayEmpty(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public static isEquals(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 1
    .param p0, "array1"    # Ljava/lang/Object;
    .param p1, "array2"    # Ljava/lang/Object;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 3297
    new-instance v0, Lorg/apache/commons/lang3/builder/EqualsBuilder;

    invoke-direct {v0}, Lorg/apache/commons/lang3/builder/EqualsBuilder;-><init>()V

    invoke-virtual {v0, p0, p1}, Lorg/apache/commons/lang3/builder/EqualsBuilder;->append(Ljava/lang/Object;Ljava/lang/Object;)Lorg/apache/commons/lang3/builder/EqualsBuilder;

    move-result-object v0

    invoke-virtual {v0}, Lorg/apache/commons/lang3/builder/EqualsBuilder;->isEquals()Z

    move-result v0

    return v0
.end method

.method public static isNotEmpty([B)Z
    .locals 1
    .param p0, "array"    # [B

    .line 3319
    invoke-static {p0}, Lorg/apache/commons/lang3/ArrayUtils;->isEmpty([B)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public static isNotEmpty([C)Z
    .locals 1
    .param p0, "array"    # [C

    .line 3330
    invoke-static {p0}, Lorg/apache/commons/lang3/ArrayUtils;->isEmpty([C)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public static isNotEmpty([D)Z
    .locals 1
    .param p0, "array"    # [D

    .line 3341
    invoke-static {p0}, Lorg/apache/commons/lang3/ArrayUtils;->isEmpty([D)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public static isNotEmpty([F)Z
    .locals 1
    .param p0, "array"    # [F

    .line 3352
    invoke-static {p0}, Lorg/apache/commons/lang3/ArrayUtils;->isEmpty([F)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public static isNotEmpty([I)Z
    .locals 1
    .param p0, "array"    # [I

    .line 3363
    invoke-static {p0}, Lorg/apache/commons/lang3/ArrayUtils;->isEmpty([I)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public static isNotEmpty([J)Z
    .locals 1
    .param p0, "array"    # [J

    .line 3374
    invoke-static {p0}, Lorg/apache/commons/lang3/ArrayUtils;->isEmpty([J)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public static isNotEmpty([Ljava/lang/Object;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">([TT;)Z"
        }
    .end annotation

    .line 3397
    .local p0, "array":[Ljava/lang/Object;, "[TT;"
    invoke-static {p0}, Lorg/apache/commons/lang3/ArrayUtils;->isEmpty([Ljava/lang/Object;)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public static isNotEmpty([S)Z
    .locals 1
    .param p0, "array"    # [S

    .line 3385
    invoke-static {p0}, Lorg/apache/commons/lang3/ArrayUtils;->isEmpty([S)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public static isNotEmpty([Z)Z
    .locals 1
    .param p0, "array"    # [Z

    .line 3308
    invoke-static {p0}, Lorg/apache/commons/lang3/ArrayUtils;->isEmpty([Z)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public static isSameLength(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 2
    .param p0, "array1"    # Ljava/lang/Object;
    .param p1, "array2"    # Ljava/lang/Object;

    .line 3505
    invoke-static {p0}, Lorg/apache/commons/lang3/ArrayUtils;->getLength(Ljava/lang/Object;)I

    move-result v0

    invoke-static {p1}, Lorg/apache/commons/lang3/ArrayUtils;->getLength(Ljava/lang/Object;)I

    move-result v1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public static isSameLength([B[B)Z
    .locals 2
    .param p0, "array1"    # [B
    .param p1, "array2"    # [B

    .line 3423
    invoke-static {p0}, Lorg/apache/commons/lang3/ArrayUtils;->getLength(Ljava/lang/Object;)I

    move-result v0

    invoke-static {p1}, Lorg/apache/commons/lang3/ArrayUtils;->getLength(Ljava/lang/Object;)I

    move-result v1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public static isSameLength([C[C)Z
    .locals 2
    .param p0, "array1"    # [C
    .param p1, "array2"    # [C

    .line 3436
    invoke-static {p0}, Lorg/apache/commons/lang3/ArrayUtils;->getLength(Ljava/lang/Object;)I

    move-result v0

    invoke-static {p1}, Lorg/apache/commons/lang3/ArrayUtils;->getLength(Ljava/lang/Object;)I

    move-result v1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public static isSameLength([D[D)Z
    .locals 2
    .param p0, "array1"    # [D
    .param p1, "array2"    # [D

    .line 3449
    invoke-static {p0}, Lorg/apache/commons/lang3/ArrayUtils;->getLength(Ljava/lang/Object;)I

    move-result v0

    invoke-static {p1}, Lorg/apache/commons/lang3/ArrayUtils;->getLength(Ljava/lang/Object;)I

    move-result v1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public static isSameLength([F[F)Z
    .locals 2
    .param p0, "array1"    # [F
    .param p1, "array2"    # [F

    .line 3462
    invoke-static {p0}, Lorg/apache/commons/lang3/ArrayUtils;->getLength(Ljava/lang/Object;)I

    move-result v0

    invoke-static {p1}, Lorg/apache/commons/lang3/ArrayUtils;->getLength(Ljava/lang/Object;)I

    move-result v1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public static isSameLength([I[I)Z
    .locals 2
    .param p0, "array1"    # [I
    .param p1, "array2"    # [I

    .line 3475
    invoke-static {p0}, Lorg/apache/commons/lang3/ArrayUtils;->getLength(Ljava/lang/Object;)I

    move-result v0

    invoke-static {p1}, Lorg/apache/commons/lang3/ArrayUtils;->getLength(Ljava/lang/Object;)I

    move-result v1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public static isSameLength([J[J)Z
    .locals 2
    .param p0, "array1"    # [J
    .param p1, "array2"    # [J

    .line 3488
    invoke-static {p0}, Lorg/apache/commons/lang3/ArrayUtils;->getLength(Ljava/lang/Object;)I

    move-result v0

    invoke-static {p1}, Lorg/apache/commons/lang3/ArrayUtils;->getLength(Ljava/lang/Object;)I

    move-result v1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public static isSameLength([Ljava/lang/Object;[Ljava/lang/Object;)Z
    .locals 2
    .param p0, "array1"    # [Ljava/lang/Object;
    .param p1, "array2"    # [Ljava/lang/Object;

    .line 3521
    invoke-static {p0}, Lorg/apache/commons/lang3/ArrayUtils;->getLength(Ljava/lang/Object;)I

    move-result v0

    invoke-static {p1}, Lorg/apache/commons/lang3/ArrayUtils;->getLength(Ljava/lang/Object;)I

    move-result v1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public static isSameLength([S[S)Z
    .locals 2
    .param p0, "array1"    # [S
    .param p1, "array2"    # [S

    .line 3535
    invoke-static {p0}, Lorg/apache/commons/lang3/ArrayUtils;->getLength(Ljava/lang/Object;)I

    move-result v0

    invoke-static {p1}, Lorg/apache/commons/lang3/ArrayUtils;->getLength(Ljava/lang/Object;)I

    move-result v1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public static isSameLength([Z[Z)Z
    .locals 2
    .param p0, "array1"    # [Z
    .param p1, "array2"    # [Z

    .line 3410
    invoke-static {p0}, Lorg/apache/commons/lang3/ArrayUtils;->getLength(Ljava/lang/Object;)I

    move-result v0

    invoke-static {p1}, Lorg/apache/commons/lang3/ArrayUtils;->getLength(Ljava/lang/Object;)I

    move-result v1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public static isSameType(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 2
    .param p0, "array1"    # Ljava/lang/Object;
    .param p1, "array2"    # Ljava/lang/Object;

    .line 3548
    if-eqz p0, :cond_0

    if-eqz p1, :cond_0

    .line 3551
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0

    .line 3549
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "The Array must not be null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static isSorted([B)Z
    .locals 7
    .param p0, "array"    # [B

    .line 3588
    invoke-static {p0}, Lorg/apache/commons/lang3/ArrayUtils;->getLength(Ljava/lang/Object;)I

    move-result v0

    const/4 v1, 0x2

    const/4 v2, 0x1

    if-ge v0, v1, :cond_0

    .line 3589
    return v2

    .line 3592
    :cond_0
    const/4 v0, 0x0

    aget-byte v1, p0, v0

    .line 3593
    .local v1, "previous":B
    array-length v3, p0

    .line 3594
    .local v3, "n":I
    const/4 v4, 0x1

    .local v4, "i":I
    :goto_0
    if-ge v4, v3, :cond_2

    .line 3595
    aget-byte v5, p0, v4

    .line 3596
    .local v5, "current":B
    invoke-static {v1, v5}, Lorg/apache/commons/lang3/math/NumberUtils;->compare(BB)I

    move-result v6

    if-lez v6, :cond_1

    .line 3597
    return v0

    .line 3600
    :cond_1
    move v1, v5

    .line 3594
    .end local v5    # "current":B
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 3602
    .end local v4    # "i":I
    :cond_2
    return v2
.end method

.method public static isSorted([C)Z
    .locals 7
    .param p0, "array"    # [C

    .line 3613
    invoke-static {p0}, Lorg/apache/commons/lang3/ArrayUtils;->getLength(Ljava/lang/Object;)I

    move-result v0

    const/4 v1, 0x2

    const/4 v2, 0x1

    if-ge v0, v1, :cond_0

    .line 3614
    return v2

    .line 3617
    :cond_0
    const/4 v0, 0x0

    aget-char v1, p0, v0

    .line 3618
    .local v1, "previous":C
    array-length v3, p0

    .line 3619
    .local v3, "n":I
    const/4 v4, 0x1

    .local v4, "i":I
    :goto_0
    if-ge v4, v3, :cond_2

    .line 3620
    aget-char v5, p0, v4

    .line 3621
    .local v5, "current":C
    invoke-static {v1, v5}, Lorg/apache/commons/lang3/CharUtils;->compare(CC)I

    move-result v6

    if-lez v6, :cond_1

    .line 3622
    return v0

    .line 3625
    :cond_1
    move v1, v5

    .line 3619
    .end local v5    # "current":C
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 3627
    .end local v4    # "i":I
    :cond_2
    return v2
.end method

.method public static isSorted([D)Z
    .locals 9
    .param p0, "array"    # [D

    .line 3638
    invoke-static {p0}, Lorg/apache/commons/lang3/ArrayUtils;->getLength(Ljava/lang/Object;)I

    move-result v0

    const/4 v1, 0x2

    const/4 v2, 0x1

    if-ge v0, v1, :cond_0

    .line 3639
    return v2

    .line 3642
    :cond_0
    const/4 v0, 0x0

    aget-wide v3, p0, v0

    .line 3643
    .local v3, "previous":D
    array-length v1, p0

    .line 3644
    .local v1, "n":I
    const/4 v5, 0x1

    .local v5, "i":I
    :goto_0
    if-ge v5, v1, :cond_2

    .line 3645
    aget-wide v6, p0, v5

    .line 3646
    .local v6, "current":D
    invoke-static {v3, v4, v6, v7}, Ljava/lang/Double;->compare(DD)I

    move-result v8

    if-lez v8, :cond_1

    .line 3647
    return v0

    .line 3650
    :cond_1
    move-wide v3, v6

    .line 3644
    .end local v6    # "current":D
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 3652
    .end local v5    # "i":I
    :cond_2
    return v2
.end method

.method public static isSorted([F)Z
    .locals 7
    .param p0, "array"    # [F

    .line 3663
    invoke-static {p0}, Lorg/apache/commons/lang3/ArrayUtils;->getLength(Ljava/lang/Object;)I

    move-result v0

    const/4 v1, 0x2

    const/4 v2, 0x1

    if-ge v0, v1, :cond_0

    .line 3664
    return v2

    .line 3667
    :cond_0
    const/4 v0, 0x0

    aget v1, p0, v0

    .line 3668
    .local v1, "previous":F
    array-length v3, p0

    .line 3669
    .local v3, "n":I
    const/4 v4, 0x1

    .local v4, "i":I
    :goto_0
    if-ge v4, v3, :cond_2

    .line 3670
    aget v5, p0, v4

    .line 3671
    .local v5, "current":F
    invoke-static {v1, v5}, Ljava/lang/Float;->compare(FF)I

    move-result v6

    if-lez v6, :cond_1

    .line 3672
    return v0

    .line 3675
    :cond_1
    move v1, v5

    .line 3669
    .end local v5    # "current":F
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 3677
    .end local v4    # "i":I
    :cond_2
    return v2
.end method

.method public static isSorted([I)Z
    .locals 7
    .param p0, "array"    # [I

    .line 3688
    invoke-static {p0}, Lorg/apache/commons/lang3/ArrayUtils;->getLength(Ljava/lang/Object;)I

    move-result v0

    const/4 v1, 0x2

    const/4 v2, 0x1

    if-ge v0, v1, :cond_0

    .line 3689
    return v2

    .line 3692
    :cond_0
    const/4 v0, 0x0

    aget v1, p0, v0

    .line 3693
    .local v1, "previous":I
    array-length v3, p0

    .line 3694
    .local v3, "n":I
    const/4 v4, 0x1

    .local v4, "i":I
    :goto_0
    if-ge v4, v3, :cond_2

    .line 3695
    aget v5, p0, v4

    .line 3696
    .local v5, "current":I
    invoke-static {v1, v5}, Lorg/apache/commons/lang3/math/NumberUtils;->compare(II)I

    move-result v6

    if-lez v6, :cond_1

    .line 3697
    return v0

    .line 3700
    :cond_1
    move v1, v5

    .line 3694
    .end local v5    # "current":I
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 3702
    .end local v4    # "i":I
    :cond_2
    return v2
.end method

.method public static isSorted([J)Z
    .locals 9
    .param p0, "array"    # [J

    .line 3713
    invoke-static {p0}, Lorg/apache/commons/lang3/ArrayUtils;->getLength(Ljava/lang/Object;)I

    move-result v0

    const/4 v1, 0x2

    const/4 v2, 0x1

    if-ge v0, v1, :cond_0

    .line 3714
    return v2

    .line 3717
    :cond_0
    const/4 v0, 0x0

    aget-wide v3, p0, v0

    .line 3718
    .local v3, "previous":J
    array-length v1, p0

    .line 3719
    .local v1, "n":I
    const/4 v5, 0x1

    .local v5, "i":I
    :goto_0
    if-ge v5, v1, :cond_2

    .line 3720
    aget-wide v6, p0, v5

    .line 3721
    .local v6, "current":J
    invoke-static {v3, v4, v6, v7}, Lorg/apache/commons/lang3/math/NumberUtils;->compare(JJ)I

    move-result v8

    if-lez v8, :cond_1

    .line 3722
    return v0

    .line 3725
    :cond_1
    move-wide v3, v6

    .line 3719
    .end local v6    # "current":J
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 3727
    .end local v5    # "i":I
    :cond_2
    return v2
.end method

.method public static isSorted([Ljava/lang/Comparable;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Ljava/lang/Comparable<",
            "-TT;>;>([TT;)Z"
        }
    .end annotation

    .line 3765
    .local p0, "array":[Ljava/lang/Comparable;, "[TT;"
    new-instance v0, Lorg/apache/commons/lang3/ArrayUtils$$ExternalSyntheticLambda9;

    invoke-direct {v0}, Lorg/apache/commons/lang3/ArrayUtils$$ExternalSyntheticLambda9;-><init>()V

    invoke-static {p0, v0}, Lorg/apache/commons/lang3/ArrayUtils;->isSorted([Ljava/lang/Object;Ljava/util/Comparator;)Z

    move-result v0

    return v0
.end method

.method public static isSorted([Ljava/lang/Object;Ljava/util/Comparator;)Z
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">([TT;",
            "Ljava/util/Comparator<",
            "TT;>;)Z"
        }
    .end annotation

    .line 3779
    .local p0, "array":[Ljava/lang/Object;, "[TT;"
    .local p1, "comparator":Ljava/util/Comparator;, "Ljava/util/Comparator<TT;>;"
    const-string v0, "comparator"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 3780
    invoke-static {p0}, Lorg/apache/commons/lang3/ArrayUtils;->getLength(Ljava/lang/Object;)I

    move-result v0

    const/4 v1, 0x2

    const/4 v2, 0x1

    if-ge v0, v1, :cond_0

    .line 3781
    return v2

    .line 3783
    :cond_0
    const/4 v0, 0x0

    aget-object v1, p0, v0

    .line 3784
    .local v1, "previous":Ljava/lang/Object;, "TT;"
    array-length v3, p0

    .line 3785
    .local v3, "n":I
    const/4 v4, 0x1

    .local v4, "i":I
    :goto_0
    if-ge v4, v3, :cond_2

    .line 3786
    aget-object v5, p0, v4

    .line 3787
    .local v5, "current":Ljava/lang/Object;, "TT;"
    invoke-interface {p1, v1, v5}, Ljava/util/Comparator;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v6

    if-lez v6, :cond_1

    .line 3788
    return v0

    .line 3791
    :cond_1
    move-object v1, v5

    .line 3785
    .end local v5    # "current":Ljava/lang/Object;, "TT;"
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 3793
    .end local v4    # "i":I
    :cond_2
    return v2
.end method

.method public static isSorted([S)Z
    .locals 7
    .param p0, "array"    # [S

    .line 3738
    invoke-static {p0}, Lorg/apache/commons/lang3/ArrayUtils;->getLength(Ljava/lang/Object;)I

    move-result v0

    const/4 v1, 0x2

    const/4 v2, 0x1

    if-ge v0, v1, :cond_0

    .line 3739
    return v2

    .line 3742
    :cond_0
    const/4 v0, 0x0

    aget-short v1, p0, v0

    .line 3743
    .local v1, "previous":S
    array-length v3, p0

    .line 3744
    .local v3, "n":I
    const/4 v4, 0x1

    .local v4, "i":I
    :goto_0
    if-ge v4, v3, :cond_2

    .line 3745
    aget-short v5, p0, v4

    .line 3746
    .local v5, "current":S
    invoke-static {v1, v5}, Lorg/apache/commons/lang3/math/NumberUtils;->compare(SS)I

    move-result v6

    if-lez v6, :cond_1

    .line 3747
    return v0

    .line 3750
    :cond_1
    move v1, v5

    .line 3744
    .end local v5    # "current":S
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 3752
    .end local v4    # "i":I
    :cond_2
    return v2
.end method

.method public static isSorted([Z)Z
    .locals 7
    .param p0, "array"    # [Z

    .line 3563
    invoke-static {p0}, Lorg/apache/commons/lang3/ArrayUtils;->getLength(Ljava/lang/Object;)I

    move-result v0

    const/4 v1, 0x2

    const/4 v2, 0x1

    if-ge v0, v1, :cond_0

    .line 3564
    return v2

    .line 3567
    :cond_0
    const/4 v0, 0x0

    aget-boolean v1, p0, v0

    .line 3568
    .local v1, "previous":Z
    array-length v3, p0

    .line 3569
    .local v3, "n":I
    const/4 v4, 0x1

    .local v4, "i":I
    :goto_0
    if-ge v4, v3, :cond_2

    .line 3570
    aget-boolean v5, p0, v4

    .line 3571
    .local v5, "current":Z
    invoke-static {v1, v5}, Lorg/apache/commons/lang3/BooleanUtils;->compare(ZZ)I

    move-result v6

    if-lez v6, :cond_1

    .line 3572
    return v0

    .line 3575
    :cond_1
    move v1, v5

    .line 3569
    .end local v5    # "current":Z
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 3577
    .end local v4    # "i":I
    :cond_2
    return v2
.end method

.method static synthetic lambda$containsAny$0([Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 1
    .param p0, "array"    # [Ljava/lang/Object;
    .param p1, "e"    # Ljava/lang/Object;

    .line 1657
    invoke-static {p0, p1}, Lorg/apache/commons/lang3/ArrayUtils;->contains([Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method static synthetic lambda$toObject$1([ZI)Ljava/lang/Boolean;
    .locals 1
    .param p0, "array"    # [Z
    .param p1, "i"    # I

    .line 8985
    aget-boolean v0, p0, p1

    if-eqz v0, :cond_0

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    goto :goto_0

    :cond_0
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    :goto_0
    return-object v0
.end method

.method static synthetic lambda$toObject$2([BI)Ljava/lang/Byte;
    .locals 1
    .param p0, "array"    # [B
    .param p1, "i"    # I

    .line 9003
    aget-byte v0, p0, p1

    invoke-static {v0}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v0

    return-object v0
.end method

.method static synthetic lambda$toObject$3([CI)Ljava/lang/Character;
    .locals 1
    .param p0, "array"    # [C
    .param p1, "i"    # I

    .line 9021
    aget-char v0, p0, p1

    invoke-static {v0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v0

    return-object v0
.end method

.method static synthetic lambda$toObject$4([DI)Ljava/lang/Double;
    .locals 2
    .param p0, "array"    # [D
    .param p1, "i"    # I

    .line 9039
    aget-wide v0, p0, p1

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    return-object v0
.end method

.method static synthetic lambda$toObject$5([FI)Ljava/lang/Float;
    .locals 1
    .param p0, "array"    # [F
    .param p1, "i"    # I

    .line 9057
    aget v0, p0, p1

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    return-object v0
.end method

.method static synthetic lambda$toObject$6([II)Ljava/lang/Integer;
    .locals 1
    .param p0, "array"    # [I
    .param p1, "i"    # I

    .line 9075
    aget v0, p0, p1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method static synthetic lambda$toObject$7([JI)Ljava/lang/Long;
    .locals 2
    .param p0, "array"    # [J
    .param p1, "i"    # I

    .line 9093
    aget-wide v0, p0, p1

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    return-object v0
.end method

.method static synthetic lambda$toObject$8([SI)Ljava/lang/Short;
    .locals 1
    .param p0, "array"    # [S
    .param p1, "i"    # I

    .line 9111
    aget-short v0, p0, p1

    invoke-static {v0}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v0

    return-object v0
.end method

.method public static lastIndexOf([BB)I
    .locals 1
    .param p0, "array"    # [B
    .param p1, "valueToFind"    # B

    .line 3855
    const v0, 0x7fffffff

    invoke-static {p0, p1, v0}, Lorg/apache/commons/lang3/ArrayUtils;->lastIndexOf([BBI)I

    move-result v0

    return v0
.end method

.method public static lastIndexOf([BBI)I
    .locals 3
    .param p0, "array"    # [B
    .param p1, "valueToFind"    # B
    .param p2, "startIndex"    # I

    .line 3875
    const/4 v0, -0x1

    if-eqz p0, :cond_4

    if-gez p2, :cond_0

    goto :goto_1

    .line 3878
    :cond_0
    array-length v1, p0

    if-lt p2, v1, :cond_1

    .line 3879
    array-length v1, p0

    add-int/lit8 p2, v1, -0x1

    .line 3881
    :cond_1
    move v1, p2

    .local v1, "i":I
    :goto_0
    if-ltz v1, :cond_3

    .line 3882
    aget-byte v2, p0, v1

    if-ne p1, v2, :cond_2

    .line 3883
    return v1

    .line 3881
    :cond_2
    add-int/lit8 v1, v1, -0x1

    goto :goto_0

    .line 3886
    .end local v1    # "i":I
    :cond_3
    return v0

    .line 3876
    :cond_4
    :goto_1
    return v0
.end method

.method public static lastIndexOf([CC)I
    .locals 1
    .param p0, "array"    # [C
    .param p1, "valueToFind"    # C

    .line 3902
    const v0, 0x7fffffff

    invoke-static {p0, p1, v0}, Lorg/apache/commons/lang3/ArrayUtils;->lastIndexOf([CCI)I

    move-result v0

    return v0
.end method

.method public static lastIndexOf([CCI)I
    .locals 3
    .param p0, "array"    # [C
    .param p1, "valueToFind"    # C
    .param p2, "startIndex"    # I

    .line 3923
    const/4 v0, -0x1

    if-eqz p0, :cond_4

    if-gez p2, :cond_0

    goto :goto_1

    .line 3926
    :cond_0
    array-length v1, p0

    if-lt p2, v1, :cond_1

    .line 3927
    array-length v1, p0

    add-int/lit8 p2, v1, -0x1

    .line 3929
    :cond_1
    move v1, p2

    .local v1, "i":I
    :goto_0
    if-ltz v1, :cond_3

    .line 3930
    aget-char v2, p0, v1

    if-ne p1, v2, :cond_2

    .line 3931
    return v1

    .line 3929
    :cond_2
    add-int/lit8 v1, v1, -0x1

    goto :goto_0

    .line 3934
    .end local v1    # "i":I
    :cond_3
    return v0

    .line 3924
    :cond_4
    :goto_1
    return v0
.end method

.method public static lastIndexOf([DD)I
    .locals 1
    .param p0, "array"    # [D
    .param p1, "valueToFind"    # D

    .line 3949
    const v0, 0x7fffffff

    invoke-static {p0, p1, p2, v0}, Lorg/apache/commons/lang3/ArrayUtils;->lastIndexOf([DDI)I

    move-result v0

    return v0
.end method

.method public static lastIndexOf([DDD)I
    .locals 6
    .param p0, "array"    # [D
    .param p1, "valueToFind"    # D
    .param p3, "tolerance"    # D

    .line 3967
    const v3, 0x7fffffff

    move-object v0, p0

    move-wide v1, p1

    move-wide v4, p3

    .end local p0    # "array":[D
    .end local p1    # "valueToFind":D
    .end local p3    # "tolerance":D
    .local v0, "array":[D
    .local v1, "valueToFind":D
    .local v4, "tolerance":D
    invoke-static/range {v0 .. v5}, Lorg/apache/commons/lang3/ArrayUtils;->lastIndexOf([DDID)I

    move-result p0

    return p0
.end method

.method public static lastIndexOf([DDI)I
    .locals 4
    .param p0, "array"    # [D
    .param p1, "valueToFind"    # D
    .param p3, "startIndex"    # I

    .line 3987
    invoke-static {p0}, Lorg/apache/commons/lang3/ArrayUtils;->isEmpty([D)Z

    move-result v0

    const/4 v1, -0x1

    if-nez v0, :cond_4

    if-gez p3, :cond_0

    goto :goto_1

    .line 3990
    :cond_0
    array-length v0, p0

    if-lt p3, v0, :cond_1

    .line 3991
    array-length v0, p0

    add-int/lit8 p3, v0, -0x1

    .line 3993
    :cond_1
    move v0, p3

    .local v0, "i":I
    :goto_0
    if-ltz v0, :cond_3

    .line 3994
    aget-wide v2, p0, v0

    cmpl-double v2, p1, v2

    if-nez v2, :cond_2

    .line 3995
    return v0

    .line 3993
    :cond_2
    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    .line 3998
    .end local v0    # "i":I
    :cond_3
    return v1

    .line 3988
    :cond_4
    :goto_1
    return v1
.end method

.method public static lastIndexOf([DDID)I
    .locals 8
    .param p0, "array"    # [D
    .param p1, "valueToFind"    # D
    .param p3, "startIndex"    # I
    .param p4, "tolerance"    # D

    .line 4021
    invoke-static {p0}, Lorg/apache/commons/lang3/ArrayUtils;->isEmpty([D)Z

    move-result v0

    const/4 v1, -0x1

    if-nez v0, :cond_4

    if-gez p3, :cond_0

    goto :goto_1

    .line 4024
    :cond_0
    array-length v0, p0

    if-lt p3, v0, :cond_1

    .line 4025
    array-length v0, p0

    add-int/lit8 p3, v0, -0x1

    .line 4027
    :cond_1
    sub-double v2, p1, p4

    .line 4028
    .local v2, "min":D
    add-double v4, p1, p4

    .line 4029
    .local v4, "max":D
    move v0, p3

    .local v0, "i":I
    :goto_0
    if-ltz v0, :cond_3

    .line 4030
    aget-wide v6, p0, v0

    cmpl-double v6, v6, v2

    if-ltz v6, :cond_2

    aget-wide v6, p0, v0

    cmpg-double v6, v6, v4

    if-gtz v6, :cond_2

    .line 4031
    return v0

    .line 4029
    :cond_2
    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    .line 4034
    .end local v0    # "i":I
    :cond_3
    return v1

    .line 4022
    .end local v2    # "min":D
    .end local v4    # "max":D
    :cond_4
    :goto_1
    return v1
.end method

.method public static lastIndexOf([FF)I
    .locals 1
    .param p0, "array"    # [F
    .param p1, "valueToFind"    # F

    .line 4049
    const v0, 0x7fffffff

    invoke-static {p0, p1, v0}, Lorg/apache/commons/lang3/ArrayUtils;->lastIndexOf([FFI)I

    move-result v0

    return v0
.end method

.method public static lastIndexOf([FFI)I
    .locals 3
    .param p0, "array"    # [F
    .param p1, "valueToFind"    # F
    .param p2, "startIndex"    # I

    .line 4069
    invoke-static {p0}, Lorg/apache/commons/lang3/ArrayUtils;->isEmpty([F)Z

    move-result v0

    const/4 v1, -0x1

    if-nez v0, :cond_4

    if-gez p2, :cond_0

    goto :goto_1

    .line 4072
    :cond_0
    array-length v0, p0

    if-lt p2, v0, :cond_1

    .line 4073
    array-length v0, p0

    add-int/lit8 p2, v0, -0x1

    .line 4075
    :cond_1
    move v0, p2

    .local v0, "i":I
    :goto_0
    if-ltz v0, :cond_3

    .line 4076
    aget v2, p0, v0

    cmpl-float v2, p1, v2

    if-nez v2, :cond_2

    .line 4077
    return v0

    .line 4075
    :cond_2
    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    .line 4080
    .end local v0    # "i":I
    :cond_3
    return v1

    .line 4070
    :cond_4
    :goto_1
    return v1
.end method

.method public static lastIndexOf([II)I
    .locals 1
    .param p0, "array"    # [I
    .param p1, "valueToFind"    # I

    .line 4096
    const v0, 0x7fffffff

    invoke-static {p0, p1, v0}, Lorg/apache/commons/lang3/ArrayUtils;->lastIndexOf([III)I

    move-result v0

    return v0
.end method

.method public static lastIndexOf([III)I
    .locals 3
    .param p0, "array"    # [I
    .param p1, "valueToFind"    # I
    .param p2, "startIndex"    # I

    .line 4116
    const/4 v0, -0x1

    if-eqz p0, :cond_4

    if-gez p2, :cond_0

    goto :goto_1

    .line 4119
    :cond_0
    array-length v1, p0

    if-lt p2, v1, :cond_1

    .line 4120
    array-length v1, p0

    add-int/lit8 p2, v1, -0x1

    .line 4122
    :cond_1
    move v1, p2

    .local v1, "i":I
    :goto_0
    if-ltz v1, :cond_3

    .line 4123
    aget v2, p0, v1

    if-ne p1, v2, :cond_2

    .line 4124
    return v1

    .line 4122
    :cond_2
    add-int/lit8 v1, v1, -0x1

    goto :goto_0

    .line 4127
    .end local v1    # "i":I
    :cond_3
    return v0

    .line 4117
    :cond_4
    :goto_1
    return v0
.end method

.method public static lastIndexOf([JJ)I
    .locals 1
    .param p0, "array"    # [J
    .param p1, "valueToFind"    # J

    .line 4142
    const v0, 0x7fffffff

    invoke-static {p0, p1, p2, v0}, Lorg/apache/commons/lang3/ArrayUtils;->lastIndexOf([JJI)I

    move-result v0

    return v0
.end method

.method public static lastIndexOf([JJI)I
    .locals 4
    .param p0, "array"    # [J
    .param p1, "valueToFind"    # J
    .param p3, "startIndex"    # I

    .line 4162
    const/4 v0, -0x1

    if-eqz p0, :cond_4

    if-gez p3, :cond_0

    goto :goto_1

    .line 4165
    :cond_0
    array-length v1, p0

    if-lt p3, v1, :cond_1

    .line 4166
    array-length v1, p0

    add-int/lit8 p3, v1, -0x1

    .line 4168
    :cond_1
    move v1, p3

    .local v1, "i":I
    :goto_0
    if-ltz v1, :cond_3

    .line 4169
    aget-wide v2, p0, v1

    cmp-long v2, p1, v2

    if-nez v2, :cond_2

    .line 4170
    return v1

    .line 4168
    :cond_2
    add-int/lit8 v1, v1, -0x1

    goto :goto_0

    .line 4173
    .end local v1    # "i":I
    :cond_3
    return v0

    .line 4163
    :cond_4
    :goto_1
    return v0
.end method

.method public static lastIndexOf([Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 1
    .param p0, "array"    # [Ljava/lang/Object;
    .param p1, "objectToFind"    # Ljava/lang/Object;

    .line 4188
    const v0, 0x7fffffff

    invoke-static {p0, p1, v0}, Lorg/apache/commons/lang3/ArrayUtils;->lastIndexOf([Ljava/lang/Object;Ljava/lang/Object;I)I

    move-result v0

    return v0
.end method

.method public static lastIndexOf([Ljava/lang/Object;Ljava/lang/Object;I)I
    .locals 3
    .param p0, "array"    # [Ljava/lang/Object;
    .param p1, "objectToFind"    # Ljava/lang/Object;
    .param p2, "startIndex"    # I

    .line 4208
    const/4 v0, -0x1

    if-eqz p0, :cond_7

    if-gez p2, :cond_0

    goto :goto_3

    .line 4211
    :cond_0
    array-length v1, p0

    if-lt p2, v1, :cond_1

    .line 4212
    array-length v1, p0

    add-int/lit8 p2, v1, -0x1

    .line 4214
    :cond_1
    if-nez p1, :cond_4

    .line 4215
    move v1, p2

    .local v1, "i":I
    :goto_0
    if-ltz v1, :cond_3

    .line 4216
    aget-object v2, p0, v1

    if-nez v2, :cond_2

    .line 4217
    return v1

    .line 4215
    :cond_2
    add-int/lit8 v1, v1, -0x1

    goto :goto_0

    .end local v1    # "i":I
    :cond_3
    goto :goto_2

    .line 4220
    :cond_4
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_6

    .line 4221
    move v1, p2

    .restart local v1    # "i":I
    :goto_1
    if-ltz v1, :cond_6

    .line 4222
    aget-object v2, p0, v1

    invoke-virtual {p1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_5

    .line 4223
    return v1

    .line 4221
    :cond_5
    add-int/lit8 v1, v1, -0x1

    goto :goto_1

    .line 4227
    .end local v1    # "i":I
    :cond_6
    :goto_2
    return v0

    .line 4209
    :cond_7
    :goto_3
    return v0
.end method

.method public static lastIndexOf([SS)I
    .locals 1
    .param p0, "array"    # [S
    .param p1, "valueToFind"    # S

    .line 4242
    const v0, 0x7fffffff

    invoke-static {p0, p1, v0}, Lorg/apache/commons/lang3/ArrayUtils;->lastIndexOf([SSI)I

    move-result v0

    return v0
.end method

.method public static lastIndexOf([SSI)I
    .locals 3
    .param p0, "array"    # [S
    .param p1, "valueToFind"    # S
    .param p2, "startIndex"    # I

    .line 4262
    const/4 v0, -0x1

    if-eqz p0, :cond_4

    if-gez p2, :cond_0

    goto :goto_1

    .line 4265
    :cond_0
    array-length v1, p0

    if-lt p2, v1, :cond_1

    .line 4266
    array-length v1, p0

    add-int/lit8 p2, v1, -0x1

    .line 4268
    :cond_1
    move v1, p2

    .local v1, "i":I
    :goto_0
    if-ltz v1, :cond_3

    .line 4269
    aget-short v2, p0, v1

    if-ne p1, v2, :cond_2

    .line 4270
    return v1

    .line 4268
    :cond_2
    add-int/lit8 v1, v1, -0x1

    goto :goto_0

    .line 4273
    .end local v1    # "i":I
    :cond_3
    return v0

    .line 4263
    :cond_4
    :goto_1
    return v0
.end method

.method public static lastIndexOf([ZZ)I
    .locals 1
    .param p0, "array"    # [Z
    .param p1, "valueToFind"    # Z

    .line 3809
    const v0, 0x7fffffff

    invoke-static {p0, p1, v0}, Lorg/apache/commons/lang3/ArrayUtils;->lastIndexOf([ZZI)I

    move-result v0

    return v0
.end method

.method public static lastIndexOf([ZZI)I
    .locals 3
    .param p0, "array"    # [Z
    .param p1, "valueToFind"    # Z
    .param p2, "startIndex"    # I

    .line 3829
    invoke-static {p0}, Lorg/apache/commons/lang3/ArrayUtils;->isEmpty([Z)Z

    move-result v0

    const/4 v1, -0x1

    if-nez v0, :cond_4

    if-gez p2, :cond_0

    goto :goto_1

    .line 3832
    :cond_0
    array-length v0, p0

    if-lt p2, v0, :cond_1

    .line 3833
    array-length v0, p0

    add-int/lit8 p2, v0, -0x1

    .line 3835
    :cond_1
    move v0, p2

    .local v0, "i":I
    :goto_0
    if-ltz v0, :cond_3

    .line 3836
    aget-boolean v2, p0, v0

    if-ne p1, v2, :cond_2

    .line 3837
    return v0

    .line 3835
    :cond_2
    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    .line 3840
    .end local v0    # "i":I
    :cond_3
    return v1

    .line 3830
    :cond_4
    :goto_1
    return v1
.end method

.method public static newInstance(Ljava/lang/Class;I)[Ljava/lang/Object;
    .locals 1
    .param p1, "length"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;I)[TT;"
        }
    .end annotation

    .line 4288
    .local p0, "componentType":Ljava/lang/Class;, "Ljava/lang/Class<TT;>;"
    invoke-static {p0, p1}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/Object;

    return-object v0
.end method

.method public static nullToEmpty([B)[B
    .locals 1
    .param p0, "array"    # [B

    .line 4345
    invoke-static {p0}, Lorg/apache/commons/lang3/ArrayUtils;->isEmpty([B)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lorg/apache/commons/lang3/ArrayUtils;->EMPTY_BYTE_ARRAY:[B

    goto :goto_0

    :cond_0
    move-object v0, p0

    :goto_0
    return-object v0
.end method

.method public static nullToEmpty([C)[C
    .locals 1
    .param p0, "array"    # [C

    .line 4383
    invoke-static {p0}, Lorg/apache/commons/lang3/ArrayUtils;->isEmpty([C)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lorg/apache/commons/lang3/ArrayUtils;->EMPTY_CHAR_ARRAY:[C

    goto :goto_0

    :cond_0
    move-object v0, p0

    :goto_0
    return-object v0
.end method

.method public static nullToEmpty([D)[D
    .locals 1
    .param p0, "array"    # [D

    .line 4440
    invoke-static {p0}, Lorg/apache/commons/lang3/ArrayUtils;->isEmpty([D)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lorg/apache/commons/lang3/ArrayUtils;->EMPTY_DOUBLE_ARRAY:[D

    goto :goto_0

    :cond_0
    move-object v0, p0

    :goto_0
    return-object v0
.end method

.method public static nullToEmpty([F)[F
    .locals 1
    .param p0, "array"    # [F

    .line 4478
    invoke-static {p0}, Lorg/apache/commons/lang3/ArrayUtils;->isEmpty([F)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lorg/apache/commons/lang3/ArrayUtils;->EMPTY_FLOAT_ARRAY:[F

    goto :goto_0

    :cond_0
    move-object v0, p0

    :goto_0
    return-object v0
.end method

.method public static nullToEmpty([I)[I
    .locals 1
    .param p0, "array"    # [I

    .line 4516
    invoke-static {p0}, Lorg/apache/commons/lang3/ArrayUtils;->isEmpty([I)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lorg/apache/commons/lang3/ArrayUtils;->EMPTY_INT_ARRAY:[I

    goto :goto_0

    :cond_0
    move-object v0, p0

    :goto_0
    return-object v0
.end method

.method public static nullToEmpty([J)[J
    .locals 1
    .param p0, "array"    # [J

    .line 4554
    invoke-static {p0}, Lorg/apache/commons/lang3/ArrayUtils;->isEmpty([J)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lorg/apache/commons/lang3/ArrayUtils;->EMPTY_LONG_ARRAY:[J

    goto :goto_0

    :cond_0
    move-object v0, p0

    :goto_0
    return-object v0
.end method

.method public static nullToEmpty([Ljava/lang/Boolean;)[Ljava/lang/Boolean;
    .locals 1
    .param p0, "array"    # [Ljava/lang/Boolean;

    .line 4326
    invoke-static {p0}, Lorg/apache/commons/lang3/ArrayUtils;->isEmpty([Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lorg/apache/commons/lang3/ArrayUtils;->EMPTY_BOOLEAN_OBJECT_ARRAY:[Ljava/lang/Boolean;

    goto :goto_0

    :cond_0
    move-object v0, p0

    :goto_0
    return-object v0
.end method

.method public static nullToEmpty([Ljava/lang/Byte;)[Ljava/lang/Byte;
    .locals 1
    .param p0, "array"    # [Ljava/lang/Byte;

    .line 4364
    invoke-static {p0}, Lorg/apache/commons/lang3/ArrayUtils;->isEmpty([Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lorg/apache/commons/lang3/ArrayUtils;->EMPTY_BYTE_OBJECT_ARRAY:[Ljava/lang/Byte;

    goto :goto_0

    :cond_0
    move-object v0, p0

    :goto_0
    return-object v0
.end method

.method public static nullToEmpty([Ljava/lang/Character;)[Ljava/lang/Character;
    .locals 1
    .param p0, "array"    # [Ljava/lang/Character;

    .line 4402
    invoke-static {p0}, Lorg/apache/commons/lang3/ArrayUtils;->isEmpty([Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lorg/apache/commons/lang3/ArrayUtils;->EMPTY_CHARACTER_OBJECT_ARRAY:[Ljava/lang/Character;

    goto :goto_0

    :cond_0
    move-object v0, p0

    :goto_0
    return-object v0
.end method

.method public static nullToEmpty([Ljava/lang/Class;)[Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Ljava/lang/Class<",
            "*>;)[",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation

    .line 4421
    .local p0, "array":[Ljava/lang/Class;, "[Ljava/lang/Class<*>;"
    invoke-static {p0}, Lorg/apache/commons/lang3/ArrayUtils;->isEmpty([Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lorg/apache/commons/lang3/ArrayUtils;->EMPTY_CLASS_ARRAY:[Ljava/lang/Class;

    goto :goto_0

    :cond_0
    move-object v0, p0

    :goto_0
    return-object v0
.end method

.method public static nullToEmpty([Ljava/lang/Double;)[Ljava/lang/Double;
    .locals 1
    .param p0, "array"    # [Ljava/lang/Double;

    .line 4459
    invoke-static {p0}, Lorg/apache/commons/lang3/ArrayUtils;->isEmpty([Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lorg/apache/commons/lang3/ArrayUtils;->EMPTY_DOUBLE_OBJECT_ARRAY:[Ljava/lang/Double;

    goto :goto_0

    :cond_0
    move-object v0, p0

    :goto_0
    return-object v0
.end method

.method public static nullToEmpty([Ljava/lang/Float;)[Ljava/lang/Float;
    .locals 1
    .param p0, "array"    # [Ljava/lang/Float;

    .line 4497
    invoke-static {p0}, Lorg/apache/commons/lang3/ArrayUtils;->isEmpty([Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lorg/apache/commons/lang3/ArrayUtils;->EMPTY_FLOAT_OBJECT_ARRAY:[Ljava/lang/Float;

    goto :goto_0

    :cond_0
    move-object v0, p0

    :goto_0
    return-object v0
.end method

.method public static nullToEmpty([Ljava/lang/Integer;)[Ljava/lang/Integer;
    .locals 1
    .param p0, "array"    # [Ljava/lang/Integer;

    .line 4535
    invoke-static {p0}, Lorg/apache/commons/lang3/ArrayUtils;->isEmpty([Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lorg/apache/commons/lang3/ArrayUtils;->EMPTY_INTEGER_OBJECT_ARRAY:[Ljava/lang/Integer;

    goto :goto_0

    :cond_0
    move-object v0, p0

    :goto_0
    return-object v0
.end method

.method public static nullToEmpty([Ljava/lang/Long;)[Ljava/lang/Long;
    .locals 1
    .param p0, "array"    # [Ljava/lang/Long;

    .line 4573
    invoke-static {p0}, Lorg/apache/commons/lang3/ArrayUtils;->isEmpty([Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lorg/apache/commons/lang3/ArrayUtils;->EMPTY_LONG_OBJECT_ARRAY:[Ljava/lang/Long;

    goto :goto_0

    :cond_0
    move-object v0, p0

    :goto_0
    return-object v0
.end method

.method public static nullToEmpty([Ljava/lang/Object;)[Ljava/lang/Object;
    .locals 1
    .param p0, "array"    # [Ljava/lang/Object;

    .line 4592
    invoke-static {p0}, Lorg/apache/commons/lang3/ArrayUtils;->isEmpty([Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lorg/apache/commons/lang3/ArrayUtils;->EMPTY_OBJECT_ARRAY:[Ljava/lang/Object;

    goto :goto_0

    :cond_0
    move-object v0, p0

    :goto_0
    return-object v0
.end method

.method public static nullToEmpty([Ljava/lang/Object;Ljava/lang/Class;)[Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">([TT;",
            "Ljava/lang/Class<",
            "[TT;>;)[TT;"
        }
    .end annotation

    .line 4667
    .local p0, "array":[Ljava/lang/Object;, "[TT;"
    .local p1, "type":Ljava/lang/Class;, "Ljava/lang/Class<[TT;>;"
    if-eqz p1, :cond_1

    .line 4671
    if-nez p0, :cond_0

    .line 4672
    invoke-virtual {p1}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;I)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/Class;->cast(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/Object;

    return-object v0

    .line 4674
    :cond_0
    return-object p0

    .line 4668
    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "The type must not be null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static nullToEmpty([Ljava/lang/Short;)[Ljava/lang/Short;
    .locals 1
    .param p0, "array"    # [Ljava/lang/Short;

    .line 4630
    invoke-static {p0}, Lorg/apache/commons/lang3/ArrayUtils;->isEmpty([Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lorg/apache/commons/lang3/ArrayUtils;->EMPTY_SHORT_OBJECT_ARRAY:[Ljava/lang/Short;

    goto :goto_0

    :cond_0
    move-object v0, p0

    :goto_0
    return-object v0
.end method

.method public static nullToEmpty([Ljava/lang/String;)[Ljava/lang/String;
    .locals 1
    .param p0, "array"    # [Ljava/lang/String;

    .line 4649
    invoke-static {p0}, Lorg/apache/commons/lang3/ArrayUtils;->isEmpty([Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lorg/apache/commons/lang3/ArrayUtils;->EMPTY_STRING_ARRAY:[Ljava/lang/String;

    goto :goto_0

    :cond_0
    move-object v0, p0

    :goto_0
    return-object v0
.end method

.method public static nullToEmpty([S)[S
    .locals 1
    .param p0, "array"    # [S

    .line 4611
    invoke-static {p0}, Lorg/apache/commons/lang3/ArrayUtils;->isEmpty([S)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lorg/apache/commons/lang3/ArrayUtils;->EMPTY_SHORT_ARRAY:[S

    goto :goto_0

    :cond_0
    move-object v0, p0

    :goto_0
    return-object v0
.end method

.method public static nullToEmpty([Z)[Z
    .locals 1
    .param p0, "array"    # [Z

    .line 4307
    invoke-static {p0}, Lorg/apache/commons/lang3/ArrayUtils;->isEmpty([Z)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lorg/apache/commons/lang3/ArrayUtils;->EMPTY_BOOLEAN_ARRAY:[Z

    goto :goto_0

    :cond_0
    move-object v0, p0

    :goto_0
    return-object v0
.end method

.method private static random()Ljava/util/concurrent/ThreadLocalRandom;
    .locals 1

    .line 4678
    invoke-static {}, Ljava/util/concurrent/ThreadLocalRandom;->current()Ljava/util/concurrent/ThreadLocalRandom;

    move-result-object v0

    return-object v0
.end method

.method private static remove(Ljava/lang/Object;I)Ljava/lang/Object;
    .locals 4
    .param p0, "array"    # Ljava/lang/Object;
    .param p1, "index"    # I

    .line 4936
    invoke-static {p0}, Lorg/apache/commons/lang3/ArrayUtils;->getLength(Ljava/lang/Object;)I

    move-result v0

    .line 4937
    .local v0, "length":I
    if-ltz p1, :cond_1

    if-ge p1, v0, :cond_1

    .line 4941
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    move-result-object v1

    add-int/lit8 v2, v0, -0x1

    invoke-static {v1, v2}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;I)Ljava/lang/Object;

    move-result-object v1

    .line 4942
    .local v1, "result":Ljava/lang/Object;
    const/4 v2, 0x0

    invoke-static {p0, v2, v1, v2, p1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 4943
    add-int/lit8 v2, v0, -0x1

    if-ge p1, v2, :cond_0

    .line 4944
    add-int/lit8 v2, p1, 0x1

    sub-int v3, v0, p1

    add-int/lit8 v3, v3, -0x1

    invoke-static {p0, v2, v1, p1, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 4947
    :cond_0
    return-object v1

    .line 4938
    .end local v1    # "result":Ljava/lang/Object;
    :cond_1
    new-instance v1, Ljava/lang/IndexOutOfBoundsException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Index: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", Length: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public static remove([BI)[B
    .locals 1
    .param p0, "array"    # [B
    .param p1, "index"    # I

    .line 4744
    invoke-static {p0, p1}, Lorg/apache/commons/lang3/ArrayUtils;->remove(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [B

    return-object v0
.end method

.method public static remove([CI)[C
    .locals 1
    .param p0, "array"    # [C
    .param p1, "index"    # I

    .line 4777
    invoke-static {p0, p1}, Lorg/apache/commons/lang3/ArrayUtils;->remove(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [C

    return-object v0
.end method

.method public static remove([DI)[D
    .locals 1
    .param p0, "array"    # [D
    .param p1, "index"    # I

    .line 4810
    invoke-static {p0, p1}, Lorg/apache/commons/lang3/ArrayUtils;->remove(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [D

    return-object v0
.end method

.method public static remove([FI)[F
    .locals 1
    .param p0, "array"    # [F
    .param p1, "index"    # I

    .line 4843
    invoke-static {p0, p1}, Lorg/apache/commons/lang3/ArrayUtils;->remove(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [F

    return-object v0
.end method

.method public static remove([II)[I
    .locals 1
    .param p0, "array"    # [I
    .param p1, "index"    # I

    .line 4876
    invoke-static {p0, p1}, Lorg/apache/commons/lang3/ArrayUtils;->remove(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [I

    return-object v0
.end method

.method public static remove([JI)[J
    .locals 1
    .param p0, "array"    # [J
    .param p1, "index"    # I

    .line 4909
    invoke-static {p0, p1}, Lorg/apache/commons/lang3/ArrayUtils;->remove(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [J

    return-object v0
.end method

.method public static remove([Ljava/lang/Object;I)[Ljava/lang/Object;
    .locals 1
    .param p1, "index"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">([TT;I)[TT;"
        }
    .end annotation

    .line 5015
    .local p0, "array":[Ljava/lang/Object;, "[TT;"
    invoke-static {p0, p1}, Lorg/apache/commons/lang3/ArrayUtils;->remove(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/Object;

    return-object v0
.end method

.method public static remove([SI)[S
    .locals 1
    .param p0, "array"    # [S
    .param p1, "index"    # I

    .line 4980
    invoke-static {p0, p1}, Lorg/apache/commons/lang3/ArrayUtils;->remove(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [S

    return-object v0
.end method

.method public static remove([ZI)[Z
    .locals 1
    .param p0, "array"    # [Z
    .param p1, "index"    # I

    .line 4711
    invoke-static {p0, p1}, Lorg/apache/commons/lang3/ArrayUtils;->remove(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Z

    return-object v0
.end method

.method static removeAll(Ljava/lang/Object;Ljava/util/BitSet;)Ljava/lang/Object;
    .locals 8
    .param p0, "array"    # Ljava/lang/Object;
    .param p1, "indices"    # Ljava/util/BitSet;

    .line 5262
    if-nez p0, :cond_0

    .line 5263
    const/4 v0, 0x0

    return-object v0

    .line 5266
    :cond_0
    invoke-static {p0}, Lorg/apache/commons/lang3/ArrayUtils;->getLength(Ljava/lang/Object;)I

    move-result v0

    .line 5273
    .local v0, "srcLength":I
    invoke-virtual {p1}, Ljava/util/BitSet;->cardinality()I

    move-result v1

    .line 5274
    .local v1, "removals":I
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    move-result-object v2

    sub-int v3, v0, v1

    invoke-static {v2, v3}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;I)Ljava/lang/Object;

    move-result-object v2

    .line 5275
    .local v2, "result":Ljava/lang/Object;
    const/4 v3, 0x0

    .line 5276
    .local v3, "srcIndex":I
    const/4 v4, 0x0

    .line 5279
    .local v4, "destIndex":I
    :goto_0
    invoke-virtual {p1, v3}, Ljava/util/BitSet;->nextSetBit(I)I

    move-result v5

    move v6, v5

    .local v6, "set":I
    const/4 v7, -0x1

    if-eq v5, v7, :cond_2

    .line 5280
    sub-int v5, v6, v3

    .line 5281
    .local v5, "count":I
    if-lez v5, :cond_1

    .line 5282
    invoke-static {p0, v3, v2, v4, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 5283
    add-int/2addr v4, v5

    .line 5285
    :cond_1
    invoke-virtual {p1, v6}, Ljava/util/BitSet;->nextClearBit(I)I

    move-result v3

    goto :goto_0

    .line 5287
    .end local v5    # "count":I
    :cond_2
    sub-int v5, v0, v3

    .line 5288
    .restart local v5    # "count":I
    if-lez v5, :cond_3

    .line 5289
    invoke-static {p0, v3, v2, v4, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 5291
    :cond_3
    return-object v2
.end method

.method static varargs removeAll(Ljava/lang/Object;[I)Ljava/lang/Object;
    .locals 11
    .param p0, "array"    # Ljava/lang/Object;
    .param p1, "indices"    # [I

    .line 5304
    invoke-static {p0}, Lorg/apache/commons/lang3/ArrayUtils;->getLength(Ljava/lang/Object;)I

    move-result v0

    .line 5305
    .local v0, "length":I
    const/4 v1, 0x0

    .line 5306
    .local v1, "diff":I
    invoke-static {p1}, Lorg/apache/commons/lang3/ArrayUtils;->clone([I)[I

    move-result-object v2

    invoke-static {v2}, Lorg/apache/commons/lang3/ArraySorter;->sort([I)[I

    move-result-object v2

    .line 5309
    .local v2, "clonedIndices":[I
    invoke-static {v2}, Lorg/apache/commons/lang3/ArrayUtils;->isNotEmpty([I)Z

    move-result v3

    if-eqz v3, :cond_2

    .line 5310
    array-length v3, v2

    .line 5311
    .local v3, "i":I
    move v4, v0

    .line 5312
    .local v4, "prevIndex":I
    :goto_0
    add-int/lit8 v3, v3, -0x1

    if-ltz v3, :cond_2

    .line 5313
    aget v5, v2, v3

    .line 5314
    .local v5, "index":I
    if-ltz v5, :cond_1

    if-ge v5, v0, :cond_1

    .line 5317
    if-lt v5, v4, :cond_0

    .line 5318
    goto :goto_0

    .line 5320
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 5321
    move v4, v5

    .line 5322
    .end local v5    # "index":I
    goto :goto_0

    .line 5315
    .restart local v5    # "index":I
    :cond_1
    new-instance v6, Ljava/lang/IndexOutOfBoundsException;

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "Index: "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v7

    const-string v8, ", Length: "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-direct {v6, v7}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v6

    .line 5326
    .end local v3    # "i":I
    .end local v4    # "prevIndex":I
    .end local v5    # "index":I
    :cond_2
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    move-result-object v3

    sub-int v4, v0, v1

    invoke-static {v3, v4}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;I)Ljava/lang/Object;

    move-result-object v3

    .line 5327
    .local v3, "result":Ljava/lang/Object;
    if-ge v1, v0, :cond_5

    .line 5328
    move v4, v0

    .line 5329
    .local v4, "end":I
    sub-int v5, v0, v1

    .line 5330
    .local v5, "dest":I
    array-length v6, v2

    const/4 v7, 0x1

    sub-int/2addr v6, v7

    .local v6, "i":I
    :goto_1
    if-ltz v6, :cond_4

    .line 5331
    aget v8, v2, v6

    .line 5332
    .local v8, "index":I
    sub-int v9, v4, v8

    if-le v9, v7, :cond_3

    .line 5333
    sub-int v9, v4, v8

    sub-int/2addr v9, v7

    .line 5334
    .local v9, "cp":I
    sub-int/2addr v5, v9

    .line 5335
    add-int/lit8 v10, v8, 0x1

    invoke-static {p0, v10, v3, v5, v9}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 5338
    .end local v9    # "cp":I
    :cond_3
    move v4, v8

    .line 5330
    .end local v8    # "index":I
    add-int/lit8 v6, v6, -0x1

    goto :goto_1

    .line 5340
    .end local v6    # "i":I
    :cond_4
    if-lez v4, :cond_5

    .line 5341
    const/4 v6, 0x0

    invoke-static {p0, v6, v3, v6, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 5344
    .end local v4    # "end":I
    .end local v5    # "dest":I
    :cond_5
    return-object v3
.end method

.method public static varargs removeAll([B[I)[B
    .locals 1
    .param p0, "array"    # [B
    .param p1, "indices"    # [I

    .line 5079
    invoke-static {p0, p1}, Lorg/apache/commons/lang3/ArrayUtils;->removeAll(Ljava/lang/Object;[I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [B

    return-object v0
.end method

.method public static varargs removeAll([C[I)[C
    .locals 1
    .param p0, "array"    # [C
    .param p1, "indices"    # [I

    .line 5113
    invoke-static {p0, p1}, Lorg/apache/commons/lang3/ArrayUtils;->removeAll(Ljava/lang/Object;[I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [C

    return-object v0
.end method

.method public static varargs removeAll([D[I)[D
    .locals 1
    .param p0, "array"    # [D
    .param p1, "indices"    # [I

    .line 5147
    invoke-static {p0, p1}, Lorg/apache/commons/lang3/ArrayUtils;->removeAll(Ljava/lang/Object;[I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [D

    return-object v0
.end method

.method public static varargs removeAll([F[I)[F
    .locals 1
    .param p0, "array"    # [F
    .param p1, "indices"    # [I

    .line 5181
    invoke-static {p0, p1}, Lorg/apache/commons/lang3/ArrayUtils;->removeAll(Ljava/lang/Object;[I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [F

    return-object v0
.end method

.method public static varargs removeAll([I[I)[I
    .locals 1
    .param p0, "array"    # [I
    .param p1, "indices"    # [I

    .line 5215
    invoke-static {p0, p1}, Lorg/apache/commons/lang3/ArrayUtils;->removeAll(Ljava/lang/Object;[I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [I

    return-object v0
.end method

.method public static varargs removeAll([J[I)[J
    .locals 1
    .param p0, "array"    # [J
    .param p1, "indices"    # [I

    .line 5249
    invoke-static {p0, p1}, Lorg/apache/commons/lang3/ArrayUtils;->removeAll(Ljava/lang/Object;[I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [J

    return-object v0
.end method

.method public static varargs removeAll([Ljava/lang/Object;[I)[Ljava/lang/Object;
    .locals 1
    .param p1, "indices"    # [I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">([TT;[I)[TT;"
        }
    .end annotation

    .line 5410
    .local p0, "array":[Ljava/lang/Object;, "[TT;"
    invoke-static {p0, p1}, Lorg/apache/commons/lang3/ArrayUtils;->removeAll(Ljava/lang/Object;[I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/Object;

    return-object v0
.end method

.method public static varargs removeAll([S[I)[S
    .locals 1
    .param p0, "array"    # [S
    .param p1, "indices"    # [I

    .line 5378
    invoke-static {p0, p1}, Lorg/apache/commons/lang3/ArrayUtils;->removeAll(Ljava/lang/Object;[I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [S

    return-object v0
.end method

.method public static varargs removeAll([Z[I)[Z
    .locals 1
    .param p0, "array"    # [Z
    .param p1, "indices"    # [I

    .line 5045
    invoke-static {p0, p1}, Lorg/apache/commons/lang3/ArrayUtils;->removeAll(Ljava/lang/Object;[I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Z

    return-object v0
.end method

.method public static removeAllOccurences([BB)[B
    .locals 1
    .param p0, "array"    # [B
    .param p1, "element"    # B
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 5450
    invoke-static {p0, p1}, Lorg/apache/commons/lang3/ArrayUtils;->indexesOf([BB)Ljava/util/BitSet;

    move-result-object v0

    invoke-static {p0, v0}, Lorg/apache/commons/lang3/ArrayUtils;->removeAll(Ljava/lang/Object;Ljava/util/BitSet;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [B

    return-object v0
.end method

.method public static removeAllOccurences([CC)[C
    .locals 1
    .param p0, "array"    # [C
    .param p1, "element"    # C
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 5470
    invoke-static {p0, p1}, Lorg/apache/commons/lang3/ArrayUtils;->indexesOf([CC)Ljava/util/BitSet;

    move-result-object v0

    invoke-static {p0, v0}, Lorg/apache/commons/lang3/ArrayUtils;->removeAll(Ljava/lang/Object;Ljava/util/BitSet;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [C

    return-object v0
.end method

.method public static removeAllOccurences([DD)[D
    .locals 1
    .param p0, "array"    # [D
    .param p1, "element"    # D
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 5490
    invoke-static {p0, p1, p2}, Lorg/apache/commons/lang3/ArrayUtils;->indexesOf([DD)Ljava/util/BitSet;

    move-result-object v0

    invoke-static {p0, v0}, Lorg/apache/commons/lang3/ArrayUtils;->removeAll(Ljava/lang/Object;Ljava/util/BitSet;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [D

    return-object v0
.end method

.method public static removeAllOccurences([FF)[F
    .locals 1
    .param p0, "array"    # [F
    .param p1, "element"    # F
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 5510
    invoke-static {p0, p1}, Lorg/apache/commons/lang3/ArrayUtils;->indexesOf([FF)Ljava/util/BitSet;

    move-result-object v0

    invoke-static {p0, v0}, Lorg/apache/commons/lang3/ArrayUtils;->removeAll(Ljava/lang/Object;Ljava/util/BitSet;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [F

    return-object v0
.end method

.method public static removeAllOccurences([II)[I
    .locals 1
    .param p0, "array"    # [I
    .param p1, "element"    # I
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 5530
    invoke-static {p0, p1}, Lorg/apache/commons/lang3/ArrayUtils;->indexesOf([II)Ljava/util/BitSet;

    move-result-object v0

    invoke-static {p0, v0}, Lorg/apache/commons/lang3/ArrayUtils;->removeAll(Ljava/lang/Object;Ljava/util/BitSet;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [I

    return-object v0
.end method

.method public static removeAllOccurences([JJ)[J
    .locals 1
    .param p0, "array"    # [J
    .param p1, "element"    # J
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 5550
    invoke-static {p0, p1, p2}, Lorg/apache/commons/lang3/ArrayUtils;->indexesOf([JJ)Ljava/util/BitSet;

    move-result-object v0

    invoke-static {p0, v0}, Lorg/apache/commons/lang3/ArrayUtils;->removeAll(Ljava/lang/Object;Ljava/util/BitSet;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [J

    return-object v0
.end method

.method public static removeAllOccurences([Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">([TT;TT;)[TT;"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 5591
    .local p0, "array":[Ljava/lang/Object;, "[TT;"
    .local p1, "element":Ljava/lang/Object;, "TT;"
    invoke-static {p0, p1}, Lorg/apache/commons/lang3/ArrayUtils;->indexesOf([Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/BitSet;

    move-result-object v0

    invoke-static {p0, v0}, Lorg/apache/commons/lang3/ArrayUtils;->removeAll(Ljava/lang/Object;Ljava/util/BitSet;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/Object;

    return-object v0
.end method

.method public static removeAllOccurences([SS)[S
    .locals 1
    .param p0, "array"    # [S
    .param p1, "element"    # S
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 5570
    invoke-static {p0, p1}, Lorg/apache/commons/lang3/ArrayUtils;->indexesOf([SS)Ljava/util/BitSet;

    move-result-object v0

    invoke-static {p0, v0}, Lorg/apache/commons/lang3/ArrayUtils;->removeAll(Ljava/lang/Object;Ljava/util/BitSet;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [S

    return-object v0
.end method

.method public static removeAllOccurences([ZZ)[Z
    .locals 1
    .param p0, "array"    # [Z
    .param p1, "element"    # Z
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 5430
    invoke-static {p0, p1}, Lorg/apache/commons/lang3/ArrayUtils;->indexesOf([ZZ)Ljava/util/BitSet;

    move-result-object v0

    invoke-static {p0, v0}, Lorg/apache/commons/lang3/ArrayUtils;->removeAll(Ljava/lang/Object;Ljava/util/BitSet;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Z

    return-object v0
.end method

.method public static removeAllOccurrences([BB)[B
    .locals 1
    .param p0, "array"    # [B
    .param p1, "element"    # B

    .line 5627
    invoke-static {p0, p1}, Lorg/apache/commons/lang3/ArrayUtils;->indexesOf([BB)Ljava/util/BitSet;

    move-result-object v0

    invoke-static {p0, v0}, Lorg/apache/commons/lang3/ArrayUtils;->removeAll(Ljava/lang/Object;Ljava/util/BitSet;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [B

    return-object v0
.end method

.method public static removeAllOccurrences([CC)[C
    .locals 1
    .param p0, "array"    # [C
    .param p1, "element"    # C

    .line 5645
    invoke-static {p0, p1}, Lorg/apache/commons/lang3/ArrayUtils;->indexesOf([CC)Ljava/util/BitSet;

    move-result-object v0

    invoke-static {p0, v0}, Lorg/apache/commons/lang3/ArrayUtils;->removeAll(Ljava/lang/Object;Ljava/util/BitSet;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [C

    return-object v0
.end method

.method public static removeAllOccurrences([DD)[D
    .locals 1
    .param p0, "array"    # [D
    .param p1, "element"    # D

    .line 5663
    invoke-static {p0, p1, p2}, Lorg/apache/commons/lang3/ArrayUtils;->indexesOf([DD)Ljava/util/BitSet;

    move-result-object v0

    invoke-static {p0, v0}, Lorg/apache/commons/lang3/ArrayUtils;->removeAll(Ljava/lang/Object;Ljava/util/BitSet;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [D

    return-object v0
.end method

.method public static removeAllOccurrences([FF)[F
    .locals 1
    .param p0, "array"    # [F
    .param p1, "element"    # F

    .line 5681
    invoke-static {p0, p1}, Lorg/apache/commons/lang3/ArrayUtils;->indexesOf([FF)Ljava/util/BitSet;

    move-result-object v0

    invoke-static {p0, v0}, Lorg/apache/commons/lang3/ArrayUtils;->removeAll(Ljava/lang/Object;Ljava/util/BitSet;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [F

    return-object v0
.end method

.method public static removeAllOccurrences([II)[I
    .locals 1
    .param p0, "array"    # [I
    .param p1, "element"    # I

    .line 5699
    invoke-static {p0, p1}, Lorg/apache/commons/lang3/ArrayUtils;->indexesOf([II)Ljava/util/BitSet;

    move-result-object v0

    invoke-static {p0, v0}, Lorg/apache/commons/lang3/ArrayUtils;->removeAll(Ljava/lang/Object;Ljava/util/BitSet;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [I

    return-object v0
.end method

.method public static removeAllOccurrences([JJ)[J
    .locals 1
    .param p0, "array"    # [J
    .param p1, "element"    # J

    .line 5717
    invoke-static {p0, p1, p2}, Lorg/apache/commons/lang3/ArrayUtils;->indexesOf([JJ)Ljava/util/BitSet;

    move-result-object v0

    invoke-static {p0, v0}, Lorg/apache/commons/lang3/ArrayUtils;->removeAll(Ljava/lang/Object;Ljava/util/BitSet;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [J

    return-object v0
.end method

.method public static removeAllOccurrences([Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">([TT;TT;)[TT;"
        }
    .end annotation

    .line 5754
    .local p0, "array":[Ljava/lang/Object;, "[TT;"
    .local p1, "element":Ljava/lang/Object;, "TT;"
    invoke-static {p0, p1}, Lorg/apache/commons/lang3/ArrayUtils;->indexesOf([Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/BitSet;

    move-result-object v0

    invoke-static {p0, v0}, Lorg/apache/commons/lang3/ArrayUtils;->removeAll(Ljava/lang/Object;Ljava/util/BitSet;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/Object;

    return-object v0
.end method

.method public static removeAllOccurrences([SS)[S
    .locals 1
    .param p0, "array"    # [S
    .param p1, "element"    # S

    .line 5735
    invoke-static {p0, p1}, Lorg/apache/commons/lang3/ArrayUtils;->indexesOf([SS)Ljava/util/BitSet;

    move-result-object v0

    invoke-static {p0, v0}, Lorg/apache/commons/lang3/ArrayUtils;->removeAll(Ljava/lang/Object;Ljava/util/BitSet;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [S

    return-object v0
.end method

.method public static removeAllOccurrences([ZZ)[Z
    .locals 1
    .param p0, "array"    # [Z
    .param p1, "element"    # Z

    .line 5609
    invoke-static {p0, p1}, Lorg/apache/commons/lang3/ArrayUtils;->indexesOf([ZZ)Ljava/util/BitSet;

    move-result-object v0

    invoke-static {p0, v0}, Lorg/apache/commons/lang3/ArrayUtils;->removeAll(Ljava/lang/Object;Ljava/util/BitSet;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Z

    return-object v0
.end method

.method public static removeElement([BB)[B
    .locals 2
    .param p0, "array"    # [B
    .param p1, "element"    # B

    .line 5813
    invoke-static {p0, p1}, Lorg/apache/commons/lang3/ArrayUtils;->indexOf([BB)I

    move-result v0

    .line 5814
    .local v0, "index":I
    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    invoke-static {p0}, Lorg/apache/commons/lang3/ArrayUtils;->clone([B)[B

    move-result-object v1

    goto :goto_0

    :cond_0
    invoke-static {p0, v0}, Lorg/apache/commons/lang3/ArrayUtils;->remove([BI)[B

    move-result-object v1

    :goto_0
    return-object v1
.end method

.method public static removeElement([CC)[C
    .locals 2
    .param p0, "array"    # [C
    .param p1, "element"    # C

    .line 5843
    invoke-static {p0, p1}, Lorg/apache/commons/lang3/ArrayUtils;->indexOf([CC)I

    move-result v0

    .line 5844
    .local v0, "index":I
    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    invoke-static {p0}, Lorg/apache/commons/lang3/ArrayUtils;->clone([C)[C

    move-result-object v1

    goto :goto_0

    :cond_0
    invoke-static {p0, v0}, Lorg/apache/commons/lang3/ArrayUtils;->remove([CI)[C

    move-result-object v1

    :goto_0
    return-object v1
.end method

.method public static removeElement([DD)[D
    .locals 2
    .param p0, "array"    # [D
    .param p1, "element"    # D

    .line 5873
    invoke-static {p0, p1, p2}, Lorg/apache/commons/lang3/ArrayUtils;->indexOf([DD)I

    move-result v0

    .line 5874
    .local v0, "index":I
    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    invoke-static {p0}, Lorg/apache/commons/lang3/ArrayUtils;->clone([D)[D

    move-result-object v1

    goto :goto_0

    :cond_0
    invoke-static {p0, v0}, Lorg/apache/commons/lang3/ArrayUtils;->remove([DI)[D

    move-result-object v1

    :goto_0
    return-object v1
.end method

.method public static removeElement([FF)[F
    .locals 2
    .param p0, "array"    # [F
    .param p1, "element"    # F

    .line 5903
    invoke-static {p0, p1}, Lorg/apache/commons/lang3/ArrayUtils;->indexOf([FF)I

    move-result v0

    .line 5904
    .local v0, "index":I
    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    invoke-static {p0}, Lorg/apache/commons/lang3/ArrayUtils;->clone([F)[F

    move-result-object v1

    goto :goto_0

    :cond_0
    invoke-static {p0, v0}, Lorg/apache/commons/lang3/ArrayUtils;->remove([FI)[F

    move-result-object v1

    :goto_0
    return-object v1
.end method

.method public static removeElement([II)[I
    .locals 2
    .param p0, "array"    # [I
    .param p1, "element"    # I

    .line 5933
    invoke-static {p0, p1}, Lorg/apache/commons/lang3/ArrayUtils;->indexOf([II)I

    move-result v0

    .line 5934
    .local v0, "index":I
    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    invoke-static {p0}, Lorg/apache/commons/lang3/ArrayUtils;->clone([I)[I

    move-result-object v1

    goto :goto_0

    :cond_0
    invoke-static {p0, v0}, Lorg/apache/commons/lang3/ArrayUtils;->remove([II)[I

    move-result-object v1

    :goto_0
    return-object v1
.end method

.method public static removeElement([JJ)[J
    .locals 2
    .param p0, "array"    # [J
    .param p1, "element"    # J

    .line 5963
    invoke-static {p0, p1, p2}, Lorg/apache/commons/lang3/ArrayUtils;->indexOf([JJ)I

    move-result v0

    .line 5964
    .local v0, "index":I
    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    invoke-static {p0}, Lorg/apache/commons/lang3/ArrayUtils;->clone([J)[J

    move-result-object v1

    goto :goto_0

    :cond_0
    invoke-static {p0, v0}, Lorg/apache/commons/lang3/ArrayUtils;->remove([JI)[J

    move-result-object v1

    :goto_0
    return-object v1
.end method

.method public static removeElement([Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;
    .locals 2
    .param p1, "element"    # Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">([TT;",
            "Ljava/lang/Object;",
            ")[TT;"
        }
    .end annotation

    .line 6024
    .local p0, "array":[Ljava/lang/Object;, "[TT;"
    invoke-static {p0, p1}, Lorg/apache/commons/lang3/ArrayUtils;->indexOf([Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v0

    .line 6025
    .local v0, "index":I
    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    invoke-static {p0}, Lorg/apache/commons/lang3/ArrayUtils;->clone([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v1

    goto :goto_0

    :cond_0
    invoke-static {p0, v0}, Lorg/apache/commons/lang3/ArrayUtils;->remove([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v1

    :goto_0
    return-object v1
.end method

.method public static removeElement([SS)[S
    .locals 2
    .param p0, "array"    # [S
    .param p1, "element"    # S

    .line 5993
    invoke-static {p0, p1}, Lorg/apache/commons/lang3/ArrayUtils;->indexOf([SS)I

    move-result v0

    .line 5994
    .local v0, "index":I
    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    invoke-static {p0}, Lorg/apache/commons/lang3/ArrayUtils;->clone([S)[S

    move-result-object v1

    goto :goto_0

    :cond_0
    invoke-static {p0, v0}, Lorg/apache/commons/lang3/ArrayUtils;->remove([SI)[S

    move-result-object v1

    :goto_0
    return-object v1
.end method

.method public static removeElement([ZZ)[Z
    .locals 2
    .param p0, "array"    # [Z
    .param p1, "element"    # Z

    .line 5783
    invoke-static {p0, p1}, Lorg/apache/commons/lang3/ArrayUtils;->indexOf([ZZ)I

    move-result v0

    .line 5784
    .local v0, "index":I
    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    invoke-static {p0}, Lorg/apache/commons/lang3/ArrayUtils;->clone([Z)[Z

    move-result-object v1

    goto :goto_0

    :cond_0
    invoke-static {p0, v0}, Lorg/apache/commons/lang3/ArrayUtils;->remove([ZI)[Z

    move-result-object v1

    :goto_0
    return-object v1
.end method

.method public static varargs removeElements([B[B)[B
    .locals 8
    .param p0, "array"    # [B
    .param p1, "values"    # [B

    .line 6111
    invoke-static {p0}, Lorg/apache/commons/lang3/ArrayUtils;->isEmpty([B)Z

    move-result v0

    if-nez v0, :cond_6

    invoke-static {p1}, Lorg/apache/commons/lang3/ArrayUtils;->isEmpty([B)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_3

    .line 6114
    :cond_0
    new-instance v0, Ljava/util/HashMap;

    array-length v1, p1

    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(I)V

    .line 6115
    .local v0, "occurrences":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/Byte;Lorg/apache/commons/lang3/mutable/MutableInt;>;"
    array-length v1, p1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_2

    aget-byte v3, p1, v2

    .line 6116
    .local v3, "v":B
    invoke-static {v3}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v4

    .line 6117
    .local v4, "boxed":Ljava/lang/Byte;
    invoke-interface {v0, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lorg/apache/commons/lang3/mutable/MutableInt;

    .line 6118
    .local v5, "count":Lorg/apache/commons/lang3/mutable/MutableInt;
    if-nez v5, :cond_1

    .line 6119
    new-instance v6, Lorg/apache/commons/lang3/mutable/MutableInt;

    const/4 v7, 0x1

    invoke-direct {v6, v7}, Lorg/apache/commons/lang3/mutable/MutableInt;-><init>(I)V

    invoke-interface {v0, v4, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 6121
    :cond_1
    invoke-virtual {v5}, Lorg/apache/commons/lang3/mutable/MutableInt;->increment()V

    .line 6115
    .end local v3    # "v":B
    .end local v4    # "boxed":Ljava/lang/Byte;
    .end local v5    # "count":Lorg/apache/commons/lang3/mutable/MutableInt;
    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 6124
    :cond_2
    new-instance v1, Ljava/util/BitSet;

    invoke-direct {v1}, Ljava/util/BitSet;-><init>()V

    .line 6125
    .local v1, "toRemove":Ljava/util/BitSet;
    const/4 v2, 0x0

    .local v2, "i":I
    :goto_2
    array-length v3, p0

    if-ge v2, v3, :cond_5

    .line 6126
    aget-byte v3, p0, v2

    .line 6127
    .local v3, "key":B
    invoke-static {v3}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v4

    invoke-interface {v0, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lorg/apache/commons/lang3/mutable/MutableInt;

    .line 6128
    .local v4, "count":Lorg/apache/commons/lang3/mutable/MutableInt;
    if-eqz v4, :cond_4

    .line 6129
    invoke-virtual {v4}, Lorg/apache/commons/lang3/mutable/MutableInt;->decrementAndGet()I

    move-result v5

    if-nez v5, :cond_3

    .line 6130
    invoke-static {v3}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v5

    invoke-interface {v0, v5}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6132
    :cond_3
    invoke-virtual {v1, v2}, Ljava/util/BitSet;->set(I)V

    .line 6125
    .end local v3    # "key":B
    .end local v4    # "count":Lorg/apache/commons/lang3/mutable/MutableInt;
    :cond_4
    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    .line 6135
    .end local v2    # "i":I
    :cond_5
    invoke-static {p0, v1}, Lorg/apache/commons/lang3/ArrayUtils;->removeAll(Ljava/lang/Object;Ljava/util/BitSet;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [B

    return-object v2

    .line 6112
    .end local v0    # "occurrences":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/Byte;Lorg/apache/commons/lang3/mutable/MutableInt;>;"
    .end local v1    # "toRemove":Ljava/util/BitSet;
    :cond_6
    :goto_3
    invoke-static {p0}, Lorg/apache/commons/lang3/ArrayUtils;->clone([B)[B

    move-result-object v0

    return-object v0
.end method

.method public static varargs removeElements([C[C)[C
    .locals 8
    .param p0, "array"    # [C
    .param p1, "values"    # [C

    .line 6166
    invoke-static {p0}, Lorg/apache/commons/lang3/ArrayUtils;->isEmpty([C)Z

    move-result v0

    if-nez v0, :cond_6

    invoke-static {p1}, Lorg/apache/commons/lang3/ArrayUtils;->isEmpty([C)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_3

    .line 6169
    :cond_0
    new-instance v0, Ljava/util/HashMap;

    array-length v1, p1

    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(I)V

    .line 6170
    .local v0, "occurrences":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/Character;Lorg/apache/commons/lang3/mutable/MutableInt;>;"
    array-length v1, p1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_2

    aget-char v3, p1, v2

    .line 6171
    .local v3, "v":C
    invoke-static {v3}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v4

    .line 6172
    .local v4, "boxed":Ljava/lang/Character;
    invoke-virtual {v0, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lorg/apache/commons/lang3/mutable/MutableInt;

    .line 6173
    .local v5, "count":Lorg/apache/commons/lang3/mutable/MutableInt;
    if-nez v5, :cond_1

    .line 6174
    new-instance v6, Lorg/apache/commons/lang3/mutable/MutableInt;

    const/4 v7, 0x1

    invoke-direct {v6, v7}, Lorg/apache/commons/lang3/mutable/MutableInt;-><init>(I)V

    invoke-virtual {v0, v4, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 6176
    :cond_1
    invoke-virtual {v5}, Lorg/apache/commons/lang3/mutable/MutableInt;->increment()V

    .line 6170
    .end local v3    # "v":C
    .end local v4    # "boxed":Ljava/lang/Character;
    .end local v5    # "count":Lorg/apache/commons/lang3/mutable/MutableInt;
    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 6179
    :cond_2
    new-instance v1, Ljava/util/BitSet;

    invoke-direct {v1}, Ljava/util/BitSet;-><init>()V

    .line 6180
    .local v1, "toRemove":Ljava/util/BitSet;
    const/4 v2, 0x0

    .local v2, "i":I
    :goto_2
    array-length v3, p0

    if-ge v2, v3, :cond_5

    .line 6181
    aget-char v3, p0, v2

    .line 6182
    .local v3, "key":C
    invoke-static {v3}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lorg/apache/commons/lang3/mutable/MutableInt;

    .line 6183
    .local v4, "count":Lorg/apache/commons/lang3/mutable/MutableInt;
    if-eqz v4, :cond_4

    .line 6184
    invoke-virtual {v4}, Lorg/apache/commons/lang3/mutable/MutableInt;->decrementAndGet()I

    move-result v5

    if-nez v5, :cond_3

    .line 6185
    invoke-static {v3}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v5

    invoke-virtual {v0, v5}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6187
    :cond_3
    invoke-virtual {v1, v2}, Ljava/util/BitSet;->set(I)V

    .line 6180
    .end local v3    # "key":C
    .end local v4    # "count":Lorg/apache/commons/lang3/mutable/MutableInt;
    :cond_4
    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    .line 6190
    .end local v2    # "i":I
    :cond_5
    invoke-static {p0, v1}, Lorg/apache/commons/lang3/ArrayUtils;->removeAll(Ljava/lang/Object;Ljava/util/BitSet;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [C

    return-object v2

    .line 6167
    .end local v0    # "occurrences":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/Character;Lorg/apache/commons/lang3/mutable/MutableInt;>;"
    .end local v1    # "toRemove":Ljava/util/BitSet;
    :cond_6
    :goto_3
    invoke-static {p0}, Lorg/apache/commons/lang3/ArrayUtils;->clone([C)[C

    move-result-object v0

    return-object v0
.end method

.method public static varargs removeElements([D[D)[D
    .locals 9
    .param p0, "array"    # [D
    .param p1, "values"    # [D

    .line 6221
    invoke-static {p0}, Lorg/apache/commons/lang3/ArrayUtils;->isEmpty([D)Z

    move-result v0

    if-nez v0, :cond_6

    invoke-static {p1}, Lorg/apache/commons/lang3/ArrayUtils;->isEmpty([D)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_3

    .line 6224
    :cond_0
    new-instance v0, Ljava/util/HashMap;

    array-length v1, p1

    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(I)V

    .line 6225
    .local v0, "occurrences":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/Double;Lorg/apache/commons/lang3/mutable/MutableInt;>;"
    array-length v1, p1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_2

    aget-wide v3, p1, v2

    .line 6226
    .local v3, "v":D
    invoke-static {v3, v4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v5

    .line 6227
    .local v5, "boxed":Ljava/lang/Double;
    invoke-virtual {v0, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lorg/apache/commons/lang3/mutable/MutableInt;

    .line 6228
    .local v6, "count":Lorg/apache/commons/lang3/mutable/MutableInt;
    if-nez v6, :cond_1

    .line 6229
    new-instance v7, Lorg/apache/commons/lang3/mutable/MutableInt;

    const/4 v8, 0x1

    invoke-direct {v7, v8}, Lorg/apache/commons/lang3/mutable/MutableInt;-><init>(I)V

    invoke-virtual {v0, v5, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 6231
    :cond_1
    invoke-virtual {v6}, Lorg/apache/commons/lang3/mutable/MutableInt;->increment()V

    .line 6225
    .end local v3    # "v":D
    .end local v5    # "boxed":Ljava/lang/Double;
    .end local v6    # "count":Lorg/apache/commons/lang3/mutable/MutableInt;
    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 6234
    :cond_2
    new-instance v1, Ljava/util/BitSet;

    invoke-direct {v1}, Ljava/util/BitSet;-><init>()V

    .line 6235
    .local v1, "toRemove":Ljava/util/BitSet;
    const/4 v2, 0x0

    .local v2, "i":I
    :goto_2
    array-length v3, p0

    if-ge v2, v3, :cond_5

    .line 6236
    aget-wide v3, p0, v2

    .line 6237
    .local v3, "key":D
    invoke-static {v3, v4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v5

    invoke-virtual {v0, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lorg/apache/commons/lang3/mutable/MutableInt;

    .line 6238
    .local v5, "count":Lorg/apache/commons/lang3/mutable/MutableInt;
    if-eqz v5, :cond_4

    .line 6239
    invoke-virtual {v5}, Lorg/apache/commons/lang3/mutable/MutableInt;->decrementAndGet()I

    move-result v6

    if-nez v6, :cond_3

    .line 6240
    invoke-static {v3, v4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v6

    invoke-virtual {v0, v6}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6242
    :cond_3
    invoke-virtual {v1, v2}, Ljava/util/BitSet;->set(I)V

    .line 6235
    .end local v3    # "key":D
    .end local v5    # "count":Lorg/apache/commons/lang3/mutable/MutableInt;
    :cond_4
    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    .line 6245
    .end local v2    # "i":I
    :cond_5
    invoke-static {p0, v1}, Lorg/apache/commons/lang3/ArrayUtils;->removeAll(Ljava/lang/Object;Ljava/util/BitSet;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [D

    return-object v2

    .line 6222
    .end local v0    # "occurrences":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/Double;Lorg/apache/commons/lang3/mutable/MutableInt;>;"
    .end local v1    # "toRemove":Ljava/util/BitSet;
    :cond_6
    :goto_3
    invoke-static {p0}, Lorg/apache/commons/lang3/ArrayUtils;->clone([D)[D

    move-result-object v0

    return-object v0
.end method

.method public static varargs removeElements([F[F)[F
    .locals 8
    .param p0, "array"    # [F
    .param p1, "values"    # [F

    .line 6276
    invoke-static {p0}, Lorg/apache/commons/lang3/ArrayUtils;->isEmpty([F)Z

    move-result v0

    if-nez v0, :cond_6

    invoke-static {p1}, Lorg/apache/commons/lang3/ArrayUtils;->isEmpty([F)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_3

    .line 6279
    :cond_0
    new-instance v0, Ljava/util/HashMap;

    array-length v1, p1

    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(I)V

    .line 6280
    .local v0, "occurrences":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/Float;Lorg/apache/commons/lang3/mutable/MutableInt;>;"
    array-length v1, p1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_2

    aget v3, p1, v2

    .line 6281
    .local v3, "v":F
    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    .line 6282
    .local v4, "boxed":Ljava/lang/Float;
    invoke-virtual {v0, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lorg/apache/commons/lang3/mutable/MutableInt;

    .line 6283
    .local v5, "count":Lorg/apache/commons/lang3/mutable/MutableInt;
    if-nez v5, :cond_1

    .line 6284
    new-instance v6, Lorg/apache/commons/lang3/mutable/MutableInt;

    const/4 v7, 0x1

    invoke-direct {v6, v7}, Lorg/apache/commons/lang3/mutable/MutableInt;-><init>(I)V

    invoke-virtual {v0, v4, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 6286
    :cond_1
    invoke-virtual {v5}, Lorg/apache/commons/lang3/mutable/MutableInt;->increment()V

    .line 6280
    .end local v3    # "v":F
    .end local v4    # "boxed":Ljava/lang/Float;
    .end local v5    # "count":Lorg/apache/commons/lang3/mutable/MutableInt;
    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 6289
    :cond_2
    new-instance v1, Ljava/util/BitSet;

    invoke-direct {v1}, Ljava/util/BitSet;-><init>()V

    .line 6290
    .local v1, "toRemove":Ljava/util/BitSet;
    const/4 v2, 0x0

    .local v2, "i":I
    :goto_2
    array-length v3, p0

    if-ge v2, v3, :cond_5

    .line 6291
    aget v3, p0, v2

    .line 6292
    .local v3, "key":F
    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lorg/apache/commons/lang3/mutable/MutableInt;

    .line 6293
    .local v4, "count":Lorg/apache/commons/lang3/mutable/MutableInt;
    if-eqz v4, :cond_4

    .line 6294
    invoke-virtual {v4}, Lorg/apache/commons/lang3/mutable/MutableInt;->decrementAndGet()I

    move-result v5

    if-nez v5, :cond_3

    .line 6295
    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v5

    invoke-virtual {v0, v5}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6297
    :cond_3
    invoke-virtual {v1, v2}, Ljava/util/BitSet;->set(I)V

    .line 6290
    .end local v3    # "key":F
    .end local v4    # "count":Lorg/apache/commons/lang3/mutable/MutableInt;
    :cond_4
    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    .line 6300
    .end local v2    # "i":I
    :cond_5
    invoke-static {p0, v1}, Lorg/apache/commons/lang3/ArrayUtils;->removeAll(Ljava/lang/Object;Ljava/util/BitSet;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [F

    return-object v2

    .line 6277
    .end local v0    # "occurrences":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/Float;Lorg/apache/commons/lang3/mutable/MutableInt;>;"
    .end local v1    # "toRemove":Ljava/util/BitSet;
    :cond_6
    :goto_3
    invoke-static {p0}, Lorg/apache/commons/lang3/ArrayUtils;->clone([F)[F

    move-result-object v0

    return-object v0
.end method

.method public static varargs removeElements([I[I)[I
    .locals 8
    .param p0, "array"    # [I
    .param p1, "values"    # [I

    .line 6331
    invoke-static {p0}, Lorg/apache/commons/lang3/ArrayUtils;->isEmpty([I)Z

    move-result v0

    if-nez v0, :cond_6

    invoke-static {p1}, Lorg/apache/commons/lang3/ArrayUtils;->isEmpty([I)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_3

    .line 6334
    :cond_0
    new-instance v0, Ljava/util/HashMap;

    array-length v1, p1

    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(I)V

    .line 6335
    .local v0, "occurrences":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/Integer;Lorg/apache/commons/lang3/mutable/MutableInt;>;"
    array-length v1, p1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_2

    aget v3, p1, v2

    .line 6336
    .local v3, "v":I
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    .line 6337
    .local v4, "boxed":Ljava/lang/Integer;
    invoke-virtual {v0, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lorg/apache/commons/lang3/mutable/MutableInt;

    .line 6338
    .local v5, "count":Lorg/apache/commons/lang3/mutable/MutableInt;
    if-nez v5, :cond_1

    .line 6339
    new-instance v6, Lorg/apache/commons/lang3/mutable/MutableInt;

    const/4 v7, 0x1

    invoke-direct {v6, v7}, Lorg/apache/commons/lang3/mutable/MutableInt;-><init>(I)V

    invoke-virtual {v0, v4, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 6341
    :cond_1
    invoke-virtual {v5}, Lorg/apache/commons/lang3/mutable/MutableInt;->increment()V

    .line 6335
    .end local v3    # "v":I
    .end local v4    # "boxed":Ljava/lang/Integer;
    .end local v5    # "count":Lorg/apache/commons/lang3/mutable/MutableInt;
    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 6344
    :cond_2
    new-instance v1, Ljava/util/BitSet;

    invoke-direct {v1}, Ljava/util/BitSet;-><init>()V

    .line 6345
    .local v1, "toRemove":Ljava/util/BitSet;
    const/4 v2, 0x0

    .local v2, "i":I
    :goto_2
    array-length v3, p0

    if-ge v2, v3, :cond_5

    .line 6346
    aget v3, p0, v2

    .line 6347
    .local v3, "key":I
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lorg/apache/commons/lang3/mutable/MutableInt;

    .line 6348
    .local v4, "count":Lorg/apache/commons/lang3/mutable/MutableInt;
    if-eqz v4, :cond_4

    .line 6349
    invoke-virtual {v4}, Lorg/apache/commons/lang3/mutable/MutableInt;->decrementAndGet()I

    move-result v5

    if-nez v5, :cond_3

    .line 6350
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v0, v5}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6352
    :cond_3
    invoke-virtual {v1, v2}, Ljava/util/BitSet;->set(I)V

    .line 6345
    .end local v3    # "key":I
    .end local v4    # "count":Lorg/apache/commons/lang3/mutable/MutableInt;
    :cond_4
    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    .line 6355
    .end local v2    # "i":I
    :cond_5
    invoke-static {p0, v1}, Lorg/apache/commons/lang3/ArrayUtils;->removeAll(Ljava/lang/Object;Ljava/util/BitSet;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [I

    return-object v2

    .line 6332
    .end local v0    # "occurrences":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/Integer;Lorg/apache/commons/lang3/mutable/MutableInt;>;"
    .end local v1    # "toRemove":Ljava/util/BitSet;
    :cond_6
    :goto_3
    invoke-static {p0}, Lorg/apache/commons/lang3/ArrayUtils;->clone([I)[I

    move-result-object v0

    return-object v0
.end method

.method public static varargs removeElements([J[J)[J
    .locals 9
    .param p0, "array"    # [J
    .param p1, "values"    # [J

    .line 6386
    invoke-static {p0}, Lorg/apache/commons/lang3/ArrayUtils;->isEmpty([J)Z

    move-result v0

    if-nez v0, :cond_6

    invoke-static {p1}, Lorg/apache/commons/lang3/ArrayUtils;->isEmpty([J)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_3

    .line 6389
    :cond_0
    new-instance v0, Ljava/util/HashMap;

    array-length v1, p1

    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(I)V

    .line 6390
    .local v0, "occurrences":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/Long;Lorg/apache/commons/lang3/mutable/MutableInt;>;"
    array-length v1, p1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_2

    aget-wide v3, p1, v2

    .line 6391
    .local v3, "v":J
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    .line 6392
    .local v5, "boxed":Ljava/lang/Long;
    invoke-virtual {v0, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lorg/apache/commons/lang3/mutable/MutableInt;

    .line 6393
    .local v6, "count":Lorg/apache/commons/lang3/mutable/MutableInt;
    if-nez v6, :cond_1

    .line 6394
    new-instance v7, Lorg/apache/commons/lang3/mutable/MutableInt;

    const/4 v8, 0x1

    invoke-direct {v7, v8}, Lorg/apache/commons/lang3/mutable/MutableInt;-><init>(I)V

    invoke-virtual {v0, v5, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 6396
    :cond_1
    invoke-virtual {v6}, Lorg/apache/commons/lang3/mutable/MutableInt;->increment()V

    .line 6390
    .end local v3    # "v":J
    .end local v5    # "boxed":Ljava/lang/Long;
    .end local v6    # "count":Lorg/apache/commons/lang3/mutable/MutableInt;
    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 6399
    :cond_2
    new-instance v1, Ljava/util/BitSet;

    invoke-direct {v1}, Ljava/util/BitSet;-><init>()V

    .line 6400
    .local v1, "toRemove":Ljava/util/BitSet;
    const/4 v2, 0x0

    .local v2, "i":I
    :goto_2
    array-length v3, p0

    if-ge v2, v3, :cond_5

    .line 6401
    aget-wide v3, p0, v2

    .line 6402
    .local v3, "key":J
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    invoke-virtual {v0, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lorg/apache/commons/lang3/mutable/MutableInt;

    .line 6403
    .local v5, "count":Lorg/apache/commons/lang3/mutable/MutableInt;
    if-eqz v5, :cond_4

    .line 6404
    invoke-virtual {v5}, Lorg/apache/commons/lang3/mutable/MutableInt;->decrementAndGet()I

    move-result v6

    if-nez v6, :cond_3

    .line 6405
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    invoke-virtual {v0, v6}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6407
    :cond_3
    invoke-virtual {v1, v2}, Ljava/util/BitSet;->set(I)V

    .line 6400
    .end local v3    # "key":J
    .end local v5    # "count":Lorg/apache/commons/lang3/mutable/MutableInt;
    :cond_4
    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    .line 6410
    .end local v2    # "i":I
    :cond_5
    invoke-static {p0, v1}, Lorg/apache/commons/lang3/ArrayUtils;->removeAll(Ljava/lang/Object;Ljava/util/BitSet;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [J

    return-object v2

    .line 6387
    .end local v0    # "occurrences":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/Long;Lorg/apache/commons/lang3/mutable/MutableInt;>;"
    .end local v1    # "toRemove":Ljava/util/BitSet;
    :cond_6
    :goto_3
    invoke-static {p0}, Lorg/apache/commons/lang3/ArrayUtils;->clone([J)[J

    move-result-object v0

    return-object v0
.end method

.method public static varargs removeElements([Ljava/lang/Object;[Ljava/lang/Object;)[Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">([TT;[TT;)[TT;"
        }
    .end annotation

    .annotation runtime Ljava/lang/SafeVarargs;
    .end annotation

    .line 6498
    .local p0, "array":[Ljava/lang/Object;, "[TT;"
    .local p1, "values":[Ljava/lang/Object;, "[TT;"
    invoke-static {p0}, Lorg/apache/commons/lang3/ArrayUtils;->isEmpty([Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6

    invoke-static {p1}, Lorg/apache/commons/lang3/ArrayUtils;->isEmpty([Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_3

    .line 6501
    :cond_0
    new-instance v0, Ljava/util/HashMap;

    array-length v1, p1

    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(I)V

    .line 6502
    .local v0, "occurrences":Ljava/util/HashMap;, "Ljava/util/HashMap<TT;Lorg/apache/commons/lang3/mutable/MutableInt;>;"
    array-length v1, p1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_2

    aget-object v3, p1, v2

    .line 6503
    .local v3, "v":Ljava/lang/Object;, "TT;"
    invoke-virtual {v0, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lorg/apache/commons/lang3/mutable/MutableInt;

    .line 6504
    .local v4, "count":Lorg/apache/commons/lang3/mutable/MutableInt;
    if-nez v4, :cond_1

    .line 6505
    new-instance v5, Lorg/apache/commons/lang3/mutable/MutableInt;

    const/4 v6, 0x1

    invoke-direct {v5, v6}, Lorg/apache/commons/lang3/mutable/MutableInt;-><init>(I)V

    invoke-virtual {v0, v3, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 6507
    :cond_1
    invoke-virtual {v4}, Lorg/apache/commons/lang3/mutable/MutableInt;->increment()V

    .line 6502
    .end local v3    # "v":Ljava/lang/Object;, "TT;"
    .end local v4    # "count":Lorg/apache/commons/lang3/mutable/MutableInt;
    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 6510
    :cond_2
    new-instance v1, Ljava/util/BitSet;

    invoke-direct {v1}, Ljava/util/BitSet;-><init>()V

    .line 6511
    .local v1, "toRemove":Ljava/util/BitSet;
    const/4 v2, 0x0

    .local v2, "i":I
    :goto_2
    array-length v3, p0

    if-ge v2, v3, :cond_5

    .line 6512
    aget-object v3, p0, v2

    .line 6513
    .local v3, "key":Ljava/lang/Object;, "TT;"
    invoke-virtual {v0, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lorg/apache/commons/lang3/mutable/MutableInt;

    .line 6514
    .restart local v4    # "count":Lorg/apache/commons/lang3/mutable/MutableInt;
    if-eqz v4, :cond_4

    .line 6515
    invoke-virtual {v4}, Lorg/apache/commons/lang3/mutable/MutableInt;->decrementAndGet()I

    move-result v5

    if-nez v5, :cond_3

    .line 6516
    invoke-virtual {v0, v3}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6518
    :cond_3
    invoke-virtual {v1, v2}, Ljava/util/BitSet;->set(I)V

    .line 6511
    .end local v3    # "key":Ljava/lang/Object;, "TT;"
    .end local v4    # "count":Lorg/apache/commons/lang3/mutable/MutableInt;
    :cond_4
    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    .line 6522
    .end local v2    # "i":I
    :cond_5
    invoke-static {p0, v1}, Lorg/apache/commons/lang3/ArrayUtils;->removeAll(Ljava/lang/Object;Ljava/util/BitSet;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [Ljava/lang/Object;

    .line 6523
    .local v2, "result":[Ljava/lang/Object;, "[TT;"
    return-object v2

    .line 6499
    .end local v0    # "occurrences":Ljava/util/HashMap;, "Ljava/util/HashMap<TT;Lorg/apache/commons/lang3/mutable/MutableInt;>;"
    .end local v1    # "toRemove":Ljava/util/BitSet;
    .end local v2    # "result":[Ljava/lang/Object;, "[TT;"
    :cond_6
    :goto_3
    invoke-static {p0}, Lorg/apache/commons/lang3/ArrayUtils;->clone([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public static varargs removeElements([S[S)[S
    .locals 8
    .param p0, "array"    # [S
    .param p1, "values"    # [S

    .line 6441
    invoke-static {p0}, Lorg/apache/commons/lang3/ArrayUtils;->isEmpty([S)Z

    move-result v0

    if-nez v0, :cond_6

    invoke-static {p1}, Lorg/apache/commons/lang3/ArrayUtils;->isEmpty([S)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_3

    .line 6444
    :cond_0
    new-instance v0, Ljava/util/HashMap;

    array-length v1, p1

    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(I)V

    .line 6445
    .local v0, "occurrences":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/Short;Lorg/apache/commons/lang3/mutable/MutableInt;>;"
    array-length v1, p1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_2

    aget-short v3, p1, v2

    .line 6446
    .local v3, "v":S
    invoke-static {v3}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v4

    .line 6447
    .local v4, "boxed":Ljava/lang/Short;
    invoke-virtual {v0, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lorg/apache/commons/lang3/mutable/MutableInt;

    .line 6448
    .local v5, "count":Lorg/apache/commons/lang3/mutable/MutableInt;
    if-nez v5, :cond_1

    .line 6449
    new-instance v6, Lorg/apache/commons/lang3/mutable/MutableInt;

    const/4 v7, 0x1

    invoke-direct {v6, v7}, Lorg/apache/commons/lang3/mutable/MutableInt;-><init>(I)V

    invoke-virtual {v0, v4, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 6451
    :cond_1
    invoke-virtual {v5}, Lorg/apache/commons/lang3/mutable/MutableInt;->increment()V

    .line 6445
    .end local v3    # "v":S
    .end local v4    # "boxed":Ljava/lang/Short;
    .end local v5    # "count":Lorg/apache/commons/lang3/mutable/MutableInt;
    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 6454
    :cond_2
    new-instance v1, Ljava/util/BitSet;

    invoke-direct {v1}, Ljava/util/BitSet;-><init>()V

    .line 6455
    .local v1, "toRemove":Ljava/util/BitSet;
    const/4 v2, 0x0

    .local v2, "i":I
    :goto_2
    array-length v3, p0

    if-ge v2, v3, :cond_5

    .line 6456
    aget-short v3, p0, v2

    .line 6457
    .local v3, "key":S
    invoke-static {v3}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lorg/apache/commons/lang3/mutable/MutableInt;

    .line 6458
    .local v4, "count":Lorg/apache/commons/lang3/mutable/MutableInt;
    if-eqz v4, :cond_4

    .line 6459
    invoke-virtual {v4}, Lorg/apache/commons/lang3/mutable/MutableInt;->decrementAndGet()I

    move-result v5

    if-nez v5, :cond_3

    .line 6460
    invoke-static {v3}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v5

    invoke-virtual {v0, v5}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6462
    :cond_3
    invoke-virtual {v1, v2}, Ljava/util/BitSet;->set(I)V

    .line 6455
    .end local v3    # "key":S
    .end local v4    # "count":Lorg/apache/commons/lang3/mutable/MutableInt;
    :cond_4
    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    .line 6465
    .end local v2    # "i":I
    :cond_5
    invoke-static {p0, v1}, Lorg/apache/commons/lang3/ArrayUtils;->removeAll(Ljava/lang/Object;Ljava/util/BitSet;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [S

    return-object v2

    .line 6442
    .end local v0    # "occurrences":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/Short;Lorg/apache/commons/lang3/mutable/MutableInt;>;"
    .end local v1    # "toRemove":Ljava/util/BitSet;
    :cond_6
    :goto_3
    invoke-static {p0}, Lorg/apache/commons/lang3/ArrayUtils;->clone([S)[S

    move-result-object v0

    return-object v0
.end method

.method public static varargs removeElements([Z[Z)[Z
    .locals 8
    .param p0, "array"    # [Z
    .param p1, "values"    # [Z

    .line 6056
    invoke-static {p0}, Lorg/apache/commons/lang3/ArrayUtils;->isEmpty([Z)Z

    move-result v0

    if-nez v0, :cond_6

    invoke-static {p1}, Lorg/apache/commons/lang3/ArrayUtils;->isEmpty([Z)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_3

    .line 6059
    :cond_0
    new-instance v0, Ljava/util/HashMap;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(I)V

    .line 6060
    .local v0, "occurrences":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/Boolean;Lorg/apache/commons/lang3/mutable/MutableInt;>;"
    array-length v1, p1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_2

    aget-boolean v3, p1, v2

    .line 6061
    .local v3, "v":Z
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    .line 6062
    .local v4, "boxed":Ljava/lang/Boolean;
    invoke-virtual {v0, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lorg/apache/commons/lang3/mutable/MutableInt;

    .line 6063
    .local v5, "count":Lorg/apache/commons/lang3/mutable/MutableInt;
    if-nez v5, :cond_1

    .line 6064
    new-instance v6, Lorg/apache/commons/lang3/mutable/MutableInt;

    const/4 v7, 0x1

    invoke-direct {v6, v7}, Lorg/apache/commons/lang3/mutable/MutableInt;-><init>(I)V

    invoke-virtual {v0, v4, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 6066
    :cond_1
    invoke-virtual {v5}, Lorg/apache/commons/lang3/mutable/MutableInt;->increment()V

    .line 6060
    .end local v3    # "v":Z
    .end local v4    # "boxed":Ljava/lang/Boolean;
    .end local v5    # "count":Lorg/apache/commons/lang3/mutable/MutableInt;
    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 6069
    :cond_2
    new-instance v1, Ljava/util/BitSet;

    invoke-direct {v1}, Ljava/util/BitSet;-><init>()V

    .line 6070
    .local v1, "toRemove":Ljava/util/BitSet;
    const/4 v2, 0x0

    .local v2, "i":I
    :goto_2
    array-length v3, p0

    if-ge v2, v3, :cond_5

    .line 6071
    aget-boolean v3, p0, v2

    .line 6072
    .local v3, "key":Z
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lorg/apache/commons/lang3/mutable/MutableInt;

    .line 6073
    .local v4, "count":Lorg/apache/commons/lang3/mutable/MutableInt;
    if-eqz v4, :cond_4

    .line 6074
    invoke-virtual {v4}, Lorg/apache/commons/lang3/mutable/MutableInt;->decrementAndGet()I

    move-result v5

    if-nez v5, :cond_3

    .line 6075
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v5

    invoke-virtual {v0, v5}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6077
    :cond_3
    invoke-virtual {v1, v2}, Ljava/util/BitSet;->set(I)V

    .line 6070
    .end local v3    # "key":Z
    .end local v4    # "count":Lorg/apache/commons/lang3/mutable/MutableInt;
    :cond_4
    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    .line 6080
    .end local v2    # "i":I
    :cond_5
    invoke-static {p0, v1}, Lorg/apache/commons/lang3/ArrayUtils;->removeAll(Ljava/lang/Object;Ljava/util/BitSet;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [Z

    return-object v2

    .line 6057
    .end local v0    # "occurrences":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/Boolean;Lorg/apache/commons/lang3/mutable/MutableInt;>;"
    .end local v1    # "toRemove":Ljava/util/BitSet;
    :cond_6
    :goto_3
    invoke-static {p0}, Lorg/apache/commons/lang3/ArrayUtils;->clone([Z)[Z

    move-result-object v0

    return-object v0
.end method

.method public static reverse([B)V
    .locals 2
    .param p0, "array"    # [B

    .line 6582
    if-eqz p0, :cond_0

    .line 6583
    const/4 v0, 0x0

    array-length v1, p0

    invoke-static {p0, v0, v1}, Lorg/apache/commons/lang3/ArrayUtils;->reverse([BII)V

    .line 6585
    :cond_0
    return-void
.end method

.method public static reverse([BII)V
    .locals 4
    .param p0, "array"    # [B
    .param p1, "startIndexInclusive"    # I
    .param p2, "endIndexExclusive"    # I

    .line 6604
    if-nez p0, :cond_0

    .line 6605
    return-void

    .line 6607
    :cond_0
    const/4 v0, 0x0

    invoke-static {p1, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    .line 6608
    .local v0, "i":I
    array-length v1, p0

    invoke-static {v1, p2}, Ljava/lang/Math;->min(II)I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    .line 6610
    .local v1, "j":I
    :goto_0
    if-le v1, v0, :cond_1

    .line 6611
    aget-byte v2, p0, v1

    .line 6612
    .local v2, "tmp":B
    aget-byte v3, p0, v0

    aput-byte v3, p0, v1

    .line 6613
    aput-byte v2, p0, v0

    .line 6614
    add-int/lit8 v1, v1, -0x1

    .line 6615
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 6617
    .end local v2    # "tmp":B
    :cond_1
    return-void
.end method

.method public static reverse([C)V
    .locals 2
    .param p0, "array"    # [C

    .line 6628
    if-eqz p0, :cond_0

    .line 6629
    const/4 v0, 0x0

    array-length v1, p0

    invoke-static {p0, v0, v1}, Lorg/apache/commons/lang3/ArrayUtils;->reverse([CII)V

    .line 6631
    :cond_0
    return-void
.end method

.method public static reverse([CII)V
    .locals 4
    .param p0, "array"    # [C
    .param p1, "startIndexInclusive"    # I
    .param p2, "endIndexExclusive"    # I

    .line 6650
    if-nez p0, :cond_0

    .line 6651
    return-void

    .line 6653
    :cond_0
    const/4 v0, 0x0

    invoke-static {p1, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    .line 6654
    .local v0, "i":I
    array-length v1, p0

    invoke-static {v1, p2}, Ljava/lang/Math;->min(II)I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    .line 6656
    .local v1, "j":I
    :goto_0
    if-le v1, v0, :cond_1

    .line 6657
    aget-char v2, p0, v1

    .line 6658
    .local v2, "tmp":C
    aget-char v3, p0, v0

    aput-char v3, p0, v1

    .line 6659
    aput-char v2, p0, v0

    .line 6660
    add-int/lit8 v1, v1, -0x1

    .line 6661
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 6663
    .end local v2    # "tmp":C
    :cond_1
    return-void
.end method

.method public static reverse([D)V
    .locals 2
    .param p0, "array"    # [D

    .line 6674
    if-eqz p0, :cond_0

    .line 6675
    const/4 v0, 0x0

    array-length v1, p0

    invoke-static {p0, v0, v1}, Lorg/apache/commons/lang3/ArrayUtils;->reverse([DII)V

    .line 6677
    :cond_0
    return-void
.end method

.method public static reverse([DII)V
    .locals 6
    .param p0, "array"    # [D
    .param p1, "startIndexInclusive"    # I
    .param p2, "endIndexExclusive"    # I

    .line 6696
    if-nez p0, :cond_0

    .line 6697
    return-void

    .line 6699
    :cond_0
    const/4 v0, 0x0

    invoke-static {p1, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    .line 6700
    .local v0, "i":I
    array-length v1, p0

    invoke-static {v1, p2}, Ljava/lang/Math;->min(II)I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    .line 6702
    .local v1, "j":I
    :goto_0
    if-le v1, v0, :cond_1

    .line 6703
    aget-wide v2, p0, v1

    .line 6704
    .local v2, "tmp":D
    aget-wide v4, p0, v0

    aput-wide v4, p0, v1

    .line 6705
    aput-wide v2, p0, v0

    .line 6706
    add-int/lit8 v1, v1, -0x1

    .line 6707
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 6709
    .end local v2    # "tmp":D
    :cond_1
    return-void
.end method

.method public static reverse([F)V
    .locals 2
    .param p0, "array"    # [F

    .line 6720
    if-eqz p0, :cond_0

    .line 6721
    const/4 v0, 0x0

    array-length v1, p0

    invoke-static {p0, v0, v1}, Lorg/apache/commons/lang3/ArrayUtils;->reverse([FII)V

    .line 6723
    :cond_0
    return-void
.end method

.method public static reverse([FII)V
    .locals 4
    .param p0, "array"    # [F
    .param p1, "startIndexInclusive"    # I
    .param p2, "endIndexExclusive"    # I

    .line 6742
    if-nez p0, :cond_0

    .line 6743
    return-void

    .line 6745
    :cond_0
    const/4 v0, 0x0

    invoke-static {p1, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    .line 6746
    .local v0, "i":I
    array-length v1, p0

    invoke-static {v1, p2}, Ljava/lang/Math;->min(II)I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    .line 6748
    .local v1, "j":I
    :goto_0
    if-le v1, v0, :cond_1

    .line 6749
    aget v2, p0, v1

    .line 6750
    .local v2, "tmp":F
    aget v3, p0, v0

    aput v3, p0, v1

    .line 6751
    aput v2, p0, v0

    .line 6752
    add-int/lit8 v1, v1, -0x1

    .line 6753
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 6755
    .end local v2    # "tmp":F
    :cond_1
    return-void
.end method

.method public static reverse([I)V
    .locals 2
    .param p0, "array"    # [I

    .line 6766
    if-eqz p0, :cond_0

    .line 6767
    const/4 v0, 0x0

    array-length v1, p0

    invoke-static {p0, v0, v1}, Lorg/apache/commons/lang3/ArrayUtils;->reverse([III)V

    .line 6769
    :cond_0
    return-void
.end method

.method public static reverse([III)V
    .locals 4
    .param p0, "array"    # [I
    .param p1, "startIndexInclusive"    # I
    .param p2, "endIndexExclusive"    # I

    .line 6788
    if-nez p0, :cond_0

    .line 6789
    return-void

    .line 6791
    :cond_0
    const/4 v0, 0x0

    invoke-static {p1, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    .line 6792
    .local v0, "i":I
    array-length v1, p0

    invoke-static {v1, p2}, Ljava/lang/Math;->min(II)I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    .line 6794
    .local v1, "j":I
    :goto_0
    if-le v1, v0, :cond_1

    .line 6795
    aget v2, p0, v1

    .line 6796
    .local v2, "tmp":I
    aget v3, p0, v0

    aput v3, p0, v1

    .line 6797
    aput v2, p0, v0

    .line 6798
    add-int/lit8 v1, v1, -0x1

    .line 6799
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 6801
    .end local v2    # "tmp":I
    :cond_1
    return-void
.end method

.method public static reverse([J)V
    .locals 2
    .param p0, "array"    # [J

    .line 6812
    if-eqz p0, :cond_0

    .line 6813
    const/4 v0, 0x0

    array-length v1, p0

    invoke-static {p0, v0, v1}, Lorg/apache/commons/lang3/ArrayUtils;->reverse([JII)V

    .line 6815
    :cond_0
    return-void
.end method

.method public static reverse([JII)V
    .locals 6
    .param p0, "array"    # [J
    .param p1, "startIndexInclusive"    # I
    .param p2, "endIndexExclusive"    # I

    .line 6834
    if-nez p0, :cond_0

    .line 6835
    return-void

    .line 6837
    :cond_0
    const/4 v0, 0x0

    invoke-static {p1, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    .line 6838
    .local v0, "i":I
    array-length v1, p0

    invoke-static {v1, p2}, Ljava/lang/Math;->min(II)I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    .line 6840
    .local v1, "j":I
    :goto_0
    if-le v1, v0, :cond_1

    .line 6841
    aget-wide v2, p0, v1

    .line 6842
    .local v2, "tmp":J
    aget-wide v4, p0, v0

    aput-wide v4, p0, v1

    .line 6843
    aput-wide v2, p0, v0

    .line 6844
    add-int/lit8 v1, v1, -0x1

    .line 6845
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 6847
    .end local v2    # "tmp":J
    :cond_1
    return-void
.end method

.method public static reverse([Ljava/lang/Object;)V
    .locals 2
    .param p0, "array"    # [Ljava/lang/Object;

    .line 6861
    if-eqz p0, :cond_0

    .line 6862
    const/4 v0, 0x0

    array-length v1, p0

    invoke-static {p0, v0, v1}, Lorg/apache/commons/lang3/ArrayUtils;->reverse([Ljava/lang/Object;II)V

    .line 6864
    :cond_0
    return-void
.end method

.method public static reverse([Ljava/lang/Object;II)V
    .locals 4
    .param p0, "array"    # [Ljava/lang/Object;
    .param p1, "startIndexInclusive"    # I
    .param p2, "endIndexExclusive"    # I

    .line 6883
    if-nez p0, :cond_0

    .line 6884
    return-void

    .line 6886
    :cond_0
    const/4 v0, 0x0

    invoke-static {p1, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    .line 6887
    .local v0, "i":I
    array-length v1, p0

    invoke-static {v1, p2}, Ljava/lang/Math;->min(II)I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    .line 6889
    .local v1, "j":I
    :goto_0
    if-le v1, v0, :cond_1

    .line 6890
    aget-object v2, p0, v1

    .line 6891
    .local v2, "tmp":Ljava/lang/Object;
    aget-object v3, p0, v0

    aput-object v3, p0, v1

    .line 6892
    aput-object v2, p0, v0

    .line 6893
    add-int/lit8 v1, v1, -0x1

    .line 6894
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 6896
    .end local v2    # "tmp":Ljava/lang/Object;
    :cond_1
    return-void
.end method

.method public static reverse([S)V
    .locals 2
    .param p0, "array"    # [S

    .line 6907
    if-eqz p0, :cond_0

    .line 6908
    const/4 v0, 0x0

    array-length v1, p0

    invoke-static {p0, v0, v1}, Lorg/apache/commons/lang3/ArrayUtils;->reverse([SII)V

    .line 6910
    :cond_0
    return-void
.end method

.method public static reverse([SII)V
    .locals 4
    .param p0, "array"    # [S
    .param p1, "startIndexInclusive"    # I
    .param p2, "endIndexExclusive"    # I

    .line 6929
    if-nez p0, :cond_0

    .line 6930
    return-void

    .line 6932
    :cond_0
    const/4 v0, 0x0

    invoke-static {p1, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    .line 6933
    .local v0, "i":I
    array-length v1, p0

    invoke-static {v1, p2}, Ljava/lang/Math;->min(II)I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    .line 6935
    .local v1, "j":I
    :goto_0
    if-le v1, v0, :cond_1

    .line 6936
    aget-short v2, p0, v1

    .line 6937
    .local v2, "tmp":S
    aget-short v3, p0, v0

    aput-short v3, p0, v1

    .line 6938
    aput-short v2, p0, v0

    .line 6939
    add-int/lit8 v1, v1, -0x1

    .line 6940
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 6942
    .end local v2    # "tmp":S
    :cond_1
    return-void
.end method

.method public static reverse([Z)V
    .locals 2
    .param p0, "array"    # [Z

    .line 6535
    if-nez p0, :cond_0

    .line 6536
    return-void

    .line 6538
    :cond_0
    const/4 v0, 0x0

    array-length v1, p0

    invoke-static {p0, v0, v1}, Lorg/apache/commons/lang3/ArrayUtils;->reverse([ZII)V

    .line 6539
    return-void
.end method

.method public static reverse([ZII)V
    .locals 4
    .param p0, "array"    # [Z
    .param p1, "startIndexInclusive"    # I
    .param p2, "endIndexExclusive"    # I

    .line 6558
    if-nez p0, :cond_0

    .line 6559
    return-void

    .line 6561
    :cond_0
    const/4 v0, 0x0

    invoke-static {p1, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    .line 6562
    .local v0, "i":I
    array-length v1, p0

    invoke-static {v1, p2}, Ljava/lang/Math;->min(II)I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    .line 6564
    .local v1, "j":I
    :goto_0
    if-le v1, v0, :cond_1

    .line 6565
    aget-boolean v2, p0, v1

    .line 6566
    .local v2, "tmp":Z
    aget-boolean v3, p0, v0

    aput-boolean v3, p0, v1

    .line 6567
    aput-boolean v2, p0, v0

    .line 6568
    add-int/lit8 v1, v1, -0x1

    .line 6569
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 6571
    .end local v2    # "tmp":Z
    :cond_1
    return-void
.end method

.method public static setAll([Ljava/lang/Object;Ljava/util/function/IntFunction;)[Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">([TT;",
            "Ljava/util/function/IntFunction<",
            "+TT;>;)[TT;"
        }
    .end annotation

    .line 6958
    .local p0, "array":[Ljava/lang/Object;, "[TT;"
    .local p1, "generator":Ljava/util/function/IntFunction;, "Ljava/util/function/IntFunction<+TT;>;"
    if-eqz p0, :cond_0

    if-eqz p1, :cond_0

    .line 6959
    invoke-static {p0, p1}, Ljava/util/Arrays;->setAll([Ljava/lang/Object;Ljava/util/function/IntFunction;)V

    .line 6961
    :cond_0
    return-object p0
.end method

.method public static setAll([Ljava/lang/Object;Ljava/util/function/Supplier;)[Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">([TT;",
            "Ljava/util/function/Supplier<",
            "+TT;>;)[TT;"
        }
    .end annotation

    .line 6978
    .local p0, "array":[Ljava/lang/Object;, "[TT;"
    .local p1, "generator":Ljava/util/function/Supplier;, "Ljava/util/function/Supplier<+TT;>;"
    if-eqz p0, :cond_0

    if-eqz p1, :cond_0

    .line 6979
    const/4 v0, 0x0

    .local v0, "i":I
    :goto_0
    array-length v1, p0

    if-ge v0, v1, :cond_0

    .line 6980
    invoke-interface {p1}, Ljava/util/function/Supplier;->get()Ljava/lang/Object;

    move-result-object v1

    aput-object v1, p0, v0

    .line 6979
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 6983
    .end local v0    # "i":I
    :cond_0
    return-object p0
.end method

.method public static shift([BI)V
    .locals 2
    .param p0, "array"    # [B
    .param p1, "offset"    # I

    .line 7074
    if-eqz p0, :cond_0

    .line 7075
    const/4 v0, 0x0

    array-length v1, p0

    invoke-static {p0, v0, v1, p1}, Lorg/apache/commons/lang3/ArrayUtils;->shift([BIII)V

    .line 7077
    :cond_0
    return-void
.end method

.method public static shift([BIII)V
    .locals 4
    .param p0, "array"    # [B
    .param p1, "startIndexInclusive"    # I
    .param p2, "endIndexExclusive"    # I
    .param p3, "offset"    # I

    .line 7099
    if-eqz p0, :cond_8

    array-length v0, p0

    const/4 v1, 0x1

    sub-int/2addr v0, v1

    if-ge p1, v0, :cond_8

    if-gtz p2, :cond_0

    goto :goto_2

    .line 7102
    :cond_0
    if-gez p1, :cond_1

    .line 7103
    const/4 p1, 0x0

    .line 7105
    :cond_1
    array-length v0, p0

    if-lt p2, v0, :cond_2

    .line 7106
    array-length p2, p0

    .line 7108
    :cond_2
    sub-int v0, p2, p1

    .line 7109
    .local v0, "n":I
    if-gt v0, v1, :cond_3

    .line 7110
    return-void

    .line 7112
    :cond_3
    rem-int/2addr p3, v0

    .line 7113
    if-gez p3, :cond_4

    .line 7114
    add-int/2addr p3, v0

    .line 7118
    :cond_4
    :goto_0
    if-le v0, v1, :cond_7

    if-lez p3, :cond_7

    .line 7119
    sub-int v2, v0, p3

    .line 7121
    .local v2, "nOffset":I
    if-le p3, v2, :cond_5

    .line 7122
    add-int v3, p1, v0

    sub-int/2addr v3, v2

    invoke-static {p0, p1, v3, v2}, Lorg/apache/commons/lang3/ArrayUtils;->swap([BIII)V

    .line 7123
    move v0, p3

    .line 7124
    sub-int/2addr p3, v2

    goto :goto_1

    .line 7125
    :cond_5
    if-ge p3, v2, :cond_6

    .line 7126
    add-int v3, p1, v2

    invoke-static {p0, p1, v3, p3}, Lorg/apache/commons/lang3/ArrayUtils;->swap([BIII)V

    .line 7127
    add-int/2addr p1, p3

    .line 7128
    move v0, v2

    .line 7133
    .end local v2    # "nOffset":I
    :goto_1
    goto :goto_0

    .line 7130
    .restart local v2    # "nOffset":I
    :cond_6
    add-int v1, p1, v2

    invoke-static {p0, p1, v1, p3}, Lorg/apache/commons/lang3/ArrayUtils;->swap([BIII)V

    .line 7131
    nop

    .line 7134
    .end local v2    # "nOffset":I
    :cond_7
    return-void

    .line 7100
    .end local v0    # "n":I
    :cond_8
    :goto_2
    return-void
.end method

.method public static shift([CI)V
    .locals 2
    .param p0, "array"    # [C
    .param p1, "offset"    # I

    .line 7149
    if-eqz p0, :cond_0

    .line 7150
    const/4 v0, 0x0

    array-length v1, p0

    invoke-static {p0, v0, v1, p1}, Lorg/apache/commons/lang3/ArrayUtils;->shift([CIII)V

    .line 7152
    :cond_0
    return-void
.end method

.method public static shift([CIII)V
    .locals 4
    .param p0, "array"    # [C
    .param p1, "startIndexInclusive"    # I
    .param p2, "endIndexExclusive"    # I
    .param p3, "offset"    # I

    .line 7174
    if-eqz p0, :cond_8

    array-length v0, p0

    const/4 v1, 0x1

    sub-int/2addr v0, v1

    if-ge p1, v0, :cond_8

    if-gtz p2, :cond_0

    goto :goto_2

    .line 7177
    :cond_0
    if-gez p1, :cond_1

    .line 7178
    const/4 p1, 0x0

    .line 7180
    :cond_1
    array-length v0, p0

    if-lt p2, v0, :cond_2

    .line 7181
    array-length p2, p0

    .line 7183
    :cond_2
    sub-int v0, p2, p1

    .line 7184
    .local v0, "n":I
    if-gt v0, v1, :cond_3

    .line 7185
    return-void

    .line 7187
    :cond_3
    rem-int/2addr p3, v0

    .line 7188
    if-gez p3, :cond_4

    .line 7189
    add-int/2addr p3, v0

    .line 7193
    :cond_4
    :goto_0
    if-le v0, v1, :cond_7

    if-lez p3, :cond_7

    .line 7194
    sub-int v2, v0, p3

    .line 7196
    .local v2, "nOffset":I
    if-le p3, v2, :cond_5

    .line 7197
    add-int v3, p1, v0

    sub-int/2addr v3, v2

    invoke-static {p0, p1, v3, v2}, Lorg/apache/commons/lang3/ArrayUtils;->swap([CIII)V

    .line 7198
    move v0, p3

    .line 7199
    sub-int/2addr p3, v2

    goto :goto_1

    .line 7200
    :cond_5
    if-ge p3, v2, :cond_6

    .line 7201
    add-int v3, p1, v2

    invoke-static {p0, p1, v3, p3}, Lorg/apache/commons/lang3/ArrayUtils;->swap([CIII)V

    .line 7202
    add-int/2addr p1, p3

    .line 7203
    move v0, v2

    .line 7208
    .end local v2    # "nOffset":I
    :goto_1
    goto :goto_0

    .line 7205
    .restart local v2    # "nOffset":I
    :cond_6
    add-int v1, p1, v2

    invoke-static {p0, p1, v1, p3}, Lorg/apache/commons/lang3/ArrayUtils;->swap([CIII)V

    .line 7206
    nop

    .line 7209
    .end local v2    # "nOffset":I
    :cond_7
    return-void

    .line 7175
    .end local v0    # "n":I
    :cond_8
    :goto_2
    return-void
.end method

.method public static shift([DI)V
    .locals 2
    .param p0, "array"    # [D
    .param p1, "offset"    # I

    .line 7224
    if-eqz p0, :cond_0

    .line 7225
    const/4 v0, 0x0

    array-length v1, p0

    invoke-static {p0, v0, v1, p1}, Lorg/apache/commons/lang3/ArrayUtils;->shift([DIII)V

    .line 7227
    :cond_0
    return-void
.end method

.method public static shift([DIII)V
    .locals 4
    .param p0, "array"    # [D
    .param p1, "startIndexInclusive"    # I
    .param p2, "endIndexExclusive"    # I
    .param p3, "offset"    # I

    .line 7249
    if-eqz p0, :cond_8

    array-length v0, p0

    const/4 v1, 0x1

    sub-int/2addr v0, v1

    if-ge p1, v0, :cond_8

    if-gtz p2, :cond_0

    goto :goto_2

    .line 7252
    :cond_0
    if-gez p1, :cond_1

    .line 7253
    const/4 p1, 0x0

    .line 7255
    :cond_1
    array-length v0, p0

    if-lt p2, v0, :cond_2

    .line 7256
    array-length p2, p0

    .line 7258
    :cond_2
    sub-int v0, p2, p1

    .line 7259
    .local v0, "n":I
    if-gt v0, v1, :cond_3

    .line 7260
    return-void

    .line 7262
    :cond_3
    rem-int/2addr p3, v0

    .line 7263
    if-gez p3, :cond_4

    .line 7264
    add-int/2addr p3, v0

    .line 7268
    :cond_4
    :goto_0
    if-le v0, v1, :cond_7

    if-lez p3, :cond_7

    .line 7269
    sub-int v2, v0, p3

    .line 7271
    .local v2, "nOffset":I
    if-le p3, v2, :cond_5

    .line 7272
    add-int v3, p1, v0

    sub-int/2addr v3, v2

    invoke-static {p0, p1, v3, v2}, Lorg/apache/commons/lang3/ArrayUtils;->swap([DIII)V

    .line 7273
    move v0, p3

    .line 7274
    sub-int/2addr p3, v2

    goto :goto_1

    .line 7275
    :cond_5
    if-ge p3, v2, :cond_6

    .line 7276
    add-int v3, p1, v2

    invoke-static {p0, p1, v3, p3}, Lorg/apache/commons/lang3/ArrayUtils;->swap([DIII)V

    .line 7277
    add-int/2addr p1, p3

    .line 7278
    move v0, v2

    .line 7283
    .end local v2    # "nOffset":I
    :goto_1
    goto :goto_0

    .line 7280
    .restart local v2    # "nOffset":I
    :cond_6
    add-int v1, p1, v2

    invoke-static {p0, p1, v1, p3}, Lorg/apache/commons/lang3/ArrayUtils;->swap([DIII)V

    .line 7281
    nop

    .line 7284
    .end local v2    # "nOffset":I
    :cond_7
    return-void

    .line 7250
    .end local v0    # "n":I
    :cond_8
    :goto_2
    return-void
.end method

.method public static shift([FI)V
    .locals 2
    .param p0, "array"    # [F
    .param p1, "offset"    # I

    .line 7299
    if-eqz p0, :cond_0

    .line 7300
    const/4 v0, 0x0

    array-length v1, p0

    invoke-static {p0, v0, v1, p1}, Lorg/apache/commons/lang3/ArrayUtils;->shift([FIII)V

    .line 7302
    :cond_0
    return-void
.end method

.method public static shift([FIII)V
    .locals 4
    .param p0, "array"    # [F
    .param p1, "startIndexInclusive"    # I
    .param p2, "endIndexExclusive"    # I
    .param p3, "offset"    # I

    .line 7324
    if-eqz p0, :cond_8

    array-length v0, p0

    const/4 v1, 0x1

    sub-int/2addr v0, v1

    if-ge p1, v0, :cond_8

    if-gtz p2, :cond_0

    goto :goto_2

    .line 7327
    :cond_0
    if-gez p1, :cond_1

    .line 7328
    const/4 p1, 0x0

    .line 7330
    :cond_1
    array-length v0, p0

    if-lt p2, v0, :cond_2

    .line 7331
    array-length p2, p0

    .line 7333
    :cond_2
    sub-int v0, p2, p1

    .line 7334
    .local v0, "n":I
    if-gt v0, v1, :cond_3

    .line 7335
    return-void

    .line 7337
    :cond_3
    rem-int/2addr p3, v0

    .line 7338
    if-gez p3, :cond_4

    .line 7339
    add-int/2addr p3, v0

    .line 7343
    :cond_4
    :goto_0
    if-le v0, v1, :cond_7

    if-lez p3, :cond_7

    .line 7344
    sub-int v2, v0, p3

    .line 7346
    .local v2, "nOffset":I
    if-le p3, v2, :cond_5

    .line 7347
    add-int v3, p1, v0

    sub-int/2addr v3, v2

    invoke-static {p0, p1, v3, v2}, Lorg/apache/commons/lang3/ArrayUtils;->swap([FIII)V

    .line 7348
    move v0, p3

    .line 7349
    sub-int/2addr p3, v2

    goto :goto_1

    .line 7350
    :cond_5
    if-ge p3, v2, :cond_6

    .line 7351
    add-int v3, p1, v2

    invoke-static {p0, p1, v3, p3}, Lorg/apache/commons/lang3/ArrayUtils;->swap([FIII)V

    .line 7352
    add-int/2addr p1, p3

    .line 7353
    move v0, v2

    .line 7358
    .end local v2    # "nOffset":I
    :goto_1
    goto :goto_0

    .line 7355
    .restart local v2    # "nOffset":I
    :cond_6
    add-int v1, p1, v2

    invoke-static {p0, p1, v1, p3}, Lorg/apache/commons/lang3/ArrayUtils;->swap([FIII)V

    .line 7356
    nop

    .line 7359
    .end local v2    # "nOffset":I
    :cond_7
    return-void

    .line 7325
    .end local v0    # "n":I
    :cond_8
    :goto_2
    return-void
.end method

.method public static shift([II)V
    .locals 2
    .param p0, "array"    # [I
    .param p1, "offset"    # I

    .line 7374
    if-eqz p0, :cond_0

    .line 7375
    const/4 v0, 0x0

    array-length v1, p0

    invoke-static {p0, v0, v1, p1}, Lorg/apache/commons/lang3/ArrayUtils;->shift([IIII)V

    .line 7377
    :cond_0
    return-void
.end method

.method public static shift([IIII)V
    .locals 4
    .param p0, "array"    # [I
    .param p1, "startIndexInclusive"    # I
    .param p2, "endIndexExclusive"    # I
    .param p3, "offset"    # I

    .line 7399
    if-eqz p0, :cond_8

    array-length v0, p0

    const/4 v1, 0x1

    sub-int/2addr v0, v1

    if-ge p1, v0, :cond_8

    if-gtz p2, :cond_0

    goto :goto_2

    .line 7402
    :cond_0
    if-gez p1, :cond_1

    .line 7403
    const/4 p1, 0x0

    .line 7405
    :cond_1
    array-length v0, p0

    if-lt p2, v0, :cond_2

    .line 7406
    array-length p2, p0

    .line 7408
    :cond_2
    sub-int v0, p2, p1

    .line 7409
    .local v0, "n":I
    if-gt v0, v1, :cond_3

    .line 7410
    return-void

    .line 7412
    :cond_3
    rem-int/2addr p3, v0

    .line 7413
    if-gez p3, :cond_4

    .line 7414
    add-int/2addr p3, v0

    .line 7418
    :cond_4
    :goto_0
    if-le v0, v1, :cond_7

    if-lez p3, :cond_7

    .line 7419
    sub-int v2, v0, p3

    .line 7421
    .local v2, "nOffset":I
    if-le p3, v2, :cond_5

    .line 7422
    add-int v3, p1, v0

    sub-int/2addr v3, v2

    invoke-static {p0, p1, v3, v2}, Lorg/apache/commons/lang3/ArrayUtils;->swap([IIII)V

    .line 7423
    move v0, p3

    .line 7424
    sub-int/2addr p3, v2

    goto :goto_1

    .line 7425
    :cond_5
    if-ge p3, v2, :cond_6

    .line 7426
    add-int v3, p1, v2

    invoke-static {p0, p1, v3, p3}, Lorg/apache/commons/lang3/ArrayUtils;->swap([IIII)V

    .line 7427
    add-int/2addr p1, p3

    .line 7428
    move v0, v2

    .line 7433
    .end local v2    # "nOffset":I
    :goto_1
    goto :goto_0

    .line 7430
    .restart local v2    # "nOffset":I
    :cond_6
    add-int v1, p1, v2

    invoke-static {p0, p1, v1, p3}, Lorg/apache/commons/lang3/ArrayUtils;->swap([IIII)V

    .line 7431
    nop

    .line 7434
    .end local v2    # "nOffset":I
    :cond_7
    return-void

    .line 7400
    .end local v0    # "n":I
    :cond_8
    :goto_2
    return-void
.end method

.method public static shift([JI)V
    .locals 2
    .param p0, "array"    # [J
    .param p1, "offset"    # I

    .line 7449
    if-eqz p0, :cond_0

    .line 7450
    const/4 v0, 0x0

    array-length v1, p0

    invoke-static {p0, v0, v1, p1}, Lorg/apache/commons/lang3/ArrayUtils;->shift([JIII)V

    .line 7452
    :cond_0
    return-void
.end method

.method public static shift([JIII)V
    .locals 4
    .param p0, "array"    # [J
    .param p1, "startIndexInclusive"    # I
    .param p2, "endIndexExclusive"    # I
    .param p3, "offset"    # I

    .line 7474
    if-eqz p0, :cond_8

    array-length v0, p0

    const/4 v1, 0x1

    sub-int/2addr v0, v1

    if-ge p1, v0, :cond_8

    if-gtz p2, :cond_0

    goto :goto_2

    .line 7477
    :cond_0
    if-gez p1, :cond_1

    .line 7478
    const/4 p1, 0x0

    .line 7480
    :cond_1
    array-length v0, p0

    if-lt p2, v0, :cond_2

    .line 7481
    array-length p2, p0

    .line 7483
    :cond_2
    sub-int v0, p2, p1

    .line 7484
    .local v0, "n":I
    if-gt v0, v1, :cond_3

    .line 7485
    return-void

    .line 7487
    :cond_3
    rem-int/2addr p3, v0

    .line 7488
    if-gez p3, :cond_4

    .line 7489
    add-int/2addr p3, v0

    .line 7493
    :cond_4
    :goto_0
    if-le v0, v1, :cond_7

    if-lez p3, :cond_7

    .line 7494
    sub-int v2, v0, p3

    .line 7496
    .local v2, "nOffset":I
    if-le p3, v2, :cond_5

    .line 7497
    add-int v3, p1, v0

    sub-int/2addr v3, v2

    invoke-static {p0, p1, v3, v2}, Lorg/apache/commons/lang3/ArrayUtils;->swap([JIII)V

    .line 7498
    move v0, p3

    .line 7499
    sub-int/2addr p3, v2

    goto :goto_1

    .line 7500
    :cond_5
    if-ge p3, v2, :cond_6

    .line 7501
    add-int v3, p1, v2

    invoke-static {p0, p1, v3, p3}, Lorg/apache/commons/lang3/ArrayUtils;->swap([JIII)V

    .line 7502
    add-int/2addr p1, p3

    .line 7503
    move v0, v2

    .line 7508
    .end local v2    # "nOffset":I
    :goto_1
    goto :goto_0

    .line 7505
    .restart local v2    # "nOffset":I
    :cond_6
    add-int v1, p1, v2

    invoke-static {p0, p1, v1, p3}, Lorg/apache/commons/lang3/ArrayUtils;->swap([JIII)V

    .line 7506
    nop

    .line 7509
    .end local v2    # "nOffset":I
    :cond_7
    return-void

    .line 7475
    .end local v0    # "n":I
    :cond_8
    :goto_2
    return-void
.end method

.method public static shift([Ljava/lang/Object;I)V
    .locals 2
    .param p0, "array"    # [Ljava/lang/Object;
    .param p1, "offset"    # I

    .line 7524
    if-eqz p0, :cond_0

    .line 7525
    const/4 v0, 0x0

    array-length v1, p0

    invoke-static {p0, v0, v1, p1}, Lorg/apache/commons/lang3/ArrayUtils;->shift([Ljava/lang/Object;III)V

    .line 7527
    :cond_0
    return-void
.end method

.method public static shift([Ljava/lang/Object;III)V
    .locals 4
    .param p0, "array"    # [Ljava/lang/Object;
    .param p1, "startIndexInclusive"    # I
    .param p2, "endIndexExclusive"    # I
    .param p3, "offset"    # I

    .line 7549
    if-eqz p0, :cond_8

    array-length v0, p0

    const/4 v1, 0x1

    sub-int/2addr v0, v1

    if-ge p1, v0, :cond_8

    if-gtz p2, :cond_0

    goto :goto_2

    .line 7552
    :cond_0
    if-gez p1, :cond_1

    .line 7553
    const/4 p1, 0x0

    .line 7555
    :cond_1
    array-length v0, p0

    if-lt p2, v0, :cond_2

    .line 7556
    array-length p2, p0

    .line 7558
    :cond_2
    sub-int v0, p2, p1

    .line 7559
    .local v0, "n":I
    if-gt v0, v1, :cond_3

    .line 7560
    return-void

    .line 7562
    :cond_3
    rem-int/2addr p3, v0

    .line 7563
    if-gez p3, :cond_4

    .line 7564
    add-int/2addr p3, v0

    .line 7568
    :cond_4
    :goto_0
    if-le v0, v1, :cond_7

    if-lez p3, :cond_7

    .line 7569
    sub-int v2, v0, p3

    .line 7571
    .local v2, "nOffset":I
    if-le p3, v2, :cond_5

    .line 7572
    add-int v3, p1, v0

    sub-int/2addr v3, v2

    invoke-static {p0, p1, v3, v2}, Lorg/apache/commons/lang3/ArrayUtils;->swap([Ljava/lang/Object;III)V

    .line 7573
    move v0, p3

    .line 7574
    sub-int/2addr p3, v2

    goto :goto_1

    .line 7575
    :cond_5
    if-ge p3, v2, :cond_6

    .line 7576
    add-int v3, p1, v2

    invoke-static {p0, p1, v3, p3}, Lorg/apache/commons/lang3/ArrayUtils;->swap([Ljava/lang/Object;III)V

    .line 7577
    add-int/2addr p1, p3

    .line 7578
    move v0, v2

    .line 7583
    .end local v2    # "nOffset":I
    :goto_1
    goto :goto_0

    .line 7580
    .restart local v2    # "nOffset":I
    :cond_6
    add-int v1, p1, v2

    invoke-static {p0, p1, v1, p3}, Lorg/apache/commons/lang3/ArrayUtils;->swap([Ljava/lang/Object;III)V

    .line 7581
    nop

    .line 7584
    .end local v2    # "nOffset":I
    :cond_7
    return-void

    .line 7550
    .end local v0    # "n":I
    :cond_8
    :goto_2
    return-void
.end method

.method public static shift([SI)V
    .locals 2
    .param p0, "array"    # [S
    .param p1, "offset"    # I

    .line 7599
    if-eqz p0, :cond_0

    .line 7600
    const/4 v0, 0x0

    array-length v1, p0

    invoke-static {p0, v0, v1, p1}, Lorg/apache/commons/lang3/ArrayUtils;->shift([SIII)V

    .line 7602
    :cond_0
    return-void
.end method

.method public static shift([SIII)V
    .locals 4
    .param p0, "array"    # [S
    .param p1, "startIndexInclusive"    # I
    .param p2, "endIndexExclusive"    # I
    .param p3, "offset"    # I

    .line 7624
    if-eqz p0, :cond_8

    array-length v0, p0

    const/4 v1, 0x1

    sub-int/2addr v0, v1

    if-ge p1, v0, :cond_8

    if-gtz p2, :cond_0

    goto :goto_2

    .line 7627
    :cond_0
    if-gez p1, :cond_1

    .line 7628
    const/4 p1, 0x0

    .line 7630
    :cond_1
    array-length v0, p0

    if-lt p2, v0, :cond_2

    .line 7631
    array-length p2, p0

    .line 7633
    :cond_2
    sub-int v0, p2, p1

    .line 7634
    .local v0, "n":I
    if-gt v0, v1, :cond_3

    .line 7635
    return-void

    .line 7637
    :cond_3
    rem-int/2addr p3, v0

    .line 7638
    if-gez p3, :cond_4

    .line 7639
    add-int/2addr p3, v0

    .line 7643
    :cond_4
    :goto_0
    if-le v0, v1, :cond_7

    if-lez p3, :cond_7

    .line 7644
    sub-int v2, v0, p3

    .line 7646
    .local v2, "nOffset":I
    if-le p3, v2, :cond_5

    .line 7647
    add-int v3, p1, v0

    sub-int/2addr v3, v2

    invoke-static {p0, p1, v3, v2}, Lorg/apache/commons/lang3/ArrayUtils;->swap([SIII)V

    .line 7648
    move v0, p3

    .line 7649
    sub-int/2addr p3, v2

    goto :goto_1

    .line 7650
    :cond_5
    if-ge p3, v2, :cond_6

    .line 7651
    add-int v3, p1, v2

    invoke-static {p0, p1, v3, p3}, Lorg/apache/commons/lang3/ArrayUtils;->swap([SIII)V

    .line 7652
    add-int/2addr p1, p3

    .line 7653
    move v0, v2

    .line 7658
    .end local v2    # "nOffset":I
    :goto_1
    goto :goto_0

    .line 7655
    .restart local v2    # "nOffset":I
    :cond_6
    add-int v1, p1, v2

    invoke-static {p0, p1, v1, p3}, Lorg/apache/commons/lang3/ArrayUtils;->swap([SIII)V

    .line 7656
    nop

    .line 7659
    .end local v2    # "nOffset":I
    :cond_7
    return-void

    .line 7625
    .end local v0    # "n":I
    :cond_8
    :goto_2
    return-void
.end method

.method public static shift([ZI)V
    .locals 2
    .param p0, "array"    # [Z
    .param p1, "offset"    # I

    .line 6999
    if-eqz p0, :cond_0

    .line 7000
    const/4 v0, 0x0

    array-length v1, p0

    invoke-static {p0, v0, v1, p1}, Lorg/apache/commons/lang3/ArrayUtils;->shift([ZIII)V

    .line 7002
    :cond_0
    return-void
.end method

.method public static shift([ZIII)V
    .locals 4
    .param p0, "array"    # [Z
    .param p1, "startIndexInclusive"    # I
    .param p2, "endIndexExclusive"    # I
    .param p3, "offset"    # I

    .line 7024
    if-eqz p0, :cond_8

    array-length v0, p0

    const/4 v1, 0x1

    sub-int/2addr v0, v1

    if-ge p1, v0, :cond_8

    if-gtz p2, :cond_0

    goto :goto_2

    .line 7027
    :cond_0
    if-gez p1, :cond_1

    .line 7028
    const/4 p1, 0x0

    .line 7030
    :cond_1
    array-length v0, p0

    if-lt p2, v0, :cond_2

    .line 7031
    array-length p2, p0

    .line 7033
    :cond_2
    sub-int v0, p2, p1

    .line 7034
    .local v0, "n":I
    if-gt v0, v1, :cond_3

    .line 7035
    return-void

    .line 7037
    :cond_3
    rem-int/2addr p3, v0

    .line 7038
    if-gez p3, :cond_4

    .line 7039
    add-int/2addr p3, v0

    .line 7043
    :cond_4
    :goto_0
    if-le v0, v1, :cond_7

    if-lez p3, :cond_7

    .line 7044
    sub-int v2, v0, p3

    .line 7046
    .local v2, "nOffset":I
    if-le p3, v2, :cond_5

    .line 7047
    add-int v3, p1, v0

    sub-int/2addr v3, v2

    invoke-static {p0, p1, v3, v2}, Lorg/apache/commons/lang3/ArrayUtils;->swap([ZIII)V

    .line 7048
    move v0, p3

    .line 7049
    sub-int/2addr p3, v2

    goto :goto_1

    .line 7050
    :cond_5
    if-ge p3, v2, :cond_6

    .line 7051
    add-int v3, p1, v2

    invoke-static {p0, p1, v3, p3}, Lorg/apache/commons/lang3/ArrayUtils;->swap([ZIII)V

    .line 7052
    add-int/2addr p1, p3

    .line 7053
    move v0, v2

    .line 7058
    .end local v2    # "nOffset":I
    :goto_1
    goto :goto_0

    .line 7055
    .restart local v2    # "nOffset":I
    :cond_6
    add-int v1, p1, v2

    invoke-static {p0, p1, v1, p3}, Lorg/apache/commons/lang3/ArrayUtils;->swap([ZIII)V

    .line 7056
    nop

    .line 7059
    .end local v2    # "nOffset":I
    :cond_7
    return-void

    .line 7025
    .end local v0    # "n":I
    :cond_8
    :goto_2
    return-void
.end method

.method public static shuffle([B)V
    .locals 1
    .param p0, "array"    # [B

    .line 7694
    invoke-static {}, Lorg/apache/commons/lang3/ArrayUtils;->random()Ljava/util/concurrent/ThreadLocalRandom;

    move-result-object v0

    invoke-static {p0, v0}, Lorg/apache/commons/lang3/ArrayUtils;->shuffle([BLjava/util/Random;)V

    .line 7695
    return-void
.end method

.method public static shuffle([BLjava/util/Random;)V
    .locals 4
    .param p0, "array"    # [B
    .param p1, "random"    # Ljava/util/Random;

    .line 7706
    array-length v0, p0

    .local v0, "i":I
    :goto_0
    const/4 v1, 0x1

    if-le v0, v1, :cond_0

    .line 7707
    add-int/lit8 v2, v0, -0x1

    invoke-virtual {p1, v0}, Ljava/util/Random;->nextInt(I)I

    move-result v3

    invoke-static {p0, v2, v3, v1}, Lorg/apache/commons/lang3/ArrayUtils;->swap([BIII)V

    .line 7706
    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    .line 7709
    .end local v0    # "i":I
    :cond_0
    return-void
.end method

.method public static shuffle([C)V
    .locals 1
    .param p0, "array"    # [C

    .line 7719
    invoke-static {}, Lorg/apache/commons/lang3/ArrayUtils;->random()Ljava/util/concurrent/ThreadLocalRandom;

    move-result-object v0

    invoke-static {p0, v0}, Lorg/apache/commons/lang3/ArrayUtils;->shuffle([CLjava/util/Random;)V

    .line 7720
    return-void
.end method

.method public static shuffle([CLjava/util/Random;)V
    .locals 4
    .param p0, "array"    # [C
    .param p1, "random"    # Ljava/util/Random;

    .line 7731
    array-length v0, p0

    .local v0, "i":I
    :goto_0
    const/4 v1, 0x1

    if-le v0, v1, :cond_0

    .line 7732
    add-int/lit8 v2, v0, -0x1

    invoke-virtual {p1, v0}, Ljava/util/Random;->nextInt(I)I

    move-result v3

    invoke-static {p0, v2, v3, v1}, Lorg/apache/commons/lang3/ArrayUtils;->swap([CIII)V

    .line 7731
    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    .line 7734
    .end local v0    # "i":I
    :cond_0
    return-void
.end method

.method public static shuffle([D)V
    .locals 1
    .param p0, "array"    # [D

    .line 7744
    invoke-static {}, Lorg/apache/commons/lang3/ArrayUtils;->random()Ljava/util/concurrent/ThreadLocalRandom;

    move-result-object v0

    invoke-static {p0, v0}, Lorg/apache/commons/lang3/ArrayUtils;->shuffle([DLjava/util/Random;)V

    .line 7745
    return-void
.end method

.method public static shuffle([DLjava/util/Random;)V
    .locals 4
    .param p0, "array"    # [D
    .param p1, "random"    # Ljava/util/Random;

    .line 7756
    array-length v0, p0

    .local v0, "i":I
    :goto_0
    const/4 v1, 0x1

    if-le v0, v1, :cond_0

    .line 7757
    add-int/lit8 v2, v0, -0x1

    invoke-virtual {p1, v0}, Ljava/util/Random;->nextInt(I)I

    move-result v3

    invoke-static {p0, v2, v3, v1}, Lorg/apache/commons/lang3/ArrayUtils;->swap([DIII)V

    .line 7756
    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    .line 7759
    .end local v0    # "i":I
    :cond_0
    return-void
.end method

.method public static shuffle([F)V
    .locals 1
    .param p0, "array"    # [F

    .line 7769
    invoke-static {}, Lorg/apache/commons/lang3/ArrayUtils;->random()Ljava/util/concurrent/ThreadLocalRandom;

    move-result-object v0

    invoke-static {p0, v0}, Lorg/apache/commons/lang3/ArrayUtils;->shuffle([FLjava/util/Random;)V

    .line 7770
    return-void
.end method

.method public static shuffle([FLjava/util/Random;)V
    .locals 4
    .param p0, "array"    # [F
    .param p1, "random"    # Ljava/util/Random;

    .line 7781
    array-length v0, p0

    .local v0, "i":I
    :goto_0
    const/4 v1, 0x1

    if-le v0, v1, :cond_0

    .line 7782
    add-int/lit8 v2, v0, -0x1

    invoke-virtual {p1, v0}, Ljava/util/Random;->nextInt(I)I

    move-result v3

    invoke-static {p0, v2, v3, v1}, Lorg/apache/commons/lang3/ArrayUtils;->swap([FIII)V

    .line 7781
    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    .line 7784
    .end local v0    # "i":I
    :cond_0
    return-void
.end method

.method public static shuffle([I)V
    .locals 1
    .param p0, "array"    # [I

    .line 7794
    invoke-static {}, Lorg/apache/commons/lang3/ArrayUtils;->random()Ljava/util/concurrent/ThreadLocalRandom;

    move-result-object v0

    invoke-static {p0, v0}, Lorg/apache/commons/lang3/ArrayUtils;->shuffle([ILjava/util/Random;)V

    .line 7795
    return-void
.end method

.method public static shuffle([ILjava/util/Random;)V
    .locals 4
    .param p0, "array"    # [I
    .param p1, "random"    # Ljava/util/Random;

    .line 7806
    array-length v0, p0

    .local v0, "i":I
    :goto_0
    const/4 v1, 0x1

    if-le v0, v1, :cond_0

    .line 7807
    add-int/lit8 v2, v0, -0x1

    invoke-virtual {p1, v0}, Ljava/util/Random;->nextInt(I)I

    move-result v3

    invoke-static {p0, v2, v3, v1}, Lorg/apache/commons/lang3/ArrayUtils;->swap([IIII)V

    .line 7806
    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    .line 7809
    .end local v0    # "i":I
    :cond_0
    return-void
.end method

.method public static shuffle([J)V
    .locals 1
    .param p0, "array"    # [J

    .line 7819
    invoke-static {}, Lorg/apache/commons/lang3/ArrayUtils;->random()Ljava/util/concurrent/ThreadLocalRandom;

    move-result-object v0

    invoke-static {p0, v0}, Lorg/apache/commons/lang3/ArrayUtils;->shuffle([JLjava/util/Random;)V

    .line 7820
    return-void
.end method

.method public static shuffle([JLjava/util/Random;)V
    .locals 4
    .param p0, "array"    # [J
    .param p1, "random"    # Ljava/util/Random;

    .line 7831
    array-length v0, p0

    .local v0, "i":I
    :goto_0
    const/4 v1, 0x1

    if-le v0, v1, :cond_0

    .line 7832
    add-int/lit8 v2, v0, -0x1

    invoke-virtual {p1, v0}, Ljava/util/Random;->nextInt(I)I

    move-result v3

    invoke-static {p0, v2, v3, v1}, Lorg/apache/commons/lang3/ArrayUtils;->swap([JIII)V

    .line 7831
    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    .line 7834
    .end local v0    # "i":I
    :cond_0
    return-void
.end method

.method public static shuffle([Ljava/lang/Object;)V
    .locals 1
    .param p0, "array"    # [Ljava/lang/Object;

    .line 7844
    invoke-static {}, Lorg/apache/commons/lang3/ArrayUtils;->random()Ljava/util/concurrent/ThreadLocalRandom;

    move-result-object v0

    invoke-static {p0, v0}, Lorg/apache/commons/lang3/ArrayUtils;->shuffle([Ljava/lang/Object;Ljava/util/Random;)V

    .line 7845
    return-void
.end method

.method public static shuffle([Ljava/lang/Object;Ljava/util/Random;)V
    .locals 4
    .param p0, "array"    # [Ljava/lang/Object;
    .param p1, "random"    # Ljava/util/Random;

    .line 7856
    array-length v0, p0

    .local v0, "i":I
    :goto_0
    const/4 v1, 0x1

    if-le v0, v1, :cond_0

    .line 7857
    add-int/lit8 v2, v0, -0x1

    invoke-virtual {p1, v0}, Ljava/util/Random;->nextInt(I)I

    move-result v3

    invoke-static {p0, v2, v3, v1}, Lorg/apache/commons/lang3/ArrayUtils;->swap([Ljava/lang/Object;III)V

    .line 7856
    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    .line 7859
    .end local v0    # "i":I
    :cond_0
    return-void
.end method

.method public static shuffle([S)V
    .locals 1
    .param p0, "array"    # [S

    .line 7869
    invoke-static {}, Lorg/apache/commons/lang3/ArrayUtils;->random()Ljava/util/concurrent/ThreadLocalRandom;

    move-result-object v0

    invoke-static {p0, v0}, Lorg/apache/commons/lang3/ArrayUtils;->shuffle([SLjava/util/Random;)V

    .line 7870
    return-void
.end method

.method public static shuffle([SLjava/util/Random;)V
    .locals 4
    .param p0, "array"    # [S
    .param p1, "random"    # Ljava/util/Random;

    .line 7881
    array-length v0, p0

    .local v0, "i":I
    :goto_0
    const/4 v1, 0x1

    if-le v0, v1, :cond_0

    .line 7882
    add-int/lit8 v2, v0, -0x1

    invoke-virtual {p1, v0}, Ljava/util/Random;->nextInt(I)I

    move-result v3

    invoke-static {p0, v2, v3, v1}, Lorg/apache/commons/lang3/ArrayUtils;->swap([SIII)V

    .line 7881
    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    .line 7884
    .end local v0    # "i":I
    :cond_0
    return-void
.end method

.method public static shuffle([Z)V
    .locals 1
    .param p0, "array"    # [Z

    .line 7669
    invoke-static {}, Lorg/apache/commons/lang3/ArrayUtils;->random()Ljava/util/concurrent/ThreadLocalRandom;

    move-result-object v0

    invoke-static {p0, v0}, Lorg/apache/commons/lang3/ArrayUtils;->shuffle([ZLjava/util/Random;)V

    .line 7670
    return-void
.end method

.method public static shuffle([ZLjava/util/Random;)V
    .locals 4
    .param p0, "array"    # [Z
    .param p1, "random"    # Ljava/util/Random;

    .line 7681
    array-length v0, p0

    .local v0, "i":I
    :goto_0
    const/4 v1, 0x1

    if-le v0, v1, :cond_0

    .line 7682
    add-int/lit8 v2, v0, -0x1

    invoke-virtual {p1, v0}, Ljava/util/Random;->nextInt(I)I

    move-result v3

    invoke-static {p0, v2, v3, v1}, Lorg/apache/commons/lang3/ArrayUtils;->swap([ZIII)V

    .line 7681
    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    .line 7684
    .end local v0    # "i":I
    :cond_0
    return-void
.end method

.method public static subarray([BII)[B
    .locals 3
    .param p0, "array"    # [B
    .param p1, "startIndexInclusive"    # I
    .param p2, "endIndexExclusive"    # I

    .line 7949
    if-nez p0, :cond_0

    .line 7950
    const/4 v0, 0x0

    return-object v0

    .line 7952
    :cond_0
    if-gez p1, :cond_1

    .line 7953
    const/4 p1, 0x0

    .line 7955
    :cond_1
    array-length v0, p0

    if-le p2, v0, :cond_2

    .line 7956
    array-length p2, p0

    .line 7958
    :cond_2
    sub-int v0, p2, p1

    .line 7959
    .local v0, "newSize":I
    if-gtz v0, :cond_3

    .line 7960
    sget-object v1, Lorg/apache/commons/lang3/ArrayUtils;->EMPTY_BYTE_ARRAY:[B

    return-object v1

    .line 7963
    :cond_3
    new-array v1, v0, [B

    .line 7964
    .local v1, "subarray":[B
    const/4 v2, 0x0

    invoke-static {p0, p1, v1, v2, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 7965
    return-object v1
.end method

.method public static subarray([CII)[C
    .locals 3
    .param p0, "array"    # [C
    .param p1, "startIndexInclusive"    # I
    .param p2, "endIndexExclusive"    # I

    .line 7990
    if-nez p0, :cond_0

    .line 7991
    const/4 v0, 0x0

    return-object v0

    .line 7993
    :cond_0
    if-gez p1, :cond_1

    .line 7994
    const/4 p1, 0x0

    .line 7996
    :cond_1
    array-length v0, p0

    if-le p2, v0, :cond_2

    .line 7997
    array-length p2, p0

    .line 7999
    :cond_2
    sub-int v0, p2, p1

    .line 8000
    .local v0, "newSize":I
    if-gtz v0, :cond_3

    .line 8001
    sget-object v1, Lorg/apache/commons/lang3/ArrayUtils;->EMPTY_CHAR_ARRAY:[C

    return-object v1

    .line 8004
    :cond_3
    new-array v1, v0, [C

    .line 8005
    .local v1, "subarray":[C
    const/4 v2, 0x0

    invoke-static {p0, p1, v1, v2, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 8006
    return-object v1
.end method

.method public static subarray([DII)[D
    .locals 3
    .param p0, "array"    # [D
    .param p1, "startIndexInclusive"    # I
    .param p2, "endIndexExclusive"    # I

    .line 8031
    if-nez p0, :cond_0

    .line 8032
    const/4 v0, 0x0

    return-object v0

    .line 8034
    :cond_0
    if-gez p1, :cond_1

    .line 8035
    const/4 p1, 0x0

    .line 8037
    :cond_1
    array-length v0, p0

    if-le p2, v0, :cond_2

    .line 8038
    array-length p2, p0

    .line 8040
    :cond_2
    sub-int v0, p2, p1

    .line 8041
    .local v0, "newSize":I
    if-gtz v0, :cond_3

    .line 8042
    sget-object v1, Lorg/apache/commons/lang3/ArrayUtils;->EMPTY_DOUBLE_ARRAY:[D

    return-object v1

    .line 8045
    :cond_3
    new-array v1, v0, [D

    .line 8046
    .local v1, "subarray":[D
    const/4 v2, 0x0

    invoke-static {p0, p1, v1, v2, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 8047
    return-object v1
.end method

.method public static subarray([FII)[F
    .locals 3
    .param p0, "array"    # [F
    .param p1, "startIndexInclusive"    # I
    .param p2, "endIndexExclusive"    # I

    .line 8072
    if-nez p0, :cond_0

    .line 8073
    const/4 v0, 0x0

    return-object v0

    .line 8075
    :cond_0
    if-gez p1, :cond_1

    .line 8076
    const/4 p1, 0x0

    .line 8078
    :cond_1
    array-length v0, p0

    if-le p2, v0, :cond_2

    .line 8079
    array-length p2, p0

    .line 8081
    :cond_2
    sub-int v0, p2, p1

    .line 8082
    .local v0, "newSize":I
    if-gtz v0, :cond_3

    .line 8083
    sget-object v1, Lorg/apache/commons/lang3/ArrayUtils;->EMPTY_FLOAT_ARRAY:[F

    return-object v1

    .line 8086
    :cond_3
    new-array v1, v0, [F

    .line 8087
    .local v1, "subarray":[F
    const/4 v2, 0x0

    invoke-static {p0, p1, v1, v2, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 8088
    return-object v1
.end method

.method public static subarray([III)[I
    .locals 3
    .param p0, "array"    # [I
    .param p1, "startIndexInclusive"    # I
    .param p2, "endIndexExclusive"    # I

    .line 8113
    if-nez p0, :cond_0

    .line 8114
    const/4 v0, 0x0

    return-object v0

    .line 8116
    :cond_0
    if-gez p1, :cond_1

    .line 8117
    const/4 p1, 0x0

    .line 8119
    :cond_1
    array-length v0, p0

    if-le p2, v0, :cond_2

    .line 8120
    array-length p2, p0

    .line 8122
    :cond_2
    sub-int v0, p2, p1

    .line 8123
    .local v0, "newSize":I
    if-gtz v0, :cond_3

    .line 8124
    sget-object v1, Lorg/apache/commons/lang3/ArrayUtils;->EMPTY_INT_ARRAY:[I

    return-object v1

    .line 8127
    :cond_3
    new-array v1, v0, [I

    .line 8128
    .local v1, "subarray":[I
    const/4 v2, 0x0

    invoke-static {p0, p1, v1, v2, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 8129
    return-object v1
.end method

.method public static subarray([JII)[J
    .locals 3
    .param p0, "array"    # [J
    .param p1, "startIndexInclusive"    # I
    .param p2, "endIndexExclusive"    # I

    .line 8154
    if-nez p0, :cond_0

    .line 8155
    const/4 v0, 0x0

    return-object v0

    .line 8157
    :cond_0
    if-gez p1, :cond_1

    .line 8158
    const/4 p1, 0x0

    .line 8160
    :cond_1
    array-length v0, p0

    if-le p2, v0, :cond_2

    .line 8161
    array-length p2, p0

    .line 8163
    :cond_2
    sub-int v0, p2, p1

    .line 8164
    .local v0, "newSize":I
    if-gtz v0, :cond_3

    .line 8165
    sget-object v1, Lorg/apache/commons/lang3/ArrayUtils;->EMPTY_LONG_ARRAY:[J

    return-object v1

    .line 8168
    :cond_3
    new-array v1, v0, [J

    .line 8169
    .local v1, "subarray":[J
    const/4 v2, 0x0

    invoke-static {p0, p1, v1, v2, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 8170
    return-object v1
.end method

.method public static subarray([Ljava/lang/Object;II)[Ljava/lang/Object;
    .locals 4
    .param p1, "startIndexInclusive"    # I
    .param p2, "endIndexExclusive"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">([TT;II)[TT;"
        }
    .end annotation

    .line 8245
    .local p0, "array":[Ljava/lang/Object;, "[TT;"
    if-nez p0, :cond_0

    .line 8246
    const/4 v0, 0x0

    return-object v0

    .line 8248
    :cond_0
    if-gez p1, :cond_1

    .line 8249
    const/4 p1, 0x0

    .line 8251
    :cond_1
    array-length v0, p0

    if-le p2, v0, :cond_2

    .line 8252
    array-length p2, p0

    .line 8254
    :cond_2
    sub-int v0, p2, p1

    .line 8255
    .local v0, "newSize":I
    invoke-static {p0}, Lorg/apache/commons/lang3/ArrayUtils;->getComponentType([Ljava/lang/Object;)Ljava/lang/Class;

    move-result-object v1

    .line 8256
    .local v1, "type":Ljava/lang/Class;, "Ljava/lang/Class<TT;>;"
    const/4 v2, 0x0

    if-gtz v0, :cond_3

    .line 8257
    invoke-static {v1, v2}, Lorg/apache/commons/lang3/ArrayUtils;->newInstance(Ljava/lang/Class;I)[Ljava/lang/Object;

    move-result-object v2

    return-object v2

    .line 8259
    :cond_3
    invoke-static {v1, v0}, Lorg/apache/commons/lang3/ArrayUtils;->newInstance(Ljava/lang/Class;I)[Ljava/lang/Object;

    move-result-object v3

    .line 8260
    .local v3, "subarray":[Ljava/lang/Object;, "[TT;"
    invoke-static {p0, p1, v3, v2, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 8261
    return-object v3
.end method

.method public static subarray([SII)[S
    .locals 3
    .param p0, "array"    # [S
    .param p1, "startIndexInclusive"    # I
    .param p2, "endIndexExclusive"    # I

    .line 8195
    if-nez p0, :cond_0

    .line 8196
    const/4 v0, 0x0

    return-object v0

    .line 8198
    :cond_0
    if-gez p1, :cond_1

    .line 8199
    const/4 p1, 0x0

    .line 8201
    :cond_1
    array-length v0, p0

    if-le p2, v0, :cond_2

    .line 8202
    array-length p2, p0

    .line 8204
    :cond_2
    sub-int v0, p2, p1

    .line 8205
    .local v0, "newSize":I
    if-gtz v0, :cond_3

    .line 8206
    sget-object v1, Lorg/apache/commons/lang3/ArrayUtils;->EMPTY_SHORT_ARRAY:[S

    return-object v1

    .line 8209
    :cond_3
    new-array v1, v0, [S

    .line 8210
    .local v1, "subarray":[S
    const/4 v2, 0x0

    invoke-static {p0, p1, v1, v2, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 8211
    return-object v1
.end method

.method public static subarray([ZII)[Z
    .locals 3
    .param p0, "array"    # [Z
    .param p1, "startIndexInclusive"    # I
    .param p2, "endIndexExclusive"    # I

    .line 7908
    if-nez p0, :cond_0

    .line 7909
    const/4 v0, 0x0

    return-object v0

    .line 7911
    :cond_0
    if-gez p1, :cond_1

    .line 7912
    const/4 p1, 0x0

    .line 7914
    :cond_1
    array-length v0, p0

    if-le p2, v0, :cond_2

    .line 7915
    array-length p2, p0

    .line 7917
    :cond_2
    sub-int v0, p2, p1

    .line 7918
    .local v0, "newSize":I
    if-gtz v0, :cond_3

    .line 7919
    sget-object v1, Lorg/apache/commons/lang3/ArrayUtils;->EMPTY_BOOLEAN_ARRAY:[Z

    return-object v1

    .line 7922
    :cond_3
    new-array v1, v0, [Z

    .line 7923
    .local v1, "subarray":[Z
    const/4 v2, 0x0

    invoke-static {p0, p1, v1, v2, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 7924
    return-object v1
.end method

.method public static swap([BII)V
    .locals 1
    .param p0, "array"    # [B
    .param p1, "offset1"    # I
    .param p2, "offset2"    # I

    .line 8354
    const/4 v0, 0x1

    invoke-static {p0, p1, p2, v0}, Lorg/apache/commons/lang3/ArrayUtils;->swap([BIII)V

    .line 8355
    return-void
.end method

.method public static swap([BIII)V
    .locals 3
    .param p0, "array"    # [B
    .param p1, "offset1"    # I
    .param p2, "offset2"    # I
    .param p3, "len"    # I

    .line 8382
    invoke-static {p0}, Lorg/apache/commons/lang3/ArrayUtils;->isEmpty([B)Z

    move-result v0

    if-nez v0, :cond_4

    array-length v0, p0

    if-ge p1, v0, :cond_4

    array-length v0, p0

    if-lt p2, v0, :cond_0

    goto :goto_1

    .line 8385
    :cond_0
    if-gez p1, :cond_1

    .line 8386
    const/4 p1, 0x0

    .line 8388
    :cond_1
    if-gez p2, :cond_2

    .line 8389
    const/4 p2, 0x0

    .line 8391
    :cond_2
    array-length v0, p0

    sub-int/2addr v0, p1

    invoke-static {p3, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    array-length v1, p0

    sub-int/2addr v1, p2

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result p3

    .line 8392
    const/4 v0, 0x0

    .local v0, "i":I
    :goto_0
    if-ge v0, p3, :cond_3

    .line 8393
    aget-byte v1, p0, p1

    .line 8394
    .local v1, "aux":B
    aget-byte v2, p0, p2

    aput-byte v2, p0, p1

    .line 8395
    aput-byte v1, p0, p2

    .line 8392
    .end local v1    # "aux":B
    add-int/lit8 v0, v0, 0x1

    add-int/lit8 p1, p1, 0x1

    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    .line 8397
    .end local v0    # "i":I
    :cond_3
    return-void

    .line 8383
    :cond_4
    :goto_1
    return-void
.end method

.method public static swap([CII)V
    .locals 1
    .param p0, "array"    # [C
    .param p1, "offset1"    # I
    .param p2, "offset2"    # I

    .line 8421
    const/4 v0, 0x1

    invoke-static {p0, p1, p2, v0}, Lorg/apache/commons/lang3/ArrayUtils;->swap([CIII)V

    .line 8422
    return-void
.end method

.method public static swap([CIII)V
    .locals 3
    .param p0, "array"    # [C
    .param p1, "offset1"    # I
    .param p2, "offset2"    # I
    .param p3, "len"    # I

    .line 8449
    invoke-static {p0}, Lorg/apache/commons/lang3/ArrayUtils;->isEmpty([C)Z

    move-result v0

    if-nez v0, :cond_4

    array-length v0, p0

    if-ge p1, v0, :cond_4

    array-length v0, p0

    if-lt p2, v0, :cond_0

    goto :goto_1

    .line 8452
    :cond_0
    if-gez p1, :cond_1

    .line 8453
    const/4 p1, 0x0

    .line 8455
    :cond_1
    if-gez p2, :cond_2

    .line 8456
    const/4 p2, 0x0

    .line 8458
    :cond_2
    array-length v0, p0

    sub-int/2addr v0, p1

    invoke-static {p3, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    array-length v1, p0

    sub-int/2addr v1, p2

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result p3

    .line 8459
    const/4 v0, 0x0

    .local v0, "i":I
    :goto_0
    if-ge v0, p3, :cond_3

    .line 8460
    aget-char v1, p0, p1

    .line 8461
    .local v1, "aux":C
    aget-char v2, p0, p2

    aput-char v2, p0, p1

    .line 8462
    aput-char v1, p0, p2

    .line 8459
    .end local v1    # "aux":C
    add-int/lit8 v0, v0, 0x1

    add-int/lit8 p1, p1, 0x1

    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    .line 8464
    .end local v0    # "i":I
    :cond_3
    return-void

    .line 8450
    :cond_4
    :goto_1
    return-void
.end method

.method public static swap([DII)V
    .locals 1
    .param p0, "array"    # [D
    .param p1, "offset1"    # I
    .param p2, "offset2"    # I

    .line 8488
    const/4 v0, 0x1

    invoke-static {p0, p1, p2, v0}, Lorg/apache/commons/lang3/ArrayUtils;->swap([DIII)V

    .line 8489
    return-void
.end method

.method public static swap([DIII)V
    .locals 5
    .param p0, "array"    # [D
    .param p1, "offset1"    # I
    .param p2, "offset2"    # I
    .param p3, "len"    # I

    .line 8516
    invoke-static {p0}, Lorg/apache/commons/lang3/ArrayUtils;->isEmpty([D)Z

    move-result v0

    if-nez v0, :cond_4

    array-length v0, p0

    if-ge p1, v0, :cond_4

    array-length v0, p0

    if-lt p2, v0, :cond_0

    goto :goto_1

    .line 8519
    :cond_0
    if-gez p1, :cond_1

    .line 8520
    const/4 p1, 0x0

    .line 8522
    :cond_1
    if-gez p2, :cond_2

    .line 8523
    const/4 p2, 0x0

    .line 8525
    :cond_2
    array-length v0, p0

    sub-int/2addr v0, p1

    invoke-static {p3, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    array-length v1, p0

    sub-int/2addr v1, p2

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result p3

    .line 8526
    const/4 v0, 0x0

    .local v0, "i":I
    :goto_0
    if-ge v0, p3, :cond_3

    .line 8527
    aget-wide v1, p0, p1

    .line 8528
    .local v1, "aux":D
    aget-wide v3, p0, p2

    aput-wide v3, p0, p1

    .line 8529
    aput-wide v1, p0, p2

    .line 8526
    .end local v1    # "aux":D
    add-int/lit8 v0, v0, 0x1

    add-int/lit8 p1, p1, 0x1

    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    .line 8531
    .end local v0    # "i":I
    :cond_3
    return-void

    .line 8517
    :cond_4
    :goto_1
    return-void
.end method

.method public static swap([FII)V
    .locals 1
    .param p0, "array"    # [F
    .param p1, "offset1"    # I
    .param p2, "offset2"    # I

    .line 8555
    const/4 v0, 0x1

    invoke-static {p0, p1, p2, v0}, Lorg/apache/commons/lang3/ArrayUtils;->swap([FIII)V

    .line 8556
    return-void
.end method

.method public static swap([FIII)V
    .locals 3
    .param p0, "array"    # [F
    .param p1, "offset1"    # I
    .param p2, "offset2"    # I
    .param p3, "len"    # I

    .line 8583
    invoke-static {p0}, Lorg/apache/commons/lang3/ArrayUtils;->isEmpty([F)Z

    move-result v0

    if-nez v0, :cond_4

    array-length v0, p0

    if-ge p1, v0, :cond_4

    array-length v0, p0

    if-lt p2, v0, :cond_0

    goto :goto_1

    .line 8586
    :cond_0
    if-gez p1, :cond_1

    .line 8587
    const/4 p1, 0x0

    .line 8589
    :cond_1
    if-gez p2, :cond_2

    .line 8590
    const/4 p2, 0x0

    .line 8592
    :cond_2
    array-length v0, p0

    sub-int/2addr v0, p1

    invoke-static {p3, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    array-length v1, p0

    sub-int/2addr v1, p2

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result p3

    .line 8593
    const/4 v0, 0x0

    .local v0, "i":I
    :goto_0
    if-ge v0, p3, :cond_3

    .line 8594
    aget v1, p0, p1

    .line 8595
    .local v1, "aux":F
    aget v2, p0, p2

    aput v2, p0, p1

    .line 8596
    aput v1, p0, p2

    .line 8593
    .end local v1    # "aux":F
    add-int/lit8 v0, v0, 0x1

    add-int/lit8 p1, p1, 0x1

    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    .line 8599
    .end local v0    # "i":I
    :cond_3
    return-void

    .line 8584
    :cond_4
    :goto_1
    return-void
.end method

.method public static swap([III)V
    .locals 1
    .param p0, "array"    # [I
    .param p1, "offset1"    # I
    .param p2, "offset2"    # I

    .line 8623
    const/4 v0, 0x1

    invoke-static {p0, p1, p2, v0}, Lorg/apache/commons/lang3/ArrayUtils;->swap([IIII)V

    .line 8624
    return-void
.end method

.method public static swap([IIII)V
    .locals 3
    .param p0, "array"    # [I
    .param p1, "offset1"    # I
    .param p2, "offset2"    # I
    .param p3, "len"    # I

    .line 8651
    invoke-static {p0}, Lorg/apache/commons/lang3/ArrayUtils;->isEmpty([I)Z

    move-result v0

    if-nez v0, :cond_4

    array-length v0, p0

    if-ge p1, v0, :cond_4

    array-length v0, p0

    if-lt p2, v0, :cond_0

    goto :goto_1

    .line 8654
    :cond_0
    if-gez p1, :cond_1

    .line 8655
    const/4 p1, 0x0

    .line 8657
    :cond_1
    if-gez p2, :cond_2

    .line 8658
    const/4 p2, 0x0

    .line 8660
    :cond_2
    array-length v0, p0

    sub-int/2addr v0, p1

    invoke-static {p3, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    array-length v1, p0

    sub-int/2addr v1, p2

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result p3

    .line 8661
    const/4 v0, 0x0

    .local v0, "i":I
    :goto_0
    if-ge v0, p3, :cond_3

    .line 8662
    aget v1, p0, p1

    .line 8663
    .local v1, "aux":I
    aget v2, p0, p2

    aput v2, p0, p1

    .line 8664
    aput v1, p0, p2

    .line 8661
    .end local v1    # "aux":I
    add-int/lit8 v0, v0, 0x1

    add-int/lit8 p1, p1, 0x1

    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    .line 8666
    .end local v0    # "i":I
    :cond_3
    return-void

    .line 8652
    :cond_4
    :goto_1
    return-void
.end method

.method public static swap([JII)V
    .locals 1
    .param p0, "array"    # [J
    .param p1, "offset1"    # I
    .param p2, "offset2"    # I

    .line 8690
    const/4 v0, 0x1

    invoke-static {p0, p1, p2, v0}, Lorg/apache/commons/lang3/ArrayUtils;->swap([JIII)V

    .line 8691
    return-void
.end method

.method public static swap([JIII)V
    .locals 5
    .param p0, "array"    # [J
    .param p1, "offset1"    # I
    .param p2, "offset2"    # I
    .param p3, "len"    # I

    .line 8718
    invoke-static {p0}, Lorg/apache/commons/lang3/ArrayUtils;->isEmpty([J)Z

    move-result v0

    if-nez v0, :cond_4

    array-length v0, p0

    if-ge p1, v0, :cond_4

    array-length v0, p0

    if-lt p2, v0, :cond_0

    goto :goto_1

    .line 8721
    :cond_0
    if-gez p1, :cond_1

    .line 8722
    const/4 p1, 0x0

    .line 8724
    :cond_1
    if-gez p2, :cond_2

    .line 8725
    const/4 p2, 0x0

    .line 8727
    :cond_2
    array-length v0, p0

    sub-int/2addr v0, p1

    invoke-static {p3, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    array-length v1, p0

    sub-int/2addr v1, p2

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result p3

    .line 8728
    const/4 v0, 0x0

    .local v0, "i":I
    :goto_0
    if-ge v0, p3, :cond_3

    .line 8729
    aget-wide v1, p0, p1

    .line 8730
    .local v1, "aux":J
    aget-wide v3, p0, p2

    aput-wide v3, p0, p1

    .line 8731
    aput-wide v1, p0, p2

    .line 8728
    .end local v1    # "aux":J
    add-int/lit8 v0, v0, 0x1

    add-int/lit8 p1, p1, 0x1

    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    .line 8733
    .end local v0    # "i":I
    :cond_3
    return-void

    .line 8719
    :cond_4
    :goto_1
    return-void
.end method

.method public static swap([Ljava/lang/Object;II)V
    .locals 1
    .param p0, "array"    # [Ljava/lang/Object;
    .param p1, "offset1"    # I
    .param p2, "offset2"    # I

    .line 8757
    const/4 v0, 0x1

    invoke-static {p0, p1, p2, v0}, Lorg/apache/commons/lang3/ArrayUtils;->swap([Ljava/lang/Object;III)V

    .line 8758
    return-void
.end method

.method public static swap([Ljava/lang/Object;III)V
    .locals 3
    .param p0, "array"    # [Ljava/lang/Object;
    .param p1, "offset1"    # I
    .param p2, "offset2"    # I
    .param p3, "len"    # I

    .line 8785
    invoke-static {p0}, Lorg/apache/commons/lang3/ArrayUtils;->isEmpty([Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    array-length v0, p0

    if-ge p1, v0, :cond_4

    array-length v0, p0

    if-lt p2, v0, :cond_0

    goto :goto_1

    .line 8788
    :cond_0
    if-gez p1, :cond_1

    .line 8789
    const/4 p1, 0x0

    .line 8791
    :cond_1
    if-gez p2, :cond_2

    .line 8792
    const/4 p2, 0x0

    .line 8794
    :cond_2
    array-length v0, p0

    sub-int/2addr v0, p1

    invoke-static {p3, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    array-length v1, p0

    sub-int/2addr v1, p2

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result p3

    .line 8795
    const/4 v0, 0x0

    .local v0, "i":I
    :goto_0
    if-ge v0, p3, :cond_3

    .line 8796
    aget-object v1, p0, p1

    .line 8797
    .local v1, "aux":Ljava/lang/Object;
    aget-object v2, p0, p2

    aput-object v2, p0, p1

    .line 8798
    aput-object v1, p0, p2

    .line 8795
    .end local v1    # "aux":Ljava/lang/Object;
    add-int/lit8 v0, v0, 0x1

    add-int/lit8 p1, p1, 0x1

    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    .line 8800
    .end local v0    # "i":I
    :cond_3
    return-void

    .line 8786
    :cond_4
    :goto_1
    return-void
.end method

.method public static swap([SII)V
    .locals 1
    .param p0, "array"    # [S
    .param p1, "offset1"    # I
    .param p2, "offset2"    # I

    .line 8824
    const/4 v0, 0x1

    invoke-static {p0, p1, p2, v0}, Lorg/apache/commons/lang3/ArrayUtils;->swap([SIII)V

    .line 8825
    return-void
.end method

.method public static swap([SIII)V
    .locals 3
    .param p0, "array"    # [S
    .param p1, "offset1"    # I
    .param p2, "offset2"    # I
    .param p3, "len"    # I

    .line 8852
    invoke-static {p0}, Lorg/apache/commons/lang3/ArrayUtils;->isEmpty([S)Z

    move-result v0

    if-nez v0, :cond_5

    array-length v0, p0

    if-ge p1, v0, :cond_5

    array-length v0, p0

    if-lt p2, v0, :cond_0

    goto :goto_1

    .line 8855
    :cond_0
    if-gez p1, :cond_1

    .line 8856
    const/4 p1, 0x0

    .line 8858
    :cond_1
    if-gez p2, :cond_2

    .line 8859
    const/4 p2, 0x0

    .line 8861
    :cond_2
    if-ne p1, p2, :cond_3

    .line 8862
    return-void

    .line 8864
    :cond_3
    array-length v0, p0

    sub-int/2addr v0, p1

    invoke-static {p3, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    array-length v1, p0

    sub-int/2addr v1, p2

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result p3

    .line 8865
    const/4 v0, 0x0

    .local v0, "i":I
    :goto_0
    if-ge v0, p3, :cond_4

    .line 8866
    aget-short v1, p0, p1

    .line 8867
    .local v1, "aux":S
    aget-short v2, p0, p2

    aput-short v2, p0, p1

    .line 8868
    aput-short v1, p0, p2

    .line 8865
    .end local v1    # "aux":S
    add-int/lit8 v0, v0, 0x1

    add-int/lit8 p1, p1, 0x1

    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    .line 8870
    .end local v0    # "i":I
    :cond_4
    return-void

    .line 8853
    :cond_5
    :goto_1
    return-void
.end method

.method public static swap([ZII)V
    .locals 1
    .param p0, "array"    # [Z
    .param p1, "offset1"    # I
    .param p2, "offset2"    # I

    .line 8286
    const/4 v0, 0x1

    invoke-static {p0, p1, p2, v0}, Lorg/apache/commons/lang3/ArrayUtils;->swap([ZIII)V

    .line 8287
    return-void
.end method

.method public static swap([ZIII)V
    .locals 3
    .param p0, "array"    # [Z
    .param p1, "offset1"    # I
    .param p2, "offset2"    # I
    .param p3, "len"    # I

    .line 8315
    invoke-static {p0}, Lorg/apache/commons/lang3/ArrayUtils;->isEmpty([Z)Z

    move-result v0

    if-nez v0, :cond_4

    array-length v0, p0

    if-ge p1, v0, :cond_4

    array-length v0, p0

    if-lt p2, v0, :cond_0

    goto :goto_1

    .line 8318
    :cond_0
    if-gez p1, :cond_1

    .line 8319
    const/4 p1, 0x0

    .line 8321
    :cond_1
    if-gez p2, :cond_2

    .line 8322
    const/4 p2, 0x0

    .line 8324
    :cond_2
    array-length v0, p0

    sub-int/2addr v0, p1

    invoke-static {p3, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    array-length v1, p0

    sub-int/2addr v1, p2

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result p3

    .line 8325
    const/4 v0, 0x0

    .local v0, "i":I
    :goto_0
    if-ge v0, p3, :cond_3

    .line 8326
    aget-boolean v1, p0, p1

    .line 8327
    .local v1, "aux":Z
    aget-boolean v2, p0, p2

    aput-boolean v2, p0, p1

    .line 8328
    aput-boolean v1, p0, p2

    .line 8325
    .end local v1    # "aux":Z
    add-int/lit8 v0, v0, 0x1

    add-int/lit8 p1, p1, 0x1

    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    .line 8330
    .end local v0    # "i":I
    :cond_3
    return-void

    .line 8316
    :cond_4
    :goto_1
    return-void
.end method

.method public static varargs toArray([Ljava/lang/Object;)[Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">([TT;)[TT;"
        }
    .end annotation

    .line 8912
    .local p0, "items":[Ljava/lang/Object;, "[TT;"
    return-object p0
.end method

.method public static toMap([Ljava/lang/Object;)Ljava/util/Map;
    .locals 8
    .param p0, "array"    # [Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Ljava/lang/Object;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/Object;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 8943
    if-nez p0, :cond_0

    .line 8944
    const/4 v0, 0x0

    return-object v0

    .line 8946
    :cond_0
    new-instance v0, Ljava/util/HashMap;

    array-length v1, p0

    int-to-double v1, v1

    const-wide/high16 v3, 0x3ff8000000000000L    # 1.5

    mul-double/2addr v1, v3

    double-to-int v1, v1

    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(I)V

    .line 8947
    .local v0, "map":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/Object;Ljava/lang/Object;>;"
    const/4 v1, 0x0

    .local v1, "i":I
    :goto_0
    array-length v2, p0

    if-ge v1, v2, :cond_4

    .line 8948
    aget-object v2, p0, v1

    .line 8949
    .local v2, "object":Ljava/lang/Object;
    instance-of v3, v2, Ljava/util/Map$Entry;

    if-eqz v3, :cond_1

    .line 8950
    move-object v3, v2

    check-cast v3, Ljava/util/Map$Entry;

    .line 8951
    .local v3, "entry":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<**>;"
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v5

    invoke-interface {v0, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 8952
    .end local v3    # "entry":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<**>;"
    goto :goto_1

    :cond_1
    instance-of v3, v2, [Ljava/lang/Object;

    const-string v4, ", \'"

    const-string v5, "Array element "

    if-eqz v3, :cond_3

    .line 8953
    move-object v3, v2

    check-cast v3, [Ljava/lang/Object;

    .line 8954
    .local v3, "entry":[Ljava/lang/Object;
    array-length v6, v3

    const/4 v7, 0x2

    if-lt v6, v7, :cond_2

    .line 8959
    const/4 v4, 0x0

    aget-object v4, v3, v4

    const/4 v5, 0x1

    aget-object v5, v3, v5

    invoke-interface {v0, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 8960
    .end local v3    # "entry":[Ljava/lang/Object;
    nop

    .line 8947
    .end local v2    # "object":Ljava/lang/Object;
    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 8955
    .restart local v2    # "object":Ljava/lang/Object;
    .restart local v3    # "entry":[Ljava/lang/Object;
    :cond_2
    new-instance v6, Ljava/lang/IllegalArgumentException;

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, "\', has a length less than 2"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v6, v4}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v6

    .line 8961
    .end local v3    # "entry":[Ljava/lang/Object;
    :cond_3
    new-instance v3, Ljava/lang/IllegalArgumentException;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, "\', is neither of type Map.Entry nor an Array"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, v4}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v3

    .line 8966
    .end local v1    # "i":I
    .end local v2    # "object":Ljava/lang/Object;
    :cond_4
    return-object v0
.end method

.method public static toObject([Z)[Ljava/lang/Boolean;
    .locals 2
    .param p0, "array"    # [Z

    .line 8978
    if-nez p0, :cond_0

    .line 8979
    const/4 v0, 0x0

    return-object v0

    .line 8981
    :cond_0
    array-length v0, p0

    if-nez v0, :cond_1

    .line 8982
    sget-object v0, Lorg/apache/commons/lang3/ArrayUtils;->EMPTY_BOOLEAN_OBJECT_ARRAY:[Ljava/lang/Boolean;

    return-object v0

    .line 8984
    :cond_1
    array-length v0, p0

    new-array v0, v0, [Ljava/lang/Boolean;

    .line 8985
    .local v0, "result":[Ljava/lang/Boolean;
    new-instance v1, Lorg/apache/commons/lang3/ArrayUtils$$ExternalSyntheticLambda7;

    invoke-direct {v1, p0}, Lorg/apache/commons/lang3/ArrayUtils$$ExternalSyntheticLambda7;-><init>([Z)V

    invoke-static {v0, v1}, Lorg/apache/commons/lang3/ArrayUtils;->setAll([Ljava/lang/Object;Ljava/util/function/IntFunction;)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Ljava/lang/Boolean;

    return-object v1
.end method

.method public static toObject([B)[Ljava/lang/Byte;
    .locals 2
    .param p0, "array"    # [B

    .line 8997
    if-nez p0, :cond_0

    .line 8998
    const/4 v0, 0x0

    return-object v0

    .line 9000
    :cond_0
    array-length v0, p0

    if-nez v0, :cond_1

    .line 9001
    sget-object v0, Lorg/apache/commons/lang3/ArrayUtils;->EMPTY_BYTE_OBJECT_ARRAY:[Ljava/lang/Byte;

    return-object v0

    .line 9003
    :cond_1
    array-length v0, p0

    new-array v0, v0, [Ljava/lang/Byte;

    new-instance v1, Lorg/apache/commons/lang3/ArrayUtils$$ExternalSyntheticLambda3;

    invoke-direct {v1, p0}, Lorg/apache/commons/lang3/ArrayUtils$$ExternalSyntheticLambda3;-><init>([B)V

    invoke-static {v0, v1}, Lorg/apache/commons/lang3/ArrayUtils;->setAll([Ljava/lang/Object;Ljava/util/function/IntFunction;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/Byte;

    return-object v0
.end method

.method public static toObject([C)[Ljava/lang/Character;
    .locals 2
    .param p0, "array"    # [C

    .line 9015
    if-nez p0, :cond_0

    .line 9016
    const/4 v0, 0x0

    return-object v0

    .line 9018
    :cond_0
    array-length v0, p0

    if-nez v0, :cond_1

    .line 9019
    sget-object v0, Lorg/apache/commons/lang3/ArrayUtils;->EMPTY_CHARACTER_OBJECT_ARRAY:[Ljava/lang/Character;

    return-object v0

    .line 9021
    :cond_1
    array-length v0, p0

    new-array v0, v0, [Ljava/lang/Character;

    new-instance v1, Lorg/apache/commons/lang3/ArrayUtils$$ExternalSyntheticLambda5;

    invoke-direct {v1, p0}, Lorg/apache/commons/lang3/ArrayUtils$$ExternalSyntheticLambda5;-><init>([C)V

    invoke-static {v0, v1}, Lorg/apache/commons/lang3/ArrayUtils;->setAll([Ljava/lang/Object;Ljava/util/function/IntFunction;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/Character;

    return-object v0
.end method

.method public static toObject([D)[Ljava/lang/Double;
    .locals 2
    .param p0, "array"    # [D

    .line 9033
    if-nez p0, :cond_0

    .line 9034
    const/4 v0, 0x0

    return-object v0

    .line 9036
    :cond_0
    array-length v0, p0

    if-nez v0, :cond_1

    .line 9037
    sget-object v0, Lorg/apache/commons/lang3/ArrayUtils;->EMPTY_DOUBLE_OBJECT_ARRAY:[Ljava/lang/Double;

    return-object v0

    .line 9039
    :cond_1
    array-length v0, p0

    new-array v0, v0, [Ljava/lang/Double;

    new-instance v1, Lorg/apache/commons/lang3/ArrayUtils$$ExternalSyntheticLambda8;

    invoke-direct {v1, p0}, Lorg/apache/commons/lang3/ArrayUtils$$ExternalSyntheticLambda8;-><init>([D)V

    invoke-static {v0, v1}, Lorg/apache/commons/lang3/ArrayUtils;->setAll([Ljava/lang/Object;Ljava/util/function/IntFunction;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/Double;

    return-object v0
.end method

.method public static toObject([F)[Ljava/lang/Float;
    .locals 2
    .param p0, "array"    # [F

    .line 9051
    if-nez p0, :cond_0

    .line 9052
    const/4 v0, 0x0

    return-object v0

    .line 9054
    :cond_0
    array-length v0, p0

    if-nez v0, :cond_1

    .line 9055
    sget-object v0, Lorg/apache/commons/lang3/ArrayUtils;->EMPTY_FLOAT_OBJECT_ARRAY:[Ljava/lang/Float;

    return-object v0

    .line 9057
    :cond_1
    array-length v0, p0

    new-array v0, v0, [Ljava/lang/Float;

    new-instance v1, Lorg/apache/commons/lang3/ArrayUtils$$ExternalSyntheticLambda4;

    invoke-direct {v1, p0}, Lorg/apache/commons/lang3/ArrayUtils$$ExternalSyntheticLambda4;-><init>([F)V

    invoke-static {v0, v1}, Lorg/apache/commons/lang3/ArrayUtils;->setAll([Ljava/lang/Object;Ljava/util/function/IntFunction;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/Float;

    return-object v0
.end method

.method public static toObject([I)[Ljava/lang/Integer;
    .locals 2
    .param p0, "array"    # [I

    .line 9069
    if-nez p0, :cond_0

    .line 9070
    const/4 v0, 0x0

    return-object v0

    .line 9072
    :cond_0
    array-length v0, p0

    if-nez v0, :cond_1

    .line 9073
    sget-object v0, Lorg/apache/commons/lang3/ArrayUtils;->EMPTY_INTEGER_OBJECT_ARRAY:[Ljava/lang/Integer;

    return-object v0

    .line 9075
    :cond_1
    array-length v0, p0

    new-array v0, v0, [Ljava/lang/Integer;

    new-instance v1, Lorg/apache/commons/lang3/ArrayUtils$$ExternalSyntheticLambda6;

    invoke-direct {v1, p0}, Lorg/apache/commons/lang3/ArrayUtils$$ExternalSyntheticLambda6;-><init>([I)V

    invoke-static {v0, v1}, Lorg/apache/commons/lang3/ArrayUtils;->setAll([Ljava/lang/Object;Ljava/util/function/IntFunction;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/Integer;

    return-object v0
.end method

.method public static toObject([J)[Ljava/lang/Long;
    .locals 2
    .param p0, "array"    # [J

    .line 9087
    if-nez p0, :cond_0

    .line 9088
    const/4 v0, 0x0

    return-object v0

    .line 9090
    :cond_0
    array-length v0, p0

    if-nez v0, :cond_1

    .line 9091
    sget-object v0, Lorg/apache/commons/lang3/ArrayUtils;->EMPTY_LONG_OBJECT_ARRAY:[Ljava/lang/Long;

    return-object v0

    .line 9093
    :cond_1
    array-length v0, p0

    new-array v0, v0, [Ljava/lang/Long;

    new-instance v1, Lorg/apache/commons/lang3/ArrayUtils$$ExternalSyntheticLambda1;

    invoke-direct {v1, p0}, Lorg/apache/commons/lang3/ArrayUtils$$ExternalSyntheticLambda1;-><init>([J)V

    invoke-static {v0, v1}, Lorg/apache/commons/lang3/ArrayUtils;->setAll([Ljava/lang/Object;Ljava/util/function/IntFunction;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/Long;

    return-object v0
.end method

.method public static toObject([S)[Ljava/lang/Short;
    .locals 2
    .param p0, "array"    # [S

    .line 9105
    if-nez p0, :cond_0

    .line 9106
    const/4 v0, 0x0

    return-object v0

    .line 9108
    :cond_0
    array-length v0, p0

    if-nez v0, :cond_1

    .line 9109
    sget-object v0, Lorg/apache/commons/lang3/ArrayUtils;->EMPTY_SHORT_OBJECT_ARRAY:[Ljava/lang/Short;

    return-object v0

    .line 9111
    :cond_1
    array-length v0, p0

    new-array v0, v0, [Ljava/lang/Short;

    new-instance v1, Lorg/apache/commons/lang3/ArrayUtils$$ExternalSyntheticLambda2;

    invoke-direct {v1, p0}, Lorg/apache/commons/lang3/ArrayUtils$$ExternalSyntheticLambda2;-><init>([S)V

    invoke-static {v0, v1}, Lorg/apache/commons/lang3/ArrayUtils;->setAll([Ljava/lang/Object;Ljava/util/function/IntFunction;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/Short;

    return-object v0
.end method

.method public static toPrimitive(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3
    .param p0, "array"    # Ljava/lang/Object;

    .line 9460
    if-nez p0, :cond_0

    .line 9461
    const/4 v0, 0x0

    return-object v0

    .line 9463
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    move-result-object v0

    .line 9464
    .local v0, "ct":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    invoke-static {v0}, Lorg/apache/commons/lang3/ClassUtils;->wrapperToPrimitive(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object v1

    .line 9465
    .local v1, "pt":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    sget-object v2, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    invoke-virtual {v2, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 9466
    move-object v2, p0

    check-cast v2, [Ljava/lang/Boolean;

    invoke-static {v2}, Lorg/apache/commons/lang3/ArrayUtils;->toPrimitive([Ljava/lang/Boolean;)[Z

    move-result-object v2

    return-object v2

    .line 9468
    :cond_1
    sget-object v2, Ljava/lang/Character;->TYPE:Ljava/lang/Class;

    invoke-virtual {v2, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 9469
    move-object v2, p0

    check-cast v2, [Ljava/lang/Character;

    invoke-static {v2}, Lorg/apache/commons/lang3/ArrayUtils;->toPrimitive([Ljava/lang/Character;)[C

    move-result-object v2

    return-object v2

    .line 9471
    :cond_2
    sget-object v2, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    invoke-virtual {v2, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    .line 9472
    move-object v2, p0

    check-cast v2, [Ljava/lang/Byte;

    invoke-static {v2}, Lorg/apache/commons/lang3/ArrayUtils;->toPrimitive([Ljava/lang/Byte;)[B

    move-result-object v2

    return-object v2

    .line 9474
    :cond_3
    sget-object v2, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    invoke-virtual {v2, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    .line 9475
    move-object v2, p0

    check-cast v2, [Ljava/lang/Integer;

    invoke-static {v2}, Lorg/apache/commons/lang3/ArrayUtils;->toPrimitive([Ljava/lang/Integer;)[I

    move-result-object v2

    return-object v2

    .line 9477
    :cond_4
    sget-object v2, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    invoke-virtual {v2, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_5

    .line 9478
    move-object v2, p0

    check-cast v2, [Ljava/lang/Long;

    invoke-static {v2}, Lorg/apache/commons/lang3/ArrayUtils;->toPrimitive([Ljava/lang/Long;)[J

    move-result-object v2

    return-object v2

    .line 9480
    :cond_5
    sget-object v2, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    invoke-virtual {v2, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_6

    .line 9481
    move-object v2, p0

    check-cast v2, [Ljava/lang/Short;

    invoke-static {v2}, Lorg/apache/commons/lang3/ArrayUtils;->toPrimitive([Ljava/lang/Short;)[S

    move-result-object v2

    return-object v2

    .line 9483
    :cond_6
    sget-object v2, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    invoke-virtual {v2, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_7

    .line 9484
    move-object v2, p0

    check-cast v2, [Ljava/lang/Double;

    invoke-static {v2}, Lorg/apache/commons/lang3/ArrayUtils;->toPrimitive([Ljava/lang/Double;)[D

    move-result-object v2

    return-object v2

    .line 9486
    :cond_7
    sget-object v2, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    invoke-virtual {v2, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_8

    .line 9487
    move-object v2, p0

    check-cast v2, [Ljava/lang/Float;

    invoke-static {v2}, Lorg/apache/commons/lang3/ArrayUtils;->toPrimitive([Ljava/lang/Float;)[F

    move-result-object v2

    return-object v2

    .line 9489
    :cond_8
    return-object p0
.end method

.method public static toPrimitive([Ljava/lang/Byte;)[B
    .locals 3
    .param p0, "array"    # [Ljava/lang/Byte;

    .line 9166
    if-nez p0, :cond_0

    .line 9167
    const/4 v0, 0x0

    return-object v0

    .line 9169
    :cond_0
    array-length v0, p0

    if-nez v0, :cond_1

    .line 9170
    sget-object v0, Lorg/apache/commons/lang3/ArrayUtils;->EMPTY_BYTE_ARRAY:[B

    return-object v0

    .line 9172
    :cond_1
    array-length v0, p0

    new-array v0, v0, [B

    .line 9173
    .local v0, "result":[B
    const/4 v1, 0x0

    .local v1, "i":I
    :goto_0
    array-length v2, p0

    if-ge v1, v2, :cond_2

    .line 9174
    aget-object v2, p0, v1

    invoke-virtual {v2}, Ljava/lang/Byte;->byteValue()B

    move-result v2

    aput-byte v2, v0, v1

    .line 9173
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 9176
    .end local v1    # "i":I
    :cond_2
    return-object v0
.end method

.method public static toPrimitive([Ljava/lang/Byte;B)[B
    .locals 4
    .param p0, "array"    # [Ljava/lang/Byte;
    .param p1, "valueForNull"    # B

    .line 9190
    if-nez p0, :cond_0

    .line 9191
    const/4 v0, 0x0

    return-object v0

    .line 9193
    :cond_0
    array-length v0, p0

    if-nez v0, :cond_1

    .line 9194
    sget-object v0, Lorg/apache/commons/lang3/ArrayUtils;->EMPTY_BYTE_ARRAY:[B

    return-object v0

    .line 9196
    :cond_1
    array-length v0, p0

    new-array v0, v0, [B

    .line 9197
    .local v0, "result":[B
    const/4 v1, 0x0

    .local v1, "i":I
    :goto_0
    array-length v2, p0

    if-ge v1, v2, :cond_3

    .line 9198
    aget-object v2, p0, v1

    .line 9199
    .local v2, "b":Ljava/lang/Byte;
    if-nez v2, :cond_2

    move v3, p1

    goto :goto_1

    :cond_2
    invoke-virtual {v2}, Ljava/lang/Byte;->byteValue()B

    move-result v3

    :goto_1
    aput-byte v3, v0, v1

    .line 9197
    .end local v2    # "b":Ljava/lang/Byte;
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 9201
    .end local v1    # "i":I
    :cond_3
    return-object v0
.end method

.method public static toPrimitive([Ljava/lang/Character;)[C
    .locals 3
    .param p0, "array"    # [Ljava/lang/Character;

    .line 9215
    if-nez p0, :cond_0

    .line 9216
    const/4 v0, 0x0

    return-object v0

    .line 9218
    :cond_0
    array-length v0, p0

    if-nez v0, :cond_1

    .line 9219
    sget-object v0, Lorg/apache/commons/lang3/ArrayUtils;->EMPTY_CHAR_ARRAY:[C

    return-object v0

    .line 9221
    :cond_1
    array-length v0, p0

    new-array v0, v0, [C

    .line 9222
    .local v0, "result":[C
    const/4 v1, 0x0

    .local v1, "i":I
    :goto_0
    array-length v2, p0

    if-ge v1, v2, :cond_2

    .line 9223
    aget-object v2, p0, v1

    invoke-virtual {v2}, Ljava/lang/Character;->charValue()C

    move-result v2

    aput-char v2, v0, v1

    .line 9222
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 9225
    .end local v1    # "i":I
    :cond_2
    return-object v0
.end method

.method public static toPrimitive([Ljava/lang/Character;C)[C
    .locals 4
    .param p0, "array"    # [Ljava/lang/Character;
    .param p1, "valueForNull"    # C

    .line 9239
    if-nez p0, :cond_0

    .line 9240
    const/4 v0, 0x0

    return-object v0

    .line 9242
    :cond_0
    array-length v0, p0

    if-nez v0, :cond_1

    .line 9243
    sget-object v0, Lorg/apache/commons/lang3/ArrayUtils;->EMPTY_CHAR_ARRAY:[C

    return-object v0

    .line 9245
    :cond_1
    array-length v0, p0

    new-array v0, v0, [C

    .line 9246
    .local v0, "result":[C
    const/4 v1, 0x0

    .local v1, "i":I
    :goto_0
    array-length v2, p0

    if-ge v1, v2, :cond_3

    .line 9247
    aget-object v2, p0, v1

    .line 9248
    .local v2, "b":Ljava/lang/Character;
    if-nez v2, :cond_2

    move v3, p1

    goto :goto_1

    :cond_2
    invoke-virtual {v2}, Ljava/lang/Character;->charValue()C

    move-result v3

    :goto_1
    aput-char v3, v0, v1

    .line 9246
    .end local v2    # "b":Ljava/lang/Character;
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 9250
    .end local v1    # "i":I
    :cond_3
    return-object v0
.end method

.method public static toPrimitive([Ljava/lang/Double;)[D
    .locals 4
    .param p0, "array"    # [Ljava/lang/Double;

    .line 9264
    if-nez p0, :cond_0

    .line 9265
    const/4 v0, 0x0

    return-object v0

    .line 9267
    :cond_0
    array-length v0, p0

    if-nez v0, :cond_1

    .line 9268
    sget-object v0, Lorg/apache/commons/lang3/ArrayUtils;->EMPTY_DOUBLE_ARRAY:[D

    return-object v0

    .line 9270
    :cond_1
    array-length v0, p0

    new-array v0, v0, [D

    .line 9271
    .local v0, "result":[D
    const/4 v1, 0x0

    .local v1, "i":I
    :goto_0
    array-length v2, p0

    if-ge v1, v2, :cond_2

    .line 9272
    aget-object v2, p0, v1

    invoke-virtual {v2}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v2

    aput-wide v2, v0, v1

    .line 9271
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 9274
    .end local v1    # "i":I
    :cond_2
    return-object v0
.end method

.method public static toPrimitive([Ljava/lang/Double;D)[D
    .locals 5
    .param p0, "array"    # [Ljava/lang/Double;
    .param p1, "valueForNull"    # D

    .line 9288
    if-nez p0, :cond_0

    .line 9289
    const/4 v0, 0x0

    return-object v0

    .line 9291
    :cond_0
    array-length v0, p0

    if-nez v0, :cond_1

    .line 9292
    sget-object v0, Lorg/apache/commons/lang3/ArrayUtils;->EMPTY_DOUBLE_ARRAY:[D

    return-object v0

    .line 9294
    :cond_1
    array-length v0, p0

    new-array v0, v0, [D

    .line 9295
    .local v0, "result":[D
    const/4 v1, 0x0

    .local v1, "i":I
    :goto_0
    array-length v2, p0

    if-ge v1, v2, :cond_3

    .line 9296
    aget-object v2, p0, v1

    .line 9297
    .local v2, "b":Ljava/lang/Double;
    if-nez v2, :cond_2

    move-wide v3, p1

    goto :goto_1

    :cond_2
    invoke-virtual {v2}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v3

    :goto_1
    aput-wide v3, v0, v1

    .line 9295
    .end local v2    # "b":Ljava/lang/Double;
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 9299
    .end local v1    # "i":I
    :cond_3
    return-object v0
.end method

.method public static toPrimitive([Ljava/lang/Float;)[F
    .locals 3
    .param p0, "array"    # [Ljava/lang/Float;

    .line 9313
    if-nez p0, :cond_0

    .line 9314
    const/4 v0, 0x0

    return-object v0

    .line 9316
    :cond_0
    array-length v0, p0

    if-nez v0, :cond_1

    .line 9317
    sget-object v0, Lorg/apache/commons/lang3/ArrayUtils;->EMPTY_FLOAT_ARRAY:[F

    return-object v0

    .line 9319
    :cond_1
    array-length v0, p0

    new-array v0, v0, [F

    .line 9320
    .local v0, "result":[F
    const/4 v1, 0x0

    .local v1, "i":I
    :goto_0
    array-length v2, p0

    if-ge v1, v2, :cond_2

    .line 9321
    aget-object v2, p0, v1

    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    move-result v2

    aput v2, v0, v1

    .line 9320
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 9323
    .end local v1    # "i":I
    :cond_2
    return-object v0
.end method

.method public static toPrimitive([Ljava/lang/Float;F)[F
    .locals 4
    .param p0, "array"    # [Ljava/lang/Float;
    .param p1, "valueForNull"    # F

    .line 9337
    if-nez p0, :cond_0

    .line 9338
    const/4 v0, 0x0

    return-object v0

    .line 9340
    :cond_0
    array-length v0, p0

    if-nez v0, :cond_1

    .line 9341
    sget-object v0, Lorg/apache/commons/lang3/ArrayUtils;->EMPTY_FLOAT_ARRAY:[F

    return-object v0

    .line 9343
    :cond_1
    array-length v0, p0

    new-array v0, v0, [F

    .line 9344
    .local v0, "result":[F
    const/4 v1, 0x0

    .local v1, "i":I
    :goto_0
    array-length v2, p0

    if-ge v1, v2, :cond_3

    .line 9345
    aget-object v2, p0, v1

    .line 9346
    .local v2, "b":Ljava/lang/Float;
    if-nez v2, :cond_2

    move v3, p1

    goto :goto_1

    :cond_2
    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    move-result v3

    :goto_1
    aput v3, v0, v1

    .line 9344
    .end local v2    # "b":Ljava/lang/Float;
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 9348
    .end local v1    # "i":I
    :cond_3
    return-object v0
.end method

.method public static toPrimitive([Ljava/lang/Integer;)[I
    .locals 3
    .param p0, "array"    # [Ljava/lang/Integer;

    .line 9362
    if-nez p0, :cond_0

    .line 9363
    const/4 v0, 0x0

    return-object v0

    .line 9365
    :cond_0
    array-length v0, p0

    if-nez v0, :cond_1

    .line 9366
    sget-object v0, Lorg/apache/commons/lang3/ArrayUtils;->EMPTY_INT_ARRAY:[I

    return-object v0

    .line 9368
    :cond_1
    array-length v0, p0

    new-array v0, v0, [I

    .line 9369
    .local v0, "result":[I
    const/4 v1, 0x0

    .local v1, "i":I
    :goto_0
    array-length v2, p0

    if-ge v1, v2, :cond_2

    .line 9370
    aget-object v2, p0, v1

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    aput v2, v0, v1

    .line 9369
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 9372
    .end local v1    # "i":I
    :cond_2
    return-object v0
.end method

.method public static toPrimitive([Ljava/lang/Integer;I)[I
    .locals 4
    .param p0, "array"    # [Ljava/lang/Integer;
    .param p1, "valueForNull"    # I

    .line 9386
    if-nez p0, :cond_0

    .line 9387
    const/4 v0, 0x0

    return-object v0

    .line 9389
    :cond_0
    array-length v0, p0

    if-nez v0, :cond_1

    .line 9390
    sget-object v0, Lorg/apache/commons/lang3/ArrayUtils;->EMPTY_INT_ARRAY:[I

    return-object v0

    .line 9392
    :cond_1
    array-length v0, p0

    new-array v0, v0, [I

    .line 9393
    .local v0, "result":[I
    const/4 v1, 0x0

    .local v1, "i":I
    :goto_0
    array-length v2, p0

    if-ge v1, v2, :cond_3

    .line 9394
    aget-object v2, p0, v1

    .line 9395
    .local v2, "b":Ljava/lang/Integer;
    if-nez v2, :cond_2

    move v3, p1

    goto :goto_1

    :cond_2
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v3

    :goto_1
    aput v3, v0, v1

    .line 9393
    .end local v2    # "b":Ljava/lang/Integer;
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 9397
    .end local v1    # "i":I
    :cond_3
    return-object v0
.end method

.method public static toPrimitive([Ljava/lang/Long;)[J
    .locals 4
    .param p0, "array"    # [Ljava/lang/Long;

    .line 9411
    if-nez p0, :cond_0

    .line 9412
    const/4 v0, 0x0

    return-object v0

    .line 9414
    :cond_0
    array-length v0, p0

    if-nez v0, :cond_1

    .line 9415
    sget-object v0, Lorg/apache/commons/lang3/ArrayUtils;->EMPTY_LONG_ARRAY:[J

    return-object v0

    .line 9417
    :cond_1
    array-length v0, p0

    new-array v0, v0, [J

    .line 9418
    .local v0, "result":[J
    const/4 v1, 0x0

    .local v1, "i":I
    :goto_0
    array-length v2, p0

    if-ge v1, v2, :cond_2

    .line 9419
    aget-object v2, p0, v1

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    aput-wide v2, v0, v1

    .line 9418
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 9421
    .end local v1    # "i":I
    :cond_2
    return-object v0
.end method

.method public static toPrimitive([Ljava/lang/Long;J)[J
    .locals 5
    .param p0, "array"    # [Ljava/lang/Long;
    .param p1, "valueForNull"    # J

    .line 9435
    if-nez p0, :cond_0

    .line 9436
    const/4 v0, 0x0

    return-object v0

    .line 9438
    :cond_0
    array-length v0, p0

    if-nez v0, :cond_1

    .line 9439
    sget-object v0, Lorg/apache/commons/lang3/ArrayUtils;->EMPTY_LONG_ARRAY:[J

    return-object v0

    .line 9441
    :cond_1
    array-length v0, p0

    new-array v0, v0, [J

    .line 9442
    .local v0, "result":[J
    const/4 v1, 0x0

    .local v1, "i":I
    :goto_0
    array-length v2, p0

    if-ge v1, v2, :cond_3

    .line 9443
    aget-object v2, p0, v1

    .line 9444
    .local v2, "b":Ljava/lang/Long;
    if-nez v2, :cond_2

    move-wide v3, p1

    goto :goto_1

    :cond_2
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    :goto_1
    aput-wide v3, v0, v1

    .line 9442
    .end local v2    # "b":Ljava/lang/Long;
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 9446
    .end local v1    # "i":I
    :cond_3
    return-object v0
.end method

.method public static toPrimitive([Ljava/lang/Short;)[S
    .locals 3
    .param p0, "array"    # [Ljava/lang/Short;

    .line 9503
    if-nez p0, :cond_0

    .line 9504
    const/4 v0, 0x0

    return-object v0

    .line 9506
    :cond_0
    array-length v0, p0

    if-nez v0, :cond_1

    .line 9507
    sget-object v0, Lorg/apache/commons/lang3/ArrayUtils;->EMPTY_SHORT_ARRAY:[S

    return-object v0

    .line 9509
    :cond_1
    array-length v0, p0

    new-array v0, v0, [S

    .line 9510
    .local v0, "result":[S
    const/4 v1, 0x0

    .local v1, "i":I
    :goto_0
    array-length v2, p0

    if-ge v1, v2, :cond_2

    .line 9511
    aget-object v2, p0, v1

    invoke-virtual {v2}, Ljava/lang/Short;->shortValue()S

    move-result v2

    aput-short v2, v0, v1

    .line 9510
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 9513
    .end local v1    # "i":I
    :cond_2
    return-object v0
.end method

.method public static toPrimitive([Ljava/lang/Short;S)[S
    .locals 4
    .param p0, "array"    # [Ljava/lang/Short;
    .param p1, "valueForNull"    # S

    .line 9527
    if-nez p0, :cond_0

    .line 9528
    const/4 v0, 0x0

    return-object v0

    .line 9530
    :cond_0
    array-length v0, p0

    if-nez v0, :cond_1

    .line 9531
    sget-object v0, Lorg/apache/commons/lang3/ArrayUtils;->EMPTY_SHORT_ARRAY:[S

    return-object v0

    .line 9533
    :cond_1
    array-length v0, p0

    new-array v0, v0, [S

    .line 9534
    .local v0, "result":[S
    const/4 v1, 0x0

    .local v1, "i":I
    :goto_0
    array-length v2, p0

    if-ge v1, v2, :cond_3

    .line 9535
    aget-object v2, p0, v1

    .line 9536
    .local v2, "b":Ljava/lang/Short;
    if-nez v2, :cond_2

    move v3, p1

    goto :goto_1

    :cond_2
    invoke-virtual {v2}, Ljava/lang/Short;->shortValue()S

    move-result v3

    :goto_1
    aput-short v3, v0, v1

    .line 9534
    .end local v2    # "b":Ljava/lang/Short;
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 9538
    .end local v1    # "i":I
    :cond_3
    return-object v0
.end method

.method public static toPrimitive([Ljava/lang/Boolean;)[Z
    .locals 1
    .param p0, "array"    # [Ljava/lang/Boolean;

    .line 9127
    const/4 v0, 0x0

    invoke-static {p0, v0}, Lorg/apache/commons/lang3/ArrayUtils;->toPrimitive([Ljava/lang/Boolean;Z)[Z

    move-result-object v0

    return-object v0
.end method

.method public static toPrimitive([Ljava/lang/Boolean;Z)[Z
    .locals 4
    .param p0, "array"    # [Ljava/lang/Boolean;
    .param p1, "valueForNull"    # Z

    .line 9141
    if-nez p0, :cond_0

    .line 9142
    const/4 v0, 0x0

    return-object v0

    .line 9144
    :cond_0
    array-length v0, p0

    if-nez v0, :cond_1

    .line 9145
    sget-object v0, Lorg/apache/commons/lang3/ArrayUtils;->EMPTY_BOOLEAN_ARRAY:[Z

    return-object v0

    .line 9147
    :cond_1
    array-length v0, p0

    new-array v0, v0, [Z

    .line 9148
    .local v0, "result":[Z
    const/4 v1, 0x0

    .local v1, "i":I
    :goto_0
    array-length v2, p0

    if-ge v1, v2, :cond_3

    .line 9149
    aget-object v2, p0, v1

    .line 9150
    .local v2, "b":Ljava/lang/Boolean;
    if-nez v2, :cond_2

    move v3, p1

    goto :goto_1

    :cond_2
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    :goto_1
    aput-boolean v3, v0, v1

    .line 9148
    .end local v2    # "b":Ljava/lang/Boolean;
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 9152
    .end local v1    # "i":I
    :cond_3
    return-object v0
.end method

.method public static toString(Ljava/lang/Object;)Ljava/lang/String;
    .locals 1
    .param p0, "array"    # Ljava/lang/Object;

    .line 9555
    const-string/jumbo v0, "{}"

    invoke-static {p0, v0}, Lorg/apache/commons/lang3/ArrayUtils;->toString(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static toString(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;
    .locals 2
    .param p0, "array"    # Ljava/lang/Object;
    .param p1, "stringIfNull"    # Ljava/lang/String;

    .line 9573
    if-nez p0, :cond_0

    .line 9574
    return-object p1

    .line 9576
    :cond_0
    new-instance v0, Lorg/apache/commons/lang3/builder/ToStringBuilder;

    sget-object v1, Lorg/apache/commons/lang3/builder/ToStringStyle;->SIMPLE_STYLE:Lorg/apache/commons/lang3/builder/ToStringStyle;

    invoke-direct {v0, p0, v1}, Lorg/apache/commons/lang3/builder/ToStringBuilder;-><init>(Ljava/lang/Object;Lorg/apache/commons/lang3/builder/ToStringStyle;)V

    invoke-virtual {v0, p0}, Lorg/apache/commons/lang3/builder/ToStringBuilder;->append(Ljava/lang/Object;)Lorg/apache/commons/lang3/builder/ToStringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Lorg/apache/commons/lang3/builder/ToStringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static toStringArray([Ljava/lang/Object;)[Ljava/lang/String;
    .locals 3
    .param p0, "array"    # [Ljava/lang/Object;

    .line 9592
    if-nez p0, :cond_0

    .line 9593
    const/4 v0, 0x0

    return-object v0

    .line 9595
    :cond_0
    array-length v0, p0

    if-nez v0, :cond_1

    .line 9596
    sget-object v0, Lorg/apache/commons/lang3/ArrayUtils;->EMPTY_STRING_ARRAY:[Ljava/lang/String;

    return-object v0

    .line 9599
    :cond_1
    array-length v0, p0

    new-array v0, v0, [Ljava/lang/String;

    .line 9600
    .local v0, "result":[Ljava/lang/String;
    const/4 v1, 0x0

    .local v1, "i":I
    :goto_0
    array-length v2, p0

    if-ge v1, v2, :cond_2

    .line 9601
    aget-object v2, p0, v1

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    .line 9600
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 9604
    .end local v1    # "i":I
    :cond_2
    return-object v0
.end method

.method public static toStringArray([Ljava/lang/Object;Ljava/lang/String;)[Ljava/lang/String;
    .locals 3
    .param p0, "array"    # [Ljava/lang/Object;
    .param p1, "valueForNullElements"    # Ljava/lang/String;

    .line 9620
    if-nez p0, :cond_0

    .line 9621
    const/4 v0, 0x0

    return-object v0

    .line 9623
    :cond_0
    array-length v0, p0

    if-nez v0, :cond_1

    .line 9624
    sget-object v0, Lorg/apache/commons/lang3/ArrayUtils;->EMPTY_STRING_ARRAY:[Ljava/lang/String;

    return-object v0

    .line 9627
    :cond_1
    array-length v0, p0

    new-array v0, v0, [Ljava/lang/String;

    .line 9628
    .local v0, "result":[Ljava/lang/String;
    const/4 v1, 0x0

    .local v1, "i":I
    :goto_0
    array-length v2, p0

    if-ge v1, v2, :cond_2

    .line 9629
    aget-object v2, p0, v1

    invoke-static {v2, p1}, Ljava/util/Objects;->toString(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    .line 9628
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 9632
    .end local v1    # "i":I
    :cond_2
    return-object v0
.end method
