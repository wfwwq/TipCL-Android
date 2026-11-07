package com.pymcl.ai;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AiSettings.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001d\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B]\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\b\b\u0002\u0010\f\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\u0015\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0006HÆ\u0003J\t\u0010\u001d\u001a\u00020\bHÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010 \u001a\u00020\bHÆ\u0003J\t\u0010!\u001a\u00020\bHÆ\u0003Jg\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\bHÆ\u0001J\u0014\u0010#\u001a\u00020\b2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010%\u001a\u00020&HÖ\u0081\u0004J\n\u0010'\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u001d\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010R\u0011\u0010\u000b\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0011\u0010\f\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015¨\u0006("}, d2 = {"Lcom/pymcl/ai/AiEndpoint;", "", "chatUrl", "", "modelsUrl", "headers", "", "usesBuiltin", "", "mode", "problem", "builtinHost", "sendsBuiltinKey", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/lang/String;Ljava/lang/String;ZZ)V", "getChatUrl", "()Ljava/lang/String;", "getModelsUrl", "getHeaders", "()Ljava/util/Map;", "getUsesBuiltin", "()Z", "getMode", "getProblem", "getBuiltinHost", "getSendsBuiltinKey", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "", "toString", "PyMCL-Android:ai"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class AiEndpoint {
    private final boolean builtinHost;
    private final String chatUrl;
    private final Map<String, String> headers;
    private final String mode;
    private final String modelsUrl;
    private final String problem;
    private final boolean sendsBuiltinKey;
    private final boolean usesBuiltin;

    public static /* synthetic */ AiEndpoint copy$default(AiEndpoint aiEndpoint, String str, String str2, Map map, boolean z, String str3, String str4, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = aiEndpoint.chatUrl;
        }
        if ((i & 2) != 0) {
            str2 = aiEndpoint.modelsUrl;
        }
        if ((i & 4) != 0) {
            map = aiEndpoint.headers;
        }
        if ((i & 8) != 0) {
            z = aiEndpoint.usesBuiltin;
        }
        if ((i & 16) != 0) {
            str3 = aiEndpoint.mode;
        }
        if ((i & 32) != 0) {
            str4 = aiEndpoint.problem;
        }
        if ((i & 64) != 0) {
            z2 = aiEndpoint.builtinHost;
        }
        if ((i & 128) != 0) {
            z3 = aiEndpoint.sendsBuiltinKey;
        }
        boolean z4 = z2;
        boolean z5 = z3;
        String str5 = str3;
        String str6 = str4;
        return aiEndpoint.copy(str, str2, map, z, str5, str6, z4, z5);
    }

    /* renamed from: component1, reason: from getter */
    public final String getChatUrl() {
        return this.chatUrl;
    }

    /* renamed from: component2, reason: from getter */
    public final String getModelsUrl() {
        return this.modelsUrl;
    }

    public final Map<String, String> component3() {
        return this.headers;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getUsesBuiltin() {
        return this.usesBuiltin;
    }

    /* renamed from: component5, reason: from getter */
    public final String getMode() {
        return this.mode;
    }

    /* renamed from: component6, reason: from getter */
    public final String getProblem() {
        return this.problem;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getBuiltinHost() {
        return this.builtinHost;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getSendsBuiltinKey() {
        return this.sendsBuiltinKey;
    }

    public final AiEndpoint copy(String chatUrl, String modelsUrl, Map<String, String> headers, boolean usesBuiltin, String mode, String problem, boolean builtinHost, boolean sendsBuiltinKey) {
        Intrinsics.checkNotNullParameter(chatUrl, "chatUrl");
        Intrinsics.checkNotNullParameter(modelsUrl, "modelsUrl");
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(mode, "mode");
        return new AiEndpoint(chatUrl, modelsUrl, headers, usesBuiltin, mode, problem, builtinHost, sendsBuiltinKey);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AiEndpoint)) {
            return false;
        }
        AiEndpoint aiEndpoint = (AiEndpoint) other;
        return Intrinsics.areEqual(this.chatUrl, aiEndpoint.chatUrl) && Intrinsics.areEqual(this.modelsUrl, aiEndpoint.modelsUrl) && Intrinsics.areEqual(this.headers, aiEndpoint.headers) && this.usesBuiltin == aiEndpoint.usesBuiltin && Intrinsics.areEqual(this.mode, aiEndpoint.mode) && Intrinsics.areEqual(this.problem, aiEndpoint.problem) && this.builtinHost == aiEndpoint.builtinHost && this.sendsBuiltinKey == aiEndpoint.sendsBuiltinKey;
    }

    public int hashCode() {
        return (((((((((((((this.chatUrl.hashCode() * 31) + this.modelsUrl.hashCode()) * 31) + this.headers.hashCode()) * 31) + Boolean.hashCode(this.usesBuiltin)) * 31) + this.mode.hashCode()) * 31) + (this.problem == null ? 0 : this.problem.hashCode())) * 31) + Boolean.hashCode(this.builtinHost)) * 31) + Boolean.hashCode(this.sendsBuiltinKey);
    }

    public String toString() {
        return "AiEndpoint(chatUrl=" + this.chatUrl + ", modelsUrl=" + this.modelsUrl + ", headers=" + this.headers + ", usesBuiltin=" + this.usesBuiltin + ", mode=" + this.mode + ", problem=" + this.problem + ", builtinHost=" + this.builtinHost + ", sendsBuiltinKey=" + this.sendsBuiltinKey + ")";
    }

    public AiEndpoint(String chatUrl, String modelsUrl, Map<String, String> headers, boolean usesBuiltin, String mode, String problem, boolean builtinHost, boolean sendsBuiltinKey) {
        Intrinsics.checkNotNullParameter(chatUrl, "chatUrl");
        Intrinsics.checkNotNullParameter(modelsUrl, "modelsUrl");
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(mode, "mode");
        this.chatUrl = chatUrl;
        this.modelsUrl = modelsUrl;
        this.headers = headers;
        this.usesBuiltin = usesBuiltin;
        this.mode = mode;
        this.problem = problem;
        this.builtinHost = builtinHost;
        this.sendsBuiltinKey = sendsBuiltinKey;
    }

    public /* synthetic */ AiEndpoint(String str, String str2, Map map, boolean z, String str3, String str4, boolean z2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, map, z, (i & 16) != 0 ? AiMode.CUSTOM : str3, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? z : z2, (i & 128) != 0 ? false : z3);
    }

    public final String getChatUrl() {
        return this.chatUrl;
    }

    public final Map<String, String> getHeaders() {
        return this.headers;
    }

    public final String getModelsUrl() {
        return this.modelsUrl;
    }

    public final boolean getUsesBuiltin() {
        return this.usesBuiltin;
    }

    public final boolean getBuiltinHost() {
        return this.builtinHost;
    }

    public final String getMode() {
        return this.mode;
    }

    public final String getProblem() {
        return this.problem;
    }

    public final boolean getSendsBuiltinKey() {
        return this.sendsBuiltinKey;
    }
}
