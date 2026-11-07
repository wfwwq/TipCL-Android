package org.lwjgl.vulkan.video;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.util.function.Consumer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.Checks;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoDecodeH264ReferenceInfo.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoDecodeH264ReferenceInfo.class */
public class StdVideoDecodeH264ReferenceInfo extends Struct<StdVideoDecodeH264ReferenceInfo> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int FLAGS;
    public static final int FRAMENUM;
    public static final int RESERVED;
    public static final int PICORDERCNT;

    static {
        Struct.Layout layout = __struct(__member(StdVideoDecodeH264ReferenceInfoFlags.SIZEOF, StdVideoDecodeH264ReferenceInfoFlags.ALIGNOF), __member(2), __member(2), __array(4, 2));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        FLAGS = layout.offsetof(0);
        FRAMENUM = layout.offsetof(1);
        RESERVED = layout.offsetof(2);
        PICORDERCNT = layout.offsetof(3);
    }

    protected StdVideoDecodeH264ReferenceInfo(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public StdVideoDecodeH264ReferenceInfo create(long address, ByteBuffer container) {
        return new StdVideoDecodeH264ReferenceInfo(address, container);
    }

    public StdVideoDecodeH264ReferenceInfo(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    public StdVideoDecodeH264ReferenceInfoFlags flags() {
        return nflags(address());
    }

    @NativeType("uint16_t")
    public short FrameNum() {
        return nFrameNum(address());
    }

    @NativeType("int32_t[STD_VIDEO_DECODE_H264_FIELD_ORDER_COUNT_LIST_SIZE]")
    public IntBuffer PicOrderCnt() {
        return nPicOrderCnt(address());
    }

    @NativeType("int32_t")
    public int PicOrderCnt(int index) {
        return nPicOrderCnt(address(), index);
    }

    public StdVideoDecodeH264ReferenceInfo flags(StdVideoDecodeH264ReferenceInfoFlags value) {
        nflags(address(), value);
        return this;
    }

    public StdVideoDecodeH264ReferenceInfo flags(Consumer<StdVideoDecodeH264ReferenceInfoFlags> consumer) {
        consumer.accept(flags());
        return this;
    }

    public StdVideoDecodeH264ReferenceInfo FrameNum(@NativeType("uint16_t") short value) {
        nFrameNum(address(), value);
        return this;
    }

    public StdVideoDecodeH264ReferenceInfo PicOrderCnt(@NativeType("int32_t[STD_VIDEO_DECODE_H264_FIELD_ORDER_COUNT_LIST_SIZE]") IntBuffer value) {
        nPicOrderCnt(address(), value);
        return this;
    }

    public StdVideoDecodeH264ReferenceInfo PicOrderCnt(int index, @NativeType("int32_t") int value) {
        nPicOrderCnt(address(), index, value);
        return this;
    }

    public StdVideoDecodeH264ReferenceInfo set(StdVideoDecodeH264ReferenceInfoFlags flags, short FrameNum, IntBuffer PicOrderCnt) {
        flags(flags);
        FrameNum(FrameNum);
        PicOrderCnt(PicOrderCnt);
        return this;
    }

    public StdVideoDecodeH264ReferenceInfo set(StdVideoDecodeH264ReferenceInfo src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static StdVideoDecodeH264ReferenceInfo malloc() {
        return new StdVideoDecodeH264ReferenceInfo(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static StdVideoDecodeH264ReferenceInfo calloc() {
        return new StdVideoDecodeH264ReferenceInfo(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static StdVideoDecodeH264ReferenceInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new StdVideoDecodeH264ReferenceInfo(MemoryUtil.memAddress(container), container);
    }

    public static StdVideoDecodeH264ReferenceInfo create(long address) {
        return new StdVideoDecodeH264ReferenceInfo(address, null);
    }

    public static StdVideoDecodeH264ReferenceInfo createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new StdVideoDecodeH264ReferenceInfo(address, null);
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

    public static StdVideoDecodeH264ReferenceInfo malloc(MemoryStack stack) {
        return new StdVideoDecodeH264ReferenceInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static StdVideoDecodeH264ReferenceInfo calloc(MemoryStack stack) {
        return new StdVideoDecodeH264ReferenceInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static StdVideoDecodeH264ReferenceInfoFlags nflags(long struct) {
        return StdVideoDecodeH264ReferenceInfoFlags.create(struct + FLAGS);
    }

    public static short nFrameNum(long struct) {
        return MemoryUtil.memGetShort(struct + FRAMENUM);
    }

    public static short nreserved(long struct) {
        return MemoryUtil.memGetShort(struct + RESERVED);
    }

    public static IntBuffer nPicOrderCnt(long struct) {
        return MemoryUtil.memIntBuffer(struct + PICORDERCNT, 2);
    }

    public static int nPicOrderCnt(long struct, int index) {
        return MemoryUtil.memGetInt(struct + PICORDERCNT + (Checks.check(index, 2) * 4));
    }

    public static void nflags(long struct, StdVideoDecodeH264ReferenceInfoFlags value) {
        MemoryUtil.memCopy(value.address(), struct + FLAGS, StdVideoDecodeH264ReferenceInfoFlags.SIZEOF);
    }

    public static void nFrameNum(long struct, short value) {
        MemoryUtil.memPutShort(struct + FRAMENUM, value);
    }

    public static void nreserved(long struct, short value) {
        MemoryUtil.memPutShort(struct + RESERVED, value);
    }

    public static void nPicOrderCnt(long struct, IntBuffer value) {
        if (Checks.CHECKS) {
            Checks.checkGT(value, 2);
        }
        MemoryUtil.memCopy(MemoryUtil.memAddress(value), struct + PICORDERCNT, value.remaining() * 4);
    }

    public static void nPicOrderCnt(long struct, int index, int value) {
        MemoryUtil.memPutInt(struct + PICORDERCNT + (Checks.check(index, 2) * 4), value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoDecodeH264ReferenceInfo$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoDecodeH264ReferenceInfo$Buffer.class */
    public static class Buffer extends StructBuffer<StdVideoDecodeH264ReferenceInfo, Buffer> implements NativeResource {
        private static final StdVideoDecodeH264ReferenceInfo ELEMENT_FACTORY = StdVideoDecodeH264ReferenceInfo.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / StdVideoDecodeH264ReferenceInfo.SIZEOF);
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
        public StdVideoDecodeH264ReferenceInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        public StdVideoDecodeH264ReferenceInfoFlags flags() {
            return StdVideoDecodeH264ReferenceInfo.nflags(address());
        }

        @NativeType("uint16_t")
        public short FrameNum() {
            return StdVideoDecodeH264ReferenceInfo.nFrameNum(address());
        }

        @NativeType("int32_t[STD_VIDEO_DECODE_H264_FIELD_ORDER_COUNT_LIST_SIZE]")
        public IntBuffer PicOrderCnt() {
            return StdVideoDecodeH264ReferenceInfo.nPicOrderCnt(address());
        }

        @NativeType("int32_t")
        public int PicOrderCnt(int index) {
            return StdVideoDecodeH264ReferenceInfo.nPicOrderCnt(address(), index);
        }

        public Buffer flags(StdVideoDecodeH264ReferenceInfoFlags value) {
            StdVideoDecodeH264ReferenceInfo.nflags(address(), value);
            return this;
        }

        public Buffer flags(Consumer<StdVideoDecodeH264ReferenceInfoFlags> consumer) {
            consumer.accept(flags());
            return this;
        }

        public Buffer FrameNum(@NativeType("uint16_t") short value) {
            StdVideoDecodeH264ReferenceInfo.nFrameNum(address(), value);
            return this;
        }

        public Buffer PicOrderCnt(@NativeType("int32_t[STD_VIDEO_DECODE_H264_FIELD_ORDER_COUNT_LIST_SIZE]") IntBuffer value) {
            StdVideoDecodeH264ReferenceInfo.nPicOrderCnt(address(), value);
            return this;
        }

        public Buffer PicOrderCnt(int index, @NativeType("int32_t") int value) {
            StdVideoDecodeH264ReferenceInfo.nPicOrderCnt(address(), index, value);
            return this;
        }
    }
}
