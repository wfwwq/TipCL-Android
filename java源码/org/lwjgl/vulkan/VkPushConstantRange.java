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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPushConstantRange.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPushConstantRange.class */
public class VkPushConstantRange extends Struct<VkPushConstantRange> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STAGEFLAGS;
    public static final int OFFSET;
    public static final int SIZE;

    static {
        Struct.Layout layout = __struct(__member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STAGEFLAGS = layout.offsetof(0);
        OFFSET = layout.offsetof(1);
        SIZE = layout.offsetof(2);
    }

    protected VkPushConstantRange(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPushConstantRange create(long address, ByteBuffer container) {
        return new VkPushConstantRange(address, container);
    }

    public VkPushConstantRange(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("VkShaderStageFlags")
    public int stageFlags() {
        return nstageFlags(address());
    }

    @NativeType("uint32_t")
    public int offset() {
        return noffset(address());
    }

    @NativeType("uint32_t")
    public int size() {
        return nsize(address());
    }

    public VkPushConstantRange stageFlags(@NativeType("VkShaderStageFlags") int value) {
        nstageFlags(address(), value);
        return this;
    }

    public VkPushConstantRange offset(@NativeType("uint32_t") int value) {
        noffset(address(), value);
        return this;
    }

    public VkPushConstantRange size(@NativeType("uint32_t") int value) {
        nsize(address(), value);
        return this;
    }

    public VkPushConstantRange set(int stageFlags, int offset, int size) {
        stageFlags(stageFlags);
        offset(offset);
        size(size);
        return this;
    }

    public VkPushConstantRange set(VkPushConstantRange src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPushConstantRange malloc() {
        return new VkPushConstantRange(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPushConstantRange calloc() {
        return new VkPushConstantRange(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPushConstantRange create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPushConstantRange(MemoryUtil.memAddress(container), container);
    }

    public static VkPushConstantRange create(long address) {
        return new VkPushConstantRange(address, null);
    }

    public static VkPushConstantRange createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPushConstantRange(address, null);
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

    public static VkPushConstantRange malloc(MemoryStack stack) {
        return new VkPushConstantRange(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPushConstantRange calloc(MemoryStack stack) {
        return new VkPushConstantRange(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static int nstageFlags(long struct) {
        return MemoryUtil.memGetInt(struct + STAGEFLAGS);
    }

    public static int noffset(long struct) {
        return MemoryUtil.memGetInt(struct + OFFSET);
    }

    public static int nsize(long struct) {
        return MemoryUtil.memGetInt(struct + SIZE);
    }

    public static void nstageFlags(long struct, int value) {
        MemoryUtil.memPutInt(struct + STAGEFLAGS, value);
    }

    public static void noffset(long struct, int value) {
        MemoryUtil.memPutInt(struct + OFFSET, value);
    }

    public static void nsize(long struct, int value) {
        MemoryUtil.memPutInt(struct + SIZE, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPushConstantRange$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPushConstantRange$Buffer.class */
    public static class Buffer extends StructBuffer<VkPushConstantRange, Buffer> implements NativeResource {
        private static final VkPushConstantRange ELEMENT_FACTORY = VkPushConstantRange.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPushConstantRange.SIZEOF);
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
        public VkPushConstantRange getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkShaderStageFlags")
        public int stageFlags() {
            return VkPushConstantRange.nstageFlags(address());
        }

        @NativeType("uint32_t")
        public int offset() {
            return VkPushConstantRange.noffset(address());
        }

        @NativeType("uint32_t")
        public int size() {
            return VkPushConstantRange.nsize(address());
        }

        public Buffer stageFlags(@NativeType("VkShaderStageFlags") int value) {
            VkPushConstantRange.nstageFlags(address(), value);
            return this;
        }

        public Buffer offset(@NativeType("uint32_t") int value) {
            VkPushConstantRange.noffset(address(), value);
            return this;
        }

        public Buffer size(@NativeType("uint32_t") int value) {
            VkPushConstantRange.nsize(address(), value);
            return this;
        }
    }
}
