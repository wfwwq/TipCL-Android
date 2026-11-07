package top.fifthlight.touchcontroller.proxy.message;

import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import top.fifthlight.touchcontroller.proxy.message.AddPointerMessage;
import top.fifthlight.touchcontroller.proxy.message.CapabilityMessage;
import top.fifthlight.touchcontroller.proxy.message.ClearPointerMessage;
import top.fifthlight.touchcontroller.proxy.message.InitializeMessage;
import top.fifthlight.touchcontroller.proxy.message.InputAreaMessage;
import top.fifthlight.touchcontroller.proxy.message.InputCursorMessage;
import top.fifthlight.touchcontroller.proxy.message.InputStatusMessage;
import top.fifthlight.touchcontroller.proxy.message.KeyboardShowMessage;
import top.fifthlight.touchcontroller.proxy.message.LargeMessage;
import top.fifthlight.touchcontroller.proxy.message.MoveViewMessage;
import top.fifthlight.touchcontroller.proxy.message.RemovePointerMessage;
import top.fifthlight.touchcontroller.proxy.message.VibrateMessage;

/* compiled from: ProxyMessage.kt */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016R\u0012\u0010\u0004\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b\u0082\u0001\f\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c¨\u0006\u001d"}, d2 = {"Ltop/fifthlight/touchcontroller/proxy/message/ProxyMessage;", "", "<init>", "()V", ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "", "getType", "()I", "wrapInLargeMessage", "", "getWrapInLargeMessage", "()Z", "encode", "", "buffer", "Ljava/nio/ByteBuffer;", "Companion", "Ltop/fifthlight/touchcontroller/proxy/message/AddPointerMessage;", "Ltop/fifthlight/touchcontroller/proxy/message/CapabilityMessage;", "Ltop/fifthlight/touchcontroller/proxy/message/ClearPointerMessage;", "Ltop/fifthlight/touchcontroller/proxy/message/InitializeMessage;", "Ltop/fifthlight/touchcontroller/proxy/message/InputAreaMessage;", "Ltop/fifthlight/touchcontroller/proxy/message/InputCursorMessage;", "Ltop/fifthlight/touchcontroller/proxy/message/InputStatusMessage;", "Ltop/fifthlight/touchcontroller/proxy/message/KeyboardShowMessage;", "Ltop/fifthlight/touchcontroller/proxy/message/LargeMessage;", "Ltop/fifthlight/touchcontroller/proxy/message/MoveViewMessage;", "Ltop/fifthlight/touchcontroller/proxy/message/RemovePointerMessage;", "Ltop/fifthlight/touchcontroller/proxy/message/VibrateMessage;", "TouchController-Proxy-Client"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes24.dex */
public abstract class ProxyMessage {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    public /* synthetic */ ProxyMessage(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract int getType();

    private ProxyMessage() {
    }

    public boolean getWrapInLargeMessage() {
        return false;
    }

    public void encode(ByteBuffer buffer) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        buffer.putInt(getType());
    }

    /* compiled from: ProxyMessage.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t¨\u0006\n"}, d2 = {"Ltop/fifthlight/touchcontroller/proxy/message/ProxyMessage$Companion;", "", "<init>", "()V", "decode", "Ltop/fifthlight/touchcontroller/proxy/message/ProxyMessage;", ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "", "payload", "Ljava/nio/ByteBuffer;", "TouchController-Proxy-Client"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final ProxyMessage decode(int type, ByteBuffer payload) throws BadMessageTypeException {
            AddPointerMessage.Decoder decoder;
            Intrinsics.checkNotNullParameter(payload, "payload");
            switch (type) {
                case 1:
                    decoder = AddPointerMessage.Decoder.INSTANCE;
                    break;
                case 2:
                    decoder = RemovePointerMessage.Decoder.INSTANCE;
                    break;
                case 3:
                    decoder = ClearPointerMessage.Decoder.INSTANCE;
                    break;
                case 4:
                    decoder = VibrateMessage.Decoder.INSTANCE;
                    break;
                case 5:
                    decoder = CapabilityMessage.Decoder.INSTANCE;
                    break;
                case 6:
                    decoder = LargeMessage.Decoder.INSTANCE;
                    break;
                case 7:
                    decoder = InputStatusMessage.Decoder.INSTANCE;
                    break;
                case 8:
                    decoder = KeyboardShowMessage.Decoder.INSTANCE;
                    break;
                case 9:
                    decoder = InputCursorMessage.Decoder.INSTANCE;
                    break;
                case 10:
                    decoder = InitializeMessage.Decoder.INSTANCE;
                    break;
                case 11:
                    decoder = InputAreaMessage.Decoder.INSTANCE;
                    break;
                case 12:
                    decoder = MoveViewMessage.Decoder.INSTANCE;
                    break;
                default:
                    throw new BadMessageTypeException(type);
            }
            return decoder.decode(payload);
        }
    }
}
