package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkQueueFamilyOwnershipTransferPropertiesKHR.class */
public class VkQueueFamilyOwnershipTransferPropertiesKHR extends Struct<VkQueueFamilyOwnershipTransferPropertiesKHR> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int OPTIMALIMAGETRANSFERTOQUEUEFAMILIES;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        OPTIMALIMAGETRANSFERTOQUEUEFAMILIES = layout.offsetof(2);
    }

    protected VkQueueFamilyOwnershipTransferPropertiesKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkQueueFamilyOwnershipTransferPropertiesKHR create(long address, ByteBuffer container) {
        return new VkQueueFamilyOwnershipTransferPropertiesKHR(address, container);
    }

    public VkQueueFamilyOwnershipTransferPropertiesKHR(ByteBuffer container) {
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
    public int optimalImageTransferToQueueFamilies() {
        return noptimalImageTransferToQueueFamilies(address());
    }

    public VkQueueFamilyOwnershipTransferPropertiesKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkQueueFamilyOwnershipTransferPropertiesKHR sType$Default() {
        return sType(KHRMaintenance9.VK_STRUCTURE_TYPE_QUEUE_FAMILY_OWNERSHIP_TRANSFER_PROPERTIES_KHR);
    }

    public VkQueueFamilyOwnershipTransferPropertiesKHR pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkQueueFamilyOwnershipTransferPropertiesKHR set(int sType, long pNext) {
        sType(sType);
        pNext(pNext);
        return this;
    }

    public VkQueueFamilyOwnershipTransferPropertiesKHR set(VkQueueFamilyOwnershipTransferPropertiesKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkQueueFamilyOwnershipTransferPropertiesKHR malloc() {
        return new VkQueueFamilyOwnershipTransferPropertiesKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkQueueFamilyOwnershipTransferPropertiesKHR calloc() {
        return new VkQueueFamilyOwnershipTransferPropertiesKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkQueueFamilyOwnershipTransferPropertiesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkQueueFamilyOwnershipTransferPropertiesKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkQueueFamilyOwnershipTransferPropertiesKHR create(long address) {
        return new VkQueueFamilyOwnershipTransferPropertiesKHR(address, null);
    }

    public static VkQueueFamilyOwnershipTransferPropertiesKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkQueueFamilyOwnershipTransferPropertiesKHR(address, null);
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

    public static VkQueueFamilyOwnershipTransferPropertiesKHR malloc(MemoryStack stack) {
        return new VkQueueFamilyOwnershipTransferPropertiesKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkQueueFamilyOwnershipTransferPropertiesKHR calloc(MemoryStack stack) {
        return new VkQueueFamilyOwnershipTransferPropertiesKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int noptimalImageTransferToQueueFamilies(long struct) {
        return MemoryUtil.memGetInt(struct + OPTIMALIMAGETRANSFERTOQUEUEFAMILIES);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkQueueFamilyOwnershipTransferPropertiesKHR$Buffer.class */
    public static class Buffer extends StructBuffer<VkQueueFamilyOwnershipTransferPropertiesKHR, Buffer> implements NativeResource {
        private static final VkQueueFamilyOwnershipTransferPropertiesKHR ELEMENT_FACTORY = VkQueueFamilyOwnershipTransferPropertiesKHR.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkQueueFamilyOwnershipTransferPropertiesKHR.SIZEOF);
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
        public VkQueueFamilyOwnershipTransferPropertiesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkQueueFamilyOwnershipTransferPropertiesKHR.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkQueueFamilyOwnershipTransferPropertiesKHR.npNext(address());
        }

        @NativeType("uint32_t")
        public int optimalImageTransferToQueueFamilies() {
            return VkQueueFamilyOwnershipTransferPropertiesKHR.noptimalImageTransferToQueueFamilies(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkQueueFamilyOwnershipTransferPropertiesKHR.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(KHRMaintenance9.VK_STRUCTURE_TYPE_QUEUE_FAMILY_OWNERSHIP_TRANSFER_PROPERTIES_KHR);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkQueueFamilyOwnershipTransferPropertiesKHR.npNext(address(), value);
            return this;
        }
    }
}
