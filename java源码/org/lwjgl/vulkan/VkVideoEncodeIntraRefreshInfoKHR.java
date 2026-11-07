package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoEncodeIntraRefreshInfoKHR.class */
public class VkVideoEncodeIntraRefreshInfoKHR extends Struct<VkVideoEncodeIntraRefreshInfoKHR> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int INTRAREFRESHCYCLEDURATION;
    public static final int INTRAREFRESHINDEX;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        INTRAREFRESHCYCLEDURATION = layout.offsetof(2);
        INTRAREFRESHINDEX = layout.offsetof(3);
    }

    protected VkVideoEncodeIntraRefreshInfoKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkVideoEncodeIntraRefreshInfoKHR create(long address, ByteBuffer container) {
        return new VkVideoEncodeIntraRefreshInfoKHR(address, container);
    }

    public VkVideoEncodeIntraRefreshInfoKHR(ByteBuffer container) {
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
    public int intraRefreshCycleDuration() {
        return nintraRefreshCycleDuration(address());
    }

    @NativeType("uint32_t")
    public int intraRefreshIndex() {
        return nintraRefreshIndex(address());
    }

    public VkVideoEncodeIntraRefreshInfoKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkVideoEncodeIntraRefreshInfoKHR sType$Default() {
        return sType(KHRVideoEncodeIntraRefresh.VK_STRUCTURE_TYPE_VIDEO_ENCODE_INTRA_REFRESH_INFO_KHR);
    }

    public VkVideoEncodeIntraRefreshInfoKHR pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkVideoEncodeIntraRefreshInfoKHR intraRefreshCycleDuration(@NativeType("uint32_t") int value) {
        nintraRefreshCycleDuration(address(), value);
        return this;
    }

    public VkVideoEncodeIntraRefreshInfoKHR intraRefreshIndex(@NativeType("uint32_t") int value) {
        nintraRefreshIndex(address(), value);
        return this;
    }

    public VkVideoEncodeIntraRefreshInfoKHR set(int sType, long pNext, int intraRefreshCycleDuration, int intraRefreshIndex) {
        sType(sType);
        pNext(pNext);
        intraRefreshCycleDuration(intraRefreshCycleDuration);
        intraRefreshIndex(intraRefreshIndex);
        return this;
    }

    public VkVideoEncodeIntraRefreshInfoKHR set(VkVideoEncodeIntraRefreshInfoKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkVideoEncodeIntraRefreshInfoKHR malloc() {
        return new VkVideoEncodeIntraRefreshInfoKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkVideoEncodeIntraRefreshInfoKHR calloc() {
        return new VkVideoEncodeIntraRefreshInfoKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkVideoEncodeIntraRefreshInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkVideoEncodeIntraRefreshInfoKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkVideoEncodeIntraRefreshInfoKHR create(long address) {
        return new VkVideoEncodeIntraRefreshInfoKHR(address, null);
    }

    public static VkVideoEncodeIntraRefreshInfoKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkVideoEncodeIntraRefreshInfoKHR(address, null);
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

    public static VkVideoEncodeIntraRefreshInfoKHR malloc(MemoryStack stack) {
        return new VkVideoEncodeIntraRefreshInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkVideoEncodeIntraRefreshInfoKHR calloc(MemoryStack stack) {
        return new VkVideoEncodeIntraRefreshInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nintraRefreshCycleDuration(long struct) {
        return MemoryUtil.memGetInt(struct + INTRAREFRESHCYCLEDURATION);
    }

    public static int nintraRefreshIndex(long struct) {
        return MemoryUtil.memGetInt(struct + INTRAREFRESHINDEX);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nintraRefreshCycleDuration(long struct, int value) {
        MemoryUtil.memPutInt(struct + INTRAREFRESHCYCLEDURATION, value);
    }

    public static void nintraRefreshIndex(long struct, int value) {
        MemoryUtil.memPutInt(struct + INTRAREFRESHINDEX, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoEncodeIntraRefreshInfoKHR$Buffer.class */
    public static class Buffer extends StructBuffer<VkVideoEncodeIntraRefreshInfoKHR, Buffer> implements NativeResource {
        private static final VkVideoEncodeIntraRefreshInfoKHR ELEMENT_FACTORY = VkVideoEncodeIntraRefreshInfoKHR.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkVideoEncodeIntraRefreshInfoKHR.SIZEOF);
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
        public VkVideoEncodeIntraRefreshInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkVideoEncodeIntraRefreshInfoKHR.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkVideoEncodeIntraRefreshInfoKHR.npNext(address());
        }

        @NativeType("uint32_t")
        public int intraRefreshCycleDuration() {
            return VkVideoEncodeIntraRefreshInfoKHR.nintraRefreshCycleDuration(address());
        }

        @NativeType("uint32_t")
        public int intraRefreshIndex() {
            return VkVideoEncodeIntraRefreshInfoKHR.nintraRefreshIndex(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkVideoEncodeIntraRefreshInfoKHR.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(KHRVideoEncodeIntraRefresh.VK_STRUCTURE_TYPE_VIDEO_ENCODE_INTRA_REFRESH_INFO_KHR);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkVideoEncodeIntraRefreshInfoKHR.npNext(address(), value);
            return this;
        }

        public Buffer intraRefreshCycleDuration(@NativeType("uint32_t") int value) {
            VkVideoEncodeIntraRefreshInfoKHR.nintraRefreshCycleDuration(address(), value);
            return this;
        }

        public Buffer intraRefreshIndex(@NativeType("uint32_t") int value) {
            VkVideoEncodeIntraRefreshInfoKHR.nintraRefreshIndex(address(), value);
            return this;
        }
    }
}
