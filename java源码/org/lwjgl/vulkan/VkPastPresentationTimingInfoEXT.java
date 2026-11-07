package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPastPresentationTimingInfoEXT.class */
public class VkPastPresentationTimingInfoEXT extends Struct<VkPastPresentationTimingInfoEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int FLAGS;
    public static final int SWAPCHAIN;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(8));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        SWAPCHAIN = layout.offsetof(3);
    }

    protected VkPastPresentationTimingInfoEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPastPresentationTimingInfoEXT create(long address, ByteBuffer container) {
        return new VkPastPresentationTimingInfoEXT(address, container);
    }

    public VkPastPresentationTimingInfoEXT(ByteBuffer container) {
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

    @NativeType("VkPastPresentationTimingFlagsEXT")
    public int flags() {
        return nflags(address());
    }

    @NativeType("VkSwapchainKHR")
    public long swapchain() {
        return nswapchain(address());
    }

    public VkPastPresentationTimingInfoEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPastPresentationTimingInfoEXT sType$Default() {
        return sType(EXTPresentTiming.VK_STRUCTURE_TYPE_PAST_PRESENTATION_TIMING_INFO_EXT);
    }

    public VkPastPresentationTimingInfoEXT pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPastPresentationTimingInfoEXT flags(@NativeType("VkPastPresentationTimingFlagsEXT") int value) {
        nflags(address(), value);
        return this;
    }

    public VkPastPresentationTimingInfoEXT swapchain(@NativeType("VkSwapchainKHR") long value) {
        nswapchain(address(), value);
        return this;
    }

    public VkPastPresentationTimingInfoEXT set(int sType, long pNext, int flags, long swapchain) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        swapchain(swapchain);
        return this;
    }

    public VkPastPresentationTimingInfoEXT set(VkPastPresentationTimingInfoEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPastPresentationTimingInfoEXT malloc() {
        return new VkPastPresentationTimingInfoEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPastPresentationTimingInfoEXT calloc() {
        return new VkPastPresentationTimingInfoEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPastPresentationTimingInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPastPresentationTimingInfoEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkPastPresentationTimingInfoEXT create(long address) {
        return new VkPastPresentationTimingInfoEXT(address, null);
    }

    public static VkPastPresentationTimingInfoEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPastPresentationTimingInfoEXT(address, null);
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

    public static VkPastPresentationTimingInfoEXT malloc(MemoryStack stack) {
        return new VkPastPresentationTimingInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPastPresentationTimingInfoEXT calloc(MemoryStack stack) {
        return new VkPastPresentationTimingInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nflags(long struct) {
        return MemoryUtil.memGetInt(struct + FLAGS);
    }

    public static long nswapchain(long struct) {
        return MemoryUtil.memGetLong(struct + SWAPCHAIN);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nflags(long struct, int value) {
        MemoryUtil.memPutInt(struct + FLAGS, value);
    }

    public static void nswapchain(long struct, long value) {
        MemoryUtil.memPutLong(struct + SWAPCHAIN, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPastPresentationTimingInfoEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkPastPresentationTimingInfoEXT, Buffer> implements NativeResource {
        private static final VkPastPresentationTimingInfoEXT ELEMENT_FACTORY = VkPastPresentationTimingInfoEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPastPresentationTimingInfoEXT.SIZEOF);
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
        public VkPastPresentationTimingInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPastPresentationTimingInfoEXT.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkPastPresentationTimingInfoEXT.npNext(address());
        }

        @NativeType("VkPastPresentationTimingFlagsEXT")
        public int flags() {
            return VkPastPresentationTimingInfoEXT.nflags(address());
        }

        @NativeType("VkSwapchainKHR")
        public long swapchain() {
            return VkPastPresentationTimingInfoEXT.nswapchain(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPastPresentationTimingInfoEXT.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(EXTPresentTiming.VK_STRUCTURE_TYPE_PAST_PRESENTATION_TIMING_INFO_EXT);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkPastPresentationTimingInfoEXT.npNext(address(), value);
            return this;
        }

        public Buffer flags(@NativeType("VkPastPresentationTimingFlagsEXT") int value) {
            VkPastPresentationTimingInfoEXT.nflags(address(), value);
            return this;
        }

        public Buffer swapchain(@NativeType("VkSwapchainKHR") long value) {
            VkPastPresentationTimingInfoEXT.nswapchain(address(), value);
            return this;
        }
    }
}
