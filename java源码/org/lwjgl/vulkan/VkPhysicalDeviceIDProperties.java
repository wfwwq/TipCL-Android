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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceIDProperties.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceIDProperties.class */
public class VkPhysicalDeviceIDProperties extends Struct<VkPhysicalDeviceIDProperties> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int DEVICEUUID;
    public static final int DRIVERUUID;
    public static final int DEVICELUID;
    public static final int DEVICENODEMASK;
    public static final int DEVICELUIDVALID;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __array(1, 16), __array(1, 16), __array(1, 8), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        DEVICEUUID = layout.offsetof(2);
        DRIVERUUID = layout.offsetof(3);
        DEVICELUID = layout.offsetof(4);
        DEVICENODEMASK = layout.offsetof(5);
        DEVICELUIDVALID = layout.offsetof(6);
    }

    protected VkPhysicalDeviceIDProperties(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceIDProperties create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceIDProperties(address, container);
    }

    public VkPhysicalDeviceIDProperties(ByteBuffer container) {
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

    @NativeType("uint8_t[VK_UUID_SIZE]")
    public ByteBuffer deviceUUID() {
        return ndeviceUUID(address());
    }

    @NativeType("uint8_t")
    public byte deviceUUID(int index) {
        return ndeviceUUID(address(), index);
    }

    @NativeType("uint8_t[VK_UUID_SIZE]")
    public ByteBuffer driverUUID() {
        return ndriverUUID(address());
    }

    @NativeType("uint8_t")
    public byte driverUUID(int index) {
        return ndriverUUID(address(), index);
    }

    @NativeType("uint8_t[VK_LUID_SIZE]")
    public ByteBuffer deviceLUID() {
        return ndeviceLUID(address());
    }

    @NativeType("uint8_t")
    public byte deviceLUID(int index) {
        return ndeviceLUID(address(), index);
    }

    @NativeType("uint32_t")
    public int deviceNodeMask() {
        return ndeviceNodeMask(address());
    }

    @NativeType("VkBool32")
    public boolean deviceLUIDValid() {
        return ndeviceLUIDValid(address()) != 0;
    }

    public VkPhysicalDeviceIDProperties sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceIDProperties sType$Default() {
        return sType(1000071004);
    }

    public VkPhysicalDeviceIDProperties pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceIDProperties set(int sType, long pNext) {
        sType(sType);
        pNext(pNext);
        return this;
    }

    public VkPhysicalDeviceIDProperties set(VkPhysicalDeviceIDProperties src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceIDProperties malloc() {
        return new VkPhysicalDeviceIDProperties(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceIDProperties calloc() {
        return new VkPhysicalDeviceIDProperties(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceIDProperties create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceIDProperties(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceIDProperties create(long address) {
        return new VkPhysicalDeviceIDProperties(address, null);
    }

    public static VkPhysicalDeviceIDProperties createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceIDProperties(address, null);
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

    public static VkPhysicalDeviceIDProperties malloc(MemoryStack stack) {
        return new VkPhysicalDeviceIDProperties(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceIDProperties calloc(MemoryStack stack) {
        return new VkPhysicalDeviceIDProperties(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static ByteBuffer ndeviceUUID(long struct) {
        return MemoryUtil.memByteBuffer(struct + DEVICEUUID, 16);
    }

    public static byte ndeviceUUID(long struct, int index) {
        return MemoryUtil.memGetByte(struct + DEVICEUUID + (Checks.check(index, 16) * 1));
    }

    public static ByteBuffer ndriverUUID(long struct) {
        return MemoryUtil.memByteBuffer(struct + DRIVERUUID, 16);
    }

    public static byte ndriverUUID(long struct, int index) {
        return MemoryUtil.memGetByte(struct + DRIVERUUID + (Checks.check(index, 16) * 1));
    }

    public static ByteBuffer ndeviceLUID(long struct) {
        return MemoryUtil.memByteBuffer(struct + DEVICELUID, 8);
    }

    public static byte ndeviceLUID(long struct, int index) {
        return MemoryUtil.memGetByte(struct + DEVICELUID + (Checks.check(index, 8) * 1));
    }

    public static int ndeviceNodeMask(long struct) {
        return MemoryUtil.memGetInt(struct + DEVICENODEMASK);
    }

    public static int ndeviceLUIDValid(long struct) {
        return MemoryUtil.memGetInt(struct + DEVICELUIDVALID);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceIDProperties$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceIDProperties$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceIDProperties, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceIDProperties ELEMENT_FACTORY = VkPhysicalDeviceIDProperties.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceIDProperties.SIZEOF);
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
        public VkPhysicalDeviceIDProperties getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceIDProperties.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceIDProperties.npNext(address());
        }

        @NativeType("uint8_t[VK_UUID_SIZE]")
        public ByteBuffer deviceUUID() {
            return VkPhysicalDeviceIDProperties.ndeviceUUID(address());
        }

        @NativeType("uint8_t")
        public byte deviceUUID(int index) {
            return VkPhysicalDeviceIDProperties.ndeviceUUID(address(), index);
        }

        @NativeType("uint8_t[VK_UUID_SIZE]")
        public ByteBuffer driverUUID() {
            return VkPhysicalDeviceIDProperties.ndriverUUID(address());
        }

        @NativeType("uint8_t")
        public byte driverUUID(int index) {
            return VkPhysicalDeviceIDProperties.ndriverUUID(address(), index);
        }

        @NativeType("uint8_t[VK_LUID_SIZE]")
        public ByteBuffer deviceLUID() {
            return VkPhysicalDeviceIDProperties.ndeviceLUID(address());
        }

        @NativeType("uint8_t")
        public byte deviceLUID(int index) {
            return VkPhysicalDeviceIDProperties.ndeviceLUID(address(), index);
        }

        @NativeType("uint32_t")
        public int deviceNodeMask() {
            return VkPhysicalDeviceIDProperties.ndeviceNodeMask(address());
        }

        @NativeType("VkBool32")
        public boolean deviceLUIDValid() {
            return VkPhysicalDeviceIDProperties.ndeviceLUIDValid(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceIDProperties.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000071004);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceIDProperties.npNext(address(), value);
            return this;
        }
    }
}
