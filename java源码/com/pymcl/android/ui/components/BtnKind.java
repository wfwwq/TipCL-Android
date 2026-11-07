package com.pymcl.android.ui.components;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* compiled from: Ui.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/pymcl/android/ui/components/BtnKind;", "", "<init>", "(Ljava/lang/String;I)V", "Primary", "Soft", "Normal", "Ghost", "Danger", "Icon", "Chip", "OnBanner", "PyMCL-Android:app_debug"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes21.dex */
public enum BtnKind {
    Primary,
    Soft,
    Normal,
    Ghost,
    Danger,
    Icon,
    Chip,
    OnBanner;

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries($VALUES);

    public static EnumEntries<BtnKind> getEntries() {
        return $ENTRIES;
    }
}
