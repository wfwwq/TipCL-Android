package org.lwjgl.util.shaderc;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

@NativeType("struct glsl_include_callbacks_t")
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-shaderc.jar:org/lwjgl/util/shaderc/GLSLIncludeCallbacks.class */
public class GLSLIncludeCallbacks extends Struct<GLSLIncludeCallbacks> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int INCLUDE_SYSTEM;
    public static final int INCLUDE_LOCAL;
    public static final int FREE_INCLUDE_RESULT;

    static {
        Struct.Layout layout = __struct(__member(POINTER_SIZE), __member(POINTER_SIZE), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        INCLUDE_SYSTEM = layout.offsetof(0);
        INCLUDE_LOCAL = layout.offsetof(1);
        FREE_INCLUDE_RESULT = layout.offsetof(2);
    }

    protected GLSLIncludeCallbacks(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public GLSLIncludeCallbacks create(long address, ByteBuffer container) {
        return new GLSLIncludeCallbacks(address, container);
    }

    public GLSLIncludeCallbacks(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("glsl_include_system_func")
    public GLSLIncludeSystemFunc include_system() {
        return ninclude_system(address());
    }

    @NativeType("glsl_include_local_func")
    public GLSLIncludeLocalFunc include_local() {
        return ninclude_local(address());
    }

    @NativeType("glsl_free_include_result_func")
    public GLSLFreeIncludeResultFunc free_include_result() {
        return nfree_include_result(address());
    }

    public GLSLIncludeCallbacks include_system(@NativeType("glsl_include_system_func") GLSLIncludeSystemFuncI value) {
        ninclude_system(address(), value);
        return this;
    }

    public GLSLIncludeCallbacks include_local(@NativeType("glsl_include_local_func") GLSLIncludeLocalFuncI value) {
        ninclude_local(address(), value);
        return this;
    }

    public GLSLIncludeCallbacks free_include_result(@NativeType("glsl_free_include_result_func") GLSLFreeIncludeResultFuncI value) {
        nfree_include_result(address(), value);
        return this;
    }

    public GLSLIncludeCallbacks set(GLSLIncludeSystemFuncI include_system, GLSLIncludeLocalFuncI include_local, GLSLFreeIncludeResultFuncI free_include_result) {
        include_system(include_system);
        include_local(include_local);
        free_include_result(free_include_result);
        return this;
    }

    public GLSLIncludeCallbacks set(GLSLIncludeCallbacks src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static GLSLIncludeCallbacks malloc() {
        return new GLSLIncludeCallbacks(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static GLSLIncludeCallbacks calloc() {
        return new GLSLIncludeCallbacks(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static GLSLIncludeCallbacks create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new GLSLIncludeCallbacks(MemoryUtil.memAddress(container), container);
    }

    public static GLSLIncludeCallbacks create(long address) {
        return new GLSLIncludeCallbacks(address, null);
    }

    public static GLSLIncludeCallbacks createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new GLSLIncludeCallbacks(address, null);
    }

    public static Buffer malloc(int capacity) {
        return new Buffer(MemoryUtil.nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    public static Buffer calloc(int capacity) {
        return new Buffer(MemoryUtil.nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    public static Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(MemoryUtil.memAddress(container), container, -1, 0, capacity, capacity);
    }

    public static Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    public static Buffer createSafe(long address, int capacity) {
        if (address == 0) {
            return null;
        }
        return new Buffer(address, capacity);
    }

    public static GLSLIncludeCallbacks malloc(MemoryStack stack) {
        return new GLSLIncludeCallbacks(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static GLSLIncludeCallbacks calloc(MemoryStack stack) {
        return new GLSLIncludeCallbacks(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static GLSLIncludeSystemFunc ninclude_system(long struct) {
        return GLSLIncludeSystemFunc.createSafe(MemoryUtil.memGetAddress(struct + INCLUDE_SYSTEM));
    }

    public static GLSLIncludeLocalFunc ninclude_local(long struct) {
        return GLSLIncludeLocalFunc.createSafe(MemoryUtil.memGetAddress(struct + INCLUDE_LOCAL));
    }

    public static GLSLFreeIncludeResultFunc nfree_include_result(long struct) {
        return GLSLFreeIncludeResultFunc.createSafe(MemoryUtil.memGetAddress(struct + FREE_INCLUDE_RESULT));
    }

    public static void ninclude_system(long struct, GLSLIncludeSystemFuncI value) {
        MemoryUtil.memPutAddress(struct + INCLUDE_SYSTEM, MemoryUtil.memAddressSafe(value));
    }

    public static void ninclude_local(long struct, GLSLIncludeLocalFuncI value) {
        MemoryUtil.memPutAddress(struct + INCLUDE_LOCAL, MemoryUtil.memAddressSafe(value));
    }

    public static void nfree_include_result(long struct, GLSLFreeIncludeResultFuncI value) {
        MemoryUtil.memPutAddress(struct + FREE_INCLUDE_RESULT, MemoryUtil.memAddressSafe(value));
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-shaderc.jar:org/lwjgl/util/shaderc/GLSLIncludeCallbacks$Buffer.class */
    public static class Buffer extends StructBuffer<GLSLIncludeCallbacks, Buffer> implements NativeResource {
        private static final GLSLIncludeCallbacks ELEMENT_FACTORY = GLSLIncludeCallbacks.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / GLSLIncludeCallbacks.SIZEOF);
        }

        public Buffer(long address, int cap) {
            super(address, null, -1, 0, cap, cap);
        }

        Buffer(long address, ByteBuffer container, int mark, int pos, int lim, int cap) {
            super(address, container, mark, pos, lim, cap);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.system.CustomBuffer
        public Buffer self() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.system.CustomBuffer
        public Buffer create(long address, ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.system.StructBuffer
        public GLSLIncludeCallbacks getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("glsl_include_system_func")
        public GLSLIncludeSystemFunc include_system() {
            return GLSLIncludeCallbacks.ninclude_system(address());
        }

        @NativeType("glsl_include_local_func")
        public GLSLIncludeLocalFunc include_local() {
            return GLSLIncludeCallbacks.ninclude_local(address());
        }

        @NativeType("glsl_free_include_result_func")
        public GLSLFreeIncludeResultFunc free_include_result() {
            return GLSLIncludeCallbacks.nfree_include_result(address());
        }

        public Buffer include_system(@NativeType("glsl_include_system_func") GLSLIncludeSystemFuncI value) {
            GLSLIncludeCallbacks.ninclude_system(address(), value);
            return this;
        }

        public Buffer include_local(@NativeType("glsl_include_local_func") GLSLIncludeLocalFuncI value) {
            GLSLIncludeCallbacks.ninclude_local(address(), value);
            return this;
        }

        public Buffer free_include_result(@NativeType("glsl_free_include_result_func") GLSLFreeIncludeResultFuncI value) {
            GLSLIncludeCallbacks.nfree_include_result(address(), value);
            return this;
        }
    }
}
