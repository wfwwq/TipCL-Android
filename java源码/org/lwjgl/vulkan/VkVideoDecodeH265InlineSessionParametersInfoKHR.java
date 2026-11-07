package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;
import org.lwjgl.vulkan.video.StdVideoH265PictureParameterSet;
import org.lwjgl.vulkan.video.StdVideoH265SequenceParameterSet;
import org.lwjgl.vulkan.video.StdVideoH265VideoParameterSet;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoDecodeH265InlineSessionParametersInfoKHR.class */
public class VkVideoDecodeH265InlineSessionParametersInfoKHR extends Struct<VkVideoDecodeH265InlineSessionParametersInfoKHR> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int PSTDVPS;
    public static final int PSTDSPS;
    public static final int PSTDPPS;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        PSTDVPS = layout.offsetof(2);
        PSTDSPS = layout.offsetof(3);
        PSTDPPS = layout.offsetof(4);
    }

    protected VkVideoDecodeH265InlineSessionParametersInfoKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkVideoDecodeH265InlineSessionParametersInfoKHR create(long address, ByteBuffer container) {
        return new VkVideoDecodeH265InlineSessionParametersInfoKHR(address, container);
    }

    public VkVideoDecodeH265InlineSessionParametersInfoKHR(ByteBuffer container) {
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

    @NativeType("StdVideoH265VideoParameterSet const *")
    public StdVideoH265VideoParameterSet pStdVPS() {
        return npStdVPS(address());
    }

    @NativeType("StdVideoH265SequenceParameterSet const *")
    public StdVideoH265SequenceParameterSet pStdSPS() {
        return npStdSPS(address());
    }

    @NativeType("StdVideoH265PictureParameterSet const *")
    public StdVideoH265PictureParameterSet pStdPPS() {
        return npStdPPS(address());
    }

    public VkVideoDecodeH265InlineSessionParametersInfoKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkVideoDecodeH265InlineSessionParametersInfoKHR sType$Default() {
        return sType(KHRVideoMaintenance2.VK_STRUCTURE_TYPE_VIDEO_DECODE_H265_INLINE_SESSION_PARAMETERS_INFO_KHR);
    }

    public VkVideoDecodeH265InlineSessionParametersInfoKHR pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkVideoDecodeH265InlineSessionParametersInfoKHR pStdVPS(@NativeType("StdVideoH265VideoParameterSet const *") StdVideoH265VideoParameterSet value) {
        npStdVPS(address(), value);
        return this;
    }

    public VkVideoDecodeH265InlineSessionParametersInfoKHR pStdSPS(@NativeType("StdVideoH265SequenceParameterSet const *") StdVideoH265SequenceParameterSet value) {
        npStdSPS(address(), value);
        return this;
    }

    public VkVideoDecodeH265InlineSessionParametersInfoKHR pStdPPS(@NativeType("StdVideoH265PictureParameterSet const *") StdVideoH265PictureParameterSet value) {
        npStdPPS(address(), value);
        return this;
    }

    public VkVideoDecodeH265InlineSessionParametersInfoKHR set(int sType, long pNext, StdVideoH265VideoParameterSet pStdVPS, StdVideoH265SequenceParameterSet pStdSPS, StdVideoH265PictureParameterSet pStdPPS) {
        sType(sType);
        pNext(pNext);
        pStdVPS(pStdVPS);
        pStdSPS(pStdSPS);
        pStdPPS(pStdPPS);
        return this;
    }

    public VkVideoDecodeH265InlineSessionParametersInfoKHR set(VkVideoDecodeH265InlineSessionParametersInfoKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkVideoDecodeH265InlineSessionParametersInfoKHR malloc() {
        return new VkVideoDecodeH265InlineSessionParametersInfoKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkVideoDecodeH265InlineSessionParametersInfoKHR calloc() {
        return new VkVideoDecodeH265InlineSessionParametersInfoKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkVideoDecodeH265InlineSessionParametersInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkVideoDecodeH265InlineSessionParametersInfoKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkVideoDecodeH265InlineSessionParametersInfoKHR create(long address) {
        return new VkVideoDecodeH265InlineSessionParametersInfoKHR(address, null);
    }

    public static VkVideoDecodeH265InlineSessionParametersInfoKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkVideoDecodeH265InlineSessionParametersInfoKHR(address, null);
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

    public static VkVideoDecodeH265InlineSessionParametersInfoKHR malloc(MemoryStack stack) {
        return new VkVideoDecodeH265InlineSessionParametersInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkVideoDecodeH265InlineSessionParametersInfoKHR calloc(MemoryStack stack) {
        return new VkVideoDecodeH265InlineSessionParametersInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static StdVideoH265VideoParameterSet npStdVPS(long struct) {
        return StdVideoH265VideoParameterSet.createSafe(MemoryUtil.memGetAddress(struct + PSTDVPS));
    }

    public static StdVideoH265SequenceParameterSet npStdSPS(long struct) {
        return StdVideoH265SequenceParameterSet.createSafe(MemoryUtil.memGetAddress(struct + PSTDSPS));
    }

    public static StdVideoH265PictureParameterSet npStdPPS(long struct) {
        return StdVideoH265PictureParameterSet.createSafe(MemoryUtil.memGetAddress(struct + PSTDPPS));
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void npStdVPS(long struct, StdVideoH265VideoParameterSet value) {
        MemoryUtil.memPutAddress(struct + PSTDVPS, MemoryUtil.memAddressSafe(value));
    }

    public static void npStdSPS(long struct, StdVideoH265SequenceParameterSet value) {
        MemoryUtil.memPutAddress(struct + PSTDSPS, MemoryUtil.memAddressSafe(value));
    }

    public static void npStdPPS(long struct, StdVideoH265PictureParameterSet value) {
        MemoryUtil.memPutAddress(struct + PSTDPPS, MemoryUtil.memAddressSafe(value));
    }

    public static void validate(long struct) {
        long pStdVPS = MemoryUtil.memGetAddress(struct + PSTDVPS);
        if (pStdVPS != 0) {
            StdVideoH265VideoParameterSet.validate(pStdVPS);
        }
        long pStdSPS = MemoryUtil.memGetAddress(struct + PSTDSPS);
        if (pStdSPS != 0) {
            StdVideoH265SequenceParameterSet.validate(pStdSPS);
        }
        long pStdPPS = MemoryUtil.memGetAddress(struct + PSTDPPS);
        if (pStdPPS != 0) {
            StdVideoH265PictureParameterSet.validate(pStdPPS);
        }
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoDecodeH265InlineSessionParametersInfoKHR$Buffer.class */
    public static class Buffer extends StructBuffer<VkVideoDecodeH265InlineSessionParametersInfoKHR, Buffer> implements NativeResource {
        private static final VkVideoDecodeH265InlineSessionParametersInfoKHR ELEMENT_FACTORY = VkVideoDecodeH265InlineSessionParametersInfoKHR.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkVideoDecodeH265InlineSessionParametersInfoKHR.SIZEOF);
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
        public VkVideoDecodeH265InlineSessionParametersInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkVideoDecodeH265InlineSessionParametersInfoKHR.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkVideoDecodeH265InlineSessionParametersInfoKHR.npNext(address());
        }

        @NativeType("StdVideoH265VideoParameterSet const *")
        public StdVideoH265VideoParameterSet pStdVPS() {
            return VkVideoDecodeH265InlineSessionParametersInfoKHR.npStdVPS(address());
        }

        @NativeType("StdVideoH265SequenceParameterSet const *")
        public StdVideoH265SequenceParameterSet pStdSPS() {
            return VkVideoDecodeH265InlineSessionParametersInfoKHR.npStdSPS(address());
        }

        @NativeType("StdVideoH265PictureParameterSet const *")
        public StdVideoH265PictureParameterSet pStdPPS() {
            return VkVideoDecodeH265InlineSessionParametersInfoKHR.npStdPPS(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkVideoDecodeH265InlineSessionParametersInfoKHR.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(KHRVideoMaintenance2.VK_STRUCTURE_TYPE_VIDEO_DECODE_H265_INLINE_SESSION_PARAMETERS_INFO_KHR);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkVideoDecodeH265InlineSessionParametersInfoKHR.npNext(address(), value);
            return this;
        }

        public Buffer pStdVPS(@NativeType("StdVideoH265VideoParameterSet const *") StdVideoH265VideoParameterSet value) {
            VkVideoDecodeH265InlineSessionParametersInfoKHR.npStdVPS(address(), value);
            return this;
        }

        public Buffer pStdSPS(@NativeType("StdVideoH265SequenceParameterSet const *") StdVideoH265SequenceParameterSet value) {
            VkVideoDecodeH265InlineSessionParametersInfoKHR.npStdSPS(address(), value);
            return this;
        }

        public Buffer pStdPPS(@NativeType("StdVideoH265PictureParameterSet const *") StdVideoH265PictureParameterSet value) {
            VkVideoDecodeH265InlineSessionParametersInfoKHR.npStdPPS(address(), value);
            return this;
        }
    }
}
