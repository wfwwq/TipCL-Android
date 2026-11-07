package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceVideoEncodeAV1FeaturesKHR.class */
public class VkPhysicalDeviceVideoEncodeAV1FeaturesKHR extends Struct<VkPhysicalDeviceVideoEncodeAV1FeaturesKHR> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int VIDEOENCODEAV1;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        VIDEOENCODEAV1 = layout.offsetof(2);
    }

    protected VkPhysicalDeviceVideoEncodeAV1FeaturesKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceVideoEncodeAV1FeaturesKHR create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceVideoEncodeAV1FeaturesKHR(address, container);
    }

    public VkPhysicalDeviceVideoEncodeAV1FeaturesKHR(ByteBuffer container) {
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
    public boolean videoEncodeAV1() {
        return nvideoEncodeAV1(address()) != 0;
    }

    public VkPhysicalDeviceVideoEncodeAV1FeaturesKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceVideoEncodeAV1FeaturesKHR sType$Default() {
        return sType(KHRVideoEncodeAV1.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VIDEO_ENCODE_AV1_FEATURES_KHR);
    }

    public VkPhysicalDeviceVideoEncodeAV1FeaturesKHR pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceVideoEncodeAV1FeaturesKHR videoEncodeAV1(@NativeType("VkBool32") boolean value) {
        nvideoEncodeAV1(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceVideoEncodeAV1FeaturesKHR set(int sType, long pNext, boolean videoEncodeAV1) {
        sType(sType);
        pNext(pNext);
        videoEncodeAV1(videoEncodeAV1);
        return this;
    }

    public VkPhysicalDeviceVideoEncodeAV1FeaturesKHR set(VkPhysicalDeviceVideoEncodeAV1FeaturesKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceVideoEncodeAV1FeaturesKHR malloc() {
        return new VkPhysicalDeviceVideoEncodeAV1FeaturesKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceVideoEncodeAV1FeaturesKHR calloc() {
        return new VkPhysicalDeviceVideoEncodeAV1FeaturesKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceVideoEncodeAV1FeaturesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceVideoEncodeAV1FeaturesKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceVideoEncodeAV1FeaturesKHR create(long address) {
        return new VkPhysicalDeviceVideoEncodeAV1FeaturesKHR(address, null);
    }

    public static VkPhysicalDeviceVideoEncodeAV1FeaturesKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceVideoEncodeAV1FeaturesKHR(address, null);
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

    public static VkPhysicalDeviceVideoEncodeAV1FeaturesKHR malloc(MemoryStack stack) {
        return new VkPhysicalDeviceVideoEncodeAV1FeaturesKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceVideoEncodeAV1FeaturesKHR calloc(MemoryStack stack) {
        return new VkPhysicalDeviceVideoEncodeAV1FeaturesKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nvideoEncodeAV1(long struct) {
        return MemoryUtil.memGetInt(struct + VIDEOENCODEAV1);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nvideoEncodeAV1(long struct, int value) {
        MemoryUtil.memPutInt(struct + VIDEOENCODEAV1, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceVideoEncodeAV1FeaturesKHR$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceVideoEncodeAV1FeaturesKHR, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceVideoEncodeAV1FeaturesKHR ELEMENT_FACTORY = VkPhysicalDeviceVideoEncodeAV1FeaturesKHR.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceVideoEncodeAV1FeaturesKHR.SIZEOF);
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
        public VkPhysicalDeviceVideoEncodeAV1FeaturesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceVideoEncodeAV1FeaturesKHR.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceVideoEncodeAV1FeaturesKHR.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean videoEncodeAV1() {
            return VkPhysicalDeviceVideoEncodeAV1FeaturesKHR.nvideoEncodeAV1(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceVideoEncodeAV1FeaturesKHR.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(KHRVideoEncodeAV1.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VIDEO_ENCODE_AV1_FEATURES_KHR);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceVideoEncodeAV1FeaturesKHR.npNext(address(), value);
            return this;
        }

        public Buffer videoEncodeAV1(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceVideoEncodeAV1FeaturesKHR.nvideoEncodeAV1(address(), value ? 1 : 0);
            return this;
        }
    }
}
