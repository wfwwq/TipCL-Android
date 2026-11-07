package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkMemoryGetMetalHandleInfoEXT.class */
public class VkMemoryGetMetalHandleInfoEXT extends Struct<VkMemoryGetMetalHandleInfoEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int MEMORY;
    public static final int HANDLETYPE;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(8), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        MEMORY = layout.offsetof(2);
        HANDLETYPE = layout.offsetof(3);
    }

    protected VkMemoryGetMetalHandleInfoEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkMemoryGetMetalHandleInfoEXT create(long address, ByteBuffer container) {
        return new VkMemoryGetMetalHandleInfoEXT(address, container);
    }

    public VkMemoryGetMetalHandleInfoEXT(ByteBuffer container) {
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

    @NativeType("VkDeviceMemory")
    public long memory() {
        return nmemory(address());
    }

    @NativeType("VkExternalMemoryHandleTypeFlagBits")
    public int handleType() {
        return nhandleType(address());
    }

    public VkMemoryGetMetalHandleInfoEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkMemoryGetMetalHandleInfoEXT sType$Default() {
        return sType(EXTExternalMemoryMetal.VK_STRUCTURE_TYPE_MEMORY_GET_METAL_HANDLE_INFO_EXT);
    }

    public VkMemoryGetMetalHandleInfoEXT pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkMemoryGetMetalHandleInfoEXT memory(@NativeType("VkDeviceMemory") long value) {
        nmemory(address(), value);
        return this;
    }

    public VkMemoryGetMetalHandleInfoEXT handleType(@NativeType("VkExternalMemoryHandleTypeFlagBits") int value) {
        nhandleType(address(), value);
        return this;
    }

    public VkMemoryGetMetalHandleInfoEXT set(int sType, long pNext, long memory, int handleType) {
        sType(sType);
        pNext(pNext);
        memory(memory);
        handleType(handleType);
        return this;
    }

    public VkMemoryGetMetalHandleInfoEXT set(VkMemoryGetMetalHandleInfoEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkMemoryGetMetalHandleInfoEXT malloc() {
        return new VkMemoryGetMetalHandleInfoEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkMemoryGetMetalHandleInfoEXT calloc() {
        return new VkMemoryGetMetalHandleInfoEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkMemoryGetMetalHandleInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkMemoryGetMetalHandleInfoEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkMemoryGetMetalHandleInfoEXT create(long address) {
        return new VkMemoryGetMetalHandleInfoEXT(address, null);
    }

    public static VkMemoryGetMetalHandleInfoEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkMemoryGetMetalHandleInfoEXT(address, null);
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

    public static VkMemoryGetMetalHandleInfoEXT malloc(MemoryStack stack) {
        return new VkMemoryGetMetalHandleInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkMemoryGetMetalHandleInfoEXT calloc(MemoryStack stack) {
        return new VkMemoryGetMetalHandleInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static long nmemory(long struct) {
        return MemoryUtil.memGetLong(struct + MEMORY);
    }

    public static int nhandleType(long struct) {
        return MemoryUtil.memGetInt(struct + HANDLETYPE);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nmemory(long struct, long value) {
        MemoryUtil.memPutLong(struct + MEMORY, value);
    }

    public static void nhandleType(long struct, int value) {
        MemoryUtil.memPutInt(struct + HANDLETYPE, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkMemoryGetMetalHandleInfoEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkMemoryGetMetalHandleInfoEXT, Buffer> implements NativeResource {
        private static final VkMemoryGetMetalHandleInfoEXT ELEMENT_FACTORY = VkMemoryGetMetalHandleInfoEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkMemoryGetMetalHandleInfoEXT.SIZEOF);
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
        public VkMemoryGetMetalHandleInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkMemoryGetMetalHandleInfoEXT.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkMemoryGetMetalHandleInfoEXT.npNext(address());
        }

        @NativeType("VkDeviceMemory")
        public long memory() {
            return VkMemoryGetMetalHandleInfoEXT.nmemory(address());
        }

        @NativeType("VkExternalMemoryHandleTypeFlagBits")
        public int handleType() {
            return VkMemoryGetMetalHandleInfoEXT.nhandleType(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkMemoryGetMetalHandleInfoEXT.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(EXTExternalMemoryMetal.VK_STRUCTURE_TYPE_MEMORY_GET_METAL_HANDLE_INFO_EXT);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkMemoryGetMetalHandleInfoEXT.npNext(address(), value);
            return this;
        }

        public Buffer memory(@NativeType("VkDeviceMemory") long value) {
            VkMemoryGetMetalHandleInfoEXT.nmemory(address(), value);
            return this;
        }

        public Buffer handleType(@NativeType("VkExternalMemoryHandleTypeFlagBits") int value) {
            VkMemoryGetMetalHandleInfoEXT.nhandleType(address(), value);
            return this;
        }
    }
}
