package com.pymcl.core.auth;

import com.pymcl.core.net.Http;
import com.pymcl.core.net.HttpResponse;
import com.pymcl.core.util.FileUtil;
import com.pymcl.core.util.Json;
import com.pymcl.core.util.JsonKt;
import java.io.File;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;

/* compiled from: Auth.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\r\u001a\u00020\u0005J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0006\u0010\u0012\u001a\u00020\u0005J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0014\u001a\u00020\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\f\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/pymcl/core/auth/AgentJars;", "", "http", "Lcom/pymcl/core/net/Http;", "root", "Ljava/io/File;", "<init>", "(Lcom/pymcl/core/net/Http;Ljava/io/File;)V", "authlibJar", "getAuthlibJar", "()Ljava/io/File;", "nide8Jar", "getNide8Jar", "ensureAuthlibInjector", "sha256", "", "b", "", "ensureNide8", "prefetch", "api", "PyMCL-Android:core"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class AgentJars {
    private final Http http;
    private final File root;

    public AgentJars(Http http, File root) {
        Intrinsics.checkNotNullParameter(http, "http");
        Intrinsics.checkNotNullParameter(root, "root");
        this.http = http;
        this.root = root;
    }

    public final File getAuthlibJar() {
        return new File(this.root, "authlib-injector.jar");
    }

    public final File getNide8Jar() {
        return new File(this.root, "nide8auth.jar");
    }

    public final File ensureAuthlibInjector() throws AuthException {
        Map meta;
        String dl;
        HttpResponse r;
        if (getAuthlibJar().isFile() && getAuthlibJar().length() > 10000) {
            return getAuthlibJar();
        }
        Exception err = null;
        for (String u : CollectionsKt.listOf((Object[]) new String[]{"https://bmclapi2.bangbang93.com/mirrors/authlib-injector/artifact/latest.json", "https://authlib-injector.yushi.moe/artifact/latest.json"})) {
            try {
                meta = Json.INSTANCE.obj(Http.getText$default(this.http, u, null, 0, 6, null));
                dl = JsonKt.str(meta, "download_url");
                Intrinsics.checkNotNull(dl);
                r = Http.get$default(this.http, dl, null, 0, 6, null);
            } catch (Exception e) {
                err = e;
            }
            if (!r.getOk()) {
                throw new AuthException("HTTP " + r.getCode() + ": " + dl, null, 2, null);
            }
            byte[] b = r.getBody();
            Map<String, Object> mapObj = JsonKt.obj(meta, "checksums");
            String want = mapObj != null ? JsonKt.str(mapObj, "sha256") : null;
            if (want != null && !StringsKt.equals(sha256(b), want, true)) {
                throw new AuthException("authlib-injector 校验失败（" + u + "）", null, 2, null);
            }
            if (b.length > 10000) {
                FileUtil.INSTANCE.writeAtomic(getAuthlibJar(), b);
                return getAuthlibJar();
            }
        }
        throw new AuthException("authlib-injector 下载失败: " + (err != null ? err.getMessage() : null), null, 2, null);
    }

    private final String sha256(byte[] b) {
        byte[] bArrDigest = MessageDigest.getInstance("SHA-256").digest(b);
        Intrinsics.checkNotNullExpressionValue(bArrDigest, "digest(...)");
        return ArraysKt.joinToString$default(bArrDigest, (CharSequence) "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, new Function1() { // from class: com.pymcl.core.auth.AgentJars$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AgentJars.sha256$lambda$0(((Byte) obj).byteValue());
            }
        }, 30, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence sha256$lambda$0(byte it) {
        String str = String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(it)}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    public final File ensureNide8() throws AuthException {
        if (getNide8Jar().isFile() && getNide8Jar().length() > 10000) {
            return getNide8Jar();
        }
        byte[] b = Http.get$default(this.http, "https://login.mc-user.com:233/index/jar", null, 0, 6, null).getBody();
        if (b.length <= 10000) {
            throw new AuthException("nide8auth.jar 下载失败", null, 2, null);
        }
        FileUtil.INSTANCE.writeAtomic(getNide8Jar(), b);
        return getNide8Jar();
    }

    public final String prefetch(String api) {
        Object objM8116constructorimpl;
        Intrinsics.checkNotNullParameter(api, "api");
        try {
            Result.Companion companion = Result.INSTANCE;
            AgentJars $this$prefetch_u24lambda_u240 = this;
            Base64.Encoder encoder = Base64.getEncoder();
            byte[] bytes = Http.getText$default($this$prefetch_u24lambda_u240.http, YggdrasilAuth.INSTANCE.normalizeApi(api), null, 0, 6, null).getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
            objM8116constructorimpl = Result.m8116constructorimpl(encoder.encodeToString(bytes));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM8116constructorimpl = Result.m8116constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m8122isFailureimpl(objM8116constructorimpl)) {
            objM8116constructorimpl = null;
        }
        return (String) objM8116constructorimpl;
    }
}
