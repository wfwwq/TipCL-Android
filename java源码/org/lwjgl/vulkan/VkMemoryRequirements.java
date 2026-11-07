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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkMemoryRequirements.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkMemoryRequirements.class */
public class VkMemoryRequirements extends Struct<VkMemoryRequirements> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int SIZE;
    public static final int ALIGNMENT;
    public static final int MEMORYTYPEBITS;

    static {
        Struct.Layout layout = __struct(__member(8), __member(8), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        SIZE = layout.offsetof(0);
        ALIGNMENT = layout.offsetof(1);
        MEMORYTYPEBITS = layout.offsetof(2);
    }

    protected VkMemoryRequirements(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkMemoryRequirements create(long address, ByteBuffer container) {
        return new VkMemoryRequirements(address, container);
    }

    public VkMemoryRequirements(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("VkDeviceSize")
    public long size() {
        return nsize(address());
    }

    @NativeType("VkDeviceSize")
    public long alignment() {
        return nalignment(address());
    }

    @NativeType("uint32_t")
    public int memoryTypeBits() {
        return nmemoryTypeBits(address());
    }

    public VkMemoryRequirements size(@NativeType("VkDeviceSize") long value) {
        nsize(address(), value);
        return this;
    }

    public VkMemoryRequirements alignment(@NativeType("VkDeviceSize") long value) {
        nalignment(address(), value);
        return this;
    }

    public VkMemoryRequirements memoryTypeBits(@NativeType("uint32_t") int value) {
        nmemoryTypeBits(address(), value);
        return this;
    }

    public VkMemoryRequirements set(long size, long alignment, int memoryTypeBits) {
        size(size);
        alignment(alignment);
        memoryTypeBits(memoryTypeBits);
        return this;
    }

    public VkMemoryRequirements set(VkMemoryRequirements src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkMemoryRequirements malloc() {
        return new VkMemoryRequirements(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkMemoryRequirements calloc() {
        return new VkMemoryRequirements(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkMemoryRequirements create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkMemoryRequirements(MemoryUtil.memAddress(container), container);
    }

    public static VkMemoryRequirements create(long address) {
        return new VkMemoryRequirements(address, null);
    }

    public static VkMemoryRequirements createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkMemoryRequirements(address, null);
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

    public static VkMemoryRequirements malloc(MemoryStack stack) {
        return new VkMemoryRequirements(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkMemoryRequirements calloc(MemoryStack stack) {
        return new VkMemoryRequirements(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static long nsize(long struct) {
        return MemoryUtil.memGetLong(struct + SIZE);
    }

    public static long nalignment(long struct) {
        return MemoryUtil.memGetLong(struct + ALIGNMENT);
    }

    public static int nmemoryTypeBits(long struct) {
        return MemoryUtil.memGetInt(struct + MEMORYTYPEBITS);
    }

    public static void nsize(long struct, long value) {
        MemoryUtil.memPutLong(struct + SIZE, value);
    }

    public static void nalignment(long struct, long value) {
        MemoryUtil.memPutLong(struct + ALIGNMENT, value);
    }

    public static void nmemoryTypeBits(long struct, int value) {
        MemoryUtil.memPutInt(struct + MEMORYTYPEBITS, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkMemoryRequirements$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkMemoryRequirements$Buffer.class */
    public static class Buffer extends StructBuffer<VkMemoryRequirements, Buffer> implements NativeResource {
        private static final VkMemoryRequirements ELEMENT_FACTORY = VkMemoryRequirements.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkMemoryRequirements.SIZEOF);
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
        public VkMemoryRequirements getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkDeviceSize")
        public long size() {
            return VkMemoryRequirements.nsize(address());
        }

        @NativeType("VkDeviceSize")
        public long alignment() {
            return VkMemoryRequirements.nalignment(address());
        }

        @NativeType("uint32_t")
        public int memoryTypeBits() {
            return VkMemoryRequirements.nmemoryTypeBits(address());
        }

        public Buffer size(@NativeType("VkDeviceSize") long value) {
            VkMemoryRequirements.nsize(address(), value);
            return this;
        }

        public Buffer alignment(@NativeType("VkDeviceSize") long value) {
            VkMemoryRequirements.nalignment(address(), value);
            return this;
        }

        public Buffer memoryTypeBits(@NativeType("uint32_t") int value) {
            VkMemoryRequirements.nmemoryTypeBits(address(), value);
            return this;
        }
    }
}
