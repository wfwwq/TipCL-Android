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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineCacheHeaderVersionOne.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineCacheHeaderVersionOne.class */
public class VkPipelineCacheHeaderVersionOne extends Struct<VkPipelineCacheHeaderVersionOne> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int HEADERSIZE;
    public static final int HEADERVERSION;
    public static final int VENDORID;
    public static final int DEVICEID;
    public static final int PIPELINECACHEUUID;

    static {
        Struct.Layout layout = __struct(__member(4), __member(4), __member(4), __member(4), __array(1, 16));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        HEADERSIZE = layout.offsetof(0);
        HEADERVERSION = layout.offsetof(1);
        VENDORID = layout.offsetof(2);
        DEVICEID = layout.offsetof(3);
        PIPELINECACHEUUID = layout.offsetof(4);
    }

    protected VkPipelineCacheHeaderVersionOne(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPipelineCacheHeaderVersionOne create(long address, ByteBuffer container) {
        return new VkPipelineCacheHeaderVersionOne(address, container);
    }

    public VkPipelineCacheHeaderVersionOne(ByteBuffer container) {
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

    @NativeType("VkPipelineCacheHeaderVersion")
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

    @NativeType("uint8_t[VK_UUID_SIZE]")
    public ByteBuffer pipelineCacheUUID() {
        return npipelineCacheUUID(address());
    }

    @NativeType("uint8_t")
    public byte pipelineCacheUUID(int index) {
        return npipelineCacheUUID(address(), index);
    }

    public VkPipelineCacheHeaderVersionOne headerSize(@NativeType("uint32_t") int value) {
        nheaderSize(address(), value);
        return this;
    }

    public VkPipelineCacheHeaderVersionOne headerVersion(@NativeType("VkPipelineCacheHeaderVersion") int value) {
        nheaderVersion(address(), value);
        return this;
    }

    public VkPipelineCacheHeaderVersionOne vendorID(@NativeType("uint32_t") int value) {
        nvendorID(address(), value);
        return this;
    }

    public VkPipelineCacheHeaderVersionOne deviceID(@NativeType("uint32_t") int value) {
        ndeviceID(address(), value);
        return this;
    }

    public VkPipelineCacheHeaderVersionOne pipelineCacheUUID(@NativeType("uint8_t[VK_UUID_SIZE]") ByteBuffer value) {
        npipelineCacheUUID(address(), value);
        return this;
    }

    public VkPipelineCacheHeaderVersionOne pipelineCacheUUID(int index, @NativeType("uint8_t") byte value) {
        npipelineCacheUUID(address(), index, value);
        return this;
    }

    public VkPipelineCacheHeaderVersionOne set(int headerSize, int headerVersion, int vendorID, int deviceID, ByteBuffer pipelineCacheUUID) {
        headerSize(headerSize);
        headerVersion(headerVersion);
        vendorID(vendorID);
        deviceID(deviceID);
        pipelineCacheUUID(pipelineCacheUUID);
        return this;
    }

    public VkPipelineCacheHeaderVersionOne set(VkPipelineCacheHeaderVersionOne src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPipelineCacheHeaderVersionOne malloc() {
        return new VkPipelineCacheHeaderVersionOne(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPipelineCacheHeaderVersionOne calloc() {
        return new VkPipelineCacheHeaderVersionOne(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPipelineCacheHeaderVersionOne create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPipelineCacheHeaderVersionOne(MemoryUtil.memAddress(container), container);
    }

    public static VkPipelineCacheHeaderVersionOne create(long address) {
        return new VkPipelineCacheHeaderVersionOne(address, null);
    }

    public static VkPipelineCacheHeaderVersionOne createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPipelineCacheHeaderVersionOne(address, null);
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

    public static VkPipelineCacheHeaderVersionOne malloc(MemoryStack stack) {
        return new VkPipelineCacheHeaderVersionOne(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPipelineCacheHeaderVersionOne calloc(MemoryStack stack) {
        return new VkPipelineCacheHeaderVersionOne(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static ByteBuffer npipelineCacheUUID(long struct) {
        return MemoryUtil.memByteBuffer(struct + PIPELINECACHEUUID, 16);
    }

    public static byte npipelineCacheUUID(long struct, int index) {
        return MemoryUtil.memGetByte(struct + PIPELINECACHEUUID + (Checks.check(index, 16) * 1));
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

    public static void npipelineCacheUUID(long struct, ByteBuffer value) {
        if (Checks.CHECKS) {
            Checks.checkGT(value, 16);
        }
        MemoryUtil.memCopy(MemoryUtil.memAddress(value), struct + PIPELINECACHEUUID, value.remaining() * 1);
    }

    public static void npipelineCacheUUID(long struct, int index, byte value) {
        MemoryUtil.memPutByte(struct + PIPELINECACHEUUID + (Checks.check(index, 16) * 1), value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineCacheHeaderVersionOne$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineCacheHeaderVersionOne$Buffer.class */
    public static class Buffer extends StructBuffer<VkPipelineCacheHeaderVersionOne, Buffer> implements NativeResource {
        private static final VkPipelineCacheHeaderVersionOne ELEMENT_FACTORY = VkPipelineCacheHeaderVersionOne.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPipelineCacheHeaderVersionOne.SIZEOF);
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
        public VkPipelineCacheHeaderVersionOne getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("uint32_t")
        public int headerSize() {
            return VkPipelineCacheHeaderVersionOne.nheaderSize(address());
        }

        @NativeType("VkPipelineCacheHeaderVersion")
        public int headerVersion() {
            return VkPipelineCacheHeaderVersionOne.nheaderVersion(address());
        }

        @NativeType("uint32_t")
        public int vendorID() {
            return VkPipelineCacheHeaderVersionOne.nvendorID(address());
        }

        @NativeType("uint32_t")
        public int deviceID() {
            return VkPipelineCacheHeaderVersionOne.ndeviceID(address());
        }

        @NativeType("uint8_t[VK_UUID_SIZE]")
        public ByteBuffer pipelineCacheUUID() {
            return VkPipelineCacheHeaderVersionOne.npipelineCacheUUID(address());
        }

        @NativeType("uint8_t")
        public byte pipelineCacheUUID(int index) {
            return VkPipelineCacheHeaderVersionOne.npipelineCacheUUID(address(), index);
        }

        public Buffer headerSize(@NativeType("uint32_t") int value) {
            VkPipelineCacheHeaderVersionOne.nheaderSize(address(), value);
            return this;
        }

        public Buffer headerVersion(@NativeType("VkPipelineCacheHeaderVersion") int value) {
            VkPipelineCacheHeaderVersionOne.nheaderVersion(address(), value);
            return this;
        }

        public Buffer vendorID(@NativeType("uint32_t") int value) {
            VkPipelineCacheHeaderVersionOne.nvendorID(address(), value);
            return this;
        }

        public Buffer deviceID(@NativeType("uint32_t") int value) {
            VkPipelineCacheHeaderVersionOne.ndeviceID(address(), value);
            return this;
        }

        public Buffer pipelineCacheUUID(@NativeType("uint8_t[VK_UUID_SIZE]") ByteBuffer value) {
            VkPipelineCacheHeaderVersionOne.npipelineCacheUUID(address(), value);
            return this;
        }

        public Buffer pipelineCacheUUID(int index, @NativeType("uint8_t") byte value) {
            VkPipelineCacheHeaderVersionOne.npipelineCacheUUID(address(), index, value);
            return this;
        }
    }
}
