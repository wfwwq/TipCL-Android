package top.fifthlight.touchcontroller.proxy.message;

import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import kotlin.Metadata;

/* compiled from: ProxyMessage.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ltop/fifthlight/touchcontroller/proxy/message/BadMessageTypeException;", "Ltop/fifthlight/touchcontroller/proxy/message/MessageDecodeException;", ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "", "<init>", "(I)V", "TouchController-Proxy-Client"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes24.dex */
public final class BadMessageTypeException extends MessageDecodeException {
    public BadMessageTypeException(int type) {
        super("Bad type: " + type, null, 2, null);
    }
}
