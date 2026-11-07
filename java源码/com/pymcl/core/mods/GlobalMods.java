package com.pymcl.core.mods;

import androidx.autofill.HintConstants;
import com.pymcl.core.mods.ModTools;
import com.pymcl.core.util.FileUtil;
import com.pymcl.core.util.JsonKt;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.io.FilesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: GlobalMods.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0004\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\tJ\u0016\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0003J\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\f0\u00142\u0006\u0010\u0015\u001a\u00020\u0003J\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\f0\t2\u0006\u0010\u0015\u001a\u00020\u0003R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, d2 = {"Lcom/pymcl/core/mods/GlobalMods;", "", "dir", "Ljava/io/File;", "<init>", "(Ljava/io/File;)V", "getDir", "()Ljava/io/File;", "list", "", "setEnabled", HintConstants.AUTOFILL_HINT_NAME, "", "enabled", "", "delete", "", "import", "src", "injected", "", "targetMods", "apply", "Companion", "PyMCL-Android:core"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class GlobalMods {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final String MARKER = ".pymcl_global_mods.json";
    private final File dir;

    /* compiled from: GlobalMods.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0007J\u0016\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/pymcl/core/mods/GlobalMods$Companion;", "", "<init>", "()V", "MARKER", "", "dirFor", "Ljava/io/File;", "sharedDir", "configured", "root", "enabledName", HintConstants.AUTOFILL_HINT_NAME, "enabled", "", "PyMCL-Android:core"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final File dirFor(File sharedDir, String configured, File root) {
            Intrinsics.checkNotNullParameter(sharedDir, "sharedDir");
            Intrinsics.checkNotNullParameter(configured, "configured");
            Intrinsics.checkNotNullParameter(root, "root");
            if (StringsKt.isBlank(configured)) {
                return new File(sharedDir, "mods");
            }
            File it = new File(configured);
            return it.isAbsolute() ? it : new File(root, configured);
        }

        public final String enabledName(String name, boolean enabled) {
            Intrinsics.checkNotNullParameter(name, "name");
            String it = StringsKt.removeSuffix(name, (CharSequence) ".disabled");
            return enabled ? it : it + ".disabled";
        }
    }

    public GlobalMods(File dir) {
        Intrinsics.checkNotNullParameter(dir, "dir");
        this.dir = dir;
    }

    public final File getDir() {
        return this.dir;
    }

    public final List<File> list() {
        File[] fileArrListFiles = this.dir.listFiles();
        if (fileArrListFiles != null) {
            Collection destination$iv$iv = new ArrayList();
            for (File file : fileArrListFiles) {
                ModTools.Companion companion = ModTools.INSTANCE;
                Intrinsics.checkNotNull(file);
                if (companion.isModFile(file)) {
                    destination$iv$iv.add(file);
                }
            }
            Iterable $this$sortedBy$iv = (List) destination$iv$iv;
            List<File> listSortedWith = CollectionsKt.sortedWith($this$sortedBy$iv, new Comparator() { // from class: com.pymcl.core.mods.GlobalMods$list$$inlined$sortedBy$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    File it = (File) t;
                    String name = it.getName();
                    Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                    String lowerCase = name.toLowerCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                    File it2 = (File) t2;
                    String name2 = it2.getName();
                    Intrinsics.checkNotNullExpressionValue(name2, "getName(...)");
                    String lowerCase2 = name2.toLowerCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
                    return ComparisonsKt.compareValues(lowerCase, lowerCase2);
                }
            });
            if (listSortedWith != null) {
                return listSortedWith;
            }
        }
        return CollectionsKt.emptyList();
    }

    public final File setEnabled(String name, boolean enabled) throws IOException {
        Intrinsics.checkNotNullParameter(name, "name");
        File f = FileUtil.INSTANCE.safeChild(this.dir, name);
        File to = new File(this.dir, INSTANCE.enabledName(name, enabled));
        if (Intrinsics.areEqual(f.getAbsolutePath(), to.getAbsolutePath()) || f.renameTo(to)) {
            return to;
        }
        throw new IOException("重命名失败：" + name);
    }

    public final void delete(String name) throws IOException {
        Intrinsics.checkNotNullParameter(name, "name");
        File f = FileUtil.INSTANCE.safeChild(this.dir, name);
        if (f.exists() && !f.delete()) {
            throw new IOException("删除失败：" + name);
        }
    }

    /* renamed from: import, reason: not valid java name */
    public final File m8038import(File src) {
        Intrinsics.checkNotNullParameter(src, "src");
        String name = src.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        if (!StringsKt.endsWith$default(name, ".jar", false, 2, (Object) null)) {
            throw new IllegalArgumentException("只能导入 .jar 模组".toString());
        }
        this.dir.mkdirs();
        File dest = new File(this.dir, src.getName());
        FilesKt.copyTo$default(src, dest, true, 0, 4, null);
        return dest;
    }

    public final Set<String> injected(File targetMods) {
        Iterable iterableArr;
        Intrinsics.checkNotNullParameter(targetMods, "targetMods");
        Map<String, Object> jsonObj = FileUtil.INSTANCE.readJsonObj(new File(targetMods, MARKER));
        if (jsonObj != null && (iterableArr = JsonKt.arr(jsonObj, "files")) != null) {
            Iterable $this$mapNotNull$iv = iterableArr;
            Collection destination$iv$iv = new ArrayList();
            for (Object element$iv$iv$iv : $this$mapNotNull$iv) {
                String str = element$iv$iv$iv instanceof String ? (String) element$iv$iv$iv : null;
                if (str != null) {
                    destination$iv$iv.add(str);
                }
            }
            Set<String> set = CollectionsKt.toSet((List) destination$iv$iv);
            if (set != null) {
                return set;
            }
        }
        return SetsKt.emptySet();
    }

    public final List<String> apply(File targetMods) {
        Intrinsics.checkNotNullParameter(targetMods, "targetMods");
        Iterable $this$filter$iv = list();
        Collection destination$iv$iv = new ArrayList();
        for (Object element$iv$iv : $this$filter$iv) {
            File it = (File) element$iv$iv;
            String name = it.getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
            if (StringsKt.endsWith$default(name, ".jar", false, 2, (Object) null)) {
                destination$iv$iv.add(element$iv$iv);
            }
        }
        List<File> enabled = (List) destination$iv$iv;
        Set before = injected(targetMods);
        if (enabled.isEmpty() && before.isEmpty()) {
            return CollectionsKt.emptyList();
        }
        targetMods.mkdirs();
        List $this$map$iv = enabled;
        Collection destination$iv$iv2 = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10));
        for (Object item$iv$iv : $this$map$iv) {
            File it2 = (File) item$iv$iv;
            destination$iv$iv2.add(it2.getName());
        }
        Set want = CollectionsKt.toSet((List) destination$iv$iv2);
        for (String n : SetsKt.minus(before, (Iterable) want)) {
            try {
                Result.Companion companion = Result.INSTANCE;
                GlobalMods globalMods = this;
                FileUtil fileUtil = FileUtil.INSTANCE;
                Intrinsics.checkNotNull(n);
                Result.m8116constructorimpl(Boolean.valueOf(fileUtil.safeChild(targetMods, n).delete()));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                Result.m8116constructorimpl(ResultKt.createFailure(th));
            }
        }
        List out = new ArrayList();
        for (File src : enabled) {
            File t = new File(targetMods, src.getName());
            boolean ours = before.contains(src.getName());
            if (!t.exists() || ours) {
                if (!new File(targetMods, src.getName() + ".disabled").exists()) {
                    if (!t.exists() || t.length() != src.length() || t.lastModified() < src.lastModified()) {
                        FilesKt.copyTo$default(src, t, true, 0, 4, null);
                    }
                    out.add(src.getName());
                }
            }
        }
        FileUtil.INSTANCE.writeJson(new File(targetMods, MARKER), JsonKt.jobj(TuplesKt.to("files", CollectionsKt.toMutableList((Collection) out)), TuplesKt.to("source", this.dir.getAbsolutePath())));
        return out;
    }
}
