package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceImageAlignmentControlPropertiesMESA.class */
public class VkPhysicalDeviceImageAlignmentControlPropertiesMESA extends Struct<VkPhysicalDeviceImageAlignmentControlPropertiesMESA> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int SUPPORTEDIMAGEALIGNMENTMASK;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SUPPORTEDIMAGEALIGNMENTMASK = layout.offsetof(2);
    }

    protected VkPhysicalDeviceImageAlignmentControlPropertiesMESA(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceImageAlignmentControlPropertiesMESA create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceImageAlignmentControlPropertiesMESA(address, container);
    }

    public VkPhysicalDeviceImageAlignmentControlPropertiesMESA(ByteBuffer container) {
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

    @NativeType("uint32_t")
    public int supportedImageAlignmentMask() {
        return nsupportedImageAlignmentMask(address());
    }

    public VkPhysicalDeviceImageAlignmentControlPropertiesMESA sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceImageAlignmentControlPropertiesMESA sType$Default() {
        return sType(MESAImageAlignmentControl.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_ALIGNMENT_CONTROL_PROPERTIES_MESA);
    }

    public VkPhysicalDeviceImageAlignmentControlPropertiesMESA pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceImageAlignmentControlPropertiesMESA set(int sType, long pNext) {
        sType(sType);
        pNext(pNext);
        return this;
    }

    public VkPhysicalDeviceImageAlignmentControlPropertiesMESA set(VkPhysicalDeviceImageAlignmentControlPropertiesMESA src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceImageAlignmentControlPropertiesMESA malloc() {
        return new VkPhysicalDeviceImageAlignmentControlPropertiesMESA(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceImageAlignmentControlPropertiesMESA calloc() {
        return new VkPhysicalDeviceImageAlignmentControlPropertiesMESA(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceImageAlignmentControlPropertiesMESA create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceImageAlignmentControlPropertiesMESA(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceImageAlignmentControlPropertiesMESA create(long address) {
        return new VkPhysicalDeviceImageAlignmentControlPropertiesMESA(address, null);
    }

    public static VkPhysicalDeviceImageAlignmentControlPropertiesMESA createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceImageAlignmentControlPropertiesMESA(address, null);
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

    public static VkPhysicalDeviceImageAlignmentControlPropertiesMESA malloc(MemoryStack stack) {
        return new VkPhysicalDeviceImageAlignmentControlPropertiesMESA(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceImageAlignmentControlPropertiesMESA calloc(MemoryStack stack) {
        return new VkPhysicalDeviceImageAlignmentControlPropertiesMESA(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nsupportedImageAlignmentMask(long struct) {
        return MemoryUtil.memGetInt(struct + SUPPORTEDIMAGEALIGNMENTMASK);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceImageAlignmentControlPropertiesMESA$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceImageAlignmentControlPropertiesMESA, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceImageAlignmentControlPropertiesMESA ELEMENT_FACTORY = VkPhysicalDeviceImageAlignmentControlPropertiesMESA.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceImageAlignmentControlPropertiesMESA.SIZEOF);
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
        public VkPhysicalDeviceImageAlignmentControlPropertiesMESA getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceImageAlignmentControlPropertiesMESA.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceImageAlignmentControlPropertiesMESA.npNext(address());
        }

        @NativeType("uint32_t")
        public int supportedImageAlignmentMask() {
            return VkPhysicalDeviceImageAlignmentControlPropertiesMESA.nsupportedImageAlignmentMask(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceImageAlignmentControlPropertiesMESA.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(MESAImageAlignmentControl.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_ALIGNMENT_CONTROL_PROPERTIES_MESA);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceImageAlignmentControlPropertiesMESA.npNext(address(), value);
            return this;
        }
    }
}
