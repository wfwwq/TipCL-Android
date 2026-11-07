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

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkQueryPoolPerformanceCreateInfoKHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkQueryPoolPerformanceCreateInfoKHR.class */
public class VkQueryPoolPerformanceCreateInfoKHR extends Struct<VkQueryPoolPerformanceCreateInfoKHR> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int QUEUEFAMILYINDEX;
    public static final int COUNTERINDEXCOUNT;
    public static final int PCOUNTERINDICES;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        QUEUEFAMILYINDEX = layout.offsetof(2);
        COUNTERINDEXCOUNT = layout.offsetof(3);
        PCOUNTERINDICES = layout.offsetof(4);
    }

    protected VkQueryPoolPerformanceCreateInfoKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkQueryPoolPerformanceCreateInfoKHR create(long address, ByteBuffer container) {
        return new VkQueryPoolPerformanceCreateInfoKHR(address, container);
    }

    public VkQueryPoolPerformanceCreateInfoKHR(ByteBuffer container) {
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
    public int queueFamilyIndex() {
        return nqueueFamilyIndex(address());
    }

    @NativeType("uint32_t")
    public int counterIndexCount() {
        return ncounterIndexCount(address());
    }

    @NativeType("uint32_t const *")
    public IntBuffer pCounterIndices() {
        return npCounterIndices(address());
    }

    public VkQueryPoolPerformanceCreateInfoKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkQueryPoolPerformanceCreateInfoKHR sType$Default() {
        return sType(KHRPerformanceQuery.VK_STRUCTURE_TYPE_QUERY_POOL_PERFORMANCE_CREATE_INFO_KHR);
    }

    public VkQueryPoolPerformanceCreateInfoKHR pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkQueryPoolPerformanceCreateInfoKHR queueFamilyIndex(@NativeType("uint32_t") int value) {
        nqueueFamilyIndex(address(), value);
        return this;
    }

    public VkQueryPoolPerformanceCreateInfoKHR pCounterIndices(@NativeType("uint32_t const *") IntBuffer value) {
        npCounterIndices(address(), value);
        return this;
    }

    public VkQueryPoolPerformanceCreateInfoKHR set(int sType, long pNext, int queueFamilyIndex, IntBuffer pCounterIndices) {
        sType(sType);
        pNext(pNext);
        queueFamilyIndex(queueFamilyIndex);
        pCounterIndices(pCounterIndices);
        return this;
    }

    public VkQueryPoolPerformanceCreateInfoKHR set(VkQueryPoolPerformanceCreateInfoKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkQueryPoolPerformanceCreateInfoKHR malloc() {
        return new VkQueryPoolPerformanceCreateInfoKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkQueryPoolPerformanceCreateInfoKHR calloc() {
        return new VkQueryPoolPerformanceCreateInfoKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkQueryPoolPerformanceCreateInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkQueryPoolPerformanceCreateInfoKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkQueryPoolPerformanceCreateInfoKHR create(long address) {
        return new VkQueryPoolPerformanceCreateInfoKHR(address, null);
    }

    public static VkQueryPoolPerformanceCreateInfoKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkQueryPoolPerformanceCreateInfoKHR(address, null);
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

    public static VkQueryPoolPerformanceCreateInfoKHR malloc(MemoryStack stack) {
        return new VkQueryPoolPerformanceCreateInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkQueryPoolPerformanceCreateInfoKHR calloc(MemoryStack stack) {
        return new VkQueryPoolPerformanceCreateInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nqueueFamilyIndex(long struct) {
        return MemoryUtil.memGetInt(struct + QUEUEFAMILYINDEX);
    }

    public static int ncounterIndexCount(long struct) {
        return MemoryUtil.memGetInt(struct + COUNTERINDEXCOUNT);
    }

    public static IntBuffer npCounterIndices(long struct) {
        return MemoryUtil.memIntBuffer(MemoryUtil.memGetAddress(struct + PCOUNTERINDICES), ncounterIndexCount(struct));
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nqueueFamilyIndex(long struct, int value) {
        MemoryUtil.memPutInt(struct + QUEUEFAMILYINDEX, value);
    }

    public static void ncounterIndexCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + COUNTERINDEXCOUNT, value);
    }

    public static void npCounterIndices(long struct, IntBuffer value) {
        MemoryUtil.memPutAddress(struct + PCOUNTERINDICES, MemoryUtil.memAddress(value));
        ncounterIndexCount(struct, value.remaining());
    }

    public static void validate(long struct) {
        Checks.check(MemoryUtil.memGetAddress(struct + PCOUNTERINDICES));
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkQueryPoolPerformanceCreateInfoKHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkQueryPoolPerformanceCreateInfoKHR$Buffer.class */
    public static class Buffer extends StructBuffer<VkQueryPoolPerformanceCreateInfoKHR, Buffer> implements NativeResource {
        private static final VkQueryPoolPerformanceCreateInfoKHR ELEMENT_FACTORY = VkQueryPoolPerformanceCreateInfoKHR.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkQueryPoolPerformanceCreateInfoKHR.SIZEOF);
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
        public VkQueryPoolPerformanceCreateInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkQueryPoolPerformanceCreateInfoKHR.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkQueryPoolPerformanceCreateInfoKHR.npNext(address());
        }

        @NativeType("uint32_t")
        public int queueFamilyIndex() {
            return VkQueryPoolPerformanceCreateInfoKHR.nqueueFamilyIndex(address());
        }

        @NativeType("uint32_t")
        public int counterIndexCount() {
            return VkQueryPoolPerformanceCreateInfoKHR.ncounterIndexCount(address());
        }

        @NativeType("uint32_t const *")
        public IntBuffer pCounterIndices() {
            return VkQueryPoolPerformanceCreateInfoKHR.npCounterIndices(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkQueryPoolPerformanceCreateInfoKHR.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(KHRPerformanceQuery.VK_STRUCTURE_TYPE_QUERY_POOL_PERFORMANCE_CREATE_INFO_KHR);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkQueryPoolPerformanceCreateInfoKHR.npNext(address(), value);
            return this;
        }

        public Buffer queueFamilyIndex(@NativeType("uint32_t") int value) {
            VkQueryPoolPerformanceCreateInfoKHR.nqueueFamilyIndex(address(), value);
            return this;
        }

        public Buffer pCounterIndices(@NativeType("uint32_t const *") IntBuffer value) {
            VkQueryPoolPerformanceCreateInfoKHR.npCounterIndices(address(), value);
            return this;
        }
    }
}
