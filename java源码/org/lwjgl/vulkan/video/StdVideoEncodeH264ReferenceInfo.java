package org.lwjgl.vulkan.video;

import java.nio.ByteBuffer;
import java.util.function.Consumer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoEncodeH264ReferenceInfo.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoEncodeH264ReferenceInfo.class */
public class StdVideoEncodeH264ReferenceInfo extends Struct<StdVideoEncodeH264ReferenceInfo> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int FLAGS;
    public static final int PRIMARY_PIC_TYPE;
    public static final int FRAMENUM;
    public static final int PICORDERCNT;
    public static final int LONG_TERM_PIC_NUM;
    public static final int LONG_TERM_FRAME_IDX;
    public static final int TEMPORAL_ID;

    static {
        Struct.Layout layout = __struct(__member(StdVideoEncodeH264ReferenceInfoFlags.SIZEOF, StdVideoEncodeH264ReferenceInfoFlags.ALIGNOF), __member(4), __member(4), __member(4), __member(2), __member(2), __member(1));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        FLAGS = layout.offsetof(0);
        PRIMARY_PIC_TYPE = layout.offsetof(1);
        FRAMENUM = layout.offsetof(2);
        PICORDERCNT = layout.offsetof(3);
        LONG_TERM_PIC_NUM = layout.offsetof(4);
        LONG_TERM_FRAME_IDX = layout.offsetof(5);
        TEMPORAL_ID = layout.offsetof(6);
    }

    protected StdVideoEncodeH264ReferenceInfo(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public StdVideoEncodeH264ReferenceInfo create(long address, ByteBuffer container) {
        return new StdVideoEncodeH264ReferenceInfo(address, container);
    }

    public StdVideoEncodeH264ReferenceInfo(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    public StdVideoEncodeH264ReferenceInfoFlags flags() {
        return nflags(address());
    }

    @NativeType("StdVideoH264PictureType")
    public int primary_pic_type() {
        return nprimary_pic_type(address());
    }

    @NativeType("uint32_t")
    public int FrameNum() {
        return nFrameNum(address());
    }

    @NativeType("int32_t")
    public int PicOrderCnt() {
        return nPicOrderCnt(address());
    }

    @NativeType("uint16_t")
    public short long_term_pic_num() {
        return nlong_term_pic_num(address());
    }

    @NativeType("uint16_t")
    public short long_term_frame_idx() {
        return nlong_term_frame_idx(address());
    }

    @NativeType("uint8_t")
    public byte temporal_id() {
        return ntemporal_id(address());
    }

    public StdVideoEncodeH264ReferenceInfo flags(StdVideoEncodeH264ReferenceInfoFlags value) {
        nflags(address(), value);
        return this;
    }

    public StdVideoEncodeH264ReferenceInfo flags(Consumer<StdVideoEncodeH264ReferenceInfoFlags> consumer) {
        consumer.accept(flags());
        return this;
    }

    public StdVideoEncodeH264ReferenceInfo primary_pic_type(@NativeType("StdVideoH264PictureType") int value) {
        nprimary_pic_type(address(), value);
        return this;
    }

    public StdVideoEncodeH264ReferenceInfo FrameNum(@NativeType("uint32_t") int value) {
        nFrameNum(address(), value);
        return this;
    }

    public StdVideoEncodeH264ReferenceInfo PicOrderCnt(@NativeType("int32_t") int value) {
        nPicOrderCnt(address(), value);
        return this;
    }

    public StdVideoEncodeH264ReferenceInfo long_term_pic_num(@NativeType("uint16_t") short value) {
        nlong_term_pic_num(address(), value);
        return this;
    }

    public StdVideoEncodeH264ReferenceInfo long_term_frame_idx(@NativeType("uint16_t") short value) {
        nlong_term_frame_idx(address(), value);
        return this;
    }

    public StdVideoEncodeH264ReferenceInfo temporal_id(@NativeType("uint8_t") byte value) {
        ntemporal_id(address(), value);
        return this;
    }

    public StdVideoEncodeH264ReferenceInfo set(StdVideoEncodeH264ReferenceInfoFlags flags, int primary_pic_type, int FrameNum, int PicOrderCnt, short long_term_pic_num, short long_term_frame_idx, byte temporal_id) {
        flags(flags);
        primary_pic_type(primary_pic_type);
        FrameNum(FrameNum);
        PicOrderCnt(PicOrderCnt);
        long_term_pic_num(long_term_pic_num);
        long_term_frame_idx(long_term_frame_idx);
        temporal_id(temporal_id);
        return this;
    }

    public StdVideoEncodeH264ReferenceInfo set(StdVideoEncodeH264ReferenceInfo src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static StdVideoEncodeH264ReferenceInfo malloc() {
        return new StdVideoEncodeH264ReferenceInfo(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static StdVideoEncodeH264ReferenceInfo calloc() {
        return new StdVideoEncodeH264ReferenceInfo(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static StdVideoEncodeH264ReferenceInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new StdVideoEncodeH264ReferenceInfo(MemoryUtil.memAddress(container), container);
    }

    public static StdVideoEncodeH264ReferenceInfo create(long address) {
        return new StdVideoEncodeH264ReferenceInfo(address, null);
    }

    public static StdVideoEncodeH264ReferenceInfo createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new StdVideoEncodeH264ReferenceInfo(address, null);
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

    public static StdVideoEncodeH264ReferenceInfo malloc(MemoryStack stack) {
        return new StdVideoEncodeH264ReferenceInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static StdVideoEncodeH264ReferenceInfo calloc(MemoryStack stack) {
        return new StdVideoEncodeH264ReferenceInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static StdVideoEncodeH264ReferenceInfoFlags nflags(long struct) {
        return StdVideoEncodeH264ReferenceInfoFlags.create(struct + FLAGS);
    }

    public static int nprimary_pic_type(long struct) {
        return MemoryUtil.memGetInt(struct + PRIMARY_PIC_TYPE);
    }

    public static int nFrameNum(long struct) {
        return MemoryUtil.memGetInt(struct + FRAMENUM);
    }

    public static int nPicOrderCnt(long struct) {
        return MemoryUtil.memGetInt(struct + PICORDERCNT);
    }

    public static short nlong_term_pic_num(long struct) {
        return MemoryUtil.memGetShort(struct + LONG_TERM_PIC_NUM);
    }

    public static short nlong_term_frame_idx(long struct) {
        return MemoryUtil.memGetShort(struct + LONG_TERM_FRAME_IDX);
    }

    public static byte ntemporal_id(long struct) {
        return MemoryUtil.memGetByte(struct + TEMPORAL_ID);
    }

    public static void nflags(long struct, StdVideoEncodeH264ReferenceInfoFlags value) {
        MemoryUtil.memCopy(value.address(), struct + FLAGS, StdVideoEncodeH264ReferenceInfoFlags.SIZEOF);
    }

    public static void nprimary_pic_type(long struct, int value) {
        MemoryUtil.memPutInt(struct + PRIMARY_PIC_TYPE, value);
    }

    public static void nFrameNum(long struct, int value) {
        MemoryUtil.memPutInt(struct + FRAMENUM, value);
    }

    public static void nPicOrderCnt(long struct, int value) {
        MemoryUtil.memPutInt(struct + PICORDERCNT, value);
    }

    public static void nlong_term_pic_num(long struct, short value) {
        MemoryUtil.memPutShort(struct + LONG_TERM_PIC_NUM, value);
    }

    public static void nlong_term_frame_idx(long struct, short value) {
        MemoryUtil.memPutShort(struct + LONG_TERM_FRAME_IDX, value);
    }

    public static void ntemporal_id(long struct, byte value) {
        MemoryUtil.memPutByte(struct + TEMPORAL_ID, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoEncodeH264ReferenceInfo$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoEncodeH264ReferenceInfo$Buffer.class */
    public static class Buffer extends StructBuffer<StdVideoEncodeH264ReferenceInfo, Buffer> implements NativeResource {
        private static final StdVideoEncodeH264ReferenceInfo ELEMENT_FACTORY = StdVideoEncodeH264ReferenceInfo.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / StdVideoEncodeH264ReferenceInfo.SIZEOF);
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
        public StdVideoEncodeH264ReferenceInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        public StdVideoEncodeH264ReferenceInfoFlags flags() {
            return StdVideoEncodeH264ReferenceInfo.nflags(address());
        }

        @NativeType("StdVideoH264PictureType")
        public int primary_pic_type() {
            return StdVideoEncodeH264ReferenceInfo.nprimary_pic_type(address());
        }

        @NativeType("uint32_t")
        public int FrameNum() {
            return StdVideoEncodeH264ReferenceInfo.nFrameNum(address());
        }

        @NativeType("int32_t")
        public int PicOrderCnt() {
            return StdVideoEncodeH264ReferenceInfo.nPicOrderCnt(address());
        }

        @NativeType("uint16_t")
        public short long_term_pic_num() {
            return StdVideoEncodeH264ReferenceInfo.nlong_term_pic_num(address());
        }

        @NativeType("uint16_t")
        public short long_term_frame_idx() {
            return StdVideoEncodeH264ReferenceInfo.nlong_term_frame_idx(address());
        }

        @NativeType("uint8_t")
        public byte temporal_id() {
            return StdVideoEncodeH264ReferenceInfo.ntemporal_id(address());
        }

        public Buffer flags(StdVideoEncodeH264ReferenceInfoFlags value) {
            StdVideoEncodeH264ReferenceInfo.nflags(address(), value);
            return this;
        }

        public Buffer flags(Consumer<StdVideoEncodeH264ReferenceInfoFlags> consumer) {
            consumer.accept(flags());
            return this;
        }

        public Buffer primary_pic_type(@NativeType("StdVideoH264PictureType") int value) {
            StdVideoEncodeH264ReferenceInfo.nprimary_pic_type(address(), value);
            return this;
        }

        public Buffer FrameNum(@NativeType("uint32_t") int value) {
            StdVideoEncodeH264ReferenceInfo.nFrameNum(address(), value);
            return this;
        }

        public Buffer PicOrderCnt(@NativeType("int32_t") int value) {
            StdVideoEncodeH264ReferenceInfo.nPicOrderCnt(address(), value);
            return this;
        }

        public Buffer long_term_pic_num(@NativeType("uint16_t") short value) {
            StdVideoEncodeH264ReferenceInfo.nlong_term_pic_num(address(), value);
            return this;
        }

        public Buffer long_term_frame_idx(@NativeType("uint16_t") short value) {
            StdVideoEncodeH264ReferenceInfo.nlong_term_frame_idx(address(), value);
            return this;
        }

        public Buffer temporal_id(@NativeType("uint8_t") byte value) {
            StdVideoEncodeH264ReferenceInfo.ntemporal_id(address(), value);
            return this;
        }
    }
}
