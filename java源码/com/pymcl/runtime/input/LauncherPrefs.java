package com.pymcl.runtime.input;

import com.pymcl.runtime.settings.SettingsProtocol;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GamepadMode.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u0013\u001a\u00020\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00078F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR$\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\r8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lcom/pymcl/runtime/input/LauncherPrefs;", "", "io", "Lcom/pymcl/runtime/input/PrefIO;", "<init>", "(Lcom/pymcl/runtime/input/PrefIO;)V", SettingsProtocol.EXTRA_VALUE, "Lcom/pymcl/runtime/input/GamepadModePref;", "gamepadMode", "getGamepadMode", "()Lcom/pymcl/runtime/input/GamepadModePref;", "setGamepadMode", "(Lcom/pymcl/runtime/input/GamepadModePref;)V", "", "sdlAutoShowIme", "getSdlAutoShowIme", "()Z", "setSdlAutoShowIme", "(Z)V", "toggleSdlAutoShowIme", "PyMCL-Android:runtime_debug"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LauncherPrefs {
    private final PrefIO io;

    public LauncherPrefs(PrefIO io) {
        Intrinsics.checkNotNullParameter(io, "io");
        this.io = io;
    }

    public final GamepadModePref getGamepadMode() {
        return GamepadModePref.INSTANCE.parse(this.io.getString("gamepad_mode", "ask"));
    }

    public final void setGamepadMode(GamepadModePref v) {
        Intrinsics.checkNotNullParameter(v, "v");
        this.io.putString("gamepad_mode", v.getKey());
    }

    public final boolean getSdlAutoShowIme() {
        return this.io.getBoolean("sdl_auto_show_ime", false);
    }

    public final void setSdlAutoShowIme(boolean v) {
        this.io.putBoolean("sdl_auto_show_ime", v);
    }

    public final boolean toggleSdlAutoShowIme() {
        boolean n = !getSdlAutoShowIme();
        setSdlAutoShowIme(n);
        return n;
    }
}
