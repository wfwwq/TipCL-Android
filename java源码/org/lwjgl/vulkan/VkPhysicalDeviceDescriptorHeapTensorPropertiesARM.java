package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceDescriptorHeapTensorPropertiesARM.class */
public class VkPhysicalDeviceDescriptorHeapTensorPropertiesARM extends Struct<VkPhysicalDeviceDescriptorHeapTensorPropertiesARM> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int TENSORDESCRIPTORSIZE;
    public static final int TENSORDESCRIPTORALIGNMENT;
    public static final int TENSORCAPTUREREPLAYOPAQUEDATASIZE;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(8), __member(8), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        TENSORDESCRIPTORSIZE = layout.offsetof(2);
        TENSORDESCRIPTORALIGNMENT = layout.offsetof(3);
        TENSORCAPTUREREPLAYOPAQUEDATASIZE = layout.offsetof(4);
    }

    protected VkPhysicalDeviceDescriptorHeapTensorPropertiesARM(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceDescriptorHeapTensorPropertiesARM create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceDescriptorHeapTensorPropertiesARM(address, container);
    }

    public VkPhysicalDeviceDescriptorHeapTensorPropertiesARM(ByteBuffer container) {
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

    @NativeType("VkDeviceSize")
    public long tensorDescriptorSize() {
        return ntensorDescriptorSize(address());
    }

    @NativeType("VkDeviceSize")
    public long tensorDescriptorAlignment() {
        return ntensorDescriptorAlignment(address());
    }

    @NativeType("size_t")
    public long tensorCaptureReplayOpaqueDataSize() {
        return ntensorCaptureReplayOpaqueDataSize(address());
    }

    public VkPhysicalDeviceDescriptorHeapTensorPropertiesARM sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceDescriptorHeapTensorPropertiesARM sType$Default() {
        return sType(EXTDescriptorHeap.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_HEAP_TENSOR_PROPERTIES_ARM);
    }

    public VkPhysicalDeviceDescriptorHeapTensorPropertiesARM pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceDescriptorHeapTensorPropertiesARM set(int sType, long pNext) {
        sType(sType);
        pNext(pNext);
        return this;
    }

    public VkPhysicalDeviceDescriptorHeapTensorPropertiesARM set(VkPhysicalDeviceDescriptorHeapTensorPropertiesARM src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceDescriptorHeapTensorPropertiesARM malloc() {
        return new VkPhysicalDeviceDescriptorHeapTensorPropertiesARM(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceDescriptorHeapTensorPropertiesARM calloc() {
        return new VkPhysicalDeviceDescriptorHeapTensorPropertiesARM(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceDescriptorHeapTensorPropertiesARM create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceDescriptorHeapTensorPropertiesARM(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceDescriptorHeapTensorPropertiesARM create(long address) {
        return new VkPhysicalDeviceDescriptorHeapTensorPropertiesARM(address, null);
    }

    public static VkPhysicalDeviceDescriptorHeapTensorPropertiesARM createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceDescriptorHeapTensorPropertiesARM(address, null);
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

    public static VkPhysicalDeviceDescriptorHeapTensorPropertiesARM malloc(MemoryStack stack) {
        return new VkPhysicalDeviceDescriptorHeapTensorPropertiesARM(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceDescriptorHeapTensorPropertiesARM calloc(MemoryStack stack) {
        return new VkPhysicalDeviceDescriptorHeapTensorPropertiesARM(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static long ntensorDescriptorSize(long struct) {
        return MemoryUtil.memGetLong(struct + TENSORDESCRIPTORSIZE);
    }

    public static long ntensorDescriptorAlignment(long struct) {
        return MemoryUtil.memGetLong(struct + TENSORDESCRIPTORALIGNMENT);
    }

    public static long ntensorCaptureReplayOpaqueDataSize(long struct) {
        return MemoryUtil.memGetAddress(struct + TENSORCAPTUREREPLAYOPAQUEDATASIZE);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceDescriptorHeapTensorPropertiesARM$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceDescriptorHeapTensorPropertiesARM, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceDescriptorHeapTensorPropertiesARM ELEMENT_FACTORY = VkPhysicalDeviceDescriptorHeapTensorPropertiesARM.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceDescriptorHeapTensorPropertiesARM.SIZEOF);
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
        public VkPhysicalDeviceDescriptorHeapTensorPropertiesARM getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceDescriptorHeapTensorPropertiesARM.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceDescriptorHeapTensorPropertiesARM.npNext(address());
        }

        @NativeType("VkDeviceSize")
        public long tensorDescriptorSize() {
            return VkPhysicalDeviceDescriptorHeapTensorPropertiesARM.ntensorDescriptorSize(address());
        }

        @NativeType("VkDeviceSize")
        public long tensorDescriptorAlignment() {
            return VkPhysicalDeviceDescriptorHeapTensorPropertiesARM.ntensorDescriptorAlignment(address());
        }

        @NativeType("size_t")
        public long tensorCaptureReplayOpaqueDataSize() {
            return VkPhysicalDeviceDescriptorHeapTensorPropertiesARM.ntensorCaptureReplayOpaqueDataSize(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceDescriptorHeapTensorPropertiesARM.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(EXTDescriptorHeap.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_HEAP_TENSOR_PROPERTIES_ARM);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceDescriptorHeapTensorPropertiesARM.npNext(address(), value);
            return this;
        }
    }
}
