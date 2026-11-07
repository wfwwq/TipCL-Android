package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import java.util.function.Consumer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.Checks;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;
import org.lwjgl.vulkan.VkImageSubresourceLayers;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkCopyMemoryToImageIndirectInfoKHR.class */
public class VkCopyMemoryToImageIndirectInfoKHR extends Struct<VkCopyMemoryToImageIndirectInfoKHR> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int SRCCOPYFLAGS;
    public static final int COPYCOUNT;
    public static final int COPYADDRESSRANGE;
    public static final int DSTIMAGE;
    public static final int DSTIMAGELAYOUT;
    public static final int PIMAGESUBRESOURCES;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4), __member(VkStridedDeviceAddressRangeKHR.SIZEOF, VkStridedDeviceAddressRangeKHR.ALIGNOF), __member(8), __member(4), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SRCCOPYFLAGS = layout.offsetof(2);
        COPYCOUNT = layout.offsetof(3);
        COPYADDRESSRANGE = layout.offsetof(4);
        DSTIMAGE = layout.offsetof(5);
        DSTIMAGELAYOUT = layout.offsetof(6);
        PIMAGESUBRESOURCES = layout.offsetof(7);
    }

    protected VkCopyMemoryToImageIndirectInfoKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkCopyMemoryToImageIndirectInfoKHR create(long address, ByteBuffer container) {
        return new VkCopyMemoryToImageIndirectInfoKHR(address, container);
    }

    public VkCopyMemoryToImageIndirectInfoKHR(ByteBuffer container) {
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

    @NativeType("VkAddressCopyFlagsKHR")
    public int srcCopyFlags() {
        return nsrcCopyFlags(address());
    }

    @NativeType("uint32_t")
    public int copyCount() {
        return ncopyCount(address());
    }

    public VkStridedDeviceAddressRangeKHR copyAddressRange() {
        return ncopyAddressRange(address());
    }

    @NativeType("VkImage")
    public long dstImage() {
        return ndstImage(address());
    }

    @NativeType("VkImageLayout")
    public int dstImageLayout() {
        return ndstImageLayout(address());
    }

    @NativeType("VkImageSubresourceLayers const *")
    public VkImageSubresourceLayers.Buffer pImageSubresources() {
        return npImageSubresources(address());
    }

    public VkCopyMemoryToImageIndirectInfoKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkCopyMemoryToImageIndirectInfoKHR sType$Default() {
        return sType(KHRCopyMemoryIndirect.VK_STRUCTURE_TYPE_COPY_MEMORY_TO_IMAGE_INDIRECT_INFO_KHR);
    }

    public VkCopyMemoryToImageIndirectInfoKHR pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkCopyMemoryToImageIndirectInfoKHR srcCopyFlags(@NativeType("VkAddressCopyFlagsKHR") int value) {
        nsrcCopyFlags(address(), value);
        return this;
    }

    public VkCopyMemoryToImageIndirectInfoKHR copyAddressRange(VkStridedDeviceAddressRangeKHR value) {
        ncopyAddressRange(address(), value);
        return this;
    }

    public VkCopyMemoryToImageIndirectInfoKHR copyAddressRange(Consumer<VkStridedDeviceAddressRangeKHR> consumer) {
        consumer.accept(copyAddressRange());
        return this;
    }

    public VkCopyMemoryToImageIndirectInfoKHR dstImage(@NativeType("VkImage") long value) {
        ndstImage(address(), value);
        return this;
    }

    public VkCopyMemoryToImageIndirectInfoKHR dstImageLayout(@NativeType("VkImageLayout") int value) {
        ndstImageLayout(address(), value);
        return this;
    }

    public VkCopyMemoryToImageIndirectInfoKHR pImageSubresources(@NativeType("VkImageSubresourceLayers const *") VkImageSubresourceLayers.Buffer value) {
        npImageSubresources(address(), value);
        return this;
    }

    public VkCopyMemoryToImageIndirectInfoKHR set(int sType, long pNext, int srcCopyFlags, VkStridedDeviceAddressRangeKHR copyAddressRange, long dstImage, int dstImageLayout, VkImageSubresourceLayers.Buffer pImageSubresources) {
        sType(sType);
        pNext(pNext);
        srcCopyFlags(srcCopyFlags);
        copyAddressRange(copyAddressRange);
        dstImage(dstImage);
        dstImageLayout(dstImageLayout);
        pImageSubresources(pImageSubresources);
        return this;
    }

    public VkCopyMemoryToImageIndirectInfoKHR set(VkCopyMemoryToImageIndirectInfoKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkCopyMemoryToImageIndirectInfoKHR malloc() {
        return new VkCopyMemoryToImageIndirectInfoKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkCopyMemoryToImageIndirectInfoKHR calloc() {
        return new VkCopyMemoryToImageIndirectInfoKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkCopyMemoryToImageIndirectInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkCopyMemoryToImageIndirectInfoKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkCopyMemoryToImageIndirectInfoKHR create(long address) {
        return new VkCopyMemoryToImageIndirectInfoKHR(address, null);
    }

    public static VkCopyMemoryToImageIndirectInfoKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkCopyMemoryToImageIndirectInfoKHR(address, null);
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

    public static VkCopyMemoryToImageIndirectInfoKHR malloc(MemoryStack stack) {
        return new VkCopyMemoryToImageIndirectInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkCopyMemoryToImageIndirectInfoKHR calloc(MemoryStack stack) {
        return new VkCopyMemoryToImageIndirectInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nsrcCopyFlags(long struct) {
        return MemoryUtil.memGetInt(struct + SRCCOPYFLAGS);
    }

    public static int ncopyCount(long struct) {
        return MemoryUtil.memGetInt(struct + COPYCOUNT);
    }

    public static VkStridedDeviceAddressRangeKHR ncopyAddressRange(long struct) {
        return VkStridedDeviceAddressRangeKHR.create(struct + COPYADDRESSRANGE);
    }

    public static long ndstImage(long struct) {
        return MemoryUtil.memGetLong(struct + DSTIMAGE);
    }

    public static int ndstImageLayout(long struct) {
        return MemoryUtil.memGetInt(struct + DSTIMAGELAYOUT);
    }

    public static VkImageSubresourceLayers.Buffer npImageSubresources(long struct) {
        return VkImageSubresourceLayers.create(MemoryUtil.memGetAddress(struct + PIMAGESUBRESOURCES), ncopyCount(struct));
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nsrcCopyFlags(long struct, int value) {
        MemoryUtil.memPutInt(struct + SRCCOPYFLAGS, value);
    }

    public static void ncopyCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + COPYCOUNT, value);
    }

    public static void ncopyAddressRange(long struct, VkStridedDeviceAddressRangeKHR value) {
        MemoryUtil.memCopy(value.address(), struct + COPYADDRESSRANGE, VkStridedDeviceAddressRangeKHR.SIZEOF);
    }

    public static void ndstImage(long struct, long value) {
        MemoryUtil.memPutLong(struct + DSTIMAGE, value);
    }

    public static void ndstImageLayout(long struct, int value) {
        MemoryUtil.memPutInt(struct + DSTIMAGELAYOUT, value);
    }

    public static void npImageSubresources(long struct, VkImageSubresourceLayers.Buffer value) {
        MemoryUtil.memPutAddress(struct + PIMAGESUBRESOURCES, value.address());
        ncopyCount(struct, value.remaining());
    }

    public static void validate(long struct) {
        Checks.check(MemoryUtil.memGetAddress(struct + PIMAGESUBRESOURCES));
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkCopyMemoryToImageIndirectInfoKHR$Buffer.class */
    public static class Buffer extends StructBuffer<VkCopyMemoryToImageIndirectInfoKHR, Buffer> implements NativeResource {
        private static final VkCopyMemoryToImageIndirectInfoKHR ELEMENT_FACTORY = VkCopyMemoryToImageIndirectInfoKHR.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkCopyMemoryToImageIndirectInfoKHR.SIZEOF);
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
        public VkCopyMemoryToImageIndirectInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkCopyMemoryToImageIndirectInfoKHR.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkCopyMemoryToImageIndirectInfoKHR.npNext(address());
        }

        @NativeType("VkAddressCopyFlagsKHR")
        public int srcCopyFlags() {
            return VkCopyMemoryToImageIndirectInfoKHR.nsrcCopyFlags(address());
        }

        @NativeType("uint32_t")
        public int copyCount() {
            return VkCopyMemoryToImageIndirectInfoKHR.ncopyCount(address());
        }

        public VkStridedDeviceAddressRangeKHR copyAddressRange() {
            return VkCopyMemoryToImageIndirectInfoKHR.ncopyAddressRange(address());
        }

        @NativeType("VkImage")
        public long dstImage() {
            return VkCopyMemoryToImageIndirectInfoKHR.ndstImage(address());
        }

        @NativeType("VkImageLayout")
        public int dstImageLayout() {
            return VkCopyMemoryToImageIndirectInfoKHR.ndstImageLayout(address());
        }

        @NativeType("VkImageSubresourceLayers const *")
        public VkImageSubresourceLayers.Buffer pImageSubresources() {
            return VkCopyMemoryToImageIndirectInfoKHR.npImageSubresources(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkCopyMemoryToImageIndirectInfoKHR.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(KHRCopyMemoryIndirect.VK_STRUCTURE_TYPE_COPY_MEMORY_TO_IMAGE_INDIRECT_INFO_KHR);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkCopyMemoryToImageIndirectInfoKHR.npNext(address(), value);
            return this;
        }

        public Buffer srcCopyFlags(@NativeType("VkAddressCopyFlagsKHR") int value) {
            VkCopyMemoryToImageIndirectInfoKHR.nsrcCopyFlags(address(), value);
            return this;
        }

        public Buffer copyAddressRange(VkStridedDeviceAddressRangeKHR value) {
            VkCopyMemoryToImageIndirectInfoKHR.ncopyAddressRange(address(), value);
            return this;
        }

        public Buffer copyAddressRange(Consumer<VkStridedDeviceAddressRangeKHR> consumer) {
            consumer.accept(copyAddressRange());
            return this;
        }

        public Buffer dstImage(@NativeType("VkImage") long value) {
            VkCopyMemoryToImageIndirectInfoKHR.ndstImage(address(), value);
            return this;
        }

        public Buffer dstImageLayout(@NativeType("VkImageLayout") int value) {
            VkCopyMemoryToImageIndirectInfoKHR.ndstImageLayout(address(), value);
            return this;
        }

        public Buffer pImageSubresources(@NativeType("VkImageSubresourceLayers const *") VkImageSubresourceLayers.Buffer value) {
            VkCopyMemoryToImageIndirectInfoKHR.npImageSubresources(address(), value);
            return this;
        }
    }
}
