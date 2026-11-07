.class final Ltop/fifthlight/touchcontroller/proxy/client/transport/DatagramTransport;
.super Ljava/lang/Object;
.source "DatagramTransport.kt"

# interfaces
.implements Ltop/fifthlight/touchcontroller/proxy/client/MessageTransport;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\u0008\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000c\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u000c\u001a\u00020\rH\u0016J\u0008\u0010\u0010\u001a\u00020\u000bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0008\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"
    }
    d2 = {
        "Ltop/fifthlight/touchcontroller/proxy/client/transport/DatagramTransport;",
        "Ltop/fifthlight/touchcontroller/proxy/client/MessageTransport;",
        "channel",
        "Ljava/nio/channels/DatagramChannel;",
        "address",
        "Ljava/net/SocketAddress;",
        "<init>",
        "(Ljava/nio/channels/DatagramChannel;Ljava/net/SocketAddress;)V",
        "lockingSemaphore",
        "Ljava/util/concurrent/Semaphore;",
        "send",
        "",
        "buffer",
        "Ljava/nio/ByteBuffer;",
        "receive",
        "",
        "close",
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
.field private final address:Ljava/net/SocketAddress;

.field private final channel:Ljava/nio/channels/DatagramChannel;

.field private final lockingSemaphore:Ljava/util/concurrent/Semaphore;


# direct methods
.method public constructor <init>(Ljava/nio/channels/DatagramChannel;Ljava/net/SocketAddress;)V
    .locals 2
    .param p1, "channel"    # Ljava/nio/channels/DatagramChannel;
    .param p2, "address"    # Ljava/net/SocketAddress;

    const-string v0, "channel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "address"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    iput-object p1, p0, Ltop/fifthlight/touchcontroller/proxy/client/transport/DatagramTransport;->channel:Ljava/nio/channels/DatagramChannel;

    .line 14
    iput-object p2, p0, Ltop/fifthlight/touchcontroller/proxy/client/transport/DatagramTransport;->address:Ljava/net/SocketAddress;

    .line 16
    new-instance v0, Ljava/util/concurrent/Semaphore;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/Semaphore;-><init>(I)V

    iput-object v0, p0, Ltop/fifthlight/touchcontroller/proxy/client/transport/DatagramTransport;->lockingSemaphore:Ljava/util/concurrent/Semaphore;

    .line 12
    return-void
.end method


# virtual methods
.method public close()V
    .locals 1

    .line 28
    iget-object v0, p0, Ltop/fifthlight/touchcontroller/proxy/client/transport/DatagramTransport;->lockingSemaphore:Ljava/util/concurrent/Semaphore;

    invoke-virtual {v0}, Ljava/util/concurrent/Semaphore;->release()V

    .line 29
    return-void
.end method

.method public receive(Ljava/nio/ByteBuffer;)Z
    .locals 1
    .param p1, "buffer"    # Ljava/nio/ByteBuffer;

    const-string v0, "buffer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    iget-object v0, p0, Ltop/fifthlight/touchcontroller/proxy/client/transport/DatagramTransport;->lockingSemaphore:Ljava/util/concurrent/Semaphore;

    invoke-virtual {v0}, Ljava/util/concurrent/Semaphore;->acquire()V

    .line 24
    const/4 v0, 0x0

    return v0
.end method

.method public send(Ljava/nio/ByteBuffer;)V
    .locals 2
    .param p1, "buffer"    # Ljava/nio/ByteBuffer;

    const-string v0, "buffer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    iget-object v0, p0, Ltop/fifthlight/touchcontroller/proxy/client/transport/DatagramTransport;->channel:Ljava/nio/channels/DatagramChannel;

    iget-object v1, p0, Ltop/fifthlight/touchcontroller/proxy/client/transport/DatagramTransport;->address:Ljava/net/SocketAddress;

    invoke-virtual {v0, p1, v1}, Ljava/nio/channels/DatagramChannel;->send(Ljava/nio/ByteBuffer;Ljava/net/SocketAddress;)I

    .line 20
    return-void
.end method
