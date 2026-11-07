package com.pymcl.runtime.input;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.pymcl.runtime.settings.SettingsProtocol;
import java.io.File;
import java.nio.file.AtomicMoveNotSupportedException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.io.FilesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* compiled from: InputSettings.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b'\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0086\b\u0018\u0000 I2\u00020\u0001:\u0001IBu\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b\u0012\u0010\u0013J\u0006\u00104\u001a\u00020\u0000J\u000e\u00105\u001a\u0002062\u0006\u00107\u001a\u000208J\t\u00109\u001a\u00020\u0003HÆ\u0003J\t\u0010:\u001a\u00020\u0005HÆ\u0003J\t\u0010;\u001a\u00020\u0003HÆ\u0003J\t\u0010<\u001a\u00020\bHÆ\u0003J\t\u0010=\u001a\u00020\bHÆ\u0003J\t\u0010>\u001a\u00020\u0005HÆ\u0003J\t\u0010?\u001a\u00020\fHÆ\u0003J\t\u0010@\u001a\u00020\u000eHÆ\u0003J\t\u0010A\u001a\u00020\u0005HÆ\u0003J\t\u0010B\u001a\u00020\u0005HÆ\u0003J\t\u0010C\u001a\u00020\bHÆ\u0003Jw\u0010D\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u00052\b\b\u0002\u0010\u0011\u001a\u00020\bHÆ\u0001J\u0014\u0010E\u001a\u00020\u00052\b\u0010F\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010G\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010H\u001a\u00020\u000eHÖ\u0081\u0004R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0015\"\u0004\b\u001d\u0010\u0017R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001a\u0010\t\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u001f\"\u0004\b#\u0010!R\u001a\u0010\n\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0019\"\u0004\b%\u0010\u001bR\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u001a\u0010\u000f\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u0019\"\u0004\b/\u0010\u001bR\u001a\u0010\u0010\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\u0019\"\u0004\b1\u0010\u001bR\u001a\u0010\u0011\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\u001f\"\u0004\b3\u0010!¨\u0006J"}, d2 = {"Lcom/pymcl/runtime/input/InputSettings;", "", "imeHotkey", "", "enterOpensIme", "", "capturePointerHotkey", "lookSensitivity", "", "mouseSensitivity", "virtualMouse", "longPressMs", "", "layoutName", "", "imeNoFullscreen", "gamepadEnabled", "gamepadDeadzone", "<init>", "(IZIFFZJLjava/lang/String;ZZF)V", "getImeHotkey", "()I", "setImeHotkey", "(I)V", "getEnterOpensIme", "()Z", "setEnterOpensIme", "(Z)V", "getCapturePointerHotkey", "setCapturePointerHotkey", "getLookSensitivity", "()F", "setLookSensitivity", "(F)V", "getMouseSensitivity", "setMouseSensitivity", "getVirtualMouse", "setVirtualMouse", "getLongPressMs", "()J", "setLongPressMs", "(J)V", "getLayoutName", "()Ljava/lang/String;", "setLayoutName", "(Ljava/lang/String;)V", "getImeNoFullscreen", "setImeNoFullscreen", "getGamepadEnabled", "setGamepadEnabled", "getGamepadDeadzone", "setGamepadDeadzone", "sanitized", "save", "", "file", "Ljava/io/File;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "equals", "other", "hashCode", "toString", "Companion", "PyMCL-Android:runtime_debug"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class InputSettings {
    public static final String DEFAULT_LAYOUT = "default";
    public static final float MAX_DEADZONE = 0.9f;
    public static final long MAX_LONG_PRESS_MS = 5000;
    public static final float MAX_SENSITIVITY = 10.0f;
    public static final float MIN_SENSITIVITY = 0.05f;
    private int capturePointerHotkey;
    private boolean enterOpensIme;
    private float gamepadDeadzone;
    private boolean gamepadEnabled;
    private int imeHotkey;
    private boolean imeNoFullscreen;
    private String layoutName;
    private long longPressMs;
    private float lookSensitivity;
    private float mouseSensitivity;
    private boolean virtualMouse;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Gson gson = new GsonBuilder().setPrettyPrinting().create();

    public InputSettings() {
        this(0, false, 0, 0.0f, 0.0f, false, 0L, null, false, false, 0.0f, 2047, null);
    }

    public static /* synthetic */ InputSettings copy$default(InputSettings inputSettings, int i, boolean z, int i2, float f, float f2, boolean z2, long j, String str, boolean z3, boolean z4, float f3, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = inputSettings.imeHotkey;
        }
        if ((i3 & 2) != 0) {
            z = inputSettings.enterOpensIme;
        }
        if ((i3 & 4) != 0) {
            i2 = inputSettings.capturePointerHotkey;
        }
        if ((i3 & 8) != 0) {
            f = inputSettings.lookSensitivity;
        }
        if ((i3 & 16) != 0) {
            f2 = inputSettings.mouseSensitivity;
        }
        if ((i3 & 32) != 0) {
            z2 = inputSettings.virtualMouse;
        }
        if ((i3 & 64) != 0) {
            j = inputSettings.longPressMs;
        }
        if ((i3 & 128) != 0) {
            str = inputSettings.layoutName;
        }
        if ((i3 & 256) != 0) {
            z3 = inputSettings.imeNoFullscreen;
        }
        if ((i3 & 512) != 0) {
            z4 = inputSettings.gamepadEnabled;
        }
        if ((i3 & 1024) != 0) {
            f3 = inputSettings.gamepadDeadzone;
        }
        long j2 = j;
        float f4 = f2;
        boolean z5 = z2;
        int i4 = i2;
        float f5 = f;
        return inputSettings.copy(i, z, i4, f5, f4, z5, j2, str, z3, z4, f3);
    }

    /* renamed from: component1, reason: from getter */
    public final int getImeHotkey() {
        return this.imeHotkey;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getGamepadEnabled() {
        return this.gamepadEnabled;
    }

    /* renamed from: component11, reason: from getter */
    public final float getGamepadDeadzone() {
        return this.gamepadDeadzone;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getEnterOpensIme() {
        return this.enterOpensIme;
    }

    /* renamed from: component3, reason: from getter */
    public final int getCapturePointerHotkey() {
        return this.capturePointerHotkey;
    }

    /* renamed from: component4, reason: from getter */
    public final float getLookSensitivity() {
        return this.lookSensitivity;
    }

    /* renamed from: component5, reason: from getter */
    public final float getMouseSensitivity() {
        return this.mouseSensitivity;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getVirtualMouse() {
        return this.virtualMouse;
    }

    /* renamed from: component7, reason: from getter */
    public final long getLongPressMs() {
        return this.longPressMs;
    }

    /* renamed from: component8, reason: from getter */
    public final String getLayoutName() {
        return this.layoutName;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getImeNoFullscreen() {
        return this.imeNoFullscreen;
    }

    public final InputSettings copy(int imeHotkey, boolean enterOpensIme, int capturePointerHotkey, float lookSensitivity, float mouseSensitivity, boolean virtualMouse, long longPressMs, String layoutName, boolean imeNoFullscreen, boolean gamepadEnabled, float gamepadDeadzone) {
        Intrinsics.checkNotNullParameter(layoutName, "layoutName");
        return new InputSettings(imeHotkey, enterOpensIme, capturePointerHotkey, lookSensitivity, mouseSensitivity, virtualMouse, longPressMs, layoutName, imeNoFullscreen, gamepadEnabled, gamepadDeadzone);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InputSettings)) {
            return false;
        }
        InputSettings inputSettings = (InputSettings) other;
        return this.imeHotkey == inputSettings.imeHotkey && this.enterOpensIme == inputSettings.enterOpensIme && this.capturePointerHotkey == inputSettings.capturePointerHotkey && Float.compare(this.lookSensitivity, inputSettings.lookSensitivity) == 0 && Float.compare(this.mouseSensitivity, inputSettings.mouseSensitivity) == 0 && this.virtualMouse == inputSettings.virtualMouse && this.longPressMs == inputSettings.longPressMs && Intrinsics.areEqual(this.layoutName, inputSettings.layoutName) && this.imeNoFullscreen == inputSettings.imeNoFullscreen && this.gamepadEnabled == inputSettings.gamepadEnabled && Float.compare(this.gamepadDeadzone, inputSettings.gamepadDeadzone) == 0;
    }

    public int hashCode() {
        return (((((((((((((((((((Integer.hashCode(this.imeHotkey) * 31) + Boolean.hashCode(this.enterOpensIme)) * 31) + Integer.hashCode(this.capturePointerHotkey)) * 31) + Float.hashCode(this.lookSensitivity)) * 31) + Float.hashCode(this.mouseSensitivity)) * 31) + Boolean.hashCode(this.virtualMouse)) * 31) + Long.hashCode(this.longPressMs)) * 31) + this.layoutName.hashCode()) * 31) + Boolean.hashCode(this.imeNoFullscreen)) * 31) + Boolean.hashCode(this.gamepadEnabled)) * 31) + Float.hashCode(this.gamepadDeadzone);
    }

    public String toString() {
        return "InputSettings(imeHotkey=" + this.imeHotkey + ", enterOpensIme=" + this.enterOpensIme + ", capturePointerHotkey=" + this.capturePointerHotkey + ", lookSensitivity=" + this.lookSensitivity + ", mouseSensitivity=" + this.mouseSensitivity + ", virtualMouse=" + this.virtualMouse + ", longPressMs=" + this.longPressMs + ", layoutName=" + this.layoutName + ", imeNoFullscreen=" + this.imeNoFullscreen + ", gamepadEnabled=" + this.gamepadEnabled + ", gamepadDeadzone=" + this.gamepadDeadzone + ")";
    }

    public InputSettings(int imeHotkey, boolean enterOpensIme, int capturePointerHotkey, float lookSensitivity, float mouseSensitivity, boolean virtualMouse, long longPressMs, String layoutName, boolean imeNoFullscreen, boolean gamepadEnabled, float gamepadDeadzone) {
        Intrinsics.checkNotNullParameter(layoutName, "layoutName");
        this.imeHotkey = imeHotkey;
        this.enterOpensIme = enterOpensIme;
        this.capturePointerHotkey = capturePointerHotkey;
        this.lookSensitivity = lookSensitivity;
        this.mouseSensitivity = mouseSensitivity;
        this.virtualMouse = virtualMouse;
        this.longPressMs = longPressMs;
        this.layoutName = layoutName;
        this.imeNoFullscreen = imeNoFullscreen;
        this.gamepadEnabled = gamepadEnabled;
        this.gamepadDeadzone = gamepadDeadzone;
    }

    public /* synthetic */ InputSettings(int i, boolean z, int i2, float f, float f2, boolean z2, long j, String str, boolean z3, boolean z4, float f3, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 114 : i, (i3 & 2) != 0 ? false : z, (i3 & 4) != 0 ? 116 : i2, (i3 & 8) != 0 ? 1.0f : f, (i3 & 16) == 0 ? f2 : 1.0f, (i3 & 32) == 0 ? z2 : false, (i3 & 64) != 0 ? 300L : j, (i3 & 128) != 0 ? DEFAULT_LAYOUT : str, (i3 & 256) != 0 ? true : z3, (i3 & 512) == 0 ? z4 : true, (i3 & 1024) != 0 ? 0.15f : f3);
    }

    public final int getImeHotkey() {
        return this.imeHotkey;
    }

    public final void setImeHotkey(int i) {
        this.imeHotkey = i;
    }

    public final boolean getEnterOpensIme() {
        return this.enterOpensIme;
    }

    public final void setEnterOpensIme(boolean z) {
        this.enterOpensIme = z;
    }

    public final int getCapturePointerHotkey() {
        return this.capturePointerHotkey;
    }

    public final void setCapturePointerHotkey(int i) {
        this.capturePointerHotkey = i;
    }

    public final float getLookSensitivity() {
        return this.lookSensitivity;
    }

    public final void setLookSensitivity(float f) {
        this.lookSensitivity = f;
    }

    public final float getMouseSensitivity() {
        return this.mouseSensitivity;
    }

    public final void setMouseSensitivity(float f) {
        this.mouseSensitivity = f;
    }

    public final boolean getVirtualMouse() {
        return this.virtualMouse;
    }

    public final void setVirtualMouse(boolean z) {
        this.virtualMouse = z;
    }

    public final long getLongPressMs() {
        return this.longPressMs;
    }

    public final void setLongPressMs(long j) {
        this.longPressMs = j;
    }

    public final String getLayoutName() {
        return this.layoutName;
    }

    public final void setLayoutName(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.layoutName = str;
    }

    public final boolean getImeNoFullscreen() {
        return this.imeNoFullscreen;
    }

    public final void setImeNoFullscreen(boolean z) {
        this.imeNoFullscreen = z;
    }

    public final boolean getGamepadEnabled() {
        return this.gamepadEnabled;
    }

    public final void setGamepadEnabled(boolean z) {
        this.gamepadEnabled = z;
    }

    public final float getGamepadDeadzone() {
        return this.gamepadDeadzone;
    }

    public final void setGamepadDeadzone(float f) {
        this.gamepadDeadzone = f;
    }

    /* compiled from: InputSettings.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012J\u0018\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\nH\u0002R\u0016\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\nX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/pymcl/runtime/input/InputSettings$Companion;", "", "<init>", "()V", "gson", "Lcom/google/gson/Gson;", "kotlin.jvm.PlatformType", "DEFAULT_LAYOUT", "", "MIN_SENSITIVITY", "", "MAX_SENSITIVITY", "MAX_DEADZONE", "MAX_LONG_PRESS_MS", "", "load", "Lcom/pymcl/runtime/input/InputSettings;", "file", "Ljava/io/File;", "sens", SettingsProtocol.EXTRA_VALUE, "def", "PyMCL-Android:runtime_debug"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final InputSettings load(File file) {
            Object objM8116constructorimpl;
            InputSettings inputSettingsSanitized;
            Intrinsics.checkNotNullParameter(file, "file");
            try {
                Result.Companion companion = Result.INSTANCE;
                Companion companion2 = this;
                objM8116constructorimpl = Result.m8116constructorimpl((InputSettings) InputSettings.gson.fromJson(FilesKt.readText$default(file, null, 1, null), InputSettings.class));
            } catch (Throwable th) {
                Result.Companion companion3 = Result.INSTANCE;
                objM8116constructorimpl = Result.m8116constructorimpl(ResultKt.createFailure(th));
            }
            InputSettings inputSettings = (InputSettings) (Result.m8122isFailureimpl(objM8116constructorimpl) ? null : objM8116constructorimpl);
            return (inputSettings == null || (inputSettingsSanitized = inputSettings.sanitized()) == null) ? new InputSettings(0, false, 0, 0.0f, 0.0f, false, 0L, null, false, false, 0.0f, 2047, null) : inputSettingsSanitized;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final float sens(float v, float def) {
            return (!((Math.abs(v) > Float.MAX_VALUE ? 1 : (Math.abs(v) == Float.MAX_VALUE ? 0 : -1)) <= 0) || v <= 0.0f) ? def : RangesKt.coerceIn(v, 0.05f, 10.0f);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.pymcl.runtime.input.InputSettings sanitized() {
        /*
            r16 = this;
            r0 = r16
            com.pymcl.runtime.input.InputSettings r1 = new com.pymcl.runtime.input.InputSettings
            r14 = 2047(0x7ff, float:2.868E-42)
            r15 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r10, r11, r12, r13, r14, r15)
            r15 = r1
            java.lang.String r1 = r0.layoutName
            r2 = 1
            if (r1 == 0) goto L3c
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            java.lang.CharSequence r1 = kotlin.text.StringsKt.trim(r1)
            java.lang.String r1 = r1.toString()
            if (r1 == 0) goto L3c
            r4 = r1
            r5 = 0
            r6 = r4
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            int r6 = r6.length()
            if (r6 <= 0) goto L35
            r6 = r2
            goto L36
        L35:
            r6 = r3
        L36:
            if (r6 == 0) goto L39
            goto L3a
        L39:
            r1 = 0
        L3a:
            if (r1 != 0) goto L3e
        L3c:
            java.lang.String r1 = "default"
        L3e:
            r9 = r1
            int r1 = r0.imeHotkey
            if (r1 <= 0) goto L47
            int r1 = r0.imeHotkey
            goto L49
        L47:
            int r1 = r15.imeHotkey
        L49:
            int r4 = r0.capturePointerHotkey
            if (r4 <= 0) goto L51
            int r4 = r0.capturePointerHotkey
            goto L53
        L51:
            int r4 = r15.capturePointerHotkey
        L53:
            com.pymcl.runtime.input.InputSettings$Companion r5 = com.pymcl.runtime.input.InputSettings.INSTANCE
            float r6 = r0.lookSensitivity
            float r7 = r15.lookSensitivity
            float r5 = com.pymcl.runtime.input.InputSettings.Companion.access$sens(r5, r6, r7)
            com.pymcl.runtime.input.InputSettings$Companion r6 = com.pymcl.runtime.input.InputSettings.INSTANCE
            float r7 = r0.mouseSensitivity
            float r8 = r15.mouseSensitivity
            float r6 = com.pymcl.runtime.input.InputSettings.Companion.access$sens(r6, r7, r8)
            long r7 = r0.longPressMs
            r10 = 0
            int r7 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r7 > 0) goto L73
            long r7 = r15.longPressMs
            goto L7b
        L73:
            long r7 = r0.longPressMs
            r10 = 5000(0x1388, double:2.4703E-320)
            long r7 = kotlin.ranges.RangesKt.coerceAtMost(r7, r10)
        L7b:
            float r10 = r0.gamepadDeadzone
            float r10 = java.lang.Math.abs(r10)
            r11 = 2139095039(0x7f7fffff, float:3.4028235E38)
            int r10 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r10 > 0) goto L8b
            goto L8c
        L8b:
            r2 = r3
        L8c:
            if (r2 != 0) goto L91
            float r2 = r15.gamepadDeadzone
            goto L9b
        L91:
            float r2 = r0.gamepadDeadzone
            r3 = 0
            r10 = 1063675494(0x3f666666, float:0.9)
            float r2 = kotlin.ranges.RangesKt.coerceIn(r2, r3, r10)
        L9b:
            r12 = r2
            r13 = 802(0x322, float:1.124E-42)
            r14 = 0
            r2 = 0
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = 0
            r10 = 0
            r11 = 0
            com.pymcl.runtime.input.InputSettings r1 = copy$default(r0, r1, r2, r3, r4, r5, r6, r7, r9, r10, r11, r12, r13, r14)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.runtime.input.InputSettings.sanitized():com.pymcl.runtime.input.InputSettings");
    }

    public final void save(File file) throws Exception {
        Intrinsics.checkNotNullParameter(file, "file");
        File parentFile = file.getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
        }
        File parentFile2 = file.getParentFile();
        if (parentFile2 == null) {
            parentFile2 = new File(".");
        }
        File tmp = new File(parentFile2, file.getName() + ".tmp");
        String json = gson.toJson(sanitized());
        Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
        FilesKt.writeText$default(tmp, json, null, 2, null);
        try {
            Files.move(tmp.toPath(), file.toPath(), StandardCopyOption.REPLACE_EXISTING, StandardCopyOption.ATOMIC_MOVE);
        } catch (AtomicMoveNotSupportedException e) {
            Files.move(tmp.toPath(), file.toPath(), StandardCopyOption.REPLACE_EXISTING);
        } catch (Exception e2) {
            if (tmp.renameTo(file)) {
                return;
            }
            tmp.delete();
            throw e2;
        }
    }
}
