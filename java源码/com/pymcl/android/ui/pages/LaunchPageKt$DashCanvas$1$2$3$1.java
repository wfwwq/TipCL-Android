package com.pymcl.android.ui.pages;

import androidx.compose.foundation.gestures.DragGestureDetectorKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.unit.Density;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;

/* compiled from: LaunchPage.kt */
@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes22.dex */
final class LaunchPageKt$DashCanvas$1$2$3$1 implements PointerInputEventHandler {
    final /* synthetic */ List<DashCardSpec> $cards;
    final /* synthetic */ Density $density;
    final /* synthetic */ Function1<List<DashCardSpec>, Unit> $onChange;
    final /* synthetic */ float $pxH;
    final /* synthetic */ float $pxW;
    final /* synthetic */ boolean $snap;
    final /* synthetic */ DashCardSpec $spec;

    /* JADX WARN: Multi-variable type inference failed */
    LaunchPageKt$DashCanvas$1$2$3$1(boolean z, Density density, Function1<? super List<DashCardSpec>, Unit> function1, List<DashCardSpec> list, DashCardSpec dashCardSpec, float f, float f2) {
        this.$snap = z;
        this.$density = density;
        this.$onChange = function1;
        this.$cards = list;
        this.$spec = dashCardSpec;
        this.$pxW = f;
        this.$pxH = f2;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(PointerInputScope $this$invoke, Continuation<? super Unit> continuation) {
        final boolean z = this.$snap;
        final Density density = this.$density;
        final Function1<List<DashCardSpec>, Unit> function1 = this.$onChange;
        final List<DashCardSpec> list = this.$cards;
        final DashCardSpec dashCardSpec = this.$spec;
        final float f = this.$pxW;
        final float f2 = this.$pxH;
        return DragGestureDetectorKt.detectDragGestures$default($this$invoke, null, null, null, new Function2() { // from class: com.pymcl.android.ui.pages.LaunchPageKt$DashCanvas$1$2$3$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return LaunchPageKt$DashCanvas$1$2$3$1.invoke$lambda$0(z, density, function1, list, dashCardSpec, f, f2, (PointerInputChange) obj, (Offset) obj2);
            }
        }, continuation, 7, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$0(boolean $snap, Density $density, Function1 $onChange, List $cards, DashCardSpec $spec, float $pxW, float $pxH, PointerInputChange change, Offset d) {
        float step;
        DashCardSpec dashCardSpecCopy$default;
        Intrinsics.checkNotNullParameter(change, "change");
        change.consume();
        float step2 = $snap ? 8 * $density.getDensity() : 1.0f;
        List<DashCardSpec> list = $cards;
        Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (DashCardSpec dashCardSpec : list) {
            if (Intrinsics.areEqual(dashCardSpec.getId(), $spec.getId())) {
                step = step2;
                dashCardSpecCopy$default = DashCardSpec.copy$default(dashCardSpec, null, null, RangesKt.coerceIn((MathKt.roundToInt(((dashCardSpec.getX() * $pxW) + Float.intBitsToFloat((int) (d.m4159unboximpl() >> 32))) / step2) * step2) / $pxW, 0.0f, 1.0f - dashCardSpec.getW()), RangesKt.coerceIn((MathKt.roundToInt(((dashCardSpec.getY() * $pxH) + Float.intBitsToFloat((int) (d.m4159unboximpl() & 4294967295L))) / step) * step) / $pxH, 0.0f, 1.0f - dashCardSpec.getH()), 0.0f, 0.0f, $cards.size(), 51, null);
            } else {
                step = step2;
                dashCardSpecCopy$default = dashCardSpec;
            }
            arrayList.add(dashCardSpecCopy$default);
            step2 = step;
        }
        $onChange.invoke((List) arrayList);
        return Unit.INSTANCE;
    }
}
