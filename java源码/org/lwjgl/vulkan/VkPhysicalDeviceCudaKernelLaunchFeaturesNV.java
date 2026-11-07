package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceCudaKernelLaunchFeaturesNV.class */
public class VkPhysicalDeviceCudaKernelLaunchFeaturesNV extends Struct<VkPhysicalDeviceCudaKernelLaunchFeaturesNV> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int CUDAKERNELLAUNCHFEATURES;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        CUDAKERNELLAUNCHFEATURES = layout.offsetof(2);
    }

    protected VkPhysicalDeviceCudaKernelLaunchFeaturesNV(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceCudaKernelLaunchFeaturesNV create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceCudaKernelLaunchFeaturesNV(address, container);
    }

    public VkPhysicalDeviceCudaKernelLaunchFeaturesNV(ByteBuffer container) {
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
    public boolean cudaKernelLaunchFeatures() {
        return ncudaKernelLaunchFeatures(address()) != 0;
    }

    public VkPhysicalDeviceCudaKernelLaunchFeaturesNV sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceCudaKernelLaunchFeaturesNV sType$Default() {
        return sType(NVCudaKernelLaunch.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_CUDA_KERNEL_LAUNCH_FEATURES_NV);
    }

    public VkPhysicalDeviceCudaKernelLaunchFeaturesNV pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceCudaKernelLaunchFeaturesNV cudaKernelLaunchFeatures(@NativeType("VkBool32") boolean value) {
        ncudaKernelLaunchFeatures(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceCudaKernelLaunchFeaturesNV set(int sType, long pNext, boolean cudaKernelLaunchFeatures) {
        sType(sType);
        pNext(pNext);
        cudaKernelLaunchFeatures(cudaKernelLaunchFeatures);
        return this;
    }

    public VkPhysicalDeviceCudaKernelLaunchFeaturesNV set(VkPhysicalDeviceCudaKernelLaunchFeaturesNV src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceCudaKernelLaunchFeaturesNV malloc() {
        return new VkPhysicalDeviceCudaKernelLaunchFeaturesNV(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceCudaKernelLaunchFeaturesNV calloc() {
        return new VkPhysicalDeviceCudaKernelLaunchFeaturesNV(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceCudaKernelLaunchFeaturesNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceCudaKernelLaunchFeaturesNV(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceCudaKernelLaunchFeaturesNV create(long address) {
        return new VkPhysicalDeviceCudaKernelLaunchFeaturesNV(address, null);
    }

    public static VkPhysicalDeviceCudaKernelLaunchFeaturesNV createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceCudaKernelLaunchFeaturesNV(address, null);
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

    public static VkPhysicalDeviceCudaKernelLaunchFeaturesNV malloc(MemoryStack stack) {
        return new VkPhysicalDeviceCudaKernelLaunchFeaturesNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceCudaKernelLaunchFeaturesNV calloc(MemoryStack stack) {
        return new VkPhysicalDeviceCudaKernelLaunchFeaturesNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int ncudaKernelLaunchFeatures(long struct) {
        return MemoryUtil.memGetInt(struct + CUDAKERNELLAUNCHFEATURES);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void ncudaKernelLaunchFeatures(long struct, int value) {
        MemoryUtil.memPutInt(struct + CUDAKERNELLAUNCHFEATURES, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceCudaKernelLaunchFeaturesNV$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceCudaKernelLaunchFeaturesNV, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceCudaKernelLaunchFeaturesNV ELEMENT_FACTORY = VkPhysicalDeviceCudaKernelLaunchFeaturesNV.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceCudaKernelLaunchFeaturesNV.SIZEOF);
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
        public VkPhysicalDeviceCudaKernelLaunchFeaturesNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceCudaKernelLaunchFeaturesNV.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceCudaKernelLaunchFeaturesNV.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean cudaKernelLaunchFeatures() {
            return VkPhysicalDeviceCudaKernelLaunchFeaturesNV.ncudaKernelLaunchFeatures(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceCudaKernelLaunchFeaturesNV.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(NVCudaKernelLaunch.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_CUDA_KERNEL_LAUNCH_FEATURES_NV);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceCudaKernelLaunchFeaturesNV.npNext(address(), value);
            return this;
        }

        public Buffer cudaKernelLaunchFeatures(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceCudaKernelLaunchFeaturesNV.ncudaKernelLaunchFeatures(address(), value ? 1 : 0);
            return this;
        }
    }
}
