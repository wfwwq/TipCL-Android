package androidx.compose.ui.graphics;

import android.graphics.Shader;
import androidx.compose.ui.geometry.Offset;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Brush.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001BA\b\u0000\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u001e\u0010\u0013\u001a\u00060\u0014j\u0002`\u00152\u0006\u0010\u0016\u001a\u00020\u000fH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0096\u0002J\b\u0010\u001d\u001a\u00020\u001eH\u0016J\b\u0010\u001f\u001a\u00020 H\u0016R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\u00020\bX\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\rR\u001a\u0010\u000e\u001a\u00020\u000f8VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0007\u001a\u00020\bX\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\rR\u0016\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\u00020\u000bX\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0012\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006!"}, d2 = {"Landroidx/compose/ui/graphics/LinearGradient;", "Landroidx/compose/ui/graphics/ShaderBrush;", "colors", "", "Landroidx/compose/ui/graphics/Color;", "stops", "", "start", "Landroidx/compose/ui/geometry/Offset;", "end", "tileMode", "Landroidx/compose/ui/graphics/TileMode;", "(Ljava/util/List;Ljava/util/List;JJILkotlin/jvm/internal/DefaultConstructorMarker;)V", "J", "intrinsicSize", "Landroidx/compose/ui/geometry/Size;", "getIntrinsicSize-NH-jbRc", "()J", "I", "createShader", "Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/Shader;", "size", "createShader-uvyYCjk", "(J)Landroid/graphics/Shader;", "equals", "", "other", "", "hashCode", "", "toString", "", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LinearGradient extends ShaderBrush {
    private final List<Color> colors;
    private final long end;
    private final long start;
    private final List<Float> stops;
    private final int tileMode;

    public /* synthetic */ LinearGradient(List list, List list2, long j, long j2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, list2, j, j2, i);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ LinearGradient(List list, List list2, long j, long j2, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
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
        this(list, list3, j, j2, iM4764getClamp3opZhB0, null);
    }

    private LinearGradient(List<Color> list, List<Float> list2, long start, long end, int tileMode) {
        this.colors = list;
        this.stops = list2;
        this.start = start;
        this.end = end;
        this.tileMode = tileMode;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x006a  */
    @Override // androidx.compose.ui.graphics.Brush
    /* renamed from: getIntrinsicSize-NH-jbRc */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long getIntrinsicSize() {
        /*
            Method dump skipped, instructions count: 233
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.LinearGradient.getIntrinsicSize():long");
    }

    @Override // androidx.compose.ui.graphics.ShaderBrush
    /* renamed from: createShader-uvyYCjk */
    public Shader mo4359createShaderuvyYCjk(long size) {
        float startX;
        float startY;
        float endX;
        long j;
        float endY;
        long arg0$iv = this.start;
        int bits$iv$iv$iv = (int) (arg0$iv >> 32);
        if (Float.intBitsToFloat(bits$iv$iv$iv) == Float.POSITIVE_INFINITY) {
            int bits$iv$iv$iv2 = (int) (size >> 32);
            startX = Float.intBitsToFloat(bits$iv$iv$iv2);
        } else {
            long arg0$iv2 = this.start;
            int bits$iv$iv$iv3 = (int) (arg0$iv2 >> 32);
            startX = Float.intBitsToFloat(bits$iv$iv$iv3);
        }
        long arg0$iv3 = this.start;
        int bits$iv$iv$iv4 = (int) (arg0$iv3 & 4294967295L);
        if (Float.intBitsToFloat(bits$iv$iv$iv4) == Float.POSITIVE_INFINITY) {
            int bits$iv$iv$iv5 = (int) (size & 4294967295L);
            startY = Float.intBitsToFloat(bits$iv$iv$iv5);
        } else {
            long arg0$iv4 = this.start;
            int bits$iv$iv$iv6 = (int) (arg0$iv4 & 4294967295L);
            startY = Float.intBitsToFloat(bits$iv$iv$iv6);
        }
        long arg0$iv5 = this.end;
        int bits$iv$iv$iv7 = (int) (arg0$iv5 >> 32);
        if (Float.intBitsToFloat(bits$iv$iv$iv7) == Float.POSITIVE_INFINITY) {
            int bits$iv$iv$iv8 = (int) (size >> 32);
            endX = Float.intBitsToFloat(bits$iv$iv$iv8);
        } else {
            long arg0$iv6 = this.end;
            int bits$iv$iv$iv9 = (int) (arg0$iv6 >> 32);
            endX = Float.intBitsToFloat(bits$iv$iv$iv9);
        }
        long arg0$iv7 = this.end;
        int bits$iv$iv$iv10 = (int) (arg0$iv7 & 4294967295L);
        if (Float.intBitsToFloat(bits$iv$iv$iv10) == Float.POSITIVE_INFINITY) {
            int bits$iv$iv$iv11 = (int) (size & 4294967295L);
            endY = Float.intBitsToFloat(bits$iv$iv$iv11);
            j = 4294967295L;
        } else {
            long arg0$iv8 = this.end;
            j = 4294967295L;
            int bits$iv$iv$iv12 = (int) (arg0$iv8 & 4294967295L);
            endY = Float.intBitsToFloat(bits$iv$iv$iv12);
        }
        List<Color> list = this.colors;
        List<Float> list2 = this.stops;
        long v1$iv$iv = Float.floatToRawIntBits(startX);
        long v2$iv$iv = Float.floatToRawIntBits(startY);
        long jM4141constructorimpl = Offset.m4141constructorimpl((v1$iv$iv << 32) | (v2$iv$iv & j));
        long v1$iv$iv2 = Float.floatToRawIntBits(endX);
        long v2$iv$iv2 = Float.floatToRawIntBits(endY);
        return ShaderKt.m4706LinearGradientShaderVjE6UOU(jM4141constructorimpl, Offset.m4141constructorimpl((v1$iv$iv2 << 32) | (v2$iv$iv2 & j)), list, list2, this.tileMode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof LinearGradient) && Intrinsics.areEqual(this.colors, ((LinearGradient) other).colors) && Intrinsics.areEqual(this.stops, ((LinearGradient) other).stops) && Offset.m4146equalsimpl0(this.start, ((LinearGradient) other).start) && Offset.m4146equalsimpl0(this.end, ((LinearGradient) other).end) && TileMode.m4760equalsimpl0(this.tileMode, ((LinearGradient) other).tileMode);
    }

    public int hashCode() {
        int result = this.colors.hashCode();
        int i = result * 31;
        List<Float> list = this.stops;
        int result2 = i + (list != null ? list.hashCode() : 0);
        return (((((result2 * 31) + Offset.m4151hashCodeimpl(this.start)) * 31) + Offset.m4151hashCodeimpl(this.end)) * 31) + TileMode.m4761hashCodeimpl(this.tileMode);
    }

    public String toString() {
        long $this$isFinite$iv = this.start;
        long v$iv = ($this$isFinite$iv & androidx.compose.ui.geometry.InlineClassHelperKt.DualFloatInfinityBase) ^ androidx.compose.ui.geometry.InlineClassHelperKt.DualFloatInfinityBase;
        String startValue = (((v$iv - androidx.compose.ui.geometry.InlineClassHelperKt.Uint64Low32) & (-9223372034707292160L)) > 0L ? 1 : (((v$iv - androidx.compose.ui.geometry.InlineClassHelperKt.Uint64Low32) & (-9223372034707292160L)) == 0L ? 0 : -1)) == 0 ? "start=" + ((Object) Offset.m4157toStringimpl(this.start)) + ", " : "";
        long $this$isFinite$iv2 = this.end;
        long v$iv2 = ($this$isFinite$iv2 & androidx.compose.ui.geometry.InlineClassHelperKt.DualFloatInfinityBase) ^ androidx.compose.ui.geometry.InlineClassHelperKt.DualFloatInfinityBase;
        String endValue = ((v$iv2 - androidx.compose.ui.geometry.InlineClassHelperKt.Uint64Low32) & (-9223372034707292160L)) == 0 ? "end=" + ((Object) Offset.m4157toStringimpl(this.end)) + ", " : "";
        return "LinearGradient(colors=" + this.colors + ", stops=" + this.stops + ", " + startValue + endValue + "tileMode=" + ((Object) TileMode.m4762toStringimpl(this.tileMode)) + ')';
    }
}
