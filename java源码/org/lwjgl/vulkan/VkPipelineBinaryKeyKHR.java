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

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineBinaryKeyKHR.class */
public class VkPipelineBinaryKeyKHR extends Struct<VkPipelineBinaryKeyKHR> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int KEYSIZE;
    public static final int KEY;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __array(1, 32));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        KEYSIZE = layout.offsetof(2);
        KEY = layout.offsetof(3);
    }

    protected VkPipelineBinaryKeyKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPipelineBinaryKeyKHR create(long address, ByteBuffer container) {
        return new VkPipelineBinaryKeyKHR(address, container);
    }

    public VkPipelineBinaryKeyKHR(ByteBuffer container) {
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
    public int keySize() {
        return nkeySize(address());
    }

    @NativeType("uint8_t[VK_MAX_PIPELINE_BINARY_KEY_SIZE_KHR]")
    public ByteBuffer key() {
        return nkey(address());
    }

    @NativeType("uint8_t")
    public byte key(int index) {
        return nkey(address(), index);
    }

    public VkPipelineBinaryKeyKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPipelineBinaryKeyKHR sType$Default() {
        return sType(KHRPipelineBinary.VK_STRUCTURE_TYPE_PIPELINE_BINARY_KEY_KHR);
    }

    public VkPipelineBinaryKeyKHR pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPipelineBinaryKeyKHR keySize(@NativeType("uint32_t") int value) {
        nkeySize(address(), value);
        return this;
    }

    public VkPipelineBinaryKeyKHR key(@NativeType("uint8_t[VK_MAX_PIPELINE_BINARY_KEY_SIZE_KHR]") ByteBuffer value) {
        nkey(address(), value);
        return this;
    }

    public VkPipelineBinaryKeyKHR key(int index, @NativeType("uint8_t") byte value) {
        nkey(address(), index, value);
        return this;
    }

    public VkPipelineBinaryKeyKHR set(int sType, long pNext, int keySize, ByteBuffer key) {
        sType(sType);
        pNext(pNext);
        keySize(keySize);
        key(key);
        return this;
    }

    public VkPipelineBinaryKeyKHR set(VkPipelineBinaryKeyKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPipelineBinaryKeyKHR malloc() {
        return new VkPipelineBinaryKeyKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPipelineBinaryKeyKHR calloc() {
        return new VkPipelineBinaryKeyKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPipelineBinaryKeyKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPipelineBinaryKeyKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkPipelineBinaryKeyKHR create(long address) {
        return new VkPipelineBinaryKeyKHR(address, null);
    }

    public static VkPipelineBinaryKeyKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPipelineBinaryKeyKHR(address, null);
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

    public static VkPipelineBinaryKeyKHR malloc(MemoryStack stack) {
        return new VkPipelineBinaryKeyKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPipelineBinaryKeyKHR calloc(MemoryStack stack) {
        return new VkPipelineBinaryKeyKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nkeySize(long struct) {
        return MemoryUtil.memGetInt(struct + KEYSIZE);
    }

    public static ByteBuffer nkey(long struct) {
        return MemoryUtil.memByteBuffer(struct + KEY, 32);
    }

    public static byte nkey(long struct, int index) {
        return MemoryUtil.memGetByte(struct + KEY + (Checks.check(index, 32) * 1));
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nkeySize(long struct, int value) {
        MemoryUtil.memPutInt(struct + KEYSIZE, value);
    }

    public static void nkey(long struct, ByteBuffer value) {
        if (Checks.CHECKS) {
            Checks.checkGT(value, 32);
        }
        MemoryUtil.memCopy(MemoryUtil.memAddress(value), struct + KEY, value.remaining() * 1);
    }

    public static void nkey(long struct, int index, byte value) {
        MemoryUtil.memPutByte(struct + KEY + (Checks.check(index, 32) * 1), value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineBinaryKeyKHR$Buffer.class */
    public static class Buffer extends StructBuffer<VkPipelineBinaryKeyKHR, Buffer> implements NativeResource {
        private static final VkPipelineBinaryKeyKHR ELEMENT_FACTORY = VkPipelineBinaryKeyKHR.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPipelineBinaryKeyKHR.SIZEOF);
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
        public VkPipelineBinaryKeyKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPipelineBinaryKeyKHR.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPipelineBinaryKeyKHR.npNext(address());
        }

        @NativeType("uint32_t")
        public int keySize() {
            return VkPipelineBinaryKeyKHR.nkeySize(address());
        }

        @NativeType("uint8_t[VK_MAX_PIPELINE_BINARY_KEY_SIZE_KHR]")
        public ByteBuffer key() {
            return VkPipelineBinaryKeyKHR.nkey(address());
        }

        @NativeType("uint8_t")
        public byte key(int index) {
            return VkPipelineBinaryKeyKHR.nkey(address(), index);
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPipelineBinaryKeyKHR.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(KHRPipelineBinary.VK_STRUCTURE_TYPE_PIPELINE_BINARY_KEY_KHR);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPipelineBinaryKeyKHR.npNext(address(), value);
            return this;
        }

        public Buffer keySize(@NativeType("uint32_t") int value) {
            VkPipelineBinaryKeyKHR.nkeySize(address(), value);
            return this;
        }

        public Buffer key(@NativeType("uint8_t[VK_MAX_PIPELINE_BINARY_KEY_SIZE_KHR]") ByteBuffer value) {
            VkPipelineBinaryKeyKHR.nkey(address(), value);
            return this;
        }

        public Buffer key(int index, @NativeType("uint8_t") byte value) {
            VkPipelineBinaryKeyKHR.nkey(address(), index, value);
            return this;
        }
    }
}
