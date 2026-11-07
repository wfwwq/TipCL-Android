package top.fifthlight.touchcontroller.proxy.message;

import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: VibrateMessage.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0010\u0011B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\tX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0012"}, d2 = {"Ltop/fifthlight/touchcontroller/proxy/message/VibrateMessage;", "Ltop/fifthlight/touchcontroller/proxy/message/ProxyMessage;", "kind", "Ltop/fifthlight/touchcontroller/proxy/message/VibrateMessage$Kind;", "<init>", "(Ltop/fifthlight/touchcontroller/proxy/message/VibrateMessage$Kind;)V", "getKind", "()Ltop/fifthlight/touchcontroller/proxy/message/VibrateMessage$Kind;", ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "", "getType", "()I", "encode", "", "buffer", "Ljava/nio/ByteBuffer;", "Kind", "Decoder", "TouchController-Proxy-Client"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes24.dex */
public final class VibrateMessage extends ProxyMessage {
    private final Kind kind;
    private final int type;

    public final Kind getKind() {
        return this.kind;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VibrateMessage(Kind kind) {
        super(null);
        Intrinsics.checkNotNullParameter(kind, "kind");
        this.kind = kind;
        this.type = 4;
    }

    @Override // top.fifthlight.touchcontroller.proxy.message.ProxyMessage
    public int getType() {
        return this.type;
    }

    /* compiled from: VibrateMessage.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Ltop/fifthlight/touchcontroller/proxy/message/VibrateMessage$Kind;", "", "index", "", "<init>", "(Ljava/lang/String;II)V", "getIndex", "()I", "UNKNOWN", "BLOCK_BROKEN", "TouchController-Proxy-Client"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum Kind {
        UNKNOWN(-1),
        BLOCK_BROKEN(0);

        private final int index;
        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries($VALUES);

        Kind(int index) {
            this.index = index;
        }

        public final int getIndex() {
            return this.index;
        }

        public static EnumEntries<Kind> getEntries() {
            return $ENTRIES;
        }
    }

    @Override // top.fifthlight.touchcontroller.proxy.message.ProxyMessage
    public void encode(ByteBuffer buffer) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        super.encode(buffer);
        buffer.putInt(this.kind.getIndex());
    }

    /* compiled from: VibrateMessage.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"Ltop/fifthlight/touchcontroller/proxy/message/VibrateMessage$Decoder;", "Ltop/fifthlight/touchcontroller/proxy/message/ProxyMessageDecoder;", "Ltop/fifthlight/touchcontroller/proxy/message/VibrateMessage;", "<init>", "()V", "decode", "payload", "Ljava/nio/ByteBuffer;", "TouchController-Proxy-Client"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Decoder extends ProxyMessageDecoder<VibrateMessage> {
        public static final Decoder INSTANCE = new Decoder();

        private Decoder() {
        }

        @Override // top.fifthlight.touchcontroller.proxy.message.ProxyMessageDecoder
        public VibrateMessage decode(ByteBuffer payload) throws BadMessageLengthException {
            Intrinsics.checkNotNullParameter(payload, "payload");
            if (payload.remaining() != 4) {
                throw new BadMessageLengthException(4, payload.remaining());
            }
            return new VibrateMessage(payload.getInt() == 0 ? Kind.BLOCK_BROKEN : Kind.UNKNOWN);
        }
    }
}
