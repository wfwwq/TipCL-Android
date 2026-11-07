package com.pymcl.core.crash;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.SequencesKt;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.RegexOption;
import kotlin.text.StringsKt;
import org.apache.commons.lang3.StringUtils;

/* compiled from: CrashAnalyzer.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0006H\u0002J.\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u00112\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00062\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0002J\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u00112\u0006\u0010\u0017\u001a\u00020\u0018J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u001a\u001a\u00020\u001bJ\u000e\u0010\u001f\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u0006R\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR)\u0010\t\u001a\u001a\u0012\u0004\u0012\u00020\u0006\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000b0\n0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\bR\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001dX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/pymcl/core/crash/CrashAnalyzer;", "", "<init>", "()V", "TITLES", "", "", "getTITLES", "()Ljava/util/Map;", "TABLE", "Lkotlin/Pair;", "", "getTABLE", "seek", "t", "re", "all", "", "opt", "", "Lkotlin/text/RegexOption;", "analyze", "Lcom/pymcl/core/crash/CrashReason;", "i", "Lcom/pymcl/core/crash/CrashInput;", "describeExit", "code", "", "SECRET1", "Lkotlin/text/Regex;", "SECRET2", "filterSecrets", "s", "PyMCL-Android:core"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class CrashAnalyzer {
    public static final CrashAnalyzer INSTANCE = new CrashAnalyzer();
    private static final Map<String, String> TITLES = MapsKt.mapOf(TuplesKt.to("oom", "内存不足"), TuplesKt.to("java_mismatch", "Java 版本不兼容"), TuplesKt.to("java_too_new", "Java 版本过高"), TuplesKt.to("need_java11", "需要 Java 11"), TuplesKt.to("mod_certain", "Mod 导致崩溃"), TuplesKt.to("mixin", "Mod 注入失败"), TuplesKt.to("fabric_solution", "Fabric 报错"), TuplesKt.to("fabric_remap", "Fabric 无法生成游戏 jar"), TuplesKt.to("forge_error", "Forge 报错"), TuplesKt.to("mod_dup", "Mod 重复安装"), TuplesKt.to("mod_missing", "缺少前置 Mod"), TuplesKt.to("mod_incompat", "Mod 不兼容"), TuplesKt.to("nvidia_av", "显卡驱动崩溃"), TuplesKt.to("intel_av", "显卡驱动崩溃"), TuplesKt.to("amd_av", "显卡驱动崩溃"), TuplesKt.to("pixel_format", "显卡无法设置像素格式"), TuplesKt.to("debug_crash", "手动调试崩溃"));
    private static final Map<String, Pair<String, Boolean>> TABLE = MapsKt.mapOf(TuplesKt.to("jvm_args", TuplesKt.to("由于 Java 参数有误，导致游戏无法继续运行。\n请检查启动设置里的 Java 虚拟机参数和游戏参数是否有误。", false)), TuplesKt.to("mod_unzipped", TuplesKt.to("由于 Mod 文件被解压了，导致游戏无法继续运行。\n直接把整个 Mod 文件放进 mods 文件夹即可，解压就会出错。\n\n请删除 mods 里已被解压的文件夹，然后再启动游戏。", false)), TuplesKt.to("oom", TuplesKt.to("Minecraft 内存不足，导致其无法继续运行。\n这很可能是设备内存不足、游戏分配的内存不足，或配置要求过高。\n\n请在启动设置中增加为游戏分配的内存，并删掉过高的材质、Mod、光影。", false)), TuplesKt.to("openj9", TuplesKt.to("游戏因为使用 OpenJ9 而崩溃了。\n请在本实例的 Java 选项中改用非 OpenJ9 的 Java，然后再启动。", false)), TuplesKt.to("jdk", TuplesKt.to("游戏似乎因为使用 JDK，或 Java 版本过高而崩溃了。\n请在本实例的 Java 选项中改用 Java 8，然后再启动。", false)), TuplesKt.to("java_too_new", TuplesKt.to("游戏似乎因为你使用的 Java 版本过高而崩溃了。\n请在本实例的 Java 选项中改用较低版本的 Java，然后再启动。", false)), TuplesKt.to("java_mismatch", TuplesKt.to("游戏不兼容你当前使用的 Java。\n请在本实例的 Java 选项中改用合适版本的 Java，然后再启动。", false)), TuplesKt.to("mod_name_chars", TuplesKt.to("由于有 Mod 的名称包含特殊字符，导致游戏崩溃。\n请把该 Mod 文件名改成只含英文、数字、减号、下划线和小数点，然后再启动。", false)), TuplesKt.to("mixin_bootstrap", TuplesKt.to("由于缺失 MixinBootstrap，导致游戏崩溃。\n请尝试安装 MixinBootstrap。", false)), TuplesKt.to("need_java11", TuplesKt.to("你安装的部分 Mod 需要使用 Java 11 启动。\n请在本实例的 Java 选项中改用 Java 11，然后再启动。", false)), TuplesKt.to("optifine_world", TuplesKt.to("你使用的 OptiFine 可能导致游戏出问题。\n该问题只在特定 OptiFine 版本出现，可以换一个 OptiFine 版本。", true)), TuplesKt.to("hd_pack", TuplesKt.to("材质分辨率过高，或显卡配置不足，导致游戏无法继续运行。\n如果正在用高清材质，先把它移除。否则请更新显卡驱动。", true)), TuplesKt.to("nightconfig", TuplesKt.to("由于 Night Config 存在问题，导致了游戏崩溃。\n可以尝试安装 Night Config Fixes 模组。", true)), TuplesKt.to("opengl_1282", TuplesKt.to("你使用的光影或材质导致游戏出现了问题。\n请尝试删除这些额外资源。", true)), TuplesKt.to("mod_id_limit", TuplesKt.to("安装的 Mod 过多，超出了游戏的 ID 限制。\n请尝试安装 JEID 等修复 Mod，或删除部分大型 Mod。", false)), TuplesKt.to("verify_fail", TuplesKt.to("部分文件或内容校验失败，导致游戏出问题。\n请尝试删除游戏（包括 Mod）并重新下载。", true)), TuplesKt.to("forge_incomplete", TuplesKt.to("由于安装的 Forge 文件丢失，游戏无法正常运行。\n请重新安装一次相同版本的 Forge。", true)), TuplesKt.to("debug_crash", TuplesKt.to("* 事实上，你的游戏没有任何问题，这是你自己触发的调试崩溃。", false)), TuplesKt.to("optifine_forge", TuplesKt.to("由于 OptiFine 与当前版本的 Forge 不兼容，导致游戏崩溃。\n请到 OptiFine 官网查看它所兼容的 Forge 版本，并按对应版本重装。", false)), TuplesKt.to("shaders_optifine", TuplesKt.to("无需同时安装 OptiFine 和 Shaders Mod，OptiFine 已经集成了光影功能。\n删掉 Shaders Mod 后再启动。", false)), TuplesKt.to("old_forge_new_java", TuplesKt.to("由于低版本 Forge 与当前 Java 不兼容，导致游戏崩溃。\n请尝试：把 Forge 更新到 36.2.26 或更高，或换用低于 1.8.0.320 的 Java。", false)), TuplesKt.to("multi_forge_json", TuplesKt.to("当前版本文件存在异常（版本 Json 里有多个 Forge）。\n请尝试重新全新安装 Forge。", false)), TuplesKt.to("no_files", TuplesKt.to("你的游戏出现了一些问题，但未能找到相关记录文件，因此无法继续分析。", true)));
    private static final Regex SECRET1 = new Regex("(?i)((?:access[_-]?token|session[_-]?token|refresh[_-]?token|client[_-]?secret|authorization)\\s*[:=]\\s*)([^\\s\"']+)");
    private static final Regex SECRET2 = new Regex("(?i)(--(?:accessToken|uuid|xuid|clientId)\\s+)\\S+");

    private CrashAnalyzer() {
    }

    public final Map<String, String> getTITLES() {
        return TITLES;
    }

    public final Map<String, Pair<String, Boolean>> getTABLE() {
        return TABLE;
    }

    private final String seek(String t, String re) {
        String value;
        String string;
        MatchResult matchResultFind$default = Regex.find$default(new Regex(re), t, 0, 2, null);
        return (matchResultFind$default == null || (value = matchResultFind$default.getValue()) == null || (string = StringsKt.trim((CharSequence) value).toString()) == null) ? "" : string;
    }

    private final List<String> all(String t, String re, Set<? extends RegexOption> opt) {
        return SequencesKt.toList(SequencesKt.map(Regex.findAll$default(new Regex(re, opt), t, 0, 2, null), new Function1() { // from class: com.pymcl.core.crash.CrashAnalyzer$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CrashAnalyzer.all$lambda$0((MatchResult) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ List all$default(CrashAnalyzer crashAnalyzer, String str, String str2, Set set, int i, Object obj) {
        if ((i & 4) != 0) {
            set = SetsKt.emptySet();
        }
        return crashAnalyzer.all(str, str2, set);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String all$lambda$0(MatchResult it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return StringsKt.trim((CharSequence) it.getValue()).toString();
    }

    public final List<CrashReason> analyze(CrashInput i) {
        String str;
        String str2;
        char c;
        int i2;
        Iterable $this$any$iv;
        List list;
        int i3;
        int i4;
        Object obj;
        Iterator it;
        String str3;
        boolean z;
        Intrinsics.checkNotNullParameter(i, "i");
        String text = i.getOutput() + StringUtils.LF + i.getLatestLog();
        String crash = i.getCrashReport();
        String hs = i.getHsErr();
        LinkedHashMap r = new LinkedHashMap();
        if (StringsKt.isBlank(text) && StringsKt.isBlank(crash) && StringsKt.isBlank(hs)) {
            analyze$add$default(r, "no_files", null, 4, null);
            Collection collectionValues = r.values();
            Intrinsics.checkNotNullExpressionValue(collectionValues, "<get-values>(...)");
            return CollectionsKt.toList(collectionValues);
        }
        int i5 = 2;
        if (StringsKt.contains$default((CharSequence) crash, (CharSequence) "Unable to make protected final java.lang.Class java.lang.ClassLoader.defineClass", false, 2, (Object) null)) {
            analyze$add$default(r, "java_too_new", null, 4, null);
        }
        String str4 = "loader_error";
        List simple = CollectionsKt.listOf((Object[]) new Pair[]{TuplesKt.to(CollectionsKt.listOf("Unrecognized option:"), "jvm_args"), TuplesKt.to(CollectionsKt.listOf("Found multiple arguments for option fml.forgeVersion, but you asked for only one"), "multi_forge_json"), TuplesKt.to(CollectionsKt.listOf("The driver does not appear to support OpenGL"), "no_opengl"), TuplesKt.to(CollectionsKt.listOf((Object[]) new String[]{"java.lang.ClassCastException: java.base/jdk", "java.lang.ClassCastException: class jdk."}), "jdk"), TuplesKt.to(CollectionsKt.listOf((Object[]) new String[]{"Open J9 is not supported", "OpenJ9 is incompatible", ".J9VMInternals."}), "openj9"), TuplesKt.to(CollectionsKt.listOf((Object[]) new String[]{"java.lang.NoSuchFieldException: ucp", "because module java.base does not export", "java.lang.ClassNotFoundException: jdk.nashorn.api.scripting.NashornScriptEngineFactory", "java.lang.ClassNotFoundException: java.lang.invoke.LambdaMetafactory"}), "java_too_new"), TuplesKt.to(CollectionsKt.listOf((Object[]) new String[]{"The directories below appear to be extracted jar files. Fix this before you continue.", "Extracted mod jars found, loading will NOT continue"}), "mod_unzipped"), TuplesKt.to(CollectionsKt.listOf("java.lang.ClassNotFoundException: org.spongepowered.asm.launch.MixinTweaker"), "mixin_bootstrap"), TuplesKt.to(CollectionsKt.listOf("Couldn't set pixel format"), "pixel_format"), TuplesKt.to(CollectionsKt.listOf((Object[]) new String[]{"java.lang.OutOfMemoryError", "an out of memory error"}), "oom"), TuplesKt.to(CollectionsKt.listOf("Shaders Mod detected. Please remove it, OptiFine has built-in support for shaders."), "shaders_optifine"), TuplesKt.to(CollectionsKt.listOf((Object[]) new String[]{"java.lang.NoSuchMethodError: sun.security.util.ManifestEntryVerifier", "java.lang.NoSuchMethodError: 'void sun.security.util.ManifestEntryVerifier"}), "old_forge_new_java"), TuplesKt.to(CollectionsKt.listOf("1282: Invalid operation"), "opengl_1282"), TuplesKt.to(CollectionsKt.listOf("Maybe try a lower resolution resourcepack?"), "hd_pack"), TuplesKt.to(CollectionsKt.listOf("Cannot find launch target fmlclient, unable to launch"), "forge_incomplete"), TuplesKt.to(CollectionsKt.listOf("Invalid module name: '' is not a Java identifier"), "mod_name_chars"), TuplesKt.to(CollectionsKt.listOf((Object[]) new String[]{"has been compiled by a more recent version of the Java Runtime (class file version 55.0)", "sun.misc.Unsafe.defineAnonymousClass(Class,byte[],Object[])Class/invokeVirtual", "The requested compatibility level JAVA_11 could not be set"}), "need_java11"), TuplesKt.to(CollectionsKt.listOf((Object[]) new String[]{"Unsupported class file major version", "Unsupported major.minor version", "Level is not supported by the active JRE or ASM version"}), "java_mismatch"), TuplesKt.to(CollectionsKt.listOf("Invalid maximum heap size"), "java32"), TuplesKt.to(CollectionsKt.listOf("Mod resolution failed"), "loader_error")});
        Iterator it2 = simple.iterator();
        while (it2.hasNext()) {
            Pair pair = (Pair) it2.next();
            Iterable keys = (List) pair.component1();
            String kind = (String) pair.component2();
            Iterable $this$any$iv2 = keys;
            if (($this$any$iv2 instanceof Collection) && ((Collection) $this$any$iv2).isEmpty()) {
                it = it2;
                str3 = str4;
                z = false;
            } else {
                Iterator it3 = $this$any$iv2.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        it = it2;
                        str3 = str4;
                        z = false;
                        break;
                    }
                    Object element$iv = it3.next();
                    String it4 = (String) element$iv;
                    it = it2;
                    str3 = str4;
                    Iterable $this$any$iv3 = $this$any$iv2;
                    if (StringsKt.contains$default((CharSequence) text, (CharSequence) it4, false, 2, (Object) null)) {
                        z = true;
                        break;
                    }
                    it2 = it;
                    str4 = str3;
                    $this$any$iv2 = $this$any$iv3;
                }
            }
            if (z) {
                analyze$add$default(r, kind, null, 4, null);
                it2 = it;
                str4 = str3;
            } else {
                it2 = it;
                str4 = str3;
            }
        }
        String str5 = str4;
        if (StringsKt.contains$default((CharSequence) text, (CharSequence) "signer information does not match signer information of other classes in the same package", false, 2, (Object) null)) {
            analyze$add$1(r, "verify_fail", seek(text, "(?<=class \")[^\"]+(?=\"'s signer information)"));
        }
        if (StringsKt.contains$default((CharSequence) text, (CharSequence) "ChunkManager$ProxyTicketManager.shouldForceTicks(J)Z", false, 2, (Object) null) && StringsKt.contains$default((CharSequence) text, (CharSequence) "OptiFine", false, 2, (Object) null)) {
            analyze$add$default(r, "optifine_world", null, 4, null);
        }
        if (StringsKt.contains$default((CharSequence) text, (CharSequence) "com.electronwill.nightconfig.core.io.ParsingException: Not enough data available", false, 2, (Object) null)) {
            analyze$add$default(r, "nightconfig", null, 4, null);
        }
        if (StringsKt.contains$default((CharSequence) text, (CharSequence) "error remapping game jars", false, 2, (Object) null)) {
            analyze$add$1(r, "fabric_remap", seek(text, "(?<=the jar file ).+?(?= can't be written)"));
        }
        if (StringsKt.contains$default((CharSequence) text, (CharSequence) "Invalid paths argument, contained no existing paths", false, 2, (Object) null) && (StringsKt.contains$default((CharSequence) text, (CharSequence) "libraries\\net\\minecraftforge\\fmlcore", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) text, (CharSequence) "libraries/net/minecraftforge/fmlcore", false, 2, (Object) null))) {
            analyze$add$default(r, "forge_incomplete", null, 4, null);
        }
        if (StringsKt.contains$default((CharSequence) text, (CharSequence) "Could not reserve enough space", false, 2, (Object) null)) {
            if (StringsKt.contains$default((CharSequence) text, (CharSequence) "for 1048576KB object heap", false, 2, (Object) null)) {
                analyze$add$default(r, "java32", null, 4, null);
            } else {
                analyze$add$default(r, "oom", null, 4, null);
            }
        }
        if (StringsKt.contains$default((CharSequence) text, (CharSequence) "Caught exception from ", false, 2, (Object) null)) {
            analyze$add$1(r, "mod_certain", seek(text, "(?<=Caught exception from )[^\\n]+"));
        }
        if (StringsKt.contains$default((CharSequence) text, (CharSequence) "Found a duplicate mod", false, 2, (Object) null)) {
            analyze$add(r, "mod_dup", all(seek(text, "Found a duplicate mod[^\\n]+"), "[^\\\\/ ]+\\.jar", SetsKt.setOf(RegexOption.IGNORE_CASE)));
        }
        if (StringsKt.contains$default((CharSequence) text, (CharSequence) "Found duplicate mods", false, 2, (Object) null)) {
            str = "pixel_format";
            str2 = str5;
            c = 3;
            analyze$add(r, "mod_dup", CollectionsKt.distinct(all$default(this, text, "(?<=Mod ID: ')\\w+?(?=' from mod files:)", null, 4, null)));
        } else {
            str = "pixel_format";
            str2 = str5;
            c = 3;
        }
        if (StringsKt.contains$default((CharSequence) text, (CharSequence) "ModResolutionException: Duplicate", false, 2, (Object) null)) {
            analyze$add(r, "mod_dup", all(seek(text, "ModResolutionException: Duplicate[^\\n]+"), "[^\\\\/ ]+\\.jar", SetsKt.setOf(RegexOption.IGNORE_CASE)));
        }
        if (StringsKt.contains$default((CharSequence) text, (CharSequence) "Missing or unsupported mandatory dependencies:", false, 2, (Object) null)) {
            Iterable $this$map$iv = all(text, "(?<=Missing or unsupported mandatory dependencies:)(?:[\\n\\r]+\\t.*)+", SetsKt.setOf(RegexOption.IGNORE_CASE));
            int $i$f$map = 0;
            Collection destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10));
            for (Object item$iv$iv : $this$map$iv) {
                String it5 = (String) item$iv$iv;
                destination$iv$iv.add(new Regex("(?m)^\\s+").replace(it5, ""));
                i5 = i5;
                $this$map$iv = $this$map$iv;
                $i$f$map = $i$f$map;
            }
            i2 = i5;
            analyze$add(r, "mod_missing", (List) destination$iv$iv);
        } else {
            i2 = 2;
        }
        String[] strArr = new String[6];
        strArr[0] = "Mixin prepare failed ";
        strArr[1] = "Mixin apply failed ";
        strArr[i2] = "MixinApplyError";
        strArr[c] = "MixinTransformerError";
        strArr[4] = "mixin.injection.throwables.";
        strArr[5] = ".json] FAILED during )";
        Iterable $this$any$iv4 = CollectionsKt.listOf((Object[]) strArr);
        int $i$f$any = 0;
        if (($this$any$iv4 instanceof Collection) && ((Collection) $this$any$iv4).isEmpty()) {
            $this$any$iv = null;
        } else {
            Iterator it6 = $this$any$iv4.iterator();
            while (true) {
                if (!it6.hasNext()) {
                    $this$any$iv = null;
                    break;
                }
                Object element$iv2 = it6.next();
                String it7 = (String) element$iv2;
                Iterable $this$any$iv5 = $this$any$iv4;
                int $i$f$any2 = $i$f$any;
                Iterator it8 = it6;
                int $i$f$any3 = i2;
                if (StringsKt.contains$default((CharSequence) text, (CharSequence) it7, false, $i$f$any3, (Object) null)) {
                    $this$any$iv = 1;
                    break;
                }
                $this$any$iv4 = $this$any$iv5;
                $i$f$any = $i$f$any2;
                it6 = it8;
                i2 = 2;
            }
        }
        if ($this$any$iv != null) {
            String strSeek = seek(text, "(?<=from mod )[^./ ]+(?=] from)");
            if (strSeek.length() == 0) {
                strSeek = INSTANCE.seek(text, "(?<=for mod )[^./ ]+(?= failed)");
            }
            analyze$add$1(r, "mixin", strSeek);
        }
        if (StringsKt.contains$default((CharSequence) text, (CharSequence) "due to errors, provided by ", false, 2, (Object) null)) {
            analyze$add$1(r, "mod_certain", seek(text, "(?<=due to errors, provided by ')[^']+"));
        }
        if (StringsKt.contains$default((CharSequence) text, (CharSequence) "Failed to create mod instance.", false, 2, (Object) null)) {
            String strSeek2 = seek(text, "(?<=Failed to create mod instance. ModID: )[^,]+");
            if (strSeek2.length() == 0) {
                strSeek2 = INSTANCE.seek(text, "(?<=Failed to create mod instance. ModId )[^\\n]+(?= for )");
            }
            analyze$add$1(r, "mod_init", strSeek2);
        }
        if (StringsKt.contains$default((CharSequence) hs, (CharSequence) "The system is out of physical RAM or swap space", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) hs, (CharSequence) "Out of Memory Error", false, 2, (Object) null)) {
            analyze$add$default(r, "oom", null, 4, null);
        }
        if (StringsKt.contains$default((CharSequence) hs, (CharSequence) "EXCEPTION_ACCESS_VIOLATION", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) hs, (CharSequence) "SIGSEGV", false, 2, (Object) null)) {
            list = null;
            if (StringsKt.contains$default((CharSequence) hs, (CharSequence) "# C  [ig", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) hs, (CharSequence) "# C [ig", false, 2, (Object) null)) {
                i3 = 4;
                analyze$add$default(r, "intel_av", null, 4, null);
            } else {
                i3 = 4;
            }
            if (StringsKt.contains$default((CharSequence) hs, (CharSequence) "[atio", false, 2, (Object) null)) {
                analyze$add$default(r, "amd_av", null, i3, null);
            }
            if (StringsKt.contains$default((CharSequence) hs, (CharSequence) "[nvoglv", false, 2, (Object) null)) {
                analyze$add$default(r, "nvidia_av", null, 4, null);
            }
        } else {
            list = null;
        }
        if (StringsKt.contains$default((CharSequence) crash, (CharSequence) "maximum id range exceeded", false, 2, (Object) list)) {
            i4 = 4;
            analyze$add$default(r, "mod_id_limit", list, 4, list);
        } else {
            i4 = 4;
        }
        if (StringsKt.contains$default((CharSequence) crash, (CharSequence) "java.lang.OutOfMemoryError", false, 2, (Object) list)) {
            analyze$add$default(r, "oom", list, i4, list);
        }
        if (StringsKt.contains$default((CharSequence) crash, (CharSequence) "Pixel format not accelerated", false, 2, (Object) list)) {
            analyze$add$default(r, str, list, i4, list);
        }
        if (StringsKt.contains$default((CharSequence) crash, (CharSequence) "Manually triggered debug crash", false, 2, (Object) list)) {
            analyze$add$default(r, "debug_crash", list, 4, list);
        }
        if (new Regex("The Mod File [^\\n]+optifine[\\\\/]OptiFine[^\\n]+ has mods that were not found", RegexOption.IGNORE_CASE).containsMatchIn(crash)) {
            obj = null;
            analyze$add$default(r, "optifine_forge", null, 4, null);
        } else {
            obj = null;
        }
        if (StringsKt.contains$default((CharSequence) crash, (CharSequence) "-- MOD ", false, 2, obj)) {
            String mf = seek(crash, "(?<=Mod File: ).+");
            String lowerCase = mf.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            if (StringsKt.contains$default((CharSequence) lowerCase, (CharSequence) ".jar", false, 2, (Object) null)) {
                analyze$add$1(r, "mod_certain", mf);
            } else {
                analyze$add$1(r, str2, StringsKt.replace$default(seek(crash, "(?<=Failure message: )[\\w\\W]+?(?=\\tMod)"), "\t", StringUtils.SPACE, false, 4, (Object) null));
            }
        }
        if (StringsKt.contains$default((CharSequence) crash, (CharSequence) "Multiple entries with same key: ", false, 2, (Object) null)) {
            analyze$add$1(r, "mod_certain", seek(crash, "(?<=Multiple entries with same key: )[^=]+"));
        }
        if (StringsKt.contains$default((CharSequence) crash, (CharSequence) "\tBlock location: World: ", false, 2, (Object) null)) {
            analyze$add$1(r, "bad_block", StringsKt.trim((CharSequence) (seek(crash, "(?<=\\tBlock: Block\\{)[^}]+") + StringUtils.SPACE + seek(crash, "(?<=\\tBlock location: World: )\\([^)]+\\)"))).toString());
        }
        if (StringsKt.contains$default((CharSequence) crash, (CharSequence) "\tEntity's Exact location: ", false, 2, (Object) null)) {
            String t = seek(crash, "(?<=\\tEntity Type: )[^\\n]+(?= \\()");
            String l = seek(crash, "(?<=\\tEntity's Exact location: )[^\\n]+");
            analyze$add$1(r, "bad_entity", t.length() > 0 ? t + " (" + l + ")" : l);
        }
        if (r.isEmpty() && !StringsKt.contains$default((CharSequence) text, (CharSequence) "at net.", false, 2, (Object) null) && !StringsKt.contains$default((CharSequence) text, (CharSequence) "INFO]", false, 2, (Object) null)) {
            if (hs.length() == 0) {
                if ((crash.length() == 0) && StringsKt.trim((CharSequence) text).toString().length() < 100) {
                    analyze$add$1(r, "tiny_output", StringsKt.trim((CharSequence) text).toString());
                }
            }
        }
        Collection collectionValues2 = r.values();
        Intrinsics.checkNotNullExpressionValue(collectionValues2, "<get-values>(...)");
        return CollectionsKt.toList(collectionValues2);
    }

    private static final void analyze$add(LinkedHashMap<String, CrashReason> linkedHashMap, String k, List<String> list) {
        if (linkedHashMap.containsKey(k)) {
            return;
        }
        LinkedHashMap<String, CrashReason> linkedHashMap2 = linkedHashMap;
        List<String> $this$filter$iv = list;
        Collection destination$iv$iv = new ArrayList();
        for (Object element$iv$iv : $this$filter$iv) {
            String it = (String) element$iv$iv;
            if (it.length() > 0) {
                destination$iv$iv.add(element$iv$iv);
            }
        }
        linkedHashMap2.put(k, new CrashReason(k, (List) destination$iv$iv));
    }

    static /* synthetic */ void analyze$add$default(LinkedHashMap linkedHashMap, String str, List list, int i, Object obj) {
        if ((i & 4) != 0) {
            list = CollectionsKt.emptyList();
        }
        analyze$add(linkedHashMap, str, list);
    }

    private static final void analyze$add$1(LinkedHashMap<String, CrashReason> linkedHashMap, String k, String e) {
        analyze$add(linkedHashMap, k, CollectionsKt.listOf(e));
    }

    public final String describeExit(int code) {
        switch (code) {
            case -11:
            case 139:
                return "SIGSEGV 内存访问冲突（渲染器或 native 库崩溃）";
            case -9:
            case 137:
                return "SIGKILL 被系统结束（通常为内存不足被 LMK 杀死）";
            case -7:
            case 135:
                return "SIGBUS 总线错误";
            case -6:
            case 134:
                return "SIGABRT 进程中止（常见于渲染器/驱动错误）";
            default:
                return null;
        }
    }

    public final String filterSecrets(String s) {
        Intrinsics.checkNotNullParameter(s, "s");
        return SECRET2.replace(SECRET1.replace(s, "$1***"), "$1***");
    }
}
