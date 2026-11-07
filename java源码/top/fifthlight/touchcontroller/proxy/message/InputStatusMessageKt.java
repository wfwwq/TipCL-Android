package top.fifthlight.touchcontroller.proxy.message;

import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* compiled from: InputStatusMessage.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a(\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0002\u001a(\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0002¨\u0006\u0007"}, d2 = {"convertUtf16RangeToUtf8", "Lkotlin/Pair;", "", "", "start", "length", "convertUtf8RangeToUtf16", "TouchController-Proxy-Client"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes24.dex */
public final class InputStatusMessageKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Pair<Integer, Integer> convertUtf16RangeToUtf8(String $this$convertUtf16RangeToUtf8, int start, int length) {
        if (!(start >= 0 && start <= $this$convertUtf16RangeToUtf8.length())) {
            throw new IllegalArgumentException("UTF-16 start out of bounds".toString());
        }
        if (!(length >= 0 && start + length <= $this$convertUtf16RangeToUtf8.length())) {
            throw new IllegalArgumentException("UTF-16 length out of bounds".toString());
        }
        String prefix = $this$convertUtf16RangeToUtf8.substring(0, start);
        Intrinsics.checkNotNullExpressionValue(prefix, "substring(...)");
        byte[] bytes = prefix.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        int byteStart = bytes.length;
        String segment = $this$convertUtf16RangeToUtf8.substring(start, start + length);
        Intrinsics.checkNotNullExpressionValue(segment, "substring(...)");
        byte[] bytes2 = segment.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes2, "getBytes(...)");
        int byteLength = bytes2.length;
        return new Pair<>(Integer.valueOf(byteStart), Integer.valueOf(byteLength));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Pair<Integer, Integer> convertUtf8RangeToUtf16(String $this$convertUtf8RangeToUtf16, int start, int length) {
        byte[] allBytes = $this$convertUtf8RangeToUtf16.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(allBytes, "getBytes(...)");
        if (start < 0 || start > allBytes.length) {
            throw new IndexOutOfBoundsException("UTF-8 start out of bounds");
        }
        if (length < 0 || start + length > allBytes.length) {
            throw new IndexOutOfBoundsException("UTF-8 length out of bounds");
        }
        byte[] beforeBytes = ArraysKt.copyOfRange(allBytes, 0, start);
        String beforeString = new String(beforeBytes, Charsets.UTF_8);
        int utf16Start = beforeString.length();
        byte[] segmentBytes = ArraysKt.copyOfRange(allBytes, start, start + length);
        String segmentString = new String(segmentBytes, Charsets.UTF_8);
        int utf16Length = segmentString.length();
        return new Pair<>(Integer.valueOf(utf16Start), Integer.valueOf(utf16Length));
    }
}
