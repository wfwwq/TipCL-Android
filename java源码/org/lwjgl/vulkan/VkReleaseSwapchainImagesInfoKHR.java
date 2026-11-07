package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.Checks;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkReleaseSwapchainImagesInfoKHR.class */
public class VkReleaseSwapchainImagesInfoKHR extends Struct<VkReleaseSwapchainImagesInfoKHR> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int SWAPCHAIN;
    public static final int IMAGEINDEXCOUNT;
    public static final int PIMAGEINDICES;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(8), __member(4), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SWAPCHAIN = layout.offsetof(2);
        IMAGEINDEXCOUNT = layout.offsetof(3);
        PIMAGEINDICES = layout.offsetof(4);
    }

    protected VkReleaseSwapchainImagesInfoKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkReleaseSwapchainImagesInfoKHR create(long address, ByteBuffer container) {
        return new VkReleaseSwapchainImagesInfoKHR(address, container);
    }

    public VkReleaseSwapchainImagesInfoKHR(ByteBuffer container) {
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

    @NativeType("VkSwapchainKHR")
    public long swapchain() {
        return nswapchain(address());
    }

    @NativeType("uint32_t")
    public int imageIndexCount() {
        return nimageIndexCount(address());
    }

    @NativeType("uint32_t const *")
    public IntBuffer pImageIndices() {
        return npImageIndices(address());
    }

    public VkReleaseSwapchainImagesInfoKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkReleaseSwapchainImagesInfoKHR sType$Default() {
        return sType(1000275005);
    }

    public VkReleaseSwapchainImagesInfoKHR pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkReleaseSwapchainImagesInfoKHR swapchain(@NativeType("VkSwapchainKHR") long value) {
        nswapchain(address(), value);
        return this;
    }

    public VkReleaseSwapchainImagesInfoKHR pImageIndices(@NativeType("uint32_t const *") IntBuffer value) {
        npImageIndices(address(), value);
        return this;
    }

    public VkReleaseSwapchainImagesInfoKHR set(int sType, long pNext, long swapchain, IntBuffer pImageIndices) {
        sType(sType);
        pNext(pNext);
        swapchain(swapchain);
        pImageIndices(pImageIndices);
        return this;
    }

    public VkReleaseSwapchainImagesInfoKHR set(VkReleaseSwapchainImagesInfoKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkReleaseSwapchainImagesInfoKHR malloc() {
        return new VkReleaseSwapchainImagesInfoKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkReleaseSwapchainImagesInfoKHR calloc() {
        return new VkReleaseSwapchainImagesInfoKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkReleaseSwapchainImagesInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkReleaseSwapchainImagesInfoKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkReleaseSwapchainImagesInfoKHR create(long address) {
        return new VkReleaseSwapchainImagesInfoKHR(address, null);
    }

    public static VkReleaseSwapchainImagesInfoKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkReleaseSwapchainImagesInfoKHR(address, null);
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

    public static VkReleaseSwapchainImagesInfoKHR malloc(MemoryStack stack) {
        return new VkReleaseSwapchainImagesInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkReleaseSwapchainImagesInfoKHR calloc(MemoryStack stack) {
        return new VkReleaseSwapchainImagesInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static long nswapchain(long struct) {
        return MemoryUtil.memGetLong(struct + SWAPCHAIN);
    }

    public static int nimageIndexCount(long struct) {
        return MemoryUtil.memGetInt(struct + IMAGEINDEXCOUNT);
    }

    public static IntBuffer npImageIndices(long struct) {
        return MemoryUtil.memIntBuffer(MemoryUtil.memGetAddress(struct + PIMAGEINDICES), nimageIndexCount(struct));
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nswapchain(long struct, long value) {
        MemoryUtil.memPutLong(struct + SWAPCHAIN, value);
    }

    public static void nimageIndexCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + IMAGEINDEXCOUNT, value);
    }

    public static void npImageIndices(long struct, IntBuffer value) {
        MemoryUtil.memPutAddress(struct + PIMAGEINDICES, MemoryUtil.memAddress(value));
        nimageIndexCount(struct, value.remaining());
    }

    public static void validate(long struct) {
        Checks.check(MemoryUtil.memGetAddress(struct + PIMAGEINDICES));
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkReleaseSwapchainImagesInfoKHR$Buffer.class */
    public static class Buffer extends StructBuffer<VkReleaseSwapchainImagesInfoKHR, Buffer> implements NativeResource {
        private static final VkReleaseSwapchainImagesInfoKHR ELEMENT_FACTORY = VkReleaseSwapchainImagesInfoKHR.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkReleaseSwapchainImagesInfoKHR.SIZEOF);
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
        public VkReleaseSwapchainImagesInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkReleaseSwapchainImagesInfoKHR.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkReleaseSwapchainImagesInfoKHR.npNext(address());
        }

        @NativeType("VkSwapchainKHR")
        public long swapchain() {
            return VkReleaseSwapchainImagesInfoKHR.nswapchain(address());
        }

        @NativeType("uint32_t")
        public int imageIndexCount() {
            return VkReleaseSwapchainImagesInfoKHR.nimageIndexCount(address());
        }

        @NativeType("uint32_t const *")
        public IntBuffer pImageIndices() {
            return VkReleaseSwapchainImagesInfoKHR.npImageIndices(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkReleaseSwapchainImagesInfoKHR.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000275005);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkReleaseSwapchainImagesInfoKHR.npNext(address(), value);
            return this;
        }

        public Buffer swapchain(@NativeType("VkSwapchainKHR") long value) {
            VkReleaseSwapchainImagesInfoKHR.nswapchain(address(), value);
            return this;
        }

        public Buffer pImageIndices(@NativeType("uint32_t const *") IntBuffer value) {
            VkReleaseSwapchainImagesInfoKHR.npImageIndices(address(), value);
            return this;
        }
    }
}
