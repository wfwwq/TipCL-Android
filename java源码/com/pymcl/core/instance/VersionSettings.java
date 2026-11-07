package com.pymcl.core.instance;

import com.pymcl.android.data.LaunchConfigLogic;
import com.pymcl.core.util.FileUtil;
import com.pymcl.core.util.JsonKt;
import com.pymcl.runtime.input.InputSettings;
import java.io.File;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Instances.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0006\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\rj\u0002`\u000eJ\u001c\u0010\u000f\u001a\u00020\u00102\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0012J\u0006\u0010\u0013\u001a\u00020\u0005J\u000e\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0003J\u000e\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0003R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\n\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\t¨\u0006\u0018"}, d2 = {"Lcom/pymcl/core/instance/VersionSettings;", "", "versionDir", "Ljava/io/File;", "defaultIsolation", "", "<init>", "(Ljava/io/File;Ljava/lang/String;)V", "getVersionDir", "()Ljava/io/File;", "file", "getFile", "load", "", "Lcom/pymcl/core/util/JObj;", "save", "", "m", "", "isolation", "gameDir", "instanceRoot", "applyIsolation", "Companion", "PyMCL-Android:core"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class VersionSettings {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Map<String, List<String>> SHARED_FOR = MapsKt.mapOf(TuplesKt.to("saves", CollectionsKt.listOf((Object[]) new String[]{"mods", "config", "resourcepacks", "shaderpacks", "downloads"})), TuplesKt.to("mods", CollectionsKt.listOf((Object[]) new String[]{"saves", "resourcepacks", "shaderpacks", "screenshots"})));
    private final String defaultIsolation;
    private final File versionDir;

    /* compiled from: Instances.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010 \n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R#\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0005j\u0002`\u00078F¢\u0006\u0006\u001a\u0004\b\b\u0010\tR#\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\f0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\t¨\u0006\u000e"}, d2 = {"Lcom/pymcl/core/instance/VersionSettings$Companion;", "", "<init>", "()V", "DEFAULTS", "", "", "Lcom/pymcl/core/util/JObj;", "getDEFAULTS", "()Ljava/util/Map;", "SHARED_FOR", "", "", "getSHARED_FOR", "PyMCL-Android:core"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Map<String, Object> getDEFAULTS() {
            return JsonKt.jobj(TuplesKt.to("isolation", "none"), TuplesKt.to("memory_mb", null), TuplesKt.to("java", LaunchConfigLogic.JAVA_AUTO), TuplesKt.to("jvm_args", ""), TuplesKt.to("game_args", ""), TuplesKt.to("pre_launch", ""), TuplesKt.to("post_launch", ""), TuplesKt.to("pre_launch_wait", true), TuplesKt.to("server", ""), TuplesKt.to("port", ""), TuplesKt.to("process_priority", "normal"), TuplesKt.to("icon", ""), TuplesKt.to("hidden", false), TuplesKt.to("login_account", ""), TuplesKt.to("auth_server", ""), TuplesKt.to("auth_server_name", ""), TuplesKt.to("nide8_id", ""), TuplesKt.to("gc", ""), TuplesKt.to("window_title", ""), TuplesKt.to("window_mode", "window"), TuplesKt.to("window_width", null), TuplesKt.to("window_height", null), TuplesKt.to("skip_assets", false), TuplesKt.to("offline_skin", InputSettings.DEFAULT_LAYOUT));
        }

        public final Map<String, List<String>> getSHARED_FOR() {
            return VersionSettings.SHARED_FOR;
        }
    }

    public VersionSettings(File versionDir, String defaultIsolation) {
        Intrinsics.checkNotNullParameter(versionDir, "versionDir");
        Intrinsics.checkNotNullParameter(defaultIsolation, "defaultIsolation");
        this.versionDir = versionDir;
        this.defaultIsolation = defaultIsolation;
    }

    public /* synthetic */ VersionSettings(File file, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(file, (i & 2) != 0 ? "all" : str);
    }

    public final File getVersionDir() {
        return this.versionDir;
    }

    public final File getFile() {
        return new File(this.versionDir, "pymcl.json");
    }

    public final Map<String, Object> load() {
        Map it = INSTANCE.getDEFAULTS();
        Map<String, Object> jsonObj = FileUtil.INSTANCE.readJsonObj(getFile());
        if (jsonObj == null) {
            jsonObj = JsonKt.jobj(new Pair[0]);
        }
        it.putAll(jsonObj);
        return it;
    }

    public final void save(Map<String, ? extends Object> m) {
        Intrinsics.checkNotNullParameter(m, "m");
        Map cur = FileUtil.INSTANCE.readJsonObj(getFile());
        if (cur == null) {
            cur = JsonKt.jobj(new Pair[0]);
        }
        cur.putAll(m);
        FileUtil.INSTANCE.writeJson(getFile(), cur);
    }

    public final String isolation() {
        String v = JsonKt.str(load(), "isolation");
        if (v == null) {
            v = "none";
        }
        if (!Intrinsics.areEqual(v, "none")) {
            if (!(v.length() == 0)) {
                return v;
            }
        }
        return this.defaultIsolation;
    }

    public final File gameDir(File instanceRoot) {
        Intrinsics.checkNotNullParameter(instanceRoot, "instanceRoot");
        return SetsKt.setOf((Object[]) new String[]{"all", "saves", "mods"}).contains(isolation()) ? this.versionDir : instanceRoot;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.File applyIsolation(java.io.File r20) {
        /*
            r19 = this;
            r0 = r20
            java.lang.String r1 = "instanceRoot"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            java.lang.String r1 = r19.isolation()
            java.io.File r2 = r19.gameDir(r20)
            r3 = r19
            java.io.File r4 = r3.versionDir
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r4)
            if (r4 == 0) goto La9
            r4 = 5
            java.lang.String[] r4 = new java.lang.String[r4]
            java.lang.String r5 = "mods"
            r6 = 0
            r4[r6] = r5
            java.lang.String r5 = "config"
            r7 = 1
            r4[r7] = r5
            r5 = 2
            java.lang.String r8 = "saves"
            r4[r5] = r8
            r5 = 3
            java.lang.String r8 = "resourcepacks"
            r4[r5] = r8
            r5 = 4
            java.lang.String r8 = "shaderpacks"
            r4[r5] = r8
            java.util.List r4 = kotlin.collections.CollectionsKt.listOf(r4)
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            r5 = 0
            java.util.Iterator r8 = r4.iterator()
        L40:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L58
            java.lang.Object r9 = r8.next()
            r10 = r9
            java.lang.String r10 = (java.lang.String) r10
            r11 = 0
            java.io.File r12 = new java.io.File
            r12.<init>(r2, r10)
            r12.mkdirs()
            goto L40
        L58:
            java.util.Map<java.lang.String, java.util.List<java.lang.String>> r4 = com.pymcl.core.instance.VersionSettings.SHARED_FOR
            java.lang.Object r4 = r4.get(r1)
            java.util.List r4 = (java.util.List) r4
            if (r4 == 0) goto La9
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            r5 = 0
            java.util.Iterator r8 = r4.iterator()
        L6a:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto La8
            java.lang.Object r9 = r8.next()
            r10 = r9
            java.lang.String r10 = (java.lang.String) r10
            r11 = 0
            java.io.File r12 = new java.io.File
            r12.<init>(r0, r10)
            r13 = r12
            java.io.File r14 = new java.io.File
            r14.<init>(r2, r10)
            boolean r12 = r13.isDirectory()
            if (r12 == 0) goto La6
            java.io.File[] r12 = r14.listFiles()
            if (r12 == 0) goto L99
            int r12 = r12.length
            if (r12 != 0) goto L94
            r12 = r7
            goto L95
        L94:
            r12 = r6
        L95:
            if (r12 != 0) goto L99
            r12 = r7
            goto L9a
        L99:
            r12 = r6
        L9a:
            if (r12 != 0) goto La6
            r17 = 4
            r18 = 0
            r15 = 0
            r16 = 0
            kotlin.io.FilesKt.copyRecursively$default(r13, r14, r15, r16, r17, r18)
        La6:
            goto L6a
        La8:
        La9:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.core.instance.VersionSettings.applyIsolation(java.io.File):java.io.File");
    }
}
