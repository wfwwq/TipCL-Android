package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import java.nio.LongBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkWriteDescriptorSetTensorARM.class */
public class VkWriteDescriptorSetTensorARM extends Struct<VkWriteDescriptorSetTensorARM> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int TENSORVIEWCOUNT;
    public static final int PTENSORVIEWS;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        TENSORVIEWCOUNT = layout.offsetof(2);
        PTENSORVIEWS = layout.offsetof(3);
    }

    protected VkWriteDescriptorSetTensorARM(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkWriteDescriptorSetTensorARM create(long address, ByteBuffer container) {
        return new VkWriteDescriptorSetTensorARM(address, container);
    }

    public VkWriteDescriptorSetTensorARM(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("VkStructureType")
    public int sType() {
        return nsType(address());
    }

    @NativeType("void const *")
    public long pNext() {
        return npNext(address());
    }

    @NativeType("uint32_t")
    public int tensorViewCount() {
        return ntensorViewCount(address());
    }

    @NativeType("VkTensorViewARM const *")
    public LongBuffer pTensorViews() {
        return npTensorViews(address());
    }

    public VkWriteDescriptorSetTensorARM sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkWriteDescriptorSetTensorARM sType$Default() {
        return sType(ARMTensors.VK_STRUCTURE_TYPE_WRITE_DESCRIPTOR_SET_TENSOR_ARM);
    }

    public VkWriteDescriptorSetTensorARM pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkWriteDescriptorSetTensorARM tensorViewCount(@NativeType("uint32_t") int value) {
        ntensorViewCount(address(), value);
        return this;
    }

    public VkWriteDescriptorSetTensorARM pTensorViews(@NativeType("VkTensorViewARM const *") LongBuffer value) {
        npTensorViews(address(), value);
        return this;
    }

    public VkWriteDescriptorSetTensorARM set(int sType, long pNext, int tensorViewCount, LongBuffer pTensorViews) {
        sType(sType);
        pNext(pNext);
        tensorViewCount(tensorViewCount);
        pTensorViews(pTensorViews);
        return this;
    }

    public VkWriteDescriptorSetTensorARM set(VkWriteDescriptorSetTensorARM src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkWriteDescriptorSetTensorARM malloc() {
        return new VkWriteDescriptorSetTensorARM(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkWriteDescriptorSetTensorARM calloc() {
        return new VkWriteDescriptorSetTensorARM(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkWriteDescriptorSetTensorARM create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkWriteDescriptorSetTensorARM(MemoryUtil.memAddress(container), container);
    }

    public static VkWriteDescriptorSetTensorARM create(long address) {
        return new VkWriteDescriptorSetTensorARM(address, null);
    }

    public static VkWriteDescriptorSetTensorARM createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkWriteDescriptorSetTensorARM(address, null);
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

    public static VkWriteDescriptorSetTensorARM malloc(MemoryStack stack) {
        return new VkWriteDescriptorSetTensorARM(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkWriteDescriptorSetTensorARM calloc(MemoryStack stack) {
        return new VkWriteDescriptorSetTensorARM(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static int nsType(long struct) {
        return MemoryUtil.memGetInt(struct + STYPE);
    }

    public static long npNext(long struct) {
        return MemoryUtil.memGetAddress(struct + PNEXT);
    }

    public static int ntensorViewCount(long struct) {
        return MemoryUtil.memGetInt(struct + TENSORVIEWCOUNT);
    }

    public static LongBuffer npTensorViews(long struct) {
        return MemoryUtil.memLongBufferSafe(MemoryUtil.memGetAddress(struct + PTENSORVIEWS), ntensorViewCount(struct));
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void ntensorViewCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + TENSORVIEWCOUNT, value);
    }

    public static void npTensorViews(long struct, LongBuffer value) {
        MemoryUtil.memPutAddress(struct + PTENSORVIEWS, MemoryUtil.memAddressSafe(value));
        if (value != null) {
            ntensorViewCount(struct, value.remaining());
        }
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkWriteDescriptorSetTensorARM$Buffer.class */
    public static class Buffer extends StructBuffer<VkWriteDescriptorSetTensorARM, Buffer> implements NativeResource {
        private static final VkWriteDescriptorSetTensorARM ELEMENT_FACTORY = VkWriteDescriptorSetTensorARM.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkWriteDescriptorSetTensorARM.SIZEOF);
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
        public VkWriteDescriptorSetTensorARM getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkWriteDescriptorSetTensorARM.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkWriteDescriptorSetTensorARM.npNext(address());
        }

        @NativeType("uint32_t")
        public int tensorViewCount() {
            return VkWriteDescriptorSetTensorARM.ntensorViewCount(address());
        }

        @NativeType("VkTensorViewARM const *")
        public LongBuffer pTensorViews() {
            return VkWriteDescriptorSetTensorARM.npTensorViews(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkWriteDescriptorSetTensorARM.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(ARMTensors.VK_STRUCTURE_TYPE_WRITE_DESCRIPTOR_SET_TENSOR_ARM);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkWriteDescriptorSetTensorARM.npNext(address(), value);
            return this;
        }

        public Buffer tensorViewCount(@NativeType("uint32_t") int value) {
            VkWriteDescriptorSetTensorARM.ntensorViewCount(address(), value);
            return this;
        }

        public Buffer pTensorViews(@NativeType("VkTensorViewARM const *") LongBuffer value) {
            VkWriteDescriptorSetTensorARM.npTensorViews(address(), value);
            return this;
        }
    }
}
