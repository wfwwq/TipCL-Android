package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkMemoryUnmapInfo.class */
public class VkMemoryUnmapInfo extends Struct<VkMemoryUnmapInfo> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int FLAGS;
    public static final int MEMORY;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(8));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        MEMORY = layout.offsetof(3);
    }

    protected VkMemoryUnmapInfo(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkMemoryUnmapInfo create(long address, ByteBuffer container) {
        return new VkMemoryUnmapInfo(address, container);
    }

    public VkMemoryUnmapInfo(ByteBuffer container) {
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

    @NativeType("VkMemoryUnmapFlags")
    public int flags() {
        return nflags(address());
    }

    @NativeType("VkDeviceMemory")
    public long memory() {
        return nmemory(address());
    }

    public VkMemoryUnmapInfo sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkMemoryUnmapInfo sType$Default() {
        return sType(1000271001);
    }

    public VkMemoryUnmapInfo pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkMemoryUnmapInfo flags(@NativeType("VkMemoryUnmapFlags") int value) {
        nflags(address(), value);
        return this;
    }

    public VkMemoryUnmapInfo memory(@NativeType("VkDeviceMemory") long value) {
        nmemory(address(), value);
        return this;
    }

    public VkMemoryUnmapInfo set(int sType, long pNext, int flags, long memory) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        memory(memory);
        return this;
    }

    public VkMemoryUnmapInfo set(VkMemoryUnmapInfo src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkMemoryUnmapInfo malloc() {
        return new VkMemoryUnmapInfo(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkMemoryUnmapInfo calloc() {
        return new VkMemoryUnmapInfo(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkMemoryUnmapInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkMemoryUnmapInfo(MemoryUtil.memAddress(container), container);
    }

    public static VkMemoryUnmapInfo create(long address) {
        return new VkMemoryUnmapInfo(address, null);
    }

    public static VkMemoryUnmapInfo createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkMemoryUnmapInfo(address, null);
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

    public static VkMemoryUnmapInfo malloc(MemoryStack stack) {
        return new VkMemoryUnmapInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkMemoryUnmapInfo calloc(MemoryStack stack) {
        return new VkMemoryUnmapInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkMemoryUnmapInfo$Buffer.class */
    public static class Buffer extends StructBuffer<VkMemoryUnmapInfo, Buffer> implements NativeResource {
        private static final VkMemoryUnmapInfo ELEMENT_FACTORY = VkMemoryUnmapInfo.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkMemoryUnmapInfo.SIZEOF);
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
        public VkMemoryUnmapInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkMemoryUnmapInfo.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkMemoryUnmapInfo.npNext(address());
        }

        @NativeType("VkMemoryUnmapFlags")
        public int flags() {
            return VkMemoryUnmapInfo.nflags(address());
        }

        @NativeType("VkDeviceMemory")
        public long memory() {
            return VkMemoryUnmapInfo.nmemory(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkMemoryUnmapInfo.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000271001);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkMemoryUnmapInfo.npNext(address(), value);
            return this;
        }

        public Buffer flags(@NativeType("VkMemoryUnmapFlags") int value) {
            VkMemoryUnmapInfo.nflags(address(), value);
            return this;
        }

        public Buffer memory(@NativeType("VkDeviceMemory") long value) {
            VkMemoryUnmapInfo.nmemory(address(), value);
            return this;
        }
    }
}
