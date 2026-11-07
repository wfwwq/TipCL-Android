package androidx.compose.foundation.text.input.internal.undo;

import androidx.compose.foundation.text.input.TextFieldBuffer;
import androidx.compose.foundation.text.input.TextFieldBufferKt;
import androidx.compose.foundation.text.input.TextFieldCharSequence;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.ui.text.TextRange;
import kotlin.Metadata;

/* compiled from: TextUndoOperation.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000\u001a\u0014\u0010\u0005\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000¨\u0006\u0006"}, d2 = {"redo", "", "Landroidx/compose/foundation/text/input/TextFieldState;", "op", "Landroidx/compose/foundation/text/input/internal/undo/TextUndoOperation;", "undo", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TextUndoOperationKt {
    public static final void undo(TextFieldState $this$undo, TextUndoOperation op) {
        $this$undo.getMainBuffer().getChangeTracker$foundation_release().clearChanges();
        TextFieldBuffer $this$undo_u24lambda_u240 = $this$undo.getMainBuffer();
        $this$undo_u24lambda_u240.replace(op.getIndex(), op.getIndex() + op.getPostText().length(), op.getPreText());
        TextFieldBufferKt.setSelectionCoerced($this$undo_u24lambda_u240, TextRange.m6459getStartimpl(op.getPreSelection()), TextRange.m6454getEndimpl(op.getPreSelection()));
        TextFieldCharSequence afterEditValue$iv = TextFieldBuffer.m1192toTextFieldCharSequenceI88jaVs$foundation_release$default($this$undo.getMainBuffer(), 0L, null, null, 7, null);
        $this$undo.updateValueAndNotifyListeners($this$undo.getValue$foundation_release(), afterEditValue$iv, true);
    }

    public static final void redo(TextFieldState $this$redo, TextUndoOperation op) {
        $this$redo.getMainBuffer().getChangeTracker$foundation_release().clearChanges();
        TextFieldBuffer $this$redo_u24lambda_u241 = $this$redo.getMainBuffer();
        $this$redo_u24lambda_u241.replace(op.getIndex(), op.getIndex() + op.getPreText().length(), op.getPostText());
        TextFieldBufferKt.setSelectionCoerced($this$redo_u24lambda_u241, TextRange.m6459getStartimpl(op.getPostSelection()), TextRange.m6454getEndimpl(op.getPostSelection()));
        TextFieldCharSequence afterEditValue$iv = TextFieldBuffer.m1192toTextFieldCharSequenceI88jaVs$foundation_release$default($this$redo.getMainBuffer(), 0L, null, null, 7, null);
        $this$redo.updateValueAndNotifyListeners($this$redo.getValue$foundation_release(), afterEditValue$iv, true);
    }
}
