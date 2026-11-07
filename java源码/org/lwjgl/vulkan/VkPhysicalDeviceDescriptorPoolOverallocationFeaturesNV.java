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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceDescriptorPoolOverallocationFeaturesNV.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceDescriptorPoolOverallocationFeaturesNV.class */
public class VkPhysicalDeviceDescriptorPoolOverallocationFeaturesNV extends Struct<VkPhysicalDeviceDescriptorPoolOverallocationFeaturesNV> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int DESCRIPTORPOOLOVERALLOCATION;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        DESCRIPTORPOOLOVERALLOCATION = layout.offsetof(2);
    }

    protected VkPhysicalDeviceDescriptorPoolOverallocationFeaturesNV(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceDescriptorPoolOverallocationFeaturesNV create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceDescriptorPoolOverallocationFeaturesNV(address, container);
    }

    public VkPhysicalDeviceDescriptorPoolOverallocationFeaturesNV(ByteBuffer container) {
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
    public boolean descriptorPoolOverallocation() {
        return ndescriptorPoolOverallocation(address()) != 0;
    }

    public VkPhysicalDeviceDescriptorPoolOverallocationFeaturesNV sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceDescriptorPoolOverallocationFeaturesNV sType$Default() {
        return sType(NVDescriptorPoolOverallocation.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_POOL_OVERALLOCATION_FEATURES_NV);
    }

    public VkPhysicalDeviceDescriptorPoolOverallocationFeaturesNV pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceDescriptorPoolOverallocationFeaturesNV descriptorPoolOverallocation(@NativeType("VkBool32") boolean value) {
        ndescriptorPoolOverallocation(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceDescriptorPoolOverallocationFeaturesNV set(int sType, long pNext, boolean descriptorPoolOverallocation) {
        sType(sType);
        pNext(pNext);
        descriptorPoolOverallocation(descriptorPoolOverallocation);
        return this;
    }

    public VkPhysicalDeviceDescriptorPoolOverallocationFeaturesNV set(VkPhysicalDeviceDescriptorPoolOverallocationFeaturesNV src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceDescriptorPoolOverallocationFeaturesNV malloc() {
        return new VkPhysicalDeviceDescriptorPoolOverallocationFeaturesNV(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceDescriptorPoolOverallocationFeaturesNV calloc() {
        return new VkPhysicalDeviceDescriptorPoolOverallocationFeaturesNV(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceDescriptorPoolOverallocationFeaturesNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceDescriptorPoolOverallocationFeaturesNV(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceDescriptorPoolOverallocationFeaturesNV create(long address) {
        return new VkPhysicalDeviceDescriptorPoolOverallocationFeaturesNV(address, null);
    }

    public static VkPhysicalDeviceDescriptorPoolOverallocationFeaturesNV createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceDescriptorPoolOverallocationFeaturesNV(address, null);
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

    public static VkPhysicalDeviceDescriptorPoolOverallocationFeaturesNV malloc(MemoryStack stack) {
        return new VkPhysicalDeviceDescriptorPoolOverallocationFeaturesNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceDescriptorPoolOverallocationFeaturesNV calloc(MemoryStack stack) {
        return new VkPhysicalDeviceDescriptorPoolOverallocationFeaturesNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int ndescriptorPoolOverallocation(long struct) {
        return MemoryUtil.memGetInt(struct + DESCRIPTORPOOLOVERALLOCATION);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void ndescriptorPoolOverallocation(long struct, int value) {
        MemoryUtil.memPutInt(struct + DESCRIPTORPOOLOVERALLOCATION, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceDescriptorPoolOverallocationFeaturesNV$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceDescriptorPoolOverallocationFeaturesNV$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceDescriptorPoolOverallocationFeaturesNV, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceDescriptorPoolOverallocationFeaturesNV ELEMENT_FACTORY = VkPhysicalDeviceDescriptorPoolOverallocationFeaturesNV.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceDescriptorPoolOverallocationFeaturesNV.SIZEOF);
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
        public VkPhysicalDeviceDescriptorPoolOverallocationFeaturesNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceDescriptorPoolOverallocationFeaturesNV.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceDescriptorPoolOverallocationFeaturesNV.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean descriptorPoolOverallocation() {
            return VkPhysicalDeviceDescriptorPoolOverallocationFeaturesNV.ndescriptorPoolOverallocation(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceDescriptorPoolOverallocationFeaturesNV.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(NVDescriptorPoolOverallocation.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_POOL_OVERALLOCATION_FEATURES_NV);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceDescriptorPoolOverallocationFeaturesNV.npNext(address(), value);
            return this;
        }

        public Buffer descriptorPoolOverallocation(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceDescriptorPoolOverallocationFeaturesNV.ndescriptorPoolOverallocation(address(), value ? 1 : 0);
            return this;
        }
    }
}
