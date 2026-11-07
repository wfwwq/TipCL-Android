package top.fifthlight.touchcontroller.proxy.message;

import kotlin.Metadata;

/* compiled from: ProxyMessage.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ltop/fifthlight/touchcontroller/proxy/message/BadMessageLengthException;", "Ltop/fifthlight/touchcontroller/proxy/message/MessageDecodeException;", "expected", "", "actual", "<init>", "(II)V", "TouchController-Proxy-Client"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes24.dex */
public final class BadMessageLengthException extends MessageDecodeException {
    public BadMessageLengthException(int expected, int actual) {
        super("Bad message length: expected " + expected + " bytes, but got " + actual + " bytes", null, 2, null);
    }
}
