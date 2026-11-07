package com.pymcl.core.mods;

import androidx.autofill.HintConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ModTools.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004J\n\u0010\u0015\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/pymcl/core/mods/LocalModMeta;", "", "modId", "", HintConstants.AUTOFILL_HINT_NAME, "version", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getModId", "()Ljava/lang/String;", "getName", "getVersion", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "PyMCL-Android:core"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class LocalModMeta {
    private final String modId;
    private final String name;
    private final String version;

    public static /* synthetic */ LocalModMeta copy$default(LocalModMeta localModMeta, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = localModMeta.modId;
        }
        if ((i & 2) != 0) {
            str2 = localModMeta.name;
        }
        if ((i & 4) != 0) {
            str3 = localModMeta.version;
        }
        return localModMeta.copy(str, str2, str3);
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

    public final LocalModMeta copy(String modId, String name, String version) {
        Intrinsics.checkNotNullParameter(modId, "modId");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(version, "version");
        return new LocalModMeta(modId, name, version);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LocalModMeta)) {
            return false;
        }
        LocalModMeta localModMeta = (LocalModMeta) other;
        return Intrinsics.areEqual(this.modId, localModMeta.modId) && Intrinsics.areEqual(this.name, localModMeta.name) && Intrinsics.areEqual(this.version, localModMeta.version);
    }

    public int hashCode() {
        return (((this.modId.hashCode() * 31) + this.name.hashCode()) * 31) + this.version.hashCode();
    }

    public String toString() {
        return "LocalModMeta(modId=" + this.modId + ", name=" + this.name + ", version=" + this.version + ")";
    }

    public LocalModMeta(String modId, String name, String version) {
        Intrinsics.checkNotNullParameter(modId, "modId");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(version, "version");
        this.modId = modId;
        this.name = name;
        this.version = version;
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
}
