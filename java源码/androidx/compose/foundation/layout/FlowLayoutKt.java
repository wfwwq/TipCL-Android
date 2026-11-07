package androidx.compose.foundation.layout;

import androidx.collection.IntIntPair;
import androidx.collection.IntObjectMapKt;
import androidx.collection.MutableIntList;
import androidx.collection.MutableIntObjectMap;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.FlowLayoutBuildingBlocks;
import androidx.compose.foundation.layout.FlowLayoutOverflow;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.profileinstaller.ProfileVerifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.IntRange;
import org.lwjgl.opengl.GL11;
import org.lwjgl.system.jni.JNINativeInterface;
import org.lwjgl.system.windows.User32;

/* compiled from: FlowLayout.kt */
@Metadata(d1 = {"\u0000ä\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0015\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\u001ag\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00112\u001c\u0010\u0013\u001a\u0018\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00070\u0014¢\u0006\u0002\b\u0016¢\u0006\u0002\b\u0017H\u0007¢\u0006\u0002\u0010\u0018\u001aq\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0019\u001a\u00020\u001a2\u001c\u0010\u0013\u001a\u0018\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00070\u0014¢\u0006\u0002\b\u0016¢\u0006\u0002\b\u0017H\u0007¢\u0006\u0002\u0010\u001b\u001ag\u0010\u001c\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00112\u001c\u0010\u0013\u001a\u0018\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u00070\u0014¢\u0006\u0002\b\u0016¢\u0006\u0002\b\u0017H\u0007¢\u0006\u0002\u0010!\u001aq\u0010\u001c\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0019\u001a\u00020\"2\u001c\u0010\u0013\u001a\u0018\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u00070\u0014¢\u0006\u0002\b\u0016¢\u0006\u0002\b\u0017H\u0007¢\u0006\u0002\u0010#\u001a%\u0010$\u001a\u00020%2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010&\u001a\u00020\u0011H\u0001¢\u0006\u0002\u0010'\u001a=\u0010(\u001a\u00020)2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010&\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010*\u001a\u00020+H\u0001¢\u0006\u0002\u0010,\u001a\u0096\u0001\u0010-\u001a\u00020.2\f\u0010/\u001a\b\u0012\u0004\u0012\u000201002#\u00102\u001a\u001f\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u001103¢\u0006\u0002\b\u00172#\u00104\u001a\u001f\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u001103¢\u0006\u0002\b\u00172\u0006\u00105\u001a\u00020\u00112\u0006\u00106\u001a\u00020\u00112\u0006\u00107\u001a\u00020\u00112\u0006\u0010&\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020+H\u0082\b¢\u0006\u0002\u00108\u001a[\u0010-\u001a\u00020.2\f\u0010/\u001a\b\u0012\u0004\u0012\u000201002\u0006\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020:2\u0006\u00105\u001a\u00020\u00112\u0006\u00106\u001a\u00020\u00112\u0006\u00107\u001a\u00020\u00112\u0006\u0010&\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020+H\u0002¢\u0006\u0002\u0010<\u001aT\u0010=\u001a\u00020\u00112\f\u0010/\u001a\b\u0012\u0004\u0012\u000201002#\u00102\u001a\u001f\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u001103¢\u0006\u0002\b\u00172\u0006\u0010>\u001a\u00020\u00112\u0006\u00106\u001a\u00020\u00112\u0006\u0010&\u001a\u00020\u0011H\u0082\b\u001a\u0091\u0001\u0010?\u001a\u00020\u00112\f\u0010/\u001a\b\u0012\u0004\u0012\u000201002#\u00102\u001a\u001f\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u001103¢\u0006\u0002\b\u00172#\u00104\u001a\u001f\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u001103¢\u0006\u0002\b\u00172\u0006\u0010>\u001a\u00020\u00112\u0006\u00106\u001a\u00020\u00112\u0006\u00107\u001a\u00020\u00112\u0006\u0010&\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020+H\u0082\b\u001a%\u0010@\u001a\u00020%2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010&\u001a\u00020\u0011H\u0001¢\u0006\u0002\u0010A\u001a=\u0010B\u001a\u00020)2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010&\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010*\u001a\u00020+H\u0001¢\u0006\u0002\u0010C\u001a\\\u0010D\u001a\u00020E*\u00020F2\u0006\u0010G\u001a\u00020H2\f\u0010I\u001a\b\u0012\u0004\u0012\u00020K0J2\u0006\u0010L\u001a\u00020M2\u0006\u0010N\u001a\u00020M2\u0006\u0010O\u001a\u00020P2\u0006\u0010&\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020+H\u0000ø\u0001\u0000¢\u0006\u0004\bQ\u0010R\u001a\u001c\u0010S\u001a\u00020\u0011*\u0002012\u0006\u0010T\u001a\u00020U2\u0006\u00102\u001a\u00020\u0011H\u0000\u001a\u001c\u0010V\u001a\u00020\u0011*\u0002012\u0006\u0010T\u001a\u00020U2\u0006\u00104\u001a\u00020\u0011H\u0000\u001a<\u0010W\u001a\u00020.*\u00020K2\u0006\u0010G\u001a\u00020H2\u0006\u0010O\u001a\u00020X2\u0014\u0010Y\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010Z\u0012\u0004\u0012\u00020\u00070\u0014H\u0000ø\u0001\u0000¢\u0006\u0004\b[\u0010\\\u001aT\u0010]\u001a\u00020E*\u00020F2\u0006\u0010O\u001a\u00020P2\u0006\u0010^\u001a\u00020\u00112\u0006\u0010_\u001a\u00020\u00112\u0006\u0010;\u001a\u00020:2\f\u0010`\u001a\b\u0012\u0004\u0012\u00020E0a2\u0006\u0010b\u001a\u00020H2\u0006\u0010c\u001a\u00020:H\u0000ø\u0001\u0000¢\u0006\u0004\bd\u0010e\u001a\u001e\u0010f\u001a\u0004\u0018\u00010K*\b\u0012\u0004\u0012\u00020K0J2\b\u0010g\u001a\u0004\u0018\u00010hH\u0002\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u0014\u0010\u0004\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0003\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006i"}, d2 = {"CROSS_AXIS_ALIGNMENT_START", "Landroidx/compose/foundation/layout/CrossAxisAlignment;", "getCROSS_AXIS_ALIGNMENT_START", "()Landroidx/compose/foundation/layout/CrossAxisAlignment;", "CROSS_AXIS_ALIGNMENT_TOP", "getCROSS_AXIS_ALIGNMENT_TOP", "FlowColumn", "", "modifier", "Landroidx/compose/ui/Modifier;", "verticalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "horizontalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "itemHorizontalAlignment", "Landroidx/compose/ui/Alignment$Horizontal;", "maxItemsInEachColumn", "", "maxLines", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/FlowColumnScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Horizontal;IILkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "overflow", "Landroidx/compose/foundation/layout/FlowColumnOverflow;", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Horizontal;IILandroidx/compose/foundation/layout/FlowColumnOverflow;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "FlowRow", "itemVerticalAlignment", "Landroidx/compose/ui/Alignment$Vertical;", "maxItemsInEachRow", "Landroidx/compose/foundation/layout/FlowRowScope;", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Vertical;IILkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/foundation/layout/FlowRowOverflow;", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Vertical;IILandroidx/compose/foundation/layout/FlowRowOverflow;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "columnMeasurementHelper", "Landroidx/compose/ui/layout/MeasurePolicy;", "maxItemsInMainAxis", "(Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;ILandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;", "columnMeasurementMultiContentHelper", "Landroidx/compose/ui/layout/MultiContentMeasurePolicy;", "overflowState", "Landroidx/compose/foundation/layout/FlowLayoutOverflowState;", "(Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Horizontal;IILandroidx/compose/foundation/layout/FlowLayoutOverflowState;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MultiContentMeasurePolicy;", "intrinsicCrossAxisSize", "Landroidx/collection/IntIntPair;", "children", "", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "mainAxisSize", "Lkotlin/Function3;", "crossAxisSize", "mainAxisAvailable", "mainAxisSpacing", "crossAxisSpacing", "(Ljava/util/List;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;IIIIILandroidx/compose/foundation/layout/FlowLayoutOverflowState;)J", "mainAxisSizes", "", "crossAxisSizes", "(Ljava/util/List;[I[IIIIIILandroidx/compose/foundation/layout/FlowLayoutOverflowState;)J", "maxIntrinsicMainAxisSize", "crossAxisAvailable", "minIntrinsicMainAxisSize", "rowMeasurementHelper", "(Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;ILandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;", "rowMeasurementMultiContentHelper", "(Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Vertical;IILandroidx/compose/foundation/layout/FlowLayoutOverflowState;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MultiContentMeasurePolicy;", "breakDownItems", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "measurePolicy", "Landroidx/compose/foundation/layout/FlowLineMeasurePolicy;", "measurablesIterator", "", "Landroidx/compose/ui/layout/Measurable;", "mainAxisSpacingDp", "Landroidx/compose/ui/unit/Dp;", "crossAxisSpacingDp", "constraints", "Landroidx/compose/foundation/layout/OrientationIndependentConstraints;", "breakDownItems-di9J0FM", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/foundation/layout/FlowLineMeasurePolicy;Ljava/util/Iterator;FFJIILandroidx/compose/foundation/layout/FlowLayoutOverflowState;)Landroidx/compose/ui/layout/MeasureResult;", "crossAxisMin", "isHorizontal", "", "mainAxisMin", "measureAndCache", "Landroidx/compose/ui/unit/Constraints;", "storePlaceable", "Landroidx/compose/ui/layout/Placeable;", "measureAndCache-rqJ1uqs", "(Landroidx/compose/ui/layout/Measurable;Landroidx/compose/foundation/layout/FlowLineMeasurePolicy;JLkotlin/jvm/functions/Function1;)J", "placeHelper", "mainAxisTotalSize", "crossAxisTotalSize", "items", "Landroidx/compose/runtime/collection/MutableVector;", "measureHelper", "outPosition", "placeHelper-BmaY500", "(Landroidx/compose/ui/layout/MeasureScope;JII[ILandroidx/compose/runtime/collection/MutableVector;Landroidx/compose/foundation/layout/FlowLineMeasurePolicy;[I)Landroidx/compose/ui/layout/MeasureResult;", "safeNext", "info", "Landroidx/compose/foundation/layout/FlowLineInfo;", "foundation-layout_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FlowLayoutKt {
    private static final CrossAxisAlignment CROSS_AXIS_ALIGNMENT_TOP = CrossAxisAlignment.INSTANCE.vertical$foundation_layout_release(Alignment.INSTANCE.getTop());
    private static final CrossAxisAlignment CROSS_AXIS_ALIGNMENT_START = CrossAxisAlignment.INSTANCE.horizontal$foundation_layout_release(Alignment.INSTANCE.getStart());

    /* JADX WARN: Removed duplicated region for block: B:132:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x035c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:183:0x039e  */
    @kotlin.Deprecated(message = "The overflow parameter has been deprecated")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void FlowRow(androidx.compose.ui.Modifier r29, androidx.compose.foundation.layout.Arrangement.Horizontal r30, androidx.compose.foundation.layout.Arrangement.Vertical r31, androidx.compose.ui.Alignment.Vertical r32, int r33, int r34, androidx.compose.foundation.layout.FlowRowOverflow r35, final kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.FlowRowScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r36, androidx.compose.runtime.Composer r37, final int r38, final int r39) {
        /*
            Method dump skipped, instructions count: 974
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.layout.FlowLayoutKt.FlowRow(androidx.compose.ui.Modifier, androidx.compose.foundation.layout.Arrangement$Horizontal, androidx.compose.foundation.layout.Arrangement$Vertical, androidx.compose.ui.Alignment$Vertical, int, int, androidx.compose.foundation.layout.FlowRowOverflow, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final void FlowRow(Modifier modifier, Arrangement.Horizontal horizontalArrangement, Arrangement.Vertical verticalArrangement, Alignment.Vertical itemVerticalAlignment, int maxItemsInEachRow, int maxLines, final Function3<? super FlowRowScope, ? super Composer, ? super Integer, Unit> function3, Composer $composer, final int $changed, final int i) {
        Modifier modifier2;
        Arrangement.Horizontal horizontal;
        int maxItemsInEachRow2;
        int i2;
        Composer $composer2;
        final Arrangement.Vertical verticalArrangement2;
        int $dirty;
        final Modifier modifier3;
        final Arrangement.Horizontal horizontalArrangement2;
        final int maxLines2;
        final Alignment.Vertical itemVerticalAlignment2;
        final int maxItemsInEachRow3;
        int i3;
        Arrangement.Horizontal horizontalArrangement3;
        int i4;
        Alignment.Vertical itemVerticalAlignment3;
        Composer $composer3 = $composer.startRestartGroup(-2070229740);
        ComposerKt.sourceInformation($composer3, "C(FlowRow)P(5,1,6,2,3,4)161@7269L215:FlowLayout.kt#2w3rfo");
        int $dirty2 = $changed;
        int i5 = i & 1;
        if (i5 != 0) {
            $dirty2 |= 6;
            modifier2 = modifier;
        } else if (($changed & 6) == 0) {
            modifier2 = modifier;
            $dirty2 |= $composer3.changed(modifier2) ? 4 : 2;
        } else {
            modifier2 = modifier;
        }
        int i6 = i & 2;
        if (i6 != 0) {
            $dirty2 |= 48;
            horizontal = horizontalArrangement;
        } else if (($changed & 48) == 0) {
            horizontal = horizontalArrangement;
            $dirty2 |= $composer3.changed(horizontal) ? 32 : 16;
        } else {
            horizontal = horizontalArrangement;
        }
        int i7 = i & 4;
        if (i7 != 0) {
            $dirty2 |= 384;
        } else if (($changed & 384) == 0) {
            $dirty2 |= $composer3.changed(verticalArrangement) ? 256 : 128;
        }
        int i8 = i & 8;
        if (i8 != 0) {
            $dirty2 |= 3072;
        } else if (($changed & 3072) == 0) {
            $dirty2 |= $composer3.changed(itemVerticalAlignment) ? 2048 : 1024;
        }
        int i9 = i & 16;
        if (i9 != 0) {
            $dirty2 |= 24576;
            maxItemsInEachRow2 = maxItemsInEachRow;
        } else if (($changed & 24576) == 0) {
            maxItemsInEachRow2 = maxItemsInEachRow;
            $dirty2 |= $composer3.changed(maxItemsInEachRow2) ? 16384 : 8192;
        } else {
            maxItemsInEachRow2 = maxItemsInEachRow;
        }
        int i10 = i & 32;
        if (i10 != 0) {
            $dirty2 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            i2 = maxLines;
        } else if ((196608 & $changed) == 0) {
            i2 = maxLines;
            $dirty2 |= $composer3.changed(i2) ? 131072 : 65536;
        } else {
            i2 = maxLines;
        }
        if ((i & 64) != 0) {
            $dirty2 |= JNINativeInterface.JNI_VERSION_24;
        } else if (($changed & JNINativeInterface.JNI_VERSION_24) == 0) {
            $dirty2 |= $composer3.changedInstance(function3) ? 1048576 : 524288;
        }
        if ($composer3.shouldExecute(($dirty2 & 599187) != 599186, $dirty2 & 1)) {
            Modifier modifier4 = i5 != 0 ? Modifier.INSTANCE : modifier2;
            if (i6 != 0) {
                horizontalArrangement3 = Arrangement.INSTANCE.getStart();
                i3 = i8;
            } else {
                i3 = i8;
                horizontalArrangement3 = horizontal;
            }
            Arrangement.Vertical verticalArrangement3 = i7 != 0 ? Arrangement.INSTANCE.getTop() : verticalArrangement;
            if (i3 != 0) {
                itemVerticalAlignment3 = Alignment.INSTANCE.getTop();
                i4 = i9;
            } else {
                i4 = i9;
                itemVerticalAlignment3 = itemVerticalAlignment;
            }
            if (i4 != 0) {
                maxItemsInEachRow2 = Integer.MAX_VALUE;
            }
            int maxLines3 = i10 != 0 ? Integer.MAX_VALUE : i2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2070229740, $dirty2, -1, "androidx.compose.foundation.layout.FlowRow (FlowLayout.kt:161)");
            }
            $composer2 = $composer3;
            FlowRow(modifier4, horizontalArrangement3, verticalArrangement3, itemVerticalAlignment3, maxItemsInEachRow2, maxLines3, FlowRowOverflow.INSTANCE.getClip(), function3, $composer2, ($dirty2 & 14) | JNINativeInterface.JNI_VERSION_24 | ($dirty2 & 112) | ($dirty2 & User32.WM_PENWINFIRST) | ($dirty2 & GL11.GL_RENDER) | (57344 & $dirty2) | (458752 & $dirty2) | (($dirty2 << 3) & 29360128), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            $dirty = $dirty2;
            modifier3 = modifier4;
            horizontalArrangement2 = horizontalArrangement3;
            verticalArrangement2 = verticalArrangement3;
            itemVerticalAlignment2 = itemVerticalAlignment3;
            maxLines2 = maxLines3;
            maxItemsInEachRow3 = maxItemsInEachRow2;
        } else {
            $composer2 = $composer3;
            $composer2.skipToGroupEnd();
            verticalArrangement2 = verticalArrangement;
            $dirty = $dirty2;
            modifier3 = modifier2;
            horizontalArrangement2 = horizontal;
            maxLines2 = i2;
            itemVerticalAlignment2 = itemVerticalAlignment;
            maxItemsInEachRow3 = maxItemsInEachRow2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt.FlowRow.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                    invoke(composer, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer, int i11) {
                    FlowLayoutKt.FlowRow(modifier3, horizontalArrangement2, verticalArrangement2, itemVerticalAlignment2, maxItemsInEachRow3, maxLines2, function3, composer, RecomposeScopeImplKt.updateChangedFlags($changed | 1), i);
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:132:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x035c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:183:0x039e  */
    @kotlin.Deprecated(message = "The overflow parameter has been deprecated")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void FlowColumn(androidx.compose.ui.Modifier r29, androidx.compose.foundation.layout.Arrangement.Vertical r30, androidx.compose.foundation.layout.Arrangement.Horizontal r31, androidx.compose.ui.Alignment.Horizontal r32, int r33, int r34, androidx.compose.foundation.layout.FlowColumnOverflow r35, final kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.FlowColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r36, androidx.compose.runtime.Composer r37, final int r38, final int r39) {
        /*
            Method dump skipped, instructions count: 974
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.layout.FlowLayoutKt.FlowColumn(androidx.compose.ui.Modifier, androidx.compose.foundation.layout.Arrangement$Vertical, androidx.compose.foundation.layout.Arrangement$Horizontal, androidx.compose.ui.Alignment$Horizontal, int, int, androidx.compose.foundation.layout.FlowColumnOverflow, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final void FlowColumn(Modifier modifier, Arrangement.Vertical verticalArrangement, Arrangement.Horizontal horizontalArrangement, Alignment.Horizontal itemHorizontalAlignment, int maxItemsInEachColumn, int maxLines, final Function3<? super FlowColumnScope, ? super Composer, ? super Integer, Unit> function3, Composer $composer, final int $changed, final int i) {
        Modifier modifier2;
        Arrangement.Vertical vertical;
        int maxItemsInEachColumn2;
        int i2;
        Composer $composer2;
        final Arrangement.Horizontal horizontalArrangement2;
        int $dirty;
        final Modifier modifier3;
        final Arrangement.Vertical verticalArrangement2;
        final int maxLines2;
        final Alignment.Horizontal itemHorizontalAlignment2;
        final int maxItemsInEachColumn3;
        int i3;
        Arrangement.Vertical verticalArrangement3;
        int i4;
        Alignment.Horizontal itemHorizontalAlignment3;
        Composer $composer3 = $composer.startRestartGroup(-208106226);
        ComposerKt.sourceInformation($composer3, "C(FlowColumn)P(5,6,1,2,3,4)270@11890L226:FlowLayout.kt#2w3rfo");
        int $dirty2 = $changed;
        int i5 = i & 1;
        if (i5 != 0) {
            $dirty2 |= 6;
            modifier2 = modifier;
        } else if (($changed & 6) == 0) {
            modifier2 = modifier;
            $dirty2 |= $composer3.changed(modifier2) ? 4 : 2;
        } else {
            modifier2 = modifier;
        }
        int i6 = i & 2;
        if (i6 != 0) {
            $dirty2 |= 48;
            vertical = verticalArrangement;
        } else if (($changed & 48) == 0) {
            vertical = verticalArrangement;
            $dirty2 |= $composer3.changed(vertical) ? 32 : 16;
        } else {
            vertical = verticalArrangement;
        }
        int i7 = i & 4;
        if (i7 != 0) {
            $dirty2 |= 384;
        } else if (($changed & 384) == 0) {
            $dirty2 |= $composer3.changed(horizontalArrangement) ? 256 : 128;
        }
        int i8 = i & 8;
        if (i8 != 0) {
            $dirty2 |= 3072;
        } else if (($changed & 3072) == 0) {
            $dirty2 |= $composer3.changed(itemHorizontalAlignment) ? 2048 : 1024;
        }
        int i9 = i & 16;
        if (i9 != 0) {
            $dirty2 |= 24576;
            maxItemsInEachColumn2 = maxItemsInEachColumn;
        } else if (($changed & 24576) == 0) {
            maxItemsInEachColumn2 = maxItemsInEachColumn;
            $dirty2 |= $composer3.changed(maxItemsInEachColumn2) ? 16384 : 8192;
        } else {
            maxItemsInEachColumn2 = maxItemsInEachColumn;
        }
        int i10 = i & 32;
        if (i10 != 0) {
            $dirty2 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            i2 = maxLines;
        } else if ((196608 & $changed) == 0) {
            i2 = maxLines;
            $dirty2 |= $composer3.changed(i2) ? 131072 : 65536;
        } else {
            i2 = maxLines;
        }
        if ((i & 64) != 0) {
            $dirty2 |= JNINativeInterface.JNI_VERSION_24;
        } else if (($changed & JNINativeInterface.JNI_VERSION_24) == 0) {
            $dirty2 |= $composer3.changedInstance(function3) ? 1048576 : 524288;
        }
        if ($composer3.shouldExecute(($dirty2 & 599187) != 599186, $dirty2 & 1)) {
            Modifier modifier4 = i5 != 0 ? Modifier.INSTANCE : modifier2;
            if (i6 != 0) {
                verticalArrangement3 = Arrangement.INSTANCE.getTop();
                i3 = i8;
            } else {
                i3 = i8;
                verticalArrangement3 = vertical;
            }
            Arrangement.Horizontal horizontalArrangement3 = i7 != 0 ? Arrangement.INSTANCE.getStart() : horizontalArrangement;
            if (i3 != 0) {
                itemHorizontalAlignment3 = Alignment.INSTANCE.getStart();
                i4 = i9;
            } else {
                i4 = i9;
                itemHorizontalAlignment3 = itemHorizontalAlignment;
            }
            if (i4 != 0) {
                maxItemsInEachColumn2 = Integer.MAX_VALUE;
            }
            int maxLines3 = i10 != 0 ? Integer.MAX_VALUE : i2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-208106226, $dirty2, -1, "androidx.compose.foundation.layout.FlowColumn (FlowLayout.kt:270)");
            }
            $composer2 = $composer3;
            FlowColumn(modifier4, verticalArrangement3, horizontalArrangement3, itemHorizontalAlignment3, maxItemsInEachColumn2, maxLines3, FlowColumnOverflow.INSTANCE.getClip(), function3, $composer2, ($dirty2 & 14) | JNINativeInterface.JNI_VERSION_24 | ($dirty2 & 112) | ($dirty2 & User32.WM_PENWINFIRST) | ($dirty2 & GL11.GL_RENDER) | (57344 & $dirty2) | (458752 & $dirty2) | (($dirty2 << 3) & 29360128), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            $dirty = $dirty2;
            modifier3 = modifier4;
            verticalArrangement2 = verticalArrangement3;
            horizontalArrangement2 = horizontalArrangement3;
            itemHorizontalAlignment2 = itemHorizontalAlignment3;
            maxLines2 = maxLines3;
            maxItemsInEachColumn3 = maxItemsInEachColumn2;
        } else {
            $composer2 = $composer3;
            $composer2.skipToGroupEnd();
            horizontalArrangement2 = horizontalArrangement;
            $dirty = $dirty2;
            modifier3 = modifier2;
            verticalArrangement2 = vertical;
            maxLines2 = i2;
            itemHorizontalAlignment2 = itemHorizontalAlignment;
            maxItemsInEachColumn3 = maxItemsInEachColumn2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt.FlowColumn.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                    invoke(composer, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer, int i11) {
                    FlowLayoutKt.FlowColumn(modifier3, verticalArrangement2, horizontalArrangement2, itemHorizontalAlignment2, maxItemsInEachColumn3, maxLines2, function3, composer, RecomposeScopeImplKt.updateChangedFlags($changed | 1), i);
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0038 A[PHI: r8
  0x0038: PHI (r8v3 androidx.compose.foundation.layout.Arrangement$Horizontal) = 
  (r8v1 androidx.compose.foundation.layout.Arrangement$Horizontal)
  (r8v4 androidx.compose.foundation.layout.Arrangement$Horizontal)
 binds: [B:12:0x0036, B:8:0x002f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0052 A[PHI: r9
  0x0052: PHI (r9v3 androidx.compose.foundation.layout.Arrangement$Vertical) = 
  (r9v1 androidx.compose.foundation.layout.Arrangement$Vertical)
  (r9v4 androidx.compose.foundation.layout.Arrangement$Vertical)
 binds: [B:22:0x0050, B:18:0x0049] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006d A[PHI: r13
  0x006d: PHI (r13v3 int) = (r13v1 int), (r13v4 int) binds: [B:32:0x006b, B:28:0x0064] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final androidx.compose.ui.layout.MeasurePolicy rowMeasurementHelper(androidx.compose.foundation.layout.Arrangement.Horizontal r19, androidx.compose.foundation.layout.Arrangement.Vertical r20, int r21, androidx.compose.runtime.Composer r22, int r23) {
        /*
            r0 = r22
            r1 = r23
            r2 = 1479255111(0x582ba447, float:7.548882E14)
            java.lang.String r3 = "C(rowMeasurementHelper)P(!1,2)450@17773L923:FlowLayout.kt#2w3rfo"
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r0, r2, r3)
            boolean r3 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r3 == 0) goto L18
            r3 = -1
            java.lang.String r4 = "androidx.compose.foundation.layout.rowMeasurementHelper (FlowLayout.kt:449)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r2, r1, r3, r4)
        L18:
            r2 = -75192171(0xfffffffffb84a895, float:-1.3776049E36)
            java.lang.String r3 = "CC(remember):FlowLayout.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r0, r2, r3)
            r2 = r1 & 14
            r2 = r2 ^ 6
            r3 = 4
            r4 = 0
            r5 = 1
            if (r2 <= r3) goto L32
            r8 = r19
            boolean r2 = r0.changed(r8)
            if (r2 != 0) goto L38
            goto L34
        L32:
            r8 = r19
        L34:
            r2 = r1 & 6
            if (r2 != r3) goto L3a
        L38:
            r2 = r5
            goto L3b
        L3a:
            r2 = r4
        L3b:
            r3 = r1 & 112(0x70, float:1.57E-43)
            r3 = r3 ^ 48
            r6 = 32
            if (r3 <= r6) goto L4c
            r9 = r20
            boolean r3 = r0.changed(r9)
            if (r3 != 0) goto L52
            goto L4e
        L4c:
            r9 = r20
        L4e:
            r3 = r1 & 48
            if (r3 != r6) goto L54
        L52:
            r3 = r5
            goto L55
        L54:
            r3 = r4
        L55:
            r2 = r2 | r3
            r3 = r1 & 896(0x380, float:1.256E-42)
            r3 = r3 ^ 384(0x180, float:5.38E-43)
            r6 = 256(0x100, float:3.59E-43)
            if (r3 <= r6) goto L67
            r13 = r21
            boolean r3 = r0.changed(r13)
            if (r3 != 0) goto L6d
            goto L69
        L67:
            r13 = r21
        L69:
            r3 = r1 & 384(0x180, float:5.38E-43)
            if (r3 != r6) goto L6e
        L6d:
            r4 = r5
        L6e:
            r2 = r2 | r4
            r3 = r22
            r4 = 0
            java.lang.Object r5 = r3.rememberedValue()
            r17 = 0
            if (r2 != 0) goto L85
            androidx.compose.runtime.Composer$Companion r6 = androidx.compose.runtime.Composer.INSTANCE
            java.lang.Object r6 = r6.getEmpty()
            if (r5 != r6) goto L84
            goto L85
        L84:
            goto Lbf
        L85:
            r18 = 0
            float r10 = r8.getSpacing()
            androidx.compose.foundation.layout.CrossAxisAlignment r11 = androidx.compose.foundation.layout.FlowLayoutKt.CROSS_AXIS_ALIGNMENT_TOP
            float r12 = r9.getSpacing()
            androidx.compose.foundation.layout.FlowRowOverflow$Companion r6 = androidx.compose.foundation.layout.FlowRowOverflow.INSTANCE
            androidx.compose.foundation.layout.FlowRowOverflow r6 = r6.getVisible()
            androidx.compose.foundation.layout.FlowLayoutOverflowState r15 = r6.createOverflowState$foundation_layout_release()
            androidx.compose.foundation.layout.FlowMeasurePolicy r6 = new androidx.compose.foundation.layout.FlowMeasurePolicy
            r7 = 1
            r14 = 2147483647(0x7fffffff, float:NaN)
            r16 = 0
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            androidx.compose.ui.layout.MultiContentMeasurePolicy r6 = (androidx.compose.ui.layout.MultiContentMeasurePolicy) r6
            androidx.compose.foundation.layout.FlowLayoutKt$rowMeasurementHelper$1$1 r7 = new androidx.compose.foundation.layout.FlowLayoutKt$rowMeasurementHelper$1$1
            r7.<init>()
            androidx.compose.ui.layout.MeasurePolicy r7 = (androidx.compose.ui.layout.MeasurePolicy) r7
            r3.updateRememberedValue(r7)
            r5 = r7
        Lbf:
            androidx.compose.ui.layout.MeasurePolicy r5 = (androidx.compose.ui.layout.MeasurePolicy) r5
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r0)
            boolean r2 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r2 == 0) goto Lce
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        Lce:
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.layout.FlowLayoutKt.rowMeasurementHelper(androidx.compose.foundation.layout.Arrangement$Horizontal, androidx.compose.foundation.layout.Arrangement$Vertical, int, androidx.compose.runtime.Composer, int):androidx.compose.ui.layout.MeasurePolicy");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003a A[PHI: r9
  0x003a: PHI (r9v3 androidx.compose.foundation.layout.Arrangement$Horizontal) = 
  (r9v1 androidx.compose.foundation.layout.Arrangement$Horizontal)
  (r9v4 androidx.compose.foundation.layout.Arrangement$Horizontal)
 binds: [B:12:0x0038, B:8:0x0031] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0054 A[PHI: r10
  0x0054: PHI (r10v3 androidx.compose.foundation.layout.Arrangement$Vertical) = 
  (r10v1 androidx.compose.foundation.layout.Arrangement$Vertical)
  (r10v4 androidx.compose.foundation.layout.Arrangement$Vertical)
 binds: [B:22:0x0052, B:18:0x004b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0085 A[PHI: r14
  0x0085: PHI (r14v3 int) = (r14v1 int), (r14v4 int) binds: [B:40:0x0083, B:36:0x007c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a2 A[PHI: r15
  0x00a2: PHI (r15v3 int) = (r15v1 int), (r15v4 int) binds: [B:50:0x00a0, B:46:0x0099] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00fd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final androidx.compose.ui.layout.MultiContentMeasurePolicy rowMeasurementMultiContentHelper(androidx.compose.foundation.layout.Arrangement.Horizontal r21, androidx.compose.foundation.layout.Arrangement.Vertical r22, androidx.compose.ui.Alignment.Vertical r23, int r24, int r25, androidx.compose.foundation.layout.FlowLayoutOverflowState r26, androidx.compose.runtime.Composer r27, int r28) {
        /*
            Method dump skipped, instructions count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.layout.FlowLayoutKt.rowMeasurementMultiContentHelper(androidx.compose.foundation.layout.Arrangement$Horizontal, androidx.compose.foundation.layout.Arrangement$Vertical, androidx.compose.ui.Alignment$Vertical, int, int, androidx.compose.foundation.layout.FlowLayoutOverflowState, androidx.compose.runtime.Composer, int):androidx.compose.ui.layout.MultiContentMeasurePolicy");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0038 A[PHI: r9
  0x0038: PHI (r9v3 androidx.compose.foundation.layout.Arrangement$Vertical) = 
  (r9v1 androidx.compose.foundation.layout.Arrangement$Vertical)
  (r9v4 androidx.compose.foundation.layout.Arrangement$Vertical)
 binds: [B:12:0x0036, B:8:0x002f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0052 A[PHI: r8
  0x0052: PHI (r8v3 androidx.compose.foundation.layout.Arrangement$Horizontal) = 
  (r8v1 androidx.compose.foundation.layout.Arrangement$Horizontal)
  (r8v4 androidx.compose.foundation.layout.Arrangement$Horizontal)
 binds: [B:22:0x0050, B:18:0x0049] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006d A[PHI: r13
  0x006d: PHI (r13v3 int) = (r13v1 int), (r13v4 int) binds: [B:32:0x006b, B:28:0x0064] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final androidx.compose.ui.layout.MeasurePolicy columnMeasurementHelper(androidx.compose.foundation.layout.Arrangement.Vertical r19, androidx.compose.foundation.layout.Arrangement.Horizontal r20, int r21, androidx.compose.runtime.Composer r22, int r23) {
        /*
            r0 = r22
            r1 = r23
            r2 = -2013098357(0xffffffff88028e8b, float:-3.928801E-34)
            java.lang.String r3 = "C(columnMeasurementHelper)P(2)515@20043L880:FlowLayout.kt#2w3rfo"
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r0, r2, r3)
            boolean r3 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r3 == 0) goto L18
            r3 = -1
            java.lang.String r4 = "androidx.compose.foundation.layout.columnMeasurementHelper (FlowLayout.kt:514)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r2, r1, r3, r4)
        L18:
            r2 = 1838024154(0x6d8e05da, float:5.494243E27)
            java.lang.String r3 = "CC(remember):FlowLayout.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r0, r2, r3)
            r2 = r1 & 14
            r2 = r2 ^ 6
            r3 = 4
            r4 = 0
            r5 = 1
            if (r2 <= r3) goto L32
            r9 = r19
            boolean r2 = r0.changed(r9)
            if (r2 != 0) goto L38
            goto L34
        L32:
            r9 = r19
        L34:
            r2 = r1 & 6
            if (r2 != r3) goto L3a
        L38:
            r2 = r5
            goto L3b
        L3a:
            r2 = r4
        L3b:
            r3 = r1 & 112(0x70, float:1.57E-43)
            r3 = r3 ^ 48
            r6 = 32
            if (r3 <= r6) goto L4c
            r8 = r20
            boolean r3 = r0.changed(r8)
            if (r3 != 0) goto L52
            goto L4e
        L4c:
            r8 = r20
        L4e:
            r3 = r1 & 48
            if (r3 != r6) goto L54
        L52:
            r3 = r5
            goto L55
        L54:
            r3 = r4
        L55:
            r2 = r2 | r3
            r3 = r1 & 896(0x380, float:1.256E-42)
            r3 = r3 ^ 384(0x180, float:5.38E-43)
            r6 = 256(0x100, float:3.59E-43)
            if (r3 <= r6) goto L67
            r13 = r21
            boolean r3 = r0.changed(r13)
            if (r3 != 0) goto L6d
            goto L69
        L67:
            r13 = r21
        L69:
            r3 = r1 & 384(0x180, float:5.38E-43)
            if (r3 != r6) goto L6e
        L6d:
            r4 = r5
        L6e:
            r2 = r2 | r4
            r3 = r22
            r4 = 0
            java.lang.Object r5 = r3.rememberedValue()
            r17 = 0
            if (r2 != 0) goto L85
            androidx.compose.runtime.Composer$Companion r6 = androidx.compose.runtime.Composer.INSTANCE
            java.lang.Object r6 = r6.getEmpty()
            if (r5 != r6) goto L84
            goto L85
        L84:
            goto Lbd
        L85:
            r18 = 0
            float r10 = r9.getSpacing()
            androidx.compose.foundation.layout.CrossAxisAlignment r11 = androidx.compose.foundation.layout.FlowLayoutKt.CROSS_AXIS_ALIGNMENT_START
            float r12 = r8.getSpacing()
            androidx.compose.foundation.layout.FlowRowOverflow$Companion r6 = androidx.compose.foundation.layout.FlowRowOverflow.INSTANCE
            androidx.compose.foundation.layout.FlowRowOverflow r6 = r6.getVisible()
            androidx.compose.foundation.layout.FlowLayoutOverflowState r15 = r6.createOverflowState$foundation_layout_release()
            androidx.compose.foundation.layout.FlowMeasurePolicy r6 = new androidx.compose.foundation.layout.FlowMeasurePolicy
            r7 = 0
            r14 = 2147483647(0x7fffffff, float:NaN)
            r16 = 0
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            androidx.compose.foundation.layout.FlowLayoutKt$columnMeasurementHelper$1$1 r7 = new androidx.compose.foundation.layout.FlowLayoutKt$columnMeasurementHelper$1$1
            r7.<init>()
            androidx.compose.ui.layout.MeasurePolicy r7 = (androidx.compose.ui.layout.MeasurePolicy) r7
            r3.updateRememberedValue(r7)
            r5 = r7
        Lbd:
            androidx.compose.ui.layout.MeasurePolicy r5 = (androidx.compose.ui.layout.MeasurePolicy) r5
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r0)
            boolean r2 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r2 == 0) goto Lcc
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        Lcc:
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.layout.FlowLayoutKt.columnMeasurementHelper(androidx.compose.foundation.layout.Arrangement$Vertical, androidx.compose.foundation.layout.Arrangement$Horizontal, int, androidx.compose.runtime.Composer, int):androidx.compose.ui.layout.MeasurePolicy");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003a A[PHI: r10
  0x003a: PHI (r10v3 androidx.compose.foundation.layout.Arrangement$Vertical) = 
  (r10v1 androidx.compose.foundation.layout.Arrangement$Vertical)
  (r10v4 androidx.compose.foundation.layout.Arrangement$Vertical)
 binds: [B:12:0x0038, B:8:0x0031] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0054 A[PHI: r9
  0x0054: PHI (r9v3 androidx.compose.foundation.layout.Arrangement$Horizontal) = 
  (r9v1 androidx.compose.foundation.layout.Arrangement$Horizontal)
  (r9v4 androidx.compose.foundation.layout.Arrangement$Horizontal)
 binds: [B:22:0x0052, B:18:0x004b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0085 A[PHI: r14
  0x0085: PHI (r14v3 int) = (r14v1 int), (r14v4 int) binds: [B:40:0x0083, B:36:0x007c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a2 A[PHI: r15
  0x00a2: PHI (r15v3 int) = (r15v1 int), (r15v4 int) binds: [B:50:0x00a0, B:46:0x0099] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00fd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final androidx.compose.ui.layout.MultiContentMeasurePolicy columnMeasurementMultiContentHelper(androidx.compose.foundation.layout.Arrangement.Vertical r21, androidx.compose.foundation.layout.Arrangement.Horizontal r22, androidx.compose.ui.Alignment.Horizontal r23, int r24, int r25, androidx.compose.foundation.layout.FlowLayoutOverflowState r26, androidx.compose.runtime.Composer r27, int r28) {
        /*
            Method dump skipped, instructions count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.layout.FlowLayoutKt.columnMeasurementMultiContentHelper(androidx.compose.foundation.layout.Arrangement$Vertical, androidx.compose.foundation.layout.Arrangement$Horizontal, androidx.compose.ui.Alignment$Horizontal, int, int, androidx.compose.foundation.layout.FlowLayoutOverflowState, androidx.compose.runtime.Composer, int):androidx.compose.ui.layout.MultiContentMeasurePolicy");
    }

    private static final int maxIntrinsicMainAxisSize(List<? extends IntrinsicMeasurable> list, Function3<? super IntrinsicMeasurable, ? super Integer, ? super Integer, Integer> function3, int crossAxisAvailable, int mainAxisSpacing, int maxItemsInMainAxis) {
        int $i$f$maxIntrinsicMainAxisSize;
        int $i$f$maxIntrinsicMainAxisSize2 = 0;
        int fixedSpace = 0;
        int currentFixedSpace = 0;
        int lastBreak = 0;
        int index$iv = 0;
        int size = list.size();
        while (index$iv < size) {
            Object item$iv = list.get(index$iv);
            IntrinsicMeasurable child = (IntrinsicMeasurable) item$iv;
            int index = index$iv;
            int size2 = function3.invoke(child, Integer.valueOf(index), Integer.valueOf(crossAxisAvailable)).intValue() + mainAxisSpacing;
            if ((index + 1) - lastBreak == maxItemsInMainAxis) {
                $i$f$maxIntrinsicMainAxisSize = $i$f$maxIntrinsicMainAxisSize2;
            } else {
                int i = index + 1;
                $i$f$maxIntrinsicMainAxisSize = $i$f$maxIntrinsicMainAxisSize2;
                int $i$f$maxIntrinsicMainAxisSize3 = list.size();
                if (i != $i$f$maxIntrinsicMainAxisSize3) {
                    currentFixedSpace += size2;
                }
                index$iv++;
                $i$f$maxIntrinsicMainAxisSize2 = $i$f$maxIntrinsicMainAxisSize;
            }
            fixedSpace = Math.max(fixedSpace, (currentFixedSpace + size2) - mainAxisSpacing);
            currentFixedSpace = 0;
            lastBreak = index;
            index$iv++;
            $i$f$maxIntrinsicMainAxisSize2 = $i$f$maxIntrinsicMainAxisSize;
        }
        return fixedSpace;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [kotlin.collections.IntIterator] */
    /* JADX WARN: Type inference failed for: r0v3, types: [kotlin.collections.IntIterator] */
    private static final int minIntrinsicMainAxisSize(List<? extends IntrinsicMeasurable> list, Function3<? super IntrinsicMeasurable, ? super Integer, ? super Integer, Integer> function3, Function3<? super IntrinsicMeasurable, ? super Integer, ? super Integer, Integer> function32, int crossAxisAvailable, int mainAxisSpacing, int crossAxisSpacing, int maxItemsInMainAxis, int maxLines, FlowLayoutOverflowState overflow) {
        int i = maxItemsInMainAxis;
        int i2 = maxLines;
        int high = 0;
        if (list.isEmpty()) {
            return 0;
        }
        int[] mainAxisSizes = new int[list.size()];
        int[] crossAxisSizes = new int[list.size()];
        int size = list.size();
        for (int index = 0; index < size; index++) {
            IntrinsicMeasurable child = list.get(index);
            int mainAxisItemSize = function3.invoke(child, Integer.valueOf(index), Integer.valueOf(crossAxisAvailable)).intValue();
            mainAxisSizes[index] = mainAxisItemSize;
            crossAxisSizes[index] = function32.invoke(child, Integer.valueOf(index), Integer.valueOf(mainAxisItemSize)).intValue();
        }
        int maxItemsThatCanBeShown = Integer.MAX_VALUE;
        if (i2 != Integer.MAX_VALUE && i != Integer.MAX_VALUE) {
            maxItemsThatCanBeShown = i * i2;
        }
        boolean mustHaveEllipsis = (maxItemsThatCanBeShown >= list.size() || !(overflow.getType$foundation_layout_release() == FlowLayoutOverflow.OverflowType.ExpandIndicator || overflow.getType$foundation_layout_release() == FlowLayoutOverflow.OverflowType.ExpandOrCollapseIndicator)) ? maxItemsThatCanBeShown >= list.size() && i2 >= overflow.getMinLinesToShowCollapse$foundation_layout_release() && overflow.getType$foundation_layout_release() == FlowLayoutOverflow.OverflowType.ExpandOrCollapseIndicator : true;
        int maxItemsThatCanBeShown2 = Math.min(maxItemsThatCanBeShown - (mustHaveEllipsis ? 1 : 0), list.size());
        int $this$minIntrinsicMainAxisSize_u24lambda_u249 = ArraysKt.sum(mainAxisSizes);
        int maxMainAxisSize = ((list.size() - 1) * mainAxisSpacing) + $this$minIntrinsicMainAxisSize_u24lambda_u249;
        int mainAxisUsed = maxMainAxisSize;
        if (crossAxisSizes.length == 0) {
            throw new NoSuchElementException();
        }
        int crossAxisUsed = crossAxisSizes[0];
        ?? it = new IntRange(1, ArraysKt.getLastIndex(crossAxisSizes)).iterator();
        while (it.hasNext()) {
            int it2 = crossAxisSizes[it.nextInt()];
            if (crossAxisUsed < it2) {
                crossAxisUsed = it2;
            }
        }
        if (mainAxisSizes.length == 0) {
            throw new NoSuchElementException();
        }
        int it3 = mainAxisSizes[0];
        ?? it4 = new IntRange(1, ArraysKt.getLastIndex(mainAxisSizes)).iterator();
        int i3 = it3;
        while (it4.hasNext()) {
            int it5 = mainAxisSizes[it4.nextInt()];
            if (i3 < it5) {
                i3 = it5;
            }
        }
        int minimumItemSize = i3;
        int itemShown = minimumItemSize;
        int high2 = maxMainAxisSize;
        while (itemShown <= high2) {
            if (crossAxisUsed == crossAxisAvailable) {
                return mainAxisUsed;
            }
            int mid = (itemShown + high2) / 2;
            int high3 = high2;
            int[] crossAxisSizes2 = crossAxisSizes;
            int low = itemShown;
            int $i$f$minIntrinsicMainAxisSize = high;
            long pair = intrinsicCrossAxisSize(list, mainAxisSizes, crossAxisSizes2, mid, mainAxisSpacing, crossAxisSpacing, i, i2, overflow);
            crossAxisUsed = IntIntPair.m30getFirstimpl(pair);
            int itemShown2 = IntIntPair.m31getSecondimpl(pair);
            if (crossAxisUsed > crossAxisAvailable || itemShown2 < maxItemsThatCanBeShown2) {
                int low2 = mid + 1;
                if (low2 > high3) {
                    return low2;
                }
                i = maxItemsInMainAxis;
                i2 = maxLines;
                itemShown = low2;
                mainAxisUsed = mid;
                crossAxisSizes = crossAxisSizes2;
                high2 = high3;
                high = $i$f$minIntrinsicMainAxisSize;
            } else {
                if (crossAxisUsed >= crossAxisAvailable) {
                    return mid;
                }
                crossAxisSizes = crossAxisSizes2;
                high2 = mid - 1;
                mainAxisUsed = mid;
                i = maxItemsInMainAxis;
                i2 = maxLines;
                itemShown = low;
                high = $i$f$minIntrinsicMainAxisSize;
            }
        }
        return mainAxisUsed;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long intrinsicCrossAxisSize(List<? extends IntrinsicMeasurable> list, int[] mainAxisSizes, int[] crossAxisSizes, int mainAxisAvailable, int mainAxisSpacing, int crossAxisSpacing, int maxItemsInMainAxis, int maxLines, FlowLayoutOverflowState overflow) {
        IntIntPair intIntPairM23boximpl;
        List<? extends IntrinsicMeasurable> list2 = list;
        int $i$f$intrinsicCrossAxisSize = 0;
        if (list2.isEmpty()) {
            return IntIntPair.m26constructorimpl(0, 0);
        }
        FlowLayoutBuildingBlocks buildingBlocks$iv = new FlowLayoutBuildingBlocks(maxItemsInMainAxis, overflow, OrientationIndependentConstraints.m705constructorimpl(0, mainAxisAvailable, 0, Integer.MAX_VALUE), maxLines, mainAxisSpacing, crossAxisSpacing, null);
        IntrinsicMeasurable nextChild$iv = (IntrinsicMeasurable) CollectionsKt.getOrNull(list2, 0);
        int index = nextChild$iv != null ? crossAxisSizes[0] : 0;
        int index2 = nextChild$iv != null ? mainAxisSizes[0] : 0;
        int childCrossAxisSize$iv = index2;
        int nextCrossAxisSize$iv = index;
        if (!buildingBlocks$iv.m660getWrapInfoOpUlnko(list2.size() > 1, 0, IntIntPair.m26constructorimpl(mainAxisAvailable, Integer.MAX_VALUE), nextChild$iv == null ? null : IntIntPair.m23boximpl(IntIntPair.m26constructorimpl(index2, index)), 0, 0, 0, false, false).getIsLastItemInContainer()) {
            int size = list2.size();
            int currentCrossAxisSize$iv = 0;
            int currentCrossAxisSize$iv2 = 0;
            int totalCrossAxisSize$iv = 0;
            int lineIndex$iv = 0;
            int noOfItemsShown$iv = 0;
            int remaining$iv = mainAxisAvailable;
            int lastBreak$iv = 0;
            int nextCrossAxisSize$iv2 = nextCrossAxisSize$iv;
            while (true) {
                if (lineIndex$iv >= size) {
                    break;
                }
                int childCrossAxisSize$iv2 = nextCrossAxisSize$iv2;
                int childMainAxisSize$iv = childCrossAxisSize$iv;
                int remaining$iv2 = remaining$iv - childMainAxisSize$iv;
                int noOfItemsShown$iv2 = lineIndex$iv + 1;
                int index$iv = lineIndex$iv;
                int index$iv2 = totalCrossAxisSize$iv;
                int lineIndex$iv2 = currentCrossAxisSize$iv2;
                int currentCrossAxisSize$iv3 = Math.max(currentCrossAxisSize$iv, childCrossAxisSize$iv2);
                int currentCrossAxisSize$iv4 = index$iv + 1;
                IntrinsicMeasurable nextChild$iv2 = (IntrinsicMeasurable) CollectionsKt.getOrNull(list2, currentCrossAxisSize$iv4);
                int nextCrossAxisSize$iv3 = nextChild$iv2 != null ? crossAxisSizes[index$iv + 1] : size$iv;
                int index3 = nextChild$iv2 != null ? mainAxisSizes[index$iv + 1] + mainAxisSpacing : size$iv;
                boolean z = index$iv + 2 < list2.size();
                int nextCrossAxisSize$iv4 = (index$iv + 1) - lastBreak$iv;
                int $i$f$intrinsicCrossAxisSize2 = $i$f$intrinsicCrossAxisSize;
                long jM26constructorimpl = IntIntPair.m26constructorimpl(remaining$iv2, Integer.MAX_VALUE);
                if (nextChild$iv2 == null) {
                    intIntPairM23boximpl = null;
                } else {
                    intIntPairM23boximpl = IntIntPair.m23boximpl(IntIntPair.m26constructorimpl(index3, nextCrossAxisSize$iv3));
                }
                int nextMainAxisSize$iv = index3;
                int remaining$iv3 = size;
                FlowLayoutBuildingBlocks.WrapInfo wrapInfo$iv = buildingBlocks$iv.m660getWrapInfoOpUlnko(z, nextCrossAxisSize$iv4, jM26constructorimpl, intIntPairM23boximpl, index$iv2, lineIndex$iv2, currentCrossAxisSize$iv3, false, false);
                if (!wrapInfo$iv.getIsLastItemInLine()) {
                    remaining$iv = remaining$iv2;
                    currentCrossAxisSize$iv = currentCrossAxisSize$iv3;
                    childCrossAxisSize$iv = nextMainAxisSize$iv;
                    currentCrossAxisSize$iv2 = lineIndex$iv2;
                    totalCrossAxisSize$iv = index$iv2;
                } else {
                    int totalCrossAxisSize$iv2 = lineIndex$iv2 + currentCrossAxisSize$iv3 + crossAxisSpacing;
                    int lineIndex$iv3 = (index$iv + 1) - lastBreak$iv;
                    FlowLayoutBuildingBlocks.WrapEllipsisInfo ellipsisWrapInfo$iv = buildingBlocks$iv.getWrapEllipsisInfo(wrapInfo$iv, nextChild$iv2 != null, index$iv2, totalCrossAxisSize$iv2, remaining$iv2, lineIndex$iv3);
                    currentCrossAxisSize$iv = 0;
                    remaining$iv = mainAxisAvailable;
                    lastBreak$iv = index$iv + 1;
                    int nextMainAxisSize$iv2 = nextMainAxisSize$iv - mainAxisSpacing;
                    totalCrossAxisSize$iv = index$iv2 + 1;
                    if (!wrapInfo$iv.getIsLastItemInContainer()) {
                        childCrossAxisSize$iv = nextMainAxisSize$iv2;
                        currentCrossAxisSize$iv2 = totalCrossAxisSize$iv2;
                    } else {
                        if (ellipsisWrapInfo$iv != null) {
                            long it$iv = ellipsisWrapInfo$iv.getEllipsisSize();
                            if (!ellipsisWrapInfo$iv.getPlaceEllipsisOnLastContentLine()) {
                                totalCrossAxisSize$iv2 += IntIntPair.m31getSecondimpl(it$iv) + crossAxisSpacing;
                            }
                        }
                        currentCrossAxisSize$iv2 = totalCrossAxisSize$iv2;
                        noOfItemsShown$iv = noOfItemsShown$iv2;
                    }
                }
                lineIndex$iv = index$iv + 1;
                size = remaining$iv3;
                noOfItemsShown$iv = noOfItemsShown$iv2;
                $i$f$intrinsicCrossAxisSize = $i$f$intrinsicCrossAxisSize2;
                list2 = list;
                nextCrossAxisSize$iv2 = nextCrossAxisSize$iv3;
                size$iv = 0;
            }
            int totalCrossAxisSize$iv3 = currentCrossAxisSize$iv2 - crossAxisSpacing;
            return IntIntPair.m26constructorimpl(totalCrossAxisSize$iv3, noOfItemsShown$iv);
        }
        IntIntPair intIntPairM665ellipsisSizeF35zmw$foundation_layout_release = overflow.m665ellipsisSizeF35zmw$foundation_layout_release(nextChild$iv != null, 0, 0);
        size$iv = intIntPairM665ellipsisSizeF35zmw$foundation_layout_release != null ? IntIntPair.m31getSecondimpl(intIntPairM665ellipsisSizeF35zmw$foundation_layout_release.getPackedValue()) : 0;
        return IntIntPair.m26constructorimpl(size$iv, 0);
    }

    private static final long intrinsicCrossAxisSize(List<? extends IntrinsicMeasurable> list, Function3<? super IntrinsicMeasurable, ? super Integer, ? super Integer, Integer> function3, Function3<? super IntrinsicMeasurable, ? super Integer, ? super Integer, Integer> function32, int mainAxisAvailable, int mainAxisSpacing, int crossAxisSpacing, int maxItemsInMainAxis, int maxLines, FlowLayoutOverflowState overflow) {
        IntIntPair intIntPairM23boximpl;
        int remaining;
        List<? extends IntrinsicMeasurable> list2 = list;
        Function3<? super IntrinsicMeasurable, ? super Integer, ? super Integer, Integer> function33 = function3;
        if (list2.isEmpty()) {
            return IntIntPair.m26constructorimpl(0, 0);
        }
        FlowLayoutBuildingBlocks buildingBlocks = new FlowLayoutBuildingBlocks(maxItemsInMainAxis, overflow, OrientationIndependentConstraints.m705constructorimpl(0, mainAxisAvailable, 0, Integer.MAX_VALUE), maxLines, mainAxisSpacing, crossAxisSpacing, null);
        IntrinsicMeasurable nextChild = (IntrinsicMeasurable) CollectionsKt.getOrNull(list2, 0);
        int nextCrossAxisSize = nextChild != null ? function32.invoke(nextChild, 0, Integer.valueOf(mainAxisAvailable)).intValue() : 0;
        int nextMainAxisSize = nextChild != null ? function33.invoke(nextChild, 0, Integer.valueOf(nextCrossAxisSize)).intValue() : 0;
        int totalCrossAxisSize = 0;
        int lineIndex = 0;
        int noOfItemsShown = mainAxisAvailable;
        int nextCrossAxisSize2 = nextCrossAxisSize;
        if (buildingBlocks.m660getWrapInfoOpUlnko(list2.size() > 1, 0, IntIntPair.m26constructorimpl(mainAxisAvailable, Integer.MAX_VALUE), nextChild == null ? null : IntIntPair.m23boximpl(IntIntPair.m26constructorimpl(nextMainAxisSize, nextCrossAxisSize)), 0, 0, 0, false, false).getIsLastItemInContainer()) {
            IntIntPair intIntPairM665ellipsisSizeF35zmw$foundation_layout_release = overflow.m665ellipsisSizeF35zmw$foundation_layout_release(nextChild != null, 0, 0);
            int size = intIntPairM665ellipsisSizeF35zmw$foundation_layout_release != null ? IntIntPair.m31getSecondimpl(intIntPairM665ellipsisSizeF35zmw$foundation_layout_release.getPackedValue()) : 0;
            return IntIntPair.m26constructorimpl(size, 0);
        }
        int noOfItemsShown2 = 0;
        int index = 0;
        int size2 = list2.size();
        int nextMainAxisSize2 = 0;
        int lastBreak = 0;
        int nextCrossAxisSize3 = nextCrossAxisSize2;
        while (true) {
            if (index >= size2) {
                break;
            }
            int childCrossAxisSize = nextCrossAxisSize3;
            int childMainAxisSize = nextMainAxisSize;
            int remaining2 = noOfItemsShown - childMainAxisSize;
            int remaining3 = index + 1;
            int currentCrossAxisSize = Math.max(nextMainAxisSize2, childCrossAxisSize);
            IntrinsicMeasurable nextChild2 = (IntrinsicMeasurable) CollectionsKt.getOrNull(list2, index + 1);
            int nextCrossAxisSize4 = nextChild2 != null ? function32.invoke(nextChild2, Integer.valueOf(index + 1), Integer.valueOf(mainAxisAvailable)).intValue() : 0;
            int nextMainAxisSize3 = nextChild2 != null ? function33.invoke(nextChild2, Integer.valueOf(index + 1), Integer.valueOf(nextCrossAxisSize4)).intValue() + mainAxisSpacing : 0;
            boolean z = index + 2 < list.size();
            int i = (index + 1) - lastBreak;
            int index2 = index;
            long jM26constructorimpl = IntIntPair.m26constructorimpl(remaining2, Integer.MAX_VALUE);
            if (nextChild2 == null) {
                intIntPairM23boximpl = null;
            } else {
                intIntPairM23boximpl = IntIntPair.m23boximpl(IntIntPair.m26constructorimpl(nextMainAxisSize3, nextCrossAxisSize4));
            }
            IntIntPair intIntPair = intIntPairM23boximpl;
            int i2 = size2;
            FlowLayoutBuildingBlocks.WrapInfo wrapInfo = buildingBlocks.m660getWrapInfoOpUlnko(z, i, jM26constructorimpl, intIntPair, lineIndex, totalCrossAxisSize, currentCrossAxisSize, false, false);
            int lineIndex2 = lineIndex;
            if (!wrapInfo.getIsLastItemInLine()) {
                lineIndex = lineIndex2;
                nextMainAxisSize = nextMainAxisSize3;
                remaining = remaining2;
                nextMainAxisSize2 = currentCrossAxisSize;
            } else {
                int totalCrossAxisSize2 = totalCrossAxisSize + currentCrossAxisSize + crossAxisSpacing;
                FlowLayoutBuildingBlocks.WrapEllipsisInfo ellipsisWrapInfo = buildingBlocks.getWrapEllipsisInfo(wrapInfo, nextChild2 != null, lineIndex2, totalCrossAxisSize2, remaining2, (index2 + 1) - lastBreak);
                remaining = mainAxisAvailable;
                lastBreak = index2 + 1;
                int nextMainAxisSize4 = nextMainAxisSize3 - mainAxisSpacing;
                lineIndex = lineIndex2 + 1;
                if (!wrapInfo.getIsLastItemInContainer()) {
                    nextMainAxisSize = nextMainAxisSize4;
                    nextMainAxisSize2 = 0;
                    totalCrossAxisSize = totalCrossAxisSize2;
                } else {
                    if (ellipsisWrapInfo != null) {
                        long it = ellipsisWrapInfo.getEllipsisSize();
                        if (!ellipsisWrapInfo.getPlaceEllipsisOnLastContentLine()) {
                            totalCrossAxisSize2 += IntIntPair.m31getSecondimpl(it) + crossAxisSpacing;
                        }
                    }
                    totalCrossAxisSize = totalCrossAxisSize2;
                    noOfItemsShown2 = remaining3;
                }
            }
            index = index2 + 1;
            noOfItemsShown2 = remaining3;
            size2 = i2;
            function33 = function3;
            nextCrossAxisSize3 = nextCrossAxisSize4;
            noOfItemsShown = remaining;
            list2 = list;
        }
        return IntIntPair.m26constructorimpl(totalCrossAxisSize - crossAxisSpacing, noOfItemsShown2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: breakDownItems-di9J0FM, reason: not valid java name */
    public static final MeasureResult m662breakDownItemsdi9J0FM(MeasureScope measureScope, FlowLineMeasurePolicy flowLineMeasurePolicy, Iterator<? extends Measurable> it, float f, float f2, long j, int i, int i2, FlowLayoutOverflowState flowLayoutOverflowState) {
        int i3;
        int i4;
        int i5;
        FlowLineInfo flowLineInfo;
        int i6;
        final Ref.ObjectRef objectRef;
        Measurable measurable;
        IntIntPair intIntPairM23boximpl;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        IntIntPair intIntPairM23boximpl2;
        MutableIntList mutableIntList;
        FlowLineInfo flowLineInfo2;
        MutableIntList mutableIntList2;
        int i14;
        int i15;
        MeasureScope measureScope2 = measureScope;
        MutableVector mutableVector = new MutableVector(new MeasureResult[16], 0);
        int iM6971getMaxWidthimpl = Constraints.m6971getMaxWidthimpl(j);
        int iM6973getMinWidthimpl = Constraints.m6973getMinWidthimpl(j);
        int iM6970getMaxHeightimpl = Constraints.m6970getMaxHeightimpl(j);
        MutableIntObjectMap mutableIntObjectMapMutableIntObjectMapOf = IntObjectMapKt.mutableIntObjectMapOf();
        ArrayList arrayList = new ArrayList();
        int iCeil = (int) Math.ceil(measureScope2.mo389toPx0680j_4(f));
        int iCeil2 = (int) Math.ceil(measureScope2.mo389toPx0680j_4(f2));
        long jM705constructorimpl = OrientationIndependentConstraints.m705constructorimpl(0, iM6971getMaxWidthimpl, 0, iM6970getMaxHeightimpl);
        long jM720toBoxConstraintsOenEA2s = OrientationIndependentConstraints.m720toBoxConstraintsOenEA2s(OrientationIndependentConstraints.m708copyyUG9Ft0(jM705constructorimpl, (10 & 1) != 0 ? Constraints.m6973getMinWidthimpl(jM705constructorimpl) : 0, (10 & 2) != 0 ? Constraints.m6971getMaxWidthimpl(jM705constructorimpl) : 0, (10 & 4) != 0 ? Constraints.m6972getMinHeightimpl(jM705constructorimpl) : 0, (10 & 8) != 0 ? Constraints.m6970getMaxHeightimpl(jM705constructorimpl) : 0), flowLineMeasurePolicy.isHorizontal() ? LayoutOrientation.Horizontal : LayoutOrientation.Vertical);
        Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        if (it instanceof ContextualFlowItemIterator) {
            i3 = iM6971getMaxWidthimpl;
            i4 = iM6970getMaxHeightimpl;
            flowLineInfo = new FlowLineInfo(0, 0, measureScope2.mo386toDpu2uoSUM(i3), measureScope2.mo386toDpu2uoSUM(i4), null);
            i5 = 0;
        } else {
            i3 = iM6971getMaxWidthimpl;
            i4 = iM6970getMaxHeightimpl;
            i5 = 0;
            flowLineInfo = null;
        }
        MutableVector mutableVector2 = mutableVector;
        FlowLineInfo flowLineInfo3 = flowLineInfo;
        Measurable measurableSafeNext = !it.hasNext() ? null : safeNext(it, flowLineInfo3);
        if (measurableSafeNext != null) {
            i6 = iCeil;
            objectRef = objectRef2;
            measurable = measurableSafeNext;
            intIntPairM23boximpl = IntIntPair.m23boximpl(m663measureAndCacherqJ1uqs(measurable, flowLineMeasurePolicy, jM720toBoxConstraintsOenEA2s, new Function1<Placeable, Unit>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$breakDownItems$nextSize$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Placeable placeable) {
                    invoke2(placeable);
                    return Unit.INSTANCE;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Placeable placeable) {
                    objectRef.element = placeable;
                }
            }));
        } else {
            i6 = iCeil;
            objectRef = objectRef2;
            measurable = measurableSafeNext;
            intIntPairM23boximpl = null;
        }
        IntIntPair intIntPair = intIntPairM23boximpl;
        Integer numValueOf = intIntPair != null ? Integer.valueOf(IntIntPair.m30getFirstimpl(intIntPair.getPackedValue())) : null;
        Integer numValueOf2 = intIntPair != null ? Integer.valueOf(IntIntPair.m31getSecondimpl(intIntPair.getPackedValue())) : null;
        int i16 = 0;
        Integer num = numValueOf;
        Measurable measurable2 = measurable;
        MutableIntList mutableIntList3 = new MutableIntList(0, 1, null);
        MutableIntList mutableIntList4 = new MutableIntList(0, 1, null);
        FlowLayoutBuildingBlocks flowLayoutBuildingBlocks = new FlowLayoutBuildingBlocks(i, flowLayoutOverflowState, j, i2, i6, iCeil2, null);
        FlowLayoutBuildingBlocks.WrapEllipsisInfo wrapEllipsisInfo = null;
        FlowLayoutBuildingBlocks.WrapInfo wrapInfoM660getWrapInfoOpUlnko = flowLayoutBuildingBlocks.m660getWrapInfoOpUlnko(it.hasNext(), 0, IntIntPair.m26constructorimpl(i3, i4), intIntPair, 0, 0, 0, false, false);
        if (wrapInfoM660getWrapInfoOpUlnko.getIsLastItemInContainer()) {
            i7 = i3;
            wrapEllipsisInfo = flowLayoutBuildingBlocks.getWrapEllipsisInfo(wrapInfoM660getWrapInfoOpUlnko, intIntPair != null, -1, 0, i7, 0);
        } else {
            i7 = i3;
        }
        int i17 = 0;
        int i18 = 0;
        int i19 = i5;
        Measurable measurableSafeNext2 = measurable2;
        FlowLayoutBuildingBlocks.WrapEllipsisInfo wrapEllipsisInfo2 = wrapEllipsisInfo;
        int iMin = iM6973getMinWidthimpl;
        int i20 = 0;
        boolean z = true;
        int i21 = i4;
        int i22 = 0;
        while (!wrapInfoM660getWrapInfoOpUlnko.getIsLastItemInContainer() && measurableSafeNext2 != null) {
            Intrinsics.checkNotNull(num);
            int iIntValue = num.intValue();
            Intrinsics.checkNotNull(numValueOf2);
            MutableIntList mutableIntList5 = mutableIntList4;
            int i23 = iM6971getMaxWidthimpl;
            int i24 = i17 + iIntValue;
            int iMax = Math.max(i20, numValueOf2.intValue());
            int i25 = i7 - iIntValue;
            flowLayoutOverflowState.setItemShown$foundation_layout_release(i22 + 1);
            arrayList.add(measurableSafeNext2);
            mutableIntObjectMapMutableIntObjectMapOf.set(i22, objectRef.element);
            int i26 = (i22 + 1) - i16;
            boolean z2 = i26 < i;
            if (flowLineInfo3 != null) {
                int i27 = z2 ? i19 : i19 + 1;
                i12 = i22;
                int i28 = z2 ? i26 : 0;
                if (z2) {
                    int i29 = i25 - i6;
                    i13 = i26;
                    i14 = i29 < 0 ? 0 : i29;
                } else {
                    i13 = i26;
                    i14 = i23;
                }
                float f3 = measureScope2.mo386toDpu2uoSUM(i14);
                if (z2) {
                    i15 = i21;
                } else {
                    int i30 = (i21 - iMax) - iCeil2;
                    i15 = i30 < 0 ? 0 : i30;
                }
                flowLineInfo3.m673update4j6BHR0$foundation_layout_release(i27, i28, f3, measureScope2.mo386toDpu2uoSUM(i15));
            } else {
                i12 = i22;
                i13 = i26;
            }
            measurableSafeNext2 = !it.hasNext() ? null : safeNext(it, flowLineInfo3);
            objectRef.element = null;
            IntIntPair intIntPairM23boximpl3 = measurableSafeNext2 != null ? IntIntPair.m23boximpl(m663measureAndCacherqJ1uqs(measurableSafeNext2, flowLineMeasurePolicy, jM720toBoxConstraintsOenEA2s, new Function1<Placeable, Unit>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$breakDownItems$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Placeable placeable) {
                    invoke2(placeable);
                    return Unit.INSTANCE;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Placeable placeable) {
                    objectRef.element = placeable;
                }
            })) : null;
            Integer numValueOf3 = intIntPairM23boximpl3 != null ? Integer.valueOf(IntIntPair.m30getFirstimpl(intIntPairM23boximpl3.getPackedValue()) + i6) : null;
            numValueOf2 = intIntPairM23boximpl3 != null ? Integer.valueOf(IntIntPair.m31getSecondimpl(intIntPairM23boximpl3.getPackedValue())) : null;
            boolean zHasNext = it.hasNext();
            long jM26constructorimpl = IntIntPair.m26constructorimpl(i25, i21);
            if (intIntPairM23boximpl3 == null) {
                intIntPairM23boximpl2 = null;
            } else {
                Intrinsics.checkNotNull(numValueOf3);
                int iIntValue2 = numValueOf3.intValue();
                Intrinsics.checkNotNull(numValueOf2);
                intIntPairM23boximpl2 = IntIntPair.m23boximpl(IntIntPair.m26constructorimpl(iIntValue2, numValueOf2.intValue()));
            }
            FlowLayoutBuildingBlocks.WrapInfo wrapInfoM660getWrapInfoOpUlnko2 = flowLayoutBuildingBlocks.m660getWrapInfoOpUlnko(zHasNext, i13, jM26constructorimpl, intIntPairM23boximpl2, i19, i18, iMax, false, false);
            if (!wrapInfoM660getWrapInfoOpUlnko2.getIsLastItemInLine()) {
                i7 = i25;
                Integer num2 = numValueOf3;
                mutableIntList = mutableIntList5;
                flowLineInfo2 = flowLineInfo3;
                mutableIntList2 = mutableIntList3;
                num = num2;
                i20 = iMax;
                i17 = i24;
            } else {
                Integer num3 = numValueOf3;
                iMin = Math.min(Math.max(iMin, i24), i23);
                int i31 = i18 + iMax;
                FlowLayoutBuildingBlocks.WrapEllipsisInfo wrapEllipsisInfo3 = flowLayoutBuildingBlocks.getWrapEllipsisInfo(wrapInfoM660getWrapInfoOpUlnko2, intIntPairM23boximpl3 != null, i19, i31, i25, (i12 + 1) - i16);
                i23 = i23;
                mutableIntList = mutableIntList5;
                mutableIntList.add(iMax);
                int i32 = (iM6970getMaxHeightimpl - i31) - iCeil2;
                int i33 = i12 + 1;
                flowLineInfo2 = flowLineInfo3;
                mutableIntList2 = mutableIntList3;
                mutableIntList2.add(i12 + 1);
                Integer numValueOf4 = num3 != null ? Integer.valueOf(num3.intValue() - i6) : null;
                i19++;
                i17 = 0;
                i16 = i33;
                i7 = i23;
                i21 = i32;
                num = numValueOf4;
                i18 = i31 + iCeil2;
                wrapEllipsisInfo2 = wrapEllipsisInfo3;
                i20 = 0;
            }
            i22 = i12 + 1;
            mutableIntList4 = mutableIntList;
            mutableIntList3 = mutableIntList2;
            flowLineInfo3 = flowLineInfo2;
            iM6971getMaxWidthimpl = i23;
            wrapInfoM660getWrapInfoOpUlnko = wrapInfoM660getWrapInfoOpUlnko2;
        }
        FlowLineInfo flowLineInfo4 = flowLineInfo3;
        MutableIntList mutableIntList6 = mutableIntList4;
        MutableIntList mutableIntList7 = mutableIntList3;
        if (wrapEllipsisInfo2 != null) {
            FlowLayoutBuildingBlocks.WrapEllipsisInfo wrapEllipsisInfo4 = wrapEllipsisInfo2;
            arrayList.add(wrapEllipsisInfo4.getEllipsis());
            mutableIntObjectMapMutableIntObjectMapOf.set(arrayList.size() - 1, wrapEllipsisInfo4.getPlaceable());
            int i34 = mutableIntList7._size - 1;
            if (wrapEllipsisInfo4.getPlaceEllipsisOnLastContentLine()) {
                int i35 = mutableIntList7._size - 1;
                mutableIntList6.set(i34, Math.max(mutableIntList6.get(i34), IntIntPair.m31getSecondimpl(wrapEllipsisInfo4.getEllipsisSize())));
                mutableIntList7.set(i35, mutableIntList7.last() + 1);
            } else {
                mutableIntList6.add(IntIntPair.m31getSecondimpl(wrapEllipsisInfo4.getEllipsisSize()));
                mutableIntList7.add(mutableIntList7.last() + 1);
            }
        }
        int size = arrayList.size();
        Placeable[] placeableArr = new Placeable[size];
        for (int i36 = 0; i36 < size; i36++) {
            placeableArr[i36] = mutableIntObjectMapMutableIntObjectMapOf.get(i36);
        }
        int[] iArr = new int[mutableIntList7._size];
        int[] iArr2 = new int[mutableIntList7._size];
        int i37 = 0;
        MutableIntList mutableIntList8 = mutableIntList7;
        int[] iArr3 = mutableIntList8.content;
        int i38 = mutableIntList8._size;
        int i39 = 0;
        int i40 = 0;
        Placeable[] placeableArr2 = placeableArr;
        while (i40 < i38) {
            long j2 = jM720toBoxConstraintsOenEA2s;
            int i41 = iArr3[i40];
            int i42 = i40;
            int i43 = i21;
            Placeable[] placeableArr3 = placeableArr2;
            int i44 = mutableIntList6.get(i42);
            MutableIntList mutableIntList9 = mutableIntList6;
            int[] iArr4 = iArr;
            int i45 = iMin;
            boolean z3 = z;
            MutableIntList mutableIntList10 = mutableIntList8;
            MutableVector mutableVector3 = mutableVector2;
            MutableIntList mutableIntList11 = mutableIntList7;
            int i46 = i40;
            int i47 = i6;
            FlowLineInfo flowLineInfo5 = flowLineInfo4;
            MutableIntObjectMap mutableIntObjectMap = mutableIntObjectMapMutableIntObjectMapOf;
            MeasureResult measureResultMeasure = RowColumnMeasurePolicyKt.measure(flowLineMeasurePolicy, i45, Constraints.m6972getMinHeightimpl(jM705constructorimpl), Constraints.m6971getMaxWidthimpl(jM705constructorimpl), i44, i47, measureScope2, arrayList, placeableArr3, i37, i41, iArr4, i42);
            ArrayList arrayList2 = arrayList;
            if (flowLineMeasurePolicy.isHorizontal()) {
                i10 = measureResultMeasure.getWidth();
                i11 = measureResultMeasure.getHeight();
            } else {
                i10 = measureResultMeasure.getHeight();
                i11 = measureResultMeasure.getWidth();
            }
            iArr2[i42] = i11;
            i39 += i11;
            int iMax2 = Math.max(i45, i10);
            mutableVector3.add(measureResultMeasure);
            mutableVector2 = mutableVector3;
            mutableIntList8 = mutableIntList10;
            z = z3;
            measureScope2 = measureScope;
            i37 = i41;
            arrayList = arrayList2;
            placeableArr2 = placeableArr3;
            mutableIntObjectMapMutableIntObjectMapOf = mutableIntObjectMap;
            flowLineInfo4 = flowLineInfo5;
            mutableIntList7 = mutableIntList11;
            i40 = i46 + 1;
            iMin = iMax2;
            iArr = iArr4;
            i6 = i47;
            i21 = i43;
            mutableIntList6 = mutableIntList9;
            jM720toBoxConstraintsOenEA2s = j2;
        }
        MutableVector mutableVector4 = mutableVector2;
        boolean z4 = z;
        int[] iArr5 = iArr;
        int i48 = iMin;
        if (mutableVector4.getSize() != 0) {
            z4 = null;
        }
        if (z4 == null) {
            i8 = i48;
            i9 = i39;
        } else {
            i8 = 0;
            i9 = 0;
        }
        return m664placeHelperBmaY500(measureScope, j, i8, i9, iArr2, mutableVector4, flowLineMeasurePolicy, iArr5);
    }

    private static final Measurable safeNext(Iterator<? extends Measurable> it, FlowLineInfo info) {
        Measurable next;
        try {
            if (it instanceof ContextualFlowItemIterator) {
                Intrinsics.checkNotNull(info);
                next = ((ContextualFlowItemIterator) it).getNext$foundation_layout_release(info);
            } else {
                next = it.next();
            }
            return next;
        } catch (IndexOutOfBoundsException e) {
            return null;
        }
    }

    public static final int mainAxisMin(IntrinsicMeasurable $this$mainAxisMin, boolean isHorizontal, int crossAxisSize) {
        if (isHorizontal) {
            return $this$mainAxisMin.minIntrinsicWidth(crossAxisSize);
        }
        return $this$mainAxisMin.minIntrinsicHeight(crossAxisSize);
    }

    public static final int crossAxisMin(IntrinsicMeasurable $this$crossAxisMin, boolean isHorizontal, int mainAxisSize) {
        if (isHorizontal) {
            return $this$crossAxisMin.minIntrinsicHeight(mainAxisSize);
        }
        return $this$crossAxisMin.minIntrinsicWidth(mainAxisSize);
    }

    public static final CrossAxisAlignment getCROSS_AXIS_ALIGNMENT_TOP() {
        return CROSS_AXIS_ALIGNMENT_TOP;
    }

    public static final CrossAxisAlignment getCROSS_AXIS_ALIGNMENT_START() {
        return CROSS_AXIS_ALIGNMENT_START;
    }

    /* renamed from: measureAndCache-rqJ1uqs, reason: not valid java name */
    public static final long m663measureAndCacherqJ1uqs(Measurable $this$measureAndCache_u2drqJ1uqs, FlowLineMeasurePolicy measurePolicy, long constraints, Function1<? super Placeable, Unit> function1) {
        FlowLayoutData flowLayoutData;
        if (RowColumnImplKt.getWeight(RowColumnImplKt.getRowColumnParentData($this$measureAndCache_u2drqJ1uqs)) == 0.0f) {
            RowColumnParentData rowColumnParentData = RowColumnImplKt.getRowColumnParentData($this$measureAndCache_u2drqJ1uqs);
            if (((rowColumnParentData == null || (flowLayoutData = rowColumnParentData.getFlowLayoutData()) == null) ? null : Float.valueOf(flowLayoutData.getFillCrossAxisFraction())) == null) {
                Placeable placeable = $this$measureAndCache_u2drqJ1uqs.mo5750measureBRTryo0(constraints);
                function1.invoke(placeable);
                int mainAxis = measurePolicy.mainAxisSize(placeable);
                int crossAxis = measurePolicy.crossAxisSize(placeable);
                return IntIntPair.m26constructorimpl(mainAxis, crossAxis);
            }
        }
        int mainAxis2 = mainAxisMin($this$measureAndCache_u2drqJ1uqs, measurePolicy.isHorizontal(), Integer.MAX_VALUE);
        int crossAxis2 = crossAxisMin($this$measureAndCache_u2drqJ1uqs, measurePolicy.isHorizontal(), mainAxis2);
        return IntIntPair.m26constructorimpl(mainAxis2, crossAxis2);
    }

    /* renamed from: placeHelper-BmaY500, reason: not valid java name */
    public static final MeasureResult m664placeHelperBmaY500(MeasureScope $this$placeHelper_u2dBmaY500, long constraints, int mainAxisTotalSize, int crossAxisTotalSize, int[] crossAxisSizes, final MutableVector<MeasureResult> mutableVector, FlowLineMeasurePolicy measureHelper, int[] outPosition) {
        int $this$fastCoerceAtLeast$iv$iv;
        int layoutWidth;
        int layoutHeight;
        boolean isHorizontal = measureHelper.isHorizontal();
        Arrangement.Vertical verticalArrangement = measureHelper.getVerticalArrangement();
        Arrangement.Horizontal horizontalArrangement = measureHelper.getHorizontalArrangement();
        if (isHorizontal) {
            int totalCrossAxisSpacing = $this$placeHelper_u2dBmaY500.mo383roundToPx0680j_4(verticalArrangement.getSpacing()) * (mutableVector.getSize() - 1);
            int totalCrossAxisSize = crossAxisTotalSize + totalCrossAxisSpacing;
            int iM6972getMinHeightimpl = Constraints.m6972getMinHeightimpl(constraints);
            int iM6970getMaxHeightimpl = Constraints.m6970getMaxHeightimpl(constraints);
            $this$fastCoerceAtLeast$iv$iv = totalCrossAxisSize;
            if ($this$fastCoerceAtLeast$iv$iv < iM6972getMinHeightimpl) {
                $this$fastCoerceAtLeast$iv$iv = iM6972getMinHeightimpl;
            }
            if ($this$fastCoerceAtLeast$iv$iv > iM6970getMaxHeightimpl) {
                $this$fastCoerceAtLeast$iv$iv = iM6970getMaxHeightimpl;
            }
            verticalArrangement.arrange($this$placeHelper_u2dBmaY500, $this$fastCoerceAtLeast$iv$iv, crossAxisSizes, outPosition);
        } else {
            int totalCrossAxisSpacing2 = $this$placeHelper_u2dBmaY500.mo383roundToPx0680j_4(horizontalArrangement.getSpacing()) * (mutableVector.getSize() - 1);
            int totalCrossAxisSize2 = crossAxisTotalSize + totalCrossAxisSpacing2;
            int iM6972getMinHeightimpl2 = Constraints.m6972getMinHeightimpl(constraints);
            int iM6970getMaxHeightimpl2 = Constraints.m6970getMaxHeightimpl(constraints);
            int $this$fastCoerceAtLeast$iv$iv2 = totalCrossAxisSize2;
            if ($this$fastCoerceAtLeast$iv$iv2 < iM6972getMinHeightimpl2) {
                $this$fastCoerceAtLeast$iv$iv2 = iM6972getMinHeightimpl2;
            }
            int $i$f$fastCoerceAtMost = $this$fastCoerceAtLeast$iv$iv2 > iM6970getMaxHeightimpl2 ? iM6970getMaxHeightimpl2 : $this$fastCoerceAtLeast$iv$iv2;
            horizontalArrangement.arrange($this$placeHelper_u2dBmaY500, $i$f$fastCoerceAtMost, crossAxisSizes, $this$placeHelper_u2dBmaY500.getLayoutDirection(), outPosition);
            $this$fastCoerceAtLeast$iv$iv = $i$f$fastCoerceAtMost;
        }
        int iM6973getMinWidthimpl = Constraints.m6973getMinWidthimpl(constraints);
        int iM6971getMaxWidthimpl = Constraints.m6971getMaxWidthimpl(constraints);
        int $this$fastCoerceAtLeast$iv$iv3 = mainAxisTotalSize;
        if ($this$fastCoerceAtLeast$iv$iv3 < iM6973getMinWidthimpl) {
            $this$fastCoerceAtLeast$iv$iv3 = iM6973getMinWidthimpl;
        }
        if ($this$fastCoerceAtLeast$iv$iv3 > iM6971getMaxWidthimpl) {
            $this$fastCoerceAtLeast$iv$iv3 = iM6971getMaxWidthimpl;
        }
        int finalMainAxisTotalSize = $this$fastCoerceAtLeast$iv$iv3;
        if (isHorizontal) {
            layoutWidth = finalMainAxisTotalSize;
            layoutHeight = $this$fastCoerceAtLeast$iv$iv;
        } else {
            layoutWidth = $this$fastCoerceAtLeast$iv$iv;
            layoutHeight = finalMainAxisTotalSize;
        }
        return MeasureScope.layout$default($this$placeHelper_u2dBmaY500, layoutWidth, layoutHeight, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$placeHelper$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                MutableVector this_$iv = mutableVector;
                Object[] content$iv = this_$iv.content;
                int size$iv = this_$iv.getSize();
                for (int i$iv = 0; i$iv < size$iv; i$iv++) {
                    MeasureResult measureResult = (MeasureResult) content$iv[i$iv];
                    measureResult.placeChildren();
                }
            }
        }, 4, null);
    }
}
