.class public Lorg/tukaani/xz/check/CRC64;
.super Lorg/tukaani/xz/check/Check;


# static fields
.field private static final TABLE:[[J


# instance fields
.field private crc:J


# direct methods
.method static constructor <clinit>()V
    .locals 13

    const/4 v0, 0x2

    new-array v0, v0, [I

    const/4 v1, 0x1

    const/16 v2, 0x100

    aput v2, v0, v1

    const/4 v3, 0x0

    const/4 v4, 0x4

    aput v4, v0, v3

    sget-object v5, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    invoke-static {v5, v0}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [[J

    sput-object v0, Lorg/tukaani/xz/check/CRC64;->TABLE:[[J

    move v0, v3

    :goto_0
    if-ge v0, v4, :cond_4

    move v5, v3

    :goto_1
    if-ge v5, v2, :cond_3

    if-nez v0, :cond_0

    int-to-long v6, v5

    goto :goto_2

    :cond_0
    sget-object v6, Lorg/tukaani/xz/check/CRC64;->TABLE:[[J

    add-int/lit8 v7, v0, -0x1

    aget-object v6, v6, v7

    aget-wide v7, v6, v5

    move-wide v6, v7

    :goto_2
    move v8, v3

    :goto_3
    const/16 v9, 0x8

    if-ge v8, v9, :cond_2

    const-wide/16 v9, 0x1

    and-long v11, v6, v9

    cmp-long v9, v11, v9

    ushr-long/2addr v6, v1

    if-nez v9, :cond_1

    const-wide v9, -0x3693a86a2878f0beL    # -5.0564049839430436E45

    xor-long/2addr v6, v9

    :cond_1
    add-int/lit8 v8, v8, 0x1

    goto :goto_3

    :cond_2
    sget-object v8, Lorg/tukaani/xz/check/CRC64;->TABLE:[[J

    aget-object v8, v8, v0

    aput-wide v6, v8, v5

    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :cond_3
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_4
    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Lorg/tukaani/xz/check/Check;-><init>()V

    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lorg/tukaani/xz/check/CRC64;->crc:J

    const/16 v0, 0x8

    iput v0, p0, Lorg/tukaani/xz/check/CRC64;->size:I

    const-string v0, "CRC64"

    iput-object v0, p0, Lorg/tukaani/xz/check/CRC64;->name:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public finish()[B
    .locals 7

    iget-wide v0, p0, Lorg/tukaani/xz/check/CRC64;->crc:J

    not-long v0, v0

    const-wide/16 v2, -0x1

    iput-wide v2, p0, Lorg/tukaani/xz/check/CRC64;->crc:J

    const/16 v2, 0x8

    new-array v3, v2, [B

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v2, :cond_0

    mul-int/lit8 v5, v4, 0x8

    shr-long v5, v0, v5

    long-to-int v5, v5

    int-to-byte v5, v5

    aput-byte v5, v3, v4

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_0
    return-object v3
.end method

.method public update([BII)V
    .locals 8

    add-int/2addr p3, p2

    add-int/lit8 v0, p3, -0x3

    :goto_0
    const/4 v1, 0x0

    if-ge p2, v0, :cond_0

    iget-wide v2, p0, Lorg/tukaani/xz/check/CRC64;->crc:J

    long-to-int v2, v2

    sget-object v3, Lorg/tukaani/xz/check/CRC64;->TABLE:[[J

    const/4 v4, 0x3

    aget-object v3, v3, v4

    and-int/lit16 v4, v2, 0xff

    aget-byte v5, p1, p2

    and-int/lit16 v5, v5, 0xff

    xor-int/2addr v4, v5

    aget-wide v4, v3, v4

    sget-object v3, Lorg/tukaani/xz/check/CRC64;->TABLE:[[J

    const/4 v6, 0x2

    aget-object v3, v3, v6

    ushr-int/lit8 v6, v2, 0x8

    and-int/lit16 v6, v6, 0xff

    add-int/lit8 v7, p2, 0x1

    aget-byte v7, p1, v7

    and-int/lit16 v7, v7, 0xff

    xor-int/2addr v6, v7

    aget-wide v6, v3, v6

    xor-long v3, v4, v6

    iget-wide v5, p0, Lorg/tukaani/xz/check/CRC64;->crc:J

    const/16 v7, 0x20

    ushr-long/2addr v5, v7

    xor-long/2addr v3, v5

    sget-object v5, Lorg/tukaani/xz/check/CRC64;->TABLE:[[J

    const/4 v6, 0x1

    aget-object v5, v5, v6

    ushr-int/lit8 v6, v2, 0x10

    and-int/lit16 v6, v6, 0xff

    add-int/lit8 v7, p2, 0x2

    aget-byte v7, p1, v7

    and-int/lit16 v7, v7, 0xff

    xor-int/2addr v6, v7

    aget-wide v6, v5, v6

    xor-long/2addr v3, v6

    sget-object v5, Lorg/tukaani/xz/check/CRC64;->TABLE:[[J

    aget-object v1, v5, v1

    ushr-int/lit8 v2, v2, 0x18

    and-int/lit16 v2, v2, 0xff

    add-int/lit8 v5, p2, 0x3

    aget-byte v5, p1, v5

    and-int/lit16 v5, v5, 0xff

    xor-int/2addr v2, v5

    aget-wide v5, v1, v2

    xor-long v1, v3, v5

    iput-wide v1, p0, Lorg/tukaani/xz/check/CRC64;->crc:J

    add-int/lit8 p2, p2, 0x4

    goto :goto_0

    :cond_0
    :goto_1
    if-ge p2, p3, :cond_1

    sget-object v0, Lorg/tukaani/xz/check/CRC64;->TABLE:[[J

    aget-object v0, v0, v1

    add-int/lit8 v2, p2, 0x1

    aget-byte p2, p1, p2

    and-int/lit16 p2, p2, 0xff

    iget-wide v3, p0, Lorg/tukaani/xz/check/CRC64;->crc:J

    long-to-int v3, v3

    and-int/lit16 v3, v3, 0xff

    xor-int/2addr p2, v3

    aget-wide v3, v0, p2

    iget-wide v5, p0, Lorg/tukaani/xz/check/CRC64;->crc:J

    const/16 p2, 0x8

    ushr-long/2addr v5, p2

    xor-long/2addr v3, v5

    iput-wide v3, p0, Lorg/tukaani/xz/check/CRC64;->crc:J

    move p2, v2

    goto :goto_1

    :cond_1
    return-void
.end method
