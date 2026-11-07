package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.Checks;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkTensorCreateInfoARM.class */
public class VkTensorCreateInfoARM extends Struct<VkTensorCreateInfoARM> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int FLAGS;
    public static final int PDESCRIPTION;
    public static final int SHARINGMODE;
    public static final int QUEUEFAMILYINDEXCOUNT;
    public static final int PQUEUEFAMILYINDICES;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(8), __member(POINTER_SIZE), __member(4), __member(4), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        PDESCRIPTION = layout.offsetof(3);
        SHARINGMODE = layout.offsetof(4);
        QUEUEFAMILYINDEXCOUNT = layout.offsetof(5);
        PQUEUEFAMILYINDICES = layout.offsetof(6);
    }

    protected VkTensorCreateInfoARM(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkTensorCreateInfoARM create(long address, ByteBuffer container) {
        return new VkTensorCreateInfoARM(address, container);
    }

    public VkTensorCreateInfoARM(ByteBuffer container) {
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

    @NativeType("VkSharingMode")
    public int sharingMode() {
        return nsharingMode(address());
    }

    @NativeType("uint32_t")
    public int queueFamilyIndexCount() {
        return nqueueFamilyIndexCount(address());
    }

    @NativeType("uint32_t const *")
    public IntBuffer pQueueFamilyIndices() {
        return npQueueFamilyIndices(address());
    }

    public VkTensorCreateInfoARM sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkTensorCreateInfoARM sType$Default() {
        return sType(1000460000);
    }

    public VkTensorCreateInfoARM pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkTensorCreateInfoARM pNext(VkExternalMemoryTensorCreateInfoARM value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkTensorCreateInfoARM pNext(VkOpaqueCaptureDataCreateInfoEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkTensorCreateInfoARM pNext(VkOpaqueCaptureDescriptorDataCreateInfoEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkTensorCreateInfoARM flags(@NativeType("VkTensorCreateFlagsARM") long value) {
        nflags(address(), value);
        return this;
    }

    public VkTensorCreateInfoARM pDescription(@NativeType("VkTensorDescriptionARM const *") VkTensorDescriptionARM value) {
        npDescription(address(), value);
        return this;
    }

    public VkTensorCreateInfoARM sharingMode(@NativeType("VkSharingMode") int value) {
        nsharingMode(address(), value);
        return this;
    }

    public VkTensorCreateInfoARM queueFamilyIndexCount(@NativeType("uint32_t") int value) {
        nqueueFamilyIndexCount(address(), value);
        return this;
    }

    public VkTensorCreateInfoARM pQueueFamilyIndices(@NativeType("uint32_t const *") IntBuffer value) {
        npQueueFamilyIndices(address(), value);
        return this;
    }

    public VkTensorCreateInfoARM set(int sType, long pNext, long flags, VkTensorDescriptionARM pDescription, int sharingMode, int queueFamilyIndexCount, IntBuffer pQueueFamilyIndices) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        pDescription(pDescription);
        sharingMode(sharingMode);
        queueFamilyIndexCount(queueFamilyIndexCount);
        pQueueFamilyIndices(pQueueFamilyIndices);
        return this;
    }

    public VkTensorCreateInfoARM set(VkTensorCreateInfoARM src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkTensorCreateInfoARM malloc() {
        return new VkTensorCreateInfoARM(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkTensorCreateInfoARM calloc() {
        return new VkTensorCreateInfoARM(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkTensorCreateInfoARM create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkTensorCreateInfoARM(MemoryUtil.memAddress(container), container);
    }

    public static VkTensorCreateInfoARM create(long address) {
        return new VkTensorCreateInfoARM(address, null);
    }

    public static VkTensorCreateInfoARM createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkTensorCreateInfoARM(address, null);
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

    public static VkTensorCreateInfoARM malloc(MemoryStack stack) {
        return new VkTensorCreateInfoARM(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkTensorCreateInfoARM calloc(MemoryStack stack) {
        return new VkTensorCreateInfoARM(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nsharingMode(long struct) {
        return MemoryUtil.memGetInt(struct + SHARINGMODE);
    }

    public static int nqueueFamilyIndexCount(long struct) {
        return MemoryUtil.memGetInt(struct + QUEUEFAMILYINDEXCOUNT);
    }

    public static IntBuffer npQueueFamilyIndices(long struct) {
        return MemoryUtil.memIntBufferSafe(MemoryUtil.memGetAddress(struct + PQUEUEFAMILYINDICES), nqueueFamilyIndexCount(struct));
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

    public static void nsharingMode(long struct, int value) {
        MemoryUtil.memPutInt(struct + SHARINGMODE, value);
    }

    public static void nqueueFamilyIndexCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + QUEUEFAMILYINDEXCOUNT, value);
    }

    public static void npQueueFamilyIndices(long struct, IntBuffer value) {
        MemoryUtil.memPutAddress(struct + PQUEUEFAMILYINDICES, MemoryUtil.memAddressSafe(value));
        if (value != null) {
            nqueueFamilyIndexCount(struct, value.remaining());
        }
    }

    public static void validate(long struct) {
        long pDescription = MemoryUtil.memGetAddress(struct + PDESCRIPTION);
        Checks.check(pDescription);
        VkTensorDescriptionARM.validate(pDescription);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkTensorCreateInfoARM$Buffer.class */
    public static class Buffer extends StructBuffer<VkTensorCreateInfoARM, Buffer> implements NativeResource {
        private static final VkTensorCreateInfoARM ELEMENT_FACTORY = VkTensorCreateInfoARM.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkTensorCreateInfoARM.SIZEOF);
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
        public VkTensorCreateInfoARM getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkTensorCreateInfoARM.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkTensorCreateInfoARM.npNext(address());
        }

        @NativeType("VkTensorCreateFlagsARM")
        public long flags() {
            return VkTensorCreateInfoARM.nflags(address());
        }

        @NativeType("VkTensorDescriptionARM const *")
        public VkTensorDescriptionARM pDescription() {
            return VkTensorCreateInfoARM.npDescription(address());
        }

        @NativeType("VkSharingMode")
        public int sharingMode() {
            return VkTensorCreateInfoARM.nsharingMode(address());
        }

        @NativeType("uint32_t")
        public int queueFamilyIndexCount() {
            return VkTensorCreateInfoARM.nqueueFamilyIndexCount(address());
        }

        @NativeType("uint32_t const *")
        public IntBuffer pQueueFamilyIndices() {
            return VkTensorCreateInfoARM.npQueueFamilyIndices(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkTensorCreateInfoARM.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000460000);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkTensorCreateInfoARM.npNext(address(), value);
            return this;
        }

        public Buffer pNext(VkExternalMemoryTensorCreateInfoARM value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkOpaqueCaptureDataCreateInfoEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkOpaqueCaptureDescriptorDataCreateInfoEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer flags(@NativeType("VkTensorCreateFlagsARM") long value) {
            VkTensorCreateInfoARM.nflags(address(), value);
            return this;
        }

        public Buffer pDescription(@NativeType("VkTensorDescriptionARM const *") VkTensorDescriptionARM value) {
            VkTensorCreateInfoARM.npDescription(address(), value);
            return this;
        }

        public Buffer sharingMode(@NativeType("VkSharingMode") int value) {
            VkTensorCreateInfoARM.nsharingMode(address(), value);
            return this;
        }

        public Buffer queueFamilyIndexCount(@NativeType("uint32_t") int value) {
            VkTensorCreateInfoARM.nqueueFamilyIndexCount(address(), value);
            return this;
        }

        public Buffer pQueueFamilyIndices(@NativeType("uint32_t const *") IntBuffer value) {
            VkTensorCreateInfoARM.npQueueFamilyIndices(address(), value);
            return this;
        }
    }
}
