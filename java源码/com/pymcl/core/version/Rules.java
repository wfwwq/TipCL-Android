package com.pymcl.core.version;

import androidx.autofill.HintConstants;
import com.pymcl.core.util.JsonKt;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* compiled from: Versions.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u0004\u001a\u00020\u00052\u0016\u0010\u0006\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0007j\u0004\u0018\u0001`\b2\u0006\u0010\t\u001a\u00020\nJ*\u0010\u000b\u001a\u00020\u00052\u0018\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u00010\rj\u0002`\u000f2\u0006\u0010\t\u001a\u00020\nH\u0002¨\u0006\u0010"}, d2 = {"Lcom/pymcl/core/version/Rules;", "", "<init>", "()V", "allowed", "", "rules", "", "Lcom/pymcl/core/util/JArr;", "env", "Lcom/pymcl/core/version/RuleEnv;", "matches", "r", "", "", "Lcom/pymcl/core/util/JObj;", "PyMCL-Android:core"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class Rules {
    public static final Rules INSTANCE = new Rules();

    private Rules() {
    }

    public final boolean allowed(List<Object> rules, RuleEnv env) {
        Intrinsics.checkNotNullParameter(env, "env");
        List<Object> list = rules;
        if (list == null || list.isEmpty()) {
            return true;
        }
        boolean ok = false;
        for (Map r : JsonKt.objs(rules)) {
            if (matches(r, env)) {
                ok = Intrinsics.areEqual(JsonKt.str(r, "action"), "allow");
            }
        }
        return ok;
    }

    private final boolean matches(Map<String, Object> r, RuleEnv env) {
        Map os = JsonKt.obj(r, "os");
        if (os != null) {
            String it = JsonKt.str(os, HintConstants.AUTOFILL_HINT_NAME);
            if (it != null && !Intrinsics.areEqual(it, env.getOsName())) {
                return false;
            }
            String it2 = JsonKt.str(os, "arch");
            if (it2 != null) {
                if (Intrinsics.areEqual(it2, "x86") && env.is64()) {
                    return false;
                }
                if (!Intrinsics.areEqual(it2, "x86") && !StringsKt.contains$default((CharSequence) env.getArch(), (CharSequence) it2, false, 2, (Object) null)) {
                    return false;
                }
            }
            String it3 = JsonKt.str(os, "version");
            if (it3 != null) {
                if ((env.getOsVersion().length() > 0) && !new Regex(it3).containsMatchIn(env.getOsVersion())) {
                    return false;
                }
            }
        }
        Map f = JsonKt.obj(r, "features");
        if (f != null) {
            for (Map.Entry<String, Object> entry : f.entrySet()) {
                String k = entry.getKey();
                Object v = entry.getValue();
                Boolean bool = env.getFeatures().get(k);
                if (!Intrinsics.areEqual(Boolean.valueOf(bool != null ? bool.booleanValue() : false), v)) {
                    return false;
                }
            }
        }
        return true;
    }
}
