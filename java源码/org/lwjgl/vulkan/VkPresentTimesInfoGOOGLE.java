package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;
import org.lwjgl.vulkan.VkPresentTimeGOOGLE;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPresentTimesInfoGOOGLE.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPresentTimesInfoGOOGLE.class */
public class VkPresentTimesInfoGOOGLE extends Struct<VkPresentTimesInfoGOOGLE> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int SWAPCHAINCOUNT;
    public static final int PTIMES;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SWAPCHAINCOUNT = layout.offsetof(2);
        PTIMES = layout.offsetof(3);
    }

    protected VkPresentTimesInfoGOOGLE(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPresentTimesInfoGOOGLE create(long address, ByteBuffer container) {
        return new VkPresentTimesInfoGOOGLE(address, container);
    }

    public VkPresentTimesInfoGOOGLE(ByteBuffer container) {
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

    @NativeType("VkPresentTimeGOOGLE const *")
    public VkPresentTimeGOOGLE.Buffer pTimes() {
        return npTimes(address());
    }

    public VkPresentTimesInfoGOOGLE sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPresentTimesInfoGOOGLE sType$Default() {
        return sType(GOOGLEDisplayTiming.VK_STRUCTURE_TYPE_PRESENT_TIMES_INFO_GOOGLE);
    }

    public VkPresentTimesInfoGOOGLE pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPresentTimesInfoGOOGLE swapchainCount(@NativeType("uint32_t") int value) {
        nswapchainCount(address(), value);
        return this;
    }

    public VkPresentTimesInfoGOOGLE pTimes(@NativeType("VkPresentTimeGOOGLE const *") VkPresentTimeGOOGLE.Buffer value) {
        npTimes(address(), value);
        return this;
    }

    public VkPresentTimesInfoGOOGLE set(int sType, long pNext, int swapchainCount, VkPresentTimeGOOGLE.Buffer pTimes) {
        sType(sType);
        pNext(pNext);
        swapchainCount(swapchainCount);
        pTimes(pTimes);
        return this;
    }

    public VkPresentTimesInfoGOOGLE set(VkPresentTimesInfoGOOGLE src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPresentTimesInfoGOOGLE malloc() {
        return new VkPresentTimesInfoGOOGLE(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPresentTimesInfoGOOGLE calloc() {
        return new VkPresentTimesInfoGOOGLE(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPresentTimesInfoGOOGLE create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPresentTimesInfoGOOGLE(MemoryUtil.memAddress(container), container);
    }

    public static VkPresentTimesInfoGOOGLE create(long address) {
        return new VkPresentTimesInfoGOOGLE(address, null);
    }

    public static VkPresentTimesInfoGOOGLE createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPresentTimesInfoGOOGLE(address, null);
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

    public static VkPresentTimesInfoGOOGLE malloc(MemoryStack stack) {
        return new VkPresentTimesInfoGOOGLE(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPresentTimesInfoGOOGLE calloc(MemoryStack stack) {
        return new VkPresentTimesInfoGOOGLE(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static VkPresentTimeGOOGLE.Buffer npTimes(long struct) {
        return VkPresentTimeGOOGLE.createSafe(MemoryUtil.memGetAddress(struct + PTIMES), nswapchainCount(struct));
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

    public static void npTimes(long struct, VkPresentTimeGOOGLE.Buffer value) {
        MemoryUtil.memPutAddress(struct + PTIMES, MemoryUtil.memAddressSafe(value));
        if (value != null) {
            nswapchainCount(struct, value.remaining());
        }
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPresentTimesInfoGOOGLE$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPresentTimesInfoGOOGLE$Buffer.class */
    public static class Buffer extends StructBuffer<VkPresentTimesInfoGOOGLE, Buffer> implements NativeResource {
        private static final VkPresentTimesInfoGOOGLE ELEMENT_FACTORY = VkPresentTimesInfoGOOGLE.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPresentTimesInfoGOOGLE.SIZEOF);
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
        public VkPresentTimesInfoGOOGLE getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPresentTimesInfoGOOGLE.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkPresentTimesInfoGOOGLE.npNext(address());
        }

        @NativeType("uint32_t")
        public int swapchainCount() {
            return VkPresentTimesInfoGOOGLE.nswapchainCount(address());
        }

        @NativeType("VkPresentTimeGOOGLE const *")
        public VkPresentTimeGOOGLE.Buffer pTimes() {
            return VkPresentTimesInfoGOOGLE.npTimes(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPresentTimesInfoGOOGLE.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(GOOGLEDisplayTiming.VK_STRUCTURE_TYPE_PRESENT_TIMES_INFO_GOOGLE);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkPresentTimesInfoGOOGLE.npNext(address(), value);
            return this;
        }

        public Buffer swapchainCount(@NativeType("uint32_t") int value) {
            VkPresentTimesInfoGOOGLE.nswapchainCount(address(), value);
            return this;
        }

        public Buffer pTimes(@NativeType("VkPresentTimeGOOGLE const *") VkPresentTimeGOOGLE.Buffer value) {
            VkPresentTimesInfoGOOGLE.npTimes(address(), value);
            return this;
        }
    }
}
