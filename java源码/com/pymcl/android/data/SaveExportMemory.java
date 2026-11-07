package com.pymcl.android.data;

import java.net.URLDecoder;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.CharEncoding;

/* compiled from: SaveExportMemory.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\t\u001a\u0004\u0018\u00010\u00052\u0006\u0010\n\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005J\u001a\u0010\f\u001a\u0004\u0018\u00010\u00052\u0006\u0010\n\u001a\u00020\b2\b\u0010\r\u001a\u0004\u0018\u00010\u0005J\u000e\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\bJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000Ê\u0001\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u0012"}, d2 = {"Lcom/pymcl/android/data/SaveExportMemory;", "", "<init>", "()V", "KEY_REMEMBER", "", "KEY_LAST_URI", "REMEMBER_DEFAULT", "", "initialUri", "remember", "last", "toStore", "resultUri", "keepLastAfterToggle", "on", "label", "uri", "PyMCL-Android:app_debug", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes21.dex */
public final class SaveExportMemory {
    public static final int $stable = 0;
    public static final SaveExportMemory INSTANCE = new SaveExportMemory();
    public static final String KEY_LAST_URI = "saves_export_last_uri";
    public static final String KEY_REMEMBER = "saves_remember_export_dir";
    public static final boolean REMEMBER_DEFAULT = true;

    private SaveExportMemory() {
    }

    public final String initialUri(boolean remember, String last) {
        String string;
        if (remember && last != null && (string = StringsKt.trim((CharSequence) last).toString()) != null) {
            boolean z = false;
            if (StringsKt.startsWith$default(string, "content://", false, 2, (Object) null) && string.length() > 10) {
                z = true;
            }
            if (z) {
                return string;
            }
            return null;
        }
        return null;
    }

    public final String toStore(boolean remember, String resultUri) {
        if (remember && resultUri != null && StringsKt.startsWith$default(resultUri, "content://", false, 2, (Object) null)) {
            return resultUri;
        }
        return null;
    }

    public final boolean keepLastAfterToggle(boolean on) {
        return on;
    }

    public final String label(String uri) {
        Object objM8116constructorimpl;
        int colon;
        String str = uri;
        if ((str == null || StringsKt.isBlank(str)) || !StringsKt.startsWith$default(uri, "content://", false, 2, (Object) null)) {
            return null;
        }
        String seg = StringsKt.substringBefore$default(StringsKt.substringAfter(uri, "/document/", ""), '?', (String) null, 2, (Object) null);
        if (seg.length() == 0) {
            return null;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            SaveExportMemory saveExportMemory = this;
            objM8116constructorimpl = Result.m8116constructorimpl(URLDecoder.decode(StringsKt.replace$default(seg, "+", "%2B", false, 4, (Object) null), CharEncoding.UTF_8));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM8116constructorimpl = Result.m8116constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m8122isFailureimpl(objM8116constructorimpl)) {
            objM8116constructorimpl = null;
        }
        String docId = (String) objM8116constructorimpl;
        if (docId == null || (colon = StringsKt.indexOf$default((CharSequence) docId, ':', 0, false, 6, (Object) null)) <= 0) {
            return null;
        }
        String volume = docId.substring(0, colon);
        Intrinsics.checkNotNullExpressionValue(volume, "substring(...)");
        String strSubstring = docId.substring(colon + 1);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        String path = StringsKt.trim(strSubstring, IOUtils.DIR_SEPARATOR_UNIX);
        String dir = StringsKt.contains$default((CharSequence) path, IOUtils.DIR_SEPARATOR_UNIX, false, 2, (Object) null) ? StringsKt.substringBeforeLast$default(path, IOUtils.DIR_SEPARATOR_UNIX, (String) null, 2, (Object) null) : "";
        String str2 = dir;
        if (str2.length() == 0) {
            str2 = "/";
        }
        String shown = str2;
        if (Intrinsics.areEqual(volume, "primary")) {
            return shown;
        }
        String strTrimEnd = StringsKt.trimEnd(volume + "/" + dir, IOUtils.DIR_SEPARATOR_UNIX);
        if (strTrimEnd.length() == 0) {
            strTrimEnd = volume;
        }
        return strTrimEnd;
    }
}
