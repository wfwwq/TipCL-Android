package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import java.nio.LongBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPresentId2KHR.class */
public class VkPresentId2KHR extends Struct<VkPresentId2KHR> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int SWAPCHAINCOUNT;
    public static final int PPRESENTIDS;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SWAPCHAINCOUNT = layout.offsetof(2);
        PPRESENTIDS = layout.offsetof(3);
    }

    protected VkPresentId2KHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPresentId2KHR create(long address, ByteBuffer container) {
        return new VkPresentId2KHR(address, container);
    }

    public VkPresentId2KHR(ByteBuffer container) {
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
    public int swapchainCount() {
        return nswapchainCount(address());
    }

    @NativeType("uint64_t const *")
    public LongBuffer pPresentIds() {
        return npPresentIds(address());
    }

    public VkPresentId2KHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPresentId2KHR sType$Default() {
        return sType(KHRPresentId2.VK_STRUCTURE_TYPE_PRESENT_ID_2_KHR);
    }

    public VkPresentId2KHR pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPresentId2KHR swapchainCount(@NativeType("uint32_t") int value) {
        nswapchainCount(address(), value);
        return this;
    }

    public VkPresentId2KHR pPresentIds(@NativeType("uint64_t const *") LongBuffer value) {
        npPresentIds(address(), value);
        return this;
    }

    public VkPresentId2KHR set(int sType, long pNext, int swapchainCount, LongBuffer pPresentIds) {
        sType(sType);
        pNext(pNext);
        swapchainCount(swapchainCount);
        pPresentIds(pPresentIds);
        return this;
    }

    public VkPresentId2KHR set(VkPresentId2KHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPresentId2KHR malloc() {
        return new VkPresentId2KHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPresentId2KHR calloc() {
        return new VkPresentId2KHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPresentId2KHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPresentId2KHR(MemoryUtil.memAddress(container), container);
    }

    public static VkPresentId2KHR create(long address) {
        return new VkPresentId2KHR(address, null);
    }

    public static VkPresentId2KHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPresentId2KHR(address, null);
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

    public static VkPresentId2KHR malloc(MemoryStack stack) {
        return new VkPresentId2KHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPresentId2KHR calloc(MemoryStack stack) {
        return new VkPresentId2KHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nswapchainCount(long struct) {
        return MemoryUtil.memGetInt(struct + SWAPCHAINCOUNT);
    }

    public static LongBuffer npPresentIds(long struct) {
        return MemoryUtil.memLongBufferSafe(MemoryUtil.memGetAddress(struct + PPRESENTIDS), nswapchainCount(struct));
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nswapchainCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + SWAPCHAINCOUNT, value);
    }

    public static void npPresentIds(long struct, LongBuffer value) {
        MemoryUtil.memPutAddress(struct + PPRESENTIDS, MemoryUtil.memAddressSafe(value));
        if (value != null) {
            nswapchainCount(struct, value.remaining());
        }
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPresentId2KHR$Buffer.class */
    public static class Buffer extends StructBuffer<VkPresentId2KHR, Buffer> implements NativeResource {
        private static final VkPresentId2KHR ELEMENT_FACTORY = VkPresentId2KHR.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPresentId2KHR.SIZEOF);
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
        public VkPresentId2KHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPresentId2KHR.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkPresentId2KHR.npNext(address());
        }

        @NativeType("uint32_t")
        public int swapchainCount() {
            return VkPresentId2KHR.nswapchainCount(address());
        }

        @NativeType("uint64_t const *")
        public LongBuffer pPresentIds() {
            return VkPresentId2KHR.npPresentIds(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPresentId2KHR.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(KHRPresentId2.VK_STRUCTURE_TYPE_PRESENT_ID_2_KHR);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkPresentId2KHR.npNext(address(), value);
            return this;
        }

        public Buffer swapchainCount(@NativeType("uint32_t") int value) {
            VkPresentId2KHR.nswapchainCount(address(), value);
            return this;
        }

        public Buffer pPresentIds(@NativeType("uint64_t const *") LongBuffer value) {
            VkPresentId2KHR.npPresentIds(address(), value);
            return this;
        }
    }
}
