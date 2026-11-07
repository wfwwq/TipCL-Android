package com.pymcl.core.account;

import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: Accounts.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001¨\u0006\u0003"}, d2 = {"dashedUuid", "", "s", "PyMCL-Android:core"}, k = 2, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class AccountsKt {
    public static final String dashedUuid(String s) {
        Intrinsics.checkNotNullParameter(s, "s");
        String h = StringsKt.replace$default(s, "-", "", false, 4, (Object) null).toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(h, "toLowerCase(...)");
        if (h.length() != 32) {
            return s;
        }
        String strSubstring = h.substring(0, 8);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        String strSubstring2 = h.substring(8, 12);
        Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
        String strSubstring3 = h.substring(12, 16);
        Intrinsics.checkNotNullExpressionValue(strSubstring3, "substring(...)");
        String strSubstring4 = h.substring(16, 20);
        Intrinsics.checkNotNullExpressionValue(strSubstring4, "substring(...)");
        String strSubstring5 = h.substring(20);
        Intrinsics.checkNotNullExpressionValue(strSubstring5, "substring(...)");
        return strSubstring + "-" + strSubstring2 + "-" + strSubstring3 + "-" + strSubstring4 + "-" + strSubstring5;
    }
}
