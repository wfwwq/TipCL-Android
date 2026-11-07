package com.pymcl.runtime.settings;

import android.content.SharedPreferences;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LauncherSettingsProvider.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0016\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u000bH\u0016J\u001a\u0010\f\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\t2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/pymcl/runtime/settings/SharedPrefsStore;", "Lcom/pymcl/runtime/settings/RawStore;", "sp", "Landroid/content/SharedPreferences;", "<init>", "(Landroid/content/SharedPreferences;)V", "read", "", "key", "", "readAll", "", "write", "", "value", "PyMCL-Android:runtime_debug"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class SharedPrefsStore implements RawStore {
    private final SharedPreferences sp;

    public SharedPrefsStore(SharedPreferences sp) {
        Intrinsics.checkNotNullParameter(sp, "sp");
        this.sp = sp;
    }

    @Override // com.pymcl.runtime.settings.RawStore
    public Object read(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.sp.getAll().get(key);
    }

    @Override // com.pymcl.runtime.settings.RawStore
    public Map<String, Object> readAll() {
        Map<String, ?> all = this.sp.getAll();
        Intrinsics.checkNotNullExpressionValue(all, "getAll(...)");
        return all;
    }

    @Override // com.pymcl.runtime.settings.RawStore
    public void write(String key, Object value) {
        Intrinsics.checkNotNullParameter(key, "key");
        SharedPreferences.Editor e = this.sp.edit();
        if (value == null) {
            e.remove(key);
        } else if (value instanceof Boolean) {
            e.putBoolean(key, ((Boolean) value).booleanValue());
        } else if (value instanceof String) {
            e.putString(key, (String) value);
        } else if (value instanceof Integer) {
            e.putInt(key, ((Number) value).intValue());
        } else if (value instanceof Long) {
            e.putLong(key, ((Number) value).longValue());
        } else if (value instanceof Float) {
            e.putFloat(key, ((Number) value).floatValue());
        } else {
            if (!(value instanceof Set)) {
                throw new IllegalArgumentException("不支持的偏好类型");
            }
            Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.collections.Set<kotlin.String>");
            e.putStringSet(key, (Set) value);
        }
        e.commit();
    }
}
