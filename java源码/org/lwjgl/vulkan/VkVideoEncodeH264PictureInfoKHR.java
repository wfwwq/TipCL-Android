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
import org.lwjgl.vulkan.VkVideoEncodeH264NaluSliceInfoKHR;
import org.lwjgl.vulkan.video.StdVideoEncodeH264PictureInfo;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoEncodeH264PictureInfoKHR.class */
public class VkVideoEncodeH264PictureInfoKHR extends Struct<VkVideoEncodeH264PictureInfoKHR> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int NALUSLICEENTRYCOUNT;
    public static final int PNALUSLICEENTRIES;
    public static final int PSTDPICTUREINFO;
    public static final int GENERATEPREFIXNALU;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        NALUSLICEENTRYCOUNT = layout.offsetof(2);
        PNALUSLICEENTRIES = layout.offsetof(3);
        PSTDPICTUREINFO = layout.offsetof(4);
        GENERATEPREFIXNALU = layout.offsetof(5);
    }

    protected VkVideoEncodeH264PictureInfoKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkVideoEncodeH264PictureInfoKHR create(long address, ByteBuffer container) {
        return new VkVideoEncodeH264PictureInfoKHR(address, container);
    }

    public VkVideoEncodeH264PictureInfoKHR(ByteBuffer container) {
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
    public int naluSliceEntryCount() {
        return nnaluSliceEntryCount(address());
    }

    @NativeType("VkVideoEncodeH264NaluSliceInfoKHR const *")
    public VkVideoEncodeH264NaluSliceInfoKHR.Buffer pNaluSliceEntries() {
        return npNaluSliceEntries(address());
    }

    @NativeType("StdVideoEncodeH264PictureInfo const *")
    public StdVideoEncodeH264PictureInfo pStdPictureInfo() {
        return npStdPictureInfo(address());
    }

    @NativeType("VkBool32")
    public boolean generatePrefixNalu() {
        return ngeneratePrefixNalu(address()) != 0;
    }

    public VkVideoEncodeH264PictureInfoKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkVideoEncodeH264PictureInfoKHR sType$Default() {
        return sType(1000038003);
    }

    public VkVideoEncodeH264PictureInfoKHR pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkVideoEncodeH264PictureInfoKHR pNaluSliceEntries(@NativeType("VkVideoEncodeH264NaluSliceInfoKHR const *") VkVideoEncodeH264NaluSliceInfoKHR.Buffer value) {
        npNaluSliceEntries(address(), value);
        return this;
    }

    public VkVideoEncodeH264PictureInfoKHR pStdPictureInfo(@NativeType("StdVideoEncodeH264PictureInfo const *") StdVideoEncodeH264PictureInfo value) {
        npStdPictureInfo(address(), value);
        return this;
    }

    public VkVideoEncodeH264PictureInfoKHR generatePrefixNalu(@NativeType("VkBool32") boolean value) {
        ngeneratePrefixNalu(address(), value ? 1 : 0);
        return this;
    }

    public VkVideoEncodeH264PictureInfoKHR set(int sType, long pNext, VkVideoEncodeH264NaluSliceInfoKHR.Buffer pNaluSliceEntries, StdVideoEncodeH264PictureInfo pStdPictureInfo, boolean generatePrefixNalu) {
        sType(sType);
        pNext(pNext);
        pNaluSliceEntries(pNaluSliceEntries);
        pStdPictureInfo(pStdPictureInfo);
        generatePrefixNalu(generatePrefixNalu);
        return this;
    }

    public VkVideoEncodeH264PictureInfoKHR set(VkVideoEncodeH264PictureInfoKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkVideoEncodeH264PictureInfoKHR malloc() {
        return new VkVideoEncodeH264PictureInfoKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkVideoEncodeH264PictureInfoKHR calloc() {
        return new VkVideoEncodeH264PictureInfoKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkVideoEncodeH264PictureInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkVideoEncodeH264PictureInfoKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkVideoEncodeH264PictureInfoKHR create(long address) {
        return new VkVideoEncodeH264PictureInfoKHR(address, null);
    }

    public static VkVideoEncodeH264PictureInfoKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkVideoEncodeH264PictureInfoKHR(address, null);
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

    public static VkVideoEncodeH264PictureInfoKHR malloc(MemoryStack stack) {
        return new VkVideoEncodeH264PictureInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkVideoEncodeH264PictureInfoKHR calloc(MemoryStack stack) {
        return new VkVideoEncodeH264PictureInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nnaluSliceEntryCount(long struct) {
        return MemoryUtil.memGetInt(struct + NALUSLICEENTRYCOUNT);
    }

    public static VkVideoEncodeH264NaluSliceInfoKHR.Buffer npNaluSliceEntries(long struct) {
        return VkVideoEncodeH264NaluSliceInfoKHR.create(MemoryUtil.memGetAddress(struct + PNALUSLICEENTRIES), nnaluSliceEntryCount(struct));
    }

    public static StdVideoEncodeH264PictureInfo npStdPictureInfo(long struct) {
        return StdVideoEncodeH264PictureInfo.create(MemoryUtil.memGetAddress(struct + PSTDPICTUREINFO));
    }

    public static int ngeneratePrefixNalu(long struct) {
        return MemoryUtil.memGetInt(struct + GENERATEPREFIXNALU);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nnaluSliceEntryCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + NALUSLICEENTRYCOUNT, value);
    }

    public static void npNaluSliceEntries(long struct, VkVideoEncodeH264NaluSliceInfoKHR.Buffer value) {
        MemoryUtil.memPutAddress(struct + PNALUSLICEENTRIES, value.address());
        nnaluSliceEntryCount(struct, value.remaining());
    }

    public static void npStdPictureInfo(long struct, StdVideoEncodeH264PictureInfo value) {
        MemoryUtil.memPutAddress(struct + PSTDPICTUREINFO, value.address());
    }

    public static void ngeneratePrefixNalu(long struct, int value) {
        MemoryUtil.memPutInt(struct + GENERATEPREFIXNALU, value);
    }

    public static void validate(long struct) {
        int naluSliceEntryCount = nnaluSliceEntryCount(struct);
        long pNaluSliceEntries = MemoryUtil.memGetAddress(struct + PNALUSLICEENTRIES);
        Checks.check(pNaluSliceEntries);
        validate(pNaluSliceEntries, naluSliceEntryCount, VkVideoEncodeH264NaluSliceInfoKHR.SIZEOF, VkVideoEncodeH264NaluSliceInfoKHR::validate);
        long pStdPictureInfo = MemoryUtil.memGetAddress(struct + PSTDPICTUREINFO);
        Checks.check(pStdPictureInfo);
        StdVideoEncodeH264PictureInfo.validate(pStdPictureInfo);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoEncodeH264PictureInfoKHR$Buffer.class */
    public static class Buffer extends StructBuffer<VkVideoEncodeH264PictureInfoKHR, Buffer> implements NativeResource {
        private static final VkVideoEncodeH264PictureInfoKHR ELEMENT_FACTORY = VkVideoEncodeH264PictureInfoKHR.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkVideoEncodeH264PictureInfoKHR.SIZEOF);
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
        public VkVideoEncodeH264PictureInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkVideoEncodeH264PictureInfoKHR.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkVideoEncodeH264PictureInfoKHR.npNext(address());
        }

        @NativeType("uint32_t")
        public int naluSliceEntryCount() {
            return VkVideoEncodeH264PictureInfoKHR.nnaluSliceEntryCount(address());
        }

        @NativeType("VkVideoEncodeH264NaluSliceInfoKHR const *")
        public VkVideoEncodeH264NaluSliceInfoKHR.Buffer pNaluSliceEntries() {
            return VkVideoEncodeH264PictureInfoKHR.npNaluSliceEntries(address());
        }

        @NativeType("StdVideoEncodeH264PictureInfo const *")
        public StdVideoEncodeH264PictureInfo pStdPictureInfo() {
            return VkVideoEncodeH264PictureInfoKHR.npStdPictureInfo(address());
        }

        @NativeType("VkBool32")
        public boolean generatePrefixNalu() {
            return VkVideoEncodeH264PictureInfoKHR.ngeneratePrefixNalu(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkVideoEncodeH264PictureInfoKHR.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000038003);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkVideoEncodeH264PictureInfoKHR.npNext(address(), value);
            return this;
        }

        public Buffer pNaluSliceEntries(@NativeType("VkVideoEncodeH264NaluSliceInfoKHR const *") VkVideoEncodeH264NaluSliceInfoKHR.Buffer value) {
            VkVideoEncodeH264PictureInfoKHR.npNaluSliceEntries(address(), value);
            return this;
        }

        public Buffer pStdPictureInfo(@NativeType("StdVideoEncodeH264PictureInfo const *") StdVideoEncodeH264PictureInfo value) {
            VkVideoEncodeH264PictureInfoKHR.npStdPictureInfo(address(), value);
            return this;
        }

        public Buffer generatePrefixNalu(@NativeType("VkBool32") boolean value) {
            VkVideoEncodeH264PictureInfoKHR.ngeneratePrefixNalu(address(), value ? 1 : 0);
            return this;
        }
    }
}
