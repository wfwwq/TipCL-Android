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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkAccelerationStructureGeometryAabbsDataKHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkAccelerationStructureGeometryAabbsDataKHR.class */
public class VkAccelerationStructureGeometryAabbsDataKHR extends Struct<VkAccelerationStructureGeometryAabbsDataKHR> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int DATA;
    public static final int STRIDE;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(VkDeviceOrHostAddressConstKHR.SIZEOF, VkDeviceOrHostAddressConstKHR.ALIGNOF), __member(8));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        DATA = layout.offsetof(2);
        STRIDE = layout.offsetof(3);
    }

    protected VkAccelerationStructureGeometryAabbsDataKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkAccelerationStructureGeometryAabbsDataKHR create(long address, ByteBuffer container) {
        return new VkAccelerationStructureGeometryAabbsDataKHR(address, container);
    }

    public VkAccelerationStructureGeometryAabbsDataKHR(ByteBuffer container) {
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

    public VkDeviceOrHostAddressConstKHR data() {
        return ndata(address());
    }

    @NativeType("VkDeviceSize")
    public long stride() {
        return nstride(address());
    }

    public VkAccelerationStructureGeometryAabbsDataKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkAccelerationStructureGeometryAabbsDataKHR sType$Default() {
        return sType(KHRAccelerationStructure.VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_GEOMETRY_AABBS_DATA_KHR);
    }

    public VkAccelerationStructureGeometryAabbsDataKHR pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkAccelerationStructureGeometryAabbsDataKHR data(VkDeviceOrHostAddressConstKHR value) {
        ndata(address(), value);
        return this;
    }

    public VkAccelerationStructureGeometryAabbsDataKHR data(Consumer<VkDeviceOrHostAddressConstKHR> consumer) {
        consumer.accept(data());
        return this;
    }

    public VkAccelerationStructureGeometryAabbsDataKHR stride(@NativeType("VkDeviceSize") long value) {
        nstride(address(), value);
        return this;
    }

    public VkAccelerationStructureGeometryAabbsDataKHR set(int sType, long pNext, VkDeviceOrHostAddressConstKHR data, long stride) {
        sType(sType);
        pNext(pNext);
        data(data);
        stride(stride);
        return this;
    }

    public VkAccelerationStructureGeometryAabbsDataKHR set(VkAccelerationStructureGeometryAabbsDataKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkAccelerationStructureGeometryAabbsDataKHR malloc() {
        return new VkAccelerationStructureGeometryAabbsDataKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkAccelerationStructureGeometryAabbsDataKHR calloc() {
        return new VkAccelerationStructureGeometryAabbsDataKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkAccelerationStructureGeometryAabbsDataKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkAccelerationStructureGeometryAabbsDataKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkAccelerationStructureGeometryAabbsDataKHR create(long address) {
        return new VkAccelerationStructureGeometryAabbsDataKHR(address, null);
    }

    public static VkAccelerationStructureGeometryAabbsDataKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkAccelerationStructureGeometryAabbsDataKHR(address, null);
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

    public static VkAccelerationStructureGeometryAabbsDataKHR malloc(MemoryStack stack) {
        return new VkAccelerationStructureGeometryAabbsDataKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkAccelerationStructureGeometryAabbsDataKHR calloc(MemoryStack stack) {
        return new VkAccelerationStructureGeometryAabbsDataKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static VkDeviceOrHostAddressConstKHR ndata(long struct) {
        return VkDeviceOrHostAddressConstKHR.create(struct + DATA);
    }

    public static long nstride(long struct) {
        return MemoryUtil.memGetLong(struct + STRIDE);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void ndata(long struct, VkDeviceOrHostAddressConstKHR value) {
        MemoryUtil.memCopy(value.address(), struct + DATA, VkDeviceOrHostAddressConstKHR.SIZEOF);
    }

    public static void nstride(long struct, long value) {
        MemoryUtil.memPutLong(struct + STRIDE, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkAccelerationStructureGeometryAabbsDataKHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkAccelerationStructureGeometryAabbsDataKHR$Buffer.class */
    public static class Buffer extends StructBuffer<VkAccelerationStructureGeometryAabbsDataKHR, Buffer> implements NativeResource {
        private static final VkAccelerationStructureGeometryAabbsDataKHR ELEMENT_FACTORY = VkAccelerationStructureGeometryAabbsDataKHR.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkAccelerationStructureGeometryAabbsDataKHR.SIZEOF);
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
        public VkAccelerationStructureGeometryAabbsDataKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkAccelerationStructureGeometryAabbsDataKHR.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkAccelerationStructureGeometryAabbsDataKHR.npNext(address());
        }

        public VkDeviceOrHostAddressConstKHR data() {
            return VkAccelerationStructureGeometryAabbsDataKHR.ndata(address());
        }

        @NativeType("VkDeviceSize")
        public long stride() {
            return VkAccelerationStructureGeometryAabbsDataKHR.nstride(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkAccelerationStructureGeometryAabbsDataKHR.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(KHRAccelerationStructure.VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_GEOMETRY_AABBS_DATA_KHR);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkAccelerationStructureGeometryAabbsDataKHR.npNext(address(), value);
            return this;
        }

        public Buffer data(VkDeviceOrHostAddressConstKHR value) {
            VkAccelerationStructureGeometryAabbsDataKHR.ndata(address(), value);
            return this;
        }

        public Buffer data(Consumer<VkDeviceOrHostAddressConstKHR> consumer) {
            consumer.accept(data());
            return this;
        }

        public Buffer stride(@NativeType("VkDeviceSize") long value) {
            VkAccelerationStructureGeometryAabbsDataKHR.nstride(address(), value);
            return this;
        }
    }
}
