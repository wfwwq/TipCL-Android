package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceExternalComputeQueuePropertiesNV.class */
public class VkPhysicalDeviceExternalComputeQueuePropertiesNV extends Struct<VkPhysicalDeviceExternalComputeQueuePropertiesNV> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int EXTERNALDATASIZE;
    public static final int MAXEXTERNALQUEUES;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        EXTERNALDATASIZE = layout.offsetof(2);
        MAXEXTERNALQUEUES = layout.offsetof(3);
    }

    protected VkPhysicalDeviceExternalComputeQueuePropertiesNV(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceExternalComputeQueuePropertiesNV create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceExternalComputeQueuePropertiesNV(address, container);
    }

    public VkPhysicalDeviceExternalComputeQueuePropertiesNV(ByteBuffer container) {
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

    @NativeType("void *")
    public long pNext() {
        return npNext(address());
    }

    @NativeType("uint32_t")
    public int externalDataSize() {
        return nexternalDataSize(address());
    }

    @NativeType("uint32_t")
    public int maxExternalQueues() {
        return nmaxExternalQueues(address());
    }

    public VkPhysicalDeviceExternalComputeQueuePropertiesNV sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceExternalComputeQueuePropertiesNV sType$Default() {
        return sType(NVExternalComputeQueue.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_COMPUTE_QUEUE_PROPERTIES_NV);
    }

    public VkPhysicalDeviceExternalComputeQueuePropertiesNV pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceExternalComputeQueuePropertiesNV set(int sType, long pNext) {
        sType(sType);
        pNext(pNext);
        return this;
    }

    public VkPhysicalDeviceExternalComputeQueuePropertiesNV set(VkPhysicalDeviceExternalComputeQueuePropertiesNV src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceExternalComputeQueuePropertiesNV malloc() {
        return new VkPhysicalDeviceExternalComputeQueuePropertiesNV(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceExternalComputeQueuePropertiesNV calloc() {
        return new VkPhysicalDeviceExternalComputeQueuePropertiesNV(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceExternalComputeQueuePropertiesNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceExternalComputeQueuePropertiesNV(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceExternalComputeQueuePropertiesNV create(long address) {
        return new VkPhysicalDeviceExternalComputeQueuePropertiesNV(address, null);
    }

    public static VkPhysicalDeviceExternalComputeQueuePropertiesNV createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceExternalComputeQueuePropertiesNV(address, null);
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

    public static VkPhysicalDeviceExternalComputeQueuePropertiesNV malloc(MemoryStack stack) {
        return new VkPhysicalDeviceExternalComputeQueuePropertiesNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceExternalComputeQueuePropertiesNV calloc(MemoryStack stack) {
        return new VkPhysicalDeviceExternalComputeQueuePropertiesNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nexternalDataSize(long struct) {
        return MemoryUtil.memGetInt(struct + EXTERNALDATASIZE);
    }

    public static int nmaxExternalQueues(long struct) {
        return MemoryUtil.memGetInt(struct + MAXEXTERNALQUEUES);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceExternalComputeQueuePropertiesNV$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceExternalComputeQueuePropertiesNV, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceExternalComputeQueuePropertiesNV ELEMENT_FACTORY = VkPhysicalDeviceExternalComputeQueuePropertiesNV.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceExternalComputeQueuePropertiesNV.SIZEOF);
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
        public VkPhysicalDeviceExternalComputeQueuePropertiesNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceExternalComputeQueuePropertiesNV.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceExternalComputeQueuePropertiesNV.npNext(address());
        }

        @NativeType("uint32_t")
        public int externalDataSize() {
            return VkPhysicalDeviceExternalComputeQueuePropertiesNV.nexternalDataSize(address());
        }

        @NativeType("uint32_t")
        public int maxExternalQueues() {
            return VkPhysicalDeviceExternalComputeQueuePropertiesNV.nmaxExternalQueues(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceExternalComputeQueuePropertiesNV.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(NVExternalComputeQueue.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_COMPUTE_QUEUE_PROPERTIES_NV);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceExternalComputeQueuePropertiesNV.npNext(address(), value);
            return this;
        }
    }
}
