package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceImageAlignmentControlFeaturesMESA.class */
public class VkPhysicalDeviceImageAlignmentControlFeaturesMESA extends Struct<VkPhysicalDeviceImageAlignmentControlFeaturesMESA> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int IMAGEALIGNMENTCONTROL;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        IMAGEALIGNMENTCONTROL = layout.offsetof(2);
    }

    protected VkPhysicalDeviceImageAlignmentControlFeaturesMESA(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceImageAlignmentControlFeaturesMESA create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceImageAlignmentControlFeaturesMESA(address, container);
    }

    public VkPhysicalDeviceImageAlignmentControlFeaturesMESA(ByteBuffer container) {
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
    public boolean imageAlignmentControl() {
        return nimageAlignmentControl(address()) != 0;
    }

    public VkPhysicalDeviceImageAlignmentControlFeaturesMESA sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceImageAlignmentControlFeaturesMESA sType$Default() {
        return sType(MESAImageAlignmentControl.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_ALIGNMENT_CONTROL_FEATURES_MESA);
    }

    public VkPhysicalDeviceImageAlignmentControlFeaturesMESA pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceImageAlignmentControlFeaturesMESA imageAlignmentControl(@NativeType("VkBool32") boolean value) {
        nimageAlignmentControl(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceImageAlignmentControlFeaturesMESA set(int sType, long pNext, boolean imageAlignmentControl) {
        sType(sType);
        pNext(pNext);
        imageAlignmentControl(imageAlignmentControl);
        return this;
    }

    public VkPhysicalDeviceImageAlignmentControlFeaturesMESA set(VkPhysicalDeviceImageAlignmentControlFeaturesMESA src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceImageAlignmentControlFeaturesMESA malloc() {
        return new VkPhysicalDeviceImageAlignmentControlFeaturesMESA(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceImageAlignmentControlFeaturesMESA calloc() {
        return new VkPhysicalDeviceImageAlignmentControlFeaturesMESA(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceImageAlignmentControlFeaturesMESA create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceImageAlignmentControlFeaturesMESA(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceImageAlignmentControlFeaturesMESA create(long address) {
        return new VkPhysicalDeviceImageAlignmentControlFeaturesMESA(address, null);
    }

    public static VkPhysicalDeviceImageAlignmentControlFeaturesMESA createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceImageAlignmentControlFeaturesMESA(address, null);
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

    public static VkPhysicalDeviceImageAlignmentControlFeaturesMESA malloc(MemoryStack stack) {
        return new VkPhysicalDeviceImageAlignmentControlFeaturesMESA(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceImageAlignmentControlFeaturesMESA calloc(MemoryStack stack) {
        return new VkPhysicalDeviceImageAlignmentControlFeaturesMESA(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nimageAlignmentControl(long struct) {
        return MemoryUtil.memGetInt(struct + IMAGEALIGNMENTCONTROL);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nimageAlignmentControl(long struct, int value) {
        MemoryUtil.memPutInt(struct + IMAGEALIGNMENTCONTROL, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceImageAlignmentControlFeaturesMESA$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceImageAlignmentControlFeaturesMESA, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceImageAlignmentControlFeaturesMESA ELEMENT_FACTORY = VkPhysicalDeviceImageAlignmentControlFeaturesMESA.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceImageAlignmentControlFeaturesMESA.SIZEOF);
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
        public VkPhysicalDeviceImageAlignmentControlFeaturesMESA getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceImageAlignmentControlFeaturesMESA.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceImageAlignmentControlFeaturesMESA.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean imageAlignmentControl() {
            return VkPhysicalDeviceImageAlignmentControlFeaturesMESA.nimageAlignmentControl(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceImageAlignmentControlFeaturesMESA.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(MESAImageAlignmentControl.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_ALIGNMENT_CONTROL_FEATURES_MESA);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceImageAlignmentControlFeaturesMESA.npNext(address(), value);
            return this;
        }

        public Buffer imageAlignmentControl(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceImageAlignmentControlFeaturesMESA.nimageAlignmentControl(address(), value ? 1 : 0);
            return this;
        }
    }
}
