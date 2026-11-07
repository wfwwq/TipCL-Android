package com.pymcl.runtime.keyboard;

import com.pymcl.runtime.input.InputSink;
import com.pymcl.runtime.input.Keys;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PcKeyboardView.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0014B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\bJ\u0016\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0012J\u0006\u0010\u0013\u001a\u00020\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R-\u0010\u0006\u001a\u001e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007j\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t`\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0015"}, d2 = {"Lcom/pymcl/runtime/keyboard/StickyModifiers;", "", "sink", "Lcom/pymcl/runtime/input/InputSink;", "<init>", "(Lcom/pymcl/runtime/input/InputSink;)V", "states", "Ljava/util/HashMap;", "", "Lcom/pymcl/runtime/keyboard/StickyModifiers$State;", "Lkotlin/collections/HashMap;", "getStates", "()Ljava/util/HashMap;", "tapModifier", "", "key", "normal", "press", "", "releaseAll", "State", "PyMCL-Android:runtime_debug"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class StickyModifiers {
    private final InputSink sink;
    private final HashMap<String, State> states;

    /* compiled from: PcKeyboardView.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/pymcl/runtime/keyboard/StickyModifiers$State;", "", "<init>", "(Ljava/lang/String;I)V", "OFF", "ONCE", "LOCKED", "PyMCL-Android:runtime_debug"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public enum State {
        OFF,
        ONCE,
        LOCKED;

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries($VALUES);

        public static EnumEntries<State> getEntries() {
            return $ENTRIES;
        }
    }

    /* compiled from: PcKeyboardView.kt */
    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[State.values().length];
            try {
                iArr[State.OFF.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                iArr[State.ONCE.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                iArr[State.LOCKED.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public StickyModifiers(InputSink sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        this.sink = sink;
        this.states = new HashMap<>();
    }

    public final HashMap<String, State> getStates() {
        return this.states;
    }

    public final void tapModifier(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        Integer numCode = Keys.INSTANCE.code(key);
        if (numCode == null) {
            return;
        }
        int code = numCode.intValue();
        State state = this.states.get(key);
        if (state == null) {
            state = State.OFF;
        }
        switch (WhenMappings.$EnumSwitchMapping$0[state.ordinal()]) {
            case 1:
                this.states.put(key, State.ONCE);
                this.sink.key(code, true);
                return;
            case 2:
                this.states.put(key, State.LOCKED);
                return;
            case 3:
                this.states.put(key, State.OFF);
                this.sink.key(code, false);
                return;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final void normal(String key, boolean press) {
        Intrinsics.checkNotNullParameter(key, "key");
        Keys.INSTANCE.dispatch(this.sink, key, press);
        if (press) {
            return;
        }
        Map $this$filterValues$iv = this.states;
        LinkedHashMap result$iv = new LinkedHashMap();
        Iterator<Map.Entry<String, State>> it = $this$filterValues$iv.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry$iv = it.next();
            State it2 = entry$iv.getValue();
            if (it2 == State.ONCE) {
                result$iv.put(entry$iv.getKey(), entry$iv.getValue());
            }
        }
        LinkedHashMap $this$filterValues$iv2 = result$iv;
        Iterable $this$forEach$iv = $this$filterValues$iv2.keySet();
        for (Object element$iv : $this$forEach$iv) {
            String k = (String) element$iv;
            this.states.put(k, State.OFF);
            Integer numCode = Keys.INSTANCE.code(k);
            if (numCode != null) {
                int it3 = numCode.intValue();
                this.sink.key(it3, false);
            }
        }
    }

    public final void releaseAll() {
        Map $this$filterValues$iv = this.states;
        LinkedHashMap result$iv = new LinkedHashMap();
        Iterator<Map.Entry<String, State>> it = $this$filterValues$iv.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry$iv = it.next();
            State it2 = entry$iv.getValue();
            if (it2 != State.OFF) {
                result$iv.put(entry$iv.getKey(), entry$iv.getValue());
            }
        }
        LinkedHashMap $this$filterValues$iv2 = result$iv;
        Iterable $this$forEach$iv = $this$filterValues$iv2.keySet();
        for (Object element$iv : $this$forEach$iv) {
            String k = (String) element$iv;
            Integer numCode = Keys.INSTANCE.code(k);
            if (numCode != null) {
                int it3 = numCode.intValue();
                this.sink.key(it3, false);
            }
        }
        this.states.clear();
    }
}
