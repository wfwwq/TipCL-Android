package top.fifthlight.touchcontroller.proxy.message;

import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MoveViewMessage.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001 B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J'\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u00032\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u000fHÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0014\u0010\u000e\u001a\u00020\u000fX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006!"}, d2 = {"Ltop/fifthlight/touchcontroller/proxy/message/MoveViewMessage;", "Ltop/fifthlight/touchcontroller/proxy/message/ProxyMessage;", "screenBased", "", "deltaPitch", "", "deltaYaw", "<init>", "(ZFF)V", "getScreenBased", "()Z", "getDeltaPitch", "()F", "getDeltaYaw", ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "", "getType", "()I", "encode", "", "buffer", "Ljava/nio/ByteBuffer;", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "toString", "", "Decoder", "TouchController-Proxy-Client"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes24.dex */
public final /* data */ class MoveViewMessage extends ProxyMessage {
    private final float deltaPitch;
    private final float deltaYaw;
    private final boolean screenBased;
    private final int type;

    public static /* synthetic */ MoveViewMessage copy$default(MoveViewMessage moveViewMessage, boolean z, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = moveViewMessage.screenBased;
        }
        if ((i & 2) != 0) {
            f = moveViewMessage.deltaPitch;
        }
        if ((i & 4) != 0) {
            f2 = moveViewMessage.deltaYaw;
        }
        return moveViewMessage.copy(z, f, f2);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getScreenBased() {
        return this.screenBased;
    }

    /* renamed from: component2, reason: from getter */
    public final float getDeltaPitch() {
        return this.deltaPitch;
    }

    /* renamed from: component3, reason: from getter */
    public final float getDeltaYaw() {
        return this.deltaYaw;
    }

    public final MoveViewMessage copy(boolean screenBased, float deltaPitch, float deltaYaw) {
        return new MoveViewMessage(screenBased, deltaPitch, deltaYaw);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MoveViewMessage)) {
            return false;
        }
        MoveViewMessage moveViewMessage = (MoveViewMessage) other;
        return this.screenBased == moveViewMessage.screenBased && Float.compare(this.deltaPitch, moveViewMessage.deltaPitch) == 0 && Float.compare(this.deltaYaw, moveViewMessage.deltaYaw) == 0;
    }

    public int hashCode() {
        return (((Boolean.hashCode(this.screenBased) * 31) + Float.hashCode(this.deltaPitch)) * 31) + Float.hashCode(this.deltaYaw);
    }

    public String toString() {
        return "MoveViewMessage(screenBased=" + this.screenBased + ", deltaPitch=" + this.deltaPitch + ", deltaYaw=" + this.deltaYaw + ')';
    }

    public final boolean getScreenBased() {
        return this.screenBased;
    }

    public final float getDeltaPitch() {
        return this.deltaPitch;
    }

    public final float getDeltaYaw() {
        return this.deltaYaw;
    }

    public MoveViewMessage(boolean screenBased, float deltaPitch, float deltaYaw) {
        super(null);
        this.screenBased = screenBased;
        this.deltaPitch = deltaPitch;
        this.deltaYaw = deltaYaw;
        this.type = 12;
    }

    @Override // top.fifthlight.touchcontroller.proxy.message.ProxyMessage
    public int getType() {
        return this.type;
    }

    @Override // top.fifthlight.touchcontroller.proxy.message.ProxyMessage
    public void encode(ByteBuffer buffer) {
        byte b;
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        super.encode(buffer);
        if (this.screenBased) {
            b = 1;
        } else {
            b = 0;
        }
        buffer.put(b);
        buffer.putFloat(this.deltaPitch);
        buffer.putFloat(this.deltaYaw);
    }

    /* compiled from: MoveViewMessage.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"Ltop/fifthlight/touchcontroller/proxy/message/MoveViewMessage$Decoder;", "Ltop/fifthlight/touchcontroller/proxy/message/ProxyMessageDecoder;", "Ltop/fifthlight/touchcontroller/proxy/message/MoveViewMessage;", "<init>", "()V", "decode", "payload", "Ljava/nio/ByteBuffer;", "TouchController-Proxy-Client"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Decoder extends ProxyMessageDecoder<MoveViewMessage> {
        public static final Decoder INSTANCE = new Decoder();

        private Decoder() {
        }

        @Override // top.fifthlight.touchcontroller.proxy.message.ProxyMessageDecoder
        public MoveViewMessage decode(ByteBuffer payload) throws BadMessageLengthException {
            Intrinsics.checkNotNullParameter(payload, "payload");
            if (payload.remaining() < 5) {
                throw new BadMessageLengthException(5, payload.remaining());
            }
            boolean screenBased = payload.get() != 0;
            float deltaPitch = payload.getFloat();
            float deltaYaw = payload.getFloat();
            return new MoveViewMessage(screenBased, deltaPitch, deltaYaw);
        }
    }
}
