package com.pymcl.runtime.input;

import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonIOException;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.pymcl.multiplayer.TerracottaVpnService;
import com.pymcl.runtime.input.GamepadButton;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;

/* compiled from: GamepadMapping.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 02\u00020\u0001:\u00010BE\u0012\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u000e\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020 J\u0016\u0010!\u001a\u00020\"2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010#\u001a\u00020\u0004J\u0006\u0010$\u001a\u00020\u0004J\u0015\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0006HÆ\u0003J\t\u0010'\u001a\u00020\u0006HÆ\u0003J\t\u0010(\u001a\u00020\tHÆ\u0003J\t\u0010)\u001a\u00020\u000bHÆ\u0003JG\u0010*\u001a\u00020\u00002\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0014\u0010+\u001a\u00020\u000b2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010-\u001a\u00020.HÖ\u0081\u0004J\n\u0010/\u001a\u00020\u0004HÖ\u0081\u0004R\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0007\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0011\"\u0004\b\u0015\u0010\u0013R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u00061"}, d2 = {"Lcom/pymcl/runtime/input/GamepadMapping;", "", "buttons", "", "", "leftStick", "Lcom/pymcl/runtime/input/StickMode;", "rightStick", "lookSpeed", "", "invertY", "", "<init>", "(Ljava/util/Map;Lcom/pymcl/runtime/input/StickMode;Lcom/pymcl/runtime/input/StickMode;FZ)V", "getButtons", "()Ljava/util/Map;", "getLeftStick", "()Lcom/pymcl/runtime/input/StickMode;", "setLeftStick", "(Lcom/pymcl/runtime/input/StickMode;)V", "getRightStick", "setRightStick", "getLookSpeed", "()F", "setLookSpeed", "(F)V", "getInvertY", "()Z", "setInvertY", "(Z)V", "keyFor", "b", "Lcom/pymcl/runtime/input/GamepadButton;", "set", "", "keyName", "toJson", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "Companion", "PyMCL-Android:runtime_debug"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class GamepadMapping {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final String FILE_NAME = "gamepad_map.json";
    public static final int VERSION = 1;
    private final Map<String, String> buttons;
    private boolean invertY;
    private StickMode leftStick;
    private float lookSpeed;
    private StickMode rightStick;

    public GamepadMapping() {
        this(null, null, null, 0.0f, false, 31, null);
    }

    public static /* synthetic */ GamepadMapping copy$default(GamepadMapping gamepadMapping, Map map, StickMode stickMode, StickMode stickMode2, float f, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            map = gamepadMapping.buttons;
        }
        if ((i & 2) != 0) {
            stickMode = gamepadMapping.leftStick;
        }
        if ((i & 4) != 0) {
            stickMode2 = gamepadMapping.rightStick;
        }
        if ((i & 8) != 0) {
            f = gamepadMapping.lookSpeed;
        }
        if ((i & 16) != 0) {
            z = gamepadMapping.invertY;
        }
        boolean z2 = z;
        StickMode stickMode3 = stickMode2;
        return gamepadMapping.copy(map, stickMode, stickMode3, f, z2);
    }

    public final Map<String, String> component1() {
        return this.buttons;
    }

    /* renamed from: component2, reason: from getter */
    public final StickMode getLeftStick() {
        return this.leftStick;
    }

    /* renamed from: component3, reason: from getter */
    public final StickMode getRightStick() {
        return this.rightStick;
    }

    /* renamed from: component4, reason: from getter */
    public final float getLookSpeed() {
        return this.lookSpeed;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getInvertY() {
        return this.invertY;
    }

    public final GamepadMapping copy(Map<String, String> buttons, StickMode leftStick, StickMode rightStick, float lookSpeed, boolean invertY) {
        Intrinsics.checkNotNullParameter(buttons, "buttons");
        Intrinsics.checkNotNullParameter(leftStick, "leftStick");
        Intrinsics.checkNotNullParameter(rightStick, "rightStick");
        return new GamepadMapping(buttons, leftStick, rightStick, lookSpeed, invertY);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GamepadMapping)) {
            return false;
        }
        GamepadMapping gamepadMapping = (GamepadMapping) other;
        return Intrinsics.areEqual(this.buttons, gamepadMapping.buttons) && this.leftStick == gamepadMapping.leftStick && this.rightStick == gamepadMapping.rightStick && Float.compare(this.lookSpeed, gamepadMapping.lookSpeed) == 0 && this.invertY == gamepadMapping.invertY;
    }

    public int hashCode() {
        return (((((((this.buttons.hashCode() * 31) + this.leftStick.hashCode()) * 31) + this.rightStick.hashCode()) * 31) + Float.hashCode(this.lookSpeed)) * 31) + Boolean.hashCode(this.invertY);
    }

    public String toString() {
        return "GamepadMapping(buttons=" + this.buttons + ", leftStick=" + this.leftStick + ", rightStick=" + this.rightStick + ", lookSpeed=" + this.lookSpeed + ", invertY=" + this.invertY + ")";
    }

    public GamepadMapping(Map<String, String> buttons, StickMode leftStick, StickMode rightStick, float lookSpeed, boolean invertY) {
        Intrinsics.checkNotNullParameter(buttons, "buttons");
        Intrinsics.checkNotNullParameter(leftStick, "leftStick");
        Intrinsics.checkNotNullParameter(rightStick, "rightStick");
        this.buttons = buttons;
        this.leftStick = leftStick;
        this.rightStick = rightStick;
        this.lookSpeed = lookSpeed;
        this.invertY = invertY;
    }

    public /* synthetic */ GamepadMapping(Map map, StickMode stickMode, StickMode stickMode2, float f, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? INSTANCE.defaultButtons() : map, (i & 2) != 0 ? StickMode.MOVE : stickMode, (i & 4) != 0 ? StickMode.LOOK : stickMode2, (i & 8) != 0 ? 18.0f : f, (i & 16) != 0 ? false : z);
    }

    public final Map<String, String> getButtons() {
        return this.buttons;
    }

    public final StickMode getLeftStick() {
        return this.leftStick;
    }

    public final void setLeftStick(StickMode stickMode) {
        Intrinsics.checkNotNullParameter(stickMode, "<set-?>");
        this.leftStick = stickMode;
    }

    public final StickMode getRightStick() {
        return this.rightStick;
    }

    public final void setRightStick(StickMode stickMode) {
        Intrinsics.checkNotNullParameter(stickMode, "<set-?>");
        this.rightStick = stickMode;
    }

    public final float getLookSpeed() {
        return this.lookSpeed;
    }

    public final void setLookSpeed(float f) {
        this.lookSpeed = f;
    }

    public final boolean getInvertY() {
        return this.invertY;
    }

    public final void setInvertY(boolean z) {
        this.invertY = z;
    }

    public final String keyFor(GamepadButton b) {
        Intrinsics.checkNotNullParameter(b, "b");
        String str = this.buttons.get(b.name());
        return str == null ? "" : str;
    }

    public final void set(GamepadButton b, String keyName) {
        Intrinsics.checkNotNullParameter(b, "b");
        Intrinsics.checkNotNullParameter(keyName, "keyName");
        String k = StringsKt.trim((CharSequence) keyName).toString();
        boolean z = true;
        if (!(k.length() == 0) && !Keys.INSTANCE.isValid(k)) {
            z = false;
        }
        if (!z) {
            throw new IllegalArgumentException(("invalid key name: " + keyName).toString());
        }
        this.buttons.put(b.name(), k);
    }

    public final String toJson() throws JsonIOException {
        JsonObject o = new JsonObject();
        o.addProperty("version", (Number) 1);
        JsonObject $this$toJson_u24lambda_u240 = new JsonObject();
        Iterable $this$forEach$iv = GamepadButton.getEntries();
        for (Object element$iv : $this$forEach$iv) {
            GamepadButton it = (GamepadButton) element$iv;
            $this$toJson_u24lambda_u240.addProperty(it.name(), keyFor(it));
        }
        Unit unit = Unit.INSTANCE;
        o.add("buttons", $this$toJson_u24lambda_u240);
        o.addProperty("leftStick", this.leftStick.name());
        o.addProperty("rightStick", this.rightStick.name());
        o.addProperty("lookSpeed", Float.valueOf(this.lookSpeed));
        o.addProperty("invertY", Boolean.valueOf(this.invertY));
        String json = new GsonBuilder().setPrettyPrinting().create().toJson((JsonElement) o);
        Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
        return json;
    }

    /* compiled from: GamepadMapping.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010%\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\tJ\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/pymcl/runtime/input/GamepadMapping$Companion;", "", "<init>", "()V", "VERSION", "", "FILE_NAME", "", "defaultButtons", "", InputSettings.DEFAULT_LAYOUT, "Lcom/pymcl/runtime/input/GamepadMapping;", "fromJson", TerracottaVpnService.EXTRA_TEXT, "PyMCL-Android:runtime_debug"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Map<String, String> defaultButtons() {
            return MapsKt.linkedMapOf(TuplesKt.to("A", "KEY_SPACE"), TuplesKt.to("B", "KEY_LEFTSHIFT"), TuplesKt.to("X", "KEY_Q"), TuplesKt.to("Y", "KEY_E"), TuplesKt.to("LB", Keys.SCROLL_UP), TuplesKt.to("RB", Keys.SCROLL_DOWN), TuplesKt.to("LT", Keys.MOUSE_RIGHT), TuplesKt.to("RT", Keys.MOUSE_LEFT), TuplesKt.to("START", "KEY_ESC"), TuplesKt.to("SELECT", "KEY_TAB"), TuplesKt.to("L3", "KEY_LEFTCTRL"), TuplesKt.to("R3", "KEY_F5"), TuplesKt.to("DPAD_UP", "KEY_F5"), TuplesKt.to("DPAD_DOWN", "KEY_Q"), TuplesKt.to("DPAD_LEFT", Keys.SCROLL_UP), TuplesKt.to("DPAD_RIGHT", Keys.SCROLL_DOWN));
        }

        /* renamed from: default, reason: not valid java name */
        public final GamepadMapping m8064default() {
            return new GamepadMapping(null, null, null, 0.0f, false, 31, null);
        }

        public final GamepadMapping fromJson(String text) {
            Iterable iterableEntrySet;
            Object objM8116constructorimpl;
            String string;
            Intrinsics.checkNotNullParameter(text, "text");
            JsonObject o = JsonParser.parseString(text).getAsJsonObject();
            GamepadMapping m = new GamepadMapping(null, null, null, 0.0f, false, 31, null);
            JsonObject asJsonObject = o.getAsJsonObject("buttons");
            if (asJsonObject != null && (iterableEntrySet = asJsonObject.entrySet()) != null) {
                Iterable $this$forEach$iv = iterableEntrySet;
                for (Object element$iv : $this$forEach$iv) {
                    Map.Entry entry = (Map.Entry) element$iv;
                    Intrinsics.checkNotNull(entry);
                    String id = (String) entry.getKey();
                    JsonElement v = (JsonElement) entry.getValue();
                    GamepadButton.Companion companion = GamepadButton.INSTANCE;
                    Intrinsics.checkNotNull(id);
                    GamepadButton b = companion.of(id);
                    if (b != null) {
                        Companion companion2 = GamepadMapping.INSTANCE;
                        try {
                            Result.Companion companion3 = Result.INSTANCE;
                            if (v.isJsonNull()) {
                                string = "";
                            } else {
                                String asString = v.getAsString();
                                Intrinsics.checkNotNullExpressionValue(asString, "getAsString(...)");
                                string = StringsKt.trim((CharSequence) asString).toString();
                            }
                            objM8116constructorimpl = Result.m8116constructorimpl(string);
                        } catch (Throwable th) {
                            Result.Companion companion4 = Result.INSTANCE;
                            objM8116constructorimpl = Result.m8116constructorimpl(ResultKt.createFailure(th));
                        }
                        if (Result.m8122isFailureimpl(objM8116constructorimpl)) {
                            objM8116constructorimpl = null;
                        }
                        String k = (String) objM8116constructorimpl;
                        if (k != null) {
                            if ((k.length() == 0) || Keys.INSTANCE.isValid(k)) {
                                m.getButtons().put(b.name(), k);
                            }
                        }
                    }
                }
            }
            m.setLeftStick(fromJson$stick(o, "leftStick", StickMode.MOVE));
            m.setRightStick(fromJson$stick(o, "rightStick", StickMode.LOOK));
            try {
                Result.Companion companion5 = Result.INSTANCE;
                Companion companion6 = this;
                m.setLookSpeed(RangesKt.coerceIn(o.get("lookSpeed").getAsFloat(), 1.0f, 100.0f));
                Result.m8116constructorimpl(Unit.INSTANCE);
            } catch (Throwable th2) {
                Result.Companion companion7 = Result.INSTANCE;
                Result.m8116constructorimpl(ResultKt.createFailure(th2));
            }
            try {
                Result.Companion companion8 = Result.INSTANCE;
                Companion companion9 = this;
                m.setInvertY(o.get("invertY").getAsBoolean());
                Result.m8116constructorimpl(Unit.INSTANCE);
            } catch (Throwable th3) {
                Result.Companion companion10 = Result.INSTANCE;
                Result.m8116constructorimpl(ResultKt.createFailure(th3));
            }
            return m;
        }

        private static final StickMode fromJson$stick(JsonObject o, String key, StickMode def) {
            Object objM8116constructorimpl;
            Companion companion = GamepadMapping.INSTANCE;
            try {
                Result.Companion companion2 = Result.INSTANCE;
                String asString = o.get(key).getAsString();
                Intrinsics.checkNotNullExpressionValue(asString, "getAsString(...)");
                String upperCase = StringsKt.trim((CharSequence) asString).toString().toUpperCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                objM8116constructorimpl = Result.m8116constructorimpl(StickMode.valueOf(upperCase));
            } catch (Throwable th) {
                Result.Companion companion3 = Result.INSTANCE;
                objM8116constructorimpl = Result.m8116constructorimpl(ResultKt.createFailure(th));
            }
            if (Result.m8122isFailureimpl(objM8116constructorimpl)) {
                objM8116constructorimpl = def;
            }
            return (StickMode) objM8116constructorimpl;
        }
    }
}
