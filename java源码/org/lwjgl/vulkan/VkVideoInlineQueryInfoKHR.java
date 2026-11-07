package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoInlineQueryInfoKHR.class */
public class VkVideoInlineQueryInfoKHR extends Struct<VkVideoInlineQueryInfoKHR> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int QUERYPOOL;
    public static final int FIRSTQUERY;
    public static final int QUERYCOUNT;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(8), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        QUERYPOOL = layout.offsetof(2);
        FIRSTQUERY = layout.offsetof(3);
        QUERYCOUNT = layout.offsetof(4);
    }

    protected VkVideoInlineQueryInfoKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkVideoInlineQueryInfoKHR create(long address, ByteBuffer container) {
        return new VkVideoInlineQueryInfoKHR(address, container);
    }

    public VkVideoInlineQueryInfoKHR(ByteBuffer container) {
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

    @NativeType("VkQueryPool")
    public long queryPool() {
        return nqueryPool(address());
    }

    @NativeType("uint32_t")
    public int firstQuery() {
        return nfirstQuery(address());
    }

    @NativeType("uint32_t")
    public int queryCount() {
        return nqueryCount(address());
    }

    public VkVideoInlineQueryInfoKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkVideoInlineQueryInfoKHR sType$Default() {
        return sType(KHRVideoMaintenance1.VK_STRUCTURE_TYPE_VIDEO_INLINE_QUERY_INFO_KHR);
    }

    public VkVideoInlineQueryInfoKHR pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkVideoInlineQueryInfoKHR queryPool(@NativeType("VkQueryPool") long value) {
        nqueryPool(address(), value);
        return this;
    }

    public VkVideoInlineQueryInfoKHR firstQuery(@NativeType("uint32_t") int value) {
        nfirstQuery(address(), value);
        return this;
    }

    public VkVideoInlineQueryInfoKHR queryCount(@NativeType("uint32_t") int value) {
        nqueryCount(address(), value);
        return this;
    }

    public VkVideoInlineQueryInfoKHR set(int sType, long pNext, long queryPool, int firstQuery, int queryCount) {
        sType(sType);
        pNext(pNext);
        queryPool(queryPool);
        firstQuery(firstQuery);
        queryCount(queryCount);
        return this;
    }

    public VkVideoInlineQueryInfoKHR set(VkVideoInlineQueryInfoKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkVideoInlineQueryInfoKHR malloc() {
        return new VkVideoInlineQueryInfoKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkVideoInlineQueryInfoKHR calloc() {
        return new VkVideoInlineQueryInfoKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkVideoInlineQueryInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkVideoInlineQueryInfoKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkVideoInlineQueryInfoKHR create(long address) {
        return new VkVideoInlineQueryInfoKHR(address, null);
    }

    public static VkVideoInlineQueryInfoKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkVideoInlineQueryInfoKHR(address, null);
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

    public static VkVideoInlineQueryInfoKHR malloc(MemoryStack stack) {
        return new VkVideoInlineQueryInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkVideoInlineQueryInfoKHR calloc(MemoryStack stack) {
        return new VkVideoInlineQueryInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static long nqueryPool(long struct) {
        return MemoryUtil.memGetLong(struct + QUERYPOOL);
    }

    public static int nfirstQuery(long struct) {
        return MemoryUtil.memGetInt(struct + FIRSTQUERY);
    }

    public static int nqueryCount(long struct) {
        return MemoryUtil.memGetInt(struct + QUERYCOUNT);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nqueryPool(long struct, long value) {
        MemoryUtil.memPutLong(struct + QUERYPOOL, value);
    }

    public static void nfirstQuery(long struct, int value) {
        MemoryUtil.memPutInt(struct + FIRSTQUERY, value);
    }

    public static void nqueryCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + QUERYCOUNT, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoInlineQueryInfoKHR$Buffer.class */
    public static class Buffer extends StructBuffer<VkVideoInlineQueryInfoKHR, Buffer> implements NativeResource {
        private static final VkVideoInlineQueryInfoKHR ELEMENT_FACTORY = VkVideoInlineQueryInfoKHR.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkVideoInlineQueryInfoKHR.SIZEOF);
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
        public VkVideoInlineQueryInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkVideoInlineQueryInfoKHR.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkVideoInlineQueryInfoKHR.npNext(address());
        }

        @NativeType("VkQueryPool")
        public long queryPool() {
            return VkVideoInlineQueryInfoKHR.nqueryPool(address());
        }

        @NativeType("uint32_t")
        public int firstQuery() {
            return VkVideoInlineQueryInfoKHR.nfirstQuery(address());
        }

        @NativeType("uint32_t")
        public int queryCount() {
            return VkVideoInlineQueryInfoKHR.nqueryCount(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkVideoInlineQueryInfoKHR.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(KHRVideoMaintenance1.VK_STRUCTURE_TYPE_VIDEO_INLINE_QUERY_INFO_KHR);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkVideoInlineQueryInfoKHR.npNext(address(), value);
            return this;
        }

        public Buffer queryPool(@NativeType("VkQueryPool") long value) {
            VkVideoInlineQueryInfoKHR.nqueryPool(address(), value);
            return this;
        }

        public Buffer firstQuery(@NativeType("uint32_t") int value) {
            VkVideoInlineQueryInfoKHR.nfirstQuery(address(), value);
            return this;
        }

        public Buffer queryCount(@NativeType("uint32_t") int value) {
            VkVideoInlineQueryInfoKHR.nqueryCount(address(), value);
            return this;
        }
    }
}
