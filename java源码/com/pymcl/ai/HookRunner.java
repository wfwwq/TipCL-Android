package com.pymcl.ai;

import androidx.core.app.NotificationCompat;
import com.pymcl.core.util.Json;
import com.pymcl.core.util.JsonKt;
import com.pymcl.runtime.process.JavaProcessService;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.SetsKt;
import kotlin.io.ByteStreamsKt;
import kotlin.io.CloseableKt;
import kotlin.io.FilesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* compiled from: Hooks.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000bj\u0002`\rH\u0002J0\u0010\u000f\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000bj\u0002`\r0\u00102\u0006\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\fH\u0002JD\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\f2\u0018\u0010\u0019\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000bj\u0002`\r2\u0006\u0010\u001a\u001a\u00020\f2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R.\u0010\b\u001a\"\u0012\u0004\u0012\u00020\n\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000bj\u0002`\r\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0013\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001d"}, d2 = {"Lcom/pymcl/ai/HookRunner;", "", "configFile", "Ljava/io/File;", "http", "Lcom/pymcl/ai/HookHttp;", "<init>", "(Ljava/io/File;Lcom/pymcl/ai/HookHttp;)V", "cached", "Lkotlin/Pair;", "", "", "", "Lcom/pymcl/core/util/JObj;", "config", "entriesFor", "", NotificationCompat.CATEGORY_EVENT, "tool", "hasAny", "", "getHasAny", "()Z", "run", "Lcom/pymcl/ai/HookOutcome;", JavaProcessService.EXTRA_ARGS, "chatId", "response", "Companion", "PyMCL-Android:ai"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HookRunner {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Set<String> SUPPORTED_EVENTS = SetsKt.setOf((Object[]) new String[]{"PreToolUse", "PostToolUse"});
    private volatile Pair<Long, ? extends Map<String, Object>> cached;
    private final File configFile;
    private final HookHttp http;

    /* compiled from: Hooks.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J2\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\f2\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0010"}, d2 = {"Lcom/pymcl/ai/HookRunner$Companion;", "", "<init>", "()V", "SUPPORTED_EVENTS", "", "", "getSUPPORTED_EVENTS", "()Ljava/util/Set;", "defaultPost", "url", "headers", "", "body", "timeoutMs", "", "PyMCL-Android:ai"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Set<String> getSUPPORTED_EVENTS() {
            return HookRunner.SUPPORTED_EVENTS;
        }

        public final String defaultPost(String url, Map<String, String> headers, String body, int timeoutMs) throws IOException {
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(headers, "headers");
            Intrinsics.checkNotNullParameter(body, "body");
            URLConnection uRLConnectionOpenConnection = new URL(url).openConnection();
            Intrinsics.checkNotNull(uRLConnectionOpenConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
            HttpURLConnection c = (HttpURLConnection) uRLConnectionOpenConnection;
            c.setRequestMethod("POST");
            c.setConnectTimeout(timeoutMs);
            c.setReadTimeout(timeoutMs);
            boolean z = true;
            c.setDoOutput(true);
            c.setRequestProperty("Content-Type", "application/json; charset=utf-8");
            for (Map.Entry element$iv : headers.entrySet()) {
                String k = element$iv.getKey();
                String v = element$iv.getValue();
                c.setRequestProperty(k, v);
            }
            try {
                OutputStream outputStream = c.getOutputStream();
                try {
                    OutputStream it = outputStream;
                    byte[] bytes = body.getBytes(Charsets.UTF_8);
                    Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
                    it.write(bytes);
                    Unit unit = Unit.INSTANCE;
                    CloseableKt.closeFinally(outputStream, null);
                    int responseCode = c.getResponseCode();
                    if (200 > responseCode || responseCode >= 300) {
                        z = false;
                    }
                    if (!z) {
                        throw new IOException("HTTP " + c.getResponseCode());
                    }
                    InputStream inputStream = c.getInputStream();
                    Intrinsics.checkNotNullExpressionValue(inputStream, "getInputStream(...)");
                    return new String(ByteStreamsKt.readBytes(inputStream), Charsets.UTF_8);
                } finally {
                }
            } finally {
                c.disconnect();
            }
        }
    }

    public HookRunner(File configFile, HookHttp http) {
        Intrinsics.checkNotNullParameter(configFile, "configFile");
        Intrinsics.checkNotNullParameter(http, "http");
        this.configFile = configFile;
        this.http = http;
    }

    public /* synthetic */ HookRunner(File file, HookHttp hookHttp, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(file, (i & 2) != 0 ? new HookHttp() { // from class: com.pymcl.ai.HookRunner$$ExternalSyntheticLambda0
            @Override // com.pymcl.ai.HookHttp
            public final String post(String str, Map map, String str2, int i2) {
                return HookRunner._init_$lambda$0(str, map, str2, i2);
            }
        } : hookHttp);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _init_$lambda$0(String u, Map h, String b, int t) {
        Intrinsics.checkNotNullParameter(u, "u");
        Intrinsics.checkNotNullParameter(h, "h");
        Intrinsics.checkNotNullParameter(b, "b");
        return INSTANCE.defaultPost(u, h, b, t);
    }

    private final Map<String, Object> config() {
        Object objM8116constructorimpl;
        if (!this.configFile.isFile()) {
            return JsonKt.jobj(new Pair[0]);
        }
        long m = this.configFile.lastModified();
        Pair it = this.cached;
        if (it != null && it.getFirst().longValue() == m) {
            return it.getSecond();
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            HookRunner $this$config_u24lambda_u241 = this;
            objM8116constructorimpl = Result.m8116constructorimpl(Json.INSTANCE.obj(FilesKt.readText$default($this$config_u24lambda_u241.configFile, null, 1, null)));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM8116constructorimpl = Result.m8116constructorimpl(ResultKt.createFailure(th));
        }
        Map<String, Object> mapJobj = JsonKt.jobj(new Pair[0]);
        if (Result.m8122isFailureimpl(objM8116constructorimpl)) {
            objM8116constructorimpl = mapJobj;
        }
        Map o = (Map) objM8116constructorimpl;
        this.cached = TuplesKt.to(Long.valueOf(m), o);
        return o;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00de A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.util.List<java.util.Map<java.lang.String, java.lang.Object>> entriesFor(java.lang.String r21, java.lang.String r22) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.ai.HookRunner.entriesFor(java.lang.String, java.lang.String):java.util.List");
    }

    public final boolean getHasAny() {
        Iterable $this$any$iv = SUPPORTED_EVENTS;
        if (($this$any$iv instanceof Collection) && ((Collection) $this$any$iv).isEmpty()) {
            return false;
        }
        for (Object element$iv : $this$any$iv) {
            String e = (String) element$iv;
            Map<String, Object> mapObj = JsonKt.obj(config(), "hooks");
            if (mapObj == null) {
                mapObj = config();
            }
            if (!JsonKt.objs(JsonKt.arr(mapObj, e)).isEmpty()) {
                return true;
            }
        }
        return false;
    }

    public static /* synthetic */ HookOutcome run$default(HookRunner hookRunner, String str, String str2, Map map, String str3, String str4, int i, Object obj) {
        if ((i & 16) != 0) {
            str4 = null;
        }
        return hookRunner.run(str, str2, map, str3, str4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0391 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.pymcl.ai.HookOutcome run(java.lang.String r34, java.lang.String r35, java.util.Map<java.lang.String, java.lang.Object> r36, java.lang.String r37, java.lang.String r38) {
        /*
            Method dump skipped, instructions count: 1100
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.ai.HookRunner.run(java.lang.String, java.lang.String, java.util.Map, java.lang.String, java.lang.String):com.pymcl.ai.HookOutcome");
    }
}
