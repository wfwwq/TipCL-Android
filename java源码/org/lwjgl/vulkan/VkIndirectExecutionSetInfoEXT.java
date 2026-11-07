package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkIndirectExecutionSetInfoEXT.class */
public class VkIndirectExecutionSetInfoEXT extends Struct<VkIndirectExecutionSetInfoEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int PPIPELINEINFO;
    public static final int PSHADERINFO;

    static {
        Struct.Layout layout = __union(__member(POINTER_SIZE), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        PPIPELINEINFO = layout.offsetof(0);
        PSHADERINFO = layout.offsetof(1);
    }

    protected VkIndirectExecutionSetInfoEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkIndirectExecutionSetInfoEXT create(long address, ByteBuffer container) {
        return new VkIndirectExecutionSetInfoEXT(address, container);
    }

    public VkIndirectExecutionSetInfoEXT(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("VkIndirectExecutionSetPipelineInfoEXT const *")
    public VkIndirectExecutionSetPipelineInfoEXT pPipelineInfo() {
        return npPipelineInfo(address());
    }

    @NativeType("VkIndirectExecutionSetShaderInfoEXT const *")
    public VkIndirectExecutionSetShaderInfoEXT pShaderInfo() {
        return npShaderInfo(address());
    }

    public VkIndirectExecutionSetInfoEXT pPipelineInfo(@NativeType("VkIndirectExecutionSetPipelineInfoEXT const *") VkIndirectExecutionSetPipelineInfoEXT value) {
        npPipelineInfo(address(), value);
        return this;
    }

    public VkIndirectExecutionSetInfoEXT pShaderInfo(@NativeType("VkIndirectExecutionSetShaderInfoEXT const *") VkIndirectExecutionSetShaderInfoEXT value) {
        npShaderInfo(address(), value);
        return this;
    }

    public VkIndirectExecutionSetInfoEXT set(VkIndirectExecutionSetInfoEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkIndirectExecutionSetInfoEXT malloc() {
        return new VkIndirectExecutionSetInfoEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkIndirectExecutionSetInfoEXT calloc() {
        return new VkIndirectExecutionSetInfoEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkIndirectExecutionSetInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkIndirectExecutionSetInfoEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkIndirectExecutionSetInfoEXT create(long address) {
        return new VkIndirectExecutionSetInfoEXT(address, null);
    }

    public static VkIndirectExecutionSetInfoEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkIndirectExecutionSetInfoEXT(address, null);
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

    public static VkIndirectExecutionSetInfoEXT malloc(MemoryStack stack) {
        return new VkIndirectExecutionSetInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkIndirectExecutionSetInfoEXT calloc(MemoryStack stack) {
        return new VkIndirectExecutionSetInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static VkIndirectExecutionSetPipelineInfoEXT npPipelineInfo(long struct) {
        return VkIndirectExecutionSetPipelineInfoEXT.create(MemoryUtil.memGetAddress(struct + PPIPELINEINFO));
    }

    public static VkIndirectExecutionSetShaderInfoEXT npShaderInfo(long struct) {
        return VkIndirectExecutionSetShaderInfoEXT.create(MemoryUtil.memGetAddress(struct + PSHADERINFO));
    }

    public static void npPipelineInfo(long struct, VkIndirectExecutionSetPipelineInfoEXT value) {
        MemoryUtil.memPutAddress(struct + PPIPELINEINFO, value.address());
    }

    public static void npShaderInfo(long struct, VkIndirectExecutionSetShaderInfoEXT value) {
        MemoryUtil.memPutAddress(struct + PSHADERINFO, value.address());
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkIndirectExecutionSetInfoEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkIndirectExecutionSetInfoEXT, Buffer> implements NativeResource {
        private static final VkIndirectExecutionSetInfoEXT ELEMENT_FACTORY = VkIndirectExecutionSetInfoEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkIndirectExecutionSetInfoEXT.SIZEOF);
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
        public VkIndirectExecutionSetInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkIndirectExecutionSetPipelineInfoEXT const *")
        public VkIndirectExecutionSetPipelineInfoEXT pPipelineInfo() {
            return VkIndirectExecutionSetInfoEXT.npPipelineInfo(address());
        }

        @NativeType("VkIndirectExecutionSetShaderInfoEXT const *")
        public VkIndirectExecutionSetShaderInfoEXT pShaderInfo() {
            return VkIndirectExecutionSetInfoEXT.npShaderInfo(address());
        }

        public Buffer pPipelineInfo(@NativeType("VkIndirectExecutionSetPipelineInfoEXT const *") VkIndirectExecutionSetPipelineInfoEXT value) {
            VkIndirectExecutionSetInfoEXT.npPipelineInfo(address(), value);
            return this;
        }

        public Buffer pShaderInfo(@NativeType("VkIndirectExecutionSetShaderInfoEXT const *") VkIndirectExecutionSetShaderInfoEXT value) {
            VkIndirectExecutionSetInfoEXT.npShaderInfo(address(), value);
            return this;
        }
    }
}
