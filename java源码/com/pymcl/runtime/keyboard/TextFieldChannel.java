package com.pymcl.runtime.keyboard;

import kotlin.Metadata;

/* compiled from: TextFieldInputView.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\tJ\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lcom/pymcl/runtime/keyboard/TextFieldChannel;", "", "setListener", "", "l", "Lcom/pymcl/runtime/keyboard/TextFieldChannel$Listener;", "pushState", "state", "Lcom/pymcl/runtime/keyboard/TextFieldState;", "Listener", "PyMCL-Android:runtime_debug"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface TextFieldChannel {

    /* compiled from: TextFieldInputView.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/pymcl/runtime/keyboard/TextFieldChannel$Listener;", "", "onState", "", "state", "Lcom/pymcl/runtime/keyboard/TextFieldState;", "PyMCL-Android:runtime_debug"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public interface Listener {
        void onState(TextFieldState state);
    }

    void pushState(TextFieldState state);

    void setListener(Listener l);
}
