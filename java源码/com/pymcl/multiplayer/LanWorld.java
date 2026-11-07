package com.pymcl.multiplayer;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LanDiscovery.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0014\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0017\u001a\u00020\u0006HÖ\u0081\u0004J\n\u0010\u0018\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/pymcl/multiplayer/LanWorld;", "", "motd", "", "host", "port", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;I)V", "getMotd", "()Ljava/lang/String;", "getHost", "getPort", "()I", "address", "getAddress", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "PyMCL-Android:multiplayer_debug"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class LanWorld {
    private final String host;
    private final String motd;
    private final int port;

    public static /* synthetic */ LanWorld copy$default(LanWorld lanWorld, String str, String str2, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = lanWorld.motd;
        }
        if ((i2 & 2) != 0) {
            str2 = lanWorld.host;
        }
        if ((i2 & 4) != 0) {
            i = lanWorld.port;
        }
        return lanWorld.copy(str, str2, i);
    }

    /* renamed from: component1, reason: from getter */
    public final String getMotd() {
        return this.motd;
    }

    /* renamed from: component2, reason: from getter */
    public final String getHost() {
        return this.host;
    }

    /* renamed from: component3, reason: from getter */
    public final int getPort() {
        return this.port;
    }

    public final LanWorld copy(String motd, String host, int port) {
        Intrinsics.checkNotNullParameter(motd, "motd");
        Intrinsics.checkNotNullParameter(host, "host");
        return new LanWorld(motd, host, port);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LanWorld)) {
            return false;
        }
        LanWorld lanWorld = (LanWorld) other;
        return Intrinsics.areEqual(this.motd, lanWorld.motd) && Intrinsics.areEqual(this.host, lanWorld.host) && this.port == lanWorld.port;
    }

    public int hashCode() {
        return (((this.motd.hashCode() * 31) + this.host.hashCode()) * 31) + Integer.hashCode(this.port);
    }

    public String toString() {
        return "LanWorld(motd=" + this.motd + ", host=" + this.host + ", port=" + this.port + ")";
    }

    public LanWorld(String motd, String host, int port) {
        Intrinsics.checkNotNullParameter(motd, "motd");
        Intrinsics.checkNotNullParameter(host, "host");
        this.motd = motd;
        this.host = host;
        this.port = port;
    }

    public final String getAddress() {
        return this.host + ":" + this.port;
    }

    public final String getHost() {
        return this.host;
    }

    public final String getMotd() {
        return this.motd;
    }

    public final int getPort() {
        return this.port;
    }
}
