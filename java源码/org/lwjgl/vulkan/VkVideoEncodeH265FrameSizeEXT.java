package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import javax.annotation.Nullable;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoEncodeH265FrameSizeEXT.class */
public class VkVideoEncodeH265FrameSizeEXT extends Struct<VkVideoEncodeH265FrameSizeEXT> implements NativeResource {
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

    protected VkVideoEncodeH265FrameSizeEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkVideoEncodeH265FrameSizeEXT create(long address, @Nullable ByteBuffer container) {
        return new VkVideoEncodeH265FrameSizeEXT(address, container);
    }

    public VkVideoEncodeH265FrameSizeEXT(ByteBuffer container) {
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

    public VkVideoEncodeH265FrameSizeEXT frameISize(@NativeType("uint32_t") int value) {
        nframeISize(address(), value);
        return this;
    }

    public VkVideoEncodeH265FrameSizeEXT framePSize(@NativeType("uint32_t") int value) {
        nframePSize(address(), value);
        return this;
    }

    public VkVideoEncodeH265FrameSizeEXT frameBSize(@NativeType("uint32_t") int value) {
        nframeBSize(address(), value);
        return this;
    }

    public VkVideoEncodeH265FrameSizeEXT set(int frameISize, int framePSize, int frameBSize) {
        frameISize(frameISize);
        framePSize(framePSize);
        frameBSize(frameBSize);
        return this;
    }

    public VkVideoEncodeH265FrameSizeEXT set(VkVideoEncodeH265FrameSizeEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkVideoEncodeH265FrameSizeEXT malloc() {
        return new VkVideoEncodeH265FrameSizeEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkVideoEncodeH265FrameSizeEXT calloc() {
        return new VkVideoEncodeH265FrameSizeEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkVideoEncodeH265FrameSizeEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkVideoEncodeH265FrameSizeEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkVideoEncodeH265FrameSizeEXT create(long address) {
        return new VkVideoEncodeH265FrameSizeEXT(address, null);
    }

    @Nullable
    public static VkVideoEncodeH265FrameSizeEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkVideoEncodeH265FrameSizeEXT(address, null);
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

    @Nullable
    public static Buffer createSafe(long address, int capacity) {
        if (address == 0) {
            return null;
        }
        return new Buffer(address, capacity);
    }

    public static VkVideoEncodeH265FrameSizeEXT malloc(MemoryStack stack) {
        return new VkVideoEncodeH265FrameSizeEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkVideoEncodeH265FrameSizeEXT calloc(MemoryStack stack) {
        return new VkVideoEncodeH265FrameSizeEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static int nframeISize(long struct) {
        return UNSAFE.getInt((Object) null, struct + FRAMEISIZE);
    }

    public static int nframePSize(long struct) {
        return UNSAFE.getInt((Object) null, struct + FRAMEPSIZE);
    }

    public static int nframeBSize(long struct) {
        return UNSAFE.getInt((Object) null, struct + FRAMEBSIZE);
    }

    public static void nframeISize(long struct, int value) {
        UNSAFE.putInt((Object) null, struct + FRAMEISIZE, value);
    }

    public static void nframePSize(long struct, int value) {
        UNSAFE.putInt((Object) null, struct + FRAMEPSIZE, value);
    }

    public static void nframeBSize(long struct, int value) {
        UNSAFE.putInt((Object) null, struct + FRAMEBSIZE, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoEncodeH265FrameSizeEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkVideoEncodeH265FrameSizeEXT, Buffer> implements NativeResource {
        private static final VkVideoEncodeH265FrameSizeEXT ELEMENT_FACTORY = VkVideoEncodeH265FrameSizeEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkVideoEncodeH265FrameSizeEXT.SIZEOF);
        }

        public Buffer(long address, int cap) {
            super(address, null, -1, 0, cap, cap);
        }

        Buffer(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            super(address, container, mark, pos, lim, cap);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.system.CustomBuffer
        public Buffer self() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.system.StructBuffer
        public VkVideoEncodeH265FrameSizeEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("uint32_t")
        public int frameISize() {
            return VkVideoEncodeH265FrameSizeEXT.nframeISize(address());
        }

        @NativeType("uint32_t")
        public int framePSize() {
            return VkVideoEncodeH265FrameSizeEXT.nframePSize(address());
        }

        @NativeType("uint32_t")
        public int frameBSize() {
            return VkVideoEncodeH265FrameSizeEXT.nframeBSize(address());
        }

        public Buffer frameISize(@NativeType("uint32_t") int value) {
            VkVideoEncodeH265FrameSizeEXT.nframeISize(address(), value);
            return this;
        }

        public Buffer framePSize(@NativeType("uint32_t") int value) {
            VkVideoEncodeH265FrameSizeEXT.nframePSize(address(), value);
            return this;
        }

        public Buffer frameBSize(@NativeType("uint32_t") int value) {
            VkVideoEncodeH265FrameSizeEXT.nframeBSize(address(), value);
            return this;
        }
    }
}
