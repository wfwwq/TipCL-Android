package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceTileMemoryHeapPropertiesQCOM.class */
public class VkPhysicalDeviceTileMemoryHeapPropertiesQCOM extends Struct<VkPhysicalDeviceTileMemoryHeapPropertiesQCOM> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int QUEUESUBMITBOUNDARY;
    public static final int TILEBUFFERTRANSFERS;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        QUEUESUBMITBOUNDARY = layout.offsetof(2);
        TILEBUFFERTRANSFERS = layout.offsetof(3);
    }

    protected VkPhysicalDeviceTileMemoryHeapPropertiesQCOM(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceTileMemoryHeapPropertiesQCOM create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceTileMemoryHeapPropertiesQCOM(address, container);
    }

    public VkPhysicalDeviceTileMemoryHeapPropertiesQCOM(ByteBuffer container) {
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

    @NativeType("VkBool32")
    public boolean queueSubmitBoundary() {
        return nqueueSubmitBoundary(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean tileBufferTransfers() {
        return ntileBufferTransfers(address()) != 0;
    }

    public VkPhysicalDeviceTileMemoryHeapPropertiesQCOM sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceTileMemoryHeapPropertiesQCOM sType$Default() {
        return sType(QCOMTileMemoryHeap.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TILE_MEMORY_HEAP_PROPERTIES_QCOM);
    }

    public VkPhysicalDeviceTileMemoryHeapPropertiesQCOM pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceTileMemoryHeapPropertiesQCOM queueSubmitBoundary(@NativeType("VkBool32") boolean value) {
        nqueueSubmitBoundary(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceTileMemoryHeapPropertiesQCOM tileBufferTransfers(@NativeType("VkBool32") boolean value) {
        ntileBufferTransfers(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceTileMemoryHeapPropertiesQCOM set(int sType, long pNext, boolean queueSubmitBoundary, boolean tileBufferTransfers) {
        sType(sType);
        pNext(pNext);
        queueSubmitBoundary(queueSubmitBoundary);
        tileBufferTransfers(tileBufferTransfers);
        return this;
    }

    public VkPhysicalDeviceTileMemoryHeapPropertiesQCOM set(VkPhysicalDeviceTileMemoryHeapPropertiesQCOM src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceTileMemoryHeapPropertiesQCOM malloc() {
        return new VkPhysicalDeviceTileMemoryHeapPropertiesQCOM(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceTileMemoryHeapPropertiesQCOM calloc() {
        return new VkPhysicalDeviceTileMemoryHeapPropertiesQCOM(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceTileMemoryHeapPropertiesQCOM create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceTileMemoryHeapPropertiesQCOM(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceTileMemoryHeapPropertiesQCOM create(long address) {
        return new VkPhysicalDeviceTileMemoryHeapPropertiesQCOM(address, null);
    }

    public static VkPhysicalDeviceTileMemoryHeapPropertiesQCOM createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceTileMemoryHeapPropertiesQCOM(address, null);
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

    public static VkPhysicalDeviceTileMemoryHeapPropertiesQCOM malloc(MemoryStack stack) {
        return new VkPhysicalDeviceTileMemoryHeapPropertiesQCOM(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceTileMemoryHeapPropertiesQCOM calloc(MemoryStack stack) {
        return new VkPhysicalDeviceTileMemoryHeapPropertiesQCOM(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nqueueSubmitBoundary(long struct) {
        return MemoryUtil.memGetInt(struct + QUEUESUBMITBOUNDARY);
    }

    public static int ntileBufferTransfers(long struct) {
        return MemoryUtil.memGetInt(struct + TILEBUFFERTRANSFERS);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nqueueSubmitBoundary(long struct, int value) {
        MemoryUtil.memPutInt(struct + QUEUESUBMITBOUNDARY, value);
    }

    public static void ntileBufferTransfers(long struct, int value) {
        MemoryUtil.memPutInt(struct + TILEBUFFERTRANSFERS, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceTileMemoryHeapPropertiesQCOM$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceTileMemoryHeapPropertiesQCOM, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceTileMemoryHeapPropertiesQCOM ELEMENT_FACTORY = VkPhysicalDeviceTileMemoryHeapPropertiesQCOM.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceTileMemoryHeapPropertiesQCOM.SIZEOF);
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
        public VkPhysicalDeviceTileMemoryHeapPropertiesQCOM getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceTileMemoryHeapPropertiesQCOM.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceTileMemoryHeapPropertiesQCOM.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean queueSubmitBoundary() {
            return VkPhysicalDeviceTileMemoryHeapPropertiesQCOM.nqueueSubmitBoundary(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean tileBufferTransfers() {
            return VkPhysicalDeviceTileMemoryHeapPropertiesQCOM.ntileBufferTransfers(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceTileMemoryHeapPropertiesQCOM.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(QCOMTileMemoryHeap.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TILE_MEMORY_HEAP_PROPERTIES_QCOM);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceTileMemoryHeapPropertiesQCOM.npNext(address(), value);
            return this;
        }

        public Buffer queueSubmitBoundary(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceTileMemoryHeapPropertiesQCOM.nqueueSubmitBoundary(address(), value ? 1 : 0);
            return this;
        }

        public Buffer tileBufferTransfers(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceTileMemoryHeapPropertiesQCOM.ntileBufferTransfers(address(), value ? 1 : 0);
            return this;
        }
    }
}
