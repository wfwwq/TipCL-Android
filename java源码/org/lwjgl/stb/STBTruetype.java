package org.lwjgl.stb;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import org.lwjgl.PointerBuffer;
import org.lwjgl.stb.STBRPRect;
import org.lwjgl.stb.STBTTBakedChar;
import org.lwjgl.stb.STBTTKerningentry;
import org.lwjgl.stb.STBTTPackRange;
import org.lwjgl.stb.STBTTPackedchar;
import org.lwjgl.stb.STBTTVertex;
import org.lwjgl.system.Checks;
import org.lwjgl.system.CustomBuffer;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-stb.jar:org/lwjgl/stb/STBTruetype.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-stb.jar:org/lwjgl/stb/STBTruetype.class */
public class STBTruetype {
    public static final byte STBTT_vmove = 1;
    public static final byte STBTT_vline = 2;
    public static final byte STBTT_vcurve = 3;
    public static final byte STBTT_vcubic = 4;
    public static final int STBTT_MACSTYLE_DONTCARE = 0;
    public static final int STBTT_MACSTYLE_BOLD = 1;
    public static final int STBTT_MACSTYLE_ITALIC = 2;
    public static final int STBTT_MACSTYLE_UNDERSCORE = 4;
    public static final int STBTT_MACSTYLE_NONE = 8;
    public static final int STBTT_PLATFORM_ID_UNICODE = 0;
    public static final int STBTT_PLATFORM_ID_MAC = 1;
    public static final int STBTT_PLATFORM_ID_ISO = 2;
    public static final int STBTT_PLATFORM_ID_MICROSOFT = 3;
    public static final int STBTT_UNICODE_EID_UNICODE_1_0 = 0;
    public static final int STBTT_UNICODE_EID_UNICODE_1_1 = 1;
    public static final int STBTT_UNICODE_EID_ISO_10646 = 2;
    public static final int STBTT_UNICODE_EID_UNICODE_2_0_BMP = 3;
    public static final int STBTT_UNICODE_EID_UNICODE_2_0_FULL = 4;
    public static final int STBTT_MS_EID_SYMBOL = 0;
    public static final int STBTT_MS_EID_UNICODE_BMP = 1;
    public static final int STBTT_MS_EID_SHIFTJIS = 2;
    public static final int STBTT_MS_EID_UNICODE_FULL = 10;
    public static final int STBTT_MAC_EID_ROMAN = 0;
    public static final int STBTT_MAC_EID_JAPANESE = 1;
    public static final int STBTT_MAC_EID_CHINESE_TRAD = 2;
    public static final int STBTT_MAC_EID_KOREAN = 3;
    public static final int STBTT_MAC_EID_ARABIC = 4;
    public static final int STBTT_MAC_EID_HEBREW = 5;
    public static final int STBTT_MAC_EID_GREEK = 6;
    public static final int STBTT_MAC_EID_RUSSIAN = 7;
    public static final int STBTT_MS_LANG_ENGLISH = 1033;
    public static final int STBTT_MS_LANG_CHINESE = 2052;
    public static final int STBTT_MS_LANG_DUTCH = 1043;
    public static final int STBTT_MS_LANG_FRENCH = 1036;
    public static final int STBTT_MS_LANG_GERMAN = 1031;
    public static final int STBTT_MS_LANG_HEBREW = 1037;
    public static final int STBTT_MS_LANG_ITALIAN = 1040;
    public static final int STBTT_MS_LANG_JAPANESE = 1041;
    public static final int STBTT_MS_LANG_KOREAN = 1042;
    public static final int STBTT_MS_LANG_RUSSIAN = 1049;
    public static final int STBTT_MS_LANG_SPANISH = 1033;
    public static final int STBTT_MS_LANG_SWEDISH = 1053;
    public static final int STBTT_MAC_LANG_ENGLISH = 0;
    public static final int STBTT_MAC_LANG_ARABIC = 12;
    public static final int STBTT_MAC_LANG_DUTCH = 4;
    public static final int STBTT_MAC_LANG_FRENCH = 1;
    public static final int STBTT_MAC_LANG_GERMAN = 2;
    public static final int STBTT_MAC_LANG_HEBREW = 10;
    public static final int STBTT_MAC_LANG_ITALIAN = 3;
    public static final int STBTT_MAC_LANG_JAPANESE = 11;
    public static final int STBTT_MAC_LANG_KOREAN = 23;
    public static final int STBTT_MAC_LANG_RUSSIAN = 32;
    public static final int STBTT_MAC_LANG_SPANISH = 6;
    public static final int STBTT_MAC_LANG_SWEDISH = 5;
    public static final int STBTT_MAC_LANG_CHINESE_SIMPLIFIED = 33;
    public static final int STBTT_MAC_LANG_CHINESE_TRAD = 19;

    public static native int nstbtt_BakeFontBitmap(long j, int i, float f, long j2, int i2, int i3, int i4, int i5, long j3);

    public static native void nstbtt_GetBakedQuad(long j, int i, int i2, int i3, long j2, long j3, long j4, int i4);

    public static native void nstbtt_GetScaledFontVMetrics(long j, int i, float f, long j2, long j3, long j4);

    public static native int nstbtt_PackBegin(long j, long j2, int i, int i2, int i3, int i4, long j3);

    public static native void nstbtt_PackEnd(long j);

    public static native int nstbtt_PackFontRange(long j, long j2, int i, float f, int i2, int i3, long j3);

    public static native int nstbtt_PackFontRanges(long j, long j2, int i, long j3, int i2);

    public static native void nstbtt_PackSetOversampling(long j, int i, int i2);

    public static native void nstbtt_PackSetSkipMissingCodepoints(long j, int i);

    public static native void nstbtt_GetPackedQuad(long j, int i, int i2, int i3, long j2, long j3, long j4, int i4);

    public static native int nstbtt_PackFontRangesGatherRects(long j, long j2, long j3, int i, long j4);

    public static native void nstbtt_PackFontRangesPackRects(long j, long j2, int i);

    public static native int nstbtt_PackFontRangesRenderIntoRects(long j, long j2, long j3, int i, long j4);

    public static native int nstbtt_GetNumberOfFonts(long j);

    public static native int nstbtt_GetFontOffsetForIndex(long j, int i);

    public static native int nstbtt_InitFont(long j, long j2, int i);

    public static native int nstbtt_FindGlyphIndex(long j, int i);

    public static native float nstbtt_ScaleForPixelHeight(long j, float f);

    public static native float nstbtt_ScaleForMappingEmToPixels(long j, float f);

    public static native void nstbtt_GetFontVMetrics(long j, long j2, long j3, long j4);

    public static native int nstbtt_GetFontVMetricsOS2(long j, long j2, long j3, long j4);

    public static native void nstbtt_GetFontBoundingBox(long j, long j2, long j3, long j4, long j5);

    public static native void nstbtt_GetCodepointHMetrics(long j, int i, long j2, long j3);

    public static native int nstbtt_GetCodepointKernAdvance(long j, int i, int i2);

    public static native int nstbtt_GetCodepointBox(long j, int i, long j2, long j3, long j4, long j5);

    public static native void nstbtt_GetGlyphHMetrics(long j, int i, long j2, long j3);

    public static native int nstbtt_GetGlyphKernAdvance(long j, int i, int i2);

    public static native int nstbtt_GetGlyphBox(long j, int i, long j2, long j3, long j4, long j5);

    public static native int nstbtt_GetKerningTableLength(long j);

    public static native int nstbtt_GetKerningTable(long j, long j2, int i);

    public static native int nstbtt_IsGlyphEmpty(long j, int i);

    public static native int nstbtt_GetCodepointShape(long j, int i, long j2);

    public static native int nstbtt_GetGlyphShape(long j, int i, long j2);

    public static native void nstbtt_FreeShape(long j, long j2);

    public static native long nstbtt_FindSVGDoc(long j, int i);

    public static native int nstbtt_GetCodepointSVG(long j, int i, long j2);

    public static native int nstbtt_GetGlyphSVG(long j, int i, long j2);

    public static native void nstbtt_FreeBitmap(long j, long j2);

    public static native long nstbtt_GetCodepointBitmap(long j, float f, float f2, int i, long j2, long j3, long j4, long j5);

    public static native long nstbtt_GetCodepointBitmapSubpixel(long j, float f, float f2, float f3, float f4, int i, long j2, long j3, long j4, long j5);

    public static native void nstbtt_MakeCodepointBitmap(long j, long j2, int i, int i2, int i3, float f, float f2, int i4);

    public static native void nstbtt_MakeCodepointBitmapSubpixel(long j, long j2, int i, int i2, int i3, float f, float f2, float f3, float f4, int i4);

    public static native void nstbtt_MakeCodepointBitmapSubpixelPrefilter(long j, long j2, int i, int i2, int i3, float f, float f2, float f3, float f4, int i4, int i5, long j3, long j4, int i6);

    public static native void nstbtt_GetCodepointBitmapBox(long j, int i, float f, float f2, long j2, long j3, long j4, long j5);

    public static native void nstbtt_GetCodepointBitmapBoxSubpixel(long j, int i, float f, float f2, float f3, float f4, long j2, long j3, long j4, long j5);

    public static native long nstbtt_GetGlyphBitmap(long j, float f, float f2, int i, long j2, long j3, long j4, long j5);

    public static native long nstbtt_GetGlyphBitmapSubpixel(long j, float f, float f2, float f3, float f4, int i, long j2, long j3, long j4, long j5);

    public static native void nstbtt_MakeGlyphBitmap(long j, long j2, int i, int i2, int i3, float f, float f2, int i4);

    public static native void nstbtt_MakeGlyphBitmapSubpixel(long j, long j2, int i, int i2, int i3, float f, float f2, float f3, float f4, int i4);

    public static native void nstbtt_MakeGlyphBitmapSubpixelPrefilter(long j, long j2, int i, int i2, int i3, float f, float f2, float f3, float f4, int i4, int i5, long j3, long j4, int i6);

    public static native void nstbtt_GetGlyphBitmapBox(long j, int i, float f, float f2, long j2, long j3, long j4, long j5);

    public static native void nstbtt_GetGlyphBitmapBoxSubpixel(long j, int i, float f, float f2, float f3, float f4, long j2, long j3, long j4, long j5);

    public static native void nstbtt_Rasterize(long j, float f, long j2, int i, float f2, float f3, float f4, float f5, int i2, int i3, int i4, long j3);

    public static native void nstbtt_FreeSDF(long j, long j2);

    public static native long nstbtt_GetGlyphSDF(long j, float f, int i, int i2, byte b, float f2, long j2, long j3, long j4, long j5);

    public static native long nstbtt_GetCodepointSDF(long j, float f, int i, int i2, byte b, float f2, long j2, long j3, long j4, long j5);

    public static native int nstbtt_FindMatchingFont(long j, long j2, int i);

    public static native int nstbtt_CompareUTF8toUTF16_bigendian(long j, int i, long j2, int i2);

    public static native long nstbtt_GetFontNameString(long j, long j2, int i, int i2, int i3, int i4);

    public static native void nstbtt_GetBakedQuad(long j, int i, int i2, int i3, float[] fArr, float[] fArr2, long j2, int i4);

    public static native void nstbtt_GetScaledFontVMetrics(long j, int i, float f, float[] fArr, float[] fArr2, float[] fArr3);

    public static native void nstbtt_GetPackedQuad(long j, int i, int i2, int i3, float[] fArr, float[] fArr2, long j2, int i4);

    public static native void nstbtt_GetFontVMetrics(long j, int[] iArr, int[] iArr2, int[] iArr3);

    public static native int nstbtt_GetFontVMetricsOS2(long j, int[] iArr, int[] iArr2, int[] iArr3);

    public static native void nstbtt_GetFontBoundingBox(long j, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4);

    public static native void nstbtt_GetCodepointHMetrics(long j, int i, int[] iArr, int[] iArr2);

    public static native int nstbtt_GetCodepointBox(long j, int i, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4);

    public static native void nstbtt_GetGlyphHMetrics(long j, int i, int[] iArr, int[] iArr2);

    public static native int nstbtt_GetGlyphBox(long j, int i, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4);

    public static native long nstbtt_GetCodepointBitmap(long j, float f, float f2, int i, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4);

    public static native long nstbtt_GetCodepointBitmapSubpixel(long j, float f, float f2, float f3, float f4, int i, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4);

    public static native void nstbtt_MakeCodepointBitmapSubpixelPrefilter(long j, long j2, int i, int i2, int i3, float f, float f2, float f3, float f4, int i4, int i5, float[] fArr, float[] fArr2, int i6);

    public static native void nstbtt_GetCodepointBitmapBox(long j, int i, float f, float f2, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4);

    public static native void nstbtt_GetCodepointBitmapBoxSubpixel(long j, int i, float f, float f2, float f3, float f4, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4);

    public static native long nstbtt_GetGlyphBitmap(long j, float f, float f2, int i, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4);

    public static native long nstbtt_GetGlyphBitmapSubpixel(long j, float f, float f2, float f3, float f4, int i, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4);

    public static native void nstbtt_MakeGlyphBitmapSubpixelPrefilter(long j, long j2, int i, int i2, int i3, float f, float f2, float f3, float f4, int i4, int i5, float[] fArr, float[] fArr2, int i6);

    public static native void nstbtt_GetGlyphBitmapBox(long j, int i, float f, float f2, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4);

    public static native void nstbtt_GetGlyphBitmapBoxSubpixel(long j, int i, float f, float f2, float f3, float f4, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4);

    public static native long nstbtt_GetGlyphSDF(long j, float f, int i, int i2, byte b, float f2, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4);

    public static native long nstbtt_GetCodepointSDF(long j, float f, int i, int i2, byte b, float f2, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4);

    static {
        LibSTB.initialize();
    }

    protected STBTruetype() {
        throw new UnsupportedOperationException();
    }

    public static int stbtt_BakeFontBitmap(@NativeType("unsigned char const *") ByteBuffer data, float pixel_height, @NativeType("unsigned char *") ByteBuffer pixels, int pw, int ph, int first_char, @NativeType("stbtt_bakedchar *") STBTTBakedChar.Buffer chardata) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) pixels, pw * ph);
        }
        return nstbtt_BakeFontBitmap(MemoryUtil.memAddress(data), 0, pixel_height, MemoryUtil.memAddress(pixels), pw, ph, first_char, chardata.remaining(), chardata.address());
    }

    public static void stbtt_GetBakedQuad(@NativeType("stbtt_bakedchar const *") STBTTBakedChar.Buffer chardata, int pw, int ph, int char_index, @NativeType("float *") FloatBuffer xpos, @NativeType("float *") FloatBuffer ypos, @NativeType("stbtt_aligned_quad *") STBTTAlignedQuad q, @NativeType("int") boolean opengl_fillrule) {
        if (Checks.CHECKS) {
            Checks.check((CustomBuffer<?>) chardata, char_index + 1);
            Checks.check((Buffer) xpos, 1);
            Checks.check((Buffer) ypos, 1);
        }
        nstbtt_GetBakedQuad(chardata.address(), pw, ph, char_index, MemoryUtil.memAddress(xpos), MemoryUtil.memAddress(ypos), q.address(), opengl_fillrule ? 1 : 0);
    }

    public static void stbtt_GetScaledFontVMetrics(@NativeType("unsigned char const *") ByteBuffer fontdata, int index, float size, @NativeType("float *") FloatBuffer ascent, @NativeType("float *") FloatBuffer descent, @NativeType("float *") FloatBuffer lineGap) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) ascent, 1);
            Checks.check((Buffer) descent, 1);
            Checks.check((Buffer) lineGap, 1);
        }
        nstbtt_GetScaledFontVMetrics(MemoryUtil.memAddress(fontdata), index, size, MemoryUtil.memAddress(ascent), MemoryUtil.memAddress(descent), MemoryUtil.memAddress(lineGap));
    }

    @NativeType("int")
    public static boolean stbtt_PackBegin(@NativeType("stbtt_pack_context *") STBTTPackContext spc, @NativeType("unsigned char *") ByteBuffer pixels, int width, int height, int stride_in_bytes, int padding, @NativeType("void *") long alloc_context) {
        if (Checks.CHECKS) {
            Checks.checkSafe((Buffer) pixels, (stride_in_bytes != 0 ? stride_in_bytes : width) * height);
        }
        return nstbtt_PackBegin(spc.address(), MemoryUtil.memAddressSafe(pixels), width, height, stride_in_bytes, padding, alloc_context) != 0;
    }

    @NativeType("int")
    public static boolean stbtt_PackBegin(@NativeType("stbtt_pack_context *") STBTTPackContext spc, @NativeType("unsigned char *") ByteBuffer pixels, int width, int height, int stride_in_bytes, int padding) {
        if (Checks.CHECKS) {
            Checks.checkSafe((Buffer) pixels, (stride_in_bytes != 0 ? stride_in_bytes : width) * height);
        }
        return nstbtt_PackBegin(spc.address(), MemoryUtil.memAddressSafe(pixels), width, height, stride_in_bytes, padding, 0L) != 0;
    }

    public static void stbtt_PackEnd(@NativeType("stbtt_pack_context *") STBTTPackContext spc) {
        nstbtt_PackEnd(spc.address());
    }

    public static int STBTT_POINT_SIZE(int font_size) {
        return -font_size;
    }

    @NativeType("int")
    public static boolean stbtt_PackFontRange(@NativeType("stbtt_pack_context *") STBTTPackContext spc, @NativeType("unsigned char const *") ByteBuffer fontdata, int font_index, float font_size, int first_unicode_char_in_range, @NativeType("stbtt_packedchar *") STBTTPackedchar.Buffer chardata_for_range) {
        return nstbtt_PackFontRange(spc.address(), MemoryUtil.memAddress(fontdata), font_index, font_size, first_unicode_char_in_range, chardata_for_range.remaining(), chardata_for_range.address()) != 0;
    }

    @NativeType("int")
    public static boolean stbtt_PackFontRanges(@NativeType("stbtt_pack_context *") STBTTPackContext spc, @NativeType("unsigned char const *") ByteBuffer fontdata, int font_index, @NativeType("stbtt_pack_range *") STBTTPackRange.Buffer ranges) {
        if (Checks.CHECKS) {
            Struct.validate(ranges.address(), ranges.remaining(), STBTTPackRange.SIZEOF, STBTTPackRange::validate);
        }
        return nstbtt_PackFontRanges(spc.address(), MemoryUtil.memAddress(fontdata), font_index, ranges.address(), ranges.remaining()) != 0;
    }

    public static void stbtt_PackSetOversampling(@NativeType("stbtt_pack_context *") STBTTPackContext spc, @NativeType("unsigned int") int h_oversample, @NativeType("unsigned int") int v_oversample) {
        nstbtt_PackSetOversampling(spc.address(), h_oversample, v_oversample);
    }

    public static void stbtt_PackSetSkipMissingCodepoints(@NativeType("stbtt_pack_context *") STBTTPackContext spc, @NativeType("int") boolean skip) {
        nstbtt_PackSetSkipMissingCodepoints(spc.address(), skip ? 1 : 0);
    }

    public static void stbtt_GetPackedQuad(@NativeType("stbtt_packedchar const *") STBTTPackedchar.Buffer chardata, int pw, int ph, int char_index, @NativeType("float *") FloatBuffer xpos, @NativeType("float *") FloatBuffer ypos, @NativeType("stbtt_aligned_quad *") STBTTAlignedQuad q, @NativeType("int") boolean align_to_integer) {
        if (Checks.CHECKS) {
            Checks.check((CustomBuffer<?>) chardata, char_index + 1);
            Checks.check((Buffer) xpos, 1);
            Checks.check((Buffer) ypos, 1);
        }
        nstbtt_GetPackedQuad(chardata.address(), pw, ph, char_index, MemoryUtil.memAddress(xpos), MemoryUtil.memAddress(ypos), q.address(), align_to_integer ? 1 : 0);
    }

    public static int stbtt_PackFontRangesGatherRects(@NativeType("stbtt_pack_context *") STBTTPackContext spc, @NativeType("stbtt_fontinfo *") STBTTFontinfo info, @NativeType("stbtt_pack_range *") STBTTPackRange.Buffer ranges, @NativeType("stbrp_rect *") STBRPRect.Buffer rects) {
        if (Checks.CHECKS) {
            Struct.validate(ranges.address(), ranges.remaining(), STBTTPackRange.SIZEOF, STBTTPackRange::validate);
        }
        return nstbtt_PackFontRangesGatherRects(spc.address(), info.address(), ranges.address(), ranges.remaining(), rects.address());
    }

    public static void stbtt_PackFontRangesPackRects(@NativeType("stbtt_pack_context *") STBTTPackContext spc, @NativeType("stbrp_rect *") STBRPRect.Buffer rects) {
        nstbtt_PackFontRangesPackRects(spc.address(), rects.address(), rects.remaining());
    }

    @NativeType("int")
    public static boolean stbtt_PackFontRangesRenderIntoRects(@NativeType("stbtt_pack_context *") STBTTPackContext spc, @NativeType("stbtt_fontinfo *") STBTTFontinfo info, @NativeType("stbtt_pack_range *") STBTTPackRange.Buffer ranges, @NativeType("stbrp_rect *") STBRPRect.Buffer rects) {
        if (Checks.CHECKS) {
            Struct.validate(ranges.address(), ranges.remaining(), STBTTPackRange.SIZEOF, STBTTPackRange::validate);
        }
        return nstbtt_PackFontRangesRenderIntoRects(spc.address(), info.address(), ranges.address(), ranges.remaining(), rects.address()) != 0;
    }

    public static int stbtt_GetNumberOfFonts(@NativeType("unsigned char const *") ByteBuffer data) {
        return nstbtt_GetNumberOfFonts(MemoryUtil.memAddress(data));
    }

    public static int stbtt_GetFontOffsetForIndex(@NativeType("unsigned char const *") ByteBuffer data, int index) {
        return nstbtt_GetFontOffsetForIndex(MemoryUtil.memAddress(data), index);
    }

    @NativeType("int")
    public static boolean stbtt_InitFont(@NativeType("stbtt_fontinfo *") STBTTFontinfo info, @NativeType("unsigned char const *") ByteBuffer data, int offset) {
        return nstbtt_InitFont(info.address(), MemoryUtil.memAddress(data), offset) != 0;
    }

    @NativeType("int")
    public static boolean stbtt_InitFont(@NativeType("stbtt_fontinfo *") STBTTFontinfo info, @NativeType("unsigned char const *") ByteBuffer data) {
        return nstbtt_InitFont(info.address(), MemoryUtil.memAddress(data), 0) != 0;
    }

    public static int stbtt_FindGlyphIndex(@NativeType("stbtt_fontinfo const *") STBTTFontinfo info, int unicode_codepoint) {
        return nstbtt_FindGlyphIndex(info.address(), unicode_codepoint);
    }

    public static float stbtt_ScaleForPixelHeight(@NativeType("stbtt_fontinfo const *") STBTTFontinfo info, float pixels) {
        return nstbtt_ScaleForPixelHeight(info.address(), pixels);
    }

    public static float stbtt_ScaleForMappingEmToPixels(@NativeType("stbtt_fontinfo const *") STBTTFontinfo info, float pixels) {
        return nstbtt_ScaleForMappingEmToPixels(info.address(), pixels);
    }

    public static void stbtt_GetFontVMetrics(@NativeType("stbtt_fontinfo const *") STBTTFontinfo info, @NativeType("int *") IntBuffer ascent, @NativeType("int *") IntBuffer descent, @NativeType("int *") IntBuffer lineGap) {
        if (Checks.CHECKS) {
            Checks.checkSafe((Buffer) ascent, 1);
            Checks.checkSafe((Buffer) descent, 1);
            Checks.checkSafe((Buffer) lineGap, 1);
        }
        nstbtt_GetFontVMetrics(info.address(), MemoryUtil.memAddressSafe(ascent), MemoryUtil.memAddressSafe(descent), MemoryUtil.memAddressSafe(lineGap));
    }

    @NativeType("int")
    public static boolean stbtt_GetFontVMetricsOS2(@NativeType("stbtt_fontinfo const *") STBTTFontinfo info, @NativeType("int *") IntBuffer typoAscent, @NativeType("int *") IntBuffer typoDescent, @NativeType("int *") IntBuffer typoLineGap) {
        if (Checks.CHECKS) {
            Checks.checkSafe((Buffer) typoAscent, 1);
            Checks.checkSafe((Buffer) typoDescent, 1);
            Checks.checkSafe((Buffer) typoLineGap, 1);
        }
        return nstbtt_GetFontVMetricsOS2(info.address(), MemoryUtil.memAddressSafe(typoAscent), MemoryUtil.memAddressSafe(typoDescent), MemoryUtil.memAddressSafe(typoLineGap)) != 0;
    }

    public static void stbtt_GetFontBoundingBox(@NativeType("stbtt_fontinfo const *") STBTTFontinfo info, @NativeType("int *") IntBuffer x0, @NativeType("int *") IntBuffer y0, @NativeType("int *") IntBuffer x1, @NativeType("int *") IntBuffer y1) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) x0, 1);
            Checks.check((Buffer) y0, 1);
            Checks.check((Buffer) x1, 1);
            Checks.check((Buffer) y1, 1);
        }
        nstbtt_GetFontBoundingBox(info.address(), MemoryUtil.memAddress(x0), MemoryUtil.memAddress(y0), MemoryUtil.memAddress(x1), MemoryUtil.memAddress(y1));
    }

    public static void stbtt_GetCodepointHMetrics(@NativeType("stbtt_fontinfo const *") STBTTFontinfo info, int codepoint, @NativeType("int *") IntBuffer advanceWidth, @NativeType("int *") IntBuffer leftSideBearing) {
        if (Checks.CHECKS) {
            Checks.checkSafe((Buffer) advanceWidth, 1);
            Checks.checkSafe((Buffer) leftSideBearing, 1);
        }
        nstbtt_GetCodepointHMetrics(info.address(), codepoint, MemoryUtil.memAddressSafe(advanceWidth), MemoryUtil.memAddressSafe(leftSideBearing));
    }

    public static int stbtt_GetCodepointKernAdvance(@NativeType("stbtt_fontinfo const *") STBTTFontinfo info, int ch1, int ch2) {
        return nstbtt_GetCodepointKernAdvance(info.address(), ch1, ch2);
    }

    @NativeType("int")
    public static boolean stbtt_GetCodepointBox(@NativeType("stbtt_fontinfo const *") STBTTFontinfo info, int codepoint, @NativeType("int *") IntBuffer x0, @NativeType("int *") IntBuffer y0, @NativeType("int *") IntBuffer x1, @NativeType("int *") IntBuffer y1) {
        if (Checks.CHECKS) {
            Checks.checkSafe((Buffer) x0, 1);
            Checks.checkSafe((Buffer) y0, 1);
            Checks.checkSafe((Buffer) x1, 1);
            Checks.checkSafe((Buffer) y1, 1);
        }
        return nstbtt_GetCodepointBox(info.address(), codepoint, MemoryUtil.memAddressSafe(x0), MemoryUtil.memAddressSafe(y0), MemoryUtil.memAddressSafe(x1), MemoryUtil.memAddressSafe(y1)) != 0;
    }

    public static void stbtt_GetGlyphHMetrics(@NativeType("stbtt_fontinfo const *") STBTTFontinfo info, int glyph_index, @NativeType("int *") IntBuffer advanceWidth, @NativeType("int *") IntBuffer leftSideBearing) {
        if (Checks.CHECKS) {
            Checks.checkSafe((Buffer) advanceWidth, 1);
            Checks.checkSafe((Buffer) leftSideBearing, 1);
        }
        nstbtt_GetGlyphHMetrics(info.address(), glyph_index, MemoryUtil.memAddressSafe(advanceWidth), MemoryUtil.memAddressSafe(leftSideBearing));
    }

    public static int stbtt_GetGlyphKernAdvance(@NativeType("stbtt_fontinfo const *") STBTTFontinfo info, int glyph1, int glyph2) {
        return nstbtt_GetGlyphKernAdvance(info.address(), glyph1, glyph2);
    }

    @NativeType("int")
    public static boolean stbtt_GetGlyphBox(@NativeType("stbtt_fontinfo const *") STBTTFontinfo info, int glyph_index, @NativeType("int *") IntBuffer x0, @NativeType("int *") IntBuffer y0, @NativeType("int *") IntBuffer x1, @NativeType("int *") IntBuffer y1) {
        if (Checks.CHECKS) {
            Checks.checkSafe((Buffer) x0, 1);
            Checks.checkSafe((Buffer) y0, 1);
            Checks.checkSafe((Buffer) x1, 1);
            Checks.checkSafe((Buffer) y1, 1);
        }
        return nstbtt_GetGlyphBox(info.address(), glyph_index, MemoryUtil.memAddressSafe(x0), MemoryUtil.memAddressSafe(y0), MemoryUtil.memAddressSafe(x1), MemoryUtil.memAddressSafe(y1)) != 0;
    }

    public static int stbtt_GetKerningTableLength(@NativeType("stbtt_fontinfo const *") STBTTFontinfo info) {
        return nstbtt_GetKerningTableLength(info.address());
    }

    public static int stbtt_GetKerningTable(@NativeType("stbtt_fontinfo const *") STBTTFontinfo info, @NativeType("stbtt_kerningentry *") STBTTKerningentry.Buffer table) {
        return nstbtt_GetKerningTable(info.address(), table.address(), table.remaining());
    }

    @NativeType("int")
    public static boolean stbtt_IsGlyphEmpty(@NativeType("stbtt_fontinfo const *") STBTTFontinfo info, int glyph_index) {
        return nstbtt_IsGlyphEmpty(info.address(), glyph_index) != 0;
    }

    public static int stbtt_GetCodepointShape(@NativeType("stbtt_fontinfo const *") STBTTFontinfo info, int unicode_codepoint, @NativeType("stbtt_vertex **") PointerBuffer vertices) {
        if (Checks.CHECKS) {
            Checks.check((CustomBuffer<?>) vertices, 1);
        }
        return nstbtt_GetCodepointShape(info.address(), unicode_codepoint, MemoryUtil.memAddress(vertices));
    }

    @NativeType("int")
    public static STBTTVertex.Buffer stbtt_GetCodepointShape(@NativeType("stbtt_fontinfo const *") STBTTFontinfo info, int unicode_codepoint) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            PointerBuffer vertices = stack.pointers(0L);
            int __result = nstbtt_GetCodepointShape(info.address(), unicode_codepoint, MemoryUtil.memAddress(vertices));
            STBTTVertex.Buffer bufferCreateSafe = STBTTVertex.createSafe(vertices.get(0), __result);
            stack.setPointer(stackPointer);
            return bufferCreateSafe;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static int stbtt_GetGlyphShape(@NativeType("stbtt_fontinfo const *") STBTTFontinfo info, int glyph_index, @NativeType("stbtt_vertex **") PointerBuffer vertices) {
        if (Checks.CHECKS) {
            Checks.check((CustomBuffer<?>) vertices, 1);
        }
        return nstbtt_GetGlyphShape(info.address(), glyph_index, MemoryUtil.memAddress(vertices));
    }

    @NativeType("int")
    public static STBTTVertex.Buffer stbtt_GetGlyphShape(@NativeType("stbtt_fontinfo const *") STBTTFontinfo info, int glyph_index) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            PointerBuffer vertices = stack.pointers(0L);
            int __result = nstbtt_GetGlyphShape(info.address(), glyph_index, MemoryUtil.memAddress(vertices));
            STBTTVertex.Buffer bufferCreateSafe = STBTTVertex.createSafe(vertices.get(0), __result);
            stack.setPointer(stackPointer);
            return bufferCreateSafe;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static void stbtt_FreeShape(@NativeType("stbtt_fontinfo const *") STBTTFontinfo info, @NativeType("stbtt_vertex *") STBTTVertex.Buffer vertices) {
        if (Checks.CHECKS) {
            Checks.check((CustomBuffer<?>) vertices, 1);
        }
        nstbtt_FreeShape(info.address(), vertices.address());
    }

    @NativeType("unsigned char *")
    public static long stbtt_FindSVGDoc(@NativeType("stbtt_fontinfo const *") STBTTFontinfo info, int gl) {
        return nstbtt_FindSVGDoc(info.address(), gl);
    }

    public static int stbtt_GetCodepointSVG(@NativeType("stbtt_fontinfo const *") STBTTFontinfo info, int unicode_codepoint, @NativeType("char const **") PointerBuffer svg) {
        if (Checks.CHECKS) {
            Checks.check((CustomBuffer<?>) svg, 1);
        }
        return nstbtt_GetCodepointSVG(info.address(), unicode_codepoint, MemoryUtil.memAddress(svg));
    }

    public static int stbtt_GetGlyphSVG(@NativeType("stbtt_fontinfo const *") STBTTFontinfo info, int gl, @NativeType("char const **") PointerBuffer svg) {
        if (Checks.CHECKS) {
            Checks.check((CustomBuffer<?>) svg, 1);
        }
        return nstbtt_GetGlyphSVG(info.address(), gl, MemoryUtil.memAddress(svg));
    }

    public static void stbtt_FreeBitmap(@NativeType("unsigned char *") ByteBuffer bitmap, @NativeType("void *") long userdata) {
        nstbtt_FreeBitmap(MemoryUtil.memAddress(bitmap), userdata);
    }

    public static void stbtt_FreeBitmap(@NativeType("unsigned char *") ByteBuffer bitmap) {
        nstbtt_FreeBitmap(MemoryUtil.memAddress(bitmap), 0L);
    }

    @NativeType("unsigned char *")
    public static ByteBuffer stbtt_GetCodepointBitmap(@NativeType("stbtt_fontinfo const *") STBTTFontinfo info, float scale_x, float scale_y, int codepoint, @NativeType("int *") IntBuffer width, @NativeType("int *") IntBuffer height, @NativeType("int *") IntBuffer xoff, @NativeType("int *") IntBuffer yoff) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) width, 1);
            Checks.check((Buffer) height, 1);
            Checks.checkSafe((Buffer) xoff, 1);
            Checks.checkSafe((Buffer) yoff, 1);
        }
        long __result = nstbtt_GetCodepointBitmap(info.address(), scale_x, scale_y, codepoint, MemoryUtil.memAddress(width), MemoryUtil.memAddress(height), MemoryUtil.memAddressSafe(xoff), MemoryUtil.memAddressSafe(yoff));
        return MemoryUtil.memByteBufferSafe(__result, width.get(width.position()) * height.get(height.position()));
    }

    @NativeType("unsigned char *")
    public static ByteBuffer stbtt_GetCodepointBitmapSubpixel(@NativeType("stbtt_fontinfo const *") STBTTFontinfo info, float scale_x, float scale_y, float shift_x, float shift_y, int codepoint, @NativeType("int *") IntBuffer width, @NativeType("int *") IntBuffer height, @NativeType("int *") IntBuffer xoff, @NativeType("int *") IntBuffer yoff) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) width, 1);
            Checks.check((Buffer) height, 1);
            Checks.checkSafe((Buffer) xoff, 1);
            Checks.checkSafe((Buffer) yoff, 1);
        }
        long __result = nstbtt_GetCodepointBitmapSubpixel(info.address(), scale_x, scale_y, shift_x, shift_y, codepoint, MemoryUtil.memAddress(width), MemoryUtil.memAddress(height), MemoryUtil.memAddressSafe(xoff), MemoryUtil.memAddressSafe(yoff));
        return MemoryUtil.memByteBufferSafe(__result, width.get(width.position()) * height.get(height.position()));
    }

    public static void stbtt_MakeCodepointBitmap(@NativeType("stbtt_fontinfo const *") STBTTFontinfo info, @NativeType("unsigned char *") ByteBuffer output, int out_w, int out_h, int out_stride, float scale_x, float scale_y, int codepoint) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) output, (out_stride != 0 ? out_stride : out_w) * out_h);
        }
        nstbtt_MakeCodepointBitmap(info.address(), MemoryUtil.memAddress(output), out_w, out_h, out_stride, scale_x, scale_y, codepoint);
    }

    public static void stbtt_MakeCodepointBitmapSubpixel(@NativeType("stbtt_fontinfo const *") STBTTFontinfo info, @NativeType("unsigned char *") ByteBuffer output, int out_w, int out_h, int out_stride, float scale_x, float scale_y, float shift_x, float shift_y, int codepoint) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) output, (out_stride != 0 ? out_stride : out_w) * out_h);
        }
        nstbtt_MakeCodepointBitmapSubpixel(info.address(), MemoryUtil.memAddress(output), out_w, out_h, out_stride, scale_x, scale_y, shift_x, shift_y, codepoint);
    }

    public static void stbtt_MakeCodepointBitmapSubpixelPrefilter(@NativeType("stbtt_fontinfo const *") STBTTFontinfo info, @NativeType("unsigned char *") ByteBuffer output, int out_w, int out_h, int out_stride, float scale_x, float scale_y, float shift_x, float shift_y, int oversample_x, int oversample_y, @NativeType("float *") FloatBuffer sub_x, @NativeType("float *") FloatBuffer sub_y, int codepoint) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) output, (out_stride != 0 ? out_stride : out_w) * out_h);
            Checks.check((Buffer) sub_x, 1);
            Checks.check((Buffer) sub_y, 1);
        }
        nstbtt_MakeCodepointBitmapSubpixelPrefilter(info.address(), MemoryUtil.memAddress(output), out_w, out_h, out_stride, scale_x, scale_y, shift_x, shift_y, oversample_x, oversample_y, MemoryUtil.memAddress(sub_x), MemoryUtil.memAddress(sub_y), codepoint);
    }

    public static void stbtt_GetCodepointBitmapBox(@NativeType("stbtt_fontinfo const *") STBTTFontinfo font, int codepoint, float scale_x, float scale_y, @NativeType("int *") IntBuffer ix0, @NativeType("int *") IntBuffer iy0, @NativeType("int *") IntBuffer ix1, @NativeType("int *") IntBuffer iy1) {
        if (Checks.CHECKS) {
            Checks.checkSafe((Buffer) ix0, 1);
            Checks.checkSafe((Buffer) iy0, 1);
            Checks.checkSafe((Buffer) ix1, 1);
            Checks.checkSafe((Buffer) iy1, 1);
        }
        nstbtt_GetCodepointBitmapBox(font.address(), codepoint, scale_x, scale_y, MemoryUtil.memAddressSafe(ix0), MemoryUtil.memAddressSafe(iy0), MemoryUtil.memAddressSafe(ix1), MemoryUtil.memAddressSafe(iy1));
    }

    public static void stbtt_GetCodepointBitmapBoxSubpixel(@NativeType("stbtt_fontinfo const *") STBTTFontinfo font, int codepoint, float scale_x, float scale_y, float shift_x, float shift_y, @NativeType("int *") IntBuffer ix0, @NativeType("int *") IntBuffer iy0, @NativeType("int *") IntBuffer ix1, @NativeType("int *") IntBuffer iy1) {
        if (Checks.CHECKS) {
            Checks.checkSafe((Buffer) ix0, 1);
            Checks.checkSafe((Buffer) iy0, 1);
            Checks.checkSafe((Buffer) ix1, 1);
            Checks.checkSafe((Buffer) iy1, 1);
        }
        nstbtt_GetCodepointBitmapBoxSubpixel(font.address(), codepoint, scale_x, scale_y, shift_x, shift_y, MemoryUtil.memAddressSafe(ix0), MemoryUtil.memAddressSafe(iy0), MemoryUtil.memAddressSafe(ix1), MemoryUtil.memAddressSafe(iy1));
    }

    @NativeType("unsigned char *")
    public static ByteBuffer stbtt_GetGlyphBitmap(@NativeType("stbtt_fontinfo const *") STBTTFontinfo info, float scale_x, float scale_y, int glyph, @NativeType("int *") IntBuffer width, @NativeType("int *") IntBuffer height, @NativeType("int *") IntBuffer xoff, @NativeType("int *") IntBuffer yoff) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) width, 1);
            Checks.check((Buffer) height, 1);
            Checks.checkSafe((Buffer) xoff, 1);
            Checks.checkSafe((Buffer) yoff, 1);
        }
        long __result = nstbtt_GetGlyphBitmap(info.address(), scale_x, scale_y, glyph, MemoryUtil.memAddress(width), MemoryUtil.memAddress(height), MemoryUtil.memAddressSafe(xoff), MemoryUtil.memAddressSafe(yoff));
        return MemoryUtil.memByteBufferSafe(__result, width.get(width.position()) * height.get(height.position()));
    }

    @NativeType("unsigned char *")
    public static ByteBuffer stbtt_GetGlyphBitmapSubpixel(@NativeType("stbtt_fontinfo const *") STBTTFontinfo info, float scale_x, float scale_y, float shift_x, float shift_y, int glyph, @NativeType("int *") IntBuffer width, @NativeType("int *") IntBuffer height, @NativeType("int *") IntBuffer xoff, @NativeType("int *") IntBuffer yoff) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) width, 1);
            Checks.check((Buffer) height, 1);
            Checks.checkSafe((Buffer) xoff, 1);
            Checks.checkSafe((Buffer) yoff, 1);
        }
        long __result = nstbtt_GetGlyphBitmapSubpixel(info.address(), scale_x, scale_y, shift_x, shift_y, glyph, MemoryUtil.memAddress(width), MemoryUtil.memAddress(height), MemoryUtil.memAddressSafe(xoff), MemoryUtil.memAddressSafe(yoff));
        return MemoryUtil.memByteBufferSafe(__result, width.get(width.position()) * height.get(height.position()));
    }

    public static void stbtt_MakeGlyphBitmap(@NativeType("stbtt_fontinfo const *") STBTTFontinfo info, @NativeType("unsigned char *") ByteBuffer output, int out_w, int out_h, int out_stride, float scale_x, float scale_y, int glyph) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) output, (out_stride != 0 ? out_stride : out_w) * out_h);
        }
        nstbtt_MakeGlyphBitmap(info.address(), MemoryUtil.memAddress(output), out_w, out_h, out_stride, scale_x, scale_y, glyph);
    }

    public static void stbtt_MakeGlyphBitmapSubpixel(@NativeType("stbtt_fontinfo const *") STBTTFontinfo info, @NativeType("unsigned char *") ByteBuffer output, int out_w, int out_h, int out_stride, float scale_x, float scale_y, float shift_x, float shift_y, int glyph) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) output, (out_stride != 0 ? out_stride : out_w) * out_h);
        }
        nstbtt_MakeGlyphBitmapSubpixel(info.address(), MemoryUtil.memAddress(output), out_w, out_h, out_stride, scale_x, scale_y, shift_x, shift_y, glyph);
    }

    public static void stbtt_MakeGlyphBitmapSubpixelPrefilter(@NativeType("stbtt_fontinfo const *") STBTTFontinfo info, @NativeType("unsigned char *") ByteBuffer output, int out_w, int out_h, int out_stride, float scale_x, float scale_y, float shift_x, float shift_y, int oversample_x, int oversample_y, @NativeType("float *") FloatBuffer sub_x, @NativeType("float *") FloatBuffer sub_y, int glyph) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) output, (out_stride != 0 ? out_stride : out_w) * out_h);
            Checks.check((Buffer) sub_x, 1);
            Checks.check((Buffer) sub_y, 1);
        }
        nstbtt_MakeGlyphBitmapSubpixelPrefilter(info.address(), MemoryUtil.memAddress(output), out_w, out_h, out_stride, scale_x, scale_y, shift_x, shift_y, oversample_x, oversample_y, MemoryUtil.memAddress(sub_x), MemoryUtil.memAddress(sub_y), glyph);
    }

    public static void stbtt_GetGlyphBitmapBox(@NativeType("stbtt_fontinfo const *") STBTTFontinfo font, int glyph, float scale_x, float scale_y, @NativeType("int *") IntBuffer ix0, @NativeType("int *") IntBuffer iy0, @NativeType("int *") IntBuffer ix1, @NativeType("int *") IntBuffer iy1) {
        if (Checks.CHECKS) {
            Checks.checkSafe((Buffer) ix0, 1);
            Checks.checkSafe((Buffer) iy0, 1);
            Checks.checkSafe((Buffer) ix1, 1);
            Checks.checkSafe((Buffer) iy1, 1);
        }
        nstbtt_GetGlyphBitmapBox(font.address(), glyph, scale_x, scale_y, MemoryUtil.memAddressSafe(ix0), MemoryUtil.memAddressSafe(iy0), MemoryUtil.memAddressSafe(ix1), MemoryUtil.memAddressSafe(iy1));
    }

    public static void stbtt_GetGlyphBitmapBoxSubpixel(@NativeType("stbtt_fontinfo const *") STBTTFontinfo font, int glyph, float scale_x, float scale_y, float shift_x, float shift_y, @NativeType("int *") IntBuffer ix0, @NativeType("int *") IntBuffer iy0, @NativeType("int *") IntBuffer ix1, @NativeType("int *") IntBuffer iy1) {
        if (Checks.CHECKS) {
            Checks.checkSafe((Buffer) ix0, 1);
            Checks.checkSafe((Buffer) iy0, 1);
            Checks.checkSafe((Buffer) ix1, 1);
            Checks.checkSafe((Buffer) iy1, 1);
        }
        nstbtt_GetGlyphBitmapBoxSubpixel(font.address(), glyph, scale_x, scale_y, shift_x, shift_y, MemoryUtil.memAddressSafe(ix0), MemoryUtil.memAddressSafe(iy0), MemoryUtil.memAddressSafe(ix1), MemoryUtil.memAddressSafe(iy1));
    }

    public static void stbtt_Rasterize(@NativeType("stbtt__bitmap *") STBTTBitmap result, float flatness_in_pixels, @NativeType("stbtt_vertex *") STBTTVertex.Buffer vertices, float scale_x, float scale_y, float shift_x, float shift_y, int x_off, int y_off, @NativeType("int") boolean invert) {
        nstbtt_Rasterize(result.address(), flatness_in_pixels, vertices.address(), vertices.remaining(), scale_x, scale_y, shift_x, shift_y, x_off, y_off, invert ? 1 : 0, 0L);
    }

    public static void stbtt_FreeSDF(@NativeType("unsigned char *") ByteBuffer bitmap, @NativeType("void *") long userdata) {
        nstbtt_FreeSDF(MemoryUtil.memAddress(bitmap), userdata);
    }

    public static void stbtt_FreeSDF(@NativeType("unsigned char *") ByteBuffer bitmap) {
        nstbtt_FreeSDF(MemoryUtil.memAddress(bitmap), 0L);
    }

    @NativeType("unsigned char *")
    public static ByteBuffer stbtt_GetGlyphSDF(@NativeType("stbtt_fontinfo const *") STBTTFontinfo font, float scale, int glyph, int padding, @NativeType("unsigned char") byte onedge_value, float pixel_dist_scale, @NativeType("int *") IntBuffer width, @NativeType("int *") IntBuffer height, @NativeType("int *") IntBuffer xoff, @NativeType("int *") IntBuffer yoff) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) width, 1);
            Checks.check((Buffer) height, 1);
            Checks.check((Buffer) xoff, 1);
            Checks.check((Buffer) yoff, 1);
        }
        long __result = nstbtt_GetGlyphSDF(font.address(), scale, glyph, padding, onedge_value, pixel_dist_scale, MemoryUtil.memAddress(width), MemoryUtil.memAddress(height), MemoryUtil.memAddress(xoff), MemoryUtil.memAddress(yoff));
        return MemoryUtil.memByteBufferSafe(__result, width.get(width.position()) * height.get(height.position()));
    }

    @NativeType("unsigned char *")
    public static ByteBuffer stbtt_GetCodepointSDF(@NativeType("stbtt_fontinfo const *") STBTTFontinfo font, float scale, int codepoint, int padding, @NativeType("unsigned char") byte onedge_value, float pixel_dist_scale, @NativeType("int *") IntBuffer width, @NativeType("int *") IntBuffer height, @NativeType("int *") IntBuffer xoff, @NativeType("int *") IntBuffer yoff) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) width, 1);
            Checks.check((Buffer) height, 1);
            Checks.check((Buffer) xoff, 1);
            Checks.check((Buffer) yoff, 1);
        }
        long __result = nstbtt_GetCodepointSDF(font.address(), scale, codepoint, padding, onedge_value, pixel_dist_scale, MemoryUtil.memAddress(width), MemoryUtil.memAddress(height), MemoryUtil.memAddress(xoff), MemoryUtil.memAddress(yoff));
        return MemoryUtil.memByteBufferSafe(__result, width.get(width.position()) * height.get(height.position()));
    }

    public static int stbtt_FindMatchingFont(@NativeType("unsigned char const *") ByteBuffer fontdata, @NativeType("char const *") ByteBuffer name, int flags) {
        if (Checks.CHECKS) {
            Checks.checkNT1(name);
        }
        return nstbtt_FindMatchingFont(MemoryUtil.memAddress(fontdata), MemoryUtil.memAddress(name), flags);
    }

    public static int stbtt_FindMatchingFont(@NativeType("unsigned char const *") ByteBuffer fontdata, @NativeType("char const *") CharSequence name, int flags) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(name, true);
            long nameEncoded = stack.getPointerAddress();
            int iNstbtt_FindMatchingFont = nstbtt_FindMatchingFont(MemoryUtil.memAddress(fontdata), nameEncoded, flags);
            stack.setPointer(stackPointer);
            return iNstbtt_FindMatchingFont;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    @NativeType("int")
    public static boolean stbtt_CompareUTF8toUTF16_bigendian(@NativeType("char const *") ByteBuffer s1, @NativeType("char const *") ByteBuffer s2) {
        return nstbtt_CompareUTF8toUTF16_bigendian(MemoryUtil.memAddress(s1), s1.remaining(), MemoryUtil.memAddress(s2), s2.remaining()) != 0;
    }

    @NativeType("char const *")
    public static ByteBuffer stbtt_GetFontNameString(@NativeType("stbtt_fontinfo const *") STBTTFontinfo font, int platformID, int encodingID, int languageID, int nameID) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        IntBuffer length = stack.callocInt(1);
        try {
            long __result = nstbtt_GetFontNameString(font.address(), MemoryUtil.memAddress(length), platformID, encodingID, languageID, nameID);
            ByteBuffer byteBufferMemByteBufferSafe = MemoryUtil.memByteBufferSafe(__result, length.get(0));
            stack.setPointer(stackPointer);
            return byteBufferMemByteBufferSafe;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static void stbtt_GetBakedQuad(@NativeType("stbtt_bakedchar const *") STBTTBakedChar.Buffer chardata, int pw, int ph, int char_index, @NativeType("float *") float[] xpos, @NativeType("float *") float[] ypos, @NativeType("stbtt_aligned_quad *") STBTTAlignedQuad q, @NativeType("int") boolean opengl_fillrule) {
        if (Checks.CHECKS) {
            Checks.check((CustomBuffer<?>) chardata, char_index + 1);
            Checks.check(xpos, 1);
            Checks.check(ypos, 1);
        }
        nstbtt_GetBakedQuad(chardata.address(), pw, ph, char_index, xpos, ypos, q.address(), opengl_fillrule ? 1 : 0);
    }

    public static void stbtt_GetScaledFontVMetrics(@NativeType("unsigned char const *") ByteBuffer fontdata, int index, float size, @NativeType("float *") float[] ascent, @NativeType("float *") float[] descent, @NativeType("float *") float[] lineGap) {
        if (Checks.CHECKS) {
            Checks.check(ascent, 1);
            Checks.check(descent, 1);
            Checks.check(lineGap, 1);
        }
        nstbtt_GetScaledFontVMetrics(MemoryUtil.memAddress(fontdata), index, size, ascent, descent, lineGap);
    }

    public static void stbtt_GetPackedQuad(@NativeType("stbtt_packedchar const *") STBTTPackedchar.Buffer chardata, int pw, int ph, int char_index, @NativeType("float *") float[] xpos, @NativeType("float *") float[] ypos, @NativeType("stbtt_aligned_quad *") STBTTAlignedQuad q, @NativeType("int") boolean align_to_integer) {
        if (Checks.CHECKS) {
            Checks.check((CustomBuffer<?>) chardata, char_index + 1);
            Checks.check(xpos, 1);
            Checks.check(ypos, 1);
        }
        nstbtt_GetPackedQuad(chardata.address(), pw, ph, char_index, xpos, ypos, q.address(), align_to_integer ? 1 : 0);
    }

    public static void stbtt_GetFontVMetrics(@NativeType("stbtt_fontinfo const *") STBTTFontinfo info, @NativeType("int *") int[] ascent, @NativeType("int *") int[] descent, @NativeType("int *") int[] lineGap) {
        if (Checks.CHECKS) {
            Checks.checkSafe(ascent, 1);
            Checks.checkSafe(descent, 1);
            Checks.checkSafe(lineGap, 1);
        }
        nstbtt_GetFontVMetrics(info.address(), ascent, descent, lineGap);
    }

    @NativeType("int")
    public static boolean stbtt_GetFontVMetricsOS2(@NativeType("stbtt_fontinfo const *") STBTTFontinfo info, @NativeType("int *") int[] typoAscent, @NativeType("int *") int[] typoDescent, @NativeType("int *") int[] typoLineGap) {
        if (Checks.CHECKS) {
            Checks.checkSafe(typoAscent, 1);
            Checks.checkSafe(typoDescent, 1);
            Checks.checkSafe(typoLineGap, 1);
        }
        return nstbtt_GetFontVMetricsOS2(info.address(), typoAscent, typoDescent, typoLineGap) != 0;
    }

    public static void stbtt_GetFontBoundingBox(@NativeType("stbtt_fontinfo const *") STBTTFontinfo info, @NativeType("int *") int[] x0, @NativeType("int *") int[] y0, @NativeType("int *") int[] x1, @NativeType("int *") int[] y1) {
        if (Checks.CHECKS) {
            Checks.check(x0, 1);
            Checks.check(y0, 1);
            Checks.check(x1, 1);
            Checks.check(y1, 1);
        }
        nstbtt_GetFontBoundingBox(info.address(), x0, y0, x1, y1);
    }

    public static void stbtt_GetCodepointHMetrics(@NativeType("stbtt_fontinfo const *") STBTTFontinfo info, int codepoint, @NativeType("int *") int[] advanceWidth, @NativeType("int *") int[] leftSideBearing) {
        if (Checks.CHECKS) {
            Checks.checkSafe(advanceWidth, 1);
            Checks.checkSafe(leftSideBearing, 1);
        }
        nstbtt_GetCodepointHMetrics(info.address(), codepoint, advanceWidth, leftSideBearing);
    }

    @NativeType("int")
    public static boolean stbtt_GetCodepointBox(@NativeType("stbtt_fontinfo const *") STBTTFontinfo info, int codepoint, @NativeType("int *") int[] x0, @NativeType("int *") int[] y0, @NativeType("int *") int[] x1, @NativeType("int *") int[] y1) {
        if (Checks.CHECKS) {
            Checks.checkSafe(x0, 1);
            Checks.checkSafe(y0, 1);
            Checks.checkSafe(x1, 1);
            Checks.checkSafe(y1, 1);
        }
        return nstbtt_GetCodepointBox(info.address(), codepoint, x0, y0, x1, y1) != 0;
    }

    public static void stbtt_GetGlyphHMetrics(@NativeType("stbtt_fontinfo const *") STBTTFontinfo info, int glyph_index, @NativeType("int *") int[] advanceWidth, @NativeType("int *") int[] leftSideBearing) {
        if (Checks.CHECKS) {
            Checks.checkSafe(advanceWidth, 1);
            Checks.checkSafe(leftSideBearing, 1);
        }
        nstbtt_GetGlyphHMetrics(info.address(), glyph_index, advanceWidth, leftSideBearing);
    }

    @NativeType("int")
    public static boolean stbtt_GetGlyphBox(@NativeType("stbtt_fontinfo const *") STBTTFontinfo info, int glyph_index, @NativeType("int *") int[] x0, @NativeType("int *") int[] y0, @NativeType("int *") int[] x1, @NativeType("int *") int[] y1) {
        if (Checks.CHECKS) {
            Checks.checkSafe(x0, 1);
            Checks.checkSafe(y0, 1);
            Checks.checkSafe(x1, 1);
            Checks.checkSafe(y1, 1);
        }
        return nstbtt_GetGlyphBox(info.address(), glyph_index, x0, y0, x1, y1) != 0;
    }

    @NativeType("unsigned char *")
    public static ByteBuffer stbtt_GetCodepointBitmap(@NativeType("stbtt_fontinfo const *") STBTTFontinfo info, float scale_x, float scale_y, int codepoint, @NativeType("int *") int[] width, @NativeType("int *") int[] height, @NativeType("int *") int[] xoff, @NativeType("int *") int[] yoff) {
        if (Checks.CHECKS) {
            Checks.check(width, 1);
            Checks.check(height, 1);
            Checks.checkSafe(xoff, 1);
            Checks.checkSafe(yoff, 1);
        }
        long __result = nstbtt_GetCodepointBitmap(info.address(), scale_x, scale_y, codepoint, width, height, xoff, yoff);
        return MemoryUtil.memByteBufferSafe(__result, width[0] * height[0]);
    }

    @NativeType("unsigned char *")
    public static ByteBuffer stbtt_GetCodepointBitmapSubpixel(@NativeType("stbtt_fontinfo const *") STBTTFontinfo info, float scale_x, float scale_y, float shift_x, float shift_y, int codepoint, @NativeType("int *") int[] width, @NativeType("int *") int[] height, @NativeType("int *") int[] xoff, @NativeType("int *") int[] yoff) {
        if (Checks.CHECKS) {
            Checks.check(width, 1);
            Checks.check(height, 1);
            Checks.checkSafe(xoff, 1);
            Checks.checkSafe(yoff, 1);
        }
        long __result = nstbtt_GetCodepointBitmapSubpixel(info.address(), scale_x, scale_y, shift_x, shift_y, codepoint, width, height, xoff, yoff);
        return MemoryUtil.memByteBufferSafe(__result, width[0] * height[0]);
    }

    public static void stbtt_MakeCodepointBitmapSubpixelPrefilter(@NativeType("stbtt_fontinfo const *") STBTTFontinfo info, @NativeType("unsigned char *") ByteBuffer output, int out_w, int out_h, int out_stride, float scale_x, float scale_y, float shift_x, float shift_y, int oversample_x, int oversample_y, @NativeType("float *") float[] sub_x, @NativeType("float *") float[] sub_y, int codepoint) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) output, (out_stride != 0 ? out_stride : out_w) * out_h);
            Checks.check(sub_x, 1);
            Checks.check(sub_y, 1);
        }
        nstbtt_MakeCodepointBitmapSubpixelPrefilter(info.address(), MemoryUtil.memAddress(output), out_w, out_h, out_stride, scale_x, scale_y, shift_x, shift_y, oversample_x, oversample_y, sub_x, sub_y, codepoint);
    }

    public static void stbtt_GetCodepointBitmapBox(@NativeType("stbtt_fontinfo const *") STBTTFontinfo font, int codepoint, float scale_x, float scale_y, @NativeType("int *") int[] ix0, @NativeType("int *") int[] iy0, @NativeType("int *") int[] ix1, @NativeType("int *") int[] iy1) {
        if (Checks.CHECKS) {
            Checks.checkSafe(ix0, 1);
            Checks.checkSafe(iy0, 1);
            Checks.checkSafe(ix1, 1);
            Checks.checkSafe(iy1, 1);
        }
        nstbtt_GetCodepointBitmapBox(font.address(), codepoint, scale_x, scale_y, ix0, iy0, ix1, iy1);
    }

    public static void stbtt_GetCodepointBitmapBoxSubpixel(@NativeType("stbtt_fontinfo const *") STBTTFontinfo font, int codepoint, float scale_x, float scale_y, float shift_x, float shift_y, @NativeType("int *") int[] ix0, @NativeType("int *") int[] iy0, @NativeType("int *") int[] ix1, @NativeType("int *") int[] iy1) {
        if (Checks.CHECKS) {
            Checks.checkSafe(ix0, 1);
            Checks.checkSafe(iy0, 1);
            Checks.checkSafe(ix1, 1);
            Checks.checkSafe(iy1, 1);
        }
        nstbtt_GetCodepointBitmapBoxSubpixel(font.address(), codepoint, scale_x, scale_y, shift_x, shift_y, ix0, iy0, ix1, iy1);
    }

    @NativeType("unsigned char *")
    public static ByteBuffer stbtt_GetGlyphBitmap(@NativeType("stbtt_fontinfo const *") STBTTFontinfo info, float scale_x, float scale_y, int glyph, @NativeType("int *") int[] width, @NativeType("int *") int[] height, @NativeType("int *") int[] xoff, @NativeType("int *") int[] yoff) {
        if (Checks.CHECKS) {
            Checks.check(width, 1);
            Checks.check(height, 1);
            Checks.checkSafe(xoff, 1);
            Checks.checkSafe(yoff, 1);
        }
        long __result = nstbtt_GetGlyphBitmap(info.address(), scale_x, scale_y, glyph, width, height, xoff, yoff);
        return MemoryUtil.memByteBufferSafe(__result, width[0] * height[0]);
    }

    @NativeType("unsigned char *")
    public static ByteBuffer stbtt_GetGlyphBitmapSubpixel(@NativeType("stbtt_fontinfo const *") STBTTFontinfo info, float scale_x, float scale_y, float shift_x, float shift_y, int glyph, @NativeType("int *") int[] width, @NativeType("int *") int[] height, @NativeType("int *") int[] xoff, @NativeType("int *") int[] yoff) {
        if (Checks.CHECKS) {
            Checks.check(width, 1);
            Checks.check(height, 1);
            Checks.checkSafe(xoff, 1);
            Checks.checkSafe(yoff, 1);
        }
        long __result = nstbtt_GetGlyphBitmapSubpixel(info.address(), scale_x, scale_y, shift_x, shift_y, glyph, width, height, xoff, yoff);
        return MemoryUtil.memByteBufferSafe(__result, width[0] * height[0]);
    }

    public static void stbtt_MakeGlyphBitmapSubpixelPrefilter(@NativeType("stbtt_fontinfo const *") STBTTFontinfo info, @NativeType("unsigned char *") ByteBuffer output, int out_w, int out_h, int out_stride, float scale_x, float scale_y, float shift_x, float shift_y, int oversample_x, int oversample_y, @NativeType("float *") float[] sub_x, @NativeType("float *") float[] sub_y, int glyph) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) output, (out_stride != 0 ? out_stride : out_w) * out_h);
            Checks.check(sub_x, 1);
            Checks.check(sub_y, 1);
        }
        nstbtt_MakeGlyphBitmapSubpixelPrefilter(info.address(), MemoryUtil.memAddress(output), out_w, out_h, out_stride, scale_x, scale_y, shift_x, shift_y, oversample_x, oversample_y, sub_x, sub_y, glyph);
    }

    public static void stbtt_GetGlyphBitmapBox(@NativeType("stbtt_fontinfo const *") STBTTFontinfo font, int glyph, float scale_x, float scale_y, @NativeType("int *") int[] ix0, @NativeType("int *") int[] iy0, @NativeType("int *") int[] ix1, @NativeType("int *") int[] iy1) {
        if (Checks.CHECKS) {
            Checks.checkSafe(ix0, 1);
            Checks.checkSafe(iy0, 1);
            Checks.checkSafe(ix1, 1);
            Checks.checkSafe(iy1, 1);
        }
        nstbtt_GetGlyphBitmapBox(font.address(), glyph, scale_x, scale_y, ix0, iy0, ix1, iy1);
    }

    public static void stbtt_GetGlyphBitmapBoxSubpixel(@NativeType("stbtt_fontinfo const *") STBTTFontinfo font, int glyph, float scale_x, float scale_y, float shift_x, float shift_y, @NativeType("int *") int[] ix0, @NativeType("int *") int[] iy0, @NativeType("int *") int[] ix1, @NativeType("int *") int[] iy1) {
        if (Checks.CHECKS) {
            Checks.checkSafe(ix0, 1);
            Checks.checkSafe(iy0, 1);
            Checks.checkSafe(ix1, 1);
            Checks.checkSafe(iy1, 1);
        }
        nstbtt_GetGlyphBitmapBoxSubpixel(font.address(), glyph, scale_x, scale_y, shift_x, shift_y, ix0, iy0, ix1, iy1);
    }

    @NativeType("unsigned char *")
    public static ByteBuffer stbtt_GetGlyphSDF(@NativeType("stbtt_fontinfo const *") STBTTFontinfo font, float scale, int glyph, int padding, @NativeType("unsigned char") byte onedge_value, float pixel_dist_scale, @NativeType("int *") int[] width, @NativeType("int *") int[] height, @NativeType("int *") int[] xoff, @NativeType("int *") int[] yoff) {
        if (Checks.CHECKS) {
            Checks.check(width, 1);
            Checks.check(height, 1);
            Checks.check(xoff, 1);
            Checks.check(yoff, 1);
        }
        long __result = nstbtt_GetGlyphSDF(font.address(), scale, glyph, padding, onedge_value, pixel_dist_scale, width, height, xoff, yoff);
        return MemoryUtil.memByteBufferSafe(__result, width[0] * height[0]);
    }

    @NativeType("unsigned char *")
    public static ByteBuffer stbtt_GetCodepointSDF(@NativeType("stbtt_fontinfo const *") STBTTFontinfo font, float scale, int codepoint, int padding, @NativeType("unsigned char") byte onedge_value, float pixel_dist_scale, @NativeType("int *") int[] width, @NativeType("int *") int[] height, @NativeType("int *") int[] xoff, @NativeType("int *") int[] yoff) {
        if (Checks.CHECKS) {
            Checks.check(width, 1);
            Checks.check(height, 1);
            Checks.check(xoff, 1);
            Checks.check(yoff, 1);
        }
        long __result = nstbtt_GetCodepointSDF(font.address(), scale, codepoint, padding, onedge_value, pixel_dist_scale, width, height, xoff, yoff);
        return MemoryUtil.memByteBufferSafe(__result, width[0] * height[0]);
    }
}
