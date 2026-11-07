package com.pymcl.android.ui.pages;

import com.pymcl.runtime.settings.CrossProcessPrefs;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SettingsPage.kt */
@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes22.dex */
final /* synthetic */ class SettingsPageKt$SettingsPage$2$6$autoIme$2$1 extends FunctionReferenceImpl implements Function2<String, Boolean, Boolean> {
    SettingsPageKt$SettingsPage$2$6$autoIme$2$1(Object obj) {
        super(2, obj, CrossProcessPrefs.class, "getBoolean", "getBoolean(Ljava/lang/String;Z)Z", 0);
    }

    public final Boolean invoke(String p0, boolean p1) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return Boolean.valueOf(((CrossProcessPrefs) this.receiver).getBoolean(p0, p1));
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Boolean invoke(String str, Boolean bool) {
        return invoke(str, bool.booleanValue());
    }
}
