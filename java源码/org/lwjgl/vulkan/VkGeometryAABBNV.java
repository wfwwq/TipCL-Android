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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkGeometryAABBNV.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkGeometryAABBNV.class */
public class VkGeometryAABBNV extends Struct<VkGeometryAABBNV> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int AABBDATA;
    public static final int NUMAABBS;
    public static final int STRIDE;
    public static final int OFFSET;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(8), __member(4), __member(4), __member(8));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        AABBDATA = layout.offsetof(2);
        NUMAABBS = layout.offsetof(3);
        STRIDE = layout.offsetof(4);
        OFFSET = layout.offsetof(5);
    }

    protected VkGeometryAABBNV(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkGeometryAABBNV create(long address, ByteBuffer container) {
        return new VkGeometryAABBNV(address, container);
    }

    public VkGeometryAABBNV(ByteBuffer container) {
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
    public long aabbData() {
        return naabbData(address());
    }

    @NativeType("uint32_t")
    public int numAABBs() {
        return nnumAABBs(address());
    }

    @NativeType("uint32_t")
    public int stride() {
        return nstride(address());
    }

    @NativeType("VkDeviceSize")
    public long offset() {
        return noffset(address());
    }

    public VkGeometryAABBNV sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkGeometryAABBNV sType$Default() {
        return sType(NVRayTracing.VK_STRUCTURE_TYPE_GEOMETRY_AABB_NV);
    }

    public VkGeometryAABBNV pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkGeometryAABBNV aabbData(@NativeType("VkBuffer") long value) {
        naabbData(address(), value);
        return this;
    }

    public VkGeometryAABBNV numAABBs(@NativeType("uint32_t") int value) {
        nnumAABBs(address(), value);
        return this;
    }

    public VkGeometryAABBNV stride(@NativeType("uint32_t") int value) {
        nstride(address(), value);
        return this;
    }

    public VkGeometryAABBNV offset(@NativeType("VkDeviceSize") long value) {
        noffset(address(), value);
        return this;
    }

    public VkGeometryAABBNV set(int sType, long pNext, long aabbData, int numAABBs, int stride, long offset) {
        sType(sType);
        pNext(pNext);
        aabbData(aabbData);
        numAABBs(numAABBs);
        stride(stride);
        offset(offset);
        return this;
    }

    public VkGeometryAABBNV set(VkGeometryAABBNV src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkGeometryAABBNV malloc() {
        return new VkGeometryAABBNV(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkGeometryAABBNV calloc() {
        return new VkGeometryAABBNV(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkGeometryAABBNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkGeometryAABBNV(MemoryUtil.memAddress(container), container);
    }

    public static VkGeometryAABBNV create(long address) {
        return new VkGeometryAABBNV(address, null);
    }

    public static VkGeometryAABBNV createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkGeometryAABBNV(address, null);
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

    public static VkGeometryAABBNV malloc(MemoryStack stack) {
        return new VkGeometryAABBNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkGeometryAABBNV calloc(MemoryStack stack) {
        return new VkGeometryAABBNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static long naabbData(long struct) {
        return MemoryUtil.memGetLong(struct + AABBDATA);
    }

    public static int nnumAABBs(long struct) {
        return MemoryUtil.memGetInt(struct + NUMAABBS);
    }

    public static int nstride(long struct) {
        return MemoryUtil.memGetInt(struct + STRIDE);
    }

    public static long noffset(long struct) {
        return MemoryUtil.memGetLong(struct + OFFSET);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void naabbData(long struct, long value) {
        MemoryUtil.memPutLong(struct + AABBDATA, value);
    }

    public static void nnumAABBs(long struct, int value) {
        MemoryUtil.memPutInt(struct + NUMAABBS, value);
    }

    public static void nstride(long struct, int value) {
        MemoryUtil.memPutInt(struct + STRIDE, value);
    }

    public static void noffset(long struct, long value) {
        MemoryUtil.memPutLong(struct + OFFSET, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkGeometryAABBNV$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkGeometryAABBNV$Buffer.class */
    public static class Buffer extends StructBuffer<VkGeometryAABBNV, Buffer> implements NativeResource {
        private static final VkGeometryAABBNV ELEMENT_FACTORY = VkGeometryAABBNV.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkGeometryAABBNV.SIZEOF);
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
        public VkGeometryAABBNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkGeometryAABBNV.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkGeometryAABBNV.npNext(address());
        }

        @NativeType("VkBuffer")
        public long aabbData() {
            return VkGeometryAABBNV.naabbData(address());
        }

        @NativeType("uint32_t")
        public int numAABBs() {
            return VkGeometryAABBNV.nnumAABBs(address());
        }

        @NativeType("uint32_t")
        public int stride() {
            return VkGeometryAABBNV.nstride(address());
        }

        @NativeType("VkDeviceSize")
        public long offset() {
            return VkGeometryAABBNV.noffset(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkGeometryAABBNV.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(NVRayTracing.VK_STRUCTURE_TYPE_GEOMETRY_AABB_NV);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkGeometryAABBNV.npNext(address(), value);
            return this;
        }

        public Buffer aabbData(@NativeType("VkBuffer") long value) {
            VkGeometryAABBNV.naabbData(address(), value);
            return this;
        }

        public Buffer numAABBs(@NativeType("uint32_t") int value) {
            VkGeometryAABBNV.nnumAABBs(address(), value);
            return this;
        }

        public Buffer stride(@NativeType("uint32_t") int value) {
            VkGeometryAABBNV.nstride(address(), value);
            return this;
        }

        public Buffer offset(@NativeType("VkDeviceSize") long value) {
            VkGeometryAABBNV.noffset(address(), value);
            return this;
        }
    }
}
