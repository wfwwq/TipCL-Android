package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.Checks;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;
import org.lwjgl.vulkan.video.StdVideoEncodeH265SliceSegmentHeader;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoEncodeH265NaluSliceSegmentInfoKHR.class */
public class VkVideoEncodeH265NaluSliceSegmentInfoKHR extends Struct<VkVideoEncodeH265NaluSliceSegmentInfoKHR> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int CONSTANTQP;
    public static final int PSTDSLICESEGMENTHEADER;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        CONSTANTQP = layout.offsetof(2);
        PSTDSLICESEGMENTHEADER = layout.offsetof(3);
    }

    protected VkVideoEncodeH265NaluSliceSegmentInfoKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkVideoEncodeH265NaluSliceSegmentInfoKHR create(long address, ByteBuffer container) {
        return new VkVideoEncodeH265NaluSliceSegmentInfoKHR(address, container);
    }

    public VkVideoEncodeH265NaluSliceSegmentInfoKHR(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("VkStructureType")
    public int sType() {
        return nsType(address());
    }

    @NativeType("void const *")
    public long pNext() {
        return npNext(address());
    }

    @NativeType("int32_t")
    public int constantQp() {
        return nconstantQp(address());
    }

    @NativeType("StdVideoEncodeH265SliceSegmentHeader const *")
    public StdVideoEncodeH265SliceSegmentHeader pStdSliceSegmentHeader() {
        return npStdSliceSegmentHeader(address());
    }

    public VkVideoEncodeH265NaluSliceSegmentInfoKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkVideoEncodeH265NaluSliceSegmentInfoKHR sType$Default() {
        return sType(1000039005);
    }

    public VkVideoEncodeH265NaluSliceSegmentInfoKHR pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkVideoEncodeH265NaluSliceSegmentInfoKHR constantQp(@NativeType("int32_t") int value) {
        nconstantQp(address(), value);
        return this;
    }

    public VkVideoEncodeH265NaluSliceSegmentInfoKHR pStdSliceSegmentHeader(@NativeType("StdVideoEncodeH265SliceSegmentHeader const *") StdVideoEncodeH265SliceSegmentHeader value) {
        npStdSliceSegmentHeader(address(), value);
        return this;
    }

    public VkVideoEncodeH265NaluSliceSegmentInfoKHR set(int sType, long pNext, int constantQp, StdVideoEncodeH265SliceSegmentHeader pStdSliceSegmentHeader) {
        sType(sType);
        pNext(pNext);
        constantQp(constantQp);
        pStdSliceSegmentHeader(pStdSliceSegmentHeader);
        return this;
    }

    public VkVideoEncodeH265NaluSliceSegmentInfoKHR set(VkVideoEncodeH265NaluSliceSegmentInfoKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkVideoEncodeH265NaluSliceSegmentInfoKHR malloc() {
        return new VkVideoEncodeH265NaluSliceSegmentInfoKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkVideoEncodeH265NaluSliceSegmentInfoKHR calloc() {
        return new VkVideoEncodeH265NaluSliceSegmentInfoKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkVideoEncodeH265NaluSliceSegmentInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkVideoEncodeH265NaluSliceSegmentInfoKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkVideoEncodeH265NaluSliceSegmentInfoKHR create(long address) {
        return new VkVideoEncodeH265NaluSliceSegmentInfoKHR(address, null);
    }

    public static VkVideoEncodeH265NaluSliceSegmentInfoKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkVideoEncodeH265NaluSliceSegmentInfoKHR(address, null);
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

    public static VkVideoEncodeH265NaluSliceSegmentInfoKHR malloc(MemoryStack stack) {
        return new VkVideoEncodeH265NaluSliceSegmentInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkVideoEncodeH265NaluSliceSegmentInfoKHR calloc(MemoryStack stack) {
        return new VkVideoEncodeH265NaluSliceSegmentInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static int nsType(long struct) {
        return MemoryUtil.memGetInt(struct + STYPE);
    }

    public static long npNext(long struct) {
        return MemoryUtil.memGetAddress(struct + PNEXT);
    }

    public static int nconstantQp(long struct) {
        return MemoryUtil.memGetInt(struct + CONSTANTQP);
    }

    public static StdVideoEncodeH265SliceSegmentHeader npStdSliceSegmentHeader(long struct) {
        return StdVideoEncodeH265SliceSegmentHeader.create(MemoryUtil.memGetAddress(struct + PSTDSLICESEGMENTHEADER));
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nconstantQp(long struct, int value) {
        MemoryUtil.memPutInt(struct + CONSTANTQP, value);
    }

    public static void npStdSliceSegmentHeader(long struct, StdVideoEncodeH265SliceSegmentHeader value) {
        MemoryUtil.memPutAddress(struct + PSTDSLICESEGMENTHEADER, value.address());
    }

    public static void validate(long struct) {
        long pStdSliceSegmentHeader = MemoryUtil.memGetAddress(struct + PSTDSLICESEGMENTHEADER);
        Checks.check(pStdSliceSegmentHeader);
        StdVideoEncodeH265SliceSegmentHeader.validate(pStdSliceSegmentHeader);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoEncodeH265NaluSliceSegmentInfoKHR$Buffer.class */
    public static class Buffer extends StructBuffer<VkVideoEncodeH265NaluSliceSegmentInfoKHR, Buffer> implements NativeResource {
        private static final VkVideoEncodeH265NaluSliceSegmentInfoKHR ELEMENT_FACTORY = VkVideoEncodeH265NaluSliceSegmentInfoKHR.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkVideoEncodeH265NaluSliceSegmentInfoKHR.SIZEOF);
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
        public VkVideoEncodeH265NaluSliceSegmentInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkVideoEncodeH265NaluSliceSegmentInfoKHR.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkVideoEncodeH265NaluSliceSegmentInfoKHR.npNext(address());
        }

        @NativeType("int32_t")
        public int constantQp() {
            return VkVideoEncodeH265NaluSliceSegmentInfoKHR.nconstantQp(address());
        }

        @NativeType("StdVideoEncodeH265SliceSegmentHeader const *")
        public StdVideoEncodeH265SliceSegmentHeader pStdSliceSegmentHeader() {
            return VkVideoEncodeH265NaluSliceSegmentInfoKHR.npStdSliceSegmentHeader(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkVideoEncodeH265NaluSliceSegmentInfoKHR.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000039005);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkVideoEncodeH265NaluSliceSegmentInfoKHR.npNext(address(), value);
            return this;
        }

        public Buffer constantQp(@NativeType("int32_t") int value) {
            VkVideoEncodeH265NaluSliceSegmentInfoKHR.nconstantQp(address(), value);
            return this;
        }

        public Buffer pStdSliceSegmentHeader(@NativeType("StdVideoEncodeH265SliceSegmentHeader const *") StdVideoEncodeH265SliceSegmentHeader value) {
            VkVideoEncodeH265NaluSliceSegmentInfoKHR.npStdSliceSegmentHeader(address(), value);
            return this;
        }
    }
}
