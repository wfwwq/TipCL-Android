package com.github.caciocavallosilano.cacio.peer;

import java.awt.AWTEvent;
import java.awt.Component;
import java.awt.event.ComponentEvent;
import java.awt.event.FocusEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.PaintEvent;
import java.awt.event.WindowEvent;
import sun.awt.AWTAutoShutdown;
import sun.awt.PaintEventDispatcher;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/caciocavallo17/cacio-shared-1.19.1-SNAPSHOT.jar:com/github/caciocavallosilano/cacio/peer/CacioEventPump.class */
public abstract class CacioEventPump<ET> implements Runnable {
    private static final int BUTTON_DOWN_MASK = 7168;
    private int lastModifierState;

    protected abstract ET fetchNativeEvent() throws InterruptedException;

    protected abstract void dispatchNativeEvent(ET et);

    protected CacioEventPump() {
    }

    protected void start() {
        Thread t = new Thread(this, "CacioEventPump");
        t.setDaemon(true);
        t.start();
    }

    @Override // java.lang.Runnable
    public final void run() {
        AWTAutoShutdown.notifyToolkitThreadBusy();
        while (!Thread.interrupted()) {
            try {
                AWTAutoShutdown.notifyToolkitThreadFree();
                ET nativeEvent = fetchNativeEvent();
                AWTAutoShutdown.notifyToolkitThreadBusy();
                dispatchNativeEvent(nativeEvent);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }

    protected final void postMouseEvent(CacioComponent source, int id, long time, int modifiers, int x, int y, int clickCount, boolean popupTrigger) {
        int button;
        if (id == 506) {
            button = getButton(modifiers);
        } else {
            int modifierChange = this.lastModifierState ^ modifiers;
            button = getButton(modifierChange);
            this.lastModifierState = modifiers;
        }
        MouseEvent ev = new MouseEvent(source.getAWTComponent(), id, time, modifiers, x, y, clickCount, popupTrigger, button);
        postEvent(source, ev);
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

    protected final void postKeyEvent(CacioComponent source, int id, long time, int modifiers, int keyCode) {
        KeyEvent ke = new KeyEvent(source.getAWTComponent(), id, time, modifiers, keyCode, (char) 65535);
        postEvent(source, ke);
    }

    protected final void postKeyTypedEvent(CacioComponent source, int id, long time, int modifiers, char keyChar) {
        KeyEvent ke = new KeyEvent(source.getAWTComponent(), id, time, modifiers, 0, keyChar);
        postEvent(source, ke);
    }

    protected final void postComponentEvent(CacioComponent source, int id) {
        ComponentEvent ev = new ComponentEvent(source.getAWTComponent(), id);
        postEvent(source, ev);
    }

    protected final void postPaintEvent(CacioComponent source, int x, int y, int width, int height, boolean paintBackground) {
        if (paintBackground) {
            ((CacioComponentPeer) source).clearBackground();
        }
        PaintEvent ev = PaintEventDispatcher.getPaintEventDispatcher().createPaintEvent(source.getAWTComponent(), x, y, width, height);
        postEvent(source, ev);
    }

    protected final void postPaintEvent(CacioComponent source, int x, int y, int width, int height) {
        postPaintEvent(source, x, y, width, height, false);
    }

    protected final void postFocusEvent(CacioComponent source, int id, boolean temporary, CacioComponent opposite) {
        Component awtComponent = null;
        if (opposite != null) {
            awtComponent = opposite.getAWTComponent();
        }
        FocusEvent ev = new FocusEvent(source.getAWTComponent(), id, temporary, awtComponent);
        postEvent(source, ev);
    }

    protected final void postWindwoEvent(CacioComponent source, int id, int oldState, int newState) {
        WindowEvent ev;
        if (id == 209) {
            ev = new WindowEvent(source.getAWTComponent(), id, oldState, newState);
        } else {
            ev = new WindowEvent(source.getAWTComponent(), id);
        }
        postEvent(source, ev);
    }

    private void postEvent(CacioComponent c, AWTEvent ev) {
        c.handlePeerEvent(ev);
    }
}
