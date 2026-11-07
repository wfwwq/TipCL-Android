package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkTileMemoryRequirementsQCOM.class */
public class VkTileMemoryRequirementsQCOM extends Struct<VkTileMemoryRequirementsQCOM> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int SIZE;
    public static final int ALIGNMENT;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(8), __member(8));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SIZE = layout.offsetof(2);
        ALIGNMENT = layout.offsetof(3);
    }

    protected VkTileMemoryRequirementsQCOM(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkTileMemoryRequirementsQCOM create(long address, ByteBuffer container) {
        return new VkTileMemoryRequirementsQCOM(address, container);
    }

    public VkTileMemoryRequirementsQCOM(ByteBuffer container) {
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

    @NativeType("void *")
    public long pNext() {
        return npNext(address());
    }

    @NativeType("VkDeviceSize")
    public long size() {
        return nsize(address());
    }

    @NativeType("VkDeviceSize")
    public long alignment() {
        return nalignment(address());
    }

    public VkTileMemoryRequirementsQCOM sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkTileMemoryRequirementsQCOM sType$Default() {
        return sType(QCOMTileMemoryHeap.VK_STRUCTURE_TYPE_TILE_MEMORY_REQUIREMENTS_QCOM);
    }

    public VkTileMemoryRequirementsQCOM pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkTileMemoryRequirementsQCOM size(@NativeType("VkDeviceSize") long value) {
        nsize(address(), value);
        return this;
    }

    public VkTileMemoryRequirementsQCOM alignment(@NativeType("VkDeviceSize") long value) {
        nalignment(address(), value);
        return this;
    }

    public VkTileMemoryRequirementsQCOM set(int sType, long pNext, long size, long alignment) {
        sType(sType);
        pNext(pNext);
        size(size);
        alignment(alignment);
        return this;
    }

    public VkTileMemoryRequirementsQCOM set(VkTileMemoryRequirementsQCOM src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkTileMemoryRequirementsQCOM malloc() {
        return new VkTileMemoryRequirementsQCOM(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkTileMemoryRequirementsQCOM calloc() {
        return new VkTileMemoryRequirementsQCOM(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkTileMemoryRequirementsQCOM create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkTileMemoryRequirementsQCOM(MemoryUtil.memAddress(container), container);
    }

    public static VkTileMemoryRequirementsQCOM create(long address) {
        return new VkTileMemoryRequirementsQCOM(address, null);
    }

    public static VkTileMemoryRequirementsQCOM createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkTileMemoryRequirementsQCOM(address, null);
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

    public static VkTileMemoryRequirementsQCOM malloc(MemoryStack stack) {
        return new VkTileMemoryRequirementsQCOM(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkTileMemoryRequirementsQCOM calloc(MemoryStack stack) {
        return new VkTileMemoryRequirementsQCOM(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static long nalignment(long struct) {
        return MemoryUtil.memGetLong(struct + ALIGNMENT);
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

    public static void nalignment(long struct, long value) {
        MemoryUtil.memPutLong(struct + ALIGNMENT, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkTileMemoryRequirementsQCOM$Buffer.class */
    public static class Buffer extends StructBuffer<VkTileMemoryRequirementsQCOM, Buffer> implements NativeResource {
        private static final VkTileMemoryRequirementsQCOM ELEMENT_FACTORY = VkTileMemoryRequirementsQCOM.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkTileMemoryRequirementsQCOM.SIZEOF);
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
        public VkTileMemoryRequirementsQCOM getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkTileMemoryRequirementsQCOM.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkTileMemoryRequirementsQCOM.npNext(address());
        }

        @NativeType("VkDeviceSize")
        public long size() {
            return VkTileMemoryRequirementsQCOM.nsize(address());
        }

        @NativeType("VkDeviceSize")
        public long alignment() {
            return VkTileMemoryRequirementsQCOM.nalignment(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkTileMemoryRequirementsQCOM.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(QCOMTileMemoryHeap.VK_STRUCTURE_TYPE_TILE_MEMORY_REQUIREMENTS_QCOM);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkTileMemoryRequirementsQCOM.npNext(address(), value);
            return this;
        }

        public Buffer size(@NativeType("VkDeviceSize") long value) {
            VkTileMemoryRequirementsQCOM.nsize(address(), value);
            return this;
        }

        public Buffer alignment(@NativeType("VkDeviceSize") long value) {
            VkTileMemoryRequirementsQCOM.nalignment(address(), value);
            return this;
        }
    }
}
