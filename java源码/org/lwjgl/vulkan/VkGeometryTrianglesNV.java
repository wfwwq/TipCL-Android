package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkGeometryTrianglesNV.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkGeometryTrianglesNV.class */
public class VkGeometryTrianglesNV extends Struct<VkGeometryTrianglesNV> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int VERTEXDATA;
    public static final int VERTEXOFFSET;
    public static final int VERTEXCOUNT;
    public static final int VERTEXSTRIDE;
    public static final int VERTEXFORMAT;
    public static final int INDEXDATA;
    public static final int INDEXOFFSET;
    public static final int INDEXCOUNT;
    public static final int INDEXTYPE;
    public static final int TRANSFORMDATA;
    public static final int TRANSFORMOFFSET;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(8), __member(8), __member(4), __member(8), __member(4), __member(8), __member(8), __member(4), __member(4), __member(8), __member(8));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        VERTEXDATA = layout.offsetof(2);
        VERTEXOFFSET = layout.offsetof(3);
        VERTEXCOUNT = layout.offsetof(4);
        VERTEXSTRIDE = layout.offsetof(5);
        VERTEXFORMAT = layout.offsetof(6);
        INDEXDATA = layout.offsetof(7);
        INDEXOFFSET = layout.offsetof(8);
        INDEXCOUNT = layout.offsetof(9);
        INDEXTYPE = layout.offsetof(10);
        TRANSFORMDATA = layout.offsetof(11);
        TRANSFORMOFFSET = layout.offsetof(12);
    }

    protected VkGeometryTrianglesNV(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkGeometryTrianglesNV create(long address, ByteBuffer container) {
        return new VkGeometryTrianglesNV(address, container);
    }

    public VkGeometryTrianglesNV(ByteBuffer container) {
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

    @NativeType("VkBuffer")
    public long vertexData() {
        return nvertexData(address());
    }

    @NativeType("VkDeviceSize")
    public long vertexOffset() {
        return nvertexOffset(address());
    }

    @NativeType("uint32_t")
    public int vertexCount() {
        return nvertexCount(address());
    }

    @NativeType("VkDeviceSize")
    public long vertexStride() {
        return nvertexStride(address());
    }

    @NativeType("VkFormat")
    public int vertexFormat() {
        return nvertexFormat(address());
    }

    @NativeType("VkBuffer")
    public long indexData() {
        return nindexData(address());
    }

    @NativeType("VkDeviceSize")
    public long indexOffset() {
        return nindexOffset(address());
    }

    @NativeType("uint32_t")
    public int indexCount() {
        return nindexCount(address());
    }

    @NativeType("VkIndexType")
    public int indexType() {
        return nindexType(address());
    }

    @NativeType("VkBuffer")
    public long transformData() {
        return ntransformData(address());
    }

    @NativeType("VkDeviceSize")
    public long transformOffset() {
        return ntransformOffset(address());
    }

    public VkGeometryTrianglesNV sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkGeometryTrianglesNV sType$Default() {
        return sType(NVRayTracing.VK_STRUCTURE_TYPE_GEOMETRY_TRIANGLES_NV);
    }

    public VkGeometryTrianglesNV pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkGeometryTrianglesNV vertexData(@NativeType("VkBuffer") long value) {
        nvertexData(address(), value);
        return this;
    }

    public VkGeometryTrianglesNV vertexOffset(@NativeType("VkDeviceSize") long value) {
        nvertexOffset(address(), value);
        return this;
    }

    public VkGeometryTrianglesNV vertexCount(@NativeType("uint32_t") int value) {
        nvertexCount(address(), value);
        return this;
    }

    public VkGeometryTrianglesNV vertexStride(@NativeType("VkDeviceSize") long value) {
        nvertexStride(address(), value);
        return this;
    }

    public VkGeometryTrianglesNV vertexFormat(@NativeType("VkFormat") int value) {
        nvertexFormat(address(), value);
        return this;
    }

    public VkGeometryTrianglesNV indexData(@NativeType("VkBuffer") long value) {
        nindexData(address(), value);
        return this;
    }

    public VkGeometryTrianglesNV indexOffset(@NativeType("VkDeviceSize") long value) {
        nindexOffset(address(), value);
        return this;
    }

    public VkGeometryTrianglesNV indexCount(@NativeType("uint32_t") int value) {
        nindexCount(address(), value);
        return this;
    }

    public VkGeometryTrianglesNV indexType(@NativeType("VkIndexType") int value) {
        nindexType(address(), value);
        return this;
    }

    public VkGeometryTrianglesNV transformData(@NativeType("VkBuffer") long value) {
        ntransformData(address(), value);
        return this;
    }

    public VkGeometryTrianglesNV transformOffset(@NativeType("VkDeviceSize") long value) {
        ntransformOffset(address(), value);
        return this;
    }

    public VkGeometryTrianglesNV set(int sType, long pNext, long vertexData, long vertexOffset, int vertexCount, long vertexStride, int vertexFormat, long indexData, long indexOffset, int indexCount, int indexType, long transformData, long transformOffset) {
        sType(sType);
        pNext(pNext);
        vertexData(vertexData);
        vertexOffset(vertexOffset);
        vertexCount(vertexCount);
        vertexStride(vertexStride);
        vertexFormat(vertexFormat);
        indexData(indexData);
        indexOffset(indexOffset);
        indexCount(indexCount);
        indexType(indexType);
        transformData(transformData);
        transformOffset(transformOffset);
        return this;
    }

    public VkGeometryTrianglesNV set(VkGeometryTrianglesNV src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkGeometryTrianglesNV malloc() {
        return new VkGeometryTrianglesNV(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkGeometryTrianglesNV calloc() {
        return new VkGeometryTrianglesNV(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkGeometryTrianglesNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkGeometryTrianglesNV(MemoryUtil.memAddress(container), container);
    }

    public static VkGeometryTrianglesNV create(long address) {
        return new VkGeometryTrianglesNV(address, null);
    }

    public static VkGeometryTrianglesNV createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkGeometryTrianglesNV(address, null);
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

    public static VkGeometryTrianglesNV malloc(MemoryStack stack) {
        return new VkGeometryTrianglesNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkGeometryTrianglesNV calloc(MemoryStack stack) {
        return new VkGeometryTrianglesNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static long nvertexData(long struct) {
        return MemoryUtil.memGetLong(struct + VERTEXDATA);
    }

    public static long nvertexOffset(long struct) {
        return MemoryUtil.memGetLong(struct + VERTEXOFFSET);
    }

    public static int nvertexCount(long struct) {
        return MemoryUtil.memGetInt(struct + VERTEXCOUNT);
    }

    public static long nvertexStride(long struct) {
        return MemoryUtil.memGetLong(struct + VERTEXSTRIDE);
    }

    public static int nvertexFormat(long struct) {
        return MemoryUtil.memGetInt(struct + VERTEXFORMAT);
    }

    public static long nindexData(long struct) {
        return MemoryUtil.memGetLong(struct + INDEXDATA);
    }

    public static long nindexOffset(long struct) {
        return MemoryUtil.memGetLong(struct + INDEXOFFSET);
    }

    public static int nindexCount(long struct) {
        return MemoryUtil.memGetInt(struct + INDEXCOUNT);
    }

    public static int nindexType(long struct) {
        return MemoryUtil.memGetInt(struct + INDEXTYPE);
    }

    public static long ntransformData(long struct) {
        return MemoryUtil.memGetLong(struct + TRANSFORMDATA);
    }

    public static long ntransformOffset(long struct) {
        return MemoryUtil.memGetLong(struct + TRANSFORMOFFSET);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nvertexData(long struct, long value) {
        MemoryUtil.memPutLong(struct + VERTEXDATA, value);
    }

    public static void nvertexOffset(long struct, long value) {
        MemoryUtil.memPutLong(struct + VERTEXOFFSET, value);
    }

    public static void nvertexCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + VERTEXCOUNT, value);
    }

    public static void nvertexStride(long struct, long value) {
        MemoryUtil.memPutLong(struct + VERTEXSTRIDE, value);
    }

    public static void nvertexFormat(long struct, int value) {
        MemoryUtil.memPutInt(struct + VERTEXFORMAT, value);
    }

    public static void nindexData(long struct, long value) {
        MemoryUtil.memPutLong(struct + INDEXDATA, value);
    }

    public static void nindexOffset(long struct, long value) {
        MemoryUtil.memPutLong(struct + INDEXOFFSET, value);
    }

    public static void nindexCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + INDEXCOUNT, value);
    }

    public static void nindexType(long struct, int value) {
        MemoryUtil.memPutInt(struct + INDEXTYPE, value);
    }

    public static void ntransformData(long struct, long value) {
        MemoryUtil.memPutLong(struct + TRANSFORMDATA, value);
    }

    public static void ntransformOffset(long struct, long value) {
        MemoryUtil.memPutLong(struct + TRANSFORMOFFSET, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkGeometryTrianglesNV$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkGeometryTrianglesNV$Buffer.class */
    public static class Buffer extends StructBuffer<VkGeometryTrianglesNV, Buffer> implements NativeResource {
        private static final VkGeometryTrianglesNV ELEMENT_FACTORY = VkGeometryTrianglesNV.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkGeometryTrianglesNV.SIZEOF);
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
        public VkGeometryTrianglesNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkGeometryTrianglesNV.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkGeometryTrianglesNV.npNext(address());
        }

        @NativeType("VkBuffer")
        public long vertexData() {
            return VkGeometryTrianglesNV.nvertexData(address());
        }

        @NativeType("VkDeviceSize")
        public long vertexOffset() {
            return VkGeometryTrianglesNV.nvertexOffset(address());
        }

        @NativeType("uint32_t")
        public int vertexCount() {
            return VkGeometryTrianglesNV.nvertexCount(address());
        }

        @NativeType("VkDeviceSize")
        public long vertexStride() {
            return VkGeometryTrianglesNV.nvertexStride(address());
        }

        @NativeType("VkFormat")
        public int vertexFormat() {
            return VkGeometryTrianglesNV.nvertexFormat(address());
        }

        @NativeType("VkBuffer")
        public long indexData() {
            return VkGeometryTrianglesNV.nindexData(address());
        }

        @NativeType("VkDeviceSize")
        public long indexOffset() {
            return VkGeometryTrianglesNV.nindexOffset(address());
        }

        @NativeType("uint32_t")
        public int indexCount() {
            return VkGeometryTrianglesNV.nindexCount(address());
        }

        @NativeType("VkIndexType")
        public int indexType() {
            return VkGeometryTrianglesNV.nindexType(address());
        }

        @NativeType("VkBuffer")
        public long transformData() {
            return VkGeometryTrianglesNV.ntransformData(address());
        }

        @NativeType("VkDeviceSize")
        public long transformOffset() {
            return VkGeometryTrianglesNV.ntransformOffset(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkGeometryTrianglesNV.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(NVRayTracing.VK_STRUCTURE_TYPE_GEOMETRY_TRIANGLES_NV);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkGeometryTrianglesNV.npNext(address(), value);
            return this;
        }

        public Buffer vertexData(@NativeType("VkBuffer") long value) {
            VkGeometryTrianglesNV.nvertexData(address(), value);
            return this;
        }

        public Buffer vertexOffset(@NativeType("VkDeviceSize") long value) {
            VkGeometryTrianglesNV.nvertexOffset(address(), value);
            return this;
        }

        public Buffer vertexCount(@NativeType("uint32_t") int value) {
            VkGeometryTrianglesNV.nvertexCount(address(), value);
            return this;
        }

        public Buffer vertexStride(@NativeType("VkDeviceSize") long value) {
            VkGeometryTrianglesNV.nvertexStride(address(), value);
            return this;
        }

        public Buffer vertexFormat(@NativeType("VkFormat") int value) {
            VkGeometryTrianglesNV.nvertexFormat(address(), value);
            return this;
        }

        public Buffer indexData(@NativeType("VkBuffer") long value) {
            VkGeometryTrianglesNV.nindexData(address(), value);
            return this;
        }

        public Buffer indexOffset(@NativeType("VkDeviceSize") long value) {
            VkGeometryTrianglesNV.nindexOffset(address(), value);
            return this;
        }

        public Buffer indexCount(@NativeType("uint32_t") int value) {
            VkGeometryTrianglesNV.nindexCount(address(), value);
            return this;
        }

        public Buffer indexType(@NativeType("VkIndexType") int value) {
            VkGeometryTrianglesNV.nindexType(address(), value);
            return this;
        }

        public Buffer transformData(@NativeType("VkBuffer") long value) {
            VkGeometryTrianglesNV.ntransformData(address(), value);
            return this;
        }

        public Buffer transformOffset(@NativeType("VkDeviceSize") long value) {
            VkGeometryTrianglesNV.ntransformOffset(address(), value);
            return this;
        }
    }
}
