package com.pymcl.core.auth;

import androidx.autofill.HintConstants;
import com.pymcl.core.account.Account;
import com.pymcl.core.account.AccountType;
import com.pymcl.core.util.JsonKt;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import kotlin.text.StringsKt;

/* compiled from: TokenRevocation.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0005J\u000e\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000fJ \u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00052\b\b\u0002\u0010\u0015\u001a\u00020\u0005J\u001e\u0010\u0016\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0017\u001a\u00020\u000f2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0019R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/pymcl/core/auth/TokenRevocation;", "", "<init>", "()V", "REVOKED", "", "REVOKED_AT", "REVOKED_BY", "CODE", "MESSAGE", "MESSAGE_NO_BY", "formatMessage", "sibling", "revokedMessage", "acc", "Lcom/pymcl/core/account/Account;", "isRevocationLike", "", "httpStatus", "", "error", "errorMessage", "boundSibling", "failed", "all", "", "PyMCL-Android:core"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class TokenRevocation {
    public static final String CODE = "token_revoked_by_binding";
    public static final TokenRevocation INSTANCE = new TokenRevocation();
    public static final String MESSAGE = "该账号的多角色共享令牌已在绑定角色「{0}」时被服务器吊销（Yggdrasil 令牌一次只能绑定一个角色），请重新登录本角色";
    public static final String MESSAGE_NO_BY = "该账号的令牌已被服务器吊销，请重新登录本角色";
    public static final String REVOKED = "token_revoked";
    public static final String REVOKED_AT = "token_revoked_at";
    public static final String REVOKED_BY = "token_revoked_by";

    private TokenRevocation() {
    }

    public final String formatMessage(String sibling) {
        Intrinsics.checkNotNullParameter(sibling, "sibling");
        return StringsKt.replace$default(MESSAGE, "{0}", sibling, false, 4, (Object) null);
    }

    public final String revokedMessage(Account acc) {
        String it;
        Intrinsics.checkNotNullParameter(acc, "acc");
        String it2 = JsonKt.str(acc.getRaw(), REVOKED_BY);
        if (it2 != null) {
            if (!(it2.length() > 0)) {
                it2 = null;
            }
            if (it2 != null && (it = INSTANCE.formatMessage(it2)) != null) {
                return it;
            }
        }
        return MESSAGE_NO_BY;
    }

    public static /* synthetic */ boolean isRevocationLike$default(TokenRevocation tokenRevocation, int i, String str, String str2, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            str2 = "";
        }
        return tokenRevocation.isRevocationLike(i, str, str2);
    }

    public final boolean isRevocationLike(int httpStatus, String error, String errorMessage) {
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        if (httpStatus == 403) {
            return true;
        }
        Iterable $this$any$iv = CollectionsKt.listOf((Object[]) new String[]{error, errorMessage});
        if (($this$any$iv instanceof Collection) && ((Collection) $this$any$iv).isEmpty()) {
            return false;
        }
        for (Object element$iv : $this$any$iv) {
            String it = (String) element$iv;
            if (((StringsKt.equals(it, "ForbiddenOperationException", true) || StringsKt.contains((CharSequence) it, (CharSequence) "forbidden", true) || StringsKt.contains((CharSequence) it, (CharSequence) "invalid token", true) || StringsKt.equals(it, "InvalidToken", true)) ? 1 : null) != null) {
                return true;
            }
        }
        return false;
    }

    public final Account boundSibling(final Account failed, List<Account> all) {
        Intrinsics.checkNotNullParameter(failed, "failed");
        Intrinsics.checkNotNullParameter(all, "all");
        final String user = JsonKt.str(failed.getRaw(), HintConstants.AUTOFILL_HINT_USERNAME);
        Object maxElem$iv = null;
        if (user != null) {
            if (!(user.length() > 0)) {
                user = null;
            }
            if (user != null) {
                final String api = YggdrasilAuth.INSTANCE.normalizeApi(failed.getApi());
                if (!(api.length() > 0)) {
                    api = null;
                }
                if (api == null) {
                    return null;
                }
                Long lM8043long = JsonKt.m8043long(failed.getRaw(), "updated_at");
                final long failedUpdated = lM8043long != null ? lM8043long.longValue() : 0L;
                Sequence $this$maxByOrNull$iv = SequencesKt.filter(SequencesKt.filter(SequencesKt.filter(SequencesKt.filter(SequencesKt.filter(SequencesKt.filter(SequencesKt.filter(CollectionsKt.asSequence(all), new Function1() { // from class: com.pymcl.core.auth.TokenRevocation$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Boolean.valueOf(TokenRevocation.boundSibling$lambda$2(failed, (Account) obj));
                    }
                }), new Function1() { // from class: com.pymcl.core.auth.TokenRevocation$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Boolean.valueOf(TokenRevocation.boundSibling$lambda$3(failed, (Account) obj));
                    }
                }), new Function1() { // from class: com.pymcl.core.auth.TokenRevocation$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Boolean.valueOf(TokenRevocation.boundSibling$lambda$4(api, (Account) obj));
                    }
                }), new Function1() { // from class: com.pymcl.core.auth.TokenRevocation$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Boolean.valueOf(TokenRevocation.boundSibling$lambda$5(user, (Account) obj));
                    }
                }), new Function1() { // from class: com.pymcl.core.auth.TokenRevocation$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Boolean.valueOf(TokenRevocation.boundSibling$lambda$6(failed, (Account) obj));
                    }
                }), new Function1() { // from class: com.pymcl.core.auth.TokenRevocation$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Boolean.valueOf(TokenRevocation.boundSibling$lambda$7((Account) obj));
                    }
                }), new Function1() { // from class: com.pymcl.core.auth.TokenRevocation$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Boolean.valueOf(TokenRevocation.boundSibling$lambda$8(failed, failedUpdated, (Account) obj));
                    }
                });
                Iterator iterator$iv = $this$maxByOrNull$iv.iterator();
                if (iterator$iv.hasNext()) {
                    maxElem$iv = iterator$iv.next();
                    if (iterator$iv.hasNext()) {
                        Account it = (Account) maxElem$iv;
                        Long lM8043long2 = JsonKt.m8043long(it.getRaw(), "updated_at");
                        long maxValue$iv = lM8043long2 != null ? lM8043long2.longValue() : 0L;
                        do {
                            Object e$iv = iterator$iv.next();
                            Account it2 = (Account) e$iv;
                            Long lM8043long3 = JsonKt.m8043long(it2.getRaw(), "updated_at");
                            long v$iv = lM8043long3 != null ? lM8043long3.longValue() : 0L;
                            if (maxValue$iv < v$iv) {
                                maxElem$iv = e$iv;
                                maxValue$iv = v$iv;
                            }
                        } while (iterator$iv.hasNext());
                    }
                }
                return (Account) maxElem$iv;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean boundSibling$lambda$2(Account $failed, Account it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it != $failed;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean boundSibling$lambda$3(Account $failed, Account it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getType() == $failed.getType() && (it.getType() == AccountType.AUTHLIB || it.getType() == AccountType.NIDE8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean boundSibling$lambda$4(String $api, Account it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Intrinsics.areEqual(YggdrasilAuth.INSTANCE.normalizeApi(it.getApi()), $api);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean boundSibling$lambda$5(String $user, Account it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Intrinsics.areEqual(JsonKt.str(it.getRaw(), HintConstants.AUTOFILL_HINT_USERNAME), $user);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean boundSibling$lambda$6(Account $failed, Account it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (it.getUuid().length() > 0) && !Intrinsics.areEqual(it.getUuid(), $failed.getUuid());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean boundSibling$lambda$7(Account it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return !Intrinsics.areEqual(it.getRaw().get(YggdrasilAuth.UNBOUND), (Object) true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean boundSibling$lambda$8(Account account, long $failedUpdated, Account it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (((CharSequence) it.getTargetPeer()).length() > 0) {
            if (!Intrinsics.areEqual(it.getTargetPeer(), account.getTargetPeer())) {
                return true;
            }
            Long lM8043long = JsonKt.m8043long(it.getRaw(), "updated_at");
            if ((lM8043long != null ? lM8043long.longValue() : 0L) > $failedUpdated) {
                return true;
            }
        }
        return false;
    }
}
