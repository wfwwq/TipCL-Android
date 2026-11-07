package top.fifthlight.touchcontroller.proxy.message;

import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: KeyboardShowMessage.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0018B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00032\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\tHÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\tX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0019"}, d2 = {"Ltop/fifthlight/touchcontroller/proxy/message/KeyboardShowMessage;", "Ltop/fifthlight/touchcontroller/proxy/message/ProxyMessage;", "show", "", "<init>", "(Z)V", "getShow", "()Z", ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "", "getType", "()I", "encode", "", "buffer", "Ljava/nio/ByteBuffer;", "component1", "copy", "equals", "other", "", "hashCode", "toString", "", "Decoder", "TouchController-Proxy-Client"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes24.dex */
public final /* data */ class KeyboardShowMessage extends ProxyMessage {
    private final boolean show;
    private final int type;

    public static /* synthetic */ KeyboardShowMessage copy$default(KeyboardShowMessage keyboardShowMessage, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = keyboardShowMessage.show;
        }
        return keyboardShowMessage.copy(z);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getShow() {
        return this.show;
    }

    public final KeyboardShowMessage copy(boolean show) {
        return new KeyboardShowMessage(show);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof KeyboardShowMessage) && this.show == ((KeyboardShowMessage) other).show;
    }

    public int hashCode() {
        return Boolean.hashCode(this.show);
    }

    public String toString() {
        return "KeyboardShowMessage(show=" + this.show + ')';
    }

    public final boolean getShow() {
        return this.show;
    }

    public KeyboardShowMessage(boolean show) {
        super(null);
        this.show = show;
        this.type = 8;
    }

    @Override // top.fifthlight.touchcontroller.proxy.message.ProxyMessage
    public int getType() {
        return this.type;
    }

    @Override // top.fifthlight.touchcontroller.proxy.message.ProxyMessage
    public void encode(ByteBuffer buffer) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        super.encode(buffer);
        if (this.show) {
            buffer.put((byte) 1);
        } else {
            buffer.put((byte) 0);
        }
    }

    /* compiled from: KeyboardShowMessage.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"Ltop/fifthlight/touchcontroller/proxy/message/KeyboardShowMessage$Decoder;", "Ltop/fifthlight/touchcontroller/proxy/message/ProxyMessageDecoder;", "Ltop/fifthlight/touchcontroller/proxy/message/KeyboardShowMessage;", "<init>", "()V", "decode", "payload", "Ljava/nio/ByteBuffer;", "TouchController-Proxy-Client"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Decoder extends ProxyMessageDecoder<KeyboardShowMessage> {
        public static final Decoder INSTANCE = new Decoder();

        private Decoder() {
        }

        @Override // top.fifthlight.touchcontroller.proxy.message.ProxyMessageDecoder
        public KeyboardShowMessage decode(ByteBuffer payload) throws BadMessageLengthException {
            Intrinsics.checkNotNullParameter(payload, "payload");
            if (payload.remaining() != 1) {
                throw new BadMessageLengthException(1, payload.remaining());
            }
            boolean show = payload.get() != 0;
            return new KeyboardShowMessage(show);
        }
    }
}
