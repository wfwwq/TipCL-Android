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

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSwapchainPresentFenceInfoKHR.class */
public class VkSwapchainPresentFenceInfoKHR extends Struct<VkSwapchainPresentFenceInfoKHR> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int SWAPCHAINCOUNT;
    public static final int PFENCES;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SWAPCHAINCOUNT = layout.offsetof(2);
        PFENCES = layout.offsetof(3);
    }

    protected VkSwapchainPresentFenceInfoKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkSwapchainPresentFenceInfoKHR create(long address, ByteBuffer container) {
        return new VkSwapchainPresentFenceInfoKHR(address, container);
    }

    public VkSwapchainPresentFenceInfoKHR(ByteBuffer container) {
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

    @NativeType("VkFence const *")
    public LongBuffer pFences() {
        return npFences(address());
    }

    public VkSwapchainPresentFenceInfoKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkSwapchainPresentFenceInfoKHR sType$Default() {
        return sType(1000275001);
    }

    public VkSwapchainPresentFenceInfoKHR pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkSwapchainPresentFenceInfoKHR swapchainCount(@NativeType("uint32_t") int value) {
        nswapchainCount(address(), value);
        return this;
    }

    public VkSwapchainPresentFenceInfoKHR pFences(@NativeType("VkFence const *") LongBuffer value) {
        npFences(address(), value);
        return this;
    }

    public VkSwapchainPresentFenceInfoKHR set(int sType, long pNext, int swapchainCount, LongBuffer pFences) {
        sType(sType);
        pNext(pNext);
        swapchainCount(swapchainCount);
        pFences(pFences);
        return this;
    }

    public VkSwapchainPresentFenceInfoKHR set(VkSwapchainPresentFenceInfoKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkSwapchainPresentFenceInfoKHR malloc() {
        return new VkSwapchainPresentFenceInfoKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkSwapchainPresentFenceInfoKHR calloc() {
        return new VkSwapchainPresentFenceInfoKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkSwapchainPresentFenceInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkSwapchainPresentFenceInfoKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkSwapchainPresentFenceInfoKHR create(long address) {
        return new VkSwapchainPresentFenceInfoKHR(address, null);
    }

    public static VkSwapchainPresentFenceInfoKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkSwapchainPresentFenceInfoKHR(address, null);
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

    public static VkSwapchainPresentFenceInfoKHR malloc(MemoryStack stack) {
        return new VkSwapchainPresentFenceInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkSwapchainPresentFenceInfoKHR calloc(MemoryStack stack) {
        return new VkSwapchainPresentFenceInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static LongBuffer npFences(long struct) {
        return MemoryUtil.memLongBufferSafe(MemoryUtil.memGetAddress(struct + PFENCES), nswapchainCount(struct));
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

    public static void npFences(long struct, LongBuffer value) {
        MemoryUtil.memPutAddress(struct + PFENCES, MemoryUtil.memAddressSafe(value));
        if (value != null) {
            nswapchainCount(struct, value.remaining());
        }
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSwapchainPresentFenceInfoKHR$Buffer.class */
    public static class Buffer extends StructBuffer<VkSwapchainPresentFenceInfoKHR, Buffer> implements NativeResource {
        private static final VkSwapchainPresentFenceInfoKHR ELEMENT_FACTORY = VkSwapchainPresentFenceInfoKHR.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkSwapchainPresentFenceInfoKHR.SIZEOF);
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
        public VkSwapchainPresentFenceInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkSwapchainPresentFenceInfoKHR.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkSwapchainPresentFenceInfoKHR.npNext(address());
        }

        @NativeType("uint32_t")
        public int swapchainCount() {
            return VkSwapchainPresentFenceInfoKHR.nswapchainCount(address());
        }

        @NativeType("VkFence const *")
        public LongBuffer pFences() {
            return VkSwapchainPresentFenceInfoKHR.npFences(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkSwapchainPresentFenceInfoKHR.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000275001);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkSwapchainPresentFenceInfoKHR.npNext(address(), value);
            return this;
        }

        public Buffer swapchainCount(@NativeType("uint32_t") int value) {
            VkSwapchainPresentFenceInfoKHR.nswapchainCount(address(), value);
            return this;
        }

        public Buffer pFences(@NativeType("VkFence const *") LongBuffer value) {
            VkSwapchainPresentFenceInfoKHR.npFences(address(), value);
            return this;
        }
    }
}
