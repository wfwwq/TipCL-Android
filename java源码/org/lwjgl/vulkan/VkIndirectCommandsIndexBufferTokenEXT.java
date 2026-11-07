package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkIndirectCommandsIndexBufferTokenEXT.class */
public class VkIndirectCommandsIndexBufferTokenEXT extends Struct<VkIndirectCommandsIndexBufferTokenEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int MODE;

    static {
        Struct.Layout layout = __struct(__member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        MODE = layout.offsetof(0);
    }

    protected VkIndirectCommandsIndexBufferTokenEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkIndirectCommandsIndexBufferTokenEXT create(long address, ByteBuffer container) {
        return new VkIndirectCommandsIndexBufferTokenEXT(address, container);
    }

    public VkIndirectCommandsIndexBufferTokenEXT(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("VkIndirectCommandsInputModeFlagBitsEXT")
    public int mode() {
        return nmode(address());
    }

    public VkIndirectCommandsIndexBufferTokenEXT mode(@NativeType("VkIndirectCommandsInputModeFlagBitsEXT") int value) {
        nmode(address(), value);
        return this;
    }

    public VkIndirectCommandsIndexBufferTokenEXT set(VkIndirectCommandsIndexBufferTokenEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkIndirectCommandsIndexBufferTokenEXT malloc() {
        return new VkIndirectCommandsIndexBufferTokenEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkIndirectCommandsIndexBufferTokenEXT calloc() {
        return new VkIndirectCommandsIndexBufferTokenEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkIndirectCommandsIndexBufferTokenEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkIndirectCommandsIndexBufferTokenEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkIndirectCommandsIndexBufferTokenEXT create(long address) {
        return new VkIndirectCommandsIndexBufferTokenEXT(address, null);
    }

    public static VkIndirectCommandsIndexBufferTokenEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkIndirectCommandsIndexBufferTokenEXT(address, null);
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

    public static VkIndirectCommandsIndexBufferTokenEXT malloc(MemoryStack stack) {
        return new VkIndirectCommandsIndexBufferTokenEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkIndirectCommandsIndexBufferTokenEXT calloc(MemoryStack stack) {
        return new VkIndirectCommandsIndexBufferTokenEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static int nmode(long struct) {
        return MemoryUtil.memGetInt(struct + MODE);
    }

    public static void nmode(long struct, int value) {
        MemoryUtil.memPutInt(struct + MODE, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkIndirectCommandsIndexBufferTokenEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkIndirectCommandsIndexBufferTokenEXT, Buffer> implements NativeResource {
        private static final VkIndirectCommandsIndexBufferTokenEXT ELEMENT_FACTORY = VkIndirectCommandsIndexBufferTokenEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkIndirectCommandsIndexBufferTokenEXT.SIZEOF);
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
        public VkIndirectCommandsIndexBufferTokenEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkIndirectCommandsInputModeFlagBitsEXT")
        public int mode() {
            return VkIndirectCommandsIndexBufferTokenEXT.nmode(address());
        }

        public Buffer mode(@NativeType("VkIndirectCommandsInputModeFlagBitsEXT") int value) {
            VkIndirectCommandsIndexBufferTokenEXT.nmode(address(), value);
            return this;
        }
    }
}
