package com.pymcl.core.launch;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;

/* compiled from: LaunchArgs.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\u0006¨\u0006\b"}, d2 = {"Lcom/pymcl/core/launch/ArgSplit;", "", "<init>", "()V", "split", "", "", "s", "PyMCL-Android:core"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ArgSplit {
    public static final ArgSplit INSTANCE = new ArgSplit();

    private ArgSplit() {
    }

    public final List<String> split(String s) {
        Intrinsics.checkNotNullParameter(s, "s");
        ArrayList out = new ArrayList();
        StringBuilder cur = new StringBuilder();
        Character q = null;
        boolean has = false;
        int length = s.length();
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            char c = s.charAt(i);
            if (q != null) {
                if (c == q.charValue()) {
                    q = null;
                } else {
                    cur.append(c);
                }
            } else if (c == '\"' || c == '\'') {
                q = Character.valueOf(c);
                has = true;
            } else if (CharsKt.isWhitespace(c)) {
                if ((cur.length() > 0) || has) {
                    out.add(cur.toString());
                    StringsKt.clear(cur);
                    has = false;
                }
            } else {
                cur.append(c);
            }
            i++;
        }
        if ((cur.length() > 0) || has) {
            out.add(cur.toString());
        }
        return out;
    }
}
