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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDevicePCIBusInfoPropertiesEXT.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDevicePCIBusInfoPropertiesEXT.class */
public class VkPhysicalDevicePCIBusInfoPropertiesEXT extends Struct<VkPhysicalDevicePCIBusInfoPropertiesEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int PCIDOMAIN;
    public static final int PCIBUS;
    public static final int PCIDEVICE;
    public static final int PCIFUNCTION;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        PCIDOMAIN = layout.offsetof(2);
        PCIBUS = layout.offsetof(3);
        PCIDEVICE = layout.offsetof(4);
        PCIFUNCTION = layout.offsetof(5);
    }

    protected VkPhysicalDevicePCIBusInfoPropertiesEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDevicePCIBusInfoPropertiesEXT create(long address, ByteBuffer container) {
        return new VkPhysicalDevicePCIBusInfoPropertiesEXT(address, container);
    }

    public VkPhysicalDevicePCIBusInfoPropertiesEXT(ByteBuffer container) {
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
    public int pciDomain() {
        return npciDomain(address());
    }

    @NativeType("uint32_t")
    public int pciBus() {
        return npciBus(address());
    }

    @NativeType("uint32_t")
    public int pciDevice() {
        return npciDevice(address());
    }

    @NativeType("uint32_t")
    public int pciFunction() {
        return npciFunction(address());
    }

    public VkPhysicalDevicePCIBusInfoPropertiesEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDevicePCIBusInfoPropertiesEXT sType$Default() {
        return sType(EXTPciBusInfo.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PCI_BUS_INFO_PROPERTIES_EXT);
    }

    public VkPhysicalDevicePCIBusInfoPropertiesEXT pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDevicePCIBusInfoPropertiesEXT set(int sType, long pNext) {
        sType(sType);
        pNext(pNext);
        return this;
    }

    public VkPhysicalDevicePCIBusInfoPropertiesEXT set(VkPhysicalDevicePCIBusInfoPropertiesEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDevicePCIBusInfoPropertiesEXT malloc() {
        return new VkPhysicalDevicePCIBusInfoPropertiesEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDevicePCIBusInfoPropertiesEXT calloc() {
        return new VkPhysicalDevicePCIBusInfoPropertiesEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDevicePCIBusInfoPropertiesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDevicePCIBusInfoPropertiesEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDevicePCIBusInfoPropertiesEXT create(long address) {
        return new VkPhysicalDevicePCIBusInfoPropertiesEXT(address, null);
    }

    public static VkPhysicalDevicePCIBusInfoPropertiesEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDevicePCIBusInfoPropertiesEXT(address, null);
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

    public static VkPhysicalDevicePCIBusInfoPropertiesEXT malloc(MemoryStack stack) {
        return new VkPhysicalDevicePCIBusInfoPropertiesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDevicePCIBusInfoPropertiesEXT calloc(MemoryStack stack) {
        return new VkPhysicalDevicePCIBusInfoPropertiesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int npciDomain(long struct) {
        return MemoryUtil.memGetInt(struct + PCIDOMAIN);
    }

    public static int npciBus(long struct) {
        return MemoryUtil.memGetInt(struct + PCIBUS);
    }

    public static int npciDevice(long struct) {
        return MemoryUtil.memGetInt(struct + PCIDEVICE);
    }

    public static int npciFunction(long struct) {
        return MemoryUtil.memGetInt(struct + PCIFUNCTION);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDevicePCIBusInfoPropertiesEXT$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDevicePCIBusInfoPropertiesEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDevicePCIBusInfoPropertiesEXT, Buffer> implements NativeResource {
        private static final VkPhysicalDevicePCIBusInfoPropertiesEXT ELEMENT_FACTORY = VkPhysicalDevicePCIBusInfoPropertiesEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDevicePCIBusInfoPropertiesEXT.SIZEOF);
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
        public VkPhysicalDevicePCIBusInfoPropertiesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDevicePCIBusInfoPropertiesEXT.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDevicePCIBusInfoPropertiesEXT.npNext(address());
        }

        @NativeType("uint32_t")
        public int pciDomain() {
            return VkPhysicalDevicePCIBusInfoPropertiesEXT.npciDomain(address());
        }

        @NativeType("uint32_t")
        public int pciBus() {
            return VkPhysicalDevicePCIBusInfoPropertiesEXT.npciBus(address());
        }

        @NativeType("uint32_t")
        public int pciDevice() {
            return VkPhysicalDevicePCIBusInfoPropertiesEXT.npciDevice(address());
        }

        @NativeType("uint32_t")
        public int pciFunction() {
            return VkPhysicalDevicePCIBusInfoPropertiesEXT.npciFunction(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDevicePCIBusInfoPropertiesEXT.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(EXTPciBusInfo.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PCI_BUS_INFO_PROPERTIES_EXT);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDevicePCIBusInfoPropertiesEXT.npNext(address(), value);
            return this;
        }
    }
}
