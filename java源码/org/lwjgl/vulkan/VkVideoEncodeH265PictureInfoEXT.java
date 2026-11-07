package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import javax.annotation.Nullable;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.Checks;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;
import org.lwjgl.vulkan.VkVideoEncodeH265NaluSliceSegmentInfoEXT;
import org.lwjgl.vulkan.video.StdVideoEncodeH265PictureInfo;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoEncodeH265PictureInfoEXT.class */
public class VkVideoEncodeH265PictureInfoEXT extends Struct<VkVideoEncodeH265PictureInfoEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int NALUSLICESEGMENTENTRYCOUNT;
    public static final int PNALUSLICESEGMENTENTRIES;
    public static final int PSTDPICTUREINFO;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(POINTER_SIZE), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        NALUSLICESEGMENTENTRYCOUNT = layout.offsetof(2);
        PNALUSLICESEGMENTENTRIES = layout.offsetof(3);
        PSTDPICTUREINFO = layout.offsetof(4);
    }

    protected VkVideoEncodeH265PictureInfoEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkVideoEncodeH265PictureInfoEXT create(long address, @Nullable ByteBuffer container) {
        return new VkVideoEncodeH265PictureInfoEXT(address, container);
    }

    public VkVideoEncodeH265PictureInfoEXT(ByteBuffer container) {
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

    @NativeType("uint32_t")
    public int naluSliceSegmentEntryCount() {
        return nnaluSliceSegmentEntryCount(address());
    }

    @NativeType("VkVideoEncodeH265NaluSliceSegmentInfoEXT const *")
    public VkVideoEncodeH265NaluSliceSegmentInfoEXT.Buffer pNaluSliceSegmentEntries() {
        return npNaluSliceSegmentEntries(address());
    }

    @NativeType("StdVideoEncodeH265PictureInfo const *")
    public StdVideoEncodeH265PictureInfo pStdPictureInfo() {
        return npStdPictureInfo(address());
    }

    public VkVideoEncodeH265PictureInfoEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkVideoEncodeH265PictureInfoEXT sType$Default() {
        return sType(1000039003);
    }

    public VkVideoEncodeH265PictureInfoEXT pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkVideoEncodeH265PictureInfoEXT pNaluSliceSegmentEntries(@NativeType("VkVideoEncodeH265NaluSliceSegmentInfoEXT const *") VkVideoEncodeH265NaluSliceSegmentInfoEXT.Buffer value) {
        npNaluSliceSegmentEntries(address(), value);
        return this;
    }

    public VkVideoEncodeH265PictureInfoEXT pStdPictureInfo(@NativeType("StdVideoEncodeH265PictureInfo const *") StdVideoEncodeH265PictureInfo value) {
        npStdPictureInfo(address(), value);
        return this;
    }

    public VkVideoEncodeH265PictureInfoEXT set(int sType, long pNext, VkVideoEncodeH265NaluSliceSegmentInfoEXT.Buffer pNaluSliceSegmentEntries, StdVideoEncodeH265PictureInfo pStdPictureInfo) {
        sType(sType);
        pNext(pNext);
        pNaluSliceSegmentEntries(pNaluSliceSegmentEntries);
        pStdPictureInfo(pStdPictureInfo);
        return this;
    }

    public VkVideoEncodeH265PictureInfoEXT set(VkVideoEncodeH265PictureInfoEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkVideoEncodeH265PictureInfoEXT malloc() {
        return new VkVideoEncodeH265PictureInfoEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkVideoEncodeH265PictureInfoEXT calloc() {
        return new VkVideoEncodeH265PictureInfoEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkVideoEncodeH265PictureInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkVideoEncodeH265PictureInfoEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkVideoEncodeH265PictureInfoEXT create(long address) {
        return new VkVideoEncodeH265PictureInfoEXT(address, null);
    }

    @Nullable
    public static VkVideoEncodeH265PictureInfoEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkVideoEncodeH265PictureInfoEXT(address, null);
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

    @Nullable
    public static Buffer createSafe(long address, int capacity) {
        if (address == 0) {
            return null;
        }
        return new Buffer(address, capacity);
    }

    public static VkVideoEncodeH265PictureInfoEXT malloc(MemoryStack stack) {
        return new VkVideoEncodeH265PictureInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkVideoEncodeH265PictureInfoEXT calloc(MemoryStack stack) {
        return new VkVideoEncodeH265PictureInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static int nsType(long struct) {
        return UNSAFE.getInt((Object) null, struct + STYPE);
    }

    public static long npNext(long struct) {
        return MemoryUtil.memGetAddress(struct + PNEXT);
    }

    public static int nnaluSliceSegmentEntryCount(long struct) {
        return UNSAFE.getInt((Object) null, struct + NALUSLICESEGMENTENTRYCOUNT);
    }

    public static VkVideoEncodeH265NaluSliceSegmentInfoEXT.Buffer npNaluSliceSegmentEntries(long struct) {
        return VkVideoEncodeH265NaluSliceSegmentInfoEXT.create(MemoryUtil.memGetAddress(struct + PNALUSLICESEGMENTENTRIES), nnaluSliceSegmentEntryCount(struct));
    }

    public static StdVideoEncodeH265PictureInfo npStdPictureInfo(long struct) {
        return StdVideoEncodeH265PictureInfo.create(MemoryUtil.memGetAddress(struct + PSTDPICTUREINFO));
    }

    public static void nsType(long struct, int value) {
        UNSAFE.putInt((Object) null, struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nnaluSliceSegmentEntryCount(long struct, int value) {
        UNSAFE.putInt((Object) null, struct + NALUSLICESEGMENTENTRYCOUNT, value);
    }

    public static void npNaluSliceSegmentEntries(long struct, VkVideoEncodeH265NaluSliceSegmentInfoEXT.Buffer value) {
        MemoryUtil.memPutAddress(struct + PNALUSLICESEGMENTENTRIES, value.address());
        nnaluSliceSegmentEntryCount(struct, value.remaining());
    }

    public static void npStdPictureInfo(long struct, StdVideoEncodeH265PictureInfo value) {
        MemoryUtil.memPutAddress(struct + PSTDPICTUREINFO, value.address());
    }

    public static void validate(long struct) {
        int naluSliceSegmentEntryCount = nnaluSliceSegmentEntryCount(struct);
        long pNaluSliceSegmentEntries = MemoryUtil.memGetAddress(struct + PNALUSLICESEGMENTENTRIES);
        Checks.check(pNaluSliceSegmentEntries);
        validate(pNaluSliceSegmentEntries, naluSliceSegmentEntryCount, VkVideoEncodeH265NaluSliceSegmentInfoEXT.SIZEOF, VkVideoEncodeH265NaluSliceSegmentInfoEXT::validate);
        long pStdPictureInfo = MemoryUtil.memGetAddress(struct + PSTDPICTUREINFO);
        Checks.check(pStdPictureInfo);
        StdVideoEncodeH265PictureInfo.validate(pStdPictureInfo);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoEncodeH265PictureInfoEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkVideoEncodeH265PictureInfoEXT, Buffer> implements NativeResource {
        private static final VkVideoEncodeH265PictureInfoEXT ELEMENT_FACTORY = VkVideoEncodeH265PictureInfoEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkVideoEncodeH265PictureInfoEXT.SIZEOF);
        }

        public Buffer(long address, int cap) {
            super(address, null, -1, 0, cap, cap);
        }

        Buffer(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            super(address, container, mark, pos, lim, cap);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.system.CustomBuffer
        public Buffer self() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.system.StructBuffer
        public VkVideoEncodeH265PictureInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkVideoEncodeH265PictureInfoEXT.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkVideoEncodeH265PictureInfoEXT.npNext(address());
        }

        @NativeType("uint32_t")
        public int naluSliceSegmentEntryCount() {
            return VkVideoEncodeH265PictureInfoEXT.nnaluSliceSegmentEntryCount(address());
        }

        @NativeType("VkVideoEncodeH265NaluSliceSegmentInfoEXT const *")
        public VkVideoEncodeH265NaluSliceSegmentInfoEXT.Buffer pNaluSliceSegmentEntries() {
            return VkVideoEncodeH265PictureInfoEXT.npNaluSliceSegmentEntries(address());
        }

        @NativeType("StdVideoEncodeH265PictureInfo const *")
        public StdVideoEncodeH265PictureInfo pStdPictureInfo() {
            return VkVideoEncodeH265PictureInfoEXT.npStdPictureInfo(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkVideoEncodeH265PictureInfoEXT.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000039003);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkVideoEncodeH265PictureInfoEXT.npNext(address(), value);
            return this;
        }

        public Buffer pNaluSliceSegmentEntries(@NativeType("VkVideoEncodeH265NaluSliceSegmentInfoEXT const *") VkVideoEncodeH265NaluSliceSegmentInfoEXT.Buffer value) {
            VkVideoEncodeH265PictureInfoEXT.npNaluSliceSegmentEntries(address(), value);
            return this;
        }

        public Buffer pStdPictureInfo(@NativeType("StdVideoEncodeH265PictureInfo const *") StdVideoEncodeH265PictureInfo value) {
            VkVideoEncodeH265PictureInfoEXT.npStdPictureInfo(address(), value);
            return this;
        }
    }
}
