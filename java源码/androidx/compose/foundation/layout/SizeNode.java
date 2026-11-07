package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: Size.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B5\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u001c\u0010\u001f\u001a\u00020 *\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020 H\u0016J\u001c\u0010%\u001a\u00020 *\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010&\u001a\u00020 H\u0016J&\u0010'\u001a\u00020(*\u00020)2\u0006\u0010\"\u001a\u00020*2\u0006\u0010+\u001a\u00020\u001bH\u0016ø\u0001\u0000¢\u0006\u0004\b,\u0010-J\u001c\u0010.\u001a\u00020 *\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020 H\u0016J\u001c\u0010/\u001a\u00020 *\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010&\u001a\u00020 H\u0016R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\"\u0010\u0007\u001a\u00020\u0004X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\u0013\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\"\u0010\u0006\u001a\u00020\u0004X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\u0013\u001a\u0004\b\u0014\u0010\u0010\"\u0004\b\u0015\u0010\u0012R\"\u0010\u0005\u001a\u00020\u0004X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\u0013\u001a\u0004\b\u0016\u0010\u0010\"\u0004\b\u0017\u0010\u0012R\"\u0010\u0003\u001a\u00020\u0004X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\u0013\u001a\u0004\b\u0018\u0010\u0010\"\u0004\b\u0019\u0010\u0012R\u001e\u0010\u001a\u001a\u00020\u001b*\u00020\u001c8BX\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00060"}, d2 = {"Landroidx/compose/foundation/layout/SizeNode;", "Landroidx/compose/ui/node/LayoutModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "minWidth", "Landroidx/compose/ui/unit/Dp;", "minHeight", "maxWidth", "maxHeight", "enforceIncoming", "", "(FFFFZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getEnforceIncoming", "()Z", "setEnforceIncoming", "(Z)V", "getMaxHeight-D9Ej5fM", "()F", "setMaxHeight-0680j_4", "(F)V", "F", "getMaxWidth-D9Ej5fM", "setMaxWidth-0680j_4", "getMinHeight-D9Ej5fM", "setMinHeight-0680j_4", "getMinWidth-D9Ej5fM", "setMinWidth-0680j_4", "targetConstraints", "Landroidx/compose/ui/unit/Constraints;", "Landroidx/compose/ui/unit/Density;", "getTargetConstraints-OenEA2s", "(Landroidx/compose/ui/unit/Density;)J", "maxIntrinsicHeight", "", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "measurable", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "width", "maxIntrinsicWidth", "height", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "constraints", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "minIntrinsicHeight", "minIntrinsicWidth", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class SizeNode extends Modifier.Node implements LayoutModifierNode {
    private boolean enforceIncoming;
    private float maxHeight;
    private float maxWidth;
    private float minHeight;
    private float minWidth;

    public /* synthetic */ SizeNode(float f, float f2, float f3, float f4, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2, f3, f4, z);
    }

    public /* synthetic */ SizeNode(float f, float f2, float f3, float f4, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Dp.INSTANCE.m7038getUnspecifiedD9Ej5fM() : f, (i & 2) != 0 ? Dp.INSTANCE.m7038getUnspecifiedD9Ej5fM() : f2, (i & 4) != 0 ? Dp.INSTANCE.m7038getUnspecifiedD9Ej5fM() : f3, (i & 8) != 0 ? Dp.INSTANCE.m7038getUnspecifiedD9Ej5fM() : f4, z, null);
    }

    /* renamed from: getMinWidth-D9Ej5fM, reason: not valid java name and from getter */
    public final float getMinWidth() {
        return this.minWidth;
    }

    /* renamed from: setMinWidth-0680j_4, reason: not valid java name */
    public final void m801setMinWidth0680j_4(float f) {
        this.minWidth = f;
    }

    /* renamed from: getMinHeight-D9Ej5fM, reason: not valid java name and from getter */
    public final float getMinHeight() {
        return this.minHeight;
    }

    /* renamed from: setMinHeight-0680j_4, reason: not valid java name */
    public final void m800setMinHeight0680j_4(float f) {
        this.minHeight = f;
    }

    /* renamed from: getMaxWidth-D9Ej5fM, reason: not valid java name and from getter */
    public final float getMaxWidth() {
        return this.maxWidth;
    }

    /* renamed from: setMaxWidth-0680j_4, reason: not valid java name */
    public final void m799setMaxWidth0680j_4(float f) {
        this.maxWidth = f;
    }

    /* renamed from: getMaxHeight-D9Ej5fM, reason: not valid java name and from getter */
    public final float getMaxHeight() {
        return this.maxHeight;
    }

    /* renamed from: setMaxHeight-0680j_4, reason: not valid java name */
    public final void m798setMaxHeight0680j_4(float f) {
        this.maxHeight = f;
    }

    public final boolean getEnforceIncoming() {
        return this.enforceIncoming;
    }

    public final void setEnforceIncoming(boolean z) {
        this.enforceIncoming = z;
    }

    private SizeNode(float minWidth, float minHeight, float maxWidth, float maxHeight, boolean enforceIncoming) {
        this.minWidth = minWidth;
        this.minHeight = minHeight;
        this.maxWidth = maxWidth;
        this.maxHeight = maxHeight;
        this.enforceIncoming = enforceIncoming;
    }

    /* renamed from: getTargetConstraints-OenEA2s, reason: not valid java name */
    private final long m793getTargetConstraintsOenEA2s(Density $this$targetConstraints) {
        int $this$fastCoerceAtLeast$iv;
        int $this$fastCoerceAtLeast$iv2;
        int $this$fastCoerceAtLeast$iv$iv;
        float $this$isSpecified$iv = this.maxWidth;
        if (!Float.isNaN($this$isSpecified$iv)) {
            $this$fastCoerceAtLeast$iv = $this$targetConstraints.mo383roundToPx0680j_4(this.maxWidth);
            if ($this$fastCoerceAtLeast$iv < 0) {
                $this$fastCoerceAtLeast$iv = 0;
            }
        } else {
            $this$fastCoerceAtLeast$iv = Integer.MAX_VALUE;
        }
        float $this$isSpecified$iv2 = this.maxHeight;
        if (!Float.isNaN($this$isSpecified$iv2)) {
            $this$fastCoerceAtLeast$iv2 = $this$targetConstraints.mo383roundToPx0680j_4(this.maxHeight);
            if ($this$fastCoerceAtLeast$iv2 < 0) {
                $this$fastCoerceAtLeast$iv2 = 0;
            }
        } else {
            $this$fastCoerceAtLeast$iv2 = Integer.MAX_VALUE;
        }
        float $this$isSpecified$iv3 = this.minWidth;
        boolean zIsNaN = Float.isNaN($this$isSpecified$iv3);
        int minHeight = 0;
        if (!zIsNaN) {
            int $this$fastCoerceIn$iv = $this$targetConstraints.mo383roundToPx0680j_4(this.minWidth);
            $this$fastCoerceAtLeast$iv$iv = $this$fastCoerceIn$iv;
            if ($this$fastCoerceAtLeast$iv$iv < 0) {
                $this$fastCoerceAtLeast$iv$iv = 0;
            }
            if ($this$fastCoerceAtLeast$iv$iv > $this$fastCoerceAtLeast$iv) {
                $this$fastCoerceAtLeast$iv$iv = $this$fastCoerceAtLeast$iv;
            }
            if ($this$fastCoerceAtLeast$iv$iv == Integer.MAX_VALUE) {
                $this$fastCoerceAtLeast$iv$iv = 0;
            }
        } else {
            $this$fastCoerceAtLeast$iv$iv = 0;
        }
        float $this$isSpecified$iv4 = this.minHeight;
        if (!Float.isNaN($this$isSpecified$iv4)) {
            int $this$fastCoerceIn$iv2 = $this$targetConstraints.mo383roundToPx0680j_4(this.minHeight);
            int $this$fastCoerceAtLeast$iv$iv2 = $this$fastCoerceIn$iv2;
            if ($this$fastCoerceAtLeast$iv$iv2 < 0) {
                $this$fastCoerceAtLeast$iv$iv2 = 0;
            }
            if ($this$fastCoerceAtLeast$iv$iv2 > $this$fastCoerceAtLeast$iv2) {
                $this$fastCoerceAtLeast$iv$iv2 = $this$fastCoerceAtLeast$iv2;
            }
            if ($this$fastCoerceAtLeast$iv$iv2 != Integer.MAX_VALUE) {
                minHeight = $this$fastCoerceAtLeast$iv$iv2;
            }
        }
        return ConstraintsKt.Constraints($this$fastCoerceAtLeast$iv$iv, $this$fastCoerceAtLeast$iv, minHeight, $this$fastCoerceAtLeast$iv2);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo70measure3p2s80s(MeasureScope $this$measure_u2d3p2s80s, Measurable measurable, long constraints) {
        int $this$fastCoerceAtMost$iv;
        int $this$fastCoerceAtLeast$iv;
        int $this$fastCoerceAtMost$iv2;
        int $this$fastCoerceAtLeast$iv2;
        long wrappedConstraints;
        long targetConstraints = m793getTargetConstraintsOenEA2s($this$measure_u2d3p2s80s);
        if (this.enforceIncoming) {
            wrappedConstraints = ConstraintsKt.m6986constrainN9IONVI(constraints, targetConstraints);
        } else {
            float $this$isSpecified$iv = this.minWidth;
            if (!Float.isNaN($this$isSpecified$iv)) {
                $this$fastCoerceAtMost$iv = Constraints.m6973getMinWidthimpl(targetConstraints);
            } else {
                $this$fastCoerceAtMost$iv = Constraints.m6973getMinWidthimpl(constraints);
                int maximumValue$iv = Constraints.m6971getMaxWidthimpl(targetConstraints);
                if ($this$fastCoerceAtMost$iv > maximumValue$iv) {
                    $this$fastCoerceAtMost$iv = maximumValue$iv;
                }
            }
            float $this$isSpecified$iv2 = this.maxWidth;
            if (!Float.isNaN($this$isSpecified$iv2)) {
                $this$fastCoerceAtLeast$iv = Constraints.m6971getMaxWidthimpl(targetConstraints);
            } else {
                $this$fastCoerceAtLeast$iv = Constraints.m6971getMaxWidthimpl(constraints);
                int minimumValue$iv = Constraints.m6973getMinWidthimpl(targetConstraints);
                if ($this$fastCoerceAtLeast$iv < minimumValue$iv) {
                    $this$fastCoerceAtLeast$iv = minimumValue$iv;
                }
            }
            float $this$isSpecified$iv3 = this.minHeight;
            if (!Float.isNaN($this$isSpecified$iv3)) {
                $this$fastCoerceAtMost$iv2 = Constraints.m6972getMinHeightimpl(targetConstraints);
            } else {
                $this$fastCoerceAtMost$iv2 = Constraints.m6972getMinHeightimpl(constraints);
                int maximumValue$iv2 = Constraints.m6970getMaxHeightimpl(targetConstraints);
                if ($this$fastCoerceAtMost$iv2 > maximumValue$iv2) {
                    $this$fastCoerceAtMost$iv2 = maximumValue$iv2;
                }
            }
            float $this$isSpecified$iv4 = this.maxHeight;
            if (!Float.isNaN($this$isSpecified$iv4)) {
                $this$fastCoerceAtLeast$iv2 = Constraints.m6970getMaxHeightimpl(targetConstraints);
            } else {
                $this$fastCoerceAtLeast$iv2 = Constraints.m6970getMaxHeightimpl(constraints);
                int minimumValue$iv2 = Constraints.m6972getMinHeightimpl(targetConstraints);
                if ($this$fastCoerceAtLeast$iv2 < minimumValue$iv2) {
                    $this$fastCoerceAtLeast$iv2 = minimumValue$iv2;
                }
            }
            wrappedConstraints = ConstraintsKt.Constraints($this$fastCoerceAtMost$iv, $this$fastCoerceAtLeast$iv, $this$fastCoerceAtMost$iv2, $this$fastCoerceAtLeast$iv2);
        }
        final Placeable placeable = measurable.mo5750measureBRTryo0(wrappedConstraints);
        return MeasureScope.layout$default($this$measure_u2d3p2s80s, placeable.getWidth(), placeable.getHeight(), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.layout.SizeNode$measure$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                invoke2(placementScope);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Placeable.PlacementScope $this$layout) {
                Placeable.PlacementScope.placeRelative$default($this$layout, placeable, 0, 0, 0.0f, 4, null);
            }
        }, 4, null);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicWidth(IntrinsicMeasureScope $this$minIntrinsicWidth, IntrinsicMeasurable measurable, int height) {
        long constraints = m793getTargetConstraintsOenEA2s($this$minIntrinsicWidth);
        if (Constraints.m6969getHasFixedWidthimpl(constraints)) {
            int childHeight = Constraints.m6971getMaxWidthimpl(constraints);
            return childHeight;
        }
        int childHeight2 = this.enforceIncoming ? height : ConstraintsKt.m6987constrainHeightK40F9xA(constraints, height);
        return ConstraintsKt.m6988constrainWidthK40F9xA(constraints, measurable.minIntrinsicWidth(childHeight2));
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicHeight(IntrinsicMeasureScope $this$minIntrinsicHeight, IntrinsicMeasurable measurable, int width) {
        long constraints = m793getTargetConstraintsOenEA2s($this$minIntrinsicHeight);
        if (Constraints.m6968getHasFixedHeightimpl(constraints)) {
            int childWidth = Constraints.m6970getMaxHeightimpl(constraints);
            return childWidth;
        }
        int childWidth2 = this.enforceIncoming ? width : ConstraintsKt.m6988constrainWidthK40F9xA(constraints, width);
        return ConstraintsKt.m6987constrainHeightK40F9xA(constraints, measurable.minIntrinsicHeight(childWidth2));
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicWidth(IntrinsicMeasureScope $this$maxIntrinsicWidth, IntrinsicMeasurable measurable, int height) {
        long constraints = m793getTargetConstraintsOenEA2s($this$maxIntrinsicWidth);
        if (Constraints.m6969getHasFixedWidthimpl(constraints)) {
            int childHeight = Constraints.m6971getMaxWidthimpl(constraints);
            return childHeight;
        }
        int childHeight2 = this.enforceIncoming ? height : ConstraintsKt.m6987constrainHeightK40F9xA(constraints, height);
        return ConstraintsKt.m6988constrainWidthK40F9xA(constraints, measurable.maxIntrinsicWidth(childHeight2));
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicHeight(IntrinsicMeasureScope $this$maxIntrinsicHeight, IntrinsicMeasurable measurable, int width) {
        long constraints = m793getTargetConstraintsOenEA2s($this$maxIntrinsicHeight);
        if (Constraints.m6968getHasFixedHeightimpl(constraints)) {
            int childWidth = Constraints.m6970getMaxHeightimpl(constraints);
            return childWidth;
        }
        int childWidth2 = this.enforceIncoming ? width : ConstraintsKt.m6988constrainWidthK40F9xA(constraints, width);
        return ConstraintsKt.m6987constrainHeightK40F9xA(constraints, measurable.maxIntrinsicHeight(childWidth2));
    }
}
