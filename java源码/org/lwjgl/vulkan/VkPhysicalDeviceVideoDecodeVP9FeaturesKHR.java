package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceVideoDecodeVP9FeaturesKHR.class */
public class VkPhysicalDeviceVideoDecodeVP9FeaturesKHR extends Struct<VkPhysicalDeviceVideoDecodeVP9FeaturesKHR> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int VIDEODECODEVP9;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        VIDEODECODEVP9 = layout.offsetof(2);
    }

    protected VkPhysicalDeviceVideoDecodeVP9FeaturesKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceVideoDecodeVP9FeaturesKHR create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceVideoDecodeVP9FeaturesKHR(address, container);
    }

    public VkPhysicalDeviceVideoDecodeVP9FeaturesKHR(ByteBuffer container) {
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
    public boolean videoDecodeVP9() {
        return nvideoDecodeVP9(address()) != 0;
    }

    public VkPhysicalDeviceVideoDecodeVP9FeaturesKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceVideoDecodeVP9FeaturesKHR sType$Default() {
        return sType(KHRVideoDecodeVP9.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VIDEO_DECODE_VP9_FEATURES_KHR);
    }

    public VkPhysicalDeviceVideoDecodeVP9FeaturesKHR pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceVideoDecodeVP9FeaturesKHR videoDecodeVP9(@NativeType("VkBool32") boolean value) {
        nvideoDecodeVP9(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceVideoDecodeVP9FeaturesKHR set(int sType, long pNext, boolean videoDecodeVP9) {
        sType(sType);
        pNext(pNext);
        videoDecodeVP9(videoDecodeVP9);
        return this;
    }

    public VkPhysicalDeviceVideoDecodeVP9FeaturesKHR set(VkPhysicalDeviceVideoDecodeVP9FeaturesKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceVideoDecodeVP9FeaturesKHR malloc() {
        return new VkPhysicalDeviceVideoDecodeVP9FeaturesKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceVideoDecodeVP9FeaturesKHR calloc() {
        return new VkPhysicalDeviceVideoDecodeVP9FeaturesKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceVideoDecodeVP9FeaturesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceVideoDecodeVP9FeaturesKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceVideoDecodeVP9FeaturesKHR create(long address) {
        return new VkPhysicalDeviceVideoDecodeVP9FeaturesKHR(address, null);
    }

    public static VkPhysicalDeviceVideoDecodeVP9FeaturesKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceVideoDecodeVP9FeaturesKHR(address, null);
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

    public static VkPhysicalDeviceVideoDecodeVP9FeaturesKHR malloc(MemoryStack stack) {
        return new VkPhysicalDeviceVideoDecodeVP9FeaturesKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceVideoDecodeVP9FeaturesKHR calloc(MemoryStack stack) {
        return new VkPhysicalDeviceVideoDecodeVP9FeaturesKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nvideoDecodeVP9(long struct) {
        return MemoryUtil.memGetInt(struct + VIDEODECODEVP9);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nvideoDecodeVP9(long struct, int value) {
        MemoryUtil.memPutInt(struct + VIDEODECODEVP9, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceVideoDecodeVP9FeaturesKHR$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceVideoDecodeVP9FeaturesKHR, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceVideoDecodeVP9FeaturesKHR ELEMENT_FACTORY = VkPhysicalDeviceVideoDecodeVP9FeaturesKHR.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceVideoDecodeVP9FeaturesKHR.SIZEOF);
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
        public VkPhysicalDeviceVideoDecodeVP9FeaturesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceVideoDecodeVP9FeaturesKHR.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceVideoDecodeVP9FeaturesKHR.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean videoDecodeVP9() {
            return VkPhysicalDeviceVideoDecodeVP9FeaturesKHR.nvideoDecodeVP9(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceVideoDecodeVP9FeaturesKHR.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(KHRVideoDecodeVP9.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VIDEO_DECODE_VP9_FEATURES_KHR);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceVideoDecodeVP9FeaturesKHR.npNext(address(), value);
            return this;
        }

        public Buffer videoDecodeVP9(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceVideoDecodeVP9FeaturesKHR.nvideoDecodeVP9(address(), value ? 1 : 0);
            return this;
        }
    }
}
