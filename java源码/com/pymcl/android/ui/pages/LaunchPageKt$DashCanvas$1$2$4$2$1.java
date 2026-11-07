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
import kotlin.ranges.RangesKt;

/* compiled from: LaunchPage.kt */
@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes22.dex */
final class LaunchPageKt$DashCanvas$1$2$4$2$1 implements PointerInputEventHandler {
    final /* synthetic */ List<DashCardSpec> $cards;
    final /* synthetic */ Density $density;
    final /* synthetic */ int $mh;
    final /* synthetic */ int $mw;
    final /* synthetic */ Function1<List<DashCardSpec>, Unit> $onChange;
    final /* synthetic */ float $pxH;
    final /* synthetic */ float $pxW;
    final /* synthetic */ DashCardSpec $spec;

    /* JADX WARN: Multi-variable type inference failed */
    LaunchPageKt$DashCanvas$1$2$4$2$1(Function1<? super List<DashCardSpec>, Unit> function1, List<DashCardSpec> list, DashCardSpec dashCardSpec, float f, int i, Density density, float f2, int i2) {
        this.$onChange = function1;
        this.$cards = list;
        this.$spec = dashCardSpec;
        this.$pxW = f;
        this.$mw = i;
        this.$density = density;
        this.$pxH = f2;
        this.$mh = i2;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(PointerInputScope $this$invoke, Continuation<? super Unit> continuation) {
        final Function1<List<DashCardSpec>, Unit> function1 = this.$onChange;
        final List<DashCardSpec> list = this.$cards;
        final DashCardSpec dashCardSpec = this.$spec;
        final float f = this.$pxW;
        final int i = this.$mw;
        final Density density = this.$density;
        final float f2 = this.$pxH;
        final int i2 = this.$mh;
        return DragGestureDetectorKt.detectDragGestures$default($this$invoke, null, null, null, new Function2() { // from class: com.pymcl.android.ui.pages.LaunchPageKt$DashCanvas$1$2$4$2$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return LaunchPageKt$DashCanvas$1$2$4$2$1.invoke$lambda$0(function1, list, dashCardSpec, f, i, density, f2, i2, (PointerInputChange) obj, (Offset) obj2);
            }
        }, continuation, 7, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$0(Function1 $onChange, List $cards, DashCardSpec $spec, float $pxW, int $mw, Density $density, float $pxH, int $mh, PointerInputChange change, Offset d) {
        Iterable iterable;
        DashCardSpec dashCardSpecCopy$default;
        Intrinsics.checkNotNullParameter(change, "change");
        change.consume();
        List<DashCardSpec> list = $cards;
        Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (DashCardSpec dashCardSpec : list) {
            if (Intrinsics.areEqual(dashCardSpec.getId(), $spec.getId())) {
                iterable = list;
                dashCardSpecCopy$default = DashCardSpec.copy$default(dashCardSpec, null, null, 0.0f, 0.0f, RangesKt.coerceIn(((dashCardSpec.getW() * $pxW) + Float.intBitsToFloat((int) (d.m4159unboximpl() >> 32))) / $pxW, ($mw * $density.getDensity()) / $pxW, 1.0f - dashCardSpec.getX()), RangesKt.coerceIn(((dashCardSpec.getH() * $pxH) + Float.intBitsToFloat((int) (d.m4159unboximpl() & 4294967295L))) / $pxH, ($mh * $density.getDensity()) / $pxH, 1.0f - dashCardSpec.getY()), 0, 79, null);
            } else {
                iterable = list;
                dashCardSpecCopy$default = dashCardSpec;
            }
            arrayList.add(dashCardSpecCopy$default);
            list = iterable;
        }
        $onChange.invoke((List) arrayList);
        return Unit.INSTANCE;
    }
}
