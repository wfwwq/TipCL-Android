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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceShadingRateImageFeaturesNV.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceShadingRateImageFeaturesNV.class */
public class VkPhysicalDeviceShadingRateImageFeaturesNV extends Struct<VkPhysicalDeviceShadingRateImageFeaturesNV> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int SHADINGRATEIMAGE;
    public static final int SHADINGRATECOARSESAMPLEORDER;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SHADINGRATEIMAGE = layout.offsetof(2);
        SHADINGRATECOARSESAMPLEORDER = layout.offsetof(3);
    }

    protected VkPhysicalDeviceShadingRateImageFeaturesNV(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceShadingRateImageFeaturesNV create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceShadingRateImageFeaturesNV(address, container);
    }

    public VkPhysicalDeviceShadingRateImageFeaturesNV(ByteBuffer container) {
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
    public boolean shadingRateImage() {
        return nshadingRateImage(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean shadingRateCoarseSampleOrder() {
        return nshadingRateCoarseSampleOrder(address()) != 0;
    }

    public VkPhysicalDeviceShadingRateImageFeaturesNV sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceShadingRateImageFeaturesNV sType$Default() {
        return sType(NVShadingRateImage.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADING_RATE_IMAGE_FEATURES_NV);
    }

    public VkPhysicalDeviceShadingRateImageFeaturesNV pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceShadingRateImageFeaturesNV shadingRateImage(@NativeType("VkBool32") boolean value) {
        nshadingRateImage(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceShadingRateImageFeaturesNV shadingRateCoarseSampleOrder(@NativeType("VkBool32") boolean value) {
        nshadingRateCoarseSampleOrder(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceShadingRateImageFeaturesNV set(int sType, long pNext, boolean shadingRateImage, boolean shadingRateCoarseSampleOrder) {
        sType(sType);
        pNext(pNext);
        shadingRateImage(shadingRateImage);
        shadingRateCoarseSampleOrder(shadingRateCoarseSampleOrder);
        return this;
    }

    public VkPhysicalDeviceShadingRateImageFeaturesNV set(VkPhysicalDeviceShadingRateImageFeaturesNV src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceShadingRateImageFeaturesNV malloc() {
        return new VkPhysicalDeviceShadingRateImageFeaturesNV(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceShadingRateImageFeaturesNV calloc() {
        return new VkPhysicalDeviceShadingRateImageFeaturesNV(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceShadingRateImageFeaturesNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceShadingRateImageFeaturesNV(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceShadingRateImageFeaturesNV create(long address) {
        return new VkPhysicalDeviceShadingRateImageFeaturesNV(address, null);
    }

    public static VkPhysicalDeviceShadingRateImageFeaturesNV createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceShadingRateImageFeaturesNV(address, null);
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

    public static VkPhysicalDeviceShadingRateImageFeaturesNV malloc(MemoryStack stack) {
        return new VkPhysicalDeviceShadingRateImageFeaturesNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceShadingRateImageFeaturesNV calloc(MemoryStack stack) {
        return new VkPhysicalDeviceShadingRateImageFeaturesNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nshadingRateImage(long struct) {
        return MemoryUtil.memGetInt(struct + SHADINGRATEIMAGE);
    }

    public static int nshadingRateCoarseSampleOrder(long struct) {
        return MemoryUtil.memGetInt(struct + SHADINGRATECOARSESAMPLEORDER);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nshadingRateImage(long struct, int value) {
        MemoryUtil.memPutInt(struct + SHADINGRATEIMAGE, value);
    }

    public static void nshadingRateCoarseSampleOrder(long struct, int value) {
        MemoryUtil.memPutInt(struct + SHADINGRATECOARSESAMPLEORDER, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceShadingRateImageFeaturesNV$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceShadingRateImageFeaturesNV$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceShadingRateImageFeaturesNV, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceShadingRateImageFeaturesNV ELEMENT_FACTORY = VkPhysicalDeviceShadingRateImageFeaturesNV.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceShadingRateImageFeaturesNV.SIZEOF);
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
        public VkPhysicalDeviceShadingRateImageFeaturesNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceShadingRateImageFeaturesNV.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceShadingRateImageFeaturesNV.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean shadingRateImage() {
            return VkPhysicalDeviceShadingRateImageFeaturesNV.nshadingRateImage(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean shadingRateCoarseSampleOrder() {
            return VkPhysicalDeviceShadingRateImageFeaturesNV.nshadingRateCoarseSampleOrder(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceShadingRateImageFeaturesNV.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(NVShadingRateImage.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADING_RATE_IMAGE_FEATURES_NV);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceShadingRateImageFeaturesNV.npNext(address(), value);
            return this;
        }

        public Buffer shadingRateImage(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceShadingRateImageFeaturesNV.nshadingRateImage(address(), value ? 1 : 0);
            return this;
        }

        public Buffer shadingRateCoarseSampleOrder(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceShadingRateImageFeaturesNV.nshadingRateCoarseSampleOrder(address(), value ? 1 : 0);
            return this;
        }
    }
}
