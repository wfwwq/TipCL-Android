package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceImageDrmFormatModifierInfoEXT.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceImageDrmFormatModifierInfoEXT.class */
public class VkPhysicalDeviceImageDrmFormatModifierInfoEXT extends Struct<VkPhysicalDeviceImageDrmFormatModifierInfoEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int DRMFORMATMODIFIER;
    public static final int SHARINGMODE;
    public static final int QUEUEFAMILYINDEXCOUNT;
    public static final int PQUEUEFAMILYINDICES;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(8), __member(4), __member(4), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        DRMFORMATMODIFIER = layout.offsetof(2);
        SHARINGMODE = layout.offsetof(3);
        QUEUEFAMILYINDEXCOUNT = layout.offsetof(4);
        PQUEUEFAMILYINDICES = layout.offsetof(5);
    }

    protected VkPhysicalDeviceImageDrmFormatModifierInfoEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceImageDrmFormatModifierInfoEXT create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceImageDrmFormatModifierInfoEXT(address, container);
    }

    public VkPhysicalDeviceImageDrmFormatModifierInfoEXT(ByteBuffer container) {
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

    @NativeType("uint64_t")
    public long drmFormatModifier() {
        return ndrmFormatModifier(address());
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

    public VkPhysicalDeviceImageDrmFormatModifierInfoEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceImageDrmFormatModifierInfoEXT sType$Default() {
        return sType(EXTImageDrmFormatModifier.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_DRM_FORMAT_MODIFIER_INFO_EXT);
    }

    public VkPhysicalDeviceImageDrmFormatModifierInfoEXT pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceImageDrmFormatModifierInfoEXT drmFormatModifier(@NativeType("uint64_t") long value) {
        ndrmFormatModifier(address(), value);
        return this;
    }

    public VkPhysicalDeviceImageDrmFormatModifierInfoEXT sharingMode(@NativeType("VkSharingMode") int value) {
        nsharingMode(address(), value);
        return this;
    }

    public VkPhysicalDeviceImageDrmFormatModifierInfoEXT queueFamilyIndexCount(@NativeType("uint32_t") int value) {
        nqueueFamilyIndexCount(address(), value);
        return this;
    }

    public VkPhysicalDeviceImageDrmFormatModifierInfoEXT pQueueFamilyIndices(@NativeType("uint32_t const *") IntBuffer value) {
        npQueueFamilyIndices(address(), value);
        return this;
    }

    public VkPhysicalDeviceImageDrmFormatModifierInfoEXT set(int sType, long pNext, long drmFormatModifier, int sharingMode, int queueFamilyIndexCount, IntBuffer pQueueFamilyIndices) {
        sType(sType);
        pNext(pNext);
        drmFormatModifier(drmFormatModifier);
        sharingMode(sharingMode);
        queueFamilyIndexCount(queueFamilyIndexCount);
        pQueueFamilyIndices(pQueueFamilyIndices);
        return this;
    }

    public VkPhysicalDeviceImageDrmFormatModifierInfoEXT set(VkPhysicalDeviceImageDrmFormatModifierInfoEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceImageDrmFormatModifierInfoEXT malloc() {
        return new VkPhysicalDeviceImageDrmFormatModifierInfoEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceImageDrmFormatModifierInfoEXT calloc() {
        return new VkPhysicalDeviceImageDrmFormatModifierInfoEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceImageDrmFormatModifierInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceImageDrmFormatModifierInfoEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceImageDrmFormatModifierInfoEXT create(long address) {
        return new VkPhysicalDeviceImageDrmFormatModifierInfoEXT(address, null);
    }

    public static VkPhysicalDeviceImageDrmFormatModifierInfoEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceImageDrmFormatModifierInfoEXT(address, null);
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

    public static VkPhysicalDeviceImageDrmFormatModifierInfoEXT malloc(MemoryStack stack) {
        return new VkPhysicalDeviceImageDrmFormatModifierInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceImageDrmFormatModifierInfoEXT calloc(MemoryStack stack) {
        return new VkPhysicalDeviceImageDrmFormatModifierInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static long ndrmFormatModifier(long struct) {
        return MemoryUtil.memGetLong(struct + DRMFORMATMODIFIER);
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

    public static void ndrmFormatModifier(long struct, long value) {
        MemoryUtil.memPutLong(struct + DRMFORMATMODIFIER, value);
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

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceImageDrmFormatModifierInfoEXT$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceImageDrmFormatModifierInfoEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceImageDrmFormatModifierInfoEXT, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceImageDrmFormatModifierInfoEXT ELEMENT_FACTORY = VkPhysicalDeviceImageDrmFormatModifierInfoEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceImageDrmFormatModifierInfoEXT.SIZEOF);
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
        public VkPhysicalDeviceImageDrmFormatModifierInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceImageDrmFormatModifierInfoEXT.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkPhysicalDeviceImageDrmFormatModifierInfoEXT.npNext(address());
        }

        @NativeType("uint64_t")
        public long drmFormatModifier() {
            return VkPhysicalDeviceImageDrmFormatModifierInfoEXT.ndrmFormatModifier(address());
        }

        @NativeType("VkSharingMode")
        public int sharingMode() {
            return VkPhysicalDeviceImageDrmFormatModifierInfoEXT.nsharingMode(address());
        }

        @NativeType("uint32_t")
        public int queueFamilyIndexCount() {
            return VkPhysicalDeviceImageDrmFormatModifierInfoEXT.nqueueFamilyIndexCount(address());
        }

        @NativeType("uint32_t const *")
        public IntBuffer pQueueFamilyIndices() {
            return VkPhysicalDeviceImageDrmFormatModifierInfoEXT.npQueueFamilyIndices(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceImageDrmFormatModifierInfoEXT.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(EXTImageDrmFormatModifier.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_DRM_FORMAT_MODIFIER_INFO_EXT);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkPhysicalDeviceImageDrmFormatModifierInfoEXT.npNext(address(), value);
            return this;
        }

        public Buffer drmFormatModifier(@NativeType("uint64_t") long value) {
            VkPhysicalDeviceImageDrmFormatModifierInfoEXT.ndrmFormatModifier(address(), value);
            return this;
        }

        public Buffer sharingMode(@NativeType("VkSharingMode") int value) {
            VkPhysicalDeviceImageDrmFormatModifierInfoEXT.nsharingMode(address(), value);
            return this;
        }

        public Buffer queueFamilyIndexCount(@NativeType("uint32_t") int value) {
            VkPhysicalDeviceImageDrmFormatModifierInfoEXT.nqueueFamilyIndexCount(address(), value);
            return this;
        }

        public Buffer pQueueFamilyIndices(@NativeType("uint32_t const *") IntBuffer value) {
            VkPhysicalDeviceImageDrmFormatModifierInfoEXT.npQueueFamilyIndices(address(), value);
            return this;
        }
    }
}
