package com.pymcl.runtime.keyboard;

import android.content.Context;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import com.pymcl.runtime.keyboard.TextFieldChannel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;

/* compiled from: TextFieldInputView.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u000fH\u0002J\b\u0010\u0017\u001a\u00020\tH\u0016J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\u00020\u00118BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013Ê\u0001\u0010\b\u001d\u0012\f\b\u001e\u0012\b\b\fJ\u0004\b\b(\u001f¨\u0006\u001c"}, d2 = {"Lcom/pymcl/runtime/keyboard/TextFieldInputView;", "Landroid/view/View;", "context", "Landroid/content/Context;", "channel", "Lcom/pymcl/runtime/keyboard/TextFieldChannel;", "<init>", "(Landroid/content/Context;Lcom/pymcl/runtime/keyboard/TextFieldChannel;)V", "noFullscreen", "", "getNoFullscreen", "()Z", "setNoFullscreen", "(Z)V", "state", "Lcom/pymcl/runtime/keyboard/TextFieldState;", "imm", "Landroid/view/inputmethod/InputMethodManager;", "getImm", "()Landroid/view/inputmethod/InputMethodManager;", "onRemoteState", "", "s", "onCheckIsTextEditor", "onCreateInputConnection", "Landroid/view/inputmethod/InputConnection;", "outAttrs", "Landroid/view/inputmethod/EditorInfo;", "PyMCL-Android:runtime_debug", "Landroid/annotation/SuppressLint;", "value", "ViewConstructor"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class TextFieldInputView extends View {
    private final TextFieldChannel channel;
    private boolean noFullscreen;
    private volatile TextFieldState state;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldInputView(Context context, TextFieldChannel channel) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(channel, "channel");
        this.channel = channel;
        this.noFullscreen = true;
        setFocusable(true);
        setFocusableInTouchMode(true);
        this.channel.setListener(new AnonymousClass1());
    }

    public static final /* synthetic */ void access$onRemoteState(TextFieldInputView $this, TextFieldState s) {
        $this.onRemoteState(s);
    }

    public final boolean getNoFullscreen() {
        return this.noFullscreen;
    }

    public final void setNoFullscreen(boolean z) {
        this.noFullscreen = z;
    }

    private final InputMethodManager getImm() {
        Object systemService = getContext().getSystemService("input_method");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        return (InputMethodManager) systemService;
    }

    /* compiled from: TextFieldInputView.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/pymcl/runtime/keyboard/TextFieldInputView$1", "Lcom/pymcl/runtime/keyboard/TextFieldChannel$Listener;", "onState", "", "state", "Lcom/pymcl/runtime/keyboard/TextFieldState;", "PyMCL-Android:runtime_debug"}, k = 1, mv = {2, 4, 0}, xi = 48)
    /* renamed from: com.pymcl.runtime.keyboard.TextFieldInputView$1, reason: invalid class name */
    public static final class AnonymousClass1 implements TextFieldChannel.Listener {
        AnonymousClass1() {
        }

        @Override // com.pymcl.runtime.keyboard.TextFieldChannel.Listener
        public void onState(final TextFieldState state) {
            TextFieldInputView textFieldInputView = TextFieldInputView.this;
            final TextFieldInputView textFieldInputView2 = TextFieldInputView.this;
            textFieldInputView.post(new Runnable() { // from class: com.pymcl.runtime.keyboard.TextFieldInputView$1$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    TextFieldInputView.access$onRemoteState(textFieldInputView2, state);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onRemoteState(TextFieldState s) {
        TextFieldState prev = this.state;
        this.state = s;
        if (prev == null && s != null) {
            requestFocus();
            getImm().showSoftInput(this, 1);
        } else if (prev != null && s == null) {
            getImm().hideSoftInputFromWindow(getWindowToken(), 1);
            clearFocus();
        }
        if (s != null) {
            getImm().updateSelection(this, s.getSelectionStart(), s.getSelectionEnd(), s.getComposingStart(), s.getComposingEnd());
        }
    }

    @Override // android.view.View
    public boolean onCheckIsTextEditor() {
        return true;
    }

    @Override // android.view.View
    public InputConnection onCreateInputConnection(EditorInfo outAttrs) {
        Intrinsics.checkNotNullParameter(outAttrs, "outAttrs");
        TextFieldState s = this.state;
        outAttrs.inputType = 1;
        outAttrs.imeOptions = (this.noFullscreen ? 301989888 : 0) | 6;
        outAttrs.initialSelStart = s != null ? s.getSelectionStart() : 0;
        outAttrs.initialSelEnd = s != null ? s.getSelectionEnd() : 0;
        return new BaseInputConnection() { // from class: com.pymcl.runtime.keyboard.TextFieldInputView.onCreateInputConnection.1
            {
                super(TextFieldInputView.this, true);
            }

            private final TextFieldState cur() {
                TextFieldState textFieldState = TextFieldInputView.this.state;
                return textFieldState == null ? new TextFieldState("", 0, 0, 0, 0, 24, null) : textFieldState;
            }

            private final void push(TextFieldState n) {
                TextFieldInputView.this.state = n;
                TextFieldInputView.this.channel.pushState(n);
            }

            @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
            public boolean commitText(CharSequence text, int newCursorPosition) {
                Intrinsics.checkNotNullParameter(text, "text");
                TextFieldState c = cur();
                int a = c.getComposingStart() >= 0 ? c.getComposingStart() : c.getSelectionStart();
                int b = c.getComposingStart() >= 0 ? c.getComposingEnd() : c.getSelectionEnd();
                String t = StringsKt.replaceRange((CharSequence) c.getText(), RangesKt.coerceIn(a, 0, c.getText().length()), RangesKt.coerceIn(b, a, c.getText().length()), text).toString();
                int p = a + text.length();
                push(new TextFieldState(t, p, p, 0, 0, 24, null));
                return true;
            }

            @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
            public boolean setComposingText(CharSequence text, int newCursorPosition) {
                Intrinsics.checkNotNullParameter(text, "text");
                TextFieldState c = cur();
                int a = c.getComposingStart() >= 0 ? c.getComposingStart() : c.getSelectionStart();
                int b = c.getComposingStart() >= 0 ? c.getComposingEnd() : c.getSelectionEnd();
                String t = StringsKt.replaceRange((CharSequence) c.getText(), RangesKt.coerceIn(a, 0, c.getText().length()), RangesKt.coerceIn(b, a, c.getText().length()), text).toString();
                int p = a + text.length();
                push(new TextFieldState(t, p, p, a, p));
                return true;
            }

            @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
            public boolean finishComposingText() {
                TextFieldState c = cur();
                push(TextFieldState.copy$default(c, null, 0, 0, -1, -1, 7, null));
                return true;
            }

            @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
            public boolean deleteSurroundingText(int before, int after) {
                TextFieldState c = cur();
                int a = RangesKt.coerceAtLeast(c.getSelectionStart() - before, 0);
                int b = RangesKt.coerceAtMost(c.getSelectionEnd() + after, c.getText().length());
                push(new TextFieldState(StringsKt.removeRange((CharSequence) c.getText(), a, b).toString(), a, a, 0, 0, 24, null));
                return true;
            }

            @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
            public boolean setSelection(int start, int end) {
                push(TextFieldState.copy$default(cur(), null, start, end, 0, 0, 25, null));
                return true;
            }

            @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
            public CharSequence getTextBeforeCursor(int n, int flags) {
                TextFieldState c = cur();
                String strSubstring = c.getText().substring(RangesKt.coerceAtLeast(c.getSelectionStart() - n, 0), RangesKt.coerceIn(c.getSelectionStart(), 0, c.getText().length()));
                Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                return strSubstring;
            }

            @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
            public CharSequence getTextAfterCursor(int n, int flags) {
                TextFieldState c = cur();
                int e = RangesKt.coerceIn(c.getSelectionEnd(), 0, c.getText().length());
                String strSubstring = c.getText().substring(e, RangesKt.coerceAtMost(e + n, c.getText().length()));
                Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                return strSubstring;
            }

            @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
            public CharSequence getSelectedText(int flags) {
                TextFieldState c = cur();
                String strSubstring = c.getText().substring(RangesKt.coerceIn(c.getSelectionStart(), 0, c.getText().length()), RangesKt.coerceIn(c.getSelectionEnd(), RangesKt.coerceIn(c.getSelectionStart(), 0, c.getText().length()), c.getText().length()));
                Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                return strSubstring;
            }
        };
    }
}
