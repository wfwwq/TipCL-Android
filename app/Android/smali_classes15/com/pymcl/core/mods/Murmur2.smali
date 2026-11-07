.class public final Lcom/pymcl/core/mods/Murmur2;
.super Ljava/lang/Object;
.source "ModTools.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nModTools.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModTools.kt\ncom/pymcl/core/mods/Murmur2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,288:1\n1#2:289\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u0014\u0010\u0008\u001a\u00020\t2\u000c\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u000bJ\u000e\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\r\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u0011J\u0014\u0010\r\u001a\u00020\t2\u000c\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u000b\u00a8\u0006\u0012"
    }
    d2 = {
        "Lcom/pymcl/core/mods/Murmur2;",
        "",
        "<init>",
        "()V",
        "ws",
        "",
        "b",
        "",
        "normalizedLength",
        "",
        "open",
        "Lkotlin/Function0;",
        "Ljava/io/InputStream;",
        "hash",
        "bytes",
        "",
        "f",
        "Ljava/io/File;",
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


# static fields
.field public static final INSTANCE:Lcom/pymcl/core/mods/Murmur2;


# direct methods
.method public static synthetic $r8$lambda$7uAzSr1RTHayCyk-yPMQwB3Uehc([B)Ljava/io/InputStream;
    .locals 0

    invoke-static {p0}, Lcom/pymcl/core/mods/Murmur2;->hash$lambda$0([B)Ljava/io/InputStream;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$poR1CEdi1Ba4zFfZQDGTeAXDa_o(Ljava/io/File;)Ljava/io/InputStream;
    .locals 0

    invoke-static {p0}, Lcom/pymcl/core/mods/Murmur2;->hash$lambda$1(Ljava/io/File;)Ljava/io/InputStream;

    move-result-object p0

    return-object p0
.end method

.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/pymcl/core/mods/Murmur2;

    invoke-direct {v0}, Lcom/pymcl/core/mods/Murmur2;-><init>()V

    sput-object v0, Lcom/pymcl/core/mods/Murmur2;->INSTANCE:Lcom/pymcl/core/mods/Murmur2;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static final hash$lambda$0([B)Ljava/io/InputStream;
    .locals 1
    .param p0, "$bytes"    # [B

    new-instance v0, Ljava/io/ByteArrayInputStream;

    .line 23
    invoke-direct {v0, p0}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    check-cast v0, Ljava/io/InputStream;

    return-object v0
.end method

.method private static final hash$lambda$1(Ljava/io/File;)Ljava/io/InputStream;
    .locals 2
    .param p0, "$f"    # Ljava/io/File;

    .line 24
    new-instance v0, Ljava/io/BufferedInputStream;

    new-instance v1, Ljava/io/FileInputStream;

    invoke-direct {v1, p0}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    check-cast v1, Ljava/io/InputStream;

    invoke-direct {v0, v1}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V

    check-cast v0, Ljava/io/InputStream;

    return-object v0
.end method

.method private final ws(I)Z
    .locals 1
    .param p1, "b"    # I

    .line 19
    const/16 v0, 0x9

    if-eq p1, v0, :cond_1

    const/16 v0, 0xa

    if-eq p1, v0, :cond_1

    const/16 v0, 0xd

    if-eq p1, v0, :cond_1

    const/16 v0, 0x20

    if-ne p1, v0, :cond_0

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


# virtual methods
.method public final hash(Ljava/io/File;)J
    .locals 2
    .param p1, "f"    # Ljava/io/File;

    const-string v0, "f"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    new-instance v0, Lcom/pymcl/core/mods/Murmur2$$ExternalSyntheticLambda1;

    invoke-direct {v0, p1}, Lcom/pymcl/core/mods/Murmur2$$ExternalSyntheticLambda1;-><init>(Ljava/io/File;)V

    invoke-virtual {p0, v0}, Lcom/pymcl/core/mods/Murmur2;->hash(Lkotlin/jvm/functions/Function0;)J

    move-result-wide v0

    return-wide v0
.end method

.method public final hash(Lkotlin/jvm/functions/Function0;)J
    .locals 14
    .param p1, "open"    # Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function0<",
            "+",
            "Ljava/io/InputStream;",
            ">;)J"
        }
    .end annotation

    const-string v0, "open"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    const v0, 0x5bd1e995

    .local v0, "m":I
    invoke-virtual {p0, p1}, Lcom/pymcl/core/mods/Murmur2;->normalizedLength(Lkotlin/jvm/functions/Function0;)J

    move-result-wide v1

    .line 27
    .local v1, "len":J
    const/4 v3, 0x0

    .local v3, "h":I
    long-to-int v4, v1

    xor-int/lit8 v3, v4, 0x1

    .line 28
    const/4 v4, 0x0

    .local v4, "k":I
    const/4 v5, 0x0

    .line 29
    .local v5, "shift":I
    invoke-interface {p1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/io/Closeable;

    :try_start_0
    move-object v7, v6

    check-cast v7, Ljava/io/InputStream;

    .line 289
    .local v7, "ins":Ljava/io/InputStream;
    const/4 v8, 0x0

    .line 29
    .local v8, "$i$a$-use-Murmur2$hash$3":I
    const/high16 v9, 0x10000

    new-array v9, v9, [B

    .line 30
    .local v9, "buf":[B
    :cond_0
    invoke-virtual {v7, v9}, Ljava/io/InputStream;->read([B)I

    move-result v10

    .local v10, "r":I
    if-ltz v10, :cond_2

    .line 31
    const/4 v11, 0x0

    .local v11, "i":I
    :goto_0
    if-ge v11, v10, :cond_0

    aget-byte v12, v9, v11

    and-int/lit16 v12, v12, 0xff

    .local v12, "b":I
    sget-object v13, Lcom/pymcl/core/mods/Murmur2;->INSTANCE:Lcom/pymcl/core/mods/Murmur2;

    invoke-direct {v13, v12}, Lcom/pymcl/core/mods/Murmur2;->ws(I)Z

    move-result v13

    if-nez v13, :cond_1

    .line 32
    shl-int v13, v12, v5

    or-int/2addr v4, v13

    add-int/lit8 v5, v5, 0x8

    .line 33
    const/16 v13, 0x20

    if-ne v5, v13, :cond_1

    mul-int/2addr v4, v0

    ushr-int/lit8 v13, v4, 0x18

    xor-int/2addr v4, v13

    mul-int/2addr v4, v0

    mul-int/2addr v3, v0

    xor-int/2addr v3, v4

    const/4 v4, 0x0

    const/4 v5, 0x0

    .line 31
    .end local v12    # "b":I
    :cond_1
    add-int/lit8 v11, v11, 0x1

    goto :goto_0

    .line 33
    .end local v10    # "r":I
    .end local v11    # "i":I
    :cond_2
    nop

    .end local v7    # "ins":Ljava/io/InputStream;
    .end local v8    # "$i$a$-use-Murmur2$hash$3":I
    .end local v9    # "buf":[B
    sget-object v7, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 29
    const/4 v7, 0x0

    invoke-static {v6, v7}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 34
    if-lez v5, :cond_3

    xor-int/2addr v3, v4

    mul-int/2addr v3, v0

    .line 35
    :cond_3
    ushr-int/lit8 v6, v3, 0xd

    xor-int/2addr v3, v6

    mul-int/2addr v3, v0

    ushr-int/lit8 v6, v3, 0xf

    xor-int/2addr v3, v6

    .line 36
    int-to-long v6, v3

    const-wide v8, 0xffffffffL

    and-long/2addr v6, v8

    return-wide v6

    .line 29
    :catchall_0
    move-exception v7

    .end local v0    # "m":I
    .end local v1    # "len":J
    .end local v3    # "h":I
    .end local v4    # "k":I
    .end local v5    # "shift":I
    .end local p1    # "open":Lkotlin/jvm/functions/Function0;
    :try_start_1
    throw v7
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .restart local v0    # "m":I
    .restart local v1    # "len":J
    .restart local v3    # "h":I
    .restart local v4    # "k":I
    .restart local v5    # "shift":I
    .restart local p1    # "open":Lkotlin/jvm/functions/Function0;
    :catchall_1
    move-exception v8

    invoke-static {v6, v7}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v8
.end method

.method public final hash([B)J
    .locals 2
    .param p1, "bytes"    # [B

    const-string v0, "bytes"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    new-instance v0, Lcom/pymcl/core/mods/Murmur2$$ExternalSyntheticLambda0;

    invoke-direct {v0, p1}, Lcom/pymcl/core/mods/Murmur2$$ExternalSyntheticLambda0;-><init>([B)V

    invoke-virtual {p0, v0}, Lcom/pymcl/core/mods/Murmur2;->hash(Lkotlin/jvm/functions/Function0;)J

    move-result-wide v0

    return-wide v0
.end method

.method public final normalizedLength(Lkotlin/jvm/functions/Function0;)J
    .locals 10
    .param p1, "open"    # Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function0<",
            "+",
            "Ljava/io/InputStream;",
            ">;)J"
        }
    .end annotation

    const-string v0, "open"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    const-wide/16 v0, 0x0

    .line 21
    .local v0, "n":J
    invoke-interface {p1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/io/Closeable;

    :try_start_0
    move-object v3, v2

    check-cast v3, Ljava/io/InputStream;

    .line 289
    .local v3, "ins":Ljava/io/InputStream;
    const/4 v4, 0x0

    .line 21
    .local v4, "$i$a$-use-Murmur2$normalizedLength$1":I
    const/high16 v5, 0x10000

    new-array v5, v5, [B

    .local v5, "buf":[B
    :cond_0
    invoke-virtual {v3, v5}, Ljava/io/InputStream;->read([B)I

    move-result v6

    .local v6, "r":I
    if-ltz v6, :cond_2

    const/4 v7, 0x0

    .local v7, "i":I
    :goto_0
    if-ge v7, v6, :cond_0

    sget-object v8, Lcom/pymcl/core/mods/Murmur2;->INSTANCE:Lcom/pymcl/core/mods/Murmur2;

    aget-byte v9, v5, v7

    and-int/lit16 v9, v9, 0xff

    invoke-direct {v8, v9}, Lcom/pymcl/core/mods/Murmur2;->ws(I)Z

    move-result v8

    if-nez v8, :cond_1

    const-wide/16 v8, 0x1

    add-long/2addr v0, v8

    :cond_1
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    .end local v3    # "ins":Ljava/io/InputStream;
    .end local v4    # "$i$a$-use-Murmur2$normalizedLength$1":I
    .end local v5    # "buf":[B
    .end local v6    # "r":I
    .end local v7    # "i":I
    :cond_2
    sget-object v3, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v3, 0x0

    invoke-static {v2, v3}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 22
    return-wide v0

    .line 21
    :catchall_0
    move-exception v3

    .end local v0    # "n":J
    .end local p1    # "open":Lkotlin/jvm/functions/Function0;
    :try_start_1
    throw v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .restart local v0    # "n":J
    .restart local p1    # "open":Lkotlin/jvm/functions/Function0;
    :catchall_1
    move-exception v4

    invoke-static {v2, v3}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v4
.end method
