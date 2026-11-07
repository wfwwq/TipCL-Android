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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkAccelerationStructureDeviceAddressInfoKHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkAccelerationStructureDeviceAddressInfoKHR.class */
public class VkAccelerationStructureDeviceAddressInfoKHR extends Struct<VkAccelerationStructureDeviceAddressInfoKHR> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int ACCELERATIONSTRUCTURE;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(8));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        ACCELERATIONSTRUCTURE = layout.offsetof(2);
    }

    protected VkAccelerationStructureDeviceAddressInfoKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkAccelerationStructureDeviceAddressInfoKHR create(long address, ByteBuffer container) {
        return new VkAccelerationStructureDeviceAddressInfoKHR(address, container);
    }

    public VkAccelerationStructureDeviceAddressInfoKHR(ByteBuffer container) {
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

    @NativeType("VkAccelerationStructureKHR")
    public long accelerationStructure() {
        return naccelerationStructure(address());
    }

    public VkAccelerationStructureDeviceAddressInfoKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkAccelerationStructureDeviceAddressInfoKHR sType$Default() {
        return sType(KHRAccelerationStructure.VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_DEVICE_ADDRESS_INFO_KHR);
    }

    public VkAccelerationStructureDeviceAddressInfoKHR pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkAccelerationStructureDeviceAddressInfoKHR accelerationStructure(@NativeType("VkAccelerationStructureKHR") long value) {
        naccelerationStructure(address(), value);
        return this;
    }

    public VkAccelerationStructureDeviceAddressInfoKHR set(int sType, long pNext, long accelerationStructure) {
        sType(sType);
        pNext(pNext);
        accelerationStructure(accelerationStructure);
        return this;
    }

    public VkAccelerationStructureDeviceAddressInfoKHR set(VkAccelerationStructureDeviceAddressInfoKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkAccelerationStructureDeviceAddressInfoKHR malloc() {
        return new VkAccelerationStructureDeviceAddressInfoKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkAccelerationStructureDeviceAddressInfoKHR calloc() {
        return new VkAccelerationStructureDeviceAddressInfoKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkAccelerationStructureDeviceAddressInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkAccelerationStructureDeviceAddressInfoKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkAccelerationStructureDeviceAddressInfoKHR create(long address) {
        return new VkAccelerationStructureDeviceAddressInfoKHR(address, null);
    }

    public static VkAccelerationStructureDeviceAddressInfoKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkAccelerationStructureDeviceAddressInfoKHR(address, null);
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

    public static VkAccelerationStructureDeviceAddressInfoKHR malloc(MemoryStack stack) {
        return new VkAccelerationStructureDeviceAddressInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkAccelerationStructureDeviceAddressInfoKHR calloc(MemoryStack stack) {
        return new VkAccelerationStructureDeviceAddressInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static long naccelerationStructure(long struct) {
        return MemoryUtil.memGetLong(struct + ACCELERATIONSTRUCTURE);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void naccelerationStructure(long struct, long value) {
        MemoryUtil.memPutLong(struct + ACCELERATIONSTRUCTURE, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkAccelerationStructureDeviceAddressInfoKHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkAccelerationStructureDeviceAddressInfoKHR$Buffer.class */
    public static class Buffer extends StructBuffer<VkAccelerationStructureDeviceAddressInfoKHR, Buffer> implements NativeResource {
        private static final VkAccelerationStructureDeviceAddressInfoKHR ELEMENT_FACTORY = VkAccelerationStructureDeviceAddressInfoKHR.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkAccelerationStructureDeviceAddressInfoKHR.SIZEOF);
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
        public VkAccelerationStructureDeviceAddressInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkAccelerationStructureDeviceAddressInfoKHR.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkAccelerationStructureDeviceAddressInfoKHR.npNext(address());
        }

        @NativeType("VkAccelerationStructureKHR")
        public long accelerationStructure() {
            return VkAccelerationStructureDeviceAddressInfoKHR.naccelerationStructure(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkAccelerationStructureDeviceAddressInfoKHR.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(KHRAccelerationStructure.VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_DEVICE_ADDRESS_INFO_KHR);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkAccelerationStructureDeviceAddressInfoKHR.npNext(address(), value);
            return this;
        }

        public Buffer accelerationStructure(@NativeType("VkAccelerationStructureKHR") long value) {
            VkAccelerationStructureDeviceAddressInfoKHR.naccelerationStructure(address(), value);
            return this;
        }
    }
}
