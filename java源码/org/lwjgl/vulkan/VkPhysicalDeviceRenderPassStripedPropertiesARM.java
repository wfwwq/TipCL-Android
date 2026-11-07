package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceRenderPassStripedPropertiesARM.class */
public class VkPhysicalDeviceRenderPassStripedPropertiesARM extends Struct<VkPhysicalDeviceRenderPassStripedPropertiesARM> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int RENDERPASSSTRIPEGRANULARITY;
    public static final int MAXRENDERPASSSTRIPES;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(VkExtent2D.SIZEOF, VkExtent2D.ALIGNOF), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        RENDERPASSSTRIPEGRANULARITY = layout.offsetof(2);
        MAXRENDERPASSSTRIPES = layout.offsetof(3);
    }

    protected VkPhysicalDeviceRenderPassStripedPropertiesARM(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceRenderPassStripedPropertiesARM create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceRenderPassStripedPropertiesARM(address, container);
    }

    public VkPhysicalDeviceRenderPassStripedPropertiesARM(ByteBuffer container) {
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

    public VkExtent2D renderPassStripeGranularity() {
        return nrenderPassStripeGranularity(address());
    }

    @NativeType("uint32_t")
    public int maxRenderPassStripes() {
        return nmaxRenderPassStripes(address());
    }

    public VkPhysicalDeviceRenderPassStripedPropertiesARM sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceRenderPassStripedPropertiesARM sType$Default() {
        return sType(ARMRenderPassStriped.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_RENDER_PASS_STRIPED_PROPERTIES_ARM);
    }

    public VkPhysicalDeviceRenderPassStripedPropertiesARM pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceRenderPassStripedPropertiesARM set(int sType, long pNext) {
        sType(sType);
        pNext(pNext);
        return this;
    }

    public VkPhysicalDeviceRenderPassStripedPropertiesARM set(VkPhysicalDeviceRenderPassStripedPropertiesARM src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceRenderPassStripedPropertiesARM malloc() {
        return new VkPhysicalDeviceRenderPassStripedPropertiesARM(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceRenderPassStripedPropertiesARM calloc() {
        return new VkPhysicalDeviceRenderPassStripedPropertiesARM(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceRenderPassStripedPropertiesARM create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceRenderPassStripedPropertiesARM(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceRenderPassStripedPropertiesARM create(long address) {
        return new VkPhysicalDeviceRenderPassStripedPropertiesARM(address, null);
    }

    public static VkPhysicalDeviceRenderPassStripedPropertiesARM createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceRenderPassStripedPropertiesARM(address, null);
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

    public static VkPhysicalDeviceRenderPassStripedPropertiesARM malloc(MemoryStack stack) {
        return new VkPhysicalDeviceRenderPassStripedPropertiesARM(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceRenderPassStripedPropertiesARM calloc(MemoryStack stack) {
        return new VkPhysicalDeviceRenderPassStripedPropertiesARM(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static VkExtent2D nrenderPassStripeGranularity(long struct) {
        return VkExtent2D.create(struct + RENDERPASSSTRIPEGRANULARITY);
    }

    public static int nmaxRenderPassStripes(long struct) {
        return MemoryUtil.memGetInt(struct + MAXRENDERPASSSTRIPES);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceRenderPassStripedPropertiesARM$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceRenderPassStripedPropertiesARM, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceRenderPassStripedPropertiesARM ELEMENT_FACTORY = VkPhysicalDeviceRenderPassStripedPropertiesARM.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceRenderPassStripedPropertiesARM.SIZEOF);
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
        public VkPhysicalDeviceRenderPassStripedPropertiesARM getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceRenderPassStripedPropertiesARM.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceRenderPassStripedPropertiesARM.npNext(address());
        }

        public VkExtent2D renderPassStripeGranularity() {
            return VkPhysicalDeviceRenderPassStripedPropertiesARM.nrenderPassStripeGranularity(address());
        }

        @NativeType("uint32_t")
        public int maxRenderPassStripes() {
            return VkPhysicalDeviceRenderPassStripedPropertiesARM.nmaxRenderPassStripes(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceRenderPassStripedPropertiesARM.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(ARMRenderPassStriped.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_RENDER_PASS_STRIPED_PROPERTIES_ARM);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceRenderPassStripedPropertiesARM.npNext(address(), value);
            return this;
        }
    }
}
