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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-3.3.3-merged-modules.jar:org/lwjgl/opengl/EXTMemoryObject.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/opengl/EXTMemoryObject.class */
public class EXTMemoryObject {
    public static final int GL_TEXTURE_TILING_EXT = 38272;
    public static final int GL_DEDICATED_MEMORY_OBJECT_EXT = 38273;
    public static final int GL_NUM_TILING_TYPES_EXT = 38274;
    public static final int GL_TILING_TYPES_EXT = 38275;
    public static final int GL_OPTIMAL_TILING_EXT = 38276;
    public static final int GL_LINEAR_TILING_EXT = 38277;
    public static final int GL_NUM_DEVICE_UUIDS_EXT = 38294;
    public static final int GL_DEVICE_UUID_EXT = 38295;
    public static final int GL_DRIVER_UUID_EXT = 38296;
    public static final int GL_UUID_SIZE_EXT = 16;

    public static native void nglGetUnsignedBytevEXT(int i, long j);

    public static native void nglGetUnsignedBytei_vEXT(int i, int i2, long j);

    public static native void nglDeleteMemoryObjectsEXT(int i, long j);

    @NativeType("GLboolean")
    public static native boolean glIsMemoryObjectEXT(@NativeType("GLuint") int i);

    public static native void nglCreateMemoryObjectsEXT(int i, long j);

    public static native void nglMemoryObjectParameterivEXT(int i, int i2, long j);

    public static native void nglGetMemoryObjectParameterivEXT(int i, int i2, long j);

    public static native void glTexStorageMem2DEXT(@NativeType("GLenum") int i, @NativeType("GLsizei") int i2, @NativeType("GLenum") int i3, @NativeType("GLsizei") int i4, @NativeType("GLsizei") int i5, @NativeType("GLuint") int i6, @NativeType("GLuint64") long j);

    public static native void glTexStorageMem2DMultisampleEXT(@NativeType("GLenum") int i, @NativeType("GLsizei") int i2, @NativeType("GLenum") int i3, @NativeType("GLsizei") int i4, @NativeType("GLsizei") int i5, @NativeType("GLboolean") boolean z, @NativeType("GLuint") int i6, @NativeType("GLuint64") long j);

    public static native void glTexStorageMem3DEXT(@NativeType("GLenum") int i, @NativeType("GLsizei") int i2, @NativeType("GLenum") int i3, @NativeType("GLsizei") int i4, @NativeType("GLsizei") int i5, @NativeType("GLsizei") int i6, @NativeType("GLuint") int i7, @NativeType("GLuint64") long j);

    public static native void glTexStorageMem3DMultisampleEXT(@NativeType("GLenum") int i, @NativeType("GLsizei") int i2, @NativeType("GLenum") int i3, @NativeType("GLsizei") int i4, @NativeType("GLsizei") int i5, @NativeType("GLsizei") int i6, @NativeType("GLboolean") boolean z, @NativeType("GLuint") int i7, @NativeType("GLuint64") long j);

    public static native void glBufferStorageMemEXT(@NativeType("GLenum") int i, @NativeType("GLsizeiptr") long j, @NativeType("GLuint") int i2, @NativeType("GLuint64") long j2);

    public static native void glTextureStorageMem2DEXT(@NativeType("GLuint") int i, @NativeType("GLsizei") int i2, @NativeType("GLenum") int i3, @NativeType("GLsizei") int i4, @NativeType("GLsizei") int i5, @NativeType("GLuint") int i6, @NativeType("GLuint64") long j);

    public static native void glTextureStorageMem2DMultisampleEXT(@NativeType("GLuint") int i, @NativeType("GLsizei") int i2, @NativeType("GLenum") int i3, @NativeType("GLsizei") int i4, @NativeType("GLsizei") int i5, @NativeType("GLboolean") boolean z, @NativeType("GLuint") int i6, @NativeType("GLuint64") long j);

    public static native void glTextureStorageMem3DEXT(@NativeType("GLuint") int i, @NativeType("GLsizei") int i2, @NativeType("GLenum") int i3, @NativeType("GLsizei") int i4, @NativeType("GLsizei") int i5, @NativeType("GLsizei") int i6, @NativeType("GLuint") int i7, @NativeType("GLuint64") long j);

    public static native void glTextureStorageMem3DMultisampleEXT(@NativeType("GLuint") int i, @NativeType("GLsizei") int i2, @NativeType("GLenum") int i3, @NativeType("GLsizei") int i4, @NativeType("GLsizei") int i5, @NativeType("GLsizei") int i6, @NativeType("GLboolean") boolean z, @NativeType("GLuint") int i7, @NativeType("GLuint64") long j);

    public static native void glNamedBufferStorageMemEXT(@NativeType("GLuint") int i, @NativeType("GLsizeiptr") long j, @NativeType("GLuint") int i2, @NativeType("GLuint64") long j2);

    public static native void glTexStorageMem1DEXT(@NativeType("GLenum") int i, @NativeType("GLsizei") int i2, @NativeType("GLenum") int i3, @NativeType("GLsizei") int i4, @NativeType("GLuint") int i5, @NativeType("GLuint64") long j);

    public static native void glTextureStorageMem1DEXT(@NativeType("GLuint") int i, @NativeType("GLsizei") int i2, @NativeType("GLenum") int i3, @NativeType("GLsizei") int i4, @NativeType("GLuint") int i5, @NativeType("GLuint64") long j);

    static {
        GL.initialize();
    }

    protected EXTMemoryObject() {
        throw new UnsupportedOperationException();
    }

    public static void glGetUnsignedBytevEXT(@NativeType("GLenum") int pname, @NativeType("GLubyte *") ByteBuffer data) {
        nglGetUnsignedBytevEXT(pname, MemoryUtil.memAddress(data));
    }

    public static void glGetUnsignedBytei_vEXT(@NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLubyte *") ByteBuffer data) {
        nglGetUnsignedBytei_vEXT(target, index, MemoryUtil.memAddress(data));
    }

    public static void glDeleteMemoryObjectsEXT(@NativeType("GLuint const *") IntBuffer memoryObjects) {
        nglDeleteMemoryObjectsEXT(memoryObjects.remaining(), MemoryUtil.memAddress(memoryObjects));
    }

    public static void glDeleteMemoryObjectsEXT(@NativeType("GLuint const *") int memoryObject) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            IntBuffer memoryObjects = stack.ints(memoryObject);
            nglDeleteMemoryObjectsEXT(1, MemoryUtil.memAddress(memoryObjects));
            stack.setPointer(stackPointer);
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static void glCreateMemoryObjectsEXT(@NativeType("GLuint *") IntBuffer memoryObjects) {
        nglCreateMemoryObjectsEXT(memoryObjects.remaining(), MemoryUtil.memAddress(memoryObjects));
    }

    @NativeType("void")
    public static int glCreateMemoryObjectsEXT() {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            IntBuffer memoryObjects = stack.callocInt(1);
            nglCreateMemoryObjectsEXT(1, MemoryUtil.memAddress(memoryObjects));
            int i = memoryObjects.get(0);
            stack.setPointer(stackPointer);
            return i;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static void glMemoryObjectParameterivEXT(@NativeType("GLuint") int memoryObject, @NativeType("GLenum") int pname, @NativeType("GLint const *") IntBuffer params) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) params, 1);
        }
        nglMemoryObjectParameterivEXT(memoryObject, pname, MemoryUtil.memAddress(params));
    }

    public static void glMemoryObjectParameteriEXT(@NativeType("GLuint") int memoryObject, @NativeType("GLenum") int pname, @NativeType("GLint const *") int param) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.ints(param);
            nglMemoryObjectParameterivEXT(memoryObject, pname, MemoryUtil.memAddress(params));
            stack.setPointer(stackPointer);
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static void glGetMemoryObjectParameterivEXT(@NativeType("GLuint") int memoryObject, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) params, 1);
        }
        nglGetMemoryObjectParameterivEXT(memoryObject, pname, MemoryUtil.memAddress(params));
    }

    @NativeType("void")
    public static int glGetMemoryObjectParameteriEXT(@NativeType("GLuint") int memoryObject, @NativeType("GLenum") int pname) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.callocInt(1);
            nglGetMemoryObjectParameterivEXT(memoryObject, pname, MemoryUtil.memAddress(params));
            int i = params.get(0);
            stack.setPointer(stackPointer);
            return i;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static void glDeleteMemoryObjectsEXT(@NativeType("GLuint const *") int[] memoryObjects) {
        long __functionAddress = GL.getICD().glDeleteMemoryObjectsEXT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPV(memoryObjects.length, memoryObjects, __functionAddress);
    }

    public static void glCreateMemoryObjectsEXT(@NativeType("GLuint *") int[] memoryObjects) {
        long __functionAddress = GL.getICD().glCreateMemoryObjectsEXT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
        }
        JNI.callPV(memoryObjects.length, memoryObjects, __functionAddress);
    }

    public static void glMemoryObjectParameterivEXT(@NativeType("GLuint") int memoryObject, @NativeType("GLenum") int pname, @NativeType("GLint const *") int[] params) {
        long __functionAddress = GL.getICD().glMemoryObjectParameterivEXT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(params, 1);
        }
        JNI.callPV(memoryObject, pname, params, __functionAddress);
    }

    public static void glGetMemoryObjectParameterivEXT(@NativeType("GLuint") int memoryObject, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        long __functionAddress = GL.getICD().glGetMemoryObjectParameterivEXT;
        if (Checks.CHECKS) {
            Checks.check(__functionAddress);
            Checks.check(params, 1);
        }
        JNI.callPV(memoryObject, pname, params, __functionAddress);
    }
}
