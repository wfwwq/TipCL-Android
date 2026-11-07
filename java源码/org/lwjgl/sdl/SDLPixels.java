package org.lwjgl.sdl;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import org.lwjgl.sdl.SDL_Color;
import org.lwjgl.system.APIUtil;
import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDLPixels.class */
public class SDLPixels {
    public static final int SDL_ALPHA_OPAQUE = 255;
    public static final int SDL_ALPHA_TRANSPARENT = 0;
    public static final float SDL_ALPHA_OPAQUE_FLOAT = 1.0f;
    public static final float SDL_ALPHA_TRANSPARENT_FLOAT = 0.0f;
    public static final int SDL_PIXELTYPE_UNKNOWN = 0;
    public static final int SDL_PIXELTYPE_INDEX1 = 1;
    public static final int SDL_PIXELTYPE_INDEX4 = 2;
    public static final int SDL_PIXELTYPE_INDEX8 = 3;
    public static final int SDL_PIXELTYPE_PACKED8 = 4;
    public static final int SDL_PIXELTYPE_PACKED16 = 5;
    public static final int SDL_PIXELTYPE_PACKED32 = 6;
    public static final int SDL_PIXELTYPE_ARRAYU8 = 7;
    public static final int SDL_PIXELTYPE_ARRAYU16 = 8;
    public static final int SDL_PIXELTYPE_ARRAYU32 = 9;
    public static final int SDL_PIXELTYPE_ARRAYF16 = 10;
    public static final int SDL_PIXELTYPE_ARRAYF32 = 11;
    public static final int SDL_PIXELTYPE_INDEX2 = 12;
    public static final int SDL_BITMAPORDER_NONE = 0;
    public static final int SDL_BITMAPORDER_4321 = 1;
    public static final int SDL_BITMAPORDER_1234 = 2;
    public static final int SDL_PACKEDORDER_NONE = 0;
    public static final int SDL_PACKEDORDER_XRGB = 1;
    public static final int SDL_PACKEDORDER_RGBX = 2;
    public static final int SDL_PACKEDORDER_ARGB = 3;
    public static final int SDL_PACKEDORDER_RGBA = 4;
    public static final int SDL_PACKEDORDER_XBGR = 5;
    public static final int SDL_PACKEDORDER_BGRX = 6;
    public static final int SDL_PACKEDORDER_ABGR = 7;
    public static final int SDL_PACKEDORDER_BGRA = 8;
    public static final int SDL_ARRAYORDER_NONE = 0;
    public static final int SDL_ARRAYORDER_RGB = 1;
    public static final int SDL_ARRAYORDER_RGBA = 2;
    public static final int SDL_ARRAYORDER_ARGB = 3;
    public static final int SDL_ARRAYORDER_BGR = 4;
    public static final int SDL_ARRAYORDER_BGRA = 5;
    public static final int SDL_ARRAYORDER_ABGR = 6;
    public static final int SDL_PACKEDLAYOUT_NONE = 0;
    public static final int SDL_PACKEDLAYOUT_332 = 1;
    public static final int SDL_PACKEDLAYOUT_4444 = 2;
    public static final int SDL_PACKEDLAYOUT_1555 = 3;
    public static final int SDL_PACKEDLAYOUT_5551 = 4;
    public static final int SDL_PACKEDLAYOUT_565 = 5;
    public static final int SDL_PACKEDLAYOUT_8888 = 6;
    public static final int SDL_PACKEDLAYOUT_2101010 = 7;
    public static final int SDL_PACKEDLAYOUT_1010102 = 8;
    public static final int SDL_PIXELFORMAT_UNKNOWN = 0;
    public static final int SDL_PIXELFORMAT_INDEX1LSB = 286261504;
    public static final int SDL_PIXELFORMAT_INDEX1MSB = 287310080;
    public static final int SDL_PIXELFORMAT_INDEX2LSB = 470811136;
    public static final int SDL_PIXELFORMAT_INDEX2MSB = 471859712;
    public static final int SDL_PIXELFORMAT_INDEX4LSB = 303039488;
    public static final int SDL_PIXELFORMAT_INDEX4MSB = 304088064;
    public static final int SDL_PIXELFORMAT_INDEX8 = 318769153;
    public static final int SDL_PIXELFORMAT_RGB332 = 336660481;
    public static final int SDL_PIXELFORMAT_XRGB4444 = 353504258;
    public static final int SDL_PIXELFORMAT_XBGR4444 = 357698562;
    public static final int SDL_PIXELFORMAT_XRGB1555 = 353570562;
    public static final int SDL_PIXELFORMAT_XBGR1555 = 357764866;
    public static final int SDL_PIXELFORMAT_ARGB4444 = 355602434;
    public static final int SDL_PIXELFORMAT_RGBA4444 = 356651010;
    public static final int SDL_PIXELFORMAT_ABGR4444 = 359796738;
    public static final int SDL_PIXELFORMAT_BGRA4444 = 360845314;
    public static final int SDL_PIXELFORMAT_ARGB1555 = 355667970;
    public static final int SDL_PIXELFORMAT_RGBA5551 = 356782082;
    public static final int SDL_PIXELFORMAT_ABGR1555 = 359862274;
    public static final int SDL_PIXELFORMAT_BGRA5551 = 360976386;
    public static final int SDL_PIXELFORMAT_RGB565 = 353701890;
    public static final int SDL_PIXELFORMAT_BGR565 = 357896194;
    public static final int SDL_PIXELFORMAT_RGB24 = 386930691;
    public static final int SDL_PIXELFORMAT_BGR24 = 390076419;
    public static final int SDL_PIXELFORMAT_XRGB8888 = 370546692;
    public static final int SDL_PIXELFORMAT_RGBX8888 = 371595268;
    public static final int SDL_PIXELFORMAT_XBGR8888 = 374740996;
    public static final int SDL_PIXELFORMAT_BGRX8888 = 375789572;
    public static final int SDL_PIXELFORMAT_ARGB8888 = 372645892;
    public static final int SDL_PIXELFORMAT_RGBA8888 = 373694468;
    public static final int SDL_PIXELFORMAT_ABGR8888 = 376840196;
    public static final int SDL_PIXELFORMAT_BGRA8888 = 377888772;
    public static final int SDL_PIXELFORMAT_XRGB2101010 = 370614276;
    public static final int SDL_PIXELFORMAT_XBGR2101010 = 374808580;
    public static final int SDL_PIXELFORMAT_ARGB2101010 = 372711428;
    public static final int SDL_PIXELFORMAT_ABGR2101010 = 376905732;
    public static final int SDL_PIXELFORMAT_RGB48 = 403714054;
    public static final int SDL_PIXELFORMAT_BGR48 = 406859782;
    public static final int SDL_PIXELFORMAT_RGBA64 = 404766728;
    public static final int SDL_PIXELFORMAT_ARGB64 = 405815304;
    public static final int SDL_PIXELFORMAT_BGRA64 = 407912456;
    public static final int SDL_PIXELFORMAT_ABGR64 = 408961032;
    public static final int SDL_PIXELFORMAT_RGB48_FLOAT = 437268486;
    public static final int SDL_PIXELFORMAT_BGR48_FLOAT = 440414214;
    public static final int SDL_PIXELFORMAT_RGBA64_FLOAT = 438321160;
    public static final int SDL_PIXELFORMAT_ARGB64_FLOAT = 439369736;
    public static final int SDL_PIXELFORMAT_BGRA64_FLOAT = 441466888;
    public static final int SDL_PIXELFORMAT_ABGR64_FLOAT = 442515464;
    public static final int SDL_PIXELFORMAT_RGB96_FLOAT = 454057996;
    public static final int SDL_PIXELFORMAT_BGR96_FLOAT = 457203724;
    public static final int SDL_PIXELFORMAT_RGBA128_FLOAT = 455114768;
    public static final int SDL_PIXELFORMAT_ARGB128_FLOAT = 456163344;
    public static final int SDL_PIXELFORMAT_BGRA128_FLOAT = 458260496;
    public static final int SDL_PIXELFORMAT_ABGR128_FLOAT = 459309072;
    public static final int SDL_PIXELFORMAT_YV12 = 842094169;
    public static final int SDL_PIXELFORMAT_IYUV = 1448433993;
    public static final int SDL_PIXELFORMAT_YUY2 = 844715353;
    public static final int SDL_PIXELFORMAT_UYVY = 1498831189;
    public static final int SDL_PIXELFORMAT_YVYU = 1431918169;
    public static final int SDL_PIXELFORMAT_NV12 = 842094158;
    public static final int SDL_PIXELFORMAT_NV21 = 825382478;
    public static final int SDL_PIXELFORMAT_P010 = 808530000;
    public static final int SDL_PIXELFORMAT_EXTERNAL_OES = 542328143;
    public static final int SDL_PIXELFORMAT_MJPG = 1196444237;
    public static final int SDL_PIXELFORMAT_RGBA32;
    public static final int SDL_PIXELFORMAT_ARGB32;
    public static final int SDL_PIXELFORMAT_BGRA32;
    public static final int SDL_PIXELFORMAT_ABGR32;
    public static final int SDL_PIXELFORMAT_RGBX32;
    public static final int SDL_PIXELFORMAT_XRGB32;
    public static final int SDL_PIXELFORMAT_BGRX32;
    public static final int SDL_PIXELFORMAT_XBGR32;
    public static final int SDL_COLOR_TYPE_UNKNOWN = 0;
    public static final int SDL_COLOR_TYPE_RGB = 1;
    public static final int SDL_COLOR_TYPE_YCBCR = 2;
    public static final int SDL_COLOR_RANGE_UNKNOWN = 0;
    public static final int SDL_COLOR_RANGE_LIMITED = 1;
    public static final int SDL_COLOR_RANGE_FULL = 2;
    public static final int SDL_COLOR_PRIMARIES_UNKNOWN = 0;
    public static final int SDL_COLOR_PRIMARIES_BT709 = 1;
    public static final int SDL_COLOR_PRIMARIES_UNSPECIFIED = 2;
    public static final int SDL_COLOR_PRIMARIES_BT470M = 4;
    public static final int SDL_COLOR_PRIMARIES_BT470BG = 5;
    public static final int SDL_COLOR_PRIMARIES_BT601 = 6;
    public static final int SDL_COLOR_PRIMARIES_SMPTE240 = 7;
    public static final int SDL_COLOR_PRIMARIES_GENERIC_FILM = 8;
    public static final int SDL_COLOR_PRIMARIES_BT2020 = 9;
    public static final int SDL_COLOR_PRIMARIES_XYZ = 10;
    public static final int SDL_COLOR_PRIMARIES_SMPTE431 = 11;
    public static final int SDL_COLOR_PRIMARIES_SMPTE432 = 12;
    public static final int SDL_COLOR_PRIMARIES_EBU3213 = 22;
    public static final int SDL_COLOR_PRIMARIES_CUSTOM = 31;
    public static final int SDL_TRANSFER_CHARACTERISTICS_UNKNOWN = 0;
    public static final int SDL_TRANSFER_CHARACTERISTICS_BT709 = 1;
    public static final int SDL_TRANSFER_CHARACTERISTICS_UNSPECIFIED = 2;
    public static final int SDL_TRANSFER_CHARACTERISTICS_GAMMA22 = 4;
    public static final int SDL_TRANSFER_CHARACTERISTICS_GAMMA28 = 5;
    public static final int SDL_TRANSFER_CHARACTERISTICS_BT601 = 6;
    public static final int SDL_TRANSFER_CHARACTERISTICS_SMPTE240 = 7;
    public static final int SDL_TRANSFER_CHARACTERISTICS_LINEAR = 8;
    public static final int SDL_TRANSFER_CHARACTERISTICS_LOG100 = 9;
    public static final int SDL_TRANSFER_CHARACTERISTICS_LOG100_SQRT10 = 10;
    public static final int SDL_TRANSFER_CHARACTERISTICS_IEC61966 = 11;
    public static final int SDL_TRANSFER_CHARACTERISTICS_BT1361 = 12;
    public static final int SDL_TRANSFER_CHARACTERISTICS_SRGB = 13;
    public static final int SDL_TRANSFER_CHARACTERISTICS_BT2020_10BIT = 14;
    public static final int SDL_TRANSFER_CHARACTERISTICS_BT2020_12BIT = 15;
    public static final int SDL_TRANSFER_CHARACTERISTICS_PQ = 16;
    public static final int SDL_TRANSFER_CHARACTERISTICS_SMPTE428 = 17;
    public static final int SDL_TRANSFER_CHARACTERISTICS_HLG = 18;
    public static final int SDL_TRANSFER_CHARACTERISTICS_CUSTOM = 31;
    public static final int SDL_MATRIX_COEFFICIENTS_IDENTITY = 0;
    public static final int SDL_MATRIX_COEFFICIENTS_BT709 = 1;
    public static final int SDL_MATRIX_COEFFICIENTS_UNSPECIFIED = 2;
    public static final int SDL_MATRIX_COEFFICIENTS_FCC = 4;
    public static final int SDL_MATRIX_COEFFICIENTS_BT470BG = 5;
    public static final int SDL_MATRIX_COEFFICIENTS_BT601 = 6;
    public static final int SDL_MATRIX_COEFFICIENTS_SMPTE240 = 7;
    public static final int SDL_MATRIX_COEFFICIENTS_YCGCO = 8;
    public static final int SDL_MATRIX_COEFFICIENTS_BT2020_NCL = 9;
    public static final int SDL_MATRIX_COEFFICIENTS_BT2020_CL = 10;
    public static final int SDL_MATRIX_COEFFICIENTS_SMPTE2085 = 11;
    public static final int SDL_MATRIX_COEFFICIENTS_CHROMA_DERIVED_NCL = 12;
    public static final int SDL_MATRIX_COEFFICIENTS_CHROMA_DERIVED_CL = 13;
    public static final int SDL_MATRIX_COEFFICIENTS_ICTCP = 14;
    public static final int SDL_MATRIX_COEFFICIENTS_CUSTOM = 31;
    public static final int SDL_CHROMA_LOCATION_NONE = 0;
    public static final int SDL_CHROMA_LOCATION_LEFT = 1;
    public static final int SDL_CHROMA_LOCATION_CENTER = 2;
    public static final int SDL_CHROMA_LOCATION_TOPLEFT = 3;
    public static final int SDL_COLORSPACE_UNKNOWN = 0;
    public static final int SDL_COLORSPACE_SRGB = 301991328;
    public static final int SDL_COLORSPACE_SRGB_LINEAR = 301991168;
    public static final int SDL_COLORSPACE_HDR10 = 301999616;
    public static final int SDL_COLORSPACE_JPEG = 570426566;
    public static final int SDL_COLORSPACE_BT601_LIMITED = 554703046;
    public static final int SDL_COLORSPACE_BT601_FULL = 571480262;
    public static final int SDL_COLORSPACE_BT709_LIMITED = 554697761;
    public static final int SDL_COLORSPACE_BT709_FULL = 571474977;
    public static final int SDL_COLORSPACE_BT2020_LIMITED = 554706441;
    public static final int SDL_COLORSPACE_BT2020_FULL = 571483657;
    public static final int SDL_COLORSPACE_RGB_DEFAULT = 301991328;
    public static final int SDL_COLORSPACE_YUV_DEFAULT = 554703046;

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDLPixels$Functions.class */
    public static final class Functions {
        public static final long GetPixelFormatName = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetPixelFormatName");
        public static final long GetMasksForPixelFormat = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetMasksForPixelFormat");
        public static final long GetPixelFormatForMasks = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetPixelFormatForMasks");
        public static final long GetPixelFormatDetails = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetPixelFormatDetails");
        public static final long CreatePalette = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_CreatePalette");
        public static final long SetPaletteColors = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_SetPaletteColors");
        public static final long DestroyPalette = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_DestroyPalette");
        public static final long MapRGB = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_MapRGB");
        public static final long MapRGBA = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_MapRGBA");
        public static final long GetRGB = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetRGB");
        public static final long GetRGBA = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetRGBA");

        private Functions() {
        }
    }

    static {
        SDL_PIXELFORMAT_RGBA32 = ByteOrder.nativeOrder() == ByteOrder.LITTLE_ENDIAN ? SDL_PIXELFORMAT_ABGR8888 : SDL_PIXELFORMAT_RGBA8888;
        SDL_PIXELFORMAT_ARGB32 = ByteOrder.nativeOrder() == ByteOrder.LITTLE_ENDIAN ? SDL_PIXELFORMAT_BGRA8888 : SDL_PIXELFORMAT_ARGB8888;
        SDL_PIXELFORMAT_BGRA32 = ByteOrder.nativeOrder() == ByteOrder.LITTLE_ENDIAN ? SDL_PIXELFORMAT_ARGB8888 : SDL_PIXELFORMAT_BGRA8888;
        SDL_PIXELFORMAT_ABGR32 = ByteOrder.nativeOrder() == ByteOrder.LITTLE_ENDIAN ? SDL_PIXELFORMAT_RGBA8888 : SDL_PIXELFORMAT_ABGR8888;
        SDL_PIXELFORMAT_RGBX32 = ByteOrder.nativeOrder() == ByteOrder.LITTLE_ENDIAN ? SDL_PIXELFORMAT_XBGR8888 : SDL_PIXELFORMAT_RGBX8888;
        SDL_PIXELFORMAT_XRGB32 = ByteOrder.nativeOrder() == ByteOrder.LITTLE_ENDIAN ? SDL_PIXELFORMAT_BGRX8888 : SDL_PIXELFORMAT_XRGB8888;
        SDL_PIXELFORMAT_BGRX32 = ByteOrder.nativeOrder() == ByteOrder.LITTLE_ENDIAN ? SDL_PIXELFORMAT_XRGB8888 : SDL_PIXELFORMAT_BGRX8888;
        SDL_PIXELFORMAT_XBGR32 = ByteOrder.nativeOrder() == ByteOrder.LITTLE_ENDIAN ? SDL_PIXELFORMAT_RGBX8888 : SDL_PIXELFORMAT_XBGR8888;
    }

    protected SDLPixels() {
        throw new UnsupportedOperationException();
    }

    public static long nSDL_GetPixelFormatName(int format) {
        long __functionAddress = Functions.GetPixelFormatName;
        return JNI.invokeP(format, __functionAddress);
    }

    @NativeType("char const *")
    public static String SDL_GetPixelFormatName(@NativeType("SDL_PixelFormat") int format) {
        long __result = nSDL_GetPixelFormatName(format);
        return MemoryUtil.memASCIISafe(__result);
    }

    public static boolean nSDL_GetMasksForPixelFormat(int format, long bpp, long Rmask, long Gmask, long Bmask, long Amask) {
        long __functionAddress = Functions.GetMasksForPixelFormat;
        return JNI.invokePPPPPZ(format, bpp, Rmask, Gmask, Bmask, Amask, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_GetMasksForPixelFormat(@NativeType("SDL_PixelFormat") int format, @NativeType("int *") IntBuffer bpp, @NativeType("Uint32 *") IntBuffer Rmask, @NativeType("Uint32 *") IntBuffer Gmask, @NativeType("Uint32 *") IntBuffer Bmask, @NativeType("Uint32 *") IntBuffer Amask) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) bpp, 1);
            Checks.check((Buffer) Rmask, 1);
            Checks.check((Buffer) Gmask, 1);
            Checks.check((Buffer) Bmask, 1);
            Checks.check((Buffer) Amask, 1);
        }
        return nSDL_GetMasksForPixelFormat(format, MemoryUtil.memAddress(bpp), MemoryUtil.memAddress(Rmask), MemoryUtil.memAddress(Gmask), MemoryUtil.memAddress(Bmask), MemoryUtil.memAddress(Amask));
    }

    @NativeType("SDL_PixelFormat")
    public static int SDL_GetPixelFormatForMasks(int bpp, @NativeType("Uint32") int Rmask, @NativeType("Uint32") int Gmask, @NativeType("Uint32") int Bmask, @NativeType("Uint32") int Amask) {
        long __functionAddress = Functions.GetPixelFormatForMasks;
        return JNI.invokeI(bpp, Rmask, Gmask, Bmask, Amask, __functionAddress);
    }

    public static long nSDL_GetPixelFormatDetails(int format) {
        long __functionAddress = Functions.GetPixelFormatDetails;
        return JNI.invokeP(format, __functionAddress);
    }

    @NativeType("SDL_PixelFormatDetails const *")
    public static SDL_PixelFormatDetails SDL_GetPixelFormatDetails(@NativeType("SDL_PixelFormat") int format) {
        long __result = nSDL_GetPixelFormatDetails(format);
        return SDL_PixelFormatDetails.createSafe(__result);
    }

    public static long nSDL_CreatePalette(int ncolors) {
        long __functionAddress = Functions.CreatePalette;
        return JNI.invokeP(ncolors, __functionAddress);
    }

    @NativeType("SDL_Palette *")
    public static SDL_Palette SDL_CreatePalette(int ncolors) {
        long __result = nSDL_CreatePalette(ncolors);
        return SDL_Palette.createSafe(__result);
    }

    public static boolean nSDL_SetPaletteColors(long palette, long colors, int firstcolor, int ncolors) {
        long __functionAddress = Functions.SetPaletteColors;
        return JNI.invokePPZ(palette, colors, firstcolor, ncolors, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_SetPaletteColors(@NativeType("SDL_Palette *") SDL_Palette palette, @NativeType("SDL_Color const *") SDL_Color.Buffer colors, int firstcolor) {
        return nSDL_SetPaletteColors(palette.address(), colors.address(), firstcolor, colors.remaining());
    }

    public static void nSDL_DestroyPalette(long palette) {
        long __functionAddress = Functions.DestroyPalette;
        JNI.invokePV(palette, __functionAddress);
    }

    public static void SDL_DestroyPalette(@NativeType("SDL_Palette *") SDL_Palette palette) {
        nSDL_DestroyPalette(palette.address());
    }

    public static int nSDL_MapRGB(long format, long palette, byte r, byte g, byte b) {
        long __functionAddress = Functions.MapRGB;
        return JNI.invokePPUUUI(format, palette, r, g, b, __functionAddress);
    }

    @NativeType("Uint32")
    public static int SDL_MapRGB(@NativeType("SDL_PixelFormatDetails const *") SDL_PixelFormatDetails format, @NativeType("SDL_Palette const *") SDL_Palette palette, @NativeType("Uint8") byte r, @NativeType("Uint8") byte g, @NativeType("Uint8") byte b) {
        return nSDL_MapRGB(format.address(), MemoryUtil.memAddressSafe(palette), r, g, b);
    }

    public static int nSDL_MapRGBA(long format, long palette, byte r, byte g, byte b, byte a) {
        long __functionAddress = Functions.MapRGBA;
        return JNI.invokePPUUUUI(format, palette, r, g, b, a, __functionAddress);
    }

    @NativeType("Uint32")
    public static int SDL_MapRGBA(@NativeType("SDL_PixelFormatDetails const *") SDL_PixelFormatDetails format, @NativeType("SDL_Palette const *") SDL_Palette palette, @NativeType("Uint8") byte r, @NativeType("Uint8") byte g, @NativeType("Uint8") byte b, @NativeType("Uint8") byte a) {
        return nSDL_MapRGBA(format.address(), MemoryUtil.memAddressSafe(palette), r, g, b, a);
    }

    public static void nSDL_GetRGB(int pixel, long format, long palette, long r, long g, long b) {
        long __functionAddress = Functions.GetRGB;
        JNI.invokePPPPPV(pixel, format, palette, r, g, b, __functionAddress);
    }

    public static void SDL_GetRGB(@NativeType("Uint32") int pixel, @NativeType("SDL_PixelFormatDetails const *") SDL_PixelFormatDetails format, @NativeType("SDL_Palette const *") SDL_Palette palette, @NativeType("Uint8 *") ByteBuffer r, @NativeType("Uint8 *") ByteBuffer g, @NativeType("Uint8 *") ByteBuffer b) {
        if (Checks.CHECKS) {
            Checks.checkSafe((Buffer) r, 1);
            Checks.checkSafe((Buffer) g, 1);
            Checks.checkSafe((Buffer) b, 1);
        }
        nSDL_GetRGB(pixel, format.address(), MemoryUtil.memAddressSafe(palette), MemoryUtil.memAddressSafe(r), MemoryUtil.memAddressSafe(g), MemoryUtil.memAddressSafe(b));
    }

    public static void nSDL_GetRGBA(int pixel, long format, long palette, long r, long g, long b, long a) {
        long __functionAddress = Functions.GetRGBA;
        JNI.invokePPPPPPV(pixel, format, palette, r, g, b, a, __functionAddress);
    }

    public static void SDL_GetRGBA(@NativeType("Uint32") int pixel, @NativeType("SDL_PixelFormatDetails const *") SDL_PixelFormatDetails format, @NativeType("SDL_Palette const *") SDL_Palette palette, @NativeType("Uint8 *") ByteBuffer r, @NativeType("Uint8 *") ByteBuffer g, @NativeType("Uint8 *") ByteBuffer b, @NativeType("Uint8 *") ByteBuffer a) {
        if (Checks.CHECKS) {
            Checks.checkSafe((Buffer) r, 1);
            Checks.checkSafe((Buffer) g, 1);
            Checks.checkSafe((Buffer) b, 1);
            Checks.checkSafe((Buffer) a, 1);
        }
        nSDL_GetRGBA(pixel, format.address(), MemoryUtil.memAddressSafe(palette), MemoryUtil.memAddressSafe(r), MemoryUtil.memAddressSafe(g), MemoryUtil.memAddressSafe(b), MemoryUtil.memAddressSafe(a));
    }

    @NativeType("uint32_t")
    public static int SDL_DEFINE_PIXELFOURCC(@NativeType("uint8_t") byte A, @NativeType("uint8_t") byte B, @NativeType("uint8_t") byte C, @NativeType("uint8_t") byte D) {
        return SDLStdinc.SDL_FOURCC(A, B, C, D);
    }

    @NativeType("SDL_PixelFormat")
    public static int SDL_DEFINE_PIXELFORMAT(@NativeType("SDL_PixelType") int type, @NativeType("SDL_BitmapOrder") int order, @NativeType("SDL_PackedLayout") int layout, @NativeType("uint32_t") int bits, @NativeType("uint32_t") int bytes) {
        return 268435456 | (type << 24) | (order << 20) | (layout << 16) | ((bits & 255) << 8) | ((bytes & 255) << 0);
    }

    @NativeType("uint32_t")
    public static int SDL_PIXELFLAG(@NativeType("SDL_PixelFormat") int format) {
        return (format >> 28) & 15;
    }

    @NativeType("SDL_PixelType")
    public static int SDL_PIXELTYPE(@NativeType("SDL_PixelFormat") int format) {
        return (format >> 24) & 15;
    }

    @NativeType("SDL_BitmapOrder")
    public static int SDL_PIXELORDER(@NativeType("SDL_PixelFormat") int format) {
        return (format >> 20) & 15;
    }

    @NativeType("SDL_PackedLayout")
    public static int SDL_PIXELLAYOUT(@NativeType("SDL_PixelFormat") int format) {
        return (format >> 16) & 15;
    }

    @NativeType("uint32_t")
    public static int SDL_BITSPERPIXEL(@NativeType("SDL_PixelFormat") int format) {
        if (SDL_ISPIXELFORMAT_FOURCC(format)) {
            return 0;
        }
        return (format >> 8) & 255;
    }

    @NativeType("uint32_t")
    public static int SDL_BYTESPERPIXEL(@NativeType("SDL_PixelFormat") int format) {
        if (SDL_ISPIXELFORMAT_FOURCC(format)) {
            return (format == 844715353 || format == 1498831189 || format == 1431918169 || format == 808530000) ? 2 : 1;
        }
        return (format >> 0) & 255;
    }

    @NativeType("bool")
    public static boolean SDL_ISPIXELFORMAT_INDEXED(@NativeType("SDL_PixelFormat") int format) {
        return !SDL_ISPIXELFORMAT_FOURCC(format) && (SDL_PIXELTYPE(format) == 1 || SDL_PIXELTYPE(format) == 12 || SDL_PIXELTYPE(format) == 2 || SDL_PIXELTYPE(format) == 3);
    }

    @NativeType("bool")
    public static boolean SDL_ISPIXELFORMAT_PACKED(@NativeType("SDL_PixelFormat") int format) {
        return !SDL_ISPIXELFORMAT_FOURCC(format) && (SDL_PIXELTYPE(format) == 4 || SDL_PIXELTYPE(format) == 5 || SDL_PIXELTYPE(format) == 6);
    }

    @NativeType("bool")
    public static boolean SDL_ISPIXELFORMAT_ARRAY(@NativeType("SDL_PixelFormat") int format) {
        return !SDL_ISPIXELFORMAT_FOURCC(format) && (SDL_PIXELTYPE(format) == 7 || SDL_PIXELTYPE(format) == 8 || SDL_PIXELTYPE(format) == 9 || SDL_PIXELTYPE(format) == 10 || SDL_PIXELTYPE(format) == 11);
    }

    @NativeType("bool")
    public static boolean SDL_ISPIXELFORMAT_10BIT(@NativeType("SDL_PixelFormat") int format) {
        return !SDL_ISPIXELFORMAT_FOURCC(format) && SDL_PIXELTYPE(format) == 6 && SDL_PIXELLAYOUT(format) == 7;
    }

    @NativeType("bool")
    public static boolean SDL_ISPIXELFORMAT_FLOAT(@NativeType("SDL_PixelFormat") int format) {
        return !SDL_ISPIXELFORMAT_FOURCC(format) && (SDL_PIXELTYPE(format) == 10 || SDL_PIXELTYPE(format) == 11);
    }

    @NativeType("bool")
    public static boolean SDL_ISPIXELFORMAT_ALPHA(@NativeType("SDL_PixelFormat") int format) {
        return (SDL_ISPIXELFORMAT_PACKED(format) && (SDL_PIXELORDER(format) == 3 || SDL_PIXELORDER(format) == 4 || SDL_PIXELORDER(format) == 7 || SDL_PIXELORDER(format) == 8)) || (SDL_ISPIXELFORMAT_ARRAY(format) && (SDL_PIXELORDER(format) == 3 || SDL_PIXELORDER(format) == 2 || SDL_PIXELORDER(format) == 6 || SDL_PIXELORDER(format) == 5));
    }

    @NativeType("bool")
    public static boolean SDL_ISPIXELFORMAT_FOURCC(@NativeType("SDL_PixelFormat") int format) {
        return (format == 0 || SDL_PIXELFLAG(format) == 1) ? false : true;
    }

    @NativeType("SDL_Colorspace")
    public static int SDL_DEFINE_COLORSPACE(@NativeType("SDL_ColorType") int type, @NativeType("SDL_ColorRange") int range, @NativeType("SDL_ColorPrimaries") int primaries, @NativeType("SDL_TransferCharacteristics") int transfer, @NativeType("SDL_MatrixCoefficients") int matrix, @NativeType("SDL_ChromaLocation") int chroma) {
        return (type << 28) | (range << 24) | (chroma << 20) | (primaries << 10) | (transfer << 5) | (matrix << 0);
    }

    @NativeType("SDL_ColorType")
    public static int SDL_COLORSPACETYPE(@NativeType("SDL_Colorspace") int cspace) {
        return (cspace >> 28) & 15;
    }

    @NativeType("SDL_ColorRange")
    public static int SDL_COLORSPACERANGE(@NativeType("SDL_Colorspace") int cspace) {
        return (cspace >> 24) & 15;
    }

    @NativeType("SDL_ChromaLocation")
    public static int SDL_COLORSPACECHROMA(@NativeType("SDL_Colorspace") int cspace) {
        return (cspace >> 20) & 15;
    }

    @NativeType("SDL_ColorPrimaries")
    public static int SDL_COLORSPACEPRIMARIES(@NativeType("SDL_Colorspace") int cspace) {
        return (cspace >> 10) & 31;
    }

    @NativeType("SDL_TransferCharacteristics")
    public static int SDL_COLORSPACETRANSFER(@NativeType("SDL_Colorspace") int cspace) {
        return (cspace >> 5) & 31;
    }

    @NativeType("SDL_MatrixCoefficients")
    public static int SDL_COLORSPACEMATRIX(@NativeType("SDL_Colorspace") int cspace) {
        return cspace & 31;
    }

    @NativeType("bool")
    public static boolean SDL_ISCOLORSPACE_MATRIX_BT601(@NativeType("SDL_Colorspace") int cspace) {
        return SDL_COLORSPACEMATRIX(cspace) == 6 || SDL_COLORSPACEMATRIX(cspace) == 5;
    }

    @NativeType("bool")
    public static boolean SDL_ISCOLORSPACE_MATRIX_BT709(@NativeType("SDL_Colorspace") int cspace) {
        return SDL_COLORSPACEMATRIX(cspace) == 1;
    }

    @NativeType("bool")
    public static boolean SDL_ISCOLORSPACE_MATRIX_BT2020_NCL(@NativeType("SDL_Colorspace") int cspace) {
        return SDL_COLORSPACEMATRIX(cspace) == 9;
    }

    @NativeType("bool")
    public static boolean SDL_ISCOLORSPACE_LIMITED_RANGE(@NativeType("SDL_Colorspace") int cspace) {
        return SDL_COLORSPACERANGE(cspace) != 2;
    }

    @NativeType("bool")
    public static boolean SDL_ISCOLORSPACE_FULL_RANGE(@NativeType("SDL_Colorspace") int cspace) {
        return SDL_COLORSPACERANGE(cspace) == 2;
    }
}
