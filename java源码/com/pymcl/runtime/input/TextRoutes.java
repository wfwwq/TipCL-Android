package com.pymcl.runtime.input;

import kotlin.Metadata;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* compiled from: SdlTextInput.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¨\u0006\b"}, d2 = {"Lcom/pymcl/runtime/input/TextRoutes;", "", "<init>", "()V", "forMcVersion", "Lcom/pymcl/runtime/input/TextRoute;", "mc", "", "PyMCL-Android:runtime_debug"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TextRoutes {
    public static final TextRoutes INSTANCE = new TextRoutes();

    private TextRoutes() {
    }

    public final TextRoute forMcVersion(String mc) throws NumberFormatException {
        String v = mc != null ? StringsKt.trim((CharSequence) mc).toString() : null;
        if (v == null) {
            v = "";
        }
        MatchResult it = Regex.find$default(new Regex("^(\\d{2})w\\d{2}[a-z]$"), v, 0, 2, null);
        if (it != null) {
            return Integer.parseInt(it.getGroupValues().get(1)) >= 27 ? TextRoute.SDL : TextRoute.GLFW;
        }
        MatchResult m = Regex.find$default(new Regex("^(\\d+)\\.(\\d+)"), v, 0, 2, null);
        if (m == null) {
            return TextRoute.GLFW;
        }
        int major = Integer.parseInt(m.getGroupValues().get(1));
        int minor = Integer.parseInt(m.getGroupValues().get(2));
        return major == 1 ? TextRoute.GLFW : (major > 26 || (major == 26 && minor >= 3)) ? TextRoute.SDL : TextRoute.GLFW;
    }
}
