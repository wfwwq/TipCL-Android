package com.pymcl.core.instance;

import com.pymcl.core.config.LauncherPaths;
import com.pymcl.core.util.FileUtil;
import com.pymcl.core.util.JsonKt;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Playtime.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007j\u0002`\tJ\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\bJ&\u0010\r\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/pymcl/core/instance/PlaytimeStore;", "", "paths", "Lcom/pymcl/core/config/LauncherPaths;", "<init>", "(Lcom/pymcl/core/config/LauncherPaths;)V", "all", "", "", "Lcom/pymcl/core/util/JObj;", "total", "", "inst", "record", "", "version", "startSec", "durationSec", "PyMCL-Android:core"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PlaytimeStore {
    private final LauncherPaths paths;

    public PlaytimeStore(LauncherPaths paths) {
        Intrinsics.checkNotNullParameter(paths, "paths");
        this.paths = paths;
    }

    public final Map<String, Object> all() {
        Map<String, Object> mapObj;
        Map<String, Object> jsonObj = FileUtil.INSTANCE.readJsonObj(this.paths.getPlaytimeFile());
        return (jsonObj == null || (mapObj = JsonKt.obj(jsonObj, "instances")) == null) ? JsonKt.jobj(new Pair[0]) : mapObj;
    }

    public final long total(String inst) {
        Intrinsics.checkNotNullParameter(inst, "inst");
        Long lM8043long = JsonKt.m8043long(JsonKt.obj(all(), inst), "total");
        if (lM8043long != null) {
            return lM8043long.longValue();
        }
        return 0L;
    }

    public final synchronized void record(String inst, String version, long startSec, long durationSec) {
        Intrinsics.checkNotNullParameter(inst, "inst");
        Intrinsics.checkNotNullParameter(version, "version");
        Map root = FileUtil.INSTANCE.readJsonObj(this.paths.getPlaytimeFile());
        if (root == null) {
            root = JsonKt.jobj(new Pair[0]);
        }
        Map it = JsonKt.obj(root, "instances");
        if (it == null) {
            it = JsonKt.jobj(new Pair[0]);
            root.put("instances", it);
        }
        Map it2 = JsonKt.obj(it, inst);
        if (it2 == null) {
            it2 = JsonKt.jobj(TuplesKt.to("total", 0L), TuplesKt.to("versions", JsonKt.jobj(new Pair[0])), TuplesKt.to("sessions", new ArrayList()));
            it.put(inst, it2);
        }
        Long lM8043long = JsonKt.m8043long(it2, "total");
        it2.put("total", Long.valueOf((lM8043long != null ? lM8043long.longValue() : 0L) + durationSec));
        Map it3 = JsonKt.obj(it2, "versions");
        if (it3 == null) {
            it3 = JsonKt.jobj(new Pair[0]);
            it2.put("versions", it3);
        }
        Long lM8043long2 = JsonKt.m8043long(it3, version);
        it3.put(version, Long.valueOf((lM8043long2 != null ? lM8043long2.longValue() : 0L) + durationSec));
        List it4 = JsonKt.arr(it2, "sessions");
        if (it4 == null) {
            it4 = new ArrayList();
            it2.put("sessions", it4);
        }
        it4.add(JsonKt.jobj(TuplesKt.to("start", Long.valueOf(startSec)), TuplesKt.to("duration", Long.valueOf(durationSec)), TuplesKt.to("version", version)));
        FileUtil.INSTANCE.writeJson(this.paths.getPlaytimeFile(), root);
    }
}
