package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV.class */
public class VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV extends Struct<VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int SHADERFLOAT16VECTORATOMICS;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SHADERFLOAT16VECTORATOMICS = layout.offsetof(2);
    }

    protected VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV(address, container);
    }

    public VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV(ByteBuffer container) {
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
    public boolean shaderFloat16VectorAtomics() {
        return nshaderFloat16VectorAtomics(address()) != 0;
    }

    public VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV sType$Default() {
        return sType(NVShaderAtomicFloat16Vector.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_ATOMIC_FLOAT16_VECTOR_FEATURES_NV);
    }

    public VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV shaderFloat16VectorAtomics(@NativeType("VkBool32") boolean value) {
        nshaderFloat16VectorAtomics(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV set(int sType, long pNext, boolean shaderFloat16VectorAtomics) {
        sType(sType);
        pNext(pNext);
        shaderFloat16VectorAtomics(shaderFloat16VectorAtomics);
        return this;
    }

    public VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV set(VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV malloc() {
        return new VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV calloc() {
        return new VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV create(long address) {
        return new VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV(address, null);
    }

    public static VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV(address, null);
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

    public static VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV malloc(MemoryStack stack) {
        return new VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV calloc(MemoryStack stack) {
        return new VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nshaderFloat16VectorAtomics(long struct) {
        return MemoryUtil.memGetInt(struct + SHADERFLOAT16VECTORATOMICS);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nshaderFloat16VectorAtomics(long struct, int value) {
        MemoryUtil.memPutInt(struct + SHADERFLOAT16VECTORATOMICS, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV ELEMENT_FACTORY = VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV.SIZEOF);
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
        public VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean shaderFloat16VectorAtomics() {
            return VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV.nshaderFloat16VectorAtomics(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(NVShaderAtomicFloat16Vector.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_ATOMIC_FLOAT16_VECTOR_FEATURES_NV);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV.npNext(address(), value);
            return this;
        }

        public Buffer shaderFloat16VectorAtomics(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceShaderAtomicFloat16VectorFeaturesNV.nshaderFloat16VectorAtomics(address(), value ? 1 : 0);
            return this;
        }
    }
}
