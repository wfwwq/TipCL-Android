package top.fifthlight.touchcontroller.proxy.client;

import androidx.core.app.NotificationCompat;
import java.nio.ByteBuffer;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import top.fifthlight.touchcontroller.proxy.message.LargeMessage;
import top.fifthlight.touchcontroller.proxy.message.MessageDecodeException;
import top.fifthlight.touchcontroller.proxy.message.ProxyMessage;

/* compiled from: LauncherProxyMessageClient.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0014B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0011J\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011J\b\u0010\u0013\u001a\u00020\u000eH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyMessageClient;", "Ljava/lang/AutoCloseable;", NotificationCompat.CATEGORY_TRANSPORT, "Ltop/fifthlight/touchcontroller/proxy/client/MessageTransport;", "<init>", "(Ltop/fifthlight/touchcontroller/proxy/client/MessageTransport;)V", "sendQueue", "Ljava/util/concurrent/LinkedBlockingQueue;", "Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyMessageClient$MessageItem;", "receiveQueue", "running", "Ljava/util/concurrent/atomic/AtomicBoolean;", "closed", "run", "", "send", "message", "Ltop/fifthlight/touchcontroller/proxy/message/ProxyMessage;", "receive", "close", "MessageItem", "TouchController-Proxy-Client"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes24.dex */
public final class LauncherProxyMessageClient implements AutoCloseable {
    private AtomicBoolean closed;
    private final LinkedBlockingQueue<MessageItem> receiveQueue;
    private AtomicBoolean running;
    private final LinkedBlockingQueue<MessageItem> sendQueue;
    private final MessageTransport transport;

    /* compiled from: LauncherProxyMessageClient.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyMessageClient$MessageItem;", "", "<init>", "()V", "Message", "Close", "Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyMessageClient$MessageItem$Close;", "Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyMessageClient$MessageItem$Message;", "TouchController-Proxy-Client"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static abstract class MessageItem {
        public /* synthetic */ MessageItem(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* compiled from: LauncherProxyMessageClient.kt */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyMessageClient$MessageItem$Message;", "Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyMessageClient$MessageItem;", "message", "Ltop/fifthlight/touchcontroller/proxy/message/ProxyMessage;", "<init>", "(Ltop/fifthlight/touchcontroller/proxy/message/ProxyMessage;)V", "getMessage", "()Ltop/fifthlight/touchcontroller/proxy/message/ProxyMessage;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "TouchController-Proxy-Client"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Message extends MessageItem {
            private final ProxyMessage message;

            public static /* synthetic */ Message copy$default(Message message, ProxyMessage proxyMessage, int i, Object obj) {
                if ((i & 1) != 0) {
                    proxyMessage = message.message;
                }
                return message.copy(proxyMessage);
            }

            /* renamed from: component1, reason: from getter */
            public final ProxyMessage getMessage() {
                return this.message;
            }

            public final Message copy(ProxyMessage message) {
                Intrinsics.checkNotNullParameter(message, "message");
                return new Message(message);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Message) && Intrinsics.areEqual(this.message, ((Message) other).message);
            }

            public int hashCode() {
                return this.message.hashCode();
            }

            public String toString() {
                return "Message(message=" + this.message + ')';
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Message(ProxyMessage message) {
                super(null);
                Intrinsics.checkNotNullParameter(message, "message");
                this.message = message;
            }

            public final ProxyMessage getMessage() {
                return this.message;
            }
        }

        private MessageItem() {
        }

        /* compiled from: LauncherProxyMessageClient.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyMessageClient$MessageItem$Close;", "Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyMessageClient$MessageItem;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "TouchController-Proxy-Client"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Close extends MessageItem {
            public static final Close INSTANCE = new Close();

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Close)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return 1508626708;
            }

            public String toString() {
                return "Close";
            }

            private Close() {
                super(null);
            }
        }
    }

    public LauncherProxyMessageClient(MessageTransport transport) {
        Intrinsics.checkNotNullParameter(transport, "transport");
        this.transport = transport;
        this.sendQueue = new LinkedBlockingQueue<>(2048);
        this.receiveQueue = new LinkedBlockingQueue<>(2048);
        this.running = new AtomicBoolean(false);
        this.closed = new AtomicBoolean(false);
    }

    public final void run() {
        if (!this.running.compareAndSet(false, true)) {
            return;
        }
        new Thread(new Runnable() { // from class: top.fifthlight.touchcontroller.proxy.client.LauncherProxyMessageClient$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() throws InterruptedException {
                LauncherProxyMessageClient.run$lambda$0(this.f$0);
            }
        }).start();
        new Thread(new Runnable() { // from class: top.fifthlight.touchcontroller.proxy.client.LauncherProxyMessageClient$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                LauncherProxyMessageClient.run$lambda$1(this.f$0);
            }
        }).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void run$lambda$0(LauncherProxyMessageClient this$0) throws InterruptedException {
        ByteBuffer encodeBuffer = ByteBuffer.allocate(65536);
        ByteBuffer sendBuffer = ByteBuffer.allocate(256);
        while (true) {
            MessageItem item = this$0.sendQueue.take();
            if (!(item instanceof MessageItem.Close)) {
                if (!(item instanceof MessageItem.Message)) {
                    throw new NoWhenBranchMatchedException();
                }
                ProxyMessage message = ((MessageItem.Message) item).getMessage();
                encodeBuffer.clear();
                Intrinsics.checkNotNull(encodeBuffer);
                message.encode(encodeBuffer);
                encodeBuffer.flip();
                if (message.getWrapInLargeMessage()) {
                    while (encodeBuffer.hasRemaining()) {
                        int length = RangesKt.coerceAtMost(encodeBuffer.remaining(), 240);
                        byte[] payload = new byte[length];
                        encodeBuffer.get(payload);
                        sendBuffer.clear();
                        LargeMessage wrappedMessage = new LargeMessage(payload, !encodeBuffer.hasRemaining());
                        Intrinsics.checkNotNull(sendBuffer);
                        wrappedMessage.encode(sendBuffer);
                        sendBuffer.flip();
                        this$0.transport.send(sendBuffer);
                    }
                } else {
                    this$0.transport.send(encodeBuffer);
                }
            } else {
                this$0.transport.close();
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void run$lambda$1(LauncherProxyMessageClient this$0) {
        ProxyMessage message;
        ByteBuffer receiveBuffer = ByteBuffer.allocate(256);
        ByteBuffer decodeBuffer = ByteBuffer.allocate(65536);
        while (true) {
            MessageTransport messageTransport = this$0.transport;
            Intrinsics.checkNotNull(receiveBuffer);
            if (messageTransport.receive(receiveBuffer)) {
                receiveBuffer.flip();
                if (receiveBuffer.remaining() < 4) {
                    receiveBuffer.clear();
                } else {
                    int type = receiveBuffer.getInt();
                    try {
                        message = ProxyMessage.INSTANCE.decode(type, receiveBuffer);
                    } catch (MessageDecodeException e) {
                        message = null;
                    }
                    if (message != null) {
                        if (message instanceof LargeMessage) {
                            decodeBuffer.put(((LargeMessage) message).getPayload());
                            if (((LargeMessage) message).getEnd()) {
                                decodeBuffer.flip();
                                try {
                                    if (decodeBuffer.remaining() >= 4) {
                                        int wrappedType = decodeBuffer.getInt();
                                        ProxyMessage.Companion companion = ProxyMessage.INSTANCE;
                                        Intrinsics.checkNotNull(decodeBuffer);
                                        ProxyMessage wrappedMessage = companion.decode(wrappedType, decodeBuffer);
                                        this$0.receiveQueue.offer(new MessageItem.Message(wrappedMessage));
                                    }
                                } catch (MessageDecodeException e2) {
                                }
                                decodeBuffer.clear();
                            }
                        } else {
                            this$0.receiveQueue.offer(new MessageItem.Message(message));
                        }
                    }
                    receiveBuffer.clear();
                }
            } else {
                return;
            }
        }
    }

    public final void send(ProxyMessage message) {
        Intrinsics.checkNotNullParameter(message, "message");
        if (!this.closed.get()) {
            this.sendQueue.offer(new MessageItem.Message(message));
        }
    }

    public final ProxyMessage receive() {
        MessageItem item;
        if (this.closed.get() || (item = this.receiveQueue.take()) == null) {
            return null;
        }
        if (item instanceof MessageItem.Message) {
            return ((MessageItem.Message) item).getMessage();
        }
        if (Intrinsics.areEqual(item, MessageItem.Close.INSTANCE)) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        if (this.closed.compareAndSet(false, true)) {
            this.sendQueue.offer(MessageItem.Close.INSTANCE);
            this.receiveQueue.offer(MessageItem.Close.INSTANCE);
        }
    }
}
