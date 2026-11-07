package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM.class */
public class VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM extends Struct<VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int QUEUEFAMILYINDEX;
    public static final int ENGINETYPE;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        QUEUEFAMILYINDEX = layout.offsetof(2);
        ENGINETYPE = layout.offsetof(3);
    }

    protected VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM(address, container);
    }

    public VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM(ByteBuffer container) {
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
    public int queueFamilyIndex() {
        return nqueueFamilyIndex(address());
    }

    @NativeType("VkPhysicalDeviceDataGraphProcessingEngineTypeARM")
    public int engineType() {
        return nengineType(address());
    }

    public VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM sType$Default() {
        return sType(ARMDataGraph.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_QUEUE_FAMILY_DATA_GRAPH_PROCESSING_ENGINE_INFO_ARM);
    }

    public VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM queueFamilyIndex(@NativeType("uint32_t") int value) {
        nqueueFamilyIndex(address(), value);
        return this;
    }

    public VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM engineType(@NativeType("VkPhysicalDeviceDataGraphProcessingEngineTypeARM") int value) {
        nengineType(address(), value);
        return this;
    }

    public VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM set(int sType, long pNext, int queueFamilyIndex, int engineType) {
        sType(sType);
        pNext(pNext);
        queueFamilyIndex(queueFamilyIndex);
        engineType(engineType);
        return this;
    }

    public VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM set(VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM malloc() {
        return new VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM calloc() {
        return new VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM create(long address) {
        return new VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM(address, null);
    }

    public static VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM(address, null);
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

    public static VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM malloc(MemoryStack stack) {
        return new VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM calloc(MemoryStack stack) {
        return new VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nqueueFamilyIndex(long struct) {
        return MemoryUtil.memGetInt(struct + QUEUEFAMILYINDEX);
    }

    public static int nengineType(long struct) {
        return MemoryUtil.memGetInt(struct + ENGINETYPE);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nqueueFamilyIndex(long struct, int value) {
        MemoryUtil.memPutInt(struct + QUEUEFAMILYINDEX, value);
    }

    public static void nengineType(long struct, int value) {
        MemoryUtil.memPutInt(struct + ENGINETYPE, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM ELEMENT_FACTORY = VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM.SIZEOF);
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
        public VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM.npNext(address());
        }

        @NativeType("uint32_t")
        public int queueFamilyIndex() {
            return VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM.nqueueFamilyIndex(address());
        }

        @NativeType("VkPhysicalDeviceDataGraphProcessingEngineTypeARM")
        public int engineType() {
            return VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM.nengineType(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(ARMDataGraph.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_QUEUE_FAMILY_DATA_GRAPH_PROCESSING_ENGINE_INFO_ARM);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM.npNext(address(), value);
            return this;
        }

        public Buffer queueFamilyIndex(@NativeType("uint32_t") int value) {
            VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM.nqueueFamilyIndex(address(), value);
            return this;
        }

        public Buffer engineType(@NativeType("VkPhysicalDeviceDataGraphProcessingEngineTypeARM") int value) {
            VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM.nengineType(address(), value);
            return this;
        }
    }
}
