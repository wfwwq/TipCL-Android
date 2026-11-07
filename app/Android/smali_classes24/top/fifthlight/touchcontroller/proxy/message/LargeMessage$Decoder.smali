.class public final Ltop/fifthlight/touchcontroller/proxy/message/LargeMessage$Decoder;
.super Ltop/fifthlight/touchcontroller/proxy/message/ProxyMessageDecoder;
.source "LargeMessage.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ltop/fifthlight/touchcontroller/proxy/message/LargeMessage;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Decoder"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ltop/fifthlight/touchcontroller/proxy/message/ProxyMessageDecoder<",
        "Ltop/fifthlight/touchcontroller/proxy/message/LargeMessage;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\u0008\u00c6\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016\u00a8\u0006\u0008"
    }
    d2 = {
        "Ltop/fifthlight/touchcontroller/proxy/message/LargeMessage$Decoder;",
        "Ltop/fifthlight/touchcontroller/proxy/message/ProxyMessageDecoder;",
        "Ltop/fifthlight/touchcontroller/proxy/message/LargeMessage;",
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
.field public static final INSTANCE:Ltop/fifthlight/touchcontroller/proxy/message/LargeMessage$Decoder;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ltop/fifthlight/touchcontroller/proxy/message/LargeMessage$Decoder;

    invoke-direct {v0}, Ltop/fifthlight/touchcontroller/proxy/message/LargeMessage$Decoder;-><init>()V

    sput-object v0, Ltop/fifthlight/touchcontroller/proxy/message/LargeMessage$Decoder;->INSTANCE:Ltop/fifthlight/touchcontroller/proxy/message/LargeMessage$Decoder;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 32
    invoke-direct {p0}, Ltop/fifthlight/touchcontroller/proxy/message/ProxyMessageDecoder;-><init>()V

    return-void
.end method


# virtual methods
.method public decode(Ljava/nio/ByteBuffer;)Ltop/fifthlight/touchcontroller/proxy/message/LargeMessage;
    .locals 5
    .param p1, "payload"    # Ljava/nio/ByteBuffer;

    const-string v0, "payload"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 34
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->remaining()I

    move-result v0

    const/4 v1, 0x2

    if-lt v0, v1, :cond_2

    .line 40
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->get()B

    move-result v0

    invoke-static {v0}, Lkotlin/UInt;->constructor-impl(I)I

    move-result v0

    .line 41
    .local v0, "length":I
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->get()B

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    .line 42
    .local v1, "end":Z
    :goto_0
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->remaining()I

    move-result v2

    if-lt v2, v0, :cond_1

    .line 48
    new-array v2, v0, [B

    .line 49
    .local v2, "buffer":[B
    invoke-virtual {p1, v2}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    .line 50
    new-instance v3, Ltop/fifthlight/touchcontroller/proxy/message/LargeMessage;

    .line 51
    nop

    .line 52
    nop

    .line 50
    invoke-direct {v3, v2, v1}, Ltop/fifthlight/touchcontroller/proxy/message/LargeMessage;-><init>([BZ)V

    return-object v3

    .line 43
    .end local v2    # "buffer":[B
    :cond_1
    new-instance v2, Ltop/fifthlight/touchcontroller/proxy/message/BadMessageLengthException;

    .line 44
    add-int/lit8 v3, v0, 0x1

    .line 45
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->remaining()I

    move-result v4

    .line 43
    invoke-direct {v2, v3, v4}, Ltop/fifthlight/touchcontroller/proxy/message/BadMessageLengthException;-><init>(II)V

    throw v2

    .line 35
    .end local v0    # "length":I
    .end local v1    # "end":Z
    :cond_2
    new-instance v0, Ltop/fifthlight/touchcontroller/proxy/message/BadMessageLengthException;

    .line 36
    nop

    .line 37
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->remaining()I

    move-result v2

    .line 35
    invoke-direct {v0, v1, v2}, Ltop/fifthlight/touchcontroller/proxy/message/BadMessageLengthException;-><init>(II)V

    throw v0
.end method

.method public bridge synthetic decode(Ljava/nio/ByteBuffer;)Ltop/fifthlight/touchcontroller/proxy/message/ProxyMessage;
    .locals 1
    .param p1, "payload"    # Ljava/nio/ByteBuffer;

    .line 32
    invoke-virtual {p0, p1}, Ltop/fifthlight/touchcontroller/proxy/message/LargeMessage$Decoder;->decode(Ljava/nio/ByteBuffer;)Ltop/fifthlight/touchcontroller/proxy/message/LargeMessage;

    move-result-object v0

    check-cast v0, Ltop/fifthlight/touchcontroller/proxy/message/ProxyMessage;

    return-object v0
.end method
