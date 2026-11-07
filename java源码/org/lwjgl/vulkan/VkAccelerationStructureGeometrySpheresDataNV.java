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

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkAccelerationStructureGeometrySpheresDataNV.class */
public class VkAccelerationStructureGeometrySpheresDataNV extends Struct<VkAccelerationStructureGeometrySpheresDataNV> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int VERTEXFORMAT;
    public static final int VERTEXDATA;
    public static final int VERTEXSTRIDE;
    public static final int RADIUSFORMAT;
    public static final int RADIUSDATA;
    public static final int RADIUSSTRIDE;
    public static final int INDEXTYPE;
    public static final int INDEXDATA;
    public static final int INDEXSTRIDE;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(VkDeviceOrHostAddressConstKHR.SIZEOF, VkDeviceOrHostAddressConstKHR.ALIGNOF), __member(8), __member(4), __member(VkDeviceOrHostAddressConstKHR.SIZEOF, VkDeviceOrHostAddressConstKHR.ALIGNOF), __member(8), __member(4), __member(VkDeviceOrHostAddressConstKHR.SIZEOF, VkDeviceOrHostAddressConstKHR.ALIGNOF), __member(8));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        VERTEXFORMAT = layout.offsetof(2);
        VERTEXDATA = layout.offsetof(3);
        VERTEXSTRIDE = layout.offsetof(4);
        RADIUSFORMAT = layout.offsetof(5);
        RADIUSDATA = layout.offsetof(6);
        RADIUSSTRIDE = layout.offsetof(7);
        INDEXTYPE = layout.offsetof(8);
        INDEXDATA = layout.offsetof(9);
        INDEXSTRIDE = layout.offsetof(10);
    }

    protected VkAccelerationStructureGeometrySpheresDataNV(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkAccelerationStructureGeometrySpheresDataNV create(long address, ByteBuffer container) {
        return new VkAccelerationStructureGeometrySpheresDataNV(address, container);
    }

    public VkAccelerationStructureGeometrySpheresDataNV(ByteBuffer container) {
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

    @NativeType("VkFormat")
    public int radiusFormat() {
        return nradiusFormat(address());
    }

    public VkDeviceOrHostAddressConstKHR radiusData() {
        return nradiusData(address());
    }

    @NativeType("VkDeviceSize")
    public long radiusStride() {
        return nradiusStride(address());
    }

    @NativeType("VkIndexType")
    public int indexType() {
        return nindexType(address());
    }

    public VkDeviceOrHostAddressConstKHR indexData() {
        return nindexData(address());
    }

    @NativeType("VkDeviceSize")
    public long indexStride() {
        return nindexStride(address());
    }

    public VkAccelerationStructureGeometrySpheresDataNV sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkAccelerationStructureGeometrySpheresDataNV sType$Default() {
        return sType(NVRayTracingLinearSweptSpheres.VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_GEOMETRY_SPHERES_DATA_NV);
    }

    public VkAccelerationStructureGeometrySpheresDataNV pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkAccelerationStructureGeometrySpheresDataNV vertexFormat(@NativeType("VkFormat") int value) {
        nvertexFormat(address(), value);
        return this;
    }

    public VkAccelerationStructureGeometrySpheresDataNV vertexData(VkDeviceOrHostAddressConstKHR value) {
        nvertexData(address(), value);
        return this;
    }

    public VkAccelerationStructureGeometrySpheresDataNV vertexData(Consumer<VkDeviceOrHostAddressConstKHR> consumer) {
        consumer.accept(vertexData());
        return this;
    }

    public VkAccelerationStructureGeometrySpheresDataNV vertexStride(@NativeType("VkDeviceSize") long value) {
        nvertexStride(address(), value);
        return this;
    }

    public VkAccelerationStructureGeometrySpheresDataNV radiusFormat(@NativeType("VkFormat") int value) {
        nradiusFormat(address(), value);
        return this;
    }

    public VkAccelerationStructureGeometrySpheresDataNV radiusData(VkDeviceOrHostAddressConstKHR value) {
        nradiusData(address(), value);
        return this;
    }

    public VkAccelerationStructureGeometrySpheresDataNV radiusData(Consumer<VkDeviceOrHostAddressConstKHR> consumer) {
        consumer.accept(radiusData());
        return this;
    }

    public VkAccelerationStructureGeometrySpheresDataNV radiusStride(@NativeType("VkDeviceSize") long value) {
        nradiusStride(address(), value);
        return this;
    }

    public VkAccelerationStructureGeometrySpheresDataNV indexType(@NativeType("VkIndexType") int value) {
        nindexType(address(), value);
        return this;
    }

    public VkAccelerationStructureGeometrySpheresDataNV indexData(VkDeviceOrHostAddressConstKHR value) {
        nindexData(address(), value);
        return this;
    }

    public VkAccelerationStructureGeometrySpheresDataNV indexData(Consumer<VkDeviceOrHostAddressConstKHR> consumer) {
        consumer.accept(indexData());
        return this;
    }

    public VkAccelerationStructureGeometrySpheresDataNV indexStride(@NativeType("VkDeviceSize") long value) {
        nindexStride(address(), value);
        return this;
    }

    public VkAccelerationStructureGeometrySpheresDataNV set(int sType, long pNext, int vertexFormat, VkDeviceOrHostAddressConstKHR vertexData, long vertexStride, int radiusFormat, VkDeviceOrHostAddressConstKHR radiusData, long radiusStride, int indexType, VkDeviceOrHostAddressConstKHR indexData, long indexStride) {
        sType(sType);
        pNext(pNext);
        vertexFormat(vertexFormat);
        vertexData(vertexData);
        vertexStride(vertexStride);
        radiusFormat(radiusFormat);
        radiusData(radiusData);
        radiusStride(radiusStride);
        indexType(indexType);
        indexData(indexData);
        indexStride(indexStride);
        return this;
    }

    public VkAccelerationStructureGeometrySpheresDataNV set(VkAccelerationStructureGeometrySpheresDataNV src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkAccelerationStructureGeometrySpheresDataNV malloc() {
        return new VkAccelerationStructureGeometrySpheresDataNV(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkAccelerationStructureGeometrySpheresDataNV calloc() {
        return new VkAccelerationStructureGeometrySpheresDataNV(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkAccelerationStructureGeometrySpheresDataNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkAccelerationStructureGeometrySpheresDataNV(MemoryUtil.memAddress(container), container);
    }

    public static VkAccelerationStructureGeometrySpheresDataNV create(long address) {
        return new VkAccelerationStructureGeometrySpheresDataNV(address, null);
    }

    public static VkAccelerationStructureGeometrySpheresDataNV createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkAccelerationStructureGeometrySpheresDataNV(address, null);
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

    public static VkAccelerationStructureGeometrySpheresDataNV malloc(MemoryStack stack) {
        return new VkAccelerationStructureGeometrySpheresDataNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkAccelerationStructureGeometrySpheresDataNV calloc(MemoryStack stack) {
        return new VkAccelerationStructureGeometrySpheresDataNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nradiusFormat(long struct) {
        return MemoryUtil.memGetInt(struct + RADIUSFORMAT);
    }

    public static VkDeviceOrHostAddressConstKHR nradiusData(long struct) {
        return VkDeviceOrHostAddressConstKHR.create(struct + RADIUSDATA);
    }

    public static long nradiusStride(long struct) {
        return MemoryUtil.memGetLong(struct + RADIUSSTRIDE);
    }

    public static int nindexType(long struct) {
        return MemoryUtil.memGetInt(struct + INDEXTYPE);
    }

    public static VkDeviceOrHostAddressConstKHR nindexData(long struct) {
        return VkDeviceOrHostAddressConstKHR.create(struct + INDEXDATA);
    }

    public static long nindexStride(long struct) {
        return MemoryUtil.memGetLong(struct + INDEXSTRIDE);
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

    public static void nradiusFormat(long struct, int value) {
        MemoryUtil.memPutInt(struct + RADIUSFORMAT, value);
    }

    public static void nradiusData(long struct, VkDeviceOrHostAddressConstKHR value) {
        MemoryUtil.memCopy(value.address(), struct + RADIUSDATA, VkDeviceOrHostAddressConstKHR.SIZEOF);
    }

    public static void nradiusStride(long struct, long value) {
        MemoryUtil.memPutLong(struct + RADIUSSTRIDE, value);
    }

    public static void nindexType(long struct, int value) {
        MemoryUtil.memPutInt(struct + INDEXTYPE, value);
    }

    public static void nindexData(long struct, VkDeviceOrHostAddressConstKHR value) {
        MemoryUtil.memCopy(value.address(), struct + INDEXDATA, VkDeviceOrHostAddressConstKHR.SIZEOF);
    }

    public static void nindexStride(long struct, long value) {
        MemoryUtil.memPutLong(struct + INDEXSTRIDE, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkAccelerationStructureGeometrySpheresDataNV$Buffer.class */
    public static class Buffer extends StructBuffer<VkAccelerationStructureGeometrySpheresDataNV, Buffer> implements NativeResource {
        private static final VkAccelerationStructureGeometrySpheresDataNV ELEMENT_FACTORY = VkAccelerationStructureGeometrySpheresDataNV.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkAccelerationStructureGeometrySpheresDataNV.SIZEOF);
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
        public VkAccelerationStructureGeometrySpheresDataNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkAccelerationStructureGeometrySpheresDataNV.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkAccelerationStructureGeometrySpheresDataNV.npNext(address());
        }

        @NativeType("VkFormat")
        public int vertexFormat() {
            return VkAccelerationStructureGeometrySpheresDataNV.nvertexFormat(address());
        }

        public VkDeviceOrHostAddressConstKHR vertexData() {
            return VkAccelerationStructureGeometrySpheresDataNV.nvertexData(address());
        }

        @NativeType("VkDeviceSize")
        public long vertexStride() {
            return VkAccelerationStructureGeometrySpheresDataNV.nvertexStride(address());
        }

        @NativeType("VkFormat")
        public int radiusFormat() {
            return VkAccelerationStructureGeometrySpheresDataNV.nradiusFormat(address());
        }

        public VkDeviceOrHostAddressConstKHR radiusData() {
            return VkAccelerationStructureGeometrySpheresDataNV.nradiusData(address());
        }

        @NativeType("VkDeviceSize")
        public long radiusStride() {
            return VkAccelerationStructureGeometrySpheresDataNV.nradiusStride(address());
        }

        @NativeType("VkIndexType")
        public int indexType() {
            return VkAccelerationStructureGeometrySpheresDataNV.nindexType(address());
        }

        public VkDeviceOrHostAddressConstKHR indexData() {
            return VkAccelerationStructureGeometrySpheresDataNV.nindexData(address());
        }

        @NativeType("VkDeviceSize")
        public long indexStride() {
            return VkAccelerationStructureGeometrySpheresDataNV.nindexStride(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkAccelerationStructureGeometrySpheresDataNV.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(NVRayTracingLinearSweptSpheres.VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_GEOMETRY_SPHERES_DATA_NV);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkAccelerationStructureGeometrySpheresDataNV.npNext(address(), value);
            return this;
        }

        public Buffer vertexFormat(@NativeType("VkFormat") int value) {
            VkAccelerationStructureGeometrySpheresDataNV.nvertexFormat(address(), value);
            return this;
        }

        public Buffer vertexData(VkDeviceOrHostAddressConstKHR value) {
            VkAccelerationStructureGeometrySpheresDataNV.nvertexData(address(), value);
            return this;
        }

        public Buffer vertexData(Consumer<VkDeviceOrHostAddressConstKHR> consumer) {
            consumer.accept(vertexData());
            return this;
        }

        public Buffer vertexStride(@NativeType("VkDeviceSize") long value) {
            VkAccelerationStructureGeometrySpheresDataNV.nvertexStride(address(), value);
            return this;
        }

        public Buffer radiusFormat(@NativeType("VkFormat") int value) {
            VkAccelerationStructureGeometrySpheresDataNV.nradiusFormat(address(), value);
            return this;
        }

        public Buffer radiusData(VkDeviceOrHostAddressConstKHR value) {
            VkAccelerationStructureGeometrySpheresDataNV.nradiusData(address(), value);
            return this;
        }

        public Buffer radiusData(Consumer<VkDeviceOrHostAddressConstKHR> consumer) {
            consumer.accept(radiusData());
            return this;
        }

        public Buffer radiusStride(@NativeType("VkDeviceSize") long value) {
            VkAccelerationStructureGeometrySpheresDataNV.nradiusStride(address(), value);
            return this;
        }

        public Buffer indexType(@NativeType("VkIndexType") int value) {
            VkAccelerationStructureGeometrySpheresDataNV.nindexType(address(), value);
            return this;
        }

        public Buffer indexData(VkDeviceOrHostAddressConstKHR value) {
            VkAccelerationStructureGeometrySpheresDataNV.nindexData(address(), value);
            return this;
        }

        public Buffer indexData(Consumer<VkDeviceOrHostAddressConstKHR> consumer) {
            consumer.accept(indexData());
            return this;
        }

        public Buffer indexStride(@NativeType("VkDeviceSize") long value) {
            VkAccelerationStructureGeometrySpheresDataNV.nindexStride(address(), value);
            return this;
        }
    }
}
