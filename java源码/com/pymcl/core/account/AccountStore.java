package com.pymcl.core.account;

import androidx.autofill.HintConstants;
import com.pymcl.core.config.LauncherPaths;
import com.pymcl.core.util.FileUtil;
import com.pymcl.core.util.JsonKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: Accounts.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u0000 !2\u00020\u0001:\u0001!B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u001e\u0010\u000f\u001a\u001a\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\r0\u0010J\u0018\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\r0\u0013J\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\rJ\b\u0010\u0015\u001a\u0004\u0018\u00010\u0011J&\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u000e2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\rH\u0002J\u0018\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00112\b\b\u0002\u0010\u001b\u001a\u00020\u001cJ\u000e\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\u000eJ\u000e\u0010\u001f\u001a\u00020\u00172\u0006\u0010 \u001a\u00020\u000eJ\u000e\u0010\u001f\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lcom/pymcl/core/account/AccountStore;", "", "paths", "Lcom/pymcl/core/config/LauncherPaths;", "cipher", "Lcom/pymcl/core/account/TokenCipher;", "<init>", "(Lcom/pymcl/core/config/LauncherPaths;Lcom/pymcl/core/account/TokenCipher;)V", "getCipher", "()Lcom/pymcl/core/account/TokenCipher;", "setCipher", "(Lcom/pymcl/core/account/TokenCipher;)V", "tokenKeys", "", "", "loadFull", "Lkotlin/Triple;", "Lcom/pymcl/core/account/Account;", "load", "Lkotlin/Pair;", "list", "active", "save", "", "activeKey", "upsert", "acc", "makeActive", "", "remove", "key", "setActive", HintConstants.AUTOFILL_HINT_NAME, "Companion", "PyMCL-Android:core"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class AccountStore {
    public static final String ACTIVE_KEY = "active_key";

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static volatile AccountStore lastInstance;
    private TokenCipher cipher;
    private final LauncherPaths paths;
    private final List<String> tokenKeys;

    /* compiled from: Accounts.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/pymcl/core/account/AccountStore$Companion;", "", "<init>", "()V", "ACTIVE_KEY", "", "lastInstance", "Lcom/pymcl/core/account/AccountStore;", "getLastInstance", "()Lcom/pymcl/core/account/AccountStore;", "setLastInstance", "(Lcom/pymcl/core/account/AccountStore;)V", "PyMCL-Android:core"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final AccountStore getLastInstance() {
            return AccountStore.lastInstance;
        }

        public final void setLastInstance(AccountStore accountStore) {
            AccountStore.lastInstance = accountStore;
        }
    }

    public AccountStore(LauncherPaths paths, TokenCipher cipher) {
        Intrinsics.checkNotNullParameter(paths, "paths");
        Intrinsics.checkNotNullParameter(cipher, "cipher");
        this.paths = paths;
        this.cipher = cipher;
        lastInstance = this;
        this.tokenKeys = CollectionsKt.listOf((Object[]) new String[]{"access_token", "refresh_token"});
    }

    public /* synthetic */ AccountStore(LauncherPaths launcherPaths, PlainTokenCipher plainTokenCipher, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(launcherPaths, (i & 2) != 0 ? PlainTokenCipher.INSTANCE : plainTokenCipher);
    }

    public final TokenCipher getCipher() {
        return this.cipher;
    }

    public final void setCipher(TokenCipher tokenCipher) {
        Intrinsics.checkNotNullParameter(tokenCipher, "<set-?>");
        this.cipher = tokenCipher;
    }

    public final synchronized Triple<String, String, List<Account>> loadFull() {
        List list;
        String str;
        String str2;
        Iterable $this$map$iv;
        int $i$f$map;
        Iterable $this$mapTo$iv$iv;
        Iterable $this$mapTo$iv$iv2;
        String strDecrypt;
        Map o = FileUtil.INSTANCE.readJsonObj(this.paths.getAccountsFile());
        Iterable $this$mapTo$iv$iv3 = null;
        if (o == null) {
            o = JsonKt.jobj(new Pair[0]);
        }
        Iterable $this$map$iv2 = JsonKt.objs(JsonKt.arr(o, "accounts"));
        int $i$f$map2 = 0;
        Collection destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv2, 10));
        Iterable $this$mapTo$iv$iv4 = $this$map$iv2;
        for (Object item$iv$iv : $this$mapTo$iv$iv4) {
            Map a = (Map) item$iv$iv;
            Map m = JsonKt.o(JsonKt.deepCopy(a));
            Intrinsics.checkNotNull(m);
            for (String k : this.tokenKeys) {
                Object obj = m.get(k);
                String v = obj instanceof String ? (String) obj : null;
                if (v != null) {
                    if (this.cipher.getPrefix().length() > 0) {
                        $this$map$iv = $this$map$iv2;
                        $i$f$map = $i$f$map2;
                        $this$mapTo$iv$iv = $this$mapTo$iv$iv4;
                        $this$mapTo$iv$iv2 = null;
                        if (StringsKt.startsWith$default(v, this.cipher.getPrefix(), false, 2, (Object) null)) {
                            strDecrypt = this.cipher.decrypt(v);
                            if (strDecrypt == null) {
                                strDecrypt = "";
                            }
                            m.put(k, strDecrypt);
                            $this$mapTo$iv$iv3 = $this$mapTo$iv$iv2;
                            $this$mapTo$iv$iv4 = $this$mapTo$iv$iv;
                            $this$map$iv2 = $this$map$iv;
                            $i$f$map2 = $i$f$map;
                        }
                    } else {
                        $this$map$iv = $this$map$iv2;
                        $i$f$map = $i$f$map2;
                        $this$mapTo$iv$iv = $this$mapTo$iv$iv4;
                        $this$mapTo$iv$iv2 = null;
                    }
                    strDecrypt = PlainTokenCipher.INSTANCE.decrypt(v);
                    if (strDecrypt == null) {
                        strDecrypt = "";
                    }
                    m.put(k, strDecrypt);
                    $this$mapTo$iv$iv3 = $this$mapTo$iv$iv2;
                    $this$mapTo$iv$iv4 = $this$mapTo$iv$iv;
                    $this$map$iv2 = $this$map$iv;
                    $i$f$map2 = $i$f$map;
                } else {
                    $this$mapTo$iv$iv3 = null;
                    $this$mapTo$iv$iv4 = $this$mapTo$iv$iv4;
                }
            }
            destination$iv$iv.add(new Account(m));
            $this$mapTo$iv$iv3 = $this$mapTo$iv$iv3;
            $this$mapTo$iv$iv4 = $this$mapTo$iv$iv4;
            $this$map$iv2 = $this$map$iv2;
            $i$f$map2 = $i$f$map2;
        }
        list = (List) destination$iv$iv;
        str = JsonKt.str(o, "active");
        if (str == null) {
            str = "";
        }
        str2 = JsonKt.str(o, ACTIVE_KEY);
        if (str2 == null) {
            str2 = "";
        }
        return new Triple<>(str, str2, list);
    }

    public final synchronized Pair<String, List<Account>> load() {
        String n;
        List l;
        Triple<String, String, List<Account>> tripleLoadFull = loadFull();
        n = tripleLoadFull.component1();
        l = tripleLoadFull.component3();
        return TuplesKt.to(n, l);
    }

    public final List<Account> list() {
        return load().getSecond();
    }

    public final Account active() {
        Object element$iv;
        Triple<String, String, List<Account>> tripleLoadFull = loadFull();
        String act = tripleLoadFull.component1();
        String key = tripleLoadFull.component2();
        List l = tripleLoadFull.component3();
        Object obj = null;
        if (key.length() > 0) {
            List $this$firstOrNull$iv = l;
            Iterator it = $this$firstOrNull$iv.iterator();
            while (true) {
                if (!it.hasNext()) {
                    element$iv = null;
                    break;
                }
                element$iv = it.next();
                if (Intrinsics.areEqual(((Account) element$iv).getKey(), key)) {
                    break;
                }
            }
            Account it2 = (Account) element$iv;
            if (it2 != null) {
                return it2;
            }
        }
        List $this$firstOrNull$iv2 = l;
        Iterator it3 = $this$firstOrNull$iv2.iterator();
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            Object element$iv2 = it3.next();
            if (Intrinsics.areEqual(((Account) element$iv2).getName(), act)) {
                obj = element$iv2;
                break;
            }
        }
        Account account = (Account) obj;
        return account == null ? (Account) CollectionsKt.firstOrNull(l) : account;
    }

    private final synchronized void save(String active, String activeKey, List<Account> list) {
        List<Account> $this$map$iv = list;
        int $i$f$map = 0;
        Collection destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10));
        for (Object item$iv$iv : $this$map$iv) {
            Account a = (Account) item$iv$iv;
            Map m = JsonKt.o(JsonKt.deepCopy(a.getRaw()));
            Intrinsics.checkNotNull(m);
            for (String k : this.tokenKeys) {
                Object obj = m.get(k);
                Iterable $this$map$iv2 = $this$map$iv;
                String str = obj instanceof String ? (String) obj : null;
                if (str != null) {
                    String it = str;
                    String str2 = it.length() > 0 ? str : null;
                    if (str2 != null) {
                        String it2 = str2;
                        m.put(k, this.cipher.encrypt(it2));
                        $this$map$iv = $this$map$iv2;
                        $i$f$map = $i$f$map;
                    }
                }
                $this$map$iv = $this$map$iv2;
                $i$f$map = $i$f$map;
            }
            destination$iv$iv.add(m);
            $this$map$iv = $this$map$iv;
            $i$f$map = $i$f$map;
        }
        List out = (List) destination$iv$iv;
        FileUtil.INSTANCE.writeJson(this.paths.getAccountsFile(), JsonKt.jobj(TuplesKt.to("active", active), TuplesKt.to(ACTIVE_KEY, activeKey), TuplesKt.to("accounts", CollectionsKt.toMutableList((Collection) out))));
    }

    public static /* synthetic */ void upsert$default(AccountStore accountStore, Account account, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        accountStore.upsert(account, z);
    }

    public final synchronized void upsert(Account acc, boolean makeActive) {
        Intrinsics.checkNotNullParameter(acc, "acc");
        Triple<String, String, List<Account>> tripleLoadFull = loadFull();
        String act = tripleLoadFull.component1();
        String curKey = tripleLoadFull.component2();
        Iterable l = (List) tripleLoadFull.component3();
        Iterable $this$filter$iv = l;
        Collection destination$iv$iv = new ArrayList();
        for (Object element$iv$iv : $this$filter$iv) {
            Account it = (Account) element$iv$iv;
            if (!Intrinsics.areEqual(it.getKey(), acc.getKey())) {
                destination$iv$iv.add(element$iv$iv);
            }
        }
        acc.getRaw().put("updated_at", Long.valueOf(System.currentTimeMillis() / 1000));
        List nl = CollectionsKt.plus((Collection<? extends Account>) destination$iv$iv, acc);
        save(makeActive ? acc.getName() : act, makeActive ? acc.getKey() : curKey, nl);
    }

    public final synchronized void remove(String key) {
        Iterable $this$any$iv;
        String name;
        Intrinsics.checkNotNullParameter(key, "key");
        Triple<String, String, List<Account>> tripleLoadFull = loadFull();
        String act = tripleLoadFull.component1();
        String curKey = tripleLoadFull.component2();
        Iterable l = (List) tripleLoadFull.component3();
        Iterable $this$filter$iv = l;
        Collection destination$iv$iv = new ArrayList();
        for (Object element$iv$iv : $this$filter$iv) {
            Account it = (Account) element$iv$iv;
            if (!Intrinsics.areEqual(it.getKey(), key)) {
                destination$iv$iv.add(element$iv$iv);
            }
        }
        List nl = (List) destination$iv$iv;
        List $this$any$iv2 = nl;
        boolean z = true;
        if (!($this$any$iv2 instanceof Collection) || !$this$any$iv2.isEmpty()) {
            Iterator it2 = $this$any$iv2.iterator();
            while (true) {
                if (it2.hasNext()) {
                    Object element$iv = it2.next();
                    Account it3 = (Account) element$iv;
                    if (Intrinsics.areEqual(it3.getKey(), curKey)) {
                        $this$any$iv = 1;
                        break;
                    }
                } else {
                    $this$any$iv = null;
                    break;
                }
            }
        } else {
            $this$any$iv = null;
        }
        String keepKey = $this$any$iv != null ? curKey : "";
        List $this$any$iv3 = nl;
        if (!($this$any$iv3 instanceof Collection) || !$this$any$iv3.isEmpty()) {
            Iterator it4 = $this$any$iv3.iterator();
            while (true) {
                if (it4.hasNext()) {
                    Object element$iv2 = it4.next();
                    Account it5 = (Account) element$iv2;
                    if (Intrinsics.areEqual(it5.getName(), act)) {
                        break;
                    }
                } else {
                    z = false;
                    break;
                }
            }
        } else {
            z = false;
        }
        if (z) {
            name = act;
        } else {
            Account account = (Account) CollectionsKt.firstOrNull(nl);
            if (account == null || (name = account.getName()) == null) {
                name = "";
            }
        }
        save(name, keepKey, nl);
    }

    public final synchronized void setActive(String name) {
        Object element$iv;
        String key;
        Intrinsics.checkNotNullParameter(name, "name");
        List l = loadFull().component3();
        List $this$firstOrNull$iv = l;
        Iterator it = $this$firstOrNull$iv.iterator();
        while (true) {
            if (it.hasNext()) {
                element$iv = it.next();
                Account it2 = (Account) element$iv;
                if (Intrinsics.areEqual(it2.getName(), name)) {
                    break;
                }
            } else {
                element$iv = null;
                break;
            }
        }
        Account account = (Account) element$iv;
        if (account == null || (key = account.getKey()) == null) {
            key = "";
        }
        save(name, key, l);
    }

    public final synchronized void setActive(Account acc) {
        Intrinsics.checkNotNullParameter(acc, "acc");
        List l = loadFull().component3();
        save(acc.getName(), acc.getKey(), l);
    }
}
