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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkBindImageMemoryInfo.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkBindImageMemoryInfo.class */
public class VkBindImageMemoryInfo extends Struct<VkBindImageMemoryInfo> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int IMAGE;
    public static final int MEMORY;
    public static final int MEMORYOFFSET;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(8), __member(8), __member(8));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        IMAGE = layout.offsetof(2);
        MEMORY = layout.offsetof(3);
        MEMORYOFFSET = layout.offsetof(4);
    }

    protected VkBindImageMemoryInfo(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkBindImageMemoryInfo create(long address, ByteBuffer container) {
        return new VkBindImageMemoryInfo(address, container);
    }

    public VkBindImageMemoryInfo(ByteBuffer container) {
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

    @NativeType("VkImage")
    public long image() {
        return nimage(address());
    }

    @NativeType("VkDeviceMemory")
    public long memory() {
        return nmemory(address());
    }

    @NativeType("VkDeviceSize")
    public long memoryOffset() {
        return nmemoryOffset(address());
    }

    public VkBindImageMemoryInfo sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkBindImageMemoryInfo sType$Default() {
        return sType(1000157001);
    }

    public VkBindImageMemoryInfo pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkBindImageMemoryInfo pNext(VkBindImageMemoryDeviceGroupInfo value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkBindImageMemoryInfo pNext(VkBindImageMemoryDeviceGroupInfoKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkBindImageMemoryInfo pNext(VkBindImageMemorySwapchainInfoKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkBindImageMemoryInfo pNext(VkBindImagePlaneMemoryInfo value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkBindImageMemoryInfo pNext(VkBindImagePlaneMemoryInfoKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkBindImageMemoryInfo pNext(VkBindMemoryStatus value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkBindImageMemoryInfo pNext(VkBindMemoryStatusKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkBindImageMemoryInfo image(@NativeType("VkImage") long value) {
        nimage(address(), value);
        return this;
    }

    public VkBindImageMemoryInfo memory(@NativeType("VkDeviceMemory") long value) {
        nmemory(address(), value);
        return this;
    }

    public VkBindImageMemoryInfo memoryOffset(@NativeType("VkDeviceSize") long value) {
        nmemoryOffset(address(), value);
        return this;
    }

    public VkBindImageMemoryInfo set(int sType, long pNext, long image, long memory, long memoryOffset) {
        sType(sType);
        pNext(pNext);
        image(image);
        memory(memory);
        memoryOffset(memoryOffset);
        return this;
    }

    public VkBindImageMemoryInfo set(VkBindImageMemoryInfo src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkBindImageMemoryInfo malloc() {
        return new VkBindImageMemoryInfo(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkBindImageMemoryInfo calloc() {
        return new VkBindImageMemoryInfo(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkBindImageMemoryInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkBindImageMemoryInfo(MemoryUtil.memAddress(container), container);
    }

    public static VkBindImageMemoryInfo create(long address) {
        return new VkBindImageMemoryInfo(address, null);
    }

    public static VkBindImageMemoryInfo createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkBindImageMemoryInfo(address, null);
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

    public static VkBindImageMemoryInfo malloc(MemoryStack stack) {
        return new VkBindImageMemoryInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkBindImageMemoryInfo calloc(MemoryStack stack) {
        return new VkBindImageMemoryInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static long nimage(long struct) {
        return MemoryUtil.memGetLong(struct + IMAGE);
    }

    public static long nmemory(long struct) {
        return MemoryUtil.memGetLong(struct + MEMORY);
    }

    public static long nmemoryOffset(long struct) {
        return MemoryUtil.memGetLong(struct + MEMORYOFFSET);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nimage(long struct, long value) {
        MemoryUtil.memPutLong(struct + IMAGE, value);
    }

    public static void nmemory(long struct, long value) {
        MemoryUtil.memPutLong(struct + MEMORY, value);
    }

    public static void nmemoryOffset(long struct, long value) {
        MemoryUtil.memPutLong(struct + MEMORYOFFSET, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkBindImageMemoryInfo$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkBindImageMemoryInfo$Buffer.class */
    public static class Buffer extends StructBuffer<VkBindImageMemoryInfo, Buffer> implements NativeResource {
        private static final VkBindImageMemoryInfo ELEMENT_FACTORY = VkBindImageMemoryInfo.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkBindImageMemoryInfo.SIZEOF);
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
        public VkBindImageMemoryInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkBindImageMemoryInfo.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkBindImageMemoryInfo.npNext(address());
        }

        @NativeType("VkImage")
        public long image() {
            return VkBindImageMemoryInfo.nimage(address());
        }

        @NativeType("VkDeviceMemory")
        public long memory() {
            return VkBindImageMemoryInfo.nmemory(address());
        }

        @NativeType("VkDeviceSize")
        public long memoryOffset() {
            return VkBindImageMemoryInfo.nmemoryOffset(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkBindImageMemoryInfo.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000157001);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkBindImageMemoryInfo.npNext(address(), value);
            return this;
        }

        public Buffer pNext(VkBindImageMemoryDeviceGroupInfo value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkBindImageMemoryDeviceGroupInfoKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkBindImageMemorySwapchainInfoKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkBindImagePlaneMemoryInfo value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkBindImagePlaneMemoryInfoKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkBindMemoryStatus value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkBindMemoryStatusKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer image(@NativeType("VkImage") long value) {
            VkBindImageMemoryInfo.nimage(address(), value);
            return this;
        }

        public Buffer memory(@NativeType("VkDeviceMemory") long value) {
            VkBindImageMemoryInfo.nmemory(address(), value);
            return this;
        }

        public Buffer memoryOffset(@NativeType("VkDeviceSize") long value) {
            VkBindImageMemoryInfo.nmemoryOffset(address(), value);
            return this;
        }
    }
}
