package com.pymcl.core.auth;

import com.pymcl.runtime.input.InputSettings;
import java.io.File;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: SkinServer.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005¨\u0006\t"}, d2 = {"Lcom/pymcl/core/auth/OfflineSkins;", "", "<init>", "()V", "customFile", "Ljava/io/File;", "skin", "", "skinsDir", "PyMCL-Android:core"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class OfflineSkins {
    public static final OfflineSkins INSTANCE = new OfflineSkins();

    private OfflineSkins() {
    }

    public final File customFile(String skin, File skinsDir) {
        Intrinsics.checkNotNullParameter(skin, "skin");
        Intrinsics.checkNotNullParameter(skinsDir, "skinsDir");
        if (StringsKt.isBlank(skin) || SetsKt.setOf((Object[]) new String[]{InputSettings.DEFAULT_LAYOUT, "steve", "alex"}).contains(skin)) {
            return null;
        }
        File it = new File(skin);
        if (!it.isAbsolute()) {
            it = new File(skinsDir, skin);
        }
        if (it.isFile()) {
            return it;
        }
        return null;
    }
}
