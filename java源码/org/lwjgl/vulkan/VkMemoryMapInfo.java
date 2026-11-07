package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkMemoryMapInfo.class */
public class VkMemoryMapInfo extends Struct<VkMemoryMapInfo> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int FLAGS;
    public static final int MEMORY;
    public static final int OFFSET;
    public static final int SIZE;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(8), __member(8), __member(8));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        MEMORY = layout.offsetof(3);
        OFFSET = layout.offsetof(4);
        SIZE = layout.offsetof(5);
    }

    protected VkMemoryMapInfo(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkMemoryMapInfo create(long address, ByteBuffer container) {
        return new VkMemoryMapInfo(address, container);
    }

    public VkMemoryMapInfo(ByteBuffer container) {
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

    @NativeType("VkMemoryMapFlags")
    public int flags() {
        return nflags(address());
    }

    @NativeType("VkDeviceMemory")
    public long memory() {
        return nmemory(address());
    }

    @NativeType("VkDeviceSize")
    public long offset() {
        return noffset(address());
    }

    @NativeType("VkDeviceSize")
    public long size() {
        return nsize(address());
    }

    public VkMemoryMapInfo sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkMemoryMapInfo sType$Default() {
        return sType(1000271000);
    }

    public VkMemoryMapInfo pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkMemoryMapInfo pNext(VkMemoryMapPlacedInfoEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkMemoryMapInfo flags(@NativeType("VkMemoryMapFlags") int value) {
        nflags(address(), value);
        return this;
    }

    public VkMemoryMapInfo memory(@NativeType("VkDeviceMemory") long value) {
        nmemory(address(), value);
        return this;
    }

    public VkMemoryMapInfo offset(@NativeType("VkDeviceSize") long value) {
        noffset(address(), value);
        return this;
    }

    public VkMemoryMapInfo size(@NativeType("VkDeviceSize") long value) {
        nsize(address(), value);
        return this;
    }

    public VkMemoryMapInfo set(int sType, long pNext, int flags, long memory, long offset, long size) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        memory(memory);
        offset(offset);
        size(size);
        return this;
    }

    public VkMemoryMapInfo set(VkMemoryMapInfo src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkMemoryMapInfo malloc() {
        return new VkMemoryMapInfo(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkMemoryMapInfo calloc() {
        return new VkMemoryMapInfo(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkMemoryMapInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkMemoryMapInfo(MemoryUtil.memAddress(container), container);
    }

    public static VkMemoryMapInfo create(long address) {
        return new VkMemoryMapInfo(address, null);
    }

    public static VkMemoryMapInfo createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkMemoryMapInfo(address, null);
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

    public static VkMemoryMapInfo malloc(MemoryStack stack) {
        return new VkMemoryMapInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkMemoryMapInfo calloc(MemoryStack stack) {
        return new VkMemoryMapInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static long nmemory(long struct) {
        return MemoryUtil.memGetLong(struct + MEMORY);
    }

    public static long noffset(long struct) {
        return MemoryUtil.memGetLong(struct + OFFSET);
    }

    public static long nsize(long struct) {
        return MemoryUtil.memGetLong(struct + SIZE);
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

    public static void nmemory(long struct, long value) {
        MemoryUtil.memPutLong(struct + MEMORY, value);
    }

    public static void noffset(long struct, long value) {
        MemoryUtil.memPutLong(struct + OFFSET, value);
    }

    public static void nsize(long struct, long value) {
        MemoryUtil.memPutLong(struct + SIZE, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkMemoryMapInfo$Buffer.class */
    public static class Buffer extends StructBuffer<VkMemoryMapInfo, Buffer> implements NativeResource {
        private static final VkMemoryMapInfo ELEMENT_FACTORY = VkMemoryMapInfo.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkMemoryMapInfo.SIZEOF);
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
        public VkMemoryMapInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkMemoryMapInfo.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkMemoryMapInfo.npNext(address());
        }

        @NativeType("VkMemoryMapFlags")
        public int flags() {
            return VkMemoryMapInfo.nflags(address());
        }

        @NativeType("VkDeviceMemory")
        public long memory() {
            return VkMemoryMapInfo.nmemory(address());
        }

        @NativeType("VkDeviceSize")
        public long offset() {
            return VkMemoryMapInfo.noffset(address());
        }

        @NativeType("VkDeviceSize")
        public long size() {
            return VkMemoryMapInfo.nsize(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkMemoryMapInfo.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000271000);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkMemoryMapInfo.npNext(address(), value);
            return this;
        }

        public Buffer pNext(VkMemoryMapPlacedInfoEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer flags(@NativeType("VkMemoryMapFlags") int value) {
            VkMemoryMapInfo.nflags(address(), value);
            return this;
        }

        public Buffer memory(@NativeType("VkDeviceMemory") long value) {
            VkMemoryMapInfo.nmemory(address(), value);
            return this;
        }

        public Buffer offset(@NativeType("VkDeviceSize") long value) {
            VkMemoryMapInfo.noffset(address(), value);
            return this;
        }

        public Buffer size(@NativeType("VkDeviceSize") long value) {
            VkMemoryMapInfo.nsize(address(), value);
            return this;
        }
    }
}
