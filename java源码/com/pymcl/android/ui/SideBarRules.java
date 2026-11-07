package com.pymcl.android.ui;

import kotlin.Metadata;

/* compiled from: SideBarRules.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005J\u000e\u0010\t\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005J\u000e\u0010\n\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000Ê\u0001\f\b\f\u0012\b\b\r\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u000b"}, d2 = {"Lcom/pymcl/android/ui/SideBarRules;", "", "<init>", "()V", "WIDE_WIDTH_DP", "", "isWideWidth", "", "widthDp", "defaultCollapsed", "showMenuToggle", "PyMCL-Android:app_debug", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes20.dex */
public final class SideBarRules {
    public static final int $stable = 0;
    public static final SideBarRules INSTANCE = new SideBarRules();
    public static final int WIDE_WIDTH_DP = 600;

    private SideBarRules() {
    }

    public final boolean isWideWidth(int widthDp) {
        return widthDp >= 600;
    }

    public final boolean defaultCollapsed(int widthDp) {
        return !isWideWidth(widthDp);
    }

    public final boolean showMenuToggle(int widthDp) {
        return !isWideWidth(widthDp);
    }
}
