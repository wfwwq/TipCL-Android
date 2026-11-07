package com.github.caciocavallosilano.cacio.ctc;

import com.github.caciocavallosilano.cacio.peer.managed.EventData;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/caciocavallo17/cacio-tta-1.19.1-SNAPSHOT.jar:com/github/caciocavallosilano/cacio/ctc/InfdevGrabHandler.class */
public class InfdevGrabHandler {
    private static boolean eventSelfSubmitted;
    private static EventData externalMouseReader;
    private static boolean isGrabbing;
    private static int lx;
    private static int ly;

    public static boolean robotMouseEvent(CTCRobotPeer sourcePeer, int x, int y) {
        if (!isGrabbing) {
            return false;
        }
        if (eventSelfSubmitted) {
            eventSelfSubmitted = false;
            return false;
        }
        if (externalMouseReader != null) {
            eventSelfSubmitted = true;
            int cx = externalMouseReader.getX();
            int cy = externalMouseReader.getY();
            sourcePeer.mouseMove((x + cx) - lx, (y + ly) - cy);
            lx = cx;
            ly = cy;
            return true;
        }
        return true;
    }

    public static void setMouseReader(EventData reader) {
        externalMouseReader = reader;
    }

    public static void setGrabbed(boolean grabbed) {
        isGrabbing = grabbed;
        if (isGrabbing) {
            lx = externalMouseReader.getX();
            ly = externalMouseReader.getY();
        }
    }
}
