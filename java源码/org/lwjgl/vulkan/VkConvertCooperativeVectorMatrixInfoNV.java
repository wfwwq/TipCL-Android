package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import java.util.function.Consumer;
import org.lwjgl.BufferUtils;
import org.lwjgl.PointerBuffer;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkConvertCooperativeVectorMatrixInfoNV.class */
public class VkConvertCooperativeVectorMatrixInfoNV extends Struct<VkConvertCooperativeVectorMatrixInfoNV> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int SRCSIZE;
    public static final int SRCDATA;
    public static final int PDSTSIZE;
    public static final int DSTDATA;
    public static final int SRCCOMPONENTTYPE;
    public static final int DSTCOMPONENTTYPE;
    public static final int NUMROWS;
    public static final int NUMCOLUMNS;
    public static final int SRCLAYOUT;
    public static final int SRCSTRIDE;
    public static final int DSTLAYOUT;
    public static final int DSTSTRIDE;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(VkDeviceOrHostAddressConstKHR.SIZEOF, VkDeviceOrHostAddressConstKHR.ALIGNOF), __member(POINTER_SIZE), __member(VkDeviceOrHostAddressKHR.SIZEOF, VkDeviceOrHostAddressKHR.ALIGNOF), __member(4), __member(4), __member(4), __member(4), __member(4), __member(POINTER_SIZE), __member(4), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SRCSIZE = layout.offsetof(2);
        SRCDATA = layout.offsetof(3);
        PDSTSIZE = layout.offsetof(4);
        DSTDATA = layout.offsetof(5);
        SRCCOMPONENTTYPE = layout.offsetof(6);
        DSTCOMPONENTTYPE = layout.offsetof(7);
        NUMROWS = layout.offsetof(8);
        NUMCOLUMNS = layout.offsetof(9);
        SRCLAYOUT = layout.offsetof(10);
        SRCSTRIDE = layout.offsetof(11);
        DSTLAYOUT = layout.offsetof(12);
        DSTSTRIDE = layout.offsetof(13);
    }

    protected VkConvertCooperativeVectorMatrixInfoNV(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkConvertCooperativeVectorMatrixInfoNV create(long address, ByteBuffer container) {
        return new VkConvertCooperativeVectorMatrixInfoNV(address, container);
    }

    public VkConvertCooperativeVectorMatrixInfoNV(ByteBuffer container) {
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

    @NativeType("size_t")
    public long srcSize() {
        return nsrcSize(address());
    }

    public VkDeviceOrHostAddressConstKHR srcData() {
        return nsrcData(address());
    }

    @NativeType("size_t *")
    public PointerBuffer pDstSize(int capacity) {
        return npDstSize(address(), capacity);
    }

    public VkDeviceOrHostAddressKHR dstData() {
        return ndstData(address());
    }

    @NativeType("VkComponentTypeNV")
    public int srcComponentType() {
        return nsrcComponentType(address());
    }

    @NativeType("VkComponentTypeNV")
    public int dstComponentType() {
        return ndstComponentType(address());
    }

    @NativeType("uint32_t")
    public int numRows() {
        return nnumRows(address());
    }

    @NativeType("uint32_t")
    public int numColumns() {
        return nnumColumns(address());
    }

    @NativeType("VkCooperativeVectorMatrixLayoutNV")
    public int srcLayout() {
        return nsrcLayout(address());
    }

    @NativeType("size_t")
    public long srcStride() {
        return nsrcStride(address());
    }

    @NativeType("VkCooperativeVectorMatrixLayoutNV")
    public int dstLayout() {
        return ndstLayout(address());
    }

    @NativeType("size_t")
    public long dstStride() {
        return ndstStride(address());
    }

    public VkConvertCooperativeVectorMatrixInfoNV sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkConvertCooperativeVectorMatrixInfoNV sType$Default() {
        return sType(NVCooperativeVector.VK_STRUCTURE_TYPE_CONVERT_COOPERATIVE_VECTOR_MATRIX_INFO_NV);
    }

    public VkConvertCooperativeVectorMatrixInfoNV pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkConvertCooperativeVectorMatrixInfoNV srcSize(@NativeType("size_t") long value) {
        nsrcSize(address(), value);
        return this;
    }

    public VkConvertCooperativeVectorMatrixInfoNV srcData(VkDeviceOrHostAddressConstKHR value) {
        nsrcData(address(), value);
        return this;
    }

    public VkConvertCooperativeVectorMatrixInfoNV srcData(Consumer<VkDeviceOrHostAddressConstKHR> consumer) {
        consumer.accept(srcData());
        return this;
    }

    public VkConvertCooperativeVectorMatrixInfoNV pDstSize(@NativeType("size_t *") PointerBuffer value) {
        npDstSize(address(), value);
        return this;
    }

    public VkConvertCooperativeVectorMatrixInfoNV dstData(VkDeviceOrHostAddressKHR value) {
        ndstData(address(), value);
        return this;
    }

    public VkConvertCooperativeVectorMatrixInfoNV dstData(Consumer<VkDeviceOrHostAddressKHR> consumer) {
        consumer.accept(dstData());
        return this;
    }

    public VkConvertCooperativeVectorMatrixInfoNV srcComponentType(@NativeType("VkComponentTypeNV") int value) {
        nsrcComponentType(address(), value);
        return this;
    }

    public VkConvertCooperativeVectorMatrixInfoNV dstComponentType(@NativeType("VkComponentTypeNV") int value) {
        ndstComponentType(address(), value);
        return this;
    }

    public VkConvertCooperativeVectorMatrixInfoNV numRows(@NativeType("uint32_t") int value) {
        nnumRows(address(), value);
        return this;
    }

    public VkConvertCooperativeVectorMatrixInfoNV numColumns(@NativeType("uint32_t") int value) {
        nnumColumns(address(), value);
        return this;
    }

    public VkConvertCooperativeVectorMatrixInfoNV srcLayout(@NativeType("VkCooperativeVectorMatrixLayoutNV") int value) {
        nsrcLayout(address(), value);
        return this;
    }

    public VkConvertCooperativeVectorMatrixInfoNV srcStride(@NativeType("size_t") long value) {
        nsrcStride(address(), value);
        return this;
    }

    public VkConvertCooperativeVectorMatrixInfoNV dstLayout(@NativeType("VkCooperativeVectorMatrixLayoutNV") int value) {
        ndstLayout(address(), value);
        return this;
    }

    public VkConvertCooperativeVectorMatrixInfoNV dstStride(@NativeType("size_t") long value) {
        ndstStride(address(), value);
        return this;
    }

    public VkConvertCooperativeVectorMatrixInfoNV set(int sType, long pNext, long srcSize, VkDeviceOrHostAddressConstKHR srcData, PointerBuffer pDstSize, VkDeviceOrHostAddressKHR dstData, int srcComponentType, int dstComponentType, int numRows, int numColumns, int srcLayout, long srcStride, int dstLayout, long dstStride) {
        sType(sType);
        pNext(pNext);
        srcSize(srcSize);
        srcData(srcData);
        pDstSize(pDstSize);
        dstData(dstData);
        srcComponentType(srcComponentType);
        dstComponentType(dstComponentType);
        numRows(numRows);
        numColumns(numColumns);
        srcLayout(srcLayout);
        srcStride(srcStride);
        dstLayout(dstLayout);
        dstStride(dstStride);
        return this;
    }

    public VkConvertCooperativeVectorMatrixInfoNV set(VkConvertCooperativeVectorMatrixInfoNV src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkConvertCooperativeVectorMatrixInfoNV malloc() {
        return new VkConvertCooperativeVectorMatrixInfoNV(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkConvertCooperativeVectorMatrixInfoNV calloc() {
        return new VkConvertCooperativeVectorMatrixInfoNV(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkConvertCooperativeVectorMatrixInfoNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkConvertCooperativeVectorMatrixInfoNV(MemoryUtil.memAddress(container), container);
    }

    public static VkConvertCooperativeVectorMatrixInfoNV create(long address) {
        return new VkConvertCooperativeVectorMatrixInfoNV(address, null);
    }

    public static VkConvertCooperativeVectorMatrixInfoNV createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkConvertCooperativeVectorMatrixInfoNV(address, null);
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

    public static VkConvertCooperativeVectorMatrixInfoNV malloc(MemoryStack stack) {
        return new VkConvertCooperativeVectorMatrixInfoNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkConvertCooperativeVectorMatrixInfoNV calloc(MemoryStack stack) {
        return new VkConvertCooperativeVectorMatrixInfoNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static long nsrcSize(long struct) {
        return MemoryUtil.memGetAddress(struct + SRCSIZE);
    }

    public static VkDeviceOrHostAddressConstKHR nsrcData(long struct) {
        return VkDeviceOrHostAddressConstKHR.create(struct + SRCDATA);
    }

    public static PointerBuffer npDstSize(long struct, int capacity) {
        return MemoryUtil.memPointerBufferSafe(MemoryUtil.memGetAddress(struct + PDSTSIZE), capacity);
    }

    public static VkDeviceOrHostAddressKHR ndstData(long struct) {
        return VkDeviceOrHostAddressKHR.create(struct + DSTDATA);
    }

    public static int nsrcComponentType(long struct) {
        return MemoryUtil.memGetInt(struct + SRCCOMPONENTTYPE);
    }

    public static int ndstComponentType(long struct) {
        return MemoryUtil.memGetInt(struct + DSTCOMPONENTTYPE);
    }

    public static int nnumRows(long struct) {
        return MemoryUtil.memGetInt(struct + NUMROWS);
    }

    public static int nnumColumns(long struct) {
        return MemoryUtil.memGetInt(struct + NUMCOLUMNS);
    }

    public static int nsrcLayout(long struct) {
        return MemoryUtil.memGetInt(struct + SRCLAYOUT);
    }

    public static long nsrcStride(long struct) {
        return MemoryUtil.memGetAddress(struct + SRCSTRIDE);
    }

    public static int ndstLayout(long struct) {
        return MemoryUtil.memGetInt(struct + DSTLAYOUT);
    }

    public static long ndstStride(long struct) {
        return MemoryUtil.memGetAddress(struct + DSTSTRIDE);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nsrcSize(long struct, long value) {
        MemoryUtil.memPutAddress(struct + SRCSIZE, value);
    }

    public static void nsrcData(long struct, VkDeviceOrHostAddressConstKHR value) {
        MemoryUtil.memCopy(value.address(), struct + SRCDATA, VkDeviceOrHostAddressConstKHR.SIZEOF);
    }

    public static void npDstSize(long struct, PointerBuffer value) {
        MemoryUtil.memPutAddress(struct + PDSTSIZE, MemoryUtil.memAddressSafe(value));
    }

    public static void ndstData(long struct, VkDeviceOrHostAddressKHR value) {
        MemoryUtil.memCopy(value.address(), struct + DSTDATA, VkDeviceOrHostAddressKHR.SIZEOF);
    }

    public static void nsrcComponentType(long struct, int value) {
        MemoryUtil.memPutInt(struct + SRCCOMPONENTTYPE, value);
    }

    public static void ndstComponentType(long struct, int value) {
        MemoryUtil.memPutInt(struct + DSTCOMPONENTTYPE, value);
    }

    public static void nnumRows(long struct, int value) {
        MemoryUtil.memPutInt(struct + NUMROWS, value);
    }

    public static void nnumColumns(long struct, int value) {
        MemoryUtil.memPutInt(struct + NUMCOLUMNS, value);
    }

    public static void nsrcLayout(long struct, int value) {
        MemoryUtil.memPutInt(struct + SRCLAYOUT, value);
    }

    public static void nsrcStride(long struct, long value) {
        MemoryUtil.memPutAddress(struct + SRCSTRIDE, value);
    }

    public static void ndstLayout(long struct, int value) {
        MemoryUtil.memPutInt(struct + DSTLAYOUT, value);
    }

    public static void ndstStride(long struct, long value) {
        MemoryUtil.memPutAddress(struct + DSTSTRIDE, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkConvertCooperativeVectorMatrixInfoNV$Buffer.class */
    public static class Buffer extends StructBuffer<VkConvertCooperativeVectorMatrixInfoNV, Buffer> implements NativeResource {
        private static final VkConvertCooperativeVectorMatrixInfoNV ELEMENT_FACTORY = VkConvertCooperativeVectorMatrixInfoNV.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkConvertCooperativeVectorMatrixInfoNV.SIZEOF);
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
        public VkConvertCooperativeVectorMatrixInfoNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkConvertCooperativeVectorMatrixInfoNV.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkConvertCooperativeVectorMatrixInfoNV.npNext(address());
        }

        @NativeType("size_t")
        public long srcSize() {
            return VkConvertCooperativeVectorMatrixInfoNV.nsrcSize(address());
        }

        public VkDeviceOrHostAddressConstKHR srcData() {
            return VkConvertCooperativeVectorMatrixInfoNV.nsrcData(address());
        }

        @NativeType("size_t *")
        public PointerBuffer pDstSize(int capacity) {
            return VkConvertCooperativeVectorMatrixInfoNV.npDstSize(address(), capacity);
        }

        public VkDeviceOrHostAddressKHR dstData() {
            return VkConvertCooperativeVectorMatrixInfoNV.ndstData(address());
        }

        @NativeType("VkComponentTypeNV")
        public int srcComponentType() {
            return VkConvertCooperativeVectorMatrixInfoNV.nsrcComponentType(address());
        }

        @NativeType("VkComponentTypeNV")
        public int dstComponentType() {
            return VkConvertCooperativeVectorMatrixInfoNV.ndstComponentType(address());
        }

        @NativeType("uint32_t")
        public int numRows() {
            return VkConvertCooperativeVectorMatrixInfoNV.nnumRows(address());
        }

        @NativeType("uint32_t")
        public int numColumns() {
            return VkConvertCooperativeVectorMatrixInfoNV.nnumColumns(address());
        }

        @NativeType("VkCooperativeVectorMatrixLayoutNV")
        public int srcLayout() {
            return VkConvertCooperativeVectorMatrixInfoNV.nsrcLayout(address());
        }

        @NativeType("size_t")
        public long srcStride() {
            return VkConvertCooperativeVectorMatrixInfoNV.nsrcStride(address());
        }

        @NativeType("VkCooperativeVectorMatrixLayoutNV")
        public int dstLayout() {
            return VkConvertCooperativeVectorMatrixInfoNV.ndstLayout(address());
        }

        @NativeType("size_t")
        public long dstStride() {
            return VkConvertCooperativeVectorMatrixInfoNV.ndstStride(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkConvertCooperativeVectorMatrixInfoNV.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(NVCooperativeVector.VK_STRUCTURE_TYPE_CONVERT_COOPERATIVE_VECTOR_MATRIX_INFO_NV);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkConvertCooperativeVectorMatrixInfoNV.npNext(address(), value);
            return this;
        }

        public Buffer srcSize(@NativeType("size_t") long value) {
            VkConvertCooperativeVectorMatrixInfoNV.nsrcSize(address(), value);
            return this;
        }

        public Buffer srcData(VkDeviceOrHostAddressConstKHR value) {
            VkConvertCooperativeVectorMatrixInfoNV.nsrcData(address(), value);
            return this;
        }

        public Buffer srcData(Consumer<VkDeviceOrHostAddressConstKHR> consumer) {
            consumer.accept(srcData());
            return this;
        }

        public Buffer pDstSize(@NativeType("size_t *") PointerBuffer value) {
            VkConvertCooperativeVectorMatrixInfoNV.npDstSize(address(), value);
            return this;
        }

        public Buffer dstData(VkDeviceOrHostAddressKHR value) {
            VkConvertCooperativeVectorMatrixInfoNV.ndstData(address(), value);
            return this;
        }

        public Buffer dstData(Consumer<VkDeviceOrHostAddressKHR> consumer) {
            consumer.accept(dstData());
            return this;
        }

        public Buffer srcComponentType(@NativeType("VkComponentTypeNV") int value) {
            VkConvertCooperativeVectorMatrixInfoNV.nsrcComponentType(address(), value);
            return this;
        }

        public Buffer dstComponentType(@NativeType("VkComponentTypeNV") int value) {
            VkConvertCooperativeVectorMatrixInfoNV.ndstComponentType(address(), value);
            return this;
        }

        public Buffer numRows(@NativeType("uint32_t") int value) {
            VkConvertCooperativeVectorMatrixInfoNV.nnumRows(address(), value);
            return this;
        }

        public Buffer numColumns(@NativeType("uint32_t") int value) {
            VkConvertCooperativeVectorMatrixInfoNV.nnumColumns(address(), value);
            return this;
        }

        public Buffer srcLayout(@NativeType("VkCooperativeVectorMatrixLayoutNV") int value) {
            VkConvertCooperativeVectorMatrixInfoNV.nsrcLayout(address(), value);
            return this;
        }

        public Buffer srcStride(@NativeType("size_t") long value) {
            VkConvertCooperativeVectorMatrixInfoNV.nsrcStride(address(), value);
            return this;
        }

        public Buffer dstLayout(@NativeType("VkCooperativeVectorMatrixLayoutNV") int value) {
            VkConvertCooperativeVectorMatrixInfoNV.ndstLayout(address(), value);
            return this;
        }

        public Buffer dstStride(@NativeType("size_t") long value) {
            VkConvertCooperativeVectorMatrixInfoNV.ndstStride(address(), value);
            return this;
        }
    }
}
