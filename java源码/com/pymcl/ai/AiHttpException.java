package com.pymcl.ai;

import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: Transport.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/pymcl/ai/AiHttpException;", "Ljava/io/IOException;", "code", "", "body", "", "<init>", "(ILjava/lang/String;)V", "getCode", "()I", "getBody", "()Ljava/lang/String;", "PyMCL-Android:ai"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AiHttpException extends IOException {
    private final String body;
    private final int code;

    /* JADX WARN: Illegal instructions before constructor call */
    public AiHttpException(int code, String body) {
        String str;
        Intrinsics.checkNotNullParameter(body, "body");
        if (StringsKt.isBlank(body)) {
            str = "";
        } else {
            str = ": " + StringsKt.take(body, 300);
        }
        super("HTTP " + code + str);
        this.code = code;
        this.body = body;
    }

    public final String getBody() {
        return this.body;
    }

    public final int getCode() {
        return this.code;
    }
}
