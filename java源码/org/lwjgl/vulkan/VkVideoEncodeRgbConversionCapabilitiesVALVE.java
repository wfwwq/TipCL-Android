package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoEncodeRgbConversionCapabilitiesVALVE.class */
public class VkVideoEncodeRgbConversionCapabilitiesVALVE extends Struct<VkVideoEncodeRgbConversionCapabilitiesVALVE> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int RGBMODELS;
    public static final int RGBRANGES;
    public static final int XCHROMAOFFSETS;
    public static final int YCHROMAOFFSETS;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        RGBMODELS = layout.offsetof(2);
        RGBRANGES = layout.offsetof(3);
        XCHROMAOFFSETS = layout.offsetof(4);
        YCHROMAOFFSETS = layout.offsetof(5);
    }

    protected VkVideoEncodeRgbConversionCapabilitiesVALVE(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkVideoEncodeRgbConversionCapabilitiesVALVE create(long address, ByteBuffer container) {
        return new VkVideoEncodeRgbConversionCapabilitiesVALVE(address, container);
    }

    public VkVideoEncodeRgbConversionCapabilitiesVALVE(ByteBuffer container) {
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

    @NativeType("VkVideoEncodeRgbModelConversionFlagsVALVE")
    public int rgbModels() {
        return nrgbModels(address());
    }

    @NativeType("VkVideoEncodeRgbRangeCompressionFlagsVALVE")
    public int rgbRanges() {
        return nrgbRanges(address());
    }

    @NativeType("VkVideoEncodeRgbChromaOffsetFlagsVALVE")
    public int xChromaOffsets() {
        return nxChromaOffsets(address());
    }

    @NativeType("VkVideoEncodeRgbChromaOffsetFlagsVALVE")
    public int yChromaOffsets() {
        return nyChromaOffsets(address());
    }

    public VkVideoEncodeRgbConversionCapabilitiesVALVE sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkVideoEncodeRgbConversionCapabilitiesVALVE sType$Default() {
        return sType(VALVEVideoEncodeRgbConversion.VK_STRUCTURE_TYPE_VIDEO_ENCODE_RGB_CONVERSION_CAPABILITIES_VALVE);
    }

    public VkVideoEncodeRgbConversionCapabilitiesVALVE pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkVideoEncodeRgbConversionCapabilitiesVALVE set(int sType, long pNext) {
        sType(sType);
        pNext(pNext);
        return this;
    }

    public VkVideoEncodeRgbConversionCapabilitiesVALVE set(VkVideoEncodeRgbConversionCapabilitiesVALVE src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkVideoEncodeRgbConversionCapabilitiesVALVE malloc() {
        return new VkVideoEncodeRgbConversionCapabilitiesVALVE(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkVideoEncodeRgbConversionCapabilitiesVALVE calloc() {
        return new VkVideoEncodeRgbConversionCapabilitiesVALVE(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkVideoEncodeRgbConversionCapabilitiesVALVE create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkVideoEncodeRgbConversionCapabilitiesVALVE(MemoryUtil.memAddress(container), container);
    }

    public static VkVideoEncodeRgbConversionCapabilitiesVALVE create(long address) {
        return new VkVideoEncodeRgbConversionCapabilitiesVALVE(address, null);
    }

    public static VkVideoEncodeRgbConversionCapabilitiesVALVE createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkVideoEncodeRgbConversionCapabilitiesVALVE(address, null);
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

    public static VkVideoEncodeRgbConversionCapabilitiesVALVE malloc(MemoryStack stack) {
        return new VkVideoEncodeRgbConversionCapabilitiesVALVE(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkVideoEncodeRgbConversionCapabilitiesVALVE calloc(MemoryStack stack) {
        return new VkVideoEncodeRgbConversionCapabilitiesVALVE(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nrgbModels(long struct) {
        return MemoryUtil.memGetInt(struct + RGBMODELS);
    }

    public static int nrgbRanges(long struct) {
        return MemoryUtil.memGetInt(struct + RGBRANGES);
    }

    public static int nxChromaOffsets(long struct) {
        return MemoryUtil.memGetInt(struct + XCHROMAOFFSETS);
    }

    public static int nyChromaOffsets(long struct) {
        return MemoryUtil.memGetInt(struct + YCHROMAOFFSETS);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoEncodeRgbConversionCapabilitiesVALVE$Buffer.class */
    public static class Buffer extends StructBuffer<VkVideoEncodeRgbConversionCapabilitiesVALVE, Buffer> implements NativeResource {
        private static final VkVideoEncodeRgbConversionCapabilitiesVALVE ELEMENT_FACTORY = VkVideoEncodeRgbConversionCapabilitiesVALVE.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkVideoEncodeRgbConversionCapabilitiesVALVE.SIZEOF);
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
        public VkVideoEncodeRgbConversionCapabilitiesVALVE getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkVideoEncodeRgbConversionCapabilitiesVALVE.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkVideoEncodeRgbConversionCapabilitiesVALVE.npNext(address());
        }

        @NativeType("VkVideoEncodeRgbModelConversionFlagsVALVE")
        public int rgbModels() {
            return VkVideoEncodeRgbConversionCapabilitiesVALVE.nrgbModels(address());
        }

        @NativeType("VkVideoEncodeRgbRangeCompressionFlagsVALVE")
        public int rgbRanges() {
            return VkVideoEncodeRgbConversionCapabilitiesVALVE.nrgbRanges(address());
        }

        @NativeType("VkVideoEncodeRgbChromaOffsetFlagsVALVE")
        public int xChromaOffsets() {
            return VkVideoEncodeRgbConversionCapabilitiesVALVE.nxChromaOffsets(address());
        }

        @NativeType("VkVideoEncodeRgbChromaOffsetFlagsVALVE")
        public int yChromaOffsets() {
            return VkVideoEncodeRgbConversionCapabilitiesVALVE.nyChromaOffsets(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkVideoEncodeRgbConversionCapabilitiesVALVE.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(VALVEVideoEncodeRgbConversion.VK_STRUCTURE_TYPE_VIDEO_ENCODE_RGB_CONVERSION_CAPABILITIES_VALVE);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkVideoEncodeRgbConversionCapabilitiesVALVE.npNext(address(), value);
            return this;
        }
    }
}
