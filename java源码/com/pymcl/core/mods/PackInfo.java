package com.pymcl.core.mods;

import androidx.autofill.HintConstants;
import com.pymcl.core.loader.LoaderType;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Modpack.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001Bq\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0018\u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u000e0\u000b\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010%\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0003J\u001b\u0010&\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u000e0\u000bHÆ\u0003J\u000f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00030\u000bHÆ\u0003J\u0085\u0001\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u001a\b\u0002\u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u000e0\u000b2\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u000bHÆ\u0001J\u0014\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010,\u001a\u00020-HÖ\u0081\u0004J\n\u0010.\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0014R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR#\u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u000e0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001c¨\u0006/"}, d2 = {"Lcom/pymcl/core/mods/PackInfo;", "", "format", "", HintConstants.AUTOFILL_HINT_NAME, "version", "mcVersion", "loader", "Lcom/pymcl/core/loader/LoaderType;", "loaderVersion", "files", "", "Lcom/pymcl/core/mods/PackFile;", "cfFiles", "Lkotlin/Pair;", "", "overrides", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/pymcl/core/loader/LoaderType;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getFormat", "()Ljava/lang/String;", "getName", "getVersion", "getMcVersion", "getLoader", "()Lcom/pymcl/core/loader/LoaderType;", "getLoaderVersion", "getFiles", "()Ljava/util/List;", "getCfFiles", "getOverrides", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "PyMCL-Android:core"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class PackInfo {
    private final List<Pair<Long, Long>> cfFiles;
    private final List<PackFile> files;
    private final String format;
    private final LoaderType loader;
    private final String loaderVersion;
    private final String mcVersion;
    private final String name;
    private final List<String> overrides;
    private final String version;

    public static /* synthetic */ PackInfo copy$default(PackInfo packInfo, String str, String str2, String str3, String str4, LoaderType loaderType, String str5, List list, List list2, List list3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = packInfo.format;
        }
        if ((i & 2) != 0) {
            str2 = packInfo.name;
        }
        if ((i & 4) != 0) {
            str3 = packInfo.version;
        }
        if ((i & 8) != 0) {
            str4 = packInfo.mcVersion;
        }
        if ((i & 16) != 0) {
            loaderType = packInfo.loader;
        }
        if ((i & 32) != 0) {
            str5 = packInfo.loaderVersion;
        }
        if ((i & 64) != 0) {
            list = packInfo.files;
        }
        if ((i & 128) != 0) {
            list2 = packInfo.cfFiles;
        }
        if ((i & 256) != 0) {
            list3 = packInfo.overrides;
        }
        List list4 = list2;
        List list5 = list3;
        String str6 = str5;
        List list6 = list;
        LoaderType loaderType2 = loaderType;
        String str7 = str3;
        return packInfo.copy(str, str2, str7, str4, loaderType2, str6, list6, list4, list5);
    }

    /* renamed from: component1, reason: from getter */
    public final String getFormat() {
        return this.format;
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
    public final String getMcVersion() {
        return this.mcVersion;
    }

    /* renamed from: component5, reason: from getter */
    public final LoaderType getLoader() {
        return this.loader;
    }

    /* renamed from: component6, reason: from getter */
    public final String getLoaderVersion() {
        return this.loaderVersion;
    }

    public final List<PackFile> component7() {
        return this.files;
    }

    public final List<Pair<Long, Long>> component8() {
        return this.cfFiles;
    }

    public final List<String> component9() {
        return this.overrides;
    }

    public final PackInfo copy(String format, String name, String version, String mcVersion, LoaderType loader, String loaderVersion, List<PackFile> files, List<Pair<Long, Long>> cfFiles, List<String> overrides) {
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(version, "version");
        Intrinsics.checkNotNullParameter(mcVersion, "mcVersion");
        Intrinsics.checkNotNullParameter(files, "files");
        Intrinsics.checkNotNullParameter(cfFiles, "cfFiles");
        Intrinsics.checkNotNullParameter(overrides, "overrides");
        return new PackInfo(format, name, version, mcVersion, loader, loaderVersion, files, cfFiles, overrides);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PackInfo)) {
            return false;
        }
        PackInfo packInfo = (PackInfo) other;
        return Intrinsics.areEqual(this.format, packInfo.format) && Intrinsics.areEqual(this.name, packInfo.name) && Intrinsics.areEqual(this.version, packInfo.version) && Intrinsics.areEqual(this.mcVersion, packInfo.mcVersion) && this.loader == packInfo.loader && Intrinsics.areEqual(this.loaderVersion, packInfo.loaderVersion) && Intrinsics.areEqual(this.files, packInfo.files) && Intrinsics.areEqual(this.cfFiles, packInfo.cfFiles) && Intrinsics.areEqual(this.overrides, packInfo.overrides);
    }

    public int hashCode() {
        return (((((((((((((((this.format.hashCode() * 31) + this.name.hashCode()) * 31) + this.version.hashCode()) * 31) + this.mcVersion.hashCode()) * 31) + (this.loader == null ? 0 : this.loader.hashCode())) * 31) + (this.loaderVersion != null ? this.loaderVersion.hashCode() : 0)) * 31) + this.files.hashCode()) * 31) + this.cfFiles.hashCode()) * 31) + this.overrides.hashCode();
    }

    public String toString() {
        return "PackInfo(format=" + this.format + ", name=" + this.name + ", version=" + this.version + ", mcVersion=" + this.mcVersion + ", loader=" + this.loader + ", loaderVersion=" + this.loaderVersion + ", files=" + this.files + ", cfFiles=" + this.cfFiles + ", overrides=" + this.overrides + ")";
    }

    public PackInfo(String format, String name, String version, String mcVersion, LoaderType loader, String loaderVersion, List<PackFile> files, List<Pair<Long, Long>> cfFiles, List<String> overrides) {
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(version, "version");
        Intrinsics.checkNotNullParameter(mcVersion, "mcVersion");
        Intrinsics.checkNotNullParameter(files, "files");
        Intrinsics.checkNotNullParameter(cfFiles, "cfFiles");
        Intrinsics.checkNotNullParameter(overrides, "overrides");
        this.format = format;
        this.name = name;
        this.version = version;
        this.mcVersion = mcVersion;
        this.loader = loader;
        this.loaderVersion = loaderVersion;
        this.files = files;
        this.cfFiles = cfFiles;
        this.overrides = overrides;
    }

    public final String getFormat() {
        return this.format;
    }

    public final String getMcVersion() {
        return this.mcVersion;
    }

    public final String getName() {
        return this.name;
    }

    public final String getVersion() {
        return this.version;
    }

    public final LoaderType getLoader() {
        return this.loader;
    }

    public final String getLoaderVersion() {
        return this.loaderVersion;
    }

    public final List<Pair<Long, Long>> getCfFiles() {
        return this.cfFiles;
    }

    public final List<PackFile> getFiles() {
        return this.files;
    }

    public final List<String> getOverrides() {
        return this.overrides;
    }
}
