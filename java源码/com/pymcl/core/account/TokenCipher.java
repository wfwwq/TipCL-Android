package com.pymcl.core.account;

import kotlin.Metadata;

/* compiled from: Accounts.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0003H&J\u0012\u0010\b\u001a\u0004\u0018\u00010\u00032\u0006\u0010\t\u001a\u00020\u0003H&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lcom/pymcl/core/account/TokenCipher;", "", "prefix", "", "getPrefix", "()Ljava/lang/String;", "encrypt", "plain", "decrypt", "stored", "PyMCL-Android:core"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface TokenCipher {
    String decrypt(String stored);

    String encrypt(String plain);

    String getPrefix();
}
