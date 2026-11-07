package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceMaintenance7PropertiesKHR.class */
public class VkPhysicalDeviceMaintenance7PropertiesKHR extends Struct<VkPhysicalDeviceMaintenance7PropertiesKHR> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int ROBUSTFRAGMENTSHADINGRATEATTACHMENTACCESS;
    public static final int SEPARATEDEPTHSTENCILATTACHMENTACCESS;
    public static final int MAXDESCRIPTORSETTOTALUNIFORMBUFFERSDYNAMIC;
    public static final int MAXDESCRIPTORSETTOTALSTORAGEBUFFERSDYNAMIC;
    public static final int MAXDESCRIPTORSETTOTALBUFFERSDYNAMIC;
    public static final int MAXDESCRIPTORSETUPDATEAFTERBINDTOTALUNIFORMBUFFERSDYNAMIC;
    public static final int MAXDESCRIPTORSETUPDATEAFTERBINDTOTALSTORAGEBUFFERSDYNAMIC;
    public static final int MAXDESCRIPTORSETUPDATEAFTERBINDTOTALBUFFERSDYNAMIC;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        ROBUSTFRAGMENTSHADINGRATEATTACHMENTACCESS = layout.offsetof(2);
        SEPARATEDEPTHSTENCILATTACHMENTACCESS = layout.offsetof(3);
        MAXDESCRIPTORSETTOTALUNIFORMBUFFERSDYNAMIC = layout.offsetof(4);
        MAXDESCRIPTORSETTOTALSTORAGEBUFFERSDYNAMIC = layout.offsetof(5);
        MAXDESCRIPTORSETTOTALBUFFERSDYNAMIC = layout.offsetof(6);
        MAXDESCRIPTORSETUPDATEAFTERBINDTOTALUNIFORMBUFFERSDYNAMIC = layout.offsetof(7);
        MAXDESCRIPTORSETUPDATEAFTERBINDTOTALSTORAGEBUFFERSDYNAMIC = layout.offsetof(8);
        MAXDESCRIPTORSETUPDATEAFTERBINDTOTALBUFFERSDYNAMIC = layout.offsetof(9);
    }

    protected VkPhysicalDeviceMaintenance7PropertiesKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceMaintenance7PropertiesKHR create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceMaintenance7PropertiesKHR(address, container);
    }

    public VkPhysicalDeviceMaintenance7PropertiesKHR(ByteBuffer container) {
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
    public boolean robustFragmentShadingRateAttachmentAccess() {
        return nrobustFragmentShadingRateAttachmentAccess(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean separateDepthStencilAttachmentAccess() {
        return nseparateDepthStencilAttachmentAccess(address()) != 0;
    }

    @NativeType("uint32_t")
    public int maxDescriptorSetTotalUniformBuffersDynamic() {
        return nmaxDescriptorSetTotalUniformBuffersDynamic(address());
    }

    @NativeType("uint32_t")
    public int maxDescriptorSetTotalStorageBuffersDynamic() {
        return nmaxDescriptorSetTotalStorageBuffersDynamic(address());
    }

    @NativeType("uint32_t")
    public int maxDescriptorSetTotalBuffersDynamic() {
        return nmaxDescriptorSetTotalBuffersDynamic(address());
    }

    @NativeType("uint32_t")
    public int maxDescriptorSetUpdateAfterBindTotalUniformBuffersDynamic() {
        return nmaxDescriptorSetUpdateAfterBindTotalUniformBuffersDynamic(address());
    }

    @NativeType("uint32_t")
    public int maxDescriptorSetUpdateAfterBindTotalStorageBuffersDynamic() {
        return nmaxDescriptorSetUpdateAfterBindTotalStorageBuffersDynamic(address());
    }

    @NativeType("uint32_t")
    public int maxDescriptorSetUpdateAfterBindTotalBuffersDynamic() {
        return nmaxDescriptorSetUpdateAfterBindTotalBuffersDynamic(address());
    }

    public VkPhysicalDeviceMaintenance7PropertiesKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceMaintenance7PropertiesKHR sType$Default() {
        return sType(KHRMaintenance7.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_7_PROPERTIES_KHR);
    }

    public VkPhysicalDeviceMaintenance7PropertiesKHR pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceMaintenance7PropertiesKHR set(int sType, long pNext) {
        sType(sType);
        pNext(pNext);
        return this;
    }

    public VkPhysicalDeviceMaintenance7PropertiesKHR set(VkPhysicalDeviceMaintenance7PropertiesKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceMaintenance7PropertiesKHR malloc() {
        return new VkPhysicalDeviceMaintenance7PropertiesKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceMaintenance7PropertiesKHR calloc() {
        return new VkPhysicalDeviceMaintenance7PropertiesKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceMaintenance7PropertiesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceMaintenance7PropertiesKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceMaintenance7PropertiesKHR create(long address) {
        return new VkPhysicalDeviceMaintenance7PropertiesKHR(address, null);
    }

    public static VkPhysicalDeviceMaintenance7PropertiesKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceMaintenance7PropertiesKHR(address, null);
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

    public static VkPhysicalDeviceMaintenance7PropertiesKHR malloc(MemoryStack stack) {
        return new VkPhysicalDeviceMaintenance7PropertiesKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceMaintenance7PropertiesKHR calloc(MemoryStack stack) {
        return new VkPhysicalDeviceMaintenance7PropertiesKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nrobustFragmentShadingRateAttachmentAccess(long struct) {
        return MemoryUtil.memGetInt(struct + ROBUSTFRAGMENTSHADINGRATEATTACHMENTACCESS);
    }

    public static int nseparateDepthStencilAttachmentAccess(long struct) {
        return MemoryUtil.memGetInt(struct + SEPARATEDEPTHSTENCILATTACHMENTACCESS);
    }

    public static int nmaxDescriptorSetTotalUniformBuffersDynamic(long struct) {
        return MemoryUtil.memGetInt(struct + MAXDESCRIPTORSETTOTALUNIFORMBUFFERSDYNAMIC);
    }

    public static int nmaxDescriptorSetTotalStorageBuffersDynamic(long struct) {
        return MemoryUtil.memGetInt(struct + MAXDESCRIPTORSETTOTALSTORAGEBUFFERSDYNAMIC);
    }

    public static int nmaxDescriptorSetTotalBuffersDynamic(long struct) {
        return MemoryUtil.memGetInt(struct + MAXDESCRIPTORSETTOTALBUFFERSDYNAMIC);
    }

    public static int nmaxDescriptorSetUpdateAfterBindTotalUniformBuffersDynamic(long struct) {
        return MemoryUtil.memGetInt(struct + MAXDESCRIPTORSETUPDATEAFTERBINDTOTALUNIFORMBUFFERSDYNAMIC);
    }

    public static int nmaxDescriptorSetUpdateAfterBindTotalStorageBuffersDynamic(long struct) {
        return MemoryUtil.memGetInt(struct + MAXDESCRIPTORSETUPDATEAFTERBINDTOTALSTORAGEBUFFERSDYNAMIC);
    }

    public static int nmaxDescriptorSetUpdateAfterBindTotalBuffersDynamic(long struct) {
        return MemoryUtil.memGetInt(struct + MAXDESCRIPTORSETUPDATEAFTERBINDTOTALBUFFERSDYNAMIC);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceMaintenance7PropertiesKHR$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceMaintenance7PropertiesKHR, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceMaintenance7PropertiesKHR ELEMENT_FACTORY = VkPhysicalDeviceMaintenance7PropertiesKHR.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceMaintenance7PropertiesKHR.SIZEOF);
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
        public VkPhysicalDeviceMaintenance7PropertiesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceMaintenance7PropertiesKHR.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceMaintenance7PropertiesKHR.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean robustFragmentShadingRateAttachmentAccess() {
            return VkPhysicalDeviceMaintenance7PropertiesKHR.nrobustFragmentShadingRateAttachmentAccess(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean separateDepthStencilAttachmentAccess() {
            return VkPhysicalDeviceMaintenance7PropertiesKHR.nseparateDepthStencilAttachmentAccess(address()) != 0;
        }

        @NativeType("uint32_t")
        public int maxDescriptorSetTotalUniformBuffersDynamic() {
            return VkPhysicalDeviceMaintenance7PropertiesKHR.nmaxDescriptorSetTotalUniformBuffersDynamic(address());
        }

        @NativeType("uint32_t")
        public int maxDescriptorSetTotalStorageBuffersDynamic() {
            return VkPhysicalDeviceMaintenance7PropertiesKHR.nmaxDescriptorSetTotalStorageBuffersDynamic(address());
        }

        @NativeType("uint32_t")
        public int maxDescriptorSetTotalBuffersDynamic() {
            return VkPhysicalDeviceMaintenance7PropertiesKHR.nmaxDescriptorSetTotalBuffersDynamic(address());
        }

        @NativeType("uint32_t")
        public int maxDescriptorSetUpdateAfterBindTotalUniformBuffersDynamic() {
            return VkPhysicalDeviceMaintenance7PropertiesKHR.nmaxDescriptorSetUpdateAfterBindTotalUniformBuffersDynamic(address());
        }

        @NativeType("uint32_t")
        public int maxDescriptorSetUpdateAfterBindTotalStorageBuffersDynamic() {
            return VkPhysicalDeviceMaintenance7PropertiesKHR.nmaxDescriptorSetUpdateAfterBindTotalStorageBuffersDynamic(address());
        }

        @NativeType("uint32_t")
        public int maxDescriptorSetUpdateAfterBindTotalBuffersDynamic() {
            return VkPhysicalDeviceMaintenance7PropertiesKHR.nmaxDescriptorSetUpdateAfterBindTotalBuffersDynamic(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceMaintenance7PropertiesKHR.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(KHRMaintenance7.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_7_PROPERTIES_KHR);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceMaintenance7PropertiesKHR.npNext(address(), value);
            return this;
        }
    }
}
