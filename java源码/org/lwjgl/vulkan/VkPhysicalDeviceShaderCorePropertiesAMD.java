package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceShaderCorePropertiesAMD.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceShaderCorePropertiesAMD.class */
public class VkPhysicalDeviceShaderCorePropertiesAMD extends Struct<VkPhysicalDeviceShaderCorePropertiesAMD> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int SHADERENGINECOUNT;
    public static final int SHADERARRAYSPERENGINECOUNT;
    public static final int COMPUTEUNITSPERSHADERARRAY;
    public static final int SIMDPERCOMPUTEUNIT;
    public static final int WAVEFRONTSPERSIMD;
    public static final int WAVEFRONTSIZE;
    public static final int SGPRSPERSIMD;
    public static final int MINSGPRALLOCATION;
    public static final int MAXSGPRALLOCATION;
    public static final int SGPRALLOCATIONGRANULARITY;
    public static final int VGPRSPERSIMD;
    public static final int MINVGPRALLOCATION;
    public static final int MAXVGPRALLOCATION;
    public static final int VGPRALLOCATIONGRANULARITY;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SHADERENGINECOUNT = layout.offsetof(2);
        SHADERARRAYSPERENGINECOUNT = layout.offsetof(3);
        COMPUTEUNITSPERSHADERARRAY = layout.offsetof(4);
        SIMDPERCOMPUTEUNIT = layout.offsetof(5);
        WAVEFRONTSPERSIMD = layout.offsetof(6);
        WAVEFRONTSIZE = layout.offsetof(7);
        SGPRSPERSIMD = layout.offsetof(8);
        MINSGPRALLOCATION = layout.offsetof(9);
        MAXSGPRALLOCATION = layout.offsetof(10);
        SGPRALLOCATIONGRANULARITY = layout.offsetof(11);
        VGPRSPERSIMD = layout.offsetof(12);
        MINVGPRALLOCATION = layout.offsetof(13);
        MAXVGPRALLOCATION = layout.offsetof(14);
        VGPRALLOCATIONGRANULARITY = layout.offsetof(15);
    }

    protected VkPhysicalDeviceShaderCorePropertiesAMD(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceShaderCorePropertiesAMD create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceShaderCorePropertiesAMD(address, container);
    }

    public VkPhysicalDeviceShaderCorePropertiesAMD(ByteBuffer container) {
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
    public int shaderEngineCount() {
        return nshaderEngineCount(address());
    }

    @NativeType("uint32_t")
    public int shaderArraysPerEngineCount() {
        return nshaderArraysPerEngineCount(address());
    }

    @NativeType("uint32_t")
    public int computeUnitsPerShaderArray() {
        return ncomputeUnitsPerShaderArray(address());
    }

    @NativeType("uint32_t")
    public int simdPerComputeUnit() {
        return nsimdPerComputeUnit(address());
    }

    @NativeType("uint32_t")
    public int wavefrontsPerSimd() {
        return nwavefrontsPerSimd(address());
    }

    @NativeType("uint32_t")
    public int wavefrontSize() {
        return nwavefrontSize(address());
    }

    @NativeType("uint32_t")
    public int sgprsPerSimd() {
        return nsgprsPerSimd(address());
    }

    @NativeType("uint32_t")
    public int minSgprAllocation() {
        return nminSgprAllocation(address());
    }

    @NativeType("uint32_t")
    public int maxSgprAllocation() {
        return nmaxSgprAllocation(address());
    }

    @NativeType("uint32_t")
    public int sgprAllocationGranularity() {
        return nsgprAllocationGranularity(address());
    }

    @NativeType("uint32_t")
    public int vgprsPerSimd() {
        return nvgprsPerSimd(address());
    }

    @NativeType("uint32_t")
    public int minVgprAllocation() {
        return nminVgprAllocation(address());
    }

    @NativeType("uint32_t")
    public int maxVgprAllocation() {
        return nmaxVgprAllocation(address());
    }

    @NativeType("uint32_t")
    public int vgprAllocationGranularity() {
        return nvgprAllocationGranularity(address());
    }

    public VkPhysicalDeviceShaderCorePropertiesAMD sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceShaderCorePropertiesAMD sType$Default() {
        return sType(AMDShaderCoreProperties.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_CORE_PROPERTIES_AMD);
    }

    public VkPhysicalDeviceShaderCorePropertiesAMD pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceShaderCorePropertiesAMD set(int sType, long pNext) {
        sType(sType);
        pNext(pNext);
        return this;
    }

    public VkPhysicalDeviceShaderCorePropertiesAMD set(VkPhysicalDeviceShaderCorePropertiesAMD src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceShaderCorePropertiesAMD malloc() {
        return new VkPhysicalDeviceShaderCorePropertiesAMD(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceShaderCorePropertiesAMD calloc() {
        return new VkPhysicalDeviceShaderCorePropertiesAMD(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceShaderCorePropertiesAMD create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceShaderCorePropertiesAMD(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceShaderCorePropertiesAMD create(long address) {
        return new VkPhysicalDeviceShaderCorePropertiesAMD(address, null);
    }

    public static VkPhysicalDeviceShaderCorePropertiesAMD createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceShaderCorePropertiesAMD(address, null);
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

    public static VkPhysicalDeviceShaderCorePropertiesAMD malloc(MemoryStack stack) {
        return new VkPhysicalDeviceShaderCorePropertiesAMD(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceShaderCorePropertiesAMD calloc(MemoryStack stack) {
        return new VkPhysicalDeviceShaderCorePropertiesAMD(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nshaderEngineCount(long struct) {
        return MemoryUtil.memGetInt(struct + SHADERENGINECOUNT);
    }

    public static int nshaderArraysPerEngineCount(long struct) {
        return MemoryUtil.memGetInt(struct + SHADERARRAYSPERENGINECOUNT);
    }

    public static int ncomputeUnitsPerShaderArray(long struct) {
        return MemoryUtil.memGetInt(struct + COMPUTEUNITSPERSHADERARRAY);
    }

    public static int nsimdPerComputeUnit(long struct) {
        return MemoryUtil.memGetInt(struct + SIMDPERCOMPUTEUNIT);
    }

    public static int nwavefrontsPerSimd(long struct) {
        return MemoryUtil.memGetInt(struct + WAVEFRONTSPERSIMD);
    }

    public static int nwavefrontSize(long struct) {
        return MemoryUtil.memGetInt(struct + WAVEFRONTSIZE);
    }

    public static int nsgprsPerSimd(long struct) {
        return MemoryUtil.memGetInt(struct + SGPRSPERSIMD);
    }

    public static int nminSgprAllocation(long struct) {
        return MemoryUtil.memGetInt(struct + MINSGPRALLOCATION);
    }

    public static int nmaxSgprAllocation(long struct) {
        return MemoryUtil.memGetInt(struct + MAXSGPRALLOCATION);
    }

    public static int nsgprAllocationGranularity(long struct) {
        return MemoryUtil.memGetInt(struct + SGPRALLOCATIONGRANULARITY);
    }

    public static int nvgprsPerSimd(long struct) {
        return MemoryUtil.memGetInt(struct + VGPRSPERSIMD);
    }

    public static int nminVgprAllocation(long struct) {
        return MemoryUtil.memGetInt(struct + MINVGPRALLOCATION);
    }

    public static int nmaxVgprAllocation(long struct) {
        return MemoryUtil.memGetInt(struct + MAXVGPRALLOCATION);
    }

    public static int nvgprAllocationGranularity(long struct) {
        return MemoryUtil.memGetInt(struct + VGPRALLOCATIONGRANULARITY);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceShaderCorePropertiesAMD$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceShaderCorePropertiesAMD$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceShaderCorePropertiesAMD, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceShaderCorePropertiesAMD ELEMENT_FACTORY = VkPhysicalDeviceShaderCorePropertiesAMD.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceShaderCorePropertiesAMD.SIZEOF);
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
        public VkPhysicalDeviceShaderCorePropertiesAMD getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceShaderCorePropertiesAMD.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceShaderCorePropertiesAMD.npNext(address());
        }

        @NativeType("uint32_t")
        public int shaderEngineCount() {
            return VkPhysicalDeviceShaderCorePropertiesAMD.nshaderEngineCount(address());
        }

        @NativeType("uint32_t")
        public int shaderArraysPerEngineCount() {
            return VkPhysicalDeviceShaderCorePropertiesAMD.nshaderArraysPerEngineCount(address());
        }

        @NativeType("uint32_t")
        public int computeUnitsPerShaderArray() {
            return VkPhysicalDeviceShaderCorePropertiesAMD.ncomputeUnitsPerShaderArray(address());
        }

        @NativeType("uint32_t")
        public int simdPerComputeUnit() {
            return VkPhysicalDeviceShaderCorePropertiesAMD.nsimdPerComputeUnit(address());
        }

        @NativeType("uint32_t")
        public int wavefrontsPerSimd() {
            return VkPhysicalDeviceShaderCorePropertiesAMD.nwavefrontsPerSimd(address());
        }

        @NativeType("uint32_t")
        public int wavefrontSize() {
            return VkPhysicalDeviceShaderCorePropertiesAMD.nwavefrontSize(address());
        }

        @NativeType("uint32_t")
        public int sgprsPerSimd() {
            return VkPhysicalDeviceShaderCorePropertiesAMD.nsgprsPerSimd(address());
        }

        @NativeType("uint32_t")
        public int minSgprAllocation() {
            return VkPhysicalDeviceShaderCorePropertiesAMD.nminSgprAllocation(address());
        }

        @NativeType("uint32_t")
        public int maxSgprAllocation() {
            return VkPhysicalDeviceShaderCorePropertiesAMD.nmaxSgprAllocation(address());
        }

        @NativeType("uint32_t")
        public int sgprAllocationGranularity() {
            return VkPhysicalDeviceShaderCorePropertiesAMD.nsgprAllocationGranularity(address());
        }

        @NativeType("uint32_t")
        public int vgprsPerSimd() {
            return VkPhysicalDeviceShaderCorePropertiesAMD.nvgprsPerSimd(address());
        }

        @NativeType("uint32_t")
        public int minVgprAllocation() {
            return VkPhysicalDeviceShaderCorePropertiesAMD.nminVgprAllocation(address());
        }

        @NativeType("uint32_t")
        public int maxVgprAllocation() {
            return VkPhysicalDeviceShaderCorePropertiesAMD.nmaxVgprAllocation(address());
        }

        @NativeType("uint32_t")
        public int vgprAllocationGranularity() {
            return VkPhysicalDeviceShaderCorePropertiesAMD.nvgprAllocationGranularity(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceShaderCorePropertiesAMD.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(AMDShaderCoreProperties.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_CORE_PROPERTIES_AMD);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceShaderCorePropertiesAMD.npNext(address(), value);
            return this;
        }
    }
}
