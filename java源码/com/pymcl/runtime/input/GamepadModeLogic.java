package com.pymcl.runtime.input;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GamepadMode.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u001eB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J(\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bJ\u0018\u0010\r\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tJ\u001e\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u000bJ\u000e\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0007J\u000e\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u0005J\u000e\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0016R\u000e\u0010\u0015\u001a\u00020\u0016X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0016X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0016X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0016X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0016X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/pymcl/runtime/input/GamepadModeLogic;", "", "<init>", "()V", "route", "Lcom/pymcl/runtime/input/GamepadRoute;", "pref", "Lcom/pymcl/runtime/input/GamepadModePref;", "sessionChoice", "Lcom/pymcl/runtime/input/GamepadSessionMode;", "sdlCapable", "", "sdlReady", "promptDefault", "prefAfterPrompt", "old", "chosen", "remember", "next", "p", "wantsHidApi", "KEYCODE_DPAD_UP", "", "KEYCODE_DPAD_DOWN", "KEYCODE_BUTTON_A", "KEYCODE_BUTTON_X", "KEYCODE_BUTTON_START", "promptKey", "Lcom/pymcl/runtime/input/GamepadModeLogic$PromptKey;", "keyCode", "PromptKey", "PyMCL-Android:runtime_debug"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GamepadModeLogic {
    public static final GamepadModeLogic INSTANCE = new GamepadModeLogic();
    public static final int KEYCODE_BUTTON_A = 96;
    public static final int KEYCODE_BUTTON_START = 108;
    public static final int KEYCODE_BUTTON_X = 99;
    public static final int KEYCODE_DPAD_DOWN = 20;
    public static final int KEYCODE_DPAD_UP = 19;

    /* compiled from: GamepadMode.kt */
    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[GamepadModePref.values().length];
            try {
                iArr[GamepadModePref.MAPPING.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                iArr[GamepadModePref.DIRECT.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                iArr[GamepadModePref.ASK.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[GamepadSessionMode.values().length];
            try {
                iArr2[GamepadSessionMode.MAPPING.ordinal()] = 1;
            } catch (NoSuchFieldError e4) {
            }
            try {
                iArr2[GamepadSessionMode.DIRECT.ordinal()] = 2;
            } catch (NoSuchFieldError e5) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    private GamepadModeLogic() {
    }

    public final GamepadRoute route(GamepadModePref pref, GamepadSessionMode sessionChoice, boolean sdlCapable, boolean sdlReady) {
        GamepadSessionMode mode;
        Intrinsics.checkNotNullParameter(pref, "pref");
        if (!sdlCapable && !sdlReady) {
            return GamepadRoute.MAPPING;
        }
        switch (WhenMappings.$EnumSwitchMapping$0[pref.ordinal()]) {
            case 1:
                mode = GamepadSessionMode.MAPPING;
                break;
            case 2:
                mode = GamepadSessionMode.DIRECT;
                break;
            case 3:
                if (sessionChoice != null) {
                    mode = sessionChoice;
                    break;
                } else {
                    return GamepadRoute.PROMPT;
                }
            default:
                throw new NoWhenBranchMatchedException();
        }
        switch (WhenMappings.$EnumSwitchMapping$1[mode.ordinal()]) {
            case 1:
                return GamepadRoute.MAPPING;
            case 2:
                return sdlReady ? GamepadRoute.DIRECT : GamepadRoute.SWALLOW;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final GamepadSessionMode promptDefault(GamepadModePref pref, GamepadSessionMode sessionChoice) {
        Intrinsics.checkNotNullParameter(pref, "pref");
        return sessionChoice == null ? pref == GamepadModePref.DIRECT ? GamepadSessionMode.DIRECT : GamepadSessionMode.MAPPING : sessionChoice;
    }

    public final GamepadModePref prefAfterPrompt(GamepadModePref old, GamepadSessionMode chosen, boolean remember) {
        Intrinsics.checkNotNullParameter(old, "old");
        Intrinsics.checkNotNullParameter(chosen, "chosen");
        return !remember ? old : chosen == GamepadSessionMode.DIRECT ? GamepadModePref.DIRECT : GamepadModePref.MAPPING;
    }

    public final GamepadModePref next(GamepadModePref p) {
        Intrinsics.checkNotNullParameter(p, "p");
        switch (WhenMappings.$EnumSwitchMapping$0[p.ordinal()]) {
            case 1:
                return GamepadModePref.DIRECT;
            case 2:
                return GamepadModePref.ASK;
            case 3:
                return GamepadModePref.MAPPING;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final boolean wantsHidApi(GamepadRoute route) {
        Intrinsics.checkNotNullParameter(route, "route");
        return route == GamepadRoute.DIRECT;
    }

    /* compiled from: GamepadMode.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/pymcl/runtime/input/GamepadModeLogic$PromptKey;", "", "<init>", "()V", "Select", "Confirm", "ToggleRemember", "Ignore", "Lcom/pymcl/runtime/input/GamepadModeLogic$PromptKey$Confirm;", "Lcom/pymcl/runtime/input/GamepadModeLogic$PromptKey$Ignore;", "Lcom/pymcl/runtime/input/GamepadModeLogic$PromptKey$Select;", "Lcom/pymcl/runtime/input/GamepadModeLogic$PromptKey$ToggleRemember;", "PyMCL-Android:runtime_debug"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static abstract class PromptKey {
        public /* synthetic */ PromptKey(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* compiled from: GamepadMode.kt */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/pymcl/runtime/input/GamepadModeLogic$PromptKey$Select;", "Lcom/pymcl/runtime/input/GamepadModeLogic$PromptKey;", "mode", "Lcom/pymcl/runtime/input/GamepadSessionMode;", "<init>", "(Lcom/pymcl/runtime/input/GamepadSessionMode;)V", "getMode", "()Lcom/pymcl/runtime/input/GamepadSessionMode;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "PyMCL-Android:runtime_debug"}, k = 1, mv = {2, 4, 0}, xi = 48)
        public static final /* data */ class Select extends PromptKey {
            private final GamepadSessionMode mode;

            public static /* synthetic */ Select copy$default(Select select, GamepadSessionMode gamepadSessionMode, int i, Object obj) {
                if ((i & 1) != 0) {
                    gamepadSessionMode = select.mode;
                }
                return select.copy(gamepadSessionMode);
            }

            /* renamed from: component1, reason: from getter */
            public final GamepadSessionMode getMode() {
                return this.mode;
            }

            public final Select copy(GamepadSessionMode mode) {
                Intrinsics.checkNotNullParameter(mode, "mode");
                return new Select(mode);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Select) && this.mode == ((Select) other).mode;
            }

            public int hashCode() {
                return this.mode.hashCode();
            }

            public String toString() {
                return "Select(mode=" + this.mode + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Select(GamepadSessionMode mode) {
                super(null);
                Intrinsics.checkNotNullParameter(mode, "mode");
                this.mode = mode;
            }

            public final GamepadSessionMode getMode() {
                return this.mode;
            }
        }

        private PromptKey() {
        }

        /* compiled from: GamepadMode.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/pymcl/runtime/input/GamepadModeLogic$PromptKey$Confirm;", "Lcom/pymcl/runtime/input/GamepadModeLogic$PromptKey;", "<init>", "()V", "PyMCL-Android:runtime_debug"}, k = 1, mv = {2, 4, 0}, xi = 48)
        public static final class Confirm extends PromptKey {
            public static final Confirm INSTANCE = new Confirm();

            private Confirm() {
                super(null);
            }
        }

        /* compiled from: GamepadMode.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/pymcl/runtime/input/GamepadModeLogic$PromptKey$ToggleRemember;", "Lcom/pymcl/runtime/input/GamepadModeLogic$PromptKey;", "<init>", "()V", "PyMCL-Android:runtime_debug"}, k = 1, mv = {2, 4, 0}, xi = 48)
        public static final class ToggleRemember extends PromptKey {
            public static final ToggleRemember INSTANCE = new ToggleRemember();

            private ToggleRemember() {
                super(null);
            }
        }

        /* compiled from: GamepadMode.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/pymcl/runtime/input/GamepadModeLogic$PromptKey$Ignore;", "Lcom/pymcl/runtime/input/GamepadModeLogic$PromptKey;", "<init>", "()V", "PyMCL-Android:runtime_debug"}, k = 1, mv = {2, 4, 0}, xi = 48)
        public static final class Ignore extends PromptKey {
            public static final Ignore INSTANCE = new Ignore();

            private Ignore() {
                super(null);
            }
        }
    }

    public final PromptKey promptKey(int keyCode) {
        switch (keyCode) {
            case 19:
                return new PromptKey.Select(GamepadSessionMode.MAPPING);
            case 20:
                return new PromptKey.Select(GamepadSessionMode.DIRECT);
            case 96:
            case 108:
                return PromptKey.Confirm.INSTANCE;
            case 99:
                return PromptKey.ToggleRemember.INSTANCE;
            default:
                return PromptKey.Ignore.INSTANCE;
        }
    }
}
