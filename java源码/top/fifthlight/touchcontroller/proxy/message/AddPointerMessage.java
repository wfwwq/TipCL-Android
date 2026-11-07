package top.fifthlight.touchcontroller.proxy.message;

import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AddPointerMessage.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u001fB\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J'\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0014\u0010\u000e\u001a\u00020\u0003X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\n¨\u0006 "}, d2 = {"Ltop/fifthlight/touchcontroller/proxy/message/AddPointerMessage;", "Ltop/fifthlight/touchcontroller/proxy/message/ProxyMessage;", "index", "", "x", "", "y", "<init>", "(IFF)V", "getIndex", "()I", "getX", "()F", "getY", ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "getType", "encode", "", "buffer", "Ljava/nio/ByteBuffer;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "toString", "", "Decoder", "TouchController-Proxy-Client"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes24.dex */
public final /* data */ class AddPointerMessage extends ProxyMessage {
    private final int index;
    private final int type;
    private final float x;
    private final float y;

    public static /* synthetic */ AddPointerMessage copy$default(AddPointerMessage addPointerMessage, int i, float f, float f2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = addPointerMessage.index;
        }
        if ((i2 & 2) != 0) {
            f = addPointerMessage.x;
        }
        if ((i2 & 4) != 0) {
            f2 = addPointerMessage.y;
        }
        return addPointerMessage.copy(i, f, f2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getIndex() {
        return this.index;
    }

    /* renamed from: component2, reason: from getter */
    public final float getX() {
        return this.x;
    }

    /* renamed from: component3, reason: from getter */
    public final float getY() {
        return this.y;
    }

    public final AddPointerMessage copy(int index, float x, float y) {
        return new AddPointerMessage(index, x, y);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AddPointerMessage)) {
            return false;
        }
        AddPointerMessage addPointerMessage = (AddPointerMessage) other;
        return this.index == addPointerMessage.index && Float.compare(this.x, addPointerMessage.x) == 0 && Float.compare(this.y, addPointerMessage.y) == 0;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.index) * 31) + Float.hashCode(this.x)) * 31) + Float.hashCode(this.y);
    }

    public String toString() {
        return "AddPointerMessage(index=" + this.index + ", x=" + this.x + ", y=" + this.y + ')';
    }

    public final int getIndex() {
        return this.index;
    }

    public final float getX() {
        return this.x;
    }

    public final float getY() {
        return this.y;
    }

    public AddPointerMessage(int index, float x, float y) {
        super(null);
        this.index = index;
        this.x = x;
        this.y = y;
        this.type = 1;
    }

    @Override // top.fifthlight.touchcontroller.proxy.message.ProxyMessage
    public int getType() {
        return this.type;
    }

    @Override // top.fifthlight.touchcontroller.proxy.message.ProxyMessage
    public void encode(ByteBuffer buffer) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        super.encode(buffer);
        buffer.putInt(this.index);
        buffer.putFloat(this.x);
        buffer.putFloat(this.y);
    }

    /* compiled from: AddPointerMessage.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"Ltop/fifthlight/touchcontroller/proxy/message/AddPointerMessage$Decoder;", "Ltop/fifthlight/touchcontroller/proxy/message/ProxyMessageDecoder;", "Ltop/fifthlight/touchcontroller/proxy/message/AddPointerMessage;", "<init>", "()V", "decode", "payload", "Ljava/nio/ByteBuffer;", "TouchController-Proxy-Client"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Decoder extends ProxyMessageDecoder<AddPointerMessage> {
        public static final Decoder INSTANCE = new Decoder();

        private Decoder() {
        }

        @Override // top.fifthlight.touchcontroller.proxy.message.ProxyMessageDecoder
        public AddPointerMessage decode(ByteBuffer payload) throws BadMessageLengthException {
            Intrinsics.checkNotNullParameter(payload, "payload");
            if (payload.remaining() != 12) {
                throw new BadMessageLengthException(12, payload.remaining());
            }
            return new AddPointerMessage(payload.getInt(), payload.getFloat(), payload.getFloat());
        }
    }
}
