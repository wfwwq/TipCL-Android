package com.pymcl.core.account;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: Accounts.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005H\u0016J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000b\u001a\u00020\u0005H\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\f"}, d2 = {"Lcom/pymcl/core/account/PlainTokenCipher;", "Lcom/pymcl/core/account/TokenCipher;", "<init>", "()V", "prefix", "", "getPrefix", "()Ljava/lang/String;", "encrypt", "plain", "decrypt", "stored", "PyMCL-Android:core"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class PlainTokenCipher implements TokenCipher {
    public static final PlainTokenCipher INSTANCE = new PlainTokenCipher();
    private static final String prefix = "";

    private PlainTokenCipher() {
    }

    @Override // com.pymcl.core.account.TokenCipher
    public String getPrefix() {
        return prefix;
    }

    @Override // com.pymcl.core.account.TokenCipher
    public String encrypt(String plain) {
        Intrinsics.checkNotNullParameter(plain, "plain");
        return plain;
    }

    @Override // com.pymcl.core.account.TokenCipher
    public String decrypt(String stored) {
        Intrinsics.checkNotNullParameter(stored, "stored");
        if (StringsKt.startsWith$default(stored, "dpapi:", false, 2, (Object) null) || StringsKt.startsWith$default(stored, "keyring:", false, 2, (Object) null) || StringsKt.startsWith$default(stored, "unavailable:", false, 2, (Object) null) || StringsKt.startsWith$default(stored, "aks:", false, 2, (Object) null)) {
            return null;
        }
        return stored;
    }
}
