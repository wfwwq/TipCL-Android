package top.fifthlight.touchcontroller.proxy.message.input;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: TextRange.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u0012\u0010\u0004\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003¨\u0006\u0005"}, d2 = {"substring", "", "range", "Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;", "removeRange", "TouchController-Proxy-Client"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes24.dex */
public final class TextRangeKt {
    public static final String substring(String $this$substring, TextRange range) {
        Intrinsics.checkNotNullParameter($this$substring, "<this>");
        Intrinsics.checkNotNullParameter(range, "range");
        String strSubstring = $this$substring.substring(range.getStart(), range.getEnd());
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static final String removeRange(String $this$removeRange, TextRange range) {
        Intrinsics.checkNotNullParameter($this$removeRange, "<this>");
        Intrinsics.checkNotNullParameter(range, "range");
        return StringsKt.removeRange((CharSequence) $this$removeRange, range.getStart(), range.getEnd()).toString();
    }
}
