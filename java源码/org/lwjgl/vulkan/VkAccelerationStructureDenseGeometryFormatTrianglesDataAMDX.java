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

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX.class */
public class VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX extends Struct<VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int COMPRESSEDDATA;
    public static final int DATASIZE;
    public static final int NUMTRIANGLES;
    public static final int NUMVERTICES;
    public static final int MAXPRIMITIVEINDEX;
    public static final int MAXGEOMETRYINDEX;
    public static final int FORMAT;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(VkDeviceOrHostAddressConstKHR.SIZEOF, VkDeviceOrHostAddressConstKHR.ALIGNOF), __member(8), __member(4), __member(4), __member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        COMPRESSEDDATA = layout.offsetof(2);
        DATASIZE = layout.offsetof(3);
        NUMTRIANGLES = layout.offsetof(4);
        NUMVERTICES = layout.offsetof(5);
        MAXPRIMITIVEINDEX = layout.offsetof(6);
        MAXGEOMETRYINDEX = layout.offsetof(7);
        FORMAT = layout.offsetof(8);
    }

    protected VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX create(long address, ByteBuffer container) {
        return new VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX(address, container);
    }

    public VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX(ByteBuffer container) {
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

    public VkDeviceOrHostAddressConstKHR compressedData() {
        return ncompressedData(address());
    }

    @NativeType("VkDeviceSize")
    public long dataSize() {
        return ndataSize(address());
    }

    @NativeType("uint32_t")
    public int numTriangles() {
        return nnumTriangles(address());
    }

    @NativeType("uint32_t")
    public int numVertices() {
        return nnumVertices(address());
    }

    @NativeType("uint32_t")
    public int maxPrimitiveIndex() {
        return nmaxPrimitiveIndex(address());
    }

    @NativeType("uint32_t")
    public int maxGeometryIndex() {
        return nmaxGeometryIndex(address());
    }

    @NativeType("VkCompressedTriangleFormatAMDX")
    public int format() {
        return nformat(address());
    }

    public VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX sType$Default() {
        return sType(AMDXDenseGeometryFormat.VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_DENSE_GEOMETRY_FORMAT_TRIANGLES_DATA_AMDX);
    }

    public VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX pNext(VkAccelerationStructureTrianglesOpacityMicromapEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX compressedData(VkDeviceOrHostAddressConstKHR value) {
        ncompressedData(address(), value);
        return this;
    }

    public VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX compressedData(Consumer<VkDeviceOrHostAddressConstKHR> consumer) {
        consumer.accept(compressedData());
        return this;
    }

    public VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX dataSize(@NativeType("VkDeviceSize") long value) {
        ndataSize(address(), value);
        return this;
    }

    public VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX numTriangles(@NativeType("uint32_t") int value) {
        nnumTriangles(address(), value);
        return this;
    }

    public VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX numVertices(@NativeType("uint32_t") int value) {
        nnumVertices(address(), value);
        return this;
    }

    public VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX maxPrimitiveIndex(@NativeType("uint32_t") int value) {
        nmaxPrimitiveIndex(address(), value);
        return this;
    }

    public VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX maxGeometryIndex(@NativeType("uint32_t") int value) {
        nmaxGeometryIndex(address(), value);
        return this;
    }

    public VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX format(@NativeType("VkCompressedTriangleFormatAMDX") int value) {
        nformat(address(), value);
        return this;
    }

    public VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX set(int sType, long pNext, VkDeviceOrHostAddressConstKHR compressedData, long dataSize, int numTriangles, int numVertices, int maxPrimitiveIndex, int maxGeometryIndex, int format) {
        sType(sType);
        pNext(pNext);
        compressedData(compressedData);
        dataSize(dataSize);
        numTriangles(numTriangles);
        numVertices(numVertices);
        maxPrimitiveIndex(maxPrimitiveIndex);
        maxGeometryIndex(maxGeometryIndex);
        format(format);
        return this;
    }

    public VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX set(VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX malloc() {
        return new VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX calloc() {
        return new VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX(MemoryUtil.memAddress(container), container);
    }

    public static VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX create(long address) {
        return new VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX(address, null);
    }

    public static VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX(address, null);
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

    public static VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX malloc(MemoryStack stack) {
        return new VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX calloc(MemoryStack stack) {
        return new VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static VkDeviceOrHostAddressConstKHR ncompressedData(long struct) {
        return VkDeviceOrHostAddressConstKHR.create(struct + COMPRESSEDDATA);
    }

    public static long ndataSize(long struct) {
        return MemoryUtil.memGetLong(struct + DATASIZE);
    }

    public static int nnumTriangles(long struct) {
        return MemoryUtil.memGetInt(struct + NUMTRIANGLES);
    }

    public static int nnumVertices(long struct) {
        return MemoryUtil.memGetInt(struct + NUMVERTICES);
    }

    public static int nmaxPrimitiveIndex(long struct) {
        return MemoryUtil.memGetInt(struct + MAXPRIMITIVEINDEX);
    }

    public static int nmaxGeometryIndex(long struct) {
        return MemoryUtil.memGetInt(struct + MAXGEOMETRYINDEX);
    }

    public static int nformat(long struct) {
        return MemoryUtil.memGetInt(struct + FORMAT);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void ncompressedData(long struct, VkDeviceOrHostAddressConstKHR value) {
        MemoryUtil.memCopy(value.address(), struct + COMPRESSEDDATA, VkDeviceOrHostAddressConstKHR.SIZEOF);
    }

    public static void ndataSize(long struct, long value) {
        MemoryUtil.memPutLong(struct + DATASIZE, value);
    }

    public static void nnumTriangles(long struct, int value) {
        MemoryUtil.memPutInt(struct + NUMTRIANGLES, value);
    }

    public static void nnumVertices(long struct, int value) {
        MemoryUtil.memPutInt(struct + NUMVERTICES, value);
    }

    public static void nmaxPrimitiveIndex(long struct, int value) {
        MemoryUtil.memPutInt(struct + MAXPRIMITIVEINDEX, value);
    }

    public static void nmaxGeometryIndex(long struct, int value) {
        MemoryUtil.memPutInt(struct + MAXGEOMETRYINDEX, value);
    }

    public static void nformat(long struct, int value) {
        MemoryUtil.memPutInt(struct + FORMAT, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX$Buffer.class */
    public static class Buffer extends StructBuffer<VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX, Buffer> implements NativeResource {
        private static final VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX ELEMENT_FACTORY = VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX.SIZEOF);
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
        public VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX.npNext(address());
        }

        public VkDeviceOrHostAddressConstKHR compressedData() {
            return VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX.ncompressedData(address());
        }

        @NativeType("VkDeviceSize")
        public long dataSize() {
            return VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX.ndataSize(address());
        }

        @NativeType("uint32_t")
        public int numTriangles() {
            return VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX.nnumTriangles(address());
        }

        @NativeType("uint32_t")
        public int numVertices() {
            return VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX.nnumVertices(address());
        }

        @NativeType("uint32_t")
        public int maxPrimitiveIndex() {
            return VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX.nmaxPrimitiveIndex(address());
        }

        @NativeType("uint32_t")
        public int maxGeometryIndex() {
            return VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX.nmaxGeometryIndex(address());
        }

        @NativeType("VkCompressedTriangleFormatAMDX")
        public int format() {
            return VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX.nformat(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(AMDXDenseGeometryFormat.VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_DENSE_GEOMETRY_FORMAT_TRIANGLES_DATA_AMDX);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX.npNext(address(), value);
            return this;
        }

        public Buffer pNext(VkAccelerationStructureTrianglesOpacityMicromapEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer compressedData(VkDeviceOrHostAddressConstKHR value) {
            VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX.ncompressedData(address(), value);
            return this;
        }

        public Buffer compressedData(Consumer<VkDeviceOrHostAddressConstKHR> consumer) {
            consumer.accept(compressedData());
            return this;
        }

        public Buffer dataSize(@NativeType("VkDeviceSize") long value) {
            VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX.ndataSize(address(), value);
            return this;
        }

        public Buffer numTriangles(@NativeType("uint32_t") int value) {
            VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX.nnumTriangles(address(), value);
            return this;
        }

        public Buffer numVertices(@NativeType("uint32_t") int value) {
            VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX.nnumVertices(address(), value);
            return this;
        }

        public Buffer maxPrimitiveIndex(@NativeType("uint32_t") int value) {
            VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX.nmaxPrimitiveIndex(address(), value);
            return this;
        }

        public Buffer maxGeometryIndex(@NativeType("uint32_t") int value) {
            VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX.nmaxGeometryIndex(address(), value);
            return this;
        }

        public Buffer format(@NativeType("VkCompressedTriangleFormatAMDX") int value) {
            VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX.nformat(address(), value);
            return this;
        }
    }
}
