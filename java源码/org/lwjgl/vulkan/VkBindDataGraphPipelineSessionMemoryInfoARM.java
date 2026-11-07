package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkBindDataGraphPipelineSessionMemoryInfoARM.class */
public class VkBindDataGraphPipelineSessionMemoryInfoARM extends Struct<VkBindDataGraphPipelineSessionMemoryInfoARM> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int SESSION;
    public static final int BINDPOINT;
    public static final int OBJECTINDEX;
    public static final int MEMORY;
    public static final int MEMORYOFFSET;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(8), __member(4), __member(4), __member(8), __member(8));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SESSION = layout.offsetof(2);
        BINDPOINT = layout.offsetof(3);
        OBJECTINDEX = layout.offsetof(4);
        MEMORY = layout.offsetof(5);
        MEMORYOFFSET = layout.offsetof(6);
    }

    protected VkBindDataGraphPipelineSessionMemoryInfoARM(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkBindDataGraphPipelineSessionMemoryInfoARM create(long address, ByteBuffer container) {
        return new VkBindDataGraphPipelineSessionMemoryInfoARM(address, container);
    }

    public VkBindDataGraphPipelineSessionMemoryInfoARM(ByteBuffer container) {
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

    @NativeType("VkDataGraphPipelineSessionARM")
    public long session() {
        return nsession(address());
    }

    @NativeType("VkDataGraphPipelineSessionBindPointARM")
    public int bindPoint() {
        return nbindPoint(address());
    }

    @NativeType("uint32_t")
    public int objectIndex() {
        return nobjectIndex(address());
    }

    @NativeType("VkDeviceMemory")
    public long memory() {
        return nmemory(address());
    }

    @NativeType("VkDeviceSize")
    public long memoryOffset() {
        return nmemoryOffset(address());
    }

    public VkBindDataGraphPipelineSessionMemoryInfoARM sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkBindDataGraphPipelineSessionMemoryInfoARM sType$Default() {
        return sType(ARMDataGraph.VK_STRUCTURE_TYPE_BIND_DATA_GRAPH_PIPELINE_SESSION_MEMORY_INFO_ARM);
    }

    public VkBindDataGraphPipelineSessionMemoryInfoARM pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkBindDataGraphPipelineSessionMemoryInfoARM session(@NativeType("VkDataGraphPipelineSessionARM") long value) {
        nsession(address(), value);
        return this;
    }

    public VkBindDataGraphPipelineSessionMemoryInfoARM bindPoint(@NativeType("VkDataGraphPipelineSessionBindPointARM") int value) {
        nbindPoint(address(), value);
        return this;
    }

    public VkBindDataGraphPipelineSessionMemoryInfoARM objectIndex(@NativeType("uint32_t") int value) {
        nobjectIndex(address(), value);
        return this;
    }

    public VkBindDataGraphPipelineSessionMemoryInfoARM memory(@NativeType("VkDeviceMemory") long value) {
        nmemory(address(), value);
        return this;
    }

    public VkBindDataGraphPipelineSessionMemoryInfoARM memoryOffset(@NativeType("VkDeviceSize") long value) {
        nmemoryOffset(address(), value);
        return this;
    }

    public VkBindDataGraphPipelineSessionMemoryInfoARM set(int sType, long pNext, long session, int bindPoint, int objectIndex, long memory, long memoryOffset) {
        sType(sType);
        pNext(pNext);
        session(session);
        bindPoint(bindPoint);
        objectIndex(objectIndex);
        memory(memory);
        memoryOffset(memoryOffset);
        return this;
    }

    public VkBindDataGraphPipelineSessionMemoryInfoARM set(VkBindDataGraphPipelineSessionMemoryInfoARM src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkBindDataGraphPipelineSessionMemoryInfoARM malloc() {
        return new VkBindDataGraphPipelineSessionMemoryInfoARM(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkBindDataGraphPipelineSessionMemoryInfoARM calloc() {
        return new VkBindDataGraphPipelineSessionMemoryInfoARM(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkBindDataGraphPipelineSessionMemoryInfoARM create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkBindDataGraphPipelineSessionMemoryInfoARM(MemoryUtil.memAddress(container), container);
    }

    public static VkBindDataGraphPipelineSessionMemoryInfoARM create(long address) {
        return new VkBindDataGraphPipelineSessionMemoryInfoARM(address, null);
    }

    public static VkBindDataGraphPipelineSessionMemoryInfoARM createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkBindDataGraphPipelineSessionMemoryInfoARM(address, null);
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

    public static VkBindDataGraphPipelineSessionMemoryInfoARM malloc(MemoryStack stack) {
        return new VkBindDataGraphPipelineSessionMemoryInfoARM(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkBindDataGraphPipelineSessionMemoryInfoARM calloc(MemoryStack stack) {
        return new VkBindDataGraphPipelineSessionMemoryInfoARM(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static long nsession(long struct) {
        return MemoryUtil.memGetLong(struct + SESSION);
    }

    public static int nbindPoint(long struct) {
        return MemoryUtil.memGetInt(struct + BINDPOINT);
    }

    public static int nobjectIndex(long struct) {
        return MemoryUtil.memGetInt(struct + OBJECTINDEX);
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

    public static void nsession(long struct, long value) {
        MemoryUtil.memPutLong(struct + SESSION, value);
    }

    public static void nbindPoint(long struct, int value) {
        MemoryUtil.memPutInt(struct + BINDPOINT, value);
    }

    public static void nobjectIndex(long struct, int value) {
        MemoryUtil.memPutInt(struct + OBJECTINDEX, value);
    }

    public static void nmemory(long struct, long value) {
        MemoryUtil.memPutLong(struct + MEMORY, value);
    }

    public static void nmemoryOffset(long struct, long value) {
        MemoryUtil.memPutLong(struct + MEMORYOFFSET, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkBindDataGraphPipelineSessionMemoryInfoARM$Buffer.class */
    public static class Buffer extends StructBuffer<VkBindDataGraphPipelineSessionMemoryInfoARM, Buffer> implements NativeResource {
        private static final VkBindDataGraphPipelineSessionMemoryInfoARM ELEMENT_FACTORY = VkBindDataGraphPipelineSessionMemoryInfoARM.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkBindDataGraphPipelineSessionMemoryInfoARM.SIZEOF);
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
        public VkBindDataGraphPipelineSessionMemoryInfoARM getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkBindDataGraphPipelineSessionMemoryInfoARM.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkBindDataGraphPipelineSessionMemoryInfoARM.npNext(address());
        }

        @NativeType("VkDataGraphPipelineSessionARM")
        public long session() {
            return VkBindDataGraphPipelineSessionMemoryInfoARM.nsession(address());
        }

        @NativeType("VkDataGraphPipelineSessionBindPointARM")
        public int bindPoint() {
            return VkBindDataGraphPipelineSessionMemoryInfoARM.nbindPoint(address());
        }

        @NativeType("uint32_t")
        public int objectIndex() {
            return VkBindDataGraphPipelineSessionMemoryInfoARM.nobjectIndex(address());
        }

        @NativeType("VkDeviceMemory")
        public long memory() {
            return VkBindDataGraphPipelineSessionMemoryInfoARM.nmemory(address());
        }

        @NativeType("VkDeviceSize")
        public long memoryOffset() {
            return VkBindDataGraphPipelineSessionMemoryInfoARM.nmemoryOffset(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkBindDataGraphPipelineSessionMemoryInfoARM.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(ARMDataGraph.VK_STRUCTURE_TYPE_BIND_DATA_GRAPH_PIPELINE_SESSION_MEMORY_INFO_ARM);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkBindDataGraphPipelineSessionMemoryInfoARM.npNext(address(), value);
            return this;
        }

        public Buffer session(@NativeType("VkDataGraphPipelineSessionARM") long value) {
            VkBindDataGraphPipelineSessionMemoryInfoARM.nsession(address(), value);
            return this;
        }

        public Buffer bindPoint(@NativeType("VkDataGraphPipelineSessionBindPointARM") int value) {
            VkBindDataGraphPipelineSessionMemoryInfoARM.nbindPoint(address(), value);
            return this;
        }

        public Buffer objectIndex(@NativeType("uint32_t") int value) {
            VkBindDataGraphPipelineSessionMemoryInfoARM.nobjectIndex(address(), value);
            return this;
        }

        public Buffer memory(@NativeType("VkDeviceMemory") long value) {
            VkBindDataGraphPipelineSessionMemoryInfoARM.nmemory(address(), value);
            return this;
        }

        public Buffer memoryOffset(@NativeType("VkDeviceSize") long value) {
            VkBindDataGraphPipelineSessionMemoryInfoARM.nmemoryOffset(address(), value);
            return this;
        }
    }
}
