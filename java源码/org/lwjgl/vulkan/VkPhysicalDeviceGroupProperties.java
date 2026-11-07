package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.PointerBuffer;
import org.lwjgl.system.Checks;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceGroupProperties.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceGroupProperties.class */
public class VkPhysicalDeviceGroupProperties extends Struct<VkPhysicalDeviceGroupProperties> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int PHYSICALDEVICECOUNT;
    public static final int PHYSICALDEVICES;
    public static final int SUBSETALLOCATION;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __array(POINTER_SIZE, 32), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        PHYSICALDEVICECOUNT = layout.offsetof(2);
        PHYSICALDEVICES = layout.offsetof(3);
        SUBSETALLOCATION = layout.offsetof(4);
    }

    protected VkPhysicalDeviceGroupProperties(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceGroupProperties create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceGroupProperties(address, container);
    }

    public VkPhysicalDeviceGroupProperties(ByteBuffer container) {
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

    @NativeType("uint32_t")
    public int physicalDeviceCount() {
        return nphysicalDeviceCount(address());
    }

    @NativeType("VkPhysicalDevice[VK_MAX_DEVICE_GROUP_SIZE]")
    public PointerBuffer physicalDevices() {
        return nphysicalDevices(address());
    }

    @NativeType("VkPhysicalDevice")
    public long physicalDevices(int index) {
        return nphysicalDevices(address(), index);
    }

    @NativeType("VkBool32")
    public boolean subsetAllocation() {
        return nsubsetAllocation(address()) != 0;
    }

    public VkPhysicalDeviceGroupProperties sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceGroupProperties sType$Default() {
        return sType(1000070000);
    }

    public VkPhysicalDeviceGroupProperties pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceGroupProperties set(int sType, long pNext) {
        sType(sType);
        pNext(pNext);
        return this;
    }

    public VkPhysicalDeviceGroupProperties set(VkPhysicalDeviceGroupProperties src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceGroupProperties malloc() {
        return new VkPhysicalDeviceGroupProperties(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceGroupProperties calloc() {
        return new VkPhysicalDeviceGroupProperties(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceGroupProperties create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceGroupProperties(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceGroupProperties create(long address) {
        return new VkPhysicalDeviceGroupProperties(address, null);
    }

    public static VkPhysicalDeviceGroupProperties createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceGroupProperties(address, null);
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

    public static VkPhysicalDeviceGroupProperties malloc(MemoryStack stack) {
        return new VkPhysicalDeviceGroupProperties(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceGroupProperties calloc(MemoryStack stack) {
        return new VkPhysicalDeviceGroupProperties(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nphysicalDeviceCount(long struct) {
        return MemoryUtil.memGetInt(struct + PHYSICALDEVICECOUNT);
    }

    public static PointerBuffer nphysicalDevices(long struct) {
        return MemoryUtil.memPointerBuffer(struct + PHYSICALDEVICES, nphysicalDeviceCount(struct));
    }

    public static long nphysicalDevices(long struct, int index) {
        return MemoryUtil.memGetAddress(struct + PHYSICALDEVICES + (Checks.check(index, 32) * POINTER_SIZE));
    }

    public static int nsubsetAllocation(long struct) {
        return MemoryUtil.memGetInt(struct + SUBSETALLOCATION);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceGroupProperties$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceGroupProperties$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceGroupProperties, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceGroupProperties ELEMENT_FACTORY = VkPhysicalDeviceGroupProperties.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceGroupProperties.SIZEOF);
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
        public VkPhysicalDeviceGroupProperties getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceGroupProperties.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceGroupProperties.npNext(address());
        }

        @NativeType("uint32_t")
        public int physicalDeviceCount() {
            return VkPhysicalDeviceGroupProperties.nphysicalDeviceCount(address());
        }

        @NativeType("VkPhysicalDevice[VK_MAX_DEVICE_GROUP_SIZE]")
        public PointerBuffer physicalDevices() {
            return VkPhysicalDeviceGroupProperties.nphysicalDevices(address());
        }

        @NativeType("VkPhysicalDevice")
        public long physicalDevices(int index) {
            return VkPhysicalDeviceGroupProperties.nphysicalDevices(address(), index);
        }

        @NativeType("VkBool32")
        public boolean subsetAllocation() {
            return VkPhysicalDeviceGroupProperties.nsubsetAllocation(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceGroupProperties.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000070000);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceGroupProperties.npNext(address(), value);
            return this;
        }
    }
}
