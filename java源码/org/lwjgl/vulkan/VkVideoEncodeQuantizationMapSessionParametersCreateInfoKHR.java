package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import java.util.function.Consumer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR.class */
public class VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR extends Struct<VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int QUANTIZATIONMAPTEXELSIZE;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(VkExtent2D.SIZEOF, VkExtent2D.ALIGNOF));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        QUANTIZATIONMAPTEXELSIZE = layout.offsetof(2);
    }

    protected VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR create(long address, ByteBuffer container) {
        return new VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR(address, container);
    }

    public VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR(ByteBuffer container) {
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

    public VkExtent2D quantizationMapTexelSize() {
        return nquantizationMapTexelSize(address());
    }

    public VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR sType$Default() {
        return sType(KHRVideoEncodeQuantizationMap.VK_STRUCTURE_TYPE_VIDEO_ENCODE_QUANTIZATION_MAP_SESSION_PARAMETERS_CREATE_INFO_KHR);
    }

    public VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR quantizationMapTexelSize(VkExtent2D value) {
        nquantizationMapTexelSize(address(), value);
        return this;
    }

    public VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR quantizationMapTexelSize(Consumer<VkExtent2D> consumer) {
        consumer.accept(quantizationMapTexelSize());
        return this;
    }

    public VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR set(int sType, long pNext, VkExtent2D quantizationMapTexelSize) {
        sType(sType);
        pNext(pNext);
        quantizationMapTexelSize(quantizationMapTexelSize);
        return this;
    }

    public VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR set(VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR malloc() {
        return new VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR calloc() {
        return new VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR create(long address) {
        return new VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR(address, null);
    }

    public static VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR(address, null);
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

    public static VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR malloc(MemoryStack stack) {
        return new VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR calloc(MemoryStack stack) {
        return new VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static VkExtent2D nquantizationMapTexelSize(long struct) {
        return VkExtent2D.create(struct + QUANTIZATIONMAPTEXELSIZE);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nquantizationMapTexelSize(long struct, VkExtent2D value) {
        MemoryUtil.memCopy(value.address(), struct + QUANTIZATIONMAPTEXELSIZE, VkExtent2D.SIZEOF);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR$Buffer.class */
    public static class Buffer extends StructBuffer<VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR, Buffer> implements NativeResource {
        private static final VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR ELEMENT_FACTORY = VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR.SIZEOF);
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
        public VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR.npNext(address());
        }

        public VkExtent2D quantizationMapTexelSize() {
            return VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR.nquantizationMapTexelSize(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(KHRVideoEncodeQuantizationMap.VK_STRUCTURE_TYPE_VIDEO_ENCODE_QUANTIZATION_MAP_SESSION_PARAMETERS_CREATE_INFO_KHR);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR.npNext(address(), value);
            return this;
        }

        public Buffer quantizationMapTexelSize(VkExtent2D value) {
            VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR.nquantizationMapTexelSize(address(), value);
            return this;
        }

        public Buffer quantizationMapTexelSize(Consumer<VkExtent2D> consumer) {
            consumer.accept(quantizationMapTexelSize());
            return this;
        }
    }
}
