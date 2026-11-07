package com.pymcl.runtime;

import android.content.Context;
import android.os.Build;
import android.util.DisplayMetrics;
import com.mio.plugin.NativeLibPlugin;
import com.pymcl.core.util.FileUtil;
import com.tungsten.fclauncher.FCLauncher;
import com.tungsten.fclauncher.utils.FCLPath;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* compiled from: FclLaunchArgs.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002'(B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J0\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u000bJ\u0010\u0010\r\u001a\u00020\t2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006J\u001c\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00102\u0006\u0010\u0012\u001a\u00020\u0006J0\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0006J\u001c\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\u00102\b\u0010\u0017\u001a\u0004\u0018\u00010\u0006J\u001c\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\tJp\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u001d\u001a\u00020\u00062\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\t2\u0006\u0010!\u001a\u00020\"2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0006J \u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020%2\u0006\u0010\u001f\u001a\u00020\u00062\b\u0010&\u001a\u0004\u0018\u00010\u0006¨\u0006)"}, d2 = {"Lcom/pymcl/runtime/FclLaunchArgs;", "", "<init>", "()V", "cacioArgs", "", "", "screenSize", "isJava8", "", "cacioDir", "Ljava/io/File;", "agentJar", "supportsQuickPlay", "mcVersion", "splitAddress", "Lkotlin/Pair;", "", "address", "applyServer", "gameArgs", "server", "pickLwjgl", "versionLwjgl", "lwjglClasspath", "dir", "useLwjglX", "rewrite", "jvmArgs", "mainClass", "javaMajor", "gameDir", "lwjglVersion", "env", "Lcom/pymcl/runtime/FclLaunchArgs$Env;", "envFor", "context", "Landroid/content/Context;", "jnaVersion", "Env", "LibPatcher", "PyMCL-Android:runtime_debug"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class FclLaunchArgs {
    public static final FclLaunchArgs INSTANCE = new FclLaunchArgs();

    /* compiled from: FclLaunchArgs.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b6\b\u0086\b\u0018\u00002\u00020\u0001BÏ\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\b\b\u0002\u0010\r\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\u0014\b\u0002\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0013\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0019\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u001b¢\u0006\u0004\b\u001c\u0010\u001dJ\t\u00108\u001a\u00020\u0003HÆ\u0003J\t\u00109\u001a\u00020\u0003HÆ\u0003J\t\u0010:\u001a\u00020\u0006HÆ\u0003J\t\u0010;\u001a\u00020\u0006HÆ\u0003J\t\u0010<\u001a\u00020\u0006HÆ\u0003J\t\u0010=\u001a\u00020\u0006HÆ\u0003J\t\u0010>\u001a\u00020\u0006HÆ\u0003J\t\u0010?\u001a\u00020\u0006HÆ\u0003J\t\u0010@\u001a\u00020\u0006HÆ\u0003J\t\u0010A\u001a\u00020\u0006HÆ\u0003J\t\u0010B\u001a\u00020\u0006HÆ\u0003J\t\u0010C\u001a\u00020\u0006HÆ\u0003J\t\u0010D\u001a\u00020\u0011HÆ\u0003J\u0015\u0010E\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0013HÆ\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010H\u001a\u00020\u0006HÆ\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010J\u001a\u00020\u0019HÆ\u0003J\t\u0010K\u001a\u00020\u001bHÆ\u0003Jã\u0001\u0010L\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u00062\b\b\u0002\u0010\u0010\u001a\u00020\u00112\u0014\b\u0002\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u00062\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001bHÆ\u0001J\u0014\u0010M\u001a\u00020\u001b2\b\u0010N\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010O\u001a\u00020\u0011HÖ\u0081\u0004J\n\u0010P\u001a\u00020\u0006HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\"R\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\"R\u0011\u0010\t\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\"R\u0011\u0010\n\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\"R\u0011\u0010\u000b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\"R\u0011\u0010\f\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\"R\u0011\u0010\r\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\"R\u0011\u0010\u000e\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\"R\u0011\u0010\u000f\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\"R\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u001d\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0013¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b0\u0010\u001fR\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b1\u0010\u001fR\u0011\u0010\u0016\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b2\u0010\"R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b3\u0010\u001fR\u0011\u0010\u0018\u001a\u00020\u0019¢\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u0011\u0010\u001a\u001a\u00020\u001b¢\u0006\b\n\u0000\u001a\u0004\b6\u00107¨\u0006Q"}, d2 = {"Lcom/pymcl/runtime/FclLaunchArgs$Env;", "", "lwjglDir", "Ljava/io/File;", "wrapperJar", "cacheDir", "", "javaDir", "nativeLibDir", "archAndroid", "androidRelease", "cpuName", "jnaBootPath", "language", "country", "timezone", "cpus", "", "extraJvmEnv", "", "cacio8Dir", "cacio17Dir", "screenSize", "libPatcherJar", "libPatcher", "Lcom/pymcl/runtime/FclLaunchArgs$LibPatcher;", "requireLibPatcherFile", "", "<init>", "(Ljava/io/File;Ljava/io/File;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/Map;Ljava/io/File;Ljava/io/File;Ljava/lang/String;Ljava/io/File;Lcom/pymcl/runtime/FclLaunchArgs$LibPatcher;Z)V", "getLwjglDir", "()Ljava/io/File;", "getWrapperJar", "getCacheDir", "()Ljava/lang/String;", "getJavaDir", "getNativeLibDir", "getArchAndroid", "getAndroidRelease", "getCpuName", "getJnaBootPath", "getLanguage", "getCountry", "getTimezone", "getCpus", "()I", "getExtraJvmEnv", "()Ljava/util/Map;", "getCacio8Dir", "getCacio17Dir", "getScreenSize", "getLibPatcherJar", "getLibPatcher", "()Lcom/pymcl/runtime/FclLaunchArgs$LibPatcher;", "getRequireLibPatcherFile", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "copy", "equals", "other", "hashCode", "toString", "PyMCL-Android:runtime_debug"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class Env {
        private final String androidRelease;
        private final String archAndroid;
        private final String cacheDir;
        private final File cacio17Dir;
        private final File cacio8Dir;
        private final String country;
        private final String cpuName;
        private final int cpus;
        private final Map<String, String> extraJvmEnv;
        private final String javaDir;
        private final String jnaBootPath;
        private final String language;
        private final LibPatcher libPatcher;
        private final File libPatcherJar;
        private final File lwjglDir;
        private final String nativeLibDir;
        private final boolean requireLibPatcherFile;
        private final String screenSize;
        private final String timezone;
        private final File wrapperJar;

        public static /* synthetic */ Env copy$default(Env env, File file, File file2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i, Map map, File file3, File file4, String str11, File file5, LibPatcher libPatcher, boolean z, int i2, Object obj) {
            boolean z2;
            LibPatcher libPatcher2;
            File file6 = (i2 & 1) != 0 ? env.lwjglDir : file;
            File file7 = (i2 & 2) != 0 ? env.wrapperJar : file2;
            String str12 = (i2 & 4) != 0 ? env.cacheDir : str;
            String str13 = (i2 & 8) != 0 ? env.javaDir : str2;
            String str14 = (i2 & 16) != 0 ? env.nativeLibDir : str3;
            String str15 = (i2 & 32) != 0 ? env.archAndroid : str4;
            String str16 = (i2 & 64) != 0 ? env.androidRelease : str5;
            String str17 = (i2 & 128) != 0 ? env.cpuName : str6;
            String str18 = (i2 & 256) != 0 ? env.jnaBootPath : str7;
            String str19 = (i2 & 512) != 0 ? env.language : str8;
            String str20 = (i2 & 1024) != 0 ? env.country : str9;
            String str21 = (i2 & 2048) != 0 ? env.timezone : str10;
            int i3 = (i2 & 4096) != 0 ? env.cpus : i;
            Map map2 = (i2 & 8192) != 0 ? env.extraJvmEnv : map;
            File file8 = file6;
            File file9 = (i2 & 16384) != 0 ? env.cacio8Dir : file3;
            File file10 = (i2 & 32768) != 0 ? env.cacio17Dir : file4;
            String str22 = (i2 & 65536) != 0 ? env.screenSize : str11;
            File file11 = (i2 & 131072) != 0 ? env.libPatcherJar : file5;
            LibPatcher libPatcher3 = (i2 & 262144) != 0 ? env.libPatcher : libPatcher;
            if ((i2 & 524288) != 0) {
                libPatcher2 = libPatcher3;
                z2 = env.requireLibPatcherFile;
            } else {
                z2 = z;
                libPatcher2 = libPatcher3;
            }
            return env.copy(file8, file7, str12, str13, str14, str15, str16, str17, str18, str19, str20, str21, i3, map2, file9, file10, str22, file11, libPatcher2, z2);
        }

        /* renamed from: component1, reason: from getter */
        public final File getLwjglDir() {
            return this.lwjglDir;
        }

        /* renamed from: component10, reason: from getter */
        public final String getLanguage() {
            return this.language;
        }

        /* renamed from: component11, reason: from getter */
        public final String getCountry() {
            return this.country;
        }

        /* renamed from: component12, reason: from getter */
        public final String getTimezone() {
            return this.timezone;
        }

        /* renamed from: component13, reason: from getter */
        public final int getCpus() {
            return this.cpus;
        }

        public final Map<String, String> component14() {
            return this.extraJvmEnv;
        }

        /* renamed from: component15, reason: from getter */
        public final File getCacio8Dir() {
            return this.cacio8Dir;
        }

        /* renamed from: component16, reason: from getter */
        public final File getCacio17Dir() {
            return this.cacio17Dir;
        }

        /* renamed from: component17, reason: from getter */
        public final String getScreenSize() {
            return this.screenSize;
        }

        /* renamed from: component18, reason: from getter */
        public final File getLibPatcherJar() {
            return this.libPatcherJar;
        }

        /* renamed from: component19, reason: from getter */
        public final LibPatcher getLibPatcher() {
            return this.libPatcher;
        }

        /* renamed from: component2, reason: from getter */
        public final File getWrapperJar() {
            return this.wrapperJar;
        }

        /* renamed from: component20, reason: from getter */
        public final boolean getRequireLibPatcherFile() {
            return this.requireLibPatcherFile;
        }

        /* renamed from: component3, reason: from getter */
        public final String getCacheDir() {
            return this.cacheDir;
        }

        /* renamed from: component4, reason: from getter */
        public final String getJavaDir() {
            return this.javaDir;
        }

        /* renamed from: component5, reason: from getter */
        public final String getNativeLibDir() {
            return this.nativeLibDir;
        }

        /* renamed from: component6, reason: from getter */
        public final String getArchAndroid() {
            return this.archAndroid;
        }

        /* renamed from: component7, reason: from getter */
        public final String getAndroidRelease() {
            return this.androidRelease;
        }

        /* renamed from: component8, reason: from getter */
        public final String getCpuName() {
            return this.cpuName;
        }

        /* renamed from: component9, reason: from getter */
        public final String getJnaBootPath() {
            return this.jnaBootPath;
        }

        public final Env copy(File lwjglDir, File wrapperJar, String cacheDir, String javaDir, String nativeLibDir, String archAndroid, String androidRelease, String cpuName, String jnaBootPath, String language, String country, String timezone, int cpus, Map<String, String> extraJvmEnv, File cacio8Dir, File cacio17Dir, String screenSize, File libPatcherJar, LibPatcher libPatcher, boolean requireLibPatcherFile) {
            Intrinsics.checkNotNullParameter(lwjglDir, "lwjglDir");
            Intrinsics.checkNotNullParameter(wrapperJar, "wrapperJar");
            Intrinsics.checkNotNullParameter(cacheDir, "cacheDir");
            Intrinsics.checkNotNullParameter(javaDir, "javaDir");
            Intrinsics.checkNotNullParameter(nativeLibDir, "nativeLibDir");
            Intrinsics.checkNotNullParameter(archAndroid, "archAndroid");
            Intrinsics.checkNotNullParameter(androidRelease, "androidRelease");
            Intrinsics.checkNotNullParameter(cpuName, "cpuName");
            Intrinsics.checkNotNullParameter(jnaBootPath, "jnaBootPath");
            Intrinsics.checkNotNullParameter(language, "language");
            Intrinsics.checkNotNullParameter(country, "country");
            Intrinsics.checkNotNullParameter(timezone, "timezone");
            Intrinsics.checkNotNullParameter(extraJvmEnv, "extraJvmEnv");
            Intrinsics.checkNotNullParameter(screenSize, "screenSize");
            Intrinsics.checkNotNullParameter(libPatcher, "libPatcher");
            return new Env(lwjglDir, wrapperJar, cacheDir, javaDir, nativeLibDir, archAndroid, androidRelease, cpuName, jnaBootPath, language, country, timezone, cpus, extraJvmEnv, cacio8Dir, cacio17Dir, screenSize, libPatcherJar, libPatcher, requireLibPatcherFile);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Env)) {
                return false;
            }
            Env env = (Env) other;
            return Intrinsics.areEqual(this.lwjglDir, env.lwjglDir) && Intrinsics.areEqual(this.wrapperJar, env.wrapperJar) && Intrinsics.areEqual(this.cacheDir, env.cacheDir) && Intrinsics.areEqual(this.javaDir, env.javaDir) && Intrinsics.areEqual(this.nativeLibDir, env.nativeLibDir) && Intrinsics.areEqual(this.archAndroid, env.archAndroid) && Intrinsics.areEqual(this.androidRelease, env.androidRelease) && Intrinsics.areEqual(this.cpuName, env.cpuName) && Intrinsics.areEqual(this.jnaBootPath, env.jnaBootPath) && Intrinsics.areEqual(this.language, env.language) && Intrinsics.areEqual(this.country, env.country) && Intrinsics.areEqual(this.timezone, env.timezone) && this.cpus == env.cpus && Intrinsics.areEqual(this.extraJvmEnv, env.extraJvmEnv) && Intrinsics.areEqual(this.cacio8Dir, env.cacio8Dir) && Intrinsics.areEqual(this.cacio17Dir, env.cacio17Dir) && Intrinsics.areEqual(this.screenSize, env.screenSize) && Intrinsics.areEqual(this.libPatcherJar, env.libPatcherJar) && Intrinsics.areEqual(this.libPatcher, env.libPatcher) && this.requireLibPatcherFile == env.requireLibPatcherFile;
        }

        public int hashCode() {
            return (((((((((((((((((((((((((((((((((((((this.lwjglDir.hashCode() * 31) + this.wrapperJar.hashCode()) * 31) + this.cacheDir.hashCode()) * 31) + this.javaDir.hashCode()) * 31) + this.nativeLibDir.hashCode()) * 31) + this.archAndroid.hashCode()) * 31) + this.androidRelease.hashCode()) * 31) + this.cpuName.hashCode()) * 31) + this.jnaBootPath.hashCode()) * 31) + this.language.hashCode()) * 31) + this.country.hashCode()) * 31) + this.timezone.hashCode()) * 31) + Integer.hashCode(this.cpus)) * 31) + this.extraJvmEnv.hashCode()) * 31) + (this.cacio8Dir == null ? 0 : this.cacio8Dir.hashCode())) * 31) + (this.cacio17Dir == null ? 0 : this.cacio17Dir.hashCode())) * 31) + this.screenSize.hashCode()) * 31) + (this.libPatcherJar != null ? this.libPatcherJar.hashCode() : 0)) * 31) + this.libPatcher.hashCode()) * 31) + Boolean.hashCode(this.requireLibPatcherFile);
        }

        public String toString() {
            return "Env(lwjglDir=" + this.lwjglDir + ", wrapperJar=" + this.wrapperJar + ", cacheDir=" + this.cacheDir + ", javaDir=" + this.javaDir + ", nativeLibDir=" + this.nativeLibDir + ", archAndroid=" + this.archAndroid + ", androidRelease=" + this.androidRelease + ", cpuName=" + this.cpuName + ", jnaBootPath=" + this.jnaBootPath + ", language=" + this.language + ", country=" + this.country + ", timezone=" + this.timezone + ", cpus=" + this.cpus + ", extraJvmEnv=" + this.extraJvmEnv + ", cacio8Dir=" + this.cacio8Dir + ", cacio17Dir=" + this.cacio17Dir + ", screenSize=" + this.screenSize + ", libPatcherJar=" + this.libPatcherJar + ", libPatcher=" + this.libPatcher + ", requireLibPatcherFile=" + this.requireLibPatcherFile + ")";
        }

        public Env(File lwjglDir, File wrapperJar, String cacheDir, String javaDir, String nativeLibDir, String archAndroid, String androidRelease, String cpuName, String jnaBootPath, String language, String country, String timezone, int cpus, Map<String, String> extraJvmEnv, File cacio8Dir, File cacio17Dir, String screenSize, File libPatcherJar, LibPatcher libPatcher, boolean requireLibPatcherFile) {
            Intrinsics.checkNotNullParameter(lwjglDir, "lwjglDir");
            Intrinsics.checkNotNullParameter(wrapperJar, "wrapperJar");
            Intrinsics.checkNotNullParameter(cacheDir, "cacheDir");
            Intrinsics.checkNotNullParameter(javaDir, "javaDir");
            Intrinsics.checkNotNullParameter(nativeLibDir, "nativeLibDir");
            Intrinsics.checkNotNullParameter(archAndroid, "archAndroid");
            Intrinsics.checkNotNullParameter(androidRelease, "androidRelease");
            Intrinsics.checkNotNullParameter(cpuName, "cpuName");
            Intrinsics.checkNotNullParameter(jnaBootPath, "jnaBootPath");
            Intrinsics.checkNotNullParameter(language, "language");
            Intrinsics.checkNotNullParameter(country, "country");
            Intrinsics.checkNotNullParameter(timezone, "timezone");
            Intrinsics.checkNotNullParameter(extraJvmEnv, "extraJvmEnv");
            Intrinsics.checkNotNullParameter(screenSize, "screenSize");
            Intrinsics.checkNotNullParameter(libPatcher, "libPatcher");
            this.lwjglDir = lwjglDir;
            this.wrapperJar = wrapperJar;
            this.cacheDir = cacheDir;
            this.javaDir = javaDir;
            this.nativeLibDir = nativeLibDir;
            this.archAndroid = archAndroid;
            this.androidRelease = androidRelease;
            this.cpuName = cpuName;
            this.jnaBootPath = jnaBootPath;
            this.language = language;
            this.country = country;
            this.timezone = timezone;
            this.cpus = cpus;
            this.extraJvmEnv = extraJvmEnv;
            this.cacio8Dir = cacio8Dir;
            this.cacio17Dir = cacio17Dir;
            this.screenSize = screenSize;
            this.libPatcherJar = libPatcherJar;
            this.libPatcher = libPatcher;
            this.requireLibPatcherFile = requireLibPatcherFile;
        }

        public /* synthetic */ Env(File file, File file2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i, Map map, File file3, File file4, String str11, File file5, LibPatcher libPatcher, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(file, file2, str, str2, str3, str4, str5, str6, str7, (i2 & 512) != 0 ? "zh" : str8, (i2 & 1024) != 0 ? "CN" : str9, (i2 & 2048) != 0 ? "Asia/Shanghai" : str10, (i2 & 4096) != 0 ? 2 : i, (i2 & 8192) != 0 ? MapsKt.emptyMap() : map, (i2 & 16384) != 0 ? null : file3, (32768 & i2) != 0 ? null : file4, (65536 & i2) != 0 ? "1280x720" : str11, (131072 & i2) != 0 ? null : file5, (262144 & i2) != 0 ? new LibPatcher(false, false, false, false, 15, null) : libPatcher, (i2 & 524288) != 0 ? false : z);
        }

        public final String getCacheDir() {
            return this.cacheDir;
        }

        public final String getJavaDir() {
            return this.javaDir;
        }

        public final File getLwjglDir() {
            return this.lwjglDir;
        }

        public final String getNativeLibDir() {
            return this.nativeLibDir;
        }

        public final File getWrapperJar() {
            return this.wrapperJar;
        }

        public final String getAndroidRelease() {
            return this.androidRelease;
        }

        public final String getArchAndroid() {
            return this.archAndroid;
        }

        public final String getCpuName() {
            return this.cpuName;
        }

        public final String getJnaBootPath() {
            return this.jnaBootPath;
        }

        public final String getCountry() {
            return this.country;
        }

        public final int getCpus() {
            return this.cpus;
        }

        public final String getLanguage() {
            return this.language;
        }

        public final String getTimezone() {
            return this.timezone;
        }

        public final Map<String, String> getExtraJvmEnv() {
            return this.extraJvmEnv;
        }

        public final File getCacio17Dir() {
            return this.cacio17Dir;
        }

        public final File getCacio8Dir() {
            return this.cacio8Dir;
        }

        public final String getScreenSize() {
            return this.screenSize;
        }

        public final LibPatcher getLibPatcher() {
            return this.libPatcher;
        }

        public final File getLibPatcherJar() {
            return this.libPatcherJar;
        }

        public final boolean getRequireLibPatcherFile() {
            return this.requireLibPatcherFile;
        }
    }

    private FclLaunchArgs() {
    }

    /* compiled from: FclLaunchArgs.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J1\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u0016\u001a\u00020\u00032\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0018\u001a\u00020\u0019HÖ\u0081\u0004J\n\u0010\u001a\u001a\u00020\u0010HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u001b"}, d2 = {"Lcom/pymcl/runtime/FclLaunchArgs$LibPatcher;", "", "enabled", "", "alc10", "asmBackport", "sablerapier", "<init>", "(ZZZZ)V", "getEnabled", "()Z", "getAlc10", "getAsmBackport", "getSablerapier", "jvmOptions", "", "", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "PyMCL-Android:runtime_debug"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class LibPatcher {
        private final boolean alc10;
        private final boolean asmBackport;
        private final boolean enabled;
        private final boolean sablerapier;

        public LibPatcher() {
            this(false, false, false, false, 15, null);
        }

        public static /* synthetic */ LibPatcher copy$default(LibPatcher libPatcher, boolean z, boolean z2, boolean z3, boolean z4, int i, Object obj) {
            if ((i & 1) != 0) {
                z = libPatcher.enabled;
            }
            if ((i & 2) != 0) {
                z2 = libPatcher.alc10;
            }
            if ((i & 4) != 0) {
                z3 = libPatcher.asmBackport;
            }
            if ((i & 8) != 0) {
                z4 = libPatcher.sablerapier;
            }
            return libPatcher.copy(z, z2, z3, z4);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getEnabled() {
            return this.enabled;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getAlc10() {
            return this.alc10;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getAsmBackport() {
            return this.asmBackport;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getSablerapier() {
            return this.sablerapier;
        }

        public final LibPatcher copy(boolean enabled, boolean alc10, boolean asmBackport, boolean sablerapier) {
            return new LibPatcher(enabled, alc10, asmBackport, sablerapier);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LibPatcher)) {
                return false;
            }
            LibPatcher libPatcher = (LibPatcher) other;
            return this.enabled == libPatcher.enabled && this.alc10 == libPatcher.alc10 && this.asmBackport == libPatcher.asmBackport && this.sablerapier == libPatcher.sablerapier;
        }

        public int hashCode() {
            return (((((Boolean.hashCode(this.enabled) * 31) + Boolean.hashCode(this.alc10)) * 31) + Boolean.hashCode(this.asmBackport)) * 31) + Boolean.hashCode(this.sablerapier);
        }

        public String toString() {
            return "LibPatcher(enabled=" + this.enabled + ", alc10=" + this.alc10 + ", asmBackport=" + this.asmBackport + ", sablerapier=" + this.sablerapier + ")";
        }

        public LibPatcher(boolean enabled, boolean alc10, boolean asmBackport, boolean sablerapier) {
            this.enabled = enabled;
            this.alc10 = alc10;
            this.asmBackport = asmBackport;
            this.sablerapier = sablerapier;
        }

        public /* synthetic */ LibPatcher(boolean z, boolean z2, boolean z3, boolean z4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? true : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3, (i & 8) != 0 ? true : z4);
        }

        public final boolean getAlc10() {
            return this.alc10;
        }

        public final boolean getAsmBackport() {
            return this.asmBackport;
        }

        public final boolean getEnabled() {
            return this.enabled;
        }

        public final boolean getSablerapier() {
            return this.sablerapier;
        }

        public final List<String> jvmOptions() {
            List $this$jvmOptions_u24lambda_u240 = CollectionsKt.createListBuilder();
            if (this.alc10) {
                $this$jvmOptions_u24lambda_u240.add("-Dmiolibpatcher.alc10=true");
            }
            if (!this.sablerapier) {
                $this$jvmOptions_u24lambda_u240.add("-Dmiolibpatcher.sablerapier=false");
            }
            if (this.asmBackport) {
                $this$jvmOptions_u24lambda_u240.add("-Dmiolibpatcher.asmBackport=true");
            }
            return CollectionsKt.build($this$jvmOptions_u24lambda_u240);
        }
    }

    public final List<String> cacioArgs(String screenSize, boolean isJava8, File cacioDir, File agentJar) {
        ArrayList arrayList;
        File[] fileArrListFiles;
        Intrinsics.checkNotNullParameter(screenSize, "screenSize");
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add("-Djava.awt.headless=false");
        arrayList2.add("-Dcacio.managed.screensize=" + screenSize);
        arrayList2.add("-Dcacio.font.fontmanager=sun.awt.X11FontManager");
        arrayList2.add("-Dcacio.font.fontscaler=sun.font.FreetypeFontScaler");
        arrayList2.add("-Dswing.defaultlaf=javax.swing.plaf.nimbus.NimbusLookAndFeel");
        if (isJava8) {
            arrayList2.add("-Dawt.toolkit=net.java.openjdk.cacio.ctc.CTCToolkit");
            arrayList2.add("-Djava.awt.graphicsenv=net.java.openjdk.cacio.ctc.CTCGraphicsEnvironment");
        } else {
            arrayList2.add("-Dawt.toolkit=com.github.caciocavallosilano.cacio.ctc.CTCToolkit");
            arrayList2.add("-Djava.awt.graphicsenv=com.github.caciocavallosilano.cacio.ctc.CTCGraphicsEnvironment");
            if (agentJar != null) {
                arrayList2.add("-javaagent:" + FileUtil.INSTANCE.toLaunchPath(agentJar));
            }
            boolean z = true;
            char c = 3;
            char c2 = 4;
            Iterator it = CollectionsKt.listOf((Object[]) new String[]{"java.desktop/java.awt", "java.desktop/java.awt.peer", "java.desktop/sun.awt.image", "java.desktop/sun.java2d", "java.desktop/java.awt.dnd.peer", "java.desktop/sun.awt", "java.desktop/sun.awt.event", "java.desktop/sun.awt.datatransfer", "java.desktop/sun.font", "java.base/sun.security.action"}).iterator();
            while (it.hasNext()) {
                arrayList2.add("--add-exports=" + ((String) it.next()) + "=ALL-UNNAMED");
                c = c;
                z = z;
                c2 = c2;
            }
            String[] strArr = new String[6];
            strArr[0] = "java.base/java.util";
            strArr[z ? 1 : 0] = "java.desktop/java.awt";
            strArr[2] = "java.desktop/sun.font";
            strArr[c] = "java.desktop/sun.java2d";
            strArr[c2] = "java.base/java.lang.reflect";
            strArr[5] = "java.base/java.net";
            Iterator it2 = CollectionsKt.listOf((Object[]) strArr).iterator();
            while (it2.hasNext()) {
                arrayList2.add("--add-opens=" + ((String) it2.next()) + "=ALL-UNNAMED");
            }
        }
        StringBuilder sbAppend = new StringBuilder("-Xbootclasspath/").append(isJava8 ? "p" : "a");
        if (cacioDir == null || (fileArrListFiles = cacioDir.listFiles()) == null) {
            arrayList = arrayList2;
        } else {
            ArrayList arrayList3 = new ArrayList();
            int length = fileArrListFiles.length;
            int i = 0;
            while (i < length) {
                File file = fileArrListFiles[i];
                String name = file.getName();
                Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                ArrayList arrayList4 = arrayList2;
                if (StringsKt.endsWith$default(name, ".jar", false, 2, (Object) null)) {
                    arrayList3.add(file);
                }
                i++;
                arrayList2 = arrayList4;
            }
            arrayList = arrayList2;
            List<File> listSortedWith = CollectionsKt.sortedWith(arrayList3, new Comparator() { // from class: com.pymcl.runtime.FclLaunchArgs$cacioArgs$$inlined$sortedBy$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    File it3 = (File) t;
                    File it4 = (File) t2;
                    return ComparisonsKt.compareValues(it3.getName(), it4.getName());
                }
            });
            if (listSortedWith != null) {
                for (File file2 : listSortedWith) {
                    StringBuilder sbAppend2 = sbAppend.append(':');
                    FileUtil fileUtil = FileUtil.INSTANCE;
                    Intrinsics.checkNotNull(file2);
                    sbAppend2.append(fileUtil.toLaunchPath(file2));
                }
            }
        }
        arrayList.add(sbAppend.toString());
        return arrayList;
    }

    public final boolean supportsQuickPlay(String mcVersion) {
        String v = mcVersion != null ? StringsKt.trim((CharSequence) mcVersion).toString() : null;
        if (v == null) {
            v = "";
        }
        if (v.length() == 0) {
            return false;
        }
        MatchResult m = Regex.find$default(new Regex("^(\\d{2})w(\\d{2})[a-z]"), v, 0, 2, null);
        if (m != null) {
            return (Integer.parseInt(m.getGroupValues().get(1)) * 100) + Integer.parseInt(m.getGroupValues().get(2)) >= 2314;
        }
        Iterable $this$map$iv = StringsKt.split$default((CharSequence) v, new char[]{'.', '-', ' ', '_'}, false, 0, 6, (Object) null);
        Collection destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10));
        for (Object item$iv$iv : $this$map$iv) {
            String it = (String) item$iv$iv;
            destination$iv$iv.add(StringsKt.toIntOrNull(it));
        }
        List nums = (List) destination$iv$iv;
        Integer num = (Integer) CollectionsKt.getOrNull(nums, 0);
        if (num == null) {
            return false;
        }
        int major = num.intValue();
        if (major != 1) {
            return major > 1;
        }
        Integer num2 = (Integer) CollectionsKt.getOrNull(nums, 1);
        return (num2 != null ? num2.intValue() : 0) >= 20;
    }

    public final Pair<String, Integer> splitAddress(String address) {
        Intrinsics.checkNotNullParameter(address, "address");
        String s = StringsKt.trim((CharSequence) address).toString();
        if (s.length() == 0) {
            return null;
        }
        if (StringsKt.startsWith$default(s, "[", false, 2, (Object) null)) {
            int e = StringsKt.indexOf$default((CharSequence) s, ']', 0, false, 6, (Object) null);
            if (e < 0) {
                return null;
            }
            String strSubstring = s.substring(1, e);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            String strSubstring2 = s.substring(e + 1);
            Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
            String strRemovePrefix = StringsKt.removePrefix(strSubstring2, (CharSequence) ":");
            if (strRemovePrefix.length() == 0) {
                strRemovePrefix = "25565";
            }
            Integer intOrNull = StringsKt.toIntOrNull(strRemovePrefix);
            if (intOrNull != null) {
                return TuplesKt.to(strSubstring, Integer.valueOf(intOrNull.intValue()));
            }
            return null;
        }
        String $this$count$iv = s;
        int count$iv = 0;
        for (int i = 0; i < $this$count$iv.length(); i++) {
            char element$iv = $this$count$iv.charAt(i);
            if (element$iv == ':') {
                count$iv++;
            }
        }
        if (count$iv != 1) {
            return TuplesKt.to(s, 25565);
        }
        String strSubstringBefore$default = StringsKt.substringBefore$default(s, ':', (String) null, 2, (Object) null);
        Integer intOrNull2 = StringsKt.toIntOrNull(StringsKt.substringAfter$default(s, ':', (String) null, 2, (Object) null));
        if (intOrNull2 != null) {
            return TuplesKt.to(strSubstringBefore$default, Integer.valueOf(intOrNull2.intValue()));
        }
        return null;
    }

    public static /* synthetic */ List applyServer$default(FclLaunchArgs fclLaunchArgs, List list, String str, String str2, int i, Object obj) {
        if ((i & 4) != 0) {
            str2 = null;
        }
        return fclLaunchArgs.applyServer(list, str, str2);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<java.lang.String> applyServer(java.util.List<java.lang.String> r23, java.lang.String r24, java.lang.String r25) {
        /*
            Method dump skipped, instructions count: 456
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.runtime.FclLaunchArgs.applyServer(java.util.List, java.lang.String, java.lang.String):java.util.List");
    }

    public final Pair<String, Boolean> pickLwjgl(String versionLwjgl) {
        Iterable iterableSplit$default;
        if (versionLwjgl == null || (iterableSplit$default = StringsKt.split$default((CharSequence) versionLwjgl, new char[]{'.', '-'}, false, 0, 6, (Object) null)) == null) {
            return TuplesKt.to("3.3.3", false);
        }
        Iterable $this$map$iv = iterableSplit$default;
        Collection destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10));
        for (Object item$iv$iv : $this$map$iv) {
            String it = (String) item$iv$iv;
            Integer intOrNull = StringsKt.toIntOrNull(it);
            destination$iv$iv.add(Integer.valueOf(intOrNull != null ? intOrNull.intValue() : 0));
        }
        List v = (List) destination$iv$iv;
        if (pickLwjgl$cmp(v, CollectionsKt.listOf((Object[]) new Integer[]{3, 0})) < 0) {
            return TuplesKt.to("3.3.3", true);
        }
        return TuplesKt.to(pickLwjgl$cmp(v, CollectionsKt.listOf((Object[]) new Integer[]{3, 4, 1})) >= 0 ? "3.4.1" : "3.3.3", false);
    }

    private static final int pickLwjgl$cmp(List<Integer> list, List<Integer> list2) {
        int i = 0;
        int iMax = Math.max(list.size(), list2.size());
        while (i < iMax) {
            int c = Intrinsics.compare((i >= 0 && i < list.size() ? list.get(i) : 0).intValue(), (i >= 0 && i < list2.size() ? list2.get(i) : 0).intValue());
            if (c != 0) {
                return c;
            }
            i++;
        }
        return 0;
    }

    public final List<String> lwjglClasspath(File dir, boolean useLwjglX) {
        LinkedHashSet out;
        Intrinsics.checkNotNullParameter(dir, "dir");
        LinkedHashSet out2 = new LinkedHashSet();
        out2.add(FileUtil.INSTANCE.toLaunchPath(new File(dir, "lwjgl.jar")));
        if (useLwjglX) {
            out2.add(FileUtil.INSTANCE.toLaunchPath(new File(dir, "lwjgl-lwjglx.jar")));
        }
        File[] fileArrListFiles = dir.listFiles();
        if (fileArrListFiles != null) {
            Collection destination$iv$iv = new ArrayList();
            int length = fileArrListFiles.length;
            int i = 0;
            while (i < length) {
                File file = fileArrListFiles[i];
                String name = file.getName();
                Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                LinkedHashSet out3 = out2;
                File[] fileArr = fileArrListFiles;
                if ((!StringsKt.endsWith$default(name, ".jar", false, 2, (Object) null) || Intrinsics.areEqual(file.getName(), "lwjgl.jar") || Intrinsics.areEqual(file.getName(), "lwjgl-lwjglx.jar")) ? false : true) {
                    destination$iv$iv.add(file);
                }
                i++;
                out2 = out3;
                fileArrListFiles = fileArr;
            }
            out = out2;
            Iterable $this$sortedBy$iv = CollectionsKt.sortedWith((List) destination$iv$iv, new Comparator() { // from class: com.pymcl.runtime.FclLaunchArgs$lwjglClasspath$$inlined$sortedBy$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    File it = (File) t;
                    File it2 = (File) t2;
                    return ComparisonsKt.compareValues(it.getName(), it2.getName());
                }
            });
            if ($this$sortedBy$iv != null) {
                Iterable $this$forEach$iv = $this$sortedBy$iv;
                for (Object element$iv : $this$forEach$iv) {
                    File it = (File) element$iv;
                    FileUtil fileUtil = FileUtil.INSTANCE;
                    Intrinsics.checkNotNull(it);
                    out.add(fileUtil.toLaunchPath(it));
                }
            }
        } else {
            out = out2;
        }
        return CollectionsKt.toList(out);
    }

    public static /* synthetic */ List rewrite$default(FclLaunchArgs fclLaunchArgs, List list, String str, List list2, int i, String str2, String str3, boolean z, Env env, String str4, String str5, int i2, Object obj) {
        if ((i2 & 256) != 0) {
            str4 = null;
        }
        if ((i2 & 512) != 0) {
            str5 = null;
        }
        return fclLaunchArgs.rewrite(list, str, list2, i, str2, str3, z, env, str4, str5);
    }

    /* JADX WARN: Removed duplicated region for block: B:140:0x0711  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0794  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x010c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0714 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0109  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<java.lang.String> rewrite(java.util.List<java.lang.String> r41, java.lang.String r42, java.util.List<java.lang.String> r43, int r44, java.lang.String r45, java.lang.String r46, boolean r47, com.pymcl.runtime.FclLaunchArgs.Env r48, java.lang.String r49, java.lang.String r50) {
        /*
            Method dump skipped, instructions count: 2099
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.runtime.FclLaunchArgs.rewrite(java.util.List, java.lang.String, java.util.List, int, java.lang.String, java.lang.String, boolean, com.pymcl.runtime.FclLaunchArgs$Env, java.lang.String, java.lang.String):java.util.List");
    }

    public final Env envFor(Context context, String gameDir, String jnaVersion) {
        Object objM8116constructorimpl;
        Object objM8116constructorimpl2;
        String str = jnaVersion;
        Context context2 = context;
        Intrinsics.checkNotNullParameter(context2, "context");
        Intrinsics.checkNotNullParameter(gameDir, "gameDir");
        RuntimeHost.init(context2);
        Object[] SUPPORTED_ABIS = Build.SUPPORTED_ABIS;
        Intrinsics.checkNotNullExpressionValue(SUPPORTED_ABIS, "SUPPORTED_ABIS");
        Object[] $this$first$iv = SUPPORTED_ABIS;
        int length = $this$first$iv.length;
        int i = 0;
        while (i < length) {
            Object element$iv = $this$first$iv[i];
            String it = (String) element$iv;
            if (Intrinsics.areEqual(it, "arm64-v8a") || Intrinsics.areEqual(it, "x86_64")) {
                String abi = (String) element$iv;
                File d = new File(FCLPath.RUNTIME_DIR, "jna");
                if (str != null && new File(d, str).isDirectory()) {
                    d = new File(d, str);
                }
                File jna = d;
                File file = new File(FCLPath.LWJGL_DIR);
                File file2 = new File(FCLPath.MIO_LAUNCH_WRAPPER);
                String CACHE_DIR = FCLPath.CACHE_DIR;
                Intrinsics.checkNotNullExpressionValue(CACHE_DIR, "CACHE_DIR");
                String JAVA_PATH = FCLPath.JAVA_PATH;
                Intrinsics.checkNotNullExpressionValue(JAVA_PATH, "JAVA_PATH");
                String nativeLibraryDir = context2.getApplicationInfo().nativeLibraryDir;
                Intrinsics.checkNotNullExpressionValue(nativeLibraryDir, "nativeLibraryDir");
                Intrinsics.checkNotNull(abi);
                String str2 = Build.VERSION.RELEASE;
                if (str2 == null) {
                    str2 = "";
                }
                String str3 = str2;
                try {
                    Result.Companion companion = Result.INSTANCE;
                    FclLaunchArgs fclLaunchArgs = this;
                    objM8116constructorimpl = Result.m8116constructorimpl(FCLauncher.getSocName());
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.INSTANCE;
                    objM8116constructorimpl = Result.m8116constructorimpl(ResultKt.createFailure(th));
                }
                String str4 = Build.HARDWARE;
                if (Result.m8122isFailureimpl(objM8116constructorimpl)) {
                    objM8116constructorimpl = str4;
                }
                Intrinsics.checkNotNullExpressionValue(objM8116constructorimpl, "getOrDefault(...)");
                String str5 = (String) objM8116constructorimpl;
                String absolutePath = jna.exists() ? jna.getAbsolutePath() : context2.getApplicationInfo().nativeLibraryDir;
                Intrinsics.checkNotNull(absolutePath);
                String language = Locale.getDefault().getLanguage();
                Intrinsics.checkNotNullExpressionValue(language, "getLanguage(...)");
                String country = Locale.getDefault().getCountry();
                Intrinsics.checkNotNullExpressionValue(country, "getCountry(...)");
                String id = TimeZone.getDefault().getID();
                Intrinsics.checkNotNullExpressionValue(id, "getID(...)");
                int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
                try {
                    Result.Companion companion3 = Result.INSTANCE;
                    FclLaunchArgs fclLaunchArgs2 = this;
                    objM8116constructorimpl2 = Result.m8116constructorimpl(NativeLibPlugin.getJVMEnv());
                } catch (Throwable th2) {
                    Result.Companion companion4 = Result.INSTANCE;
                    objM8116constructorimpl2 = Result.m8116constructorimpl(ResultKt.createFailure(th2));
                }
                Map mapEmptyMap = MapsKt.emptyMap();
                if (Result.m8122isFailureimpl(objM8116constructorimpl2)) {
                    objM8116constructorimpl2 = mapEmptyMap;
                }
                Map map = (Map) objM8116constructorimpl2;
                File file3 = new File(FCLPath.CACIOCAVALLO_8_DIR);
                File file4 = new File(FCLPath.CACIOCAVALLO_17_DIR);
                DisplayMetrics it2 = context2.getResources().getDisplayMetrics();
                return new Env(file, file2, CACHE_DIR, JAVA_PATH, nativeLibraryDir, abi, str3, str5, absolutePath, language, country, id, iAvailableProcessors, map, file3, file4, Math.max(it2.widthPixels, it2.heightPixels) + "x" + Math.min(it2.widthPixels, it2.heightPixels), new File(FCLPath.LIB_PATCHER_PATH), null, true, 262144, null);
            }
            i++;
            context2 = context;
            str = jnaVersion;
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }
}
