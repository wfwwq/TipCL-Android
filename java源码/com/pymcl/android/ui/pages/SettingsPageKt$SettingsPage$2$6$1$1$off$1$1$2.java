package com.pymcl.android.ui.pages;

import com.pymcl.runtime.settings.CrossProcessPrefs;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SettingsPage.kt */
@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes22.dex */
final /* synthetic */ class SettingsPageKt$SettingsPage$2$6$1$1$off$1$1$2 extends FunctionReferenceImpl implements Function2<String, String, String> {
    SettingsPageKt$SettingsPage$2$6$1$1$off$1$1$2(Object obj) {
        super(2, obj, CrossProcessPrefs.class, "getString", "getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final String invoke(String p0, String p1) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return ((CrossProcessPrefs) this.receiver).getString(p0, p1);
    }
}
