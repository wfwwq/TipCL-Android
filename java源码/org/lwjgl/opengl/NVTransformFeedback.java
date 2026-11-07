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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-3.3.3-merged-modules.jar:org/lwjgl/opengl/NVTransformFeedback.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/opengl/NVTransformFeedback.class */
public class NVTransformFeedback {
    public static final int GL_TRANSFORM_FEEDBACK_BUFFER_NV = 35982;
    public static final int GL_TRANSFORM_FEEDBACK_BUFFER_START_NV = 35972;
    public static final int GL_TRANSFORM_FEEDBACK_BUFFER_SIZE_NV = 35973;
    public static final int GL_TRANSFORM_FEEDBACK_RECORD_NV = 35974;
    public static final int GL_TRANSFORM_FEEDBACK_BUFFER_BINDING_NV = 35983;
    public static final int GL_INTERLEAVED_ATTRIBS_NV = 35980;
    public static final int GL_SEPARATE_ATTRIBS_NV = 35981;
    public static final int GL_PRIMITIVES_GENERATED_NV = 35975;
    public static final int GL_TRANSFORM_FEEDBACK_PRIMITIVES_WRITTEN_NV = 35976;
    public static final int GL_RASTERIZER_DISCARD_NV = 35977;
    public static final int GL_MAX_TRANSFORM_FEEDBACK_INTERLEAVED_COMPONENTS_NV = 35978;
    public static final int GL_MAX_TRANSFORM_FEEDBACK_SEPARATE_ATTRIBS_NV = 35979;
    public static final int GL_MAX_TRANSFORM_FEEDBACK_SEPARATE_COMPONENTS_NV = 35968;
    public static final int GL_TRANSFORM_FEEDBACK_ATTRIBS_NV = 35966;
    public static final int GL_ACTIVE_VARYINGS_NV = 35969;
    public static final int GL_ACTIVE_VARYING_MAX_LENGTH_NV = 35970;
    public static final int GL_TRANSFORM_FEEDBACK_VARYINGS_NV = 35971;
    public static final int GL_TRANSFORM_FEEDBACK_BUFFER_MODE_NV = 35967;
    public static final int GL_BACK_PRIMARY_COLOR_NV = 35959;
    public static final int GL_BACK_SECONDARY_COLOR_NV = 35960;
    public static final int GL_TEXTURE_COORD_NV = 35961;
    public static final int GL_CLIP_DISTANCE_NV = 35962;
    public static final int GL_VERTEX_ID_NV = 35963;
    public static final int GL_PRIMITIVE_ID_NV = 35964;
    public static final int GL_GENERIC_ATTRIB_NV = 35965;
    public static final int GL_SECONDARY_COLOR_NV = 34093;
    public static final int GL_LAYER_NV = 36266;

    public static native void glBeginTransformFeedbackNV(@NativeType("GLenum") int i);

    public static native void glEndTransformFeedbackNV();

    public static native void nglTransformFeedbackAttribsNV(int i, long j, int i2);

    public static native void glBindBufferRangeNV(@NativeType("GLenum") int i, @NativeType("GLuint") int i2, @NativeType("GLuint") int i3, @NativeType("GLintptr") long j, @NativeType("GLsizeiptr") long j2);

    public static native void glBindBufferOffsetNV(@NativeType("GLenum") int i, @NativeType("GLuint") int i2, @NativeType("GLuint") int i3, @NativeType("GLintptr") long j);

    public static native void glBindBufferBaseNV(@NativeType("GLenum") int i, @NativeType("GLuint") int i2, @NativeType("GLuint") int i3);

    public static native void nglTransformFeedbackVaryingsNV(int i, int i2, long j, int i3);

    public static native void nglActiveVaryingNV(int i, long j);

    public static native int nglGetVaryingLocationNV(int i, long j);

    public static native void nglGetActiveVaryingNV(int i, int i2, int i3, long j, long j2, long j3, long j4);

    public static native void nglGetTransformFeedbackVaryingNV(int i, int i2, long j);

    public static native void nglTransformFeedbackStreamAttribsNV(int i, long j, int i2, long j2, int i3);

    static {
        GL.initialize();
    }

    protected NVTransformFeedback() {
        throw new UnsupportedOperationException();
    }

    public static void glTransformFeedbackAttribsNV(@NativeType("GLint const *") IntBuffer attribs, @NativeType("GLenum") int bufferMode) {
        nglTransformFeedbackAttribsNV(attribs.remaining(), MemoryUtil.memAddress(attribs), bufferMode);
    }

    public static void glTransformFeedbackVaryingsNV(@NativeType("GLuint") int program, @NativeType("GLint const *") IntBuffer locations, @NativeType("GLenum") int bufferMode) {
        nglTransformFeedbackVaryingsNV(program, locations.remaining(), MemoryUtil.memAddress(locations), bufferMode);
    }

    public static void glActiveVaryingNV(@NativeType("GLuint") int program, @NativeType("GLchar const *") ByteBuffer name) {
        if (Checks.CHECKS) {
            Checks.checkNT1(name);
        }
        nglActiveVaryingNV(program, MemoryUtil.memAddress(name));
    }

    public static void glActiveVaryingNV(@NativeType("GLuint") int program, @NativeType("GLchar const *") CharSequence name) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nASCII(name, true);
            long nameEncoded = stack.getPointerAddress();
            nglActiveVaryingNV(program, nameEncoded);
            stack.setPointer(stackPointer);
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    @NativeType("GLint")
    public static int glGetVaryingLocationNV(@NativeType("GLuint") int program, @NativeType("GLchar const *") ByteBuffer name) {
        if (Checks.CHECKS) {
            Checks.checkNT1(name);
        }
        return nglGetVaryingLocationNV(program, MemoryUtil.memAddress(name));
    }

    @NativeType("GLint")
    public static int glGetVaryingLocationNV(@NativeType("GLuint") int program, @NativeType("GLchar const *") CharSequence name) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nASCII(name, true);
            long nameEncoded = stack.getPointerAddress();
            int iNglGetVaryingLocationNV = nglGetVaryingLocationNV(program, nameEncoded);
            stack.setPointer(stackPointer);
            return iNglGetVaryingLocationNV;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static void glGetActiveVaryingNV(@NativeType("GLuint") int program, @NativeType("GLuint") int index, @NativeType("GLsizei *") IntBuffer length, @NativeType("GLsizei *") IntBuffer size, @NativeType("GLenum *") IntBuffer type, @NativeType("GLchar *") ByteBuffer name) {
        if (Checks.CHECKS) {
            Checks.checkSafe((Buffer) length, 1);
            Checks.check((Buffer) size, 1);
            Checks.check((Buffer) type, 1);
        }
        nglGetActiveVaryingNV(program, index, name.remaining(), MemoryUtil.memAddressSafe(length), MemoryUtil.memAddress(size), MemoryUtil.memAddress(type), MemoryUtil.memAddress(name));
    }

    public static void glGetTransformFeedbackVaryingNV(@NativeType("GLuint") int program, @NativeType("GLuint") int index, @NativeType("GLint *") IntBuffer location) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) location, 1);
        }
        nglGetTransformFeedbackVaryingNV(program, index, MemoryUtil.memAddress(location));
    }

    @NativeType("void")
    public static int glGetTransformFeedbackVaryingNV(@NativeType("GLuint") int program, @NativeType("GLuint") int index) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            IntBuffer location = stack.callocInt(1);
            nglGetTransformFeedbackVaryingNV(program, index, MemoryUtil.memAddress(location));
            int i = location.get(0);
            stack.setPointer(stackPointer);
            return i;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static void glTransformFeedbackStreamAttribsNV(@NativeType("GLint const *") IntBuffer attribs, @NativeType("GLint const *") IntBuffer bufstreams, @NativeType("GLenum") int bufferMode) {
        nglTransformFeedbackStreamAttribsNV(attribs.remaining(), MemoryUtil.memAddress(attribs), bufstreams.remaining(), MemoryUtil.memAddress(bufstreams), bufferMode);
    }

    public static void glTransformFeedbackAttribsNV(@NativeType("GLint const *") int[] attribs, @NativeType("GLenum") int bufferMode) {
        long __functionAddress = GL.getICD().glTransformFeedbackAttribsNV;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPV(attribs.length, attribs, bufferMode, __functionAddress);
    }

    public static void glTransformFeedbackVaryingsNV(@NativeType("GLuint") int program, @NativeType("GLint const *") int[] locations, @NativeType("GLenum") int bufferMode) {
        long __functionAddress = GL.getICD().glTransformFeedbackVaryingsNV;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPV(program, locations.length, locations, bufferMode, __functionAddress);
    }

    public static void glGetActiveVaryingNV(@NativeType("GLuint") int program, @NativeType("GLuint") int index, @NativeType("GLsizei *") int[] length, @NativeType("GLsizei *") int[] size, @NativeType("GLenum *") int[] type, @NativeType("GLchar *") ByteBuffer name) {
        long __functionAddress = GL.getICD().glGetActiveVaryingNV;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.checkSafe(length, 1);
            Checks.check(size, 1);
            Checks.check(type, 1);
        }
        JNI.callPPPPV(program, index, name.remaining(), length, size, type, MemoryUtil.memAddress(name), __functionAddress);
    }

    public static void glGetTransformFeedbackVaryingNV(@NativeType("GLuint") int program, @NativeType("GLuint") int index, @NativeType("GLint *") int[] location) {
        long __functionAddress = GL.getICD().glGetTransformFeedbackVaryingNV;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(location, 1);
        }
        JNI.callPV(program, index, location, __functionAddress);
    }

    public static void glTransformFeedbackStreamAttribsNV(@NativeType("GLint const *") int[] attribs, @NativeType("GLint const *") int[] bufstreams, @NativeType("GLenum") int bufferMode) {
        long __functionAddress = GL.getICD().glTransformFeedbackStreamAttribsNV;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPPV(attribs.length, attribs, bufstreams.length, bufstreams, bufferMode, __functionAddress);
    }
}
