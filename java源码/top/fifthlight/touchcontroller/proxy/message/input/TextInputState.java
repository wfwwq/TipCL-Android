package top.fifthlight.touchcontroller.proxy.message.input;

import com.pymcl.multiplayer.TerracottaVpnService;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TextInputState.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, d2 = {"Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;", "", TerracottaVpnService.EXTRA_TEXT, "", "composition", "Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;", "selection", "selectionLeft", "", "<init>", "(Ljava/lang/String;Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;Z)V", "getText", "()Ljava/lang/String;", "getComposition", "()Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;", "getSelection", "getSelectionLeft", "()Z", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "TouchController-Proxy-Client"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes24.dex */
public final /* data */ class TextInputState {
    private final TextRange composition;
    private final TextRange selection;
    private final boolean selectionLeft;
    private final String text;

    public TextInputState() {
        this(null, null, null, false, 15, null);
    }

    public static /* synthetic */ TextInputState copy$default(TextInputState textInputState, String str, TextRange textRange, TextRange textRange2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = textInputState.text;
        }
        if ((i & 2) != 0) {
            textRange = textInputState.composition;
        }
        if ((i & 4) != 0) {
            textRange2 = textInputState.selection;
        }
        if ((i & 8) != 0) {
            z = textInputState.selectionLeft;
        }
        return textInputState.copy(str, textRange, textRange2, z);
    }

    /* renamed from: component1, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* renamed from: component2, reason: from getter */
    public final TextRange getComposition() {
        return this.composition;
    }

    /* renamed from: component3, reason: from getter */
    public final TextRange getSelection() {
        return this.selection;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getSelectionLeft() {
        return this.selectionLeft;
    }

    public final TextInputState copy(String text, TextRange composition, TextRange selection, boolean selectionLeft) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(composition, "composition");
        Intrinsics.checkNotNullParameter(selection, "selection");
        return new TextInputState(text, composition, selection, selectionLeft);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TextInputState)) {
            return false;
        }
        TextInputState textInputState = (TextInputState) other;
        return Intrinsics.areEqual(this.text, textInputState.text) && Intrinsics.areEqual(this.composition, textInputState.composition) && Intrinsics.areEqual(this.selection, textInputState.selection) && this.selectionLeft == textInputState.selectionLeft;
    }

    public int hashCode() {
        return (((((this.text.hashCode() * 31) + this.composition.hashCode()) * 31) + this.selection.hashCode()) * 31) + Boolean.hashCode(this.selectionLeft);
    }

    public String toString() {
        return "TextInputState(text=" + this.text + ", composition=" + this.composition + ", selection=" + this.selection + ", selectionLeft=" + this.selectionLeft + ')';
    }

    public TextInputState(String text, TextRange composition, TextRange selection, boolean selectionLeft) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(composition, "composition");
        Intrinsics.checkNotNullParameter(selection, "selection");
        this.text = text;
        this.composition = composition;
        this.selection = selection;
        this.selectionLeft = selectionLeft;
        if (!(this.composition.getEnd() <= this.text.length())) {
            throw new IllegalArgumentException(("composition region end " + this.composition.getEnd() + " should not exceed text length " + this.text.length()).toString());
        }
        if (this.selection.getEnd() <= this.text.length()) {
        } else {
            throw new IllegalArgumentException(("selection region end " + this.selection.getEnd() + " should not exceed text length " + this.text.length()).toString());
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ TextInputState(String str, TextRange textRange, TextRange textRange2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        str = (i & 1) != 0 ? "" : str;
        this(str, (i & 2) != 0 ? TextRange.INSTANCE.getEMPTY() : textRange, (i & 4) != 0 ? new TextRange(str.length()) : textRange2, (i & 8) != 0 ? true : z);
    }

    public final String getText() {
        return this.text;
    }

    public final TextRange getComposition() {
        return this.composition;
    }

    public final TextRange getSelection() {
        return this.selection;
    }

    public final boolean getSelectionLeft() {
        return this.selectionLeft;
    }
}
