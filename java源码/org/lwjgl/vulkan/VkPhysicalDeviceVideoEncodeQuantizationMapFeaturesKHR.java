package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceVideoEncodeQuantizationMapFeaturesKHR.class */
public class VkPhysicalDeviceVideoEncodeQuantizationMapFeaturesKHR extends Struct<VkPhysicalDeviceVideoEncodeQuantizationMapFeaturesKHR> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int VIDEOENCODEQUANTIZATIONMAP;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        VIDEOENCODEQUANTIZATIONMAP = layout.offsetof(2);
    }

    protected VkPhysicalDeviceVideoEncodeQuantizationMapFeaturesKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceVideoEncodeQuantizationMapFeaturesKHR create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceVideoEncodeQuantizationMapFeaturesKHR(address, container);
    }

    public VkPhysicalDeviceVideoEncodeQuantizationMapFeaturesKHR(ByteBuffer container) {
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
    public boolean videoEncodeQuantizationMap() {
        return nvideoEncodeQuantizationMap(address()) != 0;
    }

    public VkPhysicalDeviceVideoEncodeQuantizationMapFeaturesKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceVideoEncodeQuantizationMapFeaturesKHR sType$Default() {
        return sType(KHRVideoEncodeQuantizationMap.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VIDEO_ENCODE_QUANTIZATION_MAP_FEATURES_KHR);
    }

    public VkPhysicalDeviceVideoEncodeQuantizationMapFeaturesKHR pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceVideoEncodeQuantizationMapFeaturesKHR videoEncodeQuantizationMap(@NativeType("VkBool32") boolean value) {
        nvideoEncodeQuantizationMap(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceVideoEncodeQuantizationMapFeaturesKHR set(int sType, long pNext, boolean videoEncodeQuantizationMap) {
        sType(sType);
        pNext(pNext);
        videoEncodeQuantizationMap(videoEncodeQuantizationMap);
        return this;
    }

    public VkPhysicalDeviceVideoEncodeQuantizationMapFeaturesKHR set(VkPhysicalDeviceVideoEncodeQuantizationMapFeaturesKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceVideoEncodeQuantizationMapFeaturesKHR malloc() {
        return new VkPhysicalDeviceVideoEncodeQuantizationMapFeaturesKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceVideoEncodeQuantizationMapFeaturesKHR calloc() {
        return new VkPhysicalDeviceVideoEncodeQuantizationMapFeaturesKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceVideoEncodeQuantizationMapFeaturesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceVideoEncodeQuantizationMapFeaturesKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceVideoEncodeQuantizationMapFeaturesKHR create(long address) {
        return new VkPhysicalDeviceVideoEncodeQuantizationMapFeaturesKHR(address, null);
    }

    public static VkPhysicalDeviceVideoEncodeQuantizationMapFeaturesKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceVideoEncodeQuantizationMapFeaturesKHR(address, null);
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

    public static VkPhysicalDeviceVideoEncodeQuantizationMapFeaturesKHR malloc(MemoryStack stack) {
        return new VkPhysicalDeviceVideoEncodeQuantizationMapFeaturesKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceVideoEncodeQuantizationMapFeaturesKHR calloc(MemoryStack stack) {
        return new VkPhysicalDeviceVideoEncodeQuantizationMapFeaturesKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nvideoEncodeQuantizationMap(long struct) {
        return MemoryUtil.memGetInt(struct + VIDEOENCODEQUANTIZATIONMAP);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nvideoEncodeQuantizationMap(long struct, int value) {
        MemoryUtil.memPutInt(struct + VIDEOENCODEQUANTIZATIONMAP, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceVideoEncodeQuantizationMapFeaturesKHR$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceVideoEncodeQuantizationMapFeaturesKHR, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceVideoEncodeQuantizationMapFeaturesKHR ELEMENT_FACTORY = VkPhysicalDeviceVideoEncodeQuantizationMapFeaturesKHR.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceVideoEncodeQuantizationMapFeaturesKHR.SIZEOF);
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
        public VkPhysicalDeviceVideoEncodeQuantizationMapFeaturesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceVideoEncodeQuantizationMapFeaturesKHR.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceVideoEncodeQuantizationMapFeaturesKHR.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean videoEncodeQuantizationMap() {
            return VkPhysicalDeviceVideoEncodeQuantizationMapFeaturesKHR.nvideoEncodeQuantizationMap(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceVideoEncodeQuantizationMapFeaturesKHR.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(KHRVideoEncodeQuantizationMap.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VIDEO_ENCODE_QUANTIZATION_MAP_FEATURES_KHR);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceVideoEncodeQuantizationMapFeaturesKHR.npNext(address(), value);
            return this;
        }

        public Buffer videoEncodeQuantizationMap(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceVideoEncodeQuantizationMapFeaturesKHR.nvideoEncodeQuantizationMap(address(), value ? 1 : 0);
            return this;
        }
    }
}
