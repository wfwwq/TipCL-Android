package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkBindImageMemorySwapchainInfoKHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkBindImageMemorySwapchainInfoKHR.class */
public class VkBindImageMemorySwapchainInfoKHR extends Struct<VkBindImageMemorySwapchainInfoKHR> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int SWAPCHAIN;
    public static final int IMAGEINDEX;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(8), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SWAPCHAIN = layout.offsetof(2);
        IMAGEINDEX = layout.offsetof(3);
    }

    protected VkBindImageMemorySwapchainInfoKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkBindImageMemorySwapchainInfoKHR create(long address, ByteBuffer container) {
        return new VkBindImageMemorySwapchainInfoKHR(address, container);
    }

    public VkBindImageMemorySwapchainInfoKHR(ByteBuffer container) {
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
    public int imageIndex() {
        return nimageIndex(address());
    }

    public VkBindImageMemorySwapchainInfoKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkBindImageMemorySwapchainInfoKHR sType$Default() {
        return sType(1000060009);
    }

    public VkBindImageMemorySwapchainInfoKHR pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkBindImageMemorySwapchainInfoKHR swapchain(@NativeType("VkSwapchainKHR") long value) {
        nswapchain(address(), value);
        return this;
    }

    public VkBindImageMemorySwapchainInfoKHR imageIndex(@NativeType("uint32_t") int value) {
        nimageIndex(address(), value);
        return this;
    }

    public VkBindImageMemorySwapchainInfoKHR set(int sType, long pNext, long swapchain, int imageIndex) {
        sType(sType);
        pNext(pNext);
        swapchain(swapchain);
        imageIndex(imageIndex);
        return this;
    }

    public VkBindImageMemorySwapchainInfoKHR set(VkBindImageMemorySwapchainInfoKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkBindImageMemorySwapchainInfoKHR malloc() {
        return new VkBindImageMemorySwapchainInfoKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkBindImageMemorySwapchainInfoKHR calloc() {
        return new VkBindImageMemorySwapchainInfoKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkBindImageMemorySwapchainInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkBindImageMemorySwapchainInfoKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkBindImageMemorySwapchainInfoKHR create(long address) {
        return new VkBindImageMemorySwapchainInfoKHR(address, null);
    }

    public static VkBindImageMemorySwapchainInfoKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkBindImageMemorySwapchainInfoKHR(address, null);
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

    public static VkBindImageMemorySwapchainInfoKHR malloc(MemoryStack stack) {
        return new VkBindImageMemorySwapchainInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkBindImageMemorySwapchainInfoKHR calloc(MemoryStack stack) {
        return new VkBindImageMemorySwapchainInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nimageIndex(long struct) {
        return MemoryUtil.memGetInt(struct + IMAGEINDEX);
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

    public static void nimageIndex(long struct, int value) {
        MemoryUtil.memPutInt(struct + IMAGEINDEX, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkBindImageMemorySwapchainInfoKHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkBindImageMemorySwapchainInfoKHR$Buffer.class */
    public static class Buffer extends StructBuffer<VkBindImageMemorySwapchainInfoKHR, Buffer> implements NativeResource {
        private static final VkBindImageMemorySwapchainInfoKHR ELEMENT_FACTORY = VkBindImageMemorySwapchainInfoKHR.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkBindImageMemorySwapchainInfoKHR.SIZEOF);
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
        public VkBindImageMemorySwapchainInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkBindImageMemorySwapchainInfoKHR.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkBindImageMemorySwapchainInfoKHR.npNext(address());
        }

        @NativeType("VkSwapchainKHR")
        public long swapchain() {
            return VkBindImageMemorySwapchainInfoKHR.nswapchain(address());
        }

        @NativeType("uint32_t")
        public int imageIndex() {
            return VkBindImageMemorySwapchainInfoKHR.nimageIndex(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkBindImageMemorySwapchainInfoKHR.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000060009);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkBindImageMemorySwapchainInfoKHR.npNext(address(), value);
            return this;
        }

        public Buffer swapchain(@NativeType("VkSwapchainKHR") long value) {
            VkBindImageMemorySwapchainInfoKHR.nswapchain(address(), value);
            return this;
        }

        public Buffer imageIndex(@NativeType("uint32_t") int value) {
            VkBindImageMemorySwapchainInfoKHR.nimageIndex(address(), value);
            return this;
        }
    }
}
