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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceDriverProperties.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceDriverProperties.class */
public class VkPhysicalDeviceDriverProperties extends Struct<VkPhysicalDeviceDriverProperties> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int DRIVERID;
    public static final int DRIVERNAME;
    public static final int DRIVERINFO;
    public static final int CONFORMANCEVERSION;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __array(1, 256), __array(1, 256), __member(VkConformanceVersion.SIZEOF, VkConformanceVersion.ALIGNOF));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        DRIVERID = layout.offsetof(2);
        DRIVERNAME = layout.offsetof(3);
        DRIVERINFO = layout.offsetof(4);
        CONFORMANCEVERSION = layout.offsetof(5);
    }

    protected VkPhysicalDeviceDriverProperties(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceDriverProperties create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceDriverProperties(address, container);
    }

    public VkPhysicalDeviceDriverProperties(ByteBuffer container) {
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

    @NativeType("VkDriverId")
    public int driverID() {
        return ndriverID(address());
    }

    @NativeType("char[VK_MAX_DRIVER_NAME_SIZE]")
    public ByteBuffer driverName() {
        return ndriverName(address());
    }

    @NativeType("char[VK_MAX_DRIVER_NAME_SIZE]")
    public String driverNameString() {
        return ndriverNameString(address());
    }

    @NativeType("char[VK_MAX_DRIVER_INFO_SIZE]")
    public ByteBuffer driverInfo() {
        return ndriverInfo(address());
    }

    @NativeType("char[VK_MAX_DRIVER_INFO_SIZE]")
    public String driverInfoString() {
        return ndriverInfoString(address());
    }

    public VkConformanceVersion conformanceVersion() {
        return nconformanceVersion(address());
    }

    public VkPhysicalDeviceDriverProperties sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceDriverProperties sType$Default() {
        return sType(1000196000);
    }

    public VkPhysicalDeviceDriverProperties pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceDriverProperties set(int sType, long pNext) {
        sType(sType);
        pNext(pNext);
        return this;
    }

    public VkPhysicalDeviceDriverProperties set(VkPhysicalDeviceDriverProperties src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceDriverProperties malloc() {
        return new VkPhysicalDeviceDriverProperties(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceDriverProperties calloc() {
        return new VkPhysicalDeviceDriverProperties(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceDriverProperties create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceDriverProperties(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceDriverProperties create(long address) {
        return new VkPhysicalDeviceDriverProperties(address, null);
    }

    public static VkPhysicalDeviceDriverProperties createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceDriverProperties(address, null);
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

    public static VkPhysicalDeviceDriverProperties malloc(MemoryStack stack) {
        return new VkPhysicalDeviceDriverProperties(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceDriverProperties calloc(MemoryStack stack) {
        return new VkPhysicalDeviceDriverProperties(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int ndriverID(long struct) {
        return MemoryUtil.memGetInt(struct + DRIVERID);
    }

    public static ByteBuffer ndriverName(long struct) {
        return MemoryUtil.memByteBuffer(struct + DRIVERNAME, 256);
    }

    public static String ndriverNameString(long struct) {
        return MemoryUtil.memUTF8(struct + DRIVERNAME);
    }

    public static ByteBuffer ndriverInfo(long struct) {
        return MemoryUtil.memByteBuffer(struct + DRIVERINFO, 256);
    }

    public static String ndriverInfoString(long struct) {
        return MemoryUtil.memUTF8(struct + DRIVERINFO);
    }

    public static VkConformanceVersion nconformanceVersion(long struct) {
        return VkConformanceVersion.create(struct + CONFORMANCEVERSION);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceDriverProperties$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceDriverProperties$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceDriverProperties, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceDriverProperties ELEMENT_FACTORY = VkPhysicalDeviceDriverProperties.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceDriverProperties.SIZEOF);
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
        public VkPhysicalDeviceDriverProperties getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceDriverProperties.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceDriverProperties.npNext(address());
        }

        @NativeType("VkDriverId")
        public int driverID() {
            return VkPhysicalDeviceDriverProperties.ndriverID(address());
        }

        @NativeType("char[VK_MAX_DRIVER_NAME_SIZE]")
        public ByteBuffer driverName() {
            return VkPhysicalDeviceDriverProperties.ndriverName(address());
        }

        @NativeType("char[VK_MAX_DRIVER_NAME_SIZE]")
        public String driverNameString() {
            return VkPhysicalDeviceDriverProperties.ndriverNameString(address());
        }

        @NativeType("char[VK_MAX_DRIVER_INFO_SIZE]")
        public ByteBuffer driverInfo() {
            return VkPhysicalDeviceDriverProperties.ndriverInfo(address());
        }

        @NativeType("char[VK_MAX_DRIVER_INFO_SIZE]")
        public String driverInfoString() {
            return VkPhysicalDeviceDriverProperties.ndriverInfoString(address());
        }

        public VkConformanceVersion conformanceVersion() {
            return VkPhysicalDeviceDriverProperties.nconformanceVersion(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceDriverProperties.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000196000);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceDriverProperties.npNext(address(), value);
            return this;
        }
    }
}
