package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.Checks;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkTensorDependencyInfoARM.class */
public class VkTensorDependencyInfoARM extends Struct<VkTensorDependencyInfoARM> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int TENSORMEMORYBARRIERCOUNT;
    public static final int PTENSORMEMORYBARRIERS;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        TENSORMEMORYBARRIERCOUNT = layout.offsetof(2);
        PTENSORMEMORYBARRIERS = layout.offsetof(3);
    }

    protected VkTensorDependencyInfoARM(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkTensorDependencyInfoARM create(long address, ByteBuffer container) {
        return new VkTensorDependencyInfoARM(address, container);
    }

    public VkTensorDependencyInfoARM(ByteBuffer container) {
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
    public int tensorMemoryBarrierCount() {
        return ntensorMemoryBarrierCount(address());
    }

    @NativeType("VkTensorMemoryBarrierARM const *")
    public VkTensorMemoryBarrierARM pTensorMemoryBarriers() {
        return npTensorMemoryBarriers(address());
    }

    public VkTensorDependencyInfoARM sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkTensorDependencyInfoARM sType$Default() {
        return sType(ARMTensors.VK_STRUCTURE_TYPE_TENSOR_DEPENDENCY_INFO_ARM);
    }

    public VkTensorDependencyInfoARM pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkTensorDependencyInfoARM tensorMemoryBarrierCount(@NativeType("uint32_t") int value) {
        ntensorMemoryBarrierCount(address(), value);
        return this;
    }

    public VkTensorDependencyInfoARM pTensorMemoryBarriers(@NativeType("VkTensorMemoryBarrierARM const *") VkTensorMemoryBarrierARM value) {
        npTensorMemoryBarriers(address(), value);
        return this;
    }

    public VkTensorDependencyInfoARM set(int sType, long pNext, int tensorMemoryBarrierCount, VkTensorMemoryBarrierARM pTensorMemoryBarriers) {
        sType(sType);
        pNext(pNext);
        tensorMemoryBarrierCount(tensorMemoryBarrierCount);
        pTensorMemoryBarriers(pTensorMemoryBarriers);
        return this;
    }

    public VkTensorDependencyInfoARM set(VkTensorDependencyInfoARM src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkTensorDependencyInfoARM malloc() {
        return new VkTensorDependencyInfoARM(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkTensorDependencyInfoARM calloc() {
        return new VkTensorDependencyInfoARM(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkTensorDependencyInfoARM create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkTensorDependencyInfoARM(MemoryUtil.memAddress(container), container);
    }

    public static VkTensorDependencyInfoARM create(long address) {
        return new VkTensorDependencyInfoARM(address, null);
    }

    public static VkTensorDependencyInfoARM createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkTensorDependencyInfoARM(address, null);
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

    public static VkTensorDependencyInfoARM malloc(MemoryStack stack) {
        return new VkTensorDependencyInfoARM(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkTensorDependencyInfoARM calloc(MemoryStack stack) {
        return new VkTensorDependencyInfoARM(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int ntensorMemoryBarrierCount(long struct) {
        return MemoryUtil.memGetInt(struct + TENSORMEMORYBARRIERCOUNT);
    }

    public static VkTensorMemoryBarrierARM npTensorMemoryBarriers(long struct) {
        return VkTensorMemoryBarrierARM.create(MemoryUtil.memGetAddress(struct + PTENSORMEMORYBARRIERS));
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void ntensorMemoryBarrierCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + TENSORMEMORYBARRIERCOUNT, value);
    }

    public static void npTensorMemoryBarriers(long struct, VkTensorMemoryBarrierARM value) {
        MemoryUtil.memPutAddress(struct + PTENSORMEMORYBARRIERS, value.address());
    }

    public static void validate(long struct) {
        Checks.check(MemoryUtil.memGetAddress(struct + PTENSORMEMORYBARRIERS));
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkTensorDependencyInfoARM$Buffer.class */
    public static class Buffer extends StructBuffer<VkTensorDependencyInfoARM, Buffer> implements NativeResource {
        private static final VkTensorDependencyInfoARM ELEMENT_FACTORY = VkTensorDependencyInfoARM.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkTensorDependencyInfoARM.SIZEOF);
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
        public VkTensorDependencyInfoARM getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkTensorDependencyInfoARM.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkTensorDependencyInfoARM.npNext(address());
        }

        @NativeType("uint32_t")
        public int tensorMemoryBarrierCount() {
            return VkTensorDependencyInfoARM.ntensorMemoryBarrierCount(address());
        }

        @NativeType("VkTensorMemoryBarrierARM const *")
        public VkTensorMemoryBarrierARM pTensorMemoryBarriers() {
            return VkTensorDependencyInfoARM.npTensorMemoryBarriers(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkTensorDependencyInfoARM.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(ARMTensors.VK_STRUCTURE_TYPE_TENSOR_DEPENDENCY_INFO_ARM);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkTensorDependencyInfoARM.npNext(address(), value);
            return this;
        }

        public Buffer tensorMemoryBarrierCount(@NativeType("uint32_t") int value) {
            VkTensorDependencyInfoARM.ntensorMemoryBarrierCount(address(), value);
            return this;
        }

        public Buffer pTensorMemoryBarriers(@NativeType("VkTensorMemoryBarrierARM const *") VkTensorMemoryBarrierARM value) {
            VkTensorDependencyInfoARM.npTensorMemoryBarriers(address(), value);
            return this;
        }
    }
}
