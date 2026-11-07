package top.fifthlight.touchcontroller.proxy.client;

import androidx.core.app.NotificationCompat;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import top.fifthlight.touchcontroller.proxy.message.AddPointerMessage;
import top.fifthlight.touchcontroller.proxy.message.CapabilityMessage;
import top.fifthlight.touchcontroller.proxy.message.ClearPointerMessage;
import top.fifthlight.touchcontroller.proxy.message.FloatRect;
import top.fifthlight.touchcontroller.proxy.message.InitializeMessage;
import top.fifthlight.touchcontroller.proxy.message.InputAreaMessage;
import top.fifthlight.touchcontroller.proxy.message.InputCursorMessage;
import top.fifthlight.touchcontroller.proxy.message.InputStatusMessage;
import top.fifthlight.touchcontroller.proxy.message.KeyboardShowMessage;
import top.fifthlight.touchcontroller.proxy.message.MoveViewMessage;
import top.fifthlight.touchcontroller.proxy.message.ProxyMessage;
import top.fifthlight.touchcontroller.proxy.message.RemovePointerMessage;
import top.fifthlight.touchcontroller.proxy.message.VibrateMessage;
import top.fifthlight.touchcontroller.proxy.message.input.TextInputState;

/* compiled from: LauncherProxyClient.kt */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u000389:B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0006\u0010\"\u001a\u00020#J\u001e\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020(J\u000e\u0010*\u001a\u00020#2\u0006\u0010%\u001a\u00020&J\u0006\u0010+\u001a\u00020#J\u001e\u0010,\u001a\u00020#2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020(2\u0006\u00100\u001a\u00020(J\b\u00101\u001a\u00020#H\u0002J\u0016\u00102\u001a\u00020#2\f\u00103\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0002J\u000e\u00104\u001a\u00020#2\u0006\u00105\u001a\u000206J\b\u00107\u001a\u00020#H\u0016R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u0004\u001a\u0014\u0012\f\u0012\n \u000e*\u0004\u0018\u00010\u00060\u00060\rj\u0002`\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!¨\u0006;"}, d2 = {"Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyClient;", "Ljava/lang/AutoCloseable;", NotificationCompat.CATEGORY_TRANSPORT, "Ltop/fifthlight/touchcontroller/proxy/client/MessageTransport;", "capabilities", "", "Ltop/fifthlight/touchcontroller/proxy/client/PlatformCapability;", "<init>", "(Ltop/fifthlight/touchcontroller/proxy/client/MessageTransport;Ljava/util/Set;)V", "running", "Ljava/util/concurrent/atomic/AtomicBoolean;", "messageClient", "Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyMessageClient;", "Ljava/util/HashSet;", "kotlin.jvm.PlatformType", "Lkotlin/collections/HashSet;", "vibrationHandler", "Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyClient$VibrationHandler;", "getVibrationHandler", "()Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyClient$VibrationHandler;", "setVibrationHandler", "(Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyClient$VibrationHandler;)V", "inputHandler", "Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyClient$InputHandler;", "getInputHandler", "()Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyClient$InputHandler;", "setInputHandler", "(Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyClient$InputHandler;)V", "keyboardShowHandler", "Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyClient$KeyboardShowHandler;", "getKeyboardShowHandler", "()Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyClient$KeyboardShowHandler;", "setKeyboardShowHandler", "(Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyClient$KeyboardShowHandler;)V", "run", "", "addPointer", "index", "", "x", "", "y", "removePointer", "clearPointer", "moveView", "screenBased", "", "deltaPitch", "deltaYaw", "sendCapabilities", "updateCapabilities", "newCapabilities", "updateTextInputState", "newState", "Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;", "close", "VibrationHandler", "InputHandler", "KeyboardShowHandler", "TouchController-Proxy-Client"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes24.dex */
public final class LauncherProxyClient implements AutoCloseable {
    private HashSet<PlatformCapability> capabilities;
    private InputHandler inputHandler;
    private KeyboardShowHandler keyboardShowHandler;
    private final LauncherProxyMessageClient messageClient;
    private final AtomicBoolean running;
    private VibrationHandler vibrationHandler;

    /* compiled from: LauncherProxyClient.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\bH&J\u0012\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\bH&¨\u0006\u000b"}, d2 = {"Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyClient$InputHandler;", "", "updateState", "", "textInputState", "Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;", "updateCursor", "cursorRect", "Ltop/fifthlight/touchcontroller/proxy/message/FloatRect;", "updateArea", "inputAreaRect", "TouchController-Proxy-Client"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface InputHandler {
        void updateArea(FloatRect inputAreaRect);

        void updateCursor(FloatRect cursorRect);

        void updateState(TextInputState textInputState);
    }

    /* compiled from: LauncherProxyClient.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&¨\u0006\u0005"}, d2 = {"Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyClient$KeyboardShowHandler;", "", "showKeyboard", "", "hideKeyboard", "TouchController-Proxy-Client"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface KeyboardShowHandler {
        void hideKeyboard();

        void showKeyboard();
    }

    /* compiled from: LauncherProxyClient.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyClient$VibrationHandler;", "", "vibrate", "", "kind", "Ltop/fifthlight/touchcontroller/proxy/message/VibrateMessage$Kind;", "TouchController-Proxy-Client"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface VibrationHandler {
        void vibrate(VibrateMessage.Kind kind);
    }

    public LauncherProxyClient(MessageTransport transport, Set<? extends PlatformCapability> capabilities) {
        Intrinsics.checkNotNullParameter(transport, "transport");
        Intrinsics.checkNotNullParameter(capabilities, "capabilities");
        this.running = new AtomicBoolean(false);
        this.messageClient = new LauncherProxyMessageClient(transport);
        this.capabilities = new HashSet<>(capabilities);
    }

    public /* synthetic */ LauncherProxyClient(MessageTransport messageTransport, Set set, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(messageTransport, (i & 2) != 0 ? SetsKt.emptySet() : set);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LauncherProxyClient(MessageTransport transport) {
        this(transport, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(transport, "transport");
    }

    public final VibrationHandler getVibrationHandler() {
        return this.vibrationHandler;
    }

    public final void setVibrationHandler(VibrationHandler vibrationHandler) {
        this.vibrationHandler = vibrationHandler;
    }

    public final InputHandler getInputHandler() {
        return this.inputHandler;
    }

    public final void setInputHandler(InputHandler inputHandler) {
        this.inputHandler = inputHandler;
    }

    public final KeyboardShowHandler getKeyboardShowHandler() {
        return this.keyboardShowHandler;
    }

    public final void setKeyboardShowHandler(KeyboardShowHandler keyboardShowHandler) {
        this.keyboardShowHandler = keyboardShowHandler;
    }

    public final void run() {
        if (this.running.compareAndSet(false, true)) {
            this.messageClient.run();
            new Thread(new Runnable() { // from class: top.fifthlight.touchcontroller.proxy.client.LauncherProxyClient$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    LauncherProxyClient.run$lambda$0(this.f$0);
                }
            }).start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void run$lambda$0(LauncherProxyClient this$0) {
        while (true) {
            ProxyMessage message = this$0.messageClient.receive();
            if (message != null) {
                if (message instanceof VibrateMessage) {
                    VibrationHandler vibrationHandler = this$0.vibrationHandler;
                    if (vibrationHandler != null) {
                        vibrationHandler.vibrate(((VibrateMessage) message).getKind());
                    }
                } else if (message instanceof InitializeMessage) {
                    this$0.sendCapabilities();
                } else if (message instanceof InputStatusMessage) {
                    InputHandler inputHandler = this$0.inputHandler;
                    if (inputHandler != null) {
                        inputHandler.updateState(((InputStatusMessage) message).getStatus());
                    }
                } else if (message instanceof InputCursorMessage) {
                    InputHandler inputHandler2 = this$0.inputHandler;
                    if (inputHandler2 != null) {
                        inputHandler2.updateCursor(((InputCursorMessage) message).getCursorRect());
                    }
                } else if (message instanceof InputAreaMessage) {
                    InputHandler inputHandler3 = this$0.inputHandler;
                    if (inputHandler3 != null) {
                        inputHandler3.updateArea(((InputAreaMessage) message).getInputAreaRect());
                    }
                } else if (message instanceof KeyboardShowMessage) {
                    if (((KeyboardShowMessage) message).getShow()) {
                        KeyboardShowHandler keyboardShowHandler = this$0.keyboardShowHandler;
                        if (keyboardShowHandler != null) {
                            keyboardShowHandler.showKeyboard();
                        }
                    } else {
                        KeyboardShowHandler keyboardShowHandler2 = this$0.keyboardShowHandler;
                        if (keyboardShowHandler2 != null) {
                            keyboardShowHandler2.hideKeyboard();
                        }
                    }
                }
            } else {
                return;
            }
        }
    }

    public final void addPointer(int index, float x, float y) {
        this.messageClient.send(new AddPointerMessage(index, x, y));
    }

    public final void removePointer(int index) {
        this.messageClient.send(new RemovePointerMessage(index));
    }

    public final void clearPointer() {
        this.messageClient.send(ClearPointerMessage.INSTANCE);
    }

    public final void moveView(boolean screenBased, float deltaPitch, float deltaYaw) {
        this.messageClient.send(new MoveViewMessage(screenBased, deltaPitch, deltaYaw));
    }

    private final void sendCapabilities() {
        Iterator<PlatformCapability> it = this.capabilities.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext()) {
            PlatformCapability capability = it.next();
            this.messageClient.send(new CapabilityMessage(capability.getId(), true));
        }
    }

    private final void updateCapabilities(Set<? extends PlatformCapability> newCapabilities) {
        Iterator<PlatformCapability> it = this.capabilities.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext()) {
            PlatformCapability item = it.next();
            if (!newCapabilities.contains(item)) {
                this.messageClient.send(new CapabilityMessage(item.getId(), false));
            }
        }
        for (PlatformCapability item2 : newCapabilities) {
            if (!this.capabilities.contains(item2)) {
                this.messageClient.send(new CapabilityMessage(item2.getId(), true));
            }
        }
        this.capabilities = new HashSet<>(newCapabilities);
    }

    public final void updateTextInputState(TextInputState newState) {
        Intrinsics.checkNotNullParameter(newState, "newState");
        if (!this.capabilities.contains(PlatformCapability.TEXT_STATUS)) {
            return;
        }
        this.messageClient.send(new InputStatusMessage(newState));
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        this.messageClient.close();
    }
}
