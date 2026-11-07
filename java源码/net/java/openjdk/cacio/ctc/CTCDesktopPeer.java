package net.java.openjdk.cacio.ctc;

import java.awt.Desktop;
import java.awt.peer.DesktopPeer;
import java.io.File;
import java.io.IOException;
import java.net.URI;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/caciocavallo/cacio-androidnw-1.10-SNAPSHOT.jar:net/java/openjdk/cacio/ctc/CTCDesktopPeer.class */
public class CTCDesktopPeer implements DesktopPeer {
    private static native void openFile(String str);

    private static native void openUri(String str);

    /* renamed from: net.java.openjdk.cacio.ctc.CTCDesktopPeer$1, reason: invalid class name */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/caciocavallo/cacio-androidnw-1.10-SNAPSHOT.jar:net/java/openjdk/cacio/ctc/CTCDesktopPeer$1.class */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$java$awt$Desktop$Action = new int[Desktop.Action.values().length];

        static {
            try {
                $SwitchMap$java$awt$Desktop$Action[Desktop.Action.OPEN.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                $SwitchMap$java$awt$Desktop$Action[Desktop.Action.BROWSE.ordinal()] = 2;
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

    public void open(File file) throws IOException {
        openFile(file.getAbsolutePath());
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
        openUri(uri.toString());
    }
}
