package com.pymcl.android.data;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: LauncherRepository.kt */
@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes21.dex */
final /* synthetic */ class LauncherRepository$buildLaunchRequest$3$pick$2 extends FunctionReferenceImpl implements Function1<Integer, Boolean> {
    LauncherRepository$buildLaunchRequest$3$pick$2(Object obj) {
        super(1, obj, LauncherRepository.class, "javaAvailable", "javaAvailable(I)Z", 0);
    }

    public final Boolean invoke(int p0) {
        return Boolean.valueOf(((LauncherRepository) this.receiver).javaAvailable(p0));
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Boolean invoke(Integer num) {
        return invoke(num.intValue());
    }
}
