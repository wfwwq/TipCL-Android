package org.lwjgl.util.vma;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.nio.LongBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.Checks;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.vulkan.VkAllocationCallbacks;
import org.lwjgl.vulkan.VkDevice;
import org.lwjgl.vulkan.VkInstance;
import org.lwjgl.vulkan.VkPhysicalDevice;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vma.jar:org/lwjgl/util/vma/VmaAllocatorCreateInfo.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vma.jar:org/lwjgl/util/vma/VmaAllocatorCreateInfo.class */
public class VmaAllocatorCreateInfo extends Struct<VmaAllocatorCreateInfo> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int FLAGS;
    public static final int PHYSICALDEVICE;
    public static final int DEVICE;
    public static final int PREFERREDLARGEHEAPBLOCKSIZE;
    public static final int PALLOCATIONCALLBACKS;
    public static final int PDEVICEMEMORYCALLBACKS;
    public static final int PHEAPSIZELIMIT;
    public static final int PVULKANFUNCTIONS;
    public static final int INSTANCE;
    public static final int VULKANAPIVERSION;
    public static final int PTYPEEXTERNALMEMORYHANDLETYPES;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(8), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(4), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        FLAGS = layout.offsetof(0);
        PHYSICALDEVICE = layout.offsetof(1);
        DEVICE = layout.offsetof(2);
        PREFERREDLARGEHEAPBLOCKSIZE = layout.offsetof(3);
        PALLOCATIONCALLBACKS = layout.offsetof(4);
        PDEVICEMEMORYCALLBACKS = layout.offsetof(5);
        PHEAPSIZELIMIT = layout.offsetof(6);
        PVULKANFUNCTIONS = layout.offsetof(7);
        INSTANCE = layout.offsetof(8);
        VULKANAPIVERSION = layout.offsetof(9);
        PTYPEEXTERNALMEMORYHANDLETYPES = layout.offsetof(10);
    }

    protected VmaAllocatorCreateInfo(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VmaAllocatorCreateInfo create(long address, ByteBuffer container) {
        return new VmaAllocatorCreateInfo(address, container);
    }

    public VmaAllocatorCreateInfo(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("VmaAllocatorCreateFlags")
    public int flags() {
        return nflags(address());
    }

    @NativeType("VkPhysicalDevice")
    public long physicalDevice() {
        return nphysicalDevice(address());
    }

    @NativeType("VkDevice")
    public long device() {
        return ndevice(address());
    }

    @NativeType("VkDeviceSize")
    public long preferredLargeHeapBlockSize() {
        return npreferredLargeHeapBlockSize(address());
    }

    @NativeType("VkAllocationCallbacks const *")
    public VkAllocationCallbacks pAllocationCallbacks() {
        return npAllocationCallbacks(address());
    }

    @NativeType("VmaDeviceMemoryCallbacks const *")
    public VmaDeviceMemoryCallbacks pDeviceMemoryCallbacks() {
        return npDeviceMemoryCallbacks(address());
    }

    @NativeType("VkDeviceSize const *")
    public LongBuffer pHeapSizeLimit(int capacity) {
        return npHeapSizeLimit(address(), capacity);
    }

    @NativeType("VmaVulkanFunctions const *")
    public VmaVulkanFunctions pVulkanFunctions() {
        return npVulkanFunctions(address());
    }

    @NativeType("VkInstance")
    public long instance() {
        return ninstance(address());
    }

    @NativeType("uint32_t")
    public int vulkanApiVersion() {
        return nvulkanApiVersion(address());
    }

    @NativeType("VkExternalMemoryHandleTypeFlagsKHR const *")
    public IntBuffer pTypeExternalMemoryHandleTypes(int capacity) {
        return npTypeExternalMemoryHandleTypes(address(), capacity);
    }

    public VmaAllocatorCreateInfo flags(@NativeType("VmaAllocatorCreateFlags") int value) {
        nflags(address(), value);
        return this;
    }

    public VmaAllocatorCreateInfo physicalDevice(VkPhysicalDevice value) {
        nphysicalDevice(address(), value);
        return this;
    }

    public VmaAllocatorCreateInfo device(VkDevice value) {
        ndevice(address(), value);
        return this;
    }

    public VmaAllocatorCreateInfo preferredLargeHeapBlockSize(@NativeType("VkDeviceSize") long value) {
        npreferredLargeHeapBlockSize(address(), value);
        return this;
    }

    public VmaAllocatorCreateInfo pAllocationCallbacks(@NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks value) {
        npAllocationCallbacks(address(), value);
        return this;
    }

    public VmaAllocatorCreateInfo pDeviceMemoryCallbacks(@NativeType("VmaDeviceMemoryCallbacks const *") VmaDeviceMemoryCallbacks value) {
        npDeviceMemoryCallbacks(address(), value);
        return this;
    }

    public VmaAllocatorCreateInfo pHeapSizeLimit(@NativeType("VkDeviceSize const *") LongBuffer value) {
        npHeapSizeLimit(address(), value);
        return this;
    }

    public VmaAllocatorCreateInfo pVulkanFunctions(@NativeType("VmaVulkanFunctions const *") VmaVulkanFunctions value) {
        npVulkanFunctions(address(), value);
        return this;
    }

    public VmaAllocatorCreateInfo instance(VkInstance value) {
        ninstance(address(), value);
        return this;
    }

    public VmaAllocatorCreateInfo vulkanApiVersion(@NativeType("uint32_t") int value) {
        nvulkanApiVersion(address(), value);
        return this;
    }

    public VmaAllocatorCreateInfo pTypeExternalMemoryHandleTypes(@NativeType("VkExternalMemoryHandleTypeFlagsKHR const *") IntBuffer value) {
        npTypeExternalMemoryHandleTypes(address(), value);
        return this;
    }

    public VmaAllocatorCreateInfo set(int flags, VkPhysicalDevice physicalDevice, VkDevice device, long preferredLargeHeapBlockSize, VkAllocationCallbacks pAllocationCallbacks, VmaDeviceMemoryCallbacks pDeviceMemoryCallbacks, LongBuffer pHeapSizeLimit, VmaVulkanFunctions pVulkanFunctions, VkInstance instance, int vulkanApiVersion, IntBuffer pTypeExternalMemoryHandleTypes) {
        flags(flags);
        physicalDevice(physicalDevice);
        device(device);
        preferredLargeHeapBlockSize(preferredLargeHeapBlockSize);
        pAllocationCallbacks(pAllocationCallbacks);
        pDeviceMemoryCallbacks(pDeviceMemoryCallbacks);
        pHeapSizeLimit(pHeapSizeLimit);
        pVulkanFunctions(pVulkanFunctions);
        instance(instance);
        vulkanApiVersion(vulkanApiVersion);
        pTypeExternalMemoryHandleTypes(pTypeExternalMemoryHandleTypes);
        return this;
    }

    public VmaAllocatorCreateInfo set(VmaAllocatorCreateInfo src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VmaAllocatorCreateInfo malloc() {
        return new VmaAllocatorCreateInfo(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VmaAllocatorCreateInfo calloc() {
        return new VmaAllocatorCreateInfo(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VmaAllocatorCreateInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VmaAllocatorCreateInfo(MemoryUtil.memAddress(container), container);
    }

    public static VmaAllocatorCreateInfo create(long address) {
        return new VmaAllocatorCreateInfo(address, null);
    }

    public static VmaAllocatorCreateInfo createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VmaAllocatorCreateInfo(address, null);
    }

    public static VmaAllocatorCreateInfo malloc(MemoryStack stack) {
        return new VmaAllocatorCreateInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VmaAllocatorCreateInfo calloc(MemoryStack stack) {
        return new VmaAllocatorCreateInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static int nflags(long struct) {
        return MemoryUtil.memGetInt(struct + FLAGS);
    }

    public static long nphysicalDevice(long struct) {
        return MemoryUtil.memGetAddress(struct + PHYSICALDEVICE);
    }

    public static long ndevice(long struct) {
        return MemoryUtil.memGetAddress(struct + DEVICE);
    }

    public static long npreferredLargeHeapBlockSize(long struct) {
        return MemoryUtil.memGetLong(struct + PREFERREDLARGEHEAPBLOCKSIZE);
    }

    public static VkAllocationCallbacks npAllocationCallbacks(long struct) {
        return VkAllocationCallbacks.createSafe(MemoryUtil.memGetAddress(struct + PALLOCATIONCALLBACKS));
    }

    public static VmaDeviceMemoryCallbacks npDeviceMemoryCallbacks(long struct) {
        return VmaDeviceMemoryCallbacks.createSafe(MemoryUtil.memGetAddress(struct + PDEVICEMEMORYCALLBACKS));
    }

    public static LongBuffer npHeapSizeLimit(long struct, int capacity) {
        return MemoryUtil.memLongBufferSafe(MemoryUtil.memGetAddress(struct + PHEAPSIZELIMIT), capacity);
    }

    public static VmaVulkanFunctions npVulkanFunctions(long struct) {
        return VmaVulkanFunctions.create(MemoryUtil.memGetAddress(struct + PVULKANFUNCTIONS));
    }

    public static long ninstance(long struct) {
        return MemoryUtil.memGetAddress(struct + INSTANCE);
    }

    public static int nvulkanApiVersion(long struct) {
        return MemoryUtil.memGetInt(struct + VULKANAPIVERSION);
    }

    public static IntBuffer npTypeExternalMemoryHandleTypes(long struct, int capacity) {
        return MemoryUtil.memIntBufferSafe(MemoryUtil.memGetAddress(struct + PTYPEEXTERNALMEMORYHANDLETYPES), capacity);
    }

    public static void nflags(long struct, int value) {
        MemoryUtil.memPutInt(struct + FLAGS, value);
    }

    public static void nphysicalDevice(long struct, VkPhysicalDevice value) {
        MemoryUtil.memPutAddress(struct + PHYSICALDEVICE, value.address());
    }

    public static void ndevice(long struct, VkDevice value) {
        MemoryUtil.memPutAddress(struct + DEVICE, value.address());
    }

    public static void npreferredLargeHeapBlockSize(long struct, long value) {
        MemoryUtil.memPutLong(struct + PREFERREDLARGEHEAPBLOCKSIZE, value);
    }

    public static void npAllocationCallbacks(long struct, VkAllocationCallbacks value) {
        MemoryUtil.memPutAddress(struct + PALLOCATIONCALLBACKS, MemoryUtil.memAddressSafe(value));
    }

    public static void npDeviceMemoryCallbacks(long struct, VmaDeviceMemoryCallbacks value) {
        MemoryUtil.memPutAddress(struct + PDEVICEMEMORYCALLBACKS, MemoryUtil.memAddressSafe(value));
    }

    public static void npHeapSizeLimit(long struct, LongBuffer value) {
        MemoryUtil.memPutAddress(struct + PHEAPSIZELIMIT, MemoryUtil.memAddressSafe(value));
    }

    public static void npVulkanFunctions(long struct, VmaVulkanFunctions value) {
        MemoryUtil.memPutAddress(struct + PVULKANFUNCTIONS, value.address());
    }

    public static void ninstance(long struct, VkInstance value) {
        MemoryUtil.memPutAddress(struct + INSTANCE, value.address());
    }

    public static void nvulkanApiVersion(long struct, int value) {
        MemoryUtil.memPutInt(struct + VULKANAPIVERSION, value);
    }

    public static void npTypeExternalMemoryHandleTypes(long struct, IntBuffer value) {
        MemoryUtil.memPutAddress(struct + PTYPEEXTERNALMEMORYHANDLETYPES, MemoryUtil.memAddressSafe(value));
    }

    public static void validate(long struct) {
        Checks.check(MemoryUtil.memGetAddress(struct + PHYSICALDEVICE));
        Checks.check(MemoryUtil.memGetAddress(struct + DEVICE));
        long pVulkanFunctions = MemoryUtil.memGetAddress(struct + PVULKANFUNCTIONS);
        Checks.check(pVulkanFunctions);
        VmaVulkanFunctions.validate(pVulkanFunctions);
        Checks.check(MemoryUtil.memGetAddress(struct + INSTANCE));
    }
}
