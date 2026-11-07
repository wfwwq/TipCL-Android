package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDevicePushConstantBankPropertiesNV.class */
public class VkPhysicalDevicePushConstantBankPropertiesNV extends Struct<VkPhysicalDevicePushConstantBankPropertiesNV> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int MAXGRAPHICSPUSHCONSTANTBANKS;
    public static final int MAXCOMPUTEPUSHCONSTANTBANKS;
    public static final int MAXGRAPHICSPUSHDATABANKS;
    public static final int MAXCOMPUTEPUSHDATABANKS;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        MAXGRAPHICSPUSHCONSTANTBANKS = layout.offsetof(2);
        MAXCOMPUTEPUSHCONSTANTBANKS = layout.offsetof(3);
        MAXGRAPHICSPUSHDATABANKS = layout.offsetof(4);
        MAXCOMPUTEPUSHDATABANKS = layout.offsetof(5);
    }

    protected VkPhysicalDevicePushConstantBankPropertiesNV(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDevicePushConstantBankPropertiesNV create(long address, ByteBuffer container) {
        return new VkPhysicalDevicePushConstantBankPropertiesNV(address, container);
    }

    public VkPhysicalDevicePushConstantBankPropertiesNV(ByteBuffer container) {
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
    public int maxGraphicsPushConstantBanks() {
        return nmaxGraphicsPushConstantBanks(address());
    }

    @NativeType("uint32_t")
    public int maxComputePushConstantBanks() {
        return nmaxComputePushConstantBanks(address());
    }

    @NativeType("uint32_t")
    public int maxGraphicsPushDataBanks() {
        return nmaxGraphicsPushDataBanks(address());
    }

    @NativeType("uint32_t")
    public int maxComputePushDataBanks() {
        return nmaxComputePushDataBanks(address());
    }

    public VkPhysicalDevicePushConstantBankPropertiesNV sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDevicePushConstantBankPropertiesNV sType$Default() {
        return sType(NVPushConstantBank.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PUSH_CONSTANT_BANK_PROPERTIES_NV);
    }

    public VkPhysicalDevicePushConstantBankPropertiesNV pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDevicePushConstantBankPropertiesNV set(int sType, long pNext) {
        sType(sType);
        pNext(pNext);
        return this;
    }

    public VkPhysicalDevicePushConstantBankPropertiesNV set(VkPhysicalDevicePushConstantBankPropertiesNV src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDevicePushConstantBankPropertiesNV malloc() {
        return new VkPhysicalDevicePushConstantBankPropertiesNV(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDevicePushConstantBankPropertiesNV calloc() {
        return new VkPhysicalDevicePushConstantBankPropertiesNV(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDevicePushConstantBankPropertiesNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDevicePushConstantBankPropertiesNV(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDevicePushConstantBankPropertiesNV create(long address) {
        return new VkPhysicalDevicePushConstantBankPropertiesNV(address, null);
    }

    public static VkPhysicalDevicePushConstantBankPropertiesNV createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDevicePushConstantBankPropertiesNV(address, null);
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

    public static VkPhysicalDevicePushConstantBankPropertiesNV malloc(MemoryStack stack) {
        return new VkPhysicalDevicePushConstantBankPropertiesNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDevicePushConstantBankPropertiesNV calloc(MemoryStack stack) {
        return new VkPhysicalDevicePushConstantBankPropertiesNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nmaxGraphicsPushConstantBanks(long struct) {
        return MemoryUtil.memGetInt(struct + MAXGRAPHICSPUSHCONSTANTBANKS);
    }

    public static int nmaxComputePushConstantBanks(long struct) {
        return MemoryUtil.memGetInt(struct + MAXCOMPUTEPUSHCONSTANTBANKS);
    }

    public static int nmaxGraphicsPushDataBanks(long struct) {
        return MemoryUtil.memGetInt(struct + MAXGRAPHICSPUSHDATABANKS);
    }

    public static int nmaxComputePushDataBanks(long struct) {
        return MemoryUtil.memGetInt(struct + MAXCOMPUTEPUSHDATABANKS);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDevicePushConstantBankPropertiesNV$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDevicePushConstantBankPropertiesNV, Buffer> implements NativeResource {
        private static final VkPhysicalDevicePushConstantBankPropertiesNV ELEMENT_FACTORY = VkPhysicalDevicePushConstantBankPropertiesNV.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDevicePushConstantBankPropertiesNV.SIZEOF);
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
        public VkPhysicalDevicePushConstantBankPropertiesNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDevicePushConstantBankPropertiesNV.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDevicePushConstantBankPropertiesNV.npNext(address());
        }

        @NativeType("uint32_t")
        public int maxGraphicsPushConstantBanks() {
            return VkPhysicalDevicePushConstantBankPropertiesNV.nmaxGraphicsPushConstantBanks(address());
        }

        @NativeType("uint32_t")
        public int maxComputePushConstantBanks() {
            return VkPhysicalDevicePushConstantBankPropertiesNV.nmaxComputePushConstantBanks(address());
        }

        @NativeType("uint32_t")
        public int maxGraphicsPushDataBanks() {
            return VkPhysicalDevicePushConstantBankPropertiesNV.nmaxGraphicsPushDataBanks(address());
        }

        @NativeType("uint32_t")
        public int maxComputePushDataBanks() {
            return VkPhysicalDevicePushConstantBankPropertiesNV.nmaxComputePushDataBanks(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDevicePushConstantBankPropertiesNV.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(NVPushConstantBank.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PUSH_CONSTANT_BANK_PROPERTIES_NV);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDevicePushConstantBankPropertiesNV.npNext(address(), value);
            return this;
        }
    }
}
