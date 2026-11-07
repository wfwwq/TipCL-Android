package com.pymcl.core.version;

import androidx.autofill.HintConstants;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: Versions.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\bj\u0002`\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001b\u0010\u001b\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\bj\u0002`\tHÆ\u0003JG\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u001a\b\u0002\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\bj\u0002`\tHÆ\u0001J\u0014\u0010\u001d\u001a\u00020\u00162\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001f\u001a\u00020 HÖ\u0081\u0004J\n\u0010!\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR#\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\bj\u0002`\t¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0013\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\rR\u0011\u0010\u0015\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0017¨\u0006\""}, d2 = {"Lcom/pymcl/core/version/Library;", "", HintConstants.AUTOFILL_HINT_NAME, "", "artifact", "Lcom/pymcl/core/version/Artifact;", "natives", "raw", "", "Lcom/pymcl/core/util/JObj;", "<init>", "(Ljava/lang/String;Lcom/pymcl/core/version/Artifact;Lcom/pymcl/core/version/Artifact;Ljava/util/Map;)V", "getName", "()Ljava/lang/String;", "getArtifact", "()Lcom/pymcl/core/version/Artifact;", "getNatives", "getRaw", "()Ljava/util/Map;", "groupArtifact", "getGroupArtifact", "isNativesOnly", "", "()Z", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "PyMCL-Android:core"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class Library {
    private final Artifact artifact;
    private final String name;
    private final Artifact natives;
    private final Map<String, Object> raw;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Library copy$default(Library library, String str, Artifact artifact, Artifact artifact2, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            str = library.name;
        }
        if ((i & 2) != 0) {
            artifact = library.artifact;
        }
        if ((i & 4) != 0) {
            artifact2 = library.natives;
        }
        if ((i & 8) != 0) {
            map = library.raw;
        }
        return library.copy(str, artifact, artifact2, map);
    }

    /* renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component2, reason: from getter */
    public final Artifact getArtifact() {
        return this.artifact;
    }

    /* renamed from: component3, reason: from getter */
    public final Artifact getNatives() {
        return this.natives;
    }

    public final Map<String, Object> component4() {
        return this.raw;
    }

    public final Library copy(String name, Artifact artifact, Artifact natives, Map<String, Object> raw) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(raw, "raw");
        return new Library(name, artifact, natives, raw);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Library)) {
            return false;
        }
        Library library = (Library) other;
        return Intrinsics.areEqual(this.name, library.name) && Intrinsics.areEqual(this.artifact, library.artifact) && Intrinsics.areEqual(this.natives, library.natives) && Intrinsics.areEqual(this.raw, library.raw);
    }

    public int hashCode() {
        return (((((this.name.hashCode() * 31) + (this.artifact == null ? 0 : this.artifact.hashCode())) * 31) + (this.natives != null ? this.natives.hashCode() : 0)) * 31) + this.raw.hashCode();
    }

    public String toString() {
        return "Library(name=" + this.name + ", artifact=" + this.artifact + ", natives=" + this.natives + ", raw=" + this.raw + ")";
    }

    public Library(String name, Artifact artifact, Artifact natives, Map<String, Object> raw) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(raw, "raw");
        this.name = name;
        this.artifact = artifact;
        this.natives = natives;
        this.raw = raw;
    }

    public final Artifact getArtifact() {
        return this.artifact;
    }

    public final String getName() {
        return this.name;
    }

    public final Artifact getNatives() {
        return this.natives;
    }

    public final Map<String, Object> getRaw() {
        return this.raw;
    }

    public final String getGroupArtifact() {
        List it = StringsKt.split$default((CharSequence) this.name, new char[]{':'}, false, 0, 6, (Object) null);
        if (it.size() < 2) {
            return this.name;
        }
        return it.get(0) + ":" + it.get(1) + (it.size() > 3 ? ":" + it.get(3) : "");
    }

    public final boolean isNativesOnly() {
        return this.artifact == null && this.natives != null;
    }
}
