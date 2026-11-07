package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceCooperativeMatrix2PropertiesNV.class */
public class VkPhysicalDeviceCooperativeMatrix2PropertiesNV extends Struct<VkPhysicalDeviceCooperativeMatrix2PropertiesNV> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int COOPERATIVEMATRIXWORKGROUPSCOPEMAXWORKGROUPSIZE;
    public static final int COOPERATIVEMATRIXFLEXIBLEDIMENSIONSMAXDIMENSION;
    public static final int COOPERATIVEMATRIXWORKGROUPSCOPERESERVEDSHAREDMEMORY;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        COOPERATIVEMATRIXWORKGROUPSCOPEMAXWORKGROUPSIZE = layout.offsetof(2);
        COOPERATIVEMATRIXFLEXIBLEDIMENSIONSMAXDIMENSION = layout.offsetof(3);
        COOPERATIVEMATRIXWORKGROUPSCOPERESERVEDSHAREDMEMORY = layout.offsetof(4);
    }

    protected VkPhysicalDeviceCooperativeMatrix2PropertiesNV(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceCooperativeMatrix2PropertiesNV create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceCooperativeMatrix2PropertiesNV(address, container);
    }

    public VkPhysicalDeviceCooperativeMatrix2PropertiesNV(ByteBuffer container) {
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
    public int cooperativeMatrixWorkgroupScopeMaxWorkgroupSize() {
        return ncooperativeMatrixWorkgroupScopeMaxWorkgroupSize(address());
    }

    @NativeType("uint32_t")
    public int cooperativeMatrixFlexibleDimensionsMaxDimension() {
        return ncooperativeMatrixFlexibleDimensionsMaxDimension(address());
    }

    @NativeType("uint32_t")
    public int cooperativeMatrixWorkgroupScopeReservedSharedMemory() {
        return ncooperativeMatrixWorkgroupScopeReservedSharedMemory(address());
    }

    public VkPhysicalDeviceCooperativeMatrix2PropertiesNV sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceCooperativeMatrix2PropertiesNV sType$Default() {
        return sType(NVCooperativeMatrix2.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COOPERATIVE_MATRIX_2_PROPERTIES_NV);
    }

    public VkPhysicalDeviceCooperativeMatrix2PropertiesNV pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceCooperativeMatrix2PropertiesNV set(int sType, long pNext) {
        sType(sType);
        pNext(pNext);
        return this;
    }

    public VkPhysicalDeviceCooperativeMatrix2PropertiesNV set(VkPhysicalDeviceCooperativeMatrix2PropertiesNV src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceCooperativeMatrix2PropertiesNV malloc() {
        return new VkPhysicalDeviceCooperativeMatrix2PropertiesNV(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceCooperativeMatrix2PropertiesNV calloc() {
        return new VkPhysicalDeviceCooperativeMatrix2PropertiesNV(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceCooperativeMatrix2PropertiesNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceCooperativeMatrix2PropertiesNV(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceCooperativeMatrix2PropertiesNV create(long address) {
        return new VkPhysicalDeviceCooperativeMatrix2PropertiesNV(address, null);
    }

    public static VkPhysicalDeviceCooperativeMatrix2PropertiesNV createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceCooperativeMatrix2PropertiesNV(address, null);
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

    public static VkPhysicalDeviceCooperativeMatrix2PropertiesNV malloc(MemoryStack stack) {
        return new VkPhysicalDeviceCooperativeMatrix2PropertiesNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceCooperativeMatrix2PropertiesNV calloc(MemoryStack stack) {
        return new VkPhysicalDeviceCooperativeMatrix2PropertiesNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int ncooperativeMatrixWorkgroupScopeMaxWorkgroupSize(long struct) {
        return MemoryUtil.memGetInt(struct + COOPERATIVEMATRIXWORKGROUPSCOPEMAXWORKGROUPSIZE);
    }

    public static int ncooperativeMatrixFlexibleDimensionsMaxDimension(long struct) {
        return MemoryUtil.memGetInt(struct + COOPERATIVEMATRIXFLEXIBLEDIMENSIONSMAXDIMENSION);
    }

    public static int ncooperativeMatrixWorkgroupScopeReservedSharedMemory(long struct) {
        return MemoryUtil.memGetInt(struct + COOPERATIVEMATRIXWORKGROUPSCOPERESERVEDSHAREDMEMORY);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceCooperativeMatrix2PropertiesNV$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceCooperativeMatrix2PropertiesNV, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceCooperativeMatrix2PropertiesNV ELEMENT_FACTORY = VkPhysicalDeviceCooperativeMatrix2PropertiesNV.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceCooperativeMatrix2PropertiesNV.SIZEOF);
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
        public VkPhysicalDeviceCooperativeMatrix2PropertiesNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceCooperativeMatrix2PropertiesNV.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceCooperativeMatrix2PropertiesNV.npNext(address());
        }

        @NativeType("uint32_t")
        public int cooperativeMatrixWorkgroupScopeMaxWorkgroupSize() {
            return VkPhysicalDeviceCooperativeMatrix2PropertiesNV.ncooperativeMatrixWorkgroupScopeMaxWorkgroupSize(address());
        }

        @NativeType("uint32_t")
        public int cooperativeMatrixFlexibleDimensionsMaxDimension() {
            return VkPhysicalDeviceCooperativeMatrix2PropertiesNV.ncooperativeMatrixFlexibleDimensionsMaxDimension(address());
        }

        @NativeType("uint32_t")
        public int cooperativeMatrixWorkgroupScopeReservedSharedMemory() {
            return VkPhysicalDeviceCooperativeMatrix2PropertiesNV.ncooperativeMatrixWorkgroupScopeReservedSharedMemory(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceCooperativeMatrix2PropertiesNV.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(NVCooperativeMatrix2.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COOPERATIVE_MATRIX_2_PROPERTIES_NV);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceCooperativeMatrix2PropertiesNV.npNext(address(), value);
            return this;
        }
    }
}
