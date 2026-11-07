package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkComputeOccupancyPriorityParametersNV.class */
public class VkComputeOccupancyPriorityParametersNV extends Struct<VkComputeOccupancyPriorityParametersNV> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int OCCUPANCYPRIORITY;
    public static final int OCCUPANCYTHROTTLING;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        OCCUPANCYPRIORITY = layout.offsetof(2);
        OCCUPANCYTHROTTLING = layout.offsetof(3);
    }

    protected VkComputeOccupancyPriorityParametersNV(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkComputeOccupancyPriorityParametersNV create(long address, ByteBuffer container) {
        return new VkComputeOccupancyPriorityParametersNV(address, container);
    }

    public VkComputeOccupancyPriorityParametersNV(ByteBuffer container) {
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

    public float occupancyPriority() {
        return noccupancyPriority(address());
    }

    public float occupancyThrottling() {
        return noccupancyThrottling(address());
    }

    public VkComputeOccupancyPriorityParametersNV sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkComputeOccupancyPriorityParametersNV sType$Default() {
        return sType(NVComputeOccupancyPriority.VK_STRUCTURE_TYPE_COMPUTE_OCCUPANCY_PRIORITY_PARAMETERS_NV);
    }

    public VkComputeOccupancyPriorityParametersNV pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkComputeOccupancyPriorityParametersNV occupancyPriority(float value) {
        noccupancyPriority(address(), value);
        return this;
    }

    public VkComputeOccupancyPriorityParametersNV occupancyThrottling(float value) {
        noccupancyThrottling(address(), value);
        return this;
    }

    public VkComputeOccupancyPriorityParametersNV set(int sType, long pNext, float occupancyPriority, float occupancyThrottling) {
        sType(sType);
        pNext(pNext);
        occupancyPriority(occupancyPriority);
        occupancyThrottling(occupancyThrottling);
        return this;
    }

    public VkComputeOccupancyPriorityParametersNV set(VkComputeOccupancyPriorityParametersNV src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkComputeOccupancyPriorityParametersNV malloc() {
        return new VkComputeOccupancyPriorityParametersNV(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkComputeOccupancyPriorityParametersNV calloc() {
        return new VkComputeOccupancyPriorityParametersNV(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkComputeOccupancyPriorityParametersNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkComputeOccupancyPriorityParametersNV(MemoryUtil.memAddress(container), container);
    }

    public static VkComputeOccupancyPriorityParametersNV create(long address) {
        return new VkComputeOccupancyPriorityParametersNV(address, null);
    }

    public static VkComputeOccupancyPriorityParametersNV createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkComputeOccupancyPriorityParametersNV(address, null);
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

    public static VkComputeOccupancyPriorityParametersNV malloc(MemoryStack stack) {
        return new VkComputeOccupancyPriorityParametersNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkComputeOccupancyPriorityParametersNV calloc(MemoryStack stack) {
        return new VkComputeOccupancyPriorityParametersNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static float noccupancyPriority(long struct) {
        return MemoryUtil.memGetFloat(struct + OCCUPANCYPRIORITY);
    }

    public static float noccupancyThrottling(long struct) {
        return MemoryUtil.memGetFloat(struct + OCCUPANCYTHROTTLING);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void noccupancyPriority(long struct, float value) {
        MemoryUtil.memPutFloat(struct + OCCUPANCYPRIORITY, value);
    }

    public static void noccupancyThrottling(long struct, float value) {
        MemoryUtil.memPutFloat(struct + OCCUPANCYTHROTTLING, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkComputeOccupancyPriorityParametersNV$Buffer.class */
    public static class Buffer extends StructBuffer<VkComputeOccupancyPriorityParametersNV, Buffer> implements NativeResource {
        private static final VkComputeOccupancyPriorityParametersNV ELEMENT_FACTORY = VkComputeOccupancyPriorityParametersNV.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkComputeOccupancyPriorityParametersNV.SIZEOF);
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
        public VkComputeOccupancyPriorityParametersNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkComputeOccupancyPriorityParametersNV.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkComputeOccupancyPriorityParametersNV.npNext(address());
        }

        public float occupancyPriority() {
            return VkComputeOccupancyPriorityParametersNV.noccupancyPriority(address());
        }

        public float occupancyThrottling() {
            return VkComputeOccupancyPriorityParametersNV.noccupancyThrottling(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkComputeOccupancyPriorityParametersNV.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(NVComputeOccupancyPriority.VK_STRUCTURE_TYPE_COMPUTE_OCCUPANCY_PRIORITY_PARAMETERS_NV);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkComputeOccupancyPriorityParametersNV.npNext(address(), value);
            return this;
        }

        public Buffer occupancyPriority(float value) {
            VkComputeOccupancyPriorityParametersNV.noccupancyPriority(address(), value);
            return this;
        }

        public Buffer occupancyThrottling(float value) {
            VkComputeOccupancyPriorityParametersNV.noccupancyThrottling(address(), value);
            return this;
        }
    }
}
