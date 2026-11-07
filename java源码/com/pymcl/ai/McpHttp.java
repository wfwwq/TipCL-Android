package com.pymcl.ai;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Mcp.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\fJ>\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\b2\b\u0010\t\u001a\u0004\u0018\u00010\u00052\u0006\u0010\n\u001a\u00020\u000bH&¨\u0006\rÀ\u0006\u0003"}, d2 = {"Lcom/pymcl/ai/McpHttp;", "", "request", "Lcom/pymcl/ai/McpHttp$Resp;", "method", "", "url", "headers", "", "body", "timeoutMs", "", "Resp", "PyMCL-Android:ai"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface McpHttp {
    Resp request(String method, String url, Map<String, String> headers, String body, int timeoutMs);

    /* compiled from: Mcp.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/pymcl/ai/McpHttp$Resp;", "", "code", "", "headers", "", "", "contentType", "lines", "Lcom/pymcl/ai/AiLineStream;", "<init>", "(ILjava/util/Map;Ljava/lang/String;Lcom/pymcl/ai/AiLineStream;)V", "getCode", "()I", "getHeaders", "()Ljava/util/Map;", "getContentType", "()Ljava/lang/String;", "getLines", "()Lcom/pymcl/ai/AiLineStream;", "PyMCL-Android:ai"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class Resp {
        private final int code;
        private final String contentType;
        private final Map<String, String> headers;
        private final AiLineStream lines;

        public Resp(int code, Map<String, String> headers, String contentType, AiLineStream lines) {
            Intrinsics.checkNotNullParameter(headers, "headers");
            Intrinsics.checkNotNullParameter(contentType, "contentType");
            Intrinsics.checkNotNullParameter(lines, "lines");
            this.code = code;
            this.headers = headers;
            this.contentType = contentType;
            this.lines = lines;
        }

        public final int getCode() {
            return this.code;
        }

        public final String getContentType() {
            return this.contentType;
        }

        public final Map<String, String> getHeaders() {
            return this.headers;
        }

        public final AiLineStream getLines() {
            return this.lines;
        }
    }
}
