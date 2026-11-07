package com.pymcl.core.version;

import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import com.pymcl.core.util.Json;
import com.pymcl.core.util.JsonKt;
import com.pymcl.multiplayer.TerracottaVpnService;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.apache.commons.compress.java.util.jar.Pack200;

/* compiled from: Versions.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0010\u001a\u00020\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J-\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001J\u0014\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0018\u001a\u00020\u0019HÖ\u0081\u0004J\n\u0010\u001a\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001c"}, d2 = {"Lcom/pymcl/core/version/VersionManifest;", "", "latestRelease", "", "latestSnapshot", "versions", "", "Lcom/pymcl/core/version/ManifestEntry;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getLatestRelease", "()Ljava/lang/String;", "getLatestSnapshot", "getVersions", "()Ljava/util/List;", "find", "id", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "PyMCL-Android:core"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class VersionManifest {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String latestRelease;
    private final String latestSnapshot;
    private final List<ManifestEntry> versions;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VersionManifest copy$default(VersionManifest versionManifest, String str, String str2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = versionManifest.latestRelease;
        }
        if ((i & 2) != 0) {
            str2 = versionManifest.latestSnapshot;
        }
        if ((i & 4) != 0) {
            list = versionManifest.versions;
        }
        return versionManifest.copy(str, str2, list);
    }

    /* renamed from: component1, reason: from getter */
    public final String getLatestRelease() {
        return this.latestRelease;
    }

    /* renamed from: component2, reason: from getter */
    public final String getLatestSnapshot() {
        return this.latestSnapshot;
    }

    public final List<ManifestEntry> component3() {
        return this.versions;
    }

    public final VersionManifest copy(String latestRelease, String latestSnapshot, List<ManifestEntry> versions) {
        Intrinsics.checkNotNullParameter(latestRelease, "latestRelease");
        Intrinsics.checkNotNullParameter(latestSnapshot, "latestSnapshot");
        Intrinsics.checkNotNullParameter(versions, "versions");
        return new VersionManifest(latestRelease, latestSnapshot, versions);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VersionManifest)) {
            return false;
        }
        VersionManifest versionManifest = (VersionManifest) other;
        return Intrinsics.areEqual(this.latestRelease, versionManifest.latestRelease) && Intrinsics.areEqual(this.latestSnapshot, versionManifest.latestSnapshot) && Intrinsics.areEqual(this.versions, versionManifest.versions);
    }

    public int hashCode() {
        return (((this.latestRelease.hashCode() * 31) + this.latestSnapshot.hashCode()) * 31) + this.versions.hashCode();
    }

    public String toString() {
        return "VersionManifest(latestRelease=" + this.latestRelease + ", latestSnapshot=" + this.latestSnapshot + ", versions=" + this.versions + ")";
    }

    /* compiled from: Versions.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/pymcl/core/version/VersionManifest$Companion;", "", "<init>", "()V", "parse", "Lcom/pymcl/core/version/VersionManifest;", TerracottaVpnService.EXTRA_TEXT, "", "PyMCL-Android:core"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final VersionManifest parse(String text) {
            Intrinsics.checkNotNullParameter(text, "text");
            Map o = Json.INSTANCE.obj(text);
            String str = JsonKt.str(JsonKt.obj(o, Pack200.Packer.LATEST), "release");
            if (str == null) {
                str = "";
            }
            String str2 = JsonKt.str(JsonKt.obj(o, Pack200.Packer.LATEST), "snapshot");
            if (str2 == null) {
                str2 = "";
            }
            Iterable $this$map$iv = JsonKt.objs(JsonKt.arr(o, "versions"));
            Collection destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10));
            for (Object item$iv$iv : $this$map$iv) {
                Map it = (Map) item$iv$iv;
                String str3 = JsonKt.str(it, "id");
                Intrinsics.checkNotNull(str3);
                String str4 = JsonKt.str(it, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
                String str5 = str4 == null ? "release" : str4;
                String str6 = JsonKt.str(it, "url");
                String str7 = str6 == null ? "" : str6;
                String str8 = JsonKt.str(it, "releaseTime");
                destination$iv$iv.add(new ManifestEntry(str3, str5, str7, str8 == null ? "" : str8, JsonKt.str(it, "sha1")));
            }
            return new VersionManifest(str, str2, (List) destination$iv$iv);
        }
    }

    public VersionManifest(String latestRelease, String latestSnapshot, List<ManifestEntry> versions) {
        Intrinsics.checkNotNullParameter(latestRelease, "latestRelease");
        Intrinsics.checkNotNullParameter(latestSnapshot, "latestSnapshot");
        Intrinsics.checkNotNullParameter(versions, "versions");
        this.latestRelease = latestRelease;
        this.latestSnapshot = latestSnapshot;
        this.versions = versions;
    }

    public final String getLatestRelease() {
        return this.latestRelease;
    }

    public final String getLatestSnapshot() {
        return this.latestSnapshot;
    }

    public final List<ManifestEntry> getVersions() {
        return this.versions;
    }

    public final ManifestEntry find(String id) {
        Object element$iv;
        Intrinsics.checkNotNullParameter(id, "id");
        Iterable $this$firstOrNull$iv = this.versions;
        Iterator it = $this$firstOrNull$iv.iterator();
        while (true) {
            if (it.hasNext()) {
                element$iv = it.next();
                ManifestEntry it2 = (ManifestEntry) element$iv;
                if (Intrinsics.areEqual(it2.getId(), id)) {
                    break;
                }
            } else {
                element$iv = null;
                break;
            }
        }
        return (ManifestEntry) element$iv;
    }
}
