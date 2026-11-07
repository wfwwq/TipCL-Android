package com.github.caciocavallosilano.cacio.peer;

import java.awt.AWTEvent;
import java.awt.Container;
import java.awt.Frame;
import java.awt.Window;
import java.awt.event.FocusEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import javax.swing.JComponent;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/caciocavallo17/cacio-shared-1.19.1-SNAPSHOT.jar:com/github/caciocavallosilano/cacio/peer/ProxyWindow.class */
public class ProxyWindow extends Window {
    private CacioComponentPeer target;
    private static Field dispatcherField;
    private static Method dispatchMethod;

    ProxyWindow(CacioComponentPeer t, JComponent c) {
        super((Frame) null);
        this.target = t;
        add(c);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public CacioComponentPeer getTargetPeer() {
        return this.target;
    }

    void handleFocusEvent(FocusEvent e) {
        processFocusEvent(e);
    }

    void handleKeyEvent(KeyEvent e) {
        processKeyEvent(e);
    }

    void handleMouseEvent(MouseEvent e) {
        new MouseEvent(this, e.getID(), e.getWhen(), e.getModifiers(), e.getX(), e.getY(), e.getXOnScreen(), e.getYOnScreen(), e.getClickCount(), e.isPopupTrigger(), e.getButton());
        doLightweightDispatching(e);
    }

    void handleMouseMotionEvent(MouseEvent e) {
        new MouseEvent(this, e.getID(), e.getWhen(), e.getModifiers(), e.getX(), e.getY(), e.getXOnScreen(), e.getYOnScreen(), e.getClickCount(), e.isPopupTrigger(), e.getButton());
        doLightweightDispatching(e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void initReflection() throws ClassNotFoundException {
        try {
            dispatcherField = Container.class.getDeclaredField("dispatcher");
            dispatcherField.setAccessible(true);
            Class dispatcherCls = Class.forName("java.awt.LightweightDispatcher");
            dispatchMethod = dispatcherCls.getDeclaredMethod("dispatchEvent", AWTEvent.class);
            dispatchMethod.setAccessible(true);
        } catch (Exception ex) {
            InternalError err = new InternalError();
            err.initCause(ex);
            throw err;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void doLightweightDispatching(AWTEvent e) {
        if (dispatcherField == null) {
            initReflection();
        }
        try {
            Object dispatcher = dispatcherField.get(this);
            if (dispatcher != null) {
                dispatchMethod.invoke(dispatcher, e);
            }
        } catch (Exception ex) {
            InternalError err = new InternalError();
            err.initCause(ex);
            throw err;
        }
    }

    public boolean isShowing() {
        return this.target.getAWTComponent().isShowing();
    }
}
