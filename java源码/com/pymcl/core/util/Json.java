package com.pymcl.core.util;

import com.pymcl.multiplayer.TerracottaVpnService;
import com.pymcl.runtime.settings.SettingsProtocol;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;
import kotlin.text.Typography;
import org.apache.commons.lang3.CharUtils;

/* compiled from: Json.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0017B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0005\u001a\u00020\u0006J \u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\bj\u0002`\t2\u0006\u0010\u0005\u001a\u00020\u0006J\u001a\u0010\n\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\f\u001a\u00020\rJ&\u0010\u000e\u001a\u00020\u000f2\n\u0010\u0010\u001a\u00060\u0011j\u0002`\u00122\b\u0010\u000b\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u001c\u0010\u0015\u001a\u00020\u000f2\n\u0010\u0010\u001a\u00060\u0011j\u0002`\u00122\u0006\u0010\u0016\u001a\u00020\u0006H\u0002¨\u0006\u0018"}, d2 = {"Lcom/pymcl/core/util/Json;", "", "<init>", "()V", "parse", TerracottaVpnService.EXTRA_TEXT, "", "obj", "", "Lcom/pymcl/core/util/JObj;", "stringify", SettingsProtocol.EXTRA_VALUE, "pretty", "", "write", "", "sb", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "ind", "", "str", "s", "Parser", "PyMCL-Android:core"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class Json {
    public static final Json INSTANCE = new Json();

    private Json() {
    }

    public final Object parse(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        Parser $this$parse_u24lambda_u240 = new Parser(StringsKt.removePrefix(text, (CharSequence) "\ufeff"));
        Object v = $this$parse_u24lambda_u240.value();
        $this$parse_u24lambda_u240.ws();
        if ($this$parse_u24lambda_u240.getI() == $this$parse_u24lambda_u240.getS().length()) {
            return v;
        }
        throw new IllegalArgumentException(("JSON 尾部多余字符 @" + $this$parse_u24lambda_u240.getI()).toString());
    }

    public final Map<String, Object> obj(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        Object obj = parse(text);
        Map<String, Object> map = TypeIntrinsics.isMutableMap(obj) ? (Map) obj : null;
        if (map != null) {
            return map;
        }
        throw new IllegalArgumentException("不是 JSON 对象");
    }

    public static /* synthetic */ String stringify$default(Json json, Object obj, boolean z, int i, Object obj2) {
        if ((i & 2) != 0) {
            z = false;
        }
        return json.stringify(obj, z);
    }

    public final String stringify(Object v, boolean pretty) {
        StringBuilder it = new StringBuilder();
        INSTANCE.write(it, v, pretty ? 0 : -1);
        String string = it.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void write$nl(int $ind, StringBuilder $sb, int d) {
        if ($ind >= 0) {
            $sb.append('\n');
            for (int i = 0; i < d; i++) {
                $sb.append("  ");
            }
        }
    }

    private final void write(StringBuilder sb, Object v, int ind) {
        if (v != null) {
            if (!(v instanceof String)) {
                if (!(v instanceof Boolean)) {
                    if (v instanceof Double) {
                        if (!(Math.abs(((Number) v).doubleValue()) <= Double.MAX_VALUE) || !Intrinsics.areEqual((Double) v, Math.floor(((Number) v).doubleValue())) || Math.abs(((Number) v).doubleValue()) >= 1.0E15d) {
                            sb.append(((Number) v).doubleValue());
                            return;
                        } else {
                            sb.append((long) ((Number) v).doubleValue());
                            return;
                        }
                    }
                    if (!(v instanceof Float)) {
                        if (!(v instanceof Number)) {
                            if (v instanceof Map) {
                                sb.append('{');
                                boolean first = true;
                                for (Map.Entry entry : ((Map) v).entrySet()) {
                                    Object k = entry.getKey();
                                    Object x = entry.getValue();
                                    if (!first) {
                                        sb.append(',');
                                    }
                                    first = false;
                                    write$nl(ind, sb, ind + 1);
                                    str(sb, String.valueOf(k));
                                    sb.append(ind >= 0 ? ": " : ":");
                                    write(sb, x, ind >= 0 ? ind + 1 : -1);
                                }
                                if (!first) {
                                    write$nl(ind, sb, ind);
                                }
                                sb.append('}');
                                return;
                            }
                            if (v instanceof Iterable) {
                                sb.append('[');
                                boolean first2 = true;
                                for (Object x2 : (Iterable) v) {
                                    if (!first2) {
                                        sb.append(',');
                                    }
                                    first2 = false;
                                    write$nl(ind, sb, ind + 1);
                                    write(sb, x2, ind >= 0 ? ind + 1 : -1);
                                }
                                if (!first2) {
                                    write$nl(ind, sb, ind);
                                }
                                sb.append(']');
                                return;
                            }
                            if (!(v instanceof Object[])) {
                                str(sb, v.toString());
                                Unit unit = Unit.INSTANCE;
                                return;
                            } else {
                                write(sb, ArraysKt.toList((Object[]) v), ind);
                                Unit unit2 = Unit.INSTANCE;
                                return;
                            }
                        }
                        sb.append(((Number) v).longValue());
                        return;
                    }
                    write(sb, Double.valueOf(((Number) v).floatValue()), ind);
                    Unit unit3 = Unit.INSTANCE;
                    return;
                }
                sb.append(((Boolean) v).booleanValue());
                return;
            }
            str(sb, (String) v);
            Unit unit4 = Unit.INSTANCE;
            return;
        }
        sb.append("null");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void str(StringBuilder sb, String s) {
        String str;
        String str2;
        sb.append(Typography.quote);
        int length = s.length();
        for (int i = 0; i < length; i++) {
            char c = s.charAt(i);
            switch (c) {
                case '\b':
                    str = "\\b";
                    sb.append(str);
                    break;
                case '\t':
                    str2 = "\\t";
                    sb.append(str2);
                    break;
                case '\n':
                    str2 = "\\n";
                    sb.append(str2);
                    break;
                case '\f':
                    str = "\\f";
                    sb.append(str);
                    break;
                case '\r':
                    str2 = "\\r";
                    sb.append(str2);
                    break;
                case '\"':
                    str2 = "\\\"";
                    sb.append(str2);
                    break;
                case '\\':
                    str2 = "\\\\";
                    sb.append(str2);
                    break;
                default:
                    if (c < ' ') {
                        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                        String str3 = String.format("\\u%04x", Arrays.copyOf(new Object[]{Integer.valueOf(c)}, 1));
                        Intrinsics.checkNotNullExpressionValue(str3, "format(...)");
                        sb.append(str3);
                        break;
                    } else {
                        sb.append(c);
                        break;
                    }
            }
        }
        sb.append(Typography.quote);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Json.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\f\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u000e\u001a\u00020\u000fJ\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001J\u000e\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0013J\u001a\u0010\u0014\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0015\u001a\u00020\u00032\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001J\u0006\u0010\u0017\u001a\u00020\u0001J\u0006\u0010\u0018\u001a\u00020\u0003R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0019"}, d2 = {"Lcom/pymcl/core/util/Json$Parser;", "", "s", "", "<init>", "(Ljava/lang/String;)V", "getS", "()Ljava/lang/String;", "i", "", "getI", "()I", "setI", "(I)V", "ws", "", "value", "expect", "c", "", "lit", "w", SettingsProtocol.EXTRA_VALUE, "number", "string", "PyMCL-Android:core"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class Parser {
        private int i;
        private final String s;

        public Parser(String s) {
            Intrinsics.checkNotNullParameter(s, "s");
            this.s = s;
        }

        public final String getS() {
            return this.s;
        }

        public final int getI() {
            return this.i;
        }

        public final void setI(int i) {
            this.i = i;
        }

        public final void ws() {
            while (this.i < this.s.length() && CharsKt.isWhitespace(this.s.charAt(this.i))) {
                this.i++;
            }
        }

        public final Object value() {
            String str;
            Boolean bool;
            ws();
            if (!(this.i < this.s.length())) {
                throw new IllegalArgumentException("JSON 意外结束".toString());
            }
            char c = this.s.charAt(this.i);
            switch (c) {
                case '\"':
                    return string();
                case 'N':
                    return lit("NaN", Double.valueOf(Double.NaN));
                case '[':
                    this.i++;
                    ArrayList l = new ArrayList();
                    ws();
                    if (this.s.charAt(this.i) == ']') {
                        this.i++;
                        return l;
                    }
                    while (true) {
                        l.add(value());
                        ws();
                        if (this.s.charAt(this.i) != ',') {
                            expect(']');
                            return l;
                        }
                        this.i++;
                    }
                case 'f':
                    str = "false";
                    bool = false;
                    break;
                case 'n':
                    str = "null";
                    bool = null;
                    break;
                case 't':
                    str = "true";
                    bool = true;
                    break;
                case '{':
                    this.i++;
                    LinkedHashMap m = new LinkedHashMap();
                    ws();
                    if (this.s.charAt(this.i) == '}') {
                        this.i++;
                        return m;
                    }
                    while (true) {
                        ws();
                        String k = string();
                        ws();
                        expect(':');
                        m.put(k, value());
                        ws();
                        if (this.s.charAt(this.i) != ',') {
                            expect('}');
                            return m;
                        }
                        this.i++;
                    }
                default:
                    if (c == '-' || Character.isDigit(c)) {
                        return number();
                    }
                    throw new IllegalArgumentException("JSON 非法字符 '" + c + "' @" + this.i);
            }
            return lit(str, bool);
        }

        public final void expect(char c) {
            if (!(this.i < this.s.length() && this.s.charAt(this.i) == c)) {
                throw new IllegalArgumentException(("JSON 期望 '" + c + "' @" + this.i).toString());
            }
            this.i++;
        }

        public final Object lit(String w, Object v) {
            Intrinsics.checkNotNullParameter(w, "w");
            if (StringsKt.startsWith$default(this.s, w, this.i, false, 4, (Object) null)) {
                this.i += w.length();
                return v;
            }
            throw new IllegalArgumentException(("JSON 非法字面量 @" + this.i).toString());
        }

        public final Object number() {
            Long longOrNull;
            int st = this.i;
            int i = this.i;
            boolean z = true;
            while (true) {
                this.i = i + 1;
                if (this.i >= this.s.length() || !(Character.isDigit(this.s.charAt(this.i)) || StringsKt.contains$default((CharSequence) ".eE+-", this.s.charAt(this.i), false, 2, (Object) null))) {
                    break;
                }
                i = this.i;
            }
            String t = this.s.substring(st, this.i);
            Intrinsics.checkNotNullExpressionValue(t, "substring(...)");
            String $this$any$iv = t;
            int i2 = 0;
            while (true) {
                if (i2 < $this$any$iv.length()) {
                    char element$iv = $this$any$iv.charAt(i2);
                    if (StringsKt.contains$default((CharSequence) ".eE", element$iv, false, 2, (Object) null)) {
                        break;
                    }
                    i2++;
                } else {
                    z = false;
                    break;
                }
            }
            return (z || (longOrNull = StringsKt.toLongOrNull(t)) == null) ? Double.valueOf(Double.parseDouble(t)) : longOrNull;
        }

        public final String string() {
            char c;
            expect(Typography.quote);
            StringBuilder sb = new StringBuilder();
            while (true) {
                String str = this.s;
                int i = this.i;
                this.i = i + 1;
                char c2 = str.charAt(i);
                switch (c2) {
                    case '\"':
                        String string = sb.toString();
                        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                        return string;
                    case '\\':
                        String str2 = this.s;
                        int i2 = this.i;
                        this.i = i2 + 1;
                        char e = str2.charAt(i2);
                        switch (e) {
                            case 'b':
                                c = '\b';
                                break;
                            case 'f':
                                c = '\f';
                                break;
                            case 'n':
                                c = '\n';
                                break;
                            case 'r':
                                c = CharUtils.CR;
                                break;
                            case 't':
                                c = '\t';
                                break;
                            case 'u':
                                String strSubstring = this.s.substring(this.i, this.i + 4);
                                Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                                sb.append((char) Integer.parseInt(strSubstring, CharsKt.checkRadix(16)));
                                this.i += 4;
                                Unit unit = Unit.INSTANCE;
                                continue;
                            default:
                                sb.append(e);
                                continue;
                        }
                        sb.append(c);
                        break;
                    default:
                        sb.append(c2);
                        break;
                }
            }
        }
    }
}
