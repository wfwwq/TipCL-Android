package org.lwjgl.vulkan.video;

import java.nio.ByteBuffer;
import java.util.function.Consumer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.Checks;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoDecodeAV1ReferenceInfo.class */
public class StdVideoDecodeAV1ReferenceInfo extends Struct<StdVideoDecodeAV1ReferenceInfo> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int FLAGS;
    public static final int FRAME_TYPE;
    public static final int REFFRAMESIGNBIAS;
    public static final int ORDERHINT;
    public static final int SAVEDORDERHINTS;

    static {
        Struct.Layout layout = __struct(__member(StdVideoDecodeAV1ReferenceInfoFlags.SIZEOF, StdVideoDecodeAV1ReferenceInfoFlags.ALIGNOF), __member(1), __member(1), __member(1), __array(1, 8));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        FLAGS = layout.offsetof(0);
        FRAME_TYPE = layout.offsetof(1);
        REFFRAMESIGNBIAS = layout.offsetof(2);
        ORDERHINT = layout.offsetof(3);
        SAVEDORDERHINTS = layout.offsetof(4);
    }

    protected StdVideoDecodeAV1ReferenceInfo(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public StdVideoDecodeAV1ReferenceInfo create(long address, ByteBuffer container) {
        return new StdVideoDecodeAV1ReferenceInfo(address, container);
    }

    public StdVideoDecodeAV1ReferenceInfo(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    public StdVideoDecodeAV1ReferenceInfoFlags flags() {
        return nflags(address());
    }

    @NativeType("uint8_t")
    public byte frame_type() {
        return nframe_type(address());
    }

    @NativeType("uint8_t")
    public byte RefFrameSignBias() {
        return nRefFrameSignBias(address());
    }

    @NativeType("uint8_t")
    public byte OrderHint() {
        return nOrderHint(address());
    }

    @NativeType("uint8_t[STD_VIDEO_AV1_NUM_REF_FRAMES]")
    public ByteBuffer SavedOrderHints() {
        return nSavedOrderHints(address());
    }

    @NativeType("uint8_t")
    public byte SavedOrderHints(int index) {
        return nSavedOrderHints(address(), index);
    }

    public StdVideoDecodeAV1ReferenceInfo flags(StdVideoDecodeAV1ReferenceInfoFlags value) {
        nflags(address(), value);
        return this;
    }

    public StdVideoDecodeAV1ReferenceInfo flags(Consumer<StdVideoDecodeAV1ReferenceInfoFlags> consumer) {
        consumer.accept(flags());
        return this;
    }

    public StdVideoDecodeAV1ReferenceInfo frame_type(@NativeType("uint8_t") byte value) {
        nframe_type(address(), value);
        return this;
    }

    public StdVideoDecodeAV1ReferenceInfo RefFrameSignBias(@NativeType("uint8_t") byte value) {
        nRefFrameSignBias(address(), value);
        return this;
    }

    public StdVideoDecodeAV1ReferenceInfo OrderHint(@NativeType("uint8_t") byte value) {
        nOrderHint(address(), value);
        return this;
    }

    public StdVideoDecodeAV1ReferenceInfo SavedOrderHints(@NativeType("uint8_t[STD_VIDEO_AV1_NUM_REF_FRAMES]") ByteBuffer value) {
        nSavedOrderHints(address(), value);
        return this;
    }

    public StdVideoDecodeAV1ReferenceInfo SavedOrderHints(int index, @NativeType("uint8_t") byte value) {
        nSavedOrderHints(address(), index, value);
        return this;
    }

    public StdVideoDecodeAV1ReferenceInfo set(StdVideoDecodeAV1ReferenceInfoFlags flags, byte frame_type, byte RefFrameSignBias, byte OrderHint, ByteBuffer SavedOrderHints) {
        flags(flags);
        frame_type(frame_type);
        RefFrameSignBias(RefFrameSignBias);
        OrderHint(OrderHint);
        SavedOrderHints(SavedOrderHints);
        return this;
    }

    public StdVideoDecodeAV1ReferenceInfo set(StdVideoDecodeAV1ReferenceInfo src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static StdVideoDecodeAV1ReferenceInfo malloc() {
        return new StdVideoDecodeAV1ReferenceInfo(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static StdVideoDecodeAV1ReferenceInfo calloc() {
        return new StdVideoDecodeAV1ReferenceInfo(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static StdVideoDecodeAV1ReferenceInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new StdVideoDecodeAV1ReferenceInfo(MemoryUtil.memAddress(container), container);
    }

    public static StdVideoDecodeAV1ReferenceInfo create(long address) {
        return new StdVideoDecodeAV1ReferenceInfo(address, null);
    }

    public static StdVideoDecodeAV1ReferenceInfo createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new StdVideoDecodeAV1ReferenceInfo(address, null);
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

    public static StdVideoDecodeAV1ReferenceInfo malloc(MemoryStack stack) {
        return new StdVideoDecodeAV1ReferenceInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static StdVideoDecodeAV1ReferenceInfo calloc(MemoryStack stack) {
        return new StdVideoDecodeAV1ReferenceInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static StdVideoDecodeAV1ReferenceInfoFlags nflags(long struct) {
        return StdVideoDecodeAV1ReferenceInfoFlags.create(struct + FLAGS);
    }

    public static byte nframe_type(long struct) {
        return MemoryUtil.memGetByte(struct + FRAME_TYPE);
    }

    public static byte nRefFrameSignBias(long struct) {
        return MemoryUtil.memGetByte(struct + REFFRAMESIGNBIAS);
    }

    public static byte nOrderHint(long struct) {
        return MemoryUtil.memGetByte(struct + ORDERHINT);
    }

    public static ByteBuffer nSavedOrderHints(long struct) {
        return MemoryUtil.memByteBuffer(struct + SAVEDORDERHINTS, 8);
    }

    public static byte nSavedOrderHints(long struct, int index) {
        return MemoryUtil.memGetByte(struct + SAVEDORDERHINTS + (Checks.check(index, 8) * 1));
    }

    public static void nflags(long struct, StdVideoDecodeAV1ReferenceInfoFlags value) {
        MemoryUtil.memCopy(value.address(), struct + FLAGS, StdVideoDecodeAV1ReferenceInfoFlags.SIZEOF);
    }

    public static void nframe_type(long struct, byte value) {
        MemoryUtil.memPutByte(struct + FRAME_TYPE, value);
    }

    public static void nRefFrameSignBias(long struct, byte value) {
        MemoryUtil.memPutByte(struct + REFFRAMESIGNBIAS, value);
    }

    public static void nOrderHint(long struct, byte value) {
        MemoryUtil.memPutByte(struct + ORDERHINT, value);
    }

    public static void nSavedOrderHints(long struct, ByteBuffer value) {
        if (Checks.CHECKS) {
            Checks.checkGT(value, 8);
        }
        MemoryUtil.memCopy(MemoryUtil.memAddress(value), struct + SAVEDORDERHINTS, value.remaining() * 1);
    }

    public static void nSavedOrderHints(long struct, int index, byte value) {
        MemoryUtil.memPutByte(struct + SAVEDORDERHINTS + (Checks.check(index, 8) * 1), value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoDecodeAV1ReferenceInfo$Buffer.class */
    public static class Buffer extends StructBuffer<StdVideoDecodeAV1ReferenceInfo, Buffer> implements NativeResource {
        private static final StdVideoDecodeAV1ReferenceInfo ELEMENT_FACTORY = StdVideoDecodeAV1ReferenceInfo.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / StdVideoDecodeAV1ReferenceInfo.SIZEOF);
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
        public StdVideoDecodeAV1ReferenceInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        public StdVideoDecodeAV1ReferenceInfoFlags flags() {
            return StdVideoDecodeAV1ReferenceInfo.nflags(address());
        }

        @NativeType("uint8_t")
        public byte frame_type() {
            return StdVideoDecodeAV1ReferenceInfo.nframe_type(address());
        }

        @NativeType("uint8_t")
        public byte RefFrameSignBias() {
            return StdVideoDecodeAV1ReferenceInfo.nRefFrameSignBias(address());
        }

        @NativeType("uint8_t")
        public byte OrderHint() {
            return StdVideoDecodeAV1ReferenceInfo.nOrderHint(address());
        }

        @NativeType("uint8_t[STD_VIDEO_AV1_NUM_REF_FRAMES]")
        public ByteBuffer SavedOrderHints() {
            return StdVideoDecodeAV1ReferenceInfo.nSavedOrderHints(address());
        }

        @NativeType("uint8_t")
        public byte SavedOrderHints(int index) {
            return StdVideoDecodeAV1ReferenceInfo.nSavedOrderHints(address(), index);
        }

        public Buffer flags(StdVideoDecodeAV1ReferenceInfoFlags value) {
            StdVideoDecodeAV1ReferenceInfo.nflags(address(), value);
            return this;
        }

        public Buffer flags(Consumer<StdVideoDecodeAV1ReferenceInfoFlags> consumer) {
            consumer.accept(flags());
            return this;
        }

        public Buffer frame_type(@NativeType("uint8_t") byte value) {
            StdVideoDecodeAV1ReferenceInfo.nframe_type(address(), value);
            return this;
        }

        public Buffer RefFrameSignBias(@NativeType("uint8_t") byte value) {
            StdVideoDecodeAV1ReferenceInfo.nRefFrameSignBias(address(), value);
            return this;
        }

        public Buffer OrderHint(@NativeType("uint8_t") byte value) {
            StdVideoDecodeAV1ReferenceInfo.nOrderHint(address(), value);
            return this;
        }

        public Buffer SavedOrderHints(@NativeType("uint8_t[STD_VIDEO_AV1_NUM_REF_FRAMES]") ByteBuffer value) {
            StdVideoDecodeAV1ReferenceInfo.nSavedOrderHints(address(), value);
            return this;
        }

        public Buffer SavedOrderHints(int index, @NativeType("uint8_t") byte value) {
            StdVideoDecodeAV1ReferenceInfo.nSavedOrderHints(address(), index, value);
            return this;
        }
    }
}
