package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;
import org.lwjgl.vulkan.video.StdVideoAV1SequenceHeader;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoDecodeAV1InlineSessionParametersInfoKHR.class */
public class VkVideoDecodeAV1InlineSessionParametersInfoKHR extends Struct<VkVideoDecodeAV1InlineSessionParametersInfoKHR> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int PSTDSEQUENCEHEADER;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        PSTDSEQUENCEHEADER = layout.offsetof(2);
    }

    protected VkVideoDecodeAV1InlineSessionParametersInfoKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkVideoDecodeAV1InlineSessionParametersInfoKHR create(long address, ByteBuffer container) {
        return new VkVideoDecodeAV1InlineSessionParametersInfoKHR(address, container);
    }

    public VkVideoDecodeAV1InlineSessionParametersInfoKHR(ByteBuffer container) {
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

    @NativeType("StdVideoAV1SequenceHeader const *")
    public StdVideoAV1SequenceHeader pStdSequenceHeader() {
        return npStdSequenceHeader(address());
    }

    public VkVideoDecodeAV1InlineSessionParametersInfoKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkVideoDecodeAV1InlineSessionParametersInfoKHR sType$Default() {
        return sType(KHRVideoMaintenance2.VK_STRUCTURE_TYPE_VIDEO_DECODE_AV1_INLINE_SESSION_PARAMETERS_INFO_KHR);
    }

    public VkVideoDecodeAV1InlineSessionParametersInfoKHR pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkVideoDecodeAV1InlineSessionParametersInfoKHR pStdSequenceHeader(@NativeType("StdVideoAV1SequenceHeader const *") StdVideoAV1SequenceHeader value) {
        npStdSequenceHeader(address(), value);
        return this;
    }

    public VkVideoDecodeAV1InlineSessionParametersInfoKHR set(int sType, long pNext, StdVideoAV1SequenceHeader pStdSequenceHeader) {
        sType(sType);
        pNext(pNext);
        pStdSequenceHeader(pStdSequenceHeader);
        return this;
    }

    public VkVideoDecodeAV1InlineSessionParametersInfoKHR set(VkVideoDecodeAV1InlineSessionParametersInfoKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkVideoDecodeAV1InlineSessionParametersInfoKHR malloc() {
        return new VkVideoDecodeAV1InlineSessionParametersInfoKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkVideoDecodeAV1InlineSessionParametersInfoKHR calloc() {
        return new VkVideoDecodeAV1InlineSessionParametersInfoKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkVideoDecodeAV1InlineSessionParametersInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkVideoDecodeAV1InlineSessionParametersInfoKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkVideoDecodeAV1InlineSessionParametersInfoKHR create(long address) {
        return new VkVideoDecodeAV1InlineSessionParametersInfoKHR(address, null);
    }

    public static VkVideoDecodeAV1InlineSessionParametersInfoKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkVideoDecodeAV1InlineSessionParametersInfoKHR(address, null);
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

    public static VkVideoDecodeAV1InlineSessionParametersInfoKHR malloc(MemoryStack stack) {
        return new VkVideoDecodeAV1InlineSessionParametersInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkVideoDecodeAV1InlineSessionParametersInfoKHR calloc(MemoryStack stack) {
        return new VkVideoDecodeAV1InlineSessionParametersInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static StdVideoAV1SequenceHeader npStdSequenceHeader(long struct) {
        return StdVideoAV1SequenceHeader.createSafe(MemoryUtil.memGetAddress(struct + PSTDSEQUENCEHEADER));
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void npStdSequenceHeader(long struct, StdVideoAV1SequenceHeader value) {
        MemoryUtil.memPutAddress(struct + PSTDSEQUENCEHEADER, MemoryUtil.memAddressSafe(value));
    }

    public static void validate(long struct) {
        long pStdSequenceHeader = MemoryUtil.memGetAddress(struct + PSTDSEQUENCEHEADER);
        if (pStdSequenceHeader != 0) {
            StdVideoAV1SequenceHeader.validate(pStdSequenceHeader);
        }
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoDecodeAV1InlineSessionParametersInfoKHR$Buffer.class */
    public static class Buffer extends StructBuffer<VkVideoDecodeAV1InlineSessionParametersInfoKHR, Buffer> implements NativeResource {
        private static final VkVideoDecodeAV1InlineSessionParametersInfoKHR ELEMENT_FACTORY = VkVideoDecodeAV1InlineSessionParametersInfoKHR.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkVideoDecodeAV1InlineSessionParametersInfoKHR.SIZEOF);
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
        public VkVideoDecodeAV1InlineSessionParametersInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkVideoDecodeAV1InlineSessionParametersInfoKHR.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkVideoDecodeAV1InlineSessionParametersInfoKHR.npNext(address());
        }

        @NativeType("StdVideoAV1SequenceHeader const *")
        public StdVideoAV1SequenceHeader pStdSequenceHeader() {
            return VkVideoDecodeAV1InlineSessionParametersInfoKHR.npStdSequenceHeader(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkVideoDecodeAV1InlineSessionParametersInfoKHR.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(KHRVideoMaintenance2.VK_STRUCTURE_TYPE_VIDEO_DECODE_AV1_INLINE_SESSION_PARAMETERS_INFO_KHR);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkVideoDecodeAV1InlineSessionParametersInfoKHR.npNext(address(), value);
            return this;
        }

        public Buffer pStdSequenceHeader(@NativeType("StdVideoAV1SequenceHeader const *") StdVideoAV1SequenceHeader value) {
            VkVideoDecodeAV1InlineSessionParametersInfoKHR.npStdSequenceHeader(address(), value);
            return this;
        }
    }
}
