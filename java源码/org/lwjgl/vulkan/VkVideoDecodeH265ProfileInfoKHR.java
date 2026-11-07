package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoDecodeH265ProfileInfoKHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoDecodeH265ProfileInfoKHR.class */
public class VkVideoDecodeH265ProfileInfoKHR extends Struct<VkVideoDecodeH265ProfileInfoKHR> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int STDPROFILEIDC;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        STDPROFILEIDC = layout.offsetof(2);
    }

    protected VkVideoDecodeH265ProfileInfoKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkVideoDecodeH265ProfileInfoKHR create(long address, ByteBuffer container) {
        return new VkVideoDecodeH265ProfileInfoKHR(address, container);
    }

    public VkVideoDecodeH265ProfileInfoKHR(ByteBuffer container) {
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

    @NativeType("StdVideoH265ProfileIdc")
    public int stdProfileIdc() {
        return nstdProfileIdc(address());
    }

    public VkVideoDecodeH265ProfileInfoKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkVideoDecodeH265ProfileInfoKHR sType$Default() {
        return sType(KHRVideoDecodeH265.VK_STRUCTURE_TYPE_VIDEO_DECODE_H265_PROFILE_INFO_KHR);
    }

    public VkVideoDecodeH265ProfileInfoKHR pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkVideoDecodeH265ProfileInfoKHR stdProfileIdc(@NativeType("StdVideoH265ProfileIdc") int value) {
        nstdProfileIdc(address(), value);
        return this;
    }

    public VkVideoDecodeH265ProfileInfoKHR set(int sType, long pNext, int stdProfileIdc) {
        sType(sType);
        pNext(pNext);
        stdProfileIdc(stdProfileIdc);
        return this;
    }

    public VkVideoDecodeH265ProfileInfoKHR set(VkVideoDecodeH265ProfileInfoKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkVideoDecodeH265ProfileInfoKHR malloc() {
        return new VkVideoDecodeH265ProfileInfoKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkVideoDecodeH265ProfileInfoKHR calloc() {
        return new VkVideoDecodeH265ProfileInfoKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkVideoDecodeH265ProfileInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkVideoDecodeH265ProfileInfoKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkVideoDecodeH265ProfileInfoKHR create(long address) {
        return new VkVideoDecodeH265ProfileInfoKHR(address, null);
    }

    public static VkVideoDecodeH265ProfileInfoKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkVideoDecodeH265ProfileInfoKHR(address, null);
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

    public static VkVideoDecodeH265ProfileInfoKHR malloc(MemoryStack stack) {
        return new VkVideoDecodeH265ProfileInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkVideoDecodeH265ProfileInfoKHR calloc(MemoryStack stack) {
        return new VkVideoDecodeH265ProfileInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nstdProfileIdc(long struct) {
        return MemoryUtil.memGetInt(struct + STDPROFILEIDC);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nstdProfileIdc(long struct, int value) {
        MemoryUtil.memPutInt(struct + STDPROFILEIDC, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoDecodeH265ProfileInfoKHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoDecodeH265ProfileInfoKHR$Buffer.class */
    public static class Buffer extends StructBuffer<VkVideoDecodeH265ProfileInfoKHR, Buffer> implements NativeResource {
        private static final VkVideoDecodeH265ProfileInfoKHR ELEMENT_FACTORY = VkVideoDecodeH265ProfileInfoKHR.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkVideoDecodeH265ProfileInfoKHR.SIZEOF);
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
        public VkVideoDecodeH265ProfileInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkVideoDecodeH265ProfileInfoKHR.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkVideoDecodeH265ProfileInfoKHR.npNext(address());
        }

        @NativeType("StdVideoH265ProfileIdc")
        public int stdProfileIdc() {
            return VkVideoDecodeH265ProfileInfoKHR.nstdProfileIdc(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkVideoDecodeH265ProfileInfoKHR.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(KHRVideoDecodeH265.VK_STRUCTURE_TYPE_VIDEO_DECODE_H265_PROFILE_INFO_KHR);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkVideoDecodeH265ProfileInfoKHR.npNext(address(), value);
            return this;
        }

        public Buffer stdProfileIdc(@NativeType("StdVideoH265ProfileIdc") int value) {
            VkVideoDecodeH265ProfileInfoKHR.nstdProfileIdc(address(), value);
            return this;
        }
    }
}
