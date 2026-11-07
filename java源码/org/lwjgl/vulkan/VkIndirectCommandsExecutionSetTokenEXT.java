package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkIndirectCommandsExecutionSetTokenEXT.class */
public class VkIndirectCommandsExecutionSetTokenEXT extends Struct<VkIndirectCommandsExecutionSetTokenEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int TYPE;
    public static final int SHADERSTAGES;

    static {
        Struct.Layout layout = __struct(__member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        TYPE = layout.offsetof(0);
        SHADERSTAGES = layout.offsetof(1);
    }

    protected VkIndirectCommandsExecutionSetTokenEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkIndirectCommandsExecutionSetTokenEXT create(long address, ByteBuffer container) {
        return new VkIndirectCommandsExecutionSetTokenEXT(address, container);
    }

    public VkIndirectCommandsExecutionSetTokenEXT(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("VkIndirectExecutionSetInfoTypeEXT")
    public int type() {
        return ntype(address());
    }

    @NativeType("VkShaderStageFlags")
    public int shaderStages() {
        return nshaderStages(address());
    }

    public VkIndirectCommandsExecutionSetTokenEXT type(@NativeType("VkIndirectExecutionSetInfoTypeEXT") int value) {
        ntype(address(), value);
        return this;
    }

    public VkIndirectCommandsExecutionSetTokenEXT shaderStages(@NativeType("VkShaderStageFlags") int value) {
        nshaderStages(address(), value);
        return this;
    }

    public VkIndirectCommandsExecutionSetTokenEXT set(int type, int shaderStages) {
        type(type);
        shaderStages(shaderStages);
        return this;
    }

    public VkIndirectCommandsExecutionSetTokenEXT set(VkIndirectCommandsExecutionSetTokenEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkIndirectCommandsExecutionSetTokenEXT malloc() {
        return new VkIndirectCommandsExecutionSetTokenEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkIndirectCommandsExecutionSetTokenEXT calloc() {
        return new VkIndirectCommandsExecutionSetTokenEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkIndirectCommandsExecutionSetTokenEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkIndirectCommandsExecutionSetTokenEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkIndirectCommandsExecutionSetTokenEXT create(long address) {
        return new VkIndirectCommandsExecutionSetTokenEXT(address, null);
    }

    public static VkIndirectCommandsExecutionSetTokenEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkIndirectCommandsExecutionSetTokenEXT(address, null);
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

    public static VkIndirectCommandsExecutionSetTokenEXT malloc(MemoryStack stack) {
        return new VkIndirectCommandsExecutionSetTokenEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkIndirectCommandsExecutionSetTokenEXT calloc(MemoryStack stack) {
        return new VkIndirectCommandsExecutionSetTokenEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static int ntype(long struct) {
        return MemoryUtil.memGetInt(struct + TYPE);
    }

    public static int nshaderStages(long struct) {
        return MemoryUtil.memGetInt(struct + SHADERSTAGES);
    }

    public static void ntype(long struct, int value) {
        MemoryUtil.memPutInt(struct + TYPE, value);
    }

    public static void nshaderStages(long struct, int value) {
        MemoryUtil.memPutInt(struct + SHADERSTAGES, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkIndirectCommandsExecutionSetTokenEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkIndirectCommandsExecutionSetTokenEXT, Buffer> implements NativeResource {
        private static final VkIndirectCommandsExecutionSetTokenEXT ELEMENT_FACTORY = VkIndirectCommandsExecutionSetTokenEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkIndirectCommandsExecutionSetTokenEXT.SIZEOF);
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
        public VkIndirectCommandsExecutionSetTokenEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkIndirectExecutionSetInfoTypeEXT")
        public int type() {
            return VkIndirectCommandsExecutionSetTokenEXT.ntype(address());
        }

        @NativeType("VkShaderStageFlags")
        public int shaderStages() {
            return VkIndirectCommandsExecutionSetTokenEXT.nshaderStages(address());
        }

        public Buffer type(@NativeType("VkIndirectExecutionSetInfoTypeEXT") int value) {
            VkIndirectCommandsExecutionSetTokenEXT.ntype(address(), value);
            return this;
        }

        public Buffer shaderStages(@NativeType("VkShaderStageFlags") int value) {
            VkIndirectCommandsExecutionSetTokenEXT.nshaderStages(address(), value);
            return this;
        }
    }
}
