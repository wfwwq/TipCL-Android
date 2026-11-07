package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceMaintenance9PropertiesKHR.class */
public class VkPhysicalDeviceMaintenance9PropertiesKHR extends Struct<VkPhysicalDeviceMaintenance9PropertiesKHR> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int IMAGE2DVIEWOF3DSPARSE;
    public static final int DEFAULTVERTEXATTRIBUTEVALUE;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        IMAGE2DVIEWOF3DSPARSE = layout.offsetof(2);
        DEFAULTVERTEXATTRIBUTEVALUE = layout.offsetof(3);
    }

    protected VkPhysicalDeviceMaintenance9PropertiesKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceMaintenance9PropertiesKHR create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceMaintenance9PropertiesKHR(address, container);
    }

    public VkPhysicalDeviceMaintenance9PropertiesKHR(ByteBuffer container) {
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
    public boolean image2DViewOf3DSparse() {
        return nimage2DViewOf3DSparse(address()) != 0;
    }

    @NativeType("VkDefaultVertexAttributeValueKHR")
    public int defaultVertexAttributeValue() {
        return ndefaultVertexAttributeValue(address());
    }

    public VkPhysicalDeviceMaintenance9PropertiesKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceMaintenance9PropertiesKHR sType$Default() {
        return sType(KHRMaintenance9.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_9_PROPERTIES_KHR);
    }

    public VkPhysicalDeviceMaintenance9PropertiesKHR pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceMaintenance9PropertiesKHR set(int sType, long pNext) {
        sType(sType);
        pNext(pNext);
        return this;
    }

    public VkPhysicalDeviceMaintenance9PropertiesKHR set(VkPhysicalDeviceMaintenance9PropertiesKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceMaintenance9PropertiesKHR malloc() {
        return new VkPhysicalDeviceMaintenance9PropertiesKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceMaintenance9PropertiesKHR calloc() {
        return new VkPhysicalDeviceMaintenance9PropertiesKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceMaintenance9PropertiesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceMaintenance9PropertiesKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceMaintenance9PropertiesKHR create(long address) {
        return new VkPhysicalDeviceMaintenance9PropertiesKHR(address, null);
    }

    public static VkPhysicalDeviceMaintenance9PropertiesKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceMaintenance9PropertiesKHR(address, null);
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

    public static VkPhysicalDeviceMaintenance9PropertiesKHR malloc(MemoryStack stack) {
        return new VkPhysicalDeviceMaintenance9PropertiesKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceMaintenance9PropertiesKHR calloc(MemoryStack stack) {
        return new VkPhysicalDeviceMaintenance9PropertiesKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nimage2DViewOf3DSparse(long struct) {
        return MemoryUtil.memGetInt(struct + IMAGE2DVIEWOF3DSPARSE);
    }

    public static int ndefaultVertexAttributeValue(long struct) {
        return MemoryUtil.memGetInt(struct + DEFAULTVERTEXATTRIBUTEVALUE);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceMaintenance9PropertiesKHR$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceMaintenance9PropertiesKHR, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceMaintenance9PropertiesKHR ELEMENT_FACTORY = VkPhysicalDeviceMaintenance9PropertiesKHR.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceMaintenance9PropertiesKHR.SIZEOF);
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
        public VkPhysicalDeviceMaintenance9PropertiesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceMaintenance9PropertiesKHR.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceMaintenance9PropertiesKHR.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean image2DViewOf3DSparse() {
            return VkPhysicalDeviceMaintenance9PropertiesKHR.nimage2DViewOf3DSparse(address()) != 0;
        }

        @NativeType("VkDefaultVertexAttributeValueKHR")
        public int defaultVertexAttributeValue() {
            return VkPhysicalDeviceMaintenance9PropertiesKHR.ndefaultVertexAttributeValue(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceMaintenance9PropertiesKHR.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(KHRMaintenance9.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_9_PROPERTIES_KHR);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceMaintenance9PropertiesKHR.npNext(address(), value);
            return this;
        }
    }
}
