package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceVideoFormatInfoKHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceVideoFormatInfoKHR.class */
public class VkPhysicalDeviceVideoFormatInfoKHR extends Struct<VkPhysicalDeviceVideoFormatInfoKHR> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int IMAGEUSAGE;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        IMAGEUSAGE = layout.offsetof(2);
    }

    protected VkPhysicalDeviceVideoFormatInfoKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceVideoFormatInfoKHR create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceVideoFormatInfoKHR(address, container);
    }

    public VkPhysicalDeviceVideoFormatInfoKHR(ByteBuffer container) {
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

    @NativeType("VkImageUsageFlags")
    public int imageUsage() {
        return nimageUsage(address());
    }

    public VkPhysicalDeviceVideoFormatInfoKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceVideoFormatInfoKHR sType$Default() {
        return sType(KHRVideoQueue.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VIDEO_FORMAT_INFO_KHR);
    }

    public VkPhysicalDeviceVideoFormatInfoKHR pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceVideoFormatInfoKHR pNext(VkVideoProfileListInfoKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPhysicalDeviceVideoFormatInfoKHR imageUsage(@NativeType("VkImageUsageFlags") int value) {
        nimageUsage(address(), value);
        return this;
    }

    public VkPhysicalDeviceVideoFormatInfoKHR set(int sType, long pNext, int imageUsage) {
        sType(sType);
        pNext(pNext);
        imageUsage(imageUsage);
        return this;
    }

    public VkPhysicalDeviceVideoFormatInfoKHR set(VkPhysicalDeviceVideoFormatInfoKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceVideoFormatInfoKHR malloc() {
        return new VkPhysicalDeviceVideoFormatInfoKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceVideoFormatInfoKHR calloc() {
        return new VkPhysicalDeviceVideoFormatInfoKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceVideoFormatInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceVideoFormatInfoKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceVideoFormatInfoKHR create(long address) {
        return new VkPhysicalDeviceVideoFormatInfoKHR(address, null);
    }

    public static VkPhysicalDeviceVideoFormatInfoKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceVideoFormatInfoKHR(address, null);
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

    public static VkPhysicalDeviceVideoFormatInfoKHR malloc(MemoryStack stack) {
        return new VkPhysicalDeviceVideoFormatInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceVideoFormatInfoKHR calloc(MemoryStack stack) {
        return new VkPhysicalDeviceVideoFormatInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nimageUsage(long struct) {
        return MemoryUtil.memGetInt(struct + IMAGEUSAGE);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nimageUsage(long struct, int value) {
        MemoryUtil.memPutInt(struct + IMAGEUSAGE, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceVideoFormatInfoKHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceVideoFormatInfoKHR$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceVideoFormatInfoKHR, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceVideoFormatInfoKHR ELEMENT_FACTORY = VkPhysicalDeviceVideoFormatInfoKHR.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceVideoFormatInfoKHR.SIZEOF);
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
        public VkPhysicalDeviceVideoFormatInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceVideoFormatInfoKHR.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkPhysicalDeviceVideoFormatInfoKHR.npNext(address());
        }

        @NativeType("VkImageUsageFlags")
        public int imageUsage() {
            return VkPhysicalDeviceVideoFormatInfoKHR.nimageUsage(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceVideoFormatInfoKHR.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(KHRVideoQueue.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VIDEO_FORMAT_INFO_KHR);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkPhysicalDeviceVideoFormatInfoKHR.npNext(address(), value);
            return this;
        }

        public Buffer pNext(VkVideoProfileListInfoKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer imageUsage(@NativeType("VkImageUsageFlags") int value) {
            VkPhysicalDeviceVideoFormatInfoKHR.nimageUsage(address(), value);
            return this;
        }
    }
}
