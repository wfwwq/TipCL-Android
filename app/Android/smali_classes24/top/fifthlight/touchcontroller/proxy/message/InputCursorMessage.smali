.class public final Ltop/fifthlight/touchcontroller/proxy/message/InputCursorMessage;
.super Ltop/fifthlight/touchcontroller/proxy/message/ProxyMessage;
.source "InputCursorMessage.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ltop/fifthlight/touchcontroller/proxy/message/InputCursorMessage$Decoder;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\u0008\u0086\u0008\u0018\u00002\u00020\u0001:\u0001\u0019B\u0013\u0012\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0010\u0010\u000c\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0015\u0010\u0011\u001a\u00020\u00002\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u00d6\u0003J\t\u0010\u0016\u001a\u00020\tH\u00d6\u0001J\t\u0010\u0017\u001a\u00020\u0018H\u00d6\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007R\u0014\u0010\u0008\u001a\u00020\tX\u0096D\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000b\u00a8\u0006\u001a"
    }
    d2 = {
        "Ltop/fifthlight/touchcontroller/proxy/message/InputCursorMessage;",
        "Ltop/fifthlight/touchcontroller/proxy/message/ProxyMessage;",
        "cursorRect",
        "Ltop/fifthlight/touchcontroller/proxy/message/FloatRect;",
        "<init>",
        "(Ltop/fifthlight/touchcontroller/proxy/message/FloatRect;)V",
        "getCursorRect",
        "()Ltop/fifthlight/touchcontroller/proxy/message/FloatRect;",
        "type",
        "",
        "getType",
        "()I",
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
.field private final cursorRect:Ltop/fifthlight/touchcontroller/proxy/message/FloatRect;

.field private final type:I


# direct methods
.method public constructor <init>()V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-direct {p0, v0, v1, v0}, Ltop/fifthlight/touchcontroller/proxy/message/InputCursorMessage;-><init>(Ltop/fifthlight/touchcontroller/proxy/message/FloatRect;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Ltop/fifthlight/touchcontroller/proxy/message/FloatRect;)V
    .locals 1
    .param p1, "cursorRect"    # Ltop/fifthlight/touchcontroller/proxy/message/FloatRect;

    .line 7
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Ltop/fifthlight/touchcontroller/proxy/message/ProxyMessage;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 6
    iput-object p1, p0, Ltop/fifthlight/touchcontroller/proxy/message/InputCursorMessage;->cursorRect:Ltop/fifthlight/touchcontroller/proxy/message/FloatRect;

    .line 8
    const/16 v0, 0x9

    iput v0, p0, Ltop/fifthlight/touchcontroller/proxy/message/InputCursorMessage;->type:I

    .line 5
    return-void
.end method

.method public synthetic constructor <init>(Ltop/fifthlight/touchcontroller/proxy/message/FloatRect;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 5
    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    .line 6
    const/4 p1, 0x0

    .line 5
    :cond_0
    invoke-direct {p0, p1}, Ltop/fifthlight/touchcontroller/proxy/message/InputCursorMessage;-><init>(Ltop/fifthlight/touchcontroller/proxy/message/FloatRect;)V

    .line 7
    return-void
.end method

.method public static synthetic copy$default(Ltop/fifthlight/touchcontroller/proxy/message/InputCursorMessage;Ltop/fifthlight/touchcontroller/proxy/message/FloatRect;ILjava/lang/Object;)Ltop/fifthlight/touchcontroller/proxy/message/InputCursorMessage;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    iget-object p1, p0, Ltop/fifthlight/touchcontroller/proxy/message/InputCursorMessage;->cursorRect:Ltop/fifthlight/touchcontroller/proxy/message/FloatRect;

    :cond_0
    invoke-virtual {p0, p1}, Ltop/fifthlight/touchcontroller/proxy/message/InputCursorMessage;->copy(Ltop/fifthlight/touchcontroller/proxy/message/FloatRect;)Ltop/fifthlight/touchcontroller/proxy/message/InputCursorMessage;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ltop/fifthlight/touchcontroller/proxy/message/FloatRect;
    .locals 1

    iget-object v0, p0, Ltop/fifthlight/touchcontroller/proxy/message/InputCursorMessage;->cursorRect:Ltop/fifthlight/touchcontroller/proxy/message/FloatRect;

    return-object v0
.end method

.method public final copy(Ltop/fifthlight/touchcontroller/proxy/message/FloatRect;)Ltop/fifthlight/touchcontroller/proxy/message/InputCursorMessage;
    .locals 1

    new-instance v0, Ltop/fifthlight/touchcontroller/proxy/message/InputCursorMessage;

    invoke-direct {v0, p1}, Ltop/fifthlight/touchcontroller/proxy/message/InputCursorMessage;-><init>(Ltop/fifthlight/touchcontroller/proxy/message/FloatRect;)V

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
    iget-object v0, p0, Ltop/fifthlight/touchcontroller/proxy/message/InputCursorMessage;->cursorRect:Ltop/fifthlight/touchcontroller/proxy/message/FloatRect;

    if-eqz v0, :cond_0

    .line 13
    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 14
    iget-object v0, p0, Ltop/fifthlight/touchcontroller/proxy/message/InputCursorMessage;->cursorRect:Ltop/fifthlight/touchcontroller/proxy/message/FloatRect;

    invoke-virtual {v0}, Ltop/fifthlight/touchcontroller/proxy/message/FloatRect;->getLeft()F

    move-result v0

    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->putFloat(F)Ljava/nio/ByteBuffer;

    .line 15
    iget-object v0, p0, Ltop/fifthlight/touchcontroller/proxy/message/InputCursorMessage;->cursorRect:Ltop/fifthlight/touchcontroller/proxy/message/FloatRect;

    invoke-virtual {v0}, Ltop/fifthlight/touchcontroller/proxy/message/FloatRect;->getTop()F

    move-result v0

    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->putFloat(F)Ljava/nio/ByteBuffer;

    .line 16
    iget-object v0, p0, Ltop/fifthlight/touchcontroller/proxy/message/InputCursorMessage;->cursorRect:Ltop/fifthlight/touchcontroller/proxy/message/FloatRect;

    invoke-virtual {v0}, Ltop/fifthlight/touchcontroller/proxy/message/FloatRect;->getWidth()F

    move-result v0

    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->putFloat(F)Ljava/nio/ByteBuffer;

    .line 17
    iget-object v0, p0, Ltop/fifthlight/touchcontroller/proxy/message/InputCursorMessage;->cursorRect:Ltop/fifthlight/touchcontroller/proxy/message/FloatRect;

    invoke-virtual {v0}, Ltop/fifthlight/touchcontroller/proxy/message/FloatRect;->getHeight()F

    move-result v0

    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->putFloat(F)Ljava/nio/ByteBuffer;

    goto :goto_0

    .line 19
    :cond_0
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 21
    :goto_0
    return-void
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Ltop/fifthlight/touchcontroller/proxy/message/InputCursorMessage;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    move-object v1, p1

    check-cast v1, Ltop/fifthlight/touchcontroller/proxy/message/InputCursorMessage;

    iget-object v3, p0, Ltop/fifthlight/touchcontroller/proxy/message/InputCursorMessage;->cursorRect:Ltop/fifthlight/touchcontroller/proxy/message/FloatRect;

    iget-object v1, v1, Ltop/fifthlight/touchcontroller/proxy/message/InputCursorMessage;->cursorRect:Ltop/fifthlight/touchcontroller/proxy/message/FloatRect;

    invoke-static {v3, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public final getCursorRect()Ltop/fifthlight/touchcontroller/proxy/message/FloatRect;
    .locals 1

    .line 6
    iget-object v0, p0, Ltop/fifthlight/touchcontroller/proxy/message/InputCursorMessage;->cursorRect:Ltop/fifthlight/touchcontroller/proxy/message/FloatRect;

    return-object v0
.end method

.method public getType()I
    .locals 1

    .line 8
    iget v0, p0, Ltop/fifthlight/touchcontroller/proxy/message/InputCursorMessage;->type:I

    return v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Ltop/fifthlight/touchcontroller/proxy/message/InputCursorMessage;->cursorRect:Ltop/fifthlight/touchcontroller/proxy/message/FloatRect;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Ltop/fifthlight/touchcontroller/proxy/message/InputCursorMessage;->cursorRect:Ltop/fifthlight/touchcontroller/proxy/message/FloatRect;

    invoke-virtual {v0}, Ltop/fifthlight/touchcontroller/proxy/message/FloatRect;->hashCode()I

    move-result v0

    :goto_0
    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "InputCursorMessage(cursorRect="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Ltop/fifthlight/touchcontroller/proxy/message/InputCursorMessage;->cursorRect:Ltop/fifthlight/touchcontroller/proxy/message/FloatRect;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
