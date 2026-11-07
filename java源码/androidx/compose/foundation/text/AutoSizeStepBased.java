package androidx.compose.foundation.text;

import androidx.compose.foundation.text.modifiers.TextAutoSizeLayoutScope;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.compose.ui.unit.TextUnitType;
import com.pymcl.multiplayer.TerracottaVpnService;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: TextAutoSize.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0096\u0002J\b\u0010\f\u001a\u00020\rH\u0016J\f\u0010\u000e\u001a\u00020\t*\u00020\u000fH\u0002J\f\u0010\u0010\u001a\u00020\t*\u00020\u000fH\u0002J\f\u0010\u0011\u001a\u00020\t*\u00020\u000fH\u0002J&\u0010\u0012\u001a\u00020\u0003*\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019R\u0016\u0010\u0004\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0007R\u0016\u0010\u0002\u001a\u00020\u0003X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0007R\u0016\u0010\u0005\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0007\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001a"}, d2 = {"Landroidx/compose/foundation/text/AutoSizeStepBased;", "Landroidx/compose/foundation/text/TextAutoSize;", "minFontSize", "Landroidx/compose/ui/unit/TextUnit;", "maxFontSize", "stepSize", "(JJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "J", "equals", "", "other", "", "hashCode", "", "didOverflow", "Landroidx/compose/ui/text/TextLayoutResult;", "didOverflowBounds", "didOverflowByEllipsize", "getFontSize", "Landroidx/compose/foundation/text/modifiers/TextAutoSizeLayoutScope;", "constraints", "Landroidx/compose/ui/unit/Constraints;", TerracottaVpnService.EXTRA_TEXT, "Landroidx/compose/ui/text/AnnotatedString;", "getFontSize-Ci0_558", "(Landroidx/compose/foundation/text/modifiers/TextAutoSizeLayoutScope;JLandroidx/compose/ui/text/AnnotatedString;)J", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class AutoSizeStepBased implements TextAutoSize {
    private final long maxFontSize;
    private long minFontSize;
    private final long stepSize;

    public /* synthetic */ AutoSizeStepBased(long j, long j2, long j3, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3);
    }

    private AutoSizeStepBased(long minFontSize, long maxFontSize, long stepSize) {
        this.minFontSize = minFontSize;
        this.maxFontSize = maxFontSize;
        this.stepSize = stepSize;
        if (TextUnit.m7209equalsimpl0(this.minFontSize, TextUnit.INSTANCE.m7223getUnspecifiedXSAIIZE())) {
            throw new IllegalArgumentException("AutoSize.StepBased: TextUnit.Unspecified is not a valid value for minFontSize. Try using other values e.g. 10.sp");
        }
        if (TextUnit.m7209equalsimpl0(this.maxFontSize, TextUnit.INSTANCE.m7223getUnspecifiedXSAIIZE())) {
            throw new IllegalArgumentException("AutoSize.StepBased: TextUnit.Unspecified is not a valid value for maxFontSize. Try using other values e.g. 100.sp");
        }
        if (TextUnit.m7209equalsimpl0(this.stepSize, TextUnit.INSTANCE.m7223getUnspecifiedXSAIIZE())) {
            throw new IllegalArgumentException("AutoSize.StepBased: TextUnit.Unspecified is not a valid value for stepSize. Try using other values e.g. 0.25.sp");
        }
        if (TextUnitType.m7240equalsimpl0(TextUnit.m7211getTypeUIouoOA(this.minFontSize), TextUnit.m7211getTypeUIouoOA(this.maxFontSize))) {
            long arg0$iv = this.minFontSize;
            long other$iv = this.maxFontSize;
            TextUnitKt.m7226checkArithmeticNB67dxo(arg0$iv, other$iv);
            if (Float.compare(TextUnit.m7212getValueimpl(arg0$iv), TextUnit.m7212getValueimpl(other$iv)) > 0) {
                this.minFontSize = this.maxFontSize;
            }
        }
        if (TextUnitType.m7240equalsimpl0(TextUnit.m7211getTypeUIouoOA(this.stepSize), TextUnitType.INSTANCE.m7245getSpUIouoOA())) {
            long arg0$iv2 = this.stepSize;
            long other$iv2 = TextUnitKt.getSp(1.0E-4f);
            TextUnitKt.m7226checkArithmeticNB67dxo(arg0$iv2, other$iv2);
            if (Float.compare(TextUnit.m7212getValueimpl(arg0$iv2), TextUnit.m7212getValueimpl(other$iv2)) < 0) {
                throw new IllegalArgumentException("AutoSize.StepBased: stepSize must be greater than or equal to 0.0001f.sp");
            }
        }
        if (TextUnit.m7212getValueimpl(this.minFontSize) < 0.0f) {
            throw new IllegalArgumentException("AutoSize.StepBased: minFontSize must not be negative");
        }
        if (TextUnit.m7212getValueimpl(this.maxFontSize) >= 0.0f) {
        } else {
            throw new IllegalArgumentException("AutoSize.StepBased: maxFontSize must not be negative");
        }
    }

    @Override // androidx.compose.foundation.text.TextAutoSize
    /* renamed from: getFontSize-Ci0_558, reason: not valid java name */
    public long mo1036getFontSizeCi0_558(TextAutoSizeLayoutScope $this$getFontSize_u2dCi0_558, long constraints, AnnotatedString text) {
        float stepSize = $this$getFontSize_u2dCi0_558.mo388toPxR2X_6o(this.stepSize);
        float smallest = $this$getFontSize_u2dCi0_558.mo388toPxR2X_6o(this.minFontSize);
        float largest = $this$getFontSize_u2dCi0_558.mo388toPxR2X_6o(this.maxFontSize);
        float f = 2;
        float min = smallest;
        float max = largest;
        float current = (smallest + largest) / f;
        while (max - min >= stepSize) {
            TextLayoutResult layoutResult = $this$getFontSize_u2dCi0_558.mo1430performLayout5ZSfY2I(constraints, text, $this$getFontSize_u2dCi0_558.mo392toSpkPz2Gy4(current));
            if (didOverflow(layoutResult)) {
                max = current;
            } else {
                float max2 = current;
                min = max2;
            }
            current = (min + max) / f;
        }
        float current2 = (((float) Math.floor((min - smallest) / stepSize)) * stepSize) + smallest;
        if (current2 + stepSize <= largest) {
            TextLayoutResult layoutResult2 = $this$getFontSize_u2dCi0_558.mo1430performLayout5ZSfY2I(constraints, text, $this$getFontSize_u2dCi0_558.mo392toSpkPz2Gy4(current2 + stepSize));
            if (!didOverflow(layoutResult2)) {
                current2 += stepSize;
            }
        }
        return $this$getFontSize_u2dCi0_558.mo392toSpkPz2Gy4(current2);
    }

    private final boolean didOverflow(TextLayoutResult $this$didOverflow) {
        int overflow = $this$didOverflow.getLayoutInput().getOverflow();
        if (TextOverflow.m6922equalsimpl0(overflow, TextOverflow.INSTANCE.m6931getClipgIe3tQ8()) ? true : TextOverflow.m6922equalsimpl0(overflow, TextOverflow.INSTANCE.m6935getVisiblegIe3tQ8())) {
            return didOverflowBounds($this$didOverflow);
        }
        if (TextOverflow.m6922equalsimpl0(overflow, TextOverflow.INSTANCE.m6934getStartEllipsisgIe3tQ8()) ? true : TextOverflow.m6922equalsimpl0(overflow, TextOverflow.INSTANCE.m6933getMiddleEllipsisgIe3tQ8()) ? true : TextOverflow.m6922equalsimpl0(overflow, TextOverflow.INSTANCE.m6932getEllipsisgIe3tQ8())) {
            return didOverflowByEllipsize($this$didOverflow);
        }
        throw new IllegalArgumentException("TextOverflow type " + ((Object) TextOverflow.m6924toStringimpl($this$didOverflow.getLayoutInput().getOverflow())) + " is not supported.");
    }

    private final boolean didOverflowBounds(TextLayoutResult $this$didOverflowBounds) {
        return $this$didOverflowBounds.getDidOverflowWidth() || $this$didOverflowBounds.getDidOverflowHeight();
    }

    private final boolean didOverflowByEllipsize(TextLayoutResult $this$didOverflowByEllipsize) {
        switch ($this$didOverflowByEllipsize.getLineCount()) {
            case 0:
                return false;
            case 1:
                return $this$didOverflowByEllipsize.isLineEllipsized(0);
            default:
                int overflow = $this$didOverflowByEllipsize.getLayoutInput().getOverflow();
                if (TextOverflow.m6922equalsimpl0(overflow, TextOverflow.INSTANCE.m6934getStartEllipsisgIe3tQ8()) ? true : TextOverflow.m6922equalsimpl0(overflow, TextOverflow.INSTANCE.m6933getMiddleEllipsisgIe3tQ8())) {
                    return didOverflowBounds($this$didOverflowByEllipsize);
                }
                if (TextOverflow.m6922equalsimpl0(overflow, TextOverflow.INSTANCE.m6932getEllipsisgIe3tQ8())) {
                    return $this$didOverflowByEllipsize.isLineEllipsized($this$didOverflowByEllipsize.getLineCount() - 1);
                }
                return false;
        }
    }

    @Override // androidx.compose.foundation.text.TextAutoSize
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (other != null && (other instanceof AutoSizeStepBased) && TextUnit.m7209equalsimpl0(((AutoSizeStepBased) other).minFontSize, this.minFontSize) && TextUnit.m7209equalsimpl0(((AutoSizeStepBased) other).maxFontSize, this.maxFontSize) && TextUnit.m7209equalsimpl0(((AutoSizeStepBased) other).stepSize, this.stepSize)) {
            return true;
        }
        return false;
    }

    @Override // androidx.compose.foundation.text.TextAutoSize
    public int hashCode() {
        int result = TextUnit.m7213hashCodeimpl(this.minFontSize);
        return (((result * 31) + TextUnit.m7213hashCodeimpl(this.maxFontSize)) * 31) + TextUnit.m7213hashCodeimpl(this.stepSize);
    }
}
