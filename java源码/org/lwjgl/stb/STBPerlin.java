package org.lwjgl.stb;

import org.lwjgl.system.NativeType;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-stb.jar:org/lwjgl/stb/STBPerlin.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-stb.jar:org/lwjgl/stb/STBPerlin.class */
public class STBPerlin {
    public static native float stb_perlin_noise3(float f, float f2, float f3, int i, int i2, int i3);

    public static native float stb_perlin_noise3_seed(float f, float f2, float f3, int i, int i2, int i3, int i4);

    public static native float stb_perlin_ridge_noise3(float f, float f2, float f3, float f4, float f5, float f6, int i);

    public static native float stb_perlin_fbm_noise3(float f, float f2, float f3, float f4, float f5, int i);

    public static native float stb_perlin_turbulence_noise3(float f, float f2, float f3, float f4, float f5, int i);

    public static native float stb_perlin_noise3_wrap_nonpow2(float f, float f2, float f3, int i, int i2, int i3, @NativeType("unsigned char") byte b);

    static {
        LibSTB.initialize();
    }

    protected STBPerlin() {
        throw new UnsupportedOperationException();
    }
}
