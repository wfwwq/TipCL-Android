package com.pymcl.runtime.keyboard;

import com.pymcl.multiplayer.TerracottaVpnService;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TextFieldInputView.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J;\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001b\u001a\u00020\u0005HÖ\u0081\u0004J\n\u0010\u001c\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000e¨\u0006\u001d"}, d2 = {"Lcom/pymcl/runtime/keyboard/TextFieldState;", "", TerracottaVpnService.EXTRA_TEXT, "", "selectionStart", "", "selectionEnd", "composingStart", "composingEnd", "<init>", "(Ljava/lang/String;IIII)V", "getText", "()Ljava/lang/String;", "getSelectionStart", "()I", "getSelectionEnd", "getComposingStart", "getComposingEnd", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "PyMCL-Android:runtime_debug"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class TextFieldState {
    private final int composingEnd;
    private final int composingStart;
    private final int selectionEnd;
    private final int selectionStart;
    private final String text;

    public static /* synthetic */ TextFieldState copy$default(TextFieldState textFieldState, String str, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            str = textFieldState.text;
        }
        if ((i5 & 2) != 0) {
            i = textFieldState.selectionStart;
        }
        if ((i5 & 4) != 0) {
            i2 = textFieldState.selectionEnd;
        }
        if ((i5 & 8) != 0) {
            i3 = textFieldState.composingStart;
        }
        if ((i5 & 16) != 0) {
            i4 = textFieldState.composingEnd;
        }
        int i6 = i4;
        int i7 = i2;
        return textFieldState.copy(str, i, i7, i3, i6);
    }

    /* renamed from: component1, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* renamed from: component2, reason: from getter */
    public final int getSelectionStart() {
        return this.selectionStart;
    }

    /* renamed from: component3, reason: from getter */
    public final int getSelectionEnd() {
        return this.selectionEnd;
    }

    /* renamed from: component4, reason: from getter */
    public final int getComposingStart() {
        return this.composingStart;
    }

    /* renamed from: component5, reason: from getter */
    public final int getComposingEnd() {
        return this.composingEnd;
    }

    public final TextFieldState copy(String text, int selectionStart, int selectionEnd, int composingStart, int composingEnd) {
        Intrinsics.checkNotNullParameter(text, "text");
        return new TextFieldState(text, selectionStart, selectionEnd, composingStart, composingEnd);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TextFieldState)) {
            return false;
        }
        TextFieldState textFieldState = (TextFieldState) other;
        return Intrinsics.areEqual(this.text, textFieldState.text) && this.selectionStart == textFieldState.selectionStart && this.selectionEnd == textFieldState.selectionEnd && this.composingStart == textFieldState.composingStart && this.composingEnd == textFieldState.composingEnd;
    }

    public int hashCode() {
        return (((((((this.text.hashCode() * 31) + Integer.hashCode(this.selectionStart)) * 31) + Integer.hashCode(this.selectionEnd)) * 31) + Integer.hashCode(this.composingStart)) * 31) + Integer.hashCode(this.composingEnd);
    }

    public String toString() {
        return "TextFieldState(text=" + this.text + ", selectionStart=" + this.selectionStart + ", selectionEnd=" + this.selectionEnd + ", composingStart=" + this.composingStart + ", composingEnd=" + this.composingEnd + ")";
    }

    public TextFieldState(String text, int selectionStart, int selectionEnd, int composingStart, int composingEnd) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.text = text;
        this.selectionStart = selectionStart;
        this.selectionEnd = selectionEnd;
        this.composingStart = composingStart;
        this.composingEnd = composingEnd;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ TextFieldState(String str, int i, int i2, int i3, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        int i6;
        i3 = (i5 & 8) != 0 ? -1 : i3;
        if ((i5 & 16) == 0) {
            i6 = i4;
        } else {
            i6 = -1;
        }
        this(str, i, i2, i3, i6);
    }

    public final int getSelectionEnd() {
        return this.selectionEnd;
    }

    public final int getSelectionStart() {
        return this.selectionStart;
    }

    public final String getText() {
        return this.text;
    }

    public final int getComposingEnd() {
        return this.composingEnd;
    }

    public final int getComposingStart() {
        return this.composingStart;
    }
}
