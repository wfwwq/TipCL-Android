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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceShaderAtomicFloatFeaturesEXT.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceShaderAtomicFloatFeaturesEXT.class */
public class VkPhysicalDeviceShaderAtomicFloatFeaturesEXT extends Struct<VkPhysicalDeviceShaderAtomicFloatFeaturesEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int SHADERBUFFERFLOAT32ATOMICS;
    public static final int SHADERBUFFERFLOAT32ATOMICADD;
    public static final int SHADERBUFFERFLOAT64ATOMICS;
    public static final int SHADERBUFFERFLOAT64ATOMICADD;
    public static final int SHADERSHAREDFLOAT32ATOMICS;
    public static final int SHADERSHAREDFLOAT32ATOMICADD;
    public static final int SHADERSHAREDFLOAT64ATOMICS;
    public static final int SHADERSHAREDFLOAT64ATOMICADD;
    public static final int SHADERIMAGEFLOAT32ATOMICS;
    public static final int SHADERIMAGEFLOAT32ATOMICADD;
    public static final int SPARSEIMAGEFLOAT32ATOMICS;
    public static final int SPARSEIMAGEFLOAT32ATOMICADD;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SHADERBUFFERFLOAT32ATOMICS = layout.offsetof(2);
        SHADERBUFFERFLOAT32ATOMICADD = layout.offsetof(3);
        SHADERBUFFERFLOAT64ATOMICS = layout.offsetof(4);
        SHADERBUFFERFLOAT64ATOMICADD = layout.offsetof(5);
        SHADERSHAREDFLOAT32ATOMICS = layout.offsetof(6);
        SHADERSHAREDFLOAT32ATOMICADD = layout.offsetof(7);
        SHADERSHAREDFLOAT64ATOMICS = layout.offsetof(8);
        SHADERSHAREDFLOAT64ATOMICADD = layout.offsetof(9);
        SHADERIMAGEFLOAT32ATOMICS = layout.offsetof(10);
        SHADERIMAGEFLOAT32ATOMICADD = layout.offsetof(11);
        SPARSEIMAGEFLOAT32ATOMICS = layout.offsetof(12);
        SPARSEIMAGEFLOAT32ATOMICADD = layout.offsetof(13);
    }

    protected VkPhysicalDeviceShaderAtomicFloatFeaturesEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceShaderAtomicFloatFeaturesEXT create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceShaderAtomicFloatFeaturesEXT(address, container);
    }

    public VkPhysicalDeviceShaderAtomicFloatFeaturesEXT(ByteBuffer container) {
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
    public boolean shaderBufferFloat32Atomics() {
        return nshaderBufferFloat32Atomics(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean shaderBufferFloat32AtomicAdd() {
        return nshaderBufferFloat32AtomicAdd(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean shaderBufferFloat64Atomics() {
        return nshaderBufferFloat64Atomics(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean shaderBufferFloat64AtomicAdd() {
        return nshaderBufferFloat64AtomicAdd(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean shaderSharedFloat32Atomics() {
        return nshaderSharedFloat32Atomics(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean shaderSharedFloat32AtomicAdd() {
        return nshaderSharedFloat32AtomicAdd(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean shaderSharedFloat64Atomics() {
        return nshaderSharedFloat64Atomics(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean shaderSharedFloat64AtomicAdd() {
        return nshaderSharedFloat64AtomicAdd(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean shaderImageFloat32Atomics() {
        return nshaderImageFloat32Atomics(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean shaderImageFloat32AtomicAdd() {
        return nshaderImageFloat32AtomicAdd(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean sparseImageFloat32Atomics() {
        return nsparseImageFloat32Atomics(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean sparseImageFloat32AtomicAdd() {
        return nsparseImageFloat32AtomicAdd(address()) != 0;
    }

    public VkPhysicalDeviceShaderAtomicFloatFeaturesEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceShaderAtomicFloatFeaturesEXT sType$Default() {
        return sType(EXTShaderAtomicFloat.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_ATOMIC_FLOAT_FEATURES_EXT);
    }

    public VkPhysicalDeviceShaderAtomicFloatFeaturesEXT pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceShaderAtomicFloatFeaturesEXT shaderBufferFloat32Atomics(@NativeType("VkBool32") boolean value) {
        nshaderBufferFloat32Atomics(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceShaderAtomicFloatFeaturesEXT shaderBufferFloat32AtomicAdd(@NativeType("VkBool32") boolean value) {
        nshaderBufferFloat32AtomicAdd(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceShaderAtomicFloatFeaturesEXT shaderBufferFloat64Atomics(@NativeType("VkBool32") boolean value) {
        nshaderBufferFloat64Atomics(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceShaderAtomicFloatFeaturesEXT shaderBufferFloat64AtomicAdd(@NativeType("VkBool32") boolean value) {
        nshaderBufferFloat64AtomicAdd(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceShaderAtomicFloatFeaturesEXT shaderSharedFloat32Atomics(@NativeType("VkBool32") boolean value) {
        nshaderSharedFloat32Atomics(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceShaderAtomicFloatFeaturesEXT shaderSharedFloat32AtomicAdd(@NativeType("VkBool32") boolean value) {
        nshaderSharedFloat32AtomicAdd(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceShaderAtomicFloatFeaturesEXT shaderSharedFloat64Atomics(@NativeType("VkBool32") boolean value) {
        nshaderSharedFloat64Atomics(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceShaderAtomicFloatFeaturesEXT shaderSharedFloat64AtomicAdd(@NativeType("VkBool32") boolean value) {
        nshaderSharedFloat64AtomicAdd(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceShaderAtomicFloatFeaturesEXT shaderImageFloat32Atomics(@NativeType("VkBool32") boolean value) {
        nshaderImageFloat32Atomics(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceShaderAtomicFloatFeaturesEXT shaderImageFloat32AtomicAdd(@NativeType("VkBool32") boolean value) {
        nshaderImageFloat32AtomicAdd(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceShaderAtomicFloatFeaturesEXT sparseImageFloat32Atomics(@NativeType("VkBool32") boolean value) {
        nsparseImageFloat32Atomics(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceShaderAtomicFloatFeaturesEXT sparseImageFloat32AtomicAdd(@NativeType("VkBool32") boolean value) {
        nsparseImageFloat32AtomicAdd(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceShaderAtomicFloatFeaturesEXT set(int sType, long pNext, boolean shaderBufferFloat32Atomics, boolean shaderBufferFloat32AtomicAdd, boolean shaderBufferFloat64Atomics, boolean shaderBufferFloat64AtomicAdd, boolean shaderSharedFloat32Atomics, boolean shaderSharedFloat32AtomicAdd, boolean shaderSharedFloat64Atomics, boolean shaderSharedFloat64AtomicAdd, boolean shaderImageFloat32Atomics, boolean shaderImageFloat32AtomicAdd, boolean sparseImageFloat32Atomics, boolean sparseImageFloat32AtomicAdd) {
        sType(sType);
        pNext(pNext);
        shaderBufferFloat32Atomics(shaderBufferFloat32Atomics);
        shaderBufferFloat32AtomicAdd(shaderBufferFloat32AtomicAdd);
        shaderBufferFloat64Atomics(shaderBufferFloat64Atomics);
        shaderBufferFloat64AtomicAdd(shaderBufferFloat64AtomicAdd);
        shaderSharedFloat32Atomics(shaderSharedFloat32Atomics);
        shaderSharedFloat32AtomicAdd(shaderSharedFloat32AtomicAdd);
        shaderSharedFloat64Atomics(shaderSharedFloat64Atomics);
        shaderSharedFloat64AtomicAdd(shaderSharedFloat64AtomicAdd);
        shaderImageFloat32Atomics(shaderImageFloat32Atomics);
        shaderImageFloat32AtomicAdd(shaderImageFloat32AtomicAdd);
        sparseImageFloat32Atomics(sparseImageFloat32Atomics);
        sparseImageFloat32AtomicAdd(sparseImageFloat32AtomicAdd);
        return this;
    }

    public VkPhysicalDeviceShaderAtomicFloatFeaturesEXT set(VkPhysicalDeviceShaderAtomicFloatFeaturesEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceShaderAtomicFloatFeaturesEXT malloc() {
        return new VkPhysicalDeviceShaderAtomicFloatFeaturesEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceShaderAtomicFloatFeaturesEXT calloc() {
        return new VkPhysicalDeviceShaderAtomicFloatFeaturesEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceShaderAtomicFloatFeaturesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceShaderAtomicFloatFeaturesEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceShaderAtomicFloatFeaturesEXT create(long address) {
        return new VkPhysicalDeviceShaderAtomicFloatFeaturesEXT(address, null);
    }

    public static VkPhysicalDeviceShaderAtomicFloatFeaturesEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceShaderAtomicFloatFeaturesEXT(address, null);
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

    public static VkPhysicalDeviceShaderAtomicFloatFeaturesEXT malloc(MemoryStack stack) {
        return new VkPhysicalDeviceShaderAtomicFloatFeaturesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceShaderAtomicFloatFeaturesEXT calloc(MemoryStack stack) {
        return new VkPhysicalDeviceShaderAtomicFloatFeaturesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nshaderBufferFloat32Atomics(long struct) {
        return MemoryUtil.memGetInt(struct + SHADERBUFFERFLOAT32ATOMICS);
    }

    public static int nshaderBufferFloat32AtomicAdd(long struct) {
        return MemoryUtil.memGetInt(struct + SHADERBUFFERFLOAT32ATOMICADD);
    }

    public static int nshaderBufferFloat64Atomics(long struct) {
        return MemoryUtil.memGetInt(struct + SHADERBUFFERFLOAT64ATOMICS);
    }

    public static int nshaderBufferFloat64AtomicAdd(long struct) {
        return MemoryUtil.memGetInt(struct + SHADERBUFFERFLOAT64ATOMICADD);
    }

    public static int nshaderSharedFloat32Atomics(long struct) {
        return MemoryUtil.memGetInt(struct + SHADERSHAREDFLOAT32ATOMICS);
    }

    public static int nshaderSharedFloat32AtomicAdd(long struct) {
        return MemoryUtil.memGetInt(struct + SHADERSHAREDFLOAT32ATOMICADD);
    }

    public static int nshaderSharedFloat64Atomics(long struct) {
        return MemoryUtil.memGetInt(struct + SHADERSHAREDFLOAT64ATOMICS);
    }

    public static int nshaderSharedFloat64AtomicAdd(long struct) {
        return MemoryUtil.memGetInt(struct + SHADERSHAREDFLOAT64ATOMICADD);
    }

    public static int nshaderImageFloat32Atomics(long struct) {
        return MemoryUtil.memGetInt(struct + SHADERIMAGEFLOAT32ATOMICS);
    }

    public static int nshaderImageFloat32AtomicAdd(long struct) {
        return MemoryUtil.memGetInt(struct + SHADERIMAGEFLOAT32ATOMICADD);
    }

    public static int nsparseImageFloat32Atomics(long struct) {
        return MemoryUtil.memGetInt(struct + SPARSEIMAGEFLOAT32ATOMICS);
    }

    public static int nsparseImageFloat32AtomicAdd(long struct) {
        return MemoryUtil.memGetInt(struct + SPARSEIMAGEFLOAT32ATOMICADD);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nshaderBufferFloat32Atomics(long struct, int value) {
        MemoryUtil.memPutInt(struct + SHADERBUFFERFLOAT32ATOMICS, value);
    }

    public static void nshaderBufferFloat32AtomicAdd(long struct, int value) {
        MemoryUtil.memPutInt(struct + SHADERBUFFERFLOAT32ATOMICADD, value);
    }

    public static void nshaderBufferFloat64Atomics(long struct, int value) {
        MemoryUtil.memPutInt(struct + SHADERBUFFERFLOAT64ATOMICS, value);
    }

    public static void nshaderBufferFloat64AtomicAdd(long struct, int value) {
        MemoryUtil.memPutInt(struct + SHADERBUFFERFLOAT64ATOMICADD, value);
    }

    public static void nshaderSharedFloat32Atomics(long struct, int value) {
        MemoryUtil.memPutInt(struct + SHADERSHAREDFLOAT32ATOMICS, value);
    }

    public static void nshaderSharedFloat32AtomicAdd(long struct, int value) {
        MemoryUtil.memPutInt(struct + SHADERSHAREDFLOAT32ATOMICADD, value);
    }

    public static void nshaderSharedFloat64Atomics(long struct, int value) {
        MemoryUtil.memPutInt(struct + SHADERSHAREDFLOAT64ATOMICS, value);
    }

    public static void nshaderSharedFloat64AtomicAdd(long struct, int value) {
        MemoryUtil.memPutInt(struct + SHADERSHAREDFLOAT64ATOMICADD, value);
    }

    public static void nshaderImageFloat32Atomics(long struct, int value) {
        MemoryUtil.memPutInt(struct + SHADERIMAGEFLOAT32ATOMICS, value);
    }

    public static void nshaderImageFloat32AtomicAdd(long struct, int value) {
        MemoryUtil.memPutInt(struct + SHADERIMAGEFLOAT32ATOMICADD, value);
    }

    public static void nsparseImageFloat32Atomics(long struct, int value) {
        MemoryUtil.memPutInt(struct + SPARSEIMAGEFLOAT32ATOMICS, value);
    }

    public static void nsparseImageFloat32AtomicAdd(long struct, int value) {
        MemoryUtil.memPutInt(struct + SPARSEIMAGEFLOAT32ATOMICADD, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceShaderAtomicFloatFeaturesEXT$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceShaderAtomicFloatFeaturesEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceShaderAtomicFloatFeaturesEXT, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceShaderAtomicFloatFeaturesEXT ELEMENT_FACTORY = VkPhysicalDeviceShaderAtomicFloatFeaturesEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceShaderAtomicFloatFeaturesEXT.SIZEOF);
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
        public VkPhysicalDeviceShaderAtomicFloatFeaturesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceShaderAtomicFloatFeaturesEXT.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceShaderAtomicFloatFeaturesEXT.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean shaderBufferFloat32Atomics() {
            return VkPhysicalDeviceShaderAtomicFloatFeaturesEXT.nshaderBufferFloat32Atomics(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean shaderBufferFloat32AtomicAdd() {
            return VkPhysicalDeviceShaderAtomicFloatFeaturesEXT.nshaderBufferFloat32AtomicAdd(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean shaderBufferFloat64Atomics() {
            return VkPhysicalDeviceShaderAtomicFloatFeaturesEXT.nshaderBufferFloat64Atomics(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean shaderBufferFloat64AtomicAdd() {
            return VkPhysicalDeviceShaderAtomicFloatFeaturesEXT.nshaderBufferFloat64AtomicAdd(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean shaderSharedFloat32Atomics() {
            return VkPhysicalDeviceShaderAtomicFloatFeaturesEXT.nshaderSharedFloat32Atomics(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean shaderSharedFloat32AtomicAdd() {
            return VkPhysicalDeviceShaderAtomicFloatFeaturesEXT.nshaderSharedFloat32AtomicAdd(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean shaderSharedFloat64Atomics() {
            return VkPhysicalDeviceShaderAtomicFloatFeaturesEXT.nshaderSharedFloat64Atomics(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean shaderSharedFloat64AtomicAdd() {
            return VkPhysicalDeviceShaderAtomicFloatFeaturesEXT.nshaderSharedFloat64AtomicAdd(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean shaderImageFloat32Atomics() {
            return VkPhysicalDeviceShaderAtomicFloatFeaturesEXT.nshaderImageFloat32Atomics(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean shaderImageFloat32AtomicAdd() {
            return VkPhysicalDeviceShaderAtomicFloatFeaturesEXT.nshaderImageFloat32AtomicAdd(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean sparseImageFloat32Atomics() {
            return VkPhysicalDeviceShaderAtomicFloatFeaturesEXT.nsparseImageFloat32Atomics(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean sparseImageFloat32AtomicAdd() {
            return VkPhysicalDeviceShaderAtomicFloatFeaturesEXT.nsparseImageFloat32AtomicAdd(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceShaderAtomicFloatFeaturesEXT.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(EXTShaderAtomicFloat.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_ATOMIC_FLOAT_FEATURES_EXT);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceShaderAtomicFloatFeaturesEXT.npNext(address(), value);
            return this;
        }

        public Buffer shaderBufferFloat32Atomics(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceShaderAtomicFloatFeaturesEXT.nshaderBufferFloat32Atomics(address(), value ? 1 : 0);
            return this;
        }

        public Buffer shaderBufferFloat32AtomicAdd(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceShaderAtomicFloatFeaturesEXT.nshaderBufferFloat32AtomicAdd(address(), value ? 1 : 0);
            return this;
        }

        public Buffer shaderBufferFloat64Atomics(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceShaderAtomicFloatFeaturesEXT.nshaderBufferFloat64Atomics(address(), value ? 1 : 0);
            return this;
        }

        public Buffer shaderBufferFloat64AtomicAdd(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceShaderAtomicFloatFeaturesEXT.nshaderBufferFloat64AtomicAdd(address(), value ? 1 : 0);
            return this;
        }

        public Buffer shaderSharedFloat32Atomics(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceShaderAtomicFloatFeaturesEXT.nshaderSharedFloat32Atomics(address(), value ? 1 : 0);
            return this;
        }

        public Buffer shaderSharedFloat32AtomicAdd(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceShaderAtomicFloatFeaturesEXT.nshaderSharedFloat32AtomicAdd(address(), value ? 1 : 0);
            return this;
        }

        public Buffer shaderSharedFloat64Atomics(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceShaderAtomicFloatFeaturesEXT.nshaderSharedFloat64Atomics(address(), value ? 1 : 0);
            return this;
        }

        public Buffer shaderSharedFloat64AtomicAdd(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceShaderAtomicFloatFeaturesEXT.nshaderSharedFloat64AtomicAdd(address(), value ? 1 : 0);
            return this;
        }

        public Buffer shaderImageFloat32Atomics(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceShaderAtomicFloatFeaturesEXT.nshaderImageFloat32Atomics(address(), value ? 1 : 0);
            return this;
        }

        public Buffer shaderImageFloat32AtomicAdd(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceShaderAtomicFloatFeaturesEXT.nshaderImageFloat32AtomicAdd(address(), value ? 1 : 0);
            return this;
        }

        public Buffer sparseImageFloat32Atomics(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceShaderAtomicFloatFeaturesEXT.nsparseImageFloat32Atomics(address(), value ? 1 : 0);
            return this;
        }

        public Buffer sparseImageFloat32AtomicAdd(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceShaderAtomicFloatFeaturesEXT.nsparseImageFloat32AtomicAdd(address(), value ? 1 : 0);
            return this;
        }
    }
}
