package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceVideoMaintenance2FeaturesKHR.class */
public class VkPhysicalDeviceVideoMaintenance2FeaturesKHR extends Struct<VkPhysicalDeviceVideoMaintenance2FeaturesKHR> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int VIDEOMAINTENANCE2;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        VIDEOMAINTENANCE2 = layout.offsetof(2);
    }

    protected VkPhysicalDeviceVideoMaintenance2FeaturesKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceVideoMaintenance2FeaturesKHR create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceVideoMaintenance2FeaturesKHR(address, container);
    }

    public VkPhysicalDeviceVideoMaintenance2FeaturesKHR(ByteBuffer container) {
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
    public boolean videoMaintenance2() {
        return nvideoMaintenance2(address()) != 0;
    }

    public VkPhysicalDeviceVideoMaintenance2FeaturesKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceVideoMaintenance2FeaturesKHR sType$Default() {
        return sType(KHRVideoMaintenance2.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VIDEO_MAINTENANCE_2_FEATURES_KHR);
    }

    public VkPhysicalDeviceVideoMaintenance2FeaturesKHR pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceVideoMaintenance2FeaturesKHR videoMaintenance2(@NativeType("VkBool32") boolean value) {
        nvideoMaintenance2(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceVideoMaintenance2FeaturesKHR set(int sType, long pNext, boolean videoMaintenance2) {
        sType(sType);
        pNext(pNext);
        videoMaintenance2(videoMaintenance2);
        return this;
    }

    public VkPhysicalDeviceVideoMaintenance2FeaturesKHR set(VkPhysicalDeviceVideoMaintenance2FeaturesKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceVideoMaintenance2FeaturesKHR malloc() {
        return new VkPhysicalDeviceVideoMaintenance2FeaturesKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceVideoMaintenance2FeaturesKHR calloc() {
        return new VkPhysicalDeviceVideoMaintenance2FeaturesKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceVideoMaintenance2FeaturesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceVideoMaintenance2FeaturesKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceVideoMaintenance2FeaturesKHR create(long address) {
        return new VkPhysicalDeviceVideoMaintenance2FeaturesKHR(address, null);
    }

    public static VkPhysicalDeviceVideoMaintenance2FeaturesKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceVideoMaintenance2FeaturesKHR(address, null);
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

    public static VkPhysicalDeviceVideoMaintenance2FeaturesKHR malloc(MemoryStack stack) {
        return new VkPhysicalDeviceVideoMaintenance2FeaturesKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceVideoMaintenance2FeaturesKHR calloc(MemoryStack stack) {
        return new VkPhysicalDeviceVideoMaintenance2FeaturesKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nvideoMaintenance2(long struct) {
        return MemoryUtil.memGetInt(struct + VIDEOMAINTENANCE2);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nvideoMaintenance2(long struct, int value) {
        MemoryUtil.memPutInt(struct + VIDEOMAINTENANCE2, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceVideoMaintenance2FeaturesKHR$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceVideoMaintenance2FeaturesKHR, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceVideoMaintenance2FeaturesKHR ELEMENT_FACTORY = VkPhysicalDeviceVideoMaintenance2FeaturesKHR.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceVideoMaintenance2FeaturesKHR.SIZEOF);
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
        public VkPhysicalDeviceVideoMaintenance2FeaturesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceVideoMaintenance2FeaturesKHR.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceVideoMaintenance2FeaturesKHR.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean videoMaintenance2() {
            return VkPhysicalDeviceVideoMaintenance2FeaturesKHR.nvideoMaintenance2(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceVideoMaintenance2FeaturesKHR.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(KHRVideoMaintenance2.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VIDEO_MAINTENANCE_2_FEATURES_KHR);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceVideoMaintenance2FeaturesKHR.npNext(address(), value);
            return this;
        }

        public Buffer videoMaintenance2(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceVideoMaintenance2FeaturesKHR.nvideoMaintenance2(address(), value ? 1 : 0);
            return this;
        }
    }
}
