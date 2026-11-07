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

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoEncodeH264QpEXT.class */
public class VkVideoEncodeH264QpEXT extends Struct<VkVideoEncodeH264QpEXT> implements NativeResource {
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

    protected VkVideoEncodeH264QpEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkVideoEncodeH264QpEXT create(long address, @Nullable ByteBuffer container) {
        return new VkVideoEncodeH264QpEXT(address, container);
    }

    public VkVideoEncodeH264QpEXT(ByteBuffer container) {
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

    public VkVideoEncodeH264QpEXT qpI(@NativeType("int32_t") int value) {
        nqpI(address(), value);
        return this;
    }

    public VkVideoEncodeH264QpEXT qpP(@NativeType("int32_t") int value) {
        nqpP(address(), value);
        return this;
    }

    public VkVideoEncodeH264QpEXT qpB(@NativeType("int32_t") int value) {
        nqpB(address(), value);
        return this;
    }

    public VkVideoEncodeH264QpEXT set(int qpI, int qpP, int qpB) {
        qpI(qpI);
        qpP(qpP);
        qpB(qpB);
        return this;
    }

    public VkVideoEncodeH264QpEXT set(VkVideoEncodeH264QpEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkVideoEncodeH264QpEXT malloc() {
        return new VkVideoEncodeH264QpEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkVideoEncodeH264QpEXT calloc() {
        return new VkVideoEncodeH264QpEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkVideoEncodeH264QpEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkVideoEncodeH264QpEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkVideoEncodeH264QpEXT create(long address) {
        return new VkVideoEncodeH264QpEXT(address, null);
    }

    @Nullable
    public static VkVideoEncodeH264QpEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkVideoEncodeH264QpEXT(address, null);
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

    public static VkVideoEncodeH264QpEXT malloc(MemoryStack stack) {
        return new VkVideoEncodeH264QpEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkVideoEncodeH264QpEXT calloc(MemoryStack stack) {
        return new VkVideoEncodeH264QpEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoEncodeH264QpEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkVideoEncodeH264QpEXT, Buffer> implements NativeResource {
        private static final VkVideoEncodeH264QpEXT ELEMENT_FACTORY = VkVideoEncodeH264QpEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkVideoEncodeH264QpEXT.SIZEOF);
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
        public VkVideoEncodeH264QpEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("int32_t")
        public int qpI() {
            return VkVideoEncodeH264QpEXT.nqpI(address());
        }

        @NativeType("int32_t")
        public int qpP() {
            return VkVideoEncodeH264QpEXT.nqpP(address());
        }

        @NativeType("int32_t")
        public int qpB() {
            return VkVideoEncodeH264QpEXT.nqpB(address());
        }

        public Buffer qpI(@NativeType("int32_t") int value) {
            VkVideoEncodeH264QpEXT.nqpI(address(), value);
            return this;
        }

        public Buffer qpP(@NativeType("int32_t") int value) {
            VkVideoEncodeH264QpEXT.nqpP(address(), value);
            return this;
        }

        public Buffer qpB(@NativeType("int32_t") int value) {
            VkVideoEncodeH264QpEXT.nqpB(address(), value);
            return this;
        }
    }
}
