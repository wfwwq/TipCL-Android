package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSwapchainCalibratedTimestampInfoEXT.class */
public class VkSwapchainCalibratedTimestampInfoEXT extends Struct<VkSwapchainCalibratedTimestampInfoEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int SWAPCHAIN;
    public static final int PRESENTSTAGE;
    public static final int TIMEDOMAINID;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(8), __member(4), __member(8));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SWAPCHAIN = layout.offsetof(2);
        PRESENTSTAGE = layout.offsetof(3);
        TIMEDOMAINID = layout.offsetof(4);
    }

    protected VkSwapchainCalibratedTimestampInfoEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkSwapchainCalibratedTimestampInfoEXT create(long address, ByteBuffer container) {
        return new VkSwapchainCalibratedTimestampInfoEXT(address, container);
    }

    public VkSwapchainCalibratedTimestampInfoEXT(ByteBuffer container) {
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

    @NativeType("VkPresentStageFlagsEXT")
    public int presentStage() {
        return npresentStage(address());
    }

    @NativeType("uint64_t")
    public long timeDomainId() {
        return ntimeDomainId(address());
    }

    public VkSwapchainCalibratedTimestampInfoEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkSwapchainCalibratedTimestampInfoEXT sType$Default() {
        return sType(EXTPresentTiming.VK_STRUCTURE_TYPE_SWAPCHAIN_CALIBRATED_TIMESTAMP_INFO_EXT);
    }

    public VkSwapchainCalibratedTimestampInfoEXT pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkSwapchainCalibratedTimestampInfoEXT swapchain(@NativeType("VkSwapchainKHR") long value) {
        nswapchain(address(), value);
        return this;
    }

    public VkSwapchainCalibratedTimestampInfoEXT presentStage(@NativeType("VkPresentStageFlagsEXT") int value) {
        npresentStage(address(), value);
        return this;
    }

    public VkSwapchainCalibratedTimestampInfoEXT timeDomainId(@NativeType("uint64_t") long value) {
        ntimeDomainId(address(), value);
        return this;
    }

    public VkSwapchainCalibratedTimestampInfoEXT set(int sType, long pNext, long swapchain, int presentStage, long timeDomainId) {
        sType(sType);
        pNext(pNext);
        swapchain(swapchain);
        presentStage(presentStage);
        timeDomainId(timeDomainId);
        return this;
    }

    public VkSwapchainCalibratedTimestampInfoEXT set(VkSwapchainCalibratedTimestampInfoEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkSwapchainCalibratedTimestampInfoEXT malloc() {
        return new VkSwapchainCalibratedTimestampInfoEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkSwapchainCalibratedTimestampInfoEXT calloc() {
        return new VkSwapchainCalibratedTimestampInfoEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkSwapchainCalibratedTimestampInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkSwapchainCalibratedTimestampInfoEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkSwapchainCalibratedTimestampInfoEXT create(long address) {
        return new VkSwapchainCalibratedTimestampInfoEXT(address, null);
    }

    public static VkSwapchainCalibratedTimestampInfoEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkSwapchainCalibratedTimestampInfoEXT(address, null);
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

    public static VkSwapchainCalibratedTimestampInfoEXT malloc(MemoryStack stack) {
        return new VkSwapchainCalibratedTimestampInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkSwapchainCalibratedTimestampInfoEXT calloc(MemoryStack stack) {
        return new VkSwapchainCalibratedTimestampInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int npresentStage(long struct) {
        return MemoryUtil.memGetInt(struct + PRESENTSTAGE);
    }

    public static long ntimeDomainId(long struct) {
        return MemoryUtil.memGetLong(struct + TIMEDOMAINID);
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

    public static void npresentStage(long struct, int value) {
        MemoryUtil.memPutInt(struct + PRESENTSTAGE, value);
    }

    public static void ntimeDomainId(long struct, long value) {
        MemoryUtil.memPutLong(struct + TIMEDOMAINID, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSwapchainCalibratedTimestampInfoEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkSwapchainCalibratedTimestampInfoEXT, Buffer> implements NativeResource {
        private static final VkSwapchainCalibratedTimestampInfoEXT ELEMENT_FACTORY = VkSwapchainCalibratedTimestampInfoEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkSwapchainCalibratedTimestampInfoEXT.SIZEOF);
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
        public VkSwapchainCalibratedTimestampInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkSwapchainCalibratedTimestampInfoEXT.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkSwapchainCalibratedTimestampInfoEXT.npNext(address());
        }

        @NativeType("VkSwapchainKHR")
        public long swapchain() {
            return VkSwapchainCalibratedTimestampInfoEXT.nswapchain(address());
        }

        @NativeType("VkPresentStageFlagsEXT")
        public int presentStage() {
            return VkSwapchainCalibratedTimestampInfoEXT.npresentStage(address());
        }

        @NativeType("uint64_t")
        public long timeDomainId() {
            return VkSwapchainCalibratedTimestampInfoEXT.ntimeDomainId(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkSwapchainCalibratedTimestampInfoEXT.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(EXTPresentTiming.VK_STRUCTURE_TYPE_SWAPCHAIN_CALIBRATED_TIMESTAMP_INFO_EXT);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkSwapchainCalibratedTimestampInfoEXT.npNext(address(), value);
            return this;
        }

        public Buffer swapchain(@NativeType("VkSwapchainKHR") long value) {
            VkSwapchainCalibratedTimestampInfoEXT.nswapchain(address(), value);
            return this;
        }

        public Buffer presentStage(@NativeType("VkPresentStageFlagsEXT") int value) {
            VkSwapchainCalibratedTimestampInfoEXT.npresentStage(address(), value);
            return this;
        }

        public Buffer timeDomainId(@NativeType("uint64_t") long value) {
            VkSwapchainCalibratedTimestampInfoEXT.ntimeDomainId(address(), value);
            return this;
        }
    }
}
