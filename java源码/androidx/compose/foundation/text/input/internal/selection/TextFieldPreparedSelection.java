package androidx.compose.foundation.text.input.internal.selection;

import androidx.compose.foundation.text.StringHelpersKt;
import androidx.compose.foundation.text.StringHelpers_androidKt;
import androidx.compose.foundation.text.input.TextFieldCharSequence;
import androidx.compose.foundation.text.input.internal.SelectionWedgeAffinity;
import androidx.compose.foundation.text.input.internal.TransformedTextFieldState;
import androidx.compose.foundation.text.input.internal.WedgeAffinity;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import com.pymcl.multiplayer.TerracottaVpnService;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.ranges.RangesKt;

/* compiled from: TextPreparedSelection.kt */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0000\u0018\u0000 W2\u00020\u0001:\u0001WB/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ,\u0010$\u001a\u00020\u00002\b\b\u0002\u0010%\u001a\u00020\u00072\u0017\u0010&\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020(0'¢\u0006\u0002\b)H\u0082\bJ\u0010\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020+H\u0002J\u001f\u0010-\u001a\u00020\u00002\u0017\u0010.\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020(0'¢\u0006\u0002\b)J\u001f\u0010/\u001a\u00020\u00002\u0017\u0010.\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020(0'¢\u0006\u0002\b)J\u0006\u00100\u001a\u00020\u0000J\u0006\u00101\u001a\u00020\u0000J\u0006\u00102\u001a\u00020+J\u0006\u00103\u001a\u00020+J\b\u00104\u001a\u00020\u0007H\u0002J\u0010\u00105\u001a\u00020+2\u0006\u00106\u001a\u00020+H\u0002J\u0006\u00107\u001a\u00020\u0000J\u0006\u00108\u001a\u00020\u0000J\u0006\u00109\u001a\u00020\u0000J\u0006\u0010:\u001a\u00020\u0000J\u0006\u0010;\u001a\u00020\u0000J\u0006\u0010<\u001a\u00020\u0000J\u0006\u0010=\u001a\u00020\u0000J\u0006\u0010>\u001a\u00020\u0000J\u0006\u0010?\u001a\u00020\u0000J\u0006\u0010@\u001a\u00020\u0000J\u0006\u0010A\u001a\u00020\u0000J\u0006\u0010B\u001a\u00020\u0000J!\u0010C\u001a\u00020\u00002\b\b\u0002\u0010%\u001a\u00020\u00072\f\u0010D\u001a\b\u0012\u0004\u0012\u00020+0EH\u0082\bJ\u0006\u0010F\u001a\u00020\u0000J\u0006\u0010G\u001a\u00020\u0000J\u0006\u0010H\u001a\u00020\u0000J\u0006\u0010I\u001a\u00020\u0000J\u0006\u0010J\u001a\u00020\u0000J\u0006\u0010K\u001a\u00020\u0000J\u0006\u0010L\u001a\u00020\u0000J\u0006\u0010M\u001a\u00020\u0000J\u0006\u0010N\u001a\u00020\u0000J\u0006\u0010O\u001a\u00020\u0000J\u0016\u0010P\u001a\u00020+*\u00020\u00052\b\b\u0002\u0010Q\u001a\u00020+H\u0002J\u0016\u0010R\u001a\u00020+*\u00020\u00052\b\b\u0002\u0010Q\u001a\u00020+H\u0002J\u0017\u0010S\u001a\u00020+*\u00020\u00052\b\b\u0002\u0010Q\u001a\u00020+H\u0082\u0010J\u0017\u0010T\u001a\u00020+*\u00020\u00052\b\b\u0002\u0010Q\u001a\u00020+H\u0082\u0010J\u0014\u0010U\u001a\u00020+*\u00020\u00052\u0006\u0010V\u001a\u00020+H\u0002R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\"\u0010\u0015\u001a\u00020\u0016X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\u001b\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006X"}, d2 = {"Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;", "", "state", "Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;", "textLayoutResult", "Landroidx/compose/ui/text/TextLayoutResult;", "isFromSoftKeyboard", "", "visibleTextLayoutHeight", "", "textPreparedSelectionState", "Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelectionState;", "(Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Landroidx/compose/ui/text/TextLayoutResult;ZFLandroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelectionState;)V", "initialValue", "Landroidx/compose/foundation/text/input/TextFieldCharSequence;", "getInitialValue", "()Landroidx/compose/foundation/text/input/TextFieldCharSequence;", "initialWedgeAffinity", "Landroidx/compose/foundation/text/input/internal/SelectionWedgeAffinity;", "getInitialWedgeAffinity", "()Landroidx/compose/foundation/text/input/internal/SelectionWedgeAffinity;", "selection", "Landroidx/compose/ui/text/TextRange;", "getSelection-d9O1mEE", "()J", "setSelection-5zc-tL8", "(J)V", "J", TerracottaVpnService.EXTRA_TEXT, "", "wedgeAffinity", "Landroidx/compose/foundation/text/input/internal/WedgeAffinity;", "getWedgeAffinity", "()Landroidx/compose/foundation/text/input/internal/WedgeAffinity;", "setWedgeAffinity", "(Landroidx/compose/foundation/text/input/internal/WedgeAffinity;)V", "applyIfNotEmpty", "resetCachedX", "block", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "charOffset", "", "offset", "collapseLeftOr", "or", "collapseRightOr", "deleteMovement", "deselect", "getNextCharacterIndex", "getPrecedingCharacterIndex", "isLtr", "jumpByPagesOffset", "pagesAmount", "moveCursorDownByLine", "moveCursorDownByPage", "moveCursorLeftByChar", "moveCursorLeftByWord", "moveCursorNextByChar", "moveCursorNextByParagraph", "moveCursorNextByWord", "moveCursorPrevByChar", "moveCursorPrevByParagraph", "moveCursorPrevByWord", "moveCursorRightByChar", "moveCursorRightByWord", "moveCursorTo", "proposedCursorMovement", "Lkotlin/Function0;", "moveCursorToEnd", "moveCursorToHome", "moveCursorToLineEnd", "moveCursorToLineLeftSide", "moveCursorToLineRightSide", "moveCursorToLineStart", "moveCursorUpByLine", "moveCursorUpByPage", "selectAll", "selectMovement", "getLineEndByOffsetForLayout", "currentOffset", "getLineStartByOffsetForLayout", "getNextWordOffsetForLayout", "getPrevWordOffsetForLayout", "jumpByLinesOffset", "linesAmount", "Companion", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TextFieldPreparedSelection {
    public static final int NoCharacterFound = -1;
    private final TextFieldCharSequence initialValue;
    private final SelectionWedgeAffinity initialWedgeAffinity;
    private final boolean isFromSoftKeyboard;
    private long selection;
    private final TransformedTextFieldState state;
    private final String text;
    private final TextLayoutResult textLayoutResult;
    private final TextFieldPreparedSelectionState textPreparedSelectionState;
    private final float visibleTextLayoutHeight;
    private WedgeAffinity wedgeAffinity;
    public static final int $stable = 8;

    public TextFieldPreparedSelection(TransformedTextFieldState state, TextLayoutResult textLayoutResult, boolean isFromSoftKeyboard, float visibleTextLayoutHeight, TextFieldPreparedSelectionState textPreparedSelectionState) {
        this.state = state;
        this.textLayoutResult = textLayoutResult;
        this.isFromSoftKeyboard = isFromSoftKeyboard;
        this.visibleTextLayoutHeight = visibleTextLayoutHeight;
        this.textPreparedSelectionState = textPreparedSelectionState;
        Snapshot.Companion this_$iv = Snapshot.INSTANCE;
        Snapshot previousSnapshot$iv = this_$iv.getCurrentThreadSnapshot();
        Function1 observer$iv = previousSnapshot$iv != null ? previousSnapshot$iv.getReadObserver() : null;
        Snapshot newSnapshot$iv = this_$iv.makeCurrentNonObservable(previousSnapshot$iv);
        try {
            this.initialValue = this.state.getVisualText();
            this.initialWedgeAffinity = this.state.getSelectionWedgeAffinity();
            Unit unit = Unit.INSTANCE;
            this_$iv.restoreNonObservable(previousSnapshot$iv, newSnapshot$iv, observer$iv);
            this.selection = this.initialValue.getSelection();
            this.text = this.initialValue.getText().toString();
        } catch (Throwable th) {
            this_$iv.restoreNonObservable(previousSnapshot$iv, newSnapshot$iv, observer$iv);
            throw th;
        }
    }

    public final TextFieldCharSequence getInitialValue() {
        return this.initialValue;
    }

    public final SelectionWedgeAffinity getInitialWedgeAffinity() {
        return this.initialWedgeAffinity;
    }

    /* renamed from: getSelection-d9O1mEE, reason: not valid java name and from getter */
    public final long getSelection() {
        return this.selection;
    }

    /* renamed from: setSelection-5zc-tL8, reason: not valid java name */
    public final void m1371setSelection5zctL8(long j) {
        this.selection = j;
    }

    public final WedgeAffinity getWedgeAffinity() {
        return this.wedgeAffinity;
    }

    public final void setWedgeAffinity(WedgeAffinity wedgeAffinity) {
        this.wedgeAffinity = wedgeAffinity;
    }

    static /* synthetic */ TextFieldPreparedSelection applyIfNotEmpty$default(TextFieldPreparedSelection $this, boolean resetCachedX, Function1 block, int i, Object obj) {
        if ((i & 1) != 0) {
            resetCachedX = true;
        }
        if (resetCachedX) {
            $this.textPreparedSelectionState.resetCachedX();
        }
        if ($this.text.length() > 0) {
            block.invoke($this);
        }
        return $this;
    }

    private final TextFieldPreparedSelection applyIfNotEmpty(boolean resetCachedX, Function1<? super TextFieldPreparedSelection, Unit> block) {
        if (resetCachedX) {
            this.textPreparedSelectionState.resetCachedX();
        }
        if (this.text.length() > 0) {
            block.invoke(this);
        }
        return this;
    }

    public final TextFieldPreparedSelection selectAll() {
        this.textPreparedSelectionState.resetCachedX();
        if (this.text.length() > 0) {
            TextFieldPreparedSelection $this$selectAll_u24lambda_u241 = this;
            $this$selectAll_u24lambda_u241.selection = TextRangeKt.TextRange(0, $this$selectAll_u24lambda_u241.text.length());
        }
        return this;
    }

    public final TextFieldPreparedSelection deselect() {
        this.textPreparedSelectionState.resetCachedX();
        if (this.text.length() > 0) {
            TextFieldPreparedSelection $this$deselect_u24lambda_u242 = this;
            $this$deselect_u24lambda_u242.selection = TextRangeKt.TextRange(TextRange.m6454getEndimpl($this$deselect_u24lambda_u242.selection));
        }
        return this;
    }

    public final TextFieldPreparedSelection moveCursorLeftByChar() {
        if (isLtr()) {
            return moveCursorPrevByChar();
        }
        return moveCursorNextByChar();
    }

    public final TextFieldPreparedSelection moveCursorRightByChar() {
        if (isLtr()) {
            return moveCursorNextByChar();
        }
        return moveCursorPrevByChar();
    }

    public final TextFieldPreparedSelection collapseLeftOr(Function1<? super TextFieldPreparedSelection, Unit> or) {
        this.textPreparedSelectionState.resetCachedX();
        if (this.text.length() > 0) {
            TextFieldPreparedSelection $this$collapseLeftOr_u24lambda_u243 = this;
            if (TextRange.m6453getCollapsedimpl($this$collapseLeftOr_u24lambda_u243.selection)) {
                or.invoke($this$collapseLeftOr_u24lambda_u243);
            } else if ($this$collapseLeftOr_u24lambda_u243.isLtr()) {
                $this$collapseLeftOr_u24lambda_u243.selection = TextRangeKt.TextRange(TextRange.m6457getMinimpl($this$collapseLeftOr_u24lambda_u243.selection));
            } else {
                $this$collapseLeftOr_u24lambda_u243.selection = TextRangeKt.TextRange(TextRange.m6456getMaximpl($this$collapseLeftOr_u24lambda_u243.selection));
            }
        }
        return this;
    }

    public final TextFieldPreparedSelection collapseRightOr(Function1<? super TextFieldPreparedSelection, Unit> or) {
        this.textPreparedSelectionState.resetCachedX();
        if (this.text.length() > 0) {
            TextFieldPreparedSelection $this$collapseRightOr_u24lambda_u244 = this;
            if (TextRange.m6453getCollapsedimpl($this$collapseRightOr_u24lambda_u244.selection)) {
                or.invoke($this$collapseRightOr_u24lambda_u244);
            } else if ($this$collapseRightOr_u24lambda_u244.isLtr()) {
                $this$collapseRightOr_u24lambda_u244.selection = TextRangeKt.TextRange(TextRange.m6456getMaximpl($this$collapseRightOr_u24lambda_u244.selection));
            } else {
                $this$collapseRightOr_u24lambda_u244.selection = TextRangeKt.TextRange(TextRange.m6457getMinimpl($this$collapseRightOr_u24lambda_u244.selection));
            }
        }
        return this;
    }

    public final int getPrecedingCharacterIndex() {
        return StringHelpers_androidKt.findPrecedingBreak(this.text, TextRange.m6454getEndimpl(this.selection));
    }

    public final int getNextCharacterIndex() {
        return StringHelpers_androidKt.findFollowingBreak(this.text, TextRange.m6454getEndimpl(this.selection));
    }

    static /* synthetic */ TextFieldPreparedSelection moveCursorTo$default(TextFieldPreparedSelection $this, boolean resetCachedX, Function0 proposedCursorMovement, int i, Object obj) {
        if ((i & 1) != 0) {
            resetCachedX = true;
        }
        if (resetCachedX) {
            $this.textPreparedSelectionState.resetCachedX();
        }
        if ($this.text.length() > 0) {
            int oldCursor = TextRange.m6454getEndimpl($this.getSelection());
            long jCalculateNextCursorPositionAndWedgeAffinity = TextPreparedSelectionKt.calculateNextCursorPositionAndWedgeAffinity(((Number) proposedCursorMovement.invoke()).intValue(), oldCursor, $this.state);
            int newCursor = CursorAndWedgeAffinity.m1344component1impl(jCalculateNextCursorPositionAndWedgeAffinity);
            WedgeAffinity newWedgeAffinity = CursorAndWedgeAffinity.m1345component2impl(jCalculateNextCursorPositionAndWedgeAffinity);
            if (newCursor != oldCursor || !TextRange.m6453getCollapsedimpl($this.getSelection())) {
                $this.m1371setSelection5zctL8(TextRangeKt.TextRange(newCursor));
            }
            if (newWedgeAffinity != null) {
                $this.setWedgeAffinity(newWedgeAffinity);
            }
        }
        return $this;
    }

    private final TextFieldPreparedSelection moveCursorTo(boolean resetCachedX, Function0<Integer> proposedCursorMovement) {
        if (resetCachedX) {
            this.textPreparedSelectionState.resetCachedX();
        }
        if (this.text.length() > 0) {
            TextFieldPreparedSelection $this$moveCursorTo_u24lambda_u245 = this;
            int oldCursor = TextRange.m6454getEndimpl($this$moveCursorTo_u24lambda_u245.getSelection());
            long jCalculateNextCursorPositionAndWedgeAffinity = TextPreparedSelectionKt.calculateNextCursorPositionAndWedgeAffinity(proposedCursorMovement.invoke().intValue(), oldCursor, $this$moveCursorTo_u24lambda_u245.state);
            int newCursor = CursorAndWedgeAffinity.m1344component1impl(jCalculateNextCursorPositionAndWedgeAffinity);
            WedgeAffinity newWedgeAffinity = CursorAndWedgeAffinity.m1345component2impl(jCalculateNextCursorPositionAndWedgeAffinity);
            if (newCursor != oldCursor || !TextRange.m6453getCollapsedimpl($this$moveCursorTo_u24lambda_u245.getSelection())) {
                $this$moveCursorTo_u24lambda_u245.m1371setSelection5zctL8(TextRangeKt.TextRange(newCursor));
            }
            if (newWedgeAffinity != null) {
                $this$moveCursorTo_u24lambda_u245.setWedgeAffinity(newWedgeAffinity);
            }
        }
        return this;
    }

    public final TextFieldPreparedSelection moveCursorPrevByChar() {
        this.textPreparedSelectionState.resetCachedX();
        if (this.text.length() > 0) {
            TextFieldPreparedSelection $this$moveCursorTo_u24lambda_u245$iv = this;
            int oldCursor$iv = TextRange.m6454getEndimpl($this$moveCursorTo_u24lambda_u245$iv.getSelection());
            long jCalculateNextCursorPositionAndWedgeAffinity = TextPreparedSelectionKt.calculateNextCursorPositionAndWedgeAffinity(StringHelpers_androidKt.findPrecedingBreak(this.text, TextRange.m6454getEndimpl(this.selection)), oldCursor$iv, $this$moveCursorTo_u24lambda_u245$iv.state);
            int newCursor$iv = CursorAndWedgeAffinity.m1344component1impl(jCalculateNextCursorPositionAndWedgeAffinity);
            WedgeAffinity newWedgeAffinity$iv = CursorAndWedgeAffinity.m1345component2impl(jCalculateNextCursorPositionAndWedgeAffinity);
            if (newCursor$iv != oldCursor$iv || !TextRange.m6453getCollapsedimpl($this$moveCursorTo_u24lambda_u245$iv.getSelection())) {
                $this$moveCursorTo_u24lambda_u245$iv.m1371setSelection5zctL8(TextRangeKt.TextRange(newCursor$iv));
            }
            if (newWedgeAffinity$iv != null) {
                $this$moveCursorTo_u24lambda_u245$iv.setWedgeAffinity(newWedgeAffinity$iv);
            }
        }
        return this;
    }

    public final TextFieldPreparedSelection moveCursorNextByChar() {
        this.textPreparedSelectionState.resetCachedX();
        if (this.text.length() > 0) {
            TextFieldPreparedSelection $this$moveCursorTo_u24lambda_u245$iv = this;
            int oldCursor$iv = TextRange.m6454getEndimpl($this$moveCursorTo_u24lambda_u245$iv.getSelection());
            long jCalculateNextCursorPositionAndWedgeAffinity = TextPreparedSelectionKt.calculateNextCursorPositionAndWedgeAffinity(StringHelpers_androidKt.findFollowingBreak(this.text, TextRange.m6454getEndimpl(this.selection)), oldCursor$iv, $this$moveCursorTo_u24lambda_u245$iv.state);
            int newCursor$iv = CursorAndWedgeAffinity.m1344component1impl(jCalculateNextCursorPositionAndWedgeAffinity);
            WedgeAffinity newWedgeAffinity$iv = CursorAndWedgeAffinity.m1345component2impl(jCalculateNextCursorPositionAndWedgeAffinity);
            if (newCursor$iv != oldCursor$iv || !TextRange.m6453getCollapsedimpl($this$moveCursorTo_u24lambda_u245$iv.getSelection())) {
                $this$moveCursorTo_u24lambda_u245$iv.m1371setSelection5zctL8(TextRangeKt.TextRange(newCursor$iv));
            }
            if (newWedgeAffinity$iv != null) {
                $this$moveCursorTo_u24lambda_u245$iv.setWedgeAffinity(newWedgeAffinity$iv);
            }
        }
        return this;
    }

    public final TextFieldPreparedSelection moveCursorToHome() {
        this.textPreparedSelectionState.resetCachedX();
        if (this.text.length() > 0) {
            TextFieldPreparedSelection $this$moveCursorTo_u24lambda_u245$iv = this;
            int oldCursor$iv = TextRange.m6454getEndimpl($this$moveCursorTo_u24lambda_u245$iv.getSelection());
            long jCalculateNextCursorPositionAndWedgeAffinity = TextPreparedSelectionKt.calculateNextCursorPositionAndWedgeAffinity(0, oldCursor$iv, $this$moveCursorTo_u24lambda_u245$iv.state);
            int newCursor$iv = CursorAndWedgeAffinity.m1344component1impl(jCalculateNextCursorPositionAndWedgeAffinity);
            WedgeAffinity newWedgeAffinity$iv = CursorAndWedgeAffinity.m1345component2impl(jCalculateNextCursorPositionAndWedgeAffinity);
            if (newCursor$iv != oldCursor$iv || !TextRange.m6453getCollapsedimpl($this$moveCursorTo_u24lambda_u245$iv.getSelection())) {
                $this$moveCursorTo_u24lambda_u245$iv.m1371setSelection5zctL8(TextRangeKt.TextRange(newCursor$iv));
            }
            if (newWedgeAffinity$iv != null) {
                $this$moveCursorTo_u24lambda_u245$iv.setWedgeAffinity(newWedgeAffinity$iv);
            }
        }
        return this;
    }

    public final TextFieldPreparedSelection moveCursorToEnd() {
        this.textPreparedSelectionState.resetCachedX();
        if (this.text.length() > 0) {
            TextFieldPreparedSelection $this$moveCursorTo_u24lambda_u245$iv = this;
            int oldCursor$iv = TextRange.m6454getEndimpl($this$moveCursorTo_u24lambda_u245$iv.getSelection());
            long jCalculateNextCursorPositionAndWedgeAffinity = TextPreparedSelectionKt.calculateNextCursorPositionAndWedgeAffinity(this.text.length(), oldCursor$iv, $this$moveCursorTo_u24lambda_u245$iv.state);
            int newCursor$iv = CursorAndWedgeAffinity.m1344component1impl(jCalculateNextCursorPositionAndWedgeAffinity);
            WedgeAffinity newWedgeAffinity$iv = CursorAndWedgeAffinity.m1345component2impl(jCalculateNextCursorPositionAndWedgeAffinity);
            if (newCursor$iv != oldCursor$iv || !TextRange.m6453getCollapsedimpl($this$moveCursorTo_u24lambda_u245$iv.getSelection())) {
                $this$moveCursorTo_u24lambda_u245$iv.m1371setSelection5zctL8(TextRangeKt.TextRange(newCursor$iv));
            }
            if (newWedgeAffinity$iv != null) {
                $this$moveCursorTo_u24lambda_u245$iv.setWedgeAffinity(newWedgeAffinity$iv);
            }
        }
        return this;
    }

    public final TextFieldPreparedSelection moveCursorLeftByWord() {
        if (isLtr()) {
            return moveCursorPrevByWord();
        }
        return moveCursorNextByWord();
    }

    public final TextFieldPreparedSelection moveCursorRightByWord() {
        if (isLtr()) {
            return moveCursorNextByWord();
        }
        return moveCursorPrevByWord();
    }

    public final TextFieldPreparedSelection moveCursorNextByWord() {
        this.textPreparedSelectionState.resetCachedX();
        if (this.text.length() > 0) {
            TextFieldPreparedSelection $this$moveCursorTo_u24lambda_u245$iv = this;
            int oldCursor$iv = TextRange.m6454getEndimpl($this$moveCursorTo_u24lambda_u245$iv.getSelection());
            TextLayoutResult textLayoutResult = this.textLayoutResult;
            long jCalculateNextCursorPositionAndWedgeAffinity = TextPreparedSelectionKt.calculateNextCursorPositionAndWedgeAffinity(textLayoutResult != null ? getNextWordOffsetForLayout$default(this, textLayoutResult, 0, 1, null) : this.text.length(), oldCursor$iv, $this$moveCursorTo_u24lambda_u245$iv.state);
            int newCursor$iv = CursorAndWedgeAffinity.m1344component1impl(jCalculateNextCursorPositionAndWedgeAffinity);
            WedgeAffinity newWedgeAffinity$iv = CursorAndWedgeAffinity.m1345component2impl(jCalculateNextCursorPositionAndWedgeAffinity);
            if (newCursor$iv != oldCursor$iv || !TextRange.m6453getCollapsedimpl($this$moveCursorTo_u24lambda_u245$iv.getSelection())) {
                $this$moveCursorTo_u24lambda_u245$iv.m1371setSelection5zctL8(TextRangeKt.TextRange(newCursor$iv));
            }
            if (newWedgeAffinity$iv != null) {
                $this$moveCursorTo_u24lambda_u245$iv.setWedgeAffinity(newWedgeAffinity$iv);
            }
        }
        return this;
    }

    public final TextFieldPreparedSelection moveCursorPrevByWord() {
        this.textPreparedSelectionState.resetCachedX();
        if (this.text.length() > 0) {
            TextFieldPreparedSelection $this$moveCursorTo_u24lambda_u245$iv = this;
            int oldCursor$iv = TextRange.m6454getEndimpl($this$moveCursorTo_u24lambda_u245$iv.getSelection());
            TextLayoutResult textLayoutResult = this.textLayoutResult;
            long jCalculateNextCursorPositionAndWedgeAffinity = TextPreparedSelectionKt.calculateNextCursorPositionAndWedgeAffinity(textLayoutResult != null ? getPrevWordOffsetForLayout$default(this, textLayoutResult, 0, 1, null) : 0, oldCursor$iv, $this$moveCursorTo_u24lambda_u245$iv.state);
            int newCursor$iv = CursorAndWedgeAffinity.m1344component1impl(jCalculateNextCursorPositionAndWedgeAffinity);
            WedgeAffinity newWedgeAffinity$iv = CursorAndWedgeAffinity.m1345component2impl(jCalculateNextCursorPositionAndWedgeAffinity);
            if (newCursor$iv != oldCursor$iv || !TextRange.m6453getCollapsedimpl($this$moveCursorTo_u24lambda_u245$iv.getSelection())) {
                $this$moveCursorTo_u24lambda_u245$iv.m1371setSelection5zctL8(TextRangeKt.TextRange(newCursor$iv));
            }
            if (newWedgeAffinity$iv != null) {
                $this$moveCursorTo_u24lambda_u245$iv.setWedgeAffinity(newWedgeAffinity$iv);
            }
        }
        return this;
    }

    public final TextFieldPreparedSelection moveCursorPrevByParagraph() {
        this.textPreparedSelectionState.resetCachedX();
        if (this.text.length() > 0) {
            TextFieldPreparedSelection $this$moveCursorTo_u24lambda_u245$iv = this;
            int oldCursor$iv = TextRange.m6454getEndimpl($this$moveCursorTo_u24lambda_u245$iv.getSelection());
            int paragraphStart = StringHelpersKt.findParagraphStart(this.text, TextRange.m6457getMinimpl(this.selection));
            if (paragraphStart == TextRange.m6457getMinimpl(this.selection) && paragraphStart != 0) {
                paragraphStart = StringHelpersKt.findParagraphStart(this.text, paragraphStart - 1);
            }
            long jCalculateNextCursorPositionAndWedgeAffinity = TextPreparedSelectionKt.calculateNextCursorPositionAndWedgeAffinity(paragraphStart, oldCursor$iv, $this$moveCursorTo_u24lambda_u245$iv.state);
            int newCursor$iv = CursorAndWedgeAffinity.m1344component1impl(jCalculateNextCursorPositionAndWedgeAffinity);
            WedgeAffinity newWedgeAffinity$iv = CursorAndWedgeAffinity.m1345component2impl(jCalculateNextCursorPositionAndWedgeAffinity);
            if (newCursor$iv != oldCursor$iv || !TextRange.m6453getCollapsedimpl($this$moveCursorTo_u24lambda_u245$iv.getSelection())) {
                $this$moveCursorTo_u24lambda_u245$iv.m1371setSelection5zctL8(TextRangeKt.TextRange(newCursor$iv));
            }
            if (newWedgeAffinity$iv != null) {
                $this$moveCursorTo_u24lambda_u245$iv.setWedgeAffinity(newWedgeAffinity$iv);
            }
        }
        return this;
    }

    public final TextFieldPreparedSelection moveCursorNextByParagraph() {
        this.textPreparedSelectionState.resetCachedX();
        if (this.text.length() > 0) {
            TextFieldPreparedSelection $this$moveCursorTo_u24lambda_u245$iv = this;
            int oldCursor$iv = TextRange.m6454getEndimpl($this$moveCursorTo_u24lambda_u245$iv.getSelection());
            int paragraphEnd = StringHelpersKt.findParagraphEnd(this.text, TextRange.m6456getMaximpl(this.selection));
            if (paragraphEnd == TextRange.m6456getMaximpl(this.selection) && paragraphEnd != this.text.length()) {
                paragraphEnd = StringHelpersKt.findParagraphEnd(this.text, paragraphEnd + 1);
            }
            long jCalculateNextCursorPositionAndWedgeAffinity = TextPreparedSelectionKt.calculateNextCursorPositionAndWedgeAffinity(paragraphEnd, oldCursor$iv, $this$moveCursorTo_u24lambda_u245$iv.state);
            int newCursor$iv = CursorAndWedgeAffinity.m1344component1impl(jCalculateNextCursorPositionAndWedgeAffinity);
            WedgeAffinity newWedgeAffinity$iv = CursorAndWedgeAffinity.m1345component2impl(jCalculateNextCursorPositionAndWedgeAffinity);
            if (newCursor$iv != oldCursor$iv || !TextRange.m6453getCollapsedimpl($this$moveCursorTo_u24lambda_u245$iv.getSelection())) {
                $this$moveCursorTo_u24lambda_u245$iv.m1371setSelection5zctL8(TextRangeKt.TextRange(newCursor$iv));
            }
            if (newWedgeAffinity$iv != null) {
                $this$moveCursorTo_u24lambda_u245$iv.setWedgeAffinity(newWedgeAffinity$iv);
            }
        }
        return this;
    }

    public final TextFieldPreparedSelection moveCursorUpByLine() {
        if (this.text.length() > 0) {
            TextFieldPreparedSelection $this$moveCursorTo_u24lambda_u245$iv = this;
            int oldCursor$iv = TextRange.m6454getEndimpl($this$moveCursorTo_u24lambda_u245$iv.getSelection());
            TextLayoutResult textLayoutResult = this.textLayoutResult;
            long jCalculateNextCursorPositionAndWedgeAffinity = TextPreparedSelectionKt.calculateNextCursorPositionAndWedgeAffinity(textLayoutResult != null ? jumpByLinesOffset(textLayoutResult, -1) : 0, oldCursor$iv, $this$moveCursorTo_u24lambda_u245$iv.state);
            int newCursor$iv = CursorAndWedgeAffinity.m1344component1impl(jCalculateNextCursorPositionAndWedgeAffinity);
            WedgeAffinity newWedgeAffinity$iv = CursorAndWedgeAffinity.m1345component2impl(jCalculateNextCursorPositionAndWedgeAffinity);
            if (newCursor$iv != oldCursor$iv || !TextRange.m6453getCollapsedimpl($this$moveCursorTo_u24lambda_u245$iv.getSelection())) {
                $this$moveCursorTo_u24lambda_u245$iv.m1371setSelection5zctL8(TextRangeKt.TextRange(newCursor$iv));
            }
            if (newWedgeAffinity$iv != null) {
                $this$moveCursorTo_u24lambda_u245$iv.setWedgeAffinity(newWedgeAffinity$iv);
            }
        }
        return this;
    }

    public final TextFieldPreparedSelection moveCursorDownByLine() {
        if (this.text.length() > 0) {
            TextFieldPreparedSelection $this$moveCursorTo_u24lambda_u245$iv = this;
            int oldCursor$iv = TextRange.m6454getEndimpl($this$moveCursorTo_u24lambda_u245$iv.getSelection());
            TextLayoutResult textLayoutResult = this.textLayoutResult;
            long jCalculateNextCursorPositionAndWedgeAffinity = TextPreparedSelectionKt.calculateNextCursorPositionAndWedgeAffinity(textLayoutResult != null ? jumpByLinesOffset(textLayoutResult, 1) : this.text.length(), oldCursor$iv, $this$moveCursorTo_u24lambda_u245$iv.state);
            int newCursor$iv = CursorAndWedgeAffinity.m1344component1impl(jCalculateNextCursorPositionAndWedgeAffinity);
            WedgeAffinity newWedgeAffinity$iv = CursorAndWedgeAffinity.m1345component2impl(jCalculateNextCursorPositionAndWedgeAffinity);
            if (newCursor$iv != oldCursor$iv || !TextRange.m6453getCollapsedimpl($this$moveCursorTo_u24lambda_u245$iv.getSelection())) {
                $this$moveCursorTo_u24lambda_u245$iv.m1371setSelection5zctL8(TextRangeKt.TextRange(newCursor$iv));
            }
            if (newWedgeAffinity$iv != null) {
                $this$moveCursorTo_u24lambda_u245$iv.setWedgeAffinity(newWedgeAffinity$iv);
            }
        }
        return this;
    }

    public final TextFieldPreparedSelection moveCursorToLineLeftSide() {
        if (isLtr()) {
            return moveCursorToLineStart();
        }
        return moveCursorToLineEnd();
    }

    public final TextFieldPreparedSelection moveCursorToLineRightSide() {
        if (isLtr()) {
            return moveCursorToLineEnd();
        }
        return moveCursorToLineStart();
    }

    public final TextFieldPreparedSelection moveCursorToLineStart() {
        this.textPreparedSelectionState.resetCachedX();
        if (this.text.length() > 0) {
            TextFieldPreparedSelection $this$moveCursorTo_u24lambda_u245$iv = this;
            int oldCursor$iv = TextRange.m6454getEndimpl($this$moveCursorTo_u24lambda_u245$iv.getSelection());
            TextLayoutResult textLayoutResult = this.textLayoutResult;
            long jCalculateNextCursorPositionAndWedgeAffinity = TextPreparedSelectionKt.calculateNextCursorPositionAndWedgeAffinity(textLayoutResult != null ? getLineStartByOffsetForLayout$default(this, textLayoutResult, 0, 1, null) : 0, oldCursor$iv, $this$moveCursorTo_u24lambda_u245$iv.state);
            int newCursor$iv = CursorAndWedgeAffinity.m1344component1impl(jCalculateNextCursorPositionAndWedgeAffinity);
            WedgeAffinity newWedgeAffinity$iv = CursorAndWedgeAffinity.m1345component2impl(jCalculateNextCursorPositionAndWedgeAffinity);
            if (newCursor$iv != oldCursor$iv || !TextRange.m6453getCollapsedimpl($this$moveCursorTo_u24lambda_u245$iv.getSelection())) {
                $this$moveCursorTo_u24lambda_u245$iv.m1371setSelection5zctL8(TextRangeKt.TextRange(newCursor$iv));
            }
            if (newWedgeAffinity$iv != null) {
                $this$moveCursorTo_u24lambda_u245$iv.setWedgeAffinity(newWedgeAffinity$iv);
            }
        }
        return this;
    }

    public final TextFieldPreparedSelection moveCursorToLineEnd() {
        this.textPreparedSelectionState.resetCachedX();
        if (this.text.length() > 0) {
            TextFieldPreparedSelection $this$moveCursorTo_u24lambda_u245$iv = this;
            int oldCursor$iv = TextRange.m6454getEndimpl($this$moveCursorTo_u24lambda_u245$iv.getSelection());
            TextLayoutResult textLayoutResult = this.textLayoutResult;
            long jCalculateNextCursorPositionAndWedgeAffinity = TextPreparedSelectionKt.calculateNextCursorPositionAndWedgeAffinity(textLayoutResult != null ? getLineEndByOffsetForLayout$default(this, textLayoutResult, 0, 1, null) : this.text.length(), oldCursor$iv, $this$moveCursorTo_u24lambda_u245$iv.state);
            int newCursor$iv = CursorAndWedgeAffinity.m1344component1impl(jCalculateNextCursorPositionAndWedgeAffinity);
            WedgeAffinity newWedgeAffinity$iv = CursorAndWedgeAffinity.m1345component2impl(jCalculateNextCursorPositionAndWedgeAffinity);
            if (newCursor$iv != oldCursor$iv || !TextRange.m6453getCollapsedimpl($this$moveCursorTo_u24lambda_u245$iv.getSelection())) {
                $this$moveCursorTo_u24lambda_u245$iv.m1371setSelection5zctL8(TextRangeKt.TextRange(newCursor$iv));
            }
            if (newWedgeAffinity$iv != null) {
                $this$moveCursorTo_u24lambda_u245$iv.setWedgeAffinity(newWedgeAffinity$iv);
            }
        }
        return this;
    }

    public final TextFieldPreparedSelection moveCursorUpByPage() {
        if (this.text.length() > 0) {
            TextFieldPreparedSelection $this$moveCursorTo_u24lambda_u245$iv = this;
            int oldCursor$iv = TextRange.m6454getEndimpl($this$moveCursorTo_u24lambda_u245$iv.getSelection());
            long jCalculateNextCursorPositionAndWedgeAffinity = TextPreparedSelectionKt.calculateNextCursorPositionAndWedgeAffinity(jumpByPagesOffset(-1), oldCursor$iv, $this$moveCursorTo_u24lambda_u245$iv.state);
            int newCursor$iv = CursorAndWedgeAffinity.m1344component1impl(jCalculateNextCursorPositionAndWedgeAffinity);
            WedgeAffinity newWedgeAffinity$iv = CursorAndWedgeAffinity.m1345component2impl(jCalculateNextCursorPositionAndWedgeAffinity);
            if (newCursor$iv != oldCursor$iv || !TextRange.m6453getCollapsedimpl($this$moveCursorTo_u24lambda_u245$iv.getSelection())) {
                $this$moveCursorTo_u24lambda_u245$iv.m1371setSelection5zctL8(TextRangeKt.TextRange(newCursor$iv));
            }
            if (newWedgeAffinity$iv != null) {
                $this$moveCursorTo_u24lambda_u245$iv.setWedgeAffinity(newWedgeAffinity$iv);
            }
        }
        return this;
    }

    public final TextFieldPreparedSelection moveCursorDownByPage() {
        if (this.text.length() > 0) {
            TextFieldPreparedSelection $this$moveCursorTo_u24lambda_u245$iv = this;
            int oldCursor$iv = TextRange.m6454getEndimpl($this$moveCursorTo_u24lambda_u245$iv.getSelection());
            long jCalculateNextCursorPositionAndWedgeAffinity = TextPreparedSelectionKt.calculateNextCursorPositionAndWedgeAffinity(jumpByPagesOffset(1), oldCursor$iv, $this$moveCursorTo_u24lambda_u245$iv.state);
            int newCursor$iv = CursorAndWedgeAffinity.m1344component1impl(jCalculateNextCursorPositionAndWedgeAffinity);
            WedgeAffinity newWedgeAffinity$iv = CursorAndWedgeAffinity.m1345component2impl(jCalculateNextCursorPositionAndWedgeAffinity);
            if (newCursor$iv != oldCursor$iv || !TextRange.m6453getCollapsedimpl($this$moveCursorTo_u24lambda_u245$iv.getSelection())) {
                $this$moveCursorTo_u24lambda_u245$iv.m1371setSelection5zctL8(TextRangeKt.TextRange(newCursor$iv));
            }
            if (newWedgeAffinity$iv != null) {
                $this$moveCursorTo_u24lambda_u245$iv.setWedgeAffinity(newWedgeAffinity$iv);
            }
        }
        return this;
    }

    public final TextFieldPreparedSelection selectMovement() {
        if (this.text.length() > 0) {
            TextFieldPreparedSelection $this$selectMovement_u24lambda_u2420 = this;
            $this$selectMovement_u24lambda_u2420.selection = TextRangeKt.TextRange(TextRange.m6459getStartimpl($this$selectMovement_u24lambda_u2420.initialValue.getSelection()), TextRange.m6454getEndimpl($this$selectMovement_u24lambda_u2420.selection));
        }
        return this;
    }

    public final TextFieldPreparedSelection deleteMovement() {
        if (this.text.length() > 0) {
            TextFieldPreparedSelection $this$deleteMovement_u24lambda_u2421 = this;
            if (!TextRange.m6453getCollapsedimpl($this$deleteMovement_u24lambda_u2421.initialValue.getSelection())) {
                $this$deleteMovement_u24lambda_u2421.state.deleteSelectedText();
            } else {
                TransformedTextFieldState.m1329replaceTextM8tDOmk$default($this$deleteMovement_u24lambda_u2421.state, "", TextRangeKt.TextRange(TextRange.m6459getStartimpl($this$deleteMovement_u24lambda_u2421.initialValue.getSelection()), TextRange.m6454getEndimpl($this$deleteMovement_u24lambda_u2421.selection)), null, !$this$deleteMovement_u24lambda_u2421.isFromSoftKeyboard, 4, null);
            }
            $this$deleteMovement_u24lambda_u2421.selection = $this$deleteMovement_u24lambda_u2421.state.getVisualText().getSelection();
            $this$deleteMovement_u24lambda_u2421.wedgeAffinity = WedgeAffinity.Start;
        }
        return this;
    }

    private final boolean isLtr() {
        ResolvedTextDirection direction;
        TextLayoutResult textLayoutResult = this.textLayoutResult;
        return textLayoutResult == null || (direction = textLayoutResult.getParagraphDirection(TextRange.m6454getEndimpl(this.selection))) == null || direction == ResolvedTextDirection.Ltr;
    }

    static /* synthetic */ int getNextWordOffsetForLayout$default(TextFieldPreparedSelection textFieldPreparedSelection, TextLayoutResult textLayoutResult, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = TextRange.m6454getEndimpl(textFieldPreparedSelection.selection);
        }
        return textFieldPreparedSelection.getNextWordOffsetForLayout(textLayoutResult, i);
    }

    private final int getNextWordOffsetForLayout(TextLayoutResult $this$getNextWordOffsetForLayout, int currentOffset) {
        while (currentOffset < this.initialValue.length()) {
            long currentWord = $this$getNextWordOffsetForLayout.m6431getWordBoundaryjx7JFs(charOffset(currentOffset));
            if (TextRange.m6454getEndimpl(currentWord) <= currentOffset) {
                currentOffset++;
            } else {
                return TextRange.m6454getEndimpl(currentWord);
            }
        }
        return this.initialValue.length();
    }

    static /* synthetic */ int getPrevWordOffsetForLayout$default(TextFieldPreparedSelection textFieldPreparedSelection, TextLayoutResult textLayoutResult, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = TextRange.m6454getEndimpl(textFieldPreparedSelection.selection);
        }
        return textFieldPreparedSelection.getPrevWordOffsetForLayout(textLayoutResult, i);
    }

    private final int getPrevWordOffsetForLayout(TextLayoutResult $this$getPrevWordOffsetForLayout, int currentOffset) {
        while (currentOffset > 0) {
            long currentWord = $this$getPrevWordOffsetForLayout.m6431getWordBoundaryjx7JFs(charOffset(currentOffset));
            if (TextRange.m6459getStartimpl(currentWord) >= currentOffset) {
                currentOffset--;
            } else {
                return TextRange.m6459getStartimpl(currentWord);
            }
        }
        return 0;
    }

    static /* synthetic */ int getLineStartByOffsetForLayout$default(TextFieldPreparedSelection textFieldPreparedSelection, TextLayoutResult textLayoutResult, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = TextRange.m6457getMinimpl(textFieldPreparedSelection.selection);
        }
        return textFieldPreparedSelection.getLineStartByOffsetForLayout(textLayoutResult, i);
    }

    private final int getLineStartByOffsetForLayout(TextLayoutResult $this$getLineStartByOffsetForLayout, int currentOffset) {
        int currentLine = $this$getLineStartByOffsetForLayout.getLineForOffset(currentOffset);
        return $this$getLineStartByOffsetForLayout.getLineStart(currentLine);
    }

    static /* synthetic */ int getLineEndByOffsetForLayout$default(TextFieldPreparedSelection textFieldPreparedSelection, TextLayoutResult textLayoutResult, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = TextRange.m6456getMaximpl(textFieldPreparedSelection.selection);
        }
        return textFieldPreparedSelection.getLineEndByOffsetForLayout(textLayoutResult, i);
    }

    private final int getLineEndByOffsetForLayout(TextLayoutResult $this$getLineEndByOffsetForLayout, int currentOffset) {
        int currentLine = $this$getLineEndByOffsetForLayout.getLineForOffset(currentOffset);
        return $this$getLineEndByOffsetForLayout.getLineEnd(currentLine, true);
    }

    private final int jumpByLinesOffset(TextLayoutResult $this$jumpByLinesOffset, int linesAmount) {
        int currentOffset = TextRange.m6454getEndimpl(this.selection);
        if (Float.isNaN(this.textPreparedSelectionState.getCachedX())) {
            this.textPreparedSelectionState.setCachedX($this$jumpByLinesOffset.getCursorRect(currentOffset).getLeft());
        }
        int targetLine = $this$jumpByLinesOffset.getLineForOffset(currentOffset) + linesAmount;
        if (targetLine < 0) {
            return 0;
        }
        if (targetLine >= $this$jumpByLinesOffset.getLineCount()) {
            return this.text.length();
        }
        float y = $this$jumpByLinesOffset.getLineBottom(targetLine) - 1;
        float x = this.textPreparedSelectionState.getCachedX();
        if ((isLtr() && x >= $this$jumpByLinesOffset.getLineRight(targetLine)) || (!isLtr() && x <= $this$jumpByLinesOffset.getLineLeft(targetLine))) {
            return $this$jumpByLinesOffset.getLineEnd(targetLine, true);
        }
        long v1$iv$iv = Float.floatToRawIntBits(x);
        long v2$iv$iv = Float.floatToRawIntBits(y);
        int $i$f$Offset = $this$jumpByLinesOffset.m6429getOffsetForPositionk4lQ0M(Offset.m4141constructorimpl((v1$iv$iv << 32) | (4294967295L & v2$iv$iv)));
        return $i$f$Offset;
    }

    private final int jumpByPagesOffset(int pagesAmount) {
        int currentOffset = TextRange.m6454getEndimpl(this.initialValue.getSelection());
        if (this.textLayoutResult == null || Float.isNaN(this.visibleTextLayoutHeight)) {
            return currentOffset;
        }
        Rect currentPos = this.textLayoutResult.getCursorRect(currentOffset);
        Rect newPos = currentPos.translate(0.0f, this.visibleTextLayoutHeight * pagesAmount);
        int topLine = this.textLayoutResult.getLineForVerticalPosition(newPos.getTop());
        float lineSeparator = this.textLayoutResult.getLineBottom(topLine);
        if (Math.abs(newPos.getTop() - lineSeparator) > Math.abs(newPos.getBottom() - lineSeparator)) {
            return this.textLayoutResult.m6429getOffsetForPositionk4lQ0M(newPos.m4184getTopLeftF1C5BW0());
        }
        return this.textLayoutResult.m6429getOffsetForPositionk4lQ0M(newPos.m4177getBottomLeftF1C5BW0());
    }

    private final int charOffset(int offset) {
        return RangesKt.coerceAtMost(offset, this.text.length() - 1);
    }
}
