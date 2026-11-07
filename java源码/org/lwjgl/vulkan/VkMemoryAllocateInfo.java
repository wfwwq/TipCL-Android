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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkMemoryAllocateInfo.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkMemoryAllocateInfo.class */
public class VkMemoryAllocateInfo extends Struct<VkMemoryAllocateInfo> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int ALLOCATIONSIZE;
    public static final int MEMORYTYPEINDEX;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(8), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        ALLOCATIONSIZE = layout.offsetof(2);
        MEMORYTYPEINDEX = layout.offsetof(3);
    }

    protected VkMemoryAllocateInfo(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkMemoryAllocateInfo create(long address, ByteBuffer container) {
        return new VkMemoryAllocateInfo(address, container);
    }

    public VkMemoryAllocateInfo(ByteBuffer container) {
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

    @NativeType("VkDeviceSize")
    public long allocationSize() {
        return nallocationSize(address());
    }

    @NativeType("uint32_t")
    public int memoryTypeIndex() {
        return nmemoryTypeIndex(address());
    }

    public VkMemoryAllocateInfo sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkMemoryAllocateInfo sType$Default() {
        return sType(5);
    }

    public VkMemoryAllocateInfo pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkMemoryAllocateInfo pNext(VkDedicatedAllocationMemoryAllocateInfoNV value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkMemoryAllocateInfo pNext(VkExportMemoryAllocateInfo value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkMemoryAllocateInfo pNext(VkExportMemoryAllocateInfoKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkMemoryAllocateInfo pNext(VkExportMemoryAllocateInfoNV value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkMemoryAllocateInfo pNext(VkExportMemoryWin32HandleInfoKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkMemoryAllocateInfo pNext(VkExportMemoryWin32HandleInfoNV value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkMemoryAllocateInfo pNext(VkExportMetalObjectCreateInfoEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkMemoryAllocateInfo pNext(VkImportAndroidHardwareBufferInfoANDROID value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkMemoryAllocateInfo pNext(VkImportMemoryFdInfoKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkMemoryAllocateInfo pNext(VkImportMemoryHostPointerInfoEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkMemoryAllocateInfo pNext(VkImportMemoryMetalHandleInfoEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkMemoryAllocateInfo pNext(VkImportMemoryWin32HandleInfoKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkMemoryAllocateInfo pNext(VkImportMemoryWin32HandleInfoNV value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkMemoryAllocateInfo pNext(VkImportMetalBufferInfoEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkMemoryAllocateInfo pNext(VkMemoryAllocateFlagsInfo value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkMemoryAllocateInfo pNext(VkMemoryAllocateFlagsInfoKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkMemoryAllocateInfo pNext(VkMemoryDedicatedAllocateInfo value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkMemoryAllocateInfo pNext(VkMemoryDedicatedAllocateInfoKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkMemoryAllocateInfo pNext(VkMemoryDedicatedAllocateInfoTensorARM value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkMemoryAllocateInfo pNext(VkMemoryOpaqueCaptureAddressAllocateInfo value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkMemoryAllocateInfo pNext(VkMemoryOpaqueCaptureAddressAllocateInfoKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkMemoryAllocateInfo pNext(VkMemoryPriorityAllocateInfoEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkMemoryAllocateInfo allocationSize(@NativeType("VkDeviceSize") long value) {
        nallocationSize(address(), value);
        return this;
    }

    public VkMemoryAllocateInfo memoryTypeIndex(@NativeType("uint32_t") int value) {
        nmemoryTypeIndex(address(), value);
        return this;
    }

    public VkMemoryAllocateInfo set(int sType, long pNext, long allocationSize, int memoryTypeIndex) {
        sType(sType);
        pNext(pNext);
        allocationSize(allocationSize);
        memoryTypeIndex(memoryTypeIndex);
        return this;
    }

    public VkMemoryAllocateInfo set(VkMemoryAllocateInfo src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkMemoryAllocateInfo malloc() {
        return new VkMemoryAllocateInfo(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkMemoryAllocateInfo calloc() {
        return new VkMemoryAllocateInfo(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkMemoryAllocateInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkMemoryAllocateInfo(MemoryUtil.memAddress(container), container);
    }

    public static VkMemoryAllocateInfo create(long address) {
        return new VkMemoryAllocateInfo(address, null);
    }

    public static VkMemoryAllocateInfo createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkMemoryAllocateInfo(address, null);
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

    public static VkMemoryAllocateInfo malloc(MemoryStack stack) {
        return new VkMemoryAllocateInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkMemoryAllocateInfo calloc(MemoryStack stack) {
        return new VkMemoryAllocateInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static long nallocationSize(long struct) {
        return MemoryUtil.memGetLong(struct + ALLOCATIONSIZE);
    }

    public static int nmemoryTypeIndex(long struct) {
        return MemoryUtil.memGetInt(struct + MEMORYTYPEINDEX);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nallocationSize(long struct, long value) {
        MemoryUtil.memPutLong(struct + ALLOCATIONSIZE, value);
    }

    public static void nmemoryTypeIndex(long struct, int value) {
        MemoryUtil.memPutInt(struct + MEMORYTYPEINDEX, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkMemoryAllocateInfo$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkMemoryAllocateInfo$Buffer.class */
    public static class Buffer extends StructBuffer<VkMemoryAllocateInfo, Buffer> implements NativeResource {
        private static final VkMemoryAllocateInfo ELEMENT_FACTORY = VkMemoryAllocateInfo.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkMemoryAllocateInfo.SIZEOF);
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
        public VkMemoryAllocateInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkMemoryAllocateInfo.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkMemoryAllocateInfo.npNext(address());
        }

        @NativeType("VkDeviceSize")
        public long allocationSize() {
            return VkMemoryAllocateInfo.nallocationSize(address());
        }

        @NativeType("uint32_t")
        public int memoryTypeIndex() {
            return VkMemoryAllocateInfo.nmemoryTypeIndex(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkMemoryAllocateInfo.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(5);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkMemoryAllocateInfo.npNext(address(), value);
            return this;
        }

        public Buffer pNext(VkDedicatedAllocationMemoryAllocateInfoNV value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkExportMemoryAllocateInfo value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkExportMemoryAllocateInfoKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkExportMemoryAllocateInfoNV value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkExportMemoryWin32HandleInfoKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkExportMemoryWin32HandleInfoNV value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkExportMetalObjectCreateInfoEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkImportAndroidHardwareBufferInfoANDROID value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkImportMemoryFdInfoKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkImportMemoryHostPointerInfoEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkImportMemoryMetalHandleInfoEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkImportMemoryWin32HandleInfoKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkImportMemoryWin32HandleInfoNV value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkImportMetalBufferInfoEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkMemoryAllocateFlagsInfo value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkMemoryAllocateFlagsInfoKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkMemoryDedicatedAllocateInfo value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkMemoryDedicatedAllocateInfoKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkMemoryDedicatedAllocateInfoTensorARM value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkMemoryOpaqueCaptureAddressAllocateInfo value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkMemoryOpaqueCaptureAddressAllocateInfoKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkMemoryPriorityAllocateInfoEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer allocationSize(@NativeType("VkDeviceSize") long value) {
            VkMemoryAllocateInfo.nallocationSize(address(), value);
            return this;
        }

        public Buffer memoryTypeIndex(@NativeType("uint32_t") int value) {
            VkMemoryAllocateInfo.nmemoryTypeIndex(address(), value);
            return this;
        }
    }
}
