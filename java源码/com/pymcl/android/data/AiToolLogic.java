package com.pymcl.android.data;

import androidx.autofill.HintConstants;
import com.pymcl.core.crash.CrashAnalyzer;
import com.pymcl.core.mods.ModHit;
import com.pymcl.core.util.JsonKt;
import com.pymcl.runtime.process.JavaProcessService;
import com.pymcl.runtime.settings.SettingsProtocol;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.io.ByteStreamsKt;
import kotlin.io.CloseableKt;
import kotlin.io.FilesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.SequencesKt;
import kotlin.text.Charsets;
import kotlin.text.MatchResult;
import kotlin.text.StringsKt;
import org.apache.commons.compress.java.util.jar.Pack200;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.StringUtils;

/* compiled from: AiToolLogic.kt */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J*\u0010\r\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000e\u001a\u00020\u00062\u0018\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0010j\u0002`\u0011J(\u0010\u0012\u001a\u00020\u00062\u0018\u0010\u0013\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0010j\u0002`\u00112\u0006\u0010\u0014\u001a\u00020\u0006J\u001c\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00062\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\u0017J>\u0010\u0018\u001a\u0004\u0018\u00010\u00062\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00060\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u00062\b\u0010\u001b\u001a\u0004\u0018\u00010\u00062\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u001e0\u001dJ\u000e\u0010\u001f\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u0006J\u000e\u0010!\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020\u0006J\"\u0010#\u001a\u0004\u0018\u00010\u00062\u0018\u0010\u0013\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0010j\u0002`\u0011J\u0010\u0010$\u001a\u00020\u00062\b\u0010%\u001a\u0004\u0018\u00010\u0006J \u0010&\u001a\u00020\u00062\u0018\u0010\u0013\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0010j\u0002`\u0011J \u0010'\u001a\u00020\u00062\u0018\u0010\u0013\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0010j\u0002`\u0011J'\u0010(\u001a\u0004\u0018\u00010\n2\u0018\u0010\u0013\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0010j\u0002`\u0011¢\u0006\u0002\u0010)J(\u0010+\u001a\u00020\u00062\u0018\u0010\u0013\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0010j\u0002`\u00112\u0006\u0010,\u001a\u00020\u0006J\u0016\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020.2\u0006\u00100\u001a\u00020\u0006JP\u00101\u001a\b\u0012\u0004\u0012\u00020.0\u00172\u0006\u0010\u000e\u001a\u00020\u00062\u0018\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0010j\u0002`\u00112\f\u00102\u001a\b\u0012\u0004\u0012\u00020.032\u0012\u00104\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020.0\u001dJ\u001e\u00105\u001a\u0004\u0018\u00010\u00062\f\u00106\u001a\b\u0012\u0004\u0012\u00020\u00060\u00172\u0006\u0010\u000e\u001a\u00020\u0006J\u000e\u00107\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0006J\u0016\u00108\u001a\u0002092\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010:\u001a\u00020\u0006J\u0016\u0010;\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010:\u001a\u00020\u0006J \u0010<\u001a\u00020\u00062\u0018\u0010\u0013\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0010j\u0002`\u0011J(\u0010=\u001a\u0004\u0018\u00010>2\f\u0010?\u001a\b\u0012\u0004\u0012\u00020>0\u00172\u0006\u0010@\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006J4\u0010A\u001a\u00020\u00062\u0006\u0010B\u001a\u00020\u00062\u0006\u0010C\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u00062\u0006\u0010D\u001a\u00020\u00062\f\u0010E\u001a\b\u0012\u0004\u0012\u00020\u00060\u0017J\u001e\u0010F\u001a\u00020\u00062\u0006\u0010B\u001a\u00020\u00062\u0006\u0010G\u001a\u00020\u00062\u0006\u0010H\u001a\u00020\u0006J \u0010I\u001a\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u00010Jj\u0002`K2\f\u0010?\u001a\b\u0012\u0004\u0012\u00020>0\u0017J&\u0010L\u001a\b\u0012\u0004\u0012\u00020\u00060\u00172\u0018\u0010\u0013\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0010j\u0002`\u0011J$\u0010M\u001a\u00020\u00062\u0006\u0010N\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u00062\f\u0010O\u001a\b\u0012\u0004\u0012\u00020\u00060\u0017J\u0016\u0010P\u001a\u00020\u00062\u0006\u0010Q\u001a\u00020.2\u0006\u0010R\u001a\u00020\nJ\u001c\u0010S\u001a\b\u0012\u0004\u0012\u00020\u00060\u00172\u0006\u0010T\u001a\u00020.2\u0006\u0010U\u001a\u00020\u0006J\u0010\u0010V\u001a\u0004\u0018\u00010.2\u0006\u0010/\u001a\u00020.J\u0016\u0010W\u001a\u00020\u00062\u0006\u0010Q\u001a\u00020.2\u0006\u0010X\u001a\u00020\u0006J$\u0010Y\u001a\u0018\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0010j\u0004\u0018\u0001`\u00112\u0006\u0010Q\u001a\u00020.R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010*\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000Ê\u0001\f\b[\u0012\b\b\\\u0012\u0004\b\u0003\u0010\u0002¨\u0006Z"}, d2 = {"Lcom/pymcl/android/data/AiToolLogic;", "", "<init>", "()V", "INSTALL_VERBS", "", "", "MOD_ACTION_DONE", "ANDROID_JAVA_MAJORS", "", "", "getANDROID_JAVA_MAJORS", "()Ljava/util/Set;", "describe", HintConstants.AUTOFILL_HINT_NAME, JavaProcessService.EXTRA_ARGS, "", "Lcom/pymcl/core/util/JObj;", "instanceArg", "a", "current", "noInstanceMessage", "all", "", "pickVersion", "installed", "argVersion", "metaMc", "lastModified", "Lkotlin/Function1;", "", "noVersionMessage", "instance", "loaderOf", SettingsProtocol.EXTRA_VALUE, "loaderArg", "kindKey", "k", "sourceOf", "versionQuery", "javaMajor", "(Ljava/util/Map;)Ljava/lang/Integer;", "JAVA_UNSUPPORTED", "required", "key", "configFile", "Ljava/io/File;", "gd", "p", "affectedPaths", "gameDir", "Lkotlin/Function0;", "instanceDir", "resolveModName", "list", "noModMessage", "modActionNeeded", "", "filename", "modActionMessage", "installQuery", "pickHit", "Lcom/pymcl/core/mods/ModHit;", "hits", "query", "installedMessage", "title", "out", "version", "requiredDeps", "noFileMessage", "mc", "loader", "searchJson", "", "Lcom/pymcl/core/util/JArr;", "launchNotes", "launchMessage", "vid", "notes", "tail", "f", "n", "listConfigs", "dir", "prefix", "latestCrashFile", "writeConfig", "content", "modInfo", "PyMCL-Android:app_debug", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes21.dex */
public final class AiToolLogic {
    public static final int $stable = 0;
    public static final String JAVA_UNSUPPORTED = "安卓版只提供 Java 8/17/21/25（17/21 为内置，8/25 按需下载）";
    public static final AiToolLogic INSTANCE = new AiToolLogic();
    private static final Map<String, String> INSTALL_VERBS = MapsKt.mapOf(TuplesKt.to("install_mod", "安装模组"), TuplesKt.to("install_modpack", "安装整合包"), TuplesKt.to("install_shader", "安装光影"), TuplesKt.to("install_resourcepack", "安装资源包"), TuplesKt.to("install_datapack", "安装数据包"), TuplesKt.to("install_world", "安装地图"));
    private static final Map<String, String> MOD_ACTION_DONE = MapsKt.mapOf(TuplesKt.to("delete_mod", "已删除"), TuplesKt.to("disable_mod", "已禁用"), TuplesKt.to("enable_mod", "已启用"));
    private static final Set<Integer> ANDROID_JAVA_MAJORS = SetsKt.setOf((Object[]) new Integer[]{8, 17, 21, 25});

    private AiToolLogic() {
    }

    public final Set<Integer> getANDROID_JAVA_MAJORS() {
        return ANDROID_JAVA_MAJORS;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0245 A[PHI: r0
  0x0245: PHI (r0v46 java.lang.String) = (r0v45 java.lang.String), (r0v53 java.lang.String) binds: [B:97:0x023a, B:99:0x0242] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x023c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String describe(java.lang.String r10, java.util.Map<java.lang.String, java.lang.Object> r11) {
        /*
            Method dump skipped, instructions count: 672
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.android.data.AiToolLogic.describe(java.lang.String, java.util.Map):java.lang.String");
    }

    public final String instanceArg(Map<String, Object> a, String current) {
        Intrinsics.checkNotNullParameter(a, "a");
        Intrinsics.checkNotNullParameter(current, "current");
        String str = JsonKt.str(a, "instance");
        if (str != null) {
            if (StringsKt.isBlank(str)) {
                str = null;
            }
            if (str != null) {
                return str;
            }
        }
        return current;
    }

    public final String noInstanceMessage(String name, List<String> all) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(all, "all");
        return "没有名为「" + name + "」的实例。可用实例：" + CollectionsKt.joinToString$default(all, "、", null, null, 0, null, null, 62, null);
    }

    public final String pickVersion(List<String> installed, String argVersion, String metaMc, Function1<? super String, Long> lastModified) {
        Intrinsics.checkNotNullParameter(installed, "installed");
        Intrinsics.checkNotNullParameter(lastModified, "lastModified");
        Object next = null;
        if (argVersion != null) {
            String str = !StringsKt.isBlank(argVersion) ? argVersion : null;
            if (str != null && installed.contains(str)) {
                return str;
            }
        }
        if (metaMc != null) {
            String str2 = installed.contains(metaMc) ? metaMc : null;
            if (str2 != null) {
                return str2;
            }
        }
        Iterator it = installed.iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                Comparable comparableInvoke = lastModified.invoke(next);
                do {
                    Object next2 = it.next();
                    Long lInvoke = lastModified.invoke(next2);
                    if (comparableInvoke.compareTo(lInvoke) < 0) {
                        next = next2;
                        comparableInvoke = lInvoke;
                    }
                } while (it.hasNext());
            }
        }
        return (String) next;
    }

    public final String noVersionMessage(String instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        return "实例「" + instance + "」还没有安装任何游戏版本，先用 install_game 安装";
    }

    public final String loaderOf(String v) {
        Object obj;
        Intrinsics.checkNotNullParameter(v, "v");
        String lowerCase = v.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        Iterator it = CollectionsKt.listOf((Object[]) new String[]{"neoforge", "forge", "fabric", "quilt"}).iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (StringsKt.contains$default((CharSequence) lowerCase, (CharSequence) next, false, 2, (Object) null)) {
                obj = next;
                break;
            }
        }
        String str = (String) obj;
        return str == null ? "" : str;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String loaderArg(java.util.Map<java.lang.String, java.lang.Object> r7) {
        /*
            r6 = this;
            java.lang.String r0 = "a"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r0 = "loader"
            java.lang.String r0 = com.pymcl.core.util.JsonKt.str(r7, r0)
            r1 = 0
            if (r0 == 0) goto L37
            r2 = r0
            r3 = 0
            r4 = r2
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            boolean r4 = kotlin.text.StringsKt.isBlank(r4)
            if (r4 != 0) goto L33
            java.lang.String r4 = "无"
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r4)
            if (r4 != 0) goto L33
            java.lang.String r4 = "vanilla"
            r5 = 1
            boolean r4 = kotlin.text.StringsKt.equals(r2, r4, r5)
            if (r4 != 0) goto L33
            java.lang.String r4 = "none"
            boolean r4 = kotlin.text.StringsKt.equals(r2, r4, r5)
            if (r4 != 0) goto L33
            goto L34
        L33:
            r5 = 0
        L34:
            if (r5 == 0) goto L37
            goto L38
        L37:
            r0 = r1
        L38:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.android.data.AiToolLogic.loaderArg(java.util.Map):java.lang.String");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0026, code lost:
    
        if (r1.equals("shaders") == false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0038, code lost:
    
        if (r1.equals("resourcepacks") == false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0041, code lost:
    
        if (r1.equals("资源包") == false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004a, code lost:
    
        if (r1.equals("材质包") == false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x005c, code lost:
    
        if (r1.equals("光影") == false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0063, code lost:
    
        if (r1.equals("resource") == false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0075, code lost:
    
        if (r1.equals("resourcepack") == false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x007e, code lost:
    
        if (r1.equals("shader") == false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0087, code lost:
    
        if (r1.equals("shaderpack") == false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:?, code lost:
    
        return "resource";
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:?, code lost:
    
        return "shader";
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
    public final java.lang.String kindKey(java.lang.String r7) {
        /*
            r6 = this;
            java.lang.String r0 = "toLowerCase(...)"
            if (r7 == 0) goto Le
            java.util.Locale r1 = java.util.Locale.ROOT
            java.lang.String r1 = r7.toLowerCase(r1)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r0)
            goto Lf
        Le:
            r1 = 0
        Lf:
            if (r1 == 0) goto L8c
            int r2 = r1.hashCode()
            java.lang.String r3 = "datapack"
            java.lang.String r4 = "resource"
            java.lang.String r5 = "shader"
            switch(r2) {
                case -1310695554: goto L81;
                case -903579675: goto L7a;
                case -383553753: goto L6f;
                case -348247024: goto L66;
                case -341064690: goto L5f;
                case 669512: goto L56;
                case 25765575: goto L4d;
                case 26557997: goto L44;
                case 35652281: goto L3b;
                case 994735660: goto L32;
                case 1789881539: goto L2a;
                case 2053801262: goto L20;
                default: goto L1e;
            }
        L1e:
            goto L8c
        L20:
            java.lang.String r2 = "shaders"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L8a
            goto L8c
        L2a:
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L9a
            goto L8c
        L32:
            java.lang.String r2 = "resourcepacks"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L78
            goto L8c
        L3b:
            java.lang.String r2 = "资源包"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L78
            goto L8c
        L44:
            java.lang.String r2 = "材质包"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L78
            goto L8c
        L4d:
            java.lang.String r2 = "数据包"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L9a
            goto L8c
        L56:
            java.lang.String r2 = "光影"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L8a
            goto L8c
        L5f:
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L78
            goto L8c
        L66:
            java.lang.String r2 = "datapacks"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L9a
            goto L8c
        L6f:
            java.lang.String r2 = "resourcepack"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L78
            goto L8c
        L78:
            r3 = r4
            goto L9d
        L7a:
            boolean r1 = r1.equals(r5)
            if (r1 != 0) goto L8a
            goto L8c
        L81:
            java.lang.String r2 = "shaderpack"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L8a
            goto L8c
        L8a:
            r3 = r5
            goto L9d
        L8c:
            if (r7 == 0) goto L9b
            java.util.Locale r1 = java.util.Locale.ROOT
            java.lang.String r3 = r7.toLowerCase(r1)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r0)
            if (r3 != 0) goto L9a
            goto L9b
        L9a:
            goto L9d
        L9b:
            java.lang.String r3 = "mod"
        L9d:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.android.data.AiToolLogic.kindKey(java.lang.String):java.lang.String");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002e, code lost:
    
        if (r0.equals("mr") == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0045, code lost:
    
        if (r0.equals("modrinth") == false) goto L23;
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
    public final java.lang.String sourceOf(java.util.Map<java.lang.String, java.lang.Object> r5) {
        /*
            r4 = this;
            java.lang.String r0 = "a"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "source"
            java.lang.String r0 = com.pymcl.core.util.JsonKt.str(r5, r0)
            if (r0 == 0) goto L19
            java.util.Locale r1 = java.util.Locale.ROOT
            java.lang.String r0 = r0.toLowerCase(r1)
            java.lang.String r1 = "toLowerCase(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            goto L1a
        L19:
            r0 = 0
        L1a:
            if (r0 == 0) goto L4a
            int r1 = r0.hashCode()
            java.lang.String r2 = "curseforge"
            java.lang.String r3 = "modrinth"
            switch(r1) {
                case -607107063: goto L41;
                case -208988651: goto L3a;
                case 3171: goto L31;
                case 3493: goto L28;
                default: goto L27;
            }
        L27:
            goto L4a
        L28:
            java.lang.String r1 = "mr"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L48
            goto L4a
        L31:
            java.lang.String r1 = "cf"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L4c
            goto L4a
        L3a:
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L4c
            goto L4a
        L41:
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L48
            goto L4a
        L48:
            r2 = r3
            goto L4c
        L4a:
            java.lang.String r2 = "all"
        L4c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.android.data.AiToolLogic.sourceOf(java.util.Map):java.lang.String");
    }

    public final String versionQuery(Map<String, Object> a) {
        Intrinsics.checkNotNullParameter(a, "a");
        String str = JsonKt.str(a, "query");
        if (str == null) {
            str = "";
        }
        String string = StringsKt.trim((CharSequence) str).toString();
        return Intrinsics.areEqual(string, "最新版") ? Pack200.Packer.LATEST : string;
    }

    public final Integer javaMajor(Map<String, Object> a) {
        Intrinsics.checkNotNullParameter(a, "a");
        String str = JsonKt.str(a, "major");
        if (str == null) {
            str = "";
        }
        String str2 = str;
        Appendable sb = new StringBuilder();
        int length = str2.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str2.charAt(i);
            if (Character.isDigit(cCharAt)) {
                sb.append(cCharAt);
            }
        }
        Integer intOrNull = StringsKt.toIntOrNull(((StringBuilder) sb).toString());
        if (intOrNull == null) {
            throw new IllegalArgumentException("major 应为 8/17/21/25");
        }
        int m = intOrNull.intValue();
        Integer numValueOf = Integer.valueOf(m);
        if (ANDROID_JAVA_MAJORS.contains(Integer.valueOf(numValueOf.intValue()))) {
            return numValueOf;
        }
        return null;
    }

    public final String required(Map<String, Object> a, String key) {
        Intrinsics.checkNotNullParameter(a, "a");
        Intrinsics.checkNotNullParameter(key, "key");
        String str = JsonKt.str(a, key);
        if (str != null) {
            return str;
        }
        throw new IllegalArgumentException("缺少 " + key);
    }

    public final File configFile(File gd, String p) throws IOException {
        Intrinsics.checkNotNullParameter(gd, "gd");
        Intrinsics.checkNotNullParameter(p, "p");
        String rel = StringsKt.removePrefix(StringsKt.trimStart(StringsKt.replace$default(p, IOUtils.DIR_SEPARATOR_WINDOWS, IOUtils.DIR_SEPARATOR_UNIX, false, 4, (Object) null), IOUtils.DIR_SEPARATOR_UNIX), (CharSequence) "config/");
        File f = new File(new File(gd, "config"), rel).getCanonicalFile();
        String path = f.getPath();
        Intrinsics.checkNotNullExpressionValue(path, "getPath(...)");
        String canonicalPath = new File(gd, "config").getCanonicalPath();
        Intrinsics.checkNotNullExpressionValue(canonicalPath, "getCanonicalPath(...)");
        if (!StringsKt.startsWith$default(path, canonicalPath, false, 2, (Object) null)) {
            throw new IllegalArgumentException("只能访问实例 config 目录内的文件");
        }
        Intrinsics.checkNotNull(f);
        return f;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0037, code lost:
    
        if (r4.equals("delete_mod") == false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0073, code lost:
    
        if (r4.equals("disable_mod") == false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:?, code lost:
    
        return kotlin.collections.CollectionsKt.listOf(new java.io.File(r6.invoke(), "mods"));
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0025, code lost:
    
        if (r4.equals("install_mod") == false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002e, code lost:
    
        if (r4.equals("enable_mod") == false) goto L52;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<java.io.File> affectedPaths(java.lang.String r4, java.util.Map<java.lang.String, java.lang.Object> r5, kotlin.jvm.functions.Function0<? extends java.io.File> r6, kotlin.jvm.functions.Function1<? super java.lang.String, ? extends java.io.File> r7) {
        /*
            Method dump skipped, instructions count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.android.data.AiToolLogic.affectedPaths(java.lang.String, java.util.Map, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1):java.util.List");
    }

    public final String resolveModName(List<String> list, String name) {
        Object obj;
        Object next;
        Object next2;
        Intrinsics.checkNotNullParameter(list, "list");
        Intrinsics.checkNotNullParameter(name, "name");
        Iterator it = list.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.areEqual((String) next, name)) {
                break;
            }
        }
        String str = (String) next;
        if (str != null) {
            return str;
        }
        Iterator it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it2.next();
            if (Intrinsics.areEqual(StringsKt.removeSuffix((String) next2, (CharSequence) ".disabled"), StringsKt.removeSuffix(name, (CharSequence) ".disabled"))) {
                break;
            }
        }
        String str2 = (String) next2;
        if (str2 != null) {
            return str2;
        }
        Iterator it3 = list.iterator();
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            Object next3 = it3.next();
            if (StringsKt.equals(StringsKt.removeSuffix(StringsKt.removeSuffix((String) next3, (CharSequence) ".disabled"), (CharSequence) ".jar"), StringsKt.removeSuffix(name, (CharSequence) ".jar"), true)) {
                obj = next3;
                break;
            }
        }
        String str3 = (String) obj;
        if (str3 != null) {
            return str3;
        }
        Collection arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (StringsKt.contains((CharSequence) obj2, (CharSequence) StringsKt.removeSuffix(name, (CharSequence) ".jar"), true)) {
                arrayList.add(obj2);
            }
        }
        return (String) CollectionsKt.singleOrNull((List) arrayList);
    }

    public final String noModMessage(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return "找不到模组文件「" + name + "」，先用 list_mods 查看文件名";
    }

    public final boolean modActionNeeded(String name, String filename) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(filename, "filename");
        if (Intrinsics.areEqual(name, "delete_mod")) {
            return true;
        }
        if (Intrinsics.areEqual(name, "disable_mod")) {
            return !StringsKt.endsWith$default(filename, ".disabled", false, 2, (Object) null);
        }
        return StringsKt.endsWith$default(filename, ".disabled", false, 2, (Object) null);
    }

    public final String modActionMessage(String name, String filename) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(filename, "filename");
        return ((Object) MOD_ACTION_DONE.get(name)) + StringUtils.SPACE + filename;
    }

    public final String installQuery(Map<String, Object> a) {
        Intrinsics.checkNotNullParameter(a, "a");
        String str = JsonKt.str(a, "id");
        String str2 = null;
        if (str != null) {
            if (StringsKt.isBlank(str)) {
                str = null;
            }
            if (str != null) {
                return str;
            }
        }
        String str3 = JsonKt.str(a, "slug");
        if (str3 != null && !StringsKt.isBlank(str3)) {
            str2 = str3;
        }
        if (str2 != null) {
            return str2;
        }
        String str4 = JsonKt.str(a, HintConstants.AUTOFILL_HINT_NAME);
        if (str4 != null) {
            return str4;
        }
        throw new IllegalArgumentException("缺少 name");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005a A[EDGE_INSN: B:29:0x005a->B:15:0x005a BREAK  A[LOOP:0: B:3:0x0012->B:32:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[LOOP:0: B:3:0x0012->B:32:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.pymcl.core.mods.ModHit pickHit(java.util.List<com.pymcl.core.mods.ModHit> r13, java.lang.String r14, java.lang.String r15) {
        /*
            r12 = this;
            java.lang.String r0 = "hits"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            java.lang.String r0 = "query"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            r0 = r13
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            r1 = 0
            java.util.Iterator r2 = r0.iterator()
        L12:
            boolean r3 = r2.hasNext()
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L59
            java.lang.Object r3 = r2.next()
            r6 = r3
            com.pymcl.core.mods.ModHit r6 = (com.pymcl.core.mods.ModHit) r6
            r7 = 0
            java.lang.String r8 = r6.getId()
            boolean r8 = kotlin.jvm.internal.Intrinsics.areEqual(r8, r14)
            if (r8 != 0) goto L55
            java.lang.String r8 = r6.getSlug()
            boolean r8 = kotlin.text.StringsKt.equals(r8, r14, r4)
            if (r8 != 0) goto L55
            java.lang.String r8 = r6.getId()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = ":"
            java.lang.StringBuilder r9 = r9.append(r10)
            java.lang.StringBuilder r9 = r9.append(r14)
            java.lang.String r9 = r9.toString()
            r10 = 2
            r11 = 0
            boolean r8 = kotlin.text.StringsKt.endsWith$default(r8, r9, r11, r10, r5)
            if (r8 == 0) goto L56
        L55:
            r11 = r4
        L56:
            if (r11 == 0) goto L12
            goto L5a
        L59:
            r3 = r5
        L5a:
            com.pymcl.core.mods.ModHit r3 = (com.pymcl.core.mods.ModHit) r3
            if (r3 != 0) goto L8d
            r0 = r13
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            r1 = 0
            java.util.Iterator r2 = r0.iterator()
        L66:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L80
            java.lang.Object r3 = r2.next()
            r6 = r3
            com.pymcl.core.mods.ModHit r6 = (com.pymcl.core.mods.ModHit) r6
            r7 = 0
            java.lang.String r8 = r6.getTitle()
            boolean r6 = kotlin.text.StringsKt.equals(r8, r15, r4)
            if (r6 == 0) goto L66
            r5 = r3
            goto L81
        L80:
        L81:
            r3 = r5
            com.pymcl.core.mods.ModHit r3 = (com.pymcl.core.mods.ModHit) r3
            if (r3 != 0) goto L8d
            java.lang.Object r0 = kotlin.collections.CollectionsKt.firstOrNull(r13)
            r3 = r0
            com.pymcl.core.mods.ModHit r3 = (com.pymcl.core.mods.ModHit) r3
        L8d:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.android.data.AiToolLogic.pickHit(java.util.List, java.lang.String, java.lang.String):com.pymcl.core.mods.ModHit");
    }

    public final String installedMessage(String title, String out, String instance, String version, List<String> requiredDeps) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(out, "out");
        Intrinsics.checkNotNullParameter(instance, "instance");
        Intrinsics.checkNotNullParameter(version, "version");
        Intrinsics.checkNotNullParameter(requiredDeps, "requiredDeps");
        List list = !requiredDeps.isEmpty() ? requiredDeps : null;
        String deps = list != null ? "；必需前置：" + CollectionsKt.joinToString$default(list, "、", null, null, 0, null, null, 62, null) + "（未自动安装，可再调用 install_mod）" : null;
        if (deps == null) {
            deps = "";
        }
        return "已安装 " + title + "（" + out + "）到「" + instance + "」/" + version + deps;
    }

    public final String noFileMessage(String title, String mc, String loader) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(mc, "mc");
        Intrinsics.checkNotNullParameter(loader, "loader");
        return title + " 没有适配 " + mc + (loader.length() > 0 ? " / " + loader : "") + " 的版本";
    }

    public final List<Object> searchJson(List<ModHit> hits) {
        Intrinsics.checkNotNullParameter(hits, "hits");
        Iterable<ModHit> iterableTake = CollectionsKt.take(hits, 10);
        Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterableTake, 10));
        for (ModHit modHit : iterableTake) {
            arrayList.add(JsonKt.jobj(TuplesKt.to("id", modHit.getId()), TuplesKt.to("slug", modHit.getSlug()), TuplesKt.to("title", modHit.getTitle()), TuplesKt.to("author", modHit.getAuthor()), TuplesKt.to("downloads", Long.valueOf(modHit.getDownloads())), TuplesKt.to("source", modHit.getSource()), TuplesKt.to("desc", StringsKt.take(modHit.getDesc(), 120))));
        }
        return CollectionsKt.toMutableList(arrayList);
    }

    public final List<String> launchNotes(Map<String, Object> a) {
        Intrinsics.checkNotNullParameter(a, "a");
        String[] strArr = new String[2];
        strArr[0] = JsonKt.str(a, HintConstants.AUTOFILL_HINT_USERNAME) != null ? "安卓版不支持临时指定用户名，已用当前账号" : null;
        strArr[1] = a.get("memory_mb") != null ? "内存请在设置里调整，本次未改" : null;
        return CollectionsKt.listOfNotNull((Object[]) strArr);
    }

    public final String launchMessage(String vid, String instance, List<String> notes) {
        Intrinsics.checkNotNullParameter(vid, "vid");
        Intrinsics.checkNotNullParameter(instance, "instance");
        Intrinsics.checkNotNullParameter(notes, "notes");
        String strJoinToString$default = CollectionsKt.joinToString$default(notes, "；", "（", "）", 0, null, null, 56, null);
        if (notes.isEmpty()) {
            strJoinToString$default = null;
        }
        if (strJoinToString$default == null) {
            strJoinToString$default = "";
        }
        return "已启动 " + vid + "（实例「" + instance + "」），游戏窗口已打开。" + strJoinToString$default;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence tail$lambda$0(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return CrashAnalyzer.INSTANCE.filterSecrets(it);
    }

    public final String tail(File f, int n) {
        Intrinsics.checkNotNullParameter(f, "f");
        return !f.isFile() ? "" : CollectionsKt.joinToString$default(CollectionsKt.takeLast(FilesKt.readLines$default(f, null, 1, null), n), StringUtils.LF, null, null, 0, null, new Function1() { // from class: com.pymcl.android.data.AiToolLogic$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AiToolLogic.tail$lambda$0((String) obj);
            }
        }, 30, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean listConfigs$lambda$0(File it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.isFile();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String listConfigs$lambda$1(File $dir, File it) {
        Intrinsics.checkNotNullParameter(it, "it");
        String path = FilesKt.relativeTo(it, $dir).getPath();
        Intrinsics.checkNotNullExpressionValue(path, "getPath(...)");
        return StringsKt.replace$default(path, IOUtils.DIR_SEPARATOR_WINDOWS, IOUtils.DIR_SEPARATOR_UNIX, false, 4, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean listConfigs$lambda$2(String $prefix, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return StringsKt.startsWith(it, $prefix, true);
    }

    public final List<String> listConfigs(final File dir, final String prefix) {
        Intrinsics.checkNotNullParameter(dir, "dir");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        return SequencesKt.toList(SequencesKt.take(SequencesKt.filter(SequencesKt.map(SequencesKt.filter(FilesKt.walkTopDown(dir), new Function1() { // from class: com.pymcl.android.data.AiToolLogic$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(AiToolLogic.listConfigs$lambda$0((File) obj));
            }
        }), new Function1() { // from class: com.pymcl.android.data.AiToolLogic$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AiToolLogic.listConfigs$lambda$1(dir, (File) obj);
            }
        }), new Function1() { // from class: com.pymcl.android.data.AiToolLogic$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(AiToolLogic.listConfigs$lambda$2(prefix, (String) obj));
            }
        }), 300));
    }

    public final File latestCrashFile(File gd) {
        Object next;
        Intrinsics.checkNotNullParameter(gd, "gd");
        File[] fileArrListFiles = new File(gd, "crash-reports").listFiles();
        Object next2 = null;
        if (fileArrListFiles != null) {
            Collection arrayList = new ArrayList();
            for (File file : fileArrListFiles) {
                if (file.isFile()) {
                    arrayList.add(file);
                }
            }
            Iterator it = ((List) arrayList).iterator();
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    long jLastModified = ((File) next).lastModified();
                    do {
                        Object next3 = it.next();
                        long jLastModified2 = ((File) next3).lastModified();
                        if (jLastModified < jLastModified2) {
                            next = next3;
                            jLastModified = jLastModified2;
                        }
                    } while (it.hasNext());
                }
            } else {
                next = null;
            }
            File file2 = (File) next;
            if (file2 != null) {
                return file2;
            }
        }
        File[] fileArrListFiles2 = gd.listFiles();
        if (fileArrListFiles2 == null) {
            return null;
        }
        Collection arrayList2 = new ArrayList();
        for (File file3 : fileArrListFiles2) {
            String name = file3.getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
            if (StringsKt.startsWith$default(name, "hs_err_pid", false, 2, (Object) null)) {
                arrayList2.add(file3);
            }
        }
        Iterator it2 = ((List) arrayList2).iterator();
        if (it2.hasNext()) {
            next2 = it2.next();
            if (it2.hasNext()) {
                long jLastModified3 = ((File) next2).lastModified();
                do {
                    Object next4 = it2.next();
                    long jLastModified4 = ((File) next4).lastModified();
                    if (jLastModified3 < jLastModified4) {
                        next2 = next4;
                        jLastModified3 = jLastModified4;
                    }
                } while (it2.hasNext());
            }
        }
        return (File) next2;
    }

    public final String writeConfig(File f, String content) {
        File f2;
        String str;
        Intrinsics.checkNotNullParameter(f, "f");
        Intrinsics.checkNotNullParameter(content, "content");
        if (f.isFile()) {
            f2 = f;
            FilesKt.copyTo$default(f2, new File(f.getPath() + ".bak"), true, 0, 4, null);
        } else {
            f2 = f;
        }
        File f3 = f2.getParentFile();
        if (f3 != null) {
            f3.mkdirs();
        }
        FilesKt.writeText$default(f2, content, null, 2, null);
        String name = f2.getName();
        if (new File(f2.getPath() + ".bak").isFile()) {
            str = "（原文件备份为 " + f2.getName() + ".bak）";
        } else {
            str = "";
        }
        return "已写入 " + name + str;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x016f A[Catch: all -> 0x0183, TryCatch #1 {all -> 0x0183, blocks: (B:8:0x003b, B:10:0x007c, B:11:0x009c, B:13:0x00a2, B:15:0x00be, B:17:0x00ca, B:18:0x00da, B:19:0x00fe, B:21:0x0104, B:22:0x0126, B:26:0x014d, B:27:0x0154, B:29:0x0161, B:31:0x0167, B:34:0x0176, B:33:0x016f, B:42:0x0193, B:47:0x01db, B:55:0x01f6, B:57:0x0239, B:59:0x023f, B:61:0x024a, B:52:0x01ec), top: B:87:0x0035 }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x02d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Map<java.lang.String, java.lang.Object> modInfo(java.io.File r28) {
        /*
            Method dump skipped, instructions count: 725
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.android.data.AiToolLogic.modInfo(java.io.File):java.util.Map");
    }

    private static final String modInfo$lambda$0$0$txt(ZipFile $z, String n) throws IOException {
        ZipEntry entry = $z.getEntry(n);
        if (entry == null) {
            return null;
        }
        InputStream inputStream = $z.getInputStream(entry);
        try {
            InputStream inputStream2 = inputStream;
            Intrinsics.checkNotNull(inputStream2);
            String str = new String(ByteStreamsKt.readBytes(inputStream2), Charsets.UTF_8);
            CloseableKt.closeFinally(inputStream, null);
            return str;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                CloseableKt.closeFinally(inputStream, th);
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String modInfo$lambda$0$0$5$0(MatchResult it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getGroupValues().get(1);
    }
}
