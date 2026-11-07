package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkIndirectCommandsTokenDataEXT.class */
public class VkIndirectCommandsTokenDataEXT extends Struct<VkIndirectCommandsTokenDataEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int PPUSHCONSTANT;
    public static final int PVERTEXBUFFER;
    public static final int PINDEXBUFFER;
    public static final int PEXECUTIONSET;

    static {
        Struct.Layout layout = __union(__member(POINTER_SIZE), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        PPUSHCONSTANT = layout.offsetof(0);
        PVERTEXBUFFER = layout.offsetof(1);
        PINDEXBUFFER = layout.offsetof(2);
        PEXECUTIONSET = layout.offsetof(3);
    }

    protected VkIndirectCommandsTokenDataEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkIndirectCommandsTokenDataEXT create(long address, ByteBuffer container) {
        return new VkIndirectCommandsTokenDataEXT(address, container);
    }

    public VkIndirectCommandsTokenDataEXT(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("VkIndirectCommandsPushConstantTokenEXT const *")
    public VkIndirectCommandsPushConstantTokenEXT pPushConstant() {
        return npPushConstant(address());
    }

    @NativeType("VkIndirectCommandsVertexBufferTokenEXT const *")
    public VkIndirectCommandsVertexBufferTokenEXT pVertexBuffer() {
        return npVertexBuffer(address());
    }

    @NativeType("VkIndirectCommandsIndexBufferTokenEXT const *")
    public VkIndirectCommandsIndexBufferTokenEXT pIndexBuffer() {
        return npIndexBuffer(address());
    }

    @NativeType("VkIndirectCommandsExecutionSetTokenEXT const *")
    public VkIndirectCommandsExecutionSetTokenEXT pExecutionSet() {
        return npExecutionSet(address());
    }

    public VkIndirectCommandsTokenDataEXT pPushConstant(@NativeType("VkIndirectCommandsPushConstantTokenEXT const *") VkIndirectCommandsPushConstantTokenEXT value) {
        npPushConstant(address(), value);
        return this;
    }

    public VkIndirectCommandsTokenDataEXT pVertexBuffer(@NativeType("VkIndirectCommandsVertexBufferTokenEXT const *") VkIndirectCommandsVertexBufferTokenEXT value) {
        npVertexBuffer(address(), value);
        return this;
    }

    public VkIndirectCommandsTokenDataEXT pIndexBuffer(@NativeType("VkIndirectCommandsIndexBufferTokenEXT const *") VkIndirectCommandsIndexBufferTokenEXT value) {
        npIndexBuffer(address(), value);
        return this;
    }

    public VkIndirectCommandsTokenDataEXT pExecutionSet(@NativeType("VkIndirectCommandsExecutionSetTokenEXT const *") VkIndirectCommandsExecutionSetTokenEXT value) {
        npExecutionSet(address(), value);
        return this;
    }

    public VkIndirectCommandsTokenDataEXT set(VkIndirectCommandsTokenDataEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkIndirectCommandsTokenDataEXT malloc() {
        return new VkIndirectCommandsTokenDataEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkIndirectCommandsTokenDataEXT calloc() {
        return new VkIndirectCommandsTokenDataEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkIndirectCommandsTokenDataEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkIndirectCommandsTokenDataEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkIndirectCommandsTokenDataEXT create(long address) {
        return new VkIndirectCommandsTokenDataEXT(address, null);
    }

    public static VkIndirectCommandsTokenDataEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkIndirectCommandsTokenDataEXT(address, null);
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

    public static VkIndirectCommandsTokenDataEXT malloc(MemoryStack stack) {
        return new VkIndirectCommandsTokenDataEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkIndirectCommandsTokenDataEXT calloc(MemoryStack stack) {
        return new VkIndirectCommandsTokenDataEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static VkIndirectCommandsPushConstantTokenEXT npPushConstant(long struct) {
        return VkIndirectCommandsPushConstantTokenEXT.create(MemoryUtil.memGetAddress(struct + PPUSHCONSTANT));
    }

    public static VkIndirectCommandsVertexBufferTokenEXT npVertexBuffer(long struct) {
        return VkIndirectCommandsVertexBufferTokenEXT.create(MemoryUtil.memGetAddress(struct + PVERTEXBUFFER));
    }

    public static VkIndirectCommandsIndexBufferTokenEXT npIndexBuffer(long struct) {
        return VkIndirectCommandsIndexBufferTokenEXT.create(MemoryUtil.memGetAddress(struct + PINDEXBUFFER));
    }

    public static VkIndirectCommandsExecutionSetTokenEXT npExecutionSet(long struct) {
        return VkIndirectCommandsExecutionSetTokenEXT.create(MemoryUtil.memGetAddress(struct + PEXECUTIONSET));
    }

    public static void npPushConstant(long struct, VkIndirectCommandsPushConstantTokenEXT value) {
        MemoryUtil.memPutAddress(struct + PPUSHCONSTANT, value.address());
    }

    public static void npVertexBuffer(long struct, VkIndirectCommandsVertexBufferTokenEXT value) {
        MemoryUtil.memPutAddress(struct + PVERTEXBUFFER, value.address());
    }

    public static void npIndexBuffer(long struct, VkIndirectCommandsIndexBufferTokenEXT value) {
        MemoryUtil.memPutAddress(struct + PINDEXBUFFER, value.address());
    }

    public static void npExecutionSet(long struct, VkIndirectCommandsExecutionSetTokenEXT value) {
        MemoryUtil.memPutAddress(struct + PEXECUTIONSET, value.address());
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkIndirectCommandsTokenDataEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkIndirectCommandsTokenDataEXT, Buffer> implements NativeResource {
        private static final VkIndirectCommandsTokenDataEXT ELEMENT_FACTORY = VkIndirectCommandsTokenDataEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkIndirectCommandsTokenDataEXT.SIZEOF);
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
        public VkIndirectCommandsTokenDataEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkIndirectCommandsPushConstantTokenEXT const *")
        public VkIndirectCommandsPushConstantTokenEXT pPushConstant() {
            return VkIndirectCommandsTokenDataEXT.npPushConstant(address());
        }

        @NativeType("VkIndirectCommandsVertexBufferTokenEXT const *")
        public VkIndirectCommandsVertexBufferTokenEXT pVertexBuffer() {
            return VkIndirectCommandsTokenDataEXT.npVertexBuffer(address());
        }

        @NativeType("VkIndirectCommandsIndexBufferTokenEXT const *")
        public VkIndirectCommandsIndexBufferTokenEXT pIndexBuffer() {
            return VkIndirectCommandsTokenDataEXT.npIndexBuffer(address());
        }

        @NativeType("VkIndirectCommandsExecutionSetTokenEXT const *")
        public VkIndirectCommandsExecutionSetTokenEXT pExecutionSet() {
            return VkIndirectCommandsTokenDataEXT.npExecutionSet(address());
        }

        public Buffer pPushConstant(@NativeType("VkIndirectCommandsPushConstantTokenEXT const *") VkIndirectCommandsPushConstantTokenEXT value) {
            VkIndirectCommandsTokenDataEXT.npPushConstant(address(), value);
            return this;
        }

        public Buffer pVertexBuffer(@NativeType("VkIndirectCommandsVertexBufferTokenEXT const *") VkIndirectCommandsVertexBufferTokenEXT value) {
            VkIndirectCommandsTokenDataEXT.npVertexBuffer(address(), value);
            return this;
        }

        public Buffer pIndexBuffer(@NativeType("VkIndirectCommandsIndexBufferTokenEXT const *") VkIndirectCommandsIndexBufferTokenEXT value) {
            VkIndirectCommandsTokenDataEXT.npIndexBuffer(address(), value);
            return this;
        }

        public Buffer pExecutionSet(@NativeType("VkIndirectCommandsExecutionSetTokenEXT const *") VkIndirectCommandsExecutionSetTokenEXT value) {
            VkIndirectCommandsTokenDataEXT.npExecutionSet(address(), value);
            return this;
        }
    }
}
