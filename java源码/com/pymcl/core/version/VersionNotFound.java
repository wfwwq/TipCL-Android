package com.pymcl.core.version;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Versions.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/pymcl/core/version/VersionNotFound;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "id", "", "<init>", "(Ljava/lang/String;)V", "PyMCL-Android:core"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class VersionNotFound extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VersionNotFound(String id) {
        super("版本不存在: " + id);
        Intrinsics.checkNotNullParameter(id, "id");
    }
}
