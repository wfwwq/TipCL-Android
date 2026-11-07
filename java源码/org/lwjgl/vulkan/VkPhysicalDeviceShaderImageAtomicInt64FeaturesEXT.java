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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT.class */
public class VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT extends Struct<VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int SHADERIMAGEINT64ATOMICS;
    public static final int SPARSEIMAGEINT64ATOMICS;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SHADERIMAGEINT64ATOMICS = layout.offsetof(2);
        SPARSEIMAGEINT64ATOMICS = layout.offsetof(3);
    }

    protected VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT(address, container);
    }

    public VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT(ByteBuffer container) {
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
    public boolean shaderImageInt64Atomics() {
        return nshaderImageInt64Atomics(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean sparseImageInt64Atomics() {
        return nsparseImageInt64Atomics(address()) != 0;
    }

    public VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT sType$Default() {
        return sType(EXTShaderImageAtomicInt64.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_IMAGE_ATOMIC_INT64_FEATURES_EXT);
    }

    public VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT shaderImageInt64Atomics(@NativeType("VkBool32") boolean value) {
        nshaderImageInt64Atomics(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT sparseImageInt64Atomics(@NativeType("VkBool32") boolean value) {
        nsparseImageInt64Atomics(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT set(int sType, long pNext, boolean shaderImageInt64Atomics, boolean sparseImageInt64Atomics) {
        sType(sType);
        pNext(pNext);
        shaderImageInt64Atomics(shaderImageInt64Atomics);
        sparseImageInt64Atomics(sparseImageInt64Atomics);
        return this;
    }

    public VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT set(VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT malloc() {
        return new VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT calloc() {
        return new VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT create(long address) {
        return new VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT(address, null);
    }

    public static VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT(address, null);
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

    public static VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT malloc(MemoryStack stack) {
        return new VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT calloc(MemoryStack stack) {
        return new VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nshaderImageInt64Atomics(long struct) {
        return MemoryUtil.memGetInt(struct + SHADERIMAGEINT64ATOMICS);
    }

    public static int nsparseImageInt64Atomics(long struct) {
        return MemoryUtil.memGetInt(struct + SPARSEIMAGEINT64ATOMICS);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nshaderImageInt64Atomics(long struct, int value) {
        MemoryUtil.memPutInt(struct + SHADERIMAGEINT64ATOMICS, value);
    }

    public static void nsparseImageInt64Atomics(long struct, int value) {
        MemoryUtil.memPutInt(struct + SPARSEIMAGEINT64ATOMICS, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT ELEMENT_FACTORY = VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT.SIZEOF);
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
        public VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean shaderImageInt64Atomics() {
            return VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT.nshaderImageInt64Atomics(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean sparseImageInt64Atomics() {
            return VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT.nsparseImageInt64Atomics(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(EXTShaderImageAtomicInt64.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_IMAGE_ATOMIC_INT64_FEATURES_EXT);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT.npNext(address(), value);
            return this;
        }

        public Buffer shaderImageInt64Atomics(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT.nshaderImageInt64Atomics(address(), value ? 1 : 0);
            return this;
        }

        public Buffer sparseImageInt64Atomics(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT.nsparseImageInt64Atomics(address(), value ? 1 : 0);
            return this;
        }
    }
}
