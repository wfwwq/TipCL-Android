.class public final Ltop/fifthlight/touchcontroller/proxy/message/RemovePointerMessage;
.super Ltop/fifthlight/touchcontroller/proxy/message/ProxyMessage;
.source "RemovePointerMessage.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ltop/fifthlight/touchcontroller/proxy/message/RemovePointerMessage$Decoder;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\u0008\u0086\u0008\u0018\u00002\u00020\u0001:\u0001\u0017B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000c\u001a\u00020\rH\u0016J\t\u0010\u000e\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\u000f\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u00d6\u0003J\t\u0010\u0014\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007R\u0014\u0010\u0008\u001a\u00020\u0003X\u0096D\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\u0007\u00a8\u0006\u0018"
    }
    d2 = {
        "Ltop/fifthlight/touchcontroller/proxy/message/RemovePointerMessage;",
        "Ltop/fifthlight/touchcontroller/proxy/message/ProxyMessage;",
        "index",
        "",
        "<init>",
        "(I)V",
        "getIndex",
        "()I",
        "type",
        "getType",
        "encode",
        "",
        "buffer",
        "Ljava/nio/ByteBuffer;",
        "component1",
        "copy",
        "equals",
        "",
        "other",
        "",
        "hashCode",
        "toString",
        "",
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


# instance fields
.field private final index:I

.field private final type:I


# direct methods
.method public constructor <init>(I)V
    .locals 1
    .param p1, "index"    # I

    .line 7
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Ltop/fifthlight/touchcontroller/proxy/message/ProxyMessage;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 6
    iput p1, p0, Ltop/fifthlight/touchcontroller/proxy/message/RemovePointerMessage;->index:I

    .line 8
    const/4 v0, 0x2

    iput v0, p0, Ltop/fifthlight/touchcontroller/proxy/message/RemovePointerMessage;->type:I

    .line 5
    return-void
.end method

.method public static synthetic copy$default(Ltop/fifthlight/touchcontroller/proxy/message/RemovePointerMessage;IILjava/lang/Object;)Ltop/fifthlight/touchcontroller/proxy/message/RemovePointerMessage;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    iget p1, p0, Ltop/fifthlight/touchcontroller/proxy/message/RemovePointerMessage;->index:I

    :cond_0
    invoke-virtual {p0, p1}, Ltop/fifthlight/touchcontroller/proxy/message/RemovePointerMessage;->copy(I)Ltop/fifthlight/touchcontroller/proxy/message/RemovePointerMessage;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Ltop/fifthlight/touchcontroller/proxy/message/RemovePointerMessage;->index:I

    return v0
.end method

.method public final copy(I)Ltop/fifthlight/touchcontroller/proxy/message/RemovePointerMessage;
    .locals 1

    new-instance v0, Ltop/fifthlight/touchcontroller/proxy/message/RemovePointerMessage;

    invoke-direct {v0, p1}, Ltop/fifthlight/touchcontroller/proxy/message/RemovePointerMessage;-><init>(I)V

    return-object v0
.end method

.method public encode(Ljava/nio/ByteBuffer;)V
    .locals 1
    .param p1, "buffer"    # Ljava/nio/ByteBuffer;

    const-string v0, "buffer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    invoke-super {p0, p1}, Ltop/fifthlight/touchcontroller/proxy/message/ProxyMessage;->encode(Ljava/nio/ByteBuffer;)V

    .line 12
    iget v0, p0, Ltop/fifthlight/touchcontroller/proxy/message/RemovePointerMessage;->index:I

    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    .line 13
    return-void
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Ltop/fifthlight/touchcontroller/proxy/message/RemovePointerMessage;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    move-object v1, p1

    check-cast v1, Ltop/fifthlight/touchcontroller/proxy/message/RemovePointerMessage;

    iget v3, p0, Ltop/fifthlight/touchcontroller/proxy/message/RemovePointerMessage;->index:I

    iget v1, v1, Ltop/fifthlight/touchcontroller/proxy/message/RemovePointerMessage;->index:I

    if-eq v3, v1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public final getIndex()I
    .locals 1

    .line 6
    iget v0, p0, Ltop/fifthlight/touchcontroller/proxy/message/RemovePointerMessage;->index:I

    return v0
.end method

.method public getType()I
    .locals 1

    .line 8
    iget v0, p0, Ltop/fifthlight/touchcontroller/proxy/message/RemovePointerMessage;->type:I

    return v0
.end method

.method public hashCode()I
    .locals 1

    iget v0, p0, Ltop/fifthlight/touchcontroller/proxy/message/RemovePointerMessage;->index:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "RemovePointerMessage(index="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Ltop/fifthlight/touchcontroller/proxy/message/RemovePointerMessage;->index:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
