package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR.class */
public class VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR extends Struct<VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int UNIFIEDIMAGELAYOUTS;
    public static final int UNIFIEDIMAGELAYOUTSVIDEO;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        UNIFIEDIMAGELAYOUTS = layout.offsetof(2);
        UNIFIEDIMAGELAYOUTSVIDEO = layout.offsetof(3);
    }

    protected VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR(address, container);
    }

    public VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR(ByteBuffer container) {
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
    public boolean unifiedImageLayouts() {
        return nunifiedImageLayouts(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean unifiedImageLayoutsVideo() {
        return nunifiedImageLayoutsVideo(address()) != 0;
    }

    public VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR sType$Default() {
        return sType(KHRUnifiedImageLayouts.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_UNIFIED_IMAGE_LAYOUTS_FEATURES_KHR);
    }

    public VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR unifiedImageLayouts(@NativeType("VkBool32") boolean value) {
        nunifiedImageLayouts(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR unifiedImageLayoutsVideo(@NativeType("VkBool32") boolean value) {
        nunifiedImageLayoutsVideo(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR set(int sType, long pNext, boolean unifiedImageLayouts, boolean unifiedImageLayoutsVideo) {
        sType(sType);
        pNext(pNext);
        unifiedImageLayouts(unifiedImageLayouts);
        unifiedImageLayoutsVideo(unifiedImageLayoutsVideo);
        return this;
    }

    public VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR set(VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR malloc() {
        return new VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR calloc() {
        return new VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR create(long address) {
        return new VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR(address, null);
    }

    public static VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR(address, null);
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

    public static VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR malloc(MemoryStack stack) {
        return new VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR calloc(MemoryStack stack) {
        return new VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nunifiedImageLayouts(long struct) {
        return MemoryUtil.memGetInt(struct + UNIFIEDIMAGELAYOUTS);
    }

    public static int nunifiedImageLayoutsVideo(long struct) {
        return MemoryUtil.memGetInt(struct + UNIFIEDIMAGELAYOUTSVIDEO);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nunifiedImageLayouts(long struct, int value) {
        MemoryUtil.memPutInt(struct + UNIFIEDIMAGELAYOUTS, value);
    }

    public static void nunifiedImageLayoutsVideo(long struct, int value) {
        MemoryUtil.memPutInt(struct + UNIFIEDIMAGELAYOUTSVIDEO, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR ELEMENT_FACTORY = VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR.SIZEOF);
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
        public VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean unifiedImageLayouts() {
            return VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR.nunifiedImageLayouts(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean unifiedImageLayoutsVideo() {
            return VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR.nunifiedImageLayoutsVideo(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(KHRUnifiedImageLayouts.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_UNIFIED_IMAGE_LAYOUTS_FEATURES_KHR);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR.npNext(address(), value);
            return this;
        }

        public Buffer unifiedImageLayouts(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR.nunifiedImageLayouts(address(), value ? 1 : 0);
            return this;
        }

        public Buffer unifiedImageLayoutsVideo(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR.nunifiedImageLayoutsVideo(address(), value ? 1 : 0);
            return this;
        }
    }
}
