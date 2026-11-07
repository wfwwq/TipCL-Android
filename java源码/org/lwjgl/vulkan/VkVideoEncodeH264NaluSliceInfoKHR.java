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
import org.lwjgl.vulkan.video.StdVideoEncodeH264SliceHeader;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoEncodeH264NaluSliceInfoKHR.class */
public class VkVideoEncodeH264NaluSliceInfoKHR extends Struct<VkVideoEncodeH264NaluSliceInfoKHR> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int CONSTANTQP;
    public static final int PSTDSLICEHEADER;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        CONSTANTQP = layout.offsetof(2);
        PSTDSLICEHEADER = layout.offsetof(3);
    }

    protected VkVideoEncodeH264NaluSliceInfoKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkVideoEncodeH264NaluSliceInfoKHR create(long address, ByteBuffer container) {
        return new VkVideoEncodeH264NaluSliceInfoKHR(address, container);
    }

    public VkVideoEncodeH264NaluSliceInfoKHR(ByteBuffer container) {
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

    @NativeType("StdVideoEncodeH264SliceHeader const *")
    public StdVideoEncodeH264SliceHeader pStdSliceHeader() {
        return npStdSliceHeader(address());
    }

    public VkVideoEncodeH264NaluSliceInfoKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkVideoEncodeH264NaluSliceInfoKHR sType$Default() {
        return sType(1000038005);
    }

    public VkVideoEncodeH264NaluSliceInfoKHR pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkVideoEncodeH264NaluSliceInfoKHR constantQp(@NativeType("int32_t") int value) {
        nconstantQp(address(), value);
        return this;
    }

    public VkVideoEncodeH264NaluSliceInfoKHR pStdSliceHeader(@NativeType("StdVideoEncodeH264SliceHeader const *") StdVideoEncodeH264SliceHeader value) {
        npStdSliceHeader(address(), value);
        return this;
    }

    public VkVideoEncodeH264NaluSliceInfoKHR set(int sType, long pNext, int constantQp, StdVideoEncodeH264SliceHeader pStdSliceHeader) {
        sType(sType);
        pNext(pNext);
        constantQp(constantQp);
        pStdSliceHeader(pStdSliceHeader);
        return this;
    }

    public VkVideoEncodeH264NaluSliceInfoKHR set(VkVideoEncodeH264NaluSliceInfoKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkVideoEncodeH264NaluSliceInfoKHR malloc() {
        return new VkVideoEncodeH264NaluSliceInfoKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkVideoEncodeH264NaluSliceInfoKHR calloc() {
        return new VkVideoEncodeH264NaluSliceInfoKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkVideoEncodeH264NaluSliceInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkVideoEncodeH264NaluSliceInfoKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkVideoEncodeH264NaluSliceInfoKHR create(long address) {
        return new VkVideoEncodeH264NaluSliceInfoKHR(address, null);
    }

    public static VkVideoEncodeH264NaluSliceInfoKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkVideoEncodeH264NaluSliceInfoKHR(address, null);
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

    public static VkVideoEncodeH264NaluSliceInfoKHR malloc(MemoryStack stack) {
        return new VkVideoEncodeH264NaluSliceInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkVideoEncodeH264NaluSliceInfoKHR calloc(MemoryStack stack) {
        return new VkVideoEncodeH264NaluSliceInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static StdVideoEncodeH264SliceHeader npStdSliceHeader(long struct) {
        return StdVideoEncodeH264SliceHeader.create(MemoryUtil.memGetAddress(struct + PSTDSLICEHEADER));
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

    public static void npStdSliceHeader(long struct, StdVideoEncodeH264SliceHeader value) {
        MemoryUtil.memPutAddress(struct + PSTDSLICEHEADER, value.address());
    }

    public static void validate(long struct) {
        long pStdSliceHeader = MemoryUtil.memGetAddress(struct + PSTDSLICEHEADER);
        Checks.check(pStdSliceHeader);
        StdVideoEncodeH264SliceHeader.validate(pStdSliceHeader);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoEncodeH264NaluSliceInfoKHR$Buffer.class */
    public static class Buffer extends StructBuffer<VkVideoEncodeH264NaluSliceInfoKHR, Buffer> implements NativeResource {
        private static final VkVideoEncodeH264NaluSliceInfoKHR ELEMENT_FACTORY = VkVideoEncodeH264NaluSliceInfoKHR.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkVideoEncodeH264NaluSliceInfoKHR.SIZEOF);
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
        public VkVideoEncodeH264NaluSliceInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkVideoEncodeH264NaluSliceInfoKHR.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkVideoEncodeH264NaluSliceInfoKHR.npNext(address());
        }

        @NativeType("int32_t")
        public int constantQp() {
            return VkVideoEncodeH264NaluSliceInfoKHR.nconstantQp(address());
        }

        @NativeType("StdVideoEncodeH264SliceHeader const *")
        public StdVideoEncodeH264SliceHeader pStdSliceHeader() {
            return VkVideoEncodeH264NaluSliceInfoKHR.npStdSliceHeader(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkVideoEncodeH264NaluSliceInfoKHR.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000038005);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkVideoEncodeH264NaluSliceInfoKHR.npNext(address(), value);
            return this;
        }

        public Buffer constantQp(@NativeType("int32_t") int value) {
            VkVideoEncodeH264NaluSliceInfoKHR.nconstantQp(address(), value);
            return this;
        }

        public Buffer pStdSliceHeader(@NativeType("StdVideoEncodeH264SliceHeader const *") StdVideoEncodeH264SliceHeader value) {
            VkVideoEncodeH264NaluSliceInfoKHR.npStdSliceHeader(address(), value);
            return this;
        }
    }
}
