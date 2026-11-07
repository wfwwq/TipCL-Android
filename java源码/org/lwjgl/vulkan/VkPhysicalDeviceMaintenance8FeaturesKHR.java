package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceMaintenance8FeaturesKHR.class */
public class VkPhysicalDeviceMaintenance8FeaturesKHR extends Struct<VkPhysicalDeviceMaintenance8FeaturesKHR> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int MAINTENANCE8;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        MAINTENANCE8 = layout.offsetof(2);
    }

    protected VkPhysicalDeviceMaintenance8FeaturesKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceMaintenance8FeaturesKHR create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceMaintenance8FeaturesKHR(address, container);
    }

    public VkPhysicalDeviceMaintenance8FeaturesKHR(ByteBuffer container) {
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
    public boolean maintenance8() {
        return nmaintenance8(address()) != 0;
    }

    public VkPhysicalDeviceMaintenance8FeaturesKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceMaintenance8FeaturesKHR sType$Default() {
        return sType(KHRMaintenance8.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_8_FEATURES_KHR);
    }

    public VkPhysicalDeviceMaintenance8FeaturesKHR pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceMaintenance8FeaturesKHR maintenance8(@NativeType("VkBool32") boolean value) {
        nmaintenance8(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceMaintenance8FeaturesKHR set(int sType, long pNext, boolean maintenance8) {
        sType(sType);
        pNext(pNext);
        maintenance8(maintenance8);
        return this;
    }

    public VkPhysicalDeviceMaintenance8FeaturesKHR set(VkPhysicalDeviceMaintenance8FeaturesKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceMaintenance8FeaturesKHR malloc() {
        return new VkPhysicalDeviceMaintenance8FeaturesKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceMaintenance8FeaturesKHR calloc() {
        return new VkPhysicalDeviceMaintenance8FeaturesKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceMaintenance8FeaturesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceMaintenance8FeaturesKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceMaintenance8FeaturesKHR create(long address) {
        return new VkPhysicalDeviceMaintenance8FeaturesKHR(address, null);
    }

    public static VkPhysicalDeviceMaintenance8FeaturesKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceMaintenance8FeaturesKHR(address, null);
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

    public static VkPhysicalDeviceMaintenance8FeaturesKHR malloc(MemoryStack stack) {
        return new VkPhysicalDeviceMaintenance8FeaturesKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceMaintenance8FeaturesKHR calloc(MemoryStack stack) {
        return new VkPhysicalDeviceMaintenance8FeaturesKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nmaintenance8(long struct) {
        return MemoryUtil.memGetInt(struct + MAINTENANCE8);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nmaintenance8(long struct, int value) {
        MemoryUtil.memPutInt(struct + MAINTENANCE8, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceMaintenance8FeaturesKHR$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceMaintenance8FeaturesKHR, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceMaintenance8FeaturesKHR ELEMENT_FACTORY = VkPhysicalDeviceMaintenance8FeaturesKHR.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceMaintenance8FeaturesKHR.SIZEOF);
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
        public VkPhysicalDeviceMaintenance8FeaturesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceMaintenance8FeaturesKHR.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceMaintenance8FeaturesKHR.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean maintenance8() {
            return VkPhysicalDeviceMaintenance8FeaturesKHR.nmaintenance8(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceMaintenance8FeaturesKHR.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(KHRMaintenance8.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_8_FEATURES_KHR);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceMaintenance8FeaturesKHR.npNext(address(), value);
            return this;
        }

        public Buffer maintenance8(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceMaintenance8FeaturesKHR.nmaintenance8(address(), value ? 1 : 0);
            return this;
        }
    }
}
