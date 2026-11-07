.class public final Ltop/fifthlight/touchcontroller/proxy/message/CapabilityMessage$Decoder;
.super Ltop/fifthlight/touchcontroller/proxy/message/ProxyMessageDecoder;
.source "CapabilityMessage.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ltop/fifthlight/touchcontroller/proxy/message/CapabilityMessage;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Decoder"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ltop/fifthlight/touchcontroller/proxy/message/ProxyMessageDecoder<",
        "Ltop/fifthlight/touchcontroller/proxy/message/CapabilityMessage;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\u0008\u00c6\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016\u00a8\u0006\u0008"
    }
    d2 = {
        "Ltop/fifthlight/touchcontroller/proxy/message/CapabilityMessage$Decoder;",
        "Ltop/fifthlight/touchcontroller/proxy/message/ProxyMessageDecoder;",
        "Ltop/fifthlight/touchcontroller/proxy/message/CapabilityMessage;",
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
.field public static final INSTANCE:Ltop/fifthlight/touchcontroller/proxy/message/CapabilityMessage$Decoder;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ltop/fifthlight/touchcontroller/proxy/message/CapabilityMessage$Decoder;

    invoke-direct {v0}, Ltop/fifthlight/touchcontroller/proxy/message/CapabilityMessage$Decoder;-><init>()V

    sput-object v0, Ltop/fifthlight/touchcontroller/proxy/message/CapabilityMessage$Decoder;->INSTANCE:Ltop/fifthlight/touchcontroller/proxy/message/CapabilityMessage$Decoder;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 26
    invoke-direct {p0}, Ltop/fifthlight/touchcontroller/proxy/message/ProxyMessageDecoder;-><init>()V

    return-void
.end method


# virtual methods
.method public decode(Ljava/nio/ByteBuffer;)Ltop/fifthlight/touchcontroller/proxy/message/CapabilityMessage;
    .locals 5
    .param p1, "payload"    # Ljava/nio/ByteBuffer;

    const-string v0, "payload"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->remaining()I

    move-result v0

    const/4 v1, 0x2

    if-lt v0, v1, :cond_3

    .line 34
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->get()B

    move-result v0

    invoke-static {v0}, Lkotlin/UInt;->constructor-impl(I)I

    move-result v0

    .line 35
    .local v0, "length":I
    if-lez v0, :cond_2

    .line 38
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->remaining()I

    move-result v1

    add-int/lit8 v2, v0, 0x1

    if-ne v1, v2, :cond_1

    .line 44
    new-array v1, v0, [B

    .line 45
    .local v1, "byteArray":[B
    invoke-virtual {p1, v1}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    .line 46
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->get()B

    move-result v2

    invoke-static {v2}, Lkotlin/UInt;->constructor-impl(I)I

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    .line 47
    .local v2, "enabled":Z
    :goto_0
    new-instance v3, Ltop/fifthlight/touchcontroller/proxy/message/CapabilityMessage;

    .line 48
    invoke-static {v1}, Lkotlin/text/StringsKt;->decodeToString([B)Ljava/lang/String;

    move-result-object v4

    .line 49
    nop

    .line 47
    invoke-direct {v3, v4, v2}, Ltop/fifthlight/touchcontroller/proxy/message/CapabilityMessage;-><init>(Ljava/lang/String;Z)V

    return-object v3

    .line 39
    .end local v1    # "byteArray":[B
    .end local v2    # "enabled":Z
    :cond_1
    new-instance v1, Ltop/fifthlight/touchcontroller/proxy/message/BadMessageLengthException;

    .line 40
    add-int/lit8 v2, v0, 0x1

    .line 41
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->remaining()I

    move-result v3

    .line 39
    invoke-direct {v1, v2, v3}, Ltop/fifthlight/touchcontroller/proxy/message/BadMessageLengthException;-><init>(II)V

    throw v1

    .line 36
    :cond_2
    new-instance v1, Ltop/fifthlight/touchcontroller/proxy/message/BadMessageException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Bad capability message: length "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ltop/fifthlight/touchcontroller/proxy/message/BadMessageException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 29
    .end local v0    # "length":I
    :cond_3
    new-instance v0, Ltop/fifthlight/touchcontroller/proxy/message/BadMessageLengthException;

    .line 30
    nop

    .line 31
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->remaining()I

    move-result v2

    .line 29
    invoke-direct {v0, v1, v2}, Ltop/fifthlight/touchcontroller/proxy/message/BadMessageLengthException;-><init>(II)V

    throw v0
.end method

.method public bridge synthetic decode(Ljava/nio/ByteBuffer;)Ltop/fifthlight/touchcontroller/proxy/message/ProxyMessage;
    .locals 1
    .param p1, "payload"    # Ljava/nio/ByteBuffer;

    .line 26
    invoke-virtual {p0, p1}, Ltop/fifthlight/touchcontroller/proxy/message/CapabilityMessage$Decoder;->decode(Ljava/nio/ByteBuffer;)Ltop/fifthlight/touchcontroller/proxy/message/CapabilityMessage;

    move-result-object v0

    check-cast v0, Ltop/fifthlight/touchcontroller/proxy/message/ProxyMessage;

    return-object v0
.end method
