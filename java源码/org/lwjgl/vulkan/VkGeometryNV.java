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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkGeometryNV.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkGeometryNV.class */
public class VkGeometryNV extends Struct<VkGeometryNV> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int GEOMETRYTYPE;
    public static final int GEOMETRY;
    public static final int FLAGS;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(VkGeometryDataNV.SIZEOF, VkGeometryDataNV.ALIGNOF), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        GEOMETRYTYPE = layout.offsetof(2);
        GEOMETRY = layout.offsetof(3);
        FLAGS = layout.offsetof(4);
    }

    protected VkGeometryNV(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkGeometryNV create(long address, ByteBuffer container) {
        return new VkGeometryNV(address, container);
    }

    public VkGeometryNV(ByteBuffer container) {
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

    @NativeType("VkGeometryTypeKHR")
    public int geometryType() {
        return ngeometryType(address());
    }

    public VkGeometryDataNV geometry() {
        return ngeometry(address());
    }

    @NativeType("VkGeometryFlagsKHR")
    public int flags() {
        return nflags(address());
    }

    public VkGeometryNV sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkGeometryNV sType$Default() {
        return sType(NVRayTracing.VK_STRUCTURE_TYPE_GEOMETRY_NV);
    }

    public VkGeometryNV pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkGeometryNV geometryType(@NativeType("VkGeometryTypeKHR") int value) {
        ngeometryType(address(), value);
        return this;
    }

    public VkGeometryNV geometry(VkGeometryDataNV value) {
        ngeometry(address(), value);
        return this;
    }

    public VkGeometryNV geometry(Consumer<VkGeometryDataNV> consumer) {
        consumer.accept(geometry());
        return this;
    }

    public VkGeometryNV flags(@NativeType("VkGeometryFlagsKHR") int value) {
        nflags(address(), value);
        return this;
    }

    public VkGeometryNV set(int sType, long pNext, int geometryType, VkGeometryDataNV geometry, int flags) {
        sType(sType);
        pNext(pNext);
        geometryType(geometryType);
        geometry(geometry);
        flags(flags);
        return this;
    }

    public VkGeometryNV set(VkGeometryNV src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkGeometryNV malloc() {
        return new VkGeometryNV(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkGeometryNV calloc() {
        return new VkGeometryNV(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkGeometryNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkGeometryNV(MemoryUtil.memAddress(container), container);
    }

    public static VkGeometryNV create(long address) {
        return new VkGeometryNV(address, null);
    }

    public static VkGeometryNV createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkGeometryNV(address, null);
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

    public static VkGeometryNV malloc(MemoryStack stack) {
        return new VkGeometryNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkGeometryNV calloc(MemoryStack stack) {
        return new VkGeometryNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int ngeometryType(long struct) {
        return MemoryUtil.memGetInt(struct + GEOMETRYTYPE);
    }

    public static VkGeometryDataNV ngeometry(long struct) {
        return VkGeometryDataNV.create(struct + GEOMETRY);
    }

    public static int nflags(long struct) {
        return MemoryUtil.memGetInt(struct + FLAGS);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void ngeometryType(long struct, int value) {
        MemoryUtil.memPutInt(struct + GEOMETRYTYPE, value);
    }

    public static void ngeometry(long struct, VkGeometryDataNV value) {
        MemoryUtil.memCopy(value.address(), struct + GEOMETRY, VkGeometryDataNV.SIZEOF);
    }

    public static void nflags(long struct, int value) {
        MemoryUtil.memPutInt(struct + FLAGS, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkGeometryNV$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkGeometryNV$Buffer.class */
    public static class Buffer extends StructBuffer<VkGeometryNV, Buffer> implements NativeResource {
        private static final VkGeometryNV ELEMENT_FACTORY = VkGeometryNV.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkGeometryNV.SIZEOF);
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
        public VkGeometryNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkGeometryNV.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkGeometryNV.npNext(address());
        }

        @NativeType("VkGeometryTypeKHR")
        public int geometryType() {
            return VkGeometryNV.ngeometryType(address());
        }

        public VkGeometryDataNV geometry() {
            return VkGeometryNV.ngeometry(address());
        }

        @NativeType("VkGeometryFlagsKHR")
        public int flags() {
            return VkGeometryNV.nflags(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkGeometryNV.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(NVRayTracing.VK_STRUCTURE_TYPE_GEOMETRY_NV);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkGeometryNV.npNext(address(), value);
            return this;
        }

        public Buffer geometryType(@NativeType("VkGeometryTypeKHR") int value) {
            VkGeometryNV.ngeometryType(address(), value);
            return this;
        }

        public Buffer geometry(VkGeometryDataNV value) {
            VkGeometryNV.ngeometry(address(), value);
            return this;
        }

        public Buffer geometry(Consumer<VkGeometryDataNV> consumer) {
            consumer.accept(geometry());
            return this;
        }

        public Buffer flags(@NativeType("VkGeometryFlagsKHR") int value) {
            VkGeometryNV.nflags(address(), value);
            return this;
        }
    }
}
