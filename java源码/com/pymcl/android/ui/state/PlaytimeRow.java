package com.pymcl.android.ui.state;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Models.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001J\u0014\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001a\u001a\u00020\u0007HÖ\u0081\u0004J\n\u0010\u001b\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010Ê\u0001\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u001c"}, d2 = {"Lcom/pymcl/android/ui/state/PlaytimeRow;", "", "instance", "", "seconds", "", "versions", "", "sessions", "<init>", "(Ljava/lang/String;JII)V", "getInstance", "()Ljava/lang/String;", "getSeconds", "()J", "getVersions", "()I", "getSessions", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "PyMCL-Android:app_debug", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes20.dex */
public final /* data */ class PlaytimeRow {
    public static final int $stable = 0;
    private final String instance;
    private final long seconds;
    private final int sessions;
    private final int versions;

    public static /* synthetic */ PlaytimeRow copy$default(PlaytimeRow playtimeRow, String str, long j, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = playtimeRow.instance;
        }
        if ((i3 & 2) != 0) {
            j = playtimeRow.seconds;
        }
        if ((i3 & 4) != 0) {
            i = playtimeRow.versions;
        }
        if ((i3 & 8) != 0) {
            i2 = playtimeRow.sessions;
        }
        return playtimeRow.copy(str, j, i, i2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getInstance() {
        return this.instance;
    }

    /* renamed from: component2, reason: from getter */
    public final long getSeconds() {
        return this.seconds;
    }

    /* renamed from: component3, reason: from getter */
    public final int getVersions() {
        return this.versions;
    }

    /* renamed from: component4, reason: from getter */
    public final int getSessions() {
        return this.sessions;
    }

    public final PlaytimeRow copy(String instance, long seconds, int versions, int sessions) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        return new PlaytimeRow(instance, seconds, versions, sessions);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PlaytimeRow)) {
            return false;
        }
        PlaytimeRow playtimeRow = (PlaytimeRow) other;
        return Intrinsics.areEqual(this.instance, playtimeRow.instance) && this.seconds == playtimeRow.seconds && this.versions == playtimeRow.versions && this.sessions == playtimeRow.sessions;
    }

    public int hashCode() {
        return (((((this.instance.hashCode() * 31) + Long.hashCode(this.seconds)) * 31) + Integer.hashCode(this.versions)) * 31) + Integer.hashCode(this.sessions);
    }

    public String toString() {
        return "PlaytimeRow(instance=" + this.instance + ", seconds=" + this.seconds + ", versions=" + this.versions + ", sessions=" + this.sessions + ")";
    }

    public PlaytimeRow(String instance, long seconds, int versions, int sessions) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        this.instance = instance;
        this.seconds = seconds;
        this.versions = versions;
        this.sessions = sessions;
    }

    public final String getInstance() {
        return this.instance;
    }

    public final long getSeconds() {
        return this.seconds;
    }

    public final int getSessions() {
        return this.sessions;
    }

    public final int getVersions() {
        return this.versions;
    }
}
