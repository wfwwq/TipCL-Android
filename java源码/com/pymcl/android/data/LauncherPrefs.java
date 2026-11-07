package com.pymcl.android.data;

import android.content.Context;
import com.pymcl.runtime.settings.CrossProcessPrefs;
import com.pymcl.runtime.settings.SettingsProtocol;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LauncherPrefs.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019J \u0010\u001a\u001a\u00020\u001b2\u0018\u0010\u001c\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001b0\u001dJ$\u0010\u001e\u001a\u00020\u001f2\u001c\u0010 \u001a\u0018\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u001dJ\u0010\u0010!\u001a\u00020\u001b2\b\u0010\"\u001a\u0004\u0018\u00010\u0005J\u0010\u0010#\u001a\u00020\u001f2\b\u0010$\u001a\u0004\u0018\u00010\u0005J\u000e\u0010%\u001a\u00020\u00052\u0006\u0010&\u001a\u00020\u001fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\t¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000Ê\u0001\f\b(\u0012\b\b)\u0012\u0004\b\u0003\u0010\u0002¨\u0006'"}, d2 = {"Lcom/pymcl/android/data/LauncherPrefs;", "", "<init>", "()V", "NAME", "", "SDL_AUTO_SHOW_IME", "GAMEPAD_MODE", "GAMEPAD_MODES", "", "getGAMEPAD_MODES", "()Ljava/util/List;", "GAMEPAD_LABELS", "getGAMEPAD_LABELS", "GAMEPAD_DEFAULT", "BG_MOD_CHECK", "BG_MOD_CHECK_LAST", "SAVES_REMEMBER_EXPORT_DIR", "SAVES_EXPORT_LAST_URI", "FEEDBACK_CONSENT", "FEEDBACK_DEVICE_ID", "FEEDBACK_URL", "store", "Lcom/pymcl/runtime/settings/CrossProcessPrefs;", "ctx", "Landroid/content/Context;", "readAutoIme", "", "getBool", "Lkotlin/Function2;", "readGamepadIndex", "", "getStr", "affectsInGameGroup", "key", "gamepadIndex", SettingsProtocol.EXTRA_VALUE, "gamepadValue", "index", "PyMCL-Android:app_debug", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes21.dex */
public final class LauncherPrefs {
    public static final int $stable = 0;
    public static final String BG_MOD_CHECK = "bg_mod_update_check";
    public static final String BG_MOD_CHECK_LAST = "bg_mod_update_last";
    public static final String FEEDBACK_CONSENT = "feedback_consent";
    public static final String FEEDBACK_DEVICE_ID = "feedback_device_id";
    public static final String FEEDBACK_URL = "feedback_url";
    public static final String GAMEPAD_DEFAULT = "ask";
    public static final String GAMEPAD_MODE = "gamepad_mode";
    public static final String NAME = "launcher";
    public static final String SAVES_EXPORT_LAST_URI = "saves_export_last_uri";
    public static final String SAVES_REMEMBER_EXPORT_DIR = "saves_remember_export_dir";
    public static final String SDL_AUTO_SHOW_IME = "sdl_auto_show_ime";
    public static final LauncherPrefs INSTANCE = new LauncherPrefs();
    private static final List<String> GAMEPAD_MODES = CollectionsKt.listOf((Object[]) new String[]{"ask", "mapping", "direct"});
    private static final List<String> GAMEPAD_LABELS = CollectionsKt.listOf((Object[]) new String[]{"每次询问", "按键映射（手柄 → 键鼠）", "直通（游戏原生手柄支持）"});

    private LauncherPrefs() {
    }

    public final List<String> getGAMEPAD_MODES() {
        return GAMEPAD_MODES;
    }

    public final List<String> getGAMEPAD_LABELS() {
        return GAMEPAD_LABELS;
    }

    public final CrossProcessPrefs store(Context ctx) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        return CrossProcessPrefs.INSTANCE.get(ctx);
    }

    public final boolean readAutoIme(Function2<? super String, ? super Boolean, Boolean> getBool) {
        Intrinsics.checkNotNullParameter(getBool, "getBool");
        return getBool.invoke("sdl_auto_show_ime", false).booleanValue();
    }

    public final int readGamepadIndex(Function2<? super String, ? super String, String> getStr) {
        Intrinsics.checkNotNullParameter(getStr, "getStr");
        return gamepadIndex(getStr.invoke("gamepad_mode", "ask"));
    }

    public final boolean affectsInGameGroup(String key) {
        return key == null || Intrinsics.areEqual(key, "sdl_auto_show_ime") || Intrinsics.areEqual(key, "gamepad_mode");
    }

    public final int gamepadIndex(String v) {
        int iIndexOf = CollectionsKt.indexOf((List<? extends String>) GAMEPAD_MODES, v);
        if (iIndexOf < 0) {
            return 0;
        }
        return iIndexOf;
    }

    public final String gamepadValue(int index) {
        List<String> list = GAMEPAD_MODES;
        boolean z = false;
        if (index >= 0 && index < list.size()) {
            z = true;
        }
        return z ? list.get(index) : "ask";
    }
}
