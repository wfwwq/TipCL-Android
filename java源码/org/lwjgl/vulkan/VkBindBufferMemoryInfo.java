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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkBindBufferMemoryInfo.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkBindBufferMemoryInfo.class */
public class VkBindBufferMemoryInfo extends Struct<VkBindBufferMemoryInfo> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int BUFFER;
    public static final int MEMORY;
    public static final int MEMORYOFFSET;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(8), __member(8), __member(8));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        BUFFER = layout.offsetof(2);
        MEMORY = layout.offsetof(3);
        MEMORYOFFSET = layout.offsetof(4);
    }

    protected VkBindBufferMemoryInfo(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkBindBufferMemoryInfo create(long address, ByteBuffer container) {
        return new VkBindBufferMemoryInfo(address, container);
    }

    public VkBindBufferMemoryInfo(ByteBuffer container) {
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

    @NativeType("VkBuffer")
    public long buffer() {
        return nbuffer(address());
    }

    @NativeType("VkDeviceMemory")
    public long memory() {
        return nmemory(address());
    }

    @NativeType("VkDeviceSize")
    public long memoryOffset() {
        return nmemoryOffset(address());
    }

    public VkBindBufferMemoryInfo sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkBindBufferMemoryInfo sType$Default() {
        return sType(1000157000);
    }

    public VkBindBufferMemoryInfo pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkBindBufferMemoryInfo pNext(VkBindBufferMemoryDeviceGroupInfo value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkBindBufferMemoryInfo pNext(VkBindBufferMemoryDeviceGroupInfoKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkBindBufferMemoryInfo pNext(VkBindMemoryStatus value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkBindBufferMemoryInfo pNext(VkBindMemoryStatusKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkBindBufferMemoryInfo buffer(@NativeType("VkBuffer") long value) {
        nbuffer(address(), value);
        return this;
    }

    public VkBindBufferMemoryInfo memory(@NativeType("VkDeviceMemory") long value) {
        nmemory(address(), value);
        return this;
    }

    public VkBindBufferMemoryInfo memoryOffset(@NativeType("VkDeviceSize") long value) {
        nmemoryOffset(address(), value);
        return this;
    }

    public VkBindBufferMemoryInfo set(int sType, long pNext, long buffer, long memory, long memoryOffset) {
        sType(sType);
        pNext(pNext);
        buffer(buffer);
        memory(memory);
        memoryOffset(memoryOffset);
        return this;
    }

    public VkBindBufferMemoryInfo set(VkBindBufferMemoryInfo src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkBindBufferMemoryInfo malloc() {
        return new VkBindBufferMemoryInfo(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkBindBufferMemoryInfo calloc() {
        return new VkBindBufferMemoryInfo(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkBindBufferMemoryInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkBindBufferMemoryInfo(MemoryUtil.memAddress(container), container);
    }

    public static VkBindBufferMemoryInfo create(long address) {
        return new VkBindBufferMemoryInfo(address, null);
    }

    public static VkBindBufferMemoryInfo createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkBindBufferMemoryInfo(address, null);
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

    public static VkBindBufferMemoryInfo malloc(MemoryStack stack) {
        return new VkBindBufferMemoryInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkBindBufferMemoryInfo calloc(MemoryStack stack) {
        return new VkBindBufferMemoryInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static long nbuffer(long struct) {
        return MemoryUtil.memGetLong(struct + BUFFER);
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

    public static void nbuffer(long struct, long value) {
        MemoryUtil.memPutLong(struct + BUFFER, value);
    }

    public static void nmemory(long struct, long value) {
        MemoryUtil.memPutLong(struct + MEMORY, value);
    }

    public static void nmemoryOffset(long struct, long value) {
        MemoryUtil.memPutLong(struct + MEMORYOFFSET, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkBindBufferMemoryInfo$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkBindBufferMemoryInfo$Buffer.class */
    public static class Buffer extends StructBuffer<VkBindBufferMemoryInfo, Buffer> implements NativeResource {
        private static final VkBindBufferMemoryInfo ELEMENT_FACTORY = VkBindBufferMemoryInfo.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkBindBufferMemoryInfo.SIZEOF);
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
        public VkBindBufferMemoryInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkBindBufferMemoryInfo.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkBindBufferMemoryInfo.npNext(address());
        }

        @NativeType("VkBuffer")
        public long buffer() {
            return VkBindBufferMemoryInfo.nbuffer(address());
        }

        @NativeType("VkDeviceMemory")
        public long memory() {
            return VkBindBufferMemoryInfo.nmemory(address());
        }

        @NativeType("VkDeviceSize")
        public long memoryOffset() {
            return VkBindBufferMemoryInfo.nmemoryOffset(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkBindBufferMemoryInfo.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000157000);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkBindBufferMemoryInfo.npNext(address(), value);
            return this;
        }

        public Buffer pNext(VkBindBufferMemoryDeviceGroupInfo value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkBindBufferMemoryDeviceGroupInfoKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkBindMemoryStatus value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkBindMemoryStatusKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer buffer(@NativeType("VkBuffer") long value) {
            VkBindBufferMemoryInfo.nbuffer(address(), value);
            return this;
        }

        public Buffer memory(@NativeType("VkDeviceMemory") long value) {
            VkBindBufferMemoryInfo.nmemory(address(), value);
            return this;
        }

        public Buffer memoryOffset(@NativeType("VkDeviceSize") long value) {
            VkBindBufferMemoryInfo.nmemoryOffset(address(), value);
            return this;
        }
    }
}
