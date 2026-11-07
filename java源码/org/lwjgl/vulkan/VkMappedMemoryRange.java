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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkMappedMemoryRange.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkMappedMemoryRange.class */
public class VkMappedMemoryRange extends Struct<VkMappedMemoryRange> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int MEMORY;
    public static final int OFFSET;
    public static final int SIZE;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(8), __member(8), __member(8));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        MEMORY = layout.offsetof(2);
        OFFSET = layout.offsetof(3);
        SIZE = layout.offsetof(4);
    }

    protected VkMappedMemoryRange(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkMappedMemoryRange create(long address, ByteBuffer container) {
        return new VkMappedMemoryRange(address, container);
    }

    public VkMappedMemoryRange(ByteBuffer container) {
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

    @NativeType("VkDeviceSize")
    public long offset() {
        return noffset(address());
    }

    @NativeType("VkDeviceSize")
    public long size() {
        return nsize(address());
    }

    public VkMappedMemoryRange sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkMappedMemoryRange sType$Default() {
        return sType(6);
    }

    public VkMappedMemoryRange pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkMappedMemoryRange memory(@NativeType("VkDeviceMemory") long value) {
        nmemory(address(), value);
        return this;
    }

    public VkMappedMemoryRange offset(@NativeType("VkDeviceSize") long value) {
        noffset(address(), value);
        return this;
    }

    public VkMappedMemoryRange size(@NativeType("VkDeviceSize") long value) {
        nsize(address(), value);
        return this;
    }

    public VkMappedMemoryRange set(int sType, long pNext, long memory, long offset, long size) {
        sType(sType);
        pNext(pNext);
        memory(memory);
        offset(offset);
        size(size);
        return this;
    }

    public VkMappedMemoryRange set(VkMappedMemoryRange src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkMappedMemoryRange malloc() {
        return new VkMappedMemoryRange(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkMappedMemoryRange calloc() {
        return new VkMappedMemoryRange(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkMappedMemoryRange create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkMappedMemoryRange(MemoryUtil.memAddress(container), container);
    }

    public static VkMappedMemoryRange create(long address) {
        return new VkMappedMemoryRange(address, null);
    }

    public static VkMappedMemoryRange createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkMappedMemoryRange(address, null);
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

    public static VkMappedMemoryRange malloc(MemoryStack stack) {
        return new VkMappedMemoryRange(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkMappedMemoryRange calloc(MemoryStack stack) {
        return new VkMappedMemoryRange(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static void nmemory(long struct, long value) {
        MemoryUtil.memPutLong(struct + MEMORY, value);
    }

    public static void noffset(long struct, long value) {
        MemoryUtil.memPutLong(struct + OFFSET, value);
    }

    public static void nsize(long struct, long value) {
        MemoryUtil.memPutLong(struct + SIZE, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkMappedMemoryRange$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkMappedMemoryRange$Buffer.class */
    public static class Buffer extends StructBuffer<VkMappedMemoryRange, Buffer> implements NativeResource {
        private static final VkMappedMemoryRange ELEMENT_FACTORY = VkMappedMemoryRange.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkMappedMemoryRange.SIZEOF);
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
        public VkMappedMemoryRange getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkMappedMemoryRange.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkMappedMemoryRange.npNext(address());
        }

        @NativeType("VkDeviceMemory")
        public long memory() {
            return VkMappedMemoryRange.nmemory(address());
        }

        @NativeType("VkDeviceSize")
        public long offset() {
            return VkMappedMemoryRange.noffset(address());
        }

        @NativeType("VkDeviceSize")
        public long size() {
            return VkMappedMemoryRange.nsize(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkMappedMemoryRange.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(6);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkMappedMemoryRange.npNext(address(), value);
            return this;
        }

        public Buffer memory(@NativeType("VkDeviceMemory") long value) {
            VkMappedMemoryRange.nmemory(address(), value);
            return this;
        }

        public Buffer offset(@NativeType("VkDeviceSize") long value) {
            VkMappedMemoryRange.noffset(address(), value);
            return this;
        }

        public Buffer size(@NativeType("VkDeviceSize") long value) {
            VkMappedMemoryRange.nsize(address(), value);
            return this;
        }
    }
}
