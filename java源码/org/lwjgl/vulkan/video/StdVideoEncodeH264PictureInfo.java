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

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoEncodeH264PictureInfo.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoEncodeH264PictureInfo.class */
public class StdVideoEncodeH264PictureInfo extends Struct<StdVideoEncodeH264PictureInfo> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int FLAGS;
    public static final int SEQ_PARAMETER_SET_ID;
    public static final int PIC_PARAMETER_SET_ID;
    public static final int IDR_PIC_ID;
    public static final int PRIMARY_PIC_TYPE;
    public static final int FRAME_NUM;
    public static final int PICORDERCNT;
    public static final int TEMPORAL_ID;
    public static final int RESERVED1;
    public static final int PREFLISTS;

    static {
        Struct.Layout layout = __struct(__member(StdVideoEncodeH264PictureInfoFlags.SIZEOF, StdVideoEncodeH264PictureInfoFlags.ALIGNOF), __member(1), __member(1), __member(2), __member(4), __member(4), __member(4), __member(1), __array(1, 3), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        FLAGS = layout.offsetof(0);
        SEQ_PARAMETER_SET_ID = layout.offsetof(1);
        PIC_PARAMETER_SET_ID = layout.offsetof(2);
        IDR_PIC_ID = layout.offsetof(3);
        PRIMARY_PIC_TYPE = layout.offsetof(4);
        FRAME_NUM = layout.offsetof(5);
        PICORDERCNT = layout.offsetof(6);
        TEMPORAL_ID = layout.offsetof(7);
        RESERVED1 = layout.offsetof(8);
        PREFLISTS = layout.offsetof(9);
    }

    protected StdVideoEncodeH264PictureInfo(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public StdVideoEncodeH264PictureInfo create(long address, ByteBuffer container) {
        return new StdVideoEncodeH264PictureInfo(address, container);
    }

    public StdVideoEncodeH264PictureInfo(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    public StdVideoEncodeH264PictureInfoFlags flags() {
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
    public short idr_pic_id() {
        return nidr_pic_id(address());
    }

    @NativeType("StdVideoH264PictureType")
    public int primary_pic_type() {
        return nprimary_pic_type(address());
    }

    @NativeType("uint32_t")
    public int frame_num() {
        return nframe_num(address());
    }

    @NativeType("int32_t")
    public int PicOrderCnt() {
        return nPicOrderCnt(address());
    }

    @NativeType("uint8_t")
    public byte temporal_id() {
        return ntemporal_id(address());
    }

    @NativeType("StdVideoEncodeH264ReferenceListsInfo const *")
    public StdVideoEncodeH264ReferenceListsInfo pRefLists() {
        return npRefLists(address());
    }

    public StdVideoEncodeH264PictureInfo flags(StdVideoEncodeH264PictureInfoFlags value) {
        nflags(address(), value);
        return this;
    }

    public StdVideoEncodeH264PictureInfo flags(Consumer<StdVideoEncodeH264PictureInfoFlags> consumer) {
        consumer.accept(flags());
        return this;
    }

    public StdVideoEncodeH264PictureInfo seq_parameter_set_id(@NativeType("uint8_t") byte value) {
        nseq_parameter_set_id(address(), value);
        return this;
    }

    public StdVideoEncodeH264PictureInfo pic_parameter_set_id(@NativeType("uint8_t") byte value) {
        npic_parameter_set_id(address(), value);
        return this;
    }

    public StdVideoEncodeH264PictureInfo idr_pic_id(@NativeType("uint16_t") short value) {
        nidr_pic_id(address(), value);
        return this;
    }

    public StdVideoEncodeH264PictureInfo primary_pic_type(@NativeType("StdVideoH264PictureType") int value) {
        nprimary_pic_type(address(), value);
        return this;
    }

    public StdVideoEncodeH264PictureInfo frame_num(@NativeType("uint32_t") int value) {
        nframe_num(address(), value);
        return this;
    }

    public StdVideoEncodeH264PictureInfo PicOrderCnt(@NativeType("int32_t") int value) {
        nPicOrderCnt(address(), value);
        return this;
    }

    public StdVideoEncodeH264PictureInfo temporal_id(@NativeType("uint8_t") byte value) {
        ntemporal_id(address(), value);
        return this;
    }

    public StdVideoEncodeH264PictureInfo pRefLists(@NativeType("StdVideoEncodeH264ReferenceListsInfo const *") StdVideoEncodeH264ReferenceListsInfo value) {
        npRefLists(address(), value);
        return this;
    }

    public StdVideoEncodeH264PictureInfo set(StdVideoEncodeH264PictureInfoFlags flags, byte seq_parameter_set_id, byte pic_parameter_set_id, short idr_pic_id, int primary_pic_type, int frame_num, int PicOrderCnt, byte temporal_id, StdVideoEncodeH264ReferenceListsInfo pRefLists) {
        flags(flags);
        seq_parameter_set_id(seq_parameter_set_id);
        pic_parameter_set_id(pic_parameter_set_id);
        idr_pic_id(idr_pic_id);
        primary_pic_type(primary_pic_type);
        frame_num(frame_num);
        PicOrderCnt(PicOrderCnt);
        temporal_id(temporal_id);
        pRefLists(pRefLists);
        return this;
    }

    public StdVideoEncodeH264PictureInfo set(StdVideoEncodeH264PictureInfo src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static StdVideoEncodeH264PictureInfo malloc() {
        return new StdVideoEncodeH264PictureInfo(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static StdVideoEncodeH264PictureInfo calloc() {
        return new StdVideoEncodeH264PictureInfo(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static StdVideoEncodeH264PictureInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new StdVideoEncodeH264PictureInfo(MemoryUtil.memAddress(container), container);
    }

    public static StdVideoEncodeH264PictureInfo create(long address) {
        return new StdVideoEncodeH264PictureInfo(address, null);
    }

    public static StdVideoEncodeH264PictureInfo createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new StdVideoEncodeH264PictureInfo(address, null);
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

    public static StdVideoEncodeH264PictureInfo malloc(MemoryStack stack) {
        return new StdVideoEncodeH264PictureInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static StdVideoEncodeH264PictureInfo calloc(MemoryStack stack) {
        return new StdVideoEncodeH264PictureInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static StdVideoEncodeH264PictureInfoFlags nflags(long struct) {
        return StdVideoEncodeH264PictureInfoFlags.create(struct + FLAGS);
    }

    public static byte nseq_parameter_set_id(long struct) {
        return MemoryUtil.memGetByte(struct + SEQ_PARAMETER_SET_ID);
    }

    public static byte npic_parameter_set_id(long struct) {
        return MemoryUtil.memGetByte(struct + PIC_PARAMETER_SET_ID);
    }

    public static short nidr_pic_id(long struct) {
        return MemoryUtil.memGetShort(struct + IDR_PIC_ID);
    }

    public static int nprimary_pic_type(long struct) {
        return MemoryUtil.memGetInt(struct + PRIMARY_PIC_TYPE);
    }

    public static int nframe_num(long struct) {
        return MemoryUtil.memGetInt(struct + FRAME_NUM);
    }

    public static int nPicOrderCnt(long struct) {
        return MemoryUtil.memGetInt(struct + PICORDERCNT);
    }

    public static byte ntemporal_id(long struct) {
        return MemoryUtil.memGetByte(struct + TEMPORAL_ID);
    }

    public static ByteBuffer nreserved1(long struct) {
        return MemoryUtil.memByteBuffer(struct + RESERVED1, 3);
    }

    public static byte nreserved1(long struct, int index) {
        return MemoryUtil.memGetByte(struct + RESERVED1 + (Checks.check(index, 3) * 1));
    }

    public static StdVideoEncodeH264ReferenceListsInfo npRefLists(long struct) {
        return StdVideoEncodeH264ReferenceListsInfo.create(MemoryUtil.memGetAddress(struct + PREFLISTS));
    }

    public static void nflags(long struct, StdVideoEncodeH264PictureInfoFlags value) {
        MemoryUtil.memCopy(value.address(), struct + FLAGS, StdVideoEncodeH264PictureInfoFlags.SIZEOF);
    }

    public static void nseq_parameter_set_id(long struct, byte value) {
        MemoryUtil.memPutByte(struct + SEQ_PARAMETER_SET_ID, value);
    }

    public static void npic_parameter_set_id(long struct, byte value) {
        MemoryUtil.memPutByte(struct + PIC_PARAMETER_SET_ID, value);
    }

    public static void nidr_pic_id(long struct, short value) {
        MemoryUtil.memPutShort(struct + IDR_PIC_ID, value);
    }

    public static void nprimary_pic_type(long struct, int value) {
        MemoryUtil.memPutInt(struct + PRIMARY_PIC_TYPE, value);
    }

    public static void nframe_num(long struct, int value) {
        MemoryUtil.memPutInt(struct + FRAME_NUM, value);
    }

    public static void nPicOrderCnt(long struct, int value) {
        MemoryUtil.memPutInt(struct + PICORDERCNT, value);
    }

    public static void ntemporal_id(long struct, byte value) {
        MemoryUtil.memPutByte(struct + TEMPORAL_ID, value);
    }

    public static void nreserved1(long struct, ByteBuffer value) {
        if (Checks.CHECKS) {
            Checks.checkGT(value, 3);
        }
        MemoryUtil.memCopy(MemoryUtil.memAddress(value), struct + RESERVED1, value.remaining() * 1);
    }

    public static void nreserved1(long struct, int index, byte value) {
        MemoryUtil.memPutByte(struct + RESERVED1 + (Checks.check(index, 3) * 1), value);
    }

    public static void npRefLists(long struct, StdVideoEncodeH264ReferenceListsInfo value) {
        MemoryUtil.memPutAddress(struct + PREFLISTS, value.address());
    }

    public static void validate(long struct) {
        long pRefLists = MemoryUtil.memGetAddress(struct + PREFLISTS);
        Checks.check(pRefLists);
        StdVideoEncodeH264ReferenceListsInfo.validate(pRefLists);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoEncodeH264PictureInfo$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoEncodeH264PictureInfo$Buffer.class */
    public static class Buffer extends StructBuffer<StdVideoEncodeH264PictureInfo, Buffer> implements NativeResource {
        private static final StdVideoEncodeH264PictureInfo ELEMENT_FACTORY = StdVideoEncodeH264PictureInfo.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / StdVideoEncodeH264PictureInfo.SIZEOF);
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
        public StdVideoEncodeH264PictureInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        public StdVideoEncodeH264PictureInfoFlags flags() {
            return StdVideoEncodeH264PictureInfo.nflags(address());
        }

        @NativeType("uint8_t")
        public byte seq_parameter_set_id() {
            return StdVideoEncodeH264PictureInfo.nseq_parameter_set_id(address());
        }

        @NativeType("uint8_t")
        public byte pic_parameter_set_id() {
            return StdVideoEncodeH264PictureInfo.npic_parameter_set_id(address());
        }

        @NativeType("uint16_t")
        public short idr_pic_id() {
            return StdVideoEncodeH264PictureInfo.nidr_pic_id(address());
        }

        @NativeType("StdVideoH264PictureType")
        public int primary_pic_type() {
            return StdVideoEncodeH264PictureInfo.nprimary_pic_type(address());
        }

        @NativeType("uint32_t")
        public int frame_num() {
            return StdVideoEncodeH264PictureInfo.nframe_num(address());
        }

        @NativeType("int32_t")
        public int PicOrderCnt() {
            return StdVideoEncodeH264PictureInfo.nPicOrderCnt(address());
        }

        @NativeType("uint8_t")
        public byte temporal_id() {
            return StdVideoEncodeH264PictureInfo.ntemporal_id(address());
        }

        @NativeType("StdVideoEncodeH264ReferenceListsInfo const *")
        public StdVideoEncodeH264ReferenceListsInfo pRefLists() {
            return StdVideoEncodeH264PictureInfo.npRefLists(address());
        }

        public Buffer flags(StdVideoEncodeH264PictureInfoFlags value) {
            StdVideoEncodeH264PictureInfo.nflags(address(), value);
            return this;
        }

        public Buffer flags(Consumer<StdVideoEncodeH264PictureInfoFlags> consumer) {
            consumer.accept(flags());
            return this;
        }

        public Buffer seq_parameter_set_id(@NativeType("uint8_t") byte value) {
            StdVideoEncodeH264PictureInfo.nseq_parameter_set_id(address(), value);
            return this;
        }

        public Buffer pic_parameter_set_id(@NativeType("uint8_t") byte value) {
            StdVideoEncodeH264PictureInfo.npic_parameter_set_id(address(), value);
            return this;
        }

        public Buffer idr_pic_id(@NativeType("uint16_t") short value) {
            StdVideoEncodeH264PictureInfo.nidr_pic_id(address(), value);
            return this;
        }

        public Buffer primary_pic_type(@NativeType("StdVideoH264PictureType") int value) {
            StdVideoEncodeH264PictureInfo.nprimary_pic_type(address(), value);
            return this;
        }

        public Buffer frame_num(@NativeType("uint32_t") int value) {
            StdVideoEncodeH264PictureInfo.nframe_num(address(), value);
            return this;
        }

        public Buffer PicOrderCnt(@NativeType("int32_t") int value) {
            StdVideoEncodeH264PictureInfo.nPicOrderCnt(address(), value);
            return this;
        }

        public Buffer temporal_id(@NativeType("uint8_t") byte value) {
            StdVideoEncodeH264PictureInfo.ntemporal_id(address(), value);
            return this;
        }

        public Buffer pRefLists(@NativeType("StdVideoEncodeH264ReferenceListsInfo const *") StdVideoEncodeH264ReferenceListsInfo value) {
            StdVideoEncodeH264PictureInfo.npRefLists(address(), value);
            return this;
        }
    }
}
