package com.pymcl.core.instance;

import java.io.File;
import java.util.HashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: Saves.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tJ\u001c\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t¨\u0006\u000e"}, d2 = {"Lcom/pymcl/core/instance/SavesLocator;", "", "<init>", "()V", "gameDir", "Ljava/io/File;", "instance", "Lcom/pymcl/core/instance/Instance;", "version", "", "defaultIsolation", "targets", "", "Lcom/pymcl/core/instance/SaveTarget;", "PyMCL-Android:core"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SavesLocator {
    public static final SavesLocator INSTANCE = new SavesLocator();

    private SavesLocator() {
    }

    public final File gameDir(Instance instance, String version, String defaultIsolation) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        Intrinsics.checkNotNullParameter(version, "version");
        Intrinsics.checkNotNullParameter(defaultIsolation, "defaultIsolation");
        if (StringsKt.isBlank(version)) {
            return instance.getDir();
        }
        File fileVersionDir = instance.versionDir(version);
        String str = defaultIsolation;
        if (str.length() == 0) {
            str = "all";
        }
        return new VersionSettings(fileVersionDir, str).gameDir(instance.getDir());
    }

    public final List<SaveTarget> targets(Instance instance, String defaultIsolation) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        Intrinsics.checkNotNullParameter(defaultIsolation, "defaultIsolation");
        List out = CollectionsKt.mutableListOf(new SaveTarget("", instance.getDir()));
        HashSet seen = SetsKt.hashSetOf(instance.getDir().getAbsoluteFile());
        Iterable $this$forEach$iv = instance.versions();
        for (Object element$iv : $this$forEach$iv) {
            String v = (String) element$iv;
            File gd = INSTANCE.gameDir(instance, v, defaultIsolation);
            if (seen.add(gd.getAbsoluteFile())) {
                out.add(new SaveTarget(v, gd));
            }
        }
        return out;
    }
}
