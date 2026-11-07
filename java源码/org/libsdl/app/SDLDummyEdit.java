package org.libsdl.app;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import org.libsdl.app.SdlImeController;

/* loaded from: classes9.dex */
public class SDLDummyEdit extends View implements View.OnKeyListener {
    InputConnection ic;
    int input_type;

    SDLDummyEdit(Context context) {
        super(context);
        setFocusableInTouchMode(true);
        setFocusable(true);
        setOnKeyListener(this);
    }

    void setInputType(int input_type) {
        this.input_type = input_type;
    }

    @Override // android.view.View
    public boolean onCheckIsTextEditor() {
        return true;
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View v, int keyCode, KeyEvent event) {
        if (!SdlImeController.isInputAccepted()) {
            SdlImeController.requestHide(SdlImeController.Source.BACK);
            return true;
        }
        return SDLActivity.handleKeyEvent(v, keyCode, event, this.ic);
    }

    @Override // android.view.View
    public boolean onKeyPreIme(int keyCode, KeyEvent event) {
        if (event.getAction() == 1 && keyCode == 4) {
            SdlImeController.requestHide(SdlImeController.Source.BACK);
        }
        return super.onKeyPreIme(keyCode, event);
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        if (hasFocus && !SdlImeController.isInputAccepted()) {
            SdlImeController.requestHide(SdlImeController.Source.BACK);
        }
    }

    @Override // android.view.View
    public InputConnection onCreateInputConnection(EditorInfo outAttrs) {
        this.ic = new SDLInputConnection(this, true);
        outAttrs.inputType = this.input_type;
        outAttrs.imeOptions = 301989888;
        return this.ic;
    }
}
