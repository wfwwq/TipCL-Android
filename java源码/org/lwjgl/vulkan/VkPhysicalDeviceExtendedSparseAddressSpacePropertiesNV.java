package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV.class */
public class VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV extends Struct<VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int EXTENDEDSPARSEADDRESSSPACESIZE;
    public static final int EXTENDEDSPARSEIMAGEUSAGEFLAGS;
    public static final int EXTENDEDSPARSEBUFFERUSAGEFLAGS;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(8), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        EXTENDEDSPARSEADDRESSSPACESIZE = layout.offsetof(2);
        EXTENDEDSPARSEIMAGEUSAGEFLAGS = layout.offsetof(3);
        EXTENDEDSPARSEBUFFERUSAGEFLAGS = layout.offsetof(4);
    }

    protected VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV(address, container);
    }

    public VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV(ByteBuffer container) {
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
    public long extendedSparseAddressSpaceSize() {
        return nextendedSparseAddressSpaceSize(address());
    }

    @NativeType("VkImageUsageFlags")
    public int extendedSparseImageUsageFlags() {
        return nextendedSparseImageUsageFlags(address());
    }

    @NativeType("VkBufferUsageFlags")
    public int extendedSparseBufferUsageFlags() {
        return nextendedSparseBufferUsageFlags(address());
    }

    public VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV sType$Default() {
        return sType(NVExtendedSparseAddressSpace.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTENDED_SPARSE_ADDRESS_SPACE_PROPERTIES_NV);
    }

    public VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV set(int sType, long pNext) {
        sType(sType);
        pNext(pNext);
        return this;
    }

    public VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV set(VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV malloc() {
        return new VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV calloc() {
        return new VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV create(long address) {
        return new VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV(address, null);
    }

    public static VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV(address, null);
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

    public static VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV malloc(MemoryStack stack) {
        return new VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV calloc(MemoryStack stack) {
        return new VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static long nextendedSparseAddressSpaceSize(long struct) {
        return MemoryUtil.memGetLong(struct + EXTENDEDSPARSEADDRESSSPACESIZE);
    }

    public static int nextendedSparseImageUsageFlags(long struct) {
        return MemoryUtil.memGetInt(struct + EXTENDEDSPARSEIMAGEUSAGEFLAGS);
    }

    public static int nextendedSparseBufferUsageFlags(long struct) {
        return MemoryUtil.memGetInt(struct + EXTENDEDSPARSEBUFFERUSAGEFLAGS);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV ELEMENT_FACTORY = VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV.SIZEOF);
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
        public VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV.npNext(address());
        }

        @NativeType("VkDeviceSize")
        public long extendedSparseAddressSpaceSize() {
            return VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV.nextendedSparseAddressSpaceSize(address());
        }

        @NativeType("VkImageUsageFlags")
        public int extendedSparseImageUsageFlags() {
            return VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV.nextendedSparseImageUsageFlags(address());
        }

        @NativeType("VkBufferUsageFlags")
        public int extendedSparseBufferUsageFlags() {
            return VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV.nextendedSparseBufferUsageFlags(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(NVExtendedSparseAddressSpace.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTENDED_SPARSE_ADDRESS_SPACE_PROPERTIES_NV);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV.npNext(address(), value);
            return this;
        }
    }
}
