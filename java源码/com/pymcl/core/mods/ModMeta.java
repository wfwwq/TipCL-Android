package com.pymcl.core.mods;

import androidx.autofill.HintConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ModConflicts.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B[\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\n¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003J\u000f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00030\nHÆ\u0003Jg\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\nHÆ\u0001J\u0014\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010%\u001a\u00020&HÖ\u0081\u0004J\n\u0010'\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\n¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017¨\u0006("}, d2 = {"Lcom/pymcl/core/mods/ModMeta;", "", "modId", "", HintConstants.AUTOFILL_HINT_NAME, "version", "loader", "file", "nestedIn", "deps", "", "Lcom/pymcl/core/mods/ModDep;", "provides", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "getModId", "()Ljava/lang/String;", "getName", "getVersion", "getLoader", "getFile", "getNestedIn", "getDeps", "()Ljava/util/List;", "getProvides", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "PyMCL-Android:core"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class ModMeta {
    private final List<ModDep> deps;
    private final String file;
    private final String loader;
    private final String modId;
    private final String name;
    private final String nestedIn;
    private final List<String> provides;
    private final String version;

    public static /* synthetic */ ModMeta copy$default(ModMeta modMeta, String str, String str2, String str3, String str4, String str5, String str6, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = modMeta.modId;
        }
        if ((i & 2) != 0) {
            str2 = modMeta.name;
        }
        if ((i & 4) != 0) {
            str3 = modMeta.version;
        }
        if ((i & 8) != 0) {
            str4 = modMeta.loader;
        }
        if ((i & 16) != 0) {
            str5 = modMeta.file;
        }
        if ((i & 32) != 0) {
            str6 = modMeta.nestedIn;
        }
        if ((i & 64) != 0) {
            list = modMeta.deps;
        }
        if ((i & 128) != 0) {
            list2 = modMeta.provides;
        }
        List list3 = list;
        List list4 = list2;
        String str7 = str5;
        String str8 = str6;
        return modMeta.copy(str, str2, str3, str4, str7, str8, list3, list4);
    }

    /* renamed from: component1, reason: from getter */
    public final String getModId() {
        return this.modId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component3, reason: from getter */
    public final String getVersion() {
        return this.version;
    }

    /* renamed from: component4, reason: from getter */
    public final String getLoader() {
        return this.loader;
    }

    /* renamed from: component5, reason: from getter */
    public final String getFile() {
        return this.file;
    }

    /* renamed from: component6, reason: from getter */
    public final String getNestedIn() {
        return this.nestedIn;
    }

    public final List<ModDep> component7() {
        return this.deps;
    }

    public final List<String> component8() {
        return this.provides;
    }

    public final ModMeta copy(String modId, String name, String version, String loader, String file, String nestedIn, List<ModDep> deps, List<String> provides) {
        Intrinsics.checkNotNullParameter(modId, "modId");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(version, "version");
        Intrinsics.checkNotNullParameter(loader, "loader");
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(deps, "deps");
        Intrinsics.checkNotNullParameter(provides, "provides");
        return new ModMeta(modId, name, version, loader, file, nestedIn, deps, provides);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ModMeta)) {
            return false;
        }
        ModMeta modMeta = (ModMeta) other;
        return Intrinsics.areEqual(this.modId, modMeta.modId) && Intrinsics.areEqual(this.name, modMeta.name) && Intrinsics.areEqual(this.version, modMeta.version) && Intrinsics.areEqual(this.loader, modMeta.loader) && Intrinsics.areEqual(this.file, modMeta.file) && Intrinsics.areEqual(this.nestedIn, modMeta.nestedIn) && Intrinsics.areEqual(this.deps, modMeta.deps) && Intrinsics.areEqual(this.provides, modMeta.provides);
    }

    public int hashCode() {
        return (((((((((((((this.modId.hashCode() * 31) + this.name.hashCode()) * 31) + this.version.hashCode()) * 31) + this.loader.hashCode()) * 31) + this.file.hashCode()) * 31) + (this.nestedIn == null ? 0 : this.nestedIn.hashCode())) * 31) + this.deps.hashCode()) * 31) + this.provides.hashCode();
    }

    public String toString() {
        return "ModMeta(modId=" + this.modId + ", name=" + this.name + ", version=" + this.version + ", loader=" + this.loader + ", file=" + this.file + ", nestedIn=" + this.nestedIn + ", deps=" + this.deps + ", provides=" + this.provides + ")";
    }

    public ModMeta(String modId, String name, String version, String loader, String file, String nestedIn, List<ModDep> deps, List<String> provides) {
        Intrinsics.checkNotNullParameter(modId, "modId");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(version, "version");
        Intrinsics.checkNotNullParameter(loader, "loader");
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(deps, "deps");
        Intrinsics.checkNotNullParameter(provides, "provides");
        this.modId = modId;
        this.name = name;
        this.version = version;
        this.loader = loader;
        this.file = file;
        this.nestedIn = nestedIn;
        this.deps = deps;
        this.provides = provides;
    }

    public /* synthetic */ ModMeta(String str, String str2, String str3, String str4, String str5, String str6, List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? CollectionsKt.emptyList() : list, (i & 128) != 0 ? CollectionsKt.emptyList() : list2);
    }

    public final String getFile() {
        return this.file;
    }

    public final String getLoader() {
        return this.loader;
    }

    public final String getModId() {
        return this.modId;
    }

    public final String getName() {
        return this.name;
    }

    public final String getVersion() {
        return this.version;
    }

    public final List<ModDep> getDeps() {
        return this.deps;
    }

    public final String getNestedIn() {
        return this.nestedIn;
    }

    public final List<String> getProvides() {
        return this.provides;
    }
}
