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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoEncodeH265ReferenceInfo.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoEncodeH265ReferenceInfo.class */
public class StdVideoEncodeH265ReferenceInfo extends Struct<StdVideoEncodeH265ReferenceInfo> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int FLAGS;
    public static final int PIC_TYPE;
    public static final int PICORDERCNTVAL;
    public static final int TEMPORALID;

    static {
        Struct.Layout layout = __struct(__member(StdVideoEncodeH265ReferenceInfoFlags.SIZEOF, StdVideoEncodeH265ReferenceInfoFlags.ALIGNOF), __member(4), __member(4), __member(1));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        FLAGS = layout.offsetof(0);
        PIC_TYPE = layout.offsetof(1);
        PICORDERCNTVAL = layout.offsetof(2);
        TEMPORALID = layout.offsetof(3);
    }

    protected StdVideoEncodeH265ReferenceInfo(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public StdVideoEncodeH265ReferenceInfo create(long address, ByteBuffer container) {
        return new StdVideoEncodeH265ReferenceInfo(address, container);
    }

    public StdVideoEncodeH265ReferenceInfo(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    public StdVideoEncodeH265ReferenceInfoFlags flags() {
        return nflags(address());
    }

    @NativeType("StdVideoH265PictureType")
    public int pic_type() {
        return npic_type(address());
    }

    @NativeType("int32_t")
    public int PicOrderCntVal() {
        return nPicOrderCntVal(address());
    }

    @NativeType("uint8_t")
    public byte TemporalId() {
        return nTemporalId(address());
    }

    public StdVideoEncodeH265ReferenceInfo flags(StdVideoEncodeH265ReferenceInfoFlags value) {
        nflags(address(), value);
        return this;
    }

    public StdVideoEncodeH265ReferenceInfo flags(Consumer<StdVideoEncodeH265ReferenceInfoFlags> consumer) {
        consumer.accept(flags());
        return this;
    }

    public StdVideoEncodeH265ReferenceInfo pic_type(@NativeType("StdVideoH265PictureType") int value) {
        npic_type(address(), value);
        return this;
    }

    public StdVideoEncodeH265ReferenceInfo PicOrderCntVal(@NativeType("int32_t") int value) {
        nPicOrderCntVal(address(), value);
        return this;
    }

    public StdVideoEncodeH265ReferenceInfo TemporalId(@NativeType("uint8_t") byte value) {
        nTemporalId(address(), value);
        return this;
    }

    public StdVideoEncodeH265ReferenceInfo set(StdVideoEncodeH265ReferenceInfoFlags flags, int pic_type, int PicOrderCntVal, byte TemporalId) {
        flags(flags);
        pic_type(pic_type);
        PicOrderCntVal(PicOrderCntVal);
        TemporalId(TemporalId);
        return this;
    }

    public StdVideoEncodeH265ReferenceInfo set(StdVideoEncodeH265ReferenceInfo src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static StdVideoEncodeH265ReferenceInfo malloc() {
        return new StdVideoEncodeH265ReferenceInfo(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static StdVideoEncodeH265ReferenceInfo calloc() {
        return new StdVideoEncodeH265ReferenceInfo(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static StdVideoEncodeH265ReferenceInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new StdVideoEncodeH265ReferenceInfo(MemoryUtil.memAddress(container), container);
    }

    public static StdVideoEncodeH265ReferenceInfo create(long address) {
        return new StdVideoEncodeH265ReferenceInfo(address, null);
    }

    public static StdVideoEncodeH265ReferenceInfo createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new StdVideoEncodeH265ReferenceInfo(address, null);
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

    public static StdVideoEncodeH265ReferenceInfo malloc(MemoryStack stack) {
        return new StdVideoEncodeH265ReferenceInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static StdVideoEncodeH265ReferenceInfo calloc(MemoryStack stack) {
        return new StdVideoEncodeH265ReferenceInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static StdVideoEncodeH265ReferenceInfoFlags nflags(long struct) {
        return StdVideoEncodeH265ReferenceInfoFlags.create(struct + FLAGS);
    }

    public static int npic_type(long struct) {
        return MemoryUtil.memGetInt(struct + PIC_TYPE);
    }

    public static int nPicOrderCntVal(long struct) {
        return MemoryUtil.memGetInt(struct + PICORDERCNTVAL);
    }

    public static byte nTemporalId(long struct) {
        return MemoryUtil.memGetByte(struct + TEMPORALID);
    }

    public static void nflags(long struct, StdVideoEncodeH265ReferenceInfoFlags value) {
        MemoryUtil.memCopy(value.address(), struct + FLAGS, StdVideoEncodeH265ReferenceInfoFlags.SIZEOF);
    }

    public static void npic_type(long struct, int value) {
        MemoryUtil.memPutInt(struct + PIC_TYPE, value);
    }

    public static void nPicOrderCntVal(long struct, int value) {
        MemoryUtil.memPutInt(struct + PICORDERCNTVAL, value);
    }

    public static void nTemporalId(long struct, byte value) {
        MemoryUtil.memPutByte(struct + TEMPORALID, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoEncodeH265ReferenceInfo$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoEncodeH265ReferenceInfo$Buffer.class */
    public static class Buffer extends StructBuffer<StdVideoEncodeH265ReferenceInfo, Buffer> implements NativeResource {
        private static final StdVideoEncodeH265ReferenceInfo ELEMENT_FACTORY = StdVideoEncodeH265ReferenceInfo.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / StdVideoEncodeH265ReferenceInfo.SIZEOF);
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
        public StdVideoEncodeH265ReferenceInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        public StdVideoEncodeH265ReferenceInfoFlags flags() {
            return StdVideoEncodeH265ReferenceInfo.nflags(address());
        }

        @NativeType("StdVideoH265PictureType")
        public int pic_type() {
            return StdVideoEncodeH265ReferenceInfo.npic_type(address());
        }

        @NativeType("int32_t")
        public int PicOrderCntVal() {
            return StdVideoEncodeH265ReferenceInfo.nPicOrderCntVal(address());
        }

        @NativeType("uint8_t")
        public byte TemporalId() {
            return StdVideoEncodeH265ReferenceInfo.nTemporalId(address());
        }

        public Buffer flags(StdVideoEncodeH265ReferenceInfoFlags value) {
            StdVideoEncodeH265ReferenceInfo.nflags(address(), value);
            return this;
        }

        public Buffer flags(Consumer<StdVideoEncodeH265ReferenceInfoFlags> consumer) {
            consumer.accept(flags());
            return this;
        }

        public Buffer pic_type(@NativeType("StdVideoH265PictureType") int value) {
            StdVideoEncodeH265ReferenceInfo.npic_type(address(), value);
            return this;
        }

        public Buffer PicOrderCntVal(@NativeType("int32_t") int value) {
            StdVideoEncodeH265ReferenceInfo.nPicOrderCntVal(address(), value);
            return this;
        }

        public Buffer TemporalId(@NativeType("uint8_t") byte value) {
            StdVideoEncodeH265ReferenceInfo.nTemporalId(address(), value);
            return this;
        }
    }
}
