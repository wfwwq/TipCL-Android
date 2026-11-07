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

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoEncodeQuantizationMapInfoKHR.class */
public class VkVideoEncodeQuantizationMapInfoKHR extends Struct<VkVideoEncodeQuantizationMapInfoKHR> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int QUANTIZATIONMAP;
    public static final int QUANTIZATIONMAPEXTENT;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(8), __member(VkExtent2D.SIZEOF, VkExtent2D.ALIGNOF));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        QUANTIZATIONMAP = layout.offsetof(2);
        QUANTIZATIONMAPEXTENT = layout.offsetof(3);
    }

    protected VkVideoEncodeQuantizationMapInfoKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkVideoEncodeQuantizationMapInfoKHR create(long address, ByteBuffer container) {
        return new VkVideoEncodeQuantizationMapInfoKHR(address, container);
    }

    public VkVideoEncodeQuantizationMapInfoKHR(ByteBuffer container) {
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

    @NativeType("VkImageView")
    public long quantizationMap() {
        return nquantizationMap(address());
    }

    public VkExtent2D quantizationMapExtent() {
        return nquantizationMapExtent(address());
    }

    public VkVideoEncodeQuantizationMapInfoKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkVideoEncodeQuantizationMapInfoKHR sType$Default() {
        return sType(KHRVideoEncodeQuantizationMap.VK_STRUCTURE_TYPE_VIDEO_ENCODE_QUANTIZATION_MAP_INFO_KHR);
    }

    public VkVideoEncodeQuantizationMapInfoKHR pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkVideoEncodeQuantizationMapInfoKHR quantizationMap(@NativeType("VkImageView") long value) {
        nquantizationMap(address(), value);
        return this;
    }

    public VkVideoEncodeQuantizationMapInfoKHR quantizationMapExtent(VkExtent2D value) {
        nquantizationMapExtent(address(), value);
        return this;
    }

    public VkVideoEncodeQuantizationMapInfoKHR quantizationMapExtent(Consumer<VkExtent2D> consumer) {
        consumer.accept(quantizationMapExtent());
        return this;
    }

    public VkVideoEncodeQuantizationMapInfoKHR set(int sType, long pNext, long quantizationMap, VkExtent2D quantizationMapExtent) {
        sType(sType);
        pNext(pNext);
        quantizationMap(quantizationMap);
        quantizationMapExtent(quantizationMapExtent);
        return this;
    }

    public VkVideoEncodeQuantizationMapInfoKHR set(VkVideoEncodeQuantizationMapInfoKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkVideoEncodeQuantizationMapInfoKHR malloc() {
        return new VkVideoEncodeQuantizationMapInfoKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkVideoEncodeQuantizationMapInfoKHR calloc() {
        return new VkVideoEncodeQuantizationMapInfoKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkVideoEncodeQuantizationMapInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkVideoEncodeQuantizationMapInfoKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkVideoEncodeQuantizationMapInfoKHR create(long address) {
        return new VkVideoEncodeQuantizationMapInfoKHR(address, null);
    }

    public static VkVideoEncodeQuantizationMapInfoKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkVideoEncodeQuantizationMapInfoKHR(address, null);
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

    public static VkVideoEncodeQuantizationMapInfoKHR malloc(MemoryStack stack) {
        return new VkVideoEncodeQuantizationMapInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkVideoEncodeQuantizationMapInfoKHR calloc(MemoryStack stack) {
        return new VkVideoEncodeQuantizationMapInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static long nquantizationMap(long struct) {
        return MemoryUtil.memGetLong(struct + QUANTIZATIONMAP);
    }

    public static VkExtent2D nquantizationMapExtent(long struct) {
        return VkExtent2D.create(struct + QUANTIZATIONMAPEXTENT);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nquantizationMap(long struct, long value) {
        MemoryUtil.memPutLong(struct + QUANTIZATIONMAP, value);
    }

    public static void nquantizationMapExtent(long struct, VkExtent2D value) {
        MemoryUtil.memCopy(value.address(), struct + QUANTIZATIONMAPEXTENT, VkExtent2D.SIZEOF);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoEncodeQuantizationMapInfoKHR$Buffer.class */
    public static class Buffer extends StructBuffer<VkVideoEncodeQuantizationMapInfoKHR, Buffer> implements NativeResource {
        private static final VkVideoEncodeQuantizationMapInfoKHR ELEMENT_FACTORY = VkVideoEncodeQuantizationMapInfoKHR.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkVideoEncodeQuantizationMapInfoKHR.SIZEOF);
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
        public VkVideoEncodeQuantizationMapInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkVideoEncodeQuantizationMapInfoKHR.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkVideoEncodeQuantizationMapInfoKHR.npNext(address());
        }

        @NativeType("VkImageView")
        public long quantizationMap() {
            return VkVideoEncodeQuantizationMapInfoKHR.nquantizationMap(address());
        }

        public VkExtent2D quantizationMapExtent() {
            return VkVideoEncodeQuantizationMapInfoKHR.nquantizationMapExtent(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkVideoEncodeQuantizationMapInfoKHR.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(KHRVideoEncodeQuantizationMap.VK_STRUCTURE_TYPE_VIDEO_ENCODE_QUANTIZATION_MAP_INFO_KHR);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkVideoEncodeQuantizationMapInfoKHR.npNext(address(), value);
            return this;
        }

        public Buffer quantizationMap(@NativeType("VkImageView") long value) {
            VkVideoEncodeQuantizationMapInfoKHR.nquantizationMap(address(), value);
            return this;
        }

        public Buffer quantizationMapExtent(VkExtent2D value) {
            VkVideoEncodeQuantizationMapInfoKHR.nquantizationMapExtent(address(), value);
            return this;
        }

        public Buffer quantizationMapExtent(Consumer<VkExtent2D> consumer) {
            consumer.accept(quantizationMapExtent());
            return this;
        }
    }
}
