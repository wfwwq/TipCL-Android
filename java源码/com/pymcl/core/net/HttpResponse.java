package com.pymcl.core.net;

import com.pymcl.multiplayer.TerracottaVpnService;
import com.pymcl.runtime.settings.SettingsProtocol;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* compiled from: Http.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0014\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/pymcl/core/net/HttpResponse;", "", "code", "", "headers", "", "", "body", "", "<init>", "(ILjava/util/Map;[B)V", "getCode", "()I", "getHeaders", "()Ljava/util/Map;", "getBody", "()[B", TerracottaVpnService.EXTRA_TEXT, "getText", "()Ljava/lang/String;", SettingsProtocol.EXTRA_OK, "", "getOk", "()Z", "PyMCL-Android:core"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class HttpResponse {
    private final byte[] body;
    private final int code;
    private final Map<String, String> headers;

    public HttpResponse(int code, Map<String, String> headers, byte[] body) {
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(body, "body");
        this.code = code;
        this.headers = headers;
        this.body = body;
    }

    public final byte[] getBody() {
        return this.body;
    }

    public final int getCode() {
        return this.code;
    }

    public final Map<String, String> getHeaders() {
        return this.headers;
    }

    public final String getText() {
        return new String(this.body, Charsets.UTF_8);
    }

    public final boolean getOk() {
        int i = this.code;
        return 200 <= i && i < 300;
    }
}
