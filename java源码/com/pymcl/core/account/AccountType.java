package com.pymcl.core.account;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Accounts.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000eB\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000f"}, d2 = {"Lcom/pymcl/core/account/AccountType;", "", "id", "", "userType", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getUserType", "OFFLINE", "MICROSOFT", "AUTHLIB", "NIDE8", "Companion", "PyMCL-Android:core"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes16.dex */
public enum AccountType {
    OFFLINE("offline", "legacy"),
    MICROSOFT("microsoft", "msa"),
    AUTHLIB("authlib", "mojang"),
    NIDE8("nide8", "mojang");

    private final String id;
    private final String userType;
    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries($VALUES);

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    public static EnumEntries<AccountType> getEntries() {
        return $ENTRIES;
    }

    AccountType(String id, String userType) {
        this.id = id;
        this.userType = userType;
    }

    public final String getId() {
        return this.id;
    }

    public final String getUserType() {
        return this.userType;
    }

    /* compiled from: Accounts.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¨\u0006\b"}, d2 = {"Lcom/pymcl/core/account/AccountType$Companion;", "", "<init>", "()V", "of", "Lcom/pymcl/core/account/AccountType;", "s", "", "PyMCL-Android:core"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Companion() {
        }

        public final AccountType of(String s) {
            Object element$iv;
            Iterable $this$firstOrNull$iv = AccountType.getEntries();
            Iterator<AccountType> it = $this$firstOrNull$iv.iterator();
            while (true) {
                if (it.hasNext()) {
                    element$iv = it.next();
                    AccountType it2 = (AccountType) element$iv;
                    if (Intrinsics.areEqual(it2.getId(), s)) {
                        break;
                    }
                } else {
                    element$iv = null;
                    break;
                }
            }
            AccountType accountType = (AccountType) element$iv;
            return accountType == null ? AccountType.OFFLINE : accountType;
        }
    }
}
