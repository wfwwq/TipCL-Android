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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV.class */
public class VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV extends Struct<VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int DEDICATEDALLOCATIONIMAGEALIASING;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        DEDICATEDALLOCATIONIMAGEALIASING = layout.offsetof(2);
    }

    protected VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV(address, container);
    }

    public VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV(ByteBuffer container) {
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
    public boolean dedicatedAllocationImageAliasing() {
        return ndedicatedAllocationImageAliasing(address()) != 0;
    }

    public VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV sType$Default() {
        return sType(NVDedicatedAllocationImageAliasing.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DEDICATED_ALLOCATION_IMAGE_ALIASING_FEATURES_NV);
    }

    public VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV dedicatedAllocationImageAliasing(@NativeType("VkBool32") boolean value) {
        ndedicatedAllocationImageAliasing(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV set(int sType, long pNext, boolean dedicatedAllocationImageAliasing) {
        sType(sType);
        pNext(pNext);
        dedicatedAllocationImageAliasing(dedicatedAllocationImageAliasing);
        return this;
    }

    public VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV set(VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV malloc() {
        return new VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV calloc() {
        return new VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV create(long address) {
        return new VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV(address, null);
    }

    public static VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV(address, null);
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

    public static VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV malloc(MemoryStack stack) {
        return new VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV calloc(MemoryStack stack) {
        return new VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int ndedicatedAllocationImageAliasing(long struct) {
        return MemoryUtil.memGetInt(struct + DEDICATEDALLOCATIONIMAGEALIASING);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void ndedicatedAllocationImageAliasing(long struct, int value) {
        MemoryUtil.memPutInt(struct + DEDICATEDALLOCATIONIMAGEALIASING, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV ELEMENT_FACTORY = VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV.SIZEOF);
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
        public VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean dedicatedAllocationImageAliasing() {
            return VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV.ndedicatedAllocationImageAliasing(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(NVDedicatedAllocationImageAliasing.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DEDICATED_ALLOCATION_IMAGE_ALIASING_FEATURES_NV);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV.npNext(address(), value);
            return this;
        }

        public Buffer dedicatedAllocationImageAliasing(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV.ndedicatedAllocationImageAliasing(address(), value ? 1 : 0);
            return this;
        }
    }
}
