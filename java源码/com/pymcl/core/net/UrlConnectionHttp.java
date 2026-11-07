package com.pymcl.core.net;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Triple;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.io.ByteStreamsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.apache.commons.lang3.concurrent.AbstractCircuitBreaker;

/* compiled from: Http.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J4\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00032\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002J\u001c\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u000b2\u0006\u0010\u000f\u001a\u00020\u0007H\u0002J>\u0010\u0010\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00032\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u000b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\f\u001a\u00020\rH\u0016JJ\u0010\u0014\u001a \u0012\u0004\u0012\u00020\r\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u000b\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\t\u001a\u00020\u00032\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/pymcl/core/net/UrlConnectionHttp;", "Lcom/pymcl/core/net/Http;", "userAgent", "", "<init>", "(Ljava/lang/String;)V", AbstractCircuitBreaker.PROPERTY_NAME, "Ljava/net/HttpURLConnection;", "method", "url", "headers", "", "timeoutMs", "", "hdrs", "c", "request", "Lcom/pymcl/core/net/HttpResponse;", "body", "", "openStream", "Lkotlin/Triple;", "Ljava/io/InputStream;", "PyMCL-Android:core"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class UrlConnectionHttp implements Http {
    private final String userAgent;

    /* JADX WARN: Multi-variable type inference failed */
    public UrlConnectionHttp() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public UrlConnectionHttp(String userAgent) {
        Intrinsics.checkNotNullParameter(userAgent, "userAgent");
        this.userAgent = userAgent;
    }

    public /* synthetic */ UrlConnectionHttp(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "PyMCL/1.0.1" : str);
    }

    @Override // com.pymcl.core.net.Http
    public /* bridge */ HttpResponse get(String url, Map<String, String> map, int timeoutMs) {
        return super.get(url, map, timeoutMs);
    }

    @Override // com.pymcl.core.net.Http
    public /* bridge */ String getText(String url, Map<String, String> map, int timeoutMs) {
        return super.getText(url, map, timeoutMs);
    }

    @Override // com.pymcl.core.net.Http
    public /* bridge */ HttpResponse postForm(String url, Map<String, String> map, Map<String, String> map2) {
        return super.postForm(url, map, map2);
    }

    @Override // com.pymcl.core.net.Http
    public /* bridge */ HttpResponse postJson(String url, String json, Map<String, String> map) {
        return super.postJson(url, json, map);
    }

    private final HttpURLConnection open(String method, String url, Map<String, String> headers, int timeoutMs) throws IOException {
        URLConnection uRLConnectionOpenConnection = new URL(url).openConnection();
        Intrinsics.checkNotNull(uRLConnectionOpenConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
        HttpURLConnection c = (HttpURLConnection) uRLConnectionOpenConnection;
        c.setRequestMethod(method);
        c.setConnectTimeout(timeoutMs);
        c.setReadTimeout(Math.max(timeoutMs, 30000));
        c.setInstanceFollowRedirects(true);
        c.setRequestProperty("User-Agent", this.userAgent);
        for (Map.Entry element$iv : headers.entrySet()) {
            String k = element$iv.getKey();
            String v = element$iv.getValue();
            c.setRequestProperty(k, v);
        }
        return c;
    }

    private final Map<String, String> hdrs(HttpURLConnection c) {
        Map $this$filterKeys$iv = c.getHeaderFields();
        Intrinsics.checkNotNullExpressionValue($this$filterKeys$iv, "getHeaderFields(...)");
        LinkedHashMap result$iv = new LinkedHashMap();
        for (Map.Entry entry$iv : $this$filterKeys$iv.entrySet()) {
            String it = entry$iv.getKey();
            if (it != null) {
                result$iv.put(entry$iv.getKey(), entry$iv.getValue());
            }
        }
        LinkedHashMap $this$mapKeys$iv = result$iv;
        Map destination$iv$iv = new LinkedHashMap(MapsKt.mapCapacity($this$mapKeys$iv.size()));
        Iterable $this$associateByTo$iv$iv$iv = $this$mapKeys$iv.entrySet();
        for (Object element$iv$iv$iv : $this$associateByTo$iv$iv$iv) {
            Map.Entry it2 = (Map.Entry) element$iv$iv$iv;
            Object key = it2.getKey();
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
            Map.Entry it3 = (Map.Entry) element$iv$iv$iv2;
            Object value = it3.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "<get-value>(...)");
            destination$iv$iv2.put(key2, CollectionsKt.joinToString$default((Iterable) value, ",", null, null, 0, null, null, 62, null));
        }
        return destination$iv$iv2;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x005f A[Catch: all -> 0x006f, TryCatch #4 {all -> 0x006f, blocks: (B:5:0x0018, B:7:0x002a, B:12:0x0031, B:13:0x0034, B:14:0x0035, B:16:0x003d, B:19:0x0048, B:21:0x0052, B:30:0x0062, B:27:0x005b, B:28:0x005e, B:29:0x005f, B:17:0x0042, B:10:0x002f, B:20:0x004a, B:25:0x0059, B:6:0x0021), top: B:44:0x0018, inners: #0, #1, #2, #3 }] */
    @Override // com.pymcl.core.net.Http
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.pymcl.core.net.HttpResponse request(java.lang.String r8, java.lang.String r9, java.util.Map<java.lang.String, java.lang.String> r10, byte[] r11, int r12) throws java.io.IOException {
        /*
            r7 = this;
            java.lang.String r0 = "method"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String r0 = "url"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            java.lang.String r0 = "headers"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            java.net.HttpURLConnection r0 = r7.open(r8, r9, r10, r12)
            r1 = 0
            if (r11 == 0) goto L35
            r2 = 1
            r0.setDoOutput(r2)     // Catch: java.lang.Throwable -> L6f
            java.io.OutputStream r2 = r0.getOutputStream()     // Catch: java.lang.Throwable -> L6f
            java.io.Closeable r2 = (java.io.Closeable) r2     // Catch: java.lang.Throwable -> L6f
            r3 = r2
            java.io.OutputStream r3 = (java.io.OutputStream) r3     // Catch: java.lang.Throwable -> L2e
            r4 = 0
            r3.write(r11)     // Catch: java.lang.Throwable -> L2e
            kotlin.Unit r3 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L2e
            kotlin.io.CloseableKt.closeFinally(r2, r1)     // Catch: java.lang.Throwable -> L6f
            goto L35
        L2e:
            r1 = move-exception
            throw r1     // Catch: java.lang.Throwable -> L30
        L30:
            r3 = move-exception
            kotlin.io.CloseableKt.closeFinally(r2, r1)     // Catch: java.lang.Throwable -> L6f
            throw r3     // Catch: java.lang.Throwable -> L6f
        L35:
            int r2 = r0.getResponseCode()     // Catch: java.lang.Throwable -> L6f
            r3 = 400(0x190, float:5.6E-43)
            if (r2 < r3) goto L42
            java.io.InputStream r3 = r0.getErrorStream()     // Catch: java.lang.Throwable -> L6f
            goto L46
        L42:
            java.io.InputStream r3 = r0.getInputStream()     // Catch: java.lang.Throwable -> L6f
        L46:
            if (r3 == 0) goto L5f
            java.io.Closeable r3 = (java.io.Closeable) r3     // Catch: java.lang.Throwable -> L6f
            r4 = r3
            java.io.InputStream r4 = (java.io.InputStream) r4     // Catch: java.lang.Throwable -> L58
            r5 = 0
            byte[] r6 = kotlin.io.ByteStreamsKt.readBytes(r4)     // Catch: java.lang.Throwable -> L58
            kotlin.io.CloseableKt.closeFinally(r3, r1)     // Catch: java.lang.Throwable -> L6f
            if (r6 != 0) goto L62
            goto L5f
        L58:
            r1 = move-exception
            throw r1     // Catch: java.lang.Throwable -> L5a
        L5a:
            r4 = move-exception
            kotlin.io.CloseableKt.closeFinally(r3, r1)     // Catch: java.lang.Throwable -> L6f
            throw r4     // Catch: java.lang.Throwable -> L6f
        L5f:
            r1 = 0
            byte[] r6 = new byte[r1]     // Catch: java.lang.Throwable -> L6f
        L62:
            com.pymcl.core.net.HttpResponse r1 = new com.pymcl.core.net.HttpResponse     // Catch: java.lang.Throwable -> L6f
            java.util.Map r3 = r7.hdrs(r0)     // Catch: java.lang.Throwable -> L6f
            r1.<init>(r2, r3, r6)     // Catch: java.lang.Throwable -> L6f
            r0.disconnect()
            return r1
        L6f:
            r1 = move-exception
            r0.disconnect()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.core.net.UrlConnectionHttp.request(java.lang.String, java.lang.String, java.util.Map, byte[], int):com.pymcl.core.net.HttpResponse");
    }

    @Override // com.pymcl.core.net.Http
    public Triple<Integer, Map<String, String>, InputStream> openStream(String url, Map<String, String> headers, int timeoutMs) throws IOException {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(headers, "headers");
        HttpURLConnection c = open("GET", url, headers, timeoutMs);
        int code = c.getResponseCode();
        if (code < 400) {
            return new Triple<>(Integer.valueOf(code), hdrs(c), c.getInputStream());
        }
        InputStream errorStream = c.getErrorStream();
        byte[] e = null;
        if (errorStream != null) {
            InputStream inputStream = errorStream;
            try {
                InputStream it = inputStream;
                byte[] bytes = ByteStreamsKt.readBytes(it);
                CloseableKt.closeFinally(inputStream, null);
                e = bytes;
            } finally {
            }
        }
        c.disconnect();
        throw new HttpException(code, url, e != null ? new String(e, Charsets.UTF_8) : "");
    }
}
