package org.lwjgl.stb;

import org.lwjgl.stb.STBRPNode;
import org.lwjgl.stb.STBRPRect;
import org.lwjgl.system.NativeType;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-stb.jar:org/lwjgl/stb/STBRectPack.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-stb.jar:org/lwjgl/stb/STBRectPack.class */
public class STBRectPack {
    public static final int STBRP__MAXVAL = Integer.MAX_VALUE;
    public static final int STBRP_HEURISTIC_Skyline_default = 0;
    public static final int STBRP_HEURISTIC_Skyline_BL_sortHeight = 0;
    public static final int STBRP_HEURISTIC_Skyline_BF_sortHeight = 1;

    public static native int nstbrp_pack_rects(long j, long j2, int i);

    public static native void nstbrp_init_target(long j, int i, int i2, long j2, int i3);

    public static native void nstbrp_setup_allow_out_of_mem(long j, int i);

    public static native void nstbrp_setup_heuristic(long j, int i);

    static {
        LibSTB.initialize();
    }

    protected STBRectPack() {
        throw new UnsupportedOperationException();
    }

    public static int stbrp_pack_rects(@NativeType("stbrp_context *") STBRPContext context, @NativeType("stbrp_rect *") STBRPRect.Buffer rects) {
        return nstbrp_pack_rects(context.address(), rects.address(), rects.remaining());
    }

    public static void stbrp_init_target(@NativeType("stbrp_context *") STBRPContext context, int width, int height, @NativeType("stbrp_node *") STBRPNode.Buffer nodes) {
        nstbrp_init_target(context.address(), width, height, nodes.address(), nodes.remaining());
    }

    public static void stbrp_setup_allow_out_of_mem(@NativeType("stbrp_context *") STBRPContext context, @NativeType("int") boolean allow_out_of_mem) {
        nstbrp_setup_allow_out_of_mem(context.address(), allow_out_of_mem ? 1 : 0);
    }

    public static void stbrp_setup_heuristic(@NativeType("stbrp_context *") STBRPContext context, int heuristic) {
        nstbrp_setup_heuristic(context.address(), heuristic);
    }
}
