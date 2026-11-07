package com.pymcl.runtime.settings;

import androidx.core.app.NotificationCompat;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: SettingsCore.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0004\bæ\u0080\u0001\u0018\u00002\u00020\u0001J@\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u00032\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003H&¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcom/pymcl/runtime/settings/SettingsTransport;", "", NotificationCompat.CATEGORY_CALL, "", "", "method", "arg", "extras", "PyMCL-Android:runtime_debug"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface SettingsTransport {
    Map<String, String> call(String method, String arg, Map<String, String> extras);
}
