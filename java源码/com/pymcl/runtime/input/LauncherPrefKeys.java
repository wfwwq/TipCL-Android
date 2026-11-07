package com.pymcl.runtime.input;

import kotlin.Metadata;

/* compiled from: GamepadMode.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/pymcl/runtime/input/LauncherPrefKeys;", "", "<init>", "()V", "PREFS_NAME", "", "SDL_AUTO_SHOW_IME", "SDL_AUTO_SHOW_IME_DEFAULT", "", "GAMEPAD_MODE", "GAMEPAD_MODE_DEFAULT", "PyMCL-Android:runtime_debug"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LauncherPrefKeys {
    public static final String GAMEPAD_MODE = "gamepad_mode";
    public static final String GAMEPAD_MODE_DEFAULT = "ask";
    public static final LauncherPrefKeys INSTANCE = new LauncherPrefKeys();
    public static final String PREFS_NAME = "launcher";
    public static final String SDL_AUTO_SHOW_IME = "sdl_auto_show_ime";
    public static final boolean SDL_AUTO_SHOW_IME_DEFAULT = false;

    private LauncherPrefKeys() {
    }
}
