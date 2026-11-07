package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoEncodeH264FrameSizeKHR.class */
public class VkVideoEncodeH264FrameSizeKHR extends Struct<VkVideoEncodeH264FrameSizeKHR> implements NativeResource {
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

    protected VkVideoEncodeH264FrameSizeKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkVideoEncodeH264FrameSizeKHR create(long address, ByteBuffer container) {
        return new VkVideoEncodeH264FrameSizeKHR(address, container);
    }

    public VkVideoEncodeH264FrameSizeKHR(ByteBuffer container) {
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

    public VkVideoEncodeH264FrameSizeKHR frameISize(@NativeType("uint32_t") int value) {
        nframeISize(address(), value);
        return this;
    }

    public VkVideoEncodeH264FrameSizeKHR framePSize(@NativeType("uint32_t") int value) {
        nframePSize(address(), value);
        return this;
    }

    public VkVideoEncodeH264FrameSizeKHR frameBSize(@NativeType("uint32_t") int value) {
        nframeBSize(address(), value);
        return this;
    }

    public VkVideoEncodeH264FrameSizeKHR set(int frameISize, int framePSize, int frameBSize) {
        frameISize(frameISize);
        framePSize(framePSize);
        frameBSize(frameBSize);
        return this;
    }

    public VkVideoEncodeH264FrameSizeKHR set(VkVideoEncodeH264FrameSizeKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkVideoEncodeH264FrameSizeKHR malloc() {
        return new VkVideoEncodeH264FrameSizeKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkVideoEncodeH264FrameSizeKHR calloc() {
        return new VkVideoEncodeH264FrameSizeKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkVideoEncodeH264FrameSizeKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkVideoEncodeH264FrameSizeKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkVideoEncodeH264FrameSizeKHR create(long address) {
        return new VkVideoEncodeH264FrameSizeKHR(address, null);
    }

    public static VkVideoEncodeH264FrameSizeKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkVideoEncodeH264FrameSizeKHR(address, null);
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

    public static VkVideoEncodeH264FrameSizeKHR malloc(MemoryStack stack) {
        return new VkVideoEncodeH264FrameSizeKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkVideoEncodeH264FrameSizeKHR calloc(MemoryStack stack) {
        return new VkVideoEncodeH264FrameSizeKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoEncodeH264FrameSizeKHR$Buffer.class */
    public static class Buffer extends StructBuffer<VkVideoEncodeH264FrameSizeKHR, Buffer> implements NativeResource {
        private static final VkVideoEncodeH264FrameSizeKHR ELEMENT_FACTORY = VkVideoEncodeH264FrameSizeKHR.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkVideoEncodeH264FrameSizeKHR.SIZEOF);
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
        public VkVideoEncodeH264FrameSizeKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("uint32_t")
        public int frameISize() {
            return VkVideoEncodeH264FrameSizeKHR.nframeISize(address());
        }

        @NativeType("uint32_t")
        public int framePSize() {
            return VkVideoEncodeH264FrameSizeKHR.nframePSize(address());
        }

        @NativeType("uint32_t")
        public int frameBSize() {
            return VkVideoEncodeH264FrameSizeKHR.nframeBSize(address());
        }

        public Buffer frameISize(@NativeType("uint32_t") int value) {
            VkVideoEncodeH264FrameSizeKHR.nframeISize(address(), value);
            return this;
        }

        public Buffer framePSize(@NativeType("uint32_t") int value) {
            VkVideoEncodeH264FrameSizeKHR.nframePSize(address(), value);
            return this;
        }

        public Buffer frameBSize(@NativeType("uint32_t") int value) {
            VkVideoEncodeH264FrameSizeKHR.nframeBSize(address(), value);
            return this;
        }
    }
}
