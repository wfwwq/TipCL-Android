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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkBufferCreateInfo.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkBufferCreateInfo.class */
public class VkBufferCreateInfo extends Struct<VkBufferCreateInfo> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int FLAGS;
    public static final int SIZE;
    public static final int USAGE;
    public static final int SHARINGMODE;
    public static final int QUEUEFAMILYINDEXCOUNT;
    public static final int PQUEUEFAMILYINDICES;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(8), __member(4), __member(4), __member(4), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        SIZE = layout.offsetof(3);
        USAGE = layout.offsetof(4);
        SHARINGMODE = layout.offsetof(5);
        QUEUEFAMILYINDEXCOUNT = layout.offsetof(6);
        PQUEUEFAMILYINDICES = layout.offsetof(7);
    }

    protected VkBufferCreateInfo(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkBufferCreateInfo create(long address, ByteBuffer container) {
        return new VkBufferCreateInfo(address, container);
    }

    public VkBufferCreateInfo(ByteBuffer container) {
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

    @NativeType("VkBufferCreateFlags")
    public int flags() {
        return nflags(address());
    }

    @NativeType("VkDeviceSize")
    public long size() {
        return nsize(address());
    }

    @NativeType("VkBufferUsageFlags")
    public int usage() {
        return nusage(address());
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

    public VkBufferCreateInfo sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkBufferCreateInfo sType$Default() {
        return sType(12);
    }

    public VkBufferCreateInfo pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkBufferCreateInfo pNext(VkBufferDeviceAddressCreateInfoEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkBufferCreateInfo pNext(VkBufferOpaqueCaptureAddressCreateInfo value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkBufferCreateInfo pNext(VkBufferOpaqueCaptureAddressCreateInfoKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkBufferCreateInfo pNext(VkBufferUsageFlags2CreateInfo value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkBufferCreateInfo pNext(VkBufferUsageFlags2CreateInfoKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkBufferCreateInfo pNext(VkDedicatedAllocationBufferCreateInfoNV value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkBufferCreateInfo pNext(VkExternalMemoryBufferCreateInfo value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkBufferCreateInfo pNext(VkExternalMemoryBufferCreateInfoKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkBufferCreateInfo pNext(VkOpaqueCaptureDescriptorDataCreateInfoEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkBufferCreateInfo pNext(VkVideoProfileListInfoKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkBufferCreateInfo flags(@NativeType("VkBufferCreateFlags") int value) {
        nflags(address(), value);
        return this;
    }

    public VkBufferCreateInfo size(@NativeType("VkDeviceSize") long value) {
        nsize(address(), value);
        return this;
    }

    public VkBufferCreateInfo usage(@NativeType("VkBufferUsageFlags") int value) {
        nusage(address(), value);
        return this;
    }

    public VkBufferCreateInfo sharingMode(@NativeType("VkSharingMode") int value) {
        nsharingMode(address(), value);
        return this;
    }

    public VkBufferCreateInfo queueFamilyIndexCount(@NativeType("uint32_t") int value) {
        nqueueFamilyIndexCount(address(), value);
        return this;
    }

    public VkBufferCreateInfo pQueueFamilyIndices(@NativeType("uint32_t const *") IntBuffer value) {
        npQueueFamilyIndices(address(), value);
        return this;
    }

    public VkBufferCreateInfo set(int sType, long pNext, int flags, long size, int usage, int sharingMode, int queueFamilyIndexCount, IntBuffer pQueueFamilyIndices) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        size(size);
        usage(usage);
        sharingMode(sharingMode);
        queueFamilyIndexCount(queueFamilyIndexCount);
        pQueueFamilyIndices(pQueueFamilyIndices);
        return this;
    }

    public VkBufferCreateInfo set(VkBufferCreateInfo src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkBufferCreateInfo malloc() {
        return new VkBufferCreateInfo(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkBufferCreateInfo calloc() {
        return new VkBufferCreateInfo(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkBufferCreateInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkBufferCreateInfo(MemoryUtil.memAddress(container), container);
    }

    public static VkBufferCreateInfo create(long address) {
        return new VkBufferCreateInfo(address, null);
    }

    public static VkBufferCreateInfo createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkBufferCreateInfo(address, null);
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

    public static VkBufferCreateInfo malloc(MemoryStack stack) {
        return new VkBufferCreateInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkBufferCreateInfo calloc(MemoryStack stack) {
        return new VkBufferCreateInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nflags(long struct) {
        return MemoryUtil.memGetInt(struct + FLAGS);
    }

    public static long nsize(long struct) {
        return MemoryUtil.memGetLong(struct + SIZE);
    }

    public static int nusage(long struct) {
        return MemoryUtil.memGetInt(struct + USAGE);
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

    public static void nflags(long struct, int value) {
        MemoryUtil.memPutInt(struct + FLAGS, value);
    }

    public static void nsize(long struct, long value) {
        MemoryUtil.memPutLong(struct + SIZE, value);
    }

    public static void nusage(long struct, int value) {
        MemoryUtil.memPutInt(struct + USAGE, value);
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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkBufferCreateInfo$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkBufferCreateInfo$Buffer.class */
    public static class Buffer extends StructBuffer<VkBufferCreateInfo, Buffer> implements NativeResource {
        private static final VkBufferCreateInfo ELEMENT_FACTORY = VkBufferCreateInfo.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkBufferCreateInfo.SIZEOF);
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
        public VkBufferCreateInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkBufferCreateInfo.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkBufferCreateInfo.npNext(address());
        }

        @NativeType("VkBufferCreateFlags")
        public int flags() {
            return VkBufferCreateInfo.nflags(address());
        }

        @NativeType("VkDeviceSize")
        public long size() {
            return VkBufferCreateInfo.nsize(address());
        }

        @NativeType("VkBufferUsageFlags")
        public int usage() {
            return VkBufferCreateInfo.nusage(address());
        }

        @NativeType("VkSharingMode")
        public int sharingMode() {
            return VkBufferCreateInfo.nsharingMode(address());
        }

        @NativeType("uint32_t")
        public int queueFamilyIndexCount() {
            return VkBufferCreateInfo.nqueueFamilyIndexCount(address());
        }

        @NativeType("uint32_t const *")
        public IntBuffer pQueueFamilyIndices() {
            return VkBufferCreateInfo.npQueueFamilyIndices(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkBufferCreateInfo.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(12);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkBufferCreateInfo.npNext(address(), value);
            return this;
        }

        public Buffer pNext(VkBufferDeviceAddressCreateInfoEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkBufferOpaqueCaptureAddressCreateInfo value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkBufferOpaqueCaptureAddressCreateInfoKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkBufferUsageFlags2CreateInfo value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkBufferUsageFlags2CreateInfoKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkDedicatedAllocationBufferCreateInfoNV value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkExternalMemoryBufferCreateInfo value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkExternalMemoryBufferCreateInfoKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkOpaqueCaptureDescriptorDataCreateInfoEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkVideoProfileListInfoKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer flags(@NativeType("VkBufferCreateFlags") int value) {
            VkBufferCreateInfo.nflags(address(), value);
            return this;
        }

        public Buffer size(@NativeType("VkDeviceSize") long value) {
            VkBufferCreateInfo.nsize(address(), value);
            return this;
        }

        public Buffer usage(@NativeType("VkBufferUsageFlags") int value) {
            VkBufferCreateInfo.nusage(address(), value);
            return this;
        }

        public Buffer sharingMode(@NativeType("VkSharingMode") int value) {
            VkBufferCreateInfo.nsharingMode(address(), value);
            return this;
        }

        public Buffer queueFamilyIndexCount(@NativeType("uint32_t") int value) {
            VkBufferCreateInfo.nqueueFamilyIndexCount(address(), value);
            return this;
        }

        public Buffer pQueueFamilyIndices(@NativeType("uint32_t const *") IntBuffer value) {
            VkBufferCreateInfo.npQueueFamilyIndices(address(), value);
            return this;
        }
    }
}
