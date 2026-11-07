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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.class */
public class VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT extends Struct<VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int SHADERBUFFERFLOAT16ATOMICS;
    public static final int SHADERBUFFERFLOAT16ATOMICADD;
    public static final int SHADERBUFFERFLOAT16ATOMICMINMAX;
    public static final int SHADERBUFFERFLOAT32ATOMICMINMAX;
    public static final int SHADERBUFFERFLOAT64ATOMICMINMAX;
    public static final int SHADERSHAREDFLOAT16ATOMICS;
    public static final int SHADERSHAREDFLOAT16ATOMICADD;
    public static final int SHADERSHAREDFLOAT16ATOMICMINMAX;
    public static final int SHADERSHAREDFLOAT32ATOMICMINMAX;
    public static final int SHADERSHAREDFLOAT64ATOMICMINMAX;
    public static final int SHADERIMAGEFLOAT32ATOMICMINMAX;
    public static final int SPARSEIMAGEFLOAT32ATOMICMINMAX;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SHADERBUFFERFLOAT16ATOMICS = layout.offsetof(2);
        SHADERBUFFERFLOAT16ATOMICADD = layout.offsetof(3);
        SHADERBUFFERFLOAT16ATOMICMINMAX = layout.offsetof(4);
        SHADERBUFFERFLOAT32ATOMICMINMAX = layout.offsetof(5);
        SHADERBUFFERFLOAT64ATOMICMINMAX = layout.offsetof(6);
        SHADERSHAREDFLOAT16ATOMICS = layout.offsetof(7);
        SHADERSHAREDFLOAT16ATOMICADD = layout.offsetof(8);
        SHADERSHAREDFLOAT16ATOMICMINMAX = layout.offsetof(9);
        SHADERSHAREDFLOAT32ATOMICMINMAX = layout.offsetof(10);
        SHADERSHAREDFLOAT64ATOMICMINMAX = layout.offsetof(11);
        SHADERIMAGEFLOAT32ATOMICMINMAX = layout.offsetof(12);
        SPARSEIMAGEFLOAT32ATOMICMINMAX = layout.offsetof(13);
    }

    protected VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT(address, container);
    }

    public VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT(ByteBuffer container) {
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
    public boolean shaderBufferFloat16Atomics() {
        return nshaderBufferFloat16Atomics(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean shaderBufferFloat16AtomicAdd() {
        return nshaderBufferFloat16AtomicAdd(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean shaderBufferFloat16AtomicMinMax() {
        return nshaderBufferFloat16AtomicMinMax(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean shaderBufferFloat32AtomicMinMax() {
        return nshaderBufferFloat32AtomicMinMax(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean shaderBufferFloat64AtomicMinMax() {
        return nshaderBufferFloat64AtomicMinMax(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean shaderSharedFloat16Atomics() {
        return nshaderSharedFloat16Atomics(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean shaderSharedFloat16AtomicAdd() {
        return nshaderSharedFloat16AtomicAdd(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean shaderSharedFloat16AtomicMinMax() {
        return nshaderSharedFloat16AtomicMinMax(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean shaderSharedFloat32AtomicMinMax() {
        return nshaderSharedFloat32AtomicMinMax(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean shaderSharedFloat64AtomicMinMax() {
        return nshaderSharedFloat64AtomicMinMax(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean shaderImageFloat32AtomicMinMax() {
        return nshaderImageFloat32AtomicMinMax(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean sparseImageFloat32AtomicMinMax() {
        return nsparseImageFloat32AtomicMinMax(address()) != 0;
    }

    public VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT sType$Default() {
        return sType(EXTShaderAtomicFloat2.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_ATOMIC_FLOAT_2_FEATURES_EXT);
    }

    public VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT shaderBufferFloat16Atomics(@NativeType("VkBool32") boolean value) {
        nshaderBufferFloat16Atomics(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT shaderBufferFloat16AtomicAdd(@NativeType("VkBool32") boolean value) {
        nshaderBufferFloat16AtomicAdd(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT shaderBufferFloat16AtomicMinMax(@NativeType("VkBool32") boolean value) {
        nshaderBufferFloat16AtomicMinMax(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT shaderBufferFloat32AtomicMinMax(@NativeType("VkBool32") boolean value) {
        nshaderBufferFloat32AtomicMinMax(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT shaderBufferFloat64AtomicMinMax(@NativeType("VkBool32") boolean value) {
        nshaderBufferFloat64AtomicMinMax(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT shaderSharedFloat16Atomics(@NativeType("VkBool32") boolean value) {
        nshaderSharedFloat16Atomics(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT shaderSharedFloat16AtomicAdd(@NativeType("VkBool32") boolean value) {
        nshaderSharedFloat16AtomicAdd(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT shaderSharedFloat16AtomicMinMax(@NativeType("VkBool32") boolean value) {
        nshaderSharedFloat16AtomicMinMax(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT shaderSharedFloat32AtomicMinMax(@NativeType("VkBool32") boolean value) {
        nshaderSharedFloat32AtomicMinMax(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT shaderSharedFloat64AtomicMinMax(@NativeType("VkBool32") boolean value) {
        nshaderSharedFloat64AtomicMinMax(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT shaderImageFloat32AtomicMinMax(@NativeType("VkBool32") boolean value) {
        nshaderImageFloat32AtomicMinMax(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT sparseImageFloat32AtomicMinMax(@NativeType("VkBool32") boolean value) {
        nsparseImageFloat32AtomicMinMax(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT set(int sType, long pNext, boolean shaderBufferFloat16Atomics, boolean shaderBufferFloat16AtomicAdd, boolean shaderBufferFloat16AtomicMinMax, boolean shaderBufferFloat32AtomicMinMax, boolean shaderBufferFloat64AtomicMinMax, boolean shaderSharedFloat16Atomics, boolean shaderSharedFloat16AtomicAdd, boolean shaderSharedFloat16AtomicMinMax, boolean shaderSharedFloat32AtomicMinMax, boolean shaderSharedFloat64AtomicMinMax, boolean shaderImageFloat32AtomicMinMax, boolean sparseImageFloat32AtomicMinMax) {
        sType(sType);
        pNext(pNext);
        shaderBufferFloat16Atomics(shaderBufferFloat16Atomics);
        shaderBufferFloat16AtomicAdd(shaderBufferFloat16AtomicAdd);
        shaderBufferFloat16AtomicMinMax(shaderBufferFloat16AtomicMinMax);
        shaderBufferFloat32AtomicMinMax(shaderBufferFloat32AtomicMinMax);
        shaderBufferFloat64AtomicMinMax(shaderBufferFloat64AtomicMinMax);
        shaderSharedFloat16Atomics(shaderSharedFloat16Atomics);
        shaderSharedFloat16AtomicAdd(shaderSharedFloat16AtomicAdd);
        shaderSharedFloat16AtomicMinMax(shaderSharedFloat16AtomicMinMax);
        shaderSharedFloat32AtomicMinMax(shaderSharedFloat32AtomicMinMax);
        shaderSharedFloat64AtomicMinMax(shaderSharedFloat64AtomicMinMax);
        shaderImageFloat32AtomicMinMax(shaderImageFloat32AtomicMinMax);
        sparseImageFloat32AtomicMinMax(sparseImageFloat32AtomicMinMax);
        return this;
    }

    public VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT set(VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT malloc() {
        return new VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT calloc() {
        return new VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT create(long address) {
        return new VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT(address, null);
    }

    public static VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT(address, null);
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

    public static VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT malloc(MemoryStack stack) {
        return new VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT calloc(MemoryStack stack) {
        return new VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nshaderBufferFloat16Atomics(long struct) {
        return MemoryUtil.memGetInt(struct + SHADERBUFFERFLOAT16ATOMICS);
    }

    public static int nshaderBufferFloat16AtomicAdd(long struct) {
        return MemoryUtil.memGetInt(struct + SHADERBUFFERFLOAT16ATOMICADD);
    }

    public static int nshaderBufferFloat16AtomicMinMax(long struct) {
        return MemoryUtil.memGetInt(struct + SHADERBUFFERFLOAT16ATOMICMINMAX);
    }

    public static int nshaderBufferFloat32AtomicMinMax(long struct) {
        return MemoryUtil.memGetInt(struct + SHADERBUFFERFLOAT32ATOMICMINMAX);
    }

    public static int nshaderBufferFloat64AtomicMinMax(long struct) {
        return MemoryUtil.memGetInt(struct + SHADERBUFFERFLOAT64ATOMICMINMAX);
    }

    public static int nshaderSharedFloat16Atomics(long struct) {
        return MemoryUtil.memGetInt(struct + SHADERSHAREDFLOAT16ATOMICS);
    }

    public static int nshaderSharedFloat16AtomicAdd(long struct) {
        return MemoryUtil.memGetInt(struct + SHADERSHAREDFLOAT16ATOMICADD);
    }

    public static int nshaderSharedFloat16AtomicMinMax(long struct) {
        return MemoryUtil.memGetInt(struct + SHADERSHAREDFLOAT16ATOMICMINMAX);
    }

    public static int nshaderSharedFloat32AtomicMinMax(long struct) {
        return MemoryUtil.memGetInt(struct + SHADERSHAREDFLOAT32ATOMICMINMAX);
    }

    public static int nshaderSharedFloat64AtomicMinMax(long struct) {
        return MemoryUtil.memGetInt(struct + SHADERSHAREDFLOAT64ATOMICMINMAX);
    }

    public static int nshaderImageFloat32AtomicMinMax(long struct) {
        return MemoryUtil.memGetInt(struct + SHADERIMAGEFLOAT32ATOMICMINMAX);
    }

    public static int nsparseImageFloat32AtomicMinMax(long struct) {
        return MemoryUtil.memGetInt(struct + SPARSEIMAGEFLOAT32ATOMICMINMAX);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nshaderBufferFloat16Atomics(long struct, int value) {
        MemoryUtil.memPutInt(struct + SHADERBUFFERFLOAT16ATOMICS, value);
    }

    public static void nshaderBufferFloat16AtomicAdd(long struct, int value) {
        MemoryUtil.memPutInt(struct + SHADERBUFFERFLOAT16ATOMICADD, value);
    }

    public static void nshaderBufferFloat16AtomicMinMax(long struct, int value) {
        MemoryUtil.memPutInt(struct + SHADERBUFFERFLOAT16ATOMICMINMAX, value);
    }

    public static void nshaderBufferFloat32AtomicMinMax(long struct, int value) {
        MemoryUtil.memPutInt(struct + SHADERBUFFERFLOAT32ATOMICMINMAX, value);
    }

    public static void nshaderBufferFloat64AtomicMinMax(long struct, int value) {
        MemoryUtil.memPutInt(struct + SHADERBUFFERFLOAT64ATOMICMINMAX, value);
    }

    public static void nshaderSharedFloat16Atomics(long struct, int value) {
        MemoryUtil.memPutInt(struct + SHADERSHAREDFLOAT16ATOMICS, value);
    }

    public static void nshaderSharedFloat16AtomicAdd(long struct, int value) {
        MemoryUtil.memPutInt(struct + SHADERSHAREDFLOAT16ATOMICADD, value);
    }

    public static void nshaderSharedFloat16AtomicMinMax(long struct, int value) {
        MemoryUtil.memPutInt(struct + SHADERSHAREDFLOAT16ATOMICMINMAX, value);
    }

    public static void nshaderSharedFloat32AtomicMinMax(long struct, int value) {
        MemoryUtil.memPutInt(struct + SHADERSHAREDFLOAT32ATOMICMINMAX, value);
    }

    public static void nshaderSharedFloat64AtomicMinMax(long struct, int value) {
        MemoryUtil.memPutInt(struct + SHADERSHAREDFLOAT64ATOMICMINMAX, value);
    }

    public static void nshaderImageFloat32AtomicMinMax(long struct, int value) {
        MemoryUtil.memPutInt(struct + SHADERIMAGEFLOAT32ATOMICMINMAX, value);
    }

    public static void nsparseImageFloat32AtomicMinMax(long struct, int value) {
        MemoryUtil.memPutInt(struct + SPARSEIMAGEFLOAT32ATOMICMINMAX, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT ELEMENT_FACTORY = VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.SIZEOF);
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
        public VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean shaderBufferFloat16Atomics() {
            return VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.nshaderBufferFloat16Atomics(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean shaderBufferFloat16AtomicAdd() {
            return VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.nshaderBufferFloat16AtomicAdd(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean shaderBufferFloat16AtomicMinMax() {
            return VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.nshaderBufferFloat16AtomicMinMax(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean shaderBufferFloat32AtomicMinMax() {
            return VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.nshaderBufferFloat32AtomicMinMax(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean shaderBufferFloat64AtomicMinMax() {
            return VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.nshaderBufferFloat64AtomicMinMax(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean shaderSharedFloat16Atomics() {
            return VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.nshaderSharedFloat16Atomics(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean shaderSharedFloat16AtomicAdd() {
            return VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.nshaderSharedFloat16AtomicAdd(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean shaderSharedFloat16AtomicMinMax() {
            return VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.nshaderSharedFloat16AtomicMinMax(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean shaderSharedFloat32AtomicMinMax() {
            return VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.nshaderSharedFloat32AtomicMinMax(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean shaderSharedFloat64AtomicMinMax() {
            return VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.nshaderSharedFloat64AtomicMinMax(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean shaderImageFloat32AtomicMinMax() {
            return VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.nshaderImageFloat32AtomicMinMax(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean sparseImageFloat32AtomicMinMax() {
            return VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.nsparseImageFloat32AtomicMinMax(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(EXTShaderAtomicFloat2.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_ATOMIC_FLOAT_2_FEATURES_EXT);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.npNext(address(), value);
            return this;
        }

        public Buffer shaderBufferFloat16Atomics(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.nshaderBufferFloat16Atomics(address(), value ? 1 : 0);
            return this;
        }

        public Buffer shaderBufferFloat16AtomicAdd(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.nshaderBufferFloat16AtomicAdd(address(), value ? 1 : 0);
            return this;
        }

        public Buffer shaderBufferFloat16AtomicMinMax(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.nshaderBufferFloat16AtomicMinMax(address(), value ? 1 : 0);
            return this;
        }

        public Buffer shaderBufferFloat32AtomicMinMax(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.nshaderBufferFloat32AtomicMinMax(address(), value ? 1 : 0);
            return this;
        }

        public Buffer shaderBufferFloat64AtomicMinMax(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.nshaderBufferFloat64AtomicMinMax(address(), value ? 1 : 0);
            return this;
        }

        public Buffer shaderSharedFloat16Atomics(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.nshaderSharedFloat16Atomics(address(), value ? 1 : 0);
            return this;
        }

        public Buffer shaderSharedFloat16AtomicAdd(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.nshaderSharedFloat16AtomicAdd(address(), value ? 1 : 0);
            return this;
        }

        public Buffer shaderSharedFloat16AtomicMinMax(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.nshaderSharedFloat16AtomicMinMax(address(), value ? 1 : 0);
            return this;
        }

        public Buffer shaderSharedFloat32AtomicMinMax(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.nshaderSharedFloat32AtomicMinMax(address(), value ? 1 : 0);
            return this;
        }

        public Buffer shaderSharedFloat64AtomicMinMax(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.nshaderSharedFloat64AtomicMinMax(address(), value ? 1 : 0);
            return this;
        }

        public Buffer shaderImageFloat32AtomicMinMax(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.nshaderImageFloat32AtomicMinMax(address(), value ? 1 : 0);
            return this;
        }

        public Buffer sparseImageFloat32AtomicMinMax(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT.nsparseImageFloat32AtomicMinMax(address(), value ? 1 : 0);
            return this;
        }
    }
}
