package com.pymcl.runtime.settings;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SettingsCore.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010 \n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0005J\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00052\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0012R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/pymcl/runtime/settings/SettingsProtocol;", "", "<init>", "()V", "AUTHORITY_SUFFIX", "", "PATH", "GET", "PUT", "GET_ALL", "EXTRA_VALUE", "EXTRA_EXISTS", "EXTRA_OK", "ALL_PREFIX", "authority", "applicationId", "keyFromSegments", "segments", "", "PyMCL-Android:runtime_debug"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class SettingsProtocol {
    public static final String ALL_PREFIX = "k:";
    public static final String AUTHORITY_SUFFIX = ".launchersettings";
    public static final String EXTRA_EXISTS = "exists";
    public static final String EXTRA_OK = "ok";
    public static final String EXTRA_VALUE = "v";
    public static final String GET = "get";
    public static final String GET_ALL = "getAll";
    public static final SettingsProtocol INSTANCE = new SettingsProtocol();
    public static final String PATH = "prefs";
    public static final String PUT = "put";

    private SettingsProtocol() {
    }

    public final String authority(String applicationId) {
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        return applicationId + AUTHORITY_SUFFIX;
    }

    public final String keyFromSegments(List<String> segments) {
        if (segments != null && segments.size() == 2) {
            if (Intrinsics.areEqual(segments.get(0), PATH)) {
                if (segments.get(1).length() > 0) {
                    return segments.get(1);
                }
            }
        }
        return null;
    }
}
