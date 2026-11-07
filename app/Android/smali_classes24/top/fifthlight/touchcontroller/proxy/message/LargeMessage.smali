.class public final Ltop/fifthlight/touchcontroller/proxy/message/LargeMessage;
.super Ltop/fifthlight/touchcontroller/proxy/message/ProxyMessage;
.source "LargeMessage.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ltop/fifthlight/touchcontroller/proxy/message/LargeMessage$Companion;,
        Ltop/fifthlight/touchcontroller/proxy/message/LargeMessage$Decoder;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nLargeMessage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LargeMessage.kt\ntop/fifthlight/touchcontroller/proxy/message/LargeMessage\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,74:1\n1#2:75\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0007\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0005\n\u0002\u0010\u000e\n\u0002\u0008\u0003\u0008\u0086\u0008\u0018\u0000 \u001d2\u00020\u0001:\u0002\u001d\u001eB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0013\u0010\u0014\u001a\u00020\u00052\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0096\u0002J\u0008\u0010\u0017\u001a\u00020\rH\u0016J\t\u0010\u0018\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\u001a\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\t\u0010\u001b\u001a\u00020\u001cH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000bR\u0014\u0010\u000c\u001a\u00020\r8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u001f"
    }
    d2 = {
        "Ltop/fifthlight/touchcontroller/proxy/message/LargeMessage;",
        "Ltop/fifthlight/touchcontroller/proxy/message/ProxyMessage;",
        "payload",
        "",
        "end",
        "",
        "<init>",
        "([BZ)V",
        "getPayload",
        "()[B",
        "getEnd",
        "()Z",
        "type",
        "",
        "getType",
        "()I",
        "encode",
        "",
        "buffer",
        "Ljava/nio/ByteBuffer;",
        "equals",
        "other",
        "",
        "hashCode",
        "component1",
        "component2",
        "copy",
        "toString",
        "",
        "Companion",
        "Decoder",
        "TouchController-Proxy-Client"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final Companion:Ltop/fifthlight/touchcontroller/proxy/message/LargeMessage$Companion;

.field public static final MAX_PAYLOAD_LENGTH:I = 0xf0

.field public static final TYPE:I = 0x6


# instance fields
.field private final end:Z

.field private final payload:[B


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ltop/fifthlight/touchcontroller/proxy/message/LargeMessage$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ltop/fifthlight/touchcontroller/proxy/message/LargeMessage$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Ltop/fifthlight/touchcontroller/proxy/message/LargeMessage;->Companion:Ltop/fifthlight/touchcontroller/proxy/message/LargeMessage$Companion;

    return-void
.end method

.method public constructor <init>([BZ)V
    .locals 2
    .param p1, "payload"    # [B
    .param p2, "end"    # Z

    const-string v0, "payload"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Ltop/fifthlight/touchcontroller/proxy/message/ProxyMessage;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 6
    iput-object p1, p0, Ltop/fifthlight/touchcontroller/proxy/message/LargeMessage;->payload:[B

    .line 7
    iput-boolean p2, p0, Ltop/fifthlight/touchcontroller/proxy/message/LargeMessage;->end:Z

    .line 14
    nop

    .line 15
    iget-object v0, p0, Ltop/fifthlight/touchcontroller/proxy/message/LargeMessage;->payload:[B

    array-length v0, v0

    const/16 v1, 0xf0

    if-gt v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    .line 16
    nop

    .line 5
    return-void

    .line 75
    :cond_1
    const/4 v0, 0x0

    .line 15
    .local v0, "$i$a$-require-LargeMessage$1":I
    nop

    .end local v0    # "$i$a$-require-LargeMessage$1":I
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Payload length too large: 240"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static synthetic copy$default(Ltop/fifthlight/touchcontroller/proxy/message/LargeMessage;[BZILjava/lang/Object;)Ltop/fifthlight/touchcontroller/proxy/message/LargeMessage;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    iget-object p1, p0, Ltop/fifthlight/touchcontroller/proxy/message/LargeMessage;->payload:[B

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    iget-boolean p2, p0, Ltop/fifthlight/touchcontroller/proxy/message/LargeMessage;->end:Z

    :cond_1
    invoke-virtual {p0, p1, p2}, Ltop/fifthlight/touchcontroller/proxy/message/LargeMessage;->copy([BZ)Ltop/fifthlight/touchcontroller/proxy/message/LargeMessage;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()[B
    .locals 1

    iget-object v0, p0, Ltop/fifthlight/touchcontroller/proxy/message/LargeMessage;->payload:[B

    return-object v0
.end method

.method public final component2()Z
    .locals 1

    iget-boolean v0, p0, Ltop/fifthlight/touchcontroller/proxy/message/LargeMessage;->end:Z

    return v0
.end method

.method public final copy([BZ)Ltop/fifthlight/touchcontroller/proxy/message/LargeMessage;
    .locals 1

    const-string v0, "payload"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ltop/fifthlight/touchcontroller/proxy/message/LargeMessage;

    invoke-direct {v0, p1, p2}, Ltop/fifthlight/touchcontroller/proxy/message/LargeMessage;-><init>([BZ)V

    return-object v0
.end method

.method public encode(Ljava/nio/ByteBuffer;)V
    .locals 1
    .param p1, "buffer"    # Ljava/nio/ByteBuffer;

    const-string v0, "buffer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    invoke-super {p0, p1}, Ltop/fifthlight/touchcontroller/proxy/message/ProxyMessage;->encode(Ljava/nio/ByteBuffer;)V

    .line 23
    iget-object v0, p0, Ltop/fifthlight/touchcontroller/proxy/message/LargeMessage;->payload:[B

    array-length v0, v0

    int-to-byte v0, v0

    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 24
    iget-boolean v0, p0, Ltop/fifthlight/touchcontroller/proxy/message/LargeMessage;->end:Z

    if-eqz v0, :cond_0

    .line 25
    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    goto :goto_0

    .line 27
    :cond_0
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 29
    :goto_0
    iget-object v0, p0, Ltop/fifthlight/touchcontroller/proxy/message/LargeMessage;->payload:[B

    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 30
    return-void
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4
    .param p1, "other"    # Ljava/lang/Object;

    .line 58
    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    .line 59
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    :goto_0
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_2

    return v2

    .line 61
    :cond_2
    const-string v1, "null cannot be cast to non-null type top.fifthlight.touchcontroller.proxy.message.LargeMessage"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v1, p1

    check-cast v1, Ltop/fifthlight/touchcontroller/proxy/message/LargeMessage;

    .line 63
    invoke-virtual {p0}, Ltop/fifthlight/touchcontroller/proxy/message/LargeMessage;->getType()I

    move-result v1

    move-object v3, p1

    check-cast v3, Ltop/fifthlight/touchcontroller/proxy/message/LargeMessage;

    invoke-virtual {v3}, Ltop/fifthlight/touchcontroller/proxy/message/LargeMessage;->getType()I

    move-result v3

    if-eq v1, v3, :cond_3

    return v2

    .line 64
    :cond_3
    iget-object v1, p0, Ltop/fifthlight/touchcontroller/proxy/message/LargeMessage;->payload:[B

    move-object v3, p1

    check-cast v3, Ltop/fifthlight/touchcontroller/proxy/message/LargeMessage;

    iget-object v3, v3, Ltop/fifthlight/touchcontroller/proxy/message/LargeMessage;->payload:[B

    invoke-static {v1, v3}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    .line 66
    :cond_4
    return v0
.end method

.method public final getEnd()Z
    .locals 1

    .line 7
    iget-boolean v0, p0, Ltop/fifthlight/touchcontroller/proxy/message/LargeMessage;->end:Z

    return v0
.end method

.method public final getPayload()[B
    .locals 1

    .line 6
    iget-object v0, p0, Ltop/fifthlight/touchcontroller/proxy/message/LargeMessage;->payload:[B

    return-object v0
.end method

.method public getType()I
    .locals 1

    .line 19
    const/4 v0, 0x6

    return v0
.end method

.method public hashCode()I
    .locals 3

    .line 70
    invoke-virtual {p0}, Ltop/fifthlight/touchcontroller/proxy/message/LargeMessage;->getType()I

    move-result v0

    .line 71
    .local v0, "result":I
    mul-int/lit8 v1, v0, 0x1f

    iget-object v2, p0, Ltop/fifthlight/touchcontroller/proxy/message/LargeMessage;->payload:[B

    invoke-static {v2}, Ljava/util/Arrays;->hashCode([B)I

    move-result v2

    add-int/2addr v1, v2

    .line 72
    .end local v0    # "result":I
    .local v1, "result":I
    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "LargeMessage(payload="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Ltop/fifthlight/touchcontroller/proxy/message/LargeMessage;->payload:[B

    invoke-static {v1}, Ljava/util/Arrays;->toString([B)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", end="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-boolean v1, p0, Ltop/fifthlight/touchcontroller/proxy/message/LargeMessage;->end:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
