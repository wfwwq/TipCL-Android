.class public final Ltop/fifthlight/touchcontroller/proxy/message/MoveViewMessage$Decoder;
.super Ltop/fifthlight/touchcontroller/proxy/message/ProxyMessageDecoder;
.source "MoveViewMessage.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ltop/fifthlight/touchcontroller/proxy/message/MoveViewMessage;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Decoder"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ltop/fifthlight/touchcontroller/proxy/message/ProxyMessageDecoder<",
        "Ltop/fifthlight/touchcontroller/proxy/message/MoveViewMessage;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\u0008\u00c6\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016\u00a8\u0006\u0008"
    }
    d2 = {
        "Ltop/fifthlight/touchcontroller/proxy/message/MoveViewMessage$Decoder;",
        "Ltop/fifthlight/touchcontroller/proxy/message/ProxyMessageDecoder;",
        "Ltop/fifthlight/touchcontroller/proxy/message/MoveViewMessage;",
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
.field public static final INSTANCE:Ltop/fifthlight/touchcontroller/proxy/message/MoveViewMessage$Decoder;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ltop/fifthlight/touchcontroller/proxy/message/MoveViewMessage$Decoder;

    invoke-direct {v0}, Ltop/fifthlight/touchcontroller/proxy/message/MoveViewMessage$Decoder;-><init>()V

    sput-object v0, Ltop/fifthlight/touchcontroller/proxy/message/MoveViewMessage$Decoder;->INSTANCE:Ltop/fifthlight/touchcontroller/proxy/message/MoveViewMessage$Decoder;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 25
    invoke-direct {p0}, Ltop/fifthlight/touchcontroller/proxy/message/ProxyMessageDecoder;-><init>()V

    return-void
.end method


# virtual methods
.method public decode(Ljava/nio/ByteBuffer;)Ltop/fifthlight/touchcontroller/proxy/message/MoveViewMessage;
    .locals 4
    .param p1, "payload"    # Ljava/nio/ByteBuffer;

    const-string v0, "payload"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->remaining()I

    move-result v0

    const/4 v1, 0x5

    if-lt v0, v1, :cond_1

    .line 30
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->get()B

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 31
    .local v0, "screenBased":Z
    :goto_0
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->getFloat()F

    move-result v1

    .line 32
    .local v1, "deltaPitch":F
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->getFloat()F

    move-result v2

    .line 33
    .local v2, "deltaYaw":F
    new-instance v3, Ltop/fifthlight/touchcontroller/proxy/message/MoveViewMessage;

    invoke-direct {v3, v0, v1, v2}, Ltop/fifthlight/touchcontroller/proxy/message/MoveViewMessage;-><init>(ZFF)V

    return-object v3

    .line 28
    .end local v0    # "screenBased":Z
    .end local v1    # "deltaPitch":F
    .end local v2    # "deltaYaw":F
    :cond_1
    new-instance v0, Ltop/fifthlight/touchcontroller/proxy/message/BadMessageLengthException;

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->remaining()I

    move-result v2

    invoke-direct {v0, v1, v2}, Ltop/fifthlight/touchcontroller/proxy/message/BadMessageLengthException;-><init>(II)V

    throw v0
.end method

.method public bridge synthetic decode(Ljava/nio/ByteBuffer;)Ltop/fifthlight/touchcontroller/proxy/message/ProxyMessage;
    .locals 1
    .param p1, "payload"    # Ljava/nio/ByteBuffer;

    .line 25
    invoke-virtual {p0, p1}, Ltop/fifthlight/touchcontroller/proxy/message/MoveViewMessage$Decoder;->decode(Ljava/nio/ByteBuffer;)Ltop/fifthlight/touchcontroller/proxy/message/MoveViewMessage;

    move-result-object v0

    check-cast v0, Ltop/fifthlight/touchcontroller/proxy/message/ProxyMessage;

    return-object v0
.end method
