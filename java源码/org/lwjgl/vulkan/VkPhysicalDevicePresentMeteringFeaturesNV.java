package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDevicePresentMeteringFeaturesNV.class */
public class VkPhysicalDevicePresentMeteringFeaturesNV extends Struct<VkPhysicalDevicePresentMeteringFeaturesNV> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int PRESENTMETERING;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        PRESENTMETERING = layout.offsetof(2);
    }

    protected VkPhysicalDevicePresentMeteringFeaturesNV(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDevicePresentMeteringFeaturesNV create(long address, ByteBuffer container) {
        return new VkPhysicalDevicePresentMeteringFeaturesNV(address, container);
    }

    public VkPhysicalDevicePresentMeteringFeaturesNV(ByteBuffer container) {
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
    public boolean presentMetering() {
        return npresentMetering(address()) != 0;
    }

    public VkPhysicalDevicePresentMeteringFeaturesNV sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDevicePresentMeteringFeaturesNV sType$Default() {
        return sType(NVPresentMetering.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PRESENT_METERING_FEATURES_NV);
    }

    public VkPhysicalDevicePresentMeteringFeaturesNV pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDevicePresentMeteringFeaturesNV presentMetering(@NativeType("VkBool32") boolean value) {
        npresentMetering(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDevicePresentMeteringFeaturesNV set(int sType, long pNext, boolean presentMetering) {
        sType(sType);
        pNext(pNext);
        presentMetering(presentMetering);
        return this;
    }

    public VkPhysicalDevicePresentMeteringFeaturesNV set(VkPhysicalDevicePresentMeteringFeaturesNV src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDevicePresentMeteringFeaturesNV malloc() {
        return new VkPhysicalDevicePresentMeteringFeaturesNV(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDevicePresentMeteringFeaturesNV calloc() {
        return new VkPhysicalDevicePresentMeteringFeaturesNV(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDevicePresentMeteringFeaturesNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDevicePresentMeteringFeaturesNV(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDevicePresentMeteringFeaturesNV create(long address) {
        return new VkPhysicalDevicePresentMeteringFeaturesNV(address, null);
    }

    public static VkPhysicalDevicePresentMeteringFeaturesNV createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDevicePresentMeteringFeaturesNV(address, null);
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

    public static VkPhysicalDevicePresentMeteringFeaturesNV malloc(MemoryStack stack) {
        return new VkPhysicalDevicePresentMeteringFeaturesNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDevicePresentMeteringFeaturesNV calloc(MemoryStack stack) {
        return new VkPhysicalDevicePresentMeteringFeaturesNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int npresentMetering(long struct) {
        return MemoryUtil.memGetInt(struct + PRESENTMETERING);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void npresentMetering(long struct, int value) {
        MemoryUtil.memPutInt(struct + PRESENTMETERING, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDevicePresentMeteringFeaturesNV$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDevicePresentMeteringFeaturesNV, Buffer> implements NativeResource {
        private static final VkPhysicalDevicePresentMeteringFeaturesNV ELEMENT_FACTORY = VkPhysicalDevicePresentMeteringFeaturesNV.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDevicePresentMeteringFeaturesNV.SIZEOF);
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
        public VkPhysicalDevicePresentMeteringFeaturesNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDevicePresentMeteringFeaturesNV.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDevicePresentMeteringFeaturesNV.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean presentMetering() {
            return VkPhysicalDevicePresentMeteringFeaturesNV.npresentMetering(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDevicePresentMeteringFeaturesNV.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(NVPresentMetering.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PRESENT_METERING_FEATURES_NV);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDevicePresentMeteringFeaturesNV.npNext(address(), value);
            return this;
        }

        public Buffer presentMetering(@NativeType("VkBool32") boolean value) {
            VkPhysicalDevicePresentMeteringFeaturesNV.npresentMetering(address(), value ? 1 : 0);
            return this;
        }
    }
}
