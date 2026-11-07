.class public final Ltop/fifthlight/touchcontroller/proxy/message/InputStatusMessage;
.super Ltop/fifthlight/touchcontroller/proxy/message/ProxyMessage;
.source "InputStatusMessage.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ltop/fifthlight/touchcontroller/proxy/message/InputStatusMessage$Decoder;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\u0008\u0086\u0008\u0018\u00002\u00020\u0001:\u0001\u001cB\u0011\u0012\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0015\u0010\u0015\u001a\u00020\u00002\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010\u0016\u001a\u00020\r2\u0008\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u00d6\u0003J\t\u0010\u0019\u001a\u00020\tH\u00d6\u0001J\t\u0010\u001a\u001a\u00020\u001bH\u00d6\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007R\u0014\u0010\u0008\u001a\u00020\tX\u0096D\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000bR\u0014\u0010\u000c\u001a\u00020\r8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u001d"
    }
    d2 = {
        "Ltop/fifthlight/touchcontroller/proxy/message/InputStatusMessage;",
        "Ltop/fifthlight/touchcontroller/proxy/message/ProxyMessage;",
        "status",
        "Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;",
        "<init>",
        "(Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;)V",
        "getStatus",
        "()Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;",
        "type",
        "",
        "getType",
        "()I",
        "wrapInLargeMessage",
        "",
        "getWrapInLargeMessage",
        "()Z",
        "encode",
        "",
        "buffer",
        "Ljava/nio/ByteBuffer;",
        "component1",
        "copy",
        "equals",
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
.field private final status:Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;

.field private final type:I


# direct methods
.method public constructor <init>(Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;)V
    .locals 1
    .param p1, "status"    # Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;

    .line 42
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Ltop/fifthlight/touchcontroller/proxy/message/ProxyMessage;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 41
    iput-object p1, p0, Ltop/fifthlight/touchcontroller/proxy/message/InputStatusMessage;->status:Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;

    .line 43
    const/4 v0, 0x7

    iput v0, p0, Ltop/fifthlight/touchcontroller/proxy/message/InputStatusMessage;->type:I

    .line 40
    return-void
.end method

.method public static synthetic copy$default(Ltop/fifthlight/touchcontroller/proxy/message/InputStatusMessage;Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;ILjava/lang/Object;)Ltop/fifthlight/touchcontroller/proxy/message/InputStatusMessage;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    iget-object p1, p0, Ltop/fifthlight/touchcontroller/proxy/message/InputStatusMessage;->status:Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;

    :cond_0
    invoke-virtual {p0, p1}, Ltop/fifthlight/touchcontroller/proxy/message/InputStatusMessage;->copy(Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;)Ltop/fifthlight/touchcontroller/proxy/message/InputStatusMessage;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;
    .locals 1

    iget-object v0, p0, Ltop/fifthlight/touchcontroller/proxy/message/InputStatusMessage;->status:Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;

    return-object v0
.end method

.method public final copy(Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;)Ltop/fifthlight/touchcontroller/proxy/message/InputStatusMessage;
    .locals 1

    new-instance v0, Ltop/fifthlight/touchcontroller/proxy/message/InputStatusMessage;

    invoke-direct {v0, p1}, Ltop/fifthlight/touchcontroller/proxy/message/InputStatusMessage;-><init>(Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;)V

    return-object v0
.end method

.method public encode(Ljava/nio/ByteBuffer;)V
    .locals 6
    .param p1, "buffer"    # Ljava/nio/ByteBuffer;

    const-string v0, "buffer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 49
    invoke-super {p0, p1}, Ltop/fifthlight/touchcontroller/proxy/message/ProxyMessage;->encode(Ljava/nio/ByteBuffer;)V

    .line 50
    iget-object v0, p0, Ltop/fifthlight/touchcontroller/proxy/message/InputStatusMessage;->status:Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;

    if-nez v0, :cond_0

    .line 51
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    goto/16 :goto_0

    .line 53
    :cond_0
    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 54
    iget-object v0, p0, Ltop/fifthlight/touchcontroller/proxy/message/InputStatusMessage;->status:Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;

    invoke-virtual {v0}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;->getText()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkotlin/text/StringsKt;->encodeToByteArray(Ljava/lang/String;)[B

    move-result-object v0

    .line 55
    .local v0, "encoded":[B
    array-length v1, v0

    invoke-virtual {p1, v1}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    .line 56
    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 58
    iget-object v1, p0, Ltop/fifthlight/touchcontroller/proxy/message/InputStatusMessage;->status:Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;

    invoke-virtual {v1}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;->getText()Ljava/lang/String;

    move-result-object v1

    .line 59
    iget-object v2, p0, Ltop/fifthlight/touchcontroller/proxy/message/InputStatusMessage;->status:Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;

    invoke-virtual {v2}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;->getComposition()Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;

    move-result-object v2

    invoke-virtual {v2}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;->getStart()I

    move-result v2

    .line 60
    iget-object v3, p0, Ltop/fifthlight/touchcontroller/proxy/message/InputStatusMessage;->status:Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;

    invoke-virtual {v3}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;->getComposition()Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;

    move-result-object v3

    invoke-virtual {v3}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;->getLength()I

    move-result v3

    .line 58
    invoke-static {v1, v2, v3}, Ltop/fifthlight/touchcontroller/proxy/message/InputStatusMessageKt;->access$convertUtf16RangeToUtf8(Ljava/lang/String;II)Lkotlin/Pair;

    move-result-object v1

    invoke-virtual {v1}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    .local v2, "compStart":I
    invoke-virtual {v1}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    .line 62
    .local v1, "compLen":I
    invoke-virtual {p1, v2}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    .line 63
    invoke-virtual {p1, v1}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    .line 65
    iget-object v3, p0, Ltop/fifthlight/touchcontroller/proxy/message/InputStatusMessage;->status:Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;

    invoke-virtual {v3}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;->getText()Ljava/lang/String;

    move-result-object v3

    .line 66
    iget-object v4, p0, Ltop/fifthlight/touchcontroller/proxy/message/InputStatusMessage;->status:Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;

    invoke-virtual {v4}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;->getSelection()Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;

    move-result-object v4

    invoke-virtual {v4}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;->getStart()I

    move-result v4

    .line 67
    iget-object v5, p0, Ltop/fifthlight/touchcontroller/proxy/message/InputStatusMessage;->status:Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;

    invoke-virtual {v5}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;->getSelection()Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;

    move-result-object v5

    invoke-virtual {v5}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;->getLength()I

    move-result v5

    .line 65
    invoke-static {v3, v4, v5}, Ltop/fifthlight/touchcontroller/proxy/message/InputStatusMessageKt;->access$convertUtf16RangeToUtf8(Ljava/lang/String;II)Lkotlin/Pair;

    move-result-object v3

    invoke-virtual {v3}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    move-result v4

    .local v4, "selStart":I
    invoke-virtual {v3}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    move-result v3

    .line 69
    .local v3, "selLen":I
    invoke-virtual {p1, v4}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    .line 70
    invoke-virtual {p1, v3}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    .line 72
    iget-object v5, p0, Ltop/fifthlight/touchcontroller/proxy/message/InputStatusMessage;->status:Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;

    invoke-virtual {v5}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;->getSelectionLeft()Z

    move-result v5

    invoke-virtual {p1, v5}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 74
    .end local v0    # "encoded":[B
    .end local v1    # "compLen":I
    .end local v2    # "compStart":I
    .end local v3    # "selLen":I
    .end local v4    # "selStart":I
    :goto_0
    return-void
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Ltop/fifthlight/touchcontroller/proxy/message/InputStatusMessage;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    move-object v1, p1

    check-cast v1, Ltop/fifthlight/touchcontroller/proxy/message/InputStatusMessage;

    iget-object v3, p0, Ltop/fifthlight/touchcontroller/proxy/message/InputStatusMessage;->status:Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;

    iget-object v1, v1, Ltop/fifthlight/touchcontroller/proxy/message/InputStatusMessage;->status:Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;

    invoke-static {v3, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public final getStatus()Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;
    .locals 1

    .line 41
    iget-object v0, p0, Ltop/fifthlight/touchcontroller/proxy/message/InputStatusMessage;->status:Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;

    return-object v0
.end method

.method public getType()I
    .locals 1

    .line 43
    iget v0, p0, Ltop/fifthlight/touchcontroller/proxy/message/InputStatusMessage;->type:I

    return v0
.end method

.method public getWrapInLargeMessage()Z
    .locals 1

    .line 46
    const/4 v0, 0x1

    return v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Ltop/fifthlight/touchcontroller/proxy/message/InputStatusMessage;->status:Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Ltop/fifthlight/touchcontroller/proxy/message/InputStatusMessage;->status:Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;

    invoke-virtual {v0}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;->hashCode()I

    move-result v0

    :goto_0
    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "InputStatusMessage(status="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Ltop/fifthlight/touchcontroller/proxy/message/InputStatusMessage;->status:Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
