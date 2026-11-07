package com.pymcl.android.data;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: SettingsLogic.kt */
@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes21.dex */
final /* synthetic */ class SettingsLogic$Extras$toConfig$2 extends FunctionReferenceImpl implements Function1<String, Integer> {
    SettingsLogic$Extras$toConfig$2(Object obj) {
        super(1, obj, SettingsLogic.class, "isolationIndex", "isolationIndex(Ljava/lang/String;)I", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Integer invoke(String p0) {
        return Integer.valueOf(((SettingsLogic) this.receiver).isolationIndex(p0));
    }
}
