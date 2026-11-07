package com.pymcl.ai;

import com.pymcl.runtime.settings.SettingsProtocol;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.apache.commons.io.IOUtils;

/* compiled from: Builtin.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u000e\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\bJ\u000e\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\f\u001a\u00020\b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0011\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u000eR\u001b\u0010\u0013\u001a\u00020\b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0014\u0010\u000eR\u000e\u0010\u0016\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/pymcl/ai/Builtin;", "", "<init>", "()V", "GW", "", "KEY", "dec", "", "a", "x", "", "gatewayUrl", "getGatewayUrl", "()Ljava/lang/String;", "gatewayUrl$delegate", "Lkotlin/Lazy;", "apiBase", "getApiBase", "apiKey", "getApiKey", "apiKey$delegate", "DEFAULT_MODEL", "CLIENT_HEADER", "scrubKey", SettingsProtocol.EXTRA_VALUE, "scrubUrl", "PyMCL-Android:ai"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class Builtin {
    public static final String CLIENT_HEADER = "PyMCL/1.0.1";
    public static final String DEFAULT_MODEL = "deepseek-v4-flash";
    public static final Builtin INSTANCE = new Builtin();
    private static final int[] GW = {50, 46, 46, 42, 41, 96, 117, 117, 52, 63, 45, 116, 105, 43, 116, 50, 59, 51, 40};
    private static final int[] KEY = {68, 92, 26, 64, 116, 0, 7, 110, 86, 3, 125, 98, 98, 94, 100, 93, 71, 97, 123, 92, 121, 113, 113, 83, 120, 6, 97, 85, 99, 65, 91, 89, 123, 124, 85, 6, 88, 96, 94, 127, 125, 112, 69, 97, 96, 6, 0, 2, 127, 85, 66};

    /* renamed from: gatewayUrl$delegate, reason: from kotlin metadata */
    private static final Lazy gatewayUrl = LazyKt.lazy(new Function0() { // from class: com.pymcl.ai.Builtin$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Builtin.gatewayUrl_delegate$lambda$0();
        }
    });

    /* renamed from: apiKey$delegate, reason: from kotlin metadata */
    private static final Lazy apiKey = LazyKt.lazy(new Function0() { // from class: com.pymcl.ai.Builtin$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Builtin.apiKey_delegate$lambda$0();
        }
    });

    private Builtin() {
    }

    private final String dec(int[] a, int x) {
        int length = a.length;
        char[] cArr = new char[length];
        for (int i = 0; i < length; i++) {
            cArr[i] = (char) (a[i] ^ x);
        }
        return new String(cArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String gatewayUrl_delegate$lambda$0() {
        return INSTANCE.dec(GW, 90);
    }

    public final String getGatewayUrl() {
        return (String) gatewayUrl.getValue();
    }

    public final String getApiBase() {
        return getGatewayUrl() + "/v1";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String apiKey_delegate$lambda$0() {
        return INSTANCE.dec(KEY, 55);
    }

    public final String getApiKey() {
        return (String) apiKey.getValue();
    }

    public final String scrubKey(String v) {
        Intrinsics.checkNotNullParameter(v, "v");
        return Intrinsics.areEqual(v, getApiKey()) ? "" : v;
    }

    public final String scrubUrl(String v) {
        Intrinsics.checkNotNullParameter(v, "v");
        return (Intrinsics.areEqual(StringsKt.trimEnd(v, IOUtils.DIR_SEPARATOR_UNIX), getGatewayUrl()) || Intrinsics.areEqual(StringsKt.trimEnd(v, IOUtils.DIR_SEPARATOR_UNIX), getApiBase())) ? "" : v;
    }
}
