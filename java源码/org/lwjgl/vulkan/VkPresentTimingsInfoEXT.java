package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;
import org.lwjgl.vulkan.VkPresentTimingInfoEXT;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPresentTimingsInfoEXT.class */
public class VkPresentTimingsInfoEXT extends Struct<VkPresentTimingsInfoEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int SWAPCHAINCOUNT;
    public static final int PTIMINGINFOS;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SWAPCHAINCOUNT = layout.offsetof(2);
        PTIMINGINFOS = layout.offsetof(3);
    }

    protected VkPresentTimingsInfoEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPresentTimingsInfoEXT create(long address, ByteBuffer container) {
        return new VkPresentTimingsInfoEXT(address, container);
    }

    public VkPresentTimingsInfoEXT(ByteBuffer container) {
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

    @NativeType("VkPresentTimingInfoEXT const *")
    public VkPresentTimingInfoEXT.Buffer pTimingInfos() {
        return npTimingInfos(address());
    }

    public VkPresentTimingsInfoEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPresentTimingsInfoEXT sType$Default() {
        return sType(EXTPresentTiming.VK_STRUCTURE_TYPE_PRESENT_TIMINGS_INFO_EXT);
    }

    public VkPresentTimingsInfoEXT pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPresentTimingsInfoEXT swapchainCount(@NativeType("uint32_t") int value) {
        nswapchainCount(address(), value);
        return this;
    }

    public VkPresentTimingsInfoEXT pTimingInfos(@NativeType("VkPresentTimingInfoEXT const *") VkPresentTimingInfoEXT.Buffer value) {
        npTimingInfos(address(), value);
        return this;
    }

    public VkPresentTimingsInfoEXT set(int sType, long pNext, int swapchainCount, VkPresentTimingInfoEXT.Buffer pTimingInfos) {
        sType(sType);
        pNext(pNext);
        swapchainCount(swapchainCount);
        pTimingInfos(pTimingInfos);
        return this;
    }

    public VkPresentTimingsInfoEXT set(VkPresentTimingsInfoEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPresentTimingsInfoEXT malloc() {
        return new VkPresentTimingsInfoEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPresentTimingsInfoEXT calloc() {
        return new VkPresentTimingsInfoEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPresentTimingsInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPresentTimingsInfoEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkPresentTimingsInfoEXT create(long address) {
        return new VkPresentTimingsInfoEXT(address, null);
    }

    public static VkPresentTimingsInfoEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPresentTimingsInfoEXT(address, null);
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

    public static VkPresentTimingsInfoEXT malloc(MemoryStack stack) {
        return new VkPresentTimingsInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPresentTimingsInfoEXT calloc(MemoryStack stack) {
        return new VkPresentTimingsInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static VkPresentTimingInfoEXT.Buffer npTimingInfos(long struct) {
        return VkPresentTimingInfoEXT.createSafe(MemoryUtil.memGetAddress(struct + PTIMINGINFOS), nswapchainCount(struct));
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

    public static void npTimingInfos(long struct, VkPresentTimingInfoEXT.Buffer value) {
        MemoryUtil.memPutAddress(struct + PTIMINGINFOS, MemoryUtil.memAddressSafe(value));
        if (value != null) {
            nswapchainCount(struct, value.remaining());
        }
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPresentTimingsInfoEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkPresentTimingsInfoEXT, Buffer> implements NativeResource {
        private static final VkPresentTimingsInfoEXT ELEMENT_FACTORY = VkPresentTimingsInfoEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPresentTimingsInfoEXT.SIZEOF);
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
        public VkPresentTimingsInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPresentTimingsInfoEXT.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkPresentTimingsInfoEXT.npNext(address());
        }

        @NativeType("uint32_t")
        public int swapchainCount() {
            return VkPresentTimingsInfoEXT.nswapchainCount(address());
        }

        @NativeType("VkPresentTimingInfoEXT const *")
        public VkPresentTimingInfoEXT.Buffer pTimingInfos() {
            return VkPresentTimingsInfoEXT.npTimingInfos(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPresentTimingsInfoEXT.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(EXTPresentTiming.VK_STRUCTURE_TYPE_PRESENT_TIMINGS_INFO_EXT);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkPresentTimingsInfoEXT.npNext(address(), value);
            return this;
        }

        public Buffer swapchainCount(@NativeType("uint32_t") int value) {
            VkPresentTimingsInfoEXT.nswapchainCount(address(), value);
            return this;
        }

        public Buffer pTimingInfos(@NativeType("VkPresentTimingInfoEXT const *") VkPresentTimingInfoEXT.Buffer value) {
            VkPresentTimingsInfoEXT.npTimingInfos(address(), value);
            return this;
        }
    }
}
