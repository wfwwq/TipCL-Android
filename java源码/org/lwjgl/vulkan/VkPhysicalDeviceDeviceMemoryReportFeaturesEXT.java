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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceDeviceMemoryReportFeaturesEXT.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceDeviceMemoryReportFeaturesEXT.class */
public class VkPhysicalDeviceDeviceMemoryReportFeaturesEXT extends Struct<VkPhysicalDeviceDeviceMemoryReportFeaturesEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int DEVICEMEMORYREPORT;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        DEVICEMEMORYREPORT = layout.offsetof(2);
    }

    protected VkPhysicalDeviceDeviceMemoryReportFeaturesEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceDeviceMemoryReportFeaturesEXT create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceDeviceMemoryReportFeaturesEXT(address, container);
    }

    public VkPhysicalDeviceDeviceMemoryReportFeaturesEXT(ByteBuffer container) {
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
    public boolean deviceMemoryReport() {
        return ndeviceMemoryReport(address()) != 0;
    }

    public VkPhysicalDeviceDeviceMemoryReportFeaturesEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceDeviceMemoryReportFeaturesEXT sType$Default() {
        return sType(EXTDeviceMemoryReport.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DEVICE_MEMORY_REPORT_FEATURES_EXT);
    }

    public VkPhysicalDeviceDeviceMemoryReportFeaturesEXT pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceDeviceMemoryReportFeaturesEXT deviceMemoryReport(@NativeType("VkBool32") boolean value) {
        ndeviceMemoryReport(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceDeviceMemoryReportFeaturesEXT set(int sType, long pNext, boolean deviceMemoryReport) {
        sType(sType);
        pNext(pNext);
        deviceMemoryReport(deviceMemoryReport);
        return this;
    }

    public VkPhysicalDeviceDeviceMemoryReportFeaturesEXT set(VkPhysicalDeviceDeviceMemoryReportFeaturesEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceDeviceMemoryReportFeaturesEXT malloc() {
        return new VkPhysicalDeviceDeviceMemoryReportFeaturesEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceDeviceMemoryReportFeaturesEXT calloc() {
        return new VkPhysicalDeviceDeviceMemoryReportFeaturesEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceDeviceMemoryReportFeaturesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceDeviceMemoryReportFeaturesEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceDeviceMemoryReportFeaturesEXT create(long address) {
        return new VkPhysicalDeviceDeviceMemoryReportFeaturesEXT(address, null);
    }

    public static VkPhysicalDeviceDeviceMemoryReportFeaturesEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceDeviceMemoryReportFeaturesEXT(address, null);
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

    public static VkPhysicalDeviceDeviceMemoryReportFeaturesEXT malloc(MemoryStack stack) {
        return new VkPhysicalDeviceDeviceMemoryReportFeaturesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceDeviceMemoryReportFeaturesEXT calloc(MemoryStack stack) {
        return new VkPhysicalDeviceDeviceMemoryReportFeaturesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int ndeviceMemoryReport(long struct) {
        return MemoryUtil.memGetInt(struct + DEVICEMEMORYREPORT);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void ndeviceMemoryReport(long struct, int value) {
        MemoryUtil.memPutInt(struct + DEVICEMEMORYREPORT, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceDeviceMemoryReportFeaturesEXT$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceDeviceMemoryReportFeaturesEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceDeviceMemoryReportFeaturesEXT, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceDeviceMemoryReportFeaturesEXT ELEMENT_FACTORY = VkPhysicalDeviceDeviceMemoryReportFeaturesEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceDeviceMemoryReportFeaturesEXT.SIZEOF);
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
        public VkPhysicalDeviceDeviceMemoryReportFeaturesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceDeviceMemoryReportFeaturesEXT.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceDeviceMemoryReportFeaturesEXT.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean deviceMemoryReport() {
            return VkPhysicalDeviceDeviceMemoryReportFeaturesEXT.ndeviceMemoryReport(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceDeviceMemoryReportFeaturesEXT.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(EXTDeviceMemoryReport.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DEVICE_MEMORY_REPORT_FEATURES_EXT);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceDeviceMemoryReportFeaturesEXT.npNext(address(), value);
            return this;
        }

        public Buffer deviceMemoryReport(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceDeviceMemoryReportFeaturesEXT.ndeviceMemoryReport(address(), value ? 1 : 0);
            return this;
        }
    }
}
