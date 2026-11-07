.class public final Ltop/fifthlight/touchcontroller/proxy/message/AddPointerMessage;
.super Ltop/fifthlight/touchcontroller/proxy/message/ProxyMessage;
.source "AddPointerMessage.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ltop/fifthlight/touchcontroller/proxy/message/AddPointerMessage$Decoder;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0007\n\u0002\u0008\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\u0008\u0086\u0008\u0018\u00002\u00020\u0001:\u0001\u001fB\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\t\u0010\u0014\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0005H\u00c6\u0003J\'\u0010\u0017\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\u0008\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u00d6\u0003J\t\u0010\u001c\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u001d\u001a\u00020\u001eH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000cR\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000cR\u0014\u0010\u000e\u001a\u00020\u0003X\u0096D\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\n\u00a8\u0006 "
    }
    d2 = {
        "Ltop/fifthlight/touchcontroller/proxy/message/AddPointerMessage;",
        "Ltop/fifthlight/touchcontroller/proxy/message/ProxyMessage;",
        "index",
        "",
        "x",
        "",
        "y",
        "<init>",
        "(IFF)V",
        "getIndex",
        "()I",
        "getX",
        "()F",
        "getY",
        "type",
        "getType",
        "encode",
        "",
        "buffer",
        "Ljava/nio/ByteBuffer;",
        "component1",
        "component2",
        "component3",
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

.field private final x:F

.field private final y:F


# direct methods
.method public constructor <init>(IFF)V
    .locals 1
    .param p1, "index"    # I
    .param p2, "x"    # F
    .param p3, "y"    # F

    .line 9
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Ltop/fifthlight/touchcontroller/proxy/message/ProxyMessage;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 6
    iput p1, p0, Ltop/fifthlight/touchcontroller/proxy/message/AddPointerMessage;->index:I

    .line 7
    iput p2, p0, Ltop/fifthlight/touchcontroller/proxy/message/AddPointerMessage;->x:F

    .line 8
    iput p3, p0, Ltop/fifthlight/touchcontroller/proxy/message/AddPointerMessage;->y:F

    .line 10
    const/4 v0, 0x1

    iput v0, p0, Ltop/fifthlight/touchcontroller/proxy/message/AddPointerMessage;->type:I

    .line 5
    return-void
.end method

.method public static synthetic copy$default(Ltop/fifthlight/touchcontroller/proxy/message/AddPointerMessage;IFFILjava/lang/Object;)Ltop/fifthlight/touchcontroller/proxy/message/AddPointerMessage;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget p1, p0, Ltop/fifthlight/touchcontroller/proxy/message/AddPointerMessage;->index:I

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget p2, p0, Ltop/fifthlight/touchcontroller/proxy/message/AddPointerMessage;->x:F

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget p3, p0, Ltop/fifthlight/touchcontroller/proxy/message/AddPointerMessage;->y:F

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Ltop/fifthlight/touchcontroller/proxy/message/AddPointerMessage;->copy(IFF)Ltop/fifthlight/touchcontroller/proxy/message/AddPointerMessage;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Ltop/fifthlight/touchcontroller/proxy/message/AddPointerMessage;->index:I

    return v0
.end method

.method public final component2()F
    .locals 1

    iget v0, p0, Ltop/fifthlight/touchcontroller/proxy/message/AddPointerMessage;->x:F

    return v0
.end method

.method public final component3()F
    .locals 1

    iget v0, p0, Ltop/fifthlight/touchcontroller/proxy/message/AddPointerMessage;->y:F

    return v0
.end method

.method public final copy(IFF)Ltop/fifthlight/touchcontroller/proxy/message/AddPointerMessage;
    .locals 1

    new-instance v0, Ltop/fifthlight/touchcontroller/proxy/message/AddPointerMessage;

    invoke-direct {v0, p1, p2, p3}, Ltop/fifthlight/touchcontroller/proxy/message/AddPointerMessage;-><init>(IFF)V

    return-object v0
.end method

.method public encode(Ljava/nio/ByteBuffer;)V
    .locals 1
    .param p1, "buffer"    # Ljava/nio/ByteBuffer;

    const-string v0, "buffer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    invoke-super {p0, p1}, Ltop/fifthlight/touchcontroller/proxy/message/ProxyMessage;->encode(Ljava/nio/ByteBuffer;)V

    .line 14
    iget v0, p0, Ltop/fifthlight/touchcontroller/proxy/message/AddPointerMessage;->index:I

    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    .line 15
    iget v0, p0, Ltop/fifthlight/touchcontroller/proxy/message/AddPointerMessage;->x:F

    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->putFloat(F)Ljava/nio/ByteBuffer;

    .line 16
    iget v0, p0, Ltop/fifthlight/touchcontroller/proxy/message/AddPointerMessage;->y:F

    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->putFloat(F)Ljava/nio/ByteBuffer;

    .line 17
    return-void
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 5

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Ltop/fifthlight/touchcontroller/proxy/message/AddPointerMessage;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    move-object v1, p1

    check-cast v1, Ltop/fifthlight/touchcontroller/proxy/message/AddPointerMessage;

    iget v3, p0, Ltop/fifthlight/touchcontroller/proxy/message/AddPointerMessage;->index:I

    iget v4, v1, Ltop/fifthlight/touchcontroller/proxy/message/AddPointerMessage;->index:I

    if-eq v3, v4, :cond_2

    return v2

    :cond_2
    iget v3, p0, Ltop/fifthlight/touchcontroller/proxy/message/AddPointerMessage;->x:F

    iget v4, v1, Ltop/fifthlight/touchcontroller/proxy/message/AddPointerMessage;->x:F

    invoke-static {v3, v4}, Ljava/lang/Float;->compare(FF)I

    move-result v3

    if-eqz v3, :cond_3

    return v2

    :cond_3
    iget v3, p0, Ltop/fifthlight/touchcontroller/proxy/message/AddPointerMessage;->y:F

    iget v1, v1, Ltop/fifthlight/touchcontroller/proxy/message/AddPointerMessage;->y:F

    invoke-static {v3, v1}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getIndex()I
    .locals 1

    .line 6
    iget v0, p0, Ltop/fifthlight/touchcontroller/proxy/message/AddPointerMessage;->index:I

    return v0
.end method

.method public getType()I
    .locals 1

    .line 10
    iget v0, p0, Ltop/fifthlight/touchcontroller/proxy/message/AddPointerMessage;->type:I

    return v0
.end method

.method public final getX()F
    .locals 1

    .line 7
    iget v0, p0, Ltop/fifthlight/touchcontroller/proxy/message/AddPointerMessage;->x:F

    return v0
.end method

.method public final getY()F
    .locals 1

    .line 8
    iget v0, p0, Ltop/fifthlight/touchcontroller/proxy/message/AddPointerMessage;->y:F

    return v0
.end method

.method public hashCode()I
    .locals 3

    iget v0, p0, Ltop/fifthlight/touchcontroller/proxy/message/AddPointerMessage;->index:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    mul-int/lit8 v1, v0, 0x1f

    iget v2, p0, Ltop/fifthlight/touchcontroller/proxy/message/AddPointerMessage;->x:F

    invoke-static {v2}, Ljava/lang/Float;->hashCode(F)I

    move-result v2

    add-int/2addr v1, v2

    mul-int/lit8 v0, v1, 0x1f

    iget v2, p0, Ltop/fifthlight/touchcontroller/proxy/message/AddPointerMessage;->y:F

    invoke-static {v2}, Ljava/lang/Float;->hashCode(F)I

    move-result v2

    add-int/2addr v0, v2

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "AddPointerMessage(index="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Ltop/fifthlight/touchcontroller/proxy/message/AddPointerMessage;->index:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", x="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Ltop/fifthlight/touchcontroller/proxy/message/AddPointerMessage;->x:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", y="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Ltop/fifthlight/touchcontroller/proxy/message/AddPointerMessage;->y:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
