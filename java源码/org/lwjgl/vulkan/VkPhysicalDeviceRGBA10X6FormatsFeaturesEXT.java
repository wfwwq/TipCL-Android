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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT.class */
public class VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT extends Struct<VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int FORMATRGBA10X6WITHOUTYCBCRSAMPLER;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FORMATRGBA10X6WITHOUTYCBCRSAMPLER = layout.offsetof(2);
    }

    protected VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT(address, container);
    }

    public VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT(ByteBuffer container) {
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
    public boolean formatRgba10x6WithoutYCbCrSampler() {
        return nformatRgba10x6WithoutYCbCrSampler(address()) != 0;
    }

    public VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT sType$Default() {
        return sType(EXTRgba10x6Formats.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_RGBA10X6_FORMATS_FEATURES_EXT);
    }

    public VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT formatRgba10x6WithoutYCbCrSampler(@NativeType("VkBool32") boolean value) {
        nformatRgba10x6WithoutYCbCrSampler(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT set(int sType, long pNext, boolean formatRgba10x6WithoutYCbCrSampler) {
        sType(sType);
        pNext(pNext);
        formatRgba10x6WithoutYCbCrSampler(formatRgba10x6WithoutYCbCrSampler);
        return this;
    }

    public VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT set(VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT malloc() {
        return new VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT calloc() {
        return new VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT create(long address) {
        return new VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT(address, null);
    }

    public static VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT(address, null);
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

    public static VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT malloc(MemoryStack stack) {
        return new VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT calloc(MemoryStack stack) {
        return new VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nformatRgba10x6WithoutYCbCrSampler(long struct) {
        return MemoryUtil.memGetInt(struct + FORMATRGBA10X6WITHOUTYCBCRSAMPLER);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nformatRgba10x6WithoutYCbCrSampler(long struct, int value) {
        MemoryUtil.memPutInt(struct + FORMATRGBA10X6WITHOUTYCBCRSAMPLER, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT ELEMENT_FACTORY = VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT.SIZEOF);
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
        public VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean formatRgba10x6WithoutYCbCrSampler() {
            return VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT.nformatRgba10x6WithoutYCbCrSampler(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(EXTRgba10x6Formats.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_RGBA10X6_FORMATS_FEATURES_EXT);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT.npNext(address(), value);
            return this;
        }

        public Buffer formatRgba10x6WithoutYCbCrSampler(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT.nformatRgba10x6WithoutYCbCrSampler(address(), value ? 1 : 0);
            return this;
        }
    }
}
