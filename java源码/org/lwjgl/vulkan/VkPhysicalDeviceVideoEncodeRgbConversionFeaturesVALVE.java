package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceVideoEncodeRgbConversionFeaturesVALVE.class */
public class VkPhysicalDeviceVideoEncodeRgbConversionFeaturesVALVE extends Struct<VkPhysicalDeviceVideoEncodeRgbConversionFeaturesVALVE> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int VIDEOENCODERGBCONVERSION;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        VIDEOENCODERGBCONVERSION = layout.offsetof(2);
    }

    protected VkPhysicalDeviceVideoEncodeRgbConversionFeaturesVALVE(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceVideoEncodeRgbConversionFeaturesVALVE create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceVideoEncodeRgbConversionFeaturesVALVE(address, container);
    }

    public VkPhysicalDeviceVideoEncodeRgbConversionFeaturesVALVE(ByteBuffer container) {
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
    public boolean videoEncodeRgbConversion() {
        return nvideoEncodeRgbConversion(address()) != 0;
    }

    public VkPhysicalDeviceVideoEncodeRgbConversionFeaturesVALVE sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceVideoEncodeRgbConversionFeaturesVALVE sType$Default() {
        return sType(VALVEVideoEncodeRgbConversion.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VIDEO_ENCODE_RGB_CONVERSION_FEATURES_VALVE);
    }

    public VkPhysicalDeviceVideoEncodeRgbConversionFeaturesVALVE pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceVideoEncodeRgbConversionFeaturesVALVE videoEncodeRgbConversion(@NativeType("VkBool32") boolean value) {
        nvideoEncodeRgbConversion(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceVideoEncodeRgbConversionFeaturesVALVE set(int sType, long pNext, boolean videoEncodeRgbConversion) {
        sType(sType);
        pNext(pNext);
        videoEncodeRgbConversion(videoEncodeRgbConversion);
        return this;
    }

    public VkPhysicalDeviceVideoEncodeRgbConversionFeaturesVALVE set(VkPhysicalDeviceVideoEncodeRgbConversionFeaturesVALVE src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceVideoEncodeRgbConversionFeaturesVALVE malloc() {
        return new VkPhysicalDeviceVideoEncodeRgbConversionFeaturesVALVE(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceVideoEncodeRgbConversionFeaturesVALVE calloc() {
        return new VkPhysicalDeviceVideoEncodeRgbConversionFeaturesVALVE(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceVideoEncodeRgbConversionFeaturesVALVE create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceVideoEncodeRgbConversionFeaturesVALVE(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceVideoEncodeRgbConversionFeaturesVALVE create(long address) {
        return new VkPhysicalDeviceVideoEncodeRgbConversionFeaturesVALVE(address, null);
    }

    public static VkPhysicalDeviceVideoEncodeRgbConversionFeaturesVALVE createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceVideoEncodeRgbConversionFeaturesVALVE(address, null);
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

    public static VkPhysicalDeviceVideoEncodeRgbConversionFeaturesVALVE malloc(MemoryStack stack) {
        return new VkPhysicalDeviceVideoEncodeRgbConversionFeaturesVALVE(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceVideoEncodeRgbConversionFeaturesVALVE calloc(MemoryStack stack) {
        return new VkPhysicalDeviceVideoEncodeRgbConversionFeaturesVALVE(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nvideoEncodeRgbConversion(long struct) {
        return MemoryUtil.memGetInt(struct + VIDEOENCODERGBCONVERSION);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nvideoEncodeRgbConversion(long struct, int value) {
        MemoryUtil.memPutInt(struct + VIDEOENCODERGBCONVERSION, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceVideoEncodeRgbConversionFeaturesVALVE$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceVideoEncodeRgbConversionFeaturesVALVE, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceVideoEncodeRgbConversionFeaturesVALVE ELEMENT_FACTORY = VkPhysicalDeviceVideoEncodeRgbConversionFeaturesVALVE.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceVideoEncodeRgbConversionFeaturesVALVE.SIZEOF);
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
        public VkPhysicalDeviceVideoEncodeRgbConversionFeaturesVALVE getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceVideoEncodeRgbConversionFeaturesVALVE.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceVideoEncodeRgbConversionFeaturesVALVE.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean videoEncodeRgbConversion() {
            return VkPhysicalDeviceVideoEncodeRgbConversionFeaturesVALVE.nvideoEncodeRgbConversion(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceVideoEncodeRgbConversionFeaturesVALVE.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(VALVEVideoEncodeRgbConversion.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VIDEO_ENCODE_RGB_CONVERSION_FEATURES_VALVE);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceVideoEncodeRgbConversionFeaturesVALVE.npNext(address(), value);
            return this;
        }

        public Buffer videoEncodeRgbConversion(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceVideoEncodeRgbConversionFeaturesVALVE.nvideoEncodeRgbConversion(address(), value ? 1 : 0);
            return this;
        }
    }
}
