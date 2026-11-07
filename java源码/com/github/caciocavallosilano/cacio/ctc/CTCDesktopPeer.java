package com.github.caciocavallosilano.cacio.ctc;

import java.awt.Desktop;
import java.awt.desktop.AboutHandler;
import java.awt.desktop.QuitHandler;
import java.awt.peer.DesktopPeer;
import java.io.File;
import java.io.IOException;
import java.net.URI;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/caciocavallo17/cacio-tta-1.19.1-SNAPSHOT.jar:com/github/caciocavallosilano/cacio/ctc/CTCDesktopPeer.class */
public class CTCDesktopPeer implements DesktopPeer {

    /* renamed from: com.github.caciocavallosilano.cacio.ctc.CTCDesktopPeer$1, reason: invalid class name */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/caciocavallo17/cacio-tta-1.19.1-SNAPSHOT.jar:com/github/caciocavallosilano/cacio/ctc/CTCDesktopPeer$1.class */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$java$awt$Desktop$Action = new int[Desktop.Action.values().length];

        static {
            try {
                $SwitchMap$java$awt$Desktop$Action[Desktop.Action.APP_QUIT_HANDLER.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                $SwitchMap$java$awt$Desktop$Action[Desktop.Action.APP_ABOUT.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
        }
    }

    public boolean isSupported(Desktop.Action action) {
        switch (AnonymousClass1.$SwitchMap$java$awt$Desktop$Action[action.ordinal()]) {
            case 1:
            case 2:
                return true;
            default:
                return false;
        }
    }

    public void setAboutHandler(AboutHandler handler) {
    }

    public void setQuitHandler(QuitHandler handler) {
    }

    public void open(File file) throws IOException {
    }

    public void edit(File file) throws IOException {
        throw new IOException("Action not supported");
    }

    public void print(File file) throws IOException {
        throw new IOException("Action not supported");
    }

    public void mail(URI mailtoURL) throws IOException {
        throw new IOException("Action not supported");
    }

    public void browse(URI uri) throws IOException {
    }
}
