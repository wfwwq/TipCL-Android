package org.lwjgl.opengl;

import java.awt.Canvas;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import org.lwjgl.LWJGLException;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-lwjglx.jar:org/lwjgl/opengl/DisplayImplementation.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-lwjglx.jar:org/lwjgl/opengl/DisplayImplementation.class */
interface DisplayImplementation extends InputImplementation {
    void createWindow(DrawableLWJGL drawableLWJGL, DisplayMode displayMode, Canvas canvas, int i, int i2) throws LWJGLException;

    void destroyWindow();

    void switchDisplayMode(DisplayMode displayMode) throws LWJGLException;

    void resetDisplayMode();

    int getGammaRampLength();

    void setGammaRamp(FloatBuffer floatBuffer) throws LWJGLException;

    String getAdapter();

    String getVersion();

    DisplayMode init() throws LWJGLException;

    void setTitle(String str);

    boolean isCloseRequested();

    boolean isVisible();

    boolean isActive();

    boolean isDirty();

    PeerInfo createPeerInfo(PixelFormat pixelFormat, ContextAttribs contextAttribs) throws LWJGLException;

    void update();

    void reshape(int i, int i2, int i3, int i4);

    DisplayMode[] getAvailableDisplayModes() throws LWJGLException;

    int getPbufferCapabilities();

    boolean isBufferLost(PeerInfo peerInfo);

    PeerInfo createPbuffer(int i, int i2, PixelFormat pixelFormat, ContextAttribs contextAttribs, IntBuffer intBuffer, IntBuffer intBuffer2) throws LWJGLException;

    void setPbufferAttrib(PeerInfo peerInfo, int i, int i2);

    void bindTexImageToPbuffer(PeerInfo peerInfo, int i);

    void releaseTexImageFromPbuffer(PeerInfo peerInfo, int i);

    int setIcon(ByteBuffer[] byteBufferArr);

    void setResizable(boolean z);

    boolean wasResized();

    @Override // org.lwjgl.opengl.InputImplementation
    int getWidth();

    @Override // org.lwjgl.opengl.InputImplementation
    int getHeight();

    int getX();

    int getY();

    float getPixelScaleFactor();
}
