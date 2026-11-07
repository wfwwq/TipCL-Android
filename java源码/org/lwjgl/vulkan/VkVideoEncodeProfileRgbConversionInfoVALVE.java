package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoEncodeProfileRgbConversionInfoVALVE.class */
public class VkVideoEncodeProfileRgbConversionInfoVALVE extends Struct<VkVideoEncodeProfileRgbConversionInfoVALVE> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int PERFORMENCODERGBCONVERSION;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        PERFORMENCODERGBCONVERSION = layout.offsetof(2);
    }

    protected VkVideoEncodeProfileRgbConversionInfoVALVE(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkVideoEncodeProfileRgbConversionInfoVALVE create(long address, ByteBuffer container) {
        return new VkVideoEncodeProfileRgbConversionInfoVALVE(address, container);
    }

    public VkVideoEncodeProfileRgbConversionInfoVALVE(ByteBuffer container) {
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

    @NativeType("VkBool32")
    public boolean performEncodeRgbConversion() {
        return nperformEncodeRgbConversion(address()) != 0;
    }

    public VkVideoEncodeProfileRgbConversionInfoVALVE sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkVideoEncodeProfileRgbConversionInfoVALVE sType$Default() {
        return sType(VALVEVideoEncodeRgbConversion.VK_STRUCTURE_TYPE_VIDEO_ENCODE_PROFILE_RGB_CONVERSION_INFO_VALVE);
    }

    public VkVideoEncodeProfileRgbConversionInfoVALVE pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkVideoEncodeProfileRgbConversionInfoVALVE performEncodeRgbConversion(@NativeType("VkBool32") boolean value) {
        nperformEncodeRgbConversion(address(), value ? 1 : 0);
        return this;
    }

    public VkVideoEncodeProfileRgbConversionInfoVALVE set(int sType, long pNext, boolean performEncodeRgbConversion) {
        sType(sType);
        pNext(pNext);
        performEncodeRgbConversion(performEncodeRgbConversion);
        return this;
    }

    public VkVideoEncodeProfileRgbConversionInfoVALVE set(VkVideoEncodeProfileRgbConversionInfoVALVE src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkVideoEncodeProfileRgbConversionInfoVALVE malloc() {
        return new VkVideoEncodeProfileRgbConversionInfoVALVE(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkVideoEncodeProfileRgbConversionInfoVALVE calloc() {
        return new VkVideoEncodeProfileRgbConversionInfoVALVE(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkVideoEncodeProfileRgbConversionInfoVALVE create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkVideoEncodeProfileRgbConversionInfoVALVE(MemoryUtil.memAddress(container), container);
    }

    public static VkVideoEncodeProfileRgbConversionInfoVALVE create(long address) {
        return new VkVideoEncodeProfileRgbConversionInfoVALVE(address, null);
    }

    public static VkVideoEncodeProfileRgbConversionInfoVALVE createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkVideoEncodeProfileRgbConversionInfoVALVE(address, null);
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

    public static VkVideoEncodeProfileRgbConversionInfoVALVE malloc(MemoryStack stack) {
        return new VkVideoEncodeProfileRgbConversionInfoVALVE(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkVideoEncodeProfileRgbConversionInfoVALVE calloc(MemoryStack stack) {
        return new VkVideoEncodeProfileRgbConversionInfoVALVE(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nperformEncodeRgbConversion(long struct) {
        return MemoryUtil.memGetInt(struct + PERFORMENCODERGBCONVERSION);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nperformEncodeRgbConversion(long struct, int value) {
        MemoryUtil.memPutInt(struct + PERFORMENCODERGBCONVERSION, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoEncodeProfileRgbConversionInfoVALVE$Buffer.class */
    public static class Buffer extends StructBuffer<VkVideoEncodeProfileRgbConversionInfoVALVE, Buffer> implements NativeResource {
        private static final VkVideoEncodeProfileRgbConversionInfoVALVE ELEMENT_FACTORY = VkVideoEncodeProfileRgbConversionInfoVALVE.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkVideoEncodeProfileRgbConversionInfoVALVE.SIZEOF);
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
        public VkVideoEncodeProfileRgbConversionInfoVALVE getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkVideoEncodeProfileRgbConversionInfoVALVE.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkVideoEncodeProfileRgbConversionInfoVALVE.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean performEncodeRgbConversion() {
            return VkVideoEncodeProfileRgbConversionInfoVALVE.nperformEncodeRgbConversion(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkVideoEncodeProfileRgbConversionInfoVALVE.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(VALVEVideoEncodeRgbConversion.VK_STRUCTURE_TYPE_VIDEO_ENCODE_PROFILE_RGB_CONVERSION_INFO_VALVE);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkVideoEncodeProfileRgbConversionInfoVALVE.npNext(address(), value);
            return this;
        }

        public Buffer performEncodeRgbConversion(@NativeType("VkBool32") boolean value) {
            VkVideoEncodeProfileRgbConversionInfoVALVE.nperformEncodeRgbConversion(address(), value ? 1 : 0);
            return this;
        }
    }
}
