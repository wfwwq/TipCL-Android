package com.pymcl.core.loader;

import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Loaders.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0014\u0010\u0017\u001a\u00020\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0019\u001a\u00020\u001aHÖ\u0081\u0004J\n\u0010\u001b\u001a\u00020\u0005HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, d2 = {"Lcom/pymcl/core/loader/LoaderVersion;", "", ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "Lcom/pymcl/core/loader/LoaderType;", "mcVersion", "", "version", "stable", "", "<init>", "(Lcom/pymcl/core/loader/LoaderType;Ljava/lang/String;Ljava/lang/String;Z)V", "getType", "()Lcom/pymcl/core/loader/LoaderType;", "getMcVersion", "()Ljava/lang/String;", "getVersion", "getStable", "()Z", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "PyMCL-Android:core"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class LoaderVersion {
    private final String mcVersion;
    private final boolean stable;
    private final LoaderType type;
    private final String version;

    public static /* synthetic */ LoaderVersion copy$default(LoaderVersion loaderVersion, LoaderType loaderType, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            loaderType = loaderVersion.type;
        }
        if ((i & 2) != 0) {
            str = loaderVersion.mcVersion;
        }
        if ((i & 4) != 0) {
            str2 = loaderVersion.version;
        }
        if ((i & 8) != 0) {
            z = loaderVersion.stable;
        }
        return loaderVersion.copy(loaderType, str, str2, z);
    }

    /* renamed from: component1, reason: from getter */
    public final LoaderType getType() {
        return this.type;
    }

    /* renamed from: component2, reason: from getter */
    public final String getMcVersion() {
        return this.mcVersion;
    }

    /* renamed from: component3, reason: from getter */
    public final String getVersion() {
        return this.version;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getStable() {
        return this.stable;
    }

    public final LoaderVersion copy(LoaderType type, String mcVersion, String version, boolean stable) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(mcVersion, "mcVersion");
        Intrinsics.checkNotNullParameter(version, "version");
        return new LoaderVersion(type, mcVersion, version, stable);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LoaderVersion)) {
            return false;
        }
        LoaderVersion loaderVersion = (LoaderVersion) other;
        return this.type == loaderVersion.type && Intrinsics.areEqual(this.mcVersion, loaderVersion.mcVersion) && Intrinsics.areEqual(this.version, loaderVersion.version) && this.stable == loaderVersion.stable;
    }

    public int hashCode() {
        return (((((this.type.hashCode() * 31) + this.mcVersion.hashCode()) * 31) + this.version.hashCode()) * 31) + Boolean.hashCode(this.stable);
    }

    public String toString() {
        return "LoaderVersion(type=" + this.type + ", mcVersion=" + this.mcVersion + ", version=" + this.version + ", stable=" + this.stable + ")";
    }

    public LoaderVersion(LoaderType type, String mcVersion, String version, boolean stable) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(mcVersion, "mcVersion");
        Intrinsics.checkNotNullParameter(version, "version");
        this.type = type;
        this.mcVersion = mcVersion;
        this.version = version;
        this.stable = stable;
    }

    public /* synthetic */ LoaderVersion(LoaderType loaderType, String str, String str2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(loaderType, str, str2, (i & 8) != 0 ? true : z);
    }

    public final String getMcVersion() {
        return this.mcVersion;
    }

    public final boolean getStable() {
        return this.stable;
    }

    public final LoaderType getType() {
        return this.type;
    }

    public final String getVersion() {
        return this.version;
    }
}
