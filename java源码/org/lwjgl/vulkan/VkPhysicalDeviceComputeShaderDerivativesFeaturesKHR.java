package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR.class */
public class VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR extends Struct<VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int COMPUTEDERIVATIVEGROUPQUADS;
    public static final int COMPUTEDERIVATIVEGROUPLINEAR;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        COMPUTEDERIVATIVEGROUPQUADS = layout.offsetof(2);
        COMPUTEDERIVATIVEGROUPLINEAR = layout.offsetof(3);
    }

    protected VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR(address, container);
    }

    public VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR(ByteBuffer container) {
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

    @NativeType("void *")
    public long pNext() {
        return npNext(address());
    }

    @NativeType("VkBool32")
    public boolean computeDerivativeGroupQuads() {
        return ncomputeDerivativeGroupQuads(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean computeDerivativeGroupLinear() {
        return ncomputeDerivativeGroupLinear(address()) != 0;
    }

    public VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR sType$Default() {
        return sType(1000201000);
    }

    public VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR computeDerivativeGroupQuads(@NativeType("VkBool32") boolean value) {
        ncomputeDerivativeGroupQuads(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR computeDerivativeGroupLinear(@NativeType("VkBool32") boolean value) {
        ncomputeDerivativeGroupLinear(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR set(int sType, long pNext, boolean computeDerivativeGroupQuads, boolean computeDerivativeGroupLinear) {
        sType(sType);
        pNext(pNext);
        computeDerivativeGroupQuads(computeDerivativeGroupQuads);
        computeDerivativeGroupLinear(computeDerivativeGroupLinear);
        return this;
    }

    public VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR set(VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR malloc() {
        return new VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR calloc() {
        return new VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR create(long address) {
        return new VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR(address, null);
    }

    public static VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR(address, null);
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

    public static VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR malloc(MemoryStack stack) {
        return new VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR calloc(MemoryStack stack) {
        return new VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int ncomputeDerivativeGroupQuads(long struct) {
        return MemoryUtil.memGetInt(struct + COMPUTEDERIVATIVEGROUPQUADS);
    }

    public static int ncomputeDerivativeGroupLinear(long struct) {
        return MemoryUtil.memGetInt(struct + COMPUTEDERIVATIVEGROUPLINEAR);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void ncomputeDerivativeGroupQuads(long struct, int value) {
        MemoryUtil.memPutInt(struct + COMPUTEDERIVATIVEGROUPQUADS, value);
    }

    public static void ncomputeDerivativeGroupLinear(long struct, int value) {
        MemoryUtil.memPutInt(struct + COMPUTEDERIVATIVEGROUPLINEAR, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR ELEMENT_FACTORY = VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR.SIZEOF);
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
        public VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean computeDerivativeGroupQuads() {
            return VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR.ncomputeDerivativeGroupQuads(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean computeDerivativeGroupLinear() {
            return VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR.ncomputeDerivativeGroupLinear(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000201000);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR.npNext(address(), value);
            return this;
        }

        public Buffer computeDerivativeGroupQuads(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR.ncomputeDerivativeGroupQuads(address(), value ? 1 : 0);
            return this;
        }

        public Buffer computeDerivativeGroupLinear(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR.ncomputeDerivativeGroupLinear(address(), value ? 1 : 0);
            return this;
        }
    }
}
