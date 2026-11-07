package org.lwjgl.util.glu;

import org.lwjgl.opengl.GL11;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-lwjglx.jar:org/lwjgl/util/glu/PixelStoreState.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-lwjglx.jar:org/lwjgl/util/glu/PixelStoreState.class */
class PixelStoreState extends Util {
    public int unpackRowLength;
    public int unpackAlignment;
    public int unpackSkipRows;
    public int unpackSkipPixels;
    public int packRowLength;
    public int packAlignment;
    public int packSkipRows;
    public int packSkipPixels;

    PixelStoreState() {
        load();
    }

    public void load() {
        this.unpackRowLength = GL11.glGetInteger(3314);
        this.unpackAlignment = GL11.glGetInteger(3317);
        this.unpackSkipRows = GL11.glGetInteger(3315);
        this.unpackSkipPixels = GL11.glGetInteger(3316);
        this.packRowLength = GL11.glGetInteger(3330);
        this.packAlignment = GL11.glGetInteger(3333);
        this.packSkipRows = GL11.glGetInteger(3331);
        this.packSkipPixels = GL11.glGetInteger(3332);
    }

    public void save() {
        GL11.glPixelStorei(3314, this.unpackRowLength);
        GL11.glPixelStorei(3317, this.unpackAlignment);
        GL11.glPixelStorei(3315, this.unpackSkipRows);
        GL11.glPixelStorei(3316, this.unpackSkipPixels);
        GL11.glPixelStorei(3330, this.packRowLength);
        GL11.glPixelStorei(3333, this.packAlignment);
        GL11.glPixelStorei(3331, this.packSkipRows);
        GL11.glPixelStorei(3332, this.packSkipPixels);
    }
}
