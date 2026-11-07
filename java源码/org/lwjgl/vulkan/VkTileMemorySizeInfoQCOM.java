package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkTileMemorySizeInfoQCOM.class */
public class VkTileMemorySizeInfoQCOM extends Struct<VkTileMemorySizeInfoQCOM> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int SIZE;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(8));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SIZE = layout.offsetof(2);
    }

    protected VkTileMemorySizeInfoQCOM(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkTileMemorySizeInfoQCOM create(long address, ByteBuffer container) {
        return new VkTileMemorySizeInfoQCOM(address, container);
    }

    public VkTileMemorySizeInfoQCOM(ByteBuffer container) {
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
    public long size() {
        return nsize(address());
    }

    public VkTileMemorySizeInfoQCOM sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkTileMemorySizeInfoQCOM sType$Default() {
        return sType(QCOMTileMemoryHeap.VK_STRUCTURE_TYPE_TILE_MEMORY_SIZE_INFO_QCOM);
    }

    public VkTileMemorySizeInfoQCOM pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkTileMemorySizeInfoQCOM size(@NativeType("VkDeviceSize") long value) {
        nsize(address(), value);
        return this;
    }

    public VkTileMemorySizeInfoQCOM set(int sType, long pNext, long size) {
        sType(sType);
        pNext(pNext);
        size(size);
        return this;
    }

    public VkTileMemorySizeInfoQCOM set(VkTileMemorySizeInfoQCOM src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkTileMemorySizeInfoQCOM malloc() {
        return new VkTileMemorySizeInfoQCOM(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkTileMemorySizeInfoQCOM calloc() {
        return new VkTileMemorySizeInfoQCOM(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkTileMemorySizeInfoQCOM create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkTileMemorySizeInfoQCOM(MemoryUtil.memAddress(container), container);
    }

    public static VkTileMemorySizeInfoQCOM create(long address) {
        return new VkTileMemorySizeInfoQCOM(address, null);
    }

    public static VkTileMemorySizeInfoQCOM createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkTileMemorySizeInfoQCOM(address, null);
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

    public static VkTileMemorySizeInfoQCOM malloc(MemoryStack stack) {
        return new VkTileMemorySizeInfoQCOM(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkTileMemorySizeInfoQCOM calloc(MemoryStack stack) {
        return new VkTileMemorySizeInfoQCOM(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static long nsize(long struct) {
        return MemoryUtil.memGetLong(struct + SIZE);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nsize(long struct, long value) {
        MemoryUtil.memPutLong(struct + SIZE, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkTileMemorySizeInfoQCOM$Buffer.class */
    public static class Buffer extends StructBuffer<VkTileMemorySizeInfoQCOM, Buffer> implements NativeResource {
        private static final VkTileMemorySizeInfoQCOM ELEMENT_FACTORY = VkTileMemorySizeInfoQCOM.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkTileMemorySizeInfoQCOM.SIZEOF);
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
        public VkTileMemorySizeInfoQCOM getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkTileMemorySizeInfoQCOM.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkTileMemorySizeInfoQCOM.npNext(address());
        }

        @NativeType("VkDeviceSize")
        public long size() {
            return VkTileMemorySizeInfoQCOM.nsize(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkTileMemorySizeInfoQCOM.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(QCOMTileMemoryHeap.VK_STRUCTURE_TYPE_TILE_MEMORY_SIZE_INFO_QCOM);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkTileMemorySizeInfoQCOM.npNext(address(), value);
            return this;
        }

        public Buffer size(@NativeType("VkDeviceSize") long value) {
            VkTileMemorySizeInfoQCOM.nsize(address(), value);
            return this;
        }
    }
}
