package androidx.compose.ui.text.platform.style;

import android.graphics.Paint;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import kotlin.Metadata;

/* compiled from: DrawStyleSpan.android.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0016\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0016\u0010\u0005\u001a\u00020\u0006*\u00020\u0007H\u0000ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\n"}, d2 = {"toAndroidCap", "Landroid/graphics/Paint$Cap;", "Landroidx/compose/ui/graphics/StrokeCap;", "toAndroidCap-BeK7IIE", "(I)Landroid/graphics/Paint$Cap;", "toAndroidJoin", "Landroid/graphics/Paint$Join;", "Landroidx/compose/ui/graphics/StrokeJoin;", "toAndroidJoin-Ww9F2mQ", "(I)Landroid/graphics/Paint$Join;", "ui-text_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes24.dex */
public final class DrawStyleSpan_androidKt {
    /* renamed from: toAndroidJoin-Ww9F2mQ, reason: not valid java name */
    public static final Paint.Join m6749toAndroidJoinWw9F2mQ(int $this$toAndroidJoin_u2dWw9F2mQ) {
        return StrokeJoin.m4750equalsimpl0($this$toAndroidJoin_u2dWw9F2mQ, StrokeJoin.INSTANCE.m4755getMiterLxFBmk8()) ? Paint.Join.MITER : StrokeJoin.m4750equalsimpl0($this$toAndroidJoin_u2dWw9F2mQ, StrokeJoin.INSTANCE.m4756getRoundLxFBmk8()) ? Paint.Join.ROUND : StrokeJoin.m4750equalsimpl0($this$toAndroidJoin_u2dWw9F2mQ, StrokeJoin.INSTANCE.m4754getBevelLxFBmk8()) ? Paint.Join.BEVEL : Paint.Join.MITER;
    }

    /* renamed from: toAndroidCap-BeK7IIE, reason: not valid java name */
    public static final Paint.Cap m6748toAndroidCapBeK7IIE(int $this$toAndroidCap_u2dBeK7IIE) {
        return StrokeCap.m4740equalsimpl0($this$toAndroidCap_u2dBeK7IIE, StrokeCap.INSTANCE.m4744getButtKaPHkGw()) ? Paint.Cap.BUTT : StrokeCap.m4740equalsimpl0($this$toAndroidCap_u2dBeK7IIE, StrokeCap.INSTANCE.m4745getRoundKaPHkGw()) ? Paint.Cap.ROUND : StrokeCap.m4740equalsimpl0($this$toAndroidCap_u2dBeK7IIE, StrokeCap.INSTANCE.m4746getSquareKaPHkGw()) ? Paint.Cap.SQUARE : Paint.Cap.BUTT;
    }
}
