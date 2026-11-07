package net.java.openjdk.cacio.ctc;

import java.awt.Rectangle;
import java.awt.peer.RobotPeer;
import sun.awt.peer.cacio.CacioMouseInfoPeer;
import sun.awt.peer.cacio.managed.EventData;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/caciocavallo/cacio-androidnw-1.10-SNAPSHOT.jar:net/java/openjdk/cacio/ctc/CTCRobotPeer.class */
public class CTCRobotPeer implements RobotPeer {
    private static final int BUTTON_MASK_CONVERSION_SHIFT = 6;
    private static final int BUTTON_MASKS = 28;
    private static final int BUTTON_DOWN_MASKS = 7168;
    private int currentModifiers;
    private int currentX;
    private int currentY;
    private boolean enableInfdevHandler;
    private MouseClickSupport mouseClickSupport;

    public CTCRobotPeer() {
        this.currentModifiers = 0;
        this.currentX = 0;
        this.currentY = 0;
        this.enableInfdevHandler = false;
        this.mouseClickSupport = new MouseClickSupport();
    }

    public CTCRobotPeer(boolean enableInfdevHandler) {
        this.currentModifiers = 0;
        this.currentX = 0;
        this.currentY = 0;
        this.enableInfdevHandler = false;
        this.mouseClickSupport = new MouseClickSupport();
        this.enableInfdevHandler = enableInfdevHandler;
    }

    private EventData mouseEvent(int id, int currentButton, boolean popup) {
        EventData ev = new EventData();
        ev.setId(id);
        ev.setSource(CTCScreen.getInstance());
        ev.setTime(System.currentTimeMillis());
        ev.setModifiers(this.currentModifiers);
        ev.setX(this.currentX);
        ev.setY(this.currentY);
        ev.setButton(currentButton);
        ev.setPopup(popup);
        ev.setClickCount(this.mouseClickSupport.getClickCount());
        return ev;
    }

    public void mouseMove(int x, int y) {
        if (this.enableInfdevHandler && InfdevGrabHandler.robotMouseEvent(this, x, y)) {
            return;
        }
        this.currentX = x;
        this.currentY = y;
        int id = isButtonPressed() ? 503 : 506;
        EventData ev = mouseEvent(id, 0, false);
        CTCEventSource.getInstance().postEvent(ev);
        CacioMouseInfoPeer.getInstance().setMouseScreenCoordinates(x, y);
    }

    private boolean isButtonPressed() {
        return (this.currentModifiers & 28) == 0;
    }

    public void mousePress(int buttons) {
        int buttonMask = buttonDownToButtonMask(buttons);
        int buttonDownMask = buttonToButtonDownMask(buttons);
        if (buttonDownMask != 0 && buttonMask != 0) {
            this.currentModifiers |= buttonMask;
            EventData ev = mouseEvent(501, buttonDownMask, false);
            this.mouseClickSupport.mouseEvent(ev);
            EventData ev2 = mouseEvent(501, buttonDownMask, false);
            CTCEventSource.getInstance().postEvent(ev2);
        }
    }

    public void mouseRelease(int buttons) {
        int buttonMask = buttonDownToButtonMask(buttons);
        int buttonDownMask = buttonToButtonDownMask(buttons);
        if (buttonDownMask != 0 && buttonMask != 0) {
            EventData ev = mouseEvent(502, buttonDownMask, (buttons & 4) != 0);
            CTCEventSource.getInstance().postEvent(ev);
            EventData ev2 = mouseEvent(502, buttonDownMask, false);
            this.mouseClickSupport.mouseEvent(ev2);
            this.currentModifiers &= buttonMask ^ (-1);
        }
    }

    private int buttonToButtonDownMask(int buttons) {
        int buttonDownMask = buttons & 7168;
        return buttonDownMask | ((buttons & 28) << 6);
    }

    private int buttonDownToButtonMask(int buttons) {
        int buttonMask = buttons & 28;
        return buttonMask | ((buttons & 7168) >> 6);
    }

    public void mouseWheel(int wheelAmt) {
    }

    private void keyEvent(int keycode, int id) {
        EventData ev = new EventData();
        ev.setSource(CTCScreen.getInstance());
        ev.setId(id);
        ev.setTime(System.currentTimeMillis());
        ev.setModifiers(this.currentModifiers);
        ev.setKeyCode(keycode);
        CTCEventSource.getInstance().postEvent(ev);
    }

    public void keyPress(int keycode) {
        if (keycode == 16) {
            this.currentModifiers |= 1;
        }
        if (keycode == 20) {
            if ((this.currentModifiers & 1) == 1) {
                this.currentModifiers &= -2;
            } else {
                this.currentModifiers |= 1;
            }
        }
        if (keycode == 17) {
            this.currentModifiers |= 2;
        }
        if (keycode == 65406) {
            this.currentModifiers |= 32;
        }
        keyEvent(keycode, 401);
        char keychar = getKeyCharFromCodeAndMods(keycode, this.currentModifiers);
        if (keychar != 65535) {
            EventData ev = new EventData();
            ev.setSource(CTCScreen.getInstance());
            ev.setId(400);
            ev.setTime(System.currentTimeMillis());
            ev.setModifiers(this.currentModifiers);
            ev.setKeyChar(keychar);
            CTCEventSource.getInstance().postEvent(ev);
        }
    }

    public void keyPressUnchecked(char keychar) {
        if (keychar != 65535) {
            EventData ev = new EventData();
            ev.setSource(CTCScreen.getInstance());
            ev.setId(400);
            ev.setTime(System.currentTimeMillis());
            ev.setModifiers(this.currentModifiers);
            ev.setKeyChar(keychar);
            CTCEventSource.getInstance().postEvent(ev);
        }
    }

    private char getKeyCharFromCodeAndMods(int keyCode, int modifiers) {
        return KeyStrokeMappingFactory.getInstance().getKeyStrokeMapping().getKeyChar(keyCode, modifiers);
    }

    public void keyRelease(int keycode) {
        if (keycode == 16) {
            this.currentModifiers &= -2;
        }
        if (keycode == 17) {
            this.currentModifiers &= -3;
        }
        if (keycode == 65406) {
            this.currentModifiers &= -33;
        }
        keyEvent(keycode, 402);
    }

    public int getRGBPixel(int x, int y) {
        return CTCScreen.getInstance().getRGBPixel(x, y);
    }

    public int[] getRGBPixels(Rectangle bounds) {
        return CTCScreen.getInstance().getRGBPixels(bounds);
    }

    public void dispose() {
    }
}
