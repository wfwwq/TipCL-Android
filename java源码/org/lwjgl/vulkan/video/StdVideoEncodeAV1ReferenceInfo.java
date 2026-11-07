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

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoEncodeAV1ReferenceInfo.class */
public class StdVideoEncodeAV1ReferenceInfo extends Struct<StdVideoEncodeAV1ReferenceInfo> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int FLAGS;
    public static final int REFFRAMEID;
    public static final int FRAME_TYPE;
    public static final int ORDERHINT;
    public static final int RESERVED1;
    public static final int PEXTENSIONHEADER;

    static {
        Struct.Layout layout = __struct(__member(StdVideoEncodeAV1ReferenceInfoFlags.SIZEOF, StdVideoEncodeAV1ReferenceInfoFlags.ALIGNOF), __member(4), __member(4), __member(1), __array(1, 3), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        FLAGS = layout.offsetof(0);
        REFFRAMEID = layout.offsetof(1);
        FRAME_TYPE = layout.offsetof(2);
        ORDERHINT = layout.offsetof(3);
        RESERVED1 = layout.offsetof(4);
        PEXTENSIONHEADER = layout.offsetof(5);
    }

    protected StdVideoEncodeAV1ReferenceInfo(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public StdVideoEncodeAV1ReferenceInfo create(long address, ByteBuffer container) {
        return new StdVideoEncodeAV1ReferenceInfo(address, container);
    }

    public StdVideoEncodeAV1ReferenceInfo(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    public StdVideoEncodeAV1ReferenceInfoFlags flags() {
        return nflags(address());
    }

    @NativeType("uint32_t")
    public int RefFrameId() {
        return nRefFrameId(address());
    }

    @NativeType("StdVideoAV1FrameType")
    public int frame_type() {
        return nframe_type(address());
    }

    @NativeType("uint8_t")
    public byte OrderHint() {
        return nOrderHint(address());
    }

    @NativeType("StdVideoEncodeAV1ExtensionHeader const *")
    public StdVideoEncodeAV1ExtensionHeader pExtensionHeader() {
        return npExtensionHeader(address());
    }

    public StdVideoEncodeAV1ReferenceInfo flags(StdVideoEncodeAV1ReferenceInfoFlags value) {
        nflags(address(), value);
        return this;
    }

    public StdVideoEncodeAV1ReferenceInfo flags(Consumer<StdVideoEncodeAV1ReferenceInfoFlags> consumer) {
        consumer.accept(flags());
        return this;
    }

    public StdVideoEncodeAV1ReferenceInfo RefFrameId(@NativeType("uint32_t") int value) {
        nRefFrameId(address(), value);
        return this;
    }

    public StdVideoEncodeAV1ReferenceInfo frame_type(@NativeType("StdVideoAV1FrameType") int value) {
        nframe_type(address(), value);
        return this;
    }

    public StdVideoEncodeAV1ReferenceInfo OrderHint(@NativeType("uint8_t") byte value) {
        nOrderHint(address(), value);
        return this;
    }

    public StdVideoEncodeAV1ReferenceInfo pExtensionHeader(@NativeType("StdVideoEncodeAV1ExtensionHeader const *") StdVideoEncodeAV1ExtensionHeader value) {
        npExtensionHeader(address(), value);
        return this;
    }

    public StdVideoEncodeAV1ReferenceInfo set(StdVideoEncodeAV1ReferenceInfoFlags flags, int RefFrameId, int frame_type, byte OrderHint, StdVideoEncodeAV1ExtensionHeader pExtensionHeader) {
        flags(flags);
        RefFrameId(RefFrameId);
        frame_type(frame_type);
        OrderHint(OrderHint);
        pExtensionHeader(pExtensionHeader);
        return this;
    }

    public StdVideoEncodeAV1ReferenceInfo set(StdVideoEncodeAV1ReferenceInfo src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static StdVideoEncodeAV1ReferenceInfo malloc() {
        return new StdVideoEncodeAV1ReferenceInfo(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static StdVideoEncodeAV1ReferenceInfo calloc() {
        return new StdVideoEncodeAV1ReferenceInfo(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static StdVideoEncodeAV1ReferenceInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new StdVideoEncodeAV1ReferenceInfo(MemoryUtil.memAddress(container), container);
    }

    public static StdVideoEncodeAV1ReferenceInfo create(long address) {
        return new StdVideoEncodeAV1ReferenceInfo(address, null);
    }

    public static StdVideoEncodeAV1ReferenceInfo createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new StdVideoEncodeAV1ReferenceInfo(address, null);
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

    public static StdVideoEncodeAV1ReferenceInfo malloc(MemoryStack stack) {
        return new StdVideoEncodeAV1ReferenceInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static StdVideoEncodeAV1ReferenceInfo calloc(MemoryStack stack) {
        return new StdVideoEncodeAV1ReferenceInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static StdVideoEncodeAV1ReferenceInfoFlags nflags(long struct) {
        return StdVideoEncodeAV1ReferenceInfoFlags.create(struct + FLAGS);
    }

    public static int nRefFrameId(long struct) {
        return MemoryUtil.memGetInt(struct + REFFRAMEID);
    }

    public static int nframe_type(long struct) {
        return MemoryUtil.memGetInt(struct + FRAME_TYPE);
    }

    public static byte nOrderHint(long struct) {
        return MemoryUtil.memGetByte(struct + ORDERHINT);
    }

    public static ByteBuffer nreserved1(long struct) {
        return MemoryUtil.memByteBuffer(struct + RESERVED1, 3);
    }

    public static byte nreserved1(long struct, int index) {
        return MemoryUtil.memGetByte(struct + RESERVED1 + (Checks.check(index, 3) * 1));
    }

    public static StdVideoEncodeAV1ExtensionHeader npExtensionHeader(long struct) {
        return StdVideoEncodeAV1ExtensionHeader.create(MemoryUtil.memGetAddress(struct + PEXTENSIONHEADER));
    }

    public static void nflags(long struct, StdVideoEncodeAV1ReferenceInfoFlags value) {
        MemoryUtil.memCopy(value.address(), struct + FLAGS, StdVideoEncodeAV1ReferenceInfoFlags.SIZEOF);
    }

    public static void nRefFrameId(long struct, int value) {
        MemoryUtil.memPutInt(struct + REFFRAMEID, value);
    }

    public static void nframe_type(long struct, int value) {
        MemoryUtil.memPutInt(struct + FRAME_TYPE, value);
    }

    public static void nOrderHint(long struct, byte value) {
        MemoryUtil.memPutByte(struct + ORDERHINT, value);
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

    public static void npExtensionHeader(long struct, StdVideoEncodeAV1ExtensionHeader value) {
        MemoryUtil.memPutAddress(struct + PEXTENSIONHEADER, value.address());
    }

    public static void validate(long struct) {
        Checks.check(MemoryUtil.memGetAddress(struct + PEXTENSIONHEADER));
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/video/StdVideoEncodeAV1ReferenceInfo$Buffer.class */
    public static class Buffer extends StructBuffer<StdVideoEncodeAV1ReferenceInfo, Buffer> implements NativeResource {
        private static final StdVideoEncodeAV1ReferenceInfo ELEMENT_FACTORY = StdVideoEncodeAV1ReferenceInfo.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / StdVideoEncodeAV1ReferenceInfo.SIZEOF);
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
        public StdVideoEncodeAV1ReferenceInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        public StdVideoEncodeAV1ReferenceInfoFlags flags() {
            return StdVideoEncodeAV1ReferenceInfo.nflags(address());
        }

        @NativeType("uint32_t")
        public int RefFrameId() {
            return StdVideoEncodeAV1ReferenceInfo.nRefFrameId(address());
        }

        @NativeType("StdVideoAV1FrameType")
        public int frame_type() {
            return StdVideoEncodeAV1ReferenceInfo.nframe_type(address());
        }

        @NativeType("uint8_t")
        public byte OrderHint() {
            return StdVideoEncodeAV1ReferenceInfo.nOrderHint(address());
        }

        @NativeType("StdVideoEncodeAV1ExtensionHeader const *")
        public StdVideoEncodeAV1ExtensionHeader pExtensionHeader() {
            return StdVideoEncodeAV1ReferenceInfo.npExtensionHeader(address());
        }

        public Buffer flags(StdVideoEncodeAV1ReferenceInfoFlags value) {
            StdVideoEncodeAV1ReferenceInfo.nflags(address(), value);
            return this;
        }

        public Buffer flags(Consumer<StdVideoEncodeAV1ReferenceInfoFlags> consumer) {
            consumer.accept(flags());
            return this;
        }

        public Buffer RefFrameId(@NativeType("uint32_t") int value) {
            StdVideoEncodeAV1ReferenceInfo.nRefFrameId(address(), value);
            return this;
        }

        public Buffer frame_type(@NativeType("StdVideoAV1FrameType") int value) {
            StdVideoEncodeAV1ReferenceInfo.nframe_type(address(), value);
            return this;
        }

        public Buffer OrderHint(@NativeType("uint8_t") byte value) {
            StdVideoEncodeAV1ReferenceInfo.nOrderHint(address(), value);
            return this;
        }

        public Buffer pExtensionHeader(@NativeType("StdVideoEncodeAV1ExtensionHeader const *") StdVideoEncodeAV1ExtensionHeader value) {
            StdVideoEncodeAV1ReferenceInfo.npExtensionHeader(address(), value);
            return this;
        }
    }
}
