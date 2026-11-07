package com.pymcl.core.instance;

import androidx.autofill.HintConstants;
import com.pymcl.android.data.LaunchConfigLogic;
import com.pymcl.android.data.SettingsLogic;
import com.pymcl.core.config.ConfigStore;
import com.pymcl.core.util.FileUtil;
import com.pymcl.core.util.JsonKt;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Instances.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0011j\u0002`\u0012J\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00032\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001J \u0010\u0017\u001a\u00020\u00142\u0018\b\u0002\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0018J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\u001aJ\u000e\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u0003J\u000e\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u0003J\u0016\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u001c\u001a\u00020\u00032\u0006\u0010 \u001a\u00020!R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u000e\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u000b¨\u0006\""}, d2 = {"Lcom/pymcl/core/instance/Instance;", "", HintConstants.AUTOFILL_HINT_NAME, "", "dir", "Ljava/io/File;", "<init>", "(Ljava/lang/String;Ljava/io/File;)V", "getName", "()Ljava/lang/String;", "getDir", "()Ljava/io/File;", "metaFile", "getMetaFile", "versionsDir", "getVersionsDir", "meta", "", "Lcom/pymcl/core/util/JObj;", "setMeta", "", "key", "value", "create", "", "versions", "", "versionDir", "id", "versionJson", "settings", "Lcom/pymcl/core/instance/VersionSettings;", "cfg", "Lcom/pymcl/core/config/ConfigStore;", "PyMCL-Android:core"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class Instance {
    private final File dir;
    private final String name;

    public Instance(String name, File dir) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(dir, "dir");
        this.name = name;
        this.dir = dir;
    }

    public final File getDir() {
        return this.dir;
    }

    public final String getName() {
        return this.name;
    }

    public final File getMetaFile() {
        return new File(this.dir, ".instance.json");
    }

    public final File getVersionsDir() {
        return new File(this.dir, "versions");
    }

    public final Map<String, Object> meta() {
        Map<String, Object> jsonObj = FileUtil.INSTANCE.readJsonObj(getMetaFile());
        return jsonObj == null ? JsonKt.jobj(TuplesKt.to(HintConstants.AUTOFILL_HINT_NAME, this.name), TuplesKt.to("mc_version", ""), TuplesKt.to("modpack", null), TuplesKt.to("java", LaunchConfigLogic.JAVA_AUTO)) : jsonObj;
    }

    public final void setMeta(String key, Object value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Map m = meta();
        m.put(key, value);
        FileUtil.INSTANCE.writeJson(getMetaFile(), m);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void create$default(Instance instance, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            map = null;
        }
        instance.create(map);
    }

    public final void create(Map<String, ? extends Object> meta) {
        this.dir.mkdirs();
        Iterable $this$forEach$iv = CollectionsKt.listOf((Object[]) new String[]{"versions", "mods", "config", "saves", "resourcepacks", "shaderpacks"});
        for (Object element$iv : $this$forEach$iv) {
            String it = (String) element$iv;
            new File(this.dir, it).mkdirs();
        }
        if (!getMetaFile().exists()) {
            FileUtil fileUtil = FileUtil.INSTANCE;
            File metaFile = getMetaFile();
            Map m = JsonKt.jobj(TuplesKt.to(HintConstants.AUTOFILL_HINT_NAME, this.name), TuplesKt.to("mc_version", ""), TuplesKt.to("modpack", null), TuplesKt.to("java", LaunchConfigLogic.JAVA_AUTO));
            if (meta != null) {
                m.putAll(meta);
            }
            Unit unit = Unit.INSTANCE;
            fileUtil.writeJson(metaFile, m);
        }
    }

    public final List<String> versions() {
        File[] fileArrListFiles = getVersionsDir().listFiles();
        if (fileArrListFiles != null) {
            Collection destination$iv$iv = new ArrayList();
            for (File file : fileArrListFiles) {
                if (new File(file, file.getName() + ".json").isFile()) {
                    destination$iv$iv.add(file);
                }
            }
            Iterable $this$map$iv = (List) destination$iv$iv;
            Collection destination$iv$iv2 = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10));
            for (Object item$iv$iv : $this$map$iv) {
                File it = (File) item$iv$iv;
                destination$iv$iv2.add(it.getName());
            }
            List<String> listSorted = CollectionsKt.sorted((List) destination$iv$iv2);
            if (listSorted != null) {
                return listSorted;
            }
        }
        return CollectionsKt.emptyList();
    }

    public final File versionDir(String id) {
        Intrinsics.checkNotNullParameter(id, "id");
        return new File(getVersionsDir(), id);
    }

    public final File versionJson(String id) {
        Intrinsics.checkNotNullParameter(id, "id");
        return new File(versionDir(id), id + ".json");
    }

    public final VersionSettings settings(String id, ConfigStore cfg) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(cfg, "cfg");
        return new VersionSettings(versionDir(id), cfg.string(SettingsLogic.Extras.ISOLATION_KEY));
    }
}
