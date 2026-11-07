package com.pymcl.android.data;

import com.pymcl.android.ui.state.UiSettings;
import com.pymcl.multiplayer.TerracottaVpnService;
import com.pymcl.runtime.settings.SettingsProtocol;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
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
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import kotlinx.coroutines.DebugKt;
import org.lwjgl.util.shaderc.SPV;

/* compiled from: SettingsLogic.kt */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\"\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001:\u0003BCDB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0012\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0013\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0014\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0006J>\u0010\u0015\u001a\u00020\u00062\b\u0010\u0016\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0017\u001a\u00020\u00102\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0014\u0010\u0019\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00100\u001aH\u0002J\u0016\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0010J\u000e\u0010$\u001a\u00020\u00102\u0006\u0010%\u001a\u00020\u0010J\u001f\u0010&\u001a\u0004\u0018\u00010\u00102\u0006\u0010'\u001a\u00020\u00062\b\b\u0002\u0010(\u001a\u00020\u0010¢\u0006\u0002\u0010)J\u000e\u0010#\u001a\u00020\u00102\u0006\u0010*\u001a\u00020+J\u000e\u0010,\u001a\u00020\u00102\u0006\u0010*\u001a\u00020+J\u000e\u0010-\u001a\u00020.2\u0006\u0010!\u001a\u00020\"J\u000e\u0010/\u001a\u00020.2\u0006\u0010!\u001a\u00020\"J\u000e\u00100\u001a\u00020.2\u0006\u0010!\u001a\u00020\"J\u000e\u00101\u001a\u00020.2\u0006\u0010!\u001a\u00020\"J\u000e\u00102\u001a\u00020.2\u0006\u0010!\u001a\u00020\"J\u000e\u00103\u001a\u00020.2\u0006\u0010!\u001a\u00020\"J\u000e\u00104\u001a\u00020\"2\u0006\u0010!\u001a\u00020\"J\u000e\u00105\u001a\u0002062\u0006\u0010!\u001a\u00020\"J\u0016\u00107\u001a\u00020\"2\u0006\u0010!\u001a\u00020\"2\u0006\u00108\u001a\u000206J\"\u0010>\u001a\u00020\u00062\b\u0010?\u001a\u0004\u0018\u00010\u00062\b\u0010@\u001a\u0004\u0018\u00010\u00062\u0006\u0010A\u001a\u00020+R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\bR\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\bR\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\bR\u000e\u0010\u001b\u001a\u00020\u0010X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0010X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0010X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0010X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00109\u001a\u00020.X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010:\u001a\u00020.X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010;\u001a\u00020.X\u0086T¢\u0006\u0002\n\u0000R\u0014\u0010<\u001a\b\u0012\u0004\u0012\u00020\u00060=X\u0082\u0004¢\u0006\u0002\n\u0000Ê\u0001\f\bF\u0012\b\bG\u0012\u0004\b\u0003\u0010\u0002¨\u0006E"}, d2 = {"Lcom/pymcl/android/data/SettingsLogic;", "", "<init>", "()V", "ISOLATION", "", "", "getISOLATION", "()Ljava/util/List;", "GC", "getGC", "VISIBILITY", "getVISIBILITY", "HOMEPAGE", "getHOMEPAGE", "isolationIndex", "", SettingsProtocol.EXTRA_VALUE, "gcIndex", "visibilityIndex", "homepageIndex", "keep", "current", "index", "values", "toIndex", "Lkotlin/Function1;", "MIN_MEMORY_MB", "MIN_WIDTH", "MIN_HEIGHT", "MAX_DIM", "validate", "Lcom/pymcl/android/data/SettingsLogic$Validation;", "s", "Lcom/pymcl/android/ui/state/UiSettings;", "maxMemoryMb", "roundMemory", "mb", "parseIntField", TerracottaVpnService.EXTRA_TEXT, "maxDigits", "(Ljava/lang/String;I)Ljava/lang/Integer;", "totalMb", "", "recommendMemoryMb", "flyDurationEnabled", "", "flyToggleEnabled", "cardRadiusEnabled", "wallpaperRandomEnabled", "wallpaperEffectsEnabled", "updateUrlEnabled", "factoryAppearance", "snap", "Lcom/pymcl/android/data/SettingsLogic$WallpaperSnap;", "restore", "w", "WALLPAPER_FOLDER_SUPPORTED", "FLY_ANIMATION_SUPPORTED", "UPDATE_CHECK_SUPPORTED", "IMAGE_EXT", "", "wallpaperFileName", "lastSegment", "mime", "nowMs", "Extras", "Validation", "WallpaperSnap", "PyMCL-Android:app_debug", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes21.dex */
public final class SettingsLogic {
    public static final int $stable = 0;
    public static final boolean FLY_ANIMATION_SUPPORTED = false;
    public static final int MAX_DIM = 7680;
    public static final int MIN_HEIGHT = 240;
    public static final int MIN_MEMORY_MB = 512;
    public static final int MIN_WIDTH = 320;
    public static final boolean UPDATE_CHECK_SUPPORTED = false;
    public static final boolean WALLPAPER_FOLDER_SUPPORTED = false;
    public static final SettingsLogic INSTANCE = new SettingsLogic();
    private static final List<String> ISOLATION = CollectionsKt.listOf((Object[]) new String[]{"none", "saves", "mods", "all"});
    private static final List<String> GC = CollectionsKt.listOf((Object[]) new String[]{DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "g1_tuned", "none"});
    private static final List<String> VISIBILITY = CollectionsKt.listOf((Object[]) new String[]{"keep", "minimize", "hide", "hide_reopen", "close"});
    private static final List<String> HOMEPAGE = CollectionsKt.listOf((Object[]) new String[]{"news", "local", "blank"});
    private static final Set<String> IMAGE_EXT = SetsKt.setOf((Object[]) new String[]{"jpg", "jpeg", "png", "webp", "bmp", "gif", "heic", "heif"});

    private SettingsLogic() {
    }

    public final List<String> getISOLATION() {
        return ISOLATION;
    }

    public final List<String> getGC() {
        return GC;
    }

    public final List<String> getVISIBILITY() {
        return VISIBILITY;
    }

    public final List<String> getHOMEPAGE() {
        return HOMEPAGE;
    }

    public final int isolationIndex(String v) {
        Integer numValueOf = Integer.valueOf(CollectionsKt.indexOf((List<? extends String>) ISOLATION, v));
        if (!(numValueOf.intValue() >= 0)) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 3;
    }

    public final int gcIndex(String v) {
        if (Intrinsics.areEqual(v, "g1_tuned")) {
            return 1;
        }
        return Intrinsics.areEqual(v, "none") ? 2 : 0;
    }

    public final int visibilityIndex(String v) {
        Integer numValueOf = Integer.valueOf(CollectionsKt.indexOf((List<? extends String>) VISIBILITY, v));
        if (!(numValueOf.intValue() >= 0)) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0025 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0030 A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int homepageIndex(java.lang.String r2) {
        /*
            r1 = this;
            if (r2 == 0) goto L32
            int r0 = r2.hashCode()
            switch(r0) {
                case 3213227: goto L27;
                case 3387192: goto L1c;
                case 93819220: goto L13;
                case 103145323: goto La;
                default: goto L9;
            }
        L9:
            goto L32
        La:
            java.lang.String r0 = "local"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L32
            goto L30
        L13:
            java.lang.String r0 = "blank"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L25
            goto L32
        L1c:
            java.lang.String r0 = "none"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L25
            goto L32
        L25:
            r0 = 2
            goto L33
        L27:
            java.lang.String r0 = "html"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L30
            goto L32
        L30:
            r0 = 1
            goto L33
        L32:
            r0 = 0
        L33:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.android.data.SettingsLogic.homepageIndex(java.lang.String):int");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String keep(String current, int index, List<String> values, Function1<? super String, Integer> toIndex) {
        if (current == null || toIndex.invoke(current).intValue() != index) {
            return index >= 0 && index < values.size() ? values.get(index) : values.get(0);
        }
        return current;
    }

    /* compiled from: SettingsLogic.kt */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0005J2\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0014\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0018J\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u00152\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0002\u0010\u001eJ.\u0010\u001f\u001a\u00020\u001a2\u0014\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\b\b\u0002\u0010!\u001a\u00020\u0015R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011Ê\u0001\f\b#\u0012\b\b$\u0012\u0004\b\u0003\u0010\u0002¨\u0006\""}, d2 = {"Lcom/pymcl/android/data/SettingsLogic$Extras;", "", "<init>", "()V", "THEME_COLOR", "", "ISOLATION_KEY", "GC_KEY", "VISIBILITY_KEY", "HOMEPAGE_KEY", "BG_PRESET", "SQUARE", "CARD_RADIUS", "FROST", "KEYS", "", "getKEYS", "()Ljava/util/List;", "ACCENT_HEX", "getACCENT_HEX", "accentIndex", "", "hex", "toConfig", "", "s", "Lcom/pymcl/android/ui/state/UiSettings;", "current", "num", SettingsProtocol.EXTRA_VALUE, "(Ljava/lang/Object;)Ljava/lang/Integer;", "applyFrom", "c", "bgCount", "PyMCL-Android:app_debug", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class Extras {
        public static final int $stable = 0;
        public static final Extras INSTANCE = new Extras();
        public static final String THEME_COLOR = "theme_color";
        public static final String ISOLATION_KEY = "default_isolation";
        public static final String GC_KEY = "gc_preset";
        public static final String VISIBILITY_KEY = "launcher_visibility";
        public static final String HOMEPAGE_KEY = "homepage_mode";
        public static final String BG_PRESET = "android_ui_bg_preset";
        public static final String SQUARE = "android_ui_square_cards";
        public static final String CARD_RADIUS = "android_ui_card_radius";
        public static final String FROST = "android_ui_sidebar_frost";
        private static final List<String> KEYS = CollectionsKt.listOf((Object[]) new String[]{THEME_COLOR, ISOLATION_KEY, GC_KEY, VISIBILITY_KEY, HOMEPAGE_KEY, BG_PRESET, SQUARE, CARD_RADIUS, FROST});
        private static final List<String> ACCENT_HEX = CollectionsKt.listOf((Object[]) new String[]{"#2E9B6B", "#2F72C4", "#7C5CFC", "#D68A17", "#D64545", "#149B9B"});

        private Extras() {
        }

        public final List<String> getKEYS() {
            return KEYS;
        }

        public final List<String> getACCENT_HEX() {
            return ACCENT_HEX;
        }

        public final int accentIndex(String hex) {
            int i = 0;
            Iterator<String> it = ACCENT_HEX.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (StringsKt.equals((String) it.next(), hex != null ? StringsKt.trim((CharSequence) hex).toString() : null, true)) {
                        break;
                    }
                    i++;
                } else {
                    i = -1;
                    break;
                }
            }
            return RangesKt.coerceAtLeast(i, 0);
        }

        public final Map<String, Object> toConfig(UiSettings s, Map<String, ? extends Object> current) {
            String str;
            Intrinsics.checkNotNullParameter(s, "s");
            Intrinsics.checkNotNullParameter(current, "current");
            Object obj = current.get(THEME_COLOR);
            String curHex = obj instanceof String ? (String) obj : null;
            Pair[] pairArr = new Pair[9];
            if (curHex == null || accentIndex(curHex) != s.getAccentIndex()) {
                List<String> list = ACCENT_HEX;
                int accentIndex = s.getAccentIndex();
                str = accentIndex >= 0 && accentIndex < list.size() ? list.get(accentIndex) : ACCENT_HEX.get(0);
            } else {
                str = curHex;
            }
            pairArr[0] = TuplesKt.to(THEME_COLOR, str);
            SettingsLogic settingsLogic = SettingsLogic.INSTANCE;
            Object obj2 = current.get(ISOLATION_KEY);
            pairArr[1] = TuplesKt.to(ISOLATION_KEY, settingsLogic.keep(obj2 instanceof String ? (String) obj2 : null, s.getIsolation(), SettingsLogic.INSTANCE.getISOLATION(), new SettingsLogic$Extras$toConfig$2(SettingsLogic.INSTANCE)));
            SettingsLogic settingsLogic2 = SettingsLogic.INSTANCE;
            Object obj3 = current.get(GC_KEY);
            pairArr[2] = TuplesKt.to(GC_KEY, settingsLogic2.keep(obj3 instanceof String ? (String) obj3 : null, s.getGc(), SettingsLogic.INSTANCE.getGC(), new SettingsLogic$Extras$toConfig$3(SettingsLogic.INSTANCE)));
            SettingsLogic settingsLogic3 = SettingsLogic.INSTANCE;
            Object obj4 = current.get(VISIBILITY_KEY);
            pairArr[3] = TuplesKt.to(VISIBILITY_KEY, settingsLogic3.keep(obj4 instanceof String ? (String) obj4 : null, s.getVisibility(), SettingsLogic.INSTANCE.getVISIBILITY(), new SettingsLogic$Extras$toConfig$4(SettingsLogic.INSTANCE)));
            SettingsLogic settingsLogic4 = SettingsLogic.INSTANCE;
            Object obj5 = current.get(HOMEPAGE_KEY);
            pairArr[4] = TuplesKt.to(HOMEPAGE_KEY, settingsLogic4.keep(obj5 instanceof String ? (String) obj5 : null, s.getHomepage(), SettingsLogic.INSTANCE.getHOMEPAGE(), new SettingsLogic$Extras$toConfig$5(SettingsLogic.INSTANCE)));
            pairArr[5] = TuplesKt.to(BG_PRESET, Long.valueOf(s.getBackground()));
            pairArr[6] = TuplesKt.to(SQUARE, Boolean.valueOf(s.getSquareCards()));
            pairArr[7] = TuplesKt.to(CARD_RADIUS, Long.valueOf(s.getCardRadius()));
            pairArr[8] = TuplesKt.to(FROST, Boolean.valueOf(s.getSidebarFrost()));
            return MapsKt.linkedMapOf(pairArr);
        }

        private final Integer num(Object v) {
            Number number = v instanceof Number ? (Number) v : null;
            if (number != null) {
                return Integer.valueOf(number.intValue());
            }
            String str = v instanceof String ? (String) v : null;
            if (str != null) {
                return StringsKt.toIntOrNull(str);
            }
            return null;
        }

        public static /* synthetic */ UiSettings applyFrom$default(Extras extras, Map map, UiSettings uiSettings, int i, int i2, Object obj) {
            if ((i2 & 4) != 0) {
                i = 4;
            }
            return extras.applyFrom(map, uiSettings, i);
        }

        public final UiSettings applyFrom(Map<String, ? extends Object> c, UiSettings s, int bgCount) {
            Intrinsics.checkNotNullParameter(c, "c");
            Intrinsics.checkNotNullParameter(s, "s");
            Object obj = c.get(THEME_COLOR);
            int iAccentIndex = accentIndex(obj instanceof String ? (String) obj : null);
            SettingsLogic settingsLogic = SettingsLogic.INSTANCE;
            Object obj2 = c.get(ISOLATION_KEY);
            int iIsolationIndex = settingsLogic.isolationIndex(obj2 instanceof String ? (String) obj2 : null);
            SettingsLogic settingsLogic2 = SettingsLogic.INSTANCE;
            Object obj3 = c.get(GC_KEY);
            int iGcIndex = settingsLogic2.gcIndex(obj3 instanceof String ? (String) obj3 : null);
            SettingsLogic settingsLogic3 = SettingsLogic.INSTANCE;
            Object obj4 = c.get(VISIBILITY_KEY);
            int iVisibilityIndex = settingsLogic3.visibilityIndex(obj4 instanceof String ? (String) obj4 : null);
            SettingsLogic settingsLogic4 = SettingsLogic.INSTANCE;
            Object obj5 = c.get(HOMEPAGE_KEY);
            int iHomepageIndex = settingsLogic4.homepageIndex(obj5 instanceof String ? (String) obj5 : null);
            Integer num = num(c.get(BG_PRESET));
            int iCoerceIn = RangesKt.coerceIn(num != null ? num.intValue() : s.getBackground(), 0, bgCount - 1);
            Object obj6 = c.get(SQUARE);
            Boolean bool = obj6 instanceof Boolean ? (Boolean) obj6 : null;
            boolean zBooleanValue = bool != null ? bool.booleanValue() : s.getSquareCards();
            Integer num2 = num(c.get(CARD_RADIUS));
            int iCoerceIn2 = RangesKt.coerceIn(num2 != null ? num2.intValue() : s.getCardRadius(), 0, 24);
            Object obj7 = c.get(FROST);
            Boolean bool2 = obj7 instanceof Boolean ? (Boolean) obj7 : null;
            return UiSettings.copy$default(s, false, iAccentIndex, null, iCoerceIn, 0, zBooleanValue, iCoerceIn2, false, false, 0, bool2 != null ? bool2.booleanValue() : s.getSidebarFrost(), 0, null, null, false, 0, 0, 0, 0, 0, 0, 0, 0, false, 0, null, null, 0, 0, 0, null, iIsolationIndex, iGcIndex, 0, null, false, false, false, 0, null, null, null, null, 0, null, 0, iVisibilityIndex, iHomepageIndex, null, false, null, null, 0, false, 2147482517, 4145150, null);
        }
    }

    /* compiled from: SettingsLogic.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J#\u0010\u0013\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0014\u0010\u0014\u001a\u00020\u000e2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0016\u001a\u00020\u0017HÖ\u0081\u0004J\n\u0010\u0018\u001a\u00020\u0004HÖ\u0081\u0004R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010Ê\u0001\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\u0003\u0010\u0000¨\u0006\u0019"}, d2 = {"Lcom/pymcl/android/data/SettingsLogic$Validation;", "", "problems", "", "", "fixed", "Lcom/pymcl/android/ui/state/UiSettings;", "<init>", "(Ljava/util/List;Lcom/pymcl/android/ui/state/UiSettings;)V", "getProblems", "()Ljava/util/List;", "getFixed", "()Lcom/pymcl/android/ui/state/UiSettings;", SettingsProtocol.EXTRA_OK, "", "getOk", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "PyMCL-Android:app_debug", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class Validation {
        public static final int $stable = UiSettings.$stable;
        private final UiSettings fixed;
        private final List<String> problems;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Validation copy$default(Validation validation, List list, UiSettings uiSettings, int i, Object obj) {
            if ((i & 1) != 0) {
                list = validation.problems;
            }
            if ((i & 2) != 0) {
                uiSettings = validation.fixed;
            }
            return validation.copy(list, uiSettings);
        }

        public final List<String> component1() {
            return this.problems;
        }

        /* renamed from: component2, reason: from getter */
        public final UiSettings getFixed() {
            return this.fixed;
        }

        public final Validation copy(List<String> problems, UiSettings fixed) {
            Intrinsics.checkNotNullParameter(problems, "problems");
            Intrinsics.checkNotNullParameter(fixed, "fixed");
            return new Validation(problems, fixed);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Validation)) {
                return false;
            }
            Validation validation = (Validation) other;
            return Intrinsics.areEqual(this.problems, validation.problems) && Intrinsics.areEqual(this.fixed, validation.fixed);
        }

        public int hashCode() {
            return (this.problems.hashCode() * 31) + this.fixed.hashCode();
        }

        public String toString() {
            return "Validation(problems=" + this.problems + ", fixed=" + this.fixed + ")";
        }

        public Validation(List<String> problems, UiSettings fixed) {
            Intrinsics.checkNotNullParameter(problems, "problems");
            Intrinsics.checkNotNullParameter(fixed, "fixed");
            this.problems = problems;
            this.fixed = fixed;
        }

        public final UiSettings getFixed() {
            return this.fixed;
        }

        public final boolean getOk() {
            return this.problems.isEmpty();
        }

        public final List<String> getProblems() {
            return this.problems;
        }
    }

    public final Validation validate(UiSettings s, int maxMemoryMb) {
        Intrinsics.checkNotNullParameter(s, "s");
        List p = new ArrayList();
        if (s.getWidth() < 320 || s.getWidth() > 7680 || s.getHeight() < 240 || s.getHeight() > 7680) {
            p.add("默认分辨率应在 320×240 到 7680×7680 之间（当前 " + s.getWidth() + "×" + s.getHeight() + "）");
        }
        if (s.getMemoryMb() < 512) {
            p.add("默认内存不能低于 512 MB");
        } else {
            if (1 <= maxMemoryMb && maxMemoryMb < s.getMemoryMb()) {
                p.add("默认内存 " + s.getMemoryMb() + " MB 超过本机可分配上限 " + maxMemoryMb + " MB");
            }
        }
        if (s.getHomepage() == 1 && StringsKt.isBlank(s.getCustomHomepage())) {
            p.add("主页选了「本地 HTML」，但没填 .html 文件路径");
        }
        int iCoerceIn = RangesKt.coerceIn(s.getThreads(), 1, 64);
        int iCoerceIn2 = RangesKt.coerceIn(s.getChunks(), 1, 16);
        int iCoerceAtLeast = RangesKt.coerceAtLeast(s.getSpeedLimit(), 0);
        int iCoerceIn3 = RangesKt.coerceIn(s.getFlyDurationMs(), 200, 1200);
        int iCoerceIn4 = RangesKt.coerceIn(s.getWallpaperBlur(), 0, 40);
        int iCoerceIn5 = RangesKt.coerceIn(s.getWallpaperMask(), 0, 90);
        UiSettings fixed = UiSettings.copy$default(s, false, 0, null, 0, 0, false, RangesKt.coerceIn(s.getCardRadius(), 0, 24), false, false, iCoerceIn3, false, 0, StringsKt.trim((CharSequence) s.getWallpaperPath()).toString(), StringsKt.trim((CharSequence) s.getWallpaperFolder()).toString(), false, 0, iCoerceIn4, iCoerceIn5, 0, iCoerceIn, iCoerceIn2, 0, 0, false, iCoerceAtLeast, StringsKt.trim((CharSequence) s.getCurseforgeKey()).toString(), null, roundMemory(s.getMemoryMb()), 0, 0, null, 0, 0, 0, StringsKt.trim((CharSequence) s.getJvmArgs()).toString(), false, false, false, 0, null, null, null, null, 0, null, 0, 0, 0, StringsKt.trim((CharSequence) s.getCustomHomepage()).toString(), false, StringsKt.trim((CharSequence) s.getUpdateUrl()).toString(), StringsKt.trim((CharSequence) s.getMsClientId()).toString(), 0, false, -186331713, 3342331, null);
        return new Validation(p, fixed);
    }

    public final int roundMemory(int mb) {
        return (mb / 256) * 256;
    }

    public static /* synthetic */ Integer parseIntField$default(SettingsLogic settingsLogic, String str, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 6;
        }
        return settingsLogic.parseIntField(str, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Integer parseIntField(java.lang.String r12, int r13) {
        /*
            r11 = this;
            java.lang.String r0 = "text"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            r0 = r12
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            java.lang.CharSequence r0 = kotlin.text.StringsKt.trim(r0)
            java.lang.String r0 = r0.toString()
            r1 = r0
            r2 = 0
            r3 = r1
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            int r3 = r3.length()
            r4 = 1
            r5 = 0
            if (r3 <= 0) goto L1f
            r3 = r4
            goto L20
        L1f:
            r3 = r5
        L20:
            if (r3 == 0) goto L48
            int r3 = r1.length()
            if (r3 > r13) goto L48
            r3 = r1
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            r6 = 0
            r7 = r5
        L2d:
            int r8 = r3.length()
            if (r7 >= r8) goto L44
            char r8 = r3.charAt(r7)
            r9 = r8
            r10 = 0
            boolean r9 = java.lang.Character.isDigit(r9)
            if (r9 != 0) goto L41
            r3 = r5
            goto L45
        L41:
            int r7 = r7 + 1
            goto L2d
        L44:
            r3 = r4
        L45:
            if (r3 == 0) goto L48
            goto L49
        L48:
            r4 = r5
        L49:
            r1 = 0
            if (r4 == 0) goto L4d
            goto L4e
        L4d:
            r0 = r1
        L4e:
            if (r0 == 0) goto L58
            int r0 = java.lang.Integer.parseInt(r0)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
        L58:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.android.data.SettingsLogic.parseIntField(java.lang.String, int):java.lang.Integer");
    }

    public final int maxMemoryMb(long totalMb) {
        if (totalMb <= 0) {
            return 8192;
        }
        return roundMemory(RangesKt.coerceAtLeast((int) (totalMb - 1536), 1024));
    }

    public final int recommendMemoryMb(long totalMb) {
        if (totalMb <= 0) {
            return 2048;
        }
        int half = RangesKt.coerceIn(roundMemory((int) (totalMb / 2)), 1024, 4096);
        return RangesKt.coerceAtMost(half, maxMemoryMb(totalMb));
    }

    public final boolean flyDurationEnabled(UiSettings s) {
        Intrinsics.checkNotNullParameter(s, "s");
        return s.getMotion() && s.getFlyAnimation();
    }

    public final boolean flyToggleEnabled(UiSettings s) {
        Intrinsics.checkNotNullParameter(s, "s");
        return s.getMotion();
    }

    public final boolean cardRadiusEnabled(UiSettings s) {
        Intrinsics.checkNotNullParameter(s, "s");
        return !s.getSquareCards();
    }

    public final boolean wallpaperRandomEnabled(UiSettings s) {
        Intrinsics.checkNotNullParameter(s, "s");
        return !StringsKt.isBlank(s.getWallpaperFolder());
    }

    public final boolean wallpaperEffectsEnabled(UiSettings s) {
        Intrinsics.checkNotNullParameter(s, "s");
        return (StringsKt.isBlank(s.getWallpaperPath()) && StringsKt.isBlank(s.getWallpaperFolder())) ? false : true;
    }

    public final boolean updateUrlEnabled(UiSettings s) {
        Intrinsics.checkNotNullParameter(s, "s");
        return s.getAutoUpdate();
    }

    public final UiSettings factoryAppearance(UiSettings s) {
        Intrinsics.checkNotNullParameter(s, "s");
        UiSettings d = new UiSettings(false, 0, null, 0, 0, false, 0, false, false, 0, false, 0, null, null, false, 0, 0, 0, 0, 0, 0, 0, 0, false, 0, null, null, 0, 0, 0, null, 0, 0, 0, null, false, false, false, 0, null, null, null, null, 0, null, 0, 0, 0, null, false, null, null, 0, false, -1, SPV.kDefaultMaxIdBound, null);
        return UiSettings.copy$default(s, d.getDark(), d.getAccentIndex(), null, d.getBackground(), 0, d.getSquareCards(), d.getCardRadius(), d.getMotion(), d.getFlyAnimation(), d.getFlyDurationMs(), d.getSidebarFrost(), d.getNavStyle(), "", "", d.getWallpaperRandom(), 0, d.getWallpaperBlur(), 25, 0, 0, 0, 0, 0, false, 0, null, null, 0, 0, 0, null, 0, 0, 0, null, false, false, false, 0, null, null, null, null, 0, null, 0, 0, 0, null, false, null, null, 0, false, -229356, SPV.kDefaultMaxIdBound, null);
    }

    /* compiled from: SettingsLogic.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0017\u001a\u00020\bHÆ\u0003J\t\u0010\u0018\u001a\u00020\bHÆ\u0003J;\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001J\u0014\u0010\u001a\u001a\u00020\u00062\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001c\u001a\u00020\bHÖ\u0081\u0004J\n\u0010\u001d\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012Ê\u0001\f\b\u001f\u0012\b\b \u0012\u0004\b\u0003\u0010\u0002¨\u0006\u001e"}, d2 = {"Lcom/pymcl/android/data/SettingsLogic$WallpaperSnap;", "", "path", "", "folder", "random", "", "blur", "", "mask", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZII)V", "getPath", "()Ljava/lang/String;", "getFolder", "getRandom", "()Z", "getBlur", "()I", "getMask", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "toString", "PyMCL-Android:app_debug", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class WallpaperSnap {
        public static final int $stable = 0;
        private final int blur;
        private final String folder;
        private final int mask;
        private final String path;
        private final boolean random;

        public static /* synthetic */ WallpaperSnap copy$default(WallpaperSnap wallpaperSnap, String str, String str2, boolean z, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                str = wallpaperSnap.path;
            }
            if ((i3 & 2) != 0) {
                str2 = wallpaperSnap.folder;
            }
            if ((i3 & 4) != 0) {
                z = wallpaperSnap.random;
            }
            if ((i3 & 8) != 0) {
                i = wallpaperSnap.blur;
            }
            if ((i3 & 16) != 0) {
                i2 = wallpaperSnap.mask;
            }
            int i4 = i2;
            boolean z2 = z;
            return wallpaperSnap.copy(str, str2, z2, i, i4);
        }

        /* renamed from: component1, reason: from getter */
        public final String getPath() {
            return this.path;
        }

        /* renamed from: component2, reason: from getter */
        public final String getFolder() {
            return this.folder;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getRandom() {
            return this.random;
        }

        /* renamed from: component4, reason: from getter */
        public final int getBlur() {
            return this.blur;
        }

        /* renamed from: component5, reason: from getter */
        public final int getMask() {
            return this.mask;
        }

        public final WallpaperSnap copy(String path, String folder, boolean random, int blur, int mask) {
            Intrinsics.checkNotNullParameter(path, "path");
            Intrinsics.checkNotNullParameter(folder, "folder");
            return new WallpaperSnap(path, folder, random, blur, mask);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof WallpaperSnap)) {
                return false;
            }
            WallpaperSnap wallpaperSnap = (WallpaperSnap) other;
            return Intrinsics.areEqual(this.path, wallpaperSnap.path) && Intrinsics.areEqual(this.folder, wallpaperSnap.folder) && this.random == wallpaperSnap.random && this.blur == wallpaperSnap.blur && this.mask == wallpaperSnap.mask;
        }

        public int hashCode() {
            return (((((((this.path.hashCode() * 31) + this.folder.hashCode()) * 31) + Boolean.hashCode(this.random)) * 31) + Integer.hashCode(this.blur)) * 31) + Integer.hashCode(this.mask);
        }

        public String toString() {
            return "WallpaperSnap(path=" + this.path + ", folder=" + this.folder + ", random=" + this.random + ", blur=" + this.blur + ", mask=" + this.mask + ")";
        }

        public WallpaperSnap(String path, String folder, boolean random, int blur, int mask) {
            Intrinsics.checkNotNullParameter(path, "path");
            Intrinsics.checkNotNullParameter(folder, "folder");
            this.path = path;
            this.folder = folder;
            this.random = random;
            this.blur = blur;
            this.mask = mask;
        }

        public final int getBlur() {
            return this.blur;
        }

        public final String getFolder() {
            return this.folder;
        }

        public final int getMask() {
            return this.mask;
        }

        public final String getPath() {
            return this.path;
        }

        public final boolean getRandom() {
            return this.random;
        }
    }

    public final WallpaperSnap snap(UiSettings s) {
        Intrinsics.checkNotNullParameter(s, "s");
        return new WallpaperSnap(s.getWallpaperPath(), s.getWallpaperFolder(), s.getWallpaperRandom(), s.getWallpaperBlur(), s.getWallpaperMask());
    }

    public final UiSettings restore(UiSettings s, WallpaperSnap w) {
        Intrinsics.checkNotNullParameter(s, "s");
        Intrinsics.checkNotNullParameter(w, "w");
        return UiSettings.copy$default(s, false, 0, null, 0, 0, false, 0, false, false, 0, false, 0, w.getPath(), w.getFolder(), w.getRandom(), 0, w.getBlur(), w.getMask(), 0, 0, 0, 0, 0, false, 0, null, null, 0, 0, 0, null, 0, 0, 0, null, false, false, false, 0, null, null, null, null, 0, null, 0, 0, 0, null, false, null, null, 0, false, -225281, SPV.kDefaultMaxIdBound, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String wallpaperFileName(java.lang.String r10, java.lang.String r11, long r12) {
        /*
            r9 = this;
            java.lang.String r0 = "toLowerCase(...)"
            r1 = 47
            r2 = 2
            r3 = 0
            if (r10 == 0) goto L2e
            java.lang.String r4 = kotlin.text.StringsKt.substringAfterLast$default(r10, r1, r3, r2, r3)
            if (r4 == 0) goto L2e
            r5 = 46
            java.lang.String r6 = ""
            java.lang.String r4 = kotlin.text.StringsKt.substringAfterLast(r4, r5, r6)
            if (r4 == 0) goto L2e
            java.util.Locale r5 = java.util.Locale.ROOT
            java.lang.String r4 = r4.toLowerCase(r5)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r0)
            if (r4 == 0) goto L2e
            r5 = r4
            r6 = 0
            java.util.Set<java.lang.String> r7 = com.pymcl.android.data.SettingsLogic.IMAGE_EXT
            boolean r5 = r7.contains(r5)
            if (r5 == 0) goto L2e
            goto L2f
        L2e:
            r4 = r3
        L2f:
            if (r11 == 0) goto L68
            java.util.Locale r5 = java.util.Locale.ROOT
            java.lang.String r5 = r11.toLowerCase(r5)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r0)
            if (r5 == 0) goto L68
            r0 = r5
            r6 = 0
            java.lang.String r7 = "image/"
            r8 = 0
            boolean r0 = kotlin.text.StringsKt.startsWith$default(r0, r7, r8, r2, r3)
            if (r0 == 0) goto L48
            goto L49
        L48:
            r5 = r3
        L49:
            if (r5 == 0) goto L68
            java.lang.String r0 = kotlin.text.StringsKt.substringAfter$default(r5, r1, r3, r2, r3)
            if (r0 == 0) goto L68
            r1 = 0
            java.lang.String r2 = "jpeg"
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r2)
            if (r2 == 0) goto L5d
            java.lang.String r2 = "jpg"
            r0 = r2
        L5d:
            r1 = r0
            r2 = 0
            java.util.Set<java.lang.String> r5 = com.pymcl.android.data.SettingsLogic.IMAGE_EXT
            boolean r1 = r5.contains(r1)
            if (r1 == 0) goto L68
            r3 = r0
        L68:
            if (r4 != 0) goto L71
            if (r3 != 0) goto L6f
            java.lang.String r0 = "img"
            goto L72
        L6f:
            r0 = r3
            goto L72
        L71:
            r0 = r4
        L72:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "wallpaper-"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r12)
            java.lang.String r2 = "."
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.android.data.SettingsLogic.wallpaperFileName(java.lang.String, java.lang.String, long):java.lang.String");
    }
}
