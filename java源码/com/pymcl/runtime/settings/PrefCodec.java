package com.pymcl.runtime.settings;

import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: SettingsCore.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00012\b\u0010\b\u001a\u0004\u0018\u00010\u0005J\u0018\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\u0005H\u0002¨\u0006\f"}, d2 = {"Lcom/pymcl/runtime/settings/PrefCodec;", "", "<init>", "()V", "encode", "", SettingsProtocol.EXTRA_VALUE, "decode", "s", "decodeSet", "", "body", "PyMCL-Android:runtime_debug"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PrefCodec {
    public static final PrefCodec INSTANCE = new PrefCodec();

    private PrefCodec() {
    }

    public final String encode(Object v) {
        if (v == null) {
            return null;
        }
        if (v instanceof Boolean) {
            return "b:" + v;
        }
        if (v instanceof String) {
            return "s:" + v;
        }
        if (v instanceof Integer) {
            return "i:" + v;
        }
        if (v instanceof Long) {
            return "l:" + v;
        }
        if (v instanceof Float) {
            return "f:" + v;
        }
        if (v instanceof Set) {
            StringBuilder $this$encode_u24lambda_u240 = new StringBuilder();
            $this$encode_u24lambda_u240.append("S:");
            for (Object e : (Set) v) {
                String s = e instanceof String ? (String) e : null;
                if (s == null) {
                    throw new IllegalArgumentException("Set 元素必须是 String");
                }
                $this$encode_u24lambda_u240.append(s.length()).append(':').append(s);
            }
            return $this$encode_u24lambda_u240.toString();
        }
        throw new IllegalArgumentException("不支持的偏好类型: " + v.getClass().getName());
    }

    public final Object decode(String s) {
        Object objDecodeSet = null;
        if (s == null || s.length() < 2 || s.charAt(1) != ':') {
            return null;
        }
        String body = s.substring(2);
        Intrinsics.checkNotNullExpressionValue(body, "substring(...)");
        try {
            switch (s.charAt(0)) {
                case 'S':
                    objDecodeSet = decodeSet(body);
                    break;
                case 'b':
                    if (!Intrinsics.areEqual(body, "true")) {
                        if (Intrinsics.areEqual(body, "false")) {
                            objDecodeSet = false;
                            break;
                        }
                    } else {
                        objDecodeSet = true;
                        break;
                    }
                    break;
                case 'f':
                    objDecodeSet = Float.valueOf(Float.parseFloat(body));
                    break;
                case 'i':
                    objDecodeSet = Integer.valueOf(Integer.parseInt(body));
                    break;
                case 'l':
                    objDecodeSet = Long.valueOf(Long.parseLong(body));
                    break;
                case 's':
                    objDecodeSet = body;
                    break;
            }
        } catch (NumberFormatException e) {
        }
        return objDecodeSet;
    }

    private final Set<String> decodeSet(String body) {
        LinkedHashSet out = new LinkedHashSet();
        int i = 0;
        while (i < body.length()) {
            int colon = StringsKt.indexOf$default((CharSequence) body, ':', i, false, 4, (Object) null);
            if (colon < 0) {
                return null;
            }
            String strSubstring = body.substring(i, colon);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            Integer intOrNull = StringsKt.toIntOrNull(strSubstring);
            if (intOrNull == null) {
                return null;
            }
            int len = intOrNull.intValue();
            int end = colon + 1 + len;
            if (len < 0 || end > body.length()) {
                return null;
            }
            String strSubstring2 = body.substring(colon + 1, end);
            Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
            out.add(strSubstring2);
            i = end;
        }
        return out;
    }
}
