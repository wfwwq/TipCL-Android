package org.lwjgl.opengl;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import org.lwjgl.system.Checks;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-3.3.3-merged-modules.jar:org/lwjgl/opengl/ARBGLSPIRV.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/opengl/ARBGLSPIRV.class */
public class ARBGLSPIRV {
    public static final int GL_SHADER_BINARY_FORMAT_SPIR_V_ARB = 38225;
    public static final int GL_SPIR_V_BINARY_ARB = 38226;

    public static native void nglSpecializeShaderARB(int i, long j, int i2, long j2, long j3);

    static {
        GL.initialize();
    }

    protected ARBGLSPIRV() {
        throw new UnsupportedOperationException();
    }

    public static void glSpecializeShaderARB(@NativeType("GLuint") int shader, @NativeType("GLchar const *") ByteBuffer pEntryPoint, @NativeType("GLuint const *") IntBuffer pConstantIndex, @NativeType("GLuint const *") IntBuffer pConstantValue) {
        if (Checks.CHECKS) {
            Checks.checkNT1(pEntryPoint);
            Checks.check((Buffer) pConstantValue, pConstantIndex.remaining());
        }
        nglSpecializeShaderARB(shader, MemoryUtil.memAddress(pEntryPoint), pConstantIndex.remaining(), MemoryUtil.memAddress(pConstantIndex), MemoryUtil.memAddress(pConstantValue));
    }

    public static void glSpecializeShaderARB(@NativeType("GLuint") int shader, @NativeType("GLchar const *") CharSequence pEntryPoint, @NativeType("GLuint const *") IntBuffer pConstantIndex, @NativeType("GLuint const *") IntBuffer pConstantValue) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) pConstantValue, pConstantIndex.remaining());
        }
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(pEntryPoint, true);
            long pEntryPointEncoded = stack.getPointerAddress();
            nglSpecializeShaderARB(shader, pEntryPointEncoded, pConstantIndex.remaining(), MemoryUtil.memAddress(pConstantIndex), MemoryUtil.memAddress(pConstantValue));
            stack.setPointer(stackPointer);
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static void glSpecializeShaderARB(@NativeType("GLuint") int shader, @NativeType("GLchar const *") ByteBuffer pEntryPoint, @NativeType("GLuint const *") int[] pConstantIndex, @NativeType("GLuint const *") int[] pConstantValue) {
        long __functionAddress = GL.getICD().glSpecializeShaderARB;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.checkNT1(pEntryPoint);
            Checks.check(pConstantValue, pConstantIndex.length);
        }
        JNI.callPPPV(shader, MemoryUtil.memAddress(pEntryPoint), pConstantIndex.length, pConstantIndex, pConstantValue, __functionAddress);
    }

    public static void glSpecializeShaderARB(@NativeType("GLuint") int shader, @NativeType("GLchar const *") CharSequence pEntryPoint, @NativeType("GLuint const *") int[] pConstantIndex, @NativeType("GLuint const *") int[] pConstantValue) {
        long __functionAddress = GL.getICD().glSpecializeShaderARB;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(pConstantValue, pConstantIndex.length);
        }
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(pEntryPoint, true);
            long pEntryPointEncoded = stack.getPointerAddress();
            JNI.callPPPV(shader, pEntryPointEncoded, pConstantIndex.length, pConstantIndex, pConstantValue, __functionAddress);
            stack.setPointer(stackPointer);
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }
}
