package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceSchedulingControlsFeaturesARM.class */
public class VkPhysicalDeviceSchedulingControlsFeaturesARM extends Struct<VkPhysicalDeviceSchedulingControlsFeaturesARM> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int SCHEDULINGCONTROLS;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SCHEDULINGCONTROLS = layout.offsetof(2);
    }

    protected VkPhysicalDeviceSchedulingControlsFeaturesARM(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceSchedulingControlsFeaturesARM create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceSchedulingControlsFeaturesARM(address, container);
    }

    public VkPhysicalDeviceSchedulingControlsFeaturesARM(ByteBuffer container) {
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
    public boolean schedulingControls() {
        return nschedulingControls(address()) != 0;
    }

    public VkPhysicalDeviceSchedulingControlsFeaturesARM sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceSchedulingControlsFeaturesARM sType$Default() {
        return sType(ARMSchedulingControls.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SCHEDULING_CONTROLS_FEATURES_ARM);
    }

    public VkPhysicalDeviceSchedulingControlsFeaturesARM pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceSchedulingControlsFeaturesARM schedulingControls(@NativeType("VkBool32") boolean value) {
        nschedulingControls(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceSchedulingControlsFeaturesARM set(int sType, long pNext, boolean schedulingControls) {
        sType(sType);
        pNext(pNext);
        schedulingControls(schedulingControls);
        return this;
    }

    public VkPhysicalDeviceSchedulingControlsFeaturesARM set(VkPhysicalDeviceSchedulingControlsFeaturesARM src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceSchedulingControlsFeaturesARM malloc() {
        return new VkPhysicalDeviceSchedulingControlsFeaturesARM(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceSchedulingControlsFeaturesARM calloc() {
        return new VkPhysicalDeviceSchedulingControlsFeaturesARM(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceSchedulingControlsFeaturesARM create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceSchedulingControlsFeaturesARM(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceSchedulingControlsFeaturesARM create(long address) {
        return new VkPhysicalDeviceSchedulingControlsFeaturesARM(address, null);
    }

    public static VkPhysicalDeviceSchedulingControlsFeaturesARM createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceSchedulingControlsFeaturesARM(address, null);
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

    public static VkPhysicalDeviceSchedulingControlsFeaturesARM malloc(MemoryStack stack) {
        return new VkPhysicalDeviceSchedulingControlsFeaturesARM(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceSchedulingControlsFeaturesARM calloc(MemoryStack stack) {
        return new VkPhysicalDeviceSchedulingControlsFeaturesARM(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nschedulingControls(long struct) {
        return MemoryUtil.memGetInt(struct + SCHEDULINGCONTROLS);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nschedulingControls(long struct, int value) {
        MemoryUtil.memPutInt(struct + SCHEDULINGCONTROLS, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceSchedulingControlsFeaturesARM$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceSchedulingControlsFeaturesARM, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceSchedulingControlsFeaturesARM ELEMENT_FACTORY = VkPhysicalDeviceSchedulingControlsFeaturesARM.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceSchedulingControlsFeaturesARM.SIZEOF);
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
        public VkPhysicalDeviceSchedulingControlsFeaturesARM getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceSchedulingControlsFeaturesARM.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceSchedulingControlsFeaturesARM.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean schedulingControls() {
            return VkPhysicalDeviceSchedulingControlsFeaturesARM.nschedulingControls(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceSchedulingControlsFeaturesARM.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(ARMSchedulingControls.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SCHEDULING_CONTROLS_FEATURES_ARM);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceSchedulingControlsFeaturesARM.npNext(address(), value);
            return this;
        }

        public Buffer schedulingControls(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceSchedulingControlsFeaturesARM.nschedulingControls(address(), value ? 1 : 0);
            return this;
        }
    }
}
