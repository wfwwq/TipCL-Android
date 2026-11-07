package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.Checks;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceExternalTensorInfoARM.class */
public class VkPhysicalDeviceExternalTensorInfoARM extends Struct<VkPhysicalDeviceExternalTensorInfoARM> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int FLAGS;
    public static final int PDESCRIPTION;
    public static final int HANDLETYPE;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(8), __member(POINTER_SIZE), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        PDESCRIPTION = layout.offsetof(3);
        HANDLETYPE = layout.offsetof(4);
    }

    protected VkPhysicalDeviceExternalTensorInfoARM(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceExternalTensorInfoARM create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceExternalTensorInfoARM(address, container);
    }

    public VkPhysicalDeviceExternalTensorInfoARM(ByteBuffer container) {
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

    @NativeType("void const *")
    public long pNext() {
        return npNext(address());
    }

    @NativeType("VkTensorCreateFlagsARM")
    public long flags() {
        return nflags(address());
    }

    @NativeType("VkTensorDescriptionARM const *")
    public VkTensorDescriptionARM pDescription() {
        return npDescription(address());
    }

    @NativeType("VkExternalMemoryHandleTypeFlagBits")
    public int handleType() {
        return nhandleType(address());
    }

    public VkPhysicalDeviceExternalTensorInfoARM sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceExternalTensorInfoARM sType$Default() {
        return sType(ARMTensors.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_TENSOR_INFO_ARM);
    }

    public VkPhysicalDeviceExternalTensorInfoARM pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceExternalTensorInfoARM flags(@NativeType("VkTensorCreateFlagsARM") long value) {
        nflags(address(), value);
        return this;
    }

    public VkPhysicalDeviceExternalTensorInfoARM pDescription(@NativeType("VkTensorDescriptionARM const *") VkTensorDescriptionARM value) {
        npDescription(address(), value);
        return this;
    }

    public VkPhysicalDeviceExternalTensorInfoARM handleType(@NativeType("VkExternalMemoryHandleTypeFlagBits") int value) {
        nhandleType(address(), value);
        return this;
    }

    public VkPhysicalDeviceExternalTensorInfoARM set(int sType, long pNext, long flags, VkTensorDescriptionARM pDescription, int handleType) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        pDescription(pDescription);
        handleType(handleType);
        return this;
    }

    public VkPhysicalDeviceExternalTensorInfoARM set(VkPhysicalDeviceExternalTensorInfoARM src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceExternalTensorInfoARM malloc() {
        return new VkPhysicalDeviceExternalTensorInfoARM(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceExternalTensorInfoARM calloc() {
        return new VkPhysicalDeviceExternalTensorInfoARM(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceExternalTensorInfoARM create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceExternalTensorInfoARM(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceExternalTensorInfoARM create(long address) {
        return new VkPhysicalDeviceExternalTensorInfoARM(address, null);
    }

    public static VkPhysicalDeviceExternalTensorInfoARM createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceExternalTensorInfoARM(address, null);
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

    public static VkPhysicalDeviceExternalTensorInfoARM malloc(MemoryStack stack) {
        return new VkPhysicalDeviceExternalTensorInfoARM(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceExternalTensorInfoARM calloc(MemoryStack stack) {
        return new VkPhysicalDeviceExternalTensorInfoARM(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static long nflags(long struct) {
        return MemoryUtil.memGetLong(struct + FLAGS);
    }

    public static VkTensorDescriptionARM npDescription(long struct) {
        return VkTensorDescriptionARM.create(MemoryUtil.memGetAddress(struct + PDESCRIPTION));
    }

    public static int nhandleType(long struct) {
        return MemoryUtil.memGetInt(struct + HANDLETYPE);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nflags(long struct, long value) {
        MemoryUtil.memPutLong(struct + FLAGS, value);
    }

    public static void npDescription(long struct, VkTensorDescriptionARM value) {
        MemoryUtil.memPutAddress(struct + PDESCRIPTION, value.address());
    }

    public static void nhandleType(long struct, int value) {
        MemoryUtil.memPutInt(struct + HANDLETYPE, value);
    }

    public static void validate(long struct) {
        long pDescription = MemoryUtil.memGetAddress(struct + PDESCRIPTION);
        Checks.check(pDescription);
        VkTensorDescriptionARM.validate(pDescription);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceExternalTensorInfoARM$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceExternalTensorInfoARM, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceExternalTensorInfoARM ELEMENT_FACTORY = VkPhysicalDeviceExternalTensorInfoARM.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceExternalTensorInfoARM.SIZEOF);
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
        public VkPhysicalDeviceExternalTensorInfoARM getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceExternalTensorInfoARM.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkPhysicalDeviceExternalTensorInfoARM.npNext(address());
        }

        @NativeType("VkTensorCreateFlagsARM")
        public long flags() {
            return VkPhysicalDeviceExternalTensorInfoARM.nflags(address());
        }

        @NativeType("VkTensorDescriptionARM const *")
        public VkTensorDescriptionARM pDescription() {
            return VkPhysicalDeviceExternalTensorInfoARM.npDescription(address());
        }

        @NativeType("VkExternalMemoryHandleTypeFlagBits")
        public int handleType() {
            return VkPhysicalDeviceExternalTensorInfoARM.nhandleType(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceExternalTensorInfoARM.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(ARMTensors.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_TENSOR_INFO_ARM);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkPhysicalDeviceExternalTensorInfoARM.npNext(address(), value);
            return this;
        }

        public Buffer flags(@NativeType("VkTensorCreateFlagsARM") long value) {
            VkPhysicalDeviceExternalTensorInfoARM.nflags(address(), value);
            return this;
        }

        public Buffer pDescription(@NativeType("VkTensorDescriptionARM const *") VkTensorDescriptionARM value) {
            VkPhysicalDeviceExternalTensorInfoARM.npDescription(address(), value);
            return this;
        }

        public Buffer handleType(@NativeType("VkExternalMemoryHandleTypeFlagBits") int value) {
            VkPhysicalDeviceExternalTensorInfoARM.nhandleType(address(), value);
            return this;
        }
    }
}
