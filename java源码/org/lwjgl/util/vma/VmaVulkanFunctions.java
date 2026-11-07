package org.lwjgl.util.vma;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.Checks;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.vulkan.VKCapabilitiesDevice;
import org.lwjgl.vulkan.VKCapabilitiesInstance;
import org.lwjgl.vulkan.VkDevice;
import org.lwjgl.vulkan.VkInstance;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vma.jar:org/lwjgl/util/vma/VmaVulkanFunctions.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vma.jar:org/lwjgl/util/vma/VmaVulkanFunctions.class */
public class VmaVulkanFunctions extends Struct<VmaVulkanFunctions> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int VKGETINSTANCEPROCADDR;
    public static final int VKGETDEVICEPROCADDR;
    public static final int VKGETPHYSICALDEVICEPROPERTIES;
    public static final int VKGETPHYSICALDEVICEMEMORYPROPERTIES;
    public static final int VKALLOCATEMEMORY;
    public static final int VKFREEMEMORY;
    public static final int VKMAPMEMORY;
    public static final int VKUNMAPMEMORY;
    public static final int VKFLUSHMAPPEDMEMORYRANGES;
    public static final int VKINVALIDATEMAPPEDMEMORYRANGES;
    public static final int VKBINDBUFFERMEMORY;
    public static final int VKBINDIMAGEMEMORY;
    public static final int VKGETBUFFERMEMORYREQUIREMENTS;
    public static final int VKGETIMAGEMEMORYREQUIREMENTS;
    public static final int VKCREATEBUFFER;
    public static final int VKDESTROYBUFFER;
    public static final int VKCREATEIMAGE;
    public static final int VKDESTROYIMAGE;
    public static final int VKCMDCOPYBUFFER;
    public static final int VKGETBUFFERMEMORYREQUIREMENTS2KHR;
    public static final int VKGETIMAGEMEMORYREQUIREMENTS2KHR;
    public static final int VKBINDBUFFERMEMORY2KHR;
    public static final int VKBINDIMAGEMEMORY2KHR;
    public static final int VKGETPHYSICALDEVICEMEMORYPROPERTIES2KHR;
    public static final int VKGETDEVICEBUFFERMEMORYREQUIREMENTS;
    public static final int VKGETDEVICEIMAGEMEMORYREQUIREMENTS;
    public static final int VKGETMEMORYWIN32HANDLEKHR;

    static {
        Struct.Layout layout = __struct(__member(POINTER_SIZE), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        VKGETINSTANCEPROCADDR = layout.offsetof(0);
        VKGETDEVICEPROCADDR = layout.offsetof(1);
        VKGETPHYSICALDEVICEPROPERTIES = layout.offsetof(2);
        VKGETPHYSICALDEVICEMEMORYPROPERTIES = layout.offsetof(3);
        VKALLOCATEMEMORY = layout.offsetof(4);
        VKFREEMEMORY = layout.offsetof(5);
        VKMAPMEMORY = layout.offsetof(6);
        VKUNMAPMEMORY = layout.offsetof(7);
        VKFLUSHMAPPEDMEMORYRANGES = layout.offsetof(8);
        VKINVALIDATEMAPPEDMEMORYRANGES = layout.offsetof(9);
        VKBINDBUFFERMEMORY = layout.offsetof(10);
        VKBINDIMAGEMEMORY = layout.offsetof(11);
        VKGETBUFFERMEMORYREQUIREMENTS = layout.offsetof(12);
        VKGETIMAGEMEMORYREQUIREMENTS = layout.offsetof(13);
        VKCREATEBUFFER = layout.offsetof(14);
        VKDESTROYBUFFER = layout.offsetof(15);
        VKCREATEIMAGE = layout.offsetof(16);
        VKDESTROYIMAGE = layout.offsetof(17);
        VKCMDCOPYBUFFER = layout.offsetof(18);
        VKGETBUFFERMEMORYREQUIREMENTS2KHR = layout.offsetof(19);
        VKGETIMAGEMEMORYREQUIREMENTS2KHR = layout.offsetof(20);
        VKBINDBUFFERMEMORY2KHR = layout.offsetof(21);
        VKBINDIMAGEMEMORY2KHR = layout.offsetof(22);
        VKGETPHYSICALDEVICEMEMORYPROPERTIES2KHR = layout.offsetof(23);
        VKGETDEVICEBUFFERMEMORYREQUIREMENTS = layout.offsetof(24);
        VKGETDEVICEIMAGEMEMORYREQUIREMENTS = layout.offsetof(25);
        VKGETMEMORYWIN32HANDLEKHR = layout.offsetof(26);
    }

    protected VmaVulkanFunctions(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VmaVulkanFunctions create(long address, ByteBuffer container) {
        return new VmaVulkanFunctions(address, container);
    }

    public VmaVulkanFunctions(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("PFN_vkGetInstanceProcAddr")
    public long vkGetInstanceProcAddr() {
        return nvkGetInstanceProcAddr(address());
    }

    @NativeType("PFN_vkGetDeviceProcAddr")
    public long vkGetDeviceProcAddr() {
        return nvkGetDeviceProcAddr(address());
    }

    @NativeType("PFN_vkGetPhysicalDeviceProperties")
    public long vkGetPhysicalDeviceProperties() {
        return nvkGetPhysicalDeviceProperties(address());
    }

    @NativeType("PFN_vkGetPhysicalDeviceMemoryProperties")
    public long vkGetPhysicalDeviceMemoryProperties() {
        return nvkGetPhysicalDeviceMemoryProperties(address());
    }

    @NativeType("PFN_vkAllocateMemory")
    public long vkAllocateMemory() {
        return nvkAllocateMemory(address());
    }

    @NativeType("PFN_vkFreeMemory")
    public long vkFreeMemory() {
        return nvkFreeMemory(address());
    }

    @NativeType("PFN_vkMapMemory")
    public long vkMapMemory() {
        return nvkMapMemory(address());
    }

    @NativeType("PFN_vkUnmapMemory")
    public long vkUnmapMemory() {
        return nvkUnmapMemory(address());
    }

    @NativeType("PFN_vkFlushMappedMemoryRanges")
    public long vkFlushMappedMemoryRanges() {
        return nvkFlushMappedMemoryRanges(address());
    }

    @NativeType("PFN_vkInvalidateMappedMemoryRanges")
    public long vkInvalidateMappedMemoryRanges() {
        return nvkInvalidateMappedMemoryRanges(address());
    }

    @NativeType("PFN_vkBindBufferMemory")
    public long vkBindBufferMemory() {
        return nvkBindBufferMemory(address());
    }

    @NativeType("PFN_vkBindImageMemory")
    public long vkBindImageMemory() {
        return nvkBindImageMemory(address());
    }

    @NativeType("PFN_vkGetBufferMemoryRequirements")
    public long vkGetBufferMemoryRequirements() {
        return nvkGetBufferMemoryRequirements(address());
    }

    @NativeType("PFN_vkGetImageMemoryRequirements")
    public long vkGetImageMemoryRequirements() {
        return nvkGetImageMemoryRequirements(address());
    }

    @NativeType("PFN_vkCreateBuffer")
    public long vkCreateBuffer() {
        return nvkCreateBuffer(address());
    }

    @NativeType("PFN_vkDestroyBuffer")
    public long vkDestroyBuffer() {
        return nvkDestroyBuffer(address());
    }

    @NativeType("PFN_vkCreateImage")
    public long vkCreateImage() {
        return nvkCreateImage(address());
    }

    @NativeType("PFN_vkDestroyImage")
    public long vkDestroyImage() {
        return nvkDestroyImage(address());
    }

    @NativeType("PFN_vkCmdCopyBuffer")
    public long vkCmdCopyBuffer() {
        return nvkCmdCopyBuffer(address());
    }

    @NativeType("PFN_vkGetBufferMemoryRequirements2KHR")
    public long vkGetBufferMemoryRequirements2KHR() {
        return nvkGetBufferMemoryRequirements2KHR(address());
    }

    @NativeType("PFN_vkGetImageMemoryRequirements2KHR")
    public long vkGetImageMemoryRequirements2KHR() {
        return nvkGetImageMemoryRequirements2KHR(address());
    }

    @NativeType("PFN_vkBindBufferMemory2KHR")
    public long vkBindBufferMemory2KHR() {
        return nvkBindBufferMemory2KHR(address());
    }

    @NativeType("PFN_vkBindImageMemory2KHR")
    public long vkBindImageMemory2KHR() {
        return nvkBindImageMemory2KHR(address());
    }

    @NativeType("PFN_vkGetPhysicalDeviceMemoryProperties2KHR")
    public long vkGetPhysicalDeviceMemoryProperties2KHR() {
        return nvkGetPhysicalDeviceMemoryProperties2KHR(address());
    }

    @NativeType("PFN_vkGetDeviceBufferMemoryRequirementsKHR")
    public long vkGetDeviceBufferMemoryRequirements() {
        return nvkGetDeviceBufferMemoryRequirements(address());
    }

    @NativeType("PFN_vkGetDeviceImageMemoryRequirementsKHR")
    public long vkGetDeviceImageMemoryRequirements() {
        return nvkGetDeviceImageMemoryRequirements(address());
    }

    @NativeType("PFN_vkGetMemoryWin32HandleKHR")
    public long vkGetMemoryWin32HandleKHR() {
        return nvkGetMemoryWin32HandleKHR(address());
    }

    public VmaVulkanFunctions vkGetInstanceProcAddr(@NativeType("PFN_vkGetInstanceProcAddr") long value) {
        nvkGetInstanceProcAddr(address(), value);
        return this;
    }

    public VmaVulkanFunctions vkGetDeviceProcAddr(@NativeType("PFN_vkGetDeviceProcAddr") long value) {
        nvkGetDeviceProcAddr(address(), value);
        return this;
    }

    public VmaVulkanFunctions vkGetPhysicalDeviceProperties(@NativeType("PFN_vkGetPhysicalDeviceProperties") long value) {
        nvkGetPhysicalDeviceProperties(address(), value);
        return this;
    }

    public VmaVulkanFunctions vkGetPhysicalDeviceMemoryProperties(@NativeType("PFN_vkGetPhysicalDeviceMemoryProperties") long value) {
        nvkGetPhysicalDeviceMemoryProperties(address(), value);
        return this;
    }

    public VmaVulkanFunctions vkAllocateMemory(@NativeType("PFN_vkAllocateMemory") long value) {
        nvkAllocateMemory(address(), value);
        return this;
    }

    public VmaVulkanFunctions vkFreeMemory(@NativeType("PFN_vkFreeMemory") long value) {
        nvkFreeMemory(address(), value);
        return this;
    }

    public VmaVulkanFunctions vkMapMemory(@NativeType("PFN_vkMapMemory") long value) {
        nvkMapMemory(address(), value);
        return this;
    }

    public VmaVulkanFunctions vkUnmapMemory(@NativeType("PFN_vkUnmapMemory") long value) {
        nvkUnmapMemory(address(), value);
        return this;
    }

    public VmaVulkanFunctions vkFlushMappedMemoryRanges(@NativeType("PFN_vkFlushMappedMemoryRanges") long value) {
        nvkFlushMappedMemoryRanges(address(), value);
        return this;
    }

    public VmaVulkanFunctions vkInvalidateMappedMemoryRanges(@NativeType("PFN_vkInvalidateMappedMemoryRanges") long value) {
        nvkInvalidateMappedMemoryRanges(address(), value);
        return this;
    }

    public VmaVulkanFunctions vkBindBufferMemory(@NativeType("PFN_vkBindBufferMemory") long value) {
        nvkBindBufferMemory(address(), value);
        return this;
    }

    public VmaVulkanFunctions vkBindImageMemory(@NativeType("PFN_vkBindImageMemory") long value) {
        nvkBindImageMemory(address(), value);
        return this;
    }

    public VmaVulkanFunctions vkGetBufferMemoryRequirements(@NativeType("PFN_vkGetBufferMemoryRequirements") long value) {
        nvkGetBufferMemoryRequirements(address(), value);
        return this;
    }

    public VmaVulkanFunctions vkGetImageMemoryRequirements(@NativeType("PFN_vkGetImageMemoryRequirements") long value) {
        nvkGetImageMemoryRequirements(address(), value);
        return this;
    }

    public VmaVulkanFunctions vkCreateBuffer(@NativeType("PFN_vkCreateBuffer") long value) {
        nvkCreateBuffer(address(), value);
        return this;
    }

    public VmaVulkanFunctions vkDestroyBuffer(@NativeType("PFN_vkDestroyBuffer") long value) {
        nvkDestroyBuffer(address(), value);
        return this;
    }

    public VmaVulkanFunctions vkCreateImage(@NativeType("PFN_vkCreateImage") long value) {
        nvkCreateImage(address(), value);
        return this;
    }

    public VmaVulkanFunctions vkDestroyImage(@NativeType("PFN_vkDestroyImage") long value) {
        nvkDestroyImage(address(), value);
        return this;
    }

    public VmaVulkanFunctions vkCmdCopyBuffer(@NativeType("PFN_vkCmdCopyBuffer") long value) {
        nvkCmdCopyBuffer(address(), value);
        return this;
    }

    public VmaVulkanFunctions vkGetBufferMemoryRequirements2KHR(@NativeType("PFN_vkGetBufferMemoryRequirements2KHR") long value) {
        nvkGetBufferMemoryRequirements2KHR(address(), value);
        return this;
    }

    public VmaVulkanFunctions vkGetImageMemoryRequirements2KHR(@NativeType("PFN_vkGetImageMemoryRequirements2KHR") long value) {
        nvkGetImageMemoryRequirements2KHR(address(), value);
        return this;
    }

    public VmaVulkanFunctions vkBindBufferMemory2KHR(@NativeType("PFN_vkBindBufferMemory2KHR") long value) {
        nvkBindBufferMemory2KHR(address(), value);
        return this;
    }

    public VmaVulkanFunctions vkBindImageMemory2KHR(@NativeType("PFN_vkBindImageMemory2KHR") long value) {
        nvkBindImageMemory2KHR(address(), value);
        return this;
    }

    public VmaVulkanFunctions vkGetPhysicalDeviceMemoryProperties2KHR(@NativeType("PFN_vkGetPhysicalDeviceMemoryProperties2KHR") long value) {
        nvkGetPhysicalDeviceMemoryProperties2KHR(address(), value);
        return this;
    }

    public VmaVulkanFunctions vkGetDeviceBufferMemoryRequirements(@NativeType("PFN_vkGetDeviceBufferMemoryRequirementsKHR") long value) {
        nvkGetDeviceBufferMemoryRequirements(address(), value);
        return this;
    }

    public VmaVulkanFunctions vkGetDeviceImageMemoryRequirements(@NativeType("PFN_vkGetDeviceImageMemoryRequirementsKHR") long value) {
        nvkGetDeviceImageMemoryRequirements(address(), value);
        return this;
    }

    public VmaVulkanFunctions vkGetMemoryWin32HandleKHR(@NativeType("PFN_vkGetMemoryWin32HandleKHR") long value) {
        nvkGetMemoryWin32HandleKHR(address(), value);
        return this;
    }

    public VmaVulkanFunctions set(long vkGetInstanceProcAddr, long vkGetDeviceProcAddr, long vkGetPhysicalDeviceProperties, long vkGetPhysicalDeviceMemoryProperties, long vkAllocateMemory, long vkFreeMemory, long vkMapMemory, long vkUnmapMemory, long vkFlushMappedMemoryRanges, long vkInvalidateMappedMemoryRanges, long vkBindBufferMemory, long vkBindImageMemory, long vkGetBufferMemoryRequirements, long vkGetImageMemoryRequirements, long vkCreateBuffer, long vkDestroyBuffer, long vkCreateImage, long vkDestroyImage, long vkCmdCopyBuffer, long vkGetBufferMemoryRequirements2KHR, long vkGetImageMemoryRequirements2KHR, long vkBindBufferMemory2KHR, long vkBindImageMemory2KHR, long vkGetPhysicalDeviceMemoryProperties2KHR, long vkGetDeviceBufferMemoryRequirements, long vkGetDeviceImageMemoryRequirements, long vkGetMemoryWin32HandleKHR) {
        vkGetInstanceProcAddr(vkGetInstanceProcAddr);
        vkGetDeviceProcAddr(vkGetDeviceProcAddr);
        vkGetPhysicalDeviceProperties(vkGetPhysicalDeviceProperties);
        vkGetPhysicalDeviceMemoryProperties(vkGetPhysicalDeviceMemoryProperties);
        vkAllocateMemory(vkAllocateMemory);
        vkFreeMemory(vkFreeMemory);
        vkMapMemory(vkMapMemory);
        vkUnmapMemory(vkUnmapMemory);
        vkFlushMappedMemoryRanges(vkFlushMappedMemoryRanges);
        vkInvalidateMappedMemoryRanges(vkInvalidateMappedMemoryRanges);
        vkBindBufferMemory(vkBindBufferMemory);
        vkBindImageMemory(vkBindImageMemory);
        vkGetBufferMemoryRequirements(vkGetBufferMemoryRequirements);
        vkGetImageMemoryRequirements(vkGetImageMemoryRequirements);
        vkCreateBuffer(vkCreateBuffer);
        vkDestroyBuffer(vkDestroyBuffer);
        vkCreateImage(vkCreateImage);
        vkDestroyImage(vkDestroyImage);
        vkCmdCopyBuffer(vkCmdCopyBuffer);
        vkGetBufferMemoryRequirements2KHR(vkGetBufferMemoryRequirements2KHR);
        vkGetImageMemoryRequirements2KHR(vkGetImageMemoryRequirements2KHR);
        vkBindBufferMemory2KHR(vkBindBufferMemory2KHR);
        vkBindImageMemory2KHR(vkBindImageMemory2KHR);
        vkGetPhysicalDeviceMemoryProperties2KHR(vkGetPhysicalDeviceMemoryProperties2KHR);
        vkGetDeviceBufferMemoryRequirements(vkGetDeviceBufferMemoryRequirements);
        vkGetDeviceImageMemoryRequirements(vkGetDeviceImageMemoryRequirements);
        vkGetMemoryWin32HandleKHR(vkGetMemoryWin32HandleKHR);
        return this;
    }

    public VmaVulkanFunctions set(VmaVulkanFunctions src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VmaVulkanFunctions malloc() {
        return new VmaVulkanFunctions(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VmaVulkanFunctions calloc() {
        return new VmaVulkanFunctions(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VmaVulkanFunctions create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VmaVulkanFunctions(MemoryUtil.memAddress(container), container);
    }

    public static VmaVulkanFunctions create(long address) {
        return new VmaVulkanFunctions(address, null);
    }

    public static VmaVulkanFunctions createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VmaVulkanFunctions(address, null);
    }

    public static VmaVulkanFunctions malloc(MemoryStack stack) {
        return new VmaVulkanFunctions(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VmaVulkanFunctions calloc(MemoryStack stack) {
        return new VmaVulkanFunctions(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static long nvkGetInstanceProcAddr(long struct) {
        return MemoryUtil.memGetAddress(struct + VKGETINSTANCEPROCADDR);
    }

    public static long nvkGetDeviceProcAddr(long struct) {
        return MemoryUtil.memGetAddress(struct + VKGETDEVICEPROCADDR);
    }

    public static long nvkGetPhysicalDeviceProperties(long struct) {
        return MemoryUtil.memGetAddress(struct + VKGETPHYSICALDEVICEPROPERTIES);
    }

    public static long nvkGetPhysicalDeviceMemoryProperties(long struct) {
        return MemoryUtil.memGetAddress(struct + VKGETPHYSICALDEVICEMEMORYPROPERTIES);
    }

    public static long nvkAllocateMemory(long struct) {
        return MemoryUtil.memGetAddress(struct + VKALLOCATEMEMORY);
    }

    public static long nvkFreeMemory(long struct) {
        return MemoryUtil.memGetAddress(struct + VKFREEMEMORY);
    }

    public static long nvkMapMemory(long struct) {
        return MemoryUtil.memGetAddress(struct + VKMAPMEMORY);
    }

    public static long nvkUnmapMemory(long struct) {
        return MemoryUtil.memGetAddress(struct + VKUNMAPMEMORY);
    }

    public static long nvkFlushMappedMemoryRanges(long struct) {
        return MemoryUtil.memGetAddress(struct + VKFLUSHMAPPEDMEMORYRANGES);
    }

    public static long nvkInvalidateMappedMemoryRanges(long struct) {
        return MemoryUtil.memGetAddress(struct + VKINVALIDATEMAPPEDMEMORYRANGES);
    }

    public static long nvkBindBufferMemory(long struct) {
        return MemoryUtil.memGetAddress(struct + VKBINDBUFFERMEMORY);
    }

    public static long nvkBindImageMemory(long struct) {
        return MemoryUtil.memGetAddress(struct + VKBINDIMAGEMEMORY);
    }

    public static long nvkGetBufferMemoryRequirements(long struct) {
        return MemoryUtil.memGetAddress(struct + VKGETBUFFERMEMORYREQUIREMENTS);
    }

    public static long nvkGetImageMemoryRequirements(long struct) {
        return MemoryUtil.memGetAddress(struct + VKGETIMAGEMEMORYREQUIREMENTS);
    }

    public static long nvkCreateBuffer(long struct) {
        return MemoryUtil.memGetAddress(struct + VKCREATEBUFFER);
    }

    public static long nvkDestroyBuffer(long struct) {
        return MemoryUtil.memGetAddress(struct + VKDESTROYBUFFER);
    }

    public static long nvkCreateImage(long struct) {
        return MemoryUtil.memGetAddress(struct + VKCREATEIMAGE);
    }

    public static long nvkDestroyImage(long struct) {
        return MemoryUtil.memGetAddress(struct + VKDESTROYIMAGE);
    }

    public static long nvkCmdCopyBuffer(long struct) {
        return MemoryUtil.memGetAddress(struct + VKCMDCOPYBUFFER);
    }

    public static long nvkGetBufferMemoryRequirements2KHR(long struct) {
        return MemoryUtil.memGetAddress(struct + VKGETBUFFERMEMORYREQUIREMENTS2KHR);
    }

    public static long nvkGetImageMemoryRequirements2KHR(long struct) {
        return MemoryUtil.memGetAddress(struct + VKGETIMAGEMEMORYREQUIREMENTS2KHR);
    }

    public static long nvkBindBufferMemory2KHR(long struct) {
        return MemoryUtil.memGetAddress(struct + VKBINDBUFFERMEMORY2KHR);
    }

    public static long nvkBindImageMemory2KHR(long struct) {
        return MemoryUtil.memGetAddress(struct + VKBINDIMAGEMEMORY2KHR);
    }

    public static long nvkGetPhysicalDeviceMemoryProperties2KHR(long struct) {
        return MemoryUtil.memGetAddress(struct + VKGETPHYSICALDEVICEMEMORYPROPERTIES2KHR);
    }

    public static long nvkGetDeviceBufferMemoryRequirements(long struct) {
        return MemoryUtil.memGetAddress(struct + VKGETDEVICEBUFFERMEMORYREQUIREMENTS);
    }

    public static long nvkGetDeviceImageMemoryRequirements(long struct) {
        return MemoryUtil.memGetAddress(struct + VKGETDEVICEIMAGEMEMORYREQUIREMENTS);
    }

    public static long nvkGetMemoryWin32HandleKHR(long struct) {
        return MemoryUtil.memGetAddress(struct + VKGETMEMORYWIN32HANDLEKHR);
    }

    public static void nvkGetInstanceProcAddr(long struct, long value) {
        MemoryUtil.memPutAddress(struct + VKGETINSTANCEPROCADDR, value);
    }

    public static void nvkGetDeviceProcAddr(long struct, long value) {
        MemoryUtil.memPutAddress(struct + VKGETDEVICEPROCADDR, value);
    }

    public static void nvkGetPhysicalDeviceProperties(long struct, long value) {
        MemoryUtil.memPutAddress(struct + VKGETPHYSICALDEVICEPROPERTIES, Checks.check(value));
    }

    public static void nvkGetPhysicalDeviceMemoryProperties(long struct, long value) {
        MemoryUtil.memPutAddress(struct + VKGETPHYSICALDEVICEMEMORYPROPERTIES, Checks.check(value));
    }

    public static void nvkAllocateMemory(long struct, long value) {
        MemoryUtil.memPutAddress(struct + VKALLOCATEMEMORY, Checks.check(value));
    }

    public static void nvkFreeMemory(long struct, long value) {
        MemoryUtil.memPutAddress(struct + VKFREEMEMORY, Checks.check(value));
    }

    public static void nvkMapMemory(long struct, long value) {
        MemoryUtil.memPutAddress(struct + VKMAPMEMORY, Checks.check(value));
    }

    public static void nvkUnmapMemory(long struct, long value) {
        MemoryUtil.memPutAddress(struct + VKUNMAPMEMORY, Checks.check(value));
    }

    public static void nvkFlushMappedMemoryRanges(long struct, long value) {
        MemoryUtil.memPutAddress(struct + VKFLUSHMAPPEDMEMORYRANGES, Checks.check(value));
    }

    public static void nvkInvalidateMappedMemoryRanges(long struct, long value) {
        MemoryUtil.memPutAddress(struct + VKINVALIDATEMAPPEDMEMORYRANGES, Checks.check(value));
    }

    public static void nvkBindBufferMemory(long struct, long value) {
        MemoryUtil.memPutAddress(struct + VKBINDBUFFERMEMORY, Checks.check(value));
    }

    public static void nvkBindImageMemory(long struct, long value) {
        MemoryUtil.memPutAddress(struct + VKBINDIMAGEMEMORY, Checks.check(value));
    }

    public static void nvkGetBufferMemoryRequirements(long struct, long value) {
        MemoryUtil.memPutAddress(struct + VKGETBUFFERMEMORYREQUIREMENTS, Checks.check(value));
    }

    public static void nvkGetImageMemoryRequirements(long struct, long value) {
        MemoryUtil.memPutAddress(struct + VKGETIMAGEMEMORYREQUIREMENTS, Checks.check(value));
    }

    public static void nvkCreateBuffer(long struct, long value) {
        MemoryUtil.memPutAddress(struct + VKCREATEBUFFER, Checks.check(value));
    }

    public static void nvkDestroyBuffer(long struct, long value) {
        MemoryUtil.memPutAddress(struct + VKDESTROYBUFFER, Checks.check(value));
    }

    public static void nvkCreateImage(long struct, long value) {
        MemoryUtil.memPutAddress(struct + VKCREATEIMAGE, Checks.check(value));
    }

    public static void nvkDestroyImage(long struct, long value) {
        MemoryUtil.memPutAddress(struct + VKDESTROYIMAGE, Checks.check(value));
    }

    public static void nvkCmdCopyBuffer(long struct, long value) {
        MemoryUtil.memPutAddress(struct + VKCMDCOPYBUFFER, Checks.check(value));
    }

    public static void nvkGetBufferMemoryRequirements2KHR(long struct, long value) {
        MemoryUtil.memPutAddress(struct + VKGETBUFFERMEMORYREQUIREMENTS2KHR, value);
    }

    public static void nvkGetImageMemoryRequirements2KHR(long struct, long value) {
        MemoryUtil.memPutAddress(struct + VKGETIMAGEMEMORYREQUIREMENTS2KHR, value);
    }

    public static void nvkBindBufferMemory2KHR(long struct, long value) {
        MemoryUtil.memPutAddress(struct + VKBINDBUFFERMEMORY2KHR, value);
    }

    public static void nvkBindImageMemory2KHR(long struct, long value) {
        MemoryUtil.memPutAddress(struct + VKBINDIMAGEMEMORY2KHR, value);
    }

    public static void nvkGetPhysicalDeviceMemoryProperties2KHR(long struct, long value) {
        MemoryUtil.memPutAddress(struct + VKGETPHYSICALDEVICEMEMORYPROPERTIES2KHR, value);
    }

    public static void nvkGetDeviceBufferMemoryRequirements(long struct, long value) {
        MemoryUtil.memPutAddress(struct + VKGETDEVICEBUFFERMEMORYREQUIREMENTS, value);
    }

    public static void nvkGetDeviceImageMemoryRequirements(long struct, long value) {
        MemoryUtil.memPutAddress(struct + VKGETDEVICEIMAGEMEMORYREQUIREMENTS, value);
    }

    public static void nvkGetMemoryWin32HandleKHR(long struct, long value) {
        MemoryUtil.memPutAddress(struct + VKGETMEMORYWIN32HANDLEKHR, value);
    }

    public static void validate(long struct) {
        Checks.check(MemoryUtil.memGetAddress(struct + VKGETPHYSICALDEVICEPROPERTIES));
        Checks.check(MemoryUtil.memGetAddress(struct + VKGETPHYSICALDEVICEMEMORYPROPERTIES));
        Checks.check(MemoryUtil.memGetAddress(struct + VKALLOCATEMEMORY));
        Checks.check(MemoryUtil.memGetAddress(struct + VKFREEMEMORY));
        Checks.check(MemoryUtil.memGetAddress(struct + VKMAPMEMORY));
        Checks.check(MemoryUtil.memGetAddress(struct + VKUNMAPMEMORY));
        Checks.check(MemoryUtil.memGetAddress(struct + VKFLUSHMAPPEDMEMORYRANGES));
        Checks.check(MemoryUtil.memGetAddress(struct + VKINVALIDATEMAPPEDMEMORYRANGES));
        Checks.check(MemoryUtil.memGetAddress(struct + VKBINDBUFFERMEMORY));
        Checks.check(MemoryUtil.memGetAddress(struct + VKBINDIMAGEMEMORY));
        Checks.check(MemoryUtil.memGetAddress(struct + VKGETBUFFERMEMORYREQUIREMENTS));
        Checks.check(MemoryUtil.memGetAddress(struct + VKGETIMAGEMEMORYREQUIREMENTS));
        Checks.check(MemoryUtil.memGetAddress(struct + VKCREATEBUFFER));
        Checks.check(MemoryUtil.memGetAddress(struct + VKDESTROYBUFFER));
        Checks.check(MemoryUtil.memGetAddress(struct + VKCREATEIMAGE));
        Checks.check(MemoryUtil.memGetAddress(struct + VKDESTROYIMAGE));
        Checks.check(MemoryUtil.memGetAddress(struct + VKCMDCOPYBUFFER));
    }

    public VmaVulkanFunctions set(VkInstance instance, VkDevice device) {
        VKCapabilitiesInstance ic = instance.getCapabilities();
        VKCapabilitiesDevice dc = device.getCapabilities();
        vkGetInstanceProcAddr(0L).vkGetDeviceProcAddr(0L).vkGetPhysicalDeviceProperties(ic.vkGetPhysicalDeviceProperties).vkGetPhysicalDeviceMemoryProperties(ic.vkGetPhysicalDeviceMemoryProperties).vkAllocateMemory(dc.vkAllocateMemory).vkFreeMemory(dc.vkFreeMemory).vkMapMemory(dc.vkMapMemory).vkUnmapMemory(dc.vkUnmapMemory).vkFlushMappedMemoryRanges(dc.vkFlushMappedMemoryRanges).vkInvalidateMappedMemoryRanges(dc.vkInvalidateMappedMemoryRanges).vkBindBufferMemory(dc.vkBindBufferMemory).vkBindImageMemory(dc.vkBindImageMemory).vkGetBufferMemoryRequirements(dc.vkGetBufferMemoryRequirements).vkGetImageMemoryRequirements(dc.vkGetImageMemoryRequirements).vkCreateBuffer(dc.vkCreateBuffer).vkDestroyBuffer(dc.vkDestroyBuffer).vkCreateImage(dc.vkCreateImage).vkDestroyImage(dc.vkDestroyImage).vkCmdCopyBuffer(dc.vkCmdCopyBuffer).vkGetBufferMemoryRequirements2KHR(dc.vkGetBufferMemoryRequirements2 != 0 ? dc.vkGetBufferMemoryRequirements2 : dc.vkGetBufferMemoryRequirements2KHR).vkGetImageMemoryRequirements2KHR(dc.vkGetImageMemoryRequirements2 != 0 ? dc.vkGetImageMemoryRequirements2 : dc.vkGetImageMemoryRequirements2KHR).vkBindBufferMemory2KHR(dc.vkBindBufferMemory2 != 0 ? dc.vkBindBufferMemory2 : dc.vkBindBufferMemory2KHR).vkBindImageMemory2KHR(dc.vkBindImageMemory2 != 0 ? dc.vkBindImageMemory2 : dc.vkBindImageMemory2KHR).vkGetPhysicalDeviceMemoryProperties2KHR(ic.vkGetPhysicalDeviceMemoryProperties2 != 0 ? ic.vkGetPhysicalDeviceMemoryProperties2 : ic.vkGetPhysicalDeviceMemoryProperties2KHR).vkGetDeviceBufferMemoryRequirements(dc.vkGetDeviceBufferMemoryRequirements != 0 ? dc.vkGetDeviceBufferMemoryRequirements : dc.vkGetDeviceBufferMemoryRequirementsKHR).vkGetDeviceImageMemoryRequirements(dc.vkGetDeviceImageMemoryRequirements != 0 ? dc.vkGetDeviceImageMemoryRequirements : dc.vkGetDeviceImageMemoryRequirementsKHR).vkGetMemoryWin32HandleKHR(dc.vkGetMemoryWin32HandleKHR);
        return this;
    }
}
