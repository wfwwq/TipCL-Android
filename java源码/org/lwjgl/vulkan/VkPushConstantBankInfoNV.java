package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPushConstantBankInfoNV.class */
public class VkPushConstantBankInfoNV extends Struct<VkPushConstantBankInfoNV> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int BANK;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        BANK = layout.offsetof(2);
    }

    protected VkPushConstantBankInfoNV(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPushConstantBankInfoNV create(long address, ByteBuffer container) {
        return new VkPushConstantBankInfoNV(address, container);
    }

    public VkPushConstantBankInfoNV(ByteBuffer container) {
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

    @NativeType("void const *")
    public long pNext() {
        return npNext(address());
    }

    @NativeType("uint32_t")
    public int bank() {
        return nbank(address());
    }

    public VkPushConstantBankInfoNV sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPushConstantBankInfoNV sType$Default() {
        return sType(NVPushConstantBank.VK_STRUCTURE_TYPE_PUSH_CONSTANT_BANK_INFO_NV);
    }

    public VkPushConstantBankInfoNV pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPushConstantBankInfoNV bank(@NativeType("uint32_t") int value) {
        nbank(address(), value);
        return this;
    }

    public VkPushConstantBankInfoNV set(int sType, long pNext, int bank) {
        sType(sType);
        pNext(pNext);
        bank(bank);
        return this;
    }

    public VkPushConstantBankInfoNV set(VkPushConstantBankInfoNV src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPushConstantBankInfoNV malloc() {
        return new VkPushConstantBankInfoNV(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPushConstantBankInfoNV calloc() {
        return new VkPushConstantBankInfoNV(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPushConstantBankInfoNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPushConstantBankInfoNV(MemoryUtil.memAddress(container), container);
    }

    public static VkPushConstantBankInfoNV create(long address) {
        return new VkPushConstantBankInfoNV(address, null);
    }

    public static VkPushConstantBankInfoNV createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPushConstantBankInfoNV(address, null);
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

    public static VkPushConstantBankInfoNV malloc(MemoryStack stack) {
        return new VkPushConstantBankInfoNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPushConstantBankInfoNV calloc(MemoryStack stack) {
        return new VkPushConstantBankInfoNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nbank(long struct) {
        return MemoryUtil.memGetInt(struct + BANK);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nbank(long struct, int value) {
        MemoryUtil.memPutInt(struct + BANK, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPushConstantBankInfoNV$Buffer.class */
    public static class Buffer extends StructBuffer<VkPushConstantBankInfoNV, Buffer> implements NativeResource {
        private static final VkPushConstantBankInfoNV ELEMENT_FACTORY = VkPushConstantBankInfoNV.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPushConstantBankInfoNV.SIZEOF);
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
        public VkPushConstantBankInfoNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPushConstantBankInfoNV.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkPushConstantBankInfoNV.npNext(address());
        }

        @NativeType("uint32_t")
        public int bank() {
            return VkPushConstantBankInfoNV.nbank(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPushConstantBankInfoNV.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(NVPushConstantBank.VK_STRUCTURE_TYPE_PUSH_CONSTANT_BANK_INFO_NV);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkPushConstantBankInfoNV.npNext(address(), value);
            return this;
        }

        public Buffer bank(@NativeType("uint32_t") int value) {
            VkPushConstantBankInfoNV.nbank(address(), value);
            return this;
        }
    }
}
