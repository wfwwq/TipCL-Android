package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceDescriptorBufferTensorFeaturesARM.class */
public class VkPhysicalDeviceDescriptorBufferTensorFeaturesARM extends Struct<VkPhysicalDeviceDescriptorBufferTensorFeaturesARM> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int DESCRIPTORBUFFERTENSORDESCRIPTORS;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        DESCRIPTORBUFFERTENSORDESCRIPTORS = layout.offsetof(2);
    }

    protected VkPhysicalDeviceDescriptorBufferTensorFeaturesARM(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceDescriptorBufferTensorFeaturesARM create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceDescriptorBufferTensorFeaturesARM(address, container);
    }

    public VkPhysicalDeviceDescriptorBufferTensorFeaturesARM(ByteBuffer container) {
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
    public boolean descriptorBufferTensorDescriptors() {
        return ndescriptorBufferTensorDescriptors(address()) != 0;
    }

    public VkPhysicalDeviceDescriptorBufferTensorFeaturesARM sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceDescriptorBufferTensorFeaturesARM sType$Default() {
        return sType(ARMTensors.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_BUFFER_TENSOR_FEATURES_ARM);
    }

    public VkPhysicalDeviceDescriptorBufferTensorFeaturesARM pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceDescriptorBufferTensorFeaturesARM descriptorBufferTensorDescriptors(@NativeType("VkBool32") boolean value) {
        ndescriptorBufferTensorDescriptors(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceDescriptorBufferTensorFeaturesARM set(int sType, long pNext, boolean descriptorBufferTensorDescriptors) {
        sType(sType);
        pNext(pNext);
        descriptorBufferTensorDescriptors(descriptorBufferTensorDescriptors);
        return this;
    }

    public VkPhysicalDeviceDescriptorBufferTensorFeaturesARM set(VkPhysicalDeviceDescriptorBufferTensorFeaturesARM src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceDescriptorBufferTensorFeaturesARM malloc() {
        return new VkPhysicalDeviceDescriptorBufferTensorFeaturesARM(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceDescriptorBufferTensorFeaturesARM calloc() {
        return new VkPhysicalDeviceDescriptorBufferTensorFeaturesARM(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceDescriptorBufferTensorFeaturesARM create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceDescriptorBufferTensorFeaturesARM(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceDescriptorBufferTensorFeaturesARM create(long address) {
        return new VkPhysicalDeviceDescriptorBufferTensorFeaturesARM(address, null);
    }

    public static VkPhysicalDeviceDescriptorBufferTensorFeaturesARM createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceDescriptorBufferTensorFeaturesARM(address, null);
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

    public static VkPhysicalDeviceDescriptorBufferTensorFeaturesARM malloc(MemoryStack stack) {
        return new VkPhysicalDeviceDescriptorBufferTensorFeaturesARM(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceDescriptorBufferTensorFeaturesARM calloc(MemoryStack stack) {
        return new VkPhysicalDeviceDescriptorBufferTensorFeaturesARM(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int ndescriptorBufferTensorDescriptors(long struct) {
        return MemoryUtil.memGetInt(struct + DESCRIPTORBUFFERTENSORDESCRIPTORS);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void ndescriptorBufferTensorDescriptors(long struct, int value) {
        MemoryUtil.memPutInt(struct + DESCRIPTORBUFFERTENSORDESCRIPTORS, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceDescriptorBufferTensorFeaturesARM$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceDescriptorBufferTensorFeaturesARM, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceDescriptorBufferTensorFeaturesARM ELEMENT_FACTORY = VkPhysicalDeviceDescriptorBufferTensorFeaturesARM.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceDescriptorBufferTensorFeaturesARM.SIZEOF);
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
        public VkPhysicalDeviceDescriptorBufferTensorFeaturesARM getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceDescriptorBufferTensorFeaturesARM.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceDescriptorBufferTensorFeaturesARM.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean descriptorBufferTensorDescriptors() {
            return VkPhysicalDeviceDescriptorBufferTensorFeaturesARM.ndescriptorBufferTensorDescriptors(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceDescriptorBufferTensorFeaturesARM.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(ARMTensors.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_BUFFER_TENSOR_FEATURES_ARM);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceDescriptorBufferTensorFeaturesARM.npNext(address(), value);
            return this;
        }

        public Buffer descriptorBufferTensorDescriptors(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceDescriptorBufferTensorFeaturesARM.ndescriptorBufferTensorDescriptors(address(), value ? 1 : 0);
            return this;
        }
    }
}
