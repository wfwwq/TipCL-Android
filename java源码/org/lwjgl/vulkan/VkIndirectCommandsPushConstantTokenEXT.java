package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import java.util.function.Consumer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkIndirectCommandsPushConstantTokenEXT.class */
public class VkIndirectCommandsPushConstantTokenEXT extends Struct<VkIndirectCommandsPushConstantTokenEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int UPDATERANGE;

    static {
        Struct.Layout layout = __struct(__member(VkPushConstantRange.SIZEOF, VkPushConstantRange.ALIGNOF));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        UPDATERANGE = layout.offsetof(0);
    }

    protected VkIndirectCommandsPushConstantTokenEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkIndirectCommandsPushConstantTokenEXT create(long address, ByteBuffer container) {
        return new VkIndirectCommandsPushConstantTokenEXT(address, container);
    }

    public VkIndirectCommandsPushConstantTokenEXT(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    public VkPushConstantRange updateRange() {
        return nupdateRange(address());
    }

    public VkIndirectCommandsPushConstantTokenEXT updateRange(VkPushConstantRange value) {
        nupdateRange(address(), value);
        return this;
    }

    public VkIndirectCommandsPushConstantTokenEXT updateRange(Consumer<VkPushConstantRange> consumer) {
        consumer.accept(updateRange());
        return this;
    }

    public VkIndirectCommandsPushConstantTokenEXT set(VkIndirectCommandsPushConstantTokenEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkIndirectCommandsPushConstantTokenEXT malloc() {
        return new VkIndirectCommandsPushConstantTokenEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkIndirectCommandsPushConstantTokenEXT calloc() {
        return new VkIndirectCommandsPushConstantTokenEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkIndirectCommandsPushConstantTokenEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkIndirectCommandsPushConstantTokenEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkIndirectCommandsPushConstantTokenEXT create(long address) {
        return new VkIndirectCommandsPushConstantTokenEXT(address, null);
    }

    public static VkIndirectCommandsPushConstantTokenEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkIndirectCommandsPushConstantTokenEXT(address, null);
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

    public static VkIndirectCommandsPushConstantTokenEXT malloc(MemoryStack stack) {
        return new VkIndirectCommandsPushConstantTokenEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkIndirectCommandsPushConstantTokenEXT calloc(MemoryStack stack) {
        return new VkIndirectCommandsPushConstantTokenEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static VkPushConstantRange nupdateRange(long struct) {
        return VkPushConstantRange.create(struct + UPDATERANGE);
    }

    public static void nupdateRange(long struct, VkPushConstantRange value) {
        MemoryUtil.memCopy(value.address(), struct + UPDATERANGE, VkPushConstantRange.SIZEOF);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkIndirectCommandsPushConstantTokenEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkIndirectCommandsPushConstantTokenEXT, Buffer> implements NativeResource {
        private static final VkIndirectCommandsPushConstantTokenEXT ELEMENT_FACTORY = VkIndirectCommandsPushConstantTokenEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkIndirectCommandsPushConstantTokenEXT.SIZEOF);
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
        public VkIndirectCommandsPushConstantTokenEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        public VkPushConstantRange updateRange() {
            return VkIndirectCommandsPushConstantTokenEXT.nupdateRange(address());
        }

        public Buffer updateRange(VkPushConstantRange value) {
            VkIndirectCommandsPushConstantTokenEXT.nupdateRange(address(), value);
            return this;
        }

        public Buffer updateRange(Consumer<VkPushConstantRange> consumer) {
            consumer.accept(updateRange());
            return this;
        }
    }
}
