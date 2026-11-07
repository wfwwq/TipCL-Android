package top.fifthlight.touchcontroller.proxy.message;

import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import java.nio.ByteBuffer;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.UInt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LargeMessage.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u001d2\u00020\u0001:\u0002\u001d\u001eB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0013\u0010\u0014\u001a\u00020\u00052\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0096\u0002J\b\u0010\u0017\u001a\u00020\rH\u0016J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001f"}, d2 = {"Ltop/fifthlight/touchcontroller/proxy/message/LargeMessage;", "Ltop/fifthlight/touchcontroller/proxy/message/ProxyMessage;", "payload", "", "end", "", "<init>", "([BZ)V", "getPayload", "()[B", "getEnd", "()Z", ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "", "getType", "()I", "encode", "", "buffer", "Ljava/nio/ByteBuffer;", "equals", "other", "", "hashCode", "component1", "component2", "copy", "toString", "", "Companion", "Decoder", "TouchController-Proxy-Client"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes24.dex */
public final /* data */ class LargeMessage extends ProxyMessage {
    public static final int MAX_PAYLOAD_LENGTH = 240;
    public static final int TYPE = 6;
    private final boolean end;
    private final byte[] payload;

    public static /* synthetic */ LargeMessage copy$default(LargeMessage largeMessage, byte[] bArr, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            bArr = largeMessage.payload;
        }
        if ((i & 2) != 0) {
            z = largeMessage.end;
        }
        return largeMessage.copy(bArr, z);
    }

    /* renamed from: component1, reason: from getter */
    public final byte[] getPayload() {
        return this.payload;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getEnd() {
        return this.end;
    }

    public final LargeMessage copy(byte[] payload, boolean end) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        return new LargeMessage(payload, end);
    }

    public String toString() {
        return "LargeMessage(payload=" + Arrays.toString(this.payload) + ", end=" + this.end + ')';
    }

    public final byte[] getPayload() {
        return this.payload;
    }

    public final boolean getEnd() {
        return this.end;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LargeMessage(byte[] payload, boolean end) {
        super(null);
        Intrinsics.checkNotNullParameter(payload, "payload");
        this.payload = payload;
        this.end = end;
        if (!(this.payload.length <= 240)) {
            throw new IllegalArgumentException("Payload length too large: 240".toString());
        }
    }

    @Override // top.fifthlight.touchcontroller.proxy.message.ProxyMessage
    public int getType() {
        return 6;
    }

    @Override // top.fifthlight.touchcontroller.proxy.message.ProxyMessage
    public void encode(ByteBuffer buffer) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        super.encode(buffer);
        buffer.put((byte) this.payload.length);
        if (this.end) {
            buffer.put((byte) 1);
        } else {
            buffer.put((byte) 0);
        }
        buffer.put(this.payload);
    }

    /* compiled from: LargeMessage.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"Ltop/fifthlight/touchcontroller/proxy/message/LargeMessage$Decoder;", "Ltop/fifthlight/touchcontroller/proxy/message/ProxyMessageDecoder;", "Ltop/fifthlight/touchcontroller/proxy/message/LargeMessage;", "<init>", "()V", "decode", "payload", "Ljava/nio/ByteBuffer;", "TouchController-Proxy-Client"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Decoder extends ProxyMessageDecoder<LargeMessage> {
        public static final Decoder INSTANCE = new Decoder();

        private Decoder() {
        }

        @Override // top.fifthlight.touchcontroller.proxy.message.ProxyMessageDecoder
        public LargeMessage decode(ByteBuffer payload) throws BadMessageLengthException {
            Intrinsics.checkNotNullParameter(payload, "payload");
            if (payload.remaining() < 2) {
                throw new BadMessageLengthException(2, payload.remaining());
            }
            int length = UInt.m8211constructorimpl(payload.get());
            boolean end = payload.get() != 0;
            if (payload.remaining() < length) {
                throw new BadMessageLengthException(length + 1, payload.remaining());
            }
            byte[] buffer = new byte[length];
            payload.get(buffer);
            return new LargeMessage(buffer, end);
        }
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.areEqual(getClass(), other != null ? other.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(other, "null cannot be cast to non-null type top.fifthlight.touchcontroller.proxy.message.LargeMessage");
        return getType() == ((LargeMessage) other).getType() && Arrays.equals(this.payload, ((LargeMessage) other).payload);
    }

    public int hashCode() {
        int result = getType();
        return (result * 31) + Arrays.hashCode(this.payload);
    }
}
