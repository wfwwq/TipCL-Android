package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.text.input.TextFieldBuffer;
import androidx.compose.foundation.text.input.TextFieldBufferKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import com.pymcl.multiplayer.TerracottaVpnService;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.ranges.RangesKt;

/* compiled from: ImeEditCommand.android.kt */
@Metadata(d1 = {"\u0000L\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0002\u001a\u001c\u0010\u0005\u001a\u00020\u0006*\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0000\u001a\u001c\u0010\f\u001a\u00020\u0006*\u00020\u00072\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000bH\u0000\u001a\u001c\u0010\u000f\u001a\u00020\u0006*\u00020\u00072\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000bH\u0000\u001a\f\u0010\u0010\u001a\u00020\u0006*\u00020\u0007H\u0000\u001a\u001c\u0010\u0011\u001a\u00020\u0006*\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u000bH\u0001\u001a$\u0010\u0015\u001a\u00020\u0006*\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u0016H\u0001\u001a\u001c\u0010\u0017\u001a\u00020\u0006*\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u000bH\u0000\u001a8\u0010\u0018\u001a\u00020\u0006*\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u001a\b\u0002\u0010\u0019\u001a\u0014\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u001c0\u001bj\u0002`\u001d\u0018\u00010\u001aH\u0000\u001a\u001c\u0010\u001e\u001a\u00020\u0006*\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u000bH\u0000¨\u0006\u001f"}, d2 = {"isSurrogatePair", "", "high", "", "low", "commitText", "", "Landroidx/compose/foundation/text/input/internal/ImeEditCommandScope;", TerracottaVpnService.EXTRA_TEXT, "", "newCursorPosition", "", "deleteSurroundingText", "lengthBeforeCursor", "lengthAfterCursor", "deleteSurroundingTextInCodePoints", "finishComposingText", "imeDelete", "Landroidx/compose/foundation/text/input/TextFieldBuffer;", "start", "end", "imeReplace", "", "setComposingRegion", "setComposingText", "annotations", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/AnnotatedString$Annotation;", "Landroidx/compose/foundation/text/input/PlacedAnnotation;", "setSelection", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ImeEditCommand_androidKt {
    public static final void commitText(ImeEditCommandScope $this$commitText, final String text, final int newCursorPosition) {
        $this$commitText.edit(new Function1<TextFieldBuffer, Unit>() { // from class: androidx.compose.foundation.text.input.internal.ImeEditCommand_androidKt.commitText.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(TextFieldBuffer textFieldBuffer) {
                invoke2(textFieldBuffer);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(TextFieldBuffer $this$edit) {
                int newCursorInBuffer;
                TextRange compositionRange = $this$edit.getComposition();
                if (compositionRange != null) {
                    ImeEditCommand_androidKt.imeReplace($this$edit, TextRange.m6459getStartimpl(compositionRange.getPackedValue()), TextRange.m6454getEndimpl(compositionRange.getPackedValue()), text);
                } else {
                    ImeEditCommand_androidKt.imeReplace($this$edit, TextRange.m6459getStartimpl($this$edit.getSelectionInChars()), TextRange.m6454getEndimpl($this$edit.getSelectionInChars()), text);
                }
                int newCursor = TextRange.m6459getStartimpl($this$edit.getSelectionInChars());
                if (newCursorPosition > 0) {
                    newCursorInBuffer = (newCursorPosition + newCursor) - 1;
                } else {
                    newCursorInBuffer = (newCursorPosition + newCursor) - text.length();
                }
                $this$edit.m1197setSelection5zctL8(TextRangeKt.TextRange(RangesKt.coerceIn(newCursorInBuffer, 0, $this$edit.getLength())));
            }
        });
    }

    public static final void setComposingRegion(ImeEditCommandScope $this$setComposingRegion, final int start, final int end) {
        $this$setComposingRegion.edit(new Function1<TextFieldBuffer, Unit>() { // from class: androidx.compose.foundation.text.input.internal.ImeEditCommand_androidKt.setComposingRegion.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(TextFieldBuffer textFieldBuffer) {
                invoke2(textFieldBuffer);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(TextFieldBuffer $this$edit) {
                if ($this$edit.hasComposition$foundation_release()) {
                    $this$edit.commitComposition$foundation_release();
                }
                int clampedStart = RangesKt.coerceIn(start, 0, $this$edit.getLength());
                int clampedEnd = RangesKt.coerceIn(end, 0, $this$edit.getLength());
                if (clampedStart != clampedEnd) {
                    if (clampedStart < clampedEnd) {
                        TextFieldBuffer.setComposition$foundation_release$default($this$edit, clampedStart, clampedEnd, null, 4, null);
                    } else {
                        TextFieldBuffer.setComposition$foundation_release$default($this$edit, clampedEnd, clampedStart, null, 4, null);
                    }
                }
            }
        });
    }

    public static /* synthetic */ void setComposingText$default(ImeEditCommandScope imeEditCommandScope, String str, int i, List list, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            list = null;
        }
        setComposingText(imeEditCommandScope, str, i, list);
    }

    public static final void setComposingText(ImeEditCommandScope $this$setComposingText, final String text, final int newCursorPosition, final List<AnnotatedString.Range<AnnotatedString.Annotation>> list) {
        $this$setComposingText.edit(new Function1<TextFieldBuffer, Unit>() { // from class: androidx.compose.foundation.text.input.internal.ImeEditCommand_androidKt.setComposingText.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(TextFieldBuffer textFieldBuffer) {
                invoke2(textFieldBuffer);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(TextFieldBuffer $this$edit) {
                int newCursorInBuffer;
                TextRange compositionRange = $this$edit.getComposition();
                if (compositionRange != null) {
                    ImeEditCommand_androidKt.imeReplace($this$edit, TextRange.m6459getStartimpl(compositionRange.getPackedValue()), TextRange.m6454getEndimpl(compositionRange.getPackedValue()), text);
                    if (text.length() > 0) {
                        $this$edit.setComposition$foundation_release(TextRange.m6459getStartimpl(compositionRange.getPackedValue()), TextRange.m6459getStartimpl(compositionRange.getPackedValue()) + text.length(), list);
                    }
                } else {
                    int initialSelectionStart = TextRange.m6459getStartimpl($this$edit.getSelectionInChars());
                    ImeEditCommand_androidKt.imeReplace($this$edit, initialSelectionStart, TextRange.m6454getEndimpl($this$edit.getSelectionInChars()), text);
                    if (text.length() > 0) {
                        $this$edit.setComposition$foundation_release(initialSelectionStart, text.length() + initialSelectionStart, list);
                    }
                }
                int newCursor = TextRange.m6459getStartimpl($this$edit.getSelectionInChars());
                if (newCursorPosition > 0) {
                    newCursorInBuffer = (newCursorPosition + newCursor) - 1;
                } else {
                    newCursorInBuffer = (newCursorPosition + newCursor) - text.length();
                }
                $this$edit.m1197setSelection5zctL8(TextRangeKt.TextRange(RangesKt.coerceIn(newCursorInBuffer, 0, $this$edit.getLength())));
            }
        });
    }

    public static final void deleteSurroundingText(ImeEditCommandScope $this$deleteSurroundingText, final int lengthBeforeCursor, final int lengthAfterCursor) {
        $this$deleteSurroundingText.edit(new Function1<TextFieldBuffer, Unit>() { // from class: androidx.compose.foundation.text.input.internal.ImeEditCommand_androidKt.deleteSurroundingText.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(TextFieldBuffer textFieldBuffer) {
                invoke2(textFieldBuffer);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(TextFieldBuffer $this$edit) {
                boolean value$iv = lengthBeforeCursor >= 0 && lengthAfterCursor >= 0;
                int i = lengthBeforeCursor;
                int i2 = lengthAfterCursor;
                if (!value$iv) {
                    InlineClassHelperKt.throwIllegalArgumentException("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i + " and " + i2 + " respectively.");
                }
                int $this$addExactOrElse$iv = TextRange.m6454getEndimpl($this$edit.getSelectionInChars());
                int right$iv = lengthAfterCursor;
                int result$iv = $this$addExactOrElse$iv + right$iv;
                if ((($this$addExactOrElse$iv ^ result$iv) & (right$iv ^ result$iv)) < 0) {
                    result$iv = $this$edit.getLength();
                }
                ImeEditCommand_androidKt.imeDelete($this$edit, TextRange.m6454getEndimpl($this$edit.getSelectionInChars()), Math.min(result$iv, $this$edit.getLength()));
                int $this$subtractExactOrElse$iv = TextRange.m6459getStartimpl($this$edit.getSelectionInChars());
                int right$iv2 = lengthBeforeCursor;
                int result$iv2 = $this$subtractExactOrElse$iv - right$iv2;
                if ((($this$subtractExactOrElse$iv ^ right$iv2) & ($this$subtractExactOrElse$iv ^ result$iv2)) < 0) {
                    result$iv2 = 0;
                }
                ImeEditCommand_androidKt.imeDelete($this$edit, Math.max(0, result$iv2), TextRange.m6459getStartimpl($this$edit.getSelectionInChars()));
            }
        });
    }

    public static final void deleteSurroundingTextInCodePoints(ImeEditCommandScope $this$deleteSurroundingTextInCodePoints, final int lengthBeforeCursor, final int lengthAfterCursor) {
        $this$deleteSurroundingTextInCodePoints.edit(new Function1<TextFieldBuffer, Unit>() { // from class: androidx.compose.foundation.text.input.internal.ImeEditCommand_androidKt.deleteSurroundingTextInCodePoints.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(TextFieldBuffer textFieldBuffer) {
                invoke2(textFieldBuffer);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(TextFieldBuffer $this$edit) {
                boolean value$iv = lengthBeforeCursor >= 0 && lengthAfterCursor >= 0;
                int i = lengthBeforeCursor;
                int i2 = lengthAfterCursor;
                if (!value$iv) {
                    InlineClassHelperKt.throwIllegalArgumentException("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i + " and " + i2 + " respectively.");
                }
                int beforeLenInChars = 0;
                int i3 = 0;
                while (true) {
                    if (i3 < lengthBeforeCursor) {
                        beforeLenInChars++;
                        if (TextRange.m6459getStartimpl($this$edit.getSelectionInChars()) <= beforeLenInChars) {
                            beforeLenInChars = TextRange.m6459getStartimpl($this$edit.getSelectionInChars());
                            break;
                        }
                        char lead = $this$edit.asCharSequence().charAt((TextRange.m6459getStartimpl($this$edit.getSelectionInChars()) - beforeLenInChars) - 1);
                        char trail = $this$edit.asCharSequence().charAt(TextRange.m6459getStartimpl($this$edit.getSelectionInChars()) - beforeLenInChars);
                        if (ImeEditCommand_androidKt.isSurrogatePair(lead, trail)) {
                            beforeLenInChars++;
                        }
                        i3++;
                    } else {
                        break;
                    }
                }
                int afterLenInChars = 0;
                int i4 = 0;
                while (true) {
                    if (i4 >= lengthAfterCursor) {
                        break;
                    }
                    afterLenInChars++;
                    if (TextRange.m6454getEndimpl($this$edit.getSelectionInChars()) + afterLenInChars >= $this$edit.getLength()) {
                        afterLenInChars = $this$edit.getLength() - TextRange.m6454getEndimpl($this$edit.getSelectionInChars());
                        break;
                    }
                    char lead2 = $this$edit.asCharSequence().charAt((TextRange.m6454getEndimpl($this$edit.getSelectionInChars()) + afterLenInChars) - 1);
                    char trail2 = $this$edit.asCharSequence().charAt(TextRange.m6454getEndimpl($this$edit.getSelectionInChars()) + afterLenInChars);
                    if (ImeEditCommand_androidKt.isSurrogatePair(lead2, trail2)) {
                        afterLenInChars++;
                    }
                    i4++;
                }
                ImeEditCommand_androidKt.imeDelete($this$edit, TextRange.m6454getEndimpl($this$edit.getSelectionInChars()), TextRange.m6454getEndimpl($this$edit.getSelectionInChars()) + afterLenInChars);
                ImeEditCommand_androidKt.imeDelete($this$edit, TextRange.m6459getStartimpl($this$edit.getSelectionInChars()) - beforeLenInChars, TextRange.m6459getStartimpl($this$edit.getSelectionInChars()));
            }
        });
    }

    public static final void finishComposingText(ImeEditCommandScope $this$finishComposingText) {
        $this$finishComposingText.edit(new Function1<TextFieldBuffer, Unit>() { // from class: androidx.compose.foundation.text.input.internal.ImeEditCommand_androidKt.finishComposingText.1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(TextFieldBuffer textFieldBuffer) {
                invoke2(textFieldBuffer);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(TextFieldBuffer $this$edit) {
                $this$edit.commitComposition$foundation_release();
            }
        });
    }

    public static final void setSelection(final ImeEditCommandScope $this$setSelection, final int start, final int end) {
        $this$setSelection.edit(new Function1<TextFieldBuffer, Unit>() { // from class: androidx.compose.foundation.text.input.internal.ImeEditCommand_androidKt.setSelection.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(TextFieldBuffer textFieldBuffer) {
                invoke2(textFieldBuffer);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(TextFieldBuffer $this$edit) {
                long transformedSpaceLength = $this$setSelection.mo1234mapToTransformedGEjPoXI(TextRangeKt.TextRange(0, $this$edit.getLength()));
                int $this$fastCoerceIn$iv = start;
                int minimumValue$iv = TextRange.m6457getMinimpl(transformedSpaceLength);
                int maximumValue$iv = TextRange.m6456getMaximpl(transformedSpaceLength);
                int $this$fastCoerceAtLeast$iv$iv = $this$fastCoerceIn$iv;
                if ($this$fastCoerceAtLeast$iv$iv < minimumValue$iv) {
                    $this$fastCoerceAtLeast$iv$iv = minimumValue$iv;
                }
                if ($this$fastCoerceAtLeast$iv$iv > maximumValue$iv) {
                    $this$fastCoerceAtLeast$iv$iv = maximumValue$iv;
                }
                int $this$fastCoerceIn$iv2 = end;
                int minimumValue$iv2 = TextRange.m6457getMinimpl(transformedSpaceLength);
                int maximumValue$iv2 = TextRange.m6456getMaximpl(transformedSpaceLength);
                int $this$fastCoerceAtLeast$iv$iv2 = $this$fastCoerceIn$iv2;
                if ($this$fastCoerceAtLeast$iv$iv2 < minimumValue$iv2) {
                    $this$fastCoerceAtLeast$iv$iv2 = minimumValue$iv2;
                }
                if ($this$fastCoerceAtLeast$iv$iv2 > maximumValue$iv2) {
                    $this$fastCoerceAtLeast$iv$iv2 = maximumValue$iv2;
                }
                $this$edit.m1197setSelection5zctL8($this$setSelection.mo1233mapFromTransformedGEjPoXI(TextRangeKt.TextRange($this$fastCoerceAtLeast$iv$iv, $this$fastCoerceAtLeast$iv$iv2)));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isSurrogatePair(char high, char low) {
        return Character.isHighSurrogate(high) && Character.isLowSurrogate(low);
    }

    public static final void imeReplace(TextFieldBuffer $this$imeReplace, int start, int end, CharSequence text) {
        int min = Math.min(start, end);
        int max = Math.max(start, end);
        int i = 0;
        int cMin = min;
        while (cMin < max && i < text.length() && text.charAt(i) == $this$imeReplace.asCharSequence().charAt(cMin)) {
            i++;
            cMin++;
        }
        int j = text.length();
        int cMax = max;
        while (cMax > cMin && j > i && text.charAt(j - 1) == $this$imeReplace.asCharSequence().charAt(cMax - 1)) {
            j--;
            cMax--;
        }
        if (cMin != cMax || i != j) {
            $this$imeReplace.replace(cMin, cMax, text.subSequence(i, j));
        } else {
            $this$imeReplace.commitComposition$foundation_release();
            $this$imeReplace.clearHighlight$foundation_release();
        }
        $this$imeReplace.m1197setSelection5zctL8(TextRangeKt.TextRange(text.length() + min));
    }

    public static final void imeDelete(TextFieldBuffer $this$imeDelete, int start, int end) {
        TextRange initialComposition = $this$imeDelete.getComposition();
        int min = Math.min(start, end);
        int max = Math.max(start, end);
        TextFieldBufferKt.delete($this$imeDelete, min, max);
        if (initialComposition != null) {
            initialComposition.getPackedValue();
            long adjustedComposition = TextFieldBufferKt.m1201adjustTextRangevJH6DeI(initialComposition.getPackedValue(), min, max, 0);
            if (TextRange.m6453getCollapsedimpl(adjustedComposition)) {
                $this$imeDelete.commitComposition$foundation_release();
            } else {
                TextFieldBuffer.setComposition$foundation_release$default($this$imeDelete, TextRange.m6457getMinimpl(adjustedComposition), TextRange.m6456getMaximpl(adjustedComposition), null, 4, null);
            }
        }
    }
}
