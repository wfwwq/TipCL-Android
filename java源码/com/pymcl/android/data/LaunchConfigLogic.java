package com.pymcl.android.data;

import com.pymcl.android.ui.state.InputRules;
import com.pymcl.core.config.ConfigStore;
import com.pymcl.core.instance.Instance;
import com.pymcl.core.instance.VersionSettings;
import com.pymcl.core.util.FileUtil;
import com.pymcl.runtime.process.JavaProcessService;
import com.pymcl.runtime.settings.SettingsProtocol;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.RegexOption;
import kotlin.text.StringsKt;
import kotlinx.coroutines.DebugKt;
import org.lwjgl.nanovg.OUI;

/* compiled from: LaunchConfigIO.kt */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001:\u0002@AB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0015J\u0016\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u000bJ\u0010\u0010\u0019\u001a\u00020\u000b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0006J\u0018\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u000b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0006J\u0017\u0010\u001d\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u001eJ6\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u000b2\b\u0010&\u001a\u0004\u0018\u00010\u00062\b\u0010'\u001a\u0004\u0018\u00010\u00062\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020*0)J\u0019\u0010+\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0002\u0010,J4\u0010-\u001a\u00020.2\u0014\u0010/\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0001002\u0016\u00101\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u000100J\u0018\u00102\u001a\u0004\u0018\u00010\u00062\u0006\u00103\u001a\u00020\u00062\u0006\u00104\u001a\u00020\u0006J\u001c\u00105\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0001002\u0006\u00106\u001a\u00020.J2\u00107\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0001002\u0006\u00106\u001a\u00020.2\u0014\u00101\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u000100J(\u00108\u001a\u0002092\u0006\u0010/\u001a\u00020:2\b\u0010;\u001a\u0004\u0018\u00010<2\u0006\u0010=\u001a\u00020\u00062\u0006\u00106\u001a\u00020.J \u0010>\u001a\u00020.2\u0006\u0010/\u001a\u00020:2\b\u0010;\u001a\u0004\u0018\u00010<2\u0006\u0010=\u001a\u00020\u0006J\u0016\u0010?\u001a\u0002092\u0006\u0010;\u001a\u00020<2\u0006\u0010\u001b\u001a\u00020\u000bR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u000e\u0010\u001f\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000Ê\u0001\f\bC\u0012\b\bD\u0012\u0004\b\u0003\u0010\u0002¨\u0006B"}, d2 = {"Lcom/pymcl/android/data/LaunchConfigLogic;", "", "<init>", "()V", "JAVA_OPTIONS", "", "", "getJAVA_OPTIONS", "()Ljava/util/List;", "JAVA_AUTO", "MEM_MIN", "", "MEM_STEP", "WIDTH_RANGE", "Lkotlin/ranges/IntRange;", "getWIDTH_RANGE", "()Lkotlin/ranges/IntRange;", "HEIGHT_RANGE", "getHEIGHT_RANGE", "memMax", "totalMb", "", "clampMem", SettingsProtocol.EXTRA_VALUE, "max", "javaIndex", "javaValue", "index", "current", "javaMajorOverride", "(Ljava/lang/String;)Ljava/lang/Integer;", "JAVA_NOTE_UNAVAILABLE", "JAVA_NOTE_TOO_LOW", "JAVA_NOTE_BY_VERSION", "JAVA_NOTE_BY_INSTANCE", "resolveJava", "Lcom/pymcl/android/data/LaunchConfigLogic$JavaPick;", DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "versionJava", "instanceJava", "available", "Lkotlin/Function1;", "", "num", "(Ljava/lang/Object;)Ljava/lang/Integer;", "effective", "Lcom/pymcl/android/data/LaunchConfigLogic$Display;", "config", "", "version", "validateRes", "w", "h", "configChanges", "d", "versionChanges", "saveDisplay", "", "Lcom/pymcl/core/config/ConfigStore;", "inst", "Lcom/pymcl/core/instance/Instance;", "versionId", "loadDisplay", "saveJava", "JavaPick", "Display", "PyMCL-Android:app_debug", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes21.dex */
public final class LaunchConfigLogic {
    public static final int $stable = 0;
    public static final String JAVA_NOTE_BY_INSTANCE = "按实例设置使用 Java {0}（自动为 Java {1}）";
    public static final String JAVA_NOTE_BY_VERSION = "按版本设置使用 Java {0}（自动为 Java {1}）";
    public static final String JAVA_NOTE_TOO_LOW = "所选 Java {0} 低于该版本最低需求 Java {1}，改用自动选择";
    public static final String JAVA_NOTE_UNAVAILABLE = "运行时未内置 Java {0}，改用自动选择（Java {1}）";
    public static final int MEM_MIN = 512;
    public static final int MEM_STEP = 256;
    public static final LaunchConfigLogic INSTANCE = new LaunchConfigLogic();
    public static final String JAVA_AUTO = "自动选择";
    private static final List<String> JAVA_OPTIONS = CollectionsKt.listOf((Object[]) new String[]{JAVA_AUTO, "Java 8", "Java 17", "Java 21"});
    private static final IntRange WIDTH_RANGE = new IntRange(320, 7680);
    private static final IntRange HEIGHT_RANGE = new IntRange(240, 4320);

    private LaunchConfigLogic() {
    }

    public final List<String> getJAVA_OPTIONS() {
        return JAVA_OPTIONS;
    }

    public final IntRange getWIDTH_RANGE() {
        return WIDTH_RANGE;
    }

    public final IntRange getHEIGHT_RANGE() {
        return HEIGHT_RANGE;
    }

    public final int memMax(long totalMb) {
        if (totalMb <= 0) {
            return 8192;
        }
        long j = 256;
        return RangesKt.coerceIn((int) ((((3 * totalMb) / 4) / j) * j), 1024, 16384);
    }

    public final int clampMem(int v, int max) {
        return RangesKt.coerceIn(((RangesKt.coerceIn(v, 512, max) + 128) / 256) * 256, 512, max);
    }

    public final int javaIndex(String v) {
        List<String> groupValues;
        String str;
        Integer intOrNull;
        String s = v != null ? StringsKt.trim((CharSequence) v).toString() : null;
        if (s == null) {
            s = "";
        }
        if ((s.length() == 0) || Intrinsics.areEqual(s, JAVA_AUTO) || StringsKt.equals(s, DebugKt.DEBUG_PROPERTY_VALUE_AUTO, true)) {
            return 0;
        }
        int exact = 0;
        Iterator<String> it = JAVA_OPTIONS.iterator();
        while (true) {
            if (it.hasNext()) {
                if (StringsKt.equals((String) it.next(), s, true)) {
                    break;
                }
                exact++;
            } else {
                exact = -1;
                break;
            }
        }
        if (exact >= 0) {
            return exact;
        }
        MatchResult matchResultFind$default = Regex.find$default(new Regex("^(?:java\\s*)?(\\d{1,2})$", RegexOption.IGNORE_CASE), s, 0, 2, null);
        if (matchResultFind$default == null || (groupValues = matchResultFind$default.getGroupValues()) == null || (str = groupValues.get(1)) == null || (intOrNull = StringsKt.toIntOrNull(str)) == null) {
            return 0;
        }
        int major = intOrNull.intValue();
        return RangesKt.coerceAtLeast(JAVA_OPTIONS.indexOf("Java " + major), 0);
    }

    public final String javaValue(int index, String current) {
        if (current != null && javaIndex(current) == index) {
            return current;
        }
        List<String> list = JAVA_OPTIONS;
        boolean z = false;
        if (index >= 0 && index < list.size()) {
            z = true;
        }
        return z ? list.get(index) : JAVA_AUTO;
    }

    public final Integer javaMajorOverride(String v) {
        int i = javaIndex(v);
        if (i == 0) {
            return null;
        }
        return Integer.valueOf(Integer.parseInt(StringsKt.removePrefix(JAVA_OPTIONS.get(i), (CharSequence) "Java ")));
    }

    /* compiled from: LaunchConfigIO.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007HÆ\u0003J/\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007HÆ\u0001J\u0014\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0017\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u0018\u001a\u00020\u0005HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fÊ\u0001\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\u0003\u0010\u0000¨\u0006\u0019"}, d2 = {"Lcom/pymcl/android/data/LaunchConfigLogic$JavaPick;", "", "major", "", "note", "", JavaProcessService.EXTRA_ARGS, "", "<init>", "(ILjava/lang/String;Ljava/util/List;)V", "getMajor", "()I", "getNote", "()Ljava/lang/String;", "getArgs", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "PyMCL-Android:app_debug", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class JavaPick {
        public static final int $stable = 8;
        private final List<Object> args;
        private final int major;
        private final String note;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ JavaPick copy$default(JavaPick javaPick, int i, String str, List list, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = javaPick.major;
            }
            if ((i2 & 2) != 0) {
                str = javaPick.note;
            }
            if ((i2 & 4) != 0) {
                list = javaPick.args;
            }
            return javaPick.copy(i, str, list);
        }

        /* renamed from: component1, reason: from getter */
        public final int getMajor() {
            return this.major;
        }

        /* renamed from: component2, reason: from getter */
        public final String getNote() {
            return this.note;
        }

        public final List<Object> component3() {
            return this.args;
        }

        public final JavaPick copy(int major, String note, List<? extends Object> args) {
            Intrinsics.checkNotNullParameter(args, "args");
            return new JavaPick(major, note, args);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof JavaPick)) {
                return false;
            }
            JavaPick javaPick = (JavaPick) other;
            return this.major == javaPick.major && Intrinsics.areEqual(this.note, javaPick.note) && Intrinsics.areEqual(this.args, javaPick.args);
        }

        public int hashCode() {
            return (((Integer.hashCode(this.major) * 31) + (this.note == null ? 0 : this.note.hashCode())) * 31) + this.args.hashCode();
        }

        public String toString() {
            return "JavaPick(major=" + this.major + ", note=" + this.note + ", args=" + this.args + ")";
        }

        public JavaPick(int major, String note, List<? extends Object> args) {
            Intrinsics.checkNotNullParameter(args, "args");
            this.major = major;
            this.note = note;
            this.args = args;
        }

        public /* synthetic */ JavaPick(int i, String str, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? CollectionsKt.emptyList() : list);
        }

        public final List<Object> getArgs() {
            return this.args;
        }

        public final int getMajor() {
            return this.major;
        }

        public final String getNote() {
            return this.note;
        }
    }

    public final JavaPick resolveJava(int auto, String versionJava, String instanceJava, Function1<? super Integer, Boolean> available) {
        int iIntValue;
        Intrinsics.checkNotNullParameter(available, "available");
        Integer fromVersion = javaMajorOverride(versionJava);
        if (fromVersion != null) {
            iIntValue = fromVersion.intValue();
        } else {
            Integer numJavaMajorOverride = javaMajorOverride(instanceJava);
            if (numJavaMajorOverride == null) {
                return new JavaPick(auto, null, null, 6, null);
            }
            iIntValue = numJavaMajorOverride.intValue();
        }
        int want = iIntValue;
        if (want == auto) {
            return new JavaPick(auto, null, null, 6, null);
        }
        if (!available.invoke(Integer.valueOf(want)).booleanValue()) {
            return new JavaPick(auto, JAVA_NOTE_UNAVAILABLE, CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(want), Integer.valueOf(auto)}));
        }
        if (want < auto) {
            return new JavaPick(auto, JAVA_NOTE_TOO_LOW, CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(want), Integer.valueOf(auto)}));
        }
        return new JavaPick(want, fromVersion != null ? JAVA_NOTE_BY_VERSION : JAVA_NOTE_BY_INSTANCE, CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(want), Integer.valueOf(auto)}));
    }

    /* compiled from: LaunchConfigIO.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0014\u0010\u0015\u001a\u00020\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0017\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u0018\u001a\u00020\u0019HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fÊ\u0001\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u001a"}, d2 = {"Lcom/pymcl/android/data/LaunchConfigLogic$Display;", "", "memoryMb", "", "width", "height", "versionOverride", "", "<init>", "(IIIZ)V", "getMemoryMb", "()I", "getWidth", "getHeight", "getVersionOverride", "()Z", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "toString", "", "PyMCL-Android:app_debug", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class Display {
        public static final int $stable = 0;
        private final int height;
        private final int memoryMb;
        private final boolean versionOverride;
        private final int width;

        public static /* synthetic */ Display copy$default(Display display, int i, int i2, int i3, boolean z, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                i = display.memoryMb;
            }
            if ((i4 & 2) != 0) {
                i2 = display.width;
            }
            if ((i4 & 4) != 0) {
                i3 = display.height;
            }
            if ((i4 & 8) != 0) {
                z = display.versionOverride;
            }
            return display.copy(i, i2, i3, z);
        }

        /* renamed from: component1, reason: from getter */
        public final int getMemoryMb() {
            return this.memoryMb;
        }

        /* renamed from: component2, reason: from getter */
        public final int getWidth() {
            return this.width;
        }

        /* renamed from: component3, reason: from getter */
        public final int getHeight() {
            return this.height;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getVersionOverride() {
            return this.versionOverride;
        }

        public final Display copy(int memoryMb, int width, int height, boolean versionOverride) {
            return new Display(memoryMb, width, height, versionOverride);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Display)) {
                return false;
            }
            Display display = (Display) other;
            return this.memoryMb == display.memoryMb && this.width == display.width && this.height == display.height && this.versionOverride == display.versionOverride;
        }

        public int hashCode() {
            return (((((Integer.hashCode(this.memoryMb) * 31) + Integer.hashCode(this.width)) * 31) + Integer.hashCode(this.height)) * 31) + Boolean.hashCode(this.versionOverride);
        }

        public String toString() {
            return "Display(memoryMb=" + this.memoryMb + ", width=" + this.width + ", height=" + this.height + ", versionOverride=" + this.versionOverride + ")";
        }

        public Display(int memoryMb, int width, int height, boolean versionOverride) {
            this.memoryMb = memoryMb;
            this.width = width;
            this.height = height;
            this.versionOverride = versionOverride;
        }

        public /* synthetic */ Display(int i, int i2, int i3, boolean z, int i4, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, i2, i3, (i4 & 8) != 0 ? false : z);
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

        public final boolean getVersionOverride() {
            return this.versionOverride;
        }
    }

    private final Integer num(Object v) {
        String string;
        Number number = v instanceof Number ? (Number) v : null;
        if (number != null) {
            return Integer.valueOf(number.intValue());
        }
        String str = v instanceof String ? (String) v : null;
        if (str == null || (string = StringsKt.trim((CharSequence) str).toString()) == null) {
            return null;
        }
        return StringsKt.toIntOrNull(string);
    }

    public final Display effective(Map<String, ? extends Object> config, Map<String, ? extends Object> version) {
        int iIntValue;
        int iIntValue2;
        int iIntValue3;
        Intrinsics.checkNotNullParameter(config, "config");
        Integer vm = version != null ? INSTANCE.num(version.get("memory_mb")) : null;
        Integer vw = version != null ? INSTANCE.num(version.get("window_width")) : null;
        Integer vh = version != null ? INSTANCE.num(version.get("window_height")) : null;
        if (vm != null) {
            iIntValue = vm.intValue();
        } else {
            Integer num = num(config.get("memory_mb"));
            iIntValue = num != null ? num.intValue() : 4096;
        }
        if (vw != null) {
            iIntValue2 = vw.intValue();
        } else {
            Integer num2 = num(config.get("width"));
            iIntValue2 = num2 != null ? num2.intValue() : 854;
        }
        if (vh != null) {
            iIntValue3 = vh.intValue();
        } else {
            Integer num3 = num(config.get("height"));
            iIntValue3 = num3 != null ? num3.intValue() : OUI.UI_FILL;
        }
        return new Display(iIntValue, iIntValue2, iIntValue3, (vm == null && vw == null && vh == null) ? false : true);
    }

    public final String validateRes(String w, String h) {
        Intrinsics.checkNotNullParameter(w, "w");
        Intrinsics.checkNotNullParameter(h, "h");
        String strIntInRange = InputRules.INSTANCE.intInRange(w, WIDTH_RANGE, false);
        return strIntInRange == null ? InputRules.INSTANCE.intInRange(h, HEIGHT_RANGE, false) : strIntInRange;
    }

    public final Map<String, Object> configChanges(Display d) {
        Intrinsics.checkNotNullParameter(d, "d");
        return MapsKt.linkedMapOf(TuplesKt.to("memory_mb", Long.valueOf(d.getMemoryMb())), TuplesKt.to("width", Long.valueOf(d.getWidth())), TuplesKt.to("height", Long.valueOf(d.getHeight())));
    }

    public final Map<String, Object> versionChanges(Display d, Map<String, ? extends Object> version) {
        Intrinsics.checkNotNullParameter(d, "d");
        Intrinsics.checkNotNullParameter(version, "version");
        Map mapCreateMapBuilder = MapsKt.createMapBuilder();
        if (INSTANCE.num(version.get("memory_mb")) != null) {
            mapCreateMapBuilder.put("memory_mb", Long.valueOf(d.getMemoryMb()));
        }
        if (INSTANCE.num(version.get("window_width")) != null) {
            mapCreateMapBuilder.put("window_width", Long.valueOf(d.getWidth()));
        }
        if (INSTANCE.num(version.get("window_height")) != null) {
            mapCreateMapBuilder.put("window_height", Long.valueOf(d.getHeight()));
        }
        return MapsKt.build(mapCreateMapBuilder);
    }

    public final void saveDisplay(ConfigStore config, Instance inst, String versionId, Display d) {
        Map<String, ? extends Object> vMap;
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(versionId, "versionId");
        Intrinsics.checkNotNullParameter(d, "d");
        Map<String, Object> vc = null;
        VersionSettings vs = (inst == null || StringsKt.isBlank(versionId) || !inst.versionDir(versionId).isDirectory()) ? null : inst.settings(versionId, config);
        if (vs == null) {
            vMap = null;
        } else {
            vMap = FileUtil.INSTANCE.readJsonObj(vs.getFile());
        }
        if (vMap != null) {
            vc = INSTANCE.versionChanges(d, vMap);
        }
        if (vc == null) {
            vc = MapsKt.emptyMap();
        }
        if (vs != null && !vc.isEmpty()) {
            vs.save(vc);
            Map mapConfigChanges = configChanges(d);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : mapConfigChanges.entrySet()) {
                String key = entry.getKey();
                if ((Intrinsics.areEqual(key, "memory_mb") && !vc.containsKey("memory_mb")) || (Intrinsics.areEqual(key, "width") && !vc.containsKey("window_width")) || (Intrinsics.areEqual(key, "height") && !vc.containsKey("window_height"))) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            LinkedHashMap rest = linkedHashMap;
            if (!rest.isEmpty()) {
                config.update(rest);
                return;
            }
            return;
        }
        config.update(configChanges(d));
    }

    public final Display loadDisplay(ConfigStore config, Instance inst, String versionId) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(versionId, "versionId");
        Map<String, Object> vMap = null;
        if (inst != null && !StringsKt.isBlank(versionId)) {
            vMap = FileUtil.INSTANCE.readJsonObj(new VersionSettings(inst.versionDir(versionId), null, 2, null).getFile());
        }
        return effective(config.snapshot(), vMap);
    }

    public final void saveJava(Instance inst, int index) {
        Intrinsics.checkNotNullParameter(inst, "inst");
        Object obj = inst.meta().get("java");
        String cur = obj instanceof String ? (String) obj : null;
        String v = javaValue(index, cur);
        if (!Intrinsics.areEqual(v, cur)) {
            inst.setMeta("java", v);
        }
    }
}
