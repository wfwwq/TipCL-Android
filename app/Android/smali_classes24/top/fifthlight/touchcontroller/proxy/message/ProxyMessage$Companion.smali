.class public final Ltop/fifthlight/touchcontroller/proxy/message/ProxyMessage$Companion;
.super Ljava/lang/Object;
.source "ProxyMessage.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ltop/fifthlight/touchcontroller/proxy/message/ProxyMessage;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\t\u00a8\u0006\n"
    }
    d2 = {
        "Ltop/fifthlight/touchcontroller/proxy/message/ProxyMessage$Companion;",
        "",
        "<init>",
        "()V",
        "decode",
        "Ltop/fifthlight/touchcontroller/proxy/message/ProxyMessage;",
        "type",
        "",
        "payload",
        "Ljava/nio/ByteBuffer;",
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


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Ltop/fifthlight/touchcontroller/proxy/message/ProxyMessage$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final decode(ILjava/nio/ByteBuffer;)Ltop/fifthlight/touchcontroller/proxy/message/ProxyMessage;
    .locals 1
    .param p1, "type"    # I
    .param p2, "payload"    # Ljava/nio/ByteBuffer;

    const-string v0, "payload"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    packed-switch p1, :pswitch_data_0

    .line 28
    new-instance v0, Ltop/fifthlight/touchcontroller/proxy/message/BadMessageTypeException;

    invoke-direct {v0, p1}, Ltop/fifthlight/touchcontroller/proxy/message/BadMessageTypeException;-><init>(I)V

    throw v0

    .line 27
    :pswitch_0
    sget-object v0, Ltop/fifthlight/touchcontroller/proxy/message/MoveViewMessage$Decoder;->INSTANCE:Ltop/fifthlight/touchcontroller/proxy/message/MoveViewMessage$Decoder;

    check-cast v0, Ltop/fifthlight/touchcontroller/proxy/message/ProxyMessageDecoder;

    goto :goto_0

    .line 26
    :pswitch_1
    sget-object v0, Ltop/fifthlight/touchcontroller/proxy/message/InputAreaMessage$Decoder;->INSTANCE:Ltop/fifthlight/touchcontroller/proxy/message/InputAreaMessage$Decoder;

    check-cast v0, Ltop/fifthlight/touchcontroller/proxy/message/ProxyMessageDecoder;

    goto :goto_0

    .line 25
    :pswitch_2
    sget-object v0, Ltop/fifthlight/touchcontroller/proxy/message/InitializeMessage$Decoder;->INSTANCE:Ltop/fifthlight/touchcontroller/proxy/message/InitializeMessage$Decoder;

    check-cast v0, Ltop/fifthlight/touchcontroller/proxy/message/ProxyMessageDecoder;

    goto :goto_0

    .line 24
    :pswitch_3
    sget-object v0, Ltop/fifthlight/touchcontroller/proxy/message/InputCursorMessage$Decoder;->INSTANCE:Ltop/fifthlight/touchcontroller/proxy/message/InputCursorMessage$Decoder;

    check-cast v0, Ltop/fifthlight/touchcontroller/proxy/message/ProxyMessageDecoder;

    goto :goto_0

    .line 23
    :pswitch_4
    sget-object v0, Ltop/fifthlight/touchcontroller/proxy/message/KeyboardShowMessage$Decoder;->INSTANCE:Ltop/fifthlight/touchcontroller/proxy/message/KeyboardShowMessage$Decoder;

    check-cast v0, Ltop/fifthlight/touchcontroller/proxy/message/ProxyMessageDecoder;

    goto :goto_0

    .line 22
    :pswitch_5
    sget-object v0, Ltop/fifthlight/touchcontroller/proxy/message/InputStatusMessage$Decoder;->INSTANCE:Ltop/fifthlight/touchcontroller/proxy/message/InputStatusMessage$Decoder;

    check-cast v0, Ltop/fifthlight/touchcontroller/proxy/message/ProxyMessageDecoder;

    goto :goto_0

    .line 21
    :pswitch_6
    sget-object v0, Ltop/fifthlight/touchcontroller/proxy/message/LargeMessage$Decoder;->INSTANCE:Ltop/fifthlight/touchcontroller/proxy/message/LargeMessage$Decoder;

    check-cast v0, Ltop/fifthlight/touchcontroller/proxy/message/ProxyMessageDecoder;

    goto :goto_0

    .line 20
    :pswitch_7
    sget-object v0, Ltop/fifthlight/touchcontroller/proxy/message/CapabilityMessage$Decoder;->INSTANCE:Ltop/fifthlight/touchcontroller/proxy/message/CapabilityMessage$Decoder;

    check-cast v0, Ltop/fifthlight/touchcontroller/proxy/message/ProxyMessageDecoder;

    goto :goto_0

    .line 19
    :pswitch_8
    sget-object v0, Ltop/fifthlight/touchcontroller/proxy/message/VibrateMessage$Decoder;->INSTANCE:Ltop/fifthlight/touchcontroller/proxy/message/VibrateMessage$Decoder;

    check-cast v0, Ltop/fifthlight/touchcontroller/proxy/message/ProxyMessageDecoder;

    goto :goto_0

    .line 18
    :pswitch_9
    sget-object v0, Ltop/fifthlight/touchcontroller/proxy/message/ClearPointerMessage$Decoder;->INSTANCE:Ltop/fifthlight/touchcontroller/proxy/message/ClearPointerMessage$Decoder;

    check-cast v0, Ltop/fifthlight/touchcontroller/proxy/message/ProxyMessageDecoder;

    goto :goto_0

    .line 17
    :pswitch_a
    sget-object v0, Ltop/fifthlight/touchcontroller/proxy/message/RemovePointerMessage$Decoder;->INSTANCE:Ltop/fifthlight/touchcontroller/proxy/message/RemovePointerMessage$Decoder;

    check-cast v0, Ltop/fifthlight/touchcontroller/proxy/message/ProxyMessageDecoder;

    goto :goto_0

    .line 16
    :pswitch_b
    sget-object v0, Ltop/fifthlight/touchcontroller/proxy/message/AddPointerMessage$Decoder;->INSTANCE:Ltop/fifthlight/touchcontroller/proxy/message/AddPointerMessage$Decoder;

    check-cast v0, Ltop/fifthlight/touchcontroller/proxy/message/ProxyMessageDecoder;

    .line 29
    :goto_0
    invoke-virtual {v0, p2}, Ltop/fifthlight/touchcontroller/proxy/message/ProxyMessageDecoder;->decode(Ljava/nio/ByteBuffer;)Ltop/fifthlight/touchcontroller/proxy/message/ProxyMessage;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
