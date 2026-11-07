package org.lwjgl.util.vma;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;
import org.lwjgl.vulkan.VkDedicatedAllocationMemoryAllocateInfoNV;
import org.lwjgl.vulkan.VkExportMemoryAllocateInfo;
import org.lwjgl.vulkan.VkExportMemoryAllocateInfoKHR;
import org.lwjgl.vulkan.VkExportMemoryAllocateInfoNV;
import org.lwjgl.vulkan.VkExportMemoryWin32HandleInfoKHR;
import org.lwjgl.vulkan.VkExportMemoryWin32HandleInfoNV;
import org.lwjgl.vulkan.VkExportMetalObjectCreateInfoEXT;
import org.lwjgl.vulkan.VkImportAndroidHardwareBufferInfoANDROID;
import org.lwjgl.vulkan.VkImportMemoryFdInfoKHR;
import org.lwjgl.vulkan.VkImportMemoryHostPointerInfoEXT;
import org.lwjgl.vulkan.VkImportMemoryMetalHandleInfoEXT;
import org.lwjgl.vulkan.VkImportMemoryWin32HandleInfoKHR;
import org.lwjgl.vulkan.VkImportMemoryWin32HandleInfoNV;
import org.lwjgl.vulkan.VkImportMetalBufferInfoEXT;
import org.lwjgl.vulkan.VkMemoryAllocateFlagsInfo;
import org.lwjgl.vulkan.VkMemoryAllocateFlagsInfoKHR;
import org.lwjgl.vulkan.VkMemoryDedicatedAllocateInfo;
import org.lwjgl.vulkan.VkMemoryDedicatedAllocateInfoKHR;
import org.lwjgl.vulkan.VkMemoryDedicatedAllocateInfoTensorARM;
import org.lwjgl.vulkan.VkMemoryOpaqueCaptureAddressAllocateInfo;
import org.lwjgl.vulkan.VkMemoryOpaqueCaptureAddressAllocateInfoKHR;
import org.lwjgl.vulkan.VkMemoryPriorityAllocateInfoEXT;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vma.jar:org/lwjgl/util/vma/VmaPoolCreateInfo.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vma.jar:org/lwjgl/util/vma/VmaPoolCreateInfo.class */
public class VmaPoolCreateInfo extends Struct<VmaPoolCreateInfo> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int MEMORYTYPEINDEX;
    public static final int FLAGS;
    public static final int BLOCKSIZE;
    public static final int MINBLOCKCOUNT;
    public static final int MAXBLOCKCOUNT;
    public static final int PRIORITY;
    public static final int MINALLOCATIONALIGNMENT;
    public static final int PMEMORYALLOCATENEXT;

    static {
        Struct.Layout layout = __struct(__member(4), __member(4), __member(8), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(4), __member(8), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        MEMORYTYPEINDEX = layout.offsetof(0);
        FLAGS = layout.offsetof(1);
        BLOCKSIZE = layout.offsetof(2);
        MINBLOCKCOUNT = layout.offsetof(3);
        MAXBLOCKCOUNT = layout.offsetof(4);
        PRIORITY = layout.offsetof(5);
        MINALLOCATIONALIGNMENT = layout.offsetof(6);
        PMEMORYALLOCATENEXT = layout.offsetof(7);
    }

    protected VmaPoolCreateInfo(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VmaPoolCreateInfo create(long address, ByteBuffer container) {
        return new VmaPoolCreateInfo(address, container);
    }

    public VmaPoolCreateInfo(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("uint32_t")
    public int memoryTypeIndex() {
        return nmemoryTypeIndex(address());
    }

    @NativeType("VmaPoolCreateFlags")
    public int flags() {
        return nflags(address());
    }

    @NativeType("VkDeviceSize")
    public long blockSize() {
        return nblockSize(address());
    }

    @NativeType("size_t")
    public long minBlockCount() {
        return nminBlockCount(address());
    }

    @NativeType("size_t")
    public long maxBlockCount() {
        return nmaxBlockCount(address());
    }

    public float priority() {
        return npriority(address());
    }

    @NativeType("VkDeviceSize")
    public long minAllocationAlignment() {
        return nminAllocationAlignment(address());
    }

    @NativeType("void *")
    public long pMemoryAllocateNext() {
        return npMemoryAllocateNext(address());
    }

    public VmaPoolCreateInfo memoryTypeIndex(@NativeType("uint32_t") int value) {
        nmemoryTypeIndex(address(), value);
        return this;
    }

    public VmaPoolCreateInfo flags(@NativeType("VmaPoolCreateFlags") int value) {
        nflags(address(), value);
        return this;
    }

    public VmaPoolCreateInfo blockSize(@NativeType("VkDeviceSize") long value) {
        nblockSize(address(), value);
        return this;
    }

    public VmaPoolCreateInfo minBlockCount(@NativeType("size_t") long value) {
        nminBlockCount(address(), value);
        return this;
    }

    public VmaPoolCreateInfo maxBlockCount(@NativeType("size_t") long value) {
        nmaxBlockCount(address(), value);
        return this;
    }

    public VmaPoolCreateInfo priority(float value) {
        npriority(address(), value);
        return this;
    }

    public VmaPoolCreateInfo minAllocationAlignment(@NativeType("VkDeviceSize") long value) {
        nminAllocationAlignment(address(), value);
        return this;
    }

    public VmaPoolCreateInfo pMemoryAllocateNext(@NativeType("void *") long value) {
        npMemoryAllocateNext(address(), value);
        return this;
    }

    public VmaPoolCreateInfo pMemoryAllocateNext(VkDedicatedAllocationMemoryAllocateInfoNV value) {
        return pMemoryAllocateNext(value.pNext(pMemoryAllocateNext()).address());
    }

    public VmaPoolCreateInfo pMemoryAllocateNext(VkExportMemoryAllocateInfo value) {
        return pMemoryAllocateNext(value.pNext(pMemoryAllocateNext()).address());
    }

    public VmaPoolCreateInfo pMemoryAllocateNext(VkExportMemoryAllocateInfoKHR value) {
        return pMemoryAllocateNext(value.pNext(pMemoryAllocateNext()).address());
    }

    public VmaPoolCreateInfo pMemoryAllocateNext(VkExportMemoryAllocateInfoNV value) {
        return pMemoryAllocateNext(value.pNext(pMemoryAllocateNext()).address());
    }

    public VmaPoolCreateInfo pMemoryAllocateNext(VkExportMemoryWin32HandleInfoKHR value) {
        return pMemoryAllocateNext(value.pNext(pMemoryAllocateNext()).address());
    }

    public VmaPoolCreateInfo pMemoryAllocateNext(VkExportMemoryWin32HandleInfoNV value) {
        return pMemoryAllocateNext(value.pNext(pMemoryAllocateNext()).address());
    }

    public VmaPoolCreateInfo pMemoryAllocateNext(VkExportMetalObjectCreateInfoEXT value) {
        return pMemoryAllocateNext(value.pNext(pMemoryAllocateNext()).address());
    }

    public VmaPoolCreateInfo pMemoryAllocateNext(VkImportAndroidHardwareBufferInfoANDROID value) {
        return pMemoryAllocateNext(value.pNext(pMemoryAllocateNext()).address());
    }

    public VmaPoolCreateInfo pMemoryAllocateNext(VkImportMemoryFdInfoKHR value) {
        return pMemoryAllocateNext(value.pNext(pMemoryAllocateNext()).address());
    }

    public VmaPoolCreateInfo pMemoryAllocateNext(VkImportMemoryHostPointerInfoEXT value) {
        return pMemoryAllocateNext(value.pNext(pMemoryAllocateNext()).address());
    }

    public VmaPoolCreateInfo pMemoryAllocateNext(VkImportMemoryMetalHandleInfoEXT value) {
        return pMemoryAllocateNext(value.pNext(pMemoryAllocateNext()).address());
    }

    public VmaPoolCreateInfo pMemoryAllocateNext(VkImportMemoryWin32HandleInfoKHR value) {
        return pMemoryAllocateNext(value.pNext(pMemoryAllocateNext()).address());
    }

    public VmaPoolCreateInfo pMemoryAllocateNext(VkImportMemoryWin32HandleInfoNV value) {
        return pMemoryAllocateNext(value.pNext(pMemoryAllocateNext()).address());
    }

    public VmaPoolCreateInfo pMemoryAllocateNext(VkImportMetalBufferInfoEXT value) {
        return pMemoryAllocateNext(value.pNext(pMemoryAllocateNext()).address());
    }

    public VmaPoolCreateInfo pMemoryAllocateNext(VkMemoryAllocateFlagsInfo value) {
        return pMemoryAllocateNext(value.pNext(pMemoryAllocateNext()).address());
    }

    public VmaPoolCreateInfo pMemoryAllocateNext(VkMemoryAllocateFlagsInfoKHR value) {
        return pMemoryAllocateNext(value.pNext(pMemoryAllocateNext()).address());
    }

    public VmaPoolCreateInfo pMemoryAllocateNext(VkMemoryDedicatedAllocateInfo value) {
        return pMemoryAllocateNext(value.pNext(pMemoryAllocateNext()).address());
    }

    public VmaPoolCreateInfo pMemoryAllocateNext(VkMemoryDedicatedAllocateInfoKHR value) {
        return pMemoryAllocateNext(value.pNext(pMemoryAllocateNext()).address());
    }

    public VmaPoolCreateInfo pMemoryAllocateNext(VkMemoryDedicatedAllocateInfoTensorARM value) {
        return pMemoryAllocateNext(value.pNext(pMemoryAllocateNext()).address());
    }

    public VmaPoolCreateInfo pMemoryAllocateNext(VkMemoryOpaqueCaptureAddressAllocateInfo value) {
        return pMemoryAllocateNext(value.pNext(pMemoryAllocateNext()).address());
    }

    public VmaPoolCreateInfo pMemoryAllocateNext(VkMemoryOpaqueCaptureAddressAllocateInfoKHR value) {
        return pMemoryAllocateNext(value.pNext(pMemoryAllocateNext()).address());
    }

    public VmaPoolCreateInfo pMemoryAllocateNext(VkMemoryPriorityAllocateInfoEXT value) {
        return pMemoryAllocateNext(value.pNext(pMemoryAllocateNext()).address());
    }

    public VmaPoolCreateInfo set(int memoryTypeIndex, int flags, long blockSize, long minBlockCount, long maxBlockCount, float priority, long minAllocationAlignment, long pMemoryAllocateNext) {
        memoryTypeIndex(memoryTypeIndex);
        flags(flags);
        blockSize(blockSize);
        minBlockCount(minBlockCount);
        maxBlockCount(maxBlockCount);
        priority(priority);
        minAllocationAlignment(minAllocationAlignment);
        pMemoryAllocateNext(pMemoryAllocateNext);
        return this;
    }

    public VmaPoolCreateInfo set(VmaPoolCreateInfo src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VmaPoolCreateInfo malloc() {
        return new VmaPoolCreateInfo(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VmaPoolCreateInfo calloc() {
        return new VmaPoolCreateInfo(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VmaPoolCreateInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VmaPoolCreateInfo(MemoryUtil.memAddress(container), container);
    }

    public static VmaPoolCreateInfo create(long address) {
        return new VmaPoolCreateInfo(address, null);
    }

    public static VmaPoolCreateInfo createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VmaPoolCreateInfo(address, null);
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

    public static VmaPoolCreateInfo malloc(MemoryStack stack) {
        return new VmaPoolCreateInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VmaPoolCreateInfo calloc(MemoryStack stack) {
        return new VmaPoolCreateInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static int nmemoryTypeIndex(long struct) {
        return MemoryUtil.memGetInt(struct + MEMORYTYPEINDEX);
    }

    public static int nflags(long struct) {
        return MemoryUtil.memGetInt(struct + FLAGS);
    }

    public static long nblockSize(long struct) {
        return MemoryUtil.memGetLong(struct + BLOCKSIZE);
    }

    public static long nminBlockCount(long struct) {
        return MemoryUtil.memGetAddress(struct + MINBLOCKCOUNT);
    }

    public static long nmaxBlockCount(long struct) {
        return MemoryUtil.memGetAddress(struct + MAXBLOCKCOUNT);
    }

    public static float npriority(long struct) {
        return MemoryUtil.memGetFloat(struct + PRIORITY);
    }

    public static long nminAllocationAlignment(long struct) {
        return MemoryUtil.memGetLong(struct + MINALLOCATIONALIGNMENT);
    }

    public static long npMemoryAllocateNext(long struct) {
        return MemoryUtil.memGetAddress(struct + PMEMORYALLOCATENEXT);
    }

    public static void nmemoryTypeIndex(long struct, int value) {
        MemoryUtil.memPutInt(struct + MEMORYTYPEINDEX, value);
    }

    public static void nflags(long struct, int value) {
        MemoryUtil.memPutInt(struct + FLAGS, value);
    }

    public static void nblockSize(long struct, long value) {
        MemoryUtil.memPutLong(struct + BLOCKSIZE, value);
    }

    public static void nminBlockCount(long struct, long value) {
        MemoryUtil.memPutAddress(struct + MINBLOCKCOUNT, value);
    }

    public static void nmaxBlockCount(long struct, long value) {
        MemoryUtil.memPutAddress(struct + MAXBLOCKCOUNT, value);
    }

    public static void npriority(long struct, float value) {
        MemoryUtil.memPutFloat(struct + PRIORITY, value);
    }

    public static void nminAllocationAlignment(long struct, long value) {
        MemoryUtil.memPutLong(struct + MINALLOCATIONALIGNMENT, value);
    }

    public static void npMemoryAllocateNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PMEMORYALLOCATENEXT, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vma.jar:org/lwjgl/util/vma/VmaPoolCreateInfo$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vma.jar:org/lwjgl/util/vma/VmaPoolCreateInfo$Buffer.class */
    public static class Buffer extends StructBuffer<VmaPoolCreateInfo, Buffer> implements NativeResource {
        private static final VmaPoolCreateInfo ELEMENT_FACTORY = VmaPoolCreateInfo.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VmaPoolCreateInfo.SIZEOF);
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
        public VmaPoolCreateInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("uint32_t")
        public int memoryTypeIndex() {
            return VmaPoolCreateInfo.nmemoryTypeIndex(address());
        }

        @NativeType("VmaPoolCreateFlags")
        public int flags() {
            return VmaPoolCreateInfo.nflags(address());
        }

        @NativeType("VkDeviceSize")
        public long blockSize() {
            return VmaPoolCreateInfo.nblockSize(address());
        }

        @NativeType("size_t")
        public long minBlockCount() {
            return VmaPoolCreateInfo.nminBlockCount(address());
        }

        @NativeType("size_t")
        public long maxBlockCount() {
            return VmaPoolCreateInfo.nmaxBlockCount(address());
        }

        public float priority() {
            return VmaPoolCreateInfo.npriority(address());
        }

        @NativeType("VkDeviceSize")
        public long minAllocationAlignment() {
            return VmaPoolCreateInfo.nminAllocationAlignment(address());
        }

        @NativeType("void *")
        public long pMemoryAllocateNext() {
            return VmaPoolCreateInfo.npMemoryAllocateNext(address());
        }

        public Buffer memoryTypeIndex(@NativeType("uint32_t") int value) {
            VmaPoolCreateInfo.nmemoryTypeIndex(address(), value);
            return this;
        }

        public Buffer flags(@NativeType("VmaPoolCreateFlags") int value) {
            VmaPoolCreateInfo.nflags(address(), value);
            return this;
        }

        public Buffer blockSize(@NativeType("VkDeviceSize") long value) {
            VmaPoolCreateInfo.nblockSize(address(), value);
            return this;
        }

        public Buffer minBlockCount(@NativeType("size_t") long value) {
            VmaPoolCreateInfo.nminBlockCount(address(), value);
            return this;
        }

        public Buffer maxBlockCount(@NativeType("size_t") long value) {
            VmaPoolCreateInfo.nmaxBlockCount(address(), value);
            return this;
        }

        public Buffer priority(float value) {
            VmaPoolCreateInfo.npriority(address(), value);
            return this;
        }

        public Buffer minAllocationAlignment(@NativeType("VkDeviceSize") long value) {
            VmaPoolCreateInfo.nminAllocationAlignment(address(), value);
            return this;
        }

        public Buffer pMemoryAllocateNext(@NativeType("void *") long value) {
            VmaPoolCreateInfo.npMemoryAllocateNext(address(), value);
            return this;
        }

        public Buffer pMemoryAllocateNext(VkDedicatedAllocationMemoryAllocateInfoNV value) {
            return pMemoryAllocateNext(value.pNext(pMemoryAllocateNext()).address());
        }

        public Buffer pMemoryAllocateNext(VkExportMemoryAllocateInfo value) {
            return pMemoryAllocateNext(value.pNext(pMemoryAllocateNext()).address());
        }

        public Buffer pMemoryAllocateNext(VkExportMemoryAllocateInfoKHR value) {
            return pMemoryAllocateNext(value.pNext(pMemoryAllocateNext()).address());
        }

        public Buffer pMemoryAllocateNext(VkExportMemoryAllocateInfoNV value) {
            return pMemoryAllocateNext(value.pNext(pMemoryAllocateNext()).address());
        }

        public Buffer pMemoryAllocateNext(VkExportMemoryWin32HandleInfoKHR value) {
            return pMemoryAllocateNext(value.pNext(pMemoryAllocateNext()).address());
        }

        public Buffer pMemoryAllocateNext(VkExportMemoryWin32HandleInfoNV value) {
            return pMemoryAllocateNext(value.pNext(pMemoryAllocateNext()).address());
        }

        public Buffer pMemoryAllocateNext(VkExportMetalObjectCreateInfoEXT value) {
            return pMemoryAllocateNext(value.pNext(pMemoryAllocateNext()).address());
        }

        public Buffer pMemoryAllocateNext(VkImportAndroidHardwareBufferInfoANDROID value) {
            return pMemoryAllocateNext(value.pNext(pMemoryAllocateNext()).address());
        }

        public Buffer pMemoryAllocateNext(VkImportMemoryFdInfoKHR value) {
            return pMemoryAllocateNext(value.pNext(pMemoryAllocateNext()).address());
        }

        public Buffer pMemoryAllocateNext(VkImportMemoryHostPointerInfoEXT value) {
            return pMemoryAllocateNext(value.pNext(pMemoryAllocateNext()).address());
        }

        public Buffer pMemoryAllocateNext(VkImportMemoryMetalHandleInfoEXT value) {
            return pMemoryAllocateNext(value.pNext(pMemoryAllocateNext()).address());
        }

        public Buffer pMemoryAllocateNext(VkImportMemoryWin32HandleInfoKHR value) {
            return pMemoryAllocateNext(value.pNext(pMemoryAllocateNext()).address());
        }

        public Buffer pMemoryAllocateNext(VkImportMemoryWin32HandleInfoNV value) {
            return pMemoryAllocateNext(value.pNext(pMemoryAllocateNext()).address());
        }

        public Buffer pMemoryAllocateNext(VkImportMetalBufferInfoEXT value) {
            return pMemoryAllocateNext(value.pNext(pMemoryAllocateNext()).address());
        }

        public Buffer pMemoryAllocateNext(VkMemoryAllocateFlagsInfo value) {
            return pMemoryAllocateNext(value.pNext(pMemoryAllocateNext()).address());
        }

        public Buffer pMemoryAllocateNext(VkMemoryAllocateFlagsInfoKHR value) {
            return pMemoryAllocateNext(value.pNext(pMemoryAllocateNext()).address());
        }

        public Buffer pMemoryAllocateNext(VkMemoryDedicatedAllocateInfo value) {
            return pMemoryAllocateNext(value.pNext(pMemoryAllocateNext()).address());
        }

        public Buffer pMemoryAllocateNext(VkMemoryDedicatedAllocateInfoKHR value) {
            return pMemoryAllocateNext(value.pNext(pMemoryAllocateNext()).address());
        }

        public Buffer pMemoryAllocateNext(VkMemoryDedicatedAllocateInfoTensorARM value) {
            return pMemoryAllocateNext(value.pNext(pMemoryAllocateNext()).address());
        }

        public Buffer pMemoryAllocateNext(VkMemoryOpaqueCaptureAddressAllocateInfo value) {
            return pMemoryAllocateNext(value.pNext(pMemoryAllocateNext()).address());
        }

        public Buffer pMemoryAllocateNext(VkMemoryOpaqueCaptureAddressAllocateInfoKHR value) {
            return pMemoryAllocateNext(value.pNext(pMemoryAllocateNext()).address());
        }

        public Buffer pMemoryAllocateNext(VkMemoryPriorityAllocateInfoEXT value) {
            return pMemoryAllocateNext(value.pNext(pMemoryAllocateNext()).address());
        }
    }
}
