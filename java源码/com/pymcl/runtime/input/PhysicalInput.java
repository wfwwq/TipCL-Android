package com.pymcl.runtime.input;

import android.view.InputDevice;
import android.view.KeyEvent;
import android.view.MotionEvent;
import androidx.core.view.InputDeviceCompat;
import com.tungsten.fclauncher.keycodes.AndroidKeycodeMap;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PhysicalInput.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000 \u001c2\u00020\u0001:\u0002\u001b\u001cB\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013J\u000e\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0015J\u000e\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0015J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000fH\u0002J\u0006\u0010\u001a\u001a\u00020\u0018R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/pymcl/runtime/input/PhysicalInput;", "", "sink", "Lcom/pymcl/runtime/input/InputSink;", "settings", "Lcom/pymcl/runtime/input/InputSettings;", "callbacks", "Lcom/pymcl/runtime/input/PhysicalInput$Callbacks;", "<init>", "(Lcom/pymcl/runtime/input/InputSink;Lcom/pymcl/runtime/input/InputSettings;Lcom/pymcl/runtime/input/PhysicalInput$Callbacks;)V", "gamepad", "Lcom/pymcl/runtime/input/GamepadMapper;", "getGamepad", "()Lcom/pymcl/runtime/input/GamepadMapper;", "lastButtons", "", "onKey", "", "e", "Landroid/view/KeyEvent;", "onGenericMotion", "Landroid/view/MotionEvent;", "onCapturedPointer", "syncButtons", "", "state", "reset", "Callbacks", "Companion", "PyMCL-Android:runtime_debug"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PhysicalInput {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Callbacks callbacks;
    private final GamepadMapper gamepad;
    private int lastButtons;
    private final InputSettings settings;
    private final InputSink sink;

    /* compiled from: PhysicalInput.kt */
    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[GamepadRoute.values().length];
            try {
                iArr[GamepadRoute.PROMPT.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                iArr[GamepadRoute.SWALLOW.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                iArr[GamepadRoute.DIRECT.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                iArr[GamepadRoute.MAPPING.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public PhysicalInput(InputSink sink, InputSettings settings, Callbacks callbacks) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        Intrinsics.checkNotNullParameter(settings, "settings");
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        this.sink = sink;
        this.settings = settings;
        this.callbacks = callbacks;
        this.gamepad = new GamepadMapper(this.sink, this.settings.getGamepadDeadzone(), null, null, 12, null);
    }

    /* compiled from: PhysicalInput.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&J\b\u0010\u0007\u001a\u00020\u0005H&J\b\u0010\b\u001a\u00020\u0005H&J\b\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000fH\u0016¨\u0006\u0010À\u0006\u0003"}, d2 = {"Lcom/pymcl/runtime/input/PhysicalInput$Callbacks;", "", "isGrabbed", "", "toggleIme", "", "imeShowing", "togglePointerCapture", "onExternalMouseUsed", "gamepadRoute", "Lcom/pymcl/runtime/input/GamepadRoute;", "forwardGamepadKey", "e", "Landroid/view/KeyEvent;", "forwardGamepadMotion", "Landroid/view/MotionEvent;", "PyMCL-Android:runtime_debug"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public interface Callbacks {
        boolean imeShowing();

        boolean isGrabbed();

        void onExternalMouseUsed();

        void toggleIme();

        void togglePointerCapture();

        /* compiled from: PhysicalInput.kt */
        @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
        public static final class DefaultImpls {
            @Deprecated
            public static GamepadRoute gamepadRoute(Callbacks $this) {
                return Callbacks.super.gamepadRoute();
            }

            @Deprecated
            public static boolean forwardGamepadKey(Callbacks $this, KeyEvent e) {
                Intrinsics.checkNotNullParameter(e, "e");
                return Callbacks.super.forwardGamepadKey(e);
            }

            @Deprecated
            public static boolean forwardGamepadMotion(Callbacks $this, MotionEvent e) {
                Intrinsics.checkNotNullParameter(e, "e");
                return Callbacks.super.forwardGamepadMotion(e);
            }
        }

        default GamepadRoute gamepadRoute() {
            return GamepadRoute.MAPPING;
        }

        default boolean forwardGamepadKey(KeyEvent e) {
            Intrinsics.checkNotNullParameter(e, "e");
            return SdlDirectGamepad.INSTANCE.forwardKey(e);
        }

        default boolean forwardGamepadMotion(MotionEvent e) {
            Intrinsics.checkNotNullParameter(e, "e");
            return SdlDirectGamepad.INSTANCE.forwardMotion(e);
        }
    }

    public final GamepadMapper getGamepad() {
        return this.gamepad;
    }

    /* compiled from: PhysicalInput.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\t"}, d2 = {"Lcom/pymcl/runtime/input/PhysicalInput$Companion;", "", "<init>", "()V", "isMouseOriginated", "", "e", "Landroid/view/KeyEvent;", "isSoftKeyboard", "PyMCL-Android:runtime_debug"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final boolean isMouseOriginated(KeyEvent e) {
            Intrinsics.checkNotNullParameter(e, "e");
            if ((e.getSource() & 8194) == 8194) {
                return true;
            }
            InputDevice dev = e.getDevice();
            if (dev == null && (dev = InputDevice.getDevice(e.getDeviceId())) == null) {
                return false;
            }
            return dev.supportsSource(8194) || dev.supportsSource(InputDeviceCompat.SOURCE_TOUCHPAD);
        }

        public final boolean isSoftKeyboard(KeyEvent e) {
            Intrinsics.checkNotNullParameter(e, "e");
            return (e.getFlags() & 2) != 0;
        }
    }

    public final boolean onKey(KeyEvent e) {
        Intrinsics.checkNotNullParameter(e, "e");
        if (e.getKeyCode() == 0 || e.getAction() == 2) {
            return true;
        }
        if (e.getKeyCode() == 24 || e.getKeyCode() == 25) {
            return false;
        }
        if (e.getAction() == 1 && (e.getFlags() & 32) != 0) {
            return true;
        }
        boolean down = e.getAction() == 0;
        if (e.getKeyCode() == 4 && INSTANCE.isMouseOriginated(e)) {
            this.sink.mouseButton(1, down);
            return true;
        }
        if (INSTANCE.isSoftKeyboard(e)) {
            return e.getKeyCode() == 66;
        }
        if (e.getKeyCode() == this.settings.getImeHotkey()) {
            if (!down) {
                this.callbacks.toggleIme();
            }
            return true;
        }
        if (e.getKeyCode() == this.settings.getCapturePointerHotkey()) {
            if (!down) {
                this.callbacks.togglePointerCapture();
            }
            return true;
        }
        if (this.settings.getGamepadEnabled() && GamepadMapper.INSTANCE.isGamepad(e)) {
            switch (WhenMappings.$EnumSwitchMapping$0[this.callbacks.gamepadRoute().ordinal()]) {
                case 1:
                case 2:
                    return true;
                case 3:
                    return this.callbacks.forwardGamepadKey(e);
                case 4:
                    if (this.gamepad.onKey(e)) {
                        return true;
                    }
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
        if (e.getKeyCode() == 4) {
            if (!down) {
                this.sink.tapKey(1);
            }
            return true;
        }
        if ((e.getKeyCode() == 66 || e.getKeyCode() == 160) && this.settings.getEnterOpensIme() && !this.callbacks.isGrabbed() && !this.callbacks.imeShowing()) {
            if (!down) {
                this.callbacks.toggleIme();
            }
            return true;
        }
        int code = AndroidKeycodeMap.convertKeycode(e.getKeyCode());
        if (code == 240) {
            return false;
        }
        if (e.getRepeatCount() == 0) {
            this.sink.key(code, down);
        }
        return true;
    }

    public final boolean onGenericMotion(MotionEvent e) {
        Intrinsics.checkNotNullParameter(e, "e");
        if (this.settings.getGamepadEnabled() && GamepadMapper.INSTANCE.isGamepad(e) && e.getActionMasked() == 2) {
            switch (WhenMappings.$EnumSwitchMapping$0[this.callbacks.gamepadRoute().ordinal()]) {
                case 1:
                case 2:
                    return true;
                case 3:
                    return this.callbacks.forwardGamepadMotion(e);
                case 4:
                    return this.gamepad.onMotion(e);
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
        if (!e.isFromSource(2)) {
            return false;
        }
        this.callbacks.onExternalMouseUsed();
        switch (e.getActionMasked()) {
            case 7:
                if (!this.callbacks.isGrabbed()) {
                    this.sink.cursorPos(e.getX(), e.getY());
                }
                return true;
            case 8:
                float v = e.getAxisValue(9);
                if (!(v == 0.0f)) {
                    this.sink.scroll(v);
                }
                return true;
            case 9:
            case 10:
            default:
                return false;
            case 11:
            case 12:
                if (!this.callbacks.isGrabbed()) {
                    this.sink.cursorPos(e.getX(), e.getY());
                }
                syncButtons(e.getButtonState());
                return true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onCapturedPointer(android.view.MotionEvent r14) {
        /*
            r13 = this;
            java.lang.String r0 = "e"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            int r0 = r14.getActionMasked()
            r1 = 8
            r2 = 1
            if (r0 != r1) goto L1b
            com.pymcl.runtime.input.InputSink r0 = r13.sink
            r1 = 9
            float r1 = r14.getAxisValue(r1)
            double r3 = (double) r1
            r0.scroll(r3)
            return r2
        L1b:
            r0 = 27
            float r1 = r14.getAxisValue(r0)
            r3 = 28
            float r4 = r14.getAxisValue(r3)
            r5 = 0
            int r6 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            r7 = 0
            if (r6 != 0) goto L2f
            r6 = r2
            goto L30
        L2f:
            r6 = r7
        L30:
            if (r6 == 0) goto L4c
            int r6 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r6 != 0) goto L38
            r6 = r2
            goto L39
        L38:
            r6 = r7
        L39:
            if (r6 == 0) goto L4c
            r6 = 1048584(0x100008, float:1.469379E-39)
            boolean r6 = r14.isFromSource(r6)
            if (r6 == 0) goto L4c
            float r1 = r14.getX()
            float r4 = r14.getY()
        L4c:
            r6 = 0
            int r8 = r14.getHistorySize()
        L51:
            if (r6 >= r8) goto L71
            com.pymcl.runtime.input.InputSink r9 = r13.sink
            float r10 = r14.getHistoricalAxisValue(r0, r6)
            com.pymcl.runtime.input.InputSettings r11 = r13.settings
            float r11 = r11.getMouseSensitivity()
            float r10 = r10 * r11
            float r11 = r14.getHistoricalAxisValue(r3, r6)
            com.pymcl.runtime.input.InputSettings r12 = r13.settings
            float r12 = r12.getMouseSensitivity()
            float r11 = r11 * r12
            r9.lookDelta(r10, r11)
            int r6 = r6 + 1
            goto L51
        L71:
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 != 0) goto L77
            r0 = r2
            goto L78
        L77:
            r0 = r7
        L78:
            if (r0 == 0) goto L81
            int r0 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r0 != 0) goto L7f
            r7 = r2
        L7f:
            if (r7 != 0) goto L94
        L81:
            com.pymcl.runtime.input.InputSink r0 = r13.sink
            com.pymcl.runtime.input.InputSettings r3 = r13.settings
            float r3 = r3.getMouseSensitivity()
            float r3 = r3 * r1
            com.pymcl.runtime.input.InputSettings r5 = r13.settings
            float r5 = r5.getMouseSensitivity()
            float r5 = r5 * r4
            r0.lookDelta(r3, r5)
        L94:
            int r0 = r14.getButtonState()
            r13.syncButtons(r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.runtime.input.PhysicalInput.onCapturedPointer(android.view.MotionEvent):boolean");
    }

    private final void syncButtons(int state) {
        int changed = this.lastButtons ^ state;
        syncButtons$chk(changed, this, state, 1, 0);
        syncButtons$chk(changed, this, state, 2, 1);
        syncButtons$chk(changed, this, state, 4, 2);
        this.lastButtons = state;
    }

    private static final void syncButtons$chk(int changed, PhysicalInput this$0, int $state, int mask, int btn) {
        if ((changed & mask) != 0) {
            this$0.sink.mouseButton(btn, ($state & mask) != 0);
        }
    }

    public final void reset() {
        this.lastButtons = 0;
        this.gamepad.releaseAll();
    }
}
