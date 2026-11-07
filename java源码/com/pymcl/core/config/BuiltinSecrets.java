package com.pymcl.core.config;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* compiled from: ConfigStore.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/pymcl/core/config/BuiltinSecrets;", "", "<init>", "()V", "CF", "", "curseforgeKey", "", "getCurseforgeKey", "()Ljava/lang/String;", "curseforgeKey$delegate", "Lkotlin/Lazy;", "PyMCL-Android:core"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class BuiltinSecrets {
    public static final BuiltinSecrets INSTANCE = new BuiltinSecrets();
    private static final int[] CF = {105, 127, 44, 105, 124, 125, 105, 34, 117, 61, 52, 42, 29, 63, 37, 59, 6, 15, 5, 56, 56, 37, 120, 36, 32, 1, 127, 26, 99, 1, 14, 3, 11, 37, 15, 124, 120, 55, 15, 20, 12, 8, 53, 21, 53, 98, 25, 60, 25, 53, 98, 23, 61, 120, 61, 53, 127, 33, 53, 56};

    /* renamed from: curseforgeKey$delegate, reason: from kotlin metadata */
    private static final Lazy curseforgeKey = LazyKt.lazy(new Function0() { // from class: com.pymcl.core.config.BuiltinSecrets$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return BuiltinSecrets.curseforgeKey_delegate$lambda$0();
        }
    });

    private BuiltinSecrets() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String curseforgeKey_delegate$lambda$0() {
        int length = CF.length;
        char[] cArr = new char[length];
        for (int i = 0; i < length; i++) {
            cArr[i] = (char) (CF[i] ^ 77);
        }
        return new String(cArr);
    }

    public final String getCurseforgeKey() {
        return (String) curseforgeKey.getValue();
    }
}
