package org.lwjgl.sdl;

import org.lwjgl.system.APIUtil;
import org.lwjgl.system.JNI;
import org.lwjgl.system.NativeType;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDLBlendMode.class */
public class SDLBlendMode {
    public static final int SDL_BLENDMODE_NONE = 0;
    public static final int SDL_BLENDMODE_BLEND = 1;
    public static final int SDL_BLENDMODE_BLEND_PREMULTIPLIED = 16;
    public static final int SDL_BLENDMODE_ADD = 2;
    public static final int SDL_BLENDMODE_ADD_PREMULTIPLIED = 32;
    public static final int SDL_BLENDMODE_MOD = 4;
    public static final int SDL_BLENDMODE_MUL = 8;
    public static final int SDL_BLENDMODE_INVALID = Integer.MAX_VALUE;
    public static final int SDL_BLENDOPERATION_ADD = 1;
    public static final int SDL_BLENDOPERATION_SUBTRACT = 2;
    public static final int SDL_BLENDOPERATION_REV_SUBTRACT = 3;
    public static final int SDL_BLENDOPERATION_MINIMUM = 4;
    public static final int SDL_BLENDOPERATION_MAXIMUM = 5;
    public static final int SDL_BLENDFACTOR_ZERO = 1;
    public static final int SDL_BLENDFACTOR_ONE = 2;
    public static final int SDL_BLENDFACTOR_SRC_COLOR = 3;
    public static final int SDL_BLENDFACTOR_ONE_MINUS_SRC_COLOR = 4;
    public static final int SDL_BLENDFACTOR_SRC_ALPHA = 5;
    public static final int SDL_BLENDFACTOR_ONE_MINUS_SRC_ALPHA = 6;
    public static final int SDL_BLENDFACTOR_DST_COLOR = 7;
    public static final int SDL_BLENDFACTOR_ONE_MINUS_DST_COLOR = 8;
    public static final int SDL_BLENDFACTOR_DST_ALPHA = 9;
    public static final int SDL_BLENDFACTOR_ONE_MINUS_DST_ALPHA = 10;

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDLBlendMode$Functions.class */
    public static final class Functions {
        public static final long ComposeCustomBlendMode = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_ComposeCustomBlendMode");

        private Functions() {
        }
    }

    protected SDLBlendMode() {
        throw new UnsupportedOperationException();
    }

    @NativeType("SDL_BlendMode")
    public static int SDL_ComposeCustomBlendMode(@NativeType("SDL_BlendFactor") int srcColorFactor, @NativeType("SDL_BlendFactor") int dstColorFactor, @NativeType("SDL_BlendOperation") int colorOperation, @NativeType("SDL_BlendFactor") int srcAlphaFactor, @NativeType("SDL_BlendFactor") int dstAlphaFactor, @NativeType("SDL_BlendOperation") int alphaOperation) {
        long __functionAddress = Functions.ComposeCustomBlendMode;
        return JNI.invokeI(srcColorFactor, dstColorFactor, colorOperation, srcAlphaFactor, dstAlphaFactor, alphaOperation, __functionAddress);
    }
}
