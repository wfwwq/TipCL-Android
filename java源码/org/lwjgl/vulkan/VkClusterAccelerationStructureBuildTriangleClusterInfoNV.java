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
import org.lwjgl.util.spvc.Spvc;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkClusterAccelerationStructureBuildTriangleClusterInfoNV.class */
public class VkClusterAccelerationStructureBuildTriangleClusterInfoNV extends Struct<VkClusterAccelerationStructureBuildTriangleClusterInfoNV> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int CLUSTERID;
    public static final int CLUSTERFLAGS;
    public static final int BITFIELD0;
    public static final int BASEGEOMETRYINDEXANDGEOMETRYFLAGS;
    public static final int INDEXBUFFERSTRIDE;
    public static final int VERTEXBUFFERSTRIDE;
    public static final int GEOMETRYINDEXANDFLAGSBUFFERSTRIDE;
    public static final int OPACITYMICROMAPINDEXBUFFERSTRIDE;
    public static final int INDEXBUFFER;
    public static final int VERTEXBUFFER;
    public static final int GEOMETRYINDEXANDFLAGSBUFFER;
    public static final int OPACITYMICROMAPARRAY;
    public static final int OPACITYMICROMAPINDEXBUFFER;

    static {
        Struct.Layout layout = __struct(__member(4), __member(4), __member(4), __member(VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV.SIZEOF, VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV.ALIGNOF), __member(2), __member(2), __member(2), __member(2), __member(8), __member(8), __member(8), __member(8), __member(8));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        CLUSTERID = layout.offsetof(0);
        CLUSTERFLAGS = layout.offsetof(1);
        BITFIELD0 = layout.offsetof(2);
        BASEGEOMETRYINDEXANDGEOMETRYFLAGS = layout.offsetof(3);
        INDEXBUFFERSTRIDE = layout.offsetof(4);
        VERTEXBUFFERSTRIDE = layout.offsetof(5);
        GEOMETRYINDEXANDFLAGSBUFFERSTRIDE = layout.offsetof(6);
        OPACITYMICROMAPINDEXBUFFERSTRIDE = layout.offsetof(7);
        INDEXBUFFER = layout.offsetof(8);
        VERTEXBUFFER = layout.offsetof(9);
        GEOMETRYINDEXANDFLAGSBUFFER = layout.offsetof(10);
        OPACITYMICROMAPARRAY = layout.offsetof(11);
        OPACITYMICROMAPINDEXBUFFER = layout.offsetof(12);
    }

    protected VkClusterAccelerationStructureBuildTriangleClusterInfoNV(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkClusterAccelerationStructureBuildTriangleClusterInfoNV create(long address, ByteBuffer container) {
        return new VkClusterAccelerationStructureBuildTriangleClusterInfoNV(address, container);
    }

    public VkClusterAccelerationStructureBuildTriangleClusterInfoNV(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("uint32_t")
    public int clusterID() {
        return nclusterID(address());
    }

    @NativeType("VkClusterAccelerationStructureClusterFlagsNV")
    public int clusterFlags() {
        return nclusterFlags(address());
    }

    @NativeType("uint32_t")
    public int triangleCount() {
        return ntriangleCount(address());
    }

    @NativeType("uint32_t")
    public int vertexCount() {
        return nvertexCount(address());
    }

    @NativeType("uint32_t")
    public int positionTruncateBitCount() {
        return npositionTruncateBitCount(address());
    }

    @NativeType("uint32_t")
    public int indexType() {
        return nindexType(address());
    }

    @NativeType("uint32_t")
    public int opacityMicromapIndexType() {
        return nopacityMicromapIndexType(address());
    }

    public VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV baseGeometryIndexAndGeometryFlags() {
        return nbaseGeometryIndexAndGeometryFlags(address());
    }

    @NativeType("uint16_t")
    public short indexBufferStride() {
        return nindexBufferStride(address());
    }

    @NativeType("uint16_t")
    public short vertexBufferStride() {
        return nvertexBufferStride(address());
    }

    @NativeType("uint16_t")
    public short geometryIndexAndFlagsBufferStride() {
        return ngeometryIndexAndFlagsBufferStride(address());
    }

    @NativeType("uint16_t")
    public short opacityMicromapIndexBufferStride() {
        return nopacityMicromapIndexBufferStride(address());
    }

    @NativeType("VkDeviceAddress")
    public long indexBuffer() {
        return nindexBuffer(address());
    }

    @NativeType("VkDeviceAddress")
    public long vertexBuffer() {
        return nvertexBuffer(address());
    }

    @NativeType("VkDeviceAddress")
    public long geometryIndexAndFlagsBuffer() {
        return ngeometryIndexAndFlagsBuffer(address());
    }

    @NativeType("VkDeviceAddress")
    public long opacityMicromapArray() {
        return nopacityMicromapArray(address());
    }

    @NativeType("VkDeviceAddress")
    public long opacityMicromapIndexBuffer() {
        return nopacityMicromapIndexBuffer(address());
    }

    public VkClusterAccelerationStructureBuildTriangleClusterInfoNV clusterID(@NativeType("uint32_t") int value) {
        nclusterID(address(), value);
        return this;
    }

    public VkClusterAccelerationStructureBuildTriangleClusterInfoNV clusterFlags(@NativeType("VkClusterAccelerationStructureClusterFlagsNV") int value) {
        nclusterFlags(address(), value);
        return this;
    }

    public VkClusterAccelerationStructureBuildTriangleClusterInfoNV triangleCount(@NativeType("uint32_t") int value) {
        ntriangleCount(address(), value);
        return this;
    }

    public VkClusterAccelerationStructureBuildTriangleClusterInfoNV vertexCount(@NativeType("uint32_t") int value) {
        nvertexCount(address(), value);
        return this;
    }

    public VkClusterAccelerationStructureBuildTriangleClusterInfoNV positionTruncateBitCount(@NativeType("uint32_t") int value) {
        npositionTruncateBitCount(address(), value);
        return this;
    }

    public VkClusterAccelerationStructureBuildTriangleClusterInfoNV indexType(@NativeType("uint32_t") int value) {
        nindexType(address(), value);
        return this;
    }

    public VkClusterAccelerationStructureBuildTriangleClusterInfoNV opacityMicromapIndexType(@NativeType("uint32_t") int value) {
        nopacityMicromapIndexType(address(), value);
        return this;
    }

    public VkClusterAccelerationStructureBuildTriangleClusterInfoNV baseGeometryIndexAndGeometryFlags(VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV value) {
        nbaseGeometryIndexAndGeometryFlags(address(), value);
        return this;
    }

    public VkClusterAccelerationStructureBuildTriangleClusterInfoNV baseGeometryIndexAndGeometryFlags(Consumer<VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV> consumer) {
        consumer.accept(baseGeometryIndexAndGeometryFlags());
        return this;
    }

    public VkClusterAccelerationStructureBuildTriangleClusterInfoNV indexBufferStride(@NativeType("uint16_t") short value) {
        nindexBufferStride(address(), value);
        return this;
    }

    public VkClusterAccelerationStructureBuildTriangleClusterInfoNV vertexBufferStride(@NativeType("uint16_t") short value) {
        nvertexBufferStride(address(), value);
        return this;
    }

    public VkClusterAccelerationStructureBuildTriangleClusterInfoNV geometryIndexAndFlagsBufferStride(@NativeType("uint16_t") short value) {
        ngeometryIndexAndFlagsBufferStride(address(), value);
        return this;
    }

    public VkClusterAccelerationStructureBuildTriangleClusterInfoNV opacityMicromapIndexBufferStride(@NativeType("uint16_t") short value) {
        nopacityMicromapIndexBufferStride(address(), value);
        return this;
    }

    public VkClusterAccelerationStructureBuildTriangleClusterInfoNV indexBuffer(@NativeType("VkDeviceAddress") long value) {
        nindexBuffer(address(), value);
        return this;
    }

    public VkClusterAccelerationStructureBuildTriangleClusterInfoNV vertexBuffer(@NativeType("VkDeviceAddress") long value) {
        nvertexBuffer(address(), value);
        return this;
    }

    public VkClusterAccelerationStructureBuildTriangleClusterInfoNV geometryIndexAndFlagsBuffer(@NativeType("VkDeviceAddress") long value) {
        ngeometryIndexAndFlagsBuffer(address(), value);
        return this;
    }

    public VkClusterAccelerationStructureBuildTriangleClusterInfoNV opacityMicromapArray(@NativeType("VkDeviceAddress") long value) {
        nopacityMicromapArray(address(), value);
        return this;
    }

    public VkClusterAccelerationStructureBuildTriangleClusterInfoNV opacityMicromapIndexBuffer(@NativeType("VkDeviceAddress") long value) {
        nopacityMicromapIndexBuffer(address(), value);
        return this;
    }

    public VkClusterAccelerationStructureBuildTriangleClusterInfoNV set(int clusterID, int clusterFlags, int triangleCount, int vertexCount, int positionTruncateBitCount, int indexType, int opacityMicromapIndexType, VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV baseGeometryIndexAndGeometryFlags, short indexBufferStride, short vertexBufferStride, short geometryIndexAndFlagsBufferStride, short opacityMicromapIndexBufferStride, long indexBuffer, long vertexBuffer, long geometryIndexAndFlagsBuffer, long opacityMicromapArray, long opacityMicromapIndexBuffer) {
        clusterID(clusterID);
        clusterFlags(clusterFlags);
        triangleCount(triangleCount);
        vertexCount(vertexCount);
        positionTruncateBitCount(positionTruncateBitCount);
        indexType(indexType);
        opacityMicromapIndexType(opacityMicromapIndexType);
        baseGeometryIndexAndGeometryFlags(baseGeometryIndexAndGeometryFlags);
        indexBufferStride(indexBufferStride);
        vertexBufferStride(vertexBufferStride);
        geometryIndexAndFlagsBufferStride(geometryIndexAndFlagsBufferStride);
        opacityMicromapIndexBufferStride(opacityMicromapIndexBufferStride);
        indexBuffer(indexBuffer);
        vertexBuffer(vertexBuffer);
        geometryIndexAndFlagsBuffer(geometryIndexAndFlagsBuffer);
        opacityMicromapArray(opacityMicromapArray);
        opacityMicromapIndexBuffer(opacityMicromapIndexBuffer);
        return this;
    }

    public VkClusterAccelerationStructureBuildTriangleClusterInfoNV set(VkClusterAccelerationStructureBuildTriangleClusterInfoNV src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkClusterAccelerationStructureBuildTriangleClusterInfoNV malloc() {
        return new VkClusterAccelerationStructureBuildTriangleClusterInfoNV(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkClusterAccelerationStructureBuildTriangleClusterInfoNV calloc() {
        return new VkClusterAccelerationStructureBuildTriangleClusterInfoNV(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkClusterAccelerationStructureBuildTriangleClusterInfoNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkClusterAccelerationStructureBuildTriangleClusterInfoNV(MemoryUtil.memAddress(container), container);
    }

    public static VkClusterAccelerationStructureBuildTriangleClusterInfoNV create(long address) {
        return new VkClusterAccelerationStructureBuildTriangleClusterInfoNV(address, null);
    }

    public static VkClusterAccelerationStructureBuildTriangleClusterInfoNV createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkClusterAccelerationStructureBuildTriangleClusterInfoNV(address, null);
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

    public static VkClusterAccelerationStructureBuildTriangleClusterInfoNV malloc(MemoryStack stack) {
        return new VkClusterAccelerationStructureBuildTriangleClusterInfoNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkClusterAccelerationStructureBuildTriangleClusterInfoNV calloc(MemoryStack stack) {
        return new VkClusterAccelerationStructureBuildTriangleClusterInfoNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static int nclusterID(long struct) {
        return MemoryUtil.memGetInt(struct + CLUSTERID);
    }

    public static int nclusterFlags(long struct) {
        return MemoryUtil.memGetInt(struct + CLUSTERFLAGS);
    }

    public static int nbitfield0(long struct) {
        return MemoryUtil.memGetInt(struct + BITFIELD0);
    }

    public static int ntriangleCount(long struct) {
        return nbitfield0(struct) & 511;
    }

    public static int nvertexCount(long struct) {
        return (nbitfield0(struct) & 261632) >>> 9;
    }

    public static int npositionTruncateBitCount(long struct) {
        return (nbitfield0(struct) & 16515072) >>> 18;
    }

    public static int nindexType(long struct) {
        return (nbitfield0(struct) & Spvc.SPVC_COMPILER_OPTION_LANG_BITS) >>> 24;
    }

    public static int nopacityMicromapIndexType(long struct) {
        return nbitfield0(struct) >>> 28;
    }

    public static VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV nbaseGeometryIndexAndGeometryFlags(long struct) {
        return VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV.create(struct + BASEGEOMETRYINDEXANDGEOMETRYFLAGS);
    }

    public static short nindexBufferStride(long struct) {
        return MemoryUtil.memGetShort(struct + INDEXBUFFERSTRIDE);
    }

    public static short nvertexBufferStride(long struct) {
        return MemoryUtil.memGetShort(struct + VERTEXBUFFERSTRIDE);
    }

    public static short ngeometryIndexAndFlagsBufferStride(long struct) {
        return MemoryUtil.memGetShort(struct + GEOMETRYINDEXANDFLAGSBUFFERSTRIDE);
    }

    public static short nopacityMicromapIndexBufferStride(long struct) {
        return MemoryUtil.memGetShort(struct + OPACITYMICROMAPINDEXBUFFERSTRIDE);
    }

    public static long nindexBuffer(long struct) {
        return MemoryUtil.memGetLong(struct + INDEXBUFFER);
    }

    public static long nvertexBuffer(long struct) {
        return MemoryUtil.memGetLong(struct + VERTEXBUFFER);
    }

    public static long ngeometryIndexAndFlagsBuffer(long struct) {
        return MemoryUtil.memGetLong(struct + GEOMETRYINDEXANDFLAGSBUFFER);
    }

    public static long nopacityMicromapArray(long struct) {
        return MemoryUtil.memGetLong(struct + OPACITYMICROMAPARRAY);
    }

    public static long nopacityMicromapIndexBuffer(long struct) {
        return MemoryUtil.memGetLong(struct + OPACITYMICROMAPINDEXBUFFER);
    }

    public static void nclusterID(long struct, int value) {
        MemoryUtil.memPutInt(struct + CLUSTERID, value);
    }

    public static void nclusterFlags(long struct, int value) {
        MemoryUtil.memPutInt(struct + CLUSTERFLAGS, value);
    }

    public static void nbitfield0(long struct, int value) {
        MemoryUtil.memPutInt(struct + BITFIELD0, value);
    }

    public static void ntriangleCount(long struct, int value) {
        nbitfield0(struct, (nbitfield0(struct) & (-512)) | (value & 511));
    }

    public static void nvertexCount(long struct, int value) {
        nbitfield0(struct, ((value << 9) & 261632) | (nbitfield0(struct) & (-261633)));
    }

    public static void npositionTruncateBitCount(long struct, int value) {
        nbitfield0(struct, ((value << 18) & 16515072) | (nbitfield0(struct) & (-16515073)));
    }

    public static void nindexType(long struct, int value) {
        nbitfield0(struct, ((value << 24) & Spvc.SPVC_COMPILER_OPTION_LANG_BITS) | (nbitfield0(struct) & (-251658241)));
    }

    public static void nopacityMicromapIndexType(long struct, int value) {
        nbitfield0(struct, (value << 28) | (nbitfield0(struct) & 268435455));
    }

    public static void nbaseGeometryIndexAndGeometryFlags(long struct, VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV value) {
        MemoryUtil.memCopy(value.address(), struct + BASEGEOMETRYINDEXANDGEOMETRYFLAGS, VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV.SIZEOF);
    }

    public static void nindexBufferStride(long struct, short value) {
        MemoryUtil.memPutShort(struct + INDEXBUFFERSTRIDE, value);
    }

    public static void nvertexBufferStride(long struct, short value) {
        MemoryUtil.memPutShort(struct + VERTEXBUFFERSTRIDE, value);
    }

    public static void ngeometryIndexAndFlagsBufferStride(long struct, short value) {
        MemoryUtil.memPutShort(struct + GEOMETRYINDEXANDFLAGSBUFFERSTRIDE, value);
    }

    public static void nopacityMicromapIndexBufferStride(long struct, short value) {
        MemoryUtil.memPutShort(struct + OPACITYMICROMAPINDEXBUFFERSTRIDE, value);
    }

    public static void nindexBuffer(long struct, long value) {
        MemoryUtil.memPutLong(struct + INDEXBUFFER, value);
    }

    public static void nvertexBuffer(long struct, long value) {
        MemoryUtil.memPutLong(struct + VERTEXBUFFER, value);
    }

    public static void ngeometryIndexAndFlagsBuffer(long struct, long value) {
        MemoryUtil.memPutLong(struct + GEOMETRYINDEXANDFLAGSBUFFER, value);
    }

    public static void nopacityMicromapArray(long struct, long value) {
        MemoryUtil.memPutLong(struct + OPACITYMICROMAPARRAY, value);
    }

    public static void nopacityMicromapIndexBuffer(long struct, long value) {
        MemoryUtil.memPutLong(struct + OPACITYMICROMAPINDEXBUFFER, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkClusterAccelerationStructureBuildTriangleClusterInfoNV$Buffer.class */
    public static class Buffer extends StructBuffer<VkClusterAccelerationStructureBuildTriangleClusterInfoNV, Buffer> implements NativeResource {
        private static final VkClusterAccelerationStructureBuildTriangleClusterInfoNV ELEMENT_FACTORY = VkClusterAccelerationStructureBuildTriangleClusterInfoNV.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkClusterAccelerationStructureBuildTriangleClusterInfoNV.SIZEOF);
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
        public VkClusterAccelerationStructureBuildTriangleClusterInfoNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("uint32_t")
        public int clusterID() {
            return VkClusterAccelerationStructureBuildTriangleClusterInfoNV.nclusterID(address());
        }

        @NativeType("VkClusterAccelerationStructureClusterFlagsNV")
        public int clusterFlags() {
            return VkClusterAccelerationStructureBuildTriangleClusterInfoNV.nclusterFlags(address());
        }

        @NativeType("uint32_t")
        public int triangleCount() {
            return VkClusterAccelerationStructureBuildTriangleClusterInfoNV.ntriangleCount(address());
        }

        @NativeType("uint32_t")
        public int vertexCount() {
            return VkClusterAccelerationStructureBuildTriangleClusterInfoNV.nvertexCount(address());
        }

        @NativeType("uint32_t")
        public int positionTruncateBitCount() {
            return VkClusterAccelerationStructureBuildTriangleClusterInfoNV.npositionTruncateBitCount(address());
        }

        @NativeType("uint32_t")
        public int indexType() {
            return VkClusterAccelerationStructureBuildTriangleClusterInfoNV.nindexType(address());
        }

        @NativeType("uint32_t")
        public int opacityMicromapIndexType() {
            return VkClusterAccelerationStructureBuildTriangleClusterInfoNV.nopacityMicromapIndexType(address());
        }

        public VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV baseGeometryIndexAndGeometryFlags() {
            return VkClusterAccelerationStructureBuildTriangleClusterInfoNV.nbaseGeometryIndexAndGeometryFlags(address());
        }

        @NativeType("uint16_t")
        public short indexBufferStride() {
            return VkClusterAccelerationStructureBuildTriangleClusterInfoNV.nindexBufferStride(address());
        }

        @NativeType("uint16_t")
        public short vertexBufferStride() {
            return VkClusterAccelerationStructureBuildTriangleClusterInfoNV.nvertexBufferStride(address());
        }

        @NativeType("uint16_t")
        public short geometryIndexAndFlagsBufferStride() {
            return VkClusterAccelerationStructureBuildTriangleClusterInfoNV.ngeometryIndexAndFlagsBufferStride(address());
        }

        @NativeType("uint16_t")
        public short opacityMicromapIndexBufferStride() {
            return VkClusterAccelerationStructureBuildTriangleClusterInfoNV.nopacityMicromapIndexBufferStride(address());
        }

        @NativeType("VkDeviceAddress")
        public long indexBuffer() {
            return VkClusterAccelerationStructureBuildTriangleClusterInfoNV.nindexBuffer(address());
        }

        @NativeType("VkDeviceAddress")
        public long vertexBuffer() {
            return VkClusterAccelerationStructureBuildTriangleClusterInfoNV.nvertexBuffer(address());
        }

        @NativeType("VkDeviceAddress")
        public long geometryIndexAndFlagsBuffer() {
            return VkClusterAccelerationStructureBuildTriangleClusterInfoNV.ngeometryIndexAndFlagsBuffer(address());
        }

        @NativeType("VkDeviceAddress")
        public long opacityMicromapArray() {
            return VkClusterAccelerationStructureBuildTriangleClusterInfoNV.nopacityMicromapArray(address());
        }

        @NativeType("VkDeviceAddress")
        public long opacityMicromapIndexBuffer() {
            return VkClusterAccelerationStructureBuildTriangleClusterInfoNV.nopacityMicromapIndexBuffer(address());
        }

        public Buffer clusterID(@NativeType("uint32_t") int value) {
            VkClusterAccelerationStructureBuildTriangleClusterInfoNV.nclusterID(address(), value);
            return this;
        }

        public Buffer clusterFlags(@NativeType("VkClusterAccelerationStructureClusterFlagsNV") int value) {
            VkClusterAccelerationStructureBuildTriangleClusterInfoNV.nclusterFlags(address(), value);
            return this;
        }

        public Buffer triangleCount(@NativeType("uint32_t") int value) {
            VkClusterAccelerationStructureBuildTriangleClusterInfoNV.ntriangleCount(address(), value);
            return this;
        }

        public Buffer vertexCount(@NativeType("uint32_t") int value) {
            VkClusterAccelerationStructureBuildTriangleClusterInfoNV.nvertexCount(address(), value);
            return this;
        }

        public Buffer positionTruncateBitCount(@NativeType("uint32_t") int value) {
            VkClusterAccelerationStructureBuildTriangleClusterInfoNV.npositionTruncateBitCount(address(), value);
            return this;
        }

        public Buffer indexType(@NativeType("uint32_t") int value) {
            VkClusterAccelerationStructureBuildTriangleClusterInfoNV.nindexType(address(), value);
            return this;
        }

        public Buffer opacityMicromapIndexType(@NativeType("uint32_t") int value) {
            VkClusterAccelerationStructureBuildTriangleClusterInfoNV.nopacityMicromapIndexType(address(), value);
            return this;
        }

        public Buffer baseGeometryIndexAndGeometryFlags(VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV value) {
            VkClusterAccelerationStructureBuildTriangleClusterInfoNV.nbaseGeometryIndexAndGeometryFlags(address(), value);
            return this;
        }

        public Buffer baseGeometryIndexAndGeometryFlags(Consumer<VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV> consumer) {
            consumer.accept(baseGeometryIndexAndGeometryFlags());
            return this;
        }

        public Buffer indexBufferStride(@NativeType("uint16_t") short value) {
            VkClusterAccelerationStructureBuildTriangleClusterInfoNV.nindexBufferStride(address(), value);
            return this;
        }

        public Buffer vertexBufferStride(@NativeType("uint16_t") short value) {
            VkClusterAccelerationStructureBuildTriangleClusterInfoNV.nvertexBufferStride(address(), value);
            return this;
        }

        public Buffer geometryIndexAndFlagsBufferStride(@NativeType("uint16_t") short value) {
            VkClusterAccelerationStructureBuildTriangleClusterInfoNV.ngeometryIndexAndFlagsBufferStride(address(), value);
            return this;
        }

        public Buffer opacityMicromapIndexBufferStride(@NativeType("uint16_t") short value) {
            VkClusterAccelerationStructureBuildTriangleClusterInfoNV.nopacityMicromapIndexBufferStride(address(), value);
            return this;
        }

        public Buffer indexBuffer(@NativeType("VkDeviceAddress") long value) {
            VkClusterAccelerationStructureBuildTriangleClusterInfoNV.nindexBuffer(address(), value);
            return this;
        }

        public Buffer vertexBuffer(@NativeType("VkDeviceAddress") long value) {
            VkClusterAccelerationStructureBuildTriangleClusterInfoNV.nvertexBuffer(address(), value);
            return this;
        }

        public Buffer geometryIndexAndFlagsBuffer(@NativeType("VkDeviceAddress") long value) {
            VkClusterAccelerationStructureBuildTriangleClusterInfoNV.ngeometryIndexAndFlagsBuffer(address(), value);
            return this;
        }

        public Buffer opacityMicromapArray(@NativeType("VkDeviceAddress") long value) {
            VkClusterAccelerationStructureBuildTriangleClusterInfoNV.nopacityMicromapArray(address(), value);
            return this;
        }

        public Buffer opacityMicromapIndexBuffer(@NativeType("VkDeviceAddress") long value) {
            VkClusterAccelerationStructureBuildTriangleClusterInfoNV.nopacityMicromapIndexBuffer(address(), value);
            return this;
        }
    }
}
