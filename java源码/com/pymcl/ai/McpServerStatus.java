package com.pymcl.ai;

import androidx.autofill.HintConstants;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import com.pymcl.runtime.settings.SettingsProtocol;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Mcp.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0015\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\tHÆ\u0003J;\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0014\u0010\u001a\u001a\u00020\u00062\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001c\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\u001d\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001e"}, d2 = {"Lcom/pymcl/ai/McpServerStatus;", "", HintConstants.AUTOFILL_HINT_NAME, "", ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, SettingsProtocol.EXTRA_OK, "", "message", "tools", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;I)V", "getName", "()Ljava/lang/String;", "getType", "getOk", "()Z", "getMessage", "getTools", "()I", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "toString", "PyMCL-Android:ai"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class McpServerStatus {
    private final String message;
    private final String name;
    private final boolean ok;
    private final int tools;
    private final String type;

    public static /* synthetic */ McpServerStatus copy$default(McpServerStatus mcpServerStatus, String str, String str2, boolean z, String str3, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = mcpServerStatus.name;
        }
        if ((i2 & 2) != 0) {
            str2 = mcpServerStatus.type;
        }
        if ((i2 & 4) != 0) {
            z = mcpServerStatus.ok;
        }
        if ((i2 & 8) != 0) {
            str3 = mcpServerStatus.message;
        }
        if ((i2 & 16) != 0) {
            i = mcpServerStatus.tools;
        }
        int i3 = i;
        boolean z2 = z;
        return mcpServerStatus.copy(str, str2, z2, str3, i3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component2, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getOk() {
        return this.ok;
    }

    /* renamed from: component4, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* renamed from: component5, reason: from getter */
    public final int getTools() {
        return this.tools;
    }

    public final McpServerStatus copy(String name, String type, boolean ok, String message, int tools) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(message, "message");
        return new McpServerStatus(name, type, ok, message, tools);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof McpServerStatus)) {
            return false;
        }
        McpServerStatus mcpServerStatus = (McpServerStatus) other;
        return Intrinsics.areEqual(this.name, mcpServerStatus.name) && Intrinsics.areEqual(this.type, mcpServerStatus.type) && this.ok == mcpServerStatus.ok && Intrinsics.areEqual(this.message, mcpServerStatus.message) && this.tools == mcpServerStatus.tools;
    }

    public int hashCode() {
        return (((((((this.name.hashCode() * 31) + this.type.hashCode()) * 31) + Boolean.hashCode(this.ok)) * 31) + this.message.hashCode()) * 31) + Integer.hashCode(this.tools);
    }

    public String toString() {
        return "McpServerStatus(name=" + this.name + ", type=" + this.type + ", ok=" + this.ok + ", message=" + this.message + ", tools=" + this.tools + ")";
    }

    public McpServerStatus(String name, String type, boolean ok, String message, int tools) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(message, "message");
        this.name = name;
        this.type = type;
        this.ok = ok;
        this.message = message;
        this.tools = tools;
    }

    public final String getMessage() {
        return this.message;
    }

    public final String getName() {
        return this.name;
    }

    public final boolean getOk() {
        return this.ok;
    }

    public final int getTools() {
        return this.tools;
    }

    public final String getType() {
        return this.type;
    }
}
