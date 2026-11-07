package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoEncodeSessionRgbConversionCreateInfoVALVE.class */
public class VkVideoEncodeSessionRgbConversionCreateInfoVALVE extends Struct<VkVideoEncodeSessionRgbConversionCreateInfoVALVE> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int RGBMODEL;
    public static final int RGBRANGE;
    public static final int XCHROMAOFFSET;
    public static final int YCHROMAOFFSET;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        RGBMODEL = layout.offsetof(2);
        RGBRANGE = layout.offsetof(3);
        XCHROMAOFFSET = layout.offsetof(4);
        YCHROMAOFFSET = layout.offsetof(5);
    }

    protected VkVideoEncodeSessionRgbConversionCreateInfoVALVE(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkVideoEncodeSessionRgbConversionCreateInfoVALVE create(long address, ByteBuffer container) {
        return new VkVideoEncodeSessionRgbConversionCreateInfoVALVE(address, container);
    }

    public VkVideoEncodeSessionRgbConversionCreateInfoVALVE(ByteBuffer container) {
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

    @NativeType("void const *")
    public long pNext() {
        return npNext(address());
    }

    @NativeType("VkVideoEncodeRgbModelConversionFlagBitsVALVE")
    public int rgbModel() {
        return nrgbModel(address());
    }

    @NativeType("VkVideoEncodeRgbRangeCompressionFlagBitsVALVE")
    public int rgbRange() {
        return nrgbRange(address());
    }

    @NativeType("VkVideoEncodeRgbChromaOffsetFlagBitsVALVE")
    public int xChromaOffset() {
        return nxChromaOffset(address());
    }

    @NativeType("VkVideoEncodeRgbChromaOffsetFlagBitsVALVE")
    public int yChromaOffset() {
        return nyChromaOffset(address());
    }

    public VkVideoEncodeSessionRgbConversionCreateInfoVALVE sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkVideoEncodeSessionRgbConversionCreateInfoVALVE sType$Default() {
        return sType(VALVEVideoEncodeRgbConversion.VK_STRUCTURE_TYPE_VIDEO_ENCODE_SESSION_RGB_CONVERSION_CREATE_INFO_VALVE);
    }

    public VkVideoEncodeSessionRgbConversionCreateInfoVALVE pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkVideoEncodeSessionRgbConversionCreateInfoVALVE rgbModel(@NativeType("VkVideoEncodeRgbModelConversionFlagBitsVALVE") int value) {
        nrgbModel(address(), value);
        return this;
    }

    public VkVideoEncodeSessionRgbConversionCreateInfoVALVE rgbRange(@NativeType("VkVideoEncodeRgbRangeCompressionFlagBitsVALVE") int value) {
        nrgbRange(address(), value);
        return this;
    }

    public VkVideoEncodeSessionRgbConversionCreateInfoVALVE xChromaOffset(@NativeType("VkVideoEncodeRgbChromaOffsetFlagBitsVALVE") int value) {
        nxChromaOffset(address(), value);
        return this;
    }

    public VkVideoEncodeSessionRgbConversionCreateInfoVALVE yChromaOffset(@NativeType("VkVideoEncodeRgbChromaOffsetFlagBitsVALVE") int value) {
        nyChromaOffset(address(), value);
        return this;
    }

    public VkVideoEncodeSessionRgbConversionCreateInfoVALVE set(int sType, long pNext, int rgbModel, int rgbRange, int xChromaOffset, int yChromaOffset) {
        sType(sType);
        pNext(pNext);
        rgbModel(rgbModel);
        rgbRange(rgbRange);
        xChromaOffset(xChromaOffset);
        yChromaOffset(yChromaOffset);
        return this;
    }

    public VkVideoEncodeSessionRgbConversionCreateInfoVALVE set(VkVideoEncodeSessionRgbConversionCreateInfoVALVE src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkVideoEncodeSessionRgbConversionCreateInfoVALVE malloc() {
        return new VkVideoEncodeSessionRgbConversionCreateInfoVALVE(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkVideoEncodeSessionRgbConversionCreateInfoVALVE calloc() {
        return new VkVideoEncodeSessionRgbConversionCreateInfoVALVE(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkVideoEncodeSessionRgbConversionCreateInfoVALVE create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkVideoEncodeSessionRgbConversionCreateInfoVALVE(MemoryUtil.memAddress(container), container);
    }

    public static VkVideoEncodeSessionRgbConversionCreateInfoVALVE create(long address) {
        return new VkVideoEncodeSessionRgbConversionCreateInfoVALVE(address, null);
    }

    public static VkVideoEncodeSessionRgbConversionCreateInfoVALVE createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkVideoEncodeSessionRgbConversionCreateInfoVALVE(address, null);
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

    public static VkVideoEncodeSessionRgbConversionCreateInfoVALVE malloc(MemoryStack stack) {
        return new VkVideoEncodeSessionRgbConversionCreateInfoVALVE(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkVideoEncodeSessionRgbConversionCreateInfoVALVE calloc(MemoryStack stack) {
        return new VkVideoEncodeSessionRgbConversionCreateInfoVALVE(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nrgbModel(long struct) {
        return MemoryUtil.memGetInt(struct + RGBMODEL);
    }

    public static int nrgbRange(long struct) {
        return MemoryUtil.memGetInt(struct + RGBRANGE);
    }

    public static int nxChromaOffset(long struct) {
        return MemoryUtil.memGetInt(struct + XCHROMAOFFSET);
    }

    public static int nyChromaOffset(long struct) {
        return MemoryUtil.memGetInt(struct + YCHROMAOFFSET);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nrgbModel(long struct, int value) {
        MemoryUtil.memPutInt(struct + RGBMODEL, value);
    }

    public static void nrgbRange(long struct, int value) {
        MemoryUtil.memPutInt(struct + RGBRANGE, value);
    }

    public static void nxChromaOffset(long struct, int value) {
        MemoryUtil.memPutInt(struct + XCHROMAOFFSET, value);
    }

    public static void nyChromaOffset(long struct, int value) {
        MemoryUtil.memPutInt(struct + YCHROMAOFFSET, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoEncodeSessionRgbConversionCreateInfoVALVE$Buffer.class */
    public static class Buffer extends StructBuffer<VkVideoEncodeSessionRgbConversionCreateInfoVALVE, Buffer> implements NativeResource {
        private static final VkVideoEncodeSessionRgbConversionCreateInfoVALVE ELEMENT_FACTORY = VkVideoEncodeSessionRgbConversionCreateInfoVALVE.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkVideoEncodeSessionRgbConversionCreateInfoVALVE.SIZEOF);
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
        public VkVideoEncodeSessionRgbConversionCreateInfoVALVE getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkVideoEncodeSessionRgbConversionCreateInfoVALVE.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkVideoEncodeSessionRgbConversionCreateInfoVALVE.npNext(address());
        }

        @NativeType("VkVideoEncodeRgbModelConversionFlagBitsVALVE")
        public int rgbModel() {
            return VkVideoEncodeSessionRgbConversionCreateInfoVALVE.nrgbModel(address());
        }

        @NativeType("VkVideoEncodeRgbRangeCompressionFlagBitsVALVE")
        public int rgbRange() {
            return VkVideoEncodeSessionRgbConversionCreateInfoVALVE.nrgbRange(address());
        }

        @NativeType("VkVideoEncodeRgbChromaOffsetFlagBitsVALVE")
        public int xChromaOffset() {
            return VkVideoEncodeSessionRgbConversionCreateInfoVALVE.nxChromaOffset(address());
        }

        @NativeType("VkVideoEncodeRgbChromaOffsetFlagBitsVALVE")
        public int yChromaOffset() {
            return VkVideoEncodeSessionRgbConversionCreateInfoVALVE.nyChromaOffset(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkVideoEncodeSessionRgbConversionCreateInfoVALVE.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(VALVEVideoEncodeRgbConversion.VK_STRUCTURE_TYPE_VIDEO_ENCODE_SESSION_RGB_CONVERSION_CREATE_INFO_VALVE);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkVideoEncodeSessionRgbConversionCreateInfoVALVE.npNext(address(), value);
            return this;
        }

        public Buffer rgbModel(@NativeType("VkVideoEncodeRgbModelConversionFlagBitsVALVE") int value) {
            VkVideoEncodeSessionRgbConversionCreateInfoVALVE.nrgbModel(address(), value);
            return this;
        }

        public Buffer rgbRange(@NativeType("VkVideoEncodeRgbRangeCompressionFlagBitsVALVE") int value) {
            VkVideoEncodeSessionRgbConversionCreateInfoVALVE.nrgbRange(address(), value);
            return this;
        }

        public Buffer xChromaOffset(@NativeType("VkVideoEncodeRgbChromaOffsetFlagBitsVALVE") int value) {
            VkVideoEncodeSessionRgbConversionCreateInfoVALVE.nxChromaOffset(address(), value);
            return this;
        }

        public Buffer yChromaOffset(@NativeType("VkVideoEncodeRgbChromaOffsetFlagBitsVALVE") int value) {
            VkVideoEncodeSessionRgbConversionCreateInfoVALVE.nyChromaOffset(address(), value);
            return this;
        }
    }
}
