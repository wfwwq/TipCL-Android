package top.fifthlight.touchcontroller.proxy.message;

import androidx.core.app.NotificationCompat;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import top.fifthlight.touchcontroller.proxy.message.input.TextInputState;
import top.fifthlight.touchcontroller.proxy.message.input.TextRange;

/* compiled from: InputStatusMessage.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u001cB\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\r2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\tHÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\tX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001d"}, d2 = {"Ltop/fifthlight/touchcontroller/proxy/message/InputStatusMessage;", "Ltop/fifthlight/touchcontroller/proxy/message/ProxyMessage;", NotificationCompat.CATEGORY_STATUS, "Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;", "<init>", "(Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;)V", "getStatus", "()Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;", ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "", "getType", "()I", "wrapInLargeMessage", "", "getWrapInLargeMessage", "()Z", "encode", "", "buffer", "Ljava/nio/ByteBuffer;", "component1", "copy", "equals", "other", "", "hashCode", "toString", "", "Decoder", "TouchController-Proxy-Client"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes24.dex */
public final /* data */ class InputStatusMessage extends ProxyMessage {
    private final TextInputState status;
    private final int type;

    public static /* synthetic */ InputStatusMessage copy$default(InputStatusMessage inputStatusMessage, TextInputState textInputState, int i, Object obj) {
        if ((i & 1) != 0) {
            textInputState = inputStatusMessage.status;
        }
        return inputStatusMessage.copy(textInputState);
    }

    /* renamed from: component1, reason: from getter */
    public final TextInputState getStatus() {
        return this.status;
    }

    public final InputStatusMessage copy(TextInputState status) {
        return new InputStatusMessage(status);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof InputStatusMessage) && Intrinsics.areEqual(this.status, ((InputStatusMessage) other).status);
    }

    public int hashCode() {
        if (this.status == null) {
            return 0;
        }
        return this.status.hashCode();
    }

    public String toString() {
        return "InputStatusMessage(status=" + this.status + ')';
    }

    public final TextInputState getStatus() {
        return this.status;
    }

    public InputStatusMessage(TextInputState status) {
        super(null);
        this.status = status;
        this.type = 7;
    }

    @Override // top.fifthlight.touchcontroller.proxy.message.ProxyMessage
    public int getType() {
        return this.type;
    }

    @Override // top.fifthlight.touchcontroller.proxy.message.ProxyMessage
    public boolean getWrapInLargeMessage() {
        return true;
    }

    @Override // top.fifthlight.touchcontroller.proxy.message.ProxyMessage
    public void encode(ByteBuffer buffer) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        super.encode(buffer);
        if (this.status == null) {
            buffer.put((byte) 0);
            return;
        }
        buffer.put((byte) 1);
        byte[] bArrEncodeToByteArray = StringsKt.encodeToByteArray(this.status.getText());
        buffer.putInt(bArrEncodeToByteArray.length);
        buffer.put(bArrEncodeToByteArray);
        Pair pairConvertUtf16RangeToUtf8 = InputStatusMessageKt.convertUtf16RangeToUtf8(this.status.getText(), this.status.getComposition().getStart(), this.status.getComposition().getLength());
        int iIntValue = ((Number) pairConvertUtf16RangeToUtf8.component1()).intValue();
        int iIntValue2 = ((Number) pairConvertUtf16RangeToUtf8.component2()).intValue();
        buffer.putInt(iIntValue);
        buffer.putInt(iIntValue2);
        Pair pairConvertUtf16RangeToUtf82 = InputStatusMessageKt.convertUtf16RangeToUtf8(this.status.getText(), this.status.getSelection().getStart(), this.status.getSelection().getLength());
        int iIntValue3 = ((Number) pairConvertUtf16RangeToUtf82.component1()).intValue();
        int iIntValue4 = ((Number) pairConvertUtf16RangeToUtf82.component2()).intValue();
        buffer.putInt(iIntValue3);
        buffer.putInt(iIntValue4);
        buffer.put(this.status.getSelectionLeft() ? (byte) 1 : (byte) 0);
    }

    /* compiled from: InputStatusMessage.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"Ltop/fifthlight/touchcontroller/proxy/message/InputStatusMessage$Decoder;", "Ltop/fifthlight/touchcontroller/proxy/message/ProxyMessageDecoder;", "Ltop/fifthlight/touchcontroller/proxy/message/InputStatusMessage;", "<init>", "()V", "decode", "payload", "Ljava/nio/ByteBuffer;", "TouchController-Proxy-Client"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Decoder extends ProxyMessageDecoder<InputStatusMessage> {
        public static final Decoder INSTANCE = new Decoder();

        private Decoder() {
        }

        @Override // top.fifthlight.touchcontroller.proxy.message.ProxyMessageDecoder
        public InputStatusMessage decode(ByteBuffer payload) throws BadMessageLengthException {
            Intrinsics.checkNotNullParameter(payload, "payload");
            boolean hasData = payload.get() != 0;
            if (!hasData) {
                return new InputStatusMessage(null);
            }
            if (payload.remaining() < 20) {
                throw new BadMessageLengthException(20, payload.remaining());
            }
            int textLength = payload.getInt();
            if (payload.remaining() < textLength + 17) {
                throw new BadMessageLengthException(textLength + 18, payload.remaining());
            }
            byte[] textArray = new byte[textLength];
            payload.get(textArray);
            String text = StringsKt.decodeToString(textArray);
            int compositionStartUtf8 = payload.getInt();
            int compositionLengthUtf8 = payload.getInt();
            int selectionStartUtf8 = payload.getInt();
            int selectionLengthUtf8 = payload.getInt();
            boolean selectionLeft = payload.get() != 0;
            Pair pairConvertUtf8RangeToUtf16 = InputStatusMessageKt.convertUtf8RangeToUtf16(text, compositionStartUtf8, compositionLengthUtf8);
            int compositionStart = ((Number) pairConvertUtf8RangeToUtf16.component1()).intValue();
            int compositionLength = ((Number) pairConvertUtf8RangeToUtf16.component2()).intValue();
            Pair pairConvertUtf8RangeToUtf162 = InputStatusMessageKt.convertUtf8RangeToUtf16(text, selectionStartUtf8, selectionLengthUtf8);
            int selectionStart = ((Number) pairConvertUtf8RangeToUtf162.component1()).intValue();
            int selectionLength = ((Number) pairConvertUtf8RangeToUtf162.component2()).intValue();
            return new InputStatusMessage(new TextInputState(text, new TextRange(compositionStart, compositionLength), new TextRange(selectionStart, selectionLength), selectionLeft));
        }
    }
}
