package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoReferenceIntraRefreshInfoKHR.class */
public class VkVideoReferenceIntraRefreshInfoKHR extends Struct<VkVideoReferenceIntraRefreshInfoKHR> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int DIRTYINTRAREFRESHREGIONS;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        DIRTYINTRAREFRESHREGIONS = layout.offsetof(2);
    }

    protected VkVideoReferenceIntraRefreshInfoKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkVideoReferenceIntraRefreshInfoKHR create(long address, ByteBuffer container) {
        return new VkVideoReferenceIntraRefreshInfoKHR(address, container);
    }

    public VkVideoReferenceIntraRefreshInfoKHR(ByteBuffer container) {
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
    public int dirtyIntraRefreshRegions() {
        return ndirtyIntraRefreshRegions(address());
    }

    public VkVideoReferenceIntraRefreshInfoKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkVideoReferenceIntraRefreshInfoKHR sType$Default() {
        return sType(KHRVideoEncodeIntraRefresh.VK_STRUCTURE_TYPE_VIDEO_REFERENCE_INTRA_REFRESH_INFO_KHR);
    }

    public VkVideoReferenceIntraRefreshInfoKHR pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkVideoReferenceIntraRefreshInfoKHR dirtyIntraRefreshRegions(@NativeType("uint32_t") int value) {
        ndirtyIntraRefreshRegions(address(), value);
        return this;
    }

    public VkVideoReferenceIntraRefreshInfoKHR set(int sType, long pNext, int dirtyIntraRefreshRegions) {
        sType(sType);
        pNext(pNext);
        dirtyIntraRefreshRegions(dirtyIntraRefreshRegions);
        return this;
    }

    public VkVideoReferenceIntraRefreshInfoKHR set(VkVideoReferenceIntraRefreshInfoKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkVideoReferenceIntraRefreshInfoKHR malloc() {
        return new VkVideoReferenceIntraRefreshInfoKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkVideoReferenceIntraRefreshInfoKHR calloc() {
        return new VkVideoReferenceIntraRefreshInfoKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkVideoReferenceIntraRefreshInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkVideoReferenceIntraRefreshInfoKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkVideoReferenceIntraRefreshInfoKHR create(long address) {
        return new VkVideoReferenceIntraRefreshInfoKHR(address, null);
    }

    public static VkVideoReferenceIntraRefreshInfoKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkVideoReferenceIntraRefreshInfoKHR(address, null);
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

    public static VkVideoReferenceIntraRefreshInfoKHR malloc(MemoryStack stack) {
        return new VkVideoReferenceIntraRefreshInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkVideoReferenceIntraRefreshInfoKHR calloc(MemoryStack stack) {
        return new VkVideoReferenceIntraRefreshInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int ndirtyIntraRefreshRegions(long struct) {
        return MemoryUtil.memGetInt(struct + DIRTYINTRAREFRESHREGIONS);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void ndirtyIntraRefreshRegions(long struct, int value) {
        MemoryUtil.memPutInt(struct + DIRTYINTRAREFRESHREGIONS, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoReferenceIntraRefreshInfoKHR$Buffer.class */
    public static class Buffer extends StructBuffer<VkVideoReferenceIntraRefreshInfoKHR, Buffer> implements NativeResource {
        private static final VkVideoReferenceIntraRefreshInfoKHR ELEMENT_FACTORY = VkVideoReferenceIntraRefreshInfoKHR.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkVideoReferenceIntraRefreshInfoKHR.SIZEOF);
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
        public VkVideoReferenceIntraRefreshInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkVideoReferenceIntraRefreshInfoKHR.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkVideoReferenceIntraRefreshInfoKHR.npNext(address());
        }

        @NativeType("uint32_t")
        public int dirtyIntraRefreshRegions() {
            return VkVideoReferenceIntraRefreshInfoKHR.ndirtyIntraRefreshRegions(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkVideoReferenceIntraRefreshInfoKHR.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(KHRVideoEncodeIntraRefresh.VK_STRUCTURE_TYPE_VIDEO_REFERENCE_INTRA_REFRESH_INFO_KHR);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkVideoReferenceIntraRefreshInfoKHR.npNext(address(), value);
            return this;
        }

        public Buffer dirtyIntraRefreshRegions(@NativeType("uint32_t") int value) {
            VkVideoReferenceIntraRefreshInfoKHR.ndirtyIntraRefreshRegions(address(), value);
            return this;
        }
    }
}
