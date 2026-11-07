package com.pymcl.runtime.settings;

import java.util.Map;
import kotlin.Metadata;

/* compiled from: SettingsCore.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H&J\u0016\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006H&J\u001a\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\u0001H&¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lcom/pymcl/runtime/settings/RawStore;", "", "read", "key", "", "readAll", "", "write", "", "value", "PyMCL-Android:runtime_debug"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface RawStore {
    Object read(String key);

    Map<String, Object> readAll();

    void write(String key, Object value);
}
