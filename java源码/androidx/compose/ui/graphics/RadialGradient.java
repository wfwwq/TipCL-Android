package androidx.compose.ui.graphics;

import android.graphics.Shader;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Brush.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001BA\b\u0000\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u001e\u0010\u0013\u001a\u00060\u0014j\u0002`\u00152\u0006\u0010\u0016\u001a\u00020\u000fH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0096\u0002J\b\u0010\u001d\u001a\u00020\u001eH\u0016J\b\u0010\u001f\u001a\u00020 H\u0016R\u0016\u0010\u0007\u001a\u00020\bX\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\rR\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u00020\u000f8VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\t\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\u00020\u000bX\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0012\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006!"}, d2 = {"Landroidx/compose/ui/graphics/RadialGradient;", "Landroidx/compose/ui/graphics/ShaderBrush;", "colors", "", "Landroidx/compose/ui/graphics/Color;", "stops", "", "center", "Landroidx/compose/ui/geometry/Offset;", "radius", "tileMode", "Landroidx/compose/ui/graphics/TileMode;", "(Ljava/util/List;Ljava/util/List;JFILkotlin/jvm/internal/DefaultConstructorMarker;)V", "J", "intrinsicSize", "Landroidx/compose/ui/geometry/Size;", "getIntrinsicSize-NH-jbRc", "()J", "I", "createShader", "Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/Shader;", "size", "createShader-uvyYCjk", "(J)Landroid/graphics/Shader;", "equals", "", "other", "", "hashCode", "", "toString", "", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class RadialGradient extends ShaderBrush {
    private final long center;
    private final List<Color> colors;
    private final float radius;
    private final List<Float> stops;
    private final int tileMode;

    public /* synthetic */ RadialGradient(List list, List list2, long j, float f, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, list2, j, f, i);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ RadialGradient(List list, List list2, long j, float f, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        List list3;
        int iM4764getClamp3opZhB0;
        if ((i2 & 2) == 0) {
            list3 = list2;
        } else {
            list3 = null;
        }
        if ((i2 & 16) == 0) {
            iM4764getClamp3opZhB0 = i;
        } else {
            iM4764getClamp3opZhB0 = TileMode.INSTANCE.m4764getClamp3opZhB0();
        }
        this(list, list3, j, f, iM4764getClamp3opZhB0, null);
    }

    private RadialGradient(List<Color> list, List<Float> list2, long center, float radius, int tileMode) {
        this.colors = list;
        this.stops = list2;
        this.center = center;
        this.radius = radius;
        this.tileMode = tileMode;
    }

    @Override // androidx.compose.ui.graphics.Brush
    /* renamed from: getIntrinsicSize-NH-jbRc */
    public long getIntrinsicSize() {
        float $this$fastIsFinite$iv = this.radius;
        if ((Float.floatToRawIntBits($this$fastIsFinite$iv) & Integer.MAX_VALUE) < 2139095040) {
            float f = 2;
            float width$iv = this.radius * f;
            float height$iv = this.radius * f;
            long v1$iv$iv = Float.floatToRawIntBits(width$iv);
            long v2$iv$iv = Float.floatToRawIntBits(height$iv);
            return Size.m4209constructorimpl((v1$iv$iv << 32) | (4294967295L & v2$iv$iv));
        }
        return Size.INSTANCE.m4226getUnspecifiedNHjbRc();
    }

    @Override // androidx.compose.ui.graphics.ShaderBrush
    /* renamed from: createShader-uvyYCjk */
    public Shader mo4359createShaderuvyYCjk(long size) {
        float f;
        long j;
        float fIntBitsToFloat;
        float centerX;
        float fIntBitsToFloat2;
        float centerY;
        long $this$isUnspecified$iv = this.center;
        if ((9223372034707292159L & $this$isUnspecified$iv) == androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats) {
            long drawCenter = SizeKt.m4228getCenteruvyYCjk(size);
            f = Float.POSITIVE_INFINITY;
            j = 4294967295L;
            int bits$iv$iv$iv = (int) (drawCenter >> 32);
            centerX = Float.intBitsToFloat(bits$iv$iv$iv);
            int bits$iv$iv$iv2 = (int) (drawCenter & 4294967295L);
            centerY = Float.intBitsToFloat(bits$iv$iv$iv2);
        } else {
            f = Float.POSITIVE_INFINITY;
            j = 4294967295L;
            long arg0$iv = this.center;
            int bits$iv$iv$iv3 = (int) (arg0$iv >> 32);
            if (Float.intBitsToFloat(bits$iv$iv$iv3) == Float.POSITIVE_INFINITY) {
                int bits$iv$iv$iv4 = (int) (size >> 32);
                fIntBitsToFloat = Float.intBitsToFloat(bits$iv$iv$iv4);
            } else {
                long arg0$iv2 = this.center;
                int bits$iv$iv$iv5 = (int) (arg0$iv2 >> 32);
                fIntBitsToFloat = Float.intBitsToFloat(bits$iv$iv$iv5);
            }
            centerX = fIntBitsToFloat;
            long arg0$iv3 = this.center;
            int bits$iv$iv$iv6 = (int) (arg0$iv3 & 4294967295L);
            if (Float.intBitsToFloat(bits$iv$iv$iv6) == Float.POSITIVE_INFINITY) {
                int bits$iv$iv$iv7 = (int) (size & 4294967295L);
                fIntBitsToFloat2 = Float.intBitsToFloat(bits$iv$iv$iv7);
            } else {
                long arg0$iv4 = this.center;
                int bits$iv$iv$iv8 = (int) (arg0$iv4 & 4294967295L);
                fIntBitsToFloat2 = Float.intBitsToFloat(bits$iv$iv$iv8);
            }
            centerY = fIntBitsToFloat2;
        }
        List<Color> list = this.colors;
        List<Float> list2 = this.stops;
        long v1$iv$iv = Float.floatToRawIntBits(centerX);
        long v2$iv$iv = Float.floatToRawIntBits(centerY);
        return ShaderKt.m4708RadialGradientShader8uybcMk(Offset.m4141constructorimpl((v1$iv$iv << 32) | (v2$iv$iv & j)), this.radius == f ? Size.m4217getMinDimensionimpl(size) / 2 : this.radius, list, list2, this.tileMode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if ((other instanceof RadialGradient) && Intrinsics.areEqual(this.colors, ((RadialGradient) other).colors) && Intrinsics.areEqual(this.stops, ((RadialGradient) other).stops) && Offset.m4146equalsimpl0(this.center, ((RadialGradient) other).center)) {
            return ((this.radius > ((RadialGradient) other).radius ? 1 : (this.radius == ((RadialGradient) other).radius ? 0 : -1)) == 0) && TileMode.m4760equalsimpl0(this.tileMode, ((RadialGradient) other).tileMode);
        }
        return false;
    }

    public int hashCode() {
        int result = this.colors.hashCode();
        int i = result * 31;
        List<Float> list = this.stops;
        int result2 = i + (list != null ? list.hashCode() : 0);
        return (((((result2 * 31) + Offset.m4151hashCodeimpl(this.center)) * 31) + Float.hashCode(this.radius)) * 31) + TileMode.m4761hashCodeimpl(this.tileMode);
    }

    public String toString() {
        long $this$isSpecified$iv = this.center;
        String centerValue = ((9223372034707292159L & $this$isSpecified$iv) > androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats ? 1 : ((9223372034707292159L & $this$isSpecified$iv) == androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats ? 0 : -1)) != 0 ? "center=" + ((Object) Offset.m4157toStringimpl(this.center)) + ", " : "";
        float $this$fastIsFinite$iv = this.radius;
        String radiusValue = (Float.floatToRawIntBits($this$fastIsFinite$iv) & Integer.MAX_VALUE) < 2139095040 ? "radius=" + this.radius + ", " : "";
        return "RadialGradient(colors=" + this.colors + ", stops=" + this.stops + ", " + centerValue + radiusValue + "tileMode=" + ((Object) TileMode.m4762toStringimpl(this.tileMode)) + ')';
    }
}
