package com.pymcl.runtime.control;

import com.pymcl.multiplayer.TerracottaVpnService;
import com.pymcl.runtime.input.InputSettings;
import com.pymcl.runtime.input.Keys;
import java.io.IOException;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DefaultLayouts.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jc\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0012\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\f\"\u00020\u00072\b\b\u0002\u0010\r\u001a\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\t2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0002\u0010\u0012J\u0006\u0010\u0013\u001a\u00020\u0014J\u0006\u0010\u0015\u001a\u00020\u0014R#\u0010\u0016\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00180\u0017¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/pymcl/runtime/control/DefaultLayouts;", "", "<init>", "()V", "b", "Lcom/pymcl/runtime/control/ControlElement;", TerracottaVpnService.EXTRA_TEXT, "", "x", "", "y", "keys", "", "w", "h", "toggle", "", "grabbed", "(Ljava/lang/String;FF[Ljava/lang/String;FFZLjava/lang/Boolean;)Lcom/pymcl/runtime/control/ControlElement;", InputSettings.DEFAULT_LAYOUT, "Lcom/pymcl/runtime/control/ControlLayout;", "dpad", "builtins", "", "Lkotlin/Function0;", "getBuiltins", "()Ljava/util/Map;", "PyMCL-Android:runtime_debug"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class DefaultLayouts {
    public static final DefaultLayouts INSTANCE = new DefaultLayouts();
    private static final Map<String, Function0<ControlLayout>> builtins = MapsKt.linkedMapOf(TuplesKt.to(InputSettings.DEFAULT_LAYOUT, new DefaultLayouts$builtins$1(INSTANCE)), TuplesKt.to("dpad", new DefaultLayouts$builtins$2(INSTANCE)));

    private DefaultLayouts() {
    }

    static /* synthetic */ ControlElement b$default(DefaultLayouts defaultLayouts, String str, float f, float f2, String[] strArr, float f3, float f4, boolean z, Boolean bool, int i, Object obj) {
        boolean z2;
        Boolean bool2;
        float f5 = (i & 16) != 0 ? 0.07f : f3;
        float f6 = (i & 32) != 0 ? 0.11f : f4;
        if ((i & 64) == 0) {
            z2 = z;
        } else {
            z2 = false;
        }
        if ((i & 128) == 0) {
            bool2 = bool;
        } else {
            bool2 = null;
        }
        return defaultLayouts.b(str, f, f2, strArr, f5, f6, z2, bool2);
    }

    private final ControlElement b(String text, float x, float y, String[] keys, float w, float h, boolean toggle, Boolean grabbed) throws IOException {
        CharSequence $this$filter$iv = text.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue($this$filter$iv, "toLowerCase(...)");
        CharSequence $this$filterTo$iv$iv = $this$filter$iv;
        Appendable destination$iv$iv = new StringBuilder();
        int length = $this$filterTo$iv$iv.length();
        for (int index$iv$iv = 0; index$iv$iv < length; index$iv$iv++) {
            char element$iv$iv = $this$filterTo$iv$iv.charAt(index$iv$iv);
            if (Character.isLetterOrDigit(element$iv$iv)) {
                destination$iv$iv.append(element$iv$iv);
            }
        }
        String $this$filter$iv2 = ((StringBuilder) destination$iv$iv).toString();
        if ($this$filter$iv2.length() == 0) {
            String lowerCase = ((String) ArraysKt.first(keys)).toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            $this$filter$iv2 = lowerCase;
        }
        return new ControlElement("btn_" + ((Object) $this$filter$iv2), ElementType.BUTTON, text, x, y, w, h, ArraysKt.toMutableList(keys), toggle, 0.0f, 0.0f, grabbed, null, 0.0f, 13824, null);
    }

    /* renamed from: default, reason: not valid java name */
    public final ControlLayout m8059default() {
        return new ControlLayout(InputSettings.DEFAULT_LAYOUT, 0, "PyMCL", "默认布局：左摇杆移动，右侧跳跃/潜行/攻击/使用", CollectionsKt.mutableListOf(new ControlElement("move", ElementType.JOYSTICK, null, 0.04f, 0.52f, 0.24f, 0.42f, CollectionsKt.mutableListOf("KEY_W", "KEY_S", "KEY_A", "KEY_D"), false, 0.0f, 0.0f, true, "KEY_LEFTCTRL", 0.0f, 9988, null), b$default(this, "跳", 0.86f, 0.62f, new String[]{"KEY_SPACE"}, 0.1f, 0.17f, false, true, 64, null), b$default(this, "蹲", 0.86f, 0.82f, new String[]{"KEY_LEFTSHIFT"}, 0.0f, 0.0f, true, true, 48, null), b$default(this, "攻", 0.74f, 0.45f, new String[]{Keys.MOUSE_LEFT}, 0.0f, 0.0f, false, true, 112, null), b$default(this, "用", 0.74f, 0.62f, new String[]{Keys.MOUSE_RIGHT}, 0.0f, 0.0f, false, true, 112, null), b$default(this, "背包", 0.93f, 0.02f, new String[]{"KEY_E"}, 0.06f, 0.1f, false, null, 192, null), b$default(this, "丢", 0.86f, 0.02f, new String[]{"KEY_Q"}, 0.06f, 0.1f, false, true, 64, null), b$default(this, "聊", 0.3f, 0.02f, new String[]{"KEY_T"}, 0.06f, 0.1f, false, true, 64, null), b$default(this, "Esc", 0.01f, 0.02f, new String[]{"KEY_ESC"}, 0.06f, 0.1f, false, null, 192, null), b$default(this, "键盘", 0.08f, 0.02f, new String[]{Keys.Action.TOGGLE_IME.getId()}, 0.06f, 0.1f, false, null, 192, null), b$default(this, "PC", 0.15f, 0.02f, new String[]{Keys.Action.PC_KEYBOARD.getId()}, 0.06f, 0.1f, false, null, 192, null), b$default(this, "快捷", 0.22f, 0.02f, new String[]{Keys.Action.QUICK_INPUT.getId()}, 0.06f, 0.1f, false, null, 192, null), b$default(this, "鼠标", 0.37f, 0.02f, new String[]{Keys.Action.TOGGLE_CURSOR.getId()}, 0.06f, 0.1f, false, false, 64, null), b$default(this, "F5", 0.44f, 0.02f, new String[]{"KEY_F5"}, 0.06f, 0.1f, false, true, 64, null), b$default(this, "Tab", 0.51f, 0.02f, new String[]{"KEY_TAB"}, 0.06f, 0.1f, false, true, 64, null), b$default(this, "编辑", 0.79f, 0.02f, new String[]{Keys.Action.EDIT_LAYOUT.getId()}, 0.06f, 0.1f, false, null, 192, null), b$default(this, "↑", 0.82f, 0.3f, new String[]{Keys.SCROLL_UP}, 0.05f, 0.09f, false, true, 64, null), b$default(this, "↓", 0.88f, 0.3f, new String[]{Keys.SCROLL_DOWN}, 0.05f, 0.09f, false, true, 64, null)), 2, null);
    }

    public final ControlLayout dpad() {
        ControlLayout $this$dpad_u24lambda_u240 = m8059default();
        $this$dpad_u24lambda_u240.setName("dpad");
        $this$dpad_u24lambda_u240.setDescription("十字方向键布局");
        CollectionsKt.removeAll((List) $this$dpad_u24lambda_u240.getElements(), new Function1() { // from class: com.pymcl.runtime.control.DefaultLayouts$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(DefaultLayouts.dpad$lambda$0$0((ControlElement) obj));
            }
        });
        $this$dpad_u24lambda_u240.getElements().add(0, new ControlElement("move", ElementType.DPAD, null, 0.04f, 0.52f, 0.24f, 0.42f, CollectionsKt.mutableListOf("KEY_W", "KEY_S", "KEY_A", "KEY_D"), false, 0.0f, 0.0f, true, null, 0.0f, 14084, null));
        return $this$dpad_u24lambda_u240;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean dpad$lambda$0$0(ControlElement it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Intrinsics.areEqual(it.getId(), "move");
    }

    public final Map<String, Function0<ControlLayout>> getBuiltins() {
        return builtins;
    }
}
