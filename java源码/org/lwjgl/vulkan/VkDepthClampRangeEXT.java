package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDepthClampRangeEXT.class */
public class VkDepthClampRangeEXT extends Struct<VkDepthClampRangeEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int MINDEPTHCLAMP;
    public static final int MAXDEPTHCLAMP;

    static {
        Struct.Layout layout = __struct(__member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        MINDEPTHCLAMP = layout.offsetof(0);
        MAXDEPTHCLAMP = layout.offsetof(1);
    }

    protected VkDepthClampRangeEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkDepthClampRangeEXT create(long address, ByteBuffer container) {
        return new VkDepthClampRangeEXT(address, container);
    }

    public VkDepthClampRangeEXT(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    public float minDepthClamp() {
        return nminDepthClamp(address());
    }

    public float maxDepthClamp() {
        return nmaxDepthClamp(address());
    }

    public VkDepthClampRangeEXT minDepthClamp(float value) {
        nminDepthClamp(address(), value);
        return this;
    }

    public VkDepthClampRangeEXT maxDepthClamp(float value) {
        nmaxDepthClamp(address(), value);
        return this;
    }

    public VkDepthClampRangeEXT set(float minDepthClamp, float maxDepthClamp) {
        minDepthClamp(minDepthClamp);
        maxDepthClamp(maxDepthClamp);
        return this;
    }

    public VkDepthClampRangeEXT set(VkDepthClampRangeEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkDepthClampRangeEXT malloc() {
        return new VkDepthClampRangeEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkDepthClampRangeEXT calloc() {
        return new VkDepthClampRangeEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkDepthClampRangeEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDepthClampRangeEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkDepthClampRangeEXT create(long address) {
        return new VkDepthClampRangeEXT(address, null);
    }

    public static VkDepthClampRangeEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkDepthClampRangeEXT(address, null);
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

    public static VkDepthClampRangeEXT malloc(MemoryStack stack) {
        return new VkDepthClampRangeEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkDepthClampRangeEXT calloc(MemoryStack stack) {
        return new VkDepthClampRangeEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static float nminDepthClamp(long struct) {
        return MemoryUtil.memGetFloat(struct + MINDEPTHCLAMP);
    }

    public static float nmaxDepthClamp(long struct) {
        return MemoryUtil.memGetFloat(struct + MAXDEPTHCLAMP);
    }

    public static void nminDepthClamp(long struct, float value) {
        MemoryUtil.memPutFloat(struct + MINDEPTHCLAMP, value);
    }

    public static void nmaxDepthClamp(long struct, float value) {
        MemoryUtil.memPutFloat(struct + MAXDEPTHCLAMP, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDepthClampRangeEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkDepthClampRangeEXT, Buffer> implements NativeResource {
        private static final VkDepthClampRangeEXT ELEMENT_FACTORY = VkDepthClampRangeEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkDepthClampRangeEXT.SIZEOF);
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
        public VkDepthClampRangeEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        public float minDepthClamp() {
            return VkDepthClampRangeEXT.nminDepthClamp(address());
        }

        public float maxDepthClamp() {
            return VkDepthClampRangeEXT.nmaxDepthClamp(address());
        }

        public Buffer minDepthClamp(float value) {
            VkDepthClampRangeEXT.nminDepthClamp(address(), value);
            return this;
        }

        public Buffer maxDepthClamp(float value) {
            VkDepthClampRangeEXT.nmaxDepthClamp(address(), value);
            return this;
        }
    }
}
