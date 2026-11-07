package com.pymcl.ai;

import com.pymcl.runtime.settings.SettingsProtocol;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.io.ByteStreamsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.apache.commons.lang3.concurrent.AbstractCircuitBreaker;

/* compiled from: Transport.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J<\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0002J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0007H\u0002J\u0010\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0005H\u0002J<\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0006\u001a\u00020\u00072\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\n2\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\fH\u0016J4\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00072\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\n2\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\fH\u0016J,\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00072\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\n2\u0006\u0010\u0018\u001a\u00020\fH\u0016¨\u0006\u001a"}, d2 = {"Lcom/pymcl/ai/UrlConnectionAiHttp;", "Lcom/pymcl/ai/AiHttp;", "<init>", "()V", AbstractCircuitBreaker.PROPERTY_NAME, "Ljava/net/HttpURLConnection;", "url", "", "method", "headers", "", "cto", "", "rto", "send", "", "c", "body", "check", "postStream", "Lcom/pymcl/ai/AiLineStream;", "connectTimeoutMs", "readTimeoutMs", "post", "timeoutMs", SettingsProtocol.GET, "PyMCL-Android:ai"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class UrlConnectionAiHttp implements AiHttp {
    private final HttpURLConnection open(String url, String method, Map<String, String> headers, int cto, int rto) throws IOException {
        URLConnection uRLConnectionOpenConnection = new URL(url).openConnection();
        Intrinsics.checkNotNull(uRLConnectionOpenConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
        HttpURLConnection $this$open_u24lambda_u240 = (HttpURLConnection) uRLConnectionOpenConnection;
        $this$open_u24lambda_u240.setRequestMethod(method);
        $this$open_u24lambda_u240.setConnectTimeout(cto);
        $this$open_u24lambda_u240.setReadTimeout(rto);
        $this$open_u24lambda_u240.setInstanceFollowRedirects(true);
        $this$open_u24lambda_u240.setRequestProperty("User-Agent", "PyMCL/1.0.1");
        for (Map.Entry element$iv : headers.entrySet()) {
            String k = element$iv.getKey();
            String v = element$iv.getValue();
            $this$open_u24lambda_u240.setRequestProperty(k, v);
        }
        return $this$open_u24lambda_u240;
    }

    private final void send(HttpURLConnection c, String body) {
        c.setDoOutput(true);
        c.setRequestProperty("Content-Type", "application/json; charset=utf-8");
        OutputStream outputStream = c.getOutputStream();
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

    private final void check(HttpURLConnection c) throws IOException {
        Object objM8116constructorimpl;
        int code = c.getResponseCode();
        boolean z = false;
        if (200 <= code && code < 300) {
            z = true;
        }
        if (!z) {
            try {
                Result.Companion companion = Result.INSTANCE;
                UrlConnectionAiHttp urlConnectionAiHttp = this;
                InputStream errorStream = c.getErrorStream();
                if (errorStream == null) {
                    errorStream = c.getInputStream();
                }
                Intrinsics.checkNotNull(errorStream);
                objM8116constructorimpl = Result.m8116constructorimpl(new String(ByteStreamsKt.readBytes(errorStream), Charsets.UTF_8));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                objM8116constructorimpl = Result.m8116constructorimpl(ResultKt.createFailure(th));
            }
            if (Result.m8122isFailureimpl(objM8116constructorimpl)) {
                objM8116constructorimpl = "";
            }
            String err = (String) objM8116constructorimpl;
            c.disconnect();
            throw new AiHttpException(code, err);
        }
    }

    @Override // com.pymcl.ai.AiHttp
    public AiLineStream postStream(String url, Map<String, String> headers, String body, int connectTimeoutMs, int readTimeoutMs) throws IOException {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(body, "body");
        final HttpURLConnection c = open(url, "POST", MapsKt.plus(headers, TuplesKt.to("Accept", "text/event-stream")), connectTimeoutMs, readTimeoutMs);
        send(c, body);
        check(c);
        final BufferedReader r = new BufferedReader(new InputStreamReader(c.getInputStream(), Charsets.UTF_8));
        return new AiLineStream() { // from class: com.pymcl.ai.UrlConnectionAiHttp.postStream.1
            @Override // com.pymcl.ai.AiLineStream
            public String readLine() {
                return r.readLine();
            }

            @Override // java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                BufferedReader bufferedReader = r;
                try {
                    Result.Companion companion = Result.INSTANCE;
                    AnonymousClass1 anonymousClass1 = this;
                    bufferedReader.close();
                    Result.m8116constructorimpl(Unit.INSTANCE);
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.INSTANCE;
                    Result.m8116constructorimpl(ResultKt.createFailure(th));
                }
                c.disconnect();
            }
        };
    }

    @Override // com.pymcl.ai.AiHttp
    public String post(String url, Map<String, String> headers, String body, int timeoutMs) throws IOException {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(body, "body");
        HttpURLConnection c = open(url, "POST", headers, AiClient.CONNECT_TIMEOUT, timeoutMs);
        try {
            send(c, body);
            check(c);
            InputStream inputStream = c.getInputStream();
            Intrinsics.checkNotNullExpressionValue(inputStream, "getInputStream(...)");
            return new String(ByteStreamsKt.readBytes(inputStream), Charsets.UTF_8);
        } finally {
            c.disconnect();
        }
    }

    @Override // com.pymcl.ai.AiHttp
    public String get(String url, Map<String, String> headers, int timeoutMs) throws IOException {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(headers, "headers");
        HttpURLConnection c = open(url, "GET", headers, timeoutMs, timeoutMs);
        try {
            check(c);
            InputStream inputStream = c.getInputStream();
            Intrinsics.checkNotNullExpressionValue(inputStream, "getInputStream(...)");
            return new String(ByteStreamsKt.readBytes(inputStream), Charsets.UTF_8);
        } finally {
            c.disconnect();
        }
    }
}
