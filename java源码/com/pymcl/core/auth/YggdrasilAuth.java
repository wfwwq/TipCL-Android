package com.pymcl.core.auth;

import androidx.autofill.HintConstants;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import com.pymcl.core.account.Account;
import com.pymcl.core.account.AccountStore;
import com.pymcl.core.account.AccountType;
import com.pymcl.core.account.AccountsKt;
import com.pymcl.core.net.Http;
import com.pymcl.core.net.HttpResponse;
import com.pymcl.core.util.Json;
import com.pymcl.core.util.JsonKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.apache.commons.io.IOUtils;

/* compiled from: Auth.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001f2\u00020\u0001:\u0002\u001f B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007JF\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\f2\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0011J\u000e\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\nJ\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\nJ4\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u00192\u0018\u0010\u001a\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001bj\u0002`\u001cH\u0002J$\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u001e\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/pymcl/core/auth/YggdrasilAuth;", "", "http", "Lcom/pymcl/core/net/Http;", "accountStore", "Lcom/pymcl/core/account/AccountStore;", "<init>", "(Lcom/pymcl/core/net/Http;Lcom/pymcl/core/account/AccountStore;)V", "authenticate", "", "Lcom/pymcl/core/account/Account;", "api", "", HintConstants.AUTOFILL_HINT_USERNAME, HintConstants.AUTOFILL_HINT_PASSWORD, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "extra", "", "refresh", "acc", "validate", "", "diagnoseRevocation", "Lcom/pymcl/core/auth/AuthException;", "httpStatus", "", "o", "", "Lcom/pymcl/core/util/JObj;", "loginNide8", "serverIdOrLink", "Companion", "Profile", "PyMCL-Android:core"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class YggdrasilAuth {
    public static final String NIDE8_API = "https://auth.mc-user.com:233/";
    public static final String UNBOUND = "token_unbound";
    private final AccountStore accountStore;
    private final Http http;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final String LITTLESKIN = "https://littleskin.cn/api/yggdrasil";
    private static final LinkedHashMap<String, String> PRESETS = MapsKt.linkedMapOf(TuplesKt.to("Little Skin", LITTLESKIN));

    /* compiled from: Auth.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u0005J\u000e\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R-\u0010\u0006\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0007j\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005`\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/pymcl/core/auth/YggdrasilAuth$Companion;", "", "<init>", "()V", "LITTLESKIN", "", "PRESETS", "Ljava/util/LinkedHashMap;", "Lkotlin/collections/LinkedHashMap;", "getPRESETS", "()Ljava/util/LinkedHashMap;", "NIDE8_API", "UNBOUND", "normalizeApi", "api", "nide8Id", "s", "PyMCL-Android:core"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final LinkedHashMap<String, String> getPRESETS() {
            return YggdrasilAuth.PRESETS;
        }

        public final String normalizeApi(String api) {
            Intrinsics.checkNotNullParameter(api, "api");
            String it = StringsKt.trim((CharSequence) api).toString();
            if (!StringsKt.startsWith$default(it, "http://", false, 2, (Object) null) && !StringsKt.startsWith$default(it, "https://", false, 2, (Object) null)) {
                it = "https://" + it;
            }
            return StringsKt.trimEnd(it, IOUtils.DIR_SEPARATOR_UNIX);
        }

        public final String nide8Id(String s) throws AuthException {
            String value;
            Intrinsics.checkNotNullParameter(s, "s");
            MatchResult matchResultFind$default = Regex.find$default(new Regex("[0-9a-fA-F]{32}"), s, 0, 2, null);
            if (matchResultFind$default == null || (value = matchResultFind$default.getValue()) == null) {
                throw new AuthException("无效的统一通行证服务器 ID", null, 2, null);
            }
            return value;
        }
    }

    public YggdrasilAuth(Http http, AccountStore accountStore) {
        Intrinsics.checkNotNullParameter(http, "http");
        this.http = http;
        this.accountStore = accountStore;
    }

    public /* synthetic */ YggdrasilAuth(Http http, AccountStore accountStore, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(http, (i & 2) != 0 ? null : accountStore);
    }

    /* compiled from: Auth.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004J\n\u0010\u0012\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/pymcl/core/auth/YggdrasilAuth$Profile;", "", "id", "", HintConstants.AUTOFILL_HINT_NAME, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getName", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "PyMCL-Android:core"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class Profile {
        private final String id;
        private final String name;

        public static /* synthetic */ Profile copy$default(Profile profile, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = profile.id;
            }
            if ((i & 2) != 0) {
                str2 = profile.name;
            }
            return profile.copy(str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* renamed from: component2, reason: from getter */
        public final String getName() {
            return this.name;
        }

        public final Profile copy(String id, String name) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(name, "name");
            return new Profile(id, name);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Profile)) {
                return false;
            }
            Profile profile = (Profile) other;
            return Intrinsics.areEqual(this.id, profile.id) && Intrinsics.areEqual(this.name, profile.name);
        }

        public int hashCode() {
            return (this.id.hashCode() * 31) + this.name.hashCode();
        }

        public String toString() {
            return "Profile(id=" + this.id + ", name=" + this.name + ")";
        }

        public Profile(String id, String name) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(name, "name");
            this.id = id;
            this.name = name;
        }

        public final String getId() {
            return this.id;
        }

        public final String getName() {
            return this.name;
        }
    }

    public static /* synthetic */ List authenticate$default(YggdrasilAuth yggdrasilAuth, String str, String str2, String str3, String str4, Map map, int i, Object obj) {
        if ((i & 8) != 0) {
            str4 = "authlib";
        }
        String str5 = str4;
        if ((i & 16) != 0) {
            map = MapsKt.emptyMap();
        }
        return yggdrasilAuth.authenticate(str, str2, str3, str5, map);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final List<Account> authenticate(String api, String username, String password, String type, Map<String, ? extends Object> extra) throws AuthException {
        Object objM8116constructorimpl;
        List<Map<String, Object>> listObjs;
        Object[] objArr;
        String str;
        String type2 = type;
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(username, "username");
        Intrinsics.checkNotNullParameter(password, "password");
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(extra, "extra");
        String strNormalizeApi = INSTANCE.normalizeApi(api);
        String string = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        String strReplace$default = StringsKt.replace$default(string, "-", "", false, 4, (Object) null);
        Json json = Json.INSTANCE;
        String str2 = HintConstants.AUTOFILL_HINT_NAME;
        Object[] objArr2 = false;
        HttpResponse httpResponsePostJson$default = Http.postJson$default(this.http, strNormalizeApi + "/authserver/authenticate", Json.stringify$default(json, JsonKt.jobj(TuplesKt.to("agent", JsonKt.jobj(TuplesKt.to(HintConstants.AUTOFILL_HINT_NAME, "Minecraft"), TuplesKt.to("version", 1L))), TuplesKt.to(HintConstants.AUTOFILL_HINT_USERNAME, username), TuplesKt.to(HintConstants.AUTOFILL_HINT_PASSWORD, password), TuplesKt.to("clientToken", strReplace$default), TuplesKt.to("requestUser", true)), false, 2, null), null, 4, null);
        try {
            Result.Companion companion = Result.INSTANCE;
            YggdrasilAuth yggdrasilAuth = this;
            objM8116constructorimpl = Result.m8116constructorimpl(Json.INSTANCE.obj(httpResponsePostJson$default.getText()));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM8116constructorimpl = Result.m8116constructorimpl(ResultKt.createFailure(th));
        }
        Map<String, Object> mapJobj = JsonKt.jobj(new Pair[0]);
        if (Result.m8122isFailureimpl(objM8116constructorimpl)) {
            objM8116constructorimpl = mapJobj;
        }
        Map map = (Map) objM8116constructorimpl;
        if (!httpResponsePostJson$default.getOk()) {
            String str3 = JsonKt.str(map, "errorMessage");
            if (str3 == null) {
                str3 = "登录失败 HTTP " + httpResponsePostJson$default.getCode();
            }
            String str4 = JsonKt.str(map, "error");
            if (str4 == null) {
                str4 = "";
            }
            throw new AuthException(str3, str4);
        }
        String str5 = JsonKt.str(map, "accessToken");
        if (str5 == null) {
            throw new AuthException("登录失败：服务器没有返回令牌", null, 2, null);
        }
        String str6 = JsonKt.str(map, "clientToken");
        if (str6 == null) {
            str6 = strReplace$default;
        }
        Map<String, Object> mapObj = JsonKt.obj(map, "selectedProfile");
        if (mapObj == null || (listObjs = CollectionsKt.listOf(mapObj)) == null) {
            listObjs = JsonKt.objs(JsonKt.arr(map, "availableProfiles"));
        }
        if (listObjs.isEmpty()) {
            throw new AuthException("该账号下没有角色", null, 2, null);
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = listObjs.iterator();
        while (true) {
            objArr = objArr2;
            if (!it.hasNext()) {
                break;
            }
            Map map2 = map;
            Object next = it.next();
            HttpResponse httpResponse = httpResponsePostJson$default;
            if ((JsonKt.str((Map) next, "id") != null ? true : objArr == true ? 1 : 0) != false) {
                arrayList.add(next);
            }
            map = map2;
            objArr2 = objArr == true ? 1 : 0;
            httpResponsePostJson$default = httpResponse;
        }
        ArrayList arrayList2 = arrayList;
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
        ArrayList<Map> arrayList4 = arrayList2;
        for (Map map3 : arrayList4) {
            ArrayList arrayList5 = arrayList2;
            ArrayList arrayList6 = arrayList4;
            Pair[] pairArr = new Pair[7];
            pairArr[objArr == true ? 1 : 0] = TuplesKt.to(ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, type2);
            pairArr[1] = TuplesKt.to(str2, JsonKt.str(map3, str2));
            String str7 = JsonKt.str(map3, "id");
            Intrinsics.checkNotNull(str7);
            pairArr[2] = TuplesKt.to("uuid", AccountsKt.dashedUuid(str7));
            pairArr[3] = TuplesKt.to("access_token", str5);
            pairArr[4] = TuplesKt.to("client_token", str6);
            pairArr[5] = TuplesKt.to("api", strNormalizeApi);
            pairArr[6] = TuplesKt.to(HintConstants.AUTOFILL_HINT_USERNAME, username);
            Map<String, Object> mapJobj2 = JsonKt.jobj(pairArr);
            mapJobj2.putAll(extra);
            if (mapObj == null) {
                str = str2;
                mapJobj2.put(UNBOUND, true);
            } else {
                str = str2;
            }
            arrayList3.add(new Account(mapJobj2));
            type2 = type;
            arrayList2 = arrayList5;
            arrayList4 = arrayList6;
            str2 = str;
        }
        return arrayList3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Account refresh(Account acc) throws AuthException {
        Object objM8116constructorimpl;
        String n;
        Intrinsics.checkNotNullParameter(acc, "acc");
        if (Intrinsics.areEqual(acc.getRaw().get(TokenRevocation.REVOKED), (Object) true)) {
            throw new AuthException(TokenRevocation.INSTANCE.revokedMessage(acc), TokenRevocation.CODE);
        }
        String base = INSTANCE.normalizeApi(acc.getApi());
        boolean unbound = Intrinsics.areEqual(acc.getRaw().get(UNBOUND), (Object) true);
        Map req = JsonKt.jobj(TuplesKt.to("accessToken", acc.getTargetPeer()), TuplesKt.to("clientToken", acc.getClientToken()), TuplesKt.to("requestUser", true));
        if (unbound) {
            req.put("selectedProfile", JsonKt.jobj(TuplesKt.to("id", StringsKt.replace$default(acc.getUuid(), "-", "", false, 4, (Object) null)), TuplesKt.to(HintConstants.AUTOFILL_HINT_NAME, acc.getName())));
        }
        HttpResponse r = Http.postJson$default(this.http, base + "/authserver/refresh", Json.stringify$default(Json.INSTANCE, req, false, 2, null), null, 4, null);
        try {
            Result.Companion companion = Result.INSTANCE;
            YggdrasilAuth yggdrasilAuth = this;
            objM8116constructorimpl = Result.m8116constructorimpl(Json.INSTANCE.obj(r.getText()));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM8116constructorimpl = Result.m8116constructorimpl(ResultKt.createFailure(th));
        }
        Map<String, Object> mapJobj = JsonKt.jobj(new Pair[0]);
        if (Result.m8122isFailureimpl(objM8116constructorimpl)) {
            objM8116constructorimpl = mapJobj;
        }
        Map o = (Map) objM8116constructorimpl;
        if (!r.getOk()) {
            AuthException authExceptionDiagnoseRevocation = diagnoseRevocation(acc, r.getCode(), o);
            if (authExceptionDiagnoseRevocation == null) {
                String str = JsonKt.str(o, "errorMessage");
                if (str == null) {
                    str = "刷新失败，请重新登录";
                }
                String str2 = JsonKt.str(o, "error");
                if (str2 == null) {
                    str2 = "";
                }
                authExceptionDiagnoseRevocation = new AuthException(str, str2);
            }
            throw authExceptionDiagnoseRevocation;
        }
        String tok = JsonKt.str(o, "accessToken");
        if (tok == null) {
            throw new AuthException("刷新失败：服务器没有返回令牌，请重新登录", null, 2, null);
        }
        Map it = JsonKt.o(JsonKt.deepCopy(acc.getRaw()));
        Intrinsics.checkNotNull(it);
        it.put("access_token", tok);
        String c = JsonKt.str(o, "clientToken");
        if (c != null) {
            it.put("client_token", c);
        }
        if (unbound) {
            it.remove(UNBOUND);
            Map<String, Object> mapObj = JsonKt.obj(o, "selectedProfile");
            if (mapObj != null && (n = JsonKt.str(mapObj, HintConstants.AUTOFILL_HINT_NAME)) != null) {
                it.put(HintConstants.AUTOFILL_HINT_NAME, n);
            }
        }
        return new Account(it);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean validate(Account acc) {
        Object objM8116constructorimpl;
        Intrinsics.checkNotNullParameter(acc, "acc");
        if (!Intrinsics.areEqual(acc.getRaw().get(UNBOUND), (Object) true) && !Intrinsics.areEqual(acc.getRaw().get(TokenRevocation.REVOKED), (Object) true)) {
            try {
                Result.Companion companion = Result.INSTANCE;
                YggdrasilAuth $this$validate_u24lambda_u240 = this;
                objM8116constructorimpl = Result.m8116constructorimpl(Boolean.valueOf(Http.postJson$default($this$validate_u24lambda_u240.http, new StringBuilder().append(INSTANCE.normalizeApi(acc.getApi())).append("/authserver/validate").toString(), Json.stringify$default(Json.INSTANCE, JsonKt.jobj(TuplesKt.to("accessToken", acc.getTargetPeer()), TuplesKt.to("clientToken", acc.getClientToken())), false, 2, null), null, 4, null).getCode() == 204));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                objM8116constructorimpl = Result.m8116constructorimpl(ResultKt.createFailure(th));
            }
            if (Result.m8122isFailureimpl(objM8116constructorimpl)) {
                objM8116constructorimpl = false;
            }
            if (((Boolean) objM8116constructorimpl).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    private final AuthException diagnoseRevocation(Account acc, int httpStatus, Map<String, Object> o) {
        Object objM8116constructorimpl;
        AuthException authException;
        boolean z;
        boolean z2;
        TokenRevocation tokenRevocation = TokenRevocation.INSTANCE;
        String str = JsonKt.str(o, "error");
        if (str == null) {
            str = "";
        }
        String str2 = JsonKt.str(o, "errorMessage");
        boolean zIsRevocationLike = tokenRevocation.isRevocationLike(httpStatus, str, str2 != null ? str2 : "");
        AuthException authException2 = null;
        if (!zIsRevocationLike) {
            return null;
        }
        if (acc.getType() != AccountType.AUTHLIB && acc.getType() != AccountType.NIDE8) {
            return null;
        }
        AccountStore lastInstance = this.accountStore;
        if (lastInstance == null && (lastInstance = AccountStore.INSTANCE.getLastInstance()) == null) {
            return null;
        }
        AccountStore store = lastInstance;
        try {
            Result.Companion companion = Result.INSTANCE;
            YggdrasilAuth yggdrasilAuth = this;
            objM8116constructorimpl = Result.m8116constructorimpl(store.list());
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM8116constructorimpl = Result.m8116constructorimpl(ResultKt.createFailure(th));
        }
        List listEmptyList = CollectionsKt.emptyList();
        if (Result.m8122isFailureimpl(objM8116constructorimpl)) {
            objM8116constructorimpl = listEmptyList;
        }
        List all = (List) objM8116constructorimpl;
        Account sibling = TokenRevocation.INSTANCE.boundSibling(acc, all);
        if (sibling == null) {
            return null;
        }
        List $this$none$iv = all;
        if (!($this$none$iv instanceof Collection) || !$this$none$iv.isEmpty()) {
            Iterator it = $this$none$iv.iterator();
            while (true) {
                if (it.hasNext()) {
                    Object element$iv = it.next();
                    Account it2 = (Account) element$iv;
                    authException = authException2;
                    z = true;
                    if (Intrinsics.areEqual(it2.getKey(), acc.getKey())) {
                        z2 = false;
                        break;
                    }
                    authException2 = authException;
                } else {
                    authException = authException2;
                    z = true;
                    z2 = true;
                    break;
                }
            }
        } else {
            authException = null;
            z2 = true;
            z = true;
        }
        if (z2) {
            return authException;
        }
        acc.getRaw().put(TokenRevocation.REVOKED, Boolean.valueOf(z));
        acc.getRaw().put(TokenRevocation.REVOKED_AT, Long.valueOf(System.currentTimeMillis() / 1000));
        acc.getRaw().put(TokenRevocation.REVOKED_BY, sibling.getName());
        try {
            Result.Companion companion3 = Result.INSTANCE;
            YggdrasilAuth yggdrasilAuth2 = this;
            store.upsert(acc, false);
            Result.m8116constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion4 = Result.INSTANCE;
            Result.m8116constructorimpl(ResultKt.createFailure(th2));
        }
        return new AuthException(TokenRevocation.INSTANCE.formatMessage(sibling.getName()), TokenRevocation.CODE);
    }

    public final List<Account> loginNide8(String serverIdOrLink, String username, String password) throws AuthException {
        Intrinsics.checkNotNullParameter(serverIdOrLink, "serverIdOrLink");
        Intrinsics.checkNotNullParameter(username, "username");
        Intrinsics.checkNotNullParameter(password, "password");
        String id = INSTANCE.nide8Id(serverIdOrLink);
        return authenticate(NIDE8_API + id, username, password, "nide8", MapsKt.mapOf(TuplesKt.to("nide8_id", id)));
    }
}
