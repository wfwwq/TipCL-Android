package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkTensorMemoryBarrierARM.class */
public class VkTensorMemoryBarrierARM extends Struct<VkTensorMemoryBarrierARM> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int SRCSTAGEMASK;
    public static final int SRCACCESSMASK;
    public static final int DSTSTAGEMASK;
    public static final int DSTACCESSMASK;
    public static final int SRCQUEUEFAMILYINDEX;
    public static final int DSTQUEUEFAMILYINDEX;
    public static final int TENSOR;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(8), __member(8), __member(8), __member(8), __member(4), __member(4), __member(8));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SRCSTAGEMASK = layout.offsetof(2);
        SRCACCESSMASK = layout.offsetof(3);
        DSTSTAGEMASK = layout.offsetof(4);
        DSTACCESSMASK = layout.offsetof(5);
        SRCQUEUEFAMILYINDEX = layout.offsetof(6);
        DSTQUEUEFAMILYINDEX = layout.offsetof(7);
        TENSOR = layout.offsetof(8);
    }

    protected VkTensorMemoryBarrierARM(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkTensorMemoryBarrierARM create(long address, ByteBuffer container) {
        return new VkTensorMemoryBarrierARM(address, container);
    }

    public VkTensorMemoryBarrierARM(ByteBuffer container) {
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

    @NativeType("VkPipelineStageFlags2")
    public long srcStageMask() {
        return nsrcStageMask(address());
    }

    @NativeType("VkAccessFlags2")
    public long srcAccessMask() {
        return nsrcAccessMask(address());
    }

    @NativeType("VkPipelineStageFlags2")
    public long dstStageMask() {
        return ndstStageMask(address());
    }

    @NativeType("VkAccessFlags2")
    public long dstAccessMask() {
        return ndstAccessMask(address());
    }

    @NativeType("uint32_t")
    public int srcQueueFamilyIndex() {
        return nsrcQueueFamilyIndex(address());
    }

    @NativeType("uint32_t")
    public int dstQueueFamilyIndex() {
        return ndstQueueFamilyIndex(address());
    }

    @NativeType("VkTensorARM")
    public long tensor() {
        return ntensor(address());
    }

    public VkTensorMemoryBarrierARM sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkTensorMemoryBarrierARM sType$Default() {
        return sType(ARMTensors.VK_STRUCTURE_TYPE_TENSOR_MEMORY_BARRIER_ARM);
    }

    public VkTensorMemoryBarrierARM pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkTensorMemoryBarrierARM srcStageMask(@NativeType("VkPipelineStageFlags2") long value) {
        nsrcStageMask(address(), value);
        return this;
    }

    public VkTensorMemoryBarrierARM srcAccessMask(@NativeType("VkAccessFlags2") long value) {
        nsrcAccessMask(address(), value);
        return this;
    }

    public VkTensorMemoryBarrierARM dstStageMask(@NativeType("VkPipelineStageFlags2") long value) {
        ndstStageMask(address(), value);
        return this;
    }

    public VkTensorMemoryBarrierARM dstAccessMask(@NativeType("VkAccessFlags2") long value) {
        ndstAccessMask(address(), value);
        return this;
    }

    public VkTensorMemoryBarrierARM srcQueueFamilyIndex(@NativeType("uint32_t") int value) {
        nsrcQueueFamilyIndex(address(), value);
        return this;
    }

    public VkTensorMemoryBarrierARM dstQueueFamilyIndex(@NativeType("uint32_t") int value) {
        ndstQueueFamilyIndex(address(), value);
        return this;
    }

    public VkTensorMemoryBarrierARM tensor(@NativeType("VkTensorARM") long value) {
        ntensor(address(), value);
        return this;
    }

    public VkTensorMemoryBarrierARM set(int sType, long pNext, long srcStageMask, long srcAccessMask, long dstStageMask, long dstAccessMask, int srcQueueFamilyIndex, int dstQueueFamilyIndex, long tensor) {
        sType(sType);
        pNext(pNext);
        srcStageMask(srcStageMask);
        srcAccessMask(srcAccessMask);
        dstStageMask(dstStageMask);
        dstAccessMask(dstAccessMask);
        srcQueueFamilyIndex(srcQueueFamilyIndex);
        dstQueueFamilyIndex(dstQueueFamilyIndex);
        tensor(tensor);
        return this;
    }

    public VkTensorMemoryBarrierARM set(VkTensorMemoryBarrierARM src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkTensorMemoryBarrierARM malloc() {
        return new VkTensorMemoryBarrierARM(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkTensorMemoryBarrierARM calloc() {
        return new VkTensorMemoryBarrierARM(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkTensorMemoryBarrierARM create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkTensorMemoryBarrierARM(MemoryUtil.memAddress(container), container);
    }

    public static VkTensorMemoryBarrierARM create(long address) {
        return new VkTensorMemoryBarrierARM(address, null);
    }

    public static VkTensorMemoryBarrierARM createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkTensorMemoryBarrierARM(address, null);
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

    public static VkTensorMemoryBarrierARM malloc(MemoryStack stack) {
        return new VkTensorMemoryBarrierARM(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkTensorMemoryBarrierARM calloc(MemoryStack stack) {
        return new VkTensorMemoryBarrierARM(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static long nsrcStageMask(long struct) {
        return MemoryUtil.memGetLong(struct + SRCSTAGEMASK);
    }

    public static long nsrcAccessMask(long struct) {
        return MemoryUtil.memGetLong(struct + SRCACCESSMASK);
    }

    public static long ndstStageMask(long struct) {
        return MemoryUtil.memGetLong(struct + DSTSTAGEMASK);
    }

    public static long ndstAccessMask(long struct) {
        return MemoryUtil.memGetLong(struct + DSTACCESSMASK);
    }

    public static int nsrcQueueFamilyIndex(long struct) {
        return MemoryUtil.memGetInt(struct + SRCQUEUEFAMILYINDEX);
    }

    public static int ndstQueueFamilyIndex(long struct) {
        return MemoryUtil.memGetInt(struct + DSTQUEUEFAMILYINDEX);
    }

    public static long ntensor(long struct) {
        return MemoryUtil.memGetLong(struct + TENSOR);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nsrcStageMask(long struct, long value) {
        MemoryUtil.memPutLong(struct + SRCSTAGEMASK, value);
    }

    public static void nsrcAccessMask(long struct, long value) {
        MemoryUtil.memPutLong(struct + SRCACCESSMASK, value);
    }

    public static void ndstStageMask(long struct, long value) {
        MemoryUtil.memPutLong(struct + DSTSTAGEMASK, value);
    }

    public static void ndstAccessMask(long struct, long value) {
        MemoryUtil.memPutLong(struct + DSTACCESSMASK, value);
    }

    public static void nsrcQueueFamilyIndex(long struct, int value) {
        MemoryUtil.memPutInt(struct + SRCQUEUEFAMILYINDEX, value);
    }

    public static void ndstQueueFamilyIndex(long struct, int value) {
        MemoryUtil.memPutInt(struct + DSTQUEUEFAMILYINDEX, value);
    }

    public static void ntensor(long struct, long value) {
        MemoryUtil.memPutLong(struct + TENSOR, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkTensorMemoryBarrierARM$Buffer.class */
    public static class Buffer extends StructBuffer<VkTensorMemoryBarrierARM, Buffer> implements NativeResource {
        private static final VkTensorMemoryBarrierARM ELEMENT_FACTORY = VkTensorMemoryBarrierARM.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkTensorMemoryBarrierARM.SIZEOF);
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
        public VkTensorMemoryBarrierARM getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkTensorMemoryBarrierARM.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkTensorMemoryBarrierARM.npNext(address());
        }

        @NativeType("VkPipelineStageFlags2")
        public long srcStageMask() {
            return VkTensorMemoryBarrierARM.nsrcStageMask(address());
        }

        @NativeType("VkAccessFlags2")
        public long srcAccessMask() {
            return VkTensorMemoryBarrierARM.nsrcAccessMask(address());
        }

        @NativeType("VkPipelineStageFlags2")
        public long dstStageMask() {
            return VkTensorMemoryBarrierARM.ndstStageMask(address());
        }

        @NativeType("VkAccessFlags2")
        public long dstAccessMask() {
            return VkTensorMemoryBarrierARM.ndstAccessMask(address());
        }

        @NativeType("uint32_t")
        public int srcQueueFamilyIndex() {
            return VkTensorMemoryBarrierARM.nsrcQueueFamilyIndex(address());
        }

        @NativeType("uint32_t")
        public int dstQueueFamilyIndex() {
            return VkTensorMemoryBarrierARM.ndstQueueFamilyIndex(address());
        }

        @NativeType("VkTensorARM")
        public long tensor() {
            return VkTensorMemoryBarrierARM.ntensor(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkTensorMemoryBarrierARM.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(ARMTensors.VK_STRUCTURE_TYPE_TENSOR_MEMORY_BARRIER_ARM);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkTensorMemoryBarrierARM.npNext(address(), value);
            return this;
        }

        public Buffer srcStageMask(@NativeType("VkPipelineStageFlags2") long value) {
            VkTensorMemoryBarrierARM.nsrcStageMask(address(), value);
            return this;
        }

        public Buffer srcAccessMask(@NativeType("VkAccessFlags2") long value) {
            VkTensorMemoryBarrierARM.nsrcAccessMask(address(), value);
            return this;
        }

        public Buffer dstStageMask(@NativeType("VkPipelineStageFlags2") long value) {
            VkTensorMemoryBarrierARM.ndstStageMask(address(), value);
            return this;
        }

        public Buffer dstAccessMask(@NativeType("VkAccessFlags2") long value) {
            VkTensorMemoryBarrierARM.ndstAccessMask(address(), value);
            return this;
        }

        public Buffer srcQueueFamilyIndex(@NativeType("uint32_t") int value) {
            VkTensorMemoryBarrierARM.nsrcQueueFamilyIndex(address(), value);
            return this;
        }

        public Buffer dstQueueFamilyIndex(@NativeType("uint32_t") int value) {
            VkTensorMemoryBarrierARM.ndstQueueFamilyIndex(address(), value);
            return this;
        }

        public Buffer tensor(@NativeType("VkTensorARM") long value) {
            VkTensorMemoryBarrierARM.ntensor(address(), value);
            return this;
        }
    }
}
