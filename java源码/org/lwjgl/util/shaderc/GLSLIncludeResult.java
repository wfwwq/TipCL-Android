package org.lwjgl.util.shaderc;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.Checks;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

@NativeType("struct glsl_include_result_t")
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-shaderc.jar:org/lwjgl/util/shaderc/GLSLIncludeResult.class */
public class GLSLIncludeResult extends Struct<GLSLIncludeResult> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int HEADER_NAME;
    public static final int HEADER_DATA;
    public static final int HEADER_LENGTH;

    static {
        Struct.Layout layout = __struct(__member(POINTER_SIZE), __member(POINTER_SIZE), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        HEADER_NAME = layout.offsetof(0);
        HEADER_DATA = layout.offsetof(1);
        HEADER_LENGTH = layout.offsetof(2);
    }

    protected GLSLIncludeResult(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public GLSLIncludeResult create(long address, ByteBuffer container) {
        return new GLSLIncludeResult(address, container);
    }

    public GLSLIncludeResult(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("char const *")
    public ByteBuffer header_name() {
        return nheader_name(address());
    }

    @NativeType("char const *")
    public String header_nameString() {
        return nheader_nameString(address());
    }

    @NativeType("char const *")
    public ByteBuffer header_data() {
        return nheader_data(address());
    }

    @NativeType("size_t")
    public long header_length() {
        return nheader_length(address());
    }

    public GLSLIncludeResult header_name(@NativeType("char const *") ByteBuffer value) {
        nheader_name(address(), value);
        return this;
    }

    public GLSLIncludeResult header_data(@NativeType("char const *") ByteBuffer value) {
        nheader_data(address(), value);
        return this;
    }

    public GLSLIncludeResult header_length(@NativeType("size_t") long value) {
        nheader_length(address(), value);
        return this;
    }

    public GLSLIncludeResult set(ByteBuffer header_name, ByteBuffer header_data, long header_length) {
        header_name(header_name);
        header_data(header_data);
        header_length(header_length);
        return this;
    }

    public GLSLIncludeResult set(GLSLIncludeResult src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static GLSLIncludeResult malloc() {
        return new GLSLIncludeResult(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static GLSLIncludeResult calloc() {
        return new GLSLIncludeResult(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static GLSLIncludeResult create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new GLSLIncludeResult(MemoryUtil.memAddress(container), container);
    }

    public static GLSLIncludeResult create(long address) {
        return new GLSLIncludeResult(address, null);
    }

    public static GLSLIncludeResult createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new GLSLIncludeResult(address, null);
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

    public static GLSLIncludeResult malloc(MemoryStack stack) {
        return new GLSLIncludeResult(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static GLSLIncludeResult calloc(MemoryStack stack) {
        return new GLSLIncludeResult(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static ByteBuffer nheader_name(long struct) {
        return MemoryUtil.memByteBufferNT1Safe(MemoryUtil.memGetAddress(struct + HEADER_NAME));
    }

    public static String nheader_nameString(long struct) {
        return MemoryUtil.memUTF8Safe(MemoryUtil.memGetAddress(struct + HEADER_NAME));
    }

    public static ByteBuffer nheader_data(long struct) {
        return MemoryUtil.memByteBufferSafe(MemoryUtil.memGetAddress(struct + HEADER_DATA), (int) nheader_length(struct));
    }

    public static long nheader_length(long struct) {
        return MemoryUtil.memGetAddress(struct + HEADER_LENGTH);
    }

    public static void nheader_name(long struct, ByteBuffer value) {
        if (Checks.CHECKS) {
            Checks.checkNT1Safe(value);
        }
        MemoryUtil.memPutAddress(struct + HEADER_NAME, MemoryUtil.memAddressSafe(value));
    }

    public static void nheader_data(long struct, ByteBuffer value) {
        MemoryUtil.memPutAddress(struct + HEADER_DATA, MemoryUtil.memAddressSafe(value));
        nheader_length(struct, value == null ? 0L : value.remaining());
    }

    public static void nheader_length(long struct, long value) {
        MemoryUtil.memPutAddress(struct + HEADER_LENGTH, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-shaderc.jar:org/lwjgl/util/shaderc/GLSLIncludeResult$Buffer.class */
    public static class Buffer extends StructBuffer<GLSLIncludeResult, Buffer> implements NativeResource {
        private static final GLSLIncludeResult ELEMENT_FACTORY = GLSLIncludeResult.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / GLSLIncludeResult.SIZEOF);
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
        public GLSLIncludeResult getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("char const *")
        public ByteBuffer header_name() {
            return GLSLIncludeResult.nheader_name(address());
        }

        @NativeType("char const *")
        public String header_nameString() {
            return GLSLIncludeResult.nheader_nameString(address());
        }

        @NativeType("char const *")
        public ByteBuffer header_data() {
            return GLSLIncludeResult.nheader_data(address());
        }

        @NativeType("size_t")
        public long header_length() {
            return GLSLIncludeResult.nheader_length(address());
        }

        public Buffer header_name(@NativeType("char const *") ByteBuffer value) {
            GLSLIncludeResult.nheader_name(address(), value);
            return this;
        }

        public Buffer header_data(@NativeType("char const *") ByteBuffer value) {
            GLSLIncludeResult.nheader_data(address(), value);
            return this;
        }

        public Buffer header_length(@NativeType("size_t") long value) {
            GLSLIncludeResult.nheader_length(address(), value);
            return this;
        }
    }
}
