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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkAccelerationStructureGeometryMotionTrianglesDataNV.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkAccelerationStructureGeometryMotionTrianglesDataNV.class */
public class VkAccelerationStructureGeometryMotionTrianglesDataNV extends Struct<VkAccelerationStructureGeometryMotionTrianglesDataNV> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int VERTEXDATA;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(VkDeviceOrHostAddressConstKHR.SIZEOF, VkDeviceOrHostAddressConstKHR.ALIGNOF));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        VERTEXDATA = layout.offsetof(2);
    }

    protected VkAccelerationStructureGeometryMotionTrianglesDataNV(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkAccelerationStructureGeometryMotionTrianglesDataNV create(long address, ByteBuffer container) {
        return new VkAccelerationStructureGeometryMotionTrianglesDataNV(address, container);
    }

    public VkAccelerationStructureGeometryMotionTrianglesDataNV(ByteBuffer container) {
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

    public VkDeviceOrHostAddressConstKHR vertexData() {
        return nvertexData(address());
    }

    public VkAccelerationStructureGeometryMotionTrianglesDataNV sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkAccelerationStructureGeometryMotionTrianglesDataNV sType$Default() {
        return sType(NVRayTracingMotionBlur.VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_GEOMETRY_MOTION_TRIANGLES_DATA_NV);
    }

    public VkAccelerationStructureGeometryMotionTrianglesDataNV pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkAccelerationStructureGeometryMotionTrianglesDataNV vertexData(VkDeviceOrHostAddressConstKHR value) {
        nvertexData(address(), value);
        return this;
    }

    public VkAccelerationStructureGeometryMotionTrianglesDataNV vertexData(Consumer<VkDeviceOrHostAddressConstKHR> consumer) {
        consumer.accept(vertexData());
        return this;
    }

    public VkAccelerationStructureGeometryMotionTrianglesDataNV set(int sType, long pNext, VkDeviceOrHostAddressConstKHR vertexData) {
        sType(sType);
        pNext(pNext);
        vertexData(vertexData);
        return this;
    }

    public VkAccelerationStructureGeometryMotionTrianglesDataNV set(VkAccelerationStructureGeometryMotionTrianglesDataNV src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkAccelerationStructureGeometryMotionTrianglesDataNV malloc() {
        return new VkAccelerationStructureGeometryMotionTrianglesDataNV(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkAccelerationStructureGeometryMotionTrianglesDataNV calloc() {
        return new VkAccelerationStructureGeometryMotionTrianglesDataNV(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkAccelerationStructureGeometryMotionTrianglesDataNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkAccelerationStructureGeometryMotionTrianglesDataNV(MemoryUtil.memAddress(container), container);
    }

    public static VkAccelerationStructureGeometryMotionTrianglesDataNV create(long address) {
        return new VkAccelerationStructureGeometryMotionTrianglesDataNV(address, null);
    }

    public static VkAccelerationStructureGeometryMotionTrianglesDataNV createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkAccelerationStructureGeometryMotionTrianglesDataNV(address, null);
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

    public static VkAccelerationStructureGeometryMotionTrianglesDataNV malloc(MemoryStack stack) {
        return new VkAccelerationStructureGeometryMotionTrianglesDataNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkAccelerationStructureGeometryMotionTrianglesDataNV calloc(MemoryStack stack) {
        return new VkAccelerationStructureGeometryMotionTrianglesDataNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static VkDeviceOrHostAddressConstKHR nvertexData(long struct) {
        return VkDeviceOrHostAddressConstKHR.create(struct + VERTEXDATA);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nvertexData(long struct, VkDeviceOrHostAddressConstKHR value) {
        MemoryUtil.memCopy(value.address(), struct + VERTEXDATA, VkDeviceOrHostAddressConstKHR.SIZEOF);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkAccelerationStructureGeometryMotionTrianglesDataNV$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkAccelerationStructureGeometryMotionTrianglesDataNV$Buffer.class */
    public static class Buffer extends StructBuffer<VkAccelerationStructureGeometryMotionTrianglesDataNV, Buffer> implements NativeResource {
        private static final VkAccelerationStructureGeometryMotionTrianglesDataNV ELEMENT_FACTORY = VkAccelerationStructureGeometryMotionTrianglesDataNV.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkAccelerationStructureGeometryMotionTrianglesDataNV.SIZEOF);
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
        public VkAccelerationStructureGeometryMotionTrianglesDataNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkAccelerationStructureGeometryMotionTrianglesDataNV.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkAccelerationStructureGeometryMotionTrianglesDataNV.npNext(address());
        }

        public VkDeviceOrHostAddressConstKHR vertexData() {
            return VkAccelerationStructureGeometryMotionTrianglesDataNV.nvertexData(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkAccelerationStructureGeometryMotionTrianglesDataNV.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(NVRayTracingMotionBlur.VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_GEOMETRY_MOTION_TRIANGLES_DATA_NV);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkAccelerationStructureGeometryMotionTrianglesDataNV.npNext(address(), value);
            return this;
        }

        public Buffer vertexData(VkDeviceOrHostAddressConstKHR value) {
            VkAccelerationStructureGeometryMotionTrianglesDataNV.nvertexData(address(), value);
            return this;
        }

        public Buffer vertexData(Consumer<VkDeviceOrHostAddressConstKHR> consumer) {
            consumer.accept(vertexData());
            return this;
        }
    }
}
