package com.pymcl.core.mods;

import androidx.autofill.HintConstants;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: ModCatalog.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B{\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\b\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\b\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\b¢\u0006\u0004\b\u0010\u0010\u0011J\u0016\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u00032\u0006\u0010#\u001a\u00020\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\u000f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00030\bHÆ\u0003J\u000f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00030\bHÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\fHÆ\u0003J\u000f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00030\bHÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00030\bHÆ\u0003J\u0091\u0001\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\b2\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\b2\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\f2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\bHÆ\u0001J\u0014\u00100\u001a\u00020!2\b\u00101\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u00102\u001a\u000203HÖ\u0081\u0004J\n\u00104\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0013R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\b¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0018R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0013R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\b¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0018¨\u00065"}, d2 = {"Lcom/pymcl/core/mods/ModFile;", "", "id", "", "projectId", HintConstants.AUTOFILL_HINT_NAME, "displayName", "gameVersions", "", "loaders", "date", "size", "", "urls", "sha1", "requiredDeps", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;JLjava/util/List;Ljava/lang/String;Ljava/util/List;)V", "getId", "()Ljava/lang/String;", "getProjectId", "getName", "getDisplayName", "getGameVersions", "()Ljava/util/List;", "getLoaders", "getDate", "getSize", "()J", "getUrls", "getSha1", "getRequiredDeps", "matches", "", "gameVersion", "loader", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "equals", "other", "hashCode", "", "toString", "PyMCL-Android:core"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class ModFile {
    private final String date;
    private final String displayName;
    private final List<String> gameVersions;
    private final String id;
    private final List<String> loaders;
    private final String name;
    private final String projectId;
    private final List<String> requiredDeps;
    private final String sha1;
    private final long size;
    private final List<String> urls;

    public static /* synthetic */ ModFile copy$default(ModFile modFile, String str, String str2, String str3, String str4, List list, List list2, String str5, long j, List list3, String str6, List list4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = modFile.id;
        }
        if ((i & 2) != 0) {
            str2 = modFile.projectId;
        }
        if ((i & 4) != 0) {
            str3 = modFile.name;
        }
        if ((i & 8) != 0) {
            str4 = modFile.displayName;
        }
        if ((i & 16) != 0) {
            list = modFile.gameVersions;
        }
        if ((i & 32) != 0) {
            list2 = modFile.loaders;
        }
        if ((i & 64) != 0) {
            str5 = modFile.date;
        }
        if ((i & 128) != 0) {
            j = modFile.size;
        }
        if ((i & 256) != 0) {
            list3 = modFile.urls;
        }
        if ((i & 512) != 0) {
            str6 = modFile.sha1;
        }
        if ((i & 1024) != 0) {
            list4 = modFile.requiredDeps;
        }
        List list5 = list4;
        List list6 = list3;
        long j2 = j;
        List list7 = list2;
        String str7 = str5;
        String str8 = str4;
        List list8 = list;
        String str9 = str3;
        return modFile.copy(str, str2, str9, str8, list8, list7, str7, j2, list6, str6, list5);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component10, reason: from getter */
    public final String getSha1() {
        return this.sha1;
    }

    public final List<String> component11() {
        return this.requiredDeps;
    }

    /* renamed from: component2, reason: from getter */
    public final String getProjectId() {
        return this.projectId;
    }

    /* renamed from: component3, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component4, reason: from getter */
    public final String getDisplayName() {
        return this.displayName;
    }

    public final List<String> component5() {
        return this.gameVersions;
    }

    public final List<String> component6() {
        return this.loaders;
    }

    /* renamed from: component7, reason: from getter */
    public final String getDate() {
        return this.date;
    }

    /* renamed from: component8, reason: from getter */
    public final long getSize() {
        return this.size;
    }

    public final List<String> component9() {
        return this.urls;
    }

    public final ModFile copy(String id, String projectId, String name, String displayName, List<String> gameVersions, List<String> loaders, String date, long size, List<String> urls, String sha1, List<String> requiredDeps) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(projectId, "projectId");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        Intrinsics.checkNotNullParameter(gameVersions, "gameVersions");
        Intrinsics.checkNotNullParameter(loaders, "loaders");
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(urls, "urls");
        Intrinsics.checkNotNullParameter(requiredDeps, "requiredDeps");
        return new ModFile(id, projectId, name, displayName, gameVersions, loaders, date, size, urls, sha1, requiredDeps);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ModFile)) {
            return false;
        }
        ModFile modFile = (ModFile) other;
        return Intrinsics.areEqual(this.id, modFile.id) && Intrinsics.areEqual(this.projectId, modFile.projectId) && Intrinsics.areEqual(this.name, modFile.name) && Intrinsics.areEqual(this.displayName, modFile.displayName) && Intrinsics.areEqual(this.gameVersions, modFile.gameVersions) && Intrinsics.areEqual(this.loaders, modFile.loaders) && Intrinsics.areEqual(this.date, modFile.date) && this.size == modFile.size && Intrinsics.areEqual(this.urls, modFile.urls) && Intrinsics.areEqual(this.sha1, modFile.sha1) && Intrinsics.areEqual(this.requiredDeps, modFile.requiredDeps);
    }

    public int hashCode() {
        return (((((((((((((((((((this.id.hashCode() * 31) + this.projectId.hashCode()) * 31) + this.name.hashCode()) * 31) + this.displayName.hashCode()) * 31) + this.gameVersions.hashCode()) * 31) + this.loaders.hashCode()) * 31) + this.date.hashCode()) * 31) + Long.hashCode(this.size)) * 31) + this.urls.hashCode()) * 31) + (this.sha1 == null ? 0 : this.sha1.hashCode())) * 31) + this.requiredDeps.hashCode();
    }

    public String toString() {
        return "ModFile(id=" + this.id + ", projectId=" + this.projectId + ", name=" + this.name + ", displayName=" + this.displayName + ", gameVersions=" + this.gameVersions + ", loaders=" + this.loaders + ", date=" + this.date + ", size=" + this.size + ", urls=" + this.urls + ", sha1=" + this.sha1 + ", requiredDeps=" + this.requiredDeps + ")";
    }

    public ModFile(String id, String projectId, String name, String displayName, List<String> gameVersions, List<String> loaders, String date, long size, List<String> urls, String sha1, List<String> requiredDeps) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(projectId, "projectId");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        Intrinsics.checkNotNullParameter(gameVersions, "gameVersions");
        Intrinsics.checkNotNullParameter(loaders, "loaders");
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(urls, "urls");
        Intrinsics.checkNotNullParameter(requiredDeps, "requiredDeps");
        this.id = id;
        this.projectId = projectId;
        this.name = name;
        this.displayName = displayName;
        this.gameVersions = gameVersions;
        this.loaders = loaders;
        this.date = date;
        this.size = size;
        this.urls = urls;
        this.sha1 = sha1;
        this.requiredDeps = requiredDeps;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ModFile(String str, String str2, String str3, String str4, List list, List list2, String str5, long j, List list3, String str6, List list4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        List listEmptyList;
        if ((i & 1024) == 0) {
            listEmptyList = list4;
        } else {
            listEmptyList = CollectionsKt.emptyList();
        }
        this(str, str2, str3, str4, list, list2, str5, j, list3, str6, listEmptyList);
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    public final List<String> getGameVersions() {
        return this.gameVersions;
    }

    public final String getId() {
        return this.id;
    }

    public final List<String> getLoaders() {
        return this.loaders;
    }

    public final String getName() {
        return this.name;
    }

    public final String getProjectId() {
        return this.projectId;
    }

    public final String getDate() {
        return this.date;
    }

    public final List<String> getRequiredDeps() {
        return this.requiredDeps;
    }

    public final String getSha1() {
        return this.sha1;
    }

    public final long getSize() {
        return this.size;
    }

    public final List<String> getUrls() {
        return this.urls;
    }

    public final boolean matches(String gameVersion, String loader) {
        Iterable $this$any$iv;
        Intrinsics.checkNotNullParameter(gameVersion, "gameVersion");
        Intrinsics.checkNotNullParameter(loader, "loader");
        if (!StringsKt.isBlank(gameVersion) && !this.gameVersions.contains(gameVersion)) {
            return false;
        }
        if (!StringsKt.isBlank(loader) && !this.loaders.isEmpty()) {
            Iterable $this$any$iv2 = this.loaders;
            if (!($this$any$iv2 instanceof Collection) || !((Collection) $this$any$iv2).isEmpty()) {
                Iterator it = $this$any$iv2.iterator();
                while (true) {
                    if (it.hasNext()) {
                        Object element$iv = it.next();
                        String it2 = (String) element$iv;
                        if (StringsKt.equals(it2, loader, true)) {
                            $this$any$iv = 1;
                            break;
                        }
                    } else {
                        $this$any$iv = null;
                        break;
                    }
                }
            } else {
                $this$any$iv = null;
            }
            if ($this$any$iv == null) {
                return false;
            }
        }
        return true;
    }
}
