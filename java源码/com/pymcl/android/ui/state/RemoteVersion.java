package com.pymcl.android.ui.state;

import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.apache.commons.compress.java.util.jar.Pack200;

/* compiled from: Models.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0014\u0010\u0015\u001a\u00020\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0017\u001a\u00020\u0018HÖ\u0081\u0004J\n\u0010\u0019\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fÊ\u0001\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u001a"}, d2 = {"Lcom/pymcl/android/ui/state/RemoteVersion;", "", "id", "", ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "releaseTime", Pack200.Packer.LATEST, "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getId", "()Ljava/lang/String;", "getType", "getReleaseTime", "getLatest", "()Z", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "PyMCL-Android:app_debug", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes20.dex */
public final /* data */ class RemoteVersion {
    public static final int $stable = 0;
    private final String id;
    private final boolean latest;
    private final String releaseTime;
    private final String type;

    public static /* synthetic */ RemoteVersion copy$default(RemoteVersion remoteVersion, String str, String str2, String str3, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = remoteVersion.id;
        }
        if ((i & 2) != 0) {
            str2 = remoteVersion.type;
        }
        if ((i & 4) != 0) {
            str3 = remoteVersion.releaseTime;
        }
        if ((i & 8) != 0) {
            z = remoteVersion.latest;
        }
        return remoteVersion.copy(str, str2, str3, z);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* renamed from: component3, reason: from getter */
    public final String getReleaseTime() {
        return this.releaseTime;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getLatest() {
        return this.latest;
    }

    public final RemoteVersion copy(String id, String type, String releaseTime, boolean latest) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(releaseTime, "releaseTime");
        return new RemoteVersion(id, type, releaseTime, latest);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RemoteVersion)) {
            return false;
        }
        RemoteVersion remoteVersion = (RemoteVersion) other;
        return Intrinsics.areEqual(this.id, remoteVersion.id) && Intrinsics.areEqual(this.type, remoteVersion.type) && Intrinsics.areEqual(this.releaseTime, remoteVersion.releaseTime) && this.latest == remoteVersion.latest;
    }

    public int hashCode() {
        return (((((this.id.hashCode() * 31) + this.type.hashCode()) * 31) + this.releaseTime.hashCode()) * 31) + Boolean.hashCode(this.latest);
    }

    public String toString() {
        return "RemoteVersion(id=" + this.id + ", type=" + this.type + ", releaseTime=" + this.releaseTime + ", latest=" + this.latest + ")";
    }

    public RemoteVersion(String id, String type, String releaseTime, boolean latest) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(releaseTime, "releaseTime");
        this.id = id;
        this.type = type;
        this.releaseTime = releaseTime;
        this.latest = latest;
    }

    public /* synthetic */ RemoteVersion(String str, String str2, String str3, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i & 8) != 0 ? false : z);
    }

    public final String getId() {
        return this.id;
    }

    public final boolean getLatest() {
        return this.latest;
    }

    public final String getReleaseTime() {
        return this.releaseTime;
    }

    public final String getType() {
        return this.type;
    }
}
