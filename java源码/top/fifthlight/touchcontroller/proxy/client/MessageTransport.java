package top.fifthlight.touchcontroller.proxy.client;

import java.nio.ByteBuffer;
import kotlin.Metadata;

/* compiled from: Transport.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\b"}, d2 = {"Ltop/fifthlight/touchcontroller/proxy/client/MessageTransport;", "Ljava/lang/AutoCloseable;", "send", "", "buffer", "Ljava/nio/ByteBuffer;", "receive", "", "TouchController-Proxy-Client"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes24.dex */
public interface MessageTransport extends AutoCloseable {
    boolean receive(ByteBuffer buffer);

    void send(ByteBuffer buffer);
}
