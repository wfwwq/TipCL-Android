package com.pymcl.runtime.keyboard;

import com.pymcl.runtime.JavaDownloads;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* compiled from: PcKeyboardView.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0012B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0012\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\b\"\u00020\tH\u0002¢\u0006\u0002\u0010\nR\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\f¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001d\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/pymcl/runtime/keyboard/PcKeyboardLayout;", "", "<init>", "()V", "row", "", "Lcom/pymcl/runtime/keyboard/PcKeyboardLayout$K;", "s", "", "", "([Ljava/lang/String;)Ljava/util/List;", "MODIFIERS", "", "getMODIFIERS", "()Ljava/util/Set;", "rows", "getRows", "()Ljava/util/List;", "K", "PyMCL-Android:runtime_debug"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class PcKeyboardLayout {
    public static final PcKeyboardLayout INSTANCE = new PcKeyboardLayout();
    private static final Set<String> MODIFIERS = SetsKt.setOf((Object[]) new String[]{"KEY_LEFTSHIFT", "KEY_RIGHTSHIFT", "KEY_LEFTCTRL", "KEY_RIGHTCTRL", "KEY_LEFTALT", "KEY_RIGHTALT"});
    private static final List<List<K>> rows;

    /* compiled from: PcKeyboardView.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0014\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0015\u001a\u00020\u0016HÖ\u0081\u0004J\n\u0010\u0017\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lcom/pymcl/runtime/keyboard/PcKeyboardLayout$K;", "", "label", "", "key", "weight", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;F)V", "getLabel", "()Ljava/lang/String;", "getKey", "getWeight", "()F", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "PyMCL-Android:runtime_debug"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class K {
        private final String key;
        private final String label;
        private final float weight;

        public static /* synthetic */ K copy$default(K k, String str, String str2, float f, int i, Object obj) {
            if ((i & 1) != 0) {
                str = k.label;
            }
            if ((i & 2) != 0) {
                str2 = k.key;
            }
            if ((i & 4) != 0) {
                f = k.weight;
            }
            return k.copy(str, str2, f);
        }

        /* renamed from: component1, reason: from getter */
        public final String getLabel() {
            return this.label;
        }

        /* renamed from: component2, reason: from getter */
        public final String getKey() {
            return this.key;
        }

        /* renamed from: component3, reason: from getter */
        public final float getWeight() {
            return this.weight;
        }

        public final K copy(String label, String key, float weight) {
            Intrinsics.checkNotNullParameter(label, "label");
            Intrinsics.checkNotNullParameter(key, "key");
            return new K(label, key, weight);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof K)) {
                return false;
            }
            K k = (K) other;
            return Intrinsics.areEqual(this.label, k.label) && Intrinsics.areEqual(this.key, k.key) && Float.compare(this.weight, k.weight) == 0;
        }

        public int hashCode() {
            return (((this.label.hashCode() * 31) + this.key.hashCode()) * 31) + Float.hashCode(this.weight);
        }

        public String toString() {
            return "K(label=" + this.label + ", key=" + this.key + ", weight=" + this.weight + ")";
        }

        public K(String label, String key, float weight) {
            Intrinsics.checkNotNullParameter(label, "label");
            Intrinsics.checkNotNullParameter(key, "key");
            this.label = label;
            this.key = key;
            this.weight = weight;
        }

        public /* synthetic */ K(String str, String str2, float f, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i & 4) != 0 ? 1.0f : f);
        }

        public final String getKey() {
            return this.key;
        }

        public final String getLabel() {
            return this.label;
        }

        public final float getWeight() {
            return this.weight;
        }
    }

    private PcKeyboardLayout() {
    }

    private final List<K> row(String... s) {
        Collection destination$iv$iv = new ArrayList(s.length);
        for (String str : s) {
            destination$iv$iv.add(new K(str, "KEY_" + str, 0.0f, 4, null));
        }
        return (List) destination$iv$iv;
    }

    static {
        int i = 3;
        int i2 = 5;
        List[] listArr = new List[6];
        List listListOf = CollectionsKt.listOf(new K("Esc", "KEY_ESC", 0.0f, 4, null));
        Iterable $this$map$iv = new IntRange(1, 12);
        Collection destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10));
        Iterator<Integer> it = $this$map$iv.iterator();
        while (true) {
            int i3 = i2;
            if (!it.hasNext()) {
                int i4 = i;
                DefaultConstructorMarker defaultConstructorMarker = null;
                listArr[0] = CollectionsKt.plus((Collection) CollectionsKt.plus((Collection) listListOf, destination$iv$iv), (Iterable) CollectionsKt.listOf((Object[]) new K[]{new K("Del", "KEY_DELETE", 0.0f, 4, null), new K("✕", "@close", 0.0f, 4, defaultConstructorMarker)}));
                int i5 = 4;
                DefaultConstructorMarker defaultConstructorMarker2 = null;
                float f = 0.0f;
                List listListOf2 = CollectionsKt.listOf(new K("`", "KEY_GRAVE", f, i5, defaultConstructorMarker2));
                PcKeyboardLayout pcKeyboardLayout = INSTANCE;
                String[] strArr = new String[10];
                strArr[0] = "1";
                strArr[1] = "2";
                strArr[2] = JavaDownloads.JRE25_VERSION;
                strArr[i4] = "4";
                strArr[4] = "5";
                strArr[i3] = "6";
                strArr[6] = "7";
                strArr[7] = "8";
                strArr[8] = "9";
                strArr[9] = "0";
                List listPlus = CollectionsKt.plus((Collection) listListOf2, (Iterable) pcKeyboardLayout.row(strArr));
                K[] kArr = new K[i4];
                kArr[0] = new K("-", "KEY_MINUS", f, i5, defaultConstructorMarker2);
                kArr[1] = new K("=", "KEY_EQUAL", 0.0f, 4, defaultConstructorMarker);
                kArr[2] = new K("⌫", "KEY_BACKSPACE", 1.6f);
                listArr[1] = CollectionsKt.plus((Collection) listPlus, (Iterable) CollectionsKt.listOf((Object[]) kArr));
                List listListOf3 = CollectionsKt.listOf(new K("Tab", "KEY_TAB", 1.4f));
                PcKeyboardLayout pcKeyboardLayout2 = INSTANCE;
                String[] strArr2 = new String[10];
                strArr2[0] = "Q";
                strArr2[1] = "W";
                strArr2[2] = "E";
                strArr2[3] = "R";
                strArr2[4] = "T";
                strArr2[i3] = "Y";
                strArr2[6] = "U";
                strArr2[7] = "I";
                strArr2[8] = "O";
                strArr2[9] = "P";
                DefaultConstructorMarker defaultConstructorMarker3 = null;
                listArr[2] = CollectionsKt.plus((Collection) CollectionsKt.plus((Collection) listListOf3, (Iterable) pcKeyboardLayout2.row(strArr2)), (Iterable) CollectionsKt.listOf((Object[]) new K[]{new K("[", "KEY_LEFTBRACE", 0.0f, 4, null), new K("]", "KEY_RIGHTBRACE", 0.0f, 4, defaultConstructorMarker3), new K("\\", "KEY_BACKSLASH", 1.2f)}));
                List listListOf4 = CollectionsKt.listOf(new K("Caps", "KEY_CAPSLOCK", 1.7f));
                PcKeyboardLayout pcKeyboardLayout3 = INSTANCE;
                String[] strArr3 = new String[9];
                strArr3[0] = "A";
                strArr3[1] = "S";
                strArr3[2] = "D";
                strArr3[3] = "F";
                strArr3[4] = "G";
                strArr3[i3] = "H";
                strArr3[6] = "J";
                strArr3[7] = "K";
                strArr3[8] = "L";
                listArr[3] = CollectionsKt.plus((Collection) CollectionsKt.plus((Collection) listListOf4, (Iterable) pcKeyboardLayout3.row(strArr3)), (Iterable) CollectionsKt.listOf((Object[]) new K[]{new K(";", "KEY_SEMICOLON", 0.0f, 4, null), new K("'", "KEY_APOSTROPHE", 0.0f, 4, defaultConstructorMarker3), new K("Enter", "KEY_ENTER", 1.9f)}));
                List listListOf5 = CollectionsKt.listOf(new K("Shift", "KEY_LEFTSHIFT", 2.2f));
                PcKeyboardLayout pcKeyboardLayout4 = INSTANCE;
                String[] strArr4 = new String[7];
                strArr4[0] = "Z";
                strArr4[1] = "X";
                strArr4[2] = "C";
                strArr4[3] = "V";
                strArr4[4] = "B";
                strArr4[i3] = "N";
                strArr4[6] = "M";
                List listPlus2 = CollectionsKt.plus((Collection) listListOf5, (Iterable) pcKeyboardLayout4.row(strArr4));
                K[] kArr2 = new K[i3];
                kArr2[0] = new K(",", "KEY_COMMA", 0.0f, 4, null);
                kArr2[1] = new K(".", "KEY_DOT", 0.0f, 4, defaultConstructorMarker3);
                kArr2[2] = new K("/", "KEY_SLASH", 0.0f, 4, defaultConstructorMarker);
                kArr2[3] = new K("↑", "KEY_UP", 0.0f, 4, null);
                kArr2[4] = new K("Shift", "KEY_RIGHTSHIFT", 1.4f);
                listArr[4] = CollectionsKt.plus((Collection) listPlus2, (Iterable) CollectionsKt.listOf((Object[]) kArr2));
                listArr[5] = CollectionsKt.listOf((Object[]) new K[]{new K("Ctrl", "KEY_LEFTCTRL", 1.4f), new K("Alt", "KEY_LEFTALT", 1.2f), new K("Space", "KEY_SPACE", 6.0f), new K("Alt", "KEY_RIGHTALT", 1.2f), new K("Ctrl", "KEY_RIGHTCTRL", 1.2f), new K("←", "KEY_LEFT", 0.0f, 4, null), new K("↓", "KEY_DOWN", 0.0f, 4, null), new K("→", "KEY_RIGHT", 0.0f, 4, null)});
                rows = CollectionsKt.listOf((Object[]) listArr);
                return;
            }
            int item$iv$iv = ((IntIterator) it).nextInt();
            destination$iv$iv.add(new K("F" + item$iv$iv, "KEY_F" + item$iv$iv, 0.0f, 4, null));
            i2 = i3;
            i = i;
        }
    }

    public final Set<String> getMODIFIERS() {
        return MODIFIERS;
    }

    public final List<List<K>> getRows() {
        return rows;
    }
}
