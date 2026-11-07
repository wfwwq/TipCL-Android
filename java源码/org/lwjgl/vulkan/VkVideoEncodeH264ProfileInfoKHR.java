package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoEncodeH264ProfileInfoKHR.class */
public class VkVideoEncodeH264ProfileInfoKHR extends Struct<VkVideoEncodeH264ProfileInfoKHR> implements NativeResource {
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

    protected VkVideoEncodeH264ProfileInfoKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkVideoEncodeH264ProfileInfoKHR create(long address, ByteBuffer container) {
        return new VkVideoEncodeH264ProfileInfoKHR(address, container);
    }

    public VkVideoEncodeH264ProfileInfoKHR(ByteBuffer container) {
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

    @NativeType("StdVideoH264ProfileIdc")
    public int stdProfileIdc() {
        return nstdProfileIdc(address());
    }

    public VkVideoEncodeH264ProfileInfoKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkVideoEncodeH264ProfileInfoKHR sType$Default() {
        return sType(1000038007);
    }

    public VkVideoEncodeH264ProfileInfoKHR pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkVideoEncodeH264ProfileInfoKHR stdProfileIdc(@NativeType("StdVideoH264ProfileIdc") int value) {
        nstdProfileIdc(address(), value);
        return this;
    }

    public VkVideoEncodeH264ProfileInfoKHR set(int sType, long pNext, int stdProfileIdc) {
        sType(sType);
        pNext(pNext);
        stdProfileIdc(stdProfileIdc);
        return this;
    }

    public VkVideoEncodeH264ProfileInfoKHR set(VkVideoEncodeH264ProfileInfoKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkVideoEncodeH264ProfileInfoKHR malloc() {
        return new VkVideoEncodeH264ProfileInfoKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkVideoEncodeH264ProfileInfoKHR calloc() {
        return new VkVideoEncodeH264ProfileInfoKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkVideoEncodeH264ProfileInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkVideoEncodeH264ProfileInfoKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkVideoEncodeH264ProfileInfoKHR create(long address) {
        return new VkVideoEncodeH264ProfileInfoKHR(address, null);
    }

    public static VkVideoEncodeH264ProfileInfoKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkVideoEncodeH264ProfileInfoKHR(address, null);
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

    public static VkVideoEncodeH264ProfileInfoKHR malloc(MemoryStack stack) {
        return new VkVideoEncodeH264ProfileInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkVideoEncodeH264ProfileInfoKHR calloc(MemoryStack stack) {
        return new VkVideoEncodeH264ProfileInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoEncodeH264ProfileInfoKHR$Buffer.class */
    public static class Buffer extends StructBuffer<VkVideoEncodeH264ProfileInfoKHR, Buffer> implements NativeResource {
        private static final VkVideoEncodeH264ProfileInfoKHR ELEMENT_FACTORY = VkVideoEncodeH264ProfileInfoKHR.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkVideoEncodeH264ProfileInfoKHR.SIZEOF);
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
        public VkVideoEncodeH264ProfileInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkVideoEncodeH264ProfileInfoKHR.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkVideoEncodeH264ProfileInfoKHR.npNext(address());
        }

        @NativeType("StdVideoH264ProfileIdc")
        public int stdProfileIdc() {
            return VkVideoEncodeH264ProfileInfoKHR.nstdProfileIdc(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkVideoEncodeH264ProfileInfoKHR.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000038007);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkVideoEncodeH264ProfileInfoKHR.npNext(address(), value);
            return this;
        }

        public Buffer stdProfileIdc(@NativeType("StdVideoH264ProfileIdc") int value) {
            VkVideoEncodeH264ProfileInfoKHR.nstdProfileIdc(address(), value);
            return this;
        }
    }
}
