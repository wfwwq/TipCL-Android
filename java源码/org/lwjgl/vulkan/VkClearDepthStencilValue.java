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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkClearDepthStencilValue.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkClearDepthStencilValue.class */
public class VkClearDepthStencilValue extends Struct<VkClearDepthStencilValue> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int DEPTH;
    public static final int STENCIL;

    static {
        Struct.Layout layout = __struct(__member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        DEPTH = layout.offsetof(0);
        STENCIL = layout.offsetof(1);
    }

    protected VkClearDepthStencilValue(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkClearDepthStencilValue create(long address, ByteBuffer container) {
        return new VkClearDepthStencilValue(address, container);
    }

    public VkClearDepthStencilValue(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    public float depth() {
        return ndepth(address());
    }

    @NativeType("uint32_t")
    public int stencil() {
        return nstencil(address());
    }

    public VkClearDepthStencilValue depth(float value) {
        ndepth(address(), value);
        return this;
    }

    public VkClearDepthStencilValue stencil(@NativeType("uint32_t") int value) {
        nstencil(address(), value);
        return this;
    }

    public VkClearDepthStencilValue set(float depth, int stencil) {
        depth(depth);
        stencil(stencil);
        return this;
    }

    public VkClearDepthStencilValue set(VkClearDepthStencilValue src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkClearDepthStencilValue malloc() {
        return new VkClearDepthStencilValue(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkClearDepthStencilValue calloc() {
        return new VkClearDepthStencilValue(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkClearDepthStencilValue create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkClearDepthStencilValue(MemoryUtil.memAddress(container), container);
    }

    public static VkClearDepthStencilValue create(long address) {
        return new VkClearDepthStencilValue(address, null);
    }

    public static VkClearDepthStencilValue createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkClearDepthStencilValue(address, null);
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

    public static VkClearDepthStencilValue malloc(MemoryStack stack) {
        return new VkClearDepthStencilValue(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkClearDepthStencilValue calloc(MemoryStack stack) {
        return new VkClearDepthStencilValue(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static float ndepth(long struct) {
        return MemoryUtil.memGetFloat(struct + DEPTH);
    }

    public static int nstencil(long struct) {
        return MemoryUtil.memGetInt(struct + STENCIL);
    }

    public static void ndepth(long struct, float value) {
        MemoryUtil.memPutFloat(struct + DEPTH, value);
    }

    public static void nstencil(long struct, int value) {
        MemoryUtil.memPutInt(struct + STENCIL, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkClearDepthStencilValue$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkClearDepthStencilValue$Buffer.class */
    public static class Buffer extends StructBuffer<VkClearDepthStencilValue, Buffer> implements NativeResource {
        private static final VkClearDepthStencilValue ELEMENT_FACTORY = VkClearDepthStencilValue.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkClearDepthStencilValue.SIZEOF);
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
        public VkClearDepthStencilValue getElementFactory() {
            return ELEMENT_FACTORY;
        }

        public float depth() {
            return VkClearDepthStencilValue.ndepth(address());
        }

        @NativeType("uint32_t")
        public int stencil() {
            return VkClearDepthStencilValue.nstencil(address());
        }

        public Buffer depth(float value) {
            VkClearDepthStencilValue.ndepth(address(), value);
            return this;
        }

        public Buffer stencil(@NativeType("uint32_t") int value) {
            VkClearDepthStencilValue.nstencil(address(), value);
            return this;
        }
    }
}
