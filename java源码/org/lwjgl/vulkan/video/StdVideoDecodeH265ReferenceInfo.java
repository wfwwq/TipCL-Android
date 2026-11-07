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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoDecodeH265ReferenceInfo.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoDecodeH265ReferenceInfo.class */
public class StdVideoDecodeH265ReferenceInfo extends Struct<StdVideoDecodeH265ReferenceInfo> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int FLAGS;
    public static final int PICORDERCNTVAL;

    static {
        Struct.Layout layout = __struct(__member(StdVideoDecodeH265ReferenceInfoFlags.SIZEOF, StdVideoDecodeH265ReferenceInfoFlags.ALIGNOF), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        FLAGS = layout.offsetof(0);
        PICORDERCNTVAL = layout.offsetof(1);
    }

    protected StdVideoDecodeH265ReferenceInfo(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public StdVideoDecodeH265ReferenceInfo create(long address, ByteBuffer container) {
        return new StdVideoDecodeH265ReferenceInfo(address, container);
    }

    public StdVideoDecodeH265ReferenceInfo(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    public StdVideoDecodeH265ReferenceInfoFlags flags() {
        return nflags(address());
    }

    @NativeType("int32_t")
    public int PicOrderCntVal() {
        return nPicOrderCntVal(address());
    }

    public StdVideoDecodeH265ReferenceInfo flags(StdVideoDecodeH265ReferenceInfoFlags value) {
        nflags(address(), value);
        return this;
    }

    public StdVideoDecodeH265ReferenceInfo flags(Consumer<StdVideoDecodeH265ReferenceInfoFlags> consumer) {
        consumer.accept(flags());
        return this;
    }

    public StdVideoDecodeH265ReferenceInfo PicOrderCntVal(@NativeType("int32_t") int value) {
        nPicOrderCntVal(address(), value);
        return this;
    }

    public StdVideoDecodeH265ReferenceInfo set(StdVideoDecodeH265ReferenceInfoFlags flags, int PicOrderCntVal) {
        flags(flags);
        PicOrderCntVal(PicOrderCntVal);
        return this;
    }

    public StdVideoDecodeH265ReferenceInfo set(StdVideoDecodeH265ReferenceInfo src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static StdVideoDecodeH265ReferenceInfo malloc() {
        return new StdVideoDecodeH265ReferenceInfo(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static StdVideoDecodeH265ReferenceInfo calloc() {
        return new StdVideoDecodeH265ReferenceInfo(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static StdVideoDecodeH265ReferenceInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new StdVideoDecodeH265ReferenceInfo(MemoryUtil.memAddress(container), container);
    }

    public static StdVideoDecodeH265ReferenceInfo create(long address) {
        return new StdVideoDecodeH265ReferenceInfo(address, null);
    }

    public static StdVideoDecodeH265ReferenceInfo createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new StdVideoDecodeH265ReferenceInfo(address, null);
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

    public static StdVideoDecodeH265ReferenceInfo malloc(MemoryStack stack) {
        return new StdVideoDecodeH265ReferenceInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static StdVideoDecodeH265ReferenceInfo calloc(MemoryStack stack) {
        return new StdVideoDecodeH265ReferenceInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static StdVideoDecodeH265ReferenceInfoFlags nflags(long struct) {
        return StdVideoDecodeH265ReferenceInfoFlags.create(struct + FLAGS);
    }

    public static int nPicOrderCntVal(long struct) {
        return MemoryUtil.memGetInt(struct + PICORDERCNTVAL);
    }

    public static void nflags(long struct, StdVideoDecodeH265ReferenceInfoFlags value) {
        MemoryUtil.memCopy(value.address(), struct + FLAGS, StdVideoDecodeH265ReferenceInfoFlags.SIZEOF);
    }

    public static void nPicOrderCntVal(long struct, int value) {
        MemoryUtil.memPutInt(struct + PICORDERCNTVAL, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoDecodeH265ReferenceInfo$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoDecodeH265ReferenceInfo$Buffer.class */
    public static class Buffer extends StructBuffer<StdVideoDecodeH265ReferenceInfo, Buffer> implements NativeResource {
        private static final StdVideoDecodeH265ReferenceInfo ELEMENT_FACTORY = StdVideoDecodeH265ReferenceInfo.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / StdVideoDecodeH265ReferenceInfo.SIZEOF);
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
        public StdVideoDecodeH265ReferenceInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        public StdVideoDecodeH265ReferenceInfoFlags flags() {
            return StdVideoDecodeH265ReferenceInfo.nflags(address());
        }

        @NativeType("int32_t")
        public int PicOrderCntVal() {
            return StdVideoDecodeH265ReferenceInfo.nPicOrderCntVal(address());
        }

        public Buffer flags(StdVideoDecodeH265ReferenceInfoFlags value) {
            StdVideoDecodeH265ReferenceInfo.nflags(address(), value);
            return this;
        }

        public Buffer flags(Consumer<StdVideoDecodeH265ReferenceInfoFlags> consumer) {
            consumer.accept(flags());
            return this;
        }

        public Buffer PicOrderCntVal(@NativeType("int32_t") int value) {
            StdVideoDecodeH265ReferenceInfo.nPicOrderCntVal(address(), value);
            return this;
        }
    }
}
