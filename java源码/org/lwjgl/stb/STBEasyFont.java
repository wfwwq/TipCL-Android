package org.lwjgl.stb;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import org.lwjgl.system.Checks;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-stb.jar:org/lwjgl/stb/STBEasyFont.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-stb.jar:org/lwjgl/stb/STBEasyFont.class */
public class STBEasyFont {
    public static native int nstb_easy_font_width(long j);

    public static native int nstb_easy_font_height(long j);

    public static native int nstb_easy_font_print(float f, float f2, long j, long j2, long j3, int i);

    public static native void stb_easy_font_spacing(float f);

    static {
        LibSTB.initialize();
    }

    protected STBEasyFont() {
        throw new UnsupportedOperationException();
    }

    public static int stb_easy_font_width(@NativeType("char *") ByteBuffer text) {
        if (Checks.CHECKS) {
            Checks.checkNT1(text);
        }
        return nstb_easy_font_width(MemoryUtil.memAddress(text));
    }

    public static int stb_easy_font_width(@NativeType("char *") CharSequence text) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nASCII(text, true);
            long textEncoded = stack.getPointerAddress();
            int iNstb_easy_font_width = nstb_easy_font_width(textEncoded);
            stack.setPointer(stackPointer);
            return iNstb_easy_font_width;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static int stb_easy_font_height(@NativeType("char *") ByteBuffer text) {
        if (Checks.CHECKS) {
            Checks.checkNT1(text);
        }
        return nstb_easy_font_height(MemoryUtil.memAddress(text));
    }

    public static int stb_easy_font_height(@NativeType("char *") CharSequence text) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nASCII(text, true);
            long textEncoded = stack.getPointerAddress();
            int iNstb_easy_font_height = nstb_easy_font_height(textEncoded);
            stack.setPointer(stackPointer);
            return iNstb_easy_font_height;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static int stb_easy_font_print(float x, float y, @NativeType("char *") ByteBuffer text, @NativeType("unsigned char *") ByteBuffer color, @NativeType("void *") ByteBuffer vertex_buffer) {
        if (Checks.CHECKS) {
            Checks.checkNT1(text);
            Checks.checkSafe((Buffer) color, 4);
        }
        return nstb_easy_font_print(x, y, MemoryUtil.memAddress(text), MemoryUtil.memAddressSafe(color), MemoryUtil.memAddress(vertex_buffer), vertex_buffer.remaining());
    }

    public static int stb_easy_font_print(float x, float y, @NativeType("char *") CharSequence text, @NativeType("unsigned char *") ByteBuffer color, @NativeType("void *") ByteBuffer vertex_buffer) {
        if (Checks.CHECKS) {
            Checks.checkSafe((Buffer) color, 4);
        }
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nASCII(text, true);
            long textEncoded = stack.getPointerAddress();
            int iNstb_easy_font_print = nstb_easy_font_print(x, y, textEncoded, MemoryUtil.memAddressSafe(color), MemoryUtil.memAddress(vertex_buffer), vertex_buffer.remaining());
            stack.setPointer(stackPointer);
            return iNstb_easy_font_print;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }
}
