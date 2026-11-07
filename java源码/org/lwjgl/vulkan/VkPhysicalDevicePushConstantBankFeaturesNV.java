package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDevicePushConstantBankFeaturesNV.class */
public class VkPhysicalDevicePushConstantBankFeaturesNV extends Struct<VkPhysicalDevicePushConstantBankFeaturesNV> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int PUSHCONSTANTBANK;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        PUSHCONSTANTBANK = layout.offsetof(2);
    }

    protected VkPhysicalDevicePushConstantBankFeaturesNV(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDevicePushConstantBankFeaturesNV create(long address, ByteBuffer container) {
        return new VkPhysicalDevicePushConstantBankFeaturesNV(address, container);
    }

    public VkPhysicalDevicePushConstantBankFeaturesNV(ByteBuffer container) {
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
    public boolean pushConstantBank() {
        return npushConstantBank(address()) != 0;
    }

    public VkPhysicalDevicePushConstantBankFeaturesNV sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDevicePushConstantBankFeaturesNV sType$Default() {
        return sType(NVPushConstantBank.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PUSH_CONSTANT_BANK_FEATURES_NV);
    }

    public VkPhysicalDevicePushConstantBankFeaturesNV pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDevicePushConstantBankFeaturesNV pushConstantBank(@NativeType("VkBool32") boolean value) {
        npushConstantBank(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDevicePushConstantBankFeaturesNV set(int sType, long pNext, boolean pushConstantBank) {
        sType(sType);
        pNext(pNext);
        pushConstantBank(pushConstantBank);
        return this;
    }

    public VkPhysicalDevicePushConstantBankFeaturesNV set(VkPhysicalDevicePushConstantBankFeaturesNV src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDevicePushConstantBankFeaturesNV malloc() {
        return new VkPhysicalDevicePushConstantBankFeaturesNV(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDevicePushConstantBankFeaturesNV calloc() {
        return new VkPhysicalDevicePushConstantBankFeaturesNV(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDevicePushConstantBankFeaturesNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDevicePushConstantBankFeaturesNV(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDevicePushConstantBankFeaturesNV create(long address) {
        return new VkPhysicalDevicePushConstantBankFeaturesNV(address, null);
    }

    public static VkPhysicalDevicePushConstantBankFeaturesNV createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDevicePushConstantBankFeaturesNV(address, null);
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

    public static VkPhysicalDevicePushConstantBankFeaturesNV malloc(MemoryStack stack) {
        return new VkPhysicalDevicePushConstantBankFeaturesNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDevicePushConstantBankFeaturesNV calloc(MemoryStack stack) {
        return new VkPhysicalDevicePushConstantBankFeaturesNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int npushConstantBank(long struct) {
        return MemoryUtil.memGetInt(struct + PUSHCONSTANTBANK);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void npushConstantBank(long struct, int value) {
        MemoryUtil.memPutInt(struct + PUSHCONSTANTBANK, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDevicePushConstantBankFeaturesNV$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDevicePushConstantBankFeaturesNV, Buffer> implements NativeResource {
        private static final VkPhysicalDevicePushConstantBankFeaturesNV ELEMENT_FACTORY = VkPhysicalDevicePushConstantBankFeaturesNV.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDevicePushConstantBankFeaturesNV.SIZEOF);
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
        public VkPhysicalDevicePushConstantBankFeaturesNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDevicePushConstantBankFeaturesNV.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDevicePushConstantBankFeaturesNV.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean pushConstantBank() {
            return VkPhysicalDevicePushConstantBankFeaturesNV.npushConstantBank(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDevicePushConstantBankFeaturesNV.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(NVPushConstantBank.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PUSH_CONSTANT_BANK_FEATURES_NV);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDevicePushConstantBankFeaturesNV.npNext(address(), value);
            return this;
        }

        public Buffer pushConstantBank(@NativeType("VkBool32") boolean value) {
            VkPhysicalDevicePushConstantBankFeaturesNV.npushConstantBank(address(), value ? 1 : 0);
            return this;
        }
    }
}
