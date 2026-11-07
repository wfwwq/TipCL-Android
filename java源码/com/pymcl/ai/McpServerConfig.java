package com.pymcl.ai;

import androidx.autofill.HintConstants;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Mcp.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001a\b\u0086\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\u0015\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0007HÆ\u0003J\t\u0010\u001e\u001a\u00020\tHÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\fHÆ\u0003J[\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001J\u0014\u0010\"\u001a\u00020\t2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010$\u001a\u00020\fHÖ\u0081\u0004J\n\u0010%\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u001d\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006&"}, d2 = {"Lcom/pymcl/ai/McpServerConfig;", "", HintConstants.AUTOFILL_HINT_NAME, "", ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "url", "headers", "", "enabled", "", "command", "timeoutMs", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/lang/String;I)V", "getName", "()Ljava/lang/String;", "getType", "getUrl", "getHeaders", "()Ljava/util/Map;", "getEnabled", "()Z", "getCommand", "getTimeoutMs", "()I", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "toString", "PyMCL-Android:ai"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class McpServerConfig {
    private final String command;
    private final boolean enabled;
    private final Map<String, String> headers;
    private final String name;
    private final int timeoutMs;
    private final String type;
    private final String url;

    public static /* synthetic */ McpServerConfig copy$default(McpServerConfig mcpServerConfig, String str, String str2, String str3, Map map, boolean z, String str4, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = mcpServerConfig.name;
        }
        if ((i2 & 2) != 0) {
            str2 = mcpServerConfig.type;
        }
        if ((i2 & 4) != 0) {
            str3 = mcpServerConfig.url;
        }
        if ((i2 & 8) != 0) {
            map = mcpServerConfig.headers;
        }
        if ((i2 & 16) != 0) {
            z = mcpServerConfig.enabled;
        }
        if ((i2 & 32) != 0) {
            str4 = mcpServerConfig.command;
        }
        if ((i2 & 64) != 0) {
            i = mcpServerConfig.timeoutMs;
        }
        String str5 = str4;
        int i3 = i;
        boolean z2 = z;
        String str6 = str3;
        return mcpServerConfig.copy(str, str2, str6, map, z2, str5, i3);
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
    public final String getUrl() {
        return this.url;
    }

    public final Map<String, String> component4() {
        return this.headers;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    /* renamed from: component6, reason: from getter */
    public final String getCommand() {
        return this.command;
    }

    /* renamed from: component7, reason: from getter */
    public final int getTimeoutMs() {
        return this.timeoutMs;
    }

    public final McpServerConfig copy(String name, String type, String url, Map<String, String> headers, boolean enabled, String command, int timeoutMs) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(command, "command");
        return new McpServerConfig(name, type, url, headers, enabled, command, timeoutMs);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof McpServerConfig)) {
            return false;
        }
        McpServerConfig mcpServerConfig = (McpServerConfig) other;
        return Intrinsics.areEqual(this.name, mcpServerConfig.name) && Intrinsics.areEqual(this.type, mcpServerConfig.type) && Intrinsics.areEqual(this.url, mcpServerConfig.url) && Intrinsics.areEqual(this.headers, mcpServerConfig.headers) && this.enabled == mcpServerConfig.enabled && Intrinsics.areEqual(this.command, mcpServerConfig.command) && this.timeoutMs == mcpServerConfig.timeoutMs;
    }

    public int hashCode() {
        return (((((((((((this.name.hashCode() * 31) + this.type.hashCode()) * 31) + this.url.hashCode()) * 31) + this.headers.hashCode()) * 31) + Boolean.hashCode(this.enabled)) * 31) + this.command.hashCode()) * 31) + Integer.hashCode(this.timeoutMs);
    }

    public String toString() {
        return "McpServerConfig(name=" + this.name + ", type=" + this.type + ", url=" + this.url + ", headers=" + this.headers + ", enabled=" + this.enabled + ", command=" + this.command + ", timeoutMs=" + this.timeoutMs + ")";
    }

    public McpServerConfig(String name, String type, String url, Map<String, String> headers, boolean enabled, String command, int timeoutMs) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(command, "command");
        this.name = name;
        this.type = type;
        this.url = url;
        this.headers = headers;
        this.enabled = enabled;
        this.command = command;
        this.timeoutMs = timeoutMs;
    }

    public /* synthetic */ McpServerConfig(String str, String str2, String str3, Map map, boolean z, String str4, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, map, z, (i2 & 32) != 0 ? "" : str4, (i2 & 64) != 0 ? 60000 : i);
    }

    public final String getCommand() {
        return this.command;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final Map<String, String> getHeaders() {
        return this.headers;
    }

    public final String getName() {
        return this.name;
    }

    public final int getTimeoutMs() {
        return this.timeoutMs;
    }

    public final String getType() {
        return this.type;
    }

    public final String getUrl() {
        return this.url;
    }
}
