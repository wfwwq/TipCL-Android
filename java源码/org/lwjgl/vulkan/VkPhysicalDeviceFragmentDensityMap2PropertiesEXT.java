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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceFragmentDensityMap2PropertiesEXT.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceFragmentDensityMap2PropertiesEXT.class */
public class VkPhysicalDeviceFragmentDensityMap2PropertiesEXT extends Struct<VkPhysicalDeviceFragmentDensityMap2PropertiesEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int SUBSAMPLEDLOADS;
    public static final int SUBSAMPLEDCOARSERECONSTRUCTIONEARLYACCESS;
    public static final int MAXSUBSAMPLEDARRAYLAYERS;
    public static final int MAXDESCRIPTORSETSUBSAMPLEDSAMPLERS;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SUBSAMPLEDLOADS = layout.offsetof(2);
        SUBSAMPLEDCOARSERECONSTRUCTIONEARLYACCESS = layout.offsetof(3);
        MAXSUBSAMPLEDARRAYLAYERS = layout.offsetof(4);
        MAXDESCRIPTORSETSUBSAMPLEDSAMPLERS = layout.offsetof(5);
    }

    protected VkPhysicalDeviceFragmentDensityMap2PropertiesEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceFragmentDensityMap2PropertiesEXT create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceFragmentDensityMap2PropertiesEXT(address, container);
    }

    public VkPhysicalDeviceFragmentDensityMap2PropertiesEXT(ByteBuffer container) {
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
    public boolean subsampledLoads() {
        return nsubsampledLoads(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean subsampledCoarseReconstructionEarlyAccess() {
        return nsubsampledCoarseReconstructionEarlyAccess(address()) != 0;
    }

    @NativeType("uint32_t")
    public int maxSubsampledArrayLayers() {
        return nmaxSubsampledArrayLayers(address());
    }

    @NativeType("uint32_t")
    public int maxDescriptorSetSubsampledSamplers() {
        return nmaxDescriptorSetSubsampledSamplers(address());
    }

    public VkPhysicalDeviceFragmentDensityMap2PropertiesEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceFragmentDensityMap2PropertiesEXT sType$Default() {
        return sType(EXTFragmentDensityMap2.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_DENSITY_MAP_2_PROPERTIES_EXT);
    }

    public VkPhysicalDeviceFragmentDensityMap2PropertiesEXT pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceFragmentDensityMap2PropertiesEXT set(int sType, long pNext) {
        sType(sType);
        pNext(pNext);
        return this;
    }

    public VkPhysicalDeviceFragmentDensityMap2PropertiesEXT set(VkPhysicalDeviceFragmentDensityMap2PropertiesEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceFragmentDensityMap2PropertiesEXT malloc() {
        return new VkPhysicalDeviceFragmentDensityMap2PropertiesEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceFragmentDensityMap2PropertiesEXT calloc() {
        return new VkPhysicalDeviceFragmentDensityMap2PropertiesEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceFragmentDensityMap2PropertiesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceFragmentDensityMap2PropertiesEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceFragmentDensityMap2PropertiesEXT create(long address) {
        return new VkPhysicalDeviceFragmentDensityMap2PropertiesEXT(address, null);
    }

    public static VkPhysicalDeviceFragmentDensityMap2PropertiesEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceFragmentDensityMap2PropertiesEXT(address, null);
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

    public static VkPhysicalDeviceFragmentDensityMap2PropertiesEXT malloc(MemoryStack stack) {
        return new VkPhysicalDeviceFragmentDensityMap2PropertiesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceFragmentDensityMap2PropertiesEXT calloc(MemoryStack stack) {
        return new VkPhysicalDeviceFragmentDensityMap2PropertiesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nsubsampledLoads(long struct) {
        return MemoryUtil.memGetInt(struct + SUBSAMPLEDLOADS);
    }

    public static int nsubsampledCoarseReconstructionEarlyAccess(long struct) {
        return MemoryUtil.memGetInt(struct + SUBSAMPLEDCOARSERECONSTRUCTIONEARLYACCESS);
    }

    public static int nmaxSubsampledArrayLayers(long struct) {
        return MemoryUtil.memGetInt(struct + MAXSUBSAMPLEDARRAYLAYERS);
    }

    public static int nmaxDescriptorSetSubsampledSamplers(long struct) {
        return MemoryUtil.memGetInt(struct + MAXDESCRIPTORSETSUBSAMPLEDSAMPLERS);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceFragmentDensityMap2PropertiesEXT$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceFragmentDensityMap2PropertiesEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceFragmentDensityMap2PropertiesEXT, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceFragmentDensityMap2PropertiesEXT ELEMENT_FACTORY = VkPhysicalDeviceFragmentDensityMap2PropertiesEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceFragmentDensityMap2PropertiesEXT.SIZEOF);
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
        public VkPhysicalDeviceFragmentDensityMap2PropertiesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceFragmentDensityMap2PropertiesEXT.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceFragmentDensityMap2PropertiesEXT.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean subsampledLoads() {
            return VkPhysicalDeviceFragmentDensityMap2PropertiesEXT.nsubsampledLoads(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean subsampledCoarseReconstructionEarlyAccess() {
            return VkPhysicalDeviceFragmentDensityMap2PropertiesEXT.nsubsampledCoarseReconstructionEarlyAccess(address()) != 0;
        }

        @NativeType("uint32_t")
        public int maxSubsampledArrayLayers() {
            return VkPhysicalDeviceFragmentDensityMap2PropertiesEXT.nmaxSubsampledArrayLayers(address());
        }

        @NativeType("uint32_t")
        public int maxDescriptorSetSubsampledSamplers() {
            return VkPhysicalDeviceFragmentDensityMap2PropertiesEXT.nmaxDescriptorSetSubsampledSamplers(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceFragmentDensityMap2PropertiesEXT.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(EXTFragmentDensityMap2.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_DENSITY_MAP_2_PROPERTIES_EXT);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceFragmentDensityMap2PropertiesEXT.npNext(address(), value);
            return this;
        }
    }
}
