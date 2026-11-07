package com.pymcl.ai;

import androidx.core.app.NotificationCompat;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: AiClient.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u000b\u001a\u0004\u0018\u00010\nJ\u0006\u0010\f\u001a\u00020\rJ\u0016\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\nJ5\u0010\u0012\u001a\u0002H\u0013\"\u0004\b\u0000\u0010\u00132\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\n2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u0002H\u00130\u0015¢\u0006\u0002\u0010\u0016R\u001e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/pymcl/ai/BuiltinHttpFallback;", "", "<init>", "()V", "value", "", "useHttp", "getUseHttp", "()Z", "notice", "", "takeNotice", "reset", "", "rewrite", "ep", "Lcom/pymcl/ai/AiEndpoint;", "url", NotificationCompat.CATEGORY_CALL, "T", "block", "Lkotlin/Function1;", "(Lcom/pymcl/ai/AiEndpoint;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "PyMCL-Android:ai"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class BuiltinHttpFallback {
    private volatile String notice;
    private volatile boolean useHttp;

    public final boolean getUseHttp() {
        return this.useHttp;
    }

    public final String takeNotice() {
        String n = this.notice;
        this.notice = null;
        return n;
    }

    public final void reset() {
        this.useHttp = false;
        this.notice = null;
    }

    public final String rewrite(AiEndpoint ep, String url) {
        Intrinsics.checkNotNullParameter(ep, "ep");
        Intrinsics.checkNotNullParameter(url, "url");
        if (!ep.getBuiltinHost() || !this.useHttp || !StringsKt.startsWith$default(url, "https://", false, 2, (Object) null)) {
            return url;
        }
        return "http://" + StringsKt.removePrefix(url, (CharSequence) "https://");
    }

    public final <T> T call(AiEndpoint ep, String url, Function1<? super String, ? extends T> block) throws IOException {
        Intrinsics.checkNotNullParameter(ep, "ep");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(block, "block");
        String u = rewrite(ep, url);
        try {
            return block.invoke(u);
        } catch (IOException e) {
            if (!ep.getBuiltinHost() || !StringsKt.startsWith$default(u, "https://", false, 2, (Object) null) || !NetErrors.INSTANCE.isTls(e)) {
                throw e;
            }
            T tInvoke = block.invoke("http://" + StringsKt.removePrefix(u, (CharSequence) "https://"));
            this.useHttp = true;
            this.notice = AiText.INSTANCE.t("内置网关的证书/HTTPS 配置异常，已改用 HTTP 连接", new Object[0]);
            return tInvoke;
        }
    }
}
