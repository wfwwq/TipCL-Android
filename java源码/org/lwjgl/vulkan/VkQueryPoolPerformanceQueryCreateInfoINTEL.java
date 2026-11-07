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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkQueryPoolPerformanceQueryCreateInfoINTEL.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkQueryPoolPerformanceQueryCreateInfoINTEL.class */
public class VkQueryPoolPerformanceQueryCreateInfoINTEL extends Struct<VkQueryPoolPerformanceQueryCreateInfoINTEL> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int PERFORMANCECOUNTERSSAMPLING;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        PERFORMANCECOUNTERSSAMPLING = layout.offsetof(2);
    }

    protected VkQueryPoolPerformanceQueryCreateInfoINTEL(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkQueryPoolPerformanceQueryCreateInfoINTEL create(long address, ByteBuffer container) {
        return new VkQueryPoolPerformanceQueryCreateInfoINTEL(address, container);
    }

    public VkQueryPoolPerformanceQueryCreateInfoINTEL(ByteBuffer container) {
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

    @NativeType("VkQueryPoolSamplingModeINTEL")
    public int performanceCountersSampling() {
        return nperformanceCountersSampling(address());
    }

    public VkQueryPoolPerformanceQueryCreateInfoINTEL sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkQueryPoolPerformanceQueryCreateInfoINTEL sType$Default() {
        return sType(1000210000);
    }

    public VkQueryPoolPerformanceQueryCreateInfoINTEL pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkQueryPoolPerformanceQueryCreateInfoINTEL performanceCountersSampling(@NativeType("VkQueryPoolSamplingModeINTEL") int value) {
        nperformanceCountersSampling(address(), value);
        return this;
    }

    public VkQueryPoolPerformanceQueryCreateInfoINTEL set(int sType, long pNext, int performanceCountersSampling) {
        sType(sType);
        pNext(pNext);
        performanceCountersSampling(performanceCountersSampling);
        return this;
    }

    public VkQueryPoolPerformanceQueryCreateInfoINTEL set(VkQueryPoolPerformanceQueryCreateInfoINTEL src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkQueryPoolPerformanceQueryCreateInfoINTEL malloc() {
        return new VkQueryPoolPerformanceQueryCreateInfoINTEL(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkQueryPoolPerformanceQueryCreateInfoINTEL calloc() {
        return new VkQueryPoolPerformanceQueryCreateInfoINTEL(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkQueryPoolPerformanceQueryCreateInfoINTEL create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkQueryPoolPerformanceQueryCreateInfoINTEL(MemoryUtil.memAddress(container), container);
    }

    public static VkQueryPoolPerformanceQueryCreateInfoINTEL create(long address) {
        return new VkQueryPoolPerformanceQueryCreateInfoINTEL(address, null);
    }

    public static VkQueryPoolPerformanceQueryCreateInfoINTEL createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkQueryPoolPerformanceQueryCreateInfoINTEL(address, null);
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

    public static VkQueryPoolPerformanceQueryCreateInfoINTEL malloc(MemoryStack stack) {
        return new VkQueryPoolPerformanceQueryCreateInfoINTEL(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkQueryPoolPerformanceQueryCreateInfoINTEL calloc(MemoryStack stack) {
        return new VkQueryPoolPerformanceQueryCreateInfoINTEL(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nperformanceCountersSampling(long struct) {
        return MemoryUtil.memGetInt(struct + PERFORMANCECOUNTERSSAMPLING);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nperformanceCountersSampling(long struct, int value) {
        MemoryUtil.memPutInt(struct + PERFORMANCECOUNTERSSAMPLING, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkQueryPoolPerformanceQueryCreateInfoINTEL$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkQueryPoolPerformanceQueryCreateInfoINTEL$Buffer.class */
    public static class Buffer extends StructBuffer<VkQueryPoolPerformanceQueryCreateInfoINTEL, Buffer> implements NativeResource {
        private static final VkQueryPoolPerformanceQueryCreateInfoINTEL ELEMENT_FACTORY = VkQueryPoolPerformanceQueryCreateInfoINTEL.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkQueryPoolPerformanceQueryCreateInfoINTEL.SIZEOF);
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
        public VkQueryPoolPerformanceQueryCreateInfoINTEL getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkQueryPoolPerformanceQueryCreateInfoINTEL.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkQueryPoolPerformanceQueryCreateInfoINTEL.npNext(address());
        }

        @NativeType("VkQueryPoolSamplingModeINTEL")
        public int performanceCountersSampling() {
            return VkQueryPoolPerformanceQueryCreateInfoINTEL.nperformanceCountersSampling(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkQueryPoolPerformanceQueryCreateInfoINTEL.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000210000);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkQueryPoolPerformanceQueryCreateInfoINTEL.npNext(address(), value);
            return this;
        }

        public Buffer performanceCountersSampling(@NativeType("VkQueryPoolSamplingModeINTEL") int value) {
            VkQueryPoolPerformanceQueryCreateInfoINTEL.nperformanceCountersSampling(address(), value);
            return this;
        }
    }
}
