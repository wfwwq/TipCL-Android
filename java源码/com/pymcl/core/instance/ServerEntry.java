package com.pymcl.core.instance;

import androidx.autofill.HintConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Playtime.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\tHÆ\u0003JE\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0014\u0010\u001d\u001a\u00020\t2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001f\u001a\u00020 HÖ\u0081\u0004J\n\u0010!\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0014\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\r¨\u0006\""}, d2 = {"Lcom/pymcl/core/instance/ServerEntry;", "", HintConstants.AUTOFILL_HINT_NAME, "", "ip", "port", "icon", "description", "hidden", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getName", "()Ljava/lang/String;", "getIp", "getPort", "getIcon", "getDescription", "getHidden", "()Z", "address", "getAddress", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "PyMCL-Android:core"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class ServerEntry {
    private final String description;
    private final boolean hidden;
    private final String icon;
    private final String ip;
    private final String name;
    private final String port;

    public static /* synthetic */ ServerEntry copy$default(ServerEntry serverEntry, String str, String str2, String str3, String str4, String str5, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = serverEntry.name;
        }
        if ((i & 2) != 0) {
            str2 = serverEntry.ip;
        }
        if ((i & 4) != 0) {
            str3 = serverEntry.port;
        }
        if ((i & 8) != 0) {
            str4 = serverEntry.icon;
        }
        if ((i & 16) != 0) {
            str5 = serverEntry.description;
        }
        if ((i & 32) != 0) {
            z = serverEntry.hidden;
        }
        String str6 = str5;
        boolean z2 = z;
        return serverEntry.copy(str, str2, str3, str4, str6, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component2, reason: from getter */
    public final String getIp() {
        return this.ip;
    }

    /* renamed from: component3, reason: from getter */
    public final String getPort() {
        return this.port;
    }

    /* renamed from: component4, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    /* renamed from: component5, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getHidden() {
        return this.hidden;
    }

    public final ServerEntry copy(String name, String ip, String port, String icon, String description, boolean hidden) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(ip, "ip");
        Intrinsics.checkNotNullParameter(port, "port");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(description, "description");
        return new ServerEntry(name, ip, port, icon, description, hidden);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ServerEntry)) {
            return false;
        }
        ServerEntry serverEntry = (ServerEntry) other;
        return Intrinsics.areEqual(this.name, serverEntry.name) && Intrinsics.areEqual(this.ip, serverEntry.ip) && Intrinsics.areEqual(this.port, serverEntry.port) && Intrinsics.areEqual(this.icon, serverEntry.icon) && Intrinsics.areEqual(this.description, serverEntry.description) && this.hidden == serverEntry.hidden;
    }

    public int hashCode() {
        return (((((((((this.name.hashCode() * 31) + this.ip.hashCode()) * 31) + this.port.hashCode()) * 31) + this.icon.hashCode()) * 31) + this.description.hashCode()) * 31) + Boolean.hashCode(this.hidden);
    }

    public String toString() {
        return "ServerEntry(name=" + this.name + ", ip=" + this.ip + ", port=" + this.port + ", icon=" + this.icon + ", description=" + this.description + ", hidden=" + this.hidden + ")";
    }

    public ServerEntry(String name, String ip, String port, String icon, String description, boolean hidden) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(ip, "ip");
        Intrinsics.checkNotNullParameter(port, "port");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(description, "description");
        this.name = name;
        this.ip = ip;
        this.port = port;
        this.icon = icon;
        this.description = description;
        this.hidden = hidden;
    }

    public /* synthetic */ ServerEntry(String str, String str2, String str3, String str4, String str5, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? false : z);
    }

    public final String getDescription() {
        return this.description;
    }

    public final boolean getHidden() {
        return this.hidden;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final String getIp() {
        return this.ip;
    }

    public final String getName() {
        return this.name;
    }

    public final String getPort() {
        return this.port;
    }

    public final String getAddress() {
        if ((this.port.length() == 0) || Intrinsics.areEqual(this.port, "25565")) {
            return this.ip;
        }
        return this.ip + ":" + this.port;
    }
}
