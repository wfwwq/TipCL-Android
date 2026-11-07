package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkQueryPoolPerformanceQueryCreateInfoINTEL;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkQueryPoolCreateInfoINTEL.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkQueryPoolCreateInfoINTEL.class */
public class VkQueryPoolCreateInfoINTEL extends VkQueryPoolPerformanceQueryCreateInfoINTEL {
    protected VkQueryPoolCreateInfoINTEL(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.vulkan.VkQueryPoolPerformanceQueryCreateInfoINTEL, org.lwjgl.system.Struct
    public VkQueryPoolCreateInfoINTEL create(long address, ByteBuffer container) {
        return new VkQueryPoolCreateInfoINTEL(address, container);
    }

    public VkQueryPoolCreateInfoINTEL(ByteBuffer container) {
        super(container);
    }

    @Override // org.lwjgl.vulkan.VkQueryPoolPerformanceQueryCreateInfoINTEL
    public VkQueryPoolCreateInfoINTEL sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkQueryPoolPerformanceQueryCreateInfoINTEL
    public VkQueryPoolCreateInfoINTEL sType$Default() {
        return sType(1000210000);
    }

    @Override // org.lwjgl.vulkan.VkQueryPoolPerformanceQueryCreateInfoINTEL
    public VkQueryPoolCreateInfoINTEL pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkQueryPoolPerformanceQueryCreateInfoINTEL
    public VkQueryPoolCreateInfoINTEL performanceCountersSampling(@NativeType("VkQueryPoolSamplingModeINTEL") int value) {
        nperformanceCountersSampling(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkQueryPoolPerformanceQueryCreateInfoINTEL
    public VkQueryPoolCreateInfoINTEL set(int sType, long pNext, int performanceCountersSampling) {
        sType(sType);
        pNext(pNext);
        performanceCountersSampling(performanceCountersSampling);
        return this;
    }

    public VkQueryPoolCreateInfoINTEL set(VkQueryPoolCreateInfoINTEL src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkQueryPoolCreateInfoINTEL malloc() {
        return new VkQueryPoolCreateInfoINTEL(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkQueryPoolCreateInfoINTEL calloc() {
        return new VkQueryPoolCreateInfoINTEL(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkQueryPoolCreateInfoINTEL create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkQueryPoolCreateInfoINTEL(MemoryUtil.memAddress(container), container);
    }

    public static VkQueryPoolCreateInfoINTEL create(long address) {
        return new VkQueryPoolCreateInfoINTEL(address, null);
    }

    public static VkQueryPoolCreateInfoINTEL createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkQueryPoolCreateInfoINTEL(address, null);
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

    public static VkQueryPoolCreateInfoINTEL malloc(MemoryStack stack) {
        return new VkQueryPoolCreateInfoINTEL(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkQueryPoolCreateInfoINTEL calloc(MemoryStack stack) {
        return new VkQueryPoolCreateInfoINTEL(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkQueryPoolCreateInfoINTEL$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkQueryPoolCreateInfoINTEL$Buffer.class */
    public static class Buffer extends VkQueryPoolPerformanceQueryCreateInfoINTEL.Buffer {
        private static final VkQueryPoolCreateInfoINTEL ELEMENT_FACTORY = VkQueryPoolCreateInfoINTEL.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container);
        }

        public Buffer(long address, int cap) {
            super(address, null, -1, 0, cap, cap);
        }

        Buffer(long address, ByteBuffer container, int mark, int pos, int lim, int cap) {
            super(address, container, mark, pos, lim, cap);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkQueryPoolPerformanceQueryCreateInfoINTEL.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer self() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkQueryPoolPerformanceQueryCreateInfoINTEL.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer create(long address, ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkQueryPoolPerformanceQueryCreateInfoINTEL.Buffer, org.lwjgl.system.StructBuffer
        public VkQueryPoolCreateInfoINTEL getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @Override // org.lwjgl.vulkan.VkQueryPoolPerformanceQueryCreateInfoINTEL.Buffer
        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkQueryPoolCreateInfoINTEL.nsType(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkQueryPoolPerformanceQueryCreateInfoINTEL.Buffer
        public Buffer sType$Default() {
            return sType(1000210000);
        }

        @Override // org.lwjgl.vulkan.VkQueryPoolPerformanceQueryCreateInfoINTEL.Buffer
        public Buffer pNext(@NativeType("void const *") long value) {
            VkQueryPoolCreateInfoINTEL.npNext(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkQueryPoolPerformanceQueryCreateInfoINTEL.Buffer
        public Buffer performanceCountersSampling(@NativeType("VkQueryPoolSamplingModeINTEL") int value) {
            VkQueryPoolCreateInfoINTEL.nperformanceCountersSampling(address(), value);
            return this;
        }
    }
}
