package org.lwjgl.util.shaderc;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

@NativeType("struct spv_binary_t")
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-shaderc.jar:org/lwjgl/util/shaderc/SPVBinary.class */
public class SPVBinary extends Struct<SPVBinary> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int CODE;
    public static final int WORDCOUNT;

    static {
        Struct.Layout layout = __struct(__member(POINTER_SIZE), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        CODE = layout.offsetof(0);
        WORDCOUNT = layout.offsetof(1);
    }

    protected SPVBinary(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public SPVBinary create(long address, ByteBuffer container) {
        return new SPVBinary(address, container);
    }

    public SPVBinary(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("uint32_t *")
    public IntBuffer code() {
        return ncode(address());
    }

    @NativeType("size_t")
    public long wordCount() {
        return nwordCount(address());
    }

    public static SPVBinary malloc() {
        return new SPVBinary(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static SPVBinary calloc() {
        return new SPVBinary(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static SPVBinary create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SPVBinary(MemoryUtil.memAddress(container), container);
    }

    public static SPVBinary create(long address) {
        return new SPVBinary(address, null);
    }

    public static SPVBinary createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new SPVBinary(address, null);
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

    public static SPVBinary malloc(MemoryStack stack) {
        return new SPVBinary(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static SPVBinary calloc(MemoryStack stack) {
        return new SPVBinary(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static IntBuffer ncode(long struct) {
        return MemoryUtil.memIntBuffer(MemoryUtil.memGetAddress(struct + CODE), (int) nwordCount(struct));
    }

    public static long nwordCount(long struct) {
        return MemoryUtil.memGetAddress(struct + WORDCOUNT);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-shaderc.jar:org/lwjgl/util/shaderc/SPVBinary$Buffer.class */
    public static class Buffer extends StructBuffer<SPVBinary, Buffer> implements NativeResource {
        private static final SPVBinary ELEMENT_FACTORY = SPVBinary.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SPVBinary.SIZEOF);
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
        public SPVBinary getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("uint32_t *")
        public IntBuffer code() {
            return SPVBinary.ncode(address());
        }

        @NativeType("size_t")
        public long wordCount() {
            return SPVBinary.nwordCount(address());
        }
    }
}
