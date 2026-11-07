package com.pymcl.runtime.input;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: GamepadMapping.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\u0010\b\n\u0002\b\u0018\b\u0086\u0081\u0002\u0018\u0000 \u001d2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u001dB\u001d\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\u0010\u0004\u001a\u00020\u0005\"\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001c¨\u0006\u001e"}, d2 = {"Lcom/pymcl/runtime/input/GamepadButton;", "", "label", "", "keycodes", "", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;[I)V", "getLabel", "()Ljava/lang/String;", "getKeycodes", "()[I", "A", "B", "X", "Y", "LB", "RB", "LT", "RT", "START", "SELECT", "L3", "R3", "DPAD_UP", "DPAD_DOWN", "DPAD_LEFT", "DPAD_RIGHT", "Companion", "PyMCL-Android:runtime_debug"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes3.dex */
public enum GamepadButton {
    A("A", 96),
    B("B", 97),
    X("X", 99),
    Y("Y", 100),
    LB("LB / L1", 102),
    RB("RB / R1", 103),
    LT("LT / L2", 104),
    RT("RT / R2", 105),
    START("Start / Menu", 108),
    SELECT("Select / View", 109),
    L3("左摇杆按下 L3", 106),
    R3("右摇杆按下 R3", 107),
    DPAD_UP("十字键 上", 19),
    DPAD_DOWN("十字键 下", 20),
    DPAD_LEFT("十字键 左", 21),
    DPAD_RIGHT("十字键 右", 22);

    private final int[] keycodes;
    private final String label;
    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries($VALUES);

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    public static EnumEntries<GamepadButton> getEntries() {
        return $ENTRIES;
    }

    GamepadButton(String label, int... keycodes) {
        this.label = label;
        this.keycodes = keycodes;
    }

    public final int[] getKeycodes() {
        return this.keycodes;
    }

    public final String getLabel() {
        return this.label;
    }

    /* compiled from: GamepadMapping.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u0010\u0010\b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\t\u001a\u00020\n¨\u0006\u000b"}, d2 = {"Lcom/pymcl/runtime/input/GamepadButton$Companion;", "", "<init>", "()V", "ofKeycode", "Lcom/pymcl/runtime/input/GamepadButton;", "code", "", "of", "id", "", "PyMCL-Android:runtime_debug"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final GamepadButton ofKeycode(int code) {
            Object element$iv;
            Iterable $this$firstOrNull$iv = GamepadButton.getEntries();
            Iterator<GamepadButton> it = $this$firstOrNull$iv.iterator();
            while (true) {
                if (it.hasNext()) {
                    element$iv = it.next();
                    GamepadButton it2 = (GamepadButton) element$iv;
                    if (ArraysKt.contains(it2.getKeycodes(), code)) {
                        break;
                    }
                } else {
                    element$iv = null;
                    break;
                }
            }
            return (GamepadButton) element$iv;
        }

        public final GamepadButton of(String id) {
            Object element$iv;
            Intrinsics.checkNotNullParameter(id, "id");
            Iterable $this$firstOrNull$iv = GamepadButton.getEntries();
            Iterator<GamepadButton> it = $this$firstOrNull$iv.iterator();
            while (true) {
                if (it.hasNext()) {
                    element$iv = it.next();
                    GamepadButton it2 = (GamepadButton) element$iv;
                    if (StringsKt.equals(it2.name(), StringsKt.trim((CharSequence) id).toString(), true)) {
                        break;
                    }
                } else {
                    element$iv = null;
                    break;
                }
            }
            return (GamepadButton) element$iv;
        }
    }
}
