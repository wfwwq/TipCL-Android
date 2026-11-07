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
import org.lwjgl.vulkan.video.StdVideoAV1SequenceHeader;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoDecodeAV1SessionParametersCreateInfoKHR.class */
public class VkVideoDecodeAV1SessionParametersCreateInfoKHR extends Struct<VkVideoDecodeAV1SessionParametersCreateInfoKHR> implements NativeResource {
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

    protected VkVideoDecodeAV1SessionParametersCreateInfoKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkVideoDecodeAV1SessionParametersCreateInfoKHR create(long address, ByteBuffer container) {
        return new VkVideoDecodeAV1SessionParametersCreateInfoKHR(address, container);
    }

    public VkVideoDecodeAV1SessionParametersCreateInfoKHR(ByteBuffer container) {
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

    public VkVideoDecodeAV1SessionParametersCreateInfoKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkVideoDecodeAV1SessionParametersCreateInfoKHR sType$Default() {
        return sType(KHRVideoDecodeAV1.VK_STRUCTURE_TYPE_VIDEO_DECODE_AV1_SESSION_PARAMETERS_CREATE_INFO_KHR);
    }

    public VkVideoDecodeAV1SessionParametersCreateInfoKHR pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkVideoDecodeAV1SessionParametersCreateInfoKHR pStdSequenceHeader(@NativeType("StdVideoAV1SequenceHeader const *") StdVideoAV1SequenceHeader value) {
        npStdSequenceHeader(address(), value);
        return this;
    }

    public VkVideoDecodeAV1SessionParametersCreateInfoKHR set(int sType, long pNext, StdVideoAV1SequenceHeader pStdSequenceHeader) {
        sType(sType);
        pNext(pNext);
        pStdSequenceHeader(pStdSequenceHeader);
        return this;
    }

    public VkVideoDecodeAV1SessionParametersCreateInfoKHR set(VkVideoDecodeAV1SessionParametersCreateInfoKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkVideoDecodeAV1SessionParametersCreateInfoKHR malloc() {
        return new VkVideoDecodeAV1SessionParametersCreateInfoKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkVideoDecodeAV1SessionParametersCreateInfoKHR calloc() {
        return new VkVideoDecodeAV1SessionParametersCreateInfoKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkVideoDecodeAV1SessionParametersCreateInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkVideoDecodeAV1SessionParametersCreateInfoKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkVideoDecodeAV1SessionParametersCreateInfoKHR create(long address) {
        return new VkVideoDecodeAV1SessionParametersCreateInfoKHR(address, null);
    }

    public static VkVideoDecodeAV1SessionParametersCreateInfoKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkVideoDecodeAV1SessionParametersCreateInfoKHR(address, null);
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

    public static VkVideoDecodeAV1SessionParametersCreateInfoKHR malloc(MemoryStack stack) {
        return new VkVideoDecodeAV1SessionParametersCreateInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkVideoDecodeAV1SessionParametersCreateInfoKHR calloc(MemoryStack stack) {
        return new VkVideoDecodeAV1SessionParametersCreateInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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
        return StdVideoAV1SequenceHeader.create(MemoryUtil.memGetAddress(struct + PSTDSEQUENCEHEADER));
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void npStdSequenceHeader(long struct, StdVideoAV1SequenceHeader value) {
        MemoryUtil.memPutAddress(struct + PSTDSEQUENCEHEADER, value.address());
    }

    public static void validate(long struct) {
        long pStdSequenceHeader = MemoryUtil.memGetAddress(struct + PSTDSEQUENCEHEADER);
        Checks.check(pStdSequenceHeader);
        StdVideoAV1SequenceHeader.validate(pStdSequenceHeader);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoDecodeAV1SessionParametersCreateInfoKHR$Buffer.class */
    public static class Buffer extends StructBuffer<VkVideoDecodeAV1SessionParametersCreateInfoKHR, Buffer> implements NativeResource {
        private static final VkVideoDecodeAV1SessionParametersCreateInfoKHR ELEMENT_FACTORY = VkVideoDecodeAV1SessionParametersCreateInfoKHR.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkVideoDecodeAV1SessionParametersCreateInfoKHR.SIZEOF);
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
        public VkVideoDecodeAV1SessionParametersCreateInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkVideoDecodeAV1SessionParametersCreateInfoKHR.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkVideoDecodeAV1SessionParametersCreateInfoKHR.npNext(address());
        }

        @NativeType("StdVideoAV1SequenceHeader const *")
        public StdVideoAV1SequenceHeader pStdSequenceHeader() {
            return VkVideoDecodeAV1SessionParametersCreateInfoKHR.npStdSequenceHeader(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkVideoDecodeAV1SessionParametersCreateInfoKHR.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(KHRVideoDecodeAV1.VK_STRUCTURE_TYPE_VIDEO_DECODE_AV1_SESSION_PARAMETERS_CREATE_INFO_KHR);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkVideoDecodeAV1SessionParametersCreateInfoKHR.npNext(address(), value);
            return this;
        }

        public Buffer pStdSequenceHeader(@NativeType("StdVideoAV1SequenceHeader const *") StdVideoAV1SequenceHeader value) {
            VkVideoDecodeAV1SessionParametersCreateInfoKHR.npStdSequenceHeader(address(), value);
            return this;
        }
    }
}
