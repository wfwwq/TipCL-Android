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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDevicePresentBarrierFeaturesNV.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDevicePresentBarrierFeaturesNV.class */
public class VkPhysicalDevicePresentBarrierFeaturesNV extends Struct<VkPhysicalDevicePresentBarrierFeaturesNV> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int PRESENTBARRIER;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        PRESENTBARRIER = layout.offsetof(2);
    }

    protected VkPhysicalDevicePresentBarrierFeaturesNV(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDevicePresentBarrierFeaturesNV create(long address, ByteBuffer container) {
        return new VkPhysicalDevicePresentBarrierFeaturesNV(address, container);
    }

    public VkPhysicalDevicePresentBarrierFeaturesNV(ByteBuffer container) {
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
    public boolean presentBarrier() {
        return npresentBarrier(address()) != 0;
    }

    public VkPhysicalDevicePresentBarrierFeaturesNV sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDevicePresentBarrierFeaturesNV sType$Default() {
        return sType(NVPresentBarrier.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PRESENT_BARRIER_FEATURES_NV);
    }

    public VkPhysicalDevicePresentBarrierFeaturesNV pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDevicePresentBarrierFeaturesNV presentBarrier(@NativeType("VkBool32") boolean value) {
        npresentBarrier(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDevicePresentBarrierFeaturesNV set(int sType, long pNext, boolean presentBarrier) {
        sType(sType);
        pNext(pNext);
        presentBarrier(presentBarrier);
        return this;
    }

    public VkPhysicalDevicePresentBarrierFeaturesNV set(VkPhysicalDevicePresentBarrierFeaturesNV src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDevicePresentBarrierFeaturesNV malloc() {
        return new VkPhysicalDevicePresentBarrierFeaturesNV(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDevicePresentBarrierFeaturesNV calloc() {
        return new VkPhysicalDevicePresentBarrierFeaturesNV(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDevicePresentBarrierFeaturesNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDevicePresentBarrierFeaturesNV(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDevicePresentBarrierFeaturesNV create(long address) {
        return new VkPhysicalDevicePresentBarrierFeaturesNV(address, null);
    }

    public static VkPhysicalDevicePresentBarrierFeaturesNV createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDevicePresentBarrierFeaturesNV(address, null);
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

    public static VkPhysicalDevicePresentBarrierFeaturesNV malloc(MemoryStack stack) {
        return new VkPhysicalDevicePresentBarrierFeaturesNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDevicePresentBarrierFeaturesNV calloc(MemoryStack stack) {
        return new VkPhysicalDevicePresentBarrierFeaturesNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int npresentBarrier(long struct) {
        return MemoryUtil.memGetInt(struct + PRESENTBARRIER);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void npresentBarrier(long struct, int value) {
        MemoryUtil.memPutInt(struct + PRESENTBARRIER, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDevicePresentBarrierFeaturesNV$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDevicePresentBarrierFeaturesNV$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDevicePresentBarrierFeaturesNV, Buffer> implements NativeResource {
        private static final VkPhysicalDevicePresentBarrierFeaturesNV ELEMENT_FACTORY = VkPhysicalDevicePresentBarrierFeaturesNV.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDevicePresentBarrierFeaturesNV.SIZEOF);
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
        public VkPhysicalDevicePresentBarrierFeaturesNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDevicePresentBarrierFeaturesNV.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDevicePresentBarrierFeaturesNV.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean presentBarrier() {
            return VkPhysicalDevicePresentBarrierFeaturesNV.npresentBarrier(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDevicePresentBarrierFeaturesNV.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(NVPresentBarrier.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PRESENT_BARRIER_FEATURES_NV);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDevicePresentBarrierFeaturesNV.npNext(address(), value);
            return this;
        }

        public Buffer presentBarrier(@NativeType("VkBool32") boolean value) {
            VkPhysicalDevicePresentBarrierFeaturesNV.npresentBarrier(address(), value ? 1 : 0);
            return this;
        }
    }
}
