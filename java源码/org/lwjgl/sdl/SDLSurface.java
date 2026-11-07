package org.lwjgl.sdl;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import org.lwjgl.PointerBuffer;
import org.lwjgl.sdl.SDL_Rect;
import org.lwjgl.system.APIUtil;
import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDLSurface.class */
public class SDLSurface {
    public static final int SDL_SURFACE_PREALLOCATED = 1;
    public static final int SDL_SURFACE_LOCK_NEEDED = 2;
    public static final int SDL_SURFACE_LOCKED = 4;
    public static final int SDL_SURFACE_SIMD_ALIGNED = 8;
    public static final int SDL_SCALEMODE_INVALID = -1;
    public static final int SDL_SCALEMODE_NEAREST = 0;
    public static final int SDL_SCALEMODE_LINEAR = 1;
    public static final int SDL_SCALEMODE_PIXELART = 2;
    public static final int SDL_FLIP_NONE = 0;
    public static final int SDL_FLIP_HORIZONTAL = 1;
    public static final int SDL_FLIP_VERTICAL = 2;
    public static final int SDL_FLIP_HORIZONTAL_AND_VERTICAL = 3;
    public static final String SDL_PROP_SURFACE_SDR_WHITE_POINT_FLOAT = "SDL.surface.SDR_white_point";
    public static final String SDL_PROP_SURFACE_HDR_HEADROOM_FLOAT = "SDL.surface.HDR_headroom";
    public static final String SDL_PROP_SURFACE_TONEMAP_OPERATOR_STRING = "SDL.surface.tonemap";
    public static final String SDL_PROP_SURFACE_HOTSPOT_X_NUMBER = "SDL.surface.hotspot.x";
    public static final String SDL_PROP_SURFACE_HOTSPOT_Y_NUMBER = "SDL.surface.hotspot.y";
    public static final String SDL_PROP_SURFACE_ROTATION_FLOAT = "SDL.surface.rotation";

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDLSurface$Functions.class */
    public static final class Functions {
        public static final long CreateSurface = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_CreateSurface");
        public static final long CreateSurfaceFrom = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_CreateSurfaceFrom");
        public static final long DestroySurface = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_DestroySurface");
        public static final long GetSurfaceProperties = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetSurfaceProperties");
        public static final long SetSurfaceColorspace = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_SetSurfaceColorspace");
        public static final long GetSurfaceColorspace = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetSurfaceColorspace");
        public static final long CreateSurfacePalette = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_CreateSurfacePalette");
        public static final long SetSurfacePalette = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_SetSurfacePalette");
        public static final long GetSurfacePalette = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetSurfacePalette");
        public static final long AddSurfaceAlternateImage = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_AddSurfaceAlternateImage");
        public static final long SurfaceHasAlternateImages = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_SurfaceHasAlternateImages");
        public static final long GetSurfaceImages = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetSurfaceImages");
        public static final long RemoveSurfaceAlternateImages = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_RemoveSurfaceAlternateImages");
        public static final long LockSurface = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_LockSurface");
        public static final long UnlockSurface = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_UnlockSurface");
        public static final long LoadSurface_IO = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_LoadSurface_IO");
        public static final long LoadSurface = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_LoadSurface");
        public static final long LoadBMP_IO = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_LoadBMP_IO");
        public static final long LoadBMP = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_LoadBMP");
        public static final long SaveBMP_IO = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_SaveBMP_IO");
        public static final long SaveBMP = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_SaveBMP");
        public static final long LoadPNG_IO = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_LoadPNG_IO");
        public static final long LoadPNG = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_LoadPNG");
        public static final long SavePNG_IO = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_SavePNG_IO");
        public static final long SavePNG = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_SavePNG");
        public static final long SetSurfaceRLE = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_SetSurfaceRLE");
        public static final long SurfaceHasRLE = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_SurfaceHasRLE");
        public static final long SetSurfaceColorKey = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_SetSurfaceColorKey");
        public static final long SurfaceHasColorKey = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_SurfaceHasColorKey");
        public static final long GetSurfaceColorKey = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetSurfaceColorKey");
        public static final long SetSurfaceColorMod = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_SetSurfaceColorMod");
        public static final long GetSurfaceColorMod = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetSurfaceColorMod");
        public static final long SetSurfaceAlphaMod = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_SetSurfaceAlphaMod");
        public static final long GetSurfaceAlphaMod = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetSurfaceAlphaMod");
        public static final long SetSurfaceBlendMode = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_SetSurfaceBlendMode");
        public static final long GetSurfaceBlendMode = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetSurfaceBlendMode");
        public static final long SetSurfaceClipRect = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_SetSurfaceClipRect");
        public static final long GetSurfaceClipRect = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetSurfaceClipRect");
        public static final long FlipSurface = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_FlipSurface");
        public static final long RotateSurface = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_RotateSurface");
        public static final long DuplicateSurface = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_DuplicateSurface");
        public static final long ScaleSurface = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_ScaleSurface");
        public static final long ConvertSurface = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_ConvertSurface");
        public static final long ConvertSurfaceAndColorspace = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_ConvertSurfaceAndColorspace");
        public static final long ConvertPixels = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_ConvertPixels");
        public static final long ConvertPixelsAndColorspace = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_ConvertPixelsAndColorspace");
        public static final long PremultiplyAlpha = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_PremultiplyAlpha");
        public static final long PremultiplySurfaceAlpha = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_PremultiplySurfaceAlpha");
        public static final long ClearSurface = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_ClearSurface");
        public static final long FillSurfaceRect = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_FillSurfaceRect");
        public static final long FillSurfaceRects = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_FillSurfaceRects");
        public static final long BlitSurface = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_BlitSurface");
        public static final long BlitSurfaceUnchecked = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_BlitSurfaceUnchecked");
        public static final long BlitSurfaceScaled = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_BlitSurfaceScaled");
        public static final long BlitSurfaceUncheckedScaled = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_BlitSurfaceUncheckedScaled");
        public static final long StretchSurface = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_StretchSurface");
        public static final long BlitSurfaceTiled = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_BlitSurfaceTiled");
        public static final long BlitSurfaceTiledWithScale = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_BlitSurfaceTiledWithScale");
        public static final long BlitSurface9Grid = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_BlitSurface9Grid");
        public static final long MapSurfaceRGB = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_MapSurfaceRGB");
        public static final long MapSurfaceRGBA = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_MapSurfaceRGBA");
        public static final long ReadSurfacePixel = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_ReadSurfacePixel");
        public static final long ReadSurfacePixelFloat = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_ReadSurfacePixelFloat");
        public static final long WriteSurfacePixel = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_WriteSurfacePixel");
        public static final long WriteSurfacePixelFloat = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_WriteSurfacePixelFloat");

        private Functions() {
        }
    }

    protected SDLSurface() {
        throw new UnsupportedOperationException();
    }

    public static long nSDL_CreateSurface(int width, int height, int format) {
        long __functionAddress = Functions.CreateSurface;
        return JNI.invokeP(width, height, format, __functionAddress);
    }

    @NativeType("SDL_Surface *")
    public static SDL_Surface SDL_CreateSurface(int width, int height, @NativeType("SDL_PixelFormat") int format) {
        long __result = nSDL_CreateSurface(width, height, format);
        return SDL_Surface.createSafe(__result);
    }

    public static long nSDL_CreateSurfaceFrom(int width, int height, int format, long pixels, int pitch) {
        long __functionAddress = Functions.CreateSurfaceFrom;
        return JNI.invokePP(width, height, format, pixels, pitch, __functionAddress);
    }

    @NativeType("SDL_Surface *")
    public static SDL_Surface SDL_CreateSurfaceFrom(int width, int height, @NativeType("SDL_PixelFormat") int format, @NativeType("void *") ByteBuffer pixels, int pitch) {
        if (Checks.CHECKS) {
            Checks.checkSafe((Buffer) pixels, height * pitch);
        }
        long __result = nSDL_CreateSurfaceFrom(width, height, format, MemoryUtil.memAddressSafe(pixels), pitch);
        return SDL_Surface.createSafe(__result);
    }

    public static void nSDL_DestroySurface(long surface) {
        long __functionAddress = Functions.DestroySurface;
        JNI.invokePV(surface, __functionAddress);
    }

    public static void SDL_DestroySurface(@NativeType("SDL_Surface *") SDL_Surface surface) {
        nSDL_DestroySurface(surface.address());
    }

    public static int nSDL_GetSurfaceProperties(long surface) {
        long __functionAddress = Functions.GetSurfaceProperties;
        return JNI.invokePI(surface, __functionAddress);
    }

    @NativeType("SDL_PropertiesID")
    public static int SDL_GetSurfaceProperties(@NativeType("SDL_Surface *") SDL_Surface surface) {
        return nSDL_GetSurfaceProperties(surface.address());
    }

    public static boolean nSDL_SetSurfaceColorspace(long surface, int colorspace) {
        long __functionAddress = Functions.SetSurfaceColorspace;
        return JNI.invokePZ(surface, colorspace, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_SetSurfaceColorspace(@NativeType("SDL_Surface *") SDL_Surface surface, @NativeType("SDL_Colorspace") int colorspace) {
        return nSDL_SetSurfaceColorspace(surface.address(), colorspace);
    }

    public static int nSDL_GetSurfaceColorspace(long surface) {
        long __functionAddress = Functions.GetSurfaceColorspace;
        return JNI.invokePI(surface, __functionAddress);
    }

    @NativeType("SDL_Colorspace")
    public static int SDL_GetSurfaceColorspace(@NativeType("SDL_Surface *") SDL_Surface surface) {
        return nSDL_GetSurfaceColorspace(surface.address());
    }

    public static long nSDL_CreateSurfacePalette(long surface) {
        long __functionAddress = Functions.CreateSurfacePalette;
        return JNI.invokePP(surface, __functionAddress);
    }

    @NativeType("SDL_Palette *")
    public static SDL_Palette SDL_CreateSurfacePalette(@NativeType("SDL_Surface *") SDL_Surface surface) {
        long __result = nSDL_CreateSurfacePalette(surface.address());
        return SDL_Palette.createSafe(__result);
    }

    public static boolean nSDL_SetSurfacePalette(long surface, long palette) {
        long __functionAddress = Functions.SetSurfacePalette;
        return JNI.invokePPZ(surface, palette, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_SetSurfacePalette(@NativeType("SDL_Surface *") SDL_Surface surface, @NativeType("SDL_Palette *") SDL_Palette palette) {
        return nSDL_SetSurfacePalette(surface.address(), MemoryUtil.memAddressSafe(palette));
    }

    public static long nSDL_GetSurfacePalette(long surface) {
        long __functionAddress = Functions.GetSurfacePalette;
        return JNI.invokePP(surface, __functionAddress);
    }

    @NativeType("SDL_Palette *")
    public static SDL_Palette SDL_GetSurfacePalette(@NativeType("SDL_Surface *") SDL_Surface surface) {
        long __result = nSDL_GetSurfacePalette(surface.address());
        return SDL_Palette.createSafe(__result);
    }

    public static boolean nSDL_AddSurfaceAlternateImage(long surface, long image) {
        long __functionAddress = Functions.AddSurfaceAlternateImage;
        return JNI.invokePPZ(surface, image, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_AddSurfaceAlternateImage(@NativeType("SDL_Surface *") SDL_Surface surface, @NativeType("SDL_Surface *") SDL_Surface image) {
        return nSDL_AddSurfaceAlternateImage(surface.address(), image.address());
    }

    public static boolean nSDL_SurfaceHasAlternateImages(long surface) {
        long __functionAddress = Functions.SurfaceHasAlternateImages;
        return JNI.invokePZ(surface, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_SurfaceHasAlternateImages(@NativeType("SDL_Surface *") SDL_Surface surface) {
        return nSDL_SurfaceHasAlternateImages(surface.address());
    }

    public static long nSDL_GetSurfaceImages(long surface, long count) {
        long __functionAddress = Functions.GetSurfaceImages;
        return JNI.invokePPP(surface, count, __functionAddress);
    }

    @NativeType("SDL_Surface **")
    public static PointerBuffer SDL_GetSurfaceImages(@NativeType("SDL_Surface *") SDL_Surface surface) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        IntBuffer count = stack.callocInt(1);
        try {
            long __result = nSDL_GetSurfaceImages(surface.address(), MemoryUtil.memAddress(count));
            PointerBuffer pointerBufferMemPointerBufferSafe = MemoryUtil.memPointerBufferSafe(__result, count.get(0));
            stack.setPointer(stackPointer);
            return pointerBufferMemPointerBufferSafe;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static void nSDL_RemoveSurfaceAlternateImages(long surface) {
        long __functionAddress = Functions.RemoveSurfaceAlternateImages;
        JNI.invokePV(surface, __functionAddress);
    }

    public static void SDL_RemoveSurfaceAlternateImages(@NativeType("SDL_Surface *") SDL_Surface surface) {
        nSDL_RemoveSurfaceAlternateImages(surface.address());
    }

    public static boolean nSDL_LockSurface(long surface) {
        long __functionAddress = Functions.LockSurface;
        return JNI.invokePZ(surface, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_LockSurface(@NativeType("SDL_Surface *") SDL_Surface surface) {
        return nSDL_LockSurface(surface.address());
    }

    public static void nSDL_UnlockSurface(long surface) {
        long __functionAddress = Functions.UnlockSurface;
        JNI.invokePV(surface, __functionAddress);
    }

    public static void SDL_UnlockSurface(@NativeType("SDL_Surface *") SDL_Surface surface) {
        nSDL_UnlockSurface(surface.address());
    }

    public static long nSDL_LoadSurface_IO(long src, boolean closeio) {
        long __functionAddress = Functions.LoadSurface_IO;
        if (Checks.CHECKS) {
            Checks.check(src);
        }
        return JNI.invokePP(src, closeio, __functionAddress);
    }

    @NativeType("SDL_Surface *")
    public static SDL_Surface SDL_LoadSurface_IO(@NativeType("SDL_IOStream *") long src, @NativeType("bool") boolean closeio) {
        long __result = nSDL_LoadSurface_IO(src, closeio);
        return SDL_Surface.createSafe(__result);
    }

    public static long nSDL_LoadSurface(long file) {
        long __functionAddress = Functions.LoadSurface;
        return JNI.invokePP(file, __functionAddress);
    }

    @NativeType("SDL_Surface *")
    public static SDL_Surface SDL_LoadSurface(@NativeType("char const *") ByteBuffer file) {
        if (Checks.CHECKS) {
            Checks.checkNT1(file);
        }
        long __result = nSDL_LoadSurface(MemoryUtil.memAddress(file));
        return SDL_Surface.createSafe(__result);
    }

    @NativeType("SDL_Surface *")
    public static SDL_Surface SDL_LoadSurface(@NativeType("char const *") CharSequence file) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(file, true);
            long fileEncoded = stack.getPointerAddress();
            long __result = nSDL_LoadSurface(fileEncoded);
            SDL_Surface sDL_SurfaceCreateSafe = SDL_Surface.createSafe(__result);
            stack.setPointer(stackPointer);
            return sDL_SurfaceCreateSafe;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static long nSDL_LoadBMP_IO(long src, boolean closeio) {
        long __functionAddress = Functions.LoadBMP_IO;
        if (Checks.CHECKS) {
            Checks.check(src);
        }
        return JNI.invokePP(src, closeio, __functionAddress);
    }

    @NativeType("SDL_Surface *")
    public static SDL_Surface SDL_LoadBMP_IO(@NativeType("SDL_IOStream *") long src, @NativeType("bool") boolean closeio) {
        long __result = nSDL_LoadBMP_IO(src, closeio);
        return SDL_Surface.createSafe(__result);
    }

    public static long nSDL_LoadBMP(long file) {
        long __functionAddress = Functions.LoadBMP;
        return JNI.invokePP(file, __functionAddress);
    }

    @NativeType("SDL_Surface *")
    public static SDL_Surface SDL_LoadBMP(@NativeType("char const *") ByteBuffer file) {
        if (Checks.CHECKS) {
            Checks.checkNT1(file);
        }
        long __result = nSDL_LoadBMP(MemoryUtil.memAddress(file));
        return SDL_Surface.createSafe(__result);
    }

    @NativeType("SDL_Surface *")
    public static SDL_Surface SDL_LoadBMP(@NativeType("char const *") CharSequence file) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(file, true);
            long fileEncoded = stack.getPointerAddress();
            long __result = nSDL_LoadBMP(fileEncoded);
            SDL_Surface sDL_SurfaceCreateSafe = SDL_Surface.createSafe(__result);
            stack.setPointer(stackPointer);
            return sDL_SurfaceCreateSafe;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static boolean nSDL_SaveBMP_IO(long surface, long dst, boolean closeio) {
        long __functionAddress = Functions.SaveBMP_IO;
        if (Checks.CHECKS) {
            Checks.check(dst);
        }
        return JNI.invokePPZ(surface, dst, closeio, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_SaveBMP_IO(@NativeType("SDL_Surface *") SDL_Surface surface, @NativeType("SDL_IOStream *") long dst, @NativeType("bool") boolean closeio) {
        return nSDL_SaveBMP_IO(surface.address(), dst, closeio);
    }

    public static boolean nSDL_SaveBMP(long surface, long file) {
        long __functionAddress = Functions.SaveBMP;
        return JNI.invokePPZ(surface, file, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_SaveBMP(@NativeType("SDL_Surface *") SDL_Surface surface, @NativeType("char const *") ByteBuffer file) {
        if (Checks.CHECKS) {
            Checks.checkNT1(file);
        }
        return nSDL_SaveBMP(surface.address(), MemoryUtil.memAddress(file));
    }

    @NativeType("bool")
    public static boolean SDL_SaveBMP(@NativeType("SDL_Surface *") SDL_Surface surface, @NativeType("char const *") CharSequence file) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(file, true);
            long fileEncoded = stack.getPointerAddress();
            boolean zNSDL_SaveBMP = nSDL_SaveBMP(surface.address(), fileEncoded);
            stack.setPointer(stackPointer);
            return zNSDL_SaveBMP;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static long nSDL_LoadPNG_IO(long src, boolean closeio) {
        long __functionAddress = Functions.LoadPNG_IO;
        if (Checks.CHECKS) {
            Checks.check(src);
        }
        return JNI.invokePP(src, closeio, __functionAddress);
    }

    @NativeType("SDL_Surface *")
    public static SDL_Surface SDL_LoadPNG_IO(@NativeType("SDL_IOStream *") long src, @NativeType("bool") boolean closeio) {
        long __result = nSDL_LoadPNG_IO(src, closeio);
        return SDL_Surface.createSafe(__result);
    }

    public static long nSDL_LoadPNG(long file) {
        long __functionAddress = Functions.LoadPNG;
        return JNI.invokePP(file, __functionAddress);
    }

    @NativeType("SDL_Surface *")
    public static SDL_Surface SDL_LoadPNG(@NativeType("char const *") ByteBuffer file) {
        if (Checks.CHECKS) {
            Checks.checkNT1(file);
        }
        long __result = nSDL_LoadPNG(MemoryUtil.memAddress(file));
        return SDL_Surface.createSafe(__result);
    }

    @NativeType("SDL_Surface *")
    public static SDL_Surface SDL_LoadPNG(@NativeType("char const *") CharSequence file) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(file, true);
            long fileEncoded = stack.getPointerAddress();
            long __result = nSDL_LoadPNG(fileEncoded);
            SDL_Surface sDL_SurfaceCreateSafe = SDL_Surface.createSafe(__result);
            stack.setPointer(stackPointer);
            return sDL_SurfaceCreateSafe;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static boolean nSDL_SavePNG_IO(long surface, long dst, boolean closeio) {
        long __functionAddress = Functions.SavePNG_IO;
        if (Checks.CHECKS) {
            Checks.check(dst);
        }
        return JNI.invokePPZ(surface, dst, closeio, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_SavePNG_IO(@NativeType("SDL_Surface *") SDL_Surface surface, @NativeType("SDL_IOStream *") long dst, @NativeType("bool") boolean closeio) {
        return nSDL_SavePNG_IO(surface.address(), dst, closeio);
    }

    public static boolean nSDL_SavePNG(long surface, long file) {
        long __functionAddress = Functions.SavePNG;
        return JNI.invokePPZ(surface, file, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_SavePNG(@NativeType("SDL_Surface *") SDL_Surface surface, @NativeType("char const *") ByteBuffer file) {
        if (Checks.CHECKS) {
            Checks.checkNT1(file);
        }
        return nSDL_SavePNG(surface.address(), MemoryUtil.memAddress(file));
    }

    @NativeType("bool")
    public static boolean SDL_SavePNG(@NativeType("SDL_Surface *") SDL_Surface surface, @NativeType("char const *") CharSequence file) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(file, true);
            long fileEncoded = stack.getPointerAddress();
            boolean zNSDL_SavePNG = nSDL_SavePNG(surface.address(), fileEncoded);
            stack.setPointer(stackPointer);
            return zNSDL_SavePNG;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static boolean nSDL_SetSurfaceRLE(long surface, boolean enabled) {
        long __functionAddress = Functions.SetSurfaceRLE;
        return JNI.invokePZ(surface, enabled, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_SetSurfaceRLE(@NativeType("SDL_Surface *") SDL_Surface surface, @NativeType("bool") boolean enabled) {
        return nSDL_SetSurfaceRLE(surface.address(), enabled);
    }

    public static boolean nSDL_SurfaceHasRLE(long surface) {
        long __functionAddress = Functions.SurfaceHasRLE;
        return JNI.invokePZ(surface, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_SurfaceHasRLE(@NativeType("SDL_Surface *") SDL_Surface surface) {
        return nSDL_SurfaceHasRLE(surface.address());
    }

    public static boolean nSDL_SetSurfaceColorKey(long surface, boolean enabled, int key) {
        long __functionAddress = Functions.SetSurfaceColorKey;
        return JNI.invokePZ(surface, enabled, key, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_SetSurfaceColorKey(@NativeType("SDL_Surface *") SDL_Surface surface, @NativeType("bool") boolean enabled, @NativeType("Uint32") int key) {
        return nSDL_SetSurfaceColorKey(surface.address(), enabled, key);
    }

    public static boolean nSDL_SurfaceHasColorKey(long surface) {
        long __functionAddress = Functions.SurfaceHasColorKey;
        return JNI.invokePZ(surface, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_SurfaceHasColorKey(@NativeType("SDL_Surface *") SDL_Surface surface) {
        return nSDL_SurfaceHasColorKey(surface.address());
    }

    public static boolean nSDL_GetSurfaceColorKey(long surface, long key) {
        long __functionAddress = Functions.GetSurfaceColorKey;
        return JNI.invokePPZ(surface, key, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_GetSurfaceColorKey(@NativeType("SDL_Surface *") SDL_Surface surface, @NativeType("Uint32 *") IntBuffer key) {
        if (Checks.CHECKS) {
            Checks.checkSafe((Buffer) key, 1);
        }
        return nSDL_GetSurfaceColorKey(surface.address(), MemoryUtil.memAddressSafe(key));
    }

    public static boolean nSDL_SetSurfaceColorMod(long surface, byte r, byte g, byte b) {
        long __functionAddress = Functions.SetSurfaceColorMod;
        return JNI.invokePUUUZ(surface, r, g, b, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_SetSurfaceColorMod(@NativeType("SDL_Surface *") SDL_Surface surface, @NativeType("Uint8") byte r, @NativeType("Uint8") byte g, @NativeType("Uint8") byte b) {
        return nSDL_SetSurfaceColorMod(surface.address(), r, g, b);
    }

    public static boolean nSDL_GetSurfaceColorMod(long surface, long r, long g, long b) {
        long __functionAddress = Functions.GetSurfaceColorMod;
        return JNI.invokePPPPZ(surface, r, g, b, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_GetSurfaceColorMod(@NativeType("SDL_Surface *") SDL_Surface surface, @NativeType("Uint8 *") ByteBuffer r, @NativeType("Uint8 *") ByteBuffer g, @NativeType("Uint8 *") ByteBuffer b) {
        if (Checks.CHECKS) {
            Checks.checkSafe((Buffer) r, 1);
            Checks.checkSafe((Buffer) g, 1);
            Checks.checkSafe((Buffer) b, 1);
        }
        return nSDL_GetSurfaceColorMod(surface.address(), MemoryUtil.memAddressSafe(r), MemoryUtil.memAddressSafe(g), MemoryUtil.memAddressSafe(b));
    }

    public static boolean nSDL_SetSurfaceAlphaMod(long surface, byte alpha) {
        long __functionAddress = Functions.SetSurfaceAlphaMod;
        return JNI.invokePUZ(surface, alpha, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_SetSurfaceAlphaMod(@NativeType("SDL_Surface *") SDL_Surface surface, @NativeType("Uint8") byte alpha) {
        return nSDL_SetSurfaceAlphaMod(surface.address(), alpha);
    }

    public static boolean nSDL_GetSurfaceAlphaMod(long surface, long alpha) {
        long __functionAddress = Functions.GetSurfaceAlphaMod;
        return JNI.invokePPZ(surface, alpha, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_GetSurfaceAlphaMod(@NativeType("SDL_Surface *") SDL_Surface surface, @NativeType("Uint8 *") ByteBuffer alpha) {
        if (Checks.CHECKS) {
            Checks.checkSafe((Buffer) alpha, 1);
        }
        return nSDL_GetSurfaceAlphaMod(surface.address(), MemoryUtil.memAddressSafe(alpha));
    }

    public static boolean nSDL_SetSurfaceBlendMode(long surface, int blendMode) {
        long __functionAddress = Functions.SetSurfaceBlendMode;
        return JNI.invokePZ(surface, blendMode, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_SetSurfaceBlendMode(@NativeType("SDL_Surface *") SDL_Surface surface, @NativeType("SDL_BlendMode") int blendMode) {
        return nSDL_SetSurfaceBlendMode(surface.address(), blendMode);
    }

    public static boolean nSDL_GetSurfaceBlendMode(long surface, long blendMode) {
        long __functionAddress = Functions.GetSurfaceBlendMode;
        return JNI.invokePPZ(surface, blendMode, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_GetSurfaceBlendMode(@NativeType("SDL_Surface *") SDL_Surface surface, @NativeType("SDL_BlendMode *") IntBuffer blendMode) {
        if (Checks.CHECKS) {
            Checks.checkSafe((Buffer) blendMode, 1);
        }
        return nSDL_GetSurfaceBlendMode(surface.address(), MemoryUtil.memAddressSafe(blendMode));
    }

    public static boolean nSDL_SetSurfaceClipRect(long surface, long rect) {
        long __functionAddress = Functions.SetSurfaceClipRect;
        return JNI.invokePPZ(surface, rect, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_SetSurfaceClipRect(@NativeType("SDL_Surface *") SDL_Surface surface, @NativeType("SDL_Rect const *") SDL_Rect rect) {
        return nSDL_SetSurfaceClipRect(surface.address(), rect.address());
    }

    public static boolean nSDL_GetSurfaceClipRect(long surface, long rect) {
        long __functionAddress = Functions.GetSurfaceClipRect;
        return JNI.invokePPZ(surface, rect, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_GetSurfaceClipRect(@NativeType("SDL_Surface *") SDL_Surface surface, @NativeType("SDL_Rect *") SDL_Rect rect) {
        return nSDL_GetSurfaceClipRect(surface.address(), rect.address());
    }

    public static boolean nSDL_FlipSurface(long surface, int flip) {
        long __functionAddress = Functions.FlipSurface;
        return JNI.invokePZ(surface, flip, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_FlipSurface(@NativeType("SDL_Surface *") SDL_Surface surface, @NativeType("SDL_FlipMode") int flip) {
        return nSDL_FlipSurface(surface.address(), flip);
    }

    public static long nSDL_RotateSurface(long surface, float angle) {
        long __functionAddress = Functions.RotateSurface;
        return JNI.invokePP(surface, angle, __functionAddress);
    }

    @NativeType("SDL_Surface *")
    public static SDL_Surface SDL_RotateSurface(@NativeType("SDL_Surface *") SDL_Surface surface, float angle) {
        long __result = nSDL_RotateSurface(surface.address(), angle);
        return SDL_Surface.createSafe(__result);
    }

    public static long nSDL_DuplicateSurface(long surface) {
        long __functionAddress = Functions.DuplicateSurface;
        return JNI.invokePP(surface, __functionAddress);
    }

    @NativeType("SDL_Surface *")
    public static SDL_Surface SDL_DuplicateSurface(@NativeType("SDL_Surface *") SDL_Surface surface) {
        long __result = nSDL_DuplicateSurface(surface.address());
        return SDL_Surface.createSafe(__result);
    }

    public static long nSDL_ScaleSurface(long surface, int width, int height, int scaleMode) {
        long __functionAddress = Functions.ScaleSurface;
        return JNI.invokePP(surface, width, height, scaleMode, __functionAddress);
    }

    @NativeType("SDL_Surface *")
    public static SDL_Surface SDL_ScaleSurface(@NativeType("SDL_Surface *") SDL_Surface surface, int width, int height, @NativeType("SDL_ScaleMode") int scaleMode) {
        long __result = nSDL_ScaleSurface(surface.address(), width, height, scaleMode);
        return SDL_Surface.createSafe(__result);
    }

    public static long nSDL_ConvertSurface(long surface, int format) {
        long __functionAddress = Functions.ConvertSurface;
        return JNI.invokePP(surface, format, __functionAddress);
    }

    @NativeType("SDL_Surface *")
    public static SDL_Surface SDL_ConvertSurface(@NativeType("SDL_Surface *") SDL_Surface surface, @NativeType("SDL_PixelFormat") int format) {
        long __result = nSDL_ConvertSurface(surface.address(), format);
        return SDL_Surface.createSafe(__result);
    }

    public static long nSDL_ConvertSurfaceAndColorspace(long surface, int format, long palette, int colorspace, int props) {
        long __functionAddress = Functions.ConvertSurfaceAndColorspace;
        return JNI.invokePPP(surface, format, palette, colorspace, props, __functionAddress);
    }

    @NativeType("SDL_Surface *")
    public static SDL_Surface SDL_ConvertSurfaceAndColorspace(@NativeType("SDL_Surface *") SDL_Surface surface, @NativeType("SDL_PixelFormat") int format, @NativeType("SDL_Palette *") SDL_Palette palette, @NativeType("SDL_Colorspace") int colorspace, @NativeType("SDL_PropertiesID") int props) {
        long __result = nSDL_ConvertSurfaceAndColorspace(surface.address(), format, MemoryUtil.memAddressSafe(palette), colorspace, props);
        return SDL_Surface.createSafe(__result);
    }

    public static boolean nSDL_ConvertPixels(int width, int height, int src_format, long src, int src_pitch, int dst_format, long dst, int dst_pitch) {
        long __functionAddress = Functions.ConvertPixels;
        return JNI.invokePPZ(width, height, src_format, src, src_pitch, dst_format, dst, dst_pitch, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_ConvertPixels(int width, int height, @NativeType("SDL_PixelFormat") int src_format, @NativeType("void const *") ByteBuffer src, int src_pitch, @NativeType("SDL_PixelFormat") int dst_format, @NativeType("void *") ByteBuffer dst, int dst_pitch) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) src, height * src_pitch);
            Checks.check((Buffer) dst, height * dst_pitch);
        }
        return nSDL_ConvertPixels(width, height, src_format, MemoryUtil.memAddress(src), src_pitch, dst_format, MemoryUtil.memAddress(dst), dst_pitch);
    }

    public static boolean nSDL_ConvertPixelsAndColorspace(int width, int height, int src_format, int src_colorspace, int src_properties, long src, int src_pitch, int dst_format, int dst_colorspace, int dst_properties, long dst, int dst_pitch) {
        long __functionAddress = Functions.ConvertPixelsAndColorspace;
        return JNI.invokePPZ(width, height, src_format, src_colorspace, src_properties, src, src_pitch, dst_format, dst_colorspace, dst_properties, dst, dst_pitch, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_ConvertPixelsAndColorspace(int width, int height, @NativeType("SDL_PixelFormat") int src_format, @NativeType("SDL_Colorspace") int src_colorspace, @NativeType("SDL_PropertiesID") int src_properties, @NativeType("void const *") ByteBuffer src, int src_pitch, @NativeType("SDL_PixelFormat") int dst_format, @NativeType("SDL_Colorspace") int dst_colorspace, @NativeType("SDL_PropertiesID") int dst_properties, @NativeType("void *") ByteBuffer dst, int dst_pitch) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) src, height * src_pitch);
            Checks.check((Buffer) dst, height * dst_pitch);
        }
        return nSDL_ConvertPixelsAndColorspace(width, height, src_format, src_colorspace, src_properties, MemoryUtil.memAddress(src), src_pitch, dst_format, dst_colorspace, dst_properties, MemoryUtil.memAddress(dst), dst_pitch);
    }

    public static boolean nSDL_PremultiplyAlpha(int width, int height, int src_format, long src, int src_pitch, int dst_format, long dst, int dst_pitch, boolean linear) {
        long __functionAddress = Functions.PremultiplyAlpha;
        return JNI.invokePPZ(width, height, src_format, src, src_pitch, dst_format, dst, dst_pitch, linear, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_PremultiplyAlpha(int width, int height, @NativeType("SDL_PixelFormat") int src_format, @NativeType("void const *") ByteBuffer src, int src_pitch, @NativeType("SDL_PixelFormat") int dst_format, @NativeType("void *") ByteBuffer dst, int dst_pitch, @NativeType("bool") boolean linear) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) src, height * src_pitch);
            Checks.check((Buffer) dst, height * dst_pitch);
        }
        return nSDL_PremultiplyAlpha(width, height, src_format, MemoryUtil.memAddress(src), src_pitch, dst_format, MemoryUtil.memAddress(dst), dst_pitch, linear);
    }

    public static boolean nSDL_PremultiplySurfaceAlpha(long surface, boolean linear) {
        long __functionAddress = Functions.PremultiplySurfaceAlpha;
        return JNI.invokePZ(surface, linear, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_PremultiplySurfaceAlpha(@NativeType("SDL_Surface *") SDL_Surface surface, @NativeType("bool") boolean linear) {
        return nSDL_PremultiplySurfaceAlpha(surface.address(), linear);
    }

    public static boolean nSDL_ClearSurface(long surface, float r, float g, float b, float a) {
        long __functionAddress = Functions.ClearSurface;
        return JNI.invokePZ(surface, r, g, b, a, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_ClearSurface(@NativeType("SDL_Surface *") SDL_Surface surface, float r, float g, float b, float a) {
        return nSDL_ClearSurface(surface.address(), r, g, b, a);
    }

    public static boolean nSDL_FillSurfaceRect(long dst, long rect, int color) {
        long __functionAddress = Functions.FillSurfaceRect;
        return JNI.invokePPZ(dst, rect, color, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_FillSurfaceRect(@NativeType("SDL_Surface *") SDL_Surface dst, @NativeType("SDL_Rect const *") SDL_Rect rect, @NativeType("Uint32") int color) {
        return nSDL_FillSurfaceRect(dst.address(), MemoryUtil.memAddressSafe(rect), color);
    }

    public static boolean nSDL_FillSurfaceRects(long dst, long rects, int count, int color) {
        long __functionAddress = Functions.FillSurfaceRects;
        return JNI.invokePPZ(dst, rects, count, color, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_FillSurfaceRects(@NativeType("SDL_Surface *") SDL_Surface dst, @NativeType("SDL_Rect const *") SDL_Rect.Buffer rects, @NativeType("Uint32") int color) {
        return nSDL_FillSurfaceRects(dst.address(), rects.address(), rects.remaining(), color);
    }

    public static boolean nSDL_BlitSurface(long src, long srcrect, long dst, long dstrect) {
        long __functionAddress = Functions.BlitSurface;
        return JNI.invokePPPPZ(src, srcrect, dst, dstrect, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_BlitSurface(@NativeType("SDL_Surface *") SDL_Surface src, @NativeType("SDL_Rect const *") SDL_Rect srcrect, @NativeType("SDL_Surface *") SDL_Surface dst, @NativeType("SDL_Rect const *") SDL_Rect dstrect) {
        return nSDL_BlitSurface(src.address(), MemoryUtil.memAddressSafe(srcrect), dst.address(), MemoryUtil.memAddressSafe(dstrect));
    }

    public static boolean nSDL_BlitSurfaceUnchecked(long src, long srcrect, long dst, long dstrect) {
        long __functionAddress = Functions.BlitSurfaceUnchecked;
        return JNI.invokePPPPZ(src, srcrect, dst, dstrect, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_BlitSurfaceUnchecked(@NativeType("SDL_Surface *") SDL_Surface src, @NativeType("SDL_Rect const *") SDL_Rect srcrect, @NativeType("SDL_Surface *") SDL_Surface dst, @NativeType("SDL_Rect const *") SDL_Rect dstrect) {
        return nSDL_BlitSurfaceUnchecked(src.address(), srcrect.address(), dst.address(), dstrect.address());
    }

    public static boolean nSDL_BlitSurfaceScaled(long src, long srcrect, long dst, long dstrect, int scaleMode) {
        long __functionAddress = Functions.BlitSurfaceScaled;
        return JNI.invokePPPPZ(src, srcrect, dst, dstrect, scaleMode, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_BlitSurfaceScaled(@NativeType("SDL_Surface *") SDL_Surface src, @NativeType("SDL_Rect const *") SDL_Rect srcrect, @NativeType("SDL_Surface *") SDL_Surface dst, @NativeType("SDL_Rect const *") SDL_Rect dstrect, @NativeType("SDL_ScaleMode") int scaleMode) {
        return nSDL_BlitSurfaceScaled(src.address(), MemoryUtil.memAddressSafe(srcrect), dst.address(), MemoryUtil.memAddressSafe(dstrect), scaleMode);
    }

    public static boolean nSDL_BlitSurfaceUncheckedScaled(long src, long srcrect, long dst, long dstrect, int scaleMode) {
        long __functionAddress = Functions.BlitSurfaceUncheckedScaled;
        return JNI.invokePPPPZ(src, srcrect, dst, dstrect, scaleMode, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_BlitSurfaceUncheckedScaled(@NativeType("SDL_Surface *") SDL_Surface src, @NativeType("SDL_Rect const *") SDL_Rect srcrect, @NativeType("SDL_Surface *") SDL_Surface dst, @NativeType("SDL_Rect const *") SDL_Rect dstrect, @NativeType("SDL_ScaleMode") int scaleMode) {
        return nSDL_BlitSurfaceUncheckedScaled(src.address(), srcrect.address(), dst.address(), dstrect.address(), scaleMode);
    }

    public static boolean nSDL_StretchSurface(long src, long srcrect, long dst, long dstrect, int scaleMode) {
        long __functionAddress = Functions.StretchSurface;
        return JNI.invokePPPPZ(src, srcrect, dst, dstrect, scaleMode, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_StretchSurface(@NativeType("SDL_Surface *") SDL_Surface src, @NativeType("SDL_Rect const *") SDL_Rect srcrect, @NativeType("SDL_Surface *") SDL_Surface dst, @NativeType("SDL_Rect const *") SDL_Rect dstrect, @NativeType("SDL_ScaleMode") int scaleMode) {
        return nSDL_StretchSurface(src.address(), MemoryUtil.memAddressSafe(srcrect), dst.address(), MemoryUtil.memAddressSafe(dstrect), scaleMode);
    }

    public static boolean nSDL_BlitSurfaceTiled(long src, long srcrect, long dst, long dstrect) {
        long __functionAddress = Functions.BlitSurfaceTiled;
        return JNI.invokePPPPZ(src, srcrect, dst, dstrect, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_BlitSurfaceTiled(@NativeType("SDL_Surface *") SDL_Surface src, @NativeType("SDL_Rect const *") SDL_Rect srcrect, @NativeType("SDL_Surface *") SDL_Surface dst, @NativeType("SDL_Rect const *") SDL_Rect dstrect) {
        return nSDL_BlitSurfaceTiled(src.address(), MemoryUtil.memAddressSafe(srcrect), dst.address(), MemoryUtil.memAddressSafe(dstrect));
    }

    public static boolean nSDL_BlitSurfaceTiledWithScale(long src, long srcrect, float scale, int scaleMode, long dst, long dstrect) {
        long __functionAddress = Functions.BlitSurfaceTiledWithScale;
        return JNI.invokePPPPZ(src, srcrect, scale, scaleMode, dst, dstrect, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_BlitSurfaceTiledWithScale(@NativeType("SDL_Surface *") SDL_Surface src, @NativeType("SDL_Rect const *") SDL_Rect srcrect, float scale, @NativeType("SDL_ScaleMode") int scaleMode, @NativeType("SDL_Surface *") SDL_Surface dst, @NativeType("SDL_Rect const *") SDL_Rect dstrect) {
        return nSDL_BlitSurfaceTiledWithScale(src.address(), MemoryUtil.memAddressSafe(srcrect), scale, scaleMode, dst.address(), MemoryUtil.memAddressSafe(dstrect));
    }

    public static boolean nSDL_BlitSurface9Grid(long src, long srcrect, int left_width, int right_width, int top_height, int bottom_height, float scale, int scaleMode, long dst, long dstrect) {
        long __functionAddress = Functions.BlitSurface9Grid;
        return JNI.invokePPPPZ(src, srcrect, left_width, right_width, top_height, bottom_height, scale, scaleMode, dst, dstrect, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_BlitSurface9Grid(@NativeType("SDL_Surface *") SDL_Surface src, @NativeType("SDL_Rect const *") SDL_Rect srcrect, int left_width, int right_width, int top_height, int bottom_height, float scale, @NativeType("SDL_ScaleMode") int scaleMode, @NativeType("SDL_Surface *") SDL_Surface dst, @NativeType("SDL_Rect const *") SDL_Rect dstrect) {
        return nSDL_BlitSurface9Grid(src.address(), MemoryUtil.memAddressSafe(srcrect), left_width, right_width, top_height, bottom_height, scale, scaleMode, dst.address(), MemoryUtil.memAddressSafe(dstrect));
    }

    public static int nSDL_MapSurfaceRGB(long surface, byte r, byte g, byte b) {
        long __functionAddress = Functions.MapSurfaceRGB;
        return JNI.invokePUUUI(surface, r, g, b, __functionAddress);
    }

    @NativeType("Uint32")
    public static int SDL_MapSurfaceRGB(@NativeType("SDL_Surface *") SDL_Surface surface, @NativeType("Uint8") byte r, @NativeType("Uint8") byte g, @NativeType("Uint8") byte b) {
        return nSDL_MapSurfaceRGB(surface.address(), r, g, b);
    }

    public static int nSDL_MapSurfaceRGBA(long surface, byte r, byte g, byte b, byte a) {
        long __functionAddress = Functions.MapSurfaceRGBA;
        return JNI.invokePUUUUI(surface, r, g, b, a, __functionAddress);
    }

    @NativeType("Uint32")
    public static int SDL_MapSurfaceRGBA(@NativeType("SDL_Surface *") SDL_Surface surface, @NativeType("Uint8") byte r, @NativeType("Uint8") byte g, @NativeType("Uint8") byte b, @NativeType("Uint8") byte a) {
        return nSDL_MapSurfaceRGBA(surface.address(), r, g, b, a);
    }

    public static boolean nSDL_ReadSurfacePixel(long surface, int x, int y, long r, long g, long b, long a) {
        long __functionAddress = Functions.ReadSurfacePixel;
        return JNI.invokePPPPPZ(surface, x, y, r, g, b, a, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_ReadSurfacePixel(@NativeType("SDL_Surface *") SDL_Surface surface, int x, int y, @NativeType("Uint8 *") ByteBuffer r, @NativeType("Uint8 *") ByteBuffer g, @NativeType("Uint8 *") ByteBuffer b, @NativeType("Uint8 *") ByteBuffer a) {
        if (Checks.CHECKS) {
            Checks.checkSafe((Buffer) r, 1);
            Checks.checkSafe((Buffer) g, 1);
            Checks.checkSafe((Buffer) b, 1);
            Checks.checkSafe((Buffer) a, 1);
        }
        return nSDL_ReadSurfacePixel(surface.address(), x, y, MemoryUtil.memAddressSafe(r), MemoryUtil.memAddressSafe(g), MemoryUtil.memAddressSafe(b), MemoryUtil.memAddressSafe(a));
    }

    public static boolean nSDL_ReadSurfacePixelFloat(long surface, int x, int y, long r, long g, long b, long a) {
        long __functionAddress = Functions.ReadSurfacePixelFloat;
        return JNI.invokePPPPPZ(surface, x, y, r, g, b, a, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_ReadSurfacePixelFloat(@NativeType("SDL_Surface *") SDL_Surface surface, int x, int y, @NativeType("float *") FloatBuffer r, @NativeType("float *") FloatBuffer g, @NativeType("float *") FloatBuffer b, @NativeType("float *") FloatBuffer a) {
        if (Checks.CHECKS) {
            Checks.checkSafe((Buffer) r, 1);
            Checks.checkSafe((Buffer) g, 1);
            Checks.checkSafe((Buffer) b, 1);
            Checks.checkSafe((Buffer) a, 1);
        }
        return nSDL_ReadSurfacePixelFloat(surface.address(), x, y, MemoryUtil.memAddressSafe(r), MemoryUtil.memAddressSafe(g), MemoryUtil.memAddressSafe(b), MemoryUtil.memAddressSafe(a));
    }

    public static boolean nSDL_WriteSurfacePixel(long surface, int x, int y, byte r, byte g, byte b, byte a) {
        long __functionAddress = Functions.WriteSurfacePixel;
        return JNI.invokePUUUUZ(surface, x, y, r, g, b, a, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_WriteSurfacePixel(@NativeType("SDL_Surface *") SDL_Surface surface, int x, int y, @NativeType("Uint8") byte r, @NativeType("Uint8") byte g, @NativeType("Uint8") byte b, @NativeType("Uint8") byte a) {
        return nSDL_WriteSurfacePixel(surface.address(), x, y, r, g, b, a);
    }

    public static boolean nSDL_WriteSurfacePixelFloat(long surface, int x, int y, float r, float g, float b, float a) {
        long __functionAddress = Functions.WriteSurfacePixelFloat;
        return JNI.invokePZ(surface, x, y, r, g, b, a, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_WriteSurfacePixelFloat(@NativeType("SDL_Surface *") SDL_Surface surface, int x, int y, float r, float g, float b, float a) {
        return nSDL_WriteSurfacePixelFloat(surface.address(), x, y, r, g, b, a);
    }

    @NativeType("bool")
    public static boolean SDL_MUSTLOCK(SDL_Surface S) {
        return (S.flags() & 2) == 2;
    }
}
