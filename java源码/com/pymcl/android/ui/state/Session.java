package com.pymcl.android.ui.state;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Models.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0014\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0015\u001a\u00020\u0006HÖ\u0081\u0004J\n\u0010\u0016\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rÊ\u0001\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u0017"}, d2 = {"Lcom/pymcl/android/ui/state/Session;", "", "version", "", "start", "minutes", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;I)V", "getVersion", "()Ljava/lang/String;", "getStart", "getMinutes", "()I", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "PyMCL-Android:app_debug", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes20.dex */
public final /* data */ class Session {
    public static final int $stable = 0;
    private final int minutes;
    private final String start;
    private final String version;

    public static /* synthetic */ Session copy$default(Session session, String str, String str2, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = session.version;
        }
        if ((i2 & 2) != 0) {
            str2 = session.start;
        }
        if ((i2 & 4) != 0) {
            i = session.minutes;
        }
        return session.copy(str, str2, i);
    }

    /* renamed from: component1, reason: from getter */
    public final String getVersion() {
        return this.version;
    }

    /* renamed from: component2, reason: from getter */
    public final String getStart() {
        return this.start;
    }

    /* renamed from: component3, reason: from getter */
    public final int getMinutes() {
        return this.minutes;
    }

    public final Session copy(String version, String start, int minutes) {
        Intrinsics.checkNotNullParameter(version, "version");
        Intrinsics.checkNotNullParameter(start, "start");
        return new Session(version, start, minutes);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Session)) {
            return false;
        }
        Session session = (Session) other;
        return Intrinsics.areEqual(this.version, session.version) && Intrinsics.areEqual(this.start, session.start) && this.minutes == session.minutes;
    }

    public int hashCode() {
        return (((this.version.hashCode() * 31) + this.start.hashCode()) * 31) + Integer.hashCode(this.minutes);
    }

    public String toString() {
        return "Session(version=" + this.version + ", start=" + this.start + ", minutes=" + this.minutes + ")";
    }

    public Session(String version, String start, int minutes) {
        Intrinsics.checkNotNullParameter(version, "version");
        Intrinsics.checkNotNullParameter(start, "start");
        this.version = version;
        this.start = start;
        this.minutes = minutes;
    }

    public final int getMinutes() {
        return this.minutes;
    }

    public final String getStart() {
        return this.start;
    }

    public final String getVersion() {
        return this.version;
    }
}
