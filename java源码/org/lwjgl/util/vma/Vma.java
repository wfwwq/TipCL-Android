package org.lwjgl.util.vma;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.nio.LongBuffer;
import org.lwjgl.PointerBuffer;
import org.lwjgl.system.Checks;
import org.lwjgl.system.CustomBuffer;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.util.vma.VmaAllocationInfo;
import org.lwjgl.util.vma.VmaBudget;
import org.lwjgl.vulkan.VkBufferCreateInfo;
import org.lwjgl.vulkan.VkImageCreateInfo;
import org.lwjgl.vulkan.VkMemoryRequirements;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vma.jar:org/lwjgl/util/vma/Vma.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vma.jar:org/lwjgl/util/vma/Vma.class */
public class Vma {
    public static final int VMA_ALLOCATOR_CREATE_EXTERNALLY_SYNCHRONIZED_BIT = 1;
    public static final int VMA_ALLOCATOR_CREATE_KHR_DEDICATED_ALLOCATION_BIT = 2;
    public static final int VMA_ALLOCATOR_CREATE_KHR_BIND_MEMORY2_BIT = 4;
    public static final int VMA_ALLOCATOR_CREATE_EXT_MEMORY_BUDGET_BIT = 8;
    public static final int VMA_ALLOCATOR_CREATE_AMD_DEVICE_COHERENT_MEMORY_BIT = 16;
    public static final int VMA_ALLOCATOR_CREATE_BUFFER_DEVICE_ADDRESS_BIT = 32;
    public static final int VMA_ALLOCATOR_CREATE_EXT_MEMORY_PRIORITY_BIT = 64;
    public static final int VMA_ALLOCATOR_CREATE_KHR_MAINTENANCE4_BIT = 128;
    public static final int VMA_ALLOCATOR_CREATE_KHR_MAINTENANCE5_BIT = 256;
    public static final int VMA_ALLOCATOR_CREATE_KHR_EXTERNAL_MEMORY_WIN32_BIT = 512;
    public static final int VMA_MEMORY_USAGE_UNKNOWN = 0;
    public static final int VMA_MEMORY_USAGE_GPU_ONLY = 1;
    public static final int VMA_MEMORY_USAGE_CPU_ONLY = 2;
    public static final int VMA_MEMORY_USAGE_CPU_TO_GPU = 3;
    public static final int VMA_MEMORY_USAGE_GPU_TO_CPU = 4;
    public static final int VMA_MEMORY_USAGE_CPU_COPY = 5;
    public static final int VMA_MEMORY_USAGE_GPU_LAZILY_ALLOCATED = 6;
    public static final int VMA_MEMORY_USAGE_AUTO = 7;
    public static final int VMA_MEMORY_USAGE_AUTO_PREFER_DEVICE = 8;
    public static final int VMA_MEMORY_USAGE_AUTO_PREFER_HOST = 9;
    public static final int VMA_ALLOCATION_CREATE_DEDICATED_MEMORY_BIT = 1;
    public static final int VMA_ALLOCATION_CREATE_NEVER_ALLOCATE_BIT = 2;
    public static final int VMA_ALLOCATION_CREATE_MAPPED_BIT = 4;
    public static final int VMA_ALLOCATION_CREATE_USER_DATA_COPY_STRING_BIT = 32;
    public static final int VMA_ALLOCATION_CREATE_UPPER_ADDRESS_BIT = 64;
    public static final int VMA_ALLOCATION_CREATE_DONT_BIND_BIT = 128;
    public static final int VMA_ALLOCATION_CREATE_WITHIN_BUDGET_BIT = 256;
    public static final int VMA_ALLOCATION_CREATE_CAN_ALIAS_BIT = 512;
    public static final int VMA_ALLOCATION_CREATE_HOST_ACCESS_SEQUENTIAL_WRITE_BIT = 1024;
    public static final int VMA_ALLOCATION_CREATE_HOST_ACCESS_RANDOM_BIT = 2048;
    public static final int VMA_ALLOCATION_CREATE_HOST_ACCESS_ALLOW_TRANSFER_INSTEAD_BIT = 4096;
    public static final int VMA_ALLOCATION_CREATE_STRATEGY_MIN_MEMORY_BIT = 65536;
    public static final int VMA_ALLOCATION_CREATE_STRATEGY_MIN_TIME_BIT = 131072;
    public static final int VMA_ALLOCATION_CREATE_STRATEGY_MIN_OFFSET_BIT = 262144;
    public static final int VMA_ALLOCATION_CREATE_STRATEGY_BEST_FIT_BIT = 65536;
    public static final int VMA_VMA_ALLOCATION_CREATE_STRATEGY_FIRST_FIT_BIT = 131072;
    public static final int VMA_ALLOCATION_CREATE_STRATEGY_MASK = 458752;
    public static final int VMA_POOL_CREATE_IGNORE_BUFFER_IMAGE_GRANULARITY_BIT = 2;
    public static final int VMA_POOL_CREATE_LINEAR_ALGORITHM_BIT = 4;
    public static final int VMA_POOL_CREATE_ALGORITHM_MASK = 4;
    public static final int VMA_DEFRAGMENTATION_FLAG_ALGORITHM_FAST_BIT = 1;
    public static final int VMA_DEFRAGMENTATION_FLAG_ALGORITHM_BALANCED_BIT = 2;
    public static final int VMA_DEFRAGMENTATION_FLAG_ALGORITHM_FULL_BIT = 4;
    public static final int VMA_DEFRAGMENTATION_FLAG_ALGORITHM_EXTENSIVE_BIT = 8;
    public static final int VMA_DEFRAGMENTATION_FLAG_ALGORITHM_MASK = 15;
    public static final int VMA_DEFRAGMENTATION_MOVE_OPERATION_COPY = 0;
    public static final int VMA_DEFRAGMENTATION_MOVE_OPERATION_IGNORE = 1;
    public static final int VMA_DEFRAGMENTATION_MOVE_OPERATION_DESTROY = 2;
    public static final int VMA_VIRTUAL_BLOCK_CREATE_LINEAR_ALGORITHM_BIT = 1;
    public static final int VMA_VIRTUAL_BLOCK_CREATE_ALGORITHM_MASK = 1;
    public static final int VMA_VIRTUAL_ALLOCATION_CREATE_UPPER_ADDRESS_BIT = 64;
    public static final int VMA_VIRTUAL_ALLOCATION_CREATE_STRATEGY_MIN_MEMORY_BIT = 65536;
    public static final int VMA_VIRTUAL_ALLOCATION_CREATE_STRATEGY_MIN_TIME_BIT = 131072;
    public static final int VMA_VIRTUAL_ALLOCATION_CREATE_STRATEGY_MIN_OFFSET_BIT = 262144;
    public static final int VMA_VIRTUAL_ALLOCATION_CREATE_STRATEGY_MASK = 458752;

    public static native int nvmaCreateAllocator(long j, long j2);

    public static native void nvmaDestroyAllocator(long j);

    public static native void nvmaGetAllocatorInfo(long j, long j2);

    public static native void nvmaGetPhysicalDeviceProperties(long j, long j2);

    public static native void nvmaGetMemoryProperties(long j, long j2);

    public static native void nvmaGetMemoryTypeProperties(long j, int i, long j2);

    public static native void nvmaSetCurrentFrameIndex(long j, int i);

    public static native void nvmaCalculateStatistics(long j, long j2);

    public static native void nvmaGetHeapBudgets(long j, long j2);

    public static native int nvmaFindMemoryTypeIndex(long j, int i, long j2, long j3);

    public static native int nvmaFindMemoryTypeIndexForBufferInfo(long j, long j2, long j3, long j4);

    public static native int nvmaFindMemoryTypeIndexForImageInfo(long j, long j2, long j3, long j4);

    public static native int nvmaCreatePool(long j, long j2, long j3);

    public static native void nvmaDestroyPool(long j, long j2);

    public static native void nvmaGetPoolStatistics(long j, long j2, long j3);

    public static native void nvmaCalculatePoolStatistics(long j, long j2, long j3);

    public static native int nvmaCheckPoolCorruption(long j, long j2);

    public static native void nvmaGetPoolName(long j, long j2, long j3);

    public static native void nvmaSetPoolName(long j, long j2, long j3);

    public static native int nvmaAllocateMemory(long j, long j2, long j3, long j4, long j5);

    public static native int nvmaAllocateMemoryPages(long j, long j2, long j3, long j4, long j5, long j6);

    public static native int nvmaAllocateMemoryForBuffer(long j, long j2, long j3, long j4, long j5);

    public static native int nvmaAllocateMemoryForImage(long j, long j2, long j3, long j4, long j5);

    public static native void nvmaFreeMemory(long j, long j2);

    public static native void nvmaFreeMemoryPages(long j, long j2, long j3);

    public static native void nvmaGetAllocationInfo(long j, long j2, long j3);

    public static native void nvmaGetAllocationInfo2(long j, long j2, long j3);

    public static native void nvmaSetAllocationUserData(long j, long j2, long j3);

    public static native void nvmaSetAllocationName(long j, long j2, long j3);

    public static native void nvmaGetAllocationMemoryProperties(long j, long j2, long j3);

    public static native int nvmaGetMemoryWin32Handle(long j, long j2, long j3, long j4);

    public static native int nvmaMapMemory(long j, long j2, long j3);

    public static native void nvmaUnmapMemory(long j, long j2);

    public static native void nvmaFlushAllocation(long j, long j2, long j3, long j4);

    public static native void nvmaInvalidateAllocation(long j, long j2, long j3, long j4);

    public static native int nvmaFlushAllocations(long j, int i, long j2, long j3, long j4);

    public static native int nvmaInvalidateAllocations(long j, int i, long j2, long j3, long j4);

    public static native int nvmaCopyMemoryToAllocation(long j, long j2, long j3, long j4, long j5);

    public static native int nvmaCopyAllocationToMemory(long j, long j2, long j3, long j4, long j5);

    public static native int nvmaCheckCorruption(long j, int i);

    public static native int nvmaBeginDefragmentation(long j, long j2, long j3);

    public static native void nvmaEndDefragmentation(long j, long j2, long j3);

    public static native int nvmaBeginDefragmentationPass(long j, long j2, long j3);

    public static native int nvmaEndDefragmentationPass(long j, long j2, long j3);

    public static native int nvmaBindBufferMemory(long j, long j2, long j3);

    public static native int nvmaBindBufferMemory2(long j, long j2, long j3, long j4, long j5);

    public static native int nvmaBindImageMemory(long j, long j2, long j3);

    public static native int nvmaBindImageMemory2(long j, long j2, long j3, long j4, long j5);

    public static native int nvmaCreateBuffer(long j, long j2, long j3, long j4, long j5, long j6);

    public static native int nvmaCreateBufferWithAlignment(long j, long j2, long j3, long j4, long j5, long j6, long j7);

    public static native int nvmaCreateAliasingBuffer(long j, long j2, long j3, long j4);

    public static native int nvmaCreateAliasingBuffer2(long j, long j2, long j3, long j4, long j5);

    public static native void nvmaDestroyBuffer(long j, long j2, long j3);

    public static native int nvmaCreateImage(long j, long j2, long j3, long j4, long j5, long j6);

    public static native int nvmaCreateAliasingImage(long j, long j2, long j3, long j4);

    public static native int nvmaCreateAliasingImage2(long j, long j2, long j3, long j4, long j5);

    public static native void nvmaDestroyImage(long j, long j2, long j3);

    public static native int nvmaCreateVirtualBlock(long j, long j2);

    public static native void nvmaDestroyVirtualBlock(long j);

    public static native int nvmaIsVirtualBlockEmpty(long j);

    public static native void nvmaGetVirtualAllocationInfo(long j, long j2, long j3);

    public static native int nvmaVirtualAllocate(long j, long j2, long j3, long j4);

    public static native void nvmaVirtualFree(long j, long j2);

    public static native void nvmaClearVirtualBlock(long j);

    public static native void nvmaSetVirtualAllocationUserData(long j, long j2, long j3);

    public static native void nvmaGetVirtualBlockStatistics(long j, long j2);

    public static native void nvmaCalculateVirtualBlockStatistics(long j, long j2);

    public static native void nvmaBuildVirtualBlockStatsString(long j, long j2, int i);

    public static native void nvmaFreeVirtualBlockStatsString(long j, long j2);

    public static native void nvmaBuildStatsString(long j, long j2, int i);

    public static native void nvmaFreeStatsString(long j, long j2);

    static {
        LibVma.initialize();
    }

    protected Vma() {
        throw new UnsupportedOperationException();
    }

    @NativeType("VkResult")
    public static int vmaCreateAllocator(@NativeType("VmaAllocatorCreateInfo const *") VmaAllocatorCreateInfo pCreateInfo, @NativeType("VmaAllocator *") PointerBuffer pAllocator) {
        if (Checks.CHECKS) {
            Checks.check((CustomBuffer<?>) pAllocator, 1);
            VmaAllocatorCreateInfo.validate(pCreateInfo.address());
        }
        return nvmaCreateAllocator(pCreateInfo.address(), MemoryUtil.memAddress(pAllocator));
    }

    public static void vmaDestroyAllocator(@NativeType("VmaAllocator") long allocator) {
        if (Checks.CHECKS) {
            Checks.check(allocator);
        }
        nvmaDestroyAllocator(allocator);
    }

    public static void vmaGetAllocatorInfo(@NativeType("VmaAllocator") long allocator, @NativeType("VmaAllocatorInfo *") VmaAllocatorInfo pAllocatorInfo) {
        if (Checks.CHECKS) {
            Checks.check(allocator);
        }
        nvmaGetAllocatorInfo(allocator, pAllocatorInfo.address());
    }

    public static void vmaGetPhysicalDeviceProperties(@NativeType("VmaAllocator") long allocator, @NativeType("VkPhysicalDeviceProperties const **") PointerBuffer ppPhysicalDeviceProperties) {
        if (Checks.CHECKS) {
            Checks.check(allocator);
            Checks.check((CustomBuffer<?>) ppPhysicalDeviceProperties, 1);
        }
        nvmaGetPhysicalDeviceProperties(allocator, MemoryUtil.memAddress(ppPhysicalDeviceProperties));
    }

    public static void vmaGetMemoryProperties(@NativeType("VmaAllocator") long allocator, @NativeType("VkPhysicalDeviceMemoryProperties const **") PointerBuffer ppPhysicalDeviceMemoryProperties) {
        if (Checks.CHECKS) {
            Checks.check(allocator);
            Checks.check((CustomBuffer<?>) ppPhysicalDeviceMemoryProperties, 1);
        }
        nvmaGetMemoryProperties(allocator, MemoryUtil.memAddress(ppPhysicalDeviceMemoryProperties));
    }

    public static void vmaGetMemoryTypeProperties(@NativeType("VmaAllocator") long allocator, @NativeType("uint32_t") int memoryTypeIndex, @NativeType("VkMemoryPropertyFlags *") IntBuffer pFlags) {
        if (Checks.CHECKS) {
            Checks.check(allocator);
            Checks.check((Buffer) pFlags, 1);
        }
        nvmaGetMemoryTypeProperties(allocator, memoryTypeIndex, MemoryUtil.memAddress(pFlags));
    }

    public static void vmaSetCurrentFrameIndex(@NativeType("VmaAllocator") long allocator, @NativeType("uint32_t") int frameIndex) {
        if (Checks.CHECKS) {
            Checks.check(allocator);
        }
        nvmaSetCurrentFrameIndex(allocator, frameIndex);
    }

    public static void vmaCalculateStatistics(@NativeType("VmaAllocator") long allocator, @NativeType("VmaTotalStatistics *") VmaTotalStatistics pStats) {
        if (Checks.CHECKS) {
            Checks.check(allocator);
        }
        nvmaCalculateStatistics(allocator, pStats.address());
    }

    public static void vmaGetHeapBudgets(@NativeType("VmaAllocator") long allocator, @NativeType("VmaBudget *") VmaBudget.Buffer pBudget) {
        if (Checks.CHECKS) {
            Checks.check(allocator);
        }
        nvmaGetHeapBudgets(allocator, pBudget.address());
    }

    @NativeType("VkResult")
    public static int vmaFindMemoryTypeIndex(@NativeType("VmaAllocator") long allocator, @NativeType("uint32_t") int memoryTypeBits, @NativeType("VmaAllocationCreateInfo const *") VmaAllocationCreateInfo pAllocationCreateInfo, @NativeType("uint32_t *") IntBuffer pMemoryTypeIndex) {
        if (Checks.CHECKS) {
            Checks.check(allocator);
            Checks.check((Buffer) pMemoryTypeIndex, 1);
        }
        return nvmaFindMemoryTypeIndex(allocator, memoryTypeBits, pAllocationCreateInfo.address(), MemoryUtil.memAddress(pMemoryTypeIndex));
    }

    @NativeType("VkResult")
    public static int vmaFindMemoryTypeIndexForBufferInfo(@NativeType("VmaAllocator") long allocator, @NativeType("VkBufferCreateInfo const *") VkBufferCreateInfo pBufferCreateInfo, @NativeType("VmaAllocationCreateInfo const *") VmaAllocationCreateInfo pAllocationCreateInfo, @NativeType("uint32_t *") IntBuffer pMemoryTypeIndex) {
        if (Checks.CHECKS) {
            Checks.check(allocator);
            Checks.check((Buffer) pMemoryTypeIndex, 1);
        }
        return nvmaFindMemoryTypeIndexForBufferInfo(allocator, pBufferCreateInfo.address(), pAllocationCreateInfo.address(), MemoryUtil.memAddress(pMemoryTypeIndex));
    }

    @NativeType("VkResult")
    public static int vmaFindMemoryTypeIndexForImageInfo(@NativeType("VmaAllocator") long allocator, @NativeType("VkImageCreateInfo const *") VkImageCreateInfo pImageCreateInfo, @NativeType("VmaAllocationCreateInfo const *") VmaAllocationCreateInfo pAllocationCreateInfo, @NativeType("uint32_t *") IntBuffer pMemoryTypeIndex) {
        if (Checks.CHECKS) {
            Checks.check(allocator);
            Checks.check((Buffer) pMemoryTypeIndex, 1);
        }
        return nvmaFindMemoryTypeIndexForImageInfo(allocator, pImageCreateInfo.address(), pAllocationCreateInfo.address(), MemoryUtil.memAddress(pMemoryTypeIndex));
    }

    @NativeType("VkResult")
    public static int vmaCreatePool(@NativeType("VmaAllocator") long allocator, @NativeType("VmaPoolCreateInfo const *") VmaPoolCreateInfo pCreateInfo, @NativeType("VmaPool *") PointerBuffer pPool) {
        if (Checks.CHECKS) {
            Checks.check(allocator);
            Checks.check((CustomBuffer<?>) pPool, 1);
        }
        return nvmaCreatePool(allocator, pCreateInfo.address(), MemoryUtil.memAddress(pPool));
    }

    public static void vmaDestroyPool(@NativeType("VmaAllocator") long allocator, @NativeType("VmaPool") long pool) {
        if (Checks.CHECKS) {
            Checks.check(allocator);
            Checks.check(pool);
        }
        nvmaDestroyPool(allocator, pool);
    }

    public static void vmaGetPoolStatistics(@NativeType("VmaAllocator") long allocator, @NativeType("VmaPool") long pool, @NativeType("VmaStatistics *") VmaStatistics pPoolStats) {
        if (Checks.CHECKS) {
            Checks.check(allocator);
            Checks.check(pool);
        }
        nvmaGetPoolStatistics(allocator, pool, pPoolStats.address());
    }

    public static void vmaCalculatePoolStatistics(@NativeType("VmaAllocator") long allocator, @NativeType("VmaPool") long pool, @NativeType("VmaDetailedStatistics *") VmaDetailedStatistics pPoolStats) {
        if (Checks.CHECKS) {
            Checks.check(allocator);
            Checks.check(pool);
        }
        nvmaCalculatePoolStatistics(allocator, pool, pPoolStats.address());
    }

    @NativeType("VkResult")
    public static int vmaCheckPoolCorruption(@NativeType("VmaAllocator") long allocator, @NativeType("VmaPool") long pool) {
        if (Checks.CHECKS) {
            Checks.check(allocator);
            Checks.check(pool);
        }
        return nvmaCheckPoolCorruption(allocator, pool);
    }

    public static void vmaGetPoolName(@NativeType("VmaAllocator") long allocator, @NativeType("VmaPool") long pool, @NativeType("char const **") PointerBuffer ppName) {
        if (Checks.CHECKS) {
            Checks.check(allocator);
            Checks.check(pool);
            Checks.check((CustomBuffer<?>) ppName, 1);
        }
        nvmaGetPoolName(allocator, pool, MemoryUtil.memAddress(ppName));
    }

    public static void vmaSetPoolName(@NativeType("VmaAllocator") long allocator, @NativeType("VmaPool") long pool, @NativeType("char const *") ByteBuffer pName) {
        if (Checks.CHECKS) {
            Checks.check(allocator);
            Checks.check(pool);
            Checks.checkNT1Safe(pName);
        }
        nvmaSetPoolName(allocator, pool, MemoryUtil.memAddressSafe(pName));
    }

    public static void vmaSetPoolName(@NativeType("VmaAllocator") long allocator, @NativeType("VmaPool") long pool, @NativeType("char const *") CharSequence pName) {
        if (Checks.CHECKS) {
            Checks.check(allocator);
            Checks.check(pool);
        }
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nASCIISafe(pName, true);
            long pNameEncoded = pName == null ? 0L : stack.getPointerAddress();
            nvmaSetPoolName(allocator, pool, pNameEncoded);
            stack.setPointer(stackPointer);
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    @NativeType("VkResult")
    public static int vmaAllocateMemory(@NativeType("VmaAllocator") long allocator, @NativeType("VkMemoryRequirements const *") VkMemoryRequirements pVkMemoryRequirements, @NativeType("VmaAllocationCreateInfo const *") VmaAllocationCreateInfo pCreateInfo, @NativeType("VmaAllocation *") PointerBuffer pAllocation, @NativeType("VmaAllocationInfo *") VmaAllocationInfo pAllocationInfo) {
        if (Checks.CHECKS) {
            Checks.check(allocator);
            Checks.check((CustomBuffer<?>) pAllocation, 1);
        }
        return nvmaAllocateMemory(allocator, pVkMemoryRequirements.address(), pCreateInfo.address(), MemoryUtil.memAddress(pAllocation), MemoryUtil.memAddressSafe(pAllocationInfo));
    }

    @NativeType("VkResult")
    public static int vmaAllocateMemoryPages(@NativeType("VmaAllocator") long allocator, @NativeType("VkMemoryRequirements const *") VkMemoryRequirements pVkMemoryRequirements, @NativeType("VmaAllocationCreateInfo const *") VmaAllocationCreateInfo pCreateInfo, @NativeType("VmaAllocation *") PointerBuffer pAllocations, @NativeType("VmaAllocationInfo *") VmaAllocationInfo.Buffer pAllocationInfo) {
        if (Checks.CHECKS) {
            Checks.check(allocator);
            Checks.checkSafe((CustomBuffer<?>) pAllocationInfo, pAllocations.remaining());
            Checks.check((CustomBuffer<?>) pAllocations, 1);
        }
        return nvmaAllocateMemoryPages(allocator, pVkMemoryRequirements.address(), pCreateInfo.address(), pAllocations.remaining(), MemoryUtil.memAddress(pAllocations), MemoryUtil.memAddressSafe(pAllocationInfo));
    }

    @NativeType("VkResult")
    public static int vmaAllocateMemoryForBuffer(@NativeType("VmaAllocator") long allocator, @NativeType("VkBuffer") long buffer, @NativeType("VmaAllocationCreateInfo const *") VmaAllocationCreateInfo pCreateInfo, @NativeType("VmaAllocation *") PointerBuffer pAllocation, @NativeType("VmaAllocationInfo *") VmaAllocationInfo pAllocationInfo) {
        if (Checks.CHECKS) {
            Checks.check(allocator);
            Checks.check((CustomBuffer<?>) pAllocation, 1);
        }
        return nvmaAllocateMemoryForBuffer(allocator, buffer, pCreateInfo.address(), MemoryUtil.memAddress(pAllocation), MemoryUtil.memAddressSafe(pAllocationInfo));
    }

    @NativeType("VkResult")
    public static int vmaAllocateMemoryForImage(@NativeType("VmaAllocator") long allocator, @NativeType("VkImage") long image, @NativeType("VmaAllocationCreateInfo const *") VmaAllocationCreateInfo pCreateInfo, @NativeType("VmaAllocation *") PointerBuffer pAllocation, @NativeType("VmaAllocationInfo *") VmaAllocationInfo pAllocationInfo) {
        if (Checks.CHECKS) {
            Checks.check(allocator);
            Checks.check((CustomBuffer<?>) pAllocation, 1);
        }
        return nvmaAllocateMemoryForImage(allocator, image, pCreateInfo.address(), MemoryUtil.memAddress(pAllocation), MemoryUtil.memAddressSafe(pAllocationInfo));
    }

    public static void vmaFreeMemory(@NativeType("VmaAllocator") long allocator, @NativeType("VmaAllocation") long allocation) {
        if (Checks.CHECKS) {
            Checks.check(allocator);
        }
        nvmaFreeMemory(allocator, allocation);
    }

    public static void vmaFreeMemoryPages(@NativeType("VmaAllocator") long allocator, @NativeType("VmaAllocation const *") PointerBuffer pAllocations) {
        if (Checks.CHECKS) {
            Checks.check(allocator);
        }
        nvmaFreeMemoryPages(allocator, pAllocations.remaining(), MemoryUtil.memAddress(pAllocations));
    }

    public static void vmaGetAllocationInfo(@NativeType("VmaAllocator") long allocator, @NativeType("VmaAllocation") long allocation, @NativeType("VmaAllocationInfo *") VmaAllocationInfo pAllocationInfo) {
        if (Checks.CHECKS) {
            Checks.check(allocator);
            Checks.check(allocation);
        }
        nvmaGetAllocationInfo(allocator, allocation, pAllocationInfo.address());
    }

    public static void vmaGetAllocationInfo2(@NativeType("VmaAllocator") long allocator, @NativeType("VmaAllocation") long allocation, @NativeType("VmaAllocationInfo2 *") VmaAllocationInfo2 pAllocationInfo) {
        if (Checks.CHECKS) {
            Checks.check(allocator);
            Checks.check(allocation);
        }
        nvmaGetAllocationInfo2(allocator, allocation, pAllocationInfo.address());
    }

    public static void vmaSetAllocationUserData(@NativeType("VmaAllocator") long allocator, @NativeType("VmaAllocation") long allocation, @NativeType("void *") long pUserData) {
        if (Checks.CHECKS) {
            Checks.check(allocator);
            Checks.check(allocation);
        }
        nvmaSetAllocationUserData(allocator, allocation, pUserData);
    }

    public static void vmaSetAllocationName(@NativeType("VmaAllocator") long allocator, @NativeType("VmaAllocation") long allocation, @NativeType("char const *") ByteBuffer pName) {
        if (Checks.CHECKS) {
            Checks.check(allocator);
            Checks.check(allocation);
            Checks.checkNT1Safe(pName);
        }
        nvmaSetAllocationName(allocator, allocation, MemoryUtil.memAddressSafe(pName));
    }

    public static void vmaSetAllocationName(@NativeType("VmaAllocator") long allocator, @NativeType("VmaAllocation") long allocation, @NativeType("char const *") CharSequence pName) {
        if (Checks.CHECKS) {
            Checks.check(allocator);
            Checks.check(allocation);
        }
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nUTF8Safe(pName, true);
            long pNameEncoded = pName == null ? 0L : stack.getPointerAddress();
            nvmaSetAllocationName(allocator, allocation, pNameEncoded);
            stack.setPointer(stackPointer);
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static void vmaGetAllocationMemoryProperties(@NativeType("VmaAllocator") long allocator, @NativeType("VmaAllocation") long allocation, @NativeType("VkMemoryPropertyFlags *") IntBuffer pFlags) {
        if (Checks.CHECKS) {
            Checks.check(allocator);
            Checks.check(allocation);
            Checks.check((Buffer) pFlags, 1);
        }
        nvmaGetAllocationMemoryProperties(allocator, allocation, MemoryUtil.memAddress(pFlags));
    }

    @NativeType("VkResult")
    public static int vmaGetMemoryWin32Handle(@NativeType("VmaAllocator") long allocator, @NativeType("VmaAllocation") long allocation, @NativeType("HANDLE") long hTargetProcess, @NativeType("HANDLE *") PointerBuffer pHandle) {
        if (Checks.CHECKS) {
            Checks.check(allocator);
            Checks.check(allocation);
            Checks.check((CustomBuffer<?>) pHandle, 1);
        }
        return nvmaGetMemoryWin32Handle(allocator, allocation, hTargetProcess, MemoryUtil.memAddress(pHandle));
    }

    @NativeType("VkResult")
    public static int vmaMapMemory(@NativeType("VmaAllocator") long allocator, @NativeType("VmaAllocation") long allocation, @NativeType("void **") PointerBuffer ppData) {
        if (Checks.CHECKS) {
            Checks.check(allocator);
            Checks.check(allocation);
            Checks.check((CustomBuffer<?>) ppData, 1);
        }
        return nvmaMapMemory(allocator, allocation, MemoryUtil.memAddress(ppData));
    }

    public static void vmaUnmapMemory(@NativeType("VmaAllocator") long allocator, @NativeType("VmaAllocation") long allocation) {
        if (Checks.CHECKS) {
            Checks.check(allocator);
            Checks.check(allocation);
        }
        nvmaUnmapMemory(allocator, allocation);
    }

    public static void vmaFlushAllocation(@NativeType("VmaAllocator") long allocator, @NativeType("VmaAllocation") long allocation, @NativeType("VkDeviceSize") long offset, @NativeType("VkDeviceSize") long size) {
        if (Checks.CHECKS) {
            Checks.check(allocator);
            Checks.check(allocation);
        }
        nvmaFlushAllocation(allocator, allocation, offset, size);
    }

    public static void vmaInvalidateAllocation(@NativeType("VmaAllocator") long allocator, @NativeType("VmaAllocation") long allocation, @NativeType("VkDeviceSize") long offset, @NativeType("VkDeviceSize") long size) {
        if (Checks.CHECKS) {
            Checks.check(allocator);
            Checks.check(allocation);
        }
        nvmaInvalidateAllocation(allocator, allocation, offset, size);
    }

    @NativeType("VkResult")
    public static int vmaFlushAllocations(@NativeType("VmaAllocator") long allocator, @NativeType("VmaAllocation const *") PointerBuffer allocations, @NativeType("VkDeviceSize const *") LongBuffer offsets, @NativeType("VkDeviceSize const *") LongBuffer sizes) {
        if (Checks.CHECKS) {
            Checks.check(allocator);
            Checks.checkSafe((Buffer) offsets, allocations.remaining());
            Checks.checkSafe((Buffer) sizes, allocations.remaining());
        }
        return nvmaFlushAllocations(allocator, allocations.remaining(), MemoryUtil.memAddress(allocations), MemoryUtil.memAddressSafe(offsets), MemoryUtil.memAddressSafe(sizes));
    }

    @NativeType("VkResult")
    public static int vmaInvalidateAllocations(@NativeType("VmaAllocator") long allocator, @NativeType("VmaAllocation const *") PointerBuffer allocations, @NativeType("VkDeviceSize const *") LongBuffer offsets, @NativeType("VkDeviceSize const *") LongBuffer sizes) {
        if (Checks.CHECKS) {
            Checks.check(allocator);
            Checks.checkSafe((Buffer) offsets, allocations.remaining());
            Checks.checkSafe((Buffer) sizes, allocations.remaining());
        }
        return nvmaInvalidateAllocations(allocator, allocations.remaining(), MemoryUtil.memAddress(allocations), MemoryUtil.memAddressSafe(offsets), MemoryUtil.memAddressSafe(sizes));
    }

    @NativeType("VkResult")
    public static int vmaCopyMemoryToAllocation(@NativeType("VmaAllocator") long allocator, @NativeType("void const *") ByteBuffer pSrcHostPointer, @NativeType("VmaAllocation") long dstAllocation, @NativeType("VkDeviceSize") long dstAllocationLocalOffset) {
        if (Checks.CHECKS) {
            Checks.check(allocator);
            Checks.check(dstAllocation);
        }
        return nvmaCopyMemoryToAllocation(allocator, MemoryUtil.memAddress(pSrcHostPointer), dstAllocation, dstAllocationLocalOffset, pSrcHostPointer.remaining());
    }

    @NativeType("VkResult")
    public static int vmaCopyAllocationToMemory(@NativeType("VmaAllocator") long allocator, @NativeType("VmaAllocation") long srcAllocation, @NativeType("VkDeviceSize") long srcAllocationLocalOffset, @NativeType("void *") ByteBuffer pDstHostPointer) {
        if (Checks.CHECKS) {
            Checks.check(allocator);
            Checks.check(srcAllocation);
        }
        return nvmaCopyAllocationToMemory(allocator, srcAllocation, srcAllocationLocalOffset, MemoryUtil.memAddress(pDstHostPointer), pDstHostPointer.remaining());
    }

    @NativeType("VkResult")
    public static int vmaCheckCorruption(@NativeType("VmaAllocator") long allocator, @NativeType("uint32_t") int memoryTypeBits) {
        if (Checks.CHECKS) {
            Checks.check(allocator);
        }
        return nvmaCheckCorruption(allocator, memoryTypeBits);
    }

    @NativeType("VkResult")
    public static int vmaBeginDefragmentation(@NativeType("VmaAllocator") long allocator, @NativeType("VmaDefragmentationInfo const *") VmaDefragmentationInfo pInfo, @NativeType("VmaDefragmentationContext *") PointerBuffer pContext) {
        if (Checks.CHECKS) {
            Checks.check(allocator);
            Checks.check((CustomBuffer<?>) pContext, 1);
        }
        return nvmaBeginDefragmentation(allocator, pInfo.address(), MemoryUtil.memAddress(pContext));
    }

    public static void vmaEndDefragmentation(@NativeType("VmaAllocator") long allocator, @NativeType("VmaDefragmentationContext") long context, @NativeType("VmaDefragmentationStats *") VmaDefragmentationStats pStats) {
        if (Checks.CHECKS) {
            Checks.check(allocator);
            Checks.check(context);
        }
        nvmaEndDefragmentation(allocator, context, MemoryUtil.memAddressSafe(pStats));
    }

    @NativeType("VkResult")
    public static int vmaBeginDefragmentationPass(@NativeType("VmaAllocator") long allocator, @NativeType("VmaDefragmentationContext") long context, @NativeType("VmaDefragmentationPassMoveInfo *") VmaDefragmentationPassMoveInfo pInfo) {
        if (Checks.CHECKS) {
            Checks.check(allocator);
            Checks.check(context);
        }
        return nvmaBeginDefragmentationPass(allocator, context, pInfo.address());
    }

    @NativeType("VkResult")
    public static int vmaEndDefragmentationPass(@NativeType("VmaAllocator") long allocator, @NativeType("VmaDefragmentationContext") long context, @NativeType("VmaDefragmentationPassMoveInfo *") VmaDefragmentationPassMoveInfo pPassInfo) {
        if (Checks.CHECKS) {
            Checks.check(allocator);
            Checks.check(context);
        }
        return nvmaEndDefragmentationPass(allocator, context, pPassInfo.address());
    }

    @NativeType("VkResult")
    public static int vmaBindBufferMemory(@NativeType("VmaAllocator") long allocator, @NativeType("VmaAllocation") long allocation, @NativeType("VkBuffer") long buffer) {
        if (Checks.CHECKS) {
            Checks.check(allocator);
            Checks.check(allocation);
        }
        return nvmaBindBufferMemory(allocator, allocation, buffer);
    }

    @NativeType("VkResult")
    public static int vmaBindBufferMemory2(@NativeType("VmaAllocator") long allocator, @NativeType("VmaAllocation") long allocation, @NativeType("VkDeviceSize") long allocationLocalOffset, @NativeType("VkBuffer") long buffer, @NativeType("void const *") long pNext) {
        if (Checks.CHECKS) {
            Checks.check(allocator);
            Checks.check(allocation);
        }
        return nvmaBindBufferMemory2(allocator, allocation, allocationLocalOffset, buffer, pNext);
    }

    @NativeType("VkResult")
    public static int vmaBindImageMemory(@NativeType("VmaAllocator") long allocator, @NativeType("VmaAllocation") long allocation, @NativeType("VkImage") long image) {
        if (Checks.CHECKS) {
            Checks.check(allocator);
            Checks.check(allocation);
        }
        return nvmaBindImageMemory(allocator, allocation, image);
    }

    @NativeType("VkResult")
    public static int vmaBindImageMemory2(@NativeType("VmaAllocator") long allocator, @NativeType("VmaAllocation") long allocation, @NativeType("VkDeviceSize") long allocationLocalOffset, @NativeType("VkImage") long image, @NativeType("void const *") long pNext) {
        if (Checks.CHECKS) {
            Checks.check(allocator);
            Checks.check(allocation);
        }
        return nvmaBindImageMemory2(allocator, allocation, allocationLocalOffset, image, pNext);
    }

    @NativeType("VkResult")
    public static int vmaCreateBuffer(@NativeType("VmaAllocator") long allocator, @NativeType("VkBufferCreateInfo const *") VkBufferCreateInfo pBufferCreateInfo, @NativeType("VmaAllocationCreateInfo const *") VmaAllocationCreateInfo pAllocationCreateInfo, @NativeType("VkBuffer *") LongBuffer pBuffer, @NativeType("VmaAllocation *") PointerBuffer pAllocation, @NativeType("VmaAllocationInfo *") VmaAllocationInfo pAllocationInfo) {
        if (Checks.CHECKS) {
            Checks.check(allocator);
            Checks.check((Buffer) pBuffer, 1);
            Checks.check((CustomBuffer<?>) pAllocation, 1);
        }
        return nvmaCreateBuffer(allocator, pBufferCreateInfo.address(), pAllocationCreateInfo.address(), MemoryUtil.memAddress(pBuffer), MemoryUtil.memAddress(pAllocation), MemoryUtil.memAddressSafe(pAllocationInfo));
    }

    @NativeType("VkResult")
    public static int vmaCreateBufferWithAlignment(@NativeType("VmaAllocator") long allocator, @NativeType("VkBufferCreateInfo const *") VkBufferCreateInfo pBufferCreateInfo, @NativeType("VmaAllocationCreateInfo const *") VmaAllocationCreateInfo pAllocationCreateInfo, @NativeType("VkDeviceSize") long minAlignment, @NativeType("VkBuffer *") LongBuffer pBuffer, @NativeType("VmaAllocation *") PointerBuffer pAllocation, @NativeType("VmaAllocationInfo *") VmaAllocationInfo pAllocationInfo) {
        if (Checks.CHECKS) {
            Checks.check(allocator);
            Checks.check((Buffer) pBuffer, 1);
            Checks.check((CustomBuffer<?>) pAllocation, 1);
        }
        return nvmaCreateBufferWithAlignment(allocator, pBufferCreateInfo.address(), pAllocationCreateInfo.address(), minAlignment, MemoryUtil.memAddress(pBuffer), MemoryUtil.memAddress(pAllocation), MemoryUtil.memAddressSafe(pAllocationInfo));
    }

    @NativeType("VkResult")
    public static int vmaCreateAliasingBuffer(@NativeType("VmaAllocator") long allocator, @NativeType("VmaAllocation") long allocation, @NativeType("VkBufferCreateInfo const *") VkBufferCreateInfo pBufferCreateInfo, @NativeType("VkBuffer *") LongBuffer pBuffer) {
        if (Checks.CHECKS) {
            Checks.check(allocator);
            Checks.check(allocation);
            Checks.check((Buffer) pBuffer, 1);
        }
        return nvmaCreateAliasingBuffer(allocator, allocation, pBufferCreateInfo.address(), MemoryUtil.memAddress(pBuffer));
    }

    @NativeType("VkResult")
    public static int vmaCreateAliasingBuffer2(@NativeType("VmaAllocator") long allocator, @NativeType("VmaAllocation") long allocation, @NativeType("VkDeviceSize") long allocationLocalOffset, @NativeType("VkBufferCreateInfo const *") VkBufferCreateInfo pBufferCreateInfo, @NativeType("VkBuffer *") LongBuffer pBuffer) {
        if (Checks.CHECKS) {
            Checks.check(allocator);
            Checks.check(allocation);
            Checks.check((Buffer) pBuffer, 1);
        }
        return nvmaCreateAliasingBuffer2(allocator, allocation, allocationLocalOffset, pBufferCreateInfo.address(), MemoryUtil.memAddress(pBuffer));
    }

    public static void vmaDestroyBuffer(@NativeType("VmaAllocator") long allocator, @NativeType("VkBuffer") long buffer, @NativeType("VmaAllocation") long allocation) {
        if (Checks.CHECKS) {
            Checks.check(allocator);
        }
        nvmaDestroyBuffer(allocator, buffer, allocation);
    }

    @NativeType("VkResult")
    public static int vmaCreateImage(@NativeType("VmaAllocator") long allocator, @NativeType("VkImageCreateInfo const *") VkImageCreateInfo pImageCreateInfo, @NativeType("VmaAllocationCreateInfo const *") VmaAllocationCreateInfo pAllocationCreateInfo, @NativeType("VkImage *") LongBuffer pImage, @NativeType("VmaAllocation *") PointerBuffer pAllocation, @NativeType("VmaAllocationInfo *") VmaAllocationInfo pAllocationInfo) {
        if (Checks.CHECKS) {
            Checks.check(allocator);
            Checks.check((Buffer) pImage, 1);
            Checks.check((CustomBuffer<?>) pAllocation, 1);
        }
        return nvmaCreateImage(allocator, pImageCreateInfo.address(), pAllocationCreateInfo.address(), MemoryUtil.memAddress(pImage), MemoryUtil.memAddress(pAllocation), MemoryUtil.memAddressSafe(pAllocationInfo));
    }

    @NativeType("VkResult")
    public static int vmaCreateAliasingImage(@NativeType("VmaAllocator") long allocator, @NativeType("VmaAllocation") long allocation, @NativeType("VkImageCreateInfo const *") VkImageCreateInfo pImageCreateInfo, @NativeType("VkImage *") LongBuffer pImage) {
        if (Checks.CHECKS) {
            Checks.check(allocator);
            Checks.check(allocation);
            Checks.check((Buffer) pImage, 1);
        }
        return nvmaCreateAliasingImage(allocator, allocation, pImageCreateInfo.address(), MemoryUtil.memAddress(pImage));
    }

    @NativeType("VkResult")
    public static int vmaCreateAliasingImage2(@NativeType("VmaAllocator") long allocator, @NativeType("VmaAllocation") long allocation, @NativeType("VkDeviceSize") long allocationLocalOffset, @NativeType("VkImageCreateInfo const *") VkImageCreateInfo pImageCreateInfo, @NativeType("VkImage *") LongBuffer pImage) {
        if (Checks.CHECKS) {
            Checks.check(allocator);
            Checks.check(allocation);
            Checks.check((Buffer) pImage, 1);
        }
        return nvmaCreateAliasingImage2(allocator, allocation, allocationLocalOffset, pImageCreateInfo.address(), MemoryUtil.memAddress(pImage));
    }

    public static void vmaDestroyImage(@NativeType("VmaAllocator") long allocator, @NativeType("VkImage") long image, @NativeType("VmaAllocation") long allocation) {
        if (Checks.CHECKS) {
            Checks.check(allocator);
        }
        nvmaDestroyImage(allocator, image, allocation);
    }

    @NativeType("VkResult")
    public static int vmaCreateVirtualBlock(@NativeType("VmaVirtualBlockCreateInfo const *") VmaVirtualBlockCreateInfo pCreateInfo, @NativeType("VmaVirtualBlock *") PointerBuffer pVirtualBlock) {
        if (Checks.CHECKS) {
            Checks.check((CustomBuffer<?>) pVirtualBlock, 1);
        }
        return nvmaCreateVirtualBlock(pCreateInfo.address(), MemoryUtil.memAddress(pVirtualBlock));
    }

    public static void vmaDestroyVirtualBlock(@NativeType("VmaVirtualBlock") long virtualBlock) {
        if (Checks.CHECKS) {
            Checks.check(virtualBlock);
        }
        nvmaDestroyVirtualBlock(virtualBlock);
    }

    @NativeType("VkBool32")
    public static boolean vmaIsVirtualBlockEmpty(@NativeType("VmaVirtualBlock") long virtualBlock) {
        if (Checks.CHECKS) {
            Checks.check(virtualBlock);
        }
        return nvmaIsVirtualBlockEmpty(virtualBlock) != 0;
    }

    public static void vmaGetVirtualAllocationInfo(@NativeType("VmaVirtualBlock") long virtualBlock, @NativeType("VmaVirtualAllocation") long allocation, @NativeType("VmaVirtualAllocationInfo *") VmaVirtualAllocationInfo pVirtualAllocInfo) {
        if (Checks.CHECKS) {
            Checks.check(virtualBlock);
            Checks.check(allocation);
        }
        nvmaGetVirtualAllocationInfo(virtualBlock, allocation, pVirtualAllocInfo.address());
    }

    @NativeType("VkResult")
    public static int vmaVirtualAllocate(@NativeType("VmaVirtualBlock") long virtualBlock, @NativeType("VmaVirtualAllocationCreateInfo const *") VmaVirtualAllocationCreateInfo pCreateInfo, @NativeType("VmaVirtualAllocation *") PointerBuffer pAllocation, @NativeType("VkDeviceSize *") LongBuffer pOffset) {
        if (Checks.CHECKS) {
            Checks.check(virtualBlock);
            Checks.check((CustomBuffer<?>) pAllocation, 1);
            Checks.checkSafe((Buffer) pOffset, 1);
        }
        return nvmaVirtualAllocate(virtualBlock, pCreateInfo.address(), MemoryUtil.memAddress(pAllocation), MemoryUtil.memAddressSafe(pOffset));
    }

    public static void vmaVirtualFree(@NativeType("VmaVirtualBlock") long virtualBlock, @NativeType("VmaVirtualAllocation") long allocation) {
        if (Checks.CHECKS) {
            Checks.check(virtualBlock);
        }
        nvmaVirtualFree(virtualBlock, allocation);
    }

    public static void vmaClearVirtualBlock(@NativeType("VmaVirtualBlock") long virtualBlock) {
        if (Checks.CHECKS) {
            Checks.check(virtualBlock);
        }
        nvmaClearVirtualBlock(virtualBlock);
    }

    public static void vmaSetVirtualAllocationUserData(@NativeType("VmaVirtualBlock") long virtualBlock, @NativeType("VmaVirtualAllocation") long allocation, @NativeType("void *") long pUserData) {
        if (Checks.CHECKS) {
            Checks.check(virtualBlock);
            Checks.check(allocation);
            Checks.check(pUserData);
        }
        nvmaSetVirtualAllocationUserData(virtualBlock, allocation, pUserData);
    }

    public static void vmaGetVirtualBlockStatistics(@NativeType("VmaVirtualBlock") long virtualBlock, @NativeType("VmaStatistics *") VmaStatistics pStats) {
        if (Checks.CHECKS) {
            Checks.check(virtualBlock);
        }
        nvmaGetVirtualBlockStatistics(virtualBlock, pStats.address());
    }

    public static void vmaCalculateVirtualBlockStatistics(@NativeType("VmaVirtualBlock") long virtualBlock, @NativeType("VmaDetailedStatistics *") VmaDetailedStatistics pStats) {
        if (Checks.CHECKS) {
            Checks.check(virtualBlock);
        }
        nvmaCalculateVirtualBlockStatistics(virtualBlock, pStats.address());
    }

    public static void vmaBuildVirtualBlockStatsString(@NativeType("VmaVirtualBlock") long virtualBlock, @NativeType("char **") PointerBuffer ppStatsString, @NativeType("VkBool32") boolean detailedMap) {
        if (Checks.CHECKS) {
            Checks.check(virtualBlock);
            Checks.check((CustomBuffer<?>) ppStatsString, 1);
        }
        nvmaBuildVirtualBlockStatsString(virtualBlock, MemoryUtil.memAddress(ppStatsString), detailedMap ? 1 : 0);
    }

    public static void vmaFreeVirtualBlockStatsString(@NativeType("VmaVirtualBlock") long virtualBlock, @NativeType("char *") ByteBuffer pStatsString) {
        if (Checks.CHECKS) {
            Checks.check(virtualBlock);
        }
        nvmaFreeVirtualBlockStatsString(virtualBlock, MemoryUtil.memAddress(pStatsString));
    }

    public static void vmaBuildStatsString(@NativeType("VmaAllocator") long allocator, @NativeType("char **") PointerBuffer ppStatsString, @NativeType("VkBool32") boolean detailedMap) {
        if (Checks.CHECKS) {
            Checks.check(allocator);
            Checks.check((CustomBuffer<?>) ppStatsString, 1);
        }
        nvmaBuildStatsString(allocator, MemoryUtil.memAddress(ppStatsString), detailedMap ? 1 : 0);
    }

    public static void vmaFreeStatsString(@NativeType("VmaAllocator") long allocator, @NativeType("char *") ByteBuffer pStatsString) {
        if (Checks.CHECKS) {
            Checks.check(allocator);
        }
        nvmaFreeStatsString(allocator, MemoryUtil.memAddress(pStatsString));
    }
}
