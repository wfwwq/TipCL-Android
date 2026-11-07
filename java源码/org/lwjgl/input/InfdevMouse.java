package org.lwjgl.input;

import net.java.openjdk.cacio.ctc.ExternalMouseReader;
import net.java.openjdk.cacio.ctc.InfdevGrabHandler;
import org.lwjgl.input.Mouse;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-lwjglx.jar:org/lwjgl/input/InfdevMouse.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-lwjglx.jar:org/lwjgl/input/InfdevMouse.class */
public class InfdevMouse implements ExternalMouseReader, Mouse.EmptyCursorGrabListener {
    static {
        InfdevGrabHandler.setMouseReader(new InfdevMouse());
    }

    @Override // net.java.openjdk.cacio.ctc.ExternalMouseReader
    public int getX() {
        return Mouse.getAbsoluteX();
    }

    @Override // net.java.openjdk.cacio.ctc.ExternalMouseReader
    public int getY() {
        return Mouse.getAbsoluteY();
    }

    @Override // org.lwjgl.input.Mouse.EmptyCursorGrabListener
    public void onGrab(boolean grabbing) {
        InfdevGrabHandler.setGrabbed(grabbing);
    }
}
