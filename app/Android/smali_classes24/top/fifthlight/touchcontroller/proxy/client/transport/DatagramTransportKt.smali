.class public final Ltop/fifthlight/touchcontroller/proxy/client/transport/DatagramTransportKt;
.super Ljava/lang/Object;
.source "DatagramTransport.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\u001a\u0015\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007\u00a2\u0006\u0002\u0008\u0008\u001a\u001f\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\nH\u0007\u00a2\u0006\u0002\u0008\u0008\"\u0018\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u0003\u00a8\u0006\u000b"
    }
    d2 = {
        "ipv6LocalHostAddress",
        "Ljava/net/InetAddress;",
        "kotlin.jvm.PlatformType",
        "Ljava/net/InetAddress;",
        "DatagramTransport",
        "Ltop/fifthlight/touchcontroller/proxy/client/MessageTransport;",
        "address",
        "Ljava/net/SocketAddress;",
        "openDatagramLauncherSocketProxyClient",
        "port",
        "",
        "TouchController-Proxy-Client"
    }
    k = 0x2
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final ipv6LocalHostAddress:Ljava/net/InetAddress;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 32
    nop

    .line 33
    nop

    .line 34
    const/16 v0, 0x10

    new-array v0, v0, [B

    fill-array-data v0, :array_0

    .line 32
    const-string v1, "localhost"

    invoke-static {v1, v0}, Ljava/net/Inet6Address;->getByAddress(Ljava/lang/String;[B)Ljava/net/InetAddress;

    move-result-object v0

    sput-object v0, Ltop/fifthlight/touchcontroller/proxy/client/transport/DatagramTransportKt;->ipv6LocalHostAddress:Ljava/net/InetAddress;

    return-void

    :array_0
    .array-data 1
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x1t
    .end array-data
.end method

.method public static final openDatagramLauncherSocketProxyClient(I)Ltop/fifthlight/touchcontroller/proxy/client/MessageTransport;
    .locals 2
    .param p0, "port"    # I

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-static {v0, p0, v1, v0}, Ltop/fifthlight/touchcontroller/proxy/client/transport/DatagramTransportKt;->openDatagramLauncherSocketProxyClient$default(Ljava/net/InetAddress;IILjava/lang/Object;)Ltop/fifthlight/touchcontroller/proxy/client/MessageTransport;

    move-result-object v0

    .line 62
    return-object v0
.end method

.method public static final openDatagramLauncherSocketProxyClient(Ljava/net/InetAddress;I)Ltop/fifthlight/touchcontroller/proxy/client/MessageTransport;
    .locals 1
    .param p0, "address"    # Ljava/net/InetAddress;
    .param p1, "port"    # I

    const-string v0, "address"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 61
    new-instance v0, Ljava/net/InetSocketAddress;

    invoke-direct {v0, p0, p1}, Ljava/net/InetSocketAddress;-><init>(Ljava/net/InetAddress;I)V

    check-cast v0, Ljava/net/SocketAddress;

    .line 60
    invoke-static {v0}, Ltop/fifthlight/touchcontroller/proxy/client/transport/DatagramTransportKt;->openDatagramLauncherSocketProxyClient(Ljava/net/SocketAddress;)Ltop/fifthlight/touchcontroller/proxy/client/MessageTransport;

    move-result-object v0

    .line 62
    return-object v0
.end method

.method public static final openDatagramLauncherSocketProxyClient(Ljava/net/SocketAddress;)Ltop/fifthlight/touchcontroller/proxy/client/MessageTransport;
    .locals 3
    .param p0, "address"    # Ljava/net/SocketAddress;

    const-string v0, "address"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 46
    new-instance v0, Ltop/fifthlight/touchcontroller/proxy/client/transport/DatagramTransport;

    invoke-static {}, Ljava/nio/channels/DatagramChannel;->open()Ljava/nio/channels/DatagramChannel;

    move-result-object v1

    const-string v2, "open(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, v1, p0}, Ltop/fifthlight/touchcontroller/proxy/client/transport/DatagramTransport;-><init>(Ljava/nio/channels/DatagramChannel;Ljava/net/SocketAddress;)V

    check-cast v0, Ltop/fifthlight/touchcontroller/proxy/client/MessageTransport;

    return-object v0
.end method

.method public static synthetic openDatagramLauncherSocketProxyClient$default(Ljava/net/InetAddress;IILjava/lang/Object;)Ltop/fifthlight/touchcontroller/proxy/client/MessageTransport;
    .locals 0

    .line 55
    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    .line 58
    sget-object p0, Ltop/fifthlight/touchcontroller/proxy/client/transport/DatagramTransportKt;->ipv6LocalHostAddress:Ljava/net/InetAddress;

    .line 55
    :cond_0
    invoke-static {p0, p1}, Ltop/fifthlight/touchcontroller/proxy/client/transport/DatagramTransportKt;->openDatagramLauncherSocketProxyClient(Ljava/net/InetAddress;I)Ltop/fifthlight/touchcontroller/proxy/client/MessageTransport;

    move-result-object p0

    return-object p0
.end method
