package com.pymcl.runtime.input;

import android.view.KeyEvent;
import android.view.MotionEvent;
import androidx.core.view.InputDeviceCompat;
import com.pymcl.runtime.input.Keys;
import com.pymcl.runtime.settings.SettingsProtocol;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Gamepad.kt */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u0000 O2\u00020\u0001:\u0001OB9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0004\b\f\u0010\rJ\u000e\u00107\u001a\u00020%2\u0006\u00108\u001a\u000209J \u0010:\u001a\u00020%2\u0006\u0010;\u001a\u00020\"2\u0006\u0010<\u001a\u00020%2\b\b\u0002\u0010=\u001a\u00020\"J\u0018\u0010>\u001a\u00020\u000b2\u0006\u0010?\u001a\u00020\u001d2\u0006\u0010<\u001a\u00020%H\u0002J\u000e\u0010@\u001a\u00020%2\u0006\u00108\u001a\u00020AJ6\u0010B\u001a\u00020\u000b2\u0006\u0010C\u001a\u00020\u00052\u0006\u0010D\u001a\u00020\u00052\u0006\u0010E\u001a\u00020\u00052\u0006\u0010F\u001a\u00020\u00052\u0006\u0010G\u001a\u00020\u00052\u0006\u0010H\u001a\u00020\u0005J\u0006\u0010I\u001a\u00020\u000bJ\u0010\u0010J\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0005H\u0002J\u0018\u0010K\u001a\u00020\u000b2\u0006\u0010L\u001a\u00020\"2\u0006\u0010M\u001a\u00020%H\u0002J\u0006\u0010N\u001a\u00020\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R&\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R$\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0007@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR*\u0010\u001b\u001a\u001e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e0\u001cj\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e`\u001fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010 \u001a\u0012\u0012\u0004\u0012\u00020\"0!j\b\u0012\u0004\u0012\u00020\"`#X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020%X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020%X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010(\u001a\u00020\u00052\u0006\u0010'\u001a\u00020\u0005@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u000fR\u001e\u0010*\u001a\u00020\u00052\u0006\u0010'\u001a\u00020\u0005@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u000fR(\u0010,\u001a\u00020\u00058FX\u0087\u0004r\f\b0\u0012\b\b1\u0012\u0004\b\b(2¢\u0006\f\u0012\u0004\b-\u0010.\u001a\u0004\b/\u0010\u000fR(\u00103\u001a\u00020\u00058FX\u0087\u0004r\f\b0\u0012\b\b1\u0012\u0004\b\b(6¢\u0006\f\u0012\u0004\b4\u0010.\u001a\u0004\b5\u0010\u000f¨\u0006P"}, d2 = {"Lcom/pymcl/runtime/input/GamepadMapper;", "", "sink", "Lcom/pymcl/runtime/input/InputSink;", "deadzone", "", "mapping", "Lcom/pymcl/runtime/input/GamepadMapping;", "onAction", "Lkotlin/Function1;", "Lcom/pymcl/runtime/input/Keys$Action;", "", "<init>", "(Lcom/pymcl/runtime/input/InputSink;FLcom/pymcl/runtime/input/GamepadMapping;Lkotlin/jvm/functions/Function1;)V", "getDeadzone", "()F", "setDeadzone", "(F)V", "getOnAction", "()Lkotlin/jvm/functions/Function1;", "setOnAction", "(Lkotlin/jvm/functions/Function1;)V", SettingsProtocol.EXTRA_VALUE, "getMapping", "()Lcom/pymcl/runtime/input/GamepadMapping;", "setMapping", "(Lcom/pymcl/runtime/input/GamepadMapping;)V", "heldButtons", "Ljava/util/HashMap;", "Lcom/pymcl/runtime/input/GamepadButton;", "", "Lkotlin/collections/HashMap;", "heldKeys", "Ljava/util/HashSet;", "", "Lkotlin/collections/HashSet;", "trigL", "", "trigR", "value", "lookX", "getLookX", "lookY", "getLookY", "rightX", "getRightX$annotations", "()V", "getRightX", "Lkotlin/Deprecated;", "message", "use lookX", "rightY", "getRightY$annotations", "getRightY", "use lookY", "onKey", "e", "Landroid/view/KeyEvent;", "onButton", "keycode", "down", "repeat", "button", "b", "onMotion", "Landroid/view/MotionEvent;", "onAxes", "lx", "ly", "rx", "ry", "lt", "rt", "tick", "dz", "setKey", "code", "on", "releaseAll", "Companion", "PyMCL-Android:runtime_debug"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GamepadMapper {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final float STICK_THRESHOLD = 0.3f;
    public static final float TRIGGER_THRESHOLD = 0.5f;
    private float deadzone;
    private final HashMap<GamepadButton, String> heldButtons;
    private final HashSet<Integer> heldKeys;
    private float lookX;
    private float lookY;
    private GamepadMapping mapping;
    private Function1<? super Keys.Action, Unit> onAction;
    private final InputSink sink;
    private boolean trigL;
    private boolean trigR;

    /* compiled from: Gamepad.kt */
    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[StickMode.values().length];
            try {
                iArr[StickMode.MOVE.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                iArr[StickMode.LOOK.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                iArr[StickMode.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Deprecated(message = "use lookX")
    public static /* synthetic */ void getRightX$annotations() {
    }

    @Deprecated(message = "use lookY")
    public static /* synthetic */ void getRightY$annotations() {
    }

    public GamepadMapper(InputSink sink, float deadzone, GamepadMapping mapping, Function1<? super Keys.Action, Unit> onAction) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        Intrinsics.checkNotNullParameter(mapping, "mapping");
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        this.sink = sink;
        this.deadzone = deadzone;
        this.onAction = onAction;
        this.mapping = mapping;
        this.heldButtons = new HashMap<>();
        this.heldKeys = new HashSet<>();
    }

    public /* synthetic */ GamepadMapper(InputSink inputSink, float f, GamepadMapping gamepadMapping, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(inputSink, (i & 2) != 0 ? 0.15f : f, (i & 4) != 0 ? GamepadMapping.INSTANCE.m8064default() : gamepadMapping, (i & 8) != 0 ? new Function1() { // from class: com.pymcl.runtime.input.GamepadMapper$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return GamepadMapper._init_$lambda$0((Keys.Action) obj);
            }
        } : function1);
    }

    public final float getDeadzone() {
        return this.deadzone;
    }

    public final void setDeadzone(float f) {
        this.deadzone = f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$0(Keys.Action it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    public final Function1<Keys.Action, Unit> getOnAction() {
        return this.onAction;
    }

    public final void setOnAction(Function1<? super Keys.Action, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.onAction = function1;
    }

    public final GamepadMapping getMapping() {
        return this.mapping;
    }

    public final void setMapping(GamepadMapping v) {
        Intrinsics.checkNotNullParameter(v, "v");
        releaseAll();
        this.mapping = v;
    }

    public final float getLookX() {
        return this.lookX;
    }

    public final float getLookY() {
        return this.lookY;
    }

    public final float getRightX() {
        return this.lookX;
    }

    public final float getRightY() {
        return this.lookY;
    }

    /* compiled from: Gamepad.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/pymcl/runtime/input/GamepadMapper$Companion;", "", "<init>", "()V", "STICK_THRESHOLD", "", "TRIGGER_THRESHOLD", "isGamepad", "", "e", "Landroid/view/KeyEvent;", "Landroid/view/MotionEvent;", "PyMCL-Android:runtime_debug"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final boolean isGamepad(KeyEvent e) {
            Intrinsics.checkNotNullParameter(e, "e");
            return (e.getSource() & 1025) == 1025 || (e.getSource() & InputDeviceCompat.SOURCE_JOYSTICK) == 16777232;
        }

        public final boolean isGamepad(MotionEvent e) {
            Intrinsics.checkNotNullParameter(e, "e");
            return (e.getSource() & InputDeviceCompat.SOURCE_JOYSTICK) == 16777232;
        }
    }

    public final boolean onKey(KeyEvent e) {
        Intrinsics.checkNotNullParameter(e, "e");
        return onButton(e.getKeyCode(), e.getAction() == 0, e.getRepeatCount());
    }

    public static /* synthetic */ boolean onButton$default(GamepadMapper gamepadMapper, int i, boolean z, int i2, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            i2 = 0;
        }
        return gamepadMapper.onButton(i, z, i2);
    }

    public final boolean onButton(int keycode, boolean down, int repeat) {
        GamepadButton b = GamepadButton.INSTANCE.ofKeycode(keycode);
        if (b == null) {
            return false;
        }
        if (down && repeat > 0) {
            return true;
        }
        button(b, down);
        return true;
    }

    private final void button(GamepadButton b, boolean down) {
        Keys.Action actionDispatch;
        if (down) {
            if (this.heldButtons.containsKey(b)) {
                return;
            }
            String name = this.mapping.keyFor(b);
            this.heldButtons.put(b, name);
            if (!(name.length() > 0) || (actionDispatch = Keys.INSTANCE.dispatch(this.sink, name, true)) == null) {
                return;
            }
            this.onAction.invoke(actionDispatch);
            return;
        }
        String name2 = this.heldButtons.remove(b);
        if (name2 == null) {
            return;
        }
        if (name2.length() > 0) {
            Keys.INSTANCE.dispatch(this.sink, name2, false);
        }
    }

    public final boolean onMotion(MotionEvent e) {
        Intrinsics.checkNotNullParameter(e, "e");
        onAxes(e.getAxisValue(0), e.getAxisValue(1), e.getAxisValue(11), e.getAxisValue(14), Math.max(e.getAxisValue(17), e.getAxisValue(23)), Math.max(e.getAxisValue(18), e.getAxisValue(22)));
        return true;
    }

    public final void onAxes(float lx, float ly, float rx, float ry, float lt, float rt) {
        float moveX = 0.0f;
        float moveY = 0.0f;
        float lkX = 0.0f;
        float lkY = 0.0f;
        for (Triple triple : CollectionsKt.listOf((Object[]) new Triple[]{new Triple(this.mapping.getLeftStick(), Float.valueOf(dz(lx)), Float.valueOf(dz(ly))), new Triple(this.mapping.getRightStick(), Float.valueOf(dz(rx)), Float.valueOf(dz(ry)))})) {
            StickMode mode = (StickMode) triple.component1();
            float x = ((Number) triple.component2()).floatValue();
            float y = ((Number) triple.component3()).floatValue();
            switch (WhenMappings.$EnumSwitchMapping$0[mode.ordinal()]) {
                case 1:
                    if (Math.abs(x) > Math.abs(moveX)) {
                        moveX = x;
                    }
                    if (Math.abs(y) > Math.abs(moveY)) {
                        moveY = y;
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (Math.abs(x) > Math.abs(lkX)) {
                        lkX = x;
                    }
                    if (Math.abs(y) > Math.abs(lkY)) {
                        lkY = y;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
        setKey(17, moveY < -0.3f);
        setKey(31, moveY > 0.3f);
        setKey(30, moveX < -0.3f);
        setKey(32, moveX > 0.3f);
        this.lookX = lkX;
        this.lookY = this.mapping.getInvertY() ? -lkY : lkY;
        boolean l = lt > 0.5f;
        boolean r = rt > 0.5f;
        if (l != this.trigL) {
            this.trigL = l;
            button(GamepadButton.LT, l);
        }
        if (r != this.trigR) {
            this.trigR = r;
            button(GamepadButton.RT, r);
        }
    }

    public final void tick() {
        if (this.lookX == 0.0f) {
            if (this.lookY == 0.0f) {
                return;
            }
        }
        this.sink.lookDelta(this.lookX * this.mapping.getLookSpeed(), this.lookY * this.mapping.getLookSpeed());
    }

    private final float dz(float v) {
        if (Math.abs(v) < this.deadzone) {
            return 0.0f;
        }
        return v;
    }

    private final void setKey(int code, boolean on) {
        InputSink inputSink;
        boolean z;
        if (on && this.heldKeys.add(Integer.valueOf(code))) {
            inputSink = this.sink;
            z = true;
        } else {
            if (on || !this.heldKeys.remove(Integer.valueOf(code))) {
                return;
            }
            inputSink = this.sink;
            z = false;
        }
        inputSink.key(code, z);
    }

    public final void releaseAll() {
        Iterable $this$forEach$iv = CollectionsKt.toList(this.heldKeys);
        for (Object element$iv : $this$forEach$iv) {
            this.sink.key(((Number) element$iv).intValue(), false);
        }
        this.heldKeys.clear();
        Set<GamepadButton> setKeySet = this.heldButtons.keySet();
        Intrinsics.checkNotNullExpressionValue(setKeySet, "<get-keys>(...)");
        Iterable $this$forEach$iv2 = CollectionsKt.toList(setKeySet);
        for (Object element$iv2 : $this$forEach$iv2) {
            GamepadButton it = (GamepadButton) element$iv2;
            Intrinsics.checkNotNull(it);
            button(it, false);
        }
        this.trigL = false;
        this.trigR = false;
        this.lookX = 0.0f;
        this.lookY = 0.0f;
    }
}
