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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDeviceFaultVendorBinaryHeaderVersionOneEXT.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDeviceFaultVendorBinaryHeaderVersionOneEXT.class */
public class VkDeviceFaultVendorBinaryHeaderVersionOneEXT extends Struct<VkDeviceFaultVendorBinaryHeaderVersionOneEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int HEADERSIZE;
    public static final int HEADERVERSION;
    public static final int VENDORID;
    public static final int DEVICEID;
    public static final int DRIVERVERSION;
    public static final int PIPELINECACHEUUID;
    public static final int APPLICATIONNAMEOFFSET;
    public static final int APPLICATIONVERSION;
    public static final int ENGINENAMEOFFSET;
    public static final int ENGINEVERSION;
    public static final int APIVERSION;

    static {
        Struct.Layout layout = __struct(__member(4), __member(4), __member(4), __member(4), __member(4), __array(1, 16), __member(4), __member(4), __member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        HEADERSIZE = layout.offsetof(0);
        HEADERVERSION = layout.offsetof(1);
        VENDORID = layout.offsetof(2);
        DEVICEID = layout.offsetof(3);
        DRIVERVERSION = layout.offsetof(4);
        PIPELINECACHEUUID = layout.offsetof(5);
        APPLICATIONNAMEOFFSET = layout.offsetof(6);
        APPLICATIONVERSION = layout.offsetof(7);
        ENGINENAMEOFFSET = layout.offsetof(8);
        ENGINEVERSION = layout.offsetof(9);
        APIVERSION = layout.offsetof(10);
    }

    protected VkDeviceFaultVendorBinaryHeaderVersionOneEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkDeviceFaultVendorBinaryHeaderVersionOneEXT create(long address, ByteBuffer container) {
        return new VkDeviceFaultVendorBinaryHeaderVersionOneEXT(address, container);
    }

    public VkDeviceFaultVendorBinaryHeaderVersionOneEXT(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("uint32_t")
    public int headerSize() {
        return nheaderSize(address());
    }

    @NativeType("VkDeviceFaultVendorBinaryHeaderVersionEXT")
    public int headerVersion() {
        return nheaderVersion(address());
    }

    @NativeType("uint32_t")
    public int vendorID() {
        return nvendorID(address());
    }

    @NativeType("uint32_t")
    public int deviceID() {
        return ndeviceID(address());
    }

    @NativeType("uint32_t")
    public int driverVersion() {
        return ndriverVersion(address());
    }

    @NativeType("uint8_t[VK_UUID_SIZE]")
    public ByteBuffer pipelineCacheUUID() {
        return npipelineCacheUUID(address());
    }

    @NativeType("uint8_t")
    public byte pipelineCacheUUID(int index) {
        return npipelineCacheUUID(address(), index);
    }

    @NativeType("uint32_t")
    public int applicationNameOffset() {
        return napplicationNameOffset(address());
    }

    @NativeType("uint32_t")
    public int applicationVersion() {
        return napplicationVersion(address());
    }

    @NativeType("uint32_t")
    public int engineNameOffset() {
        return nengineNameOffset(address());
    }

    @NativeType("uint32_t")
    public int engineVersion() {
        return nengineVersion(address());
    }

    @NativeType("uint32_t")
    public int apiVersion() {
        return napiVersion(address());
    }

    public VkDeviceFaultVendorBinaryHeaderVersionOneEXT headerSize(@NativeType("uint32_t") int value) {
        nheaderSize(address(), value);
        return this;
    }

    public VkDeviceFaultVendorBinaryHeaderVersionOneEXT headerVersion(@NativeType("VkDeviceFaultVendorBinaryHeaderVersionEXT") int value) {
        nheaderVersion(address(), value);
        return this;
    }

    public VkDeviceFaultVendorBinaryHeaderVersionOneEXT vendorID(@NativeType("uint32_t") int value) {
        nvendorID(address(), value);
        return this;
    }

    public VkDeviceFaultVendorBinaryHeaderVersionOneEXT deviceID(@NativeType("uint32_t") int value) {
        ndeviceID(address(), value);
        return this;
    }

    public VkDeviceFaultVendorBinaryHeaderVersionOneEXT driverVersion(@NativeType("uint32_t") int value) {
        ndriverVersion(address(), value);
        return this;
    }

    public VkDeviceFaultVendorBinaryHeaderVersionOneEXT pipelineCacheUUID(@NativeType("uint8_t[VK_UUID_SIZE]") ByteBuffer value) {
        npipelineCacheUUID(address(), value);
        return this;
    }

    public VkDeviceFaultVendorBinaryHeaderVersionOneEXT pipelineCacheUUID(int index, @NativeType("uint8_t") byte value) {
        npipelineCacheUUID(address(), index, value);
        return this;
    }

    public VkDeviceFaultVendorBinaryHeaderVersionOneEXT applicationNameOffset(@NativeType("uint32_t") int value) {
        napplicationNameOffset(address(), value);
        return this;
    }

    public VkDeviceFaultVendorBinaryHeaderVersionOneEXT applicationVersion(@NativeType("uint32_t") int value) {
        napplicationVersion(address(), value);
        return this;
    }

    public VkDeviceFaultVendorBinaryHeaderVersionOneEXT engineNameOffset(@NativeType("uint32_t") int value) {
        nengineNameOffset(address(), value);
        return this;
    }

    public VkDeviceFaultVendorBinaryHeaderVersionOneEXT engineVersion(@NativeType("uint32_t") int value) {
        nengineVersion(address(), value);
        return this;
    }

    public VkDeviceFaultVendorBinaryHeaderVersionOneEXT apiVersion(@NativeType("uint32_t") int value) {
        napiVersion(address(), value);
        return this;
    }

    public VkDeviceFaultVendorBinaryHeaderVersionOneEXT set(int headerSize, int headerVersion, int vendorID, int deviceID, int driverVersion, ByteBuffer pipelineCacheUUID, int applicationNameOffset, int applicationVersion, int engineNameOffset, int engineVersion, int apiVersion) {
        headerSize(headerSize);
        headerVersion(headerVersion);
        vendorID(vendorID);
        deviceID(deviceID);
        driverVersion(driverVersion);
        pipelineCacheUUID(pipelineCacheUUID);
        applicationNameOffset(applicationNameOffset);
        applicationVersion(applicationVersion);
        engineNameOffset(engineNameOffset);
        engineVersion(engineVersion);
        apiVersion(apiVersion);
        return this;
    }

    public VkDeviceFaultVendorBinaryHeaderVersionOneEXT set(VkDeviceFaultVendorBinaryHeaderVersionOneEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkDeviceFaultVendorBinaryHeaderVersionOneEXT malloc() {
        return new VkDeviceFaultVendorBinaryHeaderVersionOneEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkDeviceFaultVendorBinaryHeaderVersionOneEXT calloc() {
        return new VkDeviceFaultVendorBinaryHeaderVersionOneEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkDeviceFaultVendorBinaryHeaderVersionOneEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDeviceFaultVendorBinaryHeaderVersionOneEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkDeviceFaultVendorBinaryHeaderVersionOneEXT create(long address) {
        return new VkDeviceFaultVendorBinaryHeaderVersionOneEXT(address, null);
    }

    public static VkDeviceFaultVendorBinaryHeaderVersionOneEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkDeviceFaultVendorBinaryHeaderVersionOneEXT(address, null);
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

    public static VkDeviceFaultVendorBinaryHeaderVersionOneEXT malloc(MemoryStack stack) {
        return new VkDeviceFaultVendorBinaryHeaderVersionOneEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkDeviceFaultVendorBinaryHeaderVersionOneEXT calloc(MemoryStack stack) {
        return new VkDeviceFaultVendorBinaryHeaderVersionOneEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static int nheaderSize(long struct) {
        return MemoryUtil.memGetInt(struct + HEADERSIZE);
    }

    public static int nheaderVersion(long struct) {
        return MemoryUtil.memGetInt(struct + HEADERVERSION);
    }

    public static int nvendorID(long struct) {
        return MemoryUtil.memGetInt(struct + VENDORID);
    }

    public static int ndeviceID(long struct) {
        return MemoryUtil.memGetInt(struct + DEVICEID);
    }

    public static int ndriverVersion(long struct) {
        return MemoryUtil.memGetInt(struct + DRIVERVERSION);
    }

    public static ByteBuffer npipelineCacheUUID(long struct) {
        return MemoryUtil.memByteBuffer(struct + PIPELINECACHEUUID, 16);
    }

    public static byte npipelineCacheUUID(long struct, int index) {
        return MemoryUtil.memGetByte(struct + PIPELINECACHEUUID + (Checks.check(index, 16) * 1));
    }

    public static int napplicationNameOffset(long struct) {
        return MemoryUtil.memGetInt(struct + APPLICATIONNAMEOFFSET);
    }

    public static int napplicationVersion(long struct) {
        return MemoryUtil.memGetInt(struct + APPLICATIONVERSION);
    }

    public static int nengineNameOffset(long struct) {
        return MemoryUtil.memGetInt(struct + ENGINENAMEOFFSET);
    }

    public static int nengineVersion(long struct) {
        return MemoryUtil.memGetInt(struct + ENGINEVERSION);
    }

    public static int napiVersion(long struct) {
        return MemoryUtil.memGetInt(struct + APIVERSION);
    }

    public static void nheaderSize(long struct, int value) {
        MemoryUtil.memPutInt(struct + HEADERSIZE, value);
    }

    public static void nheaderVersion(long struct, int value) {
        MemoryUtil.memPutInt(struct + HEADERVERSION, value);
    }

    public static void nvendorID(long struct, int value) {
        MemoryUtil.memPutInt(struct + VENDORID, value);
    }

    public static void ndeviceID(long struct, int value) {
        MemoryUtil.memPutInt(struct + DEVICEID, value);
    }

    public static void ndriverVersion(long struct, int value) {
        MemoryUtil.memPutInt(struct + DRIVERVERSION, value);
    }

    public static void npipelineCacheUUID(long struct, ByteBuffer value) {
        if (Checks.CHECKS) {
            Checks.checkGT(value, 16);
        }
        MemoryUtil.memCopy(MemoryUtil.memAddress(value), struct + PIPELINECACHEUUID, value.remaining() * 1);
    }

    public static void npipelineCacheUUID(long struct, int index, byte value) {
        MemoryUtil.memPutByte(struct + PIPELINECACHEUUID + (Checks.check(index, 16) * 1), value);
    }

    public static void napplicationNameOffset(long struct, int value) {
        MemoryUtil.memPutInt(struct + APPLICATIONNAMEOFFSET, value);
    }

    public static void napplicationVersion(long struct, int value) {
        MemoryUtil.memPutInt(struct + APPLICATIONVERSION, value);
    }

    public static void nengineNameOffset(long struct, int value) {
        MemoryUtil.memPutInt(struct + ENGINENAMEOFFSET, value);
    }

    public static void nengineVersion(long struct, int value) {
        MemoryUtil.memPutInt(struct + ENGINEVERSION, value);
    }

    public static void napiVersion(long struct, int value) {
        MemoryUtil.memPutInt(struct + APIVERSION, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDeviceFaultVendorBinaryHeaderVersionOneEXT$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDeviceFaultVendorBinaryHeaderVersionOneEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkDeviceFaultVendorBinaryHeaderVersionOneEXT, Buffer> implements NativeResource {
        private static final VkDeviceFaultVendorBinaryHeaderVersionOneEXT ELEMENT_FACTORY = VkDeviceFaultVendorBinaryHeaderVersionOneEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkDeviceFaultVendorBinaryHeaderVersionOneEXT.SIZEOF);
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
        public VkDeviceFaultVendorBinaryHeaderVersionOneEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("uint32_t")
        public int headerSize() {
            return VkDeviceFaultVendorBinaryHeaderVersionOneEXT.nheaderSize(address());
        }

        @NativeType("VkDeviceFaultVendorBinaryHeaderVersionEXT")
        public int headerVersion() {
            return VkDeviceFaultVendorBinaryHeaderVersionOneEXT.nheaderVersion(address());
        }

        @NativeType("uint32_t")
        public int vendorID() {
            return VkDeviceFaultVendorBinaryHeaderVersionOneEXT.nvendorID(address());
        }

        @NativeType("uint32_t")
        public int deviceID() {
            return VkDeviceFaultVendorBinaryHeaderVersionOneEXT.ndeviceID(address());
        }

        @NativeType("uint32_t")
        public int driverVersion() {
            return VkDeviceFaultVendorBinaryHeaderVersionOneEXT.ndriverVersion(address());
        }

        @NativeType("uint8_t[VK_UUID_SIZE]")
        public ByteBuffer pipelineCacheUUID() {
            return VkDeviceFaultVendorBinaryHeaderVersionOneEXT.npipelineCacheUUID(address());
        }

        @NativeType("uint8_t")
        public byte pipelineCacheUUID(int index) {
            return VkDeviceFaultVendorBinaryHeaderVersionOneEXT.npipelineCacheUUID(address(), index);
        }

        @NativeType("uint32_t")
        public int applicationNameOffset() {
            return VkDeviceFaultVendorBinaryHeaderVersionOneEXT.napplicationNameOffset(address());
        }

        @NativeType("uint32_t")
        public int applicationVersion() {
            return VkDeviceFaultVendorBinaryHeaderVersionOneEXT.napplicationVersion(address());
        }

        @NativeType("uint32_t")
        public int engineNameOffset() {
            return VkDeviceFaultVendorBinaryHeaderVersionOneEXT.nengineNameOffset(address());
        }

        @NativeType("uint32_t")
        public int engineVersion() {
            return VkDeviceFaultVendorBinaryHeaderVersionOneEXT.nengineVersion(address());
        }

        @NativeType("uint32_t")
        public int apiVersion() {
            return VkDeviceFaultVendorBinaryHeaderVersionOneEXT.napiVersion(address());
        }

        public Buffer headerSize(@NativeType("uint32_t") int value) {
            VkDeviceFaultVendorBinaryHeaderVersionOneEXT.nheaderSize(address(), value);
            return this;
        }

        public Buffer headerVersion(@NativeType("VkDeviceFaultVendorBinaryHeaderVersionEXT") int value) {
            VkDeviceFaultVendorBinaryHeaderVersionOneEXT.nheaderVersion(address(), value);
            return this;
        }

        public Buffer vendorID(@NativeType("uint32_t") int value) {
            VkDeviceFaultVendorBinaryHeaderVersionOneEXT.nvendorID(address(), value);
            return this;
        }

        public Buffer deviceID(@NativeType("uint32_t") int value) {
            VkDeviceFaultVendorBinaryHeaderVersionOneEXT.ndeviceID(address(), value);
            return this;
        }

        public Buffer driverVersion(@NativeType("uint32_t") int value) {
            VkDeviceFaultVendorBinaryHeaderVersionOneEXT.ndriverVersion(address(), value);
            return this;
        }

        public Buffer pipelineCacheUUID(@NativeType("uint8_t[VK_UUID_SIZE]") ByteBuffer value) {
            VkDeviceFaultVendorBinaryHeaderVersionOneEXT.npipelineCacheUUID(address(), value);
            return this;
        }

        public Buffer pipelineCacheUUID(int index, @NativeType("uint8_t") byte value) {
            VkDeviceFaultVendorBinaryHeaderVersionOneEXT.npipelineCacheUUID(address(), index, value);
            return this;
        }

        public Buffer applicationNameOffset(@NativeType("uint32_t") int value) {
            VkDeviceFaultVendorBinaryHeaderVersionOneEXT.napplicationNameOffset(address(), value);
            return this;
        }

        public Buffer applicationVersion(@NativeType("uint32_t") int value) {
            VkDeviceFaultVendorBinaryHeaderVersionOneEXT.napplicationVersion(address(), value);
            return this;
        }

        public Buffer engineNameOffset(@NativeType("uint32_t") int value) {
            VkDeviceFaultVendorBinaryHeaderVersionOneEXT.nengineNameOffset(address(), value);
            return this;
        }

        public Buffer engineVersion(@NativeType("uint32_t") int value) {
            VkDeviceFaultVendorBinaryHeaderVersionOneEXT.nengineVersion(address(), value);
            return this;
        }

        public Buffer apiVersion(@NativeType("uint32_t") int value) {
            VkDeviceFaultVendorBinaryHeaderVersionOneEXT.napiVersion(address(), value);
            return this;
        }
    }
}
