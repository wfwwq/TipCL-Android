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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkAccelerationStructureGeometryInstancesDataKHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkAccelerationStructureGeometryInstancesDataKHR.class */
public class VkAccelerationStructureGeometryInstancesDataKHR extends Struct<VkAccelerationStructureGeometryInstancesDataKHR> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int ARRAYOFPOINTERS;
    public static final int DATA;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(VkDeviceOrHostAddressConstKHR.SIZEOF, VkDeviceOrHostAddressConstKHR.ALIGNOF));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        ARRAYOFPOINTERS = layout.offsetof(2);
        DATA = layout.offsetof(3);
    }

    protected VkAccelerationStructureGeometryInstancesDataKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkAccelerationStructureGeometryInstancesDataKHR create(long address, ByteBuffer container) {
        return new VkAccelerationStructureGeometryInstancesDataKHR(address, container);
    }

    public VkAccelerationStructureGeometryInstancesDataKHR(ByteBuffer container) {
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

    @NativeType("VkBool32")
    public boolean arrayOfPointers() {
        return narrayOfPointers(address()) != 0;
    }

    public VkDeviceOrHostAddressConstKHR data() {
        return ndata(address());
    }

    public VkAccelerationStructureGeometryInstancesDataKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkAccelerationStructureGeometryInstancesDataKHR sType$Default() {
        return sType(KHRAccelerationStructure.VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_GEOMETRY_INSTANCES_DATA_KHR);
    }

    public VkAccelerationStructureGeometryInstancesDataKHR pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkAccelerationStructureGeometryInstancesDataKHR arrayOfPointers(@NativeType("VkBool32") boolean value) {
        narrayOfPointers(address(), value ? 1 : 0);
        return this;
    }

    public VkAccelerationStructureGeometryInstancesDataKHR data(VkDeviceOrHostAddressConstKHR value) {
        ndata(address(), value);
        return this;
    }

    public VkAccelerationStructureGeometryInstancesDataKHR data(Consumer<VkDeviceOrHostAddressConstKHR> consumer) {
        consumer.accept(data());
        return this;
    }

    public VkAccelerationStructureGeometryInstancesDataKHR set(int sType, long pNext, boolean arrayOfPointers, VkDeviceOrHostAddressConstKHR data) {
        sType(sType);
        pNext(pNext);
        arrayOfPointers(arrayOfPointers);
        data(data);
        return this;
    }

    public VkAccelerationStructureGeometryInstancesDataKHR set(VkAccelerationStructureGeometryInstancesDataKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkAccelerationStructureGeometryInstancesDataKHR malloc() {
        return new VkAccelerationStructureGeometryInstancesDataKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkAccelerationStructureGeometryInstancesDataKHR calloc() {
        return new VkAccelerationStructureGeometryInstancesDataKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkAccelerationStructureGeometryInstancesDataKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkAccelerationStructureGeometryInstancesDataKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkAccelerationStructureGeometryInstancesDataKHR create(long address) {
        return new VkAccelerationStructureGeometryInstancesDataKHR(address, null);
    }

    public static VkAccelerationStructureGeometryInstancesDataKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkAccelerationStructureGeometryInstancesDataKHR(address, null);
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

    public static VkAccelerationStructureGeometryInstancesDataKHR malloc(MemoryStack stack) {
        return new VkAccelerationStructureGeometryInstancesDataKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkAccelerationStructureGeometryInstancesDataKHR calloc(MemoryStack stack) {
        return new VkAccelerationStructureGeometryInstancesDataKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int narrayOfPointers(long struct) {
        return MemoryUtil.memGetInt(struct + ARRAYOFPOINTERS);
    }

    public static VkDeviceOrHostAddressConstKHR ndata(long struct) {
        return VkDeviceOrHostAddressConstKHR.create(struct + DATA);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void narrayOfPointers(long struct, int value) {
        MemoryUtil.memPutInt(struct + ARRAYOFPOINTERS, value);
    }

    public static void ndata(long struct, VkDeviceOrHostAddressConstKHR value) {
        MemoryUtil.memCopy(value.address(), struct + DATA, VkDeviceOrHostAddressConstKHR.SIZEOF);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkAccelerationStructureGeometryInstancesDataKHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkAccelerationStructureGeometryInstancesDataKHR$Buffer.class */
    public static class Buffer extends StructBuffer<VkAccelerationStructureGeometryInstancesDataKHR, Buffer> implements NativeResource {
        private static final VkAccelerationStructureGeometryInstancesDataKHR ELEMENT_FACTORY = VkAccelerationStructureGeometryInstancesDataKHR.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkAccelerationStructureGeometryInstancesDataKHR.SIZEOF);
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
        public VkAccelerationStructureGeometryInstancesDataKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkAccelerationStructureGeometryInstancesDataKHR.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkAccelerationStructureGeometryInstancesDataKHR.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean arrayOfPointers() {
            return VkAccelerationStructureGeometryInstancesDataKHR.narrayOfPointers(address()) != 0;
        }

        public VkDeviceOrHostAddressConstKHR data() {
            return VkAccelerationStructureGeometryInstancesDataKHR.ndata(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkAccelerationStructureGeometryInstancesDataKHR.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(KHRAccelerationStructure.VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_GEOMETRY_INSTANCES_DATA_KHR);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkAccelerationStructureGeometryInstancesDataKHR.npNext(address(), value);
            return this;
        }

        public Buffer arrayOfPointers(@NativeType("VkBool32") boolean value) {
            VkAccelerationStructureGeometryInstancesDataKHR.narrayOfPointers(address(), value ? 1 : 0);
            return this;
        }

        public Buffer data(VkDeviceOrHostAddressConstKHR value) {
            VkAccelerationStructureGeometryInstancesDataKHR.ndata(address(), value);
            return this;
        }

        public Buffer data(Consumer<VkDeviceOrHostAddressConstKHR> consumer) {
            consumer.accept(data());
            return this;
        }
    }
}
