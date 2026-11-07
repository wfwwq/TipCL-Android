package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkIndirectCommandsVertexBufferTokenEXT.class */
public class VkIndirectCommandsVertexBufferTokenEXT extends Struct<VkIndirectCommandsVertexBufferTokenEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int VERTEXBINDINGUNIT;

    static {
        Struct.Layout layout = __struct(__member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        VERTEXBINDINGUNIT = layout.offsetof(0);
    }

    protected VkIndirectCommandsVertexBufferTokenEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkIndirectCommandsVertexBufferTokenEXT create(long address, ByteBuffer container) {
        return new VkIndirectCommandsVertexBufferTokenEXT(address, container);
    }

    public VkIndirectCommandsVertexBufferTokenEXT(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("uint32_t")
    public int vertexBindingUnit() {
        return nvertexBindingUnit(address());
    }

    public VkIndirectCommandsVertexBufferTokenEXT vertexBindingUnit(@NativeType("uint32_t") int value) {
        nvertexBindingUnit(address(), value);
        return this;
    }

    public VkIndirectCommandsVertexBufferTokenEXT set(VkIndirectCommandsVertexBufferTokenEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkIndirectCommandsVertexBufferTokenEXT malloc() {
        return new VkIndirectCommandsVertexBufferTokenEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkIndirectCommandsVertexBufferTokenEXT calloc() {
        return new VkIndirectCommandsVertexBufferTokenEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkIndirectCommandsVertexBufferTokenEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkIndirectCommandsVertexBufferTokenEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkIndirectCommandsVertexBufferTokenEXT create(long address) {
        return new VkIndirectCommandsVertexBufferTokenEXT(address, null);
    }

    public static VkIndirectCommandsVertexBufferTokenEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkIndirectCommandsVertexBufferTokenEXT(address, null);
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

    public static VkIndirectCommandsVertexBufferTokenEXT malloc(MemoryStack stack) {
        return new VkIndirectCommandsVertexBufferTokenEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkIndirectCommandsVertexBufferTokenEXT calloc(MemoryStack stack) {
        return new VkIndirectCommandsVertexBufferTokenEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static int nvertexBindingUnit(long struct) {
        return MemoryUtil.memGetInt(struct + VERTEXBINDINGUNIT);
    }

    public static void nvertexBindingUnit(long struct, int value) {
        MemoryUtil.memPutInt(struct + VERTEXBINDINGUNIT, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkIndirectCommandsVertexBufferTokenEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkIndirectCommandsVertexBufferTokenEXT, Buffer> implements NativeResource {
        private static final VkIndirectCommandsVertexBufferTokenEXT ELEMENT_FACTORY = VkIndirectCommandsVertexBufferTokenEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkIndirectCommandsVertexBufferTokenEXT.SIZEOF);
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
        public VkIndirectCommandsVertexBufferTokenEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("uint32_t")
        public int vertexBindingUnit() {
            return VkIndirectCommandsVertexBufferTokenEXT.nvertexBindingUnit(address());
        }

        public Buffer vertexBindingUnit(@NativeType("uint32_t") int value) {
            VkIndirectCommandsVertexBufferTokenEXT.nvertexBindingUnit(address(), value);
            return this;
        }
    }
}
