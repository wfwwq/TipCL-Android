package com.pymcl.runtime.input;

import androidx.autofill.HintConstants;
import com.tungsten.fclauncher.keycodes.FCLKeycodes;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;

/* compiled from: Keys.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001 B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0014\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0015\u001a\u00020\u0005¢\u0006\u0002\u0010\u0016J\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0014\u001a\u00020\fJ\u000e\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u0005J \u0010\u001b\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020\u0018R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R'\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f0\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR'\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00050\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0012\u0010\u000eR\u0014\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\u001aX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/pymcl/runtime/input/Keys;", "", "<init>", "()V", Keys.MOUSE_LEFT, "", Keys.MOUSE_RIGHT, Keys.MOUSE_MIDDLE, Keys.SCROLL_UP, Keys.SCROLL_DOWN, "table", "", "", "getTable", "()Ljava/util/Map;", "table$delegate", "Lkotlin/Lazy;", "reverse", "getReverse", "reverse$delegate", "code", HintConstants.AUTOFILL_HINT_NAME, "(Ljava/lang/String;)Ljava/lang/Integer;", "isValid", "", "MOUSE_NAMES", "", "dispatch", "Lcom/pymcl/runtime/input/Keys$Action;", "sink", "Lcom/pymcl/runtime/input/InputSink;", "press", "Action", "PyMCL-Android:runtime_debug"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Keys {
    public static final Keys INSTANCE = new Keys();

    /* renamed from: table$delegate, reason: from kotlin metadata */
    private static final Lazy table = LazyKt.lazy(new Function0() { // from class: com.pymcl.runtime.input.Keys$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Keys.table_delegate$lambda$0();
        }
    });

    /* renamed from: reverse$delegate, reason: from kotlin metadata */
    private static final Lazy reverse = LazyKt.lazy(new Function0() { // from class: com.pymcl.runtime.input.Keys$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Keys.reverse_delegate$lambda$0();
        }
    });
    public static final String MOUSE_LEFT = "MOUSE_LEFT";
    public static final String MOUSE_RIGHT = "MOUSE_RIGHT";
    public static final String MOUSE_MIDDLE = "MOUSE_MIDDLE";
    public static final String SCROLL_UP = "SCROLL_UP";
    public static final String SCROLL_DOWN = "SCROLL_DOWN";
    private static final Set<String> MOUSE_NAMES = SetsKt.setOf((Object[]) new String[]{MOUSE_LEFT, MOUSE_RIGHT, MOUSE_MIDDLE, SCROLL_UP, SCROLL_DOWN});

    private Keys() {
    }

    /* compiled from: Keys.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000fB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u0010"}, d2 = {"Lcom/pymcl/runtime/input/Keys$Action;", "", "id", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getId", "()Ljava/lang/String;", "TOGGLE_IME", "PC_KEYBOARD", "QUICK_INPUT", "TOGGLE_CURSOR", "EDIT_LAYOUT", "MENU", "GAME_MENU", "Companion", "PyMCL-Android:runtime_debug"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public enum Action {
        TOGGLE_IME("@ime"),
        PC_KEYBOARD("@pc_keyboard"),
        QUICK_INPUT("@quick_input"),
        TOGGLE_CURSOR("@virtual_mouse"),
        EDIT_LAYOUT("@edit_layout"),
        MENU("@menu"),
        GAME_MENU("@game_menu");

        private final String id;
        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries($VALUES);

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        public static EnumEntries<Action> getEntries() {
            return $ENTRIES;
        }

        Action(String id) {
            this.id = id;
        }

        public final String getId() {
            return this.id;
        }

        /* compiled from: Keys.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/pymcl/runtime/input/Keys$Action$Companion;", "", "<init>", "()V", "of", "Lcom/pymcl/runtime/input/Keys$Action;", "id", "", "PyMCL-Android:runtime_debug"}, k = 1, mv = {2, 4, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final Action of(String id) {
                Object element$iv;
                Intrinsics.checkNotNullParameter(id, "id");
                Iterable $this$firstOrNull$iv = Action.getEntries();
                Iterator<Action> it = $this$firstOrNull$iv.iterator();
                while (true) {
                    if (it.hasNext()) {
                        element$iv = it.next();
                        Action it2 = (Action) element$iv;
                        if (Intrinsics.areEqual(it2.getId(), id)) {
                            break;
                        }
                    } else {
                        element$iv = null;
                        break;
                    }
                }
                return (Action) element$iv;
            }
        }
    }

    private final Map<String, Integer> getTable() {
        return (Map) table.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map table_delegate$lambda$0() throws SecurityException {
        Field[] fields = FCLKeycodes.class.getFields();
        Intrinsics.checkNotNullExpressionValue(fields, "getFields(...)");
        Collection destination$iv$iv = new ArrayList();
        for (Field field : fields) {
            Field it = field;
            String name = it.getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
            if (StringsKt.startsWith$default(name, "KEY_", false, 2, (Object) null) && Intrinsics.areEqual(it.getType(), Integer.TYPE)) {
                destination$iv$iv.add(field);
            }
        }
        Iterable $this$associate$iv = (List) destination$iv$iv;
        int capacity$iv = RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault($this$associate$iv, 10)), 16);
        Map destination$iv$iv2 = new LinkedHashMap(capacity$iv);
        for (Object element$iv$iv : $this$associate$iv) {
            Field it2 = (Field) element$iv$iv;
            Pair pair = TuplesKt.to(it2.getName(), Integer.valueOf(it2.getInt(null)));
            destination$iv$iv2.put(pair.getFirst(), pair.getSecond());
        }
        return destination$iv$iv2;
    }

    private final Map<Integer, String> getReverse() {
        return (Map) reverse.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map reverse_delegate$lambda$0() {
        Iterable $this$associate$iv = INSTANCE.getTable().entrySet();
        int capacity$iv = RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault($this$associate$iv, 10)), 16);
        Map destination$iv$iv = new LinkedHashMap(capacity$iv);
        for (Object element$iv$iv : $this$associate$iv) {
            Map.Entry it = (Map.Entry) element$iv$iv;
            Pair pair = TuplesKt.to(it.getValue(), it.getKey());
            destination$iv$iv.put(pair.getFirst(), pair.getSecond());
        }
        return destination$iv$iv;
    }

    public final Integer code(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        Map<String, Integer> table2 = getTable();
        String upperCase = StringsKt.trim((CharSequence) name).toString().toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        return table2.get(upperCase);
    }

    public final String name(int code) {
        return getReverse().get(Integer.valueOf(code));
    }

    public final boolean isValid(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return (code(name) == null && !MOUSE_NAMES.contains(name) && Action.INSTANCE.of(name) == null) ? false : true;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final Action dispatch(InputSink sink, String name, boolean press) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        Intrinsics.checkNotNullParameter(name, "name");
        switch (name.hashCode()) {
            case -1707125105:
                if (name.equals(MOUSE_MIDDLE)) {
                    sink.mouseButton(2, press);
                    return null;
                }
                break;
            case -1090550451:
                if (name.equals(SCROLL_UP)) {
                    if (!press) {
                        return null;
                    }
                    sink.scroll(1.0d);
                    return null;
                }
                break;
            case -50447934:
                if (name.equals(MOUSE_RIGHT)) {
                    sink.mouseButton(1, press);
                    return null;
                }
                break;
            case -47467820:
                if (name.equals(SCROLL_DOWN)) {
                    if (!press) {
                        return null;
                    }
                    sink.scroll(-1.0d);
                    return null;
                }
                break;
            case 1522210689:
                if (name.equals(MOUSE_LEFT)) {
                    sink.mouseButton(0, press);
                    return null;
                }
                break;
        }
        Action it = Action.INSTANCE.of(name);
        if (it != null) {
            return it;
        }
        Integer numCode = code(name);
        if (numCode == null) {
            return null;
        }
        sink.key(numCode.intValue(), press);
        return null;
    }
}
