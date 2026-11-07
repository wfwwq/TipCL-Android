package com.pymcl.android.ui;

import kotlin.Metadata;

/* compiled from: SideBarRules.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\t\u001a&\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0003\u001a&\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0003\u001a\u0016\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0003¨\u0006\f"}, d2 = {"barClearsCenteredIcon", "", "pillWidthDp", "", "iconDp", "barStartDp", "barWidthDp", "barClearsLeftIcon", "iconStartDp", "sideBarWidthDp", "contentWidthDp", "startInsetDp", "PyMCL-Android:app_debug"}, k = 2, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes20.dex */
public final class SideBarRulesKt {
    public static final boolean barClearsCenteredIcon(float pillWidthDp, float iconDp, float barStartDp, float barWidthDp) {
        float iconStart = (pillWidthDp - iconDp) / 2.0f;
        return barStartDp + barWidthDp <= iconStart || barStartDp >= iconStart + iconDp;
    }

    public static final boolean barClearsLeftIcon(float iconStartDp, float iconDp, float barStartDp, float barWidthDp) {
        return barStartDp + barWidthDp <= iconStartDp || barStartDp >= iconStartDp + iconDp;
    }

    public static final float sideBarWidthDp(float contentWidthDp, float startInsetDp) {
        return contentWidthDp + startInsetDp;
    }
}
