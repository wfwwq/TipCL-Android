package com.pymcl.ai;

import androidx.autofill.HintConstants;
import com.pymcl.core.util.Json;
import com.pymcl.core.util.JsonKt;
import java.io.IOException;
import java.net.ConnectException;
import java.net.MalformedURLException;
import java.net.NoRouteToHostException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.DebugKt;

/* compiled from: AiClient.kt */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\u0018\u0000 82\u00020\u0001:\u00018B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u000e\u001a\u00020\u000fJ\u0006\u0010\u0010\u001a\u00020\u000fJ\u0016\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eJ\\\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u001e2\u001e\u0010 \u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u001e\u0012\u0006\u0012\u0004\u0018\u00010\u00010\"j\u0002`#0!2\u0010\u0010$\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010!2\u0006\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010%\u001a\u00020\r2\b\b\u0002\u0010&\u001a\u00020\u001aJp\u0010'\u001a\u00020(2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u001e\u0010 \u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u001e\u0012\u0006\u0012\u0004\u0018\u00010\u00010\"j\u0002`#0!2\u0010\u0010$\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010!2\u0012\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u000f0*2\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u000f0*J6\u0010,\u001a\u00020\u001e2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u001e\u0010 \u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u001e\u0012\u0006\u0012\u0004\u0018\u00010\u00010\"j\u0002`#0!J\u0014\u0010-\u001a\b\u0012\u0004\u0012\u00020\u001e0!2\u0006\u0010\u001b\u001a\u00020\u001cJ\u000e\u0010.\u001a\u00020/2\u0006\u0010\u001b\u001a\u00020\u001cJ\u0014\u00100\u001a\b\u0012\u0004\u0012\u00020\u001e0!2\u0006\u00101\u001a\u00020\u001eJ\u001a\u00102\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u001e032\u0006\u0010\u001b\u001a\u00020\u001cJ\u000e\u00104\u001a\u00020\u001e2\u0006\u00105\u001a\u000206J\u001c\u00107\u001a\u0010\u0012\u0004\u0012\u00020\u001e\u0012\u0006\u0012\u0004\u0018\u00010\u001e032\u0006\u00105\u001a\u000206R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0011\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u00069"}, d2 = {"Lcom/pymcl/ai/AiClient;", "", "http", "Lcom/pymcl/ai/AiHttp;", "<init>", "(Lcom/pymcl/ai/AiHttp;)V", "builtinHttp", "Lcom/pymcl/ai/BuiltinHttpFallback;", "getBuiltinHttp", "()Lcom/pymcl/ai/BuiltinHttpFallback;", "current", "Lcom/pymcl/ai/AiLineStream;", "cancelled", "", "cancel", "", "resetCancel", "isCancelled", "()Z", "rules", "Lcom/pymcl/ai/ModelRules;", "getRules", "()Lcom/pymcl/ai/ModelRules;", "setRules", "(Lcom/pymcl/ai/ModelRules;)V", "capsFor", "Lcom/pymcl/ai/ModelCaps;", "st", "Lcom/pymcl/ai/AiSettings;", "model", "", "buildBody", "messages", "", "", "Lcom/pymcl/core/util/JObj;", "tools", "stream", "caps", "streamChat", "Lcom/pymcl/ai/AssistantTurn;", "onContent", "Lkotlin/Function1;", "onReasoning", "complete", "listModels", "endpoint", "Lcom/pymcl/ai/AiEndpoint;", "parseModels", "txt", "testConnection", "Lkotlin/Pair;", "describeError", "e", "", "describeErrorParts", "Companion", "PyMCL-Android:ai"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AiClient {
    public static final int CONNECT_TIMEOUT = 15000;
    public static final String DETAIL_SEP = "\n详情：";
    public static final int ONESHOT_TIMEOUT = 90000;
    public static final int READ_TIMEOUT = 90000;
    private final BuiltinHttpFallback builtinHttp;
    private volatile boolean cancelled;
    private volatile AiLineStream current;
    private final AiHttp http;
    private volatile ModelRules rules;

    /* JADX WARN: Multi-variable type inference failed */
    public AiClient() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public AiClient(AiHttp http) {
        Intrinsics.checkNotNullParameter(http, "http");
        this.http = http;
        this.builtinHttp = new BuiltinHttpFallback();
        this.rules = ModelRules.INSTANCE.builtin();
    }

    public /* synthetic */ AiClient(UrlConnectionAiHttp urlConnectionAiHttp, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new UrlConnectionAiHttp() : urlConnectionAiHttp);
    }

    public final BuiltinHttpFallback getBuiltinHttp() {
        return this.builtinHttp;
    }

    public final void cancel() {
        Unit unit;
        this.cancelled = true;
        try {
            Result.Companion companion = Result.INSTANCE;
            AiClient $this$cancel_u24lambda_u240 = this;
            AiLineStream aiLineStream = $this$cancel_u24lambda_u240.current;
            if (aiLineStream != null) {
                aiLineStream.close();
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            Result.m8116constructorimpl(unit);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m8116constructorimpl(ResultKt.createFailure(th));
        }
    }

    public final void resetCancel() {
        this.cancelled = false;
    }

    /* renamed from: isCancelled, reason: from getter */
    public final boolean getCancelled() {
        return this.cancelled;
    }

    public final ModelRules getRules() {
        return this.rules;
    }

    public final void setRules(ModelRules modelRules) {
        Intrinsics.checkNotNullParameter(modelRules, "<set-?>");
        this.rules = modelRules;
    }

    public final ModelCaps capsFor(AiSettings st, String model) {
        Intrinsics.checkNotNullParameter(st, "st");
        Intrinsics.checkNotNullParameter(model, "model");
        return this.rules.resolve(model, AiEndpoints.INSTANCE.resolve(st).getChatUrl(), st.getCapsOverrides());
    }

    public static /* synthetic */ String buildBody$default(AiClient aiClient, String str, List list, List list2, AiSettings aiSettings, boolean z, ModelCaps modelCaps, int i, Object obj) {
        if ((i & 16) != 0) {
            z = true;
        }
        boolean z2 = z;
        if ((i & 32) != 0) {
            modelCaps = aiClient.capsFor(aiSettings, str);
        }
        return aiClient.buildBody(str, list, list2, aiSettings, z2, modelCaps);
    }

    public final String buildBody(String model, List<? extends Map<String, Object>> messages, List<? extends Object> tools, AiSettings st, boolean stream, ModelCaps caps) {
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(messages, "messages");
        Intrinsics.checkNotNullParameter(st, "st");
        Intrinsics.checkNotNullParameter(caps, "caps");
        List<? extends Map<String, Object>> $this$map$iv = messages;
        Collection destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10));
        for (Object item$iv$iv : $this$map$iv) {
            Map it = (Map) item$iv$iv;
            destination$iv$iv.add(CapsTrim.INSTANCE.stripImages(it, caps));
        }
        List msgs = (List) destination$iv$iv;
        Map b = JsonKt.jobj(TuplesKt.to("model", model), TuplesKt.to("messages", CollectionsKt.toMutableList((Collection) msgs)), TuplesKt.to("stream", Boolean.valueOf(stream)));
        if (caps.getSupportsTemperature()) {
            b.put("temperature", Double.valueOf(st.getTemperature()));
        }
        b.put("max_tokens", Long.valueOf(CapsTrim.INSTANCE.maxTokens(st, caps)));
        List<? extends Object> list = tools;
        if (!(list == null || list.isEmpty()) && caps.getSupportsTools()) {
            b.put("tools", CollectionsKt.toMutableList((Collection) tools));
            b.put("tool_choice", DebugKt.DEBUG_PROPERTY_VALUE_AUTO);
        }
        if (stream) {
            b.put("stream_options", JsonKt.jobj(TuplesKt.to("include_usage", true)));
        }
        return Json.stringify$default(Json.INSTANCE, b, false, 2, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.pymcl.ai.AssistantTurn streamChat(com.pymcl.ai.AiSettings r17, java.lang.String r18, java.util.List<? extends java.util.Map<java.lang.String, java.lang.Object>> r19, java.util.List<? extends java.lang.Object> r20, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> r21, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> r22) throws com.pymcl.ai.AiConfigException, com.pymcl.ai.AiHttpException {
        /*
            Method dump skipped, instructions count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.ai.AiClient.streamChat(com.pymcl.ai.AiSettings, java.lang.String, java.util.List, java.util.List, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1):com.pymcl.ai.AssistantTurn");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit streamChat$lambda$0(StreamAccumulator $acc, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $acc.accept(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AiLineStream streamChat$lambda$1(AiClient this$0, AiEndpoint $ep, String $body, String u) {
        Intrinsics.checkNotNullParameter(u, "u");
        return this$0.http.postStream(u, $ep.getHeaders(), $body, CONNECT_TIMEOUT, 90000);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String complete(AiSettings st, String model, List<? extends Map<String, Object>> messages) throws AiConfigException, AiHttpException {
        Map<String, Object> mapObj;
        String str;
        Intrinsics.checkNotNullParameter(st, "st");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(messages, "messages");
        final AiEndpoint aiEndpointEndpoint = endpoint(st);
        final String strBuildBody$default = buildBody$default(this, model, messages, null, st, false, null, 32, null);
        String str2 = (String) this.builtinHttp.call(aiEndpointEndpoint, aiEndpointEndpoint.getChatUrl(), new Function1() { // from class: com.pymcl.ai.AiClient$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AiClient.complete$lambda$0(this.f$0, aiEndpointEndpoint, strBuildBody$default, (String) obj);
            }
        });
        Function1 function1 = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        if (!StringsKt.startsWith$default(StringsKt.trimStart((CharSequence) str2).toString(), "data:", false, 2, (Object) null)) {
            Map<String, Object> mapObj2 = Json.INSTANCE.obj(str2);
            Map<String, Object> mapObj3 = JsonKt.obj(mapObj2, "error");
            if (mapObj3 != null) {
                String str3 = JsonKt.str(mapObj3, "message");
                if (str3 == null) {
                    str3 = StringsKt.take(str2, 200);
                }
                throw new AiHttpException(200, str3);
            }
            Map map = (Map) CollectionsKt.firstOrNull((List) JsonKt.objs(JsonKt.arr(mapObj2, "choices")));
            return (map == null || (mapObj = JsonKt.obj(map, "message")) == null || (str = JsonKt.str(mapObj, "content")) == null) ? "" : str;
        }
        final StreamAccumulator streamAccumulator = new StreamAccumulator(function1, objArr2 == true ? 1 : 0, 3, objArr == true ? 1 : 0);
        SseParser sseParser = new SseParser(new Function1() { // from class: com.pymcl.ai.AiClient$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AiClient.complete$lambda$1(streamAccumulator, (String) obj);
            }
        });
        Iterator<T> it = StringsKt.lines(str2).iterator();
        while (it.hasNext()) {
            sseParser.feed((String) it.next());
        }
        sseParser.flush();
        return streamAccumulator.result(model).getContent();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String complete$lambda$0(AiClient this$0, AiEndpoint $ep, String $body, String u) {
        Intrinsics.checkNotNullParameter(u, "u");
        return this$0.http.post(u, $ep.getHeaders(), $body, 90000);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit complete$lambda$1(StreamAccumulator $acc, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $acc.accept(it);
        return Unit.INSTANCE;
    }

    public final List<String> listModels(AiSettings st) throws AiConfigException {
        Intrinsics.checkNotNullParameter(st, "st");
        final AiEndpoint ep = endpoint(st);
        return parseModels((String) this.builtinHttp.call(ep, ep.getModelsUrl(), new Function1() { // from class: com.pymcl.ai.AiClient$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AiClient.listModels$lambda$0(this.f$0, ep, (String) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String listModels$lambda$0(AiClient this$0, AiEndpoint $ep, String u) {
        Intrinsics.checkNotNullParameter(u, "u");
        return this$0.http.get(u, $ep.getHeaders(), CONNECT_TIMEOUT);
    }

    public final AiEndpoint endpoint(AiSettings st) throws AiConfigException {
        Intrinsics.checkNotNullParameter(st, "st");
        AiEndpoint ep = AiEndpoints.INSTANCE.resolve(st);
        String it = ep.getProblem();
        if (it == null) {
            return ep;
        }
        throw new AiConfigException(it);
    }

    public final List<String> parseModels(String txt) throws IOException {
        Iterable arr;
        String t;
        String str;
        Intrinsics.checkNotNullParameter(txt, "txt");
        String t2 = StringsKt.trim((CharSequence) txt).toString();
        if (t2.length() == 0) {
            return CollectionsKt.emptyList();
        }
        if (!StringsKt.startsWith$default(t2, "{", false, 2, (Object) null) && !StringsKt.startsWith$default(t2, "[", false, 2, (Object) null)) {
            throw new IOException(AiText.INSTANCE.t("模型列表不是 JSON（地址可能不对）：{0}", StringsKt.take(t2, 80)));
        }
        Object v = Json.INSTANCE.parse(t2);
        if (v instanceof List) {
            arr = (List) v;
        } else if (v instanceof Map) {
            Object obj = ((Map) v).get("data");
            arr = obj instanceof List ? (List) obj : null;
            if (arr == null) {
                Object obj2 = ((Map) v).get("models");
                arr = obj2 instanceof List ? (List) obj2 : null;
                if (arr == null) {
                    arr = CollectionsKt.emptyList();
                }
            }
        } else {
            arr = CollectionsKt.emptyList();
        }
        Iterable $this$mapNotNull$iv = arr;
        Collection destination$iv$iv = new ArrayList();
        for (Object element$iv$iv$iv : $this$mapNotNull$iv) {
            if (element$iv$iv$iv instanceof String) {
                str = (String) element$iv$iv$iv;
                t = t2;
            } else {
                if (element$iv$iv$iv instanceof Map) {
                    t = t2;
                    Object obj3 = ((Map) element$iv$iv$iv).get("id");
                    if (obj3 == null && (obj3 = ((Map) element$iv$iv$iv).get(HintConstants.AUTOFILL_HINT_NAME)) == null) {
                        obj3 = ((Map) element$iv$iv$iv).get("model");
                    }
                    if (obj3 instanceof String) {
                        str = (String) obj3;
                    }
                } else {
                    t = t2;
                }
                str = null;
            }
            if (str != null) {
                destination$iv$iv.add(str);
            }
            t2 = t;
        }
        Iterable $this$filter$iv = (List) destination$iv$iv;
        Collection destination$iv$iv2 = new ArrayList();
        for (Object element$iv$iv : $this$filter$iv) {
            String it = (String) element$iv$iv;
            if (!StringsKt.isBlank(it)) {
                destination$iv$iv2.add(element$iv$iv);
            }
        }
        return CollectionsKt.distinct((List) destination$iv$iv2);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.Pair<java.lang.Boolean, java.lang.String> testConnection(com.pymcl.ai.AiSettings r28) {
        /*
            Method dump skipped, instructions count: 481
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.ai.AiClient.testConnection(com.pymcl.ai.AiSettings):kotlin.Pair");
    }

    public final String describeError(Throwable e) {
        Intrinsics.checkNotNullParameter(e, "e");
        Pair<String, String> pairDescribeErrorParts = describeErrorParts(e);
        String friendly = pairDescribeErrorParts.component1();
        String detail = pairDescribeErrorParts.component2();
        String str = detail;
        return ((str == null || StringsKt.isBlank(str)) || Intrinsics.areEqual(detail, friendly)) ? friendly : friendly + DETAIL_SEP + detail;
    }

    public final Pair<String, String> describeErrorParts(Throwable e) {
        String strT;
        Intrinsics.checkNotNullParameter(e, "e");
        String message = e.getMessage();
        if (message == null) {
            message = e.toString();
        }
        String raw = StringsKt.take(message, 400);
        if (e instanceof AiConfigException) {
            return TuplesKt.to(raw, null);
        }
        boolean z = false;
        if (e instanceof AiHttpException) {
            int code = ((AiHttpException) e).getCode();
            if (code == 401 || code == 403) {
                strT = AiText.INSTANCE.t("鉴权失败（HTTP {0}），请检查 API Key", Integer.valueOf(((AiHttpException) e).getCode()));
            } else if (code == 404) {
                strT = AiText.INSTANCE.t("接口地址不对（HTTP 404），请检查端点地址", new Object[0]);
            } else if (code == 429) {
                strT = AiText.INSTANCE.t("请求太频繁或额度用完（HTTP 429）", new Object[0]);
            } else {
                if (500 <= code && code < 600) {
                    z = true;
                }
                if (z) {
                    strT = AiText.INSTANCE.t("服务端出错（HTTP {0}）", Integer.valueOf(((AiHttpException) e).getCode()));
                } else {
                    strT = (((AiHttpException) e).getCode() != 200 || StringsKt.isBlank(((AiHttpException) e).getBody())) ? "HTTP " + ((AiHttpException) e).getCode() : AiText.INSTANCE.t("服务端返回错误：{0}", StringsKt.take(((AiHttpException) e).getBody(), 200));
                }
            }
            return TuplesKt.to(strT, ((AiHttpException) e).getCode() != 200 ? raw : null);
        }
        if (NetErrors.INSTANCE.isTls(e)) {
            return TuplesKt.to(AiText.INSTANCE.t("无法建立安全连接（HTTPS/TLS 握手失败），可尝试改用 http:// 地址", new Object[0]), raw);
        }
        if (NetErrors.INSTANCE.isCleartextBlocked(e)) {
            return TuplesKt.to(AiText.INSTANCE.t("系统拒绝了明文 HTTP 连接，请改用 https:// 地址", new Object[0]), raw);
        }
        if (e instanceof SocketTimeoutException) {
            return TuplesKt.to(AiText.INSTANCE.t("连接超时", new Object[0]), raw);
        }
        if (e instanceof UnknownHostException) {
            AiText aiText = AiText.INSTANCE;
            String message2 = e.getMessage();
            if (message2 == null) {
                message2 = "";
            }
            return TuplesKt.to(aiText.t("无法解析域名：{0}", message2), null);
        }
        if ((e instanceof ConnectException) || (e instanceof NoRouteToHostException)) {
            return TuplesKt.to(AiText.INSTANCE.t("连不上服务器，请检查地址、端口和网络", new Object[0]), raw);
        }
        if ((e instanceof MalformedURLException) || (e instanceof IllegalArgumentException)) {
            return TuplesKt.to(AiText.INSTANCE.t("地址格式不对，请检查端点地址", new Object[0]), raw);
        }
        return TuplesKt.to(raw, null);
    }
}
