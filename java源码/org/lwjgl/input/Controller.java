package org.lwjgl.input;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-lwjglx.jar:org/lwjgl/input/Controller.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-lwjglx.jar:org/lwjgl/input/Controller.class */
public interface Controller {
    String getName();

    int getIndex();

    int getButtonCount();

    String getButtonName(int i);

    boolean isButtonPressed(int i);

    void poll();

    float getPovX();

    float getPovY();

    float getDeadZone(int i);

    void setDeadZone(int i, float f);

    int getAxisCount();

    String getAxisName(int i);

    float getAxisValue(int i);

    float getXAxisValue();

    float getXAxisDeadZone();

    void setXAxisDeadZone(float f);

    float getYAxisValue();

    float getYAxisDeadZone();

    void setYAxisDeadZone(float f);

    float getZAxisValue();

    float getZAxisDeadZone();

    void setZAxisDeadZone(float f);

    float getRXAxisValue();

    float getRXAxisDeadZone();

    void setRXAxisDeadZone(float f);

    float getRYAxisValue();

    float getRYAxisDeadZone();

    void setRYAxisDeadZone(float f);

    float getRZAxisValue();

    float getRZAxisDeadZone();

    void setRZAxisDeadZone(float f);

    int getRumblerCount();

    String getRumblerName(int i);

    void setRumblerStrength(int i, float f);
}
