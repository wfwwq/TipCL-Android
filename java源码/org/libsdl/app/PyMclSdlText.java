package org.libsdl.app;

/* loaded from: classes9.dex */
public final class PyMclSdlText {
    private PyMclSdlText() {
    }

    public static void commitText(String text) {
        SDLInputConnection.nativeCommitText(text, 0);
    }

    public static void controlChar(char c) {
        SDLInputConnection.nativeGenerateScancodeForUnichar(c);
    }
}
