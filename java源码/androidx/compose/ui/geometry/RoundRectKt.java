package androidx.compose.ui.geometry;

import androidx.compose.ui.util.MathHelpersKt;
import kotlin.Metadata;

/* compiled from: RoundRect.kt */
@Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0019\u001a \u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00012\u0006\u0010\u001b\u001a\u00020\u001cø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001a@\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00012\b\b\u0002\u0010\u001f\u001a\u00020\u001c2\b\b\u0002\u0010 \u001a\u00020\u001c2\b\b\u0002\u0010!\u001a\u00020\u001c2\b\b\u0002\u0010\"\u001a\u00020\u001cø\u0001\u0000¢\u0006\u0004\b#\u0010$\u001a\u001e\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00012\u0006\u0010%\u001a\u00020\u00122\u0006\u0010&\u001a\u00020\u0012\u001a8\u0010\u0019\u001a\u00020\u00022\u0006\u0010'\u001a\u00020\u00122\u0006\u0010(\u001a\u00020\u00122\u0006\u0010)\u001a\u00020\u00122\u0006\u0010*\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u001cø\u0001\u0000¢\u0006\u0004\b+\u0010,\u001a6\u0010\u0019\u001a\u00020\u00022\u0006\u0010'\u001a\u00020\u00122\u0006\u0010(\u001a\u00020\u00122\u0006\u0010)\u001a\u00020\u00122\u0006\u0010*\u001a\u00020\u00122\u0006\u0010%\u001a\u00020\u00122\u0006\u0010&\u001a\u00020\u0012\u001a\u001e\u0010-\u001a\u00020\u00022\u0006\u0010.\u001a\u00020\u00022\u0006\u0010/\u001a\u00020\u00022\u0006\u00100\u001a\u00020\u0012\u001a\u001c\u00101\u001a\u00020\u0002*\u00020\u00022\u0006\u00102\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b3\u00104\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0015\u0010\u0005\u001a\u00020\u0006*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\"\u0015\u0010\t\u001a\u00020\n*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\t\u0010\u000b\"\u0015\u0010\f\u001a\u00020\n*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\f\u0010\u000b\"\u0015\u0010\r\u001a\u00020\n*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000b\"\u0015\u0010\u000e\u001a\u00020\n*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000b\"\u0015\u0010\u000f\u001a\u00020\n*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u000b\"\u0015\u0010\u0010\u001a\u00020\n*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000b\"\u0015\u0010\u0011\u001a\u00020\u0012*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014\"\u0015\u0010\u0015\u001a\u00020\u0012*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0014\"\u0015\u0010\u0017\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0004\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00065"}, d2 = {"boundingRect", "Landroidx/compose/ui/geometry/Rect;", "Landroidx/compose/ui/geometry/RoundRect;", "getBoundingRect", "(Landroidx/compose/ui/geometry/RoundRect;)Landroidx/compose/ui/geometry/Rect;", "center", "Landroidx/compose/ui/geometry/Offset;", "getCenter", "(Landroidx/compose/ui/geometry/RoundRect;)J", "isCircle", "", "(Landroidx/compose/ui/geometry/RoundRect;)Z", "isEllipse", "isEmpty", "isFinite", "isRect", "isSimple", "maxDimension", "", "getMaxDimension", "(Landroidx/compose/ui/geometry/RoundRect;)F", "minDimension", "getMinDimension", "safeInnerRect", "getSafeInnerRect", "RoundRect", "rect", "cornerRadius", "Landroidx/compose/ui/geometry/CornerRadius;", "RoundRect-sniSvfs", "(Landroidx/compose/ui/geometry/Rect;J)Landroidx/compose/ui/geometry/RoundRect;", "topLeft", "topRight", "bottomRight", "bottomLeft", "RoundRect-ZAM2FJo", "(Landroidx/compose/ui/geometry/Rect;JJJJ)Landroidx/compose/ui/geometry/RoundRect;", "radiusX", "radiusY", "left", "top", "right", "bottom", "RoundRect-gG7oq9Y", "(FFFFJ)Landroidx/compose/ui/geometry/RoundRect;", "lerp", "start", "stop", "fraction", "translate", "offset", "translate-Uv8p0NA", "(Landroidx/compose/ui/geometry/RoundRect;J)Landroidx/compose/ui/geometry/RoundRect;", "ui-geometry_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class RoundRectKt {
    public static final RoundRect RoundRect(float left, float top2, float right, float bottom, float radiusX, float radiusY) {
        long v1$iv$iv = Float.floatToRawIntBits(radiusX);
        long v2$iv$iv = Float.floatToRawIntBits(radiusY);
        long jM4103constructorimpl = CornerRadius.m4103constructorimpl((v1$iv$iv << 32) | (4294967295L & v2$iv$iv));
        return new RoundRect(left, top2, right, bottom, jM4103constructorimpl, jM4103constructorimpl, jM4103constructorimpl, jM4103constructorimpl, null);
    }

    /* renamed from: RoundRect-gG7oq9Y, reason: not valid java name */
    public static final RoundRect m4203RoundRectgG7oq9Y(float left, float top2, float right, float bottom, long cornerRadius) {
        int bits$iv$iv$iv = (int) (cornerRadius >> 32);
        float fIntBitsToFloat = Float.intBitsToFloat(bits$iv$iv$iv);
        int bits$iv$iv$iv2 = (int) (4294967295L & cornerRadius);
        return RoundRect(left, top2, right, bottom, fIntBitsToFloat, Float.intBitsToFloat(bits$iv$iv$iv2));
    }

    public static final RoundRect RoundRect(Rect rect, float radiusX, float radiusY) {
        return RoundRect(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom(), radiusX, radiusY);
    }

    /* renamed from: RoundRect-sniSvfs, reason: not valid java name */
    public static final RoundRect m4204RoundRectsniSvfs(Rect rect, long cornerRadius) {
        int bits$iv$iv$iv = (int) (cornerRadius >> 32);
        int bits$iv$iv$iv2 = (int) (4294967295L & cornerRadius);
        return RoundRect(rect, Float.intBitsToFloat(bits$iv$iv$iv), Float.intBitsToFloat(bits$iv$iv$iv2));
    }

    /* renamed from: RoundRect-ZAM2FJo, reason: not valid java name */
    public static final RoundRect m4201RoundRectZAM2FJo(Rect rect, long topLeft, long topRight, long bottomRight, long bottomLeft) {
        return new RoundRect(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom(), topLeft, topRight, bottomRight, bottomLeft, null);
    }

    /* renamed from: translate-Uv8p0NA, reason: not valid java name */
    public static final RoundRect m4205translateUv8p0NA(RoundRect $this$translate_u2dUv8p0NA, long offset) {
        int bits$iv$iv$iv = (int) (offset >> 32);
        int bits$iv$iv$iv2 = (int) (offset & 4294967295L);
        int bits$iv$iv$iv3 = (int) (offset >> 32);
        int bits$iv$iv$iv4 = (int) (4294967295L & offset);
        return new RoundRect($this$translate_u2dUv8p0NA.getLeft() + Float.intBitsToFloat(bits$iv$iv$iv), $this$translate_u2dUv8p0NA.getTop() + Float.intBitsToFloat(bits$iv$iv$iv2), $this$translate_u2dUv8p0NA.getRight() + Float.intBitsToFloat(bits$iv$iv$iv3), $this$translate_u2dUv8p0NA.getBottom() + Float.intBitsToFloat(bits$iv$iv$iv4), $this$translate_u2dUv8p0NA.m4199getTopLeftCornerRadiuskKHJgLs(), $this$translate_u2dUv8p0NA.m4200getTopRightCornerRadiuskKHJgLs(), $this$translate_u2dUv8p0NA.m4198getBottomRightCornerRadiuskKHJgLs(), $this$translate_u2dUv8p0NA.m4197getBottomLeftCornerRadiuskKHJgLs(), null);
    }

    public static final Rect getBoundingRect(RoundRect $this$boundingRect) {
        return new Rect($this$boundingRect.getLeft(), $this$boundingRect.getTop(), $this$boundingRect.getRight(), $this$boundingRect.getBottom());
    }

    public static final Rect getSafeInnerRect(RoundRect $this$safeInnerRect) {
        long arg0$iv = $this$safeInnerRect.m4197getBottomLeftCornerRadiuskKHJgLs();
        int bits$iv$iv$iv = (int) (arg0$iv >> 32);
        float fIntBitsToFloat = Float.intBitsToFloat(bits$iv$iv$iv);
        long arg0$iv2 = $this$safeInnerRect.m4199getTopLeftCornerRadiuskKHJgLs();
        int bits$iv$iv$iv2 = (int) (arg0$iv2 >> 32);
        float leftRadius = Math.max(fIntBitsToFloat, Float.intBitsToFloat(bits$iv$iv$iv2));
        long arg0$iv3 = $this$safeInnerRect.m4199getTopLeftCornerRadiuskKHJgLs();
        int bits$iv$iv$iv3 = (int) (arg0$iv3 & 4294967295L);
        float fIntBitsToFloat2 = Float.intBitsToFloat(bits$iv$iv$iv3);
        long arg0$iv4 = $this$safeInnerRect.m4200getTopRightCornerRadiuskKHJgLs();
        int bits$iv$iv$iv4 = (int) (arg0$iv4 & 4294967295L);
        float topRadius = Math.max(fIntBitsToFloat2, Float.intBitsToFloat(bits$iv$iv$iv4));
        long arg0$iv5 = $this$safeInnerRect.m4200getTopRightCornerRadiuskKHJgLs();
        int bits$iv$iv$iv5 = (int) (arg0$iv5 >> 32);
        float fIntBitsToFloat3 = Float.intBitsToFloat(bits$iv$iv$iv5);
        long arg0$iv6 = $this$safeInnerRect.m4198getBottomRightCornerRadiuskKHJgLs();
        int bits$iv$iv$iv6 = (int) (arg0$iv6 >> 32);
        float rightRadius = Math.max(fIntBitsToFloat3, Float.intBitsToFloat(bits$iv$iv$iv6));
        long arg0$iv7 = $this$safeInnerRect.m4198getBottomRightCornerRadiuskKHJgLs();
        int bits$iv$iv$iv7 = (int) (arg0$iv7 & 4294967295L);
        float fIntBitsToFloat4 = Float.intBitsToFloat(bits$iv$iv$iv7);
        long arg0$iv8 = $this$safeInnerRect.m4197getBottomLeftCornerRadiuskKHJgLs();
        int bits$iv$iv$iv8 = (int) (4294967295L & arg0$iv8);
        float bottomRadius = Math.max(fIntBitsToFloat4, Float.intBitsToFloat(bits$iv$iv$iv8));
        return new Rect($this$safeInnerRect.getLeft() + (leftRadius * 0.29289323f), $this$safeInnerRect.getTop() + (topRadius * 0.29289323f), $this$safeInnerRect.getRight() - (rightRadius * 0.29289323f), $this$safeInnerRect.getBottom() - (bottomRadius * 0.29289323f));
    }

    public static final boolean isEmpty(RoundRect $this$isEmpty) {
        return $this$isEmpty.getLeft() >= $this$isEmpty.getRight() || $this$isEmpty.getTop() >= $this$isEmpty.getBottom();
    }

    public static final boolean isFinite(RoundRect $this$isFinite) {
        float $this$fastIsFinite$iv = $this$isFinite.getLeft();
        if ((Float.floatToRawIntBits($this$fastIsFinite$iv) & Integer.MAX_VALUE) < 2139095040) {
            float $this$fastIsFinite$iv2 = $this$isFinite.getTop();
            if ((Float.floatToRawIntBits($this$fastIsFinite$iv2) & Integer.MAX_VALUE) < 2139095040) {
                float $this$fastIsFinite$iv3 = $this$isFinite.getRight();
                if ((Float.floatToRawIntBits($this$fastIsFinite$iv3) & Integer.MAX_VALUE) < 2139095040) {
                    float $this$fastIsFinite$iv4 = $this$isFinite.getBottom();
                    if ((Float.floatToRawIntBits($this$fastIsFinite$iv4) & Integer.MAX_VALUE) < 2139095040) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final boolean isRect(RoundRect $this$isRect) {
        long arg0$iv = $this$isRect.m4199getTopLeftCornerRadiuskKHJgLs();
        long v$iv = arg0$iv & 9223372034707292159L;
        if ((((v$iv - InlineClassHelperKt.Uint64Low32) & (~v$iv)) & (-9223372034707292160L)) != 0) {
            long arg0$iv2 = $this$isRect.m4200getTopRightCornerRadiuskKHJgLs();
            long v$iv2 = arg0$iv2 & 9223372034707292159L;
            if ((((v$iv2 - InlineClassHelperKt.Uint64Low32) & (~v$iv2)) & (-9223372034707292160L)) != 0) {
                long arg0$iv3 = $this$isRect.m4197getBottomLeftCornerRadiuskKHJgLs();
                long v$iv3 = arg0$iv3 & 9223372034707292159L;
                if ((((v$iv3 - InlineClassHelperKt.Uint64Low32) & (~v$iv3)) & (-9223372034707292160L)) != 0) {
                    long arg0$iv4 = $this$isRect.m4198getBottomRightCornerRadiuskKHJgLs();
                    long v$iv4 = arg0$iv4 & 9223372034707292159L;
                    if ((((v$iv4 - InlineClassHelperKt.Uint64Low32) & (~v$iv4)) & (-9223372034707292160L)) != 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final boolean isEllipse(RoundRect $this$isEllipse) {
        if ($this$isEllipse.m4199getTopLeftCornerRadiuskKHJgLs() == $this$isEllipse.m4200getTopRightCornerRadiuskKHJgLs() && $this$isEllipse.m4200getTopRightCornerRadiuskKHJgLs() == $this$isEllipse.m4198getBottomRightCornerRadiuskKHJgLs() && $this$isEllipse.m4198getBottomRightCornerRadiuskKHJgLs() == $this$isEllipse.m4197getBottomLeftCornerRadiuskKHJgLs()) {
            double width = $this$isEllipse.getWidth();
            long arg0$iv = $this$isEllipse.m4199getTopLeftCornerRadiuskKHJgLs();
            int bits$iv$iv$iv = (int) (arg0$iv >> 32);
            if (width <= Float.intBitsToFloat(bits$iv$iv$iv) * 2.0d) {
                double height = $this$isEllipse.getHeight();
                long arg0$iv2 = $this$isEllipse.m4199getTopLeftCornerRadiuskKHJgLs();
                int bits$iv$iv$iv2 = (int) (4294967295L & arg0$iv2);
                if (height <= Float.intBitsToFloat(bits$iv$iv$iv2) * 2.0d) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final boolean isCircle(RoundRect $this$isCircle) {
        return (($this$isCircle.getWidth() > $this$isCircle.getHeight() ? 1 : ($this$isCircle.getWidth() == $this$isCircle.getHeight() ? 0 : -1)) == 0) && isEllipse($this$isCircle);
    }

    public static final float getMinDimension(RoundRect $this$minDimension) {
        return Math.min(Math.abs($this$minDimension.getWidth()), Math.abs($this$minDimension.getHeight()));
    }

    public static final float getMaxDimension(RoundRect $this$maxDimension) {
        return Math.max(Math.abs($this$maxDimension.getWidth()), Math.abs($this$maxDimension.getHeight()));
    }

    public static final long getCenter(RoundRect $this$center) {
        float x$iv = $this$center.getLeft() + ($this$center.getWidth() / 2.0f);
        float y$iv = $this$center.getTop() + ($this$center.getHeight() / 2.0f);
        long v1$iv$iv = Float.floatToRawIntBits(x$iv);
        long v2$iv$iv = Float.floatToRawIntBits(y$iv);
        return Offset.m4141constructorimpl((v1$iv$iv << 32) | (4294967295L & v2$iv$iv));
    }

    public static final boolean isSimple(RoundRect $this$isSimple) {
        long arg0$iv = $this$isSimple.m4199getTopLeftCornerRadiuskKHJgLs();
        return (((arg0$iv >>> 32) > (4294967295L & arg0$iv) ? 1 : ((arg0$iv >>> 32) == (4294967295L & arg0$iv) ? 0 : -1)) == 0) && $this$isSimple.m4199getTopLeftCornerRadiuskKHJgLs() == $this$isSimple.m4200getTopRightCornerRadiuskKHJgLs() && $this$isSimple.m4199getTopLeftCornerRadiuskKHJgLs() == $this$isSimple.m4198getBottomRightCornerRadiuskKHJgLs() && $this$isSimple.m4199getTopLeftCornerRadiuskKHJgLs() == $this$isSimple.m4197getBottomLeftCornerRadiuskKHJgLs();
    }

    public static final RoundRect lerp(RoundRect start, RoundRect stop, float fraction) {
        return new RoundRect(MathHelpersKt.lerp(start.getLeft(), stop.getLeft(), fraction), MathHelpersKt.lerp(start.getTop(), stop.getTop(), fraction), MathHelpersKt.lerp(start.getRight(), stop.getRight(), fraction), MathHelpersKt.lerp(start.getBottom(), stop.getBottom(), fraction), CornerRadiusKt.m4122lerp3Ry4LBc(start.m4199getTopLeftCornerRadiuskKHJgLs(), stop.m4199getTopLeftCornerRadiuskKHJgLs(), fraction), CornerRadiusKt.m4122lerp3Ry4LBc(start.m4200getTopRightCornerRadiuskKHJgLs(), stop.m4200getTopRightCornerRadiuskKHJgLs(), fraction), CornerRadiusKt.m4122lerp3Ry4LBc(start.m4198getBottomRightCornerRadiuskKHJgLs(), stop.m4198getBottomRightCornerRadiuskKHJgLs(), fraction), CornerRadiusKt.m4122lerp3Ry4LBc(start.m4197getBottomLeftCornerRadiuskKHJgLs(), stop.m4197getBottomLeftCornerRadiuskKHJgLs(), fraction), null);
    }
}
