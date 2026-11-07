package top.fifthlight.touchcontroller.proxy.message;

import java.nio.ByteBuffer;
import kotlin.Metadata;
import top.fifthlight.touchcontroller.proxy.message.ProxyMessage;

/* compiled from: ProxyMessage.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00020\bH&¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"Ltop/fifthlight/touchcontroller/proxy/message/ProxyMessageDecoder;", "M", "Ltop/fifthlight/touchcontroller/proxy/message/ProxyMessage;", "", "<init>", "()V", "decode", "payload", "Ljava/nio/ByteBuffer;", "(Ljava/nio/ByteBuffer;)Ltop/fifthlight/touchcontroller/proxy/message/ProxyMessage;", "TouchController-Proxy-Client"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes24.dex */
public abstract class ProxyMessageDecoder<M extends ProxyMessage> {
    public abstract M decode(ByteBuffer payload);
}
