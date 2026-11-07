package com.pymcl.core.net;

import com.pymcl.ai.AiClient;
import com.pymcl.core.net.Http;
import com.pymcl.runtime.settings.SettingsProtocol;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Triple;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import org.apache.commons.lang3.CharEncoding;

/* compiled from: Http.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\bf\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016JD\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH&JN\u0010\r\u001a \u0012\u0004\u0012\u00020\f\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0006\u001a\u00020\u00052\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\b2\b\b\u0002\u0010\u000b\u001a\u00020\fH&J0\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\b2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0016J0\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\b2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0016J.\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00052\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\bH\u0016J:\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\b2\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\bH\u0016¨\u0006\u0017À\u0006\u0003"}, d2 = {"Lcom/pymcl/core/net/Http;", "", "request", "Lcom/pymcl/core/net/HttpResponse;", "method", "", "url", "headers", "", "body", "", "timeoutMs", "", "openStream", "Lkotlin/Triple;", "Ljava/io/InputStream;", SettingsProtocol.GET, "getText", "postJson", "json", "postForm", "form", "Companion", "PyMCL-Android:core"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface Http {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    Triple<Integer, Map<String, String>, InputStream> openStream(String url, Map<String, String> headers, int timeoutMs);

    HttpResponse request(String method, String url, Map<String, String> headers, byte[] body, int timeoutMs);

    /* compiled from: Http.kt */
    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        public static HttpResponse get(Http $this, String url, Map<String, String> headers, int timeoutMs) {
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(headers, "headers");
            return Http.super.get(url, headers, timeoutMs);
        }

        @Deprecated
        public static String getText(Http $this, String url, Map<String, String> headers, int timeoutMs) {
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(headers, "headers");
            return Http.super.getText(url, headers, timeoutMs);
        }

        @Deprecated
        public static HttpResponse postJson(Http $this, String url, String json, Map<String, String> headers) {
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(json, "json");
            Intrinsics.checkNotNullParameter(headers, "headers");
            return Http.super.postJson(url, json, headers);
        }

        @Deprecated
        public static HttpResponse postForm(Http $this, String url, Map<String, String> form, Map<String, String> headers) {
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(form, "form");
            Intrinsics.checkNotNullParameter(headers, "headers");
            return Http.super.postForm(url, form, headers);
        }
    }

    static /* synthetic */ HttpResponse request$default(Http http, String str, String str2, Map map, byte[] bArr, int i, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: request");
        }
        if ((i2 & 4) != 0) {
            map = MapsKt.emptyMap();
        }
        Map map2 = map;
        if ((i2 & 8) != 0) {
            bArr = null;
        }
        byte[] bArr2 = bArr;
        if ((i2 & 16) != 0) {
            i = AiClient.CONNECT_TIMEOUT;
        }
        return http.request(str, str2, map2, bArr2, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ Triple openStream$default(Http http, String str, Map map, int i, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: openStream");
        }
        if ((i2 & 2) != 0) {
            map = MapsKt.emptyMap();
        }
        if ((i2 & 4) != 0) {
            i = AiClient.CONNECT_TIMEOUT;
        }
        return http.openStream(str, map, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ HttpResponse get$default(Http http, String str, Map map, int i, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: get");
        }
        if ((i2 & 2) != 0) {
            map = MapsKt.emptyMap();
        }
        if ((i2 & 4) != 0) {
            i = AiClient.CONNECT_TIMEOUT;
        }
        return http.get(str, map, i);
    }

    default HttpResponse get(String url, Map<String, String> headers, int timeoutMs) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(headers, "headers");
        return request("GET", url, headers, null, timeoutMs);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ String getText$default(Http http, String str, Map map, int i, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getText");
        }
        if ((i2 & 2) != 0) {
            map = MapsKt.emptyMap();
        }
        if ((i2 & 4) != 0) {
            i = AiClient.CONNECT_TIMEOUT;
        }
        return http.getText(str, map, i);
    }

    default String getText(String url, Map<String, String> headers, int timeoutMs) throws HttpException {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(headers, "headers");
        HttpResponse r = get(url, headers, timeoutMs);
        if (r.getOk()) {
            return r.getText();
        }
        throw new HttpException(r.getCode(), url, r.getText());
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ HttpResponse postJson$default(Http http, String str, String str2, Map map, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: postJson");
        }
        if ((i & 4) != 0) {
            map = MapsKt.emptyMap();
        }
        return http.postJson(str, str2, map);
    }

    default HttpResponse postJson(String url, String json, Map<String, String> headers) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(headers, "headers");
        Map mapPlus = MapsKt.plus(headers, MapsKt.mapOf(TuplesKt.to("Content-Type", "application/json"), TuplesKt.to("Accept", "application/json")));
        byte[] bytes = json.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        return request$default(this, "POST", url, mapPlus, bytes, 0, 16, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ HttpResponse postForm$default(Http http, String str, Map map, Map map2, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: postForm");
        }
        if ((i & 4) != 0) {
            map2 = MapsKt.emptyMap();
        }
        return http.postForm(str, map, map2);
    }

    default HttpResponse postForm(String url, Map<String, String> form, Map<String, String> headers) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(form, "form");
        Intrinsics.checkNotNullParameter(headers, "headers");
        Map mapPlus = MapsKt.plus(headers, MapsKt.mapOf(TuplesKt.to("Content-Type", "application/x-www-form-urlencoded")));
        byte[] bytes = INSTANCE.formEncode(form).getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        return request$default(this, "POST", url, mapPlus, bytes, 0, 16, null);
    }

    /* compiled from: Http.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0007J\u000e\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005¨\u0006\n"}, d2 = {"Lcom/pymcl/core/net/Http$Companion;", "", "<init>", "()V", "formEncode", "", "m", "", "enc", "s", "PyMCL-Android:core"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final CharSequence formEncode$lambda$0(Map.Entry it) throws UnsupportedEncodingException {
            Intrinsics.checkNotNullParameter(it, "it");
            return URLEncoder.encode((String) it.getKey(), CharEncoding.UTF_8) + "=" + URLEncoder.encode((String) it.getValue(), CharEncoding.UTF_8);
        }

        public final String formEncode(Map<String, String> m) {
            Intrinsics.checkNotNullParameter(m, "m");
            return CollectionsKt.joinToString$default(m.entrySet(), "&", null, null, 0, null, new Function1() { // from class: com.pymcl.core.net.Http$Companion$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Http.Companion.formEncode$lambda$0((Map.Entry) obj);
                }
            }, 30, null);
        }

        public final String enc(String s) throws UnsupportedEncodingException {
            Intrinsics.checkNotNullParameter(s, "s");
            String strEncode = URLEncoder.encode(s, CharEncoding.UTF_8);
            Intrinsics.checkNotNullExpressionValue(strEncode, "encode(...)");
            return StringsKt.replace$default(strEncode, "+", "%20", false, 4, (Object) null);
        }
    }
}
