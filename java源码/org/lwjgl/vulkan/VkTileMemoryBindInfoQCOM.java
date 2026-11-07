package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkTileMemoryBindInfoQCOM.class */
public class VkTileMemoryBindInfoQCOM extends Struct<VkTileMemoryBindInfoQCOM> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int MEMORY;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(8));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        MEMORY = layout.offsetof(2);
    }

    protected VkTileMemoryBindInfoQCOM(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkTileMemoryBindInfoQCOM create(long address, ByteBuffer container) {
        return new VkTileMemoryBindInfoQCOM(address, container);
    }

    public VkTileMemoryBindInfoQCOM(ByteBuffer container) {
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

    public VkTileMemoryBindInfoQCOM sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkTileMemoryBindInfoQCOM sType$Default() {
        return sType(QCOMTileMemoryHeap.VK_STRUCTURE_TYPE_TILE_MEMORY_BIND_INFO_QCOM);
    }

    public VkTileMemoryBindInfoQCOM pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkTileMemoryBindInfoQCOM memory(@NativeType("VkDeviceMemory") long value) {
        nmemory(address(), value);
        return this;
    }

    public VkTileMemoryBindInfoQCOM set(int sType, long pNext, long memory) {
        sType(sType);
        pNext(pNext);
        memory(memory);
        return this;
    }

    public VkTileMemoryBindInfoQCOM set(VkTileMemoryBindInfoQCOM src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkTileMemoryBindInfoQCOM malloc() {
        return new VkTileMemoryBindInfoQCOM(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkTileMemoryBindInfoQCOM calloc() {
        return new VkTileMemoryBindInfoQCOM(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkTileMemoryBindInfoQCOM create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkTileMemoryBindInfoQCOM(MemoryUtil.memAddress(container), container);
    }

    public static VkTileMemoryBindInfoQCOM create(long address) {
        return new VkTileMemoryBindInfoQCOM(address, null);
    }

    public static VkTileMemoryBindInfoQCOM createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkTileMemoryBindInfoQCOM(address, null);
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

    public static VkTileMemoryBindInfoQCOM malloc(MemoryStack stack) {
        return new VkTileMemoryBindInfoQCOM(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkTileMemoryBindInfoQCOM calloc(MemoryStack stack) {
        return new VkTileMemoryBindInfoQCOM(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nmemory(long struct, long value) {
        MemoryUtil.memPutLong(struct + MEMORY, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkTileMemoryBindInfoQCOM$Buffer.class */
    public static class Buffer extends StructBuffer<VkTileMemoryBindInfoQCOM, Buffer> implements NativeResource {
        private static final VkTileMemoryBindInfoQCOM ELEMENT_FACTORY = VkTileMemoryBindInfoQCOM.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkTileMemoryBindInfoQCOM.SIZEOF);
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
        public VkTileMemoryBindInfoQCOM getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkTileMemoryBindInfoQCOM.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkTileMemoryBindInfoQCOM.npNext(address());
        }

        @NativeType("VkDeviceMemory")
        public long memory() {
            return VkTileMemoryBindInfoQCOM.nmemory(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkTileMemoryBindInfoQCOM.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(QCOMTileMemoryHeap.VK_STRUCTURE_TYPE_TILE_MEMORY_BIND_INFO_QCOM);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkTileMemoryBindInfoQCOM.npNext(address(), value);
            return this;
        }

        public Buffer memory(@NativeType("VkDeviceMemory") long value) {
            VkTileMemoryBindInfoQCOM.nmemory(address(), value);
            return this;
        }
    }
}
