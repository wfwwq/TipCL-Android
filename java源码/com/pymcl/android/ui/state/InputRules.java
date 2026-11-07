package com.pymcl.android.ui.state;

import com.pymcl.android.ui.i18n.I18nKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.CharsKt;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.RegexOption;
import kotlin.text.StringsKt;

/* compiled from: InputRules.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\f\u001a\u0004\u0018\u00010\b2\u0006\u0010\r\u001a\u00020\bJ4\u0010\u000e\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000f\u001a\u00020\b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u0013\u001a\u00020\u0014J*\u0010\u0015\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000f\u001a\u00020\b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\bJ\u0010\u0010\u0016\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000f\u001a\u00020\bJ\u0010\u0010\u0017\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000f\u001a\u00020\bJ\"\u0010\u0018\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u0014J:\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u001e2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\b0 2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\b0 2\u0006\u0010\"\u001a\u00020\b2\u0006\u0010#\u001a\u00020\bJ\u000e\u0010$\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u001eJ\u0018\u0010%\u001a\u00020\u00142\b\u0010#\u001a\u0004\u0018\u00010\b2\u0006\u0010\"\u001a\u00020\bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bÊ\u0001\f\b'\u0012\b\b(\u0012\u0004\b\u0003\u0010\u0002¨\u0006&"}, d2 = {"Lcom/pymcl/android/ui/state/InputRules;", "", "<init>", "()V", "ILLEGAL_INSTANCE", "Lkotlin/text/Regex;", "RESERVED", "", "", "OFFLINE_NAME", "getOFFLINE_NAME", "()Lkotlin/text/Regex;", "offlineName", "n", "instanceName", "raw", "existing", "", "self", "version", "", "versionId", "nide8Id", "yggdrasilApi", "intInRange", "range", "Lkotlin/ranges/IntRange;", "allowEmpty", "fileCompatible", "kind", "Lcom/pymcl/android/ui/state/CatalogKind;", "gameVersions", "", "loaders", "mc", "loader", "needsVersion", "loaderSupports", "PyMCL-Android:app_debug", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes20.dex */
public final class InputRules {
    public static final int $stable = 0;
    private static final Regex OFFLINE_NAME;
    private static final Set<String> RESERVED;
    public static final InputRules INSTANCE = new InputRules();
    private static final Regex ILLEGAL_INSTANCE = new Regex("[\\\\/:*?\"<>|\\u0000-\\u001f]");

    private InputRules() {
    }

    static {
        Set of = SetsKt.setOf((Object[]) new String[]{"CON", "PRN", "AUX", "NUL"});
        Iterable intRange = new IntRange(1, 9);
        Collection arrayList = new ArrayList();
        Iterator<Integer> it = intRange.iterator();
        while (it.hasNext()) {
            int iNextInt = ((IntIterator) it).nextInt();
            CollectionsKt.addAll(arrayList, CollectionsKt.listOf((Object[]) new String[]{"COM" + iNextInt, "LPT" + iNextInt}));
        }
        RESERVED = SetsKt.plus(of, arrayList);
        OFFLINE_NAME = new Regex("^[A-Za-z0-9_]{3,16}$");
    }

    public final Regex getOFFLINE_NAME() {
        return OFFLINE_NAME;
    }

    public final String offlineName(String n) {
        Intrinsics.checkNotNullParameter(n, "n");
        boolean z = true;
        if (n.length() == 0) {
            return "请填写离线角色名";
        }
        String str = n;
        int i = 0;
        while (true) {
            if (i < str.length()) {
                if (CharsKt.isWhitespace(str.charAt(i))) {
                    break;
                }
                i++;
            } else {
                z = false;
                break;
            }
        }
        if (z) {
            return "用户名不可用：不能含空格";
        }
        if (OFFLINE_NAME.matches(n)) {
            return null;
        }
        return "用户名不可用：3–16 位字母、数字或下划线";
    }

    public static /* synthetic */ String instanceName$default(InputRules inputRules, String str, Collection collection, String str2, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            str2 = null;
        }
        if ((i & 8) != 0) {
            z = false;
        }
        return inputRules.instanceName(str, collection, str2, z);
    }

    public final String instanceName(String raw, Collection<String> existing, String self, boolean version) {
        Intrinsics.checkNotNullParameter(raw, "raw");
        Intrinsics.checkNotNullParameter(existing, "existing");
        String n = StringsKt.trim((CharSequence) raw).toString();
        boolean z = true;
        if (n.length() == 0) {
            return "名称不能为空";
        }
        if (!Intrinsics.areEqual(n, ".") && !Intrinsics.areEqual(n, "..")) {
            if (!(StringsKt.trim(n, '.').length() == 0)) {
                if (ILLEGAL_INSTANCE.containsMatchIn(n)) {
                    return "名称不能包含 \\ / : * ? \" < > | 等字符";
                }
                if (n.length() > 48) {
                    return "名称最多 48 个字符";
                }
                Set<String> set = RESERVED;
                String upperCase = ((String) StringsKt.split$default((CharSequence) n, new char[]{'.'}, false, 2, 2, (Object) null).get(0)).toUpperCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                if (set.contains(upperCase)) {
                    return "这是系统保留名，换一个";
                }
                if (!Intrinsics.areEqual(n, self)) {
                    Collection<String> collection = existing;
                    if (!collection.isEmpty()) {
                        Iterator it = collection.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (StringsKt.equals((String) it.next(), n, true)) {
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
                        return version ? I18nKt.tr("已有同名版本「{0}」", n) : I18nKt.tr("已有同名实例「{0}」", n);
                    }
                }
                return null;
            }
        }
        return "名称不能只有点号";
    }

    public static /* synthetic */ String versionId$default(InputRules inputRules, String str, Collection collection, String str2, int i, Object obj) {
        if ((i & 4) != 0) {
            str2 = null;
        }
        return inputRules.versionId(str, collection, str2);
    }

    public final String versionId(String raw, Collection<String> existing, String self) {
        Intrinsics.checkNotNullParameter(raw, "raw");
        Intrinsics.checkNotNullParameter(existing, "existing");
        return instanceName(raw, existing, self, true);
    }

    public final String nide8Id(String raw) {
        String value;
        Intrinsics.checkNotNullParameter(raw, "raw");
        MatchResult matchResultFind$default = Regex.find$default(new Regex("(?<![0-9a-fA-F])[0-9a-fA-F]{32}(?![0-9a-fA-F])"), StringsKt.trim((CharSequence) raw).toString(), 0, 2, null);
        if (matchResultFind$default == null || (value = matchResultFind$default.getValue()) == null) {
            return null;
        }
        String lowerCase = value.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    public final String yggdrasilApi(String raw) {
        Intrinsics.checkNotNullParameter(raw, "raw");
        String s = StringsKt.trim((CharSequence) raw).toString();
        if (new Regex("^https?://[^/\\s]+.*$", RegexOption.IGNORE_CASE).matches(s)) {
            return null;
        }
        return "API 地址要以 http:// 或 https:// 开头";
    }

    public static /* synthetic */ String intInRange$default(InputRules inputRules, String str, IntRange intRange, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        return inputRules.intInRange(str, intRange, z);
    }

    public final String intInRange(String raw, IntRange range, boolean allowEmpty) {
        Intrinsics.checkNotNullParameter(raw, "raw");
        Intrinsics.checkNotNullParameter(range, "range");
        String s = StringsKt.trim((CharSequence) raw).toString();
        if (s.length() == 0) {
            if (allowEmpty) {
                return null;
            }
            return "不能为空";
        }
        Integer intOrNull = StringsKt.toIntOrNull(s);
        if (intOrNull == null) {
            return "请填数字";
        }
        int v = intOrNull.intValue();
        if (v <= range.getLast() && range.getFirst() <= v) {
            return null;
        }
        return I18nKt.tr("范围 {0}–{1}", Integer.valueOf(range.getFirst()), Integer.valueOf(range.getLast()));
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0098  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean fileCompatible(com.pymcl.android.ui.state.CatalogKind r11, java.util.List<java.lang.String> r12, java.util.List<java.lang.String> r13, java.lang.String r14, java.lang.String r15) {
        /*
            r10 = this;
            java.lang.String r0 = "kind"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            java.lang.String r0 = "gameVersions"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            java.lang.String r0 = "loaders"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            java.lang.String r0 = "mc"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            java.lang.String r0 = "loader"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r0)
            com.pymcl.android.ui.state.CatalogKind r0 = com.pymcl.android.ui.state.CatalogKind.Modpack
            r1 = 1
            if (r11 == r0) goto La0
            com.pymcl.android.ui.state.CatalogKind r0 = com.pymcl.android.ui.state.CatalogKind.World
            if (r11 != r0) goto L24
            goto La0
        L24:
            r0 = r14
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            int r0 = r0.length()
            r2 = 0
            if (r0 != 0) goto L30
            r0 = r1
            goto L31
        L30:
            r0 = r2
        L31:
            if (r0 != 0) goto L42
            boolean r0 = r12.isEmpty()
            if (r0 != 0) goto L42
            boolean r0 = r12.contains(r14)
            if (r0 == 0) goto L40
            goto L42
        L40:
            r0 = r2
            goto L43
        L42:
            r0 = r1
        L43:
            com.pymcl.android.ui.state.CatalogKind r3 = com.pymcl.android.ui.state.CatalogKind.Mod
            if (r11 == r3) goto L4e
            com.pymcl.android.ui.state.CatalogKind r3 = com.pymcl.android.ui.state.CatalogKind.Mods
            if (r11 != r3) goto L4c
            goto L4e
        L4c:
            r3 = r2
            goto L4f
        L4e:
            r3 = r1
        L4f:
            if (r3 == 0) goto L98
            boolean r4 = r13.isEmpty()
            if (r4 != 0) goto L98
            r4 = r15
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            int r4 = r4.length()
            if (r4 <= 0) goto L62
            r4 = r1
            goto L63
        L62:
            r4 = r2
        L63:
            if (r4 == 0) goto L96
            r4 = r13
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            r5 = 0
            boolean r6 = r4 instanceof java.util.Collection
            if (r6 == 0) goto L78
            r6 = r4
            java.util.Collection r6 = (java.util.Collection) r6
            boolean r6 = r6.isEmpty()
            if (r6 == 0) goto L78
            r4 = r2
            goto L93
        L78:
            java.util.Iterator r6 = r4.iterator()
        L7c:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L92
            java.lang.Object r7 = r6.next()
            r8 = r7
            java.lang.String r8 = (java.lang.String) r8
            r9 = 0
            boolean r8 = kotlin.text.StringsKt.equals(r8, r15, r1)
            if (r8 == 0) goto L7c
            r4 = r1
            goto L93
        L92:
            r4 = r2
        L93:
            if (r4 == 0) goto L96
            goto L98
        L96:
            r4 = r2
            goto L99
        L98:
            r4 = r1
        L99:
            if (r0 == 0) goto L9e
            if (r4 == 0) goto L9e
            goto L9f
        L9e:
            r1 = r2
        L9f:
            return r1
        La0:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.android.ui.state.InputRules.fileCompatible(com.pymcl.android.ui.state.CatalogKind, java.util.List, java.util.List, java.lang.String, java.lang.String):boolean");
    }

    public final boolean needsVersion(CatalogKind kind) {
        Intrinsics.checkNotNullParameter(kind, "kind");
        return (kind == CatalogKind.Modpack || kind == CatalogKind.World) ? false : true;
    }

    public final boolean loaderSupports(String loader, String mc) throws NumberFormatException {
        Intrinsics.checkNotNullParameter(mc, "mc");
        if (loader != null) {
            String l = loader.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(l, "toLowerCase(...)");
            if (l != null) {
                MatchResult m = Regex.find$default(new Regex("^1\\.(\\d+)(?:\\.(\\d+))?$"), mc, 0, 2, null);
                if (m == null) {
                    return (Intrinsics.areEqual(l, "fabric") || Intrinsics.areEqual(l, "quilt")) && new Regex("^\\d{2}w\\d{2}[a-z]$").matches(mc);
                }
                int minor = Integer.parseInt(m.getGroupValues().get(1));
                Integer intOrNull = StringsKt.toIntOrNull(m.getGroupValues().get(2));
                int patch = intOrNull != null ? intOrNull.intValue() : 0;
                switch (l.hashCode()) {
                    case -1904204223:
                        if (l.equals("liteloader")) {
                            return 5 <= minor && minor < 13;
                        }
                        return true;
                    case -1282179931:
                        if (!l.equals("fabric")) {
                            return true;
                        }
                        break;
                    case -79289648:
                        return !l.equals("optifine") || minor >= 7;
                    case 97618791:
                        return !l.equals("forge") || minor >= 1;
                    case 107947789:
                        if (!l.equals("quilt")) {
                            return true;
                        }
                        break;
                    case 1154621647:
                        if (l.equals("neoforge") && minor <= 20) {
                            return minor == 20 && patch >= 1;
                        }
                        return true;
                    default:
                        return true;
                }
                return minor >= 14;
            }
        }
        return true;
    }
}
