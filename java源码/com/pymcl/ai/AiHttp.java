package com.pymcl.ai;

import com.pymcl.runtime.settings.SettingsProtocol;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: Transport.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J@\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00072\u0006\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\nH&J6\u0010\f\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00072\u0006\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\nH&J.\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00072\b\b\u0002\u0010\r\u001a\u00020\nH&¨\u0006\u000fÀ\u0006\u0003"}, d2 = {"Lcom/pymcl/ai/AiHttp;", "", "postStream", "Lcom/pymcl/ai/AiLineStream;", "url", "", "headers", "", "body", "connectTimeoutMs", "", "readTimeoutMs", "post", "timeoutMs", SettingsProtocol.GET, "PyMCL-Android:ai"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface AiHttp {
    String get(String url, Map<String, String> headers, int timeoutMs);

    String post(String url, Map<String, String> headers, String body, int timeoutMs);

    AiLineStream postStream(String url, Map<String, String> headers, String body, int connectTimeoutMs, int readTimeoutMs);

    /* compiled from: Transport.kt */
    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    public static final class DefaultImpls {
    }

    static /* synthetic */ AiLineStream postStream$default(AiHttp aiHttp, String str, Map map, String str2, int i, int i2, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: postStream");
        }
        if ((i3 & 8) != 0) {
            i = AiClient.CONNECT_TIMEOUT;
        }
        int i4 = i;
        if ((i3 & 16) != 0) {
            i2 = 90000;
        }
        return aiHttp.postStream(str, map, str2, i4, i2);
    }

    static /* synthetic */ String post$default(AiHttp aiHttp, String str, Map map, String str2, int i, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: post");
        }
        if ((i2 & 8) != 0) {
            i = 90000;
        }
        return aiHttp.post(str, map, str2, i);
    }

    static /* synthetic */ String get$default(AiHttp aiHttp, String str, Map map, int i, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: get");
        }
        if ((i2 & 4) != 0) {
            i = AiClient.CONNECT_TIMEOUT;
        }
        return aiHttp.get(str, map, i);
    }
}
