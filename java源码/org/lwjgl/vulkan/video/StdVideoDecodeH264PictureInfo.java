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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoDecodeH264PictureInfo.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoDecodeH264PictureInfo.class */
public class StdVideoDecodeH264PictureInfo extends Struct<StdVideoDecodeH264PictureInfo> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int FLAGS;
    public static final int SEQ_PARAMETER_SET_ID;
    public static final int PIC_PARAMETER_SET_ID;
    public static final int RESERVED1;
    public static final int RESERVED2;
    public static final int FRAME_NUM;
    public static final int IDR_PIC_ID;
    public static final int PICORDERCNT;

    static {
        Struct.Layout layout = __struct(__member(StdVideoDecodeH264PictureInfoFlags.SIZEOF, StdVideoDecodeH264PictureInfoFlags.ALIGNOF), __member(1), __member(1), __member(1), __member(1), __member(2), __member(2), __array(4, 2));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        FLAGS = layout.offsetof(0);
        SEQ_PARAMETER_SET_ID = layout.offsetof(1);
        PIC_PARAMETER_SET_ID = layout.offsetof(2);
        RESERVED1 = layout.offsetof(3);
        RESERVED2 = layout.offsetof(4);
        FRAME_NUM = layout.offsetof(5);
        IDR_PIC_ID = layout.offsetof(6);
        PICORDERCNT = layout.offsetof(7);
    }

    protected StdVideoDecodeH264PictureInfo(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public StdVideoDecodeH264PictureInfo create(long address, ByteBuffer container) {
        return new StdVideoDecodeH264PictureInfo(address, container);
    }

    public StdVideoDecodeH264PictureInfo(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    public StdVideoDecodeH264PictureInfoFlags flags() {
        return nflags(address());
    }

    @NativeType("uint8_t")
    public byte seq_parameter_set_id() {
        return nseq_parameter_set_id(address());
    }

    @NativeType("uint8_t")
    public byte pic_parameter_set_id() {
        return npic_parameter_set_id(address());
    }

    @NativeType("uint16_t")
    public short frame_num() {
        return nframe_num(address());
    }

    @NativeType("uint16_t")
    public short idr_pic_id() {
        return nidr_pic_id(address());
    }

    @NativeType("int32_t[STD_VIDEO_DECODE_H264_FIELD_ORDER_COUNT_LIST_SIZE]")
    public IntBuffer PicOrderCnt() {
        return nPicOrderCnt(address());
    }

    @NativeType("int32_t")
    public int PicOrderCnt(int index) {
        return nPicOrderCnt(address(), index);
    }

    public StdVideoDecodeH264PictureInfo flags(StdVideoDecodeH264PictureInfoFlags value) {
        nflags(address(), value);
        return this;
    }

    public StdVideoDecodeH264PictureInfo flags(Consumer<StdVideoDecodeH264PictureInfoFlags> consumer) {
        consumer.accept(flags());
        return this;
    }

    public StdVideoDecodeH264PictureInfo seq_parameter_set_id(@NativeType("uint8_t") byte value) {
        nseq_parameter_set_id(address(), value);
        return this;
    }

    public StdVideoDecodeH264PictureInfo pic_parameter_set_id(@NativeType("uint8_t") byte value) {
        npic_parameter_set_id(address(), value);
        return this;
    }

    public StdVideoDecodeH264PictureInfo frame_num(@NativeType("uint16_t") short value) {
        nframe_num(address(), value);
        return this;
    }

    public StdVideoDecodeH264PictureInfo idr_pic_id(@NativeType("uint16_t") short value) {
        nidr_pic_id(address(), value);
        return this;
    }

    public StdVideoDecodeH264PictureInfo PicOrderCnt(@NativeType("int32_t[STD_VIDEO_DECODE_H264_FIELD_ORDER_COUNT_LIST_SIZE]") IntBuffer value) {
        nPicOrderCnt(address(), value);
        return this;
    }

    public StdVideoDecodeH264PictureInfo PicOrderCnt(int index, @NativeType("int32_t") int value) {
        nPicOrderCnt(address(), index, value);
        return this;
    }

    public StdVideoDecodeH264PictureInfo set(StdVideoDecodeH264PictureInfoFlags flags, byte seq_parameter_set_id, byte pic_parameter_set_id, short frame_num, short idr_pic_id, IntBuffer PicOrderCnt) {
        flags(flags);
        seq_parameter_set_id(seq_parameter_set_id);
        pic_parameter_set_id(pic_parameter_set_id);
        frame_num(frame_num);
        idr_pic_id(idr_pic_id);
        PicOrderCnt(PicOrderCnt);
        return this;
    }

    public StdVideoDecodeH264PictureInfo set(StdVideoDecodeH264PictureInfo src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static StdVideoDecodeH264PictureInfo malloc() {
        return new StdVideoDecodeH264PictureInfo(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static StdVideoDecodeH264PictureInfo calloc() {
        return new StdVideoDecodeH264PictureInfo(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static StdVideoDecodeH264PictureInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new StdVideoDecodeH264PictureInfo(MemoryUtil.memAddress(container), container);
    }

    public static StdVideoDecodeH264PictureInfo create(long address) {
        return new StdVideoDecodeH264PictureInfo(address, null);
    }

    public static StdVideoDecodeH264PictureInfo createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new StdVideoDecodeH264PictureInfo(address, null);
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

    public static StdVideoDecodeH264PictureInfo malloc(MemoryStack stack) {
        return new StdVideoDecodeH264PictureInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static StdVideoDecodeH264PictureInfo calloc(MemoryStack stack) {
        return new StdVideoDecodeH264PictureInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static StdVideoDecodeH264PictureInfoFlags nflags(long struct) {
        return StdVideoDecodeH264PictureInfoFlags.create(struct + FLAGS);
    }

    public static byte nseq_parameter_set_id(long struct) {
        return MemoryUtil.memGetByte(struct + SEQ_PARAMETER_SET_ID);
    }

    public static byte npic_parameter_set_id(long struct) {
        return MemoryUtil.memGetByte(struct + PIC_PARAMETER_SET_ID);
    }

    public static byte nreserved1(long struct) {
        return MemoryUtil.memGetByte(struct + RESERVED1);
    }

    public static byte nreserved2(long struct) {
        return MemoryUtil.memGetByte(struct + RESERVED2);
    }

    public static short nframe_num(long struct) {
        return MemoryUtil.memGetShort(struct + FRAME_NUM);
    }

    public static short nidr_pic_id(long struct) {
        return MemoryUtil.memGetShort(struct + IDR_PIC_ID);
    }

    public static IntBuffer nPicOrderCnt(long struct) {
        return MemoryUtil.memIntBuffer(struct + PICORDERCNT, 2);
    }

    public static int nPicOrderCnt(long struct, int index) {
        return MemoryUtil.memGetInt(struct + PICORDERCNT + (Checks.check(index, 2) * 4));
    }

    public static void nflags(long struct, StdVideoDecodeH264PictureInfoFlags value) {
        MemoryUtil.memCopy(value.address(), struct + FLAGS, StdVideoDecodeH264PictureInfoFlags.SIZEOF);
    }

    public static void nseq_parameter_set_id(long struct, byte value) {
        MemoryUtil.memPutByte(struct + SEQ_PARAMETER_SET_ID, value);
    }

    public static void npic_parameter_set_id(long struct, byte value) {
        MemoryUtil.memPutByte(struct + PIC_PARAMETER_SET_ID, value);
    }

    public static void nreserved1(long struct, byte value) {
        MemoryUtil.memPutByte(struct + RESERVED1, value);
    }

    public static void nreserved2(long struct, byte value) {
        MemoryUtil.memPutByte(struct + RESERVED2, value);
    }

    public static void nframe_num(long struct, short value) {
        MemoryUtil.memPutShort(struct + FRAME_NUM, value);
    }

    public static void nidr_pic_id(long struct, short value) {
        MemoryUtil.memPutShort(struct + IDR_PIC_ID, value);
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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoDecodeH264PictureInfo$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoDecodeH264PictureInfo$Buffer.class */
    public static class Buffer extends StructBuffer<StdVideoDecodeH264PictureInfo, Buffer> implements NativeResource {
        private static final StdVideoDecodeH264PictureInfo ELEMENT_FACTORY = StdVideoDecodeH264PictureInfo.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / StdVideoDecodeH264PictureInfo.SIZEOF);
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
        public StdVideoDecodeH264PictureInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        public StdVideoDecodeH264PictureInfoFlags flags() {
            return StdVideoDecodeH264PictureInfo.nflags(address());
        }

        @NativeType("uint8_t")
        public byte seq_parameter_set_id() {
            return StdVideoDecodeH264PictureInfo.nseq_parameter_set_id(address());
        }

        @NativeType("uint8_t")
        public byte pic_parameter_set_id() {
            return StdVideoDecodeH264PictureInfo.npic_parameter_set_id(address());
        }

        @NativeType("uint16_t")
        public short frame_num() {
            return StdVideoDecodeH264PictureInfo.nframe_num(address());
        }

        @NativeType("uint16_t")
        public short idr_pic_id() {
            return StdVideoDecodeH264PictureInfo.nidr_pic_id(address());
        }

        @NativeType("int32_t[STD_VIDEO_DECODE_H264_FIELD_ORDER_COUNT_LIST_SIZE]")
        public IntBuffer PicOrderCnt() {
            return StdVideoDecodeH264PictureInfo.nPicOrderCnt(address());
        }

        @NativeType("int32_t")
        public int PicOrderCnt(int index) {
            return StdVideoDecodeH264PictureInfo.nPicOrderCnt(address(), index);
        }

        public Buffer flags(StdVideoDecodeH264PictureInfoFlags value) {
            StdVideoDecodeH264PictureInfo.nflags(address(), value);
            return this;
        }

        public Buffer flags(Consumer<StdVideoDecodeH264PictureInfoFlags> consumer) {
            consumer.accept(flags());
            return this;
        }

        public Buffer seq_parameter_set_id(@NativeType("uint8_t") byte value) {
            StdVideoDecodeH264PictureInfo.nseq_parameter_set_id(address(), value);
            return this;
        }

        public Buffer pic_parameter_set_id(@NativeType("uint8_t") byte value) {
            StdVideoDecodeH264PictureInfo.npic_parameter_set_id(address(), value);
            return this;
        }

        public Buffer frame_num(@NativeType("uint16_t") short value) {
            StdVideoDecodeH264PictureInfo.nframe_num(address(), value);
            return this;
        }

        public Buffer idr_pic_id(@NativeType("uint16_t") short value) {
            StdVideoDecodeH264PictureInfo.nidr_pic_id(address(), value);
            return this;
        }

        public Buffer PicOrderCnt(@NativeType("int32_t[STD_VIDEO_DECODE_H264_FIELD_ORDER_COUNT_LIST_SIZE]") IntBuffer value) {
            StdVideoDecodeH264PictureInfo.nPicOrderCnt(address(), value);
            return this;
        }

        public Buffer PicOrderCnt(int index, @NativeType("int32_t") int value) {
            StdVideoDecodeH264PictureInfo.nPicOrderCnt(address(), index, value);
            return this;
        }
    }
}
