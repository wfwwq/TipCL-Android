package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceExtendedSparseAddressSpaceFeaturesNV.class */
public class VkPhysicalDeviceExtendedSparseAddressSpaceFeaturesNV extends Struct<VkPhysicalDeviceExtendedSparseAddressSpaceFeaturesNV> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int EXTENDEDSPARSEADDRESSSPACE;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        EXTENDEDSPARSEADDRESSSPACE = layout.offsetof(2);
    }

    protected VkPhysicalDeviceExtendedSparseAddressSpaceFeaturesNV(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceExtendedSparseAddressSpaceFeaturesNV create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceExtendedSparseAddressSpaceFeaturesNV(address, container);
    }

    public VkPhysicalDeviceExtendedSparseAddressSpaceFeaturesNV(ByteBuffer container) {
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
    public boolean extendedSparseAddressSpace() {
        return nextendedSparseAddressSpace(address()) != 0;
    }

    public VkPhysicalDeviceExtendedSparseAddressSpaceFeaturesNV sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceExtendedSparseAddressSpaceFeaturesNV sType$Default() {
        return sType(NVExtendedSparseAddressSpace.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTENDED_SPARSE_ADDRESS_SPACE_FEATURES_NV);
    }

    public VkPhysicalDeviceExtendedSparseAddressSpaceFeaturesNV pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceExtendedSparseAddressSpaceFeaturesNV extendedSparseAddressSpace(@NativeType("VkBool32") boolean value) {
        nextendedSparseAddressSpace(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceExtendedSparseAddressSpaceFeaturesNV set(int sType, long pNext, boolean extendedSparseAddressSpace) {
        sType(sType);
        pNext(pNext);
        extendedSparseAddressSpace(extendedSparseAddressSpace);
        return this;
    }

    public VkPhysicalDeviceExtendedSparseAddressSpaceFeaturesNV set(VkPhysicalDeviceExtendedSparseAddressSpaceFeaturesNV src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceExtendedSparseAddressSpaceFeaturesNV malloc() {
        return new VkPhysicalDeviceExtendedSparseAddressSpaceFeaturesNV(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceExtendedSparseAddressSpaceFeaturesNV calloc() {
        return new VkPhysicalDeviceExtendedSparseAddressSpaceFeaturesNV(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceExtendedSparseAddressSpaceFeaturesNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceExtendedSparseAddressSpaceFeaturesNV(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceExtendedSparseAddressSpaceFeaturesNV create(long address) {
        return new VkPhysicalDeviceExtendedSparseAddressSpaceFeaturesNV(address, null);
    }

    public static VkPhysicalDeviceExtendedSparseAddressSpaceFeaturesNV createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceExtendedSparseAddressSpaceFeaturesNV(address, null);
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

    public static VkPhysicalDeviceExtendedSparseAddressSpaceFeaturesNV malloc(MemoryStack stack) {
        return new VkPhysicalDeviceExtendedSparseAddressSpaceFeaturesNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceExtendedSparseAddressSpaceFeaturesNV calloc(MemoryStack stack) {
        return new VkPhysicalDeviceExtendedSparseAddressSpaceFeaturesNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nextendedSparseAddressSpace(long struct) {
        return MemoryUtil.memGetInt(struct + EXTENDEDSPARSEADDRESSSPACE);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nextendedSparseAddressSpace(long struct, int value) {
        MemoryUtil.memPutInt(struct + EXTENDEDSPARSEADDRESSSPACE, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceExtendedSparseAddressSpaceFeaturesNV$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceExtendedSparseAddressSpaceFeaturesNV, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceExtendedSparseAddressSpaceFeaturesNV ELEMENT_FACTORY = VkPhysicalDeviceExtendedSparseAddressSpaceFeaturesNV.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceExtendedSparseAddressSpaceFeaturesNV.SIZEOF);
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
        public VkPhysicalDeviceExtendedSparseAddressSpaceFeaturesNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceExtendedSparseAddressSpaceFeaturesNV.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceExtendedSparseAddressSpaceFeaturesNV.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean extendedSparseAddressSpace() {
            return VkPhysicalDeviceExtendedSparseAddressSpaceFeaturesNV.nextendedSparseAddressSpace(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceExtendedSparseAddressSpaceFeaturesNV.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(NVExtendedSparseAddressSpace.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTENDED_SPARSE_ADDRESS_SPACE_FEATURES_NV);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceExtendedSparseAddressSpaceFeaturesNV.npNext(address(), value);
            return this;
        }

        public Buffer extendedSparseAddressSpace(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceExtendedSparseAddressSpaceFeaturesNV.nextendedSparseAddressSpace(address(), value ? 1 : 0);
            return this;
        }
    }
}
