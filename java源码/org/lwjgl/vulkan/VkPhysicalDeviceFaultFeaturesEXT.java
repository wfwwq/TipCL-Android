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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceFaultFeaturesEXT.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceFaultFeaturesEXT.class */
public class VkPhysicalDeviceFaultFeaturesEXT extends Struct<VkPhysicalDeviceFaultFeaturesEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int DEVICEFAULT;
    public static final int DEVICEFAULTVENDORBINARY;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        DEVICEFAULT = layout.offsetof(2);
        DEVICEFAULTVENDORBINARY = layout.offsetof(3);
    }

    protected VkPhysicalDeviceFaultFeaturesEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceFaultFeaturesEXT create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceFaultFeaturesEXT(address, container);
    }

    public VkPhysicalDeviceFaultFeaturesEXT(ByteBuffer container) {
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

    @NativeType("VkBool32")
    public boolean deviceFault() {
        return ndeviceFault(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean deviceFaultVendorBinary() {
        return ndeviceFaultVendorBinary(address()) != 0;
    }

    public VkPhysicalDeviceFaultFeaturesEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceFaultFeaturesEXT sType$Default() {
        return sType(EXTDeviceFault.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FAULT_FEATURES_EXT);
    }

    public VkPhysicalDeviceFaultFeaturesEXT pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceFaultFeaturesEXT deviceFault(@NativeType("VkBool32") boolean value) {
        ndeviceFault(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceFaultFeaturesEXT deviceFaultVendorBinary(@NativeType("VkBool32") boolean value) {
        ndeviceFaultVendorBinary(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceFaultFeaturesEXT set(int sType, long pNext, boolean deviceFault, boolean deviceFaultVendorBinary) {
        sType(sType);
        pNext(pNext);
        deviceFault(deviceFault);
        deviceFaultVendorBinary(deviceFaultVendorBinary);
        return this;
    }

    public VkPhysicalDeviceFaultFeaturesEXT set(VkPhysicalDeviceFaultFeaturesEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceFaultFeaturesEXT malloc() {
        return new VkPhysicalDeviceFaultFeaturesEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceFaultFeaturesEXT calloc() {
        return new VkPhysicalDeviceFaultFeaturesEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceFaultFeaturesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceFaultFeaturesEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceFaultFeaturesEXT create(long address) {
        return new VkPhysicalDeviceFaultFeaturesEXT(address, null);
    }

    public static VkPhysicalDeviceFaultFeaturesEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceFaultFeaturesEXT(address, null);
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

    public static VkPhysicalDeviceFaultFeaturesEXT malloc(MemoryStack stack) {
        return new VkPhysicalDeviceFaultFeaturesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceFaultFeaturesEXT calloc(MemoryStack stack) {
        return new VkPhysicalDeviceFaultFeaturesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int ndeviceFault(long struct) {
        return MemoryUtil.memGetInt(struct + DEVICEFAULT);
    }

    public static int ndeviceFaultVendorBinary(long struct) {
        return MemoryUtil.memGetInt(struct + DEVICEFAULTVENDORBINARY);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void ndeviceFault(long struct, int value) {
        MemoryUtil.memPutInt(struct + DEVICEFAULT, value);
    }

    public static void ndeviceFaultVendorBinary(long struct, int value) {
        MemoryUtil.memPutInt(struct + DEVICEFAULTVENDORBINARY, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceFaultFeaturesEXT$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceFaultFeaturesEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceFaultFeaturesEXT, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceFaultFeaturesEXT ELEMENT_FACTORY = VkPhysicalDeviceFaultFeaturesEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceFaultFeaturesEXT.SIZEOF);
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
        public VkPhysicalDeviceFaultFeaturesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceFaultFeaturesEXT.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceFaultFeaturesEXT.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean deviceFault() {
            return VkPhysicalDeviceFaultFeaturesEXT.ndeviceFault(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean deviceFaultVendorBinary() {
            return VkPhysicalDeviceFaultFeaturesEXT.ndeviceFaultVendorBinary(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceFaultFeaturesEXT.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(EXTDeviceFault.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FAULT_FEATURES_EXT);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceFaultFeaturesEXT.npNext(address(), value);
            return this;
        }

        public Buffer deviceFault(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceFaultFeaturesEXT.ndeviceFault(address(), value ? 1 : 0);
            return this;
        }

        public Buffer deviceFaultVendorBinary(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceFaultFeaturesEXT.ndeviceFaultVendorBinary(address(), value ? 1 : 0);
            return this;
        }
    }
}
