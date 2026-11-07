package org.lwjgl.vulkan.video;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.nio.ShortBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.Checks;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoAV1LoopRestoration.class */
public class StdVideoAV1LoopRestoration extends Struct<StdVideoAV1LoopRestoration> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int FRAMERESTORATIONTYPE;
    public static final int LOOPRESTORATIONSIZE;

    static {
        Struct.Layout layout = __struct(__array(4, 3), __array(2, 3));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        FRAMERESTORATIONTYPE = layout.offsetof(0);
        LOOPRESTORATIONSIZE = layout.offsetof(1);
    }

    protected StdVideoAV1LoopRestoration(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public StdVideoAV1LoopRestoration create(long address, ByteBuffer container) {
        return new StdVideoAV1LoopRestoration(address, container);
    }

    public StdVideoAV1LoopRestoration(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("StdVideoAV1FrameRestorationType[STD_VIDEO_AV1_MAX_NUM_PLANES]")
    public IntBuffer FrameRestorationType() {
        return nFrameRestorationType(address());
    }

    @NativeType("StdVideoAV1FrameRestorationType")
    public int FrameRestorationType(int index) {
        return nFrameRestorationType(address(), index);
    }

    @NativeType("uint16_t[STD_VIDEO_AV1_MAX_NUM_PLANES]")
    public ShortBuffer LoopRestorationSize() {
        return nLoopRestorationSize(address());
    }

    @NativeType("uint16_t")
    public short LoopRestorationSize(int index) {
        return nLoopRestorationSize(address(), index);
    }

    public StdVideoAV1LoopRestoration FrameRestorationType(@NativeType("StdVideoAV1FrameRestorationType[STD_VIDEO_AV1_MAX_NUM_PLANES]") IntBuffer value) {
        nFrameRestorationType(address(), value);
        return this;
    }

    public StdVideoAV1LoopRestoration FrameRestorationType(int index, @NativeType("StdVideoAV1FrameRestorationType") int value) {
        nFrameRestorationType(address(), index, value);
        return this;
    }

    public StdVideoAV1LoopRestoration LoopRestorationSize(@NativeType("uint16_t[STD_VIDEO_AV1_MAX_NUM_PLANES]") ShortBuffer value) {
        nLoopRestorationSize(address(), value);
        return this;
    }

    public StdVideoAV1LoopRestoration LoopRestorationSize(int index, @NativeType("uint16_t") short value) {
        nLoopRestorationSize(address(), index, value);
        return this;
    }

    public StdVideoAV1LoopRestoration set(IntBuffer FrameRestorationType, ShortBuffer LoopRestorationSize) {
        FrameRestorationType(FrameRestorationType);
        LoopRestorationSize(LoopRestorationSize);
        return this;
    }

    public StdVideoAV1LoopRestoration set(StdVideoAV1LoopRestoration src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static StdVideoAV1LoopRestoration malloc() {
        return new StdVideoAV1LoopRestoration(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static StdVideoAV1LoopRestoration calloc() {
        return new StdVideoAV1LoopRestoration(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static StdVideoAV1LoopRestoration create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new StdVideoAV1LoopRestoration(MemoryUtil.memAddress(container), container);
    }

    public static StdVideoAV1LoopRestoration create(long address) {
        return new StdVideoAV1LoopRestoration(address, null);
    }

    public static StdVideoAV1LoopRestoration createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new StdVideoAV1LoopRestoration(address, null);
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

    public static StdVideoAV1LoopRestoration malloc(MemoryStack stack) {
        return new StdVideoAV1LoopRestoration(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static StdVideoAV1LoopRestoration calloc(MemoryStack stack) {
        return new StdVideoAV1LoopRestoration(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static IntBuffer nFrameRestorationType(long struct) {
        return MemoryUtil.memIntBuffer(struct + FRAMERESTORATIONTYPE, 3);
    }

    public static int nFrameRestorationType(long struct, int index) {
        return MemoryUtil.memGetInt(struct + FRAMERESTORATIONTYPE + (Checks.check(index, 3) * 4));
    }

    public static ShortBuffer nLoopRestorationSize(long struct) {
        return MemoryUtil.memShortBuffer(struct + LOOPRESTORATIONSIZE, 3);
    }

    public static short nLoopRestorationSize(long struct, int index) {
        return MemoryUtil.memGetShort(struct + LOOPRESTORATIONSIZE + (Checks.check(index, 3) * 2));
    }

    public static void nFrameRestorationType(long struct, IntBuffer value) {
        if (Checks.CHECKS) {
            Checks.checkGT(value, 3);
        }
        MemoryUtil.memCopy(MemoryUtil.memAddress(value), struct + FRAMERESTORATIONTYPE, value.remaining() * 4);
    }

    public static void nFrameRestorationType(long struct, int index, int value) {
        MemoryUtil.memPutInt(struct + FRAMERESTORATIONTYPE + (Checks.check(index, 3) * 4), value);
    }

    public static void nLoopRestorationSize(long struct, ShortBuffer value) {
        if (Checks.CHECKS) {
            Checks.checkGT(value, 3);
        }
        MemoryUtil.memCopy(MemoryUtil.memAddress(value), struct + LOOPRESTORATIONSIZE, value.remaining() * 2);
    }

    public static void nLoopRestorationSize(long struct, int index, short value) {
        MemoryUtil.memPutShort(struct + LOOPRESTORATIONSIZE + (Checks.check(index, 3) * 2), value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoAV1LoopRestoration$Buffer.class */
    public static class Buffer extends StructBuffer<StdVideoAV1LoopRestoration, Buffer> implements NativeResource {
        private static final StdVideoAV1LoopRestoration ELEMENT_FACTORY = StdVideoAV1LoopRestoration.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / StdVideoAV1LoopRestoration.SIZEOF);
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
        public StdVideoAV1LoopRestoration getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("StdVideoAV1FrameRestorationType[STD_VIDEO_AV1_MAX_NUM_PLANES]")
        public IntBuffer FrameRestorationType() {
            return StdVideoAV1LoopRestoration.nFrameRestorationType(address());
        }

        @NativeType("StdVideoAV1FrameRestorationType")
        public int FrameRestorationType(int index) {
            return StdVideoAV1LoopRestoration.nFrameRestorationType(address(), index);
        }

        @NativeType("uint16_t[STD_VIDEO_AV1_MAX_NUM_PLANES]")
        public ShortBuffer LoopRestorationSize() {
            return StdVideoAV1LoopRestoration.nLoopRestorationSize(address());
        }

        @NativeType("uint16_t")
        public short LoopRestorationSize(int index) {
            return StdVideoAV1LoopRestoration.nLoopRestorationSize(address(), index);
        }

        public Buffer FrameRestorationType(@NativeType("StdVideoAV1FrameRestorationType[STD_VIDEO_AV1_MAX_NUM_PLANES]") IntBuffer value) {
            StdVideoAV1LoopRestoration.nFrameRestorationType(address(), value);
            return this;
        }

        public Buffer FrameRestorationType(int index, @NativeType("StdVideoAV1FrameRestorationType") int value) {
            StdVideoAV1LoopRestoration.nFrameRestorationType(address(), index, value);
            return this;
        }

        public Buffer LoopRestorationSize(@NativeType("uint16_t[STD_VIDEO_AV1_MAX_NUM_PLANES]") ShortBuffer value) {
            StdVideoAV1LoopRestoration.nLoopRestorationSize(address(), value);
            return this;
        }

        public Buffer LoopRestorationSize(int index, @NativeType("uint16_t") short value) {
            StdVideoAV1LoopRestoration.nLoopRestorationSize(address(), index, value);
            return this;
        }
    }
}
