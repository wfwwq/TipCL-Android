package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceTensorFeaturesARM.class */
public class VkPhysicalDeviceTensorFeaturesARM extends Struct<VkPhysicalDeviceTensorFeaturesARM> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int TENSORNONPACKED;
    public static final int SHADERTENSORACCESS;
    public static final int SHADERSTORAGETENSORARRAYDYNAMICINDEXING;
    public static final int SHADERSTORAGETENSORARRAYNONUNIFORMINDEXING;
    public static final int DESCRIPTORBINDINGSTORAGETENSORUPDATEAFTERBIND;
    public static final int TENSORS;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        TENSORNONPACKED = layout.offsetof(2);
        SHADERTENSORACCESS = layout.offsetof(3);
        SHADERSTORAGETENSORARRAYDYNAMICINDEXING = layout.offsetof(4);
        SHADERSTORAGETENSORARRAYNONUNIFORMINDEXING = layout.offsetof(5);
        DESCRIPTORBINDINGSTORAGETENSORUPDATEAFTERBIND = layout.offsetof(6);
        TENSORS = layout.offsetof(7);
    }

    protected VkPhysicalDeviceTensorFeaturesARM(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceTensorFeaturesARM create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceTensorFeaturesARM(address, container);
    }

    public VkPhysicalDeviceTensorFeaturesARM(ByteBuffer container) {
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
    public boolean tensorNonPacked() {
        return ntensorNonPacked(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean shaderTensorAccess() {
        return nshaderTensorAccess(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean shaderStorageTensorArrayDynamicIndexing() {
        return nshaderStorageTensorArrayDynamicIndexing(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean shaderStorageTensorArrayNonUniformIndexing() {
        return nshaderStorageTensorArrayNonUniformIndexing(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean descriptorBindingStorageTensorUpdateAfterBind() {
        return ndescriptorBindingStorageTensorUpdateAfterBind(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean tensors() {
        return ntensors(address()) != 0;
    }

    public VkPhysicalDeviceTensorFeaturesARM sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceTensorFeaturesARM sType$Default() {
        return sType(ARMTensors.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TENSOR_FEATURES_ARM);
    }

    public VkPhysicalDeviceTensorFeaturesARM pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceTensorFeaturesARM tensorNonPacked(@NativeType("VkBool32") boolean value) {
        ntensorNonPacked(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceTensorFeaturesARM shaderTensorAccess(@NativeType("VkBool32") boolean value) {
        nshaderTensorAccess(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceTensorFeaturesARM shaderStorageTensorArrayDynamicIndexing(@NativeType("VkBool32") boolean value) {
        nshaderStorageTensorArrayDynamicIndexing(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceTensorFeaturesARM shaderStorageTensorArrayNonUniformIndexing(@NativeType("VkBool32") boolean value) {
        nshaderStorageTensorArrayNonUniformIndexing(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceTensorFeaturesARM descriptorBindingStorageTensorUpdateAfterBind(@NativeType("VkBool32") boolean value) {
        ndescriptorBindingStorageTensorUpdateAfterBind(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceTensorFeaturesARM tensors(@NativeType("VkBool32") boolean value) {
        ntensors(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceTensorFeaturesARM set(int sType, long pNext, boolean tensorNonPacked, boolean shaderTensorAccess, boolean shaderStorageTensorArrayDynamicIndexing, boolean shaderStorageTensorArrayNonUniformIndexing, boolean descriptorBindingStorageTensorUpdateAfterBind, boolean tensors) {
        sType(sType);
        pNext(pNext);
        tensorNonPacked(tensorNonPacked);
        shaderTensorAccess(shaderTensorAccess);
        shaderStorageTensorArrayDynamicIndexing(shaderStorageTensorArrayDynamicIndexing);
        shaderStorageTensorArrayNonUniformIndexing(shaderStorageTensorArrayNonUniformIndexing);
        descriptorBindingStorageTensorUpdateAfterBind(descriptorBindingStorageTensorUpdateAfterBind);
        tensors(tensors);
        return this;
    }

    public VkPhysicalDeviceTensorFeaturesARM set(VkPhysicalDeviceTensorFeaturesARM src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceTensorFeaturesARM malloc() {
        return new VkPhysicalDeviceTensorFeaturesARM(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceTensorFeaturesARM calloc() {
        return new VkPhysicalDeviceTensorFeaturesARM(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceTensorFeaturesARM create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceTensorFeaturesARM(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceTensorFeaturesARM create(long address) {
        return new VkPhysicalDeviceTensorFeaturesARM(address, null);
    }

    public static VkPhysicalDeviceTensorFeaturesARM createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceTensorFeaturesARM(address, null);
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

    public static VkPhysicalDeviceTensorFeaturesARM malloc(MemoryStack stack) {
        return new VkPhysicalDeviceTensorFeaturesARM(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceTensorFeaturesARM calloc(MemoryStack stack) {
        return new VkPhysicalDeviceTensorFeaturesARM(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int ntensorNonPacked(long struct) {
        return MemoryUtil.memGetInt(struct + TENSORNONPACKED);
    }

    public static int nshaderTensorAccess(long struct) {
        return MemoryUtil.memGetInt(struct + SHADERTENSORACCESS);
    }

    public static int nshaderStorageTensorArrayDynamicIndexing(long struct) {
        return MemoryUtil.memGetInt(struct + SHADERSTORAGETENSORARRAYDYNAMICINDEXING);
    }

    public static int nshaderStorageTensorArrayNonUniformIndexing(long struct) {
        return MemoryUtil.memGetInt(struct + SHADERSTORAGETENSORARRAYNONUNIFORMINDEXING);
    }

    public static int ndescriptorBindingStorageTensorUpdateAfterBind(long struct) {
        return MemoryUtil.memGetInt(struct + DESCRIPTORBINDINGSTORAGETENSORUPDATEAFTERBIND);
    }

    public static int ntensors(long struct) {
        return MemoryUtil.memGetInt(struct + TENSORS);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void ntensorNonPacked(long struct, int value) {
        MemoryUtil.memPutInt(struct + TENSORNONPACKED, value);
    }

    public static void nshaderTensorAccess(long struct, int value) {
        MemoryUtil.memPutInt(struct + SHADERTENSORACCESS, value);
    }

    public static void nshaderStorageTensorArrayDynamicIndexing(long struct, int value) {
        MemoryUtil.memPutInt(struct + SHADERSTORAGETENSORARRAYDYNAMICINDEXING, value);
    }

    public static void nshaderStorageTensorArrayNonUniformIndexing(long struct, int value) {
        MemoryUtil.memPutInt(struct + SHADERSTORAGETENSORARRAYNONUNIFORMINDEXING, value);
    }

    public static void ndescriptorBindingStorageTensorUpdateAfterBind(long struct, int value) {
        MemoryUtil.memPutInt(struct + DESCRIPTORBINDINGSTORAGETENSORUPDATEAFTERBIND, value);
    }

    public static void ntensors(long struct, int value) {
        MemoryUtil.memPutInt(struct + TENSORS, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceTensorFeaturesARM$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceTensorFeaturesARM, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceTensorFeaturesARM ELEMENT_FACTORY = VkPhysicalDeviceTensorFeaturesARM.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceTensorFeaturesARM.SIZEOF);
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
        public VkPhysicalDeviceTensorFeaturesARM getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceTensorFeaturesARM.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceTensorFeaturesARM.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean tensorNonPacked() {
            return VkPhysicalDeviceTensorFeaturesARM.ntensorNonPacked(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean shaderTensorAccess() {
            return VkPhysicalDeviceTensorFeaturesARM.nshaderTensorAccess(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean shaderStorageTensorArrayDynamicIndexing() {
            return VkPhysicalDeviceTensorFeaturesARM.nshaderStorageTensorArrayDynamicIndexing(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean shaderStorageTensorArrayNonUniformIndexing() {
            return VkPhysicalDeviceTensorFeaturesARM.nshaderStorageTensorArrayNonUniformIndexing(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean descriptorBindingStorageTensorUpdateAfterBind() {
            return VkPhysicalDeviceTensorFeaturesARM.ndescriptorBindingStorageTensorUpdateAfterBind(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean tensors() {
            return VkPhysicalDeviceTensorFeaturesARM.ntensors(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceTensorFeaturesARM.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(ARMTensors.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TENSOR_FEATURES_ARM);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceTensorFeaturesARM.npNext(address(), value);
            return this;
        }

        public Buffer tensorNonPacked(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceTensorFeaturesARM.ntensorNonPacked(address(), value ? 1 : 0);
            return this;
        }

        public Buffer shaderTensorAccess(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceTensorFeaturesARM.nshaderTensorAccess(address(), value ? 1 : 0);
            return this;
        }

        public Buffer shaderStorageTensorArrayDynamicIndexing(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceTensorFeaturesARM.nshaderStorageTensorArrayDynamicIndexing(address(), value ? 1 : 0);
            return this;
        }

        public Buffer shaderStorageTensorArrayNonUniformIndexing(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceTensorFeaturesARM.nshaderStorageTensorArrayNonUniformIndexing(address(), value ? 1 : 0);
            return this;
        }

        public Buffer descriptorBindingStorageTensorUpdateAfterBind(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceTensorFeaturesARM.ndescriptorBindingStorageTensorUpdateAfterBind(address(), value ? 1 : 0);
            return this;
        }

        public Buffer tensors(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceTensorFeaturesARM.ntensors(address(), value ? 1 : 0);
            return this;
        }
    }
}
