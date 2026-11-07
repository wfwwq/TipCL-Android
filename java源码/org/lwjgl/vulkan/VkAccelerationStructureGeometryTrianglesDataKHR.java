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

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkAccelerationStructureGeometryTrianglesDataKHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkAccelerationStructureGeometryTrianglesDataKHR.class */
public class VkAccelerationStructureGeometryTrianglesDataKHR extends Struct<VkAccelerationStructureGeometryTrianglesDataKHR> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int VERTEXFORMAT;
    public static final int VERTEXDATA;
    public static final int VERTEXSTRIDE;
    public static final int MAXVERTEX;
    public static final int INDEXTYPE;
    public static final int INDEXDATA;
    public static final int TRANSFORMDATA;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(VkDeviceOrHostAddressConstKHR.SIZEOF, VkDeviceOrHostAddressConstKHR.ALIGNOF), __member(8), __member(4), __member(4), __member(VkDeviceOrHostAddressConstKHR.SIZEOF, VkDeviceOrHostAddressConstKHR.ALIGNOF), __member(VkDeviceOrHostAddressConstKHR.SIZEOF, VkDeviceOrHostAddressConstKHR.ALIGNOF));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        VERTEXFORMAT = layout.offsetof(2);
        VERTEXDATA = layout.offsetof(3);
        VERTEXSTRIDE = layout.offsetof(4);
        MAXVERTEX = layout.offsetof(5);
        INDEXTYPE = layout.offsetof(6);
        INDEXDATA = layout.offsetof(7);
        TRANSFORMDATA = layout.offsetof(8);
    }

    protected VkAccelerationStructureGeometryTrianglesDataKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkAccelerationStructureGeometryTrianglesDataKHR create(long address, ByteBuffer container) {
        return new VkAccelerationStructureGeometryTrianglesDataKHR(address, container);
    }

    public VkAccelerationStructureGeometryTrianglesDataKHR(ByteBuffer container) {
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

    @NativeType("VkFormat")
    public int vertexFormat() {
        return nvertexFormat(address());
    }

    public VkDeviceOrHostAddressConstKHR vertexData() {
        return nvertexData(address());
    }

    @NativeType("VkDeviceSize")
    public long vertexStride() {
        return nvertexStride(address());
    }

    @NativeType("uint32_t")
    public int maxVertex() {
        return nmaxVertex(address());
    }

    @NativeType("VkIndexType")
    public int indexType() {
        return nindexType(address());
    }

    public VkDeviceOrHostAddressConstKHR indexData() {
        return nindexData(address());
    }

    public VkDeviceOrHostAddressConstKHR transformData() {
        return ntransformData(address());
    }

    public VkAccelerationStructureGeometryTrianglesDataKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkAccelerationStructureGeometryTrianglesDataKHR sType$Default() {
        return sType(KHRAccelerationStructure.VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_GEOMETRY_TRIANGLES_DATA_KHR);
    }

    public VkAccelerationStructureGeometryTrianglesDataKHR pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkAccelerationStructureGeometryTrianglesDataKHR pNext(VkAccelerationStructureGeometryMotionTrianglesDataNV value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkAccelerationStructureGeometryTrianglesDataKHR pNext(VkAccelerationStructureTrianglesDisplacementMicromapNV value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkAccelerationStructureGeometryTrianglesDataKHR pNext(VkAccelerationStructureTrianglesOpacityMicromapEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkAccelerationStructureGeometryTrianglesDataKHR vertexFormat(@NativeType("VkFormat") int value) {
        nvertexFormat(address(), value);
        return this;
    }

    public VkAccelerationStructureGeometryTrianglesDataKHR vertexData(VkDeviceOrHostAddressConstKHR value) {
        nvertexData(address(), value);
        return this;
    }

    public VkAccelerationStructureGeometryTrianglesDataKHR vertexData(Consumer<VkDeviceOrHostAddressConstKHR> consumer) {
        consumer.accept(vertexData());
        return this;
    }

    public VkAccelerationStructureGeometryTrianglesDataKHR vertexStride(@NativeType("VkDeviceSize") long value) {
        nvertexStride(address(), value);
        return this;
    }

    public VkAccelerationStructureGeometryTrianglesDataKHR maxVertex(@NativeType("uint32_t") int value) {
        nmaxVertex(address(), value);
        return this;
    }

    public VkAccelerationStructureGeometryTrianglesDataKHR indexType(@NativeType("VkIndexType") int value) {
        nindexType(address(), value);
        return this;
    }

    public VkAccelerationStructureGeometryTrianglesDataKHR indexData(VkDeviceOrHostAddressConstKHR value) {
        nindexData(address(), value);
        return this;
    }

    public VkAccelerationStructureGeometryTrianglesDataKHR indexData(Consumer<VkDeviceOrHostAddressConstKHR> consumer) {
        consumer.accept(indexData());
        return this;
    }

    public VkAccelerationStructureGeometryTrianglesDataKHR transformData(VkDeviceOrHostAddressConstKHR value) {
        ntransformData(address(), value);
        return this;
    }

    public VkAccelerationStructureGeometryTrianglesDataKHR transformData(Consumer<VkDeviceOrHostAddressConstKHR> consumer) {
        consumer.accept(transformData());
        return this;
    }

    public VkAccelerationStructureGeometryTrianglesDataKHR set(int sType, long pNext, int vertexFormat, VkDeviceOrHostAddressConstKHR vertexData, long vertexStride, int maxVertex, int indexType, VkDeviceOrHostAddressConstKHR indexData, VkDeviceOrHostAddressConstKHR transformData) {
        sType(sType);
        pNext(pNext);
        vertexFormat(vertexFormat);
        vertexData(vertexData);
        vertexStride(vertexStride);
        maxVertex(maxVertex);
        indexType(indexType);
        indexData(indexData);
        transformData(transformData);
        return this;
    }

    public VkAccelerationStructureGeometryTrianglesDataKHR set(VkAccelerationStructureGeometryTrianglesDataKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkAccelerationStructureGeometryTrianglesDataKHR malloc() {
        return new VkAccelerationStructureGeometryTrianglesDataKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkAccelerationStructureGeometryTrianglesDataKHR calloc() {
        return new VkAccelerationStructureGeometryTrianglesDataKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkAccelerationStructureGeometryTrianglesDataKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkAccelerationStructureGeometryTrianglesDataKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkAccelerationStructureGeometryTrianglesDataKHR create(long address) {
        return new VkAccelerationStructureGeometryTrianglesDataKHR(address, null);
    }

    public static VkAccelerationStructureGeometryTrianglesDataKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkAccelerationStructureGeometryTrianglesDataKHR(address, null);
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

    public static VkAccelerationStructureGeometryTrianglesDataKHR malloc(MemoryStack stack) {
        return new VkAccelerationStructureGeometryTrianglesDataKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkAccelerationStructureGeometryTrianglesDataKHR calloc(MemoryStack stack) {
        return new VkAccelerationStructureGeometryTrianglesDataKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nvertexFormat(long struct) {
        return MemoryUtil.memGetInt(struct + VERTEXFORMAT);
    }

    public static VkDeviceOrHostAddressConstKHR nvertexData(long struct) {
        return VkDeviceOrHostAddressConstKHR.create(struct + VERTEXDATA);
    }

    public static long nvertexStride(long struct) {
        return MemoryUtil.memGetLong(struct + VERTEXSTRIDE);
    }

    public static int nmaxVertex(long struct) {
        return MemoryUtil.memGetInt(struct + MAXVERTEX);
    }

    public static int nindexType(long struct) {
        return MemoryUtil.memGetInt(struct + INDEXTYPE);
    }

    public static VkDeviceOrHostAddressConstKHR nindexData(long struct) {
        return VkDeviceOrHostAddressConstKHR.create(struct + INDEXDATA);
    }

    public static VkDeviceOrHostAddressConstKHR ntransformData(long struct) {
        return VkDeviceOrHostAddressConstKHR.create(struct + TRANSFORMDATA);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nvertexFormat(long struct, int value) {
        MemoryUtil.memPutInt(struct + VERTEXFORMAT, value);
    }

    public static void nvertexData(long struct, VkDeviceOrHostAddressConstKHR value) {
        MemoryUtil.memCopy(value.address(), struct + VERTEXDATA, VkDeviceOrHostAddressConstKHR.SIZEOF);
    }

    public static void nvertexStride(long struct, long value) {
        MemoryUtil.memPutLong(struct + VERTEXSTRIDE, value);
    }

    public static void nmaxVertex(long struct, int value) {
        MemoryUtil.memPutInt(struct + MAXVERTEX, value);
    }

    public static void nindexType(long struct, int value) {
        MemoryUtil.memPutInt(struct + INDEXTYPE, value);
    }

    public static void nindexData(long struct, VkDeviceOrHostAddressConstKHR value) {
        MemoryUtil.memCopy(value.address(), struct + INDEXDATA, VkDeviceOrHostAddressConstKHR.SIZEOF);
    }

    public static void ntransformData(long struct, VkDeviceOrHostAddressConstKHR value) {
        MemoryUtil.memCopy(value.address(), struct + TRANSFORMDATA, VkDeviceOrHostAddressConstKHR.SIZEOF);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkAccelerationStructureGeometryTrianglesDataKHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkAccelerationStructureGeometryTrianglesDataKHR$Buffer.class */
    public static class Buffer extends StructBuffer<VkAccelerationStructureGeometryTrianglesDataKHR, Buffer> implements NativeResource {
        private static final VkAccelerationStructureGeometryTrianglesDataKHR ELEMENT_FACTORY = VkAccelerationStructureGeometryTrianglesDataKHR.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkAccelerationStructureGeometryTrianglesDataKHR.SIZEOF);
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
        public VkAccelerationStructureGeometryTrianglesDataKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkAccelerationStructureGeometryTrianglesDataKHR.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkAccelerationStructureGeometryTrianglesDataKHR.npNext(address());
        }

        @NativeType("VkFormat")
        public int vertexFormat() {
            return VkAccelerationStructureGeometryTrianglesDataKHR.nvertexFormat(address());
        }

        public VkDeviceOrHostAddressConstKHR vertexData() {
            return VkAccelerationStructureGeometryTrianglesDataKHR.nvertexData(address());
        }

        @NativeType("VkDeviceSize")
        public long vertexStride() {
            return VkAccelerationStructureGeometryTrianglesDataKHR.nvertexStride(address());
        }

        @NativeType("uint32_t")
        public int maxVertex() {
            return VkAccelerationStructureGeometryTrianglesDataKHR.nmaxVertex(address());
        }

        @NativeType("VkIndexType")
        public int indexType() {
            return VkAccelerationStructureGeometryTrianglesDataKHR.nindexType(address());
        }

        public VkDeviceOrHostAddressConstKHR indexData() {
            return VkAccelerationStructureGeometryTrianglesDataKHR.nindexData(address());
        }

        public VkDeviceOrHostAddressConstKHR transformData() {
            return VkAccelerationStructureGeometryTrianglesDataKHR.ntransformData(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkAccelerationStructureGeometryTrianglesDataKHR.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(KHRAccelerationStructure.VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_GEOMETRY_TRIANGLES_DATA_KHR);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkAccelerationStructureGeometryTrianglesDataKHR.npNext(address(), value);
            return this;
        }

        public Buffer pNext(VkAccelerationStructureGeometryMotionTrianglesDataNV value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkAccelerationStructureTrianglesDisplacementMicromapNV value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkAccelerationStructureTrianglesOpacityMicromapEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer vertexFormat(@NativeType("VkFormat") int value) {
            VkAccelerationStructureGeometryTrianglesDataKHR.nvertexFormat(address(), value);
            return this;
        }

        public Buffer vertexData(VkDeviceOrHostAddressConstKHR value) {
            VkAccelerationStructureGeometryTrianglesDataKHR.nvertexData(address(), value);
            return this;
        }

        public Buffer vertexData(Consumer<VkDeviceOrHostAddressConstKHR> consumer) {
            consumer.accept(vertexData());
            return this;
        }

        public Buffer vertexStride(@NativeType("VkDeviceSize") long value) {
            VkAccelerationStructureGeometryTrianglesDataKHR.nvertexStride(address(), value);
            return this;
        }

        public Buffer maxVertex(@NativeType("uint32_t") int value) {
            VkAccelerationStructureGeometryTrianglesDataKHR.nmaxVertex(address(), value);
            return this;
        }

        public Buffer indexType(@NativeType("VkIndexType") int value) {
            VkAccelerationStructureGeometryTrianglesDataKHR.nindexType(address(), value);
            return this;
        }

        public Buffer indexData(VkDeviceOrHostAddressConstKHR value) {
            VkAccelerationStructureGeometryTrianglesDataKHR.nindexData(address(), value);
            return this;
        }

        public Buffer indexData(Consumer<VkDeviceOrHostAddressConstKHR> consumer) {
            consumer.accept(indexData());
            return this;
        }

        public Buffer transformData(VkDeviceOrHostAddressConstKHR value) {
            VkAccelerationStructureGeometryTrianglesDataKHR.ntransformData(address(), value);
            return this;
        }

        public Buffer transformData(Consumer<VkDeviceOrHostAddressConstKHR> consumer) {
            consumer.accept(transformData());
            return this;
        }
    }
}
