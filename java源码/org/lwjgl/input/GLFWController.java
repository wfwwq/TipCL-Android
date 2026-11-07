package org.lwjgl.input;

import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import org.lwjgl.glfw.GLFW;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-lwjglx.jar:org/lwjgl/input/GLFWController.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-lwjglx.jar:org/lwjgl/input/GLFWController.class */
public class GLFWController implements Controller {
    int jid;
    FloatBuffer axisData = FloatBuffer.allocate(8);
    ByteBuffer buttonData = ByteBuffer.allocate(8);

    @Override // org.lwjgl.input.Controller
    public String getName() {
        return GLFW.glfwGetJoystickName(this.jid);
    }

    @Override // org.lwjgl.input.Controller
    public int getIndex() {
        return this.jid;
    }

    @Override // org.lwjgl.input.Controller
    public int getButtonCount() {
        return 8;
    }

    @Override // org.lwjgl.input.Controller
    public String getButtonName(int index) {
        switch (index) {
            case 0:
                return "A";
            case 1:
                return "B";
            case 2:
                return "X";
            case 3:
                return "Y";
            case 4:
                return "DPAD LEFT";
            case 5:
                return "DPAD RIGHT";
            case 6:
                return "DPAD UP";
            case 7:
                return "DPAD DOWN";
            default:
                return null;
        }
    }

    @Override // org.lwjgl.input.Controller
    public boolean isButtonPressed(int index) {
        return index < 8 && this.buttonData.get(index) == 1;
    }

    @Override // org.lwjgl.input.Controller
    public void poll() {
    }

    @Override // org.lwjgl.input.Controller
    public float getPovX() {
        return this.axisData.get(6);
    }

    @Override // org.lwjgl.input.Controller
    public float getPovY() {
        return this.axisData.get(7);
    }

    @Override // org.lwjgl.input.Controller
    public float getDeadZone(int index) {
        return 0.0f;
    }

    @Override // org.lwjgl.input.Controller
    public void setDeadZone(int index, float zone) {
    }

    @Override // org.lwjgl.input.Controller
    public int getAxisCount() {
        return 8;
    }

    @Override // org.lwjgl.input.Controller
    public String getAxisName(int index) {
        switch (index) {
            case 0:
                return "AXIS X";
            case 1:
                return "AXIS Y";
            case 2:
                return "AXIS Z";
            case 3:
                return "AXIS RX";
            case 4:
                return "AXIS RY";
            case 5:
                return "AXIS RZ";
            case 6:
                return "HAT/POV X";
            case 7:
                return "HAT/POV Y";
            default:
                return null;
        }
    }

    @Override // org.lwjgl.input.Controller
    public float getAxisValue(int index) {
        return this.axisData.get(index);
    }

    @Override // org.lwjgl.input.Controller
    public float getXAxisValue() {
        return this.axisData.get(0);
    }

    @Override // org.lwjgl.input.Controller
    public float getXAxisDeadZone() {
        return 0.0f;
    }

    @Override // org.lwjgl.input.Controller
    public void setXAxisDeadZone(float zone) {
    }

    @Override // org.lwjgl.input.Controller
    public float getYAxisValue() {
        return this.axisData.get(1);
    }

    @Override // org.lwjgl.input.Controller
    public float getYAxisDeadZone() {
        return 0.0f;
    }

    @Override // org.lwjgl.input.Controller
    public void setYAxisDeadZone(float zone) {
    }

    @Override // org.lwjgl.input.Controller
    public float getZAxisValue() {
        return this.axisData.get(2);
    }

    @Override // org.lwjgl.input.Controller
    public float getZAxisDeadZone() {
        return 0.0f;
    }

    @Override // org.lwjgl.input.Controller
    public void setZAxisDeadZone(float zone) {
    }

    @Override // org.lwjgl.input.Controller
    public float getRXAxisValue() {
        return this.axisData.get(3);
    }

    @Override // org.lwjgl.input.Controller
    public float getRXAxisDeadZone() {
        return 0.0f;
    }

    @Override // org.lwjgl.input.Controller
    public void setRXAxisDeadZone(float zone) {
    }

    @Override // org.lwjgl.input.Controller
    public float getRYAxisValue() {
        return this.axisData.get(4);
    }

    @Override // org.lwjgl.input.Controller
    public float getRYAxisDeadZone() {
        return 0.0f;
    }

    @Override // org.lwjgl.input.Controller
    public void setRYAxisDeadZone(float zone) {
    }

    @Override // org.lwjgl.input.Controller
    public float getRZAxisValue() {
        return this.axisData.get(5);
    }

    @Override // org.lwjgl.input.Controller
    public float getRZAxisDeadZone() {
        return 0.0f;
    }

    @Override // org.lwjgl.input.Controller
    public void setRZAxisDeadZone(float zone) {
    }

    @Override // org.lwjgl.input.Controller
    public int getRumblerCount() {
        return 0;
    }

    @Override // org.lwjgl.input.Controller
    public String getRumblerName(int index) {
        return null;
    }

    @Override // org.lwjgl.input.Controller
    public void setRumblerStrength(int index, float strength) {
    }
}
