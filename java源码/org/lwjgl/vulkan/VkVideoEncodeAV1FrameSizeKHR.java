package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoEncodeAV1FrameSizeKHR.class */
public class VkVideoEncodeAV1FrameSizeKHR extends Struct<VkVideoEncodeAV1FrameSizeKHR> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int INTRAFRAMESIZE;
    public static final int PREDICTIVEFRAMESIZE;
    public static final int BIPREDICTIVEFRAMESIZE;

    static {
        Struct.Layout layout = __struct(__member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        INTRAFRAMESIZE = layout.offsetof(0);
        PREDICTIVEFRAMESIZE = layout.offsetof(1);
        BIPREDICTIVEFRAMESIZE = layout.offsetof(2);
    }

    protected VkVideoEncodeAV1FrameSizeKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkVideoEncodeAV1FrameSizeKHR create(long address, ByteBuffer container) {
        return new VkVideoEncodeAV1FrameSizeKHR(address, container);
    }

    public VkVideoEncodeAV1FrameSizeKHR(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("uint32_t")
    public int intraFrameSize() {
        return nintraFrameSize(address());
    }

    @NativeType("uint32_t")
    public int predictiveFrameSize() {
        return npredictiveFrameSize(address());
    }

    @NativeType("uint32_t")
    public int bipredictiveFrameSize() {
        return nbipredictiveFrameSize(address());
    }

    public VkVideoEncodeAV1FrameSizeKHR intraFrameSize(@NativeType("uint32_t") int value) {
        nintraFrameSize(address(), value);
        return this;
    }

    public VkVideoEncodeAV1FrameSizeKHR predictiveFrameSize(@NativeType("uint32_t") int value) {
        npredictiveFrameSize(address(), value);
        return this;
    }

    public VkVideoEncodeAV1FrameSizeKHR bipredictiveFrameSize(@NativeType("uint32_t") int value) {
        nbipredictiveFrameSize(address(), value);
        return this;
    }

    public VkVideoEncodeAV1FrameSizeKHR set(int intraFrameSize, int predictiveFrameSize, int bipredictiveFrameSize) {
        intraFrameSize(intraFrameSize);
        predictiveFrameSize(predictiveFrameSize);
        bipredictiveFrameSize(bipredictiveFrameSize);
        return this;
    }

    public VkVideoEncodeAV1FrameSizeKHR set(VkVideoEncodeAV1FrameSizeKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkVideoEncodeAV1FrameSizeKHR malloc() {
        return new VkVideoEncodeAV1FrameSizeKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkVideoEncodeAV1FrameSizeKHR calloc() {
        return new VkVideoEncodeAV1FrameSizeKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkVideoEncodeAV1FrameSizeKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkVideoEncodeAV1FrameSizeKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkVideoEncodeAV1FrameSizeKHR create(long address) {
        return new VkVideoEncodeAV1FrameSizeKHR(address, null);
    }

    public static VkVideoEncodeAV1FrameSizeKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkVideoEncodeAV1FrameSizeKHR(address, null);
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

    public static VkVideoEncodeAV1FrameSizeKHR malloc(MemoryStack stack) {
        return new VkVideoEncodeAV1FrameSizeKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkVideoEncodeAV1FrameSizeKHR calloc(MemoryStack stack) {
        return new VkVideoEncodeAV1FrameSizeKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static int nintraFrameSize(long struct) {
        return MemoryUtil.memGetInt(struct + INTRAFRAMESIZE);
    }

    public static int npredictiveFrameSize(long struct) {
        return MemoryUtil.memGetInt(struct + PREDICTIVEFRAMESIZE);
    }

    public static int nbipredictiveFrameSize(long struct) {
        return MemoryUtil.memGetInt(struct + BIPREDICTIVEFRAMESIZE);
    }

    public static void nintraFrameSize(long struct, int value) {
        MemoryUtil.memPutInt(struct + INTRAFRAMESIZE, value);
    }

    public static void npredictiveFrameSize(long struct, int value) {
        MemoryUtil.memPutInt(struct + PREDICTIVEFRAMESIZE, value);
    }

    public static void nbipredictiveFrameSize(long struct, int value) {
        MemoryUtil.memPutInt(struct + BIPREDICTIVEFRAMESIZE, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoEncodeAV1FrameSizeKHR$Buffer.class */
    public static class Buffer extends StructBuffer<VkVideoEncodeAV1FrameSizeKHR, Buffer> implements NativeResource {
        private static final VkVideoEncodeAV1FrameSizeKHR ELEMENT_FACTORY = VkVideoEncodeAV1FrameSizeKHR.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkVideoEncodeAV1FrameSizeKHR.SIZEOF);
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
        public VkVideoEncodeAV1FrameSizeKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("uint32_t")
        public int intraFrameSize() {
            return VkVideoEncodeAV1FrameSizeKHR.nintraFrameSize(address());
        }

        @NativeType("uint32_t")
        public int predictiveFrameSize() {
            return VkVideoEncodeAV1FrameSizeKHR.npredictiveFrameSize(address());
        }

        @NativeType("uint32_t")
        public int bipredictiveFrameSize() {
            return VkVideoEncodeAV1FrameSizeKHR.nbipredictiveFrameSize(address());
        }

        public Buffer intraFrameSize(@NativeType("uint32_t") int value) {
            VkVideoEncodeAV1FrameSizeKHR.nintraFrameSize(address(), value);
            return this;
        }

        public Buffer predictiveFrameSize(@NativeType("uint32_t") int value) {
            VkVideoEncodeAV1FrameSizeKHR.npredictiveFrameSize(address(), value);
            return this;
        }

        public Buffer bipredictiveFrameSize(@NativeType("uint32_t") int value) {
            VkVideoEncodeAV1FrameSizeKHR.nbipredictiveFrameSize(address(), value);
            return this;
        }
    }
}
