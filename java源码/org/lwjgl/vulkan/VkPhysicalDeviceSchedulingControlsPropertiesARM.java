package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceSchedulingControlsPropertiesARM.class */
public class VkPhysicalDeviceSchedulingControlsPropertiesARM extends Struct<VkPhysicalDeviceSchedulingControlsPropertiesARM> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int SCHEDULINGCONTROLSFLAGS;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(8));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SCHEDULINGCONTROLSFLAGS = layout.offsetof(2);
    }

    protected VkPhysicalDeviceSchedulingControlsPropertiesARM(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceSchedulingControlsPropertiesARM create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceSchedulingControlsPropertiesARM(address, container);
    }

    public VkPhysicalDeviceSchedulingControlsPropertiesARM(ByteBuffer container) {
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

    @NativeType("VkPhysicalDeviceSchedulingControlsFlagsARM")
    public long schedulingControlsFlags() {
        return nschedulingControlsFlags(address());
    }

    public VkPhysicalDeviceSchedulingControlsPropertiesARM sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceSchedulingControlsPropertiesARM sType$Default() {
        return sType(ARMSchedulingControls.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SCHEDULING_CONTROLS_PROPERTIES_ARM);
    }

    public VkPhysicalDeviceSchedulingControlsPropertiesARM pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceSchedulingControlsPropertiesARM set(int sType, long pNext) {
        sType(sType);
        pNext(pNext);
        return this;
    }

    public VkPhysicalDeviceSchedulingControlsPropertiesARM set(VkPhysicalDeviceSchedulingControlsPropertiesARM src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceSchedulingControlsPropertiesARM malloc() {
        return new VkPhysicalDeviceSchedulingControlsPropertiesARM(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceSchedulingControlsPropertiesARM calloc() {
        return new VkPhysicalDeviceSchedulingControlsPropertiesARM(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceSchedulingControlsPropertiesARM create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceSchedulingControlsPropertiesARM(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceSchedulingControlsPropertiesARM create(long address) {
        return new VkPhysicalDeviceSchedulingControlsPropertiesARM(address, null);
    }

    public static VkPhysicalDeviceSchedulingControlsPropertiesARM createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceSchedulingControlsPropertiesARM(address, null);
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

    public static VkPhysicalDeviceSchedulingControlsPropertiesARM malloc(MemoryStack stack) {
        return new VkPhysicalDeviceSchedulingControlsPropertiesARM(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceSchedulingControlsPropertiesARM calloc(MemoryStack stack) {
        return new VkPhysicalDeviceSchedulingControlsPropertiesARM(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static long nschedulingControlsFlags(long struct) {
        return MemoryUtil.memGetLong(struct + SCHEDULINGCONTROLSFLAGS);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceSchedulingControlsPropertiesARM$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceSchedulingControlsPropertiesARM, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceSchedulingControlsPropertiesARM ELEMENT_FACTORY = VkPhysicalDeviceSchedulingControlsPropertiesARM.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceSchedulingControlsPropertiesARM.SIZEOF);
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
        public VkPhysicalDeviceSchedulingControlsPropertiesARM getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceSchedulingControlsPropertiesARM.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceSchedulingControlsPropertiesARM.npNext(address());
        }

        @NativeType("VkPhysicalDeviceSchedulingControlsFlagsARM")
        public long schedulingControlsFlags() {
            return VkPhysicalDeviceSchedulingControlsPropertiesARM.nschedulingControlsFlags(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceSchedulingControlsPropertiesARM.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(ARMSchedulingControls.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SCHEDULING_CONTROLS_PROPERTIES_ARM);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceSchedulingControlsPropertiesARM.npNext(address(), value);
            return this;
        }
    }
}
