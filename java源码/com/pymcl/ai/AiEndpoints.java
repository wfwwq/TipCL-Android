package com.pymcl.ai;

import java.util.LinkedHashMap;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.apache.commons.io.IOUtils;

/* compiled from: AiSettings.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005J\u000e\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005J\u000e\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u0005J$\u0010\u000b\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\fj\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005`\rH\u0002J\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0010\u001a\u00020\u0011J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0010\u001a\u00020\u0011¨\u0006\u0014"}, d2 = {"Lcom/pymcl/ai/AiEndpoints;", "", "<init>", "()V", "normalizeBase", "", "u", "withScheme", "hostOf", "isBuiltinHost", "", "baseHeaders", "Ljava/util/LinkedHashMap;", "Lkotlin/collections/LinkedHashMap;", "resolve", "Lcom/pymcl/ai/AiEndpoint;", "st", "Lcom/pymcl/ai/AiSettings;", "validate", "keyHint", "PyMCL-Android:ai"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AiEndpoints {
    public static final AiEndpoints INSTANCE = new AiEndpoints();

    private AiEndpoints() {
    }

    public final String normalizeBase(String u) {
        Intrinsics.checkNotNullParameter(u, "u");
        String s = withScheme(u);
        if (s.length() == 0) {
            return s;
        }
        String s2 = StringsKt.trimEnd(StringsKt.removeSuffix(StringsKt.removeSuffix(s, (CharSequence) "/chat/completions"), (CharSequence) "/models"), IOUtils.DIR_SEPARATOR_UNIX);
        return !new Regex("/v\\d+[a-z]*$").containsMatchIn(s2) ? s2 + "/v1" : s2;
    }

    public final String withScheme(String u) {
        Intrinsics.checkNotNullParameter(u, "u");
        String s = StringsKt.trimEnd(StringsKt.trim((CharSequence) u).toString(), IOUtils.DIR_SEPARATOR_UNIX);
        if (s.length() == 0) {
            return s;
        }
        String lower = s.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lower, "toLowerCase(...)");
        if (StringsKt.startsWith$default(lower, "http://", false, 2, (Object) null)) {
            String strSubstring = s.substring(7);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            return "http://" + strSubstring;
        }
        if (StringsKt.startsWith$default(lower, "https://", false, 2, (Object) null)) {
            String strSubstring2 = s.substring(8);
            Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
            return "https://" + strSubstring2;
        }
        return "https://" + s;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String hostOf(java.lang.String r6) {
        /*
            r5 = this;
            java.lang.String r0 = ""
            java.lang.String r1 = "u"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r1)
            kotlin.Result$Companion r1 = kotlin.Result.INSTANCE     // Catch: java.lang.Throwable -> L2f
            r1 = r5
            com.pymcl.ai.AiEndpoints r1 = (com.pymcl.ai.AiEndpoints) r1     // Catch: java.lang.Throwable -> L2f
            r2 = 0
            java.net.URI r3 = new java.net.URI     // Catch: java.lang.Throwable -> L2f
            java.lang.String r4 = r1.withScheme(r6)     // Catch: java.lang.Throwable -> L2f
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L2f
            java.lang.String r3 = r3.getHost()     // Catch: java.lang.Throwable -> L2f
            if (r3 == 0) goto L29
            java.util.Locale r4 = java.util.Locale.ROOT     // Catch: java.lang.Throwable -> L2f
            java.lang.String r3 = r3.toLowerCase(r4)     // Catch: java.lang.Throwable -> L2f
            java.lang.String r4 = "toLowerCase(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)     // Catch: java.lang.Throwable -> L2f
            if (r3 != 0) goto L2a
        L29:
            r3 = r0
        L2a:
            java.lang.Object r1 = kotlin.Result.m8116constructorimpl(r3)     // Catch: java.lang.Throwable -> L2f
            goto L3a
        L2f:
            r1 = move-exception
            kotlin.Result$Companion r2 = kotlin.Result.INSTANCE
            java.lang.Object r1 = kotlin.ResultKt.createFailure(r1)
            java.lang.Object r1 = kotlin.Result.m8116constructorimpl(r1)
        L3a:
            boolean r2 = kotlin.Result.m8122isFailureimpl(r1)
            if (r2 == 0) goto L41
            goto L42
        L41:
            r0 = r1
        L42:
            java.lang.String r0 = (java.lang.String) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.ai.AiEndpoints.hostOf(java.lang.String):java.lang.String");
    }

    public final boolean isBuiltinHost(String u) {
        Intrinsics.checkNotNullParameter(u, "u");
        return !StringsKt.isBlank(u) && Intrinsics.areEqual(hostOf(u), hostOf(Builtin.INSTANCE.getGatewayUrl()));
    }

    private final LinkedHashMap<String, String> baseHeaders() {
        return MapsKt.linkedMapOf(TuplesKt.to("X-PyMCL-Client", "PyMCL/1.0.1"));
    }

    public final AiEndpoint resolve(AiSettings st) {
        Intrinsics.checkNotNullParameter(st, "st");
        String strNormalize = AiMode.INSTANCE.normalize(st.getMode());
        if (Intrinsics.areEqual(strNormalize, AiMode.BUILTIN)) {
            String base = Builtin.INSTANCE.getApiBase();
            return new AiEndpoint(base + "/chat/completions", base + "/models", MapsKt.plus(baseHeaders(), TuplesKt.to("Authorization", "Bearer " + Builtin.INSTANCE.getApiKey())), true, AiMode.BUILTIN, null, false, true, 96, null);
        }
        if (Intrinsics.areEqual(strNormalize, AiMode.GATEWAY)) {
            String gw = withScheme(st.getGatewayUrl());
            if (gw.length() == 0) {
                return new AiEndpoint("", "", MapsKt.emptyMap(), false, AiMode.GATEWAY, AiText.INSTANCE.t("自建 AI 网关需要填写网关地址", new Object[0]), false, false, 192, null);
            }
            LinkedHashMap h = baseHeaders();
            String it = StringsKt.trim((CharSequence) st.getGatewayKey()).toString();
            if (!(it.length() > 0)) {
                it = null;
            }
            if (it != null) {
                h.put("Authorization", "Bearer " + it);
            }
            return new AiEndpoint(gw + "/pymcl/chat", gw + "/pymcl/models", h, false, AiMode.GATEWAY, null, false, false, 160, null);
        }
        String base2 = normalizeBase(st.getBaseUrl());
        if (base2.length() == 0) {
            return new AiEndpoint("", "", MapsKt.emptyMap(), false, AiMode.CUSTOM, AiText.INSTANCE.t("自定义端点需要填写端点地址（或改用内置公益网关）", new Object[0]), false, false, 192, null);
        }
        String userKey = StringsKt.trim((CharSequence) st.getApiKey()).toString();
        boolean builtinBase = isBuiltinHost(base2) && (Intrinsics.areEqual(base2, Builtin.INSTANCE.getApiBase()) || Intrinsics.areEqual(base2, StringsKt.replaceFirst$default(Builtin.INSTANCE.getApiBase(), "https://", "http://", false, 4, (Object) null)));
        String apiKey = userKey;
        if (apiKey.length() == 0) {
            apiKey = builtinBase ? Builtin.INSTANCE.getApiKey() : "";
        }
        String key = apiKey;
        LinkedHashMap h2 = baseHeaders();
        if (key.length() > 0) {
            h2.put("Authorization", "Bearer " + key);
        }
        return new AiEndpoint(base2 + "/chat/completions", base2 + "/models", h2, false, AiMode.CUSTOM, null, false, (userKey.length() == 0) && builtinBase, 32, null);
    }

    public final String validate(AiSettings st) {
        Intrinsics.checkNotNullParameter(st, "st");
        return resolve(st).getProblem();
    }

    public final String keyHint(AiSettings st) {
        Intrinsics.checkNotNullParameter(st, "st");
        if (Intrinsics.areEqual(AiMode.INSTANCE.normalize(st.getMode()), AiMode.CUSTOM) && StringsKt.isBlank(st.getApiKey()) && !resolve(st).getSendsBuiltinKey() && resolve(st).getProblem() == null) {
            return AiText.INSTANCE.t("未填 API Key：请求将不带鉴权头（本地/免鉴权服务可这样用）", new Object[0]);
        }
        return null;
    }
}
