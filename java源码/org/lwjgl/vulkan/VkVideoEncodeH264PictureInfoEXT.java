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
import org.lwjgl.vulkan.VkVideoEncodeH264NaluSliceInfoEXT;
import org.lwjgl.vulkan.video.StdVideoEncodeH264PictureInfo;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoEncodeH264PictureInfoEXT.class */
public class VkVideoEncodeH264PictureInfoEXT extends Struct<VkVideoEncodeH264PictureInfoEXT> implements NativeResource {
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

    protected VkVideoEncodeH264PictureInfoEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkVideoEncodeH264PictureInfoEXT create(long address, @Nullable ByteBuffer container) {
        return new VkVideoEncodeH264PictureInfoEXT(address, container);
    }

    public VkVideoEncodeH264PictureInfoEXT(ByteBuffer container) {
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

    @NativeType("VkVideoEncodeH264NaluSliceInfoEXT const *")
    public VkVideoEncodeH264NaluSliceInfoEXT.Buffer pNaluSliceEntries() {
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

    public VkVideoEncodeH264PictureInfoEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkVideoEncodeH264PictureInfoEXT sType$Default() {
        return sType(1000038003);
    }

    public VkVideoEncodeH264PictureInfoEXT pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkVideoEncodeH264PictureInfoEXT pNaluSliceEntries(@NativeType("VkVideoEncodeH264NaluSliceInfoEXT const *") VkVideoEncodeH264NaluSliceInfoEXT.Buffer value) {
        npNaluSliceEntries(address(), value);
        return this;
    }

    public VkVideoEncodeH264PictureInfoEXT pStdPictureInfo(@NativeType("StdVideoEncodeH264PictureInfo const *") StdVideoEncodeH264PictureInfo value) {
        npStdPictureInfo(address(), value);
        return this;
    }

    public VkVideoEncodeH264PictureInfoEXT generatePrefixNalu(@NativeType("VkBool32") boolean value) {
        ngeneratePrefixNalu(address(), value ? 1 : 0);
        return this;
    }

    public VkVideoEncodeH264PictureInfoEXT set(int sType, long pNext, VkVideoEncodeH264NaluSliceInfoEXT.Buffer pNaluSliceEntries, StdVideoEncodeH264PictureInfo pStdPictureInfo, boolean generatePrefixNalu) {
        sType(sType);
        pNext(pNext);
        pNaluSliceEntries(pNaluSliceEntries);
        pStdPictureInfo(pStdPictureInfo);
        generatePrefixNalu(generatePrefixNalu);
        return this;
    }

    public VkVideoEncodeH264PictureInfoEXT set(VkVideoEncodeH264PictureInfoEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkVideoEncodeH264PictureInfoEXT malloc() {
        return new VkVideoEncodeH264PictureInfoEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkVideoEncodeH264PictureInfoEXT calloc() {
        return new VkVideoEncodeH264PictureInfoEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkVideoEncodeH264PictureInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkVideoEncodeH264PictureInfoEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkVideoEncodeH264PictureInfoEXT create(long address) {
        return new VkVideoEncodeH264PictureInfoEXT(address, null);
    }

    @Nullable
    public static VkVideoEncodeH264PictureInfoEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkVideoEncodeH264PictureInfoEXT(address, null);
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

    public static VkVideoEncodeH264PictureInfoEXT malloc(MemoryStack stack) {
        return new VkVideoEncodeH264PictureInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkVideoEncodeH264PictureInfoEXT calloc(MemoryStack stack) {
        return new VkVideoEncodeH264PictureInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nnaluSliceEntryCount(long struct) {
        return UNSAFE.getInt((Object) null, struct + NALUSLICEENTRYCOUNT);
    }

    public static VkVideoEncodeH264NaluSliceInfoEXT.Buffer npNaluSliceEntries(long struct) {
        return VkVideoEncodeH264NaluSliceInfoEXT.create(MemoryUtil.memGetAddress(struct + PNALUSLICEENTRIES), nnaluSliceEntryCount(struct));
    }

    public static StdVideoEncodeH264PictureInfo npStdPictureInfo(long struct) {
        return StdVideoEncodeH264PictureInfo.create(MemoryUtil.memGetAddress(struct + PSTDPICTUREINFO));
    }

    public static int ngeneratePrefixNalu(long struct) {
        return UNSAFE.getInt((Object) null, struct + GENERATEPREFIXNALU);
    }

    public static void nsType(long struct, int value) {
        UNSAFE.putInt((Object) null, struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nnaluSliceEntryCount(long struct, int value) {
        UNSAFE.putInt((Object) null, struct + NALUSLICEENTRYCOUNT, value);
    }

    public static void npNaluSliceEntries(long struct, VkVideoEncodeH264NaluSliceInfoEXT.Buffer value) {
        MemoryUtil.memPutAddress(struct + PNALUSLICEENTRIES, value.address());
        nnaluSliceEntryCount(struct, value.remaining());
    }

    public static void npStdPictureInfo(long struct, StdVideoEncodeH264PictureInfo value) {
        MemoryUtil.memPutAddress(struct + PSTDPICTUREINFO, value.address());
    }

    public static void ngeneratePrefixNalu(long struct, int value) {
        UNSAFE.putInt((Object) null, struct + GENERATEPREFIXNALU, value);
    }

    public static void validate(long struct) {
        int naluSliceEntryCount = nnaluSliceEntryCount(struct);
        long pNaluSliceEntries = MemoryUtil.memGetAddress(struct + PNALUSLICEENTRIES);
        Checks.check(pNaluSliceEntries);
        validate(pNaluSliceEntries, naluSliceEntryCount, VkVideoEncodeH264NaluSliceInfoEXT.SIZEOF, VkVideoEncodeH264NaluSliceInfoEXT::validate);
        long pStdPictureInfo = MemoryUtil.memGetAddress(struct + PSTDPICTUREINFO);
        Checks.check(pStdPictureInfo);
        StdVideoEncodeH264PictureInfo.validate(pStdPictureInfo);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoEncodeH264PictureInfoEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkVideoEncodeH264PictureInfoEXT, Buffer> implements NativeResource {
        private static final VkVideoEncodeH264PictureInfoEXT ELEMENT_FACTORY = VkVideoEncodeH264PictureInfoEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkVideoEncodeH264PictureInfoEXT.SIZEOF);
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
        public VkVideoEncodeH264PictureInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkVideoEncodeH264PictureInfoEXT.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkVideoEncodeH264PictureInfoEXT.npNext(address());
        }

        @NativeType("uint32_t")
        public int naluSliceEntryCount() {
            return VkVideoEncodeH264PictureInfoEXT.nnaluSliceEntryCount(address());
        }

        @NativeType("VkVideoEncodeH264NaluSliceInfoEXT const *")
        public VkVideoEncodeH264NaluSliceInfoEXT.Buffer pNaluSliceEntries() {
            return VkVideoEncodeH264PictureInfoEXT.npNaluSliceEntries(address());
        }

        @NativeType("StdVideoEncodeH264PictureInfo const *")
        public StdVideoEncodeH264PictureInfo pStdPictureInfo() {
            return VkVideoEncodeH264PictureInfoEXT.npStdPictureInfo(address());
        }

        @NativeType("VkBool32")
        public boolean generatePrefixNalu() {
            return VkVideoEncodeH264PictureInfoEXT.ngeneratePrefixNalu(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkVideoEncodeH264PictureInfoEXT.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000038003);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkVideoEncodeH264PictureInfoEXT.npNext(address(), value);
            return this;
        }

        public Buffer pNaluSliceEntries(@NativeType("VkVideoEncodeH264NaluSliceInfoEXT const *") VkVideoEncodeH264NaluSliceInfoEXT.Buffer value) {
            VkVideoEncodeH264PictureInfoEXT.npNaluSliceEntries(address(), value);
            return this;
        }

        public Buffer pStdPictureInfo(@NativeType("StdVideoEncodeH264PictureInfo const *") StdVideoEncodeH264PictureInfo value) {
            VkVideoEncodeH264PictureInfoEXT.npStdPictureInfo(address(), value);
            return this;
        }

        public Buffer generatePrefixNalu(@NativeType("VkBool32") boolean value) {
            VkVideoEncodeH264PictureInfoEXT.ngeneratePrefixNalu(address(), value ? 1 : 0);
            return this;
        }
    }
}
