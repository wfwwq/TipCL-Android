package top.fifthlight.touchcontroller.proxy.message;

import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.UInt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: CapabilityMessage.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u001cB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00052\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\rHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\rX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001d"}, d2 = {"Ltop/fifthlight/touchcontroller/proxy/message/CapabilityMessage;", "Ltop/fifthlight/touchcontroller/proxy/message/ProxyMessage;", "capability", "", "enabled", "", "<init>", "(Ljava/lang/String;Z)V", "getCapability", "()Ljava/lang/String;", "getEnabled", "()Z", ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "", "getType", "()I", "encode", "", "buffer", "Ljava/nio/ByteBuffer;", "component1", "component2", "copy", "equals", "other", "", "hashCode", "toString", "Decoder", "TouchController-Proxy-Client"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes24.dex */
public final /* data */ class CapabilityMessage extends ProxyMessage {
    private final String capability;
    private final boolean enabled;
    private final int type;

    public static /* synthetic */ CapabilityMessage copy$default(CapabilityMessage capabilityMessage, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = capabilityMessage.capability;
        }
        if ((i & 2) != 0) {
            z = capabilityMessage.enabled;
        }
        return capabilityMessage.copy(str, z);
    }

    /* renamed from: component1, reason: from getter */
    public final String getCapability() {
        return this.capability;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    public final CapabilityMessage copy(String capability, boolean enabled) {
        Intrinsics.checkNotNullParameter(capability, "capability");
        return new CapabilityMessage(capability, enabled);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CapabilityMessage)) {
            return false;
        }
        CapabilityMessage capabilityMessage = (CapabilityMessage) other;
        return Intrinsics.areEqual(this.capability, capabilityMessage.capability) && this.enabled == capabilityMessage.enabled;
    }

    public int hashCode() {
        return (this.capability.hashCode() * 31) + Boolean.hashCode(this.enabled);
    }

    public String toString() {
        return "CapabilityMessage(capability=" + this.capability + ", enabled=" + this.enabled + ')';
    }

    public final String getCapability() {
        return this.capability;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CapabilityMessage(String capability, boolean enabled) {
        super(null);
        Intrinsics.checkNotNullParameter(capability, "capability");
        this.capability = capability;
        this.enabled = enabled;
        this.type = 5;
        if (this.capability.length() < 128) {
        } else {
            throw new IllegalArgumentException(("Capability too long: " + this.capability).toString());
        }
    }

    @Override // top.fifthlight.touchcontroller.proxy.message.ProxyMessage
    public int getType() {
        return this.type;
    }

    @Override // top.fifthlight.touchcontroller.proxy.message.ProxyMessage
    public void encode(ByteBuffer buffer) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        super.encode(buffer);
        buffer.put((byte) this.capability.length());
        buffer.put(StringsKt.encodeToByteArray(this.capability));
        if (this.enabled) {
            buffer.put((byte) 1);
        } else {
            buffer.put((byte) 0);
        }
    }

    /* compiled from: CapabilityMessage.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"Ltop/fifthlight/touchcontroller/proxy/message/CapabilityMessage$Decoder;", "Ltop/fifthlight/touchcontroller/proxy/message/ProxyMessageDecoder;", "Ltop/fifthlight/touchcontroller/proxy/message/CapabilityMessage;", "<init>", "()V", "decode", "payload", "Ljava/nio/ByteBuffer;", "TouchController-Proxy-Client"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Decoder extends ProxyMessageDecoder<CapabilityMessage> {
        public static final Decoder INSTANCE = new Decoder();

        private Decoder() {
        }

        @Override // top.fifthlight.touchcontroller.proxy.message.ProxyMessageDecoder
        public CapabilityMessage decode(ByteBuffer payload) throws BadMessageException, BadMessageLengthException {
            Intrinsics.checkNotNullParameter(payload, "payload");
            if (payload.remaining() < 2) {
                throw new BadMessageLengthException(2, payload.remaining());
            }
            int length = UInt.m8211constructorimpl(payload.get());
            if (length <= 0) {
                throw new BadMessageException("Bad capability message: length " + length);
            }
            if (payload.remaining() != length + 1) {
                throw new BadMessageLengthException(length + 1, payload.remaining());
            }
            byte[] byteArray = new byte[length];
            payload.get(byteArray);
            boolean enabled = UInt.m8211constructorimpl(payload.get()) != 0;
            return new CapabilityMessage(StringsKt.decodeToString(byteArray), enabled);
        }
    }
}
