package top.fifthlight.touchcontroller.proxy.message.input;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: TextInputState.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u000f\u001a\n\u0010\u0007\u001a\u00020\u0002*\u00020\u0002\u001a\n\u0010\b\u001a\u00020\u0002*\u00020\u0002\u001a\n\u0010\t\u001a\u00020\u0002*\u00020\u0002\u001a\n\u0010\n\u001a\u00020\u0002*\u00020\u0002\u001a\n\u0010\u000b\u001a\u00020\u0002*\u00020\u0002\u001a\n\u0010\f\u001a\u00020\u0002*\u00020\u0002\u001a\n\u0010\r\u001a\u00020\u0002*\u00020\u0002\u001a\n\u0010\u000e\u001a\u00020\u0002*\u00020\u0002\u001a\n\u0010\u000f\u001a\u00020\u0002*\u00020\u0002\u001a\n\u0010\u0010\u001a\u00020\u0002*\u00020\u0002\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0015\u0010\u0005\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004¨\u0006\u0011"}, d2 = {"compositionText", "", "Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;", "getCompositionText", "(Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;)Ljava/lang/String;", "selectionText", "getSelectionText", "doBackspace", "doDelete", "doHome", "doEnd", "doArrowLeft", "doArrowRight", "doShiftLeft", "doShiftRight", "doShiftHome", "doShiftEnd", "TouchController-Proxy-Client"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes24.dex */
public final class TextInputStateKt {
    public static final String getCompositionText(TextInputState $this$compositionText) {
        Intrinsics.checkNotNullParameter($this$compositionText, "<this>");
        return TextRangeKt.substring($this$compositionText.getText(), $this$compositionText.getComposition());
    }

    public static final String getSelectionText(TextInputState $this$selectionText) {
        Intrinsics.checkNotNullParameter($this$selectionText, "<this>");
        return TextRangeKt.substring($this$selectionText.getText(), $this$selectionText.getSelection());
    }

    public static final TextInputState doBackspace(TextInputState $this$doBackspace) {
        TextInputState $this$doBackspace2;
        Intrinsics.checkNotNullParameter($this$doBackspace, "<this>");
        if ($this$doBackspace.getComposition().getLength() != 0) {
            $this$doBackspace2 = $this$doBackspace;
        } else {
            if ($this$doBackspace.getSelection().getLength() != 0) {
                return TextInputState.copy$default($this$doBackspace, TextRangeKt.removeRange($this$doBackspace.getText(), $this$doBackspace.getSelection()), TextRange.INSTANCE.getEMPTY(), new TextRange($this$doBackspace.getSelection().getStart()), false, 8, null);
            }
            $this$doBackspace2 = $this$doBackspace;
            if ($this$doBackspace2.getSelection().getStart() > 0) {
                return TextInputState.copy$default($this$doBackspace2, StringsKt.removeRange((CharSequence) $this$doBackspace2.getText(), $this$doBackspace2.getSelection().getStart() - 1, $this$doBackspace2.getSelection().getStart()).toString(), TextRange.INSTANCE.getEMPTY(), new TextRange($this$doBackspace2.getSelection().getStart() - 1), false, 8, null);
            }
        }
        return $this$doBackspace2;
    }

    public static final TextInputState doDelete(TextInputState $this$doDelete) {
        TextInputState $this$doDelete2;
        Intrinsics.checkNotNullParameter($this$doDelete, "<this>");
        if ($this$doDelete.getComposition().getLength() != 0) {
            $this$doDelete2 = $this$doDelete;
        } else {
            if ($this$doDelete.getSelection().getLength() != 0) {
                return TextInputState.copy$default($this$doDelete, TextRangeKt.removeRange($this$doDelete.getText(), $this$doDelete.getSelection()), TextRange.INSTANCE.getEMPTY(), new TextRange($this$doDelete.getSelection().getStart()), false, 8, null);
            }
            $this$doDelete2 = $this$doDelete;
            if ($this$doDelete2.getSelection().getEnd() < $this$doDelete2.getText().length()) {
                return TextInputState.copy$default($this$doDelete2, StringsKt.removeRange((CharSequence) $this$doDelete2.getText(), $this$doDelete2.getSelection().getStart(), $this$doDelete2.getSelection().getStart() + 1).toString(), TextRange.INSTANCE.getEMPTY(), new TextRange($this$doDelete2.getSelection().getStart()), false, 8, null);
            }
        }
        return $this$doDelete2;
    }

    public static final TextInputState doHome(TextInputState $this$doHome) {
        Intrinsics.checkNotNullParameter($this$doHome, "<this>");
        if ($this$doHome.getComposition().getLength() == 0) {
            return TextInputState.copy$default($this$doHome, null, TextRange.INSTANCE.getEMPTY(), new TextRange(0), false, 9, null);
        }
        return $this$doHome;
    }

    public static final TextInputState doEnd(TextInputState $this$doEnd) {
        Intrinsics.checkNotNullParameter($this$doEnd, "<this>");
        if ($this$doEnd.getComposition().getLength() == 0) {
            return TextInputState.copy$default($this$doEnd, null, TextRange.INSTANCE.getEMPTY(), new TextRange($this$doEnd.getText().length()), false, 9, null);
        }
        return $this$doEnd;
    }

    public static final TextInputState doArrowLeft(TextInputState $this$doArrowLeft) {
        TextInputState $this$doArrowLeft2;
        Intrinsics.checkNotNullParameter($this$doArrowLeft, "<this>");
        if ($this$doArrowLeft.getComposition().getLength() != 0) {
            $this$doArrowLeft2 = $this$doArrowLeft;
        } else {
            if ($this$doArrowLeft.getSelection().getLength() > 0) {
                return TextInputState.copy$default($this$doArrowLeft, null, TextRange.INSTANCE.getEMPTY(), new TextRange($this$doArrowLeft.getSelection().getStart()), false, 9, null);
            }
            $this$doArrowLeft2 = $this$doArrowLeft;
            if ($this$doArrowLeft2.getSelection().getStart() > 0) {
                return TextInputState.copy$default($this$doArrowLeft2, null, TextRange.INSTANCE.getEMPTY(), new TextRange($this$doArrowLeft2.getSelection().getStart() - 1), false, 9, null);
            }
        }
        return $this$doArrowLeft2;
    }

    public static final TextInputState doArrowRight(TextInputState $this$doArrowRight) {
        TextInputState $this$doArrowRight2;
        Intrinsics.checkNotNullParameter($this$doArrowRight, "<this>");
        if ($this$doArrowRight.getComposition().getLength() != 0) {
            $this$doArrowRight2 = $this$doArrowRight;
        } else {
            if ($this$doArrowRight.getSelection().getLength() > 0) {
                return TextInputState.copy$default($this$doArrowRight, null, TextRange.INSTANCE.getEMPTY(), new TextRange($this$doArrowRight.getSelection().getEnd()), false, 9, null);
            }
            $this$doArrowRight2 = $this$doArrowRight;
            if ($this$doArrowRight2.getSelection().getEnd() < $this$doArrowRight2.getText().length()) {
                return TextInputState.copy$default($this$doArrowRight2, null, TextRange.INSTANCE.getEMPTY(), new TextRange($this$doArrowRight2.getSelection().getEnd() + 1), false, 9, null);
            }
        }
        return $this$doArrowRight2;
    }

    public static final TextInputState doShiftLeft(TextInputState $this$doShiftLeft) {
        TextInputState $this$doShiftLeft2;
        Intrinsics.checkNotNullParameter($this$doShiftLeft, "<this>");
        if ($this$doShiftLeft.getComposition().getLength() != 0) {
            $this$doShiftLeft2 = $this$doShiftLeft;
        } else if ($this$doShiftLeft.getSelection().getLength() == 0) {
            if ($this$doShiftLeft.getSelection().getStart() > 0) {
                return TextInputState.copy$default($this$doShiftLeft, null, TextRange.INSTANCE.getEMPTY(), new TextRange($this$doShiftLeft.getSelection().getStart() - 1, 1), true, 1, null);
            }
            $this$doShiftLeft2 = $this$doShiftLeft;
        } else {
            $this$doShiftLeft2 = $this$doShiftLeft;
            if ($this$doShiftLeft2.getSelectionLeft()) {
                if ($this$doShiftLeft2.getSelection().getStart() > 0) {
                    return TextInputState.copy$default($this$doShiftLeft2, null, TextRange.INSTANCE.getEMPTY(), new TextRange($this$doShiftLeft2.getSelection().getStart() - 1, $this$doShiftLeft2.getSelection().getLength() + 1), true, 1, null);
                }
            } else if ($this$doShiftLeft2.getSelection().getEnd() > 0) {
                return TextInputState.copy$default($this$doShiftLeft2, null, TextRange.INSTANCE.getEMPTY(), new TextRange($this$doShiftLeft2.getSelection().getStart(), $this$doShiftLeft2.getSelection().getLength() - 1), false, 1, null);
            }
        }
        return $this$doShiftLeft2;
    }

    public static final TextInputState doShiftRight(TextInputState $this$doShiftRight) {
        TextInputState $this$doShiftRight2;
        Intrinsics.checkNotNullParameter($this$doShiftRight, "<this>");
        if ($this$doShiftRight.getComposition().getLength() != 0) {
            $this$doShiftRight2 = $this$doShiftRight;
        } else if ($this$doShiftRight.getSelection().getLength() == 0) {
            if ($this$doShiftRight.getSelection().getEnd() < $this$doShiftRight.getText().length()) {
                return TextInputState.copy$default($this$doShiftRight, null, TextRange.INSTANCE.getEMPTY(), new TextRange($this$doShiftRight.getSelection().getStart(), 1), false, 1, null);
            }
            $this$doShiftRight2 = $this$doShiftRight;
        } else {
            $this$doShiftRight2 = $this$doShiftRight;
            if ($this$doShiftRight2.getSelectionLeft()) {
                if ($this$doShiftRight2.getSelection().getStart() < $this$doShiftRight2.getText().length()) {
                    return TextInputState.copy$default($this$doShiftRight2, null, TextRange.INSTANCE.getEMPTY(), new TextRange($this$doShiftRight2.getSelection().getStart() + 1, $this$doShiftRight2.getSelection().getLength() - 1), true, 1, null);
                }
            } else if ($this$doShiftRight2.getSelection().getEnd() < $this$doShiftRight2.getText().length()) {
                return TextInputState.copy$default($this$doShiftRight2, null, TextRange.INSTANCE.getEMPTY(), new TextRange($this$doShiftRight2.getSelection().getStart(), $this$doShiftRight2.getSelection().getLength() + 1), false, 1, null);
            }
        }
        return $this$doShiftRight2;
    }

    public static final TextInputState doShiftHome(TextInputState $this$doShiftHome) {
        Intrinsics.checkNotNullParameter($this$doShiftHome, "<this>");
        if ($this$doShiftHome.getComposition().getLength() == 0) {
            if ($this$doShiftHome.getSelectionLeft()) {
                return TextInputState.copy$default($this$doShiftHome, null, TextRange.INSTANCE.getEMPTY(), new TextRange(0, $this$doShiftHome.getSelection().getEnd()), true, 1, null);
            }
            return TextInputState.copy$default($this$doShiftHome, null, TextRange.INSTANCE.getEMPTY(), new TextRange(0, $this$doShiftHome.getSelection().getStart()), true, 1, null);
        }
        return $this$doShiftHome;
    }

    public static final TextInputState doShiftEnd(TextInputState $this$doShiftEnd) {
        Intrinsics.checkNotNullParameter($this$doShiftEnd, "<this>");
        if ($this$doShiftEnd.getComposition().getLength() == 0) {
            if ($this$doShiftEnd.getSelectionLeft()) {
                return TextInputState.copy$default($this$doShiftEnd, null, TextRange.INSTANCE.getEMPTY(), new TextRange($this$doShiftEnd.getSelection().getEnd(), $this$doShiftEnd.getText().length() - $this$doShiftEnd.getSelection().getEnd()), false, 1, null);
            }
            return TextInputState.copy$default($this$doShiftEnd, null, TextRange.INSTANCE.getEMPTY(), new TextRange($this$doShiftEnd.getSelection().getStart(), $this$doShiftEnd.getText().length() - $this$doShiftEnd.getSelection().getStart()), false, 1, null);
        }
        return $this$doShiftEnd;
    }
}
