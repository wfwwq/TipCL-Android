package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.Checks;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceProperties.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceProperties.class */
public class VkPhysicalDeviceProperties extends Struct<VkPhysicalDeviceProperties> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int APIVERSION;
    public static final int DRIVERVERSION;
    public static final int VENDORID;
    public static final int DEVICEID;
    public static final int DEVICETYPE;
    public static final int DEVICENAME;
    public static final int PIPELINECACHEUUID;
    public static final int LIMITS;
    public static final int SPARSEPROPERTIES;

    static {
        Struct.Layout layout = __struct(__member(4), __member(4), __member(4), __member(4), __member(4), __array(1, 256), __array(1, 16), __member(VkPhysicalDeviceLimits.SIZEOF, VkPhysicalDeviceLimits.ALIGNOF), __member(VkPhysicalDeviceSparseProperties.SIZEOF, VkPhysicalDeviceSparseProperties.ALIGNOF));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        APIVERSION = layout.offsetof(0);
        DRIVERVERSION = layout.offsetof(1);
        VENDORID = layout.offsetof(2);
        DEVICEID = layout.offsetof(3);
        DEVICETYPE = layout.offsetof(4);
        DEVICENAME = layout.offsetof(5);
        PIPELINECACHEUUID = layout.offsetof(6);
        LIMITS = layout.offsetof(7);
        SPARSEPROPERTIES = layout.offsetof(8);
    }

    protected VkPhysicalDeviceProperties(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceProperties create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceProperties(address, container);
    }

    public VkPhysicalDeviceProperties(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("uint32_t")
    public int apiVersion() {
        return napiVersion(address());
    }

    @NativeType("uint32_t")
    public int driverVersion() {
        return ndriverVersion(address());
    }

    @NativeType("uint32_t")
    public int vendorID() {
        return nvendorID(address());
    }

    @NativeType("uint32_t")
    public int deviceID() {
        return ndeviceID(address());
    }

    @NativeType("VkPhysicalDeviceType")
    public int deviceType() {
        return ndeviceType(address());
    }

    @NativeType("char[VK_MAX_PHYSICAL_DEVICE_NAME_SIZE]")
    public ByteBuffer deviceName() {
        return ndeviceName(address());
    }

    @NativeType("char[VK_MAX_PHYSICAL_DEVICE_NAME_SIZE]")
    public String deviceNameString() {
        return ndeviceNameString(address());
    }

    @NativeType("uint8_t[VK_UUID_SIZE]")
    public ByteBuffer pipelineCacheUUID() {
        return npipelineCacheUUID(address());
    }

    @NativeType("uint8_t")
    public byte pipelineCacheUUID(int index) {
        return npipelineCacheUUID(address(), index);
    }

    public VkPhysicalDeviceLimits limits() {
        return nlimits(address());
    }

    public VkPhysicalDeviceSparseProperties sparseProperties() {
        return nsparseProperties(address());
    }

    public static VkPhysicalDeviceProperties malloc() {
        return new VkPhysicalDeviceProperties(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceProperties calloc() {
        return new VkPhysicalDeviceProperties(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceProperties create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceProperties(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceProperties create(long address) {
        return new VkPhysicalDeviceProperties(address, null);
    }

    public static VkPhysicalDeviceProperties createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceProperties(address, null);
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

    public static VkPhysicalDeviceProperties malloc(MemoryStack stack) {
        return new VkPhysicalDeviceProperties(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceProperties calloc(MemoryStack stack) {
        return new VkPhysicalDeviceProperties(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static int napiVersion(long struct) {
        return MemoryUtil.memGetInt(struct + APIVERSION);
    }

    public static int ndriverVersion(long struct) {
        return MemoryUtil.memGetInt(struct + DRIVERVERSION);
    }

    public static int nvendorID(long struct) {
        return MemoryUtil.memGetInt(struct + VENDORID);
    }

    public static int ndeviceID(long struct) {
        return MemoryUtil.memGetInt(struct + DEVICEID);
    }

    public static int ndeviceType(long struct) {
        return MemoryUtil.memGetInt(struct + DEVICETYPE);
    }

    public static ByteBuffer ndeviceName(long struct) {
        return MemoryUtil.memByteBuffer(struct + DEVICENAME, 256);
    }

    public static String ndeviceNameString(long struct) {
        return MemoryUtil.memUTF8(struct + DEVICENAME);
    }

    public static ByteBuffer npipelineCacheUUID(long struct) {
        return MemoryUtil.memByteBuffer(struct + PIPELINECACHEUUID, 16);
    }

    public static byte npipelineCacheUUID(long struct, int index) {
        return MemoryUtil.memGetByte(struct + PIPELINECACHEUUID + (Checks.check(index, 16) * 1));
    }

    public static VkPhysicalDeviceLimits nlimits(long struct) {
        return VkPhysicalDeviceLimits.create(struct + LIMITS);
    }

    public static VkPhysicalDeviceSparseProperties nsparseProperties(long struct) {
        return VkPhysicalDeviceSparseProperties.create(struct + SPARSEPROPERTIES);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceProperties$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceProperties$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceProperties, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceProperties ELEMENT_FACTORY = VkPhysicalDeviceProperties.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceProperties.SIZEOF);
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
        public VkPhysicalDeviceProperties getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("uint32_t")
        public int apiVersion() {
            return VkPhysicalDeviceProperties.napiVersion(address());
        }

        @NativeType("uint32_t")
        public int driverVersion() {
            return VkPhysicalDeviceProperties.ndriverVersion(address());
        }

        @NativeType("uint32_t")
        public int vendorID() {
            return VkPhysicalDeviceProperties.nvendorID(address());
        }

        @NativeType("uint32_t")
        public int deviceID() {
            return VkPhysicalDeviceProperties.ndeviceID(address());
        }

        @NativeType("VkPhysicalDeviceType")
        public int deviceType() {
            return VkPhysicalDeviceProperties.ndeviceType(address());
        }

        @NativeType("char[VK_MAX_PHYSICAL_DEVICE_NAME_SIZE]")
        public ByteBuffer deviceName() {
            return VkPhysicalDeviceProperties.ndeviceName(address());
        }

        @NativeType("char[VK_MAX_PHYSICAL_DEVICE_NAME_SIZE]")
        public String deviceNameString() {
            return VkPhysicalDeviceProperties.ndeviceNameString(address());
        }

        @NativeType("uint8_t[VK_UUID_SIZE]")
        public ByteBuffer pipelineCacheUUID() {
            return VkPhysicalDeviceProperties.npipelineCacheUUID(address());
        }

        @NativeType("uint8_t")
        public byte pipelineCacheUUID(int index) {
            return VkPhysicalDeviceProperties.npipelineCacheUUID(address(), index);
        }

        public VkPhysicalDeviceLimits limits() {
            return VkPhysicalDeviceProperties.nlimits(address());
        }

        public VkPhysicalDeviceSparseProperties sparseProperties() {
            return VkPhysicalDeviceProperties.nsparseProperties(address());
        }
    }
}
