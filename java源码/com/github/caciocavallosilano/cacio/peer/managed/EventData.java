package com.github.caciocavallosilano.cacio.peer.managed;

import java.awt.AWTEvent;
import java.awt.Component;
import java.awt.Rectangle;
import java.awt.event.ComponentEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import java.awt.event.PaintEvent;
import org.lwjgl.system.windows.User32;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/caciocavallo17/cacio-shared-1.19.1-SNAPSHOT.jar:com/github/caciocavallosilano/cacio/peer/managed/EventData.class */
public class EventData {
    private static final int BUTTON_DOWN_MASK = 7168;
    private int id;
    private Object source;
    private long time;
    private int modifiers;
    private int x;
    private int y;
    private int clickCount;
    private int button;
    private boolean popup;
    private Rectangle updateRect;
    private int keyCode;
    private char keyChar;
    private int lastModifierState;

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Object getSource() {
        return this.source;
    }

    public void setSource(Object s) {
        this.source = s;
    }

    public long getTime() {
        return this.time;
    }

    public void setTime(long t) {
        this.time = t;
    }

    public int getModifiers() {
        return this.modifiers;
    }

    public void setModifiers(int mods) {
        this.modifiers = mods;
    }

    public int getX() {
        return this.x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return this.y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getClickCount() {
        return this.clickCount;
    }

    public void setClickCount(int c) {
        this.clickCount = c;
    }

    public int getButton() {
        return this.button;
    }

    public void setButton(int b) {
        this.button = b;
    }

    public boolean isPopup() {
        return this.popup;
    }

    public void setPopup(boolean popup) {
        this.popup = popup;
    }

    public Rectangle getUpdateRect() {
        return this.updateRect;
    }

    public void setUpdateRect(Rectangle r) {
        this.updateRect = r;
    }

    public int getKeyCode() {
        return this.keyCode;
    }

    public void setKeyCode(int keyCode) {
        this.keyCode = keyCode;
    }

    public char getKeyChar() {
        return this.keyChar;
    }

    public void setKeyChar(char keyChar) {
        this.keyChar = keyChar;
    }

    public AWTEvent createAWTEvent() {
        switch (this.id) {
            case 100:
            case 101:
            case 102:
            case 103:
                return new ComponentEvent((Component) this.source, this.id);
            case 400:
            case 401:
            case 402:
                return new KeyEvent((Component) this.source, this.id, this.time, this.modifiers, this.keyCode, this.keyChar);
            case 500:
            case 501:
            case 502:
            case 503:
            case 504:
            case 505:
            case 506:
                int modifierChange = this.lastModifierState ^ this.modifiers;
                this.lastModifierState = this.modifiers;
                return new MouseEvent((Component) this.source, this.id, this.time, this.modifiers, this.x, this.y, this.clickCount, this.popup, getButton(modifierChange));
            case 507:
                int i = this.lastModifierState ^ this.modifiers;
                this.lastModifierState = this.modifiers;
                return new MouseWheelEvent((Component) this.source, 507, this.time, this.modifiers, this.x, this.y, 1, false, 0, 3, this.button == 4 ? -1 : 1);
            case User32.WM_DWMCOLORIZATIONCOLORCHANGED /* 800 */:
            case User32.WM_DWMWINDOWMAXIMIZEDCHANGE /* 801 */:
                return new PaintEvent((Component) this.source, this.id, this.updateRect);
            default:
                return null;
        }
    }

    private int getButton(int theModifierChange) {
        switch (theModifierChange & 7168) {
            case 1024:
                return 1;
            case 2048:
                return 2;
            case 4096:
                return 3;
            default:
                return 0;
        }
    }

    public void clear() {
        this.id = 0;
        this.source = null;
        this.time = 0L;
        this.modifiers = 0;
        this.x = 0;
        this.y = 0;
        this.clickCount = 0;
        this.button = 0;
        this.updateRect = null;
    }

    public String toString() {
        switch (this.id) {
            case 400:
                return "KEY_TYPED: " + getKeyChar() + " keycode = " + this.keyCode;
            case 401:
                return "KEY_PRESSED: " + getKeyChar() + " keycode = " + this.keyCode;
            case 402:
                return "KEY_RELEASED: " + getKeyChar() + " keycode = " + this.keyCode;
            case 500:
                return "MOUSE_CLICKED: " + this.x + ", " + this.y + ", time: " + this.time + ", mods: " + this.modifiers;
            case 501:
                return "MOUSE_PRESSED: " + this.x + ", " + this.y + ", time: " + this.time + ", mods: " + this.modifiers + " button: " + this.button;
            case 502:
                return "MOUSE_RELEASED: " + this.x + ", " + this.y + ", time: " + this.time + ", mods: " + this.modifiers + " button: " + this.button;
            case 503:
                return "MOUSE_MOVED: " + this.x + ", " + this.y + ", time: " + this.time + ", mods: " + this.modifiers;
            case 504:
                return "MOUSE_ENTERED: " + this.x + ", " + this.y + ", time: " + this.time + ", mods: " + this.modifiers;
            case 505:
                return "MOUSE_EXITED: " + this.x + ", " + this.y + ", time: " + this.time + ", mods: " + this.modifiers;
            case 506:
                return "MOUSE_DRAGGED: " + this.x + ", " + this.y + ", time: " + this.time + ", mods: " + this.modifiers;
            case 507:
                return "MOUSE_WHEEL: " + this.x + ", " + this.y + ", time: " + this.time + ", mods: " + this.modifiers + " button: " + this.button;
            default:
                return "UNKNOWN/UNIMPLEMENTED";
        }
    }
}
