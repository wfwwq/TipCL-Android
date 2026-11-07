package com.pymcl.core.account;

import androidx.autofill.HintConstants;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import com.pymcl.core.util.JsonKt;
import com.pymcl.runtime.input.InputSettings;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Accounts.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0018\u0010\u0002\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0003j\u0002`\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010'\u001a\u00020(2\b\b\u0002\u0010)\u001a\u00020 J\u001b\u0010*\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0003j\u0002`\u0005HÆ\u0003J%\u0010+\u001a\u00020\u00002\u001a\b\u0002\u0010\u0002\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0003j\u0002`\u0005HÆ\u0001J\u0014\u0010,\u001a\u00020(2\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010.\u001a\u00020/HÖ\u0081\u0004J\n\u00100\u001a\u00020\u0004HÖ\u0081\u0004R#\u0010\u0002\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0003j\u0002`\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\u0013\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0010R\u0011\u0010\u0015\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0010R\u0011\u0010\u0017\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0010R\u0011\u0010\u0019\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0010R\u0011\u0010\u001b\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0010R\u0011\u0010\u001d\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0010R\u0011\u0010\u001f\u001a\u00020 8F¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0011\u0010#\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b$\u0010\u0010R\u0011\u0010%\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b&\u0010\u0010¨\u00061"}, d2 = {"Lcom/pymcl/core/account/Account;", "", "raw", "", "", "Lcom/pymcl/core/util/JObj;", "<init>", "(Ljava/util/Map;)V", "getRaw", "()Ljava/util/Map;", ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "Lcom/pymcl/core/account/AccountType;", "getType", "()Lcom/pymcl/core/account/AccountType;", HintConstants.AUTOFILL_HINT_NAME, "getName", "()Ljava/lang/String;", "uuid", "getUuid", "accessToken", "getAccessToken", "refreshToken", "getRefreshToken", "clientToken", "getClientToken", "xuid", "getXuid", "api", "getApi", "nide8Id", "getNide8Id", "expiresAt", "", "getExpiresAt", "()J", "skin", "getSkin", "key", "getKey", "needsRefresh", "", "nowSec", "component1", "copy", "equals", "other", "hashCode", "", "toString", "PyMCL-Android:core"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class Account {
    private final Map<String, Object> raw;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Account copy$default(Account account, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            map = account.raw;
        }
        return account.copy(map);
    }

    public final Map<String, Object> component1() {
        return this.raw;
    }

    public final Account copy(Map<String, Object> raw) {
        Intrinsics.checkNotNullParameter(raw, "raw");
        return new Account(raw);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof Account) && Intrinsics.areEqual(this.raw, ((Account) other).raw);
    }

    public int hashCode() {
        return this.raw.hashCode();
    }

    public String toString() {
        return "Account(raw=" + this.raw + ")";
    }

    public Account(Map<String, Object> raw) {
        Intrinsics.checkNotNullParameter(raw, "raw");
        this.raw = raw;
    }

    public final Map<String, Object> getRaw() {
        return this.raw;
    }

    public final AccountType getType() {
        return AccountType.INSTANCE.of(JsonKt.str(this.raw, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY));
    }

    public final String getName() {
        String str = JsonKt.str(this.raw, HintConstants.AUTOFILL_HINT_NAME);
        return str == null ? "" : str;
    }

    public final String getUuid() {
        String str = JsonKt.str(this.raw, "uuid");
        return str == null ? Offline.INSTANCE.uuidFor(getName()) : str;
    }

    public final String getAccessToken() {
        String str = JsonKt.str(this.raw, "access_token");
        return str == null ? "" : str;
    }

    public final String getRefreshToken() {
        String str = JsonKt.str(this.raw, "refresh_token");
        return str == null ? "" : str;
    }

    public final String getClientToken() {
        String str = JsonKt.str(this.raw, "client_token");
        return str == null ? "" : str;
    }

    public final String getXuid() {
        String str = JsonKt.str(this.raw, "xuid");
        return str == null ? "" : str;
    }

    public final String getApi() {
        String str = JsonKt.str(this.raw, "api");
        return str == null ? "" : str;
    }

    public final String getNide8Id() {
        String str = JsonKt.str(this.raw, "nide8_id");
        if (str != null) {
            return str;
        }
        String str2 = JsonKt.str(this.raw, "server_id");
        return str2 == null ? "" : str2;
    }

    public final long getExpiresAt() {
        Long lM8043long = JsonKt.m8043long(this.raw, "expires_at");
        if (lM8043long != null) {
            return lM8043long.longValue();
        }
        return 0L;
    }

    public final String getSkin() {
        String str = JsonKt.str(this.raw, "skin");
        return str == null ? InputSettings.DEFAULT_LAYOUT : str;
    }

    public final String getKey() {
        return getType().getId() + ":" + getName() + (getApi().length() > 0 ? ":" + getApi() : "");
    }

    public static /* synthetic */ boolean needsRefresh$default(Account account, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = System.currentTimeMillis() / 1000;
        }
        return account.needsRefresh(j);
    }

    public final boolean needsRefresh(long nowSec) {
        if (getType() != AccountType.MICROSOFT) {
            return false;
        }
        long expiresAt = getExpiresAt();
        return (1L > expiresAt ? 1 : (1L == expiresAt ? 0 : -1)) <= 0 && (expiresAt > nowSec ? 1 : (expiresAt == nowSec ? 0 : -1)) <= 0;
    }
}
