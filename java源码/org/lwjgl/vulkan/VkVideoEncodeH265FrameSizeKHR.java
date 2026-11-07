package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoEncodeH265FrameSizeKHR.class */
public class VkVideoEncodeH265FrameSizeKHR extends Struct<VkVideoEncodeH265FrameSizeKHR> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int FRAMEISIZE;
    public static final int FRAMEPSIZE;
    public static final int FRAMEBSIZE;

    static {
        Struct.Layout layout = __struct(__member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        FRAMEISIZE = layout.offsetof(0);
        FRAMEPSIZE = layout.offsetof(1);
        FRAMEBSIZE = layout.offsetof(2);
    }

    protected VkVideoEncodeH265FrameSizeKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkVideoEncodeH265FrameSizeKHR create(long address, ByteBuffer container) {
        return new VkVideoEncodeH265FrameSizeKHR(address, container);
    }

    public VkVideoEncodeH265FrameSizeKHR(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("uint32_t")
    public int frameISize() {
        return nframeISize(address());
    }

    @NativeType("uint32_t")
    public int framePSize() {
        return nframePSize(address());
    }

    @NativeType("uint32_t")
    public int frameBSize() {
        return nframeBSize(address());
    }

    public VkVideoEncodeH265FrameSizeKHR frameISize(@NativeType("uint32_t") int value) {
        nframeISize(address(), value);
        return this;
    }

    public VkVideoEncodeH265FrameSizeKHR framePSize(@NativeType("uint32_t") int value) {
        nframePSize(address(), value);
        return this;
    }

    public VkVideoEncodeH265FrameSizeKHR frameBSize(@NativeType("uint32_t") int value) {
        nframeBSize(address(), value);
        return this;
    }

    public VkVideoEncodeH265FrameSizeKHR set(int frameISize, int framePSize, int frameBSize) {
        frameISize(frameISize);
        framePSize(framePSize);
        frameBSize(frameBSize);
        return this;
    }

    public VkVideoEncodeH265FrameSizeKHR set(VkVideoEncodeH265FrameSizeKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkVideoEncodeH265FrameSizeKHR malloc() {
        return new VkVideoEncodeH265FrameSizeKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkVideoEncodeH265FrameSizeKHR calloc() {
        return new VkVideoEncodeH265FrameSizeKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkVideoEncodeH265FrameSizeKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkVideoEncodeH265FrameSizeKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkVideoEncodeH265FrameSizeKHR create(long address) {
        return new VkVideoEncodeH265FrameSizeKHR(address, null);
    }

    public static VkVideoEncodeH265FrameSizeKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkVideoEncodeH265FrameSizeKHR(address, null);
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

    public static VkVideoEncodeH265FrameSizeKHR malloc(MemoryStack stack) {
        return new VkVideoEncodeH265FrameSizeKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkVideoEncodeH265FrameSizeKHR calloc(MemoryStack stack) {
        return new VkVideoEncodeH265FrameSizeKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static int nframeISize(long struct) {
        return MemoryUtil.memGetInt(struct + FRAMEISIZE);
    }

    public static int nframePSize(long struct) {
        return MemoryUtil.memGetInt(struct + FRAMEPSIZE);
    }

    public static int nframeBSize(long struct) {
        return MemoryUtil.memGetInt(struct + FRAMEBSIZE);
    }

    public static void nframeISize(long struct, int value) {
        MemoryUtil.memPutInt(struct + FRAMEISIZE, value);
    }

    public static void nframePSize(long struct, int value) {
        MemoryUtil.memPutInt(struct + FRAMEPSIZE, value);
    }

    public static void nframeBSize(long struct, int value) {
        MemoryUtil.memPutInt(struct + FRAMEBSIZE, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoEncodeH265FrameSizeKHR$Buffer.class */
    public static class Buffer extends StructBuffer<VkVideoEncodeH265FrameSizeKHR, Buffer> implements NativeResource {
        private static final VkVideoEncodeH265FrameSizeKHR ELEMENT_FACTORY = VkVideoEncodeH265FrameSizeKHR.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkVideoEncodeH265FrameSizeKHR.SIZEOF);
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
        public VkVideoEncodeH265FrameSizeKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("uint32_t")
        public int frameISize() {
            return VkVideoEncodeH265FrameSizeKHR.nframeISize(address());
        }

        @NativeType("uint32_t")
        public int framePSize() {
            return VkVideoEncodeH265FrameSizeKHR.nframePSize(address());
        }

        @NativeType("uint32_t")
        public int frameBSize() {
            return VkVideoEncodeH265FrameSizeKHR.nframeBSize(address());
        }

        public Buffer frameISize(@NativeType("uint32_t") int value) {
            VkVideoEncodeH265FrameSizeKHR.nframeISize(address(), value);
            return this;
        }

        public Buffer framePSize(@NativeType("uint32_t") int value) {
            VkVideoEncodeH265FrameSizeKHR.nframePSize(address(), value);
            return this;
        }

        public Buffer frameBSize(@NativeType("uint32_t") int value) {
            VkVideoEncodeH265FrameSizeKHR.nframeBSize(address(), value);
            return this;
        }
    }
}
