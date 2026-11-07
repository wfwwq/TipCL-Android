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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceShadingRateImagePropertiesNV.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceShadingRateImagePropertiesNV.class */
public class VkPhysicalDeviceShadingRateImagePropertiesNV extends Struct<VkPhysicalDeviceShadingRateImagePropertiesNV> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int SHADINGRATETEXELSIZE;
    public static final int SHADINGRATEPALETTESIZE;
    public static final int SHADINGRATEMAXCOARSESAMPLES;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(VkExtent2D.SIZEOF, VkExtent2D.ALIGNOF), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SHADINGRATETEXELSIZE = layout.offsetof(2);
        SHADINGRATEPALETTESIZE = layout.offsetof(3);
        SHADINGRATEMAXCOARSESAMPLES = layout.offsetof(4);
    }

    protected VkPhysicalDeviceShadingRateImagePropertiesNV(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceShadingRateImagePropertiesNV create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceShadingRateImagePropertiesNV(address, container);
    }

    public VkPhysicalDeviceShadingRateImagePropertiesNV(ByteBuffer container) {
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

    public VkExtent2D shadingRateTexelSize() {
        return nshadingRateTexelSize(address());
    }

    @NativeType("uint32_t")
    public int shadingRatePaletteSize() {
        return nshadingRatePaletteSize(address());
    }

    @NativeType("uint32_t")
    public int shadingRateMaxCoarseSamples() {
        return nshadingRateMaxCoarseSamples(address());
    }

    public VkPhysicalDeviceShadingRateImagePropertiesNV sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceShadingRateImagePropertiesNV sType$Default() {
        return sType(NVShadingRateImage.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADING_RATE_IMAGE_PROPERTIES_NV);
    }

    public VkPhysicalDeviceShadingRateImagePropertiesNV pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceShadingRateImagePropertiesNV set(int sType, long pNext) {
        sType(sType);
        pNext(pNext);
        return this;
    }

    public VkPhysicalDeviceShadingRateImagePropertiesNV set(VkPhysicalDeviceShadingRateImagePropertiesNV src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceShadingRateImagePropertiesNV malloc() {
        return new VkPhysicalDeviceShadingRateImagePropertiesNV(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceShadingRateImagePropertiesNV calloc() {
        return new VkPhysicalDeviceShadingRateImagePropertiesNV(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceShadingRateImagePropertiesNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceShadingRateImagePropertiesNV(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceShadingRateImagePropertiesNV create(long address) {
        return new VkPhysicalDeviceShadingRateImagePropertiesNV(address, null);
    }

    public static VkPhysicalDeviceShadingRateImagePropertiesNV createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceShadingRateImagePropertiesNV(address, null);
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

    public static VkPhysicalDeviceShadingRateImagePropertiesNV malloc(MemoryStack stack) {
        return new VkPhysicalDeviceShadingRateImagePropertiesNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceShadingRateImagePropertiesNV calloc(MemoryStack stack) {
        return new VkPhysicalDeviceShadingRateImagePropertiesNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static VkExtent2D nshadingRateTexelSize(long struct) {
        return VkExtent2D.create(struct + SHADINGRATETEXELSIZE);
    }

    public static int nshadingRatePaletteSize(long struct) {
        return MemoryUtil.memGetInt(struct + SHADINGRATEPALETTESIZE);
    }

    public static int nshadingRateMaxCoarseSamples(long struct) {
        return MemoryUtil.memGetInt(struct + SHADINGRATEMAXCOARSESAMPLES);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceShadingRateImagePropertiesNV$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceShadingRateImagePropertiesNV$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceShadingRateImagePropertiesNV, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceShadingRateImagePropertiesNV ELEMENT_FACTORY = VkPhysicalDeviceShadingRateImagePropertiesNV.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceShadingRateImagePropertiesNV.SIZEOF);
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
        public VkPhysicalDeviceShadingRateImagePropertiesNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceShadingRateImagePropertiesNV.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceShadingRateImagePropertiesNV.npNext(address());
        }

        public VkExtent2D shadingRateTexelSize() {
            return VkPhysicalDeviceShadingRateImagePropertiesNV.nshadingRateTexelSize(address());
        }

        @NativeType("uint32_t")
        public int shadingRatePaletteSize() {
            return VkPhysicalDeviceShadingRateImagePropertiesNV.nshadingRatePaletteSize(address());
        }

        @NativeType("uint32_t")
        public int shadingRateMaxCoarseSamples() {
            return VkPhysicalDeviceShadingRateImagePropertiesNV.nshadingRateMaxCoarseSamples(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceShadingRateImagePropertiesNV.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(NVShadingRateImage.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADING_RATE_IMAGE_PROPERTIES_NV);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceShadingRateImagePropertiesNV.npNext(address(), value);
            return this;
        }
    }
}
