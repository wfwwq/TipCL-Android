package com.pymcl.runtime.input;

import com.pymcl.multiplayer.TerracottaVpnService;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InputSink.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH&J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH\u0016J\u0018\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0012H&J\u0018\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0015H&J\u0018\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u0015H&J\u0010\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0005H\u0016¨\u0006\u001bÀ\u0006\u0003"}, d2 = {"Lcom/pymcl/runtime/input/InputSink;", "", "key", "", "fclKeycode", "", "press", "", "char", "c", "", TerracottaVpnService.EXTRA_TEXT, "s", "", "mouseButton", "button", "scroll", "dy", "", "cursorPos", "x", "", "y", "lookDelta", "dx", "tapKey", "click", "PyMCL-Android:runtime_debug"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface InputSink {
    /* renamed from: char */
    void mo8062char(char c);

    void cursorPos(float x, float y);

    void key(int fclKeycode, boolean press);

    void lookDelta(float dx, float dy);

    void mouseButton(int button, boolean press);

    void scroll(double dy);

    /* compiled from: InputSink.kt */
    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        public static void text(InputSink $this, String s) {
            Intrinsics.checkNotNullParameter(s, "s");
            InputSink.super.text(s);
        }

        @Deprecated
        public static void tapKey(InputSink $this, int fclKeycode) {
            InputSink.super.tapKey(fclKeycode);
        }

        @Deprecated
        public static void click(InputSink $this, int button) {
            InputSink.super.click(button);
        }
    }

    default void text(String s) {
        Intrinsics.checkNotNullParameter(s, "s");
        String $this$forEach$iv = s;
        for (int i = 0; i < $this$forEach$iv.length(); i++) {
            char element$iv = $this$forEach$iv.charAt(i);
            mo8062char(element$iv);
        }
    }

    default void tapKey(int fclKeycode) {
        key(fclKeycode, true);
        key(fclKeycode, false);
    }

    default void click(int button) {
        mouseButton(button, true);
        mouseButton(button, false);
    }
}
