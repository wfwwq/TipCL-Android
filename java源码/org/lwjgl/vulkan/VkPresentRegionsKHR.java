package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;
import org.lwjgl.vulkan.VkPresentRegionKHR;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPresentRegionsKHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPresentRegionsKHR.class */
public class VkPresentRegionsKHR extends Struct<VkPresentRegionsKHR> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int SWAPCHAINCOUNT;
    public static final int PREGIONS;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SWAPCHAINCOUNT = layout.offsetof(2);
        PREGIONS = layout.offsetof(3);
    }

    protected VkPresentRegionsKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPresentRegionsKHR create(long address, ByteBuffer container) {
        return new VkPresentRegionsKHR(address, container);
    }

    public VkPresentRegionsKHR(ByteBuffer container) {
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

    @NativeType("VkPresentRegionKHR const *")
    public VkPresentRegionKHR.Buffer pRegions() {
        return npRegions(address());
    }

    public VkPresentRegionsKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPresentRegionsKHR sType$Default() {
        return sType(KHRIncrementalPresent.VK_STRUCTURE_TYPE_PRESENT_REGIONS_KHR);
    }

    public VkPresentRegionsKHR pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPresentRegionsKHR swapchainCount(@NativeType("uint32_t") int value) {
        nswapchainCount(address(), value);
        return this;
    }

    public VkPresentRegionsKHR pRegions(@NativeType("VkPresentRegionKHR const *") VkPresentRegionKHR.Buffer value) {
        npRegions(address(), value);
        return this;
    }

    public VkPresentRegionsKHR set(int sType, long pNext, int swapchainCount, VkPresentRegionKHR.Buffer pRegions) {
        sType(sType);
        pNext(pNext);
        swapchainCount(swapchainCount);
        pRegions(pRegions);
        return this;
    }

    public VkPresentRegionsKHR set(VkPresentRegionsKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPresentRegionsKHR malloc() {
        return new VkPresentRegionsKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPresentRegionsKHR calloc() {
        return new VkPresentRegionsKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPresentRegionsKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPresentRegionsKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkPresentRegionsKHR create(long address) {
        return new VkPresentRegionsKHR(address, null);
    }

    public static VkPresentRegionsKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPresentRegionsKHR(address, null);
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

    public static VkPresentRegionsKHR malloc(MemoryStack stack) {
        return new VkPresentRegionsKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPresentRegionsKHR calloc(MemoryStack stack) {
        return new VkPresentRegionsKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static VkPresentRegionKHR.Buffer npRegions(long struct) {
        return VkPresentRegionKHR.createSafe(MemoryUtil.memGetAddress(struct + PREGIONS), nswapchainCount(struct));
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

    public static void npRegions(long struct, VkPresentRegionKHR.Buffer value) {
        MemoryUtil.memPutAddress(struct + PREGIONS, MemoryUtil.memAddressSafe(value));
        if (value != null) {
            nswapchainCount(struct, value.remaining());
        }
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPresentRegionsKHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPresentRegionsKHR$Buffer.class */
    public static class Buffer extends StructBuffer<VkPresentRegionsKHR, Buffer> implements NativeResource {
        private static final VkPresentRegionsKHR ELEMENT_FACTORY = VkPresentRegionsKHR.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPresentRegionsKHR.SIZEOF);
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
        public VkPresentRegionsKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPresentRegionsKHR.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkPresentRegionsKHR.npNext(address());
        }

        @NativeType("uint32_t")
        public int swapchainCount() {
            return VkPresentRegionsKHR.nswapchainCount(address());
        }

        @NativeType("VkPresentRegionKHR const *")
        public VkPresentRegionKHR.Buffer pRegions() {
            return VkPresentRegionsKHR.npRegions(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPresentRegionsKHR.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(KHRIncrementalPresent.VK_STRUCTURE_TYPE_PRESENT_REGIONS_KHR);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkPresentRegionsKHR.npNext(address(), value);
            return this;
        }

        public Buffer swapchainCount(@NativeType("uint32_t") int value) {
            VkPresentRegionsKHR.nswapchainCount(address(), value);
            return this;
        }

        public Buffer pRegions(@NativeType("VkPresentRegionKHR const *") VkPresentRegionKHR.Buffer value) {
            VkPresentRegionsKHR.npRegions(address(), value);
            return this;
        }
    }
}
