package org.lwjgl.nanovg;

import org.lwjgl.system.APIUtil;
import org.lwjgl.system.Checks;
import org.lwjgl.system.Configuration;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.SharedLibrary;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-nanovg.jar:org/lwjgl/nanovg/NanoVGBGFX.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-nanovg.jar:org/lwjgl/nanovg/NanoVGBGFX.class */
public class NanoVGBGFX {
    public static final int NVG_IMAGE_NODELETE = 65536;

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-nanovg.jar:org/lwjgl/nanovg/NanoVGBGFX$Functions.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-nanovg.jar:org/lwjgl/nanovg/NanoVGBGFX$Functions.class */
    public static final class Functions {
        public static final long Create = APIUtil.apiGetFunctionAddress(BGFX.getLibrary(), "nvgCreate");
        public static final long Delete = APIUtil.apiGetFunctionAddress(BGFX.getLibrary(), "nvgDelete");
        public static final long SetViewId = APIUtil.apiGetFunctionAddress(BGFX.getLibrary(), "nvgSetViewId");
        public static final long GetViewId = APIUtil.apiGetFunctionAddress(BGFX.getLibrary(), "nvgGetViewId");
        public static final long luCreateFramebuffer = APIUtil.apiGetFunctionAddress(BGFX.getLibrary(), "nvgluCreateFramebuffer");
        public static final long luBindFramebuffer = APIUtil.apiGetFunctionAddress(BGFX.getLibrary(), "nvgluBindFramebuffer");
        public static final long luDeleteFramebuffer = APIUtil.apiGetFunctionAddress(BGFX.getLibrary(), "nvgluDeleteFramebuffer");
        public static final long luSetViewFramebuffer = APIUtil.apiGetFunctionAddress(BGFX.getLibrary(), "nvgluSetViewFramebuffer");
        public static final long CreateBgfxTexture = APIUtil.apiGetFunctionAddress(BGFX.getLibrary(), "nvgCreateBgfxTexture");
        public static final long org_lwjgl_nanovg_setup = APIUtil.apiGetFunctionAddress(BGFX.getLibrary(), "org_lwjgl_nanovg_setup");

        private Functions() {
        }
    }

    static {
        MemoryUtil.MemoryAllocator allocator = MemoryUtil.getAllocator(Configuration.DEBUG_MEMORY_ALLOCATOR_INTERNAL.get(true).booleanValue());
        org_lwjgl_nanovg_setup(allocator.getRealloc(), allocator.getFree(), NanoVG.nvgCreateInternal, NanoVG.nvgInternalParams, NanoVG.nvgDeleteInternal);
    }

    protected NanoVGBGFX() {
        throw new UnsupportedOperationException();
    }

    public static long nnvgCreate(int _edgeaa, short _viewId, long _allocator) {
        long __functionAddress = Functions.Create;
        return JNI.invokeCPP(_edgeaa, _viewId, _allocator, __functionAddress);
    }

    @NativeType("NVGcontext *")
    public static long nvgCreate(@NativeType("int32_t") boolean _edgeaa, @NativeType("bgfx_view_id_t") int _viewId, @NativeType("bgfx_allocator_interface_t *") long _allocator) {
        return nnvgCreate(_edgeaa ? 1 : 0, (short) _viewId, _allocator);
    }

    public static void nvgDelete(@NativeType("NVGcontext *") long _ctx) {
        long __functionAddress = Functions.Delete;
        if (Checks.CHECKS) {
            Checks.check(_ctx);
        }
        JNI.invokePV(_ctx, __functionAddress);
    }

    public static void nnvgSetViewId(long _ctx, short _viewId) {
        long __functionAddress = Functions.SetViewId;
        if (Checks.CHECKS) {
            Checks.check(_ctx);
        }
        JNI.invokePCV(_ctx, _viewId, __functionAddress);
    }

    public static void nvgSetViewId(@NativeType("NVGcontext *") long _ctx, @NativeType("bgfx_view_id_t") int _viewId) {
        nnvgSetViewId(_ctx, (short) _viewId);
    }

    @NativeType("uint16_t")
    public static short nvgGetViewId(@NativeType("NVGcontext *") long _ctx) {
        long __functionAddress = Functions.GetViewId;
        if (Checks.CHECKS) {
            Checks.check(_ctx);
        }
        return JNI.invokePC(_ctx, __functionAddress);
    }

    public static long nnvgluCreateFramebuffer(long _ctx, int _width, int _height, int imageFlags) {
        long __functionAddress = Functions.luCreateFramebuffer;
        if (Checks.CHECKS) {
            Checks.check(_ctx);
        }
        return JNI.invokePP(_ctx, _width, _height, imageFlags, __functionAddress);
    }

    @NativeType("NVGLUframebuffer *")
    public static NVGLUFramebufferBGFX nvgluCreateFramebuffer(@NativeType("NVGcontext *") long _ctx, @NativeType("int32_t") int _width, @NativeType("int32_t") int _height, @NativeType("int32_t") int imageFlags) {
        long __result = nnvgluCreateFramebuffer(_ctx, _width, _height, imageFlags);
        return NVGLUFramebufferBGFX.createSafe(__result);
    }

    public static void nnvgluBindFramebuffer(long _framebuffer) {
        long __functionAddress = Functions.luBindFramebuffer;
        JNI.invokePV(_framebuffer, __functionAddress);
    }

    public static void nvgluBindFramebuffer(@NativeType("NVGLUframebuffer *") NVGLUFramebufferBGFX _framebuffer) {
        nnvgluBindFramebuffer(MemoryUtil.memAddressSafe(_framebuffer));
    }

    public static void nnvgluDeleteFramebuffer(long _framebuffer) {
        long __functionAddress = Functions.luDeleteFramebuffer;
        JNI.invokePV(_framebuffer, __functionAddress);
    }

    public static void nvgluDeleteFramebuffer(@NativeType("NVGLUframebuffer *") NVGLUFramebufferBGFX _framebuffer) {
        nnvgluDeleteFramebuffer(_framebuffer.address());
    }

    public static void nnvgluSetViewFramebuffer(short _view_id, long _framebuffer) {
        long __functionAddress = Functions.luSetViewFramebuffer;
        JNI.invokeCPV(_view_id, _framebuffer, __functionAddress);
    }

    public static void nvgluSetViewFramebuffer(@NativeType("bgfx_view_id_t") int _view_id, @NativeType("NVGLUframebuffer *") NVGLUFramebufferBGFX _framebuffer) {
        nnvgluSetViewFramebuffer((short) _view_id, _framebuffer.address());
    }

    public static void nvgCreateBgfxTexture(@NativeType("NVGcontext *") long _ctx, @NativeType("bgfx_texture_handle_t") short _id, int _width, int _height, int flags) {
        long __functionAddress = Functions.CreateBgfxTexture;
        if (Checks.CHECKS) {
            Checks.check(_ctx);
        }
        JNI.invokePCV(_ctx, _id, _width, _height, flags, __functionAddress);
    }

    private static void org_lwjgl_nanovg_setup(@NativeType("void *") long realloc, @NativeType("void *") long free, @NativeType("void *") long nvgCreateInternal, @NativeType("void *") long nvgInternalParams, @NativeType("void *") long nvgDeleteInternal) {
        long __functionAddress = Functions.org_lwjgl_nanovg_setup;
        if (Checks.CHECKS) {
            Checks.check(realloc);
            Checks.check(free);
            Checks.check(nvgCreateInternal);
            Checks.check(nvgInternalParams);
            Checks.check(nvgDeleteInternal);
        }
        JNI.invokePPPPPV(realloc, free, nvgCreateInternal, nvgInternalParams, nvgDeleteInternal, __functionAddress);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-nanovg.jar:org/lwjgl/nanovg/NanoVGBGFX$BGFX.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-nanovg.jar:org/lwjgl/nanovg/NanoVGBGFX$BGFX.class */
    private static class BGFX {
        private static final SharedLibrary library;

        private BGFX() {
        }

        static {
            try {
                library = (SharedLibrary) Class.forName("org.lwjgl.bgfx.BGFX").getMethod("getLibrary", new Class[0]).invoke(null, new Object[0]);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }

        static SharedLibrary getLibrary() {
            return library;
        }
    }
}
