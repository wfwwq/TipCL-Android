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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceAccelerationStructurePropertiesKHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceAccelerationStructurePropertiesKHR.class */
public class VkPhysicalDeviceAccelerationStructurePropertiesKHR extends Struct<VkPhysicalDeviceAccelerationStructurePropertiesKHR> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int MAXGEOMETRYCOUNT;
    public static final int MAXINSTANCECOUNT;
    public static final int MAXPRIMITIVECOUNT;
    public static final int MAXPERSTAGEDESCRIPTORACCELERATIONSTRUCTURES;
    public static final int MAXPERSTAGEDESCRIPTORUPDATEAFTERBINDACCELERATIONSTRUCTURES;
    public static final int MAXDESCRIPTORSETACCELERATIONSTRUCTURES;
    public static final int MAXDESCRIPTORSETUPDATEAFTERBINDACCELERATIONSTRUCTURES;
    public static final int MINACCELERATIONSTRUCTURESCRATCHOFFSETALIGNMENT;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(8), __member(8), __member(8), __member(4), __member(4), __member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        MAXGEOMETRYCOUNT = layout.offsetof(2);
        MAXINSTANCECOUNT = layout.offsetof(3);
        MAXPRIMITIVECOUNT = layout.offsetof(4);
        MAXPERSTAGEDESCRIPTORACCELERATIONSTRUCTURES = layout.offsetof(5);
        MAXPERSTAGEDESCRIPTORUPDATEAFTERBINDACCELERATIONSTRUCTURES = layout.offsetof(6);
        MAXDESCRIPTORSETACCELERATIONSTRUCTURES = layout.offsetof(7);
        MAXDESCRIPTORSETUPDATEAFTERBINDACCELERATIONSTRUCTURES = layout.offsetof(8);
        MINACCELERATIONSTRUCTURESCRATCHOFFSETALIGNMENT = layout.offsetof(9);
    }

    protected VkPhysicalDeviceAccelerationStructurePropertiesKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceAccelerationStructurePropertiesKHR create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceAccelerationStructurePropertiesKHR(address, container);
    }

    public VkPhysicalDeviceAccelerationStructurePropertiesKHR(ByteBuffer container) {
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

    @NativeType("uint64_t")
    public long maxGeometryCount() {
        return nmaxGeometryCount(address());
    }

    @NativeType("uint64_t")
    public long maxInstanceCount() {
        return nmaxInstanceCount(address());
    }

    @NativeType("uint64_t")
    public long maxPrimitiveCount() {
        return nmaxPrimitiveCount(address());
    }

    @NativeType("uint32_t")
    public int maxPerStageDescriptorAccelerationStructures() {
        return nmaxPerStageDescriptorAccelerationStructures(address());
    }

    @NativeType("uint32_t")
    public int maxPerStageDescriptorUpdateAfterBindAccelerationStructures() {
        return nmaxPerStageDescriptorUpdateAfterBindAccelerationStructures(address());
    }

    @NativeType("uint32_t")
    public int maxDescriptorSetAccelerationStructures() {
        return nmaxDescriptorSetAccelerationStructures(address());
    }

    @NativeType("uint32_t")
    public int maxDescriptorSetUpdateAfterBindAccelerationStructures() {
        return nmaxDescriptorSetUpdateAfterBindAccelerationStructures(address());
    }

    @NativeType("uint32_t")
    public int minAccelerationStructureScratchOffsetAlignment() {
        return nminAccelerationStructureScratchOffsetAlignment(address());
    }

    public VkPhysicalDeviceAccelerationStructurePropertiesKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceAccelerationStructurePropertiesKHR sType$Default() {
        return sType(KHRAccelerationStructure.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_ACCELERATION_STRUCTURE_PROPERTIES_KHR);
    }

    public VkPhysicalDeviceAccelerationStructurePropertiesKHR pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceAccelerationStructurePropertiesKHR set(int sType, long pNext) {
        sType(sType);
        pNext(pNext);
        return this;
    }

    public VkPhysicalDeviceAccelerationStructurePropertiesKHR set(VkPhysicalDeviceAccelerationStructurePropertiesKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceAccelerationStructurePropertiesKHR malloc() {
        return new VkPhysicalDeviceAccelerationStructurePropertiesKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceAccelerationStructurePropertiesKHR calloc() {
        return new VkPhysicalDeviceAccelerationStructurePropertiesKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceAccelerationStructurePropertiesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceAccelerationStructurePropertiesKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceAccelerationStructurePropertiesKHR create(long address) {
        return new VkPhysicalDeviceAccelerationStructurePropertiesKHR(address, null);
    }

    public static VkPhysicalDeviceAccelerationStructurePropertiesKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceAccelerationStructurePropertiesKHR(address, null);
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

    public static VkPhysicalDeviceAccelerationStructurePropertiesKHR malloc(MemoryStack stack) {
        return new VkPhysicalDeviceAccelerationStructurePropertiesKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceAccelerationStructurePropertiesKHR calloc(MemoryStack stack) {
        return new VkPhysicalDeviceAccelerationStructurePropertiesKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static long nmaxGeometryCount(long struct) {
        return MemoryUtil.memGetLong(struct + MAXGEOMETRYCOUNT);
    }

    public static long nmaxInstanceCount(long struct) {
        return MemoryUtil.memGetLong(struct + MAXINSTANCECOUNT);
    }

    public static long nmaxPrimitiveCount(long struct) {
        return MemoryUtil.memGetLong(struct + MAXPRIMITIVECOUNT);
    }

    public static int nmaxPerStageDescriptorAccelerationStructures(long struct) {
        return MemoryUtil.memGetInt(struct + MAXPERSTAGEDESCRIPTORACCELERATIONSTRUCTURES);
    }

    public static int nmaxPerStageDescriptorUpdateAfterBindAccelerationStructures(long struct) {
        return MemoryUtil.memGetInt(struct + MAXPERSTAGEDESCRIPTORUPDATEAFTERBINDACCELERATIONSTRUCTURES);
    }

    public static int nmaxDescriptorSetAccelerationStructures(long struct) {
        return MemoryUtil.memGetInt(struct + MAXDESCRIPTORSETACCELERATIONSTRUCTURES);
    }

    public static int nmaxDescriptorSetUpdateAfterBindAccelerationStructures(long struct) {
        return MemoryUtil.memGetInt(struct + MAXDESCRIPTORSETUPDATEAFTERBINDACCELERATIONSTRUCTURES);
    }

    public static int nminAccelerationStructureScratchOffsetAlignment(long struct) {
        return MemoryUtil.memGetInt(struct + MINACCELERATIONSTRUCTURESCRATCHOFFSETALIGNMENT);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceAccelerationStructurePropertiesKHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceAccelerationStructurePropertiesKHR$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceAccelerationStructurePropertiesKHR, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceAccelerationStructurePropertiesKHR ELEMENT_FACTORY = VkPhysicalDeviceAccelerationStructurePropertiesKHR.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceAccelerationStructurePropertiesKHR.SIZEOF);
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
        public VkPhysicalDeviceAccelerationStructurePropertiesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceAccelerationStructurePropertiesKHR.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceAccelerationStructurePropertiesKHR.npNext(address());
        }

        @NativeType("uint64_t")
        public long maxGeometryCount() {
            return VkPhysicalDeviceAccelerationStructurePropertiesKHR.nmaxGeometryCount(address());
        }

        @NativeType("uint64_t")
        public long maxInstanceCount() {
            return VkPhysicalDeviceAccelerationStructurePropertiesKHR.nmaxInstanceCount(address());
        }

        @NativeType("uint64_t")
        public long maxPrimitiveCount() {
            return VkPhysicalDeviceAccelerationStructurePropertiesKHR.nmaxPrimitiveCount(address());
        }

        @NativeType("uint32_t")
        public int maxPerStageDescriptorAccelerationStructures() {
            return VkPhysicalDeviceAccelerationStructurePropertiesKHR.nmaxPerStageDescriptorAccelerationStructures(address());
        }

        @NativeType("uint32_t")
        public int maxPerStageDescriptorUpdateAfterBindAccelerationStructures() {
            return VkPhysicalDeviceAccelerationStructurePropertiesKHR.nmaxPerStageDescriptorUpdateAfterBindAccelerationStructures(address());
        }

        @NativeType("uint32_t")
        public int maxDescriptorSetAccelerationStructures() {
            return VkPhysicalDeviceAccelerationStructurePropertiesKHR.nmaxDescriptorSetAccelerationStructures(address());
        }

        @NativeType("uint32_t")
        public int maxDescriptorSetUpdateAfterBindAccelerationStructures() {
            return VkPhysicalDeviceAccelerationStructurePropertiesKHR.nmaxDescriptorSetUpdateAfterBindAccelerationStructures(address());
        }

        @NativeType("uint32_t")
        public int minAccelerationStructureScratchOffsetAlignment() {
            return VkPhysicalDeviceAccelerationStructurePropertiesKHR.nminAccelerationStructureScratchOffsetAlignment(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceAccelerationStructurePropertiesKHR.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(KHRAccelerationStructure.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_ACCELERATION_STRUCTURE_PROPERTIES_KHR);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceAccelerationStructurePropertiesKHR.npNext(address(), value);
            return this;
        }
    }
}
