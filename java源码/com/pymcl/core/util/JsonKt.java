package com.pymcl.core.util;

import com.pymcl.runtime.settings.SettingsProtocol;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.text.StringsKt;

/* compiled from: Json.kt */
@Metadata(d1 = {"\u0000P\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\"\u0010\u0006\u001a\u0018\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0001j\u0004\u0018\u0001`\u0007*\u0004\u0018\u00010\u0003\u001a\u001c\u0010\b\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0005j\u0004\u0018\u0001`\t*\u0004\u0018\u00010\u0003\u001a*\u0010\n\u001a\u0004\u0018\u00010\u0002*\u0018\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0001j\u0004\u0018\u0001`\u00072\u0006\u0010\u000b\u001a\u00020\u0002\u001a/\u0010\f\u001a\u0004\u0018\u00010\r*\u0018\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0001j\u0004\u0018\u0001`\u00072\u0006\u0010\u000b\u001a\u00020\u0002¢\u0006\u0002\u0010\u000e\u001a/\u0010\u000f\u001a\u0004\u0018\u00010\u0010*\u0018\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0001j\u0004\u0018\u0001`\u00072\u0006\u0010\u000b\u001a\u00020\u0002¢\u0006\u0002\u0010\u0011\u001a/\u0010\u0012\u001a\u0004\u0018\u00010\u0013*\u0018\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0001j\u0004\u0018\u0001`\u00072\u0006\u0010\u000b\u001a\u00020\u0002¢\u0006\u0002\u0010\u0014\u001a>\u0010\u0015\u001a\u0018\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0001j\u0004\u0018\u0001`\u0007*\u0018\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0001j\u0004\u0018\u0001`\u00072\u0006\u0010\u000b\u001a\u00020\u0002\u001a8\u0010\u0016\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0005j\u0004\u0018\u0001`\t*\u0018\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0001j\u0004\u0018\u0001`\u00072\u0006\u0010\u000b\u001a\u00020\u0002\u001a2\u0010\u0017\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001j\u0002`\u00070\u0018*\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0005j\u0004\u0018\u0001`\t\u001aM\u0010\u0019\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001j\u0002`\u00072.\u0010\u001a\u001a\u0018\u0012\u0014\b\u0001\u0012\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u001c0\u001b\"\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u001c¢\u0006\u0002\u0010\u001d\u001a\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u00032\b\u0010\u001f\u001a\u0004\u0018\u00010\u0003*&\u0010\u0000\"\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00012\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001*\u001a\u0010\u0004\"\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00052\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0005¨\u0006 "}, d2 = {"JObj", "", "", "", "JArr", "", "o", "Lcom/pymcl/core/util/JObj;", "a", "Lcom/pymcl/core/util/JArr;", "str", "k", "int", "", "(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/Integer;", "long", "", "(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/Long;", "bool", "", "(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/Boolean;", "obj", "arr", "objs", "", "jobj", "p", "", "Lkotlin/Pair;", "([Lkotlin/Pair;)Ljava/util/Map;", "deepCopy", SettingsProtocol.EXTRA_VALUE, "PyMCL-Android:core"}, k = 2, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class JsonKt {
    public static final Map<String, Object> o(Object $this$o) {
        if (TypeIntrinsics.isMutableMap($this$o)) {
            return (Map) $this$o;
        }
        return null;
    }

    public static final List<Object> a(Object $this$a) {
        if (TypeIntrinsics.isMutableList($this$a)) {
            return (List) $this$a;
        }
        return null;
    }

    public static final String str(Map<String, Object> map, String k) {
        Object it;
        Intrinsics.checkNotNullParameter(k, "k");
        if (map == null || (it = map.get(k)) == null) {
            return null;
        }
        if (it instanceof String) {
            return (String) it;
        }
        if ((it instanceof Number) || (it instanceof Boolean)) {
            return it.toString();
        }
        return null;
    }

    /* renamed from: int, reason: not valid java name */
    public static final Integer m8042int(Map<String, Object> map, String k) {
        Intrinsics.checkNotNullParameter(k, "k");
        Object obj = map != null ? map.get(k) : null;
        Number number = obj instanceof Number ? (Number) obj : null;
        if (number != null) {
            return Integer.valueOf(number.intValue());
        }
        Object obj2 = map != null ? map.get(k) : null;
        String str = obj2 instanceof String ? (String) obj2 : null;
        if (str != null) {
            return StringsKt.toIntOrNull(str);
        }
        return null;
    }

    /* renamed from: long, reason: not valid java name */
    public static final Long m8043long(Map<String, Object> map, String k) {
        Intrinsics.checkNotNullParameter(k, "k");
        Object obj = map != null ? map.get(k) : null;
        Number number = obj instanceof Number ? (Number) obj : null;
        if (number != null) {
            return Long.valueOf(number.longValue());
        }
        Object obj2 = map != null ? map.get(k) : null;
        String str = obj2 instanceof String ? (String) obj2 : null;
        if (str != null) {
            return StringsKt.toLongOrNull(str);
        }
        return null;
    }

    public static final Boolean bool(Map<String, Object> map, String k) {
        Intrinsics.checkNotNullParameter(k, "k");
        Object obj = map != null ? map.get(k) : null;
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        return null;
    }

    public static final Map<String, Object> obj(Map<String, Object> map, String k) {
        Intrinsics.checkNotNullParameter(k, "k");
        return o(map != null ? map.get(k) : null);
    }

    public static final List<Object> arr(Map<String, Object> map, String k) {
        Intrinsics.checkNotNullParameter(k, "k");
        return a(map != null ? map.get(k) : null);
    }

    public static final List<Map<String, Object>> objs(List<Object> list) {
        if (list == null) {
            return CollectionsKt.emptyList();
        }
        List<Object> $this$mapNotNull$iv = list;
        Collection destination$iv$iv = new ArrayList();
        for (Object element$iv$iv$iv : $this$mapNotNull$iv) {
            Map<String, Object> mapO = o(element$iv$iv$iv);
            if (mapO != null) {
                destination$iv$iv.add(mapO);
            }
        }
        return (List) destination$iv$iv;
    }

    public static final Map<String, Object> jobj(Pair<String, ? extends Object>... p) {
        Intrinsics.checkNotNullParameter(p, "p");
        return MapsKt.linkedMapOf((Pair[]) Arrays.copyOf(p, p.length));
    }

    public static final Object deepCopy(Object v) {
        if (v instanceof Map) {
            LinkedHashMap m = new LinkedHashMap();
            Map $this$forEach$iv = (Map) v;
            for (Map.Entry element$iv : $this$forEach$iv.entrySet()) {
                Object k = element$iv.getKey();
                Object x = element$iv.getValue();
                m.put(String.valueOf(k), deepCopy(x));
            }
            return m;
        }
        if (!(v instanceof List)) {
            return v;
        }
        Iterable $this$mapTo$iv = (Iterable) v;
        Collection destination$iv = new ArrayList();
        for (Object item$iv : $this$mapTo$iv) {
            Object it = deepCopy(item$iv);
            destination$iv.add(it);
        }
        return destination$iv;
    }
}
