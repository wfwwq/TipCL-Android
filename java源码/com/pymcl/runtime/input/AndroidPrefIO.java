package com.pymcl.runtime.input;

import android.content.Context;
import android.content.SharedPreferences;
import com.pymcl.runtime.settings.CrossProcessPrefs;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SdlGamepad.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u0007H\u0016J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0007H\u0016J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u000eH\u0016J\u0018\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000eH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/pymcl/runtime/input/AndroidPrefIO;", "Lcom/pymcl/runtime/input/PrefIO;", "sp", "Landroid/content/SharedPreferences;", "<init>", "(Landroid/content/SharedPreferences;)V", "getString", "", "key", "def", "putString", "", "value", "getBoolean", "", "putBoolean", "Companion", "PyMCL-Android:runtime_debug"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AndroidPrefIO implements PrefIO {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final SharedPreferences sp;

    public AndroidPrefIO(SharedPreferences sp) {
        Intrinsics.checkNotNullParameter(sp, "sp");
        this.sp = sp;
    }

    @Override // com.pymcl.runtime.input.PrefIO
    public String getString(String key, String def) {
        Intrinsics.checkNotNullParameter(key, "key");
        try {
            return this.sp.getString(key, def);
        } catch (ClassCastException e) {
            return def;
        }
    }

    @Override // com.pymcl.runtime.input.PrefIO
    public void putString(String key, String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        this.sp.edit().putString(key, value).apply();
    }

    @Override // com.pymcl.runtime.input.PrefIO
    public boolean getBoolean(String key, boolean def) {
        Intrinsics.checkNotNullParameter(key, "key");
        try {
            return this.sp.getBoolean(key, def);
        } catch (ClassCastException e) {
            return def;
        }
    }

    @Override // com.pymcl.runtime.input.PrefIO
    public void putBoolean(String key, boolean value) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.sp.edit().putBoolean(key, value).apply();
    }

    /* compiled from: SdlGamepad.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/pymcl/runtime/input/AndroidPrefIO$Companion;", "", "<init>", "()V", "launcherPrefs", "Lcom/pymcl/runtime/input/LauncherPrefs;", "ctx", "Landroid/content/Context;", "PyMCL-Android:runtime_debug"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final LauncherPrefs launcherPrefs(Context ctx) {
            Intrinsics.checkNotNullParameter(ctx, "ctx");
            return new LauncherPrefs(CrossProcessPrefs.INSTANCE.get(ctx));
        }
    }
}
