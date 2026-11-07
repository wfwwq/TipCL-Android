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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM.class */
public class VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM extends Struct<VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int ENABLEYDEGAMMA;
    public static final int ENABLECBCRDEGAMMA;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        ENABLEYDEGAMMA = layout.offsetof(2);
        ENABLECBCRDEGAMMA = layout.offsetof(3);
    }

    protected VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM create(long address, ByteBuffer container) {
        return new VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM(address, container);
    }

    public VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM(ByteBuffer container) {
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
    public boolean enableYDegamma() {
        return nenableYDegamma(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean enableCbCrDegamma() {
        return nenableCbCrDegamma(address()) != 0;
    }

    public VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM sType$Default() {
        return sType(QCOMYcbcrDegamma.VK_STRUCTURE_TYPE_SAMPLER_YCBCR_CONVERSION_YCBCR_DEGAMMA_CREATE_INFO_QCOM);
    }

    public VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM enableYDegamma(@NativeType("VkBool32") boolean value) {
        nenableYDegamma(address(), value ? 1 : 0);
        return this;
    }

    public VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM enableCbCrDegamma(@NativeType("VkBool32") boolean value) {
        nenableCbCrDegamma(address(), value ? 1 : 0);
        return this;
    }

    public VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM set(int sType, long pNext, boolean enableYDegamma, boolean enableCbCrDegamma) {
        sType(sType);
        pNext(pNext);
        enableYDegamma(enableYDegamma);
        enableCbCrDegamma(enableCbCrDegamma);
        return this;
    }

    public VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM set(VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM malloc() {
        return new VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM calloc() {
        return new VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM(MemoryUtil.memAddress(container), container);
    }

    public static VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM create(long address) {
        return new VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM(address, null);
    }

    public static VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM(address, null);
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

    public static VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM malloc(MemoryStack stack) {
        return new VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM calloc(MemoryStack stack) {
        return new VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nenableYDegamma(long struct) {
        return MemoryUtil.memGetInt(struct + ENABLEYDEGAMMA);
    }

    public static int nenableCbCrDegamma(long struct) {
        return MemoryUtil.memGetInt(struct + ENABLECBCRDEGAMMA);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nenableYDegamma(long struct, int value) {
        MemoryUtil.memPutInt(struct + ENABLEYDEGAMMA, value);
    }

    public static void nenableCbCrDegamma(long struct, int value) {
        MemoryUtil.memPutInt(struct + ENABLECBCRDEGAMMA, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM$Buffer.class */
    public static class Buffer extends StructBuffer<VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM, Buffer> implements NativeResource {
        private static final VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM ELEMENT_FACTORY = VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM.SIZEOF);
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
        public VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean enableYDegamma() {
            return VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM.nenableYDegamma(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean enableCbCrDegamma() {
            return VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM.nenableCbCrDegamma(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(QCOMYcbcrDegamma.VK_STRUCTURE_TYPE_SAMPLER_YCBCR_CONVERSION_YCBCR_DEGAMMA_CREATE_INFO_QCOM);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM.npNext(address(), value);
            return this;
        }

        public Buffer enableYDegamma(@NativeType("VkBool32") boolean value) {
            VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM.nenableYDegamma(address(), value ? 1 : 0);
            return this;
        }

        public Buffer enableCbCrDegamma(@NativeType("VkBool32") boolean value) {
            VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM.nenableCbCrDegamma(address(), value ? 1 : 0);
            return this;
        }
    }
}
