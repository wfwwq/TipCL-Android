.class public final Ltop/fifthlight/touchcontroller/proxy/message/ClearPointerMessage$Decoder;
.super Ltop/fifthlight/touchcontroller/proxy/message/ProxyMessageDecoder;
.source "ClearPointerMessage.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ltop/fifthlight/touchcontroller/proxy/message/ClearPointerMessage;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Decoder"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ltop/fifthlight/touchcontroller/proxy/message/ProxyMessageDecoder<",
        "Ltop/fifthlight/touchcontroller/proxy/message/ClearPointerMessage;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\u0008\u00c6\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016\u00a8\u0006\u0008"
    }
    d2 = {
        "Ltop/fifthlight/touchcontroller/proxy/message/ClearPointerMessage$Decoder;",
        "Ltop/fifthlight/touchcontroller/proxy/message/ProxyMessageDecoder;",
        "Ltop/fifthlight/touchcontroller/proxy/message/ClearPointerMessage;",
        "<init>",
        "()V",
        "decode",
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


# static fields
.field public static final INSTANCE:Ltop/fifthlight/touchcontroller/proxy/message/ClearPointerMessage$Decoder;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ltop/fifthlight/touchcontroller/proxy/message/ClearPointerMessage$Decoder;

    invoke-direct {v0}, Ltop/fifthlight/touchcontroller/proxy/message/ClearPointerMessage$Decoder;-><init>()V

    sput-object v0, Ltop/fifthlight/touchcontroller/proxy/message/ClearPointerMessage$Decoder;->INSTANCE:Ltop/fifthlight/touchcontroller/proxy/message/ClearPointerMessage$Decoder;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 8
    invoke-direct {p0}, Ltop/fifthlight/touchcontroller/proxy/message/ProxyMessageDecoder;-><init>()V

    return-void
.end method


# virtual methods
.method public decode(Ljava/nio/ByteBuffer;)Ltop/fifthlight/touchcontroller/proxy/message/ClearPointerMessage;
    .locals 3
    .param p1, "payload"    # Ljava/nio/ByteBuffer;

    const-string v0, "payload"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->hasRemaining()Z

    move-result v0

    if-nez v0, :cond_0

    .line 16
    sget-object v0, Ltop/fifthlight/touchcontroller/proxy/message/ClearPointerMessage;->INSTANCE:Ltop/fifthlight/touchcontroller/proxy/message/ClearPointerMessage;

    return-object v0

    .line 11
    :cond_0
    new-instance v0, Ltop/fifthlight/touchcontroller/proxy/message/BadMessageLengthException;

    .line 12
    nop

    .line 13
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->remaining()I

    move-result v1

    .line 11
    const/4 v2, 0x0

    invoke-direct {v0, v2, v1}, Ltop/fifthlight/touchcontroller/proxy/message/BadMessageLengthException;-><init>(II)V

    throw v0
.end method

.method public bridge synthetic decode(Ljava/nio/ByteBuffer;)Ltop/fifthlight/touchcontroller/proxy/message/ProxyMessage;
    .locals 1
    .param p1, "payload"    # Ljava/nio/ByteBuffer;

    .line 8
    invoke-virtual {p0, p1}, Ltop/fifthlight/touchcontroller/proxy/message/ClearPointerMessage$Decoder;->decode(Ljava/nio/ByteBuffer;)Ltop/fifthlight/touchcontroller/proxy/message/ClearPointerMessage;

    move-result-object v0

    check-cast v0, Ltop/fifthlight/touchcontroller/proxy/message/ProxyMessage;

    return-object v0
.end method
