package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceLayeredApiPropertiesKHR.class */
public class VkPhysicalDeviceLayeredApiPropertiesKHR extends Struct<VkPhysicalDeviceLayeredApiPropertiesKHR> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int VENDORID;
    public static final int DEVICEID;
    public static final int LAYEREDAPI;
    public static final int DEVICENAME;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4), __member(4), __array(1, 256));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        VENDORID = layout.offsetof(2);
        DEVICEID = layout.offsetof(3);
        LAYEREDAPI = layout.offsetof(4);
        DEVICENAME = layout.offsetof(5);
    }

    protected VkPhysicalDeviceLayeredApiPropertiesKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceLayeredApiPropertiesKHR create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceLayeredApiPropertiesKHR(address, container);
    }

    public VkPhysicalDeviceLayeredApiPropertiesKHR(ByteBuffer container) {
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
    public int vendorID() {
        return nvendorID(address());
    }

    @NativeType("uint32_t")
    public int deviceID() {
        return ndeviceID(address());
    }

    @NativeType("VkPhysicalDeviceLayeredApiKHR")
    public int layeredAPI() {
        return nlayeredAPI(address());
    }

    @NativeType("char[VK_MAX_PHYSICAL_DEVICE_NAME_SIZE]")
    public ByteBuffer deviceName() {
        return ndeviceName(address());
    }

    @NativeType("char[VK_MAX_PHYSICAL_DEVICE_NAME_SIZE]")
    public String deviceNameString() {
        return ndeviceNameString(address());
    }

    public VkPhysicalDeviceLayeredApiPropertiesKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceLayeredApiPropertiesKHR sType$Default() {
        return sType(KHRMaintenance7.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_LAYERED_API_PROPERTIES_KHR);
    }

    public VkPhysicalDeviceLayeredApiPropertiesKHR pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceLayeredApiPropertiesKHR pNext(VkPhysicalDeviceLayeredApiVulkanPropertiesKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceLayeredApiPropertiesKHR set(int sType, long pNext) {
        sType(sType);
        pNext(pNext);
        return this;
    }

    public VkPhysicalDeviceLayeredApiPropertiesKHR set(VkPhysicalDeviceLayeredApiPropertiesKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceLayeredApiPropertiesKHR malloc() {
        return new VkPhysicalDeviceLayeredApiPropertiesKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceLayeredApiPropertiesKHR calloc() {
        return new VkPhysicalDeviceLayeredApiPropertiesKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceLayeredApiPropertiesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceLayeredApiPropertiesKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceLayeredApiPropertiesKHR create(long address) {
        return new VkPhysicalDeviceLayeredApiPropertiesKHR(address, null);
    }

    public static VkPhysicalDeviceLayeredApiPropertiesKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceLayeredApiPropertiesKHR(address, null);
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

    public static VkPhysicalDeviceLayeredApiPropertiesKHR malloc(MemoryStack stack) {
        return new VkPhysicalDeviceLayeredApiPropertiesKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceLayeredApiPropertiesKHR calloc(MemoryStack stack) {
        return new VkPhysicalDeviceLayeredApiPropertiesKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nvendorID(long struct) {
        return MemoryUtil.memGetInt(struct + VENDORID);
    }

    public static int ndeviceID(long struct) {
        return MemoryUtil.memGetInt(struct + DEVICEID);
    }

    public static int nlayeredAPI(long struct) {
        return MemoryUtil.memGetInt(struct + LAYEREDAPI);
    }

    public static ByteBuffer ndeviceName(long struct) {
        return MemoryUtil.memByteBuffer(struct + DEVICENAME, 256);
    }

    public static String ndeviceNameString(long struct) {
        return MemoryUtil.memUTF8(struct + DEVICENAME);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceLayeredApiPropertiesKHR$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceLayeredApiPropertiesKHR, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceLayeredApiPropertiesKHR ELEMENT_FACTORY = VkPhysicalDeviceLayeredApiPropertiesKHR.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceLayeredApiPropertiesKHR.SIZEOF);
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
        public VkPhysicalDeviceLayeredApiPropertiesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceLayeredApiPropertiesKHR.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceLayeredApiPropertiesKHR.npNext(address());
        }

        @NativeType("uint32_t")
        public int vendorID() {
            return VkPhysicalDeviceLayeredApiPropertiesKHR.nvendorID(address());
        }

        @NativeType("uint32_t")
        public int deviceID() {
            return VkPhysicalDeviceLayeredApiPropertiesKHR.ndeviceID(address());
        }

        @NativeType("VkPhysicalDeviceLayeredApiKHR")
        public int layeredAPI() {
            return VkPhysicalDeviceLayeredApiPropertiesKHR.nlayeredAPI(address());
        }

        @NativeType("char[VK_MAX_PHYSICAL_DEVICE_NAME_SIZE]")
        public ByteBuffer deviceName() {
            return VkPhysicalDeviceLayeredApiPropertiesKHR.ndeviceName(address());
        }

        @NativeType("char[VK_MAX_PHYSICAL_DEVICE_NAME_SIZE]")
        public String deviceNameString() {
            return VkPhysicalDeviceLayeredApiPropertiesKHR.ndeviceNameString(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceLayeredApiPropertiesKHR.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(KHRMaintenance7.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_LAYERED_API_PROPERTIES_KHR);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceLayeredApiPropertiesKHR.npNext(address(), value);
            return this;
        }

        public Buffer pNext(VkPhysicalDeviceLayeredApiVulkanPropertiesKHR value) {
            return pNext(value.pNext(pNext()).address());
        }
    }
}
