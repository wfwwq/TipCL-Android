package com.pymcl.ai;

import com.pymcl.ai.McpHttp;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* compiled from: Mcp.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J>\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\f\u001a\u00020\rH\u0016¨\u0006\u000e"}, d2 = {"Lcom/pymcl/ai/UrlConnectionMcpHttp;", "Lcom/pymcl/ai/McpHttp;", "<init>", "()V", "request", "Lcom/pymcl/ai/McpHttp$Resp;", "method", "", "url", "headers", "", "body", "timeoutMs", "", "PyMCL-Android:ai"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class UrlConnectionMcpHttp implements McpHttp {
    @Override // com.pymcl.ai.McpHttp
    public McpHttp.Resp request(String method, String url, Map<String, String> headers, String body, int timeoutMs) throws IOException {
        InputStream stream;
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(headers, "headers");
        URLConnection uRLConnectionOpenConnection = new URL(url).openConnection();
        Intrinsics.checkNotNull(uRLConnectionOpenConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
        final HttpURLConnection $this$request_u24lambda_u240 = (HttpURLConnection) uRLConnectionOpenConnection;
        $this$request_u24lambda_u240.setRequestMethod(method);
        $this$request_u24lambda_u240.setConnectTimeout(AiClient.CONNECT_TIMEOUT);
        $this$request_u24lambda_u240.setReadTimeout(timeoutMs);
        $this$request_u24lambda_u240.setInstanceFollowRedirects(true);
        $this$request_u24lambda_u240.setRequestProperty("User-Agent", "PyMCL/1.0.1");
        for (Map.Entry element$iv : headers.entrySet()) {
            String k = element$iv.getKey();
            String v = element$iv.getValue();
            $this$request_u24lambda_u240.setRequestProperty(k, v);
        }
        if (body != null) {
            $this$request_u24lambda_u240.setDoOutput(true);
            $this$request_u24lambda_u240.setRequestProperty("Content-Type", "application/json");
            OutputStream outputStream = $this$request_u24lambda_u240.getOutputStream();
            try {
                OutputStream it = outputStream;
                byte[] bytes = body.getBytes(Charsets.UTF_8);
                Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
                it.write(bytes);
                Unit unit = Unit.INSTANCE;
                CloseableKt.closeFinally(outputStream, null);
            } finally {
            }
        }
        int code = $this$request_u24lambda_u240.getResponseCode();
        Map $this$filterKeys$iv = $this$request_u24lambda_u240.getHeaderFields();
        Intrinsics.checkNotNullExpressionValue($this$filterKeys$iv, "getHeaderFields(...)");
        LinkedHashMap result$iv = new LinkedHashMap();
        for (Map.Entry entry$iv : $this$filterKeys$iv.entrySet()) {
            String it2 = entry$iv.getKey();
            if (it2 != null) {
                result$iv.put(entry$iv.getKey(), entry$iv.getValue());
            }
        }
        LinkedHashMap $this$mapKeys$iv = result$iv;
        Map destination$iv$iv = new LinkedHashMap(MapsKt.mapCapacity($this$mapKeys$iv.size()));
        Iterable $this$associateByTo$iv$iv$iv = $this$mapKeys$iv.entrySet();
        for (Object element$iv$iv$iv : $this$associateByTo$iv$iv$iv) {
            Map.Entry it3 = (Map.Entry) element$iv$iv$iv;
            Object key = it3.getKey();
            Intrinsics.checkNotNullExpressionValue(key, "<get-key>(...)");
            String lowerCase = ((String) key).toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            Map.Entry it$iv$iv = (Map.Entry) element$iv$iv$iv;
            destination$iv$iv.put(lowerCase, it$iv$iv.getValue());
        }
        Map destination$iv$iv2 = new LinkedHashMap(MapsKt.mapCapacity(destination$iv$iv.size()));
        Iterable $this$associateByTo$iv$iv$iv2 = destination$iv$iv.entrySet();
        for (Object element$iv$iv$iv2 : $this$associateByTo$iv$iv$iv2) {
            Map.Entry it$iv$iv2 = (Map.Entry) element$iv$iv$iv2;
            Object key2 = it$iv$iv2.getKey();
            Map.Entry it4 = (Map.Entry) element$iv$iv$iv2;
            Object value = it4.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "<get-value>(...)");
            String str = (String) CollectionsKt.firstOrNull((List) value);
            if (str == null) {
                str = "";
            }
            destination$iv$iv2.put(key2, str);
        }
        if ((200 <= code && code < 300) || (stream = $this$request_u24lambda_u240.getErrorStream()) == null) {
            stream = $this$request_u24lambda_u240.getInputStream();
        }
        final BufferedReader r = new BufferedReader(new InputStreamReader(stream, Charsets.UTF_8));
        String contentType = $this$request_u24lambda_u240.getContentType();
        if (contentType == null) {
            contentType = "";
        }
        return new McpHttp.Resp(code, destination$iv$iv2, contentType, new AiLineStream() { // from class: com.pymcl.ai.UrlConnectionMcpHttp.request.2
            @Override // com.pymcl.ai.AiLineStream
            public String readLine() {
                return r.readLine();
            }

            @Override // java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                BufferedReader bufferedReader = r;
                try {
                    Result.Companion companion = Result.INSTANCE;
                    AnonymousClass2 anonymousClass2 = this;
                    bufferedReader.close();
                    Result.m8116constructorimpl(Unit.INSTANCE);
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.INSTANCE;
                    Result.m8116constructorimpl(ResultKt.createFailure(th));
                }
                $this$request_u24lambda_u240.disconnect();
            }
        });
    }
}
