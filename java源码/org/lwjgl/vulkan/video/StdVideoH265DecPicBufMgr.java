package org.lwjgl.vulkan.video;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.Checks;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoH265DecPicBufMgr.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoH265DecPicBufMgr.class */
public class StdVideoH265DecPicBufMgr extends Struct<StdVideoH265DecPicBufMgr> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int MAX_LATENCY_INCREASE_PLUS1;
    public static final int MAX_DEC_PIC_BUFFERING_MINUS1;
    public static final int MAX_NUM_REORDER_PICS;

    static {
        Struct.Layout layout = __struct(__array(4, 7), __array(1, 7), __array(1, 7));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        MAX_LATENCY_INCREASE_PLUS1 = layout.offsetof(0);
        MAX_DEC_PIC_BUFFERING_MINUS1 = layout.offsetof(1);
        MAX_NUM_REORDER_PICS = layout.offsetof(2);
    }

    protected StdVideoH265DecPicBufMgr(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public StdVideoH265DecPicBufMgr create(long address, ByteBuffer container) {
        return new StdVideoH265DecPicBufMgr(address, container);
    }

    public StdVideoH265DecPicBufMgr(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("uint32_t[STD_VIDEO_H265_SUBLAYERS_LIST_SIZE]")
    public IntBuffer max_latency_increase_plus1() {
        return nmax_latency_increase_plus1(address());
    }

    @NativeType("uint32_t")
    public int max_latency_increase_plus1(int index) {
        return nmax_latency_increase_plus1(address(), index);
    }

    @NativeType("uint8_t[STD_VIDEO_H265_SUBLAYERS_LIST_SIZE]")
    public ByteBuffer max_dec_pic_buffering_minus1() {
        return nmax_dec_pic_buffering_minus1(address());
    }

    @NativeType("uint8_t")
    public byte max_dec_pic_buffering_minus1(int index) {
        return nmax_dec_pic_buffering_minus1(address(), index);
    }

    @NativeType("uint8_t[STD_VIDEO_H265_SUBLAYERS_LIST_SIZE]")
    public ByteBuffer max_num_reorder_pics() {
        return nmax_num_reorder_pics(address());
    }

    @NativeType("uint8_t")
    public byte max_num_reorder_pics(int index) {
        return nmax_num_reorder_pics(address(), index);
    }

    public StdVideoH265DecPicBufMgr max_latency_increase_plus1(@NativeType("uint32_t[STD_VIDEO_H265_SUBLAYERS_LIST_SIZE]") IntBuffer value) {
        nmax_latency_increase_plus1(address(), value);
        return this;
    }

    public StdVideoH265DecPicBufMgr max_latency_increase_plus1(int index, @NativeType("uint32_t") int value) {
        nmax_latency_increase_plus1(address(), index, value);
        return this;
    }

    public StdVideoH265DecPicBufMgr max_dec_pic_buffering_minus1(@NativeType("uint8_t[STD_VIDEO_H265_SUBLAYERS_LIST_SIZE]") ByteBuffer value) {
        nmax_dec_pic_buffering_minus1(address(), value);
        return this;
    }

    public StdVideoH265DecPicBufMgr max_dec_pic_buffering_minus1(int index, @NativeType("uint8_t") byte value) {
        nmax_dec_pic_buffering_minus1(address(), index, value);
        return this;
    }

    public StdVideoH265DecPicBufMgr max_num_reorder_pics(@NativeType("uint8_t[STD_VIDEO_H265_SUBLAYERS_LIST_SIZE]") ByteBuffer value) {
        nmax_num_reorder_pics(address(), value);
        return this;
    }

    public StdVideoH265DecPicBufMgr max_num_reorder_pics(int index, @NativeType("uint8_t") byte value) {
        nmax_num_reorder_pics(address(), index, value);
        return this;
    }

    public StdVideoH265DecPicBufMgr set(IntBuffer max_latency_increase_plus1, ByteBuffer max_dec_pic_buffering_minus1, ByteBuffer max_num_reorder_pics) {
        max_latency_increase_plus1(max_latency_increase_plus1);
        max_dec_pic_buffering_minus1(max_dec_pic_buffering_minus1);
        max_num_reorder_pics(max_num_reorder_pics);
        return this;
    }

    public StdVideoH265DecPicBufMgr set(StdVideoH265DecPicBufMgr src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static StdVideoH265DecPicBufMgr malloc() {
        return new StdVideoH265DecPicBufMgr(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static StdVideoH265DecPicBufMgr calloc() {
        return new StdVideoH265DecPicBufMgr(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static StdVideoH265DecPicBufMgr create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new StdVideoH265DecPicBufMgr(MemoryUtil.memAddress(container), container);
    }

    public static StdVideoH265DecPicBufMgr create(long address) {
        return new StdVideoH265DecPicBufMgr(address, null);
    }

    public static StdVideoH265DecPicBufMgr createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new StdVideoH265DecPicBufMgr(address, null);
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

    public static StdVideoH265DecPicBufMgr malloc(MemoryStack stack) {
        return new StdVideoH265DecPicBufMgr(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static StdVideoH265DecPicBufMgr calloc(MemoryStack stack) {
        return new StdVideoH265DecPicBufMgr(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static IntBuffer nmax_latency_increase_plus1(long struct) {
        return MemoryUtil.memIntBuffer(struct + MAX_LATENCY_INCREASE_PLUS1, 7);
    }

    public static int nmax_latency_increase_plus1(long struct, int index) {
        return MemoryUtil.memGetInt(struct + MAX_LATENCY_INCREASE_PLUS1 + (Checks.check(index, 7) * 4));
    }

    public static ByteBuffer nmax_dec_pic_buffering_minus1(long struct) {
        return MemoryUtil.memByteBuffer(struct + MAX_DEC_PIC_BUFFERING_MINUS1, 7);
    }

    public static byte nmax_dec_pic_buffering_minus1(long struct, int index) {
        return MemoryUtil.memGetByte(struct + MAX_DEC_PIC_BUFFERING_MINUS1 + (Checks.check(index, 7) * 1));
    }

    public static ByteBuffer nmax_num_reorder_pics(long struct) {
        return MemoryUtil.memByteBuffer(struct + MAX_NUM_REORDER_PICS, 7);
    }

    public static byte nmax_num_reorder_pics(long struct, int index) {
        return MemoryUtil.memGetByte(struct + MAX_NUM_REORDER_PICS + (Checks.check(index, 7) * 1));
    }

    public static void nmax_latency_increase_plus1(long struct, IntBuffer value) {
        if (Checks.CHECKS) {
            Checks.checkGT(value, 7);
        }
        MemoryUtil.memCopy(MemoryUtil.memAddress(value), struct + MAX_LATENCY_INCREASE_PLUS1, value.remaining() * 4);
    }

    public static void nmax_latency_increase_plus1(long struct, int index, int value) {
        MemoryUtil.memPutInt(struct + MAX_LATENCY_INCREASE_PLUS1 + (Checks.check(index, 7) * 4), value);
    }

    public static void nmax_dec_pic_buffering_minus1(long struct, ByteBuffer value) {
        if (Checks.CHECKS) {
            Checks.checkGT(value, 7);
        }
        MemoryUtil.memCopy(MemoryUtil.memAddress(value), struct + MAX_DEC_PIC_BUFFERING_MINUS1, value.remaining() * 1);
    }

    public static void nmax_dec_pic_buffering_minus1(long struct, int index, byte value) {
        MemoryUtil.memPutByte(struct + MAX_DEC_PIC_BUFFERING_MINUS1 + (Checks.check(index, 7) * 1), value);
    }

    public static void nmax_num_reorder_pics(long struct, ByteBuffer value) {
        if (Checks.CHECKS) {
            Checks.checkGT(value, 7);
        }
        MemoryUtil.memCopy(MemoryUtil.memAddress(value), struct + MAX_NUM_REORDER_PICS, value.remaining() * 1);
    }

    public static void nmax_num_reorder_pics(long struct, int index, byte value) {
        MemoryUtil.memPutByte(struct + MAX_NUM_REORDER_PICS + (Checks.check(index, 7) * 1), value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoH265DecPicBufMgr$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoH265DecPicBufMgr$Buffer.class */
    public static class Buffer extends StructBuffer<StdVideoH265DecPicBufMgr, Buffer> implements NativeResource {
        private static final StdVideoH265DecPicBufMgr ELEMENT_FACTORY = StdVideoH265DecPicBufMgr.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / StdVideoH265DecPicBufMgr.SIZEOF);
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
        public StdVideoH265DecPicBufMgr getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("uint32_t[STD_VIDEO_H265_SUBLAYERS_LIST_SIZE]")
        public IntBuffer max_latency_increase_plus1() {
            return StdVideoH265DecPicBufMgr.nmax_latency_increase_plus1(address());
        }

        @NativeType("uint32_t")
        public int max_latency_increase_plus1(int index) {
            return StdVideoH265DecPicBufMgr.nmax_latency_increase_plus1(address(), index);
        }

        @NativeType("uint8_t[STD_VIDEO_H265_SUBLAYERS_LIST_SIZE]")
        public ByteBuffer max_dec_pic_buffering_minus1() {
            return StdVideoH265DecPicBufMgr.nmax_dec_pic_buffering_minus1(address());
        }

        @NativeType("uint8_t")
        public byte max_dec_pic_buffering_minus1(int index) {
            return StdVideoH265DecPicBufMgr.nmax_dec_pic_buffering_minus1(address(), index);
        }

        @NativeType("uint8_t[STD_VIDEO_H265_SUBLAYERS_LIST_SIZE]")
        public ByteBuffer max_num_reorder_pics() {
            return StdVideoH265DecPicBufMgr.nmax_num_reorder_pics(address());
        }

        @NativeType("uint8_t")
        public byte max_num_reorder_pics(int index) {
            return StdVideoH265DecPicBufMgr.nmax_num_reorder_pics(address(), index);
        }

        public Buffer max_latency_increase_plus1(@NativeType("uint32_t[STD_VIDEO_H265_SUBLAYERS_LIST_SIZE]") IntBuffer value) {
            StdVideoH265DecPicBufMgr.nmax_latency_increase_plus1(address(), value);
            return this;
        }

        public Buffer max_latency_increase_plus1(int index, @NativeType("uint32_t") int value) {
            StdVideoH265DecPicBufMgr.nmax_latency_increase_plus1(address(), index, value);
            return this;
        }

        public Buffer max_dec_pic_buffering_minus1(@NativeType("uint8_t[STD_VIDEO_H265_SUBLAYERS_LIST_SIZE]") ByteBuffer value) {
            StdVideoH265DecPicBufMgr.nmax_dec_pic_buffering_minus1(address(), value);
            return this;
        }

        public Buffer max_dec_pic_buffering_minus1(int index, @NativeType("uint8_t") byte value) {
            StdVideoH265DecPicBufMgr.nmax_dec_pic_buffering_minus1(address(), index, value);
            return this;
        }

        public Buffer max_num_reorder_pics(@NativeType("uint8_t[STD_VIDEO_H265_SUBLAYERS_LIST_SIZE]") ByteBuffer value) {
            StdVideoH265DecPicBufMgr.nmax_num_reorder_pics(address(), value);
            return this;
        }

        public Buffer max_num_reorder_pics(int index, @NativeType("uint8_t") byte value) {
            StdVideoH265DecPicBufMgr.nmax_num_reorder_pics(address(), index, value);
            return this;
        }
    }
}
