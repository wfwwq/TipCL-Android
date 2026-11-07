package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkClusterAccelerationStructureTriangleClusterInputNV.class */
public class VkClusterAccelerationStructureTriangleClusterInputNV extends Struct<VkClusterAccelerationStructureTriangleClusterInputNV> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int VERTEXFORMAT;
    public static final int MAXGEOMETRYINDEXVALUE;
    public static final int MAXCLUSTERUNIQUEGEOMETRYCOUNT;
    public static final int MAXCLUSTERTRIANGLECOUNT;
    public static final int MAXCLUSTERVERTEXCOUNT;
    public static final int MAXTOTALTRIANGLECOUNT;
    public static final int MAXTOTALVERTEXCOUNT;
    public static final int MINPOSITIONTRUNCATEBITCOUNT;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        VERTEXFORMAT = layout.offsetof(2);
        MAXGEOMETRYINDEXVALUE = layout.offsetof(3);
        MAXCLUSTERUNIQUEGEOMETRYCOUNT = layout.offsetof(4);
        MAXCLUSTERTRIANGLECOUNT = layout.offsetof(5);
        MAXCLUSTERVERTEXCOUNT = layout.offsetof(6);
        MAXTOTALTRIANGLECOUNT = layout.offsetof(7);
        MAXTOTALVERTEXCOUNT = layout.offsetof(8);
        MINPOSITIONTRUNCATEBITCOUNT = layout.offsetof(9);
    }

    protected VkClusterAccelerationStructureTriangleClusterInputNV(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkClusterAccelerationStructureTriangleClusterInputNV create(long address, ByteBuffer container) {
        return new VkClusterAccelerationStructureTriangleClusterInputNV(address, container);
    }

    public VkClusterAccelerationStructureTriangleClusterInputNV(ByteBuffer container) {
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

    @NativeType("VkFormat")
    public int vertexFormat() {
        return nvertexFormat(address());
    }

    @NativeType("uint32_t")
    public int maxGeometryIndexValue() {
        return nmaxGeometryIndexValue(address());
    }

    @NativeType("uint32_t")
    public int maxClusterUniqueGeometryCount() {
        return nmaxClusterUniqueGeometryCount(address());
    }

    @NativeType("uint32_t")
    public int maxClusterTriangleCount() {
        return nmaxClusterTriangleCount(address());
    }

    @NativeType("uint32_t")
    public int maxClusterVertexCount() {
        return nmaxClusterVertexCount(address());
    }

    @NativeType("uint32_t")
    public int maxTotalTriangleCount() {
        return nmaxTotalTriangleCount(address());
    }

    @NativeType("uint32_t")
    public int maxTotalVertexCount() {
        return nmaxTotalVertexCount(address());
    }

    @NativeType("uint32_t")
    public int minPositionTruncateBitCount() {
        return nminPositionTruncateBitCount(address());
    }

    public VkClusterAccelerationStructureTriangleClusterInputNV sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkClusterAccelerationStructureTriangleClusterInputNV sType$Default() {
        return sType(NVClusterAccelerationStructure.VK_STRUCTURE_TYPE_CLUSTER_ACCELERATION_STRUCTURE_TRIANGLE_CLUSTER_INPUT_NV);
    }

    public VkClusterAccelerationStructureTriangleClusterInputNV pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkClusterAccelerationStructureTriangleClusterInputNV vertexFormat(@NativeType("VkFormat") int value) {
        nvertexFormat(address(), value);
        return this;
    }

    public VkClusterAccelerationStructureTriangleClusterInputNV maxGeometryIndexValue(@NativeType("uint32_t") int value) {
        nmaxGeometryIndexValue(address(), value);
        return this;
    }

    public VkClusterAccelerationStructureTriangleClusterInputNV maxClusterUniqueGeometryCount(@NativeType("uint32_t") int value) {
        nmaxClusterUniqueGeometryCount(address(), value);
        return this;
    }

    public VkClusterAccelerationStructureTriangleClusterInputNV maxClusterTriangleCount(@NativeType("uint32_t") int value) {
        nmaxClusterTriangleCount(address(), value);
        return this;
    }

    public VkClusterAccelerationStructureTriangleClusterInputNV maxClusterVertexCount(@NativeType("uint32_t") int value) {
        nmaxClusterVertexCount(address(), value);
        return this;
    }

    public VkClusterAccelerationStructureTriangleClusterInputNV maxTotalTriangleCount(@NativeType("uint32_t") int value) {
        nmaxTotalTriangleCount(address(), value);
        return this;
    }

    public VkClusterAccelerationStructureTriangleClusterInputNV maxTotalVertexCount(@NativeType("uint32_t") int value) {
        nmaxTotalVertexCount(address(), value);
        return this;
    }

    public VkClusterAccelerationStructureTriangleClusterInputNV minPositionTruncateBitCount(@NativeType("uint32_t") int value) {
        nminPositionTruncateBitCount(address(), value);
        return this;
    }

    public VkClusterAccelerationStructureTriangleClusterInputNV set(int sType, long pNext, int vertexFormat, int maxGeometryIndexValue, int maxClusterUniqueGeometryCount, int maxClusterTriangleCount, int maxClusterVertexCount, int maxTotalTriangleCount, int maxTotalVertexCount, int minPositionTruncateBitCount) {
        sType(sType);
        pNext(pNext);
        vertexFormat(vertexFormat);
        maxGeometryIndexValue(maxGeometryIndexValue);
        maxClusterUniqueGeometryCount(maxClusterUniqueGeometryCount);
        maxClusterTriangleCount(maxClusterTriangleCount);
        maxClusterVertexCount(maxClusterVertexCount);
        maxTotalTriangleCount(maxTotalTriangleCount);
        maxTotalVertexCount(maxTotalVertexCount);
        minPositionTruncateBitCount(minPositionTruncateBitCount);
        return this;
    }

    public VkClusterAccelerationStructureTriangleClusterInputNV set(VkClusterAccelerationStructureTriangleClusterInputNV src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkClusterAccelerationStructureTriangleClusterInputNV malloc() {
        return new VkClusterAccelerationStructureTriangleClusterInputNV(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkClusterAccelerationStructureTriangleClusterInputNV calloc() {
        return new VkClusterAccelerationStructureTriangleClusterInputNV(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkClusterAccelerationStructureTriangleClusterInputNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkClusterAccelerationStructureTriangleClusterInputNV(MemoryUtil.memAddress(container), container);
    }

    public static VkClusterAccelerationStructureTriangleClusterInputNV create(long address) {
        return new VkClusterAccelerationStructureTriangleClusterInputNV(address, null);
    }

    public static VkClusterAccelerationStructureTriangleClusterInputNV createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkClusterAccelerationStructureTriangleClusterInputNV(address, null);
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

    public static VkClusterAccelerationStructureTriangleClusterInputNV malloc(MemoryStack stack) {
        return new VkClusterAccelerationStructureTriangleClusterInputNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkClusterAccelerationStructureTriangleClusterInputNV calloc(MemoryStack stack) {
        return new VkClusterAccelerationStructureTriangleClusterInputNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nmaxGeometryIndexValue(long struct) {
        return MemoryUtil.memGetInt(struct + MAXGEOMETRYINDEXVALUE);
    }

    public static int nmaxClusterUniqueGeometryCount(long struct) {
        return MemoryUtil.memGetInt(struct + MAXCLUSTERUNIQUEGEOMETRYCOUNT);
    }

    public static int nmaxClusterTriangleCount(long struct) {
        return MemoryUtil.memGetInt(struct + MAXCLUSTERTRIANGLECOUNT);
    }

    public static int nmaxClusterVertexCount(long struct) {
        return MemoryUtil.memGetInt(struct + MAXCLUSTERVERTEXCOUNT);
    }

    public static int nmaxTotalTriangleCount(long struct) {
        return MemoryUtil.memGetInt(struct + MAXTOTALTRIANGLECOUNT);
    }

    public static int nmaxTotalVertexCount(long struct) {
        return MemoryUtil.memGetInt(struct + MAXTOTALVERTEXCOUNT);
    }

    public static int nminPositionTruncateBitCount(long struct) {
        return MemoryUtil.memGetInt(struct + MINPOSITIONTRUNCATEBITCOUNT);
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

    public static void nmaxGeometryIndexValue(long struct, int value) {
        MemoryUtil.memPutInt(struct + MAXGEOMETRYINDEXVALUE, value);
    }

    public static void nmaxClusterUniqueGeometryCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + MAXCLUSTERUNIQUEGEOMETRYCOUNT, value);
    }

    public static void nmaxClusterTriangleCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + MAXCLUSTERTRIANGLECOUNT, value);
    }

    public static void nmaxClusterVertexCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + MAXCLUSTERVERTEXCOUNT, value);
    }

    public static void nmaxTotalTriangleCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + MAXTOTALTRIANGLECOUNT, value);
    }

    public static void nmaxTotalVertexCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + MAXTOTALVERTEXCOUNT, value);
    }

    public static void nminPositionTruncateBitCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + MINPOSITIONTRUNCATEBITCOUNT, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkClusterAccelerationStructureTriangleClusterInputNV$Buffer.class */
    public static class Buffer extends StructBuffer<VkClusterAccelerationStructureTriangleClusterInputNV, Buffer> implements NativeResource {
        private static final VkClusterAccelerationStructureTriangleClusterInputNV ELEMENT_FACTORY = VkClusterAccelerationStructureTriangleClusterInputNV.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkClusterAccelerationStructureTriangleClusterInputNV.SIZEOF);
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
        public VkClusterAccelerationStructureTriangleClusterInputNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkClusterAccelerationStructureTriangleClusterInputNV.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkClusterAccelerationStructureTriangleClusterInputNV.npNext(address());
        }

        @NativeType("VkFormat")
        public int vertexFormat() {
            return VkClusterAccelerationStructureTriangleClusterInputNV.nvertexFormat(address());
        }

        @NativeType("uint32_t")
        public int maxGeometryIndexValue() {
            return VkClusterAccelerationStructureTriangleClusterInputNV.nmaxGeometryIndexValue(address());
        }

        @NativeType("uint32_t")
        public int maxClusterUniqueGeometryCount() {
            return VkClusterAccelerationStructureTriangleClusterInputNV.nmaxClusterUniqueGeometryCount(address());
        }

        @NativeType("uint32_t")
        public int maxClusterTriangleCount() {
            return VkClusterAccelerationStructureTriangleClusterInputNV.nmaxClusterTriangleCount(address());
        }

        @NativeType("uint32_t")
        public int maxClusterVertexCount() {
            return VkClusterAccelerationStructureTriangleClusterInputNV.nmaxClusterVertexCount(address());
        }

        @NativeType("uint32_t")
        public int maxTotalTriangleCount() {
            return VkClusterAccelerationStructureTriangleClusterInputNV.nmaxTotalTriangleCount(address());
        }

        @NativeType("uint32_t")
        public int maxTotalVertexCount() {
            return VkClusterAccelerationStructureTriangleClusterInputNV.nmaxTotalVertexCount(address());
        }

        @NativeType("uint32_t")
        public int minPositionTruncateBitCount() {
            return VkClusterAccelerationStructureTriangleClusterInputNV.nminPositionTruncateBitCount(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkClusterAccelerationStructureTriangleClusterInputNV.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(NVClusterAccelerationStructure.VK_STRUCTURE_TYPE_CLUSTER_ACCELERATION_STRUCTURE_TRIANGLE_CLUSTER_INPUT_NV);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkClusterAccelerationStructureTriangleClusterInputNV.npNext(address(), value);
            return this;
        }

        public Buffer vertexFormat(@NativeType("VkFormat") int value) {
            VkClusterAccelerationStructureTriangleClusterInputNV.nvertexFormat(address(), value);
            return this;
        }

        public Buffer maxGeometryIndexValue(@NativeType("uint32_t") int value) {
            VkClusterAccelerationStructureTriangleClusterInputNV.nmaxGeometryIndexValue(address(), value);
            return this;
        }

        public Buffer maxClusterUniqueGeometryCount(@NativeType("uint32_t") int value) {
            VkClusterAccelerationStructureTriangleClusterInputNV.nmaxClusterUniqueGeometryCount(address(), value);
            return this;
        }

        public Buffer maxClusterTriangleCount(@NativeType("uint32_t") int value) {
            VkClusterAccelerationStructureTriangleClusterInputNV.nmaxClusterTriangleCount(address(), value);
            return this;
        }

        public Buffer maxClusterVertexCount(@NativeType("uint32_t") int value) {
            VkClusterAccelerationStructureTriangleClusterInputNV.nmaxClusterVertexCount(address(), value);
            return this;
        }

        public Buffer maxTotalTriangleCount(@NativeType("uint32_t") int value) {
            VkClusterAccelerationStructureTriangleClusterInputNV.nmaxTotalTriangleCount(address(), value);
            return this;
        }

        public Buffer maxTotalVertexCount(@NativeType("uint32_t") int value) {
            VkClusterAccelerationStructureTriangleClusterInputNV.nmaxTotalVertexCount(address(), value);
            return this;
        }

        public Buffer minPositionTruncateBitCount(@NativeType("uint32_t") int value) {
            VkClusterAccelerationStructureTriangleClusterInputNV.nminPositionTruncateBitCount(address(), value);
            return this;
        }
    }
}
