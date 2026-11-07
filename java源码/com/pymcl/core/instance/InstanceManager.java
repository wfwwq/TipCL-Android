package com.pymcl.core.instance;

import androidx.autofill.HintConstants;
import com.pymcl.core.config.LauncherPaths;
import com.pymcl.runtime.settings.SettingsProtocol;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.collections.SetsKt;
import kotlin.io.FilesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.apache.commons.lang3.StringUtils;

/* compiled from: Instances.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u0013\u001a\u00020\u0014J\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\n0\u0016J\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\n0\u0016J\u0018\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\n2\b\b\u0002\u0010\u001a\u001a\u00020\nJ\u0018\u0010\u001b\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\n2\b\b\u0002\u0010\u001a\u001a\u00020\nJ\u0010\u0010\u001c\u001a\u00020\f2\b\u0010\u001d\u001a\u0004\u0018\u00010\nJ\u0010\u0010\u001e\u001a\u00020\u001f2\b\u0010\u001d\u001a\u0004\u0018\u00010\nJ\u0006\u0010 \u001a\u00020\u001fJ(\u0010!\u001a\u00020\u001f2\u0006\u0010\u0019\u001a\u00020\n2\u0018\b\u0002\u0010\"\u001a\u0012\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010#J\u000e\u0010$\u001a\u00020%2\u0006\u0010\u001d\u001a\u00020\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u000b\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0019\u0010\u000f\u001a\n \u0010*\u0004\u0018\u00010\n0\n8F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006&"}, d2 = {"Lcom/pymcl/core/instance/InstanceManager;", "", "paths", "Lcom/pymcl/core/config/LauncherPaths;", "<init>", "(Lcom/pymcl/core/config/LauncherPaths;)V", "ILLEGAL", "Lkotlin/text/Regex;", "RESERVED", "", "", "rootDir", "Ljava/io/File;", "getRootDir", "()Ljava/io/File;", "rootName", "kotlin.jvm.PlatformType", "getRootName", "()Ljava/lang/String;", "singleRootMode", "", "legacyInstances", "", "list", "sanitize", "raw", "fallback", "uniqueName", "path", HintConstants.AUTOFILL_HINT_NAME, SettingsProtocol.GET, "Lcom/pymcl/core/instance/Instance;", "ensureRoot", "createUnique", "meta", "", "delete", "", "PyMCL-Android:core"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class InstanceManager {
    private final Regex ILLEGAL;
    private final Set<String> RESERVED;
    private final LauncherPaths paths;

    /* JADX WARN: Multi-variable type inference failed */
    public InstanceManager(LauncherPaths paths) {
        Intrinsics.checkNotNullParameter(paths, "paths");
        this.paths = paths;
        this.ILLEGAL = new Regex("[\\\\/:*?\"<>|\\u0000-\\u001f]");
        Iterable iterable = null;
        boolean z = true;
        Set of = SetsKt.setOf((Object[]) new String[]{"CON", "PRN", "AUX", "NUL"});
        IntRange intRange = new IntRange(1, 9);
        ArrayList arrayList = new ArrayList();
        Iterator<Integer> it = intRange.iterator();
        while (it.hasNext()) {
            int iNextInt = ((IntIterator) it).nextInt();
            String[] strArr = new String[2];
            Object obj = iterable;
            boolean z2 = z;
            strArr[obj == true ? 1 : 0] = "COM" + iNextInt;
            strArr[z2 ? 1 : 0] = "LPT" + iNextInt;
            CollectionsKt.addAll(arrayList, CollectionsKt.listOf((Object[]) strArr));
            iterable = obj == true ? 1 : 0;
            z = z2 ? 1 : 0;
        }
        this.RESERVED = SetsKt.plus(of, (Iterable) arrayList);
    }

    public final File getRootDir() {
        return this.paths.getInstancesDir();
    }

    public final String getRootName() {
        String name = getRootDir().getName();
        if (name.length() == 0) {
            name = ".minecraft";
        }
        return name;
    }

    public final boolean singleRootMode() {
        return new File(getRootDir(), ".instance.json").isFile();
    }

    public final List<String> legacyInstances() {
        File[] fileArrListFiles = getRootDir().listFiles();
        if (fileArrListFiles != null) {
            Collection destination$iv$iv = new ArrayList();
            for (File file : fileArrListFiles) {
                if (new File(file, ".instance.json").isFile()) {
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

    public final List<String> list() {
        List l = legacyInstances();
        return (singleRootMode() || l.isEmpty()) ? CollectionsKt.plus((Collection) CollectionsKt.listOf(getRootName()), (Iterable) l) : l;
    }

    public static /* synthetic */ String sanitize$default(InstanceManager instanceManager, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = "游戏";
        }
        return instanceManager.sanitize(str, str2);
    }

    public final String sanitize(String raw, String fallback) {
        Intrinsics.checkNotNullParameter(raw, "raw");
        Intrinsics.checkNotNullParameter(fallback, "fallback");
        String s = StringsKt.trim(new Regex("\\s+").replace(this.ILLEGAL.replace(raw, "-"), StringUtils.SPACE), ' ', '.');
        if (s.length() == 0) {
            s = fallback;
        }
        if (s.length() > 48) {
            String strSubstring = s.substring(0, 48);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            s = StringsKt.trimEnd(strSubstring, ' ', '.');
        }
        Set<String> set = this.RESERVED;
        String upperCase = ((String) StringsKt.split$default((CharSequence) s, new char[]{'.'}, false, 2, 2, (Object) null).get(0)).toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        if (set.contains(upperCase)) {
            s = "游戏-" + s;
        }
        if (s.length() > 48) {
            String strSubstring2 = s.substring(0, 48);
            Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
            s = StringsKt.trimEnd(strSubstring2, ' ', '.');
        }
        String str = s;
        if (str.length() == 0) {
            str = fallback;
        }
        return str;
    }

    public static /* synthetic */ String uniqueName$default(InstanceManager instanceManager, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = "游戏";
        }
        return instanceManager.uniqueName(str, str2);
    }

    public final String uniqueName(String raw, String fallback) {
        Intrinsics.checkNotNullParameter(raw, "raw");
        Intrinsics.checkNotNullParameter(fallback, "fallback");
        String base = sanitize(raw, fallback);
        Set taken = CollectionsKt.toSet(list());
        String n = base;
        int i = 2;
        while (true) {
            if (taken.contains(n) || new File(getRootDir(), n).exists()) {
                String suf = "-" + i;
                String b = base;
                if (b.length() > 48 - suf.length()) {
                    String strSubstring = b.substring(0, 48 - suf.length());
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                    String b2 = StringsKt.trimEnd(strSubstring, ' ', '.');
                    if (b2.length() == 0) {
                        b2 = fallback;
                    }
                    b = b2;
                }
                n = b + suf;
                i++;
            } else {
                return n;
            }
        }
    }

    public final File path(String name) throws InstanceException {
        String str = name;
        if ((str == null || str.length() == 0) || Intrinsics.areEqual(name, getRootName())) {
            return getRootDir();
        }
        if (Intrinsics.areEqual(name, ".") || Intrinsics.areEqual(name, "..") || this.ILLEGAL.containsMatchIn(name)) {
            throw new InstanceException("非法实例名: '" + name + "'");
        }
        return new File(getRootDir(), name);
    }

    public final Instance get(String name) {
        String str = name;
        String rootName = str == null || str.length() == 0 ? getRootName() : name;
        Intrinsics.checkNotNull(rootName);
        return new Instance(rootName, path(name));
    }

    public final Instance ensureRoot() {
        Instance it = get(getRootName());
        if (!it.getMetaFile().exists()) {
            Instance.create$default(it, null, 1, null);
        }
        return it;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Instance createUnique$default(InstanceManager instanceManager, String str, Map map, int i, Object obj) {
        if ((i & 2) != 0) {
            map = null;
        }
        return instanceManager.createUnique(str, map);
    }

    public final Instance createUnique(String raw, Map<String, ? extends Object> meta) {
        Intrinsics.checkNotNullParameter(raw, "raw");
        Instance it = get(uniqueName$default(this, raw, null, 2, null));
        it.create(meta);
        return it;
    }

    public final void delete(String name) throws InstanceException {
        Intrinsics.checkNotNullParameter(name, "name");
        Instance i = get(name);
        if (Intrinsics.areEqual(i.getDir(), getRootDir())) {
            throw new InstanceException("不能删除根实例");
        }
        FilesKt.deleteRecursively(i.getDir());
    }
}
