package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkBindTensorMemoryInfoARM.class */
public class VkBindTensorMemoryInfoARM extends Struct<VkBindTensorMemoryInfoARM> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int TENSOR;
    public static final int MEMORY;
    public static final int MEMORYOFFSET;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(8), __member(8), __member(8));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        TENSOR = layout.offsetof(2);
        MEMORY = layout.offsetof(3);
        MEMORYOFFSET = layout.offsetof(4);
    }

    protected VkBindTensorMemoryInfoARM(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkBindTensorMemoryInfoARM create(long address, ByteBuffer container) {
        return new VkBindTensorMemoryInfoARM(address, container);
    }

    public VkBindTensorMemoryInfoARM(ByteBuffer container) {
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

    @NativeType("VkTensorARM")
    public long tensor() {
        return ntensor(address());
    }

    @NativeType("VkDeviceMemory")
    public long memory() {
        return nmemory(address());
    }

    @NativeType("VkDeviceSize")
    public long memoryOffset() {
        return nmemoryOffset(address());
    }

    public VkBindTensorMemoryInfoARM sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkBindTensorMemoryInfoARM sType$Default() {
        return sType(ARMTensors.VK_STRUCTURE_TYPE_BIND_TENSOR_MEMORY_INFO_ARM);
    }

    public VkBindTensorMemoryInfoARM pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkBindTensorMemoryInfoARM tensor(@NativeType("VkTensorARM") long value) {
        ntensor(address(), value);
        return this;
    }

    public VkBindTensorMemoryInfoARM memory(@NativeType("VkDeviceMemory") long value) {
        nmemory(address(), value);
        return this;
    }

    public VkBindTensorMemoryInfoARM memoryOffset(@NativeType("VkDeviceSize") long value) {
        nmemoryOffset(address(), value);
        return this;
    }

    public VkBindTensorMemoryInfoARM set(int sType, long pNext, long tensor, long memory, long memoryOffset) {
        sType(sType);
        pNext(pNext);
        tensor(tensor);
        memory(memory);
        memoryOffset(memoryOffset);
        return this;
    }

    public VkBindTensorMemoryInfoARM set(VkBindTensorMemoryInfoARM src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkBindTensorMemoryInfoARM malloc() {
        return new VkBindTensorMemoryInfoARM(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkBindTensorMemoryInfoARM calloc() {
        return new VkBindTensorMemoryInfoARM(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkBindTensorMemoryInfoARM create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkBindTensorMemoryInfoARM(MemoryUtil.memAddress(container), container);
    }

    public static VkBindTensorMemoryInfoARM create(long address) {
        return new VkBindTensorMemoryInfoARM(address, null);
    }

    public static VkBindTensorMemoryInfoARM createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkBindTensorMemoryInfoARM(address, null);
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

    public static VkBindTensorMemoryInfoARM malloc(MemoryStack stack) {
        return new VkBindTensorMemoryInfoARM(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkBindTensorMemoryInfoARM calloc(MemoryStack stack) {
        return new VkBindTensorMemoryInfoARM(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static long ntensor(long struct) {
        return MemoryUtil.memGetLong(struct + TENSOR);
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

    public static void ntensor(long struct, long value) {
        MemoryUtil.memPutLong(struct + TENSOR, value);
    }

    public static void nmemory(long struct, long value) {
        MemoryUtil.memPutLong(struct + MEMORY, value);
    }

    public static void nmemoryOffset(long struct, long value) {
        MemoryUtil.memPutLong(struct + MEMORYOFFSET, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkBindTensorMemoryInfoARM$Buffer.class */
    public static class Buffer extends StructBuffer<VkBindTensorMemoryInfoARM, Buffer> implements NativeResource {
        private static final VkBindTensorMemoryInfoARM ELEMENT_FACTORY = VkBindTensorMemoryInfoARM.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkBindTensorMemoryInfoARM.SIZEOF);
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
        public VkBindTensorMemoryInfoARM getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkBindTensorMemoryInfoARM.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkBindTensorMemoryInfoARM.npNext(address());
        }

        @NativeType("VkTensorARM")
        public long tensor() {
            return VkBindTensorMemoryInfoARM.ntensor(address());
        }

        @NativeType("VkDeviceMemory")
        public long memory() {
            return VkBindTensorMemoryInfoARM.nmemory(address());
        }

        @NativeType("VkDeviceSize")
        public long memoryOffset() {
            return VkBindTensorMemoryInfoARM.nmemoryOffset(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkBindTensorMemoryInfoARM.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(ARMTensors.VK_STRUCTURE_TYPE_BIND_TENSOR_MEMORY_INFO_ARM);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkBindTensorMemoryInfoARM.npNext(address(), value);
            return this;
        }

        public Buffer tensor(@NativeType("VkTensorARM") long value) {
            VkBindTensorMemoryInfoARM.ntensor(address(), value);
            return this;
        }

        public Buffer memory(@NativeType("VkDeviceMemory") long value) {
            VkBindTensorMemoryInfoARM.nmemory(address(), value);
            return this;
        }

        public Buffer memoryOffset(@NativeType("VkDeviceSize") long value) {
            VkBindTensorMemoryInfoARM.nmemoryOffset(address(), value);
            return this;
        }
    }
}
