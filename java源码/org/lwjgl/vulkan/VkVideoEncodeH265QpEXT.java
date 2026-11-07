package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import javax.annotation.Nullable;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoEncodeH265QpEXT.class */
public class VkVideoEncodeH265QpEXT extends Struct<VkVideoEncodeH265QpEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int QPI;
    public static final int QPP;
    public static final int QPB;

    static {
        Struct.Layout layout = __struct(__member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        QPI = layout.offsetof(0);
        QPP = layout.offsetof(1);
        QPB = layout.offsetof(2);
    }

    protected VkVideoEncodeH265QpEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkVideoEncodeH265QpEXT create(long address, @Nullable ByteBuffer container) {
        return new VkVideoEncodeH265QpEXT(address, container);
    }

    public VkVideoEncodeH265QpEXT(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("int32_t")
    public int qpI() {
        return nqpI(address());
    }

    @NativeType("int32_t")
    public int qpP() {
        return nqpP(address());
    }

    @NativeType("int32_t")
    public int qpB() {
        return nqpB(address());
    }

    public VkVideoEncodeH265QpEXT qpI(@NativeType("int32_t") int value) {
        nqpI(address(), value);
        return this;
    }

    public VkVideoEncodeH265QpEXT qpP(@NativeType("int32_t") int value) {
        nqpP(address(), value);
        return this;
    }

    public VkVideoEncodeH265QpEXT qpB(@NativeType("int32_t") int value) {
        nqpB(address(), value);
        return this;
    }

    public VkVideoEncodeH265QpEXT set(int qpI, int qpP, int qpB) {
        qpI(qpI);
        qpP(qpP);
        qpB(qpB);
        return this;
    }

    public VkVideoEncodeH265QpEXT set(VkVideoEncodeH265QpEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkVideoEncodeH265QpEXT malloc() {
        return new VkVideoEncodeH265QpEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkVideoEncodeH265QpEXT calloc() {
        return new VkVideoEncodeH265QpEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkVideoEncodeH265QpEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkVideoEncodeH265QpEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkVideoEncodeH265QpEXT create(long address) {
        return new VkVideoEncodeH265QpEXT(address, null);
    }

    @Nullable
    public static VkVideoEncodeH265QpEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkVideoEncodeH265QpEXT(address, null);
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

    @Nullable
    public static Buffer createSafe(long address, int capacity) {
        if (address == 0) {
            return null;
        }
        return new Buffer(address, capacity);
    }

    public static VkVideoEncodeH265QpEXT malloc(MemoryStack stack) {
        return new VkVideoEncodeH265QpEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkVideoEncodeH265QpEXT calloc(MemoryStack stack) {
        return new VkVideoEncodeH265QpEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static int nqpI(long struct) {
        return UNSAFE.getInt((Object) null, struct + QPI);
    }

    public static int nqpP(long struct) {
        return UNSAFE.getInt((Object) null, struct + QPP);
    }

    public static int nqpB(long struct) {
        return UNSAFE.getInt((Object) null, struct + QPB);
    }

    public static void nqpI(long struct, int value) {
        UNSAFE.putInt((Object) null, struct + QPI, value);
    }

    public static void nqpP(long struct, int value) {
        UNSAFE.putInt((Object) null, struct + QPP, value);
    }

    public static void nqpB(long struct, int value) {
        UNSAFE.putInt((Object) null, struct + QPB, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoEncodeH265QpEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkVideoEncodeH265QpEXT, Buffer> implements NativeResource {
        private static final VkVideoEncodeH265QpEXT ELEMENT_FACTORY = VkVideoEncodeH265QpEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkVideoEncodeH265QpEXT.SIZEOF);
        }

        public Buffer(long address, int cap) {
            super(address, null, -1, 0, cap, cap);
        }

        Buffer(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            super(address, container, mark, pos, lim, cap);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.system.CustomBuffer
        public Buffer self() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.system.StructBuffer
        public VkVideoEncodeH265QpEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("int32_t")
        public int qpI() {
            return VkVideoEncodeH265QpEXT.nqpI(address());
        }

        @NativeType("int32_t")
        public int qpP() {
            return VkVideoEncodeH265QpEXT.nqpP(address());
        }

        @NativeType("int32_t")
        public int qpB() {
            return VkVideoEncodeH265QpEXT.nqpB(address());
        }

        public Buffer qpI(@NativeType("int32_t") int value) {
            VkVideoEncodeH265QpEXT.nqpI(address(), value);
            return this;
        }

        public Buffer qpP(@NativeType("int32_t") int value) {
            VkVideoEncodeH265QpEXT.nqpP(address(), value);
            return this;
        }

        public Buffer qpB(@NativeType("int32_t") int value) {
            VkVideoEncodeH265QpEXT.nqpB(address(), value);
            return this;
        }
    }
}
