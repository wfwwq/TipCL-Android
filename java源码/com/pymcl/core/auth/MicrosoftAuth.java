package com.pymcl.core.auth;

import androidx.autofill.HintConstants;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import com.pymcl.core.account.Account;
import com.pymcl.core.account.AccountsKt;
import com.pymcl.core.net.Http;
import com.pymcl.core.net.HttpResponse;
import com.pymcl.core.util.Json;
import com.pymcl.core.util.JsonKt;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Auth.kt */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 &2\u00020\u0001:\u0001&B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0004\b\u000b\u0010\fJ\u0006\u0010\r\u001a\u00020\u000eJ\u001e\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\t2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0005H\u0002J*\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00142\u0006\u0010\u0015\u001a\u00020\u000e2\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0005J\u001a\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00142\u0006\u0010\u0017\u001a\u00020\u0006J\u0010\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0006H\u0002J\u001c\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00142\u0006\u0010\u0018\u001a\u00020\u0006H\u0002J \u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u00062\b\b\u0002\u0010\u001e\u001a\u00020\u0012J\"\u0010\u001f\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010 j\u0002`!2\u0006\u0010\"\u001a\u00020\u0006H\u0002J*\u0010#\u001a\u00020\u001b2\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\n0\b2\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0005J\u000e\u0010\u0017\u001a\u00020\u001b2\u0006\u0010%\u001a\u00020\u001bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lcom/pymcl/core/auth/MicrosoftAuth;", "", "http", "Lcom/pymcl/core/net/Http;", "clientId", "Lkotlin/Function0;", "", "sleeper", "Lkotlin/Function1;", "", "", "<init>", "(Lcom/pymcl/core/net/Http;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "requestDeviceCode", "Lcom/pymcl/core/auth/DeviceCode;", "sleepInterruptible", "ms", "cancelled", "", "pollToken", "Lkotlin/Pair;", "dc", "refreshMs", "refresh", "xbl", "xsts", "completeLogin", "Lcom/pymcl/core/account/Account;", "msAccess", "msRefresh", "checkEntitlements", "jsonOrEmpty", "", "Lcom/pymcl/core/util/JObj;", "t", "login", "onCode", "acc", "Companion", "PyMCL-Android:core"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class MicrosoftAuth {
    public static final long CANCEL_SLICE_MS = 200;
    public static final String SCOPE = "service::user.auth.xboxlive.com::MBI_SSL";
    private final Function0<String> clientId;
    private final Http http;
    private final Function1<Long, Unit> sleeper;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Map<Long, String> XERR = MapsKt.mapOf(TuplesKt.to(2148916227L, "该账号已被 Xbox 封禁"), TuplesKt.to(2148916233L, "该微软账号没有 Xbox 账户，请先创建"), TuplesKt.to(2148916235L, "所在地区不支持 Xbox Live"), TuplesKt.to(2148916236L, "需要成人验证（韩国）"), TuplesKt.to(2148916237L, "需要成人验证（韩国）"), TuplesKt.to(2148916238L, "儿童账户需加入家庭组"));

    /* compiled from: Auth.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\t\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u001d\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/pymcl/core/auth/MicrosoftAuth$Companion;", "", "<init>", "()V", "SCOPE", "", "XERR", "", "", "getXERR", "()Ljava/util/Map;", "CANCEL_SLICE_MS", "PyMCL-Android:core"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Map<Long, String> getXERR() {
            return MicrosoftAuth.XERR;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MicrosoftAuth(Http http, Function0<String> clientId, Function1<? super Long, Unit> sleeper) {
        Intrinsics.checkNotNullParameter(http, "http");
        Intrinsics.checkNotNullParameter(clientId, "clientId");
        Intrinsics.checkNotNullParameter(sleeper, "sleeper");
        this.http = http;
        this.clientId = clientId;
        this.sleeper = sleeper;
    }

    public /* synthetic */ MicrosoftAuth(Http http, Function0 function0, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(http, (i & 2) != 0 ? new Function0() { // from class: com.pymcl.core.auth.MicrosoftAuth$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MicrosoftAuth._init_$lambda$0();
            }
        } : function0, (i & 4) != 0 ? new Function1() { // from class: com.pymcl.core.auth.MicrosoftAuth$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MicrosoftAuth._init_$lambda$1(((Long) obj).longValue());
            }
        } : function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _init_$lambda$0() {
        return "00000000402b5328";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$1(long it) throws InterruptedException {
        Thread.sleep(it);
        return Unit.INSTANCE;
    }

    public final DeviceCode requestDeviceCode() throws AuthException {
        Map o = Json.INSTANCE.obj(Http.postForm$default(this.http, "https://login.live.com/oauth20_connect.srf", MapsKt.mapOf(TuplesKt.to("client_id", this.clientId.invoke()), TuplesKt.to("scope", SCOPE), TuplesKt.to("response_type", "device_code")), null, 4, null).getText());
        String str = JsonKt.str(o, "device_code");
        if (str == null) {
            throw new AuthException("获取设备码失败: " + JsonKt.str(o, "error"), null, 2, null);
        }
        String str2 = JsonKt.str(o, "user_code");
        Intrinsics.checkNotNull(str2);
        String str3 = JsonKt.str(o, "verification_uri");
        if (str3 == null) {
            str3 = "https://www.microsoft.com/link";
        }
        Integer numM8042int = JsonKt.m8042int(o, "expires_in");
        int iIntValue = numM8042int != null ? numM8042int.intValue() : 900;
        Integer numM8042int2 = JsonKt.m8042int(o, "interval");
        return new DeviceCode(str, str2, str3, iIntValue, numM8042int2 != null ? numM8042int2.intValue() : 5);
    }

    private final void sleepInterruptible(long ms, Function0<Boolean> cancelled) {
        long left = ms;
        while (left > 0 && !cancelled.invoke().booleanValue()) {
            long step = Math.min(left, 200L);
            this.sleeper.invoke(Long.valueOf(step));
            left -= step;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Pair pollToken$default(MicrosoftAuth microsoftAuth, DeviceCode deviceCode, Function0 function0, int i, Object obj) {
        if ((i & 2) != 0) {
            function0 = new Function0() { // from class: com.pymcl.core.auth.MicrosoftAuth$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Boolean.valueOf(MicrosoftAuth.pollToken$lambda$0());
                }
            };
        }
        return microsoftAuth.pollToken(deviceCode, function0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean pollToken$lambda$0() {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00bf, code lost:
    
        if (r11.equals("expired_token") == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00c8, code lost:
    
        if (r11.equals("authorization_declined") == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00e7, code lost:
    
        if (r11.equals("bad_verification_code") == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0100, code lost:
    
        throw new com.pymcl.core.auth.AuthException("微软登录失败: " + r11, r11);
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.Pair<java.lang.String, java.lang.String> pollToken(com.pymcl.core.auth.DeviceCode r18, kotlin.jvm.functions.Function0<java.lang.Boolean> r19) throws com.pymcl.core.auth.AuthException {
        /*
            Method dump skipped, instructions count: 336
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.core.auth.MicrosoftAuth.pollToken(com.pymcl.core.auth.DeviceCode, kotlin.jvm.functions.Function0):kotlin.Pair");
    }

    public final Pair<String, String> refreshMs(String refresh) throws AuthException {
        Intrinsics.checkNotNullParameter(refresh, "refresh");
        Map o = Json.INSTANCE.obj(Http.postForm$default(this.http, "https://login.live.com/oauth20_token.srf", MapsKt.mapOf(TuplesKt.to("grant_type", "refresh_token"), TuplesKt.to("client_id", this.clientId.invoke()), TuplesKt.to("refresh_token", refresh), TuplesKt.to("scope", SCOPE)), null, 4, null).getText());
        String str = JsonKt.str(o, "access_token");
        if (str == null) {
            throw new AuthException("刷新失败: " + JsonKt.str(o, "error"), "refresh");
        }
        String str2 = JsonKt.str(o, "refresh_token");
        if (str2 == null) {
            str2 = refresh;
        }
        return TuplesKt.to(str, str2);
    }

    private final String xbl(String ms) throws AuthException {
        for (String ticket : CollectionsKt.listOf((Object[]) new String[]{ms, "d=" + ms})) {
            HttpResponse r = Http.postJson$default(this.http, "https://user.auth.xboxlive.com/user/authenticate", Json.stringify$default(Json.INSTANCE, JsonKt.jobj(TuplesKt.to("Properties", JsonKt.jobj(TuplesKt.to("AuthMethod", "RPS"), TuplesKt.to("SiteName", "user.auth.xboxlive.com"), TuplesKt.to("RpsTicket", ticket))), TuplesKt.to("RelyingParty", "http://auth.xboxlive.com"), TuplesKt.to("TokenType", "JWT")), false, 2, null), null, 4, null);
            if (r.getOk()) {
                String str = JsonKt.str(Json.INSTANCE.obj(r.getText()), "Token");
                Intrinsics.checkNotNull(str);
                return str;
            }
        }
        throw new AuthException("Xbox Live 认证失败", "xbl");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Pair<String, String> xsts(String xbl) throws AuthException {
        Object objM8116constructorimpl;
        HttpResponse r = Http.postJson$default(this.http, "https://xsts.auth.xboxlive.com/xsts/authorize", Json.stringify$default(Json.INSTANCE, JsonKt.jobj(TuplesKt.to("Properties", JsonKt.jobj(TuplesKt.to("SandboxId", "RETAIL"), TuplesKt.to("UserTokens", CollectionsKt.mutableListOf(xbl)))), TuplesKt.to("RelyingParty", "rp://api.minecraftservices.com/"), TuplesKt.to("TokenType", "JWT")), false, 2, null), null, 4, null);
        try {
            Result.Companion companion = Result.INSTANCE;
            MicrosoftAuth microsoftAuth = this;
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
        if (r.getCode() == 401) {
            Long lM8043long = JsonKt.m8043long(o, "XErr");
            long x = lM8043long != null ? lM8043long.longValue() : 0L;
            String str = XERR.get(Long.valueOf(x));
            if (str == null) {
                str = "XSTS 认证失败 (" + x + ")";
            }
            throw new AuthException(str, String.valueOf(x));
        }
        if (!r.getOk()) {
            throw new AuthException("XSTS 认证失败 HTTP " + r.getCode(), "xsts");
        }
        String str2 = JsonKt.str(o, "Token");
        Intrinsics.checkNotNull(str2);
        String str3 = JsonKt.str((Map) CollectionsKt.firstOrNull((List) JsonKt.objs(JsonKt.arr(JsonKt.obj(o, "DisplayClaims"), "xui"))), "uhs");
        if (str3 == null) {
            str3 = "";
        }
        return TuplesKt.to(str2, str3);
    }

    public static /* synthetic */ Account completeLogin$default(MicrosoftAuth microsoftAuth, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        return microsoftAuth.completeLogin(str, str2, z);
    }

    public final Account completeLogin(String msAccess, String msRefresh, boolean checkEntitlements) throws AuthException {
        Intrinsics.checkNotNullParameter(msAccess, "msAccess");
        Intrinsics.checkNotNullParameter(msRefresh, "msRefresh");
        Pair<String, String> pairXsts = xsts(xbl(msAccess));
        String xs = pairXsts.component1();
        String uhs = pairXsts.component2();
        HttpResponse lr = Http.postJson$default(this.http, "https://api.minecraftservices.com/authentication/login_with_xbox", Json.stringify$default(Json.INSTANCE, JsonKt.jobj(TuplesKt.to("identityToken", "XBL3.0 x=" + uhs + ";" + xs)), false, 2, null), null, 4, null);
        String mc = JsonKt.str(jsonOrEmpty(lr.getText()), "access_token");
        if (mc != null) {
            if (!lr.getOk()) {
                mc = null;
            }
            if (mc != null) {
                Map bearer = MapsKt.mapOf(TuplesKt.to("Authorization", "Bearer " + mc));
                if (checkEntitlements) {
                    HttpResponse er = Http.get$default(this.http, "https://api.minecraftservices.com/entitlements/mcstore", bearer, 0, 4, null);
                    if (!er.getOk()) {
                        throw new AuthException("查询游戏所有权失败 HTTP " + er.getCode(), "entitlements");
                    }
                    List<Object> listArr = JsonKt.arr(jsonOrEmpty(er.getText()), "items");
                    if (listArr == null || listArr.isEmpty()) {
                        throw new AuthException("该账号未购买 Minecraft（或 XGP 已到期）", "not_owned");
                    }
                }
                HttpResponse pr = Http.get$default(this.http, "https://api.minecraftservices.com/minecraft/profile", bearer, 0, 4, null);
                if (pr.getCode() == 404) {
                    throw new AuthException("尚未创建 Minecraft 档案，请先在官网设置角色名", "no_profile");
                }
                Map p = jsonOrEmpty(pr.getText());
                long now = System.currentTimeMillis() / 1000;
                String str = JsonKt.str(p, "id");
                if (str != null) {
                    String pid = pr.getOk() ? str : null;
                    if (pid != null) {
                        return new Account(JsonKt.jobj(TuplesKt.to(ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "microsoft"), TuplesKt.to(HintConstants.AUTOFILL_HINT_NAME, JsonKt.str(p, HintConstants.AUTOFILL_HINT_NAME)), TuplesKt.to("uuid", AccountsKt.dashedUuid(pid)), TuplesKt.to("access_token", mc), TuplesKt.to("refresh_token", msRefresh), TuplesKt.to("xuid", uhs), TuplesKt.to("expires_at", Long.valueOf(72000 + now)), TuplesKt.to("updated_at", Long.valueOf(now))));
                    }
                }
                throw new AuthException("读取 Minecraft 档案失败 HTTP " + pr.getCode(), "profile");
            }
        }
        throw new AuthException(lr.getCode() == 429 ? "Minecraft 登录请求过于频繁，请稍后再试" : "Minecraft 登录失败 HTTP " + lr.getCode(), "mc");
    }

    private final Map<String, Object> jsonOrEmpty(String t) {
        Object objM8116constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            MicrosoftAuth microsoftAuth = this;
            objM8116constructorimpl = Result.m8116constructorimpl(Json.INSTANCE.obj(t));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM8116constructorimpl = Result.m8116constructorimpl(ResultKt.createFailure(th));
        }
        Map<String, Object> mapJobj = JsonKt.jobj(new Pair[0]);
        if (Result.m8122isFailureimpl(objM8116constructorimpl)) {
            objM8116constructorimpl = mapJobj;
        }
        return (Map) objM8116constructorimpl;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Account login$default(MicrosoftAuth microsoftAuth, Function1 function1, Function0 function0, int i, Object obj) {
        if ((i & 2) != 0) {
            function0 = new Function0() { // from class: com.pymcl.core.auth.MicrosoftAuth$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Boolean.valueOf(MicrosoftAuth.login$lambda$0());
                }
            };
        }
        return microsoftAuth.login(function1, function0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean login$lambda$0() {
        return false;
    }

    public final Account login(Function1<? super DeviceCode, Unit> onCode, Function0<Boolean> cancelled) {
        Intrinsics.checkNotNullParameter(onCode, "onCode");
        Intrinsics.checkNotNullParameter(cancelled, "cancelled");
        DeviceCode dc = requestDeviceCode();
        onCode.invoke(dc);
        Pair<String, String> pairPollToken = pollToken(dc, cancelled);
        String a = pairPollToken.component1();
        String r = pairPollToken.component2();
        return completeLogin$default(this, a, r, false, 4, null);
    }

    public final Account refresh(Account acc) {
        Intrinsics.checkNotNullParameter(acc, "acc");
        Pair<String, String> pairRefreshMs = refreshMs(acc.getRefreshToken());
        String a = pairRefreshMs.component1();
        String r = pairRefreshMs.component2();
        return completeLogin(a, r, false);
    }
}
