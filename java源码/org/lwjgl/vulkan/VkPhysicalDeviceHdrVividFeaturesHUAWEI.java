package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceHdrVividFeaturesHUAWEI.class */
public class VkPhysicalDeviceHdrVividFeaturesHUAWEI extends Struct<VkPhysicalDeviceHdrVividFeaturesHUAWEI> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int HDRVIVID;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        HDRVIVID = layout.offsetof(2);
    }

    protected VkPhysicalDeviceHdrVividFeaturesHUAWEI(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceHdrVividFeaturesHUAWEI create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceHdrVividFeaturesHUAWEI(address, container);
    }

    public VkPhysicalDeviceHdrVividFeaturesHUAWEI(ByteBuffer container) {
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
    public boolean hdrVivid() {
        return nhdrVivid(address()) != 0;
    }

    public VkPhysicalDeviceHdrVividFeaturesHUAWEI sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceHdrVividFeaturesHUAWEI sType$Default() {
        return sType(HUAWEIHdrVivid.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_HDR_VIVID_FEATURES_HUAWEI);
    }

    public VkPhysicalDeviceHdrVividFeaturesHUAWEI pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceHdrVividFeaturesHUAWEI hdrVivid(@NativeType("VkBool32") boolean value) {
        nhdrVivid(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceHdrVividFeaturesHUAWEI set(int sType, long pNext, boolean hdrVivid) {
        sType(sType);
        pNext(pNext);
        hdrVivid(hdrVivid);
        return this;
    }

    public VkPhysicalDeviceHdrVividFeaturesHUAWEI set(VkPhysicalDeviceHdrVividFeaturesHUAWEI src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceHdrVividFeaturesHUAWEI malloc() {
        return new VkPhysicalDeviceHdrVividFeaturesHUAWEI(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceHdrVividFeaturesHUAWEI calloc() {
        return new VkPhysicalDeviceHdrVividFeaturesHUAWEI(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceHdrVividFeaturesHUAWEI create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceHdrVividFeaturesHUAWEI(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceHdrVividFeaturesHUAWEI create(long address) {
        return new VkPhysicalDeviceHdrVividFeaturesHUAWEI(address, null);
    }

    public static VkPhysicalDeviceHdrVividFeaturesHUAWEI createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceHdrVividFeaturesHUAWEI(address, null);
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

    public static VkPhysicalDeviceHdrVividFeaturesHUAWEI malloc(MemoryStack stack) {
        return new VkPhysicalDeviceHdrVividFeaturesHUAWEI(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceHdrVividFeaturesHUAWEI calloc(MemoryStack stack) {
        return new VkPhysicalDeviceHdrVividFeaturesHUAWEI(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nhdrVivid(long struct) {
        return MemoryUtil.memGetInt(struct + HDRVIVID);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nhdrVivid(long struct, int value) {
        MemoryUtil.memPutInt(struct + HDRVIVID, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceHdrVividFeaturesHUAWEI$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceHdrVividFeaturesHUAWEI, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceHdrVividFeaturesHUAWEI ELEMENT_FACTORY = VkPhysicalDeviceHdrVividFeaturesHUAWEI.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceHdrVividFeaturesHUAWEI.SIZEOF);
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
        public VkPhysicalDeviceHdrVividFeaturesHUAWEI getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceHdrVividFeaturesHUAWEI.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceHdrVividFeaturesHUAWEI.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean hdrVivid() {
            return VkPhysicalDeviceHdrVividFeaturesHUAWEI.nhdrVivid(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceHdrVividFeaturesHUAWEI.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(HUAWEIHdrVivid.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_HDR_VIVID_FEATURES_HUAWEI);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceHdrVividFeaturesHUAWEI.npNext(address(), value);
            return this;
        }

        public Buffer hdrVivid(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceHdrVividFeaturesHUAWEI.nhdrVivid(address(), value ? 1 : 0);
            return this;
        }
    }
}
