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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkExportMetalDeviceInfoEXT.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkExportMetalDeviceInfoEXT.class */
public class VkExportMetalDeviceInfoEXT extends Struct<VkExportMetalDeviceInfoEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int MTLDEVICE;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        MTLDEVICE = layout.offsetof(2);
    }

    protected VkExportMetalDeviceInfoEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkExportMetalDeviceInfoEXT create(long address, ByteBuffer container) {
        return new VkExportMetalDeviceInfoEXT(address, container);
    }

    public VkExportMetalDeviceInfoEXT(ByteBuffer container) {
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

    @NativeType("MTLDevice_id")
    public long mtlDevice() {
        return nmtlDevice(address());
    }

    public VkExportMetalDeviceInfoEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkExportMetalDeviceInfoEXT sType$Default() {
        return sType(EXTMetalObjects.VK_STRUCTURE_TYPE_EXPORT_METAL_DEVICE_INFO_EXT);
    }

    public VkExportMetalDeviceInfoEXT pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkExportMetalDeviceInfoEXT mtlDevice(@NativeType("MTLDevice_id") long value) {
        nmtlDevice(address(), value);
        return this;
    }

    public VkExportMetalDeviceInfoEXT set(int sType, long pNext, long mtlDevice) {
        sType(sType);
        pNext(pNext);
        mtlDevice(mtlDevice);
        return this;
    }

    public VkExportMetalDeviceInfoEXT set(VkExportMetalDeviceInfoEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkExportMetalDeviceInfoEXT malloc() {
        return new VkExportMetalDeviceInfoEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkExportMetalDeviceInfoEXT calloc() {
        return new VkExportMetalDeviceInfoEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkExportMetalDeviceInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkExportMetalDeviceInfoEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkExportMetalDeviceInfoEXT create(long address) {
        return new VkExportMetalDeviceInfoEXT(address, null);
    }

    public static VkExportMetalDeviceInfoEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkExportMetalDeviceInfoEXT(address, null);
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

    public static VkExportMetalDeviceInfoEXT malloc(MemoryStack stack) {
        return new VkExportMetalDeviceInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkExportMetalDeviceInfoEXT calloc(MemoryStack stack) {
        return new VkExportMetalDeviceInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static long nmtlDevice(long struct) {
        return MemoryUtil.memGetAddress(struct + MTLDEVICE);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nmtlDevice(long struct, long value) {
        MemoryUtil.memPutAddress(struct + MTLDEVICE, Checks.check(value));
    }

    public static void validate(long struct) {
        Checks.check(MemoryUtil.memGetAddress(struct + MTLDEVICE));
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkExportMetalDeviceInfoEXT$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkExportMetalDeviceInfoEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkExportMetalDeviceInfoEXT, Buffer> implements NativeResource {
        private static final VkExportMetalDeviceInfoEXT ELEMENT_FACTORY = VkExportMetalDeviceInfoEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkExportMetalDeviceInfoEXT.SIZEOF);
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
        public VkExportMetalDeviceInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkExportMetalDeviceInfoEXT.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkExportMetalDeviceInfoEXT.npNext(address());
        }

        @NativeType("MTLDevice_id")
        public long mtlDevice() {
            return VkExportMetalDeviceInfoEXT.nmtlDevice(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkExportMetalDeviceInfoEXT.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(EXTMetalObjects.VK_STRUCTURE_TYPE_EXPORT_METAL_DEVICE_INFO_EXT);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkExportMetalDeviceInfoEXT.npNext(address(), value);
            return this;
        }

        public Buffer mtlDevice(@NativeType("MTLDevice_id") long value) {
            VkExportMetalDeviceInfoEXT.nmtlDevice(address(), value);
            return this;
        }
    }
}
