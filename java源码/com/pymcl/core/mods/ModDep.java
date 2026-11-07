package com.pymcl.core.mods;

import com.pymcl.core.mods.MavenRange;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ModConflicts.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0019\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0001\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J=\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u001d\u001a\u00020\u00062\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001f\u001a\u00020 HÖ\u0081\u0004J\n\u0010!\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\fR\u0011\u0010\u0015\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\f¨\u0006\""}, d2 = {"Lcom/pymcl/core/mods/ModDep;", "", "modId", "", "range", "mandatory", "", "maven", "kind", "<init>", "(Ljava/lang/String;Ljava/lang/Object;ZZLjava/lang/String;)V", "getModId", "()Ljava/lang/String;", "getRange", "()Ljava/lang/Object;", "getMandatory", "()Z", "getMaven", "getKind", "accepts", "version", "rangeText", "getRangeText", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "PyMCL-Android:core"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class ModDep {
    private final String kind;
    private final boolean mandatory;
    private final boolean maven;
    private final String modId;
    private final Object range;

    public static /* synthetic */ ModDep copy$default(ModDep modDep, String str, Object obj, boolean z, boolean z2, String str2, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = modDep.modId;
        }
        if ((i & 2) != 0) {
            obj = modDep.range;
        }
        if ((i & 4) != 0) {
            z = modDep.mandatory;
        }
        if ((i & 8) != 0) {
            z2 = modDep.maven;
        }
        if ((i & 16) != 0) {
            str2 = modDep.kind;
        }
        String str3 = str2;
        boolean z3 = z;
        return modDep.copy(str, obj, z3, z2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getModId() {
        return this.modId;
    }

    /* renamed from: component2, reason: from getter */
    public final Object getRange() {
        return this.range;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getMandatory() {
        return this.mandatory;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getMaven() {
        return this.maven;
    }

    /* renamed from: component5, reason: from getter */
    public final String getKind() {
        return this.kind;
    }

    public final ModDep copy(String modId, Object range, boolean mandatory, boolean maven, String kind) {
        Intrinsics.checkNotNullParameter(modId, "modId");
        Intrinsics.checkNotNullParameter(kind, "kind");
        return new ModDep(modId, range, mandatory, maven, kind);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ModDep)) {
            return false;
        }
        ModDep modDep = (ModDep) other;
        return Intrinsics.areEqual(this.modId, modDep.modId) && Intrinsics.areEqual(this.range, modDep.range) && this.mandatory == modDep.mandatory && this.maven == modDep.maven && Intrinsics.areEqual(this.kind, modDep.kind);
    }

    public int hashCode() {
        return (((((((this.modId.hashCode() * 31) + (this.range == null ? 0 : this.range.hashCode())) * 31) + Boolean.hashCode(this.mandatory)) * 31) + Boolean.hashCode(this.maven)) * 31) + this.kind.hashCode();
    }

    public String toString() {
        return "ModDep(modId=" + this.modId + ", range=" + this.range + ", mandatory=" + this.mandatory + ", maven=" + this.maven + ", kind=" + this.kind + ")";
    }

    public ModDep(String modId, Object range, boolean mandatory, boolean maven, String kind) {
        Intrinsics.checkNotNullParameter(modId, "modId");
        Intrinsics.checkNotNullParameter(kind, "kind");
        this.modId = modId;
        this.range = range;
        this.mandatory = mandatory;
        this.maven = maven;
        this.kind = kind;
    }

    public /* synthetic */ ModDep(String str, String str2, boolean z, boolean z2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? "*" : str2, (i & 4) != 0 ? true : z, (i & 8) != 0 ? false : z2, (i & 16) != 0 ? "depends" : str3);
    }

    public final String getKind() {
        return this.kind;
    }

    public final boolean getMandatory() {
        return this.mandatory;
    }

    public final boolean getMaven() {
        return this.maven;
    }

    public final String getModId() {
        return this.modId;
    }

    public final Object getRange() {
        return this.range;
    }

    public final boolean accepts(String version) {
        String string;
        Intrinsics.checkNotNullParameter(version, "version");
        if (!this.maven) {
            return FabricPredicate.INSTANCE.matches(this.range, version);
        }
        MavenRange.Companion companion = MavenRange.INSTANCE;
        Object obj = this.range;
        if (obj == null || (string = obj.toString()) == null) {
            string = "";
        }
        return companion.parse(string).contains(version);
    }

    public final String getRangeText() {
        Object obj = this.range;
        return obj instanceof List ? CollectionsKt.joinToString$default((Iterable) this.range, " || ", null, null, 0, null, null, 62, null) : obj == null ? "*" : this.range.toString();
    }
}
