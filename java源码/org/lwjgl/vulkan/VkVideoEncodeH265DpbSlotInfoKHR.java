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
import org.lwjgl.vulkan.video.StdVideoEncodeH265ReferenceInfo;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoEncodeH265DpbSlotInfoKHR.class */
public class VkVideoEncodeH265DpbSlotInfoKHR extends Struct<VkVideoEncodeH265DpbSlotInfoKHR> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int PSTDREFERENCEINFO;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        PSTDREFERENCEINFO = layout.offsetof(2);
    }

    protected VkVideoEncodeH265DpbSlotInfoKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkVideoEncodeH265DpbSlotInfoKHR create(long address, ByteBuffer container) {
        return new VkVideoEncodeH265DpbSlotInfoKHR(address, container);
    }

    public VkVideoEncodeH265DpbSlotInfoKHR(ByteBuffer container) {
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

    @NativeType("StdVideoEncodeH265ReferenceInfo const *")
    public StdVideoEncodeH265ReferenceInfo pStdReferenceInfo() {
        return npStdReferenceInfo(address());
    }

    public VkVideoEncodeH265DpbSlotInfoKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkVideoEncodeH265DpbSlotInfoKHR sType$Default() {
        return sType(1000039004);
    }

    public VkVideoEncodeH265DpbSlotInfoKHR pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkVideoEncodeH265DpbSlotInfoKHR pStdReferenceInfo(@NativeType("StdVideoEncodeH265ReferenceInfo const *") StdVideoEncodeH265ReferenceInfo value) {
        npStdReferenceInfo(address(), value);
        return this;
    }

    public VkVideoEncodeH265DpbSlotInfoKHR set(int sType, long pNext, StdVideoEncodeH265ReferenceInfo pStdReferenceInfo) {
        sType(sType);
        pNext(pNext);
        pStdReferenceInfo(pStdReferenceInfo);
        return this;
    }

    public VkVideoEncodeH265DpbSlotInfoKHR set(VkVideoEncodeH265DpbSlotInfoKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkVideoEncodeH265DpbSlotInfoKHR malloc() {
        return new VkVideoEncodeH265DpbSlotInfoKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkVideoEncodeH265DpbSlotInfoKHR calloc() {
        return new VkVideoEncodeH265DpbSlotInfoKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkVideoEncodeH265DpbSlotInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkVideoEncodeH265DpbSlotInfoKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkVideoEncodeH265DpbSlotInfoKHR create(long address) {
        return new VkVideoEncodeH265DpbSlotInfoKHR(address, null);
    }

    public static VkVideoEncodeH265DpbSlotInfoKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkVideoEncodeH265DpbSlotInfoKHR(address, null);
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

    public static VkVideoEncodeH265DpbSlotInfoKHR malloc(MemoryStack stack) {
        return new VkVideoEncodeH265DpbSlotInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkVideoEncodeH265DpbSlotInfoKHR calloc(MemoryStack stack) {
        return new VkVideoEncodeH265DpbSlotInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static StdVideoEncodeH265ReferenceInfo npStdReferenceInfo(long struct) {
        return StdVideoEncodeH265ReferenceInfo.create(MemoryUtil.memGetAddress(struct + PSTDREFERENCEINFO));
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void npStdReferenceInfo(long struct, StdVideoEncodeH265ReferenceInfo value) {
        MemoryUtil.memPutAddress(struct + PSTDREFERENCEINFO, value.address());
    }

    public static void validate(long struct) {
        Checks.check(MemoryUtil.memGetAddress(struct + PSTDREFERENCEINFO));
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoEncodeH265DpbSlotInfoKHR$Buffer.class */
    public static class Buffer extends StructBuffer<VkVideoEncodeH265DpbSlotInfoKHR, Buffer> implements NativeResource {
        private static final VkVideoEncodeH265DpbSlotInfoKHR ELEMENT_FACTORY = VkVideoEncodeH265DpbSlotInfoKHR.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkVideoEncodeH265DpbSlotInfoKHR.SIZEOF);
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
        public VkVideoEncodeH265DpbSlotInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkVideoEncodeH265DpbSlotInfoKHR.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkVideoEncodeH265DpbSlotInfoKHR.npNext(address());
        }

        @NativeType("StdVideoEncodeH265ReferenceInfo const *")
        public StdVideoEncodeH265ReferenceInfo pStdReferenceInfo() {
            return VkVideoEncodeH265DpbSlotInfoKHR.npStdReferenceInfo(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkVideoEncodeH265DpbSlotInfoKHR.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000039004);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkVideoEncodeH265DpbSlotInfoKHR.npNext(address(), value);
            return this;
        }

        public Buffer pStdReferenceInfo(@NativeType("StdVideoEncodeH265ReferenceInfo const *") StdVideoEncodeH265ReferenceInfo value) {
            VkVideoEncodeH265DpbSlotInfoKHR.npStdReferenceInfo(address(), value);
            return this;
        }
    }
}
