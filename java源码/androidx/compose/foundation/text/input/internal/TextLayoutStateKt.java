package androidx.compose.foundation.text.input.internal;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import kotlin.Metadata;

/* compiled from: TextLayoutState.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001e\u0010\u0006\u001a\u00020\u0001*\u00020\u00072\u0006\u0010\b\u001a\u00020\u0001H\u0000ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u001e\u0010\u000b\u001a\u00020\u0001*\u00020\u00072\u0006\u0010\b\u001a\u00020\u0001H\u0000ø\u0001\u0000¢\u0006\u0004\b\f\u0010\n\u001a\u001e\u0010\r\u001a\u00020\u0001*\u00020\u00072\u0006\u0010\b\u001a\u00020\u0001H\u0000ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\n\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000f"}, d2 = {"coerceIn", "Landroidx/compose/ui/geometry/Offset;", "rect", "Landroidx/compose/ui/geometry/Rect;", "coerceIn-3MmeM6k", "(JLandroidx/compose/ui/geometry/Rect;)J", "fromDecorationToTextLayout", "Landroidx/compose/foundation/text/input/internal/TextLayoutState;", "offset", "fromDecorationToTextLayout-Uv8p0NA", "(Landroidx/compose/foundation/text/input/internal/TextLayoutState;J)J", "fromTextLayoutToCore", "fromTextLayoutToCore-Uv8p0NA", "fromWindowToDecoration", "fromWindowToDecoration-Uv8p0NA", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TextLayoutStateKt {
    /* renamed from: coerceIn-3MmeM6k, reason: not valid java name */
    public static final long m1323coerceIn3MmeM6k(long $this$coerceIn_u2d3MmeM6k, Rect rect) {
        float xOffset;
        float yOffset;
        int bits$iv$iv$iv = (int) ($this$coerceIn_u2d3MmeM6k >> 32);
        if (Float.intBitsToFloat(bits$iv$iv$iv) < rect.getLeft()) {
            xOffset = rect.getLeft();
        } else {
            int bits$iv$iv$iv2 = (int) ($this$coerceIn_u2d3MmeM6k >> 32);
            if (Float.intBitsToFloat(bits$iv$iv$iv2) > rect.getRight()) {
                xOffset = rect.getRight();
            } else {
                int bits$iv$iv$iv3 = (int) ($this$coerceIn_u2d3MmeM6k >> 32);
                xOffset = Float.intBitsToFloat(bits$iv$iv$iv3);
            }
        }
        int bits$iv$iv$iv4 = (int) ($this$coerceIn_u2d3MmeM6k & 4294967295L);
        if (Float.intBitsToFloat(bits$iv$iv$iv4) < rect.getTop()) {
            yOffset = rect.getTop();
        } else {
            int bits$iv$iv$iv5 = (int) ($this$coerceIn_u2d3MmeM6k & 4294967295L);
            if (Float.intBitsToFloat(bits$iv$iv$iv5) > rect.getBottom()) {
                yOffset = rect.getBottom();
            } else {
                int bits$iv$iv$iv6 = (int) ($this$coerceIn_u2d3MmeM6k & 4294967295L);
                yOffset = Float.intBitsToFloat(bits$iv$iv$iv6);
            }
        }
        long v1$iv$iv = Float.floatToRawIntBits(xOffset);
        long v2$iv$iv = Float.floatToRawIntBits(yOffset);
        return Offset.m4141constructorimpl((v1$iv$iv << 32) | (4294967295L & v2$iv$iv));
    }

    /* renamed from: fromTextLayoutToCore-Uv8p0NA, reason: not valid java name */
    public static final long m1325fromTextLayoutToCoreUv8p0NA(TextLayoutState $this$fromTextLayoutToCore_u2dUv8p0NA, long offset) {
        LayoutCoordinates textLayoutNodeCoordinates = $this$fromTextLayoutToCore_u2dUv8p0NA.getTextLayoutNodeCoordinates();
        if (textLayoutNodeCoordinates != null) {
            Offset offsetM4138boximpl = null;
            if (!textLayoutNodeCoordinates.isAttached()) {
                textLayoutNodeCoordinates = null;
            }
            if (textLayoutNodeCoordinates != null) {
                LayoutCoordinates it = $this$fromTextLayoutToCore_u2dUv8p0NA.getCoreNodeCoordinates();
                if (it != null) {
                    if (!it.isAttached()) {
                        it = null;
                    }
                    if (it != null) {
                        offsetM4138boximpl = Offset.m4138boximpl(it.mo5759localPositionOfR5De75A(textLayoutNodeCoordinates, offset));
                    }
                }
                if (offsetM4138boximpl != null) {
                    return offsetM4138boximpl.m4159unboximpl();
                }
            }
        }
        return offset;
    }

    /* renamed from: fromDecorationToTextLayout-Uv8p0NA, reason: not valid java name */
    public static final long m1324fromDecorationToTextLayoutUv8p0NA(TextLayoutState $this$fromDecorationToTextLayout_u2dUv8p0NA, long offset) {
        Offset offsetM4138boximpl;
        long jMo5759localPositionOfR5De75A;
        LayoutCoordinates textLayoutNodeCoordinates = $this$fromDecorationToTextLayout_u2dUv8p0NA.getTextLayoutNodeCoordinates();
        if (textLayoutNodeCoordinates != null) {
            LayoutCoordinates decoratorNodeCoordinates = $this$fromDecorationToTextLayout_u2dUv8p0NA.getDecoratorNodeCoordinates();
            if (decoratorNodeCoordinates != null) {
                if (textLayoutNodeCoordinates.isAttached() && decoratorNodeCoordinates.isAttached()) {
                    jMo5759localPositionOfR5De75A = textLayoutNodeCoordinates.mo5759localPositionOfR5De75A(decoratorNodeCoordinates, offset);
                } else {
                    jMo5759localPositionOfR5De75A = offset;
                }
                offsetM4138boximpl = Offset.m4138boximpl(jMo5759localPositionOfR5De75A);
            } else {
                offsetM4138boximpl = null;
            }
            if (offsetM4138boximpl != null) {
                return offsetM4138boximpl.m4159unboximpl();
            }
        }
        return offset;
    }

    /* renamed from: fromWindowToDecoration-Uv8p0NA, reason: not valid java name */
    public static final long m1326fromWindowToDecorationUv8p0NA(TextLayoutState $this$fromWindowToDecoration_u2dUv8p0NA, long offset) {
        LayoutCoordinates decoratorNodeCoordinates = $this$fromWindowToDecoration_u2dUv8p0NA.getDecoratorNodeCoordinates();
        if (decoratorNodeCoordinates != null) {
            if (decoratorNodeCoordinates.isAttached()) {
                return decoratorNodeCoordinates.mo5767windowToLocalMKHz9U(offset);
            }
            return offset;
        }
        return offset;
    }
}
