package com.pymcl.core.launch;

import com.pymcl.core.account.Account;
import com.pymcl.core.version.GameDirs;
import com.pymcl.core.version.RuleEnv;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.DebugKt;

/* compiled from: LaunchArgs.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b9\b\u0086\b\u0018\u00002\u00020\u0001BÓ\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u001a\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u001d\u0010\u001eJ\t\u0010:\u001a\u00020\u0003HÆ\u0003J\t\u0010;\u001a\u00020\u0005HÆ\u0003J\t\u0010<\u001a\u00020\u0007HÆ\u0003J\t\u0010=\u001a\u00020\tHÆ\u0003J\t\u0010>\u001a\u00020\tHÆ\u0003J\t\u0010?\u001a\u00020\tHÆ\u0003J\t\u0010@\u001a\u00020\rHÆ\u0003J\t\u0010A\u001a\u00020\u000fHÆ\u0003J\t\u0010B\u001a\u00020\u000fHÆ\u0003J\t\u0010C\u001a\u00020\u000fHÆ\u0003J\t\u0010D\u001a\u00020\u000fHÆ\u0003J\t\u0010E\u001a\u00020\u000fHÆ\u0003J\t\u0010F\u001a\u00020\u000fHÆ\u0003J\t\u0010G\u001a\u00020\u000fHÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\t\u0010K\u001a\u00020\u001aHÆ\u0003J\u000b\u0010L\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\u000fHÆ\u0003JÛ\u0001\u0010N\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u000f2\b\b\u0002\u0010\u0013\u001a\u00020\u000f2\b\b\u0002\u0010\u0014\u001a\u00020\u000f2\b\b\u0002\u0010\u0015\u001a\u00020\u000f2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0019\u001a\u00020\u001a2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u000fHÆ\u0001J\u0014\u0010O\u001a\u00020\r2\b\u0010P\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010Q\u001a\u00020\tHÖ\u0081\u0004J\n\u0010R\u001a\u00020\u000fHÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b'\u0010&R\u0011\u0010\u000b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b(\u0010&R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0011\u0010\u0010\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b-\u0010,R\u0011\u0010\u0011\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b.\u0010,R\u0011\u0010\u0012\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b/\u0010,R\u0011\u0010\u0013\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b0\u0010,R\u0011\u0010\u0014\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b1\u0010,R\u0011\u0010\u0015\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b2\u0010,R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b3\u0010\"R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b4\u0010\"R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b5\u0010,R\u0011\u0010\u0019\u001a\u00020\u001a¢\u0006\b\n\u0000\u001a\u0004\b6\u00107R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b8\u0010,R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b9\u0010,¨\u0006S"}, d2 = {"Lcom/pymcl/core/launch/LaunchOptions;", "", "account", "Lcom/pymcl/core/account/Account;", "gameDir", "Ljava/io/File;", "dirs", "Lcom/pymcl/core/version/GameDirs;", "memoryMb", "", "width", "height", "fullscreen", "", "defaultJvmArgs", "", "versionJvmArgs", "versionGameArgs", "server", "port", "gc", "clientId", "authlibJar", "nide8Jar", "authlibPrefetched", "env", "Lcom/pymcl/core/version/RuleEnv;", "offlineSkinApi", "offlineSkinPrefetched", "<init>", "(Lcom/pymcl/core/account/Account;Ljava/io/File;Lcom/pymcl/core/version/GameDirs;IIIZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/io/File;Ljava/io/File;Ljava/lang/String;Lcom/pymcl/core/version/RuleEnv;Ljava/lang/String;Ljava/lang/String;)V", "getAccount", "()Lcom/pymcl/core/account/Account;", "getGameDir", "()Ljava/io/File;", "getDirs", "()Lcom/pymcl/core/version/GameDirs;", "getMemoryMb", "()I", "getWidth", "getHeight", "getFullscreen", "()Z", "getDefaultJvmArgs", "()Ljava/lang/String;", "getVersionJvmArgs", "getVersionGameArgs", "getServer", "getPort", "getGc", "getClientId", "getAuthlibJar", "getNide8Jar", "getAuthlibPrefetched", "getEnv", "()Lcom/pymcl/core/version/RuleEnv;", "getOfflineSkinApi", "getOfflineSkinPrefetched", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "copy", "equals", "other", "hashCode", "toString", "PyMCL-Android:core"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class LaunchOptions {
    private final Account account;
    private final File authlibJar;
    private final String authlibPrefetched;
    private final String clientId;
    private final String defaultJvmArgs;
    private final GameDirs dirs;
    private final RuleEnv env;
    private final boolean fullscreen;
    private final File gameDir;
    private final String gc;
    private final int height;
    private final int memoryMb;
    private final File nide8Jar;
    private final String offlineSkinApi;
    private final String offlineSkinPrefetched;
    private final String port;
    private final String server;
    private final String versionGameArgs;
    private final String versionJvmArgs;
    private final int width;

    public static /* synthetic */ LaunchOptions copy$default(LaunchOptions launchOptions, Account account, File file, GameDirs gameDirs, int i, int i2, int i3, boolean z, String str, String str2, String str3, String str4, String str5, String str6, String str7, File file2, File file3, String str8, RuleEnv ruleEnv, String str9, String str10, int i4, Object obj) {
        String str11;
        String str12;
        Account account2 = (i4 & 1) != 0 ? launchOptions.account : account;
        File file4 = (i4 & 2) != 0 ? launchOptions.gameDir : file;
        GameDirs gameDirs2 = (i4 & 4) != 0 ? launchOptions.dirs : gameDirs;
        int i5 = (i4 & 8) != 0 ? launchOptions.memoryMb : i;
        int i6 = (i4 & 16) != 0 ? launchOptions.width : i2;
        int i7 = (i4 & 32) != 0 ? launchOptions.height : i3;
        boolean z2 = (i4 & 64) != 0 ? launchOptions.fullscreen : z;
        String str13 = (i4 & 128) != 0 ? launchOptions.defaultJvmArgs : str;
        String str14 = (i4 & 256) != 0 ? launchOptions.versionJvmArgs : str2;
        String str15 = (i4 & 512) != 0 ? launchOptions.versionGameArgs : str3;
        String str16 = (i4 & 1024) != 0 ? launchOptions.server : str4;
        String str17 = (i4 & 2048) != 0 ? launchOptions.port : str5;
        String str18 = (i4 & 4096) != 0 ? launchOptions.gc : str6;
        String str19 = (i4 & 8192) != 0 ? launchOptions.clientId : str7;
        Account account3 = account2;
        File file5 = (i4 & 16384) != 0 ? launchOptions.authlibJar : file2;
        File file6 = (i4 & 32768) != 0 ? launchOptions.nide8Jar : file3;
        String str20 = (i4 & 65536) != 0 ? launchOptions.authlibPrefetched : str8;
        RuleEnv ruleEnv2 = (i4 & 131072) != 0 ? launchOptions.env : ruleEnv;
        String str21 = (i4 & 262144) != 0 ? launchOptions.offlineSkinApi : str9;
        if ((i4 & 524288) != 0) {
            str12 = str21;
            str11 = launchOptions.offlineSkinPrefetched;
        } else {
            str11 = str10;
            str12 = str21;
        }
        return launchOptions.copy(account3, file4, gameDirs2, i5, i6, i7, z2, str13, str14, str15, str16, str17, str18, str19, file5, file6, str20, ruleEnv2, str12, str11);
    }

    /* renamed from: component1, reason: from getter */
    public final Account getAccount() {
        return this.account;
    }

    /* renamed from: component10, reason: from getter */
    public final String getVersionGameArgs() {
        return this.versionGameArgs;
    }

    /* renamed from: component11, reason: from getter */
    public final String getServer() {
        return this.server;
    }

    /* renamed from: component12, reason: from getter */
    public final String getPort() {
        return this.port;
    }

    /* renamed from: component13, reason: from getter */
    public final String getGc() {
        return this.gc;
    }

    /* renamed from: component14, reason: from getter */
    public final String getClientId() {
        return this.clientId;
    }

    /* renamed from: component15, reason: from getter */
    public final File getAuthlibJar() {
        return this.authlibJar;
    }

    /* renamed from: component16, reason: from getter */
    public final File getNide8Jar() {
        return this.nide8Jar;
    }

    /* renamed from: component17, reason: from getter */
    public final String getAuthlibPrefetched() {
        return this.authlibPrefetched;
    }

    /* renamed from: component18, reason: from getter */
    public final RuleEnv getEnv() {
        return this.env;
    }

    /* renamed from: component19, reason: from getter */
    public final String getOfflineSkinApi() {
        return this.offlineSkinApi;
    }

    /* renamed from: component2, reason: from getter */
    public final File getGameDir() {
        return this.gameDir;
    }

    /* renamed from: component20, reason: from getter */
    public final String getOfflineSkinPrefetched() {
        return this.offlineSkinPrefetched;
    }

    /* renamed from: component3, reason: from getter */
    public final GameDirs getDirs() {
        return this.dirs;
    }

    /* renamed from: component4, reason: from getter */
    public final int getMemoryMb() {
        return this.memoryMb;
    }

    /* renamed from: component5, reason: from getter */
    public final int getWidth() {
        return this.width;
    }

    /* renamed from: component6, reason: from getter */
    public final int getHeight() {
        return this.height;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getFullscreen() {
        return this.fullscreen;
    }

    /* renamed from: component8, reason: from getter */
    public final String getDefaultJvmArgs() {
        return this.defaultJvmArgs;
    }

    /* renamed from: component9, reason: from getter */
    public final String getVersionJvmArgs() {
        return this.versionJvmArgs;
    }

    public final LaunchOptions copy(Account account, File gameDir, GameDirs dirs, int memoryMb, int width, int height, boolean fullscreen, String defaultJvmArgs, String versionJvmArgs, String versionGameArgs, String server, String port, String gc, String clientId, File authlibJar, File nide8Jar, String authlibPrefetched, RuleEnv env, String offlineSkinApi, String offlineSkinPrefetched) {
        Intrinsics.checkNotNullParameter(account, "account");
        Intrinsics.checkNotNullParameter(gameDir, "gameDir");
        Intrinsics.checkNotNullParameter(dirs, "dirs");
        Intrinsics.checkNotNullParameter(defaultJvmArgs, "defaultJvmArgs");
        Intrinsics.checkNotNullParameter(versionJvmArgs, "versionJvmArgs");
        Intrinsics.checkNotNullParameter(versionGameArgs, "versionGameArgs");
        Intrinsics.checkNotNullParameter(server, "server");
        Intrinsics.checkNotNullParameter(port, "port");
        Intrinsics.checkNotNullParameter(gc, "gc");
        Intrinsics.checkNotNullParameter(clientId, "clientId");
        Intrinsics.checkNotNullParameter(env, "env");
        return new LaunchOptions(account, gameDir, dirs, memoryMb, width, height, fullscreen, defaultJvmArgs, versionJvmArgs, versionGameArgs, server, port, gc, clientId, authlibJar, nide8Jar, authlibPrefetched, env, offlineSkinApi, offlineSkinPrefetched);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LaunchOptions)) {
            return false;
        }
        LaunchOptions launchOptions = (LaunchOptions) other;
        return Intrinsics.areEqual(this.account, launchOptions.account) && Intrinsics.areEqual(this.gameDir, launchOptions.gameDir) && Intrinsics.areEqual(this.dirs, launchOptions.dirs) && this.memoryMb == launchOptions.memoryMb && this.width == launchOptions.width && this.height == launchOptions.height && this.fullscreen == launchOptions.fullscreen && Intrinsics.areEqual(this.defaultJvmArgs, launchOptions.defaultJvmArgs) && Intrinsics.areEqual(this.versionJvmArgs, launchOptions.versionJvmArgs) && Intrinsics.areEqual(this.versionGameArgs, launchOptions.versionGameArgs) && Intrinsics.areEqual(this.server, launchOptions.server) && Intrinsics.areEqual(this.port, launchOptions.port) && Intrinsics.areEqual(this.gc, launchOptions.gc) && Intrinsics.areEqual(this.clientId, launchOptions.clientId) && Intrinsics.areEqual(this.authlibJar, launchOptions.authlibJar) && Intrinsics.areEqual(this.nide8Jar, launchOptions.nide8Jar) && Intrinsics.areEqual(this.authlibPrefetched, launchOptions.authlibPrefetched) && Intrinsics.areEqual(this.env, launchOptions.env) && Intrinsics.areEqual(this.offlineSkinApi, launchOptions.offlineSkinApi) && Intrinsics.areEqual(this.offlineSkinPrefetched, launchOptions.offlineSkinPrefetched);
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((this.account.hashCode() * 31) + this.gameDir.hashCode()) * 31) + this.dirs.hashCode()) * 31) + Integer.hashCode(this.memoryMb)) * 31) + Integer.hashCode(this.width)) * 31) + Integer.hashCode(this.height)) * 31) + Boolean.hashCode(this.fullscreen)) * 31) + this.defaultJvmArgs.hashCode()) * 31) + this.versionJvmArgs.hashCode()) * 31) + this.versionGameArgs.hashCode()) * 31) + this.server.hashCode()) * 31) + this.port.hashCode()) * 31) + this.gc.hashCode()) * 31) + this.clientId.hashCode()) * 31) + (this.authlibJar == null ? 0 : this.authlibJar.hashCode())) * 31) + (this.nide8Jar == null ? 0 : this.nide8Jar.hashCode())) * 31) + (this.authlibPrefetched == null ? 0 : this.authlibPrefetched.hashCode())) * 31) + this.env.hashCode()) * 31) + (this.offlineSkinApi == null ? 0 : this.offlineSkinApi.hashCode())) * 31) + (this.offlineSkinPrefetched != null ? this.offlineSkinPrefetched.hashCode() : 0);
    }

    public String toString() {
        return "LaunchOptions(account=" + this.account + ", gameDir=" + this.gameDir + ", dirs=" + this.dirs + ", memoryMb=" + this.memoryMb + ", width=" + this.width + ", height=" + this.height + ", fullscreen=" + this.fullscreen + ", defaultJvmArgs=" + this.defaultJvmArgs + ", versionJvmArgs=" + this.versionJvmArgs + ", versionGameArgs=" + this.versionGameArgs + ", server=" + this.server + ", port=" + this.port + ", gc=" + this.gc + ", clientId=" + this.clientId + ", authlibJar=" + this.authlibJar + ", nide8Jar=" + this.nide8Jar + ", authlibPrefetched=" + this.authlibPrefetched + ", env=" + this.env + ", offlineSkinApi=" + this.offlineSkinApi + ", offlineSkinPrefetched=" + this.offlineSkinPrefetched + ")";
    }

    public LaunchOptions(Account account, File gameDir, GameDirs dirs, int memoryMb, int width, int height, boolean fullscreen, String defaultJvmArgs, String versionJvmArgs, String versionGameArgs, String server, String port, String gc, String clientId, File authlibJar, File nide8Jar, String authlibPrefetched, RuleEnv env, String offlineSkinApi, String offlineSkinPrefetched) {
        Intrinsics.checkNotNullParameter(account, "account");
        Intrinsics.checkNotNullParameter(gameDir, "gameDir");
        Intrinsics.checkNotNullParameter(dirs, "dirs");
        Intrinsics.checkNotNullParameter(defaultJvmArgs, "defaultJvmArgs");
        Intrinsics.checkNotNullParameter(versionJvmArgs, "versionJvmArgs");
        Intrinsics.checkNotNullParameter(versionGameArgs, "versionGameArgs");
        Intrinsics.checkNotNullParameter(server, "server");
        Intrinsics.checkNotNullParameter(port, "port");
        Intrinsics.checkNotNullParameter(gc, "gc");
        Intrinsics.checkNotNullParameter(clientId, "clientId");
        Intrinsics.checkNotNullParameter(env, "env");
        this.account = account;
        this.gameDir = gameDir;
        this.dirs = dirs;
        this.memoryMb = memoryMb;
        this.width = width;
        this.height = height;
        this.fullscreen = fullscreen;
        this.defaultJvmArgs = defaultJvmArgs;
        this.versionJvmArgs = versionJvmArgs;
        this.versionGameArgs = versionGameArgs;
        this.server = server;
        this.port = port;
        this.gc = gc;
        this.clientId = clientId;
        this.authlibJar = authlibJar;
        this.nide8Jar = nide8Jar;
        this.authlibPrefetched = authlibPrefetched;
        this.env = env;
        this.offlineSkinApi = offlineSkinApi;
        this.offlineSkinPrefetched = offlineSkinPrefetched;
    }

    public /* synthetic */ LaunchOptions(Account account, File file, GameDirs gameDirs, int i, int i2, int i3, boolean z, String str, String str2, String str3, String str4, String str5, String str6, String str7, File file2, File file3, String str8, RuleEnv ruleEnv, String str9, String str10, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(account, file, gameDirs, (i4 & 8) != 0 ? 4096 : i, (i4 & 16) != 0 ? 854 : i2, (i4 & 32) != 0 ? 480 : i3, (i4 & 64) != 0 ? false : z, (i4 & 128) != 0 ? "" : str, (i4 & 256) != 0 ? "" : str2, (i4 & 512) != 0 ? "" : str3, (i4 & 1024) != 0 ? "" : str4, (i4 & 2048) != 0 ? "" : str5, (i4 & 4096) != 0 ? DebugKt.DEBUG_PROPERTY_VALUE_AUTO : str6, (i4 & 8192) != 0 ? "00000000402b5328" : str7, (i4 & 16384) != 0 ? null : file2, (32768 & i4) != 0 ? null : file3, (65536 & i4) != 0 ? null : str8, (131072 & i4) != 0 ? new RuleEnv(null, null, null, null, 15, null) : ruleEnv, (262144 & i4) != 0 ? null : str9, (i4 & 524288) != 0 ? null : str10);
    }

    public final Account getAccount() {
        return this.account;
    }

    public final GameDirs getDirs() {
        return this.dirs;
    }

    public final File getGameDir() {
        return this.gameDir;
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getMemoryMb() {
        return this.memoryMb;
    }

    public final int getWidth() {
        return this.width;
    }

    public final String getDefaultJvmArgs() {
        return this.defaultJvmArgs;
    }

    public final boolean getFullscreen() {
        return this.fullscreen;
    }

    public final String getVersionGameArgs() {
        return this.versionGameArgs;
    }

    public final String getVersionJvmArgs() {
        return this.versionJvmArgs;
    }

    public final String getClientId() {
        return this.clientId;
    }

    public final String getGc() {
        return this.gc;
    }

    public final String getPort() {
        return this.port;
    }

    public final String getServer() {
        return this.server;
    }

    public final File getAuthlibJar() {
        return this.authlibJar;
    }

    public final String getAuthlibPrefetched() {
        return this.authlibPrefetched;
    }

    public final RuleEnv getEnv() {
        return this.env;
    }

    public final File getNide8Jar() {
        return this.nide8Jar;
    }

    public final String getOfflineSkinApi() {
        return this.offlineSkinApi;
    }

    public final String getOfflineSkinPrefetched() {
        return this.offlineSkinPrefetched;
    }
}
