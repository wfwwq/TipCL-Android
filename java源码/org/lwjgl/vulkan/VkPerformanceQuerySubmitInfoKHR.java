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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPerformanceQuerySubmitInfoKHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPerformanceQuerySubmitInfoKHR.class */
public class VkPerformanceQuerySubmitInfoKHR extends Struct<VkPerformanceQuerySubmitInfoKHR> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int COUNTERPASSINDEX;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        COUNTERPASSINDEX = layout.offsetof(2);
    }

    protected VkPerformanceQuerySubmitInfoKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPerformanceQuerySubmitInfoKHR create(long address, ByteBuffer container) {
        return new VkPerformanceQuerySubmitInfoKHR(address, container);
    }

    public VkPerformanceQuerySubmitInfoKHR(ByteBuffer container) {
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
    public int counterPassIndex() {
        return ncounterPassIndex(address());
    }

    public VkPerformanceQuerySubmitInfoKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPerformanceQuerySubmitInfoKHR sType$Default() {
        return sType(KHRPerformanceQuery.VK_STRUCTURE_TYPE_PERFORMANCE_QUERY_SUBMIT_INFO_KHR);
    }

    public VkPerformanceQuerySubmitInfoKHR pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPerformanceQuerySubmitInfoKHR counterPassIndex(@NativeType("uint32_t") int value) {
        ncounterPassIndex(address(), value);
        return this;
    }

    public VkPerformanceQuerySubmitInfoKHR set(int sType, long pNext, int counterPassIndex) {
        sType(sType);
        pNext(pNext);
        counterPassIndex(counterPassIndex);
        return this;
    }

    public VkPerformanceQuerySubmitInfoKHR set(VkPerformanceQuerySubmitInfoKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPerformanceQuerySubmitInfoKHR malloc() {
        return new VkPerformanceQuerySubmitInfoKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPerformanceQuerySubmitInfoKHR calloc() {
        return new VkPerformanceQuerySubmitInfoKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPerformanceQuerySubmitInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPerformanceQuerySubmitInfoKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkPerformanceQuerySubmitInfoKHR create(long address) {
        return new VkPerformanceQuerySubmitInfoKHR(address, null);
    }

    public static VkPerformanceQuerySubmitInfoKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPerformanceQuerySubmitInfoKHR(address, null);
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

    public static VkPerformanceQuerySubmitInfoKHR malloc(MemoryStack stack) {
        return new VkPerformanceQuerySubmitInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPerformanceQuerySubmitInfoKHR calloc(MemoryStack stack) {
        return new VkPerformanceQuerySubmitInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int ncounterPassIndex(long struct) {
        return MemoryUtil.memGetInt(struct + COUNTERPASSINDEX);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void ncounterPassIndex(long struct, int value) {
        MemoryUtil.memPutInt(struct + COUNTERPASSINDEX, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPerformanceQuerySubmitInfoKHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPerformanceQuerySubmitInfoKHR$Buffer.class */
    public static class Buffer extends StructBuffer<VkPerformanceQuerySubmitInfoKHR, Buffer> implements NativeResource {
        private static final VkPerformanceQuerySubmitInfoKHR ELEMENT_FACTORY = VkPerformanceQuerySubmitInfoKHR.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPerformanceQuerySubmitInfoKHR.SIZEOF);
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
        public VkPerformanceQuerySubmitInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPerformanceQuerySubmitInfoKHR.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkPerformanceQuerySubmitInfoKHR.npNext(address());
        }

        @NativeType("uint32_t")
        public int counterPassIndex() {
            return VkPerformanceQuerySubmitInfoKHR.ncounterPassIndex(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPerformanceQuerySubmitInfoKHR.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(KHRPerformanceQuery.VK_STRUCTURE_TYPE_PERFORMANCE_QUERY_SUBMIT_INFO_KHR);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkPerformanceQuerySubmitInfoKHR.npNext(address(), value);
            return this;
        }

        public Buffer counterPassIndex(@NativeType("uint32_t") int value) {
            VkPerformanceQuerySubmitInfoKHR.ncounterPassIndex(address(), value);
            return this;
        }
    }
}
