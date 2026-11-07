package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceTensorPropertiesARM.class */
public class VkPhysicalDeviceTensorPropertiesARM extends Struct<VkPhysicalDeviceTensorPropertiesARM> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int MAXTENSORDIMENSIONCOUNT;
    public static final int MAXTENSORELEMENTS;
    public static final int MAXPERDIMENSIONTENSORELEMENTS;
    public static final int MAXTENSORSTRIDE;
    public static final int MAXTENSORSIZE;
    public static final int MAXTENSORSHADERACCESSARRAYLENGTH;
    public static final int MAXTENSORSHADERACCESSSIZE;
    public static final int MAXDESCRIPTORSETSTORAGETENSORS;
    public static final int MAXPERSTAGEDESCRIPTORSETSTORAGETENSORS;
    public static final int MAXDESCRIPTORSETUPDATEAFTERBINDSTORAGETENSORS;
    public static final int MAXPERSTAGEDESCRIPTORUPDATEAFTERBINDSTORAGETENSORS;
    public static final int SHADERSTORAGETENSORARRAYNONUNIFORMINDEXINGNATIVE;
    public static final int SHADERTENSORSUPPORTEDSTAGES;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(8), __member(8), __member(8), __member(8), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        MAXTENSORDIMENSIONCOUNT = layout.offsetof(2);
        MAXTENSORELEMENTS = layout.offsetof(3);
        MAXPERDIMENSIONTENSORELEMENTS = layout.offsetof(4);
        MAXTENSORSTRIDE = layout.offsetof(5);
        MAXTENSORSIZE = layout.offsetof(6);
        MAXTENSORSHADERACCESSARRAYLENGTH = layout.offsetof(7);
        MAXTENSORSHADERACCESSSIZE = layout.offsetof(8);
        MAXDESCRIPTORSETSTORAGETENSORS = layout.offsetof(9);
        MAXPERSTAGEDESCRIPTORSETSTORAGETENSORS = layout.offsetof(10);
        MAXDESCRIPTORSETUPDATEAFTERBINDSTORAGETENSORS = layout.offsetof(11);
        MAXPERSTAGEDESCRIPTORUPDATEAFTERBINDSTORAGETENSORS = layout.offsetof(12);
        SHADERSTORAGETENSORARRAYNONUNIFORMINDEXINGNATIVE = layout.offsetof(13);
        SHADERTENSORSUPPORTEDSTAGES = layout.offsetof(14);
    }

    protected VkPhysicalDeviceTensorPropertiesARM(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceTensorPropertiesARM create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceTensorPropertiesARM(address, container);
    }

    public VkPhysicalDeviceTensorPropertiesARM(ByteBuffer container) {
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
    public int maxTensorDimensionCount() {
        return nmaxTensorDimensionCount(address());
    }

    @NativeType("uint64_t")
    public long maxTensorElements() {
        return nmaxTensorElements(address());
    }

    @NativeType("uint64_t")
    public long maxPerDimensionTensorElements() {
        return nmaxPerDimensionTensorElements(address());
    }

    @NativeType("int64_t")
    public long maxTensorStride() {
        return nmaxTensorStride(address());
    }

    @NativeType("uint64_t")
    public long maxTensorSize() {
        return nmaxTensorSize(address());
    }

    @NativeType("uint32_t")
    public int maxTensorShaderAccessArrayLength() {
        return nmaxTensorShaderAccessArrayLength(address());
    }

    @NativeType("uint32_t")
    public int maxTensorShaderAccessSize() {
        return nmaxTensorShaderAccessSize(address());
    }

    @NativeType("uint32_t")
    public int maxDescriptorSetStorageTensors() {
        return nmaxDescriptorSetStorageTensors(address());
    }

    @NativeType("uint32_t")
    public int maxPerStageDescriptorSetStorageTensors() {
        return nmaxPerStageDescriptorSetStorageTensors(address());
    }

    @NativeType("uint32_t")
    public int maxDescriptorSetUpdateAfterBindStorageTensors() {
        return nmaxDescriptorSetUpdateAfterBindStorageTensors(address());
    }

    @NativeType("uint32_t")
    public int maxPerStageDescriptorUpdateAfterBindStorageTensors() {
        return nmaxPerStageDescriptorUpdateAfterBindStorageTensors(address());
    }

    @NativeType("VkBool32")
    public boolean shaderStorageTensorArrayNonUniformIndexingNative() {
        return nshaderStorageTensorArrayNonUniformIndexingNative(address()) != 0;
    }

    @NativeType("VkShaderStageFlags")
    public int shaderTensorSupportedStages() {
        return nshaderTensorSupportedStages(address());
    }

    public VkPhysicalDeviceTensorPropertiesARM sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceTensorPropertiesARM sType$Default() {
        return sType(ARMTensors.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TENSOR_PROPERTIES_ARM);
    }

    public VkPhysicalDeviceTensorPropertiesARM pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceTensorPropertiesARM set(int sType, long pNext) {
        sType(sType);
        pNext(pNext);
        return this;
    }

    public VkPhysicalDeviceTensorPropertiesARM set(VkPhysicalDeviceTensorPropertiesARM src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceTensorPropertiesARM malloc() {
        return new VkPhysicalDeviceTensorPropertiesARM(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceTensorPropertiesARM calloc() {
        return new VkPhysicalDeviceTensorPropertiesARM(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceTensorPropertiesARM create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceTensorPropertiesARM(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceTensorPropertiesARM create(long address) {
        return new VkPhysicalDeviceTensorPropertiesARM(address, null);
    }

    public static VkPhysicalDeviceTensorPropertiesARM createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceTensorPropertiesARM(address, null);
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

    public static VkPhysicalDeviceTensorPropertiesARM malloc(MemoryStack stack) {
        return new VkPhysicalDeviceTensorPropertiesARM(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceTensorPropertiesARM calloc(MemoryStack stack) {
        return new VkPhysicalDeviceTensorPropertiesARM(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nmaxTensorDimensionCount(long struct) {
        return MemoryUtil.memGetInt(struct + MAXTENSORDIMENSIONCOUNT);
    }

    public static long nmaxTensorElements(long struct) {
        return MemoryUtil.memGetLong(struct + MAXTENSORELEMENTS);
    }

    public static long nmaxPerDimensionTensorElements(long struct) {
        return MemoryUtil.memGetLong(struct + MAXPERDIMENSIONTENSORELEMENTS);
    }

    public static long nmaxTensorStride(long struct) {
        return MemoryUtil.memGetLong(struct + MAXTENSORSTRIDE);
    }

    public static long nmaxTensorSize(long struct) {
        return MemoryUtil.memGetLong(struct + MAXTENSORSIZE);
    }

    public static int nmaxTensorShaderAccessArrayLength(long struct) {
        return MemoryUtil.memGetInt(struct + MAXTENSORSHADERACCESSARRAYLENGTH);
    }

    public static int nmaxTensorShaderAccessSize(long struct) {
        return MemoryUtil.memGetInt(struct + MAXTENSORSHADERACCESSSIZE);
    }

    public static int nmaxDescriptorSetStorageTensors(long struct) {
        return MemoryUtil.memGetInt(struct + MAXDESCRIPTORSETSTORAGETENSORS);
    }

    public static int nmaxPerStageDescriptorSetStorageTensors(long struct) {
        return MemoryUtil.memGetInt(struct + MAXPERSTAGEDESCRIPTORSETSTORAGETENSORS);
    }

    public static int nmaxDescriptorSetUpdateAfterBindStorageTensors(long struct) {
        return MemoryUtil.memGetInt(struct + MAXDESCRIPTORSETUPDATEAFTERBINDSTORAGETENSORS);
    }

    public static int nmaxPerStageDescriptorUpdateAfterBindStorageTensors(long struct) {
        return MemoryUtil.memGetInt(struct + MAXPERSTAGEDESCRIPTORUPDATEAFTERBINDSTORAGETENSORS);
    }

    public static int nshaderStorageTensorArrayNonUniformIndexingNative(long struct) {
        return MemoryUtil.memGetInt(struct + SHADERSTORAGETENSORARRAYNONUNIFORMINDEXINGNATIVE);
    }

    public static int nshaderTensorSupportedStages(long struct) {
        return MemoryUtil.memGetInt(struct + SHADERTENSORSUPPORTEDSTAGES);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceTensorPropertiesARM$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceTensorPropertiesARM, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceTensorPropertiesARM ELEMENT_FACTORY = VkPhysicalDeviceTensorPropertiesARM.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceTensorPropertiesARM.SIZEOF);
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
        public VkPhysicalDeviceTensorPropertiesARM getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceTensorPropertiesARM.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceTensorPropertiesARM.npNext(address());
        }

        @NativeType("uint32_t")
        public int maxTensorDimensionCount() {
            return VkPhysicalDeviceTensorPropertiesARM.nmaxTensorDimensionCount(address());
        }

        @NativeType("uint64_t")
        public long maxTensorElements() {
            return VkPhysicalDeviceTensorPropertiesARM.nmaxTensorElements(address());
        }

        @NativeType("uint64_t")
        public long maxPerDimensionTensorElements() {
            return VkPhysicalDeviceTensorPropertiesARM.nmaxPerDimensionTensorElements(address());
        }

        @NativeType("int64_t")
        public long maxTensorStride() {
            return VkPhysicalDeviceTensorPropertiesARM.nmaxTensorStride(address());
        }

        @NativeType("uint64_t")
        public long maxTensorSize() {
            return VkPhysicalDeviceTensorPropertiesARM.nmaxTensorSize(address());
        }

        @NativeType("uint32_t")
        public int maxTensorShaderAccessArrayLength() {
            return VkPhysicalDeviceTensorPropertiesARM.nmaxTensorShaderAccessArrayLength(address());
        }

        @NativeType("uint32_t")
        public int maxTensorShaderAccessSize() {
            return VkPhysicalDeviceTensorPropertiesARM.nmaxTensorShaderAccessSize(address());
        }

        @NativeType("uint32_t")
        public int maxDescriptorSetStorageTensors() {
            return VkPhysicalDeviceTensorPropertiesARM.nmaxDescriptorSetStorageTensors(address());
        }

        @NativeType("uint32_t")
        public int maxPerStageDescriptorSetStorageTensors() {
            return VkPhysicalDeviceTensorPropertiesARM.nmaxPerStageDescriptorSetStorageTensors(address());
        }

        @NativeType("uint32_t")
        public int maxDescriptorSetUpdateAfterBindStorageTensors() {
            return VkPhysicalDeviceTensorPropertiesARM.nmaxDescriptorSetUpdateAfterBindStorageTensors(address());
        }

        @NativeType("uint32_t")
        public int maxPerStageDescriptorUpdateAfterBindStorageTensors() {
            return VkPhysicalDeviceTensorPropertiesARM.nmaxPerStageDescriptorUpdateAfterBindStorageTensors(address());
        }

        @NativeType("VkBool32")
        public boolean shaderStorageTensorArrayNonUniformIndexingNative() {
            return VkPhysicalDeviceTensorPropertiesARM.nshaderStorageTensorArrayNonUniformIndexingNative(address()) != 0;
        }

        @NativeType("VkShaderStageFlags")
        public int shaderTensorSupportedStages() {
            return VkPhysicalDeviceTensorPropertiesARM.nshaderTensorSupportedStages(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceTensorPropertiesARM.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(ARMTensors.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TENSOR_PROPERTIES_ARM);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceTensorPropertiesARM.npNext(address(), value);
            return this;
        }
    }
}
