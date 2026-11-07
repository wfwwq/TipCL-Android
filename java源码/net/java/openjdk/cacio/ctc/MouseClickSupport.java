package net.java.openjdk.cacio.ctc;

import sun.awt.peer.cacio.managed.EventData;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/caciocavallo/cacio-androidnw-1.10-SNAPSHOT.jar:net/java/openjdk/cacio/ctc/MouseClickSupport.class */
class MouseClickSupport {
    private static final long MULTI_CLICK_THRESHOLD = 400;
    private EventData lastPress;
    private int clickCount;

    MouseClickSupport() {
    }

    void mouseEvent(EventData ev) {
        switch (ev.getId()) {
            case 501:
                handlePress(ev);
                break;
            case 502:
                handleRelease(ev);
                break;
        }
    }

    private void handlePress(EventData ev) {
        if (isInMultiClickThreshold(ev) && isClick(ev)) {
            this.clickCount++;
        } else {
            this.clickCount = 1;
        }
        this.lastPress = ev;
    }

    private boolean isInMultiClickThreshold(EventData ev) {
        return this.lastPress != null && ev.getTime() - this.lastPress.getTime() < MULTI_CLICK_THRESHOLD;
    }

    private void handleRelease(EventData ev) {
        if (isClick(ev)) {
            generateClick(ev);
        }
    }

    private void generateClick(EventData ev) {
        ev.setId(500);
        ev.setSource(CTCScreen.getInstance());
        ev.setTime(System.currentTimeMillis());
        ev.setClickCount(this.clickCount);
        ev.setPopup(false);
        CTCEventSource.getInstance().postEvent(ev);
    }

    private boolean isClick(EventData ev) {
        return this.lastPress != null && this.lastPress.getButton() == ev.getButton() && this.lastPress.getX() == ev.getX() && this.lastPress.getY() == ev.getY();
    }

    int getClickCount() {
        return this.clickCount;
    }
}
