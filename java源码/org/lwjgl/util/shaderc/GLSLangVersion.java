package org.lwjgl.util.shaderc;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

@NativeType("struct glslang_version_t")
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-shaderc.jar:org/lwjgl/util/shaderc/GLSLangVersion.class */
public class GLSLangVersion extends Struct<GLSLangVersion> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int MAJOR;
    public static final int MINOR;
    public static final int PATCH;
    public static final int FLAVOR;

    static {
        Struct.Layout layout = __struct(__member(4), __member(4), __member(4), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        MAJOR = layout.offsetof(0);
        MINOR = layout.offsetof(1);
        PATCH = layout.offsetof(2);
        FLAVOR = layout.offsetof(3);
    }

    protected GLSLangVersion(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public GLSLangVersion create(long address, ByteBuffer container) {
        return new GLSLangVersion(address, container);
    }

    public GLSLangVersion(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    public int major() {
        return nmajor(address());
    }

    public int minor() {
        return nminor(address());
    }

    public int patch() {
        return npatch(address());
    }

    @NativeType("char const *")
    public ByteBuffer flavor() {
        return nflavor(address());
    }

    @NativeType("char const *")
    public String flavorString() {
        return nflavorString(address());
    }

    public static GLSLangVersion malloc() {
        return new GLSLangVersion(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static GLSLangVersion calloc() {
        return new GLSLangVersion(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static GLSLangVersion create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new GLSLangVersion(MemoryUtil.memAddress(container), container);
    }

    public static GLSLangVersion create(long address) {
        return new GLSLangVersion(address, null);
    }

    public static GLSLangVersion createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new GLSLangVersion(address, null);
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

    public static GLSLangVersion malloc(MemoryStack stack) {
        return new GLSLangVersion(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static GLSLangVersion calloc(MemoryStack stack) {
        return new GLSLangVersion(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static int nmajor(long struct) {
        return MemoryUtil.memGetInt(struct + MAJOR);
    }

    public static int nminor(long struct) {
        return MemoryUtil.memGetInt(struct + MINOR);
    }

    public static int npatch(long struct) {
        return MemoryUtil.memGetInt(struct + PATCH);
    }

    public static ByteBuffer nflavor(long struct) {
        return MemoryUtil.memByteBufferNT1(MemoryUtil.memGetAddress(struct + FLAVOR));
    }

    public static String nflavorString(long struct) {
        return MemoryUtil.memASCII(MemoryUtil.memGetAddress(struct + FLAVOR));
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-shaderc.jar:org/lwjgl/util/shaderc/GLSLangVersion$Buffer.class */
    public static class Buffer extends StructBuffer<GLSLangVersion, Buffer> implements NativeResource {
        private static final GLSLangVersion ELEMENT_FACTORY = GLSLangVersion.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / GLSLangVersion.SIZEOF);
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
        public GLSLangVersion getElementFactory() {
            return ELEMENT_FACTORY;
        }

        public int major() {
            return GLSLangVersion.nmajor(address());
        }

        public int minor() {
            return GLSLangVersion.nminor(address());
        }

        public int patch() {
            return GLSLangVersion.npatch(address());
        }

        @NativeType("char const *")
        public ByteBuffer flavor() {
            return GLSLangVersion.nflavor(address());
        }

        @NativeType("char const *")
        public String flavorString() {
            return GLSLangVersion.nflavorString(address());
        }
    }
}
