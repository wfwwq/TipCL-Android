package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceShaderBfloat16FeaturesKHR.class */
public class VkPhysicalDeviceShaderBfloat16FeaturesKHR extends Struct<VkPhysicalDeviceShaderBfloat16FeaturesKHR> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int SHADERBFLOAT16TYPE;
    public static final int SHADERBFLOAT16DOTPRODUCT;
    public static final int SHADERBFLOAT16COOPERATIVEMATRIX;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SHADERBFLOAT16TYPE = layout.offsetof(2);
        SHADERBFLOAT16DOTPRODUCT = layout.offsetof(3);
        SHADERBFLOAT16COOPERATIVEMATRIX = layout.offsetof(4);
    }

    protected VkPhysicalDeviceShaderBfloat16FeaturesKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceShaderBfloat16FeaturesKHR create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceShaderBfloat16FeaturesKHR(address, container);
    }

    public VkPhysicalDeviceShaderBfloat16FeaturesKHR(ByteBuffer container) {
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
    public boolean shaderBFloat16Type() {
        return nshaderBFloat16Type(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean shaderBFloat16DotProduct() {
        return nshaderBFloat16DotProduct(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean shaderBFloat16CooperativeMatrix() {
        return nshaderBFloat16CooperativeMatrix(address()) != 0;
    }

    public VkPhysicalDeviceShaderBfloat16FeaturesKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceShaderBfloat16FeaturesKHR sType$Default() {
        return sType(1000141000);
    }

    public VkPhysicalDeviceShaderBfloat16FeaturesKHR pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceShaderBfloat16FeaturesKHR shaderBFloat16Type(@NativeType("VkBool32") boolean value) {
        nshaderBFloat16Type(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceShaderBfloat16FeaturesKHR shaderBFloat16DotProduct(@NativeType("VkBool32") boolean value) {
        nshaderBFloat16DotProduct(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceShaderBfloat16FeaturesKHR shaderBFloat16CooperativeMatrix(@NativeType("VkBool32") boolean value) {
        nshaderBFloat16CooperativeMatrix(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceShaderBfloat16FeaturesKHR set(int sType, long pNext, boolean shaderBFloat16Type, boolean shaderBFloat16DotProduct, boolean shaderBFloat16CooperativeMatrix) {
        sType(sType);
        pNext(pNext);
        shaderBFloat16Type(shaderBFloat16Type);
        shaderBFloat16DotProduct(shaderBFloat16DotProduct);
        shaderBFloat16CooperativeMatrix(shaderBFloat16CooperativeMatrix);
        return this;
    }

    public VkPhysicalDeviceShaderBfloat16FeaturesKHR set(VkPhysicalDeviceShaderBfloat16FeaturesKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceShaderBfloat16FeaturesKHR malloc() {
        return new VkPhysicalDeviceShaderBfloat16FeaturesKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceShaderBfloat16FeaturesKHR calloc() {
        return new VkPhysicalDeviceShaderBfloat16FeaturesKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceShaderBfloat16FeaturesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceShaderBfloat16FeaturesKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceShaderBfloat16FeaturesKHR create(long address) {
        return new VkPhysicalDeviceShaderBfloat16FeaturesKHR(address, null);
    }

    public static VkPhysicalDeviceShaderBfloat16FeaturesKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceShaderBfloat16FeaturesKHR(address, null);
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

    public static VkPhysicalDeviceShaderBfloat16FeaturesKHR malloc(MemoryStack stack) {
        return new VkPhysicalDeviceShaderBfloat16FeaturesKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceShaderBfloat16FeaturesKHR calloc(MemoryStack stack) {
        return new VkPhysicalDeviceShaderBfloat16FeaturesKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nshaderBFloat16Type(long struct) {
        return MemoryUtil.memGetInt(struct + SHADERBFLOAT16TYPE);
    }

    public static int nshaderBFloat16DotProduct(long struct) {
        return MemoryUtil.memGetInt(struct + SHADERBFLOAT16DOTPRODUCT);
    }

    public static int nshaderBFloat16CooperativeMatrix(long struct) {
        return MemoryUtil.memGetInt(struct + SHADERBFLOAT16COOPERATIVEMATRIX);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nshaderBFloat16Type(long struct, int value) {
        MemoryUtil.memPutInt(struct + SHADERBFLOAT16TYPE, value);
    }

    public static void nshaderBFloat16DotProduct(long struct, int value) {
        MemoryUtil.memPutInt(struct + SHADERBFLOAT16DOTPRODUCT, value);
    }

    public static void nshaderBFloat16CooperativeMatrix(long struct, int value) {
        MemoryUtil.memPutInt(struct + SHADERBFLOAT16COOPERATIVEMATRIX, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceShaderBfloat16FeaturesKHR$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceShaderBfloat16FeaturesKHR, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceShaderBfloat16FeaturesKHR ELEMENT_FACTORY = VkPhysicalDeviceShaderBfloat16FeaturesKHR.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceShaderBfloat16FeaturesKHR.SIZEOF);
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
        public VkPhysicalDeviceShaderBfloat16FeaturesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceShaderBfloat16FeaturesKHR.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceShaderBfloat16FeaturesKHR.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean shaderBFloat16Type() {
            return VkPhysicalDeviceShaderBfloat16FeaturesKHR.nshaderBFloat16Type(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean shaderBFloat16DotProduct() {
            return VkPhysicalDeviceShaderBfloat16FeaturesKHR.nshaderBFloat16DotProduct(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean shaderBFloat16CooperativeMatrix() {
            return VkPhysicalDeviceShaderBfloat16FeaturesKHR.nshaderBFloat16CooperativeMatrix(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceShaderBfloat16FeaturesKHR.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000141000);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceShaderBfloat16FeaturesKHR.npNext(address(), value);
            return this;
        }

        public Buffer shaderBFloat16Type(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceShaderBfloat16FeaturesKHR.nshaderBFloat16Type(address(), value ? 1 : 0);
            return this;
        }

        public Buffer shaderBFloat16DotProduct(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceShaderBfloat16FeaturesKHR.nshaderBFloat16DotProduct(address(), value ? 1 : 0);
            return this;
        }

        public Buffer shaderBFloat16CooperativeMatrix(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceShaderBfloat16FeaturesKHR.nshaderBFloat16CooperativeMatrix(address(), value ? 1 : 0);
            return this;
        }
    }
}
