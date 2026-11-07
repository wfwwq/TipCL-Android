package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceDescriptorBufferTensorPropertiesARM.class */
public class VkPhysicalDeviceDescriptorBufferTensorPropertiesARM extends Struct<VkPhysicalDeviceDescriptorBufferTensorPropertiesARM> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int TENSORCAPTUREREPLAYDESCRIPTORDATASIZE;
    public static final int TENSORVIEWCAPTUREREPLAYDESCRIPTORDATASIZE;
    public static final int TENSORDESCRIPTORSIZE;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        TENSORCAPTUREREPLAYDESCRIPTORDATASIZE = layout.offsetof(2);
        TENSORVIEWCAPTUREREPLAYDESCRIPTORDATASIZE = layout.offsetof(3);
        TENSORDESCRIPTORSIZE = layout.offsetof(4);
    }

    protected VkPhysicalDeviceDescriptorBufferTensorPropertiesARM(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceDescriptorBufferTensorPropertiesARM create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceDescriptorBufferTensorPropertiesARM(address, container);
    }

    public VkPhysicalDeviceDescriptorBufferTensorPropertiesARM(ByteBuffer container) {
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

    @NativeType("size_t")
    public long tensorCaptureReplayDescriptorDataSize() {
        return ntensorCaptureReplayDescriptorDataSize(address());
    }

    @NativeType("size_t")
    public long tensorViewCaptureReplayDescriptorDataSize() {
        return ntensorViewCaptureReplayDescriptorDataSize(address());
    }

    @NativeType("size_t")
    public long tensorDescriptorSize() {
        return ntensorDescriptorSize(address());
    }

    public VkPhysicalDeviceDescriptorBufferTensorPropertiesARM sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceDescriptorBufferTensorPropertiesARM sType$Default() {
        return sType(ARMTensors.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_BUFFER_TENSOR_PROPERTIES_ARM);
    }

    public VkPhysicalDeviceDescriptorBufferTensorPropertiesARM pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceDescriptorBufferTensorPropertiesARM tensorCaptureReplayDescriptorDataSize(@NativeType("size_t") long value) {
        ntensorCaptureReplayDescriptorDataSize(address(), value);
        return this;
    }

    public VkPhysicalDeviceDescriptorBufferTensorPropertiesARM tensorViewCaptureReplayDescriptorDataSize(@NativeType("size_t") long value) {
        ntensorViewCaptureReplayDescriptorDataSize(address(), value);
        return this;
    }

    public VkPhysicalDeviceDescriptorBufferTensorPropertiesARM tensorDescriptorSize(@NativeType("size_t") long value) {
        ntensorDescriptorSize(address(), value);
        return this;
    }

    public VkPhysicalDeviceDescriptorBufferTensorPropertiesARM set(int sType, long pNext, long tensorCaptureReplayDescriptorDataSize, long tensorViewCaptureReplayDescriptorDataSize, long tensorDescriptorSize) {
        sType(sType);
        pNext(pNext);
        tensorCaptureReplayDescriptorDataSize(tensorCaptureReplayDescriptorDataSize);
        tensorViewCaptureReplayDescriptorDataSize(tensorViewCaptureReplayDescriptorDataSize);
        tensorDescriptorSize(tensorDescriptorSize);
        return this;
    }

    public VkPhysicalDeviceDescriptorBufferTensorPropertiesARM set(VkPhysicalDeviceDescriptorBufferTensorPropertiesARM src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceDescriptorBufferTensorPropertiesARM malloc() {
        return new VkPhysicalDeviceDescriptorBufferTensorPropertiesARM(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceDescriptorBufferTensorPropertiesARM calloc() {
        return new VkPhysicalDeviceDescriptorBufferTensorPropertiesARM(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceDescriptorBufferTensorPropertiesARM create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceDescriptorBufferTensorPropertiesARM(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceDescriptorBufferTensorPropertiesARM create(long address) {
        return new VkPhysicalDeviceDescriptorBufferTensorPropertiesARM(address, null);
    }

    public static VkPhysicalDeviceDescriptorBufferTensorPropertiesARM createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceDescriptorBufferTensorPropertiesARM(address, null);
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

    public static VkPhysicalDeviceDescriptorBufferTensorPropertiesARM malloc(MemoryStack stack) {
        return new VkPhysicalDeviceDescriptorBufferTensorPropertiesARM(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceDescriptorBufferTensorPropertiesARM calloc(MemoryStack stack) {
        return new VkPhysicalDeviceDescriptorBufferTensorPropertiesARM(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static long ntensorCaptureReplayDescriptorDataSize(long struct) {
        return MemoryUtil.memGetAddress(struct + TENSORCAPTUREREPLAYDESCRIPTORDATASIZE);
    }

    public static long ntensorViewCaptureReplayDescriptorDataSize(long struct) {
        return MemoryUtil.memGetAddress(struct + TENSORVIEWCAPTUREREPLAYDESCRIPTORDATASIZE);
    }

    public static long ntensorDescriptorSize(long struct) {
        return MemoryUtil.memGetAddress(struct + TENSORDESCRIPTORSIZE);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void ntensorCaptureReplayDescriptorDataSize(long struct, long value) {
        MemoryUtil.memPutAddress(struct + TENSORCAPTUREREPLAYDESCRIPTORDATASIZE, value);
    }

    public static void ntensorViewCaptureReplayDescriptorDataSize(long struct, long value) {
        MemoryUtil.memPutAddress(struct + TENSORVIEWCAPTUREREPLAYDESCRIPTORDATASIZE, value);
    }

    public static void ntensorDescriptorSize(long struct, long value) {
        MemoryUtil.memPutAddress(struct + TENSORDESCRIPTORSIZE, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceDescriptorBufferTensorPropertiesARM$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceDescriptorBufferTensorPropertiesARM, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceDescriptorBufferTensorPropertiesARM ELEMENT_FACTORY = VkPhysicalDeviceDescriptorBufferTensorPropertiesARM.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceDescriptorBufferTensorPropertiesARM.SIZEOF);
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
        public VkPhysicalDeviceDescriptorBufferTensorPropertiesARM getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceDescriptorBufferTensorPropertiesARM.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceDescriptorBufferTensorPropertiesARM.npNext(address());
        }

        @NativeType("size_t")
        public long tensorCaptureReplayDescriptorDataSize() {
            return VkPhysicalDeviceDescriptorBufferTensorPropertiesARM.ntensorCaptureReplayDescriptorDataSize(address());
        }

        @NativeType("size_t")
        public long tensorViewCaptureReplayDescriptorDataSize() {
            return VkPhysicalDeviceDescriptorBufferTensorPropertiesARM.ntensorViewCaptureReplayDescriptorDataSize(address());
        }

        @NativeType("size_t")
        public long tensorDescriptorSize() {
            return VkPhysicalDeviceDescriptorBufferTensorPropertiesARM.ntensorDescriptorSize(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceDescriptorBufferTensorPropertiesARM.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(ARMTensors.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_BUFFER_TENSOR_PROPERTIES_ARM);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceDescriptorBufferTensorPropertiesARM.npNext(address(), value);
            return this;
        }

        public Buffer tensorCaptureReplayDescriptorDataSize(@NativeType("size_t") long value) {
            VkPhysicalDeviceDescriptorBufferTensorPropertiesARM.ntensorCaptureReplayDescriptorDataSize(address(), value);
            return this;
        }

        public Buffer tensorViewCaptureReplayDescriptorDataSize(@NativeType("size_t") long value) {
            VkPhysicalDeviceDescriptorBufferTensorPropertiesARM.ntensorViewCaptureReplayDescriptorDataSize(address(), value);
            return this;
        }

        public Buffer tensorDescriptorSize(@NativeType("size_t") long value) {
            VkPhysicalDeviceDescriptorBufferTensorPropertiesARM.ntensorDescriptorSize(address(), value);
            return this;
        }
    }
}
