package top.fifthlight.touchcontroller.proxy.message;

import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InputAreaMessage.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0019B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\tHÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\tX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001a"}, d2 = {"Ltop/fifthlight/touchcontroller/proxy/message/InputAreaMessage;", "Ltop/fifthlight/touchcontroller/proxy/message/ProxyMessage;", "inputAreaRect", "Ltop/fifthlight/touchcontroller/proxy/message/FloatRect;", "<init>", "(Ltop/fifthlight/touchcontroller/proxy/message/FloatRect;)V", "getInputAreaRect", "()Ltop/fifthlight/touchcontroller/proxy/message/FloatRect;", ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "", "getType", "()I", "encode", "", "buffer", "Ljava/nio/ByteBuffer;", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "Decoder", "TouchController-Proxy-Client"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes24.dex */
public final /* data */ class InputAreaMessage extends ProxyMessage {
    private final FloatRect inputAreaRect;
    private final int type;

    /* JADX WARN: Multi-variable type inference failed */
    public InputAreaMessage() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ InputAreaMessage copy$default(InputAreaMessage inputAreaMessage, FloatRect floatRect, int i, Object obj) {
        if ((i & 1) != 0) {
            floatRect = inputAreaMessage.inputAreaRect;
        }
        return inputAreaMessage.copy(floatRect);
    }

    /* renamed from: component1, reason: from getter */
    public final FloatRect getInputAreaRect() {
        return this.inputAreaRect;
    }

    public final InputAreaMessage copy(FloatRect inputAreaRect) {
        return new InputAreaMessage(inputAreaRect);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof InputAreaMessage) && Intrinsics.areEqual(this.inputAreaRect, ((InputAreaMessage) other).inputAreaRect);
    }

    public int hashCode() {
        if (this.inputAreaRect == null) {
            return 0;
        }
        return this.inputAreaRect.hashCode();
    }

    public String toString() {
        return "InputAreaMessage(inputAreaRect=" + this.inputAreaRect + ')';
    }

    public /* synthetic */ InputAreaMessage(FloatRect floatRect, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : floatRect);
    }

    public final FloatRect getInputAreaRect() {
        return this.inputAreaRect;
    }

    public InputAreaMessage(FloatRect inputAreaRect) {
        super(null);
        this.inputAreaRect = inputAreaRect;
        this.type = 11;
    }

    @Override // top.fifthlight.touchcontroller.proxy.message.ProxyMessage
    public int getType() {
        return this.type;
    }

    @Override // top.fifthlight.touchcontroller.proxy.message.ProxyMessage
    public void encode(ByteBuffer buffer) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        super.encode(buffer);
        if (this.inputAreaRect != null) {
            buffer.put((byte) 1);
            buffer.putFloat(this.inputAreaRect.getLeft());
            buffer.putFloat(this.inputAreaRect.getTop());
            buffer.putFloat(this.inputAreaRect.getWidth());
            buffer.putFloat(this.inputAreaRect.getHeight());
            return;
        }
        buffer.put((byte) 0);
    }

    /* compiled from: InputAreaMessage.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"Ltop/fifthlight/touchcontroller/proxy/message/InputAreaMessage$Decoder;", "Ltop/fifthlight/touchcontroller/proxy/message/ProxyMessageDecoder;", "Ltop/fifthlight/touchcontroller/proxy/message/InputAreaMessage;", "<init>", "()V", "decode", "payload", "Ljava/nio/ByteBuffer;", "TouchController-Proxy-Client"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Decoder extends ProxyMessageDecoder<InputAreaMessage> {
        public static final Decoder INSTANCE = new Decoder();

        private Decoder() {
        }

        @Override // top.fifthlight.touchcontroller.proxy.message.ProxyMessageDecoder
        public InputAreaMessage decode(ByteBuffer payload) throws BadMessageLengthException {
            Intrinsics.checkNotNullParameter(payload, "payload");
            if (payload.remaining() < 1) {
                throw new BadMessageLengthException(1, payload.remaining());
            }
            boolean hasData = payload.get() != 0;
            if (!hasData) {
                return new InputAreaMessage(null);
            }
            if (payload.remaining() != 16) {
                throw new BadMessageLengthException(16, payload.remaining());
            }
            return new InputAreaMessage(new FloatRect(payload.getFloat(), payload.getFloat(), payload.getFloat(), payload.getFloat()));
        }
    }
}
