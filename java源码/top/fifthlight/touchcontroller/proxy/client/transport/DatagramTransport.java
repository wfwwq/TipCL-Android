package top.fifthlight.touchcontroller.proxy.client.transport;

import java.io.IOException;
import java.net.SocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.DatagramChannel;
import java.util.concurrent.Semaphore;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import top.fifthlight.touchcontroller.proxy.client.MessageTransport;

/* compiled from: DatagramTransport.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u0010\u001a\u00020\u000bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Ltop/fifthlight/touchcontroller/proxy/client/transport/DatagramTransport;", "Ltop/fifthlight/touchcontroller/proxy/client/MessageTransport;", "channel", "Ljava/nio/channels/DatagramChannel;", "address", "Ljava/net/SocketAddress;", "<init>", "(Ljava/nio/channels/DatagramChannel;Ljava/net/SocketAddress;)V", "lockingSemaphore", "Ljava/util/concurrent/Semaphore;", "send", "", "buffer", "Ljava/nio/ByteBuffer;", "receive", "", "close", "TouchController-Proxy-Client"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes24.dex */
final class DatagramTransport implements MessageTransport {
    private final SocketAddress address;
    private final DatagramChannel channel;
    private final Semaphore lockingSemaphore;

    public DatagramTransport(DatagramChannel channel, SocketAddress address) {
        Intrinsics.checkNotNullParameter(channel, "channel");
        Intrinsics.checkNotNullParameter(address, "address");
        this.channel = channel;
        this.address = address;
        this.lockingSemaphore = new Semaphore(0);
    }

    @Override // top.fifthlight.touchcontroller.proxy.client.MessageTransport
    public void send(ByteBuffer buffer) throws IOException {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        this.channel.send(buffer, this.address);
    }

    @Override // top.fifthlight.touchcontroller.proxy.client.MessageTransport
    public boolean receive(ByteBuffer buffer) throws InterruptedException {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        this.lockingSemaphore.acquire();
        return false;
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        this.lockingSemaphore.release();
    }
}
