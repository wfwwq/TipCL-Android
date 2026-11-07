package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;
import org.lwjgl.vulkan.video.StdVideoH264PictureParameterSet;
import org.lwjgl.vulkan.video.StdVideoH264SequenceParameterSet;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoDecodeH264InlineSessionParametersInfoKHR.class */
public class VkVideoDecodeH264InlineSessionParametersInfoKHR extends Struct<VkVideoDecodeH264InlineSessionParametersInfoKHR> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int PSTDSPS;
    public static final int PSTDPPS;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        PSTDSPS = layout.offsetof(2);
        PSTDPPS = layout.offsetof(3);
    }

    protected VkVideoDecodeH264InlineSessionParametersInfoKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkVideoDecodeH264InlineSessionParametersInfoKHR create(long address, ByteBuffer container) {
        return new VkVideoDecodeH264InlineSessionParametersInfoKHR(address, container);
    }

    public VkVideoDecodeH264InlineSessionParametersInfoKHR(ByteBuffer container) {
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

    @NativeType("StdVideoH264SequenceParameterSet const *")
    public StdVideoH264SequenceParameterSet pStdSPS() {
        return npStdSPS(address());
    }

    @NativeType("StdVideoH264PictureParameterSet const *")
    public StdVideoH264PictureParameterSet pStdPPS() {
        return npStdPPS(address());
    }

    public VkVideoDecodeH264InlineSessionParametersInfoKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkVideoDecodeH264InlineSessionParametersInfoKHR sType$Default() {
        return sType(KHRVideoMaintenance2.VK_STRUCTURE_TYPE_VIDEO_DECODE_H264_INLINE_SESSION_PARAMETERS_INFO_KHR);
    }

    public VkVideoDecodeH264InlineSessionParametersInfoKHR pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkVideoDecodeH264InlineSessionParametersInfoKHR pStdSPS(@NativeType("StdVideoH264SequenceParameterSet const *") StdVideoH264SequenceParameterSet value) {
        npStdSPS(address(), value);
        return this;
    }

    public VkVideoDecodeH264InlineSessionParametersInfoKHR pStdPPS(@NativeType("StdVideoH264PictureParameterSet const *") StdVideoH264PictureParameterSet value) {
        npStdPPS(address(), value);
        return this;
    }

    public VkVideoDecodeH264InlineSessionParametersInfoKHR set(int sType, long pNext, StdVideoH264SequenceParameterSet pStdSPS, StdVideoH264PictureParameterSet pStdPPS) {
        sType(sType);
        pNext(pNext);
        pStdSPS(pStdSPS);
        pStdPPS(pStdPPS);
        return this;
    }

    public VkVideoDecodeH264InlineSessionParametersInfoKHR set(VkVideoDecodeH264InlineSessionParametersInfoKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkVideoDecodeH264InlineSessionParametersInfoKHR malloc() {
        return new VkVideoDecodeH264InlineSessionParametersInfoKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkVideoDecodeH264InlineSessionParametersInfoKHR calloc() {
        return new VkVideoDecodeH264InlineSessionParametersInfoKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkVideoDecodeH264InlineSessionParametersInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkVideoDecodeH264InlineSessionParametersInfoKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkVideoDecodeH264InlineSessionParametersInfoKHR create(long address) {
        return new VkVideoDecodeH264InlineSessionParametersInfoKHR(address, null);
    }

    public static VkVideoDecodeH264InlineSessionParametersInfoKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkVideoDecodeH264InlineSessionParametersInfoKHR(address, null);
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

    public static VkVideoDecodeH264InlineSessionParametersInfoKHR malloc(MemoryStack stack) {
        return new VkVideoDecodeH264InlineSessionParametersInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkVideoDecodeH264InlineSessionParametersInfoKHR calloc(MemoryStack stack) {
        return new VkVideoDecodeH264InlineSessionParametersInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static StdVideoH264SequenceParameterSet npStdSPS(long struct) {
        return StdVideoH264SequenceParameterSet.createSafe(MemoryUtil.memGetAddress(struct + PSTDSPS));
    }

    public static StdVideoH264PictureParameterSet npStdPPS(long struct) {
        return StdVideoH264PictureParameterSet.createSafe(MemoryUtil.memGetAddress(struct + PSTDPPS));
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void npStdSPS(long struct, StdVideoH264SequenceParameterSet value) {
        MemoryUtil.memPutAddress(struct + PSTDSPS, MemoryUtil.memAddressSafe(value));
    }

    public static void npStdPPS(long struct, StdVideoH264PictureParameterSet value) {
        MemoryUtil.memPutAddress(struct + PSTDPPS, MemoryUtil.memAddressSafe(value));
    }

    public static void validate(long struct) {
        long pStdSPS = MemoryUtil.memGetAddress(struct + PSTDSPS);
        if (pStdSPS != 0) {
            StdVideoH264SequenceParameterSet.validate(pStdSPS);
        }
        long pStdPPS = MemoryUtil.memGetAddress(struct + PSTDPPS);
        if (pStdPPS != 0) {
            StdVideoH264PictureParameterSet.validate(pStdPPS);
        }
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoDecodeH264InlineSessionParametersInfoKHR$Buffer.class */
    public static class Buffer extends StructBuffer<VkVideoDecodeH264InlineSessionParametersInfoKHR, Buffer> implements NativeResource {
        private static final VkVideoDecodeH264InlineSessionParametersInfoKHR ELEMENT_FACTORY = VkVideoDecodeH264InlineSessionParametersInfoKHR.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkVideoDecodeH264InlineSessionParametersInfoKHR.SIZEOF);
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
        public VkVideoDecodeH264InlineSessionParametersInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkVideoDecodeH264InlineSessionParametersInfoKHR.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkVideoDecodeH264InlineSessionParametersInfoKHR.npNext(address());
        }

        @NativeType("StdVideoH264SequenceParameterSet const *")
        public StdVideoH264SequenceParameterSet pStdSPS() {
            return VkVideoDecodeH264InlineSessionParametersInfoKHR.npStdSPS(address());
        }

        @NativeType("StdVideoH264PictureParameterSet const *")
        public StdVideoH264PictureParameterSet pStdPPS() {
            return VkVideoDecodeH264InlineSessionParametersInfoKHR.npStdPPS(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkVideoDecodeH264InlineSessionParametersInfoKHR.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(KHRVideoMaintenance2.VK_STRUCTURE_TYPE_VIDEO_DECODE_H264_INLINE_SESSION_PARAMETERS_INFO_KHR);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkVideoDecodeH264InlineSessionParametersInfoKHR.npNext(address(), value);
            return this;
        }

        public Buffer pStdSPS(@NativeType("StdVideoH264SequenceParameterSet const *") StdVideoH264SequenceParameterSet value) {
            VkVideoDecodeH264InlineSessionParametersInfoKHR.npStdSPS(address(), value);
            return this;
        }

        public Buffer pStdPPS(@NativeType("StdVideoH264PictureParameterSet const *") StdVideoH264PictureParameterSet value) {
            VkVideoDecodeH264InlineSessionParametersInfoKHR.npStdPPS(address(), value);
            return this;
        }
    }
}
