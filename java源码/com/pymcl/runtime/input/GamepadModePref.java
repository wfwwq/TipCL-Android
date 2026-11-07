package com.pymcl.runtime.input;

import java.util.Locale;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: GamepadMode.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\rB\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, d2 = {"Lcom/pymcl/runtime/input/GamepadModePref;", "", "key", "", "label", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getKey", "()Ljava/lang/String;", "getLabel", "ASK", "MAPPING", "DIRECT", "Companion", "PyMCL-Android:runtime_debug"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes3.dex */
public enum GamepadModePref {
    ASK("ask", "每次询问"),
    MAPPING("mapping", "PyMCL 映射模式"),
    DIRECT("direct", "SDL 直通模式");

    private final String key;
    private final String label;
    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries($VALUES);

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    public static EnumEntries<GamepadModePref> getEntries() {
        return $ENTRIES;
    }

    GamepadModePref(String key, String label) {
        this.key = key;
        this.label = label;
    }

    public final String getKey() {
        return this.key;
    }

    public final String getLabel() {
        return this.label;
    }

    /* compiled from: GamepadMode.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¨\u0006\b"}, d2 = {"Lcom/pymcl/runtime/input/GamepadModePref$Companion;", "", "<init>", "()V", "parse", "Lcom/pymcl/runtime/input/GamepadModePref;", "s", "", "PyMCL-Android:runtime_debug"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final GamepadModePref parse(String s) {
            GamepadModePref gamepadModePref;
            String string;
            GamepadModePref[] gamepadModePrefArrValues = GamepadModePref.values();
            int length = gamepadModePrefArrValues.length;
            int i = 0;
            while (true) {
                gamepadModePref = null;
                lowerCase = null;
                String lowerCase = null;
                if (i >= length) {
                    break;
                }
                GamepadModePref gamepadModePref2 = gamepadModePrefArrValues[i];
                String key = gamepadModePref2.getKey();
                if (s != null && (string = StringsKt.trim((CharSequence) s).toString()) != null) {
                    lowerCase = string.toLowerCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                }
                if (Intrinsics.areEqual(key, lowerCase)) {
                    gamepadModePref = gamepadModePref2;
                    break;
                }
                i++;
            }
            return gamepadModePref == null ? GamepadModePref.ASK : gamepadModePref;
        }
    }
}
