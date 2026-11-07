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

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkAccelerationStructureGeometryLinearSweptSpheresDataNV.class */
public class VkAccelerationStructureGeometryLinearSweptSpheresDataNV extends Struct<VkAccelerationStructureGeometryLinearSweptSpheresDataNV> implements NativeResource {
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
    public static final int INDEXINGMODE;
    public static final int ENDCAPSMODE;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(VkDeviceOrHostAddressConstKHR.SIZEOF, VkDeviceOrHostAddressConstKHR.ALIGNOF), __member(8), __member(4), __member(VkDeviceOrHostAddressConstKHR.SIZEOF, VkDeviceOrHostAddressConstKHR.ALIGNOF), __member(8), __member(4), __member(VkDeviceOrHostAddressConstKHR.SIZEOF, VkDeviceOrHostAddressConstKHR.ALIGNOF), __member(8), __member(4), __member(4));
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
        INDEXINGMODE = layout.offsetof(11);
        ENDCAPSMODE = layout.offsetof(12);
    }

    protected VkAccelerationStructureGeometryLinearSweptSpheresDataNV(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkAccelerationStructureGeometryLinearSweptSpheresDataNV create(long address, ByteBuffer container) {
        return new VkAccelerationStructureGeometryLinearSweptSpheresDataNV(address, container);
    }

    public VkAccelerationStructureGeometryLinearSweptSpheresDataNV(ByteBuffer container) {
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

    @NativeType("VkRayTracingLssIndexingModeNV")
    public int indexingMode() {
        return nindexingMode(address());
    }

    @NativeType("VkRayTracingLssPrimitiveEndCapsModeNV")
    public int endCapsMode() {
        return nendCapsMode(address());
    }

    public VkAccelerationStructureGeometryLinearSweptSpheresDataNV sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkAccelerationStructureGeometryLinearSweptSpheresDataNV sType$Default() {
        return sType(NVRayTracingLinearSweptSpheres.VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_GEOMETRY_LINEAR_SWEPT_SPHERES_DATA_NV);
    }

    public VkAccelerationStructureGeometryLinearSweptSpheresDataNV pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkAccelerationStructureGeometryLinearSweptSpheresDataNV vertexFormat(@NativeType("VkFormat") int value) {
        nvertexFormat(address(), value);
        return this;
    }

    public VkAccelerationStructureGeometryLinearSweptSpheresDataNV vertexData(VkDeviceOrHostAddressConstKHR value) {
        nvertexData(address(), value);
        return this;
    }

    public VkAccelerationStructureGeometryLinearSweptSpheresDataNV vertexData(Consumer<VkDeviceOrHostAddressConstKHR> consumer) {
        consumer.accept(vertexData());
        return this;
    }

    public VkAccelerationStructureGeometryLinearSweptSpheresDataNV vertexStride(@NativeType("VkDeviceSize") long value) {
        nvertexStride(address(), value);
        return this;
    }

    public VkAccelerationStructureGeometryLinearSweptSpheresDataNV radiusFormat(@NativeType("VkFormat") int value) {
        nradiusFormat(address(), value);
        return this;
    }

    public VkAccelerationStructureGeometryLinearSweptSpheresDataNV radiusData(VkDeviceOrHostAddressConstKHR value) {
        nradiusData(address(), value);
        return this;
    }

    public VkAccelerationStructureGeometryLinearSweptSpheresDataNV radiusData(Consumer<VkDeviceOrHostAddressConstKHR> consumer) {
        consumer.accept(radiusData());
        return this;
    }

    public VkAccelerationStructureGeometryLinearSweptSpheresDataNV radiusStride(@NativeType("VkDeviceSize") long value) {
        nradiusStride(address(), value);
        return this;
    }

    public VkAccelerationStructureGeometryLinearSweptSpheresDataNV indexType(@NativeType("VkIndexType") int value) {
        nindexType(address(), value);
        return this;
    }

    public VkAccelerationStructureGeometryLinearSweptSpheresDataNV indexData(VkDeviceOrHostAddressConstKHR value) {
        nindexData(address(), value);
        return this;
    }

    public VkAccelerationStructureGeometryLinearSweptSpheresDataNV indexData(Consumer<VkDeviceOrHostAddressConstKHR> consumer) {
        consumer.accept(indexData());
        return this;
    }

    public VkAccelerationStructureGeometryLinearSweptSpheresDataNV indexStride(@NativeType("VkDeviceSize") long value) {
        nindexStride(address(), value);
        return this;
    }

    public VkAccelerationStructureGeometryLinearSweptSpheresDataNV indexingMode(@NativeType("VkRayTracingLssIndexingModeNV") int value) {
        nindexingMode(address(), value);
        return this;
    }

    public VkAccelerationStructureGeometryLinearSweptSpheresDataNV endCapsMode(@NativeType("VkRayTracingLssPrimitiveEndCapsModeNV") int value) {
        nendCapsMode(address(), value);
        return this;
    }

    public VkAccelerationStructureGeometryLinearSweptSpheresDataNV set(int sType, long pNext, int vertexFormat, VkDeviceOrHostAddressConstKHR vertexData, long vertexStride, int radiusFormat, VkDeviceOrHostAddressConstKHR radiusData, long radiusStride, int indexType, VkDeviceOrHostAddressConstKHR indexData, long indexStride, int indexingMode, int endCapsMode) {
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
        indexingMode(indexingMode);
        endCapsMode(endCapsMode);
        return this;
    }

    public VkAccelerationStructureGeometryLinearSweptSpheresDataNV set(VkAccelerationStructureGeometryLinearSweptSpheresDataNV src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkAccelerationStructureGeometryLinearSweptSpheresDataNV malloc() {
        return new VkAccelerationStructureGeometryLinearSweptSpheresDataNV(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkAccelerationStructureGeometryLinearSweptSpheresDataNV calloc() {
        return new VkAccelerationStructureGeometryLinearSweptSpheresDataNV(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkAccelerationStructureGeometryLinearSweptSpheresDataNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkAccelerationStructureGeometryLinearSweptSpheresDataNV(MemoryUtil.memAddress(container), container);
    }

    public static VkAccelerationStructureGeometryLinearSweptSpheresDataNV create(long address) {
        return new VkAccelerationStructureGeometryLinearSweptSpheresDataNV(address, null);
    }

    public static VkAccelerationStructureGeometryLinearSweptSpheresDataNV createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkAccelerationStructureGeometryLinearSweptSpheresDataNV(address, null);
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

    public static VkAccelerationStructureGeometryLinearSweptSpheresDataNV malloc(MemoryStack stack) {
        return new VkAccelerationStructureGeometryLinearSweptSpheresDataNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkAccelerationStructureGeometryLinearSweptSpheresDataNV calloc(MemoryStack stack) {
        return new VkAccelerationStructureGeometryLinearSweptSpheresDataNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nindexingMode(long struct) {
        return MemoryUtil.memGetInt(struct + INDEXINGMODE);
    }

    public static int nendCapsMode(long struct) {
        return MemoryUtil.memGetInt(struct + ENDCAPSMODE);
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

    public static void nindexingMode(long struct, int value) {
        MemoryUtil.memPutInt(struct + INDEXINGMODE, value);
    }

    public static void nendCapsMode(long struct, int value) {
        MemoryUtil.memPutInt(struct + ENDCAPSMODE, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkAccelerationStructureGeometryLinearSweptSpheresDataNV$Buffer.class */
    public static class Buffer extends StructBuffer<VkAccelerationStructureGeometryLinearSweptSpheresDataNV, Buffer> implements NativeResource {
        private static final VkAccelerationStructureGeometryLinearSweptSpheresDataNV ELEMENT_FACTORY = VkAccelerationStructureGeometryLinearSweptSpheresDataNV.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkAccelerationStructureGeometryLinearSweptSpheresDataNV.SIZEOF);
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
        public VkAccelerationStructureGeometryLinearSweptSpheresDataNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkAccelerationStructureGeometryLinearSweptSpheresDataNV.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkAccelerationStructureGeometryLinearSweptSpheresDataNV.npNext(address());
        }

        @NativeType("VkFormat")
        public int vertexFormat() {
            return VkAccelerationStructureGeometryLinearSweptSpheresDataNV.nvertexFormat(address());
        }

        public VkDeviceOrHostAddressConstKHR vertexData() {
            return VkAccelerationStructureGeometryLinearSweptSpheresDataNV.nvertexData(address());
        }

        @NativeType("VkDeviceSize")
        public long vertexStride() {
            return VkAccelerationStructureGeometryLinearSweptSpheresDataNV.nvertexStride(address());
        }

        @NativeType("VkFormat")
        public int radiusFormat() {
            return VkAccelerationStructureGeometryLinearSweptSpheresDataNV.nradiusFormat(address());
        }

        public VkDeviceOrHostAddressConstKHR radiusData() {
            return VkAccelerationStructureGeometryLinearSweptSpheresDataNV.nradiusData(address());
        }

        @NativeType("VkDeviceSize")
        public long radiusStride() {
            return VkAccelerationStructureGeometryLinearSweptSpheresDataNV.nradiusStride(address());
        }

        @NativeType("VkIndexType")
        public int indexType() {
            return VkAccelerationStructureGeometryLinearSweptSpheresDataNV.nindexType(address());
        }

        public VkDeviceOrHostAddressConstKHR indexData() {
            return VkAccelerationStructureGeometryLinearSweptSpheresDataNV.nindexData(address());
        }

        @NativeType("VkDeviceSize")
        public long indexStride() {
            return VkAccelerationStructureGeometryLinearSweptSpheresDataNV.nindexStride(address());
        }

        @NativeType("VkRayTracingLssIndexingModeNV")
        public int indexingMode() {
            return VkAccelerationStructureGeometryLinearSweptSpheresDataNV.nindexingMode(address());
        }

        @NativeType("VkRayTracingLssPrimitiveEndCapsModeNV")
        public int endCapsMode() {
            return VkAccelerationStructureGeometryLinearSweptSpheresDataNV.nendCapsMode(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkAccelerationStructureGeometryLinearSweptSpheresDataNV.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(NVRayTracingLinearSweptSpheres.VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_GEOMETRY_LINEAR_SWEPT_SPHERES_DATA_NV);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkAccelerationStructureGeometryLinearSweptSpheresDataNV.npNext(address(), value);
            return this;
        }

        public Buffer vertexFormat(@NativeType("VkFormat") int value) {
            VkAccelerationStructureGeometryLinearSweptSpheresDataNV.nvertexFormat(address(), value);
            return this;
        }

        public Buffer vertexData(VkDeviceOrHostAddressConstKHR value) {
            VkAccelerationStructureGeometryLinearSweptSpheresDataNV.nvertexData(address(), value);
            return this;
        }

        public Buffer vertexData(Consumer<VkDeviceOrHostAddressConstKHR> consumer) {
            consumer.accept(vertexData());
            return this;
        }

        public Buffer vertexStride(@NativeType("VkDeviceSize") long value) {
            VkAccelerationStructureGeometryLinearSweptSpheresDataNV.nvertexStride(address(), value);
            return this;
        }

        public Buffer radiusFormat(@NativeType("VkFormat") int value) {
            VkAccelerationStructureGeometryLinearSweptSpheresDataNV.nradiusFormat(address(), value);
            return this;
        }

        public Buffer radiusData(VkDeviceOrHostAddressConstKHR value) {
            VkAccelerationStructureGeometryLinearSweptSpheresDataNV.nradiusData(address(), value);
            return this;
        }

        public Buffer radiusData(Consumer<VkDeviceOrHostAddressConstKHR> consumer) {
            consumer.accept(radiusData());
            return this;
        }

        public Buffer radiusStride(@NativeType("VkDeviceSize") long value) {
            VkAccelerationStructureGeometryLinearSweptSpheresDataNV.nradiusStride(address(), value);
            return this;
        }

        public Buffer indexType(@NativeType("VkIndexType") int value) {
            VkAccelerationStructureGeometryLinearSweptSpheresDataNV.nindexType(address(), value);
            return this;
        }

        public Buffer indexData(VkDeviceOrHostAddressConstKHR value) {
            VkAccelerationStructureGeometryLinearSweptSpheresDataNV.nindexData(address(), value);
            return this;
        }

        public Buffer indexData(Consumer<VkDeviceOrHostAddressConstKHR> consumer) {
            consumer.accept(indexData());
            return this;
        }

        public Buffer indexStride(@NativeType("VkDeviceSize") long value) {
            VkAccelerationStructureGeometryLinearSweptSpheresDataNV.nindexStride(address(), value);
            return this;
        }

        public Buffer indexingMode(@NativeType("VkRayTracingLssIndexingModeNV") int value) {
            VkAccelerationStructureGeometryLinearSweptSpheresDataNV.nindexingMode(address(), value);
            return this;
        }

        public Buffer endCapsMode(@NativeType("VkRayTracingLssPrimitiveEndCapsModeNV") int value) {
            VkAccelerationStructureGeometryLinearSweptSpheresDataNV.nendCapsMode(address(), value);
            return this;
        }
    }
}
