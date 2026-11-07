package com.github.caciocavallosilano.cacio.peer;

import java.awt.Dimension;
import java.awt.Point;
import java.awt.Window;
import java.awt.peer.MouseInfoPeer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/caciocavallo17/cacio-shared-1.19.1-SNAPSHOT.jar:com/github/caciocavallosilano/cacio/peer/CacioMouseInfoPeer.class */
public class CacioMouseInfoPeer implements MouseInfoPeer {
    private static CacioMouseInfoPeer instance = new CacioMouseInfoPeer();
    private int x;
    private int y;

    public static CacioMouseInfoPeer getInstance() {
        return instance;
    }

    public int fillPointWithCoords(Point point) {
        point.x = this.x;
        point.y = this.y;
        return 0;
    }

    public void setMouseScreenCoordinates(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public boolean isWindowUnderMouse(Window w) {
        Window[] windows = Window.getWindows();
        Window found = null;
        int length = windows.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            Window window = windows[i];
            if (!window.isVisible() || !isMouseInWindowRegion(w)) {
                i++;
            } else {
                found = window;
                break;
            }
        }
        return found == w;
    }

    private boolean isMouseInWindowRegion(Window w) {
        Point l = w.getLocationOnScreen();
        Dimension size = w.getSize();
        return l.x <= this.x && this.x < l.x + size.width && l.y <= this.y && this.y < l.y + size.height;
    }
}
