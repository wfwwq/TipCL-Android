package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.Checks;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceVulkan11Properties.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceVulkan11Properties.class */
public class VkPhysicalDeviceVulkan11Properties extends Struct<VkPhysicalDeviceVulkan11Properties> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int DEVICEUUID;
    public static final int DRIVERUUID;
    public static final int DEVICELUID;
    public static final int DEVICENODEMASK;
    public static final int DEVICELUIDVALID;
    public static final int SUBGROUPSIZE;
    public static final int SUBGROUPSUPPORTEDSTAGES;
    public static final int SUBGROUPSUPPORTEDOPERATIONS;
    public static final int SUBGROUPQUADOPERATIONSINALLSTAGES;
    public static final int POINTCLIPPINGBEHAVIOR;
    public static final int MAXMULTIVIEWVIEWCOUNT;
    public static final int MAXMULTIVIEWINSTANCEINDEX;
    public static final int PROTECTEDNOFAULT;
    public static final int MAXPERSETDESCRIPTORS;
    public static final int MAXMEMORYALLOCATIONSIZE;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __array(1, 16), __array(1, 16), __array(1, 8), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(8));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        DEVICEUUID = layout.offsetof(2);
        DRIVERUUID = layout.offsetof(3);
        DEVICELUID = layout.offsetof(4);
        DEVICENODEMASK = layout.offsetof(5);
        DEVICELUIDVALID = layout.offsetof(6);
        SUBGROUPSIZE = layout.offsetof(7);
        SUBGROUPSUPPORTEDSTAGES = layout.offsetof(8);
        SUBGROUPSUPPORTEDOPERATIONS = layout.offsetof(9);
        SUBGROUPQUADOPERATIONSINALLSTAGES = layout.offsetof(10);
        POINTCLIPPINGBEHAVIOR = layout.offsetof(11);
        MAXMULTIVIEWVIEWCOUNT = layout.offsetof(12);
        MAXMULTIVIEWINSTANCEINDEX = layout.offsetof(13);
        PROTECTEDNOFAULT = layout.offsetof(14);
        MAXPERSETDESCRIPTORS = layout.offsetof(15);
        MAXMEMORYALLOCATIONSIZE = layout.offsetof(16);
    }

    protected VkPhysicalDeviceVulkan11Properties(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceVulkan11Properties create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceVulkan11Properties(address, container);
    }

    public VkPhysicalDeviceVulkan11Properties(ByteBuffer container) {
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

    @NativeType("uint8_t[VK_UUID_SIZE]")
    public ByteBuffer deviceUUID() {
        return ndeviceUUID(address());
    }

    @NativeType("uint8_t")
    public byte deviceUUID(int index) {
        return ndeviceUUID(address(), index);
    }

    @NativeType("uint8_t[VK_UUID_SIZE]")
    public ByteBuffer driverUUID() {
        return ndriverUUID(address());
    }

    @NativeType("uint8_t")
    public byte driverUUID(int index) {
        return ndriverUUID(address(), index);
    }

    @NativeType("uint8_t[VK_LUID_SIZE]")
    public ByteBuffer deviceLUID() {
        return ndeviceLUID(address());
    }

    @NativeType("uint8_t")
    public byte deviceLUID(int index) {
        return ndeviceLUID(address(), index);
    }

    @NativeType("uint32_t")
    public int deviceNodeMask() {
        return ndeviceNodeMask(address());
    }

    @NativeType("VkBool32")
    public boolean deviceLUIDValid() {
        return ndeviceLUIDValid(address()) != 0;
    }

    @NativeType("uint32_t")
    public int subgroupSize() {
        return nsubgroupSize(address());
    }

    @NativeType("VkShaderStageFlags")
    public int subgroupSupportedStages() {
        return nsubgroupSupportedStages(address());
    }

    @NativeType("VkSubgroupFeatureFlags")
    public int subgroupSupportedOperations() {
        return nsubgroupSupportedOperations(address());
    }

    @NativeType("VkBool32")
    public boolean subgroupQuadOperationsInAllStages() {
        return nsubgroupQuadOperationsInAllStages(address()) != 0;
    }

    @NativeType("VkPointClippingBehavior")
    public int pointClippingBehavior() {
        return npointClippingBehavior(address());
    }

    @NativeType("uint32_t")
    public int maxMultiviewViewCount() {
        return nmaxMultiviewViewCount(address());
    }

    @NativeType("uint32_t")
    public int maxMultiviewInstanceIndex() {
        return nmaxMultiviewInstanceIndex(address());
    }

    @NativeType("VkBool32")
    public boolean protectedNoFault() {
        return nprotectedNoFault(address()) != 0;
    }

    @NativeType("uint32_t")
    public int maxPerSetDescriptors() {
        return nmaxPerSetDescriptors(address());
    }

    @NativeType("VkDeviceSize")
    public long maxMemoryAllocationSize() {
        return nmaxMemoryAllocationSize(address());
    }

    public VkPhysicalDeviceVulkan11Properties sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceVulkan11Properties sType$Default() {
        return sType(50);
    }

    public VkPhysicalDeviceVulkan11Properties pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceVulkan11Properties set(int sType, long pNext) {
        sType(sType);
        pNext(pNext);
        return this;
    }

    public VkPhysicalDeviceVulkan11Properties set(VkPhysicalDeviceVulkan11Properties src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceVulkan11Properties malloc() {
        return new VkPhysicalDeviceVulkan11Properties(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceVulkan11Properties calloc() {
        return new VkPhysicalDeviceVulkan11Properties(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceVulkan11Properties create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceVulkan11Properties(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceVulkan11Properties create(long address) {
        return new VkPhysicalDeviceVulkan11Properties(address, null);
    }

    public static VkPhysicalDeviceVulkan11Properties createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceVulkan11Properties(address, null);
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

    public static VkPhysicalDeviceVulkan11Properties malloc(MemoryStack stack) {
        return new VkPhysicalDeviceVulkan11Properties(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceVulkan11Properties calloc(MemoryStack stack) {
        return new VkPhysicalDeviceVulkan11Properties(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static ByteBuffer ndeviceUUID(long struct) {
        return MemoryUtil.memByteBuffer(struct + DEVICEUUID, 16);
    }

    public static byte ndeviceUUID(long struct, int index) {
        return MemoryUtil.memGetByte(struct + DEVICEUUID + (Checks.check(index, 16) * 1));
    }

    public static ByteBuffer ndriverUUID(long struct) {
        return MemoryUtil.memByteBuffer(struct + DRIVERUUID, 16);
    }

    public static byte ndriverUUID(long struct, int index) {
        return MemoryUtil.memGetByte(struct + DRIVERUUID + (Checks.check(index, 16) * 1));
    }

    public static ByteBuffer ndeviceLUID(long struct) {
        return MemoryUtil.memByteBuffer(struct + DEVICELUID, 8);
    }

    public static byte ndeviceLUID(long struct, int index) {
        return MemoryUtil.memGetByte(struct + DEVICELUID + (Checks.check(index, 8) * 1));
    }

    public static int ndeviceNodeMask(long struct) {
        return MemoryUtil.memGetInt(struct + DEVICENODEMASK);
    }

    public static int ndeviceLUIDValid(long struct) {
        return MemoryUtil.memGetInt(struct + DEVICELUIDVALID);
    }

    public static int nsubgroupSize(long struct) {
        return MemoryUtil.memGetInt(struct + SUBGROUPSIZE);
    }

    public static int nsubgroupSupportedStages(long struct) {
        return MemoryUtil.memGetInt(struct + SUBGROUPSUPPORTEDSTAGES);
    }

    public static int nsubgroupSupportedOperations(long struct) {
        return MemoryUtil.memGetInt(struct + SUBGROUPSUPPORTEDOPERATIONS);
    }

    public static int nsubgroupQuadOperationsInAllStages(long struct) {
        return MemoryUtil.memGetInt(struct + SUBGROUPQUADOPERATIONSINALLSTAGES);
    }

    public static int npointClippingBehavior(long struct) {
        return MemoryUtil.memGetInt(struct + POINTCLIPPINGBEHAVIOR);
    }

    public static int nmaxMultiviewViewCount(long struct) {
        return MemoryUtil.memGetInt(struct + MAXMULTIVIEWVIEWCOUNT);
    }

    public static int nmaxMultiviewInstanceIndex(long struct) {
        return MemoryUtil.memGetInt(struct + MAXMULTIVIEWINSTANCEINDEX);
    }

    public static int nprotectedNoFault(long struct) {
        return MemoryUtil.memGetInt(struct + PROTECTEDNOFAULT);
    }

    public static int nmaxPerSetDescriptors(long struct) {
        return MemoryUtil.memGetInt(struct + MAXPERSETDESCRIPTORS);
    }

    public static long nmaxMemoryAllocationSize(long struct) {
        return MemoryUtil.memGetLong(struct + MAXMEMORYALLOCATIONSIZE);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceVulkan11Properties$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceVulkan11Properties$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceVulkan11Properties, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceVulkan11Properties ELEMENT_FACTORY = VkPhysicalDeviceVulkan11Properties.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceVulkan11Properties.SIZEOF);
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
        public VkPhysicalDeviceVulkan11Properties getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceVulkan11Properties.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceVulkan11Properties.npNext(address());
        }

        @NativeType("uint8_t[VK_UUID_SIZE]")
        public ByteBuffer deviceUUID() {
            return VkPhysicalDeviceVulkan11Properties.ndeviceUUID(address());
        }

        @NativeType("uint8_t")
        public byte deviceUUID(int index) {
            return VkPhysicalDeviceVulkan11Properties.ndeviceUUID(address(), index);
        }

        @NativeType("uint8_t[VK_UUID_SIZE]")
        public ByteBuffer driverUUID() {
            return VkPhysicalDeviceVulkan11Properties.ndriverUUID(address());
        }

        @NativeType("uint8_t")
        public byte driverUUID(int index) {
            return VkPhysicalDeviceVulkan11Properties.ndriverUUID(address(), index);
        }

        @NativeType("uint8_t[VK_LUID_SIZE]")
        public ByteBuffer deviceLUID() {
            return VkPhysicalDeviceVulkan11Properties.ndeviceLUID(address());
        }

        @NativeType("uint8_t")
        public byte deviceLUID(int index) {
            return VkPhysicalDeviceVulkan11Properties.ndeviceLUID(address(), index);
        }

        @NativeType("uint32_t")
        public int deviceNodeMask() {
            return VkPhysicalDeviceVulkan11Properties.ndeviceNodeMask(address());
        }

        @NativeType("VkBool32")
        public boolean deviceLUIDValid() {
            return VkPhysicalDeviceVulkan11Properties.ndeviceLUIDValid(address()) != 0;
        }

        @NativeType("uint32_t")
        public int subgroupSize() {
            return VkPhysicalDeviceVulkan11Properties.nsubgroupSize(address());
        }

        @NativeType("VkShaderStageFlags")
        public int subgroupSupportedStages() {
            return VkPhysicalDeviceVulkan11Properties.nsubgroupSupportedStages(address());
        }

        @NativeType("VkSubgroupFeatureFlags")
        public int subgroupSupportedOperations() {
            return VkPhysicalDeviceVulkan11Properties.nsubgroupSupportedOperations(address());
        }

        @NativeType("VkBool32")
        public boolean subgroupQuadOperationsInAllStages() {
            return VkPhysicalDeviceVulkan11Properties.nsubgroupQuadOperationsInAllStages(address()) != 0;
        }

        @NativeType("VkPointClippingBehavior")
        public int pointClippingBehavior() {
            return VkPhysicalDeviceVulkan11Properties.npointClippingBehavior(address());
        }

        @NativeType("uint32_t")
        public int maxMultiviewViewCount() {
            return VkPhysicalDeviceVulkan11Properties.nmaxMultiviewViewCount(address());
        }

        @NativeType("uint32_t")
        public int maxMultiviewInstanceIndex() {
            return VkPhysicalDeviceVulkan11Properties.nmaxMultiviewInstanceIndex(address());
        }

        @NativeType("VkBool32")
        public boolean protectedNoFault() {
            return VkPhysicalDeviceVulkan11Properties.nprotectedNoFault(address()) != 0;
        }

        @NativeType("uint32_t")
        public int maxPerSetDescriptors() {
            return VkPhysicalDeviceVulkan11Properties.nmaxPerSetDescriptors(address());
        }

        @NativeType("VkDeviceSize")
        public long maxMemoryAllocationSize() {
            return VkPhysicalDeviceVulkan11Properties.nmaxMemoryAllocationSize(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceVulkan11Properties.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(50);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceVulkan11Properties.npNext(address(), value);
            return this;
        }
    }
}
