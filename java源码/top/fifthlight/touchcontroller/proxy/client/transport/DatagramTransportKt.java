package top.fifthlight.touchcontroller.proxy.client.transport;

import java.io.IOException;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.nio.channels.DatagramChannel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import top.fifthlight.touchcontroller.proxy.client.MessageTransport;

/* compiled from: DatagramTransport.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u001a\u0015\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\b\b\u001a\u001f\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\nH\u0007¢\u0006\u0002\b\b\"\u0018\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0003¨\u0006\u000b"}, d2 = {"ipv6LocalHostAddress", "Ljava/net/InetAddress;", "kotlin.jvm.PlatformType", "Ljava/net/InetAddress;", "DatagramTransport", "Ltop/fifthlight/touchcontroller/proxy/client/MessageTransport;", "address", "Ljava/net/SocketAddress;", "openDatagramLauncherSocketProxyClient", "port", "", "TouchController-Proxy-Client"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes24.dex */
public final class DatagramTransportKt {
    private static final InetAddress ipv6LocalHostAddress = Inet6Address.getByAddress("localhost", new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1});

    public static final MessageTransport openDatagramLauncherSocketProxyClient(SocketAddress address) throws IOException {
        Intrinsics.checkNotNullParameter(address, "address");
        DatagramChannel datagramChannelOpen = DatagramChannel.open();
        Intrinsics.checkNotNullExpressionValue(datagramChannelOpen, "open(...)");
        return new DatagramTransport(datagramChannelOpen, address);
    }

    public static /* synthetic */ MessageTransport openDatagramLauncherSocketProxyClient$default(InetAddress inetAddress, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            inetAddress = ipv6LocalHostAddress;
        }
        return openDatagramLauncherSocketProxyClient(inetAddress, i);
    }

    public static final MessageTransport openDatagramLauncherSocketProxyClient(InetAddress address, int port) {
        Intrinsics.checkNotNullParameter(address, "address");
        return openDatagramLauncherSocketProxyClient(new InetSocketAddress(address, port));
    }

    public static final MessageTransport openDatagramLauncherSocketProxyClient(int port) {
        return openDatagramLauncherSocketProxyClient$default(null, port, 1, null);
    }
}
