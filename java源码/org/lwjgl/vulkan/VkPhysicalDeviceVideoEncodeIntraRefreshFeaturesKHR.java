package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceVideoEncodeIntraRefreshFeaturesKHR.class */
public class VkPhysicalDeviceVideoEncodeIntraRefreshFeaturesKHR extends Struct<VkPhysicalDeviceVideoEncodeIntraRefreshFeaturesKHR> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int VIDEOENCODEINTRAREFRESH;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        VIDEOENCODEINTRAREFRESH = layout.offsetof(2);
    }

    protected VkPhysicalDeviceVideoEncodeIntraRefreshFeaturesKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceVideoEncodeIntraRefreshFeaturesKHR create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceVideoEncodeIntraRefreshFeaturesKHR(address, container);
    }

    public VkPhysicalDeviceVideoEncodeIntraRefreshFeaturesKHR(ByteBuffer container) {
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
    public boolean videoEncodeIntraRefresh() {
        return nvideoEncodeIntraRefresh(address()) != 0;
    }

    public VkPhysicalDeviceVideoEncodeIntraRefreshFeaturesKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceVideoEncodeIntraRefreshFeaturesKHR sType$Default() {
        return sType(KHRVideoEncodeIntraRefresh.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VIDEO_ENCODE_INTRA_REFRESH_FEATURES_KHR);
    }

    public VkPhysicalDeviceVideoEncodeIntraRefreshFeaturesKHR pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceVideoEncodeIntraRefreshFeaturesKHR videoEncodeIntraRefresh(@NativeType("VkBool32") boolean value) {
        nvideoEncodeIntraRefresh(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceVideoEncodeIntraRefreshFeaturesKHR set(int sType, long pNext, boolean videoEncodeIntraRefresh) {
        sType(sType);
        pNext(pNext);
        videoEncodeIntraRefresh(videoEncodeIntraRefresh);
        return this;
    }

    public VkPhysicalDeviceVideoEncodeIntraRefreshFeaturesKHR set(VkPhysicalDeviceVideoEncodeIntraRefreshFeaturesKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceVideoEncodeIntraRefreshFeaturesKHR malloc() {
        return new VkPhysicalDeviceVideoEncodeIntraRefreshFeaturesKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceVideoEncodeIntraRefreshFeaturesKHR calloc() {
        return new VkPhysicalDeviceVideoEncodeIntraRefreshFeaturesKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceVideoEncodeIntraRefreshFeaturesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceVideoEncodeIntraRefreshFeaturesKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceVideoEncodeIntraRefreshFeaturesKHR create(long address) {
        return new VkPhysicalDeviceVideoEncodeIntraRefreshFeaturesKHR(address, null);
    }

    public static VkPhysicalDeviceVideoEncodeIntraRefreshFeaturesKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceVideoEncodeIntraRefreshFeaturesKHR(address, null);
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

    public static VkPhysicalDeviceVideoEncodeIntraRefreshFeaturesKHR malloc(MemoryStack stack) {
        return new VkPhysicalDeviceVideoEncodeIntraRefreshFeaturesKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceVideoEncodeIntraRefreshFeaturesKHR calloc(MemoryStack stack) {
        return new VkPhysicalDeviceVideoEncodeIntraRefreshFeaturesKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nvideoEncodeIntraRefresh(long struct) {
        return MemoryUtil.memGetInt(struct + VIDEOENCODEINTRAREFRESH);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nvideoEncodeIntraRefresh(long struct, int value) {
        MemoryUtil.memPutInt(struct + VIDEOENCODEINTRAREFRESH, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceVideoEncodeIntraRefreshFeaturesKHR$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceVideoEncodeIntraRefreshFeaturesKHR, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceVideoEncodeIntraRefreshFeaturesKHR ELEMENT_FACTORY = VkPhysicalDeviceVideoEncodeIntraRefreshFeaturesKHR.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceVideoEncodeIntraRefreshFeaturesKHR.SIZEOF);
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
        public VkPhysicalDeviceVideoEncodeIntraRefreshFeaturesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceVideoEncodeIntraRefreshFeaturesKHR.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceVideoEncodeIntraRefreshFeaturesKHR.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean videoEncodeIntraRefresh() {
            return VkPhysicalDeviceVideoEncodeIntraRefreshFeaturesKHR.nvideoEncodeIntraRefresh(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceVideoEncodeIntraRefreshFeaturesKHR.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(KHRVideoEncodeIntraRefresh.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VIDEO_ENCODE_INTRA_REFRESH_FEATURES_KHR);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceVideoEncodeIntraRefreshFeaturesKHR.npNext(address(), value);
            return this;
        }

        public Buffer videoEncodeIntraRefresh(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceVideoEncodeIntraRefreshFeaturesKHR.nvideoEncodeIntraRefresh(address(), value ? 1 : 0);
            return this;
        }
    }
}
