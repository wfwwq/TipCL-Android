package com.pymcl.android.ui.state;

import com.pymcl.runtime.settings.CrossProcessPrefs;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ModUpdateWatcher.kt */
@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes20.dex */
final /* synthetic */ class ModWatchPrefs$Companion$of$2 extends FunctionReferenceImpl implements Function2<String, Long, Long> {
    ModWatchPrefs$Companion$of$2(Object obj) {
        super(2, obj, CrossProcessPrefs.class, "getLong", "getLong(Ljava/lang/String;J)J", 0);
    }

    public final Long invoke(String p0, long p1) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return Long.valueOf(((CrossProcessPrefs) this.receiver).getLong(p0, p1));
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Long invoke(String str, Long l) {
        return invoke(str, l.longValue());
    }
}
